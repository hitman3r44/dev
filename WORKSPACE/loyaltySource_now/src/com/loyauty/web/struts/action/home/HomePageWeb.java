package com.loyauty.web.struts.action.home;

import lombok.*;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.web.struts.action.LoyautyActionWeb;


/**
 * The main landing page action on loyalty.
 * 
 * @author Muthanna
 *
 */

public class HomePageWeb extends LoyautyActionWeb { 
	private static final long serialVersionUID = 5931105394382401440L;
	
	@Getter @Setter
	private Integer ln;
	public HomePageWeb() throws ServiceLocatorException {
		super();

	}
	
	@Override
	public String execute() throws Exception {
		try {	
			System.out.println("ln:"+ln);
			request.getSession(true).setAttribute("queryID", -1);
		} catch (Exception e) {
			log.debug("Exception when accessing Our Products Site: " + e);
		}
		return SUCCESS;
	}

}
