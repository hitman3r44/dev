package com.loyauty.web.exception;

/**
 * @author Arnaud
 * loyauty Action general exception
 */
public class LoyautyActionException extends Exception {

	private static final long serialVersionUID = -5271672689358802087L;

	public LoyautyActionException(String s) {
		super(s);
	}

	public LoyautyActionException(String s, Exception e) {
		super(s, e);
	}
	
	public LoyautyActionException(Exception e) {
		super(e);		
	}
	
}
