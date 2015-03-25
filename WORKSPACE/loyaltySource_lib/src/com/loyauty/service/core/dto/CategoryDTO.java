package com.loyauty.service.core.dto;

import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CategoryDTO extends BasicDTO {
	
	private Long categoryGoupeId;
	private String 	name;	
	private String  code;
	private String  description;
	private Date    creationDate;
	private String localizedCreationDate;
	private List<Long> brands;
	
	private CategoryDTO(long id){
		setId(id);
	}
	
	private CategoryDTO(long id, long categoryGoupeId, String name, String code, String description, Date creationDate){		
		setId(id);
		setName(name);
		setCode(code);
		setDescription(description);
		setCreationDate(creationDate);
		setCategoryGoupeId(categoryGoupeId);
	}
	
	public static CategoryDTO valueOf(long id, long categoryGoupeId, String name, String code, String description, Date creationDate){			
		return new CategoryDTO(id, categoryGoupeId, name, code, description, creationDate);
	}
	
	public static CategoryDTO valueOf(long id) {
		return new CategoryDTO(id);
	}
}
