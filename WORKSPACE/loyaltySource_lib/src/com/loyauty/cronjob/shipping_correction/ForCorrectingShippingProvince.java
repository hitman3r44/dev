package com.loyauty.cronjob.shipping_correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.loyauty.cronjob.orders.OrdersConfirmation;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;

import ca.canadapost.cpcdp.rating.GetRatesClient;

/**
 * 
 * @author Hamdoune Rekiza
 *
 */
public class ForCorrectingShippingProvince {
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
			// Update ShippingProvinceDTO and its DB-Table.
			updateShippingProvince(productDTOList);

		
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void updateShippingProvince(List<ProductDTO> productDTOList) {		
		serviceLocator = ServiceLocator.getInstance();		
		try {
			productService = serviceLocator.getProductService();
			
			long productId = 0L;
			long provinceId = 0L;
			long cityId = 0L;
			List<ProvinceDTO> provinceDTOList = null;
			List<CityDTO> cityDTOList = null;
			ShippingCityDTO shippingCityDTO = null;
			ShippingProvinceDTO shippingProvinceDTO = null;
			double weightedTotalProvince = 0d;
			double expeditedParcelPrice = 0d;
			double populationPercentage = 0d;
			String weightedPrice = "";
			String parcelPrice = "";
			boolean isOverweighted = false;
			
			for (ProductDTO productDTO : productDTOList) {
				productId = productDTO.getId();
				provinceDTOList = productService.getAllProvinces();
				for (ProvinceDTO provinceDTO : provinceDTOList) {
					provinceId = provinceDTO.getId();
					cityDTOList = productService.getAllCities(provinceId);
					weightedTotalProvince = 0d;
					isOverweighted = false;
					for (CityDTO cityDTO : cityDTOList) {
						cityId = cityDTO.getId();
						shippingCityDTO = productService.getShippingCity(productId, cityId);		
						parcelPrice = shippingCityDTO.getExpeditedParcelPrice();
						
						System.out.println("\n [PHASE II]---------- productID = " + productId
											+ ", provinceID = " + provinceId
											+ " and cityID = " + cityId + " -------------\n");
						if (parcelPrice != null) {
							if (parcelPrice.trim().equalsIgnoreCase("NOT AVAILABLE") || parcelPrice.matches("^\\s*$")) {
								isOverweighted = true;
								expeditedParcelPrice = 0d;
							} else {
								expeditedParcelPrice = Double.parseDouble(shippingCityDTO.getExpeditedParcelPrice());								
							}
						} else {
							expeditedParcelPrice = 0d;
						}
						
						populationPercentage = Double.parseDouble(cityDTO.getPopulationPercentage());
						populationPercentage /= 100d;
						weightedTotalProvince += populationPercentage * expeditedParcelPrice;				
					}	// for ... cityDTO					
					
					shippingProvinceDTO = new ShippingProvinceDTO();
					shippingProvinceDTO.setProductId(productId);
					shippingProvinceDTO.setProvinceId(provinceId);
					weightedPrice = String.valueOf(weightedTotalProvince);
					
					if (weightedPrice != null) {
						if (!weightedPrice.matches("^\\s*$") && !weightedPrice.equalsIgnoreCase("")) {
							weightedPrice = format(weightedTotalProvince, "#,###.00", "en", "US");	
						} else {
							weightedPrice = "0.00";
						}
						if (weightedPrice.equalsIgnoreCase(".00")) {
							weightedPrice = "0.00";
						}
					}
					
					if (isOverweighted) {
						shippingProvinceDTO.setWeightedTotalProvince("NOT AVAILABLE");
					} else {
						shippingProvinceDTO.setWeightedTotalProvince(weightedPrice);						
					}
					
					if (!productService.existsShippingProvince(productId, provinceId)) {
						productService.createShippingProvince(shippingProvinceDTO);
					} else {
						productService.updateShippingProvince(shippingProvinceDTO);
					}
					
				}	// for ... provinceDTO
			}	// for ... productDTO
			
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
	
  /*=================================================================================
			getSendingEmailDataFolder: Get dynamically Data Folder Path
	=================================================================================*/
	static String getShippingCorrectionFolder(){
		String shipCorrectionProIdFileDest="";
		URL url=ForCorrectingShippingProvince.class.getProtectionDomain().getCodeSource().getLocation();
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