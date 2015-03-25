package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.release();
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
      out.write("<a name=\"top\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/govojo.css\" type=\"text/css\">\r\n");
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2>View Game Properties</h2>\r\n");
      out.write("<a href=\"#ps2\">PlayStation 2</a> | <a href=\"#ps3\">PlayStation 3</a> | <a href=\"#wii\">Nintendo Wii</a> | <a href=\"#xbox\">XBox</a> | <a href=\"#gc\">GameCube</a> | <a href=\"#psp\">Sony PSP</a> | <a href=\"#ds\">Nintendo DS</a> | <a href=\"#ds3\">Nintendo 3DS</a> | <a href=\"#xbox360\">Xbox 360</a> | <a href=\"#psvita\">PS VITA</a>  | <a href=\"#wiiU\">Wii U</a>\r\n");
      out.write("<br><br><span class=\"text\">(Use <strong>control-F</strong> to find a title you are looking for)</span>\r</div>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"gc\">GameCube</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 int x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /viewContent.jsp(12,384) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("gcitem");
      // /viewContent.jsp(12,384) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setName("gc");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object gcitem = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        gcitem = (java.lang.Object) _jspx_page_context.findAttribute("gcitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /viewContent.jsp(12,427) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setId("gameDescID");
          // /viewContent.jsp(12,427) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setName("gcitem");
          // /viewContent.jsp(12,427) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setProperty("ID");
          // /viewContent.jsp(12,427) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /viewContent.jsp(12,799) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
          if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f0.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f0);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /viewContent.jsp(12,934) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f1.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
          if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f1.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f1);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /viewContent.jsp(12,1068) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
          if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f2.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f2);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          gcitem = (java.lang.Object) _jspx_page_context.findAttribute("gcitem");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#0066CC\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"ps2\">PlayStation 2</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f1.setParent(null);
      // /viewContent.jsp(12,1500) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setId("ps2item");
      // /viewContent.jsp(12,1500) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setName("ps2");
      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object ps2item = null;
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f1.doInitBody();
        }
        ps2item = (java.lang.Object) _jspx_page_context.findAttribute("ps2item");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /viewContent.jsp(12,1545) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setId("gameDescID");
          // /viewContent.jsp(12,1545) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setName("ps2item");
          // /viewContent.jsp(12,1545) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setProperty("ID");
          // /viewContent.jsp(12,1545) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
          out.write("  \r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f3 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /viewContent.jsp(12,1922) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f3.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f3 = _jspx_th_html_005flink_005f3.doStartTag();
          if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f3.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f3);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f4 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /viewContent.jsp(12,2057) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f4 = _jspx_th_html_005flink_005f4.doStartTag();
          if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f4.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f4);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f5 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /viewContent.jsp(12,2191) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f5.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f5 = _jspx_th_html_005flink_005f5.doStartTag();
          if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f5.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f5);
          out.write("</div></td>\r     </tr>\r   ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
          ps2item = (java.lang.Object) _jspx_page_context.findAttribute("ps2item");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"xbox\">XBox</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f2.setParent(null);
      // /viewContent.jsp(12,2616) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setId("xboxitem");
      // /viewContent.jsp(12,2616) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setName("xbox");
      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object xboxitem = null;
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f2.doInitBody();
        }
        xboxitem = (java.lang.Object) _jspx_page_context.findAttribute("xboxitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /viewContent.jsp(12,2663) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setId("gameDescID");
          // /viewContent.jsp(12,2663) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setName("xboxitem");
          // /viewContent.jsp(12,2663) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setProperty("ID");
          // /viewContent.jsp(12,2663) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f6 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /viewContent.jsp(12,3041) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f6 = _jspx_th_html_005flink_005f6.doStartTag();
          if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f6.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f6);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f7 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /viewContent.jsp(12,3176) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f7.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f7 = _jspx_th_html_005flink_005f7.doStartTag();
          if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f7.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f7);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f8 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /viewContent.jsp(12,3310) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f8 = _jspx_th_html_005flink_005f8.doStartTag();
          if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f8.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f8);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
          xboxitem = (java.lang.Object) _jspx_page_context.findAttribute("xboxitem");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"psp\">Sony PSP</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f3.setParent(null);
      // /viewContent.jsp(12,3737) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setId("pspitem");
      // /viewContent.jsp(12,3737) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setName("psp");
      int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object pspitem = null;
        if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f3.doInitBody();
        }
        pspitem = (java.lang.Object) _jspx_page_context.findAttribute("pspitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /viewContent.jsp(12,3782) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setId("gameDescID");
          // /viewContent.jsp(12,3782) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setName("pspitem");
          // /viewContent.jsp(12,3782) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setProperty("ID");
          // /viewContent.jsp(12,3782) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f9 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /viewContent.jsp(12,4157) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f9.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f9 = _jspx_th_html_005flink_005f9.doStartTag();
          if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f9.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f9);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f10 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /viewContent.jsp(12,4292) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f10.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f10 = _jspx_th_html_005flink_005f10.doStartTag();
          if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f10.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f10);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f11 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /viewContent.jsp(12,4426) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f11.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f11 = _jspx_th_html_005flink_005f11.doStartTag();
          if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f11.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f11);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
          pspitem = (java.lang.Object) _jspx_page_context.findAttribute("pspitem");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#009900\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"ds\">Nintendo DS</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f4.setParent(null);
      // /viewContent.jsp(12,4855) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setId("dsitem");
      // /viewContent.jsp(12,4855) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setName("ds");
      int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object dsitem = null;
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f4.doInitBody();
        }
        dsitem = (java.lang.Object) _jspx_page_context.findAttribute("dsitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /viewContent.jsp(12,4898) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setId("gameDescID");
          // /viewContent.jsp(12,4898) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setName("dsitem");
          // /viewContent.jsp(12,4898) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setProperty("ID");
          // /viewContent.jsp(12,4898) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f12 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /viewContent.jsp(12,5270) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f12.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f12 = _jspx_th_html_005flink_005f12.doStartTag();
          if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f12.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f12);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f13 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /viewContent.jsp(12,5405) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f13.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f13 = _jspx_th_html_005flink_005f13.doStartTag();
          if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f13.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f13);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f14 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f14.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /viewContent.jsp(12,5539) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f14.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f14 = _jspx_th_html_005flink_005f14.doStartTag();
          if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f14.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f14.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f14);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
          dsitem = (java.lang.Object) _jspx_page_context.findAttribute("dsitem");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#E6E6FA\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"xbox360\">Xbox 360</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
 x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f5 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f5.setParent(null);
      // /viewContent.jsp(12,5970) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setId("x360item");
      // /viewContent.jsp(12,5970) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setName("xbox360");
      int _jspx_eval_logic_005fiterate_005f5 = _jspx_th_logic_005fiterate_005f5.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object x360item = null;
        if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f5.doInitBody();
        }
        x360item = (java.lang.Object) _jspx_page_context.findAttribute("x360item");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /viewContent.jsp(12,6020) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setId("gameDescID");
          // /viewContent.jsp(12,6020) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setName("x360item");
          // /viewContent.jsp(12,6020) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setProperty("ID");
          // /viewContent.jsp(12,6020) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f5.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f15 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f15.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /viewContent.jsp(12,6398) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f15.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f15 = _jspx_th_html_005flink_005f15.doStartTag();
          if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f15.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f15.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f15);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f16 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f16.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /viewContent.jsp(12,6533) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f16.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f16 = _jspx_th_html_005flink_005f16.doStartTag();
          if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f16.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f16.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f16);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f17 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f17.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /viewContent.jsp(12,6667) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f17.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f17 = _jspx_th_html_005flink_005f17.doStartTag();
          if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f17.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f17.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f17);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f17);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f5.doAfterBody();
          x360item = (java.lang.Object) _jspx_page_context.findAttribute("x360item");
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
      out.write("\r  </table>\r  <br>\r  <br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"ps3\">PlayStation 3</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
  x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f6 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f6.setParent(null);
      // /viewContent.jsp(13,267) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setId("ps3item");
      // /viewContent.jsp(13,267) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setName("ps3");
      int _jspx_eval_logic_005fiterate_005f6 = _jspx_th_logic_005fiterate_005f6.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object ps3item = null;
        if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f6.doInitBody();
        }
        ps3item = (java.lang.Object) _jspx_page_context.findAttribute("ps3item");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /viewContent.jsp(13,312) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setId("gameDescID");
          // /viewContent.jsp(13,312) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setName("ps3item");
          // /viewContent.jsp(13,312) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setProperty("ID");
          // /viewContent.jsp(13,312) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f6.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f18 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f18.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /viewContent.jsp(13,687) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f18.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f18 = _jspx_th_html_005flink_005f18.doStartTag();
          if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f18.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f18.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f18);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f18);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f19 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f19.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /viewContent.jsp(13,822) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f19.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f19 = _jspx_th_html_005flink_005f19.doStartTag();
          if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f19.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f19.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f19);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f20 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f20.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /viewContent.jsp(13,956) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f20.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f20 = _jspx_th_html_005flink_005f20.doStartTag();
          if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f20.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f20.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f20);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f20);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f6.doAfterBody();
          ps3item = (java.lang.Object) _jspx_page_context.findAttribute("ps3item");
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
      out.write("\r</table>\r<br>\r<br>\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#666699\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"wii\">Nintendo Wii</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
  x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f7 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f7.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f7.setParent(null);
      // /viewContent.jsp(13,1388) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setId("wiiitem");
      // /viewContent.jsp(13,1388) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setName("wii");
      int _jspx_eval_logic_005fiterate_005f7 = _jspx_th_logic_005fiterate_005f7.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object wiiitem = null;
        if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f7.doInitBody();
        }
        wiiitem = (java.lang.Object) _jspx_page_context.findAttribute("wiiitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /viewContent.jsp(13,1433) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setId("gameDescID");
          // /viewContent.jsp(13,1433) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setName("wiiitem");
          // /viewContent.jsp(13,1433) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setProperty("ID");
          // /viewContent.jsp(13,1433) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f7.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fiterate_005f7, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fiterate_005f7, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f21 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f21.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /viewContent.jsp(13,1808) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f21.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f21 = _jspx_th_html_005flink_005f21.doStartTag();
          if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f21.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f21.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f21);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f21);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f22 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f22.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /viewContent.jsp(13,1943) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f22.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f22 = _jspx_th_html_005flink_005f22.doStartTag();
          if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f22.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f22.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f22);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f22);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f23 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f23.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
          // /viewContent.jsp(13,2077) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f23.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f23 = _jspx_th_html_005flink_005f23.doStartTag();
          if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f23.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f23.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f23);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f23);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f7.doAfterBody();
          wiiitem = (java.lang.Object) _jspx_page_context.findAttribute("wiiitem");
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
      out.write("\r</table>\r<br>\r<br>\r  <!-- =====================================================KTPL=(NINTENDO 3DS) Date:2011-02-14=========================================== -->\r\r<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"ds3\">Nintendo 3DS</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
  x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f8 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f8.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f8.setParent(null);
      // /viewContent.jsp(13,2653) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f8.setId("ds3item");
      // /viewContent.jsp(13,2653) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f8.setName("ds3");
      int _jspx_eval_logic_005fiterate_005f8 = _jspx_th_logic_005fiterate_005f8.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object ds3item = null;
        if (_jspx_eval_logic_005fiterate_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f8.doInitBody();
        }
        ds3item = (java.lang.Object) _jspx_page_context.findAttribute("ds3item");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /viewContent.jsp(13,2698) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setId("gameDescID");
          // /viewContent.jsp(13,2698) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setName("ds3item");
          // /viewContent.jsp(13,2698) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setProperty("ID");
          // /viewContent.jsp(13,2698) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f8.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fiterate_005f8, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fiterate_005f8, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f24 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f24.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /viewContent.jsp(13,3073) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f24.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f24 = _jspx_th_html_005flink_005f24.doStartTag();
          if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f24.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f24.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f24);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f24);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f25 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f25.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /viewContent.jsp(13,3208) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f25.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f25 = _jspx_th_html_005flink_005f25.doStartTag();
          if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f25.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f25.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f25);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f25);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f26 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f26.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
          // /viewContent.jsp(13,3342) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f26.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f26 = _jspx_th_html_005flink_005f26.doStartTag();
          if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f26.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f26.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f26);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f26);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f8.doAfterBody();
          ds3item = (java.lang.Object) _jspx_page_context.findAttribute("ds3item");
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
      out.write("\r</table>\r<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r\n");
      out.write("  <tr class=\"tdleft\">\r\n");
      out.write("     <td class=\"subheading\"><a name=\"psvita\">PS Vita</a></td>\r\n");
      out.write("     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
  x = 1; 
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f9 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f9.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f9.setParent(null);
      // /viewContent.jsp(21,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f9.setId("psvitaitem");
      // /viewContent.jsp(21,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f9.setName("psvita");
      int _jspx_eval_logic_005fiterate_005f9 = _jspx_th_logic_005fiterate_005f9.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object psvitaitem = null;
        if (_jspx_eval_logic_005fiterate_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f9.doInitBody();
        }
        psvitaitem = (java.lang.Object) _jspx_page_context.findAttribute("psvitaitem");
        do {
          out.write("\r\n");
          out.write("     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /viewContent.jsp(22,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setId("gameDescID");
          // /viewContent.jsp(22,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setName("psvitaitem");
          // /viewContent.jsp(22,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setProperty("ID");
          // /viewContent.jsp(22,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f9.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
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
          out.write("        <td>");
          if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fiterate_005f9, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("        <td>");
          if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fiterate_005f9, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f27 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f27.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /viewContent.jsp(30,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f27.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f27 = _jspx_th_html_005flink_005f27.doStartTag();
          if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f27.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f27.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f27);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f27);
          out.write("</div></td>\r\n");
          out.write("        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f28 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f28.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /viewContent.jsp(31,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f28.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f28 = _jspx_th_html_005flink_005f28.doStartTag();
          if (_jspx_eval_html_005flink_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f28.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f28.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f28);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f28);
          out.write("</div></td>\r\n");
          out.write("        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f29 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f29.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
          // /viewContent.jsp(32,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f29.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f29 = _jspx_th_html_005flink_005f29.doStartTag();
          if (_jspx_eval_html_005flink_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f29.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f29.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f29);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f29);
          out.write("</div></td>\r\n");
          out.write("     </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f9.doAfterBody();
          psvitaitem = (java.lang.Object) _jspx_page_context.findAttribute("psvitaitem");
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
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table class=\"softtable\" width=\"800\" border=\"5\" bordercolor=\"#FFFF00\">\r  <tr class=\"tdleft\">\r     <td class=\"subheading\"><a name=\"wiiU\">Wii U</a></td>\r     <td class=\"subheading\" colspan=\"3\" align=\"center\"><a href=\"#top\">top</a></td>\r  </tr>\r  ");
  x = 1; 
      out.write('\r');
      out.write(' ');
      out.write(' ');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f10 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f10.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f10.setParent(null);
      // /viewContent.jsp(38,260) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f10.setId("wiiUitem");
      // /viewContent.jsp(38,260) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f10.setName("wiiU");
      int _jspx_eval_logic_005fiterate_005f10 = _jspx_th_logic_005fiterate_005f10.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object wiiUitem = null;
        if (_jspx_eval_logic_005fiterate_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f10.doInitBody();
        }
        wiiUitem = (java.lang.Object) _jspx_page_context.findAttribute("wiiUitem");
        do {
          out.write("\r     ");
          //  bean:define
          java.lang.Integer gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
          // /viewContent.jsp(38,307) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setId("gameDescID");
          // /viewContent.jsp(38,307) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setName("wiiUitem");
          // /viewContent.jsp(38,307) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setProperty("ID");
          // /viewContent.jsp(38,307) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f10.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
            return;
          }
          gameDescID = (java.lang.Integer) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
          out.write("\r     ");
 if(x++ % 2 == 0){ 
          out.write("\r        <tr class=\"tdrightdark\">\r     ");
 } else { 
          out.write("\r        <tr class=\"tdleftdark\">\r     ");
 } 
          out.write("\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fiterate_005f10, _jspx_page_context))
            return;
          out.write("</td>\r        <td>");
          if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fiterate_005f10, _jspx_page_context))
            return;
          out.write("</td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f30 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f30.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
          // /viewContent.jsp(38,685) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f30.setPage("/viewInventory.do?viewID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f30 = _jspx_th_html_005flink_005f30.doStartTag();
          if (_jspx_eval_html_005flink_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f30.doInitBody();
            }
            do {
              out.write("View");
              int evalDoAfterBody = _jspx_th_html_005flink_005f30.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f30);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f30);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f31 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f31.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
          // /viewContent.jsp(38,820) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f31.setPage("/editGameDesc.do?editID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f31 = _jspx_th_html_005flink_005f31.doStartTag();
          if (_jspx_eval_html_005flink_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f31.doInitBody();
            }
            do {
              out.write("Edit");
              int evalDoAfterBody = _jspx_th_html_005flink_005f31.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f31);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f31);
          out.write("</div></td>\r        <td><div align=\"center\">");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f32 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f32.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
          // /viewContent.jsp(38,954) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f32.setPage("/addGameDescManual.do?gameDescID=" + gameDescID.toString());
          int _jspx_eval_html_005flink_005f32 = _jspx_th_html_005flink_005f32.doStartTag();
          if (_jspx_eval_html_005flink_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f32.doInitBody();
            }
            do {
              out.write("Add Manual");
              int evalDoAfterBody = _jspx_th_html_005flink_005f32.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f32);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fpage.reuse(_jspx_th_html_005flink_005f32);
          out.write("</div></td>\r     </tr>\r  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f10.doAfterBody();
          wiiUitem = (java.lang.Object) _jspx_page_context.findAttribute("wiiUitem");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f10);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f10);
      out.write("\r</table>");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /viewContent.jsp(12,650) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("gcitem");
    // /viewContent.jsp(12,650) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /viewContent.jsp(12,711) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setName("gcitem");
    // /viewContent.jsp(12,711) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /viewContent.jsp(12,1771) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setName("ps2item");
    // /viewContent.jsp(12,1771) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /viewContent.jsp(12,1833) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setName("ps2item");
    // /viewContent.jsp(12,1833) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /viewContent.jsp(12,2888) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setName("xboxitem");
    // /viewContent.jsp(12,2888) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /viewContent.jsp(12,2951) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setName("xboxitem");
    // /viewContent.jsp(12,2951) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /viewContent.jsp(12,4006) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("pspitem");
    // /viewContent.jsp(12,4006) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /viewContent.jsp(12,4068) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("pspitem");
    // /viewContent.jsp(12,4068) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /viewContent.jsp(12,5121) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("dsitem");
    // /viewContent.jsp(12,5121) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /viewContent.jsp(12,5182) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("dsitem");
    // /viewContent.jsp(12,5182) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /viewContent.jsp(12,6245) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("x360item");
    // /viewContent.jsp(12,6245) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /viewContent.jsp(12,6308) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setName("x360item");
    // /viewContent.jsp(12,6308) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /viewContent.jsp(13,536) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setName("ps3item");
    // /viewContent.jsp(13,536) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /viewContent.jsp(13,598) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setName("ps3item");
    // /viewContent.jsp(13,598) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
    // /viewContent.jsp(13,1657) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setName("wiiitem");
    // /viewContent.jsp(13,1657) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
    // /viewContent.jsp(13,1719) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setName("wiiitem");
    // /viewContent.jsp(13,1719) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
    // /viewContent.jsp(13,2922) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setName("ds3item");
    // /viewContent.jsp(13,2922) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f8);
    // /viewContent.jsp(13,2984) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setName("ds3item");
    // /viewContent.jsp(13,2984) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
    // /viewContent.jsp(28,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setName("psvitaitem");
    // /viewContent.jsp(28,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f9);
    // /viewContent.jsp(29,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setName("psvitaitem");
    // /viewContent.jsp(29,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
    // /viewContent.jsp(38,532) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setName("wiiUitem");
    // /viewContent.jsp(38,532) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f10);
    // /viewContent.jsp(38,595) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setName("wiiUitem");
    // /viewContent.jsp(38,595) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setProperty("releaseDate");
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }
}
