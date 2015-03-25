package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;

/**
 * Translation DAO interface.
 * 
 * @author Manuel
 *
 */
public interface TranslationDao extends BasicDao{	
	
	/**
	 * Fetches a translation by id.
	 * @param id
	 * @return
	 */
	Translation getTranslation(Long id);
	
	/**
	 * Fetches all the translated text we have on
	 * GameJab.
	 * @return
	 */
	List<Translation> getAllTranslations();
	
	/**
	 * Inserts a new translation.
	 * @param translation
	 */
	void insertTranslation(Translation translation);
	
	/**
	 * Fetches an entry by id.
	 * @param id
	 * @return
	 */
	TranslationEntry getEntry(Long id);	
	
	/**
	 * search an TranslationEntry by lang and translation
	 * @param entry
	 * @return
	 */
	TranslationEntry getEntrybyTranslationLang(TranslationEntry entry);
	
	/**
	 * Inserts a new translation entry.
	 * @param entry
	 */
	void insertEntry(TranslationEntry entry);
	
	/**
	 * Updates the entry text only.
	 * @param entry
	 */
	void updateEntry(TranslationEntry entry);
	
}
