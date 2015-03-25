package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;
import javax.servlet.http.HttpSession;

public class UploadAdminXLS extends LoyautyAction {

	private static final long serialVersionUID = 6649940042042023814L;
	private OrdersService orderService;
	private UserService userService;
	private ProductService productService;
	@Getter @Setter
	private File fileXLS;
	@Getter @Setter
	private String myFileContentType;
	@Getter @Setter
	private String myFileFileName;
	@Getter @Setter
	private String destPath;
	@Getter @Setter
	private String message="";
	@Getter @Setter
	private String showNotificationPop;
	@Getter @Setter
	private String showWaitPop;
	@Getter @Setter
	private Long okNotificationPop;
	@Getter @Setter
	private int init;
	@Getter @Setter
	private List<User> usersList;
	@Getter @Setter
	private String userLogo;
	@Getter @Setter
	StringBuffer rapportError;
	@Getter @Setter
	private String userLogin;
	private User user;
	private String userAdminLogin;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private List<ProductDTO>listProductDTOFormXLS;
	@Getter @Setter
	private Integer doUpdate;
	@Getter @Setter
	List<ProductDTO> listProductNotFound;
	@Getter @Setter
	List<OrdersDTO> etaFieldNamesList;
	@Getter @Setter
	private String etaFieldName;
	@Getter @Setter
	private Boolean enabledEtaComboList;
	@Getter @Setter
	private Long changeEtaFieldNameSignal;
	@Getter @Setter
	private Long enabledEtaComboListSignal;
	@Getter @Setter
	private Long findEtaFieldNameSignal;
	
	@Getter @Setter
	List<OrdersDTO> secondEtaFieldNamesList;
	@Getter @Setter
	private String secondEtaFieldName;
	@Getter @Setter
	private Boolean enabled2dEtaComboList;
	
	@Getter @Setter
	private Long change2dEtaFieldNameSignal;
	@Getter @Setter
	private Long enabled2dEtaComboListSignal;
	@Getter @Setter
	private Long find2dEtaFieldNameSignal;
	
	private List<OrdersDTO> etaOrdersList;
	@Getter @Setter
	private Boolean withTowColumns;
	@Getter @Setter
	private Long withTowColumnsSignal;
	public UploadAdminXLS()throws ServiceLocatorException{
		super();
		orderService = getServiceLocator().getOrderService();
		userService = getServiceLocator().getUserService();
		productService=getServiceLocator().getProductService();
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public String execute() throws Exception {
		rapportError=new StringBuffer();
		showNotificationPop="visibility:hidden;display:none;";
		showWaitPop="visibility:hidden;display:none;";
		HttpSession session = request.getSession(true);
		User userAdmin=(User)session.getAttribute("userAdmin");
		init=(Integer)session.getAttribute("init");
		userLogo=(String)session.getAttribute("userLogo");
		listProductDTOFormXLS=(List<ProductDTO>)session.getAttribute("listProductDTOFormXLS");
		if(listProductDTOFormXLS==null)listProductDTOFormXLS=new ArrayList<ProductDTO>();
		etaFieldNamesList=(List<OrdersDTO>)session.getAttribute("etaFieldNamesList");
		if(etaFieldNamesList==null)etaFieldNamesList=new ArrayList<OrdersDTO>();
		
		secondEtaFieldNamesList=(List<OrdersDTO>)session.getAttribute("secondEtaFieldNamesList");
		if(secondEtaFieldNamesList==null)secondEtaFieldNamesList=new ArrayList<OrdersDTO>();
		
		enabledEtaComboList=(Boolean)session.getAttribute("enabledEtaComboList");
		if(enabledEtaComboList==null)enabledEtaComboList=false;
		
		enabled2dEtaComboList=(Boolean)session.getAttribute("enabled2dEtaComboList");
		if(enabled2dEtaComboList==null)enabled2dEtaComboList=false;
		
		withTowColumns=(Boolean)session.getAttribute("withTowColumns");
		if(withTowColumns==null)withTowColumns=false;
		System.out.println("############ etaFieldName:"+etaFieldName);
		// -------------------------- recovery users if not exit --------------------
		BasicUserDTO basicUserDTO = new BasicUserDTO();
		basicUserDTO.setTypeId(USER_TYPE);
		List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
		if(usersListSession==null){
			List<UserSessionDTO> listAllUsers= userService.getAllUsers(basicUserDTO);
			usersList=new ArrayList<User>();
			for(UserSessionDTO userDTO:listAllUsers){
				User user=new User();
				user.setId(userDTO.getId());
				user.setLogin(userDTO.getLogin());
				usersList.add(user);
			}
			session.setAttribute("usersListSession",usersList);
		}else usersList=usersListSession;

		// ----------------- quit immediately if admin not sign in correctly -----------
		if(userAdmin==null){
			userAdminLogin="";
			return SUCCESS;	
		}else{
			userAdminLogin=userAdmin.getLogin();
		}

		// --------------- quit immediately if just notification response(OK) ----------
		if(okNotificationPop!=null && okNotificationPop!=0L){
			rapportError=(StringBuffer)session.getAttribute("rapportError");
			return SUCCESS;	
		}

		// ------------------------ check the file name destination --------------------
		etaOrdersList=new ArrayList<OrdersDTO>();
		session.setAttribute("etaOrdersList",etaOrdersList);
		String fileNameToSave="error.xls";
		if(fileXLS!=null || (doUpdate!=0 && doUpdate!=null)){
			switch (init) {
			case 1:fileNameToSave="ordersAdminImport.xls";
			break;
			case 2:fileNameToSave="stock.xls";
			break;
			case 3:fileNameToSave="specialShipping.xls";
			break;
			case 4:fileNameToSave="etaOrders.xls";
			break;
			default:
				rapportError=null;
				session.setAttribute("rapportError",null);
				return SUCCESS;	
			}

			/*---------------- retrieve file info customer order -------------------------*/
			user=userService.getUserByLogin(userLogin);
			session.setAttribute("userLogin",userLogin);
			if(user==null && init==3){
				userLogo=null;
				session.setAttribute("userLogo",null);
				rapportError=null;
				session.setAttribute("rapportError",null);
				addActionError(getText("loyauty.error.common.userNotFound"));
				return SUCCESS;
			}

			//show user logo
			userLogo="./images/orders/usersLogos/"+userLogin+".png";
			session.setAttribute("userLogo",userLogo);
			String filePath = session.getServletContext().getRealPath("/");
			String filePathData = filePath + "WEB-INF/jsp/orders/data/";

			//if userLogo dosn't exist give him a blank logo
			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");
			if(etaFieldName==null)etaFieldName="Select ETA Column";
			if(doUpdate==null || doUpdate==0){
				// ----------------------------------- Upload file xls ----------------------------------
				File destFileXLS = new File(filePathData+fileNameToSave);
				if(destFileXLS.exists())destFileXLS.delete();

				try {
					destFileXLS = new File(filePathData, fileNameToSave);
					FileUtils.copyFile(fileXLS, destFileXLS);

				} catch (IOException e) {
					e.printStackTrace();
					showNotificationPop="display:block;visibility:visible;";
					message="The system to a problem.\nCheck that the file is in XLS format";
					rapportError=null;
					session.setAttribute("rapportError",null);
					userLogo=null;
					session.setAttribute("userLogo",null);
					return "input";
				}
				/*--------------------------------------------------------------------------------*/
			}

			try {

				switch (init) {
				case 1: // Update orders from manifest xls file
					orderService.updateOrdersRowsFromAdminXLS(userAdminLogin,filePathData);
					message="Update of Orders status is successfully completed";
					break;
				case 2: // Update stock from  xls file
					if(doUpdate!=null && doUpdate!=0){
						productService.updateStock(listProductDTOFormXLS);
						listProductDTOFormXLS=new ArrayList<ProductDTO>();
						session.setAttribute("listProductDTOFormXLS", listProductDTOFormXLS);
						message="Update of Stock is successfully completed";
					}else{
						listProductDTOFormXLS=productService.listStockFromXLS(filePath, filePathData);
						listProductNotFound=productService.getProductNotFound(listProductDTOFormXLS);
						session.setAttribute("listProductDTOFormXLS", listProductDTOFormXLS);
						message="Uploading file is successfully completed";
					}
					System.out.println("listProductDTOFormXLS.size="+listProductDTOFormXLS.size());
					break;
				case 3: // Update special shipping from  xls file
					orderService.updateSpecialShippingFromXLS(rapportError,userAdminLogin,user.getId(),filePathData);
					message="Saving Shipping Rate is successfully completed";
					break;
					
				case 4:  // prepare orders list from xls ETA file for ETA report, to generate this report  
						 // look at the class OrdersAdminXLS.java
					if(withTowColumnsSignal!=null && withTowColumnsSignal!=0L){
						withTowColumns=!withTowColumns;
						session.setAttribute("withTowColumns",withTowColumns);
						return SUCCESS;
					}
					if(changeEtaFieldNameSignal!=null && changeEtaFieldNameSignal!=0L){
						orderService.updateEtaFieldName(userLogin,etaFieldName);
						enabledEtaComboList=true;
						session.setAttribute("enabledEtaComboList",enabledEtaComboList);
						return SUCCESS;	
					}

					//get (default)eta_field_name and 2d ETA Field name
					if(findEtaFieldNameSignal!=null && findEtaFieldNameSignal!=0L){
						UserFileRecoveryDTO ufr=orderService.getUserFileRecoveryByUser(userLogin);
						if(ufr!=null && ufr.getEtaFieldName()!=null){
							etaFieldName=ufr.getEtaFieldName();
							enabledEtaComboList=true;
							secondEtaFieldName=ufr.getSecondEtaFieldName();
							enabled2dEtaComboList=true;
							session.setAttribute("enabled2dEtaComboList",enabled2dEtaComboList);					
							session.setAttribute("enabledEtaComboList",enabledEtaComboList);
						}
						return SUCCESS;
					}
					if(enabledEtaComboListSignal!=null && enabledEtaComboListSignal!=0L){
						enabledEtaComboList=!enabledEtaComboList;
						session.setAttribute("enabledEtaComboList",enabledEtaComboList);
						return SUCCESS;
					}
					
					//get 2d eta_field_name
					/*if(find2dEtaFieldNameSignal!=null && find2dEtaFieldNameSignal!=0L){
						UserFileRecoveryDTO ufr=orderService.getUserFileRecoveryByUser(userLogin);
						if(ufr!=null && ufr.getEtaFieldName()!=null){
							secondEtaFieldName=ufr.getSecondEtaFieldName();
							enabled2dEtaComboList=true;
							session.setAttribute("enabled2dEtaComboList",enabled2dEtaComboList);
						}
						return SUCCESS;
					} */
					// change 2d ETA Field name
					if(change2dEtaFieldNameSignal!=null && change2dEtaFieldNameSignal!=0L){
						orderService.updateSecondEtaFieldName(userLogin,secondEtaFieldName);
						enabled2dEtaComboList=true;
						session.setAttribute("enabled2dEtaComboList",enabled2dEtaComboList);
						return SUCCESS;	
					}
					// enabled 2d ETA comboList
					if(enabled2dEtaComboListSignal!=null && enabled2dEtaComboListSignal!=0L){
						enabled2dEtaComboList=!enabled2dEtaComboList;
						session.setAttribute("enabled2dEtaComboList",enabled2dEtaComboList);
						return SUCCESS;
					}

					System.out.println("[Class:uploadAdminXLS/Method:execute]---> Generate ETA List[etaOrdersList] And save it in session");
					if(etaFieldName==null || etaFieldName.equals("")){
						message="ETA Column Name is required";
						addActionError(getText("loyauty.error.common.ETA_FieldEmpty"));
						break;
					}
					etaOrdersList=orderService.getEtaOrdersList(etaFieldName,secondEtaFieldName,user.getId(),filePathData);
					session.setAttribute("etaOrdersList",etaOrdersList);
					session.setAttribute("allOrdersSelectedSignal",1L);
					message="ETA XLS File is successfully Uploaded";
					break;
				default:
					return SUCCESS;	
				}
				
				session.setAttribute("rapportError",rapportError);
				showNotificationPop="display:block;visibility:visible;";
			} catch (Exception e) {
				rapportError=null;
				session.setAttribute("rapportError",null);
				userLogo=null;
				session.setAttribute("userLogo",null);
				addActionError(getText("loyauty.error.common.fileMustBeXLS"));
			}
			return SUCCESS;
		}else{
			showNotificationPop="display:block;visibility:visible;";
			message="The file is empty !";
			rapportError=null;
			session.setAttribute("rapportError",null);
			userLogo=null;
			session.setAttribute("userLogo",null);
			addActionError(getText("loyauty.error.common.fileUpload"));
			return "input";
		}
		
		

	}

	/*=========================  createUserLogo ===========================
	 				Create  Blank User Logo if not Exist
	  =================================================================*/
	public void createUserLogo(String source, String destination) throws IOException{
		File fileLogo=new File(destination);
		if(!fileLogo.exists()){
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(destination);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();	
		}
	}

}
