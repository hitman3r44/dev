package com.loyalty.dao.mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.Type;
import com.loyauty.exception.DaoException;
import com.loyauty.model.Brand;
import com.loyauty.model.Image;
import com.loyauty.model.Product;
import com.loyauty.model.ProductModelNumber;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.Select;


public class ProductDaoTest {

	private static DaoManager daoManager;
	private Product product;
	private Product productResult;
	@BeforeClass
	public static void setUpBefore() throws Exception {
		// This service should always be called first
		daoManager = DaoManagerFactory.getDaoManager();
	}

	@AfterClass
	public static void tearDownAfter() throws IOException {
	}

	@Before
	public void setUp() {
	
		product = new Product();
		productResult = new Product();
		product.setId(new Long(1));
		
	}

	@After
	public void tearDown() {
		
	}

	@Test
	public void selectProduct() {
		Product pa = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			pa = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							Product pb = new Product();
							
							Select select = new Select();	// Line added
							pb = daoManager.getProductDao().getProduct(select);
							return pb;
						}
					});

			assertNotNull(pa);
			
		} catch (DaoException de) {
			de.printStackTrace();
		}

	}
	
	@Test
	public void selectProductByUser() {
		Product pa = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			pa = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							Product pb = new Product();
							pb.setId(new Long(1));
							pb.setUserId(new Long(1));
							pb = daoManager.getProductDao().getProductByUserId(pb);
							return pb;
						}
					});

			assertNotNull(pa.getUserPrice());
							
		} catch (DaoException de) {
			de.printStackTrace();
		}
	}
		
	@Test
	public void isertProduct() {
		Product pa = new Product();
		
		try {
			daoManager.setCommitTransaction(true);
			pa = (Product) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							
							Product product = new Product();
							
							//Name
							Translation translationName = new Translation();
							daoManager.getTranslationDao().insertTranslation(translationName);	
							//Eng Name
							TranslationEntry entryNameEng = new TranslationEntry(translationName.getId(), "productNameEng"  + Calendar.getInstance().getTimeInMillis());
							entryNameEng.setLanguage(Language.ENGLISH);
							daoManager.getTranslationDao().insertEntry(entryNameEng);
							//Fr Name
							TranslationEntry entryNameFr = new TranslationEntry(translationName.getId(), "productNameFr"  + Calendar.getInstance().getTimeInMillis());
							entryNameFr.setLanguage(Language.FRENCH);
							daoManager.getTranslationDao().insertEntry(entryNameFr);
							
							//Description
							Translation translationDescription = new Translation();
							daoManager.getTranslationDao().insertTranslation(translationDescription);
							//Eng Description
							TranslationEntry entryDescriptionEng = new TranslationEntry(translationDescription.getId(), "productDescriptionEng"  + Calendar.getInstance().getTimeInMillis());
							entryDescriptionEng.setLanguage(Language.ENGLISH);
							daoManager.getTranslationDao().insertEntry(entryDescriptionEng);
							//Fr Description
							TranslationEntry entryDescriptionFr = new TranslationEntry(translationDescription.getId(), "productDescriptionFr"  + Calendar.getInstance().getTimeInMillis());
							entryDescriptionFr.setLanguage(Language.FRENCH);
							daoManager.getTranslationDao().insertEntry(entryDescriptionFr);
							
							//Insert Image product
							Image imageProduct = new Image();
							imageProduct.setName("image" + Calendar.getInstance().getTimeInMillis());
							imageProduct.setRealNameImg("image"  + Calendar.getInstance().getTimeInMillis());
							imageProduct.setType(Type.PRODUCT);
							imageProduct.setResolution(1);
							daoManager.getImageDao().insertEntity(imageProduct);
							
							//Brand
							Brand brand = new Brand();
							brand.setId(new Long(1));
							
							product.setName(translationName);
							product.setDescription(translationDescription);
							product.setImage(imageProduct);
							product.setStatus(ProductStatus.AVAILABLE);
							product.setMsrp("msrp2");
							product.setCost("cost2");
							product.setBrand(brand);
							product.setLoyaltySourceProductId("modelNumber"  + Calendar.getInstance().getTimeInMillis());
							product.setProductHigh("2");
							product.setProductLong("2");
							product.setProductWidth("2");
							product.setWeight("weight");
							//product.setCategoryId(new Long(1));
							
							daoManager.getProductDao().insertProduct(product);
							
							//Model Number
							ProductModelNumber productModelNumber1 = new ProductModelNumber();
							productModelNumber1.setProductId(product.getId());
							productModelNumber1.setModelNumber("AAAAAAA");
							daoManager.getProductDao().insertProductModelNumber(productModelNumber1);
							
							ProductModelNumber productModelNumber2 = new ProductModelNumber();
							productModelNumber2.setProductId(product.getId());
							productModelNumber2.setModelNumber("BBBBBBB");
							daoManager.getProductDao().insertProductModelNumber(productModelNumber2);
							
							ProductModelNumber productModelNumber3 = new ProductModelNumber();
							productModelNumber3.setProductId(product.getId());
							productModelNumber3.setModelNumber("CCCCCCC");
							daoManager.getProductDao().insertProductModelNumber(productModelNumber3);
							
							return product;
						}
					});

			assertNotNull(pa.getId());
							
		} catch (DaoException de) {
			de.printStackTrace();
		}

	}

	
	@SuppressWarnings("unchecked")
	@Test
	public void selectAllProductProfitCategory() {
		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							Product product = new Product();
							//product.setCategoryId(new Long(1));
							return daoManager.getProductDao().getAllProdcutForProfit(product);
						}
					});

			
			assertEquals(productList.size(), 0);
							
		} catch (DaoException de) {
			de.printStackTrace();
		}

	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void selectAllProductProfitBrandCategory() {
		List <Product> productList = new ArrayList<Product>();
		
		try {
			daoManager.setCommitTransaction(true);
			productList = (List <Product>) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							Brand brand = new Brand();
							brand.setId(new Long(1));
							Product product = new Product();
							//product.setCategoryId(new Long(1));
							product.setBrand(brand);
							return daoManager.getProductDao().getAllProdcutForProfit(product);
						}
					});

			
			assertEquals (productList.size(), 0);
							
		} catch (DaoException de) {
			de.printStackTrace();
		}
	}
	
	
/*	@Test
	public void selectBrand() {
		Brand b = new Brand();
		
		try {
			daoManager.setCommitTransaction(true);
			b = (Brand) daoManager.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(com.loyauty.dao.core.DaoManager daoManager)
								throws DaoException {
							
							return daoManager.getBrandDao().getEntity(new Long(1));
						}
					});

			System.out.println(b.toString());
			
		} catch (DaoException de) {
			de.printStackTrace();
		}

	}*/
	
}
