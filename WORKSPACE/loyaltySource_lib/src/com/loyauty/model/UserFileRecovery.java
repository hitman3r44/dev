package com.loyauty.model;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UserFileRecovery  extends AbstractEntity{

	  private Long id ;
	  private String productOrderNumber;
	  private String clientOrderNumber;
	  private String cstProductNumber;
	  private String clientProductNumber;
	  private String productOrderDate;
	  private String clientNumber;
	  private String clientOtherId;
	  private String clientFirstName;
	  private String clientLastName;
	  private String clientStreet;
	  private String clientOtherStreet;
	  private String clientCity;
	  private String clientPostalCode;
	  private String clientProvince;
	  private String clientPhone;
	  private String clientEmail;
	  private String lsProductID;
	  private String productDescription;
	  private String unitPrice;
	  private String companyHeader;
	  private Long 	 userId;
	  private Integer fileTypeId;
	  private String fileType;
	  private String quantity;
	  private String tagRoot;
	  private String shippingCompany;

	  private String requiredDate;
	  private String clientOtherNames;
	  private String clientPhoneZone;
	  private String formatDate;
	  private String notes;
	  private Integer fileTypeIdConfirm;
	  private Integer fileFormatIdComfirm;
	  private String providedLsProductId;
	  //Special Handling
	  private String specialHandlingName;
	  private Double specialHandlingFee;
	  /* Added the below properties for Rideau.
	   */
	  private String orderFileInfo;
	  private Integer fileSeqShipping;
	  private Integer fileSeqInvoice;
	  
	  //Currency
	  private Long		currencyId;
	  private String	currencySymbol;
	  private Double	currencyRate;
	  private Double 	currencyPrice;
	  private Double 	currencyUnitPrice;
	  private Double 	currencyTotalPrice;
	  private Double 	currencyShippingPrice;
	  
	  //ETA
	  //private Long		etaFileTypeId;
	  private String	etaFieldName;
	  private String	secondEtaFieldName;

}
