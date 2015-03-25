/**
 * 
 */
package com.loyauty.web.struts.action.user;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyActionWeb;


/**
 * @author Arnaud
 * This class is in charge of logging out a User
 */
public class Logout extends LoyautyActionWeb {
	
	private static final long serialVersionUID = 7640068153357889448L;

	public Logout() throws ServiceLocatorException {}	
	
	@Override
	public String execute() throws Exception {
		//remove the user information in session
		if (request.getSession().getAttribute(WebConstants.USER) != null) {
			request.getSession().removeAttribute(WebConstants.USER);
		}
		return getSuccessResult();
	}
	
}
