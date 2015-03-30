package org.apache.jsp.WEB_002dINF.jsp.orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/confirmDeleteOrderPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/toolTipPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/toolTipCurrencyPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/toolTipReportPop.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.release();
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
      out.write("\n");
      out.write("<link href=\"css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"thumbnailhover_files/jquery-latest.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/loyalty/order/orderManager.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#topMenuRed\").hide();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("label{\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write(".vanadium-advice {\n");
      out.write("\tmargin-left: 100%;\n");
      out.write("}\n");
      out.write("input.vanadium-valid {\n");
      out.write("\tbackground-image: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row_without_color {\n");
      out.write("\tbackground-color:white;\n");
      out.write("}\n");
      out.write(".row_with_color {\n");
      out.write("\tbackground-color: rgb(245,249,252);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div id=\"divRoot\" class=\"unit\" style=\"width:1500px;margin-left:60px;\">\n");
      out.write("<div class=\"pop_title\" style=\"margin-top:30px;\">Report Orders</div>\n");
      out.write("\n");
      out.write("  <div id=\"formContainer\" style=\"padding-bottom: 60px;\">\n");
      out.write("  <br/> \n");
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- FORM FOR DOWNLOAD PDF --> \n");
      out.write("   ");
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- FORM FOR DOWNLOAD Admin.xls --> \n");
      out.write("   ");
      if (_jspx_meth_s_005fform_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   \n");
      out.write("  <!-- ............................. TABLE USER LOGIN ............................ -->\n");
      out.write("  <table border=\"1\" id=\"tabLogin\" width=\"1120px\">\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"7\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ....................Search Options.................... -->\n");
      out.write("\t\t\t\t<tr height=\"60px\"  style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("  \t\t \t\t\t\t\t\t   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;\">\n");
      out.write("\t\t\t\t<!-- ...Login... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:80px;\">Client Login:</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<div class=\"ui-widget\">\n");
      out.write("\t\t   \t\t\t<span style=\"font-size:12px;\">\n");
      out.write("\t\t   \t\t\t");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t   \t\t\t</span>\n");
      out.write("\t\t   \t\t\t</div>\n");
      out.write("\t\t   \t\t\t<div style=\"position:absolute;\">  \n");
      out.write("\t\t   \t\t\t <select id=\"selectUsersTag\"  name=\"sometext\" size=\"2\" multiple=\"multiple\" class=\"selectUsersTag\"\n");
      out.write("\t\t   \t\t\t \t\t style=\"height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;\" scrolling=\"no\">\n");
      out.write("\t\t\t\t\t    <option></option>\n");
      out.write("\t\t\t\t\t </select>\n");
      out.write("\t\t   \t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...lsOrderId... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:45px;\">ls_Order_Id:</td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\">");
      if (_jspx_meth_s_005ftextfield_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...Status... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:45px;\">Status:</td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\">");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t\t<!-- ...Creation Date Start... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:140px;\" valign=\"middle\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fdate_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f2(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t\t<!-- ...Creation Date End... -->            \n");
      out.write("\t\t\t\t <td style=\"padding-left: 5px;\">\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_s_005fdate_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_s_005ftextfield_005f3(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t\t\t             \n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t    <td style=\"padding-left: 5px;\"><img id=\"iconFindOrders\" src=\"images/orders/findOrders.png\"/></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr height=\"60px\"  style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("  \t\t \t\t\t\t\t\t   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;\">\n");
      out.write("\t\t\t\t<!-- ...Login... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:80px;\">PO:</td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...lsOrderId... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:45px;\">Tracking Number:</td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\"></td>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...Status... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:45px;\">Client Order ID:</td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\"></td>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\">Client Other ID</td>\n");
      out.write("\t\t\t\t<!-- ...Creation Date Start... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;width:140px;\" valign=\"middle\" colspan=\"3\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"7\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- .................................................... -->\t\t\t\t\t\t\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <!-- ............................ List users .................................. --> \n");
      out.write("\t<select id=\"list\"  style=\"visibility:hidden;display:none;\">\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\t</select> \n");
      out.write(" <!-- .......................................................................... -->\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- .......... Operations: get XLS Canada Post, XLS, print Selected orders and print ALL ...... -->\n");
      out.write("  <br/>\n");
      out.write("  <table id=\"tabPrintAndXLS\">\n");
      out.write("\t<tr height=\"50px\" valign=\"middle\">\n");
      out.write("\t\t<td id=\"listOrderDTOSize\" width=\"110px\">\n");
      out.write("\t  \t\tResult/page:");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td width=\"105px\" >\n");
      out.write("\t  \t\tTotal:");
      if (_jspx_meth_s_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t</tr>\n");
      out.write("   </table>\n");
      out.write("  ");
      if (_jspx_meth_s_005fhidden_005f92(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("  <!-- ............................. Orders List ............................... -->\n");
      out.write(" <br/> \n");
      out.write("<table id=\"tabOrderOrders\" width=\"5030px\" border=\"0\" class=\"nowraptable datatable\" style=\"align:left;cursor:default;table-layout: fixed;\">\n");
      out.write("\t<thead class=\"gray_header\">\n");
      out.write("\t\t<tr height=\"30px\">\n");
      out.write("\t\t\t<td width=\"45px\" ><img style=\"cursor: pointer;margin-left:10px;\" id=\"imgSelectAllPO\" alt=\"\" src=\"images/orders/selectAllPO.png\"  /></td>  \n");
      out.write("\t\t\t<td width=\"20px\" style=\"padding-right: 10px;\"><img style=\"cursor: pointer;align: right;\" id=\"imgSort\" alt=\"\" src=\"images/orders/selectSommePO.png\" /></td>\n");
      out.write("\t\t\t<td width=\"135px\" style=\"padding-left: 5px;border-left:1px solid white;border-right:1px solid white;\">Partner Name<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"134px\" style=\"padding-left: 5px;border-left:1px solid white;border-right:1px solid white;visibility:hidden;display:none;padding-right:10px;\">Row order ID<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"220px\" style=\"padding-left: 10px;border-right:1px solid white;\">LS Order ID<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"103px\" style=\"padding-left: 10px;border-right:1px solid white;\">PO Date<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"120px\" style=\"padding-left: 10px;border-right:1px solid white;\">Required Date<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"120px\"  style=\"padding-left: 10px;border-right:1px solid white;\">Status<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td style=\"visibility:hidden;display:none;\"><img id=\"imgSort\" src=\"\" /></td>\n");
      out.write("\t\t\t<td width=\"130px\" style=\"padding-left: 10px;border-right:1px solid white;\">LS Product ID<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"90px\"  style=\"padding-left: 10px;border-right:1px solid white;\">Quantity<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"90px\"  style=\"padding-left: 10px;border-right:1px solid white;\">STOCK<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"180px\" style=\"padding-left: 10px;border-right:1px solid white;\">Product Title<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"120px\" style=\"padding-left: 10px;border-right:1px solid white;\">Unit Price<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"120px\" style=\"padding-left: 10px;border-right:1px solid white;\">LS Price<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"132px\" style=\"padding-left: 10px;border-right:1px solid white;\">Unit Price Currency</td>\n");
      out.write("\t\t\t<td width=\"120px\" style=\"padding-left: 10px;border-right:1px solid white;\">LS Price Currency</td>\n");
      out.write("\t\t\t<td width=\"170px\" style=\"padding-left: 10px;border-right:1px solid white;\">Notes<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"120px\" style=\"padding-left: 10px;border-right:1px solid white;\">PO number<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"160px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Product number<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"110px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Order ID<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<td width=\"165px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Other ID<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<td width=\"150px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client First Name<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"150px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Last Name<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"130px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Other Names<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"100px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Number<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"170px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Street<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"170px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Other Address<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"100px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client City<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"110px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Province<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"130px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Postal Code<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"100px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Phone<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"180px\" style=\"padding-left: 10px;border-right:1px solid white;\">Client Email<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"170px\" style=\"padding-left: 10px;border-right:1px solid white;\">Shipping Company<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"135px\" style=\"padding-left: 10px;border-right:1px solid white;\">Shipped Date<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"170px\" style=\"padding-left: 10px;border-right:1px solid white;\">Tracking Number<img id=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\" style=\"vertical-align:middle;cursor:pointer;padding-right:10px;\"/></td>\t\n");
      out.write("\t\t\t<td width=\"110px\" style=\"padding-left: 10px;border-right:1px solid white;\">Shipping Price<img id=\"imgSort\" src=\"\" style=\"visibility:hidden;display:none;padding-right:10px;\"/></td>\n");
      out.write("\t\t\t<td width=\"95px\" style=\"padding-left: 10px;border-right:1px solid white;\">Billed</td>\n");
      out.write("\t\t\t<td style=\"background-color: white;border-right:0px solid white;\">Billed</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead>\n");
      out.write("\t<tbody>\n");
      out.write("\t ");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</tbody>\t       \n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- ........................Paging .......................  --> \n");
      out.write("  <table align=\"center\" id=\"tabPageIndex\">\n");
      out.write("  \t  <tr height=\"20px\" valign=\"middle\" align=\"center\">\n");
      out.write("\t \t<td colspan=\"13\"/>\n");
      out.write("\t  </tr>\n");
      out.write("\t  <tr>\n");
      out.write("\t\t  <td>\n");
      out.write("\t\t  ");
      if (_jspx_meth_s_005fif_005f14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  ");
      if (_jspx_meth_s_005felseif_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  </td>\n");
      out.write("\t\t  ");
      if (_jspx_meth_s_005fiterator_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  <td>\n");
      out.write("\t\t  ");
      if (_jspx_meth_s_005fif_005f16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  ");
      if (_jspx_meth_s_005felseif_005f7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  </td>\n");
      out.write("\t  </tr>\n");
      out.write("  </table>\n");
      out.write("  <!-- ........................Paging .......................  -->\n");
      out.write("\n");
      out.write("  <!-- ...........................jsp fragment ................................. -->\n");
      out.write("\t     ");
      out.write("\n");
      out.write("<style type=\"text/css\" >\n");
      out.write("\t#orderDetailPop {\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\twidth:880px;\n");
      out.write("\t\theight:600px;\n");
      out.write("\t\t\n");
      out.write("\t\t/*top:30%;\n");
      out.write("\t\tleft:37%;*/\n");
      out.write("\t\ttop:");
      out.print( request.getParameter("poYpop") );
      out.write("px;\n");
      out.write("\t\tleft:");
      out.print( request.getParameter("poXpop") );
      out.write("px;\n");
      out.write("\t\tborder:5px solid #B0C4DE;\n");
      out.write("\t\tz-index: 600;\n");
      out.write("\t\tdisplay:none;\n");
      out.write("\t\tvisibility:hidden;\n");
      out.write("\t\tpadding-top:5px;\n");
      out.write("\t\tbackground-color:rgb(44,140,171);\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("/* <![CDATA[ */\t\n");
      out.write("document.onmousedown = down;\n");
      out.write("document.onmousemove = drag;\n");
      out.write("document.onmouseup = up;\n");
      out.write("var zindex = 0;\n");
      out.write("var objSelected;\n");
      out.write("function down(objEvent) {\n");
      out.write("\tvar ev = window.event || objEvent ;\n");
      out.write("\tobjSelected = ev.srcElement || ev.target;\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\n");
      out.write("\t\tobjSelected.style.borderColor =\"red\";\n");
      out.write("\t\t//objSelected.style.cursor = \"move\";\n");
      out.write("\t\tzindex++; \n");
      out.write("\t\tobjSelected.style.zIndex = zindex ; \n");
      out.write("\t\tdx = ev.offsetX || ev.layerX;\n");
      out.write("\t\tdy = ev.offsetY || ev.layerY;\t\n");
      out.write("\t\twindow.status = \"dx = \" + dx + \", dy = \" + dy;\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function up(objEvent) {\n");
      out.write("\tvar ev = window.event || objEvent ;\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\n");
      out.write("\t\tobjSelected.style.borderColor = \"#B0C4DE\";\n");
      out.write("\t\tobjSelected.style.cursor = \"auto\";\n");
      out.write("\t\tobjSelected = null;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function drag(objEvent) {\n");
      out.write("\tvar ev = window.event || objEvent ;\n");
      out.write("\t\tif (objSelected && objSelected.nodeName==\"DIV\") {\n");
      out.write("\t\t\tobjSelected.style.left = (ev.clientX-dx) + \"px\";\n");
      out.write("\t\t\tobjSelected.style.top = (ev.clientY-dy) + \"px\" ;\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*  ]]> */\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"orderDetailPop\" class=\"conteneurPrompt\" style='");
      if (_jspx_meth_s_005fproperty_005f53(_jspx_page_context))
        return;
      out.write("'  >\n");
      out.write("\t<span id=\"titlePop\" style=\"color:white;font-size: 16px;vertical-align: middle;\">");
      if (_jspx_meth_s_005fproperty_005f54(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t<div style=\"height: 5px;\"></div>\n");
      out.write("\t<!-- *************************************************** Le Body ********************************************************** -->\t\t\t \t\n");
      out.write("\t<div  style=\"width:100%;height:575px;background-color:rgb(249,249,249);");
      if (_jspx_meth_s_005fproperty_005f55(_jspx_page_context))
        return;
      out.write("; color:#000000; font-size:12px; padding-left: 0px; padding-right:0px; padding: 0px;\">\n");
      out.write("\t\n");
      out.write("\t<table  cellspacing=\"0\" width=\"100%\" border=\"0\">\t\t \t\t\n");
      out.write("\t\t<tr  height=\"530px\">\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"left\" style=\"padding-left: 20px;padding-right: 20px;\" valign=\"top\">\n");
      out.write("\t\t\t\t<div style=\"font-family: Arial, Helvetica, sans-serif;font-size: 11px;\">\n");
      out.write("\t\t\t\t   <table id=\"tabOrderDetailPop\" height=\"300px\" width=\"100%\" border=\"0\" cellspacing=\"0px\" cellpadding=\"0px\">\n");
      out.write("\t\t\t\t   \t\t\t   \n");
      out.write("\t\t\t\t    <tr height=\"15px\">\n");
      out.write("\t\t \t\t\t<td colspan=\"2\"/>   \n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\t    <tr height=\"20px\">\n");
      out.write("\t\t\t\t    <td colspan=\"2\">\n");
      out.write("\t\t\t\t\t    <table border=\"0\">\n");
      out.write("\t\t\t\t\t    <tr height=\"20px\">\n");
      out.write("\t\t\t\t\t    <td width=\"143px\"><font style=\"color: #484848;\">PARTNER LOGIN:</font></td>\n");
      out.write("\t\t\t\t\t    <td width=\"480px\">\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005fif_005f17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005felse_005f8(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t\t\t    <td width=\"120px\"><font style=\"color: #484848;\">ORDER DATE :</font><font style=\"color:red;font-size: 15px;\"> * </font></td>\n");
      out.write("\t\t\t\t\t    <td>\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005fdate_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    <!-- ......... PRODUCT ORDER DATE ............ -->\n");
      out.write("\t\t \t\t\t\t");
      if (_jspx_meth_s_005fif_005f18(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005felse_005f9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    </td>\n");
      out.write("\t\t\t\t\t     <!-- ......... CLIENT PRODUCT ORDER DATE ............ -->\n");
      out.write("\t\t\t\t\t    <td style=\"visibility:hidden;display:none;\">\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005fdate_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    <!-- ......... PRODUCT ORDER DATE ............ -->\n");
      out.write("\t\t\t\t\t\t ");
      if (_jspx_meth_s_005ftextfield_005f12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    </td>\n");
      out.write("\t\t\t\t\t    </tr>\n");
      out.write("\t\t\t\t\t    <tr height=\"20px\">\n");
      out.write("\t\t \t\t\t\t<td width=\"143px\"><font style=\"color: #484848;\">PO NUMBER:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>   \n");
      out.write("\t\t \t\t\t\t<td>\n");
      out.write("\t\t \t\t\t\t<!-- ......... PRODUCT ORDER NUMBER ............ -->\n");
      out.write("\t\t \t\t\t\t");
      if (_jspx_meth_s_005fif_005f19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t\t");
      if (_jspx_meth_s_005felse_005f10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t\t</td>\n");
      out.write("\t\t \t\t\t\t<td><font style=\"color: #484848;\">REQUARD DATE :</font></td>\n");
      out.write("\t\t \t\t\t\t<td>\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005fdate_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    <!-- ......... PRODUCT ORDER DATE ............ -->\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t    </td>\n");
      out.write("\t\t \t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t    </table>\n");
      out.write("\t\t\t\t    </td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td width=\"17%\"><font style=\"color: #484848;\">CLIENT LAST NAME:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>   \n");
      out.write("\t\t \t\t\t<!-- ......... LAST AND FIRST NAME ............ -->\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f21(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f12(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t \t\t\t\t\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT OTHER NAMES:</font></td>\n");
      out.write("\t\t \t\t\t<td>");
      if (_jspx_meth_s_005ftextfield_005f20(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. COMPANY NAME ........................ -->\n");
      out.write("\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">COMPANY NAME: </font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f22(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f13(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t \t\t\t\t\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT SREET ........................ -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT STREET:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>\n");
      out.write("\t\t \t\t\t<td>\t\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f23(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr> \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT SREET ........................ -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT OTHER STREET ................. -->\t\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT OTHER ADDRESS:</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f24(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT OTHER STREET .................. -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT SREET ......................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT PROVINCE ...................... -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT PROVINCE:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f25(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT PROVINCE ...................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT CITY .......................... -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT CITY:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t<!-- ......... CLIENT CITY ............ -->\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT CITY .......................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT POSTALE CODE ................... -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT POSTAL CODE:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f27(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f18(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT POSTALE CODE ................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT PHONE........................... -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT PHONE:</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f28(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT PHONE........................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT EMAIL........................... -->\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT EMAIL:</font></td>\n");
      out.write("\t\t \t\t\t<td>\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f29(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. CLIENT EMAIL........................... -->\n");
      out.write("\t\t \t\t\t\n");
      out.write("\t\t \t\t\t<!-- ............................. ITEMS TITLE............................ -->\n");
      out.write("\t\t \t\t\t<tr height=\"25px\">\n");
      out.write("\t\t \t\t\t<td colspan=\"2\" valign=\"middle\" style=\"color:red;text-decoration:underline;\">ITEMS:</td>\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<!-- ............................. ITEMS TITLE............................ -->\n");
      out.write("\t\t \t\t</table>\n");
      out.write("\t\t \t\t\n");
      out.write("\t\t \t\t<!-- ............................. ITEMS....................................... -->\n");
      out.write("\t\t \t\t<table border=\"0\"  width=\"100%\" cellspacing=\"0px\" cellpadding=\"0px\"  style=\"padding-left: 0px;cursor:default;\">\n");
      out.write("\t\t\t \t<tr height=\"25px\" valign=\"middle\" align=\"center\" style=\"font-weight: bold;border-right: 1px solid #CCCCCC;border-left: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;\" >\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 128px;\"><font style=\"color: #484848;\">LS PRODUCT ID</font><font style=\"color:red;font-size: 15px;\"> *</font></th>\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 128px;\"><font style=\"color: #484848;\">QUANTITY</font><font style=\"color:red;font-size: 15px;\"> *</font></th>\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 75px;\"><font style=\"color: #484848;\">STOCK</font></th>\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 205px;\"><font style=\"color: #484848;\">PRODUCT TITLE</font></th>\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 85px;\"><font style=\"color: #484848;\">LS PRICE</font></th>\n");
      out.write("\t\t\t \t\t<th style=\"border-right: 0px solid #CCCCCC;width: 85px;\"><font style=\"color: #484848;\">UNIT PRICE</font><font style=\"color:red;font-size: 15px;\"> *</font></th>\n");
      out.write("\t\t\t \t\t<th align=\"center\" style=\"border-right: 0px solid #CCCCCC;width: 58px;\"><font style=\"color: #484848;\">STATUS</font></th>\n");
      out.write("\t\t\t \t\t<th colspan=\"3\"></th>\n");
      out.write("\t\t\t \t</tr> \n");
      out.write("\t\t \t\t</table>\n");
      out.write("\t\t \t\t<div id=\"divRowsOrder\" style=\"overflow: auto;max-height: 170px;cursor:default;\">\n");
      out.write("\t\t\t\t<table id=\"tabOrderRowsDetailPop\" border=\"0\"  width=\"100%\" id=\"tabItemsPop\" cellspacing=\"0px\" cellpadding=\"0px\"  style=\"padding-left: 0px;cursor:default;\">\n");
      out.write("\t\t\t    ");
      if (_jspx_meth_s_005fiterator_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t    </table>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr valign=\"top\">\n");
      out.write("\t\t<td colspan=\"3\" align=\"center\">\n");
      out.write("\t\t\t<input id=\"btSave\" type=\"submit\" value=\"Save\"\n");
      out.write("\t\t\t\t   style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;\" />\n");
      out.write("\t\t\t<input id=\"btDuplicate\"  type=\"submit\" value=\"Duplicate\"\n");
      out.write("\t\t\t\t   style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;\" />\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fif_005f33(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("\t\t\t<input id=\"btCancel\"  type=\"submit\" value=\"Close\"\n");
      out.write("\t\t\t\t   style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;\" /></td>\n");
      out.write("\t\t </tr>\n");
      out.write("\t\t\t \t\t\t\t\t \t\t\t\n");
      out.write("\t</table>\n");
      out.write("  \n");
      out.write(" <!-- ...........................jsp fragment ................................. -->\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\r\n");
      out.write("\t#saveSuccessPop {\r\n");
      out.write("\t\tposition:absolute;\r\n");
      out.write("\t\twidth:250px;\r\n");
      out.write("\t\theight:155px;\r\n");
      out.write("\t\ttop:30%;\r\n");
      out.write("\t\tleft:37%;\r\n");
      out.write("\t\tborder:1px solid #B0C4DE;\r\n");
      out.write("\t\tz-index: 700;\r\n");
      out.write("\t\tdisplay:none;\r\n");
      out.write("\t\tvisibility:hidden;\r\n");
      out.write("\t\tpadding-top:5px;\r\n");
      out.write("\t\tbackground-color:rgb(85,85,85);\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("/* <![CDATA[ */\t\r\n");
      out.write("document.onmousedown = down;\r\n");
      out.write("document.onmousemove = drag;\r\n");
      out.write("document.onmouseup = up;\r\n");
      out.write("var zindex = 0;\r\n");
      out.write("var objSelected;\r\n");
      out.write("function down(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\tobjSelected = ev.srcElement || ev.target;\r\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\tobjSelected.style.borderColor =\"red\";\r\n");
      out.write("\t\tobjSelected.style.cursor = \"move\";\r\n");
      out.write("\t\tzindex++; \r\n");
      out.write("\t\tobjSelected.style.zIndex = zindex ; \r\n");
      out.write("\t\tdx = ev.offsetX || ev.layerX;\r\n");
      out.write("\t\tdy = ev.offsetY || ev.layerY;\t\r\n");
      out.write("\t\twindow.status = \"dx = \" + dx + \", dy = \" + dy;\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function up(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\tobjSelected.style.borderColor = \"#B0C4DE\";\r\n");
      out.write("\t\tobjSelected.style.cursor = \"auto\";\r\n");
      out.write("\t\tobjSelected = null;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function drag(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\t\tif (objSelected && objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\t\tobjSelected.style.left = (ev.clientX-dx) + \"px\";\r\n");
      out.write("\t\t\tobjSelected.style.top = (ev.clientY-dy) + \"px\" ;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*  ]]> */\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"saveSuccessPop\" class=\"conteneurPrompt\" style='");
      if (_jspx_meth_s_005fproperty_005f76(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("\t\t<span id=\"titlePop\" style=\"color:white;font-size: 16px;vertical-align: middle;\">Result</span>\r\n");
      out.write("\t\t<div style=\"height: 5px;\"></div>\r\n");
      out.write("\t\t<!-- *************************************************** Le Body ********************************************************** -->\t\t\t \t\r\n");
      out.write("\t\t <div style=\"width:100%;height:130px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;\">\r\n");
      out.write("\t\t\t\t \t<center>\r\n");
      out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"130px\" border=\"0\">\r\n");
      out.write("\t\t\t \t\t\r\n");
      out.write("\t\t\t \t\t\t<tr>\r\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" style=\"padding-left: 20px;padding-right: 20px;\">\r\n");
      out.write("\t\t\t\t \t\t\t\t<div style=\"max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\">\r\n");
      out.write("\t\t\t\t \t\t\t\t\t<center id=\"msgConfirmation\">");
      if (_jspx_meth_s_005fproperty_005f77(_jspx_page_context))
        return;
      out.write("</center>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t \t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t \t\t\t<tr height=\"45px\" valign=\"top\">\r\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\"><input id=\"btOK\"  type=\"button\" value=\"OK\"\r\n");
      out.write("\t\t\t\t \t\t\t    style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\" /></td>\r\n");
      out.write("\t\t\t \t\t\t</tr>\r\n");
      out.write("\t\t\t \t\t\t\t\t \t\t\t\r\n");
      out.write("\t\t\t \t\t</table>\r\n");
      out.write("\t\t\t \t\t</center>\r\n");
      out.write("            </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\r\n");
      out.write("\t#confirmDeleteOrderPop {\r\n");
      out.write("\t\tposition:absolute;\r\n");
      out.write("\t\twidth:250px;\r\n");
      out.write("\t\theight:155px;\r\n");
      out.write("\t\ttop:30%;\r\n");
      out.write("\t\tleft:37%;\r\n");
      out.write("\t\tborder:1px solid #B0C4DE;\r\n");
      out.write("\t\tz-index: 700;\r\n");
      out.write("\t\tdisplay:none;\r\n");
      out.write("\t\tvisibility:hidden;\r\n");
      out.write("\t\tpadding-top:5px;\r\n");
      out.write("\t\tbackground-color:rgb(85,85,85);\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("/* <![CDATA[ */\t\r\n");
      out.write("document.onmousedown = down;\r\n");
      out.write("document.onmousemove = drag;\r\n");
      out.write("document.onmouseup = up;\r\n");
      out.write("var zindex = 0;\r\n");
      out.write("var objSelected;\r\n");
      out.write("function down(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\tobjSelected = ev.srcElement || ev.target;\r\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\tobjSelected.style.borderColor =\"red\";\r\n");
      out.write("\t\tobjSelected.style.cursor = \"move\";\r\n");
      out.write("\t\tzindex++; \r\n");
      out.write("\t\tobjSelected.style.zIndex = zindex ; \r\n");
      out.write("\t\tdx = ev.offsetX || ev.layerX;\r\n");
      out.write("\t\tdy = ev.offsetY || ev.layerY;\t\r\n");
      out.write("\t\twindow.status = \"dx = \" + dx + \", dy = \" + dy;\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function up(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\tif (objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\tobjSelected.style.borderColor = \"#B0C4DE\";\r\n");
      out.write("\t\tobjSelected.style.cursor = \"auto\";\r\n");
      out.write("\t\tobjSelected = null;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function drag(objEvent) {\r\n");
      out.write("\tvar ev = window.event || objEvent ;\r\n");
      out.write("\t\tif (objSelected && objSelected.nodeName==\"DIV\") {\r\n");
      out.write("\t\t\tobjSelected.style.left = (ev.clientX-dx) + \"px\";\r\n");
      out.write("\t\t\tobjSelected.style.top = (ev.clientY-dy) + \"px\" ;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*  ]]> */\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"confirmDeleteOrderPop\" class=\"conteneurPrompt\" style='");
      if (_jspx_meth_s_005fproperty_005f78(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("\t\t<span id=\"titlePop\" style=\"color:white;font-size: 16px;vertical-align: middle;\">Delete Order-Confirmation</span>\r\n");
      out.write("\t\t<div style=\"height: 5px;\"></div>\r\n");
      out.write("\t\t<!-- *************************************************** Le Body ********************************************************** -->\t\t\t \t\r\n");
      out.write("\t\t <div style=\"width:100%;height:130px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;\">\r\n");
      out.write("\t\t\t\t \t<center>\r\n");
      out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"130px\" border=\"0\">\r\n");
      out.write("\t\t\t \t\t\r\n");
      out.write("\t\t\t \t\t\t<tr>\r\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" style=\"padding-left: 20px;padding-right: 20px;\">\r\n");
      out.write("\t\t\t\t \t\t\t\t<div style=\"max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\">\r\n");
      out.write("\t\t\t\t \t\t\t\t\t<center id=\"msgConfirmation\"style=\"color: #484848;\">");
      if (_jspx_meth_s_005fproperty_005f79(_jspx_page_context))
        return;
      out.write("</center>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t \t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t \t\t\t<tr height=\"45px\" valign=\"top\">\r\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\">\t\t\t\t \t\t\t\r\n");
      out.write("\t\t\t\t \t\t\t<input id=\"btDeleteOrderCFM\"  type=\"submit\" value=\"Delete Order\"\r\n");
      out.write("\t\t\t\t \t\t\t     style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color: #FF6666;color:white;font-weight: bold;\" />\r\n");
      out.write("\t\t\t\t \t\t\t<input id=\"btCancelCFM\"  type=\"submit\" value=\"Cancel\"\r\n");
      out.write("\t\t\t\t \t\t\t     style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;\" /></td>\r\n");
      out.write("\t\t\t \t\t\t</tr>\r\n");
      out.write("\t\t\t \t\t\t\t\t \t\t\t\r\n");
      out.write("\t\t\t \t\t</table>\r\n");
      out.write("\t\t\t \t\t</center>\r\n");
      out.write("            </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\n");
      out.write("\n");
      out.write("#toolTipPop {\n");
      out.write("     position:absolute;\n");
      out.write("    z-index: 700;\n");
      out.write("    top:8px;\n");
      out.write("\tleft:20px;\n");
      out.write("\tpadding-right: 3px;\n");
      out.write("\t/*height:60px;*/\n");
      out.write("\tbackground-color:white transparent transparent transparent;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip {\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip p {\n");
      out.write("    padding:10px;\n");
      out.write("    /*background-color:#f9f9f9;*/\n");
      out.write("    background-color:#FFFF99;\n");
      out.write("    border:solid 1px #a0c7ff;\n");
      out.write("    -moz-border-radius:5px;-ie-border-radius:5px;-webkit-border-radius:5px;-o-border-radius:5px;border-radius:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail1 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-20px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#a0c7ff transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail2 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-18px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#f9f9f9 transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<center id=\"toolTipPop\" style=\"display:none;visibility:hidden;\">\n");
      out.write("<center id=\"toolTip\">\n");
      out.write("    <p id=\"message\" style=\"color: #484848;\"></p>\n");
      out.write("    <center id=\"tail1\"></center>\n");
      out.write("    <center id=\"tail2\"></center>\n");
      out.write("</center>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\n");
      out.write("\n");
      out.write("#toolTipCurrencyPop {\n");
      out.write("    position:absolute;\n");
      out.write("    z-index: 700;\n");
      out.write("    top:8px;\n");
      out.write("\tleft:10px;\n");
      out.write("\tpadding-right: 0px;\n");
      out.write("\t/*height:60px;*/\n");
      out.write("\tbackground-color:white transparent transparent transparent;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip {\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip p {\n");
      out.write("    padding:10px;\n");
      out.write("    /*background-color:#f9f9f9;*/\n");
      out.write("    background-color:#FFFF99;\n");
      out.write("    border:solid 1px #a0c7ff;\n");
      out.write("    -moz-border-radius:5px;-ie-border-radius:5px;-webkit-border-radius:5px;-o-border-radius:5px;border-radius:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail1 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-20px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#a0c7ff transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail2 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-18px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#f9f9f9 transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<center id=\"toolTipCurrencyPop\" style=\"display:none;visibility:hidden;\">\n");
      out.write("<center id=\"toolTip\">\n");
      out.write("    <p id=\"message\" style=\"color: blue; font-weight: bold;\"></p>\n");
      out.write("    <center id=\"tail1\"></center>\n");
      out.write("    <center id=\"tail2\"></center>\n");
      out.write("</center>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- ......................................................................... -->\t\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- When unitPrice Losts focus -------------------------- \n");
      out.write("\t\t\t//Accept only numbers\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#unitPrice\").blur( function(){\n");
      out.write("\t\tvar unitPrice = $(\"#unitPrice\").val();\n");
      out.write("\t\t$(\"#unitPrice\").css(\"backgroundColor\", \"#FFFFFF\");\n");
      out.write("\t\tif(!isNumber(unitPrice) || parseFloat(unitPrice)<=0) {\n");
      out.write("\t\t\t$(\"#unitPrice\").val(\"\");\n");
      out.write("\t\t\t$(\"#unitPrice\").css(\"backgroundColor\", \"#FF6666\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tvar valUnitPrice = parseFloat(unitPrice).toFixed(2);\n");
      out.write("\t\t\t$(\"#unitPrice\").val(valUnitPrice);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- When shippingFee Losts focus -------------------------- \n");
      out.write("\t\t\t//Accept only numbers\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#shippingFee\").blur( function(){\n");
      out.write("\tvar shippingFee = $(\"#shippingFee\").val();\n");
      out.write("\t$(\"#shippingFee\").css(\"backgroundColor\", \"#FFFFFF\");\n");
      out.write("\tif(!isNumber(shippingFee) || parseFloat(shippingFee)<=0) {\n");
      out.write("\t\t$(\"#shippingFee\").val(\"\");\n");
      out.write("\t\t$(\"#shippingFee\").css(\"backgroundColor\", \"#FF6666\");\n");
      out.write("\t} else {\n");
      out.write("\t\tvar valShippingFee = parseFloat(shippingFee).toFixed(2);\n");
      out.write("\t\t$(\"#shippingFee\").val(valShippingFee);\n");
      out.write("\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- function: isNumber ------------------------------------- \n");
      out.write("\t\t\t//return false if is not numeric\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\tfunction isNumber(n) {\n");
      out.write("\t\treturn !isNaN(parseFloat(n)) && isFinite(n);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\n");
      out.write("\n");
      out.write("#toolTipReportPop {\n");
      out.write("     position:absolute;\n");
      out.write("    z-index: 700;\n");
      out.write("    top:8px;\n");
      out.write("\tleft:20px;\n");
      out.write("\tpadding-right: 3px;\n");
      out.write("\t/*height:60px;*/\n");
      out.write("\tbackground-color:white transparent transparent transparent;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip {\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#toolTip p {\n");
      out.write("    padding:10px;\n");
      out.write("    /*background-color:#f9f9f9;*/\n");
      out.write("    background-color:#FFFF99;\n");
      out.write("    border:solid 1px #a0c7ff;\n");
      out.write("    -moz-border-radius:5px;-ie-border-radius:5px;-webkit-border-radius:5px;-o-border-radius:5px;border-radius:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail1 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-20px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#a0c7ff transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tail2 {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-18px;\n");
      out.write("    left:48%;\n");
      out.write("    width:0;height:0;\n");
      out.write("    border-color:#f9f9f9 transparent transparent transparent;\n");
      out.write("    border-width:10px;\n");
      out.write("    border-style:solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<center id=\"toolTipReportPop\" style=\"display:none;visibility:hidden;\">\n");
      out.write("<center id=\"toolTip\">\n");
      out.write("    <p id=\"message\" style=\"color: #484848;\"></p>\n");
      out.write("    <center id=\"tail1\"></center>\n");
      out.write("    <center id=\"tail2\"></center>\n");
      out.write("</center>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- ......................................................................... -->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\n");
      out.write("// Jquery Function main \n");
      out.write("var pageTop;\n");
      out.write("var scrollTop;\n");
      out.write("var scrollPageLeft;\n");
      out.write("var scrollDivRowsTop;\n");
      out.write("var balance=0;\n");
      out.write("var rowSelected=-1;\n");
      out.write("var lastRowSelected=-1;\n");
      out.write("var csslastRowSelected=\"\";\n");
      out.write("\n");
      out.write("/*----------------------------------- Keep page position --------------------------------- \n");
      out.write("\t\t \t\t\t\t\t     keep page and div position \n");
      out.write("  ----------------------------------------------------------------------------------------*/\n");
      out.write("$(function() {\n");
      out.write("\tvar pageTop = ");
      out.print( request.getParameter("pageTop") );
      out.write(";\n");
      out.write("\tscrollPageLeft = ");
      out.print( request.getParameter("scrollPageLeft") );
      out.write(";\n");
      out.write("\tscrollDivRowsTop = ");
      out.print( request.getParameter("scrollDivRowsTop") );
      out.write(";\n");
      out.write("\t$(window).scrollTop(pageTop);\n");
      out.write("\t$(window).scrollLeft(scrollPageLeft);\n");
      out.write("\t$(\"#divRowsOrder\").scrollTop(scrollDivRowsTop);\n");
      out.write("\t// winker image of infoMissing \n");
      out.write("\t$('#columnInfoNotCompleted img[id=\"infoMissingDiv\"]').effect(\"pulsate\", { times:999}, 2000);\n");
      out.write("\t// hide cities comboList in orderDetailPop \n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("/*------------------------------- Definition format date --------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\tDefinition of Format Date \n");
      out.write("  ----------------------------------------------------------------------------------------*/\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("\t$(\"#creationDateStartPicker\").datepicker({\n");
      out.write("\t\tdateFormat: 'dd/mm/yy',\n");
      out.write("\t\tchangeMonth: true,\n");
      out.write("\t\tchangeYear: true\n");
      out.write("\t});\n");
      out.write("\t$(\"#creationDateEndPicker\").datepicker({\n");
      out.write("\t\tdateFormat: 'dd/mm/yy',\n");
      out.write("\t\tchangeMonth: true,\n");
      out.write("\t\tchangeYear: true\n");
      out.write("\t});\n");
      out.write("\t$(\"#requiredDatePicker\").datepicker({\n");
      out.write("\t\tdateFormat: 'dd/mm/yy',\n");
      out.write("\t\tchangeMonth: true,\n");
      out.write("\t\tchangeYear: true\n");
      out.write("\t}); \n");
      out.write("\t$(\"#saveShippedDatePicker\").datepicker({\n");
      out.write("\t\tdateFormat: 'dd/mm/yy',\n");
      out.write("\t\tchangeMonth: true,\n");
      out.write("\t\tchangeYear: true\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write(" });\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("\t$(\"#creationOrderDate\").datepicker({\n");
      out.write("\t  dateFormat: 'dd/mm/yy',\n");
      out.write("      changeMonth: true,\n");
      out.write("      changeYear: true\n");
      out.write("    });\n");
      out.write("\t$(\"#requiredDate\").datepicker({\n");
      out.write("\t\t  dateFormat: 'dd/mm/yy',\n");
      out.write("\t      changeMonth: true,\n");
      out.write("\t      changeYear: true\n");
      out.write("\t    });\n");
      out.write(" });\n");
      out.write("\n");
      out.write("$(document).ready(function() { \n");
      out.write("\n");
      out.write("\t/*------------------------- check checkBox without submit -------------------------------- \n");
      out.write("\t\tPour éviter d'aller à chaque changement du check box on utilise un string qui porte\n");
      out.write("\t\tles valeurs de tous les check Box et une fois on click sur le un bouton de print ou\n");
      out.write("\t\tgetXSL on envoie juste cette string, c'est une méthode intelligente pour soulager \n");
      out.write("\t\tle server et pour éviter les secousse de barre de défilement\n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\tvar arrayPrint = [];\n");
      out.write("\tvar sizeResult=$(\"#sizeResult\").val();\n");
      out.write("\tfor(i=0;i<sizeResult;i++){\n");
      out.write("\t\tarrayPrint[i] =false;\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tfunction createStrPrint(){\n");
      out.write("\t\tvar index=0;\n");
      out.write("\t\t$('#tabOrderOrders input[id=\"checkBoxItem\"]').each(function() {\n");
      out.write("\t\t\tarrayPrint[index]=$(this).attr('checked');\n");
      out.write("\t\t\tindex++;\n");
      out.write("\t\t});\n");
      out.write("\t\tvar strPrint=\"\";\n");
      out.write("\t\tfor(i=0;i<arrayPrint.length;i++){\n");
      out.write("\t\t\tif(arrayPrint[i]=='checked'){\n");
      out.write("\t\t\t\tstrPrint+=i+\";t,\";\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tstrPrint+=i+\";f,\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tif(strPrint.length>0)strPrint = strPrint.substring(0, strPrint.length-1);\n");
      out.write("\t\t$('#strPrintInPDFForm').val(strPrint);\n");
      out.write("\t\t$('#strPrintInAdminXLS').val(strPrint);\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t/*----------------------------- Disabled Enter and BackSpace ----------------------------- \n");
      out.write("\t \t\t\t\t\tThis method is very imported for disable \n");
      out.write("\t \t\t\t\tundesirable behavior of BackSpace and Enter Key \n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(document).keydown(function(e){\n");
      out.write("\t\t   if (e.keyCode == 8 || e.keyCode == 13 || e.keyCode == 32) { \n");
      out.write("\t\t\t if(e.target.tagName!=\"INPUT\")return false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t/*------------------------------------- ToolTip ------------------------------------------ \n");
      out.write("\t \t\t\twhen Admin mouve the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#orderDetailPop #iconDeleteRow,#iconSimilarRow,#iconSaveTemporaryRow,#quantityToChange').mouseover( function(){\n");
      out.write("\t\tvar indexDelete=$('#orderDetailPop   #iconDeleteRow').index(this);\n");
      out.write("\t\tvar indexSimilar=$('#orderDetailPop  #iconSimilarRow').index(this);\n");
      out.write("\t\tvar indexValidate=$('#orderDetailPop #iconSaveTemporaryRow').index(this);\n");
      out.write("\t\tvar indexQuantitySplit=$('#orderDetailPop #quantityToChange').index(this);\n");
      out.write("\t\tvar position;\n");
      out.write("\t\tvar showPop=0;\n");
      out.write("\t\tif(indexDelete>=0){\n");
      out.write("\t\t\tposition = $('#orderDetailPop #iconDeleteRow').eq(indexDelete).position();\n");
      out.write("\t\t\t$('#orderDetailPop #message').text(\"Delete before Saving\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexSimilar>=0){\n");
      out.write("\t\t\tposition = $('#orderDetailPop #iconSimilarRow').eq(indexSimilar).position();\n");
      out.write("\t\t\t$('#orderDetailPop #message').text(\"Add Product\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexValidate>=0){\n");
      out.write("\t\t\tposition = $('#orderDetailPop #iconSaveTemporaryRow').eq(indexValidate).position();\n");
      out.write("\t\t\t$('#orderDetailPop #message').text(\"Validate Modification before Saving\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexQuantitySplit>=0){\n");
      out.write("\t\t\tposition = $('#orderDetailPop #quantityToChange').eq(indexQuantitySplit).position();\n");
      out.write("\t\t\t$('#orderDetailPop #message').text(\"Enter a valid amount for Duplication\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar height=$('#orderDetailPop #toolTipPop').height(); \n");
      out.write("\t\ty=(y-height);\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\tvar toolTipWidth=$('#toolTipPop').width();\n");
      out.write("\t\ttoolTipWidth=toolTipWidth/2;\n");
      out.write("\t\tx=x-toolTipWidth;\n");
      out.write("\t\t$(\"#orderDetailPop #toolTipPop\").css('top',y-5);\n");
      out.write("\t\t$(\"#orderDetailPop #toolTipPop\").css('left',x);\n");
      out.write("\t\tif(showPop==1){\n");
      out.write("\t\t\t$('#orderDetailPop #toolTipPop').css(\"display\",\"block\"); \n");
      out.write("\t\t\t$('#orderDetailPop #toolTipPop').css(\"visibility\",\"visible\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t//when Admin out the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t$('#orderDetailPop #iconDeleteRow,#iconSimilarRow,#iconSaveTemporaryRow,#quantityToChange').mouseout( function(){\n");
      out.write("\t\t$('#toolTipPop').css(\"display\",\"none\"); \n");
      out.write("\t\t$('#toolTipPop').css(\"visibility\",\"hidden\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------- ToolTipReport ------------------------------------ \n");
      out.write("\t \t\t\twhen Admin mouve the mouse on icons of the :\"reportOrders.jsp\"  \n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS').mouseover( function(){\n");
      out.write("\t\tvar indexAdminXLSEST=$('#tabPrintAndXLS   #imgGetAdminXLSEST').index(this);\n");
      out.write("\t\tvar indexAdminXLS=$('#tabPrintAndXLS  #imgGetAdminXLS').index(this);\n");
      out.write("\t\tvar indexPrintOrders=$('#tabPrintAndXLS #imgPrintOrders').index(this);\n");
      out.write("\t\tvar indexPrintAllOrders=$('#tabPrintAndXLS #imgPrintAllOrders').index(this);\n");
      out.write("\t\tvar indexInvoicedXLS=$('#tabPrintAndXLS #imgGetInvoicedXLS').index(this);\n");
      out.write("\t\tvar position;\n");
      out.write("\t\tvar showPop=0;\n");
      out.write("\t\tif(indexAdminXLSEST>=0){\n");
      out.write("\t\t\tposition = $('#tabPrintAndXLS #imgGetAdminXLSEST').eq(indexAdminXLSEST).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Select first Orders to get Canada Post CSV File\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexAdminXLS>=0){\n");
      out.write("\t\t\tposition = $('#tabPrintAndXLS #imgGetAdminXLS').eq(indexAdminXLS).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Get XLS File List\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexPrintOrders>=0){\n");
      out.write("\t\t\tposition = $('#tabPrintAndXLS #imgPrintOrders').eq(indexPrintOrders).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Select first Orders to print\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexPrintAllOrders>=0){\n");
      out.write("\t\t\tposition = $('#tabPrintAndXLS #imgPrintAllOrders').eq(indexPrintAllOrders).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Print All Orders List \");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(indexInvoicedXLS>=0){\n");
      out.write("\t\t\tposition = $('#tabPrintAndXLS #imgGetInvoicedXLS').eq(indexInvoicedXLS).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Select first Orders and Partner Name to get Invoiced Orders List\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar height=$('#toolTipReportPop').height(); \n");
      out.write("\t\ty=(y-height);\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\tvar toolTipWidth=$('#toolTipReportPop').width();\n");
      out.write("\t\ttoolTipWidth=toolTipWidth/2;\n");
      out.write("\t\tx=x-toolTipWidth;\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('top',y-5);\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('left',x+5);\n");
      out.write("\t\tif(showPop==1){\n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"display\",\"block\"); \n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"visibility\",\"visible\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t//when Admin out the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t$('#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS').mouseout( function(){\n");
      out.write("\t\t$('#toolTipReportPop').css(\"display\",\"none\"); \n");
      out.write("\t\t$('#toolTipReportPop').css(\"visibility\",\"hidden\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------- ToolTipReport:icone Print -------------------------------- \n");
      out.write("\t \t\t\twhen Admin mouve the mouse on icon print of the :\"reportOrders.jsp\"  \n");
      out.write("\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t  $('#tabOrderOrders #imgSort,#imgSelectAllPO').mouseover( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #imgSort').index(this);\n");
      out.write("\t\tvar position;\n");
      out.write("\t\tvar showPop=0;\n");
      out.write("\t\tif(index==0){\n");
      out.write("\t\t\tposition = $('#tabOrderOrders #imgSort').eq(index).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Select All Orders In This Page\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar selectAllPO=$('#tabOrderOrders #imgSelectAllPO').index(this);\n");
      out.write("\t\tif(selectAllPO==0){\n");
      out.write("\t\t\tposition = $('#tabOrderOrders #imgSelectAllPO').eq(index).position();\n");
      out.write("\t\t\t$('#toolTipReportPop #message').text(\"Select All Orders\");\n");
      out.write("\t\t\tshowPop=1;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar height=$('#toolTipReportPop').height(); \n");
      out.write("\t\ty=(y-height);\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\tvar toolTipWidth=$('#toolTipReportPop').width();\n");
      out.write("\t\ttoolTipWidth=toolTipWidth/2;\n");
      out.write("\t\tx=x-toolTipWidth;\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('top',y-5);\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('left',x+5);\n");
      out.write("\t\tif(showPop==1){\n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"display\",\"block\"); \n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"visibility\",\"visible\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t//when Admin move the mouse out the icon print of the popup:\"orderDetailPop\" \n");
      out.write("\t$('#tabOrderOrders #imgSort,#imgSelectAllPO').mouseout( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #imgSort').index(this);\n");
      out.write("\t\tif(index==0){\n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"display\",\"none\"); \n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"visibility\",\"hidden\");\n");
      out.write("\t\t}\n");
      out.write("\t\tvar selectAllPO=$('#tabOrderOrders #imgSelectAllPO').index(this);\n");
      out.write("\t\tif(selectAllPO==0){\n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"display\",\"none\"); \n");
      out.write("\t\t\t$('#toolTipReportPop').css(\"visibility\",\"hidden\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------- ToolTipReport:Date Between -------------------------------- \n");
      out.write("\t \t  when Admin mouve the mouse on the sentence \"Shipped Date between\" or \"PO Date between\"  \n");
      out.write("\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#factorDateBetweenId').mouseover( function(){\n");
      out.write("\t\tvar position = $('#factorDateBetweenId').position();\n");
      out.write("\t\t$('#toolTipReportPop #message').text(\"Click to toggle between PO Date and Sipped Date\");\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar height=$('#toolTipReportPop').height(); \n");
      out.write("\t\ty=(y-height);\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\tvar toolTipWidth=$('#toolTipReportPop').width();\n");
      out.write("\t\ttoolTipWidth=toolTipWidth/2;\n");
      out.write("\t\tx=x-toolTipWidth;\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('top',y-5);\n");
      out.write("\t\t$(\"#toolTipReportPop\").css('left',x+30);\n");
      out.write("\t\t$('#toolTipReportPop').css(\"display\",\"block\"); \n");
      out.write("\t\t$('#toolTipReportPop').css(\"visibility\",\"visible\");\n");
      out.write("\t});\n");
      out.write("\t//when Admin move the mouse out the sentence \"Shipped Date between\" or \"PO Date between\" \n");
      out.write("\t$('#factorDateBetweenId').mouseout( function(){\n");
      out.write("\t\t$('#toolTipReportPop').css(\"display\",\"none\"); \n");
      out.write("\t\t$('#toolTipReportPop').css(\"visibility\",\"hidden\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*----------------------------------- Delete Order --------------------------------------\n");
      out.write("\t\t\t\t \t\t\tDelete Order using confirmation popup \n");
      out.write("\t  ---------------------------------------------------------------------------------------*/\n");
      out.write("\t//when Admin click on the button \"Delete\" of OrdersDetailPop \n");
      out.write("\t  $('#orderDetailPop #btDeleteOrder').click( function(){\n");
      out.write("\t\trecoveryDataOrder();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(0).text();\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrder);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#deleteOrderSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\t //when Admin Confirm to delete Order(delete Order) \n");
      out.write("\t$('#orderDetailPop #confirmDeleteOrderPop #btDeleteOrderCFM').click( function(){\n");
      out.write("\t\trecoveryDataOrder();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(0).text();\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrder);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#deleteOrderSignal').val(1);\n");
      out.write("\t\t$('#confirmDeleteSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\t//when Admin Cancel to delete Order(cancel delete) \n");
      out.write("\t$('#orderDetailPop #confirmDeleteOrderPop #btCancelCFM').click( function(){\n");
      out.write("\t\trecoveryDataOrder();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(0).text();\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrder);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#deleteOrderSignal').val(1);\n");
      out.write("\t\t$('#confirmDeleteSignal').val(2);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t/*------------------------------ Edit in the page reportOrder.jsp ---------------------------\n");
      out.write("\t\t\t\t \t\t\t\t\t   Update shipping parameters \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t  //When Admin click on  link \"Edit\", show shipping param in text field \n");
      out.write("\t$('#tabOrderOrders #editShippingCompany,#editTrackingNumber,#editShippedDate,#editShippingPrice,#statusToEdit').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #statusToEdit').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #editShippingCompany').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #editTrackingNumber').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #editShippedDate').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #editShippingPrice').index(this);\n");
      out.write("\t\tvar indexOrderToEdit=$(\"#tabOrderOrders #columnIndexOrder\").eq(index).text();\n");
      out.write("\t \tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t \t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrderToEdit);\n");
      out.write("\t\tvar code=$('#tabOrderOrders #clientProvince').eq(index).text();\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tscrollPageLeft=$(window).scrollLeft();\n");
      out.write("\t\t$(\"#scrollPageLeft\").val(scrollPageLeft);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#showRowShippingFRM\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t  //When Admin click on  link \"Edit Note\", show only Note text field \n");
      out.write("\t$('#tabOrderOrders #editNotes').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #editNotes').index(this);\t\n");
      out.write("\t\tvar indexOrderToEdit=$(\"#tabOrderOrders #columnIndexOrder\").eq(index).text();\n");
      out.write("\t \tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t \t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrderToEdit);\n");
      out.write("\t\tvar code=$('#tabOrderOrders #clientProvince').eq(index).text();\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tscrollPageLeft=$(window).scrollLeft();\n");
      out.write("\t\t$(\"#scrollPageLeft\").val(scrollPageLeft);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#showRowShippingFRM\").val(0);\n");
      out.write("\t\t$(\"#showOnlyEditNoteFRM\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t//when Admin click on any button \"Save\"\n");
      out.write("\t$('#tabOrderOrders #saveNotes').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #saveNotes').index(this);\n");
      out.write("\t \tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t \t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\tvar indexOrderToEdit=$(\"#tabOrderOrders #columnIndexOrder\").eq(index).text();\n");
      out.write("\t\tvar notes=$(\"#tabOrderOrders #notes\").eq(index).val();\n");
      out.write("\t\tvar code=$('#tabOrderOrders #clientProvince').eq(index).text();\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t$(\"#notesFRM\").val(notes);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrderToEdit);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tscrollPageLeft=$(window).scrollLeft();\n");
      out.write("\t\t$(\"#scrollPageLeft\").val(scrollPageLeft);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#saveShippingSignal\").val(0);\n");
      out.write("\t\t$(\"#saveOnlyNoteSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t//when Admin click on any button \"Save\"\n");
      out.write("\t$('#tabOrderOrders #saveShippingCompany,#saveTrackingNumber,#saveShippedDate,#saveShippingPrice,#saveStatus').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #saveShippingPrice').index(this);\n");
      out.write("\t\tvar statusId=-1;\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #saveShippingCompany').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #saveTrackingNumber').index(this);\n");
      out.write("\t\tif(index<0)index=$('#tabOrderOrders #saveShippedDate').index(this);\n");
      out.write("\t\tif(index<0){\n");
      out.write("\t\t\tindex=$('#tabOrderOrders #saveStatus').index(this);\n");
      out.write("\t\t\tstatusId=$('#tabOrderOrders #statusId').eq(index).val();\n");
      out.write("\t\t}\n");
      out.write("\t \tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t \t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\tvar indexOrderToEdit=$(\"#tabOrderOrders #columnIndexOrder\").eq(index).text();\n");
      out.write("\t\tvar notes=$(\"#tabOrderOrders #notes\").eq(index).val();\n");
      out.write("\t\tvar shippingCompany=$(\"#tabOrderOrders #shippingCompany\").eq(index).val();\n");
      out.write("\t\tvar trackingNumber=$(\"#tabOrderOrders #trackingNumber\").eq(index).val();\n");
      out.write("\t\tvar code=$('#tabOrderOrders #clientProvince').eq(index).text();\n");
      out.write("\t\tvar shppedDate=$('#tabOrderOrders #saveShippedDatePicker').eq(0).val();\n");
      out.write("\t\tvar strShippingPrice=$('#tabOrderOrders #shippingPriceToEdit').eq(index).val();\n");
      out.write("\t\t//recovery status from list Box \n");
      out.write("\t\tvar status = parseInt(statusId, 10);\n");
      out.write("\t\tswitch (status ) {\n");
      out.write("\t\tcase 0:\n");
      out.write("\t\t\t$('#newStatusFRM').val(\"open\");\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\t$('#newStatusFRM').val(\"progress\");\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\t$('#newStatusFRM').val(\"shipped\");\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\t$('#newStatusFRM').val(\"invoiced\");\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\t$('#newStatusFRM').val(\"canceled\");\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tdefault:$('#newStatusFRM').val(\"\");\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"#strShippingPriceFRM\").val(strShippingPrice);\n");
      out.write("\t\t$(\"#strShippedDateFRM\").val(shppedDate);\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t$(\"#notesFRM\").val(notes);\n");
      out.write("\t\t$(\"#shippingCompanyFRM\").val(shippingCompany);\n");
      out.write("\t\t$(\"#trackingNumberFRM\").val(trackingNumber);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrderToEdit);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tscrollPageLeft=$(window).scrollLeft();\n");
      out.write("\t\t$(\"#scrollPageLeft\").val(scrollPageLeft);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#saveShippingSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\t\n");
      out.write("\t/*---------------------------------------- Color Row -----------------------------------------\n");
      out.write("\t\t\t\t\t\t\twhen Admin selected Row, colored it in yellow\n");
      out.write("\t  --------------------------------------------------------------------------------------------*/ \n");
      out.write("\t$('#tabOrderOrders tr[id=\"rowOrder\"]').click( function() {\n");
      out.write("\t\tif(lastRowSelected>-1){\n");
      out.write("\t\t\t$('#tabOrderOrders tr[id=\"rowOrder\"]').eq(lastRowSelected).css(\"background-color\",csslastRowSelected);\n");
      out.write("\t\t}\n");
      out.write("\t\trowSelected=$('#tabOrderOrders tr[id=\"rowOrder\"]').index(this);\n");
      out.write("\t\tcsslastRowSelected=$('#tabOrderOrders tr[id=\"rowOrder\"]').eq(rowSelected).css(\"background-color\");\n");
      out.write("\t\tlastRowSelected=rowSelected;\n");
      out.write("\t\t$('#tabOrderOrders tr[id=\"rowOrder\"]').eq(rowSelected).css(\"background-color\",\"#FFFF99\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*--------------------------------------- Hide Popup Saving  --------------------------------- \n");
      out.write("\t\t\t\t\t\twhen Admin click on the button OK of SaveSuccessPop: we just hide popups\n");
      out.write("\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t $('#saveSuccessPop #btOK').click( function(){\n");
      out.write("\t\t$(\"#okSaveSuccessPopSignal\").val(1);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t/*--------------------------- Select Order From Table in ReportOrder -------------------------\n");
      out.write("\t\t\t\t\t\t When Admin click on the lsOrderId link in the Table \n");
      out.write("\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t $('#tabOrderOrders #columnRowOrderId').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders #columnRowOrderId').index(this);\n");
      out.write("\t\tvar indexOrderToEdit=$(\"#tabOrderOrders #columnIndexOrder\").eq(index).text();\n");
      out.write("\t\tvar code=$('#tabOrderOrders #clientProvince').eq(index).text();\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrderToEdit);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#editOrderSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t });\n");
      out.write("\n");
      out.write("\t/*---------------------------------- Close OrderDetailPop -----------------------------------\n");
      out.write("\t        when Admin click on the button [cancel] of popup dialog of OrderDetailPop \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #btCancel\").click( function(){\n");
      out.write("\t\t$(\"#cancelSignal\").val(\"1\");\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\n");
      out.write("\t});\n");
      out.write("\t\t\n");
      out.write("\t/*----------------------------- orderDetailPop in the first backgound ----------------------- \n");
      out.write("\t\t\t\t\t\t\tKeep always orderDetailPop on the first backgound\n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t//when Admin mouve orderDetailPop \n");
      out.write("\t$('#orderDetailPop').mousemove( function(){\n");
      out.write("\t\t$('#orderDetailPop').css('z-index', 600);\n");
      out.write("\t});\n");
      out.write("\t//when Admin click on orderDetailPop \n");
      out.write("\t$('#orderDetailPop').mousedown( function(){\n");
      out.write("\t\t$('#orderDetailPop').css('z-index', 600);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*---------------------------------- Change Provine ----------------------------------------- \n");
      out.write("\t\t\t\t\t\t   when Admin change province in comboList\n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#orderDetailPop #provinceId').change( function(){\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(0).text();\n");
      out.write("\t\tvar code=$('#orderDetailPop #provinceId').val();\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t$('#form #indexOrder').val(indexOrder);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*---------------------------------- Left lsProductID textfield ------------------------------ \n");
      out.write("\t\t\tWhen Admin changed lsProductID textfield, shearch all information of this product\n");
      out.write("\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #lsProductID\").blur( function(){\n");
      out.write("\t\tvar index=$(\"#orderDetailPop #lsProductID\").index(this);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(index).text();\n");
      out.write("\t\tvar indexRow=$(\"#orderDetailPop #indexRow\").eq(index).text();\n");
      out.write("\t\tvar userId=$(\"#orderDetailPop #userId\").eq(index).text();\n");
      out.write("\t\tvar lsProductID=$(\"#orderDetailPop #lsProductID\").eq(index).val();\n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//clean indexOrder \n");
      out.write("\t\tindexOrder=indexOrder.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexOrder=indexOrder.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexOrder=indexOrder.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow \n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean userId \n");
      out.write("\t\tuserId=userId.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tuserId=userId.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tuserId=userId.replace(/([\\s]+)/g, '-');\n");
      out.write("\t\t//recovery data Order \t\n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#companyHeaderFRM').val(companyHeader);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t$(\"#lsProductIDFRM\").val(lsProductID);\n");
      out.write("\t\t$(\"#userIdFRM\").val(userId);\n");
      out.write("\t\t$('#form #indexOrder').val(indexOrder);\n");
      out.write("\t\t$('#form #indexRow').val(indexRow);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#checkProductPriceSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------- Show icon validate in red color -------------------------------\n");
      out.write("\t  \t\t\t\twhen Admin change Data row in Retail Popup, \n");
      out.write("\t  \t\t\t\tchange image:iconSaveTemporaryRow to itemNotValidated.png \n");
      out.write("\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #lsProductID,#quantity,#quantityToChange,#stock,#productDescription,#unitPrice,#shippingFee,#shippingCompany,#trackingNumber\").change( function(){\n");
      out.write("\t\tvar index=$(\"#orderDetailPop #lsProductID\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #lsProductID\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #quantity\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #stock\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #productDescription\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #shippingFee\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #shippingCompany\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #trackingNumber\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #unitPrice\").index(this);\n");
      out.write("\t\tif(index<0)index=$(\"#orderDetailPop #quantityToChange\").index(this);\n");
      out.write("\t\tif(index>=0)$(\"#orderDetailPop #iconSaveTemporaryRow\").eq(index).attr(\"src\",\"images/orders/itemNotValidated.png\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*--------------------------------- Save TemporaryRow -------------------------------------------\n");
      out.write("\t             when Admin click on the the iconSaveTemporaryRow of orderDetail Popup \n");
      out.write("\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #iconSaveTemporaryRow\").click( function(){\n");
      out.write("\t\tvar index=$(\"#orderDetailPop #iconSaveTemporaryRow\").index(this);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(index).text();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tvar indexRow=$(\"#orderDetailPop #indexRow\").eq(index).text();\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//clean indexOrder \n");
      out.write("\t\tindexOrder=indexOrder.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexOrder=indexOrder.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexOrder=indexOrder.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow \n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form #indexOrder').val(indexOrder);\n");
      out.write("\t\t$('#form #indexRow').val(indexRow);\n");
      out.write("\t\t//recovery data Order \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t//recovery data Row Order \n");
      out.write("\t\tvar quantity = $(\"#orderDetailPop #quantity\").eq(index).val();\n");
      out.write("\t\tvar lsProductID = $(\"#orderDetailPop #lsProductID\").eq(index).val();\n");
      out.write("\t\tvar stock = $(\"#orderDetailPop #stock\").eq(index).val();\n");
      out.write("\t\tvar productDescription = $(\"#orderDetailPop #productDescription\").eq(index).val();\n");
      out.write("\t\tvar unitPrice = $(\"#orderDetailPop #unitPrice\").eq(index).val();\n");
      out.write("\t\tvar shippingFee = $(\"#orderDetailPop #shippingFee\").eq(index).val();\n");
      out.write("\t\tvar shippingCompany = $(\"#orderDetailPop #shippingCompany\").eq(index).val();\n");
      out.write("\t\tvar trackingNumber = $(\"#orderDetailPop #trackingNumber\").eq(index).val();\n");
      out.write("\t\tvar companyHeader=$(\"#orderDetailPop #companyHeader\").eq(index).val();\n");
      out.write("\t\t$(\"#quantityFRM\").val(quantity); \n");
      out.write("\t\t$(\"#lsProductIDFRM\").val(lsProductID);\n");
      out.write("\t\t$(\"#productDescriptionFRM\").val(productDescription);\n");
      out.write("\t\t$(\"#unitPriceFRM\").val(unitPrice);\n");
      out.write("\t\t$(\"#shippingFeeFRM\").val(shippingFee);\n");
      out.write("\t\t$(\"#shippingCompanyFRM\").val(shippingCompany);\n");
      out.write("\t\t$(\"#companyHeaderFRM\").val(companyHeader);\n");
      out.write("\t\t$(\"#trackingNumberFRM\").val(trackingNumber);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#saveTemporaryRowSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*-------------------------------------- Add Similar Row -------------------------------------------\n");
      out.write("\t\t\t\t\t   When Admin click on the the iconSimilarRow of OrderDetailPop \n");
      out.write("\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #iconSimilarRow\").click( function(){\n");
      out.write("\t\tvar index=$(\"#orderDetailPop #iconSimilarRow\").index(this);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(index).text();\n");
      out.write("\t\tvar indexRow=$(\"#orderDetailPop #indexRow\").eq(index).text();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//clean indexOrder \n");
      out.write("\t\tindexOrder=indexOrder.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexOrder=indexOrder.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexOrder=indexOrder.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow \n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form #indexOrder').val(indexOrder);\n");
      out.write("\t\t$('#form #indexRow').val(indexRow);\n");
      out.write("\t\tvar quantity = $(\"#orderDetailPop #quantity\").eq(index).val();\n");
      out.write("\t\tvar lsProductID = $(\"#orderDetailPop #lsProductID\").eq(index).val();\n");
      out.write("\t\tvar stock = $(\"#orderDetailPop #stock\").eq(index).val();\n");
      out.write("\t\tvar productDescription = $(\"#orderDetailPop #productDescription\").eq(index).val();\n");
      out.write("\t\tvar unitPrice = $(\"#orderDetailPop #unitPrice\").eq(index).val();\n");
      out.write("\t\tvar shippingFee = $(\"#orderDetailPop #shippingFee\").eq(index).val();\n");
      out.write("\t\tvar shippingCompany = $(\"#orderDetailPop #shippingCompany\").eq(index).val();\n");
      out.write("\t\tvar trackingNumber = $(\"#orderDetailPop #trackingNumber\").eq(index).val();\n");
      out.write("\t\t//recovery data Order \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$(\"#tabOrderDetailPop #companyHeader\").val();\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t$(\"#quantityFRM\").val(quantity); \n");
      out.write("\t\t$(\"#lsProductIDFRM\").val(lsProductID);\n");
      out.write("\t\t$(\"#productDescriptionFRM\").val(productDescription);\n");
      out.write("\t\t$(\"#unitPriceFRM\").val(unitPrice);\n");
      out.write("\t\t$(\"#shippingFeeFRM\").val(shippingFee);\n");
      out.write("\t\t$(\"#shippingCompanyFRM\").val(shippingCompany);\n");
      out.write("\t\t$(\"#companyHeaderFRM\").val(companyHeader);\n");
      out.write("\t\t$(\"#trackingNumberFRM\").val(trackingNumber);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#addSimilarRowSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*-------------------------------- Delete Row From Memory -----------------------------------------\n");
      out.write("\t\t\t\t\t when Admin click on the icon iconDeleteRow of orderDetailPop \n");
      out.write("\t  -------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#orderDetailPop #iconDeleteRow\").click( function(){\n");
      out.write("\t\tvar index=$(\"#orderDetailPop #iconDeleteRow\").index(this);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(index).text();\n");
      out.write("\t\tvar indexRow=$(\"#orderDetailPop #indexRow\").eq(index).text();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//clean indexOrder \n");
      out.write("\t\tindexOrder=indexOrder.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexOrder=indexOrder.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexOrder=indexOrder.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow \n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//recovery data Order \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#companyHeaderFRM').val(companyHeader);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t$('#form #indexOrder').val(indexOrder);\n");
      out.write("\t\t$('#form #indexRow').val(indexRow);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#deleteRowSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------- Save Order In Data Base ------------------------------------\n");
      out.write("\t\t\t\t\t\t\twhen Admin click on the button save of orderDetail Popup \n");
      out.write("\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#btSave\").click( function(){\n");
      out.write("\t\tvar indexOrder=$('#tabOrderRowsDetailPop #indexOrder').eq(0).text();\n");
      out.write("\t\t$('#indexOrder').val(indexOrder);\n");
      out.write("\t\tscrollTop=$(window).scrollTop(); \n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//recovery data \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\t//$('#lsOrderIdFRM').val(lsOrderId);\n");
      out.write("\t\t$(\"#companyHeaderFRM\").val(companyHeader);\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#saveOrdersSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*-------------------------------- Change value of quantity Splited --------------------------------\n");
      out.write("\t\t\t\t\t\twhen Admin left input text quantityToChange of orderDetail \n");
      out.write("\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#orderDetailPop #quantityToChange').change( function(){\n");
      out.write("\t\tvar index=$('#orderDetailPop #quantityToChange').index(this);\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(index).text();\n");
      out.write("\t\tvar indexRow=$(\"#orderDetailPop #indexRow\").eq(index).text();\n");
      out.write("\t\tvar quantityToChange=$('#orderDetailPop #quantityToChange').eq(index).val();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//clean quantityToChange \n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexOrder \n");
      out.write("\t\tindexOrder=indexOrder.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexOrder=indexOrder.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexOrder=indexOrder.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow \n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//recovery data Order \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#companyHeaderFRM').val(companyHeader);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#form #quantityToChangeSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#form #indexOrder\").val(indexOrder);\n");
      out.write("\t\t$(\"#form #indexRow\").val(indexRow);\n");
      out.write("\t\t$(\"#quantityToChangeFRM\").val(quantityToChange);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------- Duplicate Order --------------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\tWhen Admin click on the icon duplicate \n");
      out.write("\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#btDuplicate').click( function(){\n");
      out.write("\t\tvar indexOrder=$(\"#orderDetailPop #indexOrder\").eq(0).text();\n");
      out.write("\t\t//keep position of detail popup \n");
      out.write("\t\tvar position = $('#orderDetailPop').position();\n");
      out.write("\t\tvar y=position.top;\n");
      out.write("\t\tvar x=position.left;\n");
      out.write("\t\t$('#poYpop').val(y);\n");
      out.write("\t\t$('#poXpop').val(x);\n");
      out.write("\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t//recovery data Order \n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#companyHeaderFRM').val(companyHeader);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t$(\"#indexOrder\").val(indexOrder);\n");
      out.write("\t\t//sarch parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#duplicateOrderSignal\").val(\"1\");\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- Download File XLS and CSV ---------------------------------------\n");
      out.write("\t\t\t\t\t\t\t        Download File XLS and CSV \n");
      out.write("\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t//when Admin mouve mouse on getXLS image \n");
      out.write("\t$('#imgGetAdminXLS').mouseover( function() {\n");
      out.write("\t\t$('#imgGetAdminXLS').attr(\"width\",\"40\");\n");
      out.write("\t\t$('#imgGetAdminXLS').attr(\"higth\",\"40\");\n");
      out.write("\t});\n");
      out.write("\t$('#imgGetAdminXLS').mouseout( function() {\n");
      out.write("\t\t$('#imgGetAdminXLS').attr(\"width\",\"32\");\n");
      out.write("\t\t$('#imgGetAdminXLS').attr(\"higth\",\"32\");\n");
      out.write("\t});\n");
      out.write("\t//when Admin mouve mouse on imgGetAdminXLSEST image \n");
      out.write("\t$('#imgGetAdminXLSEST').mouseover( function() {\n");
      out.write("\t\t$('#imgGetAdminXLSEST').attr(\"width\",\"40\");\n");
      out.write("\t\t$('#imgGetAdminXLSEST').attr(\"higth\",\"40\");\n");
      out.write("\t});\n");
      out.write("\t$('#imgGetAdminXLSEST').mouseout( function() {\n");
      out.write("\t\t$('#imgGetAdminXLSEST').attr(\"width\",\"32\");\n");
      out.write("\t\t$('#imgGetAdminXLSEST').attr(\"higth\",\"32\");\n");
      out.write("\t});\n");
      out.write("\t//Download File XLS:When Admin click on the Button imgGetAdminXLS \n");
      out.write("\t$('#imgGetAdminXLS').click( function(){\n");
      out.write("\t\t$(\"#reportOrderPageSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#selectedOrdersListSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#generateESTFileSignal\").val(\"0\");\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formOrdersAdminXLS').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\t//Download File XLS:When Admin click on the Button imgGetInvoicedXLS \n");
      out.write("\t$('#imgGetInvoicedXLS').click( function(){\n");
      out.write("\t\t$(\"#reportOrderPageSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#selectedOrdersListSignal\").val(\"3\");\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t \tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t \t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t \tvar selectedStatus=$(\"#selectedStatus\").val();\n");
      out.write("\t \t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formOrdersAdminXLS').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\t//Download File XLS For Canada Post:When Admin click on the Button imgGetAdminXLSEST \n");
      out.write("\t$('#imgGetAdminXLSEST').click( function(){\n");
      out.write("\t\t$(\"#reportOrderPageSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#generateESTFileSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#selectedOrdersListSignal\").val(\"2\");\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formOrdersAdminXLS').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*-------------------------------------- Orders Sorting ------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\twhen Admin click on the icon imgSort\n");
      out.write("\t  ------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#tabOrderOrders img[id=\"imgSort\"]').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders img[id=\"imgSort\"]').index(this);\n");
      out.write("\t\t//alert(index);\n");
      out.write("\t\tif(index!=0){\n");
      out.write("\t\t\tscrollPageLeft=$(window).scrollLeft();\n");
      out.write("\t\t\t$(\"#scrollPageLeft\").val(scrollPageLeft);\n");
      out.write("\t\t\tscrollDivRowsTop=$(\"#divRowsOrder\").scrollTop();\t\n");
      out.write("\t\t\t$('#scrollDivRowsTop').val(scrollDivRowsTop);\n");
      out.write("\t\t\tif(index!=30 && index!=31 && index!=32) {\n");
      out.write("\t\t\t\t$('#tabOrderOrders td').eq(index+1).css(\"background-color\",\"red\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$('#tabOrderOrders td').eq(index+3).css(\"background-color\",\"red\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('#fieldForSorting').val(index);\n");
      out.write("\t\t\t//search parameters \t\n");
      out.write("\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t$('#sortingOrdersSignal').val(1);\t\n");
      out.write("\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tvar checkValues=$('#tabOrderOrders input[id=\"checkBoxItem\"]').attr('checked');\n");
      out.write("\t\t\tvar checkDisableValues=$('#tabOrderOrders input[id=\"checkBoxItem\"]').attr('disabled');\n");
      out.write("\t\t\tif(checkDisableValues)return false;\n");
      out.write("\t\t\tif(checkValues){\n");
      out.write("\t\t\t\t$('#tabOrderOrders input[id=\"checkBoxItem\"]').attr('checked',false);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$('#tabOrderOrders input[id=\"checkBoxItem\"]').attr('checked',true);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcreateStrPrint();\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*----------------------------------- Orders Select All ------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\twhen Admin click on the icon imgSort\n");
      out.write("\t  ------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#tabOrderOrders img[id=\"imgSelectAllPO\"]').click( function(){\n");
      out.write("\t\tvar index=$('#tabOrderOrders img[id=\"imgSelectAllPO\"]').index(this);\n");
      out.write("\t\tvar checkValues=$('#tabOrderOrders input[id=\"checkBoxItem\"]').attr('checked');\n");
      out.write("\t\t//alert(\"checkValues:\"+checkValues);\n");
      out.write("\t\t$('#form #checkBoxItem').val(!checkValues);\n");
      out.write("\t\t//alert($('#form #checkBoxItem').val());\n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#selectAllOrdersSignal').val(1);\t\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*----------------------------- Make divRowsOrder's cursor in default -----------------------\n");
      out.write("\t\t\t\t\t\t\t\t    When Admin mouve mouse on divRowsOrder \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$('#divRowsOrder').mousemove( function(){\n");
      out.write("\t\t$(\"#divRowsOrder\").css('cursor','default');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*-------------------------------------- Find Orders ----------------------------------------\n");
      out.write("\t\t\t\t\t\t When Admin click on the icon findOrders.png \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#iconFindOrders\").click( function(){\n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#findOrdersSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*----------------------- Switching between \"PO Date\" and \"Shipped Date\" --------------------\n");
      out.write("\t\t\t\t When Admin click sentens \"PO Date\" or \"Shipped Date\" in Search Options \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#factorDateBetweenId\").click( function(){\n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$(\"#dateBetweenSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------ Print Orders -----------------------------------------\n");
      out.write("\t\t\t\t\t\t     \t\t Select and print Orders  \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t//when Admin mouve mouse on printSelected image \n");
      out.write("\t\t$('#imgPrintOrders').mouseover( function() {\n");
      out.write("\t\t\t$('#imgPrintOrders').attr(\"width\",\"40\");\n");
      out.write("\t\t\t$('#imgPrintOrders').attr(\"higth\",\"40\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$('#imgPrintOrders').mouseout( function() {\n");
      out.write("\t\t\t$('#imgPrintOrders').attr(\"width\",\"32\");\n");
      out.write("\t\t\t$('#imgPrintOrders').attr(\"higth\",\"32\");\n");
      out.write("\t\t});\n");
      out.write("\t\t//when Admin mouve mouse on printAll image \n");
      out.write("\t\t$('#imgPrintAllOrders').mouseover( function() {\n");
      out.write("\t\t\t$('#imgPrintAllOrders').attr(\"width\",\"40\");\n");
      out.write("\t\t\t$('#imgPrintAllOrders').attr(\"higth\",\"40\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$('#imgPrintAllOrders').mouseout( function() {\n");
      out.write("\t\t\t$('#imgPrintAllOrders').attr(\"width\",\"32\");\n");
      out.write("\t\t\t$('#imgPrintAllOrders').attr(\"higth\",\"32\");\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t//when Admin mouve mouse on printAll image \n");
      out.write("\t\t$('#imgGetInvoicedXLS').mouseover( function() {\n");
      out.write("\t\t\t$('#imgGetInvoicedXLS').attr(\"width\",\"40\");\n");
      out.write("\t\t\t$('#imgGetInvoicedXLS').attr(\"higth\",\"40\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$('#imgGetInvoicedXLS').mouseout( function() {\n");
      out.write("\t\t\t$('#imgGetInvoicedXLS').attr(\"width\",\"32\");\n");
      out.write("\t\t\t$('#imgGetInvoicedXLS').attr(\"higth\",\"32\");\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t//when Admin click on the button Print \n");
      out.write("\t$('#imgPrintOrders').click( function(){\n");
      out.write("\t\t$('#tansformReportSignal').val(1);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formToPrint').trigger(\"submit\");\n");
      out.write("\t\t//horloge();\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/*------------------------------------ Pagination -------------------------------------------\n");
      out.write("\t\t\tWhen Admin click on pageIndex, cach pageIndex and search Orders with in dataBase  \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t//when Admin click on a number page \n");
      out.write("\t$('#tabPageIndex #pageIndex').click( function(){\n");
      out.write("\t\tvar index=$('#tabPageIndex #pageIndex').index(this);\n");
      out.write("\t\tvar pageIndexHedden=$('#tabPageIndex #pageIndexHedden').eq(index).val();\n");
      out.write("\t\t//search parameters \n");
      out.write("\t\tfillSarchParameters();\n");
      out.write("\t\t$('#indexSet').val(pageIndexHedden);\n");
      out.write("\t\t$('#indexList').val(index);\n");
      out.write("\t\t$('#pageIndexSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin click on a imge nextPages \n");
      out.write("\t$('#tabPageIndex #imgNextPages').click( function(){\n");
      out.write("\t\t//Search Parameters \n");
      out.write("\t\tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t\tvar strCreationDateStart=$(\"#creationDateStartPicker\").val();\n");
      out.write("\t\tvar strCreationDateEnd=$(\"#creationDateEndPicker\").val();\n");
      out.write("\t\t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\tvar selectedStatus=$(\"#selectedStatus\").val();\n");
      out.write("\t\tvar lsOrderId=$(\"#lsOrderIdSearch\").val();\n");
      out.write("\t\t$(\"#lsOrderIdFRM\").val(lsOrderId);\n");
      out.write("\t\t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\t$(\"#frmStrCreationDateStart\").val(strCreationDateStart);\n");
      out.write("\t\t$(\"#frmStrCreationDateEnd\").val(strCreationDateEnd);\n");
      out.write("\t\t$('#indexList').val(0);\n");
      out.write("\t\t$('#nextListPagesSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//when Admin click on a imge imgPrevListPages \n");
      out.write("\t$('#tabPageIndex #imgPrevListPages').click( function(){\n");
      out.write("\t\t//Search Parameters \n");
      out.write("\t\tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t\tvar strCreationDateStart=$(\"#creationDateStartPicker\").val();\n");
      out.write("\t\tvar strCreationDateEnd=$(\"#creationDateEndPicker\").val();\n");
      out.write("\t\t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\tvar selectedStatus=$(\"#selectedStatus\").val();\n");
      out.write("\t\tvar lsOrderId=$(\"#lsOrderIdSearch\").val();\n");
      out.write("\t\t$(\"#lsOrderIdFRM\").val(lsOrderId);\n");
      out.write("\t\t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\t$(\"#frmStrCreationDateStart\").val(strCreationDateStart);\n");
      out.write("\t\t$(\"#frmStrCreationDateEnd\").val(strCreationDateEnd);\n");
      out.write("\t\t$('#indexList').val(0);\n");
      out.write("\t\t$('#prevListPagesSignal').val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*------------------------------- Function:recoveryDataOrder --------------------------------\n");
      out.write("\t\t\t\t\t\t     \t\t Function to recovery Data Order  \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\tfunction recoveryDataOrder(){\n");
      out.write("\t\tvar code=$('#tabOrderDetailPop #provinceId').val();\n");
      out.write("\t\t$('#codeFRM').val(code); \n");
      out.write("\t\tvar clientLastName=$('#tabOrderDetailPop #clientLastName').val();\n");
      out.write("\t\tvar clientFirstName=$('#tabOrderDetailPop #clientFirstName').val();\n");
      out.write("\t\tvar clientOtherNames=$('#tabOrderDetailPop #clientOtherNames').val();\n");
      out.write("\t\tvar clientStreet=$('#tabOrderDetailPop #clientStreet').val();\n");
      out.write("\t\tvar clientOtherStreet=$('#tabOrderDetailPop #clientOtherStreet').val();\n");
      out.write("\t\tvar clientCity=$('#tabOrderDetailPop #clientCity').val();\n");
      out.write("\t\tvar clientProvince=$('#tabOrderDetailPop #clientProvince').val();\n");
      out.write("\t\tvar clientPostalCode=$('#tabOrderDetailPop #clientPostalCode').val();\n");
      out.write("\t\tvar clientPhone=$('#tabOrderDetailPop #clientPhone').val();\n");
      out.write("\t\tvar clientEmail=$('#tabOrderDetailPop #clientEmail').val();\n");
      out.write("\t\tvar productOrderNumber=$('#tabOrderDetailPop #productOrderNumber').val();\n");
      out.write("\t\tvar creationDate=$('#tabOrderDetailPop #creationDate').val();\n");
      out.write("\t\tvar requiredDate=$('#tabOrderDetailPop #requiredDate').val();\n");
      out.write("\t\tvar creationOrderDate=$('#tabOrderDetailPop #creationOrderDate').val();\n");
      out.write("\t\tvar companyHeader=$('#tabOrderDetailPop #companyHeader').val();\n");
      out.write("\t\t$('#productOrderNumberFRM').val(productOrderNumber);\n");
      out.write("\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t$('#creationOrderDateFRM').val(creationOrderDate);\n");
      out.write("\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t$('#clientFirstNameFRM').val(clientFirstName);\n");
      out.write("\t\t$('#clientOtherNamesFRM').val(clientOtherNames);\n");
      out.write("\t\t$('#companyHeader').val(companyHeader);\n");
      out.write("\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t$('#clientOtherStreetFRM').val(clientOtherStreet);\n");
      out.write("\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t$('#clientPostalCodeFRM').val(clientPostalCode);\n");
      out.write("\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t/*------------------------------- Function:fillSarchParameters --------------------------------\n");
      out.write("\t\t\t\t\t\t     \t   Function to fill sarch parameters  \n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\tfunction fillSarchParameters(){\n");
      out.write("\t\t//search parameters \n");
      out.write("\t\tvar userLogin=$(\"#txtUserLoginTo\").val();\n");
      out.write("\t\tvar strCreationDateStart=$(\"#creationDateStartPicker\").val();\n");
      out.write("\t\tvar strCreationDateEnd=$(\"#creationDateEndPicker\").val();\n");
      out.write("\t\t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\tvar selectedStatus=$(\"#selectedStatus\").val();\n");
      out.write("\t\tvar lsOrderId=$(\"#lsOrderIdSearch\").val();\n");
      out.write("\t\t$(\"#lsOrderIdFRM\").val(lsOrderId);\n");
      out.write("\t\t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\t$(\"#frmStrCreationDateStart\").val(strCreationDateStart);\n");
      out.write("\t\t$(\"#frmStrCreationDateEnd\").val(strCreationDateEnd);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(41,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("form");
    // /WEB-INF/jsp/orders/reportOrders.jsp(41,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("reportOrders.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(41,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(41,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setEnctype("multipart/form-data");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write(" \t<!-- .......... Hidden variables to use when admin do an action event ........ -->\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f9(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f10(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f11(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f12(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f13(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f14(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f15(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f16(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f17(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f18(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f19(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f20(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f21(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f22(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f23(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f24(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f25(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f26(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f27(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f28(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f29(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\n");
        out.write(" \t<!-- ***************** Pagination ********************************** -->\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f30(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f31(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f32(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f33(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f34(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f35(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t<!-- ***************** Pagination ********************************** -->\n");
        out.write("\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f36(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t<!-- Position detailPop -->\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f37(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f38(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t<!-- Find Options -->\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f39(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f40(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f41(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f42(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f43(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f44(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f45(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t<!-- Data Order -->\n");
        out.write(" \t<!-- TEST -->\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f46(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f47(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" \t<!-- TEST -->\n");
        out.write(" \t\n");
        out.write(" \t");
        if (_jspx_meth_s_005fhidden_005f48(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f49(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f50(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f51(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f52(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f53(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f54(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f55(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f56(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f57(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f58(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f59(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f60(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f61(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f62(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f63(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f64(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f65(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f66(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f67(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!-- Data Row -->\n");
        out.write("\t\n");
        out.write("\t");
        if (_jspx_meth_s_005fhidden_005f68(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f69(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f70(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f71(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f72(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f73(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f74(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f75(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f76(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f77(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f78(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f79(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f80(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(44,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("orderSelected");
    // /WEB-INF/jsp/orders/reportOrders.jsp(44,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("orderSelected");
    // /WEB-INF/jsp/orders/reportOrders.jsp(44,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(45,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("showOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(45,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("showOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(45,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setValue("0");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(46,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("okShowOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(46,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("okShowOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(46,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setValue("0");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f3 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("lsOrderIdFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("lsOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setValue("");
    int _jspx_eval_s_005fhidden_005f3 = _jspx_th_s_005fhidden_005f3.doStartTag();
    if (_jspx_th_s_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f4 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("indexOrder");
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("indexOrder");
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setValue("-1");
    int _jspx_eval_s_005fhidden_005f4 = _jspx_th_s_005fhidden_005f4.doStartTag();
    if (_jspx_th_s_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f5 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setId("indexRow");
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setName("indexRow");
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setValue("-1");
    int _jspx_eval_s_005fhidden_005f5 = _jspx_th_s_005fhidden_005f5.doStartTag();
    if (_jspx_th_s_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f6 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setId("selectAllOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setName("selectAllOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setValue("0");
    int _jspx_eval_s_005fhidden_005f6 = _jspx_th_s_005fhidden_005f6.doStartTag();
    if (_jspx_th_s_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f7 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setId("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setName("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setValue("null");
    int _jspx_eval_s_005fhidden_005f7 = _jspx_th_s_005fhidden_005f7.doStartTag();
    if (_jspx_th_s_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f8 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setId("editOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setName("editOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setValue("0");
    int _jspx_eval_s_005fhidden_005f8 = _jspx_th_s_005fhidden_005f8.doStartTag();
    if (_jspx_th_s_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f9 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setId("saveOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setName("saveOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setValue("0");
    int _jspx_eval_s_005fhidden_005f9 = _jspx_th_s_005fhidden_005f9.doStartTag();
    if (_jspx_th_s_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f10 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(54,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setId("saveTemporaryRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(54,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setName("saveTemporaryRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(54,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setValue("0");
    int _jspx_eval_s_005fhidden_005f10 = _jspx_th_s_005fhidden_005f10.doStartTag();
    if (_jspx_th_s_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f11 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setId("cancelSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setName("cancelSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setValue("0");
    int _jspx_eval_s_005fhidden_005f11 = _jspx_th_s_005fhidden_005f11.doStartTag();
    if (_jspx_th_s_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f12 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setId("addSimilarRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setName("addSimilarRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setValue("0");
    int _jspx_eval_s_005fhidden_005f12 = _jspx_th_s_005fhidden_005f12.doStartTag();
    if (_jspx_th_s_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f13 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setId("deleteRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setName("deleteRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setValue("0");
    int _jspx_eval_s_005fhidden_005f13 = _jspx_th_s_005fhidden_005f13.doStartTag();
    if (_jspx_th_s_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f14 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setId("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setName("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setValue("0");
    int _jspx_eval_s_005fhidden_005f14 = _jspx_th_s_005fhidden_005f14.doStartTag();
    if (_jspx_th_s_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f15 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(59,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setId("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(59,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setName("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(59,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setValue("0");
    int _jspx_eval_s_005fhidden_005f15 = _jspx_th_s_005fhidden_005f15.doStartTag();
    if (_jspx_th_s_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f16 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setId("checkProductPriceSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setName("checkProductPriceSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setValue("0");
    int _jspx_eval_s_005fhidden_005f16 = _jspx_th_s_005fhidden_005f16.doStartTag();
    if (_jspx_th_s_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f17 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setId("sortingOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setName("sortingOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setValue("0");
    int _jspx_eval_s_005fhidden_005f17 = _jspx_th_s_005fhidden_005f17.doStartTag();
    if (_jspx_th_s_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f18 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(62,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setId("fieldForSorting");
    // /WEB-INF/jsp/orders/reportOrders.jsp(62,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setName("fieldForSorting");
    // /WEB-INF/jsp/orders/reportOrders.jsp(62,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setValue("0");
    int _jspx_eval_s_005fhidden_005f18 = _jspx_th_s_005fhidden_005f18.doStartTag();
    if (_jspx_th_s_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f19 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(63,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setId("showOrderDetailPop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(63,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setName("showOrderDetailPop");
    int _jspx_eval_s_005fhidden_005f19 = _jspx_th_s_005fhidden_005f19.doStartTag();
    if (_jspx_th_s_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f20 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(64,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setId("checkBoxPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(64,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setName("checkBoxPrint");
    int _jspx_eval_s_005fhidden_005f20 = _jspx_th_s_005fhidden_005f20.doStartTag();
    if (_jspx_th_s_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f21 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(65,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f21.setId("pageTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(65,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f21.setName("pageTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(65,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f21.setValue("0");
    int _jspx_eval_s_005fhidden_005f21 = _jspx_th_s_005fhidden_005f21.doStartTag();
    if (_jspx_th_s_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f22 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f22.setId("scrollPageLeft");
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f22.setName("scrollPageLeft");
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f22.setValue("0");
    int _jspx_eval_s_005fhidden_005f22 = _jspx_th_s_005fhidden_005f22.doStartTag();
    if (_jspx_th_s_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f23 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(67,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f23.setId("scrollDivRowsTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(67,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f23.setName("scrollDivRowsTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(67,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f23.setValue("0");
    int _jspx_eval_s_005fhidden_005f23 = _jspx_th_s_005fhidden_005f23.doStartTag();
    if (_jspx_th_s_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f24 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f24.setId("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f24.setName("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f24.setValue("0");
    int _jspx_eval_s_005fhidden_005f24 = _jspx_th_s_005fhidden_005f24.doStartTag();
    if (_jspx_th_s_005fhidden_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f25 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(69,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f25.setId("saveShippingSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(69,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f25.setName("saveShippingSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(69,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f25.setValue("0");
    int _jspx_eval_s_005fhidden_005f25 = _jspx_th_s_005fhidden_005f25.doStartTag();
    if (_jspx_th_s_005fhidden_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f26 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f26.setId("saveOnlyNoteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f26.setName("saveOnlyNoteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f26.setValue("0");
    int _jspx_eval_s_005fhidden_005f26 = _jspx_th_s_005fhidden_005f26.doStartTag();
    if (_jspx_th_s_005fhidden_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f26);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f27 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(71,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f27.setId("deleteOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(71,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f27.setName("deleteOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(71,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f27.setValue("0");
    int _jspx_eval_s_005fhidden_005f27 = _jspx_th_s_005fhidden_005f27.doStartTag();
    if (_jspx_th_s_005fhidden_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f27);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f28 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f28.setId("dateBetweenSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f28.setName("dateBetweenSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f28.setValue("0");
    int _jspx_eval_s_005fhidden_005f28 = _jspx_th_s_005fhidden_005f28.doStartTag();
    if (_jspx_th_s_005fhidden_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f28);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f29 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(73,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f29.setId("reportDateBetween");
    // /WEB-INF/jsp/orders/reportOrders.jsp(73,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f29.setName("reportDateBetween");
    // /WEB-INF/jsp/orders/reportOrders.jsp(73,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f29.setValue("0");
    int _jspx_eval_s_005fhidden_005f29 = _jspx_th_s_005fhidden_005f29.doStartTag();
    if (_jspx_th_s_005fhidden_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f29);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f30 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f30.setId("pageIndexSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f30.setName("pageIndexSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f30.setValue("0");
    int _jspx_eval_s_005fhidden_005f30 = _jspx_th_s_005fhidden_005f30.doStartTag();
    if (_jspx_th_s_005fhidden_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f30);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f31 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f31.setId("nextListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f31.setName("nextListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f31.setValue("0");
    int _jspx_eval_s_005fhidden_005f31 = _jspx_th_s_005fhidden_005f31.doStartTag();
    if (_jspx_th_s_005fhidden_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f31);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f32 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f32.setId("prevListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f32.setName("prevListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f32.setValue("0");
    int _jspx_eval_s_005fhidden_005f32 = _jspx_th_s_005fhidden_005f32.doStartTag();
    if (_jspx_th_s_005fhidden_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f32);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f33 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(79,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f33.setId("prevListPages");
    // /WEB-INF/jsp/orders/reportOrders.jsp(79,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f33.setName("prevListPages");
    // /WEB-INF/jsp/orders/reportOrders.jsp(79,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f33.setValue("0");
    int _jspx_eval_s_005fhidden_005f33 = _jspx_th_s_005fhidden_005f33.doStartTag();
    if (_jspx_th_s_005fhidden_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f34 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setId("indexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setName("indexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setValue("-1");
    int _jspx_eval_s_005fhidden_005f34 = _jspx_th_s_005fhidden_005f34.doStartTag();
    if (_jspx_th_s_005fhidden_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f35 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setId("indexList");
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setName("indexList");
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setValue("-1");
    int _jspx_eval_s_005fhidden_005f35 = _jspx_th_s_005fhidden_005f35.doStartTag();
    if (_jspx_th_s_005fhidden_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f36 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f36.setId("confirmDeleteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f36.setName("confirmDeleteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f36.setValue("0");
    int _jspx_eval_s_005fhidden_005f36 = _jspx_th_s_005fhidden_005f36.doStartTag();
    if (_jspx_th_s_005fhidden_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f36);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f37 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f37.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setId("poYpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setName("poYpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setValue("100");
    int _jspx_eval_s_005fhidden_005f37 = _jspx_th_s_005fhidden_005f37.doStartTag();
    if (_jspx_th_s_005fhidden_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f37);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f38 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f38.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setId("poXpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setName("poXpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setValue("100");
    int _jspx_eval_s_005fhidden_005f38 = _jspx_th_s_005fhidden_005f38.doStartTag();
    if (_jspx_th_s_005fhidden_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f38);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f39 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f39.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f39.setId("findOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f39.setName("findOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f39.setValue("0");
    int _jspx_eval_s_005fhidden_005f39 = _jspx_th_s_005fhidden_005f39.doStartTag();
    if (_jspx_th_s_005fhidden_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f39);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f40 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f40.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setId("frmUserLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setValue("");
    int _jspx_eval_s_005fhidden_005f40 = _jspx_th_s_005fhidden_005f40.doStartTag();
    if (_jspx_th_s_005fhidden_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f40);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f41 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f41.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(91,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setId("frmStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(91,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setName("status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(91,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setValue("");
    int _jspx_eval_s_005fhidden_005f41 = _jspx_th_s_005fhidden_005f41.doStartTag();
    if (_jspx_th_s_005fhidden_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f41);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f42 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f42.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setId("frmSelectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setValue("");
    int _jspx_eval_s_005fhidden_005f42 = _jspx_th_s_005fhidden_005f42.doStartTag();
    if (_jspx_th_s_005fhidden_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f42);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f43 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f43.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(94,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setId("frmStrCreationDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(94,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setName("strCreationDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(94,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setValue("");
    int _jspx_eval_s_005fhidden_005f43 = _jspx_th_s_005fhidden_005f43.doStartTag();
    if (_jspx_th_s_005fhidden_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f43);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f44 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f44.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(95,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setId("frmStrCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(95,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setName("strCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(95,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setValue("");
    int _jspx_eval_s_005fhidden_005f44 = _jspx_th_s_005fhidden_005f44.doStartTag();
    if (_jspx_th_s_005fhidden_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f44);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f45 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f45.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setId("frmStrCreationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setName("strCreationDateEnd ");
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setValue("");
    int _jspx_eval_s_005fhidden_005f45 = _jspx_th_s_005fhidden_005f45.doStartTag();
    if (_jspx_th_s_005fhidden_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f45);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f46 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f46.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setId("strPrintFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setValue("null");
    int _jspx_eval_s_005fhidden_005f46 = _jspx_th_s_005fhidden_005f46.doStartTag();
    if (_jspx_th_s_005fhidden_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f46);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f47 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f47.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setId("testSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setName("testSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setValue("0");
    int _jspx_eval_s_005fhidden_005f47 = _jspx_th_s_005fhidden_005f47.doStartTag();
    if (_jspx_th_s_005fhidden_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f47);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f48 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f48.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(103,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setId("newStatusFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(103,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setName("newStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(103,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setValue("null");
    int _jspx_eval_s_005fhidden_005f48 = _jspx_th_s_005fhidden_005f48.doStartTag();
    if (_jspx_th_s_005fhidden_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f48);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f49 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f49.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setId("codeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setName("code");
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setValue("0");
    int _jspx_eval_s_005fhidden_005f49 = _jspx_th_s_005fhidden_005f49.doStartTag();
    if (_jspx_th_s_005fhidden_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f49);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f50 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f50.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setId("showRowShippingFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setName("showRowShipping");
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setValue("0");
    int _jspx_eval_s_005fhidden_005f50 = _jspx_th_s_005fhidden_005f50.doStartTag();
    if (_jspx_th_s_005fhidden_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f50);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f51 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f51.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setId("showOnlyEditNoteFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setName("showOnlyEditNote");
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setValue("0");
    int _jspx_eval_s_005fhidden_005f51 = _jspx_th_s_005fhidden_005f51.doStartTag();
    if (_jspx_th_s_005fhidden_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f51);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f52 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f52.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(107,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f52.setId("userIdFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(107,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f52.setName("userId");
    int _jspx_eval_s_005fhidden_005f52 = _jspx_th_s_005fhidden_005f52.doStartTag();
    if (_jspx_th_s_005fhidden_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f52);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f53 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f53.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(108,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f53.setId("productOrderNumberFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(108,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f53.setName("productOrderNumber");
    int _jspx_eval_s_005fhidden_005f53 = _jspx_th_s_005fhidden_005f53.doStartTag();
    if (_jspx_th_s_005fhidden_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f53);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f54 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f54.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(109,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f54.setId("productOrderDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(109,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f54.setName("strProductOrderDate");
    int _jspx_eval_s_005fhidden_005f54 = _jspx_th_s_005fhidden_005f54.doStartTag();
    if (_jspx_th_s_005fhidden_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f54);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f55 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f55.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(110,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f55.setId("creationDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(110,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f55.setName("strCreationDate");
    int _jspx_eval_s_005fhidden_005f55 = _jspx_th_s_005fhidden_005f55.doStartTag();
    if (_jspx_th_s_005fhidden_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f55);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f56 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f56.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(111,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f56.setId("creationOrderDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(111,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f56.setName("strCreationOrderDate");
    int _jspx_eval_s_005fhidden_005f56 = _jspx_th_s_005fhidden_005f56.doStartTag();
    if (_jspx_th_s_005fhidden_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f56);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f57 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f57.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(112,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f57.setId("requiredDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(112,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f57.setName("strRequiredDate");
    int _jspx_eval_s_005fhidden_005f57 = _jspx_th_s_005fhidden_005f57.doStartTag();
    if (_jspx_th_s_005fhidden_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f57);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f58 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f58.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(113,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setId("clientLastNameFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(113,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setName("clientLastName");
    // /WEB-INF/jsp/orders/reportOrders.jsp(113,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setValue("");
    int _jspx_eval_s_005fhidden_005f58 = _jspx_th_s_005fhidden_005f58.doStartTag();
    if (_jspx_th_s_005fhidden_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f58);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f59 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f59.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(114,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setId("clientFirstNameFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(114,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setName("clientFirstName");
    // /WEB-INF/jsp/orders/reportOrders.jsp(114,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setValue("");
    int _jspx_eval_s_005fhidden_005f59 = _jspx_th_s_005fhidden_005f59.doStartTag();
    if (_jspx_th_s_005fhidden_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f59);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f60 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f60.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setId("clientOtherNamesFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setName("clientOtherNames");
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setValue("");
    int _jspx_eval_s_005fhidden_005f60 = _jspx_th_s_005fhidden_005f60.doStartTag();
    if (_jspx_th_s_005fhidden_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f60);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f61 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f61.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setId("clientStreetFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setName("clientStreet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setValue("");
    int _jspx_eval_s_005fhidden_005f61 = _jspx_th_s_005fhidden_005f61.doStartTag();
    if (_jspx_th_s_005fhidden_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f61);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f62 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f62.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setId("clientOtherStreetFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setName("clientOtherStreet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setValue("");
    int _jspx_eval_s_005fhidden_005f62 = _jspx_th_s_005fhidden_005f62.doStartTag();
    if (_jspx_th_s_005fhidden_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f62);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f63 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f63.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f63.setId("clientCityFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f63.setName("clientCity");
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f63.setValue("");
    int _jspx_eval_s_005fhidden_005f63 = _jspx_th_s_005fhidden_005f63.doStartTag();
    if (_jspx_th_s_005fhidden_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f63);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f64 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f64.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f64.setId("clientProvinceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f64.setName("clientProvince");
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f64.setValue("");
    int _jspx_eval_s_005fhidden_005f64 = _jspx_th_s_005fhidden_005f64.doStartTag();
    if (_jspx_th_s_005fhidden_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f64);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f65 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f65.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f65.setId("clientPostalCodeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f65.setName("clientPostalCode");
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f65.setValue("");
    int _jspx_eval_s_005fhidden_005f65 = _jspx_th_s_005fhidden_005f65.doStartTag();
    if (_jspx_th_s_005fhidden_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f65);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f66 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f66.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f66.setId("clientPhoneFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f66.setName("clientPhone");
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f66.setValue("");
    int _jspx_eval_s_005fhidden_005f66 = _jspx_th_s_005fhidden_005f66.doStartTag();
    if (_jspx_th_s_005fhidden_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f66);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f67 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f67.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(122,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f67.setId("clientEmailFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(122,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f67.setName("clientEmail");
    // /WEB-INF/jsp/orders/reportOrders.jsp(122,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f67.setValue("");
    int _jspx_eval_s_005fhidden_005f67 = _jspx_th_s_005fhidden_005f67.doStartTag();
    if (_jspx_th_s_005fhidden_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f67);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f68 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f68.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f68.setId("strShippingPriceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f68.setName("strShippingPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f68.setValue("");
    int _jspx_eval_s_005fhidden_005f68 = _jspx_th_s_005fhidden_005f68.doStartTag();
    if (_jspx_th_s_005fhidden_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f68);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f69 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f69.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f69.setId("strShippedDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f69.setName("strShippedDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f69.setValue("");
    int _jspx_eval_s_005fhidden_005f69 = _jspx_th_s_005fhidden_005f69.doStartTag();
    if (_jspx_th_s_005fhidden_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f69);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f70(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f70 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f70.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setId("quantityFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setName("quantity");
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setValue("-1");
    int _jspx_eval_s_005fhidden_005f70 = _jspx_th_s_005fhidden_005f70.doStartTag();
    if (_jspx_th_s_005fhidden_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f70);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f71(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f71 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f71.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(128,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setId("quantityToChangeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(128,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setName("quantityToChange");
    // /WEB-INF/jsp/orders/reportOrders.jsp(128,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setValue("-1");
    int _jspx_eval_s_005fhidden_005f71 = _jspx_th_s_005fhidden_005f71.doStartTag();
    if (_jspx_th_s_005fhidden_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f71);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f72(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f72 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f72.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(129,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f72.setId("lsProductIDFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(129,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f72.setName("lsProductID");
    // /WEB-INF/jsp/orders/reportOrders.jsp(129,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f72.setValue("");
    int _jspx_eval_s_005fhidden_005f72 = _jspx_th_s_005fhidden_005f72.doStartTag();
    if (_jspx_th_s_005fhidden_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f72);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f73(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f73 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f73.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(130,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setId("stockFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(130,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setName("stock");
    // /WEB-INF/jsp/orders/reportOrders.jsp(130,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setValue("-1");
    int _jspx_eval_s_005fhidden_005f73 = _jspx_th_s_005fhidden_005f73.doStartTag();
    if (_jspx_th_s_005fhidden_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f73);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f74(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f74 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f74.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(131,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f74.setId("productDescriptionFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(131,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f74.setName("productDescription");
    // /WEB-INF/jsp/orders/reportOrders.jsp(131,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f74.setValue("");
    int _jspx_eval_s_005fhidden_005f74 = _jspx_th_s_005fhidden_005f74.doStartTag();
    if (_jspx_th_s_005fhidden_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f74);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f75(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f75 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f75.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(132,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setId("unitPriceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(132,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setName("unitPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(132,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setValue("-1");
    int _jspx_eval_s_005fhidden_005f75 = _jspx_th_s_005fhidden_005f75.doStartTag();
    if (_jspx_th_s_005fhidden_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f75);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f76(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f76 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f76.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setId("shippingFeeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setName("shippingFee");
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setValue("-1");
    int _jspx_eval_s_005fhidden_005f76 = _jspx_th_s_005fhidden_005f76.doStartTag();
    if (_jspx_th_s_005fhidden_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f76);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f77(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f77 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f77.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f77.setId("notesFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f77.setName("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f77.setValue("");
    int _jspx_eval_s_005fhidden_005f77 = _jspx_th_s_005fhidden_005f77.doStartTag();
    if (_jspx_th_s_005fhidden_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f77);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f78(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f78 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f78.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(135,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f78.setId("shippingCompanyFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(135,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f78.setName("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(135,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f78.setValue("");
    int _jspx_eval_s_005fhidden_005f78 = _jspx_th_s_005fhidden_005f78.doStartTag();
    if (_jspx_th_s_005fhidden_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f78);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f79(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f79 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f79.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(136,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f79.setId("companyHeaderFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(136,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f79.setName("companyHeader");
    // /WEB-INF/jsp/orders/reportOrders.jsp(136,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f79.setValue("");
    int _jspx_eval_s_005fhidden_005f79 = _jspx_th_s_005fhidden_005f79.doStartTag();
    if (_jspx_th_s_005fhidden_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f79);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f80(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f80 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f80.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setId("trackingNumberFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setName("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setValue("");
    int _jspx_eval_s_005fhidden_005f80 = _jspx_th_s_005fhidden_005f80.doStartTag();
    if (_jspx_th_s_005fhidden_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f80);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setId("formToPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("printOrdersToPDF.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setEnctype("multipart/form-data");
    int _jspx_eval_s_005fform_005f1 = _jspx_th_s_005fform_005f1.doStartTag();
    if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f81(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f82(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f83(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f84(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f81(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f81 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f81.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(142,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setId("strPrintInPDFForm");
    // /WEB-INF/jsp/orders/reportOrders.jsp(142,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(142,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setValue("null");
    int _jspx_eval_s_005fhidden_005f81 = _jspx_th_s_005fhidden_005f81.doStartTag();
    if (_jspx_th_s_005fhidden_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f81);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f82(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f82 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f82.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(143,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setId("tansformReportSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(143,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setName("tansformReportSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(143,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setValue("0");
    int _jspx_eval_s_005fhidden_005f82 = _jspx_th_s_005fhidden_005f82.doStartTag();
    if (_jspx_th_s_005fhidden_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f82);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f83(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f83 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f83.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(144,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setId("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(144,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setName("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(144,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setValue("0");
    int _jspx_eval_s_005fhidden_005f83 = _jspx_th_s_005fhidden_005f83.doStartTag();
    if (_jspx_th_s_005fhidden_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f83);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f84 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f84.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(145,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setId("printAllOrderPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(145,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setName("printAllOrderPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(145,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setValue("0");
    int _jspx_eval_s_005fhidden_005f84 = _jspx_th_s_005fhidden_005f84.doStartTag();
    if (_jspx_th_s_005fhidden_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f84);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f2 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f2.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setId("formOrdersAdminXLS");
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setAction("ordersAdminXLS.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setEnctype("multipart/form-data");
    int _jspx_eval_s_005fform_005f2 = _jspx_th_s_005fform_005f2.doStartTag();
    if (_jspx_eval_s_005fform_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f85(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f86(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f87(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f88(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  \t\t");
        if (_jspx_meth_s_005fhidden_005f89(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f90(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f91(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f85 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f85.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setId("frmUserLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setValue("");
    int _jspx_eval_s_005fhidden_005f85 = _jspx_th_s_005fhidden_005f85.doStartTag();
    if (_jspx_th_s_005fhidden_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f85);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f86(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f86 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f86.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setId("frmSelectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setValue("");
    int _jspx_eval_s_005fhidden_005f86 = _jspx_th_s_005fhidden_005f86.doStartTag();
    if (_jspx_th_s_005fhidden_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f86);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f86);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f87(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f87 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f87.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setId("strPrintInAdminXLS");
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setValue("null");
    int _jspx_eval_s_005fhidden_005f87 = _jspx_th_s_005fhidden_005f87.doStartTag();
    if (_jspx_th_s_005fhidden_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f87);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f87);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f88(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f88 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f88.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setId("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setName("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setValue("0");
    int _jspx_eval_s_005fhidden_005f88 = _jspx_th_s_005fhidden_005f88.doStartTag();
    if (_jspx_th_s_005fhidden_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f88);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f88);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f89(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f89 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f89.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setId("reportOrderPageSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setName("reportOrderPageSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setValue("0");
    int _jspx_eval_s_005fhidden_005f89 = _jspx_th_s_005fhidden_005f89.doStartTag();
    if (_jspx_th_s_005fhidden_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f89);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f89);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f90(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f90 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f90.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setId("selectedOrdersListSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setName("selectedOrdersListSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setValue("0");
    int _jspx_eval_s_005fhidden_005f90 = _jspx_th_s_005fhidden_005f90.doStartTag();
    if (_jspx_th_s_005fhidden_005f90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f90);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f90);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f91(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f91 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f91.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setId("generateESTFileSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setName("generateESTFileSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setValue("0");
    int _jspx_eval_s_005fhidden_005f91 = _jspx_th_s_005fhidden_005f91.doStartTag();
    if (_jspx_th_s_005fhidden_005f91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f91);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f91);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(173,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("txtUserLoginTo");
    // /WEB-INF/jsp/orders/reportOrders.jsp(173,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(173,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("%{userLogin}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(173,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssStyle("width:150px");
    // /WEB-INF/jsp/orders/reportOrders.jsp(173,8) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "autocomplete", new String("off"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(186,35) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("lsOrderIdSearch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(186,35) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("lsOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(186,35) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setValue("%{lsOrderId}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(186,35) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssStyle("width:100px");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setLabel("");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("-1");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("All Status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("#{'0':'Open', '1':'Progress', '2':'Shipped'}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setValue("%{selectedStatus}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setRequired("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,35) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width:100px");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(198,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{reportDateBetween==null || reportDateBetween==0}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<span  id=\"factorDateBetweenId\" style=\"cursor:pointer;color: rgb(44,140,171);text-decoration:underline;\">PO Date </span> between:\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent(null);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<span id=\"factorDateBetweenId\" style=\"cursor:pointer;color: rgb(44,140,171);text-decoration:underline;\">Shipped Date </span> between:\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f0 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(206,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setId("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(206,5) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setName("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(206,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setVar("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(206,5) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f0 = _jspx_th_s_005fdate_005f0.doStartTag();
    if (_jspx_th_s_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setId("creationDateStartPicker");
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("strCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setValue("%{#creationDateStart}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setKey("labelkey");
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setReadonly("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(207,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setCssStyle("width:150px;");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f1 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f1.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(211,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setId("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(211,5) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setName("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(211,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setVar("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(211,5) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f1 = _jspx_th_s_005fdate_005f1.doStartTag();
    if (_jspx_th_s_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setId("creationDateEndPicker");
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("strCreationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setValue("%{#creationDateEnd}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setKey("labelkey");
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setReadonly("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(212,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setCssStyle("width:150px;");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(266,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("%{usersList}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(266,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setId("row");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t        ");
        if (_jspx_meth_s_005fiterator_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("           \n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(267,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("%{#row}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(267,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setId("cell");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t    <option>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t\t\t\t</option>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(269,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("%{#cell.login}");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(282,17) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("%{listOrdersDTO.size}");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(285,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("%{totalOrders}");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(287,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{listOrdersDTO.size > 0  && superAdmin!=null}");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<td width=\"80px\">\n");
        out.write("\t  \t\t<img id=\"imgGetAdminXLSEST\" src=\"images/orders/xlsEst.png\" style=\"cursor:pointer;\"/>\n");
        out.write("\t\t</td>\n");
        out.write("\t\t\n");
        out.write("\t\t<td width=\"80px\">\n");
        out.write("\t  \t\t<img id=\"imgGetAdminXLS\" src=\"images/orders/xls.png\" style=\"cursor:pointer;\"/>\n");
        out.write("\t\t</td>\n");
        out.write("\t\t  \n");
        out.write("\t\t<td width=\"80px\">\n");
        out.write("\t   \t\t <img id=\"imgPrintOrders\" src=\"images/orders/printAll.png\" style=\"cursor:pointer;\"/>\n");
        out.write("\t\t</td>\n");
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(302,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{listOrdersDTO.size > 0 && usersPrivShippedToInvoiced!=null}");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<td>\n");
        out.write("\t\t   \t\t<img id=\"imgGetInvoicedXLS\" src=\"images/orders/xlsInvoiced.png\" style=\"cursor:pointer;\"/>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f92(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f92 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f92.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f92.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(312,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setId("sizeResult");
    // /WEB-INF/jsp/orders/reportOrders.jsp(312,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setName("sizeResult");
    // /WEB-INF/jsp/orders/reportOrders.jsp(312,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setValue("%{listOrdersDTO.size}");
    int _jspx_eval_s_005fhidden_005f92 = _jspx_th_s_005fhidden_005f92.doStartTag();
    if (_jspx_th_s_005fhidden_005f92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f92);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f92);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(363,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("%{listOrdersDTO.size > 0}");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t <tr>\n");
        out.write("\t <td colspan=\"34\">\n");
        out.write("\t<div  id=\"divRowsOrder\" style=\"overflow-y: auto;width:5030px;direction: rtl;text-align: left;max-height:550px;height:800px;cursor:default;padding-bottom: 10px;overflow-x:hidden;\">\n");
        out.write("\t<table style=\"direction: ltr;table-layout: fixed;\" width=\"5030px\">\n");
        out.write("\t");
        if (_jspx_meth_s_005fiterator_005f2(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t</table>\n");
        out.write("\t</div>\n");
        out.write("\t</td>\n");
        out.write("\t</tr>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f2 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /WEB-INF/jsp/orders/reportOrders.jsp(368,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setValue("listOrdersDTO");
    // /WEB-INF/jsp/orders/reportOrders.jsp(368,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setId("order");
    int _jspx_eval_s_005fiterator_005f2 = _jspx_th_s_005fiterator_005f2.doStartTag();
    if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t              \n");
        out.write("\t\t\t<tr height=\"45px\" id=\"rowOrder\" style='");
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005fproperty_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("font-size: 12px;border-bottom:1px solid #CCCCCC;border-right:1px solid white;'>\n");
        out.write("\t\t\t<td id=\"columnInfoNotCompleted\" width=\"19px\" align=\"right\" style=\"padding-left:20px;\">\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fif_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td align=\"center\" width=\"35px\">\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fcheckbox_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td id=\"columnIndexOrder\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"125px\" style=\"border-left:1px solid #CCCCCC;border-right:1px solid #CCCCCC;padding-left: 10px; padding-right: 5px;padding-top:5px;padding-bottom:5px;\">");
        if (_jspx_meth_s_005fproperty_005f6(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"125px\" style=\"border-left:1px solid #CCCCCC;border-right:1px solid #CCCCCC;padding-left: 10px; padding-right: 5px;padding-top:5px;padding-bottom:5px;visibility:hidden;display:none;padding-right:10px;\">");
        if (_jspx_meth_s_005fproperty_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fif_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005felse_005f1(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<td width=\"102px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f10(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"120px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f11(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"120px\"  style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f6(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f2(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td style=\"visibility:hidden;display:none;\"><img id=\"imgSort\" src=\"\" /></td>\n");
        out.write("\t\t\t<td width=\"130px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f14(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"90px\"  style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f15(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"90px\"  style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f16(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"180px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f17(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"120px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f18(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"120px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f19(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"132px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"120px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f8(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"170px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f9(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f1(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"120px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f26(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"160px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f27(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"110px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f28(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<td width=\"165px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f29(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<td width=\"150px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f30(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"150px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f31(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"130px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f32(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"100px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f33(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"170px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f34(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"170px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f35(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"100px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f36(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td id=\"clientProvince\" width=\"110px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f37(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"130px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f38(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"100px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f39(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"180px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f40(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td width=\"170px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f10(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f2(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"135px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f11(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\t\t\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"170px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f12(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f6(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td width=\"110px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f13(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felse_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<td width=\"95px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f50(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t<td style=\"background-color: white;border:1px solid white;\"></td>\t\t\n");
        out.write("\t\t\t</tr>\n");
        out.write("         \t\t\t\t\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,42) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("#order.CssStyle");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,79) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("#order.cssRow");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("%{infoMissing==1}");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<img id=\"infoMissingDiv\"   src=\"images/orders/infoMissing.png\">\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(376,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setId("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(376,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setName("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(376,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setValue("%{checkBoxItem}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(376,3) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setDisabled("%{checkBoxItem}");
    int _jspx_eval_s_005fcheckbox_005f0 = _jspx_th_s_005fcheckbox_005f0.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f5 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(377,69) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f5.setValue("#order.index");
    int _jspx_eval_s_005fproperty_005f5 = _jspx_th_s_005fproperty_005f5.doStartTag();
    if (_jspx_th_s_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f6 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(378,165) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f6.setValue("#order.userLogin");
    int _jspx_eval_s_005fproperty_005f6 = _jspx_th_s_005fproperty_005f6.doStartTag();
    if (_jspx_th_s_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f7 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(379,215) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f7.setValue("#order.id");
    int _jspx_eval_s_005fproperty_005f7 = _jspx_th_s_005fproperty_005f7.doStartTag();
    if (_jspx_th_s_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(381,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("superAdmin!=null");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<td id=\"columnRowOrderId\" width=\"220px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;font-weight: bold;color: rgb(44,140,171);overflow: hidden;text-overflow: ellipsis;cursor:pointer;\">");
        if (_jspx_meth_s_005fproperty_005f8(_jspx_th_s_005fif_005f5, _jspx_page_context))
          return true;
        out.write("<img id=\"editRowOrder\" src=\"images/orders/editRowOrder.png\" align=\"right\" style=\"vertical-align:middle;padding-right:0px;\"/></td>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f8 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f5);
    // /WEB-INF/jsp/orders/reportOrders.jsp(382,254) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f8.setValue("#order.lsOrderId");
    int _jspx_eval_s_005fproperty_005f8 = _jspx_th_s_005fproperty_005f8.doStartTag();
    if (_jspx_th_s_005fproperty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f1 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f1 = _jspx_th_s_005felse_005f1.doStartTag();
    if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<td width=\"220px\" style=\"border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;font-weight: bold;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f9(_jspx_th_s_005felse_005f1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f9 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(385,194) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f9.setValue("#order.lsOrderId");
    int _jspx_eval_s_005fproperty_005f9 = _jspx_th_s_005fproperty_005f9.doStartTag();
    if (_jspx_th_s_005fproperty_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f10 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(388,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f10.setValue("#order.creationDate");
    int _jspx_eval_s_005fproperty_005f10 = _jspx_th_s_005fproperty_005f10.doStartTag();
    if (_jspx_th_s_005fproperty_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f11 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(389,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f11.setValue("#order.requiredDate");
    int _jspx_eval_s_005fproperty_005f11 = _jspx_th_s_005fproperty_005f11.doStartTag();
    if (_jspx_th_s_005fproperty_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f6 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(391,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f6.setTest("showRowShipping==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f6 = _jspx_th_s_005fif_005f6.doStartTag();
    if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f12(_jspx_th_s_005fif_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"statusToEdit\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"statusId\"></center>\n");
        out.write("\t\t\t\t\t<center id=\"saveStatus\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f12 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f6);
    // /WEB-INF/jsp/orders/reportOrders.jsp(392,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f12.setValue("#order.status");
    int _jspx_eval_s_005fproperty_005f12 = _jspx_th_s_005fproperty_005f12.doStartTag();
    if (_jspx_th_s_005fproperty_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f0 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(397,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f0.setTest("showRowShipping!=0 && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f0 = _jspx_th_s_005felseif_005f0.doStartTag();
    if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005felseif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"saveStatus\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"statusToEdit\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setId("statusId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("statusId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("listStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = emptyOption type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setEmptyOption("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("id");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("--Select--");
    // /WEB-INF/jsp/orders/reportOrders.jsp(398,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setCssStyle("width:80px;color:black;");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f2 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f2 = _jspx_th_s_005felse_005f2.doStartTag();
    if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f13(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f13 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(411,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f13.setValue("#order.status");
    int _jspx_eval_s_005fproperty_005f13 = _jspx_th_s_005fproperty_005f13.doStartTag();
    if (_jspx_th_s_005fproperty_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f14 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(415,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f14.setValue("#order.lsProductID");
    int _jspx_eval_s_005fproperty_005f14 = _jspx_th_s_005fproperty_005f14.doStartTag();
    if (_jspx_th_s_005fproperty_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f15 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(416,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f15.setValue("#order.quantity");
    int _jspx_eval_s_005fproperty_005f15 = _jspx_th_s_005fproperty_005f15.doStartTag();
    if (_jspx_th_s_005fproperty_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f16 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(417,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f16.setValue("#order.stock");
    int _jspx_eval_s_005fproperty_005f16 = _jspx_th_s_005fproperty_005f16.doStartTag();
    if (_jspx_th_s_005fproperty_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f17 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(418,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f17.setValue("#order.productDescription");
    int _jspx_eval_s_005fproperty_005f17 = _jspx_th_s_005fproperty_005f17.doStartTag();
    if (_jspx_th_s_005fproperty_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f18 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(419,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f18.setValue("#order.unitPrice");
    int _jspx_eval_s_005fproperty_005f18 = _jspx_th_s_005fproperty_005f18.doStartTag();
    if (_jspx_th_s_005fproperty_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f19 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(420,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f19.setValue("#order.lsPrice");
    int _jspx_eval_s_005fproperty_005f19 = _jspx_th_s_005fproperty_005f19.doStartTag();
    if (_jspx_th_s_005fproperty_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f7 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(422,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f7.setTest("%{#order.currencyId != 1}");
    int _jspx_eval_s_005fif_005f7 = _jspx_th_s_005fif_005f7.doStartTag();
    if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<span style=\"color:#0000FF;\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f20(_jspx_th_s_005fif_005f7, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f21(_jspx_th_s_005fif_005f7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f20 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f7);
    // /WEB-INF/jsp/orders/reportOrders.jsp(424,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f20.setValue("#order.currencyUnitPrice");
    int _jspx_eval_s_005fproperty_005f20 = _jspx_th_s_005fproperty_005f20.doStartTag();
    if (_jspx_th_s_005fproperty_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f21 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f7);
    // /WEB-INF/jsp/orders/reportOrders.jsp(424,53) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f21.setValue("#order.currencySymbol");
    int _jspx_eval_s_005fproperty_005f21 = _jspx_th_s_005fproperty_005f21.doStartTag();
    if (_jspx_th_s_005fproperty_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f8 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(429,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f8.setTest("%{#order.currencyId != 1}");
    int _jspx_eval_s_005fif_005f8 = _jspx_th_s_005fif_005f8.doStartTag();
    if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<span style=\"color:#0000FF;\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f22(_jspx_th_s_005fif_005f8, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f23(_jspx_th_s_005fif_005f8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f22 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f8);
    // /WEB-INF/jsp/orders/reportOrders.jsp(431,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f22.setValue("#order.currencyPrice");
    int _jspx_eval_s_005fproperty_005f22 = _jspx_th_s_005fproperty_005f22.doStartTag();
    if (_jspx_th_s_005fproperty_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f23 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f8);
    // /WEB-INF/jsp/orders/reportOrders.jsp(431,49) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f23.setValue("#order.currencySymbol");
    int _jspx_eval_s_005fproperty_005f23 = _jspx_th_s_005fproperty_005f23.doStartTag();
    if (_jspx_th_s_005fproperty_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f9 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(436,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f9.setTest("showOnlyEditNote==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f9 = _jspx_th_s_005fif_005f9.doStartTag();
    if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f24(_jspx_th_s_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"editNotes\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"saveNotes\"></center>\n");
        out.write("\t\t\t\t\t<center id=\"notes\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f24 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f9);
    // /WEB-INF/jsp/orders/reportOrders.jsp(437,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f24.setValue("#order.notes");
    int _jspx_eval_s_005fproperty_005f24 = _jspx_th_s_005fproperty_005f24.doStartTag();
    if (_jspx_th_s_005fproperty_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f1 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(442,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f1.setTest("showOnlyEditNote==1 && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f1 = _jspx_th_s_005felseif_005f1.doStartTag();
    if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f4(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("<a id=\"saveNotes\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"editNotes\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(443,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setId("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(443,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(443,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setValue("%{notes}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(443,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setCssStyle("width:115px");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f3 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f3 = _jspx_th_s_005felse_005f3.doStartTag();
    if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f25(_jspx_th_s_005felse_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f25 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f3);
    // /WEB-INF/jsp/orders/reportOrders.jsp(446,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f25.setValue("#order.notes");
    int _jspx_eval_s_005fproperty_005f25 = _jspx_th_s_005fproperty_005f25.doStartTag();
    if (_jspx_th_s_005fproperty_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f26 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(449,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f26.setValue("#order.productOrderNumber");
    int _jspx_eval_s_005fproperty_005f26 = _jspx_th_s_005fproperty_005f26.doStartTag();
    if (_jspx_th_s_005fproperty_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f27 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(450,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f27.setValue("#order.clientProductNumber");
    int _jspx_eval_s_005fproperty_005f27 = _jspx_th_s_005fproperty_005f27.doStartTag();
    if (_jspx_th_s_005fproperty_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f27);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f28 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(451,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f28.setValue("#order.clientOrderNumber");
    int _jspx_eval_s_005fproperty_005f28 = _jspx_th_s_005fproperty_005f28.doStartTag();
    if (_jspx_th_s_005fproperty_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f28);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f29 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(453,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f29.setValue("#order.clientOtherId");
    int _jspx_eval_s_005fproperty_005f29 = _jspx_th_s_005fproperty_005f29.doStartTag();
    if (_jspx_th_s_005fproperty_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f29);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f30 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(455,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f30.setValue("#order.clientFirstName");
    int _jspx_eval_s_005fproperty_005f30 = _jspx_th_s_005fproperty_005f30.doStartTag();
    if (_jspx_th_s_005fproperty_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f30);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f31 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(456,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f31.setValue("#order.clientLastName");
    int _jspx_eval_s_005fproperty_005f31 = _jspx_th_s_005fproperty_005f31.doStartTag();
    if (_jspx_th_s_005fproperty_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f31);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f32 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(457,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f32.setValue("#order.clientOtherNames");
    int _jspx_eval_s_005fproperty_005f32 = _jspx_th_s_005fproperty_005f32.doStartTag();
    if (_jspx_th_s_005fproperty_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f32);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f33 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(458,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f33.setValue("#order.clientNumber");
    int _jspx_eval_s_005fproperty_005f33 = _jspx_th_s_005fproperty_005f33.doStartTag();
    if (_jspx_th_s_005fproperty_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f34 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(459,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f34.setValue("#order.clientStreet");
    int _jspx_eval_s_005fproperty_005f34 = _jspx_th_s_005fproperty_005f34.doStartTag();
    if (_jspx_th_s_005fproperty_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f35 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(460,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f35.setValue("#order.clientOtherStreet");
    int _jspx_eval_s_005fproperty_005f35 = _jspx_th_s_005fproperty_005f35.doStartTag();
    if (_jspx_th_s_005fproperty_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f36 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(461,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f36.setValue("#order.clientCity");
    int _jspx_eval_s_005fproperty_005f36 = _jspx_th_s_005fproperty_005f36.doStartTag();
    if (_jspx_th_s_005fproperty_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f36);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f37 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f37.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(462,195) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f37.setValue("#order.clientProvince");
    int _jspx_eval_s_005fproperty_005f37 = _jspx_th_s_005fproperty_005f37.doStartTag();
    if (_jspx_th_s_005fproperty_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f37);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f38 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f38.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(463,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f38.setValue("#order.clientPostalCode");
    int _jspx_eval_s_005fproperty_005f38 = _jspx_th_s_005fproperty_005f38.doStartTag();
    if (_jspx_th_s_005fproperty_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f38);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f39 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f39.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(464,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f39.setValue("#order.clientPhone");
    int _jspx_eval_s_005fproperty_005f39 = _jspx_th_s_005fproperty_005f39.doStartTag();
    if (_jspx_th_s_005fproperty_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f39);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f40 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f40.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(465,175) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f40.setValue("#order.clientEmail");
    int _jspx_eval_s_005fproperty_005f40 = _jspx_th_s_005fproperty_005f40.doStartTag();
    if (_jspx_th_s_005fproperty_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f40);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f10 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(467,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f10.setTest("showRowShipping==0  && superAdmin!=null");
    int _jspx_eval_s_005fif_005f10 = _jspx_th_s_005fif_005f10.doStartTag();
    if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f41(_jspx_th_s_005fif_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"editShippingCompany\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"saveShippingCompany\"></center>\n");
        out.write("\t\t\t\t\t<center id=\"shippingCompany\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f41 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f41.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f10);
    // /WEB-INF/jsp/orders/reportOrders.jsp(468,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f41.setValue("#order.shippingCompany");
    int _jspx_eval_s_005fproperty_005f41 = _jspx_th_s_005fproperty_005f41.doStartTag();
    if (_jspx_th_s_005fproperty_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f41);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f2 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(473,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f2.setTest("showRowShipping!=0  && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f2 = _jspx_th_s_005felseif_005f2.doStartTag();
    if (_jspx_eval_s_005felseif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f5(_jspx_th_s_005felseif_005f2, _jspx_page_context))
          return true;
        out.write("<a id=\"saveShippingCompany\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"editShippingCompany\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(474,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setId("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(474,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(474,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setValue("%{shippingCompany}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(474,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setCssStyle("width:110px");
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f4 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f4 = _jspx_th_s_005felse_005f4.doStartTag();
    if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f42(_jspx_th_s_005felse_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f42 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f42.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f4);
    // /WEB-INF/jsp/orders/reportOrders.jsp(477,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f42.setValue("#order.shippingCompany");
    int _jspx_eval_s_005fproperty_005f42 = _jspx_th_s_005fproperty_005f42.doStartTag();
    if (_jspx_th_s_005fproperty_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f42);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f11 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(481,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f11.setTest("showRowShipping==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f11 = _jspx_th_s_005fif_005f11.doStartTag();
    if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f43(_jspx_th_s_005fif_005f11, _jspx_page_context))
          return true;
        out.write("<a id=\"editShippedDate\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"saveShippedDate\"></center>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f43 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f43.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f11);
    // /WEB-INF/jsp/orders/reportOrders.jsp(482,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f43.setValue("#order.shippedDate");
    int _jspx_eval_s_005fproperty_005f43 = _jspx_th_s_005fproperty_005f43.doStartTag();
    if (_jspx_th_s_005fproperty_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f43);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f3 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(486,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f3.setTest("showRowShipping!=0 && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f3 = _jspx_th_s_005felseif_005f3.doStartTag();
    if (_jspx_eval_s_005felseif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<input type=\"text\" id=\"saveShippedDatePicker\" name=\"strShippedDate\" value='");
        if (_jspx_meth_s_005fproperty_005f44(_jspx_th_s_005felseif_005f3, _jspx_page_context))
          return true;
        out.write("' style=\"width:80px;\"/><a id=\"saveShippedDate\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"editShippedDate\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f44 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f44.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f3);
    // /WEB-INF/jsp/orders/reportOrders.jsp(487,80) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f44.setValue("#order.shippedDate");
    int _jspx_eval_s_005fproperty_005f44 = _jspx_th_s_005fproperty_005f44.doStartTag();
    if (_jspx_th_s_005fproperty_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f44);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f5 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f5 = _jspx_th_s_005felse_005f5.doStartTag();
    if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f45(_jspx_th_s_005felse_005f5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f45 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f45.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f5);
    // /WEB-INF/jsp/orders/reportOrders.jsp(490,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f45.setValue("#order.shippedDate");
    int _jspx_eval_s_005fproperty_005f45 = _jspx_th_s_005fproperty_005f45.doStartTag();
    if (_jspx_th_s_005fproperty_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f45);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f12 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(494,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f12.setTest("showRowShipping==0  && superAdmin!=null");
    int _jspx_eval_s_005fif_005f12 = _jspx_th_s_005fif_005f12.doStartTag();
    if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f46(_jspx_th_s_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"editTrackingNumber\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"saveTrackingNumber\"></center>\n");
        out.write("\t\t\t\t\t<center id=\"trackingNumber\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f46 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f46.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f12);
    // /WEB-INF/jsp/orders/reportOrders.jsp(495,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f46.setValue("#order.trackingNumber");
    int _jspx_eval_s_005fproperty_005f46 = _jspx_th_s_005fproperty_005f46.doStartTag();
    if (_jspx_th_s_005fproperty_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f46);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f4 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(500,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f4.setTest("showRowShipping!=0  && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f4 = _jspx_th_s_005felseif_005f4.doStartTag();
    if (_jspx_eval_s_005felseif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f6(_jspx_th_s_005felseif_005f4, _jspx_page_context))
          return true;
        out.write("<a id=\"saveTrackingNumber\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"editTrackingNumber\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f4);
    // /WEB-INF/jsp/orders/reportOrders.jsp(501,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setId("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(501,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setName("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(501,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setValue("%{trackingNumber}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(501,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setCssStyle("width:115px;");
    int _jspx_eval_s_005ftextfield_005f6 = _jspx_th_s_005ftextfield_005f6.doStartTag();
    if (_jspx_th_s_005ftextfield_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f6 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f6 = _jspx_th_s_005felse_005f6.doStartTag();
    if (_jspx_eval_s_005felse_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f47(_jspx_th_s_005felse_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f47 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f47.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f6);
    // /WEB-INF/jsp/orders/reportOrders.jsp(504,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f47.setValue("#order.trackingNumber");
    int _jspx_eval_s_005fproperty_005f47 = _jspx_th_s_005fproperty_005f47.doStartTag();
    if (_jspx_th_s_005fproperty_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f47);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f13 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(508,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f13.setTest("showRowShipping==0  && superAdmin!=null");
    int _jspx_eval_s_005fif_005f13 = _jspx_th_s_005fif_005f13.doStartTag();
    if (_jspx_eval_s_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f48(_jspx_th_s_005fif_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<a id=\"editShippingPrice\" href=\"#\" style=\"align:rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t<center id=\"saveShippingPrice\"></center>\n");
        out.write("\t\t\t\t\t<center id=\"shippingPriceToEdit\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f48 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f48.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f13);
    // /WEB-INF/jsp/orders/reportOrders.jsp(509,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f48.setValue("#order.shippingPrice");
    int _jspx_eval_s_005fproperty_005f48 = _jspx_th_s_005fproperty_005f48.doStartTag();
    if (_jspx_th_s_005fproperty_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f48);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f5 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(514,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f5.setTest("showRowShipping!=0  && superAdmin!=null");
    int _jspx_eval_s_005felseif_005f5 = _jspx_th_s_005felseif_005f5.doStartTag();
    if (_jspx_eval_s_005felseif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f7(_jspx_th_s_005felseif_005f5, _jspx_page_context))
          return true;
        out.write("<a id=\"saveShippingPrice\" href=\"#\" style=\"align:rigth;\"> Save</a><center id=\"editShippingPrice\"></center>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f5);
    // /WEB-INF/jsp/orders/reportOrders.jsp(515,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setId("shippingPriceToEdit");
    // /WEB-INF/jsp/orders/reportOrders.jsp(515,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setName("strShippingPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(515,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(515,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setCssStyle("width:60px;");
    int _jspx_eval_s_005ftextfield_005f7 = _jspx_th_s_005ftextfield_005f7.doStartTag();
    if (_jspx_th_s_005ftextfield_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f7 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f7 = _jspx_th_s_005felse_005f7.doStartTag();
    if (_jspx_eval_s_005felse_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f49(_jspx_th_s_005felse_005f7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f49 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f49.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f7);
    // /WEB-INF/jsp/orders/reportOrders.jsp(518,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f49.setValue("#order.shippingPrice");
    int _jspx_eval_s_005fproperty_005f49 = _jspx_th_s_005fproperty_005f49.doStartTag();
    if (_jspx_th_s_005fproperty_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f49);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f50 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f50.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(522,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f50.setValue("#order.billed");
    int _jspx_eval_s_005fproperty_005f50 = _jspx_th_s_005fproperty_005f50.doStartTag();
    if (_jspx_th_s_005fproperty_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f50);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f14 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f14.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(543,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f14.setTest("indexSet>10*PAGE_ITEMS_COUNT && listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f14 = _jspx_th_s_005fif_005f14.doStartTag();
    if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f14.doInitBody();
      }
      do {
        out.write("<!-- pagesNumber*resultRangeInDB -->\n");
        out.write("\t\t  <img id=\"imgPrevListPages\" src=\"images/orders/activePreviousPages.png\"/>\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f6 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f6.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(546,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f6.setTest("listOrdersDTO.size>0");
    int _jspx_eval_s_005felseif_005f6 = _jspx_th_s_005felseif_005f6.doStartTag();
    if (_jspx_eval_s_005felseif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t   <img src=\"images/orders/desablePreviousPages.png\"/>\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f3 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f3.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(550,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setValue("listIndexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(550,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setId("item");
    int _jspx_eval_s_005fiterator_005f3 = _jspx_th_s_005fiterator_005f3.doStartTag();
    if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  ");
        if (_jspx_meth_s_005fif_005f15(_jspx_th_s_005fiterator_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f15 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f3);
    // /WEB-INF/jsp/orders/reportOrders.jsp(551,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f15.setTest("listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f15 = _jspx_th_s_005fif_005f15.doStartTag();
    if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f15.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  <td id=\"pageIndex\" align=\"center\" style='font-size: 14px; width: 50px;cursor:pointer;font-weight: bold;color: rgb(44,140,171);");
        if (_jspx_meth_s_005fproperty_005f51(_jspx_th_s_005fif_005f15, _jspx_page_context))
          return true;
        out.write("'>\n");
        out.write("\t\t  ");
        if (_jspx_meth_s_005fhidden_005f93(_jspx_th_s_005fif_005f15, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  ");
        if (_jspx_meth_s_005fproperty_005f52(_jspx_th_s_005fif_005f15, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  </td>\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f51 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f51.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/orders/reportOrders.jsp(552,130) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f51.setValue("#item.cssStyle");
    int _jspx_eval_s_005fproperty_005f51 = _jspx_th_s_005fproperty_005f51.doStartTag();
    if (_jspx_th_s_005fproperty_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f51);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f93(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f93 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f93.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/orders/reportOrders.jsp(553,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setId("pageIndexHedden");
    // /WEB-INF/jsp/orders/reportOrders.jsp(553,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setName("pageIndexHedden");
    // /WEB-INF/jsp/orders/reportOrders.jsp(553,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setValue("%{#item.index}");
    int _jspx_eval_s_005fhidden_005f93 = _jspx_th_s_005fhidden_005f93.doStartTag();
    if (_jspx_th_s_005fhidden_005f93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f93);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f93);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f52 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f52.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/orders/reportOrders.jsp(554,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f52.setValue("#item.index");
    int _jspx_eval_s_005fproperty_005f52 = _jspx_th_s_005fproperty_005f52.doStartTag();
    if (_jspx_th_s_005fproperty_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f52);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f16 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f16.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(559,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f16.setTest("((nextListPages+10)*PAGE_ITEMS_COUNT>totalOrders)&& listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f16 = _jspx_th_s_005fif_005f16.doStartTag();
    if (_jspx_eval_s_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f16.doInitBody();
      }
      do {
        out.write("<!-- (nextListPages+pagesNumber)*resultRangeInDB -->\n");
        out.write("\t\t  <img  id=\"imgNextPages\"  src=\"images/orders/desableNextPages.png\"/>\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f7 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f7.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(562,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f7.setTest("listOrdersDTO.size>0");
    int _jspx_eval_s_005felseif_005f7 = _jspx_th_s_005felseif_005f7.doStartTag();
    if (_jspx_eval_s_005felseif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  <img id=\"imgNextPages\" src=\"images/orders/activeNextPages.png\"/>\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f53 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f53.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f53.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(65,56) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f53.setValue("%{showOrderDetailPop}");
    int _jspx_eval_s_005fproperty_005f53 = _jspx_th_s_005fproperty_005f53.doStartTag();
    if (_jspx_th_s_005fproperty_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f53);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f54 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f54.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f54.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(66,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f54.setValue("%{orderToEdit.lsOrderId}");
    int _jspx_eval_s_005fproperty_005f54 = _jspx_th_s_005fproperty_005f54.doStartTag();
    if (_jspx_th_s_005fproperty_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f54);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f55 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f55.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f55.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(69,72) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f55.setValue("%{orderToEdit.backgroundColor}");
    int _jspx_eval_s_005fproperty_005f55 = _jspx_th_s_005fproperty_005f55.doStartTag();
    if (_jspx_th_s_005fproperty_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f55);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f17 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f17.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(87,9) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f17.setTest("%{orderToEdit.userLogin.bytes.length > 30}");
    int _jspx_eval_s_005fif_005f17 = _jspx_th_s_005fif_005f17.doStartTag();
    if (_jspx_eval_s_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f17.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t    \t");
        if (_jspx_meth_s_005ftextfield_005f8(_jspx_th_s_005fif_005f17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f8 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f17);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setId("userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setName("orderToEdit.userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setValue("%{orderToEdit.userLogin}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f8 = _jspx_th_s_005ftextfield_005f8.doStartTag();
    if (_jspx_th_s_005ftextfield_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f8 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f8.setParent(null);
    int _jspx_eval_s_005felse_005f8 = _jspx_th_s_005felse_005f8.doStartTag();
    if (_jspx_eval_s_005felse_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f9(_jspx_th_s_005felse_005f8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f9 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f8);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setId("userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setName("orderToEdit.userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setValue("%{orderToEdit.userLogin}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f9 = _jspx_th_s_005ftextfield_005f9.doStartTag();
    if (_jspx_th_s_005ftextfield_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f2 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f2.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(95,9) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f2.setName("orderToEdit.creationDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(95,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f2.setVar("creationDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(95,9) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f2.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f2 = _jspx_th_s_005fdate_005f2.doStartTag();
    if (_jspx_th_s_005fdate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f18 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f18.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(97,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f18.setTest("%{orderToEdit.creationDate==null}");
    int _jspx_eval_s_005fif_005f18 = _jspx_th_s_005fif_005f18.doStartTag();
    if (_jspx_eval_s_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f18.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f10(_jspx_th_s_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f10 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f18);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setId("creationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setName("strCreationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setValue("%{#creationDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setCssStyle("width:100px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f10 = _jspx_th_s_005ftextfield_005f10.doStartTag();
    if (_jspx_th_s_005ftextfield_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f9 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f9.setParent(null);
    int _jspx_eval_s_005felse_005f9 = _jspx_th_s_005felse_005f9.doStartTag();
    if (_jspx_eval_s_005felse_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f11(_jspx_th_s_005felse_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f11 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f9);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setId("creationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setName("strCreationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setValue("%{#creationDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f11 = _jspx_th_s_005ftextfield_005f11.doStartTag();
    if (_jspx_th_s_005ftextfield_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f3 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f3.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(106,9) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f3.setName("orderToEdit.productOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(106,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f3.setVar("productOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(106,9) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f3.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f3 = _jspx_th_s_005fdate_005f3.doStartTag();
    if (_jspx_th_s_005fdate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f12 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f12.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setId("productOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setName("strProductOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setValue("%{#productOrderDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f12 = _jspx_th_s_005ftextfield_005f12.doStartTag();
    if (_jspx_th_s_005ftextfield_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f19 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f19.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(115,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f19.setTest("%{orderToEdit.productOrderNumber==null || orderToEdit.productOrderNumber==\"\"}");
    int _jspx_eval_s_005fif_005f19 = _jspx_th_s_005fif_005f19.doStartTag();
    if (_jspx_eval_s_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f19.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f13(_jspx_th_s_005fif_005f19, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f13 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f19);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setId("productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setName("orderToEdit.productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setValue("%{orderToEdit.productOrderNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f13 = _jspx_th_s_005ftextfield_005f13.doStartTag();
    if (_jspx_th_s_005ftextfield_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f10 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f10.setParent(null);
    int _jspx_eval_s_005felse_005f10 = _jspx_th_s_005felse_005f10.doStartTag();
    if (_jspx_eval_s_005felse_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f14(_jspx_th_s_005felse_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f14 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f10);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setId("productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setName("orderToEdit.productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setValue("%{orderToEdit.productOrderNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f14 = _jspx_th_s_005ftextfield_005f14.doStartTag();
    if (_jspx_th_s_005ftextfield_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f4 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f4.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(124,9) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f4.setName("orderToEdit.requiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(124,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f4.setVar("requiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(124,9) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f4.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f4 = _jspx_th_s_005fdate_005f4.doStartTag();
    if (_jspx_th_s_005fdate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f15 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f15.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setId("requiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setName("strRequiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setValue("%{#requiredDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f15 = _jspx_th_s_005ftextfield_005f15.doStartTag();
    if (_jspx_th_s_005ftextfield_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f20 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f20.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(138,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f20.setTest("%{orderToEdit.clientLastName==null || orderToEdit.clientLastName==\"\" || orderToEdit.clientLastName.bytes.length > 40 }");
    int _jspx_eval_s_005fif_005f20 = _jspx_th_s_005fif_005f20.doStartTag();
    if (_jspx_eval_s_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f20.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f16(_jspx_th_s_005fif_005f20, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f16 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f20);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setId("clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setName("orderToEdit.clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setValue("%{orderToEdit.clientLastName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f16 = _jspx_th_s_005ftextfield_005f16.doStartTag();
    if (_jspx_th_s_005ftextfield_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f11 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f11.setParent(null);
    int _jspx_eval_s_005felse_005f11 = _jspx_th_s_005felse_005f11.doStartTag();
    if (_jspx_eval_s_005felse_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f17(_jspx_th_s_005felse_005f11, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f17 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f11);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setId("clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setName("orderToEdit.clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setValue("%{orderToEdit.clientLastName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f17 = _jspx_th_s_005ftextfield_005f17.doStartTag();
    if (_jspx_th_s_005ftextfield_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f21 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f21.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(145,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f21.setTest("%{orderToEdit.clientFirstName==null || orderToEdit.clientFirstName==\"\" || orderToEdit.clientFirstName.bytes.length > 30}");
    int _jspx_eval_s_005fif_005f21 = _jspx_th_s_005fif_005f21.doStartTag();
    if (_jspx_eval_s_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f21.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t<font style=\"color: #484848;\">CLIENT FIRST NAME: </font>");
        if (_jspx_meth_s_005ftextfield_005f18(_jspx_th_s_005fif_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f18 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setId("clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setName("orderToEdit.clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setValue("%{orderToEdit.clientFirstName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f18 = _jspx_th_s_005ftextfield_005f18.doStartTag();
    if (_jspx_th_s_005ftextfield_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f12 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f12.setParent(null);
    int _jspx_eval_s_005felse_005f12 = _jspx_th_s_005felse_005f12.doStartTag();
    if (_jspx_eval_s_005felse_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t<font style=\"color: #484848;\">CLIENT FIRST NAME: </font>");
        if (_jspx_meth_s_005ftextfield_005f19(_jspx_th_s_005felse_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f19 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f12);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setId("clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setName("orderToEdit.clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setValue("%{orderToEdit.clientFirstName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f19 = _jspx_th_s_005ftextfield_005f19.doStartTag();
    if (_jspx_th_s_005ftextfield_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f20 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f20.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setId("clientOtherNames");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setName("orderToEdit.clientOtherNames");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setValue("%{orderToEdit.clientOtherNames}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f20 = _jspx_th_s_005ftextfield_005f20.doStartTag();
    if (_jspx_th_s_005ftextfield_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f22 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f22.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(165,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f22.setTest("%{orderToEdit.companyHeader!=null && orderToEdit.companyHeader.bytes.length > 40}");
    int _jspx_eval_s_005fif_005f22 = _jspx_th_s_005fif_005f22.doStartTag();
    if (_jspx_eval_s_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f22.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f21(_jspx_th_s_005fif_005f22, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f21 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f22);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setId("companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setName("orderToEdit.companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setValue("%{orderToEdit.companyHeader}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f21 = _jspx_th_s_005ftextfield_005f21.doStartTag();
    if (_jspx_th_s_005ftextfield_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f13 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f13.setParent(null);
    int _jspx_eval_s_005felse_005f13 = _jspx_th_s_005felse_005f13.doStartTag();
    if (_jspx_eval_s_005felse_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f22(_jspx_th_s_005felse_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f22 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f13);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setId("companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setName("orderToEdit.companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setValue("%{orderToEdit.companyHeader}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f22 = _jspx_th_s_005ftextfield_005f22.doStartTag();
    if (_jspx_th_s_005ftextfield_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f23 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f23.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(178,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f23.setTest("%{orderToEdit.clientStreet==null || orderToEdit.clientStreet==\"\" || orderToEdit.clientStreet.bytes.length > 44}");
    int _jspx_eval_s_005fif_005f23 = _jspx_th_s_005fif_005f23.doStartTag();
    if (_jspx_eval_s_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f23.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f23(_jspx_th_s_005fif_005f23, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f23 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f23);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setId("clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setName("orderToEdit.clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setValue("%{orderToEdit.clientStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setCssStyle("width:305px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f23 = _jspx_th_s_005ftextfield_005f23.doStartTag();
    if (_jspx_th_s_005ftextfield_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f14 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f14.setParent(null);
    int _jspx_eval_s_005felse_005f14 = _jspx_th_s_005felse_005f14.doStartTag();
    if (_jspx_eval_s_005felse_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f24(_jspx_th_s_005felse_005f14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f24 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f14);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setId("clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setName("orderToEdit.clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setValue("%{orderToEdit.clientStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setCssStyle("width:330px;color:black;");
    int _jspx_eval_s_005ftextfield_005f24 = _jspx_th_s_005ftextfield_005f24.doStartTag();
    if (_jspx_th_s_005ftextfield_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f24 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f24.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(192,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f24.setTest("%{orderToEdit.clientOtherStreet!=null && orderToEdit.clientOtherStreet.bytes.length > 44}");
    int _jspx_eval_s_005fif_005f24 = _jspx_th_s_005fif_005f24.doStartTag();
    if (_jspx_eval_s_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f24.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f25(_jspx_th_s_005fif_005f24, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f25 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f24);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setId("clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setName("orderToEdit.clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setValue("%{orderToEdit.clientOtherStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setCssStyle("width:330px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f25 = _jspx_th_s_005ftextfield_005f25.doStartTag();
    if (_jspx_th_s_005ftextfield_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f15 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f15.setParent(null);
    int _jspx_eval_s_005felse_005f15 = _jspx_th_s_005felse_005f15.doStartTag();
    if (_jspx_eval_s_005felse_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f15.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f26(_jspx_th_s_005felse_005f15, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f26 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f15);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setId("clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setName("orderToEdit.clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setValue("%{orderToEdit.clientOtherStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setCssStyle("width:330px;color:black;");
    int _jspx_eval_s_005ftextfield_005f26 = _jspx_th_s_005ftextfield_005f26.doStartTag();
    if (_jspx_th_s_005ftextfield_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f26);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f25 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f25.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(209,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f25.setTest("%{orderToEdit.clientProvince==null || orderToEdit.clientProvince==\"\"\n		 						   || orderToEdit.provinceNotFound==1}");
    int _jspx_eval_s_005fif_005f25 = _jspx_th_s_005fif_005f25.doStartTag();
    if (_jspx_eval_s_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f25.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005fselect_005f2(_jspx_th_s_005fif_005f25, _jspx_page_context))
          return true;
        out.write("\t\t\t        \n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f27(_jspx_th_s_005fif_005f25, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f2 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f25);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setId("provinceId");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setName("code");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setList("listProvinces");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = emptyOption type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setEmptyOption("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderKey("");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListKey("code");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListValue("name");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderValue("--Select--");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(211,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setCssStyle("width:153px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005fselect_005f2 = _jspx_th_s_005fselect_005f2.doStartTag();
    if (_jspx_th_s_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f27 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f25);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setId("clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setName("orderToEdit.clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setValue("%{orderToEdit.clientProvince}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setCssStyle("width:172px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f27 = _jspx_th_s_005ftextfield_005f27.doStartTag();
    if (_jspx_th_s_005ftextfield_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f27);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f16 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f16.setParent(null);
    int _jspx_eval_s_005felse_005f16 = _jspx_th_s_005felse_005f16.doStartTag();
    if (_jspx_eval_s_005felse_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f16.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005fselect_005f3(_jspx_th_s_005felse_005f16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f28(_jspx_th_s_005felse_005f16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f3 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f16);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setId("provinceId");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setName("code");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setList("listProvinces");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = emptyOption type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setEmptyOption("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setHeaderKey("");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setListKey("code");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setListValue("name");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setHeaderValue("--Select--");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(224,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setCssStyle("width:153px;color:black;");
    int _jspx_eval_s_005fselect_005f3 = _jspx_th_s_005fselect_005f3.doStartTag();
    if (_jspx_th_s_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f28 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f16);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setId("clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setName("orderToEdit.clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setValue("%{orderToEdit.clientProvince}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setCssStyle("width:172px;color:black;");
    int _jspx_eval_s_005ftextfield_005f28 = _jspx_th_s_005ftextfield_005f28.doStartTag();
    if (_jspx_th_s_005ftextfield_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f28);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f26 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f26.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(245,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f26.setTest("%{orderToEdit.clientCity==null || orderToEdit.clientCity==\"\" || orderToEdit.clientCity.bytes.length > 25}");
    int _jspx_eval_s_005fif_005f26 = _jspx_th_s_005fif_005f26.doStartTag();
    if (_jspx_eval_s_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f26.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f29(_jspx_th_s_005fif_005f26, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f26);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f29 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f26);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setId("clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setName("orderToEdit.clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setValue("%{orderToEdit.clientCity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f29 = _jspx_th_s_005ftextfield_005f29.doStartTag();
    if (_jspx_th_s_005ftextfield_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f29);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f17 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f17.setParent(null);
    int _jspx_eval_s_005felse_005f17 = _jspx_th_s_005felse_005f17.doStartTag();
    if (_jspx_eval_s_005felse_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f17.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f30(_jspx_th_s_005felse_005f17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f30 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f17);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setId("clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setName("orderToEdit.clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setValue("%{orderToEdit.clientCity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f30 = _jspx_th_s_005ftextfield_005f30.doStartTag();
    if (_jspx_th_s_005ftextfield_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f30);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f27 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f27.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(260,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f27.setTest("%{orderToEdit.clientPostalCode==null || orderToEdit.clientPostalCode==\"\"  || orderToEdit.clientPostalCode.bytes.length > 14}");
    int _jspx_eval_s_005fif_005f27 = _jspx_th_s_005fif_005f27.doStartTag();
    if (_jspx_eval_s_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f27.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f31(_jspx_th_s_005fif_005f27, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f27);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f31 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f27);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setId("clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setName("orderToEdit.clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setValue("%{orderToEdit.clientPostalCode}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f31 = _jspx_th_s_005ftextfield_005f31.doStartTag();
    if (_jspx_th_s_005ftextfield_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f31);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f18 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f18.setParent(null);
    int _jspx_eval_s_005felse_005f18 = _jspx_th_s_005felse_005f18.doStartTag();
    if (_jspx_eval_s_005felse_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f18.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f32(_jspx_th_s_005felse_005f18, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f32 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f18);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setId("clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setName("orderToEdit.clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setValue("%{orderToEdit.clientPostalCode}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f32 = _jspx_th_s_005ftextfield_005f32.doStartTag();
    if (_jspx_th_s_005ftextfield_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f32);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f28 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f28.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(274,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f28.setTest("%{orderToEdit.clientPostalCode!=null && orderToEdit.clientPhone.bytes.length > 25}");
    int _jspx_eval_s_005fif_005f28 = _jspx_th_s_005fif_005f28.doStartTag();
    if (_jspx_eval_s_005fif_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f28.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f33(_jspx_th_s_005fif_005f28, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f28);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f33 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f28);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setId("clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setName("orderToEdit.clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setValue("%{orderToEdit.clientPhone}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setCssStyle("width:150px;color:black;background-color:#FF6666;");
    int _jspx_eval_s_005ftextfield_005f33 = _jspx_th_s_005ftextfield_005f33.doStartTag();
    if (_jspx_th_s_005ftextfield_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f19 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f19.setParent(null);
    int _jspx_eval_s_005felse_005f19 = _jspx_th_s_005felse_005f19.doStartTag();
    if (_jspx_eval_s_005felse_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f19.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f34(_jspx_th_s_005felse_005f19, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f34 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f19);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setId("clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setName("orderToEdit.clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setValue("%{orderToEdit.clientPhone}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f34 = _jspx_th_s_005ftextfield_005f34.doStartTag();
    if (_jspx_th_s_005ftextfield_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f29 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f29.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(288,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f29.setTest("%{orderToEdit.clientEmail!=null && orderToEdit.clientEmail.bytes.length > 60}");
    int _jspx_eval_s_005fif_005f29 = _jspx_th_s_005fif_005f29.doStartTag();
    if (_jspx_eval_s_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f29.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f35(_jspx_th_s_005fif_005f29, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f29);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f35 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f29);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setId("clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setName("orderToEdit.clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setValue("%{orderToEdit.clientEmail}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setCssStyle("width:305px;color:black;background-color:#FF6666;");
    int _jspx_eval_s_005ftextfield_005f35 = _jspx_th_s_005ftextfield_005f35.doStartTag();
    if (_jspx_th_s_005ftextfield_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f20 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f20.setParent(null);
    int _jspx_eval_s_005felse_005f20 = _jspx_th_s_005felse_005f20.doStartTag();
    if (_jspx_eval_s_005felse_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f20.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f36(_jspx_th_s_005felse_005f20, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f36 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f20);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setId("clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setName("orderToEdit.clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setValue("%{orderToEdit.clientEmail}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f36 = _jspx_th_s_005ftextfield_005f36.doStartTag();
    if (_jspx_th_s_005ftextfield_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f36);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f4 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f4.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(320,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f4.setValue("orderToEdit.rowsList");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(320,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f4.setId("cell");
    int _jspx_eval_s_005fiterator_005f4 = _jspx_th_s_005fiterator_005f4.doStartTag();
    if (_jspx_eval_s_005fiterator_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t    <!-- Order Rows -->\n");
        out.write("\t\t\t    ");
        if (_jspx_meth_s_005fif_005f30(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t    ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f30 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(322,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f30.setTest("%{toDelete==0}");
    int _jspx_eval_s_005fif_005f30 = _jspx_th_s_005fif_005f30.doStartTag();
    if (_jspx_eval_s_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f30.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t    <tr valign=\"middle\" align=\"center\">\n");
        out.write("\t\t\t   \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;");
        if (_jspx_meth_s_005fproperty_005f56(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextfield_005f37(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    \t<td style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\" width=\"130px\">\n");
        out.write("\t\t  \t\t \t\t       <center id=\"userId\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f57(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t   \t\t \t\t       <center id=\"productId\"  style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f58(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"lsOrderId\"  style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f59(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"indexOrder\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f60(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"indexRow\"   style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f61(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <!-- .............. QUANTITY ............ -->\n");
        out.write("\t\t \t\t\t\t\t \n");
        out.write("\t\t  \t\t \t\t\t  <!--  ");
        if (_jspx_meth_s_005ftextfield_005f38(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write(" -->\n");
        out.write("\t\t  \t\t \t\t\t  <input type=\"text\" id=\"quantity\" name=\"quantity\" value='");
        if (_jspx_meth_s_005fproperty_005f62(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:40px;");
        if (_jspx_meth_s_005fproperty_005f63(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t\t  <font style=\"color: #484848;\">SP:</font>");
        if (_jspx_meth_s_005ftextfield_005f39(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t  \t\t    <td style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextfield_005f40(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t \t\n");
        out.write("\t \t\t\t \t<!-- .............. lsPrice and unitPrice ............ -->\n");
        out.write("\t \t\t\t \t");
        if (_jspx_meth_s_005fif_005f31(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\n");
        out.write("\t\t  \t\t \t<!-- .............. lsPrice and unitPrice with CUrrency ............ -->\n");
        out.write("\t\t  \t\t \t");
        if (_jspx_meth_s_005felse_005f21(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\n");
        out.write("\t\t  \t\t \t<td align=\"center\" width=\"60px\" style=\"border-right: 1px solid #CCCCCC;\"><span style=\"color:black;background-color: white;\">");
        if (_jspx_meth_s_005fproperty_005f71(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</span></td>      \n");
        out.write("\t\t  \t\t \t<td width=\"25px\"><img id=\"iconSaveTemporaryRow\" src='");
        if (_jspx_meth_s_005fproperty_005f72(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("'  style=\"cursor:pointer;\"/></td>\n");
        out.write("\t\t  \t\t \t<td width=\"25px\"><img id=\"iconSimilarRow\" src=\"images/orders/similarRow.png\"  style=\"cursor:pointer;\"/></td>\n");
        out.write("\t\t  \t\t    <td width=\"25px\" colspan=\"2\" style=\"border-right: 1px solid #CCCCCC;\"><img id=\"iconDeleteRow\" src=\"images/orders/deleteItem.png\" style=\"cursor:pointer;\"/></td>       \n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <!-- Heel of Order Rows -->\n");
        out.write("\t\t\t    <tr style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t    \t<td align=\"center\" colspan=\"3\"><span style=\"color: #484848;\"><font style=\"color: #484848;\">[Quantity Original: </font><font style=\"color: black;background-color:white;\">");
        if (_jspx_meth_s_005fproperty_005f73(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</font> ]</span></td>\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"2\"><font style=\"color: #484848;\">SHIPPING FEE:</font></td>\n");
        out.write("\t\t\t    \t");
        if (_jspx_meth_s_005fif_005f32(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t \t\t");
        if (_jspx_meth_s_005felse_005f22(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <tr style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t   \t\t<td align=\"center\" colspan=\"3\"><font style=\"color: #484848;\"><span style=\"color: #484848;\"><font style=\"color: #484848;\">[Provided_Ls_Product_ID: </font><font style=\"color: black;background-color:white;\">");
        if (_jspx_meth_s_005fproperty_005f75(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</font> ]</span></td>\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"2\"><font style=\"color: #484848;\">SHIPPING COMPANY:</font></td>\n");
        out.write("\t\t\t \t\t<td colspan=\"6\" align=\"left\">");
        if (_jspx_meth_s_005ftextfield_005f43(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <tr  style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"5\"  style=\"padding-bottom:10px;\"><font style=\"color: #484848;\">TRACKING NUMBER:</font></td>\n");
        out.write("\t\t\t \t\t<td colspan=\"6\" align=\"left\" style=\"padding-bottom:10px;\">");
        if (_jspx_meth_s_005ftextfield_005f44(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f30);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f56 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f56.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(324,82) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f56.setValue("#cell.css");
    int _jspx_eval_s_005fproperty_005f56 = _jspx_th_s_005fproperty_005f56.doStartTag();
    if (_jspx_th_s_005fproperty_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f56);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f37 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f37.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setId("lsProductID");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setName("lsProductID");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setValue("%{lsProductID}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setCssStyle("width:120px;margin-left:2px;color:black;");
    int _jspx_eval_s_005ftextfield_005f37 = _jspx_th_s_005ftextfield_005f37.doStartTag();
    if (_jspx_th_s_005ftextfield_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f37);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f57 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f57.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(328,76) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f57.setValue("%{orderToEdit.userId}");
    int _jspx_eval_s_005fproperty_005f57 = _jspx_th_s_005fproperty_005f57.doStartTag();
    if (_jspx_th_s_005fproperty_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f57);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f58 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f58.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(329,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f58.setValue("%{orderToEdit.productId}");
    int _jspx_eval_s_005fproperty_005f58 = _jspx_th_s_005fproperty_005f58.doStartTag();
    if (_jspx_th_s_005fproperty_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f58);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f59 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f59.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(330,80) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f59.setValue("%{orderToEdit.lsOrderId}");
    int _jspx_eval_s_005fproperty_005f59 = _jspx_th_s_005fproperty_005f59.doStartTag();
    if (_jspx_th_s_005fproperty_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f59);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f60 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f60.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(331,80) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f60.setValue("%{orderToEdit.index}");
    int _jspx_eval_s_005fproperty_005f60 = _jspx_th_s_005fproperty_005f60.doStartTag();
    if (_jspx_th_s_005fproperty_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f60);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f61 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f61.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(332,80) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f61.setValue("#cell.index");
    int _jspx_eval_s_005fproperty_005f61 = _jspx_th_s_005fproperty_005f61.doStartTag();
    if (_jspx_th_s_005fproperty_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f61);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f38 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f38.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setId("quantity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setName("quantity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setValue("%{quantity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setCssStyle("width:40px;");
    int _jspx_eval_s_005ftextfield_005f38 = _jspx_th_s_005ftextfield_005f38.doStartTag();
    if (_jspx_th_s_005ftextfield_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f38);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f62 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f62.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(336,68) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f62.setValue("%{quantity}");
    int _jspx_eval_s_005fproperty_005f62 = _jspx_th_s_005fproperty_005f62.doStartTag();
    if (_jspx_th_s_005fproperty_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f62);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f63 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f63.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(336,133) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f63.setValue("%{cssQuantity}");
    int _jspx_eval_s_005fproperty_005f63 = _jspx_th_s_005fproperty_005f63.doStartTag();
    if (_jspx_th_s_005fproperty_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f63);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f39 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f39.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setId("quantityToChange");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setName("quantityToSplit");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setValue("%{quantityToSplit}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setCssStyle("width:40px;color:black;");
    int _jspx_eval_s_005ftextfield_005f39 = _jspx_th_s_005ftextfield_005f39.doStartTag();
    if (_jspx_th_s_005ftextfield_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f39);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f40 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f40.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setId("stock");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setName("stock");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setValue("%{stock}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setCssStyle("width:70px;color:black;");
    int _jspx_eval_s_005ftextfield_005f40 = _jspx_th_s_005ftextfield_005f40.doStartTag();
    if (_jspx_th_s_005ftextfield_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f40);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(341,81) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setId("productDescription");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(341,81) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("productDescription");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(341,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setValue("%{productDescription}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(341,81) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCssStyle("width:200px;padding:0px; margin:0px; height:20px;color:black;");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f31 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(344,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f31.setTest("%{orderToEdit.currencyId == 1}");
    int _jspx_eval_s_005fif_005f31 = _jspx_th_s_005fif_005f31.doStartTag();
    if (_jspx_eval_s_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f31.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t \t\t\t \t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t  \t\t \t\t\t\t<span style=\"margin-left:2px;width:70px;background-color: white;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f64(_jspx_th_s_005fif_005f31, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t  \t\t \t\t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t\t  \t\t \t\t\t<input type=\"text\" id=\"unitPrice\" name=\"unitPrice\" value='");
        if (_jspx_meth_s_005fproperty_005f65(_jspx_th_s_005fif_005f31, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:70px;margin-left:2px;");
        if (_jspx_meth_s_005fproperty_005f66(_jspx_th_s_005fif_005f31, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f31);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f64 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f64.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f31);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(348,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f64.setValue("%{lsPrice}");
    int _jspx_eval_s_005fproperty_005f64 = _jspx_th_s_005fproperty_005f64.doStartTag();
    if (_jspx_th_s_005fproperty_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f64);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f65 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f65.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f31);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(353,68) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f65.setValue("%{unitPrice}");
    int _jspx_eval_s_005fproperty_005f65 = _jspx_th_s_005fproperty_005f65.doStartTag();
    if (_jspx_th_s_005fproperty_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f65);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f66 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f66.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f31);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(353,150) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f66.setValue("#cell.cssPrice");
    int _jspx_eval_s_005fproperty_005f66 = _jspx_th_s_005fproperty_005f66.doStartTag();
    if (_jspx_th_s_005fproperty_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f66);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f21 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    int _jspx_eval_s_005felse_005f21 = _jspx_th_s_005felse_005f21.doStartTag();
    if (_jspx_eval_s_005felse_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f21.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  \t\t \t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t  \t\t \t\t\t\t<span style=\"margin-left:2px;width:70px;background-color: white;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f67(_jspx_th_s_005felse_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t  \t\t \t\t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t\t  \t\t \t\t\t<input type=\"text\" id=\"unitPrice\" name=\"unitPrice\" value='");
        if (_jspx_meth_s_005fproperty_005f68(_jspx_th_s_005felse_005f21, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:70px;margin-left:2px;");
        if (_jspx_meth_s_005fproperty_005f69(_jspx_th_s_005felse_005f21, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t\t<td>\n");
        out.write("\t\t  \t\t \t\t\t<span style=\"margin-left:2px;width:40px;color: red;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f70(_jspx_th_s_005felse_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f67 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f67.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(362,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f67.setValue("%{currencyPrice}");
    int _jspx_eval_s_005fproperty_005f67 = _jspx_th_s_005fproperty_005f67.doStartTag();
    if (_jspx_th_s_005fproperty_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f67);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f68 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f68.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(367,68) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f68.setValue("%{currencyUnitPrice}");
    int _jspx_eval_s_005fproperty_005f68 = _jspx_th_s_005fproperty_005f68.doStartTag();
    if (_jspx_th_s_005fproperty_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f68);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f69 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f69.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(367,158) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f69.setValue("#cell.cssPrice");
    int _jspx_eval_s_005fproperty_005f69 = _jspx_th_s_005fproperty_005f69.doStartTag();
    if (_jspx_th_s_005fproperty_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f69);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f70(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f70 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f70.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(371,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f70.setValue("%{currencySymbol}");
    int _jspx_eval_s_005fproperty_005f70 = _jspx_th_s_005fproperty_005f70.doStartTag();
    if (_jspx_th_s_005fproperty_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f70);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f71(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f71 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f71.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(376,132) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f71.setValue("#cell.status");
    int _jspx_eval_s_005fproperty_005f71 = _jspx_th_s_005fproperty_005f71.doStartTag();
    if (_jspx_th_s_005fproperty_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f71);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f72(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f72 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f72.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(377,61) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f72.setValue("#cell.icon");
    int _jspx_eval_s_005fproperty_005f72 = _jspx_th_s_005fproperty_005f72.doStartTag();
    if (_jspx_th_s_005fproperty_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f72);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f73(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f73 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f73.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(383,177) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f73.setValue("#cell.quantityOriginal");
    int _jspx_eval_s_005fproperty_005f73 = _jspx_th_s_005fproperty_005f73.doStartTag();
    if (_jspx_th_s_005fproperty_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f73);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f32 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(385,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f32.setTest("%{orderToEdit.currencyId == 1}");
    int _jspx_eval_s_005fif_005f32 = _jspx_th_s_005fif_005f32.doStartTag();
    if (_jspx_eval_s_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f32.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t \t\t\t<td colspan=\"6\" align=\"left\">");
        if (_jspx_meth_s_005ftextfield_005f41(_jspx_th_s_005fif_005f32, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t \t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f32);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f41 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f41.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f32);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setId("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setName("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setCssStyle("color:black;width:70px;");
    int _jspx_eval_s_005ftextfield_005f41 = _jspx_th_s_005ftextfield_005f41.doStartTag();
    if (_jspx_th_s_005ftextfield_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f41);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f22 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    int _jspx_eval_s_005felse_005f22 = _jspx_th_s_005felse_005f22.doStartTag();
    if (_jspx_eval_s_005felse_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f22.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t \t\t\t<td colspan=\"6\" align=\"left\">\n");
        out.write("\t\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f42(_jspx_th_s_005felse_005f22, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t \t\t\t\t<span style=\"width:40px;color: red;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f74(_jspx_th_s_005felse_005f22, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t\t \t\t\t</td>\n");
        out.write("\t\t\t \t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f42 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f42.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f22);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setId("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setName("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setCssStyle("color:black;width:80px;");
    int _jspx_eval_s_005ftextfield_005f42 = _jspx_th_s_005ftextfield_005f42.doStartTag();
    if (_jspx_th_s_005ftextfield_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f42);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f74(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f74 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f74.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f22);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(392,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f74.setValue("%{currencySymbol}");
    int _jspx_eval_s_005fproperty_005f74 = _jspx_th_s_005fproperty_005f74.doStartTag();
    if (_jspx_th_s_005fproperty_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f74);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f75(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f75 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f75.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(398,212) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f75.setValue("#cell.providedLsProductId");
    int _jspx_eval_s_005fproperty_005f75 = _jspx_th_s_005fproperty_005f75.doStartTag();
    if (_jspx_th_s_005fproperty_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f75);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f43 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f43.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setId("shippingCompany");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setName("shippingCompany");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setValue("%{shippingCompany}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setCssStyle("color:black;width:180px;");
    int _jspx_eval_s_005ftextfield_005f43 = _jspx_th_s_005ftextfield_005f43.doStartTag();
    if (_jspx_th_s_005ftextfield_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f43);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f44 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f44.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setId("trackingNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setName("trackingNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setValue("%{trackingNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setCssStyle("color:black;width:180px;");
    int _jspx_eval_s_005ftextfield_005f44 = _jspx_th_s_005ftextfield_005f44.doStartTag();
    if (_jspx_th_s_005ftextfield_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f44);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f33 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f33.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(419,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f33.setTest("%{userPrivileges!=null}");
    int _jspx_eval_s_005fif_005f33 = _jspx_th_s_005fif_005f33.doStartTag();
    if (_jspx_eval_s_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f33.doInitBody();
      }
      do {
        out.write("\t   \n");
        out.write("\t\t\t\t<input id=\"btDeleteOrder\"  type=\"submit\" value=\"Delete this Order\"\n");
        out.write("\t\t\t\t   \t   style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color: #FF6666;color:white;font-weight: bold;\" />\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f76 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f76.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f76.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp(61,56) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f76.setValue("%{showSaveSuccessPop}");
    int _jspx_eval_s_005fproperty_005f76 = _jspx_th_s_005fproperty_005f76.doStartTag();
    if (_jspx_th_s_005fproperty_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f76);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f77 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f77.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f77.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp(72,39) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f77.setValue("%{message}");
    int _jspx_eval_s_005fproperty_005f77 = _jspx_th_s_005fproperty_005f77.doStartTag();
    if (_jspx_th_s_005fproperty_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f77);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f78 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f78.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f78.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/confirmDeleteOrderPop.jsp(61,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f78.setValue("%{showConfirmDeleteOrderPop}");
    int _jspx_eval_s_005fproperty_005f78 = _jspx_th_s_005fproperty_005f78.doStartTag();
    if (_jspx_th_s_005fproperty_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f78);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f79 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f79.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f79.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/confirmDeleteOrderPop.jsp(72,62) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f79.setValue("%{message}");
    int _jspx_eval_s_005fproperty_005f79 = _jspx_th_s_005fproperty_005f79.doStartTag();
    if (_jspx_th_s_005fproperty_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f79);
    return false;
  }
}
