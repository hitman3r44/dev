package com.loyauty.model;

import java.util.Date;

import com.loyauty.enums.Language;

import com.loyauty.model.AbstractEntity;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class User extends AbstractEntity{

	private String 	login;
	private String 	password;	
	private Integer typeId;
	private String  email;
	private String  code;
	
	private Date lastLoginDate;
	private boolean active;	

	private Date creationDate;
	private Language primaryLanguage; 
	private Language secondaryLanguage; 
	
	private String realName;
	private Integer age;
	private String address;
	private String postalCode;
	private String phone;
	private Long imageId;	
	
	public User(){
		super();
	}
	
	public User(String login, String password, String email){
		this(null, login, password, email);
	}
	
	public User(Long id, String login, String password, String email){
		super();
		setId(id);
		setLogin(login);
		setPassword(password);		
		setEmail(email);
		setActive(true);		
	}
	

}
