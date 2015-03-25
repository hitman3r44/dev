package com.loyauty.service.core.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)

public class OrdersPrintDTO  extends BasicDTO{
	private static final long serialVersionUID = 5122743319086767803L;

	private String productOrderDate="";
	private String productOrderNumber="";
	private String clientLastName="";
	private String clientFirstName="";
	private String clientStreet="";
	private String clientOtherStreet="";
	private String clientCity="";
	private String clientProvince="";
	private String clientPostalCode="";
	private String clientPhone="";
	private String clientEmail="";
	private String lsProductID="";
	private String productDescription="";
	private String quantity="";
	private String unitPrice="";
	private String companyHeader="";
	private String cstProductNumber="";
	private String clientNumber="";
	private String clientOtherId="";
	private String clientOrderNumber="";
	private String notes="";
	private String shippingCompany="";
	private String requiredDate="";
	private String clientOtherNames="";
	private String clientPhoneZone="";
	private String lsOrderId="";
	private String specialHandlingName="";
	private String specialHandlingFee="";
	private String totalPrice="";

}
