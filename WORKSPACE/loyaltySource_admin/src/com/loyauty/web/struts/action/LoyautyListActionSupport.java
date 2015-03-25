package com.loyauty.web.struts.action;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;



@SuppressWarnings("serial")
public class LoyautyListActionSupport<T> extends LoyautyAction {
	
	@Getter @Setter
	private T result;
	
}