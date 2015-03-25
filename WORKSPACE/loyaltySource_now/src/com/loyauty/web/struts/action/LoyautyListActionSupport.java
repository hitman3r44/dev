package com.loyauty.web.struts.action;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;



@SuppressWarnings("serial")
public class LoyautyListActionSupport<T> extends LoyautyActionWeb {
	
	@Getter @Setter
	private Map<String, T> result;
	
}