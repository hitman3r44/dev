package com.loyauty.web;


import java.util.List;

import org.apache.log4j.Logger;



import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.Province;
import com.loyauty.enums.UserType;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.ClientCategoryDTO;

import com.loyauty.service.init.ConfigService;


/**
 * All web constants go in this class.
 * 
 *
 */
public final class WebConstants {

	private static final Logger LOG = Logger.getLogger(WebConstants.class);
	
	// Constants class, no instantiation
	private WebConstants() {};	

	/* Language */
	public static final String ENGLISH_LANGUAGE = "en";
	public static final String FRENCH_LANGUAGE 	= "fr";
	public static final String SPANISH_LANGUAGE = "es";
	
	public static final int ENGLISH_LANGUAGE_ID = 1;
	public static final int FRENCH_LANGUAGE_ID 	= 2;
	public static final int SPANISH_LANGUAGE_ID = 3;
	
	/* Struts s*/
	public static final String STRUTS_LOCALE 			= "WW_TRANS_I18N_LOCALE";
	public static final String STRUTS_LOCALE_REQUEST 	= "request_locale";
	
	/* Game */
	public static final String GAMEID 					= "gameId";
	public static final String SECTION 					= "section";
	public static final int SECTION_NEWS_ID 			= 1;
	public static final int SECTION_CHEATS_ID 			= 2;
	public static final int SECTION_MULTIMEDIA_ID 		= 3;
	public static final int SECTION_EXTRAS_ID 			= 4;
	public static final int SECTION_REVIEWS_3RdPARTY_ID = 5;
	public static final int SECTION_REVIEWS_USER_ID 	= 6;
	public static final int SECTION_UNDEFINED_ID 		= 7;
	
	public static final int DEFAULT_LINK_SOURCE_TYPE 	= 1;
	public static final String DEFAULT_DIRECT_LINK 		= "http://loyauty.com";
	public static final String BLANC_STRING 			= "";
	
	// limit of render result in news and top links
	public static final int DEFAULT_LIMIT_SHOW_TABLE 	= 100;
	// Best logos authorized
	public static final int NUMBER_BEST_IMAGE_AUTHORIZED = 4;
	// File size allowed in bytes
	public static final int PRODUCT_SIZE_ALLOWED 			= 2048000;
	// File size allowed in bytes
	public static final int BRAND_SIZE_ALLOWED 			= 2048000;
	// File size allowed in bytes
	public static final int PROFILE_SIZE_ALLOWED 		= 2048000;
	// File size allowed in bytes
	public static final String PROFILE_IMAGE_NAME	 	= "default_profile.jpg";
	
	// our default ranting site 
	public static final double DEFAULT_RATING_SITE 		= 100;
	/* User */
	
	//Comments
	public static final int COMMENTS_LINK   			= 0;
	public static final int COMMENTS_RATING 			= 1;
	public static final int COMMENTS_NORMAL 			= 2;
	public static final String FRAME 				    = "frame"; 
	public static final String COMMENT_RATING_UP 		= "up";
	public static final String COMMENT_RATING_DOWN 		= "down";
	
	//Content Link
	public static final int CONTENT_MAX_LENGTH 			= 50000;
	
	//page type
	public static final int USER_LIST 				= 1;
	public static final int BRAND_LIST 				= 2;
	public static final int CATEGORY_LIST 			= 3;
	public static final int PRODUCT_LIST 			= 4;
	public static final int MAIN_SPECIFICATION_LIST = 5;
	public static final int BRAND_LIST_VIEW			= 6;
	public static final int CATEGORY_LIST_VIEW		= 7;
	public static final int SPECIFICATION_LIST_VIEW	= 8;
	public static final int USER_LIST_VIEW 			= 9;
	
	// autocompleter max suggestions show
	public static final int AUTOCOMPLETER_MAX_SUGGESTION 	= 6;
	
	//Zero representation
	public static final String ZERO_REPRESENTATION			= "'-'";
	
	// Source 
	public static final int SOURCE_WEBSITE   				= 1;
	public static final int SOURCE_MAGAZINE  				= 2;
	
	// Video 
	public static final int MAX_VIDEO_MIRROR 				= 4;
	public static final int PUBLISH_RANGE_DATE 				= 2;
	public static final float STRING_SIMILARYTIE_PERCENTAGE = 0.9f;
	
	public static final int WIDTH_IMG_SEARCH_PAGE 			= 120; //px
	
	public static final int GENERATE_DISCOUNT_BY_BRAND		= 1;
	public static final int GENERATE_DISCOUNT_BY_CATEGORY	= 2;
	public static final int GENERATE_DISCOUNT_BY_PRODUCT_STATUS =3;
	
	
	public static final int PRICE_TYPE_BRAND			    = PriceType.BRAND_PRICE_SET.getValue();
	public static final int PRICE_TYPE_CATEGORY			    = PriceType.CATEGORY_PRICE_SET.getValue();
	public static final int PRICE_TYPE_MANUEL			    = PriceType.MANUEL_PRICE_SET.getValue();
	
	public static final String MESSAGE_INFO 				= "message_info";
	
	public static final String MESSAGE_LOAD 				= "loaded";
	public static final String MESSAGE_USER 				= "message";
	
	public static final int WIDTH_PRODUCT_MIN				= 500; //px
	public static final int WIDTH_BRAND_MAX					= 550; //px
	
	public static final int PRODUCT_DEFAUTL_THUMBNAIL_WIDTH	= 200; //px
	public static final int BRAND_DEFAUTL_THUMBNAIL_WIDTH   = 135; //px
	public static final int BRAND_DEFAUTL_THUMBNAIL_HEIGHT  = 135; //px
	
	public static final float COVER_LARGE_TRANSFERT_COEFICIENT 	= 1.5f; 
	
	public static final String DEFAULT_ZONE = "zone";	
	
	//Multiplayer information constant
	public static final int MULTIPLAYER_INFO_NONE 			= 1;
	public static final int MULTIPLAYER_INFO_MORE 			= 99;
	public static final int MULTIPLAYER_INFO_UNLIMITED 		= 100;
	public static final int MULTIPLAYER_INFO_MORE_LOCAL 	= 8;
	public static final int MULTIPLAYER_INFO_MORE_ONLINE 	= 48;
	
	//mail constant support
	public static final String MAIL_SUPPORTGAMEJAB_KEY 	    = "support";
	public static final String MAIL_MEDIA_INQUIRY_KEY	    = "media";
	public static final String MAIL_MARKETING_KEY		    = "marketing";
	public static final String MAIL_OTHER_KEY			    = "other";
	
	// list of link type allowed for the user
	public static final String ALL_USER_PERMISSION 			= "permission";
	// list of link type allowed for the user
	public static final String ALL_LINK_TYPE_ALLOWED 		= "linkType";
	//minimum level required for removing link
	public static final int USER_MINIMUM_LEVEL 				= 20;
	//popular region

	//game description delimiter
	public static final String DESCRIPTION_FIRST_DELIMETER  = "|loyauty|";
	public static final String DESCRIPTION_SECOND_DELIMETER	= "==loyauty==";
	
	//Warranty
	public static final String WARRANTY_MONTH_ENG 		= "month";
	public static final String WARRANTY_MONTHS_ENG 		= "months";
	public static final String WARRANTY_YEAR_ENG 		= "year";
	public static final String WARRANTY_YEARS_ENG 		= "years";
	
	public static final String WARRANTY_MONTH_FR 		= "mois";
	public static final String WARRANTY_YEAR_FR 		= "année";
	public static final String WARRANTY_YEARS_FR 		= "ans";
	
	public static final String WARRANTY_DEFECT_FREE_ENG = "Defect free";
	public static final String WARRANTY_DEFECT_FREE_FR 	= "Sans défaut";
	
	/**
	 * <p>
	 * The session scope attribute under which the User object for the currently
	 * logged in user is stored.
	 * </p>
	 */
	public static final String USER 						= "user";
	public static final String NEXTSTEP 					= "nextStep";  // we need it later
	
	/**	 
	 * User's Cookies keys 
	 */
	public static final String USER_LANGUAGE_COOKIE 			= "language";
	public static final String USER_COUNTRY_COOKIE 				= "country";
	public static final String USER_SEARCH_RESULTS_COOKIE 		= "searchResults";
		
	/**
	 * Product Statuses
	 */
	public static final int P_STATUS_AVAILABLE 			= 1;
	public static final int P_STATUS_UNAVAILABLE 		= 2;
	public static final int P_STATUS_DISCONTINUED 		= 3;
	public static final int P_STATUS_DISABLED 			= 4;
	public static final int P_STATUS_CLEAR_OUT 			= 5;
	
	/* Cookies */	
	public static final int SECONDS_PER_YEAR 					= 60*60*24*365;
	
	private static ConfigService configService;
	private static CommonService commonService;
	static {
		try {
			configService = ServiceLocator.getInstance().getConfigService();
			commonService = ServiceLocator.getInstance().getCommonService();
		} catch (ServiceLocatorException e) {
			LOG.error("A problem has happened while looking up the config service.", e);
		}
	}
	
	/**
	 * <p>
	 * Static configuration to locate js, css and images content of the application.
	 * These constants will be referenced in all jsps. By this way we can move this content in another domain.
	 * The loading of these constants will be processed at the application start up from a properties file.
	 * </p>
	 */
	public final static String SCRIPTS_BASE_URL 			= configService.getWebScriptsLocation();
	public final static String CSS_BASE_URL 				= configService.getWebCssLocation();
	public final static String IMAGES_BASE_URL 				= configService.getWebImagesLocation();
	public final static String MEDIA_BASE_URL 				= configService.getWebMediaLocation();
	public final static String BRAND_BASE_URL 				= configService.getPathWebBrandLocation();
	public final static String PRODUCT_BASE_URL 			= configService.getPathWebProductLocation();
	
	public final static String PRODUCT_THUMBNAIL_BASE_URL 	= configService.getPathWebProductThumbnailLocation();
	public final static String BRAND_MINITHUMB_BASE_URL		= configService.getPathWebBrandMinithumbLocation();
	public final static String BRAND_THUMBNAIL_BASE_URL		= configService.getPathWebBrandThumbnailLocation();
	
	public final static String TEMPORARY_LOCAL_URL	= configService.getPathTemporaryLocation();
	
	public final static int	SHOW_TOP_JABBERS_PREVIOUS_MONTH	= 1;
		
	public static UserType[] ALL_USER_TYPE = UserType.values();
	public static Language[] ALL_LANGUAGE = Language.values();
	public static Province[] ALL_PROVINCE = Province.values();
	
	
	static public int getLanguageId(String lang) {
		int res = 0;
		if(lang.equals(ENGLISH_LANGUAGE)) {
			res = ENGLISH_LANGUAGE_ID;
		} 
		else if (lang.equals(FRENCH_LANGUAGE)) {
			res =FRENCH_LANGUAGE_ID;
		}
		else if (lang.equals(SPANISH_LANGUAGE)) {
			res =SPANISH_LANGUAGE_ID;
		}
		return res;
	}
	
	static public String getLanguageStr(int id) {
		String res = null;
		if(id == ENGLISH_LANGUAGE_ID) {
			res = ENGLISH_LANGUAGE;
		} 
		else if (id == FRENCH_LANGUAGE_ID) {
			res =FRENCH_LANGUAGE;
		}
		else if (id == SPANISH_LANGUAGE_ID) {
			res =SPANISH_LANGUAGE;
		}
		return res;
	}
	
	
	
	public static String getUserTypeByTypeId(Integer typeId){
		String result=null;
		for(UserType userT:ALL_USER_TYPE){
			if(userT.getValue()==typeId){
				result=userT.getTypeName();
				break;
			}
		}
		return result;
	} 
	
	
	
	public static String getLanguageById(Integer languageId){
		String result=null;
		for(Language lang:ALL_LANGUAGE){
			if(lang.getValue()==languageId){
				result=lang.getCode();
				break;
			}
		}
		return result;
	}
	
	
	static public String getProvinceById(Long provinceId){
		String result=null;
		for(Province province:ALL_PROVINCE){
			if(Long.valueOf(province.getValue().toString())==provinceId){
				result=province.getProvinceName();
				break;
			}
		}
		return result;
	}
	
	
	
}
