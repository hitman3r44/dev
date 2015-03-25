package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingProvince extends AbstractEntity {
	
	private Long productId;
	private Long provinceId;
	private String weightedTotalProvince;
	private Date creationDate;

}
