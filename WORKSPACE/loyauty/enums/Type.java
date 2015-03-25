package com.loyauty.enums;

import lombok.Getter;


import com.loyauty.model.LoyaltyEnum;

public enum Type implements LoyaltyEnum{
	BRAND(1), 
	PRODUCT(2), 
	USER(3);
	
	@Getter
	private String localizationKey = "loyauty.enum.image.type." + name().toLowerCase();
		
	@Getter
	private Integer value;

	private Type(Integer value){
		this.value = value;
	}
}
