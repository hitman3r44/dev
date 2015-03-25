package com.loyauty.service.core.dto;

import java.util.List;

import lombok.Data;
import lombok.ToString;



@Data @ToString(callSuper=true)
public class ProductListDTO extends BasicDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int sortBy;
	private String minimumRange;
	private String maximumRange;
	private List<ProductDTO> productList;
	
}
