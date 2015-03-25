package com.loyauty.web.struts.action.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class productAdminXLS extends LoyautyAction{
	private static final long serialVersionUID = -8730372014253451459L;

	private ProductService productService;
	private UserService userService;
	@Getter @Setter
	private InputStream fileInputStream;
	@Getter @Setter
	private String fileName="";
	@Getter @Setter
	private Long tmpid;
	@Getter @Setter
	private Integer init;
	@Getter @Setter
	private List<ProductDTO> productDTOList;
	public productAdminXLS() throws ServiceLocatorException {
		super();
		productService = getServiceLocator().getProductService();
		userService = getServiceLocator().getUserService();
		productDTOList=new ArrayList<ProductDTO>();
	}
	
	@Override  
	public String execute() throws Exception {	
		HttpSession session = request.getSession(true);
		String filePath = session.getServletContext().getRealPath("/");
		String filePathData=filePath+"WEB-INF/jsp/product/data/";
		SimpleDateFormat frm=new SimpleDateFormat("dd/MM/yyyy");
		try{

			/*-------------------- Create a file XLS from orders list ---------------------
					  The system will create a XLS file with the client login name
	 		 ------------------------------------------------------------------------------*/
			
			if(init==null)init=0;
			if(tmpid==null)tmpid=0L;//templateId
			ClientCategoryDTO template=userService.getClientCategoryById(tmpid);
			if(template==null)tmpid=0L;
			frm=new SimpleDateFormat("ddMMyyyy");
			Date date=new Date();
			String strDate=frm.format(date);
			
			switch (init) {
			case 1: // get XLS File for list
				productDTOList = productService.getProductsClassification(tmpid);
				productService.generateAdminXLS(productDTOList,filePathData);
				fileInputStream = new FileInputStream(new File( filePathData+"productClassificat.xls"));
				fileName="productCassification_"+strDate+".xls";
				break;
			default:
				break;
			
			}
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
