package org.apache.jsp.WEB_002dINF.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"thumbnailhover_files/jquery-latest.js\"></script>\n");
      out.write("<style>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("#userLogin :HOVER{\n");
      out.write("\tcolor:rgb(204,5,5);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("\tborder-color: white;\n");
      out.write("}\n");
      out.write("#userLogin :LINK{\n");
      out.write("\tcolor:rgb(44,140,171);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("\tborder-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#liUserLogin :HOVER{\n");
      out.write("\tcolor:rgb(204,5,5);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("#liUserLogin :LINK{\n");
      out.write("\tcolor:rgb(44,140,171);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sign_in_link :HOVER{\n");
      out.write("\tcolor:rgb(204,5,5);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("#sign_in_link :LINK{\n");
      out.write("\tcolor:rgb(44,140,171);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#liSign_in_link :HOVER{\n");
      out.write("\tcolor:rgb(204,5,5);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("#liSign_in_link :LINK{\n");
      out.write("\tcolor:rgb(44,140,171);\n");
      out.write("\tbackground:rgb(247,247,247);\n");
      out.write("}\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- BEGIN TOP MENU -->\n");
      out.write("<div id=\"top_menu\" class=\"unit section_underline gray_bg\" style=\"padding:10px 0px 0px 60px;width: 100%;\">\n");
      out.write("  <div>\n");
      out.write("  \t<div style=\"margin-bottom:10px;\">\n");
      out.write("  \t\t<a href=\"homePage.do\">\n");
      out.write("  \t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${images}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logo_small.png\" width=\"259\" height=\"51\" />\n");
      out.write("  \t\t</a>\n");
      out.write("  \t</div>\n");
      out.write("    <!-- Beginning of compulsory code below -->\n");
      out.write("<div class=\"on-2 columns\" style=\"width:100%;\">\n");
      out.write("<div>\n");
      out.write("<ul id=\"nav\" class=\"dropdown dropdown-horizontal\">\n");
      out.write("\t<li id=\"content_validation\"><span class=\"dir\">User Manager</span>\n");
      out.write("\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</li>\n");
      out.write("    <li id=\"content_mod\"><span class=\"dir\">Manage Brands - Categories & Product </span>\n");
      out.write("    \t");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write("\t  \n");
      out.write("  </li>\t\n");
      out.write("\t<li id=\"PoHandling\" style=\"visibility:hidden;display:none;\"><span class=\"dir\">Utilities</span>\n");
      out.write("\t");
      if (_jspx_meth_s_005fif_005f10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t<!-- ********************************** Order management ******************************* -->\n");
      out.write("\t\n");
      out.write("\t\t<li id=\"orderMenu\"><span class=\"dir\">Order Management</span>\n");
      out.write("\t");
      if (_jspx_meth_s_005fif_005f11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t<!-- *********************************************************************************** -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f15 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_005fif_005f15.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f15.setParent(null);
      // /WEB-INF/jsp/layouts/menu.jsp(275,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f15.setTest("#isLogin");
      int _jspx_eval_s_005fif_005f15 = _jspx_th_s_005fif_005f15.doStartTag();
      if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fif_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fif_005f15.doInitBody();
        }
        do {
          out.write(" \n");
          out.write("    \t<li id=\"liUserLogin\" style=\"color:blue;background: transparent; border: 0px;width: 270px; border: solid 0px;\">\n");
          out.write("    \t\t<table border=\"0\">\n");
          out.write("    \t\t<tr>\n");
          out.write("    \t\t<td width=\"20px\"></td>\n");
          out.write("    \t\t<td width=\"70px\" align=\"left\"><I style=\"color:rgb(119,119,119);font-size: 11pt;font-weight: normal; font-family: Arial,Verdana;\">Welcome</I></td>\n");
          out.write("    \t\t\n");
          out.write("    \t\t<td> <a  id=\"userLogin\" style=\"align:left;border: 0px;color: rgb(44,140,171);font-size: 16px;font-weight: normal;font-family: Verdana, Arial;padding-left: 0px; padding-right: 0px;\" href=\"\"><I>");
          out.print(request.getSession(true).getAttribute("login"));
          out.write("</I></a></td>\n");
          out.write("    \t\t</tr>\n");
          out.write("    \t\t</table>\n");
          out.write("\n");
          out.write("    \t</li>\n");
          out.write("    \t");
          out.write("<style type=\"text/css\" >\n");
          out.write("\t#logoutPop {\n");
          out.write("\t\tposition:absolute;\n");
          out.write("\t\twidth:26%;\n");
          out.write("\t\theight:160px;\n");
          out.write("\t\ttop:140%;\n");
          out.write("\t\tleft:72%;\n");
          out.write("\t\tborder:0px solid transparent;;\n");
          out.write("\t\tz-index: 300;\n");
          out.write("\t\tdisplay:none;\n");
          out.write("\t\tvisibility:hidden;\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\t.popup {\n");
          out.write("    background-color:rgb(249,249,249);\n");
          out.write("    position:relative;\n");
          out.write("    display:inline-block;\n");
          out.write("    padding:.2em .5em;\n");
          out.write("    border:1px solid rgb(119,119,119);\n");
          out.write("    z-index:0;\n");
          out.write("\t\n");
          out.write("\t\n");
          out.write("\twidth: 130px;\n");
          out.write("    height: 80px;\n");
          out.write("    background: #9a4;\n");
          out.write("    -webkit-border-radius: 15px;\n");
          out.write("    -moz-border-radius:    15px; \n");
          out.write("\tborder-radius:    10px;\n");
          out.write("\t\n");
          out.write("}\n");
          out.write("\n");
          out.write(".popup:after,\n");
          out.write(".popup:before {\n");
          out.write("    width:0;\n");
          out.write("    height:0;\n");
          out.write("    content:\"\";\n");
          out.write("    display:block;\n");
          out.write("    position:absolute;\n");
          out.write("    bottom:100%;\n");
          out.write("    left:30%;\n");
          out.write("}\n");
          out.write("\n");
          out.write(".popup:after {\n");
          out.write("    border-bottom:10px solid rgb(249,249,249);\n");
          out.write("    border-left:10px solid transparent;\n");
          out.write("    border-right:10px solid transparent;\n");
          out.write("    z-index:1;\n");
          out.write("    margin-top:1px;\n");
          out.write("}\n");
          out.write("\n");
          out.write(".popup:before {\n");
          out.write("    border-bottom:13px solid rgb(119,119,119);\n");
          out.write("    border-left:13px solid transparent;\n");
          out.write("    border-right:13px solid transparent;\n");
          out.write("    margin-top:-1px;\n");
          out.write("    margin-left:-1px;\n");
          out.write("    z-index:-100;\n");
          out.write("}\n");
          out.write("\n");
          out.write("\t\n");
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
          out.write("\t\tobjSelected.style.borderColor = \"red\";\n");
          out.write("\t\tobjSelected.style.cursor = \"move\";\n");
          out.write("\t\tzindex++;\n");
          out.write("\t\tobjSelected.style.zIndex = zindex ;\n");
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
          out.write("\n");
          out.write("<div id=\"logoutPop\" class=\"conteneurPrompt\">\n");
          out.write("\n");
          out.write("\t\t <div class=\"popup\"  style=\"align:center;width:90%;height:100%;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 5%; padding-right:5%;\">\n");
          out.write("\t\t\t\t \t<center>\t\n");
          out.write("\t\t\t \t\t<table cellspacing=\"0\" width=\"100%\" height=\"155px\" border=\"0\">\n");
          out.write("\t\t\t \t\t\n");
          out.write("\t\t\t \t\t\t<tr height=\"10px\">\n");
          out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" />\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t<tr height=\"30px\">\n");
          out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"left\" valign=\"middle\" style=\"font-weight: normal;color:rgb(119,119,119);padding-left:32px;\" >\n");
          out.write("\t\t\t\t \t\t\t\t");
          out.print(request.getSession(true).getAttribute("fullName"));
          out.write(" \n");
          out.write("\t\t\t\t \t\t\t</td>\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t<tr height=\"5px\">\n");
          out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" />\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t\t\t\t \t\t\t\n");
          out.write("\t\t\t \t\t\t<tr align=\"center\" valign=\"bottom\">\n");
          out.write("\t\t\t \t\t\t\t<td align=\"left\" width=\"25px;\"><img height=\"22\" width=\"19\" src=\"./images/icon_edit.gif\"/></td>\n");
          out.write("\t\t\t\t \t\t\t<td align=\"left\" valign=\"bottom\" style=\"cursor:pointer;color:rgb(57,166,200);padding: 0px;\">\n");
          out.write("\t\t\t\t \t\t\t\t<center  id=\"noteAdmin\" style=\"width: 55px;font-weight: normal;\">Notes</center>\n");
          out.write("\t\t\t\t \t\t\t\t");
          if (_jspx_meth_s_005fform_005f0(_jspx_th_s_005fif_005f15, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t \t\t\t</td>\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t\n");
          out.write("\t\t\t \t\t\t<tr align=\"center\" style=\"height: 30px;\">\n");
          out.write("\t\t\t \t\t\t\t<td align=\"left\" width=\"25px;\" valign=\"bottom\"><img src=\"./images/imgMyProfile.png\"/></td>\n");
          out.write("\t\t\t\t \t\t\t<td align=\"left\" valign=\"bottom\" style=\"cursor:pointer;color:rgb(57,166,200);padding: 0px;\">\n");
          out.write("\t\t\t\t \t\t\t\t<center id=\"myProfile\" style=\"width: 80px;font-weight: normal;\">My Profile</center>\n");
          out.write("\t\t\t\t \t\t\t\t");
          if (_jspx_meth_s_005fform_005f1(_jspx_th_s_005fif_005f15, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t \t\t\t</td>\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t<tr height=\"10px\">\n");
          out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" />\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\t\t\t \t\t\t<tr height=\"10px\">\n");
          out.write("\t\t\t\t \t\t\t<td colspan=\"2\" align=\"center\" valign=\"bottom\">\n");
          out.write("\t\t\t\t \t\t\t<img style=\"cursor:pointer\" id=\"execteHrefLogOut\" alt=\"logOut\" src=\"./images/btLogout.png\" title=\"Log Out\"/>\n");
          out.write("\t\t\t\t \t\t\t\t");
          if (_jspx_meth_s_005fform_005f2(_jspx_th_s_005fif_005f15, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t \t\t\t</td>\n");
          out.write("\t\t\t \t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t \t\t</table>\n");
          out.write("\t\t\t \t\t</center>\n");
          out.write("            </div>\n");
          out.write("            \n");
          out.write("            <!--  \n");
          out.write("            <label id=\"myProfile\" style=\"cursor:pointer;\">\n");
          out.write("            -->\n");
          out.write("</div>");
          out.write(" \n");
          out.write("    ");
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
        return;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f15);
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\t\n");
      out.write("</div>\n");
      out.write("<!-- / END -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- END TOP MENU --> \n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//<a href=\"user/logout.do\">Log Out</a>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"a#sign_in_link\").fancybox(LoyaltyDatatableTypes.AjaxNoCache);\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/* <![CDATA[ */ \n");
      out.write("\n");
      out.write("var showLogoutPop=0;\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t\tvar user = '");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\tvar session = '");
      out.print(request.getSession(true).getAttribute("usr"));
      out.write("';\n");
      out.write("\n");
      out.write("\t    //When the user click on the menu log\n");
      out.write("\t    $(\"#userLogin\").click(function(){ \n");
      out.write("\t    \tif(showLogoutPop==0){\n");
      out.write("\t\t\t\t$(\"#logoutPop\").css(\"display\",\"block\"); \n");
      out.write("\t\t\t\t$(\"#logoutPop\").css(\"visibility\",\"visible\");\n");
      out.write("\t\t\t\tshowLogoutPop=1;\n");
      out.write("\t    \t}else{\n");
      out.write("\t\t\t\t$(\"#logoutPop\").css(\"display\",\"none\");  \n");
      out.write("\t\t\t\t$(\"#logoutPop\").css(\"visibility\",\"hidden\");\n");
      out.write("\t\t\t\tshowLogoutPop=0;\n");
      out.write("\t    \t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t    //When the user click on the menu log we must cancel submit \n");
      out.write("\t    $(\"#userLogin\").click(function(){ \n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t    //When the user admin click on the button Log Out\n");
      out.write("\t    $(\"#execteHrefLogOut\").click(function(){ \n");
      out.write("\t    \t//click on the button submit of the page logoutPop to log out\n");
      out.write("\t    \t$('#submitLogOut').click();\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t    //hide logoutPop when user click on page \n");
      out.write("\t    $(\"body\").click(function(){ \n");
      out.write("\t    \t$(\"#logoutPop\").css(\"display\",\"none\");  \n");
      out.write("\t\t\t$(\"#logoutPop\").css(\"visibility\",\"hidden\");\n");
      out.write("\t\t\tshowLogoutPop=0;\n");
      out.write("\t\t});\n");
      out.write("\t    \n");
      out.write("\t\t\n");
      out.write("\t    //when mouse over on My Profile \n");
      out.write("\t    $(\"#myProfile\").mouseover(function(){ \n");
      out.write("\t    \t$(\"#myProfile\").css(\"color\",\"rgb(204,5,5)\"); \n");
      out.write("\t\t});\n");
      out.write("\t    \n");
      out.write("\t\t\n");
      out.write("\t    //when mouse over on My Profile \n");
      out.write("\t    $(\"#myProfile\").mouseout(function(){ \n");
      out.write("\t    \t$(\"#myProfile\").css(\"color\",\"rgb(57,166,200)\"); \n");
      out.write("\t\t});\n");
      out.write("\t    \n");
      out.write("\t\t\n");
      out.write("\t    //when Admin click on text \"My Profile\" in logoutPop\n");
      out.write("\t    $(\"#myProfile\").click(function(){ \n");
      out.write("\t    \t$(\"#submitMyProfile\").click(); \n");
      out.write("\t\t}); \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t    //when mouse over on Note \n");
      out.write("\t    $(\"#noteAdmin\").mouseover(function(){ \n");
      out.write("\t    \t$(\"#noteAdmin\").css(\"color\",\"rgb(204,5,5)\"); \n");
      out.write("\t\t});\n");
      out.write("\t    \n");
      out.write("\t\t\n");
      out.write("\t    //when mouse over on Note \n");
      out.write("\t    $(\"#noteAdmin\").mouseout(function(){ \n");
      out.write("\t    \t$(\"#noteAdmin\").css(\"color\",\"rgb(57,166,200)\"); \n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t    //when Admin click on text \"Notes\" in logoutPop\n");
      out.write("\t    $(\"#noteAdmin\").click(function(){ \n");
      out.write("\t    \t$(\"#submitNoteAdmin\").click(); \n");
      out.write("\t\t}); \n");
      out.write(" \n");
      out.write("\t\t\n");
      out.write("});\t\n");
      out.write("\n");
      out.write("/*  ]]> */\n");
      out.write("</script>\n");
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
    // /WEB-INF/jsp/layouts/menu.jsp(61,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#isLogin");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\t\t\n");
        out.write("\t");
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

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/layouts/menu.jsp(62,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{#session.usr == \"uv\"}");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<ul>\n");
        out.write("            <li><span class=\"dir\">View Accounts</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li class=\"first\"><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER_LIST_VIEW}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Accounts Info</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t</ul>\n");
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

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsp/layouts/menu.jsp(71,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{#session.usr == \"menu\"}");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<ul>\n");
        out.write("\t\t\t<li><span class=\"dir\">User</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"initUser.do\">Add</a></li>\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f3(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<li><span class=\"dir\">Template</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"addTemplate.do\">Add/Remove Template</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"editTemplate.do\">Edit Template</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\t\t\t\n");
        out.write("            <li><span class=\"dir\">Accounts Management</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t\t<li class=\"first\"><a href=\"usersListAccount.do\">List Accounts</a></li>\n");
        out.write("\t\t\t\t\t<!--<li class=\"first\"><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER_LIST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">List Accounts</a></li>-->\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t<li><span class=\"dir\">User Connection</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t<li class=\"first\"><a href=\"userConnection.do\">User Connection</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t</ul>\n");
        out.write("\n");
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

  private boolean _jspx_meth_s_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /WEB-INF/jsp/layouts/menu.jsp(76,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("#session.login==\"frank\"");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<li class=\"first\"><a href=\"goToTransfer.do\">Transfer</a></li>\n");
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

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/layouts/menu.jsp(111,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("#isLogin");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("    \t\n");
        out.write("    \t\t     ");
        if (_jspx_meth_s_005fif_005f5(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\t  \n");
        out.write("\t  ");
        if (_jspx_meth_s_005fif_005f6(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\n");
        out.write("\t  \t");
        if (_jspx_meth_s_005fif_005f9(_jspx_th_s_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\t  \t\n");
        out.write("\t  \t\n");
        out.write("\t  ");
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

  private boolean _jspx_meth_s_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /WEB-INF/jsp/layouts/menu.jsp(112,11) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("%{#session.usr == \"uv\"}");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<ul>\t\t\t\t\n");
        out.write("\t\t\t\t\t<li><span class=\"dir\">Brand</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BRAND_LIST_VIEW}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">View</a></li>\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("                    <li><span class=\"dir\">Category</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CATEGORY_LIST_VIEW}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">View</a></li>\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t<li><span class=\"dir\">Main Specification</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SPECIFICATION_LIST_VIEW}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">View</a></li>\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("                    <li><span class=\"dir\">Product</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"getProductList.do\">View</a></li>\t\t\t\t\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\t\t\t\n");
        out.write("\t  \t\t</ul>\t  \n");
        out.write("\t  ");
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

  private boolean _jspx_meth_s_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f6 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /WEB-INF/jsp/layouts/menu.jsp(136,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f6.setTest("%{#session.usr == \"menu\"}");
    int _jspx_eval_s_005fif_005f6 = _jspx_th_s_005fif_005f6.doStartTag();
    if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f6.doInitBody();
      }
      do {
        out.write("    \t\t\n");
        out.write("\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><span class=\"dir\">Brand</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BRAND_LIST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Edit</a></li>\n");
        out.write("\t\t\t                <li><a href=\"addBrand.do\">Add</a></li>                    \t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("                    <li><span class=\"dir\">Category</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CATEGORY_LIST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Edit</a></li>\n");
        out.write("\t\t\t                <li><a href=\"addCategory.do\">Add</a></li>                    \t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t<li><span class=\"dir\">Main Specification</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"commonList.do?pageType=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${MAIN_SPECIFICATION_LIST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Edit</a></li>\n");
        out.write("\t\t\t                <li><a href=\"addMainSpecification.do\">Add</a></li>\t\t\t\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("                    <li><span class=\"dir\">Product</span>\n");
        out.write("\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"getProductList.do\">Edit</a></li>\n");
        out.write("\t\t\t                <li><a href=\"addProduct.do\">Add</a></li>\n");
        out.write("\t\t\t                ");
        if (_jspx_meth_s_005fif_005f7(_jspx_th_s_005fif_005f6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fif_005f8(_jspx_th_s_005fif_005f6, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("\t  \t\t</ul>\t  \t\t\t  \n");
        out.write("\t  \t");
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

  private boolean _jspx_meth_s_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f7 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f6);
    // /WEB-INF/jsp/layouts/menu.jsp(160,19) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f7.setTest("%{usersPrivProductClassificat!=null}");
    int _jspx_eval_s_005fif_005f7 = _jspx_th_s_005fif_005f7.doStartTag();
    if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t                \t<li><a href=\"classificateProducts.do\">Classification</a></li>\n");
        out.write("\t\t\t                ");
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

  private boolean _jspx_meth_s_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f8 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f6);
    // /WEB-INF/jsp/layouts/menu.jsp(165,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f8.setTest("%{usersPrivCurrency!=null}");
    int _jspx_eval_s_005fif_005f8 = _jspx_th_s_005fif_005f8.doStartTag();
    if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li>\n");
        out.write("\t\t\t\t\t\t\t<span class=\"dir\">Currency</span>\n");
        out.write("\t\t\t\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t\t\t\t<li><a href=\"editCurrency.do\">Edit</a></li>\n");
        out.write("\t\t\t\t                <li><a href=\"addCurrency.do\">Add</a></li>\n");
        out.write("\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t        ");
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

  private boolean _jspx_meth_s_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f9 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f4);
    // /WEB-INF/jsp/layouts/menu.jsp(177,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f9.setTest("%{#session.usr == \"amender\"}");
    int _jspx_eval_s_005fif_005f9 = _jspx_th_s_005fif_005f9.doStartTag();
    if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<ul>\n");
        out.write("\t\t\t\t<li><a href=\"getProductList.do\">Amend Product</a></li>\n");
        out.write("\t  \t\t</ul>\t  \t\n");
        out.write("\t  \t");
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

  private boolean _jspx_meth_s_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f10 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f10.setParent(null);
    // /WEB-INF/jsp/layouts/menu.jsp(186,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f10.setTest("#isLogin");
    int _jspx_eval_s_005fif_005f10 = _jspx_th_s_005fif_005f10.doStartTag();
    if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t<li><span class=\"dir\">Asia Miles</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"transform.do\">Transform XLS to PDF</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<li><span class=\"dir\">Advantage</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"transformXLSADV.do\">Transform XLS to PDF</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<li><span class=\"dir\">Inbox</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"transformXML.do\">Transform XML to PDF</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\t\t\t\n");
        out.write("\t\t</ul>\t\n");
        out.write("\t");
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

  private boolean _jspx_meth_s_005fif_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f11 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f11.setParent(null);
    // /WEB-INF/jsp/layouts/menu.jsp(216,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f11.setTest("#isLogin");
    int _jspx_eval_s_005fif_005f11 = _jspx_th_s_005fif_005f11.doStartTag();
    if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<ul>\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fif_005f12(_jspx_th_s_005fif_005f11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<li><span class=\"dir\">Handling</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToReportOrders.do?init=2\">Handling</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fif_005f13(_jspx_th_s_005fif_005f11, _jspx_page_context))
          return true;
        out.write("\t\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t</ul>\t\n");
        out.write("\t");
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

  private boolean _jspx_meth_s_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f12 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f11);
    // /WEB-INF/jsp/layouts/menu.jsp(218,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f12.setTest("%{superAdmin!=null}");
    int _jspx_eval_s_005fif_005f12 = _jspx_th_s_005fif_005f12.doStartTag();
    if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<li><span class=\"dir\">Creation</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToCreateOrdersAutoRemoteFile.do\">From Remote PO File</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToCreateOrdersAuto.do\">From Local PO File</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToCreateOrdersManual.do?init=1\">Manual</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_s_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f13 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f11);
    // /WEB-INF/jsp/layouts/menu.jsp(234,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f13.setTest("%{superAdmin!=null}");
    int _jspx_eval_s_005fif_005f13 = _jspx_th_s_005fif_005f13.doStartTag();
    if (_jspx_eval_s_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<li><span class=\"dir\">Updated By XLS File </span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToUploadAdminXLS.do?init=1\">Products Shipped</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToUploadAdminXLS.do?init=2\">Stock</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToUploadAdminXLS.do?init=3\">Special Shipping Rate</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToUploadAdminXLS.do?init=4\">ETA Report</a></li>\n");
        out.write("\t\t\t\t\t<!--<li><a href=\"ordersAdminXLS.do?init=1\">Export</a></li>-->\t\t\t\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t   <li><span class=\"dir\">Orders Invoiced</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"goToInvoicedOrders.do?init=2\">Orders Invoiced</a></li>\n");
        out.write("\t\t\t\t\t<li><a href=\"generateInvoice.do\">Generate Invoice</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t   </li>\n");
        out.write("\t\t   \n");
        out.write("\t\t    ");
        if (_jspx_meth_s_005fif_005f14(_jspx_th_s_005fif_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t   \t\n");
        out.write("\t\t  <li><span class=\"dir\">get Orders By PO</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"getOrdersByPOSumit.do?sumit=3\">get Orders By PO</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t   </li>\n");
        out.write("\t\t   \n");
        out.write("\t\t   ");
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

  private boolean _jspx_meth_s_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f14 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f13);
    // /WEB-INF/jsp/layouts/menu.jsp(251,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f14.setTest("%{usersPrivOrdersMapping!=null}");
    int _jspx_eval_s_005fif_005f14 = _jspx_th_s_005fif_005f14.doStartTag();
    if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t  \t<li><span class=\"dir\">Orders Mapping</span>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li><a href=\"ordersFileMapper.do\">Orders Mapping</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t   \t</li>\n");
        out.write("\t\t   \t");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(128,9) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("noteAdmin.do");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(128,9) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(128,9) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setValidate("true");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(128,9) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t \t\t\t\t\t<input style=\"display:none;visibility:hidden;\" id=\"submitNoteAdmin\" type=\"submit\" value=\"NoteAdmin\" />\n");
        out.write("\t\t\t\t \t\t\t\t");
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

  private boolean _jspx_meth_s_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(138,9) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("homePage.do");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(138,9) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(138,9) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setValidate("true");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(138,9) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t \t\t\t\t\t<input style=\"display:none;visibility:hidden;\" id=\"submitMyProfile\" type=\"submit\" value=\"logOut\" />\n");
        out.write("\t\t\t\t \t\t\t\t");
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

  private boolean _jspx_meth_s_005fform_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f2 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f15);
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(149,9) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setAction("user/logout.do");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(149,9) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setMethod("post");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(149,9) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f2.setValidate("true");
    // /WEB-INF/jsp/layouts/dialogsPop/logoutPop.jsp(149,9) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t \t\t\t\t\t<input style=\"display:none;visibility:hidden;\" id=\"submitLogOut\" type=\"submit\" value=\"logOut\" />\n");
        out.write("\t\t\t\t \t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f2);
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
        out.write("\n");
        out.write("    \t<li id=\"liSign_in_link\" style=\"color:blue;background: transparent; border: 0px;width: 270px; border: solid 0px;\">\n");
        out.write("    \t<table border=\"0\">\n");
        out.write("    \t<tr>\n");
        out.write("    \t<td width=\"20px\"></td>\n");
        out.write("    \t<td><a id=\"sign_in_link\" href=\"signInPop.do\" style=\"align:left;border: 0px;color: rgb(44,140,171);font-size: 16px;font-weight: normal;font-family: Verdana, Arial;padding-left: 0px; padding-right: 0px;\"><I>");
        if (_jspx_meth_s_005ftext_005f0(_jspx_th_s_005felse_005f0, _jspx_page_context))
          return true;
        out.write("</I></a></td>\n");
        out.write("    \t</tr>\n");
        out.write("    \t</table>\n");
        out.write("    \t</li>\n");
        out.write("    ");
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

  private boolean _jspx_meth_s_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f0);
    // /WEB-INF/jsp/layouts/menu.jsp(295,210) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("loyauty.common.title.signIn");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /WEB-INF/jsp/layouts/menu.jsp(321,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("usr");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
