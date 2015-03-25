package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.Status;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class Product extends AbstractEntity{
		  
	private Translation name;
	private Translation description;
	private Image image;
	private Status status;
	private String msrp;
	private String cost;
	private Brand brand;
	private String loyaltySourceProductId;
	private Integer productWidth;
	private Integer productHigh;
	private Integer productLong;
	private String weight;
	private Date creationDate;
	private Long typeId;
	private Long valueSpecificationId;
	private Long userId;
	private String userPrice;
	private Category category;
	private Translation specification;
	private List<ProductModelNumber> modelNumberList;
	private Integer priceType;
	
	
}
