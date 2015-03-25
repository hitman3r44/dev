package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingCity extends AbstractEntity {
	
	private Long productId;
	private Long cityId;
	private String expeditedParcelPrice;
	private Date creationDate;

}
