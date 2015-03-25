package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UserProvincePopulationDTO extends BasicDTO {
	
	private static final long serialVersionUID = -2134612863692691638L;
	
	private Long userId;
	private Long provinceId;	
	private String populationPercent;
	private Date creationDate;
	
	public UserProvincePopulationDTO() {
	}

}
