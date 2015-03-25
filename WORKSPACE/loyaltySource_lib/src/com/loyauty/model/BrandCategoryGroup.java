package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;


/**
 * 
 * @author jaideep
 *
 */ 
@Data @ToString(callSuper=true)
public class BrandCategoryGroup extends AbstractEntity{

	private Long brandid;
	private Date creationDate;
	private Long idCategoryGroup;
	
	public BrandCategoryGroup(){}
	
	  
}