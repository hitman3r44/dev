package com.loyauty.web.struts.json.results;

import java.util.Map;
import java.util.TreeMap;

import lombok.Data;

@Data
public class PagingZZ {
	private int currentPage = 1;
	private Map<Integer,Integer> framePages;
	private boolean leftNavEnable = false;
	private boolean rightNavEnable = false;
	
	public PagingZZ ( int start, int total,
					int pageSize,   /*number of rows per page*/
					int window )	/*page window - number of visible pagers per page*/ 
	{ 
		if (total == 0 || pageSize <= 0) { return ; }   // no links 
		
		double pages = Math.ceil((double)total / pageSize );
		setFramePages(new TreeMap<Integer,Integer>());
		
		int current_page = (start / pageSize ) + 1;
		setCurrentPage(current_page);
		//numeric value of current page ex. if start is 51 : 51/50 = 1 + 1 = 2
		
		int left_link_count = ((current_page - 1) > (window / 2))? (window / 2 - 1) : (current_page - 1);
		int pageNo = current_page - left_link_count;
		
		if (current_page > 1) {    // show first page and if there are more, links on the left
			setLeftNavEnable(true);
		}
		
		for (int i = 0; i < window-1; i++) {
			if (pageNo > pages) {
				break;
			} else if (pageNo == current_page) {
				getFramePages().put(pageNo, (pageNo-1) * pageSize); // result += "*" + pageNo + "*";
			} else {
				getFramePages().put(pageNo, (pageNo-1) * pageSize); // result += "-"+pageNo+"-";
			}
			pageNo++;
		}
		
		if ((double)current_page < pages) {
			setRightNavEnable(true); 
		}
	}
}