package com.loyauty.cronjob.xml;

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
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.service.user.UserService;

/**
 * 
 * @author Rafael Padron
 *
 */
public class XMLGenXProductCatalogEn {
	
	private static final String UNION = "_";
	private static final char CHAR_PATTERN_THAT_REPEATS = '_';
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	private static UserService userService;
	
	
	/*================================================================================================
	 	Method "generateXML" : Generate XML Files for the new or modified products 
	  ================================================================================================*/
	@SuppressWarnings("unused")
	public void generateXML(long userId, File xmlFile, String userCode) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();
			userService = serviceLocator.getUserService();
			
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
			Element currencyPrice = null;
			Element msrp = null;
			Element currencyMsrp = null;
			Element discountDollars = null;
			Element currencyDiscountDollars = null;
			Element discountPercent = null;
			Element modelNumber = null;
			Element weight = null;
			Element shippingSize = null;
			Element length = null;
			Element width = null;
			Element height = null;
			Element warranty = null;
			Element estimatedShippingRate = null;
			//Element currencyEstimatedShippingRate =null;
			Element averageCanada = null;
			//Element currencyAverageCanada = null;
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
			Double boxTotalWeightInPounds = 0D;
			Double boxLengthInInches = 0D;
			Double boxWidthInInches = 0D;
			Double boxHeightInInches = 0D;
			String msrpValue = "";
			String msrpCurrencyValue = "";
			String priceValue = "";
			String priceCurrencyValue = "";
			String discount$$$Value = "";
			String discountCurrencyValue = "";
			String discountPercentage = "";
			double priceVal = 0d;
			double priceCurrencyVal = 0d;
			double msrpVal = 0d;
			double msrpCurrencyVal = 0d;
			double discountVal = 0d;
			double percentageVal = 0d;
			String shippingTotalCanadaValue = "";
			String provinceName = "";
			String shippingPerProvinceValue = "";
			
			long productId = 0L;
			UserDTO userDTO=null;
			userDTO = userService.getUserInformation(userId);
			
			boolean ls_product_id_already_created=false;
			List<ProductDTO> productDTOList = productService.getProductsAsOfConsideredForXML();
				for (ProductDTO productDTO : productDTOList) {
					productId = productDTO.getId();
					ls_product_id_already_created=false;
					if (productService.existsOnAlterUserProductXML(productId, userId)) {
						alterUserProductXMLDTO = productService.getAlterUserProductXML(userId, productId);
						
						if (!alterUserProductXMLDTO.getExcludedMeaning()) {
						 // if (productService.existsOnAlterProductXML(productId)) {
							alterProductXMLDTO = productService.getAlterProductXML(productId);
									
							if (mustXMLHeaderBeShown(alterProductXMLDTO, alterUserProductXMLDTO.getPrice()) ) {					
								//LS_PRODUCT_ID (pre-concatenated with the User Code)
								if(alterProductXMLDTO.getBrandId() || alterProductXMLDTO.getCategoryId()
									|| alterProductXMLDTO.getDescriptionEn() || alterProductXMLDTO.getDimensions()
									|| alterProductXMLDTO.getImageId() || alterProductXMLDTO.getModelNumber()
									|| alterProductXMLDTO.getMsrp() || alterProductXMLDTO.getNameEn()
									|| alterProductXMLDTO.getOtherEn() || alterProductXMLDTO.getShipment()
									|| alterProductXMLDTO.getSpecificationEn() || alterProductXMLDTO.getStatusId()
									|| alterProductXMLDTO.getTypeId() || alterProductXMLDTO.getWarrantyEn()
									|| alterProductXMLDTO.getWeight()) {
									product = doc.createElement("ls-product");
									rootElement.appendChild(product);
									ls_product_id_already_created=true;			
									attr = doc.createAttribute("id");
									loyaltyProductId = concatenate(userCode, productDTO.getLoyaltyProductId());
									attr.setValue(loyaltyProductId);
									product.setAttributeNode(attr);
								}
											
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
								//BRAND_NAME
								if (alterProductXMLDTO.getBrandId()) {
									brandName = productDTO.getBrand().getName();
									brandName = brandName.replaceAll("®", "").replaceAll("™", "");
									brand = doc.createElement("brand-name");
									brand.appendChild(doc.createTextNode(brandName));
									product.appendChild(brand);
								}
										
								//GROUP_NAME & CATEGORY_NAME
								if (alterProductXMLDTO.getCategoryId()) {
									groupName = findGroupName(productDTO.getCategory().getCategoryGoupeId());
									groupName = groupName.replaceAll("®", "").replaceAll("™", "");
									group = doc.createElement("group");
									group.appendChild(doc.createTextNode(groupName));
									product.appendChild(group);

									categoryName = productDTO.getCategory().getName();
									categoryName = categoryName.replaceAll("®", "").replaceAll("™", "");
									category = doc.createElement("category");
									category.appendChild(doc.createTextNode(categoryName));
									product.appendChild(category);						
								}

								//TYPE (SPECIFICATION?)
								if (alterProductXMLDTO.getTypeId()) {
									SpecificationDTO specDTO = specificationService.getSpecification(productDTO.getMainFilterTypeId());
									typeName = specDTO.getName();
									typeName = typeName.replaceAll("®", "").replaceAll("™", "");
									type = doc.createElement("type");
									type.appendChild(doc.createTextNode(typeName));
									product.appendChild(type);						
								}
										
								//IMAGE_LARGE
								if (productDTO.getImage() != null) {
									if (alterProductXMLDTO.getImageId()) {
										imageFilePathName = "http://loyaltysource.com/media/product/large/" 
															+ productDTO.getImage().getName();										
										imageFilePathName = (productDTO.getImage().getName() == null) ? "" : imageFilePathName;
										image = doc.createElement("image");
										image.appendChild(doc.createTextNode(imageFilePathName));
										product.appendChild(image);
									}
								}
										
								//STATUS
								if (alterProductXMLDTO.getStatusId()) {
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
								}
										
								//PRODUCT_NAME_EN
								if (productDTO.getNameEng() != null) {
									if (alterProductXMLDTO.getNameEn()) {
										nameEn = productDTO.getNameEng().getName();
										nameEn = (productDTO.getNameEng().getName() == null) ? "" : nameEn;
										nameEn = nameEn.replaceAll("®", "").replaceAll("™", "");
										title = doc.createElement("title");
										title.appendChild(doc.createTextNode(nameEn));
										product.appendChild(title);
									}
								}
										
								//DESCRIPTION_EN
								if (productDTO.getDescriptionEng() != null) {
									if (alterProductXMLDTO.getDescriptionEn()) {
										descriptionEn = productDTO.getDescriptionEng().getName();
										descriptionEn = (productDTO.getDescriptionEng().getName() == null) ? "" : html2text(descriptionEn);
										descriptionEn = descriptionEn.replaceAll("®", "").replaceAll("™", "");
										desc = doc.createElement("description");
										desc.appendChild(doc.createTextNode(descriptionEn));
										product.appendChild(desc);
									}
								}
										
								//SPECIFICATION_NAME_EN
								if (productDTO.getSpecificationEng() != null) {
									if (alterProductXMLDTO.getSpecificationEn()) {
										specificationEn = productDTO.getSpecificationEng().getName();
										specificationEn = (productDTO.getSpecificationEng().getName() == null) ? "" : html2text(specificationEn);
										specificationEn = specificationEn.replaceAll("®", "").replaceAll("™", "");
										spec = doc.createElement("specification");
										spec.appendChild(doc.createTextNode(specificationEn));
										product.appendChild(spec);								
									}
								}
										
								//OTHER_EN
								if (productDTO.getOtherEng() != null) {
									if (alterProductXMLDTO.getOtherEn()) {
										othersEn = productDTO.getOtherEng().getName();
										othersEn = (productDTO.getOtherEng().getName() == null) ? "" : html2text(othersEn);
										othersEn = othersEn.replaceAll("®", "").replaceAll("™", "");
										others = doc.createElement("others");
										others.appendChild(doc.createTextNode(othersEn));
										product.appendChild(others);
									}
								}
										
								//WARRANTY_EN
								if (productDTO.getWarrantyEng() != null) {
									if (alterProductXMLDTO.getWarrantyEn()) {
										warrantyEn = productDTO.getWarrantyEng().getName();
										warrantyEn = (productDTO.getWarrantyEng().getName() == null) ? "" : warrantyEn;
										warrantyEn = warrantyEn.replaceAll("®", "").replaceAll("™", "");
										warranty = doc.createElement("warranty");
										warranty.appendChild(doc.createTextNode(warrantyEn));
										product.appendChild(warranty);								
									}
								}
										
								//MODEL_NUMBER
								if (alterProductXMLDTO.getModelNumber()) {
									modelNumberName = productDTO.getManufactureProductList().iterator().next().getName();
									modelNumberName = modelNumberName.replaceAll("®", "").replaceAll("™", "");
									modelNumber = doc.createElement("model-number");
									modelNumber.appendChild(doc.createTextNode(modelNumberName));
									product.appendChild(modelNumber);							
								}
										
								//PRODUCT_WEIGHT
								if (alterProductXMLDTO.getWeight()) {
									//weightInPounds = productDTO.getWeight();
									boxTotalWeightInPounds = productDTO.getBoxTotalWeight();
									weight = doc.createElement("weight");
									//weight.appendChild(doc.createTextNode(weightInPounds));
									weight.appendChild(doc.createTextNode(boxTotalWeightInPounds+""));
									product.appendChild(weight);							
								}
										
								//PRODUCT_SIZE
								if (alterProductXMLDTO.getDimensions()) {
									shippingSize = doc.createElement("shipping-size");
									product.appendChild(shippingSize);
									
									//PRODUCT_LENGTHT (inch)
									//lengthInInches = productDTO.getLarge();
									boxLengthInInches = productDTO.getBoxLength();
									length = doc.createElement("length");
									//length.appendChild(doc.createTextNode(lengthInInches));
									length.appendChild(doc.createTextNode(boxLengthInInches+""));
									shippingSize.appendChild(length);
									
									//PRODUCT_WIDTH (inch)
									//widthInInches = productDTO.getWidth();
									boxWidthInInches = productDTO.getBoxWidth();
									width = doc.createElement("width");
									//width.appendChild(doc.createTextNode(widthInInches));
									width.appendChild(doc.createTextNode(boxWidthInInches+""));
									shippingSize.appendChild(width);

									//PRODUCT_HEIGHT (inch)
									//heightInInches = productDTO.getHigh();
									boxHeightInInches = productDTO.getBoxHeight();
									height = doc.createElement("height");
									//height.appendChild(doc.createTextNode(heightInInches));
									height.appendChild(doc.createTextNode(boxHeightInInches+""));
									shippingSize.appendChild(height);						
								}											
							}
									
							//MSRP, COST, DISCOUNT
							//if (mustUserPriceBodyBeShown(alterUserProductXMLDTO.getPriceDiscount(), alterProductXMLDTO.getMsrp())) {
							if (mustUserPriceBodyBeShown(alterUserProductXMLDTO.getPrice(), alterProductXMLDTO.getMsrp())) {

								userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
								String LOGIN = userDTO.getLogin().replaceAll(" ", "").replaceAll("-", "");

								if (userProductPriceDTO != null) {
									if(!ls_product_id_already_created) {
										product = doc.createElement("ls-product");
										rootElement.appendChild(product);
										attr = doc.createAttribute("id");
										loyaltyProductId = concatenate(userCode, productDTO.getLoyaltyProductId());
										attr.setValue(loyaltyProductId);
										product.setAttributeNode(attr);
									}
									
									//MSRP
									msrpVal = 0d;
									msrpValue = "0.00";
									try {
										if(productDTO.getMsrp()!=null && !productDTO.getMsrp().matches("^\\s*$")) {
											msrpValue = productDTO.getMsrp();
											msrpVal = Double.parseDouble(msrpValue);
										}
									} catch(Exception e) {
										msrpVal = 0d;
										msrpValue = "0.00";
									}
									msrpValue = format(msrpVal, "##.00", "en", "US");
									msrpCurrencyVal = getCurrencyPrice(userDTO, msrpVal);
									msrpCurrencyValue = format(msrpCurrencyVal, "##.00", "en", "US");

									//if (alterProductXMLDTO.getMsrp()) {
									//Special case for ReplinkA and ReplinkB
										if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
											msrp = doc.createElement("msrp");
											msrp.appendChild(doc.createTextNode(msrpValue));
											product.appendChild(msrp);
											
											currencyMsrp = doc.createElement("msrp-USD");
											currencyMsrp.appendChild(doc.createTextNode(msrpCurrencyValue));
											product.appendChild(currencyMsrp);
										
										} else { //For all other clients
											msrp = doc.createElement("msrp");
											if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
												msrp.appendChild(doc.createTextNode(msrpCurrencyValue));
											} else {
												msrp.appendChild(doc.createTextNode(msrpValue));
											}
											product.appendChild(msrp);
										}
									//}

									//PRICE
									priceVal = 0;
									priceValue = "0.00";
									try {
										if(userProductPriceDTO.getPrice()!=null && !userProductPriceDTO.getPrice().matches("^\\s*$")) {
											priceValue = userProductPriceDTO.getPrice();
											priceVal = Double.parseDouble(priceValue);
										}
									} catch(Exception e) {
										priceVal = 0;
										priceValue = "0.00";
									}
									priceValue = format(priceVal, "##.00", "en", "US");
									priceCurrencyVal = getCurrencyPrice(userDTO, priceVal);
									priceCurrencyValue = format(priceCurrencyVal, "##.00", "en", "US");
										
									//Special case for ReplinkA and ReplinkB
									if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
										price = doc.createElement("cost");
										price.appendChild(doc.createTextNode(priceValue));
										product.appendChild(price);
										
										currencyPrice = doc.createElement("cost-USD");
										currencyPrice.appendChild(doc.createTextNode(priceCurrencyValue));
										product.appendChild(currencyPrice);
									
									} else { //For all other clients
										price = doc.createElement("cost");
										if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
											price.appendChild(doc.createTextNode(priceCurrencyValue));
										} else {
											price.appendChild(doc.createTextNode(priceValue));
										}
										product.appendChild(price);
									}
											
									//DISCOUNT-DOLLARS
									try {
										discountVal = msrpVal - priceVal;
										discount$$$Value = (discountVal!=0d) ? format(discountVal, "##.00", "en", "US") : "0.00";
										percentageVal = (msrpVal!=0d) ? (100d * discountVal / msrpVal) : 0d;
										discountPercentage = (percentageVal != 0d) ? format(percentageVal, "0.00", "en", "CA") : "0.00";
									} catch(Exception e) {
										discountVal = 0d;
										percentageVal = 0d;
										discount$$$Value = "0.00";
										discountPercentage = "0.00";
									}
									discountCurrencyValue = getCurrencyPrice(userDTO, discountVal)!=0d 
															? format(getCurrencyPrice(userDTO, discountVal), "##.00", "en", "US")
															: "0.00";
									
									//Special case for ReplinkA and ReplinkB
									if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
										discountDollars = doc.createElement("discount-dollars");
										discountDollars.appendChild(doc.createTextNode(discount$$$Value));
										product.appendChild(discountDollars);
										
										currencyDiscountDollars = doc.createElement("discount-dollars-USD");
										currencyDiscountDollars.appendChild(doc.createTextNode(discountCurrencyValue));
										product.appendChild(currencyDiscountDollars);
									
									} else { //For all other clients
										discountDollars = doc.createElement("discount-dollars");
										if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
											discountDollars.appendChild(doc.createTextNode(discountCurrencyValue));
										} else {
											discountDollars.appendChild(doc.createTextNode(discount$$$Value));
										}
										product.appendChild(discountDollars);
									}
																	
									//DISCOUNT-PERCENTAGE
									discountPercent = doc.createElement("discount-percent");
									discountPercent.appendChild(doc.createTextNode(discountPercentage));
									product.appendChild(discountPercent);
																					
								}	// if (userProductPriceDTO != null)
								
							}	// if (mustUserPriceBodyBeShown()..	
								
							//SHIPPING_RATES
							//if (alterProductXMLDTO.getShipping()) {
							if (alterProductXMLDTO.getShipment()) {
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
									if (provinceName == null) {
										provinceName = "";
									}
									
									if (shippingPerProvinceValue == null) {
										shippingPerProvinceValue = "NOT AVAILABLE";
									}
									
									if (provinceName != null && !provinceName.matches("^\\s*$")) {
										provinceElement = doc.createElement(provinceName);
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
	
	/*================================================================================================
		Method "generateXMLwhenCurrencyChanged" : Generate XML Files for all products when the 
		Currency is changed within the 24 last hours for the users concerned by the currency 
	  ================================================================================================*/
	public void generateXMLwhenCurrencyChanged(long userId, File xmlFile, String userCode) {
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();
			userService = serviceLocator.getUserService();
			//List<ShippingTotalDTO> shippingTotalDTOList = null;
			UserProductPriceDTO userProductPriceDTO = null;
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root element.
			Document doc = docBuilder.newDocument();			
			Element rootElement = doc.createElement("catalog");
			doc.appendChild(rootElement);
			
			Element product = null;
			Attr attr = null;
			//Element group = null;	
			//Element category = null;	
			//Element type = null;
			//Element image = null;
			//Element brand = null;
			//Element status = null;
			//Element subProduct = null;
			//Element title = null;
			//Element desc = null;
			//Element spec = null;
			//Element others = null;
			
			//Element elementTitleFr = null;
			//Element elementDescFr = null;
			//Element elementSpecFr = null;
			//Element elementOthersFr = null;
			
			
			Element price = null;
			Element currencyPrice = null;
			Element msrp = null;
			Element currencyMsrp = null;
			Element discountDollars = null;
			Element currencyDiscountDollars = null;
			Element discountPercent = null;
			//Element modelNumber = null;
			//Element weight = null;
			//Element shippingSize = null;
			//Element length = null;
			//Element width = null;
			//Element height = null;
			//Element warranty = null;
			//Element estimatedShippingRate = null;
			//Element averageCanada = null;
			//Element perProvince = null;
			//Element provinceElement = null;
			//Element upcElement = null;

			String loyaltyProductId = "";
			//String brandName = "";
			//String groupName = "";
			//String categoryName = "";
			//String typeName = "";
			//String imageFilePathName = "";
			//String statusName = "";
			//String subLSProductID = "";
			
			//String nameEn = "";
			//String descriptionEn = "";
			//String specificationEn = "";
			//String othersEn = "";
			
			
			//String titleFr = "";
			//String descFr = "";
			//String specFr = "";
			//String othersFr = "";
			
			//String warrantyEn = "";
			//String modelNumberName = "";
			//String weightInPounds = "";
			//String lengthInInches = "";
			//String widthInInches = "";
			//String heightInInches = "";
			String msrpValue = "";
			String msrpCurrencyValue="";
			String priceValue = "";
			String priceCurrencyValue = "";
			String discount$$$Value = "";
			String discountCurrencyValue = "";
			String discountPercentage = "";
			double priceVal = 0d;
			double priceCurrencyVal = 0d;
			double msrpVal = 0d;
			double msrpCurrencyVal = 0d;
			double discountVal = 0d;
			double percentageVal = 0d;
			//String shippingTotalCanadaValue = "";
			//String provinceName = "";
			//String shippingPerProvinceValue = "";

			UserDTO userDTO = userService.getUserInformation(userId);
			
			long productId = 0L;
			List<ProductDTO> productDTOList = productService.getValidProductsByUserIdAndExcluded(userId);
			for (ProductDTO productDTO : productDTOList) {
				productId = productDTO.getId();
				
				//xml root 
				product = doc.createElement("ls-product");
				rootElement.appendChild(product);
				
				//id
				attr = doc.createAttribute("id");
				loyaltyProductId = concatenate(userCode, productDTO.getLoyaltyProductId());
				attr.setValue(loyaltyProductId);
				product.setAttributeNode(attr);

				System.out.println("[XMLGenXProductCatalog] [Header] productID = " + productId + " [" 
						+ loyaltyProductId 
						+ "] with userId = " + userId);
				
				/*
				//brand-name
				brandName = productDTO.getBrand().getName();
				brandName = brandName.replaceAll("®", "").replaceAll("™", "");
				brand = doc.createElement("brand-name");
				brand.appendChild(doc.createTextNode(brandName));
				product.appendChild(brand);
				*/

				/*
				//group
				groupName = findGroupName(productDTO.getCategory().getCategoryGoupeId());
				groupName = groupName.replaceAll("®", "").replaceAll("™", "");
				group = doc.createElement("group");
				group.appendChild(doc.createTextNode(groupName));
				product.appendChild(group);
				*/

				/*
				//category
				categoryName = productDTO.getCategory().getName();
				categoryName = categoryName.replaceAll("®", "").replaceAll("™", "");
				category = doc.createElement("category");
				category.appendChild(doc.createTextNode(categoryName));
				product.appendChild(category);
				*/	

				/*
				//type
				SpecificationDTO specDTO = specificationService.getSpecification(productDTO.getMainFilterTypeId());
				typeName = specDTO.getName();
				typeName = typeName.replaceAll("®", "").replaceAll("™", "");
				type = doc.createElement("type");
				type.appendChild(doc.createTextNode(typeName));
				product.appendChild(type);
				*/	

				/*
				//image
				if (productDTO.getImage() != null) {
					imageFilePathName = "http://loyaltysource.com/media/product/large/" 
						+ productDTO.getImage().getName();										
					imageFilePathName = (productDTO.getImage().getName() == null) ? "" : imageFilePathName;
					imageFilePathName = imageFilePathName.replaceAll("®", "").replaceAll("™", "");
					image = doc.createElement("image");
					image.appendChild(doc.createTextNode(imageFilePathName));
					product.appendChild(image);
				}
				*/	

				/*
				//status
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
				*/											

				/*
				//title in English
				if (productDTO.getNameEng() != null) {
					nameEn = productDTO.getNameEng().getName();
					nameEn = (productDTO.getNameEng().getName() == null) ? "" : nameEn;
					nameEn = nameEn.replaceAll("®", "").replaceAll("™", "");
					title = doc.createElement("title");
					title.appendChild(doc.createTextNode(nameEn));
					product.appendChild(title);
				}
				*/
				
				/*
				//title in French
				if (productDTO.getNameFr() != null) {
					titleFr = productDTO.getNameFr().getName();
					titleFr = (productDTO.getNameFr().getName() == null) ? "" : titleFr;
					titleFr = titleFr.replaceAll("®", "").replaceAll("™", "");
					elementTitleFr = doc.createElement("titre");
					elementTitleFr.appendChild(doc.createTextNode(titleFr));
					product.appendChild(elementTitleFr);
				}
				*/

				/*
				//Description in English
				if (productDTO.getDescriptionEng() != null) {
					descriptionEn = productDTO.getDescriptionEng().getName();
					descriptionEn = (productDTO.getDescriptionEng().getName() == null) ? "" : html2text(descriptionEn);
					descriptionEn = descriptionEn.replaceAll("®", "").replaceAll("™", "");
					desc = doc.createElement("description_en");
					desc.appendChild(doc.createTextNode(descriptionEn));
					product.appendChild(desc);
				}
				*/

				/*
				//Description in French
				if (productDTO.getDescriptionFr() != null) {
					descFr = productDTO.getDescriptionFr().getName();
					descFr = (productDTO.getDescriptionFr().getName() == null) ? "" : html2text(descFr);
					descFr = descFr.replaceAll("®", "").replaceAll("™", "");
					elementDescFr = doc.createElement("description_fr");
					elementDescFr.appendChild(doc.createTextNode(descFr));
					product.appendChild(elementDescFr);
				}
				*/

				/*
				//specification in English
				if (productDTO.getSpecificationEng() != null) {
					specificationEn = productDTO.getSpecificationEng().getName();
					specificationEn = (productDTO.getSpecificationEng().getName() == null) ? "" : html2text(specificationEn);
					specificationEn = specificationEn.replaceAll("®", "").replaceAll("™", "");
					spec = doc.createElement("specification_en");
					spec.appendChild(doc.createTextNode(specificationEn));
					product.appendChild(spec);								
				}
				*/

				/*
				//specification in French
				if (productDTO.getSpecificationFr() != null) {
					specFr = productDTO.getSpecificationFr().getName();
					specFr = (productDTO.getSpecificationFr().getName() == null) ? "" : html2text(specFr);
					specFr = specFr.replaceAll("®", "").replaceAll("™", "");
					elementSpecFr = doc.createElement("specification_fr");
					elementSpecFr.appendChild(doc.createTextNode(specFr));
					product.appendChild(elementSpecFr);
				}
				*/

				/*
				//others in English
				if (productDTO.getOtherEng() != null) {
					othersEn = productDTO.getOtherEng().getName();
					othersEn = (productDTO.getOtherEng().getName() == null) ? "" : html2text(othersEn);
					othersEn = othersEn.replaceAll("®", "").replaceAll("™", "");
					others = doc.createElement("others_en");
					others.appendChild(doc.createTextNode(othersEn));
					product.appendChild(others);
				}
				*/

				
				/*
				//others in French
				if (productDTO.getOtherFr() != null) {
					othersFr = productDTO.getOtherFr().getName();
					othersFr = (productDTO.getOtherFr().getName() == null) ? "" : html2text(othersFr);
					othersFr = othersFr.replaceAll("®", "").replaceAll("™", "");
					elementOthersFr = doc.createElement("others_fr");
					elementOthersFr.appendChild(doc.createTextNode(othersFr));
					product.appendChild(elementOthersFr);
				}
				*/

				/*
				//warranty
				if (productDTO.getWarrantyEng() != null) {
					warrantyEn = productDTO.getWarrantyEng().getName();
					warrantyEn = (productDTO.getWarrantyEng().getName() == null) ? "" : warrantyEn;
					warrantyEn = warrantyEn.replaceAll("®", "").replaceAll("™", "");
					warranty = doc.createElement("warranty");
					warranty.appendChild(doc.createTextNode(warrantyEn));
					product.appendChild(warranty);								
				}
				*/

				/*
				//model-number
				modelNumberName = productDTO.getManufactureProductList().iterator().next().getName();
				modelNumberName = modelNumberName.replaceAll("®", "").replaceAll("™", "");
				modelNumber = doc.createElement("model-number");
				modelNumber.appendChild(doc.createTextNode(modelNumberName));
				product.appendChild(modelNumber);
				*/							

				/*
				//weight
				weightInPounds = productDTO.getWeight();
				weight = doc.createElement("weight");
				weight.appendChild(doc.createTextNode(weightInPounds));
				product.appendChild(weight);
				*/							

				/*
				//shipping-size
				shippingSize = doc.createElement("shipping-size");
				product.appendChild(shippingSize);

				//length
				lengthInInches = productDTO.getLarge();
				length = doc.createElement("length");
				length.appendChild(doc.createTextNode(lengthInInches));
				shippingSize.appendChild(length);

				//width
				widthInInches = productDTO.getWidth();
				width = doc.createElement("width");
				width.appendChild(doc.createTextNode(widthInInches));
				shippingSize.appendChild(width);

				//height
				heightInInches = productDTO.getHigh();
				height = doc.createElement("height");
				height.appendChild(doc.createTextNode(heightInInches));
				shippingSize.appendChild(height);
				*/						

				//MSRP, COST, DISCOUNT
				userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
				String LOGIN = userDTO.getLogin().replaceAll(" ", "").replaceAll("-", "");
				if (userProductPriceDTO != null) {
					
					//MSRP
					msrpVal = 0d;
					msrpValue = "0.00";
					try {
						if(productDTO.getMsrp()!= null && !productDTO.getMsrp().matches("^\\s*$")) {
							msrpValue = productDTO.getMsrp();
							msrpVal = Double.parseDouble(msrpValue);
						}
					} catch (Exception e) {
						msrpVal = 0d;
						msrpValue = "0.00";
					}
					msrpValue = format(msrpVal, "##.00", "en", "US");
					msrpCurrencyVal = getCurrencyPrice(userDTO, msrpVal);
					msrpCurrencyValue = format(msrpCurrencyVal, "##.00", "en", "US");

					//Special case for ReplinkA and ReplinkB
					if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
						msrp = doc.createElement("msrp");
						msrp.appendChild(doc.createTextNode(msrpValue));
						product.appendChild(msrp);
						
						currencyMsrp = doc.createElement("msrp-USD");
						currencyMsrp.appendChild(doc.createTextNode(msrpCurrencyValue));
						product.appendChild(currencyMsrp);
					
					} else { //For the all other clients
						msrp = doc.createElement("msrp");
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
							msrp.appendChild(doc.createTextNode(msrpCurrencyValue));
						} else {
							msrp.appendChild(doc.createTextNode(msrpValue));
						}
						product.appendChild(msrp);
					}

					//PRICE
					priceVal = 0;
					priceValue = "0.00";
					try {
						if(userProductPriceDTO.getPrice()!=null && !userProductPriceDTO.getPrice().matches("^\\s*$")) {
							priceValue = userProductPriceDTO.getPrice();
							priceVal = Double.parseDouble(priceValue);
						}
					} catch(Exception e) {
						priceVal = 0d;
						priceValue = "0.00";
					}
					priceValue = format(priceVal, "##.00", "en", "US");
					priceCurrencyVal = getCurrencyPrice(userDTO, priceVal);
					priceCurrencyValue = format(priceCurrencyVal, "##.00", "en", "US");

					//Special case for ReplinkA and ReplinkB
					if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
						price = doc.createElement("cost");
						price.appendChild(doc.createTextNode(priceValue));
						product.appendChild(price);
						
						currencyPrice = doc.createElement("cost-USD");
						currencyPrice.appendChild(doc.createTextNode(priceCurrencyValue));
						product.appendChild(currencyPrice);
					
					} else { //For the all other clients
						price = doc.createElement("cost");
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
							price.appendChild(doc.createTextNode(priceCurrencyValue));
						} else {
							price.appendChild(doc.createTextNode(priceValue));
						}
						product.appendChild(price);
					}
					
					//DISCOUNT-DOLLARS
					try {
						discountVal = msrpVal - priceVal;
						discount$$$Value = (discountVal!=0d) ? format(discountVal, "##.00", "en", "US") : "0.00";
						percentageVal = (msrpVal!=0d) ? (100d * discountVal / msrpVal) : 0d;
						discountPercentage = (percentageVal != 0d) ? format(percentageVal, "0.00", "en", "CA") : "0.00";
					} catch(Exception e) {
						discountVal = 0d;
						percentageVal = 0d;
						discount$$$Value = "0.00";
						discountPercentage = "0.00";
					}
					discountCurrencyValue = getCurrencyPrice(userDTO, discountVal)!=0d
							? format(getCurrencyPrice(userDTO, discountVal), "##.00", "en", "US") 
							: "0.00";
					
					//Special case for ReplinkA and ReplinkB
					if(LOGIN.toUpperCase().equals("REPLINKA") || LOGIN.toUpperCase().equals("REPLINKB")) {
						discountDollars = doc.createElement("discount-dollars");
						discountDollars.appendChild(doc.createTextNode(discount$$$Value));
						product.appendChild(discountDollars);
						
						currencyDiscountDollars = doc.createElement("discount-dollars-USD");
						currencyDiscountDollars.appendChild(doc.createTextNode(discountCurrencyValue));
						product.appendChild(currencyDiscountDollars);
					
					} else { //For the all other clients
						discountDollars = doc.createElement("discount-dollars");
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
							discountDollars.appendChild(doc.createTextNode(discountCurrencyValue));
						} else {
							discountDollars.appendChild(doc.createTextNode(discount$$$Value));
						}
						product.appendChild(discountDollars);
					}

					//DISCOUNT-PERCENTAGE
					discountPercent = doc.createElement("discount-percent");
					discountPercent.appendChild(doc.createTextNode(discountPercentage));
					product.appendChild(discountPercent);

					/*
					// Shipping Rate
					estimatedShippingRate = doc.createElement("estimated-shipping-rates");
					product.appendChild(estimatedShippingRate);

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
						if (provinceName == null) {
							provinceName = "NOT AVAILABLE";
						}
						if (provinceName != null && !provinceName.matches("^\\s*$")) {
							provinceElement = doc.createElement(provinceName);
							provinceElement.appendChild(doc.createTextNode(shippingPerProvinceValue));
							perProvince.appendChild(provinceElement);
						}// if (provinceName ...
					}	// for (ShippingTotalDTO shippingTotalDTO : ...	
					*/

					/*
					String upc = productDTO.getUpc();
					if(upc==null)upc="";
					upcElement = doc.createElement("upc");
					upcElement.appendChild(doc.createTextNode(upc));
					product.appendChild(upcElement);
					*/

				}	// if (userProductPriceDTO != null)									

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
	
	
	/*================================================================================================
		Method "mustXMLHeaderBeShown" :
	  ================================================================================================*/
	private boolean mustXMLHeaderBeShown(AlterProductXMLDTO alterProductXMLDTO, boolean priceChanged) {		
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
			if (!productToBeExecuted && !priceChanged) {
				showXMLId = false;
			}
		} else {
			showXMLId = otherAlterProductXMLValues ? showXMLId : priceChanged;
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
	
	
	/*================================================================================================
		Method "html2text" : return a string without html tags
  	  ================================================================================================*/
    private String html2text(String html) {
        return Jsoup.parse(html).text();
    }
    
    
    /*================================================================================================
		Method "mustUserPriceBodyBeShown" : 
	  ================================================================================================*/
	private boolean mustUserPriceBodyBeShown(boolean priceDiscountChanged, boolean msrpChanged /*, boolean shippingChanged */) {
		return priceDiscountChanged;
		
		
		// return ((priceDiscountChanged && msrpChanged) || (priceDiscountChanged && !msrpChanged));
		// 	==>	 priceDiscountChanged && ( msrpChanged || !msrpChanged )
		//	== > priceDiscountChanged && true
		// return priceDiscountChanged;
	}
	
	
	/*================================================================================================
		Method "findGroupName" : 
	  ================================================================================================*/
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
	
	
	/*================================================================================================
		Method "findProductStatus" : 
	  ================================================================================================*/
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
	
	
	/*================================================================================================
		Method "findProvinceName" : 
	  ================================================================================================*/
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
	
	
	/*================================================================================================
		Method "format" : returns a string format for a number
	================================================================================================*/
	private String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	
	/*================================================================================================
		Method "countBackRepeatsFromLast" : 
	  ================================================================================================*/
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
	
	/*================================================================================================
		Method "countForthRepeatsFromFirst" : 
	  ================================================================================================*/
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
	
	
	/*================================================================================================
		Method "areThereRepeatsBackLeft" : 
	  ================================================================================================*/
	private boolean areThereRepeatsBackLeft(String inputLeft) {
		return (countBackRepeatsFromLast(inputLeft) > 0);
	}
	
	
	/*================================================================================================
		Method "areThereRepeatsForthRight" : 
	  ================================================================================================*/
	private boolean areThereRepeatsForthRight(String inputRight) {
		return (countForthRepeatsFromFirst(inputRight) > 0);
	}
	
	
	/*================================================================================================
		Method "concatenate" : 
	  ================================================================================================*/
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
	
	
	/*================================================================================================
		Method "getCurrencyPrice" : 
			returns 0 if the user is not concerned by the currency or in case of a problem 
  	  ================================================================================================*/
	private double getCurrencyPrice(UserDTO userDTO, Double price) {
		double result=0d;
		String loginReplink = userDTO.getLogin().replaceAll(" ", "").replaceAll("-", "");
		//Special Case for ReplinkA and ReplinkB;
		if(loginReplink.toUpperCase().equals("REPLINKA") || loginReplink.toUpperCase().equals("REPLINKB")) {
			try {
				if(price!=null) {
					CurrencyDTO currencyDTO = new CurrencyDTO();
					currencyDTO.setSymbol("USD");
					currencyDTO = productService.getCurrencyBySymbol(currencyDTO);
					result = (currencyDTO!=null && currencyDTO.getRate()!=null && price!=null) ? price*currencyDTO.getRate() : 0d;
					result = (double) Math.round(result*100)/100;
				}
			} catch (ServiceException e) {
				result = price==null ? 0d : price;
			}
		}
		//For all other users
		try {
			if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1 
					&& userDTO.getCurrencyRate()!=null && price!=null) {
				result = price * userDTO.getCurrencyRate();
				result = (double) Math.round(result*100)/100;
			}
		} catch (Exception e) {
			result=0d;
		}
		
		return result;
	}
	
}
