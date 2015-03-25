/**
 * 
 */
package com.loyauty.web.struts.json.results;

import java.util.List;

/**
 * @author Arnaud
 *
 * This object will be handle by the struts2jsonresult plugin ({@link https://cwiki.apache.org/S2PLUGINS/another-json-result-typestruts2jsonresult.html}).
 * It is a simple POJO which will be serialised in Json.
 * This Json structure is understandable by the js datatable plugin used in the front end.
 * 
 */
public class DatatableJsonResult<T> {
	/**
	 * Total records, before filtering (i.e. the total number of records in the database)
	 */
	public int iTotalRecords;
	/**
	 * Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned in this result set)
	 */
	public int iTotalDisplayRecords;
	/**
	 * An unaltered copy of sEcho sent from the client side. This parameter <b>will change with each draw</b> (it is basically a draw count) - so it is important that this is implemented. Note that it <b>strongly recommended for security reasons</b> that you 'cast' this parameter to an integer in order to prevent Cross Site Scripting (XSS) attacks.
	 */
	public int sEcho;
	/**
	 * An unaltered copy of sEcho sent from the client side. This parameter will change with each draw (it is basically a draw count) - so it is important that this is implemented. Note that it strongly recommended for security reasons that you 'cast' this parameter to an integer in order to prevent Cross Site Scripting (XSS) attacks.
	 */
	public String sColumns;
	/**
	 * The data in a 2D List
	 */
	public List<T> aaData;
}
