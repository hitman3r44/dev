package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.Console;
import govojo.db.GameGenre;
import govojo.db.GameESRBRating;
import govojo.db.GameDescStatus;
import govojo.db.AudioType;
import govojo.db.HDTVType;

public final class contentAddGame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
 //This should really should be: action class look-up the necessary 
   //information, store it in a bean, place the bean in the request / session,
   // and then use a taglib on the page that specifies the bean
   pageContext.setAttribute("consoles", Console.selectAllConsoles());
   pageContext.setAttribute("genres", GameGenre.selectAllGenres());
   pageContext.setAttribute("ratings", GameESRBRating.selectAllRatings());
   pageContext.setAttribute("allstatus", GameDescStatus.selectAllStatus());
   pageContext.setAttribute("audioTypes", AudioType.selectAllAudioTypes());
   pageContext.setAttribute("hdtvTypes", HDTVType.selectAllHDTVTypes());
   pageContext.setAttribute("accessoryTypes", GameGenre.selectAllGameAccessory());

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" ");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    // /contentAddGame.jsp(32,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("addGame.do");
    // /contentAddGame.jsp(32,1) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write(" \r\n");
        out.write("<table width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td><img src=\"images/blank.gif\" width=\"150\" height=\"1\"></td>\r\n");
        out.write("    <td width=\"100%\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Console</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("     ");
        if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Name</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("     ");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Genre</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("     ");
        if (_jspx_meth_html_005fselect_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Rating</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("     ");
        if (_jspx_meth_html_005fselect_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("             \r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("    <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Availability</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("       ");
        if (_jspx_meth_html_005fselect_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Publisher</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("      ");
        if (_jspx_meth_html_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Release Date </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("      ");
        if (_jspx_meth_html_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span><span class=\"verdana_11px_grey\">Format YYYYMMDD </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  \r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Retail Price </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("      ");
        if (_jspx_meth_html_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Number of Discs </td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">UPC (optional) </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("       ");
        if (_jspx_meth_html_005ftext_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Game Cover </td>\r\n");
        out.write("    <td><span class=\"verdana_11px_grey\">\r\n");
        out.write("      <input name=\"coverImage\" type=\"file\" class=\"verdana_12px_grey\" size=\"30\" >\r\n");
        out.write("      <input name=\"largeImage\" type=\"checkbox\" value=\"1\"> \r\n");
        out.write("      Large image\r\n");
        out.write("</span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Available for purchase </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("        ");
        if (_jspx_meth_html_005fselect_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">New Copy Price </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("       ");
        if (_jspx_meth_html_005ftext_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Used Copy Price </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("       ");
        if (_jspx_meth_html_005ftext_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Used Copies for sale </td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("       ");
        if (_jspx_meth_html_005ftext_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td valign=\"top\" class=\"verdana_12px_grey\">Description</td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005ftextarea_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\"><strong>Multiplayer Info </strong></td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Local Multiplayer </td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Local Co-op: </td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td><span class=\"verdana_12px_grey\">Local Network: </span></td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f8(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td><span class=\"verdana_12px_grey\">Online Multiplayer: </span></td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f9(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td><span class=\"verdana_12px_grey\">Online Co-op: </span></td>\r\n");
        out.write("    <td>");
        if (_jspx_meth_html_005fselect_005f10(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\"><strong>Additional Details</strong></td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Audio:</td>\r\n");
        out.write("    <td>\r\n");
        out.write("\t\t ");
        if (_jspx_meth_html_005fselect_005f11(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td class=\"verdana_12px_grey\">HDTV Support: </td>\r\n");
        out.write("    <td>\r\n");
        out.write("     ");
        if (_jspx_meth_html_005fselect_005f12(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td class=\"verdana_12px_grey\">Accessories</td>\r\n");
        out.write("    <td>\r\n");
        out.write("    \t ");
        if (_jspx_meth_html_005fselect_005f13(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td nowrap class=\"verdana_12px_grey\">Other features:</td>\r\n");
        out.write("    <td><span class=\"verdana_12px_red\">\r\n");
        out.write("      ");
        if (_jspx_meth_html_005ftext_005f8(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </span></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td><span class=\"verdana_12px_grey\">(enter text)</span></td>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr bgcolor=\"#EEEEEE\">\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("    <td><input name=\"Submit\" type=\"submit\" class=\"verdana_14px_grey\" style=\"width:80px;height:25px\" value=\"Submit\"></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td>&nbsp;</td>\r\n");
        out.write("    <td height=\"40\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>\r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(42,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setProperty("console");
    // /contentAddGame.jsp(42,5) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(42,5) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        \t");
        if (_jspx_meth_html_005foption_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f1(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f2(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f3(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f4(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f5(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f6(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f7(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f8(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f9(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_html_005foption_005f10(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("          \r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
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
    // /contentAddGame.jsp(43,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f0.setValue("1");
    int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f0.doInitBody();
      }
      do {
        out.write("Playstation 2");
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
    // /contentAddGame.jsp(44,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f1.setValue("2");
    int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f1.doInitBody();
      }
      do {
        out.write("XBOX");
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

  private boolean _jspx_meth_html_005foption_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(45,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f2.setValue("3");
    int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f2.doInitBody();
      }
      do {
        out.write("Gamecube");
        int evalDoAfterBody = _jspx_th_html_005foption_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(46,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f3.setValue("5");
    int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f3.doInitBody();
      }
      do {
        out.write("Sony PSP");
        int evalDoAfterBody = _jspx_th_html_005foption_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(47,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f4.setValue("6");
    int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
    if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f4.doInitBody();
      }
      do {
        out.write("Nintendo DS");
        int evalDoAfterBody = _jspx_th_html_005foption_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(48,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f5.setValue("8");
    int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
    if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f5.doInitBody();
      }
      do {
        out.write("XBOX 360");
        int evalDoAfterBody = _jspx_th_html_005foption_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(49,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f6.setValue("9");
    int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
    if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f6.doInitBody();
      }
      do {
        out.write("Playstation 3");
        int evalDoAfterBody = _jspx_th_html_005foption_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(50,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f7.setValue("10");
    int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
    if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f7.doInitBody();
      }
      do {
        out.write("Nintendo Wii");
        int evalDoAfterBody = _jspx_th_html_005foption_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f8 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(51,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f8.setValue("12");
    int _jspx_eval_html_005foption_005f8 = _jspx_th_html_005foption_005f8.doStartTag();
    if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f8.doInitBody();
      }
      do {
        out.write("Nintendo 3ds");
        int evalDoAfterBody = _jspx_th_html_005foption_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f9 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(52,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f9.setValue("13");
    int _jspx_eval_html_005foption_005f9 = _jspx_th_html_005foption_005f9.doStartTag();
    if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f9.doInitBody();
      }
      do {
        out.write("PS Vita");
        int evalDoAfterBody = _jspx_th_html_005foption_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f10 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /contentAddGame.jsp(53,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f10.setValue("14");
    int _jspx_eval_html_005foption_005f10 = _jspx_th_html_005foption_005f10.doStartTag();
    if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f10.doInitBody();
      }
      do {
        out.write("Wii U");
        int evalDoAfterBody = _jspx_th_html_005foption_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(60,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setProperty("name");
    // /contentAddGame.jsp(60,5) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(60,5) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyle("width:200px;height:18px");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(66,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f1.setProperty("genre");
    // /contentAddGame.jsp(66,5) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f1.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(66,5) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f1.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /contentAddGame.jsp(67,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f0.setCollection("genres");
    // /contentAddGame.jsp(67,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f0.setProperty("ID");
    // /contentAddGame.jsp(67,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f0.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(74,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f2.setProperty("rating");
    // /contentAddGame.jsp(74,5) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f2.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(74,5) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f2.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /contentAddGame.jsp(75,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f1.setCollection("ratings");
    // /contentAddGame.jsp(75,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f1.setProperty("ID");
    // /contentAddGame.jsp(75,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f1.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(82,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f3.setProperty("descStatus");
    // /contentAddGame.jsp(82,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f3.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(82,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f3.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
    if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
    // /contentAddGame.jsp(83,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f2.setCollection("allstatus");
    // /contentAddGame.jsp(83,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f2.setProperty("ID");
    // /contentAddGame.jsp(83,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f2.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(90,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setProperty("publisher");
    // /contentAddGame.jsp(90,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(90,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setStyle("width:200px;height:18px");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(96,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setProperty("releaseDate");
    // /contentAddGame.jsp(96,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(96,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setStyle("width:200px;height:18px");
    int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
    if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(103,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setProperty("retailPrice");
    // /contentAddGame.jsp(103,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(103,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyle("width:100px;height:18px");
    int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
    if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(108,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f4.setProperty("numDiscs");
    // /contentAddGame.jsp(108,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f4.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(108,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f4.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
    if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      <option value=\"1\" selected>1</option>\r\n");
        out.write("      <option value=\"2\">2</option>\r\n");
        out.write("      <option value=\"3\">3</option>\r\n");
        out.write("      <option value=\"4\">4</option>\r\n");
        out.write("      <option value=\"5\">5</option>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(119,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setProperty("UPC");
    // /contentAddGame.jsp(119,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(119,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setStyle("width:200px;height:18px");
    int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
    if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(133,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f5.setProperty("purchaseAvailabilityID");
    // /contentAddGame.jsp(133,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f5.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(133,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f5.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
    if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foption_005f11(_jspx_th_html_005fselect_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005foption_005f12(_jspx_th_html_005fselect_005f5, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005foption_005f13(_jspx_th_html_005fselect_005f5, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t<!-- ");
        if (_jspx_meth_html_005foption_005f14(_jspx_th_html_005fselect_005f5, _jspx_page_context))
          return true;
        out.write("\t-->\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f11 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /contentAddGame.jsp(134,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f11.setValue("1");
    int _jspx_eval_html_005foption_005f11 = _jspx_th_html_005foption_005f11.doStartTag();
    if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f11.doInitBody();
      }
      do {
        out.write("Not Available");
        int evalDoAfterBody = _jspx_th_html_005foption_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f12 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /contentAddGame.jsp(135,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f12.setValue("2");
    int _jspx_eval_html_005foption_005f12 = _jspx_th_html_005foption_005f12.doStartTag();
    if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f12.doInitBody();
      }
      do {
        out.write("New Copies Only");
        int evalDoAfterBody = _jspx_th_html_005foption_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f13 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /contentAddGame.jsp(136,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f13.setValue("3");
    int _jspx_eval_html_005foption_005f13 = _jspx_th_html_005foption_005f13.doStartTag();
    if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f13.doInitBody();
      }
      do {
        out.write("Used Copies Only");
        int evalDoAfterBody = _jspx_th_html_005foption_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f14 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /contentAddGame.jsp(137,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f14.setValue("4");
    int _jspx_eval_html_005foption_005f14 = _jspx_th_html_005foption_005f14.doStartTag();
    if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f14.doInitBody();
      }
      do {
        out.write("New & Used Copies");
        int evalDoAfterBody = _jspx_th_html_005foption_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f14);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(144,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setProperty("newCopyPrice");
    // /contentAddGame.jsp(144,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(144,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setStyle("width:100px;height:18px");
    int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
    if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(150,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setProperty("usedCopyPrice");
    // /contentAddGame.jsp(150,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(150,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setStyle("width:100px;height:18px");
    int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
    if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(156,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setProperty("copiesLeft");
    // /contentAddGame.jsp(156,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(156,7) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setStyle("width:100px;height:18px");
    int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
    if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f0 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(161,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setProperty("longDesc");
    // /contentAddGame.jsp(161,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(161,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setStyle("width:461px;height:180px");
    int _jspx_eval_html_005ftextarea_005f0 = _jspx_th_html_005ftextarea_005f0.doStartTag();
    if (_jspx_th_html_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(173,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f6.setProperty("localMultiplayer");
    // /contentAddGame.jsp(173,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f6.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(173,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f6.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
    if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f15(_jspx_th_html_005fselect_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f16(_jspx_th_html_005fselect_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f17(_jspx_th_html_005fselect_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f18(_jspx_th_html_005fselect_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f19(_jspx_th_html_005fselect_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f15 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /contentAddGame.jsp(174,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f15.setValue("-1");
    int _jspx_eval_html_005foption_005f15 = _jspx_th_html_005foption_005f15.doStartTag();
    if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f15.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f16 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /contentAddGame.jsp(175,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f16.setValue("0");
    int _jspx_eval_html_005foption_005f16 = _jspx_th_html_005foption_005f16.doStartTag();
    if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f16.doInitBody();
      }
      do {
        out.write("(None)");
        int evalDoAfterBody = _jspx_th_html_005foption_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f17 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /contentAddGame.jsp(176,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f17.setValue("2");
    int _jspx_eval_html_005foption_005f17 = _jspx_th_html_005foption_005f17.doStartTag();
    if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f17.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f17);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f18 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /contentAddGame.jsp(177,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f18.setValue("3");
    int _jspx_eval_html_005foption_005f18 = _jspx_th_html_005foption_005f18.doStartTag();
    if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f18.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f18);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f19 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /contentAddGame.jsp(178,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f19.setValue("4");
    int _jspx_eval_html_005foption_005f19 = _jspx_th_html_005foption_005f19.doStartTag();
    if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f19.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f19);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f7 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(183,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f7.setProperty("localCoOp");
    // /contentAddGame.jsp(183,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f7.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(183,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f7.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f7 = _jspx_th_html_005fselect_005f7.doStartTag();
    if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f7.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f20(_jspx_th_html_005fselect_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f21(_jspx_th_html_005fselect_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f22(_jspx_th_html_005fselect_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f23(_jspx_th_html_005fselect_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f24(_jspx_th_html_005fselect_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f20 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f20.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /contentAddGame.jsp(184,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f20.setValue("-1");
    int _jspx_eval_html_005foption_005f20 = _jspx_th_html_005foption_005f20.doStartTag();
    if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f20.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f21 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f21.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /contentAddGame.jsp(185,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f21.setValue("0");
    int _jspx_eval_html_005foption_005f21 = _jspx_th_html_005foption_005f21.doStartTag();
    if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f21.doInitBody();
      }
      do {
        out.write("(None)");
        int evalDoAfterBody = _jspx_th_html_005foption_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f21);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f22 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f22.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /contentAddGame.jsp(186,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f22.setValue("2");
    int _jspx_eval_html_005foption_005f22 = _jspx_th_html_005foption_005f22.doStartTag();
    if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f22.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f22);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f23 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f23.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /contentAddGame.jsp(187,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f23.setValue("3");
    int _jspx_eval_html_005foption_005f23 = _jspx_th_html_005foption_005f23.doStartTag();
    if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f23.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f23);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f24 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f24.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f7);
    // /contentAddGame.jsp(188,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f24.setValue("4");
    int _jspx_eval_html_005foption_005f24 = _jspx_th_html_005foption_005f24.doStartTag();
    if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f24.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f8 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(193,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f8.setProperty("localNetwork");
    // /contentAddGame.jsp(193,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f8.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(193,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f8.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f8 = _jspx_th_html_005fselect_005f8.doStartTag();
    if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f8.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f25(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f26(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f27(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f28(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f29(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f30(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f31(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f32(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f33(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f34(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f35(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f36(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f37(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f38(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f39(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f40(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f41(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f42(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f43(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f44(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f45(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f46(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f47(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f48(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f49(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f50(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f51(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f52(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f53(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f54(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f55(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f56(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f57(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f58(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f59(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f60(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f61(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f62(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f63(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f64(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f65(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f66(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f67(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f68(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f69(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f70(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f71(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f72(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f73(_jspx_th_html_005fselect_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f25 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f25.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(194,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f25.setValue("-1");
    int _jspx_eval_html_005foption_005f25 = _jspx_th_html_005foption_005f25.doStartTag();
    if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f25.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f26 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f26.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(195,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f26.setValue("0");
    int _jspx_eval_html_005foption_005f26 = _jspx_th_html_005foption_005f26.doStartTag();
    if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f26.doInitBody();
      }
      do {
        out.write("(None)");
        int evalDoAfterBody = _jspx_th_html_005foption_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f26);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f27 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f27.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(196,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f27.setValue("2");
    int _jspx_eval_html_005foption_005f27 = _jspx_th_html_005foption_005f27.doStartTag();
    if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f27.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f27);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f28 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f28.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(197,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f28.setValue("3");
    int _jspx_eval_html_005foption_005f28 = _jspx_th_html_005foption_005f28.doStartTag();
    if (_jspx_eval_html_005foption_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f28.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f28);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f29 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f29.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(198,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f29.setValue("4");
    int _jspx_eval_html_005foption_005f29 = _jspx_th_html_005foption_005f29.doStartTag();
    if (_jspx_eval_html_005foption_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f29.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f29);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f30 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f30.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(199,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f30.setValue("5");
    int _jspx_eval_html_005foption_005f30 = _jspx_th_html_005foption_005f30.doStartTag();
    if (_jspx_eval_html_005foption_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f30.doInitBody();
      }
      do {
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f30);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f31 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f31.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(200,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f31.setValue("6");
    int _jspx_eval_html_005foption_005f31 = _jspx_th_html_005foption_005f31.doStartTag();
    if (_jspx_eval_html_005foption_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f31.doInitBody();
      }
      do {
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f31);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f32 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f32.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(201,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f32.setValue("7");
    int _jspx_eval_html_005foption_005f32 = _jspx_th_html_005foption_005f32.doStartTag();
    if (_jspx_eval_html_005foption_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f32.doInitBody();
      }
      do {
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f32);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f33 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f33.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(202,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f33.setValue("8");
    int _jspx_eval_html_005foption_005f33 = _jspx_th_html_005foption_005f33.doStartTag();
    if (_jspx_eval_html_005foption_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f33.doInitBody();
      }
      do {
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f33);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f34 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f34.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(203,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f34.setValue("9");
    int _jspx_eval_html_005foption_005f34 = _jspx_th_html_005foption_005f34.doStartTag();
    if (_jspx_eval_html_005foption_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f34.doInitBody();
      }
      do {
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f34);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f35 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f35.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(204,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f35.setValue("10");
    int _jspx_eval_html_005foption_005f35 = _jspx_th_html_005foption_005f35.doStartTag();
    if (_jspx_eval_html_005foption_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f35.doInitBody();
      }
      do {
        out.write('1');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f35);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f36 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f36.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(205,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f36.setValue("11");
    int _jspx_eval_html_005foption_005f36 = _jspx_th_html_005foption_005f36.doStartTag();
    if (_jspx_eval_html_005foption_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f36.doInitBody();
      }
      do {
        out.write('1');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f36);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f37 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f37.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(206,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f37.setValue("12");
    int _jspx_eval_html_005foption_005f37 = _jspx_th_html_005foption_005f37.doStartTag();
    if (_jspx_eval_html_005foption_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f37.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f37.doInitBody();
      }
      do {
        out.write('1');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f37);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f38 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f38.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(207,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f38.setValue("13");
    int _jspx_eval_html_005foption_005f38 = _jspx_th_html_005foption_005f38.doStartTag();
    if (_jspx_eval_html_005foption_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f38.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f38.doInitBody();
      }
      do {
        out.write('1');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f38);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f39 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f39.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(208,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f39.setValue("14");
    int _jspx_eval_html_005foption_005f39 = _jspx_th_html_005foption_005f39.doStartTag();
    if (_jspx_eval_html_005foption_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f39.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f39.doInitBody();
      }
      do {
        out.write('1');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f39);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f40 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f40.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(209,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f40.setValue("15");
    int _jspx_eval_html_005foption_005f40 = _jspx_th_html_005foption_005f40.doStartTag();
    if (_jspx_eval_html_005foption_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f40.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f40.doInitBody();
      }
      do {
        out.write('1');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f40);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f41 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f41.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(210,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f41.setValue("16");
    int _jspx_eval_html_005foption_005f41 = _jspx_th_html_005foption_005f41.doStartTag();
    if (_jspx_eval_html_005foption_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f41.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f41.doInitBody();
      }
      do {
        out.write('1');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f41);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f42 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f42.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(211,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f42.setValue("17");
    int _jspx_eval_html_005foption_005f42 = _jspx_th_html_005foption_005f42.doStartTag();
    if (_jspx_eval_html_005foption_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f42.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f42.doInitBody();
      }
      do {
        out.write('1');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f42);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f43 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f43.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(212,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f43.setValue("18");
    int _jspx_eval_html_005foption_005f43 = _jspx_th_html_005foption_005f43.doStartTag();
    if (_jspx_eval_html_005foption_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f43.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f43.doInitBody();
      }
      do {
        out.write('1');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f43);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f44 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f44.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(213,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f44.setValue("19");
    int _jspx_eval_html_005foption_005f44 = _jspx_th_html_005foption_005f44.doStartTag();
    if (_jspx_eval_html_005foption_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f44.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f44.doInitBody();
      }
      do {
        out.write('1');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f44);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f45 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f45.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(214,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f45.setValue("20");
    int _jspx_eval_html_005foption_005f45 = _jspx_th_html_005foption_005f45.doStartTag();
    if (_jspx_eval_html_005foption_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f45.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f45.doInitBody();
      }
      do {
        out.write('2');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f45);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f46 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f46.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(215,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f46.setValue("21");
    int _jspx_eval_html_005foption_005f46 = _jspx_th_html_005foption_005f46.doStartTag();
    if (_jspx_eval_html_005foption_005f46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f46.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f46.doInitBody();
      }
      do {
        out.write('2');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f46);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f47 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f47.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(216,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f47.setValue("22");
    int _jspx_eval_html_005foption_005f47 = _jspx_th_html_005foption_005f47.doStartTag();
    if (_jspx_eval_html_005foption_005f47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f47.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f47.doInitBody();
      }
      do {
        out.write('2');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f47);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f48 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f48.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(217,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f48.setValue("23");
    int _jspx_eval_html_005foption_005f48 = _jspx_th_html_005foption_005f48.doStartTag();
    if (_jspx_eval_html_005foption_005f48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f48.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f48.doInitBody();
      }
      do {
        out.write('2');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f48.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f48);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f49 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f49.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(218,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f49.setValue("24");
    int _jspx_eval_html_005foption_005f49 = _jspx_th_html_005foption_005f49.doStartTag();
    if (_jspx_eval_html_005foption_005f49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f49.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f49.doInitBody();
      }
      do {
        out.write('2');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f49.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f49);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f50 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f50.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(219,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f50.setValue("25");
    int _jspx_eval_html_005foption_005f50 = _jspx_th_html_005foption_005f50.doStartTag();
    if (_jspx_eval_html_005foption_005f50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f50.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f50.doInitBody();
      }
      do {
        out.write('2');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f50.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f50);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f51 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f51.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(220,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f51.setValue("26");
    int _jspx_eval_html_005foption_005f51 = _jspx_th_html_005foption_005f51.doStartTag();
    if (_jspx_eval_html_005foption_005f51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f51.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f51.doInitBody();
      }
      do {
        out.write('2');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f51.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f51);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f52 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f52.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(221,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f52.setValue("27");
    int _jspx_eval_html_005foption_005f52 = _jspx_th_html_005foption_005f52.doStartTag();
    if (_jspx_eval_html_005foption_005f52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f52.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f52.doInitBody();
      }
      do {
        out.write('2');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f52.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f52);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f53 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f53.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(222,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f53.setValue("28");
    int _jspx_eval_html_005foption_005f53 = _jspx_th_html_005foption_005f53.doStartTag();
    if (_jspx_eval_html_005foption_005f53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f53.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f53.doInitBody();
      }
      do {
        out.write('2');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f53.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f53);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f54 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f54.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(223,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f54.setValue("29");
    int _jspx_eval_html_005foption_005f54 = _jspx_th_html_005foption_005f54.doStartTag();
    if (_jspx_eval_html_005foption_005f54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f54.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f54.doInitBody();
      }
      do {
        out.write('2');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f54.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f54);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f55 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f55.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(224,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f55.setValue("30");
    int _jspx_eval_html_005foption_005f55 = _jspx_th_html_005foption_005f55.doStartTag();
    if (_jspx_eval_html_005foption_005f55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f55.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f55.doInitBody();
      }
      do {
        out.write('3');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f55.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f55);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f56 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f56.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(225,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f56.setValue("31");
    int _jspx_eval_html_005foption_005f56 = _jspx_th_html_005foption_005f56.doStartTag();
    if (_jspx_eval_html_005foption_005f56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f56.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f56.doInitBody();
      }
      do {
        out.write('3');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f56.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f56);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f57 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f57.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(226,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f57.setValue("32");
    int _jspx_eval_html_005foption_005f57 = _jspx_th_html_005foption_005f57.doStartTag();
    if (_jspx_eval_html_005foption_005f57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f57.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f57.doInitBody();
      }
      do {
        out.write('3');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f57.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f57);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f58 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f58.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(227,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f58.setValue("33");
    int _jspx_eval_html_005foption_005f58 = _jspx_th_html_005foption_005f58.doStartTag();
    if (_jspx_eval_html_005foption_005f58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f58.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f58.doInitBody();
      }
      do {
        out.write('3');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f58.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f58);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f59 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f59.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(228,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f59.setValue("34");
    int _jspx_eval_html_005foption_005f59 = _jspx_th_html_005foption_005f59.doStartTag();
    if (_jspx_eval_html_005foption_005f59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f59.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f59.doInitBody();
      }
      do {
        out.write('3');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f59.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f59);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f60 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f60.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(229,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f60.setValue("35");
    int _jspx_eval_html_005foption_005f60 = _jspx_th_html_005foption_005f60.doStartTag();
    if (_jspx_eval_html_005foption_005f60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f60.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f60.doInitBody();
      }
      do {
        out.write('3');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f60.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f60);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f61 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f61.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(230,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f61.setValue("36");
    int _jspx_eval_html_005foption_005f61 = _jspx_th_html_005foption_005f61.doStartTag();
    if (_jspx_eval_html_005foption_005f61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f61.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f61.doInitBody();
      }
      do {
        out.write('3');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f61.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f61);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f62 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f62.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(231,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f62.setValue("37");
    int _jspx_eval_html_005foption_005f62 = _jspx_th_html_005foption_005f62.doStartTag();
    if (_jspx_eval_html_005foption_005f62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f62.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f62.doInitBody();
      }
      do {
        out.write('3');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f62.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f62);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f63 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f63.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(232,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f63.setValue("38");
    int _jspx_eval_html_005foption_005f63 = _jspx_th_html_005foption_005f63.doStartTag();
    if (_jspx_eval_html_005foption_005f63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f63.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f63.doInitBody();
      }
      do {
        out.write('3');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f63.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f63);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f64 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f64.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(233,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f64.setValue("39");
    int _jspx_eval_html_005foption_005f64 = _jspx_th_html_005foption_005f64.doStartTag();
    if (_jspx_eval_html_005foption_005f64 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f64 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f64.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f64.doInitBody();
      }
      do {
        out.write('3');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f64.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f64 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f64);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f65 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f65.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(234,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f65.setValue("40");
    int _jspx_eval_html_005foption_005f65 = _jspx_th_html_005foption_005f65.doStartTag();
    if (_jspx_eval_html_005foption_005f65 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f65 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f65.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f65.doInitBody();
      }
      do {
        out.write('4');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f65.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f65 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f65);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f66 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f66.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(235,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f66.setValue("41");
    int _jspx_eval_html_005foption_005f66 = _jspx_th_html_005foption_005f66.doStartTag();
    if (_jspx_eval_html_005foption_005f66 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f66 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f66.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f66.doInitBody();
      }
      do {
        out.write('4');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f66.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f66 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f66);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f67 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f67.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(236,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f67.setValue("42");
    int _jspx_eval_html_005foption_005f67 = _jspx_th_html_005foption_005f67.doStartTag();
    if (_jspx_eval_html_005foption_005f67 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f67 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f67.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f67.doInitBody();
      }
      do {
        out.write('4');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f67.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f67 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f67);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f68 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f68.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(237,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f68.setValue("43");
    int _jspx_eval_html_005foption_005f68 = _jspx_th_html_005foption_005f68.doStartTag();
    if (_jspx_eval_html_005foption_005f68 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f68 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f68.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f68.doInitBody();
      }
      do {
        out.write('4');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f68.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f68 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f68);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f69 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f69.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(238,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f69.setValue("44");
    int _jspx_eval_html_005foption_005f69 = _jspx_th_html_005foption_005f69.doStartTag();
    if (_jspx_eval_html_005foption_005f69 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f69 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f69.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f69.doInitBody();
      }
      do {
        out.write('4');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f69.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f69 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f69);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f70(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f70 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f70.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(239,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f70.setValue("45");
    int _jspx_eval_html_005foption_005f70 = _jspx_th_html_005foption_005f70.doStartTag();
    if (_jspx_eval_html_005foption_005f70 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f70 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f70.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f70.doInitBody();
      }
      do {
        out.write('4');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f70.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f70 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f70);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f71(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f71 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f71.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(240,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f71.setValue("46");
    int _jspx_eval_html_005foption_005f71 = _jspx_th_html_005foption_005f71.doStartTag();
    if (_jspx_eval_html_005foption_005f71 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f71 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f71.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f71.doInitBody();
      }
      do {
        out.write('4');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f71.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f71 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f71);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f72(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f72 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f72.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(241,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f72.setValue("47");
    int _jspx_eval_html_005foption_005f72 = _jspx_th_html_005foption_005f72.doStartTag();
    if (_jspx_eval_html_005foption_005f72 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f72 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f72.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f72.doInitBody();
      }
      do {
        out.write('4');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f72.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f72 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f72);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f73(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f73 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f73.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f8);
    // /contentAddGame.jsp(242,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f73.setValue("48");
    int _jspx_eval_html_005foption_005f73 = _jspx_th_html_005foption_005f73.doStartTag();
    if (_jspx_eval_html_005foption_005f73 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f73 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f73.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f73.doInitBody();
      }
      do {
        out.write('4');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f73.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f73 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f73);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f9 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(247,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f9.setProperty("onlineMultiplayer");
    // /contentAddGame.jsp(247,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f9.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(247,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f9.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f9 = _jspx_th_html_005fselect_005f9.doStartTag();
    if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f9.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f74(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f75(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f76(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f77(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f78(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f79(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f80(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f81(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f82(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f83(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f84(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f85(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f86(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f87(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f88(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f89(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f90(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f91(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f92(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f93(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f94(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f95(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f96(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f97(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f98(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f99(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f100(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f101(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f102(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f103(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f104(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f105(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f106(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f107(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f108(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f109(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f110(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f111(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f112(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f113(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f114(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f115(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f116(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f117(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f118(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f119(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f120(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f121(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f122(_jspx_th_html_005fselect_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f74(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f74 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f74.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(248,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f74.setValue("-1");
    int _jspx_eval_html_005foption_005f74 = _jspx_th_html_005foption_005f74.doStartTag();
    if (_jspx_eval_html_005foption_005f74 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f74 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f74.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f74.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f74.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f74 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f74);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f75(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f75 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f75.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(249,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f75.setValue("0");
    int _jspx_eval_html_005foption_005f75 = _jspx_th_html_005foption_005f75.doStartTag();
    if (_jspx_eval_html_005foption_005f75 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f75 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f75.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f75.doInitBody();
      }
      do {
        out.write("(None)");
        int evalDoAfterBody = _jspx_th_html_005foption_005f75.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f75 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f75);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f76(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f76 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f76.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(250,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f76.setValue("2");
    int _jspx_eval_html_005foption_005f76 = _jspx_th_html_005foption_005f76.doStartTag();
    if (_jspx_eval_html_005foption_005f76 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f76 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f76.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f76.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f76.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f76 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f76);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f77(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f77 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f77.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(251,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f77.setValue("3");
    int _jspx_eval_html_005foption_005f77 = _jspx_th_html_005foption_005f77.doStartTag();
    if (_jspx_eval_html_005foption_005f77 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f77 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f77.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f77.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f77.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f77 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f77);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f78(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f78 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f78.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(252,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f78.setValue("4");
    int _jspx_eval_html_005foption_005f78 = _jspx_th_html_005foption_005f78.doStartTag();
    if (_jspx_eval_html_005foption_005f78 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f78 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f78.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f78.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f78.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f78 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f78);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f79(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f79 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f79.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(253,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f79.setValue("5");
    int _jspx_eval_html_005foption_005f79 = _jspx_th_html_005foption_005f79.doStartTag();
    if (_jspx_eval_html_005foption_005f79 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f79 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f79.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f79.doInitBody();
      }
      do {
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f79.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f79 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f79);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f80(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f80 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f80.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(254,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f80.setValue("6");
    int _jspx_eval_html_005foption_005f80 = _jspx_th_html_005foption_005f80.doStartTag();
    if (_jspx_eval_html_005foption_005f80 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f80 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f80.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f80.doInitBody();
      }
      do {
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f80.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f80 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f80);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f81(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f81 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f81.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(255,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f81.setValue("7");
    int _jspx_eval_html_005foption_005f81 = _jspx_th_html_005foption_005f81.doStartTag();
    if (_jspx_eval_html_005foption_005f81 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f81 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f81.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f81.doInitBody();
      }
      do {
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f81.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f81 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f81);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f82(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f82 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f82.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(256,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f82.setValue("8");
    int _jspx_eval_html_005foption_005f82 = _jspx_th_html_005foption_005f82.doStartTag();
    if (_jspx_eval_html_005foption_005f82 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f82 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f82.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f82.doInitBody();
      }
      do {
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f82.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f82 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f82);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f83(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f83 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f83.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(257,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f83.setValue("9");
    int _jspx_eval_html_005foption_005f83 = _jspx_th_html_005foption_005f83.doStartTag();
    if (_jspx_eval_html_005foption_005f83 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f83 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f83.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f83.doInitBody();
      }
      do {
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f83.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f83 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f83);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f84 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f84.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(258,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f84.setValue("10");
    int _jspx_eval_html_005foption_005f84 = _jspx_th_html_005foption_005f84.doStartTag();
    if (_jspx_eval_html_005foption_005f84 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f84 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f84.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f84.doInitBody();
      }
      do {
        out.write('1');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f84.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f84 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f84);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f85 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f85.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(259,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f85.setValue("11");
    int _jspx_eval_html_005foption_005f85 = _jspx_th_html_005foption_005f85.doStartTag();
    if (_jspx_eval_html_005foption_005f85 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f85 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f85.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f85.doInitBody();
      }
      do {
        out.write('1');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f85.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f85 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f85);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f86(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f86 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f86.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(260,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f86.setValue("12");
    int _jspx_eval_html_005foption_005f86 = _jspx_th_html_005foption_005f86.doStartTag();
    if (_jspx_eval_html_005foption_005f86 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f86 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f86.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f86.doInitBody();
      }
      do {
        out.write('1');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f86.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f86 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f86);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f86);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f87(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f87 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f87.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(261,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f87.setValue("13");
    int _jspx_eval_html_005foption_005f87 = _jspx_th_html_005foption_005f87.doStartTag();
    if (_jspx_eval_html_005foption_005f87 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f87 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f87.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f87.doInitBody();
      }
      do {
        out.write('1');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f87.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f87 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f87);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f87);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f88(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f88 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f88.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(262,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f88.setValue("14");
    int _jspx_eval_html_005foption_005f88 = _jspx_th_html_005foption_005f88.doStartTag();
    if (_jspx_eval_html_005foption_005f88 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f88 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f88.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f88.doInitBody();
      }
      do {
        out.write('1');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f88.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f88 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f88);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f88);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f89(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f89 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f89.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(263,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f89.setValue("15");
    int _jspx_eval_html_005foption_005f89 = _jspx_th_html_005foption_005f89.doStartTag();
    if (_jspx_eval_html_005foption_005f89 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f89 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f89.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f89.doInitBody();
      }
      do {
        out.write('1');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f89.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f89 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f89);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f89);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f90(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f90 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f90.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(264,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f90.setValue("16");
    int _jspx_eval_html_005foption_005f90 = _jspx_th_html_005foption_005f90.doStartTag();
    if (_jspx_eval_html_005foption_005f90 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f90 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f90.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f90.doInitBody();
      }
      do {
        out.write('1');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f90.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f90 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f90);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f90);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f91(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f91 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f91.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(265,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f91.setValue("17");
    int _jspx_eval_html_005foption_005f91 = _jspx_th_html_005foption_005f91.doStartTag();
    if (_jspx_eval_html_005foption_005f91 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f91 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f91.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f91.doInitBody();
      }
      do {
        out.write('1');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f91.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f91 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f91);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f91);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f92(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f92 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f92.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(266,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f92.setValue("18");
    int _jspx_eval_html_005foption_005f92 = _jspx_th_html_005foption_005f92.doStartTag();
    if (_jspx_eval_html_005foption_005f92 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f92 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f92.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f92.doInitBody();
      }
      do {
        out.write('1');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f92.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f92 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f92);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f92);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f93(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f93 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f93.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(267,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f93.setValue("19");
    int _jspx_eval_html_005foption_005f93 = _jspx_th_html_005foption_005f93.doStartTag();
    if (_jspx_eval_html_005foption_005f93 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f93 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f93.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f93.doInitBody();
      }
      do {
        out.write('1');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f93.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f93 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f93);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f93);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f94(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f94 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f94.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(268,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f94.setValue("20");
    int _jspx_eval_html_005foption_005f94 = _jspx_th_html_005foption_005f94.doStartTag();
    if (_jspx_eval_html_005foption_005f94 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f94 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f94.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f94.doInitBody();
      }
      do {
        out.write('2');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f94.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f94 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f94);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f94);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f95(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f95 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f95.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(269,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f95.setValue("21");
    int _jspx_eval_html_005foption_005f95 = _jspx_th_html_005foption_005f95.doStartTag();
    if (_jspx_eval_html_005foption_005f95 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f95 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f95.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f95.doInitBody();
      }
      do {
        out.write('2');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f95.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f95 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f95);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f95);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f96(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f96 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f96.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(270,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f96.setValue("22");
    int _jspx_eval_html_005foption_005f96 = _jspx_th_html_005foption_005f96.doStartTag();
    if (_jspx_eval_html_005foption_005f96 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f96 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f96.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f96.doInitBody();
      }
      do {
        out.write('2');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f96.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f96 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f96);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f96);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f97(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f97 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f97.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(271,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f97.setValue("23");
    int _jspx_eval_html_005foption_005f97 = _jspx_th_html_005foption_005f97.doStartTag();
    if (_jspx_eval_html_005foption_005f97 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f97 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f97.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f97.doInitBody();
      }
      do {
        out.write('2');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f97.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f97 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f97);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f97);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f98(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f98 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f98.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(272,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f98.setValue("24");
    int _jspx_eval_html_005foption_005f98 = _jspx_th_html_005foption_005f98.doStartTag();
    if (_jspx_eval_html_005foption_005f98 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f98 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f98.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f98.doInitBody();
      }
      do {
        out.write('2');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f98.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f98 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f98);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f98);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f99(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f99 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f99.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(273,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f99.setValue("25");
    int _jspx_eval_html_005foption_005f99 = _jspx_th_html_005foption_005f99.doStartTag();
    if (_jspx_eval_html_005foption_005f99 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f99 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f99.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f99.doInitBody();
      }
      do {
        out.write('2');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f99.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f99 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f99);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f99);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f100(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f100 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f100.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(274,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f100.setValue("26");
    int _jspx_eval_html_005foption_005f100 = _jspx_th_html_005foption_005f100.doStartTag();
    if (_jspx_eval_html_005foption_005f100 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f100 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f100.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f100.doInitBody();
      }
      do {
        out.write('2');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f100.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f100 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f100);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f100);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f101(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f101 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f101.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(275,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f101.setValue("27");
    int _jspx_eval_html_005foption_005f101 = _jspx_th_html_005foption_005f101.doStartTag();
    if (_jspx_eval_html_005foption_005f101 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f101 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f101.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f101.doInitBody();
      }
      do {
        out.write('2');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f101.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f101 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f101);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f101);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f102(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f102 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f102.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(276,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f102.setValue("28");
    int _jspx_eval_html_005foption_005f102 = _jspx_th_html_005foption_005f102.doStartTag();
    if (_jspx_eval_html_005foption_005f102 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f102 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f102.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f102.doInitBody();
      }
      do {
        out.write('2');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f102.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f102 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f102);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f102);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f103(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f103 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f103.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(277,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f103.setValue("29");
    int _jspx_eval_html_005foption_005f103 = _jspx_th_html_005foption_005f103.doStartTag();
    if (_jspx_eval_html_005foption_005f103 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f103 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f103.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f103.doInitBody();
      }
      do {
        out.write('2');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f103.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f103 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f103);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f103);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f104(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f104 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f104.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(278,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f104.setValue("30");
    int _jspx_eval_html_005foption_005f104 = _jspx_th_html_005foption_005f104.doStartTag();
    if (_jspx_eval_html_005foption_005f104 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f104 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f104.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f104.doInitBody();
      }
      do {
        out.write('3');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f104.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f104 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f104);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f104);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f105(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f105 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f105.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(279,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f105.setValue("31");
    int _jspx_eval_html_005foption_005f105 = _jspx_th_html_005foption_005f105.doStartTag();
    if (_jspx_eval_html_005foption_005f105 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f105 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f105.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f105.doInitBody();
      }
      do {
        out.write('3');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f105.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f105 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f105);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f105);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f106(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f106 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f106.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(280,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f106.setValue("32");
    int _jspx_eval_html_005foption_005f106 = _jspx_th_html_005foption_005f106.doStartTag();
    if (_jspx_eval_html_005foption_005f106 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f106 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f106.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f106.doInitBody();
      }
      do {
        out.write('3');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f106.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f106 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f106);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f106);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f107(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f107 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f107.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(281,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f107.setValue("33");
    int _jspx_eval_html_005foption_005f107 = _jspx_th_html_005foption_005f107.doStartTag();
    if (_jspx_eval_html_005foption_005f107 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f107 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f107.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f107.doInitBody();
      }
      do {
        out.write('3');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f107.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f107 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f107);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f107);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f108(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f108 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f108.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(282,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f108.setValue("34");
    int _jspx_eval_html_005foption_005f108 = _jspx_th_html_005foption_005f108.doStartTag();
    if (_jspx_eval_html_005foption_005f108 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f108 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f108.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f108.doInitBody();
      }
      do {
        out.write('3');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f108.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f108 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f108);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f108);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f109(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f109 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f109.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(283,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f109.setValue("35");
    int _jspx_eval_html_005foption_005f109 = _jspx_th_html_005foption_005f109.doStartTag();
    if (_jspx_eval_html_005foption_005f109 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f109 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f109.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f109.doInitBody();
      }
      do {
        out.write('3');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f109.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f109 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f109);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f109);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f110(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f110 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f110.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(284,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f110.setValue("36");
    int _jspx_eval_html_005foption_005f110 = _jspx_th_html_005foption_005f110.doStartTag();
    if (_jspx_eval_html_005foption_005f110 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f110 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f110.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f110.doInitBody();
      }
      do {
        out.write('3');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f110.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f110 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f110);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f110);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f111(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f111 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f111.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(285,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f111.setValue("37");
    int _jspx_eval_html_005foption_005f111 = _jspx_th_html_005foption_005f111.doStartTag();
    if (_jspx_eval_html_005foption_005f111 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f111 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f111.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f111.doInitBody();
      }
      do {
        out.write('3');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f111.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f111 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f111);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f111);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f112(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f112 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f112.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(286,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f112.setValue("38");
    int _jspx_eval_html_005foption_005f112 = _jspx_th_html_005foption_005f112.doStartTag();
    if (_jspx_eval_html_005foption_005f112 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f112 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f112.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f112.doInitBody();
      }
      do {
        out.write('3');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f112.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f112 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f112);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f112);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f113(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f113 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f113.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(287,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f113.setValue("39");
    int _jspx_eval_html_005foption_005f113 = _jspx_th_html_005foption_005f113.doStartTag();
    if (_jspx_eval_html_005foption_005f113 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f113 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f113.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f113.doInitBody();
      }
      do {
        out.write('3');
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f113.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f113 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f113);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f113);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f114(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f114 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f114.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(288,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f114.setValue("40");
    int _jspx_eval_html_005foption_005f114 = _jspx_th_html_005foption_005f114.doStartTag();
    if (_jspx_eval_html_005foption_005f114 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f114 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f114.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f114.doInitBody();
      }
      do {
        out.write('4');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f114.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f114 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f114);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f114);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f115(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f115 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f115.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(289,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f115.setValue("41");
    int _jspx_eval_html_005foption_005f115 = _jspx_th_html_005foption_005f115.doStartTag();
    if (_jspx_eval_html_005foption_005f115 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f115 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f115.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f115.doInitBody();
      }
      do {
        out.write('4');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f115.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f115 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f115);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f115);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f116(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f116 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f116.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f116.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(290,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f116.setValue("42");
    int _jspx_eval_html_005foption_005f116 = _jspx_th_html_005foption_005f116.doStartTag();
    if (_jspx_eval_html_005foption_005f116 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f116 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f116.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f116.doInitBody();
      }
      do {
        out.write('4');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f116.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f116 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f116);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f116);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f117(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f117 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f117.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f117.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(291,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f117.setValue("43");
    int _jspx_eval_html_005foption_005f117 = _jspx_th_html_005foption_005f117.doStartTag();
    if (_jspx_eval_html_005foption_005f117 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f117 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f117.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f117.doInitBody();
      }
      do {
        out.write('4');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f117.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f117 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f117);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f117);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f118(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f118 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f118.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f118.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(292,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f118.setValue("44");
    int _jspx_eval_html_005foption_005f118 = _jspx_th_html_005foption_005f118.doStartTag();
    if (_jspx_eval_html_005foption_005f118 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f118 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f118.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f118.doInitBody();
      }
      do {
        out.write('4');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f118.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f118 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f118);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f118);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f119(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f119 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f119.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f119.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(293,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f119.setValue("45");
    int _jspx_eval_html_005foption_005f119 = _jspx_th_html_005foption_005f119.doStartTag();
    if (_jspx_eval_html_005foption_005f119 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f119 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f119.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f119.doInitBody();
      }
      do {
        out.write('4');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f119.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f119 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f119);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f119);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f120(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f120 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f120.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f120.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(294,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f120.setValue("46");
    int _jspx_eval_html_005foption_005f120 = _jspx_th_html_005foption_005f120.doStartTag();
    if (_jspx_eval_html_005foption_005f120 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f120 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f120.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f120.doInitBody();
      }
      do {
        out.write('4');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f120.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f120 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f120);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f120);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f121(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f121 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f121.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f121.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(295,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f121.setValue("47");
    int _jspx_eval_html_005foption_005f121 = _jspx_th_html_005foption_005f121.doStartTag();
    if (_jspx_eval_html_005foption_005f121 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f121 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f121.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f121.doInitBody();
      }
      do {
        out.write('4');
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f121.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f121 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f121);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f121);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f122(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f122 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f122.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f122.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f9);
    // /contentAddGame.jsp(296,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f122.setValue("48");
    int _jspx_eval_html_005foption_005f122 = _jspx_th_html_005foption_005f122.doStartTag();
    if (_jspx_eval_html_005foption_005f122 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f122 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f122.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f122.doInitBody();
      }
      do {
        out.write('4');
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f122.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f122 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f122);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f122);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f10 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(301,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f10.setProperty("onlineCoOp");
    // /contentAddGame.jsp(301,8) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f10.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(301,8) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f10.setStyle("width:60px;height:18px");
    int _jspx_eval_html_005fselect_005f10 = _jspx_th_html_005fselect_005f10.doStartTag();
    if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f10.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f123(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f124(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f125(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f126(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f127(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f128(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f129(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f130(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f131(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f132(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f133(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f134(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f135(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f136(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f137(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f138(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_005foption_005f139(_jspx_th_html_005fselect_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f123(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f123 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f123.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f123.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(302,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f123.setValue("-1");
    int _jspx_eval_html_005foption_005f123 = _jspx_th_html_005foption_005f123.doStartTag();
    if (_jspx_eval_html_005foption_005f123 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f123 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f123.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f123.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f123.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f123 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f123);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f123);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f124(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f124 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f124.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f124.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(303,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f124.setValue("0");
    int _jspx_eval_html_005foption_005f124 = _jspx_th_html_005foption_005f124.doStartTag();
    if (_jspx_eval_html_005foption_005f124 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f124 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f124.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f124.doInitBody();
      }
      do {
        out.write("(None)");
        int evalDoAfterBody = _jspx_th_html_005foption_005f124.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f124 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f124);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f124);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f125(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f125 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f125.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f125.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(304,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f125.setValue("2");
    int _jspx_eval_html_005foption_005f125 = _jspx_th_html_005foption_005f125.doStartTag();
    if (_jspx_eval_html_005foption_005f125 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f125 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f125.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f125.doInitBody();
      }
      do {
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f125.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f125 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f125);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f125);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f126(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f126 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f126.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f126.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(305,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f126.setValue("3");
    int _jspx_eval_html_005foption_005f126 = _jspx_th_html_005foption_005f126.doStartTag();
    if (_jspx_eval_html_005foption_005f126 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f126 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f126.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f126.doInitBody();
      }
      do {
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f126.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f126 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f126);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f126);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f127(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f127 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f127.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f127.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(306,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f127.setValue("4");
    int _jspx_eval_html_005foption_005f127 = _jspx_th_html_005foption_005f127.doStartTag();
    if (_jspx_eval_html_005foption_005f127 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f127 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f127.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f127.doInitBody();
      }
      do {
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f127.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f127 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f127);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f127);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f128(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f128 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f128.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f128.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(307,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f128.setValue("5");
    int _jspx_eval_html_005foption_005f128 = _jspx_th_html_005foption_005f128.doStartTag();
    if (_jspx_eval_html_005foption_005f128 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f128 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f128.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f128.doInitBody();
      }
      do {
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f128.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f128 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f128);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f128);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f129(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f129 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f129.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f129.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(308,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f129.setValue("6");
    int _jspx_eval_html_005foption_005f129 = _jspx_th_html_005foption_005f129.doStartTag();
    if (_jspx_eval_html_005foption_005f129 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f129 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f129.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f129.doInitBody();
      }
      do {
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f129.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f129 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f129);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f129);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f130(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f130 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f130.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f130.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(309,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f130.setValue("7");
    int _jspx_eval_html_005foption_005f130 = _jspx_th_html_005foption_005f130.doStartTag();
    if (_jspx_eval_html_005foption_005f130 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f130 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f130.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f130.doInitBody();
      }
      do {
        out.write('7');
        int evalDoAfterBody = _jspx_th_html_005foption_005f130.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f130 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f130);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f130);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f131(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f131 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f131.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f131.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(310,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f131.setValue("8");
    int _jspx_eval_html_005foption_005f131 = _jspx_th_html_005foption_005f131.doStartTag();
    if (_jspx_eval_html_005foption_005f131 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f131 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f131.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f131.doInitBody();
      }
      do {
        out.write('8');
        int evalDoAfterBody = _jspx_th_html_005foption_005f131.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f131 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f131);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f131);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f132(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f132 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f132.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f132.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(311,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f132.setValue("9");
    int _jspx_eval_html_005foption_005f132 = _jspx_th_html_005foption_005f132.doStartTag();
    if (_jspx_eval_html_005foption_005f132 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f132 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f132.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f132.doInitBody();
      }
      do {
        out.write('9');
        int evalDoAfterBody = _jspx_th_html_005foption_005f132.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f132 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f132);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f132);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f133(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f133 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f133.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f133.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(312,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f133.setValue("10");
    int _jspx_eval_html_005foption_005f133 = _jspx_th_html_005foption_005f133.doStartTag();
    if (_jspx_eval_html_005foption_005f133 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f133 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f133.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f133.doInitBody();
      }
      do {
        out.write('1');
        out.write('0');
        int evalDoAfterBody = _jspx_th_html_005foption_005f133.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f133 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f133);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f133);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f134(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f134 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f134.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f134.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(313,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f134.setValue("11");
    int _jspx_eval_html_005foption_005f134 = _jspx_th_html_005foption_005f134.doStartTag();
    if (_jspx_eval_html_005foption_005f134 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f134 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f134.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f134.doInitBody();
      }
      do {
        out.write('1');
        out.write('1');
        int evalDoAfterBody = _jspx_th_html_005foption_005f134.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f134 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f134);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f134);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f135(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f135 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f135.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f135.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(314,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f135.setValue("12");
    int _jspx_eval_html_005foption_005f135 = _jspx_th_html_005foption_005f135.doStartTag();
    if (_jspx_eval_html_005foption_005f135 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f135 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f135.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f135.doInitBody();
      }
      do {
        out.write('1');
        out.write('2');
        int evalDoAfterBody = _jspx_th_html_005foption_005f135.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f135 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f135);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f135);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f136(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f136 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f136.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f136.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(315,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f136.setValue("13");
    int _jspx_eval_html_005foption_005f136 = _jspx_th_html_005foption_005f136.doStartTag();
    if (_jspx_eval_html_005foption_005f136 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f136 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f136.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f136.doInitBody();
      }
      do {
        out.write('1');
        out.write('3');
        int evalDoAfterBody = _jspx_th_html_005foption_005f136.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f136 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f136);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f136);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f137(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f137 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f137.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f137.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(316,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f137.setValue("14");
    int _jspx_eval_html_005foption_005f137 = _jspx_th_html_005foption_005f137.doStartTag();
    if (_jspx_eval_html_005foption_005f137 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f137 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f137.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f137.doInitBody();
      }
      do {
        out.write('1');
        out.write('4');
        int evalDoAfterBody = _jspx_th_html_005foption_005f137.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f137 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f137);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f137);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f138(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f138 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f138.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f138.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(317,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f138.setValue("15");
    int _jspx_eval_html_005foption_005f138 = _jspx_th_html_005foption_005f138.doStartTag();
    if (_jspx_eval_html_005foption_005f138 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f138 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f138.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f138.doInitBody();
      }
      do {
        out.write('1');
        out.write('5');
        int evalDoAfterBody = _jspx_th_html_005foption_005f138.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f138 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f138);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f138);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f139(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f139 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f139.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f139.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f10);
    // /contentAddGame.jsp(318,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f139.setValue("16");
    int _jspx_eval_html_005foption_005f139 = _jspx_th_html_005foption_005f139.doStartTag();
    if (_jspx_eval_html_005foption_005f139 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f139 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f139.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f139.doInitBody();
      }
      do {
        out.write('1');
        out.write('6');
        int evalDoAfterBody = _jspx_th_html_005foption_005f139.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f139 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f139);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f139);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f11 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(336,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f11.setProperty("audioType");
    // /contentAddGame.jsp(336,3) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f11.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(336,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f11.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f11 = _jspx_th_html_005fselect_005f11.doStartTag();
    if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f11.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t  ");
        if (_jspx_meth_html_005foption_005f140(_jspx_th_html_005fselect_005f11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("               ");
        if (_jspx_meth_html_005foptions_005f3(_jspx_th_html_005fselect_005f11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f140(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f140 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f140.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f140.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f11);
    // /contentAddGame.jsp(337,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f140.setValue("-1");
    int _jspx_eval_html_005foption_005f140 = _jspx_th_html_005foption_005f140.doStartTag();
    if (_jspx_eval_html_005foption_005f140 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f140 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f140.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f140.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f140.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f140 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f140);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f140);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f3 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f11);
    // /contentAddGame.jsp(338,15) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f3.setCollection("audioTypes");
    // /contentAddGame.jsp(338,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f3.setProperty("ID");
    // /contentAddGame.jsp(338,15) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f3.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f3 = _jspx_th_html_005foptions_005f3.doStartTag();
    if (_jspx_th_html_005foptions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f12 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(345,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f12.setProperty("hdtvType");
    // /contentAddGame.jsp(345,5) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f12.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(345,5) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f12.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f12 = _jspx_th_html_005fselect_005f12.doStartTag();
    if (_jspx_eval_html_005fselect_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f12.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("     \t\t\t ");
        if (_jspx_meth_html_005foption_005f141(_jspx_th_html_005fselect_005f12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foptions_005f4(_jspx_th_html_005fselect_005f12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f141(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f141 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f141.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f141.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f12);
    // /contentAddGame.jsp(346,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f141.setValue("-1");
    int _jspx_eval_html_005foption_005f141 = _jspx_th_html_005foption_005f141.doStartTag();
    if (_jspx_eval_html_005foption_005f141 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f141 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f141.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f141.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f141.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f141 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f141);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f141);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f4 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f12);
    // /contentAddGame.jsp(347,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f4.setCollection("hdtvTypes");
    // /contentAddGame.jsp(347,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f4.setProperty("ID");
    // /contentAddGame.jsp(347,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f4.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f4 = _jspx_th_html_005foptions_005f4.doStartTag();
    if (_jspx_th_html_005foptions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f13 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(354,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f13.setProperty("accessoryType");
    // /contentAddGame.jsp(354,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f13.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(354,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f13.setStyle("width:150px;height:18px");
    int _jspx_eval_html_005fselect_005f13 = _jspx_th_html_005fselect_005f13.doStartTag();
    if (_jspx_eval_html_005fselect_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f13.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t    \t  ");
        if (_jspx_meth_html_005foption_005f142(_jspx_th_html_005fselect_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_html_005foptions_005f5(_jspx_th_html_005fselect_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t     ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleClass_005fstyle_005fproperty.reuse(_jspx_th_html_005fselect_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f142(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f142 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f142.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f142.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f13);
    // /contentAddGame.jsp(355,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f142.setValue("-1");
    int _jspx_eval_html_005foption_005f142 = _jspx_th_html_005foption_005f142.doStartTag();
    if (_jspx_eval_html_005foption_005f142 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f142 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f142.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f142.doInitBody();
      }
      do {
        out.write('N');
        out.write('/');
        out.write('A');
        int evalDoAfterBody = _jspx_th_html_005foption_005f142.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f142 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f142);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f142);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f5 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f13);
    // /contentAddGame.jsp(356,16) name = collection type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f5.setCollection("accessoryTypes");
    // /contentAddGame.jsp(356,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f5.setProperty("ID");
    // /contentAddGame.jsp(356,16) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptions_005f5.setLabelProperty("name");
    int _jspx_eval_html_005foptions_005f5 = _jspx_th_html_005foptions_005f5.doStartTag();
    if (_jspx_th_html_005foptions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /contentAddGame.jsp(363,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setProperty("otherFeatures");
    // /contentAddGame.jsp(363,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setStyleClass("verdana_11px_grey");
    // /contentAddGame.jsp(363,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setStyle("width:240px;height:18px");
    // /contentAddGame.jsp(363,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setValue("N/A");
    int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
    if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fstyleClass_005fstyle_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
    return false;
  }
}
