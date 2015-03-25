package com.loyauty.web.struts.action.product;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;




public class OurProducts extends LoyautyAction {
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter
	private String productBreadcrumb;
	
	public OurProducts() throws ServiceLocatorException {
		super();	
	}
	
	@Override
	public String execute() throws Exception {
		try {
			request.getSession(true).setAttribute("queryID", -1);
			
			if (request.getSession().getAttribute(WebConstants.USER) != null) {
				productBreadcrumb = "Our Products";
			} else {				
				productBreadcrumb = "Products";
			}
			HttpSession session = request.getSession(true);
			session.setAttribute("productBreadcrumb", productBreadcrumb);
			
		} catch (Exception e) {
			log.debug("Exception when accessing Our Products Site: " + e);
		}		
		return SUCCESS;
	}

}