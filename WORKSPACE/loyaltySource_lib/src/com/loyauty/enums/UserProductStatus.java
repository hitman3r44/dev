package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

// Enums
public enum UserProductStatus implements LoyaltyEnum{
	ACTIVE(1, "true"),
	INACTIVE(2, "false")
	;
	
	@Getter
	private String localizationKey = "loyauty.enum.user.product.status." + name().toLowerCase();
	
	@Getter
	private Integer value;
	
	@Getter
	private String code;
	
	private UserProductStatus(Integer value, String code){
		this.value = value;
		this.code = code;
	}

}