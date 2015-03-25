package com.loyauty.service.search.autocompleter.task;

import java.util.TimerTask;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;

/**
 * A timer task to be scheduled to fetch data from the DB on a predefined
 * interval.
 * 
 * 
 */
public class SearchAutocompleterTask extends TimerTask {

	@Override
	public void run() {
		
			ServiceLocator locator = ServiceLocator.getInstance();
			try {
				locator.getSearchService().loadAutocompleterData();
			} catch (ServiceLocatorException sle) {
				// TODO Auto-generated catch block
				sle.printStackTrace();
			}
		
	}

}
