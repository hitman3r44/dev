package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

// Enums
public enum Status implements LoyaltyEnum{
	ENABLED(1),
	DISABLED(2)
	;
	
	@Getter
	private String localizationKey = "loyalty.enum.game.status." + name().toLowerCase();
	
	@Getter
	private Integer value;
	
	private Status(Integer value){
		this.value = value;
	}

}