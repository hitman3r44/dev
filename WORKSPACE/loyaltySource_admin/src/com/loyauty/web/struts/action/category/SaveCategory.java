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
import com.loyauty.web.struts.action.LoyautyAction;

import org.apache.commons.lang.WordUtils;

public class SaveCategory extends LoyautyAction {
	
	private static final long serialVersionUID = 2351676680348049181L;
	private static final String MODEL_LOCALIZATION = "loyauty.common.category.";
	
	private CategoryService categoryService;
	private CommonService commonService;
	
	@Getter @Setter	
	private List<Long> brand; 
	@Getter @Setter	
	private String categoryName;
	@Getter @Setter	
	private Integer categoryGroup; 
	@Getter @Setter	
	private String categoryGroupName; 
	@Getter @Setter	
	private long [] mainSpecification;
	@Getter @Setter	
	private String description;
	
	@Getter @Setter
	private List<CommonDTO> mainSpecificationList;
	@Getter @Setter
	private GroupCategoryEnum []  categoryGroupList;
	@Getter @Setter
	private List<CommonDTO>  brandsName;
	@Getter @Setter
	private List<CommonDTO> brandList;
	
	@Getter @Setter	
	private String message;
	
	public SaveCategory () throws ServiceLocatorException {
		super();	
		categoryService = getServiceLocator().getCategoryService();
		commonService = this.getServiceLocator().getCommonService();
	}
	
	@Override
	public void prepare() throws ServiceException{		
		brandList = commonService.getBrands();
		categoryGroupList = GroupCategoryEnum.values();				
	}
	
	@Override
	public void validate() {
		
		if (categoryName.trim().length() == 0)
			addActionError(getText("loyauty.error.common.category_name_required"));
		if (categoryGroup < 0)
			addActionError(getText("loyauty.error.common.category_group_select"));		
		if (description.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_required"));
		if (brand.size() == 0 || brand.get(0) < 0)
			addActionError(getText("loyauty.error.common.brands_required"));
		try {
			if(categoryService.categoryExist(categoryName)) {			
				addActionError(getText("loyauty.error.common.brand_required"));				
			}
		} catch (ServiceException e) {
			log.debug("Service Error when cheking categoryExist");
			addActionError(getText("loyauty.error.common.service"));
		}
		
	}
	
	@Override  
	public String execute() throws Exception {

		try {
			categoryName = WordUtils.capitalizeFully(categoryName).trim();
		
			// set the name to lower-case, then replace all instances of ' ', '.', '-', '\' and '/' with underscore.
			// then it replace all consecutive underscores with a single one.
			String parsedLocaleCode = categoryName.toLowerCase();
			parsedLocaleCode = parsedLocaleCode.replaceAll("[ \\-.\\\\/]", "_");
			parsedLocaleCode = parsedLocaleCode.replaceAll("\\_+", "_");
			StringBuilder sb = new StringBuilder();
			sb.append(MODEL_LOCALIZATION);
			sb.append(parsedLocaleCode);	
			CategoryDTO categoryDTO = CategoryDTO.valueOf(0, categoryGroup, categoryName, 
										sb.toString(), description, null);
			categoryDTO.setBrands(brand);
			categoryService.createCategory(categoryDTO);
			setCategoryGroupName((CommonUtils.enumFromValue(categoryGroupList, 
										categoryGroup)).getLocalizationKey());
			setBrandsName(CommonUtils.getIntersectionList(brandList, brand));
			
			message = "Category Added Successfully";
			
			return SUCCESS;
			
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch(Exception e) {
			addActionError(e.getMessage());
		}
		return INPUT;
	}
	
}
