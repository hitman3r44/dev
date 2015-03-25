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

import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.product.ProductService;

public class InsertShippingCity {
		
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			
			File file = new File("C:\\INSERT_shippingCity_6907.sql");
			BufferedWriter out  = new BufferedWriter(new FileWriter(file));
			
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
			Calendar creationDate = Calendar.getInstance();
			String creation = "";
			
			productDTOList = new ArrayList<ProductDTO>();
			
			// INSERT
			productDTOList.add(productService.getProductInformation(6907L, null));
			productDTOList.add(productService.getProductInformation(6003L, null));
			
			
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				cityDTOList = productService.getCities();
				for (CityDTO cityDTO : cityDTOList) {
					cityID = cityDTO.getId();
					shippingCityDTO = productService.getShippingCity(productID, cityID);
					expeditedParcelPrice = shippingCityDTO.getExpeditedParcelPrice();
					creation = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(creationDate.getTime());
					query = "INSERT INTO shipping_city (product_id, city_id, expedited_parcel_price, creation_date) VALUES (" 
							+ productID + ", " + cityID + ", '" + expeditedParcelPrice.trim() + "', '" + creation + "');";
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