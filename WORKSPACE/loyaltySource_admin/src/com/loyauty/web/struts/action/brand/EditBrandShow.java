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
import com.loyauty.web.struts.action.LoyautyAction;

public class EditBrandShow extends LoyautyAction {
	
	private final BrandService brandService;
	private ImageService imageService;
	private final CommonService commonService;
	
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
	private ImageDTO imageDTO; 
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
	
	public EditBrandShow () throws ServiceLocatorException {
		super();	
		brandService = getServiceLocator().getBrandService();
		commonService = getServiceLocator().getCommonService();
	}
		
	@Override  
	public String execute() throws Exception {
		try{
			
			brandDTO = brandService.getBrand(brandId);
			name = brandDTO.getName();
			code = brandDTO.getCode();
			satisfact=brandDTO.getSatisfact();
			description = brandDTO.getDescription();
			if	(brandDTO.getImage() != null)
			{
				imageDTO = brandDTO.getImage();
				imageId = brandDTO.getImage().getId();
				productImageFileName = brandDTO.getImage().getRealName();
			}
			categoryGroupList = commonService.getAllCategoryGroup();
			categoryGroupListLong = brandDTO.getCategoryGroupListLong();
			
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
