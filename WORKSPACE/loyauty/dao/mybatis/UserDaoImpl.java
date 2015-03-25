package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.UserDao;
import com.loyauty.model.User;



/**
 * User DAO implementation.
 *
 *
 */
public class UserDaoImpl extends BasicDaoImpl implements UserDao{

	public UserDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}

	@Override
	public User getUser(Long userId) {		
		return (User) getSqlSession().selectOne(getNameSpace("getUserFromId"), userId);
	}	

	@Override
	public User getUser(String username) {
		return (User) getSqlSession().selectOne(getNameSpace("getUserFromLogin"), username);
	}	
	
	@Override
	public boolean usernameExists(String username) {		
		return (getSqlSession().selectOne(getNameSpace("usernameExists"), username) != null);
	}

	@Override
	public boolean emailExists(String email) {		
		return (getSqlSession().selectOne(getNameSpace("emailExists"), email) != null);
	}
	
	@Override
	public void insertUserAccount(User user) {
		getSqlSession().insert(getNameSpace("insertUserAccount"), user);
	}
	
	@Override
	public void updateUserAccount(User user) {
		getSqlSession().insert(getNameSpace("updateUserAccount"), user);		
	}
	
	@Override
	public void insertUserProfil(User user) {
		getSqlSession().insert(getNameSpace("insertUserProfil"), user);		
	}
	
	@Override
	public void insertProductToUsers(User user) {
		getSqlSession().insert(getNameSpace("insertProductToUsers"), user);		
	}
			
	@Override
	public User getUserByEmail(String useremail) {
		return (User) getSqlSession().selectOne(getNameSpace("getUserByEmail"), useremail);
	}

	@Override
	public void updateLogin(User user) {
		getSqlSession().update(getNameSpace("updateLogin"), user);
		
	}
	
	@Override
	public void updatePassword(User user) {
		getSqlSession().update(getNameSpace("updatePassword"), user);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getAllUsersByIdLessAdministrators(){
		return getSqlSession().selectList(getNameSpace("getAllUsersByIdLessAdministrators"));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUserAccounts(User userType) {
		return (List<User>) getSqlSession().selectList(getNameSpace("getAllUserAccounts"), userType);
	}
	


	
}
