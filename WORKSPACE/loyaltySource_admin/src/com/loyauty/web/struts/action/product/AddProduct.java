package com.loyauty.web.struts.action.product;


import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.Language;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class AddProduct  extends LoyautyAction {
	
	private static final long serialVersionUID = 57978034358044854L;
	
	private CommonService commonService;
	private UserService userService; 
	
	@Getter @Setter
	private List<CommonDTO> brandList;
	@Getter @Setter
	private List<CommonDTO> categoryList;
	
	@Getter @Setter
	private List<UserSessionDTO> userNameList;
	
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	
	@Getter @Setter
	private int userTypeId;
	
	@Getter @Setter
	private Long clientCategoryId;
	
	@Getter @Setter
	private Double[] currencyRate;
	@Getter @Setter
	private String[] currencySymbol;

	public AddProduct () throws ServiceLocatorException {
		super();	
		commonService = getServiceLocator().getCommonService();
		userService = getServiceLocator().getUserService();
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("I am in addProduct Class");
		
		brandList = commonService.getBrands();
		BasicUserDTO basicUserDTO = new  BasicUserDTO();
		basicUserDTO.setTypeId(UserType.USER.getValue());
		basicUserDTO.setActive(true);
		userNameList = userService.getAllUserAccounts(basicUserDTO);
		listClientCategory = userService.getAllClientCategory();
		for(ClientCategoryDTO clDTO:listClientCategory){
			userNameList.add(getUserSessionDTO(clDTO));
		}
		final int SIZE = userNameList.size();
		currencyRate = new Double[SIZE];
		currencySymbol = new String[SIZE];
		long userId = 0L;
		int count = 0;
		UserDTO userDTO;
		for (UserSessionDTO uDTO : userNameList) {
			userId = uDTO.getId();
			userDTO = userService.getUserInformation(userId);
			currencyRate[count] = 1D;
			currencySymbol[count] = "CAD";
			if(userDTO!=null && userDTO.getCurrencyRate()!=null) currencyRate[count] = userDTO.getCurrencyRate();
			if(userDTO!=null && userDTO.getCurrencySymbol()!=null) currencySymbol[count] = userDTO.getCurrencySymbol();
			count++;
		}
		
		
		return getSuccessResult();
	}
	
	public String getProductList() throws Exception {
		System.out.println("I am in Edit Product List");
		
		brandList = commonService.getBrands();
		categoryList = commonService.getCategories();
		
		HttpSession session = request.getSession(true);			
		UserSessionDTO userSessionDTO = (UserSessionDTO) session.getAttribute(WebConstants.USER);
		userTypeId = userSessionDTO.getTypeId();
		
		return getSuccessResult();		
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
	
}
