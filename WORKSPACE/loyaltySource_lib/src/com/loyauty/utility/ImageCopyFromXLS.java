package com.loyauty.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ImageCopyFromXLS {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String... args) {
		
		int numberOfFilesWithSpecialCharacters = 0;
		String fileNameBeenReplaced = "";
		long beenReplacedProductID = 0L;
		
		serviceLocator = ServiceLocator.getInstance();
		
		try {
			productService = serviceLocator.getProductService();
			
			long productID = 0L;
			ProductDTO productDTO = null;
			String sourceImgName = "";
			String loyaltyProductID = "";
			String sourceFileName = "";
			String targetFileName = "";
			
			Workbook workbook = Workbook.getWorkbook(new File("C:\\xls\\imageCopy\\VibeSMG.xls"));
			Sheet sheet = workbook.getSheet(0);
			Cell cell = null;
			boolean toggle = false;
			
			for (int row=3; row <= 1690; row++) {
				cell = sheet.getCell(0, row);
				productID = Long.parseLong(cell.getContents());
				System.out.print("productID: |" + cell.getContents() + "|");
				productDTO = productService.getProductInformation(productID, null);
				
				sourceImgName = productDTO.getImage().getName();
				sourceFileName = "C:\\xls\\imageCopy\\large\\" + sourceImgName;
				InputStream in = new FileInputStream(sourceFileName);
				
				loyaltyProductID = productDTO.getLoyaltyProductId();
				if (loyaltyProductID.contains("/")) {
					toggle = true;
					++numberOfFilesWithSpecialCharacters;
				}
				loyaltyProductID = loyaltyProductID.replaceAll("/", "-");
				System.out.print(", loyaltyProductID: |" + loyaltyProductID + "|");
				
				targetFileName = "C:\\xls\\imageCopy\\output\\" + loyaltyProductID + ".jpg";
				if (toggle) {
					fileNameBeenReplaced = targetFileName;
					beenReplacedProductID = productID;
					toggle = false;
				}
				
				System.out.print(", targetFileName: |" + targetFileName + "|");
				OutputStream out = new FileOutputStream(targetFileName);

				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				in.close();
				out.close();
				
				System.out.println(" at row = " + row + " from source: |" + sourceFileName);
				
			}
						
		} catch (IOException iox) {
			iox.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		System.out.println("+++++++++++++++++ numberOfFilesWithSpecialCharacters = " + numberOfFilesWithSpecialCharacters
							+ ", fileNameBeenReplaced: |" + fileNameBeenReplaced + "| on productID = " + beenReplacedProductID);
		System.out.println("------------------ END OF EXECUTION FOR ImageCopyFromXLS-CLASS --------------");
		
		System.exit(0);
		
	}
	
}
