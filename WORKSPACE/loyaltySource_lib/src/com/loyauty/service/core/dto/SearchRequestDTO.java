package com.loyauty.service.core.dto;

import org.apache.log4j.Logger;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.util.text.StringUtils;

import lombok.Data;
import lombok.Getter;


/**
 * Clients send {@link SearchRequest} objects containing the query,
 * offset, and length of the result to be returned.
 *
 */
@Data
public class SearchRequestDTO extends BasicDTO{

	private static final long serialVersionUID = 774532001250775811L;
	private static final Logger log = Logger.getLogger(SearchRequestDTO.class);


	public static int DEFAULT_NUMNER_OF_RESULT_PER_PAGE;
	
	
	private final String query;
	private final int start;
	private final int length;
	private int sortBy;
	private int searchType;	
	private Long userId;
	
	static{
		int numberOfResults = 12;
		try{
			ServiceLocator locator = ServiceLocator.getInstance();
			numberOfResults = locator.getConfigService().getSearchNumberOfResults();
		}catch (ServiceLocatorException sle) {
		}
		
		DEFAULT_NUMNER_OF_RESULT_PER_PAGE = numberOfResults;		
	}
	
	public static SearchRequestDTO valueOf(String query){
		return valueOf(query, 0, DEFAULT_NUMNER_OF_RESULT_PER_PAGE, 0,SearchRequestDTO.SearchType.NAME.value);
	}
	
	public static SearchRequestDTO valueOf(String query, int start, int sortBy){
		return new SearchRequestDTO(query, start, DEFAULT_NUMNER_OF_RESULT_PER_PAGE ,sortBy,SearchRequestDTO.SearchType.NAME.value);
	}
	
	public static SearchRequestDTO valueOf(String query, int start, int length, int sortBy){
		return new SearchRequestDTO(query, start, length ,sortBy,SearchRequestDTO.SearchType.NAME.value);
	}
	
	public static SearchRequestDTO valueOf(String query, int start, int length, int sortBy,int searchType){
		return new SearchRequestDTO(query, start, length ,sortBy,searchType);
	}

	protected SearchRequestDTO(String query, int start, int length, int sortBy,int searchType) {		
		this.query = query;
		this.start = start;
		this.length = length;
		this.sortBy = sortBy;
		this.searchType = searchType;
	}	
	
	/* 
	 * TODO
	 * Is it a good idea to consider start and 
	 * length when caching results? */
	@Override
	public String makeKey() {		
		StringBuilder key = new StringBuilder();
		key.append(getSearchType());
		key.append("-");
		key.append(StringUtils.cleanUrlFromSpecialChars(getQuery()));
		key.append("-");
		key.append(getStart());
		key.append("-");
		key.append(getLength());
		key.append("-");
		key.append(getSortBy());
		if(getUserId() != null)
		{
			key.append("-");
			key.append(getUserId());
		}
		
		return key.toString();

	}
	// Enums
	public static enum SearchType {
		NAME(1),
		PRICE_RANGE(2),
		CATEGORY(3),
		BRAND(4),
		MAIN_SPECIFICATION(5),
		ALL(6),
		CATEGORY_GROUP(7)
		;
		@Getter
		private String localizationKey = "loyauty.enum.basicdto.searchtype." + name().toLowerCase();
		
		@Getter
		private int value;
		
		private SearchType(int value){
			this.value = value;
		}
	
	}
	
}
