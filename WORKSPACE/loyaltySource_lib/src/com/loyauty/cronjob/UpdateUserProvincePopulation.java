package com.loyauty.cronjob;

import java.util.List;

import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserProvincePopulationDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class UpdateUserProvincePopulation {
		
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static ProductService productService;
	
	public static void main(String... args) {		
		serviceLocator = ServiceLocator.getInstance();		
		try {			
			userService = serviceLocator.getUserService();
			productService = serviceLocator.getProductService();
			long provinceId = 0L;
			long userId = 0L;
			String populationPercent = "";
			BasicUserDTO basicUserDTO = null;
			List<UserSessionDTO> userSessionDTOList = null;
			List<ProvinceDTO> provinceDTOList = null;
			UserProvincePopulationDTO userProvincePopulationDTO = null;
			
			basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(UserType.USER.getValue());
			basicUserDTO.setActive(true);
			userSessionDTOList = userService.getAllUserAccounts(basicUserDTO);
			
			for (UserSessionDTO userSessionDTO : userSessionDTOList) {
				userId = userSessionDTO.getId();
				provinceDTOList = productService.getAllProvinces();
				for (ProvinceDTO provinceDTO : provinceDTOList) {
					provinceId = provinceDTO.getId();
					userProvincePopulationDTO = new UserProvincePopulationDTO();
					userProvincePopulationDTO.setUserId(userId);
					userProvincePopulationDTO.setProvinceId(provinceId);
					
					populationPercent = provinceDTO.getPopulationPercent();
					userProvincePopulationDTO.setPopulationPercent(populationPercent);
					productService.createUserProvincePopulation(userProvincePopulationDTO);
					
				}
				
			}
			
		} catch (ServiceLocatorException slx) {			
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		System.out.println("[RGP] UPDATE HAS SUCCESSFULLY FINISHED!!!");
		
		System.exit(0);
		
	}	// main()
	
}
