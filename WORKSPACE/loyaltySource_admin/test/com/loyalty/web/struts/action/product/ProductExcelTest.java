package com.loyalty.web.struts.action.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.web.struts.action.product.SaveProduct;

public class ProductExcelTest {

	public static final short GROUP = 0;
	public static final short CATEGORY = 1;
	public static final short TYPE = 2;
	public static final short BRAND = 3;
	public static final short PRODUCT = 4;
	public static final short MODELNUMBER = 5;
	public static final short MODELNUMBERQUANTITY = 6;
	public static final short MODELNUMBER1 = 7;
	public static final short MODELNUMBERQUANTITY1 = 8;
	public static final short MODELNUMBER2 = 9;
	public static final short MODELNUMBERQUANTITY2 = 10;
	public static final short MODELNUMBER3 = 11;
	public static final short MODELNUMBERQUANTITY3 = 12;
	public static final short DESCRIPTION = 13;
	public static final short TECSPECIFICATION = 14;
	public static final short BOXSIZE = 16;
	public static final short WEIGHT = 17;
	public static final short OTHER = 20;
	public static final short COST = 21;
	public static final short MSRP = 22;
	public static final short PRODUCTCODE = 23;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// An excel file name. You can create a file name with a full
		// path information.
		//
		String filename = "C:\\Documentacion2\\loyalty\\dataImport.xls";
		 
		//
		// Create an ArrayList to store the data read from excel sheet.
		//
		List sheetData = new ArrayList();
		String[] size = new String[3];
		
		/*System.out.print(System.getProperty("java.class.path"));
		
		Request request = new Request() ;
		UserSessionDTO userSession = UserSessionDTO.valueOf(1, "test100", 1, 1, 1, 10, "halo@hhh.com", "ABC", true);
		if( userSession != null){
			request.setAttribute(WebConstants.USER, userSession);
		}
	*/
		FileInputStream fis = null;
		try {
			
			SaveProduct saveProduct = new SaveProduct();
			//saveProduct.setServletRequest(request);
			//
			// Create a FileInputStream that will be use to read the
			// excel file.
			//
			fis = new FileInputStream(filename);
			 
			//
			// Create an excel workbook from the file system.
			//
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			//
			// Get the first sheet on the workbook.
			//
			HSSFSheet sheet = workbook.getSheetAt(0); 
			 
			//
			// When we have a sheet object in hand we can iterator on
			// each sheet's rows and on each row's cells. We store the
			// data read on an ArrayList so that we can printed the
			// content of the excel to the console.
			//
			Iterator rows = sheet.rowIterator();
			while (rows.hasNext()) {
				HSSFRow row = (HSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				List data = new ArrayList();
				/*while (cells.hasNext()) {
					HSSFCell cell = (HSSFCell) cells.next();
					data.add(cell);
				}*/
				saveProduct.setBrand(Long.parseLong(getValue(row.getCell(BRAND))));
				saveProduct.setCategory(Long.parseLong(getValue(row.getCell(CATEGORY))));
				try{
					saveProduct.setMainSpecification(Long.parseLong(getValue(row.getCell(TYPE))));
				}catch (Exception e) {
					saveProduct.setMainSpecification(51);
				}
				
				saveProduct.setManufProductID(getValue(row.getCell(MODELNUMBER)));
				saveProduct.setManufProductID1(getValue(row.getCell(MODELNUMBER1)));
				saveProduct.setManufProductID2(getValue(row.getCell(MODELNUMBER2)));
				saveProduct.setManufProductID3(getValue(row.getCell(MODELNUMBER3)));
				saveProduct.setManufProductID4("");
				
				if(row.getCell(MODELNUMBERQUANTITY) != null && row.getCell(MODELNUMBERQUANTITY).getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
					saveProduct.setManufProductQuantity(Integer.valueOf(getValue(row.getCell(MODELNUMBERQUANTITY))));
				if(row.getCell(MODELNUMBERQUANTITY1) != null && row.getCell(MODELNUMBERQUANTITY1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
					saveProduct.setManufProductQuantity1(Integer.valueOf(getValue(row.getCell(MODELNUMBERQUANTITY1))));
				if(row.getCell(MODELNUMBERQUANTITY2) != null && row.getCell(MODELNUMBERQUANTITY2).getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
					saveProduct.setManufProductQuantity2(Integer.valueOf(getValue(row.getCell(MODELNUMBERQUANTITY2))));
				if(row.getCell(MODELNUMBERQUANTITY3) != null && row.getCell(MODELNUMBERQUANTITY3).getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
					saveProduct.setManufProductQuantity3(Integer.valueOf(getValue(row.getCell(MODELNUMBERQUANTITY3))));
				
				saveProduct.setLoyaltyProductId(getValue(row.getCell(PRODUCTCODE)));
				
				saveProduct.setNameEn(getValue(row.getCell(PRODUCT)));
				saveProduct.setNameFr(getValue(row.getCell(PRODUCT)));
				
				saveProduct.setMsrp(String.valueOf(row.getCell(MSRP).getNumericCellValue()));
				if(row.getCell(OTHER) != null && row.getCell(OTHER).getCellType() == HSSFCell.CELL_TYPE_STRING)
				{
					saveProduct.setOtherEng(getValue(row.getCell(OTHER)));
					saveProduct.setOtherFr(getValue(row.getCell(OTHER)));
				}
				else
				{
					saveProduct.setOtherEng("");
					saveProduct.setOtherFr("");
				}
				saveProduct.setCost(String.valueOf(row.getCell(COST).getNumericCellValue()));
				size = getValue(row.getCell(BOXSIZE)).split("x");
				if(size.length == 3)
				{
					if(size[0] != "")
						saveProduct.setWidth(size[0]);
					if(size[1] != "")
						saveProduct.setLarge(size[1]);
					if(size[2] != "")
						saveProduct.setHigh(size[2]);
				}
				
				saveProduct.setDescriptionEn(getValue(row.getCell(DESCRIPTION)));
				saveProduct.setDescriptionFr(getValue(row.getCell(DESCRIPTION)));
				
				saveProduct.setSpecificationEn("<p>" + getValue(row.getCell(TECSPECIFICATION)).replace("\n", "</p><p>") + "</p>");
				saveProduct.setSpecificationFr("<p>" + getValue(row.getCell(TECSPECIFICATION)).replace("\n", "</p><p>") + "</p>");
				
				//ImageDTO imageDTO = ImageDTO.valueOf(35, name, size, height, width, resolution, large, realName, score)
				
				saveProduct.setProductImageFileName(saveProduct.getLoyaltyProductId() + ".jpg");
				saveProduct.setProductImage(new File("C:\\Documentacion2\\loyalty\\image\\" + saveProduct.getProductImageFileName()));
				/*if(!saveProduct.getProductImage().exists())
					saveProduct.setProductImage(null);*/
				saveProduct.setProductImageContentType("image/jpeg");
				
				
				saveProduct.execute();
				
				//waiting(3);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServiceLocatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	
	
	private static String getValue(HSSFCell cell)
	{
		String result = "";
		if(cell != null)
		{
			if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING )
			{
				result = cell.getStringCellValue();
			}
			else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
			{
				
				result = String.valueOf(cell.getNumericCellValue()).split("\\.")[0];
				//result = String.valueOf(cell.getNumericCellValue());
			}
		}
		return(result);
	}
	
	
	public static void waiting (int n){
	        
	        long t0, t1;
	
	        t0 =  System.currentTimeMillis();
	
	        do{
	            t1 = System.currentTimeMillis();
	        }
	        while ((t1 - t0) < (n * 1000));
	    }

}
