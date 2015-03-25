package com.loyauty.web.struts.action.inbox;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import lombok.Getter;
import lombok.Setter;

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

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.web.struts.action.LoyautyAction;

public class UploadXML extends LoyautyAction{
	private static final long serialVersionUID = -8282158024360109845L;


	@Getter @Setter
	private File fileXLS;
	
	/*=========================================================================================
 											method execute
 	  =========================================================================================*/
@SuppressWarnings({ "rawtypes", "unchecked" })
@Override
public String execute() throws Exception {
	if(fileXLS!=null){
		
		String filePath = request.getSession().getServletContext().getRealPath("/");
		filePath = filePath + "WEB-INF/jsp/inbox/data/";
		String logoPath=filePath+"logos/";
		
		// ------------------ Upload file xls -----------------------
		File destFileXLS = new File(filePath+"inbox" + ".xml");
		if(destFileXLS.exists())destFileXLS.delete();
		
		try {
			destFileXLS = new File(filePath, "inbox" + ".xml");
			FileUtils.copyFile(fileXLS, destFileXLS);
			
		} catch (IOException e) {
			e.printStackTrace();
			return "input";
		}
		
    	
    	Collection list=toArrayListFromXML(filePath+"inbox" + ".xml");   		
    		// -------------------- transform file xls to pdf -------------
			File destFilePDF = new File(filePath+"inbox.pdf");
			if(destFilePDF.exists())destFilePDF.delete();
			InputStream inputStream;
			try {
				inputStream = JRLoader.getLocationInputStream(filePath+"inbox.jrxml");
				JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list,false);
				Map parameters = new HashMap();
				parameters.put("logo", logoPath+"logo.png");
				JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
				JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
				JasperExportManager.exportReportToPdfFile(jasperPrint, filePath+"inbox.pdf");				
			} catch (JRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    		

			return SUCCESS;
	}else{
		addActionError(getText("loyauty.error.common.fileUpload"));
		return "input";
	}

}

	
	
	
	

	/*=========================================================================================
	 	method that takes data from a xls file and put them in a list, 
	 	each element of this list presante line that xls file
	  =========================================================================================*/
	@SuppressWarnings("rawtypes")
	private static Collection  toArrayListFromXML(String destinationFile) {
		Collection listOrdersDTO = new ArrayList();
		
		
	    try {
    		OrdersDTO orderDTO=new OrdersDTO();
    		//listOrder=new ArrayList<OrderDTO>();
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File(destinationFile));

            // normalize text representation
            doc.getDocumentElement ().normalize ();
            NodeList listOfPersons = doc.getElementsByTagName("Order_Item");
            int totalPersons = listOfPersons.getLength();
             for(int s=0; s<listOfPersons.getLength() ; s++){
            	orderDTO=new OrdersDTO();
                Node firstPersonNode = listOfPersons.item(s);
                if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){
                    Element firstPersonElement = (Element)firstPersonNode;

                    //--------------- 1:companyHeader -----------
                    NodeList companyHeaderList = firstPersonElement.getElementsByTagName("Company_Header");
                    if(companyHeaderList!=null){
                    Element companyHeaderElement = (Element)companyHeaderList.item(0);

                    NodeList companyHeaderFNList = companyHeaderElement.getChildNodes();
                    String companyHeader =((Node)companyHeaderFNList.item(0)).getNodeValue().trim();
                  //orderDTO.setCompanyHeader(companyHeader);
                    }
                    orderDTO.setCompanyHeader("");
                    
                    //--------------- 2:productOrderNumber ----------------
                    NodeList productOrderNumberList = firstPersonElement.getElementsByTagName("Product_Order_Number");
                    if(productOrderNumberList!=null){
                    Element productOrderNumberElement = (Element)productOrderNumberList.item(0);

                    NodeList productOrderNumberFNList = productOrderNumberElement.getChildNodes();
                    String productOrderNumber =((Node)productOrderNumberFNList.item(0)).getNodeValue().trim();
                    orderDTO.setProductOrderNumber(productOrderNumber);
                    }
                   
                    //--------------- 3:productOrderDate -----------------
                    NodeList productOrderDateList = firstPersonElement.getElementsByTagName("Product_Order_Date");
                    if(productOrderDateList!=null){
                    Element productOrderDateElement = (Element)productOrderDateList.item(0);

                    NodeList productOrderDateFNList = productOrderDateElement.getChildNodes();
                    
                    String productOrderDate =((Node)productOrderDateFNList.item(0)).getNodeValue().trim();
                    if(productOrderDate.endsWith(":"))productOrderDate=productOrderDate.substring(0, productOrderDate.length()-2);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         			Date date=null;
        			try {
        				date = sdf.parse(productOrderDate);
        			}
        			catch (Exception pe) {
        				date=null;
        			}
                    orderDTO.setProductOrderDate(date);
                    }
                    
                    //--------------- 4:quantity -------------------------
                    NodeList quantityList = firstPersonElement.getElementsByTagName("Quantity");
                    if(quantityList!=null){
                    Element quantityElement = (Element)quantityList.item(0);
                    NodeList quantityFNList = quantityElement.getChildNodes();
                    String strQuantity =((Node)quantityFNList.item(0)).getNodeValue().trim();

                    if(strQuantity!=null && !strQuantity.equals("")){
 						int index=strQuantity.indexOf(",");
 						if(index>=0){
 							String strUnitPrice1=strQuantity.substring(0, index);
 							String strUnitPrice2= strQuantity.substring(index+1, strQuantity.length());
 							strQuantity=strUnitPrice1+"."+strUnitPrice2;
 						}
 					}
 					Double quantity=null;
                  	try {
                  		quantity = Double.parseDouble(strQuantity);
                  	}
                  	catch (Exception pe) {
                  		quantity=null;
                  	}
                    orderDTO.setQuantity(quantity);
                    }
                   
                    //--------------- 5:lsProductID ----------------------
                    NodeList lsProductIDList = firstPersonElement.getElementsByTagName("LS_Product_ID");
                    if(lsProductIDList!=null){
                    Element lsProductIDElement = (Element)lsProductIDList.item(0);

                    NodeList lsProductIDFNList = lsProductIDElement.getChildNodes();
                    
                    String lsProductID =((Node)lsProductIDFNList.item(0)).getNodeValue().trim();
                    orderDTO.setLsProductID(lsProductID);
                    }
                    
                    //--------------- 6:productDescription ------------------
                    NodeList productDescriptionList = firstPersonElement.getElementsByTagName("Product_Description");
                    if(productDescriptionList!=null){
                    Element productDescriptionElement = (Element)productDescriptionList.item(0);
                    NodeList productDescriptionFNList = productDescriptionElement.getChildNodes();
                    String productDescription =((Node)productDescriptionFNList.item(0)).getNodeValue().trim();
                    orderDTO.setProductDescription(productDescription);
                    }
                    
                    //--------------- 7:unitPrice ---------------------------
                    NodeList unitPriceList = firstPersonElement.getElementsByTagName("Unit_Price");
                    if(unitPriceList!=null){
                    Element unitPriceElement = (Element)unitPriceList.item(0);
                    NodeList unitPriceFNList = unitPriceElement.getChildNodes();
                    String strUnitPrice =((Node)unitPriceFNList.item(0)).getNodeValue().trim();
					if(strUnitPrice!=null && !strUnitPrice.equals("")){
						int index=strUnitPrice.indexOf(",");
						if(index>=0){
							String strUnitPrice1=strUnitPrice.substring(0, index);
							String strUnitPrice2= strUnitPrice.substring(index+1, strUnitPrice.length());
							strUnitPrice=strUnitPrice1+"."+strUnitPrice2;
						}
					}
                  	Double ProductUnitPrice=null;
                  	try {
                  		ProductUnitPrice = Double.parseDouble(strUnitPrice);
                  	}
                  	catch (Exception pe) {
                  		ProductUnitPrice=null;
                  	}
                    orderDTO.setUnitPrice(ProductUnitPrice);
                    }
                    
                    //--------------- 8:clientNumber -------------------------
                    NodeList clientNumberList = firstPersonElement.getElementsByTagName("Client_Number");
                    if(clientNumberList!=null){
                    Element clientNumberElement = (Element)clientNumberList.item(0);
                    NodeList clientNumberFNList = clientNumberElement.getChildNodes();
                    String clientNumber =((Node)clientNumberFNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientNumber(clientNumber);
                    }
                    
                    //--------------- 9:firstName ---------------------------
                    NodeList firstNameList = firstPersonElement.getElementsByTagName("First_Name");
                    if(firstNameList!=null){
                    Element firstNameElement = (Element)firstNameList.item(0);
                    NodeList firstNameFNList = firstNameElement.getChildNodes();
                    String firstName =((Node)firstNameFNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientFirstName(firstName);
                    }
                    
                    //--------------- 10:lastName ---------------------------
                    NodeList lastNameList = firstPersonElement.getElementsByTagName("Last_Name");
                    if(lastNameList!=null){
                    Element lastNameElement = (Element)lastNameList.item(0);
                    NodeList lastNameFNList = lastNameElement.getChildNodes();
                    String lastName =((Node)lastNameFNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientLastName(lastName);
                    }
                    
                    //--------------- 11:addressStreet ----------------------
                    NodeList addressStreetList = firstPersonElement.getElementsByTagName("Address_Street");
                    if(addressStreetList!=null){
                    Element addressStreetElement = (Element)addressStreetList.item(0);
                    NodeList addressStreetFNList = addressStreetElement.getChildNodes();
                    String addressStreet =((Node)addressStreetFNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientStreet(addressStreet);
                    }
                    
                    //--------------- 12:addressStreetOther ----------------
                    String addressStreetOther="";
                    NodeList addressStreetOtherList = firstPersonElement.getElementsByTagName("Address_Street_Other");
                    if(addressStreetOtherList!=null){
	                    Element addressStreetOtherElement = (Element)addressStreetOtherList.item(0);
	                    if(addressStreetOtherElement!=null){
		                    NodeList addressStreetOtherFNList = addressStreetOtherElement.getChildNodes();
		                    if(addressStreetOtherFNList!=null){
		                    	if(addressStreetOtherFNList.item(0)!=null)addressStreetOther =((Node)addressStreetOtherFNList.item(0)).getNodeValue().trim();
		                    }
	                    
	                    }
                    }
                    orderDTO.setClientOtherStreet(addressStreetOther);
                    
                    //--------------- 13:addressCity ------------------------
                    NodeList addressCityList = firstPersonElement.getElementsByTagName("Address_City");
                    if(addressCityList!=null){
                    Element addressCityElement = (Element)addressCityList.item(0);
                    NodeList addressCityLNList = addressCityElement.getChildNodes();
                    String addressCity =((Node)addressCityLNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientCity(addressCity);
                    }

                    //--------------- 14:addressPostalCode ---------------------
                    NodeList addressPostalCodeList = firstPersonElement.getElementsByTagName("Address_Postal_Code");
                    if(addressPostalCodeList!=null){
                    Element addressPostalCodeElement = (Element)addressPostalCodeList.item(0);

                    NodeList addressPostalCodeLNList = addressPostalCodeElement.getChildNodes();
                    String addressPostalCode =((Node)addressPostalCodeLNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientPostalCode(addressPostalCode);
                    }
                    
                    //--------------- 15:addressState -------------------------
                    NodeList addressStateList = firstPersonElement.getElementsByTagName("Address_State");
                    if(addressStateList!=null){
                    Element addressStateElement = (Element)addressStateList.item(0);
                    NodeList addressStateLNList = addressStateElement.getChildNodes();
                    String addressState =((Node)addressStateLNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientProvince(addressState);
                    }
                    
                    //--------------- 16:clientPhone --------------------------
                    NodeList clientPhoneList = firstPersonElement.getElementsByTagName("Client_Phone");
                    if(clientPhoneList!=null){
                    Element clientPhoneElement = (Element)clientPhoneList.item(0);
                    NodeList clientPhoneLNList = clientPhoneElement.getChildNodes();
                    String clientPhone =((Node)clientPhoneLNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientPhone(clientPhone);
                    }
                    
                    //--------------- 17:clientEmail -------------------------
                    NodeList clientEmailList = firstPersonElement.getElementsByTagName("Client_Email");
                    if(clientEmailList!=null){
                    Element clientEmailElement = (Element)clientEmailList.item(0);
                    NodeList clientEmailLNList = clientEmailElement.getChildNodes();
                    String clientEmail =((Node)clientEmailLNList.item(0)).getNodeValue().trim();
                    orderDTO.setClientEmail(clientEmail);
                    }
                    
                    listOrdersDTO.add(orderDTO);
                    
                }//end of if clause

            }//end of for loop with s var


        }catch (SAXParseException err) {
        	err.printStackTrace();
        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();
        }catch (Throwable t) {
        t.printStackTrace ();
        }
		return listOrdersDTO;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
