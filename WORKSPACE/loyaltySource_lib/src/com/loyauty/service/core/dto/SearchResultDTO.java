package com.loyauty.service.core.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.Data;

/**
 * Represents the search result for a search request.
 *
 * @param <T>
 */
@Data
public class SearchResultDTO<T> extends BasicDTO {

	private static final long serialVersionUID = -2453428535626012493L;
	
	private final String query;
	
	private int numberOfResults;
		
	private int start;
	
	private int length;

	/* How long does the search take? 
	 * Time is calculated in seconds. 
	 */
	private long searchTime;
	
	private List<T> results;
	
	private int sortBy;
	
	private Comparator<T> comparator;

	public SearchResultDTO(String query, int start, int length,
			 long searchTime, int sortBy, Comparator<T> comparator, List<T> results) {
		
		this.query = query;
		this.start = start;
		this.length = length;
		this.searchTime = searchTime;
		this.sortBy = sortBy;
		this.comparator = comparator;
		this.results = results;
		
		updateNumberOfResults();
	}
	
	public T getResult(int index) {
		return results.get(index);
	}
	
	public List<T> getCurrentResults() {
		//we don't need to sort result. the sorting is done with solr
		int end = start + length;
		int stop = (end>numberOfResults?numberOfResults:end);
		
		// TODO create a new array list or use different lists depending on sortBy?
		List<T> returnedList = new ArrayList<T>(results);
				
		if(comparator != null){
			Collections.sort(returnedList, comparator);
		}
		return returnedList.subList(start, stop);
	}
	
	public boolean isValid(){
		return results != null;
	}
	
	public boolean hasResults(){
		return (isValid() && results.size() > 0);
	}
	
	public void replace(final List<T> newList) {
		this.results = newList;
		updateNumberOfResults();
	}
	
	private void updateNumberOfResults() {
		if(hasResults()) {
			this.numberOfResults = results.size();
		}
		else {
			this.numberOfResults = 0;
		}
	}
}
