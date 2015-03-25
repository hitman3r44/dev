package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.InventoryPermissions;

public final class topbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/govojo.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.release();
    _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.release();
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

      out.write("\r\r\r\r\r\n");
      out.write("<head>\r\r\n");
      out.write("<style type=\"text/css\">\r\r\n");
      out.write("  body {\r\r\n");
      out.write("    font-family:arial,helvetica,tahoma,verdana,sans-serif;\r\r\n");
      out.write("    font-size:11px;\r\r\n");
      out.write("    line-height:14px;\r\r\n");
      out.write("  }\r\r\n");
      out.write("</style>\r\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\r\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/govojo.css\" type=\"text/css\">\r\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r<!--\r\n");
      out.write("\r\n");
      out.write("function jumpTo(URL_List){\r\r\n");
      out.write("   var URL = URL_List.options[URL_List.selectedIndex].value;\r\r\n");
      out.write("   window.location.href = URL;\r\r\n");
      out.write("}\r\r\n");
      out.write("function getNewSubmitForm(){\r\n");
      out.write(" var submitForm = document.createElement(\"FORM\");\r\n");
      out.write(" document.body.appendChild(submitForm);\r\n");
      out.write(" submitForm.method = \"POST\";\r\n");
      out.write(" return submitForm;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function createNewFormElement(inputForm, elementName, elementValue){ \r\n");
      out.write(" var newElement = document.createElement(\"input\");\r\n");
      out.write(" newElement.name = elementName;\r\n");
      out.write(" elementName.value = elementValue; \r\n");
      out.write(" inputForm.appendChild(newElement);\r\n");
      out.write(" newElement.value = elementValue;\r\n");
      out.write(" \r\n");
      out.write(" return newElement;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//-->\r\r\n");
      out.write("\r\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/overlib.js\" type=\"text/javascript\" ></script>\r\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\r\n");
      out.write("\r\r\n");
      out.write("</head>\r\r\n");
      out.write("\r\r\n");
      out.write("<img src=\"/inv/images/gameaccess_logo.jpg\">\r\r\n");
      out.write("<table>\r\r\n");
      out.write("<form>\r\r\n");
      out.write("    <tr class=\"tdleft\">\r\r\n");
      out.write("        <td class=\"subheading\">Customer</td>\r\r\n");
      out.write("        <td class=\"subheading\">Inventory</td>\r\r\n");
      out.write("        <td class=\"subheading\">Catalog</td>\r\r\n");
      out.write("\t<td class=\"subheading\">Purchase</td>\r\t\r\t<td class=\"subheading\">Report</td>\r\r\n");
      out.write("    </tr>\r\r\n");
      out.write("    <tr>\r\r\n");
      out.write("        <td>\r\r\n");
      out.write("            <select onchange=\"jumpTo(this);\">\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f0(_jspx_page_context))
        return;
      out.write("\">Select a value</option>\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f0 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f0.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f0.setParent(null);
      // /templates/topbar.jsp(59,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f0.setPermission(InventoryPermissions.VIEW_QUEUE.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f0 = _jspx_th_govojo_005fdisplayPermissions_005f0.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f1(_jspx_th_govojo_005fdisplayPermissions_005f0, _jspx_page_context))
            return;
          out.write("\">View Global Queue</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f0);
      out.write("\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f2(_jspx_page_context))
        return;
      out.write("\">Search for Customers</option>\r\r\n");
      out.write("                 \r\r\n");
      out.write("\t\t\t\t");
      out.write("                 \r                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f1 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f1.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f1.setParent(null);
      // /templates/topbar.jsp(70,54) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f1.setPermission(InventoryPermissions.VIEW_NEEDS_NORMALIZE.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f1 = _jspx_th_govojo_005fdisplayPermissions_005f1.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f3(_jspx_th_govojo_005fdisplayPermissions_005f1, _jspx_page_context))
            return;
          out.write("\">Need Address Normalization</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f1);
      out.write("\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f2 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f2.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f2.setParent(null);
      // /templates/topbar.jsp(73,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f2.setPermission(InventoryPermissions.VIEW_CUSTOMERS_NEEDING_GAME.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f2 = _jspx_th_govojo_005fdisplayPermissions_005f2.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f4(_jspx_th_govojo_005fdisplayPermissions_005f2, _jspx_page_context))
            return;
          out.write("\">Customers Needing Fulfillment</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f2);
      out.write("\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f3 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f3.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f3.setParent(null);
      // /templates/topbar.jsp(76,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f3.setPermission(InventoryPermissions.MODERATE_CUSTOMER_GAME_REVIEWS.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f3 = _jspx_th_govojo_005fdisplayPermissions_005f3.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f5(_jspx_th_govojo_005fdisplayPermissions_005f3, _jspx_page_context))
            return;
          out.write("\">Moderate Reviews</option>     \r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f3);
      out.write("\r\r\n");
      out.write("                \r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f6(_jspx_page_context))
        return;
      out.write("\">Virtual Terminal</option>     \r\r\n");
      out.write("                \r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f7(_jspx_page_context))
        return;
      out.write("\">Card Search</option> \r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f8(_jspx_page_context))
        return;
      out.write("\">Display Survey</option> \r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f9(_jspx_page_context))
        return;
      out.write("\">Display Referrals List</option> \r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f10(_jspx_page_context))
        return;
      out.write("\">Show Queue 10 Members</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f11(_jspx_page_context))
        return;
      out.write("\">Show Premium Members</option>\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f12(_jspx_page_context))
        return;
      out.write("\">Show 1 Year Contract Members</option>\r\r\n");
      out.write("\t\t \t\t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f13(_jspx_page_context))
        return;
      out.write("\">Delinquent Members</option>\r\t\t \t\t\r\t\t \t\t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f14(_jspx_page_context))
        return;
      out.write("\">Delinquent Members Level 5</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f15(_jspx_page_context))
        return;
      out.write("\">Edit Delinquent Level</option> \r\r\n");
      out.write("            </select>\r\r\n");
      out.write("        </td>\r\r\n");
      out.write("        <td>\r\r\n");
      out.write("            <select onchange=\"jumpTo(this);\">\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f16(_jspx_page_context))
        return;
      out.write("\">Select a value</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f17(_jspx_page_context))
        return;
      out.write("\">Search for Inventory</option>\r\r\n");
      out.write("\t\t<!-- <option value=\"");
      if (_jspx_meth_html_005frewrite_005f18(_jspx_page_context))
        return;
      out.write("\">Decommission Inventory</option>-->\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f4 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f4.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f4.setParent(null);
      // /templates/topbar.jsp(97,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f4.setPermission(InventoryPermissions.VIEW_PARTNER_STATS.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f4 = _jspx_th_govojo_005fdisplayPermissions_005f4.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f19(_jspx_th_govojo_005fdisplayPermissions_005f4, _jspx_page_context))
            return;
          out.write("\">All Partner Stats</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f4);
      out.write("\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f5 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f5.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f5.setParent(null);
      // /templates/topbar.jsp(100,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f5.setPermission(InventoryPermissions.VIEW_PARTNER_STATS.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f5 = _jspx_th_govojo_005fdisplayPermissions_005f5.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f20(_jspx_th_govojo_005fdisplayPermissions_005f5, _jspx_page_context))
            return;
          out.write("\">All Partners</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f5);
      out.write("\r\r\n");
      out.write("                ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f6 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f6.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f6.setParent(null);
      // /templates/topbar.jsp(103,16) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f6.setPermission(InventoryPermissions.VIEW_ALL_INVENTORY.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f6 = _jspx_th_govojo_005fdisplayPermissions_005f6.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f21(_jspx_th_govojo_005fdisplayPermissions_005f6, _jspx_page_context))
            return;
          out.write("\">View all Inventory</option>\r\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f6);
      out.write("\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f22(_jspx_page_context))
        return;
      out.write("\">View Reserved List</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f23(_jspx_page_context))
        return;
      out.write("\">Launch List Picker</option>\r\r\n");
      out.write("                <!-- <option value=\"");
      if (_jspx_meth_html_005frewrite_005f24(_jspx_page_context))
        return;
      out.write("\">RMI Server Control</option> -->\r\r\n");
      out.write("                <!-- <option value=\"");
      if (_jspx_meth_html_005frewrite_005f25(_jspx_page_context))
        return;
      out.write("\">Show Games Available</option> -->\r\r\n");
      out.write("                <!-- <option value=\"");
      if (_jspx_meth_html_005frewrite_005f26(_jspx_page_context))
        return;
      out.write("\">Physical Inventory Summary</option> -->\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f27(_jspx_page_context))
        return;
      out.write("\">Fulfilled Orders</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f28(_jspx_page_context))
        return;
      out.write("\">View Purchase Requests</option>\r\n");
      out.write("                \r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f29(_jspx_page_context))
        return;
      out.write("\">Leaser List</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f30(_jspx_page_context))
        return;
      out.write("\">Fast Returned Games</option>\r\r\n");
      out.write("                 <option value=\"");
      if (_jspx_meth_html_005frewrite_005f31(_jspx_page_context))
        return;
      out.write("\">Customer Reserved Games</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f32(_jspx_page_context))
        return;
      out.write("\">Upload Screen Shots</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f33(_jspx_page_context))
        return;
      out.write("\">Fetch Screen Shots</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f34(_jspx_page_context))
        return;
      out.write("\">Refetch Screen Shots</option>\r\n");
      out.write("                <!-- Not anymore used \r                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f35(_jspx_page_context))
        return;
      out.write("\">Update Stock Level Multipliers</option>\r\n");
      out.write("                 -->\r                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f36(_jspx_page_context))
        return;
      out.write("\">Edit Stock Level Ratio</option>\r                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f37(_jspx_page_context))
        return;
      out.write("\">Media Approval</option>\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f38(_jspx_page_context))
        return;
      out.write("\">Add Deals</option>\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f39(_jspx_page_context))
        return;
      out.write("\">View Deals</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f40(_jspx_page_context))
        return;
      out.write("\">Email Campaign</option>\r                \r                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f41(_jspx_page_context))
        return;
      out.write("\">Show games no valid copies</option>\r\r\n");
      out.write("            </select>\r\r\n");
      out.write("        </td>\r\r\n");
      out.write("        <td>\r\r\n");
      out.write("            <select onchange=\"jumpTo(this);\">\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f42(_jspx_page_context))
        return;
      out.write("\">Select a value</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f43(_jspx_page_context))
        return;
      out.write("\">Add Catalog Item</option>\r\r\n");
      out.write("                <option value=\"");
      if (_jspx_meth_html_005frewrite_005f44(_jspx_page_context))
        return;
      out.write("\">View Catalog Item</option>\r\r\n");
      out.write("               ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f7 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f7.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f7.setParent(null);
      // /templates/topbar.jsp(132,15) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f7.setPermission(InventoryPermissions.CREATE_GAMETAB_MAPPING.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f7 = _jspx_th_govojo_005fdisplayPermissions_005f7.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\r\n");
          out.write("                <option value=\"");
          if (_jspx_meth_html_005frewrite_005f45(_jspx_th_govojo_005fdisplayPermissions_005f7, _jspx_page_context))
            return;
          out.write("\">Create Game Tab Mapping</option>\r\r\n");
          out.write("\t\t         <!--       <option value=\"");
          if (_jspx_meth_html_005frewrite_005f46(_jspx_th_govojo_005fdisplayPermissions_005f7, _jspx_page_context))
            return;
          out.write("\">Create Game Dude Mapping</option>  -->\r\r\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f7);
      out.write("\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f47(_jspx_page_context))
        return;
      out.write("\">Edit Shipping Fee</option>\r\r\n");
      out.write("\t\t\r\r\n");
      out.write("\t\t\t <option value=\"");
      if (_jspx_meth_html_005frewrite_005f48(_jspx_page_context))
        return;
      out.write("\">Retail Price Update</option>\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f49(_jspx_page_context))
        return;
      out.write("\">Generate Used Games</option>\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f50(_jspx_page_context))
        return;
      out.write("\">Edit Inventory Ratio</option>\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f51(_jspx_page_context))
        return;
      out.write("\">Edit Default Prices</option>\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f52(_jspx_page_context))
        return;
      out.write("\">Edit Used Games</option>\r\r\n");
      out.write("\r\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f53(_jspx_page_context))
        return;
      out.write("\">Games For Sale</option> \r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f54(_jspx_page_context))
        return;
      out.write("\">Add Game</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f55(_jspx_page_context))
        return;
      out.write("\">Add Accessory</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f56(_jspx_page_context))
        return;
      out.write("\">View Accessories</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f57(_jspx_page_context))
        return;
      out.write("\">Store Accessory Type</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f58(_jspx_page_context))
        return;
      out.write("\">Add Audio Type</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f59(_jspx_page_context))
        return;
      out.write("\">Add HDTV Type</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f60(_jspx_page_context))
        return;
      out.write("\">Game Accessory Type</option>\r\n");
      out.write("           <!-- <option value=\"");
      if (_jspx_meth_html_005frewrite_005f61(_jspx_page_context))
        return;
      out.write("\">Upload Screenshots</option> -->\r\n");
      out.write("\t\t\t <option value=\"");
      if (_jspx_meth_html_005frewrite_005f62(_jspx_page_context))
        return;
      out.write("\">Upload Videos</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f63(_jspx_page_context))
        return;
      out.write("\">Upload Wallpapers</option>\r\n");
      out.write("             <option value=\"");
      if (_jspx_meth_html_005frewrite_005f64(_jspx_page_context))
        return;
      out.write("\">Featured Game</option>\r\t\t\t <option value=\"");
      if (_jspx_meth_html_005frewrite_005f65(_jspx_page_context))
        return;
      out.write("\">Games in special sale</option>\r\n");
      out.write("\t\t\t <option value=\"");
      if (_jspx_meth_html_005frewrite_005f66(_jspx_page_context))
        return;
      out.write("\">Coupons Management</option>\r\n");
      out.write("\t\t\t <option value=\"");
      if (_jspx_meth_html_005frewrite_005f67(_jspx_page_context))
        return;
      out.write("\">View Coupon customers</option>\t\t\t \r\n");
      out.write("             </select> \r\n");
      out.write("             \r\r\n");
      out.write("        </td>\r\r\n");
      out.write("\r\r\n");
      out.write("\t  <td>\r\r\n");
      out.write("       \t\t<select onchange=\"jumpTo(this);\">\r\r\n");
      out.write("\t       \t\t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f68(_jspx_page_context))
        return;
      out.write("\">Select a value</option>\r\r\n");
      out.write("               <option value=\"");
      if (_jspx_meth_html_005frewrite_005f69(_jspx_page_context))
        return;
      out.write("\">Edit Purchasing Ratio</option>\r\r\n");
      out.write("               <option value=\"");
      if (_jspx_meth_html_005frewrite_005f70(_jspx_page_context))
        return;
      out.write("\">Generate Purchasing Needs</option>\r\r\n");
      out.write("               <option value=\"");
      if (_jspx_meth_html_005frewrite_005f71(_jspx_page_context))
        return;
      out.write("\">Purchasing Needs(Released)</option>\r\r\n");
      out.write("               <option value=\"");
      if (_jspx_meth_html_005frewrite_005f72(_jspx_page_context))
        return;
      out.write("\">Purchasing Needs(Unreleased)</option>\r\n");
      out.write("               <option value=\"");
      if (_jspx_meth_html_005frewrite_005f73(_jspx_page_context))
        return;
      out.write("\">Add Bug</option>\r\n");
      out.write("\t           <option value=\"");
      if (_jspx_meth_html_005frewrite_005f74(_jspx_page_context))
        return;
      out.write("\">View Bugs</option>\r\r\n");
      out.write("                </select> \r                \r\r\n");
      out.write("        </td>\r        \r\t\t<td>\r\t\t\t<select onchange=\"jumpTo(this);\">\r\t\t\t\t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f75(_jspx_page_context))
        return;
      out.write("\">Select a value</option>\r            \t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f76(_jspx_page_context))
        return;
      out.write("\">Games Sales</option>\r            \t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f77(_jspx_page_context))
        return;
      out.write("\">Subscription Sales</option>\r            \t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f78(_jspx_page_context))
        return;
      out.write("\">Membership Base</option>\r            \t<option value=\"");
      if (_jspx_meth_html_005frewrite_005f79(_jspx_page_context))
        return;
      out.write("\">Trend Tracker</option>\r\t\t\t</select>\r\t\t</td>\r        \r\r\n");
      out.write("    </tr>\r\r\n");
      out.write("</form>\r\r\n");
      out.write("</table>\r\r\n");
      out.write("<hr>\r\r\n");
      out.write("<br>\r\r\n");
      out.write("<table width=\"100%\"><tr><td bgcolor=\"#cccccc\">&nbsp;&nbsp;<font color=\"black\">");
      if (_jspx_meth_template_005fget_005f0(_jspx_page_context))
        return;
      out.write("</font></td></tr></table>\r\r\n");
      out.write("<br>\r\r\n");
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
    // /templates/topbar.jsp(58,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f0.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f0 = _jspx_th_html_005frewrite_005f0.doStartTag();
    if (_jspx_th_html_005frewrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f1 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f0);
    // /templates/topbar.jsp(60,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f1.setPage("/viewGlobalQueue.do");
    int _jspx_eval_html_005frewrite_005f1 = _jspx_th_html_005frewrite_005f1.doStartTag();
    if (_jspx_th_html_005frewrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f2 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f2.setParent(null);
    // /templates/topbar.jsp(62,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f2.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f2 = _jspx_th_html_005frewrite_005f2.doStartTag();
    if (_jspx_th_html_005frewrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f3 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f1);
    // /templates/topbar.jsp(71,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f3.setPage("/getNeedsAddressNormalize.do");
    int _jspx_eval_html_005frewrite_005f3 = _jspx_th_html_005frewrite_005f3.doStartTag();
    if (_jspx_th_html_005frewrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f4 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f2);
    // /templates/topbar.jsp(74,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f4.setPage("/viewGamesNeeded.do");
    int _jspx_eval_html_005frewrite_005f4 = _jspx_th_html_005frewrite_005f4.doStartTag();
    if (_jspx_th_html_005frewrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f5 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f3);
    // /templates/topbar.jsp(77,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f5.setPage("/moderateReviews.do");
    int _jspx_eval_html_005frewrite_005f5 = _jspx_th_html_005frewrite_005f5.doStartTag();
    if (_jspx_th_html_005frewrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f6 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f6.setParent(null);
    // /templates/topbar.jsp(80,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f6.setPage("/virtualTerminal.jsp");
    int _jspx_eval_html_005frewrite_005f6 = _jspx_th_html_005frewrite_005f6.doStartTag();
    if (_jspx_th_html_005frewrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f7 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f7.setParent(null);
    // /templates/topbar.jsp(82,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f7.setPage("/viewCardRequest.jsp");
    int _jspx_eval_html_005frewrite_005f7 = _jspx_th_html_005frewrite_005f7.doStartTag();
    if (_jspx_th_html_005frewrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f8 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f8.setParent(null);
    // /templates/topbar.jsp(83,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f8.setPage("/displayDisplaySurvey.jsp");
    int _jspx_eval_html_005frewrite_005f8 = _jspx_th_html_005frewrite_005f8.doStartTag();
    if (_jspx_th_html_005frewrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f9 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f9.setParent(null);
    // /templates/topbar.jsp(84,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f9.setPage("/displayReferralsList.do");
    int _jspx_eval_html_005frewrite_005f9 = _jspx_th_html_005frewrite_005f9.doStartTag();
    if (_jspx_th_html_005frewrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f10 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f10.setParent(null);
    // /templates/topbar.jsp(85,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f10.setPage("/showqueueTenMembers.do");
    int _jspx_eval_html_005frewrite_005f10 = _jspx_th_html_005frewrite_005f10.doStartTag();
    if (_jspx_th_html_005frewrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f11 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f11.setParent(null);
    // /templates/topbar.jsp(86,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f11.setPage("/showPremiumMembers.do");
    int _jspx_eval_html_005frewrite_005f11 = _jspx_th_html_005frewrite_005f11.doStartTag();
    if (_jspx_th_html_005frewrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f12 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f12.setParent(null);
    // /templates/topbar.jsp(87,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f12.setPage("/viewOneYearContractMembers.do");
    int _jspx_eval_html_005frewrite_005f12 = _jspx_th_html_005frewrite_005f12.doStartTag();
    if (_jspx_th_html_005frewrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f13 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f13.setParent(null);
    // /templates/topbar.jsp(88,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f13.setPage("/showDelinquentMembers.do");
    int _jspx_eval_html_005frewrite_005f13 = _jspx_th_html_005frewrite_005f13.doStartTag();
    if (_jspx_th_html_005frewrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f14 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f14.setParent(null);
    // /templates/topbar.jsp(88,124) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f14.setPage("/delinquentCustomerForLevel.do");
    int _jspx_eval_html_005frewrite_005f14 = _jspx_th_html_005frewrite_005f14.doStartTag();
    if (_jspx_th_html_005frewrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f14);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f15 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f15.setParent(null);
    // /templates/topbar.jsp(89,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f15.setPage("/editDelinquencyLevel.jsp");
    int _jspx_eval_html_005frewrite_005f15 = _jspx_th_html_005frewrite_005f15.doStartTag();
    if (_jspx_th_html_005frewrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f16 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f16.setParent(null);
    // /templates/topbar.jsp(94,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f16.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f16 = _jspx_th_html_005frewrite_005f16.doStartTag();
    if (_jspx_th_html_005frewrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f17 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f17.setParent(null);
    // /templates/topbar.jsp(95,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f17.setPage("/viewInventorySearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f17 = _jspx_th_html_005frewrite_005f17.doStartTag();
    if (_jspx_th_html_005frewrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f17);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f18 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f18.setParent(null);
    // /templates/topbar.jsp(96,22) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f18.setPage("/viewDecommissionInventory.jsp");
    int _jspx_eval_html_005frewrite_005f18 = _jspx_th_html_005frewrite_005f18.doStartTag();
    if (_jspx_th_html_005frewrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f18);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f19 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f4);
    // /templates/topbar.jsp(98,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f19.setPage("/showPartnerStats.do");
    int _jspx_eval_html_005frewrite_005f19 = _jspx_th_html_005frewrite_005f19.doStartTag();
    if (_jspx_th_html_005frewrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f19);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f20 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f5);
    // /templates/topbar.jsp(101,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f20.setPage("/showPartners.do");
    int _jspx_eval_html_005frewrite_005f20 = _jspx_th_html_005frewrite_005f20.doStartTag();
    if (_jspx_th_html_005frewrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f21 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f6);
    // /templates/topbar.jsp(104,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f21.setPage("/currentInvStatus.do");
    int _jspx_eval_html_005frewrite_005f21 = _jspx_th_html_005frewrite_005f21.doStartTag();
    if (_jspx_th_html_005frewrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f21);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f22 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f22.setParent(null);
    // /templates/topbar.jsp(106,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f22.setPage("/getReservedList.do");
    int _jspx_eval_html_005frewrite_005f22 = _jspx_th_html_005frewrite_005f22.doStartTag();
    if (_jspx_th_html_005frewrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f22);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f23 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f23.setParent(null);
    // /templates/topbar.jsp(107,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f23.setPage("/viewReservedListLauncher.jsp");
    int _jspx_eval_html_005frewrite_005f23 = _jspx_th_html_005frewrite_005f23.doStartTag();
    if (_jspx_th_html_005frewrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f23);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f24 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f24.setParent(null);
    // /templates/topbar.jsp(108,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f24.setPage("/getRMIStatus.do");
    int _jspx_eval_html_005frewrite_005f24 = _jspx_th_html_005frewrite_005f24.doStartTag();
    if (_jspx_th_html_005frewrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f25 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f25.setParent(null);
    // /templates/topbar.jsp(109,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f25.setPage("/showGamesAvailable.do");
    int _jspx_eval_html_005frewrite_005f25 = _jspx_th_html_005frewrite_005f25.doStartTag();
    if (_jspx_th_html_005frewrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f26 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f26.setParent(null);
    // /templates/topbar.jsp(110,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f26.setPage("/physicalInventorySummary.do");
    int _jspx_eval_html_005frewrite_005f26 = _jspx_th_html_005frewrite_005f26.doStartTag();
    if (_jspx_th_html_005frewrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f26);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f27 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f27.setParent(null);
    // /templates/topbar.jsp(111,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f27.setPage("/showFulfilledOrders.do");
    int _jspx_eval_html_005frewrite_005f27 = _jspx_th_html_005frewrite_005f27.doStartTag();
    if (_jspx_th_html_005frewrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f27);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f28 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f28.setParent(null);
    // /templates/topbar.jsp(112,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f28.setPage("/showPurchaseRequestList.do");
    int _jspx_eval_html_005frewrite_005f28 = _jspx_th_html_005frewrite_005f28.doStartTag();
    if (_jspx_th_html_005frewrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f28);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f29 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f29.setParent(null);
    // /templates/topbar.jsp(114,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f29.setPage("/addLeaser.do");
    int _jspx_eval_html_005frewrite_005f29 = _jspx_th_html_005frewrite_005f29.doStartTag();
    if (_jspx_th_html_005frewrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f29);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f30 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f30.setParent(null);
    // /templates/topbar.jsp(115,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f30.setPage("/showFastReturnedGames.do");
    int _jspx_eval_html_005frewrite_005f30 = _jspx_th_html_005frewrite_005f30.doStartTag();
    if (_jspx_th_html_005frewrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f30);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f31 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f31.setParent(null);
    // /templates/topbar.jsp(116,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f31.setPage("/showCustomerReservedGames.do");
    int _jspx_eval_html_005frewrite_005f31 = _jspx_th_html_005frewrite_005f31.doStartTag();
    if (_jspx_th_html_005frewrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f31);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f32 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f32.setParent(null);
    // /templates/topbar.jsp(117,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f32.setPage("/displayGameTabContentAndReview.jsp");
    int _jspx_eval_html_005frewrite_005f32 = _jspx_th_html_005frewrite_005f32.doStartTag();
    if (_jspx_th_html_005frewrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f32);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f33 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f33.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f33.setParent(null);
    // /templates/topbar.jsp(118,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f33.setPage("/gamesNeedScreenShots.do");
    int _jspx_eval_html_005frewrite_005f33 = _jspx_th_html_005frewrite_005f33.doStartTag();
    if (_jspx_th_html_005frewrite_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f33);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f34 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f34.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f34.setParent(null);
    // /templates/topbar.jsp(119,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f34.setPage("/viewRefetchScreenShots.jsp");
    int _jspx_eval_html_005frewrite_005f34 = _jspx_th_html_005frewrite_005f34.doStartTag();
    if (_jspx_th_html_005frewrite_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f34);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f35 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f35.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f35.setParent(null);
    // /templates/topbar.jsp(120,70) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f35.setPage("/viewStockLevelMultipliers.jsp");
    int _jspx_eval_html_005frewrite_005f35 = _jspx_th_html_005frewrite_005f35.doStartTag();
    if (_jspx_th_html_005frewrite_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f35);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f36 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f36.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f36.setParent(null);
    // /templates/topbar.jsp(121,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f36.setPage("/editStockLevelRatio.do");
    int _jspx_eval_html_005frewrite_005f36 = _jspx_th_html_005frewrite_005f36.doStartTag();
    if (_jspx_th_html_005frewrite_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f36);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f37 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f37.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f37.setParent(null);
    // /templates/topbar.jsp(121,163) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f37.setPage("/mediaReview.jsp");
    int _jspx_eval_html_005frewrite_005f37 = _jspx_th_html_005frewrite_005f37.doStartTag();
    if (_jspx_th_html_005frewrite_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f37);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f38 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f38.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f38.setParent(null);
    // /templates/topbar.jsp(122,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f38.setPage("/ADDdeals.jsp");
    int _jspx_eval_html_005frewrite_005f38 = _jspx_th_html_005frewrite_005f38.doStartTag();
    if (_jspx_th_html_005frewrite_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f38);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f39 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f39.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f39.setParent(null);
    // /templates/topbar.jsp(123,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f39.setPage("/addDeals.do");
    int _jspx_eval_html_005frewrite_005f39 = _jspx_th_html_005frewrite_005f39.doStartTag();
    if (_jspx_th_html_005frewrite_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f39);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f40 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f40.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f40.setParent(null);
    // /templates/topbar.jsp(124,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f40.setPage("/emailCampaigns.do");
    int _jspx_eval_html_005frewrite_005f40 = _jspx_th_html_005frewrite_005f40.doStartTag();
    if (_jspx_th_html_005frewrite_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f40);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f41 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f41.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f41.setParent(null);
    // /templates/topbar.jsp(124,146) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f41.setPage("/ViewGamesNoValidCopies.do");
    int _jspx_eval_html_005frewrite_005f41 = _jspx_th_html_005frewrite_005f41.doStartTag();
    if (_jspx_th_html_005frewrite_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f41);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f42 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f42.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f42.setParent(null);
    // /templates/topbar.jsp(129,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f42.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f42 = _jspx_th_html_005frewrite_005f42.doStartTag();
    if (_jspx_th_html_005frewrite_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f42);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f43 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f43.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f43.setParent(null);
    // /templates/topbar.jsp(130,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f43.setPage("/addInventory.jsp");
    int _jspx_eval_html_005frewrite_005f43 = _jspx_th_html_005frewrite_005f43.doStartTag();
    if (_jspx_th_html_005frewrite_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f43);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f44 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f44.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f44.setParent(null);
    // /templates/topbar.jsp(131,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f44.setPage("/getInventoryList.do");
    int _jspx_eval_html_005frewrite_005f44 = _jspx_th_html_005frewrite_005f44.doStartTag();
    if (_jspx_th_html_005frewrite_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f44);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f45 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f45.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f7);
    // /templates/topbar.jsp(133,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f45.setPage("/getNeedsMappingList.do");
    int _jspx_eval_html_005frewrite_005f45 = _jspx_th_html_005frewrite_005f45.doStartTag();
    if (_jspx_th_html_005frewrite_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f45);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f46 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f46.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f7);
    // /templates/topbar.jsp(134,37) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f46.setPage("/gameDudeNeedsMappingList.do");
    int _jspx_eval_html_005frewrite_005f46 = _jspx_th_html_005frewrite_005f46.doStartTag();
    if (_jspx_th_html_005frewrite_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f46);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f47 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f47.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f47.setParent(null);
    // /templates/topbar.jsp(136,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f47.setPage("/editShippingFee.do");
    int _jspx_eval_html_005frewrite_005f47 = _jspx_th_html_005frewrite_005f47.doStartTag();
    if (_jspx_th_html_005frewrite_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f47);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f48 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f48.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f48.setParent(null);
    // /templates/topbar.jsp(138,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f48.setPage("/fetchGameRetailPrices.do");
    int _jspx_eval_html_005frewrite_005f48 = _jspx_th_html_005frewrite_005f48.doStartTag();
    if (_jspx_th_html_005frewrite_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f48);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f49 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f49.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f49.setParent(null);
    // /templates/topbar.jsp(139,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f49.setPage("/generateUsedGamesForSale.do");
    int _jspx_eval_html_005frewrite_005f49 = _jspx_th_html_005frewrite_005f49.doStartTag();
    if (_jspx_th_html_005frewrite_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f49);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f50 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f50.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f50.setParent(null);
    // /templates/topbar.jsp(140,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f50.setPage("/editInventoryGamesRatio.do");
    int _jspx_eval_html_005frewrite_005f50 = _jspx_th_html_005frewrite_005f50.doStartTag();
    if (_jspx_th_html_005frewrite_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f50);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f51 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f51.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f51.setParent(null);
    // /templates/topbar.jsp(141,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f51.setPage("/displayEditDefaultPrices.jsp");
    int _jspx_eval_html_005frewrite_005f51 = _jspx_th_html_005frewrite_005f51.doStartTag();
    if (_jspx_th_html_005frewrite_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f51);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f52 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f52.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f52.setParent(null);
    // /templates/topbar.jsp(142,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f52.setPage("/editUsedGamesForSale.do");
    int _jspx_eval_html_005frewrite_005f52 = _jspx_th_html_005frewrite_005f52.doStartTag();
    if (_jspx_th_html_005frewrite_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f52);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f53 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f53.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f53.setParent(null);
    // /templates/topbar.jsp(144,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f53.setPage("/fetchGamesForSale.do");
    int _jspx_eval_html_005frewrite_005f53 = _jspx_th_html_005frewrite_005f53.doStartTag();
    if (_jspx_th_html_005frewrite_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f53);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f54 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f54.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f54.setParent(null);
    // /templates/topbar.jsp(145,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f54.setPage("/addGame.jsp");
    int _jspx_eval_html_005frewrite_005f54 = _jspx_th_html_005frewrite_005f54.doStartTag();
    if (_jspx_th_html_005frewrite_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f54);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f55 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f55.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f55.setParent(null);
    // /templates/topbar.jsp(146,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f55.setPage("/addAccessory.jsp");
    int _jspx_eval_html_005frewrite_005f55 = _jspx_th_html_005frewrite_005f55.doStartTag();
    if (_jspx_th_html_005frewrite_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f55);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f56 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f56.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f56.setParent(null);
    // /templates/topbar.jsp(147,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f56.setPage("/viewAccessories.jsp");
    int _jspx_eval_html_005frewrite_005f56 = _jspx_th_html_005frewrite_005f56.doStartTag();
    if (_jspx_th_html_005frewrite_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f56);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f57 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f57.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f57.setParent(null);
    // /templates/topbar.jsp(148,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f57.setPage("/addAccessoryType.jsp");
    int _jspx_eval_html_005frewrite_005f57 = _jspx_th_html_005frewrite_005f57.doStartTag();
    if (_jspx_th_html_005frewrite_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f57);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f58 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f58.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f58.setParent(null);
    // /templates/topbar.jsp(149,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f58.setPage("/addAccessory.jsp");
    int _jspx_eval_html_005frewrite_005f58 = _jspx_th_html_005frewrite_005f58.doStartTag();
    if (_jspx_th_html_005frewrite_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f58);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f59 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f59.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f59.setParent(null);
    // /templates/topbar.jsp(150,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f59.setPage("/addAccessory.jsp");
    int _jspx_eval_html_005frewrite_005f59 = _jspx_th_html_005frewrite_005f59.doStartTag();
    if (_jspx_th_html_005frewrite_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f59);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f60 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f60.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f60.setParent(null);
    // /templates/topbar.jsp(151,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f60.setPage("/addGameAccessoryType.jsp");
    int _jspx_eval_html_005frewrite_005f60 = _jspx_th_html_005frewrite_005f60.doStartTag();
    if (_jspx_th_html_005frewrite_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f60);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f61 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f61.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f61.setParent(null);
    // /templates/topbar.jsp(152,31) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f61.setPage("/uploadScreenshots.jsp");
    int _jspx_eval_html_005frewrite_005f61 = _jspx_th_html_005frewrite_005f61.doStartTag();
    if (_jspx_th_html_005frewrite_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f61);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f62 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f62.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f62.setParent(null);
    // /templates/topbar.jsp(153,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f62.setPage("/uploadVideoStart.jsp");
    int _jspx_eval_html_005frewrite_005f62 = _jspx_th_html_005frewrite_005f62.doStartTag();
    if (_jspx_th_html_005frewrite_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f62);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f63 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f63.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f63.setParent(null);
    // /templates/topbar.jsp(154,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f63.setPage("/uploadScreenshots.jsp?type=wallp");
    int _jspx_eval_html_005frewrite_005f63 = _jspx_th_html_005frewrite_005f63.doStartTag();
    if (_jspx_th_html_005frewrite_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f63);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f64 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f64.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f64.setParent(null);
    // /templates/topbar.jsp(155,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f64.setPage("/editFeaturedGame.jsp");
    int _jspx_eval_html_005frewrite_005f64 = _jspx_th_html_005frewrite_005f64.doStartTag();
    if (_jspx_th_html_005frewrite_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f64);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f65 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f65.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f65.setParent(null);
    // /templates/topbar.jsp(155,116) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f65.setPage("/showSpecialSale.do");
    int _jspx_eval_html_005frewrite_005f65 = _jspx_th_html_005frewrite_005f65.doStartTag();
    if (_jspx_th_html_005frewrite_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f65);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f66 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f66.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f66.setParent(null);
    // /templates/topbar.jsp(156,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f66.setPage("/ShowCoupons.do");
    int _jspx_eval_html_005frewrite_005f66 = _jspx_th_html_005frewrite_005f66.doStartTag();
    if (_jspx_th_html_005frewrite_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f66);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f67 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f67.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f67.setParent(null);
    // /templates/topbar.jsp(157,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f67.setPage("/viewCouponCustomers.do");
    int _jspx_eval_html_005frewrite_005f67 = _jspx_th_html_005frewrite_005f67.doStartTag();
    if (_jspx_th_html_005frewrite_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f67);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f68 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f68.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f68.setParent(null);
    // /templates/topbar.jsp(164,25) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f68.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f68 = _jspx_th_html_005frewrite_005f68.doStartTag();
    if (_jspx_th_html_005frewrite_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f68);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f69 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f69.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f69.setParent(null);
    // /templates/topbar.jsp(165,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f69.setPage("/editPurchasingNeedRatioNew.do");
    int _jspx_eval_html_005frewrite_005f69 = _jspx_th_html_005frewrite_005f69.doStartTag();
    if (_jspx_th_html_005frewrite_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f69);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f70 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f70.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f70.setParent(null);
    // /templates/topbar.jsp(166,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f70.setPage("/generateGamePurchasingNeeds.do?useNewSystem=yes");
    int _jspx_eval_html_005frewrite_005f70 = _jspx_th_html_005frewrite_005f70.doStartTag();
    if (_jspx_th_html_005frewrite_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f70);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f71 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f71.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f71.setParent(null);
    // /templates/topbar.jsp(167,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f71.setPage("/fetchGamePurchasingNeeds.do");
    int _jspx_eval_html_005frewrite_005f71 = _jspx_th_html_005frewrite_005f71.doStartTag();
    if (_jspx_th_html_005frewrite_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f71);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f72 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f72.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f72.setParent(null);
    // /templates/topbar.jsp(168,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f72.setPage("/fetchGamePurchasingNeeds.do?released=no");
    int _jspx_eval_html_005frewrite_005f72 = _jspx_th_html_005frewrite_005f72.doStartTag();
    if (_jspx_th_html_005frewrite_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f72);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f73 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f73.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f73.setParent(null);
    // /templates/topbar.jsp(169,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f73.setPage("/addBugTrackingType.jsp");
    int _jspx_eval_html_005frewrite_005f73 = _jspx_th_html_005frewrite_005f73.doStartTag();
    if (_jspx_th_html_005frewrite_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f73);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f74 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f74.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f74.setParent(null);
    // /templates/topbar.jsp(170,27) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f74.setPage("/viewBugTrackingType.jsp");
    int _jspx_eval_html_005frewrite_005f74 = _jspx_th_html_005frewrite_005f74.doStartTag();
    if (_jspx_th_html_005frewrite_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f74);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f75 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f75.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f75.setParent(null);
    // /templates/topbar.jsp(172,86) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f75.setPage("/viewCustomerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f75 = _jspx_th_html_005frewrite_005f75.doStartTag();
    if (_jspx_th_html_005frewrite_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f75);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f76 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f76.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f76.setParent(null);
    // /templates/topbar.jsp(172,190) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f76.setPage("/gamesSalesSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f76 = _jspx_th_html_005frewrite_005f76.doStartTag();
    if (_jspx_th_html_005frewrite_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f76);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f77 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f77.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f77.setParent(null);
    // /templates/topbar.jsp(172,289) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f77.setPage("/subscriptionSalesSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f77 = _jspx_th_html_005frewrite_005f77.doStartTag();
    if (_jspx_th_html_005frewrite_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f77);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f78 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f78.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f78.setParent(null);
    // /templates/topbar.jsp(172,402) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f78.setPage("/membershipBaseSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f78 = _jspx_th_html_005frewrite_005f78.doStartTag();
    if (_jspx_th_html_005frewrite_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f78);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f79 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f79.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f79.setParent(null);
    // /templates/topbar.jsp(172,509) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f79.setPage("/trendTrackerSearchPage.jsp");
    int _jspx_eval_html_005frewrite_005f79 = _jspx_th_html_005frewrite_005f79.doStartTag();
    if (_jspx_th_html_005frewrite_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f79);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.taglib.template.GetTag _jspx_th_template_005fget_005f0 = (org.apache.struts.taglib.template.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.get(org.apache.struts.taglib.template.GetTag.class);
    _jspx_th_template_005fget_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f0.setParent(null);
    // /templates/topbar.jsp(178,78) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fget_005f0.setName("breadcrumb");
    int _jspx_eval_template_005fget_005f0 = _jspx_th_template_005fget_005f0.doStartTag();
    if (_jspx_th_template_005fget_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_0026_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
    return false;
  }
}
