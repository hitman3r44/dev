package com.loyauty.service.core.dto;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.ProductStatus;

/**
 * Contains data for the product.
 */
@Data @ToString(callSuper=true)
public class ProductDTO extends BasicDTO{
		
	private static final long serialVersionUID = 1L;
	
	private Long selected;
	private String upc;
	private BrandDTO brand;
	private CategoryDTO category;
	private Long mainFilterTypeId;
	private String manufacturerProductId;
	private String loyaltyProductId;
	private CommonDTO nameEng;
	private CommonDTO nameFr;
	private ImageDTO image;
	private CommonDTO descriptionEng;
	private CommonDTO descriptionFr;
	private CommonDTO specificationEng;
	private CommonDTO specificationFr;
	private CommonDTO otherEng;
	private CommonDTO otherFr;
	private String msrp;
	private String cost;
	private String width;
	private String high;
	private String large;
	private String weight;
	private List<ProductModelDTO> manufactureProductList;
	private Date creationDate;
	private ProductStatus status;
	private String statusName;
	private String nameProduc;
	private String descriptiProduct;
	private String specificationProduct;
	private String otherProduct;
	private String priceProduct;  
	private String hrefName;
	private String localizedPriceProduct;
	private String note;	
	private List<ProductLinkDTO> linkList;	
	private Date discontinuedStartDate;
	private String loyaltyProductIdSub;
	private CommonDTO warrantyEng;
	private CommonDTO warrantyFr;
	private Long warrantyTranslationId;
	private Double discount;
	private Boolean wereWgtDimChanged;
	private Boolean consideredForXML;
	private String oldImageRealName;
	private Double stock;
	private String actualWidth;
	private String actualLength;
	private String actualHeight;
	private String actualWeight;
	private Long userId;
	private String css;
	
	private Double boxLength;
	private Double boxWidth;
	private Double boxHeight;
	private Double boxTotalWeight;
	
	private Double classification;
	private Double profit;
	private Double qtSold;

	//sale attributes
	private Double  qtMax;
	private Double  saleQt=0d;
	private Date    startDate;
	private Date    endDate;
	private Double  regularPrice;
	private Double  regularPercentProfit;
	private Double  regularPercentDiscount;
	private Boolean active=false;
	private String  messageForClient="";
	private String  saleNote="";
	private Long  	productSaleId;
	
	
	private Double salePrice; 
	private Double salePercentProfit;
	private Double salePercentDiscount;
	
	
	
	public ProductDTO(){}
        public static class Builder {
         
			// Required parameters
            private final Long id;
            private final BrandDTO brand;
            private final CategoryDTO categoryId;
            
            // Optional parameters - initialized to default values
            private Long mainFilterTypeId = new Long(0);
            private String manufacturerProductId = "";
            private String loyaltyProductId = "";
            private CommonDTO nameEng = null;
            private CommonDTO nameFr = null;
            private ImageDTO image = null;
            private CommonDTO descriptionEng = null;
            private CommonDTO descriptionFr = null;
            private CommonDTO specificationEng = null;
            private CommonDTO specificationFr = null;
        	private CommonDTO otherEng = null;
        	private CommonDTO otherFr = null;
            private String msrp = "";
            private String cost = "";
            private String width = "0";
            private String high = "0";
            private String large = "0";
            private String weight = "";
            private String actualWidth = "0";
        	private String actualHeight= "0";
        	private String actualLength = "0";
        	private String actualWeight = "";           
            private List<ProductModelDTO> manufactureProductList = null;
            private Date creationDate = null;
            private String nameProduc;
        	private String descriptiProduct;
        	private String specificationProduct;
        	private String otherProduct;    
        	private String priceProduct;
        	private String localizedPriceProduct;
        	private ProductStatus status;
        	private String statusName;        	
        	private String note;        	
        	private List<ProductLinkDTO> linkList;
        	private Date discontinuedStartDate = null;
        	private String loyaltyProductIdSub;
        	private CommonDTO warrantyEng;
        	private CommonDTO warrantyFr;
        	private Long warrantyTranslationId;
        	private Double discount;
        	private Boolean wereWgtDimChanged;
        	private Boolean consideredForXML;	
        	private String oldImageRealName;
            public Builder(Long Id, BrandDTO brand, CategoryDTO categoryId) {
        	this.id = Id;
        	this.brand = brand;
        	this.categoryId = categoryId;
            }
            
            public Builder mainFilterTypeId(Long val) { 
                mainFilterTypeId = val; 
                return this; 
            }
            public Builder manufacturerProductId(String val) { 
	        	manufacturerProductId = val; 
	        	return this; 
            }
            public Builder loyaltyProductId(String val) { 
	        	loyaltyProductId = val; 
	        	return this; 
            }
            public Builder nameEng(CommonDTO val) { 
	        	nameEng = val; 
	        	return this; 
            }
            public Builder nameFr(CommonDTO val) { 
	        	nameFr = val; 
	        	return this; 
            }
            public Builder descriptionEng(CommonDTO val) { 
	        	descriptionEng = val; 
	        	return this; 
            }
            public Builder descriptionFr(CommonDTO val) { 
	        	descriptionFr = val; 
	        	return this; 
            }
            public Builder specificationEng(CommonDTO val) { 
	        	specificationEng = val; 
	        	return this; 
            }
            public Builder specificationFr(CommonDTO val) { 
	        	specificationFr = val; 
	        	return this; 
            }
            public Builder otherEng(CommonDTO val) {
            	otherEng = val;
            	return this;
            }
            public Builder otherFr(CommonDTO val) {
            	otherFr = val;
            	return this;
            }
            public Builder image(ImageDTO val) { 
	        	image = val; 
	        	return this; 
            }
            public Builder msrp(String val) { 
	        	msrp = val; 
	        	return this; 
            }
            public Builder cost(String val) { 
	        	cost = val; 
	        	return this; 
            }
            public Builder weight(String val) { 
	        	weight = val; 
	        	return this; 
            }
            public Builder width(String val) { 
	        	width = val; 
	        	return this; 
            }
            public Builder high(String val) { 
	        	high = val; 
	        	return this; 
            }
            public Builder large(String val) { 
	        	large = val; 
	        	return this; 
            }
            public Builder actualWeight(String val) { 
            	actualWeight = val; 
	        	return this; 
            }
            public Builder actualWidth(String val) { 
            	actualWidth = val; 
	        	return this; 
            }
            public Builder actualHeight(String val) { 
            	actualHeight = val; 
	        	return this; 
            }
            public Builder actualLength(String val) { 
            	actualLength = val; 
	        	return this; 
            }
            public Builder manufactureProductList(List<ProductModelDTO> val) { 
	        	manufactureProductList = val; 
	        	return this; 
            }
            public Builder nameProduc(String val) {
            	nameProduc = val;
	            return this;
            }
            public Builder descriptiProduct(String val) {
            	descriptiProduct = val;
	            return this;
            }
            public Builder specificationProduct(String val) {
            	specificationProduct = val;
	            return this;
            }
            public Builder otherProduct(String val) {
            	otherProduct = val;
	            return this;
            }
            public Builder creationDate(Date val) {
	            creationDate = val;
	            return this;
            }            
            public Builder priceProduct(String val) {
            	priceProduct = val;
	            return this;
            }            
            public Builder localizedPriceProduct(String val) {
            	localizedPriceProduct = val;
	            return this;
            }            
            public Builder status(ProductStatus val) { 
	        	status = val; 
	        	return this; 
            }
            public Builder statusName(String val) { 
	        	statusName = val; 
	        	return this; 
            }            
            public Builder linkList(List<ProductLinkDTO> val) {
            	linkList = val;
            	return this;
            }            
            public Builder note(String val) {
            	note = val;
            	return this;
            }
            public Builder discontinuedStartDate(Date val) { 
            	discontinuedStartDate = val; 
	        	return this; 
            }
            public Builder loyaltyProductIdSub(String val) { 
            	loyaltyProductIdSub = val; 
	        	return this; 
            }
            public Builder warantyEng(CommonDTO val) {
            	warrantyEng = val;
            	return this;
            }            
            public Builder warantyFr(CommonDTO val) {
            	warrantyFr = val;
            	return this;
            }            
            public Builder warrantyTranslationId(Long val) {
            	warrantyTranslationId = val;
            	return this;
            }
            public Builder discount(Double val) {
            	discount = val;
            	return this;
            }
            public Builder wereWgtDimChanged(Boolean val) {
            	wereWgtDimChanged = val;
            	return this;
            }
            public Builder consideredForXML(Boolean val) {
            	consideredForXML = val;
            	return this;
            }
            public Builder oldImageIdBeforeUpdate(String val) {
            	oldImageRealName = val;
            	return this;
            }
            
            public ProductDTO build() {
            	return new ProductDTO(this);
            }
         }
	
        private ProductDTO(Builder builder) {
            setId(builder.id);
            brand = builder.brand;
            category = builder.categoryId;
            mainFilterTypeId = builder.mainFilterTypeId;
            manufacturerProductId = builder.manufacturerProductId;
            loyaltyProductId = builder.loyaltyProductId;
            nameEng = builder.nameEng;
            nameFr = builder.nameFr;
            image = builder.image;
            descriptionEng = builder.descriptionEng;
            descriptionFr = builder.descriptionFr;
            specificationEng = builder.specificationEng;
            specificationFr = builder.specificationFr;
            otherEng = builder.otherEng;
            otherFr = builder.otherFr;
            msrp = builder.msrp;
            cost = builder.cost;
            width = builder.width;
            high = builder.high;
            large = builder.large;
            weight = builder.weight;
            actualWeight =builder.actualWeight;
            actualLength=builder.actualLength;
            actualHeight=builder.actualHeight;
            actualWidth=builder.actualWidth;
            manufactureProductList = builder.manufactureProductList;
            creationDate = builder.creationDate;
            nameProduc = builder.nameProduc;
            descriptiProduct = builder.descriptiProduct;
            specificationProduct = builder.specificationProduct;
            otherProduct = builder.otherProduct;
            priceProduct = builder.priceProduct;
            localizedPriceProduct = builder.localizedPriceProduct;
            status = builder.status;
            statusName = builder.statusName;
            linkList = builder.linkList;
            note = builder.note;
        	discontinuedStartDate = builder.discontinuedStartDate;
        	loyaltyProductIdSub = builder.loyaltyProductIdSub; 
        	warrantyEng = builder.warrantyEng;
        	warrantyFr = builder.warrantyFr;       	
        	warrantyTranslationId = builder.warrantyTranslationId;
        	discount = builder.discount;
        	wereWgtDimChanged = builder.wereWgtDimChanged;
        	consideredForXML = builder.consideredForXML;
        	oldImageRealName = builder.oldImageRealName;
        }
        
        public static Comparator<ProductDTO> getComparator(int id){
    		Comparator<ProductDTO> comparator = CREATION_DATE_DESC;
    		switch (id) {
    		case 1:
    			comparator = ALPHABITICALLY_ENG_AZ;
    			break;
    		case 2:
    			comparator = ALPHABITICALLY_ENG_ZA;
    			break;
    		case 3:
    			comparator = ALPHABITICALLY_FR_AZ;
    			break;
    		case 4:
    			comparator = ALPHABITICALLY_FR_ZA;
    			break;
    		case 5:
    			comparator = CREATION_DATE_DESC;
    			break;	
    		case 6:
    			comparator = CREATION_DATE_ASC;
    			break;
    		case 7:
    			comparator = MSRP_DESC;
    			break;
    		case 8:
    			comparator = MSRP_ASC;
    			break;
    		case 9:
    			comparator = COST_DESC;
    			break;
    		case 10:
    			comparator = COST_ASC;
    			break;
    		case 11:
    			comparator = ALPHABITICALLY_BRAND_AZ;
    			break;
    		case 12:
    			comparator = DISCOUNT_DESC;
    			break;    
    		default:
    			break;
    		}    		
    		return comparator;
    	}
        
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> ALPHABITICALLY_ENG_AZ = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o1.getNameEng().compareTo(o2.getNameEng());
    		}
    		
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> ALPHABITICALLY_ENG_ZA = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o2.getNameEng().compareTo(o1.getNameEng());
    		}
    		
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> ALPHABITICALLY_FR_AZ = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o1.getNameFr().compareTo(o2.getNameFr());
    		}
    		
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> ALPHABITICALLY_FR_ZA = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o2.getNameFr().compareTo(o1.getNameFr());
    		}
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> CREATION_DATE_DESC = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o2.getCreationDate().compareTo(o1.getCreationDate());
    		}
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> CREATION_DATE_ASC = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			return o1.getCreationDate().compareTo(o2.getCreationDate());
    		}
    		
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> MSRP_DESC = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			    			
    			Double msrp1 = Double.parseDouble(o1.getMsrp());
    			Double msrp2 = Double.parseDouble(o2.getMsrp());    			
    			return msrp2.compareTo(msrp1);
    		}
    		
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> MSRP_ASC = new Comparator<ProductDTO>() {

    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			    			
    			Double msrp1 = Double.parseDouble(o1.getMsrp());
    			Double msrp2 = Double.parseDouble(o2.getMsrp());    			
    			return msrp1.compareTo(msrp2);
    		}
    		
    	};

    	/**
    	 * The following are the comparators we use to sort products by price, highest first
    	 */
    	public static final Comparator<ProductDTO> COST_DESC = new Comparator<ProductDTO>() {
    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			    			
				String o1Price = o1.getPriceProduct();
				String o2Price = o2.getPriceProduct();
				int outcome = 0;
				if (o1Price != null && !o1Price.matches("^\\s*$")) {
					Double cost1 = Double.parseDouble(o1Price);
					if (o2Price != null && !o2Price.matches("^\\s*$")) {
						Double cost2 = Double.parseDouble(o2Price);
						int costCompare = cost2.compareTo(cost1);
						if (costCompare == 0) {
							outcome = ALPHABITICALLY_BRAND_AZ.compare(o1, o2);
						}
						else {
							outcome = costCompare;
						}
					} else {
						outcome = -1;				
					}
				} else {
					outcome = 1;
				}
				return outcome;
    		}
    	};
    	
    	/**
    	 * The following are the comparators we use to sort products by price, lowest first
    	 */
    	public static final Comparator<ProductDTO> COST_ASC = new Comparator<ProductDTO>() {
    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			    			
    			String o1Price = o1.getPriceProduct();
				String o2Price = o2.getPriceProduct();
				int outcome = 0;
				if (o1Price != null && !o1Price.matches("^\\s*$")) {
					Double cost1 = Double.parseDouble(o1Price);
					if (o2Price != null && !o2Price.matches("^\\s*$")) {
						Double cost2 = Double.parseDouble(o2Price);
						int costCompare = cost1.compareTo(cost2);
						if (costCompare == 0) {
							outcome = ALPHABITICALLY_BRAND_AZ.compare(o1, o2);
						}
						else {
							outcome = costCompare;
						}
					} else {
						outcome = -1;				
					}
				} else {
					outcome = 1;
				}
				return outcome;
    		}
    	};    	
    	
    	/*
    	 * The following is the comparator we use to sort products by brand, alphabetically, with numbers first then letters.
		 * Leading numbers are compared naturally.
    	 */
    	public static final Comparator<ProductDTO> ALPHABITICALLY_BRAND_AZ = new Comparator<ProductDTO>() {
       		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {			
    			String o1BrandName = o1.getBrand().getName();
    			String o2BrandName = o2.getBrand().getName();
    			int brandCompare = o1BrandName.compareTo(o2BrandName);
    			if(brandCompare == 0) {
    				String o1ProdName = o1.getNameProduc().toLowerCase();
    				String o2ProdName = o2.getNameProduc().toLowerCase();
    				if (Character.isDigit(o1ProdName.charAt(0)) && Character.isDigit(o2ProdName.charAt(0))) {
    					Integer o1Number = Integer.parseInt(o1ProdName.split("\\D+")[0]);
    					Integer o2Number = Integer.parseInt(o2ProdName.split("\\D+")[0]);
    					if (o1Number != o2Number) {
    						return o1Number.compareTo(o2Number);
    					}
    				}
    				return (o1ProdName.compareTo(o2ProdName));
    			}
    			return brandCompare;
    		}
    	};
    	
    	/**
    	 * The following are the comparators we use to sort game search results.
    	 */
    	public static final Comparator<ProductDTO> DISCOUNT_DESC = new Comparator<ProductDTO>() {    		
    		@Override
    		public int compare(ProductDTO o1, ProductDTO o2) {
    			Double discount1 = o1.getDiscount();
    			Double discount2 = o2.getDiscount();
    			int compareToDiscountPct = discount2.compareTo(discount1);
    			int outcome = compareToDiscountPct;
    			if (compareToDiscountPct == 0) {
    				String price1 = o1.getPriceProduct();
    				String price2 = o2.getPriceProduct();
    				String msrp1 = o1.getMsrp();
    				String msrp2 = o2.getMsrp();
    				Double discount$1 = getDiscount$(price1, msrp1);
    				Double discount$2 = getDiscount$(price2, msrp2);
    				int compareToDiscount$ = discount$2.compareTo(discount$1);
    				outcome = compareToDiscount$;
    				if (compareToDiscount$ == 0) {
    					String name1 = o1.getNameProduc();
    					String name2 = o2.getNameProduc();					
    					int compareToName = name1.compareTo(name2);
    					outcome = compareToName;
    					if (compareToName == 0) {
    						Long id1 = o1.getId();
    						Long id2 = o2.getId();
    						outcome = id1.compareTo(id2);
    					}
    				}
    			}
    			return outcome;
    		}
    		
    		private Double getDiscount$(String price, String msrp) {
				double priceVal = 0d;
				double msrpVal = 0d;
				double discountVal = 0d;
				if (price != null) {
					if (!price.matches("^\\s*$") && !price.equalsIgnoreCase("")) {
						priceVal = Double.parseDouble(price);		
					} else {
						priceVal = 0d;
					}
				}				
				if (msrp != null) {					
					if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {	
						msrpVal = Double.parseDouble(msrp);	
						discountVal = msrpVal - priceVal;
					}
				}
				return discountVal;
    		}
    	};
}