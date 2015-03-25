package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UserFileRecoveryDTO extends BasicDTO{
	private static final long serialVersionUID = 141491733281039289L;
	
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
	private Long   userId;
	private Integer fileTypeId;
	private String fileType;
	private String quantity;
	private String tagRoot;
	private String requiredDate;
	private String clientOtherNames;
	private String shippingCompany;
	private String clientPhoneZone;
	private String formatDate;
	private String notes;
	private Integer fileTypeIdConfirm;
	private Integer fileFormatIdComfirm;
	private String providedLsProductId;
	private String specialHandlingName;
	private Double specialHandlingFee;
	/* Added the below properties for Rideau.
	*/
	private Integer fileSeqShipping;
	private Integer fileSeqInvoice;
	
	//Currency
	private Long	currencyId;
	private String	currencySymbol;
	private Double	currencyRate;
	private Double 	currencyPrice;
	private Double 	currencyUnitPrice;
	private Double 	currencyTotalPrice;
	private Double 	currencyShippingPrice;
	
	//ETA
	//private Long	etaFileTypeId;
	private String	etaFieldName;
	private String	secondEtaFieldName;
	
}
