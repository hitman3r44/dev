package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Currency extends AbstractEntity {

	private static final long serialVersionUID = -2854069873397928960L;
	
	private String	symbol;
	private Double	rate;
	private Date 	creationDate;
}