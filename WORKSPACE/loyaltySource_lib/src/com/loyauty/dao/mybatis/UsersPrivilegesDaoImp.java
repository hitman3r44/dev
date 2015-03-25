package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import com.loyauty.dao.UsersPrivilegesDao;
import com.loyauty.model.UsersPrivileges;

public class UsersPrivilegesDaoImp extends BasicDaoImpl implements UsersPrivilegesDao {

		public UsersPrivilegesDaoImp(SqlSession sqlSession, String mapper) {
		super(sqlSession, mapper);
		// TODO Auto-generated constructor stub
	}


	@Override
	public UsersPrivileges getPrivilegesByUser(UsersPrivileges userP) {		
		return (UsersPrivileges) getSqlSession().selectOne(getNameSpace("getPrivilegesByUser"), userP);
	}	

		
}
