package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.Operations;
/**
 * 
 * Operations DAO interface.
 *
 */
	public interface OperationsDAO extends BasicDao{
		
	/**
	 * 	
	 * @param operationType
	 * @return
	 */
	List<Operations> getOperationsByTypeAndObject(Long objectId,String operationType);	
		
	/**
	 * 
	 * @param operation
	 * @return
	 */
	boolean insertOperation(Operations operation);	
		
		
		
		
}
