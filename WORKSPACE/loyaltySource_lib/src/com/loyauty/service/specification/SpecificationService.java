package com.loyauty.service.specification;

import java.util.List;


import com.loyauty.exception.ServiceException;

import com.loyauty.service.Service;

import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.SpecificationDTO;

public interface SpecificationService extends Service {
	
	
	/**
	 * create specification
	 * @param dto
	 * @throws ServiceException
	 */
	void createSpecification(SpecificationDTO dto) throws ServiceException;
	
	/**
	 * 
	 * @param name
	 * @return
	 * @throws ServiceException
	 */
	
	boolean specificationExist(String name) throws ServiceException;
	
	/**
	 * 
	 * @param categoryId
	 * @return
	 * @throws ServiceException
	 */
	SpecificationDTO getSpecification(long specificationId) throws ServiceException;
	
	/**
	 * Edit Specification
	 * @param dto
	 * @throws ServiceException
	 */
	void editSpecification(SpecificationDTO dto) throws ServiceException;
	
	/**
	 * get All main specification DTO
	 * @return
	 * @throws ServiceException
	 */
	List<SpecificationDTO> getAllMainSpecification() throws ServiceException;	
	
	/**
	 * get categoryId given a specificationId.
	 * @param specificationId
	 * @return
	 * @throws ServiceException
	 */
	long getCategoryId(long specificationId) throws ServiceException;

}
