package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;

import org.apache.struts.util.BeanUtils;
import org.apache.xmlbeans.impl.tool.CommandLine;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;


import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import com.loyauty.cronjob.orders.OrdersConfirmation;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.Product;
import com.loyauty.model.User;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ItemMapDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersSpecialShippingDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserFileDataRecoveryDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.init.ConfigService;
import com.loyauty.service.operations.OperationsService;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.service.usersprivileges.UsersPrivilegesService;
import com.sun.rowset.internal.Row;



import org.apache.commons.*;
import org.apache.commons.*;
import org.apache.commons.*;
import org.apache.commons.*; 


public class Test{
	
	private static ServiceLocator serviceLocator;
	private static UserService userService;
	private static OperationsService operationsService;
	private static ConfigService configService;
	private static ProductService productService;
	private static OrdersService orderService;
	private static UsersPrivilegesService usersPrivilegesService;
	//private static OrderDTO orderDTO;
	//private static ArrayList<OrderDTO>listOrder;

    public static void main (String argv []){
    	System.out.println("Début DateTime:"+new Date());
		serviceLocator = ServiceLocator.getInstance();	
		
		try {
			orderService = serviceLocator.getOrderService();
			productService = serviceLocator.getProductService();
			usersPrivilegesService = serviceLocator.getUserPrivilegesService();
			userService=serviceLocator.getUserService();
			configService=serviceLocator.getConfigService();
			
		/*	String LS_PRODUCT_ID="W;   A'BC,XY;Z SELECT '";
			LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll(" SELECT ",""); 
			LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll("\\s","");
			LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll("\'","");
			LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll("\"","");
			LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll(";","");
			LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll(",","");
			
			//System.out.println("LS_PRODUCT_ID:"+LS_PRODUCT_ID);
			
			Date toDay=new Date();
			Calendar toDayCalendar = Calendar.getInstance();
			toDayCalendar.clear();
			toDayCalendar.setTime(toDay);
			int hour = toDayCalendar.get(Calendar.HOUR_OF_DAY);
			int minute = toDayCalendar.get(Calendar.MINUTE);
			SimpleDateFormat frm=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			
			Date x=frm.parse("25/11/2013 "+hour+":"+minute+":00");
			
			System.out.println("Date:"+x);
			
			
			//boolean result=productService.calculateShippingRate(3L, 8386L);
			//boolean result=productService.calculateShippingRateForAllProducts(3L);
			OrdersDTO ord=new OrdersDTO();
			ord.setUserId(10L);
			ord.setEtaFieldName("product_order_number");
			ord.setEtaFieldValue("C VISAD C-H1438076");
			
			//List<OrdersDTO>list=orderService.getEtaOrderlistByFieldName(ord);
			//System.out.println(list.get(0).getClientOrderNumber());
			
			//List<ProductDTO>list=productService.getSaleActiveByUserId(39L);
			
			ProductDTO g=productService.getSaleByProductId(5094L);
			
			System.out.println("userId:" +g.getUserId());
			System.out.println("QtMax:" +g.getQtMax());
			System.out.println("QtSaleQt:" +g.getSaleQt());
			System.out.println("StartDate:" +g.getStartDate());
			System.out.println("EndDate:" +g.getEndDate());
			System.out.println("RegularPrice:" +g.getRegularPrice());
			System.out.println("RegularPercentProfit:" +g.getRegularPercentProfit());
			System.out.println("RegularPercentDiscount:" +g.getRegularPercentDiscount());
			
			
			System.out.println("SalePrice:" +g.getSalePrice());
			System.out.println("SalePercentProfit:" +g.getSalePercentProfit());
			System.out.println("SalePercentDiscount:" +g.getSalePercentDiscount());
			
			
			System.out.println("Active:" +g.getActive());
			System.out.println("MessageForClient:" +g.getMessageForClient());
			System.out.println("SaleNote:" +g.getSaleNote());
			*/
			
			List<OrdersDTO>list=new ArrayList<OrdersDTO>();
			OrdersDTO orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577104ZZZ");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577680AAA");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908519611");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577831");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908578167");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908578166");
			list.add(orderDTO);
			
			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577210");
			list.add(orderDTO);

			//Integer count=orderService.nbOrdersNotSaved(list);
			
			 boolean result= productService.disableSaleWhenOutTime(3L) ;
			 
			 
			//System.out.println(result);
			/*List<OrdersDTO>list=new ArrayList<OrdersDTO>();
			OrdersDTO orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577104ZZZ");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577680AAA");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908519611");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577831");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908578167");
			list.add(orderDTO);

			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908578166");
			list.add(orderDTO);
			
			orderDTO=new OrdersDTO();
			orderDTO.setLsOrderId("ASO2908577210");
			list.add(orderDTO);

			Integer count=orderService.nbOrdersNotSaved(list);
			System.out.println("count:"+count);
			//List<ProductDTO> productDTOList = productService.getProductsClassification(51L);
			//productService.generateAdminXLS(productDTOList,"C:/DATA/test/");
			
			//com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document("C:/DATA/POloyalty.pdf");
			// Instantiate ExcelSave Option object
			//com.aspose.pdf.SaveOptions excelsave = null;// = new com.aspose.pdf.SaveOptions();
			// Save the output to XLS format
			//pdfDocument.save("C:/DATA/ConvertedFile.xls");


			
			
			//List<ProductDTO> productDTOList = productService.getProductsClassification(51L);
			//productDTOList = productService.getAllValidStatusProductsForAllUsers();
			//productDTOListPetit=(ArrayList<ProductDTO>)toArrayListFromXLS();*/

			
			/*for (ProductDTO productDTO : productDTOList) {
				System.out.println("\n=======================================");
				System.out.println("ID: "+productDTO.getId());
				System.out.println("classification: "+productDTO.getClassification());
				System.out.println("ls_product_id: "+productDTO.getLoyaltyProductId());
				System.out.println("category_name: "+productDTO.getCategory().getName());
				System.out.println("brand_name: "+productDTO.getBrand().getName());
				System.out.println("description: "+productDTO.getDescriptiProduct());
				System.out.println("msrp: "+productDTO.getMsrp());
				System.out.println("cost: "+productDTO.getCost());
				System.out.println("price: "+productDTO.getPriceProduct());
				System.out.println("profit: "+productDTO.getProfit());
				System.out.println("descount: "+productDTO.getDiscount());
				System.out.println("\n=======================================");
				//userPrice, profil, discount
				} */
			
			
			//PRODUCT_ID    LS_PRODUCT_ID     CATEGORY_NAME     BRAND_NAME   PRODUCT_TITLE  MSRP  OUR_COST  PRICE   PROFIT  DISCOUNT 
			
		//	System.out.println("size:"+productDTOList.size());
			/*UserConnectionDTO usrDTO=userService.getUserConnectionByUserId(54L);
			System.out.println("usrDTO.getEmail1()"+usrDTO.getEmail1());*/
			
			
			/*List<UserConnectionDTO>userConnDTOList=userService.getAllUsersConnections();
			for(UserConnectionDTO usrConnDTO:userConnDTOList){
				System.out.println("usrDTO.getUserSendingId():"+usrConnDTO.getUserSendingId());
			}*/
			/*
			HashMap<Object,Object> hashCof=configService.getAdminConstants(0);

			Object notificationAdmin=hashCof.get("notification_admin_1");
			String strNotificationAdmin=(String)notificationAdmin;
			
			 hashCof=configService.getAdminConstants(1);
			Object host=hashCof.get("host_0");
			String strHost=(String)host;
			*/
			/*
			StringBuilder adminMessage = new StringBuilder();
			adminMessage.append("Hello.\nHow are your");
			System.out.println(adminMessage.toString());
			*/
			
			/*
			String EMAIL = "hamdoune@gameaccess.ca";
			String SMTP_HOST = "mail.gameaccesscash.com";
			String SMTP_PORT = "465";

			String subject  = "LoyaltySource- New Account Request From ";
		 	Properties properties = new Properties();
			properties.put("mail.smtp.host", SMTP_HOST);
			properties.put("mail.smtp.socketFactory.port", SMTP_PORT);
			properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			properties.put("mail.smtp.port", SMTP_PORT);
		 	StringBuilder builder = new StringBuilder();
		 	*/
		 	
		 	
		 /*   try{
		    	
		    	/*
					Session session = Session.getInstance(properties);
					// Define message
					Message message = new MimeMessage(session);
					message.setSentDate(new Date());
					message.setFileName("order_File");
					message.setFrom(new InternetAddress("hamdoune2013@gmail.com"));
					message.addRecipient(Message.RecipientType.TO,new InternetAddress(EMAIL));
					message.setSubject(subject);
					// Create the message part
					BodyPart messageBodyPart = new MimeBodyPart();
					//*************************************************
					String ligne="";
					BufferedReader pr=new BufferedReader(new FileReader("C:/DATA/SendingEmail.txt")); 
			    	StringBuilder sb = new StringBuilder();
			    	
					while((ligne=pr.readLine())!=null){
						if(ligne.contains("salutation_id")){
							ligne+=" Salut Hamdoune bien venu <br/> votre commande est livrée";
						}
						sb.append(ligne);
					} //End loop while
					pr.close();
					builder=sb;
					//*************************************************
					messageBodyPart.setContent(builder.toString(), "text/html; charset=ISO-8859-1");
					Multipart multipart = new MimeMultipart();
					multipart.addBodyPart(messageBodyPart);
					//attachement
					BodyPart messageBodyPart2 = new MimeBodyPart();
				    DataSource source = new FileDataSource("C:/DATA/ManifestItems2014-01-01_2014-01-07Corrected.xls");
				    messageBodyPart2.setDataHandler(new DataHandler(source));
				    messageBodyPart2.setFileName("Order_File.xls");
				    multipart.addBodyPart(messageBodyPart2);
				    //****************** image logo ***************
				    MimeBodyPart imagePart = new MimeBodyPart();
				    DataSource fds = new FileDataSource("C:/DATA/ls_logo.png");
				    imagePart.setDataHandler(new DataHandler(fds));
				    // assign a cid to the image
				    imagePart.setHeader("Content-ID", "image001.png@01CF5A38.8E7FEAD0");
				    multipart.addBodyPart(imagePart);
				    //***********************************************
					// Put parts in message
					message.setContent(multipart);
					// Send the message
					Transport.send(message);

		      }catch (MessagingException e) {
		    	  e.printStackTrace();
		      }	
		  */
		 	
			//System.out.println(Runtime.getRuntime().freeMemory());
		 	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
    	
    }//end of main
    
    
    static String[] getProperties(String fullClassName) throws Exception{
    	@SuppressWarnings("rawtypes")
		Class cls = Class.forName(fullClassName);//"com.loyauty.service.core.dto.UserFileRecoveryDTO"
    	Object fieldlist[] = cls.getDeclaredFields();
    	String[] result=new String[fieldlist.length];
    	for(int i=0;i<fieldlist.length;i++){
    		String itemDefinition=fieldlist[i].toString();
    		String[]itemDefinitionList=itemDefinition.split("\\.");
    		String item=itemDefinitionList[itemDefinitionList.length-1];
    		result[i]=item;
    	}
    	return result;
    }
    
	
    //get all xml element
   
    static  HashMap<Object,Object> getTagList(String fullFileName) throws Exception{
    	SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(fullFileName);
        Document doc = (Document) builder.build(xmlFile);
        Element rootNode = doc.getRootElement();
        List alOrders = rootNode.getChildren();
        Element  elt=(Element)alOrders.get(0);
        List alOrdersElememts = elt.getChildren();
        HashMap<Object,Object> result=new HashMap<Object,Object>();
        ItemMapDTO itemMap;
        for(int i = 0;i<=alOrdersElememts.size()-1;i++){
        	itemMap=new ItemMapDTO();
        	Element item=(Element)alOrdersElememts.get(i);
        	item.getName();
        	item.getValue();
        	result.put(item.getName().toString(), item.getValue());

        }
    	return result;
    }

    
    
    
    private String executeCommand(String command) {
    	 
		StringBuffer output = new StringBuffer();
 
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = 
                           new BufferedReader(new InputStreamReader(p.getInputStream()));
 
			String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return output.toString();
 
	}
    
    
	private static StringBuilder createMessageBody() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head><title>YOU HAVE A NEW ACCOUNT REQUEST</title></head>");
		sb.append("<body>");
		/*sb.append("<br><left><font color=blue>Hello,</font></br>");
		sb.append("<br><left><font color=blue>Greetings!!!</font></br>");
		sb.append("<br><font color=blue>We have a new Account request.</font></br>");
		sb.append("<p style=\"text-indent:250px;\"><font color=blue size=4><b><i><u>Details of the new account request are as below </u></b></font></p></br>");
		sb.append("<table align=center style=\"border-left: 2px solid #CCCCCC; border-right: 2px solid #CCCCCC;border-bottom: 2px solid #CCCCCC;border-top: 2px solid #CCCCCC;background-color:#FFFFE0;\"  width=80% cellpadding=3 cellspacing=3>");
		sb.append("<tr><td width=175>Full Address :</td> <td> hello</td></tr>");
		sb.append("</table>");
		sb.append("<br><left><font color=blue>Thanks</font></br>");*/
		
		sb.append("Hello Mohammed<br/><br/><br/><br/>");
		sb.append("<a href='loyaltysource.com'><img src=\"cid:image001.png@01CF5A38.8E7FEAD0\"/></a>");	
		//https://gameaccess.ca/misc/images/loyalty_logo.jpg
			

			
		
	/*	sb.append("<div class=WordSection1>");
		
sb.append("<p class=MsoNormal>Notre message de bien venue.</p>");
		
sb.append("<p class=MsoNormal><o:p>&nbsp;</o:p></p>");
sb.append("<p class=MsoNormal>Merci<o:p></o:p></p>");
sb.append("<p class=MsoNormal><o:p>&nbsp;</o:p></p>");
sb.append("<p class=MsoNormal><span lang=EN-CA>François Fortier<o:p></o:p></span></p>");
sb.append("<p class=MsoNormal><span lang=EN-CA>President &amp; Managing Partner<o:p></o:p></span></p>");
sb.append("<p class=MsoNormal>");
sb.append("<span style='font-size:9.0pt'><img width=189 height=50 id='Picture_x0020_1' src='https://gameaccess.ca/misc/images/loyalty_logo.jpg' alt='KLF_new_log_SIGNATUREo'></span>");
sb.append("<span lang=EN-CA style='font-size:9.0pt'><o:p></o:p></span></p>");
sb.append("<p class=MsoNormal><span style='font-size:10.0pt;font-family:Wingdings'>(</span><span style='font-size:10.0pt'>: </span><span lang=EN-CA style='font-size:9.0pt'>514-879-0907 x1003 </span>");
sb.append("<b><span style='font-size:9.0pt;font-family:Arial,sans-serif'>@</span></b>");
sb.append("<span style='font-size:7.5pt;font-family:Arial,sans-serif'>: </span>");
sb.append("<span lang=EN-CA style='font-size:9.0pt'><a href='mailto:Frank@LoyaltySoucre.com'><span style='color:blue'>Francois@KLFMedia.com</span></a><o:p></o:p></span></p>");
sb.append("<p class=MsoNormal><o:p>&nbsp;</o:p></p></div>");*/
		
		
		
		
		
		
		
		
		
		
		
		
		sb.append("</body>");
		sb.append("</html>");
		return sb;		
	}
    
	
    

}
