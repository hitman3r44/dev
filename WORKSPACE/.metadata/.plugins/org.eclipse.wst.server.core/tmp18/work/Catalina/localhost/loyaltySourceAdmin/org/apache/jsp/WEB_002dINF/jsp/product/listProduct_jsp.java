package org.apache.jsp.WEB_002dINF.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.release();
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
      out.write("<style type=\"text/css\">\n");
      out.write("label { width:150px; }\n");
      out.write(".vanadium-advice { margin-left: 150px; }\n");
      out.write("table { border-collapse:collapse; }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"unit\" style=\"width:1400px;margin:30px 0px 0px 60px;\">\n");
      out.write("  <div class=\"pop_title\" id=\"Title\">Manage Product</div>\n");
      out.write("  <!-- A List for Global Error Messages -->\n");
      out.write("  ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <label for=\"url\">Brands :</label>\n");
      out.write("        ");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \t\t\t  \n");
      out.write("    \t\t\t  \n");
      out.write("     \t<br />  <br /> \n");
      out.write("     \t<label for=\"url\">Category :</label>\n");
      out.write("        ");
      if (_jspx_meth_s_005fselect_005f1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("     \t<br/><br/>\n");
      out.write(" \t  \t\t\t  \n");
      out.write("\t\t<table><tr>\n");
      out.write("\t\t<td>");
      if (_jspx_meth_s_005fcheckbox_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t<td width=\"40\"><label for=\"url\">Show Discontinued Items</label></td>\n");
      out.write("\t\t<td></td><td></td>\n");
      out.write("\t\t<td>");
      if (_jspx_meth_s_005fcheckbox_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      \t<td><label for=\"url\">Show Disabled Items</label></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("     \t<br/><br/>     \t\n");
      out.write("        <label for=\"url\"></label>\n");
      out.write("        <input id=\"getProductList\" type=\"button\" name=\"getProductList\" value=\"Get Products\"/>\n");
      out.write("        <span id=\"hande_Error\" style=\"display:none;margin-left:2px;\"></span>\n");
      out.write("        <span id=\"ajax_loading\" style=\"display:none;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${images}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/ajax-loader.gif\" /></span>\n");
      out.write("<br />\n");
      out.write("<div id=\"productList\" class=\"fixed column\" style=\"padding:20px 0px 0px 0px;\">\n");
      out.write("<div class=\"blue f12 bold pb10\" style=\"padding-bottom:10px;\"></div>\n");
      out.write("<table id=\"productListData\" width=\"100%\" border=\"0\" class=\"pad_5px nowraptable datatable\" >\n");
      out.write("<thead class=\"gray_header\">\n");
      out.write("\t<tr>\n");
      out.write("    \t<th>ID</th>\n");
      out.write("        <th>Product</th>\n");
      out.write("        <th>Brand</th>\n");
      out.write("        <th>Category</th>\n");
      out.write("        <th>Status</th>\n");
      out.write("        <th>Suppliers</th>\n");
      out.write("        <th>Loyalty Source Product</th>\n");
      out.write("        <th>Action</th>\n");
      out.write("\t</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");
      out.write("\t<tr>\n");
      out.write("    \t<td colspan=\"5\" class=\"dataTables_empty\"></td>\n");
      out.write("    </tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$('#getProductList').click( function() {\n");
      out.write("\t\t\tvar oTable = initializeDatatable();\n");
      out.write("\t\t\t$('#ajax_loading').show();\n");
      out.write("\t\t\tvar userTypeId = '");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\t\tvar isDiscontinued =false;\n");
      out.write("\t\t\tvar isDisabled =false;\n");
      out.write("\t\t\tif($('#discontinued').attr('checked')=='checked')isDiscontinued=true;\n");
      out.write("\t\t\tif($('#disabled').attr('checked')=='checked')isDisabled=true;\n");
      out.write("\t\t\tgetProductListByQuery( $('#brand').val(), $('#category').val(), isDiscontinued, isDisabled, oTable, userTypeId);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("$(document).ready(function() { \n");
      out.write("\t$('#brandName').val($('#brand option:selected').text());\n");
      out.write("\t$('#categoryName').val($('#category option:selected').text());\n");
      out.write("\t\t\n");
      out.write("\t// brand changes\n");
      out.write("\t$(\"#brand\").change( function() {\t\n");
      out.write("\t\tvar cat;\t\t\t\t\n");
      out.write("\t\t$('#brandName').val($('#brand option:selected').text());\t\t\t\t\n");
      out.write("\t\tpopulateCategory($(this).val(), cat);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("    // category changes\n");
      out.write("    $(\"#category\").change( function() {\n");
      out.write("        var spec;\n");
      out.write("        $('#categoryName').val($('#category option:selected').text());\n");
      out.write("        populateMainSpecification($(this).val(), $(\"#brand\").val(), spec);\n");
      out.write("    });\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*      THIS COMES FROM editProduct.jsp     */\n");
      out.write("        /*         [BEGIN - editProduct.jsp]        */\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        var receiveSignal = ");
      out.print( request.getParameter("signalHid") );
      out.write(";\n");
      out.write("        var b = ");
      out.print( request.getParameter("brandIDHid") );
      out.write(";\n");
      out.write("        var c = ");
      out.print( request.getParameter("categoryIDHid") );
      out.write(";\n");
      out.write("        var bb = $(\"#brand\").val();\n");
      out.write("        var cc = $(\"#category\").val();\n");
      out.write("       \t/*\n");
      out.write("        alert(\"[1] b = \" + b + \", c = \" + c \n");
      out.write("        \t\t+ \", bb = \" + bb + \" and cc = \" + cc \n");
      out.write("        \t\t+ \" & receiveSignal = \" + receiveSignal);\n");
      out.write("       \t*/\n");
      out.write("        if (receiveSignal == -100) {\n");
      out.write("            // window.location.href = \"getProductList.do?brand=\" + b + \"&category=\" + c;\n");
      out.write("            $(\"#brand\").change(\"brand option:selected\").val(b);\n");
      out.write("            $(\"#category\").change(\"category option:selected\").val(c);\n");
      out.write("        }\n");
      out.write("        // if (bb != null && bb > 0) $(\"#getProductList\").click();\n");
      out.write("        if (b != null && b > 0) $(\"#getProductList\").click();\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*         [END - editProduct.jsp]          */\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("\n");
      out.write("\n");
      out.write("        //////////////////////////////////////////////////\n");
      out.write("        /*                                              */\n");
      out.write("        /*      THIS COMES FROM addProductSuccess.jsp   */\n");
      out.write("        /*         [BEGIN - addProductSuccess.jsp]      */\n");
      out.write("        /*                                              */\n");
      out.write("        //////////////////////////////////////////////////\n");
      out.write("        var receiveASuccessSignal = ");
      out.print( request.getParameter("signalASuccessHid") );
      out.write(";\n");
      out.write("        var bASuccess = ");
      out.print( request.getParameter("brandIDASuccessHid") );
      out.write(";\n");
      out.write("        var cASuccess = ");
      out.print( request.getParameter("categoryIDASuccessHid") );
      out.write(";\n");
      out.write("        /*\n");
      out.write("        alert(\"[2] bASuccess = \" + bASuccess + \", cASuccess = \" + cASuccess \n");
      out.write("        \t\t+ \", bb = \" + bb + \" and cc = \" + cc \n");
      out.write("        \t\t+ \" & receiveASuccessSignal = \" + receiveASuccessSignal);\n");
      out.write("        */\n");
      out.write("        if (receiveASuccessSignal == -200) {\n");
      out.write("            $(\"#brand\").change(\"brand option:selected\").val(bASuccess);\n");
      out.write("            $(\"#category\").change(\"category option:selected\").val(cASuccess);\n");
      out.write("        }\n");
      out.write("        if (bASuccess != null && bASuccess > 0) $(\"#getProductList\").click();\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*       [END - addProductSuccess.jsp]      */\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write(" \n");
      out.write("        //////////////////////////////////////////////////\n");
      out.write("        /*                                              */\n");
      out.write("        /*      THIS COMES FROM editProductSuccess.jsp  */\n");
      out.write("        /*         [BEGIN - editProductSuccess.jsp]     */\n");
      out.write("        /*                                              */\n");
      out.write("        //////////////////////////////////////////////////\n");
      out.write("        var receiveESuccessSignal = ");
      out.print( request.getParameter("signalESuccessHid") );
      out.write(";\n");
      out.write("        var bESuccess = ");
      out.print( request.getParameter("brandIDESuccessHid") );
      out.write(";\n");
      out.write("        var cESuccess = ");
      out.print( request.getParameter("categoryIDESuccessHid") );
      out.write(";\n");
      out.write("        /*\n");
      out.write("        alert(\"[3] bESuccess = \" + bESuccess + \", cESuccess = \" + cESuccess \n");
      out.write("        \t\t+ \", bb = \" + bb + \" and cc = \" + cc \n");
      out.write("        \t\t+ \" & receiveESuccessSignal = \" + receiveESuccessSignal);\n");
      out.write("        */\n");
      out.write("        if (receiveESuccessSignal == -300) {\n");
      out.write("            $(\"#brand\").change(\"brand option:selected\").val(bESuccess);\n");
      out.write("            $(\"#category\").change(\"category option:selected\").val(cESuccess);\n");
      out.write("        }\n");
      out.write("        if (bESuccess != null && bESuccess > 0) $(\"#getProductList\").click();\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*       [END - editProductSuccess.jsp]     */\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////        \n");
      out.write("        \n");
      out.write("        //////////////////////////////////////////////////\n");
      out.write("        /*                                              */\n");
      out.write("        /*      THIS COMES FROM amend/amendProduct.jsp  */\n");
      out.write("        /*         [BEGIN - amendProduct.jsp]     \t\t*/\n");
      out.write("        /*                                              */\n");
      out.write("        //////////////////////////////////////////////////        \n");
      out.write("        var receiveAUSignal = ");
      out.print( request.getParameter("signalAUHid") );
      out.write(";\n");
      out.write("        var bAU = ");
      out.print( request.getParameter("brandIDAUHid") );
      out.write(";\n");
      out.write("        var cAU = ");
      out.print( request.getParameter("categoryIDAUHid") );
      out.write(";\n");
      out.write("        if (receiveAUSignal == -1000) {\n");
      out.write("            $(\"#brand\").change(\"brand option:selected\").val(bAU);\n");
      out.write("            $(\"#category\").change(\"category option:selected\").val(cAU);\n");
      out.write("        }\n");
      out.write("        if (bAU != null && bAU > 0) $(\"#getProductList\").click();\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*       [END - amendProduct.jsp]     \t\t*/\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////        \n");
      out.write("        \n");
      out.write("        //////////////////////////////////////////////////////////////\n");
      out.write("        /*                                              \t\t\t*/\n");
      out.write("        /*      THIS COMES FROM amend/amendingProductSuccess.jsp  \t*/\n");
      out.write("        /*         \t  [BEGIN - amendingProductSuccess.jsp]     \t\t*/\n");
      out.write("        /*                                              \t\t\t*/\n");
      out.write("        //////////////////////////////////////////////////////////////\n");
      out.write("        var receiveAUSuccessSignal = ");
      out.print( request.getParameter("signalAUSucessHid") );
      out.write(";\n");
      out.write("        var bAUSuccess = ");
      out.print( request.getParameter("brandIDAUSucessHid") );
      out.write(";\n");
      out.write("        var cAUSuccess = ");
      out.print( request.getParameter("categoryIDAUSucessHid") );
      out.write(";\n");
      out.write("        if (receiveAUSuccessSignal == -1100) {\n");
      out.write("            $(\"#brand\").change(\"brand option:selected\").val(bAUSuccess);\n");
      out.write("            $(\"#category\").change(\"category option:selected\").val(cAUSuccess);\n");
      out.write("        }\n");
      out.write("        if (bAUSuccess != null && bAUSuccess > 0) $(\"#getProductList\").click();\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("        /*                                          */\n");
      out.write("        /*    [END - amendingProductSuccess.jsp]\t*/\n");
      out.write("        /*                                          */\n");
      out.write("        //////////////////////////////////////////////\n");
      out.write("  \t\t        \n");
      out.write("    });\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/product/listProduct.jsp(11,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("hasActionErrors()");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write(" <div id=\"globalAdvice\" class=\"gray_bg global-vanadium-advice\">\n");
        out.write("  \t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</div>  \n");
        out.write("  ");
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
    // /WEB-INF/jsp/product/listProduct.jsp(12,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("</span>\n");
        out.write("  \t\t\t\t<br/>\n");
        out.write("  \t\t");
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
    // /WEB-INF/jsp/product/listProduct.jsp(13,12) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("brand");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("brand");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssStyle("width:156px;");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setRequired("true");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("-1");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("--Please Select--");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("id");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("%{name}");
    // /WEB-INF/jsp/product/listProduct.jsp(18,8) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("brandList");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent(null);
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setId("category");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("category");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setCssStyle("width:156px;");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = required type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setRequired("true");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("-1");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("--Please Select--");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("id");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("%{getText(name)}");
    // /WEB-INF/jsp/product/listProduct.jsp(31,8) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("categoryList");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005frequired_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssStyle_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f0.setParent(null);
    // /WEB-INF/jsp/product/listProduct.jsp(43,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setId("discontinued");
    // /WEB-INF/jsp/product/listProduct.jsp(43,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setName("discontinued");
    // /WEB-INF/jsp/product/listProduct.jsp(43,6) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setTitle("Show Discontinued Items");
    // /WEB-INF/jsp/product/listProduct.jsp(43,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setValue("false");
    int _jspx_eval_s_005fcheckbox_005f0 = _jspx_th_s_005fcheckbox_005f0.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f1 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f1.setParent(null);
    // /WEB-INF/jsp/product/listProduct.jsp(49,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setId("disabled");
    // /WEB-INF/jsp/product/listProduct.jsp(49,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setName("disabled");
    // /WEB-INF/jsp/product/listProduct.jsp(49,6) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setTitle("Show Disabled Items");
    // /WEB-INF/jsp/product/listProduct.jsp(49,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f1.setValue("false");
    int _jspx_eval_s_005fcheckbox_005f1 = _jspx_th_s_005fcheckbox_005f1.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005ftitle_005fname_005fid_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f1);
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
    // /WEB-INF/jsp/product/listProduct.jsp(91,21) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("userTypeId");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }
}
