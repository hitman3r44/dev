package com.loyauty.service.core.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ProvinceDTO extends BasicDTO {
	
	private static final long serialVersionUID = -8503100273611919351L;
	
	private String name;
	private String code;
	private String populationPercent;
	private String taxe;
	private List<CityDTO> listCities=new ArrayList<CityDTO>(); 

}
