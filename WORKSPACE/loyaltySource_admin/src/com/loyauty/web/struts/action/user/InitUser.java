package com.loyauty.web.struts.action.user;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class InitUser  extends LoyautyAction{
	private static final long serialVersionUID = 165344244401443363L;
	

	private UserService userService;
	private ProductService productService;
	
	@Getter @Setter
	private UserSessionDTO userSession;
	@Getter @Setter
	private Long clientCategoryId;
	@Getter @Setter
	private String clientCategoryName;
	@Getter @Setter
	private Long managerId;
	
	@Getter @Setter
	private String login;
	
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory;
	
	@Getter @Setter
	private List<CurrencyDTO> currencyDTOList;
	
	public  InitUser() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();		
	}

	
	@Override  
	public String execute() throws Exception {
		
		try {
			//Get Currency
			List<CurrencyDTO> currDTOList;
			currDTOList = productService.getCurrencySymbols();
			if(currDTOList!=null) {
				currencyDTOList = new ArrayList<CurrencyDTO>();
				for(CurrencyDTO currencyDTO : currDTOList){
					currencyDTO = productService.getCurrencyBySymbol(currencyDTO);
					if(currencyDTO!=null && currencyDTO.getSymbol()!=null) 
						currencyDTOList.add(currencyDTO);
				}
			}//Get Currency
			
			String managerLogin;
			User userManager=new User();
			userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if(userSession!=null){
				managerLogin=userSession.getLogin();
				userManager=userService.getUserByLogin(managerLogin);
			}
			managerId=userManager.getId();
			listClientCategory=userService.getAllClientCategory();
		}
		catch (Exception e) {
			
		}
		return INPUT;
	}
	
	
	
	
	
	
	

}
