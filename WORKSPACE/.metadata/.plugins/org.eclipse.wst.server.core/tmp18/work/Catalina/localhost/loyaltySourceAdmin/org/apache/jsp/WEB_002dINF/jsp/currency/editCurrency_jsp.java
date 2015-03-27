package org.apache.jsp.WEB_002dINF.jsp.currency;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editCurrency_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/currency/dialogues/confirmCurrencyRatePop.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
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
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"thumbnailhover_files/jquery-latest.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#topMenuRed\").hide();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("label {\n");
      out.write("\twidth: 130px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".vanadium-advice {\n");
      out.write("\tmargin-left: 170px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input.vanadium-valid {\n");
      out.write("\tbackground-image: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tableLog_title{\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tpadding-bottom: 10px;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td {\n");
      out.write("\t-moz-user-select: none;\n");
      out.write("\t-khtml-user-select: none;\n");
      out.write("\t-webkit-user-select: none; \n");
      out.write("\t-ms-user-select: none;\n");
      out.write("\tuser-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".border_rigth_left{\n");
      out.write("\tborder-left: 1px solid #CCCCCC;\n");
      out.write("\tborder-right: 1px solid #CCCCCC;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".border_rigth{\n");
      out.write("\tborder-right: 1px solid #CCCCCC;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".border_left{\n");
      out.write("\tborder-left: 1px solid #CCCCCC;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div class=\"unit\" style=\"width: 800px; margin-left: 100px;\">\n");
      out.write(" <div id=\"formContainer\" style=\"height: auto;\">\n");
      out.write("  ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   \n");
      out.write("   ");
      out.write("<style type=\"text/css\" >\n");
      out.write("\t#confirmCurrencyRatePop {\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\twidth:340px;\n");
      out.write("\t\theight:175px;\n");
      out.write("\t\ttop:15%;\n");
      out.write("\t\tleft:37%;\n");
      out.write("\t\tborder:1px solid #B0C4DE;\n");
      out.write("\t\tz-index: 700;\n");
      out.write("\t\tdisplay:none;\n");
      out.write("\t\tvisibility:hidden;\n");
      out.write("\t\tpadding-top:5px;\n");
      out.write("\t\tbackground-color:#33CCFF ;/*rgb(85,85,85);*/\n");
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
      out.write("\n");
      out.write("<div id=\"confirmCurrencyRatePop\" class=\"conteneurPrompt\" style=\"");
      if (_jspx_meth_s_005fproperty_005f4(_jspx_page_context))
        return;
      out.write("\" >\n");
      out.write("\t\t<span id=\"titlePop\" style=\"color:white;font-size: 16px;vertical-align: middle;\">Currency Message Box</span>\n");
      out.write("\t\t<div style=\"height: 5px;\"></div>\n");
      out.write("\t\t<!-- *************************************************** The Body ********************************************************** -->\t\t\t \t\n");
      out.write("\t\t <div style=\"width:100%;height:150px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;\">\n");
      out.write("\t\t\t\t \t<center>\n");
      out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"130px\" border=\"0\">\n");
      out.write("\t\t\t \t\t\n");
      out.write("\t\t\t \t\t\t<tr>\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" style=\"padding-left: 7px;padding-right: 7px;\">\n");
      out.write("\t\t\t\t \t\t\t\t<div style=\"max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\">\n");
      out.write("\t\t\t\t \t\t\t\t\t<center id=\"msgConfirmation\"style=\"color: #484848;\">");
      if (_jspx_meth_s_005fproperty_005f5(_jspx_page_context))
        return;
      out.write("</center>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t \t\t\t</td>\n");
      out.write("\t\t\t \t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t \t\t\t<tr height=\"45px\" valign=\"top\">\n");
      out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\">\t\t\t\t \t\t\t\n");
      out.write("\t\t\t\t \t\t\t\t<input id=\"btOK\"  type=\"submit\" value=\"OK\"\n");
      out.write("\t\t\t\t \t\t\t    \tstyle=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;\" />\n");
      out.write("\t\t\t\t \t\t\t<!--  \n");
      out.write("\t\t\t\t \t\t\t\t<input id=\"btNo\"  type=\"submit\" value=\"No\"\n");
      out.write("\t\t\t\t \t\t\t    \tstyle=\"margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;\" />\n");
      out.write("\t\t\t\t \t\t\t-->\n");
      out.write("\t\t\t\t \t\t\t</td>\n");
      out.write("\t\t\t \t\t\t</tr>\n");
      out.write("\t\t\t \t\t\t\t\t \t\t\t\n");
      out.write("\t\t\t \t\t</table>\n");
      out.write("\t\t\t \t\t</center>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write(" <div class=\"pop_title\" style=\"margin-top:30px;\"></div>\n");
      out.write(" <!-- Control of logs -->\n");
      out.write(" <div class=\"tableLog_title\"><a id=\"hrefShowLogs\" href=\"\">Show Currency History</a></div>\n");
      out.write(" <!-- Fields Titles  -->\n");
      out.write(" <div id=\"divLogsTitles\" style=\"width:800px;\">\n");
      out.write("  <table  id=\"tabLogsTitles\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\"\n");
      out.write("\t\tstyle=\"width:800px;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;\" >\n");
      out.write("\t<thead style=\"background-color:rgb(240,240,240);\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th style=\"width:160px; padding: 0ps;height: 20px; border-left: 0px solid #CCCCCC; border: none;\">OP. Date</th>\n");
      out.write("\t\t\t<th width=\"100px\" valign=\"middle\" style=\"border: none;\">OP. Type</th>\n");
      out.write("\t\t\t<th valign=\"middle\" width=\"200px\" style=\"border: none;\">Data Before</th>\n");
      out.write("\t\t\t<th valign=\"middle\" width=\"200px\" style=\"border: none;\">Data After</th>\n");
      out.write("\t\t\t<th valign=\"middle\" width=\"140px\" style=\"border: none;\">Full Name Admin</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead>\n");
      out.write("  </table>\n");
      out.write(" </div>\n");
      out.write(" <!-- END Fields Titles  -->\n");
      out.write(" \n");
      out.write(" <!-- Fields Data  -->\n");
      out.write(" <div id=\"divLogs\" style=\"width:800px;overflow: auto;max-height: 300px;display:none;visibility:hidden;\">\n");
      out.write("  <table  id=\"tabLogs\" border=\"0\" cellspacing=\"0\" cellpadding=\"\"\n");
      out.write("\t\tstyle=\"width:800px;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;\" >\n");
      out.write("\t<tbody>\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fiterator_005f1(_jspx_page_context))
        return;
      out.write("\t\t\n");
      out.write("\t</tbody>\t\t\t\t\t\t\t\n");
      out.write("  </table>\n");
      out.write(" </div>\n");
      out.write(" <!-- End Fields Data  -->\n");
      out.write(" \n");
      out.write(" <br />\n");
      out.write(" <!-- Control of logs -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t\n");
      out.write("\t// Global variable \n");
      out.write("\tvar currencyRateB4;\n");
      out.write("\t\n");
      out.write("\t// In the loadPage, get Currency Info of the default selected currencySymbol \n");
      out.write("\tgetCurrencyDTOInfo();\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- currency ----------------------------------------------- \n");
      out.write("\t\tget the selected CurrencyDTO info\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#currency\").change( function(){\n");
      out.write("\t\tgetCurrencyDTOInfo();\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- When currencyRate Losts focus -------------------------- \n");
      out.write("\t\t//Accept only numbers\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#currencyRate\").blur( function(){\n");
      out.write("\t\tvar currRate = $(\"#currencyRate\").val();\n");
      out.write("\t\t$(\"#currencyRate\").css(\"backgroundColor\", \"#FFFFFF\");\n");
      out.write("\t\tif(!isNumber(currRate) || parseFloat(currRate)<=0) {\n");
      out.write("\t\t\t$(\"#currencyRate\").val(0);\n");
      out.write("\t\t\t$(\"#currencyRate\").css(\"backgroundColor\", \"#FF6666\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tvar valCurrRate = parseFloat(currRate).toFixed(3);\n");
      out.write("\t\t\t$(\"#currencyRate\").val(valCurrRate);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- When currencyRate Gets focus --------------------------- \n");
      out.write("\t\t//\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#currencyRate\").focus( function(){\n");
      out.write("\t\t$(\"#currencyRate\").css(\"backgroundColor\", \"#FFFFFF\");\n");
      out.write("\t});\n");
      out.write("\t\t\n");
      out.write("\t/*----------------------------- Save Currency ------------------------------------------\n");
      out.write("\t\tWhen Admin click on save button\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#btCurrencySave\").click( function(){\n");
      out.write("\t\tvar currRate = $(\"#currencyRate\").val();\n");
      out.write("\t\t//Only for the first time if No currencies else CAD in DB \n");
      out.write("\t\tif($(\"#currencySymbol\").val().replace(/\\s+/g, \"\") == \"\") {\n");
      out.write("\t\t\tvar message=\"Please Go to the Menu: <Product>/<Currency>/<Add> to first add a new currency.\";\n");
      out.write("\t\t\t$(\"#confirmCurrencyRatePop\").css('top',200);\n");
      out.write("\t\t\t$('#confirmCurrencyRatePop #msgConfirmation').text(message);\n");
      out.write("\t\t\t$('#confirmCurrencyRatePop').css(\"display\",\"block\"); \n");
      out.write("\t\t\t$('#confirmCurrencyRatePop').css(\"visibility\",\"visible\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tif(isNumber(currRate)) {\n");
      out.write("\t\t\t\tvar message=\"Please change the rate before saving.\";\n");
      out.write("\t\t\t\tvar valCurrRate = parseFloat(currRate);\n");
      out.write("\t\t\t\tif(valCurrRate==parseFloat(currencyRateB4) || valCurrRate<=0) {\n");
      out.write("\t\t\t\t\tif(valCurrRate==0) message=\"The Rate can not be 0\";\n");
      out.write("\t\t\t\t\t$(\"#confirmCurrencyRatePop\").css('top',200);\n");
      out.write("\t\t\t\t\t$('#confirmCurrencyRatePop #msgConfirmation').text(message);\n");
      out.write("\t\t\t\t\t$('#confirmCurrencyRatePop').css(\"display\",\"block\"); \n");
      out.write("\t\t\t\t\t$('#confirmCurrencyRatePop').css(\"visibility\",\"visible\");\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t// put successSignal to 1 to execute SUCCESS Part \n");
      out.write("\t\t\t\t\t$(\"#successSignal\").val(1);\n");
      out.write("\t\t\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- function: getCurrencyDTOInfo --------------------------- \n");
      out.write("\t\tget the selected CurrencyDTO info\n");
      out.write("\t----------------------------------------------------------------------------------------*/\n");
      out.write("\tfunction getCurrencyDTOInfo() {\n");
      out.write("\t\tvar currencyIdVal = $(\"#currency\").val();\n");
      out.write("\t\tvar currencySymbolVal = $(\"#currency option:selected\").text();\n");
      out.write("\t\tvar currencyRateVal = $(\"input#rate_\" + currencyIdVal).val();\n");
      out.write("\t\tcurrencyRateB4 = currencyRateVal;\n");
      out.write("\t\tvar currencyCreationDateVal = $(\"input#creationDate_\" + currencyIdVal).val();\n");
      out.write("\n");
      out.write("\t\t$(\"#currencyId\").val(currencyIdVal);\n");
      out.write("\t\t$(\"#currencyRate\").val(currencyRateVal);\n");
      out.write("\t\t$(\"#currencySymbol\").val(currencySymbolVal);\n");
      out.write("\t\t$(\"#currencyCreationDate\").val(currencyCreationDateVal);\n");
      out.write("\t\t$(\"#currencyRate\").css(\"backgroundColor\", \"#FFFFFF\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- When clicking on \"OK\" button --------------------------- \n");
      out.write("\t\t \n");
      out.write("\t ---------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#confirmCurrencyRatePop #btOK\").click(function() {\n");
      out.write("\t\t$('#confirmCurrencyRatePop').css(\"display\",\"none\"); \n");
      out.write("\t\t$('#confirmCurrencyRatePop').css(\"visibility\",\"hidden\");\n");
      out.write("\t\tif($(\"#successSignal\").val()!=null && $(\"#successSignal\").val()!=0) {\n");
      out.write("\t\t\t$(\"#successSignal\").val(0);\n");
      out.write("\t\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t// when user click on href show history logs \n");
      out.write("\t$(\"#hrefShowLogs\").click(function () {\n");
      out.write("\t\t$(\"#divLogs\").toggle(\"slow\");\n");
      out.write("\t\t$('html, body').animate({scrollTop:$(document).height()}, 'slow');\n");
      out.write("\t\t$(\"#divLogs\").css(\"display\",\"block\"); \n");
      out.write("\t\t$(\"#divLogs\").css(\"visibility\",\"visible\");\n");
      out.write("\n");
      out.write("\t\treturn false;\n");
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
      out.write("</script>");
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
    // /WEB-INF/jsp/currency/editCurrency.jsp(53,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("form");
    // /WEB-INF/jsp/currency/editCurrency.jsp(53,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("editCurrency.do");
    // /WEB-INF/jsp/currency/editCurrency.jsp(53,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/currency/editCurrency.jsp(53,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("  \n");
        out.write("  \t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\n");
        out.write("\t<div class=\"pop_title\" style=\"margin-top: 30px;\">Edit Currency</div><br />\n");
        out.write("\t<!-- Currency -->\n");
        out.write("\t<div style=\"width:350px;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
        out.write("   \t\t\t    border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;\">\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t<table id=\"tabCoefficient\" width=\"300px\"  border=\"0\">\n");
        out.write("\t\t\t<!-- ...................... separator ..................... -->\n");
        out.write("\t\t\t<tr height=\"20px\" valign=\"middle\">\n");
        out.write("\t\t\t\t<td/>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- ...................... Currency Symbol ...... -->\n");
        out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
        out.write("\t\t\t\t<td width=\"15px\"/>\n");
        out.write("\t\t\t\t<td width=\"130px\">Currency:</td>\n");
        out.write("\t\t\t\t<td>");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- ...................... CurrencyId .............. -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- ...................... Currency Rate ............ -->\n");
        out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
        out.write("\t\t\t\t<td />\n");
        out.write("\t\t\t\t<td>Rate:</td>\n");
        out.write("\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t\t<!-- ...................... CurrencySymbol ........... -->\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<!-- ...................... Currency Creation Date ........... -->\n");
        out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
        out.write("\t\t\t\t<td />\n");
        out.write("\t\t\t\t<td>Last Update:</td>\n");
        out.write("\t\t\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\n");
        out.write("\t\t\t<!-- ...................... submit ..................... -->\n");
        out.write("\t\t\t<tr>\n");
        out.write("\t\t\t\t<td colspan=\"2\" />\n");
        out.write("\t\t\t\t<td><input type=\"button\" id=\"btCurrencySave\" value=\"Save Currency Rate\" style=\"margin:30px 0px 0px 0px; padding:2px 3px;font-size:13px;\"/></td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t<!-- ...................... Line separator ............. -->\n");
        out.write("\t\t\t<tr height=\"15px\">\n");
        out.write("\t\t\t\t<td colspan=\"3\"/>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t\t<!-- .................................................... -->\n");
        out.write("\t\t</table>\n");
        out.write("\t\t<br />\n");
        out.write("\t</div>\n");
        out.write("\t<!-- Currency -->\n");
        out.write("\t<br />\n");
        out.write("   ");
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
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(55,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("successSignal");
    // /WEB-INF/jsp/currency/editCurrency.jsp(55,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("successSignal");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(56,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("message");
    // /WEB-INF/jsp/currency/editCurrency.jsp(56,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("message");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(57,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("showSaveSuccessPop");
    // /WEB-INF/jsp/currency/editCurrency.jsp(57,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("showSaveSuccessPop");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(63,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("currencyDTOList");
    // /WEB-INF/jsp/currency/editCurrency.jsp(63,2) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setStatus("count");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<input\tid='rate_");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("'\n");
        out.write("\t\t\t\t\tvalue=\"");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\" \n");
        out.write("\t\t\t\t\tstyle=\"display: none; visibility: hidden;\" />\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fdate_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<input\tid='creationDate_");
        if (_jspx_meth_s_005fproperty_005f2(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("'\n");
        out.write("\t\t\t\t\tvalue=\"");
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\" \n");
        out.write("\t\t\t\t\tstyle=\"display: none; visibility: hidden;\" />\n");
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
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(64,19) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("id");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(65,12) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("%{rate}");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f0 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(67,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setName("creationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(67,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setVar("creationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(67,3) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setFormat("yyyy/MM/dd 'at' hh:mm a");
    int _jspx_eval_s_005fdate_005f0 = _jspx_th_s_005fdate_005f0.doStartTag();
    if (_jspx_th_s_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(68,27) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("id");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(69,12) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("%{#creationDate}");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("currency");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("currency");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("0");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("currencyDTOList");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("id");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("%{symbol}");
    // /WEB-INF/jsp/currency/editCurrency.jsp(83,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width:145px;");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f3 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(94,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("currencyId");
    // /WEB-INF/jsp/currency/editCurrency.jsp(94,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("currencyDTO.id");
    int _jspx_eval_s_005fhidden_005f3 = _jspx_th_s_005fhidden_005f3.doStartTag();
    if (_jspx_th_s_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(100,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("currencyRate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(100,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("currencyDTO.rate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(100,8) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setMaxlength("10");
    // /WEB-INF/jsp/currency/editCurrency.jsp(100,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssStyle("width:143px;");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f4 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(103,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("currencySymbol");
    // /WEB-INF/jsp/currency/editCurrency.jsp(103,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("currencyDTO.symbol");
    int _jspx_eval_s_005fhidden_005f4 = _jspx_th_s_005fhidden_005f4.doStartTag();
    if (_jspx_th_s_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/currency/editCurrency.jsp(109,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("currencyCreationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(109,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("currencyDTO.creationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(109,8) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setMaxlength("10");
    // /WEB-INF/jsp/currency/editCurrency.jsp(109,8) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setDisabled("true");
    // /WEB-INF/jsp/currency/editCurrency.jsp(109,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssStyle("width:145px;background-color:#E8E8E8;border:0px;");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f4.setParent(null);
    // /WEB-INF/jsp/currency/dialogues/confirmCurrencyRatePop.jsp(61,64) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("%{showPopup}");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f5 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f5.setParent(null);
    // /WEB-INF/jsp/currency/dialogues/confirmCurrencyRatePop.jsp(72,62) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f5.setValue("%{message}");
    int _jspx_eval_s_005fproperty_005f5 = _jspx_th_s_005fproperty_005f5.doStartTag();
    if (_jspx_th_s_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent(null);
    // /WEB-INF/jsp/currency/editCurrency.jsp(159,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("opertionsDTOList");
    // /WEB-INF/jsp/currency/editCurrency.jsp(159,2) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setStatus("status");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<tr height=\"25px\" style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;\">\n");
        out.write("\t\t\t\t<td width=\"160px\" class=\"border_rigth middleTdDate\">\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fdate_005f1(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f6(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t<td width=\"110px\" class=\"border_rigth_left middleTdType\" >");
        if (_jspx_meth_s_005ftext_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t<td width=\"200px\" class=\"border_rigth_left middleTdData\"><center class=\"tagCenterData\">");
        if (_jspx_meth_s_005ftext_005f1(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</center></td>\n");
        out.write("\t\t\t\t<td width=\"200px\" class=\"border_rigth_left middleTdData\"><center class=\"tagCenterData\">");
        if (_jspx_meth_s_005ftext_005f2(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</center></td>\n");
        out.write("\t\t\t\t<td width=\"130px\" class=\"border_rigth_left middleTdFullName\">");
        if (_jspx_meth_s_005ftext_005f3(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f1 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(162,5) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setName("operationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(162,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setVar("operationDate");
    // /WEB-INF/jsp/currency/editCurrency.jsp(162,5) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f1.setFormat("yyyy/MM/dd 'at' hh:mm a");
    int _jspx_eval_s_005fdate_005f1 = _jspx_th_s_005fdate_005f1.doStartTag();
    if (_jspx_th_s_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fvar_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f6 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(163,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f6.setValue("%{#operationDate}");
    int _jspx_eval_s_005fproperty_005f6 = _jspx_th_s_005fproperty_005f6.doStartTag();
    if (_jspx_th_s_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(165,62) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("operationType");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(166,91) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("dataBefore");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(167,91) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("dataAfter");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f3 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /WEB-INF/jsp/currency/editCurrency.jsp(168,65) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f3.setName("realNameUser");
    int _jspx_eval_s_005ftext_005f3 = _jspx_th_s_005ftext_005f3.doStartTag();
    if (_jspx_th_s_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
    return false;
  }
}
