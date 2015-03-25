package com.loyauty.utility;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jsoup.Jsoup;
import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.model.User;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.service.user.UserService;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProductListingWithImages {
	private static final double CELL_DEFAULT_HEIGHT = 133;	// 120
	private static final double CELL_DEFAULT_WIDTH = 133;	// 100
	
	private static final String sheetName = "Sheet1";
	private static final int ROW_TO_BEGIN = 2;
	private static final int COL_IMAGE = 0;
	private static final int COL_PRODUCT_ID = 1;	
	private static final int COL_GROUPNAME = 2;
	private static final int COL_CATEGORYNAME = 3;
	private static final int COL_TYPENAME = 4;
	private static final int COL_BRANDNAME = 5;
	private static final int COL_PRODUCTNAME = 6;
	private static final int COL_PRODUCTNAME_FR = 7;
	private static final int COL_LARGEIMAGELINK = 8;
	private static final int COL_THUMBIMAGELINK = 9;
	
	private static final int COL_DESCRIPTION_EN = 10;
	private static final int COL_DESCRIPTION_FR = 11;
	
	private static final int COL_SPECIFICATION_EN = 12;
	private static final int COL_SPECIFICATION_FR = 13;
	
	private static final int COL_OTHER_EN = 14;
	private static final int COL_OTHER_FR = 15;
	
	private static final int COL_COST = 16;
	private static final int COL_MSRP = 17;
	private static final int COL_DISCOUNT = 18;
	private static final int COL_LSPRODUCTID = 19;
	private static final int COL_MODELNUMBER = 20;
	private static final int COL_WEIGHT = 21;
	private static final int COL_SHIPPING = 22;
	private static final int COL_WARRANTY = 23;
	private static final int COL_SHIPPINGPROVINCE = 24;	//19 --> 22
	private static final int COL_SHIPPINGCANADA = 37;	// 33 --> 36
	private static final int COL_STATUS = 38;		// 
	private static final int COL_UPC = 39;		// 
	
	private static long REPORT_USER_ID = 0L;

	private static final String REPORT_USER_CODE = "";	
	private static String USER_LOGIN = "";
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	private static UserService userService;
	
	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		
		List<ProductDTO> productDTOList = null;
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
		userService = serviceLocator.getUserService();
		HashMap<String, Object>parametersList=getParameters("/_ROUTINE/conf/routine_conf.xml");
		//get user
		String userLogin=(String)parametersList.get("USER_LOGIN");
		if(userLogin==null)userLogin="";
		userLogin = userLogin.replaceAll("\n", "")
		  .replaceAll("\t", "")
		  .replaceAll("\r", "")
		  .replaceAll("\n\t", "")
		  .replaceAll("\n\r", "");
		User user=userService.getUserByLogin(userLogin);
		if(user==null)return;
		USER_LOGIN=userLogin;
		REPORT_USER_ID=user.getId();
		long userID = REPORT_USER_ID;
		//get response if product_listing with Images
		String withImages=(String)parametersList.get("WITH_IMAGES");
		if(withImages==null)withImages="";
		withImages = withImages.replaceAll("\n", "")
		  .replaceAll("\t", "")
		  .replaceAll("\r", "")
		  .replaceAll("\n\t", "")
		  .replaceAll("\n\r", "");
		
		//get xlsTemplate
		String xlsTemplateFolder=(String)parametersList.get("XLS_TEMPLATE_FOLDER");
		if(xlsTemplateFolder==null)xlsTemplateFolder="";
		xlsTemplateFolder = xlsTemplateFolder.replaceAll("\n", "")
		  .replaceAll("\t", "")
		  .replaceAll("\r", "")
		  .replaceAll("\n\t", "")
		  .replaceAll("\n\r", "");
		
		//get xlsResult
		String xlsResultFolder=(String)parametersList.get("XLS_RESULT_FOLDER");
		if(xlsResultFolder==null)xlsResultFolder="";
		xlsResultFolder = xlsResultFolder.replaceAll("\n", "")
		  .replaceAll("\t", "")
		  .replaceAll("\r", "")
		  .replaceAll("\n\t", "")
		  .replaceAll("\n\r", "");

		//get images_thumbnail_folder
		String imagesThumbnailFolder=(String)parametersList.get("IMAGES_THUMBNAIL_FOLDER");
		if(imagesThumbnailFolder==null)imagesThumbnailFolder="";
		imagesThumbnailFolder = imagesThumbnailFolder.replaceAll("\n", "")
		  .replaceAll("\t", "")
		  .replaceAll("\r", "")
		  .replaceAll("\n\t", "")
		  .replaceAll("\n\r", "");
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
		String prefix=dateFormat.format(new Date());
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File(xlsTemplateFolder+"template.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(xlsResultFolder+USER_LOGIN+"_"+prefix+".xls"), existingWorkbook);
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
		
		for (ProductDTO productDTO : productDTOList) {
			productID = productDTO.getId();
			boolean exist=true;
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
			if (productID != 5766L) {		
				// LOW-RES [IMAGE] PHOTO
				if (productDTO.getImage() != null && withImages.equals("yes")) {
					if (productDTO.getImage().getRealName() != null) {
						System.out.println("Image Name: |" + productDTO.getImage().getName() + "| at productID = " + productID);
						imageFile = new File(imagesThumbnailFolder+ productDTO.getImage().getName());
						if(imageFile.exists()){
							imageInput = ImageIO.read(imageFile);
							baos = new ByteArrayOutputStream();
							ImageIO.write(imageInput, "PNG", baos);					
							writableImage = new WritableImage(	COL_IMAGE, row, 
									imageInput.getWidth() / CELL_DEFAULT_WIDTH, 
									imageInput.getHeight() / CELL_DEFAULT_HEIGHT, 
									baos.toByteArray());
							writableImage.setImageAnchor(WritableImage.MOVE_WITH_CELLS);	

							sheetToEdit.addImage(writableImage);
						}else{

							imageMissing.add(productID +","+productDTO.getLoyaltyProductId()+","+productDTO.getImage().getName());
						}

					}
				}

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
				
				// PRODUCT TITLE.
				productName = productDTO.getNameEng().getName();
				labelProductName = new Label(COL_PRODUCTNAME, row, productName);
				cellProductName = (WritableCell) labelProductName;
				sheetToEdit.addCell(cellProductName);
				

				// PRODUCT TITLE FR.
				productName = productDTO.getNameFr().getName();
				labelProductName = new Label(COL_PRODUCTNAME_FR, row, productName);
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
				if(userProductPriceDTO==null){
					System.out.println("productmessing:"+productID);
				}
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


	/*=========================================================================================
									METHODE getParameters From XML file parameters				
	  =========================================================================================*/
	public static HashMap<String, Object> getParameters(String locationParametersFile)throws Exception {
		HashMap<String, Object> result=new HashMap<String, Object>();
		//parse xml parameters
		File parametersFile=new File(locationParametersFile);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse (parametersFile);
	    // normalize text representation
        doc.getDocumentElement ().normalize ();
        NodeList list_parameters = doc.getElementsByTagName("PRODUCT_LISTING");
        for(int s=0; s<list_parameters.getLength() ; s++){
        	Node firstParameterNode = list_parameters.item(s); 
        	Element firstParameterElement = (Element)firstParameterNode;

        	//--------------- 1:images_thumbnail_folder destination -----------
        	String images_thumbnail_folder="";
            NodeList images_thumbnail_folder_List = firstParameterElement.getElementsByTagName("IMAGES_THUMBNAIL_FOLDER");
            if(images_thumbnail_folder_List!=null && images_thumbnail_folder_List.getLength()>0){
                Element images_thumbnail_folder_Element = (Element)images_thumbnail_folder_List.item(0);
                if(images_thumbnail_folder_Element!=null){
               	 NodeList images_thumbnail_folder_FNList = images_thumbnail_folder_Element.getChildNodes();
               	 if(images_thumbnail_folder_FNList!=null && images_thumbnail_folder_FNList.getLength()>0){
               		images_thumbnail_folder =((Node)images_thumbnail_folder_FNList.item(0)).getNodeValue().trim(); 
               	 }
                }  
            }
            result.put("IMAGES_THUMBNAIL_FOLDER", images_thumbnail_folder);
            
        	//--------------- 1:xls_result destination -----------
        	String xls_result="";
            NodeList xls_result_List = firstParameterElement.getElementsByTagName("XLS_RESULT_FOLDER");
            if(xls_result_List!=null && xls_result_List.getLength()>0){
                Element xls_result_Element = (Element)xls_result_List.item(0);
                if(xls_result_Element!=null){
               	 NodeList xls_result_FNList = xls_result_Element.getChildNodes();
               	 if(xls_result_FNList!=null && xls_result_FNList.getLength()>0){
               		xls_result =((Node)xls_result_FNList.item(0)).getNodeValue().trim(); 
               	 }
                }  
            }
            result.put("XLS_RESULT_FOLDER", xls_result);
        	
        	//--------------- 1:xls_template destination -----------
        	String xls_template="";
            NodeList xls_template_List = firstParameterElement.getElementsByTagName("XLS_TEMPLATE_FOLDER");
            if(xls_template_List!=null && xls_template_List.getLength()>0){
                Element xls_template_Element = (Element)xls_template_List.item(0);
                if(xls_template_Element!=null){
               	 NodeList xls_template_FNList = xls_template_Element.getChildNodes();
               	 if(xls_template_FNList!=null && xls_template_FNList.getLength()>0){
               		xls_template =((Node)xls_template_FNList.item(0)).getNodeValue().trim(); 
               	 }
                }  
            }
            result.put("XLS_TEMPLATE_FOLDER", xls_template);

        	//--------------- 1:user_login-----------
        	String user_login="";
            NodeList user_login_List = firstParameterElement.getElementsByTagName("USER_LOGIN");
            if(user_login_List!=null && user_login_List.getLength()>0){
                Element user_login_Element = (Element)user_login_List.item(0);
                if(user_login_Element!=null){
               	 NodeList user_login_FNList = user_login_Element.getChildNodes();
               	 if(user_login_FNList!=null && user_login_FNList.getLength()>0){
               		user_login =((Node)user_login_FNList.item(0)).getNodeValue().trim(); 
               	 }
                }  
            }
            result.put("USER_LOGIN", user_login);
            
        	//--------------- 1:uith_images ?-----------
        	String uith_images="";
            NodeList uith_images_List = firstParameterElement.getElementsByTagName("WITH_IMAGES");
            if(uith_images_List!=null && uith_images_List.getLength()>0){
                Element uith_images_Element = (Element)uith_images_List.item(0);
                if(uith_images_Element!=null){
               	 NodeList uith_images_FNList = uith_images_Element.getChildNodes();
               	 if(uith_images_FNList!=null && uith_images_FNList.getLength()>0){
               		uith_images =((Node)uith_images_FNList.item(0)).getNodeValue().trim(); 
               	 }
                }  
            }
            result.put("WITH_IMAGES", uith_images);  
        }
        return result;
	}

}
