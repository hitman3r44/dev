package com.loyauty.service.brand;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Type;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Brand;
import com.loyauty.model.BrandCategoryGroup;
import com.loyauty.model.Image;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.image.ImageServiceImpl;
import com.loyauty.util.CommonUtils;


public class BrandServiceImpl extends ServiceImpl implements BrandService {

	private static final Logger log = Logger.getLogger(BrandServiceImpl.class);
	
	@Setter 
	@Getter

	protected DaoManager daoManager;
	
	public BrandServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BrandDTO> getAllBrand() throws ServiceException {
			
		List<Brand> list = null;
		try {
			list = (List<Brand>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getBrandDao().getAllEntities();
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		
		return DTOFactory.getBrandListDTO(list);
		
	}

	@Override
	public Long createBrand(final BrandDTO brandDTO) throws ServiceException
	{
		Brand brandResult = new Brand();
		
		try 
		{
			daoManager.setCommitTransaction(true);
			brandResult = (Brand) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					
					Brand brand = new Brand();
					
					//Insert Image Brand
					Image imageBrand = new Image();
					imageBrand.setName(brandDTO.getImage().getName());
					imageBrand.setRealNameImg(brandDTO.getImage().getRealName());
					imageBrand.setType(Type.BRAND);
					imageBrand.setSize(brandDTO.getImage().getSize());
					imageBrand.setHeight(brandDTO.getImage().getHeight());
					imageBrand.setWidth(brandDTO.getImage().getWidth());
					imageBrand.setLarge(brandDTO.getImage().isLarge());
					imageBrand.setResolution(brandDTO.getImage().getResolution());
					imageBrand.setScore(brandDTO.getImage().getScore());
					daoManager.getImageDao().insertEntity(imageBrand);
					
					brand.setImage(imageBrand);
					brand.setName(brandDTO.getName());
					brand.setCode(brandDTO.getCode());
					brand.setSatisfact(brandDTO.getSatisfact());
					brand.setDescription(brandDTO.getDescription());
					
					daoManager.getBrandDao().insertEntity(brand);
					
					//iterate the long<s list and insert
					//you have id brand in brand.getId() after the insert
                   if(brandDTO.getCategoryGroupListLong()!= null)
                   {  
                	   int i = 0;
                	   BrandCategoryGroup categoryGroup = new BrandCategoryGroup(); 
                	   categoryGroup.setBrandid(brand.getId());
                	   while(i!=brandDTO.getCategoryGroupListLong().size() )
                	   {
                		   categoryGroup.setIdCategoryGroup(brandDTO.getCategoryGroupListLong().get(i));
                		   daoManager.getBrandDao().insertCatG(categoryGroup); 
                		   i++;
                	   }
                	   
                   }
					
					return brand;
				}
			});
			return(brandResult.getId());
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	@Override
	public void updateBrand(final BrandDTO brandDTO) throws ServiceException
	{
		try 
		{
		    daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					
					Brand brand = new Brand();
						
					//Insert Image brand
					Image imageBrand = new Image();
					imageBrand.setId(brandDTO.getImage().getId());
					imageBrand.setName(brandDTO.getImage().getName());
					imageBrand.setRealNameImg(brandDTO.getImage().getRealName());
					imageBrand.setType(Type.BRAND);
					imageBrand.setSize(brandDTO.getImage().getSize());
					imageBrand.setHeight(brandDTO.getImage().getHeight());
					imageBrand.setWidth(brandDTO.getImage().getWidth());
					imageBrand.setLarge(brandDTO.getImage().isLarge());
					imageBrand.setResolution(brandDTO.getImage().getResolution());
					imageBrand.setScore(brandDTO.getImage().getScore());
					//If the id image is null that means that the image is new.
					//So, Insert the image and update the product.
					if(brandDTO.getImage()== null)
					{
						daoManager.getImageDao().insertEntity(imageBrand);
					}
					
					brand.setId(brandDTO.getId());
					brand.setName(brandDTO.getName());
					brand.setCode(brandDTO.getCode());
					brand.setDescription(brandDTO.getDescription());
					brand.setImage(imageBrand);
					brand.setSatisfact(brandDTO.getSatisfact());
					daoManager.getBrandDao().updateEntity(brand);
					daoManager.getBrandDao().deleteCategoryGroupByBrandId(brand.getId());
					 if(brandDTO.getCategoryGroupListLong()!= null)
	                   {  
	                	   int i = 0;
	                	   BrandCategoryGroup categoryGroup = new BrandCategoryGroup(); 
	                	   categoryGroup.setBrandid(brand.getId());
	                	   while(i!=brandDTO.getCategoryGroupListLong().size() )
	                	   {
	                		   categoryGroup.setIdCategoryGroup(brandDTO.getCategoryGroupListLong().get(i));
	                		   daoManager.getBrandDao().insertCatG(categoryGroup); 
	                		   i++;
	                	   }
	                	   
	                   }
						
						return brand;
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));
		}
	}
	
	@Override
	public ImageDTO addBrandImage(File file, String fileName, String applicationPath, long uploaderId,
			 int width, int height, int miniCoverWidth, boolean large) throws ServiceException, IOException {
		ImageService ish = new ImageServiceImpl();
		Long tempId = new Long(0);
		Image image = new Image();
		image.setId(tempId);
		image.setUploaderId(uploaderId);
		
		// Validate if the name is already present in the DB
		String normalizedName= CommonUtils.getNormalizedBrandImage(fileName);
		//TODO: we must create a validation in action //Validate if the image extension is JPEG or PNG
		int i = ish.isJPEGPNGImage(file);
		if (i==1) {
			image.addImageJps(file,normalizedName,fileName);
		}else if (i==2) {
			image.addImagePNG(file,normalizedName,fileName);
		}else{
			throw new ServiceException("Brand Logo Image Format not supported " + file.getName() );
		}
		image.setName(normalizedName);
		image.setRealNameImg(fileName);
		//Variables Initialization 
		image.setType(Type.BRAND);
		image.setLarge(large);
		
		// Transfer the image to the server brand/large directory			
		if (!ish.transferBrandImage(file, normalizedName, applicationPath, width, height, miniCoverWidth, large)){
			throw new ServiceException("Could not transfer the image" + 
					"\nimageName:" + file.getName() 
					+ "\nNormalized image:" + normalizedName);
		}
				
		return DTOFactory.getImageDTO(image); 
	}
	
	@Override
	public BrandDTO getBrand(final long brandId) throws ServiceException{
		Brand brandResult = new Brand();
		
		try {
			daoManager.setCommitTransaction(true);
			brandResult = (Brand) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return daoManager.getBrandDao().getEntity(brandId);
				}
			});
			
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
		return(DTOFactory.getBrandDTO(brandResult));
	}
	
	@Override
	public boolean existBrand(String nameBrand)throws ServiceException {
		boolean exist = false;
		final Brand brand = new Brand();
		brand.setName(nameBrand);
		try {
			exist = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getBrandDao().existBrand(brand);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		return exist;
	}
	
	@Override
	public boolean existCode(final String code, final Long id)throws ServiceException {
		boolean exist = false;
		try {
			exist = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					Brand brand = new Brand();
					brand.setCode(code);
					brand.setId(id);
					return daoManager.getBrandDao().existCode(brand);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		return exist;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BrandDTO> getAllBrandByCategoryGroup(final Long catid) throws ServiceException {
		List<Brand> list = null;
		try {
			list = (List<Brand>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					
				Brand brand = new Brand();
				brand.setId(catid);
					return daoManager.getBrandDao().getAllBrandByCategoryGroup(catid);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		} 
		//return DTOFactory.getBrandDTO(brand);
		return DTOFactory.getBrandListDTO(list);
	}
	
}
