package com.loyauty.web.struts.action.loadFile;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.core.dto.ImageDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.image.ImageService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;


/**
 * Reads an <code>application/octet-stream</code> and writes it to a file.
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @author Allan O'Driscoll
 * @version 1.0
 * 
 * modified by Mounir
 */
public class AjaxUploadFile extends LoyautyAction implements ServletResponseAware {

    private static final long serialVersionUID = 6748857432950840322L; 
    
    private static final int IMAGE_WIDTH_FIXED   = 200; //PX  
    
    private static String realPath;
    
    private ImageService imageService;
    private ProductService productService;
    private BrandService brandService;
    private UserService userService;
    
    @Getter @Setter
    private long productId;
    @Getter @Setter
    private long brandId;
    @Getter @Setter
    private long imageId;
    @Getter @Setter
    private long userId;
  //uploading files
    @Getter @Setter
    private File qqfile;
	@Getter @Setter
	private String qqfileContentType;
	@Getter @Setter
	private String qqfileFileName;
	
	private File localFile;
	private String localFilename;
	private Dimension dim;

	private int width;
	private int height;	
	
	@Getter @Setter
	private HttpServletResponse servletResponse;

    /**
     * {@inheritDoc}
     * @param config
     * @throws ServletException
     */
    public AjaxUploadFile() throws ServiceLocatorException, ServiceException {
    	productService = getServiceLocator().getProductService();
    	imageService = getServiceLocator().getImageService();
    	userService = getServiceLocator().getUserService();
    	brandService = getServiceLocator().getBrandService();
    	this.width = 1;
    	this.height = 1;
    }
    
    public String uploadImage() throws Exception {    	
    	PrintWriter writer = null;
    	
        try {        	
        		writer = servletResponse.getWriter();
				fileType();
				long userId = ((UserSessionDTO) request.getSession().getAttribute(WebConstants.USER)).getId();				
				imageService = getServiceLocator().getImageService();
				realPath = request.getSession().getServletContext().getRealPath("/");				
				if( localFile == null){					 
					 writer.print("{success:'', msg: '" + getText("loyauty.error.common.required") + "'}" );						
				} else if(!imageService.isJPEGImage(localFile) ) {		
					 writer.print("{success:'', msg: '" + getText("loyauty.error.common.content.type_jpg") + "'}" );	
				} else if(localFile.length() > WebConstants.BRAND_SIZE_ALLOWED){					 
					 writer.print("{success:'', msg: '" + getText("loyauty.error.common.fileTooLarge") + "'}" );		
				} else {
					if (dim == null)  {
						dim = getDimension(localFile.getAbsolutePath());
					}			
					
					boolean isLarge = dim.getWidth() >= width * WebConstants.COVER_LARGE_TRANSFERT_COEFICIENT;
					
					double ratio = (double) Math.round((dim.getHeight()/dim.getWidth())*100)/(double) 100;
					int thumbHeight = (int) (WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH * ratio);
					
					//This means that there are not any image for this product
					//Insert the image and return the id image
					Long imageInsertId = null;
					ImageDTO img = null;
					
					width = (int) dim.getWidth();
					height = (int) dim.getHeight();
					
					if(imageId == 0) {
						if(productId != 0) {
							
							img = productService.addProductImage(localFile, localFilename, realPath, userId, 
									WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH, 
									thumbHeight, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge);
							
							imageInsertId = imageService.addImageProduct(img);
						} else if(brandId != 0) {
							img = brandService.addBrandImage(localFile, localFilename, realPath, userId, 
									width, height, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge);
							imageInsertId = imageService.addImageBrand(img);
						} 						
						writer.print("{success: true, name: '" + img.getName() + "', width: '" + 
					            img.getWidth() + "', height: '" + img.getHeight() + "', size: '" + img.getSize() +
					            "', imageId: '" + imageInsertId +"'}");
					} else {
						if(productId != 0) {
							/*img = productService.addProductImage(localFile, localFilename, realPath, userId, 
									width, height, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge);
							*/
							img = productService.addProductImage(localFile, localFilename, realPath, userId, 
									WebConstants.PRODUCT_DEFAUTL_THUMBNAIL_WIDTH, 
									thumbHeight, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge);
							
							img.setId(imageId);
							imageService.updateImageProduct(img);
						} else if(brandId != 0) {
							img = brandService.addBrandImage(localFile, localFilename, realPath, userId, 
									width, height, WebConstants.WIDTH_IMG_SEARCH_PAGE, isLarge);
							img.setId(imageId);
							imageService.updateImageBrand(img);
						}
							
						writer.print("{success: true, name: '" + img.getName() + "', width: '" + 
					            img.getWidth() + "', height: '" + img.getHeight() + "', size: '" + 
					            img.getSize() + "', imageId: '" + img.getId() + "'}");
					}
				} 
			}
			catch (FileNotFoundException ex) {
	            writer.print("{success: '', msg: '" + getText("loyauty.error.common.service") + "'}" );
	            managerException(ex);
			} 
			catch (IOException ex) {	            
	            writer.print("{success: '', msg: '" + getText("loyauty.error.common.service") + "'}" );	
	            managerException(ex);
			} 
			catch(ServiceException ex){
	            writer.print("{success: '', msg: '" + getText("loyauty.error.common.service") + "'}" );	
	            managerException(ex);
	        } 
			
		servletResponse.setStatus(HttpServletResponse.SC_OK);
        writer.flush();
        writer.close();
		
		return NONE;

    }
     
    public String uploadProfileImage() throws Exception {    	
    	PrintWriter writer = null;
        
        try {
			writer = servletResponse.getWriter();  		
			
			UserSessionDTO userSession = (UserSessionDTO) request.getSession().getAttribute(WebConstants.USER);
			fileType();

			imageService = getServiceLocator().getImageService();
			realPath = request.getSession().getServletContext().getRealPath("/");
						        
			if( localFile == null){					 
				writer.print("{success: false, msg: '" + getText("loyauty.error.common.required") + "'}" );						
			} else if( !imageService.isJPEGImage(localFile) ) {					 
				writer.print("{success: false, msg: '" + getText("loyauty.error.common.content.type_jpg") + "'}" );	
			} else if(localFile.length() > WebConstants.PROFILE_SIZE_ALLOWED ) {					 
				writer.print("{success: false, msg: '" + getText("loyauty.error.common.fileTooLarge") + "'}" );		
			} else {				
				ImageDTO img = userService.transferProfileImage(userSession.getId(), localFilename, 
							 localFile, realPath, userSession.getId(), userSession.getLogin() );     	            
		           
				// fixe width and heigth in edit profile page
					
				float ratio = (float) IMAGE_WIDTH_FIXED / (float) img.getWidth() ;
				int height = (int) ((int) img.getHeight() * ratio);
				int width = IMAGE_WIDTH_FIXED;
					
				writer.print("{success: true, name: '" + img.getName() + "', width: '" + 
							width + "', height: '" + height + "', ratio: '" + ratio +"'}");      
			} 
	            
			
		} catch (FileNotFoundException ex) {
			writer.print("{success: false, msg: '" + getText("loyauty.error.common.service") + "'}" );
			managerException(ex);
		} catch (IOException ex) {	            
			writer.print("{success: false, msg: '" + getText("loyauty.error.common.service") + "'}" );
			managerException(ex);
		} catch(ServiceException ex){
			writer.print("{success: false, msg: '" + getText("loyauty.error.common.service") + "'}" );
			managerException(ex);
		} catch (Exception e) {
			managerException(e);
		}
			
		servletResponse.setStatus(HttpServletResponse.SC_OK);
        writer.flush();
        writer.close();
		
		return NONE;
    }
    
    private void fileType() throws IOException {    	
        InputStream is = null;
        FileOutputStream fos = null;        
        // firefox and other
        
        if (qqfile == null) {        	
        	localFilename = request.getParameter("qqfile");         	
			localFile = new File(localFilename);						 
			is = request.getInputStream();	           
	        fos = new FileOutputStream( localFile );
	        IOUtils.copy(is, fos);
	        
	        if(fos != null )
	        	fos.close();
	        if(is != null)
	        	is.close();
        } else {	// IE 7, 8        	
        	localFilename = qqfileFileName;
        	localFile = qqfile;        
        }        
    }
    
    public Dimension getDimension(String filename) {
    	Dimension outcome = new Dimension(1, 1);
    	 try {	
    		 File f = new File(filename);
    		 BufferedImage image = ImageIO.read(f);
    		 int height = image.getHeight();
    		 int width = image.getWidth();
    		 outcome = new Dimension(width, height);
    	 } catch (IOException ioe) {	
    		 ioe.printStackTrace();
    	 }
    	 return outcome;
    }
	

}
