package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Category extends AbstractEntity {
	
	private Long categoryGoupeId;
	private String 	name;	
	private String  code;
	private String  description;
	private Date  creationDate;
	private List<Long> brandsId;
	

}
