package com.loyalty.service.product;


import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductListDTO;
import com.loyauty.service.core.dto.SearchRequestDTO;
import com.loyauty.service.core.dto.SearchRequestDTO.SearchType;
import com.loyauty.service.init.ConfigService;
import com.loyauty.service.product.ProductService;

public class ProductTest {

	private static ServiceLocator serviceLocator;
	private static ProductService service;
	private static ConfigService configService;
	
	@BeforeClass
	public static void setUpBefore() throws Exception {
		System.out.println("setUpBefore");
		// This service should always be called first
		serviceLocator = ServiceLocator.getInsance();
		service = serviceLocator.getProductService();
		configService = serviceLocator.getConfigService();
		configService.initialize();
	}

	@AfterClass
	public static void tearDownAfter() throws IOException {	
	}

	@Before
	public void setUp(){
		System.out.println("setUp");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown");
	}
	
	//@Test
	public void insertProduct(){
		
		BrandDTO brandDTO = BrandDTO.valueOf(new Long(1), "", null, "", new Date());
		ImageDTO imageDTOProduct = ImageDTO.valueOf(1, "name" + (new Date()).getSeconds(), 1, 1, 1, 1, false, "realName" + (new Date()).getSeconds(),10);
		
		List<CommonDTO> stringList = new ArrayList<CommonDTO>();
		stringList.add(CommonDTO.valueOf(0, "AAAAAAAA422"));
		stringList.add(CommonDTO.valueOf(0, "BBBBBBBB522"));
		
/*		ProductDTO productDTO = new ProductDTO.Builder(new Long(0), brandDTO, new Long(1))
					.mainFilterTypeId(new Long(1)).loyaltyProductId("1")
					.manufacturerProductId("1").nameEng(CommonDTO.valueOf(0, "productNameEng"))
					.nameFr(CommonDTO.valueOf(0, "productNameFr")).descriptionEng(CommonDTO.valueOf(0, "productDescriptionEng"))
					.image(imageDTOProduct).descriptionFr(CommonDTO.valueOf(0, "productDescriptionFr"))
					.specificationEng(CommonDTO.valueOf(0, "productSpecificationEng"))
					.specificationFr(CommonDTO.valueOf(0, "productSpecificationFr"))
					.msrp("msrp").cost("cost").high(1).width(1).large(1).weight("weight")
					.manufactureProductList(stringList).build();
		try {
			Long longId = null;
			//longId = service.createProduct(productDTO);
			
			assertNotNull(longId);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	//@Test
	public void selectProduct(){
	
		try {
			ProductDTO productDTO = service.getProductInformation(new Long(5), null);
			
			assertNotNull(productDTO);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@Test
	public void updateProduct(){
			
		try {
			ProductDTO productDTO = service.getProductInformation(new Long(5), null);
			productDTO.getDescriptionEng().setName("descriptionEngProduct5");
			productDTO.getSpecificationFr().setName("SpecificationFrProduct5");
			
			service.updateProduct(productDTO);
			
			productDTO = service.getProductInformation(new Long(5), null);
			
			assertNotNull(productDTO.getDescriptionEng().getName());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	public void getProductList() {
		try {
			SearchRequestDTO searchRequest =  SearchRequestDTO.valueOf("9", 0, 10, 1, SearchType.ALL.getValue());
		
			List<ProductDTO> list = service.getProductList(searchRequest);
				
			Assert.assertTrue(list != null && list.size() > 0);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void getProductRangeList() {
		try {
			SearchRequestDTO searchRequest =  SearchRequestDTO.valueOf("9", 0, 10, 1, SearchType.ALL.getValue());
		
			List<ProductDTO> list = service.getProductList(searchRequest);

			Map<Integer, ProductListDTO> map = DTOFactory.getProductListRangeDTO(list);
			
			for(Map.Entry<Integer, ProductListDTO> entry : map.entrySet()){
				
				System.out.println("-max: " + entry.getValue().getMaximumRange() + 
								   " -min: " + entry.getValue().getMinimumRange() + 
								   " -size: " + entry.getValue().getProductList().size());				
				
			}
			
			Assert.assertTrue(map != null && !map.isEmpty());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
