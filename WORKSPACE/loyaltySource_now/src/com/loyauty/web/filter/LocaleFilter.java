package com.loyauty.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.loyauty.web.util.LocaleUtilsWeb;;

/**
 * This filter is defined on all incoming request.
 * Its main role is to set user Locale in the session. 
 *  
 * @author Muthanna
 *
 */
public class LocaleFilter implements Filter {
	
	private static Logger log = Logger.getLogger(LocaleFilter.class);
		
	protected FilterConfig filterConfig = null;
	
	protected boolean detectUserBrowser;
	
    public void init(FilterConfig filterConfig) throws ServletException {
    	this.filterConfig = filterConfig;
    	
    	String detectUserBrowser = filterConfig.getInitParameter("detectUserBrowser");
    	if(detectUserBrowser != null &&	detectUserBrowser.trim().equals("true")){
			this.detectUserBrowser = true;
		}
    	
    	if(log.isInfoEnabled()){
    		log.info("Initializing locale filter with detectUserBrowser=" + detectUserBrowser);
    	}
    	
    }

    public void destroy() {
    	this.filterConfig = null;
    	
    	if(log.isInfoEnabled()){
			log.info("Destroying locale filter ...");
		}
    	
    }
    
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
    	    	
		HttpServletRequest req = (HttpServletRequest) request;
		LocaleUtilsWeb.handleLocale(req, detectUserBrowser);
		
		// Pass control on to the next filter
		chain.doFilter(request, response);

    }
   
}
