package com.loyauty.cronjob.orders;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.user.UserService;

public class OrdersDownload {
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static OrdersService orderService;
	
	public static void main(String[] args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			userService = serviceLocator.getUserService();
			orderService = serviceLocator.getOrderService();
			List<UserConnectionDTO>userConnDTOList=userService.getAllUsersConnections();
			for(UserConnectionDTO usrConnDTO:userConnDTOList){
				downloadOrders(usrConnDTO);
			}
			System.out.println("\n\n");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.exit(0);
		}
		
	}

    /*====================================================================================================
        <<- FTP OR SFTP ->> ftpUpload: download all localFolder files in remoteFolder using FTP protocol
      ====================================================================================================*/
	 public static void downloadOrders(UserConnectionDTO usrConnDTO) throws Exception{
		 if(usrConnDTO==null || usrConnDTO.getHost()==null || usrConnDTO.getHost().equals(""))return;
		 if(usrConnDTO.getProtocol().toLowerCase().equals("ftp")){
			 ftpDownload(usrConnDTO); 
		 }else if(usrConnDTO.getProtocol().toLowerCase().equals("sftp")){
			 sftpDownload(usrConnDTO);
		 }
	 }

    /*====================================================================================================
     	 <<- FTP ->> ftpDownload: download all remoteFolder files in LocalFolder using FTP protocol
      ====================================================================================================*/
    public static void ftpDownload(UserConnectionDTO usrConnDTO ) throws Exception{
    	Long userId=usrConnDTO.getUserId();
    	String userLogin=usrConnDTO.getUserLogin();
    	String host=usrConnDTO.getHost();
    	int port=usrConnDTO.getPort();
    	String userName=usrConnDTO.getUserName();
    	String password=usrConnDTO.getPassword(); 
		String remoteFolder=usrConnDTO.getRemoteFolder();
		String localFolder=usrConnDTO.getOrdersFolder();
        FTPClient ftpClient = new FTPClient();
        try {
           // ftpClient.connect(host, port);
            try {
            	ftpClient.connect(host, port);

            } catch (Exception e1) {
                try {
                    Thread.sleep(3500L);
                    ftpClient.connect(host, port);
                } catch (InterruptedException e2) {
                    System.out.println("Error in connection");
                }
            }
 
            ftpClient.login(userName, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            FTPFile[] files = ftpClient.listFiles(remoteFolder);
            int i=0;
            for (FTPFile file : files) {
                String fileToDownload=file.getName();
                int index=fileToDownload.lastIndexOf(".");
                String ext="";
                if(index>0)ext=fileToDownload.substring(index+1);
                System.out.println("ext:"+ext);
                i++;
                if (!fileToDownload.equals(".") && !fileToDownload.equals("..") && !file.isDirectory()&&
                	fileToDownload.indexOf(".")>0 && !fileToDownload.endsWith(".")&& ext.length()==3) {
                	String remoteFile =  remoteFolder+fileToDownload;
                	File fileClient=new File(localFolder+userLogin+"/");
                	fileClient.mkdir();                	
                	File downloadFile = new File(localFolder+userLogin+"/"+fileToDownload);
                	UserFilesDownloadedDTO ufdDTO=new UserFilesDownloadedDTO();
                	ufdDTO.setUserId(userId);
                	ufdDTO.setFileName(fileToDownload);
                	boolean existInDB=orderService.isFileDownloaded(ufdDTO);
                	if(!downloadFile.exists()&& !existInDB){
                    	OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(downloadFile));
                    	InputStream inputStream = ftpClient.retrieveFileStream(remoteFile);
                    	
                    	byte[] bytesArray = new byte[1024];
                    	Integer bytesRead = -1;
                    	bytesRead = inputStream.read(bytesArray);
                    	while (bytesRead!=null && bytesRead!= -1) {
                    		outputStream.write(bytesArray, 0, bytesRead);
                    		bytesRead = inputStream.read(bytesArray);
                    	}
                    	boolean ftpSuccess = ftpClient.completePendingCommand();
                    	if (ftpSuccess) {
                    		System.out.println("download:"+fileToDownload+" From --"+userLogin +" --Server By FTP");
                    		orderService.insertUserFilesDownloaded(ufdDTO);
                    	}
                    	                   	
                    	outputStream.close();
                    	inputStream.close();
                	}
                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    	
    }

    /*====================================================================================================
     	  <<- SFTP ->> ftpDownload: download all remoteFolder files in LocalFolder using SFTP protocol
      ====================================================================================================*/
    public static void sftpDownload(UserConnectionDTO usrConnDTO){  
    	Long userId=usrConnDTO.getUserId();
    	String userLogin=usrConnDTO.getUserLogin();
    	String host=usrConnDTO.getHost();
    	int port=usrConnDTO.getPort();
    	String userName=usrConnDTO.getUserName();
    	String password=usrConnDTO.getPassword();
    	String remoteFolder=usrConnDTO.getRemoteFolder();
    	String localFolder=usrConnDTO.getOrdersFolder(); 
    	String newFileDestination=usrConnDTO.getClientOrdersFileMovedFolder();
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
				System.out.println("Session connected.");
				channel = session.openChannel("sftp");
				channel.connect();
				sftpChannel = (ChannelSftp)channel;
			} catch (Exception e) {
				System.err.println("Unable to connect to FTP server."+e.toString());
				throw e;
			}
			sftpChannel.cd(remoteFolder);
			Vector files = sftpChannel.ls(remoteFolder);
			if (files.size() == 0) {
				System.out.println("No files are available for download.");
			}else{
				for (int i=0; i<files.size(); i++) {
					com.jcraft.jsch.ChannelSftp.LsEntry lsEntry =(com.jcraft.jsch.ChannelSftp.LsEntry) files.get(i);
	                int index=lsEntry.getFilename().lastIndexOf(".");
	                String ext="";
	                if(index>0)ext=lsEntry.getFilename().substring(index+1);
	                System.out.println("ext:"+ext);
					if (!lsEntry.getFilename().equals(".") && !lsEntry.getFilename().equals("..") && 
							!lsEntry.getAttrs().isDir()&& lsEntry.getFilename().indexOf(".")>0 && 
							!lsEntry.getFilename().endsWith(".")&& ext.length()==3) {
							System.out.println("Downloading file"+lsEntry.getFilename());
							File fileClient=new File(localFolder+userLogin+"/");
							fileClient.mkdir();
							String outputFileName = localFolder+userLogin+"/"+lsEntry.getFilename();
							File f = new File(outputFileName);
					    	UserFilesDownloadedDTO ufdDTO=new UserFilesDownloadedDTO();
					    	ufdDTO.setUserId(userId);
					    	ufdDTO.setFileName(lsEntry.getFilename());
					    	boolean existInDB=orderService.isFileDownloaded(ufdDTO);
							if(!f.exists()&& !existInDB){
								//add row file download
								//sftpChannel.get(lsEntry.getFilename(), new FileOutputStream(f));
								getFileAndMoveIt(sftpChannel, outputFileName, lsEntry.getFilename(), newFileDestination);
								System.out.println("download:"+lsEntry.getFilename()+" From --"+userLogin +" --Server By SFTP");
								orderService.insertUserFilesDownloaded(ufdDTO);
							}
						}
				}
			}
			try {
				sftpChannel.quit();
			} catch (Exception exc) {
				System.err.println("Unable to disconnect from FTP server. " + exc.toString());
			}
		} catch (Exception e) {
		System.err.println("Error: "+e.toString());
		}
    }

    /*======================================================================================
     	THIS METHOD PERMIT TO GET FILE FROM REMOTE MACHINE AND MOVE IT ON A NEW DESTINATION
      ======================================================================================*/
    public static void getFileAndMoveIt(ChannelSftp sftpChannel,String localFile,String remoteFile,String newFileDestination)throws Exception{
    	if(sftpChannel!=null && !sftpChannel.isConnected()){
        	System.out.println("[loyaltyShell:]problem in sftpChannel connection ssh");
        	return;
    	}
		sftpChannel.get(remoteFile, new FileOutputStream(new File(localFile)));
		if(newFileDestination!=null && !newFileDestination.equals("")){
			InputStream intputStream = new BufferedInputStream(new FileInputStream(localFile));
			sftpChannel.put(intputStream, newFileDestination+remoteFile); 
			sftpChannel.rm(remoteFile);
		}

    }
    
    /*======================================================================================
     			THIS METHOD IS VERY IMPORTANT TO EXECUTE COMMAND IN THE REMOTE MACHINE
      ======================================================================================*/
    public static void loyaltyShell(Session session,String command)throws Exception{
    	if(session!=null && !session.isConnected()){
        	System.out.println("[loyaltyShell:]problem in session connection ssh");
        	return;
    	}
		Channel channel = session.openChannel("exec");
		((ChannelExec)channel).setCommand(command);
        channel.connect();
        channel.run();
        channel.disconnect();
    }
    
    
}
