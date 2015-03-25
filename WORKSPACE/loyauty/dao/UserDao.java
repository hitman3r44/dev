package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.User;




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
	 * 
	 * @return List with all the users less administrator. We use this function to calculate points for users.
	 */
	List<Long> getAllUsersByIdLessAdministrators();
	
	/**
	 * getAllUserAccounts
	 * @param userType
	 * @return
	 */
	List<User> getAllUserAccounts(User userType);
	

	
}
