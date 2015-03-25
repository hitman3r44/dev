package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.Type;
import com.loyauty.model.LoyaltyEnum;

public class PriceTypeHandler  extends LoyaltyEnumHandler<PriceType> {	
	
	public PriceTypeHandler() {
		super(PriceType.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return PriceType.values();
	}

}
