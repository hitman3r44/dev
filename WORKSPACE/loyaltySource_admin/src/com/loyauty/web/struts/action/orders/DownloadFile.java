package com.loyauty.web.struts.action.orders;

import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DownloadFile extends LoyautyAction{
	private static final long serialVersionUID = 1908253872378165108L;
	
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	private ServiceLocator serviceLocator;
	private UserService userService;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private Integer invoicing;
	@Override
	public String execute() throws Exception {							
		serviceLocator = ServiceLocator.getInstance();
		try{
			//===========>Instantiate Services
			userService = serviceLocator.getUserService();
			//===========>download File
			UserConnectionDTO userConnDTO=userService.getUserConnectionByLogin(userLogin);
			if(userConnDTO==null){
				downloadFile(null,fileName);
			}else{
				
				if(invoicing==null)invoicing=0;
				String path=null;
				switch (invoicing) {
				case 1://download generated invoice xml
					path=userConnDTO.getInvoiceConfirmFolder()+"/";
					break;
				default://download orders
					path=userConnDTO.getOrdersFolder()+userLogin+"/";
					break;
				}
				downloadFile(path,fileName);
			}
			return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}

	}
	

	public void downloadFile(String path,String fileNameToDownload){
		try{
			File fileToDownload=null;
			if(path!=null)fileToDownload=new File(path+fileNameToDownload);
			SimpleDateFormat frm=new SimpleDateFormat("dd-MM-yyyy");
			String strDate=frm.format(new Date());
			if(path==null || !fileToDownload.exists()){
				File fileError=new File(path+"error.txt");
				if(fileError.exists())fileError.delete();
				PrintWriter pw= new PrintWriter(new FileWriter(path+"error.txt",true),true);
				pw.println("=========================");
				pw.println(strDate);
				pw.println("=========================");
				pw.println("The File does't Physically Exist");
				pw.close();
				fileInputStream = new FileInputStream(new File(path+"error.txt"));
				fileName="file_not_found_"+".txt";
			}else{
				fileInputStream = new FileInputStream(new File(path+fileNameToDownload));
			}
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
}

