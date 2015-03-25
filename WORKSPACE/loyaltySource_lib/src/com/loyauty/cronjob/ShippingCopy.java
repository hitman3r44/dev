package com.loyauty.cronjob;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ShippingCityDTO;
import com.loyauty.service.core.dto.ShippingProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;

public class ShippingCopy {
		
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	private Set<Long> minimizeSet(Set<Long> productIDWholeSet) {
		Set<Long> productIDPartialSet = new HashSet<Long>();
		for (long productID : productIDWholeSet) {
			if (didAlreadyExistInDB(productID)) {
				executeDBShippingCopy(productID);
			} else {
				productIDPartialSet.add(productID);
			}
		}
		showStats(productIDWholeSet, productIDPartialSet);
		return productIDPartialSet;
	}
	
	public boolean didAlreadyExistInDB(long productID) {
		boolean outcome = false;
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			ProductDTO productDTO = productService.getProductInformation(productID, null);
			List<Long> repeats = productService.getShippingRepeats(productDTO);
			if (repeats != null) {
				outcome = (repeats.size() > 0);
			}
		} catch (ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outcome;
	}
	
	private void executeDBShippingCopy(long productID) {		
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			
			long sourceID = 0L;
			ProductDTO productDTO = productService.getProductInformation(productID, null);
			List<Long> repeats = productService.getShippingRepeats(productDTO);
			if (repeats != null) {
				if (repeats.size() > 0) {
					sourceID = repeats.iterator().next();
					copyShippingProduct(sourceID, productID);
				}
			}
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void showStats(Set<Long> wholeSet, Set<Long> partialSet) {		
		try {
    		int wholeSize = 0;
    		int partialSize = 0;
    		double enhancementPercent = 0d;
    		long min = 0L;
    		long max = 0L;
    		String data = "";
    		
    		String statsFile = BackEndConstants.SHIPPING_DIR + "stats.txt";
    		
    		File file = new File(statsFile);
    		if (!file.exists()) {
    			file.createNewFile();
    		}
    		
    		FileWriter fileWriter = new FileWriter(file, true);
    		BufferedWriter writer = new BufferedWriter(fileWriter);
    		
    		if (wholeSet != null && wholeSet.size() > 0) {
    			wholeSize = wholeSet.size();
        		min = Collections.min(wholeSet);
        		max = Collections.max(wholeSet);
    		}
    		
    		partialSize = (partialSet != null && partialSet.size() > 0) 
    						? partialSet.size() 
    						: 0;
    		
    		if (wholeSize != 0 ) { 
    			enhancementPercent = (1d - (((double) partialSize)/((double) wholeSize)));
    			enhancementPercent *= 100d;
    		}
    		
    		data = wholeSize + " | " 
    				+ partialSize + " | " 
    				+ enhancementPercent + "|"
    				+ min + "|"
    				+ max + "|"
    				+ new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    		
    		writer.write(data + "\n");
    		
    		writer.flush();
    		writer.close();
			
    	} catch (IOException iox) {
    		iox.printStackTrace();
    	} catch (Exception x) {
    		x.printStackTrace();
    	}    	
	}
		
	private void copyShippingProduct(long fromID, long toID) {
		copyShippingCity(fromID, toID);
		copyShippingProvince(fromID, toID);
		copyShippingTotal(fromID, toID);
		copyUserProductPrice(fromID, toID);
	}
	
	private void copyShippingCity(long fromID, long toID) {
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			
			ShippingCityDTO shippingCityDTOFrom = null;
			ShippingCityDTO shippingCityDTOTo = null;
			long cityID = 0L;
			List<CityDTO> cityDTOList = productService.getCities();
			for (CityDTO cityDTO : cityDTOList) {
				cityID = cityDTO.getId();				
				shippingCityDTOFrom = productService.getShippingCity(fromID, cityID);
				
				shippingCityDTOTo = new ShippingCityDTO();
				shippingCityDTOTo.setProductId(shippingCityDTOFrom.getProductId());
				shippingCityDTOTo.setCityId(shippingCityDTOFrom.getCityId());
				shippingCityDTOTo.setExpeditedParcelPrice(shippingCityDTOFrom.getExpeditedParcelPrice());
				
				if (productService.existsShippingCity(toID, cityID)) {
					productService.updateShippingCityToExpeditedParcelPrice(shippingCityDTOTo);
				} else {
					productService.createShippingCity(shippingCityDTOTo);
				}
			}
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void copyShippingProvince(long fromID, long toID) {
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			
			ShippingProvinceDTO shippingProvinceDTOFrom = null;
			ShippingProvinceDTO shippingProvinceDTOTo = null;
			long provinceID = 0L;			
			List<ProvinceDTO> provinceDTOList = productService.getAllProvinces();
			for (ProvinceDTO provinceDTO : provinceDTOList) {
				provinceID = provinceDTO.getId();
				
				shippingProvinceDTOFrom = productService.getShippingProvince(fromID, provinceID);
				
				shippingProvinceDTOTo = new ShippingProvinceDTO();
				shippingProvinceDTOTo.setProductId(shippingProvinceDTOFrom.getProductId());
				shippingProvinceDTOTo.setProvinceId(shippingProvinceDTOFrom.getProvinceId());
				shippingProvinceDTOTo.setWeightedTotalProvince(shippingProvinceDTOFrom.getWeightedTotalProvince());
				
				if (productService.existsShippingProvince(toID, provinceID)) {
					productService.updateShippingProvince(shippingProvinceDTOTo);
				} else {
					productService.createShippingProvince(shippingProvinceDTOTo);				
				}
			}
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void copyShippingTotal(long fromID, long toID) {
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			List<ProvinceDTO> provinceDTOList = null;
			ShippingTotalDTO shippingTotalDTOFrom = null;
			ShippingTotalDTO shippingTotalDTOTo = null;
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			
			long userID = 0L;
			long provinceID = 0L;
			for (UserSessionDTO uDTO : userNameList) {
				userID = uDTO.getId();
				provinceDTOList = productService.getAllProvinces();
				for (ProvinceDTO provinceDTO : provinceDTOList) {
					provinceID = provinceDTO.getId();
					
					shippingTotalDTOFrom = productService.getShippingTotal(fromID, provinceID, userID);
					
					shippingTotalDTOTo = new ShippingTotalDTO();
					shippingTotalDTOTo.setProductId(shippingTotalDTOFrom.getProductId());
					shippingTotalDTOTo.setProvinceId(shippingTotalDTOFrom.getProvinceId());
					shippingTotalDTOTo.setUserId(shippingTotalDTOFrom.getUserId());
					shippingTotalDTOTo.setWeightedProvinceTotalWithCoverage(shippingTotalDTOFrom.getWeightedProvinceTotalWithCoverage());
					shippingTotalDTOTo.setAverageShippingTotal(shippingTotalDTOFrom.getAverageShippingTotal());
					
					if (productService.existsShippingTotal(toID, provinceID, userID)) {
						productService.updateShippingTotal(shippingTotalDTOTo);
					} else {
						productService.createShippingTotal(shippingTotalDTOTo);
					}
				}
			}
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void copyUserProductPrice(long fromID, long toID) {
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();

			UserProductPriceDTO userProductPriceDTOFrom = null;
			UserProductPriceDTO userProductPriceDTOTo = null;
			
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			
			long userID = 0L;
			for (UserSessionDTO uDTO : userNameList) {
				userID = uDTO.getId();
				userProductPriceDTOFrom = productService.getUserProductPriceInformation(fromID, userID);
				
				userProductPriceDTOTo = new UserProductPriceDTO();
				userProductPriceDTOTo.setUserId(userProductPriceDTOFrom.getUserId());
				userProductPriceDTOTo.setProductId(userProductPriceDTOFrom.getProductId());
				userProductPriceDTOTo.setShippingCoverage(userProductPriceDTOFrom.getShippingCoverage());
				userProductPriceDTOTo.setShippingTotalCanada(userProductPriceDTOFrom.getShippingTotalCanada());				
				
				productService.updateUPPShippingCoverage(userProductPriceDTOTo);
				productService.updateUPPShippingTotalCanada(userProductPriceDTOTo);
			}
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
