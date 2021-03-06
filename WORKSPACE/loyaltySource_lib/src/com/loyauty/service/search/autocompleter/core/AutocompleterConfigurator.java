package com.loyauty.service.search.autocompleter.core;

import lombok.Data;

/**
 * A representation of the autocompleter configuration.
 * 
 * 
 */
@Data
public class AutocompleterConfigurator {
	
	public static final AutocompleterConfigurator DEFAULT = new AutocompleterConfigurator(
			"Default", 10, true, false, true, 500, 5, 60);

	public static AutocompleterConfigurator valueOf(String name, int numberOfResults,
			boolean matchInfix, boolean orderByScore, boolean chachingEnabled,
			int numberOfQueriesToCache, int queryLengthToCache,
			int refreshInterval){
		return new AutocompleterConfigurator(name, numberOfResults, matchInfix,
				orderByScore, chachingEnabled, numberOfQueriesToCache, queryLengthToCache, refreshInterval);
	}
	
	private String name;
	private int numberOfResults;
	private boolean matchInfix;
	private boolean orderByScore;
	private boolean cachingEnabled;
	private int numberOfQueriesToCache;
	private int queryLengthToCache;
	private int refreshInterval;

	private AutocompleterConfigurator(String name, int numberOfResults,
			boolean matchInfix, boolean orderByScore, boolean chachingEnabled,
			int numberOfQueriesToCache, int queryLengthToCache,
			int refreshInterval) {
		
		setName(name);
		setNumberOfResults(numberOfResults);
		setMatchInfix(matchInfix);
		setOrderByScore(orderByScore);
		setCachingEnabled(chachingEnabled);
		setNumberOfQueriesToCache(numberOfQueriesToCache);
		setQueryLengthToCache(queryLengthToCache);
		setRefreshInterval(refreshInterval);
	}
	
	@Override
	public String toString() {
		return "{" + "name=" + name + ", numberOfResults=" + numberOfResults
				+ ", matchInfix=" + matchInfix + ", orderByScore="
				+ orderByScore + ", chachingEnabled=" + cachingEnabled
				+ ", numberOfQueriesToCache=" + numberOfQueriesToCache
				+ ", queryLengthToCache=" + queryLengthToCache
				+ ", refreshInterval=" + refreshInterval + "}";
	}

}
