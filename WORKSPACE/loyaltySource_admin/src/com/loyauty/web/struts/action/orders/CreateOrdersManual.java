package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.CityDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;


public class CreateOrdersManual extends LoyautyAction {
	private static final long serialVersionUID = -1238269595572206024L;

	private UserService userService;
	private ProductService productService;
	private OrdersService orderService;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private Long userId;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private File orderFile;
	@Getter @Setter
	List<OrdersDTO>listOrdersDTO;
	Hashtable<String, OrdersDTO>hashOrders;
	@Getter @Setter
	private String orderSelected;
	@Getter @Setter
	private Long saveOrdersSignal;
	@Getter @Setter
	private Long confirmSaveOrdersSignal;
	@Getter @Setter
	private String lsOrderId;
	@Getter @Setter
	private String message;
	@Getter @Setter
	Integer indexOrder;
	@Getter @Setter
	Integer indexRow;
	@Getter @Setter
	private Long checkBoxPrintSignal;
	@Getter @Setter
	private Boolean checkBoxPrintEtem;
	@Getter @Setter
	private Boolean checkBoxPrint;
	@Getter @Setter
	private Long pageTop=0L;
	@Getter @Setter
	private Long saved;
	@Getter @Setter
	private String showNotificationPop="visibility:hidden;display:none;";
	@Getter @Setter
	private Long addOrderSignal;
	@Getter @Setter
	private Long addSimilarOrderSignal;
	@Getter @Setter
	private Long deleteOrderSignal;
	@Getter @Setter
	private Long deleteRowSignal;
	@Getter @Setter
	private Long userLoginChangedSignal;
	@Getter @Setter
	private Long saveTemporarySignal;
	@Getter @Setter
	private Long addSimilarRowSignal;
	@Getter @Setter
	private Long saveTemporaryRowSignal;
	@Getter @Setter
	private Long checkProductPriceSignal;
	@Getter @Setter
	private Long userIdFindedSignal;
	@Getter @Setter
	private String userLogo;
	//recovery Data Order
	@Getter @Setter
	private String clientLastName;
	@Getter @Setter
	private String clientFirstName;
	@Getter @Setter
	private String clientOtherNames;
	@Getter @Setter
	private String clientStreet;
	@Getter @Setter
	private String  clientOtherStreet;
	@Getter @Setter
	private String  clientCity;
	@Getter @Setter
	private String  clientProvince;
	@Getter @Setter
	private String  clientPostalCode;
	@Getter @Setter
	private String  clientPhone;
	@Getter @Setter
	private String  clientEmail;
	@Getter @Setter
	private String productOrderNumber;
	@Getter @Setter
	private String strProductOrderDate;
	@Getter @Setter
	private String strRequiredDate;
	
	//recovery data row
	@Getter @Setter
	private Double quantity ;
	@Getter @Setter
	private String lsProductID;
	@Getter @Setter
	private Double stock;
	@Getter @Setter
	private String productDescription;
	@Getter @Setter
	private Double unitPrice;
	@Getter @Setter
	private Double shippingFee;
	@Getter @Setter
	private String shippingCompany;
	@Getter @Setter
	private String trackingNumber;
	@Getter @Setter
	private String strCreationOrderDate;
	@Getter @Setter
	private Date creationOrderDate; 
	@Getter @Setter
	private String showSaveSuccessPop="visibility:hidden;display:none;";
	//showSaveSuccessPop="display:block;visibility:visible;";
	//showSaveSuccessPop="visibility:hidden;display:none;";
	@Getter @Setter
	private Long okSaveSuccessPopSignal;
	@Getter @Setter
	private Long requirdFieldError;
	@Getter @Setter
	private Long newLsOrderIdSignal;
	@Getter @Setter
	private List<ProvinceDTO>listProvinces;
	@Getter @Setter 
	private String  code;
	//@Getter @Setter
	//private List<CityDTO>listCities;
	private Hashtable<String, ProvinceDTO>hashProvinces;
	//private Hashtable<String, CityDTO>hashCities;
	//@Getter @Setter
	//private Long provinceChangedSignal;
	private Date today ;
	
	@Getter @Setter
	private Long currencyAlertPopSignal;
	
	@Getter @Setter
	private String currencySymbol;
	
	public  CreateOrdersManual() throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();   
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
		hashOrders=new Hashtable<String, OrdersDTO>();
		//listProvinces=new ArrayList<ProvinceDTO>();
		today=new Date();
	}

	/*=========================================================================================
	 											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession(true);
		OrdersDTO orderDTOToAdd;
		userLogo=(String)session.getAttribute("userLogo");
		requirdFieldError=(Long)session.getAttribute("requirdFieldError");
		SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat frmForLsOrderId = new SimpleDateFormat("yyyyMMdd");
		OrdersDTO orderDTOToUpdate;
		String initalClient="";
		try {
			//recovery provinces
			listProvinces=(List<ProvinceDTO>)session.getAttribute("listProvinces");
			if(listProvinces==null){
				listProvinces=productService.getAllProvinces();
				session.setAttribute("listProvinces",listProvinces);
			}
			if (((strCreationOrderDate)!=null)&&(!"".equals(strCreationOrderDate))){
				try {
					creationOrderDate = frm.parse(strCreationOrderDate);
				}
				catch (Exception pe) {
					addActionError("Please enter a date in the correct format");
				}
			}
			/*-------------------- recovery users list -----------------------------------
							Recovery users list in session
			 -----------------------------------------------------------------------------*/
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
			if(usersListSession==null){
				List<UserSessionDTO> listAllUsers= userService.getAllUsers(basicUserDTO);
				usersList=new ArrayList<User>();
				for(UserSessionDTO userDTO:listAllUsers){
					User user=new User();
					user.setId(userDTO.getId());
					user.setLogin(userDTO.getLogin());
					usersList.add(user);
				}
				session.setAttribute("usersListSession",usersList);
			}else usersList=usersListSession;


			/*-------------------- recovery orders list ------------------------------------
						displaying at least one item in the orders list if it is empty
			  -----------------------------------------------------------------------------*/
			
			if(userIdFindedSignal==null || userIdFindedSignal==0L){
				userId=(Long)session.getAttribute("userId");
				if(userId!=null){
					UserDTO userFind=userService.getUserInformation(userId);
					userLogin=userFind.getLogin();
				}
			}
			
			listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOMan");
			if(listOrdersDTO==null)listOrdersDTO =new ArrayList<OrdersDTO>();
			if(listOrdersDTO.size()==0){
				//String lsOrderIdFirstPart="Man"+frm.format(today);
				if(userLogin!=null && userLogin.length()>=2){
					initalClient=userLogin.substring(0, 2);
					initalClient=initalClient.toUpperCase();
				}
				
				String lsOrderIdFirstPart=initalClient+"M"+frmForLsOrderId.format(today);
				String manLsOrderId=orderService.generateManLsOrderId(lsOrderIdFirstPart);
				OrdersDTO orderDTO=new OrdersDTO();
				orderDTO.setLsOrderId(manLsOrderId);
				orderDTO.setCssStyle("background-color: color:white;border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
				OrdersRows orderRow=new OrdersRows();
				orderRow.setIcon("images/orders/itemNotValidated.png");
				orderDTO.getRowsList().add(orderRow);
				listOrdersDTO.add(orderDTO);
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
			}else{
				if(userLogin!=null && userLogin.length()>=2){
					initalClient=userLogin.substring(0, 2);
					initalClient=initalClient.toUpperCase();
				}
				String lsOrderIdFirstPart=initalClient+"M"+frmForLsOrderId.format(today);
				String manLsOrderId=orderService.generateManLsOrderId(lsOrderIdFirstPart);
				OrdersDTO ordDTO=listOrdersDTO.get(0);
				ordDTO.setLsOrderId(manLsOrderId);
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				
			}

			/*----------------- When Admin change province -----------------------------------------
								Check a list off this province
			 ---------------------------------------------------------------------------------------*/
			//if(provinceChangedSignal!=null && provinceChangedSignal!=0L){
				hashProvinces=(Hashtable<String, ProvinceDTO>)session.getAttribute("hashProvinces");
				if(code!=null && !code.equals("")){
					ProvinceDTO provinceDTO=hashProvinces.get(code);
					if(provinceDTO!=null){
						clientProvince=provinceDTO.getCode();
						//listCities=provinceDTO.getListCities();
					}
				}//else listCities=new ArrayList<CityDTO>();
				orderDTOToUpdate=listOrdersDTO.get(0);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				orderDTOToUpdate.setClientCity(clientCity);
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				//return SUCCESS;
			//}

			/*-------------------- When Admin Find User Login ---------------------------
						change all value of userid list of orders
			 -----------------------------------------------------------------------------*/
			if(userIdFindedSignal!=null && userIdFindedSignal!=0L){
				User user=userService.getUserByLogin(userLogin);
				OrdersDTO orderDTO=listOrdersDTO.get(0);
				orderDTO=fillDataOrderDTO(orderDTO);
				userLogo=null;
				userId=null;
				if(user!=null){
					orderDTO.setUserId(user.getId());
					userId=user.getId();
					currencySymbol = "CAD";
					CurrencyDTO currencyDTO = orderService.getCurrencyIdByUserId(userId);
					if(currencyDTO!=null && currencyDTO.getId()!=1) {
						currencyAlertPopSignal = 1L;
						if(currencyDTO.getSymbol()!=null) currencySymbol = currencyDTO.getSymbol();
					} else currencyAlertPopSignal=0L;
					for(OrdersDTO ord:listOrdersDTO){
						ord.setUserId(user.getId());
						ord.setUserLogin(userLogin);
					}
	    			//show user logo
	    			userLogo="./images/orders/usersLogos/"+userLogin+".png";
				}else userLogin=null;

				String filePath = session.getServletContext().getRealPath("/");
				//String LogoDestination = filePath + "images/orders/usersLogos/"+userLogin+".png";
				//File f=new File(LogoDestination);
				//if(!f.exists())userId=null;

    			//if userLogo dosn't exist give him a blank logo
    			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");
    			
    			session.setAttribute("userLogo",userLogo);
				session.setAttribute("userId",userId);
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				return SUCCESS;
			}
			if(userId==null)userLogin="";

			/*----------------- When Admin change province -----------------------------------------
								Check a list off this province
			 ---------------------------------------------------------------------------------------*/
			/*if(provinceChangedSignal!=null && provinceChangedSignal!=0L){
				hashProvinces=(Hashtable<String, ProvinceDTO>)session.getAttribute("hashProvinces");
				if(code!=null){
					listCities=hashProvinces.get(code).getListCities();
				}else listCities=new ArrayList<CityDTO>();
				orderDTOToUpdate=listOrdersDTO.get(0);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				//orderDTOToUpdate.setClientCity(clientCity)
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				//return SUCCESS;
			//}*/
			
			/*----------------- When Admin check on Add Similar order Icon or save Temporary -------
									Create a copy of order selected
			 ---------------------------------------------------------------------------------------*/
			if(((addSimilarOrderSignal!=null && addSimilarOrderSignal!=0L)||(saveTemporarySignal!=null && saveTemporarySignal!=0L)) && indexOrder>=0){
				orderDTOToAdd=listOrdersDTO.get(indexOrder);
				if(orderDTOToAdd==null)orderDTOToAdd=new OrdersDTO();
				if((saveTemporarySignal!=null && saveTemporarySignal!=0L))orderDTOToAdd.setLsOrderId(lsOrderId);
				orderDTOToAdd.setCreationDate(creationOrderDate); 
				orderDTOToAdd.setClientLastName(clientLastName);
				orderDTOToAdd.setClientFirstName(clientFirstName);
				orderDTOToAdd.setClientOtherNames(clientOtherNames); 
				orderDTOToAdd.setClientStreet(clientStreet);
				orderDTOToAdd.setClientOtherStreet(clientOtherStreet);
				orderDTOToAdd.setClientCity(clientCity);
				orderDTOToAdd.setClientProvince(clientProvince);
				orderDTOToAdd.setClientProvince(clientProvince);
				orderDTOToAdd.setClientPostalCode(clientPostalCode);
				orderDTOToAdd.setClientPhone(clientPhone);
				orderDTOToAdd.setClientEmail(clientEmail);			
				orderDTOToAdd.setProductOrderNumber(productOrderNumber);
				if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strProductOrderDate);
	    				orderDTOToAdd.setProductOrderDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strRequiredDate);
	    				orderDTOToAdd.setRequiredDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				User user=userService.getUserByLogin(userLogin);
				if(user!=null){
					UserDTO userDTO=userService.getUserInformation(user.getId());
					orderDTOToAdd.setUserLogin(userLogin);
					orderDTOToAdd.setUserId(userDTO.getId());
				}
				if(addSimilarOrderSignal!=null && addSimilarOrderSignal!=0L){ 
					OrdersDTO orderDTOClone = DTOFactory.getOrderDTOClone(orderDTOToAdd);
					orderDTOClone.setCssStyle("background-color:white;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;");
					listOrdersDTO.add(orderDTOClone);
				}
				int indexOrder=0;
				for(OrdersDTO orderDTO:listOrdersDTO){
					orderDTO.setIndex(indexOrder);
					indexOrder++;
				}
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				return SUCCESS;
			}
			
			/*----------------- When Admin click on saveTemporaryRow Icon --------------------------
					we must first obtained the object that contains the list of rows,
					after we accede to the row by index recovered by web view and change it
			 ---------------------------------------------------------------------------------------*/
			if(saveTemporaryRowSignal!=null && saveTemporaryRowSignal!=0L){
				
				orderDTOToUpdate=listOrdersDTO.get(0);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				/*
				orderDTOToUpdate.setProductOrderNumber(productOrderNumber);
				orderDTOToUpdate.setCreationDate(creationOrderDate);
				orderDTOToUpdate.setClientLastName(clientLastName);
				orderDTOToUpdate.setClientFirstName(clientFirstName);
				orderDTOToUpdate.setClientOtherNames(clientOtherNames); 
				orderDTOToUpdate.setClientStreet(clientStreet);
				orderDTOToUpdate.setClientOtherStreet(clientOtherStreet);
				orderDTOToUpdate.setClientCity(clientCity);
				orderDTOToUpdate.setClientProvince(clientProvince);
				orderDTOToUpdate.setClientProvince(clientProvince);
				orderDTOToUpdate.setClientPostalCode(clientPostalCode);
				orderDTOToUpdate.setClientPhone(clientPhone);
				orderDTOToUpdate.setClientEmail(clientEmail);			
				orderDTOToUpdate.setProductOrderNumber(productOrderNumber);

				if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strProductOrderDate);
	    				orderDTOToUpdate.setProductOrderDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strRequiredDate);
	    				orderDTOToUpdate.setRequiredDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				*/
				OrdersRows orderRowToSaveMemory=orderDTOToUpdate.getRowsList().get(indexRow);
				orderRowToSaveMemory.setIcon("images/orders/itemValidated.png");
				if(orderRowToSaveMemory!=null){
					orderRowToSaveMemory.setQuantity(quantity); 
					orderRowToSaveMemory.setLsProductID(lsProductID);
					orderRowToSaveMemory.setProductDescription(productDescription);
					orderRowToSaveMemory.setUnitPrice(unitPrice);
					orderRowToSaveMemory.setCssPrice("background-color:red;");
					if(unitPrice!=null && orderRowToSaveMemory.getLsPrice()!=null
					  && unitPrice>=orderRowToSaveMemory.getLsPrice())
					  orderRowToSaveMemory.setCssPrice("");
					orderRowToSaveMemory.setShippingFee(shippingFee);
					orderRowToSaveMemory.setShippingPrice(shippingFee);
					orderRowToSaveMemory.setShippingCompany(shippingCompany);
					orderRowToSaveMemory.setTrackingNumber(trackingNumber);	
					int indexOrder=0;
					int indexRow=0;
					for(OrdersDTO orderDTO:listOrdersDTO){
						orderDTO.setIndex(indexOrder);
						indexOrder++;
						indexRow=0;
						for(OrdersRows orderRows:orderDTO.getRowsList()){
							orderRows.setIndex(indexRow);
							indexRow++;
						}
					}
					session.setAttribute("listOrdersDTOMan",listOrdersDTO);
					listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOMan");
				}

				return SUCCESS;
			}
			
			/*-------------------- When Admin click on addSimilarRow Icon -----------------
										Add one Row Similar at the previews
			  -----------------------------------------------------------------------------*/
			if(addSimilarRowSignal!=null && addSimilarRowSignal!=0L){
				orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				OrdersRows orderRowToClone=orderDTOToUpdate.getRowsList().get(indexRow);
				if(orderRowToClone!=null){
					if(!orderRowToClone.getIcon().equals("images/orders/itemValidated.png")){
						orderRowToClone.setQuantity(quantity); 
						orderRowToClone.setLsProductID(lsProductID);
						orderRowToClone.setStock(stock);
						orderRowToClone.setProductDescription(productDescription);
						orderRowToClone.setUnitPrice(unitPrice);
						orderRowToClone.setShippingFee(shippingFee);
						orderRowToClone.setShippingPrice(shippingFee);
						orderRowToClone.setShippingCompany(shippingCompany);
						orderRowToClone.setTrackingNumber(trackingNumber);
					}
					orderRowToClone.setIcon("images/orders/itemValidated.png");
					OrdersRows orderRowToAdd=DTOFactory.getOrderRowClone(orderRowToClone);
					orderDTOToUpdate.getRowsList().add(indexRow+1,orderRowToAdd);
					int indexOrder=0;
					int indexRow=0;
					for(OrdersDTO orderDTO:listOrdersDTO){
						orderDTO.setIndex(indexOrder);
						indexOrder++;
						indexRow=0;
						for(OrdersRows orderRows:orderDTO.getRowsList()){
							orderRows.setIndex(indexRow);
							indexRow++;
						}
					}
					session.setAttribute("listOrdersDTOMan",listOrdersDTO);
					listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOMan");
				}
				return SUCCESS;
			}

			/*-------------------- When Admin click on Delete order Icon -------------
									Delete this order using index
			 -----------------------------------------------------------------------------*/
			
			if(deleteOrderSignal!=null && deleteOrderSignal!=0L){
				orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				List<OrdersDTO> listOrdersDTOAfterDelete=new ArrayList<OrdersDTO>();
				for(int i=0 ;i<listOrdersDTO.size();i++){
					if(i!=indexOrder || indexOrder==0)listOrdersDTOAfterDelete.add(listOrdersDTO.get(i));
				}
				int index=0;
				for(int i=0 ;i<listOrdersDTOAfterDelete.size();i++){
					listOrdersDTOAfterDelete.get(i).setIndex(index);
					index++;
				}
				session.setAttribute("listOrdersDTOMan",listOrdersDTOAfterDelete);
				listOrdersDTO=listOrdersDTOAfterDelete;
				return SUCCESS;
			}

			/*-------------------- When Admin check on Delete Row Icon -------------------
									Delete this row using index
			 -----------------------------------------------------------------------------*/
			if(deleteRowSignal!=null && deleteRowSignal!=0L){
				ArrayList<OrdersRows>listRowsAfterDelete=new ArrayList<OrdersRows>();
				OrdersDTO orderDTO=listOrdersDTO.get(indexOrder);
				orderDTO=fillDataOrderDTO(orderDTO);
				if(orderDTO!=null && orderDTO.getRowsList().size()>1){
					for(int i=0 ;i<orderDTO.getRowsList().size();i++){
						if(i!=indexRow)listRowsAfterDelete.add(orderDTO.getRowsList().get(i));
					}
					int index=0;
					for(int i=0 ;i<listRowsAfterDelete.size();i++){
						listRowsAfterDelete.get(i).setIndex(index);
						index++;
					}
					orderDTO.setRowsList(listRowsAfterDelete);
				}
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				return SUCCESS;
			}
			

			/*-------------------- When Admin check left lsProduct TextField -------------
								check userPrice in DB, and write it in web view
			 -----------------------------------------------------------------------------*/
			if(checkProductPriceSignal!=null && checkProductPriceSignal!=0L){
				orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				orderDTOToUpdate=fillDataOrderDTO(orderDTOToUpdate);
				/*
				orderDTOToUpdate.setClientLastName(clientLastName);
				orderDTOToUpdate.setClientFirstName(clientFirstName);
				orderDTOToUpdate.setClientOtherNames(clientOtherNames); 
				orderDTOToUpdate.setClientStreet(clientStreet);
				orderDTOToUpdate.setClientOtherStreet(clientOtherStreet);
				orderDTOToUpdate.setClientCity(clientCity);
				orderDTOToUpdate.setClientProvince(clientProvince);
				orderDTOToUpdate.setClientProvince(clientProvince);
				orderDTOToUpdate.setClientPostalCode(clientPostalCode);
				orderDTOToUpdate.setClientPhone(clientPhone);
				orderDTOToUpdate.setClientEmail(clientEmail);			
				orderDTOToUpdate.setProductOrderNumber(productOrderNumber);
				if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strProductOrderDate);
	    				orderDTOToUpdate.setProductOrderDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
	    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = sdf.parse(strRequiredDate);
	    				orderDTOToUpdate.setRequiredDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				*/
				OrdersRows orderRowToUpadate=orderDTOToUpdate.getRowsList().get(indexRow);
				UserProductPriceDTO userProductPrice=productService.getUsrPPriceByLsproductId(userId, lsProductID);
				orderRowToUpadate.setCss("");
				orderRowToUpadate.setCssPrice("");
				if(userProductPrice==null){
					lsProductID=null;
					orderRowToUpadate.setCss("background-color:red;");
					addActionError(getText("loyauty.error.common.requiredLsProductOrder"));
					orderRowToUpadate.setProductDescription(""); 
					orderRowToUpadate.setStock(null);
					orderRowToUpadate.setProductId(null);
					orderRowToUpadate.setLsProductID(lsProductID);
					orderRowToUpadate.setLsPrice(null);
				}else{
					Double usrPrice=orderRowToUpadate.getUnitPrice();
					if(usrPrice==null)usrPrice=0D;
					if(usrPrice < userProductPrice.getPriceNum()){
						orderRowToUpadate.setCssPrice("background-color:red;");	
					}
					orderRowToUpadate.setProductDescription(userProductPrice.getProductTitle());
					orderRowToUpadate.setStock(userProductPrice.getStock());
					orderRowToUpadate.setProductId(userProductPrice.getProductId());
					orderRowToUpadate.setLsProductID(userProductPrice.getLsProductId());
					orderRowToUpadate.setLsPrice(userProductPrice.getPriceNum());
					if(userProductPrice.getUserId()!=null) {
						//currency
						Long userId = userProductPrice.getUserId();
						Long currencyId = 1L;
						Double currencyRate = 1D;
						Double currencyPrice = 0D;
						CurrencyDTO currencyDTO = orderService.getCurrencyIdByUserId(userId);
						if(currencyDTO!=null && currencyDTO.getRate()!=null) {
							currencyId = currencyDTO.getId();
							if(currencyId!=1) {
								currencyRate = currencyDTO.getRate();
								currencyPrice = (double) Math.round((orderRowToUpadate.getLsPrice()*currencyRate)*100) / 100;
								orderRowToUpadate.setLsPrice(currencyPrice);
							}
						}
					}
				}
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOMan");
				return SUCCESS;
			}
			
			/*-------------------------------- SAVE ORDERS -------------------------------
						save in data bases just orders witch has print checked 
	 		 -----------------------------------------------------------------------------*/
			if(saveOrdersSignal!=null && saveOrdersSignal!=0L){
				listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOMan");
				User user=userService.getUserByLogin(userLogin);
				OrdersDTO order=listOrdersDTO.get(0);
				order.setManOrder(true);
				order=fillDataOrderDTO(order);
				if(user!=null)order.setUserId(user.getId());
				boolean productNotFond=false;
				for(OrdersRows row:order.getRowsList()){
					if(row.getLsProductID()==null || row.getLsProductID().equals("")){
						productNotFond=true;
						break;
					}
				}
				requirdFieldError=null;
				session.setAttribute("requirdFieldError",null);
				productOrderNumber=order.getProductOrderNumber().replaceAll("^ +| +$|( )+", "$1");
				clientFirstName=order.getClientFirstName().replaceAll("^ +| +$|( )+", "$1");
				clientLastName=order.getClientLastName().replaceAll("^ +| +$|( )+", "$1");
				clientStreet=order.getClientStreet().replaceAll("^ +| +$|( )+", "$1");
				clientCity=order.getClientCity().replaceAll("^ +| +$|( )+", "$1");
				clientProvince=order.getClientProvince().replaceAll("^ +| +$|( )+", "$1");
				clientPostalCode=order.getClientPostalCode().replaceAll("^ +| +$|( )+", "$1");
				
				order.setProductOrderNumber(productOrderNumber);
				order.setClientFirstName(clientFirstName);
				order.setClientLastName(clientLastName);
				order.setClientStreet(clientStreet);
				order.setClientCity(clientCity);
				order.setClientProvince(clientProvince);
				order.setClientPostalCode(clientPostalCode);
				
				if(order.getProductOrderNumber()==null || order.getProductOrderNumber().equals("")||
						   order.getLsOrderId()==null || order.getLsOrderId().equals("") ||
						   order.getCreationDate()==null || productNotFond ||
						   order.getClientFirstName()==null || order.getClientFirstName().equals("")||
						   order.getClientLastName()==null || order.getClientLastName().equals("") ||
						   order.getClientStreet()==null || order.getClientStreet().equals("") ||
						   order.getClientCity()==null || order.getClientCity().equals("") || 
						   order.getClientProvince()==null || order.getClientProvince().equals("") ||
						   order.getClientPostalCode()==null || order.getClientPostalCode().equals("")){
					session.setAttribute("listOrdersDTOMan",listOrdersDTO);
					addActionError(getText("loyauty.error.common.requiredFieldOrders"));
					requirdFieldError=1L;
					session.setAttribute("requirdFieldError",1L);
					return SUCCESS;
				}
				
				for(OrdersRows row:order.getRowsList()){
					if(row.getLsProductID()==null || row.getLsProductID().equals("")||
					   row.getQuantity()==null || row.getQuantity()==0D){
						requirdFieldError=1L;
					   session.setAttribute("requirdFieldError",1L);
					   addActionError(getText("loyauty.error.common.requiredFieldOrders"));
					   return SUCCESS;
					}
				}
				//add special handling shipping	+ currency
				for(OrdersDTO orDTO:listOrdersDTO){
					if(user!=null){
						//currency
						Long userId = user.getId();
						Long currencyId = 1L;
						String currencySymbol = "CAD";
						Double currencyRate = 1D;
						Double currencyUnitPrice = 0D;
						Double currencyTotalPrice = null;
						//Double currencyShippingPrice = null;
						Double unitPrice = null;
						CurrencyDTO currencyDTO = orderService.getCurrencyIdByUserId(userId);
						if(currencyDTO!=null) {
							currencyId = currencyDTO.getId();
							if(currencyDTO.getSymbol()!=null) currencySymbol = currencyDTO.getSymbol();
							if(currencyDTO.getRate()!=null) currencyRate = currencyDTO.getRate();
						}
						
						Double totalPrice=null;
						orDTO.setSpecialHandlingName(user.getSpecialHandlingName());
						orDTO.setSpecialHandlingFee(user.getSpecialHandlingFee());
						if(orDTO.getRowsList().get(0).getQuantity()!=null && orDTO.getRowsList().get(0).getUnitPrice()!=null){
							unitPrice = orDTO.getRowsList().get(0).getUnitPrice();
							totalPrice= orDTO.getRowsList().get(0).getQuantity()*unitPrice;
							totalPrice = (double) Math.round(totalPrice * 100) / 100;
							if(currencyId!=1) {
								currencyUnitPrice = unitPrice;
								unitPrice = (double) Math.round((unitPrice/currencyRate)*100) / 100;
								orDTO.setUnitPrice(unitPrice);
								orDTO.getRowsList().get(0).setUnitPrice(unitPrice);
								currencyTotalPrice = totalPrice;
								totalPrice = (double) Math.round((totalPrice/currencyRate)*100) / 100;
								/*
								if(orDTO.getRowsList().get(0).getShippingPrice()!=null) {
									currencyShippingPrice = orDTO.getRowsList().get(0).getShippingPrice();
									Double shippingPrice = (double) Math.round((currencyShippingPrice/currencyRate)*100) / 100;
									orDTO.setShippingPrice(shippingPrice);
									orDTO.setShippingFee(shippingPrice);
									orDTO.setCurrencyShippingPrice(currencyShippingPrice);
									orDTO.getRowsList().get(0).setShippingPrice(shippingPrice);
									orDTO.getRowsList().get(0).setShippingFee(shippingPrice);
									orDTO.getRowsList().get(0).setCurrencyShippingPrice(currencyShippingPrice);
								}
								*/
							}
						}
						orDTO.setTotalPrice(totalPrice);
						orDTO.setCurrencyId(currencyId);
						orDTO.setCurrencySymbol(currencySymbol);
						orDTO.setCurrencyRate(currencyRate);
						orDTO.setCurrencyUnitPrice(currencyUnitPrice);
						orDTO.setCurrencyTotalPrice(currencyTotalPrice);
						
						for(OrdersRows row: orDTO.getRowsList()){
							row.setCurrencyId(currencyId);
							row.setCurrencySymbol(currencySymbol);
							row.setCurrencyRate(currencyRate);
							row.setCurrencyUnitPrice(currencyUnitPrice);
						}
					}	
				}
				listOrdersDTO=orderService.insertListOrders(listOrdersDTO);
				listOrdersDTO=new ArrayList<OrdersDTO>();
				if(listOrdersDTO.size()==0){
					frm = new SimpleDateFormat("yyyyMMdd");
					if(userLogin!=null && userLogin.length()>=2){
						initalClient=userLogin.substring(0, 2);
						initalClient=initalClient.toUpperCase();
					}
					//String lsOrderIdFirstPart="Man"+frm.format(today);
					String lsOrderIdFirstPart=initalClient+"M"+frmForLsOrderId.format(today);
					String manLsOrderId=orderService.generateManLsOrderId(lsOrderIdFirstPart);
					OrdersDTO orderDTO=new OrdersDTO();
					//recovery userId
					if(user!=null)orderDTO.setUserId(user.getId());
					orderDTO.setLsOrderId(manLsOrderId);
					orderDTO.setCssStyle("background-color: color:white;border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
					OrdersRows orderRow=new OrdersRows();
					orderRow.setIcon("images/orders/itemNotValidated.png");
					orderDTO.getRowsList().add(orderRow);
					listOrdersDTO.add(orderDTO);
					session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				}
				message="Saving has completed successfuly";
				showSaveSuccessPop="display:block;visibility:visible;";
				return SUCCESS;
			}

			/*-------------------- When user check print item -----------------------------
					Add or remove this element from the orders to print
	 		 -----------------------------------------------------------------------------*/
			if(checkBoxPrintSignal!=null && checkBoxPrintSignal!=0L){
				listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOMan");
				OrdersDTO orderDTOInList=listOrdersDTO.get(indexOrder);
				orderDTOInList=fillDataOrderDTO(orderDTOInList);
				orderDTOInList.setPrint(checkBoxPrint);
				session.setAttribute("listOrdersDTOMan",listOrdersDTO);
				return SUCCESS;
			}


			/*-------------- When user click on the button OK of showSaveSuccessPop -------
						just hide dialogue popup: showSaveSuccessPop
	 		 ------------------------------------------------------------------------------*/
			if(okSaveSuccessPopSignal!=null && okSaveSuccessPopSignal!=0L){
				listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOMan");
				showSaveSuccessPop="visibility:hidden;display:none;";
				return SUCCESS;
			}



			/*-------------- When user click on the image imgNewLsOrderId -----------------
								generate other LsOrderId
	 		 ------------------------------------------------------------------------------*/
			if(newLsOrderIdSignal!=null && newLsOrderIdSignal!=0L){
				listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOMan");
				OrdersDTO orderDTO=listOrdersDTO.get(0);
				frm = new SimpleDateFormat("yyyyMMdd");
				if(userLogin!=null && userLogin.length()>=2){
					initalClient=userLogin.substring(0, 2);
					initalClient=initalClient.toUpperCase();
				}
				//String lsOrderIdFirstPart="Man"+frm.format(today);
				String lsOrderIdFirstPart=initalClient+"M"+frmForLsOrderId.format(today);
				String manLsOrderId=orderService.generateManLsOrderId(lsOrderIdFirstPart);
				orderDTO.setLsOrderId(manLsOrderId);
				return SUCCESS;
			}

		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.userNotSelected"));
			e.printStackTrace();
			return "input";
		}
	return SUCCESS;
	}
	

	   /*=========================================================================================
								fill all fields of order without rows
		 =========================================================================================*/
		public OrdersDTO fillDataOrderDTO(OrdersDTO orderDTO){
			SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
			//orderToEdit=listOrdersDTO.get(indexOrder);
			orderDTO.setClientLastName(clientLastName);
			orderDTO.setClientFirstName(clientFirstName);
			orderDTO.setClientOtherNames(clientOtherNames); 
			orderDTO.setClientStreet(clientStreet);
			orderDTO.setClientOtherStreet(clientOtherStreet);
			orderDTO.setClientCity(clientCity);
			orderDTO.setClientProvince(clientProvince);
			orderDTO.setClientProvince(clientProvince);
			orderDTO.setClientPostalCode(clientPostalCode);
			orderDTO.setClientPhone(clientPhone);
			orderDTO.setClientEmail(clientEmail);			
			orderDTO.setProductOrderNumber(productOrderNumber);
			
			
			if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
				frm = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = frm.parse(strProductOrderDate);
					orderDTO.setProductOrderDate(date);
				}
				catch (Exception pe) {
					addActionError("Please enter a date in the correct format");
				}
			}
			
			if (((strCreationOrderDate)!=null)&&(!"".equals(strCreationOrderDate))){
				frm = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = frm.parse(strCreationOrderDate);
					orderDTO.setCreationDate(date);
				}
				catch (Exception pe) {
					addActionError("Please enter a date in the correct format");
				}
			}
			
			if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
				frm = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = frm.parse(strRequiredDate);
					orderDTO.setRequiredDate(date);
				}
				catch (Exception pe) {
					addActionError("Please enter a date in the correct format");
				}
			}
			return orderDTO;
		}


		/*=========================  createUserLogo ===========================
		 				Create  Blank User Logo if not Exist
		  =================================================================*/
		public void createUserLogo(String source, String destination) throws IOException{
			File fileLogo=new File(destination);
			if(!fileLogo.exists()){
				InputStream in = new FileInputStream(source);
				OutputStream out = new FileOutputStream(destination);
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				in.close();
				out.close();	
			}
		}
}
