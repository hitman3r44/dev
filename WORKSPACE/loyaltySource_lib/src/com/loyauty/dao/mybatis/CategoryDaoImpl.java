package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.CategoryDao;
import com.loyauty.model.Category;
import com.loyauty.model.CategoryBrand;


public class CategoryDaoImpl extends BasicGenericDaoImpl<Category, Long> implements  CategoryDao{

	public CategoryDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getCategoriesByBrand(long id) {
		return (List<Category>) getSqlSession().selectList(getNameSpace("getCategoriesByBrand"), id);
	}

	@Override
	public Category getCategoryByName(String name) {
		return (Category) getSqlSession().selectOne(getNameSpace("getCategoryByName"), name);
	}

	@Override
	public void insertCategoryBrands(CategoryBrand catBrand) {
		getSqlSession().insert(getNameSpace("insertCategoryBrands"), catBrand);
	}
	
	@Override
	public boolean existCategory(Category category) {
		return((Category) getSqlSession().selectOne(getNameSpace("getEntityByName"), category) != null);
	}

	@Override
	public void deleteCategoryBrandByCategoryId(long id) {
		getSqlSession().delete(getNameSpace("deleteCategoryBrandByCategoryId"), id);
	}
	
	@Override	
	public long getCategoryGroupId(long id) {
		return ((Long) getSqlSession().selectOne(getNameSpace("getCategoryGroupId"), id));
	}

}
