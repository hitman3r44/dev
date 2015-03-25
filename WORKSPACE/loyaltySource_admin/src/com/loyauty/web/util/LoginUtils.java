package com.loyauty.web.util;

import javax.servlet.http.HttpServletRequest;

//import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;

/**
 * Logic that handle logging in to the system goes here.
 * @author Muthanna
 *
 */
public final class LoginUtils {
	
	// Utility class, no instantiation
	private LoginUtils(){};
	
	public static boolean isLogged(HttpServletRequest request){
		return request.getSession().getAttribute(WebConstants.USER) != null;
	}
	
/*	public static UserSessionDTO getUser(HttpServletRequest request){
		return (UserSessionDTO) request.getSession().getAttribute(WebConstants.USER);
	}*/
	
	public static String getUserLanguage(HttpServletRequest request){
		String userLanguage = null;
		if(request.getSession().getAttribute(WebConstants.USER) != null){
			// TODO return user language from profile
			return null;
		}
		
		return userLanguage;
	}
}
