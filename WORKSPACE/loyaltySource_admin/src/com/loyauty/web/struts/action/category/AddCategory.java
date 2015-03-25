package com.loyauty.web.struts.action.category;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;

import com.loyauty.exception.ServiceLocatorException;


import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.CommonDTO;



import com.loyauty.web.struts.action.LoyautyAction;


public class AddCategory  extends LoyautyAction {
	
	
	private CommonService commonService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter
	private List<CommonDTO> brandList;
	@Getter @Setter
	private List<CommonDTO> mainSpecificationList;
	@Getter @Setter
	private GroupCategoryEnum []  categoryGroupList;
	
	public AddCategory () throws ServiceLocatorException  {
		super();
		commonService = this.getServiceLocator().getCommonService();
	}
	
	@Override  
	public String execute() throws Exception {
		
		brandList = commonService.getBrands();
		categoryGroupList = GroupCategoryEnum.values();
		
		return getSuccessResult();
	}
}
