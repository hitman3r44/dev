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
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class GoToTransfer extends LoyautyAction{
	private static final long serialVersionUID = 1219137634203440077L;
	
	@Getter @Setter
	private List<User> usersList;
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static final int USER_TYPE = 2;
	@Getter @Setter
	private String showPopResult="display:none;visibility:hidden";
	@Getter @Setter
	private String showPopWorning="display:none;visibility:hidden";
	@Getter @Setter
	private String dataTransferVisible="display:none;visibility:hidden";
	@Getter @Setter
	private String msgConfirmation="Are you sure ?";
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	@Getter @Setter
	private Long clientCategoryId;
	
	public GoToTransfer(){
		serviceLocator = ServiceLocator.getInstance();
		usersList = new ArrayList<User>();	
	}
	
	@Override  
	public String execute() throws Exception {
		userService=serviceLocator.getUserService();
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		basicUserDTO.setTypeId(USER_TYPE);
		List<UserSessionDTO>listAllUsers;
		listAllUsers= userService.getAllUsers(basicUserDTO);
		listClientCategory=userService.getAllClientCategory();
		usersList.clear();
		try {
			for(UserSessionDTO userDTO:listAllUsers){
				User user=new User();
				user.setId(userDTO.getId());
				user.setLogin(userDTO.getLogin());
				usersList.add(user);
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INPUT;
	}
			
}
