package com.loyauty.service.core.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;


@Data @ToString(callSuper=true)
public class BrandDTO extends BasicDTO {
	private static final long serialVersionUID = -7999559906239452508L;
	
	private String name;
	private ImageDTO image;
	private String description;
	private String localizedCreationDate;
	private Date creationDate;
	private String hrefName;
	private String code;
	private Integer hide;
	private Double satisfact;
	private List<Long> categoryGroupListLong; 

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
	
	private BrandDTO(long id, String name, String description, Date creationDate){		
		setId(id);
		setName(name);
		setDescription(description);
		setCreationDate(creationDate);
	}
	
	private BrandDTO(String name, ImageDTO image, String description){	
		setName(name);
		setImage(image);
		setDescription(description);
	}
	
	private BrandDTO(String name, ImageDTO image, String description, String code, List<Long>categoryGroupListLong){	
		setName(name);
		setImage(image);
		setDescription(description);
		setCode(code);
		setCategoryGroupListLong(categoryGroupListLong);
	}
	
		
	private BrandDTO(long id, String name, String code, String description, ImageDTO image, Date creationDate) {
		setId(id);
		setName(name);
		setCode(code);
		setDescription(description);
		setImage(image);
		setCreationDate(creationDate);
	}

	public static BrandDTO valueOf(long id, String name, ImageDTO image, String description, Date creationDate) {		
		return new BrandDTO(id, name, image, description, creationDate);
	}
	
	public static BrandDTO valueOf(long id, String name, String code, ImageDTO image, String description, Date creationDate) {		
		return new BrandDTO(id, name, code, description, image, creationDate);
	}
	
	public static BrandDTO valueOf(long id, String name, String description, Date creationDate) {		
		return new BrandDTO(id, name, description, creationDate);
	}
	
	public static BrandDTO valueOf(String name, ImageDTO image, String description) {		
		return new BrandDTO(name, image, description);
	}
	
	public static BrandDTO valueOf(String name, ImageDTO image, String description, String code, List<Long> categoryGroupListLong) {		
		return new BrandDTO(name, image, description, code,categoryGroupListLong);
	}
	
	public static BrandDTO valueOf(long id) {		
		return new BrandDTO(id);
	}
	
	public static BrandDTO valueOf(long id, String name) {
		return new BrandDTO(id, name, null, null);		
	}
	
	//public static BrandDTO valueOf(long id, String name, List<Long> categoryGroupList, String code, String description, ImageDTO image, Date creationDate) {		
		//return new BrandDTO(id, name, categoryGroupList, code, description, image, creationDate);
	//}
	
	
	

}
