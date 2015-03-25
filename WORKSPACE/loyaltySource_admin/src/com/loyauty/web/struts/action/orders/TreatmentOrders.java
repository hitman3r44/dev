package com.loyauty.web.struts.action.orders;

import java.io.File;
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
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class TreatmentOrders  extends LoyautyAction {
	private static final long serialVersionUID = -3811760851445730062L;
	

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
	Long poYpop;
	@Getter @Setter
	Long poXpop;
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
	private Long adminXLSSignal;
	@Getter @Setter
	private Long editOrderSignal;
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
	private Double quantityToChange;
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
	private Date creationDate ;
	@Getter @Setter
	private Long findOrdersSignal;
	@Getter @Setter
	private Long cancelSignal;
	@Getter @Setter
	private Long quantityToChangeSignal;
	@Getter @Setter
	private Long duplicateOrderSignal;
	@Getter @Setter
	private String strCreationDate;
	@Getter @Setter
	private String status;
	@Getter @Setter
	private User usr;
	@Getter @Setter
	private OrdersDTO orderToEdit;
	@Getter @Setter
	private String showOrderDetailPop;
	
	@Getter @Setter
	private String strCreationDateStart;
	@Getter @Setter
	private String strCreationDateEnd;
	
	@Getter @Setter
	private Date creationDateStart;
	@Getter @Setter
	private Date creationDateEnd ;
	private Date creationDateStartArg;
	private Date creationDateEndArg ;
	@Getter @Setter
	private String showSaveSuccessPop="visibility:hidden;display:none;";
	//showSaveSuccessPop="display:block;visibility:visible;";
	//showSaveSuccessPop="visibility:hidden;display:none;";
	@Getter @Setter
	private Integer selectedStatus;
	
	public  TreatmentOrders() throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();   
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
		hashOrders=new Hashtable<String, OrdersDTO>();
	}
	/*=========================================================================================
	 											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession(true);
		showOrderDetailPop="visibility:hidden;display:none;";
		if(poYpop==null)poYpop=100L;
		if(poXpop==null)poXpop=100L;
		if(selectedStatus==null)selectedStatus=-1;
		try {
			usr=new User();
			usr.setNote("Very good");
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

			/*------ always recovery creationDate from strCreationDate ------
						always keep the creation date search options
			  ---------------------------------------------------------------*/
			creationDateStart=null;
			SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
			if (((strCreationDateStart)!=null)&&(!"".equals(strCreationDateStart))){
    			try {
    				Date date = frm.parse(strCreationDateStart);
    				creationDateStart=date;
    				creationDateStartArg=date;
    			}
    			catch (Exception pe) {
    				creationDateStart=null;
    				addActionError("Please enter a date in the correct format");
    			}
    		}
    		if(creationDateStart==null){
				Date date = frm.parse("01/01/1900");
				creationDateStartArg=date;
    		}
    		creationDateEnd=null;
    		if (((strCreationDateEnd)!=null)&&(!"".equals(strCreationDateEnd))){
    			frm = new SimpleDateFormat("dd/MM/yyyy");
    			try {
    				Date date = frm.parse(strCreationDateEnd);
    				creationDateEnd=date;
    				creationDateEndArg=date;
    			}
    			catch (Exception pe) {
    				creationDateEnd=null;
    				addActionError("Please enter a date in the correct format");
    			}
    		}
    		if(creationDateEnd==null){
    			creationDateEndArg=new Date();
    		}

			/*------ always recovery Status from selectedStatus key ------
						always keep the status search options
			  ---------------------------------------------------------------*/
    		switch (selectedStatus) {
				case -1:status="";
					break;
				case 0:status="open";
					break;
				case 1:status="progress";
					break;
				case 2:status="shipped";
					break;
				case 3:status="billed";
					break;
			}
    		
			/*------ When user change Quantity to split in orderDetailPop ----------
						prepare order to split from two other orders witch
				 		one must have a lsOrder with underscore 
	 		 -----------------------------------------------------------------------*/
			if(quantityToChangeSignal!=null && quantityToChangeSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderToChangeQt=listOrdersDTO.get(indexOrder);
				OrdersRows orderRow=orderToChangeQt.getRowsList().get(indexRow);
				if(quantityToChange<orderRow.getQuantity())orderRow.setQuantityToSplit(quantityToChange);
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				orderToEdit=listOrdersDTO.get(indexOrder);
				showOrderDetailPop="display:block;visibility:visible;";
				return SUCCESS;
			}


			/*-------------------- Duplicate Order ----------------------------------------
							Create order in just in memory
	 		 -----------------------------------------------------------------------------*/
			if(duplicateOrderSignal!=null && duplicateOrderSignal!=0L){
			listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
			OrdersDTO orderToClone=listOrdersDTO.get(indexOrder);
			hashOrders=new Hashtable<String, OrdersDTO>();
			for(OrdersDTO ord:listOrdersDTO){
				hashOrders.put(ord.getLsOrderId(), ord);
			}
			OrdersDTO orderClone=DTOFactory.getOrderDTOSplitted(orderToClone);
			if(orderClone!=null){
				String lsOrder=orderClone.getLsOrderId();
				String strlsOrder=orderService.generateLsOrderId(lsOrder, hashOrders);
				orderClone.setLsOrderId(strlsOrder);//rgb(116,180,209)
				orderClone.setCssStyle("background-color:#FFFF99;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;");
				
				orderToEdit=orderClone;
				orderToEdit.setBackgroundColor("background-color:#FFFF99;");
				listOrdersDTO.add(indexOrder+1,orderClone);
				indexOrder=0;
				for(OrdersDTO ord: listOrdersDTO){
					ord.setIndex(indexOrder);
					indexOrder++;
				}
				
				if(listOrdersDTO.size()>0){
					session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				}
				orderService.updateOrderByLsOrderId(orderToClone);
				orderService.insertOrderWithRows(orderClone);			
			}
			showOrderDetailPop="display:block;visibility:visible;";
			return SUCCESS;
			}

			/*----------------- When Admin check on saveTemporaryRow Icon --------------------------
					we must first obtained the object that contains the list of rows,
					after we accede to the row by index recovered by web view and change it
			 ---------------------------------------------------------------------------------------*/
			if(saveTemporaryRowSignal!=null && saveTemporaryRowSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
					frm = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = frm.parse(strProductOrderDate);
	    				orderDTOToUpdate.setProductOrderDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
					frm = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = frm.parse(strRequiredDate);
	    				orderDTOToUpdate.setRequiredDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				OrdersRows orderRowToSaveMemory=orderDTOToUpdate.getRowsList().get(indexRow);
				orderRowToSaveMemory.setIcon("images/orders/itemValidated.png");
				if(orderRowToSaveMemory!=null){
					orderRowToSaveMemory.setQuantity(quantity); 
					orderRowToSaveMemory.setLsProductID(lsProductID);
					orderRowToSaveMemory.setProductDescription(productDescription);
					orderRowToSaveMemory.setUnitPrice(unitPrice);
					orderRowToSaveMemory.setCssPrice("background-color:#FF6666;");
					orderRowToSaveMemory.setCssQuantity("background-color:#FF6666;");
					if(quantity!=null && quantity>0D)orderRowToSaveMemory.setCssQuantity("");
					if(unitPrice!=null && orderRowToSaveMemory.getLsPrice()!=null
					  && unitPrice>=orderRowToSaveMemory.getLsPrice())
					  orderRowToSaveMemory.setCssPrice("");
					orderRowToSaveMemory.setShippingFee(shippingFee);
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
					session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
					listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				}
				orderToEdit=listOrdersDTO.get(indexOrder);
				showOrderDetailPop="display:block;visibility:visible;";
				return SUCCESS;
			}
			
			/*------- When Admin click on addSimilarRow Icon on the OrderDetailPop --------
								Add one Row Similar at the previews
			  -----------------------------------------------------------------------------*/
			if(addSimilarRowSignal!=null && addSimilarRowSignal!=0L){
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				OrdersRows orderRowToClone=orderDTOToUpdate.getRowsList().get(indexRow);
				if(orderRowToClone!=null){
					if(!orderRowToClone.getIcon().equals("images/orders/itemValidated.png")){
						orderRowToClone.setQuantity(quantity); 
						orderRowToClone.setLsProductID(lsProductID);
						orderRowToClone.setStock(stock);
						orderRowToClone.setProductDescription(productDescription);
						orderRowToClone.setUnitPrice(unitPrice);
						orderRowToClone.setShippingFee(shippingFee);
						orderRowToClone.setShippingCompany(shippingCompany);
						orderRowToClone.setTrackingNumber(trackingNumber);
					}
					orderRowToClone.setIcon("images/orders/itemValidated.png");
					OrdersRows orderRowToAdd=DTOFactory.getOrderRowClone(orderRowToClone);
					orderRowToAdd.setId(-1L);
					
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
					session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
					listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				}
				orderToEdit=listOrdersDTO.get(indexOrder);
				showOrderDetailPop="display:block;visibility:visible;";
				return SUCCESS;
			}

			/*-------- When Admin click on Delete Row Icon of orderDetail Popup-----------
									Delete this row using index
			 -----------------------------------------------------------------------------*/
			if(deleteRowSignal!=null && deleteRowSignal!=0L){
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderDTO=listOrdersDTO.get(indexOrder);
				int nb=orderService.nbOrderRowsNotDeleted(orderDTO.getRowsList());
				if(orderDTO!=null && orderDTO.getRowsList().size()>1){
					for(int i=0 ;i<orderDTO.getRowsList().size();i++){
						if(i==indexRow && nb>1){
							orderDTO.getRowsList().get(i).setToDelete(1);
							break;
						}
					}
				}
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				orderToEdit=listOrdersDTO.get(indexOrder);
				showOrderDetailPop="display:block;visibility:visible;";
				return SUCCESS;
			}

			/*--- when Admin click on the cancel Button of orderDetailPop ---
					we mast just hide popup OrderDetail
			  ---------------------------------------------------------------*/
    		if (cancelSignal!=null && cancelSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
    			return SUCCESS;
    		}

			/*------ when Admin click on the lsOrder link in table -----------
					show popup detail and allow admin to update Order
			  ---------------------------------------------------------------*/
    		if (editOrderSignal!=null && editOrderSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
				orderToEdit=listOrdersDTO.get(indexOrder);
				if(orderToEdit==null)orderToEdit=new OrdersDTO();
				if(orderToEdit.getProductOrderDate()==null)strProductOrderDate="";
				showOrderDetailPop="display:block;visibility:visible;";
    			return SUCCESS;
    		}

			/*-------------------- When Admin check left lsProduct TextField -------------
								check userPrice in DB, and write it in web view
			 -----------------------------------------------------------------------------*/
			if(checkProductPriceSignal!=null && checkProductPriceSignal!=0L){
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderDTOToUpdate=listOrdersDTO.get(indexOrder);
				OrdersRows orderRowToUpadate=orderDTOToUpdate.getRowsList().get(indexRow);
				UserProductPriceDTO userProductPrice=productService.getUsrPPriceByLsproductId(userId, lsProductID);
				orderRowToUpadate.setCss("");
				orderRowToUpadate.setCssPrice("");
				if(userProductPrice==null){
					orderRowToUpadate.setCss("background-color:red;");
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
				}
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				orderToEdit=orderDTOToUpdate;
				listOrdersDTO=(List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
				showOrderDetailPop="display:block;visibility:visible;";
				return SUCCESS;
			}

			/*------ when Admin click on the button save of orderDetail ------
					 save order and keep pup showed 
			  ---------------------------------------------------------------*/
    		if (saveOrdersSignal!=null && saveOrdersSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
				orderToEdit=listOrdersDTO.get(indexOrder);
				orderToEdit.setClientLastName(clientLastName);
				orderToEdit.setClientFirstName(clientFirstName);
				orderToEdit.setClientOtherNames(clientOtherNames); 
				orderToEdit.setClientStreet(clientStreet);
				orderToEdit.setClientOtherStreet(clientOtherStreet);
				orderToEdit.setClientCity(clientCity);
				orderToEdit.setClientProvince(clientProvince);
				orderToEdit.setClientProvince(clientProvince);
				orderToEdit.setClientPostalCode(clientPostalCode);
				orderToEdit.setClientPhone(clientPhone);
				orderToEdit.setClientEmail(clientEmail);			
				orderToEdit.setProductOrderNumber(productOrderNumber);
				if (((strProductOrderDate)!=null)&&(!"".equals(strProductOrderDate))){
					frm = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = frm.parse(strProductOrderDate);
	    				orderToEdit.setProductOrderDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				if (((strRequiredDate)!=null)&&(!"".equals(strRequiredDate))){
					frm = new SimpleDateFormat("dd/MM/yyyy");
	    			try {
	    				Date date = frm.parse(strRequiredDate);
	    				orderToEdit.setRequiredDate(date);
	    			}
	    			catch (Exception pe) {
	    				addActionError("Please enter a date in the correct format");
	    			}
	    		}
				
				message="Saving has completed successfuly";
				showSaveSuccessPop="display:block;visibility:visible;";
				orderService.updateOrderByLsOrderId(orderToEdit);
				//orderToEdit=DTOFactory.getOrderDTOConsideredMissingInfo(orderToEdit);
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				showOrderDetailPop="display:block;visibility:visible;";
				
    			return SUCCESS;
    		}
	
			/*------------ When Admin click on icon findOrders.png ----------
								check user and complete infos client
			 ----------------------------------------------------------------*/
			if(findOrdersSignal!=null && findOrdersSignal!=0L){		
				if(lsOrderId==null)lsOrderId="";
				listOrdersDTO=orderService.searchOrdersWithOptions(creationDateStartArg,creationDateEndArg, userLogin, lsOrderId, status);
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				return SUCCESS;
			}

			/*-------------------- When user check print item -----------------------------
					Add or remove this element from the orders to print
	 		 -----------------------------------------------------------------------------*/
			if(checkBoxPrintSignal!=null && checkBoxPrintSignal!=0L){
				listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOTreat");
				OrdersDTO orderDTOInList=listOrdersDTO.get(indexOrder);
				orderDTOInList.setPrint(checkBoxPrint);
				session.setAttribute("listOrdersDTOTreat",listOrdersDTO);
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
	return SUCCESS;
	}
	

}
