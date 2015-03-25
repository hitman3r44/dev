package com.loyauty.cronjob.xml;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.loyauty.enums.Language;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class MakeXML {
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static ProductService productService;
	
	public static void main(String... args) {
		serviceLocator = ServiceLocator.getInstance();
		List<ClientCategoryDTO> listClientCategory;
		try {
			userService = serviceLocator.getUserService();
			productService = serviceLocator.getProductService();
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			
			XMLGenXProductCatalogEn genXCatalogEn = null;
			XMLGenXProductCatalogFR genXCatalogFr = null;
			
			String whereToWriteIn = "";
			
			/* ===== Time Starting Generating XML Files ===========*/
			Date dateSatrting=new Date();
			Calendar startingCalendar = Calendar.getInstance();
			startingCalendar.clear();
			startingCalendar.setTime(dateSatrting);
			Date dateStartingGenXML=startingCalendar.getTime();
			SimpleDateFormat dateFormatStarting=new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
			String startingTime=dateFormatStarting.format(dateStartingGenXML);
			/* ====================================================*/
			
			
			for (UserSessionDTO userSessionDTO :  userNameList) {
				long userId = userSessionDTO.getId();
				genXCatalogEn = new XMLGenXProductCatalogEn();
				genXCatalogFr = new XMLGenXProductCatalogFR();			
				String inDir = userSessionDTO.getCode() + (userId*userId + 1) + "_";				
				File[] fileEn = new File[2];
				File[] fileFr = new File[2];
				
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				
				//whereToWriteIn = "C:\\dev\\xml\\" + inDir  + "\\catalogUpdates.xml";
				whereToWriteIn = "/usr/apache-tomcat-7.0.27/webapps/xml/" + inDir  + "/catalogUpdates.xml";					
				fileEn[0] = new File(whereToWriteIn);
				
				//whereToWriteIn = "C:\\dev\\xml\\" + inDir  + "\\catalogUpdates_" + sdf.format(cal.getTime()) +  ".xml";
				whereToWriteIn = "/usr/apache-tomcat-7.0.27/webapps/xml/" + inDir  + "/catalogUpdates_" + sdf.format(cal.getTime()) +  ".xml";		
				fileEn[1] = new File(whereToWriteIn);
				
				//whereToWriteIn = "C:\\dev\\xml\\french\\" + inDir  + "\\catalogUpdatesFr.xml";
				whereToWriteIn = "/usr/apache-tomcat-7.0.27/webapps/xml/french/" + inDir  + "/catalogUpdatesFr.xml";					
				fileFr[0] = new File(whereToWriteIn);
				
				//whereToWriteIn = "C:\\dev\\xml\\french\\" + inDir  + "\\catalogUpdatesFr_" + sdf.format(cal.getTime()) +  ".xml";
				whereToWriteIn = "/usr/apache-tomcat-7.0.27/webapps/xml/french/" + inDir  + "/catalogUpdatesFr_" + sdf.format(cal.getTime()) +  ".xml";		
				fileFr[1] = new File(whereToWriteIn);

				UserDTO userDTO = userService.getUserInformation(userId);

				for (int fileIndexEn = 0; fileIndexEn < fileEn.length; fileIndexEn++) {					
					if (!fileEn[fileIndexEn].exists()) {
						fileEn[fileIndexEn].getParentFile().mkdirs();
						new FileWriter(fileEn[fileIndexEn]);
					}
					//If the Currency Rate is changed within the last 24 hours, generate all Product Listing
					if(isGenerateXMLforAllProducts(userDTO)) {
						genXCatalogEn.generateXMLwhenCurrencyChanged(userId, fileEn[fileIndexEn], userSessionDTO.getCode());
					} else {
						genXCatalogEn.generateXML(userId, fileEn[fileIndexEn], userSessionDTO.getCode());
					}
				}

				for (int fileIndexFr = 0; fileIndexFr < fileFr.length; fileIndexFr++) {
					if (!fileFr[fileIndexFr].exists()) {
						fileFr[fileIndexFr].getParentFile().mkdirs();
						new FileWriter(fileFr[fileIndexFr]);
					}
					//If the Currency Rate is changed within the last 24 hours, generate all Product Listing
					if(isGenerateXMLforAllProducts(userDTO)) {
						genXCatalogFr.generateXMLwhenCurrencyChanged(userId, fileEn[fileIndexFr], userSessionDTO.getCode());
					} else {
						genXCatalogFr.generateXMLFR(userId, fileFr[fileIndexFr], userSessionDTO.getCode());
					}
				}
			}
			
			
			long userId = 0L;
			long productId = 0L;
			List<ProductDTO> productDTOList = productService.getProductsAsOfConsideredForXML();
			//Add Templates A,B,C in the userNameList to apply the close methodes on them 
			listClientCategory = userService.getAllClientCategory();
			for (ClientCategoryDTO ccDTO : listClientCategory) {
				userNameList.add(getUserSessionDTO(ccDTO));
			}
			for (UserSessionDTO userSessionDTO :  userNameList) {
				userId = userSessionDTO.getId();
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					productService.closeProductConsideredForXML(productId);
					productService.closeAlterProductXML(productId);
					productService.closeAlterUserProductXML(userId, productId);					
				}
			}
			
			
			/* ===== Duration Time Generating XML Files ===========*/
			Date dateEnding=new Date();
			Calendar endingCalendar = Calendar.getInstance();
			endingCalendar.clear();
			endingCalendar.setTime(dateEnding);
			Date dateEndingGenXML=endingCalendar.getTime();
			SimpleDateFormat dateFormatEnding=new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
			String endingTime=dateFormatEnding.format(dateEndingGenXML);
			/* ====================================================*/
			
			System.out.println("*** Generating XML Product Feed Files ***");
			System.out.println("From: "+startingTime+"   To: "+endingTime);
			
			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	/*====================================================================================
	 		Method "isGenerateXMLforAllProducts" :
	 		Test if the currency Rate for the User is changed within the last 24 hours
	  ====================================================================================*/
	public static Boolean isGenerateXMLforAllProducts(UserDTO userDTO) {
		Boolean result = false;
		Date dateNow = new Date();
		String loginReplink = userDTO.getLogin().replaceAll(" ", "").replaceAll("-", "");
		//Special Case for ReplinkA and ReplinkB;
		if(loginReplink.toUpperCase().equals("REPLINKA") || loginReplink.toUpperCase().equals("REPLINKB")) {
			try {
				CurrencyDTO currencyDTO = new CurrencyDTO();
				currencyDTO.setSymbol("USD");
				currencyDTO = productService.getCurrencyBySymbol(currencyDTO);
				Long miliSecondsOfLastCurrencyUpdate = dateNow.getTime() - currencyDTO.getCreationDate().getTime();
				if(miliSecondsOfLastCurrencyUpdate <= 86400000) result = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//For all other users
		if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1
				&& userDTO.getCurrencyRate()!=null 
				&& userDTO.getCurrencyCreationDate()!=null) {
			Long miliSecondsOfLastCurrencyUpdate = dateNow.getTime() - userDTO.getCurrencyCreationDate().getTime();
			/*
			Double daysOfLastCurrencyUpdate = (double)miliSecondsOfLastCurrencyUpdate/(1000*60*60*24);
			if(daysOfLastCurrencyUpdate <= 24) result = true;
			*/
			//1 day = 86400000 mili-seconds
			if(miliSecondsOfLastCurrencyUpdate <= 86400000) result = true;
		}
		return result;
	}
	
	public static UserSessionDTO getUserSessionDTO(ClientCategoryDTO clDTO){
		Long userId=clDTO.getClientCategoryId();
		String login=clDTO.getClientCategoryName();
		Integer TypeId=2;
		Integer userLangId = 2;
		Integer RESULTS_PER_PAGE=10;
		String email="";
		String code="";
		Boolean isActive=true;
		Long template =1L;
		UserSessionDTO sessionDTO =new UserSessionDTO(userId, login, TypeId, userLangId, Language.ENGLISH.getValue(),
													  RESULTS_PER_PAGE, email, code, isActive,template);
		
		return sessionDTO;
	}
	
}
