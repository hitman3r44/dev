package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Language;
import com.loyauty.enums.Status;
import com.loyauty.model.Specification;

import com.loyauty.model.Translation;

@Data @ToString(callSuper=true) 
public class SpecificationDTO extends BasicDTO{
	
	private CommonDTO category;
	private String name;
	private Status status;
	private Long translationId;
	private CommonDTO nameEng;
	private CommonDTO nameFr;	
	private String description;
	private Boolean main;
	private Date creationDate;
	private Long categoryGoupeId;
	
	
	public SpecificationDTO(){		
	}
	
	private SpecificationDTO(Specification sp){
		setId(sp.getId());
		setCategory(CommonDTO.valueOf( sp.getCategory().getId(), 
					sp.getCategory().getName()	));
		setName(sp.getName());		
		Translation trans = sp.getNameTranslation();
		setTranslationId(trans.getId());
		setNameEng(trans.getLocalizedCommonDTO(Language.ENGLISH));
		setNameFr(trans.getLocalizedCommonDTO(Language.FRENCH));
		setDescription(sp.getDescription());
		setMain(sp.getMain());
		setCreationDate(sp.getCreationDate());
		setStatus(sp.getStatus());
		setCategoryGoupeId(sp.getCategory().getCategoryGoupeId());
		
	}
	
	public static SpecificationDTO valueOf(Specification sp){		
		return new SpecificationDTO(sp);
	}
	
}
