package com.loyauty.service.core.dto;

import java.util.Date;


import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Language;
import com.loyauty.model.Image;


@Data @ToString(callSuper=true)
public class UserDTO extends BasicDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String 	login;
	private String 	password;	
	private Integer typeId;
	private String  email;
	private String  code;
	
	private Date lastLoginDate;
	private boolean active;	

	private Date creationDate;
	private Integer primaryLanguage; 
	private Integer secondaryLanguage; 
	
	private String realName;
	private String address;
	private String postalCode;
	private String phone;
	private ImageDTO imageDTO;
	private String multiplier;
	
	private Date updateDate;
	
	private Boolean template;
	
	private Long clientCategoryId;
	private String clientCategoryName;
	private Long clientCategoryUserId;
	private Long managerId;
	private String managerRealName;
	private String note;
	//Special Handling
	private String specialHandlingName;
	private Double specialHandlingFee;
	//shipping_insurance_multiplier
	private Double shippingInsuranceMultiplier;
	//Currency
	private Long	currencyId;
	private String	currencySymbol;
	private Double	currencyRate;
	private Date 	currencyCreationDate;
	
	
	private UserDTO(String login, String password){		
		setLogin(login);
		setPassword(password);
	}
	
	private UserDTO(long id, String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier) {
		this(login, password);
		super.setId(id);
		setCode(code);
		setTypeId(typeId);
		setEmail(email);
		setActive(active);
		setRealName(realName);
		setAddress(address);
		setPostalCode(postalCode);
		setPhone(phone);
		setPrimaryLanguage(primaryLanguage);
		setSecondaryLanguage(secondaryLanguage);
		setMultiplier(multiplier);
		
		setSpecialHandlingName(specialHandlingName);
		setSpecialHandlingFee(specialHandlingFee);
		setShippingInsuranceMultiplier(shippingInsuranceMultiplier);
	}
	
	private UserDTO(String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier) {
		this(0L, login,code, typeId, password, email, active, realName, address, postalCode, 
				phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier);
		
	}
	

	private UserDTO(long id, String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier,
			Long currencyId, String currencySymbol, Double currencyRate, Date currencyCreationDate) {
		this(login, password);
		super.setId(id);
		setCode(code);
		setTypeId(typeId);
		setEmail(email);
		setActive(active);
		setRealName(realName);
		setAddress(address);
		setPostalCode(postalCode);
		setPhone(phone);
		setPrimaryLanguage(primaryLanguage);
		setSecondaryLanguage(secondaryLanguage);
		setMultiplier(multiplier);
		
		setSpecialHandlingName(specialHandlingName);
		setSpecialHandlingFee(specialHandlingFee);
		setShippingInsuranceMultiplier(shippingInsuranceMultiplier);
		setCurrencyId(currencyId);
		setCurrencySymbol(currencySymbol);
		setCurrencyRate(currencyRate);
		setCurrencyCreationDate(currencyCreationDate);
	}
	
	private UserDTO(String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier,
			Long currencyId, String currencySymbol, Double currencyRate, Date currencyCreationDate) {
		this(0L, login,code, typeId, password, email, active, realName, address, postalCode, 
				phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier,
				currencyId, currencySymbol, currencyRate, currencyCreationDate);
		
	}
	
	public static UserDTO valueOf(String login, String password) {		
		return new UserDTO(login, password);
	}
	
	
	public static UserDTO valueOf(String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier) {
		return new UserDTO(login, code, typeId, password, email, active, realName, address, postalCode, 
				phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier);
	}
	
	public static UserDTO valueOf(String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier,
			Long currencyId, String currencySymbol, Double currencyRate, Date currencyCreationDate) {
		return new UserDTO(login, code, typeId, password, email, active, realName, address, postalCode, 
				phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier,
				currencyId, currencySymbol, currencyRate, currencyCreationDate);
	}
	
	public static UserDTO valueOf(long id, String login, String code, Integer typeId, String password, String email, 
			boolean active, String realName, String address, String postalCode, 
			String phone, Integer primaryLanguage, Integer secondaryLanguage, String multiplier,
			String specialHandlingName, Double specialHandlingFee, Double shippingInsuranceMultiplier,
			Long currencyId, String currencySymbol, Double currencyRate, Date currencyCreationDate) {		
		return new UserDTO(id, login, code, typeId, password, email, active, realName, address, postalCode, 
				phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier,
				currencyId, currencySymbol, currencyRate, currencyCreationDate);
	}	

}
