package com.loyauty.web.struts.action.view;

import java.io.File;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class ViewUser extends LoyautyAction {
	
	private static final long serialVersionUID = 1L;

	private UserService userService;
	
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
	
	public ViewUser() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
	}
	
	@Override
	public void prepare() throws ServiceException { }
	
	public String execute() throws Exception {
		try {
			userDTO = userService.getUserInformation(userId);			
			userDTO.setId(userId);
			login = userDTO.getLogin();
			code = userDTO.getCode();
			type = userDTO.getTypeId();
			password = userDTO.getPassword();
			email = userDTO.getEmail();
			active = userDTO.isActive();
			realName = userDTO.getRealName();
			address = userDTO.getAddress();
			postalCode = userDTO.getPostalCode();
			phone = userDTO.getPhone();
			primaryLanguage = userDTO.getPrimaryLanguage();
			secondaryLanguage = userDTO.getSecondaryLanguage();
			return INPUT;
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return SUCCESS;
	}
	
}