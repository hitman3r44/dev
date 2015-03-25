package com.loyauty.service.image;

import java.io.File;

import com.loyauty.exception.ImageCropException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Image;



/**
 * helps the service to do the logic
 *
 */
public interface ImageServiceHelper {
	/**
	 * {@link ImageService#transferCoverImage()}
	 * @param sourceImageFile
	 * @param platform
	 * @param releaseZone
	 * @return
	 * @throws ServiceException
	 */
	boolean transferProductImage(File sourceImageFile, String normalizedName, int platform, int releaseZone, 
			   String applicationPath, int widthThumLogo, int widthMiniCover, int miniCoverWidth, boolean coverTrans) throws ServiceException;


	
}
