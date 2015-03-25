package com.loyauty.cronjob.orders;

import java.util.Date;
import java.util.Properties;

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


public class GameaccessSendingEmailTesting{

    /*=================================================================================
										Main Method
      =================================================================================*/
	public static void main(String[] args){
		try {

		    /** set the STMP HELO address **/
		   String SMTP_HELO = "gameaccess.ca";

		    /** set the Mail SMTP Server that we are using */
		    String HOST = "127.0.0.1";
		    //public static final String HOST = "relais.videotron.ca";
		    //public static final String host = new String("mail.reachme.com");
		    //for future ref: mail.reachme.com seems to work (not anymore...)
		    /** set the Mail SMTP port that we are using, null means port 25 */
		    String SMTP_PORT = "25";
			//===========>Create SMTP Session

			
		       // create some properties and get the default Session
	        Properties props = new Properties();
	        // Set the mail.smtp.host property
	        props.put("mail.smtp.host", HOST);
	        // Set the HELO name
	        props.put("mail.smtp.localhost", SMTP_HELO);
	        // Set the smtp port if it exists 
	        props.put("mail.smtp.port", SMTP_PORT);
			
			/*
			String SMTP_HOST = "mail.gameaccesscash.com";
			String SMTP_PORT = "465";
		 	Properties properties = new Properties();
			properties.put("mail.smtp.host", SMTP_HOST);
			properties.put("mail.smtp.socketFactory.port", SMTP_PORT);
			properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			properties.put("mail.smtp.port", SMTP_PORT);*/
		    Session session = Session.getInstance(props);
		    
			sendNotificationEmail(session,"object","message body");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.exit(0);
		}

    }//end of main
  
    
    /*=================================================================================
						Sending notification to support gameaccess and others
      =================================================================================*/
    
    public static void sendNotificationEmail(Session session,String subject,String messageToSend){
    	String mailFrom = "orders@loyaltysource.com";
    	String sendToEmail="hamdoune@loyaltysource.com";
    	String sendTotherEmail="";
    	try {
		    try{
		    	if(sendToEmail==null || sendToEmail.equals(""))return;
				Message message = new MimeMessage(session);
				message.setSentDate(new Date());
				message.setFrom(new InternetAddress(mailFrom));
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(sendToEmail));
				message.setSubject(subject);
				//===========>Create the message part
				BodyPart messageBodyPart = new MimeBodyPart();
				messageBodyPart.setContent(messageToSend, "text/html; charset=ISO-8859-1");
				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(messageBodyPart);
				
				//===========>Put parts in message
				message.setContent(multipart);
				//===========>Send the message to support gameaccess
				if(sendToEmail!=null && !sendToEmail.equals(""))Transport.send(message);
				
				//===========>Sending a copy to other address
				sendToEmail=sendTotherEmail;
				if(sendToEmail!=null && !sendToEmail.equals("")){
					Message message2 = new MimeMessage(session);
					message2.setSentDate(new Date());
					message2.setFrom(new InternetAddress(mailFrom));
					message2.addRecipient(Message.RecipientType.TO,new InternetAddress(sendToEmail));
					message2.setSubject(subject);
					message2.setContent(multipart);
					Transport.send(message2);
				}
				
		      }catch (MessagingException e) {
		    	  System.out.println("[Gameaccess: Sendeing email error First Catch]---------> Probleme when the system try to send email to:"+sendToEmail+" !!!!!!");
		    	  e.printStackTrace();
		      }	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
    
    
}
