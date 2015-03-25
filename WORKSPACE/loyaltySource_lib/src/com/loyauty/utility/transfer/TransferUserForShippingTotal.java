package com.loyauty.utility.transfer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.product.ProductService;

public class TransferUserForShippingTotal {
	
	public static final long FROM_USER_ID = 15L;
	public static final long TO_USER_ID = 37L;
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			
			File file = new File("C:\\ShippingTotalTransfer_NormalizationTo_6902.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			String query = "";
			long id = 266607;
			long productID = 0L;
			long provinceID = 0L;
			long userID = 0L;
			String weightedProvinceTotalWithCoverage = "";
			String averageShippingTotal = "";
			Calendar creationDate = Calendar.getInstance();
			String creation = "";
			
			List<ShippingTotalDTO> shippingTotalDTOList = productService.getShippingTotalListByUserId(FROM_USER_ID);
			for (ShippingTotalDTO shippingTotalDTO : shippingTotalDTOList) {
				productID = shippingTotalDTO.getProductId();
				provinceID = shippingTotalDTO.getProvinceId();
				userID = TO_USER_ID;
				weightedProvinceTotalWithCoverage = shippingTotalDTO.getWeightedProvinceTotalWithCoverage();
				weightedProvinceTotalWithCoverage = 
					(weightedProvinceTotalWithCoverage == null) || (weightedProvinceTotalWithCoverage.matches("^\\s*$"))
					? "0.00" : weightedProvinceTotalWithCoverage;
				averageShippingTotal = shippingTotalDTO.getAverageShippingTotal();
				averageShippingTotal = 
					(averageShippingTotal == null) || (averageShippingTotal.matches("^\\s*$"))
					? "0.00" : averageShippingTotal;
				creation = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(creationDate.getTime());
				
/* 
if (!productService.existsShippingTotal(productID, provinceID, userID)) {
*/
				query = "INSERT INTO shipping_total (product_id, province_id, user_id, weighted_province_total_with_coverage" 
						+ ", average_shipping_total, creation_date) VALUES (" 
						+ productID + ", " + provinceID + ", " + String.valueOf(TO_USER_ID) 
						+ ", '" + weightedProvinceTotalWithCoverage.trim()
						+ "', '" + averageShippingTotal.trim()						
						+ "', '" + creation + "');";

/*	
	} else {
				query = "UPDATE shipping_total " 
						+ " SET weighted_province_total_with_coverage = '" + weightedProvinceTotalWithCoverage.trim()
						+ "', average_shipping_total = '" + averageShippingTotal.trim()
						+ "' WHERE product_id = " + productID 
						+ " AND province_id = " + provinceID
						+ " AND user_id = " + String.valueOf(TO_USER_ID)
						+ ";";
	}
*/
				out.write(query + "\n");
				id = id + 1L;
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