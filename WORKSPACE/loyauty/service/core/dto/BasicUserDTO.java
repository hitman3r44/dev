package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Contains user's basic information 
 * 
 * @author Muthanna
 *
 */
@Data @ToString(callSuper=true)
public class BasicUserDTO extends BasicDTO{
		
	private String login;
	private String email;
	private String code;
	private int typeId;
	private int primaryLangId;
	private boolean active;	
	
	
	
}
 