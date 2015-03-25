package com.loyauty.model;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author Rafael
 *
 */
@Data @ToString(callSuper=true) 
public class AlterUserProductXML extends AbstractEntity {
	private Long userId;
	private Long productId;
	private Boolean priceDiscount;
	private Boolean excluded;
	private Boolean shipping;
	private Boolean userProductToBeExecuted;
	private Boolean excludedMeaning;
	
	//used for generation XML Product Feed
	private Boolean price;
}