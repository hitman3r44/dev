package com.loyauty.web.struts.action.orders;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.BasicUserDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.UserConnectionDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.orders.OrdersService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;


public class GenerateInvoice extends LoyautyAction {

	private static final long serialVersionUID = -4124365186993131923L;
	private UserService userService;
	private static OrdersService orderService;
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private List<User> usersList;
	private static int USER_TYPE = 2;
	@Getter @Setter
	private File qbInvoiceXmlFile;
	@Getter @Setter
	List<UserFilesDownloadedDTO>userFilelist;
	@Getter @Setter
	private UserConnectionDTO usrConnDTO;
	@Getter @Setter
	HashMap<String, String>fileNamesWithStatus;
	@Getter @Setter
	private Integer btGenerateInvoice;
	@Getter @Setter
	private String message;
	@Getter @Setter
	private String showConfirmGenerateFile;
	@Getter @Setter
	private Integer generateInvoiceConfirmed;
	@Getter @Setter
	private String qbInvoiceXmlFileFileName;
	@Getter @Setter
	private String originalFileName;
	@Getter @Setter
	private Integer uploadInvoiceXML;
	@Getter @Setter
	private Integer deleteInvoiceXML;
	@Getter @Setter
	private String fileToDelete; 	

	public  GenerateInvoice() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
		orderService = getServiceLocator().getOrderService();
	}

	/*=========================================================================================
	 											method execute
	  =========================================================================================*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		try{
			HttpSession session = request.getSession(true);
			showConfirmGenerateFile="visibility:hidden;display:none;";
			//recovered all users
			List<User> usersListSession=(List<User>)session.getAttribute("usersListSession");
			fileNamesWithStatus=( HashMap<String, String>)session.getAttribute("fileNamesWithStatus");
			if(fileNamesWithStatus==null)fileNamesWithStatus = new HashMap<String, String>();
			if(usrConnDTO==null) usrConnDTO = new UserConnectionDTO();
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
			
			/*---------------- Get just the file name without the path-------------------------*/
			String [] tokens=null;
			if(originalFileName!=null){
				String originalFileNameCopy=originalFileName.replaceAll("\\\\", "/");
				tokens = originalFileNameCopy.split("/");
				if(tokens!=null && tokens.length>1){
					originalFileName =tokens[tokens.length-1];
				}
			}

			/*---------------- Check if the user is entered.-------------------------*/
			if(btGenerateInvoice != null && btGenerateInvoice == 1 && (userLogin==null || userLogin.equals(""))){
				addActionError("Please select the Client login.");
				return "input";
			}
			/*---------------- Check if the user selected a file-------------------------*/
			if(btGenerateInvoice != null && btGenerateInvoice == 1 && (originalFileName==null || originalFileName.equals(""))){
				addActionError("Please browse and select a file.");
				return "input";
			}
			/*---------------- retrieve customer information order -------------------------*/
			UserFileRecoveryDTO ufrDTO = null;
			ufrDTO=orderService.getUserFileRecoveryByUser(userLogin);
			usrConnDTO = userService.getUserConnectionByLogin(userLogin);
			File invoiceFilePermanent=null;
			String filePath = request.getSession().getServletContext().getRealPath("/");
			String dataPath = filePath + "WEB-INF/jsp/orders/data/";
			String nameFile="";
			if(userLogin!=null && ufrDTO!=null)	nameFile=dataPath+userLogin+"."+ufrDTO.getFileType();
			invoiceFilePermanent = new File(nameFile);

			/*---------------- When user clicks Generate Invoice - show  Generate Invoice confirmation pop up -------------------------*/
			if(qbInvoiceXmlFile!=null && btGenerateInvoice != null && btGenerateInvoice == 1 && generateInvoiceConfirmed!=null && generateInvoiceConfirmed==-1){
				if(invoiceFilePermanent.exists())invoiceFilePermanent.delete();
				//if(originalFileName.substring(originalFileName.lastIndexOf('.')+1).equalsIgnoreCase(ufrDTO.getFileType())){
				if(originalFileName.substring(originalFileName.lastIndexOf('.')+1).equalsIgnoreCase("xml")){
					try {
						invoiceFilePermanent = new File(nameFile);
						FileUtils.copyFile(qbInvoiceXmlFile, invoiceFilePermanent);
					} catch (IOException e) {
						addActionError(getText("loyauty.error.common.CreateOrdersFromFiles"));
						e.printStackTrace();
						return "input";
					}
					message="Are you sure, you want to generate invoice?";
					showConfirmGenerateFile="display:block;visibility:visible;";
				}
				else{
					addActionError("File format is not correct.");
				}
			}
			/*---------------- When user confirms to Generate Invoice confirmation pop up-------------------------*/
			if(btGenerateInvoice != null && btGenerateInvoice == 1 && generateInvoiceConfirmed!=null && generateInvoiceConfirmed==1){
				//destination of the generate file. 
				String  location= new File(filePath).getParent()+"/";
				File fileRoot=new File(location+"invoice_confirm");
				fileRoot.mkdir();
				File clientFolder=null;
				clientFolder=new File(location+"invoice_confirm/"+userLogin);
				clientFolder.mkdir();
				File generatedFile =null;
				// check if correct file format is selected.
				if(invoiceFilePermanent!=null && invoiceFilePermanent.exists()){
					//Parameters (destination folder,userDTO,source file)
					generatedFile = createInvoicedOrdersXML(location+"invoice_confirm/"+userLogin+"/",ufrDTO,invoiceFilePermanent);
					if(generatedFile!=null){
						fileNamesWithStatus.put(originalFileName,generatedFile.getName());
						session.setAttribute("fileNamesWithStatus", fileNamesWithStatus);
						if(invoiceFilePermanent.exists()) invoiceFilePermanent.delete();
					}else{
						addActionError("XML is not well formed");
					}
				}
			}
			/*---------------- When user clicks the delete icon on the screen-------------------------*/
			if(deleteInvoiceXML != null && deleteInvoiceXML == 1){
				if(usrConnDTO!= null) usrConnDTO.getInvoiceConfirmFolder();
				File fileToRemove = new File(usrConnDTO.getInvoiceConfirmFolder()+ fileToDelete);
				if(fileToRemove!=null && fileToRemove.exists()){
					fileToRemove.delete();
					orderService.updateFileSequenceInvoice(ufrDTO.getUserId(),ufrDTO.getFileSeqInvoice()-1);
					fileNamesWithStatus.remove(originalFileName);
					session.setAttribute("fileNamesWithStatus", fileNamesWithStatus);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "input";
		}
		return SUCCESS;
	}

	/*=================================================================================
					createInvoicedOrdersXML: Invoice generation for Rideau
	=================================================================================*/
	private File createInvoicedOrdersXML(String destination, UserFileRecoveryDTO ufrDTO, File sourceFile) throws ServiceException {

		File xmlInvoiceFile=null;

		// Reading source xml file
		DocumentBuilder docBuilder =getDocumentBuilder();
		Document docSrc = null;
		try {
			docSrc = docBuilder.parse (sourceFile);
		} catch (SAXException e1) {
			e1.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}

		//----XML File Name for rideau  ID + FCN (always of size 6) + xml------------------------------------
		int sequenceNumber = ufrDTO.getFileSeqInvoice();
		int file_seq = sequenceNumber+1;
		String fileName = "day_ID" + (String.valueOf(file_seq).length() < 6 ? ("000000".substring(String.valueOf(file_seq).length())+ String.valueOf(file_seq)):String.valueOf(file_seq)) +".xml" ;
		xmlInvoiceFile=new File(destination+fileName);

		// normalize text representation
		if(docSrc!= null) docSrc.getDocumentElement ().normalize ();

		//----------------------------------- generate Inovice XML File ------------------------------------
		Document doc = docBuilder.newDocument();	
		Element rootElement = doc.createElement("invoice_file");
		doc.appendChild(rootElement);

		String[] tokens=null;
		// create format_version under status_file (root tag)
		Element formatVersion = doc.createElement("format_version");
		rootElement.appendChild(formatVersion);

		// create file_info under status_file (root tag)
		Element fileInfo = doc.createElement("file_info");
		rootElement.appendChild(fileInfo);

		// create client_number under file_info 
		Element client_number = doc.createElement("client_number");
		fileInfo.appendChild(client_number);

		// create client_name under file_info 
		Element clientName = doc.createElement("client_name");
		fileInfo.appendChild(clientName);

		// create vendor_number under file_info 
		Element vendorNumber = doc.createElement("vendor_number");
		fileInfo.appendChild(vendorNumber);

		// create vendor_name under file_info 
		Element vendorName = doc.createElement("vendor_name");
		fileInfo.appendChild(vendorName);

		// create file_type under file_info 
		Element fileType = doc.createElement("file_type");
		fileType.setTextContent("ID");
		fileInfo.appendChild(fileType);

		// create file_sequence under file_info 
		Element fileSequence = doc.createElement("file_sequence");
		fileSequence.setTextContent(String.valueOf(file_seq));
		fileInfo.appendChild(fileSequence);

		//create file_date under file_info 
		Date date = new Date();
		String today= new SimpleDateFormat("yyyy-MM-dd").format(date);
		Element fileDate = doc.createElement("file_date");
		fileDate.setTextContent(today.toString());
		fileInfo.appendChild(fileDate);

		// create Invoices Element
		Element invoice = doc.createElement("invoices");
		rootElement.appendChild(invoice);

		// set num invoice attribute with no of invoices
		Attr numInvoices = doc.createAttribute("num_invoices");
		invoice.setAttributeNode(numInvoices);
		int totalInvoices = docSrc.getElementsByTagName("InvoiceRet").getLength();
		numInvoices.setTextContent(totalInvoices+"");
		NodeList listOfInvoice = docSrc.getElementsByTagName("InvoiceRet");
		String orderFileInfo =null;

		for(int i =0 ; i<totalInvoices ; i++){
			Node InvoiceRetNode = listOfInvoice.item(i);
			if(InvoiceRetNode.getNodeType() == Node.ELEMENT_NODE){
				Element firstInvoiceElement = (Element)InvoiceRetNode;

				//invoice_detail Element under invoice Element
				Element invoice_detail_Element = doc.createElement("invoice_detail");
				invoice.appendChild(invoice_detail_Element);

				//invoice_date -  from quickbooks <TimeModified>
				Element invoice_date_Element = doc.createElement("invoice_date");
				String invoice_date=getValue("TimeModified", firstInvoiceElement, 0);
				if(invoice_date!=null)invoice_date_Element.setTextContent(invoice_date.substring(0,invoice_date.indexOf("T")));
				invoice_detail_Element.appendChild(invoice_date_Element);

				//invoice_number -  from quickbooks <RefNumber>
				Element invoice_number_Element = doc.createElement("invoice_number");
				String invoice_number=getValue("RefNumber", firstInvoiceElement, 0);
				if(invoice_number!=null)invoice_number_Element.setTextContent(invoice_number);
				invoice_detail_Element.appendChild(invoice_number_Element);

				//invoice_type -If we give a credit, the value is CR else DB in case of invoice.
				Element invoice_type_Element = doc.createElement("invoice_type");
				invoice_type_Element.setTextContent("DB");
				invoice_detail_Element.appendChild(invoice_type_Element);

				//split the PO number and set source, program_id, client_po
				tokens=null;
				String productOrderNumber="";

				productOrderNumber = getValue("PONumber", firstInvoiceElement, 0);
				if(productOrderNumber!=null && productOrderNumber.length()>0){
					tokens = productOrderNumber.split(" ");
				}
				if(tokens!=null && tokens.length==3){
					//program_id
					Element program_id_Element = doc.createElement("program_id");
					String program_id=tokens[1];
					if(program_id!=null)program_id_Element.setTextContent(program_id);
					invoice_detail_Element.appendChild(program_id_Element);

					//client_po
					Element client_po_Element = doc.createElement("client_po");	
					String client_po=tokens[2];
					if(client_po!=null)client_po_Element.setTextContent(client_po);
					invoice_detail_Element.appendChild(client_po_Element);

					//source
					Element source_Element = doc.createElement("source");	
					String source=tokens[0];
					if(source!=null)source_Element.setTextContent(source);
					invoice_detail_Element.appendChild(source_Element);
				}

				//ship_to_name - from DB
				Element ship_to_name_Element = doc.createElement("ship_to_name");	
				invoice_detail_Element.appendChild(ship_to_name_Element);

				//ship_to_postal_code - from DB
				Element ship_to_postal_code_Element = doc.createElement("ship_to_postal_code");	
				invoice_detail_Element.appendChild(ship_to_postal_code_Element);

				//invoice_total - from quickbooks <BalanceRemaining>
				Element invoice_total_Element = doc.createElement("invoice_total");	
				String invoice_total = getValue("BalanceRemaining", firstInvoiceElement, 0);
				if(invoice_total!=null)invoice_total_Element.setTextContent(invoice_total);
				invoice_detail_Element.appendChild(invoice_total_Element);

				//invoice_freight 
				Element invoice_freight_Element = doc.createElement("invoice_freight");	
				NodeList rateList=   firstInvoiceElement.getElementsByTagName("Rate");
				String invoiceFreight = calculateFreight(rateList,firstInvoiceElement);
				if(invoiceFreight!=null)invoice_freight_Element.setTextContent(invoiceFreight);
				invoice_detail_Element.appendChild(invoice_freight_Element);

				//invoice_other  Always 0  
				Element invoice_other_Element = doc.createElement("invoice_other");	
				invoice_other_Element.setTextContent("0");
				invoice_detail_Element.appendChild(invoice_other_Element);

				//invoice_gst  (66.61% of SalesTaxTotal)
				Double invoice_gst= new Double(0);
				String salesTaxTotal = getValue("SalesTaxTotal", firstInvoiceElement, 0);
				Element invoice_gst_Element = doc.createElement("invoice_gst");	
				if(salesTaxTotal!=null)	invoice_gst = (double)Math.round(Double.parseDouble(salesTaxTotal)* 66.61) / (double) 100;
				invoice_gst_Element.setTextContent(String.valueOf(invoice_gst));
				invoice_detail_Element.appendChild(invoice_gst_Element);

				//invoice_pst  (33.39% of salesTaxTotal)
				Double invoice_pst= new Double(0);
				Element invoice_pst_Element = doc.createElement("invoice_pst");	
				if(salesTaxTotal!=null)	invoice_pst = (double)Math.round(Double.parseDouble(salesTaxTotal)* 33.39) / (double) 100;
				invoice_pst_Element.setTextContent(String.valueOf(invoice_pst));
				invoice_detail_Element.appendChild(invoice_pst_Element);

				//invoice_hst - Always 0 
				Element invoice_hst_Element = doc.createElement("invoice_hst");	
				invoice_hst_Element.setTextContent("0");
				invoice_detail_Element.appendChild(invoice_hst_Element);

				int totalInvoiceItem = firstInvoiceElement.getElementsByTagName("Other2").getLength();
				int lineNumber = 1;

				// create Item under Invoice_detail
				Element items_Element = doc.createElement("items");
				invoice_detail_Element.appendChild(items_Element);
				//Set num_item with no of item details present in xml
				Attr num_items = doc.createAttribute("num_items");
				items_Element.setAttributeNode(num_items);
				num_items.setTextContent(String.valueOf(totalInvoiceItem));

				for(int cnt=0 ; cnt < totalInvoiceItem ; cnt++){
					String lsOrderId=null;
					lsOrderId = getValue("Other2", firstInvoiceElement, cnt);
					OrdersDTO ordersDTO = orderService.getInvoiceOrderByLsOrderId(lsOrderId);
					
					/*if(ordersDTO==null){
						System.out.println("error");
					}*/
					
					Node invoiceLineRetNode =  ((Node)firstInvoiceElement.getElementsByTagName("Other2").item(cnt)).getParentNode();
					Element invoiceLineRetElement = (Element)invoiceLineRetNode;

					//ship_to_name - from DB
					if(ordersDTO.getClientFirstName()!=null)ship_to_name_Element.setTextContent(ordersDTO.getClientFirstName().trim()+" "+ ordersDTO.getClientLastName().trim());

					//ship_to_postal_code - from DB
					if(ordersDTO.getClientPostalCode()!=null)ship_to_postal_code_Element.setTextContent(ordersDTO.getClientPostalCode().trim());
					orderFileInfo=ordersDTO.getOrderFileInfo();

					//item_detail
					Element item_detail_Element = doc.createElement("item_detail");
					items_Element.appendChild(item_detail_Element);

					//client_po_detail  - other1
					Element client_po_detail_Element = doc.createElement("client_po_detail");
					String client_po = getValue("Other1", firstInvoiceElement, cnt);
					//String client_po = getValue("Other1", invoiceLineRetElement, 0);
					if(client_po!=null && client_po.length()>0) client_po_detail_Element.setTextContent(client_po);
					item_detail_Element.appendChild(client_po_detail_Element);

					//line_number
					Element line_number_Element = doc.createElement("line_number");
					line_number_Element.setTextContent(String.valueOf(lineNumber));
					lineNumber++;
					item_detail_Element.appendChild(line_number_Element);

					//vendor_item_number - Ls product ID
					Element vendor_item_number_Element = doc.createElement("vendor_item_number"); 
					String vendor_item_number= getValue("FullName", invoiceLineRetElement, 0);
					if(vendor_item_number!=null)vendor_item_number_Element.setTextContent(vendor_item_number);
					item_detail_Element.appendChild(vendor_item_number_Element);

					//item_price
					Element item_price_Element = doc.createElement("item_price"); 
					String item_price=getValue("Rate", invoiceLineRetElement, 0);
					if(item_price!=null)item_price_Element.setTextContent(item_price);
					item_detail_Element.appendChild(item_price_Element);

					//ordered_qty - Ordered quantity would be null in case the ordered in already invoiced.
					int ordered_qty = 0;
					Element ordered_qty_Element = doc.createElement("ordered_qty");
					ordered_qty = getOrderedQuantity(lsOrderId).intValue();
					ordered_qty_Element.setTextContent(String.valueOf(ordered_qty));
					item_detail_Element.appendChild(ordered_qty_Element);

					Element shipped_qty_Element = doc.createElement("shipped_qty"); 
					String shipped_qty=getValue("Quantity", invoiceLineRetElement, 0);
					//String shipped_qty=ordersDTO.getQuantity()+"";
					if(shipped_qty!=null)shipped_qty_Element.setTextContent(shipped_qty);
					item_detail_Element.appendChild(shipped_qty_Element);

					//backordered_qty
					Element backordered_qty_Element = doc.createElement("backordered_qty"); 
					int totalQuanityShippedTillDate= getTotalShippedQuantityForSplitOrders(lsOrderId).intValue();
					backordered_qty_Element.setTextContent(String.valueOf(ordered_qty- totalQuanityShippedTillDate));
					item_detail_Element.appendChild(backordered_qty_Element);
				}
			} // if end.
		} // for totalInvoices end
		tokens = null;
		if(orderFileInfo!=null){
			tokens = orderFileInfo.split("↨");
		}
		if(tokens!=null && tokens[0]!=null)formatVersion.setTextContent(tokens[0]);
		if(tokens!=null && tokens[1]!=null)client_number.setTextContent(tokens[1]);
		if(tokens!=null && tokens[2]!=null)clientName.setTextContent(tokens[2]);
		if(tokens!=null && tokens[3]!=null)vendorNumber.setTextContent(tokens[3]);
		if(tokens!=null && tokens[4]!=null)vendorName.setTextContent(tokens[4]);		

		//Create XML File
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(xmlInvoiceFile);
		try {
			transformer.transform(source, result);
			boolean res = orderService.updateFileSequenceInvoice(ufrDTO.getUserId(),file_seq); 
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return xmlInvoiceFile;
	}

	private static String calculateFreight(NodeList rateList,Element docElement) {
		NumberFormat nf = NumberFormat.getInstance();
		Double frieght = (double)0;
		for(int i =0 ; i < rateList.getLength() ; i++){
			Element parent = (Element)rateList.item(i).getParentNode();
			if(getValue("Desc", parent, 0).equalsIgnoreCase("Shipping")){
				try {
					frieght = (double) Math.round( (frieght + nf.parse(getValue("Rate", docElement, i)).doubleValue())*100)/100;
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return frieght+"";
	}

	/*======================================================================================================
			Method to return the Document builder for the xml file.
	=========================================================================================================*/
	private static DocumentBuilder getDocumentBuilder(){
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder =null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return docBuilder;
	}
	/*======================================================================================================
			Method to return the Element value of any xml tag.
	=========================================================================================================*/
	private static String getValue(String tag, Element element , int i) {
		String nodeValue="";
		NodeList nodeList = element.getElementsByTagName(tag);
		if(nodeList!=null && nodeList.getLength()> 0){
			Element nodeElement = (Element)nodeList.item(i);
			if(nodeElement!=null){
				NodeList nodes = nodeElement.getChildNodes();
				if(nodes!=null && nodes.getLength()>0){
					nodeValue =((Node)nodes.item(0)).getNodeValue().trim(); 
				}
			}
		}
		return nodeValue;
	}
	/*======================================================================================================
	 		Method to return list of all invoiced orders xml files in a given folder.
	=========================================================================================================*/
	public static File[] getInvoicedOrdersXMLFiles(File folder) {
		List<File> aList = new ArrayList<File>();
		File[] files = folder.listFiles();
		if(files != null &&  files.length>=1){
			for (File pf : files) {
				if (pf.isFile() && getFileExtensionName(pf).indexOf("xml") != -1) {
					aList.add(pf);
				}
			}
		}
		return aList.toArray(new File[aList.size()]);
	}
	/*======================================================================================================
				Get file extension 
	=========================================================================================================*/
	public static String getFileExtensionName(File f) {
		String fileToDownload=f.getName();
		int index=fileToDownload.lastIndexOf(".");
		String ext="";
		if(index>0)ext=fileToDownload.substring(index+1);
		if (!fileToDownload.equals(".") && !fileToDownload.equals("..") && !f.isDirectory() &&
				fileToDownload.indexOf(".")>0 && !fileToDownload.endsWith(".")&& ext.length()==3) {
			return fileToDownload.substring(fileToDownload.length() - 3, fileToDownload.length());
		}
		else
			return "";
	}

	/*======================================================================================================
		Method to return the ordered quantity for any split order. 
	=========================================================================================================*/
	private static Double getOrderedQuantity(String lsOrderId) {
		Double count = (double) 0;
		if(lsOrderId!=null){
			if(lsOrderId.contains("_")) lsOrderId = lsOrderId.substring(0,lsOrderId.indexOf('_'));
			try {
				count = orderService.getOrderedQuantity(lsOrderId);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	/*======================================================================================================
			Method to return the Total shipped quantity for any split order. 
	=========================================================================================================*/
	private static Double getTotalShippedQuantityForSplitOrders(String lsOrderId) {
		Double count = (double) 0;
		if(lsOrderId!=null){
			if(lsOrderId.contains("_")) lsOrderId = lsOrderId.substring(0,lsOrderId.indexOf('_'));
			try {
				count = orderService.getTotalShippedQuantityForSplitOrders(lsOrderId);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
