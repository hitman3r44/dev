package org.apache.jsp.WEB_002dINF.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/layouts/./dialogsPop/resultPop.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/layouts/dialogsPop/progressBarPop.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftoken_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
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
      out.write("\n");
      out.write("<!-- if user login -->\n");
      out.write("  \n");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!-- if user login out -->\n");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/* <![CDATA[ */ \n");
      out.write("\n");
      out.write("var timerCounter=0;\n");
      out.write("var redirectId;\n");
      out.write("function horloge() {\n");
      out.write("\t$(\"#progressBarPop\").css(\"display\",\"block\"); \n");
      out.write("\t$(\"#progressBarPop\").css(\"visibility\",\"visible\");\n");
      out.write("\ttimerCounter++;\n");
      out.write("\tif(timerCounter<=100){\n");
      out.write("\t\ttimer = window.setTimeout(\"horloge()\", 1000);\n");
      out.write("\t}else{\n");
      out.write("\t\t$(\"#progressBarPop\").css(\"display\",\"none\");\n");
      out.write("\t\t$(\"#progressBarPop\").css(\"visibility\",\"hidden\");\n");
      out.write("\t\twindow.clearTimeout(timer);\n");
      out.write("\t\ttimerCounter=0;\n");
      out.write("\t};\n");
      out.write("}           \n");
      out.write("             \n");
      out.write("             \n");
      out.write("$(function() {\n");
      out.write("\t$('#tabMyProfile tr').attr(\"height\",\"35px\");\n");
      out.write("});\n");
      out.write("        \n");
      out.write("$(function() {\n");
      out.write("\tredirectId=");
      out.print((Long)request.getSession(true).getAttribute("redirect"));
      out.write(";\n");
      out.write("\tif(redirectId==-1){\n");
      out.write("\t\t");
session.setAttribute("redirect",0L);
      out.write("\n");
      out.write("\t\twindow.location =\"http://loyaltysource.com/homePage.htm\";\n");
      out.write("\t}\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t\n");
      out.write("\t//When the user click on add product \n");
      out.write("    $(\"#btUpdateProfile\").click(function(){ \n");
      out.write("    \thorloge();\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\t//when user press enter-> nothing \n");
      out.write("\t\n");
      out.write("\t$(\"#tabMyProfile input\").keydown(function(e){\n");
      out.write("\t    if (e.keyCode == 13) { \n");
      out.write("\t        return false;\n");
      out.write("\t    }\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("});\t\n");
      out.write("\n");
      out.write("/*  ]]> */\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
    // /WEB-INF/jsp/layouts/homePage.jsp(23,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#isLogin");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("\t<div class=\"unit\" style=\"width:800px;margin-left:100px;\">\n");
        out.write("\t<div class=\"pop_title\" style=\"margin-top:30px;\">My Profile</div>\n");
        out.write("\t<div id=\"formContainer\" style=\"height: 600px;\">\n");
        out.write("\t<br/> <br/>\n");
        out.write("\t\n");
        out.write("\t\n");
        out.write("\t<!-- ================ Edit profile =============== -->\n");
        out.write("\t");
        if (_jspx_meth_s_005fform_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!-- ================ Edit profile =============== --> \n");
        out.write("\t  \n");
        out.write("\t   \n");
        out.write("\t<!-- ================ dialog Box   =============== -->  \n");
        out.write("    ");
        if (_jspx_meth_s_005fform_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<!-- ================ dialog Box   =============== -->  \n");
        out.write("\t   \n");
        out.write("\t   \n");
        out.write("\t<!-- ================ Progress Bar =============== -->\n");
        out.write("\t</div>\n");
        out.write("\t");
        out.write("<style type=\"text/css\" >\n");
        out.write("\t#progressBarPop {\n");
        out.write("\t\tposition:absolute;\n");
        out.write("\t\twidth:26%;\n");
        out.write("\t\theight:100px;\n");
        out.write("\t\ttop:30%;\n");
        out.write("\t\tleft:37%;\n");
        out.write("\t\tborder:1px solid #B0C4DE;\n");
        out.write("\t\tz-index: 300;\n");
        out.write("\t\tdisplay:none;\n");
        out.write("\t\tvisibility:hidden;\n");
        out.write("\t}\n");
        out.write("</style>\n");
        out.write("\n");
        out.write("<script language=\"javascript\">\n");
        out.write("/* <![CDATA[ */\t\n");
        out.write("document.onmousedown = down;\n");
        out.write("document.onmousemove = drag;\n");
        out.write("document.onmouseup = up;\n");
        out.write("var zindex = 0; //variable globale pour gérer le z-Index\n");
        out.write("var objSelected;\n");
        out.write("function down(objEvent) {\n");
        out.write("\tvar ev = window.event || objEvent ;\n");
        out.write("\t//objet source de l'événement\n");
        out.write("\tobjSelected = ev.srcElement || ev.target;\n");
        out.write("\tif (objSelected.nodeName==\"DIV\") {\n");
        out.write("\t\tobjSelected.style.borderColor = \"red\";\n");
        out.write("\t\tobjSelected.style.cursor = \"move\";\n");
        out.write("\t\tzindex++; //augmenter le z-Index\n");
        out.write("\t\tobjSelected.style.zIndex = zindex ; //mettre l'objet au premier plan\n");
        out.write("\t\tdx = ev.offsetX || ev.layerX;\n");
        out.write("\t\tdy = ev.offsetY || ev.layerY;\t\n");
        out.write("\t\twindow.status = \"dx = \" + dx + \", dy = \" + dy;\n");
        out.write("\t\treturn false; //pour FireFoxe\n");
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
        out.write("<div id=\"progressBarPop\" class=\"conteneurPrompt\">\n");
        out.write("\t\t <div style=\"width:90%;height:100px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 5%; padding-right:5%;\">\n");
        out.write("\t\t\t\t \t<center>\t\n");
        out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"100px\" border=\"0\">\n");
        out.write("\t\t\t\t \t\t\t<tr height=\"15px\">\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" />\n");
        out.write("\t\t\t \t\t\t</tr>\n");
        out.write("\t\t\t \t\t\t<tr height=\"15px\">\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" >\n");
        out.write("\t\t\t\t \t\t\t\tPlease wait ... \n");
        out.write("\t\t\t\t \t\t\t</td>\n");
        out.write("\t\t\t \t\t\t</tr>\n");
        out.write("\t\t\t \t\t\t<tr>\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\">\n");
        out.write("\t\t\t\t \t\t\t\t<img src=\"./images/progressBar.gif\" width=\"100%\"></img>\n");
        out.write("\t\t\t\t \t\t\t</td>\n");
        out.write("\t\t\t \t\t\t</tr>\n");
        out.write("\t\t\t \t\t\t<tr height=\"15px\">\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" />\n");
        out.write("\t\t\t \t\t\t</tr>\n");
        out.write("\t\t\t \t\t\t\n");
        out.write("\t\t\t \t\t</table>\n");
        out.write("\t\t\t \t\t</center>\n");
        out.write("            </div>\n");
        out.write("</div>\n");
        out.write("\n");
        out.write("\t</div>\n");
        out.write("\t<!-- ================ Progress Bar =============== -->\n");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(31,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("homePage.do");
    // /WEB-INF/jsp/layouts/homePage.jsp(31,1) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/layouts/homePage.jsp(31,1) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setValidate("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(31,1) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t<input type=\"hidden\" id=\"doUpadte\" name=\"doUpadte\" value=\"1\"></input>\n");
        out.write("\t\n");
        out.write("\t\n");
        out.write("\t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_s_005ftoken_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t<table id=\"tabMyProfile\">\n");
        out.write("\t\t<!--Login-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td width=\"125px\">Login:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"login_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Login-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Code-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Code:</td>\n");
        out.write("\t\t<td> ");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"code_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Code-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Type-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Type:</td>\n");
        out.write("\t\t<td> ");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("    \t<span id=\"type_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Type-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Password-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Password:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"password_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Password-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Email-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Email:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"email_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Email-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Real Name-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Real Name:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"realName_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Real Name-->\n");
        out.write("\t \t\t\t \t\n");
        out.write("\t \t<!--Address-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Address:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"address_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Address-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Postal Code-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Postal Code:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"postalCode_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Postal Code-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Phone-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Phone:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005ftextfield_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <span id=\"phone_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Phone-->\n");
        out.write("\t \t\n");
        out.write("\t \t<!--Primary language-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Primary language:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("    \t<span id=\"type_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Primary language-->\n");
        out.write("\n");
        out.write("\t \t<!--Secondary language-->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t<td>Secondary language:</td>\n");
        out.write("\t\t<td>");
        if (_jspx_meth_s_005fselect_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \t<span id=\"type_Error\" style=\"display:none;margin-left:2px;\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t \t<!--Secondary language-->\n");
        out.write("\t \t\n");
        out.write("\t</table>\n");
        out.write("\n");
        out.write("         <!-- button update profile -->\n");
        out.write("         <input id=\"btUpdateProfile\" type=\"submit\" value=\"Update My Profile\" \n");
        out.write("        \t  \tstyle=\"margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;\"/>\n");
        out.write("         <!-- button update profile -->   \n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
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
    // /WEB-INF/jsp/layouts/homePage.jsp(35,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setId("userId");
    // /WEB-INF/jsp/layouts/homePage.jsp(35,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("userDTO.id");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftoken_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:token
    org.apache.struts2.views.jsp.ui.TokenTag _jspx_th_s_005ftoken_005f0 = (org.apache.struts2.views.jsp.ui.TokenTag) _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.get(org.apache.struts2.views.jsp.ui.TokenTag.class);
    _jspx_th_s_005ftoken_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftoken_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    int _jspx_eval_s_005ftoken_005f0 = _jspx_th_s_005ftoken_005f0.doStartTag();
    if (_jspx_th_s_005ftoken_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(42,6) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setReadonly("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(42,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("login");
    // /WEB-INF/jsp/layouts/homePage.jsp(42,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("userDTO.login");
    // /WEB-INF/jsp/layouts/homePage.jsp(42,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setMaxlength("30");
    // /WEB-INF/jsp/layouts/homePage.jsp(42,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(50,7) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setReadonly("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(50,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setId("code");
    // /WEB-INF/jsp/layouts/homePage.jsp(50,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("userDTO.code");
    // /WEB-INF/jsp/layouts/homePage.jsp(50,7) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setMaxlength("30");
    // /WEB-INF/jsp/layouts/homePage.jsp(50,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005freadonly_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("type");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setDisabled("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("userDTO.typeId");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width:170px;");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setRequired("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("-1");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("--Please Select--");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("value");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("%{typeName}");
    // /WEB-INF/jsp/layouts/homePage.jsp(58,7) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("%{@com.loyauty.web.WebConstants@ALL_USER_TYPE}");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fdisabled_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(74,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setId("password");
    // /WEB-INF/jsp/layouts/homePage.jsp(74,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("userDTO.password");
    // /WEB-INF/jsp/layouts/homePage.jsp(74,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setMaxlength("30");
    // /WEB-INF/jsp/layouts/homePage.jsp(74,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(82,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setId("email");
    // /WEB-INF/jsp/layouts/homePage.jsp(82,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("userDTO.email");
    // /WEB-INF/jsp/layouts/homePage.jsp(82,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setMaxlength("320");
    // /WEB-INF/jsp/layouts/homePage.jsp(82,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(90,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setId("realName");
    // /WEB-INF/jsp/layouts/homePage.jsp(90,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("userDTO.realName");
    // /WEB-INF/jsp/layouts/homePage.jsp(90,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setMaxlength("50");
    // /WEB-INF/jsp/layouts/homePage.jsp(90,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(98,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setId("address");
    // /WEB-INF/jsp/layouts/homePage.jsp(98,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("userDTO.address");
    // /WEB-INF/jsp/layouts/homePage.jsp(98,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setMaxlength("120");
    // /WEB-INF/jsp/layouts/homePage.jsp(98,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(106,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setId("postalCode");
    // /WEB-INF/jsp/layouts/homePage.jsp(106,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setName("userDTO.postalCode");
    // /WEB-INF/jsp/layouts/homePage.jsp(106,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setMaxlength("10");
    // /WEB-INF/jsp/layouts/homePage.jsp(106,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f6 = _jspx_th_s_005ftextfield_005f6.doStartTag();
    if (_jspx_th_s_005ftextfield_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(114,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setId("phone");
    // /WEB-INF/jsp/layouts/homePage.jsp(114,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setName("userDTO.phone");
    // /WEB-INF/jsp/layouts/homePage.jsp(114,6) name = maxlength type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setMaxlength("12");
    // /WEB-INF/jsp/layouts/homePage.jsp(114,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setCssStyle("width:170px;");
    int _jspx_eval_s_005ftextfield_005f7 = _jspx_th_s_005ftextfield_005f7.doStartTag();
    if (_jspx_th_s_005ftextfield_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fmaxlength_005fid_005fcssStyle_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setId("primaryLanguage");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("userDTO.primaryLanguage");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setCssStyle("width:170px;");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setRequired("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("-1");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("--Please Select--");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("value");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("%{getText(localizationKey)}");
    // /WEB-INF/jsp/layouts/homePage.jsp(122,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f2 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setId("secondaryLanguage");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setName("userDTO.secondaryLanguage");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setCssStyle("width:170px;");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setRequired("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderKey("-1");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderValue("--Please Select--");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListKey("value");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListValue("%{getText(localizationKey)}");
    // /WEB-INF/jsp/layouts/homePage.jsp(138,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setList("%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}");
    int _jspx_eval_s_005fselect_005f2 = _jspx_th_s_005fselect_005f2.doStartTag();
    if (_jspx_th_s_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/layouts/homePage.jsp(162,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("homePage.do");
    // /WEB-INF/jsp/layouts/homePage.jsp(162,4) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /WEB-INF/jsp/layouts/homePage.jsp(162,4) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setValidate("true");
    // /WEB-INF/jsp/layouts/homePage.jsp(162,4) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t<input type=\"hidden\" id=\"doUpadte\" name=\"doUpadte\" value=\"0\"></input>\n");
        out.write("\t");
        out.write("<style type=\"text/css\" >\n");
        out.write("\t#resultPop {\n");
        out.write("\t\tposition:absolute;\n");
        out.write("\t\twidth:26%;\n");
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
        out.write("<div id=\"resultPop\" class=\"conteneurPrompt\" style='");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("' >\n");
        out.write("\t\t<span style=\"color:white;font-size: 16px;vertical-align: middle;\">Result</span>\n");
        out.write("\t\t<div style=\"height: 5px;\"></div>\n");
        out.write("\t\t <div style=\"width:100%;height:130px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;\">\n");
        out.write("\t\t\t\t \t<center>\n");
        out.write("\t\t\t \t\t<table  cellspacing=\"0\" width=\"100%\" height=\"130px\" border=\"0\">\n");
        out.write("\t\t\t \t\t\n");
        out.write("\t\t\t \t\t\t<tr>\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" style=\"padding-left: 20px;padding-right: 20px;\">\n");
        out.write("\t\t\t\t \t\t\t\t<div style=\"max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;\">\n");
        out.write("\t\t\t\t \t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t \t\t\t</td>\n");
        out.write("\t\t\t \t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t \t\t\t<tr height=\"45px\" valign=\"top\">\n");
        out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\"><input id=\"btOKResultPop\" type=\"submit\" value=\"Ok\"\n");
        out.write("\t\t\t\t \t\t\t    style=\"font-family: Arial, Helvetica, sans-serif;padding:1px 15px;font-size:15px;\"/></td>\n");
        out.write("\t\t\t \t\t\t</tr>\t \t\t\t\n");
        out.write("\t\t\t \t\t</table>\n");
        out.write("\t\t\t \t\t</center>\n");
        out.write("            </div>\n");
        out.write("</div>");
        out.write('\n');
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
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/layouts/./dialogsPop/resultPop.jsp(60,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("%{showPopResult}");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /WEB-INF/jsp/layouts/./dialogsPop/resultPop.jsp(70,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("%{messageUpdate}");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
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
        out.write("\t<div class=\"unit\" style=\"width:800px;margin-left:100px;\">\n");
        out.write("\t<div class=\"pop_title\" style=\"margin-top:30px;\"></div>\n");
        out.write("\t  <div id=\"formContainer\" style=\"height: 600px;\">\n");
        out.write("\t  <br/><br/>\n");
        out.write("\t</div>\n");
        out.write("\t</div> \t\n");
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
}
