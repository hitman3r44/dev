package com.loyauty.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;

public class GenerateScriptSqlFromXLS_Routine {

	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	
public static void main(String... args) {
	int row = 0;
	serviceLocator = ServiceLocator.getInstance();
	
try {
	productService = serviceLocator.getProductService();
	ArrayList<ProductDTO>list=(ArrayList<ProductDTO>)getProductListFromLSProductIdXLS("C:\\DOCUMENTATION_KLF\\InactiveToActive\\Achievers 2013-08-01.xls");
	createScriptSQL("C:\\dev\\db\\SCRIPT\\activeProductToAchivers.sql",list);
	} catch (Exception x) {
		x.printStackTrace();
	}
	
	System.out.println("XLS PROGRAM SUCCESSFULLY EXECUTED!!!");
	
	System.exit(0);
		
	}
	

	public static Collection getProductListFromLSProductIdXLS(String destinationFile) {
		Collection result = new ArrayList();
			int ROW_TO_START = 1;
			int COL_PRODUCT_ID=0 ;
			//Values of cells
			String lsProductID="";
			//Cells
			Cell cellProductId= null;
		try {
			Workbook existingWorkbook = Workbook.getWorkbook(new File(destinationFile));
			Sheet sheetToRead=existingWorkbook.getSheet(0);
			int ROW_MAX = sheetToRead.getRows();
			for(int row=ROW_TO_START; row< ROW_MAX;row++) {
				//--------------- 1: ProductId
				cellProductId = sheetToRead.getCell(COL_PRODUCT_ID, row);			
				if(cellProductId!=null)lsProductID = cellProductId.getContents();
				int index=-1;
				index=lsProductID.indexOf(" ");
				if(index>=0){
					index=1;
					lsProductID=lsProductID.substring(index+1, lsProductID.length());
					lsProductID=lsProductID.replaceAll(" ", "");
				}
				ProductDTO prodDTO=productService.getProductIdFromLSProductId(lsProductID);
				if(prodDTO==null)System.out.println("////////////////////// Erreur ////////////////////:"+lsProductID);
				if(prodDTO!=null)result.add(prodDTO);
			}

		} catch (Exception x) {
			x.printStackTrace();
		}

	return result;
		
	}
	
	
	public static void createScriptSQL(String nomFichier,ArrayList<ProductDTO>listPrdDTO){
		String ligne="";
		File fb = new File(nomFichier); 
		fb.mkdirs(); 
		File f=new File(nomFichier);
		f.delete();
		
		try{
		PrintWriter pw= new PrintWriter(new FileWriter(nomFichier,true),true);
		for(ProductDTO prd:listPrdDTO){  
			if(prd!=null){
				//BI_    BIWorld user_id=49
				//ligne="UPDATE user_product_price SET status_id=1 WHERE user_id=49 and product_id="+prd.getId()+" and product_id in(select P.id from product P where P.status_id in(1,2));";
				//AC_    Achivers user_id=39
				ligne="UPDATE user_product_price SET status_id=1 WHERE user_id=39 and product_id="+prd.getId()+" and product_id in(select P.id from product P where P.status_id in(1,2));";
				pw.println(ligne);	
			}
			
		}

		pw.close();
		}catch(IOException e){
		System.out.println("Dossier ou lecteur invalide");	
		}

	}
	
	
	
	
	
	
	
	
	
}
