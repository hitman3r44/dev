package com.loyauty.utility;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;

public class FullXMLByUserId {
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	
	public static void main(String... args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			userService = serviceLocator.getUserService();
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			
			GenerateXMLByUserId xmlByUserGenX = null;
			String whereToWriteIn = "";
				
			long userId = 3L;
			xmlByUserGenX = new GenerateXMLByUserId();
			whereToWriteIn = "C:\\xy\\catalogUpdates_Advantage_3.xml";
			// whereToWriteIn = "/usr/apache-tomcat-6.0.35/webapps/loyaltySource/xml/" + userId  + "/catalogUpdates.xml";
			
			File file = new File(whereToWriteIn);
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				new FileWriter(file);
			}
			xmlByUserGenX.doXML(userId, file, "AD_");
			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

}
