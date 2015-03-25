package com.loyauty.cronjob;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.*;

import com.loyauty.enums.ProductStatus;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;

public class UpdateProductStatus30DaysLater {

	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			System.out
			.println("----------------------------------------------------- START UpdateProductStatus30DaysLater");
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm");
			productService = serviceLocator.getProductService();			
			List<ProductDTO> productDTOList = productService.getAllDiscontinuedProducts();
			for (ProductDTO productDTO : productDTOList) {
				Date now = Calendar.getInstance().getTime();
				Date begin = productDTO.getDiscontinuedStartDate();
				Calendar cal = Calendar.getInstance();
				cal.setTime(begin);
				cal.add(Calendar.MONTH, 1);
				Date end = cal.getTime();
				
				int numberOfActiveClients = productService.getAllActiveClients(productDTO.getId()).size();
				
				System.out.println("discontinuedStartDate [begin]: " + formatter.format(begin) 
						+ " through expiryDate [end]: " + formatter.format(end) 
						+ " by now: " + formatter.format(now) 
						+ " with numberOfActiveClients = " + numberOfActiveClients
						+ " for productID = " + productDTO.getId() 
						+ " and statusID = " + productDTO.getStatus().getValue() 
						+ " [" + productDTO.getStatus() + "].");				
				
				if (now.compareTo(end) >= 0 
						&& productDTO.getStatus() != ProductStatus.DISABLED
						&& numberOfActiveClients == 0) {
					productService.updateStatusToDisabled(productDTO);
					System.out.println("Product ID: " + productDTO.getId() + " changed its status to 'Disabled' on " 
							+ formatter.format(now) + ", since it was 'Discontinued' on: " + formatter.format(begin) + ".");
				}
			}
			System.out.println("----------------------------------------------------- END UpdateProductStatus30DaysLater");
			
		} catch (ServiceLocatorException slx) {			
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}
	
}
