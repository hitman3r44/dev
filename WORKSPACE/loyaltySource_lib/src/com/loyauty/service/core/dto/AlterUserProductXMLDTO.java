package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class AlterUserProductXMLDTO extends BasicDTO {
	
	private static final long serialVersionUID = 7547218789869206986L;
	
	private Long userId;
	private Long productId;
	private Boolean priceDiscount;
	private Boolean excluded;
	private Boolean shipping;
	private Boolean userProductToBeExecuted;
	private Boolean excludedMeaning;
	
	//used for generation XML Product Feed
	private Boolean price;
	
	public AlterUserProductXMLDTO() {
	}

}
