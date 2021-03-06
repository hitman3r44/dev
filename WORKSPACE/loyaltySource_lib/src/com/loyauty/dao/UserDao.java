package com.loyauty.dao;

import java.util.ArrayList;
import java.util.List;

import com.loyauty.model.ClientCategory;
import com.loyauty.model.Select;
import com.loyauty.model.User;
import com.loyauty.model.UserConnection;

/**
 * User DAO interface.
 * 
 *
 */
public interface UserDao extends BasicDao{
	
	/**
	 * Gets a user by id.
	 * @param userId
	 * @return
	 */
	User getUser(Long userId);
	
	//for Including Template in shipping
	User getAnyUserFromId(Long userId);
	
	
	/**
	 * Gets a user by login
	 * @param login
	 * @return
	 */
	User getUser(String username);

	/**
	 * Gets a get User By Email
	 * @param login
	 * @return
	 */
	User getUserByEmail(String useremail);	
	
	/**
	 * checks wheter the user name is already used.
	 * @param username
	 * @return
	 */
	boolean usernameExists(String username);
	
	/**
	 * checks wheter the email is already used.
	 * @param email
	 * @return
	 */
	boolean emailExists(String email);
	
	/**
	 * Inserts a new user account.
	 * @param user
	 */
	void insertUserAccount(User user);
	
	/**
	 * Inserts a new user profil.
	 * @param user
	 */
	void insertUserProfil(User user);
	
	/**
	 * Inserts the relation with the new user with all the products.
	 * @param user
	 */
	void insertProductToUsers(User user);
	
	/**
	 * 
	 * @param userConnection
	 * @return
	 */
	boolean insertUserConnection(UserConnection userConnection);
	
	
	/**
	 * Updates a user existing account.
	 * @param user
	 */
	void updateUserAccount(User user);
	
	/**
	 * update user login
	 * @param user
	 */
	void updateLogin(User user);
	
	/**
	 * 
	 * @param user
	 */
	void updatePassword(User user);
	
	/**
	 * List with all the users less administrator. We use this function to calculate points for users.
	 * @return 
	 */
	List<Long> getAllUsersByIdLessAdministrators();
	
	/**
	 * getAllUserAccounts
	 * @param userType
	 * @return
	 */
	List<User> getAllUserAccounts(User userType);
		
	/**
	 * getAllUsers
	 * @param userType
	 * @return
	 */
	List<User> getAllUsers(User userType);	
	
	/**
	 * Update all user by Id.
	 * This includes two mapping-id's in the UserMapper.xml file:
	 * 		> updateUserAccountById
	 * 		> updateUserProfileById
	 * @param user
	 */
	void updateUserById(User user);
	
	/**
	 * User transfer information shipping
	 */
	void updateClientCategoryID(Select select);
	
	/**
	 * 
	 * @param clc
	 */
	void updateTemplateCoeffitions(ClientCategory clc);
	
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
	 */
	ArrayList<ClientCategory>getAllClientCategory();
	
	/**
	 * 	@return ClientCategory getClientCategoryById
	 */
	ClientCategory getClientCategoryById(Long clientCategoryId);
	
	/**
	 * 
	 * @param clientCategoryName
	 * @param clientCategoryUserId
	 * @return
	 */

	void insertTemplateOnUserAccount(User user);
	
	void insertTemplateOnUserProfile(User user);
	
	/**
	 * 
	 * @param clientCategoryName
	 * @return
	 */
	ClientCategory getClientCategoryByName(String clientCategoryName);
		
	/**
	 * 
	 * @param select
	 */
	void deleteUserProfile(Select select);
	
	/**
	 * 
	 * @param select
	 */
	void deleteUserAccount(Select select);
	
	/**
	 * 
	 * @param user
	 */
	boolean updateUserAdmin(User user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	boolean updateNoteAdmin(User user);
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	User getUserOrTemplateById(Long userId);
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	User getAdmin(String login, String password);
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	User getSuperAdmin(String login, String password);
	 /**
	  * 
	  * @param userId
	  * @return
	  */
	 UserConnection getUserConnectionByUserId(Long userId);
	 
	 /**
	  * 
	  * @param userLogin
	  * @return
	  */
	 UserConnection getUserConnectionByLogin(String userLogin);

	 /**
	  * 
	  * @return
	  */
	 List<UserConnection> getAllUsersConnections();
	 
	 /**
	  * 
	  * @param user
	  * @return
	  */
	 boolean insertNewUserSumit(User user);
	 
	 /**
	  * 
	  * @param user
	  */
	 void disableUserByIdSumit(User user);
	 /**
	  * 
	  * @param user
	  */
	 void disableUserByLoginSumit(User user);
	
}
