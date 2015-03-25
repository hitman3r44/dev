package com.loyauty.web.struts.action.asiamiles;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.service.core.dto.AsiaMilesPOXLSDTO;
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
	private static final int COL_PACKAGE_CODE = 0;
	private static final int COL_DESCRIPTION = 1;      
	private static final int CLAIM_NUMBER = 2	;  
	private static final int MEMBER_REF_NO = 3	; 
	private static final int QUANTITY = 5;		
	private static final int DELIVERY_NAME = 6;	 
	private static final int DELIVERY_PHONE_COUNTRY = 7;	
	private static final int DELIVERY_PHONE_ZONE = 8;	
	private static final int DELIVERY_PHONE_NUMBER = 9	;
	private static final int DELIVERY_PHONE_INSTRUCTION = 10;	
	private static final int ADDRESS_INSTRUCTION = 11	;
	private static final int COMPANY_NAME = 12	;	
	private static final int ADDRESS1 = 13	;	
	private static final int ADDRESS2 = 14;		
	private static final int ADDRESS3 = 15	;	
	private static final int CITY = 16	;		
	private static final int POSTAL_CODE = 17	;	
	private static final int STATE_NAME = 18	;	
	private static final int EMAIL_ADDRESS = 20;

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
			filePath = filePath + "WEB-INF/jsp/asiaMiles/data/";
			String logoPath=filePath+"logos/";
			// ------------------ Upload file xls -----------------------
			File destFileXLS = new File(filePath+"asiamiles" + ".xls");
			if(destFileXLS.exists())destFileXLS.delete();
			
			try {
				destFileXLS = new File(filePath, "asiamiles" + ".xls");
				FileUtils.copyFile(fileXLS, destFileXLS);
				
			} catch (IOException e) {
				e.printStackTrace();
				return "input";
			}
			// -------------------- transform file xls to pdf -------------
				File destFilePDF = new File(filePath+"asiamiles.pdf");
				if(destFilePDF.exists())destFilePDF.delete();
				Collection list=toArrayListFromXLS(filePath+"asiamiles" + ".xls");
				InputStream inputStream = JRLoader.getLocationInputStream(filePath+"loyatyTemplate.jrxml");
				JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list,false);
				Map parameters = new HashMap();
				parameters.put("logo", logoPath+"logo.png");
				JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
				JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
				JasperExportManager.exportReportToPdfFile(jasperPrint, filePath+"asiamiles.pdf");
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
		String packageCode = "";
		String description = "";
		String claimNumber = "";
		String memberRefNo = "";
		String quantity = ""; 
		String deliveryName = ""; 
		String deliveryPhoneCountry = "";
		String deliveryPhoneZone = "";
		String deliveryPhoneNumber = "";
		String deliveryPhoneInstruction = "";
		String addressInstruction = "";
		String companyName = "";
		String address1 = "";
		String address2 = "";
		String address3 = "";
		String city = "";
		String postalCode = "";
		String stateName = "";
		String emailAddress = "";
				
		Cell cellPackageCode = null;
		Cell cellDescription = null;
		Cell cellClaimNumber = null;
		Cell cellMemberRefNo = null;
		Cell cellQuantity = null;
		Cell cellDeliveryName = null;
		Cell cellDeliveryPhoneCountry = null;
		Cell cellDeliveryPhoneZone = null;
		Cell cellDeliveryPhoneNumber = null;
		Cell cellDeliveryPhoneInstruction = null;
		Cell cellAddressInstruction = null;
		Cell cellCompanyName = null;
		Cell cellAddress1 = null;
		Cell cellAddress2 = null;
		Cell cellAddress3 = null;
		Cell cellCity = null;
		Cell cellPostalCode = null;
		Cell cellStateName = null;
		Cell cellEmailAddress = null;	
		Collection listAsieMilesPODto = new ArrayList();
		
		
	try {
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destinationFile));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		
		int ROW_MAX = sheetToRead.getRows();
		
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {
			AsiaMilesPOXLSDTO asiaMilesPO=new AsiaMilesPOXLSDTO();
			// PACKAGE CODE.
			cellPackageCode = sheetToRead.getCell(COL_PACKAGE_CODE, row);			
			packageCode = cellPackageCode.getContents();
			asiaMilesPO.setPackageCode(packageCode);
			
			// DESCRIPTION.
			cellDescription = sheetToRead.getCell(COL_DESCRIPTION, row);			
			description = cellDescription.getContents();
			asiaMilesPO.setDescription(description);
			
			// CLAIM NUMBER.
			cellClaimNumber = sheetToRead.getCell(CLAIM_NUMBER, row);			
			claimNumber = cellClaimNumber.getContents();
			asiaMilesPO.setClaimNumber(claimNumber);
			
			// MEMBER REF NO.
			cellMemberRefNo = sheetToRead.getCell(MEMBER_REF_NO, row);			
			memberRefNo = cellMemberRefNo.getContents();
			asiaMilesPO.setMemberRefNo(memberRefNo);
			
			// QUANTITY.
			cellQuantity = sheetToRead.getCell(QUANTITY, row);			
			quantity = cellQuantity.getContents();
			asiaMilesPO.setQuantity(quantity);
			
			// DELIVERY_NAME.
			cellDeliveryName = sheetToRead.getCell(DELIVERY_NAME, row);			
			deliveryName = cellDeliveryName.getContents();
			asiaMilesPO.setDeliveryName(deliveryName);
			
			// DELIVERY PHONE COUNTRY.
			cellDeliveryPhoneCountry = sheetToRead.getCell(DELIVERY_PHONE_COUNTRY, row);			
			deliveryPhoneCountry = cellDeliveryPhoneCountry.getContents();
			asiaMilesPO.setDeliveryPhoneCountry(deliveryPhoneCountry);
			
			// DELIVERY PHONE ZONE.
			cellDeliveryPhoneZone = sheetToRead.getCell(DELIVERY_PHONE_ZONE, row);			
			deliveryPhoneZone = cellDeliveryPhoneZone.getContents();
			asiaMilesPO.setDeliveryPhoneZone(deliveryPhoneZone);
			
			// DELIVERY PHONE NUMBER.
			cellDeliveryPhoneNumber = sheetToRead.getCell(DELIVERY_PHONE_NUMBER, row);			
			deliveryPhoneNumber = cellDeliveryPhoneNumber.getContents();
			asiaMilesPO.setDeliveryPhoneNumber(deliveryPhoneNumber);
			
			// DELIVERY PHONE INSTRUCTION.
			cellDeliveryPhoneInstruction = sheetToRead.getCell(DELIVERY_PHONE_INSTRUCTION, row);			
			deliveryPhoneInstruction = cellDeliveryPhoneInstruction.getContents();
			asiaMilesPO.setDeliveryPhoneInstruction(deliveryPhoneInstruction);
			
			// ADDRESS INSTRUCTION.
			cellAddressInstruction = sheetToRead.getCell(ADDRESS_INSTRUCTION, row);			
			addressInstruction = cellAddressInstruction.getContents();
			asiaMilesPO.setAddressInstruction(addressInstruction);
			
			// COMPANY NAME.
			cellCompanyName = sheetToRead.getCell(COMPANY_NAME, row);			
			companyName = cellCompanyName.getContents();
			asiaMilesPO.setCompanyName(companyName);
			
			// ADDRESS1.
			cellAddress1 = sheetToRead.getCell(ADDRESS1, row);			
			address1 = cellAddress1.getContents();
			asiaMilesPO.setAddress1(address1);

			// ADDRESS2.
			cellAddress2 = sheetToRead.getCell(ADDRESS2, row);			
			address2 = cellAddress2.getContents();
			asiaMilesPO.setAddress2(address2);

			// ADDRESS3.
			cellAddress3 = sheetToRead.getCell(ADDRESS3, row);			
			address3 = cellAddress3.getContents();
			asiaMilesPO.setAddress3(address3);
	
			// ADDRESS3.
			cellCity = sheetToRead.getCell(CITY, row);			
			city = cellCity.getContents();
			asiaMilesPO.setCity(city);
			
			// POSTAL CODE.
			cellPostalCode = sheetToRead.getCell(POSTAL_CODE, row);			
			postalCode = cellPostalCode.getContents();
			asiaMilesPO.setPostalCode(postalCode);
		
			// STATE NAME.
			cellStateName = sheetToRead.getCell(STATE_NAME, row);			
			stateName = cellStateName.getContents();
			asiaMilesPO.setStateName(stateName);
	
			// STATE NAME.
			cellEmailAddress = sheetToRead.getCell(EMAIL_ADDRESS, row);			
			emailAddress = cellEmailAddress.getContents();
			asiaMilesPO.setEmailAddress(emailAddress);
			listAsieMilesPODto.add(asiaMilesPO);			
		}

	} catch (Exception x) {
		x.printStackTrace();
	}
	
	return listAsieMilesPODto;
		
	}

}
