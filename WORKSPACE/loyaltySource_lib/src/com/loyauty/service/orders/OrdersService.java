package com.loyauty.service.orders;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.CurrencyDTO;
import com.loyauty.service.core.dto.ItemMapDTO;
import com.loyauty.service.core.dto.OrdersDTO;
import com.loyauty.service.core.dto.OrdersSpecialShippingDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserFileDataRecoveryDTO;
import com.loyauty.service.core.dto.UserFileRecoveryDTO;
import com.loyauty.service.core.dto.UserFilesDownloadedDTO;

public interface OrdersService extends Service {
	
	//===================================== Admin's Part ==============================
	/**
	 * 
	 * @param login
	 * @return
	 * @throws ServiceException
	 */
	UserFileRecoveryDTO getUserFileRecoveryByUser(String login) throws ServiceException;
	/**
	 * 
	 * @param destinationFile
	 * @param userLogin
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	Collection  toArrayListFromXML(File orderFile,String userLogin) throws Exception;
	/**
	 * 
	 * @param destinationFile
	 * @param userLogin
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	Collection  toArrayListFromXLS(File orderFile,String userLogin)throws Exception;
	
	/**
	 * 
	 * @param userId
	 * @param list
	 * @return
	 * @throws ServiceException
	 */
	Hashtable<String, OrdersDTO> getHashOrdersFromUserDataRecovery(Long userId,ArrayList<UserFileDataRecoveryDTO> list)
																		  throws ServiceException;
	
	public Hashtable<String, OrdersDTO> getHashOrdersDTOFromListOrdersDTO(List<OrdersDTO> list)
																		  throws ServiceException;
	
	OrdersDTO getOrderDTOByLsOrderId(String lsOrderId)throws ServiceException;
	
	List<OrdersDTO> insertListOrders(List<OrdersDTO> listOrdersDTO)throws Exception;
	
	boolean insertListOrdersIfNotExist(List<OrdersDTO> listOrdersDTO)throws ServiceException;
	
	boolean insertOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO)throws ServiceException;
	
	boolean updateShippingOrderElements(OrdersDTO orderDTO)throws ServiceException;
	
	boolean updateShippingInvoicedOrder(OrdersDTO orderDTO)throws ServiceException;
	
	List<Orders> getAllOrders()throws ServiceException;
	 
	Long getCountInvoicedOrders(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,
			   				    String userLogin, String lsOrderId,String status)throws ServiceException;
	
	Long getCountOrders(
			Date creationDateStart,
			Date creationDateEnd,
			Integer factorDateBetween, 
			String userLogin, 
			String lsOrderId,
			String status,
			String productOrderNumberSearch, 
			String clientOrderNumber,
			String clientOther
			)throws ServiceException;
	
	boolean isExistAnyLsOrderIdInDB(List<OrdersDTO>listOrders);
	
	String generateLsOrderId(String lsOrder,Hashtable<String, OrdersDTO>hashOrders);
	
	boolean insertOrderWithRows(OrdersDTO orderDTO)throws ServiceException;
	
	boolean makeOrderInProgress(OrdersDTO orderDTO)throws ServiceException;

	String generateManLsOrderId(String lsOrderFirstPart)throws ServiceException;

	Long nbOrdersNotSavedInDB(List<OrdersDTO>listOrders)throws ServiceException;
	
	void csvParsing(String csvFolder,String userLogin)throws Exception;
	
	boolean updateOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO)throws Exception;
	
	OrdersSpecialShippingDTO getOrderSpecialShipping(OrdersSpecialShippingDTO orderSpecialDTO)throws Exception;
	
	List<OrdersDTO> getOrdersByDateClientLikeLsOrderId(Date creationDate, String userLogin, String lsOrderId,String status)
														throws ServiceException;
	
	List<OrdersDTO> searchOrdersWithOptions(Date creationDateStart,Date creationDateEnd,String userLogin,String lsOrderId,String status)
														throws ServiceException;
	
	//List<OrdersDTO> searchOrdersWithOptionsAndSorting(Date creationDateStart,Date creationDateEnd, String userLogin, String lsOrderId,String status,Integer sort)
														//throws ServiceException;
	
	
	
	//*****************************************************************
	List<OrdersDTO> searchOrdersWithOptionsAndSorting(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween, 
			                                          String userLogin, String lsOrderId,String status,
			                                          List<Integer>listIndexColumn,Integer PAGE_ITEMS_COUNT,Integer indexSet)
			                                          throws ServiceException;
	
	//Override the method
	List<OrdersDTO> searchOrdersWithOptionsAndSorting(
			Date creationDateStart,
			Date creationDateEnd,
			Integer factorDateBetween, 
            OrdersDTO ordersDTO,
            List<Integer>listIndexColumn,
            Integer PAGE_ITEMS_COUNT,
            Integer indexSet)
            throws ServiceException;
	
	List<OrdersDTO> searchInvoicedWithSorting(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,String userLogin, 
												String lsOrderId,String status,List<Integer>listIndexColumn,
												int PAGE_ITEMS_COUNT,int indexSet)throws ServiceException;
	
	 boolean isThereDuplicate(List<OrdersDTO> listOrdersDTO)throws ServiceException;
	 
	 List<OrdersDTO> getListOrdersByPONumber(List<OrdersDTO> listOrdersDTO)throws ServiceException;
	 
	 List<OrdersDTO> getOrdersItemsExistInDB(final List<OrdersDTO> listOrdersDTO)throws ServiceException;
	 
	 Long getCountOrderByPONumber(String productOrderNumber,Long userId)throws ServiceException;
	 
	 boolean updateQuantityOrderByLsOrderId(OrdersDTO orderDTO)throws ServiceException;
	 
	 boolean updateStatusByLsOrderId(String lsOrderId,String status)throws ServiceException;
	 
	 boolean deleteOrderByLsOrderId(OrdersDTO orderDTO)throws ServiceException;
	 
	 void generateInvoicedXLS(List<OrdersDTO> listOrdersDTO,String ordersAdminTemplateFolder,Long  allOrdersSelected)throws ServiceException;
	 
	 boolean insertInvoicedOrder(OrdersDTO orderDTO)throws ServiceException;
	
	//******************************************************************
	List<OrdersRows> getRowsByLsOrderIdLikeStatus(String lsOrderId, String status, Integer sort)
														throws ServiceException;
	
	public ArrayList<OrdersRows> getRowsByLsOrderIdLikeStatusSorted(String lsOrderId, String status,Integer sort)
														throws ServiceException;
	
	 Integer nbOrderRowsNotDeleted(List<OrdersRows>listOrdersRows)
	 													throws ServiceException;
	 
	 boolean updateOrderByLsOrderId(OrdersDTO orderDTO) throws ServiceException;
	 
	 void generateAdminXLS(List<OrdersDTO> listOrdersDTO,String ordersAdminTemplateFolder, Long allOrdersSelected)
	 													throws ServiceException;

	OrdersRows getRowsByRowId(Long rowId) throws ServiceException;
	
	OrdersRows getRowByLsOrderId(String lsOrderId) throws ServiceException;
	
	boolean makeRowOrderInShippedById(OrdersRows orderRow) throws ServiceException;
	
	boolean makeRowOrderInOpenById(OrdersRows orderRow) throws ServiceException;
	
	void updateOrdersRowsFromAdminXLS(String userAdminLogin,String destFileAdminXLS) throws Exception;
	
	//boolean updateStockByLsProductId(ProductDTO productDTO) throws ServiceException;
	
	void generateAdminEstTool(List<OrdersDTO >listOrdersDTO, String filePathData,boolean selection) throws ServiceException;
	
	boolean isExistProductInStock(ProductDTO productDTO) throws ServiceException;
	 
	//boolean insertProductInStock(ProductDTO productDTO) throws ServiceException;
	
	//List<OrdersDTO> listStockFromXLS(String userAdminLogin,String destFileStockXLS) throws Exception;
	
	//void  updateStockFromStockXLS(List<OrdersDTO>listStock)throws Exception;
	
	void updateSpecialShippingFromXLS(StringBuffer rapport,String userAdminLogin,Long userId,String destFileXLS) throws Exception;
	
	void createLogsFile(String userAdminLogin,String folderDest, String errorReport,int option)throws ServiceException;

	boolean isLsOrderIdUsed(String lsOrderId) throws ServiceException;
	
	String getStringFromDouble(Double value,int nbDecimal) throws ServiceException;

	List<ItemMapDTO> getItemsUserFileMapping(File fileToMap, int fileType) throws Exception;
	
	boolean insertUserFileRecovery(UserFileRecoveryDTO userFileRecoveryDTO) throws Exception;
	 
	boolean isFileDownloaded(UserFilesDownloadedDTO ufdDTO)throws ServiceException;
	
	boolean  insertUserFilesDownloaded(UserFilesDownloadedDTO ufdDTO)throws ServiceException;
	
	List<UserFilesDownloadedDTO> getListFileDownloadedDTO(final String userLogin, final Integer userLoginOption,final Integer treatedOption) throws ServiceException;
	
	boolean isFileForUser(String fileToImport, String userLogin) throws ServiceException;
	
	boolean updateFilesDownloadedStatus(String fileToImport, String userLogin, boolean treated) throws Exception;

	List<OrdersDTO> getEtaOrdersList(String etaFieldName,String secondEtaFieldName,Long userId,String destEtaOrderXLSFile)throws Exception;
	
	List<OrdersDTO> getEtaOrderlistByFieldName(OrdersDTO ordersDTO) throws ServiceException;
	
	void generateEtaXLS(List<OrdersDTO> listOrdersDTO,String eta2dFieldValue,String ordersEtaTemplateFolder)throws Exception;
	
	boolean updateEtaFieldName(String userLogin ,String etaFieldName) throws Exception;
	
	boolean updateSecondEtaFieldName(final String userLogin ,final String secondEtaFieldName) throws Exception;
	 
	//===================================== Client's Part ========================================
	 List<OrdersDTO>getAllClientsByUser(Long userId) throws ServiceException;
	 boolean insertNewDestination(OrdersDTO orderDTO) throws ServiceException;

	//===================================== Rideau Integration Start ======================================== 
	@SuppressWarnings({ "rawtypes" })
	Collection  toArrayListFromXML_Rideau(File orderFile,String userLogin, String fileToImport) throws Exception; 
	boolean updateFileSequenceShipping(final Long userId, final int fileSequenceNo)throws ServiceException;
	boolean updateFileSequenceInvoice(final Long userId, final int fileSequenceNo) throws ServiceException;
	OrdersDTO getInvoiceOrderByLsOrderId(String lsOrderId)throws ServiceException;
	Double getTotalShippedQuantityForSplitOrders(String lsOrderId)throws ServiceException;
	Double getOrderedQuantity(String lsOrderId)throws ServiceException;
	
	//===================================== Rideau Integration End ======================================== 

	//Update Stock
	//boolean updateStock(List<OrdersDTO> listStock) throws ServiceException;
	Integer nbOrdersNotSaved(List<OrdersDTO> ordersDTOListImported) throws ServiceException;
	
	// getCurrencyIdByUserId
	CurrencyDTO getCurrencyIdByUserId(Long userId)throws ServiceException;
	
	// PDF Parsing functions ==============
	Collection toArrayListFromListOfPDFLines(List<String> listFromPDF, String userLogin) throws Exception;
	
	List<String> getFilterList(String line) throws Exception;
	
	Integer getIndexDataInList(List<String> listFromPDF, Integer landmarkIndex, 
			char startsEndsOrContains, String landmarkText, int startFromIndex) throws Exception;
	
	public Integer getIndexLandmarkTextInList(List<String> listFromPDF, Integer landmarkIndex, 
			char startsEndsOrContains, String landmarkText, int startFromIndex) throws Exception;

	String getFieldValue(List<String> fieldList, List<String> listFromPDF, String fieldName, int startFromIndex) throws Exception;
	
	String removeUnusedSpaces(String srtValue);
	// End PDF Parsing functions ==============
	
	/**
	 * 
	 */
	boolean	isThisLsOrderIdInUsed(final String lsOrderId)throws Exception;
	/**
	 * 
	 * @param orders
	 * @return
	 * @throws ServiceException
	 */
	List<OrdersDTO> getOrdersByProductOrderNumberSumit(OrdersDTO ordersDTO) throws ServiceException;

	/**
	 * 
	 * @param creationDateStartArg
	 * @param creationDateEndArg
	 * @param reportDateBetween
	 * @param userLogin
	 * @param lsOrderId
	 * @param status
	 * @param listIndexColumn
	 * @param pAGE_ITEMS_COUNT
	 * @param indexSet
	 * @param productOrderNumberSearch
	 * @param clientOrderNumber
	 * @param clientOther
	 * @return
	 * @throws ServiceException
	 */
	List<OrdersDTO> searchOrdersWithOptionsAndSortingNew(
			Date creationDateStartArg, Date creationDateEndArg,
			Integer reportDateBetween, String userLogin, String lsOrderId,
			String status, List<Integer> listIndexColumn,
			Integer pAGE_ITEMS_COUNT, Integer indexSet,
			String productOrderNumberSearch, String clientOrderNumber,
			String clientOther) throws ServiceException;

}
