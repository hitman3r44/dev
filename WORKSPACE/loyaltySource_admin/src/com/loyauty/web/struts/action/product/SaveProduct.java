package com.loyauty.web.struts.action.product;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserProductStatus;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductLinkDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.io.FileUtils;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class SaveProduct extends LoyautyAction {
	
	private static final long serialVersionUID = 6769557630536779572L;
	
	private static final int RESULTS_PER_PAGE = 10;
	
	private ProductService productService;
	private CommonService commonService;
	private BrandService brandService;
	private UserService userService;
	private OperationsService operationsService;
	
	private UserSessionDTO userSession;
	@Getter @Setter
	private long brand;
	@Getter @Setter
	private String upc;
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
	private String large;
	@Getter @Setter
	private String width;
	@Getter @Setter
	private String high;
	@Getter @Setter
	private String weight;
	@Getter @Setter
	private String largeCm;
	@Getter @Setter
	private String widthCm;
	@Getter @Setter
	private String highCm;
	@Getter @Setter
	private String weightKg;
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
	private String actualWidth;
	@Getter @Setter
	private String actualHeight;
	@Getter @Setter
	private String actualLength;
	@Getter @Setter
	private String actualWeight;	
	
	//uploading files
	@Getter @Setter	
	private File productImage; 
	@Getter @Setter
	private String productImageContentType;
	@Getter @Setter
	private String productImageFileName;	
	
	@Getter @Setter
	private ImageDTO imgDTO; 
	private OperationsDTO operationDTO;
	@Getter @Setter
	private List<CommonDTO> brandList;
	
	@Getter @Setter
	private List<UserSessionDTO> userNameList;	
	@Getter @Setter
	private List<UserSessionDTO> userList;	
	
	@Getter @Setter
	private String[] userPrice;
	@Getter @Setter
	private String[] percentageProfit;
	@Getter @Setter
	private String[] percentageDiscount;
	@Getter @Setter
	private String[] isExcluded;
	@Getter @Setter
	private String[] excluded;
	
	@Getter @Setter
	private Double[] currencyRate;
	@Getter @Setter
	private String[] currencySymbol;
	@Getter @Setter
	private String[] currencyPrice;	//CURRENCY_LS_PRICE
	
	@Getter @Setter
	private String otherEng;
	@Getter @Setter
	private String otherFr;
	
	@Getter @Setter
	private String linkUrl;
	@Getter @Setter
	private String note;
	
	@Getter @Setter
	private Integer status;
	@Getter @Setter
	private String statusName;
	
	@Getter @Setter
	private Date discontinuedStartDate;	
	@Getter @Setter
	private String loyaltyProductIdSub;
	
	@Getter @Setter
	private String periodTime;
	@Getter @Setter
	private String warrantyQuantity;
	@Getter @Setter
	private Boolean defectFree;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	
	public SaveProduct () throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		commonService = getServiceLocator().getCommonService();
		brandService = getServiceLocator().getBrandService();
		userService = getServiceLocator().getUserService();
		operationsService=getServiceLocator().getOperationsService();
		boxDTO=new BoxDTO();
	}
	
	@Override
	public void prepare() throws ServiceException {		
		brandList = commonService.getBrands();
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		basicUserDTO.setTypeId(UserType.USER.getValue());
		basicUserDTO.setActive(true);
		userNameList = userService.getAllUserAccounts(basicUserDTO);
		userList = userNameList;
		listClientCategory = userService.getAllClientCategory();
		long userId = 0L;
		String login = "";
		int typeId = 2;
		int langId = 2;
		String email="";
		String code="";
		boolean active = true;
		Long template =1L;
		UserSessionDTO userSessionDTO = null;

		for (ClientCategoryDTO ccDTO : listClientCategory) {
			userId = ccDTO.getClientCategoryId();
			login = ccDTO.getClientCategoryName();
			userSessionDTO = new UserSessionDTO(userId, login, typeId, langId, Language.ENGLISH.getValue(),
												RESULTS_PER_PAGE, email, code, active, template);
			userNameList.add(userSessionDTO);
		}
	}
	
	@Override
	public void validate() {
		
		if(brand < 0)
			addActionError(getText("loyauty.error.common.brand_required"));
		if(category < 0)
			addActionError(getText("loyauty.error.common.category_required"));
		/*if(mainSpecification < 0)
			addActionError(getText("loyauty.error.common.type_spec_required"));*/
		if(manufProductID.trim().length() == 0)
			addActionError(getText("loyauty.error.common.manufacture_required"));
		
		if(loyaltyProductId.trim().length() == 0) {
			addActionError(getText("loyauty.error.common.productId_required"));
		} else {	
			try {
				ProductDTO aProductDTO = productService.getProductIdFromLSProductId(loyaltyProductId);
				if (aProductDTO != null) {
					addActionError(getText("loyauty.error.common.productId_alreadyExists"));
				}
				if(!loyaltyProductId.trim().startsWith(brandService.getBrand(brand).getCode()))
				{
					addActionError(getText("loyauty.error.common.productId_code"));
				}
			} catch (ServiceException sx) {
				addActionError(getText("loyauty.error.common.service"));
			}			
		}
			
		if(nameEn.trim().length() == 0)
			addActionError(getText("loyauty.error.common.name_en_required"));
		if(nameFr.trim().length() == 0)
			addActionError(getText("loyauty.error.common.name_fr_required"));
				
		if(msrp.trim().length() == 0 || msrp.equals("NaN"))
			addActionError(getText("loyauty.error.common.msrp_required"));
		if(cost.trim().length() == 0 || cost.equals("NaN"))
			addActionError(getText("loyauty.error.common.cost_required"));
		
		
		/*if(descriptionEn.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_en_required"));
		if(descriptionFr.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_fr_required"));
		if(specificationEn.trim().length() == 0)
			addActionError(getText("loyauty.error.common.specification_en_required"));
		if(specificationFr.trim().length() == 0)
			addActionError(getText("loyauty.error.common.specification_fr_required"));
		if(width == 0)
			addActionError(getText("loyauty.error.common.width_required"));
		if(large == 0)
			addActionError(getText("loyauty.error.common.large_required"));
		if(high == 0)
			addActionError(getText("loyauty.error.common.high_required"));
		*/
		try{			
			Float.parseFloat(msrp);
		}
		catch(NumberFormatException mfe){
			addActionError(getText("loyauty.error.common.msrp_number"));
		}
		try{			
			Float.parseFloat(cost);
		}
		catch(NumberFormatException mfe){
			addActionError(getText("loyauty.error.common.cost_number"));
		}
		
		//Warranty
		if(!defectFree)
		{
			try{
				Float.parseFloat(warrantyQuantity);
			} catch(NumberFormatException mfe) {
				addActionError(getText("loyauty.error.common.warranty_number"));
			}
		}
		
		setCategory(category);
		setMainSpecification(mainSpecification);
	}
	
	
	@Override  
	public String execute() throws Exception {

		
		try {
			
			String managerLogin="";
			User userManager=new User();
			userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if(userSession!=null){
				managerLogin=userSession.getLogin();
				userManager=userService.getUserByLogin(managerLogin);
			}
			Long managerId=userManager.getId();
			
			statusName = getText("loyalty.enum.product.status.available");
			
			BrandDTO brandDTO = BrandDTO.valueOf(brand, null, null, null, null);
			CategoryDTO categoryDTO = CategoryDTO.valueOf(category, 0, null, null, null, null);
			if(productImage != null ){
				try{
					imgDTO   =  uploadProductImage();
				}catch (NullPointerException e) {
					imgDTO = null;
				}
				catch (IOException e) {
					imgDTO = null;
				}
			}
			
			if(this.hasActionErrors()) 
				return INPUT;
			
			//<Make "large" and "boxLength" the biggest size between L,W and H>
			switchBetweenLargeWidthHeight();
			
			List<ProductModelDTO> manufProductDTOList = new ArrayList<ProductModelDTO>();
			manufProductDTOList.add(ProductModelDTO.valueOf(0, manufProductID, manufProductQuantity, supplier, price, msrp0));
			if(manufProductID1.trim().length()!=0)
				manufProductDTOList.add(ProductModelDTO.valueOf(0, manufProductID1, manufProductQuantity1, supplier1, price1, msrp1));
			if(manufProductID2.trim().length()!=0)
				manufProductDTOList.add(ProductModelDTO.valueOf(0, manufProductID2, manufProductQuantity2, supplier2, price2, msrp2));
			if(manufProductID3.trim().length()!=0)
				manufProductDTOList.add(ProductModelDTO.valueOf(0, manufProductID3, manufProductQuantity3, supplier3, price3, msrp3));
			if(manufProductID4.trim().length()!=0)
				manufProductDTOList.add(ProductModelDTO.valueOf(0, manufProductID4, manufProductQuantity4, supplier4, price4, msrp4));
	
			setMsrp(msrp);
			setCost(cost);
			//Warranty
			String warrantyEng = "";
			String warrantyFr = "";
			if(defectFree) {
				warrantyEng = WebConstants.WARRANTY_DEFECT_FREE_ENG;
				warrantyFr = WebConstants.WARRANTY_DEFECT_FREE_FR;
			} else {
				if(periodTime.equalsIgnoreCase(WebConstants.WARRANTY_MONTH_ENG)) {
					if(Integer.valueOf(warrantyQuantity) > 1) {
						warrantyEng =  warrantyQuantity + " " + WebConstants.WARRANTY_MONTHS_ENG;
					} else {
						warrantyEng =  warrantyQuantity + " " + WebConstants.WARRANTY_MONTH_ENG;
					}
					warrantyFr = warrantyQuantity + " " + WebConstants.WARRANTY_MONTH_FR;
				} else {
					if(Integer.valueOf(warrantyQuantity) > 1) {
						warrantyEng =  warrantyQuantity + " " + WebConstants.WARRANTY_YEARS_ENG;
						warrantyFr = warrantyQuantity + " " + WebConstants.WARRANTY_YEARS_FR;
					} else {
						warrantyEng =  warrantyQuantity + " " + WebConstants.WARRANTY_YEAR_ENG;
						warrantyFr = warrantyQuantity + " " + WebConstants.WARRANTY_YEAR_FR;
					}
				}
			}
			CommonDTO commonWarrantyEng = CommonDTO.valueOf(0, warrantyEng);
			CommonDTO commonWarrantyFr = CommonDTO.valueOf(0, warrantyFr);
			List<ProductLinkDTO> linkList = new ArrayList<ProductLinkDTO>();
			ProductLinkDTO productLinkDTO = ProductLinkDTO.valueOf(linkUrl, new Long(0));
			linkList.add(productLinkDTO);
			
			ProductDTO productDTO = new ProductDTO.Builder(new Long(0), brandDTO, categoryDTO)
			.mainFilterTypeId(mainSpecification).loyaltyProductId(loyaltyProductId).nameEng(CommonDTO.valueOf(0, nameEn))
			.nameFr(CommonDTO.valueOf(0, nameFr)).image(imgDTO).descriptionEng(CommonDTO.valueOf(0, descriptionEn))
			.descriptionFr(CommonDTO.valueOf(0, descriptionFr)).specificationEng(CommonDTO.valueOf(0, specificationEn))
			.specificationFr(CommonDTO.valueOf(0, specificationFr)).msrp(msrp).cost(cost).width(width).high(high)
			.large(large).weight(weight).actualWidth(actualWidth).actualHeight(actualHeight)
			.actualLength(actualLength).actualWeight(actualWeight).manufactureProductList(manufProductDTOList)
			.status(ProductStatus.AVAILABLE).discontinuedStartDate(discontinuedStartDate)
			.loyaltyProductIdSub(loyaltyProductIdSub).wereWgtDimChanged(true)
			.otherEng(CommonDTO.valueOf(0, otherEng)).otherFr(CommonDTO.valueOf(0, otherFr))
			.linkList(linkList).note(note).consideredForXML(true)
			.warantyEng(commonWarrantyEng).warantyFr(commonWarrantyFr).build();
			if(upc!=null && !upc.equals(""))upc=upc.replaceAll(" ", "");
			productDTO.setUpc(upc);
			
			// Insert product
			Long productId = productService.createProduct(productDTO);
			
			// Insert box and product_box
			boxDTO.setProductId(productId);
			boxDTO.setStatusId(0); //cp_not_verified in the first insert
			productService.insertBoxAndProductBox(boxDTO);
			
			operationDTO=new OperationsDTO();
			operationDTO.setOperationType("Add Product");
			operationDTO.setDataBefore("");
			operationDTO.setDataAfter("NameEng:["+nameEn+"]"+" NameFr:["+nameFr+"]"+" ProductID:["+productId+"]");
			operationDTO.setObjectId(productId);
			operationDTO.setUserId(managerId);
			operationsService.insertOperation(operationDTO);
			request.getSession(true).setAttribute("productID", productId);
			
			setBrandName(brandName);
			setCategoryName(categoryName);
			
			final int SIZE = userList.size();
			String[] priceFull = new String[SIZE];
			String[] profitFull = new String[SIZE];
			String[] discountFull = new String[SIZE];
			Boolean[] excludedFull = new Boolean[SIZE];
			excluded = new String[SIZE];
			currencyRate = new Double[SIZE];
			currencySymbol = new String[SIZE];
			currencyPrice = new String[SIZE];
			ArrayList<Long> arrayList = new ArrayList<Long>();
			for (UserSessionDTO uDTO : userList) {
				arrayList.add(uDTO.getId());
			}
			int count = 0;
			UserDTO userDTOfoCurrency;
			for (UserSessionDTO uDTO : userNameList) {
				userDTOfoCurrency = userService.getUserInformation(uDTO.getId());
				currencyRate[count] = 1D;
				currencySymbol[count] = "CAD";
				currencyPrice[count] = "";
				if(userDTOfoCurrency!=null && userDTOfoCurrency.getCurrencyRate()!=null) 
					currencyRate[count] = userDTOfoCurrency.getCurrencyRate();
				if(userDTOfoCurrency!=null && userDTOfoCurrency.getCurrencySymbol()!=null) 
					currencySymbol[count] = userDTOfoCurrency.getCurrencySymbol();
				count++;
			}
			
			count = 0;
			int others = 0;
			for (long userIdFromDTO : arrayList) {
				if (isThereTheExcludedInUserSessionDTO(isExcluded, userIdFromDTO)) {
					excludedFull[count] = true;
					excluded[count] = "t";
					priceFull[count] = "";
					profitFull[count] = "";
					discountFull[count] = "";
				} else {
					excludedFull[count] = false;
					excluded[count] = "f";
					priceFull[count] = userPrice[others];
					profitFull[count] = percentageProfit[others];
					discountFull[count] = percentageDiscount[others];
					++others;
				}
				++count;
			}
			
			AlterProductXMLDTO alterProductXMLDTO = new AlterProductXMLDTO();
			AlterUserProductXMLDTO alterUserProductXMLDTO = new AlterUserProductXMLDTO();
			UserProductPriceDTO uppDTO = new UserProductPriceDTO();
			int index = 0;
			for (long userIdFromDTO : arrayList) {
				uppDTO = new UserProductPriceDTO();
				uppDTO.setExcluded(excludedFull[index]);
				uppDTO.setPrice(priceFull[index]);
				uppDTO.setProfit(profitFull[index]);
				uppDTO.setDiscount(discountFull[index]);
				uppDTO.setProductId(productId);
				uppDTO.setUserId(userIdFromDTO);
				uppDTO.setPriceType(PriceType.ADD_PRODUCT_PRICE_SET);
				uppDTO.setUserStatus(UserProductStatus.INACTIVE);
				productService.createUserProductPrice(uppDTO);				
				++index;
			}
			
			userPrice = priceFull;
			for(int i=0;i<userPrice.length; i++) {
				if(userPrice[i]!=null && userPrice[i].replaceAll(" ", "").matches("^-?\\d*\\.\\d+$|^-?\\d+$")) {
					Double curPrice = currencyRate[i] * Double.parseDouble(userPrice[i]);
					curPrice = (double) Math.round(curPrice*100)/100;
					currencyPrice[i] = curPrice+"";
				}
			}
			percentageProfit = profitFull;
			percentageDiscount = discountFull;
			
			alterProductXMLDTO = new AlterProductXMLDTO();
			alterProductXMLDTO.setProductId(productId);
			alterProductXMLDTO.setBrandId(true);
			alterProductXMLDTO.setCategoryId(true);
			alterProductXMLDTO.setTypeId(true);
			if (productDTO.getImage() != null) {
				alterProductXMLDTO.setImageId(true);
			} else {
				alterProductXMLDTO.setImageId(false);
			}
			alterProductXMLDTO.setStatusId(true);
			alterProductXMLDTO.setNameEn(true);
			alterProductXMLDTO.setNameFr(true);
			alterProductXMLDTO.setDescriptionEn(true);
			alterProductXMLDTO.setDescriptionFr(true);
			alterProductXMLDTO.setSpecificationEn(true);
			alterProductXMLDTO.setSpecificationFr(true);
			alterProductXMLDTO.setOtherEn(true);
			alterProductXMLDTO.setOtherFr(true);
			alterProductXMLDTO.setWarrantyEn(true);
			alterProductXMLDTO.setWarrantyFr(true);
			alterProductXMLDTO.setDimensions(true);
			alterProductXMLDTO.setWeight(true);
			alterProductXMLDTO.setModelNumber(true);
			alterProductXMLDTO.setMsrp(true);
			alterProductXMLDTO.setShipping(true);
			alterProductXMLDTO.setShipment(true);	//for the xml Product feed
			alterProductXMLDTO.setProductToBeExecuted(true);
			productService.createAlterProductXML(alterProductXMLDTO);
			
			for (long userId : arrayList) {
				if (!productService.existsOnAlterUserProductXML(productId, userId)) {
					alterUserProductXMLDTO = new AlterUserProductXMLDTO();
					uppDTO = new UserProductPriceDTO();
					uppDTO = productService.getUserProductPriceInformation(productId, userId);
					alterUserProductXMLDTO.setUserId(userId);
					alterUserProductXMLDTO.setProductId(productId);
					alterUserProductXMLDTO.setPriceDiscount(true);
					alterUserProductXMLDTO.setPrice(true);
					alterUserProductXMLDTO.setShipping(true);
					alterUserProductXMLDTO.setExcluded(false);
					alterUserProductXMLDTO.setExcludedMeaning(uppDTO.getExcluded());
					alterUserProductXMLDTO.setUserProductToBeExecuted(true);
					productService.createAlterUserProductXML(alterUserProductXMLDTO);
				}
			}
			
			return SUCCESS;
			
		} catch(ServiceLocatorException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}		
		
		return INPUT;
	}
	
	private boolean isThereTheExcludedInUserSessionDTO(String[] isExcluded, long userIdFromDTO) {		
		boolean outcome = false;
		if (isExcluded != null) {
			if (isExcluded.length == 0) return false;
			for (String excluded : isExcluded) {		
				outcome |= userIdFromDTO == Long.parseLong(excluded);
			}
		}
		return outcome;
	}

	/**
	 * @action load image file
	 * @return
	 * @throws ServiceException
	 * @throws IOException 
	 * @throws ServiceLocatorException 
	 */
	
	private ImageDTO uploadProductImage() throws ServiceException, IOException, ServiceLocatorException {
		
		ImageDTO imageDTO = null;
		UserSessionDTO userSession = (UserSessionDTO) request.getSession().getAttribute(WebConstants.USER);
		//UserSessionDTO userSession = UserSessionDTO.valueOf(1, "test100", 1, 1, 1, 10, "halo@hhh.com", "ABC", true);
		if(productImage == null ){
			addActionError(getText("loyauty.error.common.required"));			
		}
		else {
			
			boolean contentFireFox = !productImageContentType.equals("image/png")  && 
									 !productImageContentType.equals("image/jpeg") && 
									 !productImageContentType.equals("image/jpg");
			
			boolean contentIE = !productImageContentType.equals("image/x-png")  && 
							    !productImageContentType.equals("image/pjpeg") && 
							    !productImageContentType.equals("image/pjpg");
			
			getServiceLocator().getImageService();
			String filePath = request.getSession().getServletContext().getRealPath("/");
			//String filePath = "C:\\loyalty\\";
			
			if( contentFireFox && contentIE ){
				addActionError(getText("loyauty.error.common.content.type"));
				return null;				
			}
			
			if(productImage.length() > WebConstants.PRODUCT_SIZE_ALLOWED){ 
				addActionError(getText("loyauty.error.common.fileTooLarge"));
				return null;		
			}
			
			Dimension dim = FileUtils.getJPEGDimension(productImage);					
			if( dim.width < WebConstants.WIDTH_PRODUCT_MIN ){
				addActionError(getText("loyauty.error.common.logo_size") + " " +WebConstants.WIDTH_PRODUCT_MIN + " px" );
				return null;		
			}
			
	    	double ratio = (double) Math.round((dim.getHeight()/dim.getWidth())*100)/(double) 100;
			int thumbHeight = (int) (WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH * ratio);
			boolean isLarge = dim.getWidth() >= WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH * WebConstants.COVER_LARGE_TRANSFERT_COEFICIENT;
			
			imageDTO = productService.addProductImage(productImage, productImageFileName, filePath, 
					   				userSession.getId(), WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH,
					   				thumbHeight, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge );
		}
		return imageDTO;
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
	
	//Make "large" and "boxLength" the biggest size between L,W and H
	public void switchBetweenLargeWidthHeight () {
		Double L,W,H, permute;
		// large/width/high
		L = W = H = 0D;
		if(large!=null && !large.replaceAll(" ", "").isEmpty()) L = Double.parseDouble(large);
		if(width!=null && !width.replaceAll(" ", "").isEmpty()) W = Double.parseDouble(width);
		if(high!=null && !high.replaceAll(" ", "").isEmpty())   H = Double.parseDouble(high);
		if(L < H) {
			permute = L;
			L = H;
			H = permute;
			large = L+"";
			high = H+"";
		}
		if(L < W) {
			permute = L;
			L = W;
			W = permute;
			large = L+"";
			width = W+"";
		}
		if(W < H) {
			permute = W;
			W = H;
			H = permute;
			width = W+"";
			high = H+"";
		}
		
		// boxLength/boxWidth/boxHeight
		L = boxDTO.getLength();
		W = boxDTO.getWidth();
		H = boxDTO.getHeight();
		Double WDTH = boxDTO.getTotalWeight();
		if(L==null) { L=0D; boxDTO.setLength(0D); }
		if(W==null) { W=0D; boxDTO.setWidth(0D); }
		if(H==null) { H=0D; boxDTO.setHeight(0D); }
		if(WDTH==null) { WDTH=0D; boxDTO.setTotalWeight(0D); }
		if(L < H) {
			permute = L;
			L = H;
			H = permute;
			boxDTO.setLength(L);
			boxDTO.setHeight(H);
		}
		if(L < W) {
			permute = L;
			L = W;
			W = permute;
			boxDTO.setLength(L);
			boxDTO.setWidth(W);
		}
		if(W < H) {
			permute = W;
			W = H;
			H = permute;
			boxDTO.setWidth(W);
			boxDTO.setHeight(H);
		}
		
		// largeCm/widthCm/highCm
		// Only to display them on addProductSuccess
		L = W = H = 0D;
		if(largeCm!=null && !largeCm.replaceAll(" ", "").isEmpty()) L = Double.parseDouble(largeCm);
		if(widthCm!=null && !widthCm.replaceAll(" ", "").isEmpty()) W = Double.parseDouble(widthCm);
		if(highCm!=null && !highCm.replaceAll(" ", "").isEmpty())   H = Double.parseDouble(highCm);
		if(L < H) {
			permute = L;
			L = H;
			H = permute;
			largeCm = L+"";
			highCm = H+"";
		}
		if(L < W) {
			permute = L;
			L = W;
			W = permute;
			largeCm = L+"";
			widthCm = W+"";
		}
		if(W < H) {
			permute = W;
			W = H;
			H = permute;
			widthCm = W+"";
			highCm = H+"";
		}
		
		// boxLengthCm/boxWidthCm/boxHeightCm
		// Only to display them on addProductSuccess
		L = W = H = 0D;
		if(boxLengthCm!=null && !boxLengthCm.replaceAll(" ", "").isEmpty()) L = Double.parseDouble(boxLengthCm);
		if(boxWidthCm!=null && !boxWidthCm.replaceAll(" ", "").isEmpty())   W = Double.parseDouble(boxWidthCm);
		if(boxHeightCm!=null && !boxHeightCm.replaceAll(" ", "").isEmpty()) H = Double.parseDouble(boxHeightCm);
		if(L < H) {
			permute = L;
			L = H;
			H = permute;
			boxLengthCm = L+"";
			boxHeightCm = H+"";
		}
		if(L < W) {
			permute = L;
			L = W;
			W = permute;
			boxLengthCm = L+"";
			boxWidthCm = W+"";
		}
		if(W < H) {
			permute = W;
			W = H;
			H = permute;
			boxWidthCm = W+"";
			boxHeightCm = H+"";
		}
	}//Make "large" the biggest size between L,W and H
	
}
