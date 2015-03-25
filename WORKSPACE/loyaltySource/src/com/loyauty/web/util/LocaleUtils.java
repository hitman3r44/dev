package com.loyauty.web.util;

import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.log4j.Logger;

//import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;

/**
 * Utils to handle user's Locale.
 *  
 * @author Muthanna
 * 
 * 
 *
 */
public final class LocaleUtils {
	
	private static final Logger log = Logger.getLogger(LocaleUtils.class);
	
	// Utility class, no instantiation
	private LocaleUtils(){};
	
	public static void handleLocale(HttpServletRequest request, boolean detectUserBrowser){
		handleLocale(request, detectUserBrowser, null);
	}
	
	public static void handleLocale(HttpServletRequest request, boolean detectUserBrowser, String language){
		/*
		 *  We check if the session has already been set, thus
		 *  we set the locale one time per session (better performance)
		 */	
		if(language != null){
			// We are changing the language manually
			setSessionLocale(request, language);
			
		}else if(getSessionLocale(request) == null){
			setSessionLocale(request, getDefaultLanguage(request, detectUserBrowser));
		}		
		
	}
	
	/**
	 * Returns the session locale.
	 * @param request
	 * @return
	 */
	private static Locale getSessionLocale(HttpServletRequest request){		
		return (Locale) request.getSession().getAttribute(WebConstants.STRUTS_LOCALE);
	}
	
	/**
	 * Returns the session language.
	 * @param request
	 * @return
	 */
	public static String getSessionLanguage(HttpServletRequest request){
		Locale locale = getSessionLocale(request);
		return (locale != null)?locale.getLanguage():WebConstants.ENGLISH_LANGUAGE;
	}
	
	/**
	 * Gets the language to put in session.
	 * First we check if the user is logged in and has a preference for
	 * site language. If not logged in user, we check if we had set any
	 * cookies and set the session accordingly. Finally, if no
	 * cookies are set, we detect user's browser language.
	 
	 * @param request
	 * @return
	 */
	public static String getDefaultLanguage(HttpServletRequest request, boolean detectUserBrowser){
		String userLanguage = null;
		
		// first try to get language from user profile 
		userLanguage = LoginUtils.getUserLanguage(request);
		
		// Then try to get it from cookie 
		if(userLanguage == null){
			userLanguage = CookieUtils.getCookieValue(request, WebConstants.USER_LANGUAGE_COOKIE);
		}		

		// finally try to get it from browser
		if(userLanguage == null && detectUserBrowser){
			userLanguage = getBrowserLanguage(request);
		}			
				
		return (userLanguage != null) ? userLanguage : WebConstants.ENGLISH_LANGUAGE;	
	}

	/**
	 * Checks the Accept-Language header to see language
	 * preference in user's browser.
	 * @param request
	 * @return
	 */
	public static String getBrowserLanguage(HttpServletRequest request){
		String acceptLanguage = request.getHeader("Accept-Language");
		String language = null;
		if(acceptLanguage != null){
			StringTokenizer tokenizer = new StringTokenizer(acceptLanguage, ",");
		    while (tokenizer.hasMoreTokens()) {
		        // Get the next acceptable language.
		        // (The language can look something like "en; qvalue=0.91")
		        language = tokenizer.nextToken();
		        break;
		      }
		}

		return language;
	}
	
	public static void setSessionLocale(HttpServletRequest request, String language){
		if(log.isDebugEnabled()){
			log.debug("We are setting request_locale to: " + language);		
		}
		
		//request.setAttribute(WebConstants.STRUTS_LOCALE, language);
		// update user in session if we are looged
		if (LoginUtils.isLogged(request)) {
			//UserSessionDTO user = LoginUtils.getUser(request);
			//user.setSiteLangId(WebConstants.getLanguageId(language));
		}
		request.getSession().setAttribute(WebConstants.STRUTS_LOCALE, new Locale(language));
	}
	
	public static String formatDate(Date date, String formatPattern, HttpServletRequest request) {
		return DateFormatUtils.format(date, formatPattern, request.getLocale());
	}
	
}
