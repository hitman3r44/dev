package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;


/**
 * 
 * @author Manuel
 *
 */ 
@Data @ToString(callSuper=true)
public class Brand extends AbstractEntity{

	private String name;
	private Image image;
	private String description;
	private Date creationDate;
	
	public Brand(){}
	
	  
}
