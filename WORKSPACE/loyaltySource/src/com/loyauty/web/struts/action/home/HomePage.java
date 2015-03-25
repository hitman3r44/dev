package com.loyauty.web.struts.action.home;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.struts.action.LoyautyAction;

public class HomePage extends LoyautyAction { 
	private static final long serialVersionUID = -3837247729072777127L;

	public HomePage() throws ServiceLocatorException {
		super();
	}
	
	@Override
	public String execute() throws Exception {
		try {
			request.getSession(true).setAttribute("queryID", -1);
		} catch (Exception e) {
			log.debug("Exception when accessing Our Products Site: " + e);
		}
		return SUCCESS;
	}

}
