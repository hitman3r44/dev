package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

public enum PriceType implements LoyaltyEnum{
	
	BRAND_PRICE_SET(1),
	CATEGORY_PRICE_SET(2),
	MANUEL_PRICE_SET(3)
	;
	
	@Getter
	private String localizationKey = "loyalty.enum.game.pricetype." + name().toLowerCase();
	
	@Getter
	private Integer value;
	
	private PriceType(Integer value){
		this.value = value;
	}
}
