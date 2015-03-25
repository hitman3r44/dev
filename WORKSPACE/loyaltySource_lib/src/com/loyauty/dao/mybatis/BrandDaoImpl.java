package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.BrandDao;
import com.loyauty.model.Brand;
import com.loyauty.model.BrandCategoryGroup;


public class BrandDaoImpl  extends BasicGenericDaoImpl<Brand, Long> implements BrandDao{

	public BrandDaoImpl(SqlSession sqlSession, String mapper) {
		super(sqlSession, mapper);		
	}

	@Override
	public boolean existBrand(Brand brand){
		return((Brand) getSqlSession().selectOne(getNameSpace("getEntityByName"), brand) != null);
	}
	
	@Override
	public boolean existCode(Brand brand){
		return((Brand) getSqlSession().selectOne(getNameSpace("getEntityByCode"), brand) != null);
	}
	
	@Override
	public void insertCatG(BrandCategoryGroup brand) {
		getSqlSession().insert(getNameSpace("insertCatG"), brand);
	}
	
	@Override
	public void deleteCategoryGroupByBrandId(Long id) {
		getSqlSession().delete(getNameSpace("deleteCatG"), id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Brand> getAllBrandByCategoryGroup(Long categoryGroupId) {
		return (List<Brand>) getSqlSession().selectList(getNameSpace("getAllBrandByCategoryGroup"), categoryGroupId);
	}
}
