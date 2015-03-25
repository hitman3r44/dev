package com.loyauty.service.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import lombok.Getter;

import org.apache.log4j.Logger;

import com.loyauty.exception.CacheException;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.InitializationException;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.cache.CacheService;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.SearchResultDTO;
import com.loyauty.service.search.autocompleter.Autocompleter;
import com.loyauty.service.search.autocompleter.AutocompleterImpl;
import com.loyauty.service.search.autocompleter.core.AutocompleterConfigurator;
import com.loyauty.service.search.autocompleter.core.AutocompleterElement;
import com.loyauty.service.search.autocompleter.core.AutocompleterUnit;
import com.loyauty.service.search.autocompleter.task.SearchAutocompleterTask;
import com.loyauty.util.CommonUtils;




/**
 * Provides all search related logic in the system.
 * 
 *
 */
public class SearchServiceImpl extends ServiceImpl implements SearchService {

	private static final Logger log = Logger.getLogger(SearchServiceImpl.class);
	
	// Java timers work with milliseconds
	private static final long TIME_UNIT_ONE_SECOND = 1000;
	private static final long TIME_UNIT_ONE_MINUTE = 60 * TIME_UNIT_ONE_SECOND;
	
	// Sort ProductDTOs on Service as for search() used at SearchResults.java-Action
	private static final int SORT_BY_DISCOUNT_HIGHEST_FIRST = 12;
	
	private static final SearchService INSTANCE = new SearchServiceImpl();
	
	/**
	 * A singleton search service
	 * 
	 * @return
	 */
	public static SearchService getInstance() {
		return INSTANCE;
	}
	
	private SearchServiceImpl() {
		if (INSTANCE != null) {
			throw new IllegalStateException(this.getClass()	+ " instance is already created");
		}
	}

	@Getter
	private Autocompleter<Long, AutocompleterUnit> mainSearchAutocompleter;
	
	Timer mainSearchTimer;
	
	@Override
	public void initialize() throws InitializationException {
		AutocompleterConfigurator mainSearchConfigurator = AutocompleterConfigurator.DEFAULT;
		try {
			mainSearchConfigurator = getServiceLocator().getConfigService().getSearchConfigurator();
		} catch (Exception e) {
			throw new InitializationException(
					"Something wrong with configuration service", e);
		} finally {
			// get sure we start up with functional autocompleters
			mainSearchAutocompleter = new AutocompleterImpl<Long, AutocompleterUnit>(mainSearchConfigurator);
			loadAutocompleterData();	
			scheduleTimers();
		}
	}	

	@Override
	public void shutdown() {
		if (mainSearchTimer != null)
			mainSearchTimer.cancel();	
		
		getMainSearchAutocompleter().printReport();
	}

	private void scheduleTimers() {
		int refreshInterval = getMainSearchAutocompleter().getConfigurator()
				.getRefreshInterval();

		// Is configured to refresh?
		if (refreshInterval > 0) {
			mainSearchTimer = new Timer(true);
			mainSearchTimer.scheduleAtFixedRate(
					new SearchAutocompleterTask(), refreshInterval
							* TIME_UNIT_ONE_MINUTE, refreshInterval
							* TIME_UNIT_ONE_MINUTE);
		}
	}
	
	@Override
	public void loadAutocompleterData() {
		
		try {
			/*
			 *  TODO This is only a test to make the autocompleter work.
			 *  You have to fill it up with the correct search terms
			 */
			SearchService searchService = getServiceLocator().getSearchService();
			
			Collection<AutocompleterElement<Long, AutocompleterUnit>> elements = new
			  ArrayList<AutocompleterElement<Long, AutocompleterUnit>>();
			AutocompleterUnit unit;
			
			HashMap<Long, String> map = searchService.getAllProductMap();
			log.debug("autocompleter initializing:"+map.size());
			
			for (Map.Entry<Long, String>  entry : map.entrySet()) {
				unit = new AutocompleterUnit(entry.getKey(), entry.getValue());
				AutocompleterElement<Long, AutocompleterUnit> element = 
					new	AutocompleterElement<Long, AutocompleterUnit>(entry.getKey(), unit);
				elements.add(element);				
			} 

			searchService.getMainSearchAutocompleter().build(elements);
			
			//elements.clear();
				
			if(log.isInfoEnabled()) {
				log.debug("Search autocompleter has been successfully initialized.");
			}					
			
		} catch (ServiceLocatorException sle) {
			// TODO: handle exception
		} catch (ServiceException se) {
			// TODO: handle exception
		}		
	}
	
	@Override
	public SearchResultDTO<ProductDTO> search(SearchRequestDTO searchRequest) throws ServiceException {
		if(searchRequest == null || !CommonUtils.isValidString(searchRequest.getQuery())) {
			throw new IllegalArgumentException("You can not pass a null SearchRequest or empty query.");
		}
		
		List<ProductDTO> productList;		
		long now = System.currentTimeMillis();	
		try{
			
			String key = searchRequest.makeKey();
			CacheService cacheService = this.getServiceLocator().getCacheService();
			
			if(log.isDebugEnabled()){
				log.debug("Checking if product list is in cache1...");
			}
			
			productList = (List<ProductDTO>) cacheService.getProductListCache().fetch(key);
			
			if(productList == null ) {
				productList = this.getServiceLocator().getProductService().getProductList(searchRequest);
				if(log.isDebugEnabled()) {
					log.debug("Product list is not in the  cache, DB ACCESS then Caching, key:"+ key);
				}
				if(productList != null) {
					cacheService.getProductListCache().store(key, productList);
					log.debug("Store product list Caching, key:"+ key);
				}
			}
			List<ProductDTO> resultList = new ArrayList<ProductDTO>();
			if (searchRequest.getSortBy() == SORT_BY_DISCOUNT_HIGHEST_FIRST) {
				if (productList != null) {
					for (ProductDTO pDTO : productList) {
						String price = pDTO.getPriceProduct();
						String msrp = pDTO.getMsrp();						
						double priceVal = 0d;
						double msrpVal = 0d;
						double discountVal = 0d;
						double percentageVal = 0d;
						if (price != null) {
							if (!price.matches("^\\s*$") && !price.equalsIgnoreCase("")) {					
								priceVal = Double.parseDouble(price);		
							} else {
								priceVal = 0d;
							}
						}				
						if (msrp != null) {					
							if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {	
								msrpVal = Double.parseDouble(msrp);	
								discountVal = msrpVal - priceVal;
								percentageVal = (msrpVal != 0d) ? (100d * discountVal / msrpVal) : 0d;
							}
						}
						pDTO.setDiscount(percentageVal);
						resultList.add(pDTO);
					}
				}
				productList = resultList;
			}
			
		} catch (ServiceLocatorException sle) {
			throw new ServiceException(sle);
		}catch (CacheException ce) {
			throw new ServiceException(ce);
		}		
			
		Comparator<ProductDTO> comparator = ProductDTO.getComparator(searchRequest.getSortBy());
		long searchTime = (System.currentTimeMillis() - now)/1000;
		
		return new SearchResultDTO<ProductDTO>(searchRequest.getQuery(), searchRequest.getStart(),
		  searchRequest.getLength(), searchTime, searchRequest.getSortBy(), comparator, productList);
	}
	
	@SuppressWarnings("unchecked")
	public static void updateCacheAutocompleterMainSearch(long id, String value) throws DaoException {

		   AutocompleterUnit unit = new AutocompleterUnit(id, value);
		   AutocompleterElement<Long, AutocompleterUnit> element = 
					new	AutocompleterElement<Long, AutocompleterUnit>(id, unit);
										
		   
		   AutocompleterElement<Long, AutocompleterUnit> auto = 
			   (AutocompleterElement<Long, AutocompleterUnit>) getInstance().getMainSearchAutocompleter().get(id);
		   if(auto != null){			  
			   getInstance().getMainSearchAutocompleter().remove(id);
		   }
		   
		   getInstance().getMainSearchAutocompleter().add(element);
		   		
	}

	@Override
	public HashMap<Long, String> getAllProductMap() throws ServiceException {
		// Map<Long, String> productList = new HashMap<Long, String>();
		HashMap<Long, String> productList = new HashMap<Long, String>(2000, .75f);
		List<ProductDTO> listProductDTO = null;
		
		String content = "";
		
		try {
			listProductDTO = getServiceLocator().getProductService().getAllProdcut();
			for(ProductDTO productDTO : listProductDTO) {				
				content = productDTO.getNameEng().getName();
				content = (content != null) ? content.intern() : content;
				
				productList.put(productDTO.getId(), content);
			}
			
			return(productList);
			
		} catch (Exception sle) {			
			throw new ServiceException(sle);
		}
	}		

}
