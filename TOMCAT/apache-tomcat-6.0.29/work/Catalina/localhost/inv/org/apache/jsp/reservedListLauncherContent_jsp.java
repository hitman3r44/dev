package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Properties;
import govojo.inventory.ReservedGameList;
import java.io.FileInputStream;

public final class reservedListLauncherContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage.release();
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

      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("<br>\r\r\n");
      out.write("\r\r\n");
      out.write("<script>\r\r\n");
      out.write("function validate(reference){\r\r\n");
      out.write("var priority = document.getElementById(\"magicPri\").value;\r\r\n");
      out.write("if(priority==\"\"){\r\r\n");
      out.write("alert(\"Please enter priority\");\r\r\n");
      out.write("return false;\r\r\n");
      out.write("}\r\r\n");
      out.write("if(isNaN(priority)){\r\r\n");
      out.write("alert(\"Please enter valid priority\");\r\r\n");
      out.write("return false;\r\r\n");
      out.write("}\r\r\n");
      out.write("reference.href=\"/inv/startReservedListContent.jsp?magicPriority=\"+priority;\r\r\n");
      out.write("}\r\r\n");
      out.write("</script>\r\r\n");
      out.write("\r\r\n");
      out.write("<!-- ");
      if (_jspx_meth_html_005flink_005f0(_jspx_page_context))
        return;
      out.write(" -->\r\r\n");
      out.write("\r\r\n");

	Properties defaultPriorityProperties = new Properties();
	defaultPriorityProperties.load(new FileInputStream("C:\\dev\\tomcat\\apache-tomcat-6.0.29\\lib" + "/govojo/inventory/defaultPriority.properties"));
	String priority = (String)defaultPriorityProperties.get("priority");
	

      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("<h3> Generate reserve List </h3>\r\r\n");
      out.write("<br>\r\r\n");
      out.write("\r\r\n");
      out.write("<table cellpaddin=\"3\">\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td>Magic Priority</td>\r\r\n");
      out.write("<td width=\"5\">&nbsp</td>\r\r\n");
      out.write("<td><input type=\"text\" name=\"magicPriority\" value=\"");
      out.print(priority);
      out.write("\" id=\"magicPri\"></td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td colspan=\"3\"></td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td colspan=\"2\">&nbsp</td>\r\r\n");
      out.write("<td align=\"right\" colspan=\"2\"> <a onClick=\"validate(this)\" target=\"new\" style=\"cursor:pointer\"> <img src='/images/button_submit.jpg'> </a></td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td colspan=\"3\">&nbsp;</td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td colspan=\"3\"><b>Edit default priority</b></td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("<tr>\r\r\n");
      out.write("<td colspan=\"3\">\r\r\n");
      out.write("\r\r\n");
      out.write("\t<form method=\"post\" action=\"editDefaultPriority.do\">\r\r\n");
      out.write("\t<table border=\"1\">\r\r\n");
      out.write("\t\t<tr>\r\r\n");
      out.write("\t\t\t<td>Priority</td>\r\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"defaultPriority\" value=\"");
      out.print(priority);
      out.write("\"></td>\r\r\n");
      out.write("\t\t</tr>\r\r\n");
      out.write("\t\t<tr>\r\r\n");
      out.write("\t\t\t<td></td>\r\r\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Make default\"></td>\r\r\n");
      out.write("\t\t</tr>\r\r\n");
      out.write("\t</table>\r\r\n");
      out.write("\t</form>\r\r\n");
      out.write("</td>\r\r\n");
      out.write("</tr>\r\r\n");
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("</table>\r\r\n");
      out.write("\t\r\r\n");
      out.write("\r\r\n");
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

  private boolean _jspx_meth_html_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent(null);
    // /reservedListLauncherContent.jsp(23,5) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setPage("/startReservedListContent.jsp");
    // /reservedListLauncherContent.jsp(23,5) name = target type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setTarget("new");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("LAUNCH RESERVED LIST");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fpage.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }
}
