package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class OperationsDTO  extends BasicDTO {
	private static final long serialVersionUID = -297319522958106040L;
	
	private String operationType;
	private String dataBefore;
	private String dataAfter;
	private Long userId;
	private Date operationDate;
	private String realNameUser;
	private Long objectId;
	
		
}
