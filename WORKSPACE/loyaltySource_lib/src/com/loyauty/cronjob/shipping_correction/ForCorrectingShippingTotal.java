package com.loyauty.cronjob.shipping_correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;

/**
 * 
 * @author Hamdoune Rekiza
 *
 */
public class ForCorrectingShippingTotal {

	private static final double COVERAGE_RATE_PER_100$ = BackEndConstants.COVERAGE_RATE_PER_100$;
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {
		
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
			String ligne="";
			String shippingCorrectionFolder=getShippingCorrectionFolder();
			BufferedReader pr=new BufferedReader(new FileReader(shippingCorrectionFolder+"correction_shipping_pid.txt")); 
			while((ligne=pr.readLine())!=null){
				ligne=ligne.replaceAll(" ", "");
				if(!ligne.equals("")){
					Long productId=Long.parseLong(ligne);
					productDTOList.add(productService.getProductInformation(productId, null));
				}
			}

			calculateShipping(productDTOList);
			
			System.exit(0);
			
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void calculateShipping(List<ProductDTO> productDTOList) {
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			ArrayList<Long> arrayList = new ArrayList<Long>();		
			for (UserSessionDTO uDTO : userNameList) {
				arrayList.add(uDTO.getId());
			}
			
			//====================== PHASE II: updateShippingProvince(productDTOList) =======================		
			// Update ShippingTotaDTO along with userProductPriceDTO and their respective DB-Tables.
			updateShippingTotalAndUserProductPrice(productDTOList, arrayList);
			
		
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
				UserDTO userDTO = userService.getAnyUserFromId(userId); 
				double multiplier = Double.parseDouble(userDTO.getMultiplier());
				multiplier /= 100d;
				multiplier += 1d;
				
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					if(productId==7384L){
						Long p=productId;
						System.out.println(p);
					}
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
		
	}	// main()
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
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
	
  /*=================================================================================
			getSendingEmailDataFolder: Get dynamically Data Folder Path
	=================================================================================*/
	static String getShippingCorrectionFolder(){
		String shipCorrectionProIdFileDest="";
		URL url=ForCorrectingShippingTotal.class.getProtectionDomain().getCodeSource().getLocation();
		String pathRoot=url.getPath();
		File fileRoot=new File(pathRoot); 
		for(int i=0;i<=3;i++){
		fileRoot=new File(pathRoot); 
		pathRoot=fileRoot.getParent();
		}
		
		shipCorrectionProIdFileDest=pathRoot+"/shipping-calc/";
		return shipCorrectionProIdFileDest;
	}

	
}