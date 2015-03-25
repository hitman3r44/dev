/**
 * 
 */
package com.loyauty.web.struts.action.user;



//import lombok.Getter;
import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.InvalidUserException;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

/**
 * @author Arnaud
 * This class is in charge of logging a User
 */
@Validations(requiredStrings = {
					@RequiredStringValidator(fieldName = "username", type = ValidatorType.FIELD, message = "Username is required"),
					@RequiredStringValidator(fieldName = "password", type = ValidatorType.FIELD, message = "Password is required")
		  		 }
)

public class Login extends LoyautyAction {
	
	private static final long serialVersionUID = 7640068153357889448L;

	private UserService userService;
	private UserSessionDTO userSession;
	/*
	 * Form field
	 */
	@Getter @Setter
	private String username;
	@Getter @Setter
	private String password;
	
	public Login() throws ServiceLocatorException {
		userService = getServiceLocator().getUserService();
	}	
	
	@Override
	public void validate() {
		// the authentication is done in a validate method cause if a error is raised from an execute method it won't be handle by Struts JSON validation.
		try {
			
			log.debug("validate user");
			userSession = userService.adminAuthenticate(username, password);
			log.debug("user : " + userSession.getLogin());
			
		} catch (InvalidUserException iue) {
			addActionError("bad login / password. Try again.");
		} catch (ServiceException e) {
			log.error("an error occured while user authentification",e);
		}
	}
	
	@Override
	public String execute() throws Exception {
		boolean next = false;
		HttpSession session = request.getSession(true);
		//put the user information in session
		log.debug("dans login");
		
		if (userSession != null) {
			session.setAttribute(WebConstants.USER, userSession);
			// the maximum time to timeout the session is 5 hours
			session.setMaxInactiveInterval(5 * 60 * 60);
		}

		
		return getSuccessResult();
		
	}
	
}
