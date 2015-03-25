package com.loyauty.dao.core;

import com.loyauty.dao.BrandDao;
import com.loyauty.dao.CategoryDao;
import com.loyauty.dao.ImageDao;
import com.loyauty.dao.OperationsDAO;
import com.loyauty.dao.OrdersDao;
import com.loyauty.dao.SpecificationDao;
import com.loyauty.dao.ProductDao;
import com.loyauty.dao.TranslationDao;
import com.loyauty.dao.UserBrandDiscountDao;
import com.loyauty.dao.UserCategoryDiscountDao;
import com.loyauty.dao.UserDao;
import com.loyauty.dao.UserFileRecoveryDao;
import com.loyauty.dao.UsersPrivilegesDao;
import com.loyauty.exception.DaoException;

/**
 * DAO manager interface.
 * It provides a unique access point to all DAOs in the system as
 * well as other methods needed to manipulate transactions.
 * 
 * @author Muthanna
 *
 */
public interface DaoManager {
	
	/**
	 * Sets commit status to TRUE or FALSE. 
	 * @param commitTransaction
	 */
	void setCommitTransaction(boolean commitTransaction);
	
	/**
	 * Indicates whether the transaction is set to be committed.
	 * @return
	 */
	boolean isCommitTransaction();
	
	/**
	 * All Database access operation should invoke this method
	 * for it is designed to handle acquiring connections to the DB, 
	 * committing and rolling back transactions, handling exception,
	 * and cleaning up the transaction garbage.	
	 * 
	 * @param command the DAO command used
	 * @return an object representing the returned result or null
	 * @throws DaoException
	 */
	Object executeAndHandle(DaoCommand command) throws DaoException;
		
	
	/**
	 * Returns user's DAO
	 * @return
	 */
	UserDao getUserDao();
	
	/**
	 * Returns product's DAO
	 * @return
	 */
	ProductDao getProductDao();
	
	/**
	 * Returns Brand DAO
	 * @return
	 */
	BrandDao getBrandDao();
	
	/**
	 * Return Image DAO
	 * @return
	 */
	ImageDao getImageDao();
	
	/**
	 * Return Category DAO
	 * @return
	 */
	CategoryDao getCategoryDao();
	
	/**
	 * return Specification DAO
	 * @return
	 */
	SpecificationDao getSpecificationDao();
	
		/**
	 * Return Category DAO
	 * @return
	 */
	TranslationDao getTranslationDao();
	
	/**
	 * UserBrandDiscount DAO
	 * @return
	 */
	UserBrandDiscountDao getUserBrandDiscountDao();
	
	/**
	 * UserCategoryDiscount DAO
	 * @return
	 */
	UserCategoryDiscountDao getUserCategoryDiscountDao();
	
	/**
	 * Operations DAO
	 * @return
	 */
	OperationsDAO getOperationsDAO();
	
	/**
	 * UserFileRecoveryDao
	 * @return
	 */
	//UserFileRecoveryDao getUserFileRecoveryDao();
	
	/**
	 * OrdersDao
	 * @return
	 */
	OrdersDao getOrdersDao();
	
	/**
	 * 
	 * @return
	 */
	UsersPrivilegesDao getUsersPrivilegesDao();
	
	/**
	 * 
	 * @return
	 */
	UserFileRecoveryDao getUserFileRecoveryDao();
	
}
