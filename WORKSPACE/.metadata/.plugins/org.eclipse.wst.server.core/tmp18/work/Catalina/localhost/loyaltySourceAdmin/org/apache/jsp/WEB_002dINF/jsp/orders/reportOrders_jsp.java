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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody;
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
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.release();
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
      out.write("<link href=\"css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"thumbnailhover_files/jquery-latest.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"scripts/loyalty/order/orderManager.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#topMenuRed\").hide();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("label {\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".vanadium-advice {\n");
      out.write("\tmargin-left: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input.vanadium-valid {\n");
      out.write("\tbackground-image: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row_without_color {\n");
      out.write("\tbackground-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row_with_color {\n");
      out.write("\tbackground-color: rgb(245, 249, 252);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div id=\"divRoot\" class=\"unit\" style=\"width: 1500px; margin-left: 60px;\">\n");
      out.write("\t<div class=\"pop_title\" style=\"margin-top: 30px;\">Report Orders</div>\n");
      out.write("\n");
      out.write("\t<div id=\"formContainer\" style=\"padding-bottom: 60px;\">\n");
      out.write("\t\t<br />\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- FORM FOR DOWNLOAD PDF -->\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- FORM FOR DOWNLOAD Admin.xls -->\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- ............................. TABLE USER LOGIN START............................ -->\n");
      out.write("\t\t<table id=\"tabLogin\" width=\"100%\">\n");
      out.write("\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"7\" />\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- ....................Search Options.................... -->\n");
      out.write("\t\t\t<tr \n");
      out.write("\t\t\theight=\"60px\" style=\"border-left: \n");
      out.write("\t\t\t1px solid #CCCCCC; border-right: \n");
      out.write("\t\t\t1px solid #CCCCCC; \n");
      out.write("\t\t\tborder-top: 1px solid #CCCCCC;\n");
      out.write("\t\t\tborder-bottom: 1px solid #CCCCCC; \n");
      out.write("\t\t\tvertical-align: middle;\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- ...Login... -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...Login... -->\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- ...lsOrderId... -->\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005felse_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...lsOrderId... -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...Status... -->\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005felse_005f2(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n");
      out.write("\t\t\t\t<!-- ...Status... -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- ...Creation Date Start... -->\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px; width: 140px;\" valign=\"middle\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005felse_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px; width:172px;\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fdate_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<!-- ...Creation Date End... -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\">");
      if (_jspx_meth_s_005fdate_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<td style=\"padding-left: 5px;\"><img id=\"iconFindOrders\"\n");
      out.write("\t\t\t\t\tsrc=\"images/orders/findOrders.png\" />\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"7\" />\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- .................................................... -->\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<!-- ............................. TABLE USER LOGIN END............................ -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- ............................ List users .................................. -->\n");
      out.write("\t\t<select id=\"list\" style=\"visibility: hidden; display: none;\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</select>\n");
      out.write("\t\t<!-- .......................................................................... -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- .......... Operations: get XLS Canada Post, XLS, print Selected orders and print ALL ...... -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<table id=\"tabPrintAndXLS\">\n");
      out.write("\t\t\t<tr height=\"50px\" valign=\"middle\">\n");
      out.write("\t\t\t\t<td id=\"listOrderDTOSize\" width=\"110px\">Result/page:");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td width=\"105px\">Total:");
      if (_jspx_meth_s_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fhidden_005f103(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- ............................. Orders List ............................... -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<table id=\"tabOrderOrders\" width=\"5030px\" border=\"0\"\n");
      out.write("\t\t\tclass=\"nowraptable datatable\"\n");
      out.write("\t\t\tstyle=\"align: left; cursor: default; table-layout: fixed;\">\n");
      out.write("\t\t\t<thead class=\"gray_header\">\n");
      out.write("\t\t\t\t<tr height=\"30px\">\n");
      out.write("\t\t\t\t\t<td width=\"45px\"><img\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer; margin-left: 10px;\" id=\"imgSelectAllPO\"\n");
      out.write("\t\t\t\t\t\talt=\"\" src=\"images/orders/selectAllPO.png\" /></td>\n");
      out.write("\t\t\t\t\t<td width=\"20px\" style=\"padding-right: 10px;\"><img\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer; align: right;\" id=\"imgSort\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tsrc=\"images/orders/selectSommePO.png\" /></td>\n");
      out.write("\t\t\t\t\t<td width=\"135px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 5px; border-left: 1px solid white; border-right: 1px solid white;\">Partner\n");
      out.write("\t\t\t\t\t\tName<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"134px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 5px; border-left: 1px solid white; border-right: 1px solid white; visibility: hidden; display: none; padding-right: 10px;\">Row\n");
      out.write("\t\t\t\t\t\torder ID<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"220px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">LS\n");
      out.write("\t\t\t\t\t\tOrder ID<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"103px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">PO\n");
      out.write("\t\t\t\t\t\tDate<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Required\n");
      out.write("\t\t\t\t\t\tDate<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Status<img\n");
      out.write("\t\t\t\t\t\tid=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td style=\"visibility: hidden; display: none;\"><img\n");
      out.write("\t\t\t\t\t\tid=\"imgSort\" src=\"\" /></td>\n");
      out.write("\t\t\t\t\t<td width=\"130px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">LS\n");
      out.write("\t\t\t\t\t\tProduct ID<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"90px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Quantity<img\n");
      out.write("\t\t\t\t\t\tid=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"90px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">STOCK<img\n");
      out.write("\t\t\t\t\t\tid=\"imgSort\" src=\"images/orders/sortColumn.png\" align=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"180px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Product\n");
      out.write("\t\t\t\t\t\tTitle<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Unit\n");
      out.write("\t\t\t\t\t\tPrice<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">LS\n");
      out.write("\t\t\t\t\t\tPrice<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"132px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Unit\n");
      out.write("\t\t\t\t\t\tPrice Currency</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">LS\n");
      out.write("\t\t\t\t\t\tPrice Currency</td>\n");
      out.write("\t\t\t\t\t<td width=\"170px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Notes<img\n");
      out.write("\t\t\t\t\t\tid=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"120px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">PO\n");
      out.write("\t\t\t\t\t\tnumber<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"160px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tProduct number<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"110px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tOrder ID<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<td width=\"165px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tOther ID<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<td width=\"150px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tFirst Name<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"150px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tLast Name<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"130px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tOther Names<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"100px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tNumber<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"170px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tStreet<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"170px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tOther Address<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"100px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tCity<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"110px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tProvince<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"130px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tPostal Code<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"100px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tPhone<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"180px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Client\n");
      out.write("\t\t\t\t\t\tEmail<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"170px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Shipping\n");
      out.write("\t\t\t\t\t\tCompany<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"135px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Shipped\n");
      out.write("\t\t\t\t\t\tDate<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"170px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Tracking\n");
      out.write("\t\t\t\t\t\tNumber<img id=\"imgSort\" src=\"images/orders/sortColumn.png\"\n");
      out.write("\t\t\t\t\t\talign=\"right\"\n");
      out.write("\t\t\t\t\t\tstyle=\"vertical-align: middle; cursor: pointer; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"110px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Shipping\n");
      out.write("\t\t\t\t\t\tPrice<img id=\"imgSort\" src=\"\"\n");
      out.write("\t\t\t\t\t\tstyle=\"visibility: hidden; display: none; padding-right: 10px;\" />\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td width=\"95px\"\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 10px; border-right: 1px solid white;\">Billed</td>\n");
      out.write("\t\t\t\t\t<td style=\"background-color: white; border-right: 0px solid white;\">Billed</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- ........................Paging .......................  -->\n");
      out.write("\t\t<table align=\"center\" id=\"tabPageIndex\">\n");
      out.write("\t\t\t<tr height=\"20px\" valign=\"middle\" align=\"center\">\n");
      out.write("\t\t\t\t<td colspan=\"13\" />\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_s_005fif_005f17(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_s_005felseif_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_s_005fif_005f19(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_s_005felseif_005f7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<!-- ........................Paging .......................  -->\n");
      out.write("\n");
      out.write("\t\t<!-- ...........................jsp fragment ................................. -->\n");
      out.write("\t\t");
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
      if (_jspx_meth_s_005fif_005f20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    ");
      if (_jspx_meth_s_005felse_005f11(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f21(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005felse_005f12(_jspx_page_context))
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
      if (_jspx_meth_s_005ftextfield_005f15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t    </td>\n");
      out.write("\t\t\t\t\t    </tr>\n");
      out.write("\t\t\t\t\t    <tr height=\"20px\">\n");
      out.write("\t\t \t\t\t\t<td width=\"143px\"><font style=\"color: #484848;\">PO NUMBER:</font><font style=\"color:red;font-size: 15px;\"> *</font></td>   \n");
      out.write("\t\t \t\t\t\t<td>\n");
      out.write("\t\t \t\t\t\t<!-- ......... PRODUCT ORDER NUMBER ............ -->\n");
      out.write("\t\t \t\t\t\t");
      if (_jspx_meth_s_005fif_005f22(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t\t");
      if (_jspx_meth_s_005felse_005f13(_jspx_page_context))
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
      if (_jspx_meth_s_005ftextfield_005f18(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f23(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005fif_005f24(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f15(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t \t\t\t\t\n");
      out.write("\t\t \t\t\t</tr>\n");
      out.write("\t\t \t\t\t<tr height=\"20px\">\n");
      out.write("\t\t \t\t\t<td><font style=\"color: #484848;\">CLIENT OTHER NAMES:</font></td>\n");
      out.write("\t\t \t\t\t<td>");
      if (_jspx_meth_s_005ftextfield_005f23(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f25(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f16(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f17(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f27(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f18(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f28(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f19(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f29(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f20(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f30(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f21(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f31(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f22(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f32(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t \t\t\t");
      if (_jspx_meth_s_005felse_005f23(_jspx_page_context))
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
      if (_jspx_meth_s_005fif_005f36(_jspx_page_context))
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
      out.write('\n');
      out.write('	');
      out.write('	');
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
      out.write("\t\t<!-- ......................................................................... -->\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t\t// Jquery Function main \n");
      out.write("\t\t\tvar pageTop;\n");
      out.write("\t\t\tvar scrollTop;\n");
      out.write("\t\t\tvar scrollPageLeft;\n");
      out.write("\t\t\tvar scrollDivRowsTop;\n");
      out.write("\t\t\tvar balance = 0;\n");
      out.write("\t\t\tvar rowSelected = -1;\n");
      out.write("\t\t\tvar lastRowSelected = -1;\n");
      out.write("\t\t\tvar csslastRowSelected = \"\";\n");
      out.write("\n");
      out.write("\t\t\t/*----------------------------------- Keep page position --------------------------------- \n");
      out.write("\t\t\t keep page and div position \n");
      out.write("\t\t\t ----------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t $(function() {\n");
      out.write("\t\t\t\t\tvar pageTop = ");
      out.print( request.getParameter("pageTop") );
      out.write(";\n");
      out.write("\t\t\t\t\tscrollPageLeft = ");
      out.print( request.getParameter("scrollPageLeft") );
      out.write(";\n");
      out.write("\t\t\t\t\tscrollDivRowsTop = ");
      out.print( request.getParameter("scrollDivRowsTop") );
      out.write(";\n");
      out.write("\t\t\t\t\t$(window).scrollTop(pageTop);\n");
      out.write("\t\t\t\t\t$(window).scrollLeft(scrollPageLeft);\n");
      out.write("\t\t\t\t\t$(\"#divRowsOrder\").scrollTop(scrollDivRowsTop);\n");
      out.write("\t\t\t\t\t// winker image of infoMissing \n");
      out.write("\t\t\t\t\t$('#columnInfoNotCompleted img[id=\"infoMissingDiv\"]').effect(\"pulsate\", { times:999}, 2000);\n");
      out.write("\t\t\t\t\t// hide cities comboList in orderDetailPop \n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t/*------------------------------- Definition format date --------------------------------- \n");
      out.write("\t\t\t Definition of Format Date \n");
      out.write("\t\t\t ----------------------------------------------------------------------------------------*/\n");
      out.write("\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$(\"#creationDateStartPicker\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#creationDateEndPicker\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#requiredDatePicker\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#saveShippedDatePicker\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$(\"#creationOrderDate\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#requiredDate\").datepicker({\n");
      out.write("\t\t\t\t\tdateFormat : 'dd/mm/yy',\n");
      out.write("\t\t\t\t\tchangeMonth : true,\n");
      out.write("\t\t\t\t\tchangeYear : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(document)\n");
      out.write("\t\t\t\t\t.ready(\n");
      out.write("\t\t\t\t\t\t\tfunction() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------- check checkBox without submit -------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t\tPour éviter d'aller à chaque changement du check box on utilise un string qui porte\n");
      out.write("\t\t\t\t\t\t\t\t\tles valeurs de tous les check Box et une fois on click sur le un bouton de print ou\n");
      out.write("\t\t\t\t\t\t\t\t\tgetXSL on envoie juste cette string, c'est une méthode intelligente pour soulager \n");
      out.write("\t\t\t\t\t\t\t\t\tle server et pour éviter les secousse de barre de défilement\n");
      out.write("\t\t\t\t\t\t\t\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\tvar arrayPrint = [];\n");
      out.write("\t\t\t\t\t\t\t\tvar sizeResult = $(\"#sizeResult\").val();\n");
      out.write("\t\t\t\t\t\t\t\tfor (i = 0; i < sizeResult; i++) {\n");
      out.write("\t\t\t\t\t\t\t\t\tarrayPrint[i] = false;\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\tfunction createStrPrint() {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar index = 0;\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.each(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tarrayPrint[index] = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis).attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'checked');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex++;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\tvar strPrint = \"\";\n");
      out.write("\t\t\t\t\t\t\t\t\tfor (i = 0; i < arrayPrint.length; i++) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (arrayPrint[i] == 'checked') {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstrPrint += i + \";t,\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstrPrint += i + \";f,\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t;\n");
      out.write("\t\t\t\t\t\t\t\t\tif (strPrint.length > 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstrPrint = strPrint.substring(0,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstrPrint.length - 1);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#strPrintInPDFForm').val(strPrint);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#strPrintInAdminXLS').val(strPrint);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------- Disabled Enter and BackSpace ----------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t \t\t\t\t\tThis method is very imported for disable \n");
      out.write("\t\t\t\t\t\t\t\t \t\t\t\tundesirable behavior of BackSpace and Enter Key \n");
      out.write("\t\t\t\t\t\t\t\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(document)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.keydown(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction(e) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (e.keyCode == 8\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| e.keyCode == 13\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| e.keyCode == 32) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (e.target.tagName != \"INPUT\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- ToolTip ------------------------------------------ \n");
      out.write("\t\t\t\t\t\t\t\t \t\t\twhen Admin mouve the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t\t\t\t\t\t\t\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconDeleteRow,#iconSimilarRow,#iconSaveTemporaryRow,#quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexDelete = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop   #iconDeleteRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexSimilar = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop  #iconSimilarRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexValidate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconSaveTemporaryRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexQuantitySplit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar showPop = 0;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexDelete >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconDeleteRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(indexDelete)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Delete before Saving\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexSimilar >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconSimilarRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexSimilar)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Add Product\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexValidate >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconSaveTemporaryRow')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexValidate)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Validate Modification before Saving\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexQuantitySplit >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexQuantitySplit)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Enter a valid amount for Duplication\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar height = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #toolTipPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #toolTipPop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css('top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #toolTipPop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css('left', x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (showPop == 1) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #toolTipPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\"display\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #toolTipPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin out the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #iconDeleteRow,#iconSimilarRow,#iconSaveTemporaryRow,#quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipPop').css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipPop').css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- ToolTipReport ------------------------------------ \n");
      out.write("\t\t\t\t\t\t\t\t \t\t\twhen Admin mouve the mouse on icons of the :\"reportOrders.jsp\"  \n");
      out.write("\t\t\t\t\t\t\t\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexAdminXLSEST = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS   #imgGetAdminXLSEST')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexAdminXLS = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS  #imgGetAdminXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexPrintOrders = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgPrintOrders')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexPrintAllOrders = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgPrintAllOrders')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexInvoicedXLS = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetInvoicedXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar showPop = 0;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexAdminXLSEST >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetAdminXLSEST')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexAdminXLSEST)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Select first Orders to get Canada Post CSV File\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexAdminXLS >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetAdminXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexAdminXLS)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Get XLS File List\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexPrintOrders >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgPrintOrders')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexPrintOrders)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Select first Orders to print\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexPrintAllOrders >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgPrintAllOrders')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexPrintAllOrders)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Print All Orders List \");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (indexInvoicedXLS >= 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetInvoicedXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexInvoicedXLS)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Select first Orders and Partner Name to get Invoiced Orders List\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar height = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'left', x + 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (showPop == 1) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\"display\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin out the mouse on Item icons of the popup:\"orderDetailPop\" \n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- ToolTipReport:icone Print -------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t \t\t\twhen Admin mouve the mouse on icon print of the :\"reportOrders.jsp\"  \n");
      out.write("\t\t\t\t\t\t\t\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders #imgSort,#imgSelectAllPO')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSort')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar showPop = 0;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSort')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Select All Orders In This Page\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar selectAllPO = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSelectAllPO')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (selectAllPO == 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tposition = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSelectAllPO')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop #message')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"Select All Orders\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshowPop = 1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar height = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'left', x + 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (showPop == 1) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\"display\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin move the mouse out the icon print of the popup:\"orderDetailPop\" \n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders #imgSort,#imgSelectAllPO')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSort')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\"display\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar selectAllPO = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #imgSelectAllPO')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (selectAllPO == 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\"display\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"visibility\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- ToolTipReport:Date Between -------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t \t  when Admin mouve the mouse on the sentence \"Shipped Date between\" or \"PO Date between\"  \n");
      out.write("\t\t\t\t\t\t\t\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#factorDateBetweenId').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $('#factorDateBetweenId').position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop #message').text(\"Click to toggle between PO Date and Sipped Date\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar height = $('#toolTipReportPop').height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $('#toolTipReportPop').width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('left', x + 30);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\t\"visibility\",\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin move the mouse out the sentence \"Shipped Date between\" or \"PO Date between\" \n");
      out.write("\t\t\t\t\t\t\t\t$('#factorDateBetweenId').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"visibility\", \"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t/*------------------------------------- ToolTipReport:Client Login And PO Number -------------------------------- \n");
      out.write("\t\t\t\t\t\t\t \t  when Admin mouve the mouse on the sentence \"Client Login\" or \"PO Number\"  \n");
      out.write("\t\t\t\t\t\t\t------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t$('#toggleBetweenLoginAndPONumber').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar position = $('#toggleBetweenLoginAndPONumber').position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop #message').text(\"Click to toggle between Login And PO Number\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar height = $('#toolTipReportPop').height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $('#toolTipReportPop').width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('left', x + 81);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\t\"visibility\",\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t//when Admin move the mouse out the sentence \"Shipped Date between\" or \"PO Date between\" \n");
      out.write(" \t\t\t\t\t\t\t$('#toggleBetweenLoginAndPONumber').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"visibility\", \"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t/*------------------------------------- ToolTipReport:Ls Order And Client Order Id -------------------------------- \n");
      out.write("\t\t\t\t\t\t \t  when Admin mouve the mouse on the sentence \"Ls Order\" And \"Client Order Id\"  \n");
      out.write("\t\t\t\t\t\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t$('#toggleBetweenlsOrderIdAndclientOrderId').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar position = $('#toggleBetweenlsOrderIdAndclientOrderId').position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop #message').text(\"Click to toggle between Ls Order And Client Order Id\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar height = $('#toolTipReportPop').height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $('#toolTipReportPop').width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('left', x + 30);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\t\"visibility\",\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t//when Admin move the mouse out the sentence \"Ls Order\" And \"Client Order Id\" \n");
      out.write("\t\t\t\t\t\t$('#toggleBetweenlsOrderIdAndclientOrderId').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"visibility\", \"hidden\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t/*------------------------------------- ToolTipReport:Status and Client Other Id -------------------------------- \n");
      out.write("\t\t\t\t\t \t  when Admin mouve the mouse on the sentence \"Status\" or \"Client Other Id\"  \n");
      out.write("\t\t\t\t\t  ------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t$('#toggleBetweenStatusAndclientOtherId').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar position = $('#toggleBetweenStatusAndclientOtherId').position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop #message').text(\"Click to toggle between Status and Client Other Id\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar height = $('#toolTipReportPop').height();\n");
      out.write("\t\t\t\t\t\t\t\t\t\ty = (y - height);\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar toolTipWidth = $('#toolTipReportPop').width();\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttoolTipWidth = toolTipWidth / 2;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tx = x - toolTipWidth;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('top', y - 5);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#toolTipReportPop\").css('left', x + 30);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\t\"visibility\",\"visible\");\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t//when Admin move the mouse out the sentence \"Status\" or \"Client Other Id\" \n");
      out.write("\t\t\t\t\t$('#toggleBetweenStatusAndclientOtherId').mouseout(\n");
      out.write("\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t$('#toolTipReportPop').css(\"visibility\", \"hidden\");\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------------- Delete Order --------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \t\t\tDelete Order using confirmation popup \n");
      out.write("\t\t\t\t\t\t\t\t  ---------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on the button \"Delete\" of OrdersDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t$('#orderDetailPop #btDeleteOrder')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\trecoveryDataOrder();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#deleteOrderSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin Confirm to delete Order(delete Order) \n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #confirmDeleteOrderPop #btDeleteOrderCFM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\trecoveryDataOrder();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#deleteOrderSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#confirmDeleteSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin Cancel to delete Order(cancel delete) \n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #confirmDeleteOrderPop #btCancelCFM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\trecoveryDataOrder();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#deleteOrderSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#confirmDeleteSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(2);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------ Edit in the page reportOrder.jsp ---------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t   Update shipping parameters \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//When Admin click on  link \"Edit\", show shipping param in text field \n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editShippingCompany,#editTrackingNumber,#editShippedDate,#editShippingPrice,#statusToEdit')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #statusToEdit')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editShippingCompany')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editTrackingNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editShippedDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editShippingPrice')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrderToEdit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #columnIndexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrderToEdit);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollLeft();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#scrollPageLeft\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#showRowShippingFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//When Admin click on  link \"Edit Note\", show only Note text field \n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders #editNotes')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #editNotes')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrderToEdit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #columnIndexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrderToEdit);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollLeft();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#scrollPageLeft\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#showRowShippingFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(0);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#showOnlyEditNoteFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on any button \"Save\"\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders #saveNotes')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveNotes')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrderToEdit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #columnIndexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar notes = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #notes\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#notesFRM\").val(notes);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrderToEdit);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollLeft();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#scrollPageLeft\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#saveShippingSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(0);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#saveOnlyNoteSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on any button \"Save\"\n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveShippingCompany,#saveTrackingNumber,#saveShippedDate,#saveShippingPrice,#saveStatus')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveShippingPrice')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar statusId = -1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveShippingCompany')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveTrackingNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveShippedDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveStatus')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstatusId = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #statusId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrderToEdit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #columnIndexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar notes = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #notes\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shippingCompany = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #shippingCompany\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar trackingNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #trackingNumber\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shppedDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #saveShippedDatePicker')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar strShippingPrice = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #shippingPriceToEdit')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery status from list Box \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar status = parseInt(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstatusId, 10);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tswitch (status) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcase 0:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"open\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcase 1:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"progress\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcase 2:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"shipped\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcase 3:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"invoiced\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcase 4:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"canceled\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdefault:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#newStatusFRM').val(\"\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#strShippingPriceFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstrShippingPrice);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#strShippedDateFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshppedDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#notesFRM\").val(notes);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#shippingCompanyFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tshippingCompany);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#trackingNumberFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttrackingNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrderToEdit);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollLeft();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#scrollPageLeft\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#saveShippingSignal\").val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*---------------------------------------- Color Row -----------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin selected Row, colored it in yellow\n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders tr[id=\"rowOrder\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (lastRowSelected > -1) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders tr[id=\"rowOrder\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlastRowSelected)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"background-color\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcsslastRowSelected);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\trowSelected = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders tr[id=\"rowOrder\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcsslastRowSelected = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders tr[id=\"rowOrder\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(rowSelected)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"background-color\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tlastRowSelected = rowSelected;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders tr[id=\"rowOrder\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(rowSelected)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"background-color\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#FFFF99\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*--------------------------------------- Hide Popup Saving  --------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin click on the button OK of SaveSuccessPop: we just hide popups\n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#saveSuccessPop #btOK').click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#okSaveSuccessPopSignal\").val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*--------------------------- Select Order From Table in ReportOrder -------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t When Admin click on the lsOrderId link in the Table \n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders #columnRowOrderId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #columnRowOrderId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrderToEdit = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderOrders #columnIndexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrderToEdit);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#editOrderSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*---------------------------------- Close OrderDetailPop -----------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t        when Admin click on the button [cancel] of popup dialog of OrderDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#orderDetailPop #btCancel\").click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#cancelSignal\").val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------- orderDetailPop in the first backgound ----------------------- \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tKeep always orderDetailPop on the first backgound\n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve orderDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t$('#orderDetailPop').mousemove(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#orderDetailPop').css('z-index', 600);\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on orderDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t$('#orderDetailPop').mousedown(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#orderDetailPop').css('z-index', 600);\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*---------------------------------- Change Provine ----------------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   when Admin change province in comboList\n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#orderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.change(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*---------------------------------- Left lsProductID textfield ------------------------------ \n");
      out.write("\t\t\t\t\t\t\t\t\t\tWhen Admin changed lsProductID textfield, shearch all information of this product\n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.blur(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexRow = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userId = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #userId\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar lsProductID = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexOrder \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexRow \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean userId \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tuserId = userId.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/^\\s\\s*/, '');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tuserId = userId.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/\\s\\s*$/, '');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tuserId = userId.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g, '-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#companyHeaderFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#lsProductIDFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlsProductID);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#userIdFRM\").val(userId);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexRow').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#checkProductPriceSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------- Show icon validate in red color -------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t\twhen Admin change Data row in Retail Popup, \n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t\tchange image:iconSaveTemporaryRow to itemNotValidated.png \n");
      out.write("\t\t\t\t\t\t\t\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID,#quantity,#quantityToChange,#stock,#productDescription,#unitPrice,#shippingFee,#shippingCompany,#trackingNumber\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.change(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #quantity\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #stock\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #productDescription\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingFee\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingCompany\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #trackingNumber\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #unitPrice\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index < 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #quantityToChange\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index >= 0)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #iconSaveTemporaryRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\"src\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"images/orders/itemNotValidated.png\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*--------------------------------- Save TemporaryRow -------------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t             when Admin click on the the iconSaveTemporaryRow of orderDetail Popup \n");
      out.write("\t\t\t\t\t\t\t\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#orderDetailPop #iconSaveTemporaryRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #iconSaveTemporaryRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexRow = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexOrder \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexRow \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexRow').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Row Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar quantity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #quantity\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar lsProductID = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar stock = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #stock\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productDescription = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #productDescription\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar unitPrice = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #unitPrice\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shippingFee = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingFee\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shippingCompany = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingCompany\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar trackingNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #trackingNumber\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #companyHeader\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#quantityFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tquantity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#lsProductIDFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlsProductID);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#productDescriptionFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductDescription);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#unitPriceFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tunitPrice);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#shippingFeeFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tshippingFee);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#shippingCompanyFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tshippingCompany);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#companyHeaderFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#trackingNumberFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(trackingNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#saveTemporaryRowSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*-------------------------------------- Add Similar Row -------------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   When Admin click on the the iconSimilarRow of OrderDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#orderDetailPop #iconSimilarRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #iconSimilarRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexRow = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexOrder \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexRow \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexRow').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar quantity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #quantity\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar lsProductID = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #lsProductID\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar stock = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #stock\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productDescription = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #productDescription\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar unitPrice = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #unitPrice\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shippingFee = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingFee\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar shippingCompany = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #shippingCompany\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar trackingNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #trackingNumber\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#tabOrderDetailPop #companyHeader\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#quantityFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tquantity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#lsProductIDFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlsProductID);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#productDescriptionFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductDescription);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#unitPriceFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tunitPrice);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#shippingFeeFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tshippingFee);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#shippingCompanyFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tshippingCompany);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#companyHeaderFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#trackingNumberFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(trackingNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#addSimilarRowSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*-------------------------------- Delete Row From Memory -----------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t when Admin click on the icon iconDeleteRow of orderDetailPop \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#orderDetailPop #iconDeleteRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #iconDeleteRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexRow = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexOrder \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexRow \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#companyHeaderFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #indexRow').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#deleteRowSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- Save Order In Data Base ------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin click on the button save of orderDetail Popup \n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#btSave\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderRowsDetailPop #indexOrder')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#indexOrder').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//$('#lsOrderIdFRM').val(lsOrderId);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#companyHeaderFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#saveOrdersSignal').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*-------------------------------- Change value of quantity Splited --------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin left input text quantityToChange of orderDetail \n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#orderDetailPop #quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.change(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexRow = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexRow\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar quantityToChange = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop #quantityToChange')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean quantityToChange \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tquantityToChange = quantityToChange\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tquantityToChange = quantityToChange\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tquantityToChange = quantityToChange\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexOrder \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder = indexOrder\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//clean indexRow \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/^\\s\\s*/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(/\\s\\s*$/,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow = indexRow\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.replace(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/([\\s]+)/g,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'-');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#companyHeaderFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#form #quantityToChangeSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#form #indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#form #indexRow\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexRow);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#quantityToChangeFRM\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tquantityToChange);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------- Duplicate Order --------------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWhen Admin click on the icon duplicate \n");
      out.write("\t\t\t\t\t\t\t\t  --------------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#btDuplicate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar indexOrder = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#orderDetailPop #indexOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(0).text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//keep position of detail popup \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar position = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#orderDetailPop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.position();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar y = position.top;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar x = position.left;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poYpop').val(y);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#poXpop').val(x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//recovery data Order \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#companyHeaderFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcompanyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#indexOrder\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindexOrder);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//sarch parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#duplicateOrderSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------- Download File XLS and CSV ---------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t        Download File XLS and CSV \n");
      out.write("\t\t\t\t\t\t\t\t  -----------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve mouse on getXLS image \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').mouseover(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').attr(\"width\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').attr(\"higth\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').mouseout(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').attr(\"width\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').attr(\"higth\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve mouse on imgGetAdminXLSEST image \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//Download File XLS:When Admin click on the Button imgGetAdminXLS \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLS').click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#reportOrderPageSignal\").val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#selectedOrdersListSignal\").val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#generateESTFileSignal\").val(\"0\");\n");
      out.write("\t\t\t\t\t\t\t\t\tscrollTop = $(window).scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\tcreateStrPrint();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#formOrdersAdminXLS').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//Download File XLS:When Admin click on the Button imgGetInvoicedXLS \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#reportOrderPageSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#selectedOrdersListSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\"3\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tscrollTop = $(window)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#pageTop\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar selectedStatus = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#selectedStatus\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmSelectedStatus\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(selectedStatus);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcreateStrPrint();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#formOrdersAdminXLS')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//Download File XLS For Canada Post:When Admin click on the Button imgGetAdminXLSEST \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetAdminXLSEST').click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#reportOrderPageSignal\").val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#generateESTFileSignal\").val(\"1\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#selectedOrdersListSignal\").val(\"2\");\n");
      out.write("\t\t\t\t\t\t\t\t\tscrollTop = $(window).scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t\t\t\t\t\t\t\tcreateStrPrint();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#formOrdersAdminXLS').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*-------------------------------------- Orders Sorting ------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin click on the icon imgSort\n");
      out.write("\t\t\t\t\t\t\t\t  ------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders img[id=\"imgSort\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders img[id=\"imgSort\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//alert(index);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (index != 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twindow)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollLeft();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#scrollPageLeft\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollPageLeft);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#divRowsOrder\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.scrollTop();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#scrollDivRowsTop')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscrollDivRowsTop);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (index != 30\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& index != 31\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& index != 32) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders td')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex + 1)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"background-color\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"red\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders td')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex + 3)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.css(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"background-color\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"red\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#fieldForSorting')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(index);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t//search parameters \t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#sortingOrdersSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form').trigger(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar checkValues = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('checked');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar checkDisableValues = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'disabled');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (checkDisableValues)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (checkValues) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'checked',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'checked',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttrue);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreateStrPrint();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------------- Orders Select All ------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twhen Admin click on the icon imgSort\n");
      out.write("\t\t\t\t\t\t\t\t  ------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#tabOrderOrders img[id=\"imgSelectAllPO\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders img[id=\"imgSelectAllPO\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar checkValues = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabOrderOrders input[id=\"checkBoxItem\"]')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('checked');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//alert(\"checkValues:\"+checkValues);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form #checkBoxItem')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(!checkValues);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//alert($('#form #checkBoxItem').val());\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#selectAllOrdersSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------------- Make divRowsOrder's cursor in default -----------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    When Admin mouve mouse on divRowsOrder \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$('#divRowsOrder').mousemove(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#divRowsOrder\").css('cursor',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'default');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*-------------------------------------- Find Orders ----------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t When Admin click on the icon findOrders.png \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#iconFindOrders\").click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#findOrdersSignal\").val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------- Switching between \"PO Date\" and \"Shipped Date\" --------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t When Admin click sentens \"PO Date\" or \"Shipped Date\" in Search Options \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#factorDateBetweenId\").click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#dateBetweenSignal\").val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------ Print Orders -----------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t     \t\t Select and print Orders  \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve mouse on printSelected image \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgPrintOrders').mouseover(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgPrintOrders').attr(\"width\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgPrintOrders').attr(\"higth\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t$('#imgPrintOrders').mouseout(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgPrintOrders').attr(\"width\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#imgPrintOrders').attr(\"higth\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve mouse on printAll image \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgPrintAllOrders').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin mouve mouse on printAll image \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').mouseover(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"40\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').mouseout(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"width\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#imgGetInvoicedXLS').attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"higth\", \"32\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on the button Print \n");
      out.write("\t\t\t\t\t\t\t\t$('#imgPrintOrders').click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#tansformReportSignal').val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\tcreateStrPrint();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#formToPrint').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t//horloge();\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------------ Pagination -------------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\tWhen Admin click on pageIndex, cach pageIndex and search Orders with in dataBase  \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on a number page \n");
      out.write("\t\t\t\t\t\t\t\t$('#tabPageIndex #pageIndex')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar index = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPageIndex #pageIndex')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.index(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar pageIndexHedden = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#tabPageIndex #pageIndexHedden')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.eq(index).val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//search parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#indexSet').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpageIndexHedden);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#indexList').val(index);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#pageIndexSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t//when Admin click on a imge nextPages \n");
      out.write("\t\t\t\t\t\t\t\t$('#tabPageIndex #imgNextPages')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//Search Parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#txtUserLoginTo\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar strCreationDateStart = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#creationDateStartPicker\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar strCreationDateEnd = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#creationDateEndPicker\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tuserLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar selectedStatus = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#selectedStatus\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar lsOrderId = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#lsOrderIdSearch\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#lsOrderIdFRM\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlsOrderId);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmSelectedStatus\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(selectedStatus);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#frmStrCreationDateStart\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstrCreationDateStart);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmStrCreationDateEnd\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstrCreationDateEnd);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#indexList').val(0);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#nextListPagesSignal')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t//when Admin click on a imge imgPrevListPages \n");
      out.write("\t\t\t\t\t\t\t\t$('#tabPageIndex #imgPrevListPages').click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//Search Parameters \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar userLogin = $(\"#txtUserLoginTo\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar strCreationDateStart = $(\"#creationDateStartPicker\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar strCreationDateEnd = $(\"#creationDateEndPicker\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(userLogin);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar selectedStatus = $(\"#selectedStatus\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar lsOrderId = $(\"#lsOrderIdSearch\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#lsOrderIdFRM\").val(lsOrderId);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmStrCreationDateStart\").val(strCreationDateStart);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#frmStrCreationDateEnd\").val(strCreationDateEnd);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#indexList').val(0);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#prevListPagesSignal').val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------- Function:recoveryDataOrder --------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t     \t\t Function to recovery Data Order  \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\tfunction recoveryDataOrder() {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar code = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #provinceId')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#codeFRM').val(code);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientLastName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientLastName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientFirstName = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientFirstName')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientOtherNames = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherNames')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientOtherStreet = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientOtherStreet')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientCity = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientCity')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientProvince = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientProvince')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientPostalCode = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPostalCode')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientPhone = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientPhone')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientEmail = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #clientEmail')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar productOrderNumber = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #productOrderNumber')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar creationDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar requiredDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #requiredDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar creationOrderDate = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #creationOrderDate')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\tvar companyHeader = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'#tabOrderDetailPop #companyHeader')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#productOrderNumberFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tproductOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#creationDateFRM').val(creationDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#requiredDateFRM').val(requiredDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#creationOrderDateFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcreationOrderDate);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientLastNameFRM').val(clientLastName);\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientFirstNameFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclientFirstName);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientOtherNamesFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclientOtherNames);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#companyHeader').val(companyHeader);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientStreetFRM').val(clientStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientOtherStreetFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclientOtherStreet);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientCityFRM').val(clientCity);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientProvinceFRM').val(clientProvince);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientPostalCodeFRM').val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclientPostalCode);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientPhoneFRM').val(clientPhone);\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#clientEmailFRM').val(clientEmail);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------- Switching between \"Client Login\" and \"PO Number\" --------------------\n");
      out.write("\t\t\t\t\t\t\t\t When Admin click sentens \"PO Number\" or \"Client Login\" in Search Options \n");
      out.write("\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#toggleBetweenLoginAndPONumber\").click(\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#switchBetweenClientLoginAndPoNumberSignal\").val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------- Switching between \"ls_Order\" and \"Client Order Id\" --------------------\n");
      out.write("\t\t\t\t\t\t\t\t When Admin click sentens \"ls_Order\" or \"Client Order Id\" in Search Options \n");
      out.write("\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#toggleBetweenlsOrderIdAndclientOrderId\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#switchBetweenLsOrderAndClientOrderIdSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*----------------------- Switching between \"Status\" and \"Client Other Id\" --------------------\n");
      out.write("\t\t\t\t\t\t\t\t When Admin click sentens \"Status\" or \"Client Other Id\" in Search Options \n");
      out.write("\t\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#toggleBetweenStatusAndclientOtherId\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tfillSarchParameters();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#switchBetweenStatusAndClientOtherSignal\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#form')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.trigger(\"submit\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t/*------------------------------- Function:fillSarchParameters --------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t     \t   Function to fill sarch parameters  \n");
      out.write("\t\t\t\t\t\t\t\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t\t\t\t\t\t\t\tfunction fillSarchParameters() {\n");
      out.write("\t\t\t\t\t\t\t\t\t//search parameters \n");
      out.write("\t\t\t\t\t\t\t\t\tvar userLogin = $(\"#txtUserLoginTo\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmUserLogin\").val(userLogin); //Some Hidden Form\n");
      out.write("\t\t\t\t\t\t\t\t\tvar strCreationDateStart = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"#creationDateStartPicker\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmStrCreationDateStart\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstrCreationDateStart);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar strCreationDateEnd = $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"#creationDateEndPicker\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmStrCreationDateEnd\").val(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstrCreationDateEnd);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar selectedStatus = $(\"#selectedStatus\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmSelectedStatus\").val(selectedStatus);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar lsOrderId = $(\"#lsOrderIdSearch\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#lsOrderIdFRM\").val(lsOrderId);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tvar productOrderNumberSearch = $(\"#poNumberId\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmProductOrderNumber\").val(productOrderNumberSearch);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar trakingNumber = $(\"#trakingNumberId\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmTrakingNumber\").val(trakingNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientOrderNumber = $(\"#clientOrderId\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmClientOrderNumber\").val(clientOrderNumber);\n");
      out.write("\t\t\t\t\t\t\t\t\tvar clientOther = $(\"#clientOtherId\").val();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#frmClientOther\").val(clientOther);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(43,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("form");
    // /WEB-INF/jsp/orders/reportOrders.jsp(43,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("reportOrders.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(43,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(43,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t<!-- .......... Hidden variables to use when admin do an action event ........ -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f9(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f10(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f11(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f12(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f13(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f14(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f15(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f16(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f17(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f18(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f19(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f20(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f21(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f22(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f23(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f24(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f25(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f26(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f27(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f28(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f29(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<!-- New variable -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f30(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f31(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f32(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f33(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f34(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f35(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t  \n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f36(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t<!-- ***************** Pagination ********************************** -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f37(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f38(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f39(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f40(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f41(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f42(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<!-- ***************** Pagination ********************************** -->\n");
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f43(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<!-- Position detailPop -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f44(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f45(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- Find Options -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f46(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" <!-- For search Icon ID -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f47(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f48(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f49(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f50(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f51(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f52(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- New Added search field -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f53(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f54(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f55(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f56(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- Find Options -->\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- Data Order -->\n");
        out.write("\t\t\t<!-- TEST -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f57(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f58(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<!-- TEST -->\n");
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f59(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f60(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f61(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f62(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f63(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f64(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f65(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f66(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f67(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f68(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f69(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f70(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f71(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f72(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f73(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f74(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f75(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f76(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f77(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f78(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<!-- Data Row -->\n");
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f79(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f80(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f81(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f82(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f83(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f84(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f85(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f86(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f87(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f88(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f89(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f90(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f91(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("orderSelected");
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("orderSelected");
    // /WEB-INF/jsp/orders/reportOrders.jsp(47,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("showOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("showOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(48,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("okShowOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("okShowOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(49,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("lsOrderIdFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("lsOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(50,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("indexOrder");
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("indexOrder");
    // /WEB-INF/jsp/orders/reportOrders.jsp(51,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setId("indexRow");
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setName("indexRow");
    // /WEB-INF/jsp/orders/reportOrders.jsp(52,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setId("selectAllOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setName("selectAllOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(53,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setId("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setName("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(55,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setId("editOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setName("editOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(56,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setId("saveOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setName("saveOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(57,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setId("saveTemporaryRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setName("saveTemporaryRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(58,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setId("cancelSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setName("cancelSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(60,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setId("addSimilarRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setName("addSimilarRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(61,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(63,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setId("deleteRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(63,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setName("deleteRowSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(63,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(64,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setId("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(64,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setName("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(64,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setId("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setName("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(66,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setId("checkProductPriceSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setName("checkProductPriceSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(68,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setId("sortingOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setName("sortingOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(70,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setId("fieldForSorting");
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setName("fieldForSorting");
    // /WEB-INF/jsp/orders/reportOrders.jsp(72,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(73,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setId("showOrderDetailPop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(73,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(74,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setId("checkBoxPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(74,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(75,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f21.setId("pageTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(75,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f21.setName("pageTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(75,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f22.setId("scrollPageLeft");
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f22.setName("scrollPageLeft");
    // /WEB-INF/jsp/orders/reportOrders.jsp(76,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f23.setId("scrollDivRowsTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f23.setName("scrollDivRowsTop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(77,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f24.setId("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f24.setName("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(78,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f25.setId("saveShippingSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f25.setName("saveShippingSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(80,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f26.setId("saveOnlyNoteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f26.setName("saveOnlyNoteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(81,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(82,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f27.setId("deleteOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(82,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f27.setName("deleteOrderSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(82,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(83,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f28.setId("dateBetweenSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(83,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f28.setName("dateBetweenSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(83,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f29.setId("reportDateBetween");
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f29.setName("reportDateBetween");
    // /WEB-INF/jsp/orders/reportOrders.jsp(84,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f30.setId("switchBetweenClientLoginAndPoNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f30.setName("switchBetweenClientLoginAndPoNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(86,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f31.setId("switchBetweenClientLoginAndPoNumberSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f31.setName("switchBetweenClientLoginAndPoNumberSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(87,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f32.setId("switchBetweenLsOrderAndClientOrderIdSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f32.setName("switchBetweenLsOrderAndClientOrderIdSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(89,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f33.setId("switchBetweenLsOrderAndClientOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f33.setName("switchBetweenLsOrderAndClientOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(90,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(92,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setId("switchBetweenStatusAndClientOtherSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(92,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setName("switchBetweenStatusAndClientOtherSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(92,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f34.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setId("switchBetweenStatusAndClientOther");
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setName("switchBetweenStatusAndClientOther");
    // /WEB-INF/jsp/orders/reportOrders.jsp(93,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f35.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f36.setId("optionalFieldSwitch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f36.setName("optionalFieldSwitch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(96,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setId("pageIndexSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setName("pageIndexSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(99,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f37.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setId("nextListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setName("nextListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(100,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f38.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(102,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f39.setId("prevListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(102,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f39.setName("prevListPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(102,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setId("prevListPages");
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setName("prevListPages");
    // /WEB-INF/jsp/orders/reportOrders.jsp(104,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f40.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setId("indexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setName("indexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(105,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f41.setValue("-1");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setId("indexList");
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setName("indexList");
    // /WEB-INF/jsp/orders/reportOrders.jsp(106,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f42.setValue("-1");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(109,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setId("confirmDeleteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(109,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setName("confirmDeleteSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(109,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f43.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(111,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setId("poYpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(111,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setName("poYpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(111,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f44.setValue("100");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(112,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setId("poXpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(112,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setName("poXpop");
    // /WEB-INF/jsp/orders/reportOrders.jsp(112,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f45.setValue("100");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setId("findOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setName("findOrdersSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(115,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f46.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setId("frmUserLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(116,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f47.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setId("frmStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setName("status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(117,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f48.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setId("frmSelectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(118,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f49.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setId("frmStrCreationDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setName("strCreationDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(119,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f50.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setId("frmStrCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setName("strCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(120,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f51.setValue("");
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
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f52 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f52.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f52.setId("frmStrCreationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f52.setName("strCreationDateEnd ");
    // /WEB-INF/jsp/orders/reportOrders.jsp(121,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f52.setValue("");
    int _jspx_eval_s_005fhidden_005f52 = _jspx_th_s_005fhidden_005f52.doStartTag();
    if (_jspx_th_s_005fhidden_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f52);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f53 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f53.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(124,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f53.setId("frmProductOrderNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(124,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f53.setName("productOrderNumberSearch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(124,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f53.setValue("");
    int _jspx_eval_s_005fhidden_005f53 = _jspx_th_s_005fhidden_005f53.doStartTag();
    if (_jspx_th_s_005fhidden_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f53);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f54 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f54.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f54.setId("frmTrakingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f54.setName("trakingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(125,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f54.setValue("");
    int _jspx_eval_s_005fhidden_005f54 = _jspx_th_s_005fhidden_005f54.doStartTag();
    if (_jspx_th_s_005fhidden_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f54);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f55 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f55.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f55.setId("frmClientOrderNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f55.setName("clientOrderNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(126,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f55.setValue("");
    int _jspx_eval_s_005fhidden_005f55 = _jspx_th_s_005fhidden_005f55.doStartTag();
    if (_jspx_th_s_005fhidden_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f55);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f56 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f56.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f56.setId("frmClientOther");
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f56.setName("clientOther");
    // /WEB-INF/jsp/orders/reportOrders.jsp(127,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f56.setValue("");
    int _jspx_eval_s_005fhidden_005f56 = _jspx_th_s_005fhidden_005f56.doStartTag();
    if (_jspx_th_s_005fhidden_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f56);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f57 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f57.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f57.setId("strPrintFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f57.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(133,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f57.setValue("null");
    int _jspx_eval_s_005fhidden_005f57 = _jspx_th_s_005fhidden_005f57.doStartTag();
    if (_jspx_th_s_005fhidden_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f57);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setId("testSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setName("testSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(134,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f58.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setId("newStatusFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setName("newStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(137,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f59.setValue("null");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(138,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setId("codeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(138,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setName("code");
    // /WEB-INF/jsp/orders/reportOrders.jsp(138,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f60.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(139,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setId("showRowShippingFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(139,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setName("showRowShipping");
    // /WEB-INF/jsp/orders/reportOrders.jsp(139,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f61.setValue("0");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(140,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setId("showOnlyEditNoteFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(140,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setName("showOnlyEditNote");
    // /WEB-INF/jsp/orders/reportOrders.jsp(140,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f62.setValue("0");
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
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f63 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f63.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f63.setId("userIdFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(141,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f63.setName("userId");
    int _jspx_eval_s_005fhidden_005f63 = _jspx_th_s_005fhidden_005f63.doStartTag();
    if (_jspx_th_s_005fhidden_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f63);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f64 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f64.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(142,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f64.setId("productOrderNumberFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(142,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f64.setName("productOrderNumber");
    int _jspx_eval_s_005fhidden_005f64 = _jspx_th_s_005fhidden_005f64.doStartTag();
    if (_jspx_th_s_005fhidden_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f64);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f65 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f65.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(143,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f65.setId("productOrderDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(143,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f65.setName("strProductOrderDate");
    int _jspx_eval_s_005fhidden_005f65 = _jspx_th_s_005fhidden_005f65.doStartTag();
    if (_jspx_th_s_005fhidden_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f65);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f66 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f66.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(144,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f66.setId("creationDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(144,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f66.setName("strCreationDate");
    int _jspx_eval_s_005fhidden_005f66 = _jspx_th_s_005fhidden_005f66.doStartTag();
    if (_jspx_th_s_005fhidden_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f66);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f67 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f67.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(145,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f67.setId("creationOrderDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(145,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f67.setName("strCreationOrderDate");
    int _jspx_eval_s_005fhidden_005f67 = _jspx_th_s_005fhidden_005f67.doStartTag();
    if (_jspx_th_s_005fhidden_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f67);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f68 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f68.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(146,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f68.setId("requiredDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(146,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f68.setName("strRequiredDate");
    int _jspx_eval_s_005fhidden_005f68 = _jspx_th_s_005fhidden_005f68.doStartTag();
    if (_jspx_th_s_005fhidden_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f68);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(147,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f69.setId("clientLastNameFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(147,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f69.setName("clientLastName");
    // /WEB-INF/jsp/orders/reportOrders.jsp(147,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(148,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setId("clientFirstNameFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(148,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setName("clientFirstName");
    // /WEB-INF/jsp/orders/reportOrders.jsp(148,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f70.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setId("clientOtherNamesFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setName("clientOtherNames");
    // /WEB-INF/jsp/orders/reportOrders.jsp(149,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f71.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f72.setId("clientStreetFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f72.setName("clientStreet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(150,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setId("clientOtherStreetFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setName("clientOtherStreet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(151,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f73.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f74.setId("clientCityFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f74.setName("clientCity");
    // /WEB-INF/jsp/orders/reportOrders.jsp(152,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setId("clientProvinceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setName("clientProvince");
    // /WEB-INF/jsp/orders/reportOrders.jsp(153,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f75.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setId("clientPostalCodeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setName("clientPostalCode");
    // /WEB-INF/jsp/orders/reportOrders.jsp(154,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f76.setValue("");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f77.setId("clientPhoneFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f77.setName("clientPhone");
    // /WEB-INF/jsp/orders/reportOrders.jsp(155,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f78.setId("clientEmailFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f78.setName("clientEmail");
    // /WEB-INF/jsp/orders/reportOrders.jsp(156,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(159,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f79.setId("strShippingPriceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(159,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f79.setName("strShippingPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(159,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(160,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setId("strShippedDateFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(160,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setName("strShippedDate");
    // /WEB-INF/jsp/orders/reportOrders.jsp(160,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f80.setValue("");
    int _jspx_eval_s_005fhidden_005f80 = _jspx_th_s_005fhidden_005f80.doStartTag();
    if (_jspx_th_s_005fhidden_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f80);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f81(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f81 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f81.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(161,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setId("quantityFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(161,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setName("quantity");
    // /WEB-INF/jsp/orders/reportOrders.jsp(161,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f81.setValue("-1");
    int _jspx_eval_s_005fhidden_005f81 = _jspx_th_s_005fhidden_005f81.doStartTag();
    if (_jspx_th_s_005fhidden_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f81);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f82(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f82 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f82.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(162,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setId("quantityToChangeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(162,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setName("quantityToChange");
    // /WEB-INF/jsp/orders/reportOrders.jsp(162,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f82.setValue("-1");
    int _jspx_eval_s_005fhidden_005f82 = _jspx_th_s_005fhidden_005f82.doStartTag();
    if (_jspx_th_s_005fhidden_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f82);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f83(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f83 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f83.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(163,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setId("lsProductIDFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(163,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setName("lsProductID");
    // /WEB-INF/jsp/orders/reportOrders.jsp(163,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f83.setValue("");
    int _jspx_eval_s_005fhidden_005f83 = _jspx_th_s_005fhidden_005f83.doStartTag();
    if (_jspx_th_s_005fhidden_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f83);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f84 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f84.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(164,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setId("stockFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(164,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setName("stock");
    // /WEB-INF/jsp/orders/reportOrders.jsp(164,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f84.setValue("-1");
    int _jspx_eval_s_005fhidden_005f84 = _jspx_th_s_005fhidden_005f84.doStartTag();
    if (_jspx_th_s_005fhidden_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f84);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f85 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f85.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(165,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setId("productDescriptionFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(165,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setName("productDescription");
    // /WEB-INF/jsp/orders/reportOrders.jsp(165,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f85.setValue("");
    int _jspx_eval_s_005fhidden_005f85 = _jspx_th_s_005fhidden_005f85.doStartTag();
    if (_jspx_th_s_005fhidden_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f85);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f86(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f86 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f86.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(167,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setId("unitPriceFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(167,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setName("unitPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(167,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f86.setValue("-1");
    int _jspx_eval_s_005fhidden_005f86 = _jspx_th_s_005fhidden_005f86.doStartTag();
    if (_jspx_th_s_005fhidden_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f86);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f86);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f87(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f87 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f87.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(168,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setId("shippingFeeFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(168,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setName("shippingFee");
    // /WEB-INF/jsp/orders/reportOrders.jsp(168,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f87.setValue("-1");
    int _jspx_eval_s_005fhidden_005f87 = _jspx_th_s_005fhidden_005f87.doStartTag();
    if (_jspx_th_s_005fhidden_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f87);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f87);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f88(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f88 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f88.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(169,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setId("notesFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(169,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setName("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(169,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f88.setValue("");
    int _jspx_eval_s_005fhidden_005f88 = _jspx_th_s_005fhidden_005f88.doStartTag();
    if (_jspx_th_s_005fhidden_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f88);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f88);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f89(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f89 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f89.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(170,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setId("shippingCompanyFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(170,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setName("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(170,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f89.setValue("");
    int _jspx_eval_s_005fhidden_005f89 = _jspx_th_s_005fhidden_005f89.doStartTag();
    if (_jspx_th_s_005fhidden_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f89);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f89);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f90(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f90 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f90.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(171,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setId("companyHeaderFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(171,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setName("companyHeader");
    // /WEB-INF/jsp/orders/reportOrders.jsp(171,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f90.setValue("");
    int _jspx_eval_s_005fhidden_005f90 = _jspx_th_s_005fhidden_005f90.doStartTag();
    if (_jspx_th_s_005fhidden_005f90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f90);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f90);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f91(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f91 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f91.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(172,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setId("trackingNumberFRM");
    // /WEB-INF/jsp/orders/reportOrders.jsp(172,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setName("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(172,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f91.setValue("");
    int _jspx_eval_s_005fhidden_005f91 = _jspx_th_s_005fhidden_005f91.doStartTag();
    if (_jspx_th_s_005fhidden_005f91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f91);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f91);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(176,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setId("formToPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(176,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("printOrdersToPDF.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(176,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(176,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f92(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f93(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f94(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f95(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
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

  private boolean _jspx_meth_s_005fhidden_005f92(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f92 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f92.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(178,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setId("strPrintInPDFForm");
    // /WEB-INF/jsp/orders/reportOrders.jsp(178,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(178,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f92.setValue("null");
    int _jspx_eval_s_005fhidden_005f92 = _jspx_th_s_005fhidden_005f92.doStartTag();
    if (_jspx_th_s_005fhidden_005f92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f92);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f92);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f93(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f93 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f93.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(179,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setId("tansformReportSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(179,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setName("tansformReportSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(179,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f93.setValue("0");
    int _jspx_eval_s_005fhidden_005f93 = _jspx_th_s_005fhidden_005f93.doStartTag();
    if (_jspx_th_s_005fhidden_005f93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f93);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f93);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f94(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f94 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f94.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(181,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f94.setId("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(181,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f94.setName("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(181,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f94.setValue("0");
    int _jspx_eval_s_005fhidden_005f94 = _jspx_th_s_005fhidden_005f94.doStartTag();
    if (_jspx_th_s_005fhidden_005f94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f94);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f94);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f95(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f95 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f95.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(183,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f95.setId("printAllOrderPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(183,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f95.setName("printAllOrderPagesSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(183,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f95.setValue("0");
    int _jspx_eval_s_005fhidden_005f95 = _jspx_th_s_005fhidden_005f95.doStartTag();
    if (_jspx_th_s_005fhidden_005f95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f95);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f95);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(188,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setId("formOrdersAdminXLS");
    // /WEB-INF/jsp/orders/reportOrders.jsp(188,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setAction("ordersAdminXLS.do");
    // /WEB-INF/jsp/orders/reportOrders.jsp(188,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setMethod("post");
    // /WEB-INF/jsp/orders/reportOrders.jsp(188,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f96(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f97(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f98(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f99(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f100(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f101(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f102(_jspx_th_s_005fform_005f2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
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

  private boolean _jspx_meth_s_005fhidden_005f96(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f96 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f96.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f96.setId("frmUserLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f96.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(190,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f96.setValue("");
    int _jspx_eval_s_005fhidden_005f96 = _jspx_th_s_005fhidden_005f96.doStartTag();
    if (_jspx_th_s_005fhidden_005f96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f96);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f96);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f97(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f97 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f97.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(191,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f97.setId("frmSelectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(191,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f97.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(191,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f97.setValue("");
    int _jspx_eval_s_005fhidden_005f97 = _jspx_th_s_005fhidden_005f97.doStartTag();
    if (_jspx_th_s_005fhidden_005f97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f97);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f97);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f98(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f98 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f98.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(192,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f98.setId("strPrintInAdminXLS");
    // /WEB-INF/jsp/orders/reportOrders.jsp(192,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f98.setName("strPrint");
    // /WEB-INF/jsp/orders/reportOrders.jsp(192,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f98.setValue("null");
    int _jspx_eval_s_005fhidden_005f98 = _jspx_th_s_005fhidden_005f98.doStartTag();
    if (_jspx_th_s_005fhidden_005f98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f98);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f98);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f99(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f99 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f99.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(193,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f99.setId("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(193,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f99.setName("allOrdersSelectedSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(193,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f99.setValue("0");
    int _jspx_eval_s_005fhidden_005f99 = _jspx_th_s_005fhidden_005f99.doStartTag();
    if (_jspx_th_s_005fhidden_005f99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f99);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f99);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f100(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f100 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f100.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(195,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f100.setId("reportOrderPageSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(195,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f100.setName("reportOrderPageSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(195,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f100.setValue("0");
    int _jspx_eval_s_005fhidden_005f100 = _jspx_th_s_005fhidden_005f100.doStartTag();
    if (_jspx_th_s_005fhidden_005f100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f100);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f100);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f101(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f101 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f101.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(197,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f101.setId("selectedOrdersListSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(197,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f101.setName("selectedOrdersListSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(197,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f101.setValue("0");
    int _jspx_eval_s_005fhidden_005f101 = _jspx_th_s_005fhidden_005f101.doStartTag();
    if (_jspx_th_s_005fhidden_005f101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f101);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f101);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f102(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f102 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f102.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(199,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f102.setId("generateESTFileSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(199,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f102.setName("generateESTFileSignal");
    // /WEB-INF/jsp/orders/reportOrders.jsp(199,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f102.setValue("0");
    int _jspx_eval_s_005fhidden_005f102 = _jspx_th_s_005fhidden_005f102.doStartTag();
    if (_jspx_th_s_005fhidden_005f102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f102);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f102);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(226,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{switchBetweenClientLoginAndPoNumber==null || switchBetweenClientLoginAndPoNumber==0}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t<td style=\"padding-left: 5px; width: 80px;\">\n");
        out.write("\t\t\t\t<span id=\"toggleBetweenLoginAndPONumber\" style=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">\n");
        out.write("\t\t\t\t\t\t\tClient Login: </span></td>\n");
        out.write("\n");
        out.write("\t\t\t\t<td style=\"padding-left: 5px; width:152px;\">\n");
        out.write("\t\t\t\t<span style=\"font-size: 12px;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</span>\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t<div style=\"position: absolute;\">\n");
        out.write("\t\t\t\t\t\t\t<select id=\"selectUsersTag\" name=\"sometext\" size=\"2\"\n");
        out.write("\t\t\t\t\t\t\t\tmultiple=\"multiple\" class=\"selectUsersTag\"\n");
        out.write("\t\t\t\t\t\t\t\tstyle=\"\n");
        out.write("\t\t\t\t\t\t\t\theight: 67px; \n");
        out.write("\t\t\t\t\t\t\t\twidth: 154px;\n");
        out.write("\t\t\t\t\t\t\t\ttop: 42px;\n");
        out.write("\t\t\t\t\t\t\t\tright: -90px; \n");
        out.write("\t\t\t\t\t\t\t\tposition: relative; \n");
        out.write("\t\t\t\t\t\t\t\tz-index: 100; \n");
        out.write("\t\t\t\t\t\t\t\tdisplay: none; \n");
        out.write("\t\t\t\t\t\t\t\tmargin-right: 20px; \n");
        out.write("\t\t\t\t\t\t\t\toverflow: none;\n");
        out.write("\t\t\t\t\t\t\t\t\"\n");
        out.write("\t\t\t\t\t\t\t\tscrolling=\"no\">\n");
        out.write("\t\t\t\t\t\t\t\t<option></option>\n");
        out.write("\t\t\t\t\t\t\t</select>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(234,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("txtUserLoginTo");
    // /WEB-INF/jsp/orders/reportOrders.jsp(234,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("userLogin");
    // /WEB-INF/jsp/orders/reportOrders.jsp(234,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("%{userLogin}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(234,4) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssStyle("width:150px");
    // /WEB-INF/jsp/orders/reportOrders.jsp(234,4) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "autocomplete", new String("off"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fautocomplete_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
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
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 80px;\"><span\n");
        out.write("\t\t\t\t\t\tid=\"toggleBetweenLoginAndPONumber\"\n");
        out.write("\t\t\t\t\t\tstyle=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">\n");
        out.write("\t\t\t\t\t\t\tPO Number: </span></td> \n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width:152px;\">\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005felse_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f0);
    // /WEB-INF/jsp/orders/reportOrders.jsp(265,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("poNumberId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(265,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("productOrderNumberSearch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(265,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setValue("%{productOrderNumberSearch}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(265,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssStyle("width:150px");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(295,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{switchBetweenLsOrderAndClientOrderId==null || switchBetweenLsOrderAndClientOrderId==0}");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<td style=\"padding-left: 5px; width: 92px;\">\n");
        out.write("\t\t\t\t<span id=\"toggleBetweenlsOrderIdAndclientOrderId\" style=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">ls_Order_Id: </span></td>\n");
        out.write("\t\t\t\t<td style=\"padding-left: 5px; width:119px;\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(299,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setId("lsOrderIdSearch");
    // /WEB-INF/jsp/orders/reportOrders.jsp(299,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("lsOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(299,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setValue("%{lsOrderId}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(299,4) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setCssStyle("width:150px");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f1 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f1.setParent(null);
    int _jspx_eval_s_005felse_005f1 = _jspx_th_s_005felse_005f1.doStartTag();
    if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 92px;\"><span\n");
        out.write("\t\t\t\t\t\tid=\"toggleBetweenlsOrderIdAndclientOrderId\"\n");
        out.write("\t\t\t\t\t\tstyle=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">Client\n");
        out.write("\t\t\t\t\t\t\tOrder Id: </span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 100px;\">");
        if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005felse_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(309,50) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setId("clientOrderId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(309,50) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("clientOrderNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(309,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setValue("%{clientOrderNumber}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(309,50) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setCssStyle("width:150px");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(321,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{switchBetweenStatusAndClientOther==null || switchBetweenStatusAndClientOther==0}");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px;wi\">\n");
        out.write("\t\t\t\t\t<span id=\"toggleBetweenStatusAndclientOtherId\" style=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">Status: </span></td>\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 100px;\">");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setLabel("");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("selectedStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("-1");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("All Status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("#{'0':'Open', '1':'Progress', '2':'Shipped'}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setValue("%{selectedStatus}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setRequired("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(324,50) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width: 150px");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005frequired_005fname_005flist_005flabel_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f2 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f2.setParent(null);
    int _jspx_eval_s_005felse_005f2 = _jspx_th_s_005felse_005f2.doStartTag();
    if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 92px;\">\n");
        out.write("\t\t\t\t\t<span id=\"toggleBetweenStatusAndclientOtherId\" style=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">\n");
        out.write("\t\t\t\t\tClient Other Id: </span></td>\n");
        out.write("\t\t\t\t\t<td style=\"padding-left: 5px; width: 95px;\">\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f4(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
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

  private boolean _jspx_meth_s_005ftextfield_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(335,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setId("clientOtherId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(335,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("clientOther");
    // /WEB-INF/jsp/orders/reportOrders.jsp(335,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setValue("%{clientOther}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(335,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setCssStyle("width:150px");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(349,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("%{reportDateBetween==null || reportDateBetween==0}");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<span id=\"factorDateBetweenId\"\n");
        out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">PO\n");
        out.write("\t\t\t\t\t\t\tDate </span> between:\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005felse_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f3 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f3.setParent(null);
    int _jspx_eval_s_005felse_005f3 = _jspx_th_s_005felse_005f3.doStartTag();
    if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<span id=\"factorDateBetweenId\"\n");
        out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer; color: rgb(44, 140, 171); text-decoration: underline;\">Shipped\n");
        out.write("\t\t\t\t\t\t\tDate </span> between:\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fdate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f0 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f0.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(363,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setId("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(363,4) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setName("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(363,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setVar("creationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(363,4) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f0 = _jspx_th_s_005fdate_005f0.doStartTag();
    if (_jspx_th_s_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setId("creationDateStartPicker");
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("strCreationDateStart");
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setValue("%{#creationDateStart}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setKey("labelkey");
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setReadonly("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(364,4) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setCssStyle("width:150px;");
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,35) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setId("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,35) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setName("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,35) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setVar("creationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(370,35) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f1 = _jspx_th_s_005fdate_005f1.doStartTag();
    if (_jspx_th_s_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fid_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f6.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setId("creationDateEndPicker");
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setName("strCreationDateEnd");
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setValue("%{#creationDateEnd}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setKey("labelkey");
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setReadonly("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(372,5) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setCssStyle("width:150px;");
    int _jspx_eval_s_005ftextfield_005f6 = _jspx_th_s_005ftextfield_005f6.doStartTag();
    if (_jspx_th_s_005ftextfield_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(426,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("%{usersList}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(426,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fiterator_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(427,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("%{#row}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(427,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t<option>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</option>\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(429,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(441,56) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(444,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("%{totalOrders}");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(446,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("%{listOrdersDTO.size > 0  && superAdmin!=null}");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td width=\"80px\"><img id=\"imgGetAdminXLSEST\"\n");
        out.write("\t\t\t\t\t\tsrc=\"images/orders/xlsEst.png\" style=\"cursor: pointer;\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<td width=\"80px\"><img id=\"imgGetAdminXLS\"\n");
        out.write("\t\t\t\t\t\tsrc=\"images/orders/xls.png\" style=\"cursor: pointer;\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<td width=\"80px\"><img id=\"imgPrintOrders\"\n");
        out.write("\t\t\t\t\t\tsrc=\"images/orders/printAll.png\" style=\"cursor: pointer;\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(461,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("%{listOrdersDTO.size > 0 && usersPrivShippedToInvoiced!=null}");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t<td><img id=\"imgGetInvoicedXLS\"\n");
        out.write("\t\t\t\t\t\tsrc=\"images/orders/xlsInvoiced.png\" style=\"cursor: pointer;\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005fhidden_005f103(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f103 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f103.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f103.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(472,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f103.setId("sizeResult");
    // /WEB-INF/jsp/orders/reportOrders.jsp(472,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f103.setName("sizeResult");
    // /WEB-INF/jsp/orders/reportOrders.jsp(472,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f103.setValue("%{listOrdersDTO.size}");
    int _jspx_eval_s_005fhidden_005f103 = _jspx_th_s_005fhidden_005f103.doStartTag();
    if (_jspx_th_s_005fhidden_005f103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f103);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f103);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f6 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f6.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(675,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f6.setTest("%{listOrdersDTO.size > 0}");
    int _jspx_eval_s_005fif_005f6 = _jspx_th_s_005fif_005f6.doStartTag();
    if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td colspan=\"34\">\n");
        out.write("\t\t\t\t\t\t\t<div id=\"divRowsOrder\"\n");
        out.write("\t\t\t\t\t\t\t\tstyle=\"overflow-y: auto; width: 5030px; direction: rtl; text-align: left; max-height: 550px; height: 800px; cursor: default; padding-bottom: 10px; overflow-x: hidden;\">\n");
        out.write("\t\t\t\t\t\t\t\t<table style=\"direction: ltr; table-layout: fixed;\"\n");
        out.write("\t\t\t\t\t\t\t\t\twidth=\"5030px\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fiterator_005f2(_jspx_th_s_005fif_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</table>\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
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

  private boolean _jspx_meth_s_005fiterator_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f2 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f6);
    // /WEB-INF/jsp/orders/reportOrders.jsp(682,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setValue("listOrdersDTO");
    // /WEB-INF/jsp/orders/reportOrders.jsp(682,9) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<tr height=\"45px\" id=\"rowOrder\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tstyle='");
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005fproperty_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("font-size: 12px;border-bottom:1px solid #CCCCCC;border-right:1px solid white;'>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"columnInfoNotCompleted\" width=\"19px\" align=\"right\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-left: 20px;\">");
        if (_jspx_meth_s_005fif_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"35px\">");
        if (_jspx_meth_s_005fcheckbox_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"columnIndexOrder\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"visibility: hidden; display: none;\">");
        if (_jspx_meth_s_005fproperty_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"125px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC; padding-left: 10px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px;\">");
        if (_jspx_meth_s_005fproperty_005f6(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"125px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC; padding-left: 10px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; visibility: hidden; display: none; padding-right: 10px;\">");
        if (_jspx_meth_s_005fproperty_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f8(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005felse_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"102px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f10(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f11(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f9(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"visibility: hidden; display: none;\"><img\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"imgSort\" src=\"\" /></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"130px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f14(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f15(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f16(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"180px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f17(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f18(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f19(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"132px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f10(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f11(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"170px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f12(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f1(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f6(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f26(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"160px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f27(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f28(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"165px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f29(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f30(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f31(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"130px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f32(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f33(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"170px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f34(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"170px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f35(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f36(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"clientProvince\" width=\"110px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f37(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"130px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f38(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f39(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"180px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f40(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"170px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f13(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f2(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"135px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f14(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f8(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"170px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f15(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f4(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f9(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f16(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felseif_005f5(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005felse_005f10(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"95px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f50(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"background-color: white; border: 1px solid white;\"></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(685,18) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(685,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("#order.cssRow");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(687,40) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f7.setTest("%{infoMissing==1}");
    int _jspx_eval_s_005fif_005f7 = _jspx_th_s_005fif_005f7.doStartTag();
    if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"infoMissingDiv\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"images/orders/infoMissing.png\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fdisabled_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(692,43) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setId("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(692,43) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setName("checkBoxItem");
    // /WEB-INF/jsp/orders/reportOrders.jsp(692,43) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setValue("%{checkBoxItem}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(692,43) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(696,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(699,164) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(702,220) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f7.setValue("#order.id");
    int _jspx_eval_s_005fproperty_005f7 = _jspx_th_s_005fproperty_005f7.doStartTag();
    if (_jspx_th_s_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(705,11) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f8.setTest("superAdmin!=null");
    int _jspx_eval_s_005fif_005f8 = _jspx_th_s_005fif_005f8.doStartTag();
    if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"columnRowOrderId\" width=\"220px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; font-weight: bold; color: rgb(44, 140, 171); overflow: hidden; text-overflow: ellipsis; cursor: pointer;\">");
        if (_jspx_meth_s_005fproperty_005f8(_jspx_th_s_005fif_005f8, _jspx_page_context))
          return true;
        out.write("<img id=\"editRowOrder\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"images/orders/editRowOrder.png\" align=\"right\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"vertical-align: middle; padding-right: 0px;\" /></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f8 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f8);
    // /WEB-INF/jsp/orders/reportOrders.jsp(707,237) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f8.setValue("#order.lsOrderId");
    int _jspx_eval_s_005fproperty_005f8 = _jspx_th_s_005fproperty_005f8.doStartTag();
    if (_jspx_th_s_005fproperty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"220px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-right: 1px solid #CCCCCC; padding-left: 5px; padding-right: 5px; padding-top: 5px; padding-bottom: 5px; font-weight: bold; overflow: hidden; text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f9(_jspx_th_s_005felse_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f9 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f4);
    // /WEB-INF/jsp/orders/reportOrders.jsp(714,194) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(719,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(722,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f11.setValue("#order.requiredDate");
    int _jspx_eval_s_005fproperty_005f11 = _jspx_th_s_005fproperty_005f11.doStartTag();
    if (_jspx_th_s_005fproperty_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(726,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f9.setTest("showRowShipping==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f9 = _jspx_th_s_005fif_005f9.doStartTag();
    if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f12(_jspx_th_s_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"statusToEdit\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"statusId\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveStatus\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f12 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f9);
    // /WEB-INF/jsp/orders/reportOrders.jsp(727,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(732,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005felseif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveStatus\" href=\"#\" style=\"align: rigth;\"> Save</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"statusToEdit\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setId("statusId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("statusId");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("listStatus");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = emptyOption type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setEmptyOption("false");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("id");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("status");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("--Select--");
    // /WEB-INF/jsp/orders/reportOrders.jsp(733,13) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setCssStyle("width:80px;color:black;");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f13(_jspx_th_s_005felse_005f5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f13 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f5);
    // /WEB-INF/jsp/orders/reportOrders.jsp(740,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(746,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(749,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(752,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(755,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(758,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(761,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f19.setValue("#order.lsPrice");
    int _jspx_eval_s_005fproperty_005f19 = _jspx_th_s_005fproperty_005f19.doStartTag();
    if (_jspx_th_s_005fproperty_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(765,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f10.setTest("%{#order.currencyId != 1}");
    int _jspx_eval_s_005fif_005f10 = _jspx_th_s_005fif_005f10.doStartTag();
    if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color: #0000FF;\"> ");
        if (_jspx_meth_s_005fproperty_005f20(_jspx_th_s_005fif_005f10, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f21(_jspx_th_s_005fif_005f10, _jspx_page_context))
          return true;
        out.write(" </span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f20 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f10);
    // /WEB-INF/jsp/orders/reportOrders.jsp(766,44) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f20.setValue("#order.currencyUnitPrice");
    int _jspx_eval_s_005fproperty_005f20 = _jspx_th_s_005fproperty_005f20.doStartTag();
    if (_jspx_th_s_005fproperty_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f21 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f10);
    // /WEB-INF/jsp/orders/reportOrders.jsp(767,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f21.setValue("#order.currencySymbol");
    int _jspx_eval_s_005fproperty_005f21 = _jspx_th_s_005fproperty_005f21.doStartTag();
    if (_jspx_th_s_005fproperty_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(773,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f11.setTest("%{#order.currencyId != 1}");
    int _jspx_eval_s_005fif_005f11 = _jspx_th_s_005fif_005f11.doStartTag();
    if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color: #0000FF;\"> ");
        if (_jspx_meth_s_005fproperty_005f22(_jspx_th_s_005fif_005f11, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f23(_jspx_th_s_005fif_005f11, _jspx_page_context))
          return true;
        out.write(" </span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f22 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f11);
    // /WEB-INF/jsp/orders/reportOrders.jsp(774,44) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f22.setValue("#order.currencyPrice");
    int _jspx_eval_s_005fproperty_005f22 = _jspx_th_s_005fproperty_005f22.doStartTag();
    if (_jspx_th_s_005fproperty_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f23 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f11);
    // /WEB-INF/jsp/orders/reportOrders.jsp(775,47) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f23.setValue("#order.currencySymbol");
    int _jspx_eval_s_005fproperty_005f23 = _jspx_th_s_005fproperty_005f23.doStartTag();
    if (_jspx_th_s_005fproperty_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(781,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f12.setTest("showOnlyEditNote==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f12 = _jspx_th_s_005fif_005f12.doStartTag();
    if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f24(_jspx_th_s_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"editNotes\" href=\"#\" style=\"align: rigth;\"> Edit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveNotes\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"notes\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f24 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f12);
    // /WEB-INF/jsp/orders/reportOrders.jsp(782,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(786,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f7(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveNotes\" href=\"#\" style=\"align: rigth;\"> Save</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"editNotes\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /WEB-INF/jsp/orders/reportOrders.jsp(787,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setId("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(787,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setName("notes");
    // /WEB-INF/jsp/orders/reportOrders.jsp(787,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setValue("%{notes}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(787,13) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setCssStyle("width:115px");
    int _jspx_eval_s_005ftextfield_005f7 = _jspx_th_s_005ftextfield_005f7.doStartTag();
    if (_jspx_th_s_005ftextfield_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f25(_jspx_th_s_005felse_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f25 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f6);
    // /WEB-INF/jsp/orders/reportOrders.jsp(792,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(796,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(799,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(802,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(806,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(810,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(813,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(816,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(819,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(822,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(825,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(828,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(831,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(834,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(837,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(840,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f40.setValue("#order.clientEmail");
    int _jspx_eval_s_005fproperty_005f40 = _jspx_th_s_005fproperty_005f40.doStartTag();
    if (_jspx_th_s_005fproperty_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f40);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(844,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f41(_jspx_th_s_005fif_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"editShippingCompany\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveShippingCompany\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"shippingCompany\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f41 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f41.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f13);
    // /WEB-INF/jsp/orders/reportOrders.jsp(845,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(850,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f8(_jspx_th_s_005felseif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveShippingCompany\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tSave</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"editShippingCompany\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f8 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(851,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setId("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(851,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setName("shippingCompany");
    // /WEB-INF/jsp/orders/reportOrders.jsp(851,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setValue("%{shippingCompany}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(851,13) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setCssStyle("width:110px");
    int _jspx_eval_s_005ftextfield_005f8 = _jspx_th_s_005ftextfield_005f8.doStartTag();
    if (_jspx_th_s_005ftextfield_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f42(_jspx_th_s_005felse_005f7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f42 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f42.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f7);
    // /WEB-INF/jsp/orders/reportOrders.jsp(857,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f42.setValue("#order.shippingCompany");
    int _jspx_eval_s_005fproperty_005f42 = _jspx_th_s_005fproperty_005f42.doStartTag();
    if (_jspx_th_s_005fproperty_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f42);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f14 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(862,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f14.setTest("showRowShipping==0 && superAdmin!=null");
    int _jspx_eval_s_005fif_005f14 = _jspx_th_s_005fif_005f14.doStartTag();
    if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f43(_jspx_th_s_005fif_005f14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"editShippedDate\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveShippedDate\"></center>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f43 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f43.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f14);
    // /WEB-INF/jsp/orders/reportOrders.jsp(863,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(868,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"saveShippedDatePicker\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"strShippedDate\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue='");
        if (_jspx_meth_s_005fproperty_005f44(_jspx_th_s_005felseif_005f3, _jspx_page_context))
          return true;
        out.write("'\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 80px;\" />\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveShippedDate\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tSave</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"editShippedDate\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(871,21) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f44.setValue("#order.shippedDate");
    int _jspx_eval_s_005fproperty_005f44 = _jspx_th_s_005fproperty_005f44.doStartTag();
    if (_jspx_th_s_005fproperty_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f44);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f8 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f8 = _jspx_th_s_005felse_005f8.doStartTag();
    if (_jspx_eval_s_005felse_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f45(_jspx_th_s_005felse_005f8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f45 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f45.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f8);
    // /WEB-INF/jsp/orders/reportOrders.jsp(877,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f45.setValue("#order.shippedDate");
    int _jspx_eval_s_005fproperty_005f45 = _jspx_th_s_005fproperty_005f45.doStartTag();
    if (_jspx_th_s_005fproperty_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f45);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f15 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(882,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f15.setTest("showRowShipping==0  && superAdmin!=null");
    int _jspx_eval_s_005fif_005f15 = _jspx_th_s_005fif_005f15.doStartTag();
    if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f15.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f46(_jspx_th_s_005fif_005f15, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"editTrackingNumber\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveTrackingNumber\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"trackingNumber\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f46 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f46.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/orders/reportOrders.jsp(883,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(888,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f9(_jspx_th_s_005felseif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveTrackingNumber\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tSave</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"editTrackingNumber\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f9 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f4);
    // /WEB-INF/jsp/orders/reportOrders.jsp(889,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setId("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(889,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setName("trackingNumber");
    // /WEB-INF/jsp/orders/reportOrders.jsp(889,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setValue("%{trackingNumber}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(889,13) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setCssStyle("width:115px;");
    int _jspx_eval_s_005ftextfield_005f9 = _jspx_th_s_005ftextfield_005f9.doStartTag();
    if (_jspx_th_s_005ftextfield_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f9 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f9 = _jspx_th_s_005felse_005f9.doStartTag();
    if (_jspx_eval_s_005felse_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f47(_jspx_th_s_005felse_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f47 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f47.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f9);
    // /WEB-INF/jsp/orders/reportOrders.jsp(895,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f47.setValue("#order.trackingNumber");
    int _jspx_eval_s_005fproperty_005f47 = _jspx_th_s_005fproperty_005f47.doStartTag();
    if (_jspx_th_s_005fproperty_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f47);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f16 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/reportOrders.jsp(900,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f16.setTest("showRowShipping==0  && superAdmin!=null");
    int _jspx_eval_s_005fif_005f16 = _jspx_th_s_005fif_005f16.doStartTag();
    if (_jspx_eval_s_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f16.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f48(_jspx_th_s_005fif_005f16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"editShippingPrice\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"saveShippingPrice\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"shippingPriceToEdit\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f48 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f48.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f16);
    // /WEB-INF/jsp/orders/reportOrders.jsp(901,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(906,20) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f10(_jspx_th_s_005felseif_005f5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"saveShippingPrice\" href=\"#\" style=\"align: rigth;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tSave</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<center id=\"editShippingPrice\"></center>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f10 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f5);
    // /WEB-INF/jsp/orders/reportOrders.jsp(907,13) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setId("shippingPriceToEdit");
    // /WEB-INF/jsp/orders/reportOrders.jsp(907,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setName("strShippingPrice");
    // /WEB-INF/jsp/orders/reportOrders.jsp(907,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/reportOrders.jsp(907,13) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setCssStyle("width:60px;");
    int _jspx_eval_s_005ftextfield_005f10 = _jspx_th_s_005ftextfield_005f10.doStartTag();
    if (_jspx_th_s_005ftextfield_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f10 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    int _jspx_eval_s_005felse_005f10 = _jspx_th_s_005felse_005f10.doStartTag();
    if (_jspx_eval_s_005felse_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f49(_jspx_th_s_005felse_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f49 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f49.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f10);
    // /WEB-INF/jsp/orders/reportOrders.jsp(914,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(919,174) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f50.setValue("#order.billed");
    int _jspx_eval_s_005fproperty_005f50 = _jspx_th_s_005fproperty_005f50.doStartTag();
    if (_jspx_th_s_005fproperty_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f50);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(940,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f17.setTest("indexSet>10*PAGE_ITEMS_COUNT && listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f17 = _jspx_th_s_005fif_005f17.doStartTag();
    if (_jspx_eval_s_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f17.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- pagesNumber*resultRangeInDB -->\n");
        out.write("\t\t\t\t\t\t<img id=\"imgPrevListPages\"\n");
        out.write("\t\t\t\t\t\t\tsrc=\"images/orders/activePreviousPages.png\" />\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005felseif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f6 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f6.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(945,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t<img src=\"images/orders/desablePreviousPages.png\" />\n");
        out.write("\t\t\t\t\t");
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(949,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setValue("listIndexSet");
    // /WEB-INF/jsp/orders/reportOrders.jsp(949,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f18(_jspx_th_s_005fiterator_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_005fif_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f18 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f3);
    // /WEB-INF/jsp/orders/reportOrders.jsp(950,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f18.setTest("listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f18 = _jspx_th_s_005fif_005f18.doStartTag();
    if (_jspx_eval_s_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f18.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td id=\"pageIndex\" align=\"center\"\n");
        out.write("\t\t\t\t\t\t\tstyle='font-size: 14px; width: 50px;cursor:pointer;font-weight: bold;color: rgb(44,140,171);");
        if (_jspx_meth_s_005fproperty_005f51(_jspx_th_s_005fif_005f18, _jspx_page_context))
          return true;
        out.write("'>\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fhidden_005f104(_jspx_th_s_005fif_005f18, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f52(_jspx_th_s_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f51 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f51.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f18);
    // /WEB-INF/jsp/orders/reportOrders.jsp(952,99) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f51.setValue("#item.cssStyle");
    int _jspx_eval_s_005fproperty_005f51 = _jspx_th_s_005fproperty_005f51.doStartTag();
    if (_jspx_th_s_005fproperty_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f51);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f104(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f104 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f104.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f18);
    // /WEB-INF/jsp/orders/reportOrders.jsp(953,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f104.setId("pageIndexHedden");
    // /WEB-INF/jsp/orders/reportOrders.jsp(953,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f104.setName("pageIndexHedden");
    // /WEB-INF/jsp/orders/reportOrders.jsp(953,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f104.setValue("%{#item.index}");
    int _jspx_eval_s_005fhidden_005f104 = _jspx_th_s_005fhidden_005f104.doStartTag();
    if (_jspx_th_s_005fhidden_005f104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f104);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f104);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f52 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f52.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f18);
    // /WEB-INF/jsp/orders/reportOrders.jsp(954,34) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f52.setValue("#item.index");
    int _jspx_eval_s_005fproperty_005f52 = _jspx_th_s_005fproperty_005f52.doStartTag();
    if (_jspx_th_s_005fproperty_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f52);
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
    // /WEB-INF/jsp/orders/reportOrders.jsp(958,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f19.setTest("((nextListPages+10)*PAGE_ITEMS_COUNT>totalOrders)&& listOrdersDTO.size>0");
    int _jspx_eval_s_005fif_005f19 = _jspx_th_s_005fif_005f19.doStartTag();
    if (_jspx_eval_s_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f19.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- (nextListPages+pagesNumber)*resultRangeInDB -->\n");
        out.write("\t\t\t\t\t\t<img id=\"imgNextPages\" src=\"images/orders/desableNextPages.png\" />\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005felseif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f7 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f7.setParent(null);
    // /WEB-INF/jsp/orders/reportOrders.jsp(962,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t<img id=\"imgNextPages\" src=\"images/orders/activeNextPages.png\" />\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fif_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f20 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f20.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(87,9) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f20.setTest("%{orderToEdit.userLogin.bytes.length > 30}");
    int _jspx_eval_s_005fif_005f20 = _jspx_th_s_005fif_005f20.doStartTag();
    if (_jspx_eval_s_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f20.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t    \t");
        if (_jspx_meth_s_005ftextfield_005f11(_jspx_th_s_005fif_005f20, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t    ");
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

  private boolean _jspx_meth_s_005ftextfield_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f11 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f20);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setId("userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setName("orderToEdit.userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setValue("%{orderToEdit.userLogin}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(88,10) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f11 = _jspx_th_s_005ftextfield_005f11.doStartTag();
    if (_jspx_th_s_005ftextfield_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
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
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f12(_jspx_th_s_005felse_005f11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f12 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f11);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setId("userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setName("orderToEdit.userLogin");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setValue("%{orderToEdit.userLogin}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(91,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f12 = _jspx_th_s_005ftextfield_005f12.doStartTag();
    if (_jspx_th_s_005ftextfield_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
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

  private boolean _jspx_meth_s_005fif_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f21 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f21.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(97,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f21.setTest("%{orderToEdit.creationDate==null}");
    int _jspx_eval_s_005fif_005f21 = _jspx_th_s_005fif_005f21.doStartTag();
    if (_jspx_eval_s_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f21.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f13(_jspx_th_s_005fif_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f13 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setId("creationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setName("strCreationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setValue("%{#creationDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(98,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setCssStyle("width:100px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f13 = _jspx_th_s_005ftextfield_005f13.doStartTag();
    if (_jspx_th_s_005ftextfield_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
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
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f14(_jspx_th_s_005felse_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f14 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f12);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setId("creationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setName("strCreationOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setValue("%{#creationDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(101,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f14 = _jspx_th_s_005ftextfield_005f14.doStartTag();
    if (_jspx_th_s_005ftextfield_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
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

  private boolean _jspx_meth_s_005ftextfield_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f15 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f15.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setId("productOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setName("strProductOrderDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setValue("%{#productOrderDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(108,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f15 = _jspx_th_s_005ftextfield_005f15.doStartTag();
    if (_jspx_th_s_005ftextfield_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(115,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f22.setTest("%{orderToEdit.productOrderNumber==null || orderToEdit.productOrderNumber==\"\"}");
    int _jspx_eval_s_005fif_005f22 = _jspx_th_s_005fif_005f22.doStartTag();
    if (_jspx_eval_s_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f22.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f16(_jspx_th_s_005fif_005f22, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f16 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f22);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setId("productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setName("orderToEdit.productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setValue("%{orderToEdit.productOrderNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(116,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f16 = _jspx_th_s_005ftextfield_005f16.doStartTag();
    if (_jspx_th_s_005ftextfield_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
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
        out.write("\t\t \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f17(_jspx_th_s_005felse_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f17 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f13);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setId("productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setName("orderToEdit.productOrderNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setValue("%{orderToEdit.productOrderNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(119,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f17 = _jspx_th_s_005ftextfield_005f17.doStartTag();
    if (_jspx_th_s_005ftextfield_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
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

  private boolean _jspx_meth_s_005ftextfield_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f18 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f18.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setId("requiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setName("strRequiredDate");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setValue("%{#requiredDate}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setKey("labelkey");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setReadonly("false");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(126,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setCssStyle("width:100px;color:black;");
    int _jspx_eval_s_005ftextfield_005f18 = _jspx_th_s_005ftextfield_005f18.doStartTag();
    if (_jspx_th_s_005ftextfield_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fkey_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(138,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f23.setTest("%{orderToEdit.clientLastName==null || orderToEdit.clientLastName==\"\" || orderToEdit.clientLastName.bytes.length > 40 }");
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
        if (_jspx_meth_s_005ftextfield_005f19(_jspx_th_s_005fif_005f23, _jspx_page_context))
          return true;
        out.write(" \n");
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

  private boolean _jspx_meth_s_005ftextfield_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f19 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f23);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setId("clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setName("orderToEdit.clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setValue("%{orderToEdit.clientLastName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(139,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f19.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f19 = _jspx_th_s_005ftextfield_005f19.doStartTag();
    if (_jspx_th_s_005ftextfield_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f19);
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
        if (_jspx_meth_s_005ftextfield_005f20(_jspx_th_s_005felse_005f14, _jspx_page_context))
          return true;
        out.write(" \n");
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

  private boolean _jspx_meth_s_005ftextfield_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f20 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f14);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setId("clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setName("orderToEdit.clientLastName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setValue("%{orderToEdit.clientLastName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(142,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f20.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f20 = _jspx_th_s_005ftextfield_005f20.doStartTag();
    if (_jspx_th_s_005ftextfield_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f20);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(145,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f24.setTest("%{orderToEdit.clientFirstName==null || orderToEdit.clientFirstName==\"\" || orderToEdit.clientFirstName.bytes.length > 30}");
    int _jspx_eval_s_005fif_005f24 = _jspx_th_s_005fif_005f24.doStartTag();
    if (_jspx_eval_s_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f24.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t<font style=\"color: #484848;\">CLIENT FIRST NAME: </font>");
        if (_jspx_meth_s_005ftextfield_005f21(_jspx_th_s_005fif_005f24, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f21 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f24);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setId("clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setName("orderToEdit.clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setValue("%{orderToEdit.clientFirstName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(146,63) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f21.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f21 = _jspx_th_s_005ftextfield_005f21.doStartTag();
    if (_jspx_th_s_005ftextfield_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f21);
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
        out.write("\t\t \t\t\t\t<font style=\"color: #484848;\">CLIENT FIRST NAME: </font>");
        if (_jspx_meth_s_005ftextfield_005f22(_jspx_th_s_005felse_005f15, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f22 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f15);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setId("clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setName("orderToEdit.clientFirstName");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setValue("%{orderToEdit.clientFirstName}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(149,63) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f22.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f22 = _jspx_th_s_005ftextfield_005f22.doStartTag();
    if (_jspx_th_s_005ftextfield_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f23 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f23.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setId("clientOtherNames");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setName("orderToEdit.clientOtherNames");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setValue("%{orderToEdit.clientOtherNames}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(155,10) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f23.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f23 = _jspx_th_s_005ftextfield_005f23.doStartTag();
    if (_jspx_th_s_005ftextfield_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f23);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(165,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f25.setTest("%{orderToEdit.companyHeader!=null && orderToEdit.companyHeader.bytes.length > 40}");
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
        if (_jspx_meth_s_005ftextfield_005f24(_jspx_th_s_005fif_005f25, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f24 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f25);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setId("companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setName("orderToEdit.companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setValue("%{orderToEdit.companyHeader}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(166,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f24.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f24 = _jspx_th_s_005ftextfield_005f24.doStartTag();
    if (_jspx_th_s_005ftextfield_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f24);
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
        if (_jspx_meth_s_005ftextfield_005f25(_jspx_th_s_005felse_005f16, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f25 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f16);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setId("companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setName("orderToEdit.companyHeader");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setValue("%{orderToEdit.companyHeader}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(169,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f25.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f25 = _jspx_th_s_005ftextfield_005f25.doStartTag();
    if (_jspx_th_s_005ftextfield_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f25);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(178,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f26.setTest("%{orderToEdit.clientStreet==null || orderToEdit.clientStreet==\"\" || orderToEdit.clientStreet.bytes.length > 44}");
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
        if (_jspx_meth_s_005ftextfield_005f26(_jspx_th_s_005fif_005f26, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f26 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f26);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setId("clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setName("orderToEdit.clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setValue("%{orderToEdit.clientStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(179,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f26.setCssStyle("width:305px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f26 = _jspx_th_s_005ftextfield_005f26.doStartTag();
    if (_jspx_th_s_005ftextfield_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f26);
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
        if (_jspx_meth_s_005ftextfield_005f27(_jspx_th_s_005felse_005f17, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f27 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f17);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setId("clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setName("orderToEdit.clientStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setValue("%{orderToEdit.clientStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(182,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f27.setCssStyle("width:330px;color:black;");
    int _jspx_eval_s_005ftextfield_005f27 = _jspx_th_s_005ftextfield_005f27.doStartTag();
    if (_jspx_th_s_005ftextfield_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f27);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(192,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f27.setTest("%{orderToEdit.clientOtherStreet!=null && orderToEdit.clientOtherStreet.bytes.length > 44}");
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
        if (_jspx_meth_s_005ftextfield_005f28(_jspx_th_s_005fif_005f27, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f28 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f27);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setId("clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setName("orderToEdit.clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setValue("%{orderToEdit.clientOtherStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(193,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f28.setCssStyle("width:330px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f28 = _jspx_th_s_005ftextfield_005f28.doStartTag();
    if (_jspx_th_s_005ftextfield_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f28);
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
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f29(_jspx_th_s_005felse_005f18, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f29 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f18);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setId("clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setName("orderToEdit.clientOtherStreet");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setValue("%{orderToEdit.clientOtherStreet}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(196,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f29.setCssStyle("width:330px;color:black;");
    int _jspx_eval_s_005ftextfield_005f29 = _jspx_th_s_005ftextfield_005f29.doStartTag();
    if (_jspx_th_s_005ftextfield_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f29);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(209,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f28.setTest("%{orderToEdit.clientProvince==null || orderToEdit.clientProvince==\"\"\n		 						   || orderToEdit.provinceNotFound==1}");
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
        if (_jspx_meth_s_005fselect_005f2(_jspx_th_s_005fif_005f28, _jspx_page_context))
          return true;
        out.write("\t\t\t        \n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f30(_jspx_th_s_005fif_005f28, _jspx_page_context))
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

  private boolean _jspx_meth_s_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f2 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f28);
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

  private boolean _jspx_meth_s_005ftextfield_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f30 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f28);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setId("clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setName("orderToEdit.clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setValue("%{orderToEdit.clientProvince}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(221,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f30.setCssStyle("width:172px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f30 = _jspx_th_s_005ftextfield_005f30.doStartTag();
    if (_jspx_th_s_005ftextfield_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f30);
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
        if (_jspx_meth_s_005fselect_005f3(_jspx_th_s_005felse_005f19, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f31(_jspx_th_s_005felse_005f19, _jspx_page_context))
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

  private boolean _jspx_meth_s_005fselect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f3 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f19);
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

  private boolean _jspx_meth_s_005ftextfield_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f31 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f19);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setId("clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setName("orderToEdit.clientProvince");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setValue("%{orderToEdit.clientProvince}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(234,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f31.setCssStyle("width:172px;color:black;");
    int _jspx_eval_s_005ftextfield_005f31 = _jspx_th_s_005ftextfield_005f31.doStartTag();
    if (_jspx_th_s_005ftextfield_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f31);
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
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(245,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f29.setTest("%{orderToEdit.clientCity==null || orderToEdit.clientCity==\"\" || orderToEdit.clientCity.bytes.length > 25}");
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
        if (_jspx_meth_s_005ftextfield_005f32(_jspx_th_s_005fif_005f29, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f32 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f29);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setId("clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setName("orderToEdit.clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setValue("%{orderToEdit.clientCity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(246,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f32.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f32 = _jspx_th_s_005ftextfield_005f32.doStartTag();
    if (_jspx_th_s_005ftextfield_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f32);
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
        if (_jspx_meth_s_005ftextfield_005f33(_jspx_th_s_005felse_005f20, _jspx_page_context))
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

  private boolean _jspx_meth_s_005ftextfield_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f33 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f20);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setId("clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setName("orderToEdit.clientCity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setValue("%{orderToEdit.clientCity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(249,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f33.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f33 = _jspx_th_s_005ftextfield_005f33.doStartTag();
    if (_jspx_th_s_005ftextfield_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f30 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f30.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(260,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f30.setTest("%{orderToEdit.clientPostalCode==null || orderToEdit.clientPostalCode==\"\"  || orderToEdit.clientPostalCode.bytes.length > 14}");
    int _jspx_eval_s_005fif_005f30 = _jspx_th_s_005fif_005f30.doStartTag();
    if (_jspx_eval_s_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f30.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f34(_jspx_th_s_005fif_005f30, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f34 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f30);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setId("clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setName("orderToEdit.clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setValue("%{orderToEdit.clientPostalCode}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(261,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f34.setCssStyle("width:150px;background-color:#FF6666;color:black;");
    int _jspx_eval_s_005ftextfield_005f34 = _jspx_th_s_005ftextfield_005f34.doStartTag();
    if (_jspx_th_s_005ftextfield_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f21 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f21.setParent(null);
    int _jspx_eval_s_005felse_005f21 = _jspx_th_s_005felse_005f21.doStartTag();
    if (_jspx_eval_s_005felse_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f21.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f35(_jspx_th_s_005felse_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f35 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f21);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setId("clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setName("orderToEdit.clientPostalCode");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setValue("%{orderToEdit.clientPostalCode}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(264,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f35.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f35 = _jspx_th_s_005ftextfield_005f35.doStartTag();
    if (_jspx_th_s_005ftextfield_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f31 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f31.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(274,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f31.setTest("%{orderToEdit.clientPostalCode!=null && orderToEdit.clientPhone.bytes.length > 25}");
    int _jspx_eval_s_005fif_005f31 = _jspx_th_s_005fif_005f31.doStartTag();
    if (_jspx_eval_s_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f31.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f36(_jspx_th_s_005fif_005f31, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f36 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f31);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setId("clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setName("orderToEdit.clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setValue("%{orderToEdit.clientPhone}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(275,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f36.setCssStyle("width:150px;color:black;background-color:#FF6666;");
    int _jspx_eval_s_005ftextfield_005f36 = _jspx_th_s_005ftextfield_005f36.doStartTag();
    if (_jspx_th_s_005ftextfield_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f36);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f22 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f22.setParent(null);
    int _jspx_eval_s_005felse_005f22 = _jspx_th_s_005felse_005f22.doStartTag();
    if (_jspx_eval_s_005felse_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f22.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f37(_jspx_th_s_005felse_005f22, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f37 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f37.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f22);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setId("clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setName("orderToEdit.clientPhone");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setValue("%{orderToEdit.clientPhone}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(278,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f37.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f37 = _jspx_th_s_005ftextfield_005f37.doStartTag();
    if (_jspx_th_s_005ftextfield_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f37);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f32 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f32.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(288,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f32.setTest("%{orderToEdit.clientEmail!=null && orderToEdit.clientEmail.bytes.length > 60}");
    int _jspx_eval_s_005fif_005f32 = _jspx_th_s_005fif_005f32.doStartTag();
    if (_jspx_eval_s_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f32.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f38(_jspx_th_s_005fif_005f32, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
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

  private boolean _jspx_meth_s_005ftextfield_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f38 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f38.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f32);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setId("clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setName("orderToEdit.clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setValue("%{orderToEdit.clientEmail}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(289,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f38.setCssStyle("width:305px;color:black;background-color:#FF6666;");
    int _jspx_eval_s_005ftextfield_005f38 = _jspx_th_s_005ftextfield_005f38.doStartTag();
    if (_jspx_th_s_005ftextfield_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f38);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f23 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f23.setParent(null);
    int _jspx_eval_s_005felse_005f23 = _jspx_th_s_005felse_005f23.doStartTag();
    if (_jspx_eval_s_005felse_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f23.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f39(_jspx_th_s_005felse_005f23, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f39 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f39.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f23);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setId("clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setName("orderToEdit.clientEmail");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setValue("%{orderToEdit.clientEmail}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(292,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f39.setCssStyle("width:150px;color:black;");
    int _jspx_eval_s_005ftextfield_005f39 = _jspx_th_s_005ftextfield_005f39.doStartTag();
    if (_jspx_th_s_005ftextfield_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f39);
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
        if (_jspx_meth_s_005fif_005f33(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
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

  private boolean _jspx_meth_s_005fif_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f33 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(322,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f33.setTest("%{toDelete==0}");
    int _jspx_eval_s_005fif_005f33 = _jspx_th_s_005fif_005f33.doStartTag();
    if (_jspx_eval_s_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f33.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t    <tr valign=\"middle\" align=\"center\">\n");
        out.write("\t\t\t   \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;");
        if (_jspx_meth_s_005fproperty_005f56(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextfield_005f40(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    \t<td style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\" width=\"130px\">\n");
        out.write("\t\t  \t\t \t\t       <center id=\"userId\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f57(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t   \t\t \t\t       <center id=\"productId\"  style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f58(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"lsOrderId\"  style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f59(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"indexOrder\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f60(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <center id=\"indexRow\"   style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f61(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("\t\t  \t\t \t\t       <!-- .............. QUANTITY ............ -->\n");
        out.write("\t\t \t\t\t\t\t \n");
        out.write("\t\t  \t\t \t\t\t  <!--  ");
        if (_jspx_meth_s_005ftextfield_005f41(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write(" -->\n");
        out.write("\t\t  \t\t \t\t\t  <input type=\"text\" id=\"quantity\" name=\"quantity\" value='");
        if (_jspx_meth_s_005fproperty_005f62(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:40px;");
        if (_jspx_meth_s_005fproperty_005f63(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t\t  <font style=\"color: #484848;\">SP:</font>");
        if (_jspx_meth_s_005ftextfield_005f42(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t  \t\t    <td style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextfield_005f43(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t \t\n");
        out.write("\t \t\t\t \t<!-- .............. lsPrice and unitPrice ............ -->\n");
        out.write("\t \t\t\t \t");
        if (_jspx_meth_s_005fif_005f34(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\n");
        out.write("\t\t  \t\t \t<!-- .............. lsPrice and unitPrice with CUrrency ............ -->\n");
        out.write("\t\t  \t\t \t");
        if (_jspx_meth_s_005felse_005f24(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t  \t\t \t\n");
        out.write("\t\t  \t\t \t<td align=\"center\" width=\"60px\" style=\"border-right: 1px solid #CCCCCC;\"><span style=\"color:black;background-color: white;\">");
        if (_jspx_meth_s_005fproperty_005f71(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</span></td>      \n");
        out.write("\t\t  \t\t \t<td width=\"25px\"><img id=\"iconSaveTemporaryRow\" src='");
        if (_jspx_meth_s_005fproperty_005f72(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("'  style=\"cursor:pointer;\"/></td>\n");
        out.write("\t\t  \t\t \t<td width=\"25px\"><img id=\"iconSimilarRow\" src=\"images/orders/similarRow.png\"  style=\"cursor:pointer;\"/></td>\n");
        out.write("\t\t  \t\t    <td width=\"25px\" colspan=\"2\" style=\"border-right: 1px solid #CCCCCC;\"><img id=\"iconDeleteRow\" src=\"images/orders/deleteItem.png\" style=\"cursor:pointer;\"/></td>       \n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <!-- Heel of Order Rows -->\n");
        out.write("\t\t\t    <tr style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t    \t<td align=\"center\" colspan=\"3\"><span style=\"color: #484848;\"><font style=\"color: #484848;\">[Quantity Original: </font><font style=\"color: black;background-color:white;\">");
        if (_jspx_meth_s_005fproperty_005f73(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</font> ]</span></td>\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"2\"><font style=\"color: #484848;\">SHIPPING FEE:</font></td>\n");
        out.write("\t\t\t    \t");
        if (_jspx_meth_s_005fif_005f35(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t \t\t");
        if (_jspx_meth_s_005felse_005f25(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <tr style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t   \t\t<td align=\"center\" colspan=\"3\"><font style=\"color: #484848;\"><span style=\"color: #484848;\"><font style=\"color: #484848;\">[Provided_Ls_Product_ID: </font><font style=\"color: black;background-color:white;\">");
        if (_jspx_meth_s_005fproperty_005f75(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</font> ]</span></td>\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"2\"><font style=\"color: #484848;\">SHIPPING COMPANY:</font></td>\n");
        out.write("\t\t\t \t\t<td colspan=\"6\" align=\"left\">");
        if (_jspx_meth_s_005ftextfield_005f46(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    <tr  style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t    \t<td align=\"right\" colspan=\"5\"  style=\"padding-bottom:10px;\"><font style=\"color: #484848;\">TRACKING NUMBER:</font></td>\n");
        out.write("\t\t\t \t\t<td colspan=\"6\" align=\"left\" style=\"padding-bottom:10px;\">");
        if (_jspx_meth_s_005ftextfield_005f47(_jspx_th_s_005fif_005f33, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t    </tr>\n");
        out.write("\t\t\t    ");
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

  private boolean _jspx_meth_s_005fproperty_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f56 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f56.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005ftextfield_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f40 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f40.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setId("lsProductID");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setName("lsProductID");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setValue("%{lsProductID}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(325,81) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f40.setCssStyle("width:120px;margin-left:2px;color:black;");
    int _jspx_eval_s_005ftextfield_005f40 = _jspx_th_s_005ftextfield_005f40.doStartTag();
    if (_jspx_th_s_005ftextfield_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f40);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f57 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f57.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f58 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f58.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f59 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f59.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f60 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f60.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f61 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f61.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005ftextfield_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f41 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f41.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setId("quantity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setName("quantity");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setValue("%{quantity}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(335,18) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f41.setCssStyle("width:40px;");
    int _jspx_eval_s_005ftextfield_005f41 = _jspx_th_s_005ftextfield_005f41.doStartTag();
    if (_jspx_th_s_005ftextfield_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f41);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f62 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f62.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f63 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f63.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005ftextfield_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f42 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f42.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setId("quantityToChange");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setName("quantityToSplit");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setValue("%{quantityToSplit}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(337,52) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f42.setCssStyle("width:40px;color:black;");
    int _jspx_eval_s_005ftextfield_005f42 = _jspx_th_s_005ftextfield_005f42.doStartTag();
    if (_jspx_th_s_005ftextfield_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f42);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f43 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f43.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setId("stock");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setName("stock");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setValue("%{stock}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setReadonly("true");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(339,81) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f43.setCssStyle("width:70px;color:black;");
    int _jspx_eval_s_005ftextfield_005f43 = _jspx_th_s_005ftextfield_005f43.doStartTag();
    if (_jspx_th_s_005ftextfield_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f43);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fif_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f34 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(344,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f34.setTest("%{orderToEdit.currencyId == 1}");
    int _jspx_eval_s_005fif_005f34 = _jspx_th_s_005fif_005f34.doStartTag();
    if (_jspx_eval_s_005fif_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f34.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t \t\t\t \t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t  \t\t \t\t\t\t<span style=\"margin-left:2px;width:70px;background-color: white;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f64(_jspx_th_s_005fif_005f34, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t  \t\t \t\t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t\t  \t\t \t\t\t<input type=\"text\" id=\"unitPrice\" name=\"unitPrice\" value='");
        if (_jspx_meth_s_005fproperty_005f65(_jspx_th_s_005fif_005f34, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:70px;margin-left:2px;");
        if (_jspx_meth_s_005fproperty_005f66(_jspx_th_s_005fif_005f34, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f64 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f64.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f34);
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

  private boolean _jspx_meth_s_005fproperty_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f65 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f65.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f34);
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

  private boolean _jspx_meth_s_005fproperty_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f66 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f66.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f34);
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

  private boolean _jspx_meth_s_005felse_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f24 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    int _jspx_eval_s_005felse_005f24 = _jspx_th_s_005felse_005f24.doStartTag();
    if (_jspx_eval_s_005felse_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f24.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  \t\t \t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t  \t\t \t\t\t\t<span style=\"margin-left:2px;width:70px;background-color: white;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f67(_jspx_th_s_005felse_005f24, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t  \t\t \t\t\t<td  style=\"border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;\n");
        out.write("\t\t  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("\t\t  \t\t \t\t\t<input type=\"text\" id=\"unitPrice\" name=\"unitPrice\" value='");
        if (_jspx_meth_s_005fproperty_005f68(_jspx_th_s_005felse_005f24, _jspx_page_context))
          return true;
        out.write("' style='color:black;width:70px;margin-left:2px;");
        if (_jspx_meth_s_005fproperty_005f69(_jspx_th_s_005felse_005f24, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t\t<td>\n");
        out.write("\t\t  \t\t \t\t\t<span style=\"margin-left:2px;width:40px;color: red;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f70(_jspx_th_s_005felse_005f24, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t  \t\t \t\t</td>\n");
        out.write("\t\t  \t\t \t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f67 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f67.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f24);
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

  private boolean _jspx_meth_s_005fproperty_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f68 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f68.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f24);
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

  private boolean _jspx_meth_s_005fproperty_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f69 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f69.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f24);
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

  private boolean _jspx_meth_s_005fproperty_005f70(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f70 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f70.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f24);
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

  private boolean _jspx_meth_s_005fproperty_005f71(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f71 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f71.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f72(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f72 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f72.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fproperty_005f73(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f73 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f73.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005fif_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f35 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(385,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f35.setTest("%{orderToEdit.currencyId == 1}");
    int _jspx_eval_s_005fif_005f35 = _jspx_th_s_005fif_005f35.doStartTag();
    if (_jspx_eval_s_005fif_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f35.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t \t\t\t<td colspan=\"6\" align=\"left\">");
        if (_jspx_meth_s_005ftextfield_005f44(_jspx_th_s_005fif_005f35, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t \t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f35, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f44 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f44.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f35);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setId("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setName("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(386,36) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f44.setCssStyle("color:black;width:70px;");
    int _jspx_eval_s_005ftextfield_005f44 = _jspx_th_s_005ftextfield_005f44.doStartTag();
    if (_jspx_th_s_005ftextfield_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f44);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f25 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    int _jspx_eval_s_005felse_005f25 = _jspx_th_s_005felse_005f25.doStartTag();
    if (_jspx_eval_s_005felse_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f25.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t \t\t\t<td colspan=\"6\" align=\"left\">\n");
        out.write("\t\t\t \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f45(_jspx_th_s_005felse_005f25, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t \t\t\t\t<span style=\"width:40px;color: red;font-weight: bold;\">\n");
        out.write("\t  \t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f74(_jspx_th_s_005felse_005f25, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t  \t\t \t\t\t\t</span>\n");
        out.write("\t\t\t \t\t\t</td>\n");
        out.write("\t\t\t \t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f45 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f45.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f25);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f45.setId("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f45.setName("shippingFee");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f45.setValue("%{shippingPrice}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(390,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f45.setCssStyle("color:black;width:80px;");
    int _jspx_eval_s_005ftextfield_005f45 = _jspx_th_s_005ftextfield_005f45.doStartTag();
    if (_jspx_th_s_005ftextfield_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f45);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f74(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f74 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f74.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f25);
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

  private boolean _jspx_meth_s_005fproperty_005f75(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f75 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f75.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
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

  private boolean _jspx_meth_s_005ftextfield_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f46 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f46.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f46.setId("shippingCompany");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f46.setName("shippingCompany");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f46.setValue("%{shippingCompany}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(400,35) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f46.setCssStyle("color:black;width:180px;");
    int _jspx_eval_s_005ftextfield_005f46 = _jspx_th_s_005ftextfield_005f46.doStartTag();
    if (_jspx_th_s_005ftextfield_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f46);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f47 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f47.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f33);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f47.setId("trackingNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f47.setName("trackingNumber");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f47.setValue("%{trackingNumber}");
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(404,64) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f47.setCssStyle("color:black;width:180px;");
    int _jspx_eval_s_005ftextfield_005f47 = _jspx_th_s_005ftextfield_005f47.doStartTag();
    if (_jspx_th_s_005ftextfield_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f47);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f36 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f36.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/orderDetailPop.jsp(419,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f36.setTest("%{userPrivileges!=null}");
    int _jspx_eval_s_005fif_005f36 = _jspx_th_s_005fif_005f36.doStartTag();
    if (_jspx_eval_s_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f36.doInitBody();
      }
      do {
        out.write("\t   \n");
        out.write("\t\t\t\t<input id=\"btDeleteOrder\"  type=\"submit\" value=\"Delete this Order\"\n");
        out.write("\t\t\t\t   \t   style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color: #FF6666;color:white;font-weight: bold;\" />\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f36);
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
