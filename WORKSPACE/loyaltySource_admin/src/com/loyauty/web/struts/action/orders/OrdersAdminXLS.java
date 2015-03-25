package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.web.struts.action.LoyautyAction;

public class OrdersAdminXLS extends LoyautyAction{
	private static final long serialVersionUID = -8730372014253451459L;

	private OrdersService orderService;
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	@Getter @Setter
	private String lsOrderIdToPrint;
	private List<OrdersDTO>listOrdersDTO;
	@Getter @Setter
	private Long tansformAutoSignal;
	@Getter @Setter
	private Long init;
	@Getter @Setter
	private Long tansformManSignal;
	@Getter @Setter
	private Long treatOrderPageSignal;
	@Getter @Setter
	private Integer reportOrderPageSignal;
	@Getter @Setter
	private Integer etaSignal;
	@Getter @Setter
	private Integer invoicedOrderPageSignal;
	@Getter @Setter
	private Integer selectedOrdersListSignal;
	@Getter @Setter
	private Long allProgressListOrdersSignal;
	@Getter @Setter
	private String showPopupConfirmInsert;
	@Getter @Setter
	private Long printAllOrdersSignal;
	@Getter @Setter
	private String message="";
	//Collection list;
	@Getter @Setter
	private String strPrint;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private Integer selectedStatus;
	private Long allOrdersSelectedSignal;
	@Getter @Setter
	private Long generateESTFileSignal;
	//private boolean insert;
	private Integer PAGE_ITEMS_COUNT=1000000;
	private List<OrdersDTO> etaOrdersList;
	@Getter @Setter
	String secondEtaFieldName;
	public OrdersAdminXLS() throws ServiceLocatorException {
		super();	
		listOrdersDTO=new ArrayList<OrdersDTO>();
		orderService = getServiceLocator().getOrderService();
	}
	
	@SuppressWarnings("unchecked")
	@Override  
	public String execute() throws Exception {	
		HttpSession session = request.getSession(true);

		//allOrdersSelectedSignal=(Long)session.getAttribute("allOrdersSelectedSignal");
			
		String filePath = session.getServletContext().getRealPath("/");
		String filePathData=filePath+"WEB-INF/jsp/orders/data/";
		SimpleDateFormat frm=new SimpleDateFormat("dd/MM/yyyy");
		//keep search parameters to use in other classes(PrintOrdersToPDF, ...)
		Date creationDateStartArg=(Date)session.getAttribute("creationDateStartArg");
		Date creationDateEndArg=(Date)session.getAttribute("creationDateEndArg");
		Integer reportDateBetween=(Integer)session.getAttribute("reportDateBetween");
		String lsOrderId=(String)session.getAttribute("lsOrderId");
		if(lsOrderId!=null)lsOrderId=lsOrderId.toUpperCase();
		String userLogin=(String)session.getAttribute("userLogin");
		String status=(String)session.getAttribute("status");
		etaOrdersList=(List<OrdersDTO>)session.getAttribute("etaOrdersList");
		//eta2dFieldName=(String)session.getAttribute("eta2dFieldName");
		if(secondEtaFieldName==null)secondEtaFieldName="";
		if(etaOrdersList==null)etaOrdersList=new ArrayList<OrdersDTO>();
		List<Integer>listIndexColumn=(List<Integer>)session.getAttribute("listIndexColumn");
		if((reportOrderPageSignal!=null && reportOrderPageSignal!=0L)||(invoicedOrderPageSignal!=null && invoicedOrderPageSignal!=0L) || (etaSignal!=null && etaSignal!=0L)){
			allOrdersSelectedSignal=(Long)session.getAttribute("allOrdersSelectedSignal");
			if(allOrdersSelectedSignal!=null && allOrdersSelectedSignal!=0L){
				if(selectedOrdersListSignal==2)selectedOrdersListSignal=0;//execute the first method in bloc switch when admin select all orders
				if(reportOrderPageSignal!=null && reportOrderPageSignal!=0L){
					listOrdersDTO=orderService.searchOrdersWithOptionsAndSorting(creationDateStartArg, creationDateEndArg,reportDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,0);
				}else if(invoicedOrderPageSignal!=null && invoicedOrderPageSignal!=0L){
					listOrdersDTO=orderService.searchInvoicedWithSorting(creationDateStartArg, creationDateEndArg,reportDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,0);
				}
			}else{
				if((reportOrderPageSignal!=null && reportOrderPageSignal!=0L)){
					//insert=true;
					listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOReport");
				}				
				if(invoicedOrderPageSignal!=null && invoicedOrderPageSignal!=0L){
					listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOInvoiced");
				}
			}
		}

		try{
			
			if(selectedOrdersListSignal==null)selectedOrdersListSignal=0;
			/*------------------------ Change print property of order ---------------------
					catch string content values print and change print property order 
			  -----------------------------------------------------------------------------*/
			if(allOrdersSelectedSignal==null || allOrdersSelectedSignal==0L){
				String[] tabPrint=strPrint.split(",");
				for(int i=0;i<tabPrint.length;i++){
					String item=tabPrint[i];
					String[] tabItem=item.split(";");
					int index=Integer.parseInt(tabItem[0]);
					OrdersDTO orderDTO= listOrdersDTO.get(index);
					if(tabItem[1].equals("t")){
						orderDTO.setPrint(true);
					}else orderDTO.setPrint(false);
				}
				if((reportOrderPageSignal!=null && reportOrderPageSignal!=0L))
					session.setAttribute("listOrdersDTOReport",listOrdersDTO);
				if(invoicedOrderPageSignal!=null && invoicedOrderPageSignal!=0L)
					session.setAttribute("listOrdersDTOInvoiced",listOrdersDTO);
			}
			
			/*-------------------- Create a file XLS from orders list ---------------------
					  The system will create a XLS file with the client login name
	 		 ------------------------------------------------------------------------------*/
			frm=new SimpleDateFormat("ddMMyyyy");
			Date date=new Date();
			String strDate=frm.format(date);
			
			switch (selectedOrdersListSignal) {
			case 0: // generate CSV Canada Post for all Orders
				strDate=frm.format(date);
				orderService.generateAdminEstTool(listOrdersDTO, filePathData,false);
				fileInputStream = new FileInputStream(new File( filePathData+"EST_TOOL.csv"));
				fileName="EST_all_orders"+strDate+".csv";
				break;
				
			case 1: // get XLS File for list
				orderService.generateAdminXLS(listOrdersDTO, filePathData,allOrdersSelectedSignal);
				fileInputStream = new FileInputStream(new File( filePathData+"ordersAdminExport.xls"));
				fileName="list_orders"+strDate+".xls";
				break;
				
			case 2: // generate CSV Canada Post for just Orders Selected
				orderService.generateAdminEstTool(listOrdersDTO, filePathData,true);
				fileInputStream = new FileInputStream(new File( filePathData+"EST_TOOL.csv"));
				fileName="EST_orders_selected"+strDate+".csv";
				break;
				
			case 3: // generate XLS for Shipped orders of an partner Selected and Change status to "invoiced"
				orderService.generateInvoicedXLS(listOrdersDTO, filePathData,allOrdersSelectedSignal);
				fileInputStream = new FileInputStream(new File( filePathData+"invoicedOrders.xls"));
				String partnerName="";
				for (OrdersDTO orderDTO : listOrdersDTO) {
					if(orderDTO.getPrint()!=null && orderDTO.getPrint() &&
					   (orderDTO.getStatus().equals("shipped")|| orderDTO.getStatus().equals("invoiced"))){
						partnerName=orderDTO.getUserLogin();
						break;
					}
				}
				session.setAttribute("invoicedOrdersRefresh",1L);
				fileName=partnerName+"_Invoices_"+strDate+".xls";
				// PARTNER NAME_Invoices_MMDDYYY.xls
				break;
				
			case 4: // get XLS File for list
				orderService.generateEtaXLS(etaOrdersList,secondEtaFieldName, filePathData);
				fileInputStream = new FileInputStream(new File( filePathData+"etaReport.xls"));
				fileName="ETA_Report_Generated _"+userLogin+"_"+strDate+".xls";
				break;
			}
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
