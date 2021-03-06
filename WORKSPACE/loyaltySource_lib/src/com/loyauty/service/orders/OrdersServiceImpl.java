package com.loyauty.service.orders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.logging.SimpleFormatter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.BoldStyle;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import lombok.Getter;
import lombok.Setter;
import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.Currency;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.OrdersSpecialShipping;
import com.loyauty.model.Product;
import com.loyauty.model.User;
import com.loyauty.model.UserFileRecovery;
import com.loyauty.model.UserFilesDownloaded;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BoxDTO;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ItemMapDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersSpecialShippingDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProvinceDTO;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserFileDataRecoveryDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;


public class OrdersServiceImpl extends ServiceImpl implements OrdersService {

	//======================================== Admin's Part ========================================
	@Setter @Getter
	protected DaoManager daoManager;
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	private static OrdersService orderService;
	public OrdersServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
		serviceLocator = ServiceLocator.getInstance();

	}

	/**----------------------------------------------------------
	 *THIS METHOD ALLOW US TO TRANSLATE ORDER DTO TO ORDER*
	  -----------------------------------------------------------*/	
	public static Orders buildOrder(OrdersDTO orderDTO){
		Orders order=new Orders();
		order.setClientCity(orderDTO.getClientCity());
		order.setClientEmail(orderDTO.getClientEmail());
		order.setClientFirstName(orderDTO.getClientFirstName());
		order.setClientLastName(orderDTO.getClientLastName());
		order.setClientNumber(orderDTO.getClientNumber());
		order.setClientOrderNumber(orderDTO.getClientOrderNumber());
		order.setClientOtherNames(orderDTO.getClientOtherNames());
		order.setClientOtherStreet(orderDTO.getClientOtherStreet());
		order.setClientPhone(orderDTO.getClientPhone());
		order.setClientPostalCode(orderDTO.getClientPostalCode());
		order.setClientProvince(orderDTO.getClientProvince());
		order.setClientStreet(orderDTO.getClientStreet());
		order.setCreationDate(orderDTO.getCreationDate());
		order.setId(orderDTO.getId());
		order.setLsOrderId(orderDTO.getLsOrderId());
		order.setProductOrderNumber(orderDTO.getProductOrderNumber());
		order.setRowsList(orderDTO.getRowsList());
		order.setUserId(orderDTO.getUserId());
		return order;
	}

	/**----------------------------------------------------------
	 *GET USER_FILE_RECOVERY BY USER_LOGIN*
	  -----------------------------------------------------------*/	
	@Override
	public UserFileRecoveryDTO getUserFileRecoveryByUser(final String login)
	throws ServiceException {

		UserFileRecovery result=null;		
		try{
			daoManager.setCommitTransaction(true);
			result = (UserFileRecovery) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getUserFileRecoveryByUser(login);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return (DTOFactory.getUserFileRecoveryDTO(result));
	}



	/**----------------------------------------------------------
	 *UPDATE ORDERS ROWS BY LIKE LSORDER_ID, DATE, STATUS, CLIENT*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> getAllOrders(){
		List<Orders> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getAllOrders();
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *GET INVOICED COUNT*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public Long getCountInvoicedOrders(final Date creationDateStart,final Date creationDateEnd,final Integer factorDateBetween,
			final String userLogin, final String lsOrderId,final String status){
		Orders result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (Orders) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getCountInvoicedOrders(creationDateStart,creationDateEnd,factorDateBetween,userLogin, lsOrderId,status);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		Long count=result.getCount();
		return count;
	}



	/**----------------------------------------------------------
	 *GET INVOICED COUNT*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public Long getCountOrders(final Date creationDateStart,final Date creationDateEnd,final Integer factorDateBetween,
			final String userLogin, final String lsOrderId,final String status, final String productOrderNumberSearch, 
			final String clientOrderNumber,
			final String clientOther){
		Orders result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (Orders) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getCountOrders(
							creationDateStart,creationDateEnd,factorDateBetween,
							userLogin,lsOrderId,status,
							productOrderNumberSearch,clientOrderNumber, clientOther);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			}catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		Long count=result.getCount();
		return count;
	}

	/**----------------------------------------------------------
	 *THIS FUNCTION ALLOWS US TO TRANSFORM AN XML FILE TO A LIST 
	   OF ORDERS*
	  -----------------------------------------------------------*/	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Collection  toArrayListFromXML(File orderFile,String userLogin)throws Exception {
		Collection listOrdersDTO = new ArrayList();
		UserFileRecoveryDTO ufrDTO;
		String formatDate="";
		Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
		/*List<Orders>listOrders=getAllOrders();
		if(listOrders!=null){
			for(Orders ord:listOrders){
				lsOrdersIdHash.put(ord.getLsOrderId(), ord.getLsOrderId());
			}
		}*/
		productService = serviceLocator.getProductService();

		if(orderFile==null)return listOrdersDTO;
		List<ProvinceDTO> listProvine= productService.getAllProvinces();
		UserFileDataRecoveryDTO ufDataDTO=new UserFileDataRecoveryDTO();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse (orderFile);
		ufrDTO=getUserFileRecoveryByUser(userLogin);
		// normalize text representation
		doc.getDocumentElement ().normalize ();

		if(ufrDTO!=null && ufrDTO.getTagRoot()!=null  && ufrDTO.getFileTypeId()==1){
			NodeList listOfOrders = doc.getElementsByTagName(ufrDTO.getTagRoot());
			for(int s=0; s<listOfOrders.getLength() ; s++){
				ufDataDTO=new UserFileDataRecoveryDTO();
				ufDataDTO.setUserId(ufrDTO.getUserId());
				Node firstOrderNode = listOfOrders.item(s);   
				if(firstOrderNode.getNodeType() == Node.ELEMENT_NODE){
					Element firstOrderElement = (Element)firstOrderNode;
					//--------------- 1:companyHeader -----------
					String companyHeader="";
					if(ufrDTO.getCompanyHeader()!=null){
						NodeList companyHeaderList = firstOrderElement.getElementsByTagName(ufrDTO.getCompanyHeader());
						if(companyHeaderList!=null && companyHeaderList.getLength()>0){
							Element companyHeaderElement = (Element)companyHeaderList.item(0);
							if(companyHeaderElement!=null){
								NodeList companyHeaderFNList = companyHeaderElement.getChildNodes();
								if(companyHeaderFNList!=null && companyHeaderFNList.getLength()>0){
									companyHeader =((Node)companyHeaderFNList.item(0)).getNodeValue().trim(); 
								}
							}  
						}
					}
					ufDataDTO.setCompanyHeader(companyHeader);

					//--------------- 2:productOrderNumber ----------------
					String productOrderNumber="";
					if(ufrDTO.getProductOrderNumber()!=null){
						NodeList productOrderNumberList = firstOrderElement.getElementsByTagName(ufrDTO.getProductOrderNumber());
						if(productOrderNumberList!=null && productOrderNumberList.getLength()>0){
							Element productOrderNumberElement = (Element)productOrderNumberList.item(0);
							if(productOrderNumberElement!=null){
								NodeList productOrderNumberFNList = productOrderNumberElement.getChildNodes(); 
								if(productOrderNumberFNList!=null && productOrderNumberFNList.getLength()>0){
									productOrderNumber =((Node)productOrderNumberFNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					ufDataDTO.setProductOrderNumber(productOrderNumber);                
					//--------------- 3:productOrderDate -----------------
					String productOrderDate="";
					if(ufrDTO.getProductOrderDate()!=null){
						NodeList productOrderDateList = firstOrderElement.getElementsByTagName(ufrDTO.getProductOrderDate());
						if(productOrderDateList!=null && productOrderDateList.getLength()>0){
							Element productOrderDateElement = (Element)productOrderDateList.item(0);
							if(productOrderDateElement!=null){
								NodeList productOrderDateFNList = productOrderDateElement.getChildNodes();
								if(productOrderDateFNList!=null && productOrderDateFNList.getLength()>0){
									productOrderDate =((Node)productOrderDateFNList.item(0)).getNodeValue().trim();
									productOrderDate=productOrderDate.replaceAll("^ +| +$|( )+", "$1");
								}
							}
						}
					}
					formatDate=ufrDTO.getFormatDate();
					if(formatDate==null)formatDate="";
					SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
					Date dateOrder=null;
					try {
						Date date = sdf.parse(productOrderDate);
						dateOrder=date;
					}
					catch (Exception pe) {
						dateOrder=null;
					}
					ufDataDTO.setProductOrderDate(dateOrder);

					//--------------- 4:quantity -------------------------
					String strQuantity="";
					if(ufrDTO.getQuantity()!=null){
						NodeList quantityList = firstOrderElement.getElementsByTagName(ufrDTO.getQuantity());
						if(quantityList!=null && quantityList.getLength()>0){
							Element quantityElement = (Element)quantityList.item(0);
							if(quantityElement!=null){
								NodeList quantityFNList = quantityElement.getChildNodes();
								if(quantityFNList!=null && quantityFNList.getLength()>0){
									strQuantity =((Node)quantityFNList.item(0)).getNodeValue().trim();
									strQuantity=strQuantity.replaceAll(" ", "");
								}
							}
						}
					}

					if(strQuantity!=null && !strQuantity.equals("")){
						int index=strQuantity.indexOf(",");
						if(index>=0){
							String strUnitPrice1=strQuantity.substring(0, index);
							String strUnitPrice2= strQuantity.substring(index+1, strQuantity.length());
							strQuantity=strUnitPrice1+"."+strUnitPrice2;
						}
					}
					Double quantity=null;
					try {
						quantity = Double.parseDouble(strQuantity);
					}
					catch (Exception pe) {
						quantity=null;
					}
					ufDataDTO.setQuantity(quantity);

					//--------------- 5:lsProductID ----------------------
					String lsProductID="";
					if(ufrDTO.getLsProductID()!=null){
						NodeList lsProductIDList = firstOrderElement.getElementsByTagName(ufrDTO.getLsProductID());
						if(lsProductIDList!=null && lsProductIDList.getLength()>0){
							Element lsProductIDElement = (Element)lsProductIDList.item(0);
							if(lsProductIDElement!=null){
								NodeList lsProductIDFNList = lsProductIDElement.getChildNodes();
								if(lsProductIDFNList!=null && lsProductIDFNList.getLength()>0){
									lsProductID =((Node)lsProductIDFNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}

					ufDataDTO.setLsProductID(lsProductID);

					//--------------- 6:productDescription ------------------
					String productDescription="";
					if(ufrDTO.getProductDescription()!=null){
						NodeList productDescriptionList = firstOrderElement.getElementsByTagName(ufrDTO.getProductDescription());
						if(productDescriptionList!=null && productDescriptionList.getLength()>0){
							Element productDescriptionElement = (Element)productDescriptionList.item(0);
							if(productDescriptionElement!=null){
								NodeList productDescriptionFNList = productDescriptionElement.getChildNodes();
								if(productDescriptionFNList!=null && productDescriptionFNList.getLength()>0){
									productDescription =((Node)productDescriptionFNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					productDescription=productDescription.replaceAll(",", " ");
					ufDataDTO.setProductDescription(productDescription);

					//--------------- 7:unitPrice ---------------------------
					String strUnitPrice="";
					if(ufrDTO.getUnitPrice()!=null){
						NodeList unitPriceList = firstOrderElement.getElementsByTagName(ufrDTO.getUnitPrice());
						if(unitPriceList!=null && unitPriceList.getLength()>0){
							Element unitPriceElement = (Element)unitPriceList.item(0);
							if(unitPriceElement!=null){
								NodeList unitPriceFNList = unitPriceElement.getChildNodes();
								if(unitPriceFNList!=null && unitPriceFNList.getLength()>0){
									strUnitPrice =((Node)unitPriceFNList.item(0)).getNodeValue().trim();  
									strUnitPrice= strUnitPrice.replaceAll("\\$", "");
									strUnitPrice= strUnitPrice.replaceAll(" ", "");
								}
							}
						}
					}

					if(strUnitPrice!=null && !strUnitPrice.equals("")){
						int index=strUnitPrice.indexOf(",");
						if(index>=0){
							String strUnitPrice1=strUnitPrice.substring(0, index);
							String strUnitPrice2= strUnitPrice.substring(index+1, strUnitPrice.length());
							strUnitPrice=strUnitPrice1+"."+strUnitPrice2;
						}
					}
					Double ProductUnitPrice=null;
					try {
						ProductUnitPrice = Double.parseDouble(strUnitPrice);
					}
					catch (Exception pe) {
						ProductUnitPrice=null;
					}
					ufDataDTO.setUnitPrice(ProductUnitPrice);

					//--------------- 8:clientNumber -------------------------
					String clientNumber="";
					if(ufrDTO.getClientNumber()!=null){
						NodeList clientNumberList = firstOrderElement.getElementsByTagName(ufrDTO.getClientNumber());
						if(clientNumberList!=null && clientNumberList.getLength()>0){
							Element clientNumberElement = (Element)clientNumberList.item(0);
							if(clientNumberElement!=null){
								NodeList clientNumberFNList = clientNumberElement.getChildNodes();
								if(clientNumberFNList!=null && clientNumberFNList.getLength()>0){
									clientNumber =((Node)clientNumberFNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setClientNumber(clientNumber);

					//--------------- 9:firstName ---------------------------
					String firstName="";
					if(ufrDTO.getClientFirstName()!=null){
						NodeList firstNameList = firstOrderElement.getElementsByTagName(ufrDTO.getClientFirstName());
						if(firstNameList!=null && firstNameList.getLength()>0){
							Element firstNameElement = (Element)firstNameList.item(0);
							if(firstNameElement!=null){
								NodeList firstNameFNList = firstNameElement.getChildNodes();
								if(firstNameFNList!=null && firstNameFNList.getLength()>0){
									firstName =((Node)firstNameFNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					ufDataDTO.setClientFirstName(firstName);

					//--------------- 10:lastName ---------------------------
					String lastName="";
					if(ufrDTO.getClientLastName()!=null){
						NodeList lastNameList = firstOrderElement.getElementsByTagName(ufrDTO.getClientLastName());
						if(lastNameList!=null && lastNameList.getLength()>0){
							Element lastNameElement = (Element)lastNameList.item(0);
							if(lastNameElement!=null){
								NodeList lastNameFNList = lastNameElement.getChildNodes();
								if(lastNameFNList!=null && lastNameFNList.getLength()>0){
									lastName =((Node)lastNameFNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					ufDataDTO.setClientLastName(lastName);

					//--------------- 11:addressStreet ----------------------
					String addressStreet="";
					if(ufrDTO.getClientStreet()!=null){
						NodeList addressStreetList = firstOrderElement.getElementsByTagName(ufrDTO.getClientStreet());
						if(addressStreetList!=null && addressStreetList.getLength()>0){
							Element addressStreetElement = (Element)addressStreetList.item(0);
							if(addressStreetElement!=null){
								NodeList addressStreetFNList = addressStreetElement.getChildNodes();
								if(addressStreetFNList!=null && addressStreetFNList.getLength()>0){
									addressStreet =((Node)addressStreetFNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					addressStreet=addressStreet.replaceAll(",", " ");
					ufDataDTO.setClientStreet(addressStreet);

					//--------------- 12:addressStreetOther ----------------
					String addressStreetOther="";
					if(ufrDTO.getClientOtherStreet()!=null){
						NodeList addressStreetOtherList = firstOrderElement.getElementsByTagName(ufrDTO.getClientOtherStreet());
						if(addressStreetOtherList!=null && addressStreetOtherList.getLength()>0){
							Element addressStreetOtherElement = (Element)addressStreetOtherList.item(0);
							if(addressStreetOtherElement!=null){
								NodeList addressStreetOtherFNList = addressStreetOtherElement.getChildNodes();
								if(addressStreetOtherFNList!=null && addressStreetOtherFNList.getLength()>0){
									addressStreetOther =((Node)addressStreetOtherFNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					ufDataDTO.setClientOtherStreet(addressStreetOther);

					//--------------- 13:addressCity ------------------------
					String addressCity="";
					if(ufrDTO.getClientCity()!=null){
						NodeList addressCityList = firstOrderElement.getElementsByTagName(ufrDTO.getClientCity());
						if(addressCityList!=null && addressCityList.getLength()>0){
							Element addressCityElement = (Element)addressCityList.item(0);
							if(addressCityElement!=null){
								NodeList addressCityLNList = addressCityElement.getChildNodes();
								if(addressCityLNList!=null && addressCityLNList.getLength()>0){
									addressCity =((Node)addressCityLNList.item(0)).getNodeValue().trim();
								}
							}
						}
					}
					ufDataDTO.setClientCity(addressCity);

					//--------------- 14:addressPostalCode ---------------------
					String addressPostalCode=" ";
					if(ufrDTO.getClientPostalCode()!=null){
						NodeList addressPostalCodeList = firstOrderElement.getElementsByTagName(ufrDTO.getClientPostalCode());
						if(addressPostalCodeList!=null && addressPostalCodeList.getLength()>0){
							Element addressPostalCodeElement = (Element)addressPostalCodeList.item(0);
							if(addressPostalCodeElement!=null){
								NodeList addressPostalCodeLNList = addressPostalCodeElement.getChildNodes();
								if(addressPostalCodeLNList!=null && addressPostalCodeLNList.getLength()>0){
									addressPostalCode =((Node)addressPostalCodeLNList.item(0)).getNodeValue().trim();  
								}
							}
						}
					}
					addressPostalCode=addressPostalCode.replaceAll(" ", "");
					ufDataDTO.setClientPostalCode(addressPostalCode);

					//--------------- 15:addressState -------------------------
					String addressState="";
					if(ufrDTO.getClientProvince()!=null){
						NodeList addressStateList = firstOrderElement.getElementsByTagName(ufrDTO.getClientProvince());
						if(addressStateList!=null && addressStateList.getLength()>0){
							Element addressStateElement = (Element)addressStateList.item(0);
							if(addressStateElement!=null){
								NodeList addressStateLNList = addressStateElement.getChildNodes();
								if(addressStateLNList!=null && addressStateLNList.getLength()>0){
									addressState =((Node)addressStateLNList.item(0)).getNodeValue().trim(); 
									String clientProvinceToCompar=addressState.toLowerCase();
									clientProvinceToCompar=clientProvinceToCompar.replaceAll(" ", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll("canada", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll(",", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll("\\.", "");
									for(ProvinceDTO prov:listProvine){
										String provName=prov.getName();
										provName=provName.replaceAll(" ", "");
										provName= provName.toLowerCase();
										if(clientProvinceToCompar.equals(provName) || clientProvinceToCompar.equals(prov.getCode()) ){
											addressState=	prov.getCode();
											break;
										}
									}
									addressState=addressState.replaceAll("\\.", "");
									if(clientProvinceToCompar.equals(""))addressState=""; 
								}
							}
						}
					}
					ufDataDTO.setClientProvince(addressState);

					//--------------- 16:clientPhone --------------------------
					String clientPhone="";
					if(ufrDTO.getClientPhone()!=null){
						NodeList clientPhoneList = firstOrderElement.getElementsByTagName(ufrDTO.getClientPhone());
						if(clientPhoneList!=null && clientPhoneList.getLength()>0){
							Element clientPhoneElement = (Element)clientPhoneList.item(0);
							if(clientPhoneElement!=null){
								NodeList clientPhoneLNList = clientPhoneElement.getChildNodes();
								if(clientPhoneLNList!=null && clientPhoneLNList.getLength()>0){
									clientPhone =((Node)clientPhoneLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}

					//--------------- 17:client_phone_zone -------------------------
					String clientPhoneZone="";
					if(ufrDTO.getClientPhoneZone()!=null){
						NodeList clientPhoneZoneList = firstOrderElement.getElementsByTagName(ufrDTO.getClientPhoneZone());
						if(clientPhoneZoneList!=null && clientPhoneZoneList.getLength()>0){
							Element clientPhoneZoneElement = (Element)clientPhoneZoneList.item(0);
							if(clientPhoneZoneElement!=null){
								NodeList clientPhoneZoneLNList = clientPhoneZoneElement.getChildNodes();
								if(clientPhoneZoneLNList!=null && clientPhoneZoneLNList.getLength()>0){
									clientPhoneZone =((Node)clientPhoneZoneLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					if(clientPhoneZone!=null && !clientPhoneZone.equals(""))clientPhone=clientPhoneZone+" "+clientPhone;
					ufDataDTO.setClientPhone(clientPhone);

					//--------------- 18:clientEmail -------------------------
					String clientEmail="";
					if(ufrDTO.getClientEmail()!=null){
						NodeList clientEmailList = firstOrderElement.getElementsByTagName(ufrDTO.getClientEmail());
						if(clientEmailList!=null && clientEmailList.getLength()>0){
							Element clientEmailElement = (Element)clientEmailList.item(0);
							if(clientEmailElement!=null){
								NodeList clientEmailLNList = clientEmailElement.getChildNodes();
								if(clientEmailLNList!=null && clientEmailLNList.getLength()>0){
									clientEmail =((Node)clientEmailLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setClientEmail(clientEmail);

					//--------------- 19:requiredDate -------------------------
					String requiredDate="";
					if(ufrDTO.getRequiredDate()!=null){
						NodeList requiredDateList = firstOrderElement.getElementsByTagName(ufrDTO.getRequiredDate());
						if(requiredDateList!=null && requiredDateList.getLength()>0){
							Element requiredDateElement = (Element)requiredDateList.item(0);
							if(requiredDateElement!=null){
								NodeList requiredDateLNList = requiredDateElement.getChildNodes();
								if(requiredDateLNList!=null && requiredDateLNList.getLength()>0){
									requiredDate =((Node)requiredDateLNList.item(0)).getNodeValue().trim(); 
									requiredDate=requiredDate.replaceAll(" ", "");
								}
							}
						}
					}
					formatDate=ufrDTO.getFormatDate();
					if(formatDate==null)formatDate="";
					sdf = new SimpleDateFormat(formatDate);
					Date requiredDateOrder=null;
					try {
						Date date = sdf.parse(requiredDate);
						requiredDateOrder=date;
					}
					catch (Exception pe) {
						requiredDateOrder=null;
					}                     
					ufDataDTO.setRequiredDate(requiredDateOrder);

					//--------------- 20:clients_other_names -------------------------
					String clientsOtherNames="";
					if(ufrDTO.getClientOtherNames()!=null){
						NodeList clientsOtherNamesList = firstOrderElement.getElementsByTagName(ufrDTO.getClientOtherNames());
						if(clientsOtherNamesList!=null && clientsOtherNamesList.getLength()>0){
							Element clientsOtherNamesElement = (Element)clientsOtherNamesList.item(0);
							if(clientsOtherNamesElement!=null){
								NodeList clientsOtherNamesLNList = clientsOtherNamesElement.getChildNodes();
								if(clientsOtherNamesLNList!=null && clientsOtherNamesLNList.getLength()>0){
									clientsOtherNames =((Node)clientsOtherNamesLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setClientOtherNames(clientsOtherNames);

					//--------------- 21:lsOrderId ------------------------
					String code=userLogin.substring(0, 2).toUpperCase();
					String lsOrderId=ufDataDTO.getProductOrderNumber();

					int inc=0;//increment
					String lsOrderIdParent=lsOrderId;
					lsOrderIdParent=lsOrderIdParent.replaceFirst("-", "");
					lsOrderIdParent=lsOrderIdParent.replaceFirst("_", "");
					lsOrderIdParent=lsOrderIdParent.replaceFirst("R", "");
					lsOrderIdParent=lsOrderIdParent.replaceAll(" ", "");
					if(lsOrderIdParent.length()>14){
						int index=lsOrderIdParent.length()-14;
						lsOrderIdParent=lsOrderIdParent.substring(index, lsOrderIdParent.length());
					}
					String lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent;;
					while(isLsOrderIdUsed(lsOrderIdToGenerate) || lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
						inc++; 
						lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent+"R"+inc;
					}
					lsOrdersIdHash.put(lsOrderIdToGenerate, lsOrderIdToGenerate);
					ufDataDTO.setLsOrderId(lsOrderIdToGenerate);

					//--------------- 22:clients_other_names -------------------------
					String shippingCompany="";
					if(ufrDTO.getShippingCompany()!=null){
						NodeList shippingCompanyList = firstOrderElement.getElementsByTagName(ufrDTO.getShippingCompany());
						if(shippingCompanyList!=null && shippingCompanyList.getLength()>0){
							Element shippingCompanyElement = (Element)shippingCompanyList.item(0);
							if(shippingCompanyElement!=null){
								NodeList shippingCompanyLNList = shippingCompanyElement.getChildNodes();
								if(shippingCompanyLNList!=null && shippingCompanyLNList.getLength()>0){
									shippingCompany =((Node)shippingCompanyLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setShippingCompany(shippingCompany);

					//--------------- 23:Notes -------------------------
					String notes="";
					if(ufrDTO.getNotes()!=null){
						NodeList notesList = firstOrderElement.getElementsByTagName(ufrDTO.getNotes());
						if(notesList!=null && notesList.getLength()>0){
							Element notesElement = (Element)notesList.item(0);
							if(notesElement!=null){
								NodeList notesLNList = notesElement.getChildNodes();
								if(notesLNList!=null && notesLNList.getLength()>0){
									notes =((Node)notesLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setNotes(notes);


					//--------------- 24:Notes -------------------------
					String clientProductNumber="";
					if(ufrDTO.getClientProductNumber()!=null){
						NodeList clientProductNumberList = firstOrderElement.getElementsByTagName(ufrDTO.getClientProductNumber());
						if(clientProductNumberList!=null && clientProductNumberList.getLength()>0){
							Element clientProductNumberElement = (Element)clientProductNumberList.item(0);
							if(clientProductNumberElement!=null){
								NodeList clientProductNumberLNList = clientProductNumberElement.getChildNodes();
								if(clientProductNumberLNList!=null && clientProductNumberLNList.getLength()>0){
									clientProductNumber =((Node)clientProductNumberLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setClientProductNumber(clientProductNumber);

					//--------------- 25:clientOtherId -------------------------
					String clientOtherId="";
					if(ufrDTO.getClientOtherId()!=null){
						NodeList clientOtherIdList = firstOrderElement.getElementsByTagName(ufrDTO.getClientOtherId());
						if(clientOtherIdList!=null && clientOtherIdList.getLength()>0){
							Element clientOtherIdElement = (Element)clientOtherIdList.item(0);
							if(clientOtherIdElement!=null){
								NodeList clientOtherIdLNList = clientOtherIdElement.getChildNodes();
								if(clientOtherIdLNList!=null && clientOtherIdLNList.getLength()>0){
									clientOtherId =((Node)clientOtherIdLNList.item(0)).getNodeValue().trim(); 
								}
							}
						}
					}
					ufDataDTO.setClientOtherId(clientOtherId);

					ufDataDTO.setCreationDate(new Date());

					listOrdersDTO.add(ufDataDTO);
				}//end of if clause
			}//end of for loop with s var
		}//end if with condition ufrDTO!=null 
		return listOrdersDTO;
	}

	/**----------------------------------------------------------
	 *THIS FUNCTION ALLOWS US TO TRANSFORM AN XLS FILE TO A LIST 
	   OF ORDERS*
	  -----------------------------------------------------------*/	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Collection toArrayListFromXLS(File orderFile,String userLogin) throws Exception {

		UserFileRecoveryDTO ufrDTO=null;
		Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
		/*List<Orders>listOrders=getAllOrders();
		if(listOrders!=null){
			for(Orders ord:listOrders){
				lsOrdersIdHash.put(ord.getLsOrderId(), ord.getLsOrderId());
			}
		}*/

		ufrDTO=getUserFileRecoveryByUser(userLogin);
		productService = serviceLocator.getProductService();

		Collection listOrderDTO = new ArrayList();

		if(orderFile!=null && ufrDTO!=null && (ufrDTO.getFileTypeId()==2 || ufrDTO.getFileTypeId()==3 )){
			//variable indicating the numbers of columns in the XLS file
			int ROW_TO_START = 1;
			int COL_COMPANY_HEADER=Integer.parseInt(ufrDTO.getCompanyHeader())-1 ;
			int COL_PRODUCT_ORDER_NUMBER=Integer.parseInt(ufrDTO.getProductOrderNumber())-1;//poNumber
			int COL_PRODUCT_ORDER_DATE=Integer.parseInt(ufrDTO.getProductOrderDate())-1; //poDate
			int COL_QUANTITY=Integer.parseInt(ufrDTO.getQuantity())-1;//quantity
			int COL_LS_PRODUCT_ID=Integer.parseInt(ufrDTO.getLsProductID())-1;//productId
			int COL_CLIENT_PRODUCT_NUMBER=Integer.parseInt(ufrDTO.getClientProductNumber())-1;//productId
			int COL_PRODUCT_DESCRIPTION=Integer.parseInt(ufrDTO.getProductDescription())-1;//description	
			int COL_UNIT_PRICE=Integer.parseInt(ufrDTO.getUnitPrice())-1; //price
			int COL_CLIENT_NUMBER=Integer.parseInt(ufrDTO.getClientNumber())-1;//clientNumber
			int COL_FIRST_NAME=Integer.parseInt(ufrDTO.getClientFirstName())-1;//clientFirstName
			int COL_LAST_NAME=Integer.parseInt(ufrDTO.getClientLastName())-1; //clientLastName
			int COL_ADDRESSS_TREET=Integer.parseInt(ufrDTO.getClientStreet())-1; //clientAdress
			int COL_ADDRESSS_TREET_OTHER=Integer.parseInt(ufrDTO.getClientOtherStreet())-1;//clientAdressOther
			int COL_ADDRESS_CITY=Integer.parseInt(ufrDTO.getClientCity())-1;//clientCity
			int COL_ADDRESS_POSTAL_CODE=Integer.parseInt(ufrDTO.getClientPostalCode())-1;//clientPostalCode
			int COL_ADDRESS_STATE=Integer.parseInt(ufrDTO.getClientProvince())-1;//clientProvince	
			int COL_CLIENT_PHONE=Integer.parseInt(ufrDTO.getClientPhone())-1;//clientPhone
			int COL_CLIENT_EMAIL=Integer.parseInt(ufrDTO.getClientEmail())-1;//clientEmail

			int COL_REQUIRE_DATE=Integer.parseInt(ufrDTO.getRequiredDate())-1;//requiredDate
			int COL_CLIENT_OTHER_NAMES=Integer.parseInt(ufrDTO.getClientOtherNames())-1;//clientsOtherNames
			int COL_CLIENT_PHONE_ZONE=Integer.parseInt(ufrDTO.getClientPhoneZone())-1;//clientPhoneZone
			int CLIENT_ORDER_NUMBER=Integer.parseInt(ufrDTO.getClientOrderNumber())-1;
			int CST_PRODUCT_NUMBER=Integer.parseInt(ufrDTO.getCstProductNumber())-1;
			int SHIPPING_COMPANY=Integer.parseInt(ufrDTO.getShippingCompany())-1;;
			int NOTES=Integer.parseInt(ufrDTO.getNotes())-1;
			int COL_CLIENT_OTHER_ID=Integer.parseInt(ufrDTO.getClientOtherId())-1;

			//Values of cells
			String companyHeader="";
			String productOrderNumber="";//poNumber
			String clientOrderNumber="";
			String cstProductNumber="";
			String shippingCompany="";
			String notes;
			Date productOrderDate; //poDate
			Double quantity=0D;//quantity
			String lsProductID="";//productId
			String productDescription="";//description	
			Double unitPrice=0D; //price
			String clientNumber="";//clientNumber
			String clientFirstName="";//clientFirstName
			String clientLastName=""; //clientLastName
			String clientStreet=""; //clientAdress
			String clientOtherStreet="";//clientAdressOther
			String clientCity="";//clientCity
			String clientPostalCode=" ";//clientPostalCode
			String clientProvince="";//clientProvince	
			String clientPhone="";//clientPhone
			String clientEmail="";//clientEmail	
			Date   requiredDate=null;
			String clientOtherNames="";
			String clientPhoneZone = "";
			String clientProductNumber = "";
			String clientOtherId="";

			//Cells
			Cell cellClientProductNumber=null;
			Cell cellCompanyHeader= null;
			Cell cellProductOrderNumber= null;//poNumber
			Cell cellProductOrderDate= null;//poDate
			Cell cellQuantity= null;//quantity
			Cell cellLsProductID= null;;//productId
			Cell cellProductDescription= null;//description	
			Cell cellUnitPrice= null;//price
			Cell cellClientNumber= null;//clientNumber
			Cell cellClientFirstName= null;//clientFirstName
			Cell cellClientLastName= null; //clientLastName
			Cell cellClientStreet= null;//clientAdress
			Cell cellClientOtherStreet= null;//clientAdressOther
			Cell cellClientCity= null;//clientCity
			Cell cellClientPostalCode= null;//clientPostalCode
			Cell cellClientProvince= null;//clientProvince	
			Cell cellClientPhone= null;//clientPhone
			Cell cellClientEmail= null;//clientEmail	
			Cell cellRequiredDate=null;		//requiredDate
			Cell cellClientOtherNames=null; //clientsOtherNames
			Cell cellClientPhoneZone = null;	//clientPhoneZone
			Cell cellClientOrderNumber=null;
			Cell cellCstProductNumber=null;
			Cell cellShippingCompany=null;
			Cell cellNotes=null;
			Cell cellClientOtherId=null;

			//try {
			List<ProvinceDTO> listProvine= productService.getAllProvinces();
			Workbook existingWorkbook = Workbook.getWorkbook(orderFile);
			Sheet sheetToRead=existingWorkbook.getSheet(0);
			int ROW_MAX = sheetToRead.getRows();

			for(int row=ROW_TO_START; row< ROW_MAX;row++) {

				/*cellProductOrderNumber = sheetToRead.getCell(13, 1);			
				if(cellProductOrderNumber!=null)productOrderNumber = cellProductOrderNumber.getContents();

				cellProductOrderNumber = sheetToRead.getCell(13, 2);			
				if(cellProductOrderNumber!=null)productOrderNumber = cellProductOrderNumber.getContents();*/

				UserFileDataRecoveryDTO ufDataDTO=new UserFileDataRecoveryDTO();
				ufDataDTO.setUserId(ufrDTO.getUserId());
				//--------------- 1: poNumber.
				if(COL_PRODUCT_ORDER_NUMBER>=0)cellProductOrderNumber = sheetToRead.getCell(COL_PRODUCT_ORDER_NUMBER, row);			
				if(cellProductOrderNumber!=null)productOrderNumber = cellProductOrderNumber.getContents();
				ufDataDTO.setProductOrderNumber(productOrderNumber);

				//--------------- 2: clientOrderNumber.
				if(CLIENT_ORDER_NUMBER>=0)cellClientOrderNumber = sheetToRead.getCell(CLIENT_ORDER_NUMBER, row);			
				if(cellClientOrderNumber!=null)clientOrderNumber = cellClientOrderNumber.getContents();
				ufDataDTO.setClientOrderNumber(clientOrderNumber);


				//--------------- 3: cstProductNumber.
				if(CST_PRODUCT_NUMBER>=0)cellCstProductNumber = sheetToRead.getCell(CST_PRODUCT_NUMBER, row);			
				if(cellCstProductNumber!=null)cstProductNumber = cellCstProductNumber.getContents();
				ufDataDTO.setCstProductNumber(cstProductNumber);

				//shippingCompany

				//--------------- 2: companyHeader
				if(COL_COMPANY_HEADER>=0)cellCompanyHeader = sheetToRead.getCell(COL_COMPANY_HEADER, row);			
				if(cellCompanyHeader!=null)companyHeader = cellCompanyHeader.getContents();
				ufDataDTO.setCompanyHeader(companyHeader);

				//--------------- 3: productOrderDate.
				productOrderDate=null;
				if(COL_PRODUCT_ORDER_DATE>=0)cellProductOrderDate = sheetToRead.getCell(COL_PRODUCT_ORDER_DATE, row);			
				if(cellProductOrderDate!=null){
					String strDate=cellProductOrderDate.getContents();
					//strDate=strDate.replaceAll(" ", "");
					SimpleDateFormat sdf = new SimpleDateFormat(ufrDTO.getFormatDate());//("yyyy-MM-dd HH:mm:ss");	
					try {
						Date date = sdf.parse(strDate);
						productOrderDate=date;
					}
					catch (Exception pe) {
						productOrderDate=null;
					}
				}

				ufDataDTO.setProductOrderDate(productOrderDate);

				//--------------- 4: Quantity.
				if(COL_QUANTITY>=0)cellQuantity = sheetToRead.getCell(COL_QUANTITY, row);			
				if(cellQuantity!=null){
					String strQuantity = cellQuantity.getContents();
					strQuantity=strQuantity.replaceAll(" ", "");
					if(strQuantity!=null && !strQuantity.equals("")){
						int index=strQuantity.indexOf(",");
						if(index>=0){
							String strQuantity1=strQuantity.substring(0, index);
							String strQuantity2= strQuantity.substring(index+1, strQuantity.length());
							strQuantity=strQuantity1+"."+strQuantity2;
						}
					}
					quantity=null;
					try {
						quantity = Double.parseDouble(strQuantity);
					}
					catch (Exception pe) {
						quantity=null;
					}
				}
				ufDataDTO.setQuantity(quantity);

				//--------------- 5: lsProductID.
				if(COL_LS_PRODUCT_ID>=0)cellLsProductID = sheetToRead.getCell(COL_LS_PRODUCT_ID, row);			
				if(cellLsProductID!=null)lsProductID = cellLsProductID.getContents();
				ufDataDTO.setLsProductID(lsProductID);

				//--------------- 6: productDescription.
				if(COL_PRODUCT_DESCRIPTION>=0)cellProductDescription = sheetToRead.getCell(COL_PRODUCT_DESCRIPTION, row);			
				if(cellProductDescription!=null)productDescription = cellProductDescription.getContents();
				productDescription=productDescription.replaceAll(",", " ");
				ufDataDTO.setProductDescription(productDescription);

				//--------------- 7: unitPrice.
				if(COL_UNIT_PRICE>=0)cellUnitPrice = sheetToRead.getCell(COL_UNIT_PRICE, row);			
				if(cellUnitPrice!=null){
					String strUnitPrice = cellUnitPrice.getContents();
					strUnitPrice= strUnitPrice.replaceAll("\\$", "");
					strUnitPrice= strUnitPrice.replaceAll(" ", "");
					strUnitPrice= strUnitPrice.replaceAll("\"", "");
					if(strUnitPrice!=null && !strUnitPrice.equals("")){
						int index=strUnitPrice.indexOf(",");
						if(index>=0){
							String strUnitPrice1=strUnitPrice.substring(0, index);
							String strUnitPrice2= strUnitPrice.substring(index+1, strUnitPrice.length());
							strUnitPrice=strUnitPrice1+"."+strUnitPrice2;
						}
					}
					unitPrice=null;
					try {
						unitPrice = Double.parseDouble(strUnitPrice);
					}
					catch (Exception pe) {
						unitPrice=null;
					}
				}
				ufDataDTO.setUnitPrice(unitPrice);

				//--------------- 8: clientNumber.
				if(COL_CLIENT_NUMBER>=0)cellClientNumber = sheetToRead.getCell(COL_CLIENT_NUMBER, row);			
				if(cellClientNumber!=null)clientNumber = cellClientNumber.getContents();
				ufDataDTO.setClientNumber(clientNumber);

				//--------------- 9: FirstName.
				if(COL_FIRST_NAME>=0)cellClientFirstName = sheetToRead.getCell(COL_FIRST_NAME, row);			
				if(cellClientFirstName!=null)clientFirstName = cellClientFirstName.getContents();
				ufDataDTO.setClientFirstName(clientFirstName);

				//--------------- 10: LastName.
				if(COL_LAST_NAME>=0)cellClientLastName = sheetToRead.getCell(COL_LAST_NAME, row);			
				if(cellClientLastName!=null)clientLastName = cellClientLastName.getContents();
				ufDataDTO.setClientLastName(clientLastName);

				//=========== special cases for clients "AsiaMiles" 29  "VibeSMG" 45================
				OrdersDTO orderDTO=new OrdersDTO();
				String[] elems;
				int option;
				int userId=Integer.parseInt(ufrDTO.getUserId().toString());
				String lsProductIdAsiaM=ufDataDTO.getProductDescription();
				String[] elemsLsProductId;
				switch (userId) {
				case 29: 
					// split last name to client "AsiaMiles" to last and first name
					if(clientLastName!=null && !clientLastName.equals("")){
						orderDTO=new OrdersDTO();
						orderDTO.setId(ufDataDTO.getUserId());
						orderDTO.setClientLastName(clientLastName);
						elems  = clientLastName.split("\\s");
						option=elems.length;	
						orderDTO=orderDTOSplitFirstLastName(orderDTO, option);
						clientFirstName=orderDTO.getClientFirstName();
						clientLastName=orderDTO.getClientLastName();
						ufDataDTO.setClientFirstName(clientFirstName);
						ufDataDTO.setClientLastName(clientLastName);
					}
					//recovery AsiaMiles's lsProductId 
					String lsProductId="";
					if(lsProductIdAsiaM!=null && !lsProductIdAsiaM.equals("")){
						//lsProductIdAsiaM=lsProductIdAsiaM.replaceAll("\\*", "_");
						elemsLsProductId=lsProductIdAsiaM.split("\\*");
						if(elemsLsProductId.length>1){
							lsProductId=elemsLsProductId[0];
						}/*else{
								elemsLsProductId=lsProductIdAsiaM.split("_");
								if(elemsLsProductId.length!=0){
									lsProductId=elemsLsProductId[0];
								}else{
									elemsLsProductId=lsProductIdAsiaM.split("-");
									if(elemsLsProductId.length!=0)lsProductId=elemsLsProductId[0];
								}
							}*/
					}
					lsProductId=lsProductId.replaceAll(" ", "");
					ufDataDTO.setLsProductID(lsProductId);
					break;
				case 45: // split last name of client "VibeSMG" to last and first name
					if(clientLastName!=null && !clientLastName.equals("")){
						orderDTO=new OrdersDTO();
						orderDTO.setId(ufDataDTO.getUserId());
						clientLastName="MR "+clientLastName;
						orderDTO.setClientLastName(clientLastName);
						elems  = clientLastName.split("\\s");
						option=elems.length;
						orderDTO=orderDTOSplitFirstLastName(orderDTO, option);
						clientFirstName=orderDTO.getClientFirstName();
						clientLastName=orderDTO.getClientLastName();
						ufDataDTO.setClientFirstName(clientFirstName);
						ufDataDTO.setClientLastName(clientLastName);	
					}
					break;
				}


				//====================================================================================
				//--------------- 11: cellAddressStreet.
				if(COL_ADDRESSS_TREET>=0)cellClientStreet = sheetToRead.getCell(COL_ADDRESSS_TREET, row);			
				if(cellClientStreet!=null)clientStreet = cellClientStreet.getContents();
				clientStreet=clientStreet.replaceAll(",", " ");
				ufDataDTO.setClientStreet(clientStreet);

				//--------------- 12: addressStreetOther.
				if(COL_ADDRESSS_TREET_OTHER>=0)cellClientOtherStreet = sheetToRead.getCell(COL_ADDRESSS_TREET_OTHER, row);			
				if(cellClientOtherStreet!=null)clientOtherStreet = cellClientOtherStreet.getContents();
				clientOtherStreet=clientOtherStreet.replaceAll(",", " ");
				ufDataDTO.setClientOtherStreet(clientOtherStreet);

				//--------------- 13: addressCity.
				if(COL_ADDRESS_CITY>=0)cellClientCity = sheetToRead.getCell(COL_ADDRESS_CITY, row);			
				if(cellClientCity!=null)clientCity = cellClientCity.getContents();
				ufDataDTO.setClientCity(clientCity);

				//--------------- 14: addressPostalCode.
				if(COL_ADDRESS_POSTAL_CODE>=0)cellClientPostalCode = sheetToRead.getCell(COL_ADDRESS_POSTAL_CODE, row);			
				if(cellClientPostalCode!=null)clientPostalCode = cellClientPostalCode.getContents();
				clientPostalCode=clientPostalCode.replaceAll(" ", "");
				ufDataDTO.setClientPostalCode(clientPostalCode);

				//--------------- 15: addressState.
				if(COL_ADDRESS_STATE>=0)cellClientProvince = sheetToRead.getCell(COL_ADDRESS_STATE, row);			
				if(cellClientProvince!=null)clientProvince = cellClientProvince.getContents();

				String clientProvinceToCompar=clientProvince.toLowerCase();
				clientProvinceToCompar=clientProvinceToCompar.replaceAll(" ", "");
				clientProvinceToCompar=clientProvinceToCompar.replaceAll("canada", "");
				clientProvinceToCompar=clientProvinceToCompar.replaceAll(",", "");
				clientProvinceToCompar=clientProvinceToCompar.replaceAll("\\.", "");
				for(ProvinceDTO prov:listProvine){
					String provName=prov.getName();
					provName=provName.replaceAll(" ", "");
					provName= provName.toLowerCase();
					if(clientProvinceToCompar.equals(provName) || clientProvinceToCompar.equals(prov.getCode()) ){
						clientProvince=	prov.getCode();
						break;
					}

				}
				clientProvince=clientProvince.replaceAll("\\.", "");
				if(clientProvinceToCompar.equals(""))clientProvince="";
				ufDataDTO.setClientProvince(clientProvince);

				//--------------- 16: clientPhone.
				if(COL_CLIENT_PHONE>=0)cellClientPhone = sheetToRead.getCell(COL_CLIENT_PHONE, row);			
				if(cellClientPhone!=null)clientPhone = cellClientPhone.getContents();

				//--------------- 17: clientPhoneZone.
				if(COL_CLIENT_PHONE_ZONE>=0)cellClientPhoneZone = sheetToRead.getCell(COL_CLIENT_PHONE_ZONE, row);			
				if(cellClientPhoneZone!=null)clientPhoneZone = cellClientPhoneZone.getContents();			
				if(clientPhoneZone!=null && clientPhoneZone!="")clientPhone=clientPhoneZone+" "+clientPhone;
				ufDataDTO.setClientPhone(clientPhone);

				//--------------- 18: clientEmail.
				if(COL_CLIENT_EMAIL>=0)cellClientEmail = sheetToRead.getCell(COL_CLIENT_EMAIL, row);			
				if(cellClientEmail!=null)clientEmail = cellClientEmail.getContents();
				ufDataDTO.setClientEmail(clientEmail);

				//--------------- 19:requiredDate -------------------------
				String strRequiredDate="";
				if(COL_REQUIRE_DATE>=0)cellRequiredDate = sheetToRead.getCell(COL_REQUIRE_DATE, row);			
				if(cellRequiredDate!=null){
					strRequiredDate = cellRequiredDate.getContents();
					strRequiredDate=strRequiredDate.replaceAll(" ", "");
					SimpleDateFormat sdf = new SimpleDateFormat(ufrDTO.getFormatDate());
					try {
						Date date = sdf.parse(strRequiredDate);
						requiredDate=date;
					}
					catch (Exception pe) {
						requiredDate=null;
					}
				}
				ufDataDTO.setRequiredDate(requiredDate);

				//--------------- 20:clients_other_names ----------------
				clientOtherNames="";
				if(COL_CLIENT_OTHER_NAMES>=0)cellClientOtherNames = sheetToRead.getCell(COL_CLIENT_OTHER_NAMES, row);			
				if(cellClientOtherNames!=null)clientOtherNames = cellClientOtherNames.getContents();
				ufDataDTO.setClientOtherNames(clientOtherNames);

				//--------------- 21:lsOrderId ------------------------
				String code=userLogin.substring(0, 2).toUpperCase();
				String lsOrderId=ufDataDTO.getProductOrderNumber();

				int inc=0;//increment
				String lsOrderIdParent=lsOrderId;
				lsOrderIdParent=lsOrderIdParent.replaceFirst("-", "");
				lsOrderIdParent=lsOrderIdParent.replaceFirst("_", "");
				lsOrderIdParent=lsOrderIdParent.replaceFirst("R", "");
				lsOrderIdParent=lsOrderIdParent.replaceAll(" ", "");
				if(lsOrderIdParent.length()>14){
					int index=lsOrderIdParent.length()-14;
					lsOrderIdParent=lsOrderIdParent.substring(index, lsOrderIdParent.length());
				}

				//lsOrderIdParent=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent;
				String lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent;;
				while(isLsOrderIdUsed(lsOrderIdToGenerate) || lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
					inc++; 
					lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent+"R"+inc;
				}
				lsOrdersIdHash.put(lsOrderIdToGenerate, lsOrderIdToGenerate);
				ufDataDTO.setLsOrderId(lsOrderIdToGenerate);

				//--------------- 22:shipping company -------------------
				shippingCompany="";
				if(SHIPPING_COMPANY>=0)cellShippingCompany = sheetToRead.getCell(SHIPPING_COMPANY, row);			
				if(cellShippingCompany!=null)shippingCompany = cellShippingCompany.getContents();
				ufDataDTO.setShippingCompany(shippingCompany);

				//--------------- 23:Notes -------------------
				notes="";
				if(NOTES>=0)cellNotes = sheetToRead.getCell(NOTES, row);			
				if(cellNotes!=null)notes = cellNotes.getContents();
				ufDataDTO.setNotes(notes);

				ufDataDTO.setCreationDate(new Date());

				//--------------- 24: ClientProductNumber.
				if(COL_CLIENT_PRODUCT_NUMBER>=0)cellClientProductNumber = sheetToRead.getCell(COL_CLIENT_PRODUCT_NUMBER, row);			
				if(cellClientProductNumber!=null)clientProductNumber = cellClientProductNumber.getContents();
				ufDataDTO.setClientProductNumber(clientProductNumber);

				//--------------- 25: cellClientOtherId.
				if(COL_CLIENT_OTHER_ID>=0)cellClientOtherId = sheetToRead.getCell(COL_CLIENT_OTHER_ID, row);			
				if(cellClientOtherId!=null)clientOtherId = cellClientOtherId.getContents();
				ufDataDTO.setClientOtherId(clientOtherId);
				if(ufDataDTO.getProductOrderNumber()!=null && !ufDataDTO.getProductOrderNumber().equals(""))listOrderDTO.add(ufDataDTO);
			}
			//} catch (Exception x) {
			//	x.printStackTrace();
			//}
		}
		return listOrderDTO;

	}


	/**----------------------------------------------------------
	 	check if the LsOrderId is already in use
	  -----------------------------------------------------------*/	
	@SuppressWarnings("unused")
	@Override
	public boolean isLsOrderIdUsed(final String lsOrderId){
		boolean result=false;	
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().isLsOrderIdUsed(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *GET HASHtABLE WITH HIERARCHICAL (ORDER<->ROWS)
	 	 OF ORDERS FROM LIST OF USER FILE RECOVERY*
	  -----------------------------------------------------------*/	
	@SuppressWarnings("unused")
	@Override
	public Hashtable<String, OrdersDTO> getHashOrdersFromUserDataRecovery(Long userId,ArrayList<UserFileDataRecoveryDTO> list)
	throws ServiceException {
		Hashtable<String, OrdersDTO> result=new Hashtable<String, OrdersDTO>();

		try {
			productService = serviceLocator.getProductService(); 
			userService= serviceLocator.getUserService();
		} catch (ServiceLocatorException e) {
			e.printStackTrace();
		}

		for(UserFileDataRecoveryDTO orDTO: list){
			OrdersDTO ordDTOCheck=result.get(orDTO.getLsOrderId());
			String lsProductID=orDTO.getLsProductID();
			String providedLsProductId=orDTO.getLsProductID();
			//String clientProductNumber=lsProductID;
			//ProductDTO pDTO=hashProductDTO.get(lsProductID);
			lsProductID=lsProductID.replaceAll(" ", "");
			//ProductDTO pDTO=productService.getProductByLsProductId(lsProductID);
			UserProductPriceDTO pDTO=productService.getUsrPPriceByLsproductId(userId, lsProductID);
			if(pDTO==null){
				int index=lsProductID.indexOf("-");
				if(index==-1)index=lsProductID.indexOf(" ");
				if(index<=2)lsProductID=lsProductID.substring(index+1, lsProductID.length());
				//pDTO=productService.getProductByLsProductId(lsProductID);
				pDTO=productService.getUsrPPriceByLsproductId(userId, lsProductID);
			}
			if(pDTO==null){
				int index=lsProductID.indexOf("_");
				if(index==-1)index=lsProductID.indexOf(" ");
				if(index<=2)lsProductID=lsProductID.substring(index+1, lsProductID.length());
				//pDTO=productService.getProductByLsProductId(lsProductID);
				pDTO=productService.getUsrPPriceByLsproductId(userId, lsProductID);
			}
			UserDTO uDTO=userService.getUserInformation(userId);
			String userLogin="anonymous";
			if(uDTO!=null)userLogin=uDTO.getLogin();
			if(ordDTOCheck==null){
				OrdersDTO ordDTOToAdd=new OrdersDTO();
				ordDTOToAdd=DTOFactory.getOrderDTOFromUserDataRecovery(userId,orDTO);
				ordDTOToAdd.setUserLogin(userLogin);
				//ordDTOToAdd.setClientProductNumber(clientProductNumber);
				OrdersRows ordRow=ordDTOToAdd.getRowsList().get(0);
				if(ordRow!=null){
					ordRow.setLsProductID(lsProductID);
					if(pDTO!=null){
						//ordRow.setProductId(pDTO.getId());
						ordRow.setProductId(pDTO.getProductId());
						//if client is "AsiaMiles" then unitPrice=cost
						String strUserId=userId.toString();
						int intUserId=Integer.parseInt(strUserId);
						switch (intUserId) {
						case 29:
							if(pDTO.getPrice()!=null && !pDTO.getPrice().equals("")){
								String strProductPrice=pDTO.getPrice();
								int index=strProductPrice.indexOf(",");
								if(index>=0){
									String strProductPrice1=strProductPrice.substring(0, index);
									String strProductPrice2= strProductPrice.substring(index+1, strProductPrice.length());
									strProductPrice=strProductPrice1+"."+strProductPrice2;
								}
								Double productPrice=null;
								try {
									productPrice = Double.parseDouble(strProductPrice);
								}
								catch (Exception pe) {
									productPrice=null;
								}
								ordRow.setUnitPrice(productPrice);
							}
							break;
						default:
							ordRow.setUnitPrice(orDTO.getUnitPrice());
							break;
						}
						//ordRow.setUnitPrice(orDTO.getUnitPrice());
						ordRow.setRequiredDate(orDTO.getRequiredDate());
						ordRow.setShippingCompany(orDTO.getShippingCompany());
						//ordRow.setClientProductNumber(clientProductNumber);
						ordRow.setClientProductNumber(orDTO.getClientProductNumber());
						ordRow.setStock(pDTO.getStock());
					}else{
						ordRow.setProductId(null);
						ordRow.setUnitPrice(null);
						ordRow.setRequiredDate(null);
						ordRow.setShippingCompany(null);
						//ordRow.setClientProductNumber(clientProductNumber);
						ordRow.setClientProductNumber(orDTO.getClientProductNumber());
						ordRow.setStock(null);
					}

				}
				result.put(orDTO.getLsOrderId(), ordDTOToAdd);
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *GET HASHtABLE FROM LIST ORDERS DTO*
	  -----------------------------------------------------------*/	
	@Override
	public Hashtable<String, OrdersDTO> getHashOrdersDTOFromListOrdersDTO(List<OrdersDTO> list)
	throws ServiceException {
		Hashtable<String, OrdersDTO> result=new Hashtable<String, OrdersDTO>();

		for(OrdersDTO orDTO: list){
			result.put(orDTO.getLsOrderId(), orDTO);
		}
		return result;
	}

	/**----------------------------------------------------------
	 *SAVING ORDERS WITH THERE ROWS IN DATABASE*
	  -----------------------------------------------------------*/	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> insertListOrders(List<OrdersDTO> listOrdersDTO)throws Exception {
		List<OrdersDTO> listOrdersDTOResult=null;
		List<Orders> result=null;
		final List<Orders>listOrders=DTOFactory.getListOrdersFromListOrdersDTO(listOrdersDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertListOrders(listOrders);
				}
			});
		}catch (DaoException de) {
			try {
				throw new Exception(de);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		listOrdersDTOResult=DTOFactory.getListOrderDTOFromListOrder(result);
		return listOrdersDTOResult;
	}


	/**----------------------------------------------------------
	 *INSERT INVOICED ORDER IN DATABASES*
	  -----------------------------------------------------------*/	

	@Override
	public boolean insertInvoicedOrder(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertInvoicedOrder(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *INSERT ORDERS IF ARE EXISTING IN DATABASE*
	  -----------------------------------------------------------*/	
	@Override
	public boolean insertListOrdersIfNotExist(List<OrdersDTO> listOrdersDTO){
		boolean result=false;
		final List<Orders>listOrders=DTOFactory.getListOrdersFromListOrdersDTO(listOrdersDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertListOrdersIfNotExist(listOrders);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *INSERT ORDER WHITH ROW*
	  -----------------------------------------------------------*/	
	@Override
	public boolean insertOrderWithRows(OrdersDTO orderDTO) {
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertOrderWithRows(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	/**----------------------------------------------------------
	 *MAKE ORDER IN PROGRESS*
	  -----------------------------------------------------------*/	
	@Override
	public boolean makeOrderInProgress(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=new Orders();
		order.setLsOrderId(orderDTO.getLsOrderId());
		order.setSpecialHandlingName(orderDTO.getSpecialHandlingName());
		order.setSpecialHandlingFee(orderDTO.getSpecialHandlingFee());
		order.setTotalPrice(orderDTO.getTotalPrice());
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().makeOrderInProgress(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	/**----------------------------------------------------------
	 *GET ORDER DTO BY LS_ORDER_ID*
	  -----------------------------------------------------------*/	
	@Override
	public OrdersDTO getOrderDTOByLsOrderId(final String lsOrderId)
	throws ServiceException { 

		Orders order=null;	
		OrdersDTO result=null;
		try{
			daoManager.setCommitTransaction(true);
			order = (Orders) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getOrderByLsOrderId(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		if(order!=null)result=DTOFactory.getOrderDTOFromOrder(order);
		return result;

	}

	/**----------------------------------------------------------
	 *IF FOUND ANY ORDER DUPLICATE RETURN TRUE*
	  -----------------------------------------------------------*/	
	@Override
	public boolean isThereDuplicate(List<OrdersDTO> listOrdersDTO){
		boolean result=false;
		if(listOrdersDTO!=null){
			for(OrdersDTO orderDTO:listOrdersDTO){
				if(orderDTO.getDuplicate()!=null && orderDTO.getDuplicate()==true){
					result=true;
					break;
				}
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *GET ORDER DTO BY ProductOrderNumber*
	  -----------------------------------------------------------*/	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> getListOrdersByPONumber(final List<OrdersDTO> listOrdersDTO){ 
		final List<Orders>listOrders=DTOFactory.getListOrdersFromListOrdersDTO(listOrdersDTO);
		List<Orders>resultList=null;
		try{
			daoManager.setCommitTransaction(true);
			resultList= (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getListOrdersByPONumber(listOrders);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		List<ProvinceDTO> listProvinces;
		Hashtable<String, ProvinceDTO> hashProvinces=new Hashtable<String, ProvinceDTO>(); 

		try {
			productService = serviceLocator.getProductService(); 
			userService= serviceLocator.getUserService();
			listProvinces = productService.getAllProvinces();
			for(ProvinceDTO provinceDTO:listProvinces){
				hashProvinces.put(provinceDTO.getCode(), provinceDTO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DTOFactory.getListOrderDTOFromListOrderSorted(resultList,hashProvinces);

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> getOrdersItemsExistInDB(final List<OrdersDTO> listOrdersDTO){ 
		final List<Orders>listOrders=DTOFactory.getListOrdersFromListOrdersDTO(listOrdersDTO);
		List<Orders>resultList=null;
		try{
			daoManager.setCommitTransaction(true);
			resultList= (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getOrdersItemsExistInDB(listOrders);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(resultList);
	}
	
	/**----------------------------------------------------------
	 *CHECK IF ANY ORDERS IS ALREADY EXISTE IN DATABASE*
	  -----------------------------------------------------------*/
	@Override
	public boolean isExistAnyLsOrderIdInDB(List<OrdersDTO>listOrdersDTO){
		boolean result=false;
		//List<OrdersDTO>resultListOrdersDTO=getListOrdersByPONumber(listOrdersDTO);
		List<OrdersDTO>resultListOrdersDTO=getOrdersItemsExistInDB(listOrdersDTO);
		if(resultListOrdersDTO!=null && resultListOrdersDTO.size()>0)result=true;
		return result;
	}

	/**----------------------------------------------------------
	 *CALCULATE NUMBER OF ORDERS WHICH HAVE NOT PLANNED
	 	 TO DALETE*
	  -----------------------------------------------------------*/
	@Override
	public Integer nbOrderRowsNotDeleted(List<OrdersRows>listOrdersRows){
		int result=0;
		if(listOrdersRows!=null){
			for(OrdersRows orderR:listOrdersRows){
				if(orderR.getToDelete()==0)result++;
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *CALCULATING THE NUMBER OF ORDERS IN LIST WHICH HAVE 
	 	 NOT REGISTERED IN DATABASE*
	  -----------------------------------------------------------*/
	@Override
	public Long nbOrdersNotSavedInDB(List<OrdersDTO>listOrders){
		long result=0L;
		if(listOrders!=null){
			for(OrdersDTO orderDTO:listOrders){
				try {
					String productOrderNumber=orderDTO.getProductOrderNumber();
					Long userId=orderDTO.getUserId();
					Long count= getCountOrderByPONumber(productOrderNumber, userId);
					if(count==0){
						result++;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *GET CountOrderByPONumber*
  	   -----------------------------------------------------------*/	
	@Override
	public Long getCountOrderByPONumber(final String productOrderNumber, final Long userId){ 
		Long count=0L;
		try{
			daoManager.setCommitTransaction(true);
			count = (Long) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getCountOrderByPONumber(productOrderNumber, userId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;

	}

	/**----------------------------------------------------------
	 *GENERATE LS_ORDER_ID FOR ORDER DUPLICATED*
	  -----------------------------------------------------------*/
	@Override
	public String generateLsOrderId(String lsOrder,Hashtable<String, OrdersDTO>hashOrders){
		String result=lsOrder;
		String resultSub=lsOrder;
		int index=result.indexOf("_");
		if(index>=1)resultSub=result.substring(0,index);
		int NB=1;
		String ext="_";
		result=resultSub+ext+NB;
		try {
			while(hashOrders.containsKey(result)){
				NB++;
				result=resultSub+ext+NB;
			}
			boolean alredyUsed=true;
			while(alredyUsed){
				NB++;
				result=resultSub+ext+NB;
				alredyUsed=isThisLsOrderIdInUsed(result);
			}
		} catch (Exception e) {
			System.out.println("problem in generateLsOrderId Method");
			e.printStackTrace();
		}


		return result;
	}

	/**----------------------------------------------------------
	 *GENERATE LS_ORDER_ID FOR MANUAL ORDERS*
	  -----------------------------------------------------------*/

	@Override
	public String generateManLsOrderId(final String lsOrderFirstPart) throws ServiceException {  
		Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
		List<Orders>listOrders=getAllOrders();
		if(listOrders!=null){
			for(Orders ord:listOrders){
				lsOrdersIdHash.put(ord.getLsOrderId(), ord.getLsOrderId());
			}
		}
		int inc=0;//increment
		String lsOrderIdToGenerate=lsOrderFirstPart;;
		while(lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
			inc++; 
			lsOrderIdToGenerate=lsOrderFirstPart+"R"+inc;
		}
		return lsOrderIdToGenerate;
	}

	/**----------------------------------------------------------
	 *GET LIST ORDERS BY DATE, CLIENT AND LIKE LSORDER_ID*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> getOrdersByDateClientLikeLsOrderId(final Date creationDate, final String userLogin, final String lsOrderId,String status){
		List<Orders> result=null;
		List<Orders> resultCleaned=new ArrayList<Orders>();
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getOrdersByDateClientLikeLsOrderId(creationDate, userLogin,lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		if(result!=null){
			for(Orders ord:result){
				ArrayList<OrdersRows>listR=getRowsByLsOrderIdLikeStatus(ord.getLsOrderId(),status,0);
				ord.setRowsList(listR);
				if(listR!=null && listR.size()>0)resultCleaned.add(ord);
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(resultCleaned);
	}

	/**----------------------------------------------------------
	 *SEARCH ORDERS BY OPTIONS*
	  -----------------------------------------------------------*/	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> searchOrdersWithOptions(final Date creationDateStart,final Date creationDateEnd, final String userLogin, final String lsOrderId,String status){
		List<Orders> result=null;
		List<Orders> resultCleaned=new ArrayList<Orders>();
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().searchOrdersWithOptions(creationDateStart,creationDateEnd, userLogin,lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) { 
				e.printStackTrace();
			}
		}
		if(result!=null){
			for(Orders ord:result){
				ArrayList<OrdersRows>listR=getRowsByLsOrderIdLikeStatus(ord.getLsOrderId(),status,0);
				ord.setRowsList(listR);
				if(listR!=null && listR.size()>0)resultCleaned.add(ord);
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(resultCleaned);
	}

	/**----------------------------------------------------------
	 *SEARCH ORDERS BY OPTIONS AND SORTING*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> searchOrdersWithOptionsAndSorting(final Date creationDateStart,final Date creationDateEnd,final Integer factorDateBetween,
			final String userLogin, final String lsOrderId,final String status,
			final List<Integer>listIndexColumn,final Integer PAGE_ITEMS_COUNT,final Integer indexSet){
		List<Orders> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().searchOrdersWithOptionsAndSorting(creationDateStart, creationDateEnd,factorDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,indexSet);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) { 
				e.printStackTrace();
			}
		}
		List<ProvinceDTO> listProvinces;
		Hashtable<String, ProvinceDTO> hashProvinces=new Hashtable<String, ProvinceDTO>(); 
		try {
			productService = serviceLocator.getProductService(); 
			userService= serviceLocator.getUserService();
			listProvinces = productService.getAllProvinces();
			for(ProvinceDTO provinceDTO:listProvinces){
				hashProvinces.put(provinceDTO.getCode(), provinceDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(result!=null) {
			for(Orders order: result) {
				if(order.getCurrencyId()!=null && order.getCurrencyRate()!=null) {
					if(order.getLsPrice()!=null) {
						Double currencyPrice = order.getLsPrice()*order.getCurrencyRate();
						currencyPrice = (double) Math.round(currencyPrice*100) / 100;
						order.setCurrencyPrice(currencyPrice);
					}
					if(order.getUnitPrice()!=null) {
						Double currencyUnitPrice = order.getUnitPrice()*order.getCurrencyRate();
						currencyUnitPrice = (double) Math.round(currencyUnitPrice*100) / 100;
						order.setCurrencyUnitPrice(currencyUnitPrice);
					}
					/*
					if(order.getShippingPrice()!=null) {
						Double currencyShippingPrice = order.getShippingPrice()*order.getCurrencyRate();
						currencyShippingPrice = (double) Math.round(currencyShippingPrice*100) / 100;
						order.setCurrencyShippingPrice(currencyShippingPrice);
					}
					*/
				}
			}
		}

		return DTOFactory.getListOrderDTOFromListOrderSorted(result,hashProvinces);
	}
	
	/**----------------------------------------------------------
	 *SEARCH ORDERS BY OPTIONS AND SORTING* 
	 *New method implemented for the new parameter
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> searchOrdersWithOptionsAndSorting(
			final Date creationDateStart,
			final Date creationDateEnd,
			final Integer factorDateBetween,
			final OrdersDTO ordersDTO,
			final List<Integer>listIndexColumn,
			final Integer PAGE_ITEMS_COUNT,
			final Integer indexSet){
		List<Orders> result=null;
		
		final Orders orderObj=new Orders();
		orderObj.setUserLogin(ordersDTO.getUserLogin());
		orderObj.setOrderId(ordersDTO.getOrderId());
		orderObj.setStatus(ordersDTO.getStatus());
		orderObj.setProductOrderNumber(ordersDTO.getProductOrderNumber());
		orderObj.setClientOrderNumber(ordersDTO.getClientOrderNumber());
		orderObj.setClientOtherId(ordersDTO.getClientOtherId());
		
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().searchOrdersWithOptionsAndSorting(
							creationDateStart, 
							creationDateEnd,
							factorDateBetween,
							orderObj, 
							listIndexColumn,
							PAGE_ITEMS_COUNT,
							indexSet);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) { 
				e.printStackTrace();
			}
		}
		List<ProvinceDTO> listProvinces;
		Hashtable<String, ProvinceDTO> hashProvinces=new Hashtable<String, ProvinceDTO>(); 
		try {
			productService = serviceLocator.getProductService(); 
			userService= serviceLocator.getUserService();
			listProvinces = productService.getAllProvinces();
			for(ProvinceDTO provinceDTO:listProvinces){
				hashProvinces.put(provinceDTO.getCode(), provinceDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(result!=null) {
			for(Orders order: result) {
				if(order.getCurrencyId()!=null && order.getCurrencyRate()!=null) {
					if(order.getLsPrice()!=null) {
						Double currencyPrice = order.getLsPrice()*order.getCurrencyRate();
						currencyPrice = (double) Math.round(currencyPrice*100) / 100;
						order.setCurrencyPrice(currencyPrice);
					}
					if(order.getUnitPrice()!=null) {
						Double currencyUnitPrice = order.getUnitPrice()*order.getCurrencyRate();
						currencyUnitPrice = (double) Math.round(currencyUnitPrice*100) / 100;
						order.setCurrencyUnitPrice(currencyUnitPrice);
					}
					/*
					if(order.getShippingPrice()!=null) {
						Double currencyShippingPrice = order.getShippingPrice()*order.getCurrencyRate();
						currencyShippingPrice = (double) Math.round(currencyShippingPrice*100) / 100;
						order.setCurrencyShippingPrice(currencyShippingPrice);
					}
					*/
				}
			}
		}

		return DTOFactory.getListOrderDTOFromListOrderSorted(result,hashProvinces);
	}


	/**----------------------------------------------------------
	 *SEARCH INVOICED ORDERS BY OPTIONS AND SORTING*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> searchInvoicedWithSorting(final Date creationDateStart,final Date creationDateEnd,final Integer factorDateBetween,final String userLogin, final String lsOrderId,final String status,final List<Integer>listIndexColumn,final int PAGE_ITEMS_COUNT,final int indexSet){
		List<Orders> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().searchInvoicedWithSorting(creationDateStart, creationDateEnd,factorDateBetween,userLogin, lsOrderId, status, listIndexColumn,PAGE_ITEMS_COUNT,indexSet);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) { 
				e.printStackTrace();
			}
		}
		List<ProvinceDTO> listProvinces;
		Hashtable<String, ProvinceDTO> hashProvinces=new Hashtable<String, ProvinceDTO>(); 
		try {
			productService = serviceLocator.getProductService(); 
			userService= serviceLocator.getUserService();
			listProvinces = productService.getAllProvinces();
			for(ProvinceDTO provinceDTO:listProvinces){
				hashProvinces.put(provinceDTO.getCode(), provinceDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(result!=null) {
			for(Orders order: result) {
				if(order.getCurrencyId()!=null && order.getCurrencyRate()!=null) {
					if(order.getLsPrice()!=null) {
						Double currencyPrice = order.getLsPrice()*order.getCurrencyRate();
						currencyPrice = (double) Math.round(currencyPrice*100) / 100;
						order.setCurrencyPrice(currencyPrice);
					}
					if(order.getUnitPrice()!=null) {
						Double currencyUnitPrice = order.getUnitPrice()*order.getCurrencyRate();
						currencyUnitPrice = (double) Math.round(currencyUnitPrice*100) / 100;
						order.setCurrencyUnitPrice(currencyUnitPrice);
					}
					/*
					if(order.getShippingPrice()!=null) {
						Double currencyShippingPrice = order.getShippingPrice()*order.getCurrencyRate();
						currencyShippingPrice = (double) Math.round(currencyShippingPrice*100) / 100;
						order.setCurrencyShippingPrice(currencyShippingPrice);
					}
					*/
				}
			}
		}
		return DTOFactory.getListOrderDTOFromListOrderSorted(result,hashProvinces);
	}


	/**----------------------------------------------------------
	 *GET LIST ROWS BY LSORDER_ID LIKE STATUS*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<OrdersRows> getRowsByLsOrderIdLikeStatus(final String lsOrderId, final String status,final Integer sort){
		ArrayList<OrdersRows> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (ArrayList<OrdersRows>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getRowsByLsOrderIdLikeStatus(lsOrderId, status,sort);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *UPDATE ORDERS ROWS BY LIKE LSORDER_ID, DATE, STATUS, CLIENT*
	  -----------------------------------------------------------*/
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<OrdersRows> getRowsByLsOrderIdLikeStatusSorted(final String lsOrderId, final String status,final Integer sort){
		ArrayList<OrdersRows> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (ArrayList<OrdersRows>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getRowsByLsOrderIdLikeStatusSorted(lsOrderId, status,sort);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**----------------------------------------------------------
	 *UPDATE ORDER BY LSORDER_ID*
	  -----------------------------------------------------------*/
	@Override
	public boolean updateOrderByLsOrderId(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateOrderByLsOrderId(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	/**----------------------------------------------------------
	 *UPDATE ROW ORDER SHIPPING ELEMENTS(NOTES,SHIPPING_COMPANY, TRACKING_NUMBER) BY LSORDER_ID*
	  -----------------------------------------------------------*/
	@Override
	public boolean updateShippingOrderElements(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);

		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateShippingOrderElements(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}




	/**----------------------------------------------------------
	 *UPDATE ROW ORDER SHIPPING ELEMENTS(NOTES,SHIPPING_COMPANY, TRACKING_NUMBER) BY LSORDER_ID*
	  -----------------------------------------------------------*/
	@Override
	public boolean updateShippingInvoicedOrder(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);

		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateShippingInvoicedOrder(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public boolean updateQuantityOrderByLsOrderId(OrdersDTO orderDTO){
		boolean result=false;
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateQuantityOrderByLsOrderId(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public boolean updateStatusByLsOrderId(final String lsOrderId,final String status){
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateStatusByLsOrderId(lsOrderId,status);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public boolean deleteOrderByLsOrderId(OrdersDTO orderDTO){
		final Orders order =DTOFactory.getOrderFromOrderDTO(orderDTO);
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().deleteOrderByLsOrderId(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	/**----------------------------------------------------------
	 *GET ORDER ROW BY ID ROW*
	  -----------------------------------------------------------*/
	@Override
	public OrdersRows getRowsByRowId(final Long rowId){
		OrdersRows result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (OrdersRows) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getRowsByRowId(rowId);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}



	/**----------------------------------------------------------
	 *GET ROW ORDER  BY lsOrderId*
	  -----------------------------------------------------------*/
	@Override
	public OrdersRows getRowByLsOrderId(final String lsOrderId){
		OrdersRows result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (OrdersRows) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getRowByLsOrderId(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 *CHANGE STATUS OF ROW ORDER TO SHIPPED IN DATABASE*
	  -----------------------------------------------------------*/
	@Override
	public boolean makeRowOrderInShippedById(final OrdersRows orderRow){
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().makeRowOrderInShippedById(orderRow);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 *CHANGE STATUS OF ROW ORDER TO OPEN*
	  -----------------------------------------------------------*/
	@Override
	public boolean makeRowOrderInOpenById(final OrdersRows orderRow){
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().makeRowOrderInOpenById(orderRow);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 *CHECK IF PRODUCT ALREADY EXIST IN TABLE STOCK*
	  -----------------------------------------------------------*/
	@Override
	public boolean isExistProductInStock(ProductDTO productDTO){
		boolean result=false;
		final Product product=new Product();
		product.setId(productDTO.getId());
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().isExistProductInStock(product);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 *INSERT PRODUCT IN TABLE STOCK WHITH QANTITY STOCK*
	  -----------------------------------------------------------*/
	/*@Override
	public boolean insertProductInStock(ProductDTO productDTO){
		boolean result=false;
		final Product product=new Product();
		product.setId(productDTO.getId());
		product.setStock(productDTO.getStock());
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertProductInStock(product);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}*/

	/**----------------------------------------------------------
	 *CREATE XLS FILE FROM THE LIST ORDERS*
	  -----------------------------------------------------------*/
	@Override
	public void generateAdminXLS(List<OrdersDTO> listOrdersDTO,String ordersAdminTemplateFolder,Long allOrdersSelected){
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		//COLUMNS NUMBER if(allOrdersSelectedSignal==null || allOrdersSelectedSignal==0L)
		final int COL_LS_ORDER_ID=1,
		COL_PO_NUMBER=2,
		COL_CLIENT_NUMBER=3,
		COL_CLIENT_ORDER_ID=4,
		COL_CLIENT_OTHER_ID=5,
		COL_USER_LOGIN=6,
		COL_LS_PRODUCT_ID=7,
		COL_CLIENT_PRODUCT_NUMBER=8,
		COL_P_DESCRIPTION=9,
		COL_QUANTITY=10,
		COL_UNIT_PRICE=11,
		COL_LS_PRICE=12,
		COL_TRACKING_NUMBER=13,
		COL_STATUS=14,
		CO_STOCK=15,
		COL_CLIENT_FIRST_NAME=16,
		COL_CLIENT_LAST_NAME=17,
		COL_CLIENT_OTHER_NAMES=18,
		COL_CLIENT_STREET=19,
		COL_CLIENT_OTHER_STREET=20,
		COL_CLIENT_CITY=21,
		COL_CLIENT_PROVINCE=22,
		COL_CLIENT_POSTAL_CODE=23,
		COL_CLIENT_PHONE=24,
		COL_CLIENT_EMAIL=25;
		//COLUMNS Data
		String LS_ORDER_ID=null;
		String PO_NUMBER="";
		String CLIENT_NUMBER="";
		String CLIENT_ORDER_ID="";
		String CLIENT_OTHER_ID="";
		String LS_PRODUCT_ID="";
		String CLIENT_PRODUCT_NUMBER="";
		Double QUANTITY=0D;
		String P_DESCRIPTION="";
		Double UNIT_PRICE=0D;
		Double LS_PRICE=0D;
		String TRACKING_NUMBER="";
		String STATUS="";
		Double STOCK=0D;
		String USER_LOGIN="";
		String CLIENT_FIRST_NAME="";
		String CLIENT_LAST_NAME="";
		String CLIENT_OTHER_NAMES="";
		String CLIENT_STREET="";
		String CLIENT_OTHER_ADRESS="";
		String CLIENT_CITY="";
		String CLIENT_PROVINCE="";
		String CLIENT_POSTAL_CODE="";
		String CLIENT_PHONE="";
		String CLIENT_EMAIL="";
		int row = 0;
		try {
			Workbook existingWorkbook = Workbook.getWorkbook(new File(ordersAdminTemplateFolder+"ordersAdminTemplate.xls"));
			WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(ordersAdminTemplateFolder+"ordersAdminExport.xls"), existingWorkbook);
			WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);

			int heightInPoints = 27*27;


			// Create cell font and format
			/* WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
	    cellFont.setColour(Colour.BLACK);
	    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
	    cellFormat.setBackground(Colour.ORANGE);
	    cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);*/

			// Create cell font and format
			WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);

			WritableCellFormat cellFormatAlert = new WritableCellFormat(cellFont);
			//cellFormatOrange.setBackground(Colour.ORANGE);
			cellFormatAlert.setBackground(Colour.ORANGE);
			cellFormatAlert.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatAlert.setAlignment(Alignment.CENTRE);
			cellFormatAlert.setWrap(true);
			cellFormatAlert.setBorder(Border.ALL, BorderLineStyle.THIN);

			WritableCellFormat cellFormatNormal = new WritableCellFormat(cellFont);
			//cellFormatOrange.setBackground(Colour.ORANGE);
			cellFormatNormal.setBackground(Colour.LIGHT_TURQUOISE);
			cellFormatNormal.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatNormal.setAlignment(Alignment.CENTRE);
			cellFormatNormal.setWrap(true);
			cellFormatNormal.setBorder(Border.ALL, BorderLineStyle.THIN);

			//WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatWhite = new WritableCellFormat(cellFont);
			cellFormatWhite.setBackground(Colour.WHITE);
			cellFormatWhite.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhite.setAlignment(Alignment.CENTRE);
			cellFormatWhite.setWrap(true);
			cellFormatWhite.setBorder(Border.ALL, BorderLineStyle.THIN);
			WritableCellFormat cellFormat=null;

			WritableCell cellROW_ID=null;
			WritableCell cellCLIENT_FIRST_NAME=null;
			WritableCell cellCLIENT_LAST_NAME=null;
			WritableCell cellCLIENT_OTHER_NAMES=null;
			WritableCell cellCLIENT_STREET=null;
			WritableCell cellCLIENT_OTHER_ADRESS=null;
			WritableCell cellCLIENT_CITY=null;
			WritableCell cellCLIENT_PROVINCE=null;
			WritableCell cellCLIENT_POSTAL_CODE=null;
			WritableCell cellCLIENT_PHONE=null;
			WritableCell cellCLIENT_EMAIL=null;
			WritableCell cellLS_PRODUCT_ID=null;
			WritableCell cellQUANTITY=null;
			WritableCell cellUNIT_PRICE=null;
			WritableCell cellLS_PRICE=null;
			WritableCell cellSTATUS=null;
			WritableCell cellSTOCK=null;
			WritableCell cellUSER_LOGIN=null;
			WritableCell cellP_DESCRIPTION=null;
			WritableCell cellPO_NUMBER=null;
			WritableCell cellCLIENT_NUMBER=null;
			WritableCell cellCLIENT_PRODUCT_NUMBER=null;
			WritableCell cellTRACKING_NUMBER=null;
			WritableCell cellCLIENT_ORDER_ID=null;
			WritableCell cellCLIENT_OTHER_ID=null;
			//LABELS
			Label labelROW_ID=null,
			labelCLIENT_FIRST_NAME=null,
			labelCLIENT_LAST_NAME=null,
			labelCLIENT_OTHER_NAMES=null,
			labelCLIENT_STREET=null,
			labelCLIENT_OTHER_ADRESS=null,
			labelCLIENT_CITY=null,
			labelCLIENT_PROVINCE=null,
			labelCLIENT_POSTAL_CODE=null,
			labelCLIENT_PHONE=null,
			labelCLIENT_EMAIL=null,
			labelLS_PRODUCT_ID=null,
			labelQUANTITY=null,
			labelUNIT_PRICE=null,
			labelLS_PRICE=null,
			labelSTATUS=null,
			labelSTOCK=null,
			labelUSER_LOGIN=null,
			labelP_DESCRIPTION=null,
			labelPO_NUMBER=null,
			labelCLIENT_NUMBER=null,
			labelCLIENT_PRODUCT_NUMBER=null,
			labelTRACKING_NUMBER=null,
			labelCLIENT_ORDER_ID=null,
			labelCLIENT_OTHER_ID=null;

			//START FROM ROW_TO_BEGIN
			row = ROW_TO_BEGIN;
			int orderIndex=0;
			int pair=0;
			List<OrdersDTO>listOrdersDTOFilter=new ArrayList<OrdersDTO>();
			if(allOrdersSelected==null || allOrdersSelected==0L){
				for (OrdersDTO ordDTO : listOrdersDTO){
				if(ordDTO.getPrint())listOrdersDTOFilter.add(ordDTO);
				}
			}else{
				listOrdersDTOFilter=listOrdersDTO;
			}
			for (OrdersDTO orderDTO : listOrdersDTOFilter) {

				orderIndex++;
				pair=orderIndex%2;
				switch (pair) {
				case 0:
					cellFormat=cellFormatWhite;
					break;
				case 1:
					cellFormat=cellFormatNormal;
					break;
				}

				LS_ORDER_ID="";
				PO_NUMBER="";
				CLIENT_NUMBER="";
				LS_PRODUCT_ID="";
				CLIENT_PRODUCT_NUMBER="";
				QUANTITY=0D;
				P_DESCRIPTION="";
				UNIT_PRICE=0D;
				LS_PRICE=0D;
				TRACKING_NUMBER="";
				STATUS="";
				STOCK=null;
				USER_LOGIN="";
				CLIENT_FIRST_NAME="";
				CLIENT_LAST_NAME="";
				CLIENT_OTHER_NAMES="";
				CLIENT_STREET="";
				CLIENT_OTHER_ADRESS="";
				CLIENT_CITY="";
				CLIENT_PROVINCE="";
				CLIENT_POSTAL_CODE="";
				CLIENT_PHONE="";
				CLIENT_EMAIL="";

				// 1: LS_ORDER_ID (must be lest than 35 letters)
				if (orderDTO.getLsOrderId() != null)LS_ORDER_ID = orderDTO.getLsOrderId();
				labelROW_ID = new Label(COL_LS_ORDER_ID-1, row, LS_ORDER_ID,cellFormat);
				cellROW_ID = (WritableCell) labelROW_ID;
				sheetToEdit.addCell(cellROW_ID);

				// 2: COL_PO_NUMBER
				if (orderDTO.getProductOrderNumber() != null)PO_NUMBER = orderDTO.getProductOrderNumber();
				labelPO_NUMBER = new Label(COL_PO_NUMBER-1, row, PO_NUMBER,cellFormat);
				cellPO_NUMBER = (WritableCell)labelPO_NUMBER;
				sheetToEdit.addCell(cellPO_NUMBER);

				// 3: COL_CLIENT_NUMBER
				if (orderDTO.getClientNumber() != null)CLIENT_NUMBER = orderDTO.getClientNumber();
				labelCLIENT_NUMBER = new Label(COL_CLIENT_NUMBER-1, row, CLIENT_NUMBER,cellFormat);
				cellCLIENT_NUMBER = (WritableCell)labelCLIENT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_NUMBER);

				// 4: CLIENT_ORDER_ID
				if (orderDTO.getClientOrderNumber() == null)orderDTO.setClientOrderNumber("");
				CLIENT_ORDER_ID = orderDTO.getClientOrderNumber();
				labelCLIENT_ORDER_ID = new Label(COL_CLIENT_ORDER_ID-1, row, CLIENT_ORDER_ID,cellFormat);
				cellCLIENT_ORDER_ID = (WritableCell) labelCLIENT_ORDER_ID;
				sheetToEdit.addCell(cellCLIENT_ORDER_ID);

				// 5: CLIENT_OTHER_ID
				if (orderDTO.getClientOtherId()!= null)	CLIENT_OTHER_ID = orderDTO.getClientOtherId();
				labelCLIENT_OTHER_ID = new Label(COL_CLIENT_OTHER_ID-1, row, CLIENT_OTHER_ID,cellFormat);
				cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
				sheetToEdit.addCell(cellCLIENT_OTHER_ID);

				// 6: PARTNER NAME (must be lest than 30 letters)
				if (orderDTO.getUserLogin() != null)USER_LOGIN = orderDTO.getUserLogin();
				if( USER_LOGIN.length()>30 || USER_LOGIN.equals("") ){
					labelUSER_LOGIN = new Label(COL_USER_LOGIN-1, row, USER_LOGIN,cellFormatAlert);
				}else{
					labelUSER_LOGIN = new Label(COL_USER_LOGIN-1, row, USER_LOGIN,cellFormat);
				}
				cellUSER_LOGIN = (WritableCell) labelUSER_LOGIN;
				sheetToEdit.addCell(cellUSER_LOGIN);

				// 7: LS_PRODUCT_ID (must be lest than 30 letters)
				if (orderDTO.getLsProductID() != null)LS_PRODUCT_ID = orderDTO.getLsProductID();
				labelLS_PRODUCT_ID = new Label(COL_LS_PRODUCT_ID-1, row, LS_PRODUCT_ID,cellFormat);
				cellLS_PRODUCT_ID = (WritableCell) labelLS_PRODUCT_ID;
				sheetToEdit.addCell(cellLS_PRODUCT_ID);

				// 8: COL_CLIENT_PRODUCT_NUMBER
				if (orderDTO.getClientProductNumber()!= null)CLIENT_PRODUCT_NUMBER = orderDTO.getClientProductNumber();
				labelCLIENT_PRODUCT_NUMBER = new Label(COL_CLIENT_PRODUCT_NUMBER-1, row, CLIENT_PRODUCT_NUMBER,cellFormat);
				cellCLIENT_PRODUCT_NUMBER = (WritableCell)labelCLIENT_PRODUCT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_PRODUCT_NUMBER);

				// 9: DESCRIPTION
				if (orderDTO.getProductDescription() != null)P_DESCRIPTION = orderDTO.getProductDescription();
				labelP_DESCRIPTION = new Label(COL_P_DESCRIPTION-1, row, P_DESCRIPTION,cellFormat);
				cellP_DESCRIPTION = (WritableCell) labelP_DESCRIPTION;
				sheetToEdit.addCell(cellP_DESCRIPTION);

				// 10: QANTITY
				if (orderDTO.getQuantity() != null)QUANTITY = orderDTO.getQuantity();
				String strQUANTITY=QUANTITY.toString();
				labelQUANTITY = new Label(COL_QUANTITY-1, row, strQUANTITY,cellFormat);
				cellQUANTITY = (WritableCell) labelQUANTITY;
				sheetToEdit.addCell(cellQUANTITY);

				// 11: UNIT_PRICE
				if (orderDTO.getUnitPrice() != null)UNIT_PRICE = orderDTO.getUnitPrice();
				String strUNIT_PRICE=UNIT_PRICE.toString();
				labelUNIT_PRICE = new Label(COL_UNIT_PRICE-1, row, strUNIT_PRICE,cellFormat);
				cellUNIT_PRICE = (WritableCell) labelUNIT_PRICE;
				sheetToEdit.addCell(cellUNIT_PRICE);

				// 12: LS_PRICE
				if (orderDTO.getLsPrice() != null)LS_PRICE = orderDTO.getLsPrice();
				String strLS_PRICE=LS_PRICE.toString();
				labelLS_PRICE = new Label(COL_LS_PRICE-1, row, strLS_PRICE,cellFormat);
				cellLS_PRICE = (WritableCell) labelLS_PRICE;
				sheetToEdit.addCell(cellLS_PRICE);

				// 13:COL_TRACKING_NUMBER
				if (orderDTO.getTrackingNumber()!= null)TRACKING_NUMBER = orderDTO.getTrackingNumber();
				labelTRACKING_NUMBER = new Label(COL_TRACKING_NUMBER-1, row, TRACKING_NUMBER,cellFormat);
				cellTRACKING_NUMBER = (WritableCell)labelTRACKING_NUMBER;
				sheetToEdit.addCell(cellTRACKING_NUMBER);

				// 14: STATUS
				if (orderDTO.getStatus() != null)STATUS = orderDTO.getStatus();
				labelSTATUS = new Label(COL_STATUS-1, row, STATUS,cellFormat);
				cellSTATUS = (WritableCell) labelSTATUS;
				sheetToEdit.addCell(cellSTATUS);

				// 15: STOCK 
				if (orderDTO.getStock() != null)STOCK = orderDTO.getStock();
				String strSTOCK=STOCK.toString();
				labelSTOCK = new Label(CO_STOCK-1, row, strSTOCK,cellFormat);
				cellSTOCK = (WritableCell) labelSTOCK;
				sheetToEdit.addCell(cellSTOCK);

				// 16: CLIENT_FIRST_NAME (must be lest than 30 letters)
				if (orderDTO.getClientFirstName() != null)CLIENT_FIRST_NAME = orderDTO.getClientFirstName();
				if(CLIENT_FIRST_NAME ==null || CLIENT_FIRST_NAME.length()>30 || CLIENT_FIRST_NAME.equals("")){
					labelCLIENT_FIRST_NAME = new Label(COL_CLIENT_FIRST_NAME-1, row, CLIENT_FIRST_NAME,cellFormatAlert);
				}else{
					labelCLIENT_FIRST_NAME = new Label(COL_CLIENT_FIRST_NAME-1, row, CLIENT_FIRST_NAME,cellFormat);
				}
				cellCLIENT_FIRST_NAME = (WritableCell) labelCLIENT_FIRST_NAME;
				sheetToEdit.addCell(cellCLIENT_FIRST_NAME);

				// 17: CLIENT_LAST_NAME (must be lest than 40 letters)
				if (orderDTO.getClientLastName() != null)CLIENT_LAST_NAME = orderDTO.getClientLastName();
				if(CLIENT_LAST_NAME==null || CLIENT_LAST_NAME.length()>40 || CLIENT_LAST_NAME.equals("")){
					labelCLIENT_LAST_NAME = new Label(COL_CLIENT_LAST_NAME-1, row, CLIENT_LAST_NAME,cellFormatAlert);
				}else{
					labelCLIENT_LAST_NAME = new Label(COL_CLIENT_LAST_NAME-1, row, CLIENT_LAST_NAME,cellFormat);
				}
				cellCLIENT_LAST_NAME = (WritableCell) labelCLIENT_LAST_NAME;
				sheetToEdit.addCell(cellCLIENT_LAST_NAME);

				// 18: CLIENT_OTHER_NAMES (must be lest than 15 letters)
				if (orderDTO.getClientOtherNames() != null)CLIENT_OTHER_NAMES = orderDTO.getClientOtherNames();
				labelCLIENT_OTHER_NAMES = new Label(COL_CLIENT_OTHER_NAMES-1, row, CLIENT_OTHER_NAMES,cellFormat);
				cellCLIENT_OTHER_NAMES = (WritableCell) labelCLIENT_OTHER_NAMES;
				sheetToEdit.addCell(cellCLIENT_OTHER_NAMES);

				// 19: CLIENT_STREET (must be lest than 44 letters)
				if (orderDTO.getClientStreet() != null)CLIENT_STREET = orderDTO.getClientStreet();
				if(CLIENT_STREET==null || CLIENT_STREET.length()>44 || CLIENT_STREET.equals("")){
					labelCLIENT_STREET = new Label(COL_CLIENT_STREET-1, row, CLIENT_STREET,cellFormatAlert);
				}else{
					labelCLIENT_STREET = new Label(COL_CLIENT_STREET-1, row, CLIENT_STREET,cellFormat);
				}
				cellCLIENT_STREET = (WritableCell) labelCLIENT_STREET;
				sheetToEdit.addCell(cellCLIENT_STREET);

				// 20: CLIENT_OTHER_STREET (must be lest than 44 letters)
				if (orderDTO.getClientOtherStreet()!= null)CLIENT_OTHER_ADRESS = orderDTO.getClientOtherStreet();
				if(CLIENT_OTHER_ADRESS.length()>44){
					labelCLIENT_OTHER_ADRESS = new Label(COL_CLIENT_OTHER_STREET-1, row, CLIENT_OTHER_ADRESS,cellFormatAlert);
				}else{
					labelCLIENT_OTHER_ADRESS = new Label(COL_CLIENT_OTHER_STREET-1, row, CLIENT_OTHER_ADRESS,cellFormat);
				}
				cellCLIENT_OTHER_ADRESS = (WritableCell) labelCLIENT_OTHER_ADRESS;
				sheetToEdit.addCell(cellCLIENT_OTHER_ADRESS);

				// 21: CLIENT_CITY (must be lest than 25 letters)
				if (orderDTO.getClientCity()!= null && orderDTO.getClientCity().length()<=25)CLIENT_CITY = orderDTO.getClientCity();
				if(CLIENT_CITY.length()>25 || CLIENT_CITY.equals("") ){
					labelCLIENT_CITY = new Label(COL_CLIENT_CITY-1, row, CLIENT_CITY,cellFormatAlert);
				}else{
					labelCLIENT_CITY = new Label(COL_CLIENT_CITY-1, row, CLIENT_CITY,cellFormat);
				}
				cellCLIENT_CITY = (WritableCell) labelCLIENT_CITY;
				sheetToEdit.addCell(cellCLIENT_CITY);

				// 22: CLIENT_PROVINCE (must be lest than 2 letters)
				if (orderDTO.getClientProvince()!= null)CLIENT_PROVINCE = orderDTO.getClientProvince();
				if(CLIENT_PROVINCE.length()>2 || CLIENT_PROVINCE.equals("") || (orderDTO.getProvinceNotFound()!=null && orderDTO.getProvinceNotFound()==1L)){
					labelCLIENT_PROVINCE = new Label(COL_CLIENT_PROVINCE-1, row, CLIENT_PROVINCE,cellFormatAlert);
				}else{
					labelCLIENT_PROVINCE = new Label(COL_CLIENT_PROVINCE-1, row, CLIENT_PROVINCE,cellFormat);
				}
				cellCLIENT_PROVINCE = (WritableCell) labelCLIENT_PROVINCE;
				sheetToEdit.addCell(cellCLIENT_PROVINCE);

				// 23: CLIENT_POSTAL_CODE (must be lest than 14 letters)
				if (orderDTO.getClientPostalCode()!= null && orderDTO.getClientPostalCode().length()<=14)CLIENT_POSTAL_CODE = orderDTO.getClientPostalCode();
				if(CLIENT_POSTAL_CODE.length()>14 || CLIENT_POSTAL_CODE.equals("")){
					labelCLIENT_POSTAL_CODE = new Label(COL_CLIENT_POSTAL_CODE-1, row, CLIENT_POSTAL_CODE,cellFormatAlert);
				}else{
					labelCLIENT_POSTAL_CODE = new Label(COL_CLIENT_POSTAL_CODE-1, row,CLIENT_POSTAL_CODE,cellFormat);
				}
				cellCLIENT_POSTAL_CODE = (WritableCell) labelCLIENT_POSTAL_CODE;
				sheetToEdit.addCell(cellCLIENT_POSTAL_CODE);

				// 24: CLIENT_PHONE (must be lest than 25 letters)
				if (orderDTO.getClientPhone()!= null)CLIENT_PHONE = orderDTO.getClientPhone();
				if(CLIENT_PHONE.length()>25){
					labelCLIENT_PHONE = new Label(COL_CLIENT_PHONE-1, row, CLIENT_PHONE,cellFormatAlert);
				}else{
					labelCLIENT_PHONE = new Label(COL_CLIENT_PHONE-1, row, CLIENT_PHONE,cellFormat);
				}
				cellCLIENT_PHONE = (WritableCell) labelCLIENT_PHONE;
				sheetToEdit.addCell(cellCLIENT_PHONE);

				// 25: CLIENT_EMAIL (must be lest than 60 letters)
				if (orderDTO.getClientEmail()!= null)CLIENT_EMAIL = orderDTO.getClientEmail();
				if(CLIENT_EMAIL.length()>60){
					labelCLIENT_EMAIL = new Label(COL_CLIENT_EMAIL-1, row, CLIENT_EMAIL,cellFormatAlert);
				}else{
					labelCLIENT_EMAIL = new Label(COL_CLIENT_EMAIL-1, row, CLIENT_EMAIL,cellFormat);
				}
				cellCLIENT_EMAIL = (WritableCell) labelCLIENT_EMAIL;
				sheetToEdit.addCell(cellCLIENT_EMAIL);

				//change height row 32px
				sheetToEdit.setRowView(row,heightInPoints);
				++row;
			}
			workbookCopy.write();
			workbookCopy.close();
			existingWorkbook.close();

		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	/**----------------------------------------------------------
	 *CREATE XLS FILE FROM THE ETA LIST ORDERS*
	  -----------------------------------------------------------*/
	@Override
	public void generateEtaXLS(List<OrdersDTO> listOrdersDTO,String secondEtaFieldName,String ordersEtaTemplateFolder)throws Exception{
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		final int COL_ETA_FIELD_VALUE=1;
		final int COL_SECOND_ETA_FIELD_NAME=2;
		int COL_ETA_SHIPPING_INFO=2;
		//COLUMNS Data
		String ETA_FIELD_VALUE="";
		String ETA_SHIPPING_INFO="";
		String COL_SECOND_ETA_FIELD_VALUE="";
		int row = 0;
		try {
		
			Workbook existingWorkbook;
			if(secondEtaFieldName!=null && !secondEtaFieldName.equals("")){
				existingWorkbook=Workbook.getWorkbook(new File(ordersEtaTemplateFolder+"etaTemplateWithSecondEtaField.xls"));
			}else{
				existingWorkbook=Workbook.getWorkbook(new File(ordersEtaTemplateFolder+"etaTemplateDefault.xls"));
			}
			WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(ordersEtaTemplateFolder+"etaReport.xls"), existingWorkbook);
			WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);

			int heightInPoints = 30*30;
			WritableCellFormat cellFormat=null;

			WritableCell cellETA_FIELD_VALUE=null;
			WritableCell cellETA_SHIPPING_INFO=null;
			WritableCell cellETA_2D_FIELD_VALUE=null; 
			//LABELS
			Label labelETA_FIELD_VALUE=null;
			Label labelETA_SHIPPING_INFO=null;
			Label labelETA_2D_FIELD_VALUE=null;
			
			//START FROM ROW_TO_BEGIN
			row = ROW_TO_BEGIN;
			int orderIndex=0;
			int pair=0;
			//List<OrdersDTO>listOrdersDTOFilter=new ArrayList<OrdersDTO>();

			for (OrdersDTO orderDTO : listOrdersDTO) {

				orderIndex++;
				pair=orderIndex%2;
				
				switch (pair) {
				case 0:
					cellFormat=getCellFormat(5);
					if(!orderDTO.getNotation().equals("nothing")){
						int notation=Integer.parseInt(orderDTO.getNotation());
						if(notation==1){ //only one order
							cellFormat=getCellFormat(4);
						}else{//more than one order
							cellFormat=getCellFormat(6);
						}
					}
					break;
				case 1:				
					cellFormat=getCellFormat(2);
					if(!orderDTO.getNotation().equals("nothing")){
						int notation=Integer.parseInt(orderDTO.getNotation());
						if(notation==1){ //only one order
							cellFormat=getCellFormat(1);
						}else{//more than one order
							cellFormat=getCellFormat(3);
						}
					}
					break;
				}

				ETA_FIELD_VALUE="";
				ETA_SHIPPING_INFO="";
				COL_SECOND_ETA_FIELD_VALUE="";
				
				//1 : --------------- COL_ETA_FIELD_VALUE ---------------
				if (orderDTO.getEtaFieldValue() != null)ETA_FIELD_VALUE = orderDTO.getEtaFieldValue();
				labelETA_FIELD_VALUE = new Label(COL_ETA_FIELD_VALUE-1, row, ETA_FIELD_VALUE,cellFormat);
				cellETA_FIELD_VALUE = (WritableCell)labelETA_FIELD_VALUE;
				sheetToEdit.addCell(cellETA_FIELD_VALUE);		

				//2 : --------------- COL_ETA_2D_FIELD_VALUE -----------------
				if(secondEtaFieldName!=null && !secondEtaFieldName.equals("")){
					COL_ETA_SHIPPING_INFO=3; // insert the ls_product_id in the second column and shift ETA Info. to the third column 
					if (orderDTO.getSecondEtaFieldValue() != null)COL_SECOND_ETA_FIELD_VALUE = orderDTO.getSecondEtaFieldValue();
					labelETA_2D_FIELD_VALUE = new Label(COL_SECOND_ETA_FIELD_NAME-1, row, COL_SECOND_ETA_FIELD_VALUE,cellFormat);
					cellETA_2D_FIELD_VALUE = (WritableCell)labelETA_2D_FIELD_VALUE;
					sheetToEdit.addCell(cellETA_2D_FIELD_VALUE);
					
				}

				// 2 Or 3: --------------- ETA_SHIPPING_INFO ------------
				//shippedDate+trackingNumber+shippingCompany
				if (!orderDTO.getNotation().equals("nothing")){
					SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
					if(orderDTO.getShippedDate()!=null && (orderDTO.getStatus().equals("shipped") || orderDTO.getStatus().equals("invoiced"))){
						ETA_SHIPPING_INFO=sfd.format(orderDTO.getShippedDate())+", "+orderDTO.getTrackingNumber()+", "+orderDTO.getShippingCompany();
					}else{
						if(orderDTO.getNotes()!=null)ETA_SHIPPING_INFO=orderDTO.getNotes();
					}
					labelETA_SHIPPING_INFO = new Label(COL_ETA_SHIPPING_INFO-1, row, ETA_SHIPPING_INFO,cellFormat);
					cellETA_SHIPPING_INFO = (WritableCell)labelETA_SHIPPING_INFO;
					sheetToEdit.addCell(cellETA_SHIPPING_INFO);
				}else{
					labelETA_SHIPPING_INFO = new Label(COL_ETA_SHIPPING_INFO-1, row, "",cellFormat);
					cellETA_SHIPPING_INFO = (WritableCell)labelETA_SHIPPING_INFO;
					sheetToEdit.addCell(cellETA_SHIPPING_INFO);
				}
				//change height row 32px
				sheetToEdit.setRowView(row,heightInPoints);
				++row;
			}
			workbookCopy.write();
			workbookCopy.close();
			existingWorkbook.close();

		} catch (Exception x) {
			x.printStackTrace();
		}
	}
	

	WritableCellFormat getCellFormat(int option){
		WritableCellFormat result=null;
		try {
			//font black normal
			WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
			cellFont.setBoldStyle(WritableFont.NO_BOLD);
			//font black bold
			WritableFont cellBoldFont = new WritableFont(WritableFont.TIMES, 12);
			cellBoldFont.setColour(Colour.BLACK);
			cellBoldFont.setBoldStyle(WritableFont.BOLD);
			//font red bold
			WritableFont cellRedFont = new WritableFont(WritableFont.TIMES, 12);
			cellRedFont.setColour(Colour.RED);
			cellRedFont.setBoldStyle(WritableFont.BOLD);

			//option:1 CellFormat with blue background normal font
			WritableCellFormat cellFormatBlueNormal = new WritableCellFormat(cellFont);
			cellFormatBlueNormal.setBackground(Colour.LIGHT_TURQUOISE);
			cellFormatBlueNormal.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatBlueNormal.setAlignment(Alignment.CENTRE);
			cellFormatBlueNormal.setWrap(true);
			cellFormatBlueNormal.setBorder(Border.ALL, BorderLineStyle.THIN);		
			//option:2 CellFormat with blue background Red font
			WritableCellFormat cellFormatBlueBoldFontRedFont = new WritableCellFormat(cellRedFont);
			cellFormatBlueBoldFontRedFont.setBackground(Colour.LIGHT_TURQUOISE);
			cellFormatBlueBoldFontRedFont.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatBlueBoldFontRedFont.setAlignment(Alignment.CENTRE);
			cellFormatBlueBoldFontRedFont.setWrap(true);
			cellFormatBlueBoldFontRedFont.setBorder(Border.ALL, BorderLineStyle.THIN);
			//option:3 CellFormat with blue background Bold font
			WritableCellFormat cellFormatBlueBoldFont = new WritableCellFormat(cellBoldFont);
			cellFormatBlueBoldFont.setBackground(Colour.LIGHT_TURQUOISE);
			cellFormatBlueBoldFont.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatBlueBoldFont.setAlignment(Alignment.CENTRE);
			cellFormatBlueBoldFont.setWrap(true);
			cellFormatBlueBoldFont.setBorder(Border.ALL, BorderLineStyle.THIN);

			//option:4 CellFormat with white background Normal
			WritableCellFormat cellFormatWhiteNormal = new WritableCellFormat(cellFont);
			cellFormatWhiteNormal.setBackground(Colour.WHITE);
			cellFormatWhiteNormal.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhiteNormal.setAlignment(Alignment.CENTRE);
			cellFormatWhiteNormal.setWrap(true);
			cellFormatWhiteNormal.setBorder(Border.ALL, BorderLineStyle.THIN);
			//option:5 CellFormat with white background Red Font
			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatWhiteRedFont = new WritableCellFormat(cellRedFont);
			cellFormatWhiteRedFont.setBackground(Colour.WHITE);
			cellFormatWhiteRedFont.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhiteRedFont.setAlignment(Alignment.CENTRE);
			cellFormatWhiteRedFont.setWrap(true);
			cellFormatWhiteRedFont.setBorder(Border.ALL, BorderLineStyle.THIN);
			//option:6 CellFormat with white background Bold Font
			WritableCellFormat cellFormatWhiteBoldFont = new WritableCellFormat(cellBoldFont);
			cellFormatWhiteBoldFont.setBackground(Colour.WHITE);
			cellFormatWhiteBoldFont.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhiteBoldFont.setAlignment(Alignment.CENTRE);
			cellFormatWhiteBoldFont.setWrap(true);
			cellFormatWhiteBoldFont.setBorder(Border.ALL, BorderLineStyle.THIN);
			
			switch (option) {
			case 1:
				result=cellFormatBlueNormal;
				break;
			case 2:
				result=cellFormatBlueBoldFontRedFont;
				break;
			case 3:
				result=cellFormatBlueBoldFont;
				break;
			case 4:
				result=cellFormatWhiteNormal;
				break;
			case 5:
				result=cellFormatWhiteRedFont;
				break;
			case 6:
				result=cellFormatWhiteBoldFont;
				break;
			default:
				result=cellFormatBlueNormal;
				break;
			}
			
		} catch (Exception x) {
			x.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**----------------------------------------------------------
	 *THESE METHODS USED IN CHANGING XLS CELL FORMAT*
	  -----------------------------------------------------------*/

	/*public static WritableCell getWCell(int $colNum, int $rowNum, WritableSheet $writableSheet){
		 return $writableSheet.getWritableCell($colNum, $rowNum);
	}


	public static boolean isCell(WritableCell $writableCell){
		return ($writableCell.getType() == CellType.LABEL) ? true : false;
	}


	public static WritableCell getValidWritableCell(int $colNum, int $rowNum, WritableSheet $writableSheet) throws RowsExceededException, WriteException{
		WritableCell cell = getWCell($colNum, $rowNum, $writableSheet);

		if (!isCell(cell)){
			// Cell doesn't exist (well, it's empty), we need to 'add' the cell and re-reference.
			$writableSheet.addCell(new Label($colNum, $rowNum, "")); 
			cell = getWCell($colNum, $rowNum, $writableSheet);
		}

		return cell;
	}*/

	/**----------------------------------------------------------
	 *CREATE XLS FILE FROM THE LIST ORDERS*
	  -----------------------------------------------------------*/
	@Override
	public void generateInvoicedXLS(List<OrdersDTO> listOrdersDTO,String ordersAdminTemplateFolder,Long  allOrdersSelected){
		final String sheetName = "Sheet1";
		final int ROW_TO_BEGIN=1;
		//COLUMNS NUMBER
		final int COL_PATNER_NAME=2;
		final int COL_INVOICE_NUMBER=3;
		final int COL_QUANTITY=4;
		final int COL_PO_NUMBER=5;
		final int COL_CLIENT_ORDER_NUMBER=6;
		final int COL_CLIENT_OTHER_ID=7;
		final int COL_LS_PRODUCT_ID=8;
		final int COL_CLIENT_PRODUCT_NUMBER=9;
		final int COL_CLIENT_NUMBER=10;
		final int COL_UNIT_PRICE=11;
		final int COL_TRACKING_NUMBER=12;
		final int COL_SHIPPING_PRICE=13;
		final int COL_SHIPED_DATE=14;
		final int COL_SHIPED_PROVINCE=15;

		final int COL_FIRST_NAME=16;
		final int COL_LAST_NAME	=17;
		final int COL_OTHER_NAMES=18;
		final int COL_STREET=19;
		final int COL_OTHER_ADDRESS=20;	
		final int COL_CITY_CLIENT =21;
		final int COL_PROVINCE=22;
		final int COL_POSTAL_CODE=23;
		final int COL_LS_ORDER_ID=24; 

		//Special Handling variables
		final int COL_TOTAL_QUANTITY = 4;
		final int COL_SPECIAL_HANDLING_NAME = 8;
		final int COL_SPECIAL_HANDLING_FEE = 11;

		//Currency
		final int COL_CURRENCY = 25; //Currency SYmbol
		
		//COLUMNS Data

		String PATNER_NAME="";
		String INVOICE_NUMBER="";
		Double QUANTITY=0D;
		String PO_NUMBER="";
		String CLIENT_ORDER_NUMBER="";
		String CLIENT_OTHER_ID="";
		String LS_PRODUCT_ID="";
		String CLIENT_PRODUCT_NUMBER="";
		String CLIENT_NUMBER="";
		Double UNIT_PRICE=0D;
		String TRACKING_NUMBER="";
		Double SHIPPING_PRICE=0D;
		DateTime SHIPED_DATE=null;
		String SHIPED_PROVINCE="";

		String FIRST_NAME="";
		String LAST_NAME="";
		String OTHER_NAMES="";
		String STREET="";
		String OTHER_ADDRESS="";	
		String CITY_CLIENT="";
		String PROVINCE="";
		String POSTAL_CODE="";
		String LS_ORDER_ID="";

		//Special Handling variables
		Double TOTAL_QUANTITY = 0D;
		String SPECIAL_HANDLING_NAME = "";
		Double SPECIAL_HANDLING_FEE = 0D;
		//Double TOTAL_PRICE = 0D;

		//Currency
		String CURRENCY="";
		
		// For the empty cells
		String EMPTY ="";

		int row = ROW_TO_BEGIN;
		try {
			Workbook existingWorkbook = Workbook.getWorkbook(new File(ordersAdminTemplateFolder+"invoicesTemplate.xls"));
			WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(ordersAdminTemplateFolder+"invoicedOrders.xls"), existingWorkbook);
			WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);

			// Create cell font and format
			WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatOrange = new WritableCellFormat(cellFont);
			cellFormatOrange.setBackground(Colour.LIGHT_ORANGE);
			cellFormatOrange.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatOrange.setAlignment(Alignment.CENTRE);
			cellFormatOrange.setWrap(true);
			cellFormatOrange.setBorder(Border.ALL, BorderLineStyle.THIN);

			//WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatWhite = new WritableCellFormat(cellFont);
			cellFormatWhite.setBackground(Colour.WHITE);
			cellFormatWhite.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatWhite.setAlignment(Alignment.CENTRE);
			cellFormatWhite.setWrap(true);
			cellFormatWhite.setBorder(Border.ALL, BorderLineStyle.THIN);

			cellFont.setColour(Colour.BLACK);
			WritableCellFormat cellFormatRed = new WritableCellFormat(cellFont);
			cellFormatRed.setBackground(Colour.RED);
			cellFormatRed.setVerticalAlignment(VerticalAlignment.CENTRE);
			cellFormatRed.setAlignment(Alignment.CENTRE);
			cellFormatRed.setWrap(true);
			cellFormatRed.setBorder(Border.ALL, BorderLineStyle.THIN);

			WritableCellFormat cellFormat=null;
			//format date:orange color
			DateFormat orangeCustomDateFormat = new DateFormat ("dd/MM/yyyy");
			WritableCellFormat orangeDateFormat = new WritableCellFormat (orangeCustomDateFormat);
			orangeDateFormat.setBackground(Colour.LIGHT_ORANGE);
			orangeDateFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			orangeDateFormat.setAlignment(Alignment.CENTRE);
			orangeDateFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			//format date:White color
			DateFormat whiteCustomDateFormat = new DateFormat ("dd/MM/yyyy");
			WritableCellFormat whiteDateFormat = new WritableCellFormat (whiteCustomDateFormat);
			whiteDateFormat.setBackground(Colour.WHITE);
			whiteDateFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			whiteDateFormat.setAlignment(Alignment.CENTRE);
			whiteDateFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			//format date:Red color
			DateFormat redCustomDateFormat = new DateFormat ("dd/MM/yyyy");
			WritableCellFormat redDateFormat = new WritableCellFormat (redCustomDateFormat);
			redDateFormat.setBackground(Colour.RED);
			redDateFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			redDateFormat.setAlignment(Alignment.CENTRE);
			redDateFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			WritableCellFormat cellDateFormat=null;
			//format Number: Orange color
			WritableCellFormat orangeNumberFormat=new WritableCellFormat(new  jxl.write.NumberFormat("0.00"));
			orangeNumberFormat.setBackground(Colour.LIGHT_ORANGE);
			orangeNumberFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			orangeNumberFormat.setAlignment(Alignment.CENTRE);
			orangeNumberFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			//format Number: White color
			WritableCellFormat whiteNumberFormat=new WritableCellFormat(new  jxl.write.NumberFormat("0.00"));
			whiteNumberFormat.setBackground(Colour.WHITE);
			whiteNumberFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			whiteNumberFormat.setAlignment(Alignment.CENTRE);
			whiteNumberFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			//format Number: red color
			WritableCellFormat redNumberFormat=new WritableCellFormat(new  jxl.write.NumberFormat("0.00"));
			redNumberFormat.setBackground(Colour.RED);
			redNumberFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			redNumberFormat.setAlignment(Alignment.CENTRE);
			redNumberFormat.setBorder(Border.ALL, BorderLineStyle.THIN);

			WritableCellFormat cellNumberFormat=null;
			WritableCellFormat cellShppedDateFormatWhite = new WritableCellFormat(cellFont);
			cellShppedDateFormatWhite.setBackground(Colour.WHITE);
			WritableCellFormat cellShppedDateFormatOrange = new WritableCellFormat(cellFont);
			cellShppedDateFormatOrange.setBackground(Colour.ORANGE);
			WritableCellFormat cellShppedDateFormatRed = new WritableCellFormat(cellFont);
			cellShppedDateFormatRed.setBackground(Colour.RED);

			WritableCell cellPATNER_NAME=null;
			WritableCell cellINVOICE_NUMBER=null;
			WritableCell cellQUANTITY=null;
			WritableCell cellPO_NUMBER=null;
			WritableCell cellCLIENT_ORDER_NUMBER=null;
			WritableCell cellCLIENT_OTHER_ID=null;
			WritableCell cellLS_PRODUCT_ID=null;
			WritableCell cellCLIENT_PRODUCT_NUMBER=null;
			WritableCell cellCLIENT_NUMBER=null;
			WritableCell cellUNIT_PRICE=null;
			WritableCell cellTRACKING_NUMBER=null;
			WritableCell cellSHIPPING_PRICE=null;
			WritableCell cellSHIPED_DATE = null;
			WritableCell cellSHIPED_PROVINCE=null;
			WritableCell cellFIRST_NAME=null;
			WritableCell cellLAST_NAME=null;
			WritableCell cellOTHER_NAMES=null;
			WritableCell cellSTREET=null;
			WritableCell cellOTHER_ADDRESS=null;	
			WritableCell cellCITY_CLIENT=null;
			WritableCell cellPROVINCE=null;
			WritableCell cellPOSTAL_CODE=null;
			WritableCell cellLS_ORDER_ID=null;
			//Special Handling variables
			WritableCell cellTOTAL_QUANTITY = null;
			WritableCell cellSPECIAL_HANDLING_NAME = null;
			WritableCell cellSPECIAL_HANDLING_FEE = null;
			//Currency
			WritableCell cellCURRENCY = null;
		
			// For the empty cells
			WritableCell cellEMPTY = null;

			//LABELS
			Label labelPATNER_NAME=null;
			Label labelINVOICE_NUMBER=null;
			Label labelQUANTITY=null;
			Label labelPO_NUMBER=null;
			Label labelCLIENT_ORDER_NUMBER=null;
			Label labelCLIENT_OTHER_ID=null;
			Label labelLS_PRODUCT_ID=null;
			Label labelCLIENT_PRODUCT_NUMBER=null;
			Label labelCLIENT_NUMBER=null;
			Label labelUNIT_PRICE=null;
			Label labelTRACKING_NUMBER=null;
			Label labelSHIPPING_PRICE=null;
			Label labelSHIPED_PROVINCE=null;
			Label labelFIRST_NAME=null;
			Label labelLAST_NAME=null;
			Label labelOTHER_NAMES=null;
			Label labelSTREET=null;
			Label labelOTHER_ADDRESS=null;	
			Label labelCITY_CLIENT=null;
			Label labelPROVINCE=null;
			Label labelPOSTAL_CODE=null;
			Label labelLS_ORDER_ID=null;
			//Special Handling variables
			Label labelTOTAL_QUANTITY = null;
			Label labelSPECIAL_HANDLING_NAME = null;
			Label labelSPECIAL_HANDLING_FEE = null;
			//Currency
			Label labelCURRENCY = null;
			
			// For the empty cells
			Label labelEMPTY = null;
			jxl.write.Number number=null;

			//START FROM ROW_TO_BEGIN
			row = ROW_TO_BEGIN;
			int orderIndex=0;
			int pair=0;
			Long count=0L;
			String partnerLogin="";
			boolean userLoginChecked=false;
			User user=null;
			List<OrdersDTO>listOrdersDTOfiler=new ArrayList<OrdersDTO>();
			//check the first item partner name 
			if(listOrdersDTO!=null && listOrdersDTO.size()>0){
				OrdersDTO orderDTO=listOrdersDTO.get(0);
				partnerLogin=orderDTO.getUserLogin();
				if(partnerLogin==null)partnerLogin="";
				user=userService.getUserByLogin(partnerLogin);
				if(user==null)user=new User();
			}
			//if admin select all orders, select just witch has status progress
			if(allOrdersSelected!=null && allOrdersSelected!=0L){
				for(OrdersDTO ord:listOrdersDTO){
					if((ord.getRowsList().get(0).getStatus().equals("shipped")||ord.getRowsList().get(0).getStatus().equals("invoiced")) &&
							user.getLogin().equals(ord.getUserLogin())){
						listOrdersDTOfiler.add(ord);
					}
				}
				//if admin select just some orders to get their cvs Canada post
			} else{
				for(OrdersDTO ord:listOrdersDTO){
					if((ord.getPrint()!=null && ord.getPrint()==true)&&
							(ord.getRowsList().get(0).getStatus()!=null &&
									user.getLogin().equals(ord.getUserLogin())&&
									(ord.getRowsList().get(0).getStatus().equals("shipped")||ord.getRowsList().get(0).getStatus().equals("invoiced")))){
						listOrdersDTOfiler.add(ord);
					}
				}

			}
			for (OrdersDTO orderDTO : listOrdersDTOfiler) {
				partnerLogin=orderDTO.getUserLogin();
				if(partnerLogin==null)partnerLogin="";
				user=userService.getUserByLogin(partnerLogin);
				if(user!=null)userLoginChecked=true;
				count = productService.isGroupProductID(orderDTO.getProductId());
				if(count>=1){
					pair= 3;
				}
				else{
					pair=orderIndex%2;
					orderIndex++;
				}
				switch (pair) {
				case 0:
					cellFormat=cellFormatWhite;
					cellDateFormat=whiteDateFormat;
					cellNumberFormat=whiteNumberFormat;
					break;
				case 1:
					cellFormat=cellFormatOrange;
					cellDateFormat=orangeDateFormat;
					cellNumberFormat=orangeNumberFormat;
					break;
				default:
					cellFormat=cellFormatRed;
					cellDateFormat=redDateFormat;
					cellNumberFormat=redNumberFormat;
					break;
				}
				sheetToEdit.setRowView(row, 25*25);

				//COLUMNS Data
				PATNER_NAME="";
				INVOICE_NUMBER="";
				QUANTITY=0D;
				PO_NUMBER="";
				CLIENT_ORDER_NUMBER="";
				CLIENT_OTHER_ID="";
				LS_PRODUCT_ID="";
				CLIENT_PRODUCT_NUMBER="";
				CLIENT_NUMBER="";
				UNIT_PRICE=0D;
				TRACKING_NUMBER="";
				SHIPPING_PRICE=0D;
				SHIPED_DATE=null;
				SHIPED_PROVINCE="";
				FIRST_NAME="";
				LAST_NAME="";
				OTHER_NAMES="";
				STREET="";
				OTHER_ADDRESS="";	
				CITY_CLIENT="";
				PROVINCE="";
				POSTAL_CODE="";
				LS_ORDER_ID="";
				
				//TOTAL_QUANTITY = 0D;
				SPECIAL_HANDLING_NAME = "";
				SPECIAL_HANDLING_FEE = 0D;
				//TOTAL_PRICE = 0D;
				CURRENCY="";

				//================== Data Order ==================
				//------------------ COL_2: PATNER_NAME ----------
				if (orderDTO.getUserLogin()!= null)	PATNER_NAME = orderDTO.getUserLogin();
				labelPATNER_NAME = new Label(COL_PATNER_NAME-1, row, PATNER_NAME,cellFormat);
				cellPATNER_NAME = (WritableCell) labelPATNER_NAME;
				sheetToEdit.addCell(cellPATNER_NAME);

				//------------------ COL_3: INVOICE_NUMBER --------
				//Nothing in this column
				labelINVOICE_NUMBER = new Label(COL_INVOICE_NUMBER-1, row, "",cellFormat);
				cellINVOICE_NUMBER = (WritableCell) labelINVOICE_NUMBER;
				sheetToEdit.addCell(cellINVOICE_NUMBER);

				//------------------ COL_4: QUANTITY ---------------
				if (orderDTO.getQuantity() != null) {
					QUANTITY = orderDTO.getQuantity();
					TOTAL_QUANTITY = TOTAL_QUANTITY + QUANTITY;
				}
				labelQUANTITY = new Label(COL_QUANTITY-1, row, QUANTITY+"",cellFormat);
				cellQUANTITY = (WritableCell) labelQUANTITY;
				sheetToEdit.addCell(cellQUANTITY);

				//------------------ COL_5: PO_NUMBER ---------------
				if (orderDTO.getProductOrderNumber() != null)PO_NUMBER = orderDTO.getProductOrderNumber();
				labelPO_NUMBER = new Label(COL_PO_NUMBER-1, row, PO_NUMBER,cellFormat);
				cellPO_NUMBER = (WritableCell) labelPO_NUMBER;
				sheetToEdit.addCell(cellPO_NUMBER);

				//------------------ COL_6: CLIENT_ORDER_NUMBER -----
				if (orderDTO.getClientOrderNumber() == null)orderDTO.setClientOrderNumber("");
				CLIENT_ORDER_NUMBER = orderDTO.getClientOrderNumber();
				labelCLIENT_ORDER_NUMBER = new Label(COL_CLIENT_ORDER_NUMBER-1, row, CLIENT_ORDER_NUMBER,cellFormat);
				cellCLIENT_ORDER_NUMBER = (WritableCell) labelCLIENT_ORDER_NUMBER;
				sheetToEdit.addCell(cellCLIENT_ORDER_NUMBER);

				//------------------ COL_7: LS_PRODUCT_ID ------------
				if (orderDTO.getLsProductID() != null)LS_PRODUCT_ID = orderDTO.getLsProductID();
				labelLS_PRODUCT_ID = new Label(COL_LS_PRODUCT_ID-1, row, LS_PRODUCT_ID,cellFormat);
				cellLS_PRODUCT_ID = (WritableCell) labelLS_PRODUCT_ID;
				sheetToEdit.addCell(cellLS_PRODUCT_ID);

				//------------------ COL_8: CLIENT_OTHER_ID -----------
				if (orderDTO.getClientOtherId()!= null)	CLIENT_OTHER_ID = orderDTO.getClientOtherId();
				labelCLIENT_OTHER_ID = new Label(COL_CLIENT_OTHER_ID-1, row, CLIENT_OTHER_ID,cellFormat);
				cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
				sheetToEdit.addCell(cellCLIENT_OTHER_ID);

				//------------------ COL_9: CLIENT_PRODUCT_NUMBER ------
				if (orderDTO.getClientProductNumber()!= null)CLIENT_PRODUCT_NUMBER = orderDTO.getClientProductNumber();
				labelCLIENT_PRODUCT_NUMBER = new Label(COL_CLIENT_PRODUCT_NUMBER-1, row, CLIENT_PRODUCT_NUMBER,cellFormat);
				cellCLIENT_PRODUCT_NUMBER = (WritableCell) labelCLIENT_PRODUCT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_PRODUCT_NUMBER);

				//------------------ COL_10: CLIENT_NUMBER --------------
				if (orderDTO.getClientNumber() != null)CLIENT_NUMBER = orderDTO.getClientNumber();
				labelCLIENT_NUMBER = new Label(COL_CLIENT_NUMBER-1, row, CLIENT_NUMBER,cellFormat);
				cellCLIENT_NUMBER = (WritableCell) labelCLIENT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_NUMBER);

				//------------------ COL_11: COL_UNIT_PRICE --------------
				String strUNIT_PRICE="";
				if (orderDTO.getUnitPrice() != null) {
					UNIT_PRICE = orderDTO.getUnitPrice();
					//Currency
					if((orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null)) {
						UNIT_PRICE = UNIT_PRICE*orderDTO.getCurrencyRate();
						UNIT_PRICE = (double) Math.round(UNIT_PRICE*100)/100;
					}
					//TOTAL_PRICE = TOTAL_PRICE + UNIT_PRICE*TOTAL_QUANTITY; 
					strUNIT_PRICE = UNIT_PRICE+"";
					strUNIT_PRICE=strUNIT_PRICE.replaceAll(" ", "");
					if(strUNIT_PRICE!=null && !strUNIT_PRICE.equals("")){
						int index=strUNIT_PRICE.indexOf(",");
						if(index<0)index=strUNIT_PRICE.indexOf(".");
						if(index>=0){
							String strUNIT_PRICE1=strUNIT_PRICE.substring(0, index);
							String strUNIT_PRICE2= strUNIT_PRICE.substring(index+1, strUNIT_PRICE.length());
							strUNIT_PRICE=strUNIT_PRICE1+"."+strUNIT_PRICE2;
							if(strUNIT_PRICE2!=null){
								if(strUNIT_PRICE2.length()<=1)strUNIT_PRICE=strUNIT_PRICE+"0";
							}
						}
					}
				}
				labelUNIT_PRICE = new Label(COL_UNIT_PRICE-1, row, strUNIT_PRICE,cellFormat);
				cellUNIT_PRICE = (WritableCell) labelUNIT_PRICE;
				sheetToEdit.addCell(cellUNIT_PRICE);

				//------------------ COL_12: TRACKING_NUMBER ------------
				labelTRACKING_NUMBER = new Label(COL_TRACKING_NUMBER-1, row, "",cellFormat);
				cellTRACKING_NUMBER = (WritableCell) labelTRACKING_NUMBER;
				sheetToEdit.addCell(cellTRACKING_NUMBER);

				//------------------ COL_13: cellSHIPPING_PRICE ---------
				labelSHIPPING_PRICE = new Label(COL_SHIPPING_PRICE-1, row, "",cellFormat);
				cellSHIPPING_PRICE = (WritableCell) labelSHIPPING_PRICE;
				sheetToEdit.addCell(cellSHIPPING_PRICE);

				//------------------ COL_14: SHIPED_DATE ----------------
				if(orderDTO.getShippedDate()!=null){
					SHIPED_DATE = new DateTime(COL_SHIPED_DATE-1, row, orderDTO.getShippedDate(),cellDateFormat);
					sheetToEdit.addCell(SHIPED_DATE);
				}

				//------------------ COL_15: SHIPED_PROVINCE ------------
				if (orderDTO.getClientProvince()!= null) {
					String code=orderDTO.getClientProvince();
					ProvinceDTO provinceDTO=productService.getProvinceByCode(code);
					SHIPED_PROVINCE = provinceDTO.getTaxe();
				}
				labelSHIPED_PROVINCE = new Label(COL_SHIPED_PROVINCE-1, row, SHIPED_PROVINCE,cellFormat);
				cellSHIPED_PROVINCE = (WritableCell) labelSHIPED_PROVINCE;
				sheetToEdit.addCell(cellSHIPED_PROVINCE);

				//------------------ COL_16: COL_FIRST_NAME -----------------
				if (orderDTO.getClientFirstName() != null)FIRST_NAME = orderDTO.getClientFirstName();
				labelFIRST_NAME = new Label(COL_FIRST_NAME-1, row, FIRST_NAME,cellFormat);
				cellFIRST_NAME = (WritableCell) labelFIRST_NAME;
				sheetToEdit.addCell(cellFIRST_NAME);

				//------------------ COL_17: COL_LAST_NAME ------------------
				if (orderDTO.getClientLastName() != null)LAST_NAME = orderDTO.getClientLastName();
				labelLAST_NAME = new Label(COL_LAST_NAME-1, row, LAST_NAME,cellFormat);
				cellLAST_NAME = (WritableCell) labelLAST_NAME;
				sheetToEdit.addCell(cellLAST_NAME);

				//------------------ COL_18: COL_OTHER_NAMES -----------------
				if (orderDTO.getClientOtherNames() != null)OTHER_NAMES = orderDTO.getClientOtherNames();
				labelOTHER_NAMES = new Label(COL_OTHER_NAMES-1, row, OTHER_NAMES,cellFormat);
				cellOTHER_NAMES = (WritableCell) labelOTHER_NAMES;
				sheetToEdit.addCell(cellOTHER_NAMES);

				//------------------ COL_19: COL_STREET ----------------------
				if (orderDTO.getClientStreet()!= null)STREET = orderDTO.getClientStreet();
				labelSTREET = new Label(COL_STREET-1, row, STREET,cellFormat);
				cellSTREET = (WritableCell) labelSTREET;
				sheetToEdit.addCell(cellSTREET);

				//------------------ COL_20: COL_OTHER_ADDRESS ---------------
				if (orderDTO.getClientOtherStreet()!= null)OTHER_ADDRESS = orderDTO.getClientOtherStreet();
				labelOTHER_ADDRESS = new Label(COL_OTHER_ADDRESS-1, row, OTHER_ADDRESS,cellFormat);
				cellOTHER_ADDRESS = (WritableCell) labelOTHER_ADDRESS;
				sheetToEdit.addCell(cellOTHER_ADDRESS);

				//------------------ COL_21: COL_CITY_CLIENT -----------------
				if (orderDTO.getClientCity()!= null)CITY_CLIENT = orderDTO.getClientCity();
				labelCITY_CLIENT = new Label(COL_CITY_CLIENT-1, row, CITY_CLIENT,cellFormat);
				cellCITY_CLIENT = (WritableCell) labelCITY_CLIENT;
				sheetToEdit.addCell(cellCITY_CLIENT);

				//------------------ COL_22: COL_PROVINCE --------------------
				if (orderDTO.getClientProvince()!= null)PROVINCE = orderDTO.getClientProvince();
				labelPROVINCE = new Label(COL_PROVINCE-1, row, PROVINCE,cellFormat);
				cellPROVINCE = (WritableCell) labelPROVINCE;
				sheetToEdit.addCell(cellPROVINCE);

				//------------------ COL_23: COL_POSTAL_CODE -----------------
				if (orderDTO.getClientPostalCode()!= null)POSTAL_CODE = orderDTO.getClientPostalCode();
				labelPOSTAL_CODE = new Label(COL_POSTAL_CODE-1, row, POSTAL_CODE,cellFormat);
				cellPOSTAL_CODE = (WritableCell) labelPOSTAL_CODE;
				sheetToEdit.addCell(cellPOSTAL_CODE);

				//------------------ COL_24: COL_LS_ORDER_ID -----------------
				if (orderDTO.getLsOrderId()!= null)LS_ORDER_ID = orderDTO.getLsOrderId();
				labelLS_ORDER_ID = new Label(COL_LS_ORDER_ID-1, row, LS_ORDER_ID,cellFormat);
				cellLS_ORDER_ID = (WritableCell) labelLS_ORDER_ID;
				sheetToEdit.addCell(cellLS_ORDER_ID);
				
				//------------------ COL_25: CURRENCY --------
				if(orderDTO.getCurrencyId()!=null && orderDTO.getCurrencySymbol()!=null) {
					CURRENCY = orderDTO.getCurrencySymbol();
				}
				labelCURRENCY = new Label(COL_CURRENCY-1, row, CURRENCY,cellFormat);
				cellCURRENCY = (WritableCell) labelCURRENCY;
				sheetToEdit.addCell(cellCURRENCY);

				row++;
				sheetToEdit.setRowView(row, 25*25);

				//================== Data SHIPPING ======================
				//------------------ COL_2: PATNER_NAME -----------------
				if (orderDTO.getUserLogin()!= null) {
					PATNER_NAME = orderDTO.getUserLogin();
					labelPATNER_NAME = new Label(COL_PATNER_NAME-1, row, PATNER_NAME,cellFormat);
					cellPATNER_NAME = (WritableCell) labelPATNER_NAME;
					sheetToEdit.addCell(cellPATNER_NAME);
				}

				//------------------ COL_3: INVOICE_NUMBER --------------
				labelINVOICE_NUMBER = new Label(COL_INVOICE_NUMBER-1, row, "",cellFormat);
				cellINVOICE_NUMBER = (WritableCell) labelINVOICE_NUMBER;
				sheetToEdit.addCell(cellINVOICE_NUMBER);

				//------------------ COL_4: QUANTITY --------------------
				String strQty = "1";
				labelQUANTITY = new Label(COL_QUANTITY-1, row, strQty,cellFormat);
				cellQUANTITY = (WritableCell) labelQUANTITY;
				sheetToEdit.addCell(cellQUANTITY);

				//------------------ COL_5: PO_NUMBER --------------------
				labelPO_NUMBER = new Label(COL_PO_NUMBER-1, row, "",cellFormat);
				cellPO_NUMBER = (WritableCell) labelPO_NUMBER;
				sheetToEdit.addCell(cellPO_NUMBER);

				//------------------ COL_6: CLIENT_ORDER_NUMBER -----------
				labelCLIENT_ORDER_NUMBER = new Label(COL_CLIENT_ORDER_NUMBER-1, row, "",cellFormat);
				cellCLIENT_ORDER_NUMBER = (WritableCell) labelCLIENT_ORDER_NUMBER;
				sheetToEdit.addCell(cellCLIENT_ORDER_NUMBER);

				//------------------ COL_7: LS_PRODUCT_ID ------------------
				labelLS_PRODUCT_ID = new Label(COL_LS_PRODUCT_ID-1, row, "SHIPPING",cellFormat);
				cellLS_PRODUCT_ID = (WritableCell) labelLS_PRODUCT_ID;
				sheetToEdit.addCell(cellLS_PRODUCT_ID);

				//------------------ COL_8: CLIENT_OTHER_ID -----------------
				labelCLIENT_OTHER_ID = new Label(COL_CLIENT_OTHER_ID-1, row, "",cellFormat);
				cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
				sheetToEdit.addCell(cellCLIENT_OTHER_ID);

				//------------------ COL_9: CLIENT_PRODUCT_NUMBER -------------
				labelCLIENT_PRODUCT_NUMBER = new Label(COL_CLIENT_PRODUCT_NUMBER-1, row, CLIENT_PRODUCT_NUMBER,cellFormat);
				cellCLIENT_PRODUCT_NUMBER = (WritableCell) labelCLIENT_PRODUCT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_PRODUCT_NUMBER);
				
				//------------------ COL_10: CLIENT_NUMBER ---------------------
				labelCLIENT_NUMBER = new Label(COL_CLIENT_NUMBER-1, row, "",cellFormat);
				cellCLIENT_NUMBER = (WritableCell) labelCLIENT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_NUMBER);

				// COL_11: COL_UNIT_PRICE
				labelUNIT_PRICE = new Label(COL_UNIT_PRICE-1, row, "",cellFormat);
				cellUNIT_PRICE = (WritableCell) labelUNIT_PRICE;
				sheetToEdit.addCell(cellUNIT_PRICE);

				//------------------ COL_12: TRACKING_NUMBER --------------------
				if (orderDTO.getTrackingNumber()!= null) {
					TRACKING_NUMBER = orderDTO.getTrackingNumber();
					labelTRACKING_NUMBER = new Label(COL_TRACKING_NUMBER-1, row, TRACKING_NUMBER,cellFormat);
					cellTRACKING_NUMBER = (WritableCell) labelTRACKING_NUMBER;
					sheetToEdit.addCell(cellTRACKING_NUMBER);
				}

				//------------------ COL_13: cellSHIPPING_PRICE ------------------
				if (orderDTO.getShippingPrice() != null) {
					SHIPPING_PRICE = orderDTO.getShippingPrice();
					//SHIPPING_PRICE = (orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null ? SHIPPING_PRICE*orderDTO.getCurrencyRate() : SHIPPING_PRICE);
					//Add Shipping Insurance Multiplier
					if(orderDTO.getShippingInsuranceMultiplier()==null) {//new = insert into invoicing_orders
						if(user!=null && UNIT_PRICE!=null){
							if(user.getShippingInsuranceMultiplier()!=null) {
								SHIPPING_PRICE=SHIPPING_PRICE + UNIT_PRICE*QUANTITY*(user.getShippingInsuranceMultiplier()/100);
								orderDTO.setShippingInsuranceMultiplier(user.getShippingInsuranceMultiplier());
							} else orderDTO.setShippingInsuranceMultiplier(0D);
						}
					} else {//old = already exists in invoicing_orders
						SHIPPING_PRICE = SHIPPING_PRICE + UNIT_PRICE*QUANTITY*(orderDTO.getShippingInsuranceMultiplier()/100);
					}

					//Add Shipping Multiplier
					if(user.getMultiplier()!=null) {
						Double multiplier=Double.parseDouble(user.getMultiplier());
						SHIPPING_PRICE=SHIPPING_PRICE*(1+multiplier/100);
					}

					//if user has a special shipping
					OrdersSpecialShippingDTO ordSpecialShipDTO=new OrdersSpecialShippingDTO();
					ordSpecialShipDTO.setProductId(orderDTO.getProductId());
					ordSpecialShipDTO.setUserId(orderDTO.getUserId());
					OrdersSpecialShippingDTO OrdSpecialShip=getOrderSpecialShipping(ordSpecialShipDTO);
					if(OrdSpecialShip!=null){
						SHIPPING_PRICE=orderDTO.getShippingPrice();
						//SHIPPING_PRICE = (orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null ? SHIPPING_PRICE*orderDTO.getCurrencyRate() : SHIPPING_PRICE);
					}
				
					SHIPPING_PRICE = (double) Math.round(SHIPPING_PRICE * 100) / 100;
					String strSHIPPING_PRICE=SHIPPING_PRICE+"";
					labelSHIPPING_PRICE = new Label(COL_SHIPPING_PRICE-1, row, strSHIPPING_PRICE,cellFormat);
					cellSHIPPING_PRICE = (WritableCell) labelSHIPPING_PRICE;
					sheetToEdit.addCell(cellSHIPPING_PRICE);
				}

				//------------------ COL_14: SHIPED_DATE --------------------------
				if(orderDTO.getShippedDate()!=null){
					SHIPED_DATE = new DateTime(COL_SHIPED_DATE-1, row, orderDTO.getShippedDate(),cellDateFormat);
					sheetToEdit.addCell(SHIPED_DATE);
				}

				//------------------ COL_15: SHIPED_PROVINCE ----------------------
				if (orderDTO.getClientProvince()!= null) {
					String code=orderDTO.getClientProvince();
					ProvinceDTO provinceDTO=productService.getProvinceByCode(code);
					SHIPED_PROVINCE = provinceDTO.getTaxe();
					labelSHIPED_PROVINCE = new Label(COL_SHIPED_PROVINCE-1, row, SHIPED_PROVINCE,cellFormat);
					cellSHIPED_PROVINCE = (WritableCell) labelSHIPED_PROVINCE;
					sheetToEdit.addCell(cellSHIPED_PROVINCE);
				}

				//------------------ COL_16: COL_FIRST_NAME -----------------
				labelFIRST_NAME = new Label(COL_FIRST_NAME-1, row, "",cellFormat);
				cellFIRST_NAME = (WritableCell) labelFIRST_NAME;
				sheetToEdit.addCell(cellFIRST_NAME);

				//------------------ COL_17: COL_LAST_NAME ------------------
				labelLAST_NAME = new Label(COL_LAST_NAME-1, row, "",cellFormat);
				cellLAST_NAME = (WritableCell) labelLAST_NAME;
				sheetToEdit.addCell(cellLAST_NAME);

				//------------------ COL_18: COL_OTHER_NAMES -----------------
				labelOTHER_NAMES = new Label(COL_OTHER_NAMES-1, row, "",cellFormat);
				cellOTHER_NAMES = (WritableCell) labelOTHER_NAMES;
				sheetToEdit.addCell(cellOTHER_NAMES);

				//------------------ COL_19: COL_STREET ----------------------
				labelSTREET = new Label(COL_STREET-1, row, "",cellFormat);
				cellSTREET = (WritableCell) labelSTREET;
				sheetToEdit.addCell(cellSTREET);

				//------------------ COL_20: COL_OTHER_ADDRESS ---------------
				labelOTHER_ADDRESS = new Label(COL_OTHER_ADDRESS-1, row, "",cellFormat);
				cellOTHER_ADDRESS = (WritableCell) labelOTHER_ADDRESS;
				sheetToEdit.addCell(cellOTHER_ADDRESS);

				//------------------ COL_21: COL_CITY_CLIENT -----------------
				labelCITY_CLIENT = new Label(COL_CITY_CLIENT-1, row, "",cellFormat);
				cellCITY_CLIENT = (WritableCell) labelCITY_CLIENT;
				sheetToEdit.addCell(cellCITY_CLIENT);

				//------------------ COL_22: COL_PROVINCE --------------------
				labelPROVINCE = new Label(COL_PROVINCE-1, row, "",cellFormat);
				cellPROVINCE = (WritableCell) labelPROVINCE;
				sheetToEdit.addCell(cellPROVINCE);

				//------------------ COL_23: COL_POSTAL_CODE -----------------
				labelPOSTAL_CODE = new Label(COL_POSTAL_CODE-1, row, "",cellFormat);
				cellPOSTAL_CODE = (WritableCell) labelPOSTAL_CODE;
				sheetToEdit.addCell(cellPOSTAL_CODE);

				//------------------ COL_24: COL_LS_ORDER_ID-----------------
				labelLS_ORDER_ID = new Label(COL_LS_ORDER_ID-1, row, "",cellFormat);
				cellLS_ORDER_ID = (WritableCell) labelLS_ORDER_ID;
				sheetToEdit.addCell(cellLS_ORDER_ID);
				
				//------------------ COL_25: COL_CURRENCY-----------------
				labelCURRENCY = new Label(COL_CURRENCY-1, row, "",cellFormat);
				cellCURRENCY = (WritableCell) labelCURRENCY;
				sheetToEdit.addCell(cellCURRENCY);

				//Special handling calculation
				if(user!=null){
					Double totalPrice=null;
					orderDTO.setSpecialHandlingName(user.getSpecialHandlingName());
					orderDTO.setSpecialHandlingFee(user.getSpecialHandlingFee());
					if(orderDTO.getRowsList().get(0).getQuantity()!=null && orderDTO.getRowsList().get(0).getUnitPrice()!=null){
						totalPrice=orderDTO.getRowsList().get(0).getQuantity()*orderDTO.getRowsList().get(0).getUnitPrice();
						//Currency
						if(totalPrice!=null && orderDTO.getCurrencyId()!=null && orderDTO.getCurrencyId()!=1 && orderDTO.getCurrencyRate()!=null) {
							totalPrice = totalPrice*orderDTO.getCurrencyRate();
						}
						totalPrice = (double) Math.round(totalPrice * 100) / 100;
					}
					orderDTO.setTotalPrice(totalPrice);
				}
				insertInvoicedOrder(orderDTO);
				++row;
			}

			//Add special handling row
			if(user!=null){
				SPECIAL_HANDLING_NAME =user.getSpecialHandlingName();
				SPECIAL_HANDLING_FEE = user.getSpecialHandlingFee();
			}
			if(listOrdersDTOfiler!=null && listOrdersDTOfiler.size()>0){
				// row empty
				cellFont = new WritableFont(WritableFont.TIMES, 12);
				cellFont.setColour(Colour.BLACK);
				cellFormat = new WritableCellFormat(cellFont);
				cellFormat.setBackground(Colour.GREY_25_PERCENT);
				cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
				cellFormat.setAlignment(Alignment.CENTRE);
				cellFormat.setWrap(true);
				cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN,Colour.BLACK);
				sheetToEdit.setRowView(row, 25*25);
				for (int i=2; i<=25; i++) { 
					EMPTY="";
					labelEMPTY = new Label(i-1, row, EMPTY,cellFormat);
					cellEMPTY = (WritableCell) labelEMPTY;
					sheetToEdit.addCell(cellEMPTY);
				}

				cellFont = new WritableFont(WritableFont.TIMES, 12);
				cellFont.setColour(Colour.BLACK);
				cellFormat = new WritableCellFormat(cellFont);
				cellFormat.setBackground(Colour.VERY_LIGHT_YELLOW);
				cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
				cellFormat.setAlignment(Alignment.CENTRE);
				cellFormat.setWrap(true);
				cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN,Colour.BLUE);

				row++;
				sheetToEdit.setRowView(row, 25*25);
				//------------------ COL_2: PARTNER_NAME --------------
				PATNER_NAME="";
				if (user!= null) {
					PATNER_NAME = user.getLogin();
					labelPATNER_NAME = new Label(COL_PATNER_NAME-1, row, PATNER_NAME,cellFormat);
					cellPATNER_NAME = (WritableCell) labelPATNER_NAME;
					sheetToEdit.addCell(cellPATNER_NAME);
				}

				//------------------ COL_3: INVOICE_NUMBER --------------
				labelINVOICE_NUMBER = new Label(COL_INVOICE_NUMBER-1, row, "",cellFormat);
				cellINVOICE_NUMBER = (WritableCell) labelINVOICE_NUMBER;
				sheetToEdit.addCell(cellINVOICE_NUMBER);

				//------------------ COL_4: TOTAL_QUANTITY --------------------
				labelTOTAL_QUANTITY = new Label(COL_TOTAL_QUANTITY-1, row, TOTAL_QUANTITY + "", cellFormat);
				cellTOTAL_QUANTITY = (WritableCell) labelTOTAL_QUANTITY;
				sheetToEdit.addCell(cellTOTAL_QUANTITY);

				//------------------ COL_5: PO_NUMBER --------------------
				labelPO_NUMBER = new Label(COL_PO_NUMBER-1, row, "",cellFormat);
				cellPO_NUMBER = (WritableCell) labelPO_NUMBER;
				sheetToEdit.addCell(cellPO_NUMBER);

				//------------------ COL_6: CLIENT_ORDER_NUMBER -----------
				labelCLIENT_ORDER_NUMBER = new Label(COL_CLIENT_ORDER_NUMBER-1, row, "",cellFormat);
				cellCLIENT_ORDER_NUMBER = (WritableCell) labelCLIENT_ORDER_NUMBER;
				sheetToEdit.addCell(cellCLIENT_ORDER_NUMBER);

				//------------------ COL_7: SPECIAL_HANDLING_NAME ------------------
				if(SPECIAL_HANDLING_NAME==null)SPECIAL_HANDLING_NAME="";	
				labelSPECIAL_HANDLING_NAME = new Label(COL_SPECIAL_HANDLING_NAME-1, row, SPECIAL_HANDLING_NAME,cellFormat);
				cellSPECIAL_HANDLING_NAME = (WritableCell) labelSPECIAL_HANDLING_NAME;
				sheetToEdit.addCell(cellSPECIAL_HANDLING_NAME);

				//------------------ COL_8: CLIENT_OTHER_ID -----------------
				labelCLIENT_OTHER_ID = new Label(COL_CLIENT_OTHER_ID-1, row, "",cellFormat);
				cellCLIENT_OTHER_ID = (WritableCell) labelCLIENT_OTHER_ID;
				sheetToEdit.addCell(cellCLIENT_OTHER_ID);

				//------------------ COL_9: CLIENT_PRODUCT_NUMBER -------------
				labelCLIENT_PRODUCT_NUMBER = new Label(COL_CLIENT_PRODUCT_NUMBER-1, row, "",cellFormat);
				cellCLIENT_PRODUCT_NUMBER = (WritableCell) labelCLIENT_PRODUCT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_PRODUCT_NUMBER);

				//------------------ COL_10: CLIENT_NUMBER ---------------------
				labelCLIENT_NUMBER = new Label(COL_CLIENT_NUMBER-1, row, "",cellFormat);
				cellCLIENT_NUMBER = (WritableCell) labelCLIENT_NUMBER;
				sheetToEdit.addCell(cellCLIENT_NUMBER);

				//------------------ COL_11: COL_UNIT_PRICE --------------
				String strSPECIAL_HANDLING_FEE="";
				if (SPECIAL_HANDLING_FEE!= null)strSPECIAL_HANDLING_FEE=SPECIAL_HANDLING_FEE+"";
				labelUNIT_PRICE = new Label(COL_UNIT_PRICE-1, row, strSPECIAL_HANDLING_FEE,cellFormat);
				cellUNIT_PRICE = (WritableCell) labelUNIT_PRICE;
				sheetToEdit.addCell(cellUNIT_PRICE);

				//------------------ COL_12: TRACKING_NUMBER --------------------
				labelTRACKING_NUMBER = new Label(COL_TRACKING_NUMBER-1, row, "",cellFormat);
				cellTRACKING_NUMBER = (WritableCell) labelTRACKING_NUMBER;
				sheetToEdit.addCell(cellTRACKING_NUMBER);

				//------------------ COL_13: cellSHIPPING_PRICE ------------------
				labelSHIPPING_PRICE = new Label(COL_SHIPPING_PRICE-1, row, "",cellFormat);
				cellSHIPPING_PRICE = (WritableCell) labelSHIPPING_PRICE;
				sheetToEdit.addCell(cellSHIPPING_PRICE);

				//------------------ COL_14: SHIPED_DATE --------------------------
				labelSHIPED_PROVINCE = new Label(COL_SHIPED_DATE-1, row, "",cellFormat);
				cellSHIPED_PROVINCE = (WritableCell) labelSHIPED_PROVINCE;
				sheetToEdit.addCell(cellSHIPED_PROVINCE);

				//------------------ COL_15: SHIPED_PROVINCE ----------------------
				SHIPED_PROVINCE = "S13";
				labelSHIPED_PROVINCE = new Label(COL_SHIPED_PROVINCE-1, row, SHIPED_PROVINCE,cellFormat);
				cellSHIPED_PROVINCE = (WritableCell) labelSHIPED_PROVINCE;
				sheetToEdit.addCell(cellSHIPED_PROVINCE);

				//------------------ COL_16: COL_FIRST_NAME -----------------
				labelFIRST_NAME = new Label(COL_FIRST_NAME-1, row, "",cellFormat);
				cellFIRST_NAME = (WritableCell) labelFIRST_NAME;
				sheetToEdit.addCell(cellFIRST_NAME);

				//------------------ COL_17: COL_LAST_NAME ------------------
				labelLAST_NAME = new Label(COL_LAST_NAME-1, row, "",cellFormat);
				cellLAST_NAME = (WritableCell) labelLAST_NAME;
				sheetToEdit.addCell(cellLAST_NAME);

				//------------------ COL_18: COL_OTHER_NAMES -----------------
				labelOTHER_NAMES = new Label(COL_OTHER_NAMES-1, row, "",cellFormat);
				cellOTHER_NAMES = (WritableCell) labelOTHER_NAMES;
				sheetToEdit.addCell(cellOTHER_NAMES);

				//------------------ COL_19: COL_STREET ----------------------
				labelSTREET = new Label(COL_STREET-1, row, "",cellFormat);
				cellSTREET = (WritableCell) labelSTREET;
				sheetToEdit.addCell(cellSTREET);

				//------------------ COL_20: COL_OTHER_ADDRESS ---------------
				labelOTHER_ADDRESS = new Label(COL_OTHER_ADDRESS-1, row, "",cellFormat);
				cellOTHER_ADDRESS = (WritableCell) labelOTHER_ADDRESS;
				sheetToEdit.addCell(cellOTHER_ADDRESS);

				//------------------ COL_21: COL_CITY_CLIENT -----------------
				labelCITY_CLIENT = new Label(COL_CITY_CLIENT-1, row, "",cellFormat);
				cellCITY_CLIENT = (WritableCell) labelCITY_CLIENT;
				sheetToEdit.addCell(cellCITY_CLIENT);

				//------------------ COL_22: COL_PROVINCE --------------------
				labelPROVINCE = new Label(COL_PROVINCE-1, row, "",cellFormat);
				cellPROVINCE = (WritableCell) labelPROVINCE;
				sheetToEdit.addCell(cellPROVINCE);

				//------------------ COL_23: COL_POSTAL_CODE -----------------
				labelPOSTAL_CODE = new Label(COL_POSTAL_CODE-1, row, "",cellFormat);
				cellPOSTAL_CODE = (WritableCell) labelPOSTAL_CODE;
				sheetToEdit.addCell(cellPOSTAL_CODE);

				//------------------ COL_24: COL_LS_ORDER_ID-----------------
				labelLS_ORDER_ID = new Label(COL_LS_ORDER_ID-1, row, "",cellFormat);
				cellLS_ORDER_ID = (WritableCell) labelLS_ORDER_ID;
				sheetToEdit.addCell(cellLS_ORDER_ID);
				
				//------------------ COL_25: COL_CURRENCY-----------------
				labelCURRENCY = new Label(COL_CURRENCY-1, row, "",cellFormat);
				cellCURRENCY = (WritableCell) labelCURRENCY;
				sheetToEdit.addCell(cellCURRENCY);
			}
			workbookCopy.write();
			workbookCopy.close();
			existingWorkbook.close();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	/**----------------------------------------------------------
	 *CREATE CSV FOR EST TOOL*
	  -----------------------------------------------------------*/
	@Override
	public void generateAdminEstTool(List<OrdersDTO >listOrdersDTO, String filePathData,boolean selection){
		//COLUMNS Data
		String RECORD_TYPE="2"; 		// 1:Recode Type
		String LS_ORDER_ID="";			// 2:Imported Order ID
		String CLIENT_LOGIN="";			// 3:Client ID
		String TITLE_NAME="";			// 4:Title Name
		String CLIENT_FIRST_NAME="";	// 5:First Name
		String CLIENT_LAST_NAME="";		// 6:Last Name
		String DEPT="";					// 7:Title/Dept
		String COMPANY_HEADER="";		// 8:Company Name
		String CLIENT_STREET_INF="";		// 9:Add'1 Address Information
		String CLIENT_STREET1="";	// 10:Address Line 1
		String CLIENT_STREET2="";		// 11:Address Line 2
		String CLIENT_CITY="";			// 12:City

		String CLIENT_PROVINCE="";		// 13:Province or State
		String CLIENT_POSTAL_CODE="";	// 14:Postal Code or Zip Code
		String COUNTRY_CODE="CA";		// 15:Country Code

		String CLIENT_PHONE="";			// 16:Client Voice Phone
		String CLIENT_FAX="";			// 17:Client FAX Number

		String CLIENT_EMAIL="";			// 18:Client Email Address
		String WEIGHT="0";				// 19:Weight

		String data;

		try{

			String fileName=filePathData+"EST_TOOL.csv";
			File file = new File(fileName);
			if(file.exists())file.delete();
			file = new File(fileName);
			PrintWriter pw= new PrintWriter(new FileWriter(fileName,true),true);
			
			List<OrdersDTO>listOrdersDTOfiler=new ArrayList<OrdersDTO>();
			//if admin select just some orders to get their cvs Canada post
			if(selection){
				for(OrdersDTO ord:listOrdersDTO){
					if((ord.getPrint()!=null && ord.getPrint()==true)
							&&(ord.getRowsList().get(0).getStatus()!=null && ord.getRowsList().get(0).getStatus().equals("progress")))listOrdersDTOfiler.add(ord);
				}
			//if admin select all orders, select just witch has status progress
			}else{
				for(OrdersDTO ord:listOrdersDTO){
					if(ord.getRowsList().get(0).getStatus()!=null && ord.getRowsList().get(0).getStatus().equals("progress")){
						listOrdersDTOfiler.add(ord);
					}
				}
			}
			//Creation of csv for Canada Post
			for (OrdersDTO orderDTO : listOrdersDTOfiler) {
				LS_ORDER_ID="";
				CLIENT_LOGIN="";
				TITLE_NAME="";
				CLIENT_FIRST_NAME="";
				CLIENT_LAST_NAME="";
				DEPT="";
				COMPANY_HEADER="";
				CLIENT_STREET_INF="";
				CLIENT_STREET1="";
				CLIENT_STREET2="";
				CLIENT_CITY="";
				CLIENT_PROVINCE="";
				CLIENT_POSTAL_CODE="";
				COUNTRY_CODE="CA";
				CLIENT_PHONE="";
				CLIENT_FAX="";
				CLIENT_EMAIL="";

				data="";
				// 1: RECORD TYPE (must be always 2)
				data+=RECORD_TYPE+",";

				// 2: LS_ORDER_ID (must be lest than 35 letters)
				LS_ORDER_ID = orderDTO.getLsOrderId();
				if(LS_ORDER_ID.length()>30){
					LS_ORDER_ID="?????";
				}
				data+="\""+LS_ORDER_ID+"\",";


				// 3: CLIENT_LOGIN="" (must be lest than 30 letters)
				if(orderDTO.getUserLogin()!=null)CLIENT_LOGIN = orderDTO.getUserLogin();
				if(CLIENT_LOGIN.length()>30){
					LS_ORDER_ID="?????";
				}
				data+="\""+CLIENT_LOGIN+"\",";


				// 4: TITLE_NAME (must be lest than 14 letters)
				data+="\""+TITLE_NAME+"\",";


				// 5: CLIENT_FIRST_NAME (must be lest than 30 letters)
				if(orderDTO.getClientFirstName()!=null)CLIENT_FIRST_NAME=orderDTO.getClientFirstName();
				if(CLIENT_FIRST_NAME.length()>30){
					CLIENT_FIRST_NAME="?????";
				}
				data+="\""+CLIENT_FIRST_NAME+"\",";


				// 6: CLIENT_LAST_NAME (must be lest than 40 letters)
				if(orderDTO.getClientLastName()!=null)CLIENT_LAST_NAME=orderDTO.getClientLastName();
				if(CLIENT_LAST_NAME.length()>40){
					CLIENT_LAST_NAME="?????";
				}
				data+="\""+CLIENT_LAST_NAME+"\",";


				// 7: TITLE_NAME (must be lest than 44 letters)
				data+="\""+DEPT+"\",";


				// 8: COMPANY_HEADER
				if(orderDTO.getCompanyHeader()!=null)COMPANY_HEADER=orderDTO.getCompanyHeader();
				if(COMPANY_HEADER.length()>40){
					COMPANY_HEADER="?????";
				}
				data+="\""+COMPANY_HEADER+"\",";


				// 9: CLIENT_STREET_INF (must be lest than 44 letters)
				OrdersRows orderR=orderDTO.getRowsList().get(0);
				if(orderR.getLsProductID()!=null)CLIENT_STREET_INF=orderR.getLsProductID();
				CLIENT_STREET_INF="";
				if(CLIENT_STREET_INF!=null && CLIENT_STREET_INF.length()>44){
					CLIENT_STREET_INF="?????";
				}
				data+="\""+CLIENT_STREET_INF+"\",";


				// 10: CLIENT_STREET1 (must be lest than 44 letters)
				if(orderDTO.getClientStreet()!=null)CLIENT_STREET1=orderDTO.getClientStreet();
				if(CLIENT_STREET1.length()>44){
					CLIENT_STREET1="?????";
				}
				CLIENT_STREET1=CLIENT_STREET1.replaceAll(",", " ");

				data+="\""+CLIENT_STREET1+"\",";


				// 11: CLIENT_STREET3 (must be lest than 44 letters)
				if(orderDTO.getClientOtherStreet()!=null)CLIENT_STREET2=orderDTO.getClientOtherStreet();
				if(CLIENT_STREET2.length()>44){
					CLIENT_STREET2="?????";
				}
				CLIENT_STREET2=CLIENT_STREET2.replaceAll(",", " ");
				data+="\""+CLIENT_STREET2+"\",";

				// 12: CLIENT_CITY (must be lest than 25 letters)
				if(orderDTO.getClientCity()!=null)CLIENT_CITY=orderDTO.getClientCity();
				if(CLIENT_CITY.length()>25){
					CLIENT_CITY="?????";
				}
				data+="\""+CLIENT_CITY+"\",";

				// 13: CLIENT_PROVINCE (must be lest than 2 letters)
				if(orderDTO.getClientProvince()!=null)CLIENT_PROVINCE=orderDTO.getClientProvince();
				if(CLIENT_PROVINCE.length()>2){
					CLIENT_PROVINCE="?????";
				}
				data+="\""+CLIENT_PROVINCE+"\",";


				// 14: CLIENT_POSTAL_CODE (must be lest than 14 letters)
				if(orderDTO.getClientPostalCode()!=null)CLIENT_POSTAL_CODE=orderDTO.getClientPostalCode();
				if(CLIENT_POSTAL_CODE.length()>14){
					CLIENT_POSTAL_CODE="?????";
				}
				data+="\""+CLIENT_POSTAL_CODE+"\",";


				// 15: COUNTRY_CODE(must be lest than 3 letters)
				data+="\""+COUNTRY_CODE+"\",";


				// 16: CLIENT_PHONE (must be lest than 25 letters)
				if(orderDTO.getClientPhone()!=null)CLIENT_PHONE = orderDTO.getClientPhone();
				if(CLIENT_PHONE.length()>25){
					CLIENT_PHONE="?????";
				}
				data+="\""+CLIENT_PHONE+"\",";

				// 17: CLIENT_FAX (must be lest than 25 letters)
				data+="\""+CLIENT_FAX+"\",";


				// 18: CLIENT_EMAIL (must be lest than 60 letters)
				if(orderDTO.getClientEmail()!=null)CLIENT_EMAIL = orderDTO.getClientEmail();
				if(CLIENT_EMAIL.length()>60){
					CLIENT_EMAIL="?????";
				}
				data+="\""+CLIENT_EMAIL+"\",";


				// 3: WEIGHT (must be lest than 9 letters)
				data+=WEIGHT;

				pw.println(data);
				//}
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}


	}

	/**----------------------------------------------------------
	 *UPDATE TABLE ORDERS ROWS IN DATABASES FROM XLS FILE*
	 *WE SAVE TRACKING NUMBER,SHUPPING DATE AND SHIPPING PRICE*
	  -----------------------------------------------------------*/
	@Override
	public void updateOrdersRowsFromAdminXLS(String userAdminLogin,String destFileAdminXLS)throws Exception{
		String errorReport="";
		//variable indicating the numbers of columns in the XLS file
		int ROW_TO_START = 0;
		//F:6 G:7 H:8
		final int COL_F = 6;
		final int COL_G = 7;
		final int COL_H = 8;
		final int COL_I = 9;
		final int COL_LS_ORDER_ID=31;
		final int COL_TRACKING_NUMBER=17;
		final int COL_SHIPPING_PRICE=10;
		final int COL_BOX_LENGTH = 12;		//In cm
		final int COL_BOX_WIDTH = 13;		//In cm
		final int COL_BOX_HEIGTH = 14;		//In cm
		final int COL_BOX_TOTAL_WEIGHT = 5;	//In kg
		
		String  strSHIPPING_PRICE="";
		//Values of cells
		String  LS_ORDER_ID="";
		Date SHIPPED_DATE=null;
		String TRACKING_NUMBER = null;
		Double SHIPPING_PRICE = null;
		Double VAL_F = null;
		Double VAL_G = null;
		Double VAL_H = null;
		Double VAL_I = null;
		Double BOX_LENGTH = null;
		Double BOX_WIDTH = null;
		Double BOX_HEIGTH = null;
		Double BOX_TOTAL_WEIGHT = null;
		
		//Cells
		Cell cellLS_ORDER_ID= null;
		Cell cellTRACKING_NUMBER= null;
		Cell cellSHIPPING_PRICE= null;

		Cell cellF = null;
		Cell cellG = null;
		Cell cellH = null;
		Cell cellI = null;
		Cell cellBOX_LENGTH = null;
		Cell cellBOX_WIDTH = null;
		Cell cellBOX_HEIGTH = null;
		Cell cellBOX_TOTAL_WEIGHT = null;

		//try {
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destFileAdminXLS+"ordersAdminImport.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {

			//--------------- 31: LS_ORDER_ID
			cellLS_ORDER_ID = sheetToRead.getCell(COL_LS_ORDER_ID-1, row);			
			if(cellLS_ORDER_ID!=null){
				LS_ORDER_ID = cellLS_ORDER_ID.getContents();
				LS_ORDER_ID=LS_ORDER_ID.replaceAll(" ", "");
			}
			if(LS_ORDER_ID==null || LS_ORDER_ID.equals("")){
				errorReport+=" "+(row+1)+" ,LS_ORDER_ID:"+LS_ORDER_ID+" ,|---->dosen't exist \n";
			}

			//--------------- SHIPPED_DATE
			SHIPPED_DATE=new Date();

			//--------------- 17: TRACKING_NUMBER
			cellTRACKING_NUMBER = sheetToRead.getCell(COL_TRACKING_NUMBER-1, row);			
			if(cellTRACKING_NUMBER!=null){
				TRACKING_NUMBER = cellTRACKING_NUMBER.getContents();
				TRACKING_NUMBER=TRACKING_NUMBER.replaceAll(" ", "");
			}
			if(TRACKING_NUMBER==null || TRACKING_NUMBER.equals("")){
				errorReport+=" "+(row+1)+" ,TRACKING_NUMBER:"+TRACKING_NUMBER+" ,|---->dosen't exist \n";
			}

			//--------------- 10:SHIPPING_PRICE

			// COL 6:value of column H VAL_F
			cellF = sheetToRead.getCell(COL_F-1, row);			
			if(cellF!=null){
				String strVAL_F = cellF.getContents();
				VAL_F=getDoubleFromString(strVAL_F,3);
			}
			// COL 7:value of column H VAL_G
			cellG = sheetToRead.getCell(COL_G-1, row);			
			if(cellG!=null){
				String strVAL_G = cellG.getContents();
				VAL_G=getDoubleFromString(strVAL_G,3);
			}
			// COL 8:value of column H VAL_H
			cellH = sheetToRead.getCell(COL_H-1, row);			
			if(cellH!=null){
				String strVAL_H = cellH.getContents();
				VAL_H=getDoubleFromString(strVAL_H,3);
			}
			// COL 9:value of column I VAL_I
			cellI = sheetToRead.getCell(COL_I-1, row);			
			if(cellI!=null){
				String strVAL_I = cellI.getContents();
				VAL_I=getDoubleFromString(strVAL_I,3);
			}
			if(VAL_F!=null && VAL_G!=null && VAL_H!=null && VAL_I!=null){
				SHIPPING_PRICE=VAL_F+VAL_G+VAL_H+VAL_I;
				SHIPPING_PRICE = (double) Math.round(SHIPPING_PRICE * 100) / 100;
			}else errorReport+=" "+(row+1)+" ,SHIPPING_PRICE:"+strSHIPPING_PRICE+" ,|---->is null \n";
			//--------------- 12: BOX_LENGTH
			cellBOX_LENGTH = sheetToRead.getCell(COL_BOX_LENGTH-1, row);
			if(cellBOX_LENGTH!=null){
				String strBOX_LENGTH = cellBOX_LENGTH.getContents().replaceAll(" ", "");
				if(!strBOX_LENGTH.equals("")) {
					BOX_LENGTH = getDoubleFromString(strBOX_LENGTH,3);
				} else errorReport+=" "+(row+1)+" ,BOX_LENGTH:"+strBOX_LENGTH+" ,|---->is empty \n";
			} else errorReport+=" "+(row+1)+" ,BOX_LENGTH: "+" ,|---->is null \n";
			
			//--------------- 13: BOX_WIDTH
			cellBOX_WIDTH = sheetToRead.getCell(COL_BOX_WIDTH-1, row);			
			if(cellBOX_WIDTH!=null){
				String strBOX_WIDTH = cellBOX_WIDTH.getContents().replaceAll(" ", "");
				if(!strBOX_WIDTH.equals("")) {
					BOX_WIDTH = getDoubleFromString(strBOX_WIDTH,3);
				} else errorReport+=" "+(row+1)+" ,BOX_WIDTH:"+strBOX_WIDTH+" ,|---->is empty \n";
			} else errorReport+=" "+(row+1)+" ,BOX_WIDTH: "+" ,|---->is null \n";
			
			//--------------- 14: BOX_HEIGTH
			cellBOX_HEIGTH = sheetToRead.getCell(COL_BOX_HEIGTH-1, row);			
			if(cellBOX_HEIGTH!=null){
				String strBOX_HEIGTH = cellBOX_HEIGTH.getContents().replaceAll(" ", "");
				if(!strBOX_HEIGTH.equals("")) {
					BOX_HEIGTH = getDoubleFromString(strBOX_HEIGTH,3);
				} else errorReport+=" "+(row+1)+" ,BOX_HEIGTH:"+strBOX_HEIGTH+" ,|---->is empty \n";
			} else errorReport+=" "+(row+1)+" ,BOX_HEIGTH: "+" ,|---->is null \n";
			
			//--------------- 5:  BOX_TOTAL_WEIGHT
			cellBOX_TOTAL_WEIGHT = sheetToRead.getCell(COL_BOX_TOTAL_WEIGHT-1, row);			
			if(cellBOX_TOTAL_WEIGHT!=null){
				String strBOX_TOTAL_WEIGHT = cellBOX_TOTAL_WEIGHT.getContents().replaceAll(" ", "");
				if(!strBOX_TOTAL_WEIGHT.equals("")) {
					BOX_TOTAL_WEIGHT = getDoubleFromString(strBOX_TOTAL_WEIGHT,3);
				} else errorReport+=" "+(row+1)+" ,BOX_TOTAL_WEIGHT:"+strBOX_TOTAL_WEIGHT+" ,|---->is empty \n";
			} else errorReport+=" "+(row+1)+" ,BOX_TOTAL_WEIGHT: "+" ,|---->is null \n";
			try {
			//--------------- Update Row if shipped
			if(LS_ORDER_ID!=null){
				OrdersRows orderRow=getRowByLsOrderId(LS_ORDER_ID);
				if(orderRow!=null){
					Long productId = orderRow.getProductId();
					Double quantity = orderRow.getQuantity();
					OrdersDTO orderDTO=getOrderDTOByLsOrderId(orderRow.getLsOrderId());
					OrdersSpecialShippingDTO ordSpecialShipDTO=new OrdersSpecialShippingDTO();
					ordSpecialShipDTO.setProductId(orderRow.getProductId());
					ordSpecialShipDTO.setUserId(orderDTO.getUserId());
					OrdersSpecialShippingDTO OrdSpecialShip=getOrderSpecialShipping(ordSpecialShipDTO);
					if(OrdSpecialShip!=null){
						SHIPPING_PRICE=OrdSpecialShip.getShippingPrice();
						SHIPPING_PRICE = (double) Math.round(SHIPPING_PRICE * 100) / 100;
					}
					if(TRACKING_NUMBER!=null && !TRACKING_NUMBER.equals("")&& SHIPPING_PRICE!=null){
						orderRow.setShippedDate(SHIPPED_DATE);
						orderRow.setShippingPrice(SHIPPING_PRICE);
						orderRow.setTrackingNumber(TRACKING_NUMBER);
						orderRow.setShippingCompany("Canada Post");
						makeRowOrderInShippedById(orderRow);
					}else{
						makeRowOrderInOpenById(orderRow);
					}
					
					//update Box sizes and make them verified if they are not
					if(productId != null) {
					  if(quantity == 1) {
						  if(BOX_LENGTH!=null && BOX_WIDTH!=null && BOX_HEIGTH!=null && BOX_TOTAL_WEIGHT!=null) {
							BoxDTO boxDTO = new BoxDTO();
							productService = getServiceLocator().getProductService();
							try {
								boxDTO = productService.getBoxByProductId(productId);
							} catch (Exception e) {
								e.printStackTrace();
							}
							//Make Lenght the biggest size between L,W and H
							Double permute;
							if(BOX_LENGTH < BOX_HEIGTH) {
								permute    = BOX_LENGTH;
								BOX_LENGTH = BOX_HEIGTH;
								BOX_HEIGTH = permute;
							}
							if(BOX_LENGTH < BOX_WIDTH) {
								permute = BOX_LENGTH;
								BOX_LENGTH = BOX_WIDTH;
								BOX_WIDTH = permute;
							}
							if(BOX_WIDTH < BOX_HEIGTH) {
								permute = BOX_WIDTH;
								BOX_WIDTH = BOX_HEIGTH;
								BOX_HEIGTH = permute;
							}
							//Convert from "cm" to "inch" and from "kg" to "lbs"
							DecimalFormat twoDForm = new DecimalFormat("#.##");
							Double boxLengthInch = 	Double.valueOf(twoDForm.format(BOX_LENGTH *0.393701));
							Double boxWidthInch  =  Double.valueOf(twoDForm.format(BOX_WIDTH  *0.393701));
							Double boxHeightInch =  Double.valueOf(twoDForm.format(BOX_HEIGTH *0.393701));
							Double boxTotalWeightLbs = Double.valueOf(twoDForm.format(BOX_TOTAL_WEIGHT * 2.20462));
							//If the product doesn't exist in the "product_box" table
							if(boxDTO==null) {
								boxDTO = new BoxDTO();
							}
							boxDTO.setProductId(productId);
							boxDTO.setLength(boxLengthInch);
							boxDTO.setWidth(boxWidthInch);
							boxDTO.setHeight(boxHeightInch);
							boxDTO.setTotalWeight(boxTotalWeightLbs);
							boxDTO.setStatusId(1);
							productService.updateProductBoxIfCpNotVerified(boxDTO);
						  }
					  }// End -- if(quantity == 1)
					}//End -- if(productId != null)
					
				} else errorReport+=" "+(row+1)+" ,LS_ORDER_ID:"+LS_ORDER_ID+" ,|---->dosen't exist \n";
			}
			}catch (Exception e) {
				System.out.println("row:"+row);
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}

		createLogsFile(userAdminLogin,destFileAdminXLS, errorReport,2);
		File ordersAdminImport=new File(destFileAdminXLS+"ordersAdminImport.xls");
		ordersAdminImport.delete();


	}

	public Double getDoubleFromString(String str,int nbDecimal){
		Double result=null;
		str=str.replaceAll(" ", "");
		if(str!=null && !str.equals("")){
			int index=str.indexOf(",");
			if(index<0)index=str.indexOf(".");
			if(index>=0){
				String str1=str.substring(0, index);
				String str2= str.substring(index+1, str.length());
				if(str2.length()>nbDecimal)str2=str2.substring(0, nbDecimal);
				str=str1+"."+str2;
			}
		}
		try {
			result = Double.parseDouble(str);
		}
		catch (Exception pe) {
			result=null;
		}
		return result;
	}

	@Override
	public String getStringFromDouble(Double value,int nbDecimal){
		String result=null;
		if(value!=null){
			String str=value+"";
			String str1="";
			String str2="";
			str=str.replaceAll(" ", "");
			if(str!=null && !str.equals("")){
				int index=str.indexOf(",");
				if(index<0)index=str.indexOf(".");
				if(index>=0){
					str1=str.substring(0, index);
					str2= str.substring(index+1, str.length());
					int decimal=str2.length();
					switch (decimal) {
					case 0:
						str2="0000";
						break;
					case 1:
						str2=str2+"000";
						break;
					case 2:
						str2=str2+"00";
						break;
					case 3:
						str2=str2+"0";
						break;
					}
				}else{
					str2="0000";
				}
			}
			str2=str2.substring(0, nbDecimal);					
			str=str1+"."+str2;
			result=str;
		}
		return result;
	}

	
	
	
	/**----------------------------------------------------------
	 *UPDATE TABLE STOCK IN DATABASES FROM XLS FILE*
	  -----------------------------------------------------------*/
/*	@Override
	public List<OrdersDTO> listStockFromXLS(String userAdminLogin,String destFileStockXLS)throws Exception{
		String errorReport="";
		//variable indicating the numbers of columns in the XLS file
		int ROW_TO_START = 1;
		final int COL_LS_PRODUCT_ID=1;
		final int COL_STOCK=2;

		String  strSTOCK="";

		//Values of cells
		String  LS_PRODUCT_ID="";
		Double STOCK = null;

		//Cells
		Cell cellLS_PRODUCT_ID= null;
		Cell cellSTOCK= null;

		productService=serviceLocator.getProductService();
		orderService = serviceLocator.getOrderService();

		Workbook existingWorkbook = Workbook.getWorkbook(new File(destFileStockXLS+"stock.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		List<OrdersDTO> listStock = new ArrayList<OrdersDTO>() ;
		OrdersDTO orderDTO;
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {

			//--------------- 1: LS_PRODUCT_ID
			cellLS_PRODUCT_ID = sheetToRead.getCell(COL_LS_PRODUCT_ID-1, row);			
			if(cellLS_PRODUCT_ID!=null)LS_PRODUCT_ID = cellLS_PRODUCT_ID.getContents();
			if(LS_PRODUCT_ID==null || LS_PRODUCT_ID.equals("")){
				errorReport+=" "+(row+1)+" ,LS_PRODUCT_ID:"+LS_PRODUCT_ID+" ,|---->dosen't exist \n";
			}else{
				int index=LS_PRODUCT_ID.indexOf("/");
				if(index>0)LS_PRODUCT_ID=LS_PRODUCT_ID.substring(0, index);

			}
			//--------------- 2:STOCK
			cellSTOCK = sheetToRead.getCell(COL_STOCK-1, row);			
			if(cellSTOCK!=null){
				strSTOCK = cellSTOCK.getContents();
				strSTOCK=strSTOCK.replaceAll(" ", "");
				if(strSTOCK!=null && !strSTOCK.equals("")){
					int index=strSTOCK.indexOf(",");
					if(index>=0){
						String strSTOCK1=strSTOCK.substring(0, index);
						String strSTOCK2= strSTOCK.substring(index+1, strSTOCK.length());
						strSTOCK=strSTOCK1+"."+strSTOCK2;
					}
				}else errorReport+=" "+(row+1)+" ,STOCK:"+strSTOCK+" ,|---->is null \n";
				STOCK=null;
				try {
					STOCK = Double.parseDouble(strSTOCK);
				}
				catch (Exception pe) {
					STOCK=null;
				}
			}

			
			//--------------- Update Row if shipped
			if(LS_PRODUCT_ID!=null){
				// Replace all white spaces
				LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll("\\s","");
				ProductDTO pDTO=productService.getProductByLsProductId(LS_PRODUCT_ID);
				if(pDTO!=null){
					Long productId = pDTO.getId();
					if (productId!=null && STOCK!=null) {
						orderDTO = new OrdersDTO();
						orderDTO.setProductId(productId);
						orderDTO.setStock(STOCK);
						listStock.add(orderDTO);
					}
				}
			}
		}
		List<Orders>listOrders=getOrdersList();
		//orderService.updateStock(listStock);
		createLogsFile(userAdminLogin,destFileStockXLS, errorReport,1);
		return listStock;

	}
	*/
	
	
	
	/**----------------------------------------------------------
	 *UPDATE TABLE STOCK IN DATABASES FROM XLS FILE*
	  -----------------------------------------------------------*/
	/*@Override
	public void updateStockFromStockXLS(List<OrdersDTO>listStock)throws Exception{
		String errorReport="";
		//variable indicating the numbers of columns in the XLS file
		int ROW_TO_START = 1;
		final int COL_LS_PRODUCT_ID=1;
		final int COL_STOCK=2;
 
		String  strSTOCK="";

		//Values of cells
		String  LS_PRODUCT_ID="";
		Double STOCK = null;

		//Cells
		Cell cellLS_PRODUCT_ID= null;
		Cell cellSTOCK= null;

		productService=serviceLocator.getProductService();
		orderService = serviceLocator.getOrderService();

		Workbook existingWorkbook = Workbook.getWorkbook(new File(destFileStockXLS+"stock.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		List<Orders> listStock = new ArrayList<Orders>() ;
		Orders order;
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {

			//--------------- 1: LS_PRODUCT_ID
			cellLS_PRODUCT_ID = sheetToRead.getCell(COL_LS_PRODUCT_ID-1, row);			
			if(cellLS_PRODUCT_ID!=null)LS_PRODUCT_ID = cellLS_PRODUCT_ID.getContents();
			if(LS_PRODUCT_ID==null || LS_PRODUCT_ID.equals("")){
				errorReport+=" "+(row+1)+" ,LS_PRODUCT_ID:"+LS_PRODUCT_ID+" ,|---->dosen't exist \n";
			}else{
				int index=LS_PRODUCT_ID.indexOf("/");
				if(index>0)LS_PRODUCT_ID=LS_PRODUCT_ID.substring(0, index);

			}
			//--------------- 2:STOCK
			cellSTOCK = sheetToRead.getCell(COL_STOCK-1, row);			
			if(cellSTOCK!=null){
				strSTOCK = cellSTOCK.getContents();
				strSTOCK=strSTOCK.replaceAll(" ", "");
				if(strSTOCK!=null && !strSTOCK.equals("")){
					int index=strSTOCK.indexOf(",");
					if(index>=0){
						String strSTOCK1=strSTOCK.substring(0, index);
						String strSTOCK2= strSTOCK.substring(index+1, strSTOCK.length());
						strSTOCK=strSTOCK1+"."+strSTOCK2;
					}
				}else errorReport+=" "+(row+1)+" ,STOCK:"+strSTOCK+" ,|---->is null \n";
				STOCK=null;
				try {
					STOCK = Double.parseDouble(strSTOCK);
				}
				catch (Exception pe) {
					STOCK=null;
				}
			}
			//--------------- Update Row if shipped
			if(LS_PRODUCT_ID!=null){
				// Replace all white spaces
				LS_PRODUCT_ID = LS_PRODUCT_ID.replaceAll("\\s","");
				ProductDTO pDTO=productService.getProductByLsProductId(LS_PRODUCT_ID);
				if(pDTO!=null){
					Long productId = pDTO.getId();
					if (productId!=null && STOCK!=null) {
						order = new Orders();
						order.setProductId(productId);
						order.setStock(STOCK);
						listStock.add(order);
					}
				}
			}
		}
		orderService.updateStock(listStock);
		//createLogsFile(userAdminLogin,destFileStockXLS, errorReport,1);
	}
*/
	/**----------------------------------------------------------
	 *UPDATE TABLE STOCK IN DATABASES FROM XLS FILE*
	  -----------------------------------------------------------*/
	@Override
	public void updateSpecialShippingFromXLS(StringBuffer rapport,String userAdminLogin,Long userId,String destFileXLS)throws Exception{
		String errorReport="";
		String errorReportHtml="<table border='0'>";
		//variable indicating the numbers of columns in the XLS file

		//user_id,ls_product_id,shipping_price,product_id
		OrdersSpecialShippingDTO specialShippingDTO=null;

		int ROW_TO_START = 1;
		final int COL_LS_PRODUCT_ID=1;
		final int COL_SHIPPING_PRICE=2;

		String  strSHIPPING_PRICE="";

		//Values of cells
		String  LS_PRODUCT_ID="";
		Double SHIPPING_PRICE = null;

		//Cells
		Cell cellLS_PRODUCT_ID= null;
		Cell cellSHIPPING_PRICE= null;

		productService=serviceLocator.getProductService();
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destFileXLS+"specialShipping.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {

			//--------------- 1: LS_PRODUCT_ID
			cellLS_PRODUCT_ID = sheetToRead.getCell(COL_LS_PRODUCT_ID-1, row);			
			if(cellLS_PRODUCT_ID!=null)LS_PRODUCT_ID = cellLS_PRODUCT_ID.getContents();
			LS_PRODUCT_ID=LS_PRODUCT_ID.replaceAll(" ", "");
			if(LS_PRODUCT_ID!=null && !LS_PRODUCT_ID.equals("")){
				int index=LS_PRODUCT_ID.indexOf("_");
				if(index==2 && LS_PRODUCT_ID.length()>=3)LS_PRODUCT_ID=LS_PRODUCT_ID.substring(index+1, LS_PRODUCT_ID.length());
			}

			//--------------- 2:COL_SHIPPING_PRICE
			cellSHIPPING_PRICE = sheetToRead.getCell(COL_SHIPPING_PRICE-1, row);			
			if(cellSHIPPING_PRICE!=null){
				strSHIPPING_PRICE = cellSHIPPING_PRICE.getContents();
				strSHIPPING_PRICE=strSHIPPING_PRICE.replaceAll(" ", "");
				strSHIPPING_PRICE=strSHIPPING_PRICE.replaceAll("\\$", "");
				if(strSHIPPING_PRICE!=null && !strSHIPPING_PRICE.equals("")){
					SHIPPING_PRICE=getDoubleFromString(strSHIPPING_PRICE, 3);
				}else if(LS_PRODUCT_ID!=null && !LS_PRODUCT_ID.equals("")){
					errorReport+=" "+(row+1)+",SHIPPING_PRICE:"+strSHIPPING_PRICE+" ,|---->is null \n";
					errorReportHtml+="<tr height='20px'><td>Line:"+(row+1)+"</td><td style='padding-left:15px;'>SHIPPING_PRICE:<font style='color:red;'>"+strSHIPPING_PRICE+"</font></td><td style='padding-left:15px;'>dosen't exist</td></tr>";
				}
				strSHIPPING_PRICE=null;
			}

			//--------------- Update Row if shipped 
			if(LS_PRODUCT_ID!=null){
				ProductDTO pDTO=productService.getProductByLsProductId(LS_PRODUCT_ID);
				if(pDTO!=null){
					specialShippingDTO=new OrdersSpecialShippingDTO();
					specialShippingDTO.setLsProductId(pDTO.getLoyaltyProductId());
					specialShippingDTO.setProductId(pDTO.getId());
					specialShippingDTO.setUserId(userId);
					specialShippingDTO.setShippingPrice(SHIPPING_PRICE);
					OrdersSpecialShippingDTO specShippCheck=getOrderSpecialShipping(specialShippingDTO);
					if(specShippCheck==null){
						insertOrderSpecialShipping(specialShippingDTO);
					}else{
						updateOrderSpecialShipping(specialShippingDTO);
					}
				}else if(LS_PRODUCT_ID!=null && !LS_PRODUCT_ID.equals("")){
					errorReport+=" "+(row+1)+",LS_PRODUCT_ID:"+LS_PRODUCT_ID+" ,|--->DOSEN'T EXIST!\n";
					errorReportHtml+="<tr height='20px'><td>Line:"+(row+1)+"</td><td style='padding-left:15px;'>LS_PRODUCT_ID:<font style='color:red;'>"+LS_PRODUCT_ID+"</font></td><td style='padding-left:15px;'>dosen't exist</td></tr>";
				}
			}
		}
		errorReportHtml+="</table>";
		rapport.append(errorReportHtml);
		createLogsFile(userAdminLogin,destFileXLS, errorReport,3);
	}

	/**----------------------------------------------------------
	 *CREATION FILE LOGS OF UPDATING STOCK*
	  -----------------------------------------------------------*/
	@Override
	public void createLogsFile(String userAdminLogin,String folderDest, String errorReport,int option){ 

		try{
			SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
			String logFileName = null;
			String logFileNameHystic=null;
			Date date=new Date();
			Calendar myCalendar = Calendar.getInstance();
			myCalendar.setTime(date);
			myCalendar.add(Calendar.DATE, -6);
			//File folderLog = new File(folderDest+"logs"); 
			//check path of wtpwebapps in server
			String wtpwebapps=folderDest;
			for(int i=0;i<=4;i++){
				File folderLogParent= new File(wtpwebapps);
				wtpwebapps=folderLogParent.getParent();
			}

			File folderLog = new File(wtpwebapps+"/logs");
			folderLog.mkdirs();
			File folderOrderLog = new File(wtpwebapps+"/logs/orders");
			folderOrderLog.mkdirs();

			switch (option) {
			case 1://STOCK
				logFileName=wtpwebapps+"/logs/orders/stock_"+frm.format(date)+".txt";
				logFileNameHystic=wtpwebapps+"/logs/orders/stock_";
				break;
			case 2://UPDATE ORDERS
				logFileName=wtpwebapps+"/logs/orders/orders_"+frm.format(date)+".txt";
				logFileNameHystic=wtpwebapps+"/logs/orders/orders_";
				break;
			case 3://UPDATE/INSERT SPECIAL SHIPPING
				logFileName=wtpwebapps+"/logs/orders/specialShipping_"+frm.format(date)+".txt";
				logFileNameHystic=wtpwebapps+"/logs/orders/specialShipping_";
				break;
			}

			for(int i=1; i<=6;i++){
				myCalendar.add(Calendar.DATE, -1);
				Date d=myCalendar.getTime();
				String logFileNameHysticItem=logFileNameHystic+frm.format(d);		
				File fileLog=new File(logFileNameHysticItem+".txt");
				fileLog.delete();		
			}
			PrintWriter pw= new PrintWriter(new FileWriter(logFileName,true),true);
			Date today=new Date();
			SimpleDateFormat frmTime=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String strToday=frmTime.format(today);
			String rapport="===============================================\n";
			rapport=rapport+strToday+ " By:"+userAdminLogin+"\n"+"===============================================\n";	
			pw.println(rapport+errorReport);
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**----------------------------------------------------------
	 *PARCING CSV*
	  -----------------------------------------------------------*/
	@Override
	public void csvParsing(String csvFolder,String userLogin)throws Exception{

		BufferedReader pr=null;
		String result="";
		String ligne="";
		User user=null;
		Integer id=0;
		ArrayList<String[]> arraylist=new ArrayList<String[]>();

		userService= serviceLocator.getUserService();
		user=userService.getUserByLogin(userLogin);
		id=Integer.parseInt(user.getId().toString());
		pr=new BufferedReader(new FileReader(csvFolder+userLogin+".csv")); 
		while((ligne=pr.readLine())!=null){
			ligne=ligne.replaceAll("\"", "");
			String[] data=ligne.split(",");
			arraylist.add(data);
			result+=ligne;
		} //End loop while
		pr.close();
		final String sheetName = "Sheet1";
		int row = 0;
		Workbook existingWorkbook = Workbook.getWorkbook(new File(csvFolder+"transCsvTemplate.xls"));
		WritableWorkbook workbookCopy = Workbook.createWorkbook(new File(csvFolder+userLogin+".xls"), existingWorkbook);
		WritableSheet sheetToEdit = workbookCopy.getSheet(sheetName);
		//LABELS
		Label label=null;
		row=0;
		int col=0;
		// Create cell font and format
		WritableFont cellFontHeader = new WritableFont(WritableFont.TIMES, 12);
		cellFontHeader.setColour(Colour.BLACK);
		cellFontHeader.setBoldStyle(WritableFont.BOLD);
		WritableFont cellFontData = new WritableFont(WritableFont.TIMES);
		WritableCellFormat cellFormatHeader = new WritableCellFormat(cellFontHeader);
		WritableCellFormat cellFormatData = new WritableCellFormat(cellFontData);
		cellFormatHeader.setVerticalAlignment(VerticalAlignment.CENTRE);
		cellFormatHeader.setBorder(Border.ALL, BorderLineStyle.HAIR);
		cellFormatData.setVerticalAlignment(VerticalAlignment.CENTRE);
		WritableCell cell;
		for (String[] d : arraylist) {
			col=0;
			for(int i=0;i< d.length;i++){
				if(row==0){
					label = new Label(col, row, d[col],cellFormatHeader);
				}else{

					String lsOrderId=d[col];
					if(col==16){
						switch (id) {
						case 39:
							lsOrderId=lsOrderId.replace("LYS-CA-AC-", "");
							lsOrderId=user.getCode()+lsOrderId;
							break;
						}	
					}		
					label = new Label(col, row, lsOrderId,cellFormatData);
				}
				cell = (WritableCell) label;
				sheetToEdit.addCell(cell);
				col++;
			}
			row++;
		}	
		workbookCopy.write();
		workbookCopy.close();
		existingWorkbook.close();
	}

	/**----------------------------------------------------------
	 *Insert special cost into table Order_special_shipping*
	  -----------------------------------------------------------*/
	@Override

	public	boolean insertOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO){
		boolean result=false;
		final OrdersSpecialShipping orderSpecial=DTOFactory.getOrderSpecialFromOrderSpecialDTO(orderSpecialDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertOrderSpecialShipping(orderSpecial);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}


	/**----------------------------------------------------------
	 *Update special cost into table Order_special_shipping*
	  -----------------------------------------------------------*/
	@Override

	public	boolean updateOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO){
		boolean result=false;
		final OrdersSpecialShipping orderSpecial=DTOFactory.getOrderSpecialFromOrderSpecialDTO(orderSpecialDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateOrderSpecialShipping(orderSpecial);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}

	/**----------------------------------------------------------
	 *get special Shipping cost by user and product_id*
	  -----------------------------------------------------------*/
	@Override

	public	OrdersSpecialShippingDTO getOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO){
		OrdersSpecialShipping result=null;
		final OrdersSpecialShipping orderSpecial=DTOFactory.getOrderSpecialFromOrderSpecialDTO(orderSpecialDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (OrdersSpecialShipping) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getOrderSpecialShipping(orderSpecial);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getOrderSpecialDTOFromOrderSpecial(result);
	}


	/***
	 * 
	 * @param orderDTO
	 * @param option
	 * @return
	 */

	public OrdersDTO orderDTOSplitFirstLastName(OrdersDTO orderDTO,int option){
		String whole = orderDTO.getClientLastName();
		String[] elems = null;
		if (whole != null) {
			elems = whole.split("\\s");
			switch (option) {
			case 0:
				orderDTO.setClientFirstName("");
				orderDTO.setClientLastName("");
				break;
			case 1:
				orderDTO.setClientFirstName("");
				orderDTO.setClientLastName("");
				break;
			case 2:
				orderDTO.setClientFirstName("");
				orderDTO.setClientLastName(elems[1]);
				break;
			case 3:
				orderDTO.setClientFirstName(elems[2]);
				orderDTO.setClientLastName(elems[1]);
				break;
			case 4:
				orderDTO.setClientFirstName(elems[3]);
				orderDTO.setClientLastName(elems[1]+" "+elems[2]);
				break;
			case 5:
				orderDTO.setClientFirstName(elems[4]);
				orderDTO.setClientLastName(elems[1] + " " + elems[2]+" "+ elems[3]);
				break;
			}

		}
		return orderDTO;
	}


	//========================================= Client's Part ============================================

	@SuppressWarnings("unchecked")
	/**----------------------------------------------------------
	 *get All Clients By User*
	  -----------------------------------------------------------*/
	@Override
	public List<OrdersDTO>getAllClientsByUser(final Long userId){
		List<Orders> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getAllClientsByUser(userId);
				}
			});
		}catch (DaoException de) {
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(result) ;	
	}
	/**----------------------------------------------------------
	 *Add New Destination*
  	 -----------------------------------------------------------*/
	@Override
	public boolean insertNewDestination(OrdersDTO orderDTO){
		final Orders order=DTOFactory.getOrderFromOrderDTO(orderDTO);
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertNewDestination(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public boolean insertUserFileRecovery(UserFileRecoveryDTO userFileRecoveryDTO) throws ServiceException {
		final UserFileRecovery userFileRecovery = DTOFactory.BuildUserFileRecovery(userFileRecoveryDTO) ;
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUserFileRecoveryDao().insertUserFileRecovery(userFileRecovery);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// A method that read all the columns of the first row for userFileRecovery
	@Override
	public  List<ItemMapDTO> getItemsUserFileMapping(File fileToMap, int fileType) throws Exception{
		List<ItemMapDTO> listOfitem = new ArrayList<ItemMapDTO>();
		ItemMapDTO imDTO;
		switch (fileType) {
		case 1://for xml file.
			String fileName = fileToMap.getAbsolutePath();
			String[] xmlTagNames = getAllTagNames(fileName);
			if(xmlTagNames != null && xmlTagNames.length>0){
				Set<String> mySet = new HashSet<String>(Arrays.asList(xmlTagNames));
				for(String str : mySet){
					imDTO = new ItemMapDTO();
					imDTO.setKey(str);
					imDTO.setValue(str);
					listOfitem.add(imDTO);	
				}
			}
			break;
		case 2: case 3: // For reading the columns of the xls , csv file

			Workbook workbook = Workbook.getWorkbook(fileToMap);
			Sheet sheetToRead = workbook.getSheet(0);
			int COL_MAX = sheetToRead.getColumns();

			for(int col=0; col < COL_MAX;col++) {
				String itemLabel=sheetToRead.getCell(col, 0).getContents();
				if(itemLabel!=null && !itemLabel.equals("")){
					imDTO = new ItemMapDTO();
					imDTO.setKey(Integer.toString(col+1));
					imDTO.setValue(itemLabel);
					listOfitem.add(imDTO);	
				}
			}
			break;

		}
		return listOfitem;
	}

	// A method that read an xml and returns a String array with the all the Tag names.
	public String[] getAllTagNames(String fileName) throws Exception {
		// TODO Auto-generated method stub
		String[] xmlTagNames = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		File file = new File(fileName);
		if(file.exists()){
			Document doc = db.parse(file);
			Element docEle = doc.getDocumentElement();
			NodeList nodeList=doc.getElementsByTagName("*");
			xmlTagNames =  new String[nodeList.getLength()];
			for (int i=0; i<nodeList.getLength(); i++){
				Element element = (Element)nodeList.item(i);
				xmlTagNames[i]=(element.getNodeName());
			}
		}
		return xmlTagNames;	
	}

	@Override
	public boolean isFileDownloaded(UserFilesDownloadedDTO ufdDTO) throws ServiceException {
		final UserFilesDownloaded ufd = DTOFactory.BuildUserFilesDownloaded(ufdDTO) ;
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().isFileDownloaded(ufd);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public boolean insertUserFilesDownloaded(UserFilesDownloadedDTO ufdDTO) throws ServiceException {
		final UserFilesDownloaded ufd = DTOFactory.BuildUserFilesDownloaded(ufdDTO) ;
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().insertUserFilesDownloaded(ufd);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<UserFilesDownloadedDTO> getListFileDownloadedDTO(final String userLogin, final Integer userLoginOption,final Integer treatedOption) throws ServiceException{
		List<UserFilesDownloaded> result=null;
		try{
			daoManager.setCommitTransaction(true);
			result = (List<UserFilesDownloaded>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getListFileDownloaded(userLogin,userLoginOption,treatedOption);
				}
			});
		}catch (DaoException de) { 
			try { 
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getListFileDownloadedDTOFromModel(result) ;	
	}

	@Override
	public boolean isFileForUser(final String fileToImport, final String userLogin) throws ServiceException{
		Boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().isFileForUser(fileToImport, userLogin);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public boolean updateFilesDownloadedStatus(final String fileToImport, final String userLogin, final boolean treated)throws Exception{
		Boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateFilesDownloadedStatus(fileToImport,userLogin,treated);
				}
			});
		}catch (DaoException de) {
			try {
				throw new Exception(de);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	/**----------------------------------------------------------
	 *THIS FUNCTION ALLOWS US TO TRANSFORM AN XML FILE TO A LIST 
	   OF ORDERS FOR RIDEAU*
	  -----------------------------------------------------------*/	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Collection  toArrayListFromXML_Rideau(File orderFile,String userLogin,String fileToImport)throws Exception {
		Collection listOrdersDTO = new ArrayList();
		UserFileRecoveryDTO ufrDTO;
		String formatDate="";
		Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
		productService = serviceLocator.getProductService();

		if(orderFile==null)return listOrdersDTO;
		List<ProvinceDTO> listProvine= productService.getAllProvinces();
		UserFileDataRecoveryDTO ufDataDTO=new UserFileDataRecoveryDTO();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse (orderFile);
		ufrDTO=getUserFileRecoveryByUser(userLogin);
		// normalize text representation
		doc.getDocumentElement ().normalize ();

		if(fileToImport!=null && fileToImport.length()==12){ 
			int index =fileToImport.lastIndexOf(".");
			String fileNameWithout_OD_ext=fileToImport.substring(2,index); 
			Long fileCounter= Long.parseLong(fileNameWithout_OD_ext);
			String file_seq = getValue("file_sequence",doc,0);
			Long fileSeqNo=0L;
			if(file_seq != null)
				fileSeqNo = Long.parseLong(file_seq);
			if(fileCounter.longValue()!=fileSeqNo.longValue()){
				return listOrdersDTO;
			}
		}
		if(ufrDTO!=null && ufrDTO.getTagRoot()!=null  && ufrDTO.getFileTypeId()==1){
			NodeList listOfOrders = doc.getElementsByTagName(ufrDTO.getTagRoot());
			for(int s=0; s<listOfOrders.getLength() ; s++){
				Node firstOrderNode = listOfOrders.item(s);   
				if(firstOrderNode.getNodeType() == Node.ELEMENT_NODE){
					Element firstOrderElement = (Element)firstOrderNode;
					int numberOfOrders = firstOrderElement.getElementsByTagName("item_detail").getLength();
					for(int i = 0 ; i < numberOfOrders; i++){
						if(getValue("detail_type", firstOrderElement,i)!=null &&  getValue("detail_type", firstOrderElement,i).equalsIgnoreCase("SO") ){
							ufDataDTO=new UserFileDataRecoveryDTO();
							ufDataDTO.setUserId(ufrDTO.getUserId());
							//--------------- 1:companyHeader -----------
							String companyHeader="";
							if(ufrDTO.getCompanyHeader()!=null){
								companyHeader=getValue("ship_to_company_name", firstOrderElement, 0);
							}
							ufDataDTO.setCompanyHeader(companyHeader);

							//--------------- 2:productOrderNumber <source>+<program_id>+ <client_po> = PO number (ex: C RM C-H1281210)----------------
							String productOrderNumber="";
							String source="";
							String programId="";
							if(ufrDTO.getProductOrderNumber()!=null){
								productOrderNumber=getValue(ufrDTO.getProductOrderNumber(), firstOrderElement, 0);
							}
							source=getValue("source", firstOrderElement, 0);
							programId=getValue("program_id", firstOrderElement, 0);
							ufDataDTO.setProductOrderNumber(source+" "+programId+" "+productOrderNumber);   

							//--------------- 3:productOrderDate -----------------
							String productOrderDate="";
							if(ufrDTO.getProductOrderDate()!=null){
								productOrderDate= getValue(ufrDTO.getProductOrderDate(), firstOrderElement, 0);
							}
							formatDate="yyyy-MM-dd hh:mm:ss";
							SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
							Date dateOrder=null;
							try {
								Date date = sdf.parse(productOrderDate);
								dateOrder=date;
							}
							catch (Exception pe) {
								dateOrder=null;
							}
							ufDataDTO.setProductOrderDate(dateOrder);

							//--------------- 4:quantity -------------------------
							String strQuantity="";
							if(ufrDTO.getQuantity()!=null){
								strQuantity=getValue(ufrDTO.getQuantity(), firstOrderElement, i);
								if(strQuantity!=null)
									strQuantity=strQuantity.replaceAll(" ", "");
							}

							if(strQuantity!=null && !strQuantity.equals("")){
								int index=strQuantity.indexOf(",");
								if(index>=0){
									String strUnitPrice1=strQuantity.substring(0, index);
									String strUnitPrice2= strQuantity.substring(index+1, strQuantity.length());
									strQuantity=strUnitPrice1+"."+strUnitPrice2;
								}
							}
							Double quantity=null;
							try {
								quantity = Double.parseDouble(strQuantity);
							}
							catch (Exception pe) {
								quantity=null;
							}
							ufDataDTO.setQuantity(quantity);

							//--------------- 5:lsProductID - Vendor item number ----------------------
							String lsProductID="";
							if(ufrDTO.getLsProductID()!=null){
								lsProductID=getValue(ufrDTO.getLsProductID(), firstOrderElement, i);
								/*if(lsProductID.length()>3){
									lsProductID=lsProductID.substring(3);
								}*/
							}
							ufDataDTO.setLsProductID(lsProductID);

							//--------------- 6:productDescription - client_item_detail------------------
							String productDescription="";
							if(ufrDTO.getProductDescription()!=null){
								productDescription=getValue(ufrDTO.getProductDescription(), firstOrderElement, i);
							}
							productDescription=productDescription.replaceAll(",", " ");
							ufDataDTO.setProductDescription(productDescription);

							//--------------- 7:unitPrice <item_price> = Unit Price---------------------------
							String strUnitPrice="";
							if(ufrDTO.getUnitPrice()!=null){
								strUnitPrice=getValue(ufrDTO.getUnitPrice(), firstOrderElement, i);
								if(strUnitPrice!=null && strUnitPrice.length()>0){
									strUnitPrice= strUnitPrice.replaceAll("\\$", "");
									strUnitPrice= strUnitPrice.replaceAll(" ", "");
								}
							}

							if(strUnitPrice!=null && !strUnitPrice.equals("")){
								int index=strUnitPrice.indexOf(",");
								if(index>=0){
									String strUnitPrice1=strUnitPrice.substring(0, index);
									String strUnitPrice2= strUnitPrice.substring(index+1, strUnitPrice.length());
									strUnitPrice=strUnitPrice1+"."+strUnitPrice2;
								}
							}
							Double ProductUnitPrice=null;
							try {
								ProductUnitPrice = Double.parseDouble(strUnitPrice);
							}
							catch (Exception pe) {
								ProductUnitPrice=null;
							}
							ufDataDTO.setUnitPrice(ProductUnitPrice);

							//--------------- 8:clientNumber -------------------------
							String clientNumber="";
							if(ufrDTO.getClientNumber()!=null){
								NodeList clientNumberList = doc.getElementsByTagName(ufrDTO.getClientNumber());
								if(clientNumberList!=null && clientNumberList.getLength()>0){
									Element clientNumberElement = (Element)clientNumberList.item(0);
									if(clientNumberElement!=null){
										NodeList clientNumberFNList = clientNumberElement.getChildNodes();
										if(clientNumberFNList!=null && clientNumberFNList.getLength()>0){
											clientNumber =((Node)clientNumberFNList.item(0)).getNodeValue().trim(); 
										}
									}
								}
							}
							ufDataDTO.setClientNumber(clientNumber);

							//--------------- 9 and 10 :full name <ship_to_name> = Client First Name + Client Last Name (split after space) ---------------------------
							//CASE 1: If productOrderNumber dosen't started with "C RM"
							String fullName="";
							if(ufrDTO.getClientFirstName()!=null){
								fullName=getValue(ufrDTO.getClientFirstName(), firstOrderElement, 0);
							}
							fullName=fullName.replaceAll(",", " ");
							String[] tokens = fullName.split(" ");
							String firstName="";
							String lastName="";
							if(tokens.length > 1) {
								firstName= tokens[0];
								lastName = fullName.substring(fullName.indexOf(" "));
								firstName=firstName.replaceAll(" ", "");
								lastName=lastName.replaceAll(" ", "");
							}else{
								firstName= tokens[0];
							}
							ufDataDTO.setClientFirstName(firstName);
							//lastName
							ufDataDTO.setClientLastName(lastName);
							
							//CASE 2: If productOrderNumber dosen't started with "C RM"
							productOrderNumber=ufDataDTO.getProductOrderNumber();
							productOrderNumber=productOrderNumber.replaceAll(" ", "");
							if(productOrderNumber!=null && productOrderNumber.startsWith("CRMC")){
								fullName="";
								if(ufrDTO.getClientLastName()!=null){
									fullName=getValue(ufrDTO.getClientLastName(), firstOrderElement, 0);
								}
								ufDataDTO.setClientFirstName("Rideau");
								//lastName
								ufDataDTO.setClientLastName(fullName);
							}

							//--------------- 11:addressStreet,  <ship_to_street_1>----------------------
							String addressStreet="";
							if(ufrDTO.getClientStreet()!=null){
								addressStreet=getValue(ufrDTO.getClientStreet(), firstOrderElement, 0);
							}
							addressStreet=addressStreet.replaceAll(",", " ");
							ufDataDTO.setClientStreet(addressStreet);

							//--------------- 12:addressStreetOther <ship_to_street_2>----------------
							String addressStreetOther="";
							if(ufrDTO.getClientOtherStreet()!=null){
								addressStreetOther=getValue(ufrDTO.getClientOtherStreet(), firstOrderElement, 0);
							}
							ufDataDTO.setClientOtherStreet(addressStreetOther);

							//--------------- 13:addressCity, <ship_to_city> ------------------------
							String addressCity="";
							if(ufrDTO.getClientCity()!=null){
								addressCity=getValue(ufrDTO.getClientCity(), firstOrderElement, 0);
							}
							ufDataDTO.setClientCity(addressCity);

							//--------------- 14:addressPostalCode, ship_to_postal_code ---------------------
							String addressPostalCode=" ";
							if(ufrDTO.getClientPostalCode()!=null){
								addressPostalCode=getValue(ufrDTO.getClientPostalCode(), firstOrderElement, 0);
							}
							addressPostalCode=addressPostalCode.replaceAll(" ", "");
							ufDataDTO.setClientPostalCode(addressPostalCode);

							//--------------- 15:addressState ship_to_province-------------------------
							String addressState="";
							if(ufrDTO.getClientProvince()!=null){
								addressState=getValue(ufrDTO.getClientProvince(), firstOrderElement, 0);
								if(addressState!=null && addressState.length()>0){
									String clientProvinceToCompar=addressState.toLowerCase();
									clientProvinceToCompar=clientProvinceToCompar.replaceAll(" ", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll("canada", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll(",", "");
									clientProvinceToCompar=clientProvinceToCompar.replaceAll("\\.", "");
									for(ProvinceDTO prov:listProvine){
										String provName=prov.getName();
										provName=provName.replaceAll(" ", "");
										provName= provName.toLowerCase();
										if(clientProvinceToCompar.equals(provName) || clientProvinceToCompar.equals(prov.getCode()) ){
											addressState=	prov.getCode();
											break;
										}
									}
									addressState=addressState.replaceAll("\\.", "");
									if(clientProvinceToCompar.equals(""))addressState=""; 
								}
							}
							ufDataDTO.setClientProvince(addressState);

							//--------------- 16:clientPhone, ship_to_phone --------------------------
							String clientPhone="";
							if(ufrDTO.getClientPhone()!=null){
								clientPhone=getValue(ufrDTO.getClientPhone(), firstOrderElement, 0);
							}
							//--------------- 17:client_phone_zone -------------------------
							String clientPhoneZone="";
							if(ufrDTO.getClientPhoneZone()!=null){
								clientPhoneZone=getValue(ufrDTO.getClientPhoneZone(), firstOrderElement, 0);
							}
							if(clientPhoneZone!=null && !clientPhoneZone.equals(""))clientPhone=clientPhoneZone+" "+clientPhone;
							ufDataDTO.setClientPhone(clientPhone);

							//--------------- 18:clientEmail -------------------------
							String clientEmail="";
							if(ufrDTO.getClientEmail()!=null){
								clientEmail=getValue(ufrDTO.getClientEmail(), firstOrderElement, 0);
							}
							ufDataDTO.setClientEmail(clientEmail);

							//--------------- 19:requiredDate, required_date -------------------------
							String requiredDate="";
							if(ufrDTO.getRequiredDate()!=null){
								requiredDate=getValue(ufrDTO.getRequiredDate(), firstOrderElement, i);
								if(requiredDate!=null && requiredDate.length()>0){
									requiredDate=requiredDate.replaceAll(" ", "");
								}
							}
							formatDate=ufrDTO.getFormatDate();
							if(formatDate==null)formatDate="";
							sdf = new SimpleDateFormat(formatDate);
							Date requiredDateOrder=null;
							try {
								Date date = sdf.parse(requiredDate);
								requiredDateOrder=date;
							}
							catch (Exception pe) {
								requiredDateOrder=null;
							}                     
							ufDataDTO.setRequiredDate(requiredDateOrder);

							//--------------- 20:clients_other_names, <ship_to_company_name>+<ship_to_other1_name>+<ship_to_other2_name>  -------------------------
							String clientsOtherNames = "";
							String shipToOtherNames1 = "";
							String shipToOtherNames2 = "";
							if (ufrDTO.getClientOtherNames() != null) {
								clientsOtherNames=getValue(ufrDTO.getClientOtherNames(), firstOrderElement, 0);
								shipToOtherNames2=getValue("ship_to_other2_name", firstOrderElement, 0);
							}
							ufDataDTO.setClientOtherNames(clientsOtherNames +" " + shipToOtherNames1 + " " + shipToOtherNames2);

							//--------------- 21:lsOrderId ------------------------
							String code=userLogin.substring(0, 2).toUpperCase();
							String lsOrderId=ufDataDTO.getProductOrderNumber();

							int inc=0;//increment
							String lsOrderIdParent=lsOrderId;
							lsOrderIdParent=lsOrderIdParent.replaceFirst("-", "");
							lsOrderIdParent=lsOrderIdParent.replaceFirst("_", "");
							lsOrderIdParent=lsOrderIdParent.replaceFirst("R", "");
							lsOrderIdParent=lsOrderIdParent.replaceAll(" ", "");
							if(lsOrderIdParent.length()>14){
								int index=lsOrderIdParent.length()-14;
								lsOrderIdParent=lsOrderIdParent.substring(index, lsOrderIdParent.length());
							}
							String lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent;;
							while(isLsOrderIdUsed(lsOrderIdToGenerate) || lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
								inc++; 
								lsOrderIdToGenerate=code+"O"+ufDataDTO.getUserId()+lsOrderIdParent+"R"+inc;
							}
							lsOrdersIdHash.put(lsOrderIdToGenerate, lsOrderIdToGenerate);
							ufDataDTO.setLsOrderId(lsOrderIdToGenerate);

							//--------------- 22:Shipping company  - comments -------------------------
							/*
							 * Note : just copy the shipping details only when program id is RM for all other case, put blank in DB*/
							String shippingCompany="";
							if(ufrDTO.getShippingCompany()!=null && programId.equalsIgnoreCase("RM")){
								shippingCompany=getValue(ufrDTO.getShippingCompany(), firstOrderElement,0);
							}
							if(shippingCompany!= null && shippingCompany.length()> 30){
								int index = shippingCompany.indexOf("Shipping info:");
								if(index >= 0){
									shippingCompany=shippingCompany.substring(15).trim();
									if(shippingCompany.length()>30){
										int idx=shippingCompany.length()-30;
										shippingCompany=shippingCompany.substring(idx, shippingCompany.length());
									}
								}
							}
							ufDataDTO.setShippingCompany(shippingCompany);

							//--------------- 23:Notes ---------------------------------------------------------
							String notes = "";
							String noteTags="";
							if(ufrDTO.getNotes()!=null){
								notes=getValue(ufrDTO.getNotes(),firstOrderElement,0);
								noteTags=ufrDTO.getNotes();
								if(noteTags!=null && noteTags!=""){
									String[] tags = noteTags.split("↨");
									for(int a = 0 ; a <tags.length; a ++){
										notes = notes + getValue(tags[a],doc,a);
										if(a <tags.length-1 )
											notes=notes+("↨");
									}
								}
							}
							ufDataDTO.setOrderFileInfo(notes);

							//--------------- 24:Client product number <client_item_number>  -------------------------
							String clientProductNumber="";
							if(ufrDTO.getClientProductNumber()!=null){
								clientProductNumber=getValue(ufrDTO.getClientProductNumber(), firstOrderElement,i);
							}
							ufDataDTO.setClientProductNumber(clientProductNumber);

							//--------------- 25:clientOtherId -------------------------
							String clientOtherId="";
							if(ufrDTO.getClientOtherId()!=null){
								clientOtherId=getValue(ufrDTO.getClientOtherId(), firstOrderElement, 0);
							}
							ufDataDTO.setClientOtherId(clientOtherId);

							//--------------- 26:clientOrderNumber, <client_po_detail> = Client Order ID-------------------------
							String clientOrderNumber="";
							if(ufrDTO.getClientOrderNumber()!=null){
								clientOrderNumber=getValue(ufrDTO.getClientOrderNumber(), firstOrderElement, i);
							}
							ufDataDTO.setClientOrderNumber(clientOrderNumber);

							//--------------- 27:customer product number-------------------------
							String cstProductNumber="";
							if(ufrDTO.getCstProductNumber()!=null){
								cstProductNumber=getValue(ufrDTO.getCstProductNumber(), firstOrderElement, 0);
							}
							ufDataDTO.setCstProductNumber(cstProductNumber);

							ufDataDTO.setCreationDate(new Date());

							listOrdersDTO.add(ufDataDTO);
						}
					}
				}//end of if clause
			}//end of for loop with s var
		}//end if with condition ufrDTO!=null
		return listOrdersDTO;
	}


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

	private static String getValue(String tag, Document doc , int i) {
		String nodeValue="";
		NodeList nodeList = doc.getElementsByTagName(tag);
		if(nodeList!=null && nodeList.getLength()> 0){
			Element nodeElement = (Element)nodeList.item(0);
			if(nodeElement!=null){
				NodeList nodes = nodeElement.getChildNodes();
				if(nodes!=null && nodes.getLength()>0){
					nodeValue =((Node)nodes.item(0)).getNodeValue().trim(); 
				}
			}
		}
		return nodeValue;
	}
	@Override
	public boolean updateFileSequenceShipping(final Long userId ,final int fileSequenceNo) throws ServiceException {
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateFileSequenceShipping(userId,fileSequenceNo);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public boolean updateFileSequenceInvoice(final Long userId ,final int fileSequenceNo) throws ServiceException {
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateFileSequenceInvoice(userId,fileSequenceNo);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	/**----------------------------------------------------------
	 *GET ORDER DTO BY LS_ORDER_ID*
  	-----------------------------------------------------------*/	
	@Override
	public OrdersDTO getInvoiceOrderByLsOrderId(final String lsOrderId)	throws ServiceException { 
		Orders order=null;	
		OrdersDTO result=null;
		try{
			daoManager.setCommitTransaction(true);
			order = (Orders) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getInvoiceOrderByLsOrderId(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		if(order!=null)result=DTOFactory.getOrderDTOFromOrder(order);
		return result;

	}

	@Override
	public Double getTotalShippedQuantityForSplitOrders(final String lsOrderId){ 
		Double count= new Double(0); 
		try{
			daoManager.setCommitTransaction(true);
			count = (Double) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getTotalShippedQuantityForSplitOrders(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	@Override
	public Double getOrderedQuantity(final String lsOrderId) throws ServiceException {
		Double count= new Double(0); 
		try{
			daoManager.setCommitTransaction(true);
			count = (Double) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getOrderedQuantity(lsOrderId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/*// Update Stock
	@Override
	public boolean updateStock(final List<OrdersDTO> listStock) throws ServiceException {
		boolean result=false;
		final List<Orders>listOrders=DTOFactory.getListOrdersFromListOrdersDTO(listStock);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateStock(listOrders);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}*/

	//check if there are orders that wern't saved
	@Override
	public Integer nbOrdersNotSaved(List<OrdersDTO> ordersDTOListImported) throws ServiceException {
		Integer count=0;
		if(ordersDTOListImported==null)return count;
		final List<Orders> ordersListImported=DTOFactory.getListOrdersFromListOrdersDTO(ordersDTOListImported);
		try{
			daoManager.setCommitTransaction(true);
			count = (Integer) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().nbOrdersNotSaved(ordersListImported);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	
	/**----------------------------------------------------------
	 * getCurrencyIdByUserId *
	  -----------------------------------------------------------*/
	@Override
	public CurrencyDTO getCurrencyIdByUserId(final Long userId){ 
		Currency currencyResult = new Currency();
		try{
			daoManager.setCommitTransaction(true);
			currencyResult = (Currency) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getOrdersDao().getCurrencyIdByUserId(userId);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getCurrencyDTOBySymbol(currencyResult);
	}


	/* =====================================================================================
	  								PDF Parsing Functions
	   =====================================================================================*/
	
	/**----------------------------------------------------------
	 * toArrayListFromList *
	 * Gets a List of UserFileRecoveryData from the list got from the PDF file 
	  -----------------------------------------------------------*/
	@SuppressWarnings("null")
	public Collection toArrayListFromListOfPDFLines(List<String> listGotFromPDF, String userLogin)throws Exception {
		UserFileRecoveryDTO ufrDTO = null;
		ufrDTO = getUserFileRecoveryByUser(userLogin);
		productService = serviceLocator.getProductService();
		Collection listOrdersDTO = new ArrayList();
		
		if(listGotFromPDF!=null && ufrDTO!=null && ufrDTO.getFileTypeId()==4){
			List<String> listFromPDF = new ArrayList<String>();
			for(int i=0; i<listGotFromPDF.size(); i++) listFromPDF.add(listGotFromPDF.get(i));
			
			UserFileDataRecoveryDTO ufDataDTO = new UserFileDataRecoveryDTO();
			
			String formatDate = ufrDTO.getFormatDate();

			List<String> UFR_PO_NUMBER		= getFilterList(ufrDTO.getProductOrderNumber());
			List<String> UFR_FIRST_NAME		= getFilterList(ufrDTO.getClientFirstName());
			List<String> UFR_LAST_NAME		= getFilterList(ufrDTO.getClientLastName());
			List<String> UFR_POSTAL_CODE	= getFilterList(ufrDTO.getClientPostalCode());
			List<String> UFR_PROVINCE		= getFilterList(ufrDTO.getClientProvince());
			List<String> UFR_CITY			= getFilterList(ufrDTO.getClientCity());
			List<String> UFR_STREET			= getFilterList(ufrDTO.getClientStreet());
			List<String> UFR_PHONE			= getFilterList(ufrDTO.getClientPhone());
			List<String> UFR_EMAIL			= getFilterList(ufrDTO.getClientEmail());
			List<String> UFR_PO_DATE		= getFilterList(ufrDTO.getProductOrderDate());
			List<String> UFR_REQUIRED_DATE	= getFilterList(ufrDTO.getRequiredDate());
			List<String> UFR_LS_PRODUCT_ID	= getFilterList(ufrDTO.getLsProductID());
			List<String> UFR_UNIT_PRICE		= getFilterList(ufrDTO.getUnitPrice());
			List<String> UFR_QUANTITY		= getFilterList(ufrDTO.getQuantity());
			List<String> UFR_PRODUCT_DESC	= getFilterList(ufrDTO.getProductDescription());

			Long USER_ID = null;
			String PO_NUMBER = null;
			String FIRST_NAME = null;
			String LAST_NAME = null;
			String POSTAL_CODE = null;
			String PROVINCE = null;
			String CITY = null;
			String STREET = null;
			String PHONE = null;
			String EMAIL = null;
			Date PO_DATE = null;
			Date REQUIRED_DATE = null;
			String LS_PRODUCT_ID = null;
			Double UNIT_PRICE = null;
			Double QUANTITY = null;
			String PRODUCT_DESC = null;
			String LS_ORDER_ID = null;
			
			USER_ID = ufrDTO.getUserId();
			ufDataDTO.setUserId(USER_ID);
			
			//String dataExtracted = null;
			int startFromIndex = 0;
			
			//Product Order Number
			try {
				if(getFieldValue(UFR_PO_NUMBER, listFromPDF, "Product Order Number", startFromIndex)!=null) {
					PO_NUMBER = getFieldValue(UFR_PO_NUMBER, listFromPDF, "Product Order Number", startFromIndex);
					ufDataDTO.setProductOrderNumber(PO_NUMBER);
				}
			} catch(Exception e) {
				ufDataDTO.setProductOrderNumber(null);
				System.out.println("***** Error when mapping <Product_Order_Number> *****");
				//e.printStackTrace();
			}
			//First Name
			try {
				if(getFieldValue(UFR_FIRST_NAME, listFromPDF, "First Name", startFromIndex)!=null) {
					FIRST_NAME = getFieldValue(UFR_FIRST_NAME, listFromPDF, "First Name", startFromIndex);
					ufDataDTO.setClientFirstName(FIRST_NAME);
				}
			} catch (Exception e) {
				ufDataDTO.setClientFirstName(null);
				System.out.println("***** Error when mapping <First_Name> *****");
				//e.printStackTrace();
			}
			//Last Name
			try {
				if(getFieldValue(UFR_LAST_NAME, listFromPDF, "Last Name", startFromIndex)!=null) {
					LAST_NAME = getFieldValue(UFR_LAST_NAME, listFromPDF, "Last Name", startFromIndex);
					ufDataDTO.setClientLastName(LAST_NAME);
				}
			} catch (Exception e) {
				ufDataDTO.setClientLastName(null);
				System.out.println("***** Error when mapping <Last_Name> *****");
				//e.printStackTrace();
			}
			//Postal Code
			try {
				if(getFieldValue(UFR_POSTAL_CODE, listFromPDF, "Postal Code", startFromIndex)!=null) {
					POSTAL_CODE = getFieldValue(UFR_POSTAL_CODE, listFromPDF, "Postal Code", startFromIndex);
					POSTAL_CODE = POSTAL_CODE.replaceAll(" ", "");
					if(POSTAL_CODE.length()==3) {
						//if Postal Code has only 3 characters instead of 6
						Integer indexDataLine		= Integer.parseInt(UFR_POSTAL_CODE.get(0));
						char startsEndsOrContains	= UFR_POSTAL_CODE.get(1).charAt(0);
						String landmarkText			= UFR_POSTAL_CODE.get(2);

						indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
						if(indexDataLine!=null) {
							String LineToModifyInList = listFromPDF.get(indexDataLine);
							LineToModifyInList = removeUnusedSpaces(LineToModifyInList);
							String tabSplit[] = LineToModifyInList.split(" ");
							LineToModifyInList = "";
							for(int i=0; i<tabSplit.length-1; i++) LineToModifyInList = LineToModifyInList + " " + tabSplit[i];
							LineToModifyInList = LineToModifyInList + tabSplit[tabSplit.length-1];
							LineToModifyInList = removeUnusedSpaces(LineToModifyInList);
							//Modify the line where Postal Code Length is 3
							listFromPDF.set(indexDataLine, LineToModifyInList);
							POSTAL_CODE = getFieldValue(UFR_POSTAL_CODE, listFromPDF, "Postal Code", startFromIndex);
						}
					}
					ufDataDTO.setClientPostalCode(POSTAL_CODE);
				}
			} catch (Exception e) {
				ufDataDTO.setClientPostalCode(null);
				System.out.println("***** Error when mapping <Postal_Code> *****");
				//e.printStackTrace();
			}
			//Province
			try {
				if(getFieldValue(UFR_PROVINCE, listFromPDF, "Province", startFromIndex)!=null) {
					PROVINCE = getFieldValue(UFR_PROVINCE, listFromPDF, "Province", startFromIndex);
					//Check Province
					if(PROVINCE.length()>2) {
						List<ProvinceDTO> listProvinces ;
						listProvinces = productService.getAllProvinces();
						for(ProvinceDTO provinceDTO : listProvinces) {
							if(provinceDTO.getName().toLowerCase().equals(PROVINCE.toLowerCase())) {
								PROVINCE = provinceDTO.getCode();
							}
						}
						if(PROVINCE.length()>2) PROVINCE = null;
					}
					ufDataDTO.setClientProvince(PROVINCE);
				}
			} catch (Exception e) {
				ufDataDTO.setClientProvince(null);
				System.out.println("***** Error when mapping <Province> *****");
				//e.printStackTrace();
			}
			//City
			try {
				if(getFieldValue(UFR_CITY, listFromPDF, "City", startFromIndex)!=null) {
					CITY = getFieldValue(UFR_CITY, listFromPDF, "City", startFromIndex);
					ufDataDTO.setClientCity(CITY);
				}
			} catch (Exception e) {
				ufDataDTO.setClientCity(null);
				System.out.println("***** Error when mapping <City> *****");
				//e.printStackTrace();
			}
			//Street
			try {
				if(getFieldValue(UFR_STREET, listFromPDF, "Street", startFromIndex)!=null) {
					STREET = getFieldValue(UFR_STREET, listFromPDF, "Street", startFromIndex);
					ufDataDTO.setClientStreet(STREET);
				}
			} catch (Exception e) {
				ufDataDTO.setClientStreet(null);
				System.out.println("***** Error when mapping <Street> *****");
				//e.printStackTrace();
			}
			//Phone
			try {
				if(getFieldValue(UFR_PHONE, listFromPDF, "Phone", startFromIndex)!=null) {
					PHONE = getFieldValue(UFR_PHONE, listFromPDF, "Phone", startFromIndex);
					ufDataDTO.setClientPhone(PHONE);
				}
			} catch (Exception e) {
				ufDataDTO.setClientPhone(null);
				System.out.println("***** Error when mapping <Phone> *****");
				//e.printStackTrace();
			}
			//Email
			try {
				if(getFieldValue(UFR_EMAIL, listFromPDF, "Email", startFromIndex)!=null) {
					EMAIL = getFieldValue(UFR_EMAIL, listFromPDF, "Email", startFromIndex);
					ufDataDTO.setClientEmail(EMAIL);
				}
			} catch (Exception e) {
				ufDataDTO.setClientEmail(null);
				System.out.println("***** Error when mapping <Email> *****");
				//e.printStackTrace();
			}
			//Product Order Date
			try {
				if(getFieldValue(UFR_PO_DATE, listFromPDF, "Product Order Date", startFromIndex)!=null) {
					String strPO_DATE = getFieldValue(UFR_PO_DATE, listFromPDF, "Product Order Date", startFromIndex);
					SimpleDateFormat frm = new SimpleDateFormat(formatDate);
					PO_DATE = frm.parse(strPO_DATE);
					ufDataDTO.setProductOrderDate(PO_DATE);
				}
			} catch (Exception e) {
				ufDataDTO.setProductOrderDate(null);
				System.out.println("***** Error when mapping <Product_Order_Date> *****");
				//e.printStackTrace();
			}
			//Required Date
			try {
				if(getFieldValue(UFR_REQUIRED_DATE, listFromPDF, "Required Date", startFromIndex)!=null) {
					String strREQUIRED_DATE = getFieldValue(UFR_REQUIRED_DATE, listFromPDF, "Required Date", startFromIndex);
					/*
					String str = "";
					if(strREQUIRED_DATE.length()==9) {
						str = strREQUIRED_DATE.substring(0,7)+"20"+strREQUIRED_DATE.substring(7, 9);
						strREQUIRED_DATE = str; 
					}
					*/
					SimpleDateFormat frm = new SimpleDateFormat(formatDate);
					REQUIRED_DATE = frm.parse(strREQUIRED_DATE);
					ufDataDTO.setRequiredDate(REQUIRED_DATE);
				}
			} catch (Exception e) {
				ufDataDTO.setRequiredDate(null);
				System.out.println("***** Error when mapping <Required_Date> *****");
				e.printStackTrace();
			}

			Integer lsPOIdIndexDataLine = null;
			char lsPOIdStartsEndsOrContains = '0';	//initialize by 0, because 0 does not exist
			String lsPOIdLandmarkText = null;
			int startFromIndexLsPOId = 0;
			
			Integer poDescIndexDataLine = null;
			char poDescStartsEndsOrContains = '0';
			String poDescLandmarkText = null;
			int startFromIndexPoDesc = 0;

			Integer qtyIndexDataLine =null;
			char qtyStartsEndsOrContains = '0';
			String qtyLandmarkText =null;
			int startFromIndexQty = 0;
			
			Integer unitPriceIndexDataLine =null;
			char unitPriceStartsEndsOrContains = '0';
			String unitPriceLandmarkText = null;
			int startFromIndexunitPrice = 0;
			
			Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
			boolean isFilterCahngedWhenSizeIs12 = false;
			boolean isThereLsProductId = true;
			while(isThereLsProductId) {
				//Ls_Product_Id
				try {
					if(getFieldValue(UFR_LS_PRODUCT_ID, listFromPDF, "Ls_Product_Id", startFromIndex)!=null) {
						LS_PRODUCT_ID = getFieldValue(UFR_LS_PRODUCT_ID, listFromPDF, "Ls_Product_Id", startFromIndexLsPOId);
						ufDataDTO.setLsProductID(LS_PRODUCT_ID);
					}
				} catch (Exception e) {
					ufDataDTO.setLsProductID(null);
					System.out.println("***** Error when mapping <LS_Product_Id> *****");
					//e.printStackTrace();
				}
				
				//Product_Description
				if(startFromIndexPoDesc != -1) {
					try {
						if(getFieldValue(UFR_PRODUCT_DESC, listFromPDF, "Product Description", startFromIndexPoDesc)!=null) {
							PRODUCT_DESC = getFieldValue(UFR_PRODUCT_DESC, listFromPDF, "Product Description", startFromIndexPoDesc);
							ufDataDTO.setProductDescription(PRODUCT_DESC);
						}
					} catch (Exception e) {
						ufDataDTO.setProductDescription(null);
						System.out.println("***** Error when mapping <Product_Description> *****");
						//e.printStackTrace();
					}
				} else System.out.println("Error when trying to map <Product_Description> another time");
				//Quantity
				if(startFromIndexQty != -1) {
					try {
						if(getFieldValue(UFR_QUANTITY, listFromPDF, "Quantity", startFromIndexQty)!=null) {
							String strQUANTITY = getFieldValue(UFR_QUANTITY, listFromPDF, "Quantity", startFromIndexQty);
							QUANTITY   = Double.parseDouble(strQUANTITY);
							ufDataDTO.setQuantity(QUANTITY  );
						}
					} catch (Exception e) {
						ufDataDTO.setQuantity(null);
						System.out.println("***** Error when mapping <Quantity> *****");
						//e.printStackTrace();
					}
				} else System.out.println("Error when trying to map <Product_Description> another time");
				//Unit Price
				if(startFromIndexunitPrice != -1) {
					try {
						if(getFieldValue(UFR_UNIT_PRICE, listFromPDF, "Unit Price", startFromIndexunitPrice)!=null) {
							String strUNIT_PRICE = getFieldValue(UFR_UNIT_PRICE, listFromPDF, "Unit Price", startFromIndexunitPrice)
													.replaceAll("\\$", "").replaceAll(",", "");
							UNIT_PRICE = Double.parseDouble(strUNIT_PRICE);
							ufDataDTO.setUnitPrice(UNIT_PRICE);
						}
					} catch (Exception e) {
						ufDataDTO.setUnitPrice(null);
						System.out.println("***** Error when mapping <Unit_Price> *****");
						//e.printStackTrace();
					}
				} else System.out.println("Error when trying to map <Unit_Price> another time");

				//Generate a new LS_ORDERR_ID
				try {
					LS_ORDER_ID = null;
					String code = userLogin.substring(0, 2).toUpperCase();
					String lsOrderIdParent = PO_NUMBER;
					
					int inc = 0;//increment
					lsOrderIdParent = lsOrderIdParent.replaceFirst("-", "").replaceFirst("_", "")
													 .replaceFirst("R", "").replaceAll(" ", "");
					if(lsOrderIdParent.length()>14) {
						int index = lsOrderIdParent.length()-14;
						lsOrderIdParent = lsOrderIdParent.substring(index, lsOrderIdParent.length());
					}
					LS_ORDER_ID = code+"O"+USER_ID+lsOrderIdParent;
					while(isLsOrderIdUsed(LS_ORDER_ID) || lsOrdersIdHash.containsKey(LS_ORDER_ID)){
						inc++; 
						LS_ORDER_ID=code+"O"+USER_ID+lsOrderIdParent+"R"+inc;
					}
					//while(isLsOrderIdUsed(lsOrderIdToGenerate) || lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
					/*
					while(isLsOrderIdUsed(LS_ORDER_ID)){
						inc++; 
						LS_ORDER_ID = code+"O"+ufDataDTO.getUserId()+lsOrderIdParent+"R"+inc;
					}
					*/
					lsOrdersIdHash.put(LS_ORDER_ID, LS_ORDER_ID);
					
					ufDataDTO.setLsOrderId(LS_ORDER_ID);
				} catch (Exception e) {
					ufDataDTO.setLsOrderId(null);
					System.out.println("***** Error when generating <LS_Order_Id> *****");
					//e.printStackTrace();
				}

				//Creation_Date
				ufDataDTO.setCreationDate(new Date());
				
				//add the ufDataDTO in the list of orders
				if(ufDataDTO.getProductOrderNumber()!=null && !ufDataDTO.getProductOrderNumber().equals("")) {
					listOrdersDTO.add(ufDataDTO);
				}
				
				//--------- Check if there are more than one product in the PDF file
				try {
					Integer index = Integer.parseInt(UFR_LS_PRODUCT_ID.get(0));
					lsPOIdIndexDataLine			= index;
					lsPOIdStartsEndsOrContains	= UFR_LS_PRODUCT_ID.get(1).charAt(0);
					lsPOIdLandmarkText			= UFR_LS_PRODUCT_ID.get(2);
					lsPOIdIndexDataLine = getIndexLandmarkTextInList(listFromPDF, lsPOIdIndexDataLine, lsPOIdStartsEndsOrContains, lsPOIdLandmarkText, startFromIndexLsPOId);
					if(lsPOIdIndexDataLine!=null) 
						if(index >=0) startFromIndexLsPOId = lsPOIdIndexDataLine + index + 1;
						else startFromIndexLsPOId = lsPOIdIndexDataLine + 1;
				} catch (Exception e) {
					lsPOIdIndexDataLine = null;
				}
				
				try {
					poDescIndexDataLine			= Integer.parseInt(UFR_PRODUCT_DESC.get(0));
					poDescStartsEndsOrContains	= UFR_PRODUCT_DESC.get(1).charAt(0);
					poDescLandmarkText			= UFR_PRODUCT_DESC.get(2);
					poDescIndexDataLine = getIndexLandmarkTextInList(listFromPDF, poDescIndexDataLine, poDescStartsEndsOrContains, poDescLandmarkText, startFromIndexPoDesc);
					if(poDescIndexDataLine!=null) startFromIndexPoDesc = poDescIndexDataLine + 1;
				} catch (Exception e) {
					startFromIndexPoDesc = listFromPDF.size();;
				}
				
				try {
					qtyIndexDataLine		= Integer.parseInt(UFR_QUANTITY.get(0));
					qtyStartsEndsOrContains	= UFR_QUANTITY.get(1).charAt(0);
					qtyLandmarkText			= UFR_QUANTITY.get(2);
					qtyIndexDataLine = getIndexLandmarkTextInList(listFromPDF, qtyIndexDataLine, qtyStartsEndsOrContains, qtyLandmarkText, startFromIndexQty);
					if(qtyIndexDataLine!=null) startFromIndexQty = qtyIndexDataLine + 1;
				} catch (Exception e) {
					startFromIndexQty = listFromPDF.size();
				}
				
				try {
					unitPriceIndexDataLine			= Integer.parseInt(UFR_UNIT_PRICE.get(0));
					unitPriceStartsEndsOrContains	= UFR_UNIT_PRICE.get(1).charAt(0);
					unitPriceLandmarkText			= UFR_UNIT_PRICE.get(2);
					unitPriceIndexDataLine = getIndexLandmarkTextInList(listFromPDF, unitPriceIndexDataLine, unitPriceStartsEndsOrContains, unitPriceLandmarkText, startFromIndexunitPrice);
					if(unitPriceIndexDataLine!=null) startFromIndexunitPrice = unitPriceIndexDataLine + 1;
				} catch (Exception e) {
					startFromIndexunitPrice = listFromPDF.size();
				}
				
				isThereLsProductId = false;		//To stop the while loop
				
				//if the PDF Order File supposed containing more than one Product
				if(UFR_LS_PRODUCT_ID.size()==12) {
					try {
						if(lsPOIdIndexDataLine!=null) {
							//replace the 6 first filters by the 6 last ones
							if(!isFilterCahngedWhenSizeIs12) {
								isFilterCahngedWhenSizeIs12 = true;
								for(int i=0; i<6; i++) UFR_LS_PRODUCT_ID.set(i, UFR_LS_PRODUCT_ID.get(i+6));
								try {	for(int i=0; i<6; i++) UFR_PRODUCT_DESC.set(i, UFR_PRODUCT_DESC.get(i+6));}
									catch(Exception e) { startFromIndexPoDesc = -1; }
								try {	for(int i=0; i<6; i++) UFR_QUANTITY.set(i, UFR_QUANTITY.get(i+6));}
									catch(Exception e) { startFromIndexQty = -1; }
								try {	for(int i=0; i<6; i++) UFR_UNIT_PRICE.set(i, UFR_UNIT_PRICE.get(i+6));}
									catch(Exception e) { startFromIndexunitPrice = -1; }
							}
							try {
								lsPOIdIndexDataLine			= Integer.parseInt(UFR_LS_PRODUCT_ID.get(0));
								lsPOIdStartsEndsOrContains	= UFR_LS_PRODUCT_ID.get(1).charAt(0);
								lsPOIdLandmarkText			= UFR_LS_PRODUCT_ID.get(2);
								lsPOIdIndexDataLine = getIndexDataInList(listFromPDF, lsPOIdIndexDataLine, lsPOIdStartsEndsOrContains, lsPOIdLandmarkText, startFromIndexLsPOId);
								if(lsPOIdIndexDataLine!=null) {
									isThereLsProductId = true;	//To return to the while loop
									ufDataDTO = new UserFileDataRecoveryDTO();
									if(USER_ID!=null)		ufDataDTO.setUserId(USER_ID);
									if(PO_NUMBER!=null)		ufDataDTO.setProductOrderNumber(PO_NUMBER);
									if(FIRST_NAME!=null)	ufDataDTO.setClientFirstName(FIRST_NAME);
									if(LAST_NAME!=null)		ufDataDTO.setClientLastName(LAST_NAME);
									if(POSTAL_CODE!=null)	ufDataDTO.setClientPostalCode(POSTAL_CODE);
									if(PROVINCE!=null)		ufDataDTO.setClientProvince(PROVINCE);
									if(CITY!=null)			ufDataDTO.setClientCity(CITY);
									if(STREET!=null)		ufDataDTO.setClientStreet(STREET);
									if(PHONE!=null)			ufDataDTO.setClientPhone(PHONE);
									if(EMAIL!=null)			ufDataDTO.setClientEmail(EMAIL);
									if(PO_DATE!=null)		ufDataDTO.setProductOrderDate(PO_DATE);
									if(REQUIRED_DATE!=null)	ufDataDTO.setRequiredDate(REQUIRED_DATE);
								}
							} catch(Exception e) {
								isThereLsProductId = false;
								lsPOIdIndexDataLine = null;
							}
						}
					} catch(Exception e) {
						isThereLsProductId = false;
					}
				}
			}
		}	//End if(listGotFromPDF!=null && ...)
		
		return listOrdersDTO;
	}
	
	/**----------------------------------------------------------
	 * getFilterList * gets a list of filters for one field 
	 * the filters are separated by pipes in the user_file_recovery table
	  -----------------------------------------------------------*/	
	public List<String> getFilterList(String line) throws Exception {
		List<String> result = null;
		try {
			if(line!=null) {
				String tabLine[] = line.split("\\|");
				int size = tabLine.length;
				if(result==null) result = new ArrayList<String>();
				
				for(int i=0; i<tabLine.length; i++) {
					result.add(tabLine[i]);
				}
			}
			
			if(result!=null && result.size()==1) {
				String str = result.get(0);
				str = removeUnusedSpaces(str);
				if(str.equals("")) result = null;
			}
			//if(result!=null && result.size()==1 && removeUnusedSpaces(result.get(0)).equals("")) result=null;
		} catch (Exception e) {
			System.out.println("=== Error when getting List from one UFR line");
			return result;
		}
		return result;
	}
	
	/**----------------------------------------------------------
	 * getIndexDataInList * gets the First Index in the List extracted form PDF 
	 * 						for the occurrence of the 3rd filter text depending on the 2n filter (s/e/c/m)
	  -----------------------------------------------------------*/	
	public Integer getIndexDataInList(List<String> listFromPDF, Integer landmarkIndex, 
			char startsEndsOrContains, String landmarkText, int startFromIndex) throws Exception {
		if(landmarkIndex==null || listFromPDF==null) return null;

		Integer result = null;
		try {
			int i = startFromIndex;
			while(i < listFromPDF.size()) {
				switch(startsEndsOrContains) {
					case 's' :	//Starts with
						if(listFromPDF.get(i).startsWith(landmarkText)) {
							result = i + landmarkIndex;
							i = listFromPDF.size();
						}
						break;
					
					case 'e' :	//Ends with
						if(listFromPDF.get(i).endsWith(landmarkText)) {
							result = i + landmarkIndex;
							i = listFromPDF.size();
						}
						break;
					case 'c' :	//Contains
						if(listFromPDF.get(i).contains(landmarkText)) {
							result = i + landmarkIndex;
							i = listFromPDF.size();
						}
						break;
					case 'm' :	//Matches
						if(listFromPDF.get(i).matches(landmarkText)) {
							result = i + landmarkIndex;
							i = listFromPDF.size();
						}
						break;
				}	//End switch
				i++;
			}	//End for
		} catch(Exception e) {
			result = null;
			System.out.println("+++ Error when getting Index of Data from List");
			//e.printStackTrace();
		}
		return result;
	}
	
	/**----------------------------------------------------------
	 * getIndexLandmarkTextInList * gets the First Index in the List extracted form PDF 
	 * 						for the occurrence of the 3rd filter text depending on the 2nd filter (s/e/c/m)
	  -----------------------------------------------------------*/	
	public Integer getIndexLandmarkTextInList(List<String> listFromPDF, Integer landmarkIndex, 
			char startsEndsOrContains, String landmarkText, int startFromIndex) throws Exception {
		if(landmarkIndex==null || listFromPDF==null) return null;

		Integer result = null;
		try {
			int i = startFromIndex;
			while(i < listFromPDF.size()) {
				switch(startsEndsOrContains) {
					case 's' :	//Starts with
						if(listFromPDF.get(i).startsWith(landmarkText)) {
							result = i;
							i = listFromPDF.size();
						}
						break;
					
					case 'e' :	//Ends with
						if(listFromPDF.get(i).endsWith(landmarkText)) {
							result = i;
							i = listFromPDF.size();
						}
						break;
					case 'c' :	//Contains
						if(listFromPDF.get(i).contains(landmarkText)) {
							result = i;
							i = listFromPDF.size();
						}
						break;
					case 'm' :	//Matches
						if(listFromPDF.get(i).matches(landmarkText)) {
							result = i;
							i = listFromPDF.size();
						}
						break;
				}	//End switch
				i++;
			}	//End for
		} catch(Exception e) {
			result = null;
			System.out.println("+++ Error when getting Index of Data from List");
			//e.printStackTrace();
		}
		return result;
	}

	/**----------------------------------------------------------
	 * getFieldValue * gets the field value depending on the size of the UserFileRecovery oneFiledList
	  -----------------------------------------------------------*/
	public String getFieldValue(List<String> oneFieldList, List<String> listFromPDF, String fieldName, int startFromIndex) throws Exception {
		String result = null;

		if(oneFieldList!=null) {
			switch(oneFieldList.size()) {
			case 1:	//line No. 
				try {
					//if the filter equals None, do not do anything
					//else do the treatment above
					if(!oneFieldList.get(0).toLowerCase().equals("none")) {
						int indexDataLine = Integer.parseInt(oneFieldList.get(0));
						result = removeUnusedSpaces(listFromPDF.get(indexDataLine));
					}
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 2:	//line No. | col No.	(Split by space)
				try {
					int indexDataLine	= Integer.parseInt(oneFieldList.get(0));
					int indexDataColumn	= Integer.parseInt(oneFieldList.get(1));
					String str = listFromPDF.get(indexDataLine);
					str = removeUnusedSpaces(str);
					result = removeUnusedSpaces(str).split(" ")[indexDataColumn];
					//result = removeUnusedSpaces(listFromPDF.get(indexDataLine)).split(" ")[indexDataColumn];
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 3:	//nbre of lines before/after | the line starting/ending/containing | String_1 
				try {
					Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
					char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
					String landmarkText			= oneFieldList.get(2);
					indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
					if(indexDataLine!=null) {
						result = removeUnusedSpaces(listFromPDF.get(indexDataLine));
					}
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 4:	//nbre of lines before/after | the line starting/ending/containing | String_1 | but remove String_2
				try {
					Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
					char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
					String landmarkText			= oneFieldList.get(2);
					String textToDelete			= oneFieldList.get(3);
					indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
					if(indexDataLine!=null) {
						String str = listFromPDF.get(indexDataLine);
						str = removeUnusedSpaces(str);
						result = removeUnusedSpaces(str.replaceAll(textToDelete, ""));
					}
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 6:	//nbre of lines before/after | the line starting/ending/containing | String_1 | but remove String_2
					//	|split by String_3 | take data of this index
				try {
					Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
					char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
					String landmarkText			= oneFieldList.get(2);
					String textToDelete			= oneFieldList.get(3);
					String splitBy				= oneFieldList.get(4);
					Integer indexOfSplit		= Integer.parseInt(oneFieldList.get(5));
					
					indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
					if(indexDataLine!=null) {
						result = listFromPDF.get(indexDataLine).replaceAll(textToDelete, "");
						result = removeUnusedSpaces(result);
						String tabSplit[] = result.split(splitBy);
						if(indexOfSplit >= 0) {
							result = tabSplit[indexOfSplit];
						} else {
							result = tabSplit[tabSplit.length + indexOfSplit];
						}
					}
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 7:	//nbre of lines before/after | the line starting/ending/containing | String_1 | but remove String_2
					//	|split by String_3 | take data from index_1 | to index_2
				try {
					Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
					char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
					String landmarkText			= oneFieldList.get(2);
					String textToDelete			= oneFieldList.get(3);
					String splitBy				= oneFieldList.get(4);
					Integer indexOfSplitFrom	= Integer.parseInt(oneFieldList.get(5));
					Integer indexOfSplitTo		= Integer.parseInt(oneFieldList.get(6));
					
					indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
					if(indexDataLine!=null) {
						String str = listFromPDF.get(indexDataLine).replaceAll(textToDelete, "");
						result = removeUnusedSpaces(str);
						//result = removeUnusedSpaces(listFromPDF.get(indexDataLine)).replaceAll(textToDelete, "");
						String tabSplit[] = result.split(splitBy);
						
						result = "";
						if(indexOfSplitFrom >= 0) {
							if(indexOfSplitTo >= 0) {
								for(int i=indexOfSplitFrom; i<=indexOfSplitTo; i++)
									result = result + tabSplit[i]+" ";
							} else {
								for(int i=indexOfSplitFrom; i<=tabSplit.length+indexOfSplitTo; i++)
									result = result + tabSplit[i]+" ";
							}
						} else {
							if(indexOfSplitTo >= 0) {
								for(int i=tabSplit.length+indexOfSplitFrom; i<=indexOfSplitTo; i++)
									result = result + tabSplit[i]+" ";
							} else {
								for(int i=tabSplit.length+indexOfSplitFrom; i<=tabSplit.length+indexOfSplitTo; i++)
									result = result + tabSplit[i]+" ";
							}
						}
						result = removeUnusedSpaces(result);
					}
				} catch(Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;

			case 8:	//nbre of lines before/after | the line starting/ending/containing | String_1 | but remove String_2
					//	|then split by String_3 | and take data of index_1 | then split by String_4 | and take data of index_2
				try {
					Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
					char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
					String landmarkText			= oneFieldList.get(2);
					String textToDelete			= oneFieldList.get(3);
					String splitBy_1			= oneFieldList.get(4);
					Integer indexOfSplit_1		= Integer.parseInt(oneFieldList.get(5));
					String splitBy_2			= oneFieldList.get(6);
					Integer indexOfSplit_2		= Integer.parseInt(oneFieldList.get(7));
					
					indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
					if(indexDataLine!=null) {
						result = listFromPDF.get(indexDataLine).replaceAll(textToDelete, "");
						result = removeUnusedSpaces(result);
						//result = removeUnusedSpaces(listFromPDF.get(indexDataLine)).replaceAll(textToDelete, "");
						String tabSplit_1[] = result.split(splitBy_1);
						
						result = (indexOfSplit_1 >= 0) ? tabSplit_1[indexOfSplit_1] : tabSplit_1[tabSplit_1.length + indexOfSplit_1];
						result = removeUnusedSpaces(result);
						String tabSplit_2[] = result.split(splitBy_2);
						result = (indexOfSplit_2 >= 0) ? tabSplit_2[indexOfSplit_2] : tabSplit_2[tabSplit_2.length + indexOfSplit_2];
						
						result = removeUnusedSpaces(result);
					}
				} catch (Exception e) {
					result = null;
					System.out.println("--- Error when getting value from : " + fieldName);
					//e.printStackTrace();
				}
				break;
			
			case 12:	//nbre of lines before/after | the line starting/ending/containing | String_1 | but remove String_2
				//	|split by String_3 | take data of this index | "" | "" | +
			try {
				Integer indexDataLine		= Integer.parseInt(oneFieldList.get(0));
				char startsEndsOrContains	= oneFieldList.get(1).charAt(0);
				String landmarkText			= oneFieldList.get(2);
				String textToDelete			= oneFieldList.get(3);
				String splitBy				= oneFieldList.get(4);
				Integer indexOfSplit		= Integer.parseInt(oneFieldList.get(5));
				
				indexDataLine = getIndexDataInList(listFromPDF, indexDataLine, startsEndsOrContains, landmarkText, startFromIndex);
				if(indexDataLine!=null) {
					result = listFromPDF.get(indexDataLine).replaceAll(textToDelete, "");
					result = removeUnusedSpaces(result);
					//result = removeUnusedSpaces(listFromPDF.get(indexDataLine)).replaceAll(textToDelete, "");
					String tabSplit[] = result.split(splitBy);
					if(indexOfSplit >= 0) {
						result = tabSplit[indexOfSplit];
					} else {
						result = tabSplit[tabSplit.length + indexOfSplit];
					}
				}
			} catch(Exception e) {
				result = null;
				System.out.println("--- Error when getting value from one field having size : 12");
				//e.printStackTrace();
			}
			break;
			
			default:
				break;
			}
		}
		return result;
	}
	
	/**----------------------------------------------------------
	 * removeUnusedSpaces *
	 * removes left, right and duplicate white spaces
	  -----------------------------------------------------------*/
	public String removeUnusedSpaces(String srtValue) {
		String result = srtValue.replaceAll("^\\s+", "").replaceAll("^\\t+", "")	//Remove Left  Spaces and Tabs
								.replaceAll("\\s+$", "").replaceAll("\\t+$", "")	//Remove Right Spaces and Tabs
								.replaceAll("\\s+", " ");							//Remove duplicate Spaces
		return result;
	}
	
	/* =============================END PDF Parsing Functions ==============================*/


	/**----------------------------------------------------------
	 *Get ETA Orders List* (ufr.getEtaFieldName(),user.getId(),filePathData)
	  -----------------------------------------------------------*/
	@Override
	public List<OrdersDTO> getEtaOrdersList(String etaFieldName,String secondEtaFieldName,Long userId,String destEtaOrderXLSFile)throws Exception{
		String errorReport="";
		//variable indicating the numbers of columns in the XLS file
		int ROW_TO_START = 0;
		final int COL_ETA_FIELD=1;
		final int COL_ETA_2D_FIELD=2;
		String  ETA_FIELD="";
		String ETA_2D_FIELD="";
		//Cells
		Cell cellETA_FIELD= null;
		Cell cellETA_2D_FIELD=null;
		
		Workbook existingWorkbook = Workbook.getWorkbook(new File(destEtaOrderXLSFile+"etaOrders.xls"));
		Sheet sheetToRead=existingWorkbook.getSheet(0);
		int ROW_MAX = sheetToRead.getRows();
		List<OrdersDTO> orderList = new ArrayList<OrdersDTO>() ;
		List<OrdersDTO> etaFieldNameOrderlist =null;
		OrdersDTO orderDTO;
		ProductDTO pDTO;
		try {
			productService = serviceLocator.getProductService(); 
		} catch (ServiceLocatorException e) {
			e.printStackTrace();
		}
		for(int row=ROW_TO_START; row< ROW_MAX;row++) {
			//--------------- 1: PO
			cellETA_FIELD = sheetToRead.getCell(COL_ETA_FIELD-1, row);			
			if(cellETA_FIELD!=null)ETA_FIELD = cellETA_FIELD.getContents();
			if(ETA_FIELD==null || ETA_FIELD.equals("")){
				errorReport+=" "+(row+1)+" ,PO:"+ETA_FIELD+" ,|---->dosen't exist \n";
			}else{
				int index=ETA_FIELD.indexOf("/");
				if(index>0)ETA_FIELD=ETA_FIELD.substring(0, index);
			}
			
			//--------------- 2: COL_ETA_2D_FIELD
			ETA_2D_FIELD="";
			if(secondEtaFieldName!=null && !secondEtaFieldName.equals("")){
				cellETA_2D_FIELD = sheetToRead.getCell(COL_ETA_2D_FIELD-1, row);			
				if(cellETA_2D_FIELD!=null)ETA_2D_FIELD = cellETA_2D_FIELD.getContents();
			}
			
			orderDTO = new OrdersDTO();
			orderDTO.setEtaFieldName(etaFieldName);
			orderDTO.setSecondEtaFieldName(secondEtaFieldName);
			orderDTO.setUserId(userId);
			orderDTO.setEtaFieldValue(ETA_FIELD);
			orderDTO.setSecondEtaFieldValue(ETA_2D_FIELD);
			etaFieldNameOrderlist=getEtaOrderlistByFieldName(orderDTO);
			int size=etaFieldNameOrderlist.size();
			if(size>0){
				for(int i=0;i<size;i++ ){
					etaFieldNameOrderlist.get(i).setNotation(size+"");
				}
			}else{
				etaFieldNameOrderlist=new ArrayList<OrdersDTO>();
				etaFieldNameOrderlist.add(orderDTO);
			}
			orderList.addAll(etaFieldNameOrderlist);
		}
		return orderList;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> getEtaOrderlistByFieldName(OrdersDTO orderDTO) throws ServiceException {
		List<Orders> result = null;
		final Orders order=new Orders();
		order.setUserId(orderDTO.getUserId());
		order.setEtaFieldName(orderDTO.getEtaFieldName());
		order.setEtaFieldValue(orderDTO.getEtaFieldValue());
		order.setSecondEtaFieldName(orderDTO.getSecondEtaFieldName());
		order.setSecondEtaFieldValue(orderDTO.getSecondEtaFieldValue());
		order.setLsProductID(orderDTO.getLsProductID());
		try{
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().getEtaOrderlistByFieldName(order);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(result);
	}

	@Override
	public boolean updateEtaFieldName(final String userLogin ,final String etaFieldName) throws ServiceException {
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateEtaFieldName(userLogin ,etaFieldName);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	

	@Override
	public boolean updateSecondEtaFieldName(final String userLogin ,final String secondEtaFieldName) throws ServiceException {
		boolean result=false;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().updateSecondEtaFieldName(userLogin ,secondEtaFieldName);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param lsOrderId
	 * @return
	 */
	@Override
	public boolean	isThisLsOrderIdInUsed(final String lsOrderId)throws Exception{
		
		boolean result=true;
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOrdersDao().isThisLsOrderIdInUsed(lsOrderId);
				}
			});
		}catch (Exception de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<OrdersDTO> getOrdersByProductOrderNumberSumit(OrdersDTO orderDTO) throws ServiceException {
		List<Orders> result = null;
		final Orders order = new Orders();

		order.setProductOrderNumber(orderDTO.getProductOrderNumber());
		
		try {
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager
					.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(DaoManager daoManager)
								throws DaoException {
							return daoManager.getOrdersDao().getOrdersByProductOrderNumberSumit(order);
						}
					});
		} catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return DTOFactory.getListOrderDTOFromListOrder(result);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersDTO> searchOrdersWithOptionsAndSortingNew(
			final Date creationDateStart, final Date creationDateEnd,
			final Integer factorDateBetween, final String userLogin,
			final String lsOrderId, final String status,
			final List<Integer> listIndexColumn,
			final Integer PAGE_ITEMS_COUNT, final Integer indexSet,
			final String productOrderNumberSearch,
			final String clientOrderNumber, final String clientOther) {
		List<Orders> result = null;
		try {
			daoManager.setCommitTransaction(true);
			result = (List<Orders>) daoManager
					.executeAndHandle(new DaoCommand() {
						@Override
						public Object execute(DaoManager daoManager) throws DaoException {
							return daoManager.getOrdersDao().searchOrdersWithOptionsAndSortingNew(
											creationDateStart, creationDateEnd,
											factorDateBetween, userLogin,
											lsOrderId, status, listIndexColumn,
											PAGE_ITEMS_COUNT, indexSet,
											productOrderNumberSearch,
											clientOrderNumber, clientOther);
						}
					});
		} catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		List<ProvinceDTO> listProvinces;
		Hashtable<String, ProvinceDTO> hashProvinces = new Hashtable<String, ProvinceDTO>();
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			listProvinces = productService.getAllProvinces();
			for (ProvinceDTO provinceDTO : listProvinces) {
				hashProvinces.put(provinceDTO.getCode(), provinceDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result != null) {
			for (Orders order : result) {
				if (order.getCurrencyId() != null
						&& order.getCurrencyRate() != null) {
					if (order.getLsPrice() != null) {
						Double currencyPrice = order.getLsPrice()
								* order.getCurrencyRate();
						currencyPrice = (double) Math
								.round(currencyPrice * 100) / 100;
						order.setCurrencyPrice(currencyPrice);
					}
					if (order.getUnitPrice() != null) {
						Double currencyUnitPrice = order.getUnitPrice()
								* order.getCurrencyRate();
						currencyUnitPrice = (double) Math
								.round(currencyUnitPrice * 100) / 100;
						order.setCurrencyUnitPrice(currencyUnitPrice);
					}
					/*
					 * if(order.getShippingPrice()!=null) { Double
					 * currencyShippingPrice =
					 * order.getShippingPrice()*order.getCurrencyRate();
					 * currencyShippingPrice = (double)
					 * Math.round(currencyShippingPrice*100) / 100;
					 * order.setCurrencyShippingPrice(currencyShippingPrice); }
					 */
				}
			}
		}

		return DTOFactory.getListOrderDTOFromListOrderSorted(result,
				hashProvinces);
	}
	
}
