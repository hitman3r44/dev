package com.loyauty.service.product;

import java.io.File;
import java.io.IOException;
import java.util.List;


import com.loyauty.exception.ServiceException;

import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.Product;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.BasicDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.CommonUserDiscountDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductDTO;



/**
 * User service interface.
 * 
 * @author Manuel
 *
 */
public interface ProductService extends Service {
	
	
	List<SpecificationDTO> getMainSpecificationByCategory(long categoryId) throws ServiceException;
	
		/**
	 * Creates a new product.
	 * @param productDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createProduct(ProductDTO productDTO) throws ServiceException;

	
	/**
	 * Get the product information by id.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	ProductDTO getProductInformation(Long productId) throws ServiceException;

	
	/**
	 * Get the information product for an specified brand or category.
	 * @param producDTO
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductDTO> getAllProdcutForProfit(UserProductDTO userProducDTO) throws ServiceException;
	
	/**
	 * transfer Image temporary
	 * @param userId
	 * @param fileName
	 * @param file
	 * @param path
	 * @return
	 * @throws ServiceException
	 */
	ImageDTO addProductImage(File file, String fileName, String applicationPath, long uploaderId,
			 int width, int height, int miniCoverWidth, boolean large) throws ServiceException, IOException;

	/**
	 * update a product.
	 * @param productDTO
	 * @return
	 * @throws ServiceException
	 */
	void updateProduct(ProductDTO productDTO) throws ServiceException;
	
	List<ProductDTO> getAllProdcut() throws ServiceException;
	
	/**
	 * 
	 * generate all selling price by brans
	 * @param userProductDTO
	 * @throws ServiceException
	 */
	void updateSellingPriceBrand(UserProductDTO userProductDTO) 
			throws ServiceException;
	/**
	 * generate all selling price by category
	 * @param userProductDTO
	 * @throws ServiceException
	 */
	void updateSellingPriceCategory(UserProductDTO userProductDTO) 
			throws ServiceException;
	
	/**
	 * 
	 * @param userDiscountDTO
	 * @return
	 * @throws ServiceException
	 */
	CommonUserDiscountDTO getUserBrandDiscount(CommonUserDiscountDTO userDiscountDTO)
			throws ServiceException;
	
	/**
	 * 
	 * @param userDiscountDTO
	 * @return
	 * @throws ServiceException
	 */
	CommonUserDiscountDTO getUserCategoryDiscount(CommonUserDiscountDTO userDiscountDTO)
			throws ServiceException;
	
	/**
	 * 
	 * @param producDTO
	 * @throws ServiceException
	 */
	void updateSellingPriceProduct(UserProductDTO producDTO)
			throws ServiceException;
	
	List<CommonDTO> getAllMainSpecification(LoyaltyEnum language)
			throws ServiceException;
}