package com.loyauty.utility.insert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;

import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class InsertUserProductPrice {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			userService = serviceLocator.getUserService();
			
			File file = new File("C:\\INSERT_userProductPrice_OR.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			String query = "";
			long productID = 0L;
			long userID = 0L;
			long templateID = -1L;
			String price = "";
			String profit = "";
			String discount = "";
			String shippingCoverage = "";
			String shippingTotalCanada = "";
			boolean isExcluded = false;
			UserProductPriceDTO userProductPriceDTO = null;
			List<ProductDTO> productDTOList = null;
						
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			
			productDTOList = new ArrayList<ProductDTO>();				
			
			productDTOList.add(productService.getProductInformation(7121L, null)); 
			
			for (ProductDTO productDTO : productDTOList) {
				userProductPriceDTO = new UserProductPriceDTO();
				productID = productDTO.getId();
				for (UserSessionDTO userSessionDTO : userNameList) {
					userID = userSessionDTO.getId();
					userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
					if (userProductPriceDTO != null) {						
						price = userProductPriceDTO.getPrice();
						profit = userProductPriceDTO.getProfit();
						discount = userProductPriceDTO.getDiscount();
						shippingCoverage = userProductPriceDTO.getShippingCoverage();
						shippingCoverage = (shippingCoverage != null) ? shippingCoverage.trim() : "";
						shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
						shippingTotalCanada = (shippingTotalCanada != null) ? shippingTotalCanada.trim() : "" ;				
						
						query = "UPDATE user_product_price SET shipping_coverage = '" + shippingCoverage 
									+ "', shipping_total_canada = '" + shippingTotalCanada + "'"			
									+ ", price = '" + price + "'"
									+ ", price_type = 4"
									+ ", percent_profit = '" + profit + "'"
									+ ", percent_discount = '" + discount + "'"
									+ " WHERE user_id = " + userID 
									+ " AND product_id = " + productID;
					} else {
						templateID = userSessionDTO.getClientCategoryId();
						if (templateID != -1L) {
							userProductPriceDTO = productService.getUserProductPriceInformation(productID, templateID);
						}
						userID = templateID;
						price = userProductPriceDTO.getPrice();
						profit = userProductPriceDTO.getProfit();
						discount = userProductPriceDTO.getDiscount();
						isExcluded = userProductPriceDTO.getExcluded();
						shippingCoverage = userProductPriceDTO.getShippingCoverage();
						shippingCoverage = (shippingCoverage != null) ? shippingCoverage.trim() : "";
						shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
						shippingTotalCanada = (shippingTotalCanada != null) ? shippingTotalCanada.trim() : "" ;				
						
						query = "\tINSERT INTO user_product_price (user_id, product_id, " 
										+ "price, creation_date, price_type, status_id, percent_profit, percent_discount, "
										+ "is_excluded, shipping_coverage, shipping_total_canada) "
									+ " VALUES (" + userID + ", " + productID + ", '" + price 
										+ "', now(), 4, 2, '" + profit + "', '" + discount 
										+ "', " + isExcluded + ", '" + shippingCoverage 
										+ "', " + shippingTotalCanada + ")";
					}
					out.write(query + ";\n");
					
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
