package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.Province;
import com.loyauty.model.LoyaltyEnum;

public class ProvinceHandler extends LoyaltyEnumHandler<Province> {	
	
	public ProvinceHandler() {
		super(Province.class);
	}
	
	public LoyaltyEnum[] getEnums() {
		return Province.values();
	}

}
