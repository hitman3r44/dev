package com.loyauty.utility.special_routine;

import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jsoup.Jsoup;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.Province;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;

/**
 * 
 * @author Hamdoune
 *
 */



public class GenerateXMLProductListFR {
	
	private static final String UNION = "_";
	private static final char CHAR_PATTERN_THAT_REPEATS = '_';
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	
	
	
	

    public static void main (String argv []){
    	System.out.println("Début DateTime:"+new Date());
		serviceLocator = ServiceLocator.getInstance();	
		
		try {// 32;"CARLTON";"CG_"
			productService = serviceLocator.getProductService();
			File xmlFile = new File("C:/dev/xml/CARLTON_PRODUCT_LISTING_2015-02-20-FR.xml");
				new FileWriter(xmlFile);
				generateXMLRoutine(32L, xmlFile, "CG_");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
    	
    }//end of main

	
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
 
	
	private static String findGroupName(Long categoryGroupId) {
		String outcome = "";
		GroupCategoryEnum[] groupArray = GroupCategoryEnum.values();
		for (GroupCategoryEnum groupEnum : groupArray) {
			if (groupEnum.getValue() == categoryGroupId.intValue()) {
				outcome = groupEnum.getCode();
				break;
			}			
		}
		return outcome;
	}
	
	private static String findProductStatus(int etat) {
		String outcome = "";
		ProductStatus[] productStata = ProductStatus.values();
		for (ProductStatus status : productStata) {
			if (status.getValue().intValue() == etat) {
				outcome = status.name();
			}
			
		}
		return outcome;		
	}
	
	private static String findProvinceName(Long provinceId) {
		String outcome = "";
		Province[] provinceArray = Province.values();
		for (Province p : provinceArray) {
			if (p.getValue() == provinceId.intValue()) {
				outcome = p.getCode();
			}
		}
		return outcome;
	}
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	private static int countBackRepeatsFromLast(String inputLeft) {
		int numberOfRepeats = 0;
		int pointer = inputLeft.length() - 1;
		while (inputLeft.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) {
			if (inputLeft.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) ++numberOfRepeats;
			if (pointer == 0) break;
			-- pointer;
		}
		return numberOfRepeats;
	}
	
	private static int countForthRepeatsFromFirst(String inputRight) {
		int numberOfRepeats = 0;
		int pointer = 0;
		while (inputRight.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) {
			if (inputRight.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) ++numberOfRepeats;
			if (pointer == inputRight.length() - 1) break;
			++pointer;
		}
		return numberOfRepeats;
	}
	
	private static boolean areThereRepeatsBackLeft(String inputLeft) {
		return (countBackRepeatsFromLast(inputLeft) > 0);
	}
	
	private static boolean areThereRepeatsForthRight(String inputRight) {
		return (countForthRepeatsFromFirst(inputRight) > 0);
	}
	
	private static String concatenate(String inputLeft, String inputRight) {
		String l = "", union = "", r = "";
		String leftChar = "", rightChar = "";
		
		if (inputLeft.equalsIgnoreCase("") && inputRight.equalsIgnoreCase("")) {
			return "";
		}
		
		if (areThereRepeatsBackLeft(inputLeft)) {
			if (countBackRepeatsFromLast(inputLeft) == inputLeft.length()) {
				inputLeft = UNION;
			} else {	// countBackRepeatsFromLast(inputLeft) < inputLeft.length()
				int info = inputLeft.length() - countBackRepeatsFromLast(inputLeft);
				inputLeft = inputLeft.substring(0, info + 1);
			}
		}
		
		if (areThereRepeatsForthRight(inputRight)) {
			if (countForthRepeatsFromFirst(inputRight) == inputRight.length()) {
				inputRight = UNION;
			} else {	// countForthRepeatsFromFirst(inputRight) < inputRight.length()
				inputRight = inputRight.substring(countForthRepeatsFromFirst(inputRight) - 1, inputRight.length());
			}
		}
		
		leftChar = (inputLeft.length() > 0) ? inputLeft.substring(inputLeft.length() - 1) : "";
		rightChar = (inputRight.length() > 0) ? inputRight.substring(0, 1) : "";
		if (inputLeft.length() > 0 && inputRight.length() > 0) {			
			union = UNION;
			if (leftChar.equalsIgnoreCase(UNION) && !rightChar.equalsIgnoreCase(UNION)) {
				l = inputLeft.substring(0, inputLeft.length() - 1);
				r = inputRight;
			} else if (!leftChar.equalsIgnoreCase(UNION) && rightChar.equalsIgnoreCase(UNION)) {
				l = inputLeft;
				r = inputRight.substring(1, inputRight.length());
			} else if (leftChar.equalsIgnoreCase(UNION) && rightChar.equalsIgnoreCase(UNION)) {
				l = inputLeft.substring(0, inputLeft.length() - 1);
				r = inputRight.substring(1, inputRight.length());	
			} else {
				l = inputLeft;
				r = inputRight;
			}			
		} else if (inputLeft.length() == 0 && inputRight.length() > 0) {
			l = "";
			union = "";
			r = inputRight;				
		} else if (inputLeft.length() > 0 && inputRight.length() == 0) {
			l = inputLeft;
			union = "";
			r = "";				
		} else if (inputLeft.length() == 0 && inputRight.length() == 0) {
				l = union = r = "";
		}
		return (l + union + r);
	}
	

	public static void generateXMLRoutine(long userId, File xmlFile, String userCode) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();	
			List<ShippingTotalDTO> shippingTotalDTOList = null;
			UserProductPriceDTO userProductPriceDTO = null;
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root element.
			Document doc = docBuilder.newDocument();			
			Element rootElement = doc.createElement("catalog");
			doc.appendChild(rootElement);
			
			Element product = null;
			Attr attr = null;
			Element group = null;	
			Element category = null;	
			Element type = null;
			Element image = null;
			Element brand = null;
			Element status = null;
			Element subProduct = null;
			Element title = null;
			Element desc = null;
			Element spec = null;
			Element others = null;
			Element price = null;
			Element msrp = null;
			Element discountDollars = null;
			Element discountPercent = null;
			Element modelNumber = null;
			Element weight = null;
			Element shippingSize = null;
			Element length = null;
			Element width = null;
			Element height = null;
			Element warranty = null;
			Element estimatedShippingRate = null;
			Element averageCanada = null;
			Element perProvince = null;
			Element provinceElement = null;
			
			String loyaltyProductId = "";
			String brandName = "";
			String groupName = "";
			String categoryName = "";
			String typeName = "";
			String imageFilePathName = "";
			String statusName = "";
			String subLSProductID = "";
			String nameEn = "";
			String descriptionEn = "";
			String specificationEn = "";
			String othersEn = "";
			String warrantyEn = "";
			String modelNumberName = "";
			String weightInPounds = "";
			String lengthInInches = "";
			String widthInInches = "";
			String heightInInches = "";
			String msrpValue = "";
			String priceValue = "";
			String discount$$$Value = "";
			String discountPercentage = "";
			double priceVal = 0d;
			double msrpVal = 0d;
			double discountVal = 0d;
			double percentageVal = 0d;
			String shippingTotalCanadaValue = "";
			String provinceName = "";
			String shippingPerProvinceValue = "";
			long productId = 0L;
			List<ProductDTO> productDTOList = productService.getValidProductsByUserIdAndExcluded(43L);
			//List<ProductDTO> productDTOList = productService.getProductsAsOfConsideredForXML();
			for (ProductDTO productDTO : productDTOList) {
				productId = productDTO.getId();
				if (productService.existsOnAlterUserProductXML(productId, userId)) {
						product = doc.createElement("ls-product");
						rootElement.appendChild(product);
						attr = doc.createAttribute("id");
						loyaltyProductId =productDTO.getLoyaltyProductId();
						attr.setValue(loyaltyProductId);
						product.setAttributeNode(attr);
						System.out.println("[XMLGenXProductCatalog] [Header] productID = " + productId + " [" 
								+ loyaltyProductId 
								+ "] with userId = " + userId);
						brandName = productDTO.getBrand().getName();
						brand = doc.createElement("brand-name");
						brand.appendChild(doc.createTextNode(brandName));
						product.appendChild(brand);
						groupName = findGroupName(productDTO.getCategory().getCategoryGoupeId());					
						group = doc.createElement("group");
						group.appendChild(doc.createTextNode(groupName));
						product.appendChild(group);											
						categoryName = productDTO.getCategory().getName();
						category = doc.createElement("category");
						category.appendChild(doc.createTextNode(categoryName));
						product.appendChild(category);						
						SpecificationDTO specDTO = specificationService.getSpecification(productDTO.getMainFilterTypeId());
						typeName = specDTO.getName();
						type = doc.createElement("type");
						type.appendChild(doc.createTextNode(typeName));
						product.appendChild(type);						
						if (productDTO.getImage() != null) {
							imageFilePathName = "http://loyaltysource.com/media/product/large/" + productDTO.getImage().getName();										
							imageFilePathName = (productDTO.getImage().getName() == null) ? "" : imageFilePathName;
							image = doc.createElement("image");
							image.appendChild(doc.createTextNode(imageFilePathName));
							product.appendChild(image);
						}								
									
						ProductStatus productStatus = productDTO.getStatus();
						if (productStatus != ProductStatus.DISABLED) {						
							statusName = findProductStatus(productDTO.getStatus().getValue());
							status = doc.createElement("status");
							status.appendChild(doc.createTextNode(statusName));
							product.appendChild(status);
							if (productStatus == ProductStatus.DISCONTINUED) {
								if (productDTO.getLoyaltyProductIdSub() != null) {
									subLSProductID = productDTO.getLoyaltyProductIdSub();
									subProduct = doc.createElement("substitute-product");
									subProduct.appendChild(doc.createTextNode(subLSProductID));
									product.appendChild(subProduct);											
								}
							}											
						}											
										
						if (productDTO.getNameFr() != null) {
							nameEn = productDTO.getNameFr().getName();
							nameEn = (productDTO.getNameFr().getName() == null) ? "" : nameEn;
							title = doc.createElement("title");
							title.appendChild(doc.createTextNode(nameEn));
							product.appendChild(title);
						}
										
						if (productDTO.getDescriptionFr() != null) {
							descriptionEn = productDTO.getDescriptionFr().getName();
							descriptionEn = (productDTO.getDescriptionFr().getName() == null) ? "" : html2text(descriptionEn);
							desc = doc.createElement("description");
							desc.appendChild(doc.createTextNode(descriptionEn));
							product.appendChild(desc);
						}
										
						if (productDTO.getSpecificationFr() != null) {
							specificationEn = productDTO.getSpecificationFr().getName();
							specificationEn = (productDTO.getSpecificationFr().getName() == null) ? "" : html2text(specificationEn);
							spec = doc.createElement("specification");
							spec.appendChild(doc.createTextNode(specificationEn));
							product.appendChild(spec);								
						}
										
						if (productDTO.getOtherFr() != null) {
							othersEn = productDTO.getOtherFr().getName();
							othersEn = (productDTO.getOtherFr().getName() == null) ? "" : html2text(othersEn);
							others = doc.createElement("others");
							others.appendChild(doc.createTextNode(othersEn));
							product.appendChild(others);
						}
										
						if (productDTO.getWarrantyFr() != null) {
							warrantyEn = productDTO.getWarrantyFr().getName();
							warrantyEn = (productDTO.getWarrantyFr().getName() == null) ? "" : warrantyEn;
							warranty = doc.createElement("warranty");
							warranty.appendChild(doc.createTextNode(warrantyEn));
							product.appendChild(warranty);								
						}

						modelNumberName = productDTO.getManufactureProductList().iterator().next().getName();
						modelNumber = doc.createElement("model-number");
						modelNumber.appendChild(doc.createTextNode(modelNumberName));
						product.appendChild(modelNumber);							
						weightInPounds = productDTO.getBoxTotalWeight()+"";
						weight = doc.createElement("weight");
						weight.appendChild(doc.createTextNode(weightInPounds));
						product.appendChild(weight);							
						shippingSize = doc.createElement("shipping-size");
						product.appendChild(shippingSize);
						lengthInInches = productDTO.getBoxLength()+"";
						length = doc.createElement("length");
						length.appendChild(doc.createTextNode(lengthInInches));
						shippingSize.appendChild(length);
						widthInInches = productDTO.getBoxWidth()+"";
						width = doc.createElement("width");
						width.appendChild(doc.createTextNode(widthInInches));
						shippingSize.appendChild(width);
						heightInInches = productDTO.getBoxHeight()+"";
						height = doc.createElement("height");
						height.appendChild(doc.createTextNode(heightInInches));
						shippingSize.appendChild(height);						
						userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
						if (userProductPriceDTO != null) {
								priceVal = 0d;
								msrpVal = 0d;
								discountVal = 0d;
								percentageVal = 0d;
								msrpValue = "0.00";						
								if (productDTO.getMsrp() != null) {
									if (!productDTO.getMsrp().matches("^\\s*$"))msrpValue = productDTO.getMsrp();
								}
								msrp = doc.createElement("msrp");
								msrp.appendChild(doc.createTextNode(msrpValue));
								product.appendChild(msrp);
								
								priceValue = userProductPriceDTO.getPrice();
								if (priceValue != null) {
									if (!priceValue.matches("^\\s*$") && !priceValue.equalsIgnoreCase("")) {					
										priceVal = Double.parseDouble(priceValue);
										priceValue = format(priceVal, "#,###.00", "en", "US");
									} else {
										priceVal = 0d;
										priceValue = "0.00";
									}
								}
								priceValue = (priceValue == null || priceValue.matches("^\\s*$")) ? "0.00" : priceValue;
								price = doc.createElement("cost");
								price.appendChild(doc.createTextNode(priceValue));
								product.appendChild(price);
								if (msrpValue != null) {					
									if (!msrpValue.matches("^\\s*$") && !msrpValue.equalsIgnoreCase("")) {	
										msrpVal = Double.parseDouble(msrpValue);
										msrpValue = format(msrpVal, "#,###.00", "en", "US");	
										discountVal = msrpVal - priceVal;
										discount$$$Value = (discountVal != 0d) ? format(discountVal, "#,###.00", "en", "US") : "0.00";		
										percentageVal = (msrpVal != 0d) ? (100d * discountVal / msrpVal) : 0d;
										discountPercentage = (percentageVal != 0d)? format(percentageVal, "0.00", "en", "CA"): "0.00" ;
									}
								}
													
								discountDollars = doc.createElement("discount-dollars");
								discountDollars.appendChild(doc.createTextNode(discount$$$Value));
								product.appendChild(discountDollars);
								discountPercent = doc.createElement("discount-percent");
								discountPercent.appendChild(doc.createTextNode(discountPercentage));
								product.appendChild(discountPercent);
						}	// if (userProductPriceDTO != null)
						
						estimatedShippingRate = doc.createElement("estimated-shipping-rates");
						product.appendChild(estimatedShippingRate);
						userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
						shippingTotalCanadaValue = userProductPriceDTO.getShippingTotalCanada();
						if (shippingTotalCanadaValue == null) {
						shippingTotalCanadaValue = "NOT AVAILABLE";
						}
										
						averageCanada = doc.createElement("average-canada");
						averageCanada.appendChild(doc.createTextNode(shippingTotalCanadaValue));
						estimatedShippingRate.appendChild(averageCanada);
						perProvince = doc.createElement("rate-per-province");
						estimatedShippingRate.appendChild(perProvince);
						shippingTotalDTOList = productService.getShippingTotalList(productId, userId);
						for (ShippingTotalDTO shippingTotalDTO : shippingTotalDTOList) {
							shippingPerProvinceValue = shippingTotalDTO.getAverageShippingTotal();								
							provinceName = findProvinceName(shippingTotalDTO.getProvinceId());
							if (provinceName == null)provinceName = "";
							if (shippingPerProvinceValue == null)shippingPerProvinceValue = "NOT AVAILABLE";
									
							if (provinceName != null && !provinceName.matches("^\\s*$")) {
								provinceElement = doc.createElement(provinceName);
								provinceElement.appendChild(doc.createTextNode(shippingPerProvinceValue));
								perProvince.appendChild(provinceElement);
							}	// if (provinceName ...
						}	// for (ShippingTotalDTO shippingTotalDTO : ...	

					}	// if (productService.existsOnAlterUserProductXML(productId, userId))
					
				}	// for (ProductDTO
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(xmlFile);
				transformer.transform(source, result);
				System.out.println("XML File Generated!!!!");
			
		} catch (ParserConfigurationException pcx) {
			pcx.printStackTrace();			
		} catch (TransformerException tx) {
			tx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		
	}
	

	
	
}
