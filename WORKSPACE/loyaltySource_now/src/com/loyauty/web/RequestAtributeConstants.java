package com.loyauty.web;

/**
 * Request attributes name commonly used in Struts Actions.
 * 
 * @author Arnaud
 *
 */
public final class RequestAtributeConstants {

	// Constants class, no instantiation
	private RequestAtributeConstants() {};	

	
	/**
	 * Request attributes to store value of header title message parameter. 
	 * 1 -> {0}, 2 -> {1}, 3 -> {2},  
	 */
	public static final String PAGE_TITLE_PARAM_1 = "pageTitleParam1";
	public static final String PAGE_TITLE_PARAM_2 = "pageTitleParam2";
	public static final String PAGE_TITLE_PARAM_3 = "pageTitleParam3";
	/**
	 * Request attributes to store value of header keywords message parameter. 
	 * 1 -> {0}, 2 -> {1}, 3 -> {2},  
	 */
	public static final String PAGE_KEYWORDS_PARAM_1 = "pageKeywordsParam1";
	public static final String PAGE_KEYWORDS_PARAM_2 = "pageKeywordsParam2";
	public static final String PAGE_KEYWORDS_PARAM_3 = "pageKeywordsParam3";
	/**
	 * Request attributes to store value of header description message parameter. 
	 * 1 -> {0}, 2 -> {1}, 3 -> {2},  
	 */
	public static final String PAGE_DESCRIPTION_PARAM_1 = "pageDescriptionParam1";
	public static final String PAGE_DESCRIPTION_PARAM_2 = "pageDescriptionParam2";
	public static final String PAGE_DESCRIPTION_PARAM_3 = "pageDescriptionParam3";
	
}
