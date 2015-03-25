package com.loyauty.model;


import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class UserConnection extends AbstractEntity{
	private static final long serialVersionUID = 8776016384577112917L;
	
	private  String userLogin;
	private  String host;
	private  Integer port;
	private  String userName;
	private  String password;
	private  String remoteFolder;
	private  Long userId;
	private  String protocol;
	private  String ordersFolder;
	private  String ordersConfirmFolder;
	private  Long userSendingId;
	private  String email1;
	private  String email2;
	private  String clientShipmentsFolder;
	// added columns for invoice generation
	private  String remoteClientInvoiceFolder;
	private  String invoiceConfirmFolder;
	private  String clientOrdersFileMovedFolder;
}
