package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.BrandDao;
import com.loyauty.dao.CategoryDao;
import com.loyauty.dao.ImageDao;
import com.loyauty.dao.SpecificationDao;
import com.loyauty.dao.ProductDao;
import com.loyauty.dao.TranslationDao;
import com.loyauty.dao.UserBrandDiscountDao;
import com.loyauty.dao.UserCategoryDiscountDao;
import com.loyauty.dao.UserDao;
import com.loyauty.dao.core.AbstractDaoManager;
import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.mybatis.utils.SqlSessionUtils;
import com.loyauty.exception.DaoException;




/**
 * Defines DAOs, manages transaction boundaries, and assures that 
 * database operations get executed using the same 
 * transaction (The {@link SqlSession} in MyBatis world).
 *  
 * @author Muthanna
 */
public class DaoManagerImpl extends AbstractDaoManager {
	
	protected static final String ERROR_MSG = "You can't use Dao Manager in this mode.";
	
	public DaoManagerImpl(){
		this(false);
	}
	
	public DaoManagerImpl(boolean commitTransaction){				
		super(commitTransaction);
	}	
	
	/**
	 * Returns the current session.
	 * 
	 * @return
	 */
	protected SqlSession getSession(){		
		return SqlSessionUtils.getCurrentSqlSession();
	}
	
	@Override
	public Object executeAndHandle(DaoCommand command) throws DaoException{
		Object returnValue = null;
		
		try {
			setTemplateMode(true);
			returnValue = command.execute(this);
			if(isCommitTransaction()){
				SqlSessionUtils.commit();
			}
		} catch (Exception pe) {			
			if(isCommitTransaction()){
				SqlSessionUtils.rollback();
			}			
			
			throw new DaoException("Data Access Command Problem", pe);
		}finally{			
			SqlSessionUtils.close();
		}
		
		return returnValue;
	}

	@Override
	public UserDao getUserDao(){
		if(isTemplateMode()){
			return new UserDaoImpl(getSession(), "UserMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}

	@Override
	public BrandDao getBrandDao() {
		if(isTemplateMode()){
			return new BrandDaoImpl(getSession(), "BrandMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}

	@Override
	public ImageDao getImageDao() {
		if(isTemplateMode()){
			return new ImageDaoImpl(getSession(), "ImageMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}

	@Override
	public CategoryDao getCategoryDao() {
		if(isTemplateMode()){
			return new CategoryDaoImpl(getSession(), "CategoryMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}
	
	@Override
	public ProductDao getProductDao(){
		if(isTemplateMode()){
			return new ProductDaoImpl(getSession(), "ProductMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}

	@Override
	public SpecificationDao getSpecificationDao() {
		if(isTemplateMode()){
			return new SpecificationDaoImpl(getSession(), "SpecificationMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}
	
	@Override
	public TranslationDao getTranslationDao(){
		if(isTemplateMode()){
			return new TranslationDaoImpl(getSession(), "TranslationMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}

	@Override
	public UserBrandDiscountDao getUserBrandDiscountDao() {
		if(isTemplateMode()){
			return new UserBrandDiscountDaoImpl(getSession(), "UserBrandDiscountMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}
	
	@Override
	public UserCategoryDiscountDao getUserCategoryDiscountDao() {
		if(isTemplateMode()){
			return new UserCategoryDiscountDaoImpl(getSession(), "UserCategoryDiscountMapper");
		}else{
			throw new IllegalStateException(ERROR_MSG);
		}
	}
	
}
