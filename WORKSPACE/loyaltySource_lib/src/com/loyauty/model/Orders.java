package com.loyauty.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class Orders  extends AbstractEntity{
	private Boolean toUpdate;
	private Boolean duplicate=false;
	private Boolean manOrder=false; 
	private Long    toInsert=0L;
	private Long    count;
	private Long    clientProfileId;
	private Long    userId;
	private String  userLogin;
	private String  lsOrderId;
	private String  providedLsProductId; //ls_product_id provided by client
	private String  productOrderNumber;
	private String  clientOrderNumber;
	private String  clientProductNumber;
	private String  clientFirstName;
	private String  clientLastName;
	private String  clientOtherNames;
	private String  clientNumber;
	private String  clientOtherId;
	private String  clientStreet;
	private String  clientOtherStreet;
	private String  clientCity; 
	private String  clientProvince;
	private String  clientPostalCode; 
	private String  clientPhone; 
	private String  clientEmail; 
	private String  orderFileInfo; //for Rideau changed form orderFileName
	private Date    creationDate;
	private Date    productOrderDate;
	private Date    requiredDate;
	private Date    invoicedDate;
	
	//Special Handling
	private String specialHandlingName;
	private Double specialHandlingFee;
	private Double totalPrice;
	
	private String  notes;
	private String  cstProductNumber;
	private Double  unitPrice;
	private String  shippingCompany;
	private String 	companyHeader;
	private Date    shippedDate;
	private String  trackingNumber;
	private Double  shippingPrice;
	private Double  shippingFee;
	private String  billed;
	private Double  quantity;
	private Double  quantityOriginal; 
	private Long    productId;
	private String  status;
	private String  productDescription;
	private Double  stock;
	private String  lsProductID;
	private Double  lsPrice;
	private Long    orderId;
	
	//Currency
	private Long	currencyId;
	private String	currencySymbol;
	private Double	currencyRate;
	private Double 	currencyPrice;
	private Double 	currencyUnitPrice;
	private Double 	currencyTotalPrice;
	private Double 	currencyShippingPrice;
	
	//shipping_insurance_multiplier
	private Double shippingInsuranceMultiplier;
	
	private ArrayList<OrdersRows> rowsList=new ArrayList<OrdersRows>();
	
	//ETA
	private String etaFieldName;
	private String etaFieldValue;
	
	private String secondEtaFieldName;  
	private String secondEtaFieldValue;
	
	
}
