package com.loyauty.dao.core;

import com.loyauty.dao.mybatis.DaoManagerImpl;

/**
 * Simple DAO manager factory.
 * 
 * 
 * @author Muthanna
 *
 */
public class DaoManagerFactory {
	
	public static DaoManager getDaoManager(){
		return getDaoManager(false);
	}
	
	public static DaoManager getDaoManager(boolean commitTransaction){		
		return getMybatisDaoManager(commitTransaction);
	}
	
	private static DaoManager getMybatisDaoManager(boolean commitTransaction){
		return new DaoManagerImpl(commitTransaction);
	}
}
