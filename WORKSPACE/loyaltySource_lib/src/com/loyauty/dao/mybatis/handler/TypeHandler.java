package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.Type;
import com.loyauty.model.LoyaltyEnum;

/**
 * 
 * @author Manuel
 *
 */
public class TypeHandler extends LoyaltyEnumHandler<Type> {	
	
	public TypeHandler() {
		super(Type.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return Type.values();
	}

}
