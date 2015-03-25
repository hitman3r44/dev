package com.loyauty.exception;


/**
 * 
 * @author Muthanna
 *
 */
public class ServiceLocatorException extends LoyautyException {

	private static final long serialVersionUID = -7151158236549019001L;

	public ServiceLocatorException(String s) {
		super(s);
	}

	public ServiceLocatorException(String s, Exception e) {
		super(s, e);
	}
	
	public ServiceLocatorException(Exception e) {
		super(e);		
	}
	
}
