/**
 * 
 */
package com.loyauty.web.struts.interceptor;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.xwork.StringEscapeUtils;
import org.apache.struts2.interceptor.validation.JSONValidationInterceptor;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ValidationAware;

/**
 * @author Arnaud
 * This interceptor give a well formed JSON string for the javascript Vanadium framework.
 * Action Errors will be transformed like this :  
 * 
 * {	
 * 		errors: ["this", "that"],	
 *      validation_failed:
 *		{
 *			field1:
 *			[{
 *				success: false, 
 *				message: "this"
 *			}],
 *			field2:
 *			[{
 *				success: false,
 *				message: "that"
 *			}]
 *		}
 * }
 */
public class VanadiumJSONValidationInterceptor extends JSONValidationInterceptor {

	@Override
	protected String buildResponse(ValidationAware validationAware) {
		//should we use FreeMarker here?
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        if (validationAware.hasErrors()) {
            //action errors
        	//action errors
            if (validationAware.hasActionErrors()) {
                sb.append("\"errors\":");
                sb.append(buildArray(validationAware.getActionErrors()));
            }

            //field errors
            if (validationAware.hasFieldErrors()) {
                if (validationAware.hasActionErrors())
                    sb.append(",");
                sb.append("\"validation_failed\": {");
                Map<String, List<String>> fieldErrors = validationAware
                    .getFieldErrors();
                for (Map.Entry<String, List<String>> fieldError : fieldErrors
                    .entrySet()) {
                    //if it is model driven, remove "model." see WW-2721
                	sb.append("\"");
                	String fieldname = validationAware instanceof ModelDriven ? fieldError.getKey().substring(6) : fieldError.getKey();
					sb.append(fieldname);
                	sb.append("\"");
                    sb.append(":");
                    sb.append(buildArray(fieldError.getValue(),fieldname));
                    sb.append(",");
                }
                //remove trailing comma, IE creates an empty object, duh
                sb.deleteCharAt(sb.length() - 1);
                sb.append("}");
            }
        }

        sb.append("}");
       
        return sb.toString();
	}
	
	private String buildArray(Collection<String> values) {
		return buildArray(values, null);
	}
	
	private String buildArray(Collection<String> values, String fieldname) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (String value : values) {
            sb.append("{\"success\": false,");
            sb.append("\"message\":\""+StringEscapeUtils.escapeJavaScript(value));
            sb.append("\"},");
        }
        if (values.size() > 0)
            sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
	
}
