package ca.canadapost.cpcdp.rating;

import java.math.BigDecimal;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import ca.canadapost.cpcdp.rating.stub.RatingServiceStub;
import ca.canadapost.cpcdp.rating.stub.RatingServiceStub.*;

/**
 * Sample code for the GetRates Canada Post service.
 * <p>
 * The GetRates service returns a list of shipping services, prices and transit times 
 * for a given item to be shipped. 
 * <p>
 * This sample is configured to access the Developer Program sandbox environment. 
 * Use your development key username and password for the web service credentials.
 */

public class GetRatesClient {
	
	// PRODUCTION
	public static final String USERNAME = "e4f6d7360be66a55";
	public static final String PASSWORD = "11c99dc3aa58a0c2fc2b08";
	
	//DEVELOPMENT
	// public static final String USERNAME = "9cb87491648f8cba";
	// public static final String PASSWORD = "0bd92f4930e99edef5f8d0";
	
	
	public static final String CUSTOMER_NUMBER = "0007310723";
	public static final String CONTRACT_ID = "0042100528";
		
	// PRODUCTION
	public static final String TARGET_END_POINT = "https://soa-gw.canadapost.ca/rs/soap/rating";
	
	// DEVELOPMENT
	// public static final String TARGET_END_POINT = "https://ct.soa-gw.canadapost.ca/rs/soap/rating";
	
	
	private BigDecimal shippingRate = new BigDecimal(0.0);
	private String postalCodeOrigin;
	private String postalCodeDestination;
	private int weight;
	private int length;
	private int width;
	private int height;
	
	public GetRatesClient(String postalCodeOrigin, String postalCodeDestination, 
			int weight, int length, int width, int height) {
		this.postalCodeOrigin = postalCodeOrigin;
		this.postalCodeDestination = postalCodeDestination;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public static void main(String... args) {
		try {
			new GetRatesClient("H4C3C5", "V9T2C8", 25, 14, 13, 13).getRates();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    // Main class for local testing only
	public BigDecimal getRates() {
		
		weight = (weight > 30) ? 30 : weight;
		weight = (weight == 0) ? 1 : weight;
		length = (length == 0) ? 1 : length;
		width = (width == 0) ? 1 : width;
		height = (height == 0) ? 1 : height;
		
		ConfigurationContext ctx = null;
		RatingServiceStub stub = null;
		GetRatesRequest req = null;
		Dimensions_type0 dimensions = null;
		DimensionMeasurementType dmtL = null;
		DimensionMeasurementType dmtW = null;
		DimensionMeasurementType dmtH = null;
		BigDecimal lengthBD = null;
		BigDecimal widthBD = null;
		BigDecimal heightBD = null;
		GetRatesResponse res = null;
        try {
        	
        	// Load Axis2 and Rampart Configuration
        	//ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("third-party/repo", "third-party/conf/client.axis2.xml");
        	
        	 ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("/usr/apache-tomcat-7.0.27/webapps/third-party/repo", 
        	 			"/usr/apache-tomcat-7.0.27/webapps/third-party/conf/client.axis2.xml");
        	

        	// Create Request
        	stub = new RatingServiceStub(ctx, TARGET_END_POINT);
        	req = new GetRatesRequest();
        	req.setLocale(new Locale());
        	req.setMailingScenario(new MailingScenario_type0());
        	req.getMailingScenario().setContractId(new ContractIDType());
        	req.getMailingScenario().setCustomerNumber(new CustomerIDType());
        	req.getMailingScenario().setParcelCharacteristics(new ParcelCharacteristics_type0());
        	req.getMailingScenario().getParcelCharacteristics().setWeight(new Weight_type1());
        	req.getMailingScenario().setOriginPostalCode(new PostalCodeType());
        	req.getMailingScenario().setDestination(new Destination_type0());
        	req.getMailingScenario().getDestination().setDomestic(new Domestic_type0());
        	req.getMailingScenario().getDestination().getDomestic().setPostalCode(new PostalCodeType());
        	
        	dimensions = new Dimensions_type0();
        	dmtL = new DimensionMeasurementType();
        	dmtW = new DimensionMeasurementType();
        	dmtH = new DimensionMeasurementType();
        	lengthBD = new BigDecimal(length);
        	widthBD = new BigDecimal(width);
        	heightBD = new BigDecimal(height);
        	dmtL.setDimensionMeasurementType(lengthBD);
        	dmtW.setDimensionMeasurementType(widthBD);
        	dmtH.setDimensionMeasurementType(heightBD);
        	dimensions.setLength(dmtL);
        	dimensions.setWidth(dmtW);
        	dimensions.setHeight(dmtH);
        	req.getMailingScenario().getParcelCharacteristics().setDimensions(dimensions);
        	
        	req.getLocale().setLocale("en");
        	req.getMailingScenario().getCustomerNumber().setCustomerIDType(CUSTOMER_NUMBER);
        	req.getMailingScenario().getContractId().setContractIDType(CONTRACT_ID);
        	req.getMailingScenario().getParcelCharacteristics().getWeight().setWeight_type0(new BigDecimal(weight));   	
        	req.getMailingScenario().getOriginPostalCode().setPostalCodeType(postalCodeOrigin);
        	req.getMailingScenario().getDestination().getDomestic().getPostalCode().setPostalCodeType(postalCodeDestination);
            
        	// Execute Request
            res = stub.getRates(req);
            
            String serviceCode = "";
            // Retrieve values from response object
            if (res.isPriceQuotesSpecified()) {
                for ( int i = 0; i < res.getPriceQuotes().getPriceQuote().length; i++) {
	                serviceCode = res.getPriceQuotes().getPriceQuote()[i].getServiceCode().toString();
	                if (serviceCode.equalsIgnoreCase("DOM.EP")) {
	                	shippingRate = res.getPriceQuotes().getPriceQuote()[i].getPriceDetails().getDue();
	                }
                }
            } else {
            	// Assume Error
            	for ( int i = 0; i < res.getMessages().getMessage().length; i++) {
                    System.out.println("Error Code: " + res.getMessages().getMessage()[i].getCode());
                    System.out.println("Error Msg: " + res.getMessages().getMessage()[i].getDescription());            		
            	}          	        	
            }
        } catch(AxisFault e) {
        	// SOAP Fault
            System.out.println("Fault Code: " + e.getFaultCode());
            System.out.println("Fault Reason: " + e.getMessage().trim()); 		
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
        return shippingRate;
    }
}