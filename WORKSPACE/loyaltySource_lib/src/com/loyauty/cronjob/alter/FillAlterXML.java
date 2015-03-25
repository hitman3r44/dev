package com.loyauty.cronjob.alter;

import java.util.ArrayList;
import java.util.List;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class FillAlterXML {

	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String... args) throws ServiceLocatorException, ServiceException {
		FillAlterXML fillAlterXML = new FillAlterXML();
		serviceLocator = ServiceLocator.getInstance();
		productService = serviceLocator.getProductService();
		List<ProductDTO> productDTOList = productService.getProductsAsOfConsideredForXML();		
		fillAlterXML.fillAlterXML(productDTOList);
	}
	
	public void fillAlterXML(List<ProductDTO> productDTOList) {		
		
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			ArrayList<Long> userIDList = new ArrayList<Long>();		
			for (UserSessionDTO uDTO : userNameList) {
				userIDList.add(uDTO.getId());
			}			
			
			AlterProductXMLDTO alterProductXMLDTO = null;			
			AlterUserProductXMLDTO alterUserProductXMLDTO = null;
			long productID = 0L;
			
			UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				alterProductXMLDTO = new AlterProductXMLDTO();
				alterProductXMLDTO.setProductId(productID);
				alterProductXMLDTO.setBrandId(true);
				alterProductXMLDTO.setCategoryId(true);
				alterProductXMLDTO.setTypeId(true);
				if (productDTO.getImage() != null) {
					alterProductXMLDTO.setImageId(true);
				} else {
					alterProductXMLDTO.setImageId(false);
				}
				alterProductXMLDTO.setStatusId(true);
				alterProductXMLDTO.setNameEn(true);
				alterProductXMLDTO.setNameFr(true);
				alterProductXMLDTO.setDescriptionEn(true);
				alterProductXMLDTO.setDescriptionFr(true);
				alterProductXMLDTO.setSpecificationEn(true);
				alterProductXMLDTO.setSpecificationFr(true);
				alterProductXMLDTO.setOtherEn(true);
				alterProductXMLDTO.setOtherFr(true);
				alterProductXMLDTO.setWarrantyEn(true);
				alterProductXMLDTO.setWarrantyFr(true);
				alterProductXMLDTO.setDimensions(true);
				alterProductXMLDTO.setWeight(true);
				alterProductXMLDTO.setModelNumber(true);
				alterProductXMLDTO.setMsrp(true);
				alterProductXMLDTO.setProductToBeExecuted(true);
			
				System.out.println("\n[AlterProductXML-DTO] productID = " + productID 
								+ ", alterProductXMLDTO: |" + alterProductXMLDTO
								+ "|.\n");
			
				if (productService.existsOnAlterProductXML(productID)) {
					productService.updateAlterProductXML(alterProductXMLDTO);
				} else {
					productService.createAlterProductXML(alterProductXMLDTO);
				}			

				for (long userID : userIDList) {
					alterUserProductXMLDTO = new AlterUserProductXMLDTO();
					alterUserProductXMLDTO.setUserId(userID);
					alterUserProductXMLDTO.setProductId(productID);
					alterUserProductXMLDTO.setPriceDiscount(true);
					alterUserProductXMLDTO.setShipping(true);
					
					alterUserProductXMLDTO.setExcluded(false);
					alterUserProductXMLDTO.setUserProductToBeExecuted(true);
					userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
					alterUserProductXMLDTO.setExcludedMeaning(userProductPriceDTO.getExcluded());
					
					System.out.println("[AlterUserProductXML-DTO] productID = " + productID 
										+ " and userID = " + userID);
				
					if (productService.existsOnAlterUserProductXML(productID, userID)) {
						productService.updateAlterUserProductXML(alterUserProductXMLDTO);
					} else {
						productService.createAlterUserProductXML(alterUserProductXMLDTO);
					}
				}
			}
			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		
	}

}
