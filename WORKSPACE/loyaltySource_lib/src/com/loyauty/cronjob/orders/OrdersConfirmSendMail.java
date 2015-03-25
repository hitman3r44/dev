package com.loyauty.cronjob.orders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.loyauty.cronjob.orders.OrdersConfirmation;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.init.ConfigService;
import com.loyauty.service.user.UserService;

public class OrdersConfirmSendMail{
	
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static ConfigService configService;
	private static StringBuilder adminMessage;
    /*=================================================================================
										Main Method
      =================================================================================*/
	public static void main(String[] args){
		serviceLocator = ServiceLocator.getInstance();	
		try {
			//===========>Instantiate Services
			userService = serviceLocator.getUserService();
			configService=serviceLocator.getConfigService();
			adminMessage = new StringBuilder();
			adminMessage.append("<table cellpadding='0' cellspacing='0' border='0' style='border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;'>");
			adminMessage.append("<tr height='40px' style='background:#33CCFF;font-weight: bold;color:#FFFFCC;border: 1px solid #CCCCCC;'><td style='padding-left: 10px;padding-right: 10px;border-right: 1px solid #FFFFCC;'>Client Login</td><td style='padding-left: 10px;padding-right: 10px;border-right: 1px solid #FFFFCC;'>File Name To Send</td><td style='padding-left: 10px;'>Sent To</td></tr>");
			
			//===========>Create SMTP Session
			String SMTP_HOST = "mail.gameaccesscash.com";
			String SMTP_PORT = "465";
		 	Properties properties = new Properties();
			properties.put("mail.smtp.host", SMTP_HOST);
			properties.put("mail.smtp.socketFactory.port", SMTP_PORT);
			properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			properties.put("mail.smtp.port", SMTP_PORT);
		    Session session = Session.getInstance(properties);
		  //===========>Send Messages
			List<UserConnectionDTO>userConnDTOList=userService.getAllUsersConnections();
			for(UserConnectionDTO usrConnDTO:userConnDTOList){
				if(usrConnDTO.getUserSendingId()==1L ||usrConnDTO.getUserSendingId()==3L){
					sendOrdersFileConfirm(session,usrConnDTO);
				}
			}
			adminMessage.append("</table>");
			System.out.println("\n\n");
			sendNotificationEmail(session,"System notification: sending order conformation files by email ",adminMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.exit(0);
		}

    }//end of main

    /*=================================================================================
					sendOrdersFileConfirm: Send Email with File Order Confirm
      =================================================================================*/
    public static void sendOrdersFileConfirm(Session session,UserConnectionDTO usrConnDTO){
		String mailFrom = "orders@loyaltysource.com";
		String[] tabFileExt=getOrderFileConfirm(usrConnDTO.getOrdersConfirmFolder());
		String fileToAttached=tabFileExt[0];
		String ext=tabFileExt[1];
		String mailTo = usrConnDTO.getEmail1();
		String subject="Shipped Orders";
    	if(fileToAttached==null)return;
        String tabPathFile[]=fileToAttached.split("/");
        String fileNameToAttached=tabPathFile[tabPathFile.length-1].replaceAll("day_", "");
        String tabFileCreationDate[]=fileNameToAttached.split("_");
	    String strDate=tabFileCreationDate[4];
	    if(strDate.length()<8)strDate="        ";
	    strDate=strDate.substring(6, 8)+"/"+strDate.substring(4, 6)+"/"+strDate.substring(0, 4);
        //String fileCreationDate=tabFileCreationDate[1];
        //String tabDateSplited[]=fileCreationDate.split("_");
    	try {
    		String EMAIL_FROM = mailFrom;
			String EMAIL_TO = mailTo;
		 	StringBuilder builder = new StringBuilder();
		    try{
				Message message = new MimeMessage(session);
				message.setSentDate(new Date());
				message.setFrom(new InternetAddress(EMAIL_FROM));
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(EMAIL_TO));
				message.setSubject(subject);
				//===========>Create the message part
				BodyPart messageBodyPart = new MimeBodyPart();
				String ligne="";
				String sendEmailDataFolder=getSendingEmailDataFolder();
				BufferedReader pr=new BufferedReader(new FileReader(sendEmailDataFolder+"sendingEmail.txt")); 
			    StringBuilder sb = new StringBuilder();
				while((ligne=pr.readLine())!=null){
					if(ligne.contains("salutation_id")){
						ligne+="Good day,<br/><br/>";
						ligne+="Here are your purchase orders that we shipped on the "+strDate+
						". If you have any questions, please do not hesitate to contact your account coordinator.<br/><br/>";
						ligne+="Thank you for doing business with us!<br/>";
					}
					sb.append(ligne);
				}
				pr.close();
				builder=sb;
				messageBodyPart.setContent(builder.toString(), "text/html; charset=ISO-8859-1");
				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(messageBodyPart);
				
				//===========>attachment
				File fileToSend=new File(fileToAttached+"."+ext);
				Long fileToSendSize=fileToSend.length();
				//cancel sending Email if file is empty
				if((fileToSendSize<=20480L && ext.equals("xls"))||
				   (fileToSendSize<=75L && ext.equals("xml")) ||
				   (fileToSendSize<=263L && ext.equals("csv")))return;
				BodyPart fileToAttachedBodyPart = new MimeBodyPart();
				DataSource source = new FileDataSource(fileToAttached+"."+ext);
				fileToAttachedBodyPart.setDataHandler(new DataHandler(source));
				fileToAttachedBodyPart.setFileName(fileNameToAttached+"."+ext);
				multipart.addBodyPart(fileToAttachedBodyPart);
				
				//===========>image logo
				MimeBodyPart imagePart = new MimeBodyPart();
				DataSource fds = new FileDataSource(sendEmailDataFolder+"ls_logo.png");
				imagePart.setDataHandler(new DataHandler(fds));
				
				//===========>assign a cid to the image
				imagePart.setHeader("Content-ID", "image001.png@01CF5A38.8E7FEAD0");
				multipart.addBodyPart(imagePart);
				
				//===========>Put parts in message
				message.setContent(multipart);
				
				//===========>Send the message
				Transport.send(message);
				adminMessage.append("<tr height='40px'><td style='border-bottom: 1px solid #CCCCCC;padding-left: 5px;'>"+usrConnDTO.getUserLogin()+"</td>");
				System.out.println("--------- User Login:"+usrConnDTO.getUserLogin()+"----------");
				System.out.println("Sending Email To:"+mailTo+" with file:"+fileNameToAttached+"."+ext);
				if(usrConnDTO.getEmail2()!=null && !usrConnDTO.getEmail2().equals("")){
					EMAIL_TO=usrConnDTO.getEmail2();
					Message message2 = new MimeMessage(session);
					message2.setSentDate(new Date());
					message2.setFrom(new InternetAddress(EMAIL_FROM));
					message2.addRecipient(Message.RecipientType.TO,new InternetAddress(EMAIL_TO));
					message2.setSubject(subject);
					
					message2.setContent(multipart);
					Transport.send(message2);
					System.out.println("Sending a Copy to:"+usrConnDTO.getEmail2());
					//adminMessage.append("Sending a Copy to:"+usrConnDTO.getEmail2()+"<br/>");
				}
				String sendingCopy=mailTo;
				if(usrConnDTO.getEmail2()!=null && !usrConnDTO.getEmail2().equals(""))sendingCopy=mailTo + "<br/>"+ usrConnDTO.getEmail2();
				adminMessage.append("<td style='border-bottom: 1px solid #CCCCCC;padding-left: 5px;'>"+fileNameToAttached+"."+ext+"</td>"+"<td style='border-bottom: 1px solid #CCCCCC;padding-left: 5px;'>"+sendingCopy+"</td></tr>");
				System.out.println("--------------------------------------------------");
		      }catch (MessagingException e) {
		    	  System.out.println("[OrdersConfirmSendEmail:sendOrdersFileConfirm:First Catch]---------> Probleme when the system try to send email to:"+usrConnDTO.getUserLogin()+" !!!!!!");
		    	  e.printStackTrace();
		      }	
		} catch (Exception e) {
			System.out.println("[OrdersConfirmSendEmail:sendOrdersFileConfirm:2nd Catch]---------> Probleme when the system try to send email to:"+usrConnDTO.getUserLogin()+" !!!!!!");
			e.printStackTrace();
		}
		
    }
    
    
    /*=================================================================================
								Sending notification to admins
      =================================================================================*/
    
    public static void sendNotificationEmail(Session session,String subject,StringBuilder adminMessage){
    	String mailFrom = "orders@loyaltysource.com";
    	String sendTo="";
    	try {
		 	StringBuilder builder = new StringBuilder();
			HashMap<Object,Object> hashCof=configService.getAdminConstants(0);
			Object objMailTo=hashCof.get("notification_admin_0");
			String mailTo=(String)objMailTo;
			Object objMailToCopy=hashCof.get("notification_admin_1");
			String mailToCopy=(String)objMailToCopy;

		    try{
		    	if(mailTo==null || mailTo.equals(""))return;
				Message message = new MimeMessage(session);
				message.setSentDate(new Date());
				message.setFrom(new InternetAddress(mailFrom));
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(mailTo));
				message.setSubject(subject);
				//===========>Create the message part
				BodyPart messageBodyPart = new MimeBodyPart();
				String ligne="";
				String sendEmailDataFolder=getSendingEmailDataFolder();
				BufferedReader pr=new BufferedReader(new FileReader(sendEmailDataFolder+"sendingEmail.txt")); 
			    StringBuilder sb = new StringBuilder();
				while((ligne=pr.readLine())!=null){
					if(ligne.contains("salutation_id")){
						ligne+="Hi,<br/><br/>Below are the details of client who have been sent an email along with the filename<br/><br/>"+adminMessage+"<br/><br/>";
						ligne+="Thanks<br/>";
					}
					sb.append(ligne);
				}
				pr.close();
				builder=sb;
				messageBodyPart.setContent(builder.toString(), "text/html; charset=ISO-8859-1");
				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(messageBodyPart);
				
				//===========>image logo
				MimeBodyPart imagePart = new MimeBodyPart();
				DataSource fds = new FileDataSource(sendEmailDataFolder+"ls_logo.png");
				imagePart.setDataHandler(new DataHandler(fds));
				
				//===========>assign a cid to the image
				imagePart.setHeader("Content-ID", "image001.png@01CF5A38.8E7FEAD0");
				multipart.addBodyPart(imagePart);
				
				//===========>Put parts in message
				message.setContent(multipart);
				sendTo=mailTo;
				//===========>Send the message
				if(sendTo!=null && !sendTo.equals(""))Transport.send(message);
				//===========>Sending a copy to other admin
				Message message2 = new MimeMessage(session);
				message2.setSentDate(new Date());
				message2.setFrom(new InternetAddress(mailFrom));
				message2.addRecipient(Message.RecipientType.TO,new InternetAddress(mailToCopy));
				message2.setSubject(subject);
				message2.setContent(multipart);
				sendTo=mailToCopy;
				if(sendTo!=null && !sendTo.equals(""))Transport.send(message2);
				
		      }catch (MessagingException e) {
		    	  System.out.println("[OrdersConfirmSendEmail:sendOrdersFileConfirm:First Catch]---------> Probleme when the system try to send email to:"+sendTo+" !!!!!!");
		    	  e.printStackTrace();
		      }	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
    

    /*=================================================================================
				getSendingEmailDataFolder: Get dynamically Data Folder Path
      =================================================================================*/
    static String getSendingEmailDataFolder(){
		String sendMailFileDest="";
		URL url=OrdersConfirmation.class.getProtectionDomain().getCodeSource().getLocation();
		String pathRoot=url.getPath();
		File fileRoot=new File(pathRoot); 
		for(int i=0;i<=1;i++){
			fileRoot=new File(pathRoot); 
			pathRoot=fileRoot.getParent();
        }
		sendMailFileDest=pathRoot+"/jsp/orders/data/";
        return sendMailFileDest;
    }

    /*=================================================================================
					getOrderFileConfirm: Get File Name with his Extension
      =================================================================================*/
    static String[] getOrderFileConfirm(String path){
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
                if(uploadFileNameWithoutExt.contains("day_")){
                	result[0]=path+uploadFileNameWithoutExt;
                	result[1]=ext;
                	break;
                }
             }
         }
    	return result;
    }
    
}
