package com.loyauty.service.category;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;

import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.CategoryBrand;
import com.loyauty.model.UserCategoryDiscount;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;


public class CategoryServiceImpl extends ServiceImpl implements CategoryService {

	private static final Logger log = Logger.getLogger(CategoryServiceImpl.class);
	
	@Setter 
	@Getter



	protected DaoManager daoManager;
	
	public CategoryServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryDTO> getAllCategory() throws ServiceException {
			
		List<Category> list = null;
		try {
			list = (List<Category>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().getAllEntities();
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		
		return DTOFactory.getCategoryListDTO(list);
		
	}
	
	

	@Override
	public void createCategory(final CategoryDTO categoryDTO) throws ServiceException {
		
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(DaoManager daoManager)
							throws DaoException {
						
						Category category = new Category();
						category.setCategoryGoupeId(categoryDTO.getCategoryGoupeId());
						category.setCode(categoryDTO.getCode());
						category.setName(categoryDTO.getName());
						category.setDescription(categoryDTO.getDescription());
						category.setCreationDate(GregorianCalendar.getInstance().getTime());
						daoManager.getCategoryDao().insertEntity(category);						

						CategoryBrand categoryBrand = new CategoryBrand();
						for(Long brandId : categoryDTO.getBrands()){							
							categoryBrand.setCategoryId(category.getId());
							categoryBrand.setBrandId(brandId);
							daoManager.getCategoryDao().insertCategoryBrands(categoryBrand);							
						}
						
						
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public boolean categoryExist(final String categoryName) throws ServiceException {
		Category cat = null;
		try {
			cat = (Category) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().getCategoryByName(categoryName);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		
		return cat != null;
	}
	

	@Override
	public CategoryDTO getCategory(final long categoryId) throws ServiceException {
		Category cat = null;
		try {
			cat = (Category) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().getEntity(categoryId);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		CategoryDTO catDTO = CategoryDTO.valueOf(cat.getId(), cat.getCategoryGoupeId(), cat.getName(), 
								cat.getCode(), cat.getDescription(), cat.getCreationDate());
		catDTO.setBrands(cat.getBrandsId());
		return catDTO;
	}

	

	@Override
	public void editCategory(final CategoryDTO categoryDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(DaoManager daoManager)
							throws DaoException {
																			
						Category category = new Category();
						category.setId(categoryDTO.getId());
						category.setCategoryGoupeId(categoryDTO.getCategoryGoupeId());
						category.setCode(categoryDTO.getCode());
						category.setName(categoryDTO.getName());
						category.setDescription(categoryDTO.getDescription());
						category.setCreationDate(GregorianCalendar.getInstance().getTime());
						daoManager.getCategoryDao().updateEntity(category);			
						
						daoManager.getCategoryDao().deleteCategoryBrandByCategoryId(category.getId());
						
						CategoryBrand categoryBrand = new CategoryBrand();
						for(Long brandId : categoryDTO.getBrands()){							
							categoryBrand.setCategoryId(category.getId());
							categoryBrand.setBrandId(brandId);
							daoManager.getCategoryDao().insertCategoryBrands(categoryBrand);							
						}
						
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
	}
	
	@Override
	public boolean existCategory(CategoryDTO categoryDTO)throws ServiceException {
		boolean exist = false;
		final Category category = new Category();
		category.setName(categoryDTO.getName());
		try {
			exist = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().existCategory(category);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		return exist;
	}
}
