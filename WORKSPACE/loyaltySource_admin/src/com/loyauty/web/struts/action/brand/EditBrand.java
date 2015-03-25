package com.loyauty.web.struts.action.brand;



import java.io.File;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.util.CommonUtils;
import com.loyauty.web.struts.action.LoyautyAction;

public class EditBrand extends LoyautyAction {
	
	private final BrandService brandService;
	private final CommonService commonService;
	private ImageService imageService;
	
	@Getter @Setter
	private Long brandId;
	@Getter @Setter
	private Long imageId;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String description;
	//uploading files
	@Getter @Setter	
	private File productImage; 
	@Getter @Setter
	private String productImageContentType;
	@Getter @Setter
	private String productImageFileName;
	@Getter @Setter
	private ImageDTO imgDTO; 
	@Getter @Setter
	private List<CommonDTO> categoryList;
	@Getter 
	private final boolean update = false;
	@Getter @Setter
	private BrandDTO brandDTO;
	@Getter @Setter
	private String code;
	@Getter @Setter
	private Double satisfact;
	@Getter @Setter
	private List<Long> categoryGroupListLong;
	@Getter @Setter
	private List<CommonDTO> categoryGroupList;
	
	@Getter @Setter
	private String message;
	
	public EditBrand () throws ServiceLocatorException {
		super();
		brandService = getServiceLocator().getBrandService();
		commonService = getServiceLocator().getCommonService();
		imageService = getServiceLocator().getImageService();
	}
	
	@Override
	public void prepare() throws Exception {
		categoryGroupList = commonService.getAllCategoryGroup();
	}
	
	@Override
	public void validate() {
		if(name.trim().length() == 0)
			addActionError(getText("loyauty.error.common.brand_required"));
		if(description.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_required"));
		try {
			if(brandService.existCode(code.trim(), brandId))
				addActionError(getText("loyauty.error.common.brand_code_Exist"));
		} catch (ServiceException e) {
			addActionError(getText("loyauty.error.common.service"));
		}
	}
	
	public String execute() throws Exception {
		try{		
			brandDTO = brandService.getBrand(brandId);
			
			brandDTO.setName(name);
			brandDTO.setCode(code);
			brandDTO.setDescription(description);
			//That means that insert a new image and I have to link to the brand
			if(imageId != 0) {
				if(brandDTO.getImage() != null)
					brandDTO.getImage().setId(imageId);
				else
					brandDTO.setImage(imageService.getImage(imageId));
				
				imgDTO = imageService.getImage(imageId);
			}	
			brandDTO.setCategoryGroupListLong(categoryGroupListLong);
			brandDTO.setSatisfact(satisfact);
			brandService.updateBrand(brandDTO);
			
			message = "Brand Updated Successfully";
			
			return SUCCESS;
		}
		catch(ServiceException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		}
		catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}
}
