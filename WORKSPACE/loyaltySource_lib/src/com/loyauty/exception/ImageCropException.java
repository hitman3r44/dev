package com.loyauty.exception;


/**
 * 
 * @author Muthanna
 *
 */
public class ImageCropException extends LoyautyException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3870408849535605439L;

	public ImageCropException(String s) {
		super(s);
	}

	public ImageCropException(String s, Exception e) {
		super(s, e);
	}
	
	public ImageCropException(Exception e) {
		super(e);		
	}
	
}
