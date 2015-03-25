package com.loyauty.web.struts.action.amend;

import lombok.Getter;
import lombok.Setter;


import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.web.struts.action.LoyautyAction;

public class AmendingProduct extends LoyautyAction {

	private static final long serialVersionUID = 4688139859406086753L;
	
	private ProductService productService;
	
	@Getter @Setter
	private ProductDTO productDTO;
	
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
	private boolean update = false;
	
	@Getter @Setter
	private long brand;
	@Getter @Setter
	private long category;
		
	public AmendingProduct () throws ServiceLocatorException {
		super();
		productService = getServiceLocator().getProductService();
	}
	
	@Override
	public void prepare() {
		try {
			productDTO = productService.getProductInformation(productId, null);
		} catch(Exception e) {
			log.debug("Error when getting product in prepare methode");
		}		
	}
	
	@Override
	public void validate() {			
			if(nameEn.trim().length() == 0)
				addActionError(getText("loyauty.error.common.name_en_required"));
			if(nameFr.trim().length() == 0)
				addActionError(getText("loyauty.error.common.name_fr_required"));
	}
	
	@Override  
	public String execute() throws Exception {
		try {
			loyaltyProductId = productDTO.getLoyaltyProductId().trim();
			brand = productDTO.getBrand().getId();
			category = productDTO.getCategory().getId();
			productDTO.getNameEng().setName(nameEn);
			productDTO.getNameFr().setName(nameFr);
			productDTO.getDescriptionEng().setName(descriptionEn);
			productDTO.getDescriptionFr().setName(descriptionFr);
			productDTO.getSpecificationEng().setName(specificationEn);
			productDTO.getSpecificationFr().setName(specificationFr);			
			if (productDTO.getOtherEng() != null)
				productDTO.getOtherEng().setName(otherEng);
			productDTO.getOtherFr().setName(otherFr);
			productDTO.setNote(note);
			
			productService.updateAmendingProduct(productDTO);
			
			request.getSession(true).setAttribute("productID", productId);
			
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
