package com.loyauty.service.common;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;


import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;


public class CommonServiceImpl extends ServiceImpl implements CommonService {

	private static final Logger log = Logger.getLogger(CommonServiceImpl.class);
	
	@Setter 
	@Getter

	protected DaoManager daoManager;
	
	public CommonServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}
	
	@Override
	public CommonDTO getCategory(final long id) throws ServiceException {
		Category category = null;
		try {
			category = (Category) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().getEntity(id);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
		
		CommonDTO commonDTO = null;
		if(category != null){
			commonDTO = CommonDTO.valueOf(category.getId(), category.getCode());			
		}
		return commonDTO;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CommonDTO> getCategories() throws ServiceException {
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
		
		return DTOFactory.getAllCommonDTOFromCategory(list);
		
	}


	@Override
	public CommonDTO getBrand(final long brandId) throws ServiceException {
		Brand brand = null;
		try {
			brand = (Brand) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getBrandDao().getEntity(brandId);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
		
		CommonDTO dto = null;
		if(brand != null){
			dto = CommonDTO.valueOf(brand.getId(), brand.getName());			
		}
		return dto;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CommonDTO> getBrands() {
		List<Brand> list = null;
		try {
			list = (List<Brand>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getBrandDao().getAllEntities();
				}
			});
		} catch (DaoException e) {
			log.debug("Error when access Brands");			
		} catch (Exception e) {
			log.debug("Error when access Brands");			
		}
		
		return DTOFactory.getAllCommonDTOFromBrand(list);
		
	}
	


	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryDTO> getCategoriesByBrand(final long id)
			throws ServiceException {
		List<Category> list = null;
		try {
			list = (List<Category>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getCategoryDao().getCategoriesByBrand(id);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		
		return DTOFactory.getCategoryListDTO(list);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CommonDTO> getAllCategoryGroup() {
		List<CommonDTO> dto = new ArrayList<CommonDTO>();
		for(GroupCategoryEnum myEnum:GroupCategoryEnum.values()){
			dto.add(CommonDTO.valueOf(myEnum.getValue(),myEnum.getCode(),myEnum.getLocalizationKey()));
		}
		
		return dto;
	}
}
