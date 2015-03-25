package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class ProductLinkDTO extends BasicDTO{
		  
	private Long productId;
	private String link;
	private Date creationDate;
	
	private ProductLinkDTO(long id){
		setId(id);
	}
	
	private ProductLinkDTO(long id, long productId, String link, Date creationDate){		
		setId(id);
		setProductId(productId);
		setLink(link);
		setCreationDate(creationDate);
	}
	
	private ProductLinkDTO(String link, Long productId){	
		setLink(link);
		setProductId(productId);
		
	}
	
	public static ProductLinkDTO valueOf(String link, Long productId){			
		return new ProductLinkDTO(link, productId);
	}
	
	public static ProductLinkDTO valueOf(long id, long productId, String link, Date creationDate){			
		return new ProductLinkDTO(id, productId, link, creationDate);
	}
	
	public static ProductLinkDTO valueOf(long id) {
		return new ProductLinkDTO(id);
	}
}
