package com.loyauty.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.ImageDao;
import com.loyauty.model.Image;

public class ImageDaoImpl extends BasicGenericDaoImpl<Image, Long> implements ImageDao{

	public ImageDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);
	}



}
