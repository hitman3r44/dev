package com.loyauty.web.struts.action.user.transfer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.model.User;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class Transfer   extends LoyautyAction{
	private static final long serialVersionUID = 7658719685755461347L;
	@Getter @Setter
	private String dataTransferVisible="visibility:hidden;display:none;";
	@Getter @Setter
	private String message="";
	@Getter @Setter
	private String userLoginFrom="";
	@Getter @Setter
	private String userLoginTo;
	
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static ProductService productService;
	
	@Getter @Setter
	private List<User> usersList;

	private static int USER_TYPE = 2;
	@Getter @Setter
	private long countShippingTotalFrom;
	@Getter @Setter
	private long countProductPriceFrom;
	@Getter @Setter
	private long countShippingTotalTo;
	@Getter @Setter
	private long countProductPriceTo;
	@Getter @Setter
	private String showPopError="none";
	@Getter @Setter
	private String msgConfirmation="Are you sure?";
	@Getter @Setter
	private String userTemp="";
	@Getter @Setter
	private String showPopResult="display:none;visibility:hidden";
	@Getter @Setter
	private String showPopWorning="display:none;visibility:hidden";
	@Getter @Setter
	private String justOKPopResult;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	@Getter @Setter
	private Long clientCategoryId;
	public Transfer() {
		serviceLocator = ServiceLocator.getInstance();
		usersList=new ArrayList<User>();
	}
	@Override  
	public String execute() throws Exception {
		try {
			
			userService=serviceLocator.getUserService();
			productService = serviceLocator.getProductService();
			
			listClientCategory=userService.getAllClientCategory();
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			List<UserSessionDTO>listAllUsers;
			listAllUsers= userService.getAllUsers(basicUserDTO);
			usersList.clear();
			for(UserSessionDTO userDTO:listAllUsers){
				User user=new User();
				user.setId(userDTO.getId());
				user.setLogin(userDTO.getLogin());
				usersList.add(user);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		if(justOKPopResult!=null){
			showPopResult="visibility:hidden;display:none;";
			return INPUT;
		}
			message="";

		try {	
			userService=serviceLocator.getUserService();
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			userLoginTo=userLoginTo.replaceAll(" ", "");
			ClientCategoryDTO userFrom=null;
			if(clientCategoryId!=null)userFrom= userService.getClientCategoryById(clientCategoryId) ;
			if(userFrom==null){
				addActionError(getText("loyauty.error.common.transferUserData"));
				showPopError="none";
				return INPUT;
			}
			User userTo=  userService.getUserByLogin(userLoginTo);
			if(userTo==null){
				addActionError(getText("loyauty.error.common.transferUserData"));
				showPopError="none";
				return INPUT;
			}
			showPopError="block";
			
			/* [RGP] MODIFIED BY RGP ON FEB. 5TH, 2014. --- BEGIN */
			userService.updateClientCategoryID(clientCategoryId, userTo.getId());
			productService.transferToUser(clientCategoryId, userTo.getId());
			/* [RGP] MODIFIED BY RGP ON FEB. 5TH, 2014. --- END */
						
			User user=new User();
			user.setId(userTo.getId());
			user=userService.getCountUserShippingTotal(user);
			countShippingTotalTo=user.getId();
			user=new User();
			user.setId(userTo.getId());
			user=userService.getCountUserProductPrice(user);
			countProductPriceTo=user.getId();
			user=new User();
			user.setId(userFrom.getId());
			user=userService.getCountUserShippingTotal(user);
			countShippingTotalFrom=user.getId();
			user=new User();
			user.setId(userFrom.getId());
			user=userService.getCountUserProductPrice(user);
			countProductPriceFrom=user.getId();
			if(countShippingTotalTo==countShippingTotalFrom &&
				countProductPriceTo==countProductPriceFrom){
				message="Transfer was successfully ​​completed ['"+userLoginFrom+"']"+" to ['"+userLoginTo+"']";
			}else{
				message="Transfer was not successfully";
			}
			message="Transfer is successfuly completed";
			dataTransferVisible="visibility:hidden;display:none;";
			showPopResult="display:block;visibility:visible;";
			return SUCCESS;
		} catch (Exception e) {
			message="The system was not unable to transfer data";
			showPopResult="display:block;visibility:visible;";
		}
		
		return INPUT;
	}
	
}
