package com.loyauty.service.user;

import java.io.File;
import java.util.List;

import com.loyauty.exception.InvalidUserException;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ImageDTO;
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
	 * list of all active user
	 * @param basicUserDTO
	 * @return
	 * @throws ServiceException
	 */
	
	List<UserSessionDTO> getAllUserAccounts(BasicUserDTO basicUserDTO) throws ServiceException;
	
	ImageDTO transferProfileImage(long userId, String imageName, File fileImage, String applicationPath,long uploaderId,String login)throws ServiceException;
	
	/**
	 * Creates a new user.
	 * @param login
	 * @param password
	 * @param email
	 * @return
	 */
	long createUser(UserDTO userDTO) throws ServiceException, InvalidUserException;
	


}