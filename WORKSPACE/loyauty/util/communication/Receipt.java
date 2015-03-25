/**
 * Utility class to regroup email manipulation common methods.
 * 
 * @author MJGP
 *
 */

package com.loyauty.util.communication;



import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.loyauty.util.communication.Mail;
import com.loyauty.enums.Language;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;

import com.loyauty.service.ServiceLocator;
import com.loyauty.util.constant.BackEndConstants;
import com.loyauty.util.date.TimeAndDate;
import com.loyauty.util.io.FileUtils;
import com.loyauty.util.text.StringUtils;

public class Receipt {

	public static final int LANGUAGE_ENGLISH					= 1;
	public static final int LANGUAGE_FRENCH						= 2;
	public static final String GAME_TITLE 						= "#GAME_TITLE#";
	public static final String REVIEW_TITLE 					= "#REVIEW_TITLE#";
	public static final String REVIEW_BODY 						= "#REVIEW_BODY#";
	public static final String templatePath 					= new String( FileUtils.GAMEJAB_ROOT_PATH + "/communication/templates/");
	public static final String englishTemplatePath 				= new String(FileUtils.GAMEJAB_ROOT_PATH	+ "/communication/templates/");
	public static final String frenchTemplatePath 				= new String(FileUtils.GAMEJAB_ROOT_PATH + "/communication/templates/french/");
	public static final String passwordRequestTemplate 			= new String("email_password.html");
	public static final String signUpMembership		 			= new String("email.html");
	public static final String tellAFriendTemplate 				= "tellAFriend.txt";
	public static final String tellAFriendHTMLTemplate 			= "tellAFriend.html";
	public static final String tellAFriendFrenchTemplate 		= "tellAFriend_fr.txt";
	public static final String tellAFriendFrenchHTMLTemplate 	= "tellAFriend_fr.html";

	public static final int MAIL_ON_SENT_GAMES_SETTING = 1;
	public static final int MAIL_ON_RECEIVE_GAMES_SETTING = 2;

	public Receipt() {
	}

	private static String toDdMmmYyyy(TimeAndDate date, String lang) {

		String[] enMonths = { "", "January", "February", "March", "April",
				"May", "June", "July", "August", "September", "October",
				"November", "December" };
		String[] frMonths = { "", "Janvier", "Février", "Mars", "Avril", "Mai",
				"Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre",
				"Décembre" };

		int d, m, y;
		d = date.get(Calendar.DATE);
		m = date.get(Calendar.MONTH) + 1;
		y = date.get(Calendar.YEAR);

		return d + "-"
				+ ((lang.equalsIgnoreCase("fr")) ? frMonths[m] : enMonths[m])
				+ "-" + y;
	}


	public static boolean tellAFriend(String senderName, String customerID,
			String senderEmail, String recipientFirstName,
			String recipientEmail, String lang) {

		String subject;

		Hashtable keyValue = new Hashtable();
		keyValue.put("#NAME#", recipientFirstName);
		keyValue.put("#REFERAL_ID#", customerID);
		keyValue.put("#SENDER_FIRST_NAME#", senderName);

		// -----------
		// .. CONSTRUCT AND MAIL
		// -----------

		File receiptFile = null;
		File receiptFileHTML = null;

		if (lang.equalsIgnoreCase("fr")) {
			subject = "GameJab - Message de " + senderName;
			receiptFile = new File(templatePath + tellAFriendFrenchTemplate);
			receiptFileHTML = new File(templatePath
					+ tellAFriendFrenchHTMLTemplate);
		} else {
			subject = "GameJab - Message from " + senderName;
			receiptFile = new File(templatePath + tellAFriendTemplate);
			receiptFileHTML = new File(templatePath + tellAFriendHTMLTemplate);
		}

		String emailBodyHTML = StringUtils.replaceFileWithHashTable(
				receiptFileHTML, keyValue);
		String emailBody = StringUtils.replaceFileWithHashTable(receiptFile,
				keyValue);

		System.out.println(emailBody);
		// send(String toWhom [], String fromWhom, String subject, String body,
		// File theFile, String htmlString)
		boolean success = Mail.send(new String[] { recipientEmail },
				senderEmail, subject, emailBody, null, emailBodyHTML);

		return (success);
	}



	public static boolean gameAddedAutomaticallyInGamejab(Map<Long, String> map) {
		
		String toWhom[];
		try {
			toWhom = ServiceLocator.getInsance().getConfigService().getMailGamejabSupport();
			String from = ServiceLocator.getInsance().getConfigService().getMailFromWebmaster();
			StringBuilder subject = new StringBuilder();
			subject.append("Game Treated by GAMEJAB-SYSTEM");					
			StringBuilder sb = new StringBuilder();
			sb.append("Date : " + new Date() + "\n");
			sb.append("liste game of the week treated automatically by loyauty : \n");	
			for(Map.Entry<Long, String> entry : map.entrySet()){
				sb.append("gameId: ");  
				sb.append(entry.getKey());
				sb.append(" - ");
				sb.append(entry.getValue());
				sb.append("\n");
			}					
			Mail.send(toWhom, from, subject.toString(), sb.toString());
		
			return true;
		
		} catch (ServiceLocatorException e) {
			e.printStackTrace();
		}
				
		return false;
		
	}
	
	public static void main(String args[]) {
		
		 /*User user = new User();
		 user.setLogin("manuel");
		 user.setPassword("a123456");
		 user.setEmail("manuel@gameaccess.ca");
		 UserProfile userProfile =  new UserProfile();
		 userProfile.setRealName("a a");
		 userProfile.setPrimaryLanguage(Language.ENGLISH);
		 user.setUserProfile(userProfile);
		 
		 Receipt.signUpMembership(user);*/
		 
		// theCustomer.selectFromID(1);
		// sendReceipt(theCustomer, theSubscription);
		// Mail.send("jerry@inteligan.com", "Registration Details:Page 1 Sign up
		// Page 1 Validation Success : From Jerry", "Test");
		// theCustomer.setFirstName("Clyde");
		// theCustomer.setLastName("Jones");

		/*
		 * theCustomer.selectFromID(1); theGameDesc.selectFromID(4031);
		 * 
		 * gameSent(theCustomer, theGameDesc);
		 */
		// theCustomer.setEmail("sandeep.mys@gmail.com");
		// theSubscription.setID(777);
		// Receipt.cardDeclineNotification(theCustomer);
		// Receipt theReceipt = new Receipt();
		// theReceipt.sendReceipt(theCustomer, theSubscription);
		// Mail.send("prince.nishchal@gmail.com", "Test Mail", new
		// File(frenchTemplatePath+monthlyPurchaseReceipt));
		// Mail.send("frank@GameJab", "Test Mail", new
		// File(frenchTemplatePath+standardPurchaseReceipt));
		// Mail.send("karl@GameJab", "Test Mail", new
		// File(frenchTemplatePath+standardPurchaseReceipt));
		// Mail.send("prince.nishchal@gmail.com", "Test Mail", new
		// File(frenchTemplatePath+standardPurchaseReceipt));
		// Mail.send("frank@GameJab", "Test - Free Trial Mail", new
		// File(englishTemplatePath+standardPurchaseReceipt));
		// Mail.send("karl@GameJab", "Test - Free Trial Mail", new
		// File(englishTemplatePath+standardPurchaseReceipt));
		// Mail.send("prince.nishchal@gmail.com", "Test - Free Trial Mail", new
		// File(englishTemplatePath+standardPurchaseReceipt));
		// Mail.send("frank@GameJab", "Test - Monthly Mail", new
		// File(englishTemplatePath+monthlyPurchaseReceipt));
		// Mail.send("karl@GameJab", "Test - Monthly Mail", new
		// File(englishTemplatePath+monthlyPurchaseReceipt));
		// Mail.send("prince.nishchal@gmail.com", "Test - Monthly Mail", new
		// File(englishTemplatePath+monthlyPurchaseReceipt));
		// 
	}

	public static String getTemplatePath(Language language) {
		//if (language.getValue() == LANGUAGE_FRENCH)
		//	return frenchTemplatePath;
		//else
			return englishTemplatePath;
	}
	
	public static boolean passwordRequest(User user) {
		Language languageUser = user.getPrimaryLanguage();
		String templatePath = getTemplatePath(languageUser);

		Hashtable<String,String> keyValue = new Hashtable<String,String>();
		//keyValue.put("#FIRSTNAME#", user.getUserProfile().getRealName());
		keyValue.put("#LOGIN#", user.getLogin());
		keyValue.put("#PASSWORD#", user.getPassword());
		
		String subject = "GameJab - Password Request";
		if (languageUser.getValue() == LANGUAGE_FRENCH)
			subject = "GameJab - Demande de mot de passe";

		File receiptFile = new File(templatePath + passwordRequestTemplate);
		String emailBody = StringUtils.replaceFileWithHashTable(receiptFile,
				keyValue);

		System.out.println(emailBody);
		StringBuffer htmlStr = new StringBuffer(emailBody);

		boolean success = Mail.send(user.getEmail(), subject, emailBody, htmlStr);

		return (success);
	}
}
