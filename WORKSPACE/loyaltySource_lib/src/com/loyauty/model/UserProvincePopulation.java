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
public class UserProvincePopulation extends AbstractEntity {
		  
	private Long userId;
	private Long provinceId;
	private String populationPercent;
	private Date creationDate;

}
