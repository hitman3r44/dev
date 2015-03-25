package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.UserProductStatus;
import com.loyauty.model.LoyaltyEnum;

/**
 * 
 * @author Manuel
 *
 */
public class UserProductStatusHandler extends LoyaltyEnumHandler<UserProductStatus> {	
	
	public UserProductStatusHandler() {
		super(UserProductStatus.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return UserProductStatus.values();
	}

}
