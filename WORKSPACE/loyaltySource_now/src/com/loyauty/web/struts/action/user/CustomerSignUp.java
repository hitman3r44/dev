package com.loyauty.web.struts.action.user;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.struts.action.LoyautyActionWeb;


public class CustomerSignUp  extends LoyautyActionWeb{

	private static final long serialVersionUID = -755756889534608662L;
	/*
	 * Form field
	 */
	@Getter @Setter
	private String companyName;
	@Getter @Setter
	private String programName;
	@Getter @Setter
	private String programUrl;
	@Getter @Setter
	private String programType;
	@Getter @Setter
	private String programTypeOther;
	@Getter @Setter
	private String yearsActive;
	@Getter @Setter
	private String numberOfMembers;
	@Getter @Setter
	private String averageMonthlyRedemption;
	@Getter @Setter
	private String averageRedemptionPrice;
	@Getter @Setter
	private String monthlyTotal;
	@Getter @Setter
	private String briefProgramDescription;
	@Getter @Setter
	private String brandsInterestedIn;
	@Getter @Setter
	private String contact;
	@Getter @Setter
	private String phone;
	@Getter @Setter
	private String ext;
	@Getter @Setter
	private String jobTitle;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private String fullAddress;
	@Getter @Setter
	private Integer sendNewAccountRequest;
	@Getter @Setter
	private String showSaveSuccessPop;
	@Getter @Setter
	private String showNotificationMissingFieldsPop;
	@Getter @Setter
	private String msg;	
	private static final String EMAIL = "reports@loyaltysource.com";
	private static final String SMTP_HOST = "mail.gameaccesscash.com";
	private static final String SMTP_PORT = "465";

	
	public CustomerSignUp() throws ServiceLocatorException {
		
	}
	
	@Override
	public String execute() throws Exception {
		showSaveSuccessPop="visibility:hidden;display:none;";
		showNotificationMissingFieldsPop="visibility:hidden;display:none;";
		//when user Clicks Send Request button sendNewAccountRequest=1
		if(sendNewAccountRequest!=null && sendNewAccountRequest!=-1){
		 boolean result = validateFormFields();
		 	if(result){
		 		String subject  = "LoyaltySource- New Account Request From " + companyName;

		 		Properties properties = new Properties();
				properties.put("mail.smtp.host", SMTP_HOST);
				properties.put("mail.smtp.socketFactory.port", SMTP_PORT);
				properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
				properties.put("mail.smtp.port", SMTP_PORT);
		 		StringBuilder builder = new StringBuilder();
		 		msg="";
		      try{
					Session session = Session.getInstance(properties);
							
					// Define message
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(EMAIL));
					message.addRecipient(Message.RecipientType.TO,new InternetAddress(EMAIL));
					message.setSubject(subject);
					// Create the message part
					BodyPart messageBodyPart = new MimeBodyPart();
					// Now set the actual message
					builder = createMessageBody();
					messageBodyPart.setContent(builder.toString(), "text/html");
			          
					Multipart multipart = new MimeMultipart();
					multipart.addBodyPart(messageBodyPart);
					
					// Put parts in message
					message.setContent(multipart);
					
					// Send the message
					Transport.send(message);
					msg="Your Request was Sent Successfully";
					showSaveSuccessPop="display:block;visibility:visible;";
					return SUCCESS;
		      }catch (MessagingException e) {
		    	  msg="The system encountered a problem and could not send your request.";
		          showSaveSuccessPop="display:block;visibility:visible;";
		          log.debug("MessagingException when emailing data");
		    	  e.printStackTrace();
		    	  return "input";
		      }	
			}
		 	else{
				msg="Please fill all fields.";
				showNotificationMissingFieldsPop="display:block;visibility:visible;";
				return SUCCESS;	
			}
		}
		return SUCCESS;
	}

	private boolean validateFormFields() {
		boolean res = true;
		if( companyName == null || companyName.equals("") || programName==null || programName.equals("") ||
			programUrl == null || programUrl.equals("") ||((programType==null || programType.equals("")) &&((programTypeOther==null || programTypeOther.equals("")))) || 
			yearsActive == null || yearsActive.equals("") || numberOfMembers==null || numberOfMembers.equals("") ||
			averageMonthlyRedemption == null || averageMonthlyRedemption.equals("") || averageRedemptionPrice==null || averageRedemptionPrice.equals("") ||
			monthlyTotal == null || monthlyTotal.equals("") || briefProgramDescription==null || briefProgramDescription.equals("") ||
			brandsInterestedIn == null || brandsInterestedIn.equals("") || contact==null || contact.equals("") ||
			phone == null || phone.equals("") || jobTitle==null || jobTitle.equals("") || email==null || email.equals("") || fullAddress == null || fullAddress.equals("")){
			res=false;
		}
		return res;
	}
	
	private StringBuilder createMessageBody() {
    	StringBuilder sb = new StringBuilder();
    	
    	sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head><title>YOU HAVE A NEW ACCOUNT REQUEST</title></head>");
		sb.append("<body>");
		sb.append("<br><left><font color=blue>Hello,</font></br>");
		sb.append("<br><left><font color=blue>Greetings!!!</font></br>");
		sb.append("<br><font color=blue>We have a new Account request.</font></br>");
		sb.append("<p style=\"text-indent:250px;\"><font color=blue size=4><b><i><u>Details of the new account request are as below </u></b></font></p></br>");
		sb.append("<table align=center style=\"border-left: 2px solid #CCCCCC; border-right: 2px solid #CCCCCC;border-bottom: 2px solid #CCCCCC;border-top: 2px solid #CCCCCC;background-color:#FFFFE0;\"  width=80% cellpadding=3 cellspacing=3>");
		sb.append("<tr><td width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Company Name :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ companyName +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Program Name :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ programName +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Program Url :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ programUrl +"</td></tr>");
		if(programType!= null && !programType.equals("") && !programType.equals("Other"))
			sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Program Type :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ programType +"</td></tr>");
		else{
			sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Program Type other:</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ programTypeOther +"</td></tr>");
			
		}
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Years Active :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ yearsActive +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Number Of Members :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ numberOfMembers +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Average Monthly Redemption :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ averageMonthlyRedemption +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Average Redemption Price :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ averageRedemptionPrice +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">MonthlyTotal :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ monthlyTotal +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Brief Program Description :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ briefProgramDescription +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Brands Interested In :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ brandsInterestedIn +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Contact Person:</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ contact +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Phone Number - Ext :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ phone + "    ext:" + ext  +"</td></tr>");
		
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Job Tittle :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ jobTitle +"</td></tr>");
		sb.append("<tr><td  width=175 style=\"border-bottom: 1px solid #CCCCCC;\">Email :</td> <td style=\"border-bottom: 1px solid #CCCCCC;\"> "+ email +"</td></tr>");
		sb.append("<tr><td width=175>Full Address :</td> <td> "+ fullAddress +"</td></tr>");
		sb.append("</table>");
		sb.append("<br><left><font color=blue>Thanks</font></br>");
		sb.append("</body>");
		sb.append("</html>");
		return sb;		
	}
	
}
