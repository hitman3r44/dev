package com.loyauty.web.struts.action.home;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

/**
 * The main landing page action on gameJab.
 * 
 * @author Muthanna
 *
 */
public class HomePage extends LoyautyAction {	
	private static final long serialVersionUID = 6588737107780420015L;

	private UserService userService;
	
	@Getter @Setter
	private String usr;
	@Getter @Setter
	private User user;
	@Getter @Setter
	private Long doUpadte;
	@Getter @Setter
	private String showPopResult="display:none;visibility:hidden";
	@Getter @Setter
	private String messageUpdate;
	private UserSessionDTO userSessionDTO;
	
	@Getter @Setter
	private UserDTO userDTO;
	
	@Getter @Setter
	private UserDTO superAdmin;
	
	@Getter @Setter
	private Long redirect;
	
	public HomePage() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
		userDTO=UserDTO.valueOf("", "");
	}
	
	@Override
	public String execute() throws Exception {

		//redirect=0L;
		HttpSession session = request.getSession(true);
		superAdmin=(UserDTO)session.getAttribute("superAdmin");
		redirect=(Long)session.getAttribute("redirect");
		if(doUpadte!=null && doUpadte==1){
			userService.updateUserAdmin(userDTO);
			messageUpdate="Update was successfully ​​completed";
			showPopResult="display:block;visibility:visible;";
		}else{
			userSessionDTO = (UserSessionDTO) session.getAttribute(WebConstants.USER);
			showPopResult="visibility:hidden;display:none;";
			if (userSessionDTO != null) {
				//redirect=1L;
				int type = userSessionDTO.getTypeId();
				if (type == UserType.VIEWER.getValue().intValue()) {
					usr = "uv";
				} else if (type == UserType.AMENDER.getValue().intValue()) {
					usr = "amender";
				} else {	// This else-statement implies two user-types: USER and ADMIN.
					usr = "menu";
				}
				request.getSession(true).setAttribute("usr", usr);
				//--------------------- get infos Admin login -------------------------------
				userDTO=userService.getUserInformation(userSessionDTO.getId());
				//--------------------- update profile if not refresh -----------------------
			}
		}

		return SUCCESS;
	}

	
}
