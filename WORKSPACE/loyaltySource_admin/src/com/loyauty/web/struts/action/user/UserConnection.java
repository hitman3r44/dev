package com.loyauty.web.struts.action.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;


import lombok.Getter;
import lombok.Setter;

public class UserConnection extends LoyautyAction {
	
	private static final long serialVersionUID = -456834673L;

	private UserService userService;
	
	@Getter @Setter
	private UserConnectionDTO userConnectionDTO;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private String userLogo;
	@Getter @Setter
	private Long userId;
	@Getter @Setter
	private Long userIdFindedSignal;
	@Getter @Setter
	private Long saveUser;
	@Getter @Setter
	private String host;
	@Getter @Setter
	private Integer port;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private String userName;
	@Getter @Setter
	private String password;
	@Getter @Setter
	private String remoteFolder;
	@Getter @Setter
	private String protocol;
	@Getter @Setter
	private String ordersFolder;
	@Getter @Setter
	private String ordersConfirmFolder;
	@Getter @Setter
	private String message;
	@Getter @Setter
	private String showConfirmSaveUserConnectionPop;
	@Getter @Setter
	private String showSaveSuccessPop;
	@Getter @Setter
	private String showNotificationMissingFieldsPop;
	@Getter @Setter
	private Integer saveUserConnectionConfirmed;
	 
	public UserConnection() throws ServiceLocatorException{
		super();
		userService = getServiceLocator().getUserService();
		userConnectionDTO=new UserConnectionDTO();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
	try{
		HttpSession session = request.getSession(true);
		showConfirmSaveUserConnectionPop="visibility:hidden;display:none;";
		showSaveSuccessPop="visibility:hidden;display:none;";
		showNotificationMissingFieldsPop="visibility:hidden;display:none;";
		userLogo=(String)session.getAttribute("userLogo");
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		basicUserDTO.setTypeId(USER_TYPE);
		List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
		if(usersListSession==null){
			List<UserSessionDTO> listAllUsers= userService.getAllUsers(basicUserDTO);
			usersList=new ArrayList<User>();
				for(UserSessionDTO userDTO:listAllUsers){
					User user=new User();
					user.setId(userDTO.getId());
					user.setLogin(userDTO.getLogin());
					usersList.add(user);
				}
				session.setAttribute("usersListSession",usersList);
			}else usersList=usersListSession;
			
			if(userIdFindedSignal==null || userIdFindedSignal==0L){
				userId=(Long)session.getAttribute("userId");
				if(userId!=null){
					UserDTO userFind=userService.getUserInformation(userId);
					userLogin=userFind.getLogin();
				}
			}
			/*-------------------- When Admin Find User Login ---------------------------*/
			if(userIdFindedSignal!=null && userIdFindedSignal!=0L){
				User user=userService.getUserByLogin(userLogin);
				//userSelected=userService.getUserByLogin(userLogin);
				userLogo=null;
				userId=null;
				if(user!=null){
					userId=user.getId();
	    			//show user logo
	    			userLogo="./images/orders/usersLogos/"+userLogin+".png";
				}else userLogin=null;

				String filePath = session.getServletContext().getRealPath("/");
    			//if userLogo dosn't exist give him a blank logo
    			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");
    			session.setAttribute("userLogo",userLogo);
				session.setAttribute("userId",userId);
				//Get the user connection details if they already exists.
				userConnectionDTO=userService.getUserConnectionByUserId(userId);
				if(userConnectionDTO!= null){
					//userName=userService.decrypt(userConnectionDTO.getUserName());
					//host=userService.decrypt(userConnectionDTO.getHost());
					//port=(userConnectionDTO.getPort()- 255);
					//password=userService.decrypt(userConnectionDTO.getPassword());
					userName=userConnectionDTO.getUserName();
					host=userConnectionDTO.getHost();
					port=(userConnectionDTO.getPort());
					password=userConnectionDTO.getPassword();
					remoteFolder = userConnectionDTO.getRemoteFolder();
					protocol = userConnectionDTO.getProtocol();
					ordersFolder=userConnectionDTO.getOrdersFolder();
					ordersConfirmFolder=userConnectionDTO.getOrdersConfirmFolder();
				}else{
					userName="";
					host="";
					port=0;
					password= "";
					remoteFolder ="";
					protocol ="";		
					ordersFolder="";
					ordersConfirmFolder="";
				}
			}
			if(userId==null)userLogin="";
			
			// create UserConnectionDTO to insert.
			if(userConnectionDTO!= null && saveUser!=null && saveUser!=0L){
				UserConnectionDTO validateUserConnectionDTO = new UserConnectionDTO();
				userConnectionDTO.setHost(host);
				userConnectionDTO.setPort(port);
				userConnectionDTO.setUserName(userName);
				userConnectionDTO.setPassword(password);
				userConnectionDTO.setRemoteFolder(remoteFolder);
				userConnectionDTO.setUserId(userId);
				userConnectionDTO.setProtocol(protocol);
				userConnectionDTO.setOrdersFolder(ordersFolder);
				userConnectionDTO.setOrdersConfirmFolder(ordersConfirmFolder);
				//check all fields are entered.
				validateUserConnectionDTO = validateUserConnectionDTO(userConnectionDTO);
				if(validateUserConnectionDTO!= null){
					showConfirmSaveUserConnectionPop="display:block;visibility:visible;";
					message="";
					if(saveUserConnectionConfirmed!=null && saveUserConnectionConfirmed==1){
						/*userConnectionDTO.setHost(userService.encrypt(host));
						userConnectionDTO.setPassword(userService.encrypt(password));
						userConnectionDTO.setUserName(userService.encrypt(userName));
						userConnectionDTO.setPort(port+255);*/
						
						userConnectionDTO.setHost(host);
						userConnectionDTO.setPassword(password);
						userConnectionDTO.setUserName(userName);
						userConnectionDTO.setPort(port+255);
						
						boolean result = userService.insertUserConnection(userConnectionDTO);
						if(result==true){
							message="User Connection information was succesfully added.";
						}else{
							message="The system encountered a problem and can not save this user connection details.";
						}
						showSaveSuccessPop="display:block;visibility:visible;";
						return SUCCESS;	
					}
				}else{
					message="Please fill all fields.";
					showNotificationMissingFieldsPop="display:block;visibility:visible;";
					return SUCCESS;	
				}
				message="Are you sure, you want to save the user connection details?";
				showConfirmSaveUserConnectionPop="display:block;visibility:visible;";
			}
	}catch (Exception e) {
		e.printStackTrace();
		return "input";
	}
		return SUCCESS;
	}

	/*=========================  createUserLogo =========================================
	 				Create  Blank User Logo if not Exist
	=====================================================================================*/
	public void createUserLogo(String source, String destination) throws IOException{
		File fileLogo=new File(destination);
		if(!fileLogo.exists()){
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(destination);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();	
		}
	}
	
	/*=========================  Validate the DTO ===========================================
			Method used to validate that all the required filed are present
	=========================================================================================*/
	public UserConnectionDTO validateUserConnectionDTO(UserConnectionDTO validateUserConnectionDTO) {
		if( validateUserConnectionDTO.getHost()== null || validateUserConnectionDTO.getHost().equals("")||
			validateUserConnectionDTO.getPort()== null || validateUserConnectionDTO.getPort().equals("") || validateUserConnectionDTO.getPort()==0L ||
			validateUserConnectionDTO.getUserId()== null || validateUserConnectionDTO.getUserId().equals("") ||
			validateUserConnectionDTO.getUserName()== null || validateUserConnectionDTO.getUserName().equals("") ||
			validateUserConnectionDTO.getPassword()== null || validateUserConnectionDTO.getPassword().equals("") ||
			validateUserConnectionDTO.getRemoteFolder()== null || validateUserConnectionDTO.getRemoteFolder().equals("") ||
			validateUserConnectionDTO.getProtocol()== null || validateUserConnectionDTO.getProtocol().equals("")||
			validateUserConnectionDTO.getOrdersFolder()== null || validateUserConnectionDTO.getOrdersFolder().equals("") ||
			validateUserConnectionDTO.getOrdersConfirmFolder()== null || validateUserConnectionDTO.getOrdersConfirmFolder().equals(""))
		{
		return null;
		}
		return validateUserConnectionDTO;
	}
	
}
