package com.loyauty.web.struts.action.advantage;

import com.loyauty.web.struts.action.LoyautyAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import lombok.Getter;
import lombok.Setter;

public class DownloadPDF extends LoyautyAction{
	private static final long serialVersionUID = -1689173674902884083L;
	
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	
	@Override
	public String execute() throws Exception {							
		String filePath = request.getSession().getServletContext().getRealPath("/");
		filePath = filePath + "WEB-INF/jsp/advantage/data/";
		fileName="advantage.pdf";		
		try {
			fileInputStream = new FileInputStream(new File( filePath+"advantage.pdf"));
			 return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}
	}
	
	
}
