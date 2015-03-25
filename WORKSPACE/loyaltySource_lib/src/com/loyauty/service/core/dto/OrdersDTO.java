package com.loyauty.service.core.dto;

import java.util.ArrayList;
import java.util.Date;

import com.loyauty.model.OrdersRows;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class OrdersDTO extends  BasicDTO{
	private static final long serialVersionUID = -4362825927629396152L;
	private String 	cssRow="";
	private Long 	showRowShipping=0L;
	private Long 	showOnlyEditNote=0L;
	private Long 	count;
	private Boolean toUpdate=false;
	private Boolean manOrder=false;
	private Boolean duplicate=false;
	private Long 	infoMissing=0L;
	private Long 	saved=0L;
	private Boolean print;
	private String 	cssPrice;
	private String 	cssStyle;
	private String 	backgroundColor="";
	private Integer index=0;
	private Long   	clientProfileId;
	private Long  	userId;
	private String 	userLogin;
	private String 	lsOrderId;
	private String 	companyHeader;
	private String 	productOrderNumber;//poNumber
	private String	 clientOrderNumber;
	private Date 	productOrderDate; //poDate
	private Date 	requiredDate;
	private String	clientNumber;//clientNumber
	private String  clientOtherId;
	private String 	clientProductNumber;// code product given 
	private String 	clientFirstName;//clientFirstName 
	private String 	clientLastName; //clientLastName
	private String 	clientOtherNames;
	private String 	clientStreet; //clientAdress
	private String 	clientOtherStreet;//clientAdressOther
	private String 	clientCity;//clientCity
	private Double  quantityOriginal; // we use this variable to calculate quantities of products duplicated
	private String 	clientPostalCode;//clientPostalCode
	private String 	clientProvince;//clientProvince	
	private Long 	provinceNotFound;//clientProvince	
	private String 	clientPhone;//clientPhone
	private String 	clientEmail;//clientEmail	
	//private String  orderFileName;
	private String  orderFileInfo; //for rideau
	private Date 	creationDate;
	private Date    invoicedDate;
	//Special Handling
	private String specialHandlingName;
	private Double specialHandlingFee;
	private Double totalPrice;

	private ArrayList<OrdersRows> rowsList=new ArrayList<OrdersRows>();

	//rows info
	private String 	notes;
	private String 	cstProductNumber;
	private Double 	unitPrice;
	private String 	shippingCompany;
	private Date 	shippedDate;
	private String 	trackingNumber;
	private Double 	shippingPrice;
	private Double 	shippingFee;
	private String 	billed;
	private Double 	quantity;
	private Long 	productId;
	private String 	status;
	private String 	productDescription;
	private Double 	stock;
	private String 	lsProductID;
	private String  providedLsProductId; //ls_product_id provided by client
	private Double 	lsPrice;
	private Long 	orderId;
	
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
	
	private String notation="nothing";
	
	//ETA  secondEtaFieldName  secondEtaFieldValue
	private String etaFieldName;
	private String etaFieldValue;
	
	private String secondEtaFieldName;
	private String secondEtaFieldValue;
	
}
