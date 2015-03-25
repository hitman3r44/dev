package com.loyauty.utility.update;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.product.ProductService;

public class UpdateShippingTotal {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
				
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\UPDATE_shippingTotal_X.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;
			List<ProvinceDTO> provinceDTOList = null;
			ShippingTotalDTO shippingTotalDTO = null;
			String query = "";
			long productID = 0L;
			long provinceID = 0L;
			String weightedProvinceTotalWithCoverage = "";
			String averageShippingTotal = "";
			
			// productDTOList = productService.getValidProductsByUserIdAndExcluded(userId);
			// productDTOList = productService.getValidProductsGreaterThanId(PRODUCT_ID_FROM);			
			
			long[] userIDList = new long[] {3L, 9L, 10L, 11L, 12L, 15L, 27L, 29L, 30L, 32L, 33L};
			
			for (Long userID : userIDList) {
				
				productDTOList = new ArrayList<ProductDTO>();
				
				productDTOList.add(productService.getProductInformation(6518L, null));
				
				for (ProductDTO productDTO : productDTOList) {
					productID = productDTO.getId();
					provinceDTOList = productService.getAllProvinces();
					for (ProvinceDTO provinceDTO : provinceDTOList) {
						provinceID = provinceDTO.getId();						
						shippingTotalDTO = productService.getShippingTotal(productID, provinceID, userID);
						
						// if (shippingTotalDTO == null) {
							System.out.println("productID = " + productID 
											+ ", provinceID = " + provinceID
											+ " and userID = " + userID);
						// }
						
						weightedProvinceTotalWithCoverage = shippingTotalDTO.getWeightedProvinceTotalWithCoverage();
						weightedProvinceTotalWithCoverage = 
							(weightedProvinceTotalWithCoverage == null) || (weightedProvinceTotalWithCoverage.matches("^\\s*$"))
							? "0.00" : weightedProvinceTotalWithCoverage;
						averageShippingTotal = shippingTotalDTO.getAverageShippingTotal();
						averageShippingTotal = 
							(averageShippingTotal == null) || (averageShippingTotal.matches("^\\s*$"))
							? "0.00" : averageShippingTotal;
						
						query = "UPDATE shipping_total SET weighted_province_total_with_coverage = '" 
									+ weightedProvinceTotalWithCoverage.trim() 
									+ "', average_shipping_total = '" + averageShippingTotal.trim() 
									+ "' WHERE product_id = " + productID 
									+ " AND province_id = " + provinceID
									+ " AND user_id = " + userID + ";";
						out.write(query + "\n");
					}
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
		
		System.exit(0);
		
	}
		
	
}