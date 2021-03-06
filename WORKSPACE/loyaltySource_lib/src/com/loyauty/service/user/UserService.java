package com.loyauty.service.user;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.loyauty.exception.InvalidUserException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Select;
import com.loyauty.model.User;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;


/**
 * User service interface.
 * 
 *
 */
public interface UserService extends Service {
	
	
	/**
	 * Authenticates a user depending on his credentials.  
	 * @param user
	 * @return
	 */
	UserSessionDTO authenticate(String login, String password) throws ServiceException, InvalidUserException;
	
		
	/**
	 * Authenticates a user depending on his credentials with possibility 
	 * to pass an encrypted password(from a cookie for instance). 
	 * @param login
	 * @param password
	 * @param encryptedPassword
	 * @return
	 */
	UserSessionDTO authenticate(String login, String password, 
			boolean encryptedPassword) throws ServiceException, InvalidUserException;
	
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @param encryptedPassword
	 * @return
	 * @throws ServiceException
	 * @throws InvalidUserException
	 */
	UserSessionDTO authenticateAdmin(String login, String password, 
			boolean encryptedPassword) throws ServiceException, InvalidUserException;
	
	/**
	 * Creates a new user account.
	 * @param login
	 * @param password
	 * @param email
	 * @return
	 */
	UserSessionDTO createAccount(String login, String password, String email, long country, int primaryLanguage) throws ServiceException, InvalidUserException;
	
	/**
	 * Checks whether a usename exists in the system.
	 * @param username
	 * @return
	 * @throws ServiceException
	 */
	boolean usernameExists(String username) throws ServiceException;
	
	/**
	 * Checks whether an email exists in the system.
	 * @param email
	 * @return
	 * @throws ServiceException
	 */
	boolean emailExists(String email) throws ServiceException;

	
	/**
	 * Sends user's forgotten password.
	 * @param email
	 * @return
	 */
	boolean sendUserPassword(String email);

	/**
	 * 
	 * @param userId
	 * @param login
	 * @return
	 * @throws ServiceException
	 */
	boolean updateLogin(long userId, String login) throws ServiceException;
	/**
	 * 
	 * @param userId
	 * @param newPassord
	 * @return
	 * @throws ServiceException
	 */
	boolean updatePassword(long userId, String newPassord)
			throws ServiceException;
	
	/**
	 * Authenticates a user depending on his credentials in the Admin side. 
	 * @param user
	 * @return
	 */
	UserSessionDTO adminAuthenticate(String login, String password) 
			throws ServiceException, InvalidUserException;
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 * @throws ServiceException
	 * @throws InvalidUserException
	 */
	UserSessionDTO authenticateAdmin(String login, String password) 
	throws ServiceException, InvalidUserException;

	
	/**
	 * list of all active user (where active = true and typeId = 2 [USER]).
	 * @param basicUserDTO
	 * @return
	 * @throws ServiceException
	 */	
	List<UserSessionDTO> getAllUserAccounts(BasicUserDTO basicUserDTO) throws ServiceException;	
	
	/**
	 * list of all users (where typeId = 2 [USER] only).
	 * @param basicUserDTO
	 * @return
	 * @throws ServiceException
	 */
	List<UserSessionDTO> getAllUsers(BasicUserDTO basicUserDTO) throws ServiceException;	
	
	/**
	 * 
	 * @param userId
	 * @param imageName
	 * @param fileImage
	 * @param applicationPath
	 * @param uploaderId
	 * @param login
	 * @return
	 * @throws ServiceException
	 */
	ImageDTO transferProfileImage(long userId, String imageName, File fileImage, String applicationPath,long uploaderId,String login)throws ServiceException;
	
	/**
	 * Creates a new user.
	 * @param login
	 * @param password
	 * @param email
	 * @return
	 */
	long createUser(UserDTO userDTO) throws ServiceException, InvalidUserException;
	

	/**
	 * Get the user information by id.
	 * @param userId
	 * @return
	 * @throws ServiceException
	 */
	UserDTO getUserInformation(Long userId) throws ServiceException;
	
	/**
	 * Update a user by id.
	 * @param userDTO
	 * @throws ServiceException
	 */
	public void updateUser(final UserDTO userDTO) throws ServiceException;
	
	/**
	 * Authenticate By URL.
	 * @param login
	 * @return
	 * @throws ServiceException
	 * @throws InvalidUserException
	 */
	public UserDTO authenticateByURL(String login) throws ServiceException, InvalidUserException;
	
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws ServiceException
	 * @throws InvalidUserException
	 */
	 UserDTO getAnyUserFromId(final Long userId) throws ServiceException, InvalidUserException;
	
	/**
	 * User transfer information shipping
	 */
	void updateClientCategoryID(Long clientCategoryId, Long userId) throws ServiceException;
	
	/**
	 * 
	 * @param clcDTO
	 * @throws ServiceException
	 */
	 void updateTemplateCoeffitions(final ClientCategoryDTO clcDTO) throws ServiceException;
	
	/**
	 * 
	 * @param login
	 * @return
	 */
	User getUserByLogin(String login);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	User getCountUserShippingTotal(User user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	User getCountUserProductPrice(User user);
	
	/**
	 * 
	 * @return List<ClientCategory>
	 * @throws ServiceException 
	 */
	List<ClientCategoryDTO>getAllClientCategory() throws ServiceException;
	
	/**
	 * @return ClientCategory getClientCategoryById
	 */
	ClientCategoryDTO getClientCategoryById(Long clientCategoryId);
		
	/**
	 * 
	 * @param userDTO
	 * @return
	 * @throws ServiceException
	 */
	Long insertTemplate(UserDTO userDTO) throws ServiceException;
	
	/***
	 * 
	 * @param clientCategoryName
	 * @return
	 */
	ClientCategoryDTO getClientCategoryByName(String clientCategoryName);
	
	/**
	 * 
	 * @param userId
	 */
	void deleteTemplate(Long userId) throws ServiceException;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	boolean updateUserAdmin(UserDTO userDTO);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean updateNoteAdmin(UserDTO userDTO);
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	UserDTO getUserOrTemplateById(Long userId) ;
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 * @throws ServiceException
	 */
	UserDTO getAdmin(String login, String password)throws ServiceException;
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 * @throws ServiceException
	 */
	
	UserDTO getSuperAdmin(String login, String password)throws ServiceException;
	
	
	/**
	 * 
	 * @param userConnectionDTO
	 * @return
	 * @throws ServiceException
	 */
	boolean insertUserConnection(UserConnectionDTO userConnectionDTO)throws ServiceException;
	
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	UserConnectionDTO getUserConnectionByUserId(Long userId)throws ServiceException;
	
	/**
	 * 
	 * @param userLogin
	 * @return
	 * @throws ServiceException
	 */
	UserConnectionDTO getUserConnectionByLogin(final String userLogin)	throws ServiceException ;
	
	/**
	 * 
	 * @return
	 * @throws ServiceException
	 */
	List<UserConnectionDTO> getAllUsersConnections()throws ServiceException;
	
	/**
	 * 
	 * @param toEncode
	 * @return
	 * @throws Exception
	 */
	String encrypt (String toEncode) throws Exception;
	
	/**
	 * 
	 * @param toDecrypt
	 * @return
	 * @throws Exception
	 */
	String decrypt (String toDecrypt) throws Exception;
	/**
	 * 
	 * @param user
	 * @return
	 * @throws ServiceException
	 */
	boolean insertNewUserSumit(UserDTO userDTO)throws ServiceException;
	/**
	 * 
	 * @param userDTO
	 * @throws ServiceException
	 */
	public void disableUserByIdSumit(final UserDTO userDTO) throws ServiceException;
	/**
	 * 
	 * @param userDTO
	 * @throws ServiceException
	 */
	public void disableUserByLoginSumit(final UserDTO userDTO) throws ServiceException;
	
	
}