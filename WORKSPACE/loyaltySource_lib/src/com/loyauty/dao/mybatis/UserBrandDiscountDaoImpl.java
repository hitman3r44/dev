package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.UserBrandDiscountDao;

import com.loyauty.model.UserBrandDiscount;

public class UserBrandDiscountDaoImpl extends BasicGenericDaoImpl<UserBrandDiscount, Long> implements UserBrandDiscountDao{

	public UserBrandDiscountDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}
	
	

	@Override
	public	UserBrandDiscount getUserBrandDiscount(UserBrandDiscount userBrandDiscount){
		return (UserBrandDiscount) getSqlSession().selectOne(getNameSpace("getUserBrandDiscount"), userBrandDiscount);		
	}
	
}
