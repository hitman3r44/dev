package com.loyauty.cronjob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.loyauty.exception.ServiceException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.util.constant.BackEndConstants;

public class NewUsersShippingTransfer {	
	
	private static final String whereData = BackEndConstants.SHIPPING_DIR + "newusers.txt";
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static UserService userService;
	
	public static void main(String[] args) {
		new NewUsersShippingTransfer().transfer();	
		System.exit(0);
	}
	
	public void transfer() {
		serviceLocator = ServiceLocator.getInstance();		
		try {
			productService = serviceLocator.getProductService();
			userService = serviceLocator.getUserService();
			
			List<Long> userIDList = getUserListFromNewUserFile();
			UserDTO newUserDTO = null;
			long clientCategoryID = 0L;
			if (userIDList != null && userIDList.size() > 0) {
				int count = 1;
				for (long userID : userIDList) {
					newUserDTO = userService.getUserInformation(userID);
					clientCategoryID = newUserDTO.getClientCategoryId();					
					productService.transferToUser(clientCategoryID, userID);
					rewriteFileWithout(userID);
					++count;
				}
			}			
		} catch(ServiceException e) {
			e.printStackTrace();
		} catch (IOException iox) {
			iox.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private List<Long> getUserListFromNewUserFile() throws IOException {
		List<Long> idList = new ArrayList<Long>();
		Set<Long> idSet = new HashSet<Long>();
	    File file = new File(whereData);
	    BufferedReader brNewUsers;
		try {
			brNewUsers = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = brNewUsers.readLine()) != null) {
				if (!line.matches("^\\s*$") 
						&& line.matches("^[0-9]+$")
						&& !line.equalsIgnoreCase("0")) {
					idSet.add(Long.parseLong(line));
				}
			}
			brNewUsers.close();			
		} catch (FileNotFoundException fnfx) {
			fnfx.printStackTrace();
		} catch (IOException iox) {
			iox.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		if (idSet != null && idSet.size() > 0) {			
			for (Iterator<Long> dataIter =	idSet.iterator(); dataIter.hasNext();) {
				idList.add(dataIter.next());
			}
			Collections.sort(idList);
		}
		return idList;		
	}
	
	private void rewriteFileWithout(long valueToBeRemoved) {
		long[] removingArray = new long[] { valueToBeRemoved };
		rewriteFileWithout(removingArray, whereData);
	}
	
    private void rewriteFileWithout(long[] remover, String where) {
    	if (remover != null) {
    		if (remover.length > 0) {				
    			for (int idx = 0; idx < remover.length; idx++) {
    				deleteLineFromFile(where, String.valueOf(remover[idx]));
    			}
    		}
    	}
    }
    
	private void deleteLineFromFile(String fileWithPath, String lineToRemove) {
		try {
			File inFile = new File(fileWithPath);
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
			BufferedReader br = new BufferedReader(new FileReader(fileWithPath));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				if (!line.trim().equalsIgnoreCase(lineToRemove)) {
					pw.println(line);
					pw.flush();
				}
			}
			pw.close();
			br.close();
			inFile.delete();
			tempFile.renameTo(inFile);
		} catch (IOException iox) {
			iox.printStackTrace();
		}
	}
	
}
