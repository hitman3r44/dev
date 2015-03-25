package com.loyauty.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import org.jsoup.Jsoup;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;

public class ProductCatalogGenX {
	
	private static final long REPORT_USER_ID = 32L;				// 'Carlton'
	private static final String REPORT_USER_CODE = "CG_";		// 'Carlton'
	
	private static final String FILE_SEPARATOR = "|";
	
	private static final int NUMBER_OF_PROVINCES = 13;
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	
	public static void main(String[] args) {
		long productId = 0L;
		long userId = REPORT_USER_ID;
		
		List<ProductDTO> productDTOList = null;
		
		long groupId = 0L;
		String groupName = "";
		String categoryName = "";
		long specId = 0L;
		SpecificationDTO specDTO = null;
		String specName = "";
		String brandName = "";
		String productName = "";
		String desc = "";
		String spec = "";
		String other = "";
		String cost = "";
		String msrp = "";
		double msrpVal = 0d;
		String discount = "";
		double discountVal = 0d;
		String loyaltyProductId = "";
		String modelNumber = "";
		String weight = "";
		String length = "", l = "";
		String width = "", w = "";
		String height = "", h = "";
		String dimensions = "";
		String warranty = "";
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();
			
			File file = new File("C:\\productCatalog_Carlton");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			// productDTOList = productService.getAllValidStatusProducts(userId);
			productDTOList = productService.getValidProductsByUserIdAndExcluded(userId);
			
			for (ProductDTO productDTO : productDTOList) {
				
				// PRODUCT-ID
				productId = productDTO.getId();
				out.write(productId + FILE_SEPARATOR);
				
				// GROUP-NAME.
				groupId = productDTO.getCategory().getCategoryGoupeId();
				groupName = groupId >= 1L
							? GroupCategoryEnum.values()[((int) groupId) - 1].getCode()
							: "";
				out.write(groupName + FILE_SEPARATOR);
				
				// CATEGORY-NAME.
				categoryName = productDTO.getCategory().getName();
				out.write(categoryName + FILE_SEPARATOR);
				
				// MAIN-SPECIFICATION-NAME.
				specId = productDTO.getMainFilterTypeId();
				specDTO = specificationService.getSpecification(specId);
				specName = specDTO.getName();
				out.write(specName + FILE_SEPARATOR);
				
				// BRAND-NAME.
				if (productDTO.getBrand() != null) {
					brandName = productDTO.getBrand().getName();
				}
				out.write(brandName + FILE_SEPARATOR);
				
				// PRODUCT TITLE.
				productName = productDTO.getNameEng().getName();
				out.write(productName + FILE_SEPARATOR);
				
				// LARGE-IMAGE LINK
				String imageLargeLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageLargeLink = "http://loyaltysource.com/media/product/large/" 
									+ productDTO.getImage().getName();
					}
				}
				out.write(imageLargeLink + FILE_SEPARATOR);
				
				// THUMBNAIL-IMAGE LINK				
				String imageThumbnailLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageThumbnailLink = "http://loyaltysource.com/media/product/thumbnail/"
									+ productDTO.getImage().getName();
					}
				}
				out.write(imageThumbnailLink + FILE_SEPARATOR);
				
				// PRODUCT DESCRIPTION.
				desc = productDTO.getDescriptionEng().getName();
				desc = html2text(desc);
				out.write(desc.replaceAll("\n", "")
						.replaceAll("\t", "")
						.replaceAll("\r", "")
						.replaceAll("\n\t", "")
						.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
				// PRODUCT SPECIFICATION.
				spec = productDTO.getSpecificationEng().getName();
				spec = html2text(spec);
				out.write(spec.replaceAll("\n", "")
						.replaceAll("\t", "")
						.replaceAll("\r", "")
						.replaceAll("\n\t", "")
						.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
				// PRODUCT OTHER.
				other = productDTO.getOtherEng().getName();
				other = html2text(other);
				out.write(other.replaceAll("\n", "")
								.replaceAll("\t", "")
								.replaceAll("\r", "")
								.replaceAll("\n\t", "")
								.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
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
				out.write(cost + FILE_SEPARATOR);
				
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
				out.write(msrp + FILE_SEPARATOR + discount + FILE_SEPARATOR);
				
				// LS-PRODUCT ID.
				loyaltyProductId = REPORT_USER_CODE + productDTO.getLoyaltyProductId();
				out.write(loyaltyProductId + FILE_SEPARATOR);				
				
				// MODEL NUMBER.
				if(productDTO.getManufactureProductList().size() >= 1) {
					modelNumber = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
				}
				out.write(modelNumber + FILE_SEPARATOR);
				
				// SHIPPING WEIGHT.
				weight = productDTO.getWeight();
				if (weight != null) {
					weight = (!weight.matches("^\\s*$")) ? String.valueOf(weight) : "0";
				} else {
					weight = "0";
				}
				out.write(weight + FILE_SEPARATOR);
				
				// SHIPPING SIZE - DIMENSIONS [WIDTH X LENGTH X HEIGHT].
				width = productDTO.getWidth();	w = (!width.equalsIgnoreCase("0")) ? String.valueOf(width) : "";
				length = productDTO.getLarge();	l = (!length.equalsIgnoreCase("0")) ? String.valueOf(length) : "";	
				height = productDTO.getHigh();	h = (!height.equalsIgnoreCase("0"))  ? String.valueOf(height)  : "";
				dimensions = w + " X " + l + " X " + h;
				out.write(dimensions + FILE_SEPARATOR);
				
				// PRODUCT WARRANTY.
				warranty = (productDTO.getWarrantyEng() != null) ? productDTO.getWarrantyEng().getName() : "";
				out.write(warranty + FILE_SEPARATOR);
				
				// ESTIMATED-SHIPPING-RATE - EVERY PROVINCE.
				String estimatedShippingRateByEveryProvinces = getEstimatedShippingRateFinalString(productId, userId);
				out.write(estimatedShippingRateByEveryProvinces);
								
				//  ESTIMATED-SHIPPING-RATE - CANADA TOTAL.
				UserProductPriceDTO userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
				String estimatedShippingRateCANADA = userProductPriceDTO.getShippingTotalCanada();				

				System.out.println("[RGP] [Shipping Calc.] productID = " + productId + " on userId = " + userId);				
				if (estimatedShippingRateCANADA == null) {
					estimatedShippingRateCANADA = "NOT AVAILABLE";
				}

				out.write(estimatedShippingRateCANADA);
				
				out.write("\n");
			}
			
			out.flush();
			out.close();			
			
		} catch (IOException iox) {
			iox.printStackTrace();			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	private static String getEstimatedShippingRateFinalString(long productId, long userId) throws ServiceLocatorException {
		String outcome = "";
		try {
			productService = serviceLocator.getProductService();
			List<ShippingTotalDTO> shippingTotalDTOList = productService.getShippingTotalList(productId, userId);
			if (shippingTotalDTOList == null || shippingTotalDTOList.size() == 0) {
				outcome = getEmptyFileSeparatorString();
			} else {
				for (ShippingTotalDTO shippingTotalDTO : shippingTotalDTOList) {
					outcome += shippingTotalDTO.getAverageShippingTotal() + FILE_SEPARATOR;
				}
			}
		} catch (ServiceLocatorException slx) {
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		return outcome;
	}
	
	private static String getEmptyFileSeparatorString() {
		String outcome = "";
		for (int times=0; times < NUMBER_OF_PROVINCES; times++) {
			outcome += FILE_SEPARATOR;
		}
		return outcome;
		
	}
	
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
    	
}