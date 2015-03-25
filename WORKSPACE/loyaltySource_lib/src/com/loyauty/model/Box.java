package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Box extends AbstractEntity {
	
	private static final long serialVersionUID = 8697474556621530000L;
	
	private Double length;
	private Double width;
	private Double height;
	private Double weight;
	private Double totalWeight;
	private Long productId;
	private Date creationDate;
	private Date updateDate;
	private Integer statusId;
}
