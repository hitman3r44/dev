package com.loyauty.dao;


import java.util.List;

import com.loyauty.model.Specification;

public interface SpecificationDao extends BasicGenericDao<Specification, Long> {
		
	List<Specification> getMainSpecificationByCategory(Long categoryId);
	
	List<Specification> getAllMainSpecification();	
	
	Specification getSpecificationByName(String name);
	
	long getCategoryId(Long specificationId);
}
