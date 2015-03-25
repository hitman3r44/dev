package com.loyauty.dao.mybatis;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.apache.ibatis.session.SqlSession;



import com.loyauty.dao.BasicDao;
import com.loyauty.dao.mybatis.utils.DaoUtils;

/**
 *
 */
class BasicDaoImpl implements BasicDao{
	
	@Getter(AccessLevel.PROTECTED)
	@Setter(AccessLevel.PROTECTED)
	protected SqlSession sqlSession;
	

	@Getter(AccessLevel.PROTECTED)
	@Setter(AccessLevel.PROTECTED)
	String mapperName;
	
	public BasicDaoImpl(SqlSession sqlSession, String mapper){		
		setSqlSession(sqlSession);
		setMapperName(mapper);
	}
		
	protected String getNameSpace(String sqlFunctionId){
		return DaoUtils.getNameSpace(getMapperName(), sqlFunctionId);
	}
		
}
