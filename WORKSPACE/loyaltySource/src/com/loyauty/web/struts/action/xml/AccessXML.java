package com.loyauty.web.struts.action.xml;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileInputStream;

import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class AccessXML extends LoyautyAction {
	
	private static final long serialVersionUID = -326413927066254487L;
	
	@Getter @Setter
	private String login;
	
	@Getter @Setter
	private String password;

	@Getter @Setter
	private String loginFromDB;
	
	@Getter @Setter
	private String passwordFromDB;	
	
	@Getter @Setter
	private FileInputStream fileInputStream;
		
	private UserService userService;
		
	public String execute() throws Exception {
		
		try {
			System.out.println("loginFromURL: |" + login + "| and passwordFromURL: |" + password + "|");

			userService = getServiceLocator().getUserService();
			UserDTO userDTO = userService.authenticateByURL(login);
			
			if (userDTO != null) {
				
				loginFromDB = userDTO.getLogin();
				passwordFromDB = userDTO.getPassword();
				long userID = userDTO.getId();
				
				System.out.println("loginFromDB: |" + loginFromDB 
						+ "| and passwordFromDB: |" + passwordFromDB 
						+ "| and userID = " + userID);
				
				if (loginFromDB.equalsIgnoreCase(login) && passwordFromDB.equalsIgnoreCase(password)) {
					
					System.out.println("userID: |" + userID + "|");
					
					String inDir = userDTO.getCode() + (userID*userID + 1) + "_";
					
					// String location = "C:\\dev\\workspace\\xml\\" + inDir  + "\\catalogUpdates.xml";
					String location = "/usr/apache-tomcat-7.0.27/webapps/xml/" + inDir  + "/catalogUpdates.xml";
					
					fileInputStream = new FileInputStream(new File(location));
					
					System.out.println("fileInputStream: |" + fileInputStream + "|");
					
					return SUCCESS;
				}
				
				
			}
			// for (int times=0; times <= 100; times++) System.out.println("--- AccessXML ----");		
						
			
		} catch (Exception e) {
			addActionError(getText("loyauty.error.download.xml"));
		}
	    return INPUT;
	}
	
}
