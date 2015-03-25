package com.loyauty.service.user;

import java.io.File;
import java.io.IOException;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.enums.Type;
import com.loyauty.enums.UserType;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.InvalidUserException;
import com.loyauty.exception.ServiceException;

import com.loyauty.model.Image;
import com.loyauty.model.User;


import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.image.ImageServiceImpl;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.communication.Receipt;
import com.loyauty.util.constant.BackEndConstants;




/**
 * Provides all users related logic in the system.
 * 
 *
 */
public class UserServiceImpl extends ServiceImpl implements UserService {
 
	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	
	@Setter 
	////
	@Getter

	///
	protected DaoManager daoManager;
	
	public UserServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}
	
	@Override
	public UserSessionDTO authenticate(final String login, final String password) throws ServiceException, InvalidUserException{
		return authenticate(login, password, false);
	}

	@Override
	public UserSessionDTO authenticate(final String login, final String password,
			final boolean encryptedPassword) throws ServiceException, InvalidUserException{

		if(!CommonUtils.isValidString(login) || !CommonUtils.isValidString(password)){
			throw new IllegalArgumentException("Can't authenticate null or empty user and/or password.\n login-password=" +
					login + "-" + password);
		}
		
		User user;
		
		try{
			user = (User) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					return daoManager.getUserDao().getUser(login);
				}
			});
		}catch (DaoException de) {
			throw new ServiceException(de);
		}
		
		UserSessionDTO userSessionDTO;
		
		if(user != null){					
				// Get the password			
				String passwordToBeChecked = (encryptedPassword)?password:password; // TODO encryption issues				
				if(passwordToBeChecked.equals(user.getPassword())){
					if(! user.isActive() ) {
						throw new InvalidUserException("Your account is disabled.");
					}
					userSessionDTO = DTOFactory.getUserSessionDTO(user);
				}else{
					throw new InvalidUserException("bad login / password. Try again.");
				}							
		}else{
			throw new InvalidUserException("bad login / password. Try again.");
		}
		
		
		return userSessionDTO;
	}	
	
	@Override
	public UserSessionDTO createAccount(final String login, final String password,
			final String email,long country, int primaryLang) throws ServiceException, InvalidUserException{

		if(!CommonUtils.isValidString(login) || !CommonUtils.isValidString(password) ||
				!CommonUtils.isValidString(email)){
			throw new IllegalArgumentException("Can't create a new account with invalid login-password-email=" +
					login + "-" + password + "-" + email);
		}
		return authenticate(login, password);
	}	
	

	@Override
	public boolean emailExists(final String email) throws ServiceException {
		boolean result = false;
		try {
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getUserDao().emailExists(email);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
		return result;
	}

	@Override
	public boolean usernameExists(final String username) throws ServiceException {
		boolean result;
		try {
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getUserDao().usernameExists(username);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
		return result;
	}	
	
	
	@Override
	public boolean sendUserPassword(final String email) {
		final String requestFor = "You request for Losting Email";
		try {
			final User user= (User)daoManager.executeAndHandle(new DaoCommand() {				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {					
					return daoManager.getUserDao().getUserByEmail(email);
				}
			});
			
			String login = user.getLogin();			
			String passwd = user.getPassword();			
			String body = "Login: " + login + "\nPass word: " + passwd; 
			
			Receipt.passwordRequest(user);
			
			if(log.isDebugEnabled()){
				log.debug(user.getPassword());
			}
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateLogin(long userId,  String login)
			throws ServiceException {
		boolean reponse = false;
		final User user = new User();
		user.setId(userId);
		user.setLogin(login);		
		try{
			daoManager.setCommitTransaction(true);
			reponse = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					daoManager.getUserDao().updateLogin(user);
					return true;
				}
			}) ;
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return reponse;		
	}
	
	@Override
	public boolean updatePassword(long userId,  String newPassord)
			throws ServiceException {
		boolean reponse = false;
		final User user = new User();
		user.setId(userId);
		user.setPassword(newPassord);		
		try{
			daoManager.setCommitTransaction(true);
			reponse = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					daoManager.getUserDao().updatePassword(user);
					return true;
				}
			}) ;
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return reponse;		
	}
	

	@Override
	public UserSessionDTO adminAuthenticate(String login, String password)
			throws ServiceException, InvalidUserException {
		UserSessionDTO userSessionDTO = authenticate(login, password, false);
		if(userSessionDTO.getTypeId() != BackEndConstants.USER_ADMIN_GROUP )
			throw new InvalidUserException("Permission denied.");
		return userSessionDTO;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<UserSessionDTO> getAllUserAccounts(BasicUserDTO basicUserDTO)
			throws ServiceException {
				
		final User user = new User();
		user.setActive(basicUserDTO.isActive());
		user.setTypeId(basicUserDTO.getTypeId());	
		List<User> userList = null;
		try{			
			userList = (List<User>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					return daoManager.getUserDao().getAllUserAccounts(user);
					
				}
			}) ;
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}
		
		return DTOFactory.getAllUsersAccountsDTO(userList);
	}
	

	
	
	@Override
	public ImageDTO transferProfileImage(final long userId, String imageName, File fileImage, String applicationPath,long uploaderId, String login)
			throws ServiceException {
		long temp = 0; 
		ImageService ish = new ImageServiceImpl();
		final Image image = new Image();
		image.setUploaderId(uploaderId);
		try {
			// Validate if the name is already present in the DB
			String normalizedName= CommonUtils.getNormalizedProfile(imageName, login, userId);
			//Validate if the image extension is JPEG or PNG
			int i = ish.isJPEGPNGImage1(fileImage);
			if (i==1) {
				image.addImageJps(fileImage,normalizedName,imageName);
			}else{
				throw new ServiceException("Game Logo Image Format not supported " + fileImage.getName() );
			}
			image.setName(normalizedName);
			image.setRealNameImg(imageName);
			//Variables Initialization 
			image.setType(Type.PRODUCT);
			image.setId(temp);
			// Transfer the logo to the server logo directory
			/*if (!ish.transferProfileImage(fileImage, imageName, login, uploaderId, applicationPath)){
				throw new ServiceException("Could not transfer the image" + 
						"\nimageName:" + fileImage.getName() 
						+ "\nNormalized image Logo:" + normalizedName);
			}*/
		} catch (IOException e) {
			throw new ServiceException(e);
		}
		return DTOFactory.getImageDTO(image); 
	}
	
	@Override
	public long createUser(UserDTO userDTO) throws ServiceException, InvalidUserException{

		long userId = 0;
		final User user = new User();
		user.setLogin(userDTO.getLogin());
		user.setPassword(userDTO.getPassword());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setEmail(userDTO.getEmail());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		if(userDTO.getImageDTO() != null)
			user.setImageId(userDTO.getImageDTO().getId());
		user.setPrimaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getPrimaryLanguage()));
		user.setSecondaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getSecondaryLanguage()));
		try{
			daoManager.setCommitTransaction(true);
			userId = (Long) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					daoManager.getUserDao().insertUserAccount(user);
					daoManager.getUserDao().insertUserProfil(user);
					//Just in user case, I insert all the products to the user
					if(user.getTypeId() == UserType.USER.getValue())
						daoManager.getUserDao().insertProductToUsers(user);
					return user.getId();
				}
			});
		}catch (DaoException de) {
			throw new ServiceException(de);
		}		
		return userId;
	}	
}
