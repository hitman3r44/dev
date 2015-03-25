package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class Province extends AbstractEntity {
	
	private String name;
	private String code;
	private String populationPercent;
	private Date creationDate;
	private String taxe;

}
