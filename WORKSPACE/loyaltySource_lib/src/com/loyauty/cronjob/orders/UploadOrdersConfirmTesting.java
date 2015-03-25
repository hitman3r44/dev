package com.loyauty.cronjob.orders;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.user.UserService;

public class UploadOrdersConfirmTesting {
	private static ServiceLocator serviceLocator;
	private static UserService userService;

	public static void main(String[] args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			userService = serviceLocator.getUserService();
			//List<UserConnectionDTO>userConnDTOList=userService.getAllUsersConnections();
			//for(UserConnectionDTO usrConnDTO:userConnDTOList){
			UserConnectionDTO usrConnDTO=new UserConnectionDTO();
			usrConnDTO=userService.getUserConnectionByLogin("Rideau");
			usrConnDTO.setClientShipmentsFolder("/_TEST/Confirmations/");
			usrConnDTO.setHost("sftp.rideau.com");
			usrConnDTO.setUserName("loyaltysource-sftp");
			usrConnDTO.setPassword("w@rD5iVerrR)z");
			//usrConnDTO.setOrdersConfirmFolder("c:/orders_confirm/Rideau/");
			usrConnDTO.setOrdersConfirmFolder("/usr/apache-tomcat-7.0.27_testing/webapps/orders_confirm/Rideau/");
			usrConnDTO.setUserLogin("Rideau");
			usrConnDTO.setPort(22);
			usrConnDTO.setUserSendingId(2L);
			usrConnDTO.setProtocol("sftp");
			usrConnDTO.setUserId(10L);
			uploadOrdersConfirm(usrConnDTO);
			//}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	
	/*====================================================================================================
		<<- SFTP ->> sftpUpload: upload all remoteFolder files in LocalFolder using SFTP protocol
	====================================================================================================*/
	public static void sftpUpload(UserConnectionDTO usrConnDTO){  
		String host=usrConnDTO.getHost();
		int port=usrConnDTO.getPort();
		String userName=usrConnDTO.getUserName();
		String password=usrConnDTO.getPassword();
		String remoteFolderName=usrConnDTO.getClientShipmentsFolder()+"ordersConfirm/";
		try {
			JSch jsch = new JSch();
			Session session = null;
			Channel channel = null;
			ChannelSftp sftpChannel = null;
			Date today=new Date();
			//date of starting yesterday
			Calendar yesterdayCalendar = Calendar.getInstance();
			yesterdayCalendar.clear();
			yesterdayCalendar.setTime(today);
			yesterdayCalendar.add(Calendar.DATE, -1);
			Date dateStartingYesteday=yesterdayCalendar.getTime();
			SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
			String strDate=sfd.format(dateStartingYesteday);
			try {
				session = jsch.getSession(userName, host,port);
				session.setPassword(password);
				java.util.Properties config = new java.util.Properties();
				config.put("StrictHostKeyChecking", "no");
				session.setConfig(config);
				session.connect();
				channel = session.openChannel("sftp");
				channel.connect();
				sftpChannel = (ChannelSftp)channel;
			} catch (Exception e) {
				System.err.println("Unable to connect to FTP server."+e.toString());
				throw e;
			}              
			String[] tabFileExt=getOrderFileConfirm(usrConnDTO.getOrdersConfirmFolder(),usrConnDTO);
			String uploadFileNameWithoutExt=tabFileExt[0];
			String ext=tabFileExt[1];
			String nameFileToUpload="Shipping_Confirmation_"+strDate+"."+ext;
			if(usrConnDTO.getUserId()==10){
				uploadFileNameWithoutExt=tabFileExt[0].substring(10);
				nameFileToUpload=uploadFileNameWithoutExt+"."+ext;
				remoteFolderName=usrConnDTO.getClientShipmentsFolder();
			}
			InputStream intputStream = new BufferedInputStream(new FileInputStream(usrConnDTO.getOrdersConfirmFolder()+uploadFileNameWithoutExt+"."+ext));
			try {
				sftpChannel.cd(remoteFolderName);
			}
			catch ( Exception e ) {
				sftpChannel.mkdir(remoteFolderName);
				sftpChannel.cd(remoteFolderName);
			}
			File fileToSend=new File(usrConnDTO.getOrdersConfirmFolder()+uploadFileNameWithoutExt+"."+ext);
			Long fileToSendSize=fileToSend.length();
			//upload File it not empty
			if((fileToSendSize>20480L && ext.equals("xls"))||
					(fileToSendSize>75L && ext.equals("xml")) ||
					(fileToSendSize>263L && ext.equals("csv"))){
				sftpChannel.put(intputStream, remoteFolderName+nameFileToUpload); 
				System.out.println("Uploading the file:"+nameFileToUpload+" UserLogin: "+usrConnDTO.getUserLogin());
			}
		} catch (Exception e) {
			System.err.println("Error: "+e.toString());
		}
	}


	/*=================================================================================
			getOrderFileConfirm: Get File Name with his Extension
	=================================================================================*/
	static String[] getOrderFileConfirm(String path, UserConnectionDTO usrConnDTO){
		String[] result=new String[2];
		File localFilesList=new File(path);
		File[] files = localFilesList.listFiles();
		if(files==null)files=new File[0];
		for (File file : files) {
			String uploadFileName=file.getName();
    		if(usrConnDTO.getUserId()==10){
    			if(uploadFileName.substring(0,2).equals("SD")){
    				uploadFileName="ordersDay_"+uploadFileName;
    			}
    		}
			if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
				int index =uploadFileName.lastIndexOf(".");
				String ext= uploadFileName.substring(index+1); 
				String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
				if(uploadFileNameWithoutExt.contains("ordersDay")){
					//result[0]=path+uploadFileNameWithoutExt;
					result[0]=uploadFileNameWithoutExt;
					result[1]=ext;
					break;
				}
			}
		}
		return result;
	}
	
    /*====================================================================================================
        <<- FTP OR SFTP ->> ftpUpload: Upload all localFolder files in remoteFolder using FTP protocol
      ====================================================================================================*/
	 public static void uploadOrdersConfirm(UserConnectionDTO usrConnDTO){
		 if(usrConnDTO==null)return;
		 if( usrConnDTO.getProtocol()!=null && usrConnDTO.getProtocol().toLowerCase().equals("ftp") &&
		     (usrConnDTO.getUserSendingId()==2L || usrConnDTO.getUserSendingId()==3L )){
			 ftpUpload(usrConnDTO); 
		 }else if(usrConnDTO.getProtocol()!=null && usrConnDTO.getProtocol().toLowerCase().equals("sftp") &&
				 (usrConnDTO.getUserSendingId()==2L || usrConnDTO.getUserSendingId()==3L )){
			 sftpUpload(usrConnDTO);
		 }
	 }

    /*====================================================================================================
        <<- FTP ->> ftpUpload: Upload all localFolder files in remoteFolder using FTP protocol
      ====================================================================================================*/
    public static void ftpUpload(UserConnectionDTO usrConnDTO){
    	String host=usrConnDTO.getHost();
    	int port=usrConnDTO.getPort();
    	String userName=usrConnDTO.getUserName();
    	String password=usrConnDTO.getPassword();
		String remoteFolderName=usrConnDTO.getClientShipmentsFolder()+"ordersConfirm/";
		String localFolderName=usrConnDTO.getOrdersConfirmFolder();
        FTPClient ftpClient = new FTPClient();
        BufferedInputStream bis=null;
        Date today=new Date();

		//date of starting yesterday
		Calendar yesterdayCalendar = Calendar.getInstance();
		yesterdayCalendar.clear();
		yesterdayCalendar.setTime(today);
		yesterdayCalendar.add(Calendar.DATE, -1);
		Date dateStartingYesteday=yesterdayCalendar.getTime();
        
        SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
        String strDate=sfd.format(dateStartingYesteday);
        try {
            ftpClient.connect(host, port);
            ftpClient.login(userName, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            File localFilesList=new File(localFolderName);
            File[] files = localFilesList.listFiles();
            for (File file : files) {
                String uploadFileName=file.getName();
                if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
                   File localFil = new File(localFolderName+uploadFileName);
                   bis = new BufferedInputStream(new FileInputStream(localFil));
                   ftpClient.makeDirectory(remoteFolderName);
                   int index =uploadFileName.lastIndexOf(".");
                   String ext= uploadFileName.substring(index+1); 
                   String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
                   if(uploadFileNameWithoutExt.equals("ordersDay")){
                	    uploadFileName=uploadFileNameWithoutExt+"_"+strDate+"."+ext;
	       				File fileToSend=new File(uploadFileName);
	    				Long fileToSendSize=fileToSend.length();
	    				//upload File it not empty
	    				if((fileToSendSize>20480L && ext.equals("xls"))||
	    				   (fileToSendSize>75L && ext.equals("xml")) ||
	    				   (fileToSendSize>263L && ext.equals("csv"))){
	    					boolean res = ftpClient.storeFile(remoteFolderName+uploadFileName, bis); 
	    					System.out.println("Uploading the file:"+uploadFileName+" UserLogin: "+usrConnDTO.getUserLogin());
	    				}
                   }
                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    if(bis!=null)bis.close();
                    ftpClient.logout();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

   /*====================================================================================================
		<<- SFTP ->> sftpUpload: upload all remoteFolder files in LocalFolder using SFTP protocol
	====================================================================================================*/
    /*    public static void sftpUpload(UserConnectionDTO usrConnDTO){  
    	String host=usrConnDTO.getHost();
    	int port=usrConnDTO.getPort();
    	String userName=usrConnDTO.getUserName();
    	String password=usrConnDTO.getPassword();
    	String remoteFolderName=usrConnDTO.getClientShipmentsFolder();
    	String localFolderName=usrConnDTO.getOrdersConfirmFolder();
    	try {
    		JSch jsch = new JSch();
    		Session session = null;
    		Channel channel = null;
    		ChannelSftp sftpChannel = null;
    		Date today=new Date();

    		//date of starting yesterday
    		Calendar yesterdayCalendar = Calendar.getInstance();
    		yesterdayCalendar.clear();
    		yesterdayCalendar.setTime(today);
    		yesterdayCalendar.add(Calendar.DATE, -1);
    		Date dateStartingYesteday=yesterdayCalendar.getTime();

    		SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
    		String strDate=sfd.format(dateStartingYesteday);
    		try {
    			session = jsch.getSession(userName, host,port);
    			session.setPassword(password);
    			java.util.Properties config = new java.util.Properties();
    			config.put("StrictHostKeyChecking", "no");
    			session.setConfig(config);
    			session.connect();
    			channel = session.openChannel("sftp");
    			channel.connect();
    			sftpChannel = (ChannelSftp)channel;
    		} catch (Exception e) {
    			System.err.println("Unable to connect to FTP server."+e.toString());
    			throw e;
    		}
    		File localFilesList=new File(localFolderName);
    		File[] files = localFilesList.listFiles();
    		for (File file : files) {
    			boolean toSend = false;
    			String uploadFileName=file.getName();
    			int index =uploadFileName.lastIndexOf(".");
    			String ext= uploadFileName.substring(index+1); 
    			String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
    			System.out.println("uploadFileNameWithoutExt is " + uploadFileNameWithoutExt); 

    			if(usrConnDTO.getUserId()!=10){
    				remoteFolderName=remoteFolderName+"ordersConfirm/";
    				if(uploadFileNameWithoutExt.equals("ordersDay")){
    					uploadFileName=uploadFileNameWithoutExt+"_"+strDate+"."+ext;
    				}
    			}

    			InputStream  inputStream = changeDir(localFolderName,uploadFileName,remoteFolderName,sftpChannel,file);
    			
    			System.out.println("parameters send to toSend method are : " + localFolderName+uploadFileNameWithoutExt+"."+ext + " file extension is " + ext);
    			toSend = checkIfFileIsValid(localFolderName+uploadFileNameWithoutExt+"."+ext,ext);
    			System.out.println("the method returned "  + toSend);
    			if(toSend){
    				sftpChannel.put(inputStream, remoteFolderName+uploadFileName); 
    				System.out.println("Uploading the file:"+uploadFileName+" UserLogin: "+usrConnDTO.getUserLogin());
    			}	
    		}

    	} catch (Exception e) {
    		System.err.println("Error: "+e.toString());
    	}
    }

    private static InputStream changeDir(String localFolderName,String uploadFileName, String remoteFolderName, ChannelSftp sftpChannel, File file) throws SftpException, FileNotFoundException {
    	InputStream inputStream =null;
    	if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
    		inputStream = new BufferedInputStream(new FileInputStream(localFolderName+uploadFileName));
    		try {
    			sftpChannel.cd(remoteFolderName);
    		}
    		catch ( Exception e ) {
    			sftpChannel.mkdir(remoteFolderName);
    			sftpChannel.cd(remoteFolderName);
    		}

    	}
    	return inputStream;
    }
    
    private static boolean checkIfFileIsValid(String uploadFileName, String ext) {
    	boolean result = false;
    	File fileToSend=new File(uploadFileName);
    	Long fileToSendSize=fileToSend.length();
    	//upload File it not empty
    	if((fileToSendSize>20480L && ext.equals("xls"))||(fileToSendSize>75L && ext.equals("xml")) ||(fileToSendSize>263L && ext.equals("csv"))){
    		result = true;
    	}
    	return result;
    }    */

}
