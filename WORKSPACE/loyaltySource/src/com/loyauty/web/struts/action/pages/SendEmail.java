package com.loyauty.web.struts.action.pages;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.struts.action.LoyautyAction;

public class SendEmail   extends LoyautyAction{

	private static final long serialVersionUID = -48043647577843583L;


	/*=========================================================================================
									Default constructor
	  =========================================================================================*/
	public SendEmail() throws ServiceLocatorException {
		super();	 
	}

	/*=========================================================================================
 									method execute
  	  =========================================================================================*/
	@Override  
	public String execute() throws Exception {	
	
		try{
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
		
	}
	
	
}
