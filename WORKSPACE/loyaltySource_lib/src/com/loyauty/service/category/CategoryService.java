package com.loyauty.service.category;

import java.util.List;


import com.loyauty.exception.ServiceException;

import com.loyauty.service.Service;

import com.loyauty.service.core.dto.CategoryDTO;

public interface CategoryService extends Service {
	
	
	
	
	List<CategoryDTO> getAllCategory() throws ServiceException;
	
	void createCategory(CategoryDTO categoryDTO) throws ServiceException;
	
	boolean categoryExist(String categoryName) throws ServiceException;
	
	CategoryDTO getCategory(long categoryId) throws ServiceException;
		
	void editCategory(CategoryDTO categoryDTO) throws ServiceException;

	boolean existCategory(CategoryDTO categoryDTO) throws ServiceException;
	
	public long getCategoryGroupId(long categoryId) throws ServiceException;
	
	
}
