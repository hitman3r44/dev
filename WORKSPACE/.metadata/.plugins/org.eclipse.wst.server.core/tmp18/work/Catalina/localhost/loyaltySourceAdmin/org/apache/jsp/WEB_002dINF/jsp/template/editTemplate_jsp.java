package org.apache.jsp.WEB_002dINF.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editTemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
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
      out.write("\twidth: 170px;\n");
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
      out.write("</style>\n");
      out.write("<div class=\"unit\" style=\"width: 800px; margin-left: 100px;\">\n");
      out.write("\t<div class=\"pop_title\" style=\"margin-top: 30px;\">Edit Template</div>\n");
      out.write("\n");
      out.write("\t<div id=\"formContainer\" style=\"height: auto;\">\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<br /> <br />\n");
      out.write("  \n");
      out.write("\t<!-- ............................. Search Classification ............................ -->\n");
      out.write("\t<table id=\"tabLogin\" width=\"300px\" border=\"0\">\n");
      out.write("\t\t<!-- .................... Template .................... -->\n");
      out.write("\t\t<tr height=\"60px\"  style=\"border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("\t\t\t\t\t\t\t\t  border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;\">\n");
      out.write("\t\t\t<td width=\"5px\"/>\n");
      out.write("\t\t\t<td width=\"70px\">Template:</td>\n");
      out.write("\t\t\t<td width=\"160px\">");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t<td style=\"padding-left:30px; height: 60px;cursor: pointer;\"><img id=\"iconFindTemplate\" src=\"images/find.png\"/></td>\t\n");
      out.write("\t\t</tr>\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t<tr height=\"10px\">\n");
      out.write("\t\t\t<td colspan=\"2\"/>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<!-- .................................................... -->\t\t\t\t\t\t\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<div style=\"width:300px;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;\n");
      out.write("   \t\t\t    border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;\">\n");
      out.write("\t\t<table id=\"tabCoefficient\" width=\"300px\"  border=\"0\">\n");
      out.write("\t\t\t<!-- ...................... separator ..................... -->\n");
      out.write("\t\t\t<tr height=\"20px\" valign=\"middle\">\n");
      out.write("\t\t\t\t<td/>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- ...................... Profit Brand Coefficient ...... -->\n");
      out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
      out.write("\t\t\t\t<td width=\"5px\"/>\n");
      out.write("\t\t\t\t<td>Brand Coefficient:</td>\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- ...................... Profit Coefficient ............ -->\n");
      out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
      out.write("\t\t\t\t<td width=\"5px\"/>\n");
      out.write("\t\t\t\t<td>Profit Coefficient:</td>\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_s_005ftextfield_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- ...................... Product Coefficient ........... -->\n");
      out.write("\t\t\t<tr height=\"30px\" valign=\"middle\">\n");
      out.write("\t\t\t\t<td width=\"5px\"/>\n");
      out.write("\t\t\t\t<td width=\"178px\">Product Unit Sold Coefficient:</td>\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_s_005ftextfield_005f2(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\n");
      out.write("\t\t\t<!-- ...................... submit ..................... -->\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\"><input type=\"button\" id=\"btSave\" value=\"Save\" style=\"margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<!-- ...................... Line separator ............. -->\n");
      out.write("\t\t\t<tr height=\"15px\">\n");
      out.write("\t\t\t\t<td colspan=\"2\"/>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<!-- .................................................... -->\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- FORM FOR SAVING TEMPLATE --> \n");
      out.write("   ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<!-- FORM FOR SAVING TEMPLATE --> \t\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"pop_title\" style=\"margin-top: 30px;\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\n");
      out.write("// Jquery Function main \n");
      out.write("var balance=0;\n");
      out.write("var rowSelected=-1;\n");
      out.write("var lastRowSelected=-1;\n");
      out.write("\n");
      out.write("$(document).ready(function() { \n");
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
      out.write("\n");
      out.write("\t/*----------------------------- Coefficients Validation  --------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\taccept juste numbers format\n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#tabCoefficient #unitSoldCoefficientId,#profitCoefficientId,#brandCoefficientId\").blur( function(){\n");
      out.write("\t\tvar unitSold;\n");
      out.write("\t\tvar profitCoefficient=$(\"#tabCoefficient #profitCoefficientId\").val();\n");
      out.write("\t\tvar brandCoefficient=$(\"#tabCoefficient #brandCoefficientId\").val();\n");
      out.write("\n");
      out.write("\t\tindex=$(\"#tabCoefficient #profitCoefficientId\").index(this);\n");
      out.write("\t\tif(index>=0){\n");
      out.write("\t\t\t//profitCoefficient=$(\"#tabCoefficient #profitCoefficientId\").val();\n");
      out.write("\t\t\t $(\"#tabCoefficient #profitCoefficientId\").css(\"backgroundColor\",\"white\");\n");
      out.write("\t\t\tif (!isNumber(profitCoefficient) || profitCoefficient> 100 || profitCoefficient <0 ) {\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #profitCoefficientId\").val(\"0\");\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #profitCoefficientId\").css(\"backgroundColor\",\"#FF6666\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tindex=$(\"#tabCoefficient #brandCoefficientId\").index(this);\n");
      out.write("\t\tif(index>=0){\n");
      out.write("\t\t\t//brandCoefficient=$(\"#tabCoefficient #brandCoefficientId\").val();\n");
      out.write("\t\t\t $(\"#tabCoefficient #brandCoefficientId\").css(\"backgroundColor\",\"white\");\n");
      out.write("\t\t\tif (!isNumber(brandCoefficient) || brandCoefficient> 100 || brandCoefficient <0 ) {\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #brandCoefficientId\").val(\"0\");\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #brandCoefficientId\").css(\"backgroundColor\",\"#FF6666\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tvar index=$(\"#tabCoefficient #unitSoldCoefficientId\").index(this);\n");
      out.write("\t\t/*if(index>=0){\n");
      out.write("\t\t\tunitSold=$(\"#tabCoefficient #unitSoldCoefficientId\").val();\n");
      out.write("\t\t\t $(\"#tabCoefficient #unitSoldCoefficientId\").css(\"backgroundColor\",\"white\");\n");
      out.write("\t\t\tif (!isNumber(unitSold) || unitSold> 100 || unitSold <0 ) {\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #unitSoldCoefficientId\").val(\"0\");\n");
      out.write("\t\t\t\t$(\"#tabCoefficient #unitSoldCoefficientId\").css(\"backgroundColor\",\"#FF6666\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}*/\n");
      out.write("\t\tprofitCoefficient=$(\"#tabCoefficient #profitCoefficientId\").val();\n");
      out.write("\t\tbrandCoefficient=$(\"#tabCoefficient #brandCoefficientId\").val();\n");
      out.write("\t\t$(\"#tabCoefficient #unitSoldCoefficientId\").val(100-brandCoefficient-profitCoefficient);\n");
      out.write("\t\tunitSold=$(\"#tabCoefficient #unitSoldCoefficientId\").val();\n");
      out.write("\t\t $(\"#tabCoefficient #unitSoldCoefficientId\").css(\"backgroundColor\",\"#E8E8E8\");\n");
      out.write("\t\tif (!isNumber(unitSold) || unitSold <0 ) {\n");
      out.write("\t\t\t$(\"#tabCoefficient #unitSoldCoefficientId\").css(\"backgroundColor\",\"#FF6666\");\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t/*-------------------------------------- Find Template informations  ------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t \tWhen Admin drop down the Template comboList\n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#tabLogin #templateId\").change(function(){\n");
      out.write("\t\tvar templateId=$(\"#templateId\").val();\n");
      out.write("\t\t$(\"#frmTemplateId\").val(templateId);\n");
      out.write("\t\t$(\"#frmFindTemplateSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#tabLogin #iconFindTemplate\").click( function(){\n");
      out.write("\t\tvar templateId=$(\"#templateId\").val();\n");
      out.write("\t\t$(\"#frmTemplateId\").val(templateId);\n");
      out.write("\t\t$(\"#frmFindTemplateSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/*-------------------------------------- Save Template --------------------------------------\n");
      out.write("\t\t\t\t\t\t\t\t\t When Admin click on save button\n");
      out.write("\t  -------------------------------------------------------------------------------------------*/\n");
      out.write("\t$(\"#btSave\").click( function(){\n");
      out.write("\t\tvar templateId=$(\"#templateId\").val();\n");
      out.write("\t\tvar profitCoefficient=$(\"#tabCoefficient #profitCoefficientId\").val();\n");
      out.write("\t\tvar brandCoefficient=$(\"#tabCoefficient #brandCoefficientId\").val();\n");
      out.write("\t\t//clean profitCoefficient \n");
      out.write("\t\tprofitCoefficient=profitCoefficient.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tprofitCoefficient=profitCoefficient.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tprofitCoefficient=profitCoefficient.replace(/([\\s]+)/g, '-'); \n");
      out.write("\t\t//clean brandCoefficient \n");
      out.write("\t\tbrandCoefficient=brandCoefficient.replace(/^\\s\\s*/, '');    \n");
      out.write("\t\tbrandCoefficient=brandCoefficient.replace(/\\s\\s*$/, '');   \n");
      out.write("\t\tbrandCoefficient=brandCoefficient.replace(/([\\s]+)/g, '-'); \t\n");
      out.write("\t\tvar unitSoldCoefficient=100-profitCoefficient-brandCoefficient;\n");
      out.write("\t\t//If coefficients are not good do nothing \n");
      out.write("\t\tif(!isNumber(profitCoefficient)|| !isNumber(brandCoefficient)||!isNumber(unitSoldCoefficient)||\n");
      out.write("\t\t\tprofitCoefficient<0 || profitCoefficient>100 || brandCoefficient<0 || brandCoefficient>100 ||\n");
      out.write("\t\t\tunitSoldCoefficient<0 || unitSoldCoefficient>100 || unitSoldCoefficient<0){\n");
      out.write("\t\t\treturn false; \n");
      out.write("\t\t}\t\n");
      out.write("\t\t$(\"#frmTemplateId\").val(templateId);\n");
      out.write("\t\t$(\"#frmProfitCoefficient\").val(profitCoefficient);\n");
      out.write("\t\t$(\"#frmBrandCoefficient\").val(brandCoefficient);\n");
      out.write("\t\t$(\"#frmUnitSoldCoefficient\").val(unitSoldCoefficient);\n");
      out.write("\t\t$(\"#frmSaveTemplateSignal\").val(1);\n");
      out.write("\t\t$('#form').trigger(\"submit\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t/*----------------------------- Test value is numeric  ----------------------------------- \n");
      out.write("\t\t\t\t\t\t\t\treturn false if is not numeric\n");
      out.write("\t  ----------------------------------------------------------------------------------------*/\n");
      out.write("\tfunction isNumber(n) {\n");
      out.write("\t\treturn !isNaN(parseFloat(n)) && isFinite(n);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(29,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("hasActionErrors()");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<div id=\"globalAdvice\" class=\"gray_bg global-vanadium-advice\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(31,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t<span>");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write(" </span>\n");
        out.write("\t\t\t\t\t<br />\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(32,11) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setEscape(false);
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("templateId");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("clientCategoryId");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width:160px;");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("listClientCategory");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = emptyOption type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setEmptyOption("false");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("clientCategoryId");
    // /WEB-INF/jsp/template/editTemplate.jsp(46,21) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("clientCategoryName");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005femptyOption_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /WEB-INF/jsp/template/editTemplate.jsp(72,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("brandCoefficientId");
    // /WEB-INF/jsp/template/editTemplate.jsp(72,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("templateToEdit.brandCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(72,8) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setMaxlength("10");
    // /WEB-INF/jsp/template/editTemplate.jsp(72,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssStyle("width:50px;");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent(null);
    // /WEB-INF/jsp/template/editTemplate.jsp(79,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("profitCoefficientId");
    // /WEB-INF/jsp/template/editTemplate.jsp(79,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("templateToEdit.profitCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(79,8) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setMaxlength("10");
    // /WEB-INF/jsp/template/editTemplate.jsp(79,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssStyle("width:50px;");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent(null);
    // /WEB-INF/jsp/template/editTemplate.jsp(85,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setId("unitSoldCoefficientId");
    // /WEB-INF/jsp/template/editTemplate.jsp(85,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("templateToEdit.unitSoldCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(85,8) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setMaxlength("10");
    // /WEB-INF/jsp/template/editTemplate.jsp(85,8) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setDisabled("true");
    // /WEB-INF/jsp/template/editTemplate.jsp(85,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setCssStyle("width:53px;background-color:#E8E8E8;border:0px;");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/template/editTemplate.jsp(101,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("form");
    // /WEB-INF/jsp/template/editTemplate.jsp(101,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("editTemplate.do");
    // /WEB-INF/jsp/template/editTemplate.jsp(101,3) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/template/editTemplate.jsp(101,3) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("    \t");
        if (_jspx_meth_s_005fhidden_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\t  \n");
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
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/template/editTemplate.jsp(102,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("frmTemplateId");
    // /WEB-INF/jsp/template/editTemplate.jsp(102,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("templateId");
    // /WEB-INF/jsp/template/editTemplate.jsp(102,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("-1");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(103,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setId("frmProfitCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(103,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("templateToEdit.profitCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(103,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/template/editTemplate.jsp(104,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setId("frmBrandCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(104,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("templateToEdit.brandCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(104,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/template/editTemplate.jsp(105,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setId("frmUnitSoldCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(105,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("templateToEdit.unitSoldCoefficient");
    // /WEB-INF/jsp/template/editTemplate.jsp(105,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setValue("0");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(106,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setId("frmFindTemplateSignal");
    // /WEB-INF/jsp/template/editTemplate.jsp(106,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("findTemplateSignal");
    // /WEB-INF/jsp/template/editTemplate.jsp(106,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setValue("0");
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
    // /WEB-INF/jsp/template/editTemplate.jsp(107,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setId("frmSaveTemplateSignal");
    // /WEB-INF/jsp/template/editTemplate.jsp(107,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setName("saveTemplateSignal");
    // /WEB-INF/jsp/template/editTemplate.jsp(107,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f5.setValue("0");
    int _jspx_eval_s_005fhidden_005f5 = _jspx_th_s_005fhidden_005f5.doStartTag();
    if (_jspx_th_s_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f5);
    return false;
  }
}
