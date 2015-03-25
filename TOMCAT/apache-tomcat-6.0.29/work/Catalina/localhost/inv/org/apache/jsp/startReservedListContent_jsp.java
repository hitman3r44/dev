package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startReservedListContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 session.removeAttribute("statusBean"); 
      out.write('\r');
      out.write('\n');
      com.govojo.inv.application.ReservedListTaskBean statusBean = null;
      synchronized (session) {
        statusBean = (com.govojo.inv.application.ReservedListTaskBean) _jspx_page_context.getAttribute("statusBean", PageContext.SESSION_SCOPE);
        if (statusBean == null){
          statusBean = new com.govojo.inv.application.ReservedListTaskBean();
          _jspx_page_context.setAttribute("statusBean", statusBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write(" #1\r\n");
 
int magicPriority = 5;
if(request.getParameter("magicPriority") != null){
			 try{
				 magicPriority = Integer.parseInt(request.getParameter("magicPriority"));
			 }catch (Exception e) {
				magicPriority = 5;
			}
}
 statusBean.setMagicPriority(magicPriority);
 
 System.out.print("------------- calling statusBean start -------");
new Thread(statusBean).start(); 

      out.write(" #2\r\n");
      if (true) {
        _jspx_page_context.forward("taskProgressContent.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
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
