package com.loyauty.cronjob.orders;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.user.UserService;

public class UploadInvoicesConfirmation {
	private static ServiceLocator serviceLocator;
	private static UserService userService;


	public static void main(String[] args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			userService = serviceLocator.getUserService();
			List<UserConnectionDTO>userConnDTOList=userService.getAllUsersConnections();
			for(UserConnectionDTO usrConnDTO:userConnDTOList){
				uploadInvoicesConfirm(usrConnDTO);
			}
			System.out.println("\n\n");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.exit(0);
		}

	}

	/*====================================================================================================
        <<- FTP OR SFTP ->> ftpUpload: Upload all localFolder files in remoteFolder using FTP protocol
      ====================================================================================================*/
	public static void uploadInvoicesConfirm(UserConnectionDTO usrConnDTO){
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
		String userLogin=usrConnDTO.getUserLogin();
		String host=usrConnDTO.getHost();
		int port=usrConnDTO.getPort();
		String userName=usrConnDTO.getUserName();
		String password=usrConnDTO.getPassword();
		String remoteFolderName=usrConnDTO.getRemoteClientInvoiceFolder();
		FTPClient ftpClient = new FTPClient();
		BufferedInputStream bis=null;

		try {
			ftpClient.connect(host, port);
			ftpClient.login(userName, password);
			ftpClient.enterLocalPassiveMode();
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			String[] tabFileExt=getInvoiceFileConfirm(usrConnDTO.getOrdersConfirmFolder());
			String uploadFileNameWithoutExt=tabFileExt[0];
			String ext=tabFileExt[1];
			if(uploadFileNameWithoutExt==null || ext==null)return;
			File localFile = new File(uploadFileNameWithoutExt+"."+ext);
			bis = new BufferedInputStream(new FileInputStream(localFile));
			ftpClient.makeDirectory(remoteFolderName);
			String tabPathFile[]=uploadFileNameWithoutExt.split("/");
			String nameFileToUpload=tabPathFile[tabPathFile.length-1].replaceAll("day_", "")+"."+ext;
			//String nameFileToUpload="Shipping_Confirmation_"+strDate+"."+ext;
			File fileToSend=new File(uploadFileNameWithoutExt+"."+ext);
			Long fileToSendSize=fileToSend.length();
			//upload File it not empty
			if((fileToSendSize>20480L && ext.equals("xls"))||
					(fileToSendSize>75L && ext.equals("xml")) ||
					(fileToSendSize>263L && ext.equals("csv"))){
				boolean res = ftpClient.storeFile(remoteFolderName+nameFileToUpload, bis); 
				System.out.println("Uploading the file:"+nameFileToUpload+" UserLogin: "+usrConnDTO.getUserLogin());
				// to copy the file in invoice_sent folder and delete the send file.
				File sentFolder=new File(usrConnDTO.getInvoiceConfirmFolder()+"invoice_sent/");
				sentFolder.mkdir();				
				File srcFile = new File(uploadFileNameWithoutExt+"."+ext);
				File destFile = new File(usrConnDTO.getInvoiceConfirmFolder()+"invoice_sent/"+nameFileToUpload);
				com.loyauty.util.io.FileUtils.copyfile(srcFile, destFile);
				System.out.println("The file:"+uploadFileNameWithoutExt+"."+ext+" Was Sent To:--"+userLogin+"-- Server By FTP");
				//FileUtils.copyFile(srcFile, destFile);
				bis.close();
				bis = null;
				System.gc();
				srcFile.delete();
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
	public static void sftpUpload(UserConnectionDTO usrConnDTO){  
		String userLogin=usrConnDTO.getUserLogin();
		String host=usrConnDTO.getHost();
		int port=usrConnDTO.getPort();
		String userName=usrConnDTO.getUserName();
		String password=usrConnDTO.getPassword();
		String remoteFolderName=usrConnDTO.getRemoteClientInvoiceFolder(); // destination
		try {
			JSch jsch = new JSch();
			Session session = null;
			Channel channel = null;
			ChannelSftp sftpChannel = null;
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
			List<String> fileToUpload=getAllFilesToUpload(usrConnDTO.getInvoiceConfirmFolder());
			for(String filesTo : fileToUpload){
				String[] tabFileExt=getInvoiceFileConfirm(usrConnDTO.getInvoiceConfirmFolder()); 
				String uploadFileNameWithoutExt=tabFileExt[0];
				String ext=tabFileExt[1];
				if(uploadFileNameWithoutExt==null || ext==null)return;
				InputStream intputStream = new BufferedInputStream(new FileInputStream(uploadFileNameWithoutExt+"."+ext));
				try {
					sftpChannel.cd(remoteFolderName);
				}
				catch ( Exception e ) {
					sftpChannel.mkdir(remoteFolderName);
					sftpChannel.cd(remoteFolderName);
				}
				String tabPathFile[]=uploadFileNameWithoutExt.split("/");
				String nameFileToUpload=tabPathFile[tabPathFile.length-1].replaceAll("day_", "")+"."+ext;
				// String nameFileToUpload="Shipping_Confirmation_"+strDate+"."+ext;
				File fileToSend=new File(uploadFileNameWithoutExt+"."+ext);
				Long fileToSendSize=fileToSend.length();
				//upload File it not empty
				if((fileToSendSize>20480L && ext.equals("xls"))||
						(fileToSendSize>75L && ext.equals("xml")) ||
						(fileToSendSize>263L && ext.equals("csv"))){
					sftpChannel.put(intputStream, remoteFolderName+nameFileToUpload); 
					// to copy the file in invoice_sent folder and delete the send file.
					File sentFolder=new File(usrConnDTO.getInvoiceConfirmFolder()+"invoice_sent/");
					sentFolder.mkdir();				
					File srcFile = new File(uploadFileNameWithoutExt+"."+ext);
					File destFile = new File(usrConnDTO.getInvoiceConfirmFolder()+"invoice_sent/"+nameFileToUpload);
					com.loyauty.util.io.FileUtils.copyfile(srcFile, destFile);
					System.out.println("The file:"+uploadFileNameWithoutExt+"."+ext+" Was Sent To:--"+userLogin+"-- Server By SFTP");
					intputStream.close();
					intputStream = null;
					System.gc();
					srcFile.delete();
				}
			}
		} catch (Exception e) {
			System.err.println("Error: "+e.toString());
		}
	}    

	private static List<String> getAllFilesToUpload(String invoiceConfirmFolderPath) {
		List <String> fileList = new ArrayList<String>();
		File localFilesList=new File(invoiceConfirmFolderPath);
		File[] files = localFilesList.listFiles();
		for (File file : files) {
			String uploadFileName=file.getName();
			if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
				int index =uploadFileName.lastIndexOf(".");
				//String ext= uploadFileName.substring(index+1); 
				String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
				if(uploadFileNameWithoutExt.contains("day_")){
					fileList.add(uploadFileName);

				}
			}
		}
		return fileList;
	}

	/*=================================================================================
					getInvoiceFileConfirm: Get File Name with his Extension
      =================================================================================*/
	static String[] getInvoiceFileConfirm(String path){
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
