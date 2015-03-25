package com.loyauty.enums;

import lombok.Getter;


import com.loyauty.model.LoyaltyEnum;

public enum UserType implements LoyaltyEnum{
	ADMIN(1, "ADMIN"), 
	USER(2, "USER");
	
	@Getter
	private String localizationKey = "loyauty.enum.image.userType." + name().toLowerCase();
		
	@Getter
	private Integer value;
	@Getter
	private String typeName;
	
	private UserType(Integer value, String typeName){
		this.value = value;
		this.typeName = typeName;
	}
}
