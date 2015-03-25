package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class BoxDTO extends BasicDTO {

	private static final long serialVersionUID = 8351055550711640202L;
	
	private Double length=0.0;
	private Double width=0.0;
	private Double height=0.0;
	private Double weight=0.0;
	private Double totalWeight=0.0;
	private Long productId;
	private Date creationDate;
	private Date updateDate;
	private Integer statusId;
}
