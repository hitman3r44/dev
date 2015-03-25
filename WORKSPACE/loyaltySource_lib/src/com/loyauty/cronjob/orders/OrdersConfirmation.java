package com.loyauty.cronjob.orders;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.OrdersRows;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersSpecialShippingDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;

public class OrdersConfirmation {
	private static UserService userService;
	private static ProductService productService;
	private static ServiceLocator serviceLocator;
	private static OrdersService orderService;
	private static int USER_TYPE = 2;
	public OrdersConfirmation() throws ServiceLocatorException{
		super();
		serviceLocator = ServiceLocator.getInstance();
		productService = serviceLocator.getProductService();
		orderService = serviceLocator.getOrderService();
		userService = serviceLocator.getUserService();
	}
	
	/*==========================================================
	 				Method Main 
	  ==========================================================*/
	public static void main(String[] args) throws ServiceLocatorException {
		URL url=OrdersConfirmation.class.getProtectionDomain().getCodeSource().getLocation();
		String pathRoot=url.getPath();
		File fileRoot=new File(pathRoot); 
		// /usr/apache-tomcat-6.0.35/webapps/loyaltySourceAdmin/WEB-INF
		for(int i=0;i<=3;i++){
			fileRoot=new File(pathRoot); 
			pathRoot=fileRoot.getParent();
        }
		try {
			new OrdersConfirmation().generateFilesOrdersConfirm(pathRoot+"/");
			System.out.println("\n\n");
		} catch (ServiceLocatorException e) {
			e.printStackTrace();
		}finally{
			System.exit(0);
		}

	}

	/*==========================================================
	 			generate Files Orders Confirmation 
	  ==========================================================*/
	public void generateFilesOrdersConfirm(String location){
		File fileRoot=new File(location+"orders_confirm");
		fileRoot.mkdir();
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		basicUserDTO.setTypeId(USER_TYPE);
		File clientFolder=null;
		List<OrdersDTO>listOrdersDayB4Invoicing=null;
		List<OrdersDTO>listOrdersDay=null;
		List<OrdersDTO>listOrdersWeekB4Invoicing=null;
		List<OrdersDTO>listOrdersWeek=null;
		List<OrdersDTO>listOrdersMonthB4Invoicing=null;
		List<OrdersDTO>listOrdersMonth=null;
		//date now
		Date dateNow=new Date();
		
		
		//date of starting yesterday
		Calendar yesterdayCalendar = Calendar.getInstance();
		yesterdayCalendar.clear();
		yesterdayCalendar.setTime(dateNow);
		yesterdayCalendar.add(Calendar.DATE, -1);
		Date dateStartingYesteday=yesterdayCalendar.getTime();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
		String prefix=dateFormat.format(dateStartingYesteday);
		//date of starting week
		Calendar weekCalendar = Calendar.getInstance();
		weekCalendar.clear();
		weekCalendar.setTime(dateStartingYesteday);
		while (weekCalendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
			weekCalendar.add(Calendar.DATE, -1);
		}
		Date dateStartingWeek=weekCalendar.getTime();
		
		//date of starting month
		Calendar monthCalendar = Calendar.getInstance();
		monthCalendar.clear();
		monthCalendar.setTime(dateStartingYesteday);
		monthCalendar.set(Calendar.DATE, 1);
		Date dateStartingMonth=monthCalendar.getTime();
		
		//Fill listOrders
		List<Integer>listIndexColumn=new ArrayList<Integer>();
		for(int i=0;i<=34;i++){
			if(i!=2 && i<=13){
				listIndexColumn.add(i);
				if(i!=0)listIndexColumn.add(-i);
			}
			if(i==30 || i==31 || i==34){
				listIndexColumn.add(i);
				listIndexColumn.add(-i);
			}
		}
		listIndexColumn.set(0,-31);  
	
		try {	
			List<UserSessionDTO> listAllUsers= userService.getAllUsers(basicUserDTO);
			for(UserSessionDTO userSessDTO:listAllUsers){
		        
				//recovery user map
				UserDTO userDTO=userService.getUserInformation(userSessDTO.getId());
				String userLogin=userSessDTO.getLogin();
				System.out.println("Creation files for client:"+userLogin);
				UserFileRecoveryDTO userMap=orderService.getUserFileRecoveryByUser(userLogin);
				//call method according to typeFileIdConfirm
				if(userMap!=null){
					//recovery orders List by Period
					listOrdersDayB4Invoicing=orderService.searchOrdersWithOptionsAndSorting(dateStartingYesteday, dateStartingYesteday,1,userLogin, "", "shipped", listIndexColumn,300000,0);
					listOrdersDay=orderService.searchInvoicedWithSorting(dateStartingYesteday, dateStartingYesteday,1,userLogin, "", "invoiced", listIndexColumn,300000,0);
					listOrdersDay.addAll(listOrdersDayB4Invoicing);
					
					listOrdersWeekB4Invoicing=orderService.searchOrdersWithOptionsAndSorting(dateStartingWeek, dateStartingYesteday,1,userLogin, "", "shipped", listIndexColumn,300000,0);
					listOrdersWeek=orderService.searchInvoicedWithSorting(dateStartingWeek, dateStartingYesteday,1,userLogin, "", "invoiced", listIndexColumn,300000,0);
					listOrdersWeek.addAll(listOrdersWeekB4Invoicing);
					
					listOrdersMonthB4Invoicing=orderService.searchOrdersWithOptionsAndSorting(dateStartingMonth, dateStartingYesteday,1,userLogin, "", "shipped", listIndexColumn,300000,0);
					listOrdersMonth=orderService.searchInvoicedWithSorting(dateStartingMonth, dateStartingYesteday,1,userLogin, "", "invoiced", listIndexColumn,300000,0);
					listOrdersMonth.addAll(listOrdersMonthB4Invoicing);
					
					//create client Folder
					clientFolder=new File(location+"orders_confirm/"+userLogin);
					clientFolder.mkdir();

					switch (userMap.getFileFormatIdComfirm()) {
					case 1: //XML Format A
						if(userLogin.equals("Rideau")){
							createFilesOrdersXML_Rideau(location+"orders_confirm/"+userLogin+"/",listOrdersDay,userDTO);
						}
						else{
							createFilesOrdersXMLFormatA(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".xml",listOrdersDay,userDTO);
						}						
						createFilesOrdersXMLFormatA(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.xml",listOrdersWeek,userDTO);
						createFilesOrdersXMLFormatA(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.xml",listOrdersMonth,userDTO);
						break;
						
					case 2: //XML Format B
						createFilesOrdersXMLFormatB(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".xml",listOrdersDay,userDTO);
						createFilesOrdersXMLFormatB(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.xml",listOrdersWeek,userDTO);
						createFilesOrdersXMLFormatB(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.xml",listOrdersMonth,userDTO);
						break;
						
					case 3: //XLS Format A
						createFilesOrdersXLSFormatA(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".xls",listOrdersDay,userDTO);
						createFilesOrdersXLSFormatA(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.xls",listOrdersWeek,userDTO);
						createFilesOrdersXLSFormatA(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.xls",listOrdersMonth,userDTO);
						break;

					case 4: //XLS Format B
						createFilesOrdersXLSFormatB(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".xls",listOrdersDay,userDTO);
						createFilesOrdersXLSFormatB(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.xls",listOrdersWeek,userDTO);
						createFilesOrdersXLSFormatB(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.xls",listOrdersMonth,userDTO);
						break;
						
					case 5: //CSV Format A
						createFilesOrdersCSVFormatA(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".csv",listOrdersDay,userDTO);
						createFilesOrdersCSVFormatA(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.csv",listOrdersWeek,userDTO);
						createFilesOrdersCSVFormatA(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.csv",listOrdersMonth,userDTO);
						break;
						
					case 6: //CSV Format B
						createFilesOrdersCSVFormatB(location+"orders_confirm/"+userLogin+"/","day_Loyalty_Source_Shipped_Orders_"+prefix+".csv",listOrdersDay,userDTO);
						createFilesOrdersCSVFormatB(location+"orders_confirm/"+userLogin+"/","week_shippingConfirmation.csv",listOrdersWeek,userDTO);
						createFilesOrdersCSVFormatB(location+"orders_confirm/"+userLogin+"/","month_shippingConfirmation.csv",listOrdersMonth,userDTO);
						break;
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*==========================================================
	 				create File orders confirmation XML 
	  ==========================================================*/
	public static void createFilesOrdersXMLFormatA(String location,String fileName,List<OrdersDTO> ordersListDTO,UserDTO userDTO) throws Exception{
		
		//------------------------- generate XML File ------------------------
		File xmlOrdersFile=new File(location+fileName);
		//clean User Folder
		cleanUserFolder(location,fileName);
		
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document doc = docBuilder.newDocument();	
		Element rootElement = doc.createElement("shipped_orders");
		doc.appendChild(rootElement);
		
		for(OrdersDTO orderDTO:ordersListDTO){
			Element order_Element = doc.createElement("order");
			rootElement.appendChild(order_Element);

			//po_number
			Element po_number_Element = doc.createElement("po_number");	
			String po_number=orderDTO.getProductOrderNumber();
			if(po_number!=null)po_number_Element.setTextContent(po_number);
			order_Element.appendChild(po_number_Element);
			
			//first_name
			Element first_name_Element = doc.createElement("first_name");
			String first_name=orderDTO.getClientFirstName();
			if(first_name!=null)first_name_Element.setTextContent(first_name);
			order_Element.appendChild(first_name_Element);
			
			//last_name
			Element last_name_Element = doc.createElement("last_name");	
			String last_name=orderDTO.getClientLastName();
			if(last_name!=null)last_name_Element.setTextContent(last_name);
			order_Element.appendChild(last_name_Element);
				
			//client_street
			Element client_street_Element = doc.createElement("client_street");
			String client_street=orderDTO.getClientStreet();
			if(client_street!=null)client_street_Element.setTextContent(client_street);
			order_Element.appendChild(client_street_Element);
			
			//client_city
			Element client_city_Element = doc.createElement("client_city");
			String client_city=orderDTO.getClientCity();
			if(client_city!=null)client_city_Element.setTextContent(client_city);
			order_Element.appendChild(client_city_Element);
			
			//client_province
			Element client_province_Element = doc.createElement("client_province");
			String client_province=orderDTO.getClientProvince();
			if(client_province!=null)client_province_Element.setTextContent(client_province);
			order_Element.appendChild(client_province_Element);
			
			//client_postal
			Element client_postal_code_Element = doc.createElement("client_postal_code");
			String client_postal=orderDTO.getClientPostalCode();
			if(client_postal!=null)client_postal_code_Element.setTextContent(client_postal);
			order_Element.appendChild(client_postal_code_Element);

			//client_order_id
			Element client_order_id_Element = doc.createElement("client_order_id");
			String client_order_id=orderDTO.getClientOrderNumber();
			if(client_order_id!=null)client_order_id_Element.setTextContent(client_order_id);
			order_Element.appendChild(client_order_id_Element);

			//client_other_id
			Element client_other_id_Element = doc.createElement("client_other_id");
			String client_other_id=orderDTO.getClientOtherId();
			if(client_other_id!=null)client_other_id_Element.setTextContent(client_other_id);
			order_Element.appendChild(client_other_id_Element);

			//client_number
			Element client_number_Element = doc.createElement("client_number");
			String client_number=orderDTO.getClientNumber();
			if(client_number!=null)client_number_Element.setTextContent(client_number);
			order_Element.appendChild(client_number_Element);

			OrdersRows orderRow=orderDTO.getRowsList().get(0);
			
			//client_product_number
			Element client_product_number_Element = doc.createElement("client_product_number");
			String client_product_number=orderRow.getClientProductNumber();
			if(client_product_number!=null)client_product_number_Element.setTextContent(client_product_number);
			order_Element.appendChild(client_product_number_Element);

			//quantity
			Element quantity_Element = doc.createElement("quantity");
			String quantity=orderRow.getQuantity()+"";
			if(quantity!=null)quantity_Element.setTextContent(quantity);
			order_Element.appendChild(quantity_Element);
			
			//ls_product_id
			Element ls_product_id_Element = doc.createElement("ls_product_id");	
			String ls_product_id=orderRow.getLsProductID();
			if(ls_product_id!=null)ls_product_id_Element.setTextContent(ls_product_id);
			order_Element.appendChild(ls_product_id_Element);
			
			//product_title
			Element product_title_Element = doc.createElement("product_title");
			Long productId=orderRow.getProductId();
			if(productId!=null && productId!=0L){
				ProductDTO productDTO = null;
				try {
					productDTO = productService.getProductById(productId);
				} catch (ServiceException e) {
					e.printStackTrace();
				}
				if(productDTO!=null){
					String title=productDTO.getNameEng().getName();
					title=title.replaceAll(",", " ");
					product_title_Element.setTextContent(title);
				}
			}
			order_Element.appendChild(product_title_Element);
			
			//cost
			Element cost_Element = doc.createElement("cost");
			String cost=orderRow.getUnitPrice()+"";
			if(cost!=null)cost_Element.setTextContent(cost);
			order_Element.appendChild(cost_Element);
			
			//shipping_cost
			Element shipping_cost_Element = doc.createElement("shipping_cost");	
			Double SHIPPING_COST = orderRow.getShippingPrice();
			String strSHIPPING_COST="";
			if (SHIPPING_COST!= null) {
				Double multiplier=Double.parseDouble(userDTO.getMultiplier());
				SHIPPING_COST=SHIPPING_COST*(1+multiplier/100);
				//if user has a special shipping
				OrdersSpecialShippingDTO ordSpecialShipDTO=new OrdersSpecialShippingDTO();
				ordSpecialShipDTO.setProductId(orderDTO.getProductId());
				ordSpecialShipDTO.setUserId(orderDTO.getUserId());
				OrdersSpecialShippingDTO OrdSpecialShip=orderService.getOrderSpecialShipping(ordSpecialShipDTO);
				if(OrdSpecialShip!=null)SHIPPING_COST=OrdSpecialShip.getShippingPrice();
				SHIPPING_COST = (double) Math.round(SHIPPING_COST * 100) / 100;
				//2 decimal
				strSHIPPING_COST=orderService.getStringFromDouble(SHIPPING_COST, 2);
			}
			
			shipping_cost_Element.setTextContent(strSHIPPING_COST);
			order_Element.appendChild(shipping_cost_Element);
				
			//tracking_number
			Element tracking_number_Element = doc.createElement("tracking_number");	
			String tracking_number=orderRow.getTrackingNumber()+"";
			if(tracking_number!=null)tracking_number_Element.setTextContent(tracking_number);
			order_Element.appendChild(tracking_number_Element);
			
			//shipping_company
			Element shipping_company_Element = doc.createElement("shipping_company");
			String shipping_company=orderRow.getShippingCompany();
			if(shipping_company!=null)shipping_company_Element.setTextContent(shipping_company);
			order_Element.appendChild(shipping_company_Element);
			
			//shipped_date
			Element shipped_date_Element = doc.createElement("shipped_date");
			Date shipped_date=orderRow.getShippedDate();
			if(shipped_date!=null){
				SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
				String strDate=frm.format(shipped_date);
				shipped_date_Element.setTextContent(strDate);
			}
			order_Element.appendChild(shipped_date_Element);
		}

		//Create XML File
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(xmlOrdersFile);
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}


	/*==========================================================
	 				create File orders confirmation XML 
	  ==========================================================*/
	public static void createFilesOrdersXMLFormatB(String location,String fileName,List<OrdersDTO> ordersListDTO,UserDTO userDTO) throws Exception{
		
		//------------------------- generate XML File ------------------------
		File xmlOrdersFile=new File(location+fileName);
		//clean User Folder
		cleanUserFolder(location,fileName);
		
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Document doc = docBuilder.newDocument();	
		Element rootElement = doc.createElement("shipped_orders");
		doc.appendChild(rootElement);
		
		for(OrdersDTO orderDTO:ordersListDTO){
			Element order_Element = doc.createElement("order");
			rootElement.appendChild(order_Element);

			String CLIENT_ORDER_ID="";
			String CLIENT_OTHER_ID="";
			String FIRST_NAME="";
			String LAST_NAME="";
			String PRODUCT_ID="";
			String SUPPLIER_SKU="";
			String PRODUCT_NAME="";
			String TRACKING_NUMBER="";
			String COURIER="";
			String SHIPPED_DATE="";

			//--------------  1: CLIENT_ORDER_ID  ----------------
			Element CLIENT_ORDER_Element = doc.createElement("po_number");
			if(orderDTO.getClientOrderNumber()!=null){
				CLIENT_ORDER_ID=orderDTO.getClientOrderNumber();
				CLIENT_ORDER_Element.setTextContent(CLIENT_ORDER_ID);
			}
			order_Element.appendChild(CLIENT_ORDER_Element);

			//--------------  2: CLIENT_OTHER_ID -----------
			Element CLIENT_OTHER_ID_Element = doc.createElement("order_id");
			if(orderDTO.getClientOtherId()!=null){
				CLIENT_OTHER_ID=orderDTO.getClientOtherId();
				CLIENT_OTHER_ID_Element.setTextContent(CLIENT_OTHER_ID);
			}
			order_Element.appendChild(CLIENT_OTHER_ID_Element);

			//--------------  3: FIRST_NAME  ---------------
			Element FIRST_NAME_Element = doc.createElement("first_name");
			if(orderDTO.getClientFirstName()!=null){
				FIRST_NAME=orderDTO.getClientFirstName();
				FIRST_NAME_Element.setTextContent(FIRST_NAME);
			}
			order_Element.appendChild(FIRST_NAME_Element);
			
			//--------------  4: LAST_NAME -----------------
			Element LAST_NAME_Element = doc.createElement("last_name");
			if(orderDTO.getClientLastName()!=null){
				LAST_NAME=orderDTO.getClientLastName();
				LAST_NAME_Element.setTextContent(LAST_NAME);
			}
			order_Element.appendChild(LAST_NAME_Element);
			
			OrdersRows orderRow=orderDTO.getRowsList().get(0);
			
			//--------------  5: PRODUCT_ID ----------------
			Element PRODUCT_ID_Element = doc.createElement("product_id");
			if(orderRow.getClientProductNumber()!=null){
				PRODUCT_ID=orderRow.getClientProductNumber();
				PRODUCT_ID_Element.setTextContent(PRODUCT_ID);
			}
			order_Element.appendChild(PRODUCT_ID_Element);
			
			//--------------  6: SUPPLIER_SKU --------------
			Element SUPPLIER_SKU_Element = doc.createElement("supplier_sku");
			if(orderRow.getLsProductID()!=null){
				SUPPLIER_SKU=orderRow.getLsProductID();
				SUPPLIER_SKU_Element.setTextContent(SUPPLIER_SKU);
			}
			order_Element.appendChild(SUPPLIER_SKU_Element);
			
			//--------------  7: PRODUCT_NAME --------------	
			Element PRODUCT_NAME_Element = doc.createElement("product_name");
			if(orderRow.getProductId()!=null && orderRow.getProductId()!=0L){
				Long productId=orderRow.getProductId();
				ProductDTO productDTO=productService.getProductById(productId);
				if(productDTO!=null){
					PRODUCT_NAME=productDTO.getNameEng().getName();
					PRODUCT_NAME=PRODUCT_NAME.replaceAll(",", " ");
					PRODUCT_NAME_Element.setTextContent(PRODUCT_NAME);
				}
			}
			order_Element.appendChild(PRODUCT_NAME_Element);

			//--------------  8: TRACKING_NUMBER -----------
			Element TRACKING_NUMBER_Element = doc.createElement("tracking_number");
			if(orderRow.getTrackingNumber()!=null){
				TRACKING_NUMBER="#"+orderRow.getTrackingNumber();
				TRACKING_NUMBER_Element.setTextContent(TRACKING_NUMBER);
			}
			order_Element.appendChild(TRACKING_NUMBER_Element);
			
			//--------------  9: COURIER -------------------
			Element COURIER_Element = doc.createElement("courier");
			if(orderRow.getShippingCompany()!=null){
				COURIER=orderRow.getShippingCompany();
				COURIER_Element.setTextContent(COURIER);
			}
			order_Element.appendChild(COURIER_Element);
			
			//-------------- 10: SHIPPED_DATE -------------------	
			Element SHIPPED_DATE_Element = doc.createElement("shipped_date");
			if (orderRow.getShippedDate()!= null) {
				SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
				SHIPPED_DATE=frm.format(orderRow.getShippedDate());
				SHIPPED_DATE_Element.setTextContent(SHIPPED_DATE);
			}
			order_Element.appendChild(SHIPPED_DATE_Element);
		}

		//Create XML File
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(xmlOrdersFile);
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	/*==========================================================
	 		 create File orders confirmation XLS Format A
	  ==========================================================*/
	public static void createFilesOrdersXLSFormatA(String location,String fileName,List<OrdersDTO> ordersListDTO,UserDTO userDTO){
		
		//clean User Folder
		cleanUserFolder(location,fileName);
		
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		//COLUMNS NUMBER
		final int COL_PO_NUMBER=2;
		final int COL_FIRST_NAME=3;	
		final int COL_LAST_NAME=4;
		final int COL_CLIENT_STREET=5;	
		final int COL_CLIENT_CITY=6;	
		final int COL_CLIENT_PROVINCE=7;	
		final int COL_CLIENT_POSTAL_CODE=8;	
		final int COL_CLIENT_ORDER_ID=9;	
		final int COL_CLIENT_OTHER_ID=10;
		final int COL_CLIENT_NUMBER=11;
		final int COL_CLIENT_PRODUCT_NUMBER=12;
		final int COL_QUANTITY=13;	
		final int COL_LS_PRODUCT_ID=14;	
		final int COL_PRODUCT_TITLE=15;	
		final int COL_COST=16;	
		final int COL_SHIPPING_COST=17;	
		final int COL_TRACKING_NUMBER=18;	
		final int COL_SHIPPING_COMPANY=19;	
		final int COL_SHIPPED_DATE=20;

		File fileDataOrders=new File(location); 
		String pathDataOrders=location;
		for(int i=0;i<=1;i++){
			fileDataOrders=new File(pathDataOrders); 
			pathDataOrders=fileDataOrders.getParent();
		}
		int row = ROW_TO_BEGIN;
		try {
		Workbook existingWorkbook = Workbook.getWorkbook(new File(pathDataOrders+"/loyaltySourceAdmin/WEB-INF/jsp/orders/data/"+"ordersConfirmTemplateFA.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(location+fileName), existingWorkbook);
		WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);
		
	    // Create cell font and format
	    WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
	    cellFont.setColour(Colour.BLACK);
	    WritableCellFormat cellFormatOrange = new WritableCellFormat(cellFont);
	    cellFormatOrange.setBackground(Colour.LIGHT_TURQUOISE);
	    cellFormatOrange.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormatOrange.setAlignment(Alignment.LEFT);
	    cellFormatOrange.setWrap(true);
	    cellFormatOrange.setBorder(Border.ALL, BorderLineStyle.THIN);
	    cellFont.setColour(Colour.BLACK);
	    WritableCellFormat cellFormatWhite = new WritableCellFormat(cellFont);
	    cellFormatWhite.setBackground(Colour.WHITE);
	    cellFormatWhite.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormatWhite.setAlignment(Alignment.LEFT);
	    cellFormatWhite.setWrap(true);
	    cellFormatWhite.setBorder(Border.ALL, BorderLineStyle.THIN);
	    WritableCellFormat cellFormat=null;

		WritableCell cellCLIENT_ORDER_ID=null;
		WritableCell cellCLIENT_OTHER_ID=null;	
		WritableCell cellPO_NUMBER=null;
		WritableCell cellFIRST_NAME=null;	
		WritableCell cellLAST_NAME=null;
		WritableCell cellCLIENT_NUMBER=null;
		WritableCell cellCLIENT_STREET=null;	
		WritableCell cellCLIENT_CITY=null;	
		WritableCell cellCLIENT_PROVINCE=null;	
		WritableCell cellCLIENT_POSTAL_CODE=null;
		WritableCell cellCLIENT_PRODUCT_NUMBER=null;	
		WritableCell cellQUANTITY=null;	
		WritableCell cellLS_PRODUCT_ID=null;	
		WritableCell cellPRODUCT_TITLE=null;	
		WritableCell cellCOST=null;	
		WritableCell cellSHIPPING_COST=null;	
		WritableCell cellTRACKING_NUMBER=null;	
		WritableCell cellSHIPPING_COMPANY=null;	
		WritableCell cellSHIPPED_DATE=null;

		//LABELS
		Label labelCLIENT_ORDER_ID=null;
		Label labelCLIENT_OTHER_ID=null;	
		Label labelPO_NUMBER=null;
		Label labelFIRST_NAME=null;	
		Label labelLAST_NAME=null;
		Label labelCLIENT_NUMBER=null;
		Label labelCLIENT_STREET=null;	
		Label labelCLIENT_CITY=null;	
		Label labelCLIENT_PROVINCE=null;	
		Label labelCLIENT_POSTAL_CODE=null;
		Label labelCLIENT_PRODUCT_NUMBER=null;	
		Label labelQUANTITY=null;	
		Label labelLS_PRODUCT_ID=null;	
		Label labelPRODUCT_TITLE=null;	
		Label labelCOST=null;	
		Label labelSHIPPING_COST=null;	
		Label labelTRACKING_NUMBER=null;	
		Label labelSHIPPING_COMPANY=null;	
		Label labelSHIPPED_DATE=null;

		//START FROM ROW_TO_BEGIN
		row = ROW_TO_BEGIN;
		int orderIndex=0;
		int pair=0;
		for (OrdersDTO orderDTO : ordersListDTO) {
					orderIndex++;
					pair=orderIndex%2;
					switch (pair) {
					case 0:
						cellFormat=cellFormatWhite;
						break;
					case 1:
						cellFormat=cellFormatOrange;
						break;
					}
				    sheetToEdit.setRowView(row, 23*23);
					String CLIENT_ORDER_ID="";	
					String CLIENT_OTHER_ID="";		
					String PO_NUMBER="";	
					String FIRST_NAME="";		
					String LAST_NAME="";	
					String CLIENT_NUMBER="";	
					String CLIENT_STREET="";	
					String CLIENT_CITY="";		
					String CLIENT_PROVINCE="";		
					String CLIENT_POSTAL_CODE="";		
					String CLIENT_PRODUCT_NUMBER="";		
					String QUANTITY="";		
					String LS_PRODUCT_ID="";		
					String PRODUCT_TITLE="";		
					String COST="";		
					Double SHIPPING_COST=null;
					String strSHIPPING_COST="";
					String TRACKING_NUMBER="";		
					String SHIPPING_COMPANY="";		
					String SHIPPED_DATE="";	

					//------------------ COL_PO_NUMBER=2 ----------------
					if (orderDTO.getProductOrderNumber()!= null)PO_NUMBER = orderDTO.getProductOrderNumber();
					labelPO_NUMBER= new Label(COL_PO_NUMBER-1, row, PO_NUMBER,cellFormat);
					cellPO_NUMBER = (WritableCell) labelPO_NUMBER;
					sheetToEdit.addCell(cellPO_NUMBER);
					
					//------------------ COL_FIRST_NAME=3 ---------------
					if (orderDTO.getClientFirstName()!= null)FIRST_NAME = orderDTO.getClientFirstName();
					labelFIRST_NAME= new Label(COL_FIRST_NAME-1, row, FIRST_NAME,cellFormat);
					cellFIRST_NAME = (WritableCell) labelFIRST_NAME;
					sheetToEdit.addCell(cellFIRST_NAME);
					
					//------------------ COL_LAST_NAME=4 ----------------
					if (orderDTO.getClientLastName()!= null)LAST_NAME = orderDTO.getClientLastName();
					labelLAST_NAME= new Label(COL_LAST_NAME-1, row, LAST_NAME,cellFormat);
					cellLAST_NAME = (WritableCell) labelLAST_NAME;
					sheetToEdit.addCell(cellLAST_NAME);
					
					//------------------ COL_CLIENT_STREET=5 ------------	
					
					if (orderDTO.getClientStreet()!= null)CLIENT_STREET = orderDTO.getClientStreet();
					labelCLIENT_STREET= new Label(COL_CLIENT_STREET-1, row, CLIENT_STREET,cellFormat);
					cellCLIENT_STREET = (WritableCell) labelCLIENT_STREET;
					sheetToEdit.addCell(cellCLIENT_STREET);

					//------------------ COL_CLIENT_CITY=6 --------------
					if (orderDTO.getClientCity()!= null)CLIENT_CITY = orderDTO.getClientCity();
					labelCLIENT_CITY= new Label(COL_CLIENT_CITY-1, row, CLIENT_CITY,cellFormat);
					cellCLIENT_CITY = (WritableCell) labelCLIENT_CITY;
					sheetToEdit.addCell(cellCLIENT_CITY);
					
					//------------------ COL_CLIENT_PROVINCE=7 ---------
					if (orderDTO.getClientProvince()!= null)CLIENT_PROVINCE = orderDTO.getClientProvince();
					labelCLIENT_PROVINCE= new Label(COL_CLIENT_PROVINCE-1, row, CLIENT_PROVINCE,cellFormat);
					cellCLIENT_PROVINCE = (WritableCell) labelCLIENT_PROVINCE;
					sheetToEdit.addCell(cellCLIENT_PROVINCE);
					
					//------------------ COL_CLIENT_POSTAL_CODE=8 ------
					if (orderDTO.getClientPostalCode()!= null)CLIENT_POSTAL_CODE = orderDTO.getClientPostalCode();
					labelCLIENT_POSTAL_CODE= new Label(COL_CLIENT_POSTAL_CODE-1, row, CLIENT_POSTAL_CODE,cellFormat);
					cellCLIENT_POSTAL_CODE = (WritableCell) labelCLIENT_POSTAL_CODE;
					sheetToEdit.addCell(cellCLIENT_POSTAL_CODE);
					
					//------------------ COL_CLIENT_ORDER_ID=9 ----------
					if (orderDTO.getClientOrderNumber()!= null)CLIENT_ORDER_ID = orderDTO.getClientOrderNumber();
					labelCLIENT_ORDER_ID = new Label(COL_CLIENT_ORDER_ID-1, row, CLIENT_ORDER_ID,cellFormat);
					cellCLIENT_ORDER_ID = (WritableCell) labelCLIENT_ORDER_ID;
					sheetToEdit.addCell(cellCLIENT_ORDER_ID);
					
					//------------------ COL_CLIENT_OTHER_ID=10 ----------
					if (orderDTO.getClientOtherId()!= null)CLIENT_OTHER_ID = orderDTO.getClientOtherId();
					labelCLIENT_OTHER_ID= new Label(COL_CLIENT_OTHER_ID-1, row, CLIENT_OTHER_ID,cellFormat);
					cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
					sheetToEdit.addCell(cellCLIENT_OTHER_ID);

					//------------------ COL_CLIENT_NUMBER=11 ------------
					if (orderDTO.getClientNumber()!= null)CLIENT_NUMBER = orderDTO.getClientNumber();
					labelCLIENT_NUMBER= new Label(COL_CLIENT_NUMBER-1, row, CLIENT_NUMBER,cellFormat);
					cellCLIENT_NUMBER = (WritableCell) labelCLIENT_NUMBER;
					sheetToEdit.addCell(cellCLIENT_NUMBER);
					
					OrdersRows orderRow=orderDTO.getRowsList().get(0);
					
					//------------------ COL_CLIENT_PRODUCT_NUMBER=12 ---	
					if (orderRow.getClientProductNumber()!= null)CLIENT_PRODUCT_NUMBER = orderRow.getClientProductNumber();
					labelCLIENT_PRODUCT_NUMBER= new Label(COL_CLIENT_PRODUCT_NUMBER-1, row, CLIENT_PRODUCT_NUMBER,cellFormat);
					cellCLIENT_PRODUCT_NUMBER = (WritableCell) labelCLIENT_PRODUCT_NUMBER;
					sheetToEdit.addCell(cellCLIENT_PRODUCT_NUMBER);

					//------------------ COL_QUANTITY=13 ----------------	
					if (orderRow.getQuantity()!= null)QUANTITY = orderRow.getQuantity()+"";
					labelQUANTITY= new Label(COL_QUANTITY-1, row,QUANTITY,cellFormat);
					cellQUANTITY = (WritableCell) labelQUANTITY;
					sheetToEdit.addCell(cellQUANTITY);
					
					//------------------ COL_LS_PRODUCT_ID=14 -----------	
					if (orderRow.getLsProductID()!= null)LS_PRODUCT_ID = orderRow.getLsProductID();
					labelLS_PRODUCT_ID= new Label(COL_LS_PRODUCT_ID-1, row, LS_PRODUCT_ID,cellFormat);
					cellLS_PRODUCT_ID = (WritableCell) labelLS_PRODUCT_ID;
					sheetToEdit.addCell(cellLS_PRODUCT_ID);
					
					//------------------ COL_PRODUCT_TITLE=15 -----------
					Long productId=orderRow.getProductId();	
					if (productId!= null && productId!=0L) {
							ProductDTO productDTO = null;
							try {
								productDTO = productService.getProductById(productId);
							} catch (ServiceException e) {
								e.printStackTrace();
							}
							if(productDTO!=null){
								PRODUCT_TITLE=productDTO.getNameEng().getName();
								PRODUCT_TITLE=PRODUCT_TITLE.replaceAll(",", " ");
							}
						}
					labelPRODUCT_TITLE= new Label(COL_PRODUCT_TITLE-1, row, PRODUCT_TITLE,cellFormat);
					cellPRODUCT_TITLE = (WritableCell) labelPRODUCT_TITLE;
					sheetToEdit.addCell(cellPRODUCT_TITLE);
						
					//------------------ COL_COST=16 --------------------	
					if (orderRow.getUnitPrice()!= null)	COST = orderRow.getUnitPrice()+"";
					labelCOST= new Label(COL_COST-1, row, COST,cellFormat);
					cellCOST = (WritableCell) labelCOST;
					sheetToEdit.addCell(cellCOST);
					
					//------------------ COL_SHIPPING_COST=17 -----------	
					SHIPPING_COST = orderRow.getShippingPrice();
					if (SHIPPING_COST!= null) {
						Double multiplier=Double.parseDouble(userDTO.getMultiplier());
						SHIPPING_COST=SHIPPING_COST*(1+multiplier/100);
						
						//if user has a special shipping
						OrdersSpecialShippingDTO ordSpecialShipDTO=new OrdersSpecialShippingDTO();
						ordSpecialShipDTO.setProductId(orderDTO.getProductId());
						ordSpecialShipDTO.setUserId(orderDTO.getUserId());
						OrdersSpecialShippingDTO OrdSpecialShip=orderService.getOrderSpecialShipping(ordSpecialShipDTO);
						if(OrdSpecialShip!=null)SHIPPING_COST=OrdSpecialShip.getShippingPrice();
						SHIPPING_COST = (double) Math.round(SHIPPING_COST * 100) / 100;
						//2 decimal
						strSHIPPING_COST=orderService.getStringFromDouble(SHIPPING_COST, 2);
					}
					
					labelSHIPPING_COST= new Label(COL_SHIPPING_COST-1, row, strSHIPPING_COST,cellFormat);
					cellSHIPPING_COST = (WritableCell) labelSHIPPING_COST;
					sheetToEdit.addCell(cellSHIPPING_COST);
					
					//------------------ COL_TRACKING_NUMBER=18 ---------	
					if (orderRow.getTrackingNumber()!= null) {
						TRACKING_NUMBER = orderRow.getTrackingNumber();
						labelTRACKING_NUMBER= new Label(COL_TRACKING_NUMBER-1, row, TRACKING_NUMBER,cellFormat);
						cellTRACKING_NUMBER = (WritableCell) labelTRACKING_NUMBER;
						sheetToEdit.addCell(cellTRACKING_NUMBER);
					}
					//------------------ COL_SHIPPING_COMPANY=19 --------	
					if (orderRow.getShippingCompany()!= null)SHIPPING_COMPANY = orderRow.getShippingCompany();
					labelSHIPPING_COMPANY= new Label(COL_SHIPPING_COMPANY-1, row, SHIPPING_COMPANY,cellFormat);
					cellSHIPPING_COMPANY = (WritableCell) labelSHIPPING_COMPANY;
					sheetToEdit.addCell(cellSHIPPING_COMPANY);
					
					//------------------ COL_SHIPPED_DATE=20 ------------
					if (orderRow.getShippedDate()!= null) {
						SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
						SHIPPED_DATE=frm.format(orderRow.getShippedDate());
					}
					labelSHIPPED_DATE= new Label(COL_SHIPPED_DATE-1, row, SHIPPED_DATE,cellFormat);
					cellSHIPPED_DATE = (WritableCell) labelSHIPPED_DATE;
					sheetToEdit.addCell(cellSHIPPED_DATE);
					++row;
				}
		workbookCopy.write();
		workbookCopy.close();
		existingWorkbook.close();
		} catch (Exception x) {
		x.printStackTrace();
		}
	}
	
	/*==========================================================
	 		create File orders confirmation XLS Format B
	  ==========================================================*/
	public static void createFilesOrdersXLSFormatB(String location,String fileName,List<OrdersDTO> ordersListDTO,UserDTO userDTO){
		
		//clean User Folder
		cleanUserFolder(location,fileName);
		
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		//COLUMNS NUMBER
		final int COL_CLIENT_ORDER_ID=1;
		final int COL_CLIENT_OTHER_ID=2;
		final int COL_FIRST_NAME=3;
		final int COL_LAST_NAME=4;
		final int COL_PRODUCT_ID=5;
		final int COL_SUPPLIER_SKU=6;
		final int COL_PRODUCT_NAME=7;
		final int COL_TRACKING_NUMBER=8;
		final int COL_COURIER=9;
		final int COL_SHIPPED_DATE=10;

		File fileDataOrders=new File(location); 
		String pathDataOrders=location;
		for(int i=0;i<=1;i++){
			fileDataOrders=new File(pathDataOrders); 
			pathDataOrders=fileDataOrders.getParent();
		}
		int row = ROW_TO_BEGIN;
		try {
		Workbook existingWorkbook = Workbook.getWorkbook(new File(pathDataOrders+"/loyaltySourceAdmin/WEB-INF/jsp/orders/data/"+"ordersConfirmTemplateFB.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(location+fileName), existingWorkbook);
		WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);
		
	    // Create cell font and format
	    WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
	    cellFont.setColour(Colour.BLACK);
	    WritableCellFormat cellFormatOrange = new WritableCellFormat(cellFont);
	    cellFormatOrange.setBackground(Colour.LIGHT_TURQUOISE);
	    cellFormatOrange.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormatOrange.setAlignment(Alignment.LEFT);
	    cellFormatOrange.setWrap(true);
	    cellFormatOrange.setBorder(Border.ALL, BorderLineStyle.THIN);
	    cellFont.setColour(Colour.BLACK);
	    WritableCellFormat cellFormatWhite = new WritableCellFormat(cellFont);
	    cellFormatWhite.setBackground(Colour.WHITE);
	    cellFormatWhite.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormatWhite.setAlignment(Alignment.LEFT);
	    cellFormatWhite.setWrap(true);
	    cellFormatWhite.setBorder(Border.ALL, BorderLineStyle.THIN);
	    WritableCellFormat cellFormat=null;

		WritableCell cellCLIENT_ORDER_ID=null;
		WritableCell cellCLIENT_OTHER_ID=null;
		WritableCell cellFIRST_NAME=null;
		WritableCell cellLAST_NAME=null;
		WritableCell cellPRODUCT_ID=null;
		WritableCell cellSUPPLIER_SKU=null;
		WritableCell cellPRODUCT_NAME=null;
		WritableCell cellTRACKING_NUMBER=null;
		WritableCell cellCOURIER=null;
		WritableCell cellSHIPPED_DATE=null;

		//LABELS
		
		Label labelCLIENT_ORDER_ID=null;
		Label labelCLIENT_OTHER_ID=null;
		Label labelFIRST_NAME=null;
		Label labelLAST_NAME=null;
		Label labelPRODUCT_ID=null;
		Label labelSUPPLIER_SKU=null;
		Label labelPRODUCT_NAME=null;
		Label labelTRACKING_NUMBER=null;
		Label labelCOURIER=null;
		Label labelSHIPPED_DATE=null;

		//START FROM ROW_TO_BEGIN
		row = ROW_TO_BEGIN;
		int orderIndex=0;
		int pair=0;
		for (OrdersDTO orderDTO : ordersListDTO) {
					orderIndex++;
					pair=orderIndex%2;
					switch (pair) {
					case 0:
						cellFormat=cellFormatWhite;
						break;
					case 1:
						cellFormat=cellFormatOrange;
						break;
					}
				    sheetToEdit.setRowView(row, 23*23);

					String CLIENT_ORDER_ID="";
					String CLIENT_OTHER_ID="";
					String FIRST_NAME="";
					String LAST_NAME="";
					String PRODUCT_ID="";
					String SUPPLIER_SKU="";
					String PRODUCT_NAME="";
					String TRACKING_NUMBER="";
					String COURIER="";
					String SHIPPED_DATE="";

					//--------------  1: CLIENT_ORDER_ID  ----------------
					if(orderDTO.getClientOrderNumber()!=null)CLIENT_ORDER_ID=orderDTO.getClientOrderNumber();
					labelCLIENT_ORDER_ID= new Label(COL_CLIENT_ORDER_ID-1, row, CLIENT_ORDER_ID,cellFormat);
					cellCLIENT_ORDER_ID = (WritableCell) labelCLIENT_ORDER_ID;
					sheetToEdit.addCell(cellCLIENT_ORDER_ID);
					
					//--------------  2: CLIENT_OTHER_ID ------------------
					if(orderDTO.getClientOtherId()!=null)CLIENT_OTHER_ID=orderDTO.getClientOtherId();
					labelCLIENT_OTHER_ID= new Label(COL_CLIENT_OTHER_ID-1, row, CLIENT_OTHER_ID,cellFormat);
					cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
					sheetToEdit.addCell(cellCLIENT_OTHER_ID);
					
					//--------------  3: FIRST_NAME  ---------------
					if(orderDTO.getClientFirstName()!=null)FIRST_NAME=orderDTO.getClientFirstName();
					labelFIRST_NAME= new Label(COL_FIRST_NAME-1, row, FIRST_NAME,cellFormat);
					cellFIRST_NAME = (WritableCell) labelFIRST_NAME;
					sheetToEdit.addCell(cellFIRST_NAME);
					
					//--------------  4: LAST_NAME -----------------
					if(orderDTO.getClientLastName()!=null)LAST_NAME=orderDTO.getClientLastName();
					labelLAST_NAME= new Label(COL_LAST_NAME-1, row, LAST_NAME,cellFormat);
					cellLAST_NAME = (WritableCell) labelLAST_NAME;
					sheetToEdit.addCell(cellLAST_NAME);
					
					OrdersRows orderRow=orderDTO.getRowsList().get(0);
					
					//--------------  5: PRODUCT_ID ----------------
					if(orderRow.getClientProductNumber()!=null)PRODUCT_ID=orderRow.getClientProductNumber();
					labelPRODUCT_ID= new Label(COL_PRODUCT_ID-1, row, PRODUCT_ID,cellFormat);
					cellPRODUCT_ID = (WritableCell) labelPRODUCT_ID;
					sheetToEdit.addCell(cellPRODUCT_ID);
					
					//--------------  6: SUPPLIER_SKU --------------
					if(orderRow.getLsProductID()!=null)SUPPLIER_SKU=orderRow.getLsProductID();
					labelSUPPLIER_SKU= new Label(COL_SUPPLIER_SKU-1, row, SUPPLIER_SKU,cellFormat);
					cellSUPPLIER_SKU = (WritableCell) labelSUPPLIER_SKU;
					sheetToEdit.addCell(cellSUPPLIER_SKU);
					
					//--------------  7: PRODUCT_NAME --------------			
					if(orderRow.getProductId()!=null && orderRow.getProductId()!=0L){
						Long productId=orderRow.getProductId();
						ProductDTO productDTO=productService.getProductById(productId);
						if(productDTO!=null){
							PRODUCT_NAME=productDTO.getNameEng().getName();
							PRODUCT_NAME=PRODUCT_NAME.replaceAll(",", " ");
						}
					}
					labelPRODUCT_NAME= new Label(COL_PRODUCT_NAME-1, row, PRODUCT_NAME,cellFormat);
					cellPRODUCT_NAME = (WritableCell) labelPRODUCT_NAME;
					sheetToEdit.addCell(cellPRODUCT_NAME);

					//--------------  8: TRACKING_NUMBER -----------
					if(orderRow.getTrackingNumber()!=null)TRACKING_NUMBER="#"+orderRow.getTrackingNumber();
					labelTRACKING_NUMBER= new Label(COL_TRACKING_NUMBER-1, row, TRACKING_NUMBER,cellFormat);
					cellTRACKING_NUMBER = (WritableCell) labelTRACKING_NUMBER;
					sheetToEdit.addCell(cellTRACKING_NUMBER);
					
					//--------------  9: COURIER -------------------
					if(orderRow.getShippingCompany()!=null)COURIER=orderRow.getShippingCompany();
					labelCOURIER= new Label(COL_COURIER-1, row, COURIER,cellFormat);
					cellCOURIER = (WritableCell) labelCOURIER;
					sheetToEdit.addCell(cellCOURIER);

					//-------------- 10: SHIPPED_DATE -------------------			
					if (orderRow.getShippedDate()!= null) {
						SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
						SHIPPED_DATE=frm.format(orderRow.getShippedDate());
					}		
					labelSHIPPED_DATE= new Label(COL_SHIPPED_DATE-1, row, SHIPPED_DATE,cellFormat);
					cellSHIPPED_DATE = (WritableCell) labelSHIPPED_DATE;
					sheetToEdit.addCell(cellSHIPPED_DATE);	

					++row;
				}
		workbookCopy.write();
		workbookCopy.close();
		existingWorkbook.close();
		} catch (Exception x) {
		x.printStackTrace();
		}
	}
	

	/*==========================================================
	 			create File orders confirmation CSV Format A
	  ==========================================================*/
	public static void createFilesOrdersCSVFormatA(String location,String fileName, List<OrdersDTO> ordersListDTO,UserDTO userDTO){
		//clean User Folder
		cleanUserFolder(location,fileName);
		String data;
		try{
			fileName=location+fileName;
			File file = new File(fileName);
			if(file.exists())file.delete();
			PrintWriter pw= new PrintWriter(new FileWriter(fileName,true),true);
			data="PO_NUMBER,"+"FIRST_NAME,"+"LAST_NAME,"+"CLIENT_STREET,"+"CLIENT_CITY,"+"CLIENT_PROVINCE,"+
			"CLIENT_POSTAL_CODE,"+"CLIENT_ORDER_ID,"+"CLIENT_OTHER_ID,"+"CLIENT_NUMBER,"+"CLIENT_PRODUCT_NUMBER,"+
			"QUANTITY,"+"LS_PRODUCT_ID,"+"PRODUCT_TITLE,"+"COST,"+"SHIPPING_COST,"+"TRACKING_NUMBER,"+	
			"SHIPPING_COMPANY,"+"SHIPPED_DATE";
			pw.println(data);
			//Creation of csv for Canada Post
			for (OrdersDTO orderDTO : ordersListDTO) {
				data="";
				String PO_NUMBER="";
				String FIRST_NAME="";
				String LAST_NAME="";
				String CLIENT_STREET="";	
				String CLIENT_CITY="";	
				String CLIENT_PROVINCE="";	
				String CLIENT_POSTAL_CODE="";	
				String CLIENT_ORDER_ID="";	
				String CLIENT_OTHER_ID="";
				String CLIENT_NUMBER="";;
				String CLIENT_PRODUCT_NUMBER="";
				String QUANTITY="";	
				String LS_PRODUCT_ID="";	
				String PRODUCT_TITLE="";	
				String COST="";	
				Double SHIPPING_COST=null;	
				String strSHIPPING_COST="";
				String TRACKING_NUMBER="";	
				String SHIPPING_COMPANY="";	
				String SHIPPED_DATE="";		
	
				//-------------- PO_NUMBER ---------------- 
				if(orderDTO.getProductOrderNumber()!=null)PO_NUMBER=orderDTO.getProductOrderNumber();
				data+=PO_NUMBER+",";
				
				//-------------- FIRST_NAME ---------------
				if(orderDTO.getClientFirstName()!=null)FIRST_NAME=orderDTO.getClientFirstName();
				data+=FIRST_NAME+",";
				
				//-------------- LAST_NAME ----------------- 
				if(orderDTO.getClientLastName()!=null)LAST_NAME=orderDTO.getClientLastName();
				data+=LAST_NAME+",";
				
				//-------------- CLIENT_STREET --------------	
				if(orderDTO.getClientStreet()!=null)CLIENT_STREET=orderDTO.getClientStreet();
				data+=CLIENT_STREET+",";
				
				//-------------- CLIENT_CITY -----------------
				if(orderDTO.getClientCity()!=null)CLIENT_CITY=orderDTO.getClientCity();
				data+=CLIENT_CITY+",";
				
				//-------------- CLIENT_PROVINCE -------------	
				if(orderDTO.getClientProvince()!=null)CLIENT_PROVINCE=orderDTO.getClientProvince();
				data+=CLIENT_PROVINCE+",";
				
				//-------------- CLIENT_POSTAL_CODE -----------
				if(orderDTO.getClientPostalCode()!=null)CLIENT_POSTAL_CODE=orderDTO.getClientPostalCode();
				data+=CLIENT_POSTAL_CODE+",";
				
				//-------------- CLIENT_ORDER_ID ---------------	
				if(orderDTO.getClientOrderNumber()!=null)CLIENT_ORDER_ID=orderDTO.getClientOrderNumber();
				data+=CLIENT_ORDER_ID+",";
				
				//-------------- CLIENT_OTHER_ID ---------------
				if(orderDTO.getClientOtherId()!=null)CLIENT_OTHER_ID=orderDTO.getClientOtherId();
				data+=CLIENT_OTHER_ID+",";
				
				//-------------- CLIENT_NUMBER -----------------
				if(orderDTO.getClientNumber()!=null)CLIENT_NUMBER=orderDTO.getClientNumber();
				data+=CLIENT_NUMBER+",";
				
				OrdersRows orderRow=orderDTO.getRowsList().get(0);
				
				//-------------- CLIENT_PRODUCT_NUMBER ----------
				if(orderRow.getClientProductNumber()!=null)CLIENT_PRODUCT_NUMBER=orderRow.getClientProductNumber();
				data+=CLIENT_PRODUCT_NUMBER+",";
				
				//-------------- QUANTITY  ---------------------- 
				if(orderRow.getQuantity()!=null)QUANTITY=orderRow.getQuantity()+"";
				data+=QUANTITY+",";
				
				//-------------- LS_PRODUCT_ID ------------------	
				if(orderRow.getLsProductID()!=null)LS_PRODUCT_ID=orderRow.getLsProductID();
				data+=LS_PRODUCT_ID+",";
				
				//-------------- PRODUCT_TITLE ------------------	
				if(orderRow.getProductId()!=null && orderRow.getProductId()!=0L){
					Long productId=orderRow.getProductId();
					ProductDTO productDTO=productService.getProductById(productId);
					if(productDTO!=null){
						PRODUCT_TITLE=productDTO.getNameEng().getName();
						PRODUCT_TITLE=PRODUCT_TITLE.replaceAll(",", " ");
					}
				}
				data+=PRODUCT_TITLE+",";
				
				//-------------- COST ---------------------------	
				if(orderRow.getUnitPrice()!=null)COST=orderRow.getUnitPrice()+"";
				data+=COST+",";
				
				//-------------- SHIPPING_COST ------------------	
				SHIPPING_COST=orderRow.getShippingPrice();
				if (SHIPPING_COST!= null) {
					Double multiplier=Double.parseDouble(userDTO.getMultiplier());
					SHIPPING_COST=SHIPPING_COST*(1+multiplier/100);
					//if user has a special shipping
					OrdersSpecialShippingDTO ordSpecialShipDTO=new OrdersSpecialShippingDTO();
					ordSpecialShipDTO.setProductId(orderDTO.getProductId());
					ordSpecialShipDTO.setUserId(orderDTO.getUserId());
					OrdersSpecialShippingDTO OrdSpecialShip=orderService.getOrderSpecialShipping(ordSpecialShipDTO);
					if(OrdSpecialShip!=null)SHIPPING_COST=OrdSpecialShip.getShippingPrice();
					SHIPPING_COST = (double) Math.round(SHIPPING_COST * 100) / 100;
					//2 decimal
					strSHIPPING_COST=orderService.getStringFromDouble(SHIPPING_COST, 2);
				}
				data+=strSHIPPING_COST+",";
			
				//-------------- TRACKING_NUMBER ----------------
				if(orderRow.getTrackingNumber()!=null)TRACKING_NUMBER=orderRow.getTrackingNumber();
				data+=TRACKING_NUMBER+",";
				
				//-------------- SHIPPING_COMPANY ---------------
				if(orderRow.getShippingCompany()!=null)SHIPPING_COMPANY=orderRow.getShippingCompany();
				data+=SHIPPING_COMPANY+",";
				
				//-------------- SHIPPED_DATE -------------------			
				if (orderRow.getShippedDate()!= null) {
					SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
					SHIPPED_DATE=frm.format(orderRow.getShippedDate());
				}		
				data+=SHIPPED_DATE;		
				pw.println(data);
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	/*==========================================================
	 			create File orders confirmation CSV Format B
	  ==========================================================*/
	public static void createFilesOrdersCSVFormatB(String location,String fileName, List<OrdersDTO> ordersListDTO,UserDTO userDTO){
		//clean User Folder
		cleanUserFolder(location,fileName);
		String data;
		try{
			fileName=location+fileName;
			File file = new File(fileName);
			if(file.exists())file.delete();
			PrintWriter pw= new PrintWriter(new FileWriter(fileName,true),true);
			//data="CLIENT ORDER ID,CLIENT OTHER ID,FIRST NAME,LAST NAME,PRODUCT ID,SUPPLIER SKU,PRODUCT NAME,TRACKING NUMBER,COURIER,SHIPPED DATE";
			//data="PO NUMBER,FIRST NAME,LAST NAME,PRODUCT ID,SUPPLIER SKU,PRODUCT NAME,TRACKING NUMBER,COURIER,SHIPPED DATE";
			data="PO Number,Order ID,First Name,Last Name,Product ID,Supplier Sku,Product Name,Tracking Number,Courier,Ship Date (YYYY-MM-DD)";
			pw.println(data);
			//Creation of csv for Canada Post
			for (OrdersDTO orderDTO : ordersListDTO) {
				data="";
				String CLIENT_ORDER_ID="";
				String CLIENT_OTHER_ID="";
				String FIRST_NAME="";
				String LAST_NAME="";
				String PRODUCT_ID="";
				String SUPPLIER_SKU="";
				String PRODUCT_NAME="";
				String TRACKING_NUMBER="";
				String COURIER="";
				String SHIPPED_DATE="";

				//--------------  1: CLIENT_ORDER_ID  ----------------
				if(orderDTO.getClientOrderNumber()!=null)CLIENT_ORDER_ID=orderDTO.getClientOrderNumber();
				data+=CLIENT_ORDER_ID+",";

				//--------------  2: CLIENT_OTHER_ID -----------
				if(orderDTO.getClientOtherId()!=null)CLIENT_OTHER_ID=orderDTO.getClientOtherId();
				data+=CLIENT_OTHER_ID+",";
				
				//--------------  3: FIRST_NAME  ---------------
				if(orderDTO.getClientFirstName()!=null)FIRST_NAME=orderDTO.getClientFirstName();
				data+=FIRST_NAME+",";
				
				//--------------  4: LAST_NAME -----------------
				if(orderDTO.getClientLastName()!=null)LAST_NAME=orderDTO.getClientLastName();
				data+=LAST_NAME+",";
				
				OrdersRows orderRow=orderDTO.getRowsList().get(0);
				
				//--------------  5: PRODUCT_ID ----------------
				if(orderRow.getClientProductNumber()!=null)PRODUCT_ID=orderRow.getClientProductNumber();
				data+=PRODUCT_ID+",";
				
				//--------------  6: SUPPLIER_SKU --------------
				if(orderRow.getLsProductID()!=null)SUPPLIER_SKU=orderRow.getLsProductID();
				data+=SUPPLIER_SKU+",";
				
				//--------------  7: PRODUCT_NAME --------------			
				if(orderRow.getProductId()!=null && orderRow.getProductId()!=0L){
					Long productId=orderRow.getProductId();
					ProductDTO productDTO=productService.getProductById(productId);
					if(productDTO!=null){
						PRODUCT_NAME=productDTO.getNameEng().getName();
						PRODUCT_NAME=PRODUCT_NAME.replaceAll(",", " ");
					}
				}
				data+=PRODUCT_NAME+",";

				//--------------  8: TRACKING_NUMBER -----------
				if(orderRow.getTrackingNumber()!=null)TRACKING_NUMBER="#"+orderRow.getTrackingNumber();
				data+=TRACKING_NUMBER+",";
				
				//--------------  9: COURIER -------------------
				if(orderRow.getShippingCompany()!=null)COURIER=orderRow.getShippingCompany();
				data+=COURIER+",";

				//-------------- 10: SHIPPED_DATE -------------------			
				if (orderRow.getShippedDate()!= null) {
					SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
					SHIPPED_DATE=frm.format(orderRow.getShippedDate());
				}		
				data+=SHIPPED_DATE;	
	
				pw.println(data);
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
    /*=================================================================================
					getOrderFileConfirm: Get File Name with his Extension
      =================================================================================*/
	public static void cleanUserFolder(String path,String fileName){
    	 File localFilesList=new File(path);
         File[] files = localFilesList.listFiles();
         String fileNameContains="none";
         String[] tabFileNameContains=fileName.split("_");
         if(tabFileNameContains.length>0)fileNameContains=tabFileNameContains[0];
         if(files==null)files=new File[0];
         for (File file : files) {
             String uploadFileName=file.getName();
             if (!".".equals(uploadFileName) && !"..".equals(uploadFileName) && !file.isDirectory()) {
                int index =uploadFileName.lastIndexOf(".");
                String ext= uploadFileName.substring(index+1); 
                String uploadFileNameWithoutExt=uploadFileName.substring(0,index); 
                if(uploadFileNameWithoutExt.contains(fileNameContains)){
                	File fileToDelete=new File(path+uploadFileNameWithoutExt+"."+ext);
                	fileToDelete.delete();
                	break;
                }
             }
         }
    }

	/*=======================================================================================================================
	create File orders confirmation XML for Rideau
	=========================================================================================================================*/
	public static void createFilesOrdersXML_Rideau(String location,List<OrdersDTO> ordersListDTO, UserDTO userDTO) throws ServiceException{
		if(ordersListDTO.size()>0){
			//file_seq_shipping - This element is important for Rideau.
			UserFileRecoveryDTO ufrDTO=orderService.getUserFileRecoveryByUser(userDTO.getLogin());
			int sequenceNumber = ufrDTO.getFileSeqShipping();
			String fileToDelete="day_SD" + (String.valueOf(sequenceNumber).length() < 6 ? ("000000".substring(String.valueOf(sequenceNumber).length())+ String.valueOf(sequenceNumber)):String.valueOf(sequenceNumber)) +".xml" ;
			int file_seq = sequenceNumber+1;

			// File nameing convention for rideau  SD + FCN (always of size 6) + xml
			String fileName = "day_SD" + (String.valueOf(file_seq).length() < 6 ? ("000000".substring(String.valueOf(file_seq).length())+ String.valueOf(file_seq)):String.valueOf(file_seq)) +".xml" ;

			// get the Total no orders by tracking no. 
			Map<String, String> totalOrderDetails = new LinkedHashMap<String, String>();
			totalOrderDetails = getAllOrderDetails(ordersListDTO);
			int total_orders=totalOrderDetails.size();

			//To rearrange the map - we need orders with program id RM first in the xml
			totalOrderDetails = rearrangeOrders(totalOrderDetails);


			//----------------------------------- generate XML File ------------------------------------
			File xmlOrdersFile=new File(location+fileName);
			//clean User Folder
			cleanUserFolder(location,fileToDelete);

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = null;
			try {
				docBuilder = docBuilderFactory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			}

			Document doc = docBuilder.newDocument();	
			Element rootElement = doc.createElement("status_file");
			doc.appendChild(rootElement);

			String[] tokens=null;
			String orderFileInfo = ordersListDTO.get(0).getOrderFileInfo();
			if(orderFileInfo!=null){
				tokens = orderFileInfo.split("↨"); //ask if this will work in linux or should use the ascii code to split
			}
			// create format_version under status_file (root tag)
			Element formatVersion = doc.createElement("format_version");
			if(tokens!=null && tokens[0]!=null)formatVersion.setTextContent(tokens[0]);
			rootElement.appendChild(formatVersion);

			// create file_info under status_file (root tag)
			Element fileInfo = doc.createElement("file_info");
			rootElement.appendChild(fileInfo);

			// create client_number under file_info 
			Element client_number = doc.createElement("client_number");
			if(tokens!=null && tokens[1]!=null)client_number.setTextContent(tokens[1]);
			fileInfo.appendChild(client_number);

			// create client_name under file_info 
			Element clientName = doc.createElement("client_name");
			if(tokens!=null && tokens[2]!=null)clientName.setTextContent(tokens[2]);
			fileInfo.appendChild(clientName);

			// create vendor_number under file_info 
			Element vendorNumber = doc.createElement("vendor_number");
			if(tokens!=null && tokens[3]!=null)vendorNumber.setTextContent(tokens[3]);
			fileInfo.appendChild(vendorNumber);

			// create vendor_name under file_info 
			Element vendorName = doc.createElement("vendor_name");
			if(tokens!=null && tokens[4]!=null)vendorName.setTextContent(tokens[4]);
			fileInfo.appendChild(vendorName);

			// create file_type under file_info 
			Element fileType = doc.createElement("file_type");
			fileType.setTextContent("SD");
			fileInfo.appendChild(fileType);

			// create file_sequence under file_info 
			Element fileSequence = doc.createElement("file_sequence");
			fileSequence.setTextContent(String.valueOf(file_seq));
			fileInfo.appendChild(fileSequence);

			//create file_date under file_info 
			Date date = new Date();
			String today= new SimpleDateFormat("yyyy-MM-dd").format(date);
			Element fileDate = doc.createElement("file_date");
			fileDate.setTextContent(today.toString());
			fileInfo.appendChild(fileDate);

			// create orders under status_file (root tag)
			Element orders = doc.createElement("orders");
			rootElement.appendChild(orders);

			Attr numOrders = doc.createAttribute("num_orders");
			orders.setAttributeNode(numOrders);
			numOrders.setTextContent(String.valueOf(total_orders));


			for (String key : totalOrderDetails.keySet()) {
				List<OrdersDTO> subOrdersDTO =getSubOrders(ordersListDTO,key,totalOrderDetails.get(key));
				int noOfSubOrders = subOrdersDTO.size();

				Element order_details_Element = doc.createElement("order_detail");
				orders.appendChild(order_details_Element);

				tokens=null;
				String productOrderNumber = totalOrderDetails.get(key);
				if(productOrderNumber!=null){
					tokens = productOrderNumber.split(" ");
				}
				if(tokens!=null && tokens.length==3){
					//program_id
					Element program_id_Element = doc.createElement("program_id");
					String program_id=tokens[1];
					if(program_id!=null)program_id_Element.setTextContent(program_id);
					order_details_Element.appendChild(program_id_Element);

					//client_po
					Element client_po_Element = doc.createElement("client_po");	
					String client_po=tokens[2];
					if(client_po!=null)client_po_Element.setTextContent(client_po);
					order_details_Element.appendChild(client_po_Element);

					//source
					Element source_Element = doc.createElement("source");	
					String source=tokens[0];
					if(source!=null)source_Element.setTextContent(source);
					order_details_Element.appendChild(source_Element);
				}
				//ship_to_name
				Element ship_to_name_Element = doc.createElement("ship_to_name");	
				String ship_to_name=subOrdersDTO.get(0).getClientFirstName();
				String lname = subOrdersDTO.get(0).getClientLastName();
				if(ship_to_name!=null)ship_to_name_Element.setTextContent(ship_to_name+" "+ lname);
				order_details_Element.appendChild(ship_to_name_Element);

				//ship_to_postal_code
				Element ship_to_postal_code_Element = doc.createElement("ship_to_postal_code");	
				String ship_to_postal_code = subOrdersDTO.get(0).getClientPostalCode();
				if(ship_to_postal_code!=null)ship_to_postal_code_Element.setTextContent(ship_to_postal_code);
				order_details_Element.appendChild(ship_to_postal_code_Element);

				//shipment
				Element shipment_Element = doc.createElement("shipment");	
				order_details_Element.appendChild(shipment_Element);

				//carrier
				Element carrier_Element = doc.createElement("carrier");
				String shipping_company=subOrdersDTO.get(0).getRowsList().get(0).getShippingCompany();
				if(shipping_company!=null)carrier_Element.setTextContent(shipping_company);
				shipment_Element.appendChild(carrier_Element);

				//service_code
				Element service_code_Element = doc.createElement("service_code");	
				shipment_Element.appendChild(service_code_Element);

				//waybill
				Element waybill_Element = doc.createElement("waybill");	
				String waybill=subOrdersDTO.get(0).getRowsList().get(0).getTrackingNumber();
				if(waybill!=null)waybill_Element.setTextContent(waybill);
				shipment_Element.appendChild(waybill_Element);

				//items
				Element items_Element = doc.createElement("items");	// items with same po number
				order_details_Element.appendChild(items_Element);

				//num_items
				Attr num_items = doc.createAttribute("num_items"); // no of orders with same po number
				num_items.setTextContent(String.valueOf(noOfSubOrders));
				items_Element.setAttributeNode(num_items);
				int lineNumber = 1;
				for(OrdersDTO subOrder :subOrdersDTO){
					//item_detail
					Element item_detail_Element = doc.createElement("item_detail");	
					items_Element.appendChild(item_detail_Element);

					//client_po_detail
					Element client_po_detail_Element = doc.createElement("client_po_detail");
					String client_po_detail = subOrder.getClientOrderNumber();
					if(client_po_detail!=null)client_po_detail_Element.setTextContent(client_po_detail);
					item_detail_Element.appendChild(client_po_detail_Element);

					//line_number
					Element line_number_Element = doc.createElement("line_number");
					line_number_Element.setTextContent(String.valueOf(lineNumber));
					lineNumber++;
					item_detail_Element.appendChild(line_number_Element);

					//status_type
					Element status_type_Element = doc.createElement("status_type"); 
					status_type_Element.setTextContent("SH");
					item_detail_Element.appendChild(status_type_Element);

					OrdersRows orderRow=subOrder.getRowsList().get(0);
					//status_date
					Element status_date_Element = doc.createElement("status_date"); 
					Date shipped_date=orderRow.getShippedDate();
					if(shipped_date!=null){
						SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
						String strDate=frm.format(shipped_date);
						status_date_Element.setTextContent(strDate);
					}
					item_detail_Element.appendChild(status_date_Element);

					//vendor_item_number - Ls product ID
					Element vendor_item_number_Element = doc.createElement("vendor_item_number"); 
					String vendor_item_number= orderRow.getLsProductID();
					if(vendor_item_number!=null)vendor_item_number_Element.setTextContent(vendor_item_number);
					item_detail_Element.appendChild(vendor_item_number_Element);

					//item_price
					Element item_price_Element = doc.createElement("item_price"); 
					String item_price=orderRow.getUnitPrice()+"";
					if(item_price!=null)item_price_Element.setTextContent(item_price);
					item_detail_Element.appendChild(item_price_Element);

					//ordered_qty - Ordered quantity would be null in case the ordered in already invoiced.
					int ordered_qty = 0;
					Element ordered_qty_Element = doc.createElement("ordered_qty");
					ordered_qty = getOrderedQuantity(orderRow.getLsOrderId()).intValue();
					ordered_qty_Element.setTextContent(String.valueOf(ordered_qty));
					item_detail_Element.appendChild(ordered_qty_Element);


					//shipped_qty
					Element shipped_qty_Element = doc.createElement("shipped_qty"); 
					String shipped_qty=orderRow.getQuantity().intValue()+"";
					if(shipped_qty!=null)shipped_qty_Element.setTextContent(shipped_qty);
					item_detail_Element.appendChild(shipped_qty_Element);

					//backordered_qty
					Element backordered_qty_Element = doc.createElement("backordered_qty"); 
					int totalQuanityShippedTillDate= getTotalShippedQuantityForSplitOrders(orderRow.getLsOrderId()).intValue();
					backordered_qty_Element.setTextContent(String.valueOf(ordered_qty- totalQuanityShippedTillDate));
					item_detail_Element.appendChild(backordered_qty_Element);

					//comments
					Element comments_Element = doc.createElement("comments"); 
					String comments = orderRow.getNotes();
					if(comments!=null)comments_Element.setTextContent(comments);
					item_detail_Element.appendChild(comments_Element);
				}
			}

			//Create XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = null;
			try {
				transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			}
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(xmlOrdersFile);
			try {
				transformer.transform(source, result);
				boolean res = orderService.updateFileSequenceShipping(ufrDTO.getUserId(),file_seq); 
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println(" No new orders shipped for Rideau today.");
		}
	}

	/*================================================================================================================
	Method that returns a hashtable with the total order_details that we need to create in the xml. 
	==================================================================================================================*/
	public static Hashtable<String, String> getAllOrderDetails(List<OrdersDTO> listOrdersDay){
		Hashtable<String, String> result=new Hashtable<String, String>();
		for(OrdersDTO temp : listOrdersDay ){
			result.put(temp.getTrackingNumber(), temp.getProductOrderNumber());
		}
		return result;
	}

	/*================================================================================================================
	Method to store the orders starting with product id as RM first and then the remaining orders. 
	==================================================================================================================*/
	private static Map<String, String> rearrangeOrders(Map<String, String> totalOrderDetails){
		Map<String, String> mySortedMap = new LinkedHashMap<String, String>();
		for (String key : totalOrderDetails.keySet()) {
			if(totalOrderDetails.get(key).contains("C RM")){
				mySortedMap.put(key,totalOrderDetails.get(key));
			}
		}
		for (String key : totalOrderDetails.keySet()) {
			if(!totalOrderDetails.get(key).contains("C RM")){
				mySortedMap.put(key,totalOrderDetails.get(key));
			}
		}
		return mySortedMap;
	}
	/*================================================================================================================
	Method to return List of OrdersDTO with same tracking number and product order number. 
	==================================================================================================================*/
	private static List<OrdersDTO> getSubOrders(List<OrdersDTO> ordersListDTO,String trackingNo, String productOrderNumber) {
		List<OrdersDTO> orders = new ArrayList<OrdersDTO>();
		for(OrdersDTO ordersDTO : ordersListDTO){
			if(ordersDTO.getProductOrderNumber().equalsIgnoreCase(productOrderNumber) && ordersDTO.getTrackingNumber().equalsIgnoreCase(trackingNo)){
				orders.add(ordersDTO);
			}
		}
		return orders;
	}
	/*======================================================================================================
	Method to return the ordered quantity for any split order. 
	=========================================================================================================*/
	private static Double getOrderedQuantity(String lsOrderId) {
		Double count = (double) 0;
		if(lsOrderId!=null){
			if(lsOrderId.contains("_")) lsOrderId = lsOrderId.substring(0,lsOrderId.indexOf('_'));
			try {
				count = orderService.getOrderedQuantity(lsOrderId);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/*======================================================================================================
	Method to return the ordered quantity for any split order. 
	=========================================================================================================*/
	private static Double getTotalShippedQuantityForSplitOrders(String lsOrderId) {
		Double count = (double) 0;
		if(lsOrderId!=null){
			if(lsOrderId.contains("_")) lsOrderId = lsOrderId.substring(0,lsOrderId.indexOf('_'));
			try {
				count = orderService.getTotalShippedQuantityForSplitOrders(lsOrderId);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
