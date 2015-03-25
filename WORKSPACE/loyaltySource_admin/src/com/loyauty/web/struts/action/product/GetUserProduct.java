package com.loyauty.web.struts.action.product;

import java.util.ArrayList;
import java.util.List;
import com.loyauty.util.CommonUtils;

import com.loyauty.util.text.StringUtils;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.enums.UserProductStatus;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.CommonUserDiscountDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;
import com.loyauty.enums.ProductStatus;

public class GetUserProduct extends LoyautyAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private ProductService productService;
	private CommonService commonService;
	
	@Getter @Setter
	private long brand;
	@Getter @Setter
	private long category;
	@Getter @Setter
	private long userId;	
	@Getter @Setter
	private String userName;
	@Getter @Setter
	private List<UserProductDTO> userProductList;
	@Getter @Setter
	private List<CommonDTO> categoryList;
	@Getter @Setter
	private String brandDiscount;
	@Getter @Setter
	private String categoryDiscount;
	@Getter @Setter
	private int actionDiscount;
	@Getter @Setter
	private List<CommonDTO> brandList;
	//User Product Status
	@Getter @Setter
	private List<CommonDTO> upstatusList;
	@Getter @Setter
	private Integer upstatus;

	@Getter @Setter
	private ProductStatus productStatus;
	@Getter @Setter
	private String lsProductManufacture;

	@Getter @Setter
	private Boolean brandExcluded=false;
	@Getter @Setter
	private Long brandExcludedSignal;
	@Getter @Setter
	private String msgConfirmation;
	@Getter @Setter
	private Long cancelBrandExcludedSignal;
	@Getter @Setter
	private Long brandChangedSignal;
	@Getter @Setter
	private Long productListSignal;
	@Getter @Setter
	private Long activeChangedSignal;
	@Getter @Setter
	private Long productIdToUpdateStatus;
	@Getter @Setter
	private Integer userPrStatus;
	@Getter @Setter
	private Long categoryDiscountSignal;
	@Getter @Setter
	private Long nbProductActiveByBrand;
	public GetUserProduct() throws ServiceLocatorException {
		super();
		productService = this.getServiceLocator().getProductService();
		commonService = this.getServiceLocator().getCommonService();
	}
	
	@Override
	public void prepare() throws ServiceException {		
		brandList = commonService.getBrands();
		upstatusList = commonService.getUserProductStatusGroup();
	}
	
	
	@Override  
	public String execute() throws Exception {	
		try {
			if(activeChangedSignal==1L){
				UserProductDTO upDTO=new UserProductDTO();
				upDTO.setUserId(userId);
				upDTO.setId(productIdToUpdateStatus);
				upDTO.setUserProductStatus((UserProductStatus) CommonUtils.enumFromValue(UserProductStatus.values(), userPrStatus) );
				productService.updateUserProductStatus(upDTO);
				nbProductActiveByBrand=productService.nbProductActiveByBrand(brand, userId);
				showResultList();
				return SUCCESS;
				
			}

			if(brandExcludedSignal==1L){
				nbProductActiveByBrand=productService.nbProductActiveByBrand(brand, userId);
				if(nbProductActiveByBrand==0L)productService.excludeProductsByBrandAndUser(brand, userId,brandExcluded);
				// generate the list
				showResultList();
				return SUCCESS;
				
			}

			if(productListSignal==1L){
				// generate the list
				
				showResultList();
				return SUCCESS;
				
			}

			if(brand!=-1L)brandExcluded=productService.isUserBrandExcluded(brand, userId);
			
			if(cancelBrandExcludedSignal==1L || brandChangedSignal==1L){
			//if(cancelBrandExcludedSignal==1L){
				// generate the list
				nbProductActiveByBrand=productService.nbProductActiveByBrand(brand, userId);
				showResultList();
				return SUCCESS;
			}
			if(categoryDiscountSignal==1L){
			if(actionDiscount == WebConstants.GENERATE_DISCOUNT_BY_BRAND) {
				boolean valid = true;
				if( brand < 0 ){
					this.addActionError(getText("loyauty.error.common.brand_required"));	
					valid = false;
				}
				if(! StringUtils.isDoubleNumber(brandDiscount)){					
					this.addActionError(getText("loyauty.error.common.brand_discount_required"));
					valid = false;
				}
				
				if(valid){
					productService.generatProfitByBrand(brand, userId,brandDiscount);
				}
				
			}
			else if(actionDiscount == WebConstants.GENERATE_DISCOUNT_BY_CATEGORY) {
				boolean valid = true;
				if( category < 0 ){
					this.addActionError(getText("loyauty.error.common.category_required"));
					valid = false;
				}
				if(! StringUtils.isDoubleNumber(categoryDiscount)){					
					this.addActionError(getText("loyauty.error.common.category_discount_required"));	
					valid = false;
				}
				if(valid){
					productService.generatProfitByCategory(category, userId,categoryDiscount);
				}
			}
			}			
			// generate the list
			showResultList();
			
			return SUCCESS;
		}	
		catch(ServiceException se){
			log.debug("Service Exception pb", se);	
			addActionError(getText("loyauty.error.common.service"));
		}
		catch(Exception se){
			log.debug(se);
			addActionError(getText("loyauty.error.common.service"));
		}
		
		return INPUT;
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
	
	
	private void showResultList() throws ServiceException {
		
		// generate the list
		categoryList = internationalizeName(commonService.getCategoriesByBrand(brand));
		
		CommonUserDiscountDTO userDiscount = new CommonUserDiscountDTO();
		userDiscount.setUserId(userId);
		userDiscount.setBrandId(brand);			
		CommonUserDiscountDTO userBrandDiscount = productService.getUserBrandDiscount(userDiscount);		
		setBrandDiscount(userBrandDiscount==null?null:userBrandDiscount.getDiscount());
		
		setBrand(brand);
		
		
		if(category > 0) {			
			userDiscount.setCategoryId(category);
			CommonUserDiscountDTO userCatDiscount = productService.getUserCategoryDiscount(userDiscount);
			setCategoryDiscount(userCatDiscount==null?null:userCatDiscount.getDiscount());
			
			setCategory(category);
		}		
		
		// listing result
		UserProductDTO productDTO = new UserProductDTO();
		
		productDTO.setUserId(userId);
		productDTO.setBrandId(brand<=0?null:brand);
		productDTO.setCategoryId(category<=0?null:category); 
		productDTO.setUserProductStatus((UserProductStatus) CommonUtils.enumFromValue(UserProductStatus.values(), upstatus) );
		productDTO.setProductStatus(productStatus);
		productDTO.setLsProductId(lsProductManufacture.trim());
		userProductList = productService.getAllProdcutForProfit(productDTO);

	}
	

}
