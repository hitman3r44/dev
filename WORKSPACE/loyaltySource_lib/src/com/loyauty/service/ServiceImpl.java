package com.loyauty.service;



/**
 * 
 *
 */
public class ServiceImpl implements Service{

	public ServiceLocator getServiceLocator(){
		return ServiceLocator.getInstance();
	}
	
	public ServiceLocator getServiceLocatorAdmin(){
		return ServiceLocator.getInstance();
	}
}
