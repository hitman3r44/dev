package com.loyauty.web.struts.action.user;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;

import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyActionWeb;
import com.loyauty.web.struts.action.interfaces.CUDAction;

public class UserCUD extends LoyautyActionWeb implements CUDAction {
	
	private static final long serialVersionUID = 7640068153357889448L;

	private UserService userService;
	private UserSessionDTO userSession;
	/*
	 * Form field
	 */
	@Getter @Setter
	private String username;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private String password;
	@Getter @Setter
	private String confirmPassword;
	@Getter @Setter
	private long country;
	@Getter @Setter
	private int primaryLang;
	
	public UserCUD() throws ServiceLocatorException {
		userService = getServiceLocator().getUserService();
	}	
	
	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String create() throws ServiceException {
		try {
			userSession = userService.createAccount(username, password, email, country, primaryLang);
			if( userSession != null){
				request.getSession().setAttribute(WebConstants.USER, userSession);
			}
		} catch (ServiceException e) {
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}		
		return getSuccessResult();
	}

	

			
	
}
