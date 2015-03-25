package com.loyauty.service.image;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.dao.core.DaoManager;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.io.FileUtils;
import com.loyauty.util.io.ImageTransformer;
import com.loyauty.util.io.SCPTransferFile;

public class ImageServiceHelperImpl implements ImageServiceHelper {
	private static int DISTANCE_BETWEEN_IMAGE = 3; //in px
	private static int NUMBER_BEST_IMAGE_AUTHORIZED = 4;
	@Setter
	private DaoManager daoManager;
	@Getter
	ServiceLocator serviceLocator;

	private static String PRODUCT;
	private static String PRODUCT_LARGE;
	private static String PRODUCT_THUMB;
	
	private static String BRAND;
	private static String BRAND_THUMB;
	private static String BRAND_MINI_THUMB;
	private static String BRAND_SEARCH_THUMB;
	
	private final static String SLAGE="/";

	private static String TEMPORARY_PROFILE_LOCATION;	
	/**
	 * @param daoManager
	 */
	public ImageServiceHelperImpl(DaoManager daoManager,
			ServiceLocator serviceLocator) {
		super();
		this.daoManager = daoManager;
		this.serviceLocator = serviceLocator;
		try {
			if(PRODUCT == null ){
			    	PRODUCT = serviceLocator.getConfigService().getPathWebProductLocation() + SLAGE;
			    	PRODUCT_LARGE = PRODUCT + "large" + SLAGE;
			    	PRODUCT_THUMB = PRODUCT + "thumbnail" + SLAGE;
			}			
			if(BRAND == null ){			
			    	BRAND = serviceLocator.getConfigService().getPathWebBrandLocation() + SLAGE;				
			    	BRAND_THUMB = BRAND + "thumb" + SLAGE;
			    	BRAND_MINI_THUMB = BRAND + "minithumb" + SLAGE;
			    	BRAND_SEARCH_THUMB = BRAND + "searchthumb" + SLAGE;
			}
			if(TEMPORARY_PROFILE_LOCATION == null ){
				TEMPORARY_PROFILE_LOCATION = serviceLocator.getConfigService().getPathTemporaryLocation() + SLAGE;
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

	@Override
	public	boolean transferProductImage(File sourceImageFile, String normalizedName, int platform, int releaseZone, 
							   String applicationPath, int width, int height, int miniCoverWidth, boolean coverTrans) throws ServiceException {
		
		Map<String, String> destSources = new HashMap<String, String>();
		
		String largDestPath 	= applicationPath + PRODUCT_LARGE + normalizedName;
		String destPath 		= applicationPath + PRODUCT + normalizedName;
		String ThumbCoverPath 	= applicationPath + PRODUCT_THUMB + normalizedName;
		
		int miniCoverheight =  (int) (((double) height / (double) width ) * miniCoverWidth ); 
		
		if( coverTrans ){
			this.transferFile(sourceImageFile, largDestPath);
			destSources.put(largDestPath, PRODUCT_LARGE);
		}
		this.transferThumbFile(sourceImageFile, new File(destPath), width, height);
		this.transferThumbFile(sourceImageFile, new File(ThumbCoverPath), miniCoverWidth, miniCoverheight);
	
		destSources.put(destPath, PRODUCT);
		destSources.put(ThumbCoverPath, PRODUCT_THUMB);
		
		return SCPTransferFile.cspTranferFileServer(destSources);
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
	
	
	
	

	

}
