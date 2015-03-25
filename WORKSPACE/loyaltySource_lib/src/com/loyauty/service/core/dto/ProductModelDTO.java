package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;


@Data @ToString(callSuper=true)
public class ProductModelDTO extends BasicDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String name;
	private Integer quantity;
	private String supplier;
	private String price;
	private String msrp;
	
	private ProductModelDTO(long id){		
		setId(id);
	}
	
	private ProductModelDTO(long id, String name, Integer porductId, Integer quantity, String suppliers, String price, String msrp){		
		setId(id);
		setName(name);
		setProductId(porductId);
		setQuantity(quantity);
		setSupplier(suppliers);
		setPrice(price);
		setMsrp(msrp);
	}
	
	public static ProductModelDTO valueOf(long id, String name, Integer porductId, Integer quantity) {		
		return new ProductModelDTO(id, name, porductId, quantity, null, null, null);
	}
	
	public static ProductModelDTO valueOf(long id) {		
		return new ProductModelDTO(id);
	}
	 
	public static ProductModelDTO valueOf(long id, String name) {		
		return new ProductModelDTO(id, name, null, null, null, null, null);
	}
	
	public static ProductModelDTO valueOf(long id, String name, Integer quantity, String suppliers) {		
		return new ProductModelDTO(id, name, null, quantity, suppliers, null, null);
	}
	
	public static ProductModelDTO valueOf(long id, String name, Integer quantity, String suppliers, String price) {		
		return new ProductModelDTO(id, name, null, quantity, suppliers, price, null);
	}
	
	public static ProductModelDTO valueOf(long id, String name, Integer quantity, String suppliers, String price, String msrp) {		
		return new ProductModelDTO(id, name, null, quantity, suppliers, price, msrp);
	}

}
