package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.Category;
import com.loyauty.model.CategoryBrand;


public interface CategoryDao extends BasicGenericDao<Category, Long> {

	
	List<Category> getCategoriesByBrand(long id);

	Category getCategoryByName(String categoryName);
	
	void insertCategoryBrands(CategoryBrand catBrand);
		
	void deleteCategoryBrandByCategoryId(long id);
	
	boolean existCategory(Category category);
	
	long getCategoryGroupId(long id);
	
}

