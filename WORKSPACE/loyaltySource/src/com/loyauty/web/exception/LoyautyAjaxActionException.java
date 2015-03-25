package com.loyauty.web.exception;

/**
 * @author Arnaud
 * loyauty Ajax Action general exception
 */
public class LoyautyAjaxActionException extends LoyautyActionException {

	private static final long serialVersionUID = 6152116410132084933L;

	public LoyautyAjaxActionException(String s) {
		super(s);
	}

	public LoyautyAjaxActionException(String s, Exception e) {
		super(s, e);
	}
	
	public LoyautyAjaxActionException(Exception e) {
		super(e);		
	}
}
