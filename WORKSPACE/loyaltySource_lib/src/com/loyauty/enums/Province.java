package com.loyauty.enums;

import lombok.Getter;

import com.loyauty.model.LoyaltyEnum;

public enum Province implements LoyaltyEnum {
	ALBERTA(1, "AB", "Alberta", "10.89", "G"), 
	BRITISH_COLUMBIA(2, "BC", "British Columbia", "13.14", "G"), 
	MANITOBA(3, "MB", "Manitoba", "3.61", "G"),
	NEW_BRUNSWICK(4, "NB", "New Brunswick", "2.24", "ON"),
	NEWFOUNDLAND_AND_LABRADOR(5, "NL", "Newfoundland and Labrador", "1.54", "ON"),
	NOVA_SCOTIA(6, "NS", "Nova Scotia", "2.75", "NS"),
	NORTHWEST_TERRITORIES(7, "NT", "Northwest Territories", "0.12", "G"),
	NUVANUT(8, "NU", "Nunavut", "0.09", "G"),
	ONTARIO(9, "ON", "Ontario", "38.39", "ON"),
	PRINCE_EDWARD_ISLAND(10, "PE", "Prince Edward Island", "0.42", "PEI"),
	QUEBEC(11, "QC", "Quebec", "23.61", "S13"),
	SASKATCHEWAN(12, "SK", "Saskatchewan", "3.09", "G"),
	YUKON(13, "YT", "Yukon", "0.10", "G");
	
	@Getter
	private String localizationKey = "loyauty.enum.province." + name().toLowerCase();
	
	@Getter
	private Integer value;	
	@Getter
	private String code;
	@Getter
	private String provinceName;
	@Getter
	private String populationPercentage;
	@Getter
	private String taxe;
	
	private Province(Integer value, String code, String provinceName, String populationPercentage, String taxe){
		this.value = value;
		this.code = code;
		this.provinceName = provinceName;
		this.populationPercentage = populationPercentage;
	}
	
}
