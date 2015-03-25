package com.loyauty.service.core.dto;

import java.util.Date;


import lombok.Data;
import lombok.ToString;

import com.loyauty.model.Image;


@Data @ToString(callSuper=true)
public class BrandDTO extends BasicDTO {
	
	private String name;
	private ImageDTO image;
	private String description;
	private String localizedCreationDate;
	private Date creationDate;
	
	private BrandDTO(long id){		
		setId(id);
	}
	
	private BrandDTO(long id, String name, ImageDTO image, String description, Date creationDate){		
		setId(id);
		setName(name);
		setImage(image);
		setDescription(description);
		setCreationDate(creationDate);
	}
	
	private BrandDTO(String name, ImageDTO image, String description){	
		setName(name);
		setImage(image);
		setDescription(description);
	}
	
	public static BrandDTO valueOf(long id, String name, ImageDTO image, String description, Date creationDate) {		
		return new BrandDTO(id, name, image, description, creationDate);
	}
	
	public static BrandDTO valueOf(String name, ImageDTO image, String description) {		
		return new BrandDTO(name, image, description);
	}
	
	public static BrandDTO valueOf(long id) {		
		return new BrandDTO(id);
	}

}
