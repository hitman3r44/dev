package com.loyauty.service.product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.Type;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.AlterProductXML;
import com.loyauty.model.AlterUserProductXML;
import com.loyauty.model.Box;
import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.City;
import com.loyauty.model.Currency;
import com.loyauty.model.Image;
import com.loyauty.model.LoyaltyEnum;
import com.loyauty.model.Orders;
import com.loyauty.model.Product;
import com.loyauty.model.Province;
import com.loyauty.model.Query;
import com.loyauty.model.ProductLink;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Select;
import com.loyauty.model.ShippingCity;
import com.loyauty.model.ShippingProvince;
import com.loyauty.model.ShippingTotal;
import com.loyauty.model.Specification;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.User;
import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;
import com.loyauty.model.UserProductPrice;
import com.loyauty.model.UserProvincePopulation;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.CommonUserDiscountDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.QueryDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.SearchRequestDTO.SearchType;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.image.ImageServiceImpl;
import com.loyauty.util.CommonUtils;

public class ProductServiceImpl extends ServiceImpl implements ProductService {
	
	private static final Logger log = Logger.getLogger(ProductServiceImpl.class);
	
	@Setter @Getter

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
	public Long createProduct(final ProductDTO productDTO) throws ServiceException {
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				/* (non-Javadoc)
				 * @see com.loyauty.dao.core.DaoCommand#execute(com.loyauty.dao.core.DaoManager)
				 */
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
					
					// Others
					Translation translationOther = new Translation();					
					daoManager.getTranslationDao().insertTranslation(translationOther);
					// Eng Others
					TranslationEntry entryOtherEng = new TranslationEntry(translationOther.getId(), productDTO.getOtherEng().getName());
					entryOtherEng.setLanguage(Language.ENGLISH);
					daoManager.getTranslationDao().insertEntry(entryOtherEng);
					// Fr Name
					TranslationEntry entryOtherFr = new TranslationEntry(translationOther.getId(), productDTO.getOtherFr().getName());
					entryOtherFr.setLanguage(Language.FRENCH);
					daoManager.getTranslationDao().insertEntry(entryOtherFr);
					
					// Warranty
					Translation translationWarranty = new Translation();
					daoManager.getTranslationDao().insertTranslation(translationWarranty);
					// Eng Others
					TranslationEntry entryWarrantyEng = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyEng().getName());
					entryWarrantyEng.setLanguage(Language.ENGLISH);
					daoManager.getTranslationDao().insertEntry(entryWarrantyEng);
					// Fr Name
					TranslationEntry entryWarrantyFr = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyFr().getName());
					entryWarrantyFr.setLanguage(Language.FRENCH);
					daoManager.getTranslationDao().insertEntry(entryWarrantyFr);					
										
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
						daoManager.getImageDao().insertEntity(imageProduct);
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
					daoManager.getProductDao().insertProduct(product);
					
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
						daoManager.getProductDao().insertProductModelNumber(productModelNumber);
					}
					
					//insert url link
					if(productDTO.getLinkList().size() > 0)
					{
						ProductLink productLink = new ProductLink();
						productLink.setProductId(product.getId());
						productLink.setLink(productDTO.getLinkList().get(0).getLink());
						daoManager.getProductDao().insertProductLink(productLink);
					}
					return product;
				}
			});
			return(productResult.getId());
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	@Override
	public ProductDTO getProductInformation(final Long productId, final Long userId) throws ServiceException {

		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Product product = new Product();
					Select select = new Select();
					select.setQuery(String.valueOf(productId));
					select.setUserId(userId);
					product = daoManager.getProductDao().getProduct(select);
					return product;
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
							//Brand
							Brand brand = null;
							if(userProducDTO.getBrandId() != null){
								brand = new Brand();
								brand.setId(userProducDTO.getBrandId());
							}
							
							//Category
							Category category = null;
							if(userProducDTO.getCategoryId() != null){
								category = new Category();
								category.setId(userProducDTO.getCategoryId());
							}
														
							Product product = new Product();
							product.setBrand(brand);
							product.setCategory(category);	
							product.setUserProductStatus(userProducDTO.getUserProductStatus());
							product.setUserId(userProducDTO.getUserId());
							product.setLoyaltySourceProductId(userProducDTO.getLsProductId());
							
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
	public void updateProduct(final ProductDTO productDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					Product product = new Product();
					product.setUpc(productDTO.getUpc());
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
					
					//Eng Others
					if(productDTO.getOtherEng().getName() != null)
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getOtherEng()));
					//Fr Others
					if(productDTO.getOtherFr().getName() != null)
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getOtherFr()));
					
					//If the productDTO.getWarrantyEng is null that means that bothe warranty are null
					//So I have to insert the warranty instead of update them.
					// Warranty
					Translation translationWarranty = new Translation();
					if(productDTO.getWarrantyEng().getId() != 0){
						//Eng Warranty
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getWarrantyEng()));
						//Fr Warranty
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getWarrantyFr()));
						
						translationWarranty.setId(productDTO.getWarrantyTranslationId());
					}
					else{
						
						if(productDTO.getWarrantyEng() != null)
						{
							daoManager.getTranslationDao().insertTranslation(translationWarranty);
							// Eng Others
							TranslationEntry entryWarrantyEng = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyEng().getName());
							entryWarrantyEng.setLanguage(Language.ENGLISH);
							daoManager.getTranslationDao().insertEntry(entryWarrantyEng);
							// Fr Name
							TranslationEntry entryWarrantyFr = new TranslationEntry(translationWarranty.getId(), productDTO.getWarrantyFr().getName());
							entryWarrantyFr.setLanguage(Language.FRENCH);
							daoManager.getTranslationDao().insertEntry(entryWarrantyFr);
						}
					}
					product.setWarranty(translationWarranty);	
					
					//Insert Image product
					Image imageProduct = new Image();
					//If the id image is null that means that the image is new.
					//So, Insert the image and update the product.
					if(productDTO.getImage() != null) {
						if (productDTO.getImage().getId() > 0L) {						
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
							
							//For the image, I use the plugin and the insert or update of 
							//the image is done in AjaxUploadFile So if I insert here the 
							//image again, I'll get a duplicate key exception. 
							//I update all the time.
							//daoManager.getImageDao().updateEntity(imageProduct);		
							//I do nothing.
						}
					}
					
					//Brand 
					Brand brand = new Brand();
					brand.setId(productDTO.getBrand().getId());
					
					//Category
					Category category = new Category();
					category.setId(productDTO.getCategory().getId());
					product.setId(productDTO.getId());
						
					 if (imageProduct != null) {
						product.setImage(imageProduct);
					}
					
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
					product.setStatus(productDTO.getStatus());
					product.setNote(productDTO.getNote());
					product.setWereWgtDimChanged(productDTO.getWereWgtDimChanged());
					product.setConsideredForXML(productDTO.getConsideredForXML());

					if (productDTO.getStatus() == ProductStatus.DISCONTINUED) {
						product.setDiscontinuedStartDate(productDTO.getDiscontinuedStartDate());
						String productSubstitute = productDTO.getLoyaltyProductIdSub();
						if (productSubstitute != null) {
							if (productSubstitute.length() > 0 && !productSubstitute.matches("^\\s*$")) {
								product.setLoyaltyProductIdSub(productDTO.getLoyaltyProductIdSub());
							}
						}
					} else if (productDTO.getStatus() == ProductStatus.DISABLED) {						
						Date discontinuedStartDate = productDTO.getDiscontinuedStartDate();
						if (discontinuedStartDate != null) {
							product.setDiscontinuedStartDate(discontinuedStartDate);
						}
						String productSubstitute = productDTO.getLoyaltyProductIdSub();
						if (productSubstitute != null) {
							product.setLoyaltyProductIdSub(productDTO.getLoyaltyProductIdSub());
						}
					}
					//51 is N/A. To allow don't pick any option in edit product page in Admin
					//I do this trick
					if(productDTO.getMainFilterTypeId() != -1)
						product.setTypeId(productDTO.getMainFilterTypeId());
					else
						product.setTypeId(new Long(51));
					
					daoManager.getProductDao().updateProduct(product);
					
					//Manufacture Product Id
					Iterator<ProductModelDTO> stringIterator = productDTO.getManufactureProductList().iterator();
					ProductModelNumber productModelNumber;
					ProductModelDTO productModelDTO;
					while(stringIterator.hasNext()) {
						productModelNumber = new ProductModelNumber();
						productModelDTO = (ProductModelDTO)stringIterator.next();
						productModelNumber.setModelNumber(productModelDTO.getName());
						productModelNumber.setQuantity(productModelDTO.getQuantity());
						productModelNumber.setSupplier(productModelDTO.getSupplier());
						productModelNumber.setPrice(productModelDTO.getPrice());
						productModelNumber.setMsrp(productModelDTO.getMsrp());
						productModelNumber.setId(productModelDTO.getId());
						productModelNumber.setProductId(product.getId());
						if(productModelNumber.getId() != 0) {
						    if(!productModelDTO.getName().trim().equals(""))
						    	daoManager.getProductDao().updateProductModelNumber(productModelNumber);
						    else
						    	daoManager.getProductDao().deleteProductModelNumber(productModelNumber);
						} else {
						    if(!productModelDTO.getName().trim().equals("") )
							 daoManager.getProductDao().insertProductModelNumber(productModelNumber);
						} 
					}
					
					//link url
					if(productDTO.getLinkList() != null)
					{
						ProductLink productLink = new ProductLink();
						productLink.setId(productDTO.getLinkList().get(0).getId());
						productLink.setLink(productDTO.getLinkList().get(0).getLink());
						productLink.setProductId(productDTO.getLinkList().get(0).getProductId());
						if(productLink.getId() !=0 )
							daoManager.getProductDao().updateProductLink(productLink);
						else
							daoManager.getProductDao().insertProductLink(productLink);
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
	
	@Override
	public void updateUserProductStatus(final UserProductDTO producDTO)
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
						product.setUserProductStatus(producDTO.getUserProductStatus());
						daoManager.getProductDao().updateUserProductStatus(product);
						
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllProductQuery(final QueryDTO dto)
			throws ServiceException {
		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							
							Query qry = new Query();
							Brand brand = null;
							if(dto.getBrand().getId()>0){
								brand = new Brand();
								brand.setId(dto.getBrand().getId());
							}
							Category cat = null;
							if(dto.getCategory().getId()>0){
								cat = new Category();
								cat.setId(dto.getCategory().getId());
							}
							
							qry.setBrand(brand);
							qry.setCategory(cat);
							qry.setTypeId(null);
							qry.setDiscontinued(dto.isDiscontinued());
							qry.setDisabled(dto.isDisabled());
							
							return daoManager.getProductDao().getAllProductQuery(qry);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getBasicProductDTOList(productList));
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductList(final SearchRequestDTO searchRequest) throws ServiceException {
		List <Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							
							Select select = new Select();
							select.setQuery(searchRequest.getQuery());
							select.setUserId(searchRequest.getUserId());
							
							if(searchRequest.getSearchType() == SearchType.NAME.getValue()){								
								return daoManager.getProductDao().getProductByName(select);
							}
							if(searchRequest.getSearchType() == SearchType.BRAND.getValue()){
								return daoManager.getProductDao().getAllProdcutByBrand(select);	
							}
							if(searchRequest.getSearchType() == SearchType.CATEGORY.getValue()){
								return daoManager.getProductDao().getAllProdcutByCategory(select);
							}
							if(searchRequest.getSearchType() == SearchType.MAIN_SPECIFICATION.getValue()){
								return daoManager.getProductDao().getAllProdcutBySpecification(select);
							}
							if(searchRequest.getSearchType() == SearchType.CATEGORY_GROUP.getValue()){
								return daoManager.getProductDao().getAllProdcutByCategoryGroup(select);
							}
							return daoManager.getProductDao().getAllProdcut();

						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		return DTOFactory.getProductDTOList(productList);
 
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserDTO> getAllActiveClients(final Long productId) throws ServiceException {

		List<User> activeClientsList = new ArrayList<User>();
		
		try {
			daoManager.setCommitTransaction(true);
			activeClientsList = (List<User>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Product product = new Product();
					Select select = new Select();
					select.setQuery(String.valueOf(productId));
					product = daoManager.getProductDao().getProduct(select);
					return product.getActiveClientsList();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getActiveClients(activeClientsList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllDiscontinuedProducts() throws ServiceException {

		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getAllDiscontinuedProducts();
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	@Override
	public void updateStatusToDisabled(final ProductDTO productDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
													
						Product product = new Product();
						product.setId(productDTO.getId());
						daoManager.getProductDao().updateStatusToDisabled(product);
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
	}
	
	@Override
	public ProductDTO getProductIdFromLSProductId(final String lSProductId) throws ServiceException {
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Product product = daoManager.getProductDao().getProductIdFromLSProductId(lSProductId);
					return product;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		if(productResult == null) return (null);
		return (DTOFactory.getProductDTO(productResult));				
	}
	
	
	
	@Override
	public ProductDTO getProductByLsProductId(final String lSProductId) throws ServiceException {
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Product product = daoManager.getProductDao().getProductByLsProductId(lSProductId);
					return product;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		if(productResult == null) return (null);
		return (DTOFactory.getProductDTO(productResult));				
	}
	
	
	
	
	
	
	@Override 
	public Long createUserProductPrice(final UserProductPriceDTO userProductPriceDTO) throws ServiceException {
		UserProductPrice userProductPriceResult = new UserProductPrice();		
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceResult = (UserProductPrice) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					UserProductPrice userProductPrice = new UserProductPrice();					
					userProductPrice.setUserId(userProductPriceDTO.getUserId());				
					userProductPrice.setProductId(userProductPriceDTO.getProductId());					
					userProductPrice.setPrice(userProductPriceDTO.getPrice());
					userProductPrice.setProfit(userProductPriceDTO.getProfit());
					userProductPrice.setDiscount(userProductPriceDTO.getDiscount());
					userProductPrice.setExcluded(userProductPriceDTO.getExcluded());					
					userProductPrice.setUserStatus(userProductPriceDTO.getUserStatus());
					userProductPrice.setPriceType(userProductPriceDTO.getPriceType());					
					daoManager.getProductDao().insertUserProductPrice(userProductPrice);					
					return userProductPrice;
				}
			});
			return userProductPriceResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPriceDTO> getUserProductPriceList(final Long productId) throws ServiceException {
		List<UserProductPrice> userProductPriceList = new ArrayList<UserProductPrice>();		
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceList = (List<UserProductPrice>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<UserProductPrice> userProductPriceListing = new ArrayList<UserProductPrice>();
					Select select = new Select();
					select.setProductId(productId);
					userProductPriceListing = daoManager.getProductDao().getUserProductPriceList(select);					
					return userProductPriceListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProductPriceDTOList(userProductPriceList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPriceDTO> getUserProductPriceForActiveUsersList(final Long productId) throws ServiceException {
		List<UserProductPrice> userProductPriceList = new ArrayList<UserProductPrice>();		
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceList = (List<UserProductPrice>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<UserProductPrice> userProductPriceListing = new ArrayList<UserProductPrice>();
					Select select = new Select();
					select.setProductId(productId);
					userProductPriceListing = daoManager.getProductDao().getUserProductPriceForActiveUsersList(select);					
					return userProductPriceListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProductPriceDTOList(userProductPriceList));
	}
	
	
	@Override
	public void updateUserProductPrice(final UserProductPriceDTO userProductPriceDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						UserProductPrice userProductPrice = new UserProductPrice();						
						userProductPrice.setUserId(userProductPriceDTO.getUserId());				
						userProductPrice.setProductId(userProductPriceDTO.getProductId());	
						userProductPrice.setPrice(userProductPriceDTO.getPrice());
						userProductPrice.setProfit(userProductPriceDTO.getProfit());
						userProductPrice.setDiscount(userProductPriceDTO.getDiscount());
						userProductPrice.setExcluded(userProductPriceDTO.getExcluded());					
						userProductPrice.setPriceType(userProductPriceDTO.getPriceType());
						daoManager.getProductDao().updateUserProductPrice(userProductPrice);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
	}	
	
	@Override
	public UserProductPriceDTO getUserProductPriceInformation(final Long productId, final Long userId) throws ServiceException {
		UserProductPrice userProductPriceResult = new UserProductPrice();		
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceResult = (UserProductPrice) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					UserProductPrice userProductPrice = new UserProductPrice();
					Select select = new Select();
					select.setProductId(productId);
					select.setUserId(userId);
					userProductPrice = daoManager.getProductDao().getUserProductPrice(select);
					return userProductPrice;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserProductPriceDTO(userProductPriceResult));
	}

	@Override
	public UserProductPriceDTO getUsrPPriceByLsproductId(final Long userId, final String lsProductId) throws ServiceException {
		UserProductPrice userProductPriceResult = null;	
		try {			
			daoManager.setCommitTransaction(true);
			userProductPriceResult = (UserProductPrice) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return daoManager.getProductDao().getUsrPPriceByLsproductId(userId,lsProductId);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserProductPriceDTO(userProductPriceResult));
	}

	
	
	@Override
	public UserProductPriceDTO getUsrPPriceByProductId(final Long userId, final Long productId) throws ServiceException {
		UserProductPrice userProductPriceResult = null;	
		try {			
			daoManager.setCommitTransaction(true);
			userProductPriceResult = (UserProductPrice) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return daoManager.getProductDao().getUsrPPriceByProductId(userId,productId);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserProductPriceDTO(userProductPriceResult));
	}

	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProvinceDTO> getAllProvinces() throws ServiceException {
		List<Province> provinceList = new ArrayList<Province>();		
		try {
			daoManager.setCommitTransaction(true);
			provinceList = (List<Province>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllProvinces();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProvinceDTOList(provinceList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CityDTO> getAllCities(final Long provinceId) throws ServiceException {
		List<City> cityList = new ArrayList<City>();		
		try {
			daoManager.setCommitTransaction(true);
			cityList = (List<City>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<City> userProductPriceListing = new ArrayList<City>();
					Select select = new Select();
					select.setProvinceId(provinceId);
					userProductPriceListing = daoManager.getProductDao().getAllCities(select);			
					return userProductPriceListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCityDTOList(cityList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public CityDTO getMostPopularCitie(final Long provinceId) throws ServiceException {
		City city = new City();		
		try {
			daoManager.setCommitTransaction(true);
			city = (City) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					City userProductPrice= new City();
					Select select = new Select();
					select.setProvinceId(provinceId);
					userProductPrice = daoManager.getProductDao().getMostPopularCitie(select);			
					return userProductPrice;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCityDTO(city));
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CityDTO> getCities() throws ServiceException {
		List<City> cityList = new ArrayList<City>();		
		try {
			daoManager.setCommitTransaction(true);
			cityList = (List<City>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getCities();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCityDTOList(cityList));
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CityDTO> getMostPopularCitiesList() throws ServiceException {
		List<City> cityList = new ArrayList<City>();		
		try {
			daoManager.setCommitTransaction(true);
			cityList = (List<City>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getMostPopularCitiesList();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCityDTOList(cityList));
	}
	
	
	
	@Override
	public Long createShippingCity(final ShippingCityDTO shippingCityDTO) throws ServiceException {
		ShippingCity shippingCityResult = new ShippingCity();
		try {
			daoManager.setCommitTransaction(true);
			shippingCityResult = (ShippingCity) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {				
					ShippingCity shippingCity = new ShippingCity();
					shippingCity.setProductId(shippingCityDTO.getProductId());
					shippingCity.setCityId(shippingCityDTO.getCityId());
					shippingCity.setExpeditedParcelPrice(shippingCityDTO.getExpeditedParcelPrice());
					daoManager.getProductDao().insertShippingCity(shippingCity);
					return shippingCity;
				}
			});
			return shippingCityResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public Long createShippingProvince(final ShippingProvinceDTO shippingProvinceDTO) throws ServiceException {
		ShippingProvince shippingProvinceResult = new ShippingProvince();
		try {
			daoManager.setCommitTransaction(true);
			shippingProvinceResult = (ShippingProvince) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					ShippingProvince shippingProvince = new ShippingProvince();
					shippingProvince.setProductId(shippingProvinceDTO.getProductId());
					shippingProvince.setProvinceId(shippingProvinceDTO.getProvinceId());
					shippingProvince.setWeightedTotalProvince(shippingProvinceDTO.getWeightedTotalProvince());
					daoManager.getProductDao().insertShippingProvince(shippingProvince);
					return shippingProvince;
				}
			});
			return shippingProvinceResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public Long createShippingTotal(final ShippingTotalDTO shippingTotalDTO) throws ServiceException {
		ShippingTotal shippingTotalResult = new ShippingTotal();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalResult = (ShippingTotal) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					ShippingTotal shippingTotal = new ShippingTotal();
					shippingTotal.setProductId(shippingTotalDTO.getProductId());
					shippingTotal.setProvinceId(shippingTotalDTO.getProvinceId());
					shippingTotal.setUserId(shippingTotalDTO.getUserId());
					shippingTotal.setWeightedProvinceTotalWithCoverage(shippingTotalDTO.getWeightedProvinceTotalWithCoverage());
					shippingTotal.setAverageShippingTotal(shippingTotalDTO.getAverageShippingTotal());
					daoManager.getProductDao().insertShippingTotal(shippingTotal);
					return shippingTotal;
				}
			});
			return shippingTotalResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public void updateUPPShippingCoverage(final UserProductPriceDTO userProductPriceDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						UserProductPrice userProductPrice = new UserProductPrice();
						userProductPrice.setUserId(userProductPriceDTO.getUserId());				
						userProductPrice.setProductId(userProductPriceDTO.getProductId());
						userProductPrice.setShippingCoverage(userProductPriceDTO.getShippingCoverage());
						daoManager.getProductDao().updateUPPShippingCoverage(userProductPrice);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public void updateUPPShippingTotalCanada(final UserProductPriceDTO userProductPriceDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						UserProductPrice userProductPrice = new UserProductPrice();
						userProductPrice.setUserId(userProductPriceDTO.getUserId());				
						userProductPrice.setProductId(userProductPriceDTO.getProductId());
						userProductPrice.setShippingTotalCanada(userProductPriceDTO.getShippingTotalCanada());
						daoManager.getProductDao().updateUPPShippingTotalCanada(userProductPrice);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductListByCategoryGroupId(final Long categoryGroupId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setCategoryGoupeId(categoryGroupId);
					productListing = daoManager.getProductDao().getProductListByCategoryGroupId(select);			
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProducts(final Long userId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					productListing = daoManager.getProductDao().getAllValidStatusProducts(select);			
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsForAllUsers() throws ServiceException {
		List<Product> productList = new ArrayList<Product>();		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllValidStatusProductsForAllUsers();			

				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsG(final Long userId, 
														final Long categoryGroupId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					select.setCategoryGoupeId(categoryGroupId);
					productListing = daoManager.getProductDao().getAllValidStatusProductsG(select);			
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsGC(final Long userId, 
														final Long categoryGroupId, 
														final Long categoryId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					select.setCategoryGoupeId(categoryGroupId);
					select.setCategoryId(categoryId);
					productListing = daoManager.getProductDao().getAllValidStatusProductsGC(select);			
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsGCT(final Long userId, 
														final Long categoryGroupId, 
														final Long categoryId, 
														final Long typeId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					select.setCategoryGoupeId(categoryGroupId);
					select.setCategoryId(categoryId);
					select.setTypeId(typeId);
					productListing = daoManager.getProductDao().getAllValidStatusProductsGCT(select);			
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsGCTB(final Long userId, 
															final Long categoryGroupId, 
															final Long categoryId, 
															final Long typeId,
															final Long brandId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					select.setCategoryGoupeId(categoryGroupId);
					select.setCategoryId(categoryId);
					select.setTypeId(typeId);
					select.setBrandId(brandId);
					productListing = daoManager.getProductDao().getAllValidStatusProductsGCTB(select);		
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllValidStatusProductsGCB(final Long userId, 
															final Long categoryGroupId, 
															final Long categoryId,
															final Long brandId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					select.setCategoryGoupeId(categoryGroupId);
					select.setCategoryId(categoryId);
					select.setBrandId(brandId);
					productListing = daoManager.getProductDao().getAllValidStatusProductsGCB(select);
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}
	/*
	@Override
	public ProductDTO getProductById(final Long productId) throws ServiceException {
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					Product product = daoManager.getProductDao().getProductById(select);
					return product;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		if(productResult == null) return (null);
			return (DTOFactory.getProductDTO(productResult));				
	}
	*/
	
	@Override
	public ProductDTO getProductById(final Long productId) throws ServiceException {
		Product productResult = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			productResult = (Product) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					Product product = daoManager.getProductDao().getProductById(productId);
					return product;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		if(productResult == null) return (null);
			return (DTOFactory.getProductDTO(productResult));				
	}
	
	
	@Override
	public void updateShippingCityToExpeditedParcelPrice(final ShippingCityDTO shippingCityDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						ShippingCity shippingCity = new ShippingCity();
						shippingCity.setProductId(shippingCityDTO.getProductId());
						shippingCity.setCityId(shippingCityDTO.getCityId());
						shippingCity.setExpeditedParcelPrice(shippingCityDTO.getExpeditedParcelPrice());
						daoManager.getProductDao().updateShippingCityToExpeditedParcelPrice(shippingCity);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public ShippingCityDTO getShippingCity(final Long productId, final Long cityId) throws ServiceException {
		ShippingCity shippingCityResult = new ShippingCity();		
		try {			
			daoManager.setCommitTransaction(true);
			shippingCityResult = (ShippingCity) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					ShippingCity shippingCity = new ShippingCity();
					Select select = new Select();
					select.setProductId(productId);
					select.setCityId(cityId);
					shippingCity = daoManager.getProductDao().getShippingCity(select);
					return shippingCity;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingCityDTO(shippingCityResult));
	}
	
	@Override
	public void updateShippingProvince(final ShippingProvinceDTO shippingProvinceDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						ShippingProvince shippingProvince = new ShippingProvince();
						shippingProvince.setProductId(shippingProvinceDTO.getProductId());
						shippingProvince.setProvinceId(shippingProvinceDTO.getProvinceId());
						shippingProvince.setWeightedTotalProvince(shippingProvinceDTO.getWeightedTotalProvince());
						daoManager.getProductDao().updateShippingProvince(shippingProvince);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getValidProductIdByDim(final ProductDTO productDTO) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					Product product = new Product();
					product.setId(productDTO.getId());
					product.setWeight(productDTO.getWeight());
					product.setLength(productDTO.getLarge());
					product.setWidth(productDTO.getWidth());
					product.setHeight(productDTO.getHigh());
					return daoManager.getProductDao().getValidProductIdByDim(product);
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));		
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCityDTO> getShippingCityListWithZeroParcelPriceByCityId(final Long cityId) throws ServiceException {
		List<ShippingCity> shippingCityList = new ArrayList<ShippingCity>();
		try {
			daoManager.setCommitTransaction(true);
			shippingCityList = (List<ShippingCity>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<ShippingCity> shippingCityListing = new ArrayList<ShippingCity>();
					Select select = new Select();
					select.setCityId(cityId);
					shippingCityListing = daoManager.getProductDao().getShippingCityListWithZeroParcelPriceByCityId(select);
					return shippingCityListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingCityDTOList(shippingCityList));
	}
	
	@Override
	public CityDTO getCity(final Long cityId) throws ServiceException {
		City cityResult = new City();		
		try {			
			daoManager.setCommitTransaction(true);
			cityResult = (City) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					City city = new City();
					Select select = new Select();
					select.setCityId(cityId);
					city = daoManager.getProductDao().getCity(select);
					return city;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCityDTO(cityResult));
	}
	
	
	@Override
	public CityDTO getCityByName(final String nameCity) throws ServiceException {	
		City city=null;
		try {			
			daoManager.setCommitTransaction(true);
			city = (City) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return daoManager.getProductDao().getCityByName(nameCity);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		CityDTO cityDTO=null;
		if(city!=null)cityDTO=DTOFactory.getCityDTO(city);
		return cityDTO;
	}
	
	
	
	
	
	@Override
	public ProvinceDTO getProvince(final Long provinceId) throws ServiceException {
		Province provinceResult = new Province();		
		try {			
			daoManager.setCommitTransaction(true);
			provinceResult = (Province) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Province province = new Province();
					Select select = new Select();
					select.setProvinceId(provinceId);
					province = daoManager.getProductDao().getProvince(select);
					return province;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProvinceDTO(provinceResult));
	}	

	
	
	@Override
	public ProvinceDTO getProvinceByCode(final String code) throws ServiceException {
		Province provinceResult = new Province();		
		try {			
			daoManager.setCommitTransaction(true);
			provinceResult = (Province) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
					throws DaoException {
					return daoManager.getProductDao().getProvinceByCode(code);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProvinceDTO(provinceResult));
	}
	
	
	@Override
	public ShippingProvinceDTO getWeightedTotalProvinceFromShippingProvince(final Long productId, final Long provinceId) throws ServiceException {
		ShippingProvince shippingProvinceResult = new ShippingProvince();		
		try {			
			daoManager.setCommitTransaction(true);
			shippingProvinceResult = (ShippingProvince) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					ShippingProvince shippingProvince = new ShippingProvince();
					Select select = new Select();
					select.setProductId(productId);
					select.setProvinceId(provinceId);
					shippingProvince = daoManager.getProductDao().getWeightedTotalProvinceFromShippingProvince(select);
					return shippingProvince;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingProvinceDTO(shippingProvinceResult));
	}
	
	@Override
	public void updateShippingTotal(final ShippingTotalDTO shippingTotalDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						ShippingTotal shippingTotal = new ShippingTotal();
						shippingTotal.setProductId(shippingTotalDTO.getProductId());
						shippingTotal.setProvinceId(shippingTotalDTO.getProvinceId());
						shippingTotal.setUserId(shippingTotalDTO.getUserId());
						shippingTotal.setWeightedProvinceTotalWithCoverage(shippingTotalDTO.getWeightedProvinceTotalWithCoverage());
						shippingTotal.setAverageShippingTotal(shippingTotalDTO.getAverageShippingTotal());
						daoManager.getProductDao().updateShippingTotal(shippingTotal);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotalDTO> getShippingTotalList(final Long productId, final Long userId) throws ServiceException {
		List<ShippingTotal> shippingTotalList = new ArrayList<ShippingTotal>();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalList = (List<ShippingTotal>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<ShippingTotal> shippingTotalListing = new ArrayList<ShippingTotal>();
					Select select = new Select();
					select.setProductId(productId);
					select.setUserId(userId);
					shippingTotalListing = daoManager.getProductDao().getShippingTotalList(select);
					return shippingTotalListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTOList(shippingTotalList));
	}
	
	@Override
	public Long createUserProvincePopulation(final UserProvincePopulationDTO userProvincePopulationDTO) throws ServiceException {
		UserProvincePopulation userProvincePopulationResult = new UserProvincePopulation();
		try {
			daoManager.setCommitTransaction(true);
			userProvincePopulationResult = (UserProvincePopulation) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					UserProvincePopulation userProvincePopulation = new UserProvincePopulation();
					userProvincePopulation.setProvinceId(userProvincePopulationDTO.getProvinceId());
					userProvincePopulation.setUserId(userProvincePopulationDTO.getUserId());
					userProvincePopulation.setPopulationPercent(userProvincePopulationDTO.getPopulationPercent());
					daoManager.getProductDao().insertUserProvincePopulation(userProvincePopulation);
					return userProvincePopulation;
				}
			});
			return userProvincePopulationResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProvincePopulationDTO> getUserProvincePopulationList(final Long userId) throws ServiceException {
		List<UserProvincePopulation> userProvincePopulationList = new ArrayList<UserProvincePopulation>();
		try {
			daoManager.setCommitTransaction(true);
			userProvincePopulationList = (List<UserProvincePopulation>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<UserProvincePopulation> userProvincePopulationListing = new ArrayList<UserProvincePopulation>();
					Select select = new Select();
					select.setUserId(userId);
					userProvincePopulationListing = daoManager.getProductDao().getUserProvincePopulationList(select);
					return userProvincePopulationListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProvincePopulationDTOList(userProvincePopulationList));		
	}	
	
	@Override
	public void updateUserProvincePopulation(final UserProvincePopulationDTO userProvincePopulationDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						UserProvincePopulation userProvincePopulation = new UserProvincePopulation();
						userProvincePopulation.setUserId(userProvincePopulationDTO.getUserId());
						userProvincePopulation.setProvinceId(userProvincePopulationDTO.getProvinceId());
						userProvincePopulation.setPopulationPercent(userProvincePopulationDTO.getPopulationPercent());
						daoManager.getProductDao().updateUserProvincePopulation(userProvincePopulation);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCityDTO> getAllShippingCity() throws ServiceException {
		List<ShippingCity> shippingCityList = new ArrayList<ShippingCity>();
		try {
			daoManager.setCommitTransaction(true);
			shippingCityList = (List<ShippingCity>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllShippingCity();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingCityDTOList(shippingCityList));
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingProvinceDTO> getAllShippingProvince() throws ServiceException {
		List<ShippingProvince> shippingProvinceList = new ArrayList<ShippingProvince>();
		try {
			daoManager.setCommitTransaction(true);
			shippingProvinceList = (List<ShippingProvince>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllShippingProvince();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingProvinceDTOList(shippingProvinceList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotalDTO> getAllShippingTotal() throws ServiceException {
		List<ShippingTotal> shippingTotalList = new ArrayList<ShippingTotal>();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalList = (List<ShippingTotal>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllShippingTotal();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTOList(shippingTotalList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProvincePopulationDTO> getAllUserProvincePopulation() throws ServiceException {
		List<UserProvincePopulation> userProvincePopulationList = new ArrayList<UserProvincePopulation>();
		try {
			daoManager.setCommitTransaction(true);
			userProvincePopulationList = (List<UserProvincePopulation>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllUserProvincePopulation();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProvincePopulationDTOList(userProvincePopulationList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPriceDTO> getAllUserProductPrice() throws ServiceException {
		List<UserProductPrice> userProductPriceList = new ArrayList<UserProductPrice>();
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceList = (List<UserProductPrice>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllUserProductPrice();
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProductPriceDTOList(userProductPriceList));
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotalDTO> getShippingTotalListByUserId(final Long userId) throws ServiceException {
		List<ShippingTotal> shippingTotalList = new ArrayList<ShippingTotal>();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalList = (List<ShippingTotal>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<ShippingTotal> shippingTotalListing = new ArrayList<ShippingTotal>();
					Select select = new Select();
					select.setUserId(userId);
					shippingTotalListing = daoManager.getProductDao().getShippingTotalListByUserId(select);
					return shippingTotalListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTOList(shippingTotalList));	
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPriceDTO> getUserProductPriceByUserId(final Long userId) throws ServiceException {
		List<UserProductPrice> userProductPriceList = new ArrayList<UserProductPrice>();
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceList = (List<UserProductPrice>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<UserProductPrice> userProductPriceListing = new ArrayList<UserProductPrice>();
					Select select = new Select();
					select.setUserId(userId);
					userProductPriceListing = daoManager.getProductDao().getUserProductPriceByUserId(select);
					return userProductPriceListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProductPriceDTOList(userProductPriceList));
	}	
	
	@Override
	public UserProvincePopulationDTO getUserProvincePopulation(final Long userId, final Long provinceId) throws ServiceException {
		UserProvincePopulation userProvincePopulationResult = new UserProvincePopulation();
		try {			
			daoManager.setCommitTransaction(true);
			userProvincePopulationResult = (UserProvincePopulation) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					UserProvincePopulation userProvincePopulation = new UserProvincePopulation();
					Select select = new Select();
					select.setUserId(userId);
					select.setProvinceId(provinceId);
					userProvincePopulation = daoManager.getProductDao().getUserProvincePopulation(select);
					return userProvincePopulation;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProvincePopulation(userProvincePopulationResult));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingCityDTO> getShippingCityByIDGreaterThan(final Long id) throws ServiceException {
		List<ShippingCity> shippingCityList = new ArrayList<ShippingCity>();
		try {
			daoManager.setCommitTransaction(true);
			shippingCityList = (List<ShippingCity>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getShippingCityByIDGreaterThan(id);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingCityDTOList(shippingCityList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingProvinceDTO> getShippingProvinceByIDGreaterThan(final Long id) throws ServiceException {
		List<ShippingProvince> shippingProvinceList = new ArrayList<ShippingProvince>();
		try {
			daoManager.setCommitTransaction(true);
			shippingProvinceList = (List<ShippingProvince>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getShippingProvinceByIDGreaterThan(id);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingProvinceDTOList(shippingProvinceList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotalDTO> getShippingTotalByIDGreaterThan(final Long id) throws ServiceException {
		List<ShippingTotal> shippingTotalList = new ArrayList<ShippingTotal>();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalList = (List<ShippingTotal>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getShippingTotalByIDGreaterThan(id);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTOList(shippingTotalList));
	}	
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getAllValidProductIds() throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getAllValidProductIds();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOLightList(productList));	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getValidProductsByUserIdAndExcluded(final Long userId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setUserId(userId);
					productListing = daoManager.getProductDao().getValidProductsByUserIdAndExcluded(select);
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductsClassification(final Long userId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> ProductsClassificationList = new ArrayList<Product>();
					ProductsClassificationList = daoManager.getProductDao().getProductsClassification(userId);
					return ProductsClassificationList;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));  
		}
		return(DTOFactory.getProductDTOClassification(productList)); 
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getValidProductsGreaterThanId(final Long productId) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();
					Select select = new Select();
					select.setProductId(productId);
					productListing = daoManager.getProductDao().getValidProductsGreaterThanId(select);
					return productListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShippingTotalDTO> getShippingTotalListByProductId(final Long productId) throws ServiceException {
		List<ShippingTotal> shippingTotalList = new ArrayList<ShippingTotal>();
		try {
			daoManager.setCommitTransaction(true);
			shippingTotalList = (List<ShippingTotal>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					return daoManager.getProductDao().getShippingTotalListByProductId(select);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTOList(shippingTotalList));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserProductPriceDTO> getNullsShippingTotalCanadaOnUserProductPrice(final Long productId) throws ServiceException {
		List<UserProductPrice> userProductPriceList = new ArrayList<UserProductPrice>();
		try {
			daoManager.setCommitTransaction(true);
			userProductPriceList = (List<UserProductPrice>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<UserProductPrice> userProductPriceListing = new ArrayList<UserProductPrice>();
					Select select = new Select();
					select.setProductId(productId);
					userProductPriceListing = daoManager.getProductDao().getNullsShippingTotalCanadaOnUserProductPrice(select);
					return userProductPriceListing;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getUserProductPriceDTOList(userProductPriceList));	
	}
	
	@Override
	public void updateAmendingProduct(final ProductDTO productDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					Product product = new Product();
					product.setId(productDTO.getId());
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getNameEng()));
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getNameFr()));
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getDescriptionEng()));
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getDescriptionFr()));
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getSpecificationEng()));
					daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getSpecificationFr()));
					if(productDTO.getOtherEng().getName() != null) {
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getOtherEng()));
					}
					
					if(productDTO.getOtherFr().getName() != null) {
						daoManager.getTranslationDao().updateEntry(new TranslationEntry(productDTO.getOtherFr()));
					}					
					product.setNote(productDTO.getNote());
					daoManager.getProductDao().updateAmendingProduct(product);
					return product;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	@Override
	public Boolean existsOnAlterProductXML(final Long productId) throws ServiceException {
		Boolean outcome = false;
		try {
			daoManager.setCommitTransaction(true);
			outcome = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					return (daoManager.getProductDao().getAlterProductXMLByProductId(select) != null);
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return outcome;
	}
	
	@Override
	public Boolean existsOnAlterUserProductXML(final Long productId, final Long userId) throws ServiceException {
		Boolean outcome = false;
		try {
			daoManager.setCommitTransaction(true);
			outcome = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					Select select = new Select();
					select.setUserId(userId);
					select.setProductId(productId);
					return (daoManager.getProductDao().getAlterUserProductXMLByProductIdAndUserId(select) != null);
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return outcome;
	}
	
	@Override
	public void updateAlterUserProductXML(final AlterUserProductXMLDTO alterUserProductXMLDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						AlterUserProductXML alterUserProductXML = new AlterUserProductXML();
						alterUserProductXML.setUserId(alterUserProductXMLDTO.getUserId());
						alterUserProductXML.setProductId(alterUserProductXMLDTO.getProductId());
						alterUserProductXML.setPriceDiscount(alterUserProductXMLDTO.getPriceDiscount());
						alterUserProductXML.setExcluded(alterUserProductXMLDTO.getExcluded());
						alterUserProductXML.setShipping(alterUserProductXMLDTO.getShipping());
						alterUserProductXML.setUserProductToBeExecuted(alterUserProductXMLDTO.getUserProductToBeExecuted());
						alterUserProductXML.setExcludedMeaning(alterUserProductXMLDTO.getExcludedMeaning());
						alterUserProductXML.setPrice(alterUserProductXMLDTO.getPrice());
						daoManager.getProductDao().updateAlterUserProductXML(alterUserProductXML);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public void updateAlterProductXML(final AlterProductXMLDTO alterProductXMLDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						AlterProductXML alterProductXML = new AlterProductXML();
						alterProductXML.setProductId(alterProductXMLDTO.getProductId());
						alterProductXML.setBrandId(alterProductXMLDTO.getBrandId());
						alterProductXML.setCategoryId(alterProductXMLDTO.getCategoryId());
						alterProductXML.setTypeId(alterProductXMLDTO.getTypeId());
						alterProductXML.setImageId(alterProductXMLDTO.getImageId());
						alterProductXML.setStatusId(alterProductXMLDTO.getStatusId());
						alterProductXML.setNameEn(alterProductXMLDTO.getNameEn());
						alterProductXML.setNameFr(alterProductXMLDTO.getNameFr());
						alterProductXML.setDescriptionEn(alterProductXMLDTO.getDescriptionEn());
						alterProductXML.setDescriptionFr(alterProductXMLDTO.getDescriptionFr());
						alterProductXML.setSpecificationEn(alterProductXMLDTO.getSpecificationEn());
						alterProductXML.setSpecificationFr(alterProductXMLDTO.getSpecificationFr());
						alterProductXML.setOtherEn(alterProductXMLDTO.getOtherEn());
						alterProductXML.setOtherFr(alterProductXMLDTO.getOtherFr());
						alterProductXML.setWarrantyEn(alterProductXMLDTO.getWarrantyEn());
						alterProductXML.setWarrantyFr(alterProductXMLDTO.getWarrantyFr());
						alterProductXML.setDimensions(alterProductXMLDTO.getDimensions());
						alterProductXML.setWeight(alterProductXMLDTO.getWeight());
						alterProductXML.setModelNumber(alterProductXMLDTO.getModelNumber());
						alterProductXML.setMsrp(alterProductXMLDTO.getMsrp());
						alterProductXML.setShipping(alterProductXMLDTO.getShipping());
						alterProductXML.setShipment(alterProductXMLDTO.getShipment());
						alterProductXML.setProductToBeExecuted(alterProductXMLDTO.getProductToBeExecuted());
						daoManager.getProductDao().updateAlterProductXML(alterProductXML);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
	}	
	
	@Override
	public Long createAlterUserProductXML(final AlterUserProductXMLDTO alterUserProductXMLDTO) throws ServiceException {
		AlterUserProductXML alterUserProductXMLResult = new AlterUserProductXML();
		try {
			daoManager.setCommitTransaction(true);
			alterUserProductXMLResult = (AlterUserProductXML) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					AlterUserProductXML alterUserProductXML = new AlterUserProductXML();
					alterUserProductXML.setUserId(alterUserProductXMLDTO.getUserId());
					alterUserProductXML.setProductId(alterUserProductXMLDTO.getProductId());
					alterUserProductXML.setPriceDiscount(alterUserProductXMLDTO.getPriceDiscount());
					alterUserProductXML.setExcluded(alterUserProductXMLDTO.getExcluded());
					alterUserProductXML.setShipping(alterUserProductXMLDTO.getShipping());
					alterUserProductXML.setUserProductToBeExecuted(alterUserProductXMLDTO.getUserProductToBeExecuted());
					alterUserProductXML.setExcludedMeaning(alterUserProductXMLDTO.getExcludedMeaning());
					alterUserProductXML.setPrice(alterUserProductXMLDTO.getPrice());
					daoManager.getProductDao().insertAlterUserProductXML(alterUserProductXML);
					return alterUserProductXML;
				}
			});
			return alterUserProductXMLResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}

	@Override
	public Long createAlterProductXML(final AlterProductXMLDTO alterProductXMLDTO) throws ServiceException {
		AlterProductXML alterProductXMLResult = new AlterProductXML();
		try {
			daoManager.setCommitTransaction(true);
			alterProductXMLResult = (AlterProductXML) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					AlterProductXML alterProductXML = new AlterProductXML();
					alterProductXML.setProductId(alterProductXMLDTO.getProductId());
					alterProductXML.setBrandId(alterProductXMLDTO.getBrandId());
					alterProductXML.setCategoryId(alterProductXMLDTO.getCategoryId());
					alterProductXML.setTypeId(alterProductXMLDTO.getTypeId());
					alterProductXML.setImageId(alterProductXMLDTO.getImageId());
					alterProductXML.setStatusId(alterProductXMLDTO.getStatusId());
					alterProductXML.setNameEn(alterProductXMLDTO.getNameEn());
					alterProductXML.setNameFr(alterProductXMLDTO.getNameFr());
					alterProductXML.setDescriptionEn(alterProductXMLDTO.getDescriptionEn());
					alterProductXML.setDescriptionFr(alterProductXMLDTO.getDescriptionFr());
					alterProductXML.setSpecificationEn(alterProductXMLDTO.getSpecificationEn());
					alterProductXML.setSpecificationFr(alterProductXMLDTO.getSpecificationFr());
					alterProductXML.setOtherEn(alterProductXMLDTO.getOtherEn());
					alterProductXML.setOtherFr(alterProductXMLDTO.getOtherFr());
					alterProductXML.setWarrantyEn(alterProductXMLDTO.getWarrantyEn());
					alterProductXML.setWarrantyFr(alterProductXMLDTO.getWarrantyFr());
					alterProductXML.setDimensions(alterProductXMLDTO.getDimensions());
					alterProductXML.setWeight(alterProductXMLDTO.getWeight());
					alterProductXML.setModelNumber(alterProductXMLDTO.getModelNumber());
					alterProductXML.setMsrp(alterProductXMLDTO.getMsrp());
					alterProductXML.setShipping(alterProductXMLDTO.getShipping());
					alterProductXML.setShipment(alterProductXMLDTO.getShipment());
					alterProductXML.setProductToBeExecuted(alterProductXMLDTO.getProductToBeExecuted());
					daoManager.getProductDao().insertAlterProductXML(alterProductXML);
					return alterProductXML;
				}
			});
			return alterProductXMLResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductsAsOfConsideredForXML() throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getProductsAsOfConsideredForXML();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
		
	@Override
	public AlterUserProductXMLDTO getAlterUserProductXML(final Long userId, final Long productId) throws ServiceException {
		AlterUserProductXML alterUserProductXMLResult = new AlterUserProductXML();
		try {			
			daoManager.setCommitTransaction(true);
			alterUserProductXMLResult = (AlterUserProductXML) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setUserId(userId);
					select.setProductId(productId);
					return daoManager.getProductDao().getAlterUserProductXMLByProductIdAndUserId(select);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getAlterUserProductXML(alterUserProductXMLResult));
	}
	
	@Override
	public AlterProductXMLDTO getAlterProductXML(final Long productId) throws ServiceException {
		AlterProductXML alterProductXMLResult = new AlterProductXML();
		try {			
			daoManager.setCommitTransaction(true);
			alterProductXMLResult = (AlterProductXML) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					return daoManager.getProductDao().getAlterProductXMLByProductId(select);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getAlterProductXML(alterProductXMLResult));
	}
	
	@Override
	public void closeProductConsideredForXML(final Long productId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
						Select select = new Select();
						select.setProductId(productId);
						daoManager.getProductDao().closeProductConsideredForXML(select);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}

	@Override
	public void closeAlterProductXML(final Long productId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
						Select select = new Select();
						select.setProductId(productId);
						daoManager.getProductDao().closeAlterProductXML(select);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}

	@Override
	public void closeAlterUserProductXML(final Long userId, final Long productId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
						Select select = new Select();
						select.setUserId(userId);
						select.setProductId(productId);
						daoManager.getProductDao().closeAlterUserProductXML(select);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getWereWgtDimChangedFromProduct() throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getWereWgtDimChangedFromProduct();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	@Override
	public void closeProductWereWgtDimChanged(final Long productId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
				throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					daoManager.getProductDao().closeProductWereWgtDimChanged(select);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public Boolean existsShippingCity(final Long productId, final Long cityId) throws ServiceException {
		return (getShippingCity(productId, cityId) != null);
	}
	
	@Override
	public ShippingProvinceDTO getShippingProvince(final Long productId, final Long provinceId) throws ServiceException {
		ShippingProvince shippingProvinceResult = new ShippingProvince();
		try {
			daoManager.setCommitTransaction(true);
			shippingProvinceResult = (ShippingProvince) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					select.setProvinceId(provinceId);
					return daoManager.getProductDao().getShippingProvince(select);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingProvinceDTO(shippingProvinceResult));
	}
	
	@Override
	public Boolean existsShippingProvince(final Long productId, final Long provinceId) throws ServiceException {
		ShippingProvinceDTO shippingProvinceDTO = getShippingProvince(productId, provinceId);
		return (shippingProvinceDTO != null);
	}

	@Override
	public ShippingTotalDTO getShippingTotal(final Long productId, final Long provinceId, final Long userId) throws ServiceException {
		ShippingTotal shippingTotalResult = new ShippingTotal();
		try {			
			daoManager.setCommitTransaction(true);
			shippingTotalResult = (ShippingTotal) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					select.setProvinceId(provinceId);
					select.setUserId(userId);
					return daoManager.getProductDao().getShippingTotal(select);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getShippingTotalDTO(shippingTotalResult));
	}
	
	@Override
	public Boolean existsShippingTotal(final Long productId, final Long provinceId, final Long userId) throws ServiceException {
		ShippingTotalDTO shippingTotalDTO = getShippingTotal(productId, provinceId, userId);
		return (shippingTotalDTO != null);
	}
	
	@Override
	public void saveOldImageIdBeforeUpdate(final Long productId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
				throws DaoException {
					Select select = new Select();
					select.setProductId(productId);
					daoManager.getProductDao().saveOldImageIdBeforeUpdate(select);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductBetween(final Long lower, final Long upper) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					List<Product> productListing = new ArrayList<Product>();					
					Select select = new Select();
					select.setLower(lower);
					select.setUpper(upper);				
					productListing = daoManager.getProductDao().getProductBetween(select);
					return productListing;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	@SuppressWarnings("unchecked")	
	@Override	
	public List<Long> getShippingRepeats(final ProductDTO productDTO) throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
					throws DaoException {
						Product product = new Product();
						product.setId(productDTO.getId());
						product.setWeight(productDTO.getWeight());
						product.setLength(productDTO.getLarge());
						product.setWidth(productDTO.getWidth());
						product.setHeight(productDTO.getHigh());
						return daoManager.getProductDao().getShippingRepeats(product);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getProductDTOLightList(productList));			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getWereWgtDimChanged() throws ServiceException {
		List<Product> productList = new ArrayList<Product>();
		try {
			daoManager.setCommitTransaction(true);
			productList = (List<Product>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {
					return daoManager.getProductDao().getWereWgtDimChanged();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOLightList(productList));	
	}

	@Override
	public boolean excludeProductsByBrandAndUser(final Long brandId, final Long userId,final Boolean exclude)
				   throws ServiceException {
		boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().excludeProductsByBrandAndUser(brandId, userId,exclude);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public boolean isUserBrandExcluded(final Long brandId, final Long userId)throws ServiceException {
		
		Boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().isUserBrandExcluded(brandId, userId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@Override
	public boolean generatProfitByBrand(final Long brandId, final Long userId, final String percentProfit)
			throws ServiceException {
		boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().generatProfitByBrand(brandId, userId, percentProfit);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@Override
	public boolean generatProfitByCategory(final Long categoryId, final Long userId, final String percentProfit)
			throws ServiceException {
		boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().generatProfitByCategory(categoryId, userId,percentProfit);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@Override
	public Long nbProductActiveByBrand(final Long brandId, final Long userId)
			throws ServiceException {
		Long result=1L;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().nbProductActiveByBrand(brandId, userId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getAllProdcutAnyStatus() throws ServiceException{
		
		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getAllProdcutAnyStatus();
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	@Override
	public void transferToUser(final Long from, final Long to) throws ServiceException {	
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
						
						Select selectFrom = new Select();
						selectFrom.setFrom(from);
						selectFrom.setTo(to);
						selectFrom.setUserId(from);					
						Select selectToUserProvincePopulation = new Select();
						selectToUserProvincePopulation.setFrom(from);
						selectToUserProvincePopulation.setTo(to);
						selectToUserProvincePopulation.setUserId(to);				
						List<UserProvincePopulation> userProvincePopulationListFrom = daoManager.getProductDao().getUserProvincePopulationByUserId(selectFrom);
						UserProvincePopulation userProvincePopulationTo = null;
						if (userProvincePopulationListFrom != null && userProvincePopulationListFrom.size() > 0) {
							for (UserProvincePopulation userProvincePopulationFrom : userProvincePopulationListFrom) { 
								if (userProvincePopulationFrom != null) {									
									selectToUserProvincePopulation.setProvinceId(userProvincePopulationFrom.getProvinceId());									
									userProvincePopulationTo = daoManager.getProductDao().getUserProvincePopulation(selectToUserProvincePopulation);									
									userProvincePopulationFrom.setUserId(to);							
									if (userProvincePopulationTo != null) {
										userProvincePopulationFrom.setId(userProvincePopulationTo.getId());
										daoManager.getProductDao().updateUserProvincePopulation(userProvincePopulationFrom);
									} else {
										daoManager.getProductDao().insertUserProvincePopulation(userProvincePopulationFrom);																			
									}
								}
							}
						}
						userProvincePopulationListFrom = null;
						userProvincePopulationTo = null;												
						Select selectToShippingTotal = new Select();
						selectToShippingTotal.setFrom(from);
						selectToShippingTotal.setTo(to);
						selectToShippingTotal.setUserId(to);						
						List<ShippingTotal> shippingTotalListFrom = daoManager.getProductDao().getShippingTotalListByUserId(selectFrom);						
						ShippingTotal shippingTotalTo = null;						
						if (shippingTotalListFrom != null && shippingTotalListFrom.size() > 0) {
							for (ShippingTotal shippingTotalFrom : shippingTotalListFrom) {
								if (shippingTotalFrom != null) {								
									selectToShippingTotal.setProductId(shippingTotalFrom.getProductId());
									selectToShippingTotal.setProvinceId(shippingTotalFrom.getProvinceId());									
									shippingTotalTo = daoManager.getProductDao().getShippingTotal(selectToShippingTotal);
									shippingTotalFrom.setUserId(to);
									if (shippingTotalTo != null) {
										shippingTotalFrom.setId(shippingTotalTo.getId());
										daoManager.getProductDao().updateShippingTotal(shippingTotalFrom);
									} else {
										daoManager.getProductDao().insertShippingTotal(shippingTotalFrom);
									}
								}
							}
						}
						shippingTotalListFrom = null;
						shippingTotalTo = null;
						Select selectToUserProductPrice = new Select();
						selectToUserProductPrice.setFrom(from);
						selectToUserProductPrice.setTo(to);
						selectToUserProductPrice.setUserId(to);			
						List<UserProductPrice> userProductPriceListFrom = daoManager.getProductDao().getUserProductPriceByUserId(selectFrom);
						UserProductPrice userProductPriceTo = null;						
						if (userProductPriceListFrom != null && userProductPriceListFrom.size() > 0) {
							for (UserProductPrice userProductPriceFrom : userProductPriceListFrom) { 
								if (userProductPriceFrom != null) {									
									selectToUserProductPrice.setProductId(userProductPriceFrom.getProductId());
									userProductPriceTo = daoManager.getProductDao().getUserProductPrice(selectToUserProductPrice);
									userProductPriceFrom.setUserId(to);
									if (userProductPriceTo != null) {
										userProductPriceFrom.setId(userProductPriceTo.getId());
										daoManager.getProductDao().updateUserProductPrice(userProductPriceFrom);
									} else {
										daoManager.getProductDao().insertUserProductPriceShipping(userProductPriceFrom);
									}
								}
							}
						}
						userProductPriceListFrom = null;
						userProductPriceTo = null;
						selectFrom = null;
						selectToUserProvincePopulation = null;
						selectToShippingTotal = null;
						selectToUserProductPrice = null;						
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}		
	}
/*
	@Override
	public void transferToUserByCreationDate(final Long from, final Long to, final Date updateDate) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
						
						Select selectFrom = new Select();
						selectFrom.setFrom(from);
						selectFrom.setTo(to);
						selectFrom.setUserId(from);
						selectFrom.setUpdateDate(updateDate);
						
						Select selectToShippingTotal = new Select();
						selectToShippingTotal.setFrom(from);
						selectToShippingTotal.setTo(to);
						selectToShippingTotal.setUserId(to);
						List<ShippingTotal> shippingTotalListFrom = daoManager.getProductDao().getShippingTotalListByUserId(selectFrom);					
						ShippingTotal shippingTotalTo = null;						
						if (shippingTotalListFrom != null && shippingTotalListFrom.size() > 0) {
							for (ShippingTotal shippingTotalFrom : shippingTotalListFrom) {
								if (shippingTotalFrom != null) {								
									selectToShippingTotal.setProductId(shippingTotalFrom.getProductId());
									selectToShippingTotal.setProvinceId(shippingTotalFrom.getProvinceId());									
									shippingTotalTo = daoManager.getProductDao().getShippingTotal(selectToShippingTotal);
									shippingTotalFrom.setUserId(to);
									if (shippingTotalTo != null) {
										shippingTotalFrom.setId(shippingTotalTo.getId());
										daoManager.getProductDao().updateShippingTotal(shippingTotalFrom);
									} else {
										daoManager.getProductDao().insertShippingTotal(shippingTotalFrom);
									}
								}
							}
						}
						
						shippingTotalListFrom = null;
						shippingTotalTo = null;
						Select selectToUserProductPrice = new Select();
						selectToUserProductPrice.setFrom(from);
						selectToUserProductPrice.setTo(to);
						selectToUserProductPrice.setUserId(to);
						List<UserProductPrice> userProductPriceListFrom = daoManager.getProductDao().getUserProductPriceByUserId(selectFrom);
						UserProductPrice userProductPriceTo = null;						
						if (userProductPriceListFrom != null && userProductPriceListFrom.size() > 0) {
							for (UserProductPrice userProductPriceFrom : userProductPriceListFrom) { 
								if (userProductPriceFrom != null) {									
									selectToUserProductPrice.setProductId(userProductPriceFrom.getProductId());
									userProductPriceTo = daoManager.getProductDao().getUserProductPrice(selectToUserProductPrice);
									userProductPriceFrom.setUserId(to);
									if (userProductPriceTo != null) {
										userProductPriceFrom.setId(userProductPriceTo.getId());
										daoManager.getProductDao().updateUserProductPrice(userProductPriceFrom);
									} else {
										daoManager.getProductDao().insertUserProductPriceShipping(userProductPriceFrom);
									}
								}
							}
						}
						
						userProductPriceListFrom = null;
						userProductPriceTo = null;
						selectFrom = null;
						selectToShippingTotal = null;
						selectToUserProductPrice = null;						
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	*/

	@Override
	public void transferToUserByCreationDate(final Long from, final Long to,final Long managerId,final Date updateDate) throws ServiceException {

		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().transferToUserByCreationDate(from,to,managerId,updateDate);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}

	}
	

	@Override
	public void transferSQLtheUserToNewTemplate(final Long from, final Long to) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager)
							throws DaoException {
						Select select = new Select();
						select.setFrom(from);
						select.setTo(to);
						daoManager.getProductDao().transferUserOnProfile(select);
						daoManager.getProductDao().transferUserOnUserProvincePopulation(select);
						daoManager.getProductDao().transferUserOnShippingTotal(select);
						daoManager.getProductDao().transferUserOnUserProductPrice(select);
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}


	@Override
	public Long isGroupProductID(final Long productId) throws ServiceException {
		Long count= 0L; 
		try{
			daoManager.setCommitTransaction(true);
			count = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().isGroupProductID(productId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}		
	
	/**----------------------------------------------------------
	 *CREATE XLS FILE FROM THE LIST PRODUCT CLASSIFICATION*
	  -----------------------------------------------------------*/
	@Override
	public void generateAdminXLS(List<ProductDTO> ProductListDTO,String productAdminDataFolder){
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		//COLUMNS NUMBER
		final int COL_PRODUCT_ID=1;
		final int COL_LS_PRODUCT_ID=2;
		final int COL_CATEGORY_NAME=3;
		final int COL_BRAND_NAME=4;
		final int COL_MSRP=5;
		final int COL_OUT_COST=6;
		final int COL_PRICE=7;
		final int COL_PROFIT=8;
		final int COL_DISCOUNT=9;
		final int COL_QT_3MONTHS=10;
		final int COL_CLASSIFICATION=11;
		final int COL_TITLE=12;
		//COLUMNS Data
		Long PRODUCT_ID=null;
		String LS_PRODUCT_ID;
		String CATEGORY_NAME;
		String BRAND_NAME;
		String MSRP;
		String OUT_COST;
		String PRICE;
		Double PROFIT;
		Double DISCOUNT;
		Double QT_3MONTHS;
		Double CLASSIFICATION;
		String TITLE="";
		int row = 0;
		try {
			File OldProductClassificat=new File(productAdminDataFolder+"productClassificat.xls");
			if(OldProductClassificat.exists())OldProductClassificat.delete();
			Workbook existingWorkbook = Workbook.getWorkbook(new File(productAdminDataFolder+"productClassificatTemplate.xls"));
			WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(productAdminDataFolder+"productClassificat.xls"), existingWorkbook);
			WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);

			int heightInPoints = 27*27;

			// Create cell font and format
			WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);

			WritableCellFormat cellFormatNormal = new WritableCellFormat(cellFont);
			//cellFormatOrange.setBackground(Colour.ORANGE);
			cellFormatNormal.setBackground(Colour.LIGHT_TURQUOISE);
			cellFormatNormal.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatNormal.setAlignment(Alignment.CENTRE);
			cellFormatNormal.setWrap(true);
			cellFormatNormal.setBorder(Border.ALL, BorderLineStyle.THIN);

			//WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatWhite = new WritableCellFormat(cellFont);
			cellFormatWhite.setBackground(Colour.WHITE);
			cellFormatWhite.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhite.setAlignment(Alignment.CENTRE);
			cellFormatWhite.setWrap(true);
			cellFormatWhite.setBorder(Border.ALL, BorderLineStyle.THIN);
			WritableCellFormat cellFormat=null;
			
			//CellS
			WritableCell cellPRODUCT_ID=null;
			WritableCell cellLS_PRODUCT_ID=null;
			WritableCell cellCATEGORY_NAME=null;
			WritableCell cellBRAND_NAME=null;
			WritableCell cellMSRP=null;
			WritableCell cellOUT_COST=null;
			WritableCell cellPRICE=null;
			WritableCell cellPROFIT=null;
			WritableCell cellDISCOUNT=null;
			WritableCell cellCLASSIFICATION=null;
			WritableCell cellTITLE=null;
			WritableCell cellQT_3MONTHS=null;
			
			//LABELS
			Label labelPRODUCT_ID=null;
			Label labelLS_PRODUCT_ID=null;
			Label labelCATEGORY_NAME=null;
			Label labelBRAND_NAME=null;
			Label labelMSRP=null;
			Label labelOUT_COST=null;
			Label labelPRICE=null;
			Label labelPROFIT=null;
			Label labelDISCOUNT=null;
			Label labelQT_3MONTHS=null;
			Label labelCLASSIFICATION=null;
			Label labelTITLE=null;

			//START FROM ROW_TO_BEGIN
			row = ROW_TO_BEGIN;
			int orderIndex=0;
			int pair=0;
			for (ProductDTO productDTO : ProductListDTO) {

				orderIndex++;
				pair=orderIndex%2;
				switch (pair) {
				case 0:
					cellFormat=cellFormatWhite;
					break;
				case 1:
					cellFormat=cellFormatNormal;
					break;
				}

				PRODUCT_ID=null;
				LS_PRODUCT_ID="";
				CATEGORY_NAME="";
				BRAND_NAME="";
				MSRP="";
				OUT_COST="";
				PRICE="";
				PROFIT=0D;
				DISCOUNT=0D;
				QT_3MONTHS=0D;
				CLASSIFICATION=0D;
				TITLE="";

				//1:  COL_PRODUCT_ID
				PRODUCT_ID = productDTO.getId();
				labelPRODUCT_ID = new Label(COL_PRODUCT_ID-1, row, PRODUCT_ID.toString(),cellFormat);
				cellPRODUCT_ID = (WritableCell) labelPRODUCT_ID;
				sheetToEdit.addCell(cellPRODUCT_ID);
				
				//2:  COL_LS_PRODUCT_ID
				if (productDTO.getLoyaltyProductId() != null)LS_PRODUCT_ID = productDTO.getLoyaltyProductId();
				labelLS_PRODUCT_ID = new Label(COL_LS_PRODUCT_ID-1, row, LS_PRODUCT_ID,cellFormat);
				cellLS_PRODUCT_ID = (WritableCell) labelLS_PRODUCT_ID;
				sheetToEdit.addCell(cellLS_PRODUCT_ID);
				
				//3:  COL_CATEGORY_NAME
				if (productDTO.getCategory()!=null && productDTO.getCategory().getName() != null)CATEGORY_NAME = productDTO.getCategory().getName();
				labelCATEGORY_NAME = new Label(COL_CATEGORY_NAME-1, row, CATEGORY_NAME,cellFormat);
				cellCATEGORY_NAME = (WritableCell) labelCATEGORY_NAME;
				sheetToEdit.addCell(cellCATEGORY_NAME);

				//4:  COL_BRAND_NAME
				if (productDTO.getBrand()!=null && productDTO.getBrand().getName() != null)BRAND_NAME = productDTO.getBrand().getName();
				labelBRAND_NAME = new Label(COL_BRAND_NAME-1, row, BRAND_NAME,cellFormat);
				cellBRAND_NAME = (WritableCell) labelBRAND_NAME;
				sheetToEdit.addCell(cellBRAND_NAME);

				//5:  COL_MSRP
				if (productDTO.getMsrp() != null)MSRP = productDTO.getMsrp();
				labelMSRP= new Label(COL_MSRP-1, row, MSRP,cellFormat);
				cellMSRP = (WritableCell) labelMSRP;
				sheetToEdit.addCell(cellMSRP);

				//6:  COL_OUT_COST
				if (productDTO.getCost() != null)OUT_COST = productDTO.getCost();
				labelOUT_COST= new Label(COL_OUT_COST-1, row, OUT_COST,cellFormat);
				cellOUT_COST = (WritableCell) labelOUT_COST;
				sheetToEdit.addCell(cellOUT_COST);
				
				//7:  COL_PRICE
				if (productDTO.getPriceProduct() != null)PRICE = productDTO.getPriceProduct();
				labelPRICE= new Label(COL_PRICE-1, row, PRICE,cellFormat);
				cellPRICE = (WritableCell) labelPRICE;
				sheetToEdit.addCell(cellPRICE);
				
				//8:  COL_PROFIT
				if (productDTO.getProfit() != null)PROFIT = productDTO.getProfit();
				labelPROFIT= new Label(COL_PROFIT-1, row, PROFIT.toString()+"%",cellFormat);
				cellPROFIT = (WritableCell) labelPROFIT;
				sheetToEdit.addCell(cellPROFIT);

				//9:  COL_DISCOUNT
				if (productDTO.getDiscount() != null)DISCOUNT = productDTO.getDiscount();
				labelDISCOUNT= new Label(COL_DISCOUNT-1, row, DISCOUNT.toString(),cellFormat);
				cellDISCOUNT = (WritableCell) labelDISCOUNT;
				sheetToEdit.addCell(cellDISCOUNT);
				
				//10:COL_QT_3MONTHS
				if (productDTO.getQtSold() != null)QT_3MONTHS = (double) Math.round(productDTO.getQtSold() * 100) / 100;;
				labelQT_3MONTHS= new Label(COL_QT_3MONTHS-1, row, QT_3MONTHS.toString(),cellFormat);
				cellQT_3MONTHS = (WritableCell) labelQT_3MONTHS;
				sheetToEdit.addCell(cellQT_3MONTHS);
				
				//11:  COL_CLASSIFICATION
				if (productDTO.getClassification() != null)CLASSIFICATION = (double) Math.round(productDTO.getClassification() * 100) / 100;;
				labelCLASSIFICATION= new Label(COL_CLASSIFICATION-1, row, CLASSIFICATION.toString(),cellFormat);
				cellCLASSIFICATION = (WritableCell) labelCLASSIFICATION;
				sheetToEdit.addCell(cellCLASSIFICATION);
				
				//12: COL_TITLE
				if (productDTO.getDescriptiProduct()!= null)TITLE = productDTO.getDescriptiProduct();
				labelTITLE= new Label(COL_TITLE-1, row, TITLE,cellFormat);
				cellTITLE = (WritableCell) labelTITLE;
				sheetToEdit.addCell(cellTITLE);
				//change height row 32px
				sheetToEdit.setRowView(row,heightInPoints);
				++row;
			}
			workbookCopy.write();
			workbookCopy.close();
			existingWorkbook.close();

		} catch (Exception x) {
			x.printStackTrace();
		}
	}
	
	
	/**----------------------------------------------------------
	 * getBoxByProductId*
	  -----------------------------------------------------------*/
	@Override
	public BoxDTO getBoxByProductId(final Long productId)
			throws ServiceException {
		Box boxResult = new Box();
		try {
			daoManager.setCommitTransaction(true);
			boxResult = (Box) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Box box = new Box();
					box = daoManager.getProductDao().getBoxByProductId(productId);
					return box;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getBoxDTO(boxResult));
	}
	

	
	/**----------------------------------------------------------
	 * insertBoxAndProductBox*
	  -----------------------------------------------------------*/	
		@Override
	public Long insertBoxAndProductBox(final BoxDTO boxDTO)
			throws ServiceException {
		Box boxResult = new Box();
		try {
			daoManager.setCommitTransaction(true);
			boxResult = (Box) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {

					Box box = new Box();
					box.setProductId(boxDTO.getProductId());
					box.setLength(boxDTO.getLength());
					box.setWidth(boxDTO.getWidth());
					box.setHeight(boxDTO.getHeight());
					box.setTotalWeight(boxDTO.getTotalWeight());
					box.setStatusId(boxDTO.getStatusId());

					daoManager.getProductDao().insertBoxAndProductBox(box);

					return box;
				}
			});
			return (boxResult.getId());

		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
		
	/**----------------------------------------------------------
	 *updateProductBox*
	  -----------------------------------------------------------*/	
		@Override
	public void updateProductBox(final BoxDTO boxDTO)
			throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {

					Box box = new Box();
					box.setId(boxDTO.getId());
					box.setProductId(boxDTO.getProductId());
					box.setLength(boxDTO.getLength());
					box.setWidth(boxDTO.getWidth());
					box.setHeight(boxDTO.getHeight());
					box.setTotalWeight(boxDTO.getTotalWeight());
					box.setCreationDate(boxDTO.getCreationDate());
					box.setStatusId(boxDTO.getStatusId());

					daoManager.getProductDao().updateProductBox(box);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
			
	/**----------------------------------------------------------
	 *updateProductBoxIfCpNotVerified*
	  -----------------------------------------------------------*/	
	@Override
	public void updateProductBoxIfCpNotVerified(final BoxDTO boxDTO)
			throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {

					Box box = new Box();
					box.setId(boxDTO.getId());
					box.setProductId(boxDTO.getProductId());
					box.setLength(boxDTO.getLength());
					box.setWidth(boxDTO.getWidth());
					box.setHeight(boxDTO.getHeight());
					box.setTotalWeight(boxDTO.getTotalWeight());
					box.setCreationDate(boxDTO.getCreationDate());
					box.setStatusId(boxDTO.getStatusId());

					daoManager.getProductDao().updateProductBoxIfCpNotVerified(box);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	
	/**----------------------------------------------------------
	 *UPDATE TABLE STOCK IN DATABASES FROM XLS FILE*
	  -----------------------------------------------------------*/
	@Override
	public List<ProductDTO> listStockFromXLS(String userAdminLogin,String destFileStockXLS)throws Exception{
		String errorReport="";
		//variable indicating the numbers of columns in the XLS file
		int ROW_TO_START = 1;
		final int COL_LS_PRODUCT_ID=1;
		final int COL_STOCK=2;

		String  strSTOCK="";

		//Values of cells
		String  LS_PRODUCT_ID="";
		Double STOCK = null;

		//Cells
		Cell cellLS_PRODUCT_ID= null;
		Cell cellSTOCK= null;
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destFileStockXLS+"stock.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		List<ProductDTO> listStock = new ArrayList<ProductDTO>() ;
		ProductDTO productDTO;
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {

			//--------------- 1: LS_PRODUCT_ID
			cellLS_PRODUCT_ID = sheetToRead.getCell(COL_LS_PRODUCT_ID-1, row);			
			if(cellLS_PRODUCT_ID!=null)LS_PRODUCT_ID = cellLS_PRODUCT_ID.getContents();
			if(LS_PRODUCT_ID==null || LS_PRODUCT_ID.equals("")){
				errorReport+=" "+(row+1)+" ,LS_PRODUCT_ID:"+LS_PRODUCT_ID+" ,|---->dosen't exist \n";
			}else{
				int index=LS_PRODUCT_ID.indexOf("/");
				if(index>0)LS_PRODUCT_ID=LS_PRODUCT_ID.substring(0, index);

			}
			//--------------- 2:STOCK
			cellSTOCK = sheetToRead.getCell(COL_STOCK-1, row);			
			if(cellSTOCK!=null){
				strSTOCK = cellSTOCK.getContents();
				strSTOCK=strSTOCK.replaceAll(" ", "");
				if(strSTOCK!=null && !strSTOCK.equals("")){
					int index=strSTOCK.indexOf(",");
					if(index>=0){
						String strSTOCK1=strSTOCK.substring(0, index);
						String strSTOCK2= strSTOCK.substring(index+1, strSTOCK.length());
						strSTOCK=strSTOCK1+"."+strSTOCK2;
					}
				}else errorReport+=" "+(row+1)+" ,STOCK:"+strSTOCK+" ,|---->is null \n";
				STOCK=null;
				try {
					STOCK = Double.parseDouble(strSTOCK);
				}
				catch (Exception pe) {
					STOCK=null;
				}
			}
			if((LS_PRODUCT_ID==null ||LS_PRODUCT_ID.equals("")&&(strSTOCK==null ||strSTOCK.equals("")))){
				break;
			}
			if(LS_PRODUCT_ID!=null){
				// Clean LS_PRODUCT_ID
				LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll(" SELECT ",""); 
				LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll("\\s","");
				LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll("\'","");
				LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll("\"","");
				LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll(";","");
				LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll(",","");
			}
			productDTO = new ProductDTO();
			productDTO.setLoyaltyProductId(LS_PRODUCT_ID);
			productDTO.setStock(STOCK);
			listStock.add(productDTO);

		}
		return listStock;

	}

	// Update Stock
	@Override
	public boolean updateStock(final List<ProductDTO> listStock) throws ServiceException {
		boolean result=false;
		final List<Product>listProduct=DTOFactory.getProductListFromProductListDTO(listStock);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().updateStock(listProduct);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// calculate Shipping Rate using shipping_city	
	@Override
	public boolean calculateShippingRate(final Long userId,final Long productId) throws ServiceException {
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().calculateShippingRate(userId,productId) ; 
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductDTO> getProductNotFound(List<ProductDTO>listProductDTO) throws ServiceException{
		final List <Product> productList = DTOFactory.getProductListFromProductListDTO(listProductDTO);
		List <Product> productListResult;
		try {
			daoManager.setCommitTransaction(true);
			productListResult = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getProductNotFound(productList);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductListDTOFromProductList(productListResult));
	}
	

	/**----------------------------------------------------------
	 *UPDATE STOCK IN TABLE STOCK BY LSPRODUCT*
	  -----------------------------------------------------------*/
	@Override
	public boolean updateStockByLsProductId(final ProductDTO productDTO){
		boolean result=false;
		final Product product=new Product();
		product.setLoyaltySourceProductId(productDTO.getLoyaltyProductId());
		product.setStock(productDTO.getStock());
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().updateStockByLsProductId(product);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 * getCurrencySymbols*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<CurrencyDTO> getCurrencySymbols() throws ServiceException{
		List <Currency> currencyList = new ArrayList<Currency>();
		
		try {
			daoManager.setCommitTransaction(true);
			currencyList = (List <Currency>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getCurrencySymbols();
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCurrencySymbolsDTO(currencyList));
	}
	
	/**----------------------------------------------------------
	 * getCurrenciesButNotCAD*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<CurrencyDTO> getCurrenciesButNotCAD() throws ServiceException{
		List <Currency> currencyList = new ArrayList<Currency>();
		
		try {
			daoManager.setCommitTransaction(true);
			currencyList = (List <Currency>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getCurrenciesButNotCAD();
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getCurrencySymbolsDTO(currencyList));
	}
	
	/**----------------------------------------------------------
	 * getCurrencyBySymbol*
	  -----------------------------------------------------------*/
	@Override
	public CurrencyDTO getCurrencyBySymbol(final CurrencyDTO currencyDTO) throws ServiceException {
		Currency currencyResult = new Currency();
		try {
			daoManager.setCommitTransaction(true);
			currencyResult = (Currency) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Currency currency = new Currency();
					if(currencyDTO!=null && currencyDTO.getSymbol()!=null)
						currency.setSymbol(currencyDTO.getSymbol());
					currency = daoManager.getProductDao().getCurrencyBySymbol(currency);
					return currency;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getCurrencyDTOBySymbol(currencyResult));
	}

	/**----------------------------------------------------------
	 *updateCurrency*
	  -----------------------------------------------------------*/	
	@Override
	public void updateCurrency(final CurrencyDTO currencyDTO) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {

					Currency currency = new Currency();
					currency.setId(currencyDTO.getId());
					currency.setRate(currencyDTO.getRate());
					currency.setSymbol(currencyDTO.getSymbol());
					//currency.setCreationDate(currencyDTO.getCreationDate());
					
					daoManager.getProductDao().updateCurrency(currency);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	
	/**----------------------------------------------------------
	 * calculateShippingRateForAllProducts*
	  -----------------------------------------------------------*/
	@Override
	public boolean calculateShippingRateForAllProducts(final Long userId) throws ServiceException{
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().calculateShippingRateForAllProducts(userId) ; 
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	/**----------------------------------------------------------
	 * isCurrencyExists*
	  -----------------------------------------------------------*/
	@Override
	public CurrencyDTO isCurrencyExists(final CurrencyDTO currencyDTO) throws ServiceException {
		Currency currencyResult = new Currency();
		try {
			daoManager.setCommitTransaction(true);
			currencyResult = (Currency) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					Currency currency = new Currency();
					if(currencyDTO!=null && currencyDTO.getSymbol()!=null)
						currency.setSymbol(currencyDTO.getSymbol());
					currency = daoManager.getProductDao().getCurrencyBySymbol(currency);
					return currency;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getCurrencyDTOBySymbol(currencyResult));
	}

	/**----------------------------------------------------------
	 * insertNewCurrency*
	  -----------------------------------------------------------*/
	@Override 
	public Long insertNewCurrency(final CurrencyDTO currencyDTO) throws ServiceException {
		Currency currencyResult = new Currency();
		//Long currencyId = 0L;
		try {
			daoManager.setCommitTransaction(true);
			currencyResult = (Currency) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {					
					Currency currency = new Currency();
					if(currencyDTO!=null && currencyDTO.getSymbol()!=null)
						currency.setSymbol(currencyDTO.getSymbol());
					if(currencyDTO!=null && currencyDTO.getRate()!=null)
						currency.setRate(currencyDTO.getRate());
					
					daoManager.getProductDao().insertNewCurrency(currency);					
					return currency;
				}
			});
			//return currencyResult.getId();
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return currencyResult.getId();
	}
	

	/**----------------------------------------------------------
	 				getSaleActiveByUserId
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override 
	public List<ProductDTO>getSaleActiveByUserId(final Long userId) throws ServiceException{
		
		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getSaleActiveByUserId(userId);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTOList(productList));
	}
	
	

	/**----------------------------------------------------------
	 				getSaleActiveByUserId
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override 
	public ProductDTO getSaleActiveByProductIdAndUserId(final Long productId,final Long userId) throws ServiceException{
		
		Product result;
		
		try {
			daoManager.setCommitTransaction(true);
			result = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getSaleActiveByProductIdAndUserId(productId,userId);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTO(result));
	}
	
	

	/**----------------------------------------------------------
	 				getSaleActiveByUserId
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override 
	public ProductDTO getSaleByProductId(final Long productId) throws ServiceException{
		
		Product product = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			product = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getSaleByProductId(productId);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTO(product));
	}
	

	/**----------------------------------------------------------
	 		INSERT INTO ITEM INTO product_sale and user_sale
	  -----------------------------------------------------------*/
	@Override
	public Long addProductSale(ProductDTO productDTO)throws ServiceException{ 
		final Product product=DTOFactory.getProduct(productDTO);
		Long result=1L;
		try{
			daoManager.setCommitTransaction(true);
			result = (Long)daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getProductDao().addProductSale(product);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	

	/**----------------------------------------------------------
	 		INSERT INTO ITEM INTO product_sale and user_sale
	  -----------------------------------------------------------*/
	@Override
	public void addUserSale(ProductDTO productDTO,final List<Long> usersIdListSeleted)throws ServiceException{ 
		final Product product=DTOFactory.getProduct(productDTO);
		try{
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					daoManager.getProductDao().addUserSale(product,usersIdListSeleted);
					return true;
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
	}

	

	/**----------------------------------------------------------
			isThereUserHavenThisSale
	-----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override 
	public boolean isThereUserHavenThisSale(final Long productSaleId)throws ServiceException{

		boolean result=true;

		try {
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					return daoManager.getProductDao().isThereUserHavenThisSale(productSaleId);
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return result;
	}


	

	/**----------------------------------------------------------
	 				getSaleActiveByUserId
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override 
	public ProductDTO getSaleByProductIdAndUserId(final Long productId,final Long userId) throws ServiceException{
		
		Product result;
		
		try {
			daoManager.setCommitTransaction(true);
			result = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().getSaleByProductIdAndUserId(productId,userId);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getProductDTO(result));
	}



	/**----------------------------------------------------------
	 * getCurrencySymbols*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public Boolean disableSaleWhenOutTime(final Long userId) throws ServiceException{
		Boolean result=null;
		try {
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							return daoManager.getProductDao().disableSaleWhenOutTime(userId);
						}
					});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return result;
	}
	
	public void updateUserProductPriceByProductIdAndUserIDSumit(final UserProductPriceDTO userProductPriceDTO)throws ServiceException{
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(com.loyauty.dao.core.DaoManager daoManager) throws DaoException {	
						UserProductPrice userProductPrice = new UserProductPrice();
						
						userProductPrice.setUserId(userProductPriceDTO.getUserId());				
						userProductPrice.setProductId(userProductPriceDTO.getProductId());	
						userProductPrice.setPrice(userProductPriceDTO.getPrice());
						
//						userProductPrice.setProfit(userProductPriceDTO.getProfit());
//						userProductPrice.setDiscount(userProductPriceDTO.getDiscount());
//						userProductPrice.setExcluded(userProductPriceDTO.getExcluded());					
//						userProductPrice.setPriceType(userProductPriceDTO.getPriceType());
						
						daoManager.getProductDao().updateUserProductPriceByProductIdAndUserIDSumit(userProductPrice);
						
						return null;
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
		
	}
	
	
	
	
	
}
