package com.loyauty.service.init;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import com.loyauty.exception.CacheException;
import com.loyauty.exception.InitializationException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.dto.ItemMapDTO;
import com.loyauty.service.search.autocompleter.core.AutocompleterConfigurator;
import com.loyauty.util.io.PropertiesFileWrapper;

/**
 * Main configuration service on LoyaltySource.
 * The service loads application-wide configuration from properties files and
 * exposes a unique entry point for all other services.
 * 
 * This service should be initialized on application startup since other subsystems 
 * functionalities depend on it.
 *
 */
public class ConfigServiceImpl extends ServiceImpl implements ConfigService{
	
	private static final Logger log = Logger.getLogger(ConfigServiceImpl.class);
		
	/**
	 * General properties file name.
	 */
	private static final String LOYALTY_GENERAL_CONFIG_FILE = "/loyauty-general.properties";
	
	/* Keys in  general properties file */
	private static final String CACHE_STATISTICS_ENABLED = "loyauty.cache.cache_statistics_enabled";
	
	private static final String SEARCH_NUMBER_OF_RESULTS = "loyauty.search.search_number_of_results";
	
	private static final String WEB_RESOURCE_URL_IMAGES_KEY = "loyauty.config.web.resource.url.images";	
	private static final String WEB_RESOURCE_URL_MEDIA_KEY = "loyauty.config.web.resource.url.media";
	private static final String WEB_RESOURCE_URL_CSS_KEY = "loyauty.config.web.resource.url.css";
	private static final String WEB_RESOURCE_URL_SCRIPTS_KEY = "loyauty.config.web.resource.url.scripts";
	private static final String WEB_RESOURCE_PATH_PRODUCT_KEY = "loyauty.config.web.resource.path.product";
	private static final String WEB_RESOURCE_PATH_BRAND_KEY = "loyauty.config.web.resource.path.brand";
	private static final String WEB_RESOURCE_PATH_TEMPORARY_KEY = "loyauty.config.web.resource.path.temporary";
	
	private static final String SEARCH_INDEX_GAMES_SOLRS_KEY = "loyauty.config.solrs.search.indexgames";	
	private static final String SORLS_ONLY_GAMENAME_SEARCH_KEY = "loyauty.config.solrs.search.only.gamename";	
	private static final String SEARCH_SYNONYMS_SOLRS_KEY = "loyauty.config.solrs.search.synonyms";	
	private static final String SORLS_AUTOCOMPLETER_KEY	= "loyauty.config.solrs.search.autocompleter";
	private static final String SORLS_CLOUD_KEY	= "loyauty.config.solrs.search.cloud";

	private static final String WEB_RESOURCE_PATH_PRODUCT_LARGE_KEY = "loyauty.config.web.resource.path.product.large";
	private static final String WEB_RESOURCE_PATH_PRODUCT_THUMBNAIL_KEY = "loyauty.config.web.resource.path.product.thumbnail";
	private static final String WEB_RESOURCE_PATH_PRODUCT_MINITHUMB_KEY = "loyauty.config.web.resource.path.product.minithumb";
	private static final String WEB_RESOURCE_PATH_BRAND_THUMBNAIL_KEY = "loyauty.config.web.resource.path.brand.thumbnail";
	private static final String WEB_RESOURCE_PATH_BRAND_MINITHUMB_KEY = "loyauty.config.web.resource.path.brand.minithumb";
	
	// Main Server media storage
	private static final String LOCAL_RESOURCE_URL_MEDIA_KEY = "loyauty.config.web.resource.local.url.media";

	
	// Properties mails
	public static String MAIL_FROMWEBMASTER_KEY   = "loyauty.Mail.fromWebmaster";
	public static String MAIL_DEFAULTDEBUGGER_KEY = "loyauty.Mail.defaultDebugger";
	public static String MAIL_MARKETING_KEY       = "loyauty.Mail.Marketing.support";
	public static String MAIL_SUPPORTGAMEJAB_KEY  = "loyauty.Mail.loyauty.support";
	public static String MAIL_MEDIA_INQUIRY_KEY   = "loyauty.Mail.Media.Inquiry.support";
	public static String MAIL_OTHER_KEY           = "loyauty.Mail.Other.support";
	public static String MAIL_SMTP  			  = "loyauty.Mail.SMTP";
	
	// Autocompleters
	private static final String AUTOCOMPLETER_NAME = "loyauty.search.autocompleter.main_search.name";
	private static final String AUTOCOMPLETER_NUMBER_OF_RESULTS = "loyauty.search.autocompleter.main_search.number_of_results";
	private static final String AUTOCOMPLETER_AMTCH_INFIX = "loyauty.search.autocompleter.main_search.match_infix";
	private static final String AUTOCOMPLETER_ORDER_BY_SCORE = "loyauty.search.autocompleter.main_search.order_by_score";
	private static final String AUTOCOMPLETER_CACHING_ENABLED = "loyauty.search.autocompleter.main_search.caching_enabled";
	private static final String AUTOCOMPLETER_QUERIES_TO_CACHE = "loyauty.search.autocompleter.main_search.queries_to_cache";
	private static final String AUTOCOMPLETER_QUERY_LENGTH_TO_CACHE = "loyauty.search.autocompleter.main_search.query_length_to_cache";	
	private static final String AUTOCOMPLETER_REFRESH_INTERVAL = "loyauty.search.autocompleter.main_search.refresh_interval";


	private static final ConfigService INSTANCE = new ConfigServiceImpl();
	
	/**
	 * A singleton config service
	 * @return
	 */
	public static ConfigService getInstance(){
		return INSTANCE;
	}
	
	private ConfigServiceImpl(){
		if (INSTANCE != null) {
			throw new IllegalStateException(this.getClass()	+ " instance is already created");
		}
	}
	
	@Getter
	@Setter(AccessLevel.PRIVATE)
	private boolean configServiceInitialized = false;
	
	@Getter(AccessLevel.PRIVATE)
	@Setter
	(AccessLevel.PRIVATE)
	private PropertiesFileWrapper loyaltyGeneralProps;
	
	@Synchronized 
	public void initialize() throws InitializationException{
		if(!isConfigServiceInitialized()){
		    try{

			PropertiesFileWrapper loyaltyGeneralProps  = new PropertiesFileWrapper(LOYALTY_GENERAL_CONFIG_FILE);			
			if(loyaltyGeneralProps.isValidProperties()){
				setLoyaltyGeneralProps(loyaltyGeneralProps);
			}
				/* Initialize caching service*/
				getServiceLocator().getCacheService().initialize();
				
				/* Initialize search service */
				getServiceLocator().getSearchService().initialize();
				
				/* Initialize search service */
				if(log.isInfoEnabled()){
					log.info("loyauty config service has been successfully initialized.");
				}
					setConfigServiceInitialized(true);
			}catch (Exception e) {
				setConfigServiceInitialized(false);
				throw new InitializationException("Something went wrong upon trying to initialize loyauty config service.", e);
			}
		}		
	}
	
	@Synchronized
	public void shutdown(){
		try{
			/* Shutdown caching service*/
			getServiceLocator().getCacheService().shutdown();
			
			/* Shutdown search service */
			//getServiceLocator().getSearchService().shutdown();
		}catch (CacheException ce) {	
			// TODO
		}catch (ServiceLocatorException sle) {
			// TODO
		}
	}
	
	@Override
	public String getWebCssLocation() {
		return getProperty(WEB_RESOURCE_URL_CSS_KEY);
	}

	@Override
	public String getWebImagesLocation() {
		return getProperty(WEB_RESOURCE_URL_IMAGES_KEY);
	}

	@Override
	public String getWebMediaLocation() {
		return getProperty(WEB_RESOURCE_URL_MEDIA_KEY);
	}
	
	@Override
	public String getPathWebProductLocation() {
		return getProperty(WEB_RESOURCE_PATH_PRODUCT_KEY);
	}
	
	@Override
	public String getPathWebProductThumbnailLocation() {
		return getProperty(WEB_RESOURCE_PATH_PRODUCT_THUMBNAIL_KEY);
	}
	
	@Override
	public String getPathWebProductMinithumbLocation() {
		return getProperty(WEB_RESOURCE_PATH_PRODUCT_MINITHUMB_KEY);
	}
	
	@Override
	public String getPathWebBrandLocation() {
		return getProperty(WEB_RESOURCE_PATH_BRAND_KEY);
	}
	
	@Override
	public String getPathWebBrandThumbnailLocation() {
		return getProperty(WEB_RESOURCE_PATH_BRAND_THUMBNAIL_KEY);
	}
	
	@Override
	public String getPathWebBrandMinithumbLocation() {
		return getProperty(WEB_RESOURCE_PATH_BRAND_MINITHUMB_KEY);
	}
	
	@Override
	public String getPathTemporaryLocation() {
		return getProperty(WEB_RESOURCE_PATH_TEMPORARY_KEY);
	}
	
	
	@Override
	public String getWebScriptsLocation() {
		return getProperty(WEB_RESOURCE_URL_SCRIPTS_KEY);
	}

	@Override
	public String getMailFromWebmaster() {
		return getProperty(MAIL_FROMWEBMASTER_KEY);
	}
	
	@Override
	public String[] getMailDefaultDebugger() {
		return getPropertyAsStringArray(MAIL_DEFAULTDEBUGGER_KEY);
	}

	@Override
	public String[] getMailMarketingSupport() {
		return getPropertyAsStringArray(MAIL_MARKETING_KEY);
	}
	
	@Override
	public String[] getMailGamejabSupport() {
		return getPropertyAsStringArray(MAIL_MARKETING_KEY);
	}
	
	@Override
	public String[] getMailMediaSupport() {
		return getPropertyAsStringArray(MAIL_MARKETING_KEY);
	}
	
	@Override
	public String[] getMailOtherSupport() {
		return getPropertyAsStringArray(MAIL_MARKETING_KEY);
	}
	
	@Override
	public String getPathWebProductLargeLocation() {
		return getProperty(WEB_RESOURCE_PATH_PRODUCT_LARGE_KEY);
	}	

	@Override
	public String getMailSMTP() {
		return getProperty(MAIL_SMTP);
	}	
	
	private String getProperty(String key) {
		if(isConfigServiceInitialized()){
			return getLoyaltyGeneralProps().getPropertyAsString(key);
		} else {
			log.error("Trying to get the config property key : " + key + " while config service is not initialized");
			return null;
		}
	}
	
	/**
	 * Returns property as String Array
	 * 
	 * @param name
	 * @return a String Array of properties
	 */
	public String[] getPropertyAsStringArray(String name) {
		List<String> list = null;
		String stringToSplit = getProperty(name);
		if (stringToSplit != null) {
			list = Arrays.asList(stringToSplit.split(","));
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i).trim());
			}
		}
		if (list != null) {
			return list.toArray(new String[list.size()]);
		} else {
			return new String[0];
		}

	}
	
	/**
	 * Returns true if the collecting cache statistics is enabled.
	 */
	@Override
	public boolean isCacheStatisticsEnabled(){		
		return getLoyaltyGeneralProps().getPropertyAsBoolean(CACHE_STATISTICS_ENABLED);
	}
	
	@Override
	public int getSearchNumberOfResults(){
		return getLoyaltyGeneralProps().getPropertyAsInteger(SEARCH_NUMBER_OF_RESULTS);
	}
	
	@Override
	public String getSearchIndexGamesSolrs() {
		return getProperty(SEARCH_INDEX_GAMES_SOLRS_KEY );
	}
	@Override
	public String getSearchSynonymsSolrs() {
		return getProperty(SEARCH_SYNONYMS_SOLRS_KEY );
	}	
	
	@Override
	public String getSolrsOnlygameNameSearch() {
		return getProperty(SORLS_ONLY_GAMENAME_SEARCH_KEY );
	}	
	
	@Override
	public String getSorlsAutocompleter() {
		return getProperty(SORLS_AUTOCOMPLETER_KEY );
	}	
	
	@Override
	public String getSorlsCloud() {
		return getProperty(SORLS_CLOUD_KEY );
	}

	@Override
	public String getLocalMediaLocation() {
		return getProperty(LOCAL_RESOURCE_URL_MEDIA_KEY );		
	}	
	
	@Override
	public AutocompleterConfigurator getSearchConfigurator(){
		return AutocompleterConfigurator.valueOf(
				getLoyaltyGeneralProps().getPropertyAsString(AUTOCOMPLETER_NAME),
				getLoyaltyGeneralProps().getPropertyAsInteger(AUTOCOMPLETER_NUMBER_OF_RESULTS),
				getLoyaltyGeneralProps().getPropertyAsBoolean(AUTOCOMPLETER_AMTCH_INFIX), 
				getLoyaltyGeneralProps().getPropertyAsBoolean(AUTOCOMPLETER_ORDER_BY_SCORE), 
				getLoyaltyGeneralProps().getPropertyAsBoolean(AUTOCOMPLETER_CACHING_ENABLED), 
				getLoyaltyGeneralProps().getPropertyAsInteger(AUTOCOMPLETER_QUERIES_TO_CACHE), 
				getLoyaltyGeneralProps().getPropertyAsInteger(AUTOCOMPLETER_QUERY_LENGTH_TO_CACHE), 
				getLoyaltyGeneralProps().getPropertyAsInteger(AUTOCOMPLETER_REFRESH_INTERVAL));
	}
	
	//==============================================================
						/* GET ADMIN CONSTANT*/
	//==============================================================
	@Override
	public  HashMap<Object,Object> getAdminConstants(int indexGroupTag) throws Exception{

		URL url=ConfigServiceImpl.class.getProtectionDomain().getCodeSource().getLocation();
		String pathRoot=url.getPath();
		File fileRoot=new File(pathRoot); 
		for(int i=0;i<=1;i++){
			fileRoot=new File(pathRoot); 
			pathRoot=fileRoot.getParent();
        }
		String adminConstantsFileDest=pathRoot+"/admin-constants.xml";
    	SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(adminConstantsFileDest);
        Document doc = (Document) builder.build(xmlFile);
        Element rootNode = doc.getRootElement();
        List adminList = rootNode.getChildren();
        Element  elt=(Element)adminList.get(indexGroupTag);
        List alAdminListElememts = elt.getChildren();
        HashMap<Object,Object> result=new HashMap<Object,Object>();
        ItemMapDTO itemMap;
        for(int i = 0;i<=alAdminListElememts.size()-1;i++){
        	itemMap=new ItemMapDTO();
        	Element item=(Element)alAdminListElememts.get(i);
        	item.getName();
        	item.getValue();
        	result.put(item.getName().toString()+"_"+i, item.getValue());

        }
    	return result;
    }

	
	
}
