package com.loyauty.service.core.dto;


import lombok.Data;
import lombok.ToString;
@Data @ToString(callSuper=true)
public class ItemMapDTO extends BasicDTO{
	private static final long serialVersionUID = -2583975860795485209L;
	
    private String key;
	private String value;

}

