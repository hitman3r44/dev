package com.loyauty.dao.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.ProductDao;
import com.loyauty.exception.ServiceException;
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
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserSessionDTO;

/**
 * Product DAO implementation.
 */
public class ProductDaoImpl extends BasicDaoImpl implements ProductDao{

	public ProductDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}

	@Override
	public Product getProduct(Select select) {
		return (Product) getSqlSession().selectOne(getNameSpace("getProductFromId"), select);
	}	
	
	@Override
	public Product getProductByUserId(Product prodcut) {		
		return (Product) getSqlSession().selectOne(getNameSpace("getProductFromIdAndUserId"), prodcut);
	}
	
	@Override
	public void insertProduct(Product product) {
		getSqlSession().insert(getNameSpace("insertProduct"), product);
		getSqlSession().update(getNameSpace("cleanDiscontinuedStartDate"), product);
	}
	
	@Override
	public void updateProduct(Product product) {
		getSqlSession().update(getNameSpace("updateProduct"), product);		
	}
	
	@Override
	public void updateUserProductStatus(Product product) {
		getSqlSession().update(getNameSpace("updateUserProductStatus"), product);		
	}	

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutByBrand(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllProdcutByBrand"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutByCategory(Select select){
		return getSqlSession().selectList(getNameSpace("getAllProdcutByCategory"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutBySpecification(Select select){
		return getSqlSession().selectList(getNameSpace("getAllProdcutBySpecification"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> getMainSpecificationByCategory(Long categoryId) {		
		return (List<Specification>) getSqlSession().selectList(getNameSpace("getMainSpecificationByCategory"), categoryId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutForProfit(Product product){
		List<Product>result=null;
		result=getSqlSession().selectList(getNameSpace("getAllProdcutForProfit"), product) ;
		return result;
	}
	
	@Override
	public void insertProductModelNumber(ProductModelNumber productModelNumber) {
		getSqlSession().insert(getNameSpace("insertProductModelNumber"), productModelNumber);
	}
	
	@Override
	public void updateProductModelNumber(ProductModelNumber productModelNumber) {
		getSqlSession().update(getNameSpace("updateProductModelNumber"), productModelNumber);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcut(){
		return getSqlSession().selectList(getNameSpace("getAllProdcut"));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductsClassification(Long userId){
		return getSqlSession().selectList(getNameSpace("getProductsClassification"),userId);
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
		getSqlSession().delete(getNameSpace("deleteProductModelNumber"), productModelNumber);		
	}
	
	@Override
	public void insertProductToUsers(Product product) {
		getSqlSession().insert(getNameSpace("insertProductToUsers"), product);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProductQuery(Query product) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getAllProductQuery"), product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByName(Select select) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductByName"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutByCategoryGroup(Select select){
		return getSqlSession().selectList(getNameSpace("getAllProdcutByCategoryGroup"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllDiscontinuedProducts() {
		return getSqlSession().selectList(getNameSpace("getAllDiscontinuedProducts"));
	}
	
	@Override
	public void insertProductLink(ProductLink productLink){
		getSqlSession().insert(getNameSpace("insertProductLink"), productLink);
	}
	
	@Override
	public void updateProductLink(ProductLink productLink) {
		getSqlSession().update(getNameSpace("updateProductLink"), productLink);		
	}

	@Override
	public void updateStatusToDisabled(Product product) {
		getSqlSession().update(getNameSpace("updateStatusToDisabled"), product);
	}
	
	@Override
	public Product getProductIdFromLSProductId(String lSProductId) {
		return (Product) getSqlSession().selectOne(getNameSpace("getProductIdFromLSProductId"), lSProductId);
	}
		
	@Override
	public Product getProductByLsProductId(String lSProductId) {
		Product product=null;
		try{
			product=(Product) getSqlSession().selectOne(getNameSpace("getProductByLsProductId"), lSProductId);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return product;
	}

	@Override
	public void insertUserProductPrice(UserProductPrice userProductPrice) {
		getSqlSession().insert(getNameSpace("insertUserProductPrice"), userProductPrice);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getUserProductPriceList(Select select) {
		return (List<UserProductPrice>) getSqlSession().selectList(getNameSpace("getUserProductPriceList"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getUserProductPriceForActiveUsersList(Select select) {
		return (List<UserProductPrice>) getSqlSession().selectList(getNameSpace("getUserProductPriceForActiveUsersList"), select);
	}
	
	@Override
	public void updateUserProductPrice(UserProductPrice userProductPrice) {
		getSqlSession().update(getNameSpace("updateUserProductPrice"), userProductPrice);
	}
	
	@Override
	public UserProductPrice getUserProductPrice(Select select) {
		return (UserProductPrice) getSqlSession().selectOne(getNameSpace("getUserProductPrice"), select);
	}
	
	
	@Override
	public UserProductPrice getUsrPPriceByLsproductId(Long userId, String lsProductId) {
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("lsProductId", lsProductId);
		return (UserProductPrice) getSqlSession().selectOne(getNameSpace("getUsrPPriceByLsproductId"), param);
	}
	
	
	@Override
	public UserProductPrice getUsrPPriceByProductId(Long userId, Long productId) {
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("productId", productId);
		return (UserProductPrice) getSqlSession().selectOne(getNameSpace("getUsrPPriceByProductId"), param);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Province> getAllProvinces() {
		return (List<Province>) getSqlSession().selectList(getNameSpace("getAllProvinces"));
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<City> getAllCities(Select select) {
		return (List<City>) getSqlSession().selectList(getNameSpace("getAllCities"), select);
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public City getMostPopularCitie(Select select) {
		return (City) getSqlSession().selectOne(getNameSpace("getMostPopularCitie"), select);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<City> getMostPopularCitiesList() {
		return (List<City>) getSqlSession().selectList(getNameSpace("getMostPopularCitiesList"));
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<City> getCities() {
		return (List<City>) getSqlSession().selectList(getNameSpace("getCities"));
	}
	
	@Override
	public void insertShippingCity(ShippingCity shippingCity) {
		getSqlSession().insert(getNameSpace("insertShippingCity"), shippingCity);
	}
	
	@Override
	public void insertShippingProvince(ShippingProvince shippingProvince) {
		getSqlSession().insert(getNameSpace("insertShippingProvince"), shippingProvince);
	}
	
	@Override
	public void insertShippingTotal(ShippingTotal shippingTotal) {
		getSqlSession().insert(getNameSpace("insertShippingTotal"), shippingTotal);
	}
	
	@Override
	public void updateUPPShippingCoverage(UserProductPrice userProductPrice) {
		getSqlSession().update(getNameSpace("updateUPPShippingCoverage"), userProductPrice);
	}
	
	@Override
	public void updateUPPShippingTotalCanada(UserProductPrice userProductPrice) {
		getSqlSession().update(getNameSpace("updateUPPShippingTotalCanada"), userProductPrice);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductListByCategoryGroupId(Select select) {
		return getSqlSession().selectList(getNameSpace("getProductListByCategoryGroupId"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProducts(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProducts"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsForAllUsers() {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsForAllUsers"));
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsG(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsG"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsGC(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsGC"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsGCT(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsGCT"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsGCTB(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsGCTB"), select);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidStatusProductsGCB(Select select) {
		return getSqlSession().selectList(getNameSpace("getAllValidStatusProductsGCB"), select);
	}
	/*
	@Override
	public Product getProductById(Select select) {
		return (Product) getSqlSession().selectOne(getNameSpace("getProductById"), select);
	}
	*/
	
	@Override
	public Product getProductById(Long productId) {
		return (Product) getSqlSession().selectOne(getNameSpace("getProductById"), productId);
	}
	
	
	@Override
	public void updateShippingCityToExpeditedParcelPrice(ShippingCity shippingCity) {
		getSqlSession().update(getNameSpace("updateShippingCityToExpeditedParcelPrice"), shippingCity);
	}

	@Override
	public ShippingCity getShippingCity(Select select) {
		return (ShippingCity) getSqlSession().selectOne(getNameSpace("getShippingCity"), select);
	}	

	@Override
	public void updateShippingProvince(ShippingProvince shippingProvince) {
		getSqlSession().update(getNameSpace("updateShippingProvince"), shippingProvince);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getValidProductIdByDim(Product product) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getValidProductIdByDim"), product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCity> getShippingCityListWithZeroParcelPriceByCityId(Select select) {
		return (List<ShippingCity>) getSqlSession().selectList(getNameSpace("getShippingCityListWithZeroParcelPriceByCityId"), select);		
	}
	
	@Override
	public City getCity(Select select) {
		return (City) getSqlSession().selectOne(getNameSpace("getCity"), select);
	}
	
	
	@Override
	public City getCityByName(String nameCity) {
		return (City) getSqlSession().selectOne(getNameSpace("getCityByName"), nameCity);
	}

	@Override 
	public Province getProvince(Select select) {
		return (Province) getSqlSession().selectOne(getNameSpace("getProvince"), select);		
	}	
	
	@Override
	public Province getProvinceByCode(String code){
		return (Province) getSqlSession().selectOne(getNameSpace("getProvinceByCode"), code);		
	}	
		
	@Override	
	public ShippingProvince getWeightedTotalProvinceFromShippingProvince(Select select) {
		return (ShippingProvince) getSqlSession().selectOne(getNameSpace("getWeightedTotalProvinceFromShippingProvince"), select);		
	}
	
	@Override
	public void updateShippingTotal(ShippingTotal shippingTotal) {
		getSqlSession().update(getNameSpace("updateShippingTotal"), shippingTotal);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getShippingTotalList(Select select) {
		return (List<ShippingTotal>) getSqlSession().selectList(getNameSpace("getShippingTotalList"), select);
	}
	
	@Override
	public void insertUserProvincePopulation(UserProvincePopulation userProvincePopulation) {
		getSqlSession().insert(getNameSpace("insertUserProvincePopulation"), userProvincePopulation);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProvincePopulation> getUserProvincePopulationList(Select select) {
		return (List<UserProvincePopulation>) getSqlSession().selectList(getNameSpace("getUserProvincePopulationList"), select);
	}	
	
	@Override
	public void updateUserProvincePopulation(UserProvincePopulation userProvincePopulation) {
		getSqlSession().update(getNameSpace("updateUserProvincePopulation"), userProvincePopulation);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCity> getAllShippingCity() {
		return (List<ShippingCity>) getSqlSession().selectList(getNameSpace("getAllShippingCity"));				
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingProvince> getAllShippingProvince() {
		return (List<ShippingProvince>) getSqlSession().selectList(getNameSpace("getAllShippingProvince"));			
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getAllShippingTotal() {
		return (List<ShippingTotal>) getSqlSession().selectList(getNameSpace("getAllShippingTotal"));			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProvincePopulation> getAllUserProvincePopulation() {
		return (List<UserProvincePopulation>) getSqlSession().selectList(getNameSpace("getAllUserProvincePopulation"));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getAllUserProductPrice() {
		return (List<UserProductPrice>) getSqlSession().selectList(getNameSpace("getAllUserProductPrice"));
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getShippingTotalListByUserId(Select select) {
		return (List<ShippingTotal>) getSqlSession().selectList(getNameSpace("getShippingTotalListByUserId"), select);	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getUserProductPriceByUserId(Select select) {
		return (List<UserProductPrice>) getSqlSession().selectList(getNameSpace("getUserProductPriceByUserId"), select);
	}
	
	@Override
	public UserProvincePopulation getUserProvincePopulation(Select select) {
		return (UserProvincePopulation) getSqlSession().selectOne(getNameSpace("getUserProvincePopulation"), select);				
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCity> getShippingCityByIDGreaterThan(Long id) {
		return (List<ShippingCity>) getSqlSession().selectList(getNameSpace("getShippingCityByIDGreaterThan"), id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingProvince> getShippingProvinceByIDGreaterThan(Long id) {
		return (List<ShippingProvince>) getSqlSession().selectList(getNameSpace("getShippingProvinceByIDGreaterThan"), id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getShippingTotalByIDGreaterThan(Long id) {
		return (List<ShippingTotal>) getSqlSession().selectList(getNameSpace("getShippingTotalByIDGreaterThan"), id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllValidProductIds() {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getAllValidProductIds"));
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getValidProductsByUserIdAndExcluded(Select select) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getValidProductsByUserIdAndExcluded"), select);		
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getValidProductsGreaterThanId(Select select) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getValidProductsGreaterThanId"), select);		
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getShippingTotalListByProductId(Select select) {
		return (List<ShippingTotal>) getSqlSession().selectList(getNameSpace("getShippingTotalListByProductId"), select);		
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getNullsShippingTotalCanadaOnUserProductPrice(Select select) {
		return (List<UserProductPrice>) getSqlSession().selectList(getNameSpace("getNullsShippingTotalCanadaOnUserProductPrice"), select);
	}
	
	@Override
	public void updateAmendingProduct(Product product) {
		getSqlSession().update(getNameSpace("updateAmendingProduct"), product);
	}
	
	@Override
	public AlterProductXML getAlterProductXMLByProductId(Select select) {
		return (AlterProductXML) getSqlSession().selectOne(getNameSpace("getAlterProductXMLByProductId"), select);
	}
	
	@Override
	public AlterUserProductXML getAlterUserProductXMLByProductIdAndUserId(Select select) {
		return (AlterUserProductXML) getSqlSession().selectOne(getNameSpace("getAlterUserProductXMLByProductIdAndUserId"), select);
	}	
	
	@Override
	public void updateAlterUserProductXML(AlterUserProductXML alterUserProductXML) {
		getSqlSession().update(getNameSpace("updateAlterUserProductXML"), alterUserProductXML);
	}	
	
	@Override
	public void updateAlterProductXML(AlterProductXML alterProductXML) {
		getSqlSession().update(getNameSpace("updateAlterProductXML"), alterProductXML);
	}
	
	@Override
	public void insertAlterUserProductXML(AlterUserProductXML alterUserProductXML) {
		getSqlSession().insert(getNameSpace("insertAlterUserProductXML"), alterUserProductXML);
	}
	
	@Override
	public void insertAlterProductXML(AlterProductXML alterProductXML) {
		getSqlSession().insert(getNameSpace("insertAlterProductXML"), alterProductXML);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductsAsOfConsideredForXML() {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductsAsOfConsideredForXML"));
	}
	
	@Override
	public void closeProductConsideredForXML(Select select) {
		getSqlSession().update(getNameSpace("closeProductConsideredForXML"), select);
	}

	@Override
	public void closeAlterProductXML(Select select) {
		getSqlSession().update(getNameSpace("closeAlterProductXML"), select);
	}
	
	@Override
	public void closeAlterUserProductXML(Select select) {
		getSqlSession().update(getNameSpace("closeAlterUserProductXML"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getWereWgtDimChangedFromProduct() {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getWereWgtDimChangedFromProduct"));	
	}
	
	@Override	
	public void closeProductWereWgtDimChanged(Select select) {
		getSqlSession().update(getNameSpace("closeProductWereWgtDimChanged"), select);
	}
	
	@Override	
	public ShippingProvince getShippingProvince(Select select) {
		return (ShippingProvince) getSqlSession().selectOne(getNameSpace("getShippingProvince"), select);
	}	
	
	@Override	
	public ShippingTotal getShippingTotal(Select select) {
		return (ShippingTotal) getSqlSession().selectOne(getNameSpace("getShippingTotal"), select);
	}
	
	@Override
	public void saveOldImageIdBeforeUpdate(Select select) {
		getSqlSession().update(getNameSpace("saveOldImageIdBeforeUpdate"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductBetween(Select select) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductBetween"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getShippingRepeats(Product product) {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getShippingRepeats"), product);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getWereWgtDimChanged() {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getWereWgtDimChanged"));
	}

	@Override
	public boolean excludeProductsByBrandAndUser(Long brandId, Long userId, Boolean exclude) {
		boolean result=false;
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("brandId", brandId);    
		userMap.put("userId", userId);
		userMap.put("exclude", exclude);
		int success=getSqlSession().update(getNameSpace("excludeProductsByBrandAndUser"), userMap);
		if(success==0)result=true;
		return result;

	}
	
	@Override
	public boolean isUserBrandExcluded(Long brandId, Long userId){
		boolean result=false;
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("brandId", brandId);  
		userMap.put("userId", userId);
		UserProductPrice upp=(UserProductPrice)getSqlSession().selectOne(getNameSpace("isUserBrandExcluded"), userMap);
		if(upp.getCount()==0)result=true;
		return result;
		
	}

	@Override
	public boolean generatProfitByBrand(Long brandId, Long userId,String percentProfit) {
		boolean result=false;
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("brandId", brandId);    
		userMap.put("userId", userId);
		userMap.put("percentProfit", percentProfit);
		int success=getSqlSession().update(getNameSpace("generatProfitByBrand"), userMap);
		if(success==0)result=true;
		return result;
		
	}

	@Override
	public boolean generatProfitByCategory(Long categoryId, Long userId,String percentProfit) {
		boolean result=false;
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("categoryId", categoryId);    
		userMap.put("userId", userId);
		userMap.put("percentProfit", percentProfit);
		int success=getSqlSession().update(getNameSpace("generatProfitByCategory"), userMap);
		if(success==0)result=true;
		return result;
	}

	@Override
	public Long nbProductActiveByBrand(Long brandId, Long userId) {
		Long result=1L;
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("brandId", brandId);    
		userMap.put("userId", userId);
		UserProductPrice upp=(UserProductPrice)getSqlSession().selectOne(getNameSpace("nbProductActiveByBrand"), userMap);
		if(upp!=null)result=upp.getCount();
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdcutAnyStatus() {
		return (List<Product>) getSqlSession().selectList(getNameSpace("getAllProdcutAnyStatus"));
	}
	
	@Override
	public void deleteShippingTotalByUserId(Select select) {
		getSqlSession().delete(getNameSpace("deleteShippingTotalByUserId"), select);
	}
	
	@Override
	public void deleteUserProductPriceByUserId(Select select) {
		getSqlSession().delete(getNameSpace("deleteUserProductPriceByUserId"), select);
	}
	
	@Override
	public void deleteAlterUserProductXMLByUserId(Select select) {
		getSqlSession().delete(getNameSpace("deleteAlterUserProductXMLByUserId"), select);
	}
	
	@Override
	public void deleteUserProvincePopulationByUserId(Select select) {
		getSqlSession().delete(getNameSpace("deleteUserProvincePopulationByUserId"), select);
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotal> getShippingTotalByUserIdAndCreationDate(Select select) {
		return getSqlSession().selectList(getNameSpace("getShippingTotalByUserIdAndCreationDate"), select);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPrice> getUserProductPriceByUserIdAndCreationDate(Select select) {
		return getSqlSession().selectList(getNameSpace("getUserProductPriceByUserIdAndCreationDate"), select);		
	}
	
	@Override
	public void insertUserProductPriceShipping(UserProductPrice userProductPrice) {
		getSqlSession().insert(getNameSpace("insertUserProductPriceShipping"), userProductPrice);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProvincePopulation> getUserProvincePopulationByUserId(Select select) {
		return (List<UserProvincePopulation>) getSqlSession().selectList(getNameSpace("getUserProvincePopulationByUserId"), select);
	}

	@Override
	public void transferUserOnUserProductPrice(Select select) {
		getSqlSession().insert(getNameSpace("transferUserOnUserProductPrice"), select);
	}
	
	@Override
	public void transferUserOnShippingTotal(Select select) {
		getSqlSession().insert(getNameSpace("transferUserOnShippingTotal"), select);
	}
	
	@Override
	public void transferUserOnUserProvincePopulation(Select select) {
		getSqlSession().insert(getNameSpace("transferUserOnUserProvincePopulation"), select);		
	}

	@Override
	public void transferUserOnProfile(Select select){
		getSqlSession().update(getNameSpace("transferUserOnProfile"), select);		
	}

	@Override
	public boolean transferToUserByCreationDate(Long from, Long to,Long managerId, Date updateDate){
		boolean result=false;
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("from", from);
		param.put("to", to);
		param.put("managerId", managerId);
		param.put("updateDate", updateDate);
		int scuccess=(Integer)getSqlSession().update(getNameSpace("transferToUserByCreationDateLatest"), param);
		if(scuccess==0)result=true;
		return result;
	}
	
	
	@Override
	public Long isGroupProductID(Long productId) {
		Long count = 0L;
		count= (Long) getSqlSession().selectOne(getNameSpace("isGroupProductID"), productId);
		return count;
	}

	
	@Override
	public Box getBoxByProductId(Long productId) {
		return (Box) getSqlSession().selectOne(getNameSpace("getBoxByProductId"), productId);
	}
	
	@Override
	public void insertBoxAndProductBox(Box box) {
		getSqlSession().insert(getNameSpace("insertBoxAndProductBox"), box);
	}
	
	@Override
	public void updateProductBox(Box box) {
		getSqlSession().update(getNameSpace("updateProductBox"), box);
	}
	
	@Override
	public void updateProductBoxIfCpNotVerified(Box box) {
		getSqlSession().update(getNameSpace("updateProductBoxIfCpNotVerified"), box);
	}
	

	
	/*@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductListInfoCompleted(List<Product> inputList){
		for(Product pro:inputList){
			System.out.println("Product="+pro.getLoyaltySourceProductId()+"   ->"+pro.getStock());
		}
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("inputList", inputList);
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductListInfoCompleted"), param);
	}*/
	


	// Update Stock	
	@SuppressWarnings("unchecked")
	@Override
	public boolean updateStock(List<Product> listStock){ 
		boolean result = false;
		
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("listStock", listStock);
		
		int success=(Integer)getSqlSession().update(getNameSpace("updateStock"), param);
		if(success==0)result=true;

		return result;
	}


	// calculate Shipping Rate using shipping_city	
	@SuppressWarnings("unchecked")
	@Override
	public boolean calculateShippingRate(Long userId,Long productId){ 
		boolean result = false;
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("productId", productId);
		int success=(Integer)getSqlSession().update(getNameSpace("calculateShippingRate"), param);
		if(success>=0)result=true;

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductNotFound(List<Product> productList){
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("productList", productList);
		return (List<Product>) getSqlSession().selectList(getNameSpace("getProductNotFound"), param);
	}
	
	
	@Override
	public boolean updateStockByLsProductId(Product product){
		boolean result=false;
		int success=(Integer)getSqlSession().update(getNameSpace("updateStockByLsProductId"), product);
		if(success==0)result=true;
		return result;	
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Currency> getCurrencySymbols() {
		return (List<Currency>) getSqlSession().selectList(getNameSpace("getCurrencySymbols"));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Currency> getCurrenciesButNotCAD() {
		return (List<Currency>) getSqlSession().selectList(getNameSpace("getCurrenciesButNotCAD"));
	}
	
	@Override
	public Currency getCurrencyBySymbol(Currency currency) {
		return (Currency) getSqlSession().selectOne(getNameSpace("getCurrencyBySymbol"), currency);
	}
	
	@Override
	public void updateCurrency(Currency currency) {
		getSqlSession().update(getNameSpace("updateCurrency"), currency);
	}
	
	@Override
	public Currency isCurrencyExists(Currency currency) {
		return (Currency) getSqlSession().selectOne(getNameSpace("isCurrencyExists"), currency);
	}
	
	@Override
	public void insertNewCurrency(Currency currency) {
		getSqlSession().insert(getNameSpace("insertNewCurrency"), currency);
	}
	
	@Override
	public boolean calculateShippingRateForAllProducts(Long userId){
		boolean result=false;
		HashMap<String, Object>param=new HashMap<String, Object>();
		param.put("userId", userId);
		int success=getSqlSession().update(getNameSpace("calculateShippingRateForAllProducts"), userId);
		if(success>=0)result=true;
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product>getSaleActiveByUserId(Long userId){
		List<Product> result=(List<Product>) getSqlSession().selectList(getNameSpace("getSaleActiveByUserId"),userId);
		if(result==null)result=new ArrayList<Product>();
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public  Product getSaleActiveByProductIdAndUserId(Long productId, Long userId){
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("productId", productId);
		param.put("userId", userId);
		Product result=(Product) getSqlSession().selectOne(getNameSpace("getSaleActiveByProductIdAndUserId"),param);
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public  Product getSaleByProductId(Long productId){
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("productId", productId);
		Product result=(Product) getSqlSession().selectOne(getNameSpace("getSaleByProductId"),param);
		return result;
	}

	
	@Override
	
	public Long addProductSale(Product product) {
		Long productSaleId=-1L;
		Product result =(Product)getSqlSession().selectOne(getNameSpace("addProductSale"), product);
		if(result!=null && result.getId()!=null && result.getId()!=0L)productSaleId=result.getId();
		return productSaleId;
	}
	
	
	@Override
	public void addUserSale(Product product,List<Long> usersIdListSeleted) {
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("product", product);
		param.put("usersIdListSeleted", usersIdListSeleted);
		getSqlSession().insert(getNameSpace("addUserSale"), param);
	} 
	
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean isThereUserHavenThisSale(Long productSaleId){
		boolean result=true;
		List<Product> productList=(List<Product>) getSqlSession().selectList(getNameSpace("isThereUserHavenThisSale"),productSaleId);
		if(productList==null)productList=new ArrayList<Product>();
		if(productList.size()>0)result=false;
		return result;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public  Product getSaleByProductIdAndUserId(Long productId, Long userId){
		HashMap<Object, Object>param=new HashMap<Object, Object>();
		param.put("productId", productId);
		param.put("userId", userId);
		Product result=(Product) getSqlSession().selectOne(getNameSpace("getSaleByProductIdAndUserId"),param);
		return result;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public Boolean disableSaleWhenOutTime(Long userId){
		Integer result=(Integer)getSqlSession().update(getNameSpace("disableSaleWhenOutTime"),userId);
		//if(ordersListResult==null)ordersListResult=new ArrayList<Orders>();
		return false;
	}
	
	@Override
	public void updateUserProductPriceByProductIdAndUserIDSumit(UserProductPrice userProductPrice){
		getSqlSession().update(getNameSpace("updateUserProductPriceByProductIdAndUserIDSumit"), userProductPrice);
		
	}
	

	
}
