package com.loyauty.service.user;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

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
import com.loyauty.model.ClientCategory;
import com.loyauty.model.Image;
import com.loyauty.model.Select;
import com.loyauty.model.User;
import com.loyauty.model.UserConnection;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.image.ImageServiceImpl;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.communication.Receipt;



/**
 * Provides all users related logic in the system.
 * 
 *
 */
public class UserServiceImpl extends ServiceImpl implements UserService {
 
	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	private static final String ALGO = "AES";
    private static final byte[] keyValue = new byte[] { 'K', 'l', 'F', 'a',
            'C', 'c', 'E', 's', 'S', 'o', 'F', 'm', 'e', 'd', 'i', 'A' };
	@Setter @Getter
	protected DaoManager daoManager;
	
	
	public UserServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}
	
	@Override
	public UserSessionDTO authenticate(final String login, final String password) throws ServiceException, InvalidUserException{
		return authenticate(login, password, false);
	}
	
	@Override
	public UserDTO authenticateByURL(final String login) throws ServiceException, InvalidUserException {
		User user = null;		
		try {
			user = (User) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					return daoManager.getUserDao().getUser(login);
				}
			});
		} catch (DaoException de) {
			throw new ServiceException(de);
		}		
		UserDTO userDTO = DTOFactory.getUserDTOWithUserID(user);
		return userDTO;
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
	public UserSessionDTO authenticateAdmin(final String login, final String password,
			final boolean encryptedPassword) throws ServiceException, InvalidUserException{

		UserSessionDTO result=null;
		User user;
		try {
			user = (User) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					return daoManager.getUserDao().getAdmin(login, password);
				}
			});
		} catch (DaoException de) {
			throw new ServiceException(de);
		}
		
		if(user != null) {	
			if(user.isActive() ) {
				result = DTOFactory.getUserSessionDTO(user);
			}					
		}
		return result;
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

		return userSessionDTO;
	}	


	@Override
	public UserSessionDTO authenticateAdmin(String login, String password)
			throws ServiceException, InvalidUserException {
		UserSessionDTO userSessionDTO = authenticateAdmin(login, password, false);

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

	@SuppressWarnings("unchecked")
	@Override
	public List<UserSessionDTO> getAllUsers(BasicUserDTO basicUserDTO)
			throws ServiceException {
		final User user = new User();
		user.setTypeId(basicUserDTO.getTypeId());	
		List<User> userList = null;
		try {			
			userList = (List<User>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					return daoManager.getUserDao().getAllUsers(user);				
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
		user.setMultiplier(userDTO.getMultiplier());
		user.setPassword(userDTO.getPassword());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setEmail(userDTO.getEmail());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		// user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		user.setClientCategoryId(userDTO.getClientCategoryId());
		user.setManagerId(userDTO.getManagerId());
		user.setSpecialHandlingName(userDTO.getSpecialHandlingName());
		user.setSpecialHandlingFee(userDTO.getSpecialHandlingFee());
		user.setShippingInsuranceMultiplier(userDTO.getShippingInsuranceMultiplier());
		user.setCurrencyId(userDTO.getCurrencyId());
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
					if(user.getTypeId() == UserType.USER.getValue()) {
						daoManager.getUserDao().insertProductToUsers(user);
					}
					return user.getId();
				}
			});
		}catch (DaoException de) {
			throw new ServiceException(de);
		}		
		return userId;
	}	
		
	@Override
	public UserDTO getUserInformation(final Long userId) throws ServiceException {
		User userResult = new User();
		try {
			daoManager.setCommitTransaction(true);
			userResult = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
					User usr = daoManager.getUserDao().getUser(userId);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserDTO(userResult));	
	}
	
	@Override
	public UserDTO getAnyUserFromId(final Long userId) throws ServiceException {
		User userResult = new User();
		try {
			daoManager.setCommitTransaction(true);
			userResult = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
					User usr = daoManager.getUserDao().getAnyUserFromId(userId);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserDTO(userResult));	
	}
	
	@Override
	public void updateUser(final UserDTO userDTO) throws ServiceException {	
		try 
		{
		    daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {					
					User user = buildUser(userDTO);										
					daoManager.getUserDao().updateUserById(user);					
					return user;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	private Language getLanguage(int value) {
		Language lang = null;
		if (value == 1) lang = Language.ENGLISH;
		if (value == 2) lang = Language.FRENCH;
		return lang;
	}
	
	private User buildUser(final UserDTO userDTO) {
		User user = new User();
		int lang = 0;
		Language primary=null, secondary=null;		
		user.setId(userDTO.getId());
		user.setLogin(userDTO.getLogin());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setPassword(userDTO.getPassword());
		user.setEmail(userDTO.getEmail());
		user.setSpecialHandlingName(userDTO.getSpecialHandlingName());
		user.setSpecialHandlingFee(userDTO.getSpecialHandlingFee());
		user.setShippingInsuranceMultiplier(userDTO.getShippingInsuranceMultiplier());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		user.setManagerId(userDTO.getManagerId());
		// user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		user.setNote(userDTO.getNote());
		lang = userDTO.getPrimaryLanguage();
		primary = getLanguage(lang);					
		user.setPrimaryLanguage(primary);
		
		lang = userDTO.getSecondaryLanguage();
		secondary = getLanguage(lang);
		user.setSecondaryLanguage(secondary);
		user.setMultiplier(userDTO.getMultiplier());
		user.setClientCategoryId(userDTO.getClientCategoryId());
		user.setUpdateDate(userDTO.getUpdateDate());
		user.setCurrencyId(userDTO.getCurrencyId());
		return user;
	}

	private User buildNoteAdminUser(final UserDTO userDTO) {
		User user = new User();		
		user.setId(userDTO.getId());
		user.setNote(userDTO.getNote());
		return user;
	}
	
	@Override
	public void updateClientCategoryID(final Long clientCategoryId, final Long userId) throws ServiceException {		
		try{
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					Select select = new Select();
					select.setClientCategoryId(clientCategoryId);
					select.setUserId(userId);
					daoManager.getUserDao().updateClientCategoryID(select);
					return null;
				}
			});
		}  catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public void updateTemplateCoeffitions(final ClientCategoryDTO clcDTO) throws ServiceException {		
		final ClientCategory clc=DTOFactory.buildCategory(clcDTO);
		try{
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					daoManager.getUserDao().updateTemplateCoeffitions(clc);
					return null;
				}
			});
		}  catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}

	@Override
	public User getUserByLogin(final String login) {
		// TODO Auto-generated method stub
		
		User result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao().getUserByLogin(login);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@Override
	public User getCountUserShippingTotal(final User user) {
		
		User result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao(). getCountUserShippingTotal(user);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@Override
	public User getCountUserProductPrice(final User user) {
		// TODO Auto-generated method stub
		
		User result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao(). getCountUserProductPrice(user);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientCategoryDTO> getAllClientCategory() throws ServiceException {
		// TODO Auto-generated method stub
		List<ClientCategory> userList = null;
		try {			
			userList = (List<ClientCategory>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					return daoManager.getUserDao().getAllClientCategory();
				}
			}) ;
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}	
		return DTOFactory.getAllClientCategoryDTO(userList);
	}
	
	@Override
	public ClientCategoryDTO getClientCategoryById(final Long clientCategoryId) {
		ClientCategory result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (ClientCategory) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao().getClientCategoryById(clientCategoryId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return DTOFactory.getCategoryDTO(result);
	}
		
	@Override
	public ClientCategoryDTO getClientCategoryByName(final String clientCategoryName) {
		ClientCategory result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (ClientCategory) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao().getClientCategoryByName(clientCategoryName);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return DTOFactory.getCategoryDTO(result);
	}
	
	@Override
	public boolean updateUserAdmin(final UserDTO userDTO) {
		
		boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					User user = buildUser(userDTO);
					return daoManager.getUserDao().updateUserAdmin(user);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}

	@Override
	public boolean updateNoteAdmin(final UserDTO userDTO) {
		boolean result=false;		
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					User user = buildNoteAdminUser(userDTO);
					return daoManager.getUserDao().updateNoteAdmin(user);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;	
	}

	@Override
	public UserDTO getUserOrTemplateById(final Long userId) {
		User result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao().getUserOrTemplateById(userId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (DTOFactory.getUserDTO(result));
	}
	
	@Override
	public Long insertTemplate(final UserDTO userDTO) throws ServiceException {
		Long userID = 0L;
		try {
			daoManager.setCommitTransaction(true);
			userID = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					User user = new User();
					user.setLogin(userDTO.getClientCategoryName());
					user.setCode("");
					user.setTypeId(2);
					user.setPassword("");
					user.setEmail(userDTO.getClientCategoryName());
					user.setLastLoginDate(null);
					user.setActive(false);
					user.setTemplate(true);
					user.setUpdateDate(null);
					user.setRealName(userDTO.getClientCategoryName());
					user.setAddress(null);
					user.setPostalCode(null);
					user.setPhone(null);
					user.setImageId(null);
					user.setPrimaryLanguage(null);
					user.setSecondaryLanguage(null);
					user.setMultiplier(null);
					user.setClientCategoryName(userDTO.getClientCategoryName());
					user.setClientCategoryId(userDTO.getClientCategoryId());
					user.setManagerId(userDTO.getManagerId());
					user.setNote("");
					user.setSpecialHandlingName("");
					user.setSpecialHandlingFee(null);
					user.setShippingInsuranceMultiplier(null);
					daoManager.getUserDao().insertTemplateOnUserAccount(user);
					daoManager.getUserDao().insertTemplateOnUserProfile(user);
					return user.getId();
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return userID;
	}
	
	@Override
	public void deleteTemplate(final Long userId) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					Select select = new Select();
					select.setUserId(userId);
					daoManager.getUserDao().deleteUserProfile(select);
					daoManager.getProductDao().deleteShippingTotalByUserId(select);
					daoManager.getProductDao().deleteUserProductPriceByUserId(select);
					daoManager.getProductDao().deleteAlterUserProductXMLByUserId(select);
					daoManager.getProductDao().deleteUserProvincePopulationByUserId(select);
					daoManager.getUserDao().deleteUserAccount(select);
					return null;
				}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}
	
	@Override
	public UserDTO getAdmin(final String login, final String password)throws ServiceException {
		User userResult = new User();
		try {
			daoManager.setCommitTransaction(true);
			userResult = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
					User usr = daoManager.getUserDao().getAdmin(login, password);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserDTO(userResult));	
	}

	
	@Override
	public UserDTO getSuperAdmin(final String login, final String password)throws ServiceException {
		User userResult = new User();
		try {
			daoManager.setCommitTransaction(true);
			userResult = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
					User usr = daoManager.getUserDao().getSuperAdmin(login, password);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserDTO(userResult));	
	}

	
	@Override
	public boolean insertUserConnection(UserConnectionDTO userConnectionDTO) throws ServiceException {
		final UserConnection userConnection = DTOFactory.getUserConnectionFromUserConnectionDTO(userConnectionDTO) ;
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean)daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserDao().insertUserConnection(userConnection);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	@Override
	public UserConnectionDTO getUserConnectionByUserId(final Long userId)	throws ServiceException { 
		UserConnection UserConnectionResult = new UserConnection();
		try {
			daoManager.setCommitTransaction(true);
			UserConnectionResult = (UserConnection) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager)  
						throws DaoException {
					UserConnection usr = daoManager.getUserDao().getUserConnectionByUserId(userId);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserConnectionDTOFromUserConnection(UserConnectionResult));
	}

	@Override
	public UserConnectionDTO getUserConnectionByLogin(final String userLogin)	throws ServiceException { 
		UserConnection UserConnectionResult = new UserConnection();
		try {
			daoManager.setCommitTransaction(true);
			UserConnectionResult = (UserConnection) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager)  
						throws DaoException {
					UserConnection usr = daoManager.getUserDao().getUserConnectionByLogin(userLogin);
					return usr;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return (DTOFactory.getUserConnectionDTOFromUserConnection(UserConnectionResult));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserConnectionDTO> getAllUsersConnections()throws ServiceException { 
		List<UserConnection> userConnList = new ArrayList<UserConnection>();
		try {
			daoManager.setCommitTransaction(true);
			userConnList = (List<UserConnection>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager)  
						throws DaoException {
					List<UserConnection> result = daoManager.getUserDao().getAllUsersConnections();
					return result;
				}
			});			
		} catch (DaoException de) {
			throw (new ServiceException(de)); 
		}
		return (DTOFactory.getUserConnListDTOFromUserConnList(userConnList));
	}

	// Method to encrypt the String
/*
	@SuppressWarnings("unchecked")
	@Override
	public String encrypt (String toEncode) throws Exception{
		try{
			byte[] bytesOfMessage = "KLFMEDIA2005".getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] thedigest = md.digest(bytesOfMessage);
			skeySpec = new SecretKeySpec(thedigest, "AES");
			    
			skeySpec = new SecretKeySpec(new byte[16], "AES");
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		}catch(Exception e){
			e.printStackTrace();
		}
	    //returns byte array encrypted with key
		byte[] input = toEncode.getBytes("UTF-8");
	    cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
	    byte[] ciphertext =  cipher.doFinal(input);
	    return  new String(Base64.encode(ciphertext));
	}	
	// Method to decrypt the encoded String.

	@SuppressWarnings("unchecked")
	@Override
	public String decrypt (String toDecrypt) throws Exception{
		try{
			byte[] bytesOfMessage = "KLFMEDIA2005".getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] thedigest = md.digest(bytesOfMessage);
			skeySpec = new SecretKeySpec(thedigest, "AES");
			    
			skeySpec = new SecretKeySpec(new byte[16], "AES");
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		}catch(Exception e){
			e.printStackTrace();
		}
		byte[] decrypted = Base64.decode(toDecrypt.getBytes());
	    cipher.init(Cipher.DECRYPT_MODE, skeySpec);
	    byte[] ciphertext = cipher.doFinal(decrypted);
	    return	new String (ciphertext, "UTF-8");
	}	
*/
    public  String encrypt(String data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encValue = c.doFinal(data.getBytes());
        byte[] encryptedByteValue = new Base64().encode(encValue);
        String encryptedValue = new String(encryptedByteValue);
        return encryptedValue;
    }

    public  String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = new Base64().decode(encryptedData.getBytes());
        byte[] decryptedVal = c.doFinal(decodedValue);
        return new String(decryptedVal);
    }

    private  Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }
    
	@Override
	public boolean insertNewUserSumit(UserDTO userDTO) throws ServiceException {
		boolean isInserted = false;
		long userId = 0;
		final User user = new User();
		
		user.setLogin(userDTO.getLogin());
		user.setMultiplier(userDTO.getMultiplier());
		user.setPassword(userDTO.getPassword());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setEmail(userDTO.getEmail());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		user.setClientCategoryId(userDTO.getClientCategoryId());
		user.setManagerId(userDTO.getManagerId());
		user.setSpecialHandlingName(userDTO.getSpecialHandlingName());
		user.setSpecialHandlingFee(userDTO.getSpecialHandlingFee());
		user.setShippingInsuranceMultiplier(userDTO.getShippingInsuranceMultiplier());
		user.setCurrencyId(userDTO.getCurrencyId());
		if(userDTO.getImageDTO() != null)
			user.setImageId(userDTO.getImageDTO().getId());
		user.setPrimaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getPrimaryLanguage()));
		user.setSecondaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getSecondaryLanguage()));
		
		try{
			daoManager.setCommitTransaction(true);
			userId = (Long) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					daoManager.getUserDao().insertNewUserSumit(user);
//					daoManager.getUserDao().insertUserProfil(user);
					//Just in user case, I insert all the products to the user
//					if(user.getTypeId() == UserType.USER.getValue()) {
//						daoManager.getUserDao().insertProductToUsers(user);
//					}
					return user.getId();
				}
			});
		}catch (DaoException de) {
			throw new ServiceException(de);
		}
		isInserted = true;
		
		System.out.println("User ID:"+ user.getId());
		return isInserted;
	}
	
	public void disableUserByIdSumit(final UserDTO userDTO) throws ServiceException {
		try 
		{
		    daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {					
					User user = buildUser(userDTO);										
					daoManager.getUserDao().disableUserByIdSumit(user);					
					return user;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}

	public void disableUserByLoginSumit(final UserDTO userDTO) throws ServiceException {
		try 
		{
		    daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {					
					User user = buildUser(userDTO);										
					daoManager.getUserDao().disableUserByLoginSumit(user);					
					return user;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	
}
