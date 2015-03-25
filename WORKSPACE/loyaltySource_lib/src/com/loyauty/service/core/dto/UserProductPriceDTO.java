package com.loyauty.service.core.dto;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.UserProductStatus;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UserProductPriceDTO extends BasicDTO {
	
	private static final long serialVersionUID = 8924207970084475154L;
	private String productTitle;
	private String lsProductId;
	private Double stock;
	private Double priceNum;
	private Long userId;
	private Long productId;
	private Long count;
	private String price;
	private PriceType priceType;
	private UserProductStatus userStatus;
	private Boolean excluded;
	private String profit;
	private String discount;
	private String shippingCoverage;
	private String shippingTotalCanada;
	
	public UserProductPriceDTO() {
	}

}
