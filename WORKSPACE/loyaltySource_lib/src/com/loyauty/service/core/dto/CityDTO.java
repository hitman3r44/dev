package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CityDTO extends BasicDTO {
	
	private static final long serialVersionUID = 2378049131669224961L;
	
	private String name;
	private Long provinceId;
	private String populationPercentage;
	private String postalCode;

}
