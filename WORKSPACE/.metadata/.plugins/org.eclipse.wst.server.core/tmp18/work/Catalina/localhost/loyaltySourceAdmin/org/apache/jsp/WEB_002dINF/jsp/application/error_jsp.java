package org.apache.jsp.WEB_002dINF.jsp.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("<br/><br/><br/><br/><br/>\n");
      out.write("<table align=\"center\" height=\"500px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("  \t\t border-bottom: 1px solid #CCCCCC;border-top: 2px solid #CCCCCC;\">\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("  \t<th width=\"20px\"></th>\n");
      out.write("  \t<th width=\"50px\"><img id=\"error_id\" src=\"/images/request_error.png\" alt=\"error\"></th>\n");
      out.write("    <th style=\"padding-bottom:5px;font-family: 'Yanone Kaffeesatz';font-size:36px;font-weight:500;\">Resource not found</th>\n");
      out.write("    <th width=\"20px\"></th>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr height=\"60px\">\n");
      out.write("  \t<td width=\"20px\"/>\n");
      out.write("    <td style=\"font-size:14px;margin:0px 0px 20px 20px;padding:10px;background-color:#f3f3f3;width:310px;\" colspan=\"2\" >\n");
      out.write("    You are looking for a page that is not available or has been removed !\n");
      out.write("    </td>\n");
      out.write("    <td width=\"20px\"/>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td width=\"20px\"/>\n");
      out.write("    <td height=\"70%\" colspan=\"2\"></td>\n");
      out.write("    <td width=\"20px\"/>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
