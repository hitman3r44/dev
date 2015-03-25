package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CommonUserDiscountDTO extends BasicDTO {
	
	private Long userId;
	private Long brandId;
	private Long categoryId;
	private String discount;
	private Date creationDate;
	
	
}
