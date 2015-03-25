package com.loyauty.dao;

import java.util.List;

import com.loyauty.model.Brand;
import com.loyauty.model.BrandCategoryGroup;


public interface BrandDao extends BasicGenericDao<Brand, Long> {

	boolean existBrand(Brand brand);
	
	boolean existCode(Brand brand);
	void insertCatG(BrandCategoryGroup brand);
	void deleteCategoryGroupByBrandId(Long id);

	List<Brand> getAllBrandByCategoryGroup(Long catid);

}
