package com.loyauty.web.listener.application;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.loyauty.exception.InitializationException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.init.ConfigService;

/**
 * Initializing Loyalty's configuration.
 *    
 * @author Muthanna
 *
 */
public class LoyautyContextListener implements ServletContextListener{

	private static final String A_PROBLEM_LOOKING = "A problem has happened while looking up the config service.";
	private static final String A_PROBLEM_ACCESSING = "A problem has happened while accessing the config service.";
	private static Logger log = Logger.getLogger(LoyautyContextListener.class);
	@Override
	public void contextInitialized(ServletContextEvent arg0) {		
		try {
			if(log.isInfoEnabled()){
				log.info("Calling config service...");
			}			
			ConfigService configService = ServiceLocator.getInstance().getConfigService();
			configService.initialize();
		} catch (InitializationException ie) {
			log.error(A_PROBLEM_ACCESSING, ie);
			// The application shouldn't continue if something goes wrong
			System.exit(1);			
		}catch (ServiceLocatorException sle) {
			log.error(A_PROBLEM_LOOKING, sle);
			// The application shouldn't continue if something goes wrong
			System.exit(1);
		}		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try{
			if(log.isInfoEnabled()){
				log.info("Destroying Loyalty context listener...");
			}
			
			ConfigService configService = ServiceLocator.getInstance().getConfigService();
			configService.shutdown();
		}catch (ServiceLocatorException sle) {
			log.error(A_PROBLEM_LOOKING, sle);			
		}	
		
		
		
		
	}

}
