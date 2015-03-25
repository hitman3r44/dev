package com.loyauty.service.image;

import java.io.File;
import java.io.IOException;

import com.loyauty.exception.ImageCropException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Image;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.util.CommonUtils;
import com.loyauty.util.io.ImageInfo;

/**
 * Link service to treat
 * @author Diego
 *
 */
public interface ImageService extends Service{
	/**
	 * Transfer the product image to the product path in the system and 
	 * changes the name of the file using the parameters 
	 * @param sourceImageFile
	 * @param platform
	 * @param releaseZone
	 * @return
	 * @throws ServiceException
	 */
	boolean transferProductImage(File sourceImageFile, String normalizedName, 
			   String applicationPath, int width, int height, int miniProdcutWidth, boolean ProductTrans) throws ServiceException;

	/**
	 * Transfer the brand image to the brand path in the system and 
	 * changes the name of the file using the parameters 
	 * @param sourceImageFile
	 * @return
	 * @throws ServiceException
	 */
	boolean transferBrandImage(File sourceImageFile, String normalizedName, 
		   String applicationPath, int width, int height, int miniProdcutWidth, boolean ProductTrans)
		throws ServiceException;

	
	/**
	 * Transfer the profile image to the cover path in the system and 
	 * changes the name of the file using the parameters 
	 * @param sourceImageFile
	 * @param login
	 * @param userID
	 * @return
	 * @throws ServiceException
	 */
	boolean transferTemporaryImageProduct(File sourceImageFile,String fileLogoName, String login, long userID,String applicationPath)
		throws ServiceException;

	/**
	 * 
	 * limit gives that range.
	 * @param imageBrand
	 * @param fileBrandName
	 * @param gameId
	 * @param range range of scores to see: the best 4 or 3 or 2.
	 * @param applicationPath
	 * @return
	 * @throws ServiceException
	 */
	boolean isBestBrand(File imageBrand,String fileName, long brandId, int range) throws ServiceException;
	
	/**
	 * 
	 * limit gives that range.
	 * @param imageProduct
	 * @param fileProductName
	 * @param productId
	 * @param applicationPath
	 * @return
	 * @throws ServiceException
	 */
	boolean isBestProduct(File imageProduct,String fileName, long productId) throws ServiceException;
	
	/**
	 * True image corresponds jpeg format
	 * @param imageLogo
	 * @return
	 * @throws ServiceException
	 */
	boolean isJPEGImage(File imageLogo) throws ServiceException;
	boolean isJPEGImageName(String imageLogoName) throws ServiceException;	
	/**
	 * True image corresponds PNG format
	 * @param imageLogo
	 * @return
	 * @throws ServiceException
	 */
	boolean isPNGImage(File imageLogo) throws ServiceException;
	boolean isPNGImageName(String imageLogoName) throws ServiceException;	
	/**
	 * The format supported are : {@link ImageInfo#ImageInfo()}
	 * 	private static final String[] FORMAT_NAMES =
		{"JPEG", "GIF", "PNG", "BMP", "PCX", 
		 "IFF", "RAS", "PBM", "PGM", "PPM", 
		 "PSD"};
	 * @param imageLogo
	 * @return
	 */
	boolean isImage(File imageLogo);

	/**
	 * {@link ImageService#isJPEGImage(File)}
	 * {@link ImageService#isPNGImage(File)}
	 * @param imageLogo
	 * @return
	 * @throws ServiceException
	 */
	int isJPEGPNGImage(File imageLogo) throws ServiceException;
	int isJPEGPNGImage1(File imageLogo) throws ServiceException;
	boolean isJPEGPNGImageName(String imageLogoName) throws ServiceException;	
	
	/**
	 * True if the normalized brand name is already present in the DB
	 * @param gameID
	 * @param imageBrand
	 * @param uploaderId
	 * @return
	 * @throws ServiceException
	 */
	boolean imageBrandNameExist(long brandId, File imageBrand)
		throws ServiceException;
	
	/**
	 * True if the normalized product name is already present in the DB
	 * @param productID
	 * @param imageProduct
	 * @return
	 * @throws ServiceException
	 */
	boolean imageProductNameExist(long productId, String imageProductName) throws ServiceException;

	Long addImageProduct(ImageDTO imageDTO) throws ServiceException, IOException;
	
	Long addImageBrand(ImageDTO imageDTO) throws ServiceException, IOException;

	void updateImageProduct(ImageDTO imageDTO) throws ServiceException, IOException;
	
	void updateImageBrand(ImageDTO imageDTO) throws ServiceException, IOException;
	
	ImageDTO getImage(Long imageId) throws ServiceException, IOException;
	
}