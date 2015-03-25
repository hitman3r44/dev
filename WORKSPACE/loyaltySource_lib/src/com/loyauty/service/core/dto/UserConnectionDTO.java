package com.loyauty.service.core.dto;


import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class UserConnectionDTO extends BasicDTO{
	private static final long serialVersionUID = -2080844844477915037L;

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
	private  String RemoteClientInvoiceFolder;
	private  String invoiceConfirmFolder;
	private  String clientOrdersFileMovedFolder;
	
}
