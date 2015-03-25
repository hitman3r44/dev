package com.loyauty.web.struts.action.search;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserProductStatus;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.category.CategoryService;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.SearchRequestDTO.SearchType;
import com.loyauty.service.core.dto.SearchResultDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.search.SearchService;
import com.loyauty.service.specification.SpecificationService;
import com.loyauty.web.RequestAtributeConstants;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyActionWeb;
import com.loyauty.web.struts.json.results.PagingWeb;
import com.loyauty.web.util.SeoUrlsMaker;

/**
 * This is the main search action on Loyalty.
 * 
 */
@SuppressWarnings("serial")
public class SearchResults extends LoyautyActionWeb implements ServletResponseAware {
	
	private static final int PAGING_FRAME_SIZE = 12;
	private static final String REDIRECT_PRODUCT_PAGE = "showProduct";
	
	@Getter(AccessLevel.PROTECTED) 
	@Setter(AccessLevel.PROTECTED)
	SearchService searchService;
	
	private CategoryService categoryService;	
	private SpecificationService specificationService;
	private BrandService brandService;
	private ProductService productService;
		
	@Getter @Setter
	private String query;
	
	@Getter @Setter
	private int start;
	
	@Getter @Setter
	private int sortBy;
	
	@Getter @Setter
	SearchResultDTO<ProductDTO> searchResults;
	
	@Getter @Setter
	private PagingWeb paging;
	
	@Getter @Setter
	private int mode;
	
	@Getter @Setter
	private int length;

	@Getter @Setter
	private int searchType;
	
	@Getter @Setter
	private boolean	mSorted;
	
	@Getter @Setter
	private String urlProductPageSeo;
	
	@Getter @Setter
	private boolean search;
	
	@Getter @Setter
	private String productBreadcrumb;
	
	@Getter @Setter
	private HttpServletResponse servletResponse;
	
	public SearchResults() throws ServiceLocatorException{
		setSearchService(getServiceLocator().getSearchService());
		categoryService = getServiceLocator().getCategoryService();
		specificationService = getServiceLocator().getSpecificationService();
		brandService = getServiceLocator().getBrandService();
		productService = getServiceLocator().getProductService();		
	}
	
	@Override
	public String execute() throws Exception {
		try {
			if(query != null){
				query =  query.toLowerCase();
				
				if(query.trim().length()==0) {
					return SUCCESS;
				}
				
				// changes to display the number of Items on the page.
				if(length != 0){
					SearchRequestDTO.DEFAULT_NUMNER_OF_RESULT_PER_PAGE= length;
				}
				
				int length1= SearchRequestDTO.DEFAULT_NUMNER_OF_RESULT_PER_PAGE;
				sortBy = sortBy == 0 ? WebConstants.SORT_BY_BRAND_AZ : sortBy;
				SearchRequestDTO searchRequestDTO = SearchRequestDTO.valueOf(query.trim(), start, length1, sortBy, searchType);	
				
				//Insert the user
				if (request.getSession().getAttribute(WebConstants.USER) != null) {
					UserSessionDTO userSessionDTO = (UserSessionDTO)request.getSession().getAttribute(WebConstants.USER);
					searchRequestDTO.setUserId(userSessionDTO.getId());
					productBreadcrumb = "Our Products";
				} else {
					searchRequestDTO.setUserId(null);
					productBreadcrumb = "Products";
				}
				SearchResultDTO<ProductDTO> searchResultDTO = searchService.search(searchRequestDTO);
				
				// WE CLEAN THE PRODUCT-DTO-LIST FROM NULL-VALUES.
				List<ProductDTO> searchProductDTOList = searchResultDTO.getResults();
				searchProductDTOList.removeAll(Collections.singleton(null));
				
				// A SEARCH-DTO PRE-PROCESSING FOR CONSIDERING 'DISCONTINUED'-STATUS PRODUCTS.
				List<ProductDTO> allProductDTOList = searchProductDTOList; // = searchResultDTO.getResults();
				List<ProductDTO> validatingProductDTOList = new ArrayList<ProductDTO>(allProductDTOList);
				if (request.getSession().getAttribute(WebConstants.USER) != null) {
					UserProductPriceDTO userProductPriceDTO = new UserProductPriceDTO();
					for (ProductDTO productDTO: allProductDTOList) {
						if (productDTO.getStatus() == ProductStatus.DISCONTINUED) {
							long productId = productDTO.getId();
							long userIdThatJustHasLoggedIn = searchRequestDTO.getUserId();
							Calendar cal = Calendar.getInstance();
							Date now = cal.getTime();
							Date begin = now;
							if (productDTO.getDiscontinuedStartDate() == null) {
								ProductDTO pDTO = productService.getProductInformation(productId, userIdThatJustHasLoggedIn);	
								begin = pDTO.getDiscontinuedStartDate();
							} else {
								begin = productDTO.getDiscontinuedStartDate();
							}
							cal.setTime(begin);
							cal.add(Calendar.MONTH, 1);
							Date end = cal.getTime();
							if (now.compareTo(end) >= 0) {
								userProductPriceDTO = productService.getUserProductPriceInformation(productId, userIdThatJustHasLoggedIn);
								UserProductStatus userProductPriceStatus = userProductPriceDTO.getUserStatus();
								if (userProductPriceStatus == UserProductStatus.INACTIVE) {
									validatingProductDTOList.remove(productDTO);
								}
							}
						}
					}
					searchResultDTO.replace(validatingProductDTOList);
				} else {
					for (ProductDTO productDTO: allProductDTOList) {
						if (productDTO.getStatus() == ProductStatus.DISCONTINUED) {
							long productId = productDTO.getId();
							Calendar cal = Calendar.getInstance();
							Date now = cal.getTime();
							Date begin = now;
							if (productDTO.getDiscontinuedStartDate() == null) {
								ProductDTO pDTO = productService.getProductInformation(productId, null);
								begin = pDTO.getDiscontinuedStartDate();
							} else {
								begin = productDTO.getDiscontinuedStartDate();
							}
							cal.setTime(begin);
							cal.add(Calendar.MONTH, 1);
							Date end = cal.getTime();
							if (now.compareTo(end) >= 0) {
								validatingProductDTOList.remove(productDTO);
							}
						}
					}
					searchResultDTO.replace(validatingProductDTOList);
				}
				
				//Here, I do the translation.
				for (ProductDTO productDTO: searchResultDTO.getResults()) {
					if (getCurrentLanguage().equals(WebConstants.ENGLISH_LANGUAGE)) {
						productDTO.setNameProduc(productDTO.getNameEng().getName());
						productDTO.setDescriptiProduct(productDTO.getDescriptionEng().getName());
						productDTO.setSpecificationProduct(productDTO.getSpecificationEng().getName());
					} else if (getCurrentLanguage().equals(WebConstants.FRENCH_LANGUAGE)) {						
						productDTO.setNameProduc(productDTO.getNameFr().getName());
						productDTO.setDescriptiProduct(productDTO.getDescriptionFr().getName());
						productDTO.setSpecificationProduct(productDTO.getSpecificationFr().getName());						
					}
					
					//productDTO.setHrefName( REDIRECT_PRODUCT_PAGE + productDTO.getId() );				
					
					String value = productDTO.getPriceProduct();
					if (!value.matches("^\\s*$") || !value.equalsIgnoreCase("")) {
						productDTO.setLocalizedPriceProduct("$" + format(Double.parseDouble(validateStringForDouble(value)), "#,###.00", "en", "US"));
					}
					String x=SeoUrlsMaker.getProductUrl(productDTO.getBrand().getName(),productDTO.getNameEng().getName(),productDTO.getId());
					productDTO.setHrefName(SeoUrlsMaker.getProductUrl(productDTO.getBrand().getName(), 
																	  productDTO.getNameEng().getName(), 
																	  productDTO.getId()));
				}
				
				if (searchResultDTO.getSortBy() != 0)
					sortBy = searchResultDTO.getSortBy();
				if (searchResultDTO.getLength() != 0)
					length= searchResultDTO.getLength();
					
				/* When it is only a game. the game page action is called*/
				if (searchResultDTO.getNumberOfResults() == 1) {
					ProductDTO productDTO = searchResultDTO.getResults().get(0);
					String brand = productDTO.getBrand().getName();
					String productName = productDTO.getNameProduc();
					long productId = productDTO.getId();
					urlProductPageSeo = SeoUrlsMaker.getProductUrl(brand, productName, productId);
					return REDIRECT_PRODUCT_PAGE;					
				}
				//Put href for Seo
				
				HttpSession session = request.getSession(true);
				//To light the menu
				Long queryID = new Long(0L);
				String groupHL = "";
				String categoryHL = "";
				String specHL = "";
				String brandHL = "";				
				String groupName = "";
				String categoryName = "";
				String specName = "";
				String brandName = "";
				long categoryGroupID = 0L;
				long categoryID = 0L;
				long specID = 0L;
				long brandID = 0L;
				
				// page header customization  
				if (searchType == SearchType.CATEGORY_GROUP.getValue()) {
					request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, getCategoryGroupName(query));
					categoryGroupID = queryID = Long.valueOf(query);
					groupName = getCategoryGroupName(query);
					groupHL = SeoUrlsMaker.getCategoryGroupUrl(groupName);
				} else if(searchType == SearchType.CATEGORY.getValue()) {
					categoryID = Long.valueOf(query);
					CategoryDTO categoryDTO = categoryService.getCategory(categoryID);
					request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, categoryDTO.getName());
					categoryGroupID = queryID = categoryDTO.getCategoryGoupeId();
					groupName = getCategoryGroupName(String.valueOf(categoryGroupID));
					groupHL = SeoUrlsMaker.getCategoryGroupUrl(groupName);
					categoryName = categoryDTO.getName();
					categoryHL = SeoUrlsMaker.getCategoryUrl(groupName, categoryName, categoryID);					
				} else if(searchType == SearchType.MAIN_SPECIFICATION.getValue()) {
					specID = Long.valueOf(query);
					SpecificationDTO specificationDTO = specificationService.getSpecification(Long.valueOf(query));
					request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, specificationDTO.getName());
					categoryID = specificationDTO.getCategory().getId();
					categoryGroupID = queryID = specificationDTO.getCategoryGoupeId();
					groupName = getCategoryGroupName(String.valueOf(categoryGroupID));
					groupHL = SeoUrlsMaker.getCategoryGroupUrl(groupName);
					categoryName = specificationDTO.getCategory().getName();
					categoryHL = SeoUrlsMaker.getCategoryUrl(groupName, categoryName, categoryID);	
					specName = specificationDTO.getName();
					specHL = SeoUrlsMaker.getSpecificationUrl(groupName, categoryName, specName, specID);
				} else if(searchType == SearchType.BRAND.getValue()) {
					brandID = Long.valueOf(query);
					BrandDTO brandDTO = brandService.getBrand(brandID);
					brandName = brandDTO.getName();
					request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, brandName);
					brandHL = SeoUrlsMaker.getBrandUrl(brandName, brandDTO.getId());
				} else {
					request.setAttribute(RequestAtributeConstants.PAGE_TITLE_PARAM_1, query);
				}
				
				//request.setAttribute(RequestAtributeConstants.PAGE_KEYWORDS_PARAM_1, query );
				//request.setAttribute(RequestAtributeConstants.PAGE_DESCRIPTION_PARAM_1, query);
				
				setSearchResults(searchResultDTO);
				
				session.setAttribute("queryID", queryID);
				session.setAttribute("productBreadcrumb", productBreadcrumb);
				session.setAttribute("type", String.valueOf(searchType));
				session.setAttribute("groupName", groupName);
				session.setAttribute("categoryName", categoryName);
				session.setAttribute("specName", specName);
				session.setAttribute("brandName", brandName);
				session.setAttribute("groupHL", groupHL);
				session.setAttribute("categoryHL", categoryHL);
				session.setAttribute("specHL", specHL);
				session.setAttribute("brandHL", brandHL);				
				paging = new PagingWeb(searchResults.getStart(), searchResults.getNumberOfResults(), searchResults.getLength(), PAGING_FRAME_SIZE);
			}
		}  catch (Exception e) {
			//managerException(e, " query: " + query +" start: " + start +"sortBy: " + sortBy +
			//					" searchType: " + searchType);
			log.debug("Exception when performing search : " + e);
		}		
		return SUCCESS;
	}
	
	private String validateStringForDouble(String value) {
		if (value.charAt(0) == '$') value = value.substring(1);
		value = removeCharFrom(value, ' ');
		value = removeCharFrom(value, ',');
		return value;
	}
	
	private String removeCharFrom(String value, char character) {
		if (value.indexOf(String.valueOf(character)) != -1) {
			value = value.replaceAll(String.valueOf(character), "");						
		}
		return value;
	}
	
	private String getCategoryGroupName(String groupID) {
		return( GroupCategoryEnum.values()[Integer.parseInt(groupID) - 1].getCode());
	}
	
	private String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
}
