package com.loyauty.service.core.dto;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CategoryGroupDTO extends BasicDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String 	name;	
	private String  code;
	private String  description;
	private Date    creationDate;
	
	private CategoryGroupDTO(long id) {
		setId(id);
	}
	
	private CategoryGroupDTO(long id, String name, String code, String description, Date creationDate) {		
		setId(id);
		setName(name);
		setCode(code);
		setDescription(description);
		setCreationDate(creationDate);
	}
	
	public static CategoryGroupDTO valueOf(long id, String name, String code, String description, Date creationDate){			
		return new CategoryGroupDTO(id, name, code, description, creationDate);
	}
	
}
