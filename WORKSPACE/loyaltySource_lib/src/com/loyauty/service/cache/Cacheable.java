package com.loyauty.service.cache;

/**
 * Only classes implementing this interface can be cached.
 * 
 * @author Muthanna
 *
 */
public interface Cacheable {
	
	/**
	 * Makes the key to be used when putting an object in the cache.
	 * @return
	 */
	String makeKey();
}
