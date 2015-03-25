package com.loyauty.utility.insert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;

public class InsertAlterProductXML {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			
			File file = new File("C:\\INSERT_alterProductXML_to6961.sql");
			BufferedWriter out  = new BufferedWriter(new FileWriter(file));
			
			// long userId = USER_ID_TO_CALCULATE_SHIPPING;
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;
			UserProductPriceDTO userProductPriceDTO = null;
			String query = "";
			long productID = 0L;
			long[] userIDList = new long[] {3L, 9L, 10L, 11L, 12L, 15L, 27L, 29L, 30L, 32L, 33L, 37L};
			
			productDTOList = new ArrayList<ProductDTO>();
			
			// INSERT
			productDTOList.add(productService.getProductInformation(6956L, null));
			productDTOList.add(productService.getProductInformation(6960L, null));
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				query = "INSERT INTO alter_product_xml(product_id, brand_id, category_id, type_id, image_id, status_id, "
						+ "name_en, name_fr, description_en, description_fr, specification_en, specification_fr, other_en, "
						+ "other_fr, warranty_en, warranty_fr, dimensions, weight, model_number, msrp, "
						+ "product_to_be_executed) VALUES(" + productID + ", TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, "
						+ "TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE);";
				out.write(query + "\n");
				for (Long userID : userIDList) {
					userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
					query = "\tINSERT INTO alter_user_product_xml(user_id, product_id, price_discount, excluded, shipping, "
							+ "user_product_to_be_executed, excluded_meaning) VALUES(" + userID + ", " + productID + ", " 
							+ "TRUE, FALSE, TRUE, TRUE, " + userProductPriceDTO.getExcluded().toString().toUpperCase() + ");";
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