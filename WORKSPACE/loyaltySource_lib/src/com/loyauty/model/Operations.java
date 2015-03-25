package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Operations  extends AbstractEntity{
	private Long id;   
	private String operationType;
	private String dataBefore;
	private String dataAfter;
	private Long userId;
	private Date operationDate;
	private String realNameUser;
	private Long objectId;
}
