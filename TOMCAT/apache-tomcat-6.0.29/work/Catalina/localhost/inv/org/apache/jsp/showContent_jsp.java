package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.release();
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
      out.write("<br>\r\r\n");
      out.write("<h2>");
      if (_jspx_meth_html_005flink_005f0(_jspx_page_context))
        return;
      out.write("</h2>\r\r\n");
      out.write("\r\r\n");
      out.write("<p align=\"center\">Game Properties </p>\r\r\n");
      out.write("\r\r\n");
      out.write("Name = ");
      out.print( request.getAttribute("name") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Console = ");
      out.print( request.getAttribute("console") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Genre = ");
      out.print( request.getAttribute("genre") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Rental Status = ");
      out.print( request.getAttribute("descStatus") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Publisher = ");
      out.print( request.getAttribute("publisher") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Developer = ");
      out.print( request.getAttribute("developer") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Release Date = ");
      out.print( request.getAttribute("releaseDate") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Retail Price = ");
      out.print( request.getAttribute("retailPrice") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Number of Players = ");
      out.print( request.getAttribute("numPlayers") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Number of Discs = ");
      out.print( request.getAttribute("numDiscs") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("\r\r\n");
      out.write("Purchase Availability = ");
      out.print( request.getAttribute("purchaseAvailability") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("New Copy Price = ");
      out.print( request.getAttribute("newCopyPrice") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Used Copy Price = ");
      out.print( request.getAttribute("usedCopyPrice") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Copies Left = ");
      out.print( request.getAttribute("copiesLeft") );
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("UPC = ");
      out.print( request.getAttribute("UPC") );
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Date Created = ");
      out.print( request.getAttribute("timestamp") );
      out.write("\r\r\n");
      out.write("\r\r\n");
      out.write("<br>\r\r\n");
      out.write("Long Description = ");
      out.print( request.getAttribute("longDesc") );
      out.write("\r\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<h3><u>Multiplayer Info</u></h3>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Local Multiplayer = ");
      out.print( request.getAttribute("localMultiplayer") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Local Co-op = ");
      out.print( request.getAttribute("localCoOp") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Local Network = ");
      out.print( request.getAttribute("localNetwork") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Online Multiplayer = ");
      out.print( request.getAttribute("onlineMultiplayer") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Online Co-Op = ");
      out.print( request.getAttribute("onlineCoOp") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3><u>Additional Details</u></h3>\r\n");
      out.write("<br>\r\n");
      out.write("Audio Type = ");
      out.print( request.getAttribute("audioType") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("HDTV Type = ");
      out.print( request.getAttribute("hdtvType") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("AccessoryType = ");
      out.print( request.getAttribute("accessoryType") );
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Other Features = ");
      out.print( request.getAttribute("otherFeatures") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\r\n");
      out.write("<img src=\"");
      out.print(request.getAttribute("image") );
      out.write("\"/>\r\r\n");
      out.write("\r\r\n");
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
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent(null);
    // /showContent.jsp(5,4) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setPage("/getInventoryList.do");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("Back");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }
}
