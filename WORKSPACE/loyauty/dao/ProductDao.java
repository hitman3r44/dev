package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.Product;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Specification;
import com.loyauty.model.User;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;



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
	Product getProduct(Long productId);
	
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
	List<Product> getAllProdcutByBrand(Long brandId);
	
	/**
	 * 
	 * @return List with all the product for category.
	 */
	List<Product> getAllProdcutByCategory(Long categoryId);
	
	
	
	List<Product> getAllProdcutBySpecification(Long specificationId);
	
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
	List<Product> getAllProductQuery(Product product);
	
	/**
	 * get product list by name
	 * @param name
	 * @return
	 */
	List<Product> getProductByName(String name);

}
