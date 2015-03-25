package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.Status;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class SpecificationValue extends AbstractEntity{
		  
	private Translation specificationValue;
	private Date creationDate;
}
