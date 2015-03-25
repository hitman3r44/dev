package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class OrdersRows extends AbstractEntity{

	/*-------------------------------------------------
	<0>:no thing, <1>:generate lsOrderId and insert,
	<2>:update, <3>:delete, <4>:duplicate
	---------------------------------------------------*/
	private String cssQuantity="";
	private String cssPrice="";
	private String css="";
	private String icon="";
	private Integer index=0;
	private Integer toDelete=0;
	private Long   orderId;
	private String lsOrderId;
	private String notes;
	private Date requiredDate;
	private String cstProductNumber;
	private Double unitPrice;
	private Double lsPrice;
	private String shippingCompany;
	private Date   shippedDate;
	private String trackingNumber;
	private Double shippingPrice;
	private Double shippingFee;
	private String billed;
	private Double quantity;
	private Double quantityOriginal;
	private Double quantityToSplit;
	private Long productId;
	private String status;
	private String productDescription;//description	
	private String lsProductID;//lsProductID
	private String  providedLsProductId; //ls_product_id provided by client
	private String clientProductNumber;//clientProductNumber
	private Double stock;
	
	//Currency
	private Long	currencyId;
	private String	currencySymbol;
	private Double	currencyRate;
	private Double 	currencyPrice;
	private Double 	currencyUnitPrice;
	private Double 	currencyShippingPrice;
	//private Double 	currencyShippingFee;
	
}
