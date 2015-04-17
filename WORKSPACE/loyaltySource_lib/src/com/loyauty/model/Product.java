package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserProductStatus;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class Product extends AbstractEntity{
		  
	private String upc;
	private Translation name;
	private Translation description;
	private Image image;
	private ProductStatus status;
	private String msrp;
	private String cost;
	private Brand brand;
	private String loyaltySourceProductId;
	private String productWidth;
	private String productHigh;
	private String productLong;
	private String weight;
	private Date creationDate;
	private Long typeId;
	private Long valueSpecificationId;
	private Long userId;
	private String userPrice;
	private Category category;
	private Translation specification;
	private List<ProductModelNumber> modelNumberList;
	private List<User> activeClientsList;	
	private Integer priceType;
	private Translation other;
	private UserProductStatus userProductStatus;
	
	private String link;
	private List<ProductLink> linkList;
	private String note;
	private Date discontinuedStartDate;
	private String loyaltyProductIdSub;
	
	private Translation warranty;
	
	private String length;
	private String width;
	private String height;
	
	private Boolean wereWgtDimChanged;
	private Boolean consideredForXML;
	private String oldImageRealName;
	
	private Double stock;
	//Added by Sumit Sarkar
	private Double orderAmount;

	private String actualWidth;
	private String actualLength;
	private String actualHeight;
	private String actualWeight;
	
	private Double boxLength;
	private Double boxWidth;
	private Double boxHeight;
	private Double boxTotalWeight;

	private String descriptiProduct;
	private Double classification;
	private String discount;
	private String profit;
	private Double qtSold;

	//sale attributes
	private Double  qtMax;
	private Double  saleQt;
	private Date    startDate;
	private Date    endDate;
	private Double  regularPrice;
	private Double  regularPercentProfit;
	private Double  regularPercentDiscount;
	private Boolean active;
	private String  messageForClient;
	private String  saleNote;
	private Long productSaleId;
	
	private Double salePrice; 
	private Double salePercentProfit;
	private Double salePercentDiscount;
	
	
	
}
