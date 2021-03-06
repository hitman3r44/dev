package com.loyauty;

import java.util.Date;
import java.util.List;

import com.loyauty.model.Product;
import com.loyauty.model.User;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.init.ConfigService;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.service.usersprivileges.UsersPrivilegesService;

public class Testing {

	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static OperationsService operationsService;
	private static ConfigService configService;
	private static ProductService productService;
	private static OrdersService orderService;
	private static UsersPrivilegesService usersPrivilegesService;

	// private static OrderDTO orderDTO;
	// private static ArrayList<OrderDTO>listOrder;

	@SuppressWarnings("null")
	public static void main(String argv[]) {
		System.out.println("Début DateTime:" + new Date());
		serviceLocator = ServiceLocator.getInstance();

		try {

			productService = serviceLocator.getProductService();
			// List<ProductDTO>listP=productService.getProductList();
			// for (int i = 0; i < listP.size(); i++) {
			// System.out.println(listP.get(i).getId());
			// }

			// ProductDTO inputDto = new ProductDTO();
			// inputDto.setId(7258L);
			// ProductDTO productDTO =
			// productService.getProductByIdSumit(inputDto);
			//
			// System.out.println("Product name: "+
			// productDTO.getLoyaltyProductId());

			// Get User List
			// userService = serviceLocator.getUserService();
			// UserSessionDTO inputSessionDTO = new UserSessionDTO();
			// inputSessionDTO.setTypeId(2);
			//
			// List<ProductDTO>list=productService.getAllValidStatusProducts(3L);
			//
			// for (int i = 0; i < list.size(); i++) {
			// System.out.println("Product List:"+ list.get(i).getNameProduc());
			//
			// }

			// List<UserSessionDTO> userSessionDTOList =
			// userService.getAllUsersByTypeSumit(inputSessionDTO);
			/*
			 * User user =new User(); user.setId(3L); List<UserSessionDTO>
			 * userSessionDTOList = (List<UserSessionDTO>)
			 * userService.getCountUserProductPrice(user);
			 * //PoductPrice(inputSessionDTO); for(UserSessionDTO
			 * userSessionDTO2:userSessionDTOList){
			 * System.out.println("User Type: "+userSessionDTO2.getLogin()); }
			 */

			// Get All orders by productOrderNumber
			orderService = serviceLocator.getOrderService();
			OrdersDTO inputOrdersDTO = new OrdersDTO();
			inputOrdersDTO.setProductOrderNumber("0806");

			List<OrdersDTO> ordersDTOList = orderService.getOrdersByProductOrderNumberSumit(inputOrdersDTO);

			for (OrdersDTO ordersDTO : ordersDTOList) {
				System.out.println("product Name: "
						+ ordersDTO.getLsOrderId());
			}
			

			/*
			 * for(ProductDTO prDTO:listP){
			 * System.out.println("Item:"+prDTO.getId()); }
			 */

			// Start Add a new user functionality
//			userService = serviceLocator.getUserService();
//			UserDTO userDTO = UserDTO.valueOf("hamdoune", "password");
//			userDTO.setAddress("Bangladesh");
//			userDTO.setEmail("hitman3r442@gmail.com");
//			userDTO.setRealName("Sumit Sarkar");
//			userDTO.setCode("HAM");
//			userDTO.setTypeId(1);
//			
//			boolean isInserted = userService.insertNewUserSumit(userDTO);
//			if (isInserted) {
//				System.out.println("New User created");
//
//			} else {
//				System.out.println("New User created failed");
//
//			}
			// End Add a new user functionality

			// Start Method for disable user account
//			userService = serviceLocator.getUserService();
//			UserDTO userDTO = UserDTO.valueOf("PERKOPOLIS", "Per123"); 
//			userDTO.setId(59L);
//			userDTO.setPrimaryLanguage(1);
//			userDTO.setSecondaryLanguage(1);
//			
//			userService.disableUserByIdSumit(userDTO);
//			userService.disableUserByLoginSumit(userDTO);

			// End Method for disable user account
			
			// Start Method for updateProductPrice
//			productService = serviceLocator.getProductService();
//			
//			UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
//			userProductPriceDTO.setUserId(3L);
//			userProductPriceDTO.setProductId(4770L);
//			userProductPriceDTO.setPrice("966.23");
//			
//			productService.updateUserProductPriceByProductIdAndUserIDSumit(userProductPriceDTO);
			
			// End Method for updateProductPrice
			
			// Start method for getOrdersByProductNumber
			
			
			
			// End method for getOrdersByProductNumber
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of main

}
