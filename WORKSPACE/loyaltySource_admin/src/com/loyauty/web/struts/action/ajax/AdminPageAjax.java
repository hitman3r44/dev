package com.loyauty.web.struts.action.ajax;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang.time.DateFormatUtils;
import com.loyauty.enums.UserProductStatus;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.service.brand.BrandService;
import com.loyauty.service.category.CategoryService;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.QueryDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.CommonUtils;
import com.loyauty.web.exception.LoyautyAjaxActionException;
import com.loyauty.web.struts.action.LoyautyListActionSupport;




public class AdminPageAjax<T> extends LoyautyListActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private static final String LOYALTY_DATE_FORMAT_DD_MMMM_YYYY_KEY = "loyauty.date.format.dd-MM-YYYY";
	
	private UserService userService;
	private CommonService commonService;
	private BrandService brandService;
	private CategoryService categoryService;
	private ProductService productService;
	private SpecificationService specificationService;
	
	private static String AA_DATA = "aaData";
	private static String USER_DISCOUNT = "userDiscount";
	private static final String CODE_BRAND = "codeBrand";
	
	private static int USER_TYPE = 2;	
	
	@Getter @Setter
	private int typePage; 
	@Getter @Setter
	private long brandId;
	@Getter @Setter
	private long categoryId;
	@Getter @Setter
	private boolean discontinued;
	@Getter @Setter
	private boolean disabled;
	@Getter @Setter
	private long userId;	

	@Getter @Setter
	private String value;
	@Getter @Setter
	private String oldValue;
	@Getter @Setter
	private long productId;	
	@Getter @Setter
	List<UserSessionDTO> dataLinks;
	
	@Getter
	private int userProductStatus;

	@Getter @Setter
	private Integer userStatus;
	
	public AdminPageAjax() {		
	}
	
	
	@Override  
	public String execute() throws Exception {							
		dataLinks = new ArrayList<UserSessionDTO>();
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		userService = this.getServiceLocator().getUserService();
		basicUserDTO.setTypeId(USER_TYPE);
		try{
			if(userStatus==null)userStatus=-1;
			switch (userStatus) {
			case 1:
				basicUserDTO.setActive(true);			
				dataLinks = userService.getAllUserAccounts(basicUserDTO);
				break;
			case 2:
				basicUserDTO.setActive(false);			
				dataLinks = userService.getAllUserAccounts(basicUserDTO);
				break;	
			default:
				dataLinks = userService.getAllUsers(basicUserDTO);
				break;
			}

			 return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}

	}
		
	@SuppressWarnings("unchecked")
	public String accountsList() throws LoyautyAjaxActionException, ServiceException {		
		dataLinks = new ArrayList<UserSessionDTO>();
		try {			
			userService = this.getServiceLocator().getUserService();
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			dataLinks = userService.getAllUsers(basicUserDTO);
			for(BasicUserDTO bu:dataLinks){
				if(bu.getClientCategoryName()==null)bu.setClientCategoryName("");
			}
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		setResult(map);		
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String populateCategoryAndDiscount() throws LoyautyAjaxActionException, ServiceException {		
		List<CommonDTO> dataLinks = null;
		String discount = null;
		try {			
			commonService = this.getServiceLocator().getCommonService();	
			userService = this.getServiceLocator().getUserService();
			productService =  this.getServiceLocator().getProductService();			
			dataLinks = internationalizeName(commonService.getCategoriesByBrand(brandId));
		} catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		map.put(USER_DISCOUNT, (T) discount);
		setResult(map);		
		return  SUCCESS;		
	}
	
	private List<CommonDTO> internationalizeName(List<CategoryDTO> list){
		
		List<CommonDTO> commonListDTO = new ArrayList<CommonDTO>();
		CommonDTO commonDTO;
		for(CategoryDTO cat : list){
			commonDTO = CommonDTO.valueOf(cat.getId(), getText(cat.getCode()));			
			commonListDTO.add(commonDTO);
		}		
		return commonListDTO;		
	}	
	
	@SuppressWarnings("unchecked")
	public String getProductAndDiscountByCategory() throws LoyautyAjaxActionException, ServiceException {
		List<CommonDTO> dataLinks = null;
		String discount = null;
		try {
			commonService = this.getServiceLocator().getCommonService();	
			userService = this.getServiceLocator().getUserService();
			productService = this.getServiceLocator().getProductService();			
			dataLinks = internationalizeName(commonService.getCategoriesByBrand(brandId));			
		} catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		map.put(USER_DISCOUNT, (T) discount);
		setResult(map);
		
		return  SUCCESS;		
	}	
	
	@SuppressWarnings("unchecked")
	public String brandList() throws LoyautyAjaxActionException, ServiceException {	
				
		List<BrandDTO> dataLinks = new ArrayList<BrandDTO>();
		try {			
			brandService = this.getServiceLocator().getBrandService();
			dataLinks = brandService.getAllBrand();
			for(BrandDTO dto : dataLinks) {
				dto.setLocalizedCreationDate(DateFormatUtils.format(dto.getCreationDate(), getText(LOYALTY_DATE_FORMAT_DD_MMMM_YYYY_KEY)));
			}
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		setResult(map);
		
		return  SUCCESS;
		
	}
	
	@SuppressWarnings("unchecked")
	public String categoryList() throws LoyautyAjaxActionException, ServiceException {	
				
		List<CategoryDTO> dataLinks = new ArrayList<CategoryDTO>();
		try {			
			categoryService = this.getServiceLocator().getCategoryService();
			dataLinks = categoryService.getAllCategory();
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		setResult(map);
		
		return  SUCCESS;		
	}	
	
	@SuppressWarnings("unchecked")
	public String getMainSpecificationByCategory() throws LoyautyAjaxActionException, ServiceException {	
				
		List<SpecificationDTO> dataLinks = new ArrayList<SpecificationDTO>();
		try {			
			productService = this.getServiceLocator().getProductService();
			dataLinks = productService.getMainSpecificationByCategory(categoryId);
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		setResult(map);
		
		return  SUCCESS;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public String populateCategory() throws LoyautyAjaxActionException, ServiceException {	
		
		List<CommonDTO> dataLinks = null;
		String code = new String();
		try {			
			
			commonService = getServiceLocator().getCommonService();	
			brandService = getServiceLocator().getBrandService();
			
			dataLinks = internationalizeName(commonService.getCategoriesByBrand(brandId));
			code = brandService.getBrand(brandId).getCode();
						
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		} catch (Exception e) {}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataLinks);
		map.put(CODE_BRAND, (T)code);
		setResult(map);
		
		return  SUCCESS;		
	}	
	
	@SuppressWarnings("unchecked")
	public String setManuelPrices() throws LoyautyAjaxActionException, ServiceException {	
		
		try {			
			double val = Double.valueOf(value);
			productService = this.getServiceLocator().getProductService();
			UserProductDTO producDTO = new UserProductDTO();
			producDTO.setUserId(userId);
			producDTO.setId(productId);
			producDTO.setUserPrice(value);			
			productService.updateSellingPriceProduct(producDTO);
			setResult(val);		
			
		}catch(NumberFormatException se){
			log.debug("Number Conversion Exception pb", se);				
			setResult(oldValue.isEmpty()?"NaN" : Double.valueOf(oldValue));
		}catch(ServiceLocatorException se){			
			log.debug("Service Locator Exception pb", se);				
			setResult(oldValue.isEmpty()?"NaN" : Double.valueOf(oldValue));
		}catch(ServiceException se){
			log.debug("Service Exception pb", se);
			setResult(oldValue.isEmpty()?"NaN" : Double.valueOf(oldValue));
		}catch(Exception se){
			log.debug("Exception pb", se);
			setResult(oldValue.isEmpty()?"NaN" : Double.valueOf(oldValue));
		}		
		return  SUCCESS;	
	}
	
	@SuppressWarnings("unchecked")
	public String setuserproductstatus() throws LoyautyAjaxActionException, ServiceException {	
		
		try {
			
			Boolean val = Boolean.valueOf(value);			
			productService = this.getServiceLocator().getProductService();	
			UserProductDTO producDTO = new UserProductDTO();
			producDTO.setUserId(userId);
			producDTO.setId(productId);
			if(Boolean.valueOf(value))
				producDTO.setUserProductStatus(UserProductStatus.ACTIVE);
			else
				producDTO.setUserProductStatus(UserProductStatus.INACTIVE);
			productService.updateUserProductStatus(producDTO);
			setResult(val);		
			
		} catch(NumberFormatException se){
			log.debug("Number Conversion Exception pb", se);				
			setResult(oldValue.isEmpty()?"NaN" : Boolean.valueOf(oldValue));
		} catch(ServiceLocatorException se){			
			log.debug("Service Locator Exception pb", se);				
			setResult(oldValue.isEmpty()?"NaN" : Boolean.valueOf(oldValue));
		
		} catch(Exception se){
			log.debug("Exception pb", se);
			setResult(oldValue.isEmpty()?"NaN" : Boolean.valueOf(oldValue));
		}		
		
		return  SUCCESS;
		
	}
	
	@SuppressWarnings("unchecked")
	public String productList() throws LoyautyAjaxActionException, ServiceException {				
		List<ProductDTO> dataList = new ArrayList<ProductDTO>();
		try {			
			productService = this.getServiceLocator().getProductService();
			dataList = productService.getAllProdcut();
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataList);
		setResult(map);
		return  SUCCESS;		
	}
	
	@SuppressWarnings("unchecked")
	public String productListQuery() throws LoyautyAjaxActionException, ServiceException {	
		
		List<ProductDTO> dataList = new ArrayList<ProductDTO>();
		try {
			productService = this.getServiceLocator().getProductService();
			
			// = new ProductDTO();
			BrandDTO brandDTO = BrandDTO.valueOf(brandId);
			CategoryDTO catDTO = CategoryDTO.valueOf(categoryId);
			QueryDTO queryDTO = new QueryDTO.Builder(brandDTO, catDTO, discontinued, disabled).build();
			// ProductDTO dto = new ProductDTO.Builder(new Long(0), brandDTO, catDTO).build();
			dataList = productService.getAllProductQuery(queryDTO);
						
		} catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataList);
		setResult(map);
		
		return  SUCCESS;		
	}
	
	@SuppressWarnings("unchecked")
	public String getMainSpecificationList() throws LoyautyAjaxActionException, ServiceException {	
				
		List<SpecificationDTO> dataList = new ArrayList<SpecificationDTO>();
		try {
			specificationService = this.getServiceLocator().getSpecificationService();
			dataList = specificationService.getAllMainSpecification();
		}catch(ServiceLocatorException sle){
			log.debug("Service Locator Exception pb", sle);			
		}
		//serialize result
		Map<String, T> map = new HashMap<String, T>();
		map.put(AA_DATA, (T) dataList);
		setResult(map);
		
		return  SUCCESS;		
	}
	
}
