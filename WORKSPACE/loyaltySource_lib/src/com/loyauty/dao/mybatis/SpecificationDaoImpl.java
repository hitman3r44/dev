package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.SpecificationDao;
import com.loyauty.model.Specification;
import com.loyauty.service.core.dto.SpecificationDTO;



public class SpecificationDaoImpl extends BasicGenericDaoImpl<Specification, Long> implements SpecificationDao{

	public SpecificationDaoImpl(SqlSession sqlSession, String mapper) {
		super(sqlSession, mapper);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> getMainSpecificationByCategory(Long categoryId) {
		return (List<Specification>) getSqlSession().selectList(getNameSpace("getMainSpecificationByCategory"), categoryId);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> getAllMainSpecification() {
		return (List<Specification>) getSqlSession().selectList(getNameSpace("getAllMainSpecification"));
	}

	@Override
	public Specification getSpecificationByName(String name) {
		return (Specification)getSqlSession().selectOne(getNameSpace("getSpecificationByName"), name);
	}
	
	@Override
	public long getCategoryId(Long specificationId) {
		return (Long) getSqlSession().selectOne(getNameSpace("getCategoryId"), specificationId);
	}

}
