package com.loyauty.web.struts.action.xml;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileInputStream;

import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyActionWeb;

public class UpdatesXML extends LoyautyActionWeb {
	
	private static final long serialVersionUID = -8411864325353489106L;
	
	@Getter @Setter
	private FileInputStream fileInputStream;
	
	// http://localhost/accessXML.do?login=Advantage&password=adv123
	public String execute() throws Exception {
		try {
			UserSessionDTO userSessionDTO = (UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if (userSessionDTO != null) {
				long userId = userSessionDTO.getId();
				
				String inDir = userSessionDTO.getCode() + (userId*userId + 1) + "_";				
				// String location = "C:\\dev\\workspace\\loyaltySource\\xml\\" + inDir  + "\\catalogUpdates.xml";
				String location = "/usr/apache-tomcat-7.0.27/webapps/xml/" + inDir  + "/catalogUpdates.xml";
				fileInputStream = new FileInputStream(new File(location));
				
			}
		} catch (Exception e) {
			addActionError(getText("loyauty.error.download.xml"));
		}
	    return SUCCESS;
	}
	
}
