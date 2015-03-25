package  com.loyauty.web.struts.action.category;




import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.service.category.CategoryService;

import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.util.CommonUtils;


import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class GetCategory extends LoyautyAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String MODEL_LOCALIZATION = "loyauty.error.common.category_";
	
	private CategoryService categoryService;
	private CommonService commonService;
	
	
	@Getter @Setter	
	private List<Long> brand; 
	@Getter @Setter	
	private long categoryId;
	@Getter @Setter	
	private String categoryName;
	@Getter @Setter	
	private long categoryGroup; 
	@Getter @Setter	
	private String categoryGroupName; 
	@Getter @Setter	
	private long [] mainSpecification;
	@Getter @Setter	
	private String description;
	@Getter @Setter
	private boolean update = false;
	
	@Getter @Setter
	private List<CommonDTO> mainSpecificationList;
	@Getter @Setter
	private GroupCategoryEnum []  categoryGroupList;
	@Getter @Setter
	private List<CommonDTO>  brandsName;
	@Getter @Setter
	private List<CommonDTO> brandList;
	
	public GetCategory () throws ServiceLocatorException {
		super();	
		categoryService = getServiceLocator().getCategoryService();
		commonService = getServiceLocator().getCommonService();
	}
	
	@Override
	public void prepare() throws ServiceException {	
		brandList = commonService.getBrands();
		categoryGroupList = GroupCategoryEnum.values();	
		
	}
	
	@Override  
	public String execute() throws Exception {

		try{
			
			CategoryDTO cat = categoryService.getCategory(categoryId);
			setCategoryName(cat.getName());
			setDescription(cat.getDescription());
			setCategoryGroup(cat.getCategoryGoupeId());
			setCategoryId(categoryId);
			setBrand(cat.getBrands());
			
			return SUCCESS;
		}
		catch(ServiceException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		}		
		
		return INPUT;
	}

}
