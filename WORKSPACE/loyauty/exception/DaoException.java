package com.loyauty.exception;


/**
 * 
 * @author Muthanna
 *
 */
public class DaoException extends LoyautyException {

	private static final long serialVersionUID = 725329026607947255L;

	public DaoException(String s) {
		super(s);
	}

	public DaoException(String s, Exception e) {
		super(s, e);
	}
	
	public DaoException(Exception e) {
		super(e);		
	}
	
}
