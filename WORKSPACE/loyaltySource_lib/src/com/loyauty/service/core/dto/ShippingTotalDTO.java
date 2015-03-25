package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ShippingTotalDTO extends BasicDTO {
	
	private static final long serialVersionUID = 6151644979368096785L;
	
	private Long productId;
	private Long provinceId;
	private Long userId;
	private String weightedProvinceTotalWithCoverage;
	private String averageShippingTotal;
	
}
