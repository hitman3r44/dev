package com.loyauty.dao.mybatis.handler;

import com.loyauty.enums.ProductStatus;
import com.loyauty.model.LoyaltyEnum;

/**
 * 
 * @author Rafael
 *
 */
public class ProductStatusHandler extends LoyaltyEnumHandler<ProductStatus> {	
	
	public ProductStatusHandler() {
		super(ProductStatus.class);
	}
	
	public LoyaltyEnum[] getEnums() {	   
		return ProductStatus.values();
	}

}
