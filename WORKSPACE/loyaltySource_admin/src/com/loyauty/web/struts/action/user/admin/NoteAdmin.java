package com.loyauty.web.struts.action.user.admin;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class NoteAdmin  extends LoyautyAction {
	private static final long serialVersionUID = 6457221445707655533L;
	
	private UserService userService;
	private UserSessionDTO userSessionDTO;
	@Getter @Setter
	private UserDTO userDTO;
	@Getter @Setter
	private Long updateNote;
	@Getter @Setter
	private String message;
	@Getter @Setter
	private String showPopResult;
	@Getter @Setter
	private String clickHere;
	
	public NoteAdmin() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
		userDTO=UserDTO.valueOf("", "");
	}
	
	
	
	public String execute() throws Exception {
		

		try {
			clickHere="";
			userSessionDTO = (UserSessionDTO) request.getSession(true).getAttribute(WebConstants.USER);
			if(userSessionDTO != null && updateNote!=null && updateNote==1L){
				//Update note of Admin uer
				userDTO.setId(userSessionDTO.getId());
				userService.updateNoteAdmin(userDTO);
				message="Update was successfully ​​completed";
				showPopResult="display:block;visibility:visible;";
			}else{
				//get user Admin user
				if (userSessionDTO != null) {	
					userDTO=userService.getUserInformation(userSessionDTO.getId());
				}
				
			}
			String str="";
			if(userDTO.getNote()!=null){
				str=userDTO.getNote();
				str=str.replaceAll("^ +| +$|( )+", "$1");
				str=str.replaceAll(" ","");
			}
				
				
			if(str.equals("")){
				clickHere="Double-clik here to add notes ...";
			}

			
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
			return INPUT;
		}
		return SUCCESS;
	}
	
	
	
}
