package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CategoryGroup extends AbstractEntity {

	private String 	name;	
	private String  code;
	private String  description;
	private Date    creationDate;
	
}



