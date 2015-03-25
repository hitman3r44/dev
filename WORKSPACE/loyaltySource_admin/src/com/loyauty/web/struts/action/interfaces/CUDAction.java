/**
 * 
 */
package com.loyauty.web.struts.action.interfaces;

import com.loyauty.exception.ServiceException;

/**
 * @author Arnaud
 *
 */
public interface CUDAction {
	String create() throws ServiceException;
	String update();
	String delete();
}
