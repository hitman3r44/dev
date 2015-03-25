package com.loyauty.web.struts.action.orders;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class InvoicedOrders  extends LoyautyAction {
	private static final long serialVersionUID = -3811760851445730062L;
	private UserService userService;
	private OrdersService orderService;
	private ProductService productService;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	List<OrdersDTO>listOrdersDTO;
	@Getter @Setter
	List<OrdersDTO>listStatus;
	@Getter @Setter
	private String lsOrderId;
	@Getter @Setter
	Long poYpop;
	@Getter @Setter
	Long poXpop;
	@Getter @Setter
	private Long pageTop=0L;
	@Getter @Setter
	private Date creationDate ;
	@Getter @Setter
	private Long findOrdersSignal;
	private String status;
	@Getter @Setter
	private Long sizeResult=0L;
	@Getter @Setter
	private Long sorting;
	@Getter @Setter
	private Long sortingOrdersSignal;
	@Getter @Setter
	private Integer fieldForSorting;
	@Getter @Setter
	private Integer asc;
	@Getter @Setter
	private Integer scrollDivRowsLeft;
	@Getter @Setter
	private Integer scrollPageLeft;
	@Getter @Setter
	private Integer scrollDivRowsTop;
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
	private Integer selectedStatus;
	@Getter @Setter
	private Long editOrderSignal;
	@Getter @Setter
	private Long cancelSignal;
	@Getter @Setter
	private Integer indexOrder;
	@Getter @Setter
	private OrdersDTO orderToEdit;
	@Getter @Setter
	private String strProductOrderDate;
	@Getter @Setter
	private String lsProductID;
	@Getter @Setter
	Integer indexRow;
	@Getter @Setter
	private String showOrderDetailPop;
	@Getter @Setter
	private Long userId;
	@Getter @Setter
	private Long checkProductPriceSignal;
	@Getter @Setter
	private Long saveTemporaryRowSignal;
	@Getter @Setter
	private Long addSimilarRowSignal;
	@Getter @Setter
	private Long deleteRowSignal;
	@Getter @Setter
	private Long saveOrdersSignal;
	@Getter @Setter
	private Long checkBoxPrintSignal;
	@Getter @Setter
	private Boolean checkBoxPrint;

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
	private String strRequiredDate;

	@Getter @Setter
	private String specialHandlingName;
	@Getter @Setter
	private Double specialHandlingFee;
	@Getter @Setter
	private Double totalPrice;

	//recovery data row
	@Getter @Setter
	private Double quantity ;
	@Getter @Setter
	private String notes;
	@Getter @Setter
	private Double quantityToChange;
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
	private Long quantityToChangeSignal;
	@Getter @Setter
	private Long duplicateOrderSignal;
	@Getter @Setter
	private String strCreationDate;
	@Getter @Setter
	private String strCreationOrderDate;
	@Getter @Setter
	private User usr;
	@Getter @Setter
	private String showSaveSuccessPop;
	//showSaveSuccessPop="display:block;visibility:visible;";
	//showSaveSuccessPop="visibility:hidden;display:none;";
	@Getter @Setter
	private String message;
	@Getter @Setter
	private Long okSaveSuccessPopSignal;
	@Getter @Setter
	private Long showRowShipping;
	@Getter @Setter
	private Long saveShippingSignal;
	@Getter @Setter
	private String code;
	@Getter @Setter
	private Long cityId;
	@Getter @Setter
	private List<ProvinceDTO>listProvinces;
	private Hashtable<String, ProvinceDTO>hashProvinces;
	@Getter @Setter
	private Boolean orderNotSavedAtFirst;
	@Getter @Setter
	private String strShippedDate;
	@Getter @Setter
	private String strShippingPrice;
	@Getter @Setter
	private String showConfirmDeleteOrderPop;
	@Getter @Setter
	private Long deleteOrderSignal; 
	@Getter @Setter
	private Long confirmDeleteSignal;
	@Getter @Setter
	private Long pageIndexSignal;
	@Getter @Setter
	private Long nextListPagesSignal;
	@Getter @Setter
	private Long prevListPagesSignal;
	@Getter @Setter
	private Long totalInvoicedOrders;
	@Getter @Setter
	private UsersPrivilegesDTO userPrivileges;
	@Getter @Setter
	private HashMap<Integer, String> hashStatus;
	@Getter @Setter
	private Long statusId;
	@Getter @Setter
	private String strPrint;
	@Getter @Setter
	private Integer nextListPages;
	@Getter @Setter
	private Integer prevListPages;
	@Getter @Setter
	private Integer indexSet;
	@Getter @Setter
	private Integer indexList;
	@Getter @Setter
	private String newStatus;
	@Getter @Setter
	private List<OrdersDTO> listIndexSet; 
	@Getter @Setter
	Integer PAGE_ITEMS_COUNT=100;
	@Getter @Setter
	private Integer invoicingDateBetween;
	@Getter @Setter
	private Long dateBetweenSignal;
	@Getter @Setter
	private Boolean checkBoxItem;
	@Getter @Setter
	private Long selectAllOrdersSignal;

	/*=========================================================================================
										Default constructor
	  =========================================================================================*/
	public  InvoicedOrders() throws ServiceLocatorException {
		super();	 
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
		productService = getServiceLocator().getProductService();
	}
	/*=========================================================================================
	 									method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession(true);
		status="";
		if(showOrderDetailPop==null)showOrderDetailPop="visibility:hidden;display:none;";
		if(showConfirmDeleteOrderPop==null)showConfirmDeleteOrderPop="visibility:hidden;display:none;";
		if(showSaveSuccessPop==null)showSaveSuccessPop="visibility:hidden;display:none;";
		if(poYpop==null)poYpop=100L;
		if(poXpop==null)poXpop=100L;
		if(selectedStatus==null)selectedStatus=-1;
		sizeResult=(Long)session.getAttribute("sizeResult");
		totalInvoicedOrders=(Long)session.getAttribute("totalInvoicedOrders");
		if(totalInvoicedOrders==null)totalInvoicedOrders=0L;
		asc=(Integer)session.getAttribute("asc");
		if(asc==null)asc=0;
		if(sizeResult==null)sizeResult=0L;
		if(indexOrder==null)indexOrder=0;
		userPrivileges=(UsersPrivilegesDTO)session.getAttribute("userPrivileges");
		hashStatus=(HashMap<Integer, String>)session.getAttribute("hashStatus");
		List<Integer>listIndexColumn=new ArrayList<Integer>();
		try {

			/*-------------------- recovery users list -----------------------------------
							Recovery users list in session
			 -----------------------------------------------------------------------------*/
			orderNotSavedAtFirst=(Boolean)session.getAttribute("listNotSavedAtFirst");
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
			listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOInvoiced");
			invoicingDateBetween=(Integer)session.getAttribute("invoicingDateBetween");
			if(invoicingDateBetween==null){
				invoicingDateBetween=0;
				session.setAttribute("invoicingDateBetween",invoicingDateBetween);
			}


			/*------ always check if the Admin select all orders ------------
					if The Admin select all orders change checkBoxItem value 
	 		  ---------------------------------------------------------------*/
			if(selectAllOrdersSignal!=null && selectAllOrdersSignal!=0L){
				if(checkBoxItem!=null){
					session.setAttribute("checkBoxItem",checkBoxItem);
					session.setAttribute("allOrdersSelectedSignal",0L);
					if(checkBoxItem)session.setAttribute("allOrdersSelectedSignal",1L);
				}
			}
			checkBoxItem=(Boolean)session.getAttribute("checkBoxItem");
			if(checkBoxItem==null)checkBoxItem=false;
			
			/*------ always recovery creationDate from strCreationDate ------
						always keep the user search options
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

			/*----------- always initialized listPages if not done ----------
				   		    and check if is there next listPages
			  ---------------------------------------------------------------*/
			nextListPages=(Integer)session.getAttribute("nextListPages");
			if(nextListPages==null)nextListPages=0;
			if(indexSet==null || indexSet==-1){
				indexSet=(Integer)session.getAttribute("indexSet");
				if(indexSet==null)indexSet=0;
			}
			listIndexSet=(List<OrdersDTO>)session.getAttribute("listIndexSet");
			if(listIndexSet==null)initalizeListIndexSet(session,orderService );

			/*----------------- When Admin Click on the caption "PO Date Between" ------------------
									Or "Shipped Date" or "Invoiced Date"
			 ---------------------------------------------------------------------------------------*/

			if(dateBetweenSignal!=null && dateBetweenSignal!=0L){
				switch (invoicingDateBetween) {
				case 0:
					invoicingDateBetween=1;
					break;
				case 1:
					invoicingDateBetween=2;
					break;
				case 2:
					invoicingDateBetween=0;
					break;
				default:
					invoicingDateBetween=0;
					break;
				}
				listOrdersDTO=new ArrayList<OrdersDTO>();
				session.setAttribute("listOrdersDTOReport",listOrdersDTO);
				session.setAttribute("invoicingDateBetween",invoicingDateBetween);
				return SUCCESS;
			}

			/*----------------- When Admin Click on the pageIndex ----------------------------------
										catch  page index
			 ---------------------------------------------------------------------------------------*/
			if(pageIndexSignal!=null && pageIndexSignal!=0L){
				OrdersDTO orderDTO=(OrdersDTO)session.getAttribute("orderPageSelected");
				if(orderDTO!=null)orderDTO.setCssStyle("");
				OrdersDTO orderPageSelected=listIndexSet.get(indexList);
				orderPageSelected.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
				indexSet=orderPageSelected.getIndex()-1;
				indexSet=indexSet*PAGE_ITEMS_COUNT;
				session.setAttribute("indexSet",indexSet);
				session.setAttribute("listIndexSet",listIndexSet);
				session.setAttribute("orderPageSelected",orderPageSelected);
			}

			/*----------------- When Admin Click on the nextListPages ------------------------------
						recreate listIndexSet started with index>index+10 and indexSet>indexSet+10
			 ---------------------------------------------------------------------------------------*/
			if(nextListPagesSignal!=null && nextListPagesSignal!=0L && listIndexSet.size()>0){
				OrdersDTO orderDTOPrevious=(OrdersDTO)session.getAttribute("orderPageSelected");
				if(orderDTOPrevious!=null)orderDTOPrevious.setCssStyle("");
				OrdersDTO orderDTO=listIndexSet.get(listIndexSet.size()-1);
				if(orderDTO!=null)nextListPages=orderDTO.getIndex()+1;
				totalInvoicedOrders=orderService.getCountInvoicedOrders(creationDateStartArg, creationDateEndArg,invoicingDateBetween,userLogin, lsOrderId, status);
				String strcount=totalInvoicedOrders.toString();
				Integer sizeList=Integer.parseInt(strcount) / PAGE_ITEMS_COUNT;
				if(nextListPages<=sizeList+1){
					listIndexSet=new ArrayList<OrdersDTO>();
					for(int i=nextListPages;i<=sizeList+1 && i<=nextListPages+10;i++){
						OrdersDTO ord=new OrdersDTO();
						ord.setCssStyle("");
						ord.setIndex(i);
						listIndexSet.add(ord);
					}
					if(nextListPages<=sizeList+1){
						indexSet=nextListPages-1;
						OrdersDTO orderPageSelected=listIndexSet.get(0);
						orderPageSelected.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
						indexSet=indexSet*PAGE_ITEMS_COUNT;
						session.setAttribute("indexSet",indexSet);
						session.setAttribute("nextListPages",nextListPages);
						session.setAttribute("listIndexSet",listIndexSet);
						session.setAttribute("orderPageSelected",orderPageSelected);
					}
				}
			}

			/*----------------- When Admin Click on the previousListPages --------------------------
					recreate listIndexSet started with index< index-10 and indexSet<indexSet-10
			 ---------------------------------------------------------------------------------------*/
			if(prevListPagesSignal!=null && prevListPagesSignal!=0L && listIndexSet.size()>0){
				OrdersDTO orderDTOPrevious=(OrdersDTO)session.getAttribute("orderPageSelected");
				if(orderDTOPrevious!=null)orderDTOPrevious.setCssStyle("");
				nextListPages=(Integer)session.getAttribute("nextListPages");
				if(nextListPages!=null && nextListPages>=11){
					prevListPages=nextListPages-11;
					listIndexSet=new ArrayList<OrdersDTO>();
					for(int i=prevListPages;i<nextListPages;i++){
						OrdersDTO ord=new OrdersDTO();
						ord.setCssStyle("");
						ord.setIndex(i);
						listIndexSet.add(ord);
					}
					indexSet=prevListPages-1;
					OrdersDTO orderPageSelected=listIndexSet.get(0);
					orderPageSelected.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
					indexSet=indexSet*PAGE_ITEMS_COUNT;
					nextListPages=prevListPages;
					session.setAttribute("nextListPages",nextListPages);
					session.setAttribute("indexSet",indexSet);
					session.setAttribute("listIndexSet",listIndexSet);
					session.setAttribute("orderPageSelected",orderPageSelected);
				}
			}

			/*------------ When Admin click the "Edit link" in the Order Table -------------
								show fields to edit shipping parameters
			  ------------------------------------------------------------------------------*/
			if(listOrdersDTO!=null && listOrdersDTO.size()>0 && showRowShipping!=null && showRowShipping!=0L){

				orderToEdit=listOrdersDTO.get(indexOrder);
				for(OrdersDTO order:listOrdersDTO){
					order.setShowRowShipping(0L);
					order.setCssRow("");
				}
				if(orderToEdit!=null){
					orderToEdit.setShowRowShipping(1L);
					orderToEdit.setCssRow("background-color:#FF9966;");
					session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
					listOrdersDTO=(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOInvoiced");
				}
				return SUCCESS;
			}

			/*------------ When Admin click on link "Save in the Orders Table" ----------
								save all shipping parameters and notes
			 ----------------------------------------------------------------*/
			if(listOrdersDTO!=null && listOrdersDTO.size()>0 && saveShippingSignal!=null && saveShippingSignal!=0L){
				if(indexOrder!=null){
					orderToEdit=listOrdersDTO.get(indexOrder);
					if(orderToEdit!=null){
						Date shippedDateToEdit=null;
						frm = new SimpleDateFormat("dd/MM/yyyy");
						if (((strShippedDate)!=null)&&(!"".equals(strShippedDate))){
							strShippedDate=strShippedDate.replaceAll(" ", "");
							try {
								Date date = frm.parse(strShippedDate);
								shippedDateToEdit=date;
							}
							catch (Exception pe) {
								shippedDateToEdit=null;
							}
						}
						Double shippingPrice=null;
						//Double currencyShippingPrice=null;
						if(strShippingPrice!=null && !strShippingPrice.equals("")){
							strShippingPrice=strShippingPrice.replaceAll(" ", "");
							int index=strShippingPrice.indexOf(",");
							if(index>=0){
								String strUnitPrice1=strShippingPrice.substring(0, index);
								String strUnitPrice2= strShippingPrice.substring(index+1, strShippingPrice.length());
								strShippingPrice=strUnitPrice1+"."+strUnitPrice2;
							}

							try {
								shippingPrice = Double.parseDouble(strShippingPrice);
								/*
								if(shippingPrice!=null && orderToEdit.getCurrencyId()!=null && orderToEdit.getCurrencyId()!=1 && orderToEdit.getCurrencyRate()!=null) {
									currencyShippingPrice = shippingPrice * orderToEdit.getCurrencyRate();
									currencyShippingPrice = (double) Math.round(currencyShippingPrice*100)/100;
								}
								*/
							}
							catch (Exception pe) {
								shippingPrice=null;
							}
						}

						if(trackingNumber!=null)trackingNumber=trackingNumber.replaceAll("^ +| +$|( )+", "$1");
						if(shippingCompany!=null)shippingCompany=shippingCompany.replaceAll("^ +| +$|( )+", "$1");
						orderToEdit.setShippingPrice(shippingPrice);
						//orderToEdit.setCurrencyShippingPrice(currencyShippingPrice);
						//orderToEdit.getRowsList().get(0).setCurrencyShippingPrice(currencyShippingPrice);
						orderToEdit.setShippedDate(shippedDateToEdit);
						orderToEdit.setNotes(notes);
						orderToEdit.setShippingCompany(shippingCompany);
						orderToEdit.setTrackingNumber(trackingNumber);
						orderToEdit.setShowRowShipping(0L);
						orderToEdit.setCssRow("");
						// if admin click on the save other then status(save notes, save shipping company ...)
						Boolean sucess=orderService.updateShippingInvoicedOrder(orderToEdit);
						session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
					}
				}
				return SUCCESS;
			}

			/*------------ When Admin click on icon findOrders.png ----------
								check user and complete infos client
			 ----------------------------------------------------------------*/
			if((findOrdersSignal!=null && findOrdersSignal!=0L)||
					(pageIndexSignal!=null && pageIndexSignal!=0L) ||
					(nextListPagesSignal!=null && nextListPagesSignal!=0L)||
					(prevListPagesSignal!=null && prevListPagesSignal!=0L)){
				//session.setAttribute("allOrdersSelectedSignal",0L);
				//if admin click on search icon initialize checkBoxItem to false
				if(findOrdersSignal!=null && findOrdersSignal!=0L){
					session.setAttribute("allOrdersSelectedSignal",0L);
					checkBoxItem=false;
					session.setAttribute("checkBoxItem",checkBoxItem);
					indexSet=0;
					session.setAttribute("indexSet",indexSet); 
					nextListPages=0;
					session.setAttribute("nextListPages",nextListPages);
					session.setAttribute("selectedStatus",selectedStatus);
					
				}
				//if admin navigate on pages keep the previous sorting
				if(((pageIndexSignal!=null && pageIndexSignal!=0L) ||
						(nextListPagesSignal!=null && nextListPagesSignal!=0L)||
						(prevListPagesSignal!=null && prevListPagesSignal!=0L))){
					listIndexColumn=(ArrayList<Integer>)session.getAttribute("listIndexColumn");
					if(listIndexColumn==null)listIndexColumn=getNewListIndexColumn();		
				}else{ //prepare new sorting
					listIndexColumn=getNewListIndexColumn();
				}
				lsOrderId=lsOrderId.toUpperCase();
				if(findOrdersSignal!=null && findOrdersSignal!=0L)initalizeListIndexSet(session,orderService );
				listOrdersDTO=orderService.searchInvoicedWithSorting(creationDateStartArg, creationDateEndArg,invoicingDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,indexSet);
				//Color in RED rows containing a GroupItems
				for(OrdersDTO orderDTO: listOrdersDTO) {
					if(orderDTO!=null) {
						Long count = productService.isGroupProductID(orderDTO.getProductId());
						if(count != null && count >= 1) {
							orderDTO.setCssStyle("background-color: rgb(248,150,140); border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
						}
					}
				}
				
				//keep search parameters to use in other classes(PrintOrdersToPDF, ...)
				session.setAttribute("creationDateStartArg",creationDateStartArg);
				session.setAttribute("creationDateEndArg",creationDateEndArg);
				session.setAttribute("reportDateBetween",invoicingDateBetween);
				session.setAttribute("lsOrderId",lsOrderId);
				session.setAttribute("userLogin",userLogin);
				session.setAttribute("status",status);

				session.setAttribute("listIndexColumn",listIndexColumn);
				
				session.setAttribute("listIndexColumn",listIndexColumn);
				session.setAttribute("sizeResult",sizeResult);
				session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
				return SUCCESS;
			}

			/*------------ When Admin click on the icon sorting of column ----------
							seach result with option of sorting list
			 -----------------------------------------------------------------------*/
			if(listOrdersDTO!=null && listOrdersDTO.size()>0 && sortingOrdersSignal!=null && sortingOrdersSignal!=0L){	
				listIndexColumn=(List<Integer>)session.getAttribute("listIndexColumn");
				asc=(asc==1?-1:1);
				int nextElement=listIndexColumn.get(0);
				fieldForSorting=asc*fieldForSorting;
				listIndexColumn.set(0,fieldForSorting);
				for(int i=1;i<listIndexColumn.size();i++){
					int element=listIndexColumn.get(i); 
					listIndexColumn.set(i,nextElement);
					nextElement=element;
				}	
				listOrdersDTO=orderService.searchInvoicedWithSorting(creationDateStartArg, creationDateEndArg,invoicingDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,indexSet);
				int balance=0;
				int OrderIndex=0;
				for(OrdersDTO orDTO: listOrdersDTO){
					balance=(balance==1?0:1);
					if(balance==1){
						orDTO.setCssStyle("background-color: rgb(245,249,252);border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;");
					}else{
						orDTO.setCssStyle("background-color: color:white;border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
					}
					orDTO.setIndex(OrderIndex); 
					OrderIndex++;
				}
				session.setAttribute("listIndexColumn",listIndexColumn);
				session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
				session.setAttribute("asc", asc);
				return SUCCESS;
			}

			/*-------------------- When user check print item -----------------------------
					Add or remove this element from the orders to print
	 		 -----------------------------------------------------------------------------*/
			if(listOrdersDTO!=null && listOrdersDTO.size()>0 && checkBoxPrintSignal!=null && checkBoxPrintSignal!=0L){
				OrdersDTO orderDTOInList=listOrdersDTO.get(indexOrder);
				orderDTOInList.setPrint(checkBoxPrint);
				session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
				return SUCCESS;
			}

			/*-------------------- When user check print item -----------------------------
					Add or remove this element from the orders to print
	 		 -----------------------------------------------------------------------------*/
			if(listOrdersDTO!=null && listOrdersDTO.size()>0 && okSaveSuccessPopSignal!=null && okSaveSuccessPopSignal!=0L){
				showSaveSuccessPop="visibility:hidden;display:none;";
				showOrderDetailPop="visibility:hidden;display:none;";
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}

	/*=========================================================================================
								initalize ListIndexSet
	  =========================================================================================*/
	public void initalizeListIndexSet(HttpSession session,OrdersService orderService ) throws ServiceException{
		listIndexSet=new ArrayList<OrdersDTO>();
		totalInvoicedOrders=orderService.getCountInvoicedOrders(creationDateStartArg, creationDateEndArg,invoicingDateBetween,userLogin, lsOrderId, status);
		String strcount=totalInvoicedOrders.toString();
		Integer sizeList=Integer.parseInt(strcount) / PAGE_ITEMS_COUNT;
		nextListPages=1;
		session.setAttribute("nextListPages",nextListPages);
		for(int i=1;i<=sizeList+1 && i<=11;i++){
			OrdersDTO ord=new OrdersDTO();
			ord.setCssStyle("");
			ord.setIndex(i);
			listIndexSet.add(ord);
		}
		indexSet=0;
		session.setAttribute("indexSet",indexSet);
		session.setAttribute("totalInvoicedOrders",totalInvoicedOrders);
		session.setAttribute("listIndexSet",listIndexSet);
	}

	/*=========================================================================================
								initialize listIndexColumn
	  =========================================================================================*/
	List<Integer> getNewListIndexColumn(){
		List<Integer>reult=new ArrayList<Integer>();
		for(int i=0;i<=34;i++){
			if(i!=2 && i<=13){
				reult.add(i);
				if(i!=0)reult.add(-i);
			}
			if(i==30 || i==31 || i==34){
				reult.add(i);
				reult.add(-i);
			}
		}
		return reult;
	}


}
