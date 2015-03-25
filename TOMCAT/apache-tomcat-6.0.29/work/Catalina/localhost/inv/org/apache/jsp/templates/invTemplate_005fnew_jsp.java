package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.govojo.inv.application.SessionUtils;

public final class invTemplate_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/govojo.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");

	if(session.getAttribute(SessionUtils.USER) == null){
	
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">window.location=\"http://\"+window.location.host+\"/inv/logon.jsp\";</script>\r\n");
      out.write("\t");

	}else{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Customer Service Interface</title>\r\n");
      out.write("  <script language=\"text/javascript src=\"/js/main.js\"></script>\r\n");
      out.write("  <link href=\"stylesheets/main.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width = 100%>\r\n");
      out.write("   <tr valign='top'>\r\n");
      out.write("      <td><table cellspacing = 0 cellpadding = 0>\r\n");
      out.write("            <tr><td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("</td></tr>\r\n");
      out.write("            <tr><td>");
      if (_jspx_meth_template_005fget_005f0(_jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("            <tr><td>");
      if (_jspx_meth_template_005fget_005f1(_jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("          </table>\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr> \r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
 }


      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_template_005fget_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.taglib.template.GetTag _jspx_th_template_005fget_005f0 = (org.apache.struts.taglib.template.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.get(org.apache.struts.taglib.template.GetTag.class);
    _jspx_th_template_005fget_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f0.setParent(null);
    // /templates/invTemplate_new.jsp(26,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fget_005f0.setName("content");
    int _jspx_eval_template_005fget_005f0 = _jspx_th_template_005fget_005f0.doStartTag();
    if (_jspx_th_template_005fget_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.taglib.template.GetTag _jspx_th_template_005fget_005f1 = (org.apache.struts.taglib.template.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.get(org.apache.struts.taglib.template.GetTag.class);
    _jspx_th_template_005fget_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f1.setParent(null);
    // /templates/invTemplate_new.jsp(27,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fget_005f1.setName("footer");
    int _jspx_eval_template_005fget_005f1 = _jspx_th_template_005fget_005f1.doStartTag();
    if (_jspx_th_template_005fget_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
    return false;
  }
}
