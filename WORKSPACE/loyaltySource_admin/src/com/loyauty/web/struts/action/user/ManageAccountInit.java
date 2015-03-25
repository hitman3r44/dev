package com.loyauty.web.struts.action.user;



import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.web.struts.action.LoyautyAction;

public class ManageAccountInit extends LoyautyAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5824555595764380438L;

	private CommonService commonService;
	
	@Getter @Setter
	private long userId; 
	@Getter @Setter
	private String userName; 
	@Getter @Setter
	private List<UserProductDTO> UserProductList = null;	
	@Getter @Setter
	private List<CommonDTO> categoryList;
	@Getter @Setter
	private List<CommonDTO> brandList;
	//User Product Status
	@Getter @Setter
	private List<CommonDTO> upstatusList;
	@Getter @Setter
	private Long categoryDiscountSignal;
	
	public ManageAccountInit() throws ServiceLocatorException {
		super();		
		commonService = this.getServiceLocator().getCommonService();
	}
	
	@Override  
	public String execute() throws Exception {
		
		log.debug("iniliaze account manager ...");
		brandList = commonService.getBrands();
		upstatusList = commonService.getUserProductStatusGroup();
		setUserId(userId);
		setUserName(userName);
		categoryList = new ArrayList<CommonDTO>();
		return getSuccessResult();
	
	}
	

}
