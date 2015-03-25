package com.loyauty.dao;



import com.loyauty.model.Brand;
import com.loyauty.model.Category;


public interface BrandDao extends BasicGenericDao<Brand, Long> {

	boolean existBrand(Brand brand);

}
