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

public class UpdateUserProductPrice {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
				
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\UPDATE_userProductPrice_6907.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			String query = "";
			long userID = 0L;
			long productID = 0L;
			String price = "";
			String profit = "";
			String discount = "";
			String shippingCoverage = "";
			String shippingTotalCanada = "";
			UserProductPriceDTO userProductPriceDTO0 = null;
			List<ProductDTO> productDTOList = null;
			List<UserProductPriceDTO> userProductPriceDTOList = null;
			
			long[] userIDList = new long[] {3L, 9L, 10L, 11L, 12L, 15L, 27L, 29L, 30L, 32L, 33L, 37L};
			
			productDTOList = new ArrayList<ProductDTO>();
			
			// INSERT
			productDTOList.add(productService.getProductInformation(6907L, null));
			productDTOList.add(productService.getProductInformation(6003L, null));
			
			userProductPriceDTOList = new ArrayList<UserProductPriceDTO>();
			for (ProductDTO productDTO : productDTOList) {
				userProductPriceDTO0 = new UserProductPriceDTO();
				productID = productDTO.getId();
				for (Long userId : userIDList) {
					userProductPriceDTO0 = productService.getUserProductPriceInformation(productID, userId);
					userProductPriceDTOList.add(userProductPriceDTO0);
				}
			}
			
			for (UserProductPriceDTO userProductPriceDTO : userProductPriceDTOList) {
				userID = userProductPriceDTO.getUserId();
				productID = userProductPriceDTO.getProductId();
				price = userProductPriceDTO.getPrice();
				profit = userProductPriceDTO.getProfit();
				discount = userProductPriceDTO.getDiscount();
				shippingCoverage = userProductPriceDTO.getShippingCoverage();
				shippingCoverage = (shippingCoverage != null) ? shippingCoverage.trim() : "";
				shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
				shippingTotalCanada = (shippingTotalCanada != null) ? shippingTotalCanada.trim() : "" ;
				query = "UPDATE user_product_price SET shipping_coverage = '" + shippingCoverage 
						+ "', shipping_total_canada = '" + shippingTotalCanada + "'"
/*						
						+ ", price = '" + price + "'"
						+ ", price_type = 4"
						+ ", percent_profit = '" + profit + "'"
						+ ", percent_discount = '" + discount + "'"
*/
						+ " WHERE user_id = " + userID 
						+ " AND product_id = " + productID;
				out.write(query + ";\n");
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
