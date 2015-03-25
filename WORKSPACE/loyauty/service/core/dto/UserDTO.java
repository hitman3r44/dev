package com.loyauty.service.core.dto;

import java.util.Date;


import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Language;
import com.loyauty.model.Image;


@Data @ToString(callSuper=true)
public class UserDTO extends BasicDTO {
	
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
	private Integer age;
	private String address;
	private String postalCode;
	private String phone;
	private ImageDTO imageDTO;	
	
	private UserDTO(String login, String password){		
		setLogin(login);
		setPassword(password);
	}
	
	public static UserDTO valueOf(String login, String password) {		
		return new UserDTO(login, password);
	}

}
