package com.loyauty.exception;

/**
 * GameJab general exception.
 * @author Muthanna
 *
 */
public class LoyautyException extends Exception {
	
	
	private static final long serialVersionUID = 1123389580484582596L;

	public LoyautyException(String s) {
		super(s);
	}

	public LoyautyException(String s, Exception e) {
		super(s, e);
	}
	
	public LoyautyException(Exception e) {
		super(e);		
	}
	
}
