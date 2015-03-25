package com.loyauty.cronjob.autoshipping;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class UpdateShippingRateInDB {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	public static void main(String[] args) {		
		serviceLocator = ServiceLocator.getInstance();				
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			//boolean result=productService.calculateShippingRate(3L, 8386L);
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			List<UserSessionDTO> userNameList = userService.getAllUserAccounts(basicUserDTO);
			ArrayList<Long> arrayList = new ArrayList<Long>();
			for (UserSessionDTO uDTO : userNameList) {
				arrayList.add(uDTO.getId());
			}	
			Collections.sort(arrayList);
			String strLog="";
			for(Long userId:arrayList){
				boolean result=productService.calculateShippingRateForAllProducts(userId);
				if(result){
					System.out.println("--- updating shipping for client:"+ userId+" finished with success\n");
					strLog+="--- updating shipping for client:"+ userId+" finished with success\n";
				}else{
					System.out.println("!!!!!!!!!!!!!!! Error when system try to update for client:"+ userId+"\n");
					strLog+="\n!!!!!!!!!!!!!!! Error when system try to update for client:"+ userId+"\n\n";
				}
			}
			SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
			String strToday=sfd.format(new Date());
			String dateLog="=========================================\n";
			dateLog+=strToday+"\n";
			dateLog+="=========================================\n";
			strLog=dateLog+strLog;
			saveLog("/usr/apache-tomcat-7.0.27/webapps/logs/shippingEstimated/",strLog);
			System.exit(0);			
		} catch(ServiceException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saveLog(String folderDestination,String strLog){
		File log=new File(folderDestination);
		log.mkdir();
		String fileDestination=folderDestination+"updateShippingRateInDB.txt";
		log=new File(fileDestination);
		if(log.length()>2792494L)log.delete();
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
