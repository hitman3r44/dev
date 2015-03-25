package com.loyauty.web.struts.action.brand;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.web.struts.action.LoyautyAction;

public class AddBrand  extends LoyautyAction {
	private CommonService commonService;
	
	@Getter @Setter
	private List<CommonDTO>  categoryGroupList;
	public AddBrand () throws ServiceLocatorException  {
		super();	
		commonService = this.getServiceLocator().getCommonService();
	}	
	
	@Override  
	public String execute() throws Exception {							
		
		categoryGroupList = commonService.getAllCategoryGroup();
		return SUCCESS;
	}
	
}
