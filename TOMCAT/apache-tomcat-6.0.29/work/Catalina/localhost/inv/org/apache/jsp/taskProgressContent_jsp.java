package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class taskProgressContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.release();
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
      com.govojo.inv.application.ReservedListTaskBean statusBean = null;
      synchronized (session) {
        statusBean = (com.govojo.inv.application.ReservedListTaskBean) _jspx_page_context.getAttribute("statusBean", PageContext.SESSION_SCOPE);
        if (statusBean == null){
          statusBean = new com.govojo.inv.application.ReservedListTaskBean();
          _jspx_page_context.setAttribute("statusBean", statusBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<HTML%>\r\n");
      out.write("<HEAD%>\r\n");
      out.write("<TITLE%>Progress</TITLE%>\r\n");
 if (!statusBean.isCompleted()) { 
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("setTimeout(\"location='");
      if (_jspx_meth_html_005frewrite_005f0(_jspx_page_context))
        return;
      out.write("'\", 2000);\r\n");
      out.write("</SCRIPT>\r\n");
 } 
      out.write("\r\n");
      out.write("</HEAD%>\r\n");
      out.write("<BODY%>\r\n");
      out.write("<FONT FACE=\"Arial, Helvetica, Geneva\">\r\n");
 if (!statusBean.isCompleted()) { 
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("   <H1 ALIGN=\"CENTER\"%>Please wait...The reserved list is generating.<br>(This will take a few minutes)</H1>\r\n");
      out.write("   <H2 ALIGN=\"CENTER\"%>Do not close this window</H2>\r\n");
      out.write("   <br>\r\n");
      out.write("   <br>\r\n");
      out.write("   <img src=\"http://travel.priceline.com/travel/airlines/lang/en-us/images/PCLN_waitAnima2.gif\">\r\n");
      out.write("</div>\r\n");
 } else { 
      out.write("\r\n");
      out.write("   <H1 ALIGN=\"CENTER\">Reserved List Generated...</H1>\r\n");
      out.write("   <H2 ALIGN=\"CENTER\">You can close the window</H2>\r\n");
 } 
      out.write("\r\n");
      out.write("</font>\r\n");
      out.write("</BODY%>\r\n");
      out.write("</HTML%> \r\n");
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

  private boolean _jspx_meth_html_005frewrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f0 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f0.setParent(null);
    // /taskProgressContent.jsp(9,22) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f0.setPage("/taskProgressContent.jsp");
    int _jspx_eval_html_005frewrite_005f0 = _jspx_th_html_005frewrite_005f0.doStartTag();
    if (_jspx_th_html_005frewrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
    return false;
  }
}
