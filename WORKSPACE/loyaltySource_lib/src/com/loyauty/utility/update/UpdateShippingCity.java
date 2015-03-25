package com.loyauty.utility.update;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.product.ProductService;

public class UpdateShippingCity {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\UPDATE_shippingCity_X.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			// long userId = USER_ID_TO_CALCULATE_SHIPPING;
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;
			List<CityDTO> cityDTOList = null;
			ShippingCityDTO shippingCityDTO = null;
			String query = "";
			long productID = 0L;
			long cityID = 0L;
			String expeditedParcelPrice = "";
			
			productDTOList = new ArrayList<ProductDTO>();

			productDTOList.add(productService.getProductInformation(6518L, null));
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				cityDTOList = productService.getCities();
				for (CityDTO cityDTO : cityDTOList) {
					cityID = cityDTO.getId();
					shippingCityDTO = productService.getShippingCity(productID, cityID);
					expeditedParcelPrice = shippingCityDTO.getExpeditedParcelPrice();					
					query = "UPDATE shipping_city SET expedited_parcel_price = '" + expeditedParcelPrice.trim() 
							+ "' WHERE product_id = " + productID + " and city_id = " + cityID + ";";					
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