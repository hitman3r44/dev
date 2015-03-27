package com.loyauty.web.struts.action.template;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class AddTemplate  extends LoyautyAction{
	private static final long serialVersionUID = -6760458314007286079L;
	
	private UserService userService;
	private ProductService productService;
	
	@Getter @Setter
	private UserSessionDTO userSession;
	@Getter @Setter
	private ClientCategoryDTO clcDTO;
	@Getter @Setter
	private Long clientCategoryId;
	@Getter @Setter
	private Long clientCategoryUserId;
	@Getter @Setter
	private Long managerId;
	
	@Getter @Setter
	private Long deleteIndication;
	@Getter @Setter
	private String clientCategoryName;
	@Getter @Setter
	private String userLoginTo;
	
	@Getter @Setter
	private UserDTO userDTO;
	private static int USER_TYPE = 2;
	
	@Getter @Setter
	private String msgAddConfirmation;
	@Getter @Setter
	private String msgDeleteConfirmation;
	
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	@Getter @Setter
	private List<User> usersList;
	
	
	public  AddTemplate() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();
		clcDTO=new ClientCategoryDTO();
		usersList=new ArrayList<User>();		
	}

	@SuppressWarnings("unused")
	@Override  
	public String execute() throws Exception {
		
		System.out.println("I am at Add Template");
		
		try {
			/* get managerId */
			String managerLogin;
			User userManager=new User();
			userSession=(UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if(userSession!=null){
				managerLogin=userSession.getLogin();
				User userM=userService.getUserByLogin(managerLogin);
				if(userM!=null)userManager=userM;
			}
			if(userManager.getId()==null){
				addActionError(getText("loyauty.error.common.sessionExpire"));
				return INPUT;
			}
			managerId=userManager.getId();
			/* Initialization of variables */
			msgAddConfirmation="Are you sure to add this template [yes/no]?";
			msgDeleteConfirmation="Are you sure to delete this template [yes/no]?";
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
			
			/* when the manager chose delete template */
			if(deleteIndication!=null && deleteIndication==1){
				userService.deleteTemplate(clientCategoryId);
				listClientCategory=userService.getAllClientCategory();
				return SUCCESS;
			}
			/* Control and preparing of data */
			
			// prepare clientCategoryName: lower case without spaces
			if(clientCategoryName==null)return SUCCESS;
			clientCategoryName=clientCategoryName.replaceAll("^ +| +$|( )+", "$1");
			String clientCategoryNameLower=clientCategoryName.toLowerCase();
			clientCategoryNameLower=clientCategoryNameLower.replaceAll(" ","");
			
			ClientCategoryDTO cliDTO = userService.getClientCategoryByName(clientCategoryNameLower);
			
			// we don't accept ClientCategory empty
			if(clientCategoryName.equals("")){
				addActionError(getText("loyauty.error.common.templateEmpty"));
				return INPUT;
			}
			
			// Test if this template is already exist
			if(cliDTO!=null){
				addActionError(getText("loyauty.error.common.templateExist"));
				return INPUT;
			}
			
			// We should not have two templates that are not yet used and have the same source data
			User user=userService.getUserByLogin(userLoginTo);
			if(user == null){
				addActionError(getText("loyauty.error.common.transferUserData"));
				return INPUT;
			}
			long userID = user.getId();
			//managerId = user.getManagerId();
			
			for(ClientCategoryDTO clDTO : listClientCategory){
				if(clDTO.getClientCategoryUserId()==user.getId() && clDTO.getCountTempUsed()==0){
					addActionError(getText("loyauty.error.common.templateWithSameSource"));
					return INPUT;
					
				}
			}
			
			userDTO = UserDTO.valueOf(clientCategoryName, "");			
			userDTO.setClientCategoryName(clientCategoryName);
			userDTO.setClientCategoryId(userID);
			userDTO.setManagerId(managerId);			
			long newTemplateID = userService.insertTemplate(userDTO);
			listClientCategory = userService.getAllClientCategory();			
			productService.transferSQLtheUserToNewTemplate(userID, newTemplateID);
			
			return SUCCESS;
			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	
	

}
