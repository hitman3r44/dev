package com.loyauty.service.product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.Status;
import com.loyauty.enums.Type;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Brand;

import com.loyauty.model.Image;
import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.Product;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Specification;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicDTO;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CommonUserDiscountDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.image.ImageServiceImpl;
import com.loyauty.util.CommonUtils;


public class ProductServiceImpl extends ServiceImpl implements ProductService {
	
	private static final Logger log = Logger.getLogger(ProductServiceImpl.class);
	
	@Setter 
	@Getter



	protected DaoManager daoManager;
	
	public ProductServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SpecificationDTO> getMainSpecificationByCategory(final long categoryId)
			throws ServiceException {
		List<Specification> list = null;
		try {
			list = (List<Specification>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getSpecificationDao().getMainSpecificationByCategory(categoryId);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		
		return DTOFactory.getSpecificationListDTO(list);
	}
 
 	@Override
	public Long createProduct(final ProductDTO productDTO) throws ServiceException
	{
		Product productResult = new Product();
		
		try 
		{
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					
					Product product = new Product();
					
					//Name
					Translation translationName = new Translation();
					daoManager.getTranslationDao().insertTranslation(translationName);	
					//Eng Name
					TranslationEntry entryNameEng = new TranslationEntry(translationName.getId(), productDTO.getNameEng().getName() );
					entryNameEng.setLanguage(Language.ENGLISH);
					daoManager.getTranslationDao().insertEntry(entryNameEng);
					//Fr Name
					TranslationEntry entryNameFr = new TranslationEntry(translationName.getId(), productDTO.getNameFr().getName());
					entryNameFr.setLanguage(Language.FRENCH);
					daoManager.getTranslationDao().insertEntry(entryNameFr);
					
					//Description
					Translation translationDescription = new Translation();
					daoManager.getTranslationDao().insertTranslation(translationDescription);
					//Eng Description
					TranslationEntry entryDescriptionEng = new TranslationEntry(translationDescription.getId(), productDTO.getDescriptionEng().getName());
					entryDescriptionEng.setLanguage(Language.ENGLISH);
					daoManager.getTranslationDao().insertEntry(entryDescriptionEng);
					//Fr Description
					TranslationEntry entryDescriptionFr = new TranslationEntry(translationDescription.getId(), productDTO.getDescriptionFr().getName());
					entryDescriptionFr.setLanguage(Language.FRENCH);
					daoManager.getTranslationDao().insertEntry(entryDescriptionFr);
					
					//Specification
					Translation translationSpecification = new Translation();
					daoManager.getTranslationDao().insertTranslation(translationSpecification);	
					//Eng Name
					TranslationEntry entrySpecificationEng = new TranslationEntry(translationSpecification.getId(), productDTO.getSpecificationEng().getName() );
					entrySpecificationEng.setLanguage(Language.ENGLISH);
					daoManager.getTranslationDao().insertEntry(entrySpecificationEng);
					//Fr Name
					TranslationEntry entrySpecificationFr = new TranslationEntry(translationSpecification.getId(), productDTO.getSpecificationFr().getName());
					entrySpecificationFr.setLanguage(Language.FRENCH);
					daoManager.getTranslationDao().insertEntry(entrySpecificationFr);
					
					//Insert Image product
					Image imageProduct = new Image();
					imageProduct.setName(productDTO.getImage().getName());
					imageProduct.setRealNameImg(productDTO.getImage().getRealName());
					imageProduct.setType(Type.PRODUCT);
					imageProduct.setSize(productDTO.getImage().getSize());
					imageProduct.setHeight(productDTO.getImage().getHeight());
					imageProduct.setWidth(productDTO.getImage().getWidth());
					imageProduct.setLarge(productDTO.getImage().isLarge());
					imageProduct.setResolution(productDTO.getImage().getResolution());
					imageProduct.setScore(productDTO.getImage().getScore());
					daoManager.getImageDao().insertEntity(imageProduct);
					
					//Brand 
					Brand brand = new Brand();
					brand.setId(productDTO.getBrand().getId());
					
					product.setName(translationName);
					product.setDescription(translationDescription);
					product.setImage(imageProduct);
					product.setStatus(Status.ENABLED);
					product.setMsrp(productDTO.getMsrp());
					product.setCost(productDTO.getCost());
					product.setBrand(brand);
					product.setLoyaltySourceProductId(productDTO.getLoyaltyProductId());
					product.setProductHigh(productDTO.getHigh());
					product.setProductLong(productDTO.getLarge());
					product.setProductWidth(productDTO.getWidth());
					product.setWeight(productDTO.getWeight());
					product.setCategoryId(productDTO.getCategoryId());
					product.setSpecification(translationSpecification);
					product.setTypeId(productDTO.getMainFilterTypeId());
					
					daoManager.getProductDao().insertProduct(product);
					
					//Manufacture Product Id
					Iterator<CommonDTO> stringIterator = productDTO.getManufactureProductList().iterator();
					ProductModelNumber productModelNumber;
					while(stringIterator.hasNext())
					{
						productModelNumber = new ProductModelNumber();
						productModelNumber.setModelNumber(((CommonDTO)stringIterator.next()).getName());
						productModelNumber.setProductId(product.getId());
						daoManager.getProductDao().insertProductModelNumber(productModelNumber);
					}
					
					daoManager.getProductDao().insertProductToUsers(product);
					
					return product;
				}
			});
			return(productResult.getId());
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}

	}
	
	@Override
	public ProductDTO getProductInformation(final Long productId) throws ServiceException{
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return daoManager.getProductDao().getProduct(productId);
				}
			});
			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTO(productResult));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductDTO> getAllProdcutForProfit(final UserProductDTO userProducDTO) throws ServiceException{

		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							Brand brand = new Brand();
							brand.setId(userProducDTO.getBrandId());							
							Product product = new Product();
							product.setBrand(brand);
							product.setCategoryId(userProducDTO.getCategoryId());							
							product.setUserId(userProducDTO.getUserId());
							
							return daoManager.getProductDao().getAllProdcutForProfit(product);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
		return(DTOFactory.getUserProductDTOList(productList));
	}	
	
	@Override
	public ImageDTO addProductImage(File file, String fileName, String applicationPath, long uploaderId,
			 int width, int height, int miniCoverWidth, boolean large) throws ServiceException, IOException {
		ImageService ish = new ImageServiceImpl();
		Long tempId = new Long(0);
		Image image = new Image();
		image.setId(tempId);
		image.setUploaderId(uploaderId);
		
		// Validate if the name is already present in the DB
		String normalizedName= CommonUtils.getNormalizedProductImage(fileName);
		//TODO: we must create a validation in action //Validate if the image extension is JPEG or PNG
		int i = ish.isJPEGPNGImage(file);
		if (i==1) {
			image.addImageJps(file,normalizedName,fileName);
		}else if (i==2) {
			image.addImagePNG(file,normalizedName,fileName);
		}else{
			throw new ServiceException("Game Logo Image Format not supported " + file.getName() );
		}
		image.setName(normalizedName);
		image.setRealNameImg(fileName);
		//Variables Initialization 
		image.setType(Type.PRODUCT);
		image.setLarge(large);
		
		// Transfer the cover to the server cover/large/ directory			
		if (!ish.transferProductImage(file, normalizedName, applicationPath, width, height, miniCoverWidth, large)){
			throw new ServiceException("Could not transfer the image" + 
					"\nimageName:" + file.getName() 
					+ "\nNormalized image:" + normalizedName);
		}
				
		return DTOFactory.getImageDTO(image); 
	}
	
		
	@Override
	public void updateProduct(final ProductDTO productDTO) throws ServiceException
	{
		try 
		{
			daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					
					Product product = new Product();
						
					//Eng Name
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getNameEng()));
					//Fr Name
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getNameFr()));
					
					//Eng Description
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getDescriptionEng()));
					//Fr Description
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getDescriptionFr()));
					
					//Eng Specification
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getSpecificationEng()));
					//Fr Specification
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getSpecificationFr()));
					
					//Insert Image product
					Image imageProduct = new Image();
					imageProduct.setId(productDTO.getImage().getId());
					imageProduct.setName(productDTO.getImage().getName());
					imageProduct.setRealNameImg(productDTO.getImage().getRealName());
					imageProduct.setType(Type.PRODUCT);
					imageProduct.setSize(productDTO.getImage().getSize());
					imageProduct.setHeight(productDTO.getImage().getHeight());
					imageProduct.setWidth(productDTO.getImage().getWidth());
					imageProduct.setLarge(productDTO.getImage().isLarge());
					imageProduct.setResolution(productDTO.getImage().getResolution());
					imageProduct.setScore(productDTO.getImage().getScore());
					//If the id image is null that means that the image is new.
					//So, Insert the image and update the product.
					if(productDTO.getImage()== null)
					{
						daoManager.getImageDao().insertEntity(imageProduct);
					}
					
					//Brand 
					Brand brand = new Brand();
					brand.setId(productDTO.getBrand().getId());
					
					product.setId(productDTO.getId());
					product.setImage(imageProduct);
					product.setStatus(Status.ENABLED);
					product.setMsrp(productDTO.getMsrp());
					product.setCost(productDTO.getCost());
					product.setBrand(brand);
					product.setLoyaltySourceProductId(productDTO.getLoyaltyProductId());
					product.setProductHigh(productDTO.getHigh());
					product.setProductLong(productDTO.getLarge());
					product.setProductWidth(productDTO.getWidth());
					product.setWeight(productDTO.getWeight());
					product.setCategoryId(productDTO.getCategoryId());
					product.setTypeId(productDTO.getMainFilterTypeId());
					
					daoManager.getProductDao().updateProduct(product);
					
					//Manufacture Product Id
					Iterator<CommonDTO> stringIterator = productDTO.getManufactureProductList().iterator();
					ProductModelNumber productModelNumber;
					CommonDTO commonDTO;
					while(stringIterator.hasNext())
					{
						productModelNumber = new ProductModelNumber();
						commonDTO = (CommonDTO)stringIterator.next();
						productModelNumber.setModelNumber(commonDTO.getName());
						productModelNumber.setId(commonDTO.getId());
						productModelNumber.setProductId(product.getId());
						if(productModelNumber.getId() != 0)
						{
						    if(!commonDTO.getName().trim().equals("") )
							daoManager.getProductDao().updateProductModelNumber(productModelNumber);
						    else
							daoManager.getProductDao().deleteProductModelNumber(productModelNumber);
						}
						else
						{
						    if(!commonDTO.getName().trim().equals("") )
							 daoManager.getProductDao().insertProductModelNumber(productModelNumber);
						} 
					}
					
					return product;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}

	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllProdcut() throws ServiceException{

		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getAllProdcut();
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}	
	
	



	@Override
	public void updateSellingPriceBrand(final UserProductDTO userProductDTO)
			throws ServiceException {

		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
													
						UserBrandDiscount userBrandDiscount = new UserBrandDiscount();
						userBrandDiscount.setBrandId(userProductDTO.getBrandId());
						userBrandDiscount.setDiscount(userProductDTO.getBrandDiscount());
						userBrandDiscount.setUserId(userProductDTO.getUserId());
						//update selling price by brand
						daoManager.getProductDao().updateSellingPriceBrand(userBrandDiscount);
						// insert user brand discount or category
						UserBrandDiscount ubd = daoManager.getUserBrandDiscountDao().getUserBrandDiscount(userBrandDiscount);
						if( ubd == null)
							daoManager.getUserBrandDiscountDao().insertEntity(userBrandDiscount);
						else {
							ubd.setDiscount(userBrandDiscount.getDiscount());
							daoManager.getUserBrandDiscountDao().updateEntity(ubd);
							
						}
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public void updateSellingPriceCategory(final UserProductDTO userProductDTO)
			throws ServiceException {

		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
													
						UserCategoryDiscount userCatDiscount = new UserCategoryDiscount();
						userCatDiscount.setCategoryId(userProductDTO.getCategoryId());
						userCatDiscount.setDiscount(userProductDTO.getCategoryDiscount());
						userCatDiscount.setUserId(userProductDTO.getUserId());
						//update selling price by brand
						daoManager.getProductDao().updateSellingPriceCategory(userCatDiscount);
						// insert user brand discount or category
						UserCategoryDiscount  ucd = daoManager.getUserCategoryDiscountDao().getUserCategoryDiscount(userCatDiscount);
						if( ucd == null)
							daoManager.getUserCategoryDiscountDao().insertEntity(userCatDiscount);
						else {
							ucd.setDiscount(userCatDiscount.getDiscount());
							daoManager.getUserCategoryDiscountDao().updateEntity(ucd);							
						}
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public CommonUserDiscountDTO getUserBrandDiscount(final CommonUserDiscountDTO userBrandDiscountDTO)
			throws ServiceException {
		UserBrandDiscount discountResult = null;
		try {
			discountResult = (UserBrandDiscount) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					
					UserBrandDiscount userBrandDiscount = new UserBrandDiscount();
					userBrandDiscount.setBrandId(userBrandDiscountDTO.getBrandId());				
					userBrandDiscount.setUserId(userBrandDiscountDTO.getUserId());

					return daoManager.getUserBrandDiscountDao().getUserBrandDiscount(userBrandDiscount);
				}
			});
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
		if(discountResult != null){
			CommonUserDiscountDTO udDTO = new CommonUserDiscountDTO();
			udDTO.setCategoryId(discountResult.getBrandId());
			udDTO.setUserId(discountResult.getUserId());
			udDTO.setDiscount(discountResult.getDiscount());
			return udDTO;									
		}		
		return null;
	}
	



	@Override
	public CommonUserDiscountDTO getUserCategoryDiscount(final CommonUserDiscountDTO userDiscountDTO) 
			throws ServiceException {
		UserCategoryDiscount discountResult = null;
		try {
			discountResult = (UserCategoryDiscount) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					
					UserCategoryDiscount userCatDiscount = new UserCategoryDiscount();
					userCatDiscount.setCategoryId(userDiscountDTO.getCategoryId());				
					userCatDiscount.setUserId(userDiscountDTO.getUserId());

					return daoManager.getUserCategoryDiscountDao().getUserCategoryDiscount(userCatDiscount);
				}
			});
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
		if(discountResult != null){
			CommonUserDiscountDTO udDTO = new CommonUserDiscountDTO();
			udDTO.setCategoryId(discountResult.getCategoryId());
			udDTO.setUserId(discountResult.getUserId());
			udDTO.setDiscount(discountResult.getDiscount());
			return udDTO;									
		}
		
		return null;
	}

	



	@Override
	public void updateSellingPriceProduct(final UserProductDTO producDTO)
			throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
													
						Product product = new Product();
						product.setUserId(producDTO.getUserId());
						product.setId(producDTO.getId());
						product.setUserPrice(producDTO.getUserPrice());
						product.setPriceType(PriceType.MANUEL_PRICE_SET.getValue());
						//update selling price by product
						daoManager.getProductDao().updateSellingPriceProduct(product);
						
						
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CommonDTO> getAllMainSpecification(LoyaltyEnum language)
			throws ServiceException {
		List<Specification> list = null;
		try {
			list = (List<Specification>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getSpecificationDao().getAllMainSpecification();
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		
		return DTOFactory.getAllCommonDTOFromSpecification(list, language);
	}

	
}
