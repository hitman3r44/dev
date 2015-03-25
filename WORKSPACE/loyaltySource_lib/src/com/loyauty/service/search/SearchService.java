package com.loyauty.service.search;

import java.util.HashMap;

import com.loyauty.exception.InitializationException;
import com.loyauty.exception.ServiceException;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.SearchResultDTO;
import com.loyauty.service.search.autocompleter.Autocompleter;
import com.loyauty.service.search.autocompleter.core.AutocompleterUnit;


/**
 * Search service interface.
 * 
 * @author Muthanna
 *
 */
public interface SearchService extends Service{
	
	/**
	 * Initializes search service.
	 * 
	 * @throws InitializationException
	 */
	public void initialize() throws InitializationException;
	
	/**
	 * Cleans up and collects important data.
	 */
	void shutdown();
	
	/**
	 * Returns the seach autocompleter.
	 * @return
	 */
	Autocompleter<Long, AutocompleterUnit> getMainSearchAutocompleter();
	
	/**
	 * Initializes autocompleter's data from DB, XML, or
	 * a remote webservice.
	 */
	 void loadAutocompleterData();
	 
	/**
	 * Searches depending on the parameters included in search
	 * request object.
	 * @param searchRequestDTO
	 * @return
	 * @throws ServiceException
	 */
	SearchResultDTO<ProductDTO> search(SearchRequestDTO searchRequestDTO)
			throws ServiceException;
	
	HashMap<Long, String> getAllProductMap() throws ServiceException; 
	

	
	
}
