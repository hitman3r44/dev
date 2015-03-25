package com.loyauty.web.struts.action.errors;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.web.struts.action.LoyautyAction;

public class Error   extends LoyautyAction{
	private static final long serialVersionUID = -6070247732759269809L;

	@Getter @Setter
	private String errorTitle="";
	@Getter @Setter
	private String errorMessage="";
	@Getter @Setter
	private Integer err;
	@Override  
	public String execute() throws Exception {	
		//HttpSession session = request.getSession(true);
		try{
			//trait error here
			if(err==null)err=0;
			switch (err) {
			case 400:
				errorTitle="Bad Request";
				errorMessage="The request cannot be fulfilled due to bad syntax";
				break;
			case 401:
				errorTitle="Unauthorized";
				errorMessage="The request was a legal request, but the server is refusing to respond to it. For use when authentication is possible but has failed or not yet been provided";
				break;
			case 402:
				errorTitle="Payment Required";
				errorMessage="Reserved for future use";
				break;
			case 403:
				errorTitle="Forbidden";
				errorMessage="The request was a legal request, but the server is refusing to respond to it";
				break;
			case 404:
				errorTitle="Source Not Found";
				errorMessage="The requested page could not be found but may be available again in the future";
				break;
			case 405:
				errorTitle="Method Not Allowed";
				errorMessage="A request was made of a page using a request method not supported by that page";
				break;
			case 406:
				errorTitle="Not Acceptable";
				errorMessage="The server can only generate a response that is not accepted by the client ";
				break;
			case 407:
				errorTitle="Proxy Authentication Required";
				errorMessage="The client must first authenticate itself with the proxy ";
				break;
			case 408:
				errorTitle="Request Timeout";
				errorMessage="The server timed out waiting for the request ";
				break;
			case 409:
				errorTitle="Conflict";
				errorMessage="The request could not be completed because of a conflict in the request";
				break;
			case 410:
				errorTitle="Gone";
				errorMessage="The requested page is no longer available";
				break;
			case 411:
				errorTitle="Length Required";
				errorMessage="The Content-Length is not defined. The server will not accept the request without it";
				break;
			case 412:
				errorTitle="Precondition Failed";
				errorMessage="The precondition given in the request evaluated to false by the server";
				break;
			case 413:
				errorTitle="Request Entity Too Large";
				errorMessage="The server will not accept the request, because the request entity is too large ";
				break;
			case 414:
				errorTitle="Request-URI Too Long";
				errorMessage="The server will not accept the request, because the URL is too long. Occurs when you convert a POST request to a GET request with a long query information";
				break;
			case 415:
				errorTitle="Unsupported Media Type";
				errorMessage="The server will not accept the request, because the media type is not supported";
				break;
			case 416:
				errorTitle="Requested Range Not Satisfiable";
				errorMessage="The client has asked for a portion of the file, but the server cannot supply that portion";
				break;
			case 417:
				errorTitle="Expectation Failed";
				errorMessage="The server cannot meet the requirements of the Expect request-header field";
				break;
			case 500:
				errorTitle="Internal Server Error";
				errorMessage="A generic error message, given when no more specific message is suitable";
				break;
			case 501:
				errorTitle="Not Implemented";
				errorMessage="The server either does not recognize the request method, or it lacks the ability to fulfill the request";
				break;
			case 502:
				errorTitle="Bad Gateway";
				errorMessage="The server was acting as a gateway or proxy and received an invalid response from the upstream server";
				break;
			case 503:
				errorTitle="Service Unavailable";
				errorMessage="The server is currently unavailable (overloaded or down) ";
				break;
			case 504:
				errorTitle="Gateway Timeout";
				errorMessage="The server was acting as a gateway or proxy and did not receive a timely response from the upstream server";
				break;
			case 505:
				errorTitle="HTTP Version Not Supported";
				errorMessage="The server does not support the HTTP protocol version used in the request";
				break;
			case 511:
				errorTitle="Network Authentication Required";
				errorMessage="The client needs to authenticate to gain network access";
				break;
			default:
				errorTitle="Request not allow or page not found";
				errorMessage="The server will not accept the request or the requested page could not be found";
				break;
			}
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
		
	}

	
	

}
