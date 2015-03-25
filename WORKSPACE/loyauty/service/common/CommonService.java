package com.loyauty.service.common;

import java.util.List;


import com.loyauty.exception.ServiceException;
import com.loyauty.model.Category;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;

public interface CommonService extends Service {
	
	
	/**
	 * Returns the Brand basic information.
	 * the default language is English
	 * @param gameId the game id.
	 * @return
	 */
	CommonDTO getCategory(long gategoryId) throws ServiceException;
	
	
	/**
	 * Returns the the list of all Brands information depending
	 * @param gameId
	 * @param langId
	 * @return
	 * @throws ServiceException
	 * @throws GameNotFoundException
	 */
	List<CommonDTO> getCategories() throws ServiceException;
	
	
	/**
	 * Returns the Brand basic information.
	 * the default language is English
	 * @param gameId the game id.
	 * @return
	 */
	CommonDTO getBrand(long brandId) throws ServiceException;
	
	
	/**
	 * Returns the the list of all Brands information depending
	 * @param gameId
	 * @param langId
	 * @return
	 * @throws ServiceException
	 * @throws GameNotFoundException
	 */
	List<CommonDTO> getBrands() throws ServiceException;
	
	/**
	 * Returns the the list of all Brands information depending
	 * @param gameId
	 * @param langId
	 * @return
	 * @throws ServiceException
	 * @throws GameNotFoundException
	 */
	List<CategoryDTO> getCategoriesByBrand(long id) throws ServiceException;
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<CommonDTO> getAllCategoryGroup() throws ServiceException;
	
	

}
