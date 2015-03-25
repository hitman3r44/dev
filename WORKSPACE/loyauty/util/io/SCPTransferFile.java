package com.loyauty.util.io;

import java.net.InetAddress;
import java.util.Map;

public class SCPTransferFile {
	
	
	private final static String SERVER2_PRIVATE_IP = "10.181.167.73:";
	private final static String SERVER2_IP = "50.56.94.130";
	private final static String MAIN_PATH = "/home/loyauty/";
	
	public static boolean cspTranferFileServer(Map<String, String> sources) {
		
		boolean response = false;		
		try {			
/*			InetAddress addr = InetAddress.getLocalHost();
		    byte[] ipAddr = addr.getAddress();
		    // Convert to dot representation
		    String ipAddrStr = "";
		    for (int i=0; i<ipAddr.length; i++) {
		        if (i > 0) {
		            ipAddrStr += ".";
		        }
		        ipAddrStr += ipAddr[i]&0xFF;
		    }
		    
		    System.out.print(ipAddrStr);*/
			
//		    if(!ipAddrStr.equals(SERVER2_IP)){
				for(Map.Entry<String, String> entry : sources.entrySet() ){
					String command = "scp " +  entry.getKey() + " " + SERVER2_PRIVATE_IP +
									 MAIN_PATH + entry.getValue();
					final Process process = Runtime.getRuntime().exec(command);
					int returnCode = process.waitFor();
					System.out.println("Return code = " + returnCode);
				}
//		    }
			response = true;
		
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		return response;
	}
	

}
