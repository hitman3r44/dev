package com.loyauty.web.struts.action.orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class GoToUploadAdminXLS  extends LoyautyAction{
	
	private static final long serialVersionUID = -6645864345341661858L;
	private UserService userService;
	@Getter @Setter
	private int init;
	@Getter @Setter
	private List<User> usersList;
	@Getter @Setter
	List<OrdersDTO>etaFieldNamesList;

	@Getter @Setter
	List<OrdersDTO> secondEtaFieldNamesList;
	
	private static int USER_TYPE = 2;
	
	public GoToUploadAdminXLS()throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		//creationDateStart=today;
		usersList=new ArrayList<User>();
	}
	
	public String execute(){
		
		System.out.println("I am at GoToUploadAdminXLS");
		
		try {
			HttpSession session = request.getSession(true);
			session.setAttribute("init", init);
			session.setAttribute("listProductDTOFormXLS", null);
			etaFieldNamesList=(List<OrdersDTO>)session.getAttribute("etaFieldNamesList");
			if(etaFieldNamesList==null){
				etaFieldNamesList=new ArrayList<OrdersDTO>();
				OrdersDTO ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("product_order_number");
				etaFieldNamesList.add(ordDTO);
				
				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("client_order_number");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("client_other_id");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("client_number");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("ls_order_id");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("cst_product_number");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("client_product_number");
				etaFieldNamesList.add(ordDTO);

				ordDTO=new OrdersDTO();
				ordDTO.setEtaFieldName("ls_product_id");
				etaFieldNamesList.add(ordDTO);

				session.setAttribute("etaFieldNamesList",etaFieldNamesList);
			}
			secondEtaFieldNamesList=(List<OrdersDTO>)session.getAttribute("secondEtaFieldNamesList");
			if(secondEtaFieldNamesList==null){
				secondEtaFieldNamesList=new ArrayList<OrdersDTO>();
				
				/*OrdersDTO ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("");
				secondEtaFieldNamesList.add(ordDTO);*/
				
				OrdersDTO ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("loyalty_source_product_id");
				secondEtaFieldNamesList.add(ordDTO);
				
				ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("model_number");
				secondEtaFieldNamesList.add(ordDTO);
				
				ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("client_first_name");
				secondEtaFieldNamesList.add(ordDTO);
				
				ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("client_last_name");
				secondEtaFieldNamesList.add(ordDTO);
				
				/*ordDTO=new OrdersDTO();
				ordDTO.setSecondEtaFieldName("client_last_name and client_first_name");
				secondEtaFieldNamesList.add(ordDTO);*/
				session.setAttribute("secondEtaFieldNamesList",secondEtaFieldNamesList);
			}
			switch (init) {
			case 1:
				break;
			case 2:
				break;
			case 3:case 4:
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
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}

}
