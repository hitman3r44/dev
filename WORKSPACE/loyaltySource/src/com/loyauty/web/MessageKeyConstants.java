package com.loyauty.web;

/**
 * All message Key constants in relation to web pages go in this class.
 * 
 * @author Arnaud
 *
 */
public final class MessageKeyConstants {

	// Constants class, no instantiation
	private MessageKeyConstants() {};	

	/*
	 * Start of message Key which will be used by the base Action struts class LoyaltyAction to find out dynamically the right header information message key for each inherited Action.
	 * This message key start will be follow by the complete name of each inherited action.(see LoyaltyAction class) 
	 */
	public static final String PAGE_HEADER_KEY = "loyauty.page.header";
	/*
	 * Start message Key for title header
	 */
	public static final String PAGE_HEADER_TITLE_KEY = PAGE_HEADER_KEY + ".title";
	/*
	 * Start message Key for meta keywords header
	 */
	public static final String PAGE_HEADER_KEYWORDS_KEY = PAGE_HEADER_KEY + ".keywords";
	/*
	 * Start message Key for meta description header
	 */
	public static final String PAGE_HEADER_DESCRIPTION_KEY = PAGE_HEADER_KEY + ".description";
	
}
