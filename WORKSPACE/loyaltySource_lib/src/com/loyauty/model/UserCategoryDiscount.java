package com.loyauty.model;

import java.sql.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class UserCategoryDiscount  extends AbstractEntity{
	
	private Long userId;
	private Long categoryId;
	private String discount;
	private Date creationDate;
	
	
}
