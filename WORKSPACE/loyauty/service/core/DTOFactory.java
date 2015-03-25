package com.loyauty.service.core;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.Image;
import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.Product;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Specification;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
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
	
	
	/**
	 * get all user accounts 
	 * @param userList
	 * @return
	 */
	public static List<UserSessionDTO> getAllUsersAccountsDTO(List<User> userList) {
				
		List<UserSessionDTO> userListDTO = new ArrayList<UserSessionDTO>();
		UserSessionDTO userSessionDTO;
		for(User user : userList){
			userSessionDTO = UserSessionDTO.valueOf(user.getId(), user.getLogin(), user.getTypeId(), 
							 user.getPrimaryLanguage().getValue(), Language.ENGLISH.getValue(), RESULTS_PER_PAGE, 
							 user.getEmail(), user.getCode(), user.isActive());
			userListDTO.add(userSessionDTO);
		}		
		return userListDTO;
	}
	
	
	public static List<CommonDTO> getAllCommonDTOFromBrand(List<Brand> list) {
		
		List<CommonDTO> brandListDTO = new ArrayList<CommonDTO>();
		CommonDTO brandDTO;
		for(Brand brand : list){
			brandDTO = CommonDTO.valueOf(brand.getId(), brand.getName());			
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
			    
	 	
		 		imageDTO = ImageDTO.valueOf(brand.getImage().getId(), brand.getImage().getName(), 
			    									brand.getImage().getSize(), brand.getImage().getHeight(), 
			    									brand.getImage().getWidth(), brand.getImage().getResolution(), 
			    									false, brand.getImage().getRealNameImg(), brand.getImage().getScore());
			    dto = BrandDTO.valueOf(brand.getId(), brand.getName(), imageDTO, 
			    				brand.getDescription(), brand.getCreationDate());			
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
	
	public static ProductDTO getProductDTO(Product product) {
		
		
		Image image = product.getImage();
		ImageDTO imageDTOProduct = null;
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
		
		BrandDTO brandDTO = BrandDTO.valueOf(product.getBrand().getId(), product.getBrand().getName(), 
											imageDTOBrand, product.getBrand().getDescription(), product.getBrand().getCreationDate());
		
		
		CommonDTO commonDTONameEng = product.getName().getLocalizedCommonDTO(Language.ENGLISH);
		
		CommonDTO commonDTONameFr = product.getName().getLocalizedCommonDTO(Language.FRENCH);
		
		CommonDTO commonDTODescriptionEng = CommonDTO.valueOf(((TranslationEntry) product.getDescription().getEntries().get(0)).getId(), 
															  ((TranslationEntry) product.getDescription().getEntries().get(0)).getText());
		CommonDTO commonDTODescriptionFr = CommonDTO.valueOf(((TranslationEntry) product.getDescription().getEntries().get(1)).getId(), 
				  											 ((TranslationEntry) product.getDescription().getEntries().get(1)).getText());
		CommonDTO commonDTOSpecificationEng = CommonDTO.valueOf(((TranslationEntry) product.getSpecification().getEntries().get(0)).getId(), 
				  												((TranslationEntry) product.getSpecification().getEntries().get(0)).getText());
		CommonDTO commonDTOSpecificationFr = CommonDTO.valueOf(((TranslationEntry) product.getSpecification().getEntries().get(1)).getId(), 
				 											   ((TranslationEntry) product.getSpecification().getEntries().get(1)).getText());

		//Manufacture Product Id
		List<CommonDTO> commonDTOList = new ArrayList<CommonDTO>();
		Iterator<ProductModelNumber> modelNumberIterator = product.getModelNumberList().iterator();
		ProductModelNumber productModelNumber;
		while(modelNumberIterator.hasNext())
		{
			productModelNumber = (ProductModelNumber)modelNumberIterator.next();
			CommonDTO commonDTO = CommonDTO.valueOf(productModelNumber.getId(), productModelNumber.getModelNumber());
			commonDTOList.add(commonDTO);
		}
		ProductDTO productDTO =  new ProductDTO.Builder(product.getId(), brandDTO, product.getCategoryId())
					 .nameEng(commonDTONameEng).nameFr(commonDTONameFr).image(imageDTOProduct)
					 .descriptionEng(commonDTODescriptionEng).descriptionFr(commonDTODescriptionFr)
					 .specificationEng(commonDTOSpecificationEng).specificationFr(commonDTOSpecificationFr)
					 .msrp(product.getMsrp()).cost(product.getCost()).width(product.getProductWidth())
					 .high(product.getProductHigh()).large(product.getProductLong()).weight(product.getWeight())
					 .manufactureProductList(commonDTOList).mainFilterTypeId(product.getTypeId())
					 .loyaltyProductId(product.getLoyaltySourceProductId()).build();
		
		return (productDTO);
		
	}


	
	public static List<ProductDTO> getProductDTOList(List<Product> list) {
		
		 List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		 for(Product prod: list){			
			    productDTOList.add(getProductDTO(prod));
		 }	
		return productDTOList;
	}
	
	/**
	 * creates {@link ImageDTO} from {@link Image}. 
	 * @param image
	 * @return
	 */
	public static ImageDTO getImageDTO(Image image){
		return ImageDTO.valueOf(image.getId(), image.getName(),	image.getSize(), 
				image.getHeight(), image.getWidth(),image.getResolution(), image.isLarge(),image.getRealNameImg(), image.getScore());
	} 
	
	public static List<UserProductDTO> getUserProductDTOList(List<Product> list) {
		 List<UserProductDTO> userProductDTOList = new ArrayList<UserProductDTO>();
		 for(Product prod: list){			
			 userProductDTOList.add(getUserProductDTO(prod));
		 }	
		return userProductDTOList;		
	}
	
	static UserProductDTO getUserProductDTO(Product product){
		
		UserProductDTO userProductDTO = new UserProductDTO();
		
		userProductDTO.setId(product.getId());	
		
		userProductDTO.setCategoryId(product.getCategoryId());
		
		userProductDTO.setSpecificationEn(product.getSpecification().getLocalizedText(Language.ENGLISH));
		userProductDTO.setSpecificationFr(product.getSpecification().getLocalizedText(Language.FRENCH));
		
		userProductDTO.setLsProductId(product.getLoyaltySourceProductId());

		userProductDTO.setManufacturerProductId(product.getModelNumberList().get(0).getModelNumber());
		
		userProductDTO.setNameEng(product.getName().getLocalizedText(Language.ENGLISH));		
		userProductDTO.setNameEng(product.getName().getLocalizedText(Language.FRENCH));
		
		userProductDTO.setCost( StringUtils.
				 	convertDoubleTOStringFormat(product.getCost()));
		
		userProductDTO.setUserPrice(StringUtils.
			 	convertDoubleTOStringFormat(product.getUserPrice()));
		
		userProductDTO.setMsrp(StringUtils.
			 	convertDoubleTOStringFormat(product.getMsrp()));
		
		double profit = 0;
		double percProfit = 0;
		if(product.getUserPrice() != null){
			profit =  Double.parseDouble(product.getUserPrice()) -  Double.parseDouble(product.getCost()); 			
			percProfit = profit / Double.parseDouble(product.getCost())*100;
		}		
		userProductDTO.setDollarProfit(StringUtils.convertDoubleTOStringFormat(profit));
		userProductDTO.setPercProfit(StringUtils.convertDoubleTOStringFormat(percProfit));
		
		userProductDTO.setBrandId(product.getBrand().getId());
		userProductDTO.setBrandName(product.getBrand().getName());
		
		userProductDTO.setUserId(product.getUserId());
		userProductDTO.setUserPrice(product.getUserPrice());
			
		userProductDTO.setPriceType((PriceType)CommonUtils.enumFromValue(PriceType.values(), product.getPriceType()));
		
				
		return userProductDTO;
		
		
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
	    if(brand.getImage() != null)
	    	brandDTO.setImage(getImageDTO(brand.getImage()));
	    return(brandDTO);
	}
}
