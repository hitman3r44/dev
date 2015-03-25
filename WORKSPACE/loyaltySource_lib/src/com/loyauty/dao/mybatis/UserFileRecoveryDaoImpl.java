package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.UserFileRecoveryDao;
import com.loyauty.model.UserFileRecovery;


public class UserFileRecoveryDaoImpl extends BasicDaoImpl implements UserFileRecoveryDao {

	public UserFileRecoveryDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);
		
	}

	@Override
	public boolean insertUserFileRecovery(UserFileRecovery userFileRecovery) {
		boolean result= false;
		int success=getSqlSession().insert(getNameSpace("insertUserFileRecovery"), userFileRecovery);
		if(success>=0)result=true;
		return result;
	}

}
