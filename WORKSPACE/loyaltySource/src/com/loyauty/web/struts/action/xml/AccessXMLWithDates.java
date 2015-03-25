package com.loyauty.web.struts.action.xml;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class AccessXMLWithDates extends LoyautyAction {
	
	public static final String DATE_FORMAT = "MMddyyyy";
	
	private static final long serialVersionUID = 1437865740938553478L;
	

	@Getter @Setter
	private String login;
	
	@Getter @Setter
	private String password;
	
	@Getter @Setter
	private String m;
	
	@Getter @Setter
	private String d;
	
	@Getter @Setter
	private String y;
	
	@Getter @Setter
	private String xmlFileName;

	@Getter @Setter
	private String loginFromDB;
	
	@Getter @Setter
	private String passwordFromDB;	
	
	@Getter @Setter
	private FileInputStream fileInputStream;
		
	private UserService userService;
		
	public String execute() throws Exception {
		
		try {
			
			userService = getServiceLocator().getUserService();
			UserDTO userDTO = userService.authenticateByURL(login);
			
			if (userDTO != null) {
				
				loginFromDB = userDTO.getLogin();
				passwordFromDB = userDTO.getPassword();
				long userID = userDTO.getId();


				System.out.println("[AccessXMLWithDates] loginFromDB: |" + loginFromDB 
						+ "| and passwordFromDB: |" + passwordFromDB 
						+ "| and userID = " + userID
						+ " and m: |" + m 
						+ "| and d = |" + d
						+ "| and y = |" + y + "|");
								
				if (isValidTheDate(d, m, y)) {
				
					if (loginFromDB.equalsIgnoreCase(login) && passwordFromDB.equalsIgnoreCase(password)) {
					
						System.out.println("[AccessXMLWithDates] userID: |" + userID + "|");
					
						String inDir = userDTO.getCode() + (userID*userID + 1) + "_";
						
						String timestamp = y + m + d;
						
						setXmlFileName("catalogUpdates_" + timestamp + ".xml");
						// String location = "C:\\dev\\workspace\\xml\\" + inDir  + "\\catalogUpdates_" + timestamp + ".xml";
						String location = "/usr/apache-tomcat-7.0.27/webapps/xml/" + inDir  + "/catalogUpdates_" + timestamp + ".xml";
					
						System.out.println("[AccessXMLWithDates] xmlFileName: |" + xmlFileName + "| and location: |" + location + "|");
						
						fileInputStream = new FileInputStream(new File(location));
					
						return SUCCESS;
					}
					
				}
							
			}
			
			
		} catch (Exception e) {
			addActionError(getText("loyauty.error.download.xml"));
		}
	    return INPUT;
	}
	
	private boolean isValidTheDate(String day, String month, String year) {
		boolean outcome = false;
		String date = "";
		boolean mayItGoAhead = true;
		if (day != null && month != null && year != null) {
			
			// WE TRIM ALL INPUT-DATA.
			day = day.trim();
			month = month.trim();
			year = year.trim();
			
			// THE DAY.
			if (day.matches("^\\d*$")) {
				if (day.length() >= 1 && day.length() <= 2) {
					int ddd = Integer.parseInt(day);
					if (ddd >= 1 && ddd <= 31) {
						if (day.length() == 1) {
							day = "0" + day;
						}						
					} else {
						return false;
					}
					mayItGoAhead &= true;
				} else {
					return false;
				}
			} else {
				return false;
			}
			
			// THE MONTH.
			if (month.matches("^\\d*$")) {
				if (month.length() >= 1 && month.length() <= 2) {
					int mmm = Integer.parseInt(month);
					if (mmm >= 1 && mmm <= 12) {
						if (month.length() == 1) {
							month = "0" + month;
						}
					} else {
						return false;
					}
					mayItGoAhead &= true;
				} else {
					return false;
				}
			} else {
				return false;
			}
			
			// THE YEAR.
			if (year.matches("^\\d*$")) {
				int yyy = Integer.parseInt(year);
				Calendar cal = Calendar.getInstance();
				int yearWeAreNow = cal.get(Calendar.YEAR);
				if (year.length() == 4) {
					if (yyy < 2013 || yyy > yearWeAreNow) {
						return false;
					}
					mayItGoAhead &= true;
				} else if (year.length() == 2) {
					yearWeAreNow -= 2000;
					if (yyy >= 13 && yyy <= yearWeAreNow ) {
						year = "20" + year;
						mayItGoAhead &= true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}			
			
			// PUTTING ALL TOGETHER.
			date = month + day + year;
			System.out.println("[AccessXMLWithDates] [isValidTheDate() method] date: |" + date + "|");
			outcome = (mayItGoAhead) ? isDateValid(date) : outcome;		
		}			
		return outcome;			
	}
	
	private boolean isDateValid(String date) {
		try {
			DateFormat df = new SimpleDateFormat(DATE_FORMAT);
			df.setLenient(false);
			df.parse(date);
			return true;			
		} catch (ParseException px) {
			return false;			
		}
	}
	
}
