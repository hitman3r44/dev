package com.loyauty.web.struts.action.user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.enums.Province;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class AddUser extends LoyautyAction {
	
	private static final long serialVersionUID = -3029883105202758852L;
	
	private UserService userService;
	private ProductService productService;
	private OperationsService operationsService;
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
	private String age;
	@Getter @Setter
	private String address;
	@Getter @Setter
	private String postalCode;
	@Getter @Setter
	private String phone1;
	@Getter @Setter
	private String phone2;
	@Getter @Setter
	private String phone3;
	@Getter @Setter
	private Boolean active;
	@Getter @Setter
	private Integer primaryLanguage;
	@Getter @Setter
	private Integer secondaryLanguage;
	@Getter @Setter
	private String specialHandlingName;
	@Getter @Setter
	private Double specialHandlingFee;
	@Getter @Setter
	private Double shippingInsuranceMultiplier;
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
	private String message;
	@Getter @Setter
	private String multiplier;
	@Getter @Setter
	private Long clientCategoryId;
	@Getter @Setter
	private Long managerId;
	@Getter @Setter
	private String clientCategoryName;
	
	@Getter @Setter
	private List<UserProvincePopulationDTO> provinceNameList;
	@Getter @Setter
	private String[] provinceName;
	@Getter @Setter
	String[] populationPercentage;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	
	@Getter @Setter
	private CurrencyDTO currencyDTO;
	
	public AddUser () throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();	
		operationsService=getServiceLocator().getOperationsService();
	}
	
	@Override
	public void validate() {
		
		if(login.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.login"));		
		try {
			if(userService.usernameExists(login.trim()))
				addActionError(getText("loyauty.error.common.user.nameAlreadyExist"));
		} catch (ServiceException sx) {
			addActionError(getText("loyauty.error.common.service"));
		}
		
		if(password.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.password"));
		
		if (type != UserType.ADMIN.getValue()) {
			if(type == -1)
				addActionError(getText("loyauty.error.common.user.type"));
			if(primaryLanguage == -1)
				addActionError(getText("loyauty.error.common.user.primaryLanguage"));
			if(address.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.address"));
			if(postalCode.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.postalCode"));
			if(phone1.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.phone"));
			if(phone2.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.phone"));
			if(phone3.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.phone"));
			if(email.trim().length() == 0)
				addActionError(getText("loyauty.error.common.user.email"));
			
			try {
				if(userService.emailExists(email.trim()))
					addActionError(getText("loyauty.error.common.user.emailAlreadyExist"));
				// Integer.parseInt(age);
			} catch (ServiceException sx) {
				addActionError(getText("loyauty.error.common.user.nameAlreadyExist"));
			} catch (NumberFormatException nfx) {
				addActionError(getText("loyauty.error.common.user.ageNumberFormat"));
			}
		}		
	}
		
	@Override  
	public String execute() throws Exception {
		
		try {
			
			OperationsDTO operationDTO=new OperationsDTO();
			UserDTO userDTO = UserDTO.valueOf(login, password);
			userDTO.setTypeId(type);
			userDTO.setActive(active);
			userDTO.setCurrencyId(currencyDTO.getId());
			listClientCategory=userService.getAllClientCategory();	
			if (type == UserType.USER.getValue() 
					|| type == UserType.VIEWER.getValue() 
					|| type == UserType.AMENDER.getValue()) {
				userDTO.setCode(code);
				userDTO.setAddress(address);
				userDTO.setSpecialHandlingName(specialHandlingName);
				userDTO.setSpecialHandlingFee(specialHandlingFee);
				userDTO.setShippingInsuranceMultiplier(shippingInsuranceMultiplier);
				// userDTO.setAge(Integer.valueOf(age));
				userDTO.setEmail(email);
				userDTO.setPhone(phone1 + "-" + phone2 + "-" + phone3);
				userDTO.setPostalCode(postalCode);
				userDTO.setRealName(realName);
				userDTO.setPrimaryLanguage(primaryLanguage);
				userDTO.setSecondaryLanguage(secondaryLanguage);

				userDTO.setMultiplier(multiplier);
			} else if (type == UserType.ADMIN.getValue()) {
				userDTO.setCode(code.equalsIgnoreCase("") ? "" : code);
				userDTO.setAddress(address.equalsIgnoreCase("") ? "Montreal, QC" : address);
				// userDTO.setAge(age.equalsIgnoreCase("") ? 0 : Integer.valueOf(age));
				userDTO.setEmail(email.equalsIgnoreCase("") ? (login + "@" + login + "." + login) : email);
				userDTO.setPhone(phone1.equalsIgnoreCase("")
									&& phone2.equalsIgnoreCase("")
									&& phone3.equalsIgnoreCase("")
										? "" 
										: (phone1 + "-" + phone2 + "-" + phone3));
				userDTO.setPostalCode(postalCode.equalsIgnoreCase("") ? "H4C 3C5" : postalCode);
				userDTO.setRealName(realName.equalsIgnoreCase("") ? login : realName);
				userDTO.setPrimaryLanguage(primaryLanguage == -1 ? 1 : primaryLanguage);
				userDTO.setSecondaryLanguage(secondaryLanguage == -1 ? 2 : secondaryLanguage);
				userDTO.setMultiplier("");
			}
			
			userDTO.setClientCategoryId(clientCategoryId);
			userDTO.setManagerId(managerId);
			long userId = userService.createUser(userDTO);
			
	
			operationDTO.setOperationType("Creation User");
			operationDTO.setDataBefore("");
			String dataAfter="[";
			dataAfter+="User ID:"+userId+";";
			if(login!=null)dataAfter+="login:"+login+";";
			if(realName!=null)dataAfter+="Real name:"+realName+";";
			dataAfter+="]";
			operationDTO.setDataAfter(dataAfter);
			operationDTO.setObjectId(userId);
			operationDTO.setUserId(managerId);
			operationsService.insertOperation(operationDTO);
		
			if (type == UserType.USER.getValue()) {			
				long provinceId = 0L;
				Province[] provinceEnums = null;
			
				ShippingTotalDTO shippingTotalDTO = new ShippingTotalDTO();
				List<Long> productIdsList = productService.getAllValidProductIds();
				for (Long productId : productIdsList) {
					provinceEnums = Province.values();
					for (Province province : provinceEnums) {
						provinceId = (long) province.getValue();
						shippingTotalDTO = new ShippingTotalDTO();
						shippingTotalDTO.setProductId(productId);
						shippingTotalDTO.setProvinceId(provinceId);
						shippingTotalDTO.setUserId(userId);
						productService.createShippingTotal(shippingTotalDTO);
					}
				}
			
				UserProvincePopulationDTO userProvincePopulationDTO = new UserProvincePopulationDTO();
				provinceEnums = Province.values();
				int count = 0;
				for (Province province : provinceEnums) {
					provinceId = (long) province.getValue();
					userProvincePopulationDTO = new UserProvincePopulationDTO();
					userProvincePopulationDTO.setUserId(userId);
					userProvincePopulationDTO.setProvinceId(provinceId);
					userProvincePopulationDTO.setPopulationPercent(populationPercentage[count]);
					productService.createUserProvincePopulation(userProvincePopulationDTO);
					++count;
				}		
			}			
			message = "User Created Successfully";
			
			ClientCategoryDTO clDTO = userService.getClientCategoryById(clientCategoryId);	
			if (clDTO != null) clientCategoryName = clDTO.getClientCategoryName();
			
			userService.updateClientCategoryID(clientCategoryId, userId);
			appendTheNewUserIdIntoFile(clientCategoryId, userId);
					
			
			return SUCCESS;
		//}
		//catch(ServiceException e){
		//	log.debug("Service Error when loading file");
		//	addActionError(getText("loyauty.error.common.service"));
		}
		catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}
	
	private void appendTheNewUserIdIntoFile(long clientCategoryID, long userID) {
		try {
			String whereData = BackEndConstants.SHIPPING_DIR + "newusers.txt";
	    	File fileData = new File(whereData);
	    	if (!fileData.exists()) {
	    		fileData.createNewFile();
	    	}
		    FileWriter fw = new FileWriter(whereData, true); 
		    fw.write(userID + "\n");
		    fw.flush();
		    fw.close();
		} catch(IOException ioe) {
		    System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
}
