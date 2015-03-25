package com.loyauty.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Generic DAO that provides database's common CRUD operations. 
 * 
 *
 * @param <T>
 * @param <PK>
 */
public interface BasicGenericDao<T, PK extends Serializable> extends BasicDao {
	
	/**
	 * Gets an entity by id
	 * 
	 * @param id
	 * @return the entity
	 */
	T getEntity(PK id);

	/**
	 * Checks if an entity exists in the database
	 * 
	 * @param id
	 * @return
	 */
	boolean entityExists(PK id);

	/**
	 * Inserts a new entity
	 * 
	 * @param object
	 */
	void insertEntity(T entity);
	
	/**
	 * Updates an already existing entity
	 * 
	 * @param object
	 */
	void updateEntity(T entity);

	/**
	 * Deletes an entity
	 * 
	 * @param id
	 */
	void deleteEntity(PK id);

	/**
	 * Looks up a list of entities
	 * 
	 * @return list of objects
	 */
	List<T> getAllEntities();

	/**
	 * Calculates the count of all entities
	 * 
	 * @return
	 */
	Long getAllEntitiesCount();	
}