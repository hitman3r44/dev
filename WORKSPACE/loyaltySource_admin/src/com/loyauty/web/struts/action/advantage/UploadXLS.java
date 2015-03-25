package com.loyauty.web.struts.action.advantage;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.web.struts.action.LoyautyAction;
import java.io.InputStream;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;


public class UploadXLS extends LoyautyAction {
	
	private static final long serialVersionUID = 6649940042042023814L;
	
	//------------- satatic variable indicating the numbers of columns in the xls file --------
	private static final int ROW_TO_START = 1;
	//private static final int COL_COMPANY_HEADER;
	private static final int COL_PRODUCT_ORDER_NUMBER=2;//poNumber
	private static final int COL_PRODUCT_ORDER_DATE=0; //poDate
	private static final int COL_QUANTITY=14;//quantity
	private static final int COL_LS_PRODUCT_ID=12;//productId
	private static final int COL_PRODUCT_DESCRIPTION=13;//description	
	private static final int COL_UNIT_PRICE=15; //price
	//private static final int COL_CLIENT_NUMBER=40;//clientNumber
	private static final int COL_FIRST_NAME=4;//clientFirstName
	private static final int COL_LAST_NAME=3; //clientLastName
	private static final int COL_ADDRESSS_TREET=5; //clientAdress
	private static final int COL_ADDRESSS_TREET_OTHER=6;//clientAdressOther
	private static final int COL_ADDRESS_CITY=7;//clientCity
	private static final int COL_ADDRESS_POSTAL_CODE=9;//clientPostalCode
	private static final int COL_ADDRESS_STATE=8;//clientProvince	
	private static final int COL_CLIENT_PHONE=10;//clientPhone
	private static final int COL_CLIENT_EMAIL=11;//clientEmail

	@Getter @Setter
	private File fileXLS;
	
	@Getter @Setter
	private String myFileContentType;
	
	@Getter @Setter
	private String myFileFileName;
	
	@Getter @Setter
	private String destPath;

	
	
	/*=========================================================================================
	 	method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		if(fileXLS!=null){
			
			String filePath = request.getSession().getServletContext().getRealPath("/");
			filePath = filePath + "WEB-INF/jsp/advantage/data/";
			String logoPath=filePath+"logos/";
			// ------------------ Upload file xls -----------------------
			File destFileXLS = new File(filePath+"advantage" + ".xls");
			if(destFileXLS.exists())destFileXLS.delete();
			
			try {
				destFileXLS = new File(filePath, "advantage" + ".xls");
				FileUtils.copyFile(fileXLS, destFileXLS);
				
			} catch (IOException e) {
				e.printStackTrace();
				return "input";
			}
			// -------------------- transform file xls to pdf -------------
				File destFilePDF = new File(filePath+"advantage.pdf");
				if(destFilePDF.exists())destFilePDF.delete();
				Collection list=toArrayListFromXLS(filePath+"advantage" + ".xls");
				InputStream inputStream = JRLoader.getLocationInputStream(filePath+"template.jrxml");
				JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list,false);
				Map parameters = new HashMap();
				parameters.put("logo", logoPath+"logo.png");
				JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
				JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
				JasperExportManager.exportReportToPdfFile(jasperPrint, filePath+"advantage.pdf");
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Collection  toArrayListFromXLS(String destinationFile) {
		
		//Values of cells
		//String companyHeader="";
		String productOrderNumber="";//poNumber
		String productOrderDate=""; //poDate
		String quantity="";//quantity
		String lsProductID="";//productId
		String productDescription="";//description	
		String unitPrice=""; //price
		String clientNumber="";//clientNumber
		String firstName="";//clientFirstName
		String lastName=""; //clientLastName
		String addressStreet=""; //clientAdress
		String addressStreetOther="";//clientAdressOther
		String addressCity="";//clientCity
		String addressPostalCode="";//clientPostalCode
		String addressState="";//clientProvince	
		String clientPhone="";//clientPhone
		String clientEmail="";//clientEmail	
		
		//Cells
		//Cell cellCompanyHeader= null;;
		Cell cellProductOrderNumber= null;//poNumber
		Cell cellProductOrderDate= null;//poDate
		Cell cellQuantity= null;//quantity
		Cell cellLsProductID= null;;//productId
		Cell cellProductDescription= null;//description	
		Cell cellUnitPrice= null;//price
		Cell cellClientNumber= null;//clientNumber
		Cell cellFirstName= null;//clientFirstName
		Cell cellLastName= null; //clientLastName
		Cell cellAddressStreet= null;//clientAdress
		Cell cellAddressStreetOther= null;//clientAdressOther
		Cell cellAddressCity= null;//clientCity
		Cell cellAddressPostalCode= null;//clientPostalCode
		Cell cellAddressState= null;//clientProvince	
		Cell cellClientPhone= null;//clientPhone
		Cell cellClientEmail= null;//clientEmail	
			
		Collection listOrderDTO = new ArrayList();

	try {
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destinationFile));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		
		int ROW_MAX = sheetToRead.getRows();
		
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {
			OrdersDTO orderDTO=new OrdersDTO();
			// poNumber.
			cellProductOrderNumber = sheetToRead.getCell(COL_PRODUCT_ORDER_NUMBER, row);			
			if(cellProductOrderNumber!=null)productOrderNumber = cellProductOrderNumber.getContents();
			orderDTO.setProductOrderNumber(productOrderNumber);
			
			// productOrderDate.
			cellProductOrderDate = sheetToRead.getCell(COL_PRODUCT_ORDER_DATE, row);			
			if(productOrderDate!=null)productOrderDate = cellProductOrderDate.getContents();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 			Date date=null;
			try {
				date = sdf.parse(productOrderDate);
			}
			catch (Exception pe) {
				date=null;
			}
	
			orderDTO.setProductOrderDate(date);
			
			// Quantity.
			cellQuantity = sheetToRead.getCell(COL_QUANTITY, row);			
			if(cellQuantity!=null)quantity = cellQuantity.getContents();
				Double quantityD=null;
              	try {
              		quantityD = Double.parseDouble(quantity);
              	}
              	catch (Exception pe) {
              		quantityD=null;
              	}
          	orderDTO.setQuantity(quantityD);
			
			// lsProductID.
			cellLsProductID = sheetToRead.getCell(COL_LS_PRODUCT_ID, row);			
			if(cellLsProductID!=null)lsProductID = cellLsProductID.getContents();
			orderDTO.setLsProductID(lsProductID);
			
			// productDescription.
			cellProductDescription = sheetToRead.getCell(COL_PRODUCT_DESCRIPTION, row);			
			if(cellProductDescription!=null)productDescription = cellProductDescription.getContents();
			orderDTO.setProductDescription(productDescription);
			
			// unitPrice.
			cellUnitPrice = sheetToRead.getCell(COL_UNIT_PRICE, row);			
			if(cellUnitPrice!=null)unitPrice = cellUnitPrice.getContents();
			if(unitPrice!=null && !unitPrice.equals("")){
				int index=unitPrice.indexOf(",");
				if(index>=0){
					String strUnitPrice1=unitPrice.substring(0, index);
					String strUnitPrice2= unitPrice.substring(index+1, unitPrice.length());
					unitPrice=strUnitPrice1+"."+strUnitPrice2;
				}
			}
          	Double ProductUnitPrice=null;
          	try {
          		ProductUnitPrice = Double.parseDouble(unitPrice);
          	}
          	catch (Exception pe) {
          		ProductUnitPrice=null;
          	}
			orderDTO.setUnitPrice(ProductUnitPrice);
			
			// clientNumber.
			orderDTO.setClientNumber(clientNumber);

			// FirstName.
			cellFirstName = sheetToRead.getCell(COL_FIRST_NAME, row);			
			if(cellFirstName!=null)firstName = cellFirstName.getContents();
			orderDTO.setClientFirstName(firstName);
			
			// LastName.
			cellLastName = sheetToRead.getCell(COL_LAST_NAME, row);			
			if(cellLastName!=null)lastName = cellLastName.getContents();
			orderDTO.setClientLastName(lastName);
			
			//cellAddressStreet.
			cellAddressStreet = sheetToRead.getCell(COL_ADDRESSS_TREET, row);			
			if(cellAddressStreet!=null)addressStreet = cellAddressStreet.getContents();
			orderDTO.setClientStreet(addressStreet);
			
			// addressStreetOther.
			cellAddressStreetOther = sheetToRead.getCell(COL_ADDRESSS_TREET_OTHER, row);			
			if(cellAddressStreetOther!=null)addressStreetOther = cellAddressStreetOther.getContents();
			orderDTO.setClientOtherStreet(addressStreetOther);
			
			// addressCity.
			cellAddressCity = sheetToRead.getCell(COL_ADDRESS_CITY, row);			
			if(cellAddressCity!=null)addressCity = cellAddressCity.getContents();
			orderDTO.setClientCity(addressCity);
			
			// addressPostalCode.
			cellAddressPostalCode = sheetToRead.getCell(COL_ADDRESS_POSTAL_CODE, row);			
			if(cellAddressPostalCode!=null)addressPostalCode = cellAddressPostalCode.getContents();
			orderDTO.setClientPostalCode(addressPostalCode);
			
			// addressState.
			cellAddressState = sheetToRead.getCell(COL_ADDRESS_STATE, row);			
			if(cellAddressState!=null)addressState = cellAddressState.getContents();
			orderDTO.setClientProvince(addressState);

			// clientPhone.
			cellClientPhone = sheetToRead.getCell(COL_CLIENT_PHONE, row);			
			if(cellClientPhone!=null)clientPhone = cellClientPhone.getContents();
			orderDTO.setClientPhone(clientPhone);

			// clientEmail.
			cellClientEmail = sheetToRead.getCell(COL_CLIENT_EMAIL, row);			
			if(cellClientEmail!=null)clientEmail = cellClientEmail.getContents();
			orderDTO.setClientEmail(clientEmail);
	
			
			listOrderDTO.add(orderDTO);			
		}

	} catch (Exception x) {
		x.printStackTrace();
	}
	
	return listOrderDTO;
		
	}

}
