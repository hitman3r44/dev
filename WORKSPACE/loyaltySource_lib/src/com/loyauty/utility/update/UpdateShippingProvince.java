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
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.product.ProductService;

public class UpdateShippingProvince {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
				
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\UPDATE_shippingProvince_X.sql");
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
			
			productDTOList = new ArrayList<ProductDTO>();

			productDTOList.add(productService.getProductInformation(6518L, null));
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				provinceDTOList = productService.getAllProvinces();
				for (ProvinceDTO provinceDTO : provinceDTOList) {
					provinceID = provinceDTO.getId();
					shippingProvinceDTO = productService.getShippingProvince(productID, provinceID);
					weightedTotalProvince = shippingProvinceDTO.getWeightedTotalProvince();
					query = "UPDATE shipping_province SET weighted_total_province = '" 
							+ weightedTotalProvince.trim() 
							+ "' WHERE product_id = " + productID
							+ " AND province_id = " + provinceID + ";";
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