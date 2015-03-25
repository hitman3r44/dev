package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Contains user data we want to put in the session once
 * the user logs in to the system successfully.
 * 
 * @author Muthanna
 *
 */
@Data @ToString(callSuper=true)
public class UserSessionDTO extends BasicUserDTO{
		
	private int siteLangId;	// Site language Id
	private int numberOfResults; // How many search results per page he wants	
	public  UserSessionDTO(){};
	
	public static UserSessionDTO valueOf(long userId, String login, int typeId,	int userLangId, 
				  int siteLangId, int numberOfResults, String email, String code, boolean active){
		
		return new UserSessionDTO(userId, login, typeId, userLangId, siteLangId, numberOfResults, email, code, active);
	}
	
	private UserSessionDTO(long userId, String login, int typeId, int userLangId, 
				 int siteLangId, int numberOfResults, String email, String code,  boolean active){
		
		setId(userId);
		setLogin(login);
		setTypeId(typeId);
		setCode(code);
		setPrimaryLangId(userLangId);
		setSiteLangId(siteLangId);
		setNumberOfResults(numberOfResults);
		setEmail(email);
		setActive(active);
		
	}
		
	public UserSessionDTO(long userId, String login, int typeId,int userLangId, 
			  int siteLangId, int numberOfResults, String email, String code, boolean active, long template){
		setId(userId);
		setLogin(login);
		setTypeId(typeId);
		setCode(code);
		setPrimaryLangId(userLangId);
		setSiteLangId(siteLangId);
		setNumberOfResults(numberOfResults);
		setEmail(email);
		setActive(active);
		setTemplate(template);

	}
	
	
}
