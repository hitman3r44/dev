package com.loyauty.cronjob;

public class AutoShipping {	
	public static void main(String[] args) {		
			ShippingUtil.consume();
			System.exit(0);
	}
}
