package com.loyauty.cronjob;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.product.ProductService;
import com.loyauty.util.constant.BackEndConstants;

public class ShippingProducer {
	
	@Getter @Setter
	private List<Long> productIDSet = new ArrayList<Long>();
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	
	public ShippingProducer(List<Long> productIDSet) {
		this.productIDSet = productIDSet;
	}
	
	public void produce() {
		handleDataFile();
		handleCtrlFile();
	}
	
	private void close() {
		serviceLocator = ServiceLocator.getInstance();		
		try {
			productService = serviceLocator.getProductService();		
			for (long productID : productIDSet) {
				productService.closeProductWereWgtDimChanged(productID);
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void handleDataFile() {		
		File fileData = null;
		BufferedWriter outData = null;
		int indexData = 0;
	    try {
	    	String whereData = BackEndConstants.SHIPPING_DIR + "pids.txt";
	    	fileData = new File(whereData);
	    	if (!fileData.exists()) {
	    		fileData.createNewFile();
	    	}
	    	outData = new BufferedWriter(new FileWriter(fileData));
	    	if (productIDSet != null && productIDSet.size() > 0) {
	    		Collections.sort(productIDSet);
	    		for (long productID : productIDSet) {
	    			outData.write(productID + "\n");
	    		}	    		
	    	}
	    	outData.write("EOF\n");
	    	outData.flush();
	    	outData.close();	    	
	    } catch (IOException iox) {
	    	iox.printStackTrace();
	    } catch (Exception x) {
	    	x.printStackTrace();
	    } finally {	    	
	    	try {
	    		outData.close();
	    	} catch (IOException iox) {
	    		iox.printStackTrace();
	    	}
	    	if (((++indexData) % 100) == 0) System.gc();
	    	System.out.println("[ShippingProducer] [produce()] indexData = " + indexData);
	    }
	}
	
	private void handleCtrlFile() {		
		File fileCtrl = null;
		BufferedWriter outCtrl = null;
		int indexCtrl = 0;
	    try {
	    	String whereCtrl = BackEndConstants.SHIPPING_DIR + "ctrl.txt";	    	
	    	fileCtrl = new File(whereCtrl);
	    	if (!fileCtrl.exists()) {
	    		fileCtrl.createNewFile();
	    	}	    	
	    	outCtrl = new BufferedWriter(new FileWriter(fileCtrl));
	    	outCtrl.write(productIDSet.size() + "\n");			
	    	outCtrl.flush();
	    	outCtrl.close();			
	    } catch (IOException iox) {
	    	iox.printStackTrace();
	    } catch (Exception x) {
	    	x.printStackTrace();
	    } finally {  	
	    	try {
	    		outCtrl.close();
	    	} catch (IOException iox) {
	    		iox.printStackTrace();
	    	}
	    	if (((++indexCtrl) % 100) == 0) System.gc();
	    	System.out.println("[ShippingProducer] [produce()] indexCtrl = " + indexCtrl);
	    }
	}
	
	public static void main(String[] args) {		
		serviceLocator = ServiceLocator.getInstance();		
		try {
			productService = serviceLocator.getProductService();
			ShippingProducer producer = new ShippingProducer(productService.getWereWgtDimChanged());
			producer.produce();
			producer.close();
		} catch (ServiceException sx){
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}		
		System.exit(0);		
	}
	
}
