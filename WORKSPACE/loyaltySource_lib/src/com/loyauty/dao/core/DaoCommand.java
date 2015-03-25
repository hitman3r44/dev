package com.loyauty.dao.core;

import com.loyauty.exception.DaoException;


/**
 * It should be implemented by all database access operations.
 * The logic that communicates with the DB should go inside 
 * the execute method. 
 * 
 * @author Muthanna 
 */
public interface DaoCommand {
	
	/**
	 * The logic this method encapsulates will be passed to
	 * a an implementation of a {@link DaoManager} where it
	 * gets executed.
	 *  
	 * @param daoManager the DAO manager in charge of
	 * executing the command.
	 * @return the result object or null.
	 */
	Object execute(DaoManager daoManager) throws DaoException;
}
