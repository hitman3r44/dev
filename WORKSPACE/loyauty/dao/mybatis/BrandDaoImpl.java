package com.loyauty.dao.mybatis;



import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.BrandDao;
import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.Product;


public class BrandDaoImpl  extends BasicGenericDaoImpl<Brand, Long> implements BrandDao{

	public BrandDaoImpl(SqlSession sqlSession, String mapper) {
		super(sqlSession, mapper);		
	}

	@Override
	public boolean existBrand(Brand brand){
		return((Brand) getSqlSession().selectOne(getNameSpace("getEntityByName"), brand) != null);
	}
}
