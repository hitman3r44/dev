package  com.loyauty.web.struts.action.view;

import java.util.List;
import org.apache.commons.lang.WordUtils;

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

public class ViewCategory extends LoyautyAction {

	private static final long serialVersionUID = 1L;

	private static final String MODEL_LOCALIZATION = "loyauty.common.category.";
	
	private CategoryService categoryService;
	private CommonService commonService;

	@Getter @Setter
	private List<Long> brand;
	@Getter @Setter
	private long categoryId;
	@Getter @Setter
	private String categoryName;
	@Getter @Setter
	private Long categoryGroup; 
	@Getter @Setter
	private String categoryGroupName;
	@Getter @Setter
	private long[] mainSpecification;
	@Getter @Setter
	private String description;
	@Getter @Setter
	private boolean update = false;

	@Getter @Setter
	private List<CommonDTO> mainSpecificationList;
	@Getter @Setter
	private GroupCategoryEnum[]  categoryGroupList;
	@Getter @Setter
	private List<CommonDTO>  brandsName;
	@Getter @Setter
	private List<CommonDTO> brandList;

	public ViewCategory() throws ServiceLocatorException {
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
	public void validate() {
		if(categoryName.trim().length() == 0)
			addActionError(getText("loyauty.error.common.category_name_required"));
		if(categoryGroup < 0)
			addActionError(getText("loyauty.error.common.category_group_select"));		
		if(description.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_required"));
		if(brand.size() == 0 || brand.get(0) < 0)
			addActionError(getText("loyauty.error.common.brand_required"));		
	}
	
	@Override
	public String execute() throws Exception {
		try {
		
			CategoryDTO cat = categoryService.getCategory(categoryId);
			if (cat.getName() != null) {
				categoryName = WordUtils.capitalizeFully(cat.getName()).trim();
			}
			int catGroupId = (int) categoryService.getCategoryGroupId(categoryId);
			setCategoryGroupName((CommonUtils.enumFromValue(categoryGroupList, catGroupId)).getLocalizationKey());
			setDescription(cat.getDescription());
			setBrand(cat.getBrands());
			setBrandsName(CommonUtils.getIntersectionList(brandList, brand));
			
			return SUCCESS;
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}

}
