package com.loyauty.service.cache;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;
import net.sf.ehcache.CacheManager;

import org.apache.log4j.Logger;

import com.loyauty.exception.CacheException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceImpl;
/*import com.loyauty.service.core.dto.BasicGameDTO;
import com.loyauty.service.core.dto.LinkSourceDTO;
import com.loyauty.service.core.dto.SolrBasicGameDTO;*/
import com.loyauty.service.init.ConfigService;

/**
 * A service class to manage the caching subsystem on GameJab.
 * The service should be initialized on application startup, after initializing
 * the {@link ConfigService}. 
 * 
 * @author Muthanna
 * 
 */
public class CacheServiceImpl extends ServiceImpl implements CacheService {

	private static final Logger log = Logger.getLogger(CacheServiceImpl.class);
	
	public static final String CACHE_CONFIG_FILE = "/ehcache.xml";
	
	public static final String DEFAULT_CACHE_NAME = "defaultCache";
	public static final String GAME_DTO_CACHE_NAME = "gameDTOCache";
	public static final String SEARCH_RESULT_DTO_CACHE_NAME = "searchResultDTOCache";
	public static final String LINKSOURCE_RESULT_DTO_CACHE_NAME = "linkSourceResultDTOCache";
	
	
	private static final CacheService INSTANCE = new CacheServiceImpl();

	/**
	 * A singleton cache service
	 * 
	 * @return
	 */
	public static CacheService getInstance() {
		return INSTANCE;
	}

	private CacheServiceImpl() {
		if (INSTANCE != null) {
			throw new IllegalStateException(this.getClass()	+ " instance is already created");
		}
	}
	
	@Getter
	@Setter(AccessLevel.PRIVATE)
	private boolean cacheServiceInitialized = false;
		
	@Getter(AccessLevel.PRIVATE)
	@Setter(AccessLevel.PRIVATE)
	private CacheManager cacheManager;
	
	@Getter
	@Setter(AccessLevel.PRIVATE)
	private Cache<Object> defaultCache;
	
	/*@Getter
	@Setter(AccessLevel.PRIVATE)
	private Cache<BasicGameDTO> gameCache;
	
	@Getter
	@Setter(AccessLevel.PRIVATE)
	private Cache<SolrBasicGameDTO> gamesListCache;
	
	@Getter
	@Setter(AccessLevel.PRIVATE)
	Cache<List<LinkSourceDTO>> linkSourceListCache;*/
	
	@Synchronized
	public void initialize() throws CacheException, ServiceLocatorException {
		if(!isCacheServiceInitialized()){
			InputStream input = null;
			try {				
				input = CacheServiceImpl.class.getResourceAsStream(CACHE_CONFIG_FILE);
				setCacheManager(CacheManager.create(input));			
				initializeCaches();
				
				if(log.isInfoEnabled()){
					log.info("GameJab cache service has been successfully initialized.");
				}
				
				setCacheServiceInitialized(true);
				
			} catch (net.sf.ehcache.CacheException ce) {
				setCacheServiceInitialized(false);
				throw new CacheException("Something went wrong while trying to initialize EhCache manager", ce);
			}finally{
				if(null != input){
					try{
						input.close();
					}catch (IOException ioe) {
						if(log.isDebugEnabled()){
							log.debug("Could not close the input stream upon initializing the cache service.");
						}
						
					}
					
				}
			}
		}		
	}

	/**
	 * Initializes all caches we want to use.
	 */
	@SuppressWarnings("unchecked")	
	private void initializeCaches() throws CacheException, ServiceLocatorException{
		log.debug("INIT CACHE");
		try{			
			boolean statisticsEnabled = getServiceLocator().getConfigService().isCacheStatisticsEnabled();
//			boolean charged = getServiceLocator().getConfigService().isCacheStatisticsEnabled()
			
			// Initialize our default cache
				if (!cacheManager.cacheExists(DEFAULT_CACHE_NAME)){
					cacheManager.addCache(DEFAULT_CACHE_NAME);
				}
					setDefaultCache(new CacheImpl<Object>(cacheManager.getCache(DEFAULT_CACHE_NAME), statisticsEnabled));
					
/*					setGameCache(new CacheImpl<BasicGameDTO>(cacheManager.getCache(GAME_DTO_CACHE_NAME), statisticsEnabled));
					
					setGamesListCache(new CacheImpl<SolrBasicGameDTO>(cacheManager.getCache(SEARCH_RESULT_DTO_CACHE_NAME), statisticsEnabled));
			
					setLinkSourceListCache(new CacheImpl<List<LinkSourceDTO>>(cacheManager.getCache(LINKSOURCE_RESULT_DTO_CACHE_NAME), statisticsEnabled));	
*/
		}catch (IllegalStateException ise) {
			throw new CacheException(ise);
		}catch (net.sf.ehcache.CacheException ce) {
			throw new CacheException(ce);
		}
	}
	
	@Synchronized
	public void shutdown() throws CacheException{		
		if (null != getCacheManager()) {
			
			if(log.isInfoEnabled()){
				log.info("The cache service is getting shut down...");
			}			
						
			collectStatistics();
						
			removeCaches();
			getCacheManager().shutdown();
			setCacheManager(null);
			setDefaultCache(null);
			setCacheServiceInitialized(false);			
		}
	}

	/**
	 * Collects the statistics and writes them to a log file
	 */
	private void collectStatistics() {
		printCacheStats(getDefaultCache());
/*		printCacheStats(getGameCache());
		printCacheStats(getGamesListCache());*/
		// TODO other caches
	}
	
	private void printCacheStats(Cache cache){
		// This may be later redirected to a separated log file.
		if(log.isInfoEnabled()){
			log.info(cache.printReport());
		}
	}
	
	private void removeCaches() throws CacheException{
		removeCache(DEFAULT_CACHE_NAME);
	}
	
	/**
	 * Destroys a cache by its name
	 */	
	private void removeCache(String cacheName) throws CacheException {
		try {
			if(log.isInfoEnabled()){
				log.info("Destroying cache: " + cacheName);
			}
			
			getCacheManager().removeCache(cacheName);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		}
	}
	
	
	
}
