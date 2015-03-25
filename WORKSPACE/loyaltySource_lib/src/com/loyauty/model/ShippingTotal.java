package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingTotal extends AbstractEntity {
	
	private Long productId;
	private Long provinceId;
	private Long userId;
	private String weightedProvinceTotalWithCoverage;
	private String averageShippingTotal;
	private Date creationDate;

}
