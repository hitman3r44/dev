package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.Status;
import com.loyauty.model.LoyaltyEnum;

/**
 * 
 * @author Manuel
 *
 */
public class StatusHandler extends LoyaltyEnumHandler<Status> {	
	
	public StatusHandler() {
		super(Status.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return Status.values();
	}

}
