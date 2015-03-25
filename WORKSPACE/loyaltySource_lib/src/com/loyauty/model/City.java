package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class City extends AbstractEntity {
	
	private String name;
	private Long provinceId;
	private String populationPercent;
	private String postalCode;
	private Date creationDate;

}
