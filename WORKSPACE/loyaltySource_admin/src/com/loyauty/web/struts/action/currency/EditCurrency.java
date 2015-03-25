package com.loyauty.web.struts.action.currency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

public class EditCurrency extends LoyautyAction {

	private static final long serialVersionUID = 1504484875061105219L;
	
	private ProductService productService;
	private OperationsService operationsService;
	private UserService userService;
	
	final String GO_TO_HOME_PAGE = "authentification";
	
	@Getter @Setter
	private CurrencyDTO currencyDTO;
	
	@Getter @Setter
	private List<CurrencyDTO> currencyDTOList;
	
	@Getter @Setter
	private OperationsDTO operationDTO;
	
	@Getter @Setter
	private List<OperationsDTO> opertionsDTOList;
	
	private UserSessionDTO userSession;
	
	@Getter @Setter
	private Integer successSignal;	//1: success	0/null: input
	
	@Getter @Setter
	private String message;
	
	@Getter @Setter
	private String showPopup="visibility:hidden;display:none;";
	
	public  EditCurrency() throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();
		userService = getServiceLocator().getUserService();
		operationsService=getServiceLocator().getOperationsService();
	}
	
	public String execute() throws Exception {
		if (request.getSession().getAttribute("usersPrivCurrency") != null) {
			//---INPUT Part---
			if(successSignal==null || successSignal==0) {
				message = "";
				showPopup="visibility:hidden;display:none;";
				try {
					initializeCurrencyDTOList();
					
					List<CurrencyDTO> currDTOList = productService.getCurrenciesButNotCAD();
					for(CurrencyDTO currencyDTO : currDTOList){
						//Get Operations List
						List<OperationsDTO> opDTOList = operationsService.getOperationsByTypeAndObject(currencyDTO.getId(),"Currency"); 
						for(OperationsDTO opDTO : opDTOList){
							opertionsDTOList.add(opDTO);
						}
					}
					
					// If there is no Currency else CAD in the DB
					if(currencyDTOList.size()<1) {
						message = "Please Go to the Menu: <Product>/<Currency>/<Add> to first add a new currency.";
						showPopup = "display:block;visibility:visible;";
					}
					//Sorting opertionsDTOList By operation_date
					if(opertionsDTOList!=null) {
						Collections.sort(opertionsDTOList, COMPARE_BY_OP_DATE);
					}
				} catch (Exception sx) {
					sx.printStackTrace();
				}

				return INPUT;
			}
			
			//---SUCCESS Part---
			try {
				// If No currencies (else CAD) in DB
				List<CurrencyDTO> currDTOList = productService.getCurrencySymbols();
				if(currDTOList==null || currDTOList.size()<1) {
					currencyDTOList = new ArrayList<CurrencyDTO>();
					message = "Please Go the Menu: <Product>/<Currency>/<Add> to first add a new currency.";
					showPopup = "display:block;visibility:visible;";
					return INPUT;
				}
				
				CurrencyDTO currencyDTOB4;
				if(currencyDTO!=null && currencyDTO.getRate()!=null && currencyDTO.getSymbol()!=null && currencyDTO.getSymbol().replaceAll(" ", "")!="") {
					String dataBefore = "";
					String dataAfter = "";
					currencyDTOB4 = productService.getCurrencyBySymbol(currencyDTO);
					if(currencyDTOB4!=null && currencyDTOB4.getRate()!=null) {
						if(currencyDTO.getRate()==currencyDTOB4.getRate()) {
							message = "The Rate you entered is the same as the last one. Please change the rate before saving.";
							showPopup = "display:block;visibility:visible;";
							return INPUT;
						} else {
							message = "The Currency <"+currencyDTO.getSymbol()+">  is Successfully Updated with the New Rate: "+currencyDTO.getRate()+".";
							showPopup = "display:block;visibility:visible;";
							
							//update Currency (insert new currency, and update user_profile.currency_id)
							dataBefore += " "+currencyDTO.getSymbol()+" Currency Rate:[" + currencyDTOB4.getRate() + "]\n";
							dataAfter  += " "+currencyDTO.getSymbol()+" Currency Rate:[" + currencyDTO.getRate() + "]\n";
							productService.updateCurrency(currencyDTO);
							
							//update Operation
								//get the new currencyId
							CurrencyDTO currDTO = productService.getCurrencyBySymbol(currencyDTO);
							Long currencyId = 0L;
							if(currDTO!=null) {
								currencyId = currDTO.getId();
								operationDTO = new OperationsDTO();
								User userManager=new User();
								userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
								if(userSession!=null){
									String managerLogin=userSession.getLogin();
									userManager=userService.getUserByLogin(managerLogin);
								}
								Long managerId=userManager.getId();
								
								OperationsDTO operationDTO=new OperationsDTO();
								operationDTO.setOperationType("Update Currency");
								operationDTO.setDataBefore(dataBefore);
								operationDTO.setDataAfter(dataAfter);
								operationDTO.setObjectId(currencyId);
								operationDTO.setUserId(managerId);
								operationsService.insertOperation(operationDTO);
							}
							
							initializeCurrencyDTOList();
							return SUCCESS;
						}
					}
				}
			} catch (Exception sx) {
				sx.printStackTrace();
			}
			
			// If No currencies (else CAD) in DB
			List<CurrencyDTO> currDTOList = productService.getCurrencySymbols();
			if(currDTOList==null || currDTOList.size()<1) {
				currencyDTOList = new ArrayList<CurrencyDTO>();
				message = "Please Go the Menu: <Product>/<Currency>/<Add> to first add a new currency.";
				showPopup = "display:block;visibility:visible;";
			}
			return INPUT;
			
		}//---NOT AUTHENTIFIED Part---
		else return GO_TO_HOME_PAGE;
	}
	
	public static Comparator<OperationsDTO> COMPARE_BY_OP_DATE = new Comparator<OperationsDTO>() {
        public int compare(OperationsDTO one, OperationsDTO other) {
            return other.getOperationDate().compareTo(one.getOperationDate());
        }
    };
    
    void initializeCurrencyDTOList() {
    	try {
	    	List<CurrencyDTO> currDTOList;
			currDTOList = productService.getCurrencySymbols();
			currencyDTOList = new ArrayList<CurrencyDTO>();
			opertionsDTOList = new ArrayList<OperationsDTO>();
			for(CurrencyDTO currencyDTO : currDTOList){
				currencyDTO = productService.getCurrencyBySymbol(currencyDTO);
				if(currencyDTO!=null && currencyDTO.getId()!=1 && currencyDTO.getSymbol()!=null) {
					currencyDTOList.add(currencyDTO);
				}
			}
    	} catch (Exception sx) {
			sx.printStackTrace();
		}
    }
}
