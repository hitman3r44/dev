package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.ProductDao;
import com.loyauty.model.Product;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Specification;
import com.loyauty.model.User;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;


/**
 * Product DAO implementation.
 *
 * @author Manuel
 *
 */
public class ProductDaoImpl extends BasicDaoImpl implements ProductDao{

	public ProductDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}

	@Override
	public Product getProduct(Long productId) {		
		return (Product) getSqlSession().selectOne(getNameSpace("getProductFromId"), productId);
	}	
	
	@Override
	public Product getProductByUserId(Product prodcut) {		
		return (Product) getSqlSession().selectOne(getNameSpace("getProductFromIdAndUserId"), prodcut);
	}	
	
	@Override
	public void insertProduct(Product prodcut) {
		getSqlSession().insert(getNameSpace("insertProduct"), prodcut);
	}
	
	@Override
	public void updateProduct(Product product) {
		getSqlSession().insert(getNameSpace("updateProduct"), product);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutByBrand(Long brandId){
		return getSqlSession().selectList(getNameSpace("getAllProdcutByBrand"), brandId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutByCategory(Long categoryId){
		return getSqlSession().selectList(getNameSpace("getAllProdcutByCategory"), categoryId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutBySpecification(Long specificationId){
		return getSqlSession().selectList(getNameSpace("getAllProdcutBySpecification"), specificationId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> getMainSpecificationByCategory(Long categoryId) {		
		return (List<Specification>) getSqlSession().selectList(getNameSpace("getMainSpecificationByCategory"), categoryId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutForProfit(Product product){
		return getSqlSession().selectList(getNameSpace("getAllProdcutForProfit"), product) ;
	}

	@Override
	public void insertProductModelNumber(ProductModelNumber productModelNumber) {
		getSqlSession().insert(getNameSpace("insertProductModelNumber"), productModelNumber);
	}
	
	@Override
	public void updateProductModelNumber(ProductModelNumber productModelNumber) {
		getSqlSession().insert(getNameSpace("updateProductModelNumber"), productModelNumber);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcut(){
		return getSqlSession().selectList(getNameSpace("getAllProdcut"));
	}

	@Override
	public void updateSellingPriceBrand(UserBrandDiscount userBrandDiscount) {
		getSqlSession().update(getNameSpace("updateSellingPriceBrand"), userBrandDiscount);
	}

	@Override
	public void updateSellingPriceCategory(UserCategoryDiscount userCatDiscount) {
		getSqlSession().update(getNameSpace("updateSellingPriceCategory"), userCatDiscount);
		
	}

	@Override
	public void updateSellingPriceProduct(Product product) {
		getSqlSession().update(getNameSpace("updateSellingPriceProduct"), product);		
	}

	@Override
	public void deleteProductModelNumber(ProductModelNumber productModelNumber) {
		getSqlSession().insert(getNameSpace("deleteProductModelNumber"), productModelNumber);		
	}
	
	@Override
	public void insertProductToUsers(Product product) {
		getSqlSession().insert(getNameSpace("insertProductToUsers"), product);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProductQuery(Product product) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getAllProductQuery"), product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByName(String name) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductByName"), name);
	}
}
