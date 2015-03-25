package com.loyauty.service.core.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
	 * 
	 */
	
@Data @ToString(callSuper=true)
public class RectangularProductDTO extends BasicDTO{
	private static final long serialVersionUID = 4759321829834742449L;
	
	private Integer index=0;
	private List<ProductDTO>listProductDTO;
	
	public RectangularProductDTO(){
		listProductDTO=new ArrayList<ProductDTO>();
	}

}
