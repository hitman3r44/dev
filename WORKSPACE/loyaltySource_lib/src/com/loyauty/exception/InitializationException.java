package com.loyauty.exception;


/**
 * 
 * @author Muthanna
 *
 */
public class InitializationException extends LoyautyException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7641059790046273212L;

	public InitializationException(String s) {
		super(s);
	}

	public InitializationException(String s, Exception e) {
		super(s, e);
	}
	
	public InitializationException(Exception e) {
		super(e);		
	}
	
}
