package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

/**
 * 
 *
 */
public enum Language implements LoyaltyEnum{
	
	ENGLISH(1, "en"),
	FRENCH(2, "fr")
	;
	
	@Getter
	private String localizationKey = "loyauty.enum.language." + name().toLowerCase();
		
	@Getter
	private Integer value;
	
	@Getter
	private String code;
	
	
	private Language(Integer value, String code){
		this.value = value;
		this.code = code;
	}
	
}
