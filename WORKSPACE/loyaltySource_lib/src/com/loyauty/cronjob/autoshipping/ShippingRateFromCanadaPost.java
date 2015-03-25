package com.loyauty.cronjob.autoshipping;

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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.loyauty.cronjob.NewUsersShippingTransfer;
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
 * @author Rafael Padron
 *
 */
public class ShippingRateFromCanadaPost {
	private static final String SHIPPING_DIR = BackEndConstants.SHIPPING_DIR;
	private static final String SHIPPING_SHELL_EXEC_PGM = BackEndConstants.SHIPPING_SHELL_EXEC_PGM;
	private static final double POUND_TO_KG_FACTOR = BackEndConstants.POUND_TO_KG_FACTOR;
	private static final double INCH_TO_CM_FACTOR = BackEndConstants.INCH_TO_CM_FACTOR;
	private static final long SYNCH_TIME = 5500L;	// 10000L
	private static final int NUMBER_OF_TRIALS = 8;
	private static final int PROCESSING_NO = 1;	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {		
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();			
			List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();			
			// testing
			productDTOList.add(productService.getProductInformation(5657L, null));
			
			
			calculateShipping(productDTOList);			
			System.exit(0);			
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//consume();
		System.exit(0);

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
    	    
    	    //whereData = "C:/corbeille/shipping-calc/pids.txt";
      	    //whereCtrl = "C:/corbeille/shipping-calc/ctrl.txt";
    	    
    	    
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
    			for (int idx = 0; idx < remover.length; idx++) {
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
			Collections.sort(arrayList);
			
			new NewUsersShippingTransfer().transfer();
			
			System.out.println("/-------------------------------------- PHASE I: fillShippingCityUsingSOAP(productDTOList) ------------------------/");
			// Update ShippingCityDTO and its DB-Table.
			System.out.println("Executing PHASE I");
			fillShippingCityUsingSOAP(productDTOList);
	
			System.out.println("/-------------------------------------- PHASE II: updateShippingProvince(productDTOList):executed in UpdateShippingRateInDB ------------------------/");
			
			System.out.println("/-------------------------------------- PHASE III: updateShippingTotalAndUserProductPrice(productDTOList, arrayList):executed in UpdateShippingRateInDB ------------------------/");			

			
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
			SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
			String strToday=sfd.format(new Date());
			boolean clean=true;
			saveLog("/usr/apache-tomcat-7.0.27/webapps/logs/shippingEstimated/","=========================\n"+strToday+"\n=========================\n",clean);
			System.out.println("----- Executing fillShippingCityUsingSOAP");
			clean=false;
			for (ProductDTO productDTO : productDTOList) {
				productId = productDTO.getId();
				
				//cityDTOList = productService.getCities();
				cityDTOList = productService.getMostPopularCitiesList();
				for (CityDTO cityDTO : cityDTOList) {
					//wgt = productDTO.getWeight();
					wgt = productDTO.getBoxTotalWeight()+"";
					if (wgt != null && !wgt.equals("null")) {
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
					
					//l = productDTO.getLarge();	
					l = productDTO.getBoxLength()+"";
					if (l != null && !l.equals("null")) {
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
					
					//w = productDTO.getWidth();	
					w = productDTO.getBoxWidth()+"";
					if (w != null && !w.equals("null")) {
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
					
					//h = productDTO.getHigh();
					h = productDTO.getBoxHeight()+"";
					if (h != null && !h.equals("null")) {
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
					System.out.println("------ Executing getRatesFormatted");
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
					
					saveLog("/usr/apache-tomcat-7.0.27/webapps/logs/shippingEstimated/","--- Shipping Rate Of product:"+productId+"="+productId+"\n",clean);
					
					System.out.println("[PHASE I]---------- productID = " + productId 
										+ ", cityID = " + cityDTO.getId()
										+ " along with dims. length: " + length +" <=> BOX length:"+productDTO.getBoxLength() +"### p.length:"+productDTO.getLarge()
										+ ", width: " + width +" <=> BOX width:"+productDTO.getBoxWidth() +"### p.Width:"+productDTO.getWidth()
										+ ", height: " + height +" <=> BOX height:"+productDTO.getBoxHeight() +"### p.High:"+productDTO.getHigh()
										+ " [in.] with weight: " + weight +" <=> BOX weight:"+productDTO.getBoxTotalWeight()+"### p.Weight:"+productDTO.getWeight()
										+ " kgs, yields the rate: " + rate + "$ -------------");
					
					
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
		System.out.println();
		System.out.println("------- creation:ratesClient.getRates()");
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
	
	
	public static void saveLog(String folderDestination,String strLog,boolean clean){
		File log=new File(folderDestination);
		log.mkdir();
		String fileDestination=folderDestination+"shippingRateFromCanadaPost.txt";
		log=new File(fileDestination);
		if(log.length()>332792494L && clean)log.delete();
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(fileDestination,true),true);
			pw.println(strLog);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}