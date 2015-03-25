package com.loyauty.web.struts.action.product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.UserProductStatus;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class GetProduct extends LoyautyAction {

	private static final long serialVersionUID = 1L;
	
	private ProductService productService;
	private CommonService commonService;
	private UserService userService;
	private OperationsService operationsService;
	
	@Getter @Setter
	private String upc;
	@Getter @Setter
	private long productId;
	@Getter @Setter
	private long imageId;
	@Getter @Setter
	private long brand;
	@Getter @Setter
	private String brandName;
	@Getter @Setter
	private long category;
	@Getter @Setter
	private String categoryName;
	@Getter @Setter
	private long mainSpecification; 
	@Getter @Setter
	private String mainSpecificationName;
	@Getter @Setter
	private String manufProductID;
	@Getter @Setter
	private String manufProductID1;
	@Getter @Setter
	private String manufProductID2;
	@Getter @Setter
	private String manufProductID3;
	@Getter @Setter
	private String manufProductID4;
	
	@Getter @Setter
	private Integer manufProductQuantity;
	@Getter @Setter
	private Integer manufProductQuantity1;
	@Getter @Setter
	private Integer manufProductQuantity2;
	@Getter @Setter
	private Integer manufProductQuantity3;
	@Getter @Setter
	private Integer manufProductQuantity4;
	
	@Getter @Setter
	private String supplier;
	@Getter @Setter
	private String supplier1;
	@Getter @Setter
	private String supplier2;
	@Getter @Setter
	private String supplier3;
	@Getter @Setter
	private String supplier4;
	
	@Getter @Setter
	private String price;
	@Getter @Setter
	private String price1;
	@Getter @Setter
	private String price2;
	@Getter @Setter
	private String price3;
	@Getter @Setter
	private String price4;	

	@Getter @Setter
	private String msrp0;
	@Getter @Setter
	private String msrp1;
	@Getter @Setter
	private String msrp2;
	@Getter @Setter
	private String msrp3;
	@Getter @Setter
	private String msrp4;
	
	@Getter @Setter
	private String loyaltyProductId;
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
	private Integer statusProductBox;
	@Getter @Setter
	private Boolean canadaPostSizesVerified;
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
	
	//uploading files
	@Getter @Setter	
	private File productImage; 
	@Getter @Setter
	private String productImageContentType;
	@Getter @Setter
	private String productImageFileName;
	@Getter @Setter
	private ImageDTO imgDTO; 
	@Getter @Setter
	private List<CommonDTO> categoryList;
	@Getter @Setter
	private List<SpecificationDTO> mainSpecificationList;
	@Getter @Setter
	private boolean update = false;
	@Getter @Setter
	private ProductDTO productDTO;
	
	@Getter @Setter
	private List<UserProductPriceDTO> userProductPriceDTOList;
	
	@Getter @Setter
	private List<CommonDTO> brandList;
	@Getter @Setter
	private List<CommonDTO> statusList;
	@Getter @Setter
	private Integer statusId;
	
	@Getter @Setter
	private String linkUrl;
	@Getter @Setter
	private String note;
	
	@Getter @Setter
	private List<UserDTO> activeClientsList;
	@Getter @Setter
	private int activeClientsSize;
	@Getter @Setter
	private int activeClientsTFSize;
	@Getter @Setter
	private String loyaltyProductIdSub;
	
	@Getter @Setter
	private String periodTime;
	@Getter @Setter
	private String warrantyQuantity;
	@Getter @Setter
	private Boolean defectFree;
	@Getter @Setter
	private Long clientCategoryId;
	
	@Getter @Setter
	private List<UserSessionDTO> userNameList;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	@Getter @Setter
	private List<OperationsDTO> opertionsDTOList;
	
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
	//Currency
	@Getter @Setter
	private Double[] currencyRate;
	@Getter @Setter
	private String[] currencySymbol;
	@Getter @Setter
	private String[] currencyPrice;	//CURRENCY_LS_PRICE
	
	public GetProduct () throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		commonService = getServiceLocator().getCommonService();
		userService = getServiceLocator().getUserService();
		operationsService=getServiceLocator().getOperationsService();
	}	
	
	@Override  
	public String execute() throws Exception {
		
		try {
			listClientCategory=userService.getAllClientCategory();
			opertionsDTOList=operationsService.getOperationsByTypeAndObject(productId,"Product");	
			brandList = commonService.getBrands();
			categoryList  = internationalizeName(commonService.getCategoriesByBrand(brand));			
			mainSpecificationList = productService.getMainSpecificationByCategory(category);
			statusList = commonService.getAllProductStatuses();
			request.getSession(true).setAttribute("productId", productId);			
			activeClientsList = productService.getAllActiveClients(productId);
			activeClientsTFSize = activeClientsSize = activeClientsList.size();
			activeClientsTFSize = activeClientsList.isEmpty() ? 1 : activeClientsTFSize;
			productDTO = productService.getProductInformation(productId, null);
			boxDTO = productService.getBoxByProductId(productId);
			if(boxDTO==null)boxDTO=new BoxDTO();
			BasicUserDTO basicUserDTO = new  BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			brand = productDTO.getBrand().getId();			
			brandName = productDTO.getBrand().getName();
			category = productDTO.getCategory().getId();			
			imgDTO = productDTO.getImage();
			
			if(productDTO.getImage() != null) {
				imageId = productDTO.getImage().getId();
				productImageFileName = productDTO.getImage().getRealName();
			}
		
			productService.saveOldImageIdBeforeUpdate(productId);
			
			mainSpecification = productDTO.getMainFilterTypeId();			
			if(productDTO.getManufactureProductList().size() >= 1) {
				manufProductID = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
				manufProductQuantity = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getQuantity();
				supplier = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getSupplier();
				price = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getPrice();
				msrp0 = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getMsrp();				
			}
			if(productDTO.getManufactureProductList().size() >= 2) {
				manufProductID1 = ((ProductModelDTO)productDTO.getManufactureProductList().get(1)).getName();
				manufProductQuantity1 = ((ProductModelDTO)productDTO.getManufactureProductList().get(1)).getQuantity();
				supplier1 = ((ProductModelDTO)productDTO.getManufactureProductList().get(1)).getSupplier();
				price1 = ((ProductModelDTO)productDTO.getManufactureProductList().get(1)).getPrice();
				msrp1 = ((ProductModelDTO)productDTO.getManufactureProductList().get(1)).getMsrp();
			}
			if(productDTO.getManufactureProductList().size() >= 3) {
				manufProductID2 = ((ProductModelDTO)productDTO.getManufactureProductList().get(2)).getName();
				manufProductQuantity2 = ((ProductModelDTO)productDTO.getManufactureProductList().get(2)).getQuantity();
				supplier2 = ((ProductModelDTO)productDTO.getManufactureProductList().get(2)).getSupplier();
				price2 = ((ProductModelDTO)productDTO.getManufactureProductList().get(2)).getPrice();
				msrp2 = ((ProductModelDTO)productDTO.getManufactureProductList().get(2)).getMsrp();
			}
			if(productDTO.getManufactureProductList().size() >= 4) {
				manufProductID3 = ((ProductModelDTO)productDTO.getManufactureProductList().get(3)).getName();
				manufProductQuantity3 = ((ProductModelDTO)productDTO.getManufactureProductList().get(3)).getQuantity();
				supplier3 = ((ProductModelDTO)productDTO.getManufactureProductList().get(3)).getSupplier();
				price3 = ((ProductModelDTO)productDTO.getManufactureProductList().get(3)).getPrice();
				msrp3 = ((ProductModelDTO)productDTO.getManufactureProductList().get(3)).getMsrp();
			}
			if(productDTO.getManufactureProductList().size() >= 5) {
				manufProductID4 = ((ProductModelDTO)productDTO.getManufactureProductList().get(4)).getName();
				manufProductQuantity4 = ((ProductModelDTO)productDTO.getManufactureProductList().get(4)).getQuantity();
				supplier4 = ((ProductModelDTO)productDTO.getManufactureProductList().get(4)).getSupplier();
				price4 = ((ProductModelDTO)productDTO.getManufactureProductList().get(4)).getPrice();
				msrp4 = ((ProductModelDTO)productDTO.getManufactureProductList().get(4)).getMsrp();
			}
			upc=productDTO.getUpc();
			loyaltyProductId = productDTO.getLoyaltyProductId().trim();
			nameEn = productDTO.getNameEng().getName();
			nameFr = productDTO.getNameFr().getName();
			msrp = productDTO.getMsrp();
			cost = productDTO.getCost();
			width = productDTO.getWidth();
			large = productDTO.getLarge();
			high = productDTO.getHigh();
			weight = productDTO.getWeight();
			
			statusId = productDTO.getStatus().getValue();			
			loyaltyProductIdSub = (statusId == 3) 
							? ((productDTO.getLoyaltyProductIdSub() != null) 
									? productDTO.getLoyaltyProductIdSub().trim() 
									: "") 
							: "";

			
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
			
			if(productDTO.getLinkList().size() > 0)
				linkUrl = productDTO.getLinkList().get(0).getLink();
			
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
			
			for(ClientCategoryDTO clDTO:listClientCategory){
				userNameList.add(getUserSessionDTO(clDTO));
			}
			final int SIZE = userNameList.size();

			userProductPriceDTOList = productService.getUserProductPriceList(productId);
			
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

				currencyRate[count] = 1D;
				currencySymbol[count] = "CAD";
				currencyPrice[count] = "";
				userDTO = userService.getUserInformation(userId);
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
