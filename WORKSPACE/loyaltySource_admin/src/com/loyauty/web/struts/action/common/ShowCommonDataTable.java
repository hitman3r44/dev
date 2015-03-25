package com.loyauty.web.struts.action.common;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class ShowCommonDataTable extends LoyautyAction {
	
	@Getter @Setter
	private String sectionTitle;
	@Getter @Setter
	private int pageType;
	@Getter @Setter
	private List<String> thLabels;
	
	public ShowCommonDataTable() throws ServiceLocatorException {
		super();		
	}
	
	@Override  
	public String execute() throws Exception {
				
		setSectionTitle(sectionTitle);
		setPageType(pageType);
		thLabels = new ArrayList<String>();		
		switch(pageType) {		
			case WebConstants.USER_LIST :
					 setSectionTitle(getText("loyauty.common.text.short.acount_list"));
					 thLabels.add(getText("loyauty.common.text.short.user_account"));
					 thLabels.add(getText("loyauty.common.text.short.email"));
					 thLabels.add(getText("loyauty.common.text.short.user_code"));
					 thLabels.add(getText("loyauty.common.text.short.active"));	
					 thLabels.add(getText("loyauty.common.text.short.client_category"));
					 thLabels.add(getText("loyauty.common.text.short.action"));
					 break;
			case WebConstants.BRAND_LIST : 
					 setSectionTitle(getText("loyauty.common.text.short.brand_list"));
					 thLabels.add(getText("loyauty.common.text.short.id"));
					 thLabels.add(getText("loyauty.common.text.short.name"));
					 thLabels.add(getText("loyauty.common.text.short.creation_date"));
					 thLabels.add(getText("loyauty.common.text.short.Satisfaction"));
					 thLabels.add(getText("loyauty.common.text.short.action"));
					 break;
			case WebConstants.CATEGORY_LIST : 
					 setSectionTitle(getText("loyauty.common.text.short.category_list")); 
					 thLabels.add(getText("loyauty.common.text.short.id"));
					 thLabels.add(getText("loyauty.common.text.short.category_code"));
					 thLabels.add(getText("loyauty.common.text.short.name"));
					 thLabels.add(getText("loyauty.common.text.short.category_group"));
					 thLabels.add(getText("loyauty.common.text.short.action"));
					 break;
			case WebConstants.PRODUCT_LIST : 
					 setSectionTitle(getText("loyauty.common.text.short.product_list"));
					 thLabels.add(getText("loyauty.common.text.short.product"));
					 thLabels.add(getText("loyauty.common.text.short.brand"));
					 thLabels.add(getText("loyauty.common.text.short.category"));
					 thLabels.add(getText("loyauty.common.text.short.action"));
					 break;
			case WebConstants.MAIN_SPECIFICATION_LIST : 
					setSectionTitle(getText("loyauty.common.text.short.main_specification_list"));
					thLabels.add(getText("loyauty.common.text.short.id"));
			 		thLabels.add(getText("loyauty.common.text.short.category"));
			 		thLabels.add(getText("loyauty.common.text.short.specification"));
			 		thLabels.add(getText("loyauty.common.text.short.status"));
			 		thLabels.add(getText("loyauty.common.text.short.action"));
			 		break;
			case WebConstants.BRAND_LIST_VIEW : 
				 	setSectionTitle(getText("loyauty.common.text.short.brand_list"));
				 	thLabels.add(getText("loyauty.common.text.short.id"));
				 	thLabels.add(getText("loyauty.common.text.short.name"));
				 	thLabels.add(getText("loyauty.common.text.short.creation_date"));
				 	thLabels.add(getText("loyauty.common.text.short.action"));
				 	break;
			case WebConstants.CATEGORY_LIST_VIEW : 
				 setSectionTitle(getText("loyauty.common.text.short.brand_list"));
				 setSectionTitle(getText("loyauty.common.text.short.category_list")); 
				 thLabels.add(getText("loyauty.common.text.short.id"));
				 thLabels.add(getText("loyauty.common.text.short.category_code"));
				 thLabels.add(getText("loyauty.common.text.short.name"));
				 thLabels.add(getText("loyauty.common.text.short.category_group"));
				 thLabels.add(getText("loyauty.common.text.short.action"));
				 break;
			case WebConstants.SPECIFICATION_LIST_VIEW :
				setSectionTitle(getText("loyauty.common.text.short.main_specification_list"));
				thLabels.add(getText("loyauty.common.text.short.id"));
		 		thLabels.add(getText("loyauty.common.text.short.category"));
		 		thLabels.add(getText("loyauty.common.text.short.specification"));
		 		thLabels.add(getText("loyauty.common.text.short.status"));
		 		thLabels.add(getText("loyauty.common.text.short.action"));
		 		break;
			case WebConstants.USER_LIST_VIEW :
				 setSectionTitle(getText("loyauty.common.text.short.acount_list"));
				 thLabels.add(getText("loyauty.common.text.short.user_account"));
				 thLabels.add(getText("loyauty.common.text.short.email"));
				 thLabels.add(getText("loyauty.common.text.short.user_code"));
				 thLabels.add(getText("loyauty.common.text.short.active"));					 
				 thLabels.add(getText("loyauty.common.text.short.action"));
				 break;
			default : break;
		}
			
		return getSuccessResult();
	}

}
