package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.UserProductStatus;
/**
 * 
 * @author Rafael
 *
 */
@Data @ToString(callSuper=true) 
public class UserProductPrice extends AbstractEntity {
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
	private Date creationDate;
	private String profit;
	private String discount;
	private String shippingCoverage;
	private String shippingTotalCanada;

}
