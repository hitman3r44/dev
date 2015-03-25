package com.loyauty.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;

public class FriendsQuery {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;	
	
	public static void main(String... args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\friends_INSERT.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			
			String queryUPP = "";
			String queryTotal = "";			
			long userID = 41L;
			long provinceID = 0L;
			String price = "";
			String profit = "";
			String discount = "";
			String shippingCoverage = "";
			String shippingTotalCanada = "";
			String weightedProvinceTotalWithCoverage = "";
			String averageShippingTotal = "";
			
			List<Long> productIDsList = null;
			UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
			ShippingTotalDTO shippingTotalDTO = new ShippingTotalDTO();
			
			productIDsList = productService.getAllValidProductIds();
			
			for (long productID :  productIDsList) {
				
				userProductPriceDTO = new UserProductPriceDTO();
				userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
				
				price = userProductPriceDTO.getPrice();
				price = (price != null) ? price.trim() : "";
				
				profit = userProductPriceDTO.getProfit();
				profit = (profit != null) ? profit : "";
				
				discount = userProductPriceDTO.getDiscount();
				discount = (discount != null) ? discount.trim() : "";
				
				shippingCoverage = userProductPriceDTO.getShippingCoverage();
				shippingCoverage = (shippingCoverage != null) ? shippingCoverage.trim() : "";
				
				shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
				shippingTotalCanada = (shippingTotalCanada != null) ? shippingTotalCanada.trim() : "" ;
				
				queryUPP = "INSERT INTO user_product_price (user_id, product_id, price, price_type, status_id, " 
								+ "percent_profit, percent_discount, is_excluded, shipping_coverage, " 
								+ "shipping_total_canada)"  
					+  " VALUES (" + userID + ", " 
								+ productID 
								+ ", '" + price 
								+ "', 4, 2, " 
								+ "'" + profit 
								+ "', '" + discount
								+ "', false, " 
								+ "'" + shippingCoverage
								+ "', '" + shippingTotalCanada
								+ "');";
				out.write(queryUPP + "\n");
				
				for (int pvcID =1; pvcID <= 13; pvcID++) {
					provinceID = pvcID;					
					shippingTotalDTO = productService.getShippingTotal(productID, provinceID, userID);
					
					weightedProvinceTotalWithCoverage = shippingTotalDTO.getWeightedProvinceTotalWithCoverage();
					weightedProvinceTotalWithCoverage = 
						(weightedProvinceTotalWithCoverage == null) || (weightedProvinceTotalWithCoverage.matches("^\\s*$"))
						? "0.00" : weightedProvinceTotalWithCoverage;
					averageShippingTotal = shippingTotalDTO.getAverageShippingTotal();
					averageShippingTotal = 
						(averageShippingTotal == null) || (averageShippingTotal.matches("^\\s*$"))
						? "0.00" : averageShippingTotal;
					
					queryTotal = "\tINSERT INTO shipping_total (product_id, province_id, user_id, weighted_province_total_with_coverage, " 
						+ "average_shipping_total)" 
						+  " VALUES (" + productID + ", " + provinceID + ", " + userID 
						+ ", '" + weightedProvinceTotalWithCoverage.trim() 
						+  "', '" + averageShippingTotal.trim() 
						+ "');";
					out.write(queryTotal + "\n");
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
