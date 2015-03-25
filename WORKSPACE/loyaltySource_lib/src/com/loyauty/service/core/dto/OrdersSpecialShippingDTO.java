package com.loyauty.service.core.dto;


import java.util.Date;

import lombok.Data;
import lombok.ToString;
	
@Data @ToString(callSuper=true)

public class OrdersSpecialShippingDTO   extends BasicDTO{
	private static final long serialVersionUID = 2378125672556889844L;

	private Long userId;
	private String lsProductId;
	private Double shippingPrice;
	private Date creationDate;
	private Long productId;
	
	
}
