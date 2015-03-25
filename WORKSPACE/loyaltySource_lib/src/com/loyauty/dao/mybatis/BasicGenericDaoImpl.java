package com.loyauty.dao.mybatis;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.loyauty.dao.BasicGenericDao;


/**
 * Generic DAO implementation.
 * @param <T>
 * @param <PK>
 */
class BasicGenericDaoImpl<T, PK extends Serializable> extends BasicDaoImpl implements BasicGenericDao<T, PK> {	

	protected final Logger log = Logger.getLogger(this.getClass());
	
	public BasicGenericDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}
	
	@SuppressWarnings("unchecked")	
	@Override
	public T getEntity(PK id){		
		return (T) getSqlSession().selectOne(getNameSpace("getEntity"), id);		 
	}
	
	@Override
	public boolean entityExists(PK id){	
		return (getEntity(id) != null);	
	}
	
	@Override
	public void insertEntity(T entity) {
		getSqlSession().insert(getNameSpace("insertEntity"), entity);
	}
	
	@Override
	public void updateEntity(T entity) {		
		getSqlSession().update(getNameSpace("updateEntity"), entity);
	}
	
	@Override
	public void deleteEntity(PK id) {
		getSqlSession().delete(getNameSpace("deleteEntity"), id);
	}
		
	@Override
	@SuppressWarnings("unchecked")
	public List<T> getAllEntities() {
		return getSqlSession().selectList(getNameSpace("getAllEntities"));
	}
			
	@Override
	public Long getAllEntitiesCount() {
		return (Long) getSqlSession().selectOne(getNameSpace("getAllEntitiesCount"));		
	}
	
}
