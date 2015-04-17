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
import com.loyauty.model.OrdersRows;
import com.loyauty.model.User;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OperationsDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class ReportOrders extends LoyautyAction {
	private static final long serialVersionUID = -3811760851445730062L;
	private UserService userService;
	private ProductService productService;
	private OrdersService orderService;
	private OperationsService operationsService;
	@Getter
	@Setter
	private String userLogin;
	@Getter
	@Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter
	@Setter
	List<OrdersDTO> listOrdersDTO;
	@Getter
	@Setter
	List<OrdersDTO> listStatus;
	@Getter
	@Setter
	private String lsOrderId;
	@Getter
	@Setter
	Long poYpop;
	@Getter
	@Setter
	Long poXpop;
	@Getter
	@Setter
	private Long pageTop = 0L;
	@Getter
	@Setter
	private Date creationDate;
	@Getter
	@Setter
	private Long findOrdersSignal;
	private String status;
	@Getter
	@Setter
	private Long sizeResult = 0L;
	@Getter
	@Setter
	private Long sorting;
	@Getter
	@Setter
	private Long sortingOrdersSignal;
	@Getter
	@Setter
	private Integer fieldForSorting;
	@Getter
	@Setter
	private Integer asc;
	@Getter
	@Setter
	private Integer scrollDivRowsLeft;
	@Getter
	@Setter
	private Integer scrollPageLeft;
	@Getter
	@Setter
	private Integer scrollDivRowsTop;
	@Getter
	@Setter
	private String strCreationDateStart;
	@Getter
	@Setter
	private String strCreationDateEnd;
	@Getter
	@Setter
	private Date creationDateStart;
	@Getter
	@Setter
	private Date creationDateEnd;
	private Date creationDateStartArg;
	private Date creationDateEndArg;
	@Getter
	@Setter
	private Integer selectedStatus;
	@Getter
	@Setter
	private Long editOrderSignal;
	@Getter
	@Setter
	private Long cancelSignal;
	@Getter
	@Setter
	private Integer indexOrder;
	@Getter
	@Setter
	private OrdersDTO orderToEdit;
	@Getter
	@Setter
	private String strProductOrderDate;
	@Getter
	@Setter
	private String lsProductID;
	@Getter
	@Setter
	Integer indexRow;
	@Getter
	@Setter
	private String showOrderDetailPop;
	@Getter
	@Setter
	private Long userId;
	@Getter
	@Setter
	private Long checkProductPriceSignal;
	@Getter
	@Setter
	private Long saveTemporaryRowSignal;
	@Getter
	@Setter
	private Long addSimilarRowSignal;
	@Getter
	@Setter
	private Long deleteRowSignal;
	@Getter
	@Setter
	private Long saveOrdersSignal;
	@Getter
	@Setter
	private Boolean checkBoxPrint;

	// recovery Data Order
	@Getter
	@Setter
	private String clientLastName;
	@Getter
	@Setter
	private String clientFirstName;
	@Getter
	@Setter
	private String clientOtherNames;
	@Getter
	@Setter
	private String clientStreet;
	@Getter
	@Setter
	private String clientOtherStreet;
	@Getter
	@Setter
	private String clientCity;
	@Getter
	@Setter
	private String clientProvince;
	@Getter
	@Setter
	private String clientPostalCode;
	@Getter
	@Setter
	private String clientPhone;
	@Getter
	@Setter
	private String clientEmail;
//	@Getter
//	@Setter
//	private String productOrderNumber;
	@Getter
	@Setter
	private String strRequiredDate;

	// recovery data row
	@Getter
	@Setter
	private Double quantity;
	@Getter
	@Setter
	private String notes;
	@Getter
	@Setter
	private Double quantityToChange;
	@Getter
	@Setter
	private Double stock;
	@Getter
	@Setter
	private String productDescription;
	@Getter
	@Setter
	private Double unitPrice;
	@Getter
	@Setter
	private Double shippingFee;
	@Getter
	@Setter
	private String shippingCompany;
	@Getter
	@Setter
	private String companyHeader;

	@Getter
	@Setter
	private Long quantityToChangeSignal;
	@Getter
	@Setter
	private Long duplicateOrderSignal;
	@Getter
	@Setter
	private String strCreationDate;
	@Getter
	@Setter
	private String strCreationOrderDate;
	@Getter
	@Setter
	private User usr;
	@Getter
	@Setter
	private String showSaveSuccessPop;
	// showSaveSuccessPop="display:block;visibility:visible;";
	// showSaveSuccessPop="visibility:hidden;display:none;";
	@Getter
	@Setter
	private String message;
	@Getter
	@Setter
	private Long okSaveSuccessPopSignal;
	@Getter
	@Setter
	private Long showRowShipping;
	@Getter
	@Setter
	private Long showOnlyEditNote;
	@Getter
	@Setter
	private Long saveShippingSignal;
	@Getter
	@Setter
	private Long saveOnlyNoteSignal;
	@Getter
	@Setter
	private String code;
	@Getter
	@Setter
	private Long cityId;
	@Getter
	@Setter
	private List<ProvinceDTO> listProvinces;
	private Hashtable<String, ProvinceDTO> hashProvinces;
	@Getter
	@Setter
	private Boolean orderNotSavedAtFirst;
	@Getter
	@Setter
	private String strShippedDate;
	@Getter
	@Setter
	private String strShippingPrice;
	@Getter
	@Setter
	private String showConfirmDeleteOrderPop;
	@Getter
	@Setter
	private Long deleteOrderSignal;
	@Getter
	@Setter
	private Long confirmDeleteSignal;
	@Getter
	@Setter
	private UsersPrivilegesDTO userPrivileges;
	@Getter
	@Setter
	private UsersPrivilegesDTO usersPrivShippedToInvoiced;
	@Getter
	@Setter
	private UsersPrivilegesDTO usersPrivChangeShippedStatus;
	@Getter
	@Setter
	private HashMap<Integer, String> hashStatus;
	@Getter
	@Setter
	private Long statusId;
	@Getter
	@Setter
	private String strPrint;
	@Getter
	@Setter
	private Integer testSignal;
	@Getter
	@Setter
	private String newStatus;
	Long invoicedOrdersRefresh;
	@Getter
	@Setter
	private Integer reportDateBetween;
	@Getter
	@Setter
	private Long dateBetweenSignal;
	@Getter
	@Setter
	private Long selectAllOrdersSignal;
	@Getter
	@Setter
	private Boolean checkBoxItem;
	// ------Pagination
	@Getter
	@Setter
	Long pageIndexSignal;
	@Getter
	@Setter
	Long prevListPagesSignal;
	@Getter
	@Setter
	Long nextListPagesSignal;
	@Getter
	@Setter
	Long totalOrders;
	@Getter
	@Setter
	Integer nextListPages;
	@Getter
	@Setter
	Integer prevListPages;
	@Getter
	@Setter
	Integer indexSet = 0;
	@Getter
	@Setter
	Integer indexList;
	@Getter
	@Setter
	List<OrdersDTO> listIndexSet;
	@Getter
	@Setter
	Integer PAGE_ITEMS_COUNT = 100;
	
	//New Added Field in the search option as toggle functionality
	@Getter
	@Setter
	private String productOrderNumberSearch;
	@Getter
	@Setter
	private String trakingNumber;
	@Getter
	@Setter
	private String  clientOther;
	@Getter	@Setter
	private String	 clientOrderNumber;
	
	@Getter	@Setter
	private Integer switchBetweenClientLoginAndPoNumberSignal;
	@Getter	@Setter
	private Integer switchBetweenClientLoginAndPoNumber;
	//New Added Field in the search option as toggle functionality
	@Getter	@Setter
	private Integer switchBetweenLsOrderAndClientOrderIdSignal;
	@Getter	@Setter
	private Integer switchBetweenLsOrderAndClientOrderId;
	@Getter	@Setter
	private Integer switchBetweenStatusAndClientOtherSignal;
	@Getter	@Setter
	private Integer switchBetweenStatusAndClientOther;
	//Added for the multiple functionality in switching  
	@Getter	@Setter
	private Integer switchBetweenOptionFieldsSignal;
	@Getter	@Setter
	private Integer switchBetweenOptionFields;
	
	// ------Pagination

	/*
	 * ==========================================================================
	 * =============== Default constructor
	 * ======================================
	 * ===================================================
	 */
	public ReportOrders() throws ServiceLocatorException {
		super();
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
		productService = getServiceLocator().getProductService();
		operationsService = getServiceLocator().getOperationsService();
		switchBetweenOptionFields = 0;
		
		
	}

	/*
	 * ==========================================================================
	 * =============== method execute
	 * ============================================
	 * =============================================
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		System.out.println("Product Order Number: "+ productOrderNumberSearch);
		System.out.println("Tracking Number: "+ trakingNumber);
		System.out.println("Client Order ID: "+ clientOrderNumber);
		System.out.println("Client Other ID: "+ clientOther);
		System.out.println(switchBetweenOptionFields);
		
		//Create new object or Order to modify the search functionality
		OrdersDTO orderDTOObj=new OrdersDTO();
		orderDTOObj.setLsOrderId(lsOrderId);
		orderDTOObj.setUserLogin(userLogin);
		orderDTOObj.setStatus(status);
		orderDTOObj.setProductOrderNumber(productOrderNumberSearch);
		orderDTOObj.setClientOrderNumber(clientOrderNumber);
		orderDTOObj.setClientOtherId(clientOther);
		
		HttpSession session = request.getSession(true);
		
		
		if (showOrderDetailPop == null)
			showOrderDetailPop = "visibility:hidden;display:none;";
		if (showConfirmDeleteOrderPop == null)
			showConfirmDeleteOrderPop = "visibility:hidden;display:none;";
		if (showSaveSuccessPop == null)
			showSaveSuccessPop = "visibility:hidden;display:none;";
		if (poYpop == null)
			poYpop = 100L;
		if (poXpop == null)
			poXpop = 100L;
		Hashtable<String, OrdersDTO> hashOrders;
		if (selectedStatus == null)
			selectedStatus = -1;
		sizeResult = (Long) session.getAttribute("sizeResult");
		totalOrders = (Long) session.getAttribute("totalOrders");
		if (totalOrders == null)
			totalOrders = 0L;
		asc = (Integer) session.getAttribute("asc");
		if (asc == null)
			asc = 0;
		if (sizeResult == null)
			sizeResult = 0L;
		if (indexOrder == null)
			indexOrder = 0;
		userPrivileges = (UsersPrivilegesDTO) session.getAttribute("userPrivileges");
		usersPrivShippedToInvoiced = (UsersPrivilegesDTO) session.getAttribute("usersPrivShippedToInvoiced");
		usersPrivChangeShippedStatus = (UsersPrivilegesDTO) session
				.getAttribute("usersPrivChangeShippedStatus");
		hashStatus = (HashMap<Integer, String>) session
				.getAttribute("hashStatus");
		if (hashStatus == null) {
			hashStatus = new HashMap<Integer, String>();
			hashStatus.put(0, "");
			hashStatus.put(1, "open");
			hashStatus.put(2, "progress");
		}
		List<Integer> listIndexColumn = new ArrayList<Integer>();
		// fill list status
		listStatus = (ArrayList<OrdersDTO>) session.getAttribute("listStatus");
		if (listStatus == null) {
			listStatus = new ArrayList<OrdersDTO>();
			OrdersDTO orderDTOOpen = new OrdersDTO();
			orderDTOOpen.setStatus("open");
			orderDTOOpen.setId(0L);
			listStatus.add(orderDTOOpen);
			OrdersDTO orderDTOProgress = new OrdersDTO();
			orderDTOProgress.setStatus("progress");
			orderDTOProgress.setId(1L);
			listStatus.add(orderDTOProgress);
			if (usersPrivChangeShippedStatus != null) {
				OrdersDTO orderDTOShipped = new OrdersDTO();
				orderDTOShipped.setStatus("shipped");
				orderDTOShipped.setId(2L);
				listStatus.add(orderDTOShipped);
			}

		}

		try {

			/*-------------------- recovery users list -----------------------------------
							Recovery users list in session
			 -----------------------------------------------------------------------------*/
			// recovery provinces
			listProvinces = (List<ProvinceDTO>) session
					.getAttribute("listProvinces");
			if (listProvinces == null)
				listProvinces = productService.getAllProvinces();
			orderNotSavedAtFirst = (Boolean) session
					.getAttribute("listNotSavedAtFirst");
			BasicUserDTO basicUserDTO = new BasicUserDTO();
			basicUserDTO.setTypeId(USER_TYPE);
			List<User> usersListSession = (List<User>) session
					.getAttribute("usersListSession");
			if (usersListSession == null) {
				List<UserSessionDTO> listAllUsers = userService
						.getAllUsers(basicUserDTO);
				usersList = new ArrayList<User>();
				for (UserSessionDTO userDTO : listAllUsers) {
					User user = new User();
					user.setId(userDTO.getId());
					user.setLogin(userDTO.getLogin());
					usersList.add(user);
				}
				session.setAttribute("usersListSession", usersList);
			} else{
				usersList = usersListSession;
			}
			
			listOrdersDTO = (ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOReport");
			
			reportDateBetween = (Integer) session.getAttribute("reportDateBetween");
			if (reportDateBetween == null) {
				reportDateBetween = 0;
				session.setAttribute("reportDateBetween", reportDateBetween);
			}

			//Added for the new field
			switchBetweenClientLoginAndPoNumber = (Integer) session.getAttribute("switchBetweenClientLoginAndPoNumber");
			if (switchBetweenClientLoginAndPoNumber == null) {
				switchBetweenClientLoginAndPoNumber = 0;
				session.setAttribute("switchBetweenClientLoginAndPoNumber", switchBetweenClientLoginAndPoNumber);
			}
			switchBetweenLsOrderAndClientOrderId = (Integer) session.getAttribute("switchBetweenLsOrderAndClientOrderId");
			if (switchBetweenLsOrderAndClientOrderId == null) {
				switchBetweenLsOrderAndClientOrderId = 0;
				session.setAttribute("switchBetweenLsOrderAndClientOrderId", switchBetweenLsOrderAndClientOrderId);
			}
			switchBetweenStatusAndClientOther = (Integer) session.getAttribute("switchBetweenStatusAndClientOther");
			if (switchBetweenStatusAndClientOther == null) {
				switchBetweenStatusAndClientOther = 0;
				session.setAttribute("switchBetweenStatusAndClientOther", switchBetweenStatusAndClientOther);
			}
			
			switchBetweenOptionFields = (Integer) session.getAttribute("switchBetweenOptionFields");
			if (switchBetweenOptionFields == null) {
				switchBetweenOptionFields = 0;
				session.setAttribute("switchBetweenOptionFields", switchBetweenOptionFields);
			}

			/*------ always check if the Admin select all orders ------------
					if The Admin select all orders change checkBoxItem value 
			  ---------------------------------------------------------------*/
			if (selectAllOrdersSignal != null && selectAllOrdersSignal != 0L) {
				if (checkBoxItem != null) {
					session.setAttribute("checkBoxItem", checkBoxItem);
					session.setAttribute("allOrdersSelectedSignal", 0L);
					if (checkBoxItem)
						session.setAttribute("allOrdersSelectedSignal", 1L);
				}
			}
			checkBoxItem = (Boolean) session.getAttribute("checkBoxItem");
			if (checkBoxItem == null)
				checkBoxItem = false;
			/*------ always recovery creationDate from strCreationDate ------
						always keep the user search options
			  ---------------------------------------------------------------*/
			creationDateStart = null;
			SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
			if (((strCreationDateStart) != null)
					&& (!"".equals(strCreationDateStart))) {
				try {
					Date date = frm.parse(strCreationDateStart);
					creationDateStart = date;
					creationDateStartArg = date;
				} catch (Exception pe) {
					creationDateStart = null;
					addActionError("Please enter a date in the correct format");
				}
			}
			if (creationDateStart == null) {
				Date date = frm.parse("01/01/1900");
				creationDateStartArg = date;
			}
			creationDateEnd = null;
			if (((strCreationDateEnd) != null)
					&& (!"".equals(strCreationDateEnd))) {
				frm = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = frm.parse(strCreationDateEnd);
					creationDateEnd = date;
					creationDateEndArg = date;
				} catch (Exception pe) {
					creationDateEnd = null;
					addActionError("Please enter a date in the correct format");
				}
			}
			if (creationDateEnd == null) {
				creationDateEndArg = new Date();
			}

			/*------ always recovery Status from selectedStatus key ------
						always keep the status search options
			  ---------------------------------------------------------------*/
			status = getStatusSelected(selectedStatus);

			/*----------- always initialized listPages if not done ----------
				   		    and check if is there next listPages
			  ---------------------------------------------------------------*/
			nextListPages = (Integer) session.getAttribute("nextListPages");
			if (nextListPages == null)
				nextListPages = 0;
			if (indexSet == null || indexSet == -1) {
				indexSet = (Integer) session.getAttribute("indexSet");
				if (indexSet == null)
					indexSet = 0;
			}
			listIndexSet = (List<OrdersDTO>) session
					.getAttribute("listIndexSet");
			if (listIndexSet == null)
				initalizeListIndexSet(session, orderService);

			/*----------------- When Admin Click on the pageIndex ----------------------------------
										catch  page index
			 ---------------------------------------------------------------------------------------*/
			//Toggle Switch between PO Date and Shipping date
			if (dateBetweenSignal != null && dateBetweenSignal != 0L) {
				reportDateBetween = ((reportDateBetween == null || reportDateBetween == 0) ? 1: 0);
				listOrdersDTO = new ArrayList<OrdersDTO>();
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("reportDateBetween", reportDateBetween);
				return SUCCESS;
			}
		
			//Toggle Switch between Client Login and PO Number	
//			switchBetweenClientLoginAndPoNumber=(Integer)session.getAttribute("switchBetweenClientLoginAndPoNumber");
			
			if (switchBetweenClientLoginAndPoNumberSignal != null && switchBetweenClientLoginAndPoNumberSignal != 0L) {
				switchBetweenClientLoginAndPoNumber = ((switchBetweenClientLoginAndPoNumber == null 
						|| switchBetweenClientLoginAndPoNumber == 0) ? 1: 0);
				listOrdersDTO = new ArrayList<OrdersDTO>();
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("switchBetweenClientLoginAndPoNumber", switchBetweenClientLoginAndPoNumber);
				return SUCCESS;
			}
			
			//Switching between "ls_Order" and "Client Order Id"	
//			switchBetweenLsOrderAndClientOrderId = (Integer)session.getAttribute("switchBetweenLsOrderAndClientOrderId");
			
			if (switchBetweenLsOrderAndClientOrderIdSignal != null && switchBetweenLsOrderAndClientOrderIdSignal != 0L) {
				switchBetweenLsOrderAndClientOrderId = ((switchBetweenLsOrderAndClientOrderId == null 
						|| switchBetweenLsOrderAndClientOrderId == 0) ? 1: 0);
				listOrdersDTO = new ArrayList<OrdersDTO>();
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("switchBetweenLsOrderAndClientOrderId", switchBetweenLsOrderAndClientOrderId);
				return SUCCESS;
			}
			
			//Switching between "Status" and "Client Other Id"
//			switchBetweenStatusAndClientOther = (Integer)session.getAttribute("switchBetweenStatusAndClientOther");
			
			if (switchBetweenStatusAndClientOtherSignal != null && switchBetweenStatusAndClientOtherSignal != 0L) {
				switchBetweenStatusAndClientOther = ((switchBetweenStatusAndClientOther == null 
						|| switchBetweenStatusAndClientOther == 0) ? 1: 0);
				listOrdersDTO = new ArrayList<OrdersDTO>();
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("switchBetweenStatusAndClientOther", switchBetweenStatusAndClientOther);
				return SUCCESS;
			}
			
			//For toggling all four option 
			if (switchBetweenOptionFieldsSignal != null && switchBetweenOptionFieldsSignal != 0L) {

				switchBetweenOptionFields++;
				listOrdersDTO = new ArrayList<OrdersDTO>();
				session.setAttribute("switchBetweenOptionFields", switchBetweenOptionFields);
				if (switchBetweenOptionFields == 4){
					switchBetweenOptionFields = 0;
					session.setAttribute("switchBetweenOptionFields", switchBetweenOptionFields);
				} 
				
				return SUCCESS;				
			}
			

			
			
			/*----------------- When Admin Click on the pageIndex ----------------------------------
										catch  page index
			 ---------------------------------------------------------------------------------------*/
			if (pageIndexSignal != null && pageIndexSignal != 0L) {
				OrdersDTO orderDTO = (OrdersDTO) session.getAttribute("orderPageSelected");
				if (orderDTO != null)
					orderDTO.setCssStyle("");
				OrdersDTO orderPageSelected = listIndexSet.get(indexList);
				orderPageSelected
						.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
				indexSet = orderPageSelected.getIndex() - 1;
				indexSet = indexSet * PAGE_ITEMS_COUNT;
				session.setAttribute("indexSet", indexSet);
				session.setAttribute("listIndexSet", listIndexSet);
				session.setAttribute("orderPageSelected", orderPageSelected);
			}

			/*----------------- When Admin Click on the nextListPages ------------------------------
						recreate listIndexSet started with index>index+10 and indexSet>indexSet+10
			 ---------------------------------------------------------------------------------------*/
			if (nextListPagesSignal != null && nextListPagesSignal != 0L
					&& listIndexSet.size() > 0) {
				OrdersDTO orderDTOPrevious = (OrdersDTO) session
						.getAttribute("orderPageSelected");
				if (orderDTOPrevious != null)
					orderDTOPrevious.setCssStyle("");
				OrdersDTO orderDTO = listIndexSet.get(listIndexSet.size() - 1);
				if (orderDTO != null)
					nextListPages = orderDTO.getIndex() + 1;
				
				Long totalOrders = orderService.getCountOrders(creationDateStartArg,
						creationDateEndArg, reportDateBetween, userLogin, lsOrderId,
						status,productOrderNumberSearch,clientOrderNumber,clientOther);
				
				String strcount = totalOrders.toString();
				Integer sizeList = Integer.parseInt(strcount)
						/ PAGE_ITEMS_COUNT;
				if (nextListPages <= sizeList + 1) {
					listIndexSet = new ArrayList<OrdersDTO>();
					for (int i = nextListPages; i <= sizeList + 1
							&& i <= nextListPages + 10; i++) {
						OrdersDTO ord = new OrdersDTO();
						ord.setCssStyle("");
						ord.setIndex(i);
						listIndexSet.add(ord);
					}
					if (nextListPages <= sizeList + 1) {
						indexSet = nextListPages - 1;
						OrdersDTO orderPageSelected = listIndexSet.get(0);
						orderPageSelected
								.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
						indexSet = indexSet * PAGE_ITEMS_COUNT;
						session.setAttribute("indexSet", indexSet);
						session.setAttribute("nextListPages", nextListPages);
						session.setAttribute("listIndexSet", listIndexSet);
						session.setAttribute("orderPageSelected",
								orderPageSelected);
					}
				}
			}

			/*----------------- When Admin Click on the previousListPages --------------------------
					recreate listIndexSet started with index< index-10 and indexSet<indexSet-10
			 ---------------------------------------------------------------------------------------*/
			if (prevListPagesSignal != null && prevListPagesSignal != 0L
					&& listIndexSet.size() > 0) {
				OrdersDTO orderDTOPrevious = (OrdersDTO) session
						.getAttribute("orderPageSelected");
				if (orderDTOPrevious != null)
					orderDTOPrevious.setCssStyle("");
				nextListPages = (Integer) session.getAttribute("nextListPages");
				if (nextListPages != null && nextListPages >= 11) {
					prevListPages = nextListPages - 11;
					listIndexSet = new ArrayList<OrdersDTO>();
					for (int i = prevListPages; i < nextListPages; i++) {
						OrdersDTO ord = new OrdersDTO();
						ord.setCssStyle("");
						ord.setIndex(i);
						listIndexSet.add(ord);
					}
					indexSet = prevListPages - 1;
					OrdersDTO orderPageSelected = listIndexSet.get(0);
					orderPageSelected
							.setCssStyle("background-color:#FFFF99;border:1px solid #CCCCCC;");
					indexSet = indexSet * PAGE_ITEMS_COUNT;
					nextListPages = prevListPages;
					session.setAttribute("nextListPages", nextListPages);
					session.setAttribute("indexSet", indexSet);
					session.setAttribute("listIndexSet", listIndexSet);
					session.setAttribute("orderPageSelected", orderPageSelected);
				}
			}

			/*----------------- When Admin change province -----------------------------------------
								Check a list off this province
			 ---------------------------------------------------------------------------------------*/
			hashProvinces = (Hashtable<String, ProvinceDTO>) session
					.getAttribute("hashProvinces");
			if (hashProvinces == null) {
				listProvinces = productService.getAllProvinces();
				Hashtable<String, ProvinceDTO> hashProvinces = new Hashtable<String, ProvinceDTO>();
				for (ProvinceDTO prov : listProvinces) {
					hashProvinces.put(prov.getCode(), prov);
				}
				session.setAttribute("hashProvinces", hashProvinces);
			}
			if (code != null && !code.equals("") && listOrdersDTO != null) {
				ProvinceDTO provinceDTO = hashProvinces.get(code);
				if (provinceDTO != null) {
					clientProvince = provinceDTO.getCode();
				}
			}// else listCities=new ArrayList<CityDTO>();
			if (listOrdersDTO != null && indexOrder != -1) {
				orderToEdit = listOrdersDTO.get(indexOrder);
				if (orderToEdit != null) {
					orderToEdit.setClientProvince(code);
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				}
			}

			/*------------------------------- Refresh listOrdersDTO------------------------------------
						Refresh listOrders before generation of invoiced orders XLS file 
				 ------------------------------------------------------------------------------------------*/
			invoicedOrdersRefresh = (Long) session
					.getAttribute("invoicedOrdersRefresh");
			if (invoicedOrdersRefresh != null && invoicedOrdersRefresh != 0L) {
				listIndexColumn = (ArrayList<Integer>) session
						.getAttribute("listIndexColumn");
				if (listIndexColumn == null)
					listIndexColumn = getNewListIndexColumn();
				lsOrderId = lsOrderId.toUpperCase();
				
				//New Functionality with same mapping
				listOrdersDTO = orderService.searchOrdersWithOptionsAndSortingNew(
								creationDateStartArg, creationDateEndArg,
								reportDateBetween, userLogin, lsOrderId,
								status, listIndexColumn, PAGE_ITEMS_COUNT,
								indexSet, productOrderNumberSearch,clientOrderNumber,
								clientOther);

				
				//Old Searching Functionality				
//				listOrdersDTO = orderService.searchOrdersWithOptionsAndSorting(
//						creationDateStartArg, creationDateEndArg,
//						reportDateBetween, userLogin, lsOrderId, status,
//						listIndexColumn, PAGE_ITEMS_COUNT, indexSet);
				
				if (findOrdersSignal != null && findOrdersSignal != 0L)
					initalizeListIndexSet(session, orderService);
				// Color in RED rows containing a GroupItems
				for (OrdersDTO orderDTO : listOrdersDTO) {
					if (orderDTO != null && orderDTO.getStatus() != null
							&& orderDTO.getStatus().equals("shipped")) {
						Long count = productService.isGroupProductID(orderDTO
								.getProductId());
						if (count != null && count >= 1) {
							orderDTO.setCssStyle("background-color: rgb(248,150,140); border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
						}
					}
				}

				// keep search parameters to use in other
				// classes(PrintOrdersToPDF, ...)
				indexSet = 0;
				session.setAttribute("indexSet", indexSet);
				nextListPages = 0;
				session.setAttribute("nextListPages", nextListPages);
				session.setAttribute("selectedStatus", selectedStatus);
				session.setAttribute("creationDateStartArg",creationDateStartArg);
				session.setAttribute("creationDateEndArg", creationDateEndArg);
				session.setAttribute("reportDateBetween", reportDateBetween);
				session.setAttribute("lsOrderId", lsOrderId);
				session.setAttribute("userLogin", userLogin);
				session.setAttribute("status", status);
				session.setAttribute("listIndexColumn", listIndexColumn);
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("invoicedOrdersRefresh", 0L);
				
				session.setAttribute("productOrderNumberSearch", productOrderNumberSearch);
				session.setAttribute("clientOrderNumber", clientOrderNumber);
				session.setAttribute("clientOther", clientOther);
				session.setAttribute("switchBetweenOptionFields", switchBetweenOptionFields);
				return SUCCESS;
			}

			/*------------ When Admin click on the Button "Delete Order" in The OrderDtailPop --------------
								show other pop to confirm Order Delete
			  ----------------------------------------------------------------------------------------------*/
			if (deleteOrderSignal != null && deleteOrderSignal != 0L) {
				message = "Attention! if you click on \"Delete Order\" you can not restore it.";
				orderToEdit = listOrdersDTO.get(indexOrder);
				if (confirmDeleteSignal != null && confirmDeleteSignal == 0L) { // Delete
																				// Order
																				// Request
					showOrderDetailPop = "display:block;visibility:visible;";
					showConfirmDeleteOrderPop = "display:block;visibility:visible;";
				} else if (confirmDeleteSignal == 1L) { // Delete Order
														// Confirmed
					orderService.deleteOrderByLsOrderId(orderToEdit);
					// Save this operation in table operation
					OperationsDTO operationDTO = new OperationsDTO();
					User userAdmin = (User) session.getAttribute("userAdmin");
					if (userAdmin != null)
						operationDTO.setUserId(userAdmin.getId());
					operationDTO.setOperationDate(new Date());
					operationDTO.setOperationType("Delete Order");
					String dataBefore = "[PARTNER NAME:"
							+ orderToEdit.getUserLogin() + "];";
					dataBefore += " [LS_ORDER_ID:" + orderToEdit.getLsOrderId()
							+ "];";
					dataBefore += " [PRODUCT_ORDER_NUMBER:"
							+ orderToEdit.getProductOrderNumber() + "];";
					dataBefore += " [CLIENT_FIRST_NAME:"
							+ orderToEdit.getClientFirstName() + "];";
					dataBefore += " [CLIENT_LAST_NAME:"
							+ orderToEdit.getClientLastName() + "];";
					dataBefore += " [CLIENT_POSTAL_CODE:"
							+ orderToEdit.getClientPostalCode() + "];";
					dataBefore += " [LS_PRODUCT_ID:"
							+ orderToEdit.getLsProductID() + "];";
					dataBefore += " [UNIT_PRICE:" + orderToEdit.getUnitPrice()
							+ "];";
					dataBefore += " [STATUS:" + orderToEdit.getStatus() + "];";
					operationDTO.setDataBefore(dataBefore);
					operationDTO.setDataBefore(operationDTO.getDataBefore());
					operationDTO.setDataAfter("");
					operationsService.insertOperation(operationDTO);
					// Remove order from the list orders
					listOrdersDTO.remove(orderToEdit);
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
					showOrderDetailPop = "visibility:hidden;display:none;";
					showConfirmDeleteOrderPop = "visibility:hidden;display:none;";
					// initialize index orders
					int indexOrder = 0;
					int indexRow = 0;
					for (OrdersDTO orderDTO : listOrdersDTO) {
						orderDTO.setIndex(indexOrder);
						indexOrder++;
						indexRow = 0;
						for (OrdersRows orderRows : orderDTO.getRowsList()) {
							orderRows.setIndex(indexRow);
							indexRow++;
						}
					}
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				} else { // Cancel Order Delete
					showOrderDetailPop = "display:block;visibility:visible;";
					showConfirmDeleteOrderPop = "visibility:hidden;display:none;";
				}
				return SUCCESS;
			}

			/*------ When Admin click the "Edit link" in the Order Table for Edit NOTE -----
							show only field Edit Note
			  ------------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& showOnlyEditNote != null && showOnlyEditNote != 0L) {
				orderToEdit = listOrdersDTO.get(indexOrder);
				for (OrdersDTO order : listOrdersDTO) {
					order.setShowOnlyEditNote(0L);
					order.setCssRow("");
				}
				orderToEdit.setShowOnlyEditNote(1L);
				orderToEdit.setCssRow("background-color:#FF9966;");
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				listOrdersDTO = (ArrayList<OrdersDTO>) session
						.getAttribute("listOrdersDTOReport");
				return SUCCESS;
			}

			/*------------ When Admin click on link "Save Edit Note in the Orders Table" ----------
													save Only  notes
			  -------------------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& saveOnlyNoteSignal != null && saveOnlyNoteSignal != 0L) {
				if (indexOrder != null) {
					orderToEdit = listOrdersDTO.get(indexOrder);
					if (orderToEdit != null) {
						orderToEdit.setNotes(notes);
						orderToEdit.setShowRowShipping(0L);
						orderToEdit.setShowOnlyEditNote(0L);
						orderToEdit.setCssRow("");
						// Save Note
						Boolean sucess = orderService
								.updateShippingOrderElements(orderToEdit);
						session.setAttribute("listOrdersDTOReport",
								listOrdersDTO);
					}
				}
				return SUCCESS;
			}

			/*------------ When Admin click the "Edit link" in the Order Table -------------
								show fields to edit shipping parameters
			  ------------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& showRowShipping != null && showRowShipping != 0L) {

				orderToEdit = listOrdersDTO.get(indexOrder);
				for (OrdersDTO order : listOrdersDTO) {
					order.setShowRowShipping(0L);
					order.setCssRow("");
				}
				// only Admins who has Active = true of action name='All' can
				// change shipping settings
				// of orders shipped or invoiced
				if (usersPrivChangeShippedStatus == null
						&& orderToEdit.getStatus() != null
						&& (orderToEdit.getStatus().equals("shipped") || orderToEdit
								.getStatus().equals("invoiced"))) {
					showRowShipping = 0L;
					return SUCCESS;
				}

				if (orderToEdit != null) {
					orderToEdit.setShowRowShipping(1L);
					orderToEdit.setShowOnlyEditNote(1L);
					orderToEdit.setCssRow("background-color:#FF9966;");
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
					listOrdersDTO = (ArrayList<OrdersDTO>) session
							.getAttribute("listOrdersDTOReport");
				}
				if (orderToEdit.getStatus().equals("open")) {
					statusId = 0L;
				} else if (orderToEdit.getStatus().equals("progress")) {
					statusId = 1L;
				} else if (orderToEdit.getStatus().equals("shipped")) {
					statusId = 2L;
				} else if (orderToEdit.getStatus().equals("invoiced")) {
					statusId = 3L;
				} else if (orderToEdit.getStatus().equals("canceled")) {
					statusId = 4L;
				}
				return SUCCESS;
			}

			/*------------ When Admin click on link "Save in the Orders Table" ----------
							save all shipping parameters and notes
			 ----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& saveShippingSignal != null && saveShippingSignal != 0L) {
				if (indexOrder != null) {
					orderToEdit = listOrdersDTO.get(indexOrder);
					if (orderToEdit != null) {
						Date shippedDateToEdit = null;
						frm = new SimpleDateFormat("dd/MM/yyyy");
						if (((strShippedDate) != null)
								&& (!"".equals(strShippedDate))) {
							strShippedDate = strShippedDate.replaceAll(" ", "");
							try {
								Date date = frm.parse(strShippedDate);
								shippedDateToEdit = date;
							} catch (Exception pe) {
								shippedDateToEdit = null;
							}
						}
						if (((strShippedDate) != null)
								&& (!"".equals(strShippedDate))
								&& strShippedDate.length() <= 8)
							shippedDateToEdit = orderToEdit.getShippedDate();
						Double shippingPrice = null;
						// Double currencyShippingPrice=null;
						if (strShippingPrice != null
								&& !strShippingPrice.equals("")) {
							strShippingPrice = strShippingPrice.replaceAll(" ",
									"");
							int index = strShippingPrice.indexOf(",");
							if (index >= 0) {
								String strUnitPrice1 = strShippingPrice
										.substring(0, index);
								String strUnitPrice2 = strShippingPrice
										.substring(index + 1,
												strShippingPrice.length());
								strShippingPrice = strUnitPrice1 + "."
										+ strUnitPrice2;
							}

							try {
								shippingPrice = Double
										.parseDouble(strShippingPrice);
								/*
								 * if(shippingPrice!=null &&
								 * orderToEdit.getCurrencyId()!=null &&
								 * orderToEdit.getCurrencyId()!=1 &&
								 * orderToEdit.getCurrencyRate()!=null) {
								 * currencyShippingPrice = shippingPrice *
								 * orderToEdit.getCurrencyRate();
								 * currencyShippingPrice = (double)
								 * Math.round(currencyShippingPrice*100)/100; }
								 */
							} catch (Exception pe) {
								shippingPrice = null;
							}
						}

						if (trakingNumber != null)
							trakingNumber = trakingNumber.replaceAll(
									"^ +| +$|( )+", "$1");
						if (shippingCompany != null)
							shippingCompany = shippingCompany.replaceAll(
									"^ +| +$|( )+", "$1");
						orderToEdit.setShippingPrice(shippingPrice);
						// orderToEdit.setCurrencyShippingPrice(currencyShippingPrice);
						// orderToEdit.getRowsList().get(0).setCurrencyShippingPrice(currencyShippingPrice);
						orderToEdit.setShippedDate(shippedDateToEdit);
						orderToEdit.setNotes(notes);
						if (newStatus != null && !newStatus.equals(""))
							orderToEdit.setStatus(newStatus);
						orderToEdit.setShippingCompany(shippingCompany);
						orderToEdit.setTrackingNumber(trakingNumber);
						orderToEdit.setShowRowShipping(0L);
						orderToEdit.setShowOnlyEditNote(0L);
						OrdersRows row = orderToEdit.getRowsList().get(0);
						row.setShippingPrice(shippingPrice);
						row.setShippingCompany(shippingCompany);
						row.setTrackingNumber(trakingNumber);
						orderToEdit.setCssRow("");

						if (newStatus != null && !newStatus.equals("")) { // if
																			// admin
																			// click
																			// on
																			// the
																			// save
																			// behind
																			// status
							orderService.updateStatusByLsOrderId(
									orderToEdit.getLsOrderId(), newStatus);
							orderToEdit.setStatus(newStatus);
							if (!newStatus.equals("shipped")
									&& !newStatus.equals("invoiced")
									&& !newStatus.equals("canceled")) {
								orderToEdit.setShippingPrice(null);
								orderToEdit.setTrackingNumber(null);
								orderToEdit.setShippedDate(null);
							}

						} else {// if admin click on the save other than Status
							if (orderToEdit.getShippedDate() != null
									&& orderToEdit.getTrackingNumber() != null
									&& !orderToEdit.getTrackingNumber().equals(
											"")
									&& orderToEdit.getShippingCompany() != null
									&& !orderToEdit.getShippingCompany()
											.equals("")
									&& orderToEdit.getShippingPrice() != null
									&& orderToEdit.getStatus() != null) {
								if (orderToEdit.getStatus().equals("open")
										|| orderToEdit.getStatus().equals(
												"progress")) {
									orderService.updateStatusByLsOrderId(
											orderToEdit.getLsOrderId(),
											"shipped");
									orderToEdit.setStatus("shipped");
								}
							} else {
								if (usersPrivChangeShippedStatus != null
										&& !orderToEdit.getStatus().equals(
												"open")
										&& !orderToEdit.getStatus().equals(
												"progress")) {
									orderService.updateStatusByLsOrderId(
											orderToEdit.getLsOrderId(),
											"progress");
									orderToEdit.setStatus("progress");
								}
							}
						}
						// if admin click on the save other then status(save
						// notes, save shipping company ...)
						Boolean sucess = orderService
								.updateShippingOrderElements(orderToEdit);
						session.setAttribute("listOrdersDTOReport",
								listOrdersDTO);
					}
				}
				return SUCCESS;
			}

			/*------------ When Admin click on icon findOrders.png ----------
								check user and complete infos client
			 ----------------------------------------------------------------*/
			if (findOrdersSignal != null
					&& findOrdersSignal != 0L
					|| (pageIndexSignal != null && pageIndexSignal != 0L)
					|| (nextListPagesSignal != null && nextListPagesSignal != 0L)
					|| (prevListPagesSignal != null && prevListPagesSignal != 0L)) {
				// session.setAttribute("allOrdersSelectedSignal",0L);
				// if admin click on search icon initialize checkBoxItem to
				// false
				if (findOrdersSignal != null && findOrdersSignal != 0L) {
					session.setAttribute("allOrdersSelectedSignal", 0L);
					checkBoxItem = false;
					session.setAttribute("checkBoxItem", checkBoxItem);
					indexSet = 0;
					session.setAttribute("indexSet", indexSet);
					nextListPages = 0;
					session.setAttribute("nextListPages", nextListPages);
					session.setAttribute("selectedStatus", selectedStatus);

				}
				// if admin navigate on pages keep the previous sorting
				if (((pageIndexSignal != null && pageIndexSignal != 0L)
						|| (nextListPagesSignal != null && nextListPagesSignal != 0L) || (prevListPagesSignal != null && prevListPagesSignal != 0L))) {
					listIndexColumn = (ArrayList<Integer>) session
							.getAttribute("listIndexColumn");
					if (listIndexColumn == null)
						listIndexColumn = getNewListIndexColumn();
				} else { // prepare new sorting
					listIndexColumn = getNewListIndexColumn();
				}

				lsOrderId = lsOrderId.toUpperCase();
				// if(findOrdersSignal!=null &&
				// findOrdersSignal!=0L)initalizeListIndexSet(session,orderService
				// );
				
				//Old Working Methods
//				listOrdersDTO = orderService.searchOrdersWithOptionsAndSorting(
//						creationDateStartArg, creationDateEndArg,
//						reportDateBetween, userLogin, lsOrderId, status,
//						listIndexColumn, PAGE_ITEMS_COUNT, indexSet);
				
				//New Functionality with same mapping
				listOrdersDTO = orderService.searchOrdersWithOptionsAndSortingNew(
								creationDateStartArg, creationDateEndArg,
								reportDateBetween, userLogin, lsOrderId,
								status, listIndexColumn, PAGE_ITEMS_COUNT,
								indexSet, productOrderNumberSearch,clientOrderNumber,
								clientOther);

				// Color in RED rows containing a GroupItems
				for (OrdersDTO orderDTO : listOrdersDTO) {
					if (orderDTO != null && orderDTO.getStatus() != null
							&& orderDTO.getStatus().equals("shipped")) {
						Long count = productService.isGroupProductID(orderDTO
								.getProductId());
						if (count != null && count >= 1) {
							orderDTO.setCssStyle("background-color: rgb(248,150,140); border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
						}
					}
				}

				// keep search parameters to use in other
				// classes(PrintOrdersToPDF, ...)
				session.setAttribute("creationDateStartArg",
						creationDateStartArg);
				session.setAttribute("creationDateEndArg", creationDateEndArg);
				session.setAttribute("reportDateBetween", reportDateBetween);
				session.setAttribute("lsOrderId", lsOrderId);
				session.setAttribute("userLogin", userLogin);
				session.setAttribute("status", status);
				//For newly added field
				session.setAttribute("productOrderNumberSearch", productOrderNumberSearch);
				session.setAttribute("switchBetweenOptionFields", switchBetweenOptionFields);

				session.setAttribute("listIndexColumn", listIndexColumn);
				session.setAttribute("sizeResult", sizeResult);
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				if (findOrdersSignal != null && findOrdersSignal != 0L)
					initalizeListIndexSet(session, orderService);
				return SUCCESS;
			}

			/*------------ When Admin click on the icon sorting of column ----------
							seach result with option of sorting list
			 -----------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& sortingOrdersSignal != null && sortingOrdersSignal != 0L) {
				listIndexColumn = (List<Integer>) session
						.getAttribute("listIndexColumn");
				asc = (asc == 1 ? -1 : 1);
				int nextElement = listIndexColumn.get(0);
				fieldForSorting = asc * fieldForSorting;
				listIndexColumn.set(0, fieldForSorting);
				for (int i = 1; i < listIndexColumn.size(); i++) {
					int element = listIndexColumn.get(i);
					listIndexColumn.set(i, nextElement);
					nextElement = element;
				}
				
				//New Functionality with same mapping
				listOrdersDTO = orderService.searchOrdersWithOptionsAndSortingNew(
								creationDateStartArg, creationDateEndArg,
								reportDateBetween, userLogin, lsOrderId,
								status, listIndexColumn, PAGE_ITEMS_COUNT,
								indexSet, productOrderNumberSearch,clientOrderNumber,
								clientOther);
				
//				listOrdersDTO = orderService.searchOrdersWithOptionsAndSorting(
//						creationDateStartArg, creationDateEndArg,
//						reportDateBetween, userLogin, lsOrderId, status,
//						listIndexColumn, PAGE_ITEMS_COUNT, indexSet);
				
				
				int balance = 0;
				int OrderIndex = 0;
				for (OrdersDTO orDTO : listOrdersDTO) {
					balance = (balance == 1 ? 0 : 1);
					if (balance == 1) {
						orDTO.setCssStyle("background-color: rgb(245,249,252);border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;");
					} else {
						orDTO.setCssStyle("background-color: color:white;border-right:1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:1px solid #CCCCCC;");
					}
					orDTO.setIndex(OrderIndex);
					OrderIndex++;
				}
				session.setAttribute("listIndexColumn", listIndexColumn);
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				session.setAttribute("asc", asc);
				return SUCCESS;
			}

			/*------ when Admin click on the lsOrder link in table -----------
					show popup detail and allow admin to update Order
			  ---------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& editOrderSignal != null && editOrderSignal != 0L) {
				orderToEdit = listOrdersDTO.get(indexOrder);
				if (orderToEdit == null)
					orderToEdit = new OrdersDTO();
				if (orderToEdit.getProductOrderDate() == null)
					strProductOrderDate = "";
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*--- when Admin click on the cancel Button of orderDetailPop ---
					we mast just hide popup OrderDetail
			  ---------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& cancelSignal != null && cancelSignal != 0L) {
				showOrderDetailPop = "visibility:hidden;display:none;";
				return SUCCESS;
			}

			/*-------------------- When Admin left lsProduct TextField -------------
								check userPrice in DB, and write it in web view
			 -----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& checkProductPriceSignal != null
					&& checkProductPriceSignal != 0L) {
				OrdersDTO orderDTOToUpdate = listOrdersDTO.get(indexOrder);
				orderDTOToUpdate = fillDataOrderDTO(orderDTOToUpdate);
				OrdersRows orderRowToUpadate = orderDTOToUpdate.getRowsList()
						.get(indexRow);
				UserProductPriceDTO userProductPrice = productService
						.getUsrPPriceByLsproductId(userId, lsProductID);
				orderRowToUpadate.setCss("");
				orderRowToUpadate.setCssPrice("");
				if (userProductPrice == null) {
					orderRowToUpadate.setCss("background-color:red;");
					orderRowToUpadate.setProductDescription("");
					orderRowToUpadate.setStock(null);
					orderRowToUpadate.setProductId(null);
					orderRowToUpadate.setLsProductID(lsProductID);
					orderRowToUpadate.setLsPrice(null);
				} else {
					Double usrPrice = orderRowToUpadate.getUnitPrice();
					if (usrPrice == null)
						usrPrice = 0D;
					if (usrPrice < userProductPrice.getPriceNum()) {
						orderRowToUpadate.setCssPrice("background-color:red;");
					}
					orderRowToUpadate.setProductDescription(userProductPrice
							.getProductTitle());
					orderRowToUpadate.setStock(userProductPrice.getStock());
					orderRowToUpadate.setProductId(userProductPrice
							.getProductId());
					orderRowToUpadate.setLsProductID(userProductPrice
							.getLsProductId());
					orderRowToUpadate
							.setLsPrice(userProductPrice.getPriceNum());
				}
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				orderToEdit = orderDTOToUpdate;
				listOrdersDTO = (List<OrdersDTO>) session
						.getAttribute("listOrdersDTOReport");
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*----------------- When Admin check on saveTemporaryRow Icon --------------------------
					we must first obtained the object that contains the list of rows,
					after we accede to the row by index recovered by web view and change it
			 ---------------------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& saveTemporaryRowSignal != null
					&& saveTemporaryRowSignal != 0L) {
				OrdersDTO orderDTOToUpdate = listOrdersDTO.get(indexOrder);
				orderDTOToUpdate = fillDataOrderDTO(orderDTOToUpdate);
				OrdersRows orderRowToSaveMemory = orderDTOToUpdate
						.getRowsList().get(indexRow);
				orderRowToSaveMemory.setIcon("images/orders/itemValidated.png");
				if (orderRowToSaveMemory != null) {
					orderRowToSaveMemory.setQuantity(quantity);
					orderRowToSaveMemory.setLsProductID(lsProductID);
					orderRowToSaveMemory
							.setProductDescription(productDescription);
					orderRowToSaveMemory.setUnitPrice(unitPrice);
					orderRowToSaveMemory
							.setCssPrice("background-color:#FF6666;");
					orderRowToSaveMemory
							.setCssQuantity("background-color:#FF6666;");
					if (quantity != null && quantity > 0D)
						orderRowToSaveMemory.setCssQuantity("");
					if (unitPrice != null
							&& orderRowToSaveMemory.getLsPrice() != null
							&& unitPrice >= orderRowToSaveMemory.getLsPrice())
						orderRowToSaveMemory.setCssPrice("");
					orderRowToSaveMemory.setShippingFee(shippingFee);
					orderRowToSaveMemory.setShippingPrice(shippingFee);
					orderRowToSaveMemory.setShippingCompany(shippingCompany);
					orderRowToSaveMemory.setTrackingNumber(trakingNumber);
					if (orderRowToSaveMemory.getCurrencyId() != null
							&& orderRowToSaveMemory.getCurrencyId() != 1
							&& orderRowToSaveMemory.getCurrencyRate() != null) {
						if (unitPrice != null) {
							orderRowToSaveMemory
									.setCurrencyUnitPrice(unitPrice);
							unitPrice = unitPrice
									/ orderRowToSaveMemory.getCurrencyRate();
							unitPrice = (double) Math.round(unitPrice * 100) / 100;
							orderRowToSaveMemory.setUnitPrice(unitPrice);
						}
						/*
						 * if(shippingFee!=null) {
						 * orderRowToSaveMemory.setCurrencyShippingPrice
						 * (shippingFee); shippingFee =
						 * shippingFee/orderRowToSaveMemory.getCurrencyRate();
						 * shippingFee = (double)
						 * Math.round(shippingFee*100)/100;
						 * orderRowToSaveMemory.setShippingPrice(shippingFee); }
						 */
					}
					int indexOrder = 0;
					int indexRow = 0;
					for (OrdersDTO orderDTO : listOrdersDTO) {
						orderDTO.setIndex(indexOrder);
						indexOrder++;
						indexRow = 0;
						for (OrdersRows orderRows : orderDTO.getRowsList()) {
							orderRows.setIndex(indexRow);
							indexRow++;
						}
					}
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
					listOrdersDTO = (List<OrdersDTO>) session
							.getAttribute("listOrdersDTOReport");
				}
				orderToEdit = listOrdersDTO.get(indexOrder);
				// Change totalPrice also
				if (orderToEdit.getRowsList().get(0) != null
						&& orderToEdit.getRowsList().get(0).getQuantity() != null
						&& orderToEdit.getRowsList().get(0)
								.getQuantityToSplit() != null
						&& orderToEdit.getRowsList().get(0).getUnitPrice() != null) {
					Double priceTotal = orderToEdit.getRowsList().get(0)
							.getUnitPrice()
							* orderToEdit.getRowsList().get(0)
									.getQuantityToSplit();
					priceTotal = (double) Math.round(priceTotal * 100) / 100;
					orderToEdit.setTotalPrice(priceTotal);
				}
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*------- When Admin click on addSimilarRow Icon on the OrderDetailPop --------
								Add one Row Similar at the previews
			  -----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& addSimilarRowSignal != null && addSimilarRowSignal != 0L) {
				OrdersDTO orderDTOToUpdate = listOrdersDTO.get(indexOrder);
				// generate lsOrderId to new order
				orderDTOToUpdate = fillDataOrderDTO(orderDTOToUpdate);
				OrdersRows orderRowToClone = orderDTOToUpdate.getRowsList()
						.get(indexRow);
				if (orderRowToClone != null) {
					if (!orderRowToClone.getIcon().equals(
							"images/orders/itemValidated.png")) {
						orderRowToClone.setQuantity(quantity);
						orderRowToClone.setLsProductID(lsProductID);
						orderRowToClone.setStock(stock);
						orderRowToClone
								.setProductDescription(productDescription);
						orderRowToClone.setUnitPrice(unitPrice);
						orderRowToClone.setShippingFee(shippingFee);
						orderRowToClone.setShippingCompany(shippingCompany);
						orderRowToClone.setTrackingNumber(trakingNumber);
					}
					orderRowToClone.setIcon("images/orders/itemValidated.png");
					OrdersRows orderRowToAdd = DTOFactory
							.getOrderRowClone(orderRowToClone);
					orderRowToAdd.setId(-1L);
					// Add currencyId
					if (orderRowToClone.getCurrencyId() != null)
						orderRowToAdd.setCurrencyId(orderRowToClone
								.getCurrencyId());

					orderDTOToUpdate.getRowsList().add(indexRow + 1,
							orderRowToAdd);
					int indexOrder = 0;
					int indexRow = 0;
					for (OrdersDTO orderDTO : listOrdersDTO) {
						orderDTO.setIndex(indexOrder);
						indexOrder++;
						indexRow = 0;
						for (OrdersRows orderRows : orderDTO.getRowsList()) {
							orderRows.setIndex(indexRow);
							indexRow++;
						}
					}
					session.setAttribute("listOrdersDTOReport", listOrdersDTO);
					listOrdersDTO = (List<OrdersDTO>) session
							.getAttribute("listOrdersDTOReport");
				}
				orderToEdit = listOrdersDTO.get(indexOrder);
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*-------- When Admin click on Delete Row Icon of orderDetail Popup-----------
									Delete this row using index
			 -----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& deleteRowSignal != null && deleteRowSignal != 0L) {
				OrdersDTO orderDTO = listOrdersDTO.get(indexOrder);
				orderDTO = fillDataOrderDTO(orderDTO);
				int nb = orderService.nbOrderRowsNotDeleted(orderDTO
						.getRowsList());
				if (orderDTO != null && orderDTO.getRowsList().size() > 1) {
					for (int i = 0; i < orderDTO.getRowsList().size(); i++) {
						if (i == indexRow && nb > 1) {
							orderDTO.getRowsList().get(i).setToDelete(1);
							break;
						}
					}
				}
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				orderToEdit = listOrdersDTO.get(indexOrder);
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*------ when Admin click on the button save of orderDetail ------------------
					 save order and hide pup  
			  ----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& saveOrdersSignal != null && saveOrdersSignal != 0L) {
				session.setAttribute("orderNotSavedAtFirst", null);
				orderToEdit = listOrdersDTO.get(indexOrder);
				orderToEdit = fillDataOrderDTO(orderToEdit);

				// add special handling shipping
				User user = null;
				if (orderToEdit.getUserLogin() != null)
					user = userService.getUserByLogin(orderToEdit
							.getUserLogin());
				if (user != null) {
					Double totalPrice = null;
					orderToEdit.setSpecialHandlingName(user
							.getSpecialHandlingName());
					orderToEdit.setSpecialHandlingFee(user
							.getSpecialHandlingFee());
					if (orderToEdit.getRowsList().get(0).getQuantity() != null
							&& orderToEdit.getRowsList().get(0).getUnitPrice() != null) {
						totalPrice = orderToEdit.getRowsList().get(0)
								.getQuantity()
								* orderToEdit.getRowsList().get(0)
										.getUnitPrice();
						totalPrice = (double) Math.round(totalPrice * 100) / 100;
					}

					orderToEdit.setTotalPrice(totalPrice);
				}

				orderService.updateOrderByLsOrderId(orderToEdit);
				for (OrdersRows row : orderToEdit.getRowsList()) {
					if (row.getId() == -1)
						row.setId(0L);
				}
				OrdersRows row = orderToEdit.getRowsList().get(0);
				if (row != null) {
					orderToEdit.getShippedDate();
					orderToEdit.setLsPrice(row.getLsPrice());
					orderToEdit.setLsProductID(row.getLsProductID());
					orderToEdit.setProductDescription(row
							.getProductDescription());
					orderToEdit.setQuantity(row.getQuantity());
				}
				orderToEdit = DTOFactory.getOrderDTOConsideredMissingInfo(
						orderToEdit, hashProvinces);
				listIndexColumn = (List<Integer>) session
						.getAttribute("listIndexColumn");
				
//				listOrdersDTO = orderService.searchOrdersWithOptionsAndSorting(
//						creationDateStartArg, creationDateEndArg,
//						reportDateBetween, userLogin, lsOrderId, status,
//						listIndexColumn, PAGE_ITEMS_COUNT, indexSet);
				

				//New Functionality with same mapping
				listOrdersDTO = orderService.searchOrdersWithOptionsAndSortingNew(
								creationDateStartArg, creationDateEndArg,
								reportDateBetween, userLogin, lsOrderId,
								status, listIndexColumn, PAGE_ITEMS_COUNT,
								indexSet, productOrderNumberSearch,clientOrderNumber,
								clientOther);				
				
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				message = "Saving has completed successfuly";
				showSaveSuccessPop = "display:block;visibility:visible;";
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*------ When user change Quantity to split in orderDetailPop -----------
					 prepare order to split from two other orders witch
				 	 one must have a lsOrder with underscore 
			 ------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& quantityToChangeSignal != null
					&& quantityToChangeSignal != 0L) {
				OrdersDTO orderToChangeQt = listOrdersDTO.get(indexOrder);
				OrdersRows orderRow = orderToChangeQt.getRowsList().get(
						indexRow);
				orderToChangeQt = fillDataOrderDTO(orderToChangeQt);
				if (quantityToChange < orderRow.getQuantity())
					orderRow.setQuantityToSplit(quantityToChange);
				session.setAttribute("listOrdersDTOReport", listOrdersDTO);
				listOrdersDTO = (List<OrdersDTO>) session
						.getAttribute("listOrdersDTOReport");
				orderToEdit = listOrdersDTO.get(indexOrder);
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*-------------------- Duplicate Order ----------------------------------------
							Create order in just in memory
			 -----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& duplicateOrderSignal != null
					&& duplicateOrderSignal != 0L) {
				OrdersDTO orderToClone = listOrdersDTO.get(indexOrder);
				orderToClone = fillDataOrderDTO(orderToClone);
				hashOrders = new Hashtable<String, OrdersDTO>();
				for (OrdersDTO ord : listOrdersDTO) {
					hashOrders.put(ord.getLsOrderId(), ord);
				}
				OrdersDTO orderClone = DTOFactory
						.getOrderDTOSplitted(orderToClone);
				if (orderClone != null) {
					orderClone.setDuplicate(true);
					String lsOrder = orderClone.getLsOrderId();
					String strlsOrder = orderService.generateLsOrderId(lsOrder,
							hashOrders);
					orderClone.setLsOrderId(strlsOrder);// rgb(116,180,209)
					orderClone
							.setCssStyle("background-color:#FFFF99;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;");
					orderToEdit = orderClone;
					orderToEdit.setBackgroundColor("background-color:#FFFF99;");
					listOrdersDTO.add(indexOrder + 1, orderClone);
					indexOrder = 0;
					for (OrdersDTO ord : listOrdersDTO) {
						ord.setIndex(indexOrder);
						indexOrder++;
					}
					orderService.updateOrderByLsOrderId(orderToClone);
					orderService.insertOrderWithRows(orderClone);
					orderClone.setDuplicate(false);
					for (OrdersRows row : orderClone.getRowsList()) {
						if (row.getId() < 0L)
							row.setId(0L);
					}
					if (listOrdersDTO.size() > 0) {
						session.setAttribute("listOrdersDTOReport",
								listOrdersDTO);
					}
				} else
					orderToEdit = orderToClone;
				showOrderDetailPop = "display:block;visibility:visible;";
				return SUCCESS;
			}

			/*-------------------- When user check print item -----------------------------
					Add or remove this element from the orders to print
			 -----------------------------------------------------------------------------*/
			if (listOrdersDTO != null && listOrdersDTO.size() > 0
					&& okSaveSuccessPopSignal != null
					&& okSaveSuccessPopSignal != 0L) {
				showSaveSuccessPop = "visibility:hidden;display:none;";
				showOrderDetailPop = "visibility:hidden;display:none;";
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}

	/*
	 * ==========================================================================
	 * =============== fill all fields of order without rows
	 * ====================
	 * =====================================================================
	 */
	public OrdersDTO fillDataOrderDTO(OrdersDTO orderDTO) {
		SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
		orderDTO.setClientLastName(clientLastName);
		orderDTO.setClientFirstName(clientFirstName);
		orderDTO.setClientOtherNames(clientOtherNames);
		orderDTO.setClientStreet(clientStreet);
		orderDTO.setClientOtherStreet(clientOtherStreet);
		orderDTO.setClientCity(clientCity);
		orderDTO.setClientProvince(code);
		orderDTO.setClientPostalCode(clientPostalCode);
		orderDTO.setClientPhone(clientPhone);
		orderDTO.setClientEmail(clientEmail);
		orderDTO.setProductOrderNumber(productOrderNumberSearch);
		orderDTO.setCompanyHeader(companyHeader);
		if (((strProductOrderDate) != null)
				&& (!"".equals(strProductOrderDate))) {
			frm = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date date = frm.parse(strProductOrderDate);
				orderDTO.setProductOrderDate(date);
			} catch (Exception pe) {
				addActionError("Please enter a date in the correct format");
			}
		}

		if (((strCreationOrderDate) != null)
				&& (!"".equals(strCreationOrderDate))) {
			frm = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date date = frm.parse(strCreationOrderDate);
				orderDTO.setCreationDate(date);
			} catch (Exception pe) {
				addActionError("Please enter a date in the correct format");
			}
		}

		if (((strRequiredDate) != null) && (!"".equals(strRequiredDate))) {
			frm = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date date = frm.parse(strRequiredDate);
				orderDTO.setRequiredDate(date);
			} catch (Exception pe) {
				addActionError("Please enter a date in the correct format");
			}
		}
		return orderDTO;
	}

	/*
	 * ==========================================================================
	 * =============== initialize ListIndexSet
	 * ==================================
	 * =======================================================
	 */
	public void initalizeListIndexSet(HttpSession session,
			OrdersService orderService) throws ServiceException {
		listIndexSet = new ArrayList<OrdersDTO>();
		totalOrders = orderService.getCountOrders(creationDateStartArg,
				creationDateEndArg, reportDateBetween, userLogin, lsOrderId,
				status,productOrderNumberSearch,clientOrderNumber,clientOther);
		
		String strcount = totalOrders.toString();
		Integer sizeList = Integer.parseInt(strcount) / PAGE_ITEMS_COUNT;
		nextListPages = 1;
		session.setAttribute("nextListPages", nextListPages);
		for (int i = 1; i <= sizeList + 1 && i <= 11; i++) {
			OrdersDTO ord = new OrdersDTO();
			ord.setCssStyle("");
			ord.setIndex(i);
			listIndexSet.add(ord);
		}
		indexSet = 0;
		session.setAttribute("indexSet", indexSet);
		session.setAttribute("totalOrders", totalOrders);
		session.setAttribute("listIndexSet", listIndexSet);
		session.setAttribute("productOrderNumberSearch", productOrderNumberSearch);

	}

	/*
	 * ==========================================================================
	 * =============== initialize listIndexColumn
	 * ================================
	 * =========================================================
	 */
	List<Integer> getNewListIndexColumn() {
		List<Integer> reult = new ArrayList<Integer>();
		for (int i = 0; i <= 34; i++) {
			if (i != 2 && i <= 13) {
				reult.add(i);
				if (i != 0)
					reult.add(-i);
			}
			if (i == 30 || i == 31 || i == 34) {
				reult.add(i);
				reult.add(-i);
			}
		}
		return reult;
	}

	/*
	 * ==========================================================================
	 * =============== getStatus Selected by Admin for searching
	 * ================
	 * =========================================================================
	 */
	public String getStatusSelected(Integer StatusIndex) {
		String result = "";
		switch (StatusIndex) {
		case 0:
			result = "open";
			break;
		case 1:
			result = "progress";
			break;
		case 2:
			result = "shipped";
			break;
		case 3:
			result = "invoiced";
			break;
		case 4:
			result = "canceled";
			break;
		default:
			result = "";
		}
		return result;
	}

}
