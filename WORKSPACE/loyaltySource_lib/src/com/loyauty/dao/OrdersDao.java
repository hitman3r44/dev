package com.loyauty.dao;

import java.util.Date;
import java.util.List;

import com.loyauty.model.Currency;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.OrdersSpecialShipping;
import com.loyauty.model.Product;
import com.loyauty.model.UserFileRecovery;
import com.loyauty.model.UserFilesDownloaded;

public interface OrdersDao extends BasicDao{
	
	//============================== Admin's Part =================================	

	//INSERT
	
	List<Orders> insertListOrders(List<Orders> listOrders);
	
	boolean insertListOrdersIfNotExist(List<Orders> listOrders);
	
	boolean insertOrder(Orders order);
	
	boolean insertRowOrder(OrdersRows orderRow);
	
	boolean insertInvoicedOrder(Orders order);
	
	boolean insertOrderWithRows(Orders order);

	boolean insertProductInStock(Product product);
	 
	boolean insertOrderSpecialShipping(OrdersSpecialShipping orderSpecial);
	
	boolean insertUserFilesDownloaded(UserFilesDownloaded ufd);
	
	//UPDATE
	boolean makeOrderInProgress(Orders order);
	
	boolean updateShippingOrderElements(Orders order);
	
	boolean updateShippingInvoicedOrder(Orders order);
	
	boolean updateOrderByLsOrderId(Orders order);
	
	boolean updateOrderRowById(OrdersRows row);
	
	boolean updateQuantityOrderByLsOrderId(Orders order) ;

	boolean updateStatusByLsOrderId(String lsOrderId,String status);
	
	boolean makeRowOrderInShippedById(OrdersRows orderRow);
	
	boolean makeRowOrderInOpenById(OrdersRows orderRow);

	boolean updateOrderSpecialShipping(OrdersSpecialShipping orderSpecial);
	
	//boolean updateStockByLsProductId(Product product);
	
	boolean updateFilesDownloadedStatus(String fileToImport, String userLogin, boolean treated);
	
	//SELECT 
	
	UserFileRecovery getUserFileRecoveryByUser(String login);
	
	Orders getOrderByLsOrderId(String lsOrderId);

	boolean isLsOrderIdUsed(String lsOrderId);
	
	Orders getManMaxLsOrderId(String lsOrderFirstPart);
	
	List<Orders> getOrdersByDateClientLikeLsOrderId(Date creationDate, String userLogin, String lsOrderId);
	
	List<Orders> searchOrdersWithOptions(Date creationDateStart,Date creationDateEnd, String userLogin, String lsOrderId);
	
	List<OrdersRows> getRowsByLsOrderIdLikeStatus(String lsOrderId, String status,Integer sort);
	
	List<OrdersRows> getRowsByLsOrderIdLikeStatusSorted(String lsOrderId, String status,Integer sort);

	List<Orders>getListOrdersByPONumber(List<Orders> listOrders);
	
	List<Orders>getOrdersItemsExistInDB(List<Orders> listOrders);

	List<Orders> getAllOrders();
	
	Long getCountOrderByPONumber(String productOrderNumber, Long userId);
		
	OrdersRows getRowsByRowId(Long rowId);
	
	OrdersRows getRowByLsOrderId(String lsOrderId);
	
	boolean isExistProductInStock(Product product);
	
	OrdersSpecialShipping getOrderSpecialShipping(OrdersSpecialShipping orderSpecial);

	List<Orders> searchOrdersWithOptionsAndSorting(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,String userLogin,
			 										String lsOrderId,String status,List<Integer>listIndexColumn,Integer PAGE_ITEMS_COUNT,Integer indexSet);

	// New Method for Searching in Handeling
	List<Orders> searchOrdersWithOptionsAndSortingNew(Date creationDateStart,
			Date creationDateEnd, Integer factorDateBetween, String userLogin,
			String lsOrderId, String status, List<Integer> listIndexColumn,
			Integer PAGE_ITEMS_COUNT, Integer indexSet,
			String productOrderNumberSearch, String clientOrderNumber,
			String clientOther);
	
	//New method for search orders
	List<Orders> searchOrdersWithOptionsAndSorting(
			Date creationDateStart,
			Date creationDateEnd,
			Integer factorDateBetween,
			Orders orders,
			List<Integer>listIndexColumn,
			Integer PAGE_ITEMS_COUNT,
			Integer indexSet);
	 
	List<Orders> searchInvoicedWithSorting(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,String userLogin, String lsOrderId,String status,List<Integer>listIndexColumn,int PAGE_ITEMS_COUNT,int indexSet);
	 
	Orders getCountInvoicedOrders(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,
			 					   String userLogin, String lsOrderId,String status);
	 
	Orders getCountOrders(
			Date creationDateStart,
			Date creationDateEnd,Integer 
			factorDateBetween,
			String userLogin, 
			String lsOrderId,
			String status,
			String productOrderNumberSearch, 
			String clientOrderNumber,
			String clientOther);
	/**
	 * 
	 * @param ufd
	 * @return
	 */
	boolean isFileDownloaded(UserFilesDownloaded ufd);
	
	List<UserFilesDownloaded> getListFileDownloaded(String userLogin, Integer userLoginOption, Integer treatedOption);
	
	boolean isFileForUser(String fileToImport, String userLogin);
	 
	//DELETE
		
	boolean  deleteOrderRowByLsOrderId(OrdersRows row);
		
	boolean deleteOrderByLsOrderId(Orders order);
	
	//Add for rideau to store the fileSequenceShipping number as its important for them
	boolean updateFileSequenceShipping(Long userId, int fileSequenceNo);
	boolean updateFileSequenceInvoice(Long userId, int fileSequenceNo);
	Orders getInvoiceOrderByLsOrderId(String lsOrderId);
	Double getTotalShippedQuantityForSplitOrders(String lsOrderId);
	Double getOrderedQuantity(String lsOrderId);
	
	/**
	 * 
	 * @param userLogin
	 * @param etaFieldName
	 * @return
	 */
	boolean updateEtaFieldName(String userLogin , String etaFieldName);

	/**
	 * 
	 * @param userLogin
	 * @param secondEtaFieldName
	 * @return
	 */
	boolean updateSecondEtaFieldName(String userLogin , String secondEtaFieldName);
	
	/**
	 * 
	 * @param order
	 * @return
	 */
	List<Orders> getEtaOrderlistByFieldName(Orders order);
	//Stock treatment
	//boolean updateStock(List<Orders> listStock);

	Integer nbOrdersNotSaved(List<Orders> ordersListImported);
	
	//============================== Client's Part =================================
	List<Orders>getAllClientsByUser(Long userId);
	boolean insertNewDestination(Orders order);
	boolean insertUserClient(Orders order);
	
	// getCurrencyIdByUserId
	Currency getCurrencyIdByUserId(Long userId);
	
	/**
	 * 
	 * @param lsOrderId
	 * @return
	 */
	Boolean isThisLsOrderIdInUsed(String lsOrderId);
	
	/**
	 * 
	 * @param orders
	 * @return
	 */
	List<Orders> getOrdersByProductOrderNumberSumit(Orders orders);

}
