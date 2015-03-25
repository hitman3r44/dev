package com.loyauty.model;

import java.util.Date;


import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CategoryBrand extends AbstractEntity {
	
	private Long categoryId;
	private Long brandId;	
	private Date creationDate;
	

}