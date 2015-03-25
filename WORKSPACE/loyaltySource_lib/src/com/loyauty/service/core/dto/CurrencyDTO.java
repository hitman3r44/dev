package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CurrencyDTO extends BasicDTO {

	private static final long serialVersionUID = 3466914371715581384L;
	
	private String	symbol;
	private Double	rate;
	private Date 	creationDate;
}
