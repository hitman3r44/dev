package com.loyauty.web.struts.action.product;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.UserProductStatus;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.UserProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.util.CommonUtils;
import com.loyauty.web.struts.action.LoyautyAction;

public class ExportToExcel extends LoyautyAction {
	
	
	private ProductService productService;
	
	@Getter @Setter
	private long brand;
	@Getter @Setter
	private long category;
	@Getter @Setter
	private long userId;	
	@Getter @Setter
	private List<UserProductDTO> UserProductList;
	@Getter @Setter
	private String contentDisposition;
	@Getter @Setter
	private ByteArrayInputStream excelStream;
	@Getter @Setter
	private String userName;
	@Getter @Setter
	private Integer upstatus;
	
	
	
	public ExportToExcel () throws ServiceLocatorException  {
		super();				
		productService = this.getServiceLocator().getProductService();
	}
	
	
	@Override  
	public String execute() throws Exception {							
				
		// listing result
		UserProductDTO producDTO = new UserProductDTO();
		producDTO.setUserId(userId);
		producDTO.setBrandId(brand<=0?null:brand);
		producDTO.setCategoryId(category<=0?null:category);
		producDTO.setUserProductStatus((UserProductStatus) CommonUtils.enumFromValue(UserProductStatus.values(), upstatus) );
		UserProductList = productService.getAllProdcutForProfit(producDTO);		
		
		setContentDisposition("attachment; filename=\""+ userName + ".xls\"");


	    try{
	        HSSFWorkbook hwb=new HSSFWorkbook();
	        HSSFSheet sheet =  hwb.createSheet("new sheet");
	        
	        HSSFRow rowhead =   sheet.createRow((short)0);
	        rowhead.createCell((short) 0).setCellValue("User Id");
	        rowhead.createCell((short) 1).setCellValue("User Name");
	        rowhead.createCell((short) 2).setCellValue("Category");
	        rowhead.createCell((short) 3).setCellValue("Main Specification");
	        rowhead.createCell((short) 4).setCellValue("LS Product ID");
	        rowhead.createCell((short) 5).setCellValue("Manufacturer ID(s)");
	        rowhead.createCell((short) 6).setCellValue("Name");
	        rowhead.createCell((short) 7).setCellValue("Our Cost");
	        rowhead.createCell((short) 8).setCellValue("Selling");
	        rowhead.createCell((short) 9).setCellValue("MSRP");
	        rowhead.createCell((short) 10).setCellValue("Profit($)");
	        rowhead.createCell((short) 11).setCellValue("Profit(%)");
	        rowhead.createCell((short) 12).setCellValue("Status");
	        rowhead.createCell((short) 13).setCellValue("User Product Status");

	        short i = 1;
	        for(UserProductDTO dto : UserProductList){
	        //////You can repeat this part using for or while to create multiple rows//////
	            HSSFRow row = sheet.createRow(i);  
	            row.createCell((short) 0).setCellValue(dto.getUserId());
	            row.createCell((short) 1).setCellValue(userName);
	            row.createCell((short) 2).setCellValue(dto.getCategoryId());
	            row.createCell((short) 3).setCellValue(dto.getSpecificationEn());
	            row.createCell((short) 4).setCellValue(dto.getLsProductId());
	            row.createCell((short) 5).setCellValue(dto.getManufacturerProductId());
	            row.createCell((short) 6).setCellValue(dto.getNameEng());
	            row.createCell((short) 7).setCellValue(dto.getCost());
	            row.createCell((short) 8).setCellValue(dto.getUserPrice());
	            row.createCell((short) 9).setCellValue(dto.getMsrp());
	            row.createCell((short) 10).setCellValue(dto.getDollarProfit());
	            row.createCell((short) 11).setCellValue(dto.getPercProfit());
	            row.createCell((short) 12).setCellValue(dto.getProductStatus().name());
	            row.createCell((short) 13).setCellValue(dto.getUserProductStatus().getCode());
	            i++;
	        }
	        ///////////////////////////////////////////////////////////////////////////////

	        ///////////////////////////////////////////////////////////////////////////////
	        //////Now you are ready with the HSSFworkbook object to be sent to client//////
	        ///////////////////////////////////////////////////////////////////////////////

	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        hwb.write(baos);
	        excelStream = new ByteArrayInputStream(baos.toByteArray());

	        ///////////////////////////////////////////////////////////////////////////////
	        ////Here HSSFWorkbook object is sent directly to client w/o saving on server///
	        ///////////////////////////////////////////////////////////////////////////////
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
		return getSuccessResult();
	}

}
