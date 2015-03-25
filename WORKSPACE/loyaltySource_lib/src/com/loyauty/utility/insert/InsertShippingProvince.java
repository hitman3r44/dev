package com.loyauty.utility.insert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.product.ProductService;

public class InsertShippingProvince {
		
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
				
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\INSERT_shippingProvince_to6907.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;
			List<ProvinceDTO> provinceDTOList = null;
			ShippingProvinceDTO shippingProvinceDTO = null;
			String query = "";
			long productID = 0L;
			long provinceID = 0L;
			String weightedTotalProvince = "";
			Calendar creationDate = Calendar.getInstance();
			String creation = "";
			
			productDTOList = new ArrayList<ProductDTO>();
			
			// INSERT
			productDTOList.add(productService.getProductInformation(6907L, null));
			productDTOList.add(productService.getProductInformation(6003L, null));
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				provinceDTOList = productService.getAllProvinces();
				for (ProvinceDTO provinceDTO : provinceDTOList) {
					provinceID = provinceDTO.getId();
					shippingProvinceDTO = productService.getShippingProvince(productID, provinceID);
					weightedTotalProvince = shippingProvinceDTO.getWeightedTotalProvince();
					
					creation = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(creationDate.getTime());
										
					System.out.println("--- productId =  " + productID + " and provinceID = " + provinceID);
					
					query = "INSERT INTO shipping_province (product_id, province_id, weighted_total_province, creation_date) " 
						+ " VALUES (" + productID + ", " + provinceID + ", '" 
						+ weightedTotalProvince.trim() + "', '" + creation + "');";
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