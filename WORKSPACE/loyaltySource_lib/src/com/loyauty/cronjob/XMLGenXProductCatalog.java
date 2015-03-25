package com.loyauty.cronjob;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
import com.loyauty.service.core.dto.AlterProductXMLDTO;
import com.loyauty.service.core.dto.AlterUserProductXMLDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;

/**
 * 
 * @author Rafael Padron
 *
 */
public class XMLGenXProductCatalog {
	
	private static final String UNION = "_";
	private static final char CHAR_PATTERN_THAT_REPEATS = '_';
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	
	public void generateXML(long userId, File xmlFile, String userCode) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();	
			
			AlterUserProductXMLDTO alterUserProductXMLDTO = null;
			AlterProductXMLDTO alterProductXMLDTO = null;
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
			
			List<ProductDTO> productDTOList = productService.getProductsAsOfConsideredForXML();
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					if(productId==8784L){
						System.out.println("error");
					}
					if (productService.existsOnAlterUserProductXML(productId, userId)) {
						alterUserProductXMLDTO = productService.getAlterUserProductXML(userId, productId);
						
						if (!alterUserProductXMLDTO.getExcludedMeaning()) {
								
								
// if (productService.existsOnAlterProductXML(productId)) {
									alterProductXMLDTO = productService.getAlterProductXML(productId);
									
									if (mustXMLHeaderBeShown(alterProductXMLDTO, alterUserProductXMLDTO.getPriceDiscount()) ) {					
										product = doc.createElement("ls-product");
										rootElement.appendChild(product);
										
										attr = doc.createAttribute("id");
										loyaltyProductId = concatenate(userCode, productDTO.getLoyaltyProductId());
										if(loyaltyProductId==null)loyaltyProductId="";
										attr.setValue(loyaltyProductId);
										product.setAttributeNode(attr);
										
										System.out.println("[XMLGenXProductCatalog] [Header] productID = " + productId + " [" 
															+ loyaltyProductId 
															+ "] with userId = " + userId);
										
/*
										Element idElem = doc.createElement("product-id");
										idElem.appendChild(doc.createTextNode(String.valueOf(productId)));
										product.appendChild(idElem);
*/																			
									}
									
									if (alterProductXMLDTO.getProductToBeExecuted()) {				
										
										if (alterProductXMLDTO.getBrandId()) {
											brandName = productDTO.getBrand().getName();
											brand = doc.createElement("brand-name");
											if(brandName==null)brandName="";
											brand.appendChild(doc.createTextNode(brandName));
											product.appendChild(brand);
										}
										
										if (alterProductXMLDTO.getCategoryId()) {
											groupName = findGroupName(productDTO.getCategory().getCategoryGoupeId());					
											group = doc.createElement("group");
											group.appendChild(doc.createTextNode(groupName));
											product.appendChild(group);											
											categoryName = productDTO.getCategory().getName();
											category = doc.createElement("category");
											if(categoryName==null)categoryName="";
											category.appendChild(doc.createTextNode(categoryName));
											product.appendChild(category);						
										}
										
										if (alterProductXMLDTO.getTypeId()) {
											SpecificationDTO specDTO = specificationService.getSpecification(productDTO.getMainFilterTypeId());
											typeName = specDTO.getName();
											type = doc.createElement("type");
											if(typeName==null)typeName="";
											type.appendChild(doc.createTextNode(typeName));
											product.appendChild(type);						
										}
								
										if (productDTO.getImage() != null) {
											if (alterProductXMLDTO.getImageId()) {
												imageFilePathName = "http://loyaltysource.com/media/product/large/" 
																	+ productDTO.getImage().getName();										
												imageFilePathName = (productDTO.getImage().getName() == null) ? "" : imageFilePathName;
												image = doc.createElement("image");
												if(imageFilePathName==null)imageFilePathName="";
												image.appendChild(doc.createTextNode(imageFilePathName));
												product.appendChild(image);
											}
										}								
										
										if (alterProductXMLDTO.getStatusId()) {
											ProductStatus productStatus = productDTO.getStatus();
											if (productStatus != ProductStatus.DISABLED) {						
												statusName = findProductStatus(productDTO.getStatus().getValue());
												status = doc.createElement("status");
												if(statusName==null)statusName="";
												status.appendChild(doc.createTextNode(statusName));
												product.appendChild(status);
												if (productStatus == ProductStatus.DISCONTINUED) {
													if (productDTO.getLoyaltyProductIdSub() != null) {
														subLSProductID = productDTO.getLoyaltyProductIdSub();
														subProduct = doc.createElement("substitute-product");
														if(subLSProductID==null)subLSProductID="";
														subProduct.appendChild(doc.createTextNode(subLSProductID));
														product.appendChild(subProduct);											
													}
												}											
											}											
										}
										
										if (productDTO.getNameEng() != null) {
											if (alterProductXMLDTO.getNameEn()) {
												nameEn = productDTO.getNameEng().getName();
												nameEn = (productDTO.getNameEng().getName() == null) ? "" : nameEn;
												title = doc.createElement("title");
												if(nameEn==null)nameEn="";
												title.appendChild(doc.createTextNode(nameEn));
												product.appendChild(title);
											}
										}
										
										if (productDTO.getDescriptionEng() != null) {
											if (alterProductXMLDTO.getDescriptionEn()) {
												descriptionEn = productDTO.getDescriptionEng().getName();
												descriptionEn = (productDTO.getDescriptionEng().getName() == null) ? "" : html2text(descriptionEn);
												desc = doc.createElement("description");
												if(descriptionEn==null)descriptionEn="";
												desc.appendChild(doc.createTextNode(descriptionEn));
												product.appendChild(desc);
											}
										}
										
										if (productDTO.getSpecificationEng() != null) {
											if (alterProductXMLDTO.getSpecificationEn()) {
												specificationEn = productDTO.getSpecificationEng().getName();
												specificationEn = (productDTO.getSpecificationEng().getName() == null) ? "" : html2text(specificationEn);
												spec = doc.createElement("specification");
												if(specificationEn==null)specificationEn="";
												spec.appendChild(doc.createTextNode(specificationEn));
												product.appendChild(spec);								
											}
										}
										
										if (productDTO.getOtherEng() != null) {
											if (alterProductXMLDTO.getOtherEn()) {
												othersEn = productDTO.getOtherEng().getName();
												othersEn = (productDTO.getOtherEng().getName() == null) ? "" : html2text(othersEn);
												others = doc.createElement("others");
												if(othersEn==null)othersEn="";
												others.appendChild(doc.createTextNode(othersEn));
												product.appendChild(others);
											}
										}
										
										if (productDTO.getWarrantyEng() != null) {
											if (alterProductXMLDTO.getWarrantyEn()) {
												warrantyEn = productDTO.getWarrantyEng().getName();
												warrantyEn = (productDTO.getWarrantyEng().getName() == null) ? "" : warrantyEn;
												warranty = doc.createElement("warranty");
												if(warrantyEn==null)warrantyEn="";
												warranty.appendChild(doc.createTextNode(warrantyEn));
												product.appendChild(warranty);								
											}
										}
										
										if (alterProductXMLDTO.getModelNumber()) {
											modelNumberName = productDTO.getManufactureProductList().iterator().next().getName();
											modelNumber = doc.createElement("model-number");
											if(modelNumberName==null)modelNumberName="";
											modelNumber.appendChild(doc.createTextNode(modelNumberName));
											product.appendChild(modelNumber);							
										}
										
										if (alterProductXMLDTO.getWeight()) {
											weightInPounds = productDTO.getWeight();
											weight = doc.createElement("weight");
											if(weightInPounds==null)weightInPounds="";
											weight.appendChild(doc.createTextNode(weightInPounds));
											product.appendChild(weight);							
										}						
										
										if (alterProductXMLDTO.getDimensions()) {
											shippingSize = doc.createElement("shipping-size");
											product.appendChild(shippingSize);
									
											lengthInInches = productDTO.getLarge();
											length = doc.createElement("length");
											if(lengthInInches==null)lengthInInches="";
											length.appendChild(doc.createTextNode(lengthInInches));
											shippingSize.appendChild(length);
							
											widthInInches = productDTO.getWidth();
											width = doc.createElement("width");
											if(widthInInches==null)widthInInches="";
											width.appendChild(doc.createTextNode(widthInInches));
											shippingSize.appendChild(width);

											heightInInches = productDTO.getHigh();
											height = doc.createElement("height");
											if(heightInInches==null)heightInInches="";
											height.appendChild(doc.createTextNode(heightInInches));
											shippingSize.appendChild(height);						
										}											
									}
									
									if (mustUserPriceBodyBeShown(alterUserProductXMLDTO.getPriceDiscount(), alterProductXMLDTO.getMsrp())) {		
									
										userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
										if (userProductPriceDTO != null) {
										
											priceVal = 0d;
											msrpVal = 0d;
											discountVal = 0d;
											percentageVal = 0d;
										
											msrpValue = "0.00";						
											if (productDTO.getMsrp() != null) {
												if (!productDTO.getMsrp().matches("^\\s*$")) {
													msrpValue = productDTO.getMsrp();
												}
											}
											
											if (alterProductXMLDTO.getMsrp()) {
												msrp = doc.createElement("msrp");
												if(msrpValue==null)msrpValue="";
												msrp.appendChild(doc.createTextNode(msrpValue));
												product.appendChild(msrp);
											}					
											
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
											if(priceValue==null)priceValue="";
											price.appendChild(doc.createTextNode(priceValue));
											product.appendChild(price);
											
											if (msrpValue != null) {					
												if (!msrpValue.matches("^\\s*$") && !msrpValue.equalsIgnoreCase("")) {	
													msrpVal = Double.parseDouble(msrpValue);
													msrpValue = format(msrpVal, "#,###.00", "en", "US");	
													discountVal = msrpVal - priceVal;
													discount$$$Value = (discountVal != 0d) ? format(discountVal, "#,###.00", "en", "US") : "0.00";		
													percentageVal = (msrpVal != 0d) ? (100d * discountVal / msrpVal) : 0d;
													discountPercentage = (percentageVal != 0d) 
																		? format(percentageVal, "0.00", "en", "CA")
																		: "0.00" ;
												}
											}
											
											discountDollars = doc.createElement("discount-dollars");
											if(discount$$$Value==null)discount$$$Value="";
											discountDollars.appendChild(doc.createTextNode(discount$$$Value));
											product.appendChild(discountDollars);
											
											discountPercent = doc.createElement("discount-percent");
											if(discountPercentage==null)discountPercentage="";
											discountPercent.appendChild(doc.createTextNode(discountPercentage));
											product.appendChild(discountPercent);
																					
									}	// if (userProductPriceDTO != null)
								
								}	// if (mustUserPriceBodyBeShown()..	
								
								if (alterProductXMLDTO.getShipping()) {
									estimatedShippingRate = doc.createElement("estimated-shipping-rates");
									product.appendChild(estimatedShippingRate);
									
									userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
									shippingTotalCanadaValue = userProductPriceDTO.getShippingTotalCanada();
									if (shippingTotalCanadaValue == null) {
										shippingTotalCanadaValue = "NOT AVAILABLE";
									}
										
									averageCanada = doc.createElement("average-canada");
									if(shippingTotalCanadaValue==null)shippingTotalCanadaValue="";
									averageCanada.appendChild(doc.createTextNode(shippingTotalCanadaValue));
									estimatedShippingRate.appendChild(averageCanada);
									
									perProvince = doc.createElement("rate-per-province");
									estimatedShippingRate.appendChild(perProvince);
										
									shippingTotalDTOList = productService.getShippingTotalList(productId, userId);
									for (ShippingTotalDTO shippingTotalDTO : shippingTotalDTOList) {
										shippingPerProvinceValue = shippingTotalDTO.getAverageShippingTotal();								
										provinceName = findProvinceName(shippingTotalDTO.getProvinceId());
										if (provinceName == null) {
											provinceName = "";
										}
										
										if (provinceName != null && !provinceName.matches("^\\s*$")) {
											provinceElement = doc.createElement(provinceName);
											if(shippingPerProvinceValue==null){
												shippingPerProvinceValue= "NOT AVAILABLE";
											}
											provinceElement.appendChild(doc.createTextNode(shippingPerProvinceValue));
											perProvince.appendChild(provinceElement);
										}	// if (provinceName ...
										
									}	// for (ShippingTotalDTO shippingTotalDTO : ...	
									
								}	// if (alterUserProductXMLDTO.getShipping())
								
// }	// if (productService.existsOnAlterProductXML(productId))							
								
						}	// if (!alterUserProductXMLDTO.getExcludedMeaning())


						
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
	
	private boolean mustXMLHeaderBeShown(AlterProductXMLDTO alterProductXMLDTO, boolean priceDiscountChanged) {		
		boolean productToBeExecuted = alterProductXMLDTO.getProductToBeExecuted();
		boolean msrpChanged = alterProductXMLDTO.getMsrp();
		boolean otherAlterProductXMLValues = alterProductXMLDTO.getBrandId() 
												|| alterProductXMLDTO.getCategoryId()
												|| alterProductXMLDTO.getTypeId()
												|| alterProductXMLDTO.getImageId()
												|| alterProductXMLDTO.getStatusId()
												|| alterProductXMLDTO.getNameEn()
												|| alterProductXMLDTO.getDescriptionEn()
												|| alterProductXMLDTO.getSpecificationEn()
												|| alterProductXMLDTO.getOtherEn()
												|| alterProductXMLDTO.getWarrantyEn()
												|| alterProductXMLDTO.getDimensions()
												|| alterProductXMLDTO.getWeight()
												|| alterProductXMLDTO.getModelNumber();
		boolean msrpTrueOnly = (!otherAlterProductXMLValues && msrpChanged);
		boolean showXMLId = true;
		if (!msrpTrueOnly) {
			if (!productToBeExecuted && !priceDiscountChanged) {
				showXMLId = false;
			}
		} else {
			showXMLId = otherAlterProductXMLValues ? showXMLId : priceDiscountChanged;
			/*
			if (otherAlterProductXMLValues) {
				showXMLId = true;
			} else {
				showXMLId = priceDiscountChanged;
			}
			*/
		}
		return showXMLId;
	}
	
    private String html2text(String html) {
        return Jsoup.parse(html).text();
    }
    
	private boolean mustUserPriceBodyBeShown(boolean priceDiscountChanged, boolean msrpChanged /*, boolean shippingChanged */) {
		return priceDiscountChanged;
		
		
		// return ((priceDiscountChanged && msrpChanged) || (priceDiscountChanged && !msrpChanged));
		// 	==>	 priceDiscountChanged && ( msrpChanged || !msrpChanged )
		//	== > priceDiscountChanged && true
		// return priceDiscountChanged;
	}
	
	private String findGroupName(Long categoryGroupId) {
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
	
	private String findProductStatus(int etat) {
		String outcome = "";
		ProductStatus[] productStata = ProductStatus.values();
		for (ProductStatus status : productStata) {
			if (status.getValue().intValue() == etat) {
				outcome = status.name();
			}
			
		}
		return outcome;		
	}
	
	private String findProvinceName(Long provinceId) {
		String outcome = "";
		Province[] provinceArray = Province.values();
		for (Province p : provinceArray) {
			if (p.getValue() == provinceId.intValue()) {
				outcome = p.getCode();
			}
		}
		return outcome;
	}
	
	private String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	private int countBackRepeatsFromLast(String inputLeft) {
		int numberOfRepeats = 0;
		int pointer = inputLeft.length() - 1;
		while (inputLeft.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) {
			if (inputLeft.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) ++numberOfRepeats;
			if (pointer == 0) break;
			-- pointer;
		}
		return numberOfRepeats;
	}
	
	private int countForthRepeatsFromFirst(String inputRight) {
		int numberOfRepeats = 0;
		int pointer = 0;
		while (inputRight.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) {
			if (inputRight.charAt(pointer) == CHAR_PATTERN_THAT_REPEATS) ++numberOfRepeats;
			if (pointer == inputRight.length() - 1) break;
			++pointer;
		}
		return numberOfRepeats;
	}
	
	private boolean areThereRepeatsBackLeft(String inputLeft) {
		return (countBackRepeatsFromLast(inputLeft) > 0);
	}
	
	private boolean areThereRepeatsForthRight(String inputRight) {
		return (countForthRepeatsFromFirst(inputRight) > 0);
	}
	
	private String concatenate(String inputLeft, String inputRight) {
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
	
}
