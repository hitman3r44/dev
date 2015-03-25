package com.loyauty.web.struts.action.brand;



import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
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
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.util.io.FileUtils;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class SaveBrand extends LoyautyAction {
	private static final long serialVersionUID = 5202013520477593017L;
	
	private BrandService brandService;
	private ImageService imageService;
	private CommonService commonService;
	
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String description;	
	
	//uploading files
	@Getter @Setter
	private int width;
	@Getter @Setter	
	private File brandImage; 
	@Getter @Setter
	private String brandImageContentType;
	@Getter @Setter
	private String brandImageFileName;
	@Getter @Setter
	private ImageDTO imgDTO; 
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
	
	public SaveBrand () throws ServiceLocatorException {
		super();	
		brandService = getServiceLocator().getBrandService();
		imageService = getServiceLocator().getImageService();
		commonService = getServiceLocator().getCommonService();
	}
	
	
	@Override
	public void validate() {
		if(name.trim().length() == 0)
			addActionError(getText("loyauty.error.common.brand_required"));
		if(code.trim().length() == 0)
			addActionError(getText("loyauty.error.common.code_required"));
		if(description.trim().length() == 0)
			addActionError(getText("loyauty.error.common.description_required"));
		try {
			if(brandService.existBrand(name.trim()))
				addActionError(getText("loyauty.error.common.brand_name_Exist"));
			if(brandService.existCode(code.trim(), null))
				addActionError(getText("loyauty.error.common.brand_code_Exist"));
		} catch (ServiceException e) {
			addActionError(getText("loyauty.error.common.service"));
		}
	}
	
	@Override
	public void prepare() throws ServiceException{		
		categoryGroupList = commonService.getAllCategoryGroup();	
	}
	
	@Override  
	public String execute() throws Exception {
		
		try{
			
			imgDTO  =  uploadBrandImage();
			
			if( this.hasActionErrors() ) return INPUT;
			
			
			BrandDTO brandDTO = BrandDTO.valueOf(name, imgDTO, description, code, categoryGroupListLong );
			brandDTO.setSatisfact(satisfact);
			brandService.createBrand(brandDTO);
			//commonService.getCategory(brandDTO);
			
			message = "Brand Added Successfully";
			
			return SUCCESS;
		}
		catch(ServiceLocatorException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
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
	
	
	/**
	 * @action load image file
	 * @return
	 * @throws ServiceException
	 * @throws IOException 
	 * @throws ServiceLocatorException 
	 */
	
	private ImageDTO uploadBrandImage() throws ServiceException, IOException, ServiceLocatorException {
		
		ImageDTO imageDTO = null;
		UserSessionDTO userSession = (UserSessionDTO) request.getSession().getAttribute(WebConstants.USER);	
		if(brandImage == null ){
			addActionError(getText("loyauty.error.common.image_required"));	
		}
		else {
					
			boolean contentFireFox = !brandImageContentType.equals("image/png")  && 
									 !brandImageContentType.equals("image/jpeg") && 
									 !brandImageContentType.equals("image/jpg");

			boolean contentIE = !brandImageContentType.equals("image/x-png")  && 
							    !brandImageContentType.equals("image/pjpeg") && 
							    !brandImageContentType.equals("image/pjpg");
			
			getServiceLocator().getImageService();
			String filePath = request.getSession().getServletContext().getRealPath("/");
			
			if( contentFireFox && contentIE ){
				addActionError(getText("loyauty.error.common.content.type"));
			} else if(!imageService.isJPEGImage(brandImage) ) {		
				addActionError(getText("loyauty.error.common.content.type_jpg"));	
			} else if(brandImage.length() > WebConstants.BRAND_SIZE_ALLOWED){
				addActionError(getText("loyauty.error.common.fileTooLarge"));					
			}
			
			Dimension dim = FileUtils.getJPEGDimension(brandImage);					
			if( dim.width != WebConstants.WIDTH_BRAND_MAX  && dim.height !=WebConstants.WIDTH_BRAND_MAX ){
				addActionError(getText("loyauty.error.common.logo_size") + " " +WebConstants.WIDTH_BRAND_MAX + " px" );	
			}
			/*if( dim.width > WebConstants.WIDTH_BRAND_MAX ){
				addActionError(getText("loyauty.error.common.logo_size") + " " +WebConstants.WIDTH_BRAND_MAX + " px" );	
			}
			*/
			
			double ratio = (double) Math.round((dim.getHeight()/dim.getWidth())*100)/(double) 100;
	    	
			//int thumbHeight = (int) (WebConstants.BRAND_DEFAUTL_THUMBNAIL_WIDTH * ratio);		
			int thumbHeight = WebConstants.BRAND_DEFAUTL_THUMBNAIL_HEIGHT;			
			
			boolean isLarge = dim.getWidth() >= WebConstants.BRAND_DEFAUTL_THUMBNAIL_WIDTH * WebConstants.COVER_LARGE_TRANSFERT_COEFICIENT;
			
			imageDTO = brandService.addBrandImage(brandImage, brandImageFileName, filePath, 
								userSession.getId(), WebConstants.BRAND_DEFAUTL_THUMBNAIL_WIDTH,  
								thumbHeight, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge );
		}
		return imageDTO;
	}
	

}
