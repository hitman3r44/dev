package com.loyauty.web.struts.interceptor;

import java.util.Map;

//import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class AuthenticationInterceptor implements Interceptor{

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		
		UserSessionDTO user =(UserSessionDTO) session.get(WebConstants.USER);

        if ( user == null ) {           	
        	session.put(WebConstants.MESSAGE_INFO, "You have lost your session. Please login again...");
        	return "authentification";            
        }
        else {
            return actionInvocation.invoke();
        }        
		
	}
	

}
