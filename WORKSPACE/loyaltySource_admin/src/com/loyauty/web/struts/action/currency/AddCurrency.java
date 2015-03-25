package com.loyauty.web.struts.action.currency;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class AddCurrency extends LoyautyAction {

	private static final long serialVersionUID = -5809292120431312291L;
	
	final String GO_TO_HOME_PAGE = "authentification";
	
	private ProductService productService;
	private OperationsService operationsService;
	private UserService userService;
	
	@Getter @Setter
	private CurrencyDTO currencyDTO;
	
	@Getter @Setter
	private Integer successSignal;	//1: success	0/null: input
	
	private UserSessionDTO userSession;
	
	@Getter @Setter
	private String message;
	
	@Getter @Setter
	private String showPopup="visibility:hidden;display:none;";
	
	public  AddCurrency() throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		operationsService=getServiceLocator().getOperationsService();
		userService = getServiceLocator().getUserService();
	}
	
	public String execute() throws Exception {
		if (request.getSession().getAttribute("usersPrivCurrency") != null) {
			//---INPUT Part---
			if(successSignal==null || successSignal==0) {
				message = "";
				showPopup="visibility:hidden;display:none;";
				if(currencyDTO==null) currencyDTO = new CurrencyDTO();
				return INPUT;
			}
			
			//---SUCCESS Part---
			if(currencyDTO!=null && currencyDTO.getRate()!=null && currencyDTO.getSymbol()!=null) {
				if(productService.isCurrencyExists(currencyDTO) != null) {
					message = "The currency <"+currencyDTO.getSymbol()+"> you entered already exists. Please enter another one.";
					showPopup = "display:block;visibility:visible;";
					return INPUT;
				}
				
				// Add New Currency
				message = "The New Currency <"+currencyDTO.getSymbol()+"> (with its Rate: "+currencyDTO.getRate()+") is Successfully Added.";
				showPopup = "display:block;visibility:visible;";
				Long currencyId = productService.insertNewCurrency(currencyDTO);
				
				//Add Currency in Operations
				User userManager=new User();
				userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
				if(userSession!=null){
					String managerLogin=userSession.getLogin();
					userManager=userService.getUserByLogin(managerLogin);
				}
				Long managerId=userManager.getId();
				
				OperationsDTO operationDTO=new OperationsDTO();
				operationDTO.setOperationType("Add Currency");
				operationDTO.setDataBefore("");
				operationDTO.setDataAfter("Currency:["+currencyDTO.getSymbol()+"] id:["+currencyId+"]");
				operationDTO.setObjectId(currencyId);
				operationDTO.setUserId(managerId);
				operationsService.insertOperation(operationDTO);
				
				return SUCCESS;
			}
			return INPUT;
		} //---NOT AUTHENTIFIED Part---
		else return GO_TO_HOME_PAGE;
	}

}
