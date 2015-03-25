package com.loyauty.service.core.dto;

import com.loyauty.service.core.dto.BasicDTO;
import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)


public class AsiaMilesPOXLSDTO extends  BasicDTO {
	private static final long serialVersionUID = 3942828140163526184L;	
	private String packageCode;	
	private String description; 
	private String claimNumber;
	private String memberRefNo;
	private String quantity;		
	private String deliveryName;		
	private String deliveryPhoneCountry;	
	private String deliveryPhoneZone;	
	private String deliveryPhoneNumber;
	private String deliveryPhoneInstruction;	
	private String addressInstruction;
	private String companyName;	
	private String address1;	
	private String address2;		
	private String address3;	
	private String city;		
	private String postalCode;	
	private String stateName;	
	private String emailAddress;
		
}
