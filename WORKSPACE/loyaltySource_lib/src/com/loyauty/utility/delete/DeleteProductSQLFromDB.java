package com.loyauty.utility.delete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;

public class DeleteProductSQLFromDB {
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public static void main(String[] args) {		
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();						
			
			File file = new File("C:\\DELETE_product_1000_1000.sql");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write("BEGIN;\n");
			out.write("SAVEPOINT sql_updates;\n");
			List<ProductDTO> productDTOList = null;

			String queryAlterProductXML = "";
			String queryAlterUserProductXML = "";
			String queryLink = "";
			String queryModelNumber = "";
			String queryShippingCity = "";
			String queryShippingProvince = "";
			String queryShippingTotal = "";
			String queryUserProductPrice = "";
			String queryStock = "";
			String queryOrdersRows = "";
			String queryInvoicingOrders = "";
			String queryProduct = "";
			
			long productID = 0L;
			
			productDTOList = new ArrayList<ProductDTO>();
			productDTOList = productService.getProductBetween(1000L, 1000L);
			
			for (ProductDTO productDTO : productDTOList) {
				productID = productDTO.getId();
				
				System.out.println("productID = " + productID);				
				
				queryAlterProductXML = "delete from alter_product_xml where product_id = " + productID;
				out.write(queryAlterProductXML + ";\n");
				
				queryAlterUserProductXML = "delete from alter_user_product_xml where product_id = " + productID;
				out.write(queryAlterUserProductXML + ";\n");
				
				queryLink = "delete from product_link where product_id = " + productID;
				out.write(queryLink + ";\n");
				
				queryModelNumber = "delete from product_model_number where product_id = " + productID;
				out.write(queryModelNumber + ";\n");
				
				queryShippingCity = "delete from shipping_city where product_id = " + productID;
				out.write(queryShippingCity + ";\n");
				
				queryShippingProvince = "delete from shipping_province where product_id = " + productID;
				out.write(queryShippingProvince + ";\n");
				
				queryShippingTotal = "delete from shipping_total where product_id = " + productID;
				out.write(queryShippingTotal + ";\n");
				
				queryUserProductPrice = "delete from user_product_price where product_id = " + productID;
				out.write(queryUserProductPrice + ";\n");
				
				queryStock = "delete from stock where product_id = " + productID;
				out.write(queryStock + ";\n");
				
				queryOrdersRows = "delete from orders_rows where product_id = " + productID;
				out.write(queryOrdersRows + ";\n");
				
				queryInvoicingOrders = "delete from invoicing_orders where product_id = " + productID;
				out.write(queryInvoicingOrders + ";\n");
				
				queryProduct = "delete from product where id = " + productID;
				out.write(queryProduct + ";\n\n");
				
			}
			
			out.write("RELEASE SAVEPOINT sql_updates;\n");
			out.write("COMMIT;\n");
			
			out.flush();
			out.close();			
			
		} catch (IOException iox) {
			iox.printStackTrace();			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
}
