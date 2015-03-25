package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editUsedGamesForSaleContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a name=\"top\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/govojo.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/processUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Click on <b>Process</b> to update the catalog with the following information:</td>\r\n");
      out.write("\t<td><input type=\"submit\" value=\"Process\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr colspan=\"2\">\r\n");
      out.write("\t<td>(Note: Please update all the information before processing it.)</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2>Used Games</h2>\r\n");
      out.write("<a href=\"#gc\">GameCube</a> | <a href=\"#ps2\">PlayStation 2</a> | <a href=\"#xbox\">XBOX</a> |  <a href=\"#psp\">Sony PSP</a> | <a href=\"#ds\">Nintendo DS</a> | <a href=\"#xbox360\">Xbox 360</a> | <a href=\"#ps3\">PlayStation 3</a>|<a href=\"#wii\">Nintendo WII</a>|<a href=\"#ds3\">Nintendo 3DS</a>|<a href=\"#psvita\">PS Vita</a>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Gamecube games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("     \r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"gc\">GameCube</a></td>    \r\n");
      out.write("      <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td> \r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
 int x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /editUsedGamesForSaleContent.jsp(58,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("item");
      // /editUsedGamesForSaleContent.jsp(58,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setName("gc");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(60,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(60,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setName("item");
          // /editUsedGamesForSaleContent.jsp(60,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(60,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(61,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(61,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setName("item");
          // /editUsedGamesForSaleContent.jsp(61,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(61,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(62,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(62,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setName("item");
          // /editUsedGamesForSaleContent.jsp(62,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(62,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(63,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(63,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setName("item");
          // /editUsedGamesForSaleContent.jsp(63,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(63,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(64,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(64,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setName("item");
          // /editUsedGamesForSaleContent.jsp(64,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(64,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(65,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(65,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setName("item");
          // /editUsedGamesForSaleContent.jsp(65,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(65,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /editUsedGamesForSaleContent.jsp(66,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(66,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setName("item");
          // /editUsedGamesForSaleContent.jsp(66,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(66,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n");
      out.write("<tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  </td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write(" </form> \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("    \r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#0066CC\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ps2\">PlayStation 2</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f1.setParent(null);
      // /editUsedGamesForSaleContent.jsp(121,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setId("item");
      // /editUsedGamesForSaleContent.jsp(121,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setName("ps2");
      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f1.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(122,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(122,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setName("item");
          // /editUsedGamesForSaleContent.jsp(122,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(122,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(123,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(123,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setName("item");
          // /editUsedGamesForSaleContent.jsp(123,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(123,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(124,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(124,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setName("item");
          // /editUsedGamesForSaleContent.jsp(124,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(124,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(125,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(125,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setName("item");
          // /editUsedGamesForSaleContent.jsp(125,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(125,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f11 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f11.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(126,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(126,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setName("item");
          // /editUsedGamesForSaleContent.jsp(126,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(126,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f11 = _jspx_th_bean_005fdefine_005f11.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f12 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f12.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(127,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(127,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setName("item");
          // /editUsedGamesForSaleContent.jsp(127,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(127,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f12 = _jspx_th_bean_005fdefine_005f12.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f13 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f13.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /editUsedGamesForSaleContent.jsp(128,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(128,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setName("item");
          // /editUsedGamesForSaleContent.jsp(128,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(128,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f13 = _jspx_th_bean_005fdefine_005f13.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("    \r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
      out.write("\r\n");
      out.write("\t<tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">\t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write(" </form> \r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Xbox games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"xbox\">XBox</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f2.setParent(null);
      // /editUsedGamesForSaleContent.jsp(185,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setId("item");
      // /editUsedGamesForSaleContent.jsp(185,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setName("xbox");
      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f2.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("  \t  ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f14 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f14.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(186,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(186,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setName("item");
          // /editUsedGamesForSaleContent.jsp(186,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(186,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f14 = _jspx_th_bean_005fdefine_005f14.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f15 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f15.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(187,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(187,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setName("item");
          // /editUsedGamesForSaleContent.jsp(187,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(187,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f15 = _jspx_th_bean_005fdefine_005f15.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f16 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f16.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(188,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(188,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setName("item");
          // /editUsedGamesForSaleContent.jsp(188,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(188,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f16 = _jspx_th_bean_005fdefine_005f16.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f17 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f17.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(189,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(189,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setName("item");
          // /editUsedGamesForSaleContent.jsp(189,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(189,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f17 = _jspx_th_bean_005fdefine_005f17.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f18 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f18.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(190,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(190,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setName("item");
          // /editUsedGamesForSaleContent.jsp(190,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(190,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f18 = _jspx_th_bean_005fdefine_005f18.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f19 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f19.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(191,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(191,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setName("item");
          // /editUsedGamesForSaleContent.jsp(191,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(191,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f19 = _jspx_th_bean_005fdefine_005f19.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f20 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f20.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /editUsedGamesForSaleContent.jsp(192,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(192,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setName("item");
          // /editUsedGamesForSaleContent.jsp(192,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(192,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f20 = _jspx_th_bean_005fdefine_005f20.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
      out.write("\r\n");
      out.write("\t<tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Sony PSP games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"psp\">Sony PSP</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write(" <tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f3.setParent(null);
      // /editUsedGamesForSaleContent.jsp(248,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setId("item");
      // /editUsedGamesForSaleContent.jsp(248,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setName("psp");
      int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f3.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("     \r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f21 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f21.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(250,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(250,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setName("item");
          // /editUsedGamesForSaleContent.jsp(250,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(250,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f21 = _jspx_th_bean_005fdefine_005f21.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f22 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f22.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(251,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(251,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setName("item");
          // /editUsedGamesForSaleContent.jsp(251,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(251,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f22 = _jspx_th_bean_005fdefine_005f22.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f23 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f23.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(252,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(252,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setName("item");
          // /editUsedGamesForSaleContent.jsp(252,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(252,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f23 = _jspx_th_bean_005fdefine_005f23.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f24 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f24.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(253,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(253,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setName("item");
          // /editUsedGamesForSaleContent.jsp(253,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(253,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f24 = _jspx_th_bean_005fdefine_005f24.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f25 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f25.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(254,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(254,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setName("item");
          // /editUsedGamesForSaleContent.jsp(254,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(254,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f25 = _jspx_th_bean_005fdefine_005f25.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f26 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f26.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(255,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(255,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setName("item");
          // /editUsedGamesForSaleContent.jsp(255,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(255,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f26 = _jspx_th_bean_005fdefine_005f26.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f27 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f27.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /editUsedGamesForSaleContent.jsp(256,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(256,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setName("item");
          // /editUsedGamesForSaleContent.jsp(256,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(256,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f27 = _jspx_th_bean_005fdefine_005f27.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
      out.write("\r\n");
      out.write(" <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo DS games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ds\">Nintendo DS</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f4.setParent(null);
      // /editUsedGamesForSaleContent.jsp(310,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setId("item");
      // /editUsedGamesForSaleContent.jsp(310,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setName("ds");
      int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f4.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f28 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f28.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(311,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(311,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setName("item");
          // /editUsedGamesForSaleContent.jsp(311,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(311,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f28 = _jspx_th_bean_005fdefine_005f28.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f29 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f29.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(312,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(312,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setName("item");
          // /editUsedGamesForSaleContent.jsp(312,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(312,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f29 = _jspx_th_bean_005fdefine_005f29.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f30 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f30.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(313,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(313,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setName("item");
          // /editUsedGamesForSaleContent.jsp(313,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(313,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f30 = _jspx_th_bean_005fdefine_005f30.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f31 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f31.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(314,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(314,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setName("item");
          // /editUsedGamesForSaleContent.jsp(314,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(314,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f31 = _jspx_th_bean_005fdefine_005f31.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f32 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f32.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(315,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(315,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setName("item");
          // /editUsedGamesForSaleContent.jsp(315,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(315,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f32 = _jspx_th_bean_005fdefine_005f32.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f33 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f33.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(316,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(316,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setName("item");
          // /editUsedGamesForSaleContent.jsp(316,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(316,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f33 = _jspx_th_bean_005fdefine_005f33.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f34 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f34.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /editUsedGamesForSaleContent.jsp(317,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(317,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setName("item");
          // /editUsedGamesForSaleContent.jsp(317,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(317,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f34 = _jspx_th_bean_005fdefine_005f34.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
      out.write("\r\n");
      out.write(" <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Xbox 360 games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#E6E6FA\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"xbox360\">Xbox 360</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f5 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f5.setParent(null);
      // /editUsedGamesForSaleContent.jsp(371,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setId("item");
      // /editUsedGamesForSaleContent.jsp(371,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setName("xbox360");
      int _jspx_eval_logic_005fiterate_005f5 = _jspx_th_logic_005fiterate_005f5.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f5.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f35 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f35.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(373,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(373,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setName("item");
          // /editUsedGamesForSaleContent.jsp(373,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(373,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f35 = _jspx_th_bean_005fdefine_005f35.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f35);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f35);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f36 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f36.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(374,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(374,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setName("item");
          // /editUsedGamesForSaleContent.jsp(374,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(374,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f36 = _jspx_th_bean_005fdefine_005f36.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f36);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f36);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f37 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f37.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(375,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(375,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setName("item");
          // /editUsedGamesForSaleContent.jsp(375,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(375,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f37 = _jspx_th_bean_005fdefine_005f37.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f38 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f38.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(376,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(376,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setName("item");
          // /editUsedGamesForSaleContent.jsp(376,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(376,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f38 = _jspx_th_bean_005fdefine_005f38.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f39 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f39.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(377,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(377,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setName("item");
          // /editUsedGamesForSaleContent.jsp(377,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(377,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f39 = _jspx_th_bean_005fdefine_005f39.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f40 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f40.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(378,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(378,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setName("item");
          // /editUsedGamesForSaleContent.jsp(378,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(378,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f40 = _jspx_th_bean_005fdefine_005f40.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f40);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f40);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f41 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f41.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /editUsedGamesForSaleContent.jsp(379,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(379,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setName("item");
          // /editUsedGamesForSaleContent.jsp(379,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(379,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f41 = _jspx_th_bean_005fdefine_005f41.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f41);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f41);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f5.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f5);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f5);
      out.write("\r\n");
      out.write(" <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  \r\n");
      out.write("  <!-- =====================================================KTPL=(PLAYSTATIOn 3)  Date:2006-10-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save PlayStation 3 games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ps3\">PlayStation 3</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f6 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f6.setParent(null);
      // /editUsedGamesForSaleContent.jsp(434,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setId("item");
      // /editUsedGamesForSaleContent.jsp(434,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setName("ps3");
      int _jspx_eval_logic_005fiterate_005f6 = _jspx_th_logic_005fiterate_005f6.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f6.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("     \r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f42 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f42.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(436,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(436,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setName("item");
          // /editUsedGamesForSaleContent.jsp(436,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(436,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f42 = _jspx_th_bean_005fdefine_005f42.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f42);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f42);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f43 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f43.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(437,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(437,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setName("item");
          // /editUsedGamesForSaleContent.jsp(437,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(437,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f43 = _jspx_th_bean_005fdefine_005f43.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f43);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f43);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f44 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f44.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(438,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(438,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setName("item");
          // /editUsedGamesForSaleContent.jsp(438,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(438,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f44 = _jspx_th_bean_005fdefine_005f44.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f44);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f44);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f45 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f45.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(439,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(439,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setName("item");
          // /editUsedGamesForSaleContent.jsp(439,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(439,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f45 = _jspx_th_bean_005fdefine_005f45.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f45);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f45);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f46 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f46.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(440,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(440,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setName("item");
          // /editUsedGamesForSaleContent.jsp(440,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(440,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f46 = _jspx_th_bean_005fdefine_005f46.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f46);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f46);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f47 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f47.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(441,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(441,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setName("item");
          // /editUsedGamesForSaleContent.jsp(441,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(441,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f47 = _jspx_th_bean_005fdefine_005f47.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f47);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f47);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f48 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f48.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /editUsedGamesForSaleContent.jsp(442,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(442,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setName("item");
          // /editUsedGamesForSaleContent.jsp(442,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(442,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f48 = _jspx_th_bean_005fdefine_005f48.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f48);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f48);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f6.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f6);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f6);
      out.write("\r\n");
      out.write(" <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("  <!-- =====================================================KTPL========================================================= -->\r\n");
      out.write("\r\n");
      out.write("  <!-- =====================================================KTPL=(NINTENDO WII) Date:2006-10-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo Wii games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"wii\">NINTENDO WII</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f7 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f7.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f7.setParent(null);
      // /editUsedGamesForSaleContent.jsp(499,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setId("item");
      // /editUsedGamesForSaleContent.jsp(499,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setName("wii");
      int _jspx_eval_logic_005fiterate_005f7 = _jspx_th_logic_005fiterate_005f7.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f7.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f49 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f49.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(500,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(500,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setName("item");
          // /editUsedGamesForSaleContent.jsp(500,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(500,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f49 = _jspx_th_bean_005fdefine_005f49.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f49);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f49);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f50 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f50.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(501,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f50.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(501,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f50.setName("item");
          // /editUsedGamesForSaleContent.jsp(501,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f50.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(501,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f50.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f50 = _jspx_th_bean_005fdefine_005f50.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f50);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f50);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f51 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f51.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(502,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f51.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(502,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f51.setName("item");
          // /editUsedGamesForSaleContent.jsp(502,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f51.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(502,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f51.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f51 = _jspx_th_bean_005fdefine_005f51.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f51);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f51);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f52 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f52.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(503,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f52.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(503,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f52.setName("item");
          // /editUsedGamesForSaleContent.jsp(503,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f52.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(503,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f52.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f52 = _jspx_th_bean_005fdefine_005f52.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f52);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f52);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f53 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f53.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(504,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f53.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(504,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f53.setName("item");
          // /editUsedGamesForSaleContent.jsp(504,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f53.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(504,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f53.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f53 = _jspx_th_bean_005fdefine_005f53.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f53);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f53);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f54 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f54.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(505,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f54.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(505,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f54.setName("item");
          // /editUsedGamesForSaleContent.jsp(505,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f54.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(505,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f54.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f54 = _jspx_th_bean_005fdefine_005f54.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f54);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f54);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f55 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f55.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /editUsedGamesForSaleContent.jsp(506,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f55.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(506,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f55.setName("item");
          // /editUsedGamesForSaleContent.jsp(506,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f55.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(506,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f55.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f55 = _jspx_th_bean_005fdefine_005f55.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f55);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f55);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f7.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f7);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f7);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->\r\n");
      out.write("  \r\n");
      out.write(" <!-- =====================================================KTPL=(NINTENDO 3DS) Date:2006-10-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo 3Ds games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ds3\">NINTENDO 3DS</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f8 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f8.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f8.setParent(null);
      // /editUsedGamesForSaleContent.jsp(562,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f8.setId("item");
      // /editUsedGamesForSaleContent.jsp(562,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f8.setName("ds3");
      int _jspx_eval_logic_005fiterate_005f8 = _jspx_th_logic_005fiterate_005f8.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f8.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f56 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f56.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(563,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f56.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(563,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f56.setName("item");
          // /editUsedGamesForSaleContent.jsp(563,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f56.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(563,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f56.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f56 = _jspx_th_bean_005fdefine_005f56.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f56);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f56);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f57 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f57.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(564,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f57.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(564,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f57.setName("item");
          // /editUsedGamesForSaleContent.jsp(564,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f57.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(564,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f57.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f57 = _jspx_th_bean_005fdefine_005f57.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f57);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f57);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f58 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f58.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(565,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f58.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(565,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f58.setName("item");
          // /editUsedGamesForSaleContent.jsp(565,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f58.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(565,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f58.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f58 = _jspx_th_bean_005fdefine_005f58.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f58);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f58);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f59 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f59.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(566,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f59.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(566,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f59.setName("item");
          // /editUsedGamesForSaleContent.jsp(566,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f59.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(566,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f59.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f59 = _jspx_th_bean_005fdefine_005f59.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f59);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f59);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f60 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f60.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(567,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f60.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(567,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f60.setName("item");
          // /editUsedGamesForSaleContent.jsp(567,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f60.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(567,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f60.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f60 = _jspx_th_bean_005fdefine_005f60.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f60);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f60);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f61 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f61.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(568,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f61.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(568,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f61.setName("item");
          // /editUsedGamesForSaleContent.jsp(568,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f61.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(568,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f61.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f61 = _jspx_th_bean_005fdefine_005f61.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f61);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f61);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f62 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f62.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /editUsedGamesForSaleContent.jsp(569,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f62.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(569,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f62.setName("item");
          // /editUsedGamesForSaleContent.jsp(569,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f62.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(569,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f62.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f62 = _jspx_th_bean_005fdefine_005f62.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f62);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f62);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f8.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f8);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f8);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" <!-- =====================================================KTPL=(PSVITA) Date:2006-10-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/doEditUsedGamesForSale.do\" method=\"post\">\r\n");
      out.write("<!-- Save PSVita games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"psvita\">PS VITA</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"5\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>\r\n");
      out.write("     <th class=\"subheading\">Total Quantity</th>     \r\n");
      out.write("     <th class=\"subheading\">Copies To Sell</th>     \r\n");
      out.write("     <th class=\"subheading\">Selling Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Lock Quantity</th>\r\n");
      out.write("     <th class=\"subheading\">Dont Sell</th>          \r\n");
      out.write("  </tr>\t\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f9 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f9.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f9.setParent(null);
      // /editUsedGamesForSaleContent.jsp(626,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f9.setId("item");
      // /editUsedGamesForSaleContent.jsp(626,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f9.setName("psvita");
      int _jspx_eval_logic_005fiterate_005f9 = _jspx_th_logic_005fiterate_005f9.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_005fiterate_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f9.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("    ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f63 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f63.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(627,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f63.setId("gameDescID");
          // /editUsedGamesForSaleContent.jsp(627,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f63.setName("item");
          // /editUsedGamesForSaleContent.jsp(627,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f63.setProperty("gameId");
          // /editUsedGamesForSaleContent.jsp(627,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f63.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f63 = _jspx_th_bean_005fdefine_005f63.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f63);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f63);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f64 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f64.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(628,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f64.setId("gameName");
          // /editUsedGamesForSaleContent.jsp(628,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f64.setName("item");
          // /editUsedGamesForSaleContent.jsp(628,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f64.setProperty("gameName");
          // /editUsedGamesForSaleContent.jsp(628,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f64.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f64 = _jspx_th_bean_005fdefine_005f64.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f64);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f64);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer totalCopies = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f65 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f65.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(629,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f65.setId("totalCopies");
          // /editUsedGamesForSaleContent.jsp(629,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f65.setName("item");
          // /editUsedGamesForSaleContent.jsp(629,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f65.setProperty("totalCopies");
          // /editUsedGamesForSaleContent.jsp(629,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f65.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f65 = _jspx_th_bean_005fdefine_005f65.doStartTag();
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          if (_jspx_th_bean_005fdefine_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f65);
            return;
          }
          totalCopies = (java.lang.Integer) _jspx_page_context.findAttribute("totalCopies");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f65);
          out.write("\r\n");
          out.write(" \t ");
          //  bean:define
          java.lang.Integer copiesToSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f66 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f66.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(630,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f66.setId("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(630,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f66.setName("item");
          // /editUsedGamesForSaleContent.jsp(630,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f66.setProperty("copiesToSell");
          // /editUsedGamesForSaleContent.jsp(630,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f66.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f66 = _jspx_th_bean_005fdefine_005f66.doStartTag();
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          if (_jspx_th_bean_005fdefine_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f66);
            return;
          }
          copiesToSell = (java.lang.Integer) _jspx_page_context.findAttribute("copiesToSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f66);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String sellingPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f67 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f67.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(631,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f67.setId("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(631,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f67.setName("item");
          // /editUsedGamesForSaleContent.jsp(631,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f67.setProperty("sellingPrice");
          // /editUsedGamesForSaleContent.jsp(631,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f67.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f67 = _jspx_th_bean_005fdefine_005f67.doStartTag();
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          if (_jspx_th_bean_005fdefine_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f67);
            return;
          }
          sellingPrice = (java.lang.String) _jspx_page_context.findAttribute("sellingPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f67);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String dontSell = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f68 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f68.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(632,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f68.setId("dontSell");
          // /editUsedGamesForSaleContent.jsp(632,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f68.setName("item");
          // /editUsedGamesForSaleContent.jsp(632,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f68.setProperty("dontSell");
          // /editUsedGamesForSaleContent.jsp(632,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f68.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f68 = _jspx_th_bean_005fdefine_005f68.doStartTag();
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          if (_jspx_th_bean_005fdefine_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f68);
            return;
          }
          dontSell = (java.lang.String) _jspx_page_context.findAttribute("dontSell");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f68);
          out.write("\r\n");
          out.write("   \t ");
          //  bean:define
          java.lang.String lockQuantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f69 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f69.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /editUsedGamesForSaleContent.jsp(633,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f69.setId("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(633,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f69.setName("item");
          // /editUsedGamesForSaleContent.jsp(633,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f69.setProperty("lockQuantity");
          // /editUsedGamesForSaleContent.jsp(633,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f69.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f69 = _jspx_th_bean_005fdefine_005f69.doStartTag();
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          if (_jspx_th_bean_005fdefine_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f69);
            return;
          }
          lockQuantity = (java.lang.String) _jspx_page_context.findAttribute("lockQuantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f69);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
 if(x++ % 2 == 0){ 
          out.write("\r\n");
          out.write("        <tr class=\"tdrightdark\">\r\n");
          out.write("     ");
 } else { 
          out.write("\r\n");
          out.write("        <tr class=\"tdleftdark\">\r\n");
          out.write("     ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <td><a href=\"/inv/editGameDesc.do?editID=");
          out.print(gameDescID);
          out.write('"');
          out.write('>');
          out.print(gameName);
          out.write("</a></td>\r\n");
          out.write("       \r\n");
          out.write("        <td align=\"center\">");
          out.print(totalCopies.intValue());
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("        <td align=\"center\">");
          out.print(copiesToSell.intValue());
          out.write("<input type=\"hidden\" value=\"");
          out.print(copiesToSell);
          out.write("\" name=\"copiesToSell");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(sellingPrice);
          out.write("\" name=\"sellingPrice");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td style=\"text-align:center\"><input type=\"text\" size=\"12\" value=\"");
          out.print(lockQuantity);
          out.write("\" name=\"lockQuantity");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\t\t\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" ");
 if(dontSell.equalsIgnoreCase("true")){
          out.write("checked ");
}
          out.write(" value=\"true\" name=\"sellUsedGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f9.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f9);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f9);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <tr colspan=\"6\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->  ");
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
}
