package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.UserCategoryDiscountDao;

import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;

public class UserCategoryDiscountDaoImpl extends BasicGenericDaoImpl<UserCategoryDiscount, Long> implements UserCategoryDiscountDao{

	public UserCategoryDiscountDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}

	@Override
	public UserCategoryDiscount getUserCategoryDiscount(UserCategoryDiscount userCatDiscount) {
		return (UserCategoryDiscount) getSqlSession().selectOne(getNameSpace("getUserCategoryDiscount"), userCatDiscount);	
	}

}
