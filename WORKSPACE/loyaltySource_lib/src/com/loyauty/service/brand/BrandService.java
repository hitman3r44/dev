package com.loyauty.service.brand;

import java.io.File;
import java.io.IOException;
import java.util.List;


import com.loyauty.exception.ServiceException;
import com.loyauty.model.Brand;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.ProductDTO;

public interface BrandService extends Service {
	
	List<BrandDTO> getAllBrand() throws ServiceException;

	/**
	 * Creates a new brand.
	 * @param brandDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createBrand(BrandDTO brandDTO) throws ServiceException;
	
	/**
	 * update a brand.
	 * @param brandDTO
	 * @return
	 * @throws ServiceException
	 */
	void updateBrand(BrandDTO brandDTO) throws ServiceException;
	
	/**
	 * transfer Image temporary
	 * @param userId
	 * @param fileName
	 * @param file
	 * @param path
	 * @return
	 * @throws ServiceException
	 */
	ImageDTO addBrandImage(File file, String fileName, String applicationPath, long uploaderId,
			 int width, int height, int miniCoverWidth, boolean large) throws ServiceException, IOException;
	
	/**
	 * Get the brandDTO object with all the information.
	 * @param brandId
	 * @return
	 * @throws ServiceException
	 */
	BrandDTO getBrand(long brandId) throws ServiceException;
	
	boolean existBrand(String nameBrand)throws ServiceException;
	
	boolean existCode(String code, Long id)throws ServiceException;
	
	List<BrandDTO> getAllBrandByCategoryGroup(Long catid)throws ServiceException;

}
