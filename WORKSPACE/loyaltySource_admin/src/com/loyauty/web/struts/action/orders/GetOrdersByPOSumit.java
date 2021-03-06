package com.loyauty.web.struts.action.orders;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.web.struts.action.LoyautyAction;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class GetOrdersByPOSumit extends LoyautyAction {
	private static final long serialVersionUID = 2352657794009174955L;

	private static OrdersService orderService;
	
	@Getter @Setter
	private Integer sumit;
	
	
	@Getter @Setter
	private List<OrdersDTO> ordersListSumit;
	
	@Getter @Setter
	private OrdersDTO ordersDTO;
	@Getter @Setter
	private String productOrderNumber;
	
	public  GetOrdersByPOSumit() throws ServiceLocatorException {
		super();	
		orderService = getServiceLocator().getOrderService();
		ordersListSumit=new ArrayList<OrdersDTO>();
		ordersDTO=new OrdersDTO();

	}
	/*=========================================================================================
											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		
		System.out.println("I am at GetOrdersByPOSumit Action:Execute Method");

		try {
			ordersDTO.setProductOrderNumber(productOrderNumber);
			ordersListSumit=orderService.getOrdersByProductOrderNumberSumit(ordersDTO);
//			ordersListSumit = orderService.getAllOrders();
			HttpSession session = request.getSession(true);

		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}


}
