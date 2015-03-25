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
import com.loyauty.model.User;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.service.usersprivileges.UsersPrivilegesService;
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
	private UsersPrivilegesService usersPrivilegesService;
	private UserSessionDTO userSession;
	/*
	 * Form field
	 */
	@Getter @Setter
	private String username;
	@Getter @Setter
	private String password;
	@Getter @Setter
	private Long redirect=0L;
	private User userAdmin;
	//private UserDTO superAdmin;
	public Login() throws ServiceLocatorException {
		userService = getServiceLocator().getUserService();
		usersPrivilegesService = getServiceLocator().getUserPrivilegesService();
	}	
	
	
	
	@Override
	public void validate() {
		// the authentication is done in a validate method cause if a error is raised from an execute method it won't be handle by Struts JSON validation. 
	/*	try {
			log.debug("validate user");
			userSession = userService.adminAuthenticate(username, password);
			log.debug("user : " + userSession.getLogin());
			
		} catch (InvalidUserException iue) {
			addActionError("bad login / password. Try again.");
		} catch (ServiceException e) {
			log.error("an error occured while user authentification",e);
		}*/
	}
	
	@Override
	public String execute() throws Exception {
		//boolean next = false;
		//log.debug("logged in");
		superAdmin=null;
		userSession = userService.authenticateAdmin(username, password);
		HttpSession session = request.getSession(true);
		redirect=-1L;
		if (userSession != null) {
			redirect=1L;
			session.setAttribute(WebConstants.USER, userSession);
			userAdmin=userService.getUserByLogin(userSession.getLogin());
			session.setAttribute("userAdmin", userAdmin);
			//recovery super Admin(type=1)
			superAdmin=userService.getSuperAdmin(username, password);
			session.setAttribute("superAdmin", superAdmin);
			// the maximum time to timeout the session is 5 hours
			session.setMaxInactiveInterval(5 * 60 * 60);
			// show login user in page Admin
			session.setAttribute("fullName", userAdmin.getRealName());
			// show full name user in logoutPop.jsp
			session.setAttribute("login", userAdmin.getLogin());
			// get action All
			UsersPrivilegesDTO userP=new UsersPrivilegesDTO();
			userP.setActionCode(1L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO userPrivileges=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("userPrivileges", userPrivileges);
			//get UserPrivileges of shipped_To_Invoiced Action
			userP.setActionCode(2L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivShippedToInvoiced=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivShippedToInvoiced", usersPrivShippedToInvoiced);
			//get UserPrivileges of change_shipped_status Action
			userP.setActionCode(3L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivChangeShippedStatus=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivChangeShippedStatus", usersPrivChangeShippedStatus);
			//get UserPrivileges of orders_mapping Action
			userP.setActionCode(4L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivOrdersMapping=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivOrdersMapping", usersPrivOrdersMapping);
			//get UserPrivileges of classification Action
			userP.setActionCode(5L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivProductClassification=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivProductClassificat", usersPrivProductClassification);
			//get UserPrivileges of Canada Post Verified Action
			userP.setActionCode(6L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivCanadaPostVerified=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivCanadaPostVerified", usersPrivCanadaPostVerified);
			//get UserPrivileges of Currency Action
			userP.setActionCode(7L);
			userP.setActive(true);
			userP.setUserId(userSession.getId());
			UsersPrivilegesDTO  usersPrivCurrency=usersPrivilegesService.getPrivilegesByUser(userP);
			session.setAttribute("usersPrivCurrency", usersPrivCurrency);
			
		}
		session.setAttribute("redirect", redirect);
	    return "none"; //getRedirectResult();//"none";
		
	}
	
}
