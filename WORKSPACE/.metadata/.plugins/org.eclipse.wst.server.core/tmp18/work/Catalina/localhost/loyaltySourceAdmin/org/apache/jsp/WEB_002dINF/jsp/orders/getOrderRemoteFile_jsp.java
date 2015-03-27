package org.apache.jsp.WEB_002dINF.jsp.orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getOrderRemoteFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/notificationPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"thumbnailhover_files/jquery-latest.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/loyalty/order/orderManager.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#topMenuRed\").hide();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("label{\n");
      out.write("\twidth:170px;\n");
      out.write("}\n");
      out.write(".vanadium-advice {\n");
      out.write("\tmargin-left: 170px;\n");
      out.write("}\n");
      out.write("input.vanadium-valid {\n");
      out.write("\tbackground-image: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div id=\"page\" class=\"unit\" style=\"width:800px;margin-left:100px;\">\n");
      out.write("<div class=\"pop_title\" style=\"margin-top:30px;\">Create Order from Remote File</div>\n");
      out.write("\n");
      out.write("  <div id=\"formContainer\" style=\"padding-bottom: 60px;\">\n");
      out.write("      \n");
      out.write(" ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("  <br/> <br/>\n");
      out.write("\n");
      out.write("  <form id=\"form\" action=\"createOrdersAutoRemoteFile.do\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write(" \t<!-- .......... Hidden variables to use when admin do an action event ........ -->\n");
      out.write(" \t");
      if (_jspx_meth_s_005fhidden_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f2(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f3(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f4(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f5(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f6(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f7(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f8(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f9(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f10(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f11(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f12(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f13(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f14(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f15(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f16(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" \t \n");
      out.write(" \t<!-- ......................................................................... -->\n");
      out.write("  \n");
      out.write("  <table width=\"100%\" border=\"0\">\n");
      out.write("  <tr>\n");
      out.write("  \t  <!-- ................................. USER LOGIN .......................... -->\n");
      out.write("\t  <td>\n");
      out.write("\t  <table border=\"0\" width=\"100%\" style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("  \t\t border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:top;\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"10px\">\n");
      out.write("\t\t\t\t<td colspan=\"4\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ...................... Client Login ............... -->\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 20px;width:140px;\">Client Login:</td>\n");
      out.write("\t\t\t\t<td width=\"170px\">\n");
      out.write("\t\t\t\t\t<div class=\"ui-widget\">\n");
      out.write("\t\t   \t\t\t<span style=\"font-size:12px;\">\n");
      out.write("\t\t   \t\t\t<input type=\"text\" id=\"txtUserLoginTo\" name=\"userLogin\" value='");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("' Style=\"width:150px\"  autocomplete=\"off\"/>\n");
      out.write("\t\t   \t\t\t</span>\n");
      out.write("\t\t   \t\t\t</div>\n");
      out.write("\t\t   \t\t\t<div style=\"position:absolute;\">  \n");
      out.write("\t\t   \t\t\t <select id=\"selectUsersTag\"  name=\"sometext\" size=\"2\" multiple=\"multiple\" class=\"selectUsersTag\"\n");
      out.write("\t\t   \t\t\t \t\t style=\"height:67px;width:155px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;\" scrolling=\"no\">\n");
      out.write("\t\t\t\t\t    <option></option>\n");
      out.write("\t\t\t\t\t </select>\n");
      out.write("\t\t   \t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td  align=\"left\"  height=\"30px\">All Files: ");
      if (_jspx_meth_s_005fcheckbox_005f0(_jspx_page_context))
        return;
      out.write(" </td>\n");
      out.write("\t\t\t\t<td  align=\"right\" width=\"50px\" height=\"30px\"><img id=\"iconFindPartner\" style=\"padding-right: 20px;\" src=\"images/orders/findOrders.png\" title=\"Find user PO\"/></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"4\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\t\t\t\t<!-- ...................... File Name ............... -->\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td style=\"padding-left: 20px;width:140px;\">File Name:</td>\n");
      out.write("\t\t\t\t<td colspan=\"3\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"10px\">\n");
      out.write("\t\t\t\t<td colspan=\"4\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...................... Files List ................. -->\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"4\" style=\"padding-left:20px;padding-right:20px;\">\n");
      out.write("\t\t\t\t\t<table id=\"tabUserFiles\" style=\"direction: ltr;table-layout: fixed;\" border=\"0\" width=\"447px\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr height=\"25px\" style=\"border:1px solid #CCCCCC;\">\n");
      out.write("\t\t\t\t\t\t<th width=\"240px\">File Name</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"155px\">Creation Date</th>\n");
      out.write("\t\t\t\t\t\t<th style=\"padding-right: 10px;\">Status</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"5px\">\n");
      out.write("\t\t\t\t<td colspan=\"4\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ...................... submit ..................... -->\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"4\"><input type=\"button\" id=\"btUpload\" value=\"Upload\" style=\"margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;\"/></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t\t<tr height=\"10px\">\n");
      out.write("\t\t\t\t<td colspan=\"4\"/>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<!-- ................................................... -->\n");
      out.write("\t  </table>\n");
      out.write("\t  </td>\n");
      out.write("\t  <!-- ................................. USER LOGO .......................... -->\n");
      out.write("\t  <td width=\"300px\" align=\"right\" valign=\"top\">\n");
      out.write("\t  ");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t  ");
      if (_jspx_meth_s_005felse_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t  </td>\n");
      out.write("  </tr>\n");
      out.write("  </table>\n");
      out.write("  \n");
      out.write("  </form>\n");
      out.write(" \n");
      out.write("\t<!-- FORM FOR DOWNLOAD --> \n");
      out.write("    <form id=\"formToPrint\" action=\"printOrdersToPDF.do\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("   \t\t");
      if (_jspx_meth_s_005fhidden_005f17(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f18(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_s_005fhidden_005f19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <!-- ............................ List users .................................. --> \n");
      out.write("\t<select id=\"list\"  style=\"visibility:hidden;display:none;\">\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fiterator_005f2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\t</select> \n");
      out.write("  <!-- ......................................................................... -->\n");
      out.write("\n");
      out.write("  <!-- ............................. Orders List ............................... -->\n");
      out.write("  <br/><br/>\n");
      out.write("  Result:");
      if (_jspx_meth_s_005fproperty_005f7(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      out.write(' ');
      if (_jspx_meth_s_005fhidden_005f20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <br/>\n");
      out.write("  <br/>\n");
      out.write(" ");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" <!-- ......................................................................... -->\t\n");
      out.write("  \n");
      out.write(" <!-- ...........................jsp fragment ................................. -->\n");
      out.write("\t     ");
      out.write("<style type=\"text/css\" >\n");
      out.write("\t#notificationPop {\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\twidth:20%;\n");
      out.write("\t\theight:155px;\n");
      out.write("\t\ttop:30%;\n");
      out.write("\t\tleft:37%;\n");
      out.write("\t\tborder:1px solid #B0C4DE;\n");
      out.write("\t\tz-index: 300;\n");
      out.write("\t\tdisplay:none;\n");
      out.write("\t\tvisibility:hidden;\n");
      out.write("\t\tpadding-top:5px;\n");
      out.write("\t\tbackground-color:rgb(85,85,85);\n");
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
      out.write("\t\tobjSelected.style.cursor = \"move\";\n");
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
      out.write("<div id=\"notificationPop\" class=\"conteneurPrompt\" style='");
      if (_jspx_meth_s_005fproperty_005f33(_jspx_page_context))
        return;
      out.write("'  >\n");
      out.write("\t\t<span id=\"titlePop\" style=\"color:white;font-size: 16px;vertical-align: middle;\">Notification</span>\n");
      out.write("\t\t<div style=\"height: 5px;\"></div>\n");
      out.write("\t\t<!-- *************************************************** Le Body ********************************************************** -->\t\t\t \t\n");
      out.write("\t\t <div style=\"width:100%;height:130px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;\">\n");
      out.write("\t\t\t\t \t<center>\n");
      out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"130px\" border=\"0\">\n");
      out.write("\t\t\t \t\t\n");
      out.write("\t\t\t \t\t\t<tr>\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" style=\"padding-left: 20px;padding-right: 20px;\">\n");
      out.write("\t\t\t\t \t\t\t\t<div style=\"max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\">\n");
      out.write("\t\t\t\t \t\t\t\t\t<center id=\"msgConfirmation\">");
      if (_jspx_meth_s_005fproperty_005f34(_jspx_page_context))
        return;
      out.write("</center>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t \t\t\t</td>\n");
      out.write("\t\t\t \t\t\t</tr>\n");
      out.write("       \n");
      out.write("\t\t\t \t\t\t<tr height=\"45px\" valign=\"top\">\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"3\" align=\"center\">\n");
      out.write("\n");
      out.write("\t\t\t\t \t\t\t<input id=\"btCancel\"  type=\"submit\" value=\"OK\"\n");
      out.write("\t\t\t\t \t\t\t     style=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\" /></td>\n");
      out.write("\t\t\t \t\t\t</tr>\n");
      out.write("\t\t\t \t\t\t\t\t \t\t\t\n");
      out.write("\t\t\t \t\t</table>\n");
      out.write("\t\t\t \t\t</center>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- ......................................................................... -->\n");
      out.write("\t\n");
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
      if (_jspx_meth_s_005fproperty_005f35(_jspx_page_context))
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
      if (_jspx_meth_s_005fproperty_005f36(_jspx_page_context))
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
      out.write(" <!-- ......................................................................... -->\t\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("// Jquery Function main \n");
      out.write("var pageTop=0;\n");
      out.write("var scrollTop;\n");
      out.write("var rowSelected=-1;\n");
      out.write("var lastRowSelected=-1;\n");
      out.write("var csslastRowSelected=\"\";\n");
      out.write("$(function() {\n");
      out.write("\tvar pageTop = ");
      out.print( request.getParameter("pageTop") );
      out.write(";\n");
      out.write("\t$(window).scrollTop(pageTop);\n");
      out.write("\t// winker image of new PO \n");
      out.write("\t$('#tabUserFiles img[id=\"imgNewPoId\"]').effect(\"pulsate\", { times:999}, 2000);\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document).ready(function() { \n");
      out.write("\t/*------------------------- check checkBox without submit -------------------------------- \n");
      out.write("\tPour éviter d'aller à chaque changement du check box on utilise un string qui porte\n");
      out.write("\tles valeurs de tous les check Box et une fois on click sur le un bouton de print ou\n");
      out.write("\tgetXSL on envoie juste cette string, c'est une méthode intelligente pour soulager \n");
      out.write("\tle server et pour éviter les secousse de barre de défilement\n");
      out.write(" \t----------------------------------------------------------------------------------------*/\n");
      out.write("\tvar arrayPrint = [];\n");
      out.write("\tvar sizeResult=$(\"#sizeResult\").val();\n");
      out.write("\tfor(i=0;i<sizeResult;i++){\n");
      out.write("\t\tarrayPrint[i] =false;\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tfunction createStrPrint(){\n");
      out.write("\t\tvar index=0;\n");
      out.write("\t\t$('#colomnPrintItems input[id=\"checkBoxPrintItem\"]').each(function() {\n");
      out.write("\t\t\tarrayPrint[index]=$(this).attr('checked');\n");
      out.write("\t\t\tindex++;\n");
      out.write("\t\t});\n");
      out.write("\t\tvar strPrint=\"\";\n");
      out.write("\t\tfor(i=0;i<arrayPrint.length;i++){\n");
      out.write("\t\t\tif(arrayPrint[i]==true){\n");
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
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t/*---------------------------------------- Color Row -----------------------------------------\n");
      out.write("\t\t\t\t\t\t\twhen Admin selected Row, colored it in yellow\n");
      out.write("\t  --------------------------------------------------------------------------------------------*/ \n");
      out.write("\t$('#tabUserFiles tr[id=\"rowFile\"]').click( function() {\n");
      out.write("\t\tif(lastRowSelected>-1){\n");
      out.write("\t\t\t$('#tabUserFiles tr[id=\"rowFile\"]').eq(lastRowSelected).css(\"background-color\",csslastRowSelected);\n");
      out.write("\t\t}\n");
      out.write("\t\trowSelected=$('#tabUserFiles tr[id=\"rowFile\"]').index(this);\n");
      out.write("\t\tcsslastRowSelected=$('#tabUserFiles tr[id=\"rowFile\"]').eq(rowSelected).css(\"background-color\");\n");
      out.write("\t\tlastRowSelected=rowSelected;\n");
      out.write("\t\t$('#tabUserFiles tr[id=\"rowFile\"]').eq(rowSelected).css(\"background-color\",\"#FFFF99\");\n");
      out.write("\t\tvar fileNameItem=$('#tabUserFiles #fileNameItemId').eq(rowSelected).text();\n");
      out.write("\t\t$('#fileToImportId').val(fileNameItem);\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*------------------------------------- Upload File -------------------------------------- \n");
      out.write("\t\t\t\t\t\t\twhen Admin click on the button Upload\n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#btUpload\").click( function(){\n");
      out.write("\t\t//var oploadedFileName=$(\"#fileToUpload\").val();\n");
      out.write("\t\t//$(\"#oploadedFileNameFrm\").val(oploadedFileName);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
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
      out.write("\n");
      out.write("\t//when Admin click on the button Search user \n");
      out.write("\t$(\"#iconFindPartner\").click( function(){\n");
      out.write("\t\t$(\"#frmUserIdFindedSignal\").val(\"1\");\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//when Admin click on the button [save All] of popup dialog \n");
      out.write("\t$(\"#saveSuccessPop #btOK\").click( function(){\n");
      out.write("\t\t$(\"#okSaveSuccessPopSignal\").val(\"1\");\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin click on the button [save All] of popup dialog \n");
      out.write("\t$(\"#btSaveAll\").click( function(){\n");
      out.write("\t\t$(\"#saveOrdersSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#confirmSaveOrdersSignal\").val(\"1\");\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t//when Admin click on the button [Orders Lacking] of popup dialog \n");
      out.write("\t$(\"#btOrdersLacking\").click( function(){\n");
      out.write("\t\t$(\"#saveOrdersSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#confirmSaveOrdersSignal\").val(\"2\");\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\t\n");
      out.write("\t//when Admin click on the button [cancel] of popup dialog \n");
      out.write("\t$(\"#btCancel\").click( function(){\n");
      out.write("\t\t$(\"#saveOrdersSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#confirmSaveOrdersSignal\").val(\"3\");\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//when Admin click on the button saveOrders\n");
      out.write("\t$(\"#btSaveOrders\").click( function(){\n");
      out.write("\t\t$(\"#saveOrdersSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#pageTop\").val(0);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//when Admin click on the icon duplicate\n");
      out.write("\t$('#columnIconDuplicate img[id=\"iconDuplicate\"]').click( function(){\n");
      out.write("\t\tvar index=$('#columnIconDuplicate img[id=\"iconDuplicate\"]').index(this);\n");
      out.write("\t\tvar lsOrderId=$(\"#columnOrders #lsOrderId\").eq(index).text();\n");
      out.write("\t\t$(\"#indexOrder\").val(index);\n");
      out.write("\t\t$(\"#duplicateOrderSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#lsOrderId\").val(lsOrderId);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//when Admin left input text quantityToChange\n");
      out.write("\t$('#columnQuantity input[id=\"quantityToChange\"]').change( function(){\n");
      out.write("\t\tvar index=$('#columnQuantity input[id=\"quantityToChange\"]').index(this);\n");
      out.write("\t\tvar lsOrderId=$(\"#columnQuantity #lsOrderId\").eq(index).text();\n");
      out.write("\t\tvar quantityToChange=$('#columnQuantity input[id=\"quantityToChange\"]').eq(index).val();\n");
      out.write("\t\tvar indexRow=$(\"#columnQuantity #rowIndex\").eq(index).text();\n");
      out.write("\t\t//clean quantityToChange\n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tquantityToChange=quantityToChange.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean indexRow\n");
      out.write("\t\tindexRow=indexRow.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tindexRow=indexRow.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tindexRow=indexRow.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t$(\"#quantityToChangeSignal\").val(\"1\");\n");
      out.write("\t\t$(\"#lsOrderId\").val(lsOrderId);\n");
      out.write("\t\t$(\"#quantityToChange\").val(quantityToChange);\n");
      out.write("\t\t$(\"#indexRow\").val(indexRow);\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin click on the checkBox Print \n");
      out.write("\t$('#columnIconDuplicate #checkBoxPrintItem').click( function(){\n");
      out.write("\t\tvar index=$('#columnIconDuplicate #checkBoxPrintItem').index(this);\n");
      out.write("\t\tvar checkBoxPrintItem=$('#columnIconDuplicate #checkBoxPrintItem').eq(index).attr(\"checked\");\n");
      out.write("\t\tvar lsOrderIdToPrint=$(\"#columnOrders #lsOrderId\").eq(index).text();\n");
      out.write("\t\t$(\"#lsOrderId\").val(lsOrderIdToPrint);\n");
      out.write("\t\t//checked print etem \n");
      out.write("\t\t$(\"#checkBoxPrintSignal\").val(1);\n");
      out.write("\t\t$(\"#checkBoxPrint\").val(checkBoxPrintItem);\n");
      out.write("\t\t$(\"#indexOrder\").val(index);\n");
      out.write("\t\t$(\"#indexOrder\");\n");
      out.write("\t\tscrollTop=$(window).scrollTop();\n");
      out.write("\t\t$(\"#pageTop\").val(scrollTop);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin click on the button Print \n");
      out.write("\t$('#btPrintOrders').click( function(){\n");
      out.write("\t\t$('#tansformAutoSignal').val(1);\n");
      out.write("\t\t$('#printAllOrdersSignal').val(0);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formToPrint').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin click on the button Print All Orders \n");
      out.write("\t$('#btPrintAllOrders').click( function(){\n");
      out.write("\t\t$('#tansformAutoSignal').val(1);\n");
      out.write("\t\t$('#printAllOrdersSignal').val(1);\n");
      out.write("\t\tcreateStrPrint();\n");
      out.write("\t\t$('#formToPrint').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//when Admin Point on the button Find User Files \n");
      out.write("\t$(\"#iconFindPartner\").mouseover( function(){\n");
      out.write("\t\t$(\"#iconFindPartner\").css('width','30px');\n");
      out.write("\t\t$(\"#iconFindPartner\").css('hight','30px');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\"#iconFindPartner\").mouseout( function(){\n");
      out.write("\t\t$(\"#iconFindPartner\").css('width','24px');\n");
      out.write("\t\t$(\"#iconFindPartner\").css('hight','24px');\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(29,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("hasActionErrors()");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("  <div id=\"globalAdvice\" class=\"gray_bg global-vanadium-advice\">\n");
        out.write("  \t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</div>  \n");
        out.write("  \n");
        out.write(" ");
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

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(31,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("actionErrors");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("  \t\t\t\t<span>");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</span><br/>\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(32,12) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setEscape(false);
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(40,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("orderSelected");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(40,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("orderSelected");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(40,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(41,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("showOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(41,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("showOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(41,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setValue("0");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(42,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("okShowOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(42,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("okShowOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(42,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setValue("0");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f3 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f3.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(43,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("saveOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(43,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("saveOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(43,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setValue("0");
    int _jspx_eval_s_005fhidden_005f3 = _jspx_th_s_005fhidden_005f3.doStartTag();
    if (_jspx_th_s_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f4 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f4.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(44,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("confirmSaveOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(44,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("confirmSaveOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(44,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setValue("0");
    int _jspx_eval_s_005fhidden_005f4 = _jspx_th_s_005fhidden_005f4.doStartTag();
    if (_jspx_th_s_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f5 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f5.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(45,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setId("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(45,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setName("duplicateOrderSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(45,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setValue("0");
    int _jspx_eval_s_005fhidden_005f5 = _jspx_th_s_005fhidden_005f5.doStartTag();
    if (_jspx_th_s_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f6 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f6.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(46,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setId("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(46,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setName("okSaveSuccessPopSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(46,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f6.setValue("0");
    int _jspx_eval_s_005fhidden_005f6 = _jspx_th_s_005fhidden_005f6.doStartTag();
    if (_jspx_th_s_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f7 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f7.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(47,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setId("lsOrderId");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(47,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setName("lsOrderId");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(47,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f7.setValue("-1");
    int _jspx_eval_s_005fhidden_005f7 = _jspx_th_s_005fhidden_005f7.doStartTag();
    if (_jspx_th_s_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f8 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f8.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(48,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setId("quantityToChange");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(48,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setName("quantityToChange");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(48,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f8.setValue("0");
    int _jspx_eval_s_005fhidden_005f8 = _jspx_th_s_005fhidden_005f8.doStartTag();
    if (_jspx_th_s_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f9 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f9.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(49,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setId("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(49,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setName("quantityToChangeSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(49,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f9.setValue("0");
    int _jspx_eval_s_005fhidden_005f9 = _jspx_th_s_005fhidden_005f9.doStartTag();
    if (_jspx_th_s_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f10 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f10.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(50,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setId("indexOrder");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(50,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setName("indexOrder");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(50,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f10.setValue("-1");
    int _jspx_eval_s_005fhidden_005f10 = _jspx_th_s_005fhidden_005f10.doStartTag();
    if (_jspx_th_s_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f11 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f11.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(51,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setId("indexRow");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(51,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setName("indexRow");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(51,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f11.setValue("-1");
    int _jspx_eval_s_005fhidden_005f11 = _jspx_th_s_005fhidden_005f11.doStartTag();
    if (_jspx_th_s_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f12 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f12.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(52,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setId("checkBoxPrintSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(52,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setName("checkBoxPrintSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(52,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f12.setValue("0");
    int _jspx_eval_s_005fhidden_005f12 = _jspx_th_s_005fhidden_005f12.doStartTag();
    if (_jspx_th_s_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f13 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f13.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(53,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setId("checkBoxPrint");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(53,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f13.setName("checkBoxPrint");
    int _jspx_eval_s_005fhidden_005f13 = _jspx_th_s_005fhidden_005f13.doStartTag();
    if (_jspx_th_s_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f14 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f14.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(54,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setId("pageTop");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(54,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setName("pageTop");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(54,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f14.setValue("0");
    int _jspx_eval_s_005fhidden_005f14 = _jspx_th_s_005fhidden_005f14.doStartTag();
    if (_jspx_th_s_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f15 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f15.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(55,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setId("oploadedFileNameFrm");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(55,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setName("oploadedFileName");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(55,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f15.setValue("");
    int _jspx_eval_s_005fhidden_005f15 = _jspx_th_s_005fhidden_005f15.doStartTag();
    if (_jspx_th_s_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f16 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f16.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(56,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setId("frmUserIdFindedSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(56,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setName("userIdFindedSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(56,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f16.setValue("");
    int _jspx_eval_s_005fhidden_005f16 = _jspx_th_s_005fhidden_005f16.doStartTag();
    if (_jspx_th_s_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f16);
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
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(77,71) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("%{userLogin}");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f0.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(87,48) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setName("checkAllFiles");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(87,48) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setValue("%{checkAllFiles}");
    int _jspx_eval_s_005fcheckbox_005f0 = _jspx_th_s_005fcheckbox_005f0.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(100,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("fileToImportId");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(100,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("fileToImport");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(100,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("%{fileToImport}");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(100,4) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "Style", new String("width:150px;"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fid_005fStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(123,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("%{userFilelist}");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t          \t\t\t<tr id=\"rowFile\" height=\"25px\" style=\"cursor: pointer;\">\n");
        out.write("\t\t\t\t\t\t\t<td id=\"fileNameItemId\" style=\"border:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;\">");
        if (_jspx_meth_s_005fproperty_005f2(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t<td style=\"border:1px solid #CCCCCC;padding-left: 5px;\">");
        if (_jspx_meth_s_005fdate_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t<td style=\"border:1px solid #CCCCCC;padding-right: 10px;\" align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005felse_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(125,179) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("%{fileName}");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f0 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(126,63) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setName("creationDate");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(126,63) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setVar("creationDate");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(126,63) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setFormat("yyyy/MM/dd 'at' hh:mm a");
    int _jspx_eval_s_005fdate_005f0 = _jspx_th_s_005fdate_005f0.doStartTag();
    if (_jspx_th_s_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(126,144) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("%{#creationDate}");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(128,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("treated");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<img src=\"images/orders/poImported.png\" title=\"PO imported in DB\"/>\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005felse_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<img  id=\"imgNewPoId\" src=\"images/orders/newPo.png\" title=\"PO dosen't imported in DB\"/>\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(167,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{userLogo==null}");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t   <img alt=\"\" width=\"200px\" src='");
        if (_jspx_meth_s_005fproperty_005f4(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t  ");
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

  private boolean _jspx_meth_s_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(168,35) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("%{userLogo}");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
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
        out.write("\t  \t  <img alt=\"\" width=\"95%\" height=\"95%\" src='");
        if (_jspx_meth_s_005fproperty_005f5(_jspx_th_s_005felse_005f1, _jspx_page_context))
          return true;
        out.write("'/>\n");
        out.write("\t  ");
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

  private boolean _jspx_meth_s_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f5 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f1);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(171,48) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f5.setValue("%{userLogo}");
    int _jspx_eval_s_005fproperty_005f5 = _jspx_th_s_005fproperty_005f5.doStartTag();
    if (_jspx_th_s_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f17 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f17.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(181,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setId("strPrintInPDFForm");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(181,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setName("strPrint");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(181,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f17.setValue("null");
    int _jspx_eval_s_005fhidden_005f17 = _jspx_th_s_005fhidden_005f17.doStartTag();
    if (_jspx_th_s_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f18 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f18.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(182,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setId("tansformAutoSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(182,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setName("tansformAutoSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(182,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f18.setValue("0");
    int _jspx_eval_s_005fhidden_005f18 = _jspx_th_s_005fhidden_005f18.doStartTag();
    if (_jspx_th_s_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f19 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f19.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(183,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setId("printAllOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(183,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setName("printAllOrdersSignal");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(183,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f19.setValue("0");
    int _jspx_eval_s_005fhidden_005f19 = _jspx_th_s_005fhidden_005f19.doStartTag();
    if (_jspx_th_s_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f2 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f2.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(188,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setValue("%{usersList}");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(188,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setId("row");
    int _jspx_eval_s_005fiterator_005f2 = _jspx_th_s_005fiterator_005f2.doStartTag();
    if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t        ");
        if (_jspx_meth_s_005fiterator_005f3(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write("           \n");
        out.write("\t\t");
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

  private boolean _jspx_meth_s_005fiterator_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f3 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(189,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setValue("%{#row}");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(189,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setId("cell");
    int _jspx_eval_s_005fiterator_005f3 = _jspx_th_s_005fiterator_005f3.doStartTag();
    if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t    <option>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f6(_jspx_th_s_005fiterator_005f3, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t\t\t\t</option>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f6 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f3);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(191,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f6.setValue("%{#cell.login}");
    int _jspx_eval_s_005fproperty_005f6 = _jspx_th_s_005fproperty_005f6.doStartTag();
    if (_jspx_th_s_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f7 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f7.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(200,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f7.setValue("%{listOrdersDTO.size}");
    int _jspx_eval_s_005fproperty_005f7 = _jspx_th_s_005fproperty_005f7.doStartTag();
    if (_jspx_th_s_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f20 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f20.setParent(null);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(201,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setId("sizeResult");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(201,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setName("sizeResult");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(201,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f20.setValue("%{listOrdersDTO.size}");
    int _jspx_eval_s_005fhidden_005f20 = _jspx_th_s_005fhidden_005f20.doStartTag();
    if (_jspx_th_s_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f20);
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
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(204,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("   \t<table border=\"0\" width=\"100%\">\n");
        out.write(" \t");
        if (_jspx_meth_s_005fiterator_005f4(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t <tr height=\"30px\" valign=\"middle\" align=\"center\">\n");
        out.write("\t \t<td>\n");
        out.write("\t \t");
        if (_jspx_meth_s_005fif_005f5(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t \t\n");
        out.write("\t \t");
        if (_jspx_meth_s_005felse_005f3(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\n");
        out.write("\t </tr>\n");
        out.write("\t</table>\n");
        out.write(" ");
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

  private boolean _jspx_meth_s_005fiterator_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f4 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(206,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f4.setValue("listOrdersDTO");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(206,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f4.setId("order");
    int _jspx_eval_s_005fiterator_005f4 = _jspx_th_s_005fiterator_005f4.doStartTag();
    if (_jspx_eval_s_005fiterator_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write(" \t<tr>\n");
        out.write("\t<td  style='");
        if (_jspx_meth_s_005fproperty_005f8(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("border-bottom: 0px solid #CCCCCC;'>\n");
        out.write("\t \t<table width=\"100%\" border=\"0\">\n");
        out.write("\t \t<!-- LS ORDER ID -->\n");
        out.write("\t \t<tr  height=\"20px\">\n");
        out.write("\t \t\t<td style=\"padding-left: 65%\" width=\"80%\">LS ORDER ID:</td>\n");
        out.write("\t\t \t<td id=\"columnOrders\" align=\"right\" style=\"padding-right: 10px;\"> <center id=\"lsOrderId\" style=\"text-align:right;\">");
        if (_jspx_meth_s_005fproperty_005f9(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</center></td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t<!-- PO NUMBER -->\n");
        out.write("\t \t<tr  height=\"20px\">\n");
        out.write("\t \t\t<td style=\"padding-left: 65%\" width=\"80%\">PO NUMBER:</td>\n");
        out.write("\t\t \t<td align=\"right\" style=\"padding-right: 10px;\">");
        if (_jspx_meth_s_005fproperty_005f10(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t<!-- PO DATE -->\n");
        out.write("\t \t<tr  height=\"20px\">\n");
        out.write("\t \t\t<td style=\"padding-left: 65%\" width=\"80%\">PO DATE:</td>\n");
        out.write("\t\t \t<td align=\"right\" style=\"padding-right: 10px;\">");
        if (_jspx_meth_s_005fdate_005f1(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t<!-- REQUIRED DATE -->\n");
        out.write("\t \t<tr  height=\"20px\">\n");
        out.write("\t \t\t<td style=\"padding-left: 65%\" width=\"80%\">REQUIRED DATE:</td>\n");
        out.write("\t\t \t<td align=\"right\" style=\"padding-right: 10px;\">");
        if (_jspx_meth_s_005fproperty_005f11(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\n");
        out.write("\t \t<!-- DUPLICATE AND PRINT-->\n");
        out.write("\t \t<tr  height=\"30px\" valign=\"bottom\">\n");
        out.write("\t \t\t<td id=\"columnIconDuplicate\" style=\"padding-left: 65%\" width=\"80%\">\n");
        out.write("\t\t \t\t<table>\n");
        out.write("\t\t \t\t<tr>\n");
        out.write("\t\t \t\t<td><img id=\"iconDuplicate\" src=\"images/orders/iconOrderDuplicate.png\"/> </td>\n");
        out.write("\t\t \t\t<td width=\"30px\"/>\n");
        out.write("\t\t\t\t<td id=\"colomnPrintItems\" style='background-image:url(\"images/orders/printOrder.png\");background-repeat: no-repeat;padding-left: 0px; padding-left: 20px;'>\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fa_005f0(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t \t\t</tr>\n");
        out.write("\t\t \t\t</table>\n");
        out.write("\t \t\t</td>\n");
        out.write("\t\t \t<td align=\"right\" style=\"padding-right: 10px;\"></td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t\n");
        out.write("\t \t<!-- SIPARATOR -->\n");
        out.write("\t \t<tr height=\"20px\" valign=\"middle\">\n");
        out.write("\t \t\t<td colspan=\"2\"></td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t\n");
        out.write("\t \t<!-- SHIP TO -->\n");
        out.write("\t \t<tr height=\"20px\" valign=\"middle\">\n");
        out.write("\t \t\t<td style=\"color:red;text-decoration:underline;\">SHIP TO</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t<tr>\n");
        out.write("\t \t\t<td align=\"left\" width=\"100%\" colspan=\"2\"  style=\"padding-left: 10px;\">\n");
        out.write("\t \t\t<!-- SHIP TO -->\n");
        out.write("\t \t\t<table>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT NAME:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f12(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_s_005fproperty_005f13(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT OTHER NAMES:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f14(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT STREET:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f15(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT ADRESS:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f16(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT CITY:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f17(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT PROVINCE:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f18(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT POSTAL CODE:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f19(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT PHONE:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f20(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t\t<tr height=\"20px\">\n");
        out.write("\t \t\t\t<td>CLIENT EMAIL:</td>\n");
        out.write("\t \t\t\t<td>");
        if (_jspx_meth_s_005fproperty_005f21(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t\t</tr>\n");
        out.write("\t \t\t</table>\n");
        out.write("\t \t\t</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t \t</table>\n");
        out.write("\t</td>\n");
        out.write(" \t</tr>\n");
        out.write(" \t<!-- ITEMS -->\n");
        out.write(" \t<tr height=\"30px\" valign=\"middle\" style='");
        if (_jspx_meth_s_005fproperty_005f22(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("border-top: 0px solid #CCCCCC;'>\n");
        out.write(" \t\t<td style=\"color:red;text-decoration:underline;\">ITEMS</td>\n");
        out.write(" \t</tr>\n");
        out.write(" \t<tr style='");
        if (_jspx_meth_s_005fproperty_005f23(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("'>\n");
        out.write(" \t\t<td>\n");
        out.write("\t \t<table width=\"100%\">\n");
        out.write("\t \t<!-- Headers -->\n");
        out.write("\t \t<tr height=\"30px\" valign=\"middle\" align=\"center\" style=\"font-weight: bold;border: 0px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;\"\">\n");
        out.write("\t \t\t<td>QUANTITY</td>\n");
        out.write("\t \t\t<td>LS PRODUCT ID</td>\n");
        out.write("\t \t\t<td>STOCK</td>\n");
        out.write("\t \t\t<td>PRODUCT TITLE</td>\n");
        out.write("\t \t\t<td>UNIT PRICE</td>\n");
        out.write("\t \t</tr>\n");
        out.write("\t    ");
        if (_jspx_meth_s_005fiterator_005f5(_jspx_th_s_005fiterator_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    </table>\n");
        out.write("\t    </td>\n");
        out.write("\t </tr>\n");
        out.write("\t <!-- SEPARATOR -->\n");
        out.write("\t <tr height=\"30px\" valign=\"middle\">\n");
        out.write("\t \t<td/>\n");
        out.write("\t </tr>\n");
        out.write("\t");
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

  private boolean _jspx_meth_s_005fproperty_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f8 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(209,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f8.setValue("#order.cssStyle");
    int _jspx_eval_s_005fproperty_005f8 = _jspx_th_s_005fproperty_005f8.doStartTag();
    if (_jspx_th_s_005fproperty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f9 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(214,119) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f9.setValue("#order.lsOrderId");
    int _jspx_eval_s_005fproperty_005f9 = _jspx_th_s_005fproperty_005f9.doStartTag();
    if (_jspx_th_s_005fproperty_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f10 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(219,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f10.setValue("#order.productOrderNumber");
    int _jspx_eval_s_005fproperty_005f10 = _jspx_th_s_005fproperty_005f10.doStartTag();
    if (_jspx_th_s_005fproperty_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f1 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(224,51) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setName("creationDate");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(224,51) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setFormat("dd/MM/yyyy");
    int _jspx_eval_s_005fdate_005f1 = _jspx_th_s_005fdate_005f1.doStartTag();
    if (_jspx_th_s_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f11 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(229,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f11.setValue("#order.requiredDate");
    int _jspx_eval_s_005fproperty_005f11 = _jspx_th_s_005fproperty_005f11.doStartTag();
    if (_jspx_th_s_005fproperty_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(240,5) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setHref("%{fileDownload}");
    int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
    if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f4(_jspx_th_s_005fa_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005felse_005f2(_jspx_th_s_005fa_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t ");
        int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f0);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(241,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("%{print==true}");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t \t\t");
        if (_jspx_meth_s_005fcheckbox_005f1(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fcheckbox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f1 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(242,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setId("checkBoxPrintItem");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(242,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setName("checkBoxPrintItem");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(242,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setValue("true");
    int _jspx_eval_s_005fcheckbox_005f1 = _jspx_th_s_005fcheckbox_005f1.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f2 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f0);
    int _jspx_eval_s_005felse_005f2 = _jspx_th_s_005felse_005f2.doStartTag();
    if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fcheckbox_005f2(_jspx_th_s_005felse_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_s_005fcheckbox_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f2 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f2);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(245,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f2.setId("checkBoxPrintItem");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(245,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f2.setName("checkBoxPrintItem");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(245,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f2.setValue("false");
    int _jspx_eval_s_005fcheckbox_005f2 = _jspx_th_s_005fcheckbox_005f2.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f12 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(269,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f12.setValue("#order.clientLastName");
    int _jspx_eval_s_005fproperty_005f12 = _jspx_th_s_005fproperty_005f12.doStartTag();
    if (_jspx_th_s_005fproperty_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f13 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(269,53) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f13.setValue("#order.clientFirstName");
    int _jspx_eval_s_005fproperty_005f13 = _jspx_th_s_005fproperty_005f13.doStartTag();
    if (_jspx_th_s_005fproperty_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f14 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(273,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f14.setValue("#order.clientOtherNames");
    int _jspx_eval_s_005fproperty_005f14 = _jspx_th_s_005fproperty_005f14.doStartTag();
    if (_jspx_th_s_005fproperty_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f15 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(277,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f15.setValue("#order.clientStreet");
    int _jspx_eval_s_005fproperty_005f15 = _jspx_th_s_005fproperty_005f15.doStartTag();
    if (_jspx_th_s_005fproperty_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f16 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(281,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f16.setValue("#order.clientOtherStreet");
    int _jspx_eval_s_005fproperty_005f16 = _jspx_th_s_005fproperty_005f16.doStartTag();
    if (_jspx_th_s_005fproperty_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f17 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(285,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f17.setValue("#order.clientCity");
    int _jspx_eval_s_005fproperty_005f17 = _jspx_th_s_005fproperty_005f17.doStartTag();
    if (_jspx_th_s_005fproperty_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f18 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(289,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f18.setValue("#order.clientProvince");
    int _jspx_eval_s_005fproperty_005f18 = _jspx_th_s_005fproperty_005f18.doStartTag();
    if (_jspx_th_s_005fproperty_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f19 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(293,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f19.setValue("#order.clientPostalCode");
    int _jspx_eval_s_005fproperty_005f19 = _jspx_th_s_005fproperty_005f19.doStartTag();
    if (_jspx_th_s_005fproperty_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f20 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(297,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f20.setValue("#order.clientPhone");
    int _jspx_eval_s_005fproperty_005f20 = _jspx_th_s_005fproperty_005f20.doStartTag();
    if (_jspx_th_s_005fproperty_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f21 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(301,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f21.setValue("#order.clientEmail");
    int _jspx_eval_s_005fproperty_005f21 = _jspx_th_s_005fproperty_005f21.doStartTag();
    if (_jspx_th_s_005fproperty_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f22 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(310,43) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f22.setValue("#order.cssStyle");
    int _jspx_eval_s_005fproperty_005f22 = _jspx_th_s_005fproperty_005f22.doStartTag();
    if (_jspx_th_s_005fproperty_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f23 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(313,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f23.setValue("#order.cssStyle");
    int _jspx_eval_s_005fproperty_005f23 = _jspx_th_s_005fproperty_005f23.doStartTag();
    if (_jspx_th_s_005fproperty_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f5 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f4);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(324,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f5.setValue("#order.rowsList");
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(324,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f5.setId("cell");
    int _jspx_eval_s_005fiterator_005f5 = _jspx_th_s_005fiterator_005f5.doStartTag();
    if (_jspx_eval_s_005fiterator_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t    <!-- Order Rows -->\n");
        out.write("\t    <tr height=\"30px\" valign=\"middle\" align=\"center\">\n");
        out.write("\t    \t<td id=\"columnQuantity\" style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">\n");
        out.write("  \t\t \t\t       <center id=\"lsOrderId\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f24(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("  \t\t \t\t       <center id=\"rowIndex\" style=\"visibility:hidden;display:none;\">");
        if (_jspx_meth_s_005fproperty_005f25(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</center>\n");
        out.write("  \t\t \t\t       ");
        if (_jspx_meth_s_005fproperty_005f26(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write(" Split to: <input  id=\"quantityToChange\" style=\"width: 50px;\" type=\"text\" value='");
        if (_jspx_meth_s_005fproperty_005f27(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("'/></td>\n");
        out.write("\t \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005fproperty_005f28(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("  \t\t    <td style=\"border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;\n");
        out.write("  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005fproperty_005f29(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005fproperty_005f30(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t \t\t<td style=\"border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;\n");
        out.write("  \t\t \t\t       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;\">");
        if (_jspx_meth_s_005fproperty_005f31(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</td>\t        \n");
        out.write("\t    </tr>\n");
        out.write("\t    <!-- Heel of Order Rows -->\n");
        out.write("\t    <tr height=\"30px\" style=\"border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;\">\n");
        out.write("\t    \t<td align=\"right\" colspan=\"4\">SHIPPING COMPANY:</td>\n");
        out.write("\t \t\t<td>");
        if (_jspx_meth_s_005fproperty_005f32(_jspx_th_s_005fiterator_005f5, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t    </tr>\n");
        out.write("\t    ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f24 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(329,77) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f24.setValue("#order.lsOrderId");
    int _jspx_eval_s_005fproperty_005f24 = _jspx_th_s_005fproperty_005f24.doStartTag();
    if (_jspx_th_s_005fproperty_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f25 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(330,76) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f25.setValue("#cell.index");
    int _jspx_eval_s_005fproperty_005f25 = _jspx_th_s_005fproperty_005f25.doStartTag();
    if (_jspx_th_s_005fproperty_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f26 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(331,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f26.setValue("#cell.quantity");
    int _jspx_eval_s_005fproperty_005f26 = _jspx_th_s_005fproperty_005f26.doStartTag();
    if (_jspx_th_s_005fproperty_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f27 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f27.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(331,132) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f27.setValue("#cell.quantityToSplit");
    int _jspx_eval_s_005fproperty_005f27 = _jspx_th_s_005fproperty_005f27.doStartTag();
    if (_jspx_th_s_005fproperty_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f27);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f28 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f28.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(333,79) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f28.setValue("#cell.lsProductID");
    int _jspx_eval_s_005fproperty_005f28 = _jspx_th_s_005fproperty_005f28.doStartTag();
    if (_jspx_th_s_005fproperty_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f28);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f29 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f29.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(335,79) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f29.setValue("#cell.stock");
    int _jspx_eval_s_005fproperty_005f29 = _jspx_th_s_005fproperty_005f29.doStartTag();
    if (_jspx_th_s_005fproperty_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f29);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f30 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f30.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(337,79) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f30.setValue("#cell.productDescription");
    int _jspx_eval_s_005fproperty_005f30 = _jspx_th_s_005fproperty_005f30.doStartTag();
    if (_jspx_th_s_005fproperty_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f30);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f31 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f31.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(339,79) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f31.setValue("#cell.unitPrice");
    int _jspx_eval_s_005fproperty_005f31 = _jspx_th_s_005fproperty_005f31.doStartTag();
    if (_jspx_th_s_005fproperty_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f31);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f32 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f32.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f5);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(344,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f32.setValue("#cell.shippingCompany");
    int _jspx_eval_s_005fproperty_005f32 = _jspx_th_s_005fproperty_005f32.doStartTag();
    if (_jspx_th_s_005fproperty_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f32);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /WEB-INF/jsp/orders/getOrderRemoteFile.jsp(357,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("%{saved==0}");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t \t\t<input id=\"btSaveOrders\" type=\"button\" value=\"Save Orders\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t\t \t<input id=\"btPrintOrders\" type=\"button\" value=\"Print Selected Orders\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t\t \t<input id=\"btPrintAllOrders\" type=\"button\" value=\"Print All Orders\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t \t");
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

  private boolean _jspx_meth_s_005felse_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f3 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    int _jspx_eval_s_005felse_005f3 = _jspx_th_s_005felse_005f3.doStartTag();
    if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t \t\t<input id=\"btSaveOrders\" type=\"button\" value=\"Save Orders\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t\t \t<input type=\"button\" value=\"Print\" disabled=\"disabled\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t\t \t<input type=\"button\" value=\"Print All Orders\" disabled=\"disabled\" style=\"margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;\"/>\n");
        out.write("\t \t\n");
        out.write("\t \t");
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

  private boolean _jspx_meth_s_005fproperty_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f33 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f33.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f33.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/notificationPop.jsp(60,57) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f33.setValue("%{showNotificationPop}");
    int _jspx_eval_s_005fproperty_005f33 = _jspx_th_s_005fproperty_005f33.doStartTag();
    if (_jspx_th_s_005fproperty_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f33);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f34 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f34.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f34.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/notificationPop.jsp(71,39) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f34.setValue("%{message}");
    int _jspx_eval_s_005fproperty_005f34 = _jspx_th_s_005fproperty_005f34.doStartTag();
    if (_jspx_th_s_005fproperty_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f34);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f35 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f35.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f35.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp(61,56) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f35.setValue("%{showSaveSuccessPop}");
    int _jspx_eval_s_005fproperty_005f35 = _jspx_th_s_005fproperty_005f35.doStartTag();
    if (_jspx_th_s_005fproperty_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f35);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f36 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f36.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f36.setParent(null);
    // /WEB-INF/jsp/orders/dialogues/saveSuccessPop.jsp(72,39) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f36.setValue("%{message}");
    int _jspx_eval_s_005fproperty_005f36 = _jspx_th_s_005fproperty_005f36.doStartTag();
    if (_jspx_th_s_005fproperty_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f36);
    return false;
  }
}
