package com.loyauty.service.core;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Date;

import org.apache.log4j.Logger;

import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.Type;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.AlterProductXML;
import com.loyauty.model.AlterUserProductXML;
import com.loyauty.model.Box;
import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.City;
import com.loyauty.model.ClientCategory;
import com.loyauty.model.Currency;
import com.loyauty.model.Image;
import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.Operations;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.OrdersSpecialShipping;
import com.loyauty.model.Product;
import com.loyauty.model.Province;
import com.loyauty.model.ProductLink;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.ShippingCity;
import com.loyauty.model.ShippingProvince;
import com.loyauty.model.ShippingTotal;
import com.loyauty.model.Specification;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.User;
import com.loyauty.model.UserConnection;
import com.loyauty.model.UserFileRecovery;
import com.loyauty.model.UserFilesDownloaded;
import com.loyauty.model.UserProductPrice;
import com.loyauty.model.UserProvincePopulation;
import com.loyauty.model.UsersPrivileges;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersPrintDTO;
import com.loyauty.service.core.dto.OrdersSpecialShippingDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ProductLinkDTO;
import com.loyauty.service.core.dto.ProductListDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserFileDataRecoveryDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.text.StringUtils;

/**
 * Creates, converts, and manages all DTOs in the system.
 *  
 *
 */
public final class DTOFactory {

	private static Logger log = Logger.getLogger(DTOFactory.class);
	private static Integer RESULTS_PER_PAGE = 10;

	
	private DTOFactory(){}

	/**
	 * Creates {@link UserSessionDTO} from a {@link User} model.
	 * After authenticating a user, a useful object is returned to 
	 * the calling client who can use it for session managment. 
	 *
	 * @param user
	 * @return
	 */
	public static UserSessionDTO getUserSessionDTO(User user){
		Integer userLangId = user.getPrimaryLanguage().getValue();		

		return UserSessionDTO.valueOf(user.getId(), user.getLogin(), user.getTypeId(), userLangId, 
				Language.ENGLISH.getValue(), RESULTS_PER_PAGE,	user.getEmail(), user.getCode(), user.isActive());
	}	
		
	public static List<UserSessionDTO> getAllUsersAccountsDTO(List<User> userList) {
				
		List<UserSessionDTO> userListDTO = new ArrayList<UserSessionDTO>();
		UserSessionDTO userSessionDTO;
		int index=0;
		int i=0;
		for(User user : userList){
			i++;
			index=i % 2;
			userSessionDTO = UserSessionDTO.valueOf(user.getId(), user.getLogin(), user.getTypeId(), 
							 user.getPrimaryLanguage().getValue(), Language.ENGLISH.getValue(), RESULTS_PER_PAGE, 
							 user.getEmail(), user.getCode(), user.isActive());
			String clientCategoryName="";
			userSessionDTO.setIndex(index);
			if(user.getClientCategoryId()!=null && user.getClientCategoryId()>0){
				userSessionDTO.setClientCategoryId(user.getClientCategoryId());
				clientCategoryName=user.getClientCategoryName();
			}
			userSessionDTO.setClientCategoryName(clientCategoryName);
			if(user.getUpdateDate()!=null)userSessionDTO.setUpdateDate(user.getUpdateDate());
			userListDTO.add(userSessionDTO);
		}
		return userListDTO;
	}
	
	
	public static List<CommonDTO> getAllCommonDTOFromBrand(List<Brand> list) {
		
		List<CommonDTO> brandListDTO = new ArrayList<CommonDTO>();
		CommonDTO brandDTO;
		for(Brand brand : list){
			brandDTO = CommonDTO.valueOf(brand.getId(), brand.getName());	
			brandDTO.setCode(brand.getCode());
			brandListDTO.add(brandDTO);
		}		
		return brandListDTO;		
	}
	
	
	public static List<CommonDTO> getAllCommonDTOFromCategory(List<Category> list) {
		
		List<CommonDTO> commonListDTO = new ArrayList<CommonDTO>();
		CommonDTO commonDTO;
		for(Category cat : list){
			commonDTO = CommonDTO.valueOf(cat.getId(),  cat.getCode());			
			commonListDTO.add(commonDTO);
		}		
		return commonListDTO;		
	}
	
	public static List<BrandDTO> getBrandListDTO(List<Brand> list) {
		
		 List<BrandDTO> brandListDTO = new ArrayList<BrandDTO>();
		 BrandDTO dto;
		 ImageDTO imageDTO;
		 for(Brand brand : list){
			    
	 	
			 if(brand.getImage().getId() != null)
			 {
		 		imageDTO = ImageDTO.valueOf(brand.getImage().getId(), brand.getImage().getName(), 
			    									brand.getImage().getSize(), brand.getImage().getHeight(), 
			    									brand.getImage().getWidth(), brand.getImage().getResolution(), 
			    									false, brand.getImage().getRealNameImg(), brand.getImage().getScore());
			    dto = BrandDTO.valueOf(brand.getId(), brand.getName(), imageDTO, 
			    				brand.getDescription(), brand.getCreationDate());		
			 }
			 else
			 {
				 dto = BrandDTO.valueOf(brand.getId(), brand.getName(), 
		    				brand.getDescription(), brand.getCreationDate());	
			 }
			 	dto.setHide( brand.getHide());
			 	dto.setSatisfact(brand.getSatisfact());
			    brandListDTO.add(dto);
		 }	
		 
		
		return brandListDTO;
	}
	
	
	public static List<CategoryDTO> getCategoryListDTO(List<Category> list) {
		
		 List<CategoryDTO> catListDTO = new ArrayList<CategoryDTO>();
		 CategoryDTO dto;
		 for(Category cat: list){
			    dto = CategoryDTO.valueOf(cat.getId(), cat.getCategoryGoupeId(), 
			    				cat.getName(), cat.getCode(), 
			    				cat.getDescription(), cat.getCreationDate());			
			    catListDTO.add(dto);
		 }	
		
		return catListDTO;
	}
	
	
	public static List<SpecificationDTO> getSpecificationListDTO(List<Specification> list) {
		
		List<SpecificationDTO> speListDTO = new ArrayList<SpecificationDTO>();
		SpecificationDTO dto;
		 for(Specification spe: list){
			    dto = SpecificationDTO.valueOf(spe);			
			    speListDTO.add(dto);
		 }	
		
		return speListDTO;
	}
	
	public static List<UserProductPriceDTO> getUserProductPriceDTOList(List<UserProductPrice> userProductPriceList) {		
		List<UserProductPriceDTO> userProductPriceDTOList = new ArrayList<UserProductPriceDTO>();
		UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();		
		for (UserProductPrice userProductPrice : userProductPriceList) {			
			userProductPriceDTO = new UserProductPriceDTO();			
			userProductPriceDTO.setId(userProductPrice.getId());
			userProductPriceDTO.setUserId(userProductPrice.getUserId());
			userProductPriceDTO.setProductId(userProductPrice.getProductId());
			userProductPriceDTO.setPriceType(userProductPrice.getPriceType());
			userProductPriceDTO.setUserStatus(userProductPrice.getUserStatus());	
			userProductPriceDTO.setPrice(userProductPrice.getPrice());
			userProductPriceDTO.setProfit(userProductPrice.getProfit());
			userProductPriceDTO.setDiscount(userProductPrice.getDiscount());
			userProductPriceDTO.setExcluded(userProductPrice.getExcluded());
			userProductPriceDTO.setShippingCoverage(userProductPrice.getShippingCoverage());
			userProductPriceDTO.setShippingTotalCanada(userProductPrice.getShippingTotalCanada());
			userProductPriceDTOList.add(userProductPriceDTO);		}		
		return userProductPriceDTOList;
	}
	
	public static ProductDTO getProductDTO(Product product) {		
		if(product==null)return null;
		Image image = product.getImage();
		ImageDTO imageDTOProduct = null;
		String oldImageIdBeforeUpdate = product.getOldImageRealName();
		
		String nameProduct = "";
		String descriptionProduct = "";
		String specificationProduct = "";
		String otherProduct = "";
		CommonDTO commonDTOWarrantyEng = null;
		CommonDTO commonDTOWarrantyFr = null;
		//Id for warranty translation
		Long warantyTransId = new Long(0);
		Boolean wereWgtDimChanged = product.getWereWgtDimChanged();
		Boolean consideredForXML = product.getConsideredForXML();
		 
		Date discontinuedStartDate = product.getDiscontinuedStartDate();
		String loyaltyProductIdSub = product.getLoyaltyProductIdSub();
		if(image != null)
		{
        		imageDTOProduct = ImageDTO.valueOf(image.getId(), image.getName(), image.getSize(), 
        						   image.getHeight(), image.getWidth(), image.getResolution(), 
        						   image.isLarge(), image.getRealNameImg(), image.getScore());
		}
		
		ImageDTO imageDTOBrand = ImageDTO.valueOf(product.getBrand().getImage().getId(), product.getBrand().getImage().getName(), 
												product.getBrand().getImage().getSize(),product.getBrand().getImage().getHeight(), 
												product.getBrand().getImage().getWidth(), product.getBrand().getImage().getResolution(), 
												product.getBrand().getImage().isLarge(), product.getBrand().getImage().getRealNameImg(),
												product.getBrand().getImage().getScore());
		
		BrandDTO brandDTO = BrandDTO.valueOf(product.getBrand().getId(), product.getBrand().getName(), product.getBrand().getCode(),
											imageDTOBrand, product.getBrand().getDescription(), product.getBrand().getCreationDate());
		
		
		CategoryDTO categoryDTO = CategoryDTO.valueOf(product.getCategory().getId(), product.getCategory().getCategoryGoupeId(), 
				product.getCategory().getName(), product.getCategory().getCode(), null, null);
		
		CommonDTO commonDTONameEng = product.getName().getLocalizedCommonDTO(Language.ENGLISH);
		
		CommonDTO commonDTONameFr = product.getName().getLocalizedCommonDTO(Language.FRENCH);
		
		CommonDTO commonDTODescriptionEng = product.getDescription().getLocalizedCommonDTO(Language.ENGLISH); 
															  
		CommonDTO commonDTODescriptionFr = product.getDescription().getLocalizedCommonDTO(Language.FRENCH);
		
		CommonDTO commonDTOSpecificationEng = product.getSpecification().getLocalizedCommonDTO(Language.ENGLISH); 
				  												
		CommonDTO commonDTOSpecificationFr = product.getSpecification().getLocalizedCommonDTO(Language.FRENCH);
		
		CommonDTO commonDTOOtherEng = product.getOther().getLocalizedCommonDTO(Language.ENGLISH);
		
		CommonDTO commonDTOotherFr = product.getOther().getLocalizedCommonDTO(Language.FRENCH);
		
		if(product.getWarranty() != null){
			commonDTOWarrantyEng = product.getWarranty().getLocalizedCommonDTO(Language.ENGLISH);
			commonDTOWarrantyFr = product.getWarranty().getLocalizedCommonDTO(Language.FRENCH);
			warantyTransId = product.getWarranty().getId();
		}
		
		//Manufacture Product Id
		List<ProductModelDTO> commonDTOList = new ArrayList<ProductModelDTO>();
		Iterator<ProductModelNumber> modelNumberIterator = product.getModelNumberList().iterator();
		ProductModelNumber productModelNumber;
		String productPrice = "";
		if(product.getUserPrice() != null)
		{
			productPrice = product.getUserPrice();
		}
		else
		{
			productPrice = product.getMsrp();
		}
		while(modelNumberIterator.hasNext())
		{
			productModelNumber = (ProductModelNumber)modelNumberIterator.next();
			ProductModelDTO productModelDTO = ProductModelDTO.valueOf(productModelNumber.getId(), 
																	  productModelNumber.getModelNumber(), 
																	  productModelNumber.getQuantity(), 
																	  productModelNumber.getSupplier(),
																	  productModelNumber.getPrice(),
																	  productModelNumber.getMsrp());
			
			commonDTOList.add(productModelDTO);
		}
	

		List<ProductLinkDTO> productLinkDTOList = new ArrayList<ProductLinkDTO>();
		if(product.getLinkList() != null)
		{
			for(ProductLink productLink: product.getLinkList())
			{
				ProductLinkDTO productLinkDTO = ProductLinkDTO.valueOf(productLink.getId(),
																	   productLink.getProductId(),
																	   productLink.getLink(),
																	   productLink.getCreationDate());
				productLinkDTOList.add(productLinkDTO);			
			}
		}
		
		loyaltyProductIdSub = (product.getLoyaltyProductIdSub() != null) ? product.getLoyaltyProductIdSub() : "";		

		ProductDTO productDTO =  new ProductDTO.Builder(product.getId(), brandDTO, categoryDTO)
					 .nameEng(commonDTONameEng).nameFr(commonDTONameFr).image(imageDTOProduct)
					 .descriptionEng(commonDTODescriptionEng).descriptionFr(commonDTODescriptionFr)
					 .specificationEng(commonDTOSpecificationEng).specificationFr(commonDTOSpecificationFr)
					 .otherEng(commonDTOOtherEng).otherFr(commonDTOotherFr)
					 .msrp(product.getMsrp()).cost(product.getCost()).width(product.getProductWidth())
					 .high(product.getProductHigh()).large(product.getProductLong()).weight(product.getWeight())
					 .manufactureProductList(commonDTOList).mainFilterTypeId(product.getTypeId())
					 .loyaltyProductId(product.getLoyaltySourceProductId()).creationDate(product.getCreationDate())
					 .nameProduc(nameProduct).descriptiProduct(descriptionProduct).oldImageIdBeforeUpdate(oldImageIdBeforeUpdate)
					 .specificationProduct(specificationProduct).otherProduct(otherProduct)
					 .priceProduct(productPrice).discontinuedStartDate(discontinuedStartDate)
					 .status(product.getStatus()).loyaltyProductIdSub(loyaltyProductIdSub).wereWgtDimChanged(wereWgtDimChanged)
					 .linkList(productLinkDTOList).note(product.getNote()).consideredForXML(consideredForXML)
					 .warantyEng(commonDTOWarrantyEng).warantyFr(commonDTOWarrantyFr)
					 .warrantyTranslationId(warantyTransId).build();
		productDTO.setStock(product.getStock());
		productDTO.setActualHeight(product.getActualHeight());
		productDTO.setActualLength(product.getActualLength());
		productDTO.setActualWidth(product.getActualWidth());
		productDTO.setActualWeight(product.getActualWeight());
		productDTO.setUpc(product.getUpc());
		
		productDTO.setBoxLength(product.getBoxLength());
		productDTO.setBoxWidth(product.getBoxWidth());
		productDTO.setBoxHeight(product.getBoxHeight());
		productDTO.setBoxTotalWeight(product.getBoxTotalWeight());
		
		//sale attributes
		productDTO.setUserId(product.getUserId());
		productDTO.setQtMax(product.getQtMax());
		productDTO.setSaleQt(product.getSaleQt());
		productDTO.setStartDate(product.getStartDate());
		productDTO.setEndDate(product.getEndDate());
		productDTO.setRegularPrice(product.getRegularPrice());
		productDTO.setRegularPercentProfit(product.getRegularPercentProfit());
		productDTO.setRegularPercentDiscount(product.getRegularPercentDiscount());
		productDTO.setActive(product.getActive());
		productDTO.setMessageForClient(product.getMessageForClient());
		productDTO.setSaleNote(product.getSaleNote());
		productDTO.setProductSaleId(product.getProductSaleId());
		
		productDTO.setSalePrice(product.getSalePrice());
		productDTO.setSalePercentProfit(product.getSalePercentProfit());
		productDTO.setSalePercentDiscount(product.getSalePercentDiscount());
		productDTO.setLoyaltyProductIdSub(product.getLoyaltyProductIdSub());
		
		
		return (productDTO);
		
	}
	
	public static List<ProductDTO> getProductDTOList(List<Product> list) {
		 List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		 for(Product prod : list) {
			    productDTOList.add(getProductDTO(prod));
		 }	
		return productDTOList;
	}
	
	/**
	 * creates {@link ImageDTO} from {@link Image}. 
	 * @param image
	 * @return
	 */
	
	public static List<ProductDTO> getProductDTOClassification( List<Product>productList) {		
		List<ProductDTO>result=new ArrayList<ProductDTO>();
		ProductDTO productDTO;
		for(Product product:productList){
			
			BrandDTO brandDTO = BrandDTO.valueOf(-1, product.getBrand().getName(), product.getBrand().getCode(),
												null, product.getBrand().getDescription(), product.getBrand().getCreationDate());
			//productDTO.setBrand(brandDTO);
			CategoryDTO categoryDTO = CategoryDTO.valueOf(-1, -1,product.getCategory().getName(),
														  product.getCategory().getCode(), null, null);
			productDTO =  new ProductDTO.Builder(product.getId(), brandDTO, categoryDTO).build();	
			productDTO.setClassification(product.getClassification());
			productDTO.setLoyaltyProductId(product.getLoyaltySourceProductId());
			productDTO.setDescriptiProduct(product.getDescriptiProduct());
			productDTO.setUpc(product.getUpc());
			productDTO.setMsrp(product.getMsrp());
			productDTO.setCost(product.getCost());
			productDTO.setQtSold(product.getQtSold());
			productDTO.setPriceProduct(product.getUserPrice());
			if(product.getDiscount()!=null && !product.getDiscount().equals(""))productDTO.setDiscount(Double.parseDouble(product.getDiscount()));
			if(product.getProfit()!=null && !product.getProfit().equals(""))productDTO.setProfit(Double.parseDouble(product.getProfit()));
			result.add(productDTO);
		}	
		return result;
	}

	public static ImageDTO getImageDTO(Image image){
		return ImageDTO.valueOf(image.getId(), image.getName(),	image.getSize(), 
				image.getHeight(), image.getWidth(),image.getResolution(), image.isLarge(),image.getRealNameImg(), image.getScore());
	}
	
	public static List<UserProductDTO> getUserProductDTOList(List<Product> list) {
		 List<UserProductDTO> userProductDTOList = new ArrayList<UserProductDTO>();
		 UserProductDTO userProductDTO = null;
		 for(Product product: list){
			 	userProductDTO = new UserProductDTO();
			 	userProductDTO.setId(product.getId());					
				userProductDTO.setCategoryId(product.getCategory().getId());
				userProductDTO.setCategoryName(product.getCategory().getName());
				userProductDTO.setUpc(product.getUpc());
				userProductDTO.setSpecificationEn(product.getSpecification().getLocalizedText(Language.ENGLISH));
				//userProductDTO.setSpecificationFr(product.getSpecification().getLocalizedText(Language.FRENCH));
				
				userProductDTO.setLsProductId(product.getLoyaltySourceProductId());				
				if(product.getModelNumberList().size() > 0)
					userProductDTO.setManufacturerProductId(product.getModelNumberList().get(0).getModelNumber());
				
				userProductDTO.setNameEng(product.getName().getLocalizedText(Language.ENGLISH));
								
				double costVal = 0d;
				if (product.getCost() != null) {
					if (product.getCost().matches("^\\d+(\\.\\d{1,1})?$")||
						product.getCost().matches("^\\d+(\\.\\d{1,2})?$")||
						product.getCost().matches("^\\d+(\\.\\d{1,3})?$")||
						product.getCost().matches("^\\d+(\\.\\d{1,4})?$")
					) {	// from DB, so it is 1 or 2 decimals.
						costVal = Double.parseDouble(product.getCost());
					}
				}
				userProductDTO.setCost(format(costVal, "###,###,###.00"));
								
				double userPriceVal = 0d;
				if (product.getUserPrice() != null) {
					if (product.getUserPrice().matches("^\\d+(\\.\\d{1,1})?$")||
						product.getUserPrice().matches("^\\d+(\\.\\d{1,2})?$")||
						product.getUserPrice().matches("^\\d+(\\.\\d{1,3})?$")||
						product.getUserPrice().matches("^\\d+(\\.\\d{1,4})?$")) {	// from DB, so it is 1 or 2 decimals.						
						userPriceVal = Double.parseDouble(product.getUserPrice());
					}
				}			
				userProductDTO.setUserPrice(format(userPriceVal, "###,###,###.00"));				
				
				double msrpVal = 0d;
				if (product.getMsrp() != null) {
					if (product.getMsrp().matches("^\\d+(\\.\\d{1,1})?$")||	
						product.getMsrp().matches("^\\d+(\\.\\d{1,2})?$")||
						product.getMsrp().matches("^\\d+(\\.\\d{1,3})?$")||
						product.getMsrp().matches("^\\d+(\\.\\d{1,4})?$")
					) {	// from DB, so it is 1 or 2 decimals.
						msrpVal = Double.parseDouble(product.getMsrp());
					}
				}				
				userProductDTO.setMsrp(format(msrpVal, "###,###,###.00"));
				
				double profit = 0d;
				double percProfit = 0d;
				if(product.getUserPrice() != null && product.getCost() != null){
					profit =  userPriceVal -  costVal;
					percProfit = (costVal != 0d) ? (100d * profit / costVal) : 0d;
				}		
				userProductDTO.setDollarProfit(format(profit, "###,###,###.00"));
				userProductDTO.setPercProfit(format(percProfit, "0.00"));
				userProductDTO.setBrandId(product.getBrand().getId());
				userProductDTO.setBrandName(product.getBrand().getName());				
				userProductDTO.setUserId(product.getUserId());				
				userProductDTO.setProductStatus(product.getStatus());					
				userProductDTO.setPriceType((PriceType)CommonUtils.enumFromValue(PriceType.values(), product.getPriceType()));
				
				//We set user product status
				userProductDTO.setUserProductStatus(product.getUserProductStatus());
				//set product status to show in manage account
				userProductDTO.setProductStatus(product.getStatus());
				
				userProductDTOList.add(userProductDTO);
		 }	
		return userProductDTOList;		
	}
	
	public static List<ProductDTO> getBasicProductDTOList(List<Product> list) {
		 List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();		 
		 for(Product product: list){	
			 	BrandDTO brandDTO = BrandDTO.valueOf(product.getBrand().getId(), product.getBrand().getName()); 						
			 	CategoryDTO categoryDTO = CategoryDTO.valueOf(product.getCategory().getId(), 
						 					product.getCategory().getCategoryGoupeId(), 
						 					product.getCategory().getName(), 
						 					product.getCategory().getCode(), 
						 					null, 
						 					null);			 
			 	
			 	ProductDTO productDTO = new ProductDTO.Builder(product.getId(), brandDTO, categoryDTO).build();

			 	productDTO.setSpecificationEng(product.getSpecification().getLocalizedCommonDTO(Language.ENGLISH));
				productDTO.setSpecificationFr(product.getSpecification().getLocalizedCommonDTO(Language.FRENCH));
				
			 	productDTO.setLoyaltyProductId(product.getLoyaltySourceProductId());	
			 	
			 	if(product.getModelNumberList().size() > 0)
			 	{
			 		productDTO.setManufacturerProductId(product.getModelNumberList().get(0).getModelNumber());
			 	}
				
			 	productDTO.setNameEng(product.getName().getLocalizedCommonDTO(Language.ENGLISH));		
				productDTO.setNameFr(product.getName().getLocalizedCommonDTO(Language.FRENCH));
				
				productDTO.setCost( StringUtils.formatStringToDecimalForm(product.getCost()));										
				productDTO.setMsrp(StringUtils.formatStringToDecimalForm(product.getMsrp()));
					
				productDTO.setBrand(brandDTO);
				productDTO.setCategory(categoryDTO);
				
				productDTO.setStatus(product.getStatus());
				productDTO.setStatusName(((ProductStatus)CommonUtils.enumFromValue(ProductStatus.values(), product.getStatus().getValue())).name());
					
				productDTOList.add(productDTO);
		 }	
		return productDTOList;		
	}
	
	
	public static List<CommonDTO> getAllCommonDTOFromSpecification(List<Specification> list, LoyaltyEnum language) {
		
		List<CommonDTO> dtoList = new ArrayList<CommonDTO>();
		CommonDTO dto;
		for(Specification spec : list){			
			dto = CommonDTO.valueOf(spec.getId(), spec.getName(), 
							spec.getNameTranslation().getLocalizedText(language));			
			dtoList.add(dto);
		}		
		return dtoList;		
	}
	
	public static BrandDTO getBrandDTO(Brand brand)
	{
	    BrandDTO brandDTO = BrandDTO.valueOf(brand.getId());
	    brandDTO.setName(brand.getName());
	    brandDTO.setDescription(brand.getDescription());
	    brandDTO.setCreationDate(brand.getCreationDate());
	    brandDTO.setCode(brand.getCode());
	    brandDTO.setSatisfact(brand.getSatisfact());
	    brandDTO.setCategoryGroupListLong(brand.getCategoryGroupId());
	    if(brand.getImage().getId() != null)
	    	brandDTO.setImage(getImageDTO(brand.getImage()));
	    return(brandDTO);
	}
	
	public static Map<Integer, ProductListDTO> getProductListRangeDTO(List<ProductDTO> listDTO){		
		Collections.sort(listDTO, ProductDTO.MSRP_DESC);
		return getRangeByEcartMap(listDTO);		
	}
	
	static synchronized Map<Integer, ProductListDTO> getRangeMap(List<ProductDTO> list){
		
		Map<Integer, ProductListDTO> map = new HashMap<Integer, ProductListDTO>();
		
		ProductListDTO pListDTO = null; 
		List<ProductDTO> tempList = new ArrayList<ProductDTO>();
		ProductDTO dto = null;

		Integer	idMap = 0;
		int size = list.size();				
		boolean first = true;
		int i = 0; 
		for(Iterator<ProductDTO> iter = list.iterator(); iter.hasNext();){			
			dto = iter.next();
			tempList.add(dto);	
			if(first){
				pListDTO = new ProductListDTO();
				pListDTO.setMaximumRange(dto.getMsrp());				
				first = false;
			}
			else if(i % 10 == 0 || i == size - 1){	
				pListDTO.setMinimumRange(dto.getMsrp());
				pListDTO.setProductList(new ArrayList<ProductDTO>(tempList));
				map.put(idMap, pListDTO);
				tempList.clear();
				first = true;
				idMap++;				
			}
			i++;
		}		
		return map;
	}
	
	static synchronized Map<Integer, ProductListDTO> getRangeByEcartMap(List<ProductDTO> list){
		
		Map<Integer, ProductListDTO> map = new HashMap<Integer, ProductListDTO>();
		
		ProductListDTO pListDTO = null; 
		List<ProductDTO> tempList = new ArrayList<ProductDTO>();
		ProductDTO dto = null;
		double ecart = 20;  // TODO determine ecart type
		double calEcart,
			   nextValue;
		Integer	idMap = 0;			
		boolean first = true;
		for(ListIterator<ProductDTO> iter = list.listIterator(); iter.hasNext();){			
			dto = iter.next();
			tempList.add(dto);	
			if(first){
				pListDTO = new ProductListDTO();
				pListDTO.setMaximumRange(dto.getMsrp());				
				first = false;
			}
			if(iter.hasNext()){
				nextValue = Double.parseDouble(iter.next().getMsrp());
				calEcart = Double.parseDouble(dto.getMsrp()) - nextValue;
				if(calEcart > ecart){
					pListDTO.setMinimumRange( String.valueOf(nextValue+0.01) );
					pListDTO.setProductList(new ArrayList<ProductDTO>(tempList));
					map.put(idMap, pListDTO);
					tempList.clear();
					first = true;
					idMap++;	
				}
				iter.previous();
			}
			else{	
				pListDTO.setMinimumRange(dto.getMsrp());
				pListDTO.setProductList(new ArrayList<ProductDTO>(tempList));
				map.put(idMap, pListDTO);				
			}			
		}		
		return map;
	}
	
	public static UserDTO getUserDTO(User user) {	
		if(user==null)return null;
		String login = user.getLogin();
		String code = user.getCode();
		Integer typeId = user.getTypeId();
		String password = user.getPassword();
		String email = user.getEmail(); 
		boolean active = user.isActive();
		String realName = user.getRealName(); 
		String note=user.getNote();
		// Integer age = user.getAge();
		Date updateDate=user.getUpdateDate();
		Date createdDate=user.getCreationDate();
		String address = user.getAddress();
		String postalCode = user.getPostalCode();
		String phone = user.getPhone();
		Integer primaryLanguage=1;
		if(user.getPrimaryLanguage()!=null) user.getPrimaryLanguage().getValue();
		Integer secondaryLanguage=1;
		if(user.getSecondaryLanguage()!=null)user.getSecondaryLanguage().getValue();
		String multiplier = user.getMultiplier();
		Long clientCategoryId=user.getClientCategoryId();
		String clientCategoryName=user.getClientCategoryName();
		String managerRealName=user.getManagerRealName();
		Long userId=user.getId();
		String specialHandlingName = user.getSpecialHandlingName();
		Double specialHandlingFee = user.getSpecialHandlingFee();
		Double shippingInsuranceMultiplier = user.getShippingInsuranceMultiplier();
		Long currencyId				= user.getCurrencyId();
		String currencySymbol		= user.getCurrencySymbol();
		Double currencyRate			= user.getCurrencyRate();
		Date currencyCreationDate	= user.getCurrencyCreationDate();
		UserDTO resultUserDto=UserDTO.valueOf(login, code, typeId, password, email, active, 
				realName, address, postalCode, phone, primaryLanguage, 
				secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier,
				currencyId, currencySymbol, currencyRate, currencyCreationDate);
		resultUserDto.setClientCategoryId(clientCategoryId);
		resultUserDto.setClientCategoryName(clientCategoryName);
		resultUserDto.setManagerRealName(managerRealName);
		resultUserDto.setUpdateDate(updateDate);
		resultUserDto.setCreationDate(createdDate);
		resultUserDto.setNote(note);
		resultUserDto.setId(userId);
		resultUserDto.setSpecialHandlingName(specialHandlingName);
		resultUserDto.setSpecialHandlingFee(specialHandlingFee);
		resultUserDto.setShippingInsuranceMultiplier(shippingInsuranceMultiplier);
		
		return resultUserDto;
	}

	public static UserDTO getUserDTOWithUserID(User user) {
		Long userId = user.getId();
		String login = user.getLogin();
		String code = user.getCode();
		Integer typeId = user.getTypeId();
		String password = user.getPassword();
		String email = user.getEmail(); 
		boolean active = user.isActive();
		String realName = user.getRealName();
		String address = user.getAddress();
		String postalCode = user.getPostalCode();
		String phone = user.getPhone();
		Integer primaryLanguage = user.getPrimaryLanguage().getValue();
		Integer secondaryLanguage = user.getSecondaryLanguage().getValue();
		String multiplier = user.getMultiplier();
		String specialHandlingName = user.getSpecialHandlingName();
		Double specialHandlingFee = user.getSpecialHandlingFee();
		Double shippingInsuranceMultiplier = user.getShippingInsuranceMultiplier();
		Long currencyId				= user.getCurrencyId();
		String currencySymbol		= user.getCurrencySymbol();
		Double currencyRate			= user.getCurrencyRate();
		Date currencyCreationDate	= user.getCurrencyCreationDate();
		return UserDTO.valueOf(userId, login, code, typeId, password, email, active, 
				realName, address, postalCode, phone, primaryLanguage, 
				secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee,
				shippingInsuranceMultiplier,
				currencyId, currencySymbol, currencyRate, currencyCreationDate);
	}
	
	

	public static UserDTO getUserDTO_0(User user) {
		String login = user.getLogin();
		String password = user.getPassword();
		return UserDTO.valueOf(login, password);
	}
	
	public static List<UserDTO> getActiveClients(List<User> usrList) {
		List<UserDTO> outcome = new ArrayList<UserDTO>();
		String login = "";
		String password = "";
		for (User usr : usrList) {
			login = usr.getLogin();
			password = usr.getPassword();
			outcome.add(UserDTO.valueOf(login, password));
		}
		return outcome;
	}
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	private static String format(double value, String pattern) {
		return format(value, pattern, "en", "US");
	}
	
	public static UserProductPriceDTO getUserProductPriceDTO(UserProductPrice userProductPrice) {
		UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
		if (userProductPrice != null) {
			userProductPriceDTO.setProductTitle(userProductPrice.getProductTitle());
			userProductPriceDTO.setStock(userProductPrice.getStock());
			userProductPriceDTO.setLsProductId(userProductPrice.getLsProductId());
			userProductPriceDTO.setPriceNum(userProductPrice.getPriceNum());
			userProductPriceDTO.setId(userProductPrice.getId());
			userProductPriceDTO.setUserId(userProductPrice.getUserId());
			userProductPriceDTO.setProductId(userProductPrice.getProductId());
			userProductPriceDTO.setPriceType(userProductPrice.getPriceType());
			userProductPriceDTO.setUserStatus(userProductPrice.getUserStatus());	
			userProductPriceDTO.setPrice(userProductPrice.getPrice());
			userProductPriceDTO.setProfit(userProductPrice.getProfit());
			userProductPriceDTO.setDiscount(userProductPrice.getDiscount());
			userProductPriceDTO.setExcluded(userProductPrice.getExcluded());
			userProductPriceDTO.setShippingCoverage(userProductPrice.getShippingCoverage());
			userProductPriceDTO.setShippingTotalCanada(userProductPrice.getShippingTotalCanada());
			return userProductPriceDTO;
		} else {
			return null;			
		}
	}
	
	public static List<ProvinceDTO> getProvinceDTOList(List<Province> provinceList) {
		List<ProvinceDTO> provinceDTOList = new ArrayList<ProvinceDTO>();
		ProvinceDTO provinceDTO = new ProvinceDTO();
		for (Province province : provinceList) {
			provinceDTO = new ProvinceDTO();
			provinceDTO.setId(province.getId());
			provinceDTO.setName(province.getName());
			provinceDTO.setCode(province.getCode());
			provinceDTO.setPopulationPercent(province.getPopulationPercent());
			provinceDTO.setTaxe(province.getTaxe());
			provinceDTOList.add(provinceDTO);
		}
		return provinceDTOList;
	}
	
	public static List<CityDTO> getCityDTOList(List<City> cityList) {
		List<CityDTO> cityDTOList = new ArrayList<CityDTO>();
		CityDTO cityDTO = new CityDTO();
		for (City city : cityList) {
			cityDTO = new CityDTO();
			cityDTO.setId(city.getId());
			cityDTO.setName(city.getName());
			cityDTO.setProvinceId(city.getProvinceId());
			cityDTO.setPopulationPercentage(city.getPopulationPercent());
			cityDTO.setPostalCode(city.getPostalCode());
			cityDTOList.add(cityDTO);
		}
		return cityDTOList;		
	}	
	
	public static ShippingCityDTO getShippingCityDTO(ShippingCity shippingCity) {
		ShippingCityDTO shippingCityDTO = new ShippingCityDTO();
		if (shippingCity != null) {
			shippingCityDTO.setId(shippingCity.getId());
			shippingCityDTO.setProductId(shippingCity.getProductId());
			shippingCityDTO.setCityId(shippingCity.getCityId());
			shippingCityDTO.setExpeditedParcelPrice(shippingCity.getExpeditedParcelPrice());
			return shippingCityDTO;
		} else {
			return null;
		}
	}
	
	public static List<ShippingCityDTO> getShippingCityDTOList(List<ShippingCity> shippingCityList) {
		List<ShippingCityDTO> shippingCityDTOList = new ArrayList<ShippingCityDTO>();
		ShippingCityDTO shippingCityDTO = new ShippingCityDTO();
		for (ShippingCity shippingCity : shippingCityList) {
			shippingCityDTO = new ShippingCityDTO();
			shippingCityDTO = getShippingCityDTO(shippingCity);
			shippingCityDTOList.add(shippingCityDTO);
		}
		return shippingCityDTOList;
	}
	
	public static CityDTO getCityDTO(City city) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setId(city.getId());
		cityDTO.setName(city.getName());
		cityDTO.setProvinceId(city.getProvinceId());
		cityDTO.setPopulationPercentage(city.getPopulationPercent());
		cityDTO.setPostalCode(city.getPostalCode());
		return cityDTO;
	}	
	
	public static ProvinceDTO getProvinceDTO(Province province) {
		ProvinceDTO provinceDTO = new ProvinceDTO();
		provinceDTO.setId(province.getId());
		provinceDTO.setName(province.getName());
		provinceDTO.setCode(province.getCode());
		provinceDTO.setTaxe(province.getTaxe());
		provinceDTO.setPopulationPercent(province.getPopulationPercent());
		return provinceDTO;
	}
	
	public static ShippingProvinceDTO getShippingProvinceDTO(ShippingProvince shippingProvince) {
		ShippingProvinceDTO shippingProvinceDTO = new ShippingProvinceDTO();
		if (shippingProvince != null) {
			shippingProvinceDTO.setId(shippingProvince.getId());
			shippingProvinceDTO.setProductId(shippingProvince.getProductId());
			shippingProvinceDTO.setProvinceId(shippingProvince.getProvinceId());
			shippingProvinceDTO.setWeightedTotalProvince(shippingProvince.getWeightedTotalProvince());
			return shippingProvinceDTO;
		} else {
			return null;
		}
	}
	
	public static List<ShippingTotalDTO> getShippingTotalDTOList(List<ShippingTotal> shippingTotalList) {
		List<ShippingTotalDTO> shippingTotalDTOList = new ArrayList<ShippingTotalDTO>();
		ShippingTotalDTO shippingTotalDTO = new ShippingTotalDTO();
		for (ShippingTotal shippingTotal : shippingTotalList) {
			shippingTotalDTO = new ShippingTotalDTO();
			shippingTotalDTO.setId(shippingTotal.getId());
			shippingTotalDTO.setProductId(shippingTotal.getProductId());
			shippingTotalDTO.setUserId(shippingTotal.getUserId());
			shippingTotalDTO.setProvinceId(shippingTotal.getProvinceId());
			shippingTotalDTO.setWeightedProvinceTotalWithCoverage(shippingTotal.getWeightedProvinceTotalWithCoverage());
			shippingTotalDTO.setAverageShippingTotal(shippingTotal.getAverageShippingTotal());
			shippingTotalDTOList.add(shippingTotalDTO);
		}
		return shippingTotalDTOList;
	}
	
	public static List<UserProvincePopulationDTO> getUserProvincePopulationDTOList(List<UserProvincePopulation> userProvincePopulationList) {
		List<UserProvincePopulationDTO> userProvincePopulationDTOList = new ArrayList<UserProvincePopulationDTO>();
		UserProvincePopulationDTO userProvincePopulationDTO = new UserProvincePopulationDTO();
		for (UserProvincePopulation userProvincePopulation : userProvincePopulationList) {
			userProvincePopulationDTO = new UserProvincePopulationDTO();
			userProvincePopulationDTO.setId(userProvincePopulation.getId());
			userProvincePopulationDTO.setUserId(userProvincePopulation.getUserId());
			userProvincePopulationDTO.setProvinceId(userProvincePopulation.getProvinceId());
			userProvincePopulationDTO.setPopulationPercent(userProvincePopulation.getPopulationPercent());
			userProvincePopulationDTOList.add(userProvincePopulationDTO);
		}
		return userProvincePopulationDTOList;		
	}
		
	public static List<ShippingProvinceDTO> getShippingProvinceDTOList(List<ShippingProvince> shippingProvinceList) {
		List<ShippingProvinceDTO> shippingProvinceDTOList = new ArrayList<ShippingProvinceDTO>();
		ShippingProvinceDTO shippingProvinceDTO = new ShippingProvinceDTO();		
		for (ShippingProvince shippingProvince : shippingProvinceList) {			
			shippingProvinceDTO = new ShippingProvinceDTO();
			shippingProvinceDTO.setId(shippingProvince.getId());
			shippingProvinceDTO.setProductId(shippingProvince.getProductId());
			shippingProvinceDTO.setProvinceId(shippingProvince.getProvinceId());
			shippingProvinceDTO.setWeightedTotalProvince(shippingProvince.getWeightedTotalProvince());
			shippingProvinceDTOList.add(shippingProvinceDTO);
		}
		return shippingProvinceDTOList;
	}
	
	public static UserProvincePopulationDTO getUserProvincePopulation(UserProvincePopulation userProvincePopulation) {
		UserProvincePopulationDTO userProvincePopulationDTO = new UserProvincePopulationDTO();
		if (userProvincePopulation != null) {
			userProvincePopulationDTO.setId(userProvincePopulation.getId());
			userProvincePopulationDTO.setUserId(userProvincePopulation.getUserId());
			userProvincePopulationDTO.setProvinceId(userProvincePopulation.getProvinceId());
			userProvincePopulationDTO.setPopulationPercent(userProvincePopulation.getPopulationPercent());
		}
		return userProvincePopulationDTO;
	}
	
	public static List<Long> getProductDTOLightList(List<Product> productList) {
		List<Long> idsList = new ArrayList<Long>();
		for (Product product : productList) {
			idsList.add(product.getId());
		}
		return idsList;
	}
	
	public static AlterUserProductXMLDTO getAlterUserProductXML(AlterUserProductXML alterUserProductXML) {
		AlterUserProductXMLDTO alterUserProductXMLDTO = new AlterUserProductXMLDTO();
		if (alterUserProductXML != null) {
			alterUserProductXMLDTO.setId(alterUserProductXML.getId());
			alterUserProductXMLDTO.setUserId(alterUserProductXML.getUserId());
			alterUserProductXMLDTO.setProductId(alterUserProductXML.getProductId());
			alterUserProductXMLDTO.setPriceDiscount(alterUserProductXML.getPriceDiscount());
			alterUserProductXMLDTO.setExcluded(alterUserProductXML.getExcluded());
			alterUserProductXMLDTO.setShipping(alterUserProductXML.getShipping());
			alterUserProductXMLDTO.setUserProductToBeExecuted(alterUserProductXML.getUserProductToBeExecuted());
			alterUserProductXMLDTO.setExcludedMeaning(alterUserProductXML.getExcludedMeaning());
			if(alterUserProductXML.getPrice()!=null) alterUserProductXMLDTO.setPrice(alterUserProductXML.getPrice());
			return alterUserProductXMLDTO;
		} else {
			return null;
		}
	}
	
	public static AlterProductXMLDTO getAlterProductXML(AlterProductXML alterProductXML) {
		AlterProductXMLDTO alterProductXMLDTO = new AlterProductXMLDTO();
		if (alterProductXML != null) {
			alterProductXMLDTO.setId(alterProductXML.getId());
			alterProductXMLDTO.setProductId(alterProductXML.getProductId());
			alterProductXMLDTO.setBrandId(alterProductXML.getBrandId());
			alterProductXMLDTO.setCategoryId(alterProductXML.getCategoryId());
			alterProductXMLDTO.setTypeId(alterProductXML.getTypeId());
			alterProductXMLDTO.setImageId(alterProductXML.getImageId());
			alterProductXMLDTO.setStatusId(alterProductXML.getStatusId());
			alterProductXMLDTO.setNameEn(alterProductXML.getNameEn());
			alterProductXMLDTO.setNameFr(alterProductXML.getNameFr());
			alterProductXMLDTO.setDescriptionEn(alterProductXML.getDescriptionEn());
			alterProductXMLDTO.setDescriptionFr(alterProductXML.getDescriptionFr());
			alterProductXMLDTO.setSpecificationEn(alterProductXML.getSpecificationEn());
			alterProductXMLDTO.setSpecificationFr(alterProductXML.getSpecificationFr());
			alterProductXMLDTO.setOtherEn(alterProductXML.getOtherEn());
			alterProductXMLDTO.setOtherFr(alterProductXML.getOtherFr());
			alterProductXMLDTO.setWarrantyEn(alterProductXML.getWarrantyEn());
			alterProductXMLDTO.setWarrantyFr(alterProductXML.getWarrantyFr());
			alterProductXMLDTO.setDimensions(alterProductXML.getDimensions());
			alterProductXMLDTO.setWeight(alterProductXML.getWeight());
			alterProductXMLDTO.setModelNumber(alterProductXML.getModelNumber());
			alterProductXMLDTO.setMsrp(alterProductXML.getMsrp());
			alterProductXMLDTO.setShipping(alterProductXML.getShipping());
			alterProductXMLDTO.setShipment(alterProductXML.getShipment());
			alterProductXMLDTO.setProductToBeExecuted(alterProductXML.getProductToBeExecuted());
			return alterProductXMLDTO;
		} else {
			return null;	
		}
	}
	
	public static ShippingTotalDTO getShippingTotalDTO(ShippingTotal shippingTotal) {
		ShippingTotalDTO shippingTotalDTO = new ShippingTotalDTO();
		if (shippingTotal != null) {
			shippingTotalDTO.setId(shippingTotal.getId());
			shippingTotalDTO.setProductId(shippingTotal.getProductId());
			shippingTotalDTO.setProvinceId(shippingTotal.getProvinceId());
			shippingTotalDTO.setUserId(shippingTotal.getUserId());
			shippingTotalDTO.setWeightedProvinceTotalWithCoverage(shippingTotal.getWeightedProvinceTotalWithCoverage());
			shippingTotalDTO.setAverageShippingTotal(shippingTotal.getAverageShippingTotal());
			return shippingTotalDTO;
		} else {
			return null;
		}		
	}
	
	public static List<ClientCategoryDTO>getAllClientCategoryDTO(List<ClientCategory>list){
		 List<ClientCategoryDTO> listResult=new  ArrayList<ClientCategoryDTO>();
		 if(list==null){
			 return null;
		 }

		for(ClientCategory cl : list) {			
			ClientCategoryDTO cldto=new ClientCategoryDTO();
			cldto.setClientCategoryId(cl.getClientCategoryId());
			cldto.setClientCategoryName(cl.getClientCategoryName());
			cldto.setClientCategoryUserId(cl.getClientCategoryUserId());
			cldto.setClientCategoryUserLogin(cl.getClientCategoryUserLogin());
			cldto.setCountTempUsed(cl.getCountTempUsed());
			cldto.setCreationDate(cl.getCreationDate());
			cldto.setManagerId(cl.getManagerId());
			cldto.setManagerRealName(cl.getManagerRealName());
			cldto.setBrandCoefficient(cl.getBrandCoefficient());
			cldto.setProfitCoefficient(cl.getProfitCoefficient());
			cldto.setUnitSoldCoefficient(cl.getUnitSoldCoefficient());
			listResult.add(cldto);
		}
		return listResult;
	}
	
	public static ClientCategoryDTO getCategoryDTO(ClientCategory clientCategory ){
		ClientCategoryDTO result=null;
		if(clientCategory!=null) {
		result=new ClientCategoryDTO();
		result.setClientCategoryId(clientCategory.getClientCategoryId());
		result.setClientCategoryName(clientCategory.getClientCategoryName());
		//result.setClientCategoryUserId(clientCategory.getClientCategoryUserId());
		}
		return result;
	}
	
	public static ClientCategory buildCategory(ClientCategoryDTO clcDTO){
		ClientCategory result=new ClientCategory() ;
		if(clcDTO!=null) {
			result.setClientCategoryId(clcDTO.getClientCategoryId());
			result.setClientCategoryName(clcDTO.getClientCategoryName());
			result.setClientCategoryUserId(clcDTO.getClientCategoryUserId());
			result.setClientCategoryUserLogin(clcDTO.getClientCategoryUserLogin());
			result.setCountTempUsed(clcDTO.getCountTempUsed());
			result.setCreationDate(clcDTO.getCreationDate());
			result.setManagerId(clcDTO.getManagerId());
			result.setManagerRealName(clcDTO.getManagerRealName());
			result.setBrandCoefficient(clcDTO.getBrandCoefficient());
			result.setProfitCoefficient(clcDTO.getProfitCoefficient());
			result.setUnitSoldCoefficient(clcDTO.getUnitSoldCoefficient());
		}
		return result;
	}

	public static List<OperationsDTO> getOperationsDTOByType(List<Operations>operationsList){
		List<OperationsDTO> result=null;
		if(operationsList!=null){
			result=new ArrayList<OperationsDTO>(); 
			for(Operations op:operationsList){
				OperationsDTO opDTO=new OperationsDTO();
				opDTO.setId(op.getId());
				opDTO.setDataAfter(op.getDataAfter());
				opDTO.setDataBefore(op.getDataBefore());
				opDTO.setOperationDate(op.getOperationDate());
				opDTO.setOperationType(op.getOperationType());
				opDTO.setUserId(op.getUserId());
				opDTO.setRealNameUser(op.getRealNameUser());
				opDTO.setObjectId(op.getObjectId());
				result.add(opDTO);
			}
		}
		return result;
	}
	
	public static UserFileRecoveryDTO getUserFileRecoveryDTO(UserFileRecovery ufr){
		if(ufr==null)return null;
		UserFileRecoveryDTO ufrDTO= new UserFileRecoveryDTO();
		if(ufr.getId()==null)ufr.setId(0L);
		ufrDTO.setId(ufr.getId()) ;
		ufrDTO.setProductOrderNumber(ufr.getProductOrderNumber());
		ufrDTO.setFileTypeIdConfirm(ufr.getFileTypeIdConfirm());
		
		ufrDTO.setFileFormatIdComfirm(ufr.getFileFormatIdComfirm());
		
		ufrDTO.setProductOrderDate(ufr.getProductOrderDate());
		ufrDTO.setClientOrderNumber(ufr.getClientOrderNumber());
		ufrDTO.setClientNumber(ufr.getClientNumber());
		ufrDTO.setClientOtherId(ufr.getClientOtherId());
		ufrDTO.setCstProductNumber(ufr.getCstProductNumber());
		ufrDTO.setClientProductNumber(ufr.getClientProductNumber());
		ufrDTO.setNotes(ufr.getNotes());
		ufrDTO.setShippingCompany(ufr.getShippingCompany());
		ufrDTO.setClientFirstName(ufr.getClientFirstName());
		ufrDTO.setClientLastName(ufr.getClientLastName());
		ufrDTO.setClientStreet(ufr.getClientStreet());
		ufrDTO.setClientOtherStreet(ufr.getClientOtherStreet());
		ufrDTO.setClientCity(ufr.getClientCity());
		ufrDTO.setClientPostalCode(ufr.getClientPostalCode());
		ufrDTO.setClientProvince(ufr.getClientProvince());
		ufrDTO.setClientPhone(ufr.getClientPhone());
		ufrDTO.setClientEmail(ufr.getClientEmail());
		ufrDTO.setSpecialHandlingName(ufr.getSpecialHandlingName());
		ufrDTO.setSpecialHandlingFee(ufr.getSpecialHandlingFee());
		ufrDTO.setLsProductID(ufr.getLsProductID());
		ufrDTO.setProductDescription(ufr.getProductDescription());
		ufrDTO.setUnitPrice(ufr.getUnitPrice());
		ufrDTO.setCompanyHeader(ufr.getCompanyHeader());
		ufrDTO.setUserId(ufr.getUserId());
		ufrDTO.setFileTypeId(ufr.getFileTypeId());
		ufrDTO.setFileType(ufr.getFileType());
		ufrDTO.setQuantity(ufr.getQuantity());
		ufrDTO.setTagRoot(ufr.getTagRoot());

		ufrDTO.setRequiredDate(ufr.getRequiredDate());
		ufrDTO.setClientOtherNames(ufr.getClientOtherNames());
		ufrDTO.setClientPhoneZone(ufr.getClientPhoneZone());
		ufrDTO.setFormatDate(ufr.getFormatDate());
		ufrDTO.setProvidedLsProductId(ufr.getProvidedLsProductId());
		/* Added the below properties for Rideau.
		 */
		ufrDTO.setFileSeqShipping(ufr.getFileSeqShipping());
		ufrDTO.setFileSeqInvoice(ufr.getFileSeqInvoice());
		
		if(ufr.getCurrencyId()!=null) ufrDTO.setCurrencyId(ufr.getCurrencyId());
		if(ufr.getCurrencyRate()!=null) ufrDTO.setCurrencyRate(ufr.getCurrencyRate());
		if(ufr.getCurrencySymbol()!=null) ufrDTO.setCurrencySymbol(ufr.getCurrencySymbol());
		if(ufr.getCurrencyPrice()!=null) ufrDTO.setCurrencyPrice(ufr.getCurrencyPrice());
		if(ufr.getCurrencyUnitPrice()!=null) ufrDTO.setCurrencyUnitPrice(ufr.getCurrencyUnitPrice());
		if(ufr.getCurrencyTotalPrice()!=null) ufrDTO.setCurrencyTotalPrice(ufr.getCurrencyTotalPrice());
		if(ufr.getCurrencyShippingPrice()!=null) ufrDTO.setCurrencyShippingPrice(ufr.getCurrencyShippingPrice());
		
		//ETA
		//ufrDTO.setEtaFileTypeId(ufr.getEtaFileTypeId());
		ufrDTO.setEtaFieldName(ufr.getEtaFieldName());
		ufrDTO.setSecondEtaFieldName(ufr.getSecondEtaFieldName());
		return ufrDTO;
	}
	
	public static OrdersDTO getOrderDTOFromUserDataRecovery(Long userId,UserFileDataRecoveryDTO ufDataR){
		OrdersDTO result=new OrdersDTO();
		OrdersRows orderRow=new OrdersRows();
		if(ufDataR!=null){
			result.setUserId(userId);
			result.setRequiredDate(ufDataR.getRequiredDate());
			result.setCompanyHeader(ufDataR.getCompanyHeader());
			result.setShippingCompany(ufDataR.getShippingCompany());
			result.setProductOrderNumber(ufDataR.getProductOrderNumber());//poNumber
			result.setClientOrderNumber(ufDataR.getClientOrderNumber());
			result.setProductOrderDate(ufDataR.getProductOrderDate()); //poDate
			result.setQuantity(ufDataR.getQuantity());//quantity
			result.setLsProductID(ufDataR.getLsProductID());//productId
			result.setClientProductNumber(ufDataR.getClientProductNumber());
			result.setProductDescription(ufDataR.getProductDescription());//description	
			result.setUnitPrice(ufDataR.getUnitPrice()); //price
			result.setClientNumber(ufDataR.getClientNumber());//clientNumber 
			result.setClientOtherId(ufDataR.getClientOtherId());
			result.setClientFirstName(ufDataR.getClientFirstName());//clientFirstName
			result.setClientLastName(ufDataR.getClientLastName()); //clientLastName
			result.setClientOtherNames(ufDataR.getClientOtherNames());
			result.setClientStreet(ufDataR.getClientStreet()); //clientAdress
			result.setClientOtherStreet(ufDataR.getClientOtherStreet());//clientAdressOther
			result.setClientCity(ufDataR.getClientCity());//clientCity
			result.setClientPostalCode(ufDataR.getClientPostalCode());//clientPostalCode
			result.setClientProvince(ufDataR.getClientProvince());//clientProvince	
			result.setClientPhone(ufDataR.getClientPhone());//clientPhone
			result.setClientEmail(ufDataR.getClientEmail());//clientEmail	
			result.setSpecialHandlingName(ufDataR.getSpecialHandlingName());
			result.setSpecialHandlingFee(ufDataR.getSpecialHandlingFee());
			result.setCreationDate(ufDataR.getCreationDate());
			result.setLsOrderId(ufDataR.getLsOrderId());
			result.setProvidedLsProductId(ufDataR.getLsProductID());
			result.setOrderFileInfo(ufDataR.getOrderFileInfo()); // For Rideau
			orderRow.setRequiredDate(ufDataR.getRequiredDate());
			orderRow.setCstProductNumber(ufDataR.getCstProductNumber());
			orderRow.setUnitPrice(ufDataR.getUnitPrice());
			orderRow.setShippingCompany(ufDataR.getShippingCompany());
			orderRow.setProductDescription(ufDataR.getProductDescription());
			orderRow.setNotes(ufDataR.getNotes());
			orderRow.setLsProductID(ufDataR.getLsProductID());
			orderRow.setQuantity(ufDataR.getQuantity());
			orderRow.setQuantityToSplit(ufDataR.getQuantity());
			orderRow.setProvidedLsProductId(ufDataR.getLsProductID());
			result.getRowsList().add(orderRow);
		}
		return result;
	}
	
	public static OrdersRows getOrdersRowFromUserDataRecovery(UserFileDataRecoveryDTO ufDataR){

		OrdersRows result=new OrdersRows();
		if(ufDataR!=null){
			result.setRequiredDate(ufDataR.getRequiredDate());
			result.setCstProductNumber(ufDataR.getCstProductNumber());
			result.setUnitPrice(ufDataR.getUnitPrice());
			result.setShippingCompany(ufDataR.getShippingCompany());
			result.setLsProductID(ufDataR.getLsProductID());
			result.setProvidedLsProductId(ufDataR.getLsProductID());
			result.setClientProductNumber(ufDataR.getLsProductID());
			result.setProductDescription(ufDataR.getProductDescription());
			result.setQuantity(ufDataR.getQuantity());
			result.setQuantityToSplit(ufDataR.getQuantity());
		}
		return result;
	}

	public static List<Orders> getListOrdersFromListOrdersDTO(List<OrdersDTO>listOrdersDTO){
		List<Orders>result=new ArrayList<Orders>();
		for(OrdersDTO ordDTO:listOrdersDTO){
			Orders order=new Orders();
			order.setDuplicate(ordDTO.getDuplicate());
			order.setOrderFileInfo(ordDTO.getOrderFileInfo());// for rideau
			order.setManOrder(ordDTO.getManOrder());
			order.setToUpdate(ordDTO.getToUpdate());
			order.setClientCity(ordDTO.getClientCity());
			order.setClientEmail(ordDTO.getClientEmail());
			
			order.setSpecialHandlingName(ordDTO.getSpecialHandlingName());
			order.setSpecialHandlingFee(ordDTO.getSpecialHandlingFee());
			order.setTotalPrice(ordDTO.getTotalPrice());
			
			order.setClientFirstName(ordDTO.getClientFirstName());
			order.setClientLastName(ordDTO.getClientLastName());
			order.setClientNumber(ordDTO.getClientNumber());
			order.setClientOtherId(ordDTO.getClientOtherId());
			order.setClientOrderNumber(ordDTO.getClientOrderNumber());
			order.setClientOtherNames(ordDTO.getClientOtherNames());
			order.setClientOtherStreet(ordDTO.getClientOtherStreet());
			order.setClientPhone(ordDTO.getClientPhone());
			order.setClientPostalCode(ordDTO.getClientPostalCode());
			order.setClientProvince(ordDTO.getClientProvince());
			order.setClientStreet(ordDTO.getClientStreet());
			order.setCreationDate(ordDTO.getCreationDate());
			order.setId(ordDTO.getId());
			order.setLsOrderId(ordDTO.getLsOrderId());
			order.setProductOrderNumber(ordDTO.getProductOrderNumber());
			order.setRowsList(ordDTO.getRowsList());
			order.setUserId(ordDTO.getUserId());
			order.setUserLogin(ordDTO.getUserLogin());
			order.setRequiredDate(ordDTO.getRequiredDate());
			order.setInvoicedDate(ordDTO.getInvoicedDate());
			order.setProductOrderDate(ordDTO.getProductOrderDate());
			order.setQuantity(ordDTO.getQuantity());
			order.setCompanyHeader(ordDTO.getCompanyHeader());
			if(ordDTO.getShippingInsuranceMultiplier()!=null) order.setShippingInsuranceMultiplier(ordDTO.getShippingInsuranceMultiplier());
			order.setOrderFileInfo(ordDTO.getOrderFileInfo()); // for rideau
			order.setShippingCompany(ordDTO.getShippingCompany());//for rideau
			// currencyId
			if(ordDTO.getUnitPrice()!=null) order.setUnitPrice(ordDTO.getUnitPrice());
			if(ordDTO.getCurrencyId()!=null) order.setCurrencyId(ordDTO.getCurrencyId());
			if(ordDTO.getCurrencySymbol()!=null) order.setCurrencySymbol(ordDTO.getCurrencySymbol());
			if(ordDTO.getCurrencyRate()!=null) order.setCurrencyRate(ordDTO.getCurrencyRate());
			if(ordDTO.getCurrencyPrice()!=null) order.setCurrencyPrice(ordDTO.getCurrencyPrice());
			if(ordDTO.getCurrencyUnitPrice()!=null) order.setCurrencyUnitPrice(ordDTO.getCurrencyUnitPrice());
			if(ordDTO.getCurrencyTotalPrice()!=null) order.setCurrencyTotalPrice(ordDTO.getCurrencyTotalPrice());
			if(ordDTO.getCurrencyShippingPrice()!=null) order.setCurrencyShippingPrice(ordDTO.getCurrencyShippingPrice());
			
			result.add(order);
			
		}
		return result;
	}
	
	public static OrdersDTO getOrderDTOFromOrder(Orders order){
			OrdersDTO orderDTO=new OrdersDTO();
			orderDTO.setClientCity(order.getClientCity());
			orderDTO.setClientEmail(order.getClientEmail());
			orderDTO.setSpecialHandlingName(order.getSpecialHandlingName());
			orderDTO.setSpecialHandlingFee(order.getSpecialHandlingFee());
			orderDTO.setTotalPrice(order.getTotalPrice());
			orderDTO.setClientFirstName(order.getClientFirstName());
			orderDTO.setClientLastName(order.getClientLastName());
			orderDTO.setClientNumber(order.getClientNumber());
			orderDTO.setClientOtherId(order.getClientOtherId());
			orderDTO.setClientOrderNumber(order.getClientOrderNumber());
			orderDTO.setClientOtherNames(order.getClientOtherNames());
			orderDTO.setClientOtherStreet(order.getClientOtherStreet());
			orderDTO.setClientPhone(order.getClientPhone());
			orderDTO.setClientPostalCode(order.getClientPostalCode());
			orderDTO.setClientProvince(order.getClientProvince());
			orderDTO.setClientStreet(order.getClientStreet());
			orderDTO.setCreationDate(order.getCreationDate());
			orderDTO.setId(order.getId());
			orderDTO.setCompanyHeader(order.getCompanyHeader());
			orderDTO.setLsOrderId(order.getLsOrderId());
			orderDTO.setProductOrderNumber(order.getProductOrderNumber());
			orderDTO.setRowsList(order.getRowsList());
			orderDTO.setUserId(order.getUserId());
			//===================================== Rideau Integration Start ======================================== 
			if(order.getProductOrderDate()!=null)orderDTO.setProductOrderDate(order.getProductOrderDate());
			if(order.getRequiredDate()!=null)orderDTO.setRequiredDate(order.getRequiredDate());
			if(order.getCompanyHeader()!=null)orderDTO.setCompanyHeader(order.getCompanyHeader());
			if(order.getNotes()!=null)orderDTO.setNotes(order.getNotes());
			if(order.getCstProductNumber()!=null)orderDTO.setCstProductNumber(order.getCstProductNumber());
			if(order.getUnitPrice()!=null)orderDTO.setUnitPrice(order.getUnitPrice()); 
			if(order.getShippingCompany()!=null)orderDTO.setShippingCompany(order.getShippingCompany());
			if(order.getShippedDate()!=null)orderDTO.setShippedDate(order.getShippedDate());
			if(order.getTrackingNumber()!=null)orderDTO.setTrackingNumber(order.getTrackingNumber());
			if(order.getShippingPrice()!=null)orderDTO.setShippingPrice(order.getShippingPrice());
			if(order.getBilled()!=null)orderDTO.setBilled(order.getBilled());
			if(order.getProductId()!=null)orderDTO.setProductId(order.getProductId());
			if(order.getStatus()!=null)orderDTO.setStatus(order.getStatus());
			if(order.getClientProductNumber()!=null)orderDTO.setClientProductNumber(order.getClientProductNumber());
			if(order.getInvoicedDate()!=null)orderDTO.setInvoicedDate(order.getInvoicedDate());
			if(order.getQuantity()!=null)orderDTO.setQuantity(order.getQuantity());
			if(order.getOrderFileInfo()!=null)orderDTO.setOrderFileInfo(order.getOrderFileInfo());
			//===================================== Rideau Integration End ======================================== 
		
		return orderDTO;
	}
	
	public static List<OrdersDTO>getListOrderDTOFromListOrder(List<Orders> listOrders){
		List<OrdersDTO>result=new ArrayList<OrdersDTO>();
		int balance=0;
		int indexOrder=0;
		if(listOrders==null)return result;
		for(Orders order:listOrders){
			OrdersDTO orderDTO=new OrdersDTO();
			balance=(balance==1?0:1);
			if(balance==1){//
				orderDTO.setCssStyle("background-color: rgb(245,249,252);border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
			}else{
				orderDTO.setCssStyle("background-color: color:white;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
			}
			orderDTO.setIndex(indexOrder);
			indexOrder++;
			orderDTO.setClientCity(order.getClientCity());
			orderDTO.setClientEmail(order.getClientEmail());
			orderDTO.setSpecialHandlingName(order.getSpecialHandlingName());
			orderDTO.setSpecialHandlingFee(order.getSpecialHandlingFee());
			orderDTO.setTotalPrice(order.getTotalPrice());
			orderDTO.setClientFirstName(order.getClientFirstName());
			orderDTO.setClientLastName(order.getClientLastName());
			orderDTO.setClientNumber(order.getClientNumber());
			orderDTO.setClientOtherId(order.getClientOtherId());
			orderDTO.setClientOrderNumber(order.getClientOrderNumber());
			orderDTO.setClientOtherNames(order.getClientOtherNames());
			orderDTO.setClientOtherStreet(order.getClientOtherStreet());
			orderDTO.setClientPhone(order.getClientPhone());
			orderDTO.setClientPostalCode(order.getClientPostalCode());
			orderDTO.setClientProvince(order.getClientProvince());
			orderDTO.setClientStreet(order.getClientStreet());
			orderDTO.setCreationDate(order.getCreationDate());
			orderDTO.setShippingCompany(order.getShippingCompany());
			orderDTO.setRequiredDate(order.getRequiredDate());
			orderDTO.setStatus(order.getStatus());
			orderDTO.setNotes(order.getNotes());
			orderDTO.setTrackingNumber(order.getTrackingNumber());
			orderDTO.setShippedDate(order.getShippedDate());
			orderDTO.setEtaFieldName(order.getEtaFieldName());
			orderDTO.setEtaFieldValue(order.getEtaFieldValue());
			orderDTO.setSecondEtaFieldName(order.getSecondEtaFieldName());
			orderDTO.setSecondEtaFieldValue(order.getSecondEtaFieldValue());
			orderDTO.setShippingCompany(order.getShippingCompany());
			if(order.getId()==null)order.setId(0L);
			orderDTO.setId(order.getId());
			orderDTO.setUserLogin(order.getUserLogin());
			orderDTO.setClientProfileId(order.getClientProfileId());
			orderDTO.setUserId(order.getUserId());
			orderDTO.setCompanyHeader(order.getCompanyHeader());
			orderDTO.setLsOrderId(order.getLsOrderId());
			orderDTO.setLsProductID(order.getLsProductID());
			orderDTO.setProductOrderNumber(order.getProductOrderNumber());
			orderDTO.setProductOrderDate(order.getProductOrderDate());
			if(order.getShippingInsuranceMultiplier()!=null) orderDTO.setShippingInsuranceMultiplier(order.getShippingInsuranceMultiplier());
			orderDTO.setOrderFileInfo(order.getOrderFileInfo());//for rideau
			orderDTO.setRowsList(order.getRowsList());
			// currencyId
			if(order.getCurrencyId()!=null) orderDTO.setCurrencyId(order.getCurrencyId());
			if(order.getUnitPrice()!=null) orderDTO.setUnitPrice(order.getUnitPrice());
			if(order.getCurrencySymbol()!=null) orderDTO.setCurrencySymbol(order.getCurrencySymbol());
			if(order.getCurrencyRate()!=null) orderDTO.setCurrencyRate(order.getCurrencyRate());
			if(order.getCurrencyPrice()!=null) orderDTO.setCurrencyPrice(order.getCurrencyPrice());
			if(order.getCurrencyUnitPrice()!=null) orderDTO.setCurrencyUnitPrice(order.getCurrencyUnitPrice());
			if(order.getCurrencyTotalPrice()!=null) orderDTO.setCurrencyTotalPrice(order.getCurrencyTotalPrice());
			if(order.getCurrencyShippingPrice()!=null) orderDTO.setCurrencyShippingPrice(order.getCurrencyShippingPrice());
			
			int indexRow=0;
			if(orderDTO.getLsOrderId()!=null && orderDTO.getLsOrderId().length()>30 	||
							orderDTO.getUserLogin()!=null && orderDTO.getUserLogin().length()>30 ||
							orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
							orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
							orderDTO.getClientLastName()!=null && orderDTO.getClientLastName().length()>40 ||
							orderDTO.getCompanyHeader()!=null && orderDTO.getCompanyHeader().length()>40 ||
							orderDTO.getLsProductID()!=null && orderDTO.getLsProductID().length()>44 ||
							orderDTO.getClientStreet()!=null && orderDTO.getClientStreet().length()>44 ||
							orderDTO.getClientOtherStreet()!=null && orderDTO.getClientOtherStreet().length()>44 ||
							orderDTO.getClientCity()!=null && orderDTO.getClientCity().length()>25 ||
							orderDTO.getClientProvince()!=null && orderDTO.getClientProvince().length()>2 ||
							orderDTO.getClientPostalCode()!=null && orderDTO.getClientPostalCode().length()>14 ||
							orderDTO.getClientPhone()!=null && orderDTO.getClientPhone().length()>25 ||
							orderDTO.getClientEmail()!=null && orderDTO.getClientEmail().length()>60){
				orderDTO.setInfoMissing(1L);
			}
			// 2: LS_ORDER_ID (must be lest than 35 letters)
			// 3: CLIENT_LOGIN="" (must be lest than 30 letters)
			// 4: TITLE_NAME (must be lest than 14 letters)
			// 5: CLIENT_FIRST_NAME (must be lest than 30 letters)		
			// 6: CLIENT_LAST_NAME (must be lest than 40 letters)
			// 7: TITLE_NAME (must be lest than 44 letters)
			// 8: COMPANY_HEADER
			// 9: CLIENT_STREET_INF (must be lest than 44 letters)
			// 10: CLIENT_STREET1 (must be lest than 44 letters)
			// 11: CLIENT_STREET3 (must be lest than 44 letters)
			// 12: CLIENT_CITY (must be lest than 25 letters)
			// 13: CLIENT_PROVINCE (must be lest than 2 letters)
			// 14: CLIENT_POSTAL_CODE (must be lest than 14 letters)
			// 15: COUNTRY_CODE(must be lest than 3 letters)
			// 16: CLIENT_PHONE (must be lest than 25 letters)
			// 17: CLIENT_FAX (must be lest than 25 letters)
			// 18: CLIENT_EMAIL (must be lest than 60 letters)
			
			for(OrdersRows row:orderDTO.getRowsList()){
				if(row.getQuantity()==null || row.getQuantity()==0D ||
				   row.getUnitPrice()==null || row.getUnitPrice()==0D){
					orderDTO.setInfoMissing(1L);
				}
				row.setIcon("images/orders/itemValidated.png");
				if(( row.getLsPrice()==null|| row.getUnitPrice()==null)||(row.getUnitPrice()< row.getLsPrice())){
					row.setCssPrice("background-color:#FF6666;");
					orderDTO.setInfoMissing(1L);
					//orderDTO.setCssPrice("background-color:rgb(254,194,199);");
				}
				if(row.getQuantity()==null|| row.getQuantity()==0D){
					row.setCssQuantity("background-color:#FF6666;");
					orderDTO.setInfoMissing(1L);
				}
				row.setIndex(indexRow);
				indexRow++;
			}
			orderDTO.setUserId(order.getUserId());
			// alert missing information
			if(order.getProductOrderNumber()==null || order.getProductOrderNumber().equals("")||
			   order.getLsOrderId()==null || order.getLsOrderId().equals("") ||
			   order.getCreationDate()==null ||
			   order.getClientFirstName()==null || order.getClientFirstName().equals("")||
			   order.getClientLastName()==null || order.getClientLastName().equals("") ||
			   order.getClientStreet()==null || order.getClientStreet().equals("") ||
			   order.getClientCity()==null || order.getClientCity().equals("") || 
			   order.getClientProvince()==null || order.getClientProvince().equals("") ||
			   order.getClientPostalCode()==null || order.getClientPostalCode().equals("")){
			orderDTO.setInfoMissing(1L);
			}
			result.add(orderDTO);
		}
	return result;
}

	/**
	 * 
	 * @param listOrders
	 * @return
	 * @throws ServiceLocatorException 
	 */
	
	public static List<OrdersDTO>getListOrderDTOFromListOrderSorted(List<Orders> listOrders,Hashtable<String, ProvinceDTO> hashProvinces){
		List<OrdersDTO>result=new ArrayList<OrdersDTO>();
		int balance=0;
		int indexOrder=0;
		if(listOrders==null)return result;
		for(Orders order:listOrders){
			OrdersDTO orderDTO=new OrdersDTO();
			balance=(balance==1?0:1);
			if(balance==1){//
				orderDTO.setCssStyle("background-color: rgb(245,249,252);border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
			}else{
				orderDTO.setCssStyle("background-color: color:white;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
			}
			orderDTO.setIndex(indexOrder);
			indexOrder++;
			orderDTO.setDuplicate(order.getDuplicate());
			orderDTO.setQuantityOriginal(order.getQuantityOriginal());
			orderDTO.setClientProductNumber(order.getClientProductNumber());
			if(order.getClientCity()!=null)orderDTO.setClientCity(order.getClientCity());
			if(order.getClientEmail()!=null)orderDTO.setClientEmail(order.getClientEmail());
			if(order.getSpecialHandlingName()!=null)orderDTO.setSpecialHandlingName(order.getSpecialHandlingName());
			if(order.getSpecialHandlingFee()!=null)orderDTO.setSpecialHandlingFee(order.getSpecialHandlingFee());
			if(order.getTotalPrice()!=null)orderDTO.setTotalPrice(order.getTotalPrice());
			if(order.getShippingInsuranceMultiplier()!=null)orderDTO.setShippingInsuranceMultiplier(order.getShippingInsuranceMultiplier());
			if(order.getCurrencyId()!=null)orderDTO.setCurrencyId(order.getCurrencyId());
			if(order.getCurrencyRate()!=null)orderDTO.setCurrencyRate(order.getCurrencyRate());
			if(order.getCurrencySymbol()!=null)orderDTO.setCurrencySymbol(order.getCurrencySymbol());
			if(order.getCurrencyPrice()!=null)orderDTO.setCurrencyPrice(order.getCurrencyPrice());
			if(order.getCurrencyUnitPrice()!=null)orderDTO.setCurrencyUnitPrice(order.getCurrencyUnitPrice());
			if(order.getCurrencyShippingPrice()!=null)orderDTO.setCurrencyShippingPrice(order.getCurrencyShippingPrice());
			if(order.getClientFirstName()!=null)orderDTO.setClientFirstName(order.getClientFirstName());
			if(order.getClientLastName()!=null)orderDTO.setClientLastName(order.getClientLastName());
			if(order.getClientNumber()!=null)orderDTO.setClientNumber(order.getClientNumber());
			orderDTO.setClientOtherId(order.getClientOtherId());
			if(order.getClientOrderNumber()!=null)orderDTO.setClientOrderNumber(order.getClientOrderNumber());
			if(order.getClientOtherNames()!=null)orderDTO.setClientOtherNames(order.getClientOtherNames());
			if(order.getClientOtherStreet()!=null)orderDTO.setClientOtherStreet(order.getClientOtherStreet());
			if(order.getClientPhone()!=null)orderDTO.setClientPhone(order.getClientPhone());
			if(order.getClientPostalCode()!=null)orderDTO.setClientPostalCode(order.getClientPostalCode());
			if(order.getClientProvince()!=null)orderDTO.setClientProvince(order.getClientProvince());
			if(order.getClientStreet()!=null)orderDTO.setClientStreet(order.getClientStreet());
			if(order.getCreationDate()!=null)orderDTO.setCreationDate(order.getCreationDate());
			orderDTO.setId(order.getId());
			orderDTO.setCompanyHeader(order.getCompanyHeader());
			if(order.getUserLogin()!=null)orderDTO.setUserLogin(order.getUserLogin());
			if(order.getLsOrderId()!=null)orderDTO.setLsOrderId(order.getLsOrderId());
			if(order.getProductOrderNumber()!=null)orderDTO.setProductOrderNumber(order.getProductOrderNumber());
			if(order.getProductOrderDate()!=null)orderDTO.setProductOrderDate(order.getProductOrderDate());
			if(order.getOrderFileInfo()!=null)orderDTO.setOrderFileInfo(order.getOrderFileInfo()); //added for rideau
			orderDTO.setRowsList(order.getRowsList());
			if(order.getQuantity()==null || order.getQuantity()==0D ||
				order.getUnitPrice()==null || order.getUnitPrice()==0D){
					orderDTO.setInfoMissing(1L);
			}
			if(( order.getLsPrice()==null|| order.getUnitPrice()==null)||(order.getUnitPrice()< order.getLsPrice())){
					orderDTO.setInfoMissing(1L);
			}
			
			ProvinceDTO provinceDTO=null;
			if(order.getClientProvince()!=null) provinceDTO=hashProvinces.get(order.getClientProvince());
			if(order.getUserId()!=null)orderDTO.setUserId(order.getUserId());
			// alert missing information

			if(order.getProductOrderNumber()==null || order.getProductOrderNumber().equals("")||
			   order.getLsOrderId()==null || order.getLsOrderId().equals("") ||
			   order.getCreationDate()==null ||
			   order.getClientFirstName()==null || order.getClientFirstName().equals("")||
			   order.getClientLastName()==null || order.getClientLastName().equals("") ||
			   order.getClientStreet()==null || order.getClientStreet().equals("") ||
			   order.getClientCity()==null || order.getClientCity().equals("") || 
			   order.getClientProvince()==null || order.getClientProvince().equals("") ||
			   order.getClientPostalCode()==null || order.getClientPostalCode().equals("") || provinceDTO==null){
			   orderDTO.setInfoMissing(1L);
			   if(provinceDTO==null)orderDTO.setProvinceNotFound(1L);
			}
			if(order.getQuantity()!=null)orderDTO.setQuantity(order.getQuantity());
			if(order.getBilled()!=null)orderDTO.setBilled(order.getBilled());
			if(order.getCstProductNumber()!=null)orderDTO.setCstProductNumber(order.getCstProductNumber());
			orderDTO.setId(order.getId());
			if(order.getLsOrderId()!=null)orderDTO.setLsOrderId(order.getLsOrderId());
			if(order.getLsProductID()!=null)orderDTO.setLsProductID(order.getLsProductID());
			orderDTO.setProvidedLsProductId(order.getProvidedLsProductId());
			if(order.getNotes()!=null)orderDTO.setNotes(order.getNotes());
			if(order.getOrderId()!=null)orderDTO.setOrderId(order.getOrderId());
			if(order.getProductDescription()!=null)orderDTO.setProductDescription(order.getProductDescription());
			if(order.getProductId()!=null)orderDTO.setProductId(order.getProductId());
			if(order.getRequiredDate()!=null)orderDTO.setRequiredDate(order.getRequiredDate());
			orderDTO.setInvoicedDate(order.getInvoicedDate());
			if(order.getShippedDate()!=null)orderDTO.setShippedDate(order.getShippedDate());
			if(order.getShippingCompany()!=null)orderDTO.setShippingCompany(order.getShippingCompany());
			if(order.getShippingFee()!=null)orderDTO.setShippingFee(order.getShippingFee());
			if(order.getShippingPrice()!=null)orderDTO.setShippingPrice(order.getShippingPrice());
			if(order.getStatus()!=null)orderDTO.setStatus(order.getStatus());
			if(order.getStock()!=null)orderDTO.setStock(order.getStock());
			if(order.getTrackingNumber()!=null)orderDTO.setTrackingNumber(order.getTrackingNumber());
			if(order.getUnitPrice()!=null)orderDTO.setUnitPrice(order.getUnitPrice()); 
			if(order.getLsPrice()!=null)orderDTO.setLsPrice(order.getLsPrice());
			orderDTO.setCompanyHeader(order.getCompanyHeader());
			//------------------------------------
			OrdersRows row= new OrdersRows();
			ArrayList<OrdersRows>listRows=new ArrayList<OrdersRows>();
			row.setQuantity(order.getQuantity());
			row.setQuantityOriginal(order.getQuantityOriginal());
			row.setBilled(order.getBilled());
			row.setCstProductNumber(order.getCstProductNumber());
			row.setClientProductNumber(order.getClientProductNumber());
			row.setId(order.getId());
			row.setLsOrderId(order.getLsOrderId());
			row.setLsProductID(order.getLsProductID());
			row.setProvidedLsProductId(order.getProvidedLsProductId());
			row.setNotes(order.getNotes());
			row.setOrderId(order.getOrderId());
			row.setProductDescription(order.getProductDescription());
			row.setProductId(order.getProductId());
			row.setRequiredDate(order.getRequiredDate());
			row.setShippedDate(order.getShippedDate());
			row.setShippingCompany(order.getShippingCompany());
			row.setShippingFee(order.getShippingFee());
			row.setShippingPrice(order.getShippingPrice());
			row.setStatus(order.getStatus());
			row.setStock(order.getStock());
			row.setTrackingNumber(order.getTrackingNumber());
			row.setUnitPrice(order.getUnitPrice());
			row.setLsPrice(order.getLsPrice());
			row.setIcon("images/orders/itemValidated.png");
			row.setCssPrice("background-color:white;");
			if(( row.getLsPrice()==null|| row.getUnitPrice()==null)||(row.getUnitPrice()< row.getLsPrice())){
				row.setCssPrice("background-color:#FF6666;");
				orderDTO.setInfoMissing(1L);
			}
			
			row.setCssQuantity("background-color:white;");
			if(row.getQuantity()==null|| row.getQuantity()<=0D){
				row.setCssQuantity("background-color:#FF6666;");
				orderDTO.setInfoMissing(1L);
			}
			if(order.getCurrencyId()!=null)				row.setCurrencyId(order.getCurrencyId());
			if(order.getCurrencyRate()!=null)			row.setCurrencyRate(order.getCurrencyRate());
			if(order.getCurrencySymbol()!=null)			row.setCurrencySymbol(order.getCurrencySymbol());
			if(order.getCurrencyPrice()!=null)			row.setCurrencyPrice(order.getCurrencyPrice());
			if(order.getCurrencyUnitPrice()!=null)		row.setCurrencyUnitPrice(order.getCurrencyUnitPrice());
			if(order.getCurrencyShippingPrice()!=null)	row.setCurrencyShippingPrice(order.getCurrencyShippingPrice());
			
			listRows.add(row);
			orderDTO.setRowsList(listRows);
			//---------------------------------------

			if(orderDTO.getLsOrderId()!=null && orderDTO.getLsOrderId().length()>30 	||
					orderDTO.getUserLogin()!=null && orderDTO.getUserLogin().length()>30 ||
					orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
					orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
					orderDTO.getClientLastName()!=null && orderDTO.getClientLastName().length()>40 ||
					orderDTO.getCompanyHeader()!=null && orderDTO.getCompanyHeader().length()>40 ||
					orderDTO.getLsProductID()!=null && orderDTO.getLsProductID().length()>44 ||
					orderDTO.getClientStreet()!=null && orderDTO.getClientStreet().length()>44 ||
					orderDTO.getClientOtherStreet()!=null && orderDTO.getClientOtherStreet().length()>44 ||
					orderDTO.getClientCity()!=null && orderDTO.getClientCity().length()>25 ||
					orderDTO.getClientProvince()!=null && orderDTO.getClientProvince().length()>2 ||
					orderDTO.getClientPostalCode()!=null && orderDTO.getClientPostalCode().length()>14 ||
					orderDTO.getClientPhone()!=null && orderDTO.getClientPhone().length()>25 ||
					orderDTO.getClientEmail()!=null && orderDTO.getClientEmail().length()>60){
				orderDTO.setInfoMissing(1L);
				}

			result.add(orderDTO);
		}
		return result;
	}
	
	/**
	 * 
	 * @param orderDTO
	 * @return
	 */
	public static OrdersDTO getOrderDTOConsideredMissingInfo(OrdersDTO orderDTO,Hashtable<String, ProvinceDTO>hashProvinces){
		orderDTO.setInfoMissing(0L);
		orderDTO.setProvinceNotFound(0L);
		ProvinceDTO provinceDTO=hashProvinces.get(orderDTO.getClientProvince());
		if(orderDTO.getProductOrderNumber()==null || orderDTO.getProductOrderNumber().equals("")||
				   orderDTO.getLsOrderId()==null || orderDTO.getLsOrderId().equals("") ||
				   orderDTO.getCreationDate()==null ||
				   orderDTO.getClientFirstName()==null || orderDTO.getClientFirstName().equals("")||
				   orderDTO.getClientLastName()==null || orderDTO.getClientLastName().equals("") ||
				   orderDTO.getClientStreet()==null || orderDTO.getClientStreet().equals("") ||
				   orderDTO.getClientCity()==null || orderDTO.getClientCity().equals("") || 
				   orderDTO.getClientProvince()==null || orderDTO.getClientProvince().equals("") ||
				   orderDTO.getClientPostalCode()==null || orderDTO.getClientPostalCode().equals("")|| provinceDTO==null){
			orderDTO.setInfoMissing(1L);
			if(provinceDTO==null)orderDTO.setProvinceNotFound(1L);
		}
		//orderDTO.getClientEmail().getBytes().length

		if(orderDTO.getLsOrderId()!=null && orderDTO.getLsOrderId().length()>30 	||
				orderDTO.getUserLogin()!=null && orderDTO.getUserLogin().length()>30 ||
				orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
				orderDTO.getClientFirstName()!=null && orderDTO.getClientFirstName().length()>30 ||
				orderDTO.getClientLastName()!=null && orderDTO.getClientLastName().length()>40 ||
				orderDTO.getCompanyHeader()!=null && orderDTO.getCompanyHeader().length()>40 ||
				orderDTO.getLsProductID()!=null && orderDTO.getLsProductID().length()>44 ||
				orderDTO.getClientStreet()!=null && orderDTO.getClientStreet().length()>44 ||
				orderDTO.getClientOtherStreet()!=null && orderDTO.getClientOtherStreet().length()>44 ||
				orderDTO.getClientCity()!=null && orderDTO.getClientCity().length()>25 ||
				orderDTO.getClientProvince()!=null && orderDTO.getClientProvince().length()>2 ||
				orderDTO.getClientPostalCode()!=null && orderDTO.getClientPostalCode().length()>14 ||
				orderDTO.getClientPhone()!=null && orderDTO.getClientPhone().length()>25 ||
				orderDTO.getClientEmail()!=null && orderDTO.getClientEmail().length()>60){
			orderDTO.setInfoMissing(1L);
		}

		for(OrdersRows row:orderDTO.getRowsList()){
			if(row.getQuantity()==null || row.getQuantity()==0D ||
			   row.getUnitPrice()==null || row.getUnitPrice()==0D){
				orderDTO.setInfoMissing(1L);
			}
			row.setCssPrice("background-color:white;");
			if(( row.getLsPrice()==null|| row.getUnitPrice()==null)||(row.getUnitPrice()< row.getLsPrice())){
				row.setCssPrice("background-color:red;");
				orderDTO.setInfoMissing(1L);
			}
		}
		return orderDTO;
	}
	
	/**
	 * 
	 * @param orderDTO
	 * @return
	 */
	public static OrdersDTO getOrderDTOSplitted(OrdersDTO orderDTO){
		OrdersDTO result=null;
		boolean makeClone=false;
		if(orderDTO!=null){	
			result = new OrdersDTO();
			result.setClientCity(orderDTO.getClientCity());
			result.setClientEmail(orderDTO.getClientEmail());
			result.setClientFirstName(orderDTO.getClientFirstName());
			result.setClientLastName(orderDTO.getClientLastName());
			result.setClientNumber(orderDTO.getClientNumber());
			result.setClientOtherId(orderDTO.getClientOtherId());
			result.setClientOrderNumber(orderDTO.getClientOrderNumber());
			result.setClientOtherNames(orderDTO.getClientOtherNames());
			result.setClientOtherStreet(orderDTO.getClientOtherStreet());
			result.setClientPhone(orderDTO.getClientPhone());
			result.setClientPostalCode(orderDTO.getClientPostalCode());
			result.setClientProvince(orderDTO.getClientProvince());
			result.setClientStreet(orderDTO.getClientStreet());
			result.setCreationDate(orderDTO.getCreationDate());
			result.setId(orderDTO.getId());
			result.setInfoMissing(orderDTO.getInfoMissing());
			result.setUserLogin(orderDTO.getUserLogin());
			result.setLsOrderId(orderDTO.getLsOrderId());
			result.setCompanyHeader(orderDTO.getCompanyHeader());
			result.setProductOrderDate(orderDTO.getProductOrderDate());
			result.setProductOrderNumber(orderDTO.getProductOrderNumber());
			if(orderDTO.getTotalPrice()!=null) result.setTotalPrice(orderDTO.getTotalPrice());
			if(orderDTO.getShippingInsuranceMultiplier()!=null) result.setShippingInsuranceMultiplier(orderDTO.getShippingInsuranceMultiplier());
			if(orderDTO.getCurrencyId()!=null)			result.setCurrencyId(orderDTO.getCurrencyId());
			if(orderDTO.getCurrencyPrice()!=null)		result.setCurrencyPrice(orderDTO.getCurrencyPrice());
			if(orderDTO.getCurrencyUnitPrice()!=null)	result.setCurrencyUnitPrice(orderDTO.getCurrencyUnitPrice());
			if(orderDTO.getCurrencySymbol()!=null)		result.setCurrencySymbol(orderDTO.getCurrencySymbol());
			if(orderDTO.getCurrencyRate()!=null)		result.setCurrencyRate(orderDTO.getCurrencyRate());
			
			result.setOrderFileInfo(orderDTO.getOrderFileInfo());//for rideau
			for(OrdersRows row:orderDTO.getRowsList()){
				OrdersRows rowClone=new OrdersRows();
				if(row.getQuantity()!=null && row.getQuantityToSplit()!=null && row.getQuantity()> row.getQuantityToSplit()){
					double qtForOrderClone=row.getQuantityToSplit();
					double qtForOrderOriginal=row.getQuantity()-row.getQuantityToSplit();
					row.setQuantity(qtForOrderOriginal);
					row.setQuantityToSplit(qtForOrderOriginal);
					orderDTO.setQuantity(qtForOrderOriginal);
					rowClone.setQuantity(qtForOrderClone);
					result.setQuantity(qtForOrderClone);
					rowClone.setQuantityToSplit(qtForOrderClone);
					makeClone=true;
					rowClone.setBilled(row.getBilled());
					result.setBilled(row.getBilled());
					
					rowClone.setCstProductNumber(row.getCstProductNumber());
					result.setCstProductNumber(row.getCstProductNumber());
					if(row.getId()==null)row.setId(0L);
					rowClone.setId(row.getId());
					result.setId(row.getId());
					rowClone.setLsOrderId(row.getLsOrderId());result.setLsOrderId(row.getLsOrderId());
					rowClone.setLsProductID(row.getLsProductID());result.setLsProductID(row.getLsProductID());
					rowClone.setProvidedLsProductId(row.getProvidedLsProductId());result.setProvidedLsProductId(row.getProvidedLsProductId());
					rowClone.setClientProductNumber(row.getLsProductID());
					rowClone.setNotes(row.getNotes());
					result.setNotes(row.getNotes());
					rowClone.setOrderId(row.getOrderId());
					result.setOrderId(row.getOrderId());
					rowClone.setProductDescription(row.getProductDescription());
					result.setProductDescription(row.getProductDescription());
					rowClone.setProductId(row.getProductId());
					result.setProductId(row.getProductId());
					//rowClone.setQuantity(row.getQuantity());
					rowClone.setIcon(row.getIcon());
					rowClone.setRequiredDate(row.getRequiredDate());
					result.setRequiredDate(row.getRequiredDate());
					rowClone.setShippedDate(row.getShippedDate());
					result.setShippedDate(row.getShippedDate());
					rowClone.setShippingCompany(row.getShippingCompany());
					result.setShippingCompany(row.getShippingCompany());
					rowClone.setShippingFee(row.getShippingFee());
					result.setShippingFee(row.getShippingFee());
					rowClone.setShippingPrice(row.getShippingPrice());
					result.setShippingPrice(row.getShippingPrice());
					rowClone.setStatus(row.getStatus());
					result.setStatus(row.getStatus());
					rowClone.setCssPrice(row.getCssPrice());
					rowClone.setStock(row.getStock());
					result.setStock(row.getStock());
					rowClone.setTrackingNumber(row.getTrackingNumber());
					result.setTrackingNumber(row.getTrackingNumber());
					rowClone.setUnitPrice(row.getUnitPrice());
					result.setUnitPrice(row.getUnitPrice());
					rowClone.setLsPrice(row.getLsPrice());
					result.setLsPrice(row.getLsPrice());
					rowClone.setId(-1L);result.setId(-1L);
					if(row.getCurrencyId()!=null)			rowClone.setCurrencyId(row.getCurrencyId());
					if(row.getCurrencyRate()!=null)			rowClone.setCurrencyRate(row.getCurrencyRate());
					if(row.getCurrencySymbol()!=null)		rowClone.setCurrencySymbol(row.getCurrencySymbol());
					//if(row.getCurrencyCreationDate()!=null)	rowClone.setCurrencyCreationDate(row.getCurrencyCreationDate());
					if(row.getCurrencyPrice()!=null)		rowClone.setCurrencyPrice(row.getCurrencyPrice());
					if(row.getCurrencyUnitPrice()!=null)	rowClone.setCurrencyUnitPrice(row.getCurrencyUnitPrice());
					result.getRowsList().add(rowClone);
				}
			}
			result.setUserId(orderDTO.getUserId());
		}
		if(makeClone==false)result=null;
	return result;
	}
	
/**
 * 
 * @param orderDTO
 * @return
 */
	public static OrdersDTO getOrderDTOClone(OrdersDTO orderDTO){
		OrdersDTO result=null;
		if(orderDTO!=null){	
			result = new OrdersDTO();
			result.setProductOrderDate(orderDTO.getProductOrderDate());
			result.setRequiredDate(orderDTO.getRequiredDate());
			result.setUserLogin(orderDTO.getUserLogin());
			result.setClientCity(orderDTO.getClientCity());
			result.setClientEmail(orderDTO.getClientEmail());
			result.setClientFirstName(orderDTO.getClientFirstName());
			result.setClientLastName(orderDTO.getClientLastName());
			result.setClientNumber(orderDTO.getClientNumber());
			result.setClientOtherId(orderDTO.getClientOtherId());
			result.setClientOrderNumber(orderDTO.getClientOrderNumber());
			result.setClientOtherNames(orderDTO.getClientOtherNames());
			result.setClientOtherStreet(orderDTO.getClientOtherStreet());
			result.setClientPhone(orderDTO.getClientPhone());
			result.setClientPostalCode(orderDTO.getClientPostalCode());
			result.setClientProvince(orderDTO.getClientProvince());
			result.setClientStreet(orderDTO.getClientStreet());
			result.setCreationDate(orderDTO.getCreationDate());
			result.setId(orderDTO.getId());
			result.setCompanyHeader(orderDTO.getCompanyHeader());
			result.setLsOrderId(orderDTO.getLsOrderId());
			result.setCssStyle(orderDTO.getCssStyle());
			result.setInfoMissing(orderDTO.getInfoMissing());
			result.setProductOrderNumber(orderDTO.getProductOrderNumber());
			for(OrdersRows row:orderDTO.getRowsList()){
				OrdersRows rowClone=new OrdersRows();
				rowClone.setIndex(row.getIndex());
				rowClone.setIcon(row.getIcon());
				rowClone.setCss(row.getCss());
				rowClone.setQuantity(row.getQuantity());
				rowClone.setQuantityToSplit(row.getQuantityToSplit());
				rowClone.setBilled(row.getBilled());
				rowClone.setCstProductNumber(row.getCstProductNumber());
				rowClone.setId(row.getId());
				rowClone.setLsOrderId(row.getLsOrderId());
				rowClone.setLsProductID(row.getLsProductID());
				rowClone.setProvidedLsProductId(row.getProvidedLsProductId());
				rowClone.setNotes(row.getNotes());
				rowClone.setOrderId(row.getOrderId());
				rowClone.setProductDescription(row.getProductDescription());
				rowClone.setProductId(row.getProductId());
				rowClone.setRequiredDate(row.getRequiredDate());
				rowClone.setShippedDate(row.getShippedDate());
				rowClone.setShippingCompany(row.getShippingCompany());
				rowClone.setShippingFee(row.getShippingFee());
				rowClone.setShippingPrice(row.getShippingPrice());
				rowClone.setCssPrice(row.getCssPrice());
				rowClone.setStatus(row.getStatus());
				rowClone.setStock(row.getStock());
				rowClone.setTrackingNumber(row.getTrackingNumber());
				rowClone.setUnitPrice(row.getUnitPrice()); 
				rowClone.setLsPrice(row.getLsPrice());
				result.getRowsList().add(rowClone);				
			}
			result.setUserId(orderDTO.getUserId());
		}
	return result;
	}
	
/**
 * 	
 * @param listOrdersDTO
 * @param allOrders
 * @return
 */
	public static Collection getListOrderPrintDTO(List<OrdersDTO>listOrdersDTO,String logoFolder,boolean allOrders){
		ArrayList<OrdersPrintDTO> result = new ArrayList<OrdersPrintDTO>();
		boolean makeClone=false;
		int printSelected=0;
		if(listOrdersDTO!=null){
			OrdersDTO clientLandmark=listOrdersDTO.get(0);
			Long clientLandmarkId=-1L;
			if(clientLandmark!=null)clientLandmarkId=clientLandmark.getUserId();
			for(OrdersDTO orderDTO:listOrdersDTO){
				for(OrdersRows row:orderDTO.getRowsList()){
					OrdersPrintDTO orderPrint=new OrdersPrintDTO();
					Format formatter = new SimpleDateFormat("yyyy-MM-dd");
					String strDate="";
					if(orderDTO.getProductOrderDate()!=null)strDate= formatter.format(orderDTO.getCreationDate()); 
					orderPrint.setProductOrderDate(strDate);
					if(orderDTO.getProductOrderNumber()!=null)orderPrint.setProductOrderNumber(orderDTO.getProductOrderNumber());
					if(orderDTO.getClientLastName()!=null)orderPrint.setClientLastName(orderDTO.getClientLastName());
					if(orderDTO.getClientFirstName()!=null)orderPrint.setClientFirstName(orderDTO.getClientFirstName());
					if(orderDTO.getClientStreet()!=null)orderPrint.setClientStreet(orderDTO.getClientStreet());
					if(orderDTO.getClientOtherStreet()!=null)orderPrint.setClientOtherStreet(orderDTO.getClientOtherStreet());
					if(orderDTO.getClientCity()!=null)orderPrint.setClientCity(orderDTO.getClientCity());
					if(orderDTO.getClientProvince()!=null)orderPrint.setClientProvince(orderDTO.getClientProvince());
					if(orderDTO.getClientPostalCode()!=null)orderPrint.setClientPostalCode(orderDTO.getClientPostalCode());
					if(orderDTO.getClientPhone()!=null)orderPrint.setClientPhone(orderDTO.getClientPhone());
					if(orderDTO.getClientEmail()!=null)orderPrint.setClientEmail(orderDTO.getClientEmail());
					if(orderDTO.getSpecialHandlingName()!=null)orderPrint.setSpecialHandlingName(orderDTO.getSpecialHandlingName());
					if(orderDTO.getSpecialHandlingFee()!=null)orderPrint.setSpecialHandlingFee(orderDTO.getSpecialHandlingFee()+"");
					if(orderDTO.getUnitPrice()!=null)orderPrint.setUnitPrice(orderDTO.getUnitPrice()+"");
					if(orderDTO.getLsOrderId()!=null)orderPrint.setLsOrderId(orderDTO.getLsOrderId());
					if(orderDTO.getCompanyHeader()!=null)orderPrint.setCompanyHeader(orderDTO.getCompanyHeader());
					orderPrint.setCstProductNumber("");
					if(orderDTO.getClientNumber()!=null)orderPrint.setClientNumber(orderDTO.getClientNumber());
					orderPrint.setClientOtherId(orderDTO.getClientOtherId());
					if(orderDTO.getClientOrderNumber()!=null)orderPrint.setClientOrderNumber(orderDTO.getClientOrderNumber());
					orderPrint.setNotes(logoFolder+orderDTO.getUserLogin()+".png");
					strDate="";
					if(orderDTO.getRequiredDate()!=null)strDate=formatter.format(orderDTO.getRequiredDate());
					orderPrint.setRequiredDate(strDate);
					if(orderDTO.getClientOtherNames()!=null)orderPrint.setClientOtherNames(orderDTO.getClientOtherNames());
					orderPrint.setClientPhoneZone("");
					orderPrint.setCompanyHeader(orderDTO.getCompanyHeader());
					if(orderDTO.getSpecialHandlingName()!=null)orderPrint.setSpecialHandlingName(orderDTO.getSpecialHandlingName());
					if(orderDTO.getSpecialHandlingFee()!=null)orderPrint.setSpecialHandlingFee(orderDTO.getSpecialHandlingFee()+"");
					if(orderDTO.getTotalPrice()!=null)orderPrint.setTotalPrice(orderDTO.getTotalPrice()+"");
					//Currency
					if(orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null) {
						String symbol = "";
						symbol = (orderDTO.getCurrencySymbol()!=null ? " "+orderDTO.getCurrencySymbol() : " ");
						if(orderDTO.getUnitPrice()!=null) {
							Double unitPrice = (double) Math.round((orderDTO.getUnitPrice()*orderDTO.getCurrencyRate())*100) / 100;
							orderPrint.setUnitPrice(unitPrice+symbol);
						}
						if(orderDTO.getTotalPrice()!=null) {
							Double totalPrice = (double) Math.round((orderDTO.getTotalPrice()*orderDTO.getCurrencyRate())*100) / 100;
							orderPrint.setTotalPrice(totalPrice+symbol);
						}
					}
					//lines order
					if(row.getQuantity()!=null)orderPrint.setQuantity(row.getQuantity()+"");
					if(row.getLsProductID()!=null)orderPrint.setLsProductID(row.getLsProductID());
					if(row.getProductDescription()!=null)orderPrint.setProductDescription(row.getProductDescription());
					if(row.getUnitPrice()!=null){
						orderPrint.setUnitPrice(row.getUnitPrice()+"");
						//Currency
						if(orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null) {
							Double unitPrice = (double) Math.round((row.getUnitPrice()*orderDTO.getCurrencyRate())*100) / 100;
							String symbol = "";
							symbol = (orderDTO.getCurrencySymbol()!=null ? " "+orderDTO.getCurrencySymbol() : " ");
							orderPrint.setUnitPrice(unitPrice+symbol);
						}
					}
					if(row.getShippingCompany()!=null)orderPrint.setShippingCompany(row.getShippingCompany());
					if(!allOrders){
						if(orderDTO.getPrint()!=null){
							if(orderDTO.getPrint()==true){
								//if(printSelected==0)clientLandmarkId=orderDTO.getUserId();
								//if(clientLandmarkId==orderDTO.getUserId())result.add(orderPrint);
								result.add(orderPrint);
								printSelected++;
							}
						} 
					}else{
						//if(clientLandmarkId==orderDTO.getUserId())result.add(orderPrint);
						result.add(orderPrint);
					}
					
				}
			}
		}
		return result;
	}

	public static Collection getListOrderPrintDTOForReport(List<OrdersDTO>listOrdersDTO,String logoFolder,boolean allOrders){
		ArrayList<OrdersPrintDTO> result = new ArrayList<OrdersPrintDTO>();
		boolean makeClone=false;
		int printSelected=0;
		if(listOrdersDTO!=null){
			OrdersDTO clientLandmark=listOrdersDTO.get(0);
			Long clientLandmarkId=-1L;
			if(clientLandmark!=null)clientLandmarkId=clientLandmark.getUserId();
			for(OrdersDTO orderDTO:listOrdersDTO){
				//for(OrdersRows row:orderDTO.getRowsList()){
					OrdersPrintDTO orderPrint=new OrdersPrintDTO();
					Format formatter = new SimpleDateFormat("yyyy-MM-dd");
					String strDate="";
					if(orderDTO.getProductOrderDate()!=null)strDate= formatter.format(orderDTO.getCreationDate()); 
					orderPrint.setProductOrderDate(strDate);
					if(orderDTO.getProductOrderNumber()!=null)orderPrint.setProductOrderNumber(orderDTO.getProductOrderNumber());
					if(orderDTO.getClientLastName()!=null)orderPrint.setClientLastName(orderDTO.getClientLastName());
					if(orderDTO.getClientFirstName()!=null)orderPrint.setClientFirstName(orderDTO.getClientFirstName());
					if(orderDTO.getClientStreet()!=null)orderPrint.setClientStreet(orderDTO.getClientStreet());
					if(orderDTO.getClientOtherStreet()!=null)orderPrint.setClientOtherStreet(orderDTO.getClientOtherStreet());
					if(orderDTO.getClientCity()!=null)orderPrint.setClientCity(orderDTO.getClientCity());
					if(orderDTO.getClientProvince()!=null)orderPrint.setClientProvince(orderDTO.getClientProvince());
					if(orderDTO.getClientPostalCode()!=null)orderPrint.setClientPostalCode(orderDTO.getClientPostalCode());
					if(orderDTO.getClientPhone()!=null)orderPrint.setClientPhone(orderDTO.getClientPhone());
					if(orderDTO.getClientEmail()!=null)orderPrint.setClientEmail(orderDTO.getClientEmail());
					if(orderDTO.getLsOrderId()!=null)orderPrint.setLsOrderId(orderDTO.getLsOrderId());
					if(orderDTO.getCompanyHeader()!=null)orderPrint.setCompanyHeader(orderDTO.getCompanyHeader());
					orderPrint.setCstProductNumber("");
					if(orderDTO.getClientNumber()!=null)orderPrint.setClientNumber(orderDTO.getClientNumber());
					orderPrint.setClientOtherId(orderDTO.getClientOtherId());
					if(orderDTO.getClientOrderNumber()!=null)orderPrint.setClientOrderNumber(orderDTO.getClientOrderNumber());
					orderPrint.setNotes(logoFolder+orderDTO.getUserLogin()+".png");
					//orderPrint.setNotes("");
					strDate="";
					if(orderDTO.getRequiredDate()!=null)strDate=formatter.format(orderDTO.getRequiredDate());
					orderPrint.setRequiredDate(strDate);
					if(orderDTO.getClientOtherNames()!=null)orderPrint.setClientOtherNames(orderDTO.getClientOtherNames());
					orderPrint.setClientPhoneZone("");
					//lines order
					if(orderDTO.getQuantity()!=null)orderPrint.setQuantity(orderDTO.getQuantity()+"");
					if(orderDTO.getLsProductID()!=null)orderPrint.setLsProductID(orderDTO.getLsProductID());
					if(orderDTO.getProductDescription()!=null)orderPrint.setProductDescription(orderDTO.getProductDescription());
					if(orderDTO.getUnitPrice()!=null)orderPrint.setUnitPrice(orderDTO.getUnitPrice()+"");
					if(orderDTO.getShippingCompany()!=null)orderPrint.setShippingCompany(orderDTO.getShippingCompany());
					//special handling
					if(orderDTO.getSpecialHandlingName()!=null)orderPrint.setSpecialHandlingName(orderDTO.getSpecialHandlingName());
					if(orderDTO.getSpecialHandlingFee()!=null)orderPrint.setSpecialHandlingFee(orderDTO.getSpecialHandlingFee()+"");
					if(orderDTO.getTotalPrice()!=null)orderPrint.setTotalPrice(orderDTO.getTotalPrice()+"");
					//Currency
					if(orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null) {
						String symbol = "";
						symbol = (orderDTO.getCurrencySymbol()!=null ? " "+orderDTO.getCurrencySymbol() : " ");
						if(orderDTO.getUnitPrice()!=null) {
							Double unitPrice = (double) Math.round((orderDTO.getUnitPrice()*orderDTO.getCurrencyRate())*100) / 100;
							orderPrint.setUnitPrice(unitPrice+symbol);
						}
						if(orderDTO.getTotalPrice()!=null) {
							Double totalPrice = (double) Math.round((orderDTO.getTotalPrice()*orderDTO.getCurrencyRate())*100) / 100;
							orderPrint.setTotalPrice(totalPrice+symbol);
						}
					}
					if(!allOrders){
						if(orderDTO.getPrint()!=null){
							if(orderDTO.getPrint()==true){
								//if(printSelected==0)clientLandmarkId=orderDTO.getUserId();
								//if(clientLandmarkId==orderDTO.getUserId())result.add(orderPrint);
								result.add(orderPrint);
								printSelected++;
							}
						} 
					}else{
						//if(clientLandmarkId==orderDTO.getUserId())result.add(orderPrint);
						result.add(orderPrint);
					}
					
				//}
			}
		}
		return result;
	}

	public static Orders getOrderFromOrderDTO(OrdersDTO orderDTO){
		Orders order=null;
		if(orderDTO!=null){
			order=new Orders();
			order.setUserLogin(orderDTO.getUserLogin());
			order.setProductOrderDate(orderDTO.getProductOrderDate());
			order.setOrderFileInfo(orderDTO.getOrderFileInfo()); //for rideau
			order.setRequiredDate(orderDTO.getRequiredDate());
			order.setInvoicedDate(orderDTO.getInvoicedDate());
			order.setClientCity(orderDTO.getClientCity());
			order.setClientEmail(orderDTO.getClientEmail());
			order.setSpecialHandlingName(orderDTO.getSpecialHandlingName());
			order.setSpecialHandlingFee(orderDTO.getSpecialHandlingFee());
			order.setTotalPrice(orderDTO.getTotalPrice());
			order.setClientFirstName(orderDTO.getClientFirstName());
			order.setClientLastName(orderDTO.getClientLastName());
			order.setClientNumber(orderDTO.getClientNumber());
			order.setClientOtherId(orderDTO.getClientOtherId());
			order.setClientOrderNumber(orderDTO.getClientOrderNumber());
			order.setClientOtherNames(orderDTO.getClientOtherNames());
			order.setCompanyHeader(orderDTO.getCompanyHeader());
			order.setClientOtherStreet(orderDTO.getClientOtherStreet());
			order.setClientPhone(orderDTO.getClientPhone());
			order.setClientPostalCode(orderDTO.getClientPostalCode());
			order.setClientProvince(orderDTO.getClientProvince());
			order.setClientStreet(orderDTO.getClientStreet());
			order.setCreationDate(orderDTO.getCreationDate());
			order.setShippedDate(orderDTO.getShippedDate());
			order.setShippingPrice(orderDTO.getShippingPrice());
			order.setCompanyHeader(orderDTO.getCompanyHeader());
			order.setId(orderDTO.getId());
			order.setLsOrderId(orderDTO.getLsOrderId());
			order.setProductOrderNumber(orderDTO.getProductOrderNumber());
			order.setCstProductNumber(orderDTO.getCstProductNumber());
			order.setUnitPrice(orderDTO.getUnitPrice());
			order.setBilled(orderDTO.getBilled());
			order.setQuantity(orderDTO.getQuantity());
			order.setProductId(orderDTO.getProductId());
			order.setClientProductNumber(orderDTO.getClientProductNumber());
			order.setNotes(orderDTO.getNotes());
			order.setShippingCompany(orderDTO.getShippingCompany());
			order.setTrackingNumber(orderDTO.getTrackingNumber());
			if(orderDTO.getShippingInsuranceMultiplier()!=null) order.setShippingInsuranceMultiplier(orderDTO.getShippingInsuranceMultiplier());
			if(orderDTO.getCurrencyId()!=null)			order.setCurrencyId(orderDTO.getCurrencyId());
			if(orderDTO.getCurrencyRate()!=null)		order.setCurrencyRate(orderDTO.getCurrencyRate());
			if(orderDTO.getCurrencySymbol()!=null)		order.setCurrencySymbol(orderDTO.getCurrencySymbol());
			if(orderDTO.getCurrencyPrice()!=null)		order.setCurrencyPrice(orderDTO.getCurrencyPrice());
			if(orderDTO.getCurrencyUnitPrice()!=null)	order.setCurrencyUnitPrice(orderDTO.getCurrencyUnitPrice());
			if(orderDTO.getCurrencyShippingPrice()!=null)	order.setCurrencyShippingPrice(orderDTO.getCurrencyShippingPrice());
			
			order.setRowsList(orderDTO.getRowsList());
			order.setUserId(orderDTO.getUserId());	
		}
		return order;
	}

	
	public static OrdersRows getOrderRowClone(OrdersRows row){
		OrdersRows rowToClone=null;
		if(row!=null){
			rowToClone=new OrdersRows();
			rowToClone.setLsOrderId(row.getLsOrderId());
			rowToClone.setProductId(row.getProductId());
			rowToClone.setIndex(row.getIndex());
			rowToClone.setIcon(row.getIcon());
			rowToClone.setCss(row.getCss());
			rowToClone.setQuantity(row.getQuantity()); 
			rowToClone.setLsProductID(row.getLsProductID());
			rowToClone.setProvidedLsProductId(row.getProvidedLsProductId());
			rowToClone.setStock(row.getStock());
			rowToClone.setLsPrice(row.getLsPrice());
			rowToClone.setCss(row.getCss());
			rowToClone.setCssPrice(row.getCssPrice());
			rowToClone.setProductDescription(row.getProductDescription());
			rowToClone.setUnitPrice(row.getUnitPrice());
			rowToClone.setShippingFee(row.getShippingFee());
			rowToClone.setShippingCompany(row.getShippingCompany());
			rowToClone.setTrackingNumber(row.getTrackingNumber());
			rowToClone.setStatus("open");
		}
		return rowToClone;
	}

	/**
	 * 
	 * @param userP
	 * @return
	 */
	public static UsersPrivilegesDTO getUserPrivilegesDTO(UsersPrivileges userP){
		UsersPrivilegesDTO userPDTO=null;
		if(userP!=null){
			userPDTO=new UsersPrivilegesDTO();
			userPDTO.setActionCode(userP.getActionCode());
			userPDTO.setActionName(userP.getActionName());
			userPDTO.setActive(userP.getActive());
			userPDTO.setId(userP.getId());
			userPDTO.setUserId(userP.getUserId());	
		}

		return userPDTO;
	}
	
	/**
	 * 
	 * @param userPDTO
	 * @return
	 */
	public static UsersPrivileges BuildUserPrivileges(UsersPrivilegesDTO userPDTO){
		UsersPrivileges userP=null;
		if(userPDTO!=null){
			userP=new UsersPrivileges();
			userP.setActionCode(userPDTO.getActionCode());
			userP.setActionName(userPDTO.getActionName());
			userP.setActive(userPDTO.getActive());
			userP.setId(userPDTO.getId());
			userP.setUserId(userPDTO.getUserId());	
		}
		return userP;
	}
	
	
	
	/**
	 * 
	 * @param userPDTO
	 * @return
	 */
	public static OrdersDTO fillOrderDTOFromClientOrder(OrdersDTO clientOrderDTO,OrdersDTO orderDTO){
		if(clientOrderDTO!=null && orderDTO!=null){
			orderDTO.setClientProfileId(clientOrderDTO.getClientProfileId());
			orderDTO.setClientLastName(clientOrderDTO.getClientLastName());
			orderDTO.setClientFirstName(clientOrderDTO.getClientFirstName());
			orderDTO.setClientOtherNames(clientOrderDTO.getClientOtherNames());
			orderDTO.setClientStreet(clientOrderDTO.getClientStreet());
			orderDTO.setClientOtherStreet(clientOrderDTO.getClientOtherStreet());
			orderDTO.setClientProvince(clientOrderDTO.getClientProvince());
			orderDTO.setClientCity(clientOrderDTO.getClientCity());
			orderDTO.setClientPostalCode(clientOrderDTO.getClientPostalCode());
			orderDTO.setClientPhone(clientOrderDTO.getClientPhone());
			orderDTO.setClientEmail(clientOrderDTO.getClientEmail());
			orderDTO.setClientProfileId(clientOrderDTO.getClientProfileId());
			orderDTO.setCompanyHeader(clientOrderDTO.getCompanyHeader());
		}
		return orderDTO;
	}
	
	public static OrdersSpecialShipping getOrderSpecialFromOrderSpecialDTO(OrdersSpecialShippingDTO orderSpecialDTO){
		if(orderSpecialDTO==null)return null;
		OrdersSpecialShipping result=new OrdersSpecialShipping();
		result.setCreationDate(orderSpecialDTO.getCreationDate());
		result.setLsProductId(orderSpecialDTO.getLsProductId());
		result.setProductId(orderSpecialDTO.getProductId());
		result.setShippingPrice(orderSpecialDTO.getShippingPrice());
		result.setUserId(orderSpecialDTO.getUserId());
		return result;
	}

	public static OrdersSpecialShippingDTO getOrderSpecialDTOFromOrderSpecial(OrdersSpecialShipping orderSpecial){
		if(orderSpecial==null)return null;
		OrdersSpecialShippingDTO result=new OrdersSpecialShippingDTO();
		result.setCreationDate(orderSpecial.getCreationDate());
		result.setLsProductId(orderSpecial.getLsProductId());
		result.setProductId(orderSpecial.getProductId());
		result.setShippingPrice(orderSpecial.getShippingPrice());
		result.setUserId(orderSpecial.getUserId());
		return result;
	}

	// A new method to return the USerFileRecovery from USerFileRecoveryDTO
	public static UserFileRecovery BuildUserFileRecovery (UserFileRecoveryDTO ufrDTO ){
		UserFileRecovery ufr = new UserFileRecovery();
		if(ufr != null){
			ufr.setId(ufrDTO.getId()) ;
			ufr.setProductOrderNumber(ufrDTO.getProductOrderNumber());
			ufr.setFileTypeIdConfirm(ufrDTO.getFileTypeIdConfirm());
			
			ufr.setFileFormatIdComfirm(ufrDTO.getFileFormatIdComfirm());
			
			ufr.setProductOrderDate(ufrDTO.getProductOrderDate());
			ufr.setClientOrderNumber(ufrDTO.getClientOrderNumber());
			ufr.setClientNumber(ufrDTO.getClientNumber());
			ufr.setClientOtherId(ufrDTO.getClientOtherId());
			ufr.setCstProductNumber(ufrDTO.getCstProductNumber());
			ufr.setClientProductNumber(ufrDTO.getClientProductNumber());
			ufr.setNotes(ufrDTO.getNotes());
			ufr.setShippingCompany(ufrDTO.getShippingCompany());
			ufr.setClientFirstName(ufrDTO.getClientFirstName());
			ufr.setClientLastName(ufrDTO.getClientLastName());
			ufr.setClientStreet(ufrDTO.getClientStreet());
			ufr.setClientOtherStreet(ufrDTO.getClientOtherStreet());
			ufr.setClientCity(ufrDTO.getClientCity());
			ufr.setClientPostalCode(ufrDTO.getClientPostalCode());
			ufr.setClientProvince(ufrDTO.getClientProvince());
			ufr.setClientPhone(ufrDTO.getClientPhone());
			ufr.setClientEmail(ufrDTO.getClientEmail());
			ufr.setLsProductID(ufrDTO.getLsProductID());
			ufr.setProductDescription(ufrDTO.getProductDescription());
			ufr.setUnitPrice(ufrDTO.getUnitPrice());
			ufr.setCompanyHeader(ufrDTO.getCompanyHeader());
			ufr.setUserId(ufrDTO.getUserId());
			ufr.setFileTypeId(ufrDTO.getFileTypeId());
			ufr.setFileType(ufrDTO.getFileType());
			ufr.setQuantity(ufrDTO.getQuantity());
			ufr.setTagRoot(ufrDTO.getTagRoot());
			ufr.setProvidedLsProductId(ufrDTO.getProvidedLsProductId());
			ufr.setRequiredDate(ufrDTO.getRequiredDate());
			ufr.setClientOtherNames(ufrDTO.getClientOtherNames());
			ufr.setClientPhoneZone(ufrDTO.getClientPhoneZone());
			ufr.setFormatDate(ufrDTO.getFormatDate());
			/* Added the below properties for Rideau.
			 */
			ufr.setFileSeqShipping(ufrDTO.getFileSeqShipping());
			ufr.setFileSeqInvoice(ufrDTO.getFileSeqInvoice());
			
			//ETA
			//ufr.setEtaFileTypeId(ufrDTO.getEtaFileTypeId());
			ufr.setEtaFieldName(ufrDTO.getEtaFieldName());
			ufr.setSecondEtaFieldName(ufrDTO.getSecondEtaFieldName());
		}
		
		return ufr;
	}
	
	
	//Method to return the UserConnection from UserConnectionDTO
	public static UserConnection getUserConnectionFromUserConnectionDTO(UserConnectionDTO userConnectionDTO) {
		if(userConnectionDTO==null) return null;
		UserConnection userConnection = new UserConnection(); 
		userConnection.setUserLogin(userConnectionDTO.getUserLogin());
		userConnection.setHost(userConnectionDTO.getHost()) ;
		userConnection.setPort(userConnectionDTO.getPort());
		userConnection.setUserName(userConnectionDTO.getUserName());
		userConnection.setPassword(userConnectionDTO.getPassword());
		userConnection.setUserId(userConnectionDTO.getUserId());
		userConnection.setProtocol(userConnectionDTO.getProtocol());
		userConnection.setRemoteFolder(userConnectionDTO.getRemoteFolder());
		userConnection.setOrdersFolder(userConnectionDTO.getOrdersFolder());
		userConnection.setOrdersConfirmFolder(userConnectionDTO.getOrdersConfirmFolder());
		userConnection.setUserSendingId(userConnectionDTO.getUserSendingId());
		userConnection.setEmail1(userConnectionDTO.getEmail1());
		userConnection.setEmail2(userConnectionDTO.getEmail2());
		userConnection.setClientShipmentsFolder(userConnectionDTO.getClientShipmentsFolder());
		/* Added the below properties for Rideau Invoice.
		 */
		userConnection.setRemoteClientInvoiceFolder(userConnectionDTO.getRemoteClientInvoiceFolder());
		userConnection.setInvoiceConfirmFolder(userConnectionDTO.getInvoiceConfirmFolder());
		userConnection.setClientOrdersFileMovedFolder(userConnectionDTO.getClientOrdersFileMovedFolder());
		
		return userConnection;
	}

	// Method to return UserConnectionDTO from userConnection
	public static UserConnectionDTO getUserConnectionDTOFromUserConnection(	UserConnection userConnection) {
		if(userConnection== null) return null;
		UserConnectionDTO userConnectionDTO = new UserConnectionDTO();
		userConnectionDTO.setUserLogin(userConnection.getUserLogin());
		userConnectionDTO.setHost(userConnection.getHost());
		userConnectionDTO.setPort(userConnection.getPort());
		userConnectionDTO.setUserName(userConnection.getUserName());
		userConnectionDTO.setPassword(userConnection.getPassword());
		userConnectionDTO.setRemoteFolder(userConnection.getRemoteFolder());
		userConnectionDTO.setUserId(userConnection.getUserId());
		userConnectionDTO.setProtocol(userConnection.getProtocol());
		userConnectionDTO.setOrdersFolder(userConnection.getOrdersFolder());
		userConnectionDTO.setOrdersConfirmFolder(userConnection.getOrdersConfirmFolder());
		userConnectionDTO.setUserSendingId(userConnection.getUserSendingId());
		userConnectionDTO.setEmail1(userConnection.getEmail1());
		userConnectionDTO.setEmail2(userConnection.getEmail2());
		userConnectionDTO.setClientShipmentsFolder(userConnection.getClientShipmentsFolder());
		/* Added the below properties for Rideau Invoice.
		 */
		userConnectionDTO.setRemoteClientInvoiceFolder(userConnection.getRemoteClientInvoiceFolder());
		userConnectionDTO.setInvoiceConfirmFolder(userConnection.getInvoiceConfirmFolder());
		userConnectionDTO.setClientOrdersFileMovedFolder(userConnection.getClientOrdersFileMovedFolder());
		
		return userConnectionDTO;
	}
	/**
	 * 
	 * @param userConnection
	 * @return
	 */
	public static List<UserConnectionDTO> getUserConnListDTOFromUserConnList( List<UserConnection> usrConnList) {
		 List<UserConnectionDTO>result=new ArrayList<UserConnectionDTO>();
		for(UserConnection usrConn:usrConnList){
			UserConnectionDTO userConnectionDTO = new UserConnectionDTO();
			userConnectionDTO.setUserLogin(usrConn.getUserLogin());
			userConnectionDTO.setHost(usrConn.getHost());
			userConnectionDTO.setPort(usrConn.getPort());
			userConnectionDTO.setUserName(usrConn.getUserName());
			userConnectionDTO.setPassword(usrConn.getPassword());
			userConnectionDTO.setRemoteFolder(usrConn.getRemoteFolder());
			userConnectionDTO.setUserId(usrConn.getUserId());
			userConnectionDTO.setProtocol(usrConn.getProtocol());
			userConnectionDTO.setOrdersFolder(usrConn.getOrdersFolder());
			userConnectionDTO.setOrdersConfirmFolder(usrConn.getOrdersConfirmFolder());
			userConnectionDTO.setUserSendingId(usrConn.getUserSendingId());
			userConnectionDTO.setEmail1(usrConn.getEmail1());
			userConnectionDTO.setEmail2(usrConn.getEmail2());
			userConnectionDTO.setClientShipmentsFolder(usrConn.getClientShipmentsFolder());
			/* Added the below properties for Rideau Invoice.
			 */
			userConnectionDTO.setRemoteClientInvoiceFolder(usrConn.getRemoteClientInvoiceFolder());
			userConnectionDTO.setInvoiceConfirmFolder(usrConn.getInvoiceConfirmFolder());
			userConnectionDTO.setClientOrdersFileMovedFolder(usrConn.getClientOrdersFileMovedFolder());
			
			result.add(userConnectionDTO);
		}
		return result;
	}
	
	public static UserFilesDownloaded BuildUserFilesDownloaded (UserFilesDownloadedDTO ufdDTO ){
		UserFilesDownloaded udf = new UserFilesDownloaded();
		if(ufdDTO != null){
			udf.setId(ufdDTO.getId());
			udf.setUserId(ufdDTO.getUserId());
			udf.setFileName(ufdDTO.getFileName());
			udf.setCreationDate(ufdDTO.getCreationDate());
			udf.setTreated(ufdDTO.getTreated());
		}
		return udf;
	}

	public static UserFilesDownloadedDTO getUserFilesDownloadedDTOFromUserFilesDownloaded(UserFilesDownloaded ufd ){
		UserFilesDownloadedDTO udfDTO = new UserFilesDownloadedDTO();
		if(ufd != null){
			udfDTO.setId(ufd.getId());
			udfDTO.setUserId(ufd.getUserId());
			udfDTO.setFileName(ufd.getFileName());
			udfDTO.setCreationDate(ufd.getCreationDate());
			udfDTO.setTreated(ufd.getTreated());
		}
		return udfDTO;
	}
	
	public static List<UserFilesDownloadedDTO> getListFileDownloadedDTOFromModel(List<UserFilesDownloaded>list){
		List<UserFilesDownloadedDTO>result=new ArrayList<UserFilesDownloadedDTO>();
		if(list!=null){
			for(UserFilesDownloaded ufd:list){
				UserFilesDownloadedDTO udfDTO = new UserFilesDownloadedDTO();
				udfDTO.setId(ufd.getId());
				udfDTO.setUserId(ufd.getUserId());
				udfDTO.setFileName(ufd.getFileName());
				udfDTO.setCreationDate(ufd.getCreationDate());
				udfDTO.setTreated(ufd.getTreated());
				udfDTO.setFileDeleted(ufd.getFileDeleted());
				result.add(udfDTO);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param productListDTO
	 * @return
	 */
	public static List<Product>getProductListFromProductListDTO(List<ProductDTO>productListDTO){
		List<Product>result=new ArrayList<Product>();
		if(productListDTO==null)return result;
		for(ProductDTO productDTO:productListDTO){
			Product product=new Product();
			product.setId(productDTO.getId());
			product.setLoyaltySourceProductId(productDTO.getLoyaltyProductId());
			product.setStock(productDTO.getStock());
			result.add(product);
		}//end for
		return result;
	}
	
	

	public static List<ProductDTO>getProductListDTOFromProductList(List<Product>productList){
		List<ProductDTO>result=new ArrayList<ProductDTO>();
		if(productList==null)return result;
		for(Product product:productList){
			ProductDTO productDTO=new ProductDTO();
			if(product.getId()!=null)productDTO.setId(product.getId());
			productDTO.setLoyaltyProductId(product.getLoyaltySourceProductId());
			productDTO.setStock(product.getStock());
			result.add(productDTO);
		}//end for
		return result;
	}
	
	
		
	public static BoxDTO getBoxDTO(Box box) {
		BoxDTO boxDTO = null;
		if(box!=null) {
			boxDTO = new BoxDTO();
			if(box.getId()!=null) boxDTO.setId(box.getId());
			if(box.getLength()!=null) boxDTO.setLength(box.getLength());
			if(box.getWidth()!=null) boxDTO.setWidth(box.getWidth());
			if(box.getHeight()!=null) boxDTO.setHeight(box.getHeight());
			if(box.getWeight()!=null) boxDTO.setWeight(box.getWeight());
			if(box.getTotalWeight()!=null) boxDTO.setTotalWeight(box.getTotalWeight());
			if(box.getProductId()!=null) boxDTO.setProductId(box.getProductId());
			if(box.getCreationDate()!=null) boxDTO.setCreationDate(box.getCreationDate());
			if(box.getUpdateDate()!=null) boxDTO.setUpdateDate(box.getUpdateDate());
			if(box.getStatusId()!=null) boxDTO.setStatusId(box.getStatusId());
		}
		return boxDTO;
	}
	
	public static List<BoxDTO> getBoxDTOList(List<Box> list) {
		 List<BoxDTO> boxDTOList = new ArrayList<BoxDTO>();
		 for(Box box : list) {
			 boxDTOList.add(getBoxDTO(box));
		 }	
		return boxDTOList;
	}
	
	
	public static List<CurrencyDTO>getCurrencySymbolsDTO(List<Currency> currencyList){
		List<CurrencyDTO> result = new ArrayList<CurrencyDTO>();
		if(currencyList == null) return result;
		for(Currency currency : currencyList){
			CurrencyDTO currencyDTO = new CurrencyDTO();
			if(currency!=null && currency.getId()!=null) currencyDTO.setId(currency.getId());
			if(currency!=null && currency.getSymbol()!=null) currencyDTO.setSymbol(currency.getSymbol());
			if(currency!=null && currency.getRate()!=null) currencyDTO.setRate(currency.getRate());
			if(currency!=null && currency.getCreationDate()!=null) currencyDTO.setCreationDate(currency.getCreationDate());
			
			result.add(currencyDTO);
		}//end for
		return result;
	}
	
	public static CurrencyDTO getCurrencyDTOBySymbol(Currency currency) {
		CurrencyDTO currencyDTO = null;
		if(currency!=null) {
			currencyDTO = new CurrencyDTO();
			if(currency!=null && currency.getId()!=null) currencyDTO.setId(currency.getId());
			if(currency!=null && currency.getSymbol()!=null) currencyDTO.setSymbol(currency.getSymbol());
			if(currency!=null && currency.getRate()!=null) currencyDTO.setRate(currency.getRate());
			if(currency!=null && currency.getCreationDate()!=null) currencyDTO.setCreationDate(currency.getCreationDate());
		}
		return currencyDTO;
	}
	
	/**--------------------------------------------------------------
	 						GET PRODUCT FROM PRODUCTDTO
	   --------------------------------------------------------------*/
	public static Product getProduct(ProductDTO productDTO) {		
		if(productDTO==null)return null;
		Product product = new Product();
	
		//Name
		/*Translation translationName = new Translation();
			
		//Eng Name
		TranslationEntry entryNameEng = new TranslationEntry(translationName.getId(), productDTO.getNameEng().getName() );
		entryNameEng.setLanguage(Language.ENGLISH);
		
		//Fr Name
		TranslationEntry entryNameFr = new TranslationEntry(translationName.getId(), productDTO.getNameFr().getName());
		entryNameFr.setLanguage(Language.FRENCH);
		
		
		//Description
		Translation translationDescription = new Translation();
		
		//Eng Description
		TranslationEntry entryDescriptionEng = new TranslationEntry(translationDescription.getId(), productDTO.getDescriptionEng().getName());
		entryDescriptionEng.setLanguage(Language.ENGLISH);
		
		//Fr Description
		TranslationEntry entryDescriptionFr = new TranslationEntry(translationDescription.getId(), productDTO.getDescriptionFr().getName());
		entryDescriptionFr.setLanguage(Language.FRENCH);

		//Specification
		Translation translationSpecification = new Translation();			
			
		//Eng Name
		TranslationEntry entrySpecificationEng = new TranslationEntry(translationSpecification.getId(), productDTO.getSpecificationEng().getName() );
		entrySpecificationEng.setLanguage(Language.ENGLISH);
		
		//Fr Name
		TranslationEntry entrySpecificationFr = new TranslationEntry(translationSpecification.getId(), productDTO.getSpecificationFr().getName());
		entrySpecificationFr.setLanguage(Language.FRENCH);

		// Others
		Translation translationOther = new Translation();					
		
		// Eng Others
		TranslationEntry entryOtherEng = new TranslationEntry(translationOther.getId(), productDTO.getOtherEng().getName());
		entryOtherEng.setLanguage(Language.ENGLISH);
		
		// Fr Name
		TranslationEntry entryOtherFr = new TranslationEntry(translationOther.getId(), productDTO.getOtherFr().getName());
		entryOtherFr.setLanguage(Language.FRENCH);

		// Warranty
		Translation translationWarranty = new Translation();
		
		// Eng Others
		TranslationEntry entryWarrantyEng = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyEng().getName());
		entryWarrantyEng.setLanguage(Language.ENGLISH);
		
		// Fr Name
		TranslationEntry entryWarrantyFr = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyFr().getName());
		entryWarrantyFr.setLanguage(Language.FRENCH);
		
		//Insert Image product
		Image imageProduct = new Image();
		if(productDTO.getImage() != null) {
			imageProduct.setName(productDTO.getImage().getName());
			imageProduct.setRealNameImg(productDTO.getImage().getRealName());
			imageProduct.setType(Type.PRODUCT);
			imageProduct.setSize(productDTO.getImage().getSize());
			imageProduct.setHeight(productDTO.getImage().getHeight());
			imageProduct.setWidth(productDTO.getImage().getWidth());
			imageProduct.setLarge(productDTO.getImage().isLarge());
			imageProduct.setResolution(productDTO.getImage().getResolution());
			imageProduct.setScore(productDTO.getImage().getScore());
			
		}
		
		//Brand 
		Brand brand = new Brand();
		brand.setId(productDTO.getBrand().getId());
		//Category
		Category category = new Category();
		category.setId(productDTO.getCategory().getId());
		
		product.setName(translationName);
		product.setDescription(translationDescription);
		product.setImage(imageProduct);
		product.setStatus(ProductStatus.AVAILABLE);
		product.setMsrp(productDTO.getMsrp());
		product.setCost(productDTO.getCost());
		product.setBrand(brand);
		product.setLoyaltySourceProductId(productDTO.getLoyaltyProductId());
		product.setProductHigh(productDTO.getHigh());
		product.setProductLong(productDTO.getLarge());
		product.setProductWidth(productDTO.getWidth());
		product.setWeight(productDTO.getWeight());
		product.setActualHeight(productDTO.getActualHeight());
		product.setActualLength(productDTO.getActualLength());
		product.setActualWidth(productDTO.getActualWidth());
		product.setActualWeight(productDTO.getActualWeight());
		product.setCategory(category);
		product.setSpecification(translationSpecification);
		product.setOther(translationOther);
		product.setNote(productDTO.getNote());
		product.setWereWgtDimChanged(productDTO.getWereWgtDimChanged());
		product.setConsideredForXML(productDTO.getConsideredForXML());
		product.setWarranty(translationWarranty);
		product.setUpc(productDTO.getUpc());
		//51 is N/A. To allow don't pick any option in edit product page in Admin
		//I do this trick
		if(productDTO.getMainFilterTypeId() != -1) {
			product.setTypeId(productDTO.getMainFilterTypeId());
		} else {
			product.setTypeId(new Long(51));
		}

		//Manufacture Product Id
		Iterator<ProductModelDTO> stringIterator = productDTO.getManufactureProductList().iterator();
		ProductModelNumber productModelNumber;
		ProductModelDTO productModelDTO;
		while(stringIterator.hasNext()) {
			productModelNumber = new ProductModelNumber();
			productModelDTO = (ProductModelDTO)stringIterator.next();
			productModelNumber.setModelNumber(productModelDTO.getName());
			productModelNumber.setQuantity(productModelDTO.getQuantity());
			productModelNumber.setProductId(product.getId());
			productModelNumber.setSupplier(productModelDTO.getSupplier());
			productModelNumber.setPrice(productModelDTO.getPrice());
			productModelNumber.setMsrp(productModelDTO.getMsrp());
			
		}*/
		
		//sale attributes
		product.setUserId(productDTO.getUserId());
		product.setId(productDTO.getId());
		product.setProductSaleId(productDTO.getProductSaleId());
		product.setUserId(productDTO.getUserId());
		product.setQtMax(productDTO.getQtMax());
		product.setSaleQt(productDTO.getSaleQt());
		product.setStartDate(productDTO.getStartDate());
		product.setEndDate(productDTO.getEndDate());
		product.setRegularPrice(productDTO.getRegularPrice());
		product.setRegularPercentProfit(productDTO.getRegularPercentProfit());
		product.setRegularPercentDiscount(productDTO.getRegularPercentDiscount());
		product.setActive(productDTO.getActive());
		product.setMessageForClient(productDTO.getMessageForClient());
		product.setSaleNote(productDTO.getSaleNote());
		product.setProductSaleId(productDTO.getProductSaleId());
		
		product.setSalePrice(productDTO.getSalePrice());
		product.setSalePercentProfit(productDTO.getSalePercentProfit());
		product.setSalePercentDiscount(productDTO.getSalePercentDiscount());
		product.setLoyaltyProductIdSub(productDTO.getLoyaltyProductIdSub());
		
		
		return (product);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
