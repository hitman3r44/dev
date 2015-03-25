package com.loyauty.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.loyauty.service.core.dto.CommonDTO;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author Manuel
 * 
 */
@Data @ToString(callSuper=true)
public class Translation extends AbstractEntity implements Serializable{
	
	private Date creationDate;	
	private List<TranslationEntry> entries;
	
	public Translation(){		
		super();
	}
	
	public String getLocalizedText(LoyaltyEnum language){
		String text = "";
		
		if(entries != null){
			for(TranslationEntry entry:entries){
				if(entry.getLanguage().equals(language)){
					text = entry.getText();
					break;
				}				
			}
		}
		
		return text;
	}
	
	public CommonDTO getLocalizedCommonDTO(LoyaltyEnum language){
		CommonDTO dto = null;
		
		if(entries != null){
			for(TranslationEntry entry:entries){
				if(entry.getLanguage().equals(language)){
					dto = CommonDTO.valueOf(entry.getId(), entry.getText());
					break;
				}				
			}
		}
		
		return dto;
	}
	
}
