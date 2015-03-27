package com.loyauty.web.struts.action.user;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class EditUser extends LoyautyAction {
	
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private ProductService productService;
	private OperationsService operationsService;
	
	@Getter @Setter
	private long userId;
	@Getter @Setter
	private String login;
	@Getter @Setter
	private String code;
	@Getter @Setter
	private Integer type;
	@Getter @Setter
	private String typeName;
	@Getter @Setter
	private String password;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private String realName;
	@Getter @Setter
	private String address;
	@Getter @Setter
	private String postalCode;
	@Getter @Setter
	private String phone;
	@Getter @Setter
	private Boolean active;
	@Getter @Setter
	private Integer primaryLanguage;
	@Getter @Setter
	private Integer secondaryLanguage;
	@Getter @Setter
	private String multiplier;
	@Getter @Setter
	private String note;
	@Getter @Setter
	private String specialHandlingName;
	@Getter @Setter
	private Double specialHandlingFee;
	@Getter @Setter
	private Double shippingInsuranceMultiplier;
	
	@Getter @Setter
	private CurrencyDTO currencyDTO;
	@Getter @Setter
	private Integer currencyIndex;
	//uploading files
	@Getter @Setter
	private int width;
	@Getter @Setter	
	private File userImage; 
	@Getter @Setter
	private String userImageContentType;
	@Getter @Setter
	private String userImageFileName;
	@Getter @Setter
	private ImageDTO imgDTO;
	@Getter @Setter
	private UserDTO userDTO;
	@Getter @Setter
	private Long clientCategoryId;
	@Getter @Setter
	private Long clientCategoryIdCopy;
	@Getter @Setter
	private String clientCategoryName;
	@Getter @Setter
	private Date updateDate;
	@Getter @Setter
	private String strUpdateDate;
	@Getter @Setter
	private Long tempSignal;
	@Getter @Setter
	private Date lastUpdateDate;
	@Getter @Setter
	private Date createdDate;
	
	@Getter @Setter
	private List<UserProvincePopulationDTO> provinceNameList;	
	@Getter @Setter
	private String[] provinceName;	
	@Getter @Setter
	String[] populationPercentage;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	@Getter @Setter
	private List<OperationsDTO> opertionsDTOList; 
	
	@Getter @Setter
	private List<CurrencyDTO> currencyDTOList;
	
	
	@Getter @Setter
	private String currencyValue;
	
	public EditUser() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();
		operationsService=getServiceLocator().getOperationsService();
	}
	
	@Override
	public void prepare() throws ServiceException {
	}
	
	public String execute() throws Exception {

		try {
			
			System.out.println("We are in edituser.do");
			
			listClientCategory=userService.getAllClientCategory();
			opertionsDTOList=operationsService.getOperationsByTypeAndObject(userId,"User");
			userDTO = userService.getUserInformation(userId);
			
			//Get Currency
			List<CurrencyDTO> currDTOList;
			currDTOList = productService.getCurrencySymbols();
			currencyIndex = 0; 
			int index = 0;
			if(currDTOList!=null) { 
				currencyDTOList = new ArrayList<CurrencyDTO>(); 
				for(CurrencyDTO currencyDTO : currDTOList){
					currencyDTO = productService.getCurrencyBySymbol(currencyDTO);
					if(currencyDTO!=null) {
						currencyDTOList.add(currencyDTO);
						if(userDTO!=null && userDTO.getCurrencyId()!=null
								&& currencyDTO.getId() == userDTO.getCurrencyId()) {
							currencyIndex = index;
							currencyValue=currencyDTO.getSymbol();
						}
					}
					index++;
				}
			}//Get Currency
			
			createdDate=userDTO.getCreationDate();
			updateDate=new Date();
			lastUpdateDate=null;
			clientCategoryId=null;
			if(userDTO.getClientCategoryId()!=null){
				clientCategoryId =userDTO.getClientCategoryId();
				clientCategoryIdCopy=userDTO.getClientCategoryId();
			}
			if(userDTO.getUpdateDate()!=null){
				lastUpdateDate=userDTO.getUpdateDate();
			}
			
			userDTO.setId(userId);
			login = userDTO.getLogin();
			code = userDTO.getCode();
			type = userDTO.getTypeId();
			password = userDTO.getPassword();
			email = userDTO.getEmail();
			active = userDTO.isActive();
			realName = userDTO.getRealName();
			address = userDTO.getAddress();
			postalCode = userDTO.getPostalCode();
			phone = userDTO.getPhone();
			primaryLanguage = userDTO.getPrimaryLanguage();
			secondaryLanguage = userDTO.getSecondaryLanguage();
			multiplier = userDTO.getMultiplier();			
			note=userDTO.getNote();
			specialHandlingName = userDTO.getSpecialHandlingName();
			specialHandlingFee = userDTO.getSpecialHandlingFee();
			shippingInsuranceMultiplier = userDTO.getShippingInsuranceMultiplier();
			provinceNameList = productService.getUserProvincePopulationList(userId);
			final int SIZE = provinceNameList.size();
			provinceName = new String[SIZE];
			populationPercentage = new String[SIZE];
			
			ProvinceDTO provinceDTO = new ProvinceDTO();
			long provinceId = 0L;
			int count = 0;
			for (UserProvincePopulationDTO userProvincePopulationDTO : provinceNameList) {
				provinceId = userProvincePopulationDTO.getProvinceId();
				provinceDTO = productService.getProvince(provinceId);
				provinceName[count] = provinceDTO.getName();
				populationPercentage[count] = userProvincePopulationDTO.getPopulationPercent();
				++count;
			}

			return INPUT;
			
		} catch(ServiceException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return SUCCESS;

	}
	
}
