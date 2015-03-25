package com.loyauty.web.struts.action.product;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.Language;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class GetSimilarProduct extends LoyautyAction {
	
	private static final long serialVersionUID = -5400779604708599217L;
	
	private ProductService productService;
	private CommonService commonService;
	private UserService userService;
	
	@Getter @Setter
	private ProductDTO productDTO;
	
	@Getter @Setter
	private long productId;
	@Getter @Setter
	private long brand;	
	@Getter @Setter
	private long category;	
	@Getter @Setter
	private long mainSpecification; 
	
	@Getter @Setter
	private List<CommonDTO> brandList;
	@Getter @Setter
	private List<CommonDTO> categoryList;	
	@Getter @Setter
	private List<SpecificationDTO> mainSpecificationList;	
	@Getter @Setter
	private List<UserProductPriceDTO> userProductPriceDTOList;
	
	@Getter @Setter
	private String upc;
	@Getter @Setter
	private String nameEn;
	@Getter @Setter
	private String nameFr;
	@Getter @Setter
	private String msrp;
	@Getter @Setter
	private String cost;
	@Getter @Setter
	private String width;
	@Getter @Setter
	private String large;
	@Getter @Setter
	private String high;
	@Getter @Setter
	private String weight;
	@Getter @Setter
	private String boxLengthCm;
	@Getter @Setter
	private String boxWidthCm;
	@Getter @Setter
	private String boxHeightCm;
	@Getter @Setter
	private String boxWeightKg;
	@Getter @Setter
	private BoxDTO boxDTO;
	
	@Getter @Setter
	private String descriptionEn;
	@Getter @Setter
	private String descriptionFr;
	@Getter @Setter
	private String specificationEn;
	@Getter @Setter
	private String specificationFr;
	@Getter @Setter
	private String otherEng;
	@Getter @Setter
	private String otherFr;
	
	@Getter @Setter
	private String linkUrl;
	@Getter @Setter
	private String note;

	@Getter @Setter
	private String periodTime;
	@Getter @Setter
	private String warrantyQuantity;
	@Getter @Setter
	private Boolean defectFree;

	@Getter @Setter
	private List<UserSessionDTO> userNameList;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	@Getter @Setter
	private String[] userPrice;
	@Getter @Setter
	private String[] percentageProfit;
	@Getter @Setter
	private String[] percentageDiscount;
	@Getter @Setter
	private Boolean[] isExcluded;
	@Getter @Setter
	private String[] excluded;
	
	@Getter @Setter
	private Double[] currencyRate;
	@Getter @Setter
	private String[] currencySymbol;
	@Getter @Setter
	private String[] currencyPrice;	//CURRENCY_LS_PRICE
	
	@Getter @Setter
	private String loyaltyProductId;
	
	public GetSimilarProduct () throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		commonService = getServiceLocator().getCommonService();
		userService = getServiceLocator().getUserService();
		boxDTO=new BoxDTO();
	}	
	
	@Override  
	public String execute() throws Exception {		
		try {			
			productId = (Long) request.getSession(true).getAttribute("productID");
			listClientCategory=userService.getAllClientCategory();
			productDTO = productService.getProductInformation(productId, null);
			boxDTO = productService.getBoxByProductId(productId);
			BasicUserDTO basicUserDTO = new  BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			
			brandList = commonService.getBrands();
			brand = productDTO.getBrand().getId();
			categoryList  = internationalizeName(commonService.getCategoriesByBrand(brand));
			category = productDTO.getCategory().getId();
			mainSpecificationList = productService.getMainSpecificationByCategory(category);
			mainSpecification = productDTO.getMainFilterTypeId();
			
			loyaltyProductId = productDTO.getBrand().getCode();
			
			
			nameEn = productDTO.getNameEng().getName();
			nameFr = productDTO.getNameFr().getName();
			msrp = productDTO.getMsrp();
			cost = productDTO.getCost();
			width = productDTO.getWidth();
			large = productDTO.getLarge();
			high = productDTO.getHigh();
			weight = productDTO.getWeight();
			upc= productDTO.getUpc();
			
			if (productDTO.getDescriptionEng() != null) {
				descriptionEn = (!productDTO.getDescriptionEng().equals("")) ? productDTO.getDescriptionEng().getName() : "" ;
			} else {
				descriptionEn = "";
			}
			if (productDTO.getDescriptionFr() != null) {
				descriptionFr = (!productDTO.getDescriptionFr().equals("")) ? productDTO.getDescriptionFr().getName() : "" ;
			} else {
				descriptionFr = "";
			}			
			if (productDTO.getSpecificationEng() != null) {
				specificationEn = (!productDTO.getSpecificationEng().equals("")) ? productDTO.getSpecificationEng().getName() : "" ;
			} else {
				specificationEn = "";
			}
			if (productDTO.getSpecificationFr() != null) {
				specificationFr = (!productDTO.getSpecificationFr().equals("")) ? productDTO.getSpecificationFr().getName() : "" ;
			} else {
				specificationFr = "";
			}			
			if (productDTO.getOtherEng() != null) {
				otherEng = (!productDTO.getOtherEng().equals("")) ? productDTO.getOtherEng().getName() : "" ;
			} else {
				otherEng = "";
			}
			if (productDTO.getOtherFr() != null) {
				otherFr = (!productDTO.getOtherFr().equals("")) ? productDTO.getOtherFr().getName() : "" ;
			} else {
				otherFr = "";
			}
			
			if(productDTO.getLinkList().size() > 0) {
				linkUrl = productDTO.getLinkList().get(0).getLink();
			}
			if(productDTO.getWarrantyEng() != null) {
				if(productDTO.getWarrantyEng().getName().equalsIgnoreCase(WebConstants.WARRANTY_DEFECT_FREE_ENG)) {
					defectFree = true;
				} else {
					defectFree = false;
					warrantyQuantity = productDTO.getWarrantyEng().getName().split("\\s")[0];
					if(productDTO.getWarrantyEng().getName().contains(WebConstants.WARRANTY_MONTH_ENG)) {
						periodTime = WebConstants.WARRANTY_MONTH_ENG;
					} else {
						periodTime = WebConstants.WARRANTY_YEAR_ENG;
					}
				}
			} else {
				//By default
				defectFree = true;
			}			
			note = productDTO.getNote();
			
			userNameList = userService.getAllUserAccounts(basicUserDTO);
			//-----------Add Templates -------------------------
			for(ClientCategoryDTO clDTO:listClientCategory){
				userNameList.add(getUserSessionDTO(clDTO));
			}
			//-------------------------------------------------
			userProductPriceDTOList = productService.getUserProductPriceList(productId);
			
			final int SIZE = userNameList.size();
			
			userPrice = new String[SIZE];
			percentageProfit = new String[SIZE];
			percentageDiscount = new String[SIZE];
			isExcluded = new Boolean[SIZE];
			excluded = new String[SIZE];
			currencyRate = new Double[SIZE];
			currencySymbol = new String[SIZE];
			currencyPrice = new String[SIZE];
			
			UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
			long userId = 0L;
			int count = 0;
			UserDTO userDTO;
			for (UserSessionDTO uDTO : userNameList) {
				userId = uDTO.getId();
				userDTO = userService.getUserInformation(userId);
				currencyRate[count] = 1D;
				currencySymbol[count] = "CAD";
				currencyPrice[count] = "";
				if(userDTO!=null && userDTO.getCurrencyRate()!=null) currencyRate[count] = userDTO.getCurrencyRate();
				if(userDTO!=null && userDTO.getCurrencySymbol()!=null) currencySymbol[count] = userDTO.getCurrencySymbol();

				userProductPriceDTO = findUserProductPriceDTO(userId, userProductPriceDTOList);
				isExcluded[count] = userProductPriceDTO.getExcluded();
				if (isExcluded[count]) {
					excluded[count] = "t";
					userPrice[count] = "";
					percentageProfit[count] = "";
					percentageDiscount[count] = "";				
				} else {
					excluded[count] = "f";
					userPrice[count] = userProductPriceDTO.getPrice();
					percentageProfit[count] = userProductPriceDTO.getProfit();
					percentageDiscount[count] = userProductPriceDTO.getDiscount();
					if(userDTO!=null && userDTO.getCurrencyRate()!=null) {
						if(userPrice[count]!=null && userPrice[count].replaceAll(" ", "").matches("^-?\\d*\\.\\d+$|^-?\\d+$")) {
							Double curPrice = currencyRate[count] * Double.parseDouble(userPrice[count]);
							curPrice = (double) Math.round(curPrice*100)/100;
							currencyPrice[count] = curPrice+"";
						}
					}
				}
				++count;
			}			
			return SUCCESS;
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}		
		return INPUT;
	}
	
	private UserProductPriceDTO findUserProductPriceDTO(long userId, List<UserProductPriceDTO> userProductPriceDTOList) {
		UserProductPriceDTO outcome = new UserProductPriceDTO();
		if (userProductPriceDTOList != null) {
			if (userProductPriceDTOList.size() > 0) {
				for (UserProductPriceDTO userProductPriceDTO : userProductPriceDTOList) {
					if (userProductPriceDTO.getUserId().intValue() == userId) {
						outcome = userProductPriceDTO;
					}
				}
			}
		}		
		return outcome;
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

	public static UserSessionDTO getUserSessionDTO(ClientCategoryDTO clDTO){
		Long userId=clDTO.getClientCategoryId();
		String login=clDTO.getClientCategoryName();
		Integer TypeId=2;
		Integer userLangId = 2;
		Integer RESULTS_PER_PAGE=10;
		String email="";
		String code="";
		Boolean isActive=true;
		Long template =1L;
		UserSessionDTO sessionDTO =new UserSessionDTO(userId, login, TypeId, userLangId, Language.ENGLISH.getValue(),
													  RESULTS_PER_PAGE, email, code, isActive,template);
		
		return sessionDTO;
	}
	
	
}
