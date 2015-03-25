package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.web.WebConstants;
//import com.loyauty.web.struts.action.LoyautyAction;
import com.loyauty.web.struts.action.LoyautyActionWeb;

public class OrdersConfirmation  extends LoyautyActionWeb{
	private static final long serialVersionUID = -6962019996289778201L;
	
	private OrdersService orderService;
	@Getter @Setter
	private String fileName="";
	@Getter @Setter
	private InputStream fileInputStream;
	private UserSessionDTO userSession;
	private String userLogin;
	private UserFileRecoveryDTO ufrDTO;
	@Getter @Setter
	private Integer op;
	
	/*=========================================================================================
									Default constructor
	  =========================================================================================*/
	public OrdersConfirmation() throws ServiceLocatorException {
		super();	 
		orderService = getServiceLocator().getOrderService();
	}

	/*=========================================================================================
 									method execute
  	  =========================================================================================*/
	@Override  
	public String execute() throws Exception {	
		HttpSession session = request.getSession(true);
		String filePath = session.getServletContext().getRealPath("/");
		userSession=(UserSessionDTO)session.getAttribute(WebConstants.USER);
		userLogin="";
		if(userSession!=null)userLogin=userSession.getLogin();
		ufrDTO=orderService.getUserFileRecoveryByUser(userLogin);
		SimpleDateFormat frm=new SimpleDateFormat("dd-MM-yy");
		
		//check path of wtpwebapps in server
		String wtpwebapps=filePath;
		File folderLogParent= new File(wtpwebapps);
		wtpwebapps=folderLogParent.getParent();
		File folderOrdersConfirm = new File(wtpwebapps+"/orders_confirm");
		folderOrdersConfirm.mkdirs();
		File folderClient = new File(wtpwebapps+"/orders_confirm/"+userLogin);
		folderClient.mkdirs();
		String ext="";
		
		//If user is not mapped don't continue
		if(ufrDTO==null){
			downloadFile(wtpwebapps,"","file_not_found","txt");
			return SUCCESS;
		}
		if(op==null)op=0;
		String[] confirmFimeTab= getOrderFileConfirm(wtpwebapps+"/orders_confirm/"+userLogin+"/",op);
		String fileNameWithoutExt=confirmFimeTab[0];
		ext=confirmFimeTab[1];
		String fileToDownloadName="none";
		if(fileNameWithoutExt!=null && ext!=null){
			confirmFimeTab=fileNameWithoutExt.split("/");
			fileToDownloadName=confirmFimeTab[confirmFimeTab.length-1]+"."+ext;
		}
		String filePrefix="";
		Date date=getDate(1);
		String strYesteday=frm.format(date);
		date=getDate(2);
		String strStartWeek=frm.format(date);
		date=getDate(3);
		String strStartMonth=frm.format(date);
		
		if(op==null)op=0;
		try{
			switch (op) {
			case 0: //-------------- Download Orders Invoiced in the previous day -------------- 
				filePrefix="Shipping_Confirmation_"+strYesteday;
				break;
			case 1: //-------------- Download Orders Invoiced in this week --------------------- 
				filePrefix="Shipping_Confirmation_"+strStartWeek+"_to_"+strYesteday;
				break;
			case 2: //-------------- Download Orders Invoiced in this month --------------------- 
				filePrefix="Shipping_Confirmation_"+strStartMonth+"_to_"+strYesteday;
				break;
			
			}
			downloadFile(wtpwebapps,filePrefix,fileToDownloadName,ext);
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
		
	}

	public void downloadFile(String wtpwebapps,String filePrefix,String fileNameToDownload,String ext){
		try{
			File fileToDownload=new File(wtpwebapps+"/orders_confirm/"+userLogin+"/"+fileNameToDownload);
			SimpleDateFormat frm=new SimpleDateFormat("dd-MM-yyyy");
			String strDate=frm.format(new Date());
			fileName=filePrefix+"."+ext;
			if(!fileToDownload.exists()){
				File fileError=new File(wtpwebapps+"/orders_confirm/"+userLogin+"/error.txt");
				if(fileError.exists())fileError.delete();
				PrintWriter pw= new PrintWriter(new FileWriter(wtpwebapps+"/orders_confirm/"+userLogin+"/error.txt",true),true);
				pw.println("=========================");
				pw.println(strDate);
				pw.println("=========================");
				pw.println("Data not found! Please contact us");
				String rapport="";
				pw.close();
				fileInputStream = new FileInputStream(new File(wtpwebapps+"/orders_confirm/"+userLogin+"/error.txt"));
				fileName="file_not_found_"+".txt";
			}else{
				fileInputStream = new FileInputStream(new File(wtpwebapps+"/orders_confirm/"+userLogin+"/"+fileNameToDownload));
			}
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Date getDate(int yesterdayOrWeekOrMonth){
		Date result=null;
		//today
		Date dateNow=new Date();
		//date week
		Calendar weekCalendar = Calendar.getInstance();
		weekCalendar.clear();
		weekCalendar.setTime(dateNow);
		//Friday
		Calendar fridayCalendar = Calendar.getInstance();
		fridayCalendar.clear();
		fridayCalendar.setTime(dateNow);
		//month date
		Calendar monthCalendar = Calendar.getInstance();
		monthCalendar.clear();
		monthCalendar.setTime(dateNow);
	
		switch (yesterdayOrWeekOrMonth) {
		case 1:
			while (fridayCalendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
				fridayCalendar.add(Calendar.DATE, -1);
			}
			Date friday=fridayCalendar.getTime();
			result=dateNow;
			if(weekCalendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY ||
					weekCalendar.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY||
					weekCalendar.get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY){
				result=friday;
			}else{
				weekCalendar.add(Calendar.DATE, -1);
				result=weekCalendar.getTime();
			}
			break;
		case 2:
			weekCalendar.add(Calendar.DATE, -1);
				while (weekCalendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
					weekCalendar.add(Calendar.DATE, -1);
				}
				result=weekCalendar.getTime();
			break;
		case 3:

			monthCalendar.set(Calendar.DATE, 1);
			result=monthCalendar.getTime();
			break;
		default:
			result=dateNow;
			break;
		}

		return result;
	}
	

    /*=================================================================================
					getOrderFileConfirm: Get File Name with his Extension
      =================================================================================*/
     String[] getOrderFileConfirm(String path,int option){
    	String[] result=new String[2];
    	 File localFilesList=new File(path);
         File[] files = localFilesList.listFiles();
         if(files==null)files=new File[0];
         for (File file : files) {
             String uploadFileName=file.getName();
             if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
                int index =uploadFileName.lastIndexOf(".");
                String ext= uploadFileName.substring(index+1); 
                String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
                if(uploadFileNameWithoutExt.contains("day_")&& option==0){
                	result[0]=path+uploadFileNameWithoutExt;
                	result[1]=ext;
                	break;
                }else if(uploadFileNameWithoutExt.contains("week_")&& option==1){
                	result[0]=path+uploadFileNameWithoutExt;
                	result[1]=ext;
                	break;
                }else if(uploadFileNameWithoutExt.contains("month_")&& option==2){
                	result[0]=path+uploadFileNameWithoutExt;
                	result[1]=ext;
                	break;
                }
             }
         }
    	return result;
    }


}
