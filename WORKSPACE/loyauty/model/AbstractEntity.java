package com.loyauty.model;

import lombok.Data;

/**
 * Baisc entity that all entities in the system should extend.
 * @author Muthanna
 *
 */
@Data
abstract class AbstractEntity {	
	
	// All entity objects should have IDs
	private Long id;
	
	protected AbstractEntity(){}
	
	protected AbstractEntity(Long id){
		this.id = id;
	}
}
