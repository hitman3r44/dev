package com.loyauty.service.image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Type;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ImageCropException;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.Image;
import com.loyauty.model.Product;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.io.FileUtils;
import com.loyauty.util.io.ImageTransformer;


public class ImageServiceImpl extends ServiceImpl implements ImageService {

	private static final Logger log = Logger.getLogger(ImageServiceImpl.class);

	
	private static String PRODUCT;
	private static String PRODUCT_LARGE;
	private static String PRODUCT_THUMB;
	
	private static String BRAND;
	private static String BRAND_LARGE;
	private static String BRAND_THUMB;
	private static String BRAND_MINI_THUMB;
	private static String BRAND_SEARCH_THUMB;
	private static int WidthL=200;
	private static int HeightL=200;
	private static int WidthT=135;
	private static int HeightT=135;
	private final static String SLAGE="/";

	private static String TEMPORARY_PROFILE_LOCATION;	
	

	
	@Setter	@Getter
	protected DaoManager daoManager;

	public ImageServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
		try {
			if(PRODUCT == null ){
			    	PRODUCT = getServiceLocator().getConfigService().getPathWebProductLocation()+SLAGE;
					//PRODUCT = "/media/product/";
			    	PRODUCT_LARGE = PRODUCT + "large" + SLAGE;
			    	PRODUCT_THUMB = PRODUCT + "thumbnail" + SLAGE;
			}			
			if(BRAND == null ){			
			    	BRAND = getServiceLocator().getConfigService().getPathWebBrandLocation()+SLAGE;	
			    	BRAND_LARGE = BRAND + "large" + SLAGE;
			    	BRAND_THUMB = BRAND + "thumb" + SLAGE;
			    	BRAND_MINI_THUMB = BRAND + "minithumb" + SLAGE;
			    	BRAND_SEARCH_THUMB = BRAND + "searchthumb" + SLAGE;
			}
			if(TEMPORARY_PROFILE_LOCATION == null ){
				TEMPORARY_PROFILE_LOCATION = getServiceLocator().getConfigService().getPathTemporaryLocation()+SLAGE;
			}
			
		} catch (ServiceLocatorException e) {
			new ServiceException(e);
		}
	}

	/**
	 * Transfer the file to the directory destination path
	 * @param sourceImageFile
	 * @param destinationPath
	 * @return
	 * @throws ServiceException
	 */
	private boolean transferFile(File sourceImageFile, String destinationPath)
			throws ServiceException {
		
		File destImageFile = new File(destinationPath);
		try {
			FileUtils.copyfile(sourceImageFile, destImageFile);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			new ServiceException(e);
		}
		return false;
	}

	/**
	 * Transfer the file to the directory destination path
	 * @param sourceImageFile
	 * @param destinationPath
	 * @return
	 * @throws ServiceException
	 */
	private boolean transferThumbFile(File sourceFile,File destinationFile, int width, int height)
			throws ServiceException {
		try {
			
			ImageTransformer.resizeAndSave(sourceFile, destinationFile, width, height, 1.0f);

	        return true;
			
		} catch (Exception  e) {
			e.printStackTrace();
			new ServiceException(e);
		}
		return false;
	}
	
	@Override
	public boolean transferProductImage(File sourceImageFile, String normalizedName, 
		   String applicationPath, int width, int height, int miniProdcutWidth, boolean ProductTrans) throws ServiceException {
				
		String largDestPath 	= applicationPath + PRODUCT_LARGE + normalizedName;
		String destPath 	= applicationPath + PRODUCT + normalizedName;
		String ThumbProductPath = applicationPath + PRODUCT_THUMB + normalizedName;
		
		int miniProductheight =  (int) (((double) height / (double) width ) * miniProdcutWidth ); 
		
		if( ProductTrans ){
			this.transferFile(sourceImageFile, largDestPath);
		}
		return this.transferThumbFile(sourceImageFile, new File(destPath), width, height) &&
			   this.transferThumbFile(sourceImageFile, new File(ThumbProductPath), miniProdcutWidth, miniProductheight);
	}


	@Override
	public boolean transferBrandImage(File sourceImageFile, String normalizedName, 
		   String applicationPath, int width, int height, int miniBrandWidth, boolean brandTrans)
		throws ServiceException {
	    	String largDestPath 	= applicationPath + BRAND_LARGE + normalizedName;
		String destPath 	= applicationPath + BRAND + normalizedName;
		String ThumbBrandPath 	= applicationPath + BRAND_THUMB + normalizedName;
		
		int miniBrandheight =  (int) (((double) height / (double) width ) * miniBrandWidth ); 
		 
		/*if( brandTrans ){
			this.transferFile(sourceImageFile, largDestPath);
		}
		return this.transferThumbFile(sourceImageFile, new File(destPath), width, height) &&
			   this.transferThumbFile(sourceImageFile, new File(ThumbBrandPath), miniBrandWidth, miniBrandheight);
		 	*/
		if( brandTrans ){
			this.transferFile(sourceImageFile, destPath);
		}
		return this.transferThumbFile(sourceImageFile, new File(largDestPath), WidthL, HeightL) &&
			   this.transferThumbFile(sourceImageFile, new File(ThumbBrandPath), WidthT, HeightT);
		 
		
		
	}

	@Override
	public boolean transferTemporaryImageProduct(File sourceImageFile,String fileProductName, String login,
			long userID,String applicationPath) throws ServiceException {
		
		CommonUtils.logMessage(log, "transferTemporaryImageProduct");		
		String tempDest = this.getProfileTemporaryPath(fileProductName, login, userID);		
		String destPath = applicationPath+tempDest;
		return this.transferFile(sourceImageFile, destPath);
	}
	
	@Override
	public boolean isBestBrand(File imageBrand,String fileName, long brandId, int range) throws ServiceException{
		CommonUtils.logMessage(log, "isBestBrand");
		boolean result = false;

		CommonUtils.logMessage(log, result);
		return result;
	}
	
	@Override
	public boolean isBestProduct(File imageProduct,String fileName, long productId) throws ServiceException{
		CommonUtils.logMessage(log, "isBestProduct");
		boolean result = false;

		CommonUtils.logMessage(log, result);
		return result;
	
	}
	
	@Override
	public boolean isJPEGImage(File imageLogo) throws ServiceException {
		CommonUtils.logMessage(log, "isJPEGImage");
		try {
			return FileUtils.isJpgePng(imageLogo)==1;
		} catch (IOException e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public boolean isJPEGImageName(String imageLogoName) throws ServiceException {
		CommonUtils.logMessage(log, "isJPEGImage");
		boolean result = false;
		

		CommonUtils.logMessage(log, result);
		return result;
	}
	
	@Override
	public boolean isPNGImage(File imageLogo) throws ServiceException {
		CommonUtils.logMessage(log, "isPNGImage");
		boolean result = false;

		CommonUtils.logMessage(log, result);
		return result;
	}
	
	@Override
	public boolean isPNGImageName(String imageLogoName) throws ServiceException {
		CommonUtils.logMessage(log, "isPNGImage");
		boolean result = false;
		

		CommonUtils.logMessage(log, result);
		return result;
	}
	
	@Override
	public int isJPEGPNGImage(File imageLogo) throws ServiceException {
		try {
			return FileUtils.isJpgePng(imageLogo);
		} catch (IOException e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public int isJPEGPNGImage1(File imageLogo) throws ServiceException {
		CommonUtils.logMessage(log, "isJPEGPNGImage");
		int result = -1;
		
		
		CommonUtils.logMessage(log, result);
		return result;
	}

	
	@Override
	public boolean isJPEGPNGImageName(String imageLogoName) throws ServiceException {
		CommonUtils.logMessage(log, "isJPEGPNGImage");
		boolean result = isPNGImageName(imageLogoName) || isJPEGImageName(imageLogoName);
		return result;
	}



	@Override
	public boolean isImage(File imageLogo) {
		try {
			return FileUtils.isImage(imageLogo);
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	@Override
	public boolean imageBrandNameExist(long brandId, File imageBrand) throws ServiceException {
		CommonUtils.logMessage(log, "imageBrandNameExist");
		boolean result = false;

		CommonUtils.logMessage(log, result);
		return result;
	}

	@Override
	public boolean imageProductNameExist(long productId, String imageProductName) throws ServiceException {
		CommonUtils.logMessage(log, "imageProductNameExist");
		boolean result = false;

		CommonUtils.logMessage(log, result);
		return result;
	}
	
	@Override
	public Long addImageProduct(ImageDTO imageDTO) throws ServiceException, IOException{
		final Image image = new Image();
		//image.addImageJps(imageDTO.getFile(), imageDTO.getName(), imageDTO.getRealName());
		image.setHeight(imageDTO.getHeight());
		image.setName(imageDTO.getName());
		image.setRealNameImg(imageDTO.getRealName());
		image.setResolution(imageDTO.getResolution());
		image.setScore(imageDTO.getScore());
		image.setSize(imageDTO.getSize());
		image.setType(Type.PRODUCT);
		image.setWidth(imageDTO.getWidth());
		image.setLarge(imageDTO.isLarge());
		Long imageId = null;
		
		try {
			daoManager.setCommitTransaction(true);
			imageId = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
				    	daoManager.getImageDao().insertEntity(image);
					return (image.getId());
				}
			});
			
		} catch (DaoException de) {
			de.printStackTrace();
		}
		return(imageId);
	}
	
	@Override
	public void updateImageProduct(ImageDTO imageDTO) throws ServiceException, IOException{
		final Image image = new Image();
		//image.addImageJps(imageDTO.getFile(), imageDTO.getName(), imageDTO.getRealName());
		//image.setId(imageDTO.getId());
		//image.setType(Type.PRODUCT);
		image.setId(imageDTO.getId());
		image.setHeight(imageDTO.getHeight());
		image.setName(imageDTO.getName());
		image.setRealNameImg(imageDTO.getRealName());
		image.setResolution(imageDTO.getResolution());
		image.setScore(imageDTO.getScore());
		image.setSize(imageDTO.getSize());
		image.setType(Type.PRODUCT);
		image.setWidth(imageDTO.getWidth());
		image.setLarge(imageDTO.isLarge());
		
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
				    	daoManager.getImageDao().updateEntity(image);
					return (image.getId());
				}
			});
			
		} catch (DaoException de) {
			de.printStackTrace();
		}
	}
	
	/**
	 * get the normalized Profile name and path to save the profile
	 * @param name
	 * @param login
	 * @param userID
	 * @return
	 */
	private String getProfileTemporaryPath(String name, String login, long userID) {
		String[] file = CommonUtils.splitNameFile(name);
		return TEMPORARY_PROFILE_LOCATION + login + "_" + userID + "." + file[1];
	}
	
	@Override
	public Long addImageBrand(ImageDTO imageDTO) throws ServiceException, IOException{
		final Image image = new Image();
		//image.addImageJps(imageDTO.getFile(), imageDTO.getName(), imageDTO.getRealName());
		image.setHeight(imageDTO.getHeight());
		image.setName(imageDTO.getName());
		image.setRealNameImg(imageDTO.getRealName());
		image.setResolution(imageDTO.getResolution());
		image.setScore(imageDTO.getScore());
		image.setSize(imageDTO.getSize());
		image.setType(Type.BRAND);
		image.setWidth(imageDTO.getWidth());
		image.setLarge(imageDTO.isLarge());
		Long imageId = null;
		
		try {
			daoManager.setCommitTransaction(true);
			imageId = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
				    	daoManager.getImageDao().insertEntity(image);
					return (image.getId());
				}
			});
			
		} catch (DaoException de) {
			de.printStackTrace();
		}
		return(imageId);
	}
	
	@Override
	public void updateImageBrand(ImageDTO imageDTO) throws ServiceException, IOException {
		final Image image = new Image();
		image.setId(imageDTO.getId());
		image.setHeight(imageDTO.getHeight());
		image.setName(imageDTO.getName());
		image.setRealNameImg(imageDTO.getRealName());
		image.setResolution(imageDTO.getResolution());
		image.setScore(imageDTO.getScore());
		image.setSize(imageDTO.getSize());
		image.setType(Type.BRAND);
		image.setWidth(imageDTO.getWidth());
		image.setLarge(imageDTO.isLarge());
		
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
				    	daoManager.getImageDao().updateEntity(image);
					return (image.getId());
				}
			});
			
		} catch (DaoException de) {
			de.printStackTrace();
		}
	}
	
	@Override
	public ImageDTO getImage(final Long imageId) throws ServiceException, IOException {
	
		Image image = new Image();
		try {
			daoManager.setCommitTransaction(true);
			image = (Image) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
						throws DaoException {
					return (daoManager.getImageDao().getEntity(imageId));
				}
			});			
		} catch (DaoException de) {
			de.printStackTrace();
		}
		return(DTOFactory.getImageDTO(image));
	}
}
