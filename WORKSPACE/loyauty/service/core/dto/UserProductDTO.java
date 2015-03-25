package com.loyauty.service.core.dto;

import com.loyauty.enums.PriceType;
import com.loyauty.model.Translation;

import lombok.Data;
import lombok.ToString;


@Data @ToString(callSuper=true)
public class UserProductDTO extends BasicDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long categoryId;
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
	
	private String dollarProfit;
	private String percProfit;
	
	private String BrandDiscount;
	private String CategoryDiscount;
	
	private PriceType priceType;
	
	public UserProductDTO() {	
	}

}
