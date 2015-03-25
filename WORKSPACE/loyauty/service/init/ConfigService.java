package com.loyauty.service.init;

import com.loyauty.exception.InitializationException;
import com.loyauty.service.Service;


/**
 * Configuration service interface that is used whenever a client desires
 * accessing GameJab configuration properties.
 *  
 *
 */
public interface ConfigService extends Service{
	
	/**
	 * Initializes the config service. 
	 * @throws InitializationException
	 */
	void initialize() throws InitializationException;
	
	/**
	 * Shuts down the config service
	 */
	void shutdown();
	
	/**
	 * Method to get the location where we store all javascript scripts for loyauty
	 */
	String getWebScriptsLocation();
	
	/**
	 * Method to get the location where we store all css files for loyauty
	 */
	String getWebCssLocation();
	
	/**
	 * Method to get the location where we store all images files for loyauty
	 */
	String getWebImagesLocation();
	
	/**
	 * Method to get the location where we store all media files for loyauty (images)
	 */
	String getWebMediaLocation();
	/**
	 * Method to get the location physic where we store all media files for loyauty (images)
	 */
	String getPathWebProductLocation();
	String getPathWebProductThumbnailLocation();
	String getPathWebProductMinithumbLocation();
	String getPathWebBrandLocation();	
	String getPathWebBrandThumbnailLocation();
	String getPathWebBrandMinithumbLocation();
	String getPathTemporaryLocation();
	
	//Mails
	String getMailFromWebmaster();
	String[] getMailDefaultDebugger();
	String[] getMailGamejabSupport();
	String[] getMailMarketingSupport();
	String[] getMailMediaSupport();
	String[] getMailOtherSupport();
	String getMailSMTP();
	
	/**
	 * Tells whether to collect cache statistics on shut down.
	 * @return
	 */
	boolean isCacheStatisticsEnabled();
	
	/**
	 * Determines the default number of search results.
	 * @return
	 */
	int getSearchNumberOfResults();
	
	/**
	 * Returns the configurator of the search autocompleter.
	 * @return
	 */
	//AutocompleterConfigurator getSearchConfigurator();

	String getSearchIndexGamesSolrs();	

	String getSolrsOnlygameNameSearch();
	
	String getSearchSynonymsSolrs();	
	
	String getSorlsAutocompleter();
	
	String getSorlsCloud();
	
	/**
	 * Method to get the location where we store all media files for loyauty (covers, screenshots, etc ...)
	 */
	String getLocalMediaLocation();

	
	
}
