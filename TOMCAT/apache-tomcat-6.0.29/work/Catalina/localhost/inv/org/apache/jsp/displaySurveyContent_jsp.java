package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class displaySurveyContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.release();
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
      out.write("<table cellspacing=\"0\" cellpadding=\"0\"  border=\"0\">\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    // /displaySurveyContent.jsp(6,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("/displaySurvey.do");
    // /displaySurveyContent.jsp(6,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setMethod("get");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td colspan=\"2\">\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005ferrors_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td colspan=\"2\" style=\"border:2px solid #112233\">Generate List Of Customers</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\" >\r\n");
        out.write("\t\t\t\t\t  ");
        if (_jspx_meth_html_005fmultibox_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t<table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("\t\t\t <tr>\r\n");
        out.write("\t\t\t \t<td colspan=\"6\"class=\"border_style\">\r\n");
        out.write("\t\t\t \t\t<b>By Consoles Owned</b>\r\n");
        out.write("\t\t\t \t</td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t \t\t\r\n");
        out.write("              <tr> \r\n");
        out.write("                <td width=\"50\">PS2</td>\r\n");
        out.write("                <td width=\"30\" align=\"left\"> ");
        if (_jspx_meth_html_005fmultibox_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                </td>\r\n");
        out.write("                <td width=\"70\">PS3</td>\r\n");
        out.write("                <td width=\"30\" align=\"left\"> ");
        if (_jspx_meth_html_005fmultibox_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                </td>\r\n");
        out.write("                <td>GameCube</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("              </tr>\r\n");
        out.write("              <tr> \r\n");
        out.write("                <td width=\"50\">Wii</td>\r\n");
        out.write("                <td align=\"left\" width=\"30\"> ");
        if (_jspx_meth_html_005fmultibox_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td>XBOX</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td width=\"50\">Xbox 360</td>\r\n");
        out.write("                <td align=\"left\" width=\"30\"> ");
        if (_jspx_meth_html_005fmultibox_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("              </tr>\r\n");
        out.write("              <tr>\r\n");
        out.write("                <td>Sony PSP </td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td>Nintendo DS</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f8(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td>Game Boy Advance</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f9(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("              </tr>\r\n");
        out.write("            </table>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t ");
        if (_jspx_meth_html_005fmultibox_005f10(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t<table>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\">\r\n");
        out.write("\t\t\t\t\t\t<b>with Language</b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t  ");
        if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\t\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005fmultibox_005f11(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t<table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("\t\t\t <tr>\r\n");
        out.write("\t\t\t \t<td colspan=\"6\" class=\"border_style\">\r\n");
        out.write("\t\t\t \t\t<b>Heard of us from</b>\r\n");
        out.write("\t\t\t \t</td>\r\n");
        out.write("\t\t\t </tr>\t\t\r\n");
        out.write("              <tr> \r\n");
        out.write("                <td width=\"50\">Friend</td>\r\n");
        out.write("                <td width=\"30\" align=\"left\"> ");
        if (_jspx_meth_html_005fmultibox_005f12(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                </td>\r\n");
        out.write("                <td width=\"70\">Search Engine</td>\r\n");
        out.write("                <td width=\"30\" align=\"left\"> ");
        if (_jspx_meth_html_005fmultibox_005f13(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                </td>\r\n");
        out.write("                <td>Online Advertisement</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f14(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("              </tr>\r\n");
        out.write("              <tr> \r\n");
        out.write("                <td width=\"50\">Flyer</td>\r\n");
        out.write("                <td align=\"left\" width=\"30\"> ");
        if (_jspx_meth_html_005fmultibox_005f15(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td>Magazine</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f16(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                <td width=\"50\">Radio Show</td>\r\n");
        out.write("                <td align=\"left\" width=\"30\"> ");
        if (_jspx_meth_html_005fmultibox_005f17(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("              </tr>\r\n");
        out.write("              <tr>\r\n");
        out.write("                <td>TV Show</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f18(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("                <td>Other</td>\r\n");
        out.write("                <td align=\"left\">");
        if (_jspx_meth_html_005fmultibox_005f19(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("                <td>&nbsp;</td>\r\n");
        out.write("                <td align=\"left\">&nbsp;</td>\r\n");
        out.write("              </tr>\r\n");
        out.write("            </table>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t ");
        if (_jspx_meth_html_005fmultibox_005f20(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t<table>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\">\r\n");
        out.write("\t\t\t\t\t\t<b>Having reserve games service</b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\t\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t ");
        if (_jspx_meth_html_005fmultibox_005f21(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t<td style=\"border:2px solid #bbccbb\">\r\n");
        out.write("\t\t\t<table>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\">\r\n");
        out.write("\t\t\t\t\t\t<b>Having fast return service</b>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\t\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t\r\n");
        out.write("\t\r\n");
        out.write("\t\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t\t<input type=\"submit\" name=\"submit\" value=\"Search\" >\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t\t\r\n");
        out.write("\t</tr>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
    if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f0 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(17,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f0.setProperty("selectedCriteria");
    int _jspx_eval_html_005fmultibox_005f0 = _jspx_th_html_005fmultibox_005f0.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f0.doInitBody();
      }
      do {
        out.write("consoles");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f1 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(29,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f1.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f1 = _jspx_th_html_005fmultibox_005f1.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f1.doInitBody();
      }
      do {
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f2 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(32,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f2.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f2 = _jspx_th_html_005fmultibox_005f2.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f2.doInitBody();
      }
      do {
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f3 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(35,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f3.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f3 = _jspx_th_html_005fmultibox_005f3.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f3.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f4 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(39,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f4.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f4 = _jspx_th_html_005fmultibox_005f4.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f4.doInitBody();
      }
      do {
        out.write('1');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f5 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(41,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f5.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f5 = _jspx_th_html_005fmultibox_005f5.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f5.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f6 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(43,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f6.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f6 = _jspx_th_html_005fmultibox_005f6.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f6.doInitBody();
      }
      do {
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f7 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(47,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f7.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f7 = _jspx_th_html_005fmultibox_005f7.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f7.doInitBody();
      }
      do {
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f8 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(49,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f8.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f8 = _jspx_th_html_005fmultibox_005f8.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f8.doInitBody();
      }
      do {
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f9 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(51,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f9.setProperty("consolesOwned");
    int _jspx_eval_html_005fmultibox_005f9 = _jspx_th_html_005fmultibox_005f9.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f9.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f10 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(59,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f10.setProperty("selectedCriteria");
    int _jspx_eval_html_005fmultibox_005f10 = _jspx_th_html_005fmultibox_005f10.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f10.doInitBody();
      }
      do {
        out.write("language");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(70,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setProperty("language");
    // /displaySurveyContent.jsp(70,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setStyle("width:154px;height:20px");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t              ");
        if (_jspx_meth_html_005foption_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t              ");
        if (_jspx_meth_html_005foption_005f1(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t            ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /displaySurveyContent.jsp(71,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f0.setValue("en");
    int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f0.doInitBody();
      }
      do {
        out.write("English");
        int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /displaySurveyContent.jsp(72,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f1.setValue("fr");
    int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f1.doInitBody();
      }
      do {
        out.write("French");
        int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f11 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(81,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f11.setProperty("selectedCriteria");
    int _jspx_eval_html_005fmultibox_005f11 = _jspx_th_html_005fmultibox_005f11.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f11.doInitBody();
      }
      do {
        out.write("heardAboutUs");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f12 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(92,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f12.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f12 = _jspx_th_html_005fmultibox_005f12.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f12.doInitBody();
      }
      do {
        out.write("friend");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f13 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(95,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f13.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f13 = _jspx_th_html_005fmultibox_005f13.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f13.doInitBody();
      }
      do {
        out.write("search_engine");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f14 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(98,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f14.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f14 = _jspx_th_html_005fmultibox_005f14.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f14.doInitBody();
      }
      do {
        out.write("online_ad");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f14);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f15 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(102,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f15.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f15 = _jspx_th_html_005fmultibox_005f15.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f15.doInitBody();
      }
      do {
        out.write("flyer");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f16 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(104,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f16.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f16 = _jspx_th_html_005fmultibox_005f16.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f16.doInitBody();
      }
      do {
        out.write("magazine_ad");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f17 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(106,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f17.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f17 = _jspx_th_html_005fmultibox_005f17.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f17.doInitBody();
      }
      do {
        out.write("radio_show");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f17);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f18 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(110,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f18.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f18 = _jspx_th_html_005fmultibox_005f18.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f18.doInitBody();
      }
      do {
        out.write("tv_show");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f18);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f19 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(112,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f19.setProperty("heardAboutUs");
    int _jspx_eval_html_005fmultibox_005f19 = _jspx_th_html_005fmultibox_005f19.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f19.doInitBody();
      }
      do {
        out.write("other");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f19);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f20 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f20.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(124,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f20.setProperty("selectedCriteria");
    int _jspx_eval_html_005fmultibox_005f20 = _jspx_th_html_005fmultibox_005f20.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f20.doInitBody();
      }
      do {
        out.write("reservegames");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f21 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f21.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /displaySurveyContent.jsp(139,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fmultibox_005f21.setProperty("selectedCriteria");
    int _jspx_eval_html_005fmultibox_005f21 = _jspx_th_html_005fmultibox_005f21.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f21.doInitBody();
      }
      do {
        out.write("fastreturn");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty.reuse(_jspx_th_html_005fmultibox_005f21);
    return false;
  }
}
