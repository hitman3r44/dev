package com.loyauty.web.struts.action;

import lombok.Getter;
import lombok.Setter;


import com.loyauty.web.exception.LoyautyAjaxActionException;
import com.loyauty.web.struts.json.results.DatatableJsonResult;

/**
 * @author Arnaud
 *
 */
public class LoyautyDatatableActionSupport extends LoyautyAction {
	
	private static final String THE_GIVEN_S_ECHO_TOKEN_SHOULD_BE_AN_INTEGER = "The given sEcho token should be an Integer";
	@Getter @Setter
	private int iDisplayStart;
	@Getter @Setter
	private int iDisplayLength;
	@Getter @Setter
	private int iColumns;
	@Getter @Setter
	private String sSearch;
	@Getter @Setter
	private boolean bEscapeRegex;
	@Getter @Setter
	private int iSortingCols;
	@Getter @Setter
	private String sEcho;
	@Getter @Setter
	private DatatableJsonResult result;
	
	public void addSEchoTokenToResult() throws LoyautyAjaxActionException {
		if(result != null) {
			try {
				result.sEcho=Integer.parseInt(getSEcho());
			} catch (NumberFormatException nfe) {
				log.error(THE_GIVEN_S_ECHO_TOKEN_SHOULD_BE_AN_INTEGER);
				throw(new LoyautyAjaxActionException(THE_GIVEN_S_ECHO_TOKEN_SHOULD_BE_AN_INTEGER, nfe));
			}
		}
	}
	
}
