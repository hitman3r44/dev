package  com.loyauty.web.struts.action.specification;


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

public class EditMainSpecification extends LoyautyAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CategoryService categoryService;
	private SpecificationService specificationService;
	
	@Getter @Setter
	private boolean disable;
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
	private SpecificationDTO dto;
	
	@Getter @Setter
	private String message;	
	
	public EditMainSpecification () throws ServiceLocatorException {
		super();	
		categoryService = getServiceLocator().getCategoryService();
		specificationService = getServiceLocator().getSpecificationService();
	}
	
	@Override
	public void prepare() throws ServiceException {		
		categoryList = categoryService.getAllCategory();			
	}
	
	
	@Override
	public void validate() {
			
		if(specificationName.trim().length() == 0)
			addActionError(getText("loyauty.error.common.type_spec_required"));
		if(category < 0)
			addActionError(getText("loyauty.error.common.category_required"));			
		if(nameEn.trim().length() == 0)
			addActionError(getText("loyauty.error.common.name_en_required"));
		if(nameFr.trim().length() == 0)
			addActionError(getText("loyauty.error.common.name_fr_required"));
		if(description.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_required"));	
		
	}
	
	@Override
	public String execute() throws Exception {
		
		try{
			SpecificationDTO dto = specificationService.getSpecification(specificationId);
			
			dto.setCategory(CommonDTO.valueOf(category, null));
			dto.setDescription(description);
			dto.setName(specificationName);
			dto.setTranslationId(dto.getTranslationId());
			dto.setNameEng(CommonDTO.valueOf(dto.getNameEng().getId(), nameEn));
			dto.setNameFr(CommonDTO.valueOf(dto.getNameFr().getId(), nameFr));
			
			if(disable)
				dto.setStatus(Status.DISABLED);
			else 
				dto.setStatus(Status.ENABLED);
			
			dto.setMain(true);

			specificationService.editSpecification(dto);
			
			message = "Main Specification Updated Successfully";
			
			return SUCCESS;
		
		}
		catch(ServiceException e){
			log.debug("Service Error when editing specification");
			addActionError(getText("loyauty.error.common.service"));
		}		
		
		return INPUT;
		
	}

}
