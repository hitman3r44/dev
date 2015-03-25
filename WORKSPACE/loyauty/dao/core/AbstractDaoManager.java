package com.loyauty.dao.core;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Abstract data access manager.
 * 
 * Subclasses should define their own transaction management
 * approach.
 * 
 * In fact, DAOs are not aware of the transaction and they 
 * shouldn't be; They are participants in a bigger unit
 * of work. A DAO Manager will offer a unique access point in 
 * the system to lookup all DAOs, manage transaction boundaries, and 
 * handle all the exception thrown from data access operations. 
 *      
 * @author Muthanna
 *
 */
public abstract class AbstractDaoManager implements DaoManager{
	
	@Getter
	@Setter
	protected boolean commitTransaction = false;	
		
	@Setter(AccessLevel.PROTECTED)
	@Getter(AccessLevel.PROTECTED)
	protected boolean templateMode;
	
	protected AbstractDaoManager(boolean commitTransaction){
		this(commitTransaction, false);
	}
	
	protected AbstractDaoManager(boolean commitTransaction, boolean templateMode){
		setCommitTransaction(commitTransaction);
		setTemplateMode(templateMode);
	}
	
}
