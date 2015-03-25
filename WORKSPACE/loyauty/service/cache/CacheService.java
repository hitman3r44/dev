package com.loyauty.service.cache;

import java.util.List;

import com.loyauty.exception.CacheException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.Service;
/*import com.loyauty.service.core.dto.BasicGameDTO;
import com.loyauty.service.core.dto.LinkSourceDTO;
import com.loyauty.service.core.dto.SolrBasicGameDTO;*/

/**
 * Cache service interface.
 * @author Muthanna
 *
 */
public interface CacheService  extends Service{

	/**
	 * Initializes the cache manager, this should be called before using the
	 * cache.
	 */
	void initialize() throws CacheException, ServiceLocatorException;
	
	/**
	 * Gets the default cache.
	 * @return
	 */	
	Cache<Object> getDefaultCache();	

	/**
	 * Gets the reference to the game cache.
	 * @return
	 */
	/*Cache<BasicGameDTO> getGameCache();
	
	*//**
	 * Gets the reference to the search cache.
	 * @return
	 *//*
	Cache<SolrBasicGameDTO> getGamesListCache();
	
	*//**
	 * Gets the reference to the Link Source cache.
	 * @return
	 *//*
	Cache<List<LinkSourceDTO>> getLinkSourceListCache();*/
	
	/**
	 * Shuts down the cache manager collects the statistics.
	 */
	void shutdown() throws CacheException;

		

}
