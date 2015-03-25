package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.Status;
import com.loyauty.enums.UserProductStatus;


@Data @ToString(callSuper=true)
public class UserProductDTO extends BasicDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long categoryId;
	private String upc;
	private String categoryName;
	private String msrp;
	private String cost;
	private String manufacturerProductId;
	private String lsProductId;
	private String nameEng;
	private String nameFr;
	private String specificationEn;
	private String specificationFr;
	private Long brandId;
	private String brandName;
	private Long userId;
	private String userPrice;
	private ProductStatus productStatus;
	private String dollarProfit;
	private String percProfit;
	
	private String BrandDiscount;
	private String CategoryDiscount;
	
	private PriceType priceType;
	
	private Status status;
	private UserProductStatus userProductStatus;
	
	public UserProductDTO() {	
	}

}
