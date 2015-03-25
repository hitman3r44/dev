package com.loyauty.utility;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;

public class Friends {
	
	private static final double COVERAGE_RATE_PER_100$ = BackEndConstants.COVERAGE_RATE_PER_100$;
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String... args) {
		
		List<Long> productIDsList = null;
		ProductDTO productDTO = null;
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		UserProductPriceDTO userProductPriceDTO = null;
		
		long userID = 41L;	// friends
		double cost = 0d;
		double msrp = 0d;
		double price = 0d;
		double profit = 0d;
		double discount = 0d;
		String priceString = "";
		String profitString = "";
		String discountString = "";
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			
			ArrayList<Long> arrayList = new ArrayList<Long>();		
			arrayList.add(userID);
			productIDsList = productService.getAllValidProductIds();
			
			for (long productID :  productIDsList) {
				productDTO = productService.getProductInformation(productID, null);
				
				msrp = (productDTO.getMsrp() != null) ? Double.parseDouble(productDTO.getMsrp()) : 0d;
				cost = (productDTO.getCost() != null) ? Double.parseDouble(productDTO.getCost()) : 0d;
				
				// GIVEN FORMULA - BEGIN
				price = cost + (.3d * (msrp - cost));
				// GIVEN FORMULA - END			
				
				priceString = format(price, "#,###.00", "en", "US");
				
				profit = calcProfit(cost, price);
				discount = calcDiscount(msrp, price);
				
				profitString = (profit != 0d) ? format(profit, "#,###.0000", "en", "US") : "0.0000";
				discountString = (discount != 0d) ? format(discount, "#,###.00", "en", "US") : "0.00";
				
				System.out.println("price: |" + priceString
									+ "|, profit: |" + profitString
									+ "|, discount: |" + discountString
									+ "|, msrp: |" + msrp
									+ "|, cost: " + cost + "|.");
				
/*				
 				// 1.- CREATE THE TYPE-2 USER BY USING A SQL-SCRIPT FOR user_account & user_profile DB-TABLES (SEE BELOW).
 				// 2.- CREATE A UserProductPriceDTO OBJECT & populate the user_product_price DB-TABLE W/O SHIPPING.
				userProductPriceDTO = new UserProductPriceDTO();
				userProductPriceDTO.setUserId(userID);
				userProductPriceDTO.setProductId(productID);
				userProductPriceDTO.setPrice(priceString);
				userProductPriceDTO.setPriceType(PriceType.ADD_PRODUCT_PRICE_SET);
				userProductPriceDTO.setUserStatus(UserProductStatus.INACTIVE);
				userProductPriceDTO.setProfit(profitString);
				userProductPriceDTO.setDiscount(discountString);
				userProductPriceDTO.setExcluded(false);				
				// productService.createUserProductPrice(userProductPriceDTO);
				productService.updateUserProductPrice(userProductPriceDTO);
*/									
				

				
			}
			
			// 3.- CALCULATE THE SHIPPING.
			updateShippingTotalAndUserProductPrice(productDTOList, arrayList);
			
			System.exit(0);
			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static double calcProfit(double cost, double price) {
		double profit = 0d;
		if (price == 0d) return 0d;
		if (cost != 0d) {
			profit = ((price / cost) - 1d) *  100d;
		}
		return profit;
	}
	
	private static double calcDiscount(double msrp, double price) {
		double discount = 0d;
		if (price == 0d) return 100d;
		if (msrp != 0d) {
			discount = ( (msrp - price) / msrp) * 100d;
		}
		return discount;
	}
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		df.setGroupingUsed(false);
		return nf.format(value);
	}
	
	private static void updateShippingTotalAndUserProductPrice(List<ProductDTO> productDTOList, ArrayList<Long> userIDList) {		
		serviceLocator = ServiceLocator.getInstance();		
		try {			
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			long productId = 0L;
			long provinceId = 0L;
			List<ProvinceDTO> provinceDTOList = null;
			ShippingTotalDTO shippingTotalDTO = null;
			ShippingProvinceDTO shippingProvinceDTO = null;
			UserProductPriceDTO userProductPriceDTO = null;
			UserProvincePopulationDTO userProvincePopulation =  null;
			String price = "";
			String wtp = "";
			String populationPercent = "";
			double weightedTotalProvince = 0d;
			double coverage = 0d;
			double averageShippingTotal = 0d;
			double weightedProvinceTotalWithCoverage = 0d;
			double populationPercentage = 0d;
			double shippingTotalCanada = 0d;
			
			for (Long userId : userIDList) {
				UserDTO userDTO = userService.getUserInformation(userId);
				
				double multiplier = Double.parseDouble(userDTO.getMultiplier());
				multiplier /= 100d;
				multiplier += 1d;
				
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					provinceDTOList = productService.getAllProvinces();
					shippingTotalCanada = 0d;
					for (ProvinceDTO provinceDTO : provinceDTOList) {
						provinceId = provinceDTO.getId();
						price = productDTO.getPriceProduct();
						if (price != null) {
							if (!price.matches("^\\s*$")) {
								coverage = calculateCoverage(Double.parseDouble(price));	// from user_product_price DB Table.
							} else {
								coverage = 0d;
							}
						} else {
							coverage = 0d;
						}
						
						userProductPriceDTO = new UserProductPriceDTO();
						userProductPriceDTO.setProductId(productId);
						userProductPriceDTO.setUserId(userId);
						
						String covString = String.valueOf(coverage);			
						if (covString != null) {
							if (!covString.matches("^\\s*$") && !covString.equalsIgnoreCase("")) {
								covString = format(coverage, "#,###.00", "en", "US");	
							} else {
								covString = "0.00";
							}
							if (covString.equalsIgnoreCase(".00")) {
								covString = "0.00";
							}
						}
						
						userProductPriceDTO.setShippingCoverage(String.valueOf(covString));
						productService.updateUPPShippingCoverage(userProductPriceDTO);
						
						shippingTotalDTO = new ShippingTotalDTO();
						shippingTotalDTO.setProductId(productId);
						shippingTotalDTO.setProvinceId(provinceId);
						shippingTotalDTO.setUserId(userId);
						
						shippingProvinceDTO = productService.getWeightedTotalProvinceFromShippingProvince(productId, provinceId);
						wtp = shippingProvinceDTO.getWeightedTotalProvince();
						
						if (!wtp.trim().equalsIgnoreCase("NOT AVAILABLE")) {					
							weightedTotalProvince = Double.parseDouble(wtp);
							
							weightedProvinceTotalWithCoverage = coverage + weightedTotalProvince;
							String weightedProvinceWCoverage = String.valueOf(weightedProvinceTotalWithCoverage);
							if (weightedProvinceWCoverage != null) {
								if (!weightedProvinceWCoverage.matches("^\\s*$") && !weightedProvinceWCoverage.equalsIgnoreCase("")) {
									weightedProvinceWCoverage = format(weightedProvinceTotalWithCoverage, "#,###.00", "en", "US");
								} else {
									weightedProvinceWCoverage = "0.00";
								}
								if (weightedProvinceWCoverage.equalsIgnoreCase(".00")) {
									weightedProvinceWCoverage = "0.00";
								}
							}
							
							shippingTotalDTO.setWeightedProvinceTotalWithCoverage(weightedProvinceWCoverage);
							
							averageShippingTotal = weightedProvinceTotalWithCoverage * multiplier;
							String avgTotal = String.valueOf(averageShippingTotal);				
							if (avgTotal != null) {
								if (!avgTotal.matches("^\\s*$") && !avgTotal.equalsIgnoreCase("")) {
									avgTotal = format(averageShippingTotal, "#,###.00", "en", "US");	
								} else {
									avgTotal = "0.00";
								}
								if (avgTotal.equalsIgnoreCase(".00")) {
									avgTotal = "0.00";
								}
							}
							
							shippingTotalDTO.setAverageShippingTotal(avgTotal);						
							
							userProvincePopulation = productService.getUserProvincePopulation(userId, provinceId);
							populationPercent = userProvincePopulation.getPopulationPercent();
							populationPercentage = Double.parseDouble(populationPercent);
							populationPercentage /= 100d;
							shippingTotalCanada += populationPercentage * averageShippingTotal;
							
						} else {
							shippingTotalDTO.setWeightedProvinceTotalWithCoverage("NOT AVAILABLE");
							shippingTotalDTO.setAverageShippingTotal("NOT AVAILABLE");
						}
						
						System.out.println("\n [PHASE III]---------- productID = " + productId
								+ ", provinceID = " + provinceId + " and userID = " + userId 
								+ " -------------\n");			
						
						
						if (!productService.existsShippingTotal(productId, provinceId, userId)) {
							productService.createShippingTotal(shippingTotalDTO);
						} else {
							productService.updateShippingTotal(shippingTotalDTO);
						}
						
					}	// for ... provinceDTO
					
					userProductPriceDTO = new UserProductPriceDTO();
					userProductPriceDTO.setProductId(productId);
					userProductPriceDTO.setUserId(userId);				
					
					if (!wtp.trim().equalsIgnoreCase("NOT AVAILABLE")) {				
						String shippingCanada = String.valueOf(shippingTotalCanada);			
						if (shippingCanada != null) {
							if (!shippingCanada.matches("^\\s*$") && !shippingCanada.equalsIgnoreCase("")) {
								shippingCanada = format(shippingTotalCanada, "#,###.00", "en", "US");	
							} else {
								shippingCanada = "0.00";
							}
							if (shippingCanada.equalsIgnoreCase(".00")) {
								shippingCanada = "0.00";
							}
						}
						userProductPriceDTO.setShippingTotalCanada(shippingCanada);				
					} else {
						userProductPriceDTO.setShippingTotalCanada("NOT AVAILABLE");
					}
								
					productService.updateUPPShippingTotalCanada(userProductPriceDTO);
					
				}	// for ... productDTO
			}
		} catch (ServiceLocatorException slx) {			
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
	}
	
	private static double calculateCoverage(double averageWeightedPrice) {
		double outcome = 0d;
		double times = averageWeightedPrice / 100d;
		String analyzer = String.valueOf(times);
		int index = analyzer.indexOf(".");
		String integerPart = analyzer.substring(0, index);		
		String mantissaPart = analyzer.substring(index, analyzer.length());				
		int integer = Integer.parseInt(integerPart);
		double mantissa = Double.parseDouble(mantissaPart);		
		if (mantissa == 0d) {
			outcome = (integer > 0) 
			?  (((double) (integer-1)) * COVERAGE_RATE_PER_100$) 
			: 0d;
		} else {
			outcome = (integer > 0) 
			?  (((double) integer) * COVERAGE_RATE_PER_100$) 
			: 0d;
		}
		return outcome;
	}
	
}

/*
// 1.- CREATE THE TYPE-2 USER BY USING A SQL-SCRIPT FOR user_account & user_profile DB-TABLES.
INSERT INTO user_account(login, type_id, password, email, active, code) VALUES ('friends', 2, 'loyalty', 'info@loyaltysource.com', true, 'FD_');
INSERT INTO user_profile(user_id, real_name, address, postal_code, phone, primary_language, secondary_language, multiplier) VALUES (41, 'Friends', '642 de Courcelle Street Suite 604', 'H4C 3C5', '514-664-5304', 1, 2, '15');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 1, '10.89');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 2, '13.14');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 3, '3.61');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 4, '2.24');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 5, '1.54');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 6, '2.75');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 7, '0.12');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 8, '0.09');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 9, '38.39');						
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 10, '0.42');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 11, '23.61');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 12, '3.09');
	INSERT INTO user_province_population(user_id, province_id, population_percent) VALUES (41, 13, '0.10');
	
 */
