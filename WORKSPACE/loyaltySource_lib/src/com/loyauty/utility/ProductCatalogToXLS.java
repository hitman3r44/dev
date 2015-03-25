package com.loyauty.utility;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.product.ProductService;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
*/

public class ProductCatalogToXLS {
	
	private static final double CELL_DEFAULT_HEIGHT = 133;	// 120
	private static final double CELL_DEFAULT_WIDTH = 133;	// 100
	
	private static final String sheetName = "Catalogue 2013-2014";	
	private static final int ROW_TO_BEGIN = 2;
	private static final int COL_IMAGE = 0;	
	private static final int COL_GROUPNAME = 3;
	private static final int COL_BRANDNAME = 5;
	private static final int COL_PRODUCTNAME = 6;
	private static final int COL_DESCRIPTION = 7;
	private static final int COL_LSPRODUCTID= 13;
	private static final int COL_MODELNUMBER = 14;
	private static final int COL_AGENCY = 21;
	private static final int COL_SUPPLIER = 22;
	private static final int COL_COST = 23;
	private static final int COL_INDV_DROP_SHIP_FEE = 24;
	private static final int COL_LETTER_INCL_FEE = 25;
	private static final int COL_MSRP = 26;
	private static final int COL_DATE_AVAILABILITY = 27;
	private static final int COL_WARRANTY = 28;	
	private static final int COL_EXTD_WARRANTY = 29;
	private static final int COL_SHIPPING = 30;
		
	private static final long REPORT_USER_ID = 10L;				// 'Rideau'
	private static final String REPORT_USER_CODE = "RD_";		// 'Rideau'
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String... args) {
		
		long userId = REPORT_USER_ID;
		
		List<ProductDTO> productDTOList = null;
		
		long categoryGroupId = 0L;
		String groupName = "";
		String brandName = "";
		String productName = "";
		String desc = "";
		String spec = "";
		String descSpec = "";
		String cost = "";
		String msrp = "";
		double msrpVal = 0d;
		String loyaltyProductId = "";
		String modelNumber = "";
		String weight = "";
		String length = "", l = "";
		String width = "", w = "";
		String height = "", h = "";
		String dimensions = "";
		String shippingInstructions = "";
		String warranty = "";
		
		int row = 0;
		
		serviceLocator = ServiceLocator.getInstance();
		
	try {
		productService = serviceLocator.getProductService();
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File("C:\\xls\\abc.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File("C:\\xls\\Rideau-2013-04-04_v1.xls"), existingWorkbook);
		WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);
		
		WritableCell cellGroupName = null;
		WritableCell cellBrandName = null;
		WritableCell cellProductName = null;
		WritableCell cellDesc = null;
		WritableCell cellLSProductId = null;
		WritableCell cellModelNumber = null;
		WritableCell cellAgency = null;
		WritableCell cellSupplier = null;
		WritableCell cellCost = null;
		WritableCell cellIndvDropShipFee = null;
		WritableCell cellLetterInclFee = null;
		WritableCell cellMSRP = null;
		WritableCell cellAvailability = null;
		WritableCell cellWarranty = null;
		WritableCell cellExtdWarranty = null;
		WritableCell cellShipping = null;
		
		Label labelGroupName = null;
		Label labelBrandName = null;
		Label labelProductName = null;
		Label labelDesc = null;
		Label labelLSProductId = null;
		Label labelModelNumber = null;
		Label labelAgency = null;
		Label labelSupplier = null;
		Label labelCost = null;
		Label labelIndvDropShipFee = null;
		Label labelLetterInclFee = null;
		Label labelMSRP = null;
		Label labelAvailability = null;
		Label labelWarranty = null;
		Label labelExtdWarranty = null;
		Label labelShipping = null;
		
		File imageFile = null;
		BufferedImage imageInput = null;
		ByteArrayOutputStream baos = null;
		
		WritableImage writableImage = null;
				
		row = ROW_TO_BEGIN;
		//	productDTOList = productService.getValidProductsByUserIdAndExcluded(userId);
			
		List<ProductDTO> productDTOList1 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 189L);
		List<ProductDTO> productDTOList2 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 188L);
		List<ProductDTO> productDTOList3 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 186L);		
		List<ProductDTO> productDTOList4 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 192L);
		List<ProductDTO> productDTOList5 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 185L);
		List<ProductDTO> productDTOList6 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 184L);
		List<ProductDTO> productDTOList7 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 190L);
		List<ProductDTO> productDTOList8 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 187L);
		List<ProductDTO> productDTOList9 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 191L);
		List<ProductDTO> productDTOList10 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 183L);
		List<ProductDTO> productDTOList11 = productService.getAllValidStatusProductsGCB(userId, 9L, 16L, 193L);
		
		productDTOList = new ArrayList<ProductDTO>();
		productDTOList = fillProductDTOList(productDTOList, productDTOList1);
		productDTOList = fillProductDTOList(productDTOList, productDTOList2);
		productDTOList = fillProductDTOList(productDTOList, productDTOList3);
		productDTOList = fillProductDTOList(productDTOList, productDTOList4);
		productDTOList = fillProductDTOList(productDTOList, productDTOList5);
		productDTOList = fillProductDTOList(productDTOList, productDTOList6);
		productDTOList = fillProductDTOList(productDTOList, productDTOList7);
		productDTOList = fillProductDTOList(productDTOList, productDTOList8);
		productDTOList = fillProductDTOList(productDTOList, productDTOList9);
		productDTOList = fillProductDTOList(productDTOList, productDTOList10);
		productDTOList = fillProductDTOList(productDTOList, productDTOList11);		
		
		
		for (ProductDTO productDTO : productDTOList) {
			
			System.out.println("productID = " + productDTO.getId());
			
			// IMAGE [PHOTO] AT LOW RESOLUTION.
			if (productDTO.getImage() != null) {
				if (productDTO.getImage().getRealName() != null) {
					imageFile = new File("C:\\xls\\media\\product\\thumbnail\\" + productDTO.getImage().getName());
					imageInput = ImageIO.read(imageFile);
					baos = new ByteArrayOutputStream();
					ImageIO.write(imageInput, "PNG", baos);					
					writableImage = new WritableImage(	COL_IMAGE, row, 
										imageInput.getWidth() / CELL_DEFAULT_WIDTH, 
										imageInput.getHeight() / CELL_DEFAULT_HEIGHT, 
										baos.toByteArray());
					writableImage.setImageAnchor(WritableImage.MOVE_WITH_CELLS);			
					sheetToEdit.addImage(writableImage);
				}
			}
			
			// GROUP NAME. -- REMARK: THE YIELDED TABLE NAMES THIS LIKE 'CATEGORY'.
			if (productDTO.getCategory() != null) {
				categoryGroupId = productDTO.getCategory().getCategoryGoupeId();				
				groupName = findGroupName(categoryGroupId);				
				labelGroupName = new Label(COL_GROUPNAME, row, groupName);
				cellGroupName =  (WritableCell) labelGroupName;
				sheetToEdit.addCell(cellGroupName);
			}
			
			// BRAND NAME.
			if (productDTO.getBrand() != null) {
				brandName = productDTO.getBrand().getName();
				labelBrandName = new Label(COL_BRANDNAME, row, brandName);
				cellBrandName = (WritableCell) labelBrandName;
				sheetToEdit.addCell(cellBrandName);
			}
				
			// ENGLISH TITLE.
			productName = productDTO.getNameEng().getName();
			labelProductName = new Label(COL_PRODUCTNAME, row, productName);
			cellProductName = (WritableCell) labelProductName;
			sheetToEdit.addCell(cellProductName);			
			
			// ENGLISH DESCRIPTION + SPECIFICATION.
			desc = productDTO.getDescriptionEng().getName();
			spec = productDTO.getSpecificationEng().getName();		
			descSpec = html2text(desc) + "\n" + html2text(spec);
/*
			Document docDesc = Jsoup.parse(spec);
			Elements elements = docDesc.body().select("*");
			for (Element element : elements) {
				System.out.println("[spec] [productID = " + productDTO.getId() 
							+  "] [element] line: |" + element.ownText() + "|\n");
			}
*/						
			labelDesc = new Label(COL_DESCRIPTION, row, descSpec);
			cellDesc = (WritableCell) labelDesc;
			sheetToEdit.addCell(cellDesc);
						
			// LS-PRODUCT ID.
			loyaltyProductId = REPORT_USER_CODE + productDTO.getLoyaltyProductId();
			labelLSProductId = new Label(COL_LSPRODUCTID, row, loyaltyProductId);
			cellLSProductId = (WritableCell) labelLSProductId;
			sheetToEdit.addCell(cellLSProductId);
			
			// MANUFACTURER'S MODEL NUMBER.
			if(productDTO.getManufactureProductList().size() >= 1) {
				modelNumber = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
				labelModelNumber = new Label(COL_MODELNUMBER, row, modelNumber);
				cellModelNumber = (WritableCell) labelModelNumber;
				sheetToEdit.addCell(cellModelNumber);
			}
			
			// AGENCY = Loyalty Source.
			labelAgency = new Label(COL_AGENCY, row, "Loyalty Source");
			cellAgency = (WritableCell) labelAgency;
			sheetToEdit.addCell(cellAgency);		
			
			// SUPPLIER = Loyalty Source.
			labelSupplier = new Label(COL_SUPPLIER, row, "Loyalty Source");
			cellSupplier = (WritableCell) labelSupplier;
			sheetToEdit.addCell(cellSupplier);
			
			// COST.
			cost = productDTO.getPriceProduct();
			double priceVal = 0d;				
			if (cost != null) {
				if (!cost.matches("^\\s*$") && !cost.equalsIgnoreCase("")) {	
					priceVal = Double.parseDouble(cost);
					cost = format(priceVal, "#,###.00", "en", "US");
				} else {
					priceVal = 0d;
					cost = "0.00";
				}
				if (cost.equalsIgnoreCase(".00")) {
					cost = "0.00";
				}
			}
			cost = cost + "$";
			labelCost = new Label(COL_COST, row, cost);
			cellCost = (WritableCell) labelCost;
			sheetToEdit.addCell(cellCost);
						
			// INDIVIDUAL DROP SHIP FEE = 0.00$.
			labelIndvDropShipFee = new Label(COL_INDV_DROP_SHIP_FEE, row, "0.00$");
			cellIndvDropShipFee = (WritableCell) labelIndvDropShipFee;
			sheetToEdit.addCell(cellIndvDropShipFee);
						
			// LETTER INCLUSION FEE = 0.00$.
			labelLetterInclFee = new Label(COL_LETTER_INCL_FEE, row, "0.00$");
			cellLetterInclFee = (WritableCell) labelLetterInclFee;
			sheetToEdit.addCell(cellLetterInclFee);
						
			// MSRP.
			msrp = productDTO.getMsrp();
			msrpVal = 0d;			
			if (msrp != null) {
				if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {
					msrpVal = Double.parseDouble(msrp);
					msrp = format(msrpVal, "#,###.00", "en", "US");
				} else {
					msrp = "";
				}
				if (msrp.equalsIgnoreCase(".00")) {
					msrp = "$0.00";
				}
			}
			msrp = msrp + "$";
			labelMSRP = new Label(COL_MSRP, row, msrp);
			cellMSRP = (WritableCell) labelMSRP;
			sheetToEdit.addCell(cellMSRP);
			
			// DATE OF AVAILABILITY = NOW().
			labelAvailability = new Label(COL_DATE_AVAILABILITY, row, "Now");
			cellAvailability = (WritableCell) labelAvailability;
			sheetToEdit.addCell(cellAvailability);
			
			// MANUFACTURE WARRANTY INFORMATION.
			warranty = (productDTO.getWarrantyEng() != null) ? productDTO.getWarrantyEng().getName() : "";
			labelWarranty = new Label(COL_WARRANTY, row, warranty);
			cellWarranty = (WritableCell) labelWarranty;
			sheetToEdit.addCell(cellWarranty);
			
			// EXTENDED WARRANTY INFORMATION.
			labelExtdWarranty = new Label(COL_EXTD_WARRANTY, row, "None");
			cellExtdWarranty = (WritableCell) labelExtdWarranty;
			sheetToEdit.addCell(cellExtdWarranty);			

			// SHIPPING INSTRUCTIONS - DIMENSIONS [WIDTH X LENGTH X HEIGHT] + WEIGHT.
			weight = productDTO.getWeight();
			if (weight != null) {
				weight = (!weight.matches("^\\s*$")) ? String.valueOf(weight) : "0";
			} else {
				weight = "0";
			}			
			// SHIPPING SIZE - DIMENSIONS [WIDTH X LENGTH X HEIGHT].
			width = productDTO.getWidth();	w = (!width.equalsIgnoreCase("0")) ? String.valueOf(width) : "";
			length = productDTO.getLarge();	l = (!length.equalsIgnoreCase("0")) ? String.valueOf(length) : "";	
			height = productDTO.getHigh();	h = (!height.equalsIgnoreCase("0"))  ? String.valueOf(height)  : "";
			dimensions = w + " x " + l + " x " + h;
			shippingInstructions = dimensions + " in " + weight + "lbs";
			labelShipping = new Label(COL_SHIPPING, row, shippingInstructions);
			cellShipping = (WritableCell) labelShipping;
			sheetToEdit.addCell(cellShipping);
						
			++row;
		}
		
		 workbookCopy.write();
		 workbookCopy.close();
		 existingWorkbook.close();
		
	} catch (Exception x) {
		x.printStackTrace();
	}
	
	System.out.println("XLS PROGRAM SUCCESSFULLY EXECUTED!!!");
	
	System.exit(0);
		
	}

	private static List<ProductDTO> fillProductDTOList(List<ProductDTO> productDTOList, List<ProductDTO> productDTOList1) {
		for (ProductDTO productDTO : productDTOList1) {
			productDTOList.add(productDTO);
		}
		return productDTOList;
	}
	
	private static String findGroupName(Long categoryGroupId) {
		String outcome = "";
		GroupCategoryEnum[] groupArray = GroupCategoryEnum.values();
		for (GroupCategoryEnum groupEnum : groupArray) {
			if (groupEnum.getValue() == categoryGroupId.intValue()) {
				outcome = groupEnum.getCode();
			}			
		}
		return outcome;
	}
	
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}

}
