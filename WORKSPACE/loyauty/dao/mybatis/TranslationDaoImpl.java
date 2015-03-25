package com.loyauty.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.loyauty.dao.TranslationDao;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;

/**
 * Translation DAO implementation based on the generic DAO.
 *
 * @author Manuel
 *
 */
public class TranslationDaoImpl extends BasicDaoImpl implements TranslationDao{

	public TranslationDaoImpl(SqlSession sqlSession, String mapperName) {
		super(sqlSession, mapperName);		
	}
	
	@Override
	public Translation getTranslation(Long id) {		
		return (Translation) getSqlSession().selectOne(getNameSpace("getTranslation"), id);
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Translation> getAllTranslations() {		
		return  getSqlSession().selectList(getNameSpace("getAllTranslations"));
	}
	
	@Override
	public void insertTranslation(Translation translation){
		getSqlSession().insert(getNameSpace("insertTranslation"), translation);
	}

	@Override
	public TranslationEntry getEntry(Long id) {
		return (TranslationEntry) getSqlSession().selectOne(getNameSpace("getEntry"), id);
	}

	@Override
	public void insertEntry(TranslationEntry entry) {		
		getSqlSession().insert(getNameSpace("insertEntry"), entry);		
	}
	
	@Override
	public void updateEntry(TranslationEntry entry) {
		getSqlSession().update("updateEntry", entry);	
	}

	@Override
	public TranslationEntry getEntrybyTranslationLang(TranslationEntry entry) {
		return (TranslationEntry) getSqlSession().selectOne(getNameSpace("getEntrybyTranlationLang"), entry);
	}
	
}
