/**
 * 
 */
package com.loyauty.web.struts.action.user;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang.StringUtils;

import com.loyauty.exception.ServiceLocatorException;

import com.loyauty.web.struts.action.LoyautyAction;
import com.loyauty.web.util.LocaleUtils;

/**
 * @author Arnaud
 * This class is in charge of Switching language     
 */
public class SwitchLang extends LoyautyAction  {
	
	private static final long serialVersionUID = 7640068153357889448L;

	public SwitchLang() throws ServiceLocatorException {}
	
	@Getter @Setter
	private String url;
	@Getter @Setter
	private String lang;
	
	@Override
	public String execute() throws Exception {
		// set a new language for this session 
		LocaleUtils.setSessionLocale(request, lang);
		
		// set the url where this action come from 
		String referer = request.getHeader("referer");
		if (StringUtils.isNotBlank(referer)) {
			setUrl(referer);
			return getSuccessResult();
		} else {
			// request there is no referer in this request send user toward homepage
			// this case won't appear but we don't know
			return "homePage";
		}
	}

	
}
