package com.loyauty.service;



/**
 * 
 *
 */
public class ServiceImpl implements Service{

	public ServiceLocator getServiceLocator(){
		return ServiceLocator.getInsance();
	}
	
	public ServiceLocator getServiceLocatorAdmin(){
		return ServiceLocator.getInsance();
	}
}
