package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.io.FileUtils;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.ItemMapDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class OrdersFileMapper extends LoyautyAction {

	private static final long serialVersionUID = -4456834673L;

	private OrdersService orderService;
	private UserService userService;

	@Getter @Setter
	private UserFileRecoveryDTO ufrDTO;
	@Getter @Setter
	private List<ItemMapDTO> columnNo;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private String userLogo;
	@Getter @Setter
	private Long userId;
	@Getter @Setter
	private File fileToUpload;
	@Getter @Setter
	private String uploadedFileName;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private String message;
	@Getter @Setter
	private Integer selectedFileType;
	@Getter @Setter
	private Integer btUploadClicked;
	@Getter @Setter
	private Integer btGetMappingClicked;
	@Getter @Setter
	private String showConfirmSaveUserMapPop;
	@Getter @Setter
	private String showSuccessSaveUserMapPop;
	@Getter @Setter
	private String showSaveSuccessPop;
	@Getter @Setter
	private String showNotificationMissingFieldsPop;
	@Getter @Setter
	private Integer saveOrderMap;
	@Getter @Setter
	private Integer saveOrderMapConfirmed;
	/*@Getter @Setter
	private UsersPrivilegesDTO userPrivileges;*/

	public OrdersFileMapper() throws ServiceLocatorException{
		super();
		orderService = getServiceLocator().getOrderService();
		userService = getServiceLocator().getUserService();
		ufrDTO=new UserFileRecoveryDTO();
		if(columnNo==null)columnNo = new ArrayList<ItemMapDTO>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {

		try{
			HttpSession session = request.getSession(true);
			//recovered all users
			showConfirmSaveUserMapPop="visibility:hidden;display:none;";
			showSaveSuccessPop="visibility:hidden;display:none;";
			showNotificationMissingFieldsPop="visibility:hidden;display:none;";
			User userSelectd=(User)session.getAttribute("userSelectd");
			List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
			userLogo=(String)session.getAttribute("userLogo");
			if(usersListSession==null){
				BasicUserDTO basicUserDTO = new BasicUserDTO();
				basicUserDTO.setTypeId(USER_TYPE);
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

			/*-------------------- When Admin Find User Login ---------------------------
									check userId and his logo
		 	-----------------------------------------------------------------------------*/
			userSelectd=userService.getUserByLogin(userLogin);
			userLogo=null;
			userId=null;
			if(userSelectd!=null){
				//show user logo
				userLogo="./images/orders/usersLogos/"+userLogin+".png";
				userId=userSelectd.getId();
			}
			//if userLogo dosn't exist give him a blank logo
			String filePath = session.getServletContext().getRealPath("/");
			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");
			session.setAttribute("userLogo",userLogo);
			session.setAttribute("userId",userId);
			session.setAttribute("userSelectd",userSelectd);

			//if userLogo dosn't exist give him a blank logo
			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");

			columnNo=(List<ItemMapDTO>)session.getAttribute("columnNo");
			if(columnNo==null)columnNo = new ArrayList<ItemMapDTO>();

			//get list if button upload is not null and it is -1. once upload button is clicked its value will change to 1.
			if(btUploadClicked != null && btUploadClicked == 1 && saveOrderMap!=1){
				columnNo = new ArrayList<ItemMapDTO>();

				//get file uploaded with a name and extension
				String filePathData = filePath + "WEB-INF/jsp/orders/data/";

				// ------------------ Uploading  file  -----------------------
				if(selectedFileType==null)	selectedFileType=-1;
				String fileNameToSave="FileToMap";
				File destFile = new File(filePathData+fileNameToSave); // destination file
				if(destFile.exists())destFile.delete();

				// -- Check if the file uploaded and the file type are compatible ----
				if(!compatibleFileExtension(uploadedFileName, selectedFileType)){
					addActionError("The File type selected and the file selected are not compatible");
					return SUCCESS;
				}

				// upload file
				switch (selectedFileType) {
				case 1:
					ufrDTO.setFileType("xml");
					fileNameToSave=fileNameToSave+".xml";
					destFile = new File(filePathData, fileNameToSave);
					FileUtils.copyFile(fileToUpload, destFile);
					break;
				case 2:
					ufrDTO.setFileType("xls");
					fileNameToSave=fileNameToSave+".xls";
					destFile = new File(filePathData, fileNameToSave);
					FileUtils.copyFile(fileToUpload, destFile);
					break;
				case 3:
					ufrDTO.setFileType("csv");
					destFile = new File(filePathData+userLogin+".csv");
					FileUtils.copyFile(fileToUpload, destFile);
					//orderService.mapCSVToXLS(filePathData,"FileToMap");
					orderService.csvParsing(filePathData,userLogin);
					destFile = new File(filePathData+userLogin+".xls"); // destination file
					break;
				}

				try {
					// Populate the combobox with the values of column of file.
					columnNo = orderService.getItemsUserFileMapping(destFile,selectedFileType);
					session.setAttribute("columnNo",columnNo);
					//Get the Order file map details if they already exists.
					ufrDTO=orderService.getUserFileRecoveryByUser(userLogin);
				}catch (IOException e) {
					e.printStackTrace();
					addActionError("The File type selected and the file selected are not compatible");
					userLogo=null;
					session.setAttribute("userLogo",null);
					return "input";
				}
				if(userId==null)userLogin="";
			}
			if(userSelectd!=null){
				userId=userSelectd.getId();
				userLogin=userSelectd.getLogin();
			}
			if (ufrDTO!= null && saveOrderMap!= null && saveOrderMap==1){
				UserFileRecoveryDTO validateUfrDTO = new UserFileRecoveryDTO();
				validateUfrDTO = validateUfrDTO(ufrDTO);
				if(validateUfrDTO != null){
					//showConfirmSaveUserMapPop="visibility:hidden;display:none;";
					message="";
					if(saveOrderMapConfirmed!=null && saveOrderMapConfirmed==1){
						ufrDTO = prepareUserFileRecovery(ufrDTO , selectedFileType);
						ufrDTO.setUserId(userId);
						//ufrDTO.setFileTypeIdConfirm(selectedFileType);
						ufrDTO.setFileTypeId(selectedFileType);
						boolean result = orderService.insertUserFileRecovery(ufrDTO);
						if(result==true){
							message="One row inserted Succesfully";
						}else{
							message="The system encountered a problem and can not save this map";
						}
						showSaveSuccessPop="display:block;visibility:visible;";
						return SUCCESS;	
					}
				}else{
					message="Please fill all required fields.";
					showNotificationMissingFieldsPop="display:block;visibility:visible;";
					return SUCCESS;	
				}
				message="Are you sure, you want to save the Customer map?";
				showConfirmSaveUserMapPop="display:block;visibility:visible;";
			}
			//get the mapping without the file.
			if(btGetMappingClicked != null && btGetMappingClicked == 1){
				columnNo = new ArrayList<ItemMapDTO>();
				ufrDTO=orderService.getUserFileRecoveryByUser(userLogin);
			}


		} catch (Exception e) {
			addActionError("Please select the correct file format.");
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}

	/*=========================  createUserLogo ===========================
	 				Create  Blank User Logo if not Exist
	  =====================================================================*/
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
	/*=========================  Fill the UserFileRecoveryDTO =======================================
	 				Fill the UserFileRecoveryDTO with default values, if user did not select any value
	  ================================================================================================*/
	public UserFileRecoveryDTO prepareUserFileRecovery(UserFileRecoveryDTO ufrDTO, Integer selectedFileType) throws Exception{
		switch (selectedFileType) {
		case 1: // xml
			break;
		case 2: case 3:// for xls and CSV
			if(ufrDTO.getProductOrderNumber()==null || ufrDTO.getProductOrderNumber().equals("")) ufrDTO.setProductOrderNumber("0");
			if(ufrDTO.getClientOrderNumber()==null || ufrDTO.getClientOrderNumber().equals("")) ufrDTO.setClientOrderNumber("0");
			if(ufrDTO.getCstProductNumber()==null || ufrDTO.getCstProductNumber().equals("")) ufrDTO.setCstProductNumber("0");
			if(ufrDTO.getProductOrderDate()==null || ufrDTO.getProductOrderDate().equals("")) ufrDTO.setProductOrderDate("0");
			if(ufrDTO.getClientNumber()==null || ufrDTO.getClientNumber().equals("")) ufrDTO.setClientNumber("0");
			if(ufrDTO.getClientFirstName()==null || ufrDTO.getClientFirstName().equals("")) ufrDTO.setClientFirstName("0");
			if(ufrDTO.getClientLastName()==null || ufrDTO.getClientLastName().equals("")) ufrDTO.setClientLastName("0");
			if(ufrDTO.getClientStreet()==null || ufrDTO.getClientStreet().equals("")) ufrDTO.setClientStreet("0");
			if(ufrDTO.getClientOtherStreet()==null || ufrDTO.getClientOtherStreet().equals("")) ufrDTO.setClientOtherStreet("0");
			if(ufrDTO.getClientCity()==null || ufrDTO.getClientCity().equals("")) ufrDTO.setClientCity("0");
			if(ufrDTO.getClientPostalCode()==null || ufrDTO.getClientPostalCode().equals("")) ufrDTO.setClientPostalCode("0");
			if(ufrDTO.getClientProvince()==null || ufrDTO.getClientProvince().equals("")) ufrDTO.setClientProvince("0");
			if(ufrDTO.getClientPhone()==null || ufrDTO.getClientPhone().equals("")) ufrDTO.setClientPhone("0");
			if(ufrDTO.getClientEmail()==null || ufrDTO.getClientEmail().equals("")) ufrDTO.setClientEmail("0");
			if(ufrDTO.getLsProductID()==null || ufrDTO.getLsProductID().equals("")) ufrDTO.setLsProductID("0");
			if(ufrDTO.getProductDescription()==null || ufrDTO.getProductDescription().equals("")) ufrDTO.setProductDescription("0");
			if(ufrDTO.getUnitPrice()==null || ufrDTO.getUnitPrice().equals("")) ufrDTO.setUnitPrice("0");
			if(ufrDTO.getCompanyHeader()==null || ufrDTO.getCompanyHeader().equals("")) ufrDTO.setCompanyHeader("0");
			if(ufrDTO.getFileTypeId()==null || ufrDTO.getFileTypeId().equals("")) ufrDTO.setFileTypeId(2);
			if(ufrDTO.getQuantity()==null || ufrDTO.getQuantity().equals("")) ufrDTO.setQuantity("0");
			if(ufrDTO.getTagRoot()==null || ufrDTO.getTagRoot().equals("")) ufrDTO.setTagRoot("0");
			if(ufrDTO.getShippingCompany()==null || ufrDTO.getShippingCompany().equals("")) ufrDTO.setShippingCompany("0");
			if(ufrDTO.getRequiredDate()==null || ufrDTO.getRequiredDate().equals("")) ufrDTO.setRequiredDate("0");
			if(ufrDTO.getClientOtherNames()==null || ufrDTO.getClientOtherNames().equals("")) ufrDTO.setClientOtherNames("0");
			if(ufrDTO.getClientPhoneZone()==null || ufrDTO.getClientPhoneZone().equals("")) ufrDTO.setClientPhoneZone("0");
			if(ufrDTO.getFormatDate()==null || ufrDTO.getFormatDate().equals("")) ufrDTO.setFormatDate("0");
			if(ufrDTO.getNotes()==null || ufrDTO.getNotes().equals("")) ufrDTO.setNotes("0");
			if(ufrDTO.getClientProductNumber()==null || ufrDTO.getClientProductNumber().equals("")) ufrDTO.setClientProductNumber("0");
			if(ufrDTO.getClientOtherId()==null || ufrDTO.getClientOtherId().equals("")) ufrDTO.setClientOtherId("0");
			if(ufrDTO.getProvidedLsProductId()==null || ufrDTO.getProvidedLsProductId().equals("")) ufrDTO.setProvidedLsProductId("0");
			if(ufrDTO.getFileTypeIdConfirm()==null || ufrDTO.getFileTypeIdConfirm().equals("")) ufrDTO.setFileTypeIdConfirm(0);
			if(ufrDTO.getFileFormatIdComfirm()==null || ufrDTO.getFileFormatIdComfirm().equals("")) ufrDTO.setFileFormatIdComfirm(3);
			break;
		}
		return ufrDTO;
	}
	/*=========================  Validate the DTO ===========================================
	 				Method used to validate that all the required filed are present
	=========================================================================================*/
	public UserFileRecoveryDTO validateUfrDTO(UserFileRecoveryDTO validateUfrDTO) {
		if(validateUfrDTO.getProductOrderNumber()== null || validateUfrDTO.getProductOrderNumber().equals("")||
				validateUfrDTO.getClientPostalCode()== null || validateUfrDTO.getClientPostalCode().equals("") ||
				validateUfrDTO.getClientProvince()== null || validateUfrDTO.getClientProvince().equals("") ||
				validateUfrDTO.getLsProductID()== null || validateUfrDTO.getLsProductID().equals("") ||
				validateUfrDTO.getUnitPrice()== null || validateUfrDTO.getUnitPrice().equals("") ||
				validateUfrDTO.getQuantity()== null || validateUfrDTO.getQuantity().equals("")){
			return null;
		}
		return validateUfrDTO;
	}
	/*=========================  check the extension of the file ===========================
	 				Check the file extension of the file selected by user.
	========================================================================================*/
	private boolean compatibleFileExtension(String fileName , int selectedFileType){
		boolean result= false;
		String ext = "";
		int index = 0;
		if(fileName != null && fileName.length()> 0){
			index =fileName.lastIndexOf(".");
			if(index>0)ext= fileName.substring(index+1);   
		}
		if(selectedFileType==1 && ext.equalsIgnoreCase("xml")){
			result = true;
		}
		else if(selectedFileType==2 && ext.equalsIgnoreCase("xls")){
			result = true;
		}
		else if(selectedFileType==3 && ext.equalsIgnoreCase("csv")){
			result = true;
		}
		return result;
	}
}
