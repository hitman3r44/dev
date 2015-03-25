package com.loyauty.cronjob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
 * @author Rafael Padron
 *
 */
public class ShippingUtil {
	private static final String SHIPPING_DIR = BackEndConstants.SHIPPING_DIR;
	private static final String SHIPPING_SHELL_EXEC_PGM = BackEndConstants.SHIPPING_SHELL_EXEC_PGM;
	private static final double POUND_TO_KG_FACTOR = BackEndConstants.POUND_TO_KG_FACTOR;
	private static final double INCH_TO_CM_FACTOR = BackEndConstants.INCH_TO_CM_FACTOR;
	private static final double COVERAGE_RATE_PER_100$ = BackEndConstants.COVERAGE_RATE_PER_100$;
	
	private static final long SYNCH_TIME = 3500L;	// 10000L
	private static final int NUMBER_OF_TRIALS = 8;
	private static final int PROCESSING_NO = 1;	
	/* [ 1000 msec/sec * 60 sec/min * 2 min ] + 50% increase = 180,000 msec  */
	private static final long EACH_PRODUCT_PROCESSING_TIME = 100000L;	
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {
		
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			
			List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
			// List<ProductDTO> productDTOList = productService.getWereWgtDimChangedFromProduct();
						
			productDTOList = productService.getProductBetween(7534L, 7534L);
			
			calculateShipping(productDTOList);
			
			System.exit(0);
			
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public static void consume() {
    	serviceLocator = ServiceLocator.getInstance();
    	try {
    		productService = serviceLocator.getProductService();
    	    boolean isThereNoMoreItems = false;
    	    String whereData = "";
    	    String whereCtrl = "";
    	    long[] selected = null;    	   
    	    whereData = SHIPPING_DIR + "pids.txt";
    	    whereCtrl = SHIPPING_DIR + "ctrl.txt";
    	    
    	    int currentLinesToProcess = 0;
    	    int missingLinesToProcess = 0;
    	    File file = new File(whereCtrl);
    	    BufferedReader brC = new BufferedReader(new FileReader(file));
    	    String lineC = "";
    	    while ((lineC = brC.readLine()) != null) {
    	    	if (!lineC.matches("^\\s*$") && lineC.matches("^[0-9]+$")) {
    	    		if (lineC.equalsIgnoreCase("0")) {
    	    			isThereNoMoreItems = true;
    	    			break;
    	    		}
    	    		currentLinesToProcess = Integer.parseInt(lineC);
    	    	} else {
    	    		isThereNoMoreItems = true;
    	    	}	
    	    }
    	    
    	    brC.close();	
    	    if (isThereNoMoreItems) System.exit(0);
    	    
    	    if (currentLinesToProcess > 0) {
    	    	file = new File(whereData);
    	    	BufferedReader brD = new BufferedReader(new FileReader(file));
    	    	String lineD = "";
    	    	int count = 0;
    		    
    	    	if (currentLinesToProcess >= PROCESSING_NO) {
    	    		selected = new long[PROCESSING_NO];
    	    		missingLinesToProcess = currentLinesToProcess - PROCESSING_NO;
    	    	} else {
    	    		missingLinesToProcess = PROCESSING_NO - currentLinesToProcess;
    	    		selected = new long[missingLinesToProcess];
    	    	}
    	    	
    	    	List<ProductDTO> productDTOParcialList = new ArrayList<ProductDTO>();
    	    	long productID = 0L;
    	    	while((lineD = brD.readLine()) != null) {
    	    		if (!lineD.equalsIgnoreCase("EOF")) {
    	    			if (count == PROCESSING_NO) break;
    	    			productID = Long.parseLong(lineD);
    	    			productDTOParcialList.add(productService.getProductInformation(productID, null));
    	    			selected[count] = Long.parseLong(lineD);
    	    			++count;
    	    		} else break;
    	    	}
    	    	
    	    	if (productDTOParcialList.size() > 0) calculateShipping(productDTOParcialList);    		
    	    	// Thread.sleep(EACH_PRODUCT_PROCESSING_TIME);
    	    	
    	    	brD.close();
    	    	
    	    	rewriteFileWithout(selected, whereData);
    	    	
    	    	// Runtime.getRuntime().exec("sed -i \"s/" + currentLinesToProcess + "/" + missingLinesToProcess + "\" " + whereCtrl);
    	    	rewriteCtrl(String.valueOf(missingLinesToProcess), whereCtrl);
    	    	
    	    	if (missingLinesToProcess > 0) Runtime.getRuntime().exec(SHIPPING_SHELL_EXEC_PGM);
    	    	
    	    } else {
    		    System.exit(0);
    	    }
    	    
    	    System.exit(0);
    		
    	} catch (IOException iox) {
    	    iox.printStackTrace();
    	} catch (Exception x) {
    		x.printStackTrace();
    	}
    }
	
    private static void rewriteCtrl(String lineToReplace, String whereCtrl) {
    	try {
    		File file = new File(whereCtrl);
    		if (file.exists()) {
                FileOutputStream fos = new FileOutputStream(file, false);
                fos.write(lineToReplace.getBytes());
                fos.close();
    		}
    	} catch (IOException iox) {
    		iox.printStackTrace();
    	}
    }
    
	private static void deleteLineFromFile(String fileWithPath, String lineToRemove) {
		try {
			File inFile = new File(fileWithPath);
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
			BufferedReader br = new BufferedReader(new FileReader(fileWithPath));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				if (!line.trim().equalsIgnoreCase(lineToRemove)) {
					pw.println(line);
					pw.flush();
				}
			}		
			pw.close();
			br.close();
			inFile.delete();
			tempFile.renameTo(inFile);
		} catch (IOException iox) {
			iox.printStackTrace();
		}
	}
	
    private static void rewriteFileWithout(long[] remover, String where) {
    	if (remover != null) {
    		if (remover.length > 0) {				
    			for (int idx=0; idx<remover.length; idx++) {
    				deleteLineFromFile(where, String.valueOf(remover[idx]));
    			}
    		}
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
			
			//integrate Template in shipping
			List<ClientCategoryDTO> listClientCategory = userService.getAllClientCategory();;
			for (ClientCategoryDTO ccDTO : listClientCategory) {
				arrayList.add(ccDTO.getClientCategoryId());
			}
			
			System.out.println("/-------------------------------------- PHASE I: fillShippingCityUsingSOAP(productDTOList) ------------------------/");
			// Update ShippingCityDTO and its DB-Table.
			//fillShippingCityUsingSOAP(productDTOList);
			
			System.out.println("/-------------------------------------- PHASE II: updateShippingProvince(productDTOList) ------------------------/");
			// Update ShippingProvinceDTO and its DB-Table.
			//updateShippingProvince(productDTOList);	
			
			System.out.println("/-------------------------------------- PHASE III: updateShippingTotalAndUserProductPrice(productDTOList, arrayList) ------------------------/");			
			// Update ShippingTotaDTO along with userProductPriceDTO and their respective DB-Tables.
			updateShippingTotalAndUserProductPrice(productDTOList, arrayList);
		
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
				//UserDTO userDTO = userService.getUserInformation(userId);
				//including Template in shipping
				UserDTO userDTO = userService.getAnyUserFromId(userId); 
				double multiplier = Double.parseDouble(userDTO.getMultiplier());
				multiplier /= 100d;
				multiplier += 1d;
				
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					provinceDTOList = productService.getAllProvinces();
					shippingTotalCanada = 0d;
					for (ProvinceDTO provinceDTO : provinceDTOList) {
						provinceId = provinceDTO.getId();
						//price = productDTO.getPriceProduct();
						price="236.4";
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
							Double x=populationPercentage * averageShippingTotal;
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
	
}