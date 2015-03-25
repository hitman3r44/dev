package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingProvinceDTO extends BasicDTO {
	
	private static final long serialVersionUID = -1948519666373421096L;
	
	private Long productId;
	private Long provinceId;
	private String weightedTotalProvince;
	
}
