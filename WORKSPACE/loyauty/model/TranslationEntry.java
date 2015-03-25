package com.loyauty.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Language;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.util.CommonUtils;

/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true)
public class TranslationEntry extends AbstractEntity implements Serializable{
	
	private Long transId;
	private Language language; 
	private String text;
	private Date creationDate;	
	
	public TranslationEntry(){}
	
	/**
	 * Use this constructor when you want to create a new
	 * text translation entry.The entered text language will be
	 * considered English by default.
	 * 
	 * @param text
	 */
	public TranslationEntry(Long transId, String text){		
		this(transId , text, Language.ENGLISH);
	}
	
	/**
	 * Use this constructor when you want to create a new
	 * text translation entry.The entered text language is determined 
	 * from the parameter you pass in.
	 * 
	 * @param language
	 * @param text
	 */
	public TranslationEntry(Long transId, String text, Language language){		
		this.transId = transId;
		this.language = language;
		this.setText(text);
	}	
	public void setText(String text) {
		if(text != null)
			this.text = CommonUtils.normalizeDescription(text.trim());
	}
	
	public TranslationEntry(CommonDTO commonDTO)
	{
		setId(commonDTO.getId());
		setText(commonDTO.getName());
	}
}
