package com.loyauty.model;

import java.io.Serializable;

import lombok.Data;

/**
 * Baisc entity that all entities in the system should extend.
 * @author Muthanna
 *
 */
@Data
abstract class AbstractEntity implements Serializable {	
	
	private static final long serialVersionUID = 4800527364331826902L;
	
	// All entity objects should have IDs
	private Long id;
	
	protected AbstractEntity(){}
	
	protected AbstractEntity(Long id){
		this.id = id;
	}
}
