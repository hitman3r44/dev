package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingCityDTO extends BasicDTO {
	
	private static final long serialVersionUID = 7128184176036594706L;
	
	private Long productId;
	private Long cityId;
	private String expeditedParcelPrice;

}
