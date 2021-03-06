package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class ProductModelNumber extends AbstractEntity{
		  
	private Long productId;
	private String modelNumber;
	private Date creationDate;
}
