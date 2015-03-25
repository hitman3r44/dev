package com.loyauty.service.core.dto;

import java.io.Serializable;

import com.loyauty.service.cache.Cacheable;

import lombok.Data;



/**
 * Basic class for all Data Transfer Objects in the system.
 * 
 * @author Manuel
 */
@Data
public class BasicDTO implements Serializable, Cacheable {	
		

	private long id;
	
	@Override
	public String makeKey() {
		StringBuilder builder = new StringBuilder(this.getClass().getName());
		builder.append("-");
		builder.append(getId());
		return builder.toString();
	}

	

	/**
	 * @param id
	 */
	public BasicDTO(long id) {
		super();
		this.id = id;
	}
	

	/**
	 * @param id
	 */
	public BasicDTO() {}	
	
}
