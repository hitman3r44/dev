package com.loyauty.web.struts.action.amend;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.web.struts.action.LoyautyAction;

public class AmendProduct extends LoyautyAction {
	
	private static final long serialVersionUID = -6837639084669882751L;

	private ProductService productService;
	
	@Getter @Setter
	private long productId;
	@Getter @Setter
	private String loyaltyProductId;
	@Getter @Setter
	private String nameEn;
	@Getter @Setter
	private String nameFr;
	@Getter @Setter
	private String descriptionEn;
	@Getter @Setter
	private String descriptionFr;
	@Getter @Setter
	private String specificationEn;
	@Getter @Setter
	private String specificationFr;
	@Getter @Setter
	private String otherEng;
	@Getter @Setter
	private String otherFr;
	@Getter @Setter
	private String note;

	@Getter @Setter
	private long brand;
	@Getter @Setter
	private long category;	
	
	@Getter @Setter
	private ProductDTO productDTO;	
		
	public AmendProduct () throws ServiceLocatorException {
		super();
		productService = getServiceLocator().getProductService();		
	}
	
	@Override  
	public String execute() throws Exception {
		try {
			productDTO = productService.getProductInformation(productId, null);
			loyaltyProductId = productDTO.getLoyaltyProductId().trim();
			nameEn = productDTO.getNameEng().getName();
			nameFr = productDTO.getNameFr().getName();
			descriptionEn = productDTO.getDescriptionEng().getName();
			descriptionFr = productDTO.getDescriptionFr().getName();
			specificationEn = productDTO.getSpecificationEng().getName();
			specificationFr = productDTO.getSpecificationFr().getName();
			otherEng = productDTO.getOtherEng().getName();
			otherFr = productDTO.getOtherFr().getName();
			note = productDTO.getNote();
			
			brand = productDTO.getBrand().getId();
			category = productDTO.getCategory().getId();
			
			return SUCCESS;
		} catch(ServiceException e){
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}
		return INPUT;
	}
}
