package com.loyauty.utility.special_routine;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;

import jxl.Cell;
import jxl.Sheet;
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

public class ProductCatalogToXLSWithImagesFrDoubleShipping {
	private static final double CELL_DEFAULT_HEIGHT = 133;	// 120
	private static final double CELL_DEFAULT_WIDTH = 133;	// 100
	
	private static final String sheetName = "Sheet1";
	private static final int ROW_TO_BEGIN = 3;
	private static final int COL_IMAGE = 0;
	private static final int COL_GROUPNAME = 1;
	private static final int COL_CATEGORYNAME = 2;
	private static final int COL_TYPENAME = 3;
	private static final int COL_BRANDNAME = 4;
	private static final int COL_PRODUCTNAME = 5;
	private static final int COL_LARGEIMAGELINK = 6;
	private static final int COL_THUMBIMAGELINK = 7;
	
	private static final int COL_DESCRIPTION_EN = 8;
	private static final int COL_DESCRIPTION_FR = 9;
	
	private static final int COL_SPECIFICATION_EN = 10;
	private static final int COL_SPECIFICATION_FR = 11;
	
	private static final int COL_OTHER_EN = 12;
	private static final int COL_OTHER_FR = 13;
	
	private static final int COL_COST = 14;
	private static final int COL_MSRP = 15;
	private static final int COL_DISCOUNT = 16;
	private static final int COL_LSPRODUCTID = 17;
	private static final int COL_MODELNUMBER = 18;
	private static final int COL_WEIGHT = 19;
	private static final int COL_SHIPPING = 20;
	private static final int COL_WARRANTY = 21;
	private static final int COL_SHIPPINGPROVINCE = 22;	//19 --> 22
	private static final int COL_SHIPPINGCANADA = 36;	// 33 --> 36
	private static final int COL_PRODUCT_ID = 38;		// 35 --> 38
	private static final int COL_STATUS = 37;		// 
	private static final int COL_UPC = 44;		// 
	
	private static final long REPORT_USER_ID = 39L;	  			// 39;"Achievers";"AC_"

	private static final String REPORT_USER_CODE = "AC_";	
	private static final String USER_LOGIN = "Achievers";
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	
	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		
		long userID = REPORT_USER_ID;
		
		List<ProductDTO> productDTOList = null;
		List<ProductDTO> productDTOListPetit = null;
		UserProductPriceDTO userProductPriceDTO = null;
		
		long productID = 0L;
		long categoryGroupId = 0L;
		String groupName = "";
		String categoryName = "";
		long specId = 0L;
		SpecificationDTO specDTO = null;
		String specName = "";
		String brandName = "";
		String productName = "";
		String imageLargeLink = "";
		String imageThumbnailLink = "";
		String desc = "";
		String spec = "";
		String other = "";
		String cost = "";
		double msrpVal = 0d;
		String msrp = "";
		double discountVal = 0d;
		String discount = "";
		String loyaltyProductId = "";
		String modelNumber = "";
		String weight = "";
		String length = "", l = "";
		String width = "", w = "";
		String height = "", h = "";
		String dimensions = "";
		String warranty = "";

		List<ShippingTotalDTO> ShippingByProvinceList = new ArrayList<ShippingTotalDTO>();
		String estimatedShippingRateCANADA = "";
		
		int row = 0;
		
		serviceLocator = ServiceLocator.getInstance();
		
	try {
		productService = serviceLocator.getProductService();
		specificationService = serviceLocator.getSpecificationService();
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File("C:\\xls_imgs\\template.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File("C:\\xls_imgs\\"+USER_LOGIN+"_Fr.xls"), existingWorkbook);
		WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);
		
		WritableCell cellGroupName = null;
		WritableCell cellCategoryName = null;
		WritableCell cellSpecName = null;
		WritableCell cellBrandName = null;
		WritableCell cellProductName = null;
		WritableCell cellLargeImageLink = null;
		WritableCell cellThumbImageLink = null;
		WritableCell cellDesc = null;
		WritableCell cellSpec = null;
		WritableCell cellOther = null;
		WritableCell cellCost = null;
		WritableCell cellMSRP = null;
		WritableCell cellDiscount = null;
		WritableCell cellLSProductId = null;
		WritableCell cellModelNumber = null;
		WritableCell cellWeight = null;
		WritableCell cellShipping = null;
		WritableCell cellWarranty = null;
		WritableCell cellShippingByProvince = null;
		WritableCell cellShippingCANADA = null;
		WritableCell cellProductID = null;
		WritableCell cellStatus = null;
		WritableCell cellUPC = null;
		
		Label labelGroupName = null;
		Label labelCategoryName = null;
		Label labelSpecName = null;
		Label labelBrandName = null;
		Label labelProductName = null;
		Label labelLargeImageLink = null;
		Label labelThumbImageLink = null;
		Label labelDesc = null;
		Label labelSpec = null;
		Label labelOther = null;
		Label labelCost = null;
		Label labelMSRP = null;
		Label labelDiscount = null;
		Label labelLSProductId = null;
		Label labelModelNumber = null;
		Label labelWeight = null;
		Label labelShipping = null;
		Label labelWarranty = null;
		Label labelShippingByProvince = null;
		Label labelShippingCANADA = null;
		Label labelProductID = null;
		Label labelStatus = null;
		Label labelUPC = null;
		
		File imageFile = null;
		BufferedImage imageInput = null;
		ByteArrayOutputStream baos = null;
		
		WritableImage writableImage = null;
		
		row = ROW_TO_BEGIN;
		ArrayList<String>imageMissing=new ArrayList<String>();
		productDTOList = productService.getValidProductsByUserIdAndExcluded(REPORT_USER_ID);
		Hashtable<String, String>hashProduct=new Hashtable<String, String>();
		//productDTOList = productService.getAllValidStatusProductsForAllUsers();
		//productDTOListPetit=(ArrayList<ProductDTO>)toArrayListFromXLS();
		
		for (ProductDTO productDTO : productDTOList) {
			productID = productDTO.getId();
			boolean exist=true;

			/*if(productDTO.getBrand() != null && (productDTO.getBrand().getName().equals("Apple")
					 ))exist=true;*/
			/*
			for(ProductDTO productDTOX : productDTOListPetit){
				
				if(productDTOX!=null && productDTOX.getId()==productID){
					exist=true;
					break;
				}
			}
			*/
			if(exist){
			// PRODUCT DESCRIPTION englais.
			String descEng = productDTO.getDescriptionEng().getName();
			descEng = html2text(descEng);
			descEng = descEng.replaceAll("\n", "")
					  .replaceAll("\t", "")
					  .replaceAll("\r", "")
					  .replaceAll("\n\t", "")
					  .replaceAll("\n\r", "");
			
			// PRODUCT DESCRIPTION Francais.
			String descFR = productDTO.getDescriptionFr().getName();
			descFR = html2text(descFR);
			descFR = descFR.replaceAll("\n", "")
					  .replaceAll("\t", "")
					  .replaceAll("\r", "")
					  .replaceAll("\n\t", "")
					  .replaceAll("\n\r", "");
			
			//if (productID != 5766L && !descEng.equals(descFR)) {	
			if (productID != 5766L) {		
				// LOW-RES [IMAGE] PHOTO
				
				//For blocking Images
//				if (productDTO.getImage() != null) {
//					if (productDTO.getImage().getRealName() != null) {
//						System.out.println("Image Name: |" + productDTO.getImage().getName() + "| at productID = " + productID);
//						imageFile = new File("C:\\xls_imgs\\thumbnail\\" + productDTO.getImage().getName());
//						if(imageFile.exists()){
//							imageInput = ImageIO.read(imageFile);
//							baos = new ByteArrayOutputStream();
//							ImageIO.write(imageInput, "PNG", baos);					
//							writableImage = new WritableImage(	COL_IMAGE, row, 
//												imageInput.getWidth() / CELL_DEFAULT_WIDTH, 
//												imageInput.getHeight() / CELL_DEFAULT_HEIGHT, 
//												baos.toByteArray());
//							writableImage.setImageAnchor(WritableImage.MOVE_WITH_CELLS);	
//							sheetToEdit.addImage(writableImage);
//						}else{
//							
//							imageMissing.add(productID +","+productDTO.getLoyaltyProductId()+","+productDTO.getImage().getName());
//						}
//
//					}
//				}
				//For blocking Images
				
				// GROUP NAME.
				if (productDTO.getCategory() != null) {
					categoryGroupId = productDTO.getCategory().getCategoryGoupeId();				
					groupName = categoryGroupId >= 1L
							? GroupCategoryEnum.values()[((int) categoryGroupId) - 1].getCode()
								: "";			
							labelGroupName = new Label(COL_GROUPNAME, row, groupName);
							cellGroupName =  (WritableCell) labelGroupName;
							sheetToEdit.addCell(cellGroupName);
				}
				
				// CATEGORY-NAME.
				if (productDTO.getCategory() != null) {
					categoryName = productDTO.getCategory().getName();
					labelCategoryName = new Label(COL_CATEGORYNAME, row, categoryName);
					cellCategoryName = (WritableCell) labelCategoryName;
					sheetToEdit.addCell(cellCategoryName);
				}
				
				// MAIN-SPECIFICATION-NAME.
				specId = productDTO.getMainFilterTypeId();
				specDTO = specificationService.getSpecification(specId);
				specName = (specDTO == null) ? "" : specDTO.getName();
				labelSpecName = new Label(COL_TYPENAME, row, specName);
				cellSpecName = (WritableCell) labelSpecName;
				sheetToEdit.addCell(cellSpecName);
				
				// BRAND NAME.
				if (productDTO.getBrand() != null) {
					brandName = productDTO.getBrand().getName();
					labelBrandName = new Label(COL_BRANDNAME, row, brandName);
					cellBrandName = (WritableCell) labelBrandName;
					sheetToEdit.addCell(cellBrandName);
				}

				// LS-PRODUCT ID.
				loyaltyProductId = REPORT_USER_CODE + productDTO.getLoyaltyProductId();
				productName = productDTO.getNameEng().getName();
				brandName ="";
				if (productDTO.getBrand() != null) {
					brandName = productDTO.getBrand().getName();
				}
				
				String productDef=loyaltyProductId +" * "+brandName+" "+productName;
				
				labelLSProductId = new Label(COL_LSPRODUCTID, row, productDef);
				cellLSProductId = (WritableCell) labelLSProductId;
				sheetToEdit.addCell(cellLSProductId);
				
			
//				// PRODUCT TITLE.
//				productName = productDTO.getNameEng().getName();
//				labelProductName = new Label(COL_PRODUCTNAME, row, productName);
//				cellProductName = (WritableCell) labelProductName;
//				sheetToEdit.addCell(cellProductName);
			
				
		
				// PRODUCT TITLE FR.
				productName = productDTO.getNameFr().getName();
				labelProductName = new Label(COL_PRODUCTNAME, row, productName);
				cellProductName = (WritableCell) labelProductName;
				sheetToEdit.addCell(cellProductName);
			
			
				
				// LARGE-IMAGE LINK
				imageLargeLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageLargeLink = "http://loyaltysource.com/media/product/large/" 
						+ productDTO.getImage().getName();
					}
				}
				labelLargeImageLink = new Label(COL_LARGEIMAGELINK, row, imageLargeLink);
				cellLargeImageLink = (WritableCell) labelLargeImageLink;
				sheetToEdit.addCell(cellLargeImageLink);
				
				// THUMBNAIL-IMAGE LINK				
				imageThumbnailLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageThumbnailLink = "http://loyaltysource.com/media/product/thumbnail/"
						+ productDTO.getImage().getName();
					}
				}
				labelThumbImageLink = new Label(COL_THUMBIMAGELINK, row, imageThumbnailLink);
				cellThumbImageLink = (WritableCell) labelThumbImageLink;
				sheetToEdit.addCell(cellThumbImageLink);
				
				// PRODUCT DESCRIPTION (en).
				desc = "";
				desc = productDTO.getDescriptionEng().getName();
				desc = html2text(desc);
				desc = desc.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelDesc = new Label(COL_DESCRIPTION_EN, row, desc);
				cellDesc = (WritableCell) labelDesc;
				sheetToEdit.addCell(cellDesc);
				
				// PRODUCT DESCRIPTION (fr).
				desc = "";
				desc = productDTO.getDescriptionFr().getName();
				desc = html2text(desc);
				desc = desc.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelDesc = new Label(COL_DESCRIPTION_FR, row, desc);
				cellDesc = (WritableCell) labelDesc;
				sheetToEdit.addCell(cellDesc);
								
				// PRODUCT SPECIFICATION (en).
				spec = productDTO.getSpecificationEng().getName();
				spec = html2text(spec);
				spec = spec.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelSpec = new Label(COL_SPECIFICATION_EN, row, spec);
				cellSpec = (WritableCell) labelSpec;
				sheetToEdit.addCell(cellSpec);
				
				// PRODUCT SPECIFICATION (fr).
				spec = productDTO.getSpecificationFr().getName();
				spec = html2text(spec);
				spec = spec.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelSpec = new Label(COL_SPECIFICATION_FR, row, spec);
				cellSpec = (WritableCell) labelSpec;
				sheetToEdit.addCell(cellSpec);
				
				// PRODUCT OTHER (en).
				other = productDTO.getOtherEng().getName();
				other = html2text(other);
				other = other.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelOther = new Label(COL_OTHER_EN, row, other);
				cellOther = (WritableCell) labelOther;
				sheetToEdit.addCell(cellOther);

				// PRODUCT OTHER (fr).
				other = productDTO.getOtherFr().getName();
				other = html2text(other);
				other = other.replaceAll("\n", "")
						  .replaceAll("\t", "")
						  .replaceAll("\r", "")
						  .replaceAll("\n\t", "")
						  .replaceAll("\n\r", "");
				labelOther = new Label(COL_OTHER_FR, row, other);
				cellOther = (WritableCell) labelOther;
				sheetToEdit.addCell(cellOther);
				
				// COST.
				cost = productDTO.getPriceProduct();
				double priceVal = 0d;				
				if (cost != null) {
					if (!cost.matches("^\\s*$") && !cost.equalsIgnoreCase("")) {	
						priceVal = Double.parseDouble(cost);
						cost = "$" + format(priceVal, "#,###.00", "en", "US");
					} else {
						priceVal = 0d;
						cost = "0.00";
					}
					if (cost.equalsIgnoreCase(".00")) {
						cost = "0.00";
					}
				}
			
				labelCost = new Label(COL_COST, row, cost);
				cellCost = (WritableCell) labelCost;
				sheetToEdit.addCell(cellCost);
			
				// MSRP & DISCOUNT [IN DOLLARDS ($$$)].
				msrp = productDTO.getMsrp();
				discount = "";
				msrpVal = 0d;
				discountVal = 0d;
				if (msrp != null) {
					if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {
						msrpVal = Double.parseDouble(msrp);
						msrp = "$" + format(msrpVal, "#,###.00", "en", "US");
						discountVal = msrpVal - priceVal;
						discount = (discountVal != 0d) ? ("$" + format(discountVal, "#,###.00", "en", "US")) : "";
					} else {
						discount = "";
						msrp = "";
					}
					if (msrp.equalsIgnoreCase(".00")) {
						msrp = "$0.00";
					}
					if (discount.equalsIgnoreCase(".00")) {
						discount = "$0.00";
					}
				}
				
				labelMSRP = new Label(COL_MSRP, row, msrp);
				cellMSRP = (WritableCell) labelMSRP;
				sheetToEdit.addCell(cellMSRP);			
				
				labelDiscount = new Label(COL_DISCOUNT, row, discount);
				cellDiscount = (WritableCell) labelDiscount;
				sheetToEdit.addCell(cellDiscount);
				
				// LS-PRODUCT ID.
				loyaltyProductId = REPORT_USER_CODE + productDTO.getLoyaltyProductId();
				labelLSProductId = new Label(COL_LSPRODUCTID, row, loyaltyProductId);
				cellLSProductId = (WritableCell) labelLSProductId;
				sheetToEdit.addCell(cellLSProductId);
				
				// MODEL NUMBER.
				if(productDTO.getManufactureProductList().size() >= 1) {
					modelNumber = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
					labelModelNumber = new Label(COL_MODELNUMBER, row, modelNumber);
					cellModelNumber = (WritableCell) labelModelNumber;
					sheetToEdit.addCell(cellModelNumber);
				}else{
					modelNumber = productDTO.getLoyaltyProductId();
					labelModelNumber = new Label(COL_MODELNUMBER, row, modelNumber);
					cellModelNumber = (WritableCell) labelModelNumber;
					sheetToEdit.addCell(cellModelNumber);
				}
				
				// SHIPPING INSTRUCTIONS - DIMENSIONS [WIDTH X LENGTH X HEIGHT] + WEIGHT.
				weight = productDTO.getWeight();
				if (weight != null) {
					weight = (!weight.matches("^\\s*$")) ? String.valueOf(weight) : "0";
				} else {
					weight = "0";
				}
				labelWeight = new Label(COL_WEIGHT, row, weight);
				cellWeight = (WritableCell) labelWeight;
				sheetToEdit.addCell(cellWeight);
				
				// SHIPPING SIZE - DIMENSIONS [WIDTH X LENGTH X HEIGHT].
				width = productDTO.getWidth();	w = (!width.equalsIgnoreCase("0")) ? String.valueOf(width) : "";
				length = productDTO.getLarge();	l = (!length.equalsIgnoreCase("0")) ? String.valueOf(length) : "";	
				height = productDTO.getHigh();	h = (!height.equalsIgnoreCase("0"))  ? String.valueOf(height)  : "";
				dimensions = w + " x " + l + " x " + h;			
				labelShipping = new Label(COL_SHIPPING, row, dimensions);
				cellShipping = (WritableCell) labelShipping;
				sheetToEdit.addCell(cellShipping);
			
				
				// MANUFACTURE WARRANTY INFORMATION.
				warranty = (productDTO.getWarrantyEng() != null) ? productDTO.getWarrantyEng().getName() : "";
				labelWarranty = new Label(COL_WARRANTY, row, warranty);
				cellWarranty = (WritableCell) labelWarranty;
				sheetToEdit.addCell(cellWarranty);
				
				/*
				// MANUFACTURE WARRANTY FR INFORMATION.
				warranty = (productDTO.getWarrantyFr() != null) ? productDTO.getWarrantyFr().getName() : "";
				labelWarranty = new Label(COL_WARRANTY, row, warranty);
				cellWarranty = (WritableCell) labelWarranty;
				sheetToEdit.addCell(cellWarranty);
			    */	
				
				
				
				// product Status
				
				String status=productDTO.getStatus().getStatusByValue(productDTO.getStatus().getValue());
				labelStatus = new Label(COL_STATUS, row, String.valueOf(status));
				cellStatus = (WritableCell) labelStatus;
				sheetToEdit.addCell(cellStatus);

				
				// product UPC
				
				String UPC=productDTO.getUpc();
				//if(UPC==null)UPC="";
				labelUPC = new Label(COL_UPC, row, UPC);
				cellUPC = (WritableCell) labelUPC;
				sheetToEdit.addCell(cellUPC);
				
				//================ OUR COST =======================
				/*String  strOuerCost= productDTO.getCost();
				double ourCost = 0d;				
				if (strOuerCost != null) {
					if (!strOuerCost.matches("^\\s*$") && !strOuerCost.equalsIgnoreCase("")) {	
						ourCost = Double.parseDouble(strOuerCost);
						strOuerCost = "$" + format(ourCost, "#,###.00", "en", "US");
					} else {
						ourCost = 0d;
						strOuerCost = "0.00";
					}
					if (strOuerCost.equalsIgnoreCase(".00")) {
						strOuerCost = "0.00";
					}
				}
				
				labelUPC = new Label(COL_UPC, row, strOuerCost);
				cellUPC = (WritableCell) labelUPC;
				sheetToEdit.addCell(cellUPC);*/
				//================ OUR COST =======================
		
				
				
				
				
				
		
				// ESTIMATED-SHIPPING-RATE - EVERY PROVINCE.
				int provinceCount = COL_SHIPPINGPROVINCE;
				ShippingByProvinceList = productService.getShippingTotalList(productID, userID);
				for (ShippingTotalDTO shippingTotalDTO : ShippingByProvinceList) {
					String code=shippingTotalDTO.getProductId()+"_"+shippingTotalDTO.getProvinceId();
					if(!hashProduct.containsKey(code)){
						labelShippingByProvince = new Label(provinceCount, row, shippingTotalDTO.getAverageShippingTotal());
						cellShippingByProvince = (WritableCell) labelShippingByProvince;
						sheetToEdit.addCell(cellShippingByProvince);
						++provinceCount;

					}
					hashProduct.put(code, code);
				}
			
				//  ESTIMATED-SHIPPING-RATE - CANADA TOTAL.
				userProductPriceDTO = productService.getUserProductPriceInformation(productID, userID);
				estimatedShippingRateCANADA = userProductPriceDTO.getShippingTotalCanada();
				System.out.println("[RGP] [Shipping Calc.] productID = " + productID + " on userId = " + userID);				
				if (estimatedShippingRateCANADA == null) {
					estimatedShippingRateCANADA = "NOT AVAILABLE";
				}
				labelShippingCANADA = new Label(COL_SHIPPINGCANADA, row, estimatedShippingRateCANADA);
				cellShippingCANADA = (WritableCell) labelShippingCANADA;
				sheetToEdit.addCell(cellShippingCANADA);

				labelProductID = new Label(COL_PRODUCT_ID, row, String.valueOf(productID));
				cellProductID = (WritableCell) labelProductID;
				sheetToEdit.addCell(cellProductID);
			
	
				
		/*	
				//###################### SHipping Special pour Templates #######################
				// Template A: 39;"Achievers";"AC_"   Template B: 43;"Inbox";"IN_"  Template C: "KAO" 113;;"KA_"
				// ESTIMATED-SHIPPING-RATE - EVERY PROVINCE.
				int provinceCount = COL_SHIPPINGPROVINCE;
				ShippingByProvinceList = productService.getShippingTotalList(productID, 43L);
				for (ShippingTotalDTO shippingTotalDTO : ShippingByProvinceList) {
					String code=shippingTotalDTO.getProductId()+"_"+shippingTotalDTO.getProvinceId();
					if(!hashProduct.containsKey(code)){
						labelShippingByProvince = new Label(provinceCount, row, shippingTotalDTO.getAverageShippingTotal());
						cellShippingByProvince = (WritableCell) labelShippingByProvince;
						sheetToEdit.addCell(cellShippingByProvince);
						++provinceCount;

					}
					hashProduct.put(code, code);
				}
			
				//  ESTIMATED-SHIPPING-RATE - CANADA TOTAL.
				userProductPriceDTO = productService.getUserProductPriceInformation(productID, 43L);
				estimatedShippingRateCANADA = userProductPriceDTO.getShippingTotalCanada();
				System.out.println("[RGP] [Shipping Calc.] productID = " + productID + " on userId = " + 43L);				
				if (estimatedShippingRateCANADA == null) {
					estimatedShippingRateCANADA = "NOT AVAILABLE";
				}
				labelShippingCANADA = new Label(COL_SHIPPINGCANADA, row, estimatedShippingRateCANADA);
				cellShippingCANADA = (WritableCell) labelShippingCANADA;
				sheetToEdit.addCell(cellShippingCANADA);
				
				labelProductID = new Label(COL_PRODUCT_ID, row, String.valueOf(productID));
				cellProductID = (WritableCell) labelProductID;
				sheetToEdit.addCell(cellProductID);
			 
				*/
				++row;
			}
			}
		}
		
		for(String img:imageMissing){
			System.out.println(img);
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

	public static ArrayList<ProductDTO> getListProductFromLsXLS(){
		ArrayList<ProductDTO> list=new ArrayList<ProductDTO> ();
		return list;
	}

	public static Collection toArrayListFromXLS() {	
		Collection listProductDTO = new ArrayList();
		ArrayList<String> listProductDTONoExist = new ArrayList();
			//variable indicating the numbers of columns in the XLS file
			int ROW_TO_START = 1;
			int COL_LS_LOYALTY_ID=0 ;
			//Values of cells
			String lsProductId="";
			//Cells
			Cell cellLsProductID= null;
		try {
			Workbook existingWorkbook = Workbook.getWorkbook(new File("C:\\xls_imgs\\checkProduct.xls"));
			Sheet sheetToRead=existingWorkbook.getSheet(0);
			int ROW_MAX = sheetToRead.getRows();
			int productTotalNotExist=0;
			for(int row=ROW_TO_START; row< ROW_MAX;row++) {			
				//--------------- 2: Ls_Product_ID
				if(COL_LS_LOYALTY_ID>=0)cellLsProductID = sheetToRead.getCell(COL_LS_LOYALTY_ID, row);			
				if(cellLsProductID!=null){
					lsProductId = cellLsProductID.getContents();
					//lsProductId=lsProductId.replace("MZ_", "");
					lsProductId=lsProductId.replace(" ", "");
				}
				//System.out.println("productOrderDate: |" + productOrderDate + "|");
				//lsProductId=lsProductId.substring(3);
				ProductDTO product=productService.getProductIdFromLSProductId(lsProductId);
				if(product==null){
					productTotalNotExist++;
					listProductDTONoExist.add(lsProductId);
				}else{
					listProductDTO.add(product);	
				}			
			}
			System.out.println("================ Start:Produits no existent ====================");
			for(String produt:listProductDTONoExist){
				System.out.println("'"+produt+"',");
			}
			System.out.println("================ End:Produits no existent ====================");
			System.out.println("Total des produits non existent:"+listProductDTONoExist.size());
		} catch (Exception x) {
			x.printStackTrace();
		}
	return listProductDTO;
	}

	public static void createScriptForTemplateC() {
		int ROW_TO_START = 1;
		int COL_PRODUCT_ID=0 ;
		int COL_USER_PRICE=2 ;
		//Values of cells
		Long productId=null;
		Double ourCost=null;
		Double userPrice=null;
		Double discount=null;
		Double profit=null;
		Double msrp=null;
		String strProductId="";
		String strUserPrice="";
		//Cells
		Cell cellLsProductID= null;
		Cell cellLsUserPrice= null;

		try {
			File file = new File("C:\\DATA\\TemplateC\\update_templateC2014-06-20.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			String query = "";
			Workbook existingWorkbook = Workbook.getWorkbook(new File("C:/xls_imgs/checkProduct_template_C.xls"));
			Sheet sheetToRead=existingWorkbook.getSheet(0);
			int ROW_MAX = sheetToRead.getRows();
			//query="PRODUCT_ID, LS_PRODUCT_ID, MSRP, OUR_COST, USER_PRICE, PROFIT, DISCOUNT";
			//out.write(query + ";\n");
			for(int row=ROW_TO_START; row< ROW_MAX;row++) {			
				//--------------- 2: Ls_Product_ID
				cellLsProductID = sheetToRead.getCell(COL_PRODUCT_ID, row);			
				if(cellLsProductID!=null){
					strProductId = cellLsProductID.getContents();
					strProductId=strProductId.replace(" ", "");
					productId=Long.parseLong(strProductId);
					ProductDTO product=productService.getProductInformation(productId,null);
					cellLsUserPrice = sheetToRead.getCell(COL_USER_PRICE, row);	
					if(product!=null && cellLsProductID!=null){
						strUserPrice=cellLsUserPrice.getContents();
						ourCost=Double.parseDouble(product.getCost());
						userPrice=Double.parseDouble(strUserPrice);
						msrp=Double.parseDouble(product.getMsrp());
						discount= ((msrp-userPrice)/msrp)*100;
						discount = (double) Math.round(discount*10000)/10000;
						profit=((userPrice/ourCost)-1)*100;
						profit = (double) Math.round(profit*10000)/10000;
						//query=product.getId()+","+product.getLoyaltyProductId()+","+msrp+","+","+userPrice+","+profit+","+discount;
						query = "UPDATE user_product_price SET price = '" + strUserPrice + "'"
						+ ", percent_profit = '" + profit + "'"
						+ ", percent_discount = '" + discount + "'"
						
						
						+ " WHERE user_id = " + 112 
						+ " AND product_id = " + productId;
						out.write(query + ";\n");
						//out.write(query + ";\n");
						
						System.out.println("ID:"+product.getId()+" our Cost:"+product.getCost()+" MSRP:"+product.getMsrp()+" Price:"+strUserPrice);
					}
				}
			}
			out.write("RELEASE SAVEPOINT sql_updates;\n");
			out.write("COMMIT;\n");
			out.flush();
			out.close();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}


	

}
