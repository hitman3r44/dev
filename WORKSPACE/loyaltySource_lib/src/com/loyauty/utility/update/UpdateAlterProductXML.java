package com.loyauty.utility.update;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class UpdateAlterProductXML {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			File file = new File("C:\\UPDATE_alterProductXML_to7173.sql");
			BufferedWriter out  = new BufferedWriter(new FileWriter(file));
			
			// long userId = USER_ID_TO_CALCULATE_SHIPPING;
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;
			UserProductPriceDTO userProductPriceDTO = null;
			String query = "";
			long productID = 0L;
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			ArrayList<Long> userIDList = new ArrayList<Long>();		
			for (UserSessionDTO uDTO : userNameList) {
				userIDList.add(uDTO.getId());
			}
			
			productDTOList = new ArrayList<ProductDTO>();
			
			productDTOList = productService.getProductBetween(7171L, 7173L);
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				query = "UPDATE alter_product_xml SET brand_id = TRUE, category_id = TRUE, type_id = TRUE, " 
						+ "status_id = TRUE, image_id = TRUE, name_en = TRUE, name_fr = TRUE, "
						+ "description_en = TRUE, description_fr = TRUE, specification_en = TRUE, specification_fr = TRUE, "
						+ "other_en = TRUE, other_fr = TRUE, warranty_en = TRUE, warranty_fr = TRUE, "
						+ "dimensions = TRUE, weight = TRUE, model_number = TRUE, msrp = TRUE, product_to_be_executed = TRUE, "
						+ "alter_date = now(), shipping = TRUE WHERE product_id = " + productID + ";";				
				out.write(query + "\n");
				for (Long userID : userIDList) {
					userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
					query = "\tUPDATE alter_user_product_xml SET price_discount = TRUE, excluded = FALSE, shipping = TRUE, "
							+ "user_product_to_be_executed = TRUE, excluded_meaning = " 
							+ userProductPriceDTO.getExcluded().toString().toUpperCase() + ", alter_date = now() "
							+ "WHERE user_id = " + userID + " and product_id = " + productID + ";";					
					out.write(query + "\n");
				}
			}
			
			out.write("RELEASE SAVEPOINT sql_updates;\n");
			out.write("COMMIT;\n");
			
			out.flush();
			out.close();			
			
		} catch (IOException iox) {
			iox.printStackTrace();			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}