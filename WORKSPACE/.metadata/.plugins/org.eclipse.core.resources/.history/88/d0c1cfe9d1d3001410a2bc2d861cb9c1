package com.loyauty.web.struts.action.orders;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class GoToOrders extends LoyautyAction {
	private static final long serialVersionUID = 2352657794009174955L;

	private UserService userService;
	private static ProductService productService;
	private static OrdersService orderService;
	private Date today;
	@Getter @Setter
	private List<OrdersDTO>listOrdersDTO;
	@Getter @Setter
	private List<User> usersList;
	@Getter @Setter
	private Long init;
	@Getter @Setter
	private Date creationDate ;
	@Getter @Setter
	private Date creationDateStart ;
	@Getter @Setter
	List<ProvinceDTO>listProvinces;
	@Getter @Setter
	private Integer reportDateBetween;
	@Getter @Setter
	private Integer invoicingDateBetween;
	@Getter @Setter 
	private String  code;

	private static int USER_TYPE = 2;

	public  GoToOrders() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		productService = getServiceLocator().getProductService();
		orderService = getServiceLocator().getOrderService();
		today=new Date();
		usersList=new ArrayList<User>();
		listOrdersDTO=new ArrayList<OrdersDTO>();
	}
	/*=========================================================================================
											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		
		System.out.println("I am at Handeling Page");

		try {
			HttpSession session = request.getSession(true);
			listProvinces=productService.getAllProvinces();
			session.setAttribute("reportDateBetween",0);
			session.setAttribute("invoicingDateBetween",0);
			session.setAttribute("indexSet",0);  
			session.setAttribute("nextListPages",0);
			session.setAttribute("checkBoxItem",false);
			session.setAttribute("invoicedOrdersRefresh",0L);
			new ReportOrders().initalizeListIndexSet(session, orderService);
			session.setAttribute("totalInvoicedOrders",0L);
			session.setAttribute("totalOrders",0L);
			Hashtable<String, ProvinceDTO> hashProvinces=new Hashtable<String, ProvinceDTO>();
			for(ProvinceDTO prov:listProvinces){
				hashProvinces.put(prov.getCode(), prov);
			}
			session.setAttribute("hashProvinces",hashProvinces);
			//------------------ recovery users list ---------------------------
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
			if(usersListSession==null){
				List<UserSessionDTO> listAllUsers= userService.getAllUsers(basicUserDTO);
				for(UserSessionDTO userDTO:listAllUsers){
					User user=new User();
					user.setId(userDTO.getId());
					user.setLogin(userDTO.getLogin());
					usersList.add(user);
				}
				session.setAttribute("usersListSession",usersList);
			}else usersList=usersListSession;
			session.setAttribute("listOrdersDTOMan",null);
			session.setAttribute("listOrdersDTOAuto",null);
			if(init!=null && init!=0){
				int call=Integer.parseInt(init.toString());
				switch (call) {
				case 1:
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					String lsOrderIdFirstPart="Man"+sdf.format(today);
					String manLsOrderId=orderService.generateManLsOrderId(lsOrderIdFirstPart);
					OrdersDTO orderDTO=new OrdersDTO();
					orderDTO.setLsOrderId(manLsOrderId);
					orderDTO.setCssStyle("background-color: color:white;border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
					OrdersRows orderRow=new OrdersRows();
					orderRow.setIcon("images/orders/itemNotValidated.png");
					orderDTO.getRowsList().add(orderRow);
					listOrdersDTO.add(orderDTO);
					session.setAttribute("listOrdersDTOMan",listOrdersDTO);
					break;
				case 2:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}


}
