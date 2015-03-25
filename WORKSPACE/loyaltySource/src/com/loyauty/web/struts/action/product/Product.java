package com.loyauty.web.struts.action.product;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserType;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.UserProductPrice;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.RequestAtributeConstants;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;
import com.loyauty.web.util.SeoUrlsMaker;

public class Product extends LoyautyAction {
	
	private static final long serialVersionUID = 1L;
	
	private static final String UNION = "_";
	private static final char CHAR_PATTERN_THAT_REPEATS = '_';
	
	private ProductService productService;
	private SpecificationService specificationService;
	private UserService userService;
	
	@Getter @Setter
	private ProductDTO productDTO;
	@Getter @Setter
	private ProductDTO saleProductDTO;
	@Getter @Setter
	private Integer init;
	@Getter @Setter
	private BrandDTO brandDTO;
	@Getter @Setter
	private ImageDTO productImageDTO;
	@Getter @Setter
	private ImageDTO brandImageDTO;
	@Getter @Setter
	private String productImageName;
	@Getter @Setter
	private String brandImageName;
	@Getter @Setter
	private long productId;
	@Getter @Setter
	private String productName;
	@Getter @Setter
	private String desc;	
	@Getter @Setter
	private String spec;
	@Getter @Setter
	private String other;
	@Getter @Setter
	private String loyaltyProductId;
	@Getter @Setter
	private String loyaltyProductIdWithountPrefix;
	@Getter @Setter
	private String weight;
	@Getter @Setter
	private String w;
	@Getter @Setter
	private String l;
	@Getter @Setter
	private String h;	
	@Getter @Setter
	private String modelNumber;
	@Getter @Setter
	private String price;	
	@Getter @Setter
	private String msrp;
	@Getter @Setter
	private String discount;
	@Getter @Setter
	private String percentage;	
	@Getter @Setter
	private String productBreadcrumb;
	@Getter @Setter
	private String groupName;
	@Getter @Setter
	private String groupHL;
	@Getter @Setter
	private String categoryName;
	@Getter @Setter
	private String categoryHL;
	@Getter @Setter
	private String specName;
	@Getter @Setter
	private String specHL;	
	@Getter @Setter
	private String warranty;	
	@Getter @Setter
	private String hrefName;
	@Getter @Setter
	private String link;
	@Getter @Setter
	private String warning;
	@Getter @Setter
	private String warning2;	
	@Getter @Setter
	private String writeWarning;
	@Getter @Setter
	private String loyaltyProductIdSub;
	@Getter @Setter
	private String newLSProductIdSubHRef;
	
	@Getter @Setter
	private String sendRestricted;
	
	@Getter @Setter
	private Long numberOfProductModelElements;
	//private int numberOfProductModelElements;
	@Getter @Setter
	private List<ShippingTotalDTO> provinceNameList;
	@Getter @Setter
	private String[] provinceName;	
	@Getter @Setter
	String[] shippingCost;
	@Getter @Setter
	private String shippingTotalCanada;
	
	@Getter @Setter
	private String shippingCostTdName;	//Line Shipping Cost  in Shipping Rates Tab

	public Product() throws ServiceLocatorException {
		super();
		productService = getServiceLocator().getProductService();
		specificationService = getServiceLocator().getSpecificationService();
		userService = getServiceLocator().getUserService();
	}	
	
	@Override  
	public String execute() throws Exception {
		try {
			UserSessionDTO userSessionDTO = (UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
			if(init==null)init=1;
			if (userSessionDTO != null) {
				productDTO = productService.getProductInformation(productId, userSessionDTO.getId());
				saleProductDTO=productService.getSaleActiveByProductIdAndUserId(productId, userSessionDTO.getId());
				productBreadcrumb = "Our Products";				
			} else {
				productDTO = productService.getProductInformation(productId, null);
				productBreadcrumb = "Products";
			}
			
			//check if is there's products sale

			
			productImageDTO = productDTO.getImage();
			productImageName = productImageDTO != null ? productImageDTO.getName() : "";
			
			if (productDTO.getBrand() != null) {
				brandDTO = productDTO.getBrand();
				
				productDTO.getBrand().setHrefName(SeoUrlsMaker.getBrandUrl(brandDTO.getName(), brandDTO.getId()));
				
				if (brandDTO.getImage() != null) {
					brandImageDTO = brandDTO.getImage();
					if (brandImageDTO != null) {
						brandImageName = brandImageDTO.getName();
					} else {
						brandImageName = "";
					}
				} else {
					brandImageName = "";
				}
			} else {
				brandImageName = "";
			}
			
			if (getCurrentLanguage().equals(WebConstants.ENGLISH_LANGUAGE)) {
				productName = productDTO.getNameEng().getName();
				desc = productDTO.getDescriptionEng().getName();
				spec = productDTO.getSpecificationEng().getName();
				other = productDTO.getOtherEng().getName();
				warranty = (productDTO.getWarrantyEng() != null) ? productDTO.getWarrantyEng().getName() : "";
			} else if (getCurrentLanguage().equals(WebConstants.FRENCH_LANGUAGE)) { 
				productName = productDTO.getNameFr().getName();
				desc = productDTO.getDescriptionFr().getName();
				spec = productDTO.getSpecificationFr().getName();
				other = productDTO.getSpecificationFr().getName();
				warranty = (productDTO.getWarrantyFr() != null) ? productDTO.getWarrantyFr().getName() : "";
			}
			
			//Link url 
			if(productDTO.getLinkList().size() > 0)
				link = productDTO.getLinkList().get(0).getLink();

			if (desc.indexOf("<p></p>") != -1 && desc.length() == 7) desc = desc.replaceAll("<p></p>", "");
			if (spec.indexOf("<p></p>") != -1 && spec.length() == 7) spec = spec.replaceAll("<p></p>", "");
			
			Integer status = productDTO.getStatus().getValue();
			if (status == ProductStatus.UNAVAILABLE.getValue()) {
				writeWarning = "y2";
				warning = "PRODUCT TEMPORARILY UNAVAILABLE";
			} else if (status == ProductStatus.DISCONTINUED.getValue()) {
				writeWarning = "y3";
				loyaltyProductIdSub = productDTO.getLoyaltyProductIdSub();
				warning = "THIS PRODUCT IS DISCONTINUED";
				
				if (!loyaltyProductIdSub.matches("^\\s*$")) {
					warning2 = "Please view our suggested replacement: ";
					ProductDTO newProductDTO = productService.getProductIdFromLSProductId(loyaltyProductIdSub);
					if (newProductDTO != null) {
						long newProductId = newProductDTO.getId();
						String newBrandName = newProductDTO.getBrand().getName();
						String newProductName = "";
						if(getCurrentLanguage().equals(WebConstants.ENGLISH_LANGUAGE)) {					
							newProductName = newProductDTO.getNameEng().getName();					
						} else if(getCurrentLanguage().equals(WebConstants.FRENCH_LANGUAGE)) {
							newProductName = newProductDTO.getNameFr().getName();
						}
						newLSProductIdSubHRef = SeoUrlsMaker.getProductUrl(newBrandName, newProductName, newProductId);
					}
				}
			}
			
			//weight = productDTO.getWeight();		
			weight = productDTO.getBoxTotalWeight()+"";	
			if (weight != null && !weight.equals("null")) {
				weight = (!weight.matches("^\\s*$")) ? String.valueOf(weight) : "";	
			} else {
				weight = "";
			}
			
			/*String width = productDTO.getWidth();	w = (!width.equalsIgnoreCase("0")) ? String.valueOf(width) : "";
			String large = productDTO.getLarge();	l = (!large.equalsIgnoreCase("0")) ? String.valueOf(large) : "";	
			String high = productDTO.getHigh();		h = (!high.equalsIgnoreCase("0"))  ? String.valueOf(high)  : "";*/
			
			String width = productDTO.getBoxWidth()+"";	w = (!width.equalsIgnoreCase("0") && !width.equalsIgnoreCase("null")) ? String.valueOf(width) : "";
			String large = productDTO.getBoxLength()+"";l = (!large.equalsIgnoreCase("0") && !large.equalsIgnoreCase("null")) ? String.valueOf(large) : "";	
			String high = productDTO.getBoxHeight()+"";h = (!high.equalsIgnoreCase("0")&& !high.equalsIgnoreCase("null"))  ? String.valueOf(high)  : "";
			
			if(productDTO.getManufactureProductList().size() >= 1) {
				modelNumber= ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
			} else {
				modelNumber = "";
			}
			modelNumber = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();			
			
			if (userSessionDTO != null) {
				List<UserProductPriceDTO> userProductPriceDTOList = productService.getUserProductPriceList(productId);
				for (UserProductPriceDTO userProductPriceDTO : userProductPriceDTOList) {
					if (userSessionDTO.getId() == userProductPriceDTO.getUserId() && userProductPriceDTO.getExcluded()) {
						sendRestricted = "restricted";
					}
				}
			}
			
			/*numberOfProductModelElements = (productDTO.getManufactureProductList() != null) 
											? productDTO.getManufactureProductList().size()
											: 0;*/
			numberOfProductModelElements=productService.isGroupProductID(productId);
			price = productDTO.getPriceProduct();
			msrp = productDTO.getMsrp();
			percentage = "";
			discount = "";
			
			double priceVal = 0d;
			double msrpVal = 0d;
			double discountVal = 0d;
			double percentageVal = 0d;
			
			UserDTO userDTO = null;
			if (userSessionDTO != null) {	// User logged in!!!
				//Currency Rate and Symbol
				userDTO = userService.getUserInformation(userSessionDTO.getId());
				if (price != null) {
					if (!price.matches("^\\s*$") && !price.equalsIgnoreCase("")) {					
						priceVal = Double.parseDouble(price);
						price = "$" + format(priceVal, "#,###.00", "en", "US");
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
							if(userDTO.getCurrencySymbol()!=null && userDTO.getCurrencySymbol().toUpperCase().equals("USD")) {
								price = "USD $" + format(priceVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
							} else {
								price = userDTO.getCurrencySymbol().toUpperCase() + format(priceVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
							}
						}
					} else {
						priceVal = 0d;
						price = "";
					}
				}				
				if (msrp != null) {					
					if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {	
						msrpVal = Double.parseDouble(msrp);
						msrp = "$" + format(msrpVal, "#,###.00", "en", "US");
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
							if(userDTO.getCurrencySymbol()!=null && userDTO.getCurrencySymbol().toUpperCase().equals("USD")) {
								msrp = "USD $" + format(msrpVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
							} else {
								msrp = userDTO.getCurrencySymbol() + format(msrpVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
							}
						}
						discountVal = msrpVal - priceVal;
						if(discountVal == 0d) {
							discount = "";
						} else {
							discount = "$" + format(discountVal, "#,###.00", "en", "US");
							if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
								if(userDTO.getCurrencySymbol()!=null && userDTO.getCurrencySymbol().toUpperCase().equals("USD")) {
									discount = "USD $" + format(discountVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
								} else {
									discount = userDTO.getCurrencySymbol() + format(discountVal*userDTO.getCurrencyRate(), "#,###.00", "en", "US");
								}
							}
						}
						percentageVal = (msrpVal != 0d) ? (100d * discountVal / msrpVal) : 0d;
						percentage = (percentageVal != 0d) 
										? "(" + format(percentageVal, "0.00", "en", "CA") + "%)" 
										: "" ;
					} else {
						discount = "";
						percentage = "";
						msrp = "";
					}			
				}			
				loyaltyProductId = concatenate(userSessionDTO.getCode(), productDTO.getLoyaltyProductId());
			} else {	// User Not Logged-in!!!!
				if (msrp != null || !msrp.matches("^\\s*$")) {
					msrpVal = Double.parseDouble(msrp);
					msrp = "$" + format(msrpVal, "#,###.00", "en", "US");
				} else {
					msrp = "";		
				}
				loyaltyProductId = productDTO.getLoyaltyProductId();
			}
			loyaltyProductIdWithountPrefix=productDTO.getLoyaltyProductId();
			long groupId = productDTO.getCategory().getCategoryGoupeId();
			groupName = groupId >= 1L 
						? GroupCategoryEnum.values()[((int) groupId) - 1].getCode() 
						: "";
			groupHL = SeoUrlsMaker.getCategoryGroupUrl(groupName);
			long categoryID = productDTO.getCategory().getId();
			categoryName = productDTO.getCategory().getName();
			categoryHL = SeoUrlsMaker.getCategoryUrl(groupName, categoryName, categoryID);
			long specId = productDTO.getMainFilterTypeId();
			SpecificationDTO specDTO = specificationService.getSpecification(specId);			
			
			specName = specDTO.getName();
			specHL = SeoUrlsMaker.getSpecificationUrl(groupName, categoryName, specName, specId);
			
			request.getSession(true).setAttribute("queryID", groupId);			
			request.getSession(true).setAttribute("productBreadcrumb", productBreadcrumb);
			request.getSession(true).setAttribute("groupName", groupName);
			request.getSession(true).setAttribute("groupHL", groupHL);
			request.getSession(true).setAttribute("categoryName", categoryName);
			request.getSession(true).setAttribute("categoryHL", categoryHL);
			request.getSession(true).setAttribute("specName", specName);
			request.getSession(true).setAttribute("specHL", specHL);
			
			//Set information title
			request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, productName);
			request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_2, brandDTO.getName());
			
			
			if (userSessionDTO != null) {
				long userId = userSessionDTO.getId();
				provinceNameList = productService.getShippingTotalList(productId, userId);
				final int SIZE = provinceNameList.size();
				provinceName = new String[SIZE];
				shippingCost = new String[SIZE];	
				
				ProvinceDTO provinceDTO = new ProvinceDTO();
				long provinceId = 0L;
				int count = 0;
				String $ = "$";
				shippingCostTdName = "Shipping Cost";
				for (ShippingTotalDTO shippingTotalDTO : provinceNameList) {
					provinceId = shippingTotalDTO.getProvinceId();
					provinceDTO = productService.getProvince(provinceId);
					provinceName[count] = provinceDTO.getCode();
					if (!shippingTotalDTO.getAverageShippingTotal().trim()
							.equalsIgnoreCase("NOT AVAILABLE")) {
						shippingCost[count] = $ + shippingTotalDTO.getAverageShippingTotal();
						if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1
								&& !shippingTotalDTO.getAverageShippingTotal().trim().matches("^\\s*$")) {
							if(userDTO.getCurrencySymbol()!=null && userDTO.getCurrencySymbol().toUpperCase().equals("USD")) {
								shippingCostTdName = "Shipping Cost (USD $)";
								shippingCost[count] = shippingTotalDTO.getAverageShippingTotal();
							} else {
								shippingCostTdName = "Shipping Cost ("+userDTO.getCurrencySymbol().toUpperCase()+")";
								shippingCost[count] = shippingTotalDTO.getAverageShippingTotal();
							}
						}
					} else {
						shippingCost[count] = "N/A";
					}
					++count;
				}
				
				UserProductPriceDTO userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
				
				shippingTotalCanada = userProductPriceDTO.getShippingTotalCanada();
				double shippingCanada = 0d;
				if (shippingTotalCanada != null || !shippingTotalCanada.matches("^\\s*$")) {
					shippingCanada = Double.parseDouble(shippingTotalCanada);
					shippingTotalCanada = "$" + format(shippingCanada, "#,###.00", "en", "US");
					
					if(userDTO!=null && userDTO.getCurrencyId()!=null && userDTO.getCurrencyId()!=1) {
						if(userDTO.getCurrencySymbol()!=null && userDTO.getCurrencySymbol().toUpperCase().equals("USD")) {
							shippingTotalCanada = "USD $" + format(shippingCanada, "#,###.00", "en", "US");
						} else {
							shippingTotalCanada = userDTO.getCurrencySymbol() + format(shippingCanada, "#,###.00", "en", "US");
						}
					}
				} else {
					shippingTotalCanada = "";
				}
			}			
			
		} catch(ServiceException e) {
			log.debug("Service Error when loading file");
			addActionError(getText("loyauty.error.common.service"));
		} catch (Exception e) {
			addActionError(getText("loyauty.error.common.service"));
		}		
		return SUCCESS;
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
