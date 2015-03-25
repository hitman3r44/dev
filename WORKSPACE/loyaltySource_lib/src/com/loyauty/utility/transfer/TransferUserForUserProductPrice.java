package com.loyauty.utility.transfer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;

public class TransferUserForUserProductPrice {
	
	public static final long FROM_USER_ID = 15L;
	public static final long TO_USER_ID = 37L;
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			
			File file = new File("C:\\UserProductPriceTransfer_To_Sail.sql");
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
			String priceType = "";
			List<UserProductPriceDTO> userProductPriceDTOList = null;
			
			userProductPriceDTOList = productService.getUserProductPriceByUserId(FROM_USER_ID);
			for (UserProductPriceDTO userProductPriceDTO : userProductPriceDTOList) {
				userID = TO_USER_ID;
				productID = userProductPriceDTO.getProductId();
				price = userProductPriceDTO.getPrice();
				profit = userProductPriceDTO.getProfit();
				discount = userProductPriceDTO.getDiscount();
				shippingCoverage = userProductPriceDTO.getShippingCoverage();
				shippingCoverage = (shippingCoverage != null) ? shippingCoverage.trim() : "";
				shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
				shippingTotalCanada = (shippingTotalCanada != null) ? shippingTotalCanada.trim() : "" ;
				priceType = (userProductPriceDTO.getPriceType() != null) 
									?   String.valueOf(userProductPriceDTO.getPriceType().getValue().intValue())
									: "4";				
				query = "UPDATE user_product_price SET shipping_coverage = '" + shippingCoverage
						+ "', shipping_total_canada = '" + shippingTotalCanada + "'"		
						+ ", price = '" + price + "'"
						+ ", price_type = " + priceType
						+ ", percent_profit = '" + profit + "'"
						+ ", percent_discount = '" + discount + "'"
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