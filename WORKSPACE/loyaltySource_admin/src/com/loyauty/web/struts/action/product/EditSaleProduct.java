package com.loyauty.web.struts.action.product;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;

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
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductLinkDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.CommonUtils;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class EditSaleProduct extends LoyautyAction{
	private static final long serialVersionUID = -5162061504759408826L;

	

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
	@Getter @Setter
	private Integer thisProductForSale;
	@Getter @Setter
	private Boolean salesByDate;
	@Getter @Setter
	private Boolean saleForAllCleint;
	@Getter @Setter
	private String strUsersId;
	
	@Getter @Setter
	private Boolean futurSUB;
	@Getter @Setter
	private Date startDate=new Date();
	@Getter @Setter
	private Date endDate=new Date();
	
	@Getter @Setter
	private String strStartDate="";
	@Getter @Setter
	private String strEndDate="";
	
	@Getter @Setter
	private ProductDTO saleProdctDTO;
	
	@Getter @Setter
	private Long saveSaleSignal;
	
	
	@Getter @Setter
	private Long salesByDateCheckbox;
	
	
	public  EditSaleProduct() throws ServiceLocatorException {
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
		} catch(Exception e) {
			e.printStackTrace();
			log.debug("Error when getting product in method prepare()");
		}
	}

	/**========================================================================
								execute
	   ========================================================================*/
	@SuppressWarnings("unchecked")
	@Override  
	public String execute() throws Exception {
		try {
			HttpSession session = request.getSession(true);
			SimpleDateFormat frmDate = new SimpleDateFormat("dd/MM/yyyy");
			brandList = commonService.getBrands();
			statusList = commonService.getAllProductStatuses();
			categoryList  = internationalizeName(commonService.getCategoriesByBrand(brand));
			mainSpecificationList = productService.getMainSpecificationByCategory(category);
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
			for (UserSessionDTO usrDTO : userNameList) {
				ProductDTO pDTO=productService.getSaleByProductIdAndUserId(productId, usrDTO.getId());
				if(pDTO!=null)usrDTO.setSelected(true);
			}
			upc=productDTO.getUpc();
			loyaltyProductId=productDTO.getLoyaltyProductId();
			msrp=productDTO.getMsrp();
			cost=productDTO.getCost();
			mainSpecificationName=productDTO.getSpecificationProduct();
			
			/*------------------------------------------
			 					Sale
			  ------------------------------------------*/

			if(saveSaleSignal!=null && saveSaleSignal!=0L){
				saleProdctDTO.setId(productId);
				Date startDate=getDateFromStr(strStartDate,frmDate);
				Date endDate=getDateFromStr(strEndDate,frmDate);
				saleProdctDTO.setStartDate(startDate);
				saleProdctDTO.setEndDate(endDate);
				//save sale price
				Double vaCost=TryParseDouble(productDTO.getCost());
				Double valMsrp=TryParseDouble(productDTO.getMsrp());
				Double salePrice=TryParseDouble(saleProdctDTO.getSalePrice()+"");
				Double salePercentProfit=((salePrice/vaCost)-1)*100;
				Double salePercentDiscount=((valMsrp-salePrice)/valMsrp)*100;
				salePercentProfit = (double) Math.round(salePercentProfit*100) / 100;
				salePercentDiscount = (double) Math.round(salePercentDiscount*100) / 100;
				saleProdctDTO.setSalePercentProfit(salePercentProfit);
				saleProdctDTO.setSalePercentDiscount(salePercentDiscount);
				saleProdctDTO.setSaleQt(saleProdctDTO.getQtMax());
				if(salesByDate ){
					saleProdctDTO.setQtMax(null);
				}else{
					saleProdctDTO.setStartDate(null);
					saleProdctDTO.setEndDate(null);
				}
				if(!futurSUB)saleProdctDTO.setLoyaltyProductIdSub(null);

				Long productSaleId=productService.addProductSale(saleProdctDTO); 
				if(productSaleId>0L)saleProdctDTO.setProductSaleId(productSaleId);
				List<Long> usersListSeleted =getUserDTOFromStrUserId(strUsersId,userNameList,saleForAllCleint);
				productService.addUserSale(saleProdctDTO,usersListSeleted);
				saleProdctDTO=productService.getSaleByProductId(productId);
				checkUserNameListSelected();
				return SUCCESS;

			}else{
				saleProdctDTO=productService.getSaleByProductId(productId);	
				if(saleProdctDTO!=null && saleProdctDTO.getStartDate()==null)salesByDate=false;
				if(saleProdctDTO!=null && (saleProdctDTO.getLoyaltyProductIdSub()==null || saleProdctDTO.getLoyaltyProductIdSub().equals("")))futurSUB=false;
				if(saleProdctDTO!=null)saleForAllCleint=productService.isThereUserHavenThisSale(saleProdctDTO.getProductSaleId());
			}

				
			if(saleProdctDTO==null){
				saleProdctDTO=new ProductDTO();
				strStartDate=frmDate.format(new Date());
				strEndDate=frmDate.format(new Date());
			}else{
				if(saleProdctDTO.getStartDate()!=null)strStartDate=frmDate.format(saleProdctDTO.getStartDate());
				if(saleProdctDTO.getEndDate()!=null)strEndDate=frmDate.format(saleProdctDTO.getEndDate());
			}

			if(salesByDate==null)salesByDate=true;
			if(saleForAllCleint==null)saleForAllCleint=true;
			//clean loyaltyProductIdSub
			loyaltyProductIdSub=saleProdctDTO.getLoyaltyProductIdSub();
			if(loyaltyProductIdSub!=null){
				loyaltyProductIdSub=getStrCleaned(loyaltyProductIdSub);
				saleProdctDTO.setLoyaltyProductIdSub(loyaltyProductIdSub);
				futurSUB=true;
				if(loyaltyProductIdSub.equals(""))futurSUB=false;
			}
			if(futurSUB==null)futurSUB=false;
			 checkUserNameListSelected();
			return SUCCESS;
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}

    
	/**========================================================================
								internationalizeName
	   ========================================================================*/
	private List<CommonDTO> internationalizeName(List<CategoryDTO> list){
		List<CommonDTO> commonListDTO = new ArrayList<CommonDTO>();
		CommonDTO commonDTO;
		for(CategoryDTO cat : list){
			commonDTO = CommonDTO.valueOf(cat.getId(), getText(cat.getCode()));			
			commonListDTO.add(commonDTO);
		}		
		return commonListDTO;
	}
    
	/**========================================================================
								getUserSessionDTO
	   ========================================================================*/
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
	
	/**========================================================================
 							getTabUsersIdFromStrUserId
	   ========================================================================*/
	List<Long> getUserDTOFromStrUserId(String strUsersId,List<UserSessionDTO> userNameList,boolean saleForAllCleint){
		
		List<Long>result=new ArrayList<Long>(); 
		
		List<Long> resultList=new ArrayList<Long>();
		if(strUsersId==null)strUsersId="";
		if(saleForAllCleint){
			for(UserSessionDTO usrDTO:userNameList){
				if(usrDTO!=null)resultList.add(usrDTO.getId());
			}
			return resultList;
		}
		String[] strTabUsersId=strUsersId.split(","); 
		for(int i=0;i<strTabUsersId.length;i++){
			Long userId=TryParseLong(strTabUsersId[i]);
			result.add(userId);
		}
		return result;
	}

	/**========================================================================
 							getStrCleaned
	   ========================================================================*/
	String getStrCleaned(String str){
		if(str==null)str="";
		str = str.replaceAll("\\s","");
		str=str.replaceAll("\'","");
		str=str.replaceAll("\"","");
		str=str.replaceAll(";","");
		str=str.replaceAll(",","");
		return str;
	}

	/**========================================================================
 							get numeric from string
	   ========================================================================*/
	public Double TryParseDouble(String str){
		str=getStrCleaned(str);
		Double result=null;
	    try {
	    	result = Double.parseDouble(str);
	        return result;
	    } catch(NumberFormatException e) {
	        return -1d;
	    }
	}

	/**========================================================================
 							get numeric from string
	   ========================================================================*/
	public Long TryParseLong(String str){
		str=getStrCleaned(str);
		Long result=null;
		try {
			result = Long.parseLong(str);
			return result;
		} catch(NumberFormatException e) {
			return -1L;
		}
	}
	
	/**========================================================================
 							get numeric from string
	   ========================================================================*/
	public UserSessionDTO getUserSessionById(List<UserSessionDTO> userList,Long userId){
		UserSessionDTO result=null;
		for(UserSessionDTO us:userList){
			if(us.getId()!=0 && us.getId()==userId){
				result=us;
				break;
			}
		}
		return result;
	}

	/**========================================================================
 							get getDateFromStr from string
	   ========================================================================*/
	public Date getDateFromStr(String strDate,SimpleDateFormat frm){
		Date result=null;
		strDate=getStrCleaned(strDate);
	    try {
	    	result=frm.parse(strDate);
	        return result;
	    } catch(Exception e) {
	        return null;
	    }
	}
	
	/**========================================================================
 							check userNameList Selected
	   ========================================================================*/
	public void checkUserNameListSelected(){
		
		for (int i=0; i< userNameList.size();i++) {
			ProductDTO pDTO;
			try {
				pDTO = productService.getSaleByProductIdAndUserId(productId, userNameList.get(i).getId());
				userNameList.get(i).setSelected(false);
				if(pDTO!=null)userNameList.get(i).setSelected(true);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		
	}
	


}
