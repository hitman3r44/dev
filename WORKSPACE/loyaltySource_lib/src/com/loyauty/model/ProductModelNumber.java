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
public class ProductModelNumber extends AbstractEntity{
		  
	private Long productId;
	private String modelNumber;
	private Date creationDate;
	private Integer quantity;
	private String supplier;
	private String price;
	private String msrp;
}
