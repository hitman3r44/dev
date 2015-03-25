/*
 * This class takes care of generating meaningful and friendly URLs.
 * the generated URLs  are then passed through a global url rewriting filter to be matched via regular expressions. 
 * @author Muthanna SHOUFI muthanna@gameaccess.ca
 */

package com.loyauty.web.util;

import com.loyauty.util.text.StringUtils;

public final class SeoUrlsMaker {	
	
	private static final String URL_SEPARATOR 			= "-";
	private static final String URL_TERMINATOR 			= ".htm";
	private static final String URL_SUBMENU_INDICATOR 	= "T";
	private static final String URL_SHOWNEW 			= "showNews";
	private static final String URL_SHOWCHEAT 			= "showLink";
	private static final String URL_SHOWMULTIMEDIA 		= "showMultimedia";
	private static final String URL_SHOWEXTRA 			= "showExtras";
	private static final String URL_SHOWRATE 			= "showRate";
	private static final String URL_SHOW3RDPARTY 		= "show3RdParty";
	private static final String URL_PUBLISHER 			= "Publisher";
	private static final String URL_DEVELOPER 			= "developer";
	private static final String URL_PLATFORMAVAILABEL	= "platformAvailable";
	private static final String URL_GAMES				= "Games";
	private static final String URL_FRANCHISE			= "Franchise";
	private static final String URL_ALL_GAMES			= "allGames";
	private static final String HASH_FRAGMENT			= "#!";
	
	
	/**
	 * Checks if a given url is in a valid rewritten format 
	 * @param url
	 * @return true or false.
	 */
	public static boolean isValidRewrittenURL(String url){
   	 if(url != null){
   	  
      	  return (url.indexOf("index.jsp") != -1);        	  
        }
        
   	 return false;
    }
	
		  
	/**
	 * Returns the final format of the rewritten url depending on the passed language parameter. 
	 * @param url the generated url.
	 * @param lang the language in which we are generating the url.
	 * @return the final url to be rewritten.
	 */
	private static String getFinalURL(String url, String lang){
		if(lang != null && lang.equalsIgnoreCase("fr")){
			return translateUrl(url);	
			}
			return url;
	}
	
	
	/**
	 * Generates the game page url
	 * @param consoleName
	 * @param gameName
	 * @param gameDescID
	 * @param lang
	 * @return
	 */
	public static String getProductUrl(String brand, String productName, long productId ){
		return getProductUrl(brand, productName, productId, null);
	}	 
	
	public static String getProductUrl(String brand, String productName, long productId, String lang) {
		StringBuffer sb =new StringBuffer();
		sb.append(stripToCharsAndNumbersOnly(brand,true));
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(productName));
		sb.append(URL_SEPARATOR);
		sb.append(productId);
		sb.append(URL_TERMINATOR);
		sb.append(HASH_FRAGMENT);
		
		return getFinalURL(sb.toString(), lang);
	}

	public static String getCategoryGroupUrl(String categoryGroupName) {
		return getCategoryGroupUrl(categoryGroupName, null);
	}
	
	public static String getCategoryGroupUrl(String categoryGroupName, String lang) {
		StringBuffer sb =new StringBuffer();
		sb.append(stripToCharsAndNumbersOnly(categoryGroupName, true));
		sb.append(URL_TERMINATOR);
		sb.append(HASH_FRAGMENT);
		
		return getFinalURL(sb.toString(), lang);
	}
	
	public static String getCategoryUrl(String categoryGroupName, String categoryName, long categoryId) {
		return getCategoryUrl(categoryGroupName, categoryName, categoryId, null);
	}	
	
	public static String getCategoryUrl(String categoryGroupName, String categoryName, long categoryId, String lang) {
		StringBuffer sb =new StringBuffer();
		sb.append(stripToCharsAndNumbersOnly(categoryGroupName, true));
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(categoryName, true));
		sb.append(URL_SEPARATOR);		
		sb.append(categoryId);
		sb.append(URL_TERMINATOR);
		sb.append(HASH_FRAGMENT);
		
		return getFinalURL(sb.toString(), lang);
	}
	
	public static String getSpecificationUrl(String categoryGroupName, String categoryName, String specificationName, long specificationId) {
		return getSpecificationUrl(categoryGroupName, categoryName, specificationName, specificationId, null);
	}	
	
	public static String getSpecificationUrl(String categoryGroupName, String categoryName, String specificationName, long specificationId, String lang) {
		StringBuffer sb =new StringBuffer();
		sb.append(stripToCharsAndNumbersOnly(categoryGroupName, true));
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(categoryName, true));
		sb.append(URL_SEPARATOR);		
		sb.append(stripToCharsAndNumbersOnly(specificationName, true));
		sb.append(URL_SEPARATOR);
		sb.append(specificationId);
		sb.append(URL_TERMINATOR);
		sb.append(HASH_FRAGMENT);
		
		return getFinalURL(sb.toString(), lang);
	}
	
	public static String getBrandUrl(String brand, long brandId) {
		return getBrandUrl(brand, brandId, null);
	}	
	
	public static String getBrandUrl(String brand, long brandId , String lang) {
		StringBuffer sb =new StringBuffer();
		sb.append(stripToCharsAndNumbersOnly(brand,true));
		sb.append(URL_SEPARATOR);
		sb.append(brandId);
		sb.append(URL_TERMINATOR);
		sb.append(HASH_FRAGMENT);
		
		return getFinalURL(sb.toString(), lang);
	}
	
	public static String getGamePageForPlatformUrl(String consoleName, long platformId , String lang){
		StringBuffer sb =new StringBuffer();
		sb.append(URL_ALL_GAMES);
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(consoleName.replace("-", "").replace("&", "")));
		sb.append(URL_SEPARATOR);
		sb.append(platformId);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), lang);
	}
	
	public static String getLinkNewsUrl(long gameId, long linkId, int type, String gameName, String platformName, String title, String typeName ){
		StringBuffer sb =new StringBuffer();
		sb.append(StringUtils.cleanUrlFromSpecialChars(gameName));
		sb.append(URL_SEPARATOR);
		sb.append(StringUtils.cleanUrlFromSpecialChars(typeName));
		sb.append(URL_SEPARATOR);
		sb.append(StringUtils.cleanUrlFromSpecialChars(platformName));
		sb.append(URL_SEPARATOR);
		sb.append(StringUtils.cleanUrlFromSpecialChars(title));
		sb.append(URL_SEPARATOR);
		sb.append(gameId);
		sb.append(URL_SEPARATOR);
		sb.append(linkId);
		sb.append(URL_SEPARATOR);
		sb.append(type);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), null);
	}	
	
	public static String getLinkUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOWNEW,gameId, linkId, null, type);
	}	
	
	public static String getLinkUrl(long gameId, long linkId, int type, String gameName, String platformName, String typeName ){
		StringBuffer sb =new StringBuffer();
		sb.append(StringUtils.cleanUrlFromSpecialChars(gameName));
		sb.append(URL_SEPARATOR);
		sb.append(StringUtils.cleanUrlFromSpecialChars(typeName));
		sb.append(URL_SEPARATOR);
		sb.append(StringUtils.cleanUrlFromSpecialChars(platformName));
		sb.append(URL_SEPARATOR);
		sb.append(gameId);
		sb.append(URL_SEPARATOR);
		sb.append(linkId);
		sb.append(URL_SEPARATOR);
		sb.append(type);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), null);
	}	
	
	public static String getLinkCheatsUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOWCHEAT,gameId, linkId, null, type);
	}	
	
	public static String getLinkMultimediaUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOWMULTIMEDIA,gameId, linkId, null, type);
	}	
	
	public static String getLinkExtrasUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOWEXTRA,gameId, linkId, null, type);
	}	
	
	public static String getLinkRateUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOWRATE,gameId, linkId, null, type);
	}	
	
	public static String getLink3RdPartyUrl(long gameId, long linkId, int type ){
		return getLinkGameUrl(URL_SHOW3RDPARTY,gameId, linkId, null, type);
	}	
	
	public static String getLinkGameUrl(String linkType,long gameId, long linkId, String lang, int type){
		StringBuffer sb =new StringBuffer();
		sb.append(linkType);
		sb.append(URL_SEPARATOR);
		sb.append(gameId);
		sb.append(URL_SEPARATOR);
		sb.append(linkId);
		sb.append(URL_SEPARATOR);
		sb.append(type);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), lang);
	}
	

	public static String getUrlGameSearch(String commonName, long searchType){
		StringBuffer sb =new StringBuffer();
		//sb.append(URL_PUBLISHER);
		//sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(commonName, true));
		sb.append(URL_SEPARATOR);
		sb.append(URL_GAMES);
		sb.append(URL_SEPARATOR);
		sb.append(searchType);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), null);
	}
	
	public static String getUrlSeriesGameSearch(String commonName, long searchType){
		StringBuffer sb =new StringBuffer();
		sb.append(commonName); //we do not normalize the name
		sb.append(URL_SEPARATOR);
		sb.append(URL_GAMES);
		sb.append(URL_SEPARATOR);
		sb.append(searchType);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), null);
	}
	
	public static String getPlatformAvailableUrl(long commonId){
		StringBuffer sb =new StringBuffer();
		sb.append(URL_PLATFORMAVAILABEL);
		sb.append(URL_SEPARATOR);
		sb.append(commonId);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), null);
	}
	
	/**
	 * Generates games result sorting urls.
	 * @param consoleName
	 * @param categoryValue
	 * @param sortingBy
	 * @param genre
	 * @param lang
	 * @return
	 */	 
	public static String getGamesSortingUrlRental(String consoleName, String categoryValue, String sortingBy,  int genre, String lang){
		return getGamesSortingUrl(consoleName, categoryValue, sortingBy, genre, lang, 1);
	}
	
	/**
	 * Generates games result sorting urls.
	 * @param consoleName
	 * @param categoryValue
	 * @param sortingBy
	 * @param genre
	 * @param lang
	 * @return
	 */
	public static String getGamesSortingUrlStore(String consoleName, String categoryValue, String sortingBy,  int genre, String lang){
		return getGamesSortingUrl(consoleName, categoryValue, sortingBy, genre, lang, 2);
	}
	
	public static String getGamesSortingUrl(String consoleName, String categoryValue, String sortingBy,  int genre, String lang, int mode){
		StringBuffer sb = new StringBuffer();		
		sb.append(URL_SEPARATOR);	
		sb.append(stripToCharsAndNumbersOnly(consoleName));
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(categoryValue));
		sb.append(URL_SEPARATOR);
		sb.append(sortingBy);
		sb.append(URL_SEPARATOR);
		sb.append(genre);
		sb.append(URL_TERMINATOR);
		
		return getFinalURL(sb.toString(), lang);		
	}	
	

	/**
	 * Generates multimedia pages urls.
	 * @param consoleName
	 * @param gameName
	 * @param mediaName
	 * @param gameDescID
	 * @param type
	 * @param lang
	 * @return
	 */
	public static String getMultimediaPageUrl(String consoleName, String gameName, String mediaName, String gameDescID, int type, String lang){
		return getMultimediaPageUrl(consoleName, gameName, mediaName, gameDescID, type, lang, 2);
	}
	
	public static String getMultimediaPageUrl(String consoleName, String gameName, String mediaName, String gameDescID, int type, String lang, int mode){
		StringBuffer sb = new StringBuffer();		
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(consoleName));
		sb.append(URL_SEPARATOR);
		sb.append(stripToCharsAndNumbersOnly(gameName,true));
		sb.append(URL_SEPARATOR);
		sb.append(mediaName);
		sb.append(URL_SEPARATOR);
		sb.append(gameDescID);
		if(!mediaName.equalsIgnoreCase("boxshot")){
		sb.append(URL_SEPARATOR);
		sb.append(type);
		}
		sb.append(URL_TERMINATOR); 
		
		return getFinalURL(sb.toString(), lang);
	}
	
	/**
	 * Translates urls from English to French and vice versa.
	 * It's called from SwitchLanguage action.
	 * @param url
	 * @return
	 */
	public static String translateUrl(String url){
		return url;
	}
	
	/**
	 * 
	 * I use this function to process the string and remove the spaces
	 * and replace for others character in order to create the link.
	 * 
	 * @param s
	 * @return
	 */
	public static String stripToCharsAndNumbersOnly(String s){
		return stripToCharsAndNumbersOnly(s, true); 
	}
	
	public static String stripToCharsAndNumbersOnly(String s,boolean replaceSpacesByAnotherChar){
	      String alphanum_in_acct_num = "" ;
	      //s = s.toLowerCase();
	      if(replaceSpacesByAnotherChar){	    	  
	    	  s = s.trim();
	    	  s = s.replace(" ", "+");
	    	  s = s.replaceAll("-", "+");
	    	  s = s.replaceAll("'", "");	    	  
	      }
	      for (int i=0 ;i < s.length(); i++)
	      { //It is not possible to put s.charAt(i) == '/' It doesn't work
	        if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || 
	        	(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||	        		
	        		s.charAt(i) == '_' || s.charAt(i) == '&' || 
	        		s.charAt(i) == '!' || s.charAt(i) == '\'' || s.charAt(i) == '.' || 
	        		s.charAt(i) == '-' || s.charAt(i) == '”' || s.charAt(i) == '+')
	        {
	             alphanum_in_acct_num = alphanum_in_acct_num.concat(String.valueOf(s.charAt(i)));
	        }
	      }
	      return alphanum_in_acct_num ;
	   }
	
	
	public static String replace(String container, String theName, String theValue){
	      StringBuffer finalString = new StringBuffer();
	      if((container != null) && (theName != null) && (theValue != null))
	      {
	         // mark that we were last at the beginning
	         int last = 0;
	         // find the first occurance
	         int pos = container.indexOf(theName);
	         // while there are occurances that have not been replaced
	         while(pos != -1){
	            //add to string from the beginning to the point where theName starts
	            finalString.append(container.substring(last, pos));
	            //paste in the new string
	            finalString.append(theValue);
	            // mark where we last were
	            last = pos+theName.length();
	            // find the next occurance
	            pos = container.indexOf(theName, last);
	         }

	         // write out the rest of the string if needed
	         if(container.length() > last){
	            finalString.append(container.substring(last));
	         }
	      }
	      return(finalString.toString());
	   }
	
}