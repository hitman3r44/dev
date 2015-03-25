package  com.loyauty.web.struts.action.view;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.enums.Status;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.service.category.CategoryService;

import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.util.CommonUtils;


import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class ViewType extends LoyautyAction {

	private static final long serialVersionUID = 1L;

	private CategoryService categoryService;
	private SpecificationService specificationService;

	@Getter @Setter
	private long specificationId;
	@Getter @Setter
	private String specificationName;
	@Getter @Setter
	private long category;
	@Getter @Setter
	private String categoryName;
	@Getter @Setter
	private String nameEn;
	@Getter @Setter
	private String nameFr;

	@Getter @Setter
	private String description;

	@Getter @Setter
	private List<CategoryDTO>  categoryList;

	@Getter @Setter
	private boolean disable;

	public ViewType() throws ServiceLocatorException {
		super();
		categoryService = getServiceLocator().getCategoryService();
		specificationService = getServiceLocator().getSpecificationService();
	}

	@Override
	public void prepare() throws ServiceException {
		categoryList = categoryService.getAllCategory();
	}

	@Override
	public String execute() throws Exception {

		try {
			SpecificationDTO dto = specificationService.getSpecification(specificationId);
			setSpecificationId(dto.getId());
			setSpecificationName(dto.getName());
			setCategory(dto.getCategory().getId());
			setCategoryName(dto.getCategory().getName());
			setNameEn(dto.getNameEng().getName());
			setNameFr(dto.getNameFr().getName());
			setDescription(dto.getDescription());
			setDisable(dto.getStatus()==Status.ENABLED?false:true);

			return SUCCESS;

		} catch(ServiceException e) {
			log.debug("Service Error when loading specification");
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}

}
