package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

// Enums
public enum ProductStatus implements LoyaltyEnum {
	AVAILABLE(1),
	UNAVAILABLE(2),
	DISCONTINUED(3),
	DISABLED(4),
	CLEAR_OUT(5)
	;
	
	@Getter
	private String localizationKey = "loyalty.enum.product.status." + name().toLowerCase();
	
	@Getter
	private Integer value;
	
	private ProductStatus(Integer value) {
		this.value = value;
	}
	
	static public String getStatusByValue(Integer value){
		String result="";
		switch (value) {
		case 1:result="Available";
			break;
		case 2:result="Unavailable";
			break;
		case 3:result="Discontinued";
			break;
		case 4:result="Disabled";
			break;
		case 5:result="Clear_out";
		break;
		}
		
		return result;
	}

}