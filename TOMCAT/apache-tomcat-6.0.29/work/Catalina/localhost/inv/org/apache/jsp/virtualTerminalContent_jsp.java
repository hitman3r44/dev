package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class virtualTerminalContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head><SCRIPT language=JavaScript>\r\n");
      out.write("function checkMax(textElement, maxLength){\r\n");
      out.write("\r\n");
      out.write("   if(textElement.value.length > maxLength){\r\n");
      out.write("\talert(\"The comment should not exceed 50 characters. The Comment will be automatically truncated to 50 characters\");\r\n");
      out.write("\ttextElement.value = textElement.value.slice(0,50);\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table class=\"softtable\" border=\"0\" cellpadding=\"5\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td colspan=\"2\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("   <td colspan=\"2\"><span class=\"heading\">Virtual Terminal</span></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr class=\"tdleft\"><td height=\"20px\"></td></tr>\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005ferrors_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ferrors_005f0.setParent(null);
    int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
    if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    // /virtualTerminalContent.jsp(26,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("/virtualTerminal.do");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<tr class=\"tdleft\">\r\n");
        out.write("   <td>Customer ID</td>\r\n");
        out.write("   <td><input name=\"customerID\" type=\"text\" size=\"10\"></td>\r\n");
        out.write("</tr>\r\n");
        out.write("<tr class=\"tdleft\">\r\n");
        out.write("   <td>Charge Amount</td>\r\n");
        out.write("   <td><input name=\"chargeAmount\" type=\"text\" size=\"10\"></td>\r\n");
        out.write("</tr>\r\n");
        out.write("<tr class=\"tdleft\">\r\n");
        out.write("   <td>Charge Type</td>\r\n");
        out.write("   <td>\r\n");
        out.write("      <select name=\"chargeType\">\r\n");
        out.write("         <option value=\"None\">-- Select One --</option>\r\n");
        out.write("         <option value=\"1\">Signup Authentication</option>\r\n");
        out.write("         <option value=\"2\">Non-returned Game Charge</option>\r\n");
        out.write("         <option value=\"3\">Gift Certificate Purchase</option>\r\n");
        out.write("         <option value=\"4\">Prepaid Subscription Signup</option>\r\n");
        out.write("         <option value=\"5\"> Keep It Game Charge</option>\r\n");
        out.write("        <option value=\"6\"> Buy It Game Charge</option>\r\n");
        out.write("       <option value=\"7\"> Collections Charge </option>\r\n");
        out.write("       <option value=\"8\">  Reactivate Authorization </option>\r\n");
        out.write("        <option value=\"9\">Upgrade Charge </option>\r\n");
        out.write("    </select>\r\n");
        out.write("   </td>\r\n");
        out.write("</tr>\r\n");
        out.write("<tr>\r\n");
        out.write("\t<td class=\"tdleft\">\r\n");
        out.write("\t\tComment\r\n");
        out.write("\t</td>\r\n");
        out.write("\t<td>\r\n");
        out.write("\t\t<textarea name=\"comment\" style=\"width:200;height:100\" onkeyup=\"checkMax(this,50)\"></textarea>\r\n");
        out.write("\t</td>\r\n");
        out.write("</tr>\r\n");
        out.write("<tr class=\"tdleft\"><td height=\"20px\"></td></tr>\r\n");
        out.write("<tr class=\"tdleft\">\r\n");
        out.write("   <td></td>\r\n");
        out.write("   <td><input type=\"submit\" name=\"virtualTerminal\" value=\"Charge Now\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
        out.write("</tr>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }
}
