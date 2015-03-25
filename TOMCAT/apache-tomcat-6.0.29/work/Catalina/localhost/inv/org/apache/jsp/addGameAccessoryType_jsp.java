package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addGameAccessoryType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.release();
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
      if (_jspx_meth_template_005finsert_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_template_005finsert_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:insert
    org.apache.struts.taglib.template.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.taglib.template.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate.get(org.apache.struts.taglib.template.InsertTag.class);
    _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005finsert_005f0.setParent(null);
    // /addGameAccessoryType.jsp(3,0) name = template type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005finsert_005f0.setTemplate("/templates/invTemplate_new.jsp");
    int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
    if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_template_005fput_005f2(_jspx_th_template_005finsert_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_template_005fput_005f3(_jspx_th_template_005finsert_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_template_005finsert_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_template_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005finsert_0026_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /addGameAccessoryType.jsp(4,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f0.setName("title");
    // /addGameAccessoryType.jsp(4,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f0.setContent("Templates");
    // /addGameAccessoryType.jsp(4,2) name = direct type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f0.setDirect("true");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /addGameAccessoryType.jsp(5,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f1.setName("navigation");
    // /addGameAccessoryType.jsp(5,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f1.setContent("/templates/buttonbar-add.html");
    int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
    if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /addGameAccessoryType.jsp(6,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f2.setName("content");
    // /addGameAccessoryType.jsp(6,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f2.setContent("/addGameAccessoryTypeContent.jsp");
    int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
    if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f2);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f3 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    // /addGameAccessoryType.jsp(7,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f3.setName("breadcrumb");
    // /addGameAccessoryType.jsp(7,2) name = direct type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f3.setDirect("true");
    // /addGameAccessoryType.jsp(7,2) name = content type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_template_005fput_005f3.setContent("Catalog > Game AccessoryType");
    int _jspx_eval_template_005fput_005f3 = _jspx_th_template_005fput_005f3.doStartTag();
    if (_jspx_th_template_005fput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_0026_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f3);
    return false;
  }
}
