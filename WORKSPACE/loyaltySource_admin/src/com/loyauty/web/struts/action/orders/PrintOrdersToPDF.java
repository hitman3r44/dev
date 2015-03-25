package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.User;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;
import lombok.Getter;
import lombok.Setter;

public class PrintOrdersToPDF  extends LoyautyAction{
	private static final long serialVersionUID = -6290756519577177205L;
	private OrdersService orderService;
	private UserService userService;
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	@Getter @Setter
	private String lsOrderIdToPrint;
	@Getter @Setter
	private List<OrdersDTO>listOrdersDTO;
	@Getter @Setter
	private Long tansformAutoSignal;
	@Getter @Setter
	private Long tansformManSignal;
	@Getter @Setter
	private Long tansformTreatSignal;
	@Getter @Setter
	private Long tansformReportSignal;
	@Getter @Setter
	private String showPopupConfirmInsert;
	@Getter @Setter
	private Long allOrdersSelectedSignal;
	@Getter @Setter
	private Long tansformInvoicedSignal;
	@Getter @Setter
	private String message="";
	@SuppressWarnings("rawtypes")
	Collection list;
	@Getter @Setter
	private String strPrint;

	Integer PAGE_ITEMS_COUNT=1000000;

	public PrintOrdersToPDF() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		listOrdersDTO=new ArrayList<OrdersDTO>();
		orderService = getServiceLocator().getOrderService();
	}

	@SuppressWarnings("unchecked")
	@Override  
	public String execute() throws Exception {	
		HttpSession session = request.getSession(true);
		session.setAttribute("generatePDF",0);
		String filePath = session.getServletContext().getRealPath("/");
		String filePathData = filePath + "WEB-INF/jsp/orders/data/";
		String logoPath= filePath + "images/orders/usersLogos/";
		showPopupConfirmInsert="visibility:hidden;display:none;";
		SimpleDateFormat frm=new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		String strDate=frm.format(date);
		fileName="orders.pdf";
		//String userLogin="anonymous";
		if(tansformAutoSignal!=null && tansformAutoSignal!=0L){
			listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOAuto");
		}else if(tansformManSignal!=null && tansformManSignal!=0L){
			listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOMan");
		}else if(tansformTreatSignal!=null && tansformTreatSignal!=0L){
			listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
		}else if(tansformReportSignal!=null && tansformReportSignal!=0L){
			//listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
			allOrdersSelectedSignal=(Long)session.getAttribute("allOrdersSelectedSignal");
			if(allOrdersSelectedSignal!=null && allOrdersSelectedSignal!=0L){
				//keep search parameters to use in other classes(PrintOrdersToPDF, ...)
				Date creationDateStartArg=(Date)session.getAttribute("creationDateStartArg");
				Date creationDateEndArg=(Date)session.getAttribute("creationDateEndArg");
				Integer reportDateBetween=(Integer)session.getAttribute("reportDateBetween");
				String lsOrderId=(String)session.getAttribute("lsOrderId");
				lsOrderId=lsOrderId.toUpperCase();
				String userLogin=(String)session.getAttribute("userLogin");
				String status=(String)session.getAttribute("status");
				List<Integer>listIndexColumn=(List<Integer>)session.getAttribute("listIndexColumn");
				listOrdersDTO=orderService.searchOrdersWithOptionsAndSorting(creationDateStartArg, creationDateEndArg,reportDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,0);
			}else{
				listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOReport");
			}
		}else if(tansformInvoicedSignal!=null && tansformInvoicedSignal!=0L){
			//listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOTreat");
			allOrdersSelectedSignal=(Long)session.getAttribute("allOrdersSelectedSignal");
			if(allOrdersSelectedSignal!=null && allOrdersSelectedSignal!=0L){
				//keep search parameters to use in other classes(PrintOrdersToPDF, ...)
				Date creationDateStartArg=(Date)session.getAttribute("creationDateStartArg");
				Date creationDateEndArg=(Date)session.getAttribute("creationDateEndArg");
				Integer reportDateBetween=(Integer)session.getAttribute("reportDateBetween");
				String lsOrderId=(String)session.getAttribute("lsOrderId");
				lsOrderId=lsOrderId.toUpperCase();
				String userLogin=(String)session.getAttribute("userLogin");
				String status=(String)session.getAttribute("status");
				List<Integer>listIndexColumn=(List<Integer>)session.getAttribute("listIndexColumn");
				listOrdersDTO=orderService.searchInvoicedWithSorting(creationDateStartArg, creationDateEndArg,reportDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,0);
			}else{
				listOrdersDTO= (List<OrdersDTO>)session.getAttribute("listOrdersDTOInvoiced");
			}
		}

		try{

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
			}

			/*-------------------- Prepare list orders to print ---------------------------
				search just orders witch have property shippingCompany!=null and 
					 shippingCompany!="" and add it at first of list 
	 		 ------------------------------------------------------------------------------*/

			if(listOrdersDTO!=null && listOrdersDTO.size()>0){
				List<OrdersDTO>listOrdersWithoutSHCompany=new ArrayList<OrdersDTO>();
				List<OrdersDTO>listOrdersWithSHCompany=new ArrayList<OrdersDTO>();
				for(OrdersDTO order:listOrdersDTO){

					//add special handling shipping
					User user=null;
					Double totalPrice= null;
					if(order.getUserLogin()!=null)user=userService.getUserByLogin(order.getUserLogin());
					if(user!=null){
						order.setSpecialHandlingName(user.getSpecialHandlingName());
						order.setSpecialHandlingFee(user.getSpecialHandlingFee());
						if(order.getRowsList().get(0).getQuantity()!=null && order.getRowsList().get(0).getUnitPrice()!=null){
							totalPrice=order.getRowsList().get(0).getQuantity()*order.getRowsList().get(0).getUnitPrice();
							totalPrice = (double) Math.round(totalPrice * 100) / 100;
						}
					}
					order.setTotalPrice(totalPrice);
					if(order.getShippingCompany()!=null && !order.getShippingCompany().equals("")){
						listOrdersWithSHCompany.add(order);
					}else{
						listOrdersWithoutSHCompany.add(order);
					}
				}
				listOrdersDTO=new ArrayList<OrdersDTO>();
				for(OrdersDTO order:listOrdersWithSHCompany){
					listOrdersDTO.add(order);
				}
				for(OrdersDTO order:listOrdersWithoutSHCompany){
					listOrdersDTO.add(order);
				}
			}
			/*-------------------- print orders selected -----------------------------------
					  save all orders witch have property print=true
	 		 ------------------------------------------------------------------------------*/
			if(allOrdersSelectedSignal!=null && allOrdersSelectedSignal!=0L){ // print All Orders
				fileName="list_orders"+strDate+".pdf";
				if(tansformReportSignal!=null && tansformReportSignal!=0L){
					list=DTOFactory.getListOrderPrintDTOForReport(listOrdersDTO,logoPath,true);
					for(OrdersDTO ord:listOrdersDTO){
						if(ord.getStatus()!=null && ord.getStatus().equals("open"))ord.setStatus("progress");
					}
				}else{
					list=DTOFactory.getListOrderPrintDTO(listOrdersDTO,logoPath,true);
					for(OrdersDTO ord:listOrdersDTO){
						for(OrdersRows row:ord.getRowsList()){
							if(row.getStatus()!=null && row.getStatus().equals("open"))row.setStatus("progress");	
						}
					}
				}

				for(OrdersDTO orderDTO:listOrdersDTO){
					orderService.makeOrderInProgress(orderDTO);
				}//end for	
			}else{ // print just orders Selected
				fileName="orders_selected"+strDate+".pdf";
				list=DTOFactory.getListOrderPrintDTO(listOrdersDTO,logoPath,false); 
				for(OrdersDTO ordDTO:listOrdersDTO){
					if(ordDTO.getPrint()!=null){
						if(ordDTO.getPrint()){
							//userLogin=ordDTO.getUserLogin();
							if(ordDTO.getStatus()!=null && ordDTO.getStatus().equals("open"))ordDTO.setStatus("progress");
							for(OrdersRows row:ordDTO.getRowsList()){
								if(row.getStatus()!=null && row.getStatus().equals("open"))row.setStatus("progress");	
							}
							//break;
						}
					}
				}

				for(OrdersDTO orderDTO:listOrdersDTO){
					if(orderDTO.getPrint()!=null){
						if(orderDTO.getPrint()==true)orderService.makeOrderInProgress(orderDTO);
					}//end if
				}//end for	
			}

			/*-------------------- Create a file PDF from orders list ---------------------
					  The system will create a pdf file with the client login name
	 		 ------------------------------------------------------------------------------*/
			@SuppressWarnings("rawtypes")
			Map parameters = new HashMap();
			File destFilePDF = new File(filePathData+"orders.pdf");
			if(destFilePDF.exists())destFilePDF.delete();
			InputStream inputStream;
			try {
				inputStream = JRLoader.getLocationInputStream(filePathData+"orders.jrxml");
				JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list,false);
				JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
				JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
				JasperExportManager.exportReportToPdfFile(jasperPrint, filePathData+"orders.pdf");				
			} catch (JRException e) {
				e.printStackTrace();
			}    
			fileInputStream = new FileInputStream(new File( filePathData+"orders.pdf"));
			//fileName="orders.pdf";
			session.setAttribute("generatePDF",1);
			session.setAttribute("invoicedOrdersRefresh",1L);
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}

}
