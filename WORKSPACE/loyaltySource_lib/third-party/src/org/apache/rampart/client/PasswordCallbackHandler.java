/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rampart.client;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PasswordCallbackHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
    	
    	WSPasswordCallback pwcb = (WSPasswordCallback)callbacks[0];

        String id = pwcb.getIdentifier();

        // Logic to get the client password to build the username token
        if("client".equals(id)) {
        	// Your username and password are imported from the following file
        	// user.properties
        	Properties userProps = new Properties();
        	FileInputStream propInputStream;
    		try {
    			propInputStream = new FileInputStream("user.properties");
    			userProps.load(propInputStream);
    			propInputStream.close(); // better in finally block
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace(System.out);
    			return;
    		} 
        	String username = userProps.getProperty("username");
        	String password = userProps.getProperty("password");         	
        	
            pwcb.setIdentifier(username);
            pwcb.setPassword(password);
        } 
    }

}

