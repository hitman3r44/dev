package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.Language;
import com.loyauty.model.LoyaltyEnum;

/**
 * 
 * @author Muthanna
 *
 */
public class LanguageHandler extends LoyaltyEnumHandler<Language> {	
	
	public LanguageHandler() {
		super(Language.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return Language.values();
	}

}
