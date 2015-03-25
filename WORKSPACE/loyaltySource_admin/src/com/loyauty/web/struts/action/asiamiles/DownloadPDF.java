package com.loyauty.web.struts.action.asiamiles;

import com.loyauty.web.struts.action.LoyautyAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import lombok.Getter;
import lombok.Setter;

public class DownloadPDF extends LoyautyAction{
	
	private static final long serialVersionUID = 9205591908480507240L;
	
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	
	@Override  
	public String execute() throws Exception {							
		String filePath = request.getSession().getServletContext().getRealPath("/");
		filePath = filePath + "WEB-INF/jsp/asiaMiles/data/";
		fileName="asiamiles.pdf";
		try{
			fileInputStream = new FileInputStream(new File( filePath+"asiamiles.pdf"));
			 return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}

	}
	

}
