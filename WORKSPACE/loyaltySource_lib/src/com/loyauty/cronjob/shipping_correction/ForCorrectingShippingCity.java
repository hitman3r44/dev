package com.loyauty.cronjob.shipping_correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
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
public class ForCorrectingShippingCity {

	private static final double POUND_TO_KG_FACTOR = BackEndConstants.POUND_TO_KG_FACTOR;
	private static final double INCH_TO_CM_FACTOR = BackEndConstants.INCH_TO_CM_FACTOR;
	private static final long SYNCH_TIME = 3500L;	// 10000L
	private static final int NUMBER_OF_TRIALS = 8;
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
			//====================== PHASE I: fillShippingCityUsingSOAP(productDTOList) =======================
			// Update ShippingCityDTO and its DB-Table.
			fillShippingCityUsingSOAP(productDTOList);
		
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void fillShippingCityUsingSOAP(List<ProductDTO> productDTOList) {
		serviceLocator = ServiceLocator.getInstance();		
		try {			
			productService = serviceLocator.getProductService();
			long productId = 0L;
			String rate = "";
			List<CityDTO> cityDTOList = null;
			String wgt = "";
			String l = "", w = "", h = "";
			double weightLbs = 0d;
			double lengthIn = 0d, widthIn = 0d, heightIn = 0d;
			double weightKg = 0d;
			double lengthCm = 0d, widthCm = 0d, heightCm = 0d;
			int weight = 0;
			int length = 0, width = 0, height = 0;
			ShippingCityDTO shippingCityDTO = new ShippingCityDTO();
			int off = 0;
			String to = "";
			
			for (ProductDTO productDTO : productDTOList) {
				productId = productDTO.getId();
				cityDTOList = productService.getCities();
				for (CityDTO cityDTO : cityDTOList) {
					wgt = productDTO.getWeight();
					if (wgt != null) {
						if (!wgt.matches("^\\s*$")) {
							weightLbs = Double.parseDouble(wgt);
							weightKg = weightLbs * POUND_TO_KG_FACTOR;
							weight = (int) Math.round(weightKg * 100) / 100;						
						} else {
							weight = 1;
						}
					} else {
						weight = 1;
					}
					
					l = productDTO.getLarge();					
					if (l != null) {
						if (!l.matches("^\\s*$")) {
							lengthIn = Double.parseDouble(l);
							lengthCm = lengthIn * INCH_TO_CM_FACTOR;
							length = (int) Math.round(lengthCm * 100) / 100;								
						} else {
							length = 1;
						}
					} else {
						length = 1;
					}
					
					w = productDTO.getWidth();					
					if (w != null) {
						if (!w.matches("^\\s*$")) {
							widthIn = Double.parseDouble(w);
							widthCm = widthIn * INCH_TO_CM_FACTOR;
							width = (int) Math.round(widthCm * 100) / 100;								
						} else {
							width = 1;
						}
					} else {
						width = 1;
					}
					
					h = productDTO.getHigh();
					if (h != null) {
						if (!h.matches("^\\s*$")) {
							heightIn = Double.parseDouble(h);
							heightCm = heightIn * INCH_TO_CM_FACTOR;
							height = (int) Math.round(heightCm * 100) / 100;								
						} else {
							height = 1;
						}
					} else {
						height = 1;
					}
					
					weight = (weight == 0) ? 1 : weight;
					length = (length == 0) ? 1 : length;
					width = (width == 0) ? 1 : width;
					height = (height == 0) ? 1 : height;
					
					to = cityDTO.getPostalCode();
					rate = getRatesFormatted(to, weight, length, width, height);
					
					shippingCityDTO = new ShippingCityDTO();
					shippingCityDTO.setProductId(productId);
					shippingCityDTO.setCityId(cityDTO.getId());
					
					if (rate.trim().equalsIgnoreCase("0.00")) {
						off = 1;
						do {
							rate = getRatesFormatted(to, weight, length, width, height);
							if (!rate.trim().equalsIgnoreCase("0.00")) break;
							if (off >= NUMBER_OF_TRIALS) break;	
							++off;
						} while(rate.trim().equalsIgnoreCase("0.00"));
					}
					
					Thread.sleep(SYNCH_TIME);
					
					if (rate.equalsIgnoreCase("0.00")) {
						rate = "NOT AVAILABLE";
					}
					
					shippingCityDTO.setExpeditedParcelPrice(rate);
					
					System.out.println("\n [PHASE I]---------- productID = " + productId 
										+ ", cityID = " + cityDTO.getId()
										+ " along with dims. length: " + length
										+ ", width: " + width
										+ ", height: " + height
										+ " [in.] with weight: " + weight
										+ " kgs, yields the rate: " + rate + "$ -------------\n");
										
					if (!productService.existsShippingCity(productId, cityDTO.getId())) {
						productService.createShippingCity(shippingCityDTO);
					} else {
						productService.updateShippingCityToExpeditedParcelPrice(shippingCityDTO);
					}
					
				}	// for ... cityDTO				
			}	// for ... productDTO
			
		} catch (ServiceLocatorException slx) {
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}	// main()	
	

	private static String getRatesFormatted(String to, int weight, int length, int width, int height) {
		GetRatesClient ratesClient;
		String rate;
		BigDecimal rateBD;
		double rateVal;
		ratesClient = new GetRatesClient("H4C3C5", to,  weight, length, width, height);
		rateBD = ratesClient.getRates();				
		rate = rateBD.toString();		
		if (rate != null) {
			if (!rate.matches("^\\s*$") && !rate.equalsIgnoreCase("")) {		
				rateVal = Double.parseDouble(rate);
				rate = format(rateVal, "#,###.00", "en", "US");	
			} else {
				rateVal = 0d;
				rate = "0.00";
			}
			if (rate.equalsIgnoreCase(".00")) {
				rate = "0.00";
			}
		}
		
		if (weight >= 30) {
			rate = "NOT AVAILABLE";
		}
		return rate.intern();
	}
	
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
		URL url=ForCorrectingShippingCity.class.getProtectionDomain().getCodeSource().getLocation();
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