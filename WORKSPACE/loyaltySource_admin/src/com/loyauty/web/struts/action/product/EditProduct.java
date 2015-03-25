package com.loyauty.web.struts.action.product;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.Language;
import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserProductStatus;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
//import com.loyauty.model.Operations;
import com.loyauty.model.User;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductLinkDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
//import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.CommonUtils;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;
import org.jsoup.Jsoup;

public class EditProduct extends LoyautyAction {
	
	private static final long serialVersionUID = 4688139859406086753L;
	
	private ProductService productService;
	private ImageService imageService;
	private CommonService commonService;
	private BrandService brandService;
	private UserService userService;
	private OperationsService operationsService;
	
	private UserSessionDTO userSession;
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
	private Integer manufProductQuantity = 0;
	@Getter @Setter
	private Integer manufProductQuantity1 = 0;
	@Getter @Setter
	private Integer manufProductQuantity2 = 0;
	@Getter @Setter
	private Integer manufProductQuantity3 = 0;
	@Getter @Setter
	private Integer manufProductQuantity4 = 0;
	
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
	private String upc;
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
	private Double boxLength;
	@Getter @Setter
	private Double boxWidth;
	@Getter @Setter
	private Double boxHeight;
	/*
	@Getter @Setter
	private Double boxWeight;
	*/
	@Getter @Setter
	private Double boxTotalWeight;
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
	private UserProductPriceDTO userProductPriceDTO;	
	
	@Getter @Setter
	private List<CommonDTO> brandList;
	@Getter @Setter
	private List<CommonDTO> statusList;

	@Getter @Setter
	private String linkUrl;
	@Getter @Setter
	private String note;
	@Getter @Setter
	private String statusName;	
	@Getter @Setter
	private Integer statusId;
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
	private List<UserSessionDTO> userNameList;
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
	private List<ClientCategoryDTO> listClientCategory;
	
	@Getter @Setter
	private OperationsDTO operationDTO;
	
	public EditProduct () throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		commonService = getServiceLocator().getCommonService();
		imageService = getServiceLocator().getImageService();
		brandService = getServiceLocator().getBrandService();
		userService = getServiceLocator().getUserService();
		operationsService = getServiceLocator().getOperationsService();
	}
	
	@Override
	public void prepare() {
		try {
			brandList = commonService.getBrands();
			statusList = commonService.getAllProductStatuses();
			categoryList  = internationalizeName(commonService.getCategoriesByBrand(brand));
			mainSpecificationList = productService.getMainSpecificationByCategory(category);			
			productId = (Long) request.getSession(true).getAttribute("productId");
			productDTO = productService.getProductInformation(productId, null);
			boxDTO = productService.getBoxByProductId(productId);
			if(boxDTO==null)boxDTO=new BoxDTO();
			imgDTO = productDTO.getImage();
			activeClientsList = productService.getAllActiveClients(productId);
			activeClientsTFSize = activeClientsSize = activeClientsList.size();
			activeClientsTFSize = activeClientsList.isEmpty() ? 1 : activeClientsTFSize;
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			userNameList = userService.getAllUserAccounts(basicUserDTO);
			listClientCategory = userService.getAllClientCategory();
			for (ClientCategoryDTO ccDTO : listClientCategory) {
				userNameList.add(getUserSessionDTO(ccDTO));
			}			
		} catch(Exception e) {
			e.printStackTrace();
			log.debug("Error when getting product in method prepare()");
		}
	}
	
	@Override
	public void validate() {
			
			if(brand < 0)
				addActionError(getText("loyauty.error.common.brand_required"));
			if(category < 0)
				addActionError(getText("loyauty.error.common.category_required"));
/*			if(mainSpecification < 0)
				addActionError(getText("loyauty.error.common.type_spec_required"));*/
			if(manufProductID.trim().length() == 0)
				addActionError(getText("loyauty.error.common.manufacture_required"));
			
			if(loyaltyProductId.trim().length() == 0) {
				addActionError(getText("loyauty.error.common.productId_required"));
			} else {	
				try {
					ProductDTO aProductDTO = productService.getProductIdFromLSProductId(loyaltyProductId);
					if (aProductDTO != null) {
						if (productId != aProductDTO.getId() && !productDTO.getLoyaltyProductId().matches("^\\s*$")) {
							addActionError(getText("loyauty.error.common.productId_alreadyExists"));
						}
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
			
			if (statusId == ProductStatus.DISCONTINUED.getValue()) {
				try {
					if (loyaltyProductIdSub.length() > 0 && !loyaltyProductIdSub.matches("^\\s*$") ) {
						ProductDTO newProductDTO = productService.getProductIdFromLSProductId(loyaltyProductIdSub);
						String newSubbie = (newProductDTO == null) ? "" : newProductDTO.getLoyaltyProductId();
						if (newSubbie == null || newSubbie.matches("^\\s*$")) {
							addActionError(getText("loyauty.error.common.productIdSub_required"));
						} else  {
							if (newSubbie.equalsIgnoreCase(loyaltyProductId)) {
								addActionError(getText("loyauty.error.common.productIdSub_equal"));
							}
						}
					}
				} catch (ServiceException sx) {
					addActionError(getText("loyauty.error.common.service"));
				}
			} else if (statusId == ProductStatus.DISABLED.getValue()) {
				if (activeClientsList.size() != 0) {
					addActionError(getText("loyauty.error.common.disableWithActive"));
				}
			}
			
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
			
			try {			
				Float.parseFloat(msrp);
			} catch(NumberFormatException mfe){
				addActionError(getText("loyauty.error.common.msrp_number"));
			}			
			try {			
				Float.parseFloat(cost);
			} catch(NumberFormatException mfe){
				addActionError(getText("loyauty.error.common.cost_number"));
			}
			/*
			try {
				Integer.parseInt(weight);
			} catch(NumberFormatException mfe){
				addActionError(getText("loyauty.error.common.weight_number"));
			}*/
	}
	
	@Override
	public String execute() throws Exception {
		try {
			
			ProductDTO productDTOB4 = productService.getProductInformation(productId, null);
			BoxDTO boxDTOB4 = productService.getBoxByProductId(productId);
			if(boxDTOB4 == null) boxDTOB4 = new BoxDTO();
			operationDTO = new OperationsDTO();
			String managerLogin = "";
			User userManager = new User();
			userSession = (UserSessionDTO) request.getSession().getAttribute(WebConstants.USER);
			if (userSession != null){
				managerLogin = userSession.getLogin();
				userManager = userService.getUserByLogin(managerLogin);
			}
			Long managerId = userManager.getId();
			String dataBefore = "";
			String dataAfter = "";
			
			/*
			boolean wereWgtDimChanged = productDTO.getWereWgtDimChanged();			
			wereWgtDimChanged = (!wereWgtDimChanged) 
								? (!weight.equalsIgnoreCase(productDTO.getWeight())
									|| 	!large.equalsIgnoreCase(productDTO.getLarge())
									|| 	!width.equalsIgnoreCase(productDTO.getWidth())
									|| 	!high.equalsIgnoreCase(productDTO.getHigh())
									|| 	!cost.equalsIgnoreCase(productDTO.getCost())) 
								: wereWgtDimChanged;
			productDTO.setWereWgtDimChanged(wereWgtDimChanged);
			*/

			if(upc!=null && !upc.equals(""))upc=upc.replaceAll(" ", "");
			productDTO.setUpc(upc);
			
			boxDTO.setProductId(productId);
			boxDTO.setLength(boxLength);
			boxDTO.setWidth(boxWidth);
			boxDTO.setHeight(boxHeight);
			boxDTO.setTotalWeight(boxTotalWeight);
			if(statusProductBox==null)statusProductBox=0;
			boxDTO.setStatusId(statusProductBox);

			//Make "large" and "boxLength" the biggest size between L,W and H
			switchBetweenLargeWidthHeight();

			boolean wereWgtDimChanged = productDTO.getWereWgtDimChanged();			
			wereWgtDimChanged = (!wereWgtDimChanged ) 
								? ( (!boxDTOB4.getTotalWeight().equals(boxDTO.getTotalWeight()))
									||!(boxDTOB4.getLength().equals(boxDTO.getLength()))
									||!(boxDTOB4.getWidth().equals(boxDTO.getWidth()))
									||!(boxDTOB4.getHeight().equals(boxDTO.getHeight()))) 
								: wereWgtDimChanged;
			productDTO.setWereWgtDimChanged(wereWgtDimChanged);

			if (!productDTOB4.getLarge().equals(large)) {
				dataBefore += " Large:[" + productDTOB4.getLarge() + "]\n";
				dataAfter += " Large:[" + large + "]\n";
			}
			
			if (!productDTOB4.getWidth().equals(width)) {
				dataBefore += " Width:[" + productDTOB4.getWidth() + "]\n";
				dataAfter += " Width:[" + width + "]\n";
			}
			
			if (!productDTOB4.getHigh().equals(high)) {
				dataBefore += " High:[" + productDTOB4.getHigh() + "]\n";
				dataAfter += " High:[" + high + "]\n";
			}
			
			if (!productDTOB4.getWeight().equals(weight)){
				dataBefore += " Weight:["+productDTOB4.getWeight()+"]\n";
				dataAfter += " Weight:["+weight+"]\n";
			}
			
			// Box sizes
			if (boxDTOB4.getLength()!= null && !boxDTOB4.getLength().equals(boxDTO.getLength())) {
				dataBefore += " Box Large:[" + boxDTOB4.getLength() + "]\n";
				dataAfter += " Box Large:[" + boxDTO.getLength() + "]\n";
			}
			
			if (boxDTOB4.getWidth()!=null && !boxDTOB4.getWidth().equals(boxDTO.getWidth())) {
				dataBefore += " Box Width:[" + boxDTOB4.getWidth() + "]\n";
				dataAfter += " Box Width:[" + boxDTO.getWidth() + "]\n";
			}
			
			if (boxDTOB4.getHeight()!=null && !boxDTOB4.getHeight().equals(boxDTO.getHeight())) {
				dataBefore += " Box Height:[" + boxDTOB4.getHeight() + "]\n";
				dataAfter += " Box Height:[" + boxDTO.getHeight() + "]\n";
			}
			
			if (boxDTOB4.getTotalWeight()!=null && !boxDTOB4.getTotalWeight().equals(boxDTO.getTotalWeight())) {
				dataBefore += " Box Weight:["+boxDTOB4.getTotalWeight()+"]\n";
				dataAfter += " Box Weight:["+boxDTO.getTotalWeight()+"]\n";
			}
			
			if (boxDTOB4.getStatusId()!=null && !boxDTOB4.getStatusId().equals(boxDTO.getStatusId())) {
				dataBefore += " CP Verified:["+boxDTOB4.getStatusId()+"]\n";
				dataAfter += " CP Verified:["+boxDTO.getStatusId()+"]\n";
			}
			
			if (productDTOB4.getUpc()!=null && !productDTOB4.getUpc().equals(upc)) {
				dataBefore += " UPC:[" + productDTOB4.getUpc() + "]\n";
				dataAfter += " UPC:[" + upc + "]\n";
			}
		
			/*
			if (productDTOB4.getUpc()!=null && !productDTOB4.getUpc().equals(upc)) {
				dataBefore += " UPC:[" + productDTOB4.getUpc() + "]\n";
				dataAfter += " UPC:[" + upc + "]\n";
			}
			*/
			if (!productDTOB4.getCost().equals(cost)) {
				dataBefore += " Our Cost:[" + productDTOB4.getCost() + "]\n";
				dataAfter += " Our Cost:[" + cost + "]\n";
			}	
			if (manufProductID != null)
				if(manufProductQuantity != null)
					updateListManufactureProduct(0, manufProductID, manufProductQuantity, supplier, price, msrp0);
				else
					updateListManufactureProduct(0, manufProductID, 0, supplier, price, msrp0);
			if (manufProductID1 != null)
				if(manufProductQuantity1 != null)
					updateListManufactureProduct(1, manufProductID1, manufProductQuantity1, supplier1, price1, msrp1);
				else
					updateListManufactureProduct(1, manufProductID1, 0, supplier1, price1, msrp1);
			if (manufProductID2 != null)
				if(manufProductQuantity2 != null)
					updateListManufactureProduct(2, manufProductID2, manufProductQuantity2, supplier2, price2, msrp2);
				else
					updateListManufactureProduct(2, manufProductID2, 0, supplier2, price2, msrp2);
			if (manufProductID3 != null)
				if (manufProductQuantity3 != null)
					updateListManufactureProduct(3, manufProductID3, manufProductQuantity3, supplier3, price3, msrp3);
				else
					updateListManufactureProduct(3, manufProductID3, 0, supplier3, price3, msrp3);
			if (manufProductID4 != null)
				if(manufProductQuantity4 != null)
					updateListManufactureProduct(4, manufProductID4, manufProductQuantity4, supplier4, price4, msrp4);
				else
					updateListManufactureProduct(4, manufProductID4, 0, supplier4, price4, msrp4);
		    List<ProductModelDTO>listModelB4= productDTOB4.getManufactureProductList();
		    List<ProductModelDTO>listModelAfter= productDTO.getManufactureProductList();
		    for(int i=0;i<listModelB4.size() && i<listModelAfter.size();i++){
		    	for(int j=0;j<listModelAfter.size();j++){
		    			String manufPB4=" Manuf.P:"+listModelB4.get(i).getName()+"[";
		    			String manufPAfter=" Manuf.P:"+listModelB4.get(i).getName()+"[";
		    			boolean isChanged=false;
		    		if(listModelB4.get(i).getId()==listModelAfter.get(j).getId()){
		    			if(listModelB4.get(i).getName()!=null && !listModelB4.get(i).getName().equals(listModelAfter.get(j).getName())){
		    				manufPB4+="Name:"+listModelB4.get(i).getName()+";";
		    				manufPAfter+="Name:"+listModelAfter.get(j).getName()+";";
							isChanged=true;
				    	}
				    	if(listModelB4.get(i).getQuantity()!=null && listModelB4.get(i).getQuantity()!=listModelAfter.get(j).getQuantity()){
				    		manufPB4+="Quantity:"+listModelB4.get(i).getQuantity()+";";
				    		manufPAfter+="Quantity:"+listModelAfter.get(j).getQuantity()+";";
							isChanged=true;
				    	}
				    	if(listModelB4.get(i).getSupplier()!=null && !listModelB4.get(i).getSupplier().equals(listModelAfter.get(j).getSupplier())){
				    		manufPB4+="Supplier:"+listModelB4.get(i).getSupplier()+";";
				    		manufPAfter+="Supplier:"+listModelAfter.get(j).getSupplier()+";";
							isChanged=true;
				    	}
				    	if(listModelB4.get(i).getPrice()!=null && !listModelB4.get(i).getPrice().equals(listModelAfter.get(j).getPrice())){
				    		manufPB4+="Cost:"+listModelB4.get(i).getPrice()+";";
				    		manufPAfter+="Cost:"+listModelAfter.get(j).getPrice()+";";
							isChanged=true;
				    	}
				    	if(listModelB4.get(i).getMsrp()!=null && !listModelB4.get(i).getMsrp().equals(listModelAfter.get(j).getMsrp())){
				    		manufPB4+="Msrp:"+listModelB4.get(i).getMsrp()+";";
				    		manufPAfter+="Msrp:"+listModelAfter.get(j).getMsrp()+";";
							isChanged=true;
				    	}
		    			if(isChanged){
			    			manufPB4+="]\n";
			    			manufPAfter+="]\n";
			    			if(listModelB4.get(i).getName()!=null && !listModelB4.get(i).getName().equals("")&&
			    			   listModelAfter.get(j).getName()!=null && !listModelAfter.get(j).getName().equals("")){
			    				dataBefore+=manufPB4;
			    				dataAfter+=manufPAfter;
			    			}
		    			}
		    			break;
		    		}
		    		
		    	}		    	
		    }
		    
		    for(int i=0;i<listModelB4.size();i++){
			    	boolean exist=false;
			    	for(int j=0;j<listModelAfter.size();j++){
			    		if(listModelAfter.get(j).getId()==listModelB4.get(i).getId()&& !listModelAfter.get(j).getName().equals("")){
			    			exist=true;
			    			break;
			    		}
			    	}
			    	
			    	if(!exist){
			    		boolean isChanged=false;
		    			String manufPB4=" Manuf.P:[";
		    			String manufPAfter=" Manuf.P:[";
			    		if(listModelB4.get(i).getName()!=null){
			    			isChanged=true;
			    			manufPB4+="Name:"+listModelB4.get(i).getName()+";";
				    	}
				    	if(listModelB4.get(i).getQuantity()!=null){
				    		isChanged=true;
				    		manufPB4+="Quantity:"+listModelB4.get(i).getQuantity()+";";
				    		
				    	}
				    	if(listModelB4.get(i).getSupplier()!=null){
				    		isChanged=true;
				    		manufPB4+="Supplier:"+listModelB4.get(i).getSupplier()+";";
				    		
				    	}
				    	if(listModelB4.get(i).getPrice()!=null){
				    		isChanged=true;
				    		manufPB4+="Cost:"+listModelB4.get(i).getPrice()+";";
				    		
				    	}
				    	if(listModelB4.get(i).getMsrp()!=null){
				    		isChanged=true;
				    		manufPB4+="Msrp:"+listModelB4.get(i).getMsrp();
				    	}
				    	
		    			if(isChanged){
			    			manufPB4+="]\n";
			    			if(listModelB4.get(i).getName()!=null && !listModelB4.get(i).getName().equals(""))dataBefore+=manufPB4;
			    			manufPAfter=" Manuf.P:"+"[Name:"+listModelB4.get(i).getName()+" was removed!]\n";
			    			if(listModelB4.get(i).getName()!=null && !listModelB4.get(i).getName().equals(""))dataAfter+=manufPAfter;
		    			}			    		
			    	}			    	
			    }
				
			    for(int i=0;i<listModelAfter.size();i++){
			    	boolean exist=false;
			    	for(int j=0;j<listModelB4.size();j++){
			    		if(listModelB4.get(j).getId()==listModelAfter.get(i).getId()){
			    			exist=true;
			    			break;
			    		}
			    	}
			    	
			    	if(!exist){
			    		boolean isChanged=false;
		    			String manufPAfter=" Manuf.P:[";
		    			String manufPB4=" Manuf.P:[";
		    			if(listModelAfter.get(i).getName()!=null){
		    				isChanged=true;
		    				manufPAfter+="Name:"+listModelAfter.get(i).getName()+";";
				    	}
				    	if(listModelAfter.get(i).getQuantity()!=null){
				    		isChanged=true;
				    		manufPAfter+="Quantity:"+listModelAfter.get(i).getQuantity()+";";
				    	}
				    	if(listModelAfter.get(i).getSupplier()!=null){
				    		isChanged=true;
				    		manufPAfter+="Supplier:"+listModelAfter.get(i).getSupplier()+";";
				    	}
				    	if(listModelAfter.get(i).getPrice()!=null){
				    		isChanged=true;
				    		manufPAfter+="Cost:"+listModelAfter.get(i).getPrice()+";";
				    	}
				    	if(listModelAfter.get(i).getMsrp()!=null){
				    		isChanged=true;
				    		manufPAfter+="Msrp:"+listModelAfter.get(i).getMsrp();
				    	}
				    	
		    			if(isChanged){
			    			manufPAfter+="]\n";
			    			if(listModelAfter.get(i).getName()!=null && !listModelAfter.get(i).getName().equals(""))dataAfter+=manufPAfter;
			    			
			    			manufPB4+="Name:"+listModelAfter.get(i).getName()+" was added]\n";
			    			if(listModelAfter.get(i).getName()!=null && !listModelAfter.get(i).getName().equals(""))dataBefore+=manufPB4;
			    			
		    			}
			    	}
			    }
		    
			productDTO.getBrand().setId(brand);
			productDTO.getCategory().setId(category);
			productDTO.setMainFilterTypeId(mainSpecification);
			productDTO.setLoyaltyProductId(loyaltyProductId);
			productDTO.getNameEng().setName(nameEn);
			productDTO.getNameFr().setName(nameFr);
			productDTO.setMsrp(msrp);
			productDTO.setCost(cost);			
			productDTO.setWidth(width);
			productDTO.setLarge(large);
			productDTO.setHigh(high);
			productDTO.setWeight(weight);
			
			productDTO.getDescriptionEng().setName(descriptionEn);
			productDTO.getDescriptionFr().setName(descriptionFr);
			productDTO.getSpecificationEng().setName(specificationEn);
			productDTO.getSpecificationFr().setName(specificationFr);			
			if (productDTO.getOtherEng() != null)
				productDTO.getOtherEng().setName(otherEng);			
			productDTO.getOtherFr().setName(otherFr);
			
			productDTO.setStatus((ProductStatus) CommonUtils.enumFromValue(ProductStatus.values(), statusId));
			
			if (statusId == ProductStatus.DISCONTINUED.getValue()) {
				productDTO.setDiscontinuedStartDate(Calendar.getInstance().getTime());
				productDTO.setLoyaltyProductIdSub(loyaltyProductIdSub);
			} else if (statusId == ProductStatus.DISABLED.getValue()) {
				if (productDTO.getDiscontinuedStartDate() != null) {
					productDTO.setDiscontinuedStartDate(productDTO.getDiscontinuedStartDate());
				}
				if (productDTO.getLoyaltyProductIdSub() != null) {
					productDTO.setLoyaltyProductIdSub(productDTO.getLoyaltyProductIdSub());
				}
			}
			
			productDTO.setNote(note);
			
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
			
			if(productDTO.getWarrantyEng() == null) {
				CommonDTO commonWarrantyEng = CommonDTO.valueOf(0, warrantyEng);
				CommonDTO commonWarrantyFr = CommonDTO.valueOf(0, warrantyFr);
				
				productDTO.setWarrantyEng(commonWarrantyEng);
				productDTO.setWarrantyFr(commonWarrantyFr);
			} else {
				productDTO.getWarrantyEng().setName(warrantyEng);
				productDTO.getWarrantyFr().setName(warrantyFr);
			}
			
			String currentRealName = "";
			
			//That means that insert a new image and I have to link to the product
			if(imageId != 0) {
				if(productDTO.getImage() != null)
					productDTO.getImage().setId(imageId);
				else
					productDTO.setImage(imageService.getImage(imageId));
				
				imgDTO = imageService.getImage(imageId);
				currentRealName = imgDTO.getRealName();
			}
			
			if(productDTO.getLinkList().size() == 0) {
				//If the link doesn't exist, I have to insert the link
				List<ProductLinkDTO> linkList = new ArrayList<ProductLinkDTO>();
				ProductLinkDTO productLinkDTO = ProductLinkDTO.valueOf(linkUrl, productDTO.getId());
				linkList.add(productLinkDTO);
				productDTO.setLinkList(linkList);
			} else {
				//There is a link, so I have to update it.
				productDTO.getLinkList().get(0).setLink(linkUrl);
			}
			
			boolean consideredForXML = productDTO.getConsideredForXML();			
			if (!consideredForXML) { 
				productDTO.setConsideredForXML(true);
			}
			
			if(productDTOB4.getBrand().getId()!=productDTO.getBrand().getId()){
	    		dataBefore+=" Brand:["+productDTOB4.getBrand().getName()+"]\n";
				dataAfter+=" Brand::["+productDTO.getBrand().getName()+"]\n";
	    	}
			
			
			if(productDTOB4.getCategory().getId()!=productDTO.getCategory().getId()){
	    		dataBefore+=" Category:["+productDTOB4.getCategory().getName()+"]\n";
				dataAfter+=" Category:["+productDTO.getCategory().getName()+"]\n";
	    	}
			
			if(productDTOB4.getLoyaltyProductId()!=null && !productDTOB4.getLoyaltyProductId().equals(productDTO.getLoyaltyProductId())){
	    		dataBefore+=" Loyalty P.Id:["+productDTOB4.getLoyaltyProductId()+"]\n";
				dataAfter+=" Loyalty P.Id:["+productDTO.getLoyaltyProductId()+"]\n";
	    	}
			
			//if(!productDTOB4.getNameEng().equals(productDTO.getNameEng())){
			if(!productDTOB4.getNameEng().getName().equals(productDTO.getNameEng().getName())){
	    		dataBefore+=" Name Eng:["+productDTOB4.getNameEng()+"]\n";
				dataAfter+=" Name Eng:["+productDTO.getNameEng()+"]\n";
	    	}

			//if(!productDTOB4.getNameFr().equals(productDTO.getNameFr())){
			if(!productDTOB4.getNameFr().getName().equals(productDTO.getNameFr().getName())){
	    		dataBefore+=" Name Fr:["+productDTOB4.getNameFr()+"]\n";
				dataAfter+=" Name Fr:["+productDTO.getNameFr()+"]\n";
	    	}

			if(!productDTOB4.getMsrp().equals(productDTO.getMsrp())){
	    		dataBefore+=" Msrp:["+productDTOB4.getMsrp()+"]\n";
				dataAfter+=" Msrp:["+productDTO.getMsrp()+"]\n";
	    	} 

			if(productDTOB4.getStatus().getValue()!=productDTO.getStatus().getValue()){
				String statusName=ProductStatus.getStatusByValue(productDTOB4.getStatus().getValue());
	    		dataBefore+=" Status:["+statusName+"]\n";
	    		statusName=ProductStatus.getStatusByValue(productDTO.getStatus().getValue());
				dataAfter+=" Status:["+statusName+"]\n";
	    	}
			
			if(productDTOB4.getLoyaltyProductIdSub()!=null &&!productDTOB4.getLoyaltyProductIdSub().equals(productDTO.getLoyaltyProductIdSub())){
	    		dataBefore+=" Loyalty P.Id Sub:["+productDTOB4.getLoyaltyProductIdSub()+"]\n";
				dataAfter+=" Loyalty P.Id Sub:["+productDTO.getLoyaltyProductIdSub()+"]\n";
	    	} 

			// update product
			productService.updateProduct(productDTO);
			
			// update product_box
			//UsersPrivilegesDTO usersPrivCPVerified = (UsersPrivilegesDTO)request.getSession(true).getAttribute("usersPrivCanadaPostVerified");
			productService.updateProductBox(boxDTO);

			request.getSession(true).setAttribute("productID", productId);
			
			final int SIZE = userNameList.size();
			String[] priceFull = new String[SIZE];
			String[] profitFull = new String[SIZE];
			String[] discountFull = new String[SIZE];
			Boolean[] excludedFull = new Boolean[SIZE];
			excluded = new String[SIZE];
			currencyRate = new Double[SIZE];
			currencySymbol = new String[SIZE];
			currencyPrice = new String[SIZE];
			
			ArrayList<Long> arrayList = new ArrayList<Long>();
			UserDTO userDTOforCurrency;
			int count = 0;
			for (UserSessionDTO uDTO : userNameList) {
				arrayList.add(uDTO.getId());
				userDTOforCurrency = userService.getUserInformation(uDTO.getId());
				currencyRate[count] = 1D;
				currencySymbol[count] = "CAD";
				currencyPrice[count] = "";
				if(userDTOforCurrency!=null && userDTOforCurrency.getCurrencyRate()!=null) 
					currencyRate[count] = userDTOforCurrency.getCurrencyRate();
				if(userDTOforCurrency!=null && userDTOforCurrency.getCurrencySymbol()!=null) 
					currencySymbol[count] = userDTOforCurrency.getCurrencySymbol();
				count++;
			}

			List<Long> whichUsersChangedByPrice = new ArrayList<Long>();
			List<Long> whichUsersChangedByExcluded = new ArrayList<Long>();
			count = 0;
			int others = 0;
			
			/* We use uppDTOListActiveUsersOnlyB4 and uppDTOListActiveUsersOnlyAfter
			 * to select only the active Users (including Template A, B and C).
			 * We will use uppDTOListActiveUsersOnlyB4  instead of uppDTOListCopy 
			 * */
			List<UserProductPriceDTO> uppDTOListActiveUsersOnlyB4    = productService.getUserProductPriceForActiveUsersList(productId);
			List<UserProductPriceDTO> uppDTOListActiveUsersOnlyAfter = productService.getUserProductPriceForActiveUsersList(productId);
			
			for (long userIdFromDTO : arrayList) {
				if (isThereTheExcludedInUserSessionDTO(isExcluded, userIdFromDTO)) {
					excludedFull[count] = true;
					excluded[count] = "t";
					whichUsersChangedByExcluded.add(userIdFromDTO);
					priceFull[count] = "";
					profitFull[count] = "";
					discountFull[count] = "";
				} else {
					excludedFull[count] = false;
					excluded[count] = "f";
					whichUsersChangedByPrice.add(userIdFromDTO);
					priceFull[count] = userPrice[others];
					profitFull[count] = percentageProfit[others];
					discountFull[count] = percentageDiscount[others];
					for(UserProductPriceDTO uppDTO : uppDTOListActiveUsersOnlyAfter) {
						if(userIdFromDTO==uppDTO.getUserId()) {
							uppDTO.setPrice(priceFull[count]);
							uppDTO.setProfit(profitFull[count]);
							uppDTO.setDiscount(discountFull[count]);
						}
					}
					++others;
				}
				++count;
			}
			
			List<UserProductPriceDTO> uppDTOListCopy = productService.getUserProductPriceList(productId);			
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
				uppDTO.setUserStatus(UserProductStatus.ACTIVE);
				productService.updateUserProductPrice(uppDTO);
				++index;
			}
			
			userPrice = priceFull;
			percentageProfit = profitFull;
			percentageDiscount = discountFull;			
			
			for(int i=0;i<userPrice.length; i++) {
				if(userPrice[i]!=null && userPrice[i].replaceAll(" ", "").matches("^-?\\d*\\.\\d+$|^-?\\d+$")) {
					Double curPrice = currencyRate[i] * Double.parseDouble(userPrice[i]);
					curPrice = (double) Math.round(curPrice*100)/100;
					currencyPrice[i] = curPrice+"";
				}
			}
			
			List<UserProductPriceDTO> uppDTOListPriceB4 = new ArrayList<UserProductPriceDTO>();
			UserProductPriceDTO  userProductPriceDTOB4 = new UserProductPriceDTO();
			//for (UserProductPriceDTO userProductPriceDTOCopy : uppDTOListCopy) {
			for (UserProductPriceDTO userProductPriceDTOCopy : uppDTOListActiveUsersOnlyB4) {
				userProductPriceDTOB4 = new UserProductPriceDTO();
				userProductPriceDTOB4.setId(userProductPriceDTOCopy.getId());
				userProductPriceDTOB4.setUserId(userProductPriceDTOCopy.getUserId());
				userProductPriceDTOB4.setProductId(userProductPriceDTOCopy.getProductId());
				userProductPriceDTOB4.setPriceType(userProductPriceDTOCopy.getPriceType());
				userProductPriceDTOB4.setUserStatus(userProductPriceDTOCopy.getUserStatus());				
				if (userProductPriceDTOCopy.getPrice() != null) {
					if (userProductPriceDTOCopy.getPrice().matches("^\\s*$")) {
						userProductPriceDTOB4.setPrice("0.00");
					} else {
						userProductPriceDTOB4.setPrice(userProductPriceDTOCopy.getPrice());
					}
				} else {
					userProductPriceDTOB4.setPrice("0.00");
				}
				userProductPriceDTOB4.setProfit(userProductPriceDTOCopy.getProfit());
				userProductPriceDTOB4.setDiscount(userProductPriceDTOCopy.getDiscount());
				userProductPriceDTOB4.setExcluded(userProductPriceDTOCopy.getExcluded());
				uppDTOListPriceB4.add(userProductPriceDTOB4);
			}
			
			uppDTOListCopy = null;
			List<UserProductPriceDTO> uppDTOListPriceAfter = new ArrayList<UserProductPriceDTO>();
			UserProductPriceDTO uppDTOAfter = new UserProductPriceDTO();
			index = 0;
			for (long userIdFromDTO : arrayList) {
				uppDTOAfter = new UserProductPriceDTO();
				uppDTOAfter.setExcluded(excludedFull[index]);
				if (priceFull[index].matches("^\\s*$")) {
					priceFull[index] = "0.00";
				}
				uppDTOAfter.setPrice(priceFull[index]);
				uppDTOAfter.setProfit(profitFull[index]);
				uppDTOAfter.setDiscount(discountFull[index]);
				uppDTOAfter.setProductId(productId);
				uppDTOAfter.setUserId(userIdFromDTO);
				uppDTOAfter.setPriceType(PriceType.ADD_PRODUCT_PRICE_SET);
				uppDTOAfter.setUserStatus(UserProductStatus.ACTIVE);
				uppDTOListPriceAfter.add(uppDTOAfter);
				++index;
			}
			for (int i=0; i<uppDTOListPriceB4.size(); i++) {
				for (int j=0; j<uppDTOListPriceAfter.size(); j++) {
					if (uppDTOListPriceB4.get(i).getUserId() == uppDTOListPriceAfter.get(j).getUserId()) {						
						if (uppDTOListPriceB4.get(i).getExcluded() != uppDTOListPriceAfter.get(j).getExcluded()) {
							UserDTO userDTO = userService.getUserOrTemplateById(uppDTOListPriceB4.get(i).getUserId());
				    		dataBefore += " Excluded:["+userDTO.getLogin() + ":" + uppDTOListPriceB4.get(i).getExcluded() + "]\n";
							dataAfter += " Excluded:["+userDTO.getLogin() + ":" + uppDTOListPriceAfter.get(j).getExcluded() + "]\n";
				    	}
						
						if (uppDTOListPriceB4.get(i).getPrice() != null 
									&& !uppDTOListPriceB4.get(i).getPrice().equals(uppDTOListPriceAfter.get(j).getPrice()) 
									&& !uppDTOListPriceAfter.get(j).getExcluded()) {						
								//-------------------- recalculate shipping total-------------------------------------
								productService.calculateShippingRate(uppDTOListPriceB4.get(i).getUserId(), uppDTOListPriceB4.get(i).getProductId());						
								//------------------------------------------------------------------------------------
								UserDTO userDTO = userService.getUserOrTemplateById(uppDTOListPriceB4.get(i).getUserId());
								dataBefore += " User Price:["+userDTO.getLogin() + ":" + uppDTOListPriceB4.get(i).getPrice() + "]\n";
								dataAfter += " User Price:["+userDTO.getLogin() + ":" + uppDTOListPriceAfter.get(j).getPrice() + "]\n";
				    	} 
					    break;
					}					
				}				
			}
			
			operationDTO.setOperationType("Update Product");
			operationDTO.setDataBefore(dataBefore);
			operationDTO.setDataAfter(dataAfter);
			operationDTO.setObjectId(productId);
			operationDTO.setUserId(managerId);
			operationsService.insertOperation(operationDTO);
			handleAlterProductXML(productDTOB4, brand, category, mainSpecification, currentRealName, statusId,  nameEn, nameFr,
									descriptionEn, descriptionFr, specificationEn, specificationFr, otherEng, 
									otherFr, warrantyEng, warrantyFr, msrp, large, width, high, weight, 
									boxLength, boxWidth, boxHeight, boxTotalWeight,
									manufProductID, whichUsersChangedByPrice, whichUsersChangedByExcluded, 
									uppDTOListPriceB4, 
									/*uppDTOListPriceAfter*/uppDTOListActiveUsersOnlyAfter,
									wereWgtDimChanged);
			
			return SUCCESS;
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}
	
	/**
	 * @author Rafael Padron
	 */
	public void handleAlterProductXML(ProductDTO productDTO, long brand, long category, 
			long mainSpecification, String imageRealName, Integer statusId, String nameEn, String nameFr,
			String descriptionEn, String descriptionFr,
			String specificationEn, String specificationFr,
			String otherEng, String otherFr, String warrantyEng, String warrantyFr,
			String msrp, String large, String width, String high, String weight,
			Double boxLength, Double boxWidth, Double boxHeight, Double boxTotalWeight,
			String manufProductID, List<Long> whichUsersChangedByPrice,
			List<Long> whichUsersChangedByExcluded, List<UserProductPriceDTO> uppDTOListPriceB4,
			List<UserProductPriceDTO> uppDTOListPriceAfter, boolean wereWgtDimChanged) {
		
		final boolean TO_BE_EXECUTED = true;
		
		// Related to AlterProductXML.class
		boolean brand_xml = false;
		boolean category_xml = false;
		boolean mainSpecification_xml = false;
		boolean image_xml = false;
		boolean status_xml = false;
		boolean nameEn_xml = false;
		boolean nameFr_xml = false;
		boolean descriptionEn_xml = false;
		boolean descriptionFr_xml = false;
		boolean specificationEn_xml = false;
		boolean specificationFr_xml = false;
		boolean otherEng_xml = false;
		boolean otherFr_xml = false;
		boolean warrantyEng_xml = false;
		boolean warrantyFr_xml = false;
		boolean msrp_xml = false;
		boolean shipping_xml = false;	// to remove
		boolean shipment_xml = false;	//New variable used for the xml product feed
		boolean dimensions_xml = false;
		boolean weight_xml = false;
		boolean modelNumber_xml = false;
		
		boolean product_to_be_executed_xml = false;
		
		// Related to AlterUserProductXML.class
		boolean priceDiscount_xml = false;	// to remove
		boolean price_xml = false;		//New variable used for the xml product feed
		boolean excluded_xml = false;
		
		try {			
			long productId = productDTO.getId();
			
			AlterProductXMLDTO apxDTOBefore = productService.getAlterProductXML(productId);
			
			boolean apxAlreadyExecuted = false;
			
			boolean isAPXBrandAlready = false;
			boolean isAPXCategoryAlready = false;
			boolean isAPXMainSpecAlready = false;
			boolean isAPXImageAlready = false;
			boolean isAPXStatusAlready = false;
			boolean isAPXNameEnAlready = false;
			boolean isAPXNameFrAlready = false;
			boolean isAPXDescEnAlready = false;
			boolean isAPXDescFrAlready = false;
			boolean isAPXSpecEnAlready = false;
			boolean isAPXSpecFrAlready = false;
			boolean isAPXOtherEnAlready = false;
			boolean isAPXOtherFrAlready = false;
			boolean isAPXWarrantyEnAlready = false;
			boolean isAPXWarrantyFrAlready = false;
			boolean isAPXMSRPAlready = false;
			boolean isAPXShippingAlready = false;
			boolean isAPXDimsAlready = false;
			boolean isAPXWgtAlready = false;
			boolean isAPXModelNoAlready = false;			
			
			boolean apxExists = (apxDTOBefore != null);
			if (apxExists) {
				apxAlreadyExecuted = apxDTOBefore.getProductToBeExecuted();
				
				isAPXBrandAlready = apxDTOBefore.getBrandId();
				isAPXCategoryAlready = apxDTOBefore.getCategoryId();
				isAPXMainSpecAlready = apxDTOBefore.getTypeId();
				isAPXImageAlready = apxDTOBefore.getImageId();
				isAPXStatusAlready = apxDTOBefore.getStatusId();
				isAPXNameEnAlready = apxDTOBefore.getNameEn();
				isAPXNameFrAlready = apxDTOBefore.getNameFr();
				isAPXDescEnAlready = apxDTOBefore.getDescriptionEn();
				isAPXDescFrAlready = apxDTOBefore.getDescriptionFr();
				isAPXSpecEnAlready = apxDTOBefore.getSpecificationEn();
				isAPXSpecFrAlready = apxDTOBefore.getSpecificationFr();
				isAPXOtherEnAlready = apxDTOBefore.getOtherEn();
				isAPXOtherFrAlready = apxDTOBefore.getOtherFr();
				isAPXWarrantyEnAlready = apxDTOBefore.getWarrantyEn();
				isAPXWarrantyFrAlready = apxDTOBefore.getWarrantyFr();
				isAPXMSRPAlready = apxDTOBefore.getMsrp();
				isAPXShippingAlready = apxDTOBefore.getShipping();
				isAPXDimsAlready = apxDTOBefore.getDimensions();
				isAPXWgtAlready = apxDTOBefore.getWeight();
				isAPXModelNoAlready = apxDTOBefore.getModelNumber();				
			}
			
			String descriptionEnCell = "", descriptionEnDB = "", descriptionFrCell = "", descriptionFrDB = "";
			String specificationEnCell = "", specificationEnDB = "", specificationFrCell = "", specificationFrDB = "";
			String otherEnCell = "", otherEnDB = "", otherFrCell = "", otherFrDB = "";
			
			if (productDTO.getBrand() != null) {
				brand_xml = (brand != productDTO.getBrand().getId());
				if (apxExists) if (apxAlreadyExecuted) if (isAPXBrandAlready) brand_xml = true;
			}
			
			if (productDTO.getCategory() != null) {
				category_xml = (category != productDTO.getCategory().getId());
				if (apxExists) if (apxAlreadyExecuted) if (isAPXCategoryAlready) category_xml = true;
			}			
			
			if (productDTO.getMainFilterTypeId() != null) {
				if (productDTO.getMainFilterTypeId() != 0L && productDTO.getMainFilterTypeId() != 51) {
					mainSpecification_xml = (mainSpecification != productDTO.getMainFilterTypeId().longValue());
				}
				if (apxExists) if (apxAlreadyExecuted) if (isAPXMainSpecAlready) mainSpecification_xml = true;
			}
			
			if (imageRealName != null && productDTO.getOldImageRealName() != null) {
					image_xml = (!imageRealName.equalsIgnoreCase(productDTO.getOldImageRealName()));
					if (apxExists) if (apxAlreadyExecuted) if (isAPXImageAlready) image_xml = true;
			}
			
			status_xml = (statusId != productDTO.getStatus().getValue());
			if (apxExists) if (apxAlreadyExecuted) if (isAPXStatusAlready) status_xml = true;
			
			if (nameEn != null && productDTO.getNameEng() != null) {
				nameEn_xml = (!nameEn.trim().equalsIgnoreCase(productDTO.getNameEng().getName().trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXNameEnAlready) nameEn_xml = true;
			}
			
			if (nameFr != null && productDTO.getNameFr() != null) {				
				nameFr_xml = (!nameFr.trim().equalsIgnoreCase(productDTO.getNameFr().getName().trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXNameFrAlready) nameFr_xml = true;
			}
			
			if (descriptionEn != null && productDTO.getDescriptionEng() != null) {
				descriptionEnCell = wsRipper(html2text(descriptionEn.trim()));
				descriptionEnDB = wsRipper(html2text(productDTO.getDescriptionEng().getName().trim()));				
				descriptionEn_xml = (!descriptionEnCell.trim().equalsIgnoreCase(descriptionEnDB.trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXDescEnAlready) descriptionEn_xml = true;
			}
			
			if (descriptionFr != null && productDTO.getDescriptionFr() != null) {
				descriptionFrCell = wsRipper(html2text(descriptionFr.trim()));
				descriptionFrDB = wsRipper(html2text(productDTO.getDescriptionFr().getName().trim()));				
				descriptionFr_xml = (!descriptionFrCell.trim().equalsIgnoreCase(descriptionFrDB.trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXDescFrAlready) descriptionFr_xml = true;
			}
			
			if (specificationEn != null && productDTO.getSpecificationEng() != null) {
				specificationEnCell = wsRipper(html2text(specificationEn.trim()));		
				specificationEnDB = wsRipper(html2text(productDTO.getSpecificationEng().getName().trim()));				
				specificationEn_xml = (!specificationEnCell.trim().equalsIgnoreCase(specificationEnDB.trim()));				
				if (apxExists) if (apxAlreadyExecuted) if (isAPXSpecEnAlready) specificationEn_xml = true;
			}
			
			if (specificationFr != null && productDTO.getSpecificationFr() != null) {
				specificationFrCell = wsRipper(html2text(specificationFr.trim()));				
				specificationFrDB = wsRipper(html2text(productDTO.getSpecificationFr().getName().trim()));				
				specificationFr_xml = (!specificationFrCell.trim().equalsIgnoreCase(specificationFrDB.trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXSpecFrAlready) specificationFr_xml = true;
			}
			
			if (otherEng != null && productDTO.getOtherEng() != null) {
				otherEnCell = wsRipper(html2text(otherEng.trim()));
				otherEnDB = wsRipper(html2text(productDTO.getOtherEng().getName().trim()));				
				otherEng_xml = (!otherEnCell.trim().equalsIgnoreCase(otherEnDB.trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXOtherEnAlready) otherEng_xml = true;
			}
			
			if (otherFr != null && productDTO.getOtherFr() != null) {
				otherFrCell = wsRipper(html2text(otherFr.trim()));
				otherFrDB = wsRipper(html2text(productDTO.getOtherFr().getName().trim()));							
				otherFr_xml = (!otherFrCell.trim().equalsIgnoreCase(otherFrDB.trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXOtherFrAlready) otherFr_xml = true;
			}
			
			if (warrantyEng != null && productDTO.getWarrantyEng() != null) {
				warrantyEng_xml = (!warrantyEng.trim().equalsIgnoreCase(productDTO.getWarrantyEng().getName().trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXWarrantyEnAlready) warrantyEng_xml = true;
			}
			
			if (warrantyFr != null && productDTO.getWarrantyFr() != null) {
				warrantyFr_xml = (!warrantyFr.trim().equalsIgnoreCase(productDTO.getWarrantyFr().getName().trim()));
				if (apxExists) if (apxAlreadyExecuted) if (isAPXWarrantyFrAlready) warrantyFr_xml = true;
			}
			
			msrp_xml = (!msrp.equalsIgnoreCase(productDTO.getMsrp()));
			if (apxExists) if (apxAlreadyExecuted) if (isAPXMSRPAlready) msrp_xml = true;

			/*
			//Before we used Product Sizes/Weight for the XML files
			dimensions_xml = (!large.equalsIgnoreCase(productDTO.getLarge()) 
							  || !width.equalsIgnoreCase(productDTO.getWidth())
							  || !high.equalsIgnoreCase(productDTO.getHigh()));
			if (apxExists) if (apxAlreadyExecuted) if (isAPXDimsAlready) dimensions_xml = true;			
			
			weight_xml = (!weight.equalsIgnoreCase(productDTO.getWeight()));
			if (apxExists) if (apxAlreadyExecuted) if (isAPXWgtAlready) weight_xml = true;
			*/
			
			//Now we use Box Sizes/Weight for the XML files 
			dimensions_xml = ((productDTO.getBoxLength()!=null)? !boxLength.equals(productDTO.getBoxLength()): false
					|| (productDTO.getBoxWidth()!=null)? !boxWidth.equals(productDTO.getBoxWidth()): false
					|| (productDTO.getBoxHeight()!=null)? !boxHeight.equals(productDTO.getBoxHeight()): false);
			if (apxExists) if (apxAlreadyExecuted) if (isAPXDimsAlready) dimensions_xml = true;
			
			weight_xml = ((productDTO.getBoxTotalWeight()!=null)? !boxTotalWeight.equals(productDTO.getBoxTotalWeight()): false);
			if (apxExists) if (apxAlreadyExecuted) if (isAPXWgtAlready) weight_xml = true;
				
			shipping_xml = wereWgtDimChanged;
			if (apxExists) if (apxAlreadyExecuted) if (isAPXShippingAlready) shipping_xml = true;
			
			shipment_xml = wereWgtDimChanged;
			if (apxExists) if (apxAlreadyExecuted) if (isAPXShippingAlready) shipment_xml = true;
						
			if (productDTO.getManufactureProductList() != null) {
				if (productDTO.getManufactureProductList().size() == 1) {
					for (ProductModelDTO productModelDTO : productDTO.getManufactureProductList()) {
						if (productModelDTO != null && productModelDTO.getName() != null) {
							modelNumber_xml = !productModelDTO.getName().trim().equalsIgnoreCase(manufProductID.trim());
						}
					}
				}
			}
			if (apxExists) if (apxAlreadyExecuted) if (isAPXModelNoAlready) modelNumber_xml = true;
			
			
			product_to_be_executed_xml = brand_xml || category_xml || mainSpecification_xml 
										|| image_xml || status_xml || nameEn_xml 
										|| nameFr_xml || descriptionEn_xml || descriptionFr_xml
										|| specificationEn_xml || specificationFr_xml || otherEng_xml
										|| otherFr_xml || warrantyEng_xml || warrantyFr_xml
										|| dimensions_xml || weight_xml || modelNumber_xml
										|| msrp_xml || /*shipping_xml*/ shipment_xml;
			
			AlterProductXMLDTO alterProductXMLDTO = new AlterProductXMLDTO();
			alterProductXMLDTO.setProductId(productId);
			alterProductXMLDTO.setBrandId(brand_xml);
			alterProductXMLDTO.setCategoryId(category_xml);
			alterProductXMLDTO.setTypeId(mainSpecification_xml);
			alterProductXMLDTO.setImageId(image_xml);
			alterProductXMLDTO.setStatusId(status_xml);
			alterProductXMLDTO.setNameEn(nameEn_xml);
			alterProductXMLDTO.setNameFr(nameFr_xml);
			alterProductXMLDTO.setDescriptionEn(descriptionEn_xml);
			alterProductXMLDTO.setDescriptionFr(descriptionFr_xml);
			alterProductXMLDTO.setSpecificationEn(specificationEn_xml);
			alterProductXMLDTO.setSpecificationFr(specificationFr_xml);
			alterProductXMLDTO.setOtherEn(otherEng_xml);
			alterProductXMLDTO.setOtherFr(otherFr_xml);
			alterProductXMLDTO.setWarrantyEn(warrantyEng_xml);
			alterProductXMLDTO.setWarrantyFr(warrantyFr_xml);
			alterProductXMLDTO.setDimensions(dimensions_xml);
			alterProductXMLDTO.setWeight(weight_xml);
			alterProductXMLDTO.setModelNumber(modelNumber_xml);
			alterProductXMLDTO.setMsrp(msrp_xml);
			alterProductXMLDTO.setShipping(shipping_xml);
			alterProductXMLDTO.setShipment(shipment_xml);
			alterProductXMLDTO.setProductToBeExecuted(product_to_be_executed_xml);
			if (productService.existsOnAlterProductXML(productId)) {
				productService.updateAlterProductXML(alterProductXMLDTO);
			} else {
				productService.createAlterProductXML(alterProductXMLDTO);
			}
			
			if (didPriceListChange(uppDTOListPriceB4, uppDTOListPriceAfter)) {
				AlterUserProductXMLDTO alterUserProductXMLDTO = new AlterUserProductXMLDTO();
				if (whichUsersChangedByPrice != null && whichUsersChangedByPrice.size() > 0) {
					AlterUserProductXMLDTO aupxDTOBefore = null;
					boolean aupxExists = false;
					boolean aupxAlreadyExecuted = false;
					boolean isAUPXPricingAlready = false;
					boolean user_product_to_be_executed = false;
					
					for (long userId_price : whichUsersChangedByPrice) {
						
						aupxDTOBefore = productService.getAlterUserProductXML(userId_price, productId);
						
						aupxExists = (aupxDTOBefore != null);
						if (aupxExists) {
							aupxAlreadyExecuted = aupxDTOBefore.getUserProductToBeExecuted();
							isAUPXPricingAlready = aupxDTOBefore.getPriceDiscount();
							priceDiscount_xml = aupxDTOBefore.getPriceDiscount();
							price_xml = aupxDTOBefore.getPrice();
						}
						
						if (!priceDiscount_xml) {
							priceDiscount_xml = analyzePriceDiscount(userId_price, uppDTOListPriceB4, uppDTOListPriceAfter);
							if (aupxExists) if (aupxAlreadyExecuted) if (isAUPXPricingAlready) priceDiscount_xml = true;
						}
						
						if (!price_xml) {
							price_xml = analyzePriceDiscount(userId_price, uppDTOListPriceB4, uppDTOListPriceAfter);
							if (aupxExists) if (aupxAlreadyExecuted) if (isAUPXPricingAlready) priceDiscount_xml = true;
						}	
						
						// Does this user exist in the UPP-list [for price]?
						// If so, it means that this value shouldn't be excluded or simply just must be rendered 
						// in the XML-File to generate.
						excluded_xml = !analyzeExcluded(userId_price, uppDTOListPriceAfter);
						user_product_to_be_executed = priceDiscount_xml ? priceDiscount_xml : user_product_to_be_executed;
						alterUserProductXMLDTO = new AlterUserProductXMLDTO();
						alterUserProductXMLDTO.setUserId(userId_price);
						alterUserProductXMLDTO.setProductId(productId);
						alterUserProductXMLDTO.setPriceDiscount(priceDiscount_xml);
						alterUserProductXMLDTO.setPrice(price_xml);
						alterUserProductXMLDTO.setShipping(false);
						alterUserProductXMLDTO.setExcluded(excluded_xml);
						alterUserProductXMLDTO.setExcludedMeaning(false);
						alterUserProductXMLDTO.setUserProductToBeExecuted(user_product_to_be_executed);	// TO_BE_EXECUTED
						if (productService.existsOnAlterUserProductXML(productId, userId_price)) {
							productService.updateAlterUserProductXML(alterUserProductXMLDTO);
						} else {
							productService.createAlterUserProductXML(alterUserProductXMLDTO);
						}
												
					}
				}
				
				if (whichUsersChangedByExcluded != null && whichUsersChangedByExcluded.size() > 0) {
					for (long userId_excluded : whichUsersChangedByExcluded) {
						alterUserProductXMLDTO = new AlterUserProductXMLDTO();
						alterUserProductXMLDTO.setUserId(userId_excluded);
						alterUserProductXMLDTO.setProductId(productId);
						alterUserProductXMLDTO.setPriceDiscount(false);
						alterUserProductXMLDTO.setPrice(false);
						alterUserProductXMLDTO.setShipping(false);
						alterUserProductXMLDTO.setExcluded(true);
						alterUserProductXMLDTO.setExcludedMeaning(true);
						alterUserProductXMLDTO.setUserProductToBeExecuted(false);
						if (productService.existsOnAlterUserProductXML(productId, userId_excluded)) {
							productService.updateAlterUserProductXML(alterUserProductXMLDTO);
						} else {
							productService.createAlterUserProductXML(alterUserProductXMLDTO);
						}
					}
				}
			} else {
				long userId = 0L;
				AlterUserProductXMLDTO alterUserProductXMLDTO = new AlterUserProductXMLDTO();
				for (UserProductPriceDTO userProductPriceDTO : uppDTOListPriceAfter) {
					alterUserProductXMLDTO = new AlterUserProductXMLDTO();
					userId = userProductPriceDTO.getUserId();
					alterUserProductXMLDTO.setUserId(userId);
					alterUserProductXMLDTO.setProductId(productId);
					alterUserProductXMLDTO.setPriceDiscount(false);
					alterUserProductXMLDTO.setPrice(false);
					alterUserProductXMLDTO.setShipping(false);
					alterUserProductXMLDTO.setExcluded(false);
					alterUserProductXMLDTO.setExcludedMeaning(userProductPriceDTO.getExcluded());
					alterUserProductXMLDTO.setUserProductToBeExecuted(false);
					if (productService.existsOnAlterUserProductXML(productId, userId)) {
						productService.updateAlterUserProductXML(alterUserProductXMLDTO);
					} else {
						productService.createAlterUserProductXML(alterUserProductXMLDTO);
					}
				}
				
				if (!product_to_be_executed_xml) {
					productService.closeProductConsideredForXML(productId);
				}				
			}
			
		} catch(ServiceException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("loyauty.error.common.service"));
		}
	}
	
	private boolean analyzePriceDiscount(long userId, List<UserProductPriceDTO> uppDTOListPriceB4, 
								List<UserProductPriceDTO> uppDTOListPriceAfter) {
		boolean outcome = false;
		if ((uppDTOListPriceB4 == null && uppDTOListPriceAfter != null) 
			|| (uppDTOListPriceB4 != null && uppDTOListPriceAfter == null)) {
			outcome = true;
		} else if (uppDTOListPriceB4 == null && uppDTOListPriceAfter == null) {
			outcome = false;
		} else if (uppDTOListPriceB4 != null && uppDTOListPriceAfter != null) {
			if (uppDTOListPriceB4.size() == uppDTOListPriceAfter.size()) {
				int SIZE_before = uppDTOListPriceB4.size();
				int SIZE = SIZE_before;
				if (SIZE > 0) {
					String before = "";
					UserProductPriceDTO upp$DTO_0 = new UserProductPriceDTO();
					for (Iterator<UserProductPriceDTO> itUPPBefore = uppDTOListPriceB4.iterator(); itUPPBefore.hasNext();) {
						upp$DTO_0 = itUPPBefore.next();
						if (userId == upp$DTO_0.getUserId()) {
							before = upp$DTO_0.getPrice();
						}
					}
					
					String after = "";
					UserProductPriceDTO upp$DTO_f = new UserProductPriceDTO();
					for (Iterator<UserProductPriceDTO> itUPPAfter = uppDTOListPriceAfter.iterator(); itUPPAfter.hasNext();) {
						upp$DTO_f = itUPPAfter.next();
						if (userId == upp$DTO_f.getUserId()) {
							after = upp$DTO_f.getPrice();
						}
					}
					//outcome = !before.trim().equalsIgnoreCase(after.trim());
					if(before!=null && !before.trim().equals("") && after!=null && !after.trim().equals(""))
						outcome = !before.trim().equalsIgnoreCase(after.trim());
				}	// else OR SIZE=0 ==> outcome <-- false;
			} else {
				outcome = true;
			}
		}
		return outcome;		
	}
	
	private boolean analyzeExcluded(long userId, List<UserProductPriceDTO> uppDTOListPriceAfter) {
		boolean outcome = false;
		if (uppDTOListPriceAfter != null && uppDTOListPriceAfter.size() > 0) {
			for (UserProductPriceDTO userProductPriceDTO : uppDTOListPriceAfter) {
				outcome |= (userId == userProductPriceDTO.getUserId().longValue());
			}
		}
		return outcome;
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
	
	private void updateListManufactureProduct(int position, String value, int quantity, String suppliers, String price, String msrp) {
	    //lack to remove
		if(productDTO.getManufactureProductList().size() >= position +1) {
			((ProductModelDTO)productDTO.getManufactureProductList().get(position)).setName(value);
			((ProductModelDTO)productDTO.getManufactureProductList().get(position)).setQuantity(quantity);
			((ProductModelDTO)productDTO.getManufactureProductList().get(position)).setSupplier(suppliers);
			((ProductModelDTO)productDTO.getManufactureProductList().get(position)).setPrice(price);
			((ProductModelDTO)productDTO.getManufactureProductList().get(position)).setMsrp(msrp);
		} else {
			productDTO.getManufactureProductList().add(ProductModelDTO.valueOf(0, value, quantity, suppliers, price, msrp));
		}
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
    
    private String html2text(String html) {
        return Jsoup.parse(html).text();
    }
    
    private boolean didPriceListChange(	List<UserProductPriceDTO> uppDTOListBefore, 
    									List<UserProductPriceDTO> uppDTOListAfter) {
    	boolean outcome = false;
    	int b4 = 0, after = 0;
    	
    	long userId$B4 = 0L;
    	long userId$After = 0L;
    	Set<Long> allUserIdsSet = new HashSet<Long>();
    	
    	for (UserProductPriceDTO uppDTOB4 : uppDTOListBefore) {    		
    		userId$B4 =  uppDTOB4.getUserId();
    		allUserIdsSet.add(userId$B4);
    		if (!uppDTOB4.getExcluded()) ++b4;
    	}
    	
    	for (UserProductPriceDTO uppDTOAfter : uppDTOListAfter) {
    		userId$After = uppDTOAfter.getUserId();
    		allUserIdsSet.add(userId$After);
    		if (!uppDTOAfter.getExcluded()) ++after;
    	}
    	
    	if (b4 == after) {
    		for (long userId : allUserIdsSet) {
    			outcome |= analyzePriceDiscount(userId, uppDTOListBefore, uppDTOListAfter);
    		}
    	} else {
    		outcome = true;
    	}
    	
    	return outcome;
    }
    
	private String wsRipper(String input) {
		String outcome = "";
		if (input.length() > 0) {
			char[] aCharArray = input.toCharArray();
			for (char c : aCharArray) {
				if (c != ' ') {
					outcome += c;
				}
			}
		}
		return outcome;
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