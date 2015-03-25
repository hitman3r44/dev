package com.loyauty.util.exception;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.log4j.Logger;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.init.ConfigService;
import com.loyauty.util.communication.Mail;

/**
 * Handle exceptions
 *
 */
public class ExceptionHandler {

	private static final Logger LOG = Logger.getLogger(Mail.class);
	private static ConfigService configService;
	static {
		try {
			configService = ServiceLocator.getInsance().getConfigService();
		} catch (ServiceLocatorException e) {
			LOG.error("A problem has happened while looking up the config service.", e);
		}
	}
   /** the default email address to send debug messages */
   public static final String[] defaultDebuggersEmail = configService.getMailDefaultDebugger();
   
   private static final Logger log = Logger.getLogger(Mail.class);
   
   private static final boolean sendMail = true;
   
   private static final boolean traceError = true;

   /** handle exception and send the message to the defaultDebuggersEmail */
   public static void handleException(Exception e, String desc, String var)
   {
	  if(traceError)
		  log.error(e.getMessage() + "VAR: " + var);
	  if(sendMail)
		  handleException(e, desc, defaultDebuggersEmail,var);
   }
   
   /** handle exception and send the message to the defaultDebuggersEmail */
   public static void handleException(Exception e,Class c, String desc, String var)
   {
	  if(traceError) 
		  log.error(e.getMessage() + "VAR: " + var);
	  if(sendMail)
		  handleException(e, c.toString() + ": " +  desc, defaultDebuggersEmail,var);
   }
   
   public static void handleException(Exception e, String desc)
   {
	  if(traceError) 
		  log.error(e.getMessage());
	  if(sendMail)
		  handleException(e, desc, defaultDebuggersEmail,null);
   }

   /** handle exception by getting info about the exception, the
    * stack trace, what machine it is on, and send that to standard
    * out (System.out) and email alertWhom
    */
   public static void handleException(Throwable e, String desc,
                                      String[] alertWhom, String var)
   {
      String eMessage     = e.getMessage();
      String eClass       = e.getClass().getName();
      String stackTrace   = getStackTrace(e);
      String computerName = getHostName().toUpperCase();

      String date         = (new Date(System.currentTimeMillis())).toString();
      String time         = (new Time(System.currentTimeMillis())).toString();

      String subject = computerName+": "+eClass+": "+eMessage;
      String body    =
        "Caught Exception: "+eClass+":\n"+
        " "+eMessage+" on "+computerName+" at "+time+" on "+date+"\n"+
        " "+stackTrace;

      if((eMessage != null) &&
         (!eMessage.equals(e.getLocalizedMessage())))
      {
         body +=" Localized Message: "+ e.getLocalizedMessage()+"\n";
      }

      if (e instanceof SQLException)
      {
         SQLException e2 = (SQLException) e;
         body +=" SQLState         : "+e2.getSQLState()+"\n";
         body +=" ErrorCode        : "+e2.getErrorCode()+"\n";

         // get the whole chain of exceptions
         while((e2 = e2.getNextException()) != null)
         {
            body +=" Chained Exception: "+e2.toString();
            body +=" SQLState         : "+e2.getSQLState()+"\n";
            body +=" ErrorCode        : "+e2.getErrorCode()+"\n";
         }
      }

      body +=" Description      : "+desc+"\n";
      
      body +=" \nVariables      : "+var+"\n";

      // output the results
      //System.out.println(body);
      try
      {
    	  Mail.send(alertWhom, subject, body);
      }
      catch(Exception ex)
      {
    	  log.error("Alert FAILED to send!", ex);
      }

      
   }

   /** from an exception, get the stack trace as a string */
   public static String getStackTrace(Throwable e)
   {
       // create a place to put the output
       ByteArrayOutputStream output = new ByteArrayOutputStream();

       // run the output
       e.printStackTrace(new PrintStream(output));

       return output.toString();
   }

   /** get the current machine's name */
   public static String getHostName()
   {
      String computerName;
      try
      {
         java.net.InetAddress addr = java.net.InetAddress.getLocalHost();
         computerName=addr.getHostName();
      }
      catch(java.net.UnknownHostException exception)
      {
         computerName="Unknown";
      }
      return computerName;
   }


   public static void main (String args[])
   {
      try
      {
         int num= 5/0;
      }
      catch(Exception e)
      {
         handleException(e, null, "main:Description text goes here");
      }
   }
}

