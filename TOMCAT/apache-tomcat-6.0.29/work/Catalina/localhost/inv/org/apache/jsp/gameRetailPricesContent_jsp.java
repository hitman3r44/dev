package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.PurchaseAvailability;

public final class gameRetailPricesContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<a name=\"top\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/govojo.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");

String purchaseAvailableStatus;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2>Game Retail Prices</h2>\r\n");
      out.write("<a href=\"#gc\">GameCube</a> | <a href=\"#ps2\">PlayStation 2</a> | <a href=\"#xbox\">XBOX</a> |  <a href=\"#psp\">Sony PSP</a> | <a href=\"#ds\">Nintendo DS</a> | <a href=\"#xbox360\">Xbox 360</a> | <a href=\"#ps3\">PlayStation 3</a>|<a href=\"#wii\">Nintendo WII</a>|<a href=\"#psvita\">PS Vita</a>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Gamecube games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("     \r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"gc\">GameCube</a></td>    \r\n");
      out.write("      <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td> \r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>\r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>          \r\n");
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
      // /gameRetailPricesContent.jsp(48,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("item");
      // /gameRetailPricesContent.jsp(48,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          // /gameRetailPricesContent.jsp(50,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setId("gameDescID");
          // /gameRetailPricesContent.jsp(50,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setName("item");
          // /gameRetailPricesContent.jsp(50,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setProperty("ID");
          // /gameRetailPricesContent.jsp(50,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          // /gameRetailPricesContent.jsp(51,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setId("gameName");
          // /gameRetailPricesContent.jsp(51,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setName("item");
          // /gameRetailPricesContent.jsp(51,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setProperty("name");
          // /gameRetailPricesContent.jsp(51,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /gameRetailPricesContent.jsp(52,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setId("retailPrice");
          // /gameRetailPricesContent.jsp(52,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setName("item");
          // /gameRetailPricesContent.jsp(52,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(52,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /gameRetailPricesContent.jsp(53,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(53,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setName("item");
          // /gameRetailPricesContent.jsp(53,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(53,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /gameRetailPricesContent.jsp(54,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(54,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setName("item");
          // /gameRetailPricesContent.jsp(54,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(54,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
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
      out.write("<tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write(" </form> \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save PlayStation 2 games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("    \r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#0066CC\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ps2\">PlayStation 2</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>   \r\n");
      out.write("      <th class=\"subheading\">Available For Purchase</th>       \r\n");
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
      // /gameRetailPricesContent.jsp(111,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setId("item");
      // /gameRetailPricesContent.jsp(111,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /gameRetailPricesContent.jsp(113,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setId("gameDescID");
          // /gameRetailPricesContent.jsp(113,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setName("item");
          // /gameRetailPricesContent.jsp(113,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setProperty("ID");
          // /gameRetailPricesContent.jsp(113,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /gameRetailPricesContent.jsp(114,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setId("gameName");
          // /gameRetailPricesContent.jsp(114,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setName("item");
          // /gameRetailPricesContent.jsp(114,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setProperty("name");
          // /gameRetailPricesContent.jsp(114,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /gameRetailPricesContent.jsp(115,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setId("retailPrice");
          // /gameRetailPricesContent.jsp(115,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setName("item");
          // /gameRetailPricesContent.jsp(115,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(115,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /gameRetailPricesContent.jsp(116,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(116,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setName("item");
          // /gameRetailPricesContent.jsp(116,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(116,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /gameRetailPricesContent.jsp(117,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(117,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setName("item");
          // /gameRetailPricesContent.jsp(117,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(117,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
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
      out.write("\t<tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write(" </form> \r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Xbox games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"xbox\">XBox</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>       \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>   \r\n");
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
      // /gameRetailPricesContent.jsp(174,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setId("item");
      // /gameRetailPricesContent.jsp(174,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /gameRetailPricesContent.jsp(176,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setId("gameDescID");
          // /gameRetailPricesContent.jsp(176,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setName("item");
          // /gameRetailPricesContent.jsp(176,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setProperty("ID");
          // /gameRetailPricesContent.jsp(176,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f11 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f11.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /gameRetailPricesContent.jsp(177,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setId("gameName");
          // /gameRetailPricesContent.jsp(177,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setName("item");
          // /gameRetailPricesContent.jsp(177,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setProperty("name");
          // /gameRetailPricesContent.jsp(177,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f11.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f11 = _jspx_th_bean_005fdefine_005f11.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f12 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f12.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /gameRetailPricesContent.jsp(178,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setId("retailPrice");
          // /gameRetailPricesContent.jsp(178,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setName("item");
          // /gameRetailPricesContent.jsp(178,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(178,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f12.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f12 = _jspx_th_bean_005fdefine_005f12.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f13 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f13.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /gameRetailPricesContent.jsp(179,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(179,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setName("item");
          // /gameRetailPricesContent.jsp(179,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(179,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f13.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f13 = _jspx_th_bean_005fdefine_005f13.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
          out.write("\r\n");
          out.write("\t ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f14 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f14.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /gameRetailPricesContent.jsp(180,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(180,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setName("item");
          // /gameRetailPricesContent.jsp(180,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(180,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f14.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f14 = _jspx_th_bean_005fdefine_005f14.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
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
      out.write("\t<tr colspan=\"4\">\r\n");
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
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Sony PSP games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"psp\">Sony PSP</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write(" \t<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(235,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setId("item");
      // /gameRetailPricesContent.jsp(235,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f15 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f15.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /gameRetailPricesContent.jsp(237,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setId("gameDescID");
          // /gameRetailPricesContent.jsp(237,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setName("item");
          // /gameRetailPricesContent.jsp(237,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setProperty("ID");
          // /gameRetailPricesContent.jsp(237,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f15.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f15 = _jspx_th_bean_005fdefine_005f15.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f16 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f16.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /gameRetailPricesContent.jsp(238,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setId("gameName");
          // /gameRetailPricesContent.jsp(238,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setName("item");
          // /gameRetailPricesContent.jsp(238,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setProperty("name");
          // /gameRetailPricesContent.jsp(238,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f16.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f16 = _jspx_th_bean_005fdefine_005f16.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f17 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f17.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /gameRetailPricesContent.jsp(239,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setId("retailPrice");
          // /gameRetailPricesContent.jsp(239,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setName("item");
          // /gameRetailPricesContent.jsp(239,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(239,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f17.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f17 = _jspx_th_bean_005fdefine_005f17.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f18 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f18.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /gameRetailPricesContent.jsp(240,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(240,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setName("item");
          // /gameRetailPricesContent.jsp(240,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(240,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f18.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f18 = _jspx_th_bean_005fdefine_005f18.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
          out.write(" \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f19 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f19.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /gameRetailPricesContent.jsp(241,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(241,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setName("item");
          // /gameRetailPricesContent.jsp(241,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(241,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f19.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f19 = _jspx_th_bean_005fdefine_005f19.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
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
      out.write(" <tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo DS games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ds\">Nintendo DS</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(295,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setId("item");
      // /gameRetailPricesContent.jsp(295,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f20 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f20.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /gameRetailPricesContent.jsp(297,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setId("gameDescID");
          // /gameRetailPricesContent.jsp(297,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setName("item");
          // /gameRetailPricesContent.jsp(297,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setProperty("ID");
          // /gameRetailPricesContent.jsp(297,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f20.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f20 = _jspx_th_bean_005fdefine_005f20.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f21 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f21.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /gameRetailPricesContent.jsp(298,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setId("gameName");
          // /gameRetailPricesContent.jsp(298,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setName("item");
          // /gameRetailPricesContent.jsp(298,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setProperty("name");
          // /gameRetailPricesContent.jsp(298,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f21.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f21 = _jspx_th_bean_005fdefine_005f21.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f22 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f22.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /gameRetailPricesContent.jsp(299,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setId("retailPrice");
          // /gameRetailPricesContent.jsp(299,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setName("item");
          // /gameRetailPricesContent.jsp(299,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(299,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f22.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f22 = _jspx_th_bean_005fdefine_005f22.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f23 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f23.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /gameRetailPricesContent.jsp(300,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(300,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setName("item");
          // /gameRetailPricesContent.jsp(300,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(300,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f23 = _jspx_th_bean_005fdefine_005f23.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f24 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f24.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /gameRetailPricesContent.jsp(301,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(301,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setName("item");
          // /gameRetailPricesContent.jsp(301,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(301,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f24 = _jspx_th_bean_005fdefine_005f24.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
          out.write("\t\t\r\n");
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
      out.write(" <tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Xbox 360 games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#E6E6FA\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"xbox360\">Xbox 360</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write(" <tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(356,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setId("item");
      // /gameRetailPricesContent.jsp(356,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f25 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f25.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /gameRetailPricesContent.jsp(358,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setId("gameDescID");
          // /gameRetailPricesContent.jsp(358,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setName("item");
          // /gameRetailPricesContent.jsp(358,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setProperty("ID");
          // /gameRetailPricesContent.jsp(358,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f25 = _jspx_th_bean_005fdefine_005f25.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f26 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f26.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /gameRetailPricesContent.jsp(359,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setId("gameName");
          // /gameRetailPricesContent.jsp(359,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setName("item");
          // /gameRetailPricesContent.jsp(359,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setProperty("name");
          // /gameRetailPricesContent.jsp(359,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f26 = _jspx_th_bean_005fdefine_005f26.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f27 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f27.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /gameRetailPricesContent.jsp(360,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setId("retailPrice");
          // /gameRetailPricesContent.jsp(360,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setName("item");
          // /gameRetailPricesContent.jsp(360,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(360,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f27 = _jspx_th_bean_005fdefine_005f27.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f28 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f28.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /gameRetailPricesContent.jsp(361,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(361,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setName("item");
          // /gameRetailPricesContent.jsp(361,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(361,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f28 = _jspx_th_bean_005fdefine_005f28.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f29 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f29.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /gameRetailPricesContent.jsp(362,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(362,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setName("item");
          // /gameRetailPricesContent.jsp(362,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(362,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f29.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f29 = _jspx_th_bean_005fdefine_005f29.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
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
      out.write(" <tr colspan=\"4\">\r\n");
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
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save PlayStation 3 games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ps3\">PlayStation 3</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(418,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setId("item");
      // /gameRetailPricesContent.jsp(418,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f30 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f30.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /gameRetailPricesContent.jsp(420,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setId("gameDescID");
          // /gameRetailPricesContent.jsp(420,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setName("item");
          // /gameRetailPricesContent.jsp(420,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setProperty("ID");
          // /gameRetailPricesContent.jsp(420,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f30.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f30 = _jspx_th_bean_005fdefine_005f30.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f31 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f31.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /gameRetailPricesContent.jsp(421,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setId("gameName");
          // /gameRetailPricesContent.jsp(421,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setName("item");
          // /gameRetailPricesContent.jsp(421,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setProperty("name");
          // /gameRetailPricesContent.jsp(421,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f31.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f31 = _jspx_th_bean_005fdefine_005f31.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f32 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f32.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /gameRetailPricesContent.jsp(422,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setId("retailPrice");
          // /gameRetailPricesContent.jsp(422,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setName("item");
          // /gameRetailPricesContent.jsp(422,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(422,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f32.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f32 = _jspx_th_bean_005fdefine_005f32.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f33 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f33.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /gameRetailPricesContent.jsp(423,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(423,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setName("item");
          // /gameRetailPricesContent.jsp(423,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(423,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f33.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f33 = _jspx_th_bean_005fdefine_005f33.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f34 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f34.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /gameRetailPricesContent.jsp(424,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(424,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setName("item");
          // /gameRetailPricesContent.jsp(424,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(424,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f34.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f34 = _jspx_th_bean_005fdefine_005f34.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
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
      out.write(" <tr colspan=\"4\">\r\n");
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
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo Wii games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"wii\">NINTENDO WII</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(482,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setId("item");
      // /gameRetailPricesContent.jsp(482,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f35 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f35.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /gameRetailPricesContent.jsp(484,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setId("gameDescID");
          // /gameRetailPricesContent.jsp(484,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setName("item");
          // /gameRetailPricesContent.jsp(484,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f35.setProperty("ID");
          // /gameRetailPricesContent.jsp(484,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          _jspx_th_bean_005fdefine_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /gameRetailPricesContent.jsp(485,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setId("gameName");
          // /gameRetailPricesContent.jsp(485,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setName("item");
          // /gameRetailPricesContent.jsp(485,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f36.setProperty("name");
          // /gameRetailPricesContent.jsp(485,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f37 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f37.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /gameRetailPricesContent.jsp(486,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setId("retailPrice");
          // /gameRetailPricesContent.jsp(486,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setName("item");
          // /gameRetailPricesContent.jsp(486,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(486,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f37 = _jspx_th_bean_005fdefine_005f37.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f38 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f38.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /gameRetailPricesContent.jsp(487,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(487,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setName("item");
          // /gameRetailPricesContent.jsp(487,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(487,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f38 = _jspx_th_bean_005fdefine_005f38.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f39 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f39.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /gameRetailPricesContent.jsp(488,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(488,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setName("item");
          // /gameRetailPricesContent.jsp(488,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(488,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f39 = _jspx_th_bean_005fdefine_005f39.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
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
      out.write("  <tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- =====================================================KTPL=(NINTENDO 3DS) Date:2011-02-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo 3Ds games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"ds3\">NINTENDO  3DS</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(546,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f8.setId("item");
      // /gameRetailPricesContent.jsp(546,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f40 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f40.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /gameRetailPricesContent.jsp(548,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setId("gameDescID");
          // /gameRetailPricesContent.jsp(548,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setName("item");
          // /gameRetailPricesContent.jsp(548,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setProperty("ID");
          // /gameRetailPricesContent.jsp(548,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f40.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f40 = _jspx_th_bean_005fdefine_005f40.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f40);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f40);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f41 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f41.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /gameRetailPricesContent.jsp(549,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setId("gameName");
          // /gameRetailPricesContent.jsp(549,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setName("item");
          // /gameRetailPricesContent.jsp(549,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setProperty("name");
          // /gameRetailPricesContent.jsp(549,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f41.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f41 = _jspx_th_bean_005fdefine_005f41.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f41);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f41);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f42 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f42.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /gameRetailPricesContent.jsp(550,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setId("retailPrice");
          // /gameRetailPricesContent.jsp(550,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setName("item");
          // /gameRetailPricesContent.jsp(550,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(550,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f42.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f42 = _jspx_th_bean_005fdefine_005f42.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f42);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f42);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f43 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f43.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /gameRetailPricesContent.jsp(551,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(551,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setName("item");
          // /gameRetailPricesContent.jsp(551,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(551,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f43.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f43 = _jspx_th_bean_005fdefine_005f43.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f43);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f43);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f44 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f44.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /gameRetailPricesContent.jsp(552,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(552,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setName("item");
          // /gameRetailPricesContent.jsp(552,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(552,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f44.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f44 = _jspx_th_bean_005fdefine_005f44.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f44);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f44);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
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
      out.write("  <tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->\r\n");
      out.write("  \r\n");
      out.write("  <!-- =====================================================KTPL=(PSVITA 3DS) Date:2011-02-14=========================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGameRetailPrices.do\" method=\"post\">\r\n");
      out.write("<!-- Save Nintendo 3Ds games retail prices: <input type=\"submit\" value=\"Save\"> -->\r\n");
      out.write("    \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r\n");
      out.write("\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"psvita\">PS VITA</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"4\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr class=\"tdleft\">\r\n");
      out.write("     <th class=\"subheading\">Game Name</th>     \r\n");
      out.write("     <th class=\"subheading\">Retail Price</th>     \r\n");
      out.write("     <th class=\"subheading\">Current New Price</th>\r\n");
      out.write("     <th class=\"subheading\">Stop Selling New</th>      \r\n");
      out.write("     <th class=\"subheading\">Available For Purchase</th>    \r\n");
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
      // /gameRetailPricesContent.jsp(609,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f9.setId("item");
      // /gameRetailPricesContent.jsp(609,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("     \r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f45 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f45.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /gameRetailPricesContent.jsp(611,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setId("gameDescID");
          // /gameRetailPricesContent.jsp(611,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setName("item");
          // /gameRetailPricesContent.jsp(611,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setProperty("ID");
          // /gameRetailPricesContent.jsp(611,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f45.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f45 = _jspx_th_bean_005fdefine_005f45.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f45);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f45);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String gameName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f46 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f46.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /gameRetailPricesContent.jsp(612,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setId("gameName");
          // /gameRetailPricesContent.jsp(612,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setName("item");
          // /gameRetailPricesContent.jsp(612,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setProperty("name");
          // /gameRetailPricesContent.jsp(612,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f46.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f46 = _jspx_th_bean_005fdefine_005f46.doStartTag();
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          if (_jspx_th_bean_005fdefine_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f46);
            return;
          }
          gameName = (java.lang.String) _jspx_page_context.findAttribute("gameName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f46);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String retailPrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f47 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f47.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /gameRetailPricesContent.jsp(613,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setId("retailPrice");
          // /gameRetailPricesContent.jsp(613,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setName("item");
          // /gameRetailPricesContent.jsp(613,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setProperty("retailPrice");
          // /gameRetailPricesContent.jsp(613,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f47.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f47 = _jspx_th_bean_005fdefine_005f47.doStartTag();
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          if (_jspx_th_bean_005fdefine_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f47);
            return;
          }
          retailPrice = (java.lang.String) _jspx_page_context.findAttribute("retailPrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f47);
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.String newGamePrice = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f48 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f48.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /gameRetailPricesContent.jsp(614,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setId("newGamePrice");
          // /gameRetailPricesContent.jsp(614,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setName("item");
          // /gameRetailPricesContent.jsp(614,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setProperty("newCopyPrice");
          // /gameRetailPricesContent.jsp(614,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f48.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f48 = _jspx_th_bean_005fdefine_005f48.doStartTag();
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          if (_jspx_th_bean_005fdefine_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f48);
            return;
          }
          newGamePrice = (java.lang.String) _jspx_page_context.findAttribute("newGamePrice");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f48);
          out.write("\r\n");
          out.write("      ");
          //  bean:define
          java.lang.Integer purchaseAvailabilityID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f49 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f49.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /gameRetailPricesContent.jsp(615,6) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setId("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(615,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setName("item");
          // /gameRetailPricesContent.jsp(615,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setProperty("purchaseAvailabilityID");
          // /gameRetailPricesContent.jsp(615,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f49.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f49 = _jspx_th_bean_005fdefine_005f49.doStartTag();
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          if (_jspx_th_bean_005fdefine_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f49);
            return;
          }
          purchaseAvailabilityID = (java.lang.Integer) _jspx_page_context.findAttribute("purchaseAvailabilityID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f49);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");

		purchaseAvailableStatus = PurchaseAvailability.getPurchaseAvailabilityStatus(purchaseAvailabilityID.intValue());
	
          out.write("\t\r\n");
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
          out.write("        <td><input type=\"\" name=\"retailPrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((retailPrice == null || retailPrice.equals("null"))?"":retailPrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td><input type=\"\" name=\"newGamePrice");
          out.print(gameDescID);
          out.write("\" value=\"");
          out.print((newGamePrice == null || newGamePrice.equals("null"))?"":newGamePrice);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("        <td style=\"text-align:center\"><input type=\"checkbox\" value=\"true\" name=\"sellingNewGame");
          out.print(gameDescID);
          out.write("\"></td>\r\n");
          out.write("\r\n");
          out.write("\t\t<td>");
          out.print(purchaseAvailableStatus);
          out.write("</td>\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
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
      out.write("  <tr colspan=\"4\">\r\n");
      out.write("  \t<td style=\"text-align:center\"> <input type=\"submit\" value=\"Update\">  \t</td>\r\n");
      out.write("  </tr>\t\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  <!-- =====================================================KTPL============================================ -->");
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
