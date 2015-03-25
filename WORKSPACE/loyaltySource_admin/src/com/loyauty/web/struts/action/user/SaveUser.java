package com.loyauty.web.struts.action.user;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class SaveUser extends LoyautyAction {
	
	private static final long serialVersionUID = -3244770260165197690L;
	
	private UserService userService;
	private ProductService productService;
	private OperationsService operationsService;
		
	@Getter @Setter
	private UserSessionDTO userSession;
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
	private String age;
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
	private String specialHandlingName;
	@Getter @Setter
	private Double specialHandlingFee;
	@Getter @Setter
	private Double shippingInsuranceMultiplier;
	
	@Getter @Setter
	private CurrencyDTO currencyDTO;
	
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
	private String message;
	@Getter @Setter
	private Long clientCategoryId;
	@Getter @Setter
	private String multiplier;
	@Getter @Setter
	private List<UserProvincePopulationDTO> provinceNameList;	
	@Getter @Setter
	private String[] provinceName;	
	@Getter @Setter
	String[] populationPercentage;
	@Getter @Setter
	private Date updateDate;
	@Getter @Setter
	private String strUpdateDate;
	@Getter @Setter
	private String clientCategoryName;
	@Getter @Setter
	private String note;
	@Getter @Setter
	private Long managerId;
	
	public SaveUser() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();
		operationsService=getServiceLocator().getOperationsService();
	}
	
	@Override
	public void prepare() throws ServiceException {
		provinceNameList = productService.getUserProvincePopulationList(userId);
	}	
	
	@Override
	public void validate() {
		if(login.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.login"));
		if(password.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.password"));
		if(type == -1)
			addActionError(getText("loyauty.error.common.user.type"));
		if(primaryLanguage == -1)
			addActionError(getText("loyauty.error.common.user.primaryLanguage"));
		if(address.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.address"));
		if(postalCode.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.postalCode"));
		if(phone.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.phone"));
		if(email.trim().length() == 0)
			addActionError(getText("loyauty.error.common.user.email"));
		/*
		try {			
			Integer.parseInt(age);
		}
		catch(NumberFormatException mfe){
			addActionError(getText("loyauty.error.common.user.ageNumberFormat"));
		}
		*/
	}
	
	public String execute() throws Exception {
		
		try {
			
			UserDTO userDTOBefore = userService.getUserInformation(userId);

			/* get managerId */
			String managerLogin;
			User userManager=new User();
			OperationsDTO operationDTO=new OperationsDTO();
			userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if(userSession!=null){
				managerLogin=userSession.getLogin();
				userManager=userService.getUserByLogin(managerLogin);
			}
			managerId=userManager.getId();
    		if (((strUpdateDate)!=null)&&(!"".equals(strUpdateDate))){
    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    			try {
    				//Date date = sdf.parse(strUpdateDate);
    				//updateDate=date;
    				
    				//Date date = sdf.parse(strUpdateDate);
    				Date toDay=new Date();
    				Calendar toDayCalendar = Calendar.getInstance();
    				toDayCalendar.clear();
    				toDayCalendar.setTime(toDay);
    				int hours = toDayCalendar.get(Calendar.HOUR_OF_DAY);
    				int minutes = toDayCalendar.get(Calendar.MINUTE);
    				SimpleDateFormat frm=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    				Date date=frm.parse(strUpdateDate+" "+hours+":"+minutes+":00");
    				//Date date=sdf.parse(strUpdateDate);
    				System.out.println("Date:"+date);
    				updateDate=date;
    			}
    			catch (Exception pe) {
    				addActionError("Please enter a date in the correct format");
    			}
    		}
    		boolean recalculateShipping=false;
			if(clientCategoryId==null) clientCategoryId=-1L;
			UserDTO userDTO = UserDTO.valueOf(login, code, type, password, email, active.booleanValue(), realName, address, postalCode, phone, primaryLanguage, secondaryLanguage, multiplier, specialHandlingName, specialHandlingFee, shippingInsuranceMultiplier, currencyDTO.getId(), currencyDTO.getSymbol(), null, null);
			userDTO.setId(userId);
			userDTO.setMultiplier(multiplier);
			userDTO.setClientCategoryId(clientCategoryId);
			userDTO.setUpdateDate(updateDate);
			userDTO.setManagerId(managerId);
			if(note==null)note="";
			userDTO.setNote(note);

			//UserDTO userDTOBefore = userService.getUserInformation(userId);
			String dataBefore="";
			String dataAfter="";
			if(!userDTOBefore.getLogin().equals(login)){
				dataBefore="Login:["+userDTOBefore.getLogin()+"]\n";
				dataAfter="Login:["+login+"]\n";
			}
			   
			if(!userDTOBefore.getCode().equals(code)){
				dataBefore=dataBefore+" Code:["+userDTOBefore.getCode()+"]\n";
				dataAfter=dataAfter+" Code:["+code+"]\n";
			}
				   
			if(userDTOBefore.getTypeId()!=type){
				String nameType=WebConstants.getUserTypeByTypeId(userDTOBefore.getTypeId());
				dataBefore=dataBefore+operationDTO.getDataBefore()+" Type:["+nameType+"]\n";
				nameType=WebConstants.getUserTypeByTypeId(type);
				dataAfter=dataAfter+" Type:["+nameType+"]\n";
			}
				   
			if(!userDTOBefore.getPassword().equals(password)){
				dataBefore=dataBefore+" Password:["+userDTOBefore.getPassword()+"]\n";
				dataAfter=dataAfter+" Password:["+password+"]\n";
			}
				   
			if(!userDTOBefore.getEmail().equals(email)){
				dataBefore=dataBefore+" email:["+userDTOBefore.getEmail()+"]\n";
				dataAfter=dataAfter+" email:["+email+"]\n";
			}
				   
			if(userDTOBefore.isActive()!= active.booleanValue()){
				dataBefore=dataBefore+" Active:["+userDTOBefore.isActive()+"]\n";
				dataAfter=dataAfter+" Active:["+active.booleanValue()+"]\n";
			}

			if(!userDTOBefore.getRealName().equals(realName)){
				dataBefore=dataBefore+" Real Name:["+userDTOBefore.getRealName()+"]\n";
				dataAfter=dataAfter+" Real Name:["+realName+"]\n";
			}
			
			   
			if(!userDTOBefore.getAddress().equals(address)){
				dataBefore=dataBefore+" Address:["+userDTOBefore.getAddress()+"]\n";
				dataAfter=dataAfter+" Address:["+address+"]\n";
			}
						   
			if(!userDTOBefore.getPostalCode().equals(postalCode)){
				dataBefore=dataBefore+" Postal Code:["+userDTOBefore.getPostalCode()+"]\n";
				dataAfter=dataAfter+" Postal Code:["+postalCode+"]\n";
			}
			   
			if(!userDTOBefore.getPhone().equals(phone)){
				dataBefore=dataBefore+" Phone:["+userDTOBefore.getPhone()+"]\n";
				dataAfter=dataAfter+" Phone:["+phone+"]\n";
			}
			  
			if(userDTOBefore.getPrimaryLanguage()!=primaryLanguage){
				String languageCode=WebConstants.getLanguageById(userDTOBefore.getPrimaryLanguage());
				dataBefore=dataBefore+" Primary Language:["+languageCode+"]\n";
				languageCode=WebConstants.getLanguageById(primaryLanguage);
				dataAfter=dataAfter+" Primary Language:["+languageCode+"]\n";
			}
			   
			if(userDTOBefore.getSecondaryLanguage()!=secondaryLanguage){
				String languageCode=WebConstants.getLanguageById(userDTOBefore.getSecondaryLanguage());
				dataBefore=dataBefore+" Secondary Language:["+languageCode+"]\n";
				languageCode=WebConstants.getLanguageById(secondaryLanguage);
				dataAfter=dataAfter+" Secondary Language:["+languageCode+"]\n";
			}
			
			if(!userDTOBefore.getMultiplier().equals(multiplier)){
				dataBefore=dataBefore+" Multiplier:["+userDTOBefore.getMultiplier()+"]\n";
				dataAfter=dataAfter+" Multiplier:["+multiplier+"]\n";
				recalculateShipping=true;
			}
			if(userDTOBefore.getClientCategoryId()!=clientCategoryId){
				String clientCategoryName="None";
				ClientCategoryDTO cliC=userService.getClientCategoryById(userDTOBefore.getClientCategoryId());
				if(cliC!=null)clientCategoryName=cliC.getClientCategoryName();
				dataBefore=dataBefore+" Template:["+clientCategoryName+"]\n";
				clientCategoryName="None";
				cliC=userService.getClientCategoryById(clientCategoryId);
				if(cliC!=null)clientCategoryName=cliC.getClientCategoryName();
				dataAfter=dataAfter+" Template:["+clientCategoryName+"]\n";
			}
			if(userDTOBefore.getUpdateDate()==null){
				DateFormat dFormat=new SimpleDateFormat("yyyy/MM/dd");
				String date=dFormat.format(updateDate);
				dataAfter=dataAfter+" update Date:["+date+"]\n";
			}
			if (userDTOBefore.getUpdateDate() != null 
					&& userDTOBefore.getUpdateDate().compareTo(updateDate) != 0) {
				DateFormat dFormat=new SimpleDateFormat("yyyy/MM/dd");
				String date=dFormat.format(userDTOBefore.getUpdateDate());
				dataBefore=dataBefore+" update Date:["+date+"]\n";
				date=dFormat.format(updateDate);
				dataAfter=dataAfter+" update Date:["+date+"]\n";
			}

			//Special Handling
			if(userDTOBefore.getSpecialHandlingName()!=null && !userDTOBefore.getSpecialHandlingName().equals(specialHandlingName)){
				dataBefore=dataBefore+" Special Handling Name:["+userDTOBefore.getSpecialHandlingName()+"]\n";
				dataAfter=dataAfter+" Special Handling Name:["+specialHandlingName+"]\n";
			}
			if(userDTOBefore.getSpecialHandlingFee()!=null && !userDTOBefore.getSpecialHandlingFee().equals(specialHandlingFee)){
				dataBefore=dataBefore+" Special Handling Fee:["+userDTOBefore.getSpecialHandlingFee()+"]\n";
				dataAfter=dataAfter+" Special Handling Fee:["+specialHandlingFee+"]\n";
			}
			//Shipping Insurance Multiplier
			if(userDTOBefore.getShippingInsuranceMultiplier()!=null && !userDTOBefore.getShippingInsuranceMultiplier().equals(shippingInsuranceMultiplier)){
				dataBefore=dataBefore+" Shipping Insurance Multiplier:["+userDTOBefore.getShippingInsuranceMultiplier()+"]\n";
				dataAfter=dataAfter+" Shipping Insurance Multiplier:["+shippingInsuranceMultiplier+"]\n";
				recalculateShipping=true;
			}
			//Currency
			if(userDTOBefore.getCurrencyId()!=null && userDTOBefore.getCurrencyId()!=currencyDTO.getId()){
				dataBefore=dataBefore+" Currency:["+userDTOBefore.getCurrencyId()+"-"+userDTOBefore.getCurrencySymbol()+"]\n";
				dataAfter=dataAfter+" Currency:["+currencyDTO.getId()+"-"+currencyDTO.getSymbol()+"]\n";
			}
			operationDTO.setOperationType("Update User");
			operationDTO.setDataBefore(dataBefore);
			operationDTO.setDataAfter(dataAfter);
			operationDTO.setObjectId(userId);
			operationDTO.setUserId(managerId);

			userService.updateUser(userDTO);
			
			ClientCategoryDTO clientC=userService.getClientCategoryById(clientCategoryId);
			if(clientC!=null)clientCategoryName=clientC.getClientCategoryName();
	
			message = "User Updated Successfully";
			String populationPercentB4="";
			String populationPercentAfter="";
			UserProvincePopulationDTO uppDTO = new UserProvincePopulationDTO();
			int count = 0;
			for (UserProvincePopulationDTO userProvincePopulationDTO : provinceNameList) {
				
				if(!userProvincePopulationDTO.getPopulationPercent().equals(populationPercentage[count])){
					String provinceName=WebConstants.getProvinceById(userProvincePopulationDTO.getProvinceId());
					populationPercentB4=populationPercentB4+"Province ["+provinceName+":"+userProvincePopulationDTO.getPopulationPercent()+"]\n";
					populationPercentAfter=populationPercentAfter+"Province ["+provinceName+":"+populationPercentage[count]+"]\n";
					recalculateShipping=true;
				}
				
				uppDTO = new UserProvincePopulationDTO();
				uppDTO.setUserId(userId);
				uppDTO.setProvinceId(userProvincePopulationDTO.getProvinceId());
				uppDTO.setPopulationPercent(populationPercentage[count]);
				productService.updateUserProvincePopulation(uppDTO);
				++count;
			}
			/*----------------------- recalculate shipping ---------------------------------- 
				if multiplier,insuranceMultiplier or userProvincePopulation are changed then
				recalculate shipping immediately 
			  -------------------------------------------------------------------------------*/
			if(recalculateShipping)productService.calculateShippingRateForAllProducts(userId);
			System.out.println("recalculateShipping:"+recalculateShipping);	
			operationDTO.setDataBefore(operationDTO.getDataBefore()+"\n"+populationPercentB4);
			operationDTO.setDataAfter(operationDTO.getDataAfter()+"\n"+populationPercentAfter);
			operationsService.insertOperation(operationDTO);
						
			if (clientC != null) {
				productService.transferToUserByCreationDate(clientCategoryId, userId,managerId, updateDate);
			}
									
			return SUCCESS;
		}
		catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		}
		catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}
	

}
