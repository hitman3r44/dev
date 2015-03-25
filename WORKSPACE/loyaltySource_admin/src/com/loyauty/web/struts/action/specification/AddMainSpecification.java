package com.loyauty.web.struts.action.specification;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;

import com.loyauty.exception.ServiceLocatorException;


import com.loyauty.service.category.CategoryService;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;



import com.loyauty.web.struts.action.LoyautyAction;


public class AddMainSpecification  extends LoyautyAction {	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CategoryService categoryService;

	@Getter @Setter
	private String specificationName;
	@Getter @Setter
	private long category;
	@Getter @Setter
	private String nameEn;
	@Getter @Setter
	private String nameFr;
	
	@Getter @Setter
	private String description;
	
	@Getter @Setter
	private List<CategoryDTO>  categoryList;
	
	public AddMainSpecification () throws ServiceLocatorException  {
		super();		
		categoryService = getServiceLocator().getCategoryService();
	}	
	
	@Override  
	public String execute() throws Exception {	
		
		categoryList = categoryService.getAllCategory();
				
		return getSuccessResult();
	}
}
