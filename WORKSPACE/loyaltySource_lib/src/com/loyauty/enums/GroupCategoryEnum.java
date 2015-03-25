package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

public enum GroupCategoryEnum implements LoyaltyEnum {
	
	
	APPAREL(1, "Apparel"),
	ELECTRONICS(2, "Electronics"),
	VIDEO_GAMES(3, "Gaming"),
	HOMEWORKS(4,"Homeworks"),
	KITCHEN(5,"Kitchen"),
	OUTDOORS(6,"Outdoors"),
	SPORT(7,"Sports"),
	GRIFT_CARDS(8, "Gift Cards"),
	CHILDREN(9, "Children")	
	;	
	
	@Getter
	private String localizationKey = "loyauty.enum.groupeGategory." + name().toLowerCase();
		
	@Getter
	private Integer value;
	
	@Getter
	private String code;
	
	
	private GroupCategoryEnum(Integer value, String code){
		this.value = value;
		this.code = code;
	}
	

}
