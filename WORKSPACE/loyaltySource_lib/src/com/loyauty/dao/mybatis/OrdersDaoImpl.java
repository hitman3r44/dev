package com.loyauty.dao.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.loyauty.dao.OrdersDao;
import com.loyauty.model.Currency;
import com.loyauty.model.Orders;
import com.loyauty.model.OrdersRows;
import com.loyauty.model.OrdersSpecialShipping;
import com.loyauty.model.Product;
import com.loyauty.model.UserConnection;
import com.loyauty.model.UserFileRecovery;
import com.loyauty.model.UserFilesDownloaded;
import com.loyauty.service.core.dto.OrdersDTO;

//============================== Admin's Part =================================
	public class OrdersDaoImpl extends BasicDaoImpl implements OrdersDao{

		public OrdersDaoImpl(SqlSession sqlSession, String mapper) {
			super(sqlSession, mapper);
		}

		@Override
		public UserFileRecovery getUserFileRecoveryByUser(String login) {
			UserFileRecovery ufr=(UserFileRecovery) getSqlSession().selectOne(getNameSpace("getUserFileRecoveryByUser"), login);
			return ufr;
		}

		@Override
		public Orders getOrderByLsOrderId(String lsOrderId){
			Orders orderResult=null;
			orderResult=(Orders) getSqlSession().selectOne(getNameSpace("getOrderByLsOrderId"), lsOrderId);
			ArrayList<OrdersRows>rowsList=(ArrayList<OrdersRows>)getRowsByLsOrderIdLikeStatus(lsOrderId, "",0);
			if(orderResult!=null)orderResult.setRowsList(rowsList);
			return orderResult;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders>getListOrdersByPONumber(List<Orders> listOrders){
			List<Orders>listOrderResult=new ArrayList<Orders>();
			if(listOrders!=null){
				HashMap<String, Object>param=new HashMap<String, Object>();
				Orders order=listOrders.get(0);
				Long userId=order.getUserId();
				param.put("listOrders", listOrders);
				param.put("userId", userId);
				listOrderResult=(List<Orders>) getSqlSession().selectList(getNameSpace("getListOrdersByPONumber"), param);
			}
			return listOrderResult;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders>getOrdersItemsExistInDB(List<Orders> listOrders){
			List<Orders>listOrderResult=new ArrayList<Orders>();
			if(listOrders!=null){
				HashMap<String, Object>param=new HashMap<String, Object>();
				Orders order=listOrders.get(0);
				Long userId=order.getUserId();
				param.put("listOrders", listOrders);
				param.put("userId", userId);
				listOrderResult=(List<Orders>) getSqlSession().selectList(getNameSpace("getOrdersItemsExistInDB"), param);
			}
			return listOrderResult;
		}

		@Override
		public boolean insertOrder(Orders order) {
			boolean result=false;
			int success=getSqlSession().insert(getNameSpace("insertOrder"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public boolean insertRowOrder(OrdersRows orderRow) {
			boolean result=false;
			int success=getSqlSession().insert(getNameSpace("insertRowOrder"), orderRow);
			if(success>=0)result=true;
			return result;
		}


		@Override
		public boolean insertInvoicedOrder(Orders order) {
			boolean result=false;
			int success=getSqlSession().insert(getNameSpace("insertInvoicedOrder"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public Long getCountOrderByPONumber(String productOrderNumber, Long userId) {
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("productOrderNumber", productOrderNumber); 
			param.put("userId", userId);
			Orders order=(Orders)getSqlSession().selectOne(getNameSpace("getCountOrderByPONumber"), param);
			return order.getCount();
		}

		@Override
		public boolean isLsOrderIdUsed( String lsOrderId){
			boolean result=true;
			Orders countOrdersByLsOrderId=(Orders)getSqlSession().selectOne(getNameSpace("getCountOrdersByLsOrderId"), lsOrderId);
			Orders countInvoicingByLsOrderId=(Orders)getSqlSession().selectOne(getNameSpace("getCountInvoicingByLsOrderId"), lsOrderId);
			if(countOrdersByLsOrderId.getCount()==0 &&  countInvoicingByLsOrderId.getCount()==0)result=false;
			return result;
			
		}
	/*	
		@Override
		public List<Orders> insertListOrders(List<Orders> listOrders) {
			List<Orders>result=null;
			for(Orders order:listOrders){
				String productOrderNumber=order.getProductOrderNumber();
				Long userId=order.getUserId();
				Long count=getCountOrderByPONumber(productOrderNumber, userId);
				//prepared order to insert if dosen't exist or if is duplicate
				if(count==0 || (order.getDuplicate()!=null && order.getDuplicate()==true)||
						       (order.getManOrder()!=null && order.getManOrder()==true)){
					order.setToInsert(1L);
				}
			}
			for(Orders order:listOrders){
				if(order.getToUpdate())	updateQuantityOrderByLsOrderId(order);
				if(order.getToInsert()==1L){
					//if lsOrderId already exist generate another lsOrderId using [n]
					String lsOrderId=order.getLsOrderId();
					Orders ordChecked= getOrderByLsOrderId(lsOrderId);
					int i=0;
					while(ordChecked!=null){
						i++;
						int indexLeftBracket=lsOrderId.indexOf("[");
						int indexRigthtBracket=lsOrderId.indexOf("]");
						int increment=i;
						if(indexLeftBracket>=0){
							increment=Integer.parseInt(lsOrderId.substring(indexLeftBracket+1,indexRigthtBracket));
							increment++;
							lsOrderId=lsOrderId.substring(0,indexLeftBracket+1)+increment+lsOrderId.substring(indexRigthtBracket,lsOrderId.length());
						}else{
							if(ordChecked!=null)
							lsOrderId=ordChecked.getLsOrderId()+"["+increment+"]";	
						}
						ordChecked= getOrderByLsOrderId(lsOrderId);
					}
					order.setLsOrderId(lsOrderId);
					//insertOrder(order);
					List<OrdersRows>listOrdersRows=order.getRowsList();
					for(OrdersRows row:listOrdersRows){
						//lsOrderId= generateLsOrderId(order.getLsOrderId());
						lsOrderId= order.getLsOrderId();
						order.setLsOrderId(lsOrderId);
						insertOrder(order);
						row.setLsOrderId(lsOrderId);
						insertRowOrder(row);
					}
				}
			}
			result=getListOrdersByPONumber(listOrders);
			if(result==null)result=new ArrayList<Orders>();
			return listOrders;
		}
*/
		
		@Override
		public List<Orders> insertListOrders(List<Orders> listOrders) {
			List<Orders>result=null;
			for(Orders order:listOrders){
				String productOrderNumber=order.getProductOrderNumber();
				Long userId=order.getUserId();
				Long count=getCountOrderByPONumber(productOrderNumber, userId);
				//prepared order to insert if dosen't exist or if is duplicate
				if(count==0 || (order.getDuplicate()!=null && order.getDuplicate()==true)||
						       (order.getManOrder()!=null && order.getManOrder()==true)){
					order.setToInsert(1L);
				}
			}
			for(Orders order:listOrders){
				if(order.getToUpdate())	updateQuantityOrderByLsOrderId(order);
				if(order.getToInsert()==1L){
					//if lsOrderId already exist generate another lsOrderId using [n]
					String lsOrderId=order.getLsOrderId();
					Orders ordChecked= getOrderByLsOrderId(lsOrderId);
					int i=0;
					while(ordChecked!=null){
						i++;
						int indexLeftBracket=lsOrderId.indexOf("[");
						int indexRigthtBracket=lsOrderId.indexOf("]");
						int increment=i;
						if(indexLeftBracket>=0){
							increment=Integer.parseInt(lsOrderId.substring(indexLeftBracket+1,indexRigthtBracket));
							increment++;
							lsOrderId=lsOrderId.substring(0,indexLeftBracket+1)+increment+lsOrderId.substring(indexRigthtBracket,lsOrderId.length());
						}else{
							if(ordChecked!=null)
							lsOrderId=ordChecked.getLsOrderId()+"["+increment+"]";	
						}
						ordChecked= getOrderByLsOrderId(lsOrderId);
					}
					order.setLsOrderId(lsOrderId);
					//insertOrder(order);
					List<OrdersRows>listOrdersRows=order.getRowsList();
					for(OrdersRows row:listOrdersRows){
						//lsOrderId= generateLsOrderId(order.getLsOrderId());
						lsOrderId= order.getLsOrderId();
						order.setLsOrderId(lsOrderId);
						//insertOrder(order);
						row.setLsOrderId(lsOrderId);
						//insertRowOrder(row);
					}
				}
			}
			HashMap<Object, Object>param=new HashMap<Object, Object>();
			param.put("ordersListImported", listOrders);
			getSqlSession().insert(getNameSpace("insertListOrders"),param);
			result=getListOrdersByPONumber(listOrders);
			if(result==null)result=new ArrayList<Orders>();
			return listOrders;
		}	
		
		
		@Override
		public boolean insertListOrdersIfNotExist(List<Orders> listOrders) {
			boolean result=false;
			for(Orders order:listOrders){
				String lsOrderId=order.getLsOrderId();
				Orders ordChecked= getOrderByLsOrderId(lsOrderId);
				//insert order if not exist
				if(ordChecked==null){
					result=insertOrder(order);
					List<OrdersRows>listOrdersRows=order.getRowsList();
					for(OrdersRows row:listOrdersRows){
						row.setLsOrderId(order.getLsOrderId());
						insertRowOrder(row);
						result=result & result;
					}
				}
				
			}
			return result;
		}

		@Override
		public boolean insertOrderWithRows(Orders order) {
			boolean result=false;
			String lsOrderId=order.getLsOrderId();
			Orders ordChecked= getOrderByLsOrderId(lsOrderId);
			int i=0;
			while(ordChecked!=null){
				i++;
				int indexLeftBracket=lsOrderId.indexOf("[");
				int indexRigthtBracket=lsOrderId.indexOf("]");
				int increment=i;
				if(indexLeftBracket>=0){
					increment=Integer.parseInt(lsOrderId.substring(indexLeftBracket+1,indexRigthtBracket));
					increment++;
					lsOrderId=lsOrderId.substring(0,indexLeftBracket+1)+increment+lsOrderId.substring(indexRigthtBracket,lsOrderId.length());
				}else{
					lsOrderId=ordChecked.getLsOrderId()+"["+increment+"]";	
				}
				ordChecked= getOrderByLsOrderId(lsOrderId);
			}
			order.setLsOrderId(lsOrderId);
			boolean saccessOrder=false;
			saccessOrder=insertOrder(order);
			List<OrdersRows>listOrdersRows=order.getRowsList();
			//Orders ord= getOrderByLsOrderId(order.getLsOrderId());
			boolean saccessRows=false;
			result=saccessOrder;
			for(OrdersRows row:listOrdersRows){
				row.setLsOrderId(order.getLsOrderId());
				//row.setOrderId(ord.getId());
				saccessRows=insertRowOrder(row);
				result=result & saccessRows;
			}

			return result;
		}

		@Override
		public boolean updateOrderByLsOrderId(Orders order){
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("updateOrderByLsOrderId"), order);
			for(OrdersRows row:order.getRowsList()){
				if(row.getToDelete()==1 && row.getId()>-1L ){//delete this row
					//deleteOrderRowById(row);
				}else if(row.getToDelete()!=1 && row.getId()==-1L){ //insert this order with a new lsOrderId //row
					String lsOrderId= generateLsOrderId(order);
					order.setLsOrderId(lsOrderId);
					insertOrder(order);
					row.setLsOrderId(lsOrderId);
					insertRowOrder(row);
				}else if(row.getToDelete()!=1 && row.getId()>-1L){ //update this row
					row.setLsOrderId(order.getLsOrderId());
					updateOrderRowById(row);
				}
			}
			if(success>=0)result=true;
			return result;
		}

		public String generateLsOrderId(Orders order){
			Hashtable<String, String>lsOrdersIdHash=new Hashtable<String, String>();
			String code=order.getUserLogin().substring(0, 2).toUpperCase();
            String lsOrderId=order.getProductOrderNumber();
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
            String lsOrderIdToGenerate=code+"O"+order.getUserId()+lsOrderIdParent;;
            while(isLsOrderIdUsed(lsOrderIdToGenerate) || lsOrdersIdHash.containsKey(lsOrderIdToGenerate)){
               	inc++; 
                lsOrderIdToGenerate=code+"O"+order.getUserId()+lsOrderIdParent+"R"+inc;
            }
            lsOrdersIdHash.put(lsOrderIdToGenerate, lsOrderIdToGenerate);
	        return lsOrderIdToGenerate;
		}
		
		@Override
		public boolean updateOrderRowById(OrdersRows row) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("updateOrderRowById"), row);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public boolean updateShippingOrderElements(Orders order) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("updateShippingOrderElements"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public boolean updateShippingInvoicedOrder(Orders order) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("updateShippingInvoicedOrder"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public boolean updateQuantityOrderByLsOrderId(Orders order) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("updateQuantityOrderByLsOrderId"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override 
		public boolean deleteOrderRowByLsOrderId(OrdersRows row) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("deleteOrderRowByLsOrderId"), row);
			if(success>=0)result=true;
			return result;
		}

		@Override 
		public boolean deleteOrderByLsOrderId(Orders order){
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("deleteOrderByLsOrderId"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public boolean makeOrderInProgress(Orders order) {
			boolean result=false;
			int success=getSqlSession().update(getNameSpace("makeOrderInProgress"), order);
			if(success>=0)result=true;
			return result;
		}

		@Override
		public Orders getManMaxLsOrderId(String lsOrderFirstPart) {
			Orders result=null;
			result=(Orders)getSqlSession().selectOne(getNameSpace("getManMaxLsOrderId"),lsOrderFirstPart);
			return result;
		}

		@Override
		public Orders getCountInvoicedOrders(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,
											 String userLogin, String lsOrderId,String status) {
			Orders result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("factorDateBetween", factorDateBetween);
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			param.put("status", status);
			result=(Orders)getSqlSession().selectOne(getNameSpace("getCountInvoicedOrders"),param);
			return result;
		}

		@Override
		public Orders getCountOrders(
				Date creationDateStart,Date creationDateEnd,Integer factorDateBetween,
				String userLogin, String lsOrderId,String status,
				String productOrderNumberSearch, 
				String clientOrderNumber,
				String clientOther) {
			Orders result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("factorDateBetween", factorDateBetween);
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			param.put("status", status);
			param.put("productOrderNumberSearch", productOrderNumberSearch);
			param.put("clientOrderNumber", clientOrderNumber);
			param.put("clientOther", clientOther);
			
			result=(Orders)getSqlSession().selectOne(getNameSpace("getCountOrders"),param);
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> getOrdersByDateClientLikeLsOrderId(Date creationDate, String userLogin, String lsOrderId){ 
			List<Orders>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDate", creationDate); 
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("getOrdersByDateClientLikeLsOrderId"), param);
			return result;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> searchOrdersWithOptions(Date creationDateStart,Date creationDateEnd, String userLogin, String lsOrderId){ 
			List<Orders>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("searchOrdersWithOptions"), param);
			return result;
		}

		
		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> searchOrdersWithOptionsAndSorting(
				Date creationDateStart,
				Date creationDateEnd, 
				Integer factorDateBetween,
				String userLogin,
				String lsOrderId,
				String status,
				List<Integer>listIndexColumn,
				Integer PAGE_ITEMS_COUNT,
				Integer indexSet){
			
			List<Orders>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			param.put("factorDateBetween", factorDateBetween);
			param.put("status", status);
			param.put("PAGE_ITEMS_COUNT", PAGE_ITEMS_COUNT);
			param.put("indexSet", indexSet);
			param.put("index", "0");
			param.put("listIndexColumn", listIndexColumn);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("searchOrdersWithOptionsAndSorting"), param);
			return result;
		}
		
		//New Override Method 
		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> searchOrdersWithOptionsAndSorting(
				Date creationDateStart,
				Date creationDateEnd, 
				Integer factorDateBetween,
				Orders orders,
				List<Integer>listIndexColumn,
				Integer PAGE_ITEMS_COUNT,
				Integer indexSet){
			
			List<Orders>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("factorDateBetween", factorDateBetween);
			param.put("userLogin", orders.getUserLogin());
			param.put("lsOrderId", orders.getOrderId());
			param.put("status", orders.getStatus());
			param.put("PAGE_ITEMS_COUNT", PAGE_ITEMS_COUNT);
			param.put("indexSet", indexSet);
			param.put("index", "0");
			param.put("listIndexColumn", listIndexColumn);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("searchOrdersWithNewOptionsAndSorting"), param);
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> searchInvoicedWithSorting(Date creationDateStart,Date creationDateEnd,Integer factorDateBetween, String userLogin, String lsOrderId,String status,List<Integer>listIndexColumn,int PAGE_ITEMS_COUNT,int indexSet){ 
			List<Orders>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("creationDateStart", creationDateStart); 
			param.put("creationDateEnd", creationDateEnd);
			param.put("factorDateBetween", factorDateBetween);
			param.put("userLogin", userLogin);
			param.put("lsOrderId", lsOrderId);
			param.put("status", status);
			param.put("PAGE_ITEMS_COUNT", PAGE_ITEMS_COUNT);
			param.put("indexSet", indexSet);
			param.put("index", "0");
			param.put("listIndexColumn", listIndexColumn);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("searchInvoicedWithSorting"), param);
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<OrdersRows> getRowsByLsOrderIdLikeStatus(String lsOrderId, String status,Integer sort){ 
			List<OrdersRows>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("lsOrderId", lsOrderId); 
			param.put("status", status);
			param.put("sort", sort);
			result=(List<OrdersRows>) getSqlSession().selectList(getNameSpace("getRowsByLsOrderIdLikeStatus"), param);
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> getAllOrders(){ 
			List<Orders>result=null;
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("getAllOrders"));
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<OrdersRows> getRowsByLsOrderIdLikeStatusSorted(String lsOrderId, String status,Integer sort){ 
			List<OrdersRows>result=null;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("lsOrderId", lsOrderId); 
			param.put("status", status);
			param.put("sort", sort);
			result=(List<OrdersRows>) getSqlSession().selectList(getNameSpace("getRowsByLsOrderIdLikeStatusSorted"), param);
			return result;
		}

		@Override
		public OrdersRows getRowsByRowId(Long rowId){
			OrdersRows result=null;
			result=(OrdersRows) getSqlSession().selectOne(getNameSpace("getRowsByRowId"), rowId);
			return result;	
			
		}

		@Override
		public OrdersRows getRowByLsOrderId(String lsOrderId){
			OrdersRows result=null;
			result=(OrdersRows) getSqlSession().selectOne(getNameSpace("getRowByLsOrderId"), lsOrderId);
			return result;	
			
		}

		@Override
		public boolean makeRowOrderInShippedById(OrdersRows orderRow){
			boolean result=false;
			int success=(Integer)getSqlSession().update(getNameSpace("makeRowOrderInShippedById"), orderRow);
			if(success==0)result=true;
			return result;	
			
		}
		
		@Override
		public boolean makeRowOrderInOpenById(OrdersRows orderRow){
			boolean result=false;
			int success=(Integer)getSqlSession().update(getNameSpace("makeRowOrderInOpenById"), orderRow);
			if(success==0)result=true;
			return result;	
			
		}
		
		/*@Override
		public boolean updateStockByLsProductId(Product product){
			boolean result=false;
			int success=(Integer)getSqlSession().update(getNameSpace("updateStockByLsProductId"), product);
			if(success==0)result=true;
			return result;	
			
		}*/

		@Override
		public boolean isExistProductInStock(Product product){
			boolean result=false;
			Product pro=(Product)getSqlSession().selectOne(getNameSpace("isExistProductInStock"), product);
			if(pro.getId()>0)result=true;
			return result;	
			
		}
		
		@Override
		public boolean updateStatusByLsOrderId(String lsOrderId,String status){
			boolean result=false;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("lsOrderId", lsOrderId);
			param.put("status", status);
			int success=(Integer)getSqlSession().update(getNameSpace("updateStatusByLsOrderId"), param);
			if(success==0)result=true;
			return result;	
			
		}

		@Override
		public boolean insertProductInStock(Product product){
			boolean result=false;
			int success=(Integer)getSqlSession().insert(getNameSpace("insertProductInStock"), product);
			if(success==0)result=true;
			return result;	
			
		}


		@Override
		public boolean insertOrderSpecialShipping(OrdersSpecialShipping orderSpecial){
			boolean result=false;
			int success=(Integer)getSqlSession().insert(getNameSpace("insertOrderSpecialShipping"), orderSpecial);
			if(success==0)result=true;
			return result;	
			
		}
		

		@Override
		public boolean updateOrderSpecialShipping(OrdersSpecialShipping orderSpecial){
			boolean result=false;
			int success=(Integer)getSqlSession().insert(getNameSpace("updateOrderSpecialShipping"), orderSpecial);
			if(success==0)result=true;
			return result;	
			
		}

		@Override
		public OrdersSpecialShipping getOrderSpecialShipping(OrdersSpecialShipping orderSpecial){
			OrdersSpecialShipping result=null;
			result=(OrdersSpecialShipping)getSqlSession().selectOne(getNameSpace("getOrderSpecialShipping"), orderSpecial);
			return result;	
			
		}

		@Override
		public boolean isFileDownloaded(UserFilesDownloaded ufd){
			UserFilesDownloaded result=null;
			result=(UserFilesDownloaded)getSqlSession().selectOne(getNameSpace("isFileDownloaded"), ufd);
			if(result==null || result.getId()==null)return false;
			return true;	
			
		}

		//============================== Client's Part =================================

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders>getAllClientsByUser(Long userId){
			List<Orders>listOrderResult;
			listOrderResult=(List<Orders>) getSqlSession().selectList(getNameSpace("getAllClientsByUser"), userId);
			return listOrderResult;
		}
		@Override
		public boolean insertNewDestination(Orders order){
			boolean result=false;
			Orders orderResult =(Orders)getSqlSession().selectOne(getNameSpace("insertNewDestination"), order);
			order.setClientProfileId(orderResult.getId());
			result=insertUserClient(order);
			return result;	
		}
		@Override
		public boolean insertUserClient(Orders order){
			boolean result=false;
			int success=(Integer)getSqlSession().insert(getNameSpace("insertUserClient"), order);
			if(success==0)result=true;
			return result;	
		}
		
		@Override
		public boolean insertUserFilesDownloaded(UserFilesDownloaded ufd){
			boolean result=false;
			int success=(Integer)getSqlSession().insert(getNameSpace("insertUserFilesDownloaded"), ufd);
			if(success==0)result=true;
			return result;	
		}

		
		@Override
		public List<UserFilesDownloaded> getListFileDownloaded(String userLogin, Integer userLoginOption, Integer treatedOption){
			List<UserFilesDownloaded>result=new ArrayList<UserFilesDownloaded>();
			HashMap<Object, Object>param=new HashMap<Object, Object>();
			param.put("userLogin", userLogin);
			param.put("userLoginOption", userLoginOption);
			param.put("treatedOption", treatedOption);
			@SuppressWarnings("unchecked")
			List<UserFilesDownloaded>listFiles=(List<UserFilesDownloaded>)getSqlSession().selectList(getNameSpace("getListFileDownloaded"), param);
			if(listFiles!=null)result=listFiles;
			return result;	
		}
		
		
		@Override
		public boolean isFileForUser(String fileToImport, String userLogin){
			HashMap<Object, Object>param=new HashMap<Object, Object>();
			param.put("fileToImport", fileToImport);
			param.put("userLogin", userLogin);
			UserFilesDownloaded result=null;
			result=(UserFilesDownloaded)getSqlSession().selectOne(getNameSpace("isFileForUser"),param);
			if(result==null || result.getId()==null)return false;
			return true;
		}

		@Override
		public boolean updateFilesDownloadedStatus(String fileToImport, String userLogin, boolean treated){
			boolean result=false;
			HashMap<Object, Object>param=new HashMap<Object, Object>();
			param.put("fileToImport", fileToImport);
			param.put("userLogin", userLogin);
			param.put("treated", treated);
			int success=(Integer)getSqlSession().update(getNameSpace("updateFilesDownloadedStatus"),param);
			if(success==0)result=true;
			return result;
		}

		@Override
		public boolean updateFileSequenceShipping(Long userId,int fileSequenceNo) {
			boolean result=false;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("userId", userId);
			param.put("fileSequenceNo", fileSequenceNo);
			int success=(Integer)getSqlSession().update(getNameSpace("updateFileSeqShipping"), param);
			if(success==0)result=true;
			return result;	
		}
		
		@Override
		public boolean updateFileSequenceInvoice(Long userId,int fileSequenceNo) {
			boolean result=false;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("userId", userId);
			param.put("fileSequenceNo", fileSequenceNo);
			int success=(Integer)getSqlSession().update(getNameSpace("updateFileSequenceInvoice"), param);
			if(success==0)result=true;
			return result;	
		}

		@Override
		public boolean updateEtaFieldName(String userLogin , String etaFieldName){
			boolean result=false;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("userLogin", userLogin);
			param.put("etaFieldName", etaFieldName);
			int success=(Integer)getSqlSession().update(getNameSpace("updateEtaFieldName"), param);
			if(success==0)result=true;
			return result;	
		}

		@Override
		public boolean updateSecondEtaFieldName(String userLogin , String secondEtaFieldName){
			boolean result=false;
			HashMap<String, Object>param=new HashMap<String, Object>();
			param.put("userLogin", userLogin);
			param.put("secondEtaFieldName", secondEtaFieldName);
			int success=(Integer)getSqlSession().update(getNameSpace("updateSecondEtaFieldName"), param);
			if(success==0)result=true;
			return result;	
		}

		@Override
		public Orders getInvoiceOrderByLsOrderId(String lsOrderId){
			Orders orderResult=null;
			orderResult=(Orders) getSqlSession().selectOne(getNameSpace("getInvoiceOrderByLsOrderId"), lsOrderId);
			return orderResult;
		}
		
		@Override
		public Double getTotalShippedQuantityForSplitOrders(String lsOrderId) {
			Double quantity = new Double(0);
			quantity= (Double) getSqlSession().selectOne(getNameSpace("getTotalShippedQuantityForSplitOrders"), lsOrderId);
			return quantity;
		}

		@Override
		public Double getOrderedQuantity(String lsOrderId) {
			Double quantity = new Double(0);
			quantity= (Double) getSqlSession().selectOne(getNameSpace("getOrderedQuantity"), lsOrderId);
			return quantity;
		}

		// Update Stock	
		/*@SuppressWarnings("unchecked")
		@Override
		public boolean updateStock(List<Orders> listStock){ 
			boolean result = false;
			
			HashMap<Object, Object>param=new HashMap<Object, Object>();
			param.put("listStock", listStock);
			
			int success=(Integer)getSqlSession().update(getNameSpace("updateStock"), param);
			if(success==0)result=true;

			return result;
		}*/

		//check if there are orders that wern't saved
		@SuppressWarnings("unchecked")
		@Override
		public Integer nbOrdersNotSaved(List<Orders> ordersListImported){
			List<Orders>result=null;
			Integer nb=1;
			if(ordersListImported==null || ordersListImported.size()==0)return 0;
			HashMap<String, Object>param=new HashMap<String, Object>();
			Long userId=ordersListImported.get(0).getUserId();
			param.put("ordersListImported", ordersListImported);
			param.put("userId", userId);
			result=(List<Orders>) getSqlSession().selectList(getNameSpace("ordersListNotSaved"), param);
			if(result==null){
				nb=0;
			}else{
				nb=result.size();
			}
			return nb;
		}
		
		// getCurrencyIdByUserId
		@Override
		public Currency getCurrencyIdByUserId(Long userId) {
			Currency currency = (Currency)getSqlSession().selectOne(getNameSpace("getCurrencyIdByUserId"), userId);
			return currency;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> getEtaOrderlistByFieldName(Orders order){
			List<Orders>result=new ArrayList<Orders>();
			/*HashMap<Object, Object>param=new HashMap<Object, Object>();
			String etaFieldName=order.getEtaFieldName();
			String etaFieldValue=order.getEtaFieldValue();
			String secondEtaFieldName=order.getSecondEtaFieldName();
			String secondEtaFieldValue=order.getSecondEtaFieldValue();
			Long userId=order.getUserId();
			param.put("userId", userId);
			param.put("etaFieldName", etaFieldName);
			param.put("etaFieldValue", etaFieldValue);
			param.put("lsProductId", lsProductId);*/
			List<Orders>list=(List<Orders>)getSqlSession().selectList(getNameSpace("getEtaOrderlistByFieldName"), order);
			if(list!=null)result=list;
			return result;
		}

		@Override
		public Boolean	isThisLsOrderIdInUsed(String lsOrderId){
			boolean result=true;
			Orders order=(Orders)getSqlSession().selectOne(getNameSpace("isThisLsOrderIdInUsed"), lsOrderId);
			if(order==null)result=false;
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Orders> getOrdersByProductOrderNumberSumit(Orders order) {
			return (List<Orders>) getSqlSession().selectList(getNameSpace("getOrdersByProductOrderNumberSumit"), order);
		}
	
		
	//Created By Sumit Sarkar
	//For searching with new parameters

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> searchOrdersWithOptionsAndSortingNew(
			Date creationDateStart, Date creationDateEnd,
			Integer factorDateBetween, String userLogin, String lsOrderId,
			String status, List<Integer> listIndexColumn,
			Integer PAGE_ITEMS_COUNT, Integer indexSet,
			String productOrderNumberSearch,String clientOrderNumber,
			String clientOther) {
		
		List<Orders> result = null;
		
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("creationDateStart", creationDateStart);
		param.put("creationDateEnd", creationDateEnd);
		param.put("userLogin", userLogin);
		param.put("lsOrderId", lsOrderId);
		param.put("factorDateBetween", factorDateBetween);
		param.put("status", status);
		param.put("PAGE_ITEMS_COUNT", PAGE_ITEMS_COUNT);
		param.put("indexSet", indexSet);
		param.put("index", "0");
		param.put("listIndexColumn", listIndexColumn);
		param.put("productOrderNumber", productOrderNumberSearch);
		param.put("clientOrderNumber", clientOrderNumber);
		param.put("clientOtherId", clientOther);
		
		result = (List<Orders>) getSqlSession().selectList(getNameSpace("searchOrdersWithOptionsAndSorting"), param);
		return result;

	}

}
