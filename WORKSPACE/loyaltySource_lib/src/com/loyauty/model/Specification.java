package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Status;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class Specification extends AbstractEntity{
	
	private Category category;
	private String name;
	private Status status;
	private Translation nameTranslation;
	private String description;
	private Boolean main;
	private Date creationDate;

}
