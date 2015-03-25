package com.loyauty.service.core.dto;

import java.util.ArrayList;
import java.util.Date;

import com.loyauty.model.OrdersRows;

import lombok.Data;
import lombok.ToString;


@Data @ToString(callSuper=true)
public class UserFileDataRecoveryDTO extends  BasicDTO{
	private static final long serialVersionUID = -4208295209541315339L;
	
	private Long userId;
	private String lsOrderId;
	private String companyHeader;
	private String productOrderNumber;//poNumber
	private String clientOrderNumber;
	private String cstProductNumber;
	private String clientProductNumber;
	private Date productOrderDate; //poDate
	private Double quantity;//quantity
	private String lsProductID;//productId
	private String productDescription;//description	
	private Double unitPrice; //price
	private String clientNumber;//clientNumber
	private String clientOtherId;
	private String clientFirstName;//clientFirstName
	private String clientLastName; //clientLastName
	private String clientOtherNames;
	private String clientStreet; //clientAdress
	private String clientOtherStreet;//clientAdressOther
	private String clientCity;//clientCity
	private String clientPostalCode;//clientPostalCode
	private String clientProvince;//clientProvince	
	private String clientPhone;//clientPhone
	private String clientEmail;//clientEmail	
	private Date   creationDate;
	private Date   requiredDate;
	private String shippingCompany;
	private String notes;
	private String orderFileInfo;//order_file_info
	private String specialHandlingName;
	private Double specialHandlingFee;
}
