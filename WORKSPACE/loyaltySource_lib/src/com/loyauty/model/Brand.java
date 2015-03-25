package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Brand extends AbstractEntity{

	private String name;
	private Image image;
	private String description;
	private Date creationDate;
	private String code;
	private Long idCategoryGroup;
	private Integer hide;
	private Double satisfact;
	private List<Long> categoryGroupId;
	
	public Brand(){}
	
	  
}
