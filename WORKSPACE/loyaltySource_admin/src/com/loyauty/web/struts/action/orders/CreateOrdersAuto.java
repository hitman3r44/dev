package com.loyauty.web.struts.action.orders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.User;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.UserFileDataRecoveryDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class CreateOrdersAuto extends LoyautyAction {
	private static final long serialVersionUID = -1238269595572206024L;

	private UserService userService;
	private OrdersService orderService;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private File orderFile;
	@Getter @Setter
	List<OrdersDTO>listOrdersDTO;
	Hashtable<String, OrdersDTO>hashOrders;
	@Getter @Setter
	private String orderSelected;
	@Getter @Setter
	private Long showOrderSignal;
	@Getter @Setter
	private Long okShowOrderSignal;
	@Getter @Setter
	private Long saveOrdersSignal;
	@Getter @Setter
	private Long confirmSaveOrdersSignal;
	@Getter @Setter
	private Long duplicateOrderSignal;
	@Getter @Setter
	private String lsOrderId;
	@Getter @Setter
	private String message;
	@Getter @Setter
	private String userLogo;
	@Getter @Setter
	Integer indexOrder;
	@Getter @Setter
	Integer indexRow;
	@Getter @Setter
	private Double quantityToChange;
	@Getter @Setter
	private Long quantityToChangeSignal;
	@Getter @Setter
	private Long checkBoxPrintSignal;
	@Getter @Setter
	private Long okSaveSuccessPopSignal;
	@Getter @Setter
	private Boolean checkBoxPrintEtem;
	@Getter @Setter
	private Boolean checkBoxPrint;
	@Getter @Setter
	private Long pageTop=0L;
	@Getter @Setter
	private Integer notSaved;
	@Getter @Setter
	private String showNotificationPop="visibility:hidden;display:none;";
	@Getter @Setter
	private String showSaveSuccessPop="visibility:hidden;display:none;";
	private Boolean listNotSavedAtFirst;
	@Getter @Setter
	private String oploadedFileName;
	private Integer nbProductOrderNumber;
	public  CreateOrdersAuto() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
		listOrdersDTO=new ArrayList<OrdersDTO>();
	}

	/*=========================================================================================
	 											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		hashOrders=new Hashtable<String, OrdersDTO>();
		HttpSession session = request.getSession(true);
		listOrdersDTO=	(ArrayList<OrdersDTO>)session.getAttribute("listOrdersDTOAuto");
		notSaved=orderService.nbOrdersNotSaved(listOrdersDTO);
		boolean isThereDuplicate=orderService.isThereDuplicate(listOrdersDTO);
		if(isThereDuplicate)notSaved=1;
		userLogo=(String)session.getAttribute("userLogo");
		listNotSavedAtFirst=(Boolean)session.getAttribute("listNotSavedAtFirst");
		int rowIndex;
		String nameFile="";
		String dataPath="";
		try {
				/*-------------------- recovery users list -----------------------------------
						we access to the database only once to retrieve a list of users
				 -----------------------------------------------------------------------------*/
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
				
				/*-------------------- When user check print item -----------------------------
						Add or remove this element from the orders to print
		 		 -----------------------------------------------------------------------------*/
				if(checkBoxPrintSignal!=null && checkBoxPrintSignal!=0L){
					listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOAuto");
					hashOrders= (Hashtable<String, OrdersDTO>)session.getAttribute("hashOrders");
					Integer count=orderService.nbOrdersNotSaved(listOrdersDTO);
					if(count>=1L || isThereDuplicate || listNotSavedAtFirst==null || listNotSavedAtFirst==false){
						addActionError(getText("loyauty.error.common.savingOrders"));
						return SUCCESS;
					}
					OrdersDTO orderDTOInHash=hashOrders.get(lsOrderId);
					orderDTOInHash.setPrint(checkBoxPrint);
					OrdersDTO orderDTOInList=listOrdersDTO.get(indexOrder);
					orderDTOInList.setPrint(checkBoxPrint);
					return SUCCESS;
				}


				/*------------- When user check on the button OK of dialog saveSuccessPop ----
							 			just hide the popup saveSuccessPop
		 		 -----------------------------------------------------------------------------*/
				if(okSaveSuccessPopSignal!=null && okSaveSuccessPopSignal!=0L){
					notSaved=0;
					listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOAuto");
					return SUCCESS;
				}

				/*-------------------- When user change Quantity to split --------------------
					prepare order to split from two other orders witch
					 one must have a lsOrder with underscore 
		 		 -----------------------------------------------------------------------------*/
				if(quantityToChangeSignal!=null && quantityToChangeSignal!=0L){
					listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOAuto");
					hashOrders= (Hashtable<String, OrdersDTO>)session.getAttribute("hashOrders");
					Integer count=orderService.nbOrdersNotSaved(listOrdersDTO);
					if(count>=1L || isThereDuplicate  || listNotSavedAtFirst==null || listNotSavedAtFirst==false){
						addActionError(getText("loyauty.error.common.savingOrders"));
						return SUCCESS;
					}
					OrdersDTO orderToChangeQt=hashOrders.get(lsOrderId);
					int index=orderToChangeQt.getIndex();
					OrdersRows orderRow=listOrdersDTO.get(index).getRowsList().get(indexRow);
					if(quantityToChange<orderRow.getQuantity()){
						orderRow.setQuantityToSplit(quantityToChange);
						orderToChangeQt.getRowsList().get(0).setQuantityToSplit(quantityToChange);
					}
					session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
					return SUCCESS;
				}

				/*-------------------- SAVE ORDERS -------------------------------------------
						save in data bases just orders witch has print checked 
		 		 -----------------------------------------------------------------------------*/
				if(saveOrdersSignal!=null && saveOrdersSignal!=0L){
					notSaved=orderService.nbOrdersNotSaved(listOrdersDTO);
					nbProductOrderNumber=getNbProductOrderNumber(listOrdersDTO);
					listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOAuto");
					boolean callNotification=orderService.isExistAnyLsOrderIdInDB(listOrdersDTO);
					if(callNotification){//ask admin if he want to save all orders
						if(confirmSaveOrdersSignal==null || confirmSaveOrdersSignal==0L){
							message="This File is already Imported in DB !!!!!.\n";
							showNotificationPop="display:block;visibility:visible;";	
						}else if(confirmSaveOrdersSignal==1L){//add all orders in DB
							//notSaved=0;
							session.setAttribute("listNotSavedAtFirst",true);
							message="Saving has completed successfuly";
							if(notSaved==nbProductOrderNumber){
								listOrdersDTO=orderService.insertListOrders(listOrdersDTO); 
							}else{
								message="Saving has not done successfuly !!!!!!";
							}
							session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
							hashOrders =orderService.getHashOrdersDTOFromListOrdersDTO(listOrdersDTO);
							session.setAttribute("hashOrders",hashOrders);
							
							showSaveSuccessPop="display:block;visibility:visible;";
						}/*else if(confirmSaveOrdersSignal==2L){//add just orders if not exist in DB
							//notSaved=0;
							//orderService.insertListOrdersIfNotExist(listOrdersDTO);
							session.setAttribute("listNotSavedAtFirst",true);
							message="Saving has completed successfuly";
							if(notSaved==nbProductOrderNumber){
								listOrdersDTO=orderService.insertListOrders(listOrdersDTO);
							}else{
								message="Saving has not done successfuly !!!!!!";
							}
							
							listOrdersDTO=orderService.getListOrdersByPONumber(listOrdersDTO);
							hashOrders =orderService.getHashOrdersDTOFromListOrdersDTO(listOrdersDTO);
							session.setAttribute("hashOrders",hashOrders);
							session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
							
							showSaveSuccessPop="display:block;visibility:visible;";
						}*/
					}else{
						//notSaved=0;
						session.setAttribute("listNotSavedAtFirst",true);
						message="Saving has completed successfuly";
						showSaveSuccessPop="display:block;visibility:visible;";
						if(notSaved!=null && notSaved.equals(nbProductOrderNumber)){
							listOrdersDTO=orderService.insertListOrders(listOrdersDTO);
						}else{
							message="Saving has not done successfuly !!!!!!";
						}
						session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
					}
					return SUCCESS;
				}

				/*-------------------- Duplicate Order ----------------------------------------
						Create order in just in memory
		 		 -----------------------------------------------------------------------------*/
				if(duplicateOrderSignal!=null && duplicateOrderSignal!=0L){
				listOrdersDTO=	(ArrayList<OrdersDTO>) session.getAttribute("listOrdersDTOAuto");
				hashOrders= (Hashtable<String, OrdersDTO>)session.getAttribute("hashOrders");
				Integer count=orderService.nbOrdersNotSaved(listOrdersDTO);
				if(count>=1L || isThereDuplicate || listNotSavedAtFirst==null || listNotSavedAtFirst==false){
					addActionError(getText("loyauty.error.common.savingOrders"));
					return SUCCESS;
				}
				OrdersDTO orderToClone=hashOrders.get(lsOrderId);
				int index=orderToClone.getIndex();
				OrdersDTO orderInArrayList=listOrdersDTO.get(index);
				orderInArrayList.setToUpdate(true);
				OrdersDTO orderClone=DTOFactory.getOrderDTOSplitted(orderToClone);
				orderInArrayList.setQuantity(orderToClone.getQuantity());
				if(orderClone!=null){
					orderClone.setDuplicate(true);
					String lsOrder=orderToClone.getLsOrderId();
					String strlsOrder=orderService.generateLsOrderId(lsOrder, hashOrders);
					orderClone.setLsOrderId(strlsOrder);
					orderClone.setCssStyle("background-color:#FFFF99;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
					rowIndex=0;
					for(OrdersRows row: orderClone.getRowsList()){
						row.setIndex(rowIndex);
						rowIndex++;
					}
					notSaved=0;
					listOrdersDTO.add(indexOrder+1,orderClone);
					hashOrders.put(orderClone.getLsOrderId(), orderClone);
					if(listOrdersDTO.size()>0){
						session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
						session.setAttribute("hashOrders",hashOrders);
					}
				}
				notSaved=orderService.nbOrdersNotSaved(listOrdersDTO);
				isThereDuplicate=orderService.isThereDuplicate(listOrdersDTO);
				if(isThereDuplicate)notSaved=1;
				return SUCCESS;
				}

				/*---------------- retrieve file info customer order -------------------------*/
				UserFileRecoveryDTO ufrDTO=orderService.getUserFileRecoveryByUser(userLogin);
				session.setAttribute("userLogin",userLogin);
				if(ufrDTO==null || orderFile==null){
					userLogo=null;
					session.setAttribute("userLogo",null);
					addActionError(getText("loyauty.error.common.userFilePoOrders"));
					return SUCCESS;
				}
				/*--------------------recovery OrderFile client ------------------------------
					recovered the client file and converts it into a list, and  
 					a Hatable witch allow use to control the orders rows
				 -----------------------------------------------------------------------------*/
				File OrderFilePermanent=null;
				session.setAttribute("listNotSavedAtFirst",null);
				if(orderFile!=null){
					session.setAttribute("oploadedFileName",oploadedFileName);
					String filePath = request.getSession().getServletContext().getRealPath("/");
					dataPath = filePath + "WEB-INF/jsp/orders/data/";
        			nameFile=dataPath+userLogin+"."+ufrDTO.getFileType();
        			//show user logo
        			userLogo="./images/orders/usersLogos/"+userLogin+".png";
        			

        			//if userLogo dosn't exist give him a blank logo
        			createUserLogo(filePath +"images/orders/usersLogos/BLANK.png", filePath +"images/orders/usersLogos/"+userLogin+".png");
        			
        			
        			session.setAttribute("userLogo",userLogo);
        			OrderFilePermanent = new File(nameFile);
					if(OrderFilePermanent.exists())OrderFilePermanent.delete();
					try {
						OrderFilePermanent = new File(nameFile);
						FileUtils.copyFile(orderFile, OrderFilePermanent);
					} catch (IOException e) {
						addActionError(getText("loyauty.error.common.CreateOrdersFromFiles"));
						e.printStackTrace();
						return "input";
					}
				}
				/*-------------------- converts the order file to a list and HashTable -------
					recovered the client file and converts it into a list, and  
 					a Hashtable witch allow use to control the orders rows
				 -----------------------------------------------------------------------------*/
				Collection listUsrDataDTO=null;
				notSaved=1;
				try {
					switch (ufrDTO.getFileTypeId()) {
					case 1: //case xml file
						if(userLogin.equalsIgnoreCase("Rideau")){
							listUsrDataDTO=orderService.toArrayListFromXML_Rideau(OrderFilePermanent, userLogin,oploadedFileName);
							if(listUsrDataDTO.size()==0){
								addActionError(getText("loyauty.error.common.FileSeqNotValid"));
								return SUCCESS;
							}
						}
						else{
						listUsrDataDTO=orderService.toArrayListFromXML(OrderFilePermanent, userLogin);
						}
						break;
					case 2: //case xls file
						listUsrDataDTO=orderService.toArrayListFromXLS(OrderFilePermanent, userLogin);
						break;
					case 3: // case csv file
						orderService.csvParsing(dataPath,userLogin);
						nameFile=dataPath+userLogin+".xls";
						OrderFilePermanent = new File(nameFile);
						listUsrDataDTO=orderService.toArrayListFromXLS(OrderFilePermanent, userLogin);
						break;
					case 4: // case pdf file
						try {
							List<String> listFromPdf = getListOfLinesFromPDF(nameFile);
							if(listFromPdf==null) {
								System.out.println("Parsing from PDF is not done. The file selected is not PDF or is too big more than 100KB.");
								addActionError(getText("loyauty.error.common.CreateOrdersFromFiles"));
								return "input";
							}
							listUsrDataDTO = orderService.toArrayListFromListOfPDFLines(listFromPdf, userLogin);
						} catch(Exception e) {
							addActionError(getText("loyauty.error.common.CreateOrdersFromFiles"));
							return "input";
						}
						break;
					}
				} catch (Exception e) {
					addActionError(getText("loyauty.error.common.CreateOrdersFromFiles"));
				}
				
				ArrayList<UserFileDataRecoveryDTO> list=(ArrayList<UserFileDataRecoveryDTO>)listUsrDataDTO;
				hashOrders =orderService.getHashOrdersFromUserDataRecovery(ufrDTO.getUserId(),list);
				listOrdersDTO=new ArrayList<OrdersDTO>();
				int balance=0;
				int OrderIndex=0;
				rowIndex=0;
				oploadedFileName=(String)session.getAttribute("oploadedFileName");
				
				//currency
				User user = null;
				if(userLogin!=null)user=userService.getUserByLogin(userLogin);
				Long userId = null;
				Long currencyId = 1L;
				String currencySymbol = "CAD";
				Double currencyRate = 1D;
				Double currencyUnitPrice = 0D;
				Double currencyTotalPrice = null;
				Double unitPrice = null;
				if(user!=null) {
					userId = user.getId();
					CurrencyDTO currencyDTO = orderService.getCurrencyIdByUserId(userId);
					if(currencyDTO!=null) {
						currencyId = currencyDTO.getId();
						if(currencyDTO.getSymbol()!=null) currencySymbol = currencyDTO.getSymbol();
						if(currencyDTO.getRate()!=null) currencyRate = currencyDTO.getRate();
					}
				}
				
				for(OrdersDTO orDTO: hashOrders.values()){
					balance=(balance==1?0:1);
					if(balance==1){
						orDTO.setCssStyle("background-color: rgb(245,249,252);border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
					}else{
						orDTO.setCssStyle("background-color: color:white;border-right: 1px solid #CCCCCC;border-left:1px solid #CCCCCC;border-top:  1px solid #CCCCCC;border-bottom:  1px solid #CCCCCC;");
					}
					//if(!userLogin.equalsIgnoreCase("Rideau"))
					//	orDTO.setOrderFileInfo(oploadedFileName);

					//add special handling shipping	+ currency
					user=null;
					if(userLogin!=null)user=userService.getUserByLogin(userLogin);
					if(user!=null){
						Double totalPrice=null;
						orDTO.setSpecialHandlingName(user.getSpecialHandlingName());
						orDTO.setSpecialHandlingFee(user.getSpecialHandlingFee());
						if(orDTO.getRowsList().get(0).getQuantity()!=null && orDTO.getRowsList().get(0).getUnitPrice()!=null){
							unitPrice = orDTO.getRowsList().get(0).getUnitPrice();
							totalPrice=orDTO.getRowsList().get(0).getQuantity()*unitPrice;
							totalPrice = (double) Math.round(totalPrice*100)/100;
							if(currencyId!=1) {
								currencyUnitPrice = unitPrice;
								unitPrice = (double) Math.round((unitPrice/currencyRate)*100) / 100;
								orDTO.setUnitPrice(unitPrice);
								orDTO.getRowsList().get(0).setUnitPrice(unitPrice);
								currencyTotalPrice = totalPrice;
								totalPrice = (double) Math.round((totalPrice/currencyRate)*100) / 100;
							}
						}
						if(orDTO.getRowsList().get(0).getUnitPrice()==null) {
							currencyUnitPrice = null;
							currencyTotalPrice = null;
						}
						orDTO.setTotalPrice(totalPrice);
						orDTO.setCurrencyId(currencyId);
						orDTO.setCurrencySymbol(currencySymbol);
						orDTO.setCurrencyRate(currencyRate);
						orDTO.setCurrencyUnitPrice(currencyUnitPrice);
						orDTO.setCurrencyTotalPrice(currencyTotalPrice);
					}
					//user=userService.getUserByLogin(userLogin);
					orDTO.setIndex(OrderIndex); 
					listOrdersDTO.add(orDTO);
					rowIndex=0;
					for(OrdersRows row: orDTO.getRowsList()){
						row.setIndex(rowIndex);
						//Currency
						row.setIndex(rowIndex);
						row.setCurrencyId(currencyId);
						row.setCurrencySymbol(currencySymbol);
						row.setCurrencyRate(currencyRate);
						row.setCurrencyUnitPrice(currencyUnitPrice);
						
						rowIndex++;
					}
					OrderIndex++;
				}
				if(listOrdersDTO.size()>0){
					session.setAttribute("listOrdersDTOAuto",listOrdersDTO);
					session.setAttribute("hashOrders",hashOrders);
				}else userLogo=null;
				session.setAttribute("userLogo",userLogo);	
			} catch (Exception e) {
				e.printStackTrace();
				return "input";
			}
	return SUCCESS;
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

	/*================  getNbProductOrderNumber ===========================
	 				calculate count off productOrderNumber
	  =================================================================*/
	public Integer getNbProductOrderNumber(List<OrdersDTO>listOrders) throws IOException{
		Hashtable<Object, Object>hashTab=new Hashtable<Object, Object>();
		for(OrdersDTO ordDTO:listOrders){
			if(!hashTab.contains(ordDTO.getProductOrderNumber()))hashTab.put(ordDTO.getProductOrderNumber(), ordDTO.getProductOrderNumber());
		}
		return hashTab.size();
	}
	
	/*===============================================================================
	 	Method: getTextFromExtractingPDF
	 	returns a String from the pdf file  
	  ===============================================================================*/
	public String getTextFromPDF(String nameFile) throws Exception{
		String result = null;
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		File file = new File(nameFile);
		try {
			if(file.length() <= 1024*1024) {
				PDFParser parser = new PDFParser(new FileInputStream(file));
				parser.parse();
				cosDoc = parser.getDocument();
		        pdfStripper = new PDFTextStripper();
		        pdDoc = new PDDocument(cosDoc);
		        pdfStripper.setStartPage(1);
		        pdfStripper.setEndPage(5);
		        result = pdfStripper.getText(pdDoc);
			} else System.out.println("The file selected is too big.");
		} catch (IOException e) {
			result = null;
	        System.out.println("Error when Parsing PDF to String");
			//e.printStackTrace();
	    } finally {
	        if (file != null) {
				file.delete();
			}
	    }
	    return result;
	}
	
	/*===============================================================================
	 	Method: getListOfLinesFromPDF
	 	Gets a list of the text lines extracted from the PDF file  
	  ===============================================================================*/
	public List<String> getListOfLinesFromPDF(String pdfFileName) {
		List<String> result = null;
		String textGotFromPdf = null;
		
		try {
			textGotFromPdf = getTextFromPDF(pdfFileName);
			if(textGotFromPdf!=null) {
				BufferedReader bufferReader = new BufferedReader(new StringReader(textGotFromPdf));
				String currentLine = null;
				int lineNumber = 0;
				try {
					while ((currentLine = bufferReader.readLine()) != null) {
						lineNumber +=1;
						currentLine = removeUnusedSpaces(currentLine);
						if(result==null && !currentLine.equals("")) result = new ArrayList<String>();
						if(!currentLine.equals("")) result.add(currentLine);
					}
				} catch (IOException e) {
					System.out.println("*** Error when reading PDF file line by line");
					//e.printStackTrace();
				}
			}
		} catch (Exception e1) {
			//System.out.println("Error when parsing PDF");
		}

		return result;
	}
	
	/*===============================================================================
	 	Method: removeUnusedSpaces
	  ===============================================================================*/	
	public String removeUnusedSpaces(String srtValue) {
		String result = srtValue.replaceAll("^\\s+", "").replaceAll("^\\t+", "")	//Remove Left  Spaces and Tabs
								.replaceAll("\\s+$", "").replaceAll("\\t+$", "")	//Remove Right Spaces and Tabs
								.replaceAll("\\s+", " ");							//Remove duplicate Spaces
		return result;
	}

}
