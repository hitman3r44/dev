package com.loyauty.web.struts.action.user;

import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class VenderAgreement extends LoyautyAction {

	private static final long serialVersionUID = -5440668858814768772L;

	@Override
	public String execute() throws Exception {
		
		if (request.getSession().getAttribute(WebConstants.USER) != null) {
			return SUCCESS;
		} else return INPUT;
	}

}
