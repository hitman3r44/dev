package com.loyauty.service.product;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.loyauty.exception.ServiceException;

import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.UserProductPrice;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.CommonUserDiscountDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.QueryDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserSessionDTO;

/**
 * 
 * User service interface.
 * 
 */
public interface ProductService extends Service {
	
	
	List<SpecificationDTO> getMainSpecificationByCategory(long categoryId) throws ServiceException;
	
		/**
	 * Create a new product.
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
	ProductDTO getProductInformation(Long productId, Long userId) throws ServiceException;
	
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
	
	/**
	 * get all Product
	 * @return
	 * @throws ServiceException
	 */
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
	/**
	 * get all type
	 * @param language
	 * @return
	 * @throws ServiceException
	 */
	List<CommonDTO> getAllMainSpecification(LoyaltyEnum language)
			throws ServiceException;
	
	/**
	 * get all product by brand or category
	 * @param dto
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllProductQuery(QueryDTO dto)
			throws ServiceException;

	/**
	 * get Product List 
	 * @param searchRequest
	 * @return
	 */
	List<ProductDTO> getProductList(SearchRequestDTO searchRequest) 
			throws ServiceException;
	
	/**
	 * Get all the users (id's, logins) with (user_product_price) status_id = 1 for a given productId.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<UserDTO> getAllActiveClients(Long productId) 
		throws ServiceException;
	
	
	/**
	 * Get all the discontinued-status products.
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllDiscontinuedProducts() 
		throws ServiceException;	
	
	/**
	 * Update to 'Disabled' the 'Discontinued' products after 1 month.
 	 * @param productDTO
	 * @throws ServiceException
	 */
	void updateStatusToDisabled(ProductDTO productDTO)
		throws ServiceException;
	
	/**
	 * Get the product-object given a loyaltySourceProductId.
	 * @param lSProductId
	 * @return
	 * @throws ServiceException
	 */
	ProductDTO getProductIdFromLSProductId(String lSProductId) 
		throws ServiceException;
	
	
	ProductDTO getProductByLsProductId(String lSProductId) 
		throws ServiceException;
	
	void updateUserProductStatus(UserProductDTO producDTO) 
		throws ServiceException;
	
	/**
	 * Create a new user_product_price-table object.
	 * @param userProductPriceDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createUserProductPrice(UserProductPriceDTO userProductPriceDTO) 
		throws ServiceException;
	
	/**
	 * Retrieve all the userId-productId's relations from user_product_price table for a single productId.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductPriceDTO> getUserProductPriceList(Long productId) 
		throws ServiceException;
	
	/**
	 * Retrieve all the userId-productId's relations for only Active Users
	 * from user_product_price table for a single productId.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductPriceDTO> getUserProductPriceForActiveUsersList(final Long productId) 
		throws ServiceException;
	
	UserProductPriceDTO getUsrPPriceByProductId(Long userId, Long productId)
		throws ServiceException;
	
	
	/**
	 * Update an userProductPrice.
 	 * @param userProductPriceDTO
	 * @throws ServiceException
	 */
	void updateUserProductPrice(UserProductPriceDTO userProductPriceDTO) 
		throws ServiceException;
	
	/**
	 * Get the respective UserProductPrice-Object by productId and userId.
	 * @param productId
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	UserProductPriceDTO getUserProductPriceInformation(Long productId, Long userId) 
		throws ServiceException;
	
	/**
	 * Get all provinces
	 * @return
	 * @throws ServiceException
	 */
	List<ProvinceDTO> getAllProvinces() throws ServiceException;
	
	/**
	 * Get all cities by provinceId.
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	List<CityDTO> getAllCities(Long provinceId) throws ServiceException;	
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<CityDTO> getMostPopularCitiesList() throws ServiceException;
	
	/**
	 * 
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	CityDTO getMostPopularCitie(Long provinceId) throws ServiceException;
	
	/**
	 * Get all cities.
	 * @return
	 * @throws ServiceException
	 */
	List<CityDTO> getCities() throws ServiceException;
	
	/**
	 * Create a new shipping_city-table object.
	 * @param shippingCity
	 * @return
	 * @throws ServiceException
	 */
	Long createShippingCity(ShippingCityDTO shippingCityDTO) 
		throws ServiceException;

	/**
	 * Create a new shipping_province-table object.
	 * @param shippingProvince
	 * @return
	 * @throws ServiceException
	 */
	Long createShippingProvince(ShippingProvinceDTO shippingProvinceDTO) 
		throws ServiceException;

	/**
	 * Create a new shipping_total-table object.
	 * @param shippingTotal
	 * @return
	 * @throws ServiceException
	 */
	Long createShippingTotal(ShippingTotalDTO shippingTotalDTO) 
		throws ServiceException;
	
	
	/**
	 * Update an userProductPrice to fill in its respective 'shipping_coverage' field.
	 * @param userProductPriceDTO
	 * @throws ServiceException
	 */
	void updateUPPShippingCoverage(UserProductPriceDTO userProductPriceDTO) 
		throws ServiceException;
	
	/**
	 * Update an userProductPrice to fill in its respective 'shipping_total_canada' field.
	 * @param userProductPriceDTO
	 * @throws ServiceException
	 */
	void updateUPPShippingTotalCanada(UserProductPriceDTO userProductPriceDTO) 
		throws ServiceException;
	
	/**
	 * Get all products by category_group field from category DB-Table.
	 * @param categoryGroupId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getProductListByCategoryGroupId(Long categoryGroupId) 
		throws ServiceException;
	
	/**
	 * Get products with status, AVAILABLE and UNAVAILABLE by userId.
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProducts(Long userId) 
		throws ServiceException;
	
	/**
	 * Get all products with status, AVAILABLE and UNAVAILABLE.
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsForAllUsers()
		throws ServiceException;
	
	/**
	 * Get products by category_group_id.
	 * @param userId 
	 * @param categoryGroupId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsG(Long userId, 
												Long categoryGroupId) 
												throws ServiceException;
	
	/**
	 * Get products by category_group_id and category_id.
	 * @param userId
	 * @param categoryGroupId
	 * @param categoryId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsGC(Long userId, 
												Long categoryGroupId, 
												Long categoryId) 
												throws ServiceException;
	
	/**
	 * Get products by category_group_id, category_id and type_id.
	 * @param userId
	 * @param categoryGroupId
	 * @param categoryId
	 * @param typeId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsGCT(Long userId, 
												Long categoryGroupId, 
												Long categoryId, 
												Long typeId) 
												throws ServiceException;
	
	/**
	 * Get products by category_group_id, category_id, type_id and brand_id.
	 * @param userId
	 * @param categoryGroupId
	 * @param categoryId
	 * @param typeId
	 * @param brandId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsGCTB(Long userId, 
													Long categoryGroupId, 
													Long categoryId, 
													Long typeId,
													Long brandId) 
													throws ServiceException;
	
	/**
	 * Get products by category_group_id, category_id and brand_id.
	 * @param userId
	 * @param categoryGroupId
	 * @param categoryId
	 * @param brandId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getAllValidStatusProductsGCB(Long userId, 
			Long categoryGroupId, 
			Long categoryId, 
			Long brandId) 
			throws ServiceException;
	
	/**
	 * Get a product by its id [No user or status_id are ever needed].
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	ProductDTO getProductById(Long productId)
		throws ServiceException;
	
	/**
	 * Update The 'expedited_parcel_price' value on shipping_city DB-Table by product_id and city_id.
	 * @param shippingCityDTO
	 * @throws ServiceException
	 */
	void updateShippingCityToExpeditedParcelPrice(ShippingCityDTO shippingCityDTO) 
		throws ServiceException;
	
	/**
	 * Get a ShippingCity-object by product_id and city_id.
	 * @param productId
	 * @param cityId
	 * @return
	 * @throws ServiceException
	 */
	ShippingCityDTO getShippingCity(Long productId, Long cityId) 
		throws ServiceException;
	
	/**
	 * Update by product_id and province_id.
	 * @param shippingProvinceDTO
	 * @throws ServiceException
	 */
	void updateShippingProvince(ShippingProvinceDTO shippingProvinceDTO) 
		throws ServiceException;
	
	/**
	 * Get All Products with same weight and dimensions.
	 * @param productDTO
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getValidProductIdByDim(ProductDTO productDTO) 
		throws ServiceException;
	
	/**
	 * Get all shippingCity-objects with parcelPrice = 0.00.
	 * @param cityId
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingCityDTO> getShippingCityListWithZeroParcelPriceByCityId(Long cityId) 
		throws ServiceException;
	
	/**
	 * Get city by id.
	 * @param cityId
	 * @return
	 * @throws ServiceException
	 */
	CityDTO getCity(Long cityId) 
		throws ServiceException;
	
	/**
	 * 
	 * @param nameCity
	 * @return
	 * @throws ServiceException
	 */
	CityDTO getCityByName(String nameCity)
		throws ServiceException;

	/**
	 * Get province by id.
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	ProvinceDTO getProvince(Long provinceId)
		throws ServiceException;
	
	/**
	 * 
	 * @param code
	 * @return
	 * @throws ServiceException
	 */
	ProvinceDTO getProvinceByCode(String code) 
	    throws ServiceException;
	
	/**
	 * Get weightedTotalProvince from ShippingProvince DB-Table.
	 * @param productId
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	ShippingProvinceDTO 
		getWeightedTotalProvinceFromShippingProvince(Long productId, Long provinceId) 
		throws ServiceException;	
	
	/**
	 * Update by product_id, province_id and user_id.
	 * @param shippingTotalDTO
	 * @throws ServiceException
	 */
	void updateShippingTotal(ShippingTotalDTO shippingTotalDTO) 
		throws ServiceException;	
	
	/**
	 * 
	 * @param productId
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingTotalDTO> getShippingTotalList(Long productId, Long userId) 
		throws ServiceException;	
	
	/**
	 * Create a UserProvincePopulation-Object.
	 * @param userProvincePopulationDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createUserProvincePopulation(UserProvincePopulationDTO userProvincePopulationDTO) 
		throws ServiceException;
	
	/**
	 * Get a UserProvincePopulation-object by user_id.
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	List<UserProvincePopulationDTO> getUserProvincePopulationList(Long userId) 
		throws ServiceException;
	
	/**
	 * Update a UserProvincePopulation-object on from the Edit-User Web-Form.
	 * @param userProvincePopulationDTO
	 * @throws ServiceException
	 */
	void updateUserProvincePopulation(UserProvincePopulationDTO userProvincePopulationDTO) 
		throws ServiceException;
	
	/**
	 * Get all the ShippingCity's registers.
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingCityDTO> getAllShippingCity() 
		throws ServiceException;
	
	/**
	 * Get all the ShippingProvince's registers.
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingProvinceDTO> getAllShippingProvince() 
		throws ServiceException;
	
	/**
	 * Get all the ShippingTotal's registers.
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingTotalDTO> getAllShippingTotal() 
		throws ServiceException;
	
	/**
	 * Get all the UserProvincePopulation's registers.
	 * @return
	 * @throws ServiceException
	 */
	List<UserProvincePopulationDTO> getAllUserProvincePopulation() 
		throws ServiceException;
	
	/**
	 * Get all the UserProductPrice's registers.
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductPriceDTO> getAllUserProductPrice() 
		throws ServiceException;
	
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingTotalDTO> getShippingTotalListByUserId(Long userId)
		throws ServiceException;
	
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductPriceDTO> getUserProductPriceByUserId(Long userId)
		throws ServiceException;
	
	/**
	 * Get a unique UserProvincePopulation-object by userId an provinceId.
	 * @param userId
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	UserProvincePopulationDTO getUserProvincePopulation(Long userId, Long provinceId)
		throws ServiceException;
	
	/**
	 * Get ShippingCity-objects by greater than its id.
	 * @param id
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingCityDTO> getShippingCityByIDGreaterThan(Long id)
		throws ServiceException;
	
	/**
	 * Get ShippingProvince-objects by greater than its id.
	 * @param id
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingProvinceDTO> getShippingProvinceByIDGreaterThan(Long id) 
		throws ServiceException;	
	
	/**
	 * Get ShippingTotal-objects by greater than its id.
	 * @param id
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingTotalDTO> getShippingTotalByIDGreaterThan(Long id) 
		throws ServiceException;
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<Long> getAllValidProductIds() 
		throws ServiceException;
	
	/**
	 * Get Product List by userId and isExcluded from UserProductPrice DB-Table.
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	 List<ProductDTO> getValidProductsByUserIdAndExcluded(Long userId) 
		throws ServiceException;

	 List<ProductDTO> getProductsClassification(Long userId)
	 	throws ServiceException;
	/**
	 *  Get Product-objects by greater than its id.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getValidProductsGreaterThanId(Long productId)
		throws ServiceException;
		
	/**
	 * Get a ShippingTotal List by productId.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<ShippingTotalDTO> getShippingTotalListByProductId(Long productId) 
		throws ServiceException;
	
	/**
	 * Get UserProductPrice List by productId and where shippingTotalCanada is null.
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	List<UserProductPriceDTO> getNullsShippingTotalCanadaOnUserProductPrice(Long productId)
		throws ServiceException;
	
	/**
	 * Update name, desc, specs and other for the 'amender' user-type.
	 * @param productDTO
	 * @throws ServiceException
	 */
	void updateAmendingProduct(ProductDTO productDTO)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	Boolean existsOnAlterProductXML(Long productId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	Boolean existsOnAlterUserProductXML(Long productId , Long userId)
		throws ServiceException;
	
	/**
	 * 
	 * @param alterUserProductXMLDTO
	 * @throws ServiceException
	 */
	void updateAlterUserProductXML(AlterUserProductXMLDTO alterUserProductXMLDTO)
		throws ServiceException;
	
	/**
	 * 
	 * @param alterProductXMLDTO
	 * @throws ServiceException
	 */
	void updateAlterProductXML(AlterProductXMLDTO alterProductXMLDTO)
		throws ServiceException;
	
	/**
	 * 
	 * @param alterUserProductXMLDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createAlterUserProductXML(AlterUserProductXMLDTO alterUserProductXMLDTO)
		throws ServiceException;
	
	/**
	 * 
	 * @param alterProductXMLDTO
	 * @return
	 * @throws ServiceException
	 */
	Long createAlterProductXML(AlterProductXMLDTO alterProductXMLDTO)
		throws ServiceException;	
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getProductsAsOfConsideredForXML()
		throws ServiceException;
	
	/**
	 * 
	 * @param userId
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	AlterUserProductXMLDTO getAlterUserProductXML(Long userId, Long productId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @return
	 * @throws ServiceException
	 */
	AlterProductXMLDTO getAlterProductXML(Long productId) 
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @throws ServiceException
	 */
	void closeProductConsideredForXML(Long productId) 
		throws ServiceException;
		
	/**
	 * 
	 * @param productId
	 * @throws ServiceException
	 */
	void closeAlterProductXML(Long productId) 
		throws ServiceException;
	
	/**
	 * 
	 * @param userId
	 * @param productId
	 * @throws ServiceException
	 */
	void closeAlterUserProductXML(Long userId, Long productId) 
		throws ServiceException;
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getWereWgtDimChangedFromProduct()
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @throws ServiceException
	 */
	void closeProductWereWgtDimChanged(Long productId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param cityId
	 * @return
	 * @throws ServiceException
	 */
	Boolean existsShippingCity(Long productId, Long cityId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	ShippingProvinceDTO getShippingProvince(Long productId, Long provinceId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	Boolean existsShippingProvince(Long productId, Long provinceId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param provinceId
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	ShippingTotalDTO getShippingTotal(Long productId, Long provinceId, Long userId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @param provinceId
	 * @return
	 * @throws ServiceException
	 */
	Boolean existsShippingTotal(Long productId, Long provinceId, Long userId)
		throws ServiceException;
	
	/**
	 * 
	 * @param productId
	 * @throws ServiceException
	 */
	void saveOldImageIdBeforeUpdate(Long productId) 
		throws ServiceException;

	/**
	 * Get all the products between the interval including the bound limits.
	 * @param lower
	 * @param upper
	 * @return
	 * @throws ServiceException
	 */
	List<ProductDTO> getProductBetween(Long lower, Long upper) 
		throws ServiceException;
	
	List<Long> getShippingRepeats(ProductDTO productDTO) throws ServiceException;
	
	List<Long> getWereWgtDimChanged() throws ServiceException;
	
	/**
	 * 
	 * @param brandId
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	 boolean excludeProductsByBrandAndUser(Long brandId, Long userId, Boolean exclude)
	 		 throws ServiceException;
	
	 /**
	  * 
	  * @param brandId
	  * @param userId
	  * @return
	  * @throws ServiceException
	  */
	 boolean isUserBrandExcluded(Long brandId, Long userId)
	 		 throws ServiceException;
	 
	 
	 
		boolean generatProfitByBrand(Long brandId, Long userId,String percentProfit)
				throws ServiceException;;
		
		/**
		 * 
		 * @param categoryId
		 * @param userId
		 * @return
		 */
		
		boolean generatProfitByCategory(Long categoryId, Long userId, String percentProfit)
				throws ServiceException;
	 
		 /**
		  * 
		  * @param brandId
		  * @param userId
		  * @return
		  * @throws ServiceException
		  */
		 
	 
		 Long nbProductActiveByBrand(Long brandId, Long userId)
 		 							 throws ServiceException;
		 
		 /**
		  * 
		  * @return
		  * @throws ServiceException
		  */
		 List<ProductDTO> getAllProdcutAnyStatus() throws ServiceException;
		 
		 /**
		  * 
		  * @param userId
		  * @param lsProductId
		  * @return
		  * @throws ServiceException
		  */
		 UserProductPriceDTO getUsrPPriceByLsproductId(Long userId, String lsProductId)
		 											  throws ServiceException;
		 
		 /**
		  * 
		  * @param from
		  * @param to
		  * @throws ServiceException
		  */
		 void transferToUser(Long from, Long to) 
		 		throws ServiceException;
		 		 
		 /**
		  * 
		  * @param from
		  * @param to
		  * @param updateDate
		  * @throws ServiceException
		  */
		void transferToUserByCreationDate(Long from, Long to,Long managerId,Date updateDate)
		 		throws ServiceException;
		  
		 /**
		  * 
		  * @param from
		  * @param to
		  * @throws ServiceException
		  */
		 void transferSQLtheUserToNewTemplate(Long from, Long to) 
		 		throws ServiceException;

		Long isGroupProductID(Long productId) throws ServiceException;
		
		/**
		 * 
		 * @param ProductListDTO
		 * @param productAdminDataFolder
		 * @throws ServiceException
		 */
		void generateAdminXLS(List<ProductDTO> ProductListDTO,String productAdminDataFolder) throws ServiceException;
		 
	
		/**
		 * Get the information of a box by productId
		 * @param productId
		 */
		BoxDTO getBoxByProductId(Long productId) throws ServiceException;
		
		/**
		 * Insert a new box and a new product_box if they don't exist
		 * @param boxDTO
		 */
		Long insertBoxAndProductBox(final BoxDTO boxDTO) throws ServiceException;
		
		/**
		 * update product_box.
		 * @param boxDTO
		 * @return
		 * @throws ServiceException
		 */
		void updateProductBox(BoxDTO boxDTO) throws ServiceException;
		
		/**
		 * update product_box by EST file excel if CP Not Verified
		 * @param boxDTO
		 * @return
		 * @throws ServiceException
		 */
		void updateProductBoxIfCpNotVerified(BoxDTO boxDTO) throws ServiceException;
	
	
	
		/**
		 * 
		 * @param userAdminLogin
		 * @param destFileStockXLS
		 * @return
		 * @throws ServiceException
		 */
		 
		 List<ProductDTO> listStockFromXLS(String userAdminLogin,String destFileStockXLS)throws  Exception;
		 
		 
		 /**
		  * 
		  * @param listStock
		  * @throws ServiceException
		  */
		 boolean updateStock(List<ProductDTO> listStock) throws ServiceException ;
		 
		 /**
		  * 
		  * @param userId
		  * @param productId
		  * @return
		  */
		 boolean calculateShippingRate(Long userId,Long productId) throws ServiceException ;
		 
		 /**
		  * 
		  * @param listProductDTO
		  * @return
		  * @throws ServiceException
		  */
		 List<ProductDTO> getProductNotFound(List<ProductDTO>listProductDTO) throws ServiceException;
		 
		 /**
		  * 
		  * @param productDTO
		  * @return
		  */
		 boolean updateStockByLsProductId(ProductDTO productDTO);
		 
		 /**
		  * 
		  * @param userId
		  * @return
		  * @throws ServiceException
		  */
		 boolean calculateShippingRateForAllProducts(Long userId) throws ServiceException;
		 
		 
		 /**
		 * Get List of Distinct Currency Symbols
		 * @param 
		 */
		 List<CurrencyDTO> getCurrencySymbols() throws ServiceException;
		 
		 /**
		  * Get List of Distinct Currency Symbols But Not Canadian Dollar
		  * @return
		  * @throws ServiceException
		  */
		 List<CurrencyDTO> getCurrenciesButNotCAD() throws ServiceException;
		 
		 /**
		 * Get the information of a currency by currencySymbol
		 * @param currencySymbol
		 */
		 CurrencyDTO getCurrencyBySymbol(CurrencyDTO currencyDTO) throws ServiceException;

		 /**
		 * update currency.
		 * @param currency
		 * @return
		 * @throws ServiceException
		 */
		 void updateCurrency(CurrencyDTO currencyDTO) throws ServiceException;
		 
		 /**
		  * 
		  * @param currencyDTO
		  * @return
		  * @throws ServiceException
		  */
		 CurrencyDTO isCurrencyExists(CurrencyDTO currencyDTO) throws ServiceException;
		 
		 /**
		  * 
		  * @param currencyDTO
		  * @return
		  * @throws ServiceException
		  */
		 Long insertNewCurrency(CurrencyDTO currencyDTO) throws ServiceException;
		 
		 /**
		  * 
		  * @param userId
		  * @return
		  * @throws ServiceException
		  */
		 List<ProductDTO>getSaleActiveByUserId(Long userId) throws ServiceException;
		 
		 /**
		  * 
		  * @param productId
		  * @param userId
		  * @return
		  * @throws ServiceException
		  */
		 ProductDTO getSaleActiveByProductIdAndUserId(Long productId,Long userId) throws ServiceException;
		 
		 /**
		  * 
		  * @param productId
		  * @return
		  * @throws ServiceException
		  */
		 ProductDTO getSaleByProductId(Long productId) throws ServiceException;
		 
		 /**
		  * 
		  * @param productDTO
		  * @throws ServiceException
		  */
		 
		 Long addProductSale(ProductDTO productDTO) throws ServiceException;
		 
		 /**
		  * 
		  * @param productDTO
		  * @throws ServiceException
		  */
		 void addUserSale(ProductDTO productDTO,List<Long> usersIdListSeleted) throws ServiceException;
		 
		 /**
		  * 
		  * @param productSaleId
		  * @return
		  * @throws ServiceException
		  */
		 boolean isThereUserHavenThisSale(final Long productSaleId)throws ServiceException;
		 
		 /**
		  * 
		  * @param productId
		  * @param userId
		  * @return
		  * @throws ServiceException
		  */
		 ProductDTO getSaleByProductIdAndUserId(Long productId,Long userId) throws ServiceException;
		 
		 /**
		  * 
		  * @param ordersList
		  * @return
		  * @throws ServiceException
		  */
		 public Boolean disableSaleWhenOutTime(Long userId) throws ServiceException;
		 /**
		  * 
		  * @param userProductPriceDTO
		  * @throws ServiceException
		  */
		 void updateUserProductPriceByProductIdAndUserIDSumit(UserProductPriceDTO userProductPriceDTO)throws ServiceException;
		 
		 
}
