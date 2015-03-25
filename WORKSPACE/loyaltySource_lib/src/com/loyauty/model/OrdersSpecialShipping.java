package com.loyauty.model;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class OrdersSpecialShipping   extends AbstractEntity{

	private Long userId;
	private String lsProductId;
	private Double shippingPrice;
	private Date creationDate;
	private Long productId;
	
}
