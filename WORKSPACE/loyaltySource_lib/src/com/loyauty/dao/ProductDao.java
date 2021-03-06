package com.loyauty.dao;

import java.util.Date;
import java.util.List;

import com.loyauty.model.AlterProductXML;
import com.loyauty.model.AlterUserProductXML;
import com.loyauty.model.Box;
import com.loyauty.model.City;
import com.loyauty.model.Currency;
import com.loyauty.model.Orders;
import com.loyauty.model.Product;
import com.loyauty.model.ProductLink;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Province;
import com.loyauty.model.Query;
import com.loyauty.model.Select;
import com.loyauty.model.ShippingCity;
import com.loyauty.model.ShippingProvince;
import com.loyauty.model.ShippingTotal;
import com.loyauty.model.Specification;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;
import com.loyauty.model.UserProductPrice;
import com.loyauty.model.UserProvincePopulation;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.UserSessionDTO;

/**
 * Product DAO interface.
 * 
 * @author Manuel
 *
 */
public interface ProductDao extends BasicDao{
	
	/**
	 * Gets a product by id.
	 * @param productId
	 * @return
	 */
	Product getProduct(Select select);
	
	/**
	 * Gets a product by id and user_id.
	 * @param prodcut
	 * @return
	 */
	Product getProductByUserId(Product product);
	
	/**
	 * Inserts a new product.
	 * @param product
	 */
	void insertProduct(Product product);
	
	/**
	 * Updates a product existing.
	 * @param product
	 */
	void updateProduct(Product product);
	
	/**
	 * 
	 * @return List with all the product for brand.
	 */
	List<Product> getAllProdcutByBrand(Select select);
	
	/**
	 * 
	 * @return List with all the product for category.
	 */
	List<Product> getAllProdcutByCategory(Select select);
	
	
	
	List<Product> getAllProdcutBySpecification(Select select);
	
	List<Product> getAllProdcutForProfit(Product product);
	
	List<Specification> getMainSpecificationByCategory(Long categoryId);
	
	/**
	 * Inserts a new model product or manufacture product id.
	 * @param productModelNumber
	 */
	void insertProductModelNumber(ProductModelNumber productModelNumber);
	
	/**
	 * Inserts a new product for all the users.
	 * @param product
	 */
	void insertProductToUsers(Product product);
	
	/**
	 * Updates a product model number existing.
	 * @param productModelNumber
	 */
	void updateProductModelNumber(ProductModelNumber productModelNumber);
	
	List<Product> getAllProdcut();
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	List<Product> getProductsClassification(Long userId);
	
	/**
	 * update all selling price by brand
	 * @param userBrandDiscount
	 */
	void updateSellingPriceBrand(UserBrandDiscount userBrandDiscount);
	
	/**
	 * update all selling price by category
	 * @param userCatDiscount
	 */
	void updateSellingPriceCategory(UserCategoryDiscount userCatDiscount);
	
	
	void updateSellingPriceProduct(Product product);
	
	/**
	 * delete a product model number existing.
	 * @param productModelNumber
	 */
	void deleteProductModelNumber(ProductModelNumber productModelNumber);
	
	/**
	 * get product list by brand or category
	 * @param product
	 * @return
	 */
	List<Product> getAllProductQuery(Query product);
	
	/**
	 * get product list by name
	 * @param name
	 * @return
	 */
	List<Product> getProductByName(Select select);
	
	List<Product> getAllProdcutByCategoryGroup(Select select);
	
	/**
	 * Inserts a new product link.
	 * @param productModelNumber
	 */
	void insertProductLink(ProductLink productLink);
	
	/**
	 * Updates a product link existing.
	 * @param productModelNumber
	 */
	void updateProductLink(ProductLink productLink);

	/**
	 * get all products which are discontinued.
	 * @return
	 */
	List<Product> getAllDiscontinuedProducts();
	
	/**
	 * After 1 month,
	 * all discontinued product status must change to 'Disabled'. 
	 * @param product
	 */
	void updateStatusToDisabled(Product product);
	
	/**
	 * get a product-object by giving the loyaltySourceProductId.
	 * @param product
	 * @return
	 */
	Product getProductIdFromLSProductId(String lSProductId);
	
	/**
	 * 
	 * @param lSProductId
	 * @return
	 */
	Product getProductByLsProductId(String lSProductId);
	
	/**
	 * Updates a product existing.
	 */
	void updateUserProductStatus(Product product);
	
	/**
	 * Inserts a new user_product_price-table object.
	 * @param userProductPrice
	 */
	void insertUserProductPrice(UserProductPrice userProductPrice);	
			
	/**
	 * Get all the userId-productId's relations from user_product_price table for a single productId
	 * @param select
	 * @return
	 */
	List<UserProductPrice> getUserProductPriceList(Select select);
	
	/**
	 * Get all the userId-productId's relations for only Active Users (including templates A, B and C)
	 * from user_product_price table for a single productId
	 * @param select
	 * @return
	 */
	List<UserProductPrice> getUserProductPriceForActiveUsersList(Select select);
		
	/**
	 * Update an existing userProductPrice object.
	 */	
	void updateUserProductPrice(UserProductPrice userProductPrice);
	
	/**
	 * Get an UserProductPrice by productId and userId.
	 * @param select
	 * @return
	 */
	UserProductPrice getUserProductPrice(Select select);
	
	/**
	 * Get all provinces.
	 * @param select
	 * @return
	 */
	List<Province> getAllProvinces();	
	
	/**
	 * Get all cities by provinceId.
	 * @param select
	 * @return
	 */
	List<City> getAllCities(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	City getMostPopularCitie(Select select);
	
	/**
	 * 
	 * @return
	 */
	List<City> getMostPopularCitiesList() ;
	
	/**
	 * Get all cities.
	 * @return
	 */
	List<City> getCities();
	
	/**
	 * Insert a new shippingCity Object.
	 * @param shippingCity
	 */
	void insertShippingCity(ShippingCity shippingCity);
	
	/**
	 * Insert a new shippingProvince Object.
	 * @param shippingProvince
	 */
	void insertShippingProvince(ShippingProvince shippingProvince);

	/**
	 * Insert a new shippingTotal Object.
	 * @param shippingTotal
	 */
	void insertShippingTotal(ShippingTotal shippingTotal);
	
	/**
	 * Update the shipping_coverage field from the user_product_price table.
	 * @param userProductPrice
	 */
	void updateUPPShippingCoverage(UserProductPrice userProductPrice);
	
	/**
	 * Update the shipping_total_canada field from the user_product_price table.
	 * @param userProductPrice
	 */
	void updateUPPShippingTotalCanada(UserProductPrice userProductPrice);	
	
	/**
	 * Get all products by category_group field from category DB-Table.
	 * @param select
	 * @return
	 */
	List<Product> getProductListByCategoryGroupId(Select select);
	
	/**
	 * Get products with status AVAILABLE and UNAVAILABLE by user_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProducts(Select select);	
	
	/**
	 * Get all products with status AVAILABLE and UNAVAILABLE.
	 * @return
	 */
	List<Product> getAllValidStatusProductsForAllUsers();
		
	/**
	 * Get the products by category_group_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProductsG(Select select);

	/**
	 * Get the products by category_group_id and category_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProductsGC(Select select);	
	
	/**
	 * Get the products by category_group_id, category_id and type_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProductsGCT(Select select);
	
	/**
	 * Get the products by category_group_id, category_id, type_id and brand_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProductsGCTB(Select select);

	/**
	 * Get the products by category_group_id, category_id and brand_id.
	 * @param select
	 * @return
	 */
	List<Product> getAllValidStatusProductsGCB(Select select);
	
	/**
	 * Get a product by its id [No user or status_id are ever needed].
	 * @param select
	 * @return
	 */
	/*
	Product getProductById(Select select);
	*/
	Product getProductById(Long productId);
	/**
	 * Update The 'expedited_parcel_price' value on shipping_city DB-Table by product_id and city_id. 
	 * @param shippingCity
	 * @return
	 */
	void updateShippingCityToExpeditedParcelPrice(ShippingCity shippingCity);	
	
	/**
	 * Get a shippingCity object by productId and cityId.
	 * @param select
	 * @return
	 */
	ShippingCity getShippingCity(Select select);	
	
	/**
	 * Update by product_id and province_id.
	 * @param shippingProvince
	 */
	void updateShippingProvince(ShippingProvince shippingProvince);
	
	/**
	 * Get All Products with same weight and dimensions.
	 * @param product
	 * @return
	 */
	List<Product> getValidProductIdByDim(Product product);	
	
	/**
	 * Get all shippingCity-objects with parcelPrice = 0.00.
	 * @param select
	 * @return
	 */
	List<ShippingCity> getShippingCityListWithZeroParcelPriceByCityId(Select select);	
	
	/**
	 * Get city by id.
	 * @param select
	 * @return
	 */
	City getCity(Select select);	
	
	/**
	 * 
	 * @param nameCity
	 * @return
	 */
	City getCityByName(String nameCity);
	
	
	/**
	 * Get province by id.
	 * @param select
	 * @return
	 */
	Province getProvince(Select select);	
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	Province getProvinceByCode(String code);
	/**
	 * Get weightedTotalProvince from ShippingProvince DB-Table.
	 * @param select
	 * @return
	 */
	ShippingProvince getWeightedTotalProvinceFromShippingProvince(Select select);
	
	
	/**
	 * Update by product_id, province_id and user_id.
	 * @param shippingTotal
	 */
	void updateShippingTotal(ShippingTotal shippingTotal);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	List<ShippingTotal> getShippingTotalList(Select select);
	
	
	/**
	 * Insert a userProvincePopulation-register.
	 * @param userProvincePopulation
	 */
	void insertUserProvincePopulation(UserProvincePopulation userProvincePopulation);	
	
	/**
	 * Get a UserProvincePopulation-object by user_id.
	 * @param select
	 * @return
	 */
	List<UserProvincePopulation> getUserProvincePopulationList(Select select);
	
	/**
	 * Update a UserProvincePopulation-object on from the Edit-User Web-Form.
	 * @param userProvincePopulation
	 */
	void updateUserProvincePopulation(UserProvincePopulation userProvincePopulation);
		
	/**
	 * Get all the ShippingCity's registers.
	 * @return
	 */
	List<ShippingCity> getAllShippingCity();
		
	/**
	 * Get all the ShippingProvince's registers.
	 * @return
	 */
	List<ShippingProvince> getAllShippingProvince();
	
	/**
	 * Get all the ShippingTotal's registers.
	 * @return
	 */
	List<ShippingTotal> getAllShippingTotal();
	
	/**
	 * Get all the UserProvincePopulation's registers.
	 * @return
	 */
	List<UserProvincePopulation> getAllUserProvincePopulation();
	
	/**
	 * Get all the UserProductPrice's registers.
	 * @return
	 */
	List<UserProductPrice> getAllUserProductPrice();
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	List<ShippingTotal> getShippingTotalListByUserId(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	List<UserProductPrice> getUserProductPriceByUserId(Select select);	
	
	/**
	 * Get a unique UserProvincePopulation-object by userId an provinceId.
	 * @param select
	 * @return
	 */
	UserProvincePopulation getUserProvincePopulation(Select select);
	
	/**
	 * Get ShippingCity-objects by greater than its id.
	 * @param id
	 * @return
	 */
	List<ShippingCity> getShippingCityByIDGreaterThan(Long id);
	
	/**
	 * Get ShippingProvince-objects by greater than its id.
	 * @param id
	 * @return
	 */
	List<ShippingProvince> getShippingProvinceByIDGreaterThan(Long id);
	
	/**
	 * Get ShippingTotal-objects by greater than its id.
	 * @param id
	 * @return
	 */
	List<ShippingTotal> getShippingTotalByIDGreaterThan(Long id);
	
	/**
	 * 
	 * @return
	 */
	List<Product> getAllValidProductIds();
	
	/**
	 * Get Product List by userId and isExcluded from UserProductPrice DB-Table.
	 * @param select
	 * @return
	 */
	List<Product> getValidProductsByUserIdAndExcluded(Select select);
	
	/**
	 * Get Product-objects by greater than its id.
	 * @param select
	 * @return
	 */
	List<Product> getValidProductsGreaterThanId(Select select);
	
	/**
	 * Get a ShippingTotal List by productId.
	 * @param select
	 * @return
	 */
	List<ShippingTotal> getShippingTotalListByProductId(Select select);
	
	/**
	 * Get UserProductPrice List by productId and where shippingTotalCanada is null.
	 * @param select
	 * @return
	 */
	List<UserProductPrice> getNullsShippingTotalCanadaOnUserProductPrice(Select select);
	
	/**
	 * Update name, desc, specs and other for the 'amender' user-type.
	 * @param product
	 */
	void updateAmendingProduct(Product product);	
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	AlterProductXML getAlterProductXMLByProductId(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	AlterUserProductXML getAlterUserProductXMLByProductIdAndUserId(Select select);
	
	/**
	 * 
	 * @param alterUserProductXML
	 */
	void updateAlterUserProductXML(AlterUserProductXML alterUserProductXML);
	
	/**
	 * 
	 * @param alterProductXML
	 */
	void updateAlterProductXML(AlterProductXML alterProductXML);
	
	/**
	 * 
	 * @param alterUserProductXML
	 */
	void insertAlterUserProductXML(AlterUserProductXML alterUserProductXML);
	
	/**
	 * 
	 * @param alterProductXML
	 */
	void insertAlterProductXML(AlterProductXML alterProductXML);
	
	/**
	 * 
	 * @return
	 */
	List<Product> getProductsAsOfConsideredForXML();	
	
	/**
	 * 
	 * @param select
	 */
	void closeProductConsideredForXML(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void closeAlterProductXML(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void closeAlterUserProductXML(Select select);	
	
	/**
	 * 
	 * @return
	 */
	List<Product> getWereWgtDimChangedFromProduct();
	
	/**
	 * 
	 * @param select
	 */
	void closeProductWereWgtDimChanged(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	ShippingProvince getShippingProvince(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	ShippingTotal getShippingTotal(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void saveOldImageIdBeforeUpdate(Select select);
	
	/**
	 * Get all the products between the interval including the bound limits.
	 * @param select
	 * @return
	 */
	List<Product> getProductBetween(Select select);
	
	/**
	 * 
	 */
	List<Product> getShippingRepeats(Product product);
	
	/**
	 * @return
	 */
	List<Product> getWereWgtDimChanged();
	
	/**
	 * @param brandId
	 * @param userID
	 * @return
	 */
	boolean excludeProductsByBrandAndUser(Long brandId, Long userId,Boolean exclude);
	
	/**
	 * @param brandId
	 * @param userId
	 * @return
	 */
	boolean isUserBrandExcluded(Long brandId, Long userId);
	
	/**
	 * 
	 * @param brandId
	 * @param userId
	 * @return
	 */
	boolean generatProfitByBrand(Long brandId, Long userId, String percentProfit);
	
	/**
	 * 
	 * @param categoryId
	 * @param userId
	 * @return
	 */
	
	boolean generatProfitByCategory(Long categoryId, Long userId,String percentProfit);
	
	/**
	 * 
	 * @param brandId
	 * @param userId
	 * @return
	 */
	Long nbProductActiveByBrand(Long brandId, Long userId);
	
	/**
	 * 
	 * @return
	 */
	List<Product> getAllProdcutAnyStatus();
	
	/**
	 * 
	 * @param userId
	 * @param lsProductId
	 * @return
	 */
	UserProductPrice getUsrPPriceByLsproductId(Long userId, String lsProductId);
	
	/**
	 * 
	 * @param userId
	 * @param productId
	 * @return
	 */
	UserProductPrice getUsrPPriceByProductId(Long userId, Long productId);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	List<UserProvincePopulation> getUserProvincePopulationByUserId(Select select);
	
	/**
	 * 	
	 * @param select
	 */
	void deleteShippingTotalByUserId(Select select);
		
	/**
	 * 
	 * @param select
	 */
	void deleteUserProductPriceByUserId(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void deleteAlterUserProductXMLByUserId(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void deleteUserProvincePopulationByUserId(Select select);
	
	/**
	 * 	
	 * @param select
	 * @return
	 */
	List<ShippingTotal> getShippingTotalByUserIdAndCreationDate(Select select);
	
	/**
	 * 
	 * @param select
	 * @return
	 */
	List<UserProductPrice> getUserProductPriceByUserIdAndCreationDate(Select select);
	
		
	/**
	 * Inserts a new user_product_price-table object including the shipping values.
	 * @param userProductPrice
	 */
	void insertUserProductPriceShipping(UserProductPrice userProductPrice);
	
	/**
	 * 
	 * @param select
	 */
	void transferUserOnUserProductPrice(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void transferUserOnShippingTotal(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void transferUserOnUserProvincePopulation(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void transferUserOnProfile(Select select);

	/**
	 * 
	 * @param productId
	 * @return
	 */
	Long isGroupProductID(Long productId);
	

	/**
	 * Get box and product_box infos by productId.
	 * @param productId
	 */
	Box getBoxByProductId(Long productId);
	
	/**
	 * Inserts a new box if doesn't exists and a new product_box if doesn't exists
	 * @param box
	 */
	void insertBoxAndProductBox(Box box);
	
	/**
	 * update product_box
	 * @param box
	 */
	void updateProductBox(Box box);
	
	/**
	 * update product_box by EST file excel if CP Not Verified
	 * @param box
	 */
	void updateProductBoxIfCpNotVerified(Box box);
	

	/**
	 * 
	 * @param inputList
	 * @return
	 */
	 //List<Product> getProductListInfoCompleted(List<Product> inputList);
	
	/**
	 * 
	 */
	 boolean updateStock(List<Product> listStock);
	 
	 /**
	  * 
	  * @param userId
	  * @param productId
	  * @return
	  */
	 boolean calculateShippingRate(Long userId,Long productId);
	 
	 /**
	  * 
	  * @param productList
	  * @return
	  */
	 List<Product> getProductNotFound(List<Product> productList);
	 
	 /**
	  * 
	  * @param product
	  * @return
	  */
	 boolean updateStockByLsProductId(Product product);
	 
	 /**
	 * Get List of Distinct Currency Symbols
	 * @param
	 */
	 List<Currency> getCurrencySymbols();
	 
	 /**
	  * Get List of Distinct Currency Symbols But not Canadian Dollar
	  * @return
	  */
	 List<Currency> getCurrenciesButNotCAD();
	 
	 /**
	 * Get Currency infos by currencySymbol.
	 * @param currencySymbol
	 */
	 Currency getCurrencyBySymbol(Currency currency);

	 /**
	 * update currency
	 * @param currency
	 */
	 void updateCurrency(Currency currency);
	 
	 /**
	  * 
	  * @param userId
	  * @return
	  */
	 boolean calculateShippingRateForAllProducts(Long userId);
	 /**
	  * 
	  * @param currency
	  * @return
	  */
	 Currency isCurrencyExists(Currency currency);
	 
	 /**
	  * 
	  * @param currency
	  */
	 void insertNewCurrency(Currency currency);
	 
	 /**
	  * 
	  * @param from
	  * @param to
	  * @param managerId
	  * @param updateDate
	  */
	 boolean transferToUserByCreationDate(Long from, Long to,Long managerId, Date updateDate);
	 
	 /**
	  * 
	  * @param userId
	  * @return
	  */
	 List<Product>getSaleActiveByUserId(Long userId);
	 
	 /**
	  * 
	  * @param productId
	  * @param userId
	  * @return
	  */
	 Product getSaleActiveByProductIdAndUserId(Long productId, Long userId);
	 
	 /**
	  * 
	  * @param productId
	  * @return
	  */
	 Product getSaleByProductId(Long productId);
	 
	 /**
	  * 
	  * @param product
	  */
	 Long  addProductSale(Product product);
	 
	 /**
	  * 
	  * @param product
	  */
	 void  addUserSale(Product product,List<Long> usersIdListSeleted);
	 /**
	  * 
	  * @param productSaleId
	  * @return
	  */
	 boolean isThereUserHavenThisSale(Long productSaleId);
	 
	 /**
	  * 
	  * @param productId
	  * @param userId
	  * @return
	  */
	 Product getSaleByProductIdAndUserId(Long productId, Long userId);
	 
	 /*
	  * 
	  */
	 public Boolean disableSaleWhenOutTime(Long userId);
	 /**
	  * 
	  * @param userProductPrice
	  */
	 void updateUserProductPriceByProductIdAndUserIDSumit(UserProductPrice userProductPrice);
	 
}
