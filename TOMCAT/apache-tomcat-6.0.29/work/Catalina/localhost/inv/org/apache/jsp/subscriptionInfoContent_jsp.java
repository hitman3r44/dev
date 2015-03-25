package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.Partner;
import govojo.db.InventoryPermissions;
import govojo.db.SingleTransactionType;
import govojo.db.SubscriptionStatus;
import govojo.db.CustServLogType;
import govojo.db.Console;
import govojo.db.Referrals;
import govojo.db.ReservedGameQueue;
import govojo.db.SpecialCoupon;
import govojo.db.SpecialCouponCustomers;

public final class subscriptionInfoContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/govojo.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.release();
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005ferrors_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");

String silverCountry="";
if(request.getAttribute("country")!=null)
silverCountry = request.getAttribute("country").toString();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object countReleasedGames = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /subscriptionInfoContent.jsp(40,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f0.setId("countReleasedGames");
      // /subscriptionInfoContent.jsp(40,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f0.setName("countReleasedGames");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      countReleasedGames = (java.lang.Object) _jspx_page_context.findAttribute("countReleasedGames");
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      countReleasedGames = (java.lang.Object) _jspx_page_context.findAttribute("countReleasedGames");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.Object accType = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /subscriptionInfoContent.jsp(41,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setId("accType");
      // /subscriptionInfoContent.jsp(41,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setName("accountType");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      accType = (java.lang.Object) _jspx_page_context.findAttribute("accType");
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      accType = (java.lang.Object) _jspx_page_context.findAttribute("accType");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.String fastReturnedGame = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /subscriptionInfoContent.jsp(43,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setId("fastReturnedGame");
      // /subscriptionInfoContent.jsp(43,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setName("fastReturnedGame");
      // /subscriptionInfoContent.jsp(43,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      fastReturnedGame = (java.lang.String) _jspx_page_context.findAttribute("fastReturnedGame");
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      fastReturnedGame = (java.lang.String) _jspx_page_context.findAttribute("fastReturnedGame");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.String reservedGame = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /subscriptionInfoContent.jsp(44,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setId("reservedGame");
      // /subscriptionInfoContent.jsp(44,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setName("reservedGame");
      // /subscriptionInfoContent.jsp(44,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      reservedGame = (java.lang.String) _jspx_page_context.findAttribute("reservedGame");
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      reservedGame = (java.lang.String) _jspx_page_context.findAttribute("reservedGame");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.String fastReturnedDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f4.setParent(null);
      // /subscriptionInfoContent.jsp(45,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setId("fastReturnedDate");
      // /subscriptionInfoContent.jsp(45,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setName("fastReturnedDate");
      // /subscriptionInfoContent.jsp(45,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
      fastReturnedDate = (java.lang.String) _jspx_page_context.findAttribute("fastReturnedDate");
      if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
        return;
      }
      fastReturnedDate = (java.lang.String) _jspx_page_context.findAttribute("fastReturnedDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.String reservedDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f5.setParent(null);
      // /subscriptionInfoContent.jsp(46,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setId("reservedDate");
      // /subscriptionInfoContent.jsp(46,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setName("reservedDate");
      // /subscriptionInfoContent.jsp(46,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
      reservedDate = (java.lang.String) _jspx_page_context.findAttribute("reservedDate");
      if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
        return;
      }
      reservedDate = (java.lang.String) _jspx_page_context.findAttribute("reservedDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object subID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f6.setParent(null);
      // /subscriptionInfoContent.jsp(48,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setId("subID");
      // /subscriptionInfoContent.jsp(48,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setName("subscription");
      // /subscriptionInfoContent.jsp(48,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setProperty("ID");
      int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
      subID = (java.lang.Object) _jspx_page_context.findAttribute("subID");
      if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
        return;
      }
      subID = (java.lang.Object) _jspx_page_context.findAttribute("subID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object subStartDateAsString = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f7.setParent(null);
      // /subscriptionInfoContent.jsp(50,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setId("subStartDateAsString");
      // /subscriptionInfoContent.jsp(50,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setName("subscription");
      // /subscriptionInfoContent.jsp(50,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setProperty("startDateAsString");
      int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
      subStartDateAsString = (java.lang.Object) _jspx_page_context.findAttribute("subStartDateAsString");
      if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
        return;
      }
      subStartDateAsString = (java.lang.Object) _jspx_page_context.findAttribute("subStartDateAsString");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object subPartnerID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f8.setParent(null);
      // /subscriptionInfoContent.jsp(52,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setId("subPartnerID");
      // /subscriptionInfoContent.jsp(52,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setName("subscription");
      // /subscriptionInfoContent.jsp(52,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setProperty("partnerID");
      int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
      subPartnerID = (java.lang.Object) _jspx_page_context.findAttribute("subPartnerID");
      if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
        return;
      }
      subPartnerID = (java.lang.Object) _jspx_page_context.findAttribute("subPartnerID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.Object activePlatinumDays = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f9.setParent(null);
      // /subscriptionInfoContent.jsp(53,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setId("activePlatinumDays");
      // /subscriptionInfoContent.jsp(53,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setName("subscription");
      // /subscriptionInfoContent.jsp(53,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setProperty("activePlatinumDays");
      int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
      activePlatinumDays = (java.lang.Object) _jspx_page_context.findAttribute("activePlatinumDays");
      if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
        return;
      }
      activePlatinumDays = (java.lang.Object) _jspx_page_context.findAttribute("activePlatinumDays");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receiveID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f10.setParent(null);
      // /subscriptionInfoContent.jsp(57,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setId("receiveID");
      // /subscriptionInfoContent.jsp(57,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(57,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setProperty("ID");
      int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
      receiveID = (java.lang.Object) _jspx_page_context.findAttribute("receiveID");
      if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
        return;
      }
      receiveID = (java.lang.Object) _jspx_page_context.findAttribute("receiveID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receiveFirstName = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f11 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f11.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f11.setParent(null);
      // /subscriptionInfoContent.jsp(59,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setId("receiveFirstName");
      // /subscriptionInfoContent.jsp(59,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(59,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setProperty("firstName");
      int _jspx_eval_bean_005fdefine_005f11 = _jspx_th_bean_005fdefine_005f11.doStartTag();
      receiveFirstName = (java.lang.Object) _jspx_page_context.findAttribute("receiveFirstName");
      if (_jspx_th_bean_005fdefine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
        return;
      }
      receiveFirstName = (java.lang.Object) _jspx_page_context.findAttribute("receiveFirstName");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receiveLastName = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f12 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f12.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f12.setParent(null);
      // /subscriptionInfoContent.jsp(61,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setId("receiveLastName");
      // /subscriptionInfoContent.jsp(61,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(61,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setProperty("lastName");
      int _jspx_eval_bean_005fdefine_005f12 = _jspx_th_bean_005fdefine_005f12.doStartTag();
      receiveLastName = (java.lang.Object) _jspx_page_context.findAttribute("receiveLastName");
      if (_jspx_th_bean_005fdefine_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
        return;
      }
      receiveLastName = (java.lang.Object) _jspx_page_context.findAttribute("receiveLastName");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receivePassword = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f13 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f13.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f13.setParent(null);
      // /subscriptionInfoContent.jsp(63,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setId("receivePassword");
      // /subscriptionInfoContent.jsp(63,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(63,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setProperty("password");
      int _jspx_eval_bean_005fdefine_005f13 = _jspx_th_bean_005fdefine_005f13.doStartTag();
      receivePassword = (java.lang.Object) _jspx_page_context.findAttribute("receivePassword");
      if (_jspx_th_bean_005fdefine_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
        return;
      }
      receivePassword = (java.lang.Object) _jspx_page_context.findAttribute("receivePassword");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receivePhone = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f14 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f14.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f14.setParent(null);
      // /subscriptionInfoContent.jsp(65,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setId("receivePhone");
      // /subscriptionInfoContent.jsp(65,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(65,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setProperty("phone");
      int _jspx_eval_bean_005fdefine_005f14 = _jspx_th_bean_005fdefine_005f14.doStartTag();
      receivePhone = (java.lang.Object) _jspx_page_context.findAttribute("receivePhone");
      if (_jspx_th_bean_005fdefine_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
        return;
      }
      receivePhone = (java.lang.Object) _jspx_page_context.findAttribute("receivePhone");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receiveEmail = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f15 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f15.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f15.setParent(null);
      // /subscriptionInfoContent.jsp(67,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setId("receiveEmail");
      // /subscriptionInfoContent.jsp(67,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(67,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setProperty("email");
      int _jspx_eval_bean_005fdefine_005f15 = _jspx_th_bean_005fdefine_005f15.doStartTag();
      receiveEmail = (java.lang.Object) _jspx_page_context.findAttribute("receiveEmail");
      if (_jspx_th_bean_005fdefine_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
        return;
      }
      receiveEmail = (java.lang.Object) _jspx_page_context.findAttribute("receiveEmail");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object receiveLogin = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f16 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f16.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f16.setParent(null);
      // /subscriptionInfoContent.jsp(69,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setId("receiveLogin");
      // /subscriptionInfoContent.jsp(69,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setName("receiveCustomer");
      // /subscriptionInfoContent.jsp(69,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setProperty("login");
      int _jspx_eval_bean_005fdefine_005f16 = _jspx_th_bean_005fdefine_005f16.doStartTag();
      receiveLogin = (java.lang.Object) _jspx_page_context.findAttribute("receiveLogin");
      if (_jspx_th_bean_005fdefine_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
        return;
      }
      receiveLogin = (java.lang.Object) _jspx_page_context.findAttribute("receiveLogin");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object purchaseID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f17 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f17.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f17.setParent(null);
      // /subscriptionInfoContent.jsp(75,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setId("purchaseID");
      // /subscriptionInfoContent.jsp(75,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(75,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setProperty("ID");
      int _jspx_eval_bean_005fdefine_005f17 = _jspx_th_bean_005fdefine_005f17.doStartTag();
      purchaseID = (java.lang.Object) _jspx_page_context.findAttribute("purchaseID");
      if (_jspx_th_bean_005fdefine_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
        return;
      }
      purchaseID = (java.lang.Object) _jspx_page_context.findAttribute("purchaseID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object purchaseFirstName = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f18 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f18.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f18.setParent(null);
      // /subscriptionInfoContent.jsp(77,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setId("purchaseFirstName");
      // /subscriptionInfoContent.jsp(77,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(77,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setProperty("firstName");
      int _jspx_eval_bean_005fdefine_005f18 = _jspx_th_bean_005fdefine_005f18.doStartTag();
      purchaseFirstName = (java.lang.Object) _jspx_page_context.findAttribute("purchaseFirstName");
      if (_jspx_th_bean_005fdefine_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
        return;
      }
      purchaseFirstName = (java.lang.Object) _jspx_page_context.findAttribute("purchaseFirstName");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object purchaseLastName = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f19 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f19.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f19.setParent(null);
      // /subscriptionInfoContent.jsp(79,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setId("purchaseLastName");
      // /subscriptionInfoContent.jsp(79,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(79,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setProperty("lastName");
      int _jspx_eval_bean_005fdefine_005f19 = _jspx_th_bean_005fdefine_005f19.doStartTag();
      purchaseLastName = (java.lang.Object) _jspx_page_context.findAttribute("purchaseLastName");
      if (_jspx_th_bean_005fdefine_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
        return;
      }
      purchaseLastName = (java.lang.Object) _jspx_page_context.findAttribute("purchaseLastName");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object language = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f20 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f20.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f20.setParent(null);
      // /subscriptionInfoContent.jsp(81,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setId("language");
      // /subscriptionInfoContent.jsp(81,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(81,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setProperty("language");
      int _jspx_eval_bean_005fdefine_005f20 = _jspx_th_bean_005fdefine_005f20.doStartTag();
      language = (java.lang.Object) _jspx_page_context.findAttribute("language");
      if (_jspx_th_bean_005fdefine_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
        return;
      }
      language = (java.lang.Object) _jspx_page_context.findAttribute("language");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object heardAboutUs = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f21 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f21.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f21.setParent(null);
      // /subscriptionInfoContent.jsp(83,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setId("heardAboutUs");
      // /subscriptionInfoContent.jsp(83,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(83,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setProperty("heardAboutUs");
      int _jspx_eval_bean_005fdefine_005f21 = _jspx_th_bean_005fdefine_005f21.doStartTag();
      heardAboutUs = (java.lang.Object) _jspx_page_context.findAttribute("heardAboutUs");
      if (_jspx_th_bean_005fdefine_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
        return;
      }
      heardAboutUs = (java.lang.Object) _jspx_page_context.findAttribute("heardAboutUs");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object consolesOwned = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f22 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f22.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f22.setParent(null);
      // /subscriptionInfoContent.jsp(85,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setId("consolesOwned");
      // /subscriptionInfoContent.jsp(85,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setName("purchaseCustomer");
      // /subscriptionInfoContent.jsp(85,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setProperty("consolesOwned");
      int _jspx_eval_bean_005fdefine_005f22 = _jspx_th_bean_005fdefine_005f22.doStartTag();
      consolesOwned = (java.lang.Object) _jspx_page_context.findAttribute("consolesOwned");
      if (_jspx_th_bean_005fdefine_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
        return;
      }
      consolesOwned = (java.lang.Object) _jspx_page_context.findAttribute("consolesOwned");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f23 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f23.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f23.setParent(null);
      // /subscriptionInfoContent.jsp(89,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f23.setId("shippingID");
      // /subscriptionInfoContent.jsp(89,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f23.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(89,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f23.setProperty("ID");
      int _jspx_eval_bean_005fdefine_005f23 = _jspx_th_bean_005fdefine_005f23.doStartTag();
      shippingID = (java.lang.Object) _jspx_page_context.findAttribute("shippingID");
      if (_jspx_th_bean_005fdefine_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
        return;
      }
      shippingID = (java.lang.Object) _jspx_page_context.findAttribute("shippingID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingStreet1 = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f24 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f24.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f24.setParent(null);
      // /subscriptionInfoContent.jsp(91,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f24.setId("shippingStreet1");
      // /subscriptionInfoContent.jsp(91,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f24.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(91,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f24.setProperty("street1");
      int _jspx_eval_bean_005fdefine_005f24 = _jspx_th_bean_005fdefine_005f24.doStartTag();
      shippingStreet1 = (java.lang.Object) _jspx_page_context.findAttribute("shippingStreet1");
      if (_jspx_th_bean_005fdefine_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
        return;
      }
      shippingStreet1 = (java.lang.Object) _jspx_page_context.findAttribute("shippingStreet1");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingStreet2 = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f25 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f25.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f25.setParent(null);
      // /subscriptionInfoContent.jsp(93,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f25.setId("shippingStreet2");
      // /subscriptionInfoContent.jsp(93,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f25.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(93,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f25.setProperty("street2");
      int _jspx_eval_bean_005fdefine_005f25 = _jspx_th_bean_005fdefine_005f25.doStartTag();
      shippingStreet2 = (java.lang.Object) _jspx_page_context.findAttribute("shippingStreet2");
      if (_jspx_th_bean_005fdefine_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
        return;
      }
      shippingStreet2 = (java.lang.Object) _jspx_page_context.findAttribute("shippingStreet2");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingCity = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f26 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f26.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f26.setParent(null);
      // /subscriptionInfoContent.jsp(95,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f26.setId("shippingCity");
      // /subscriptionInfoContent.jsp(95,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f26.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(95,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f26.setProperty("city");
      int _jspx_eval_bean_005fdefine_005f26 = _jspx_th_bean_005fdefine_005f26.doStartTag();
      shippingCity = (java.lang.Object) _jspx_page_context.findAttribute("shippingCity");
      if (_jspx_th_bean_005fdefine_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
        return;
      }
      shippingCity = (java.lang.Object) _jspx_page_context.findAttribute("shippingCity");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingState = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f27 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f27.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f27.setParent(null);
      // /subscriptionInfoContent.jsp(97,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f27.setId("shippingState");
      // /subscriptionInfoContent.jsp(97,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f27.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(97,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f27.setProperty("state");
      int _jspx_eval_bean_005fdefine_005f27 = _jspx_th_bean_005fdefine_005f27.doStartTag();
      shippingState = (java.lang.Object) _jspx_page_context.findAttribute("shippingState");
      if (_jspx_th_bean_005fdefine_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
        return;
      }
      shippingState = (java.lang.Object) _jspx_page_context.findAttribute("shippingState");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingZip = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f28 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f28.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f28.setParent(null);
      // /subscriptionInfoContent.jsp(99,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f28.setId("shippingZip");
      // /subscriptionInfoContent.jsp(99,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f28.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(99,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f28.setProperty("zip");
      int _jspx_eval_bean_005fdefine_005f28 = _jspx_th_bean_005fdefine_005f28.doStartTag();
      shippingZip = (java.lang.Object) _jspx_page_context.findAttribute("shippingZip");
      if (_jspx_th_bean_005fdefine_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
        return;
      }
      shippingZip = (java.lang.Object) _jspx_page_context.findAttribute("shippingZip");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object shippingZipPlusFour = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f29 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f29.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f29.setParent(null);
      // /subscriptionInfoContent.jsp(101,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f29.setId("shippingZipPlusFour");
      // /subscriptionInfoContent.jsp(101,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f29.setName("shippingAddress");
      // /subscriptionInfoContent.jsp(101,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f29.setProperty("zipPlusFour");
      int _jspx_eval_bean_005fdefine_005f29 = _jspx_th_bean_005fdefine_005f29.doStartTag();
      shippingZipPlusFour = (java.lang.Object) _jspx_page_context.findAttribute("shippingZipPlusFour");
      if (_jspx_th_bean_005fdefine_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
        return;
      }
      shippingZipPlusFour = (java.lang.Object) _jspx_page_context.findAttribute("shippingZipPlusFour");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f29);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f30 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f30.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f30.setParent(null);
      // /subscriptionInfoContent.jsp(105,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f30.setId("billingID");
      // /subscriptionInfoContent.jsp(105,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f30.setName("billingAddress");
      // /subscriptionInfoContent.jsp(105,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f30.setProperty("ID");
      int _jspx_eval_bean_005fdefine_005f30 = _jspx_th_bean_005fdefine_005f30.doStartTag();
      billingID = (java.lang.Object) _jspx_page_context.findAttribute("billingID");
      if (_jspx_th_bean_005fdefine_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
        return;
      }
      billingID = (java.lang.Object) _jspx_page_context.findAttribute("billingID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f30);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingStreet1 = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f31 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f31.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f31.setParent(null);
      // /subscriptionInfoContent.jsp(107,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f31.setId("billingStreet1");
      // /subscriptionInfoContent.jsp(107,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f31.setName("billingAddress");
      // /subscriptionInfoContent.jsp(107,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f31.setProperty("street1");
      int _jspx_eval_bean_005fdefine_005f31 = _jspx_th_bean_005fdefine_005f31.doStartTag();
      billingStreet1 = (java.lang.Object) _jspx_page_context.findAttribute("billingStreet1");
      if (_jspx_th_bean_005fdefine_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
        return;
      }
      billingStreet1 = (java.lang.Object) _jspx_page_context.findAttribute("billingStreet1");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f31);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingStreet2 = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f32 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f32.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f32.setParent(null);
      // /subscriptionInfoContent.jsp(109,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f32.setId("billingStreet2");
      // /subscriptionInfoContent.jsp(109,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f32.setName("billingAddress");
      // /subscriptionInfoContent.jsp(109,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f32.setProperty("street2");
      int _jspx_eval_bean_005fdefine_005f32 = _jspx_th_bean_005fdefine_005f32.doStartTag();
      billingStreet2 = (java.lang.Object) _jspx_page_context.findAttribute("billingStreet2");
      if (_jspx_th_bean_005fdefine_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
        return;
      }
      billingStreet2 = (java.lang.Object) _jspx_page_context.findAttribute("billingStreet2");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f32);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingCity = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f33 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f33.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f33.setParent(null);
      // /subscriptionInfoContent.jsp(111,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f33.setId("billingCity");
      // /subscriptionInfoContent.jsp(111,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f33.setName("billingAddress");
      // /subscriptionInfoContent.jsp(111,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f33.setProperty("city");
      int _jspx_eval_bean_005fdefine_005f33 = _jspx_th_bean_005fdefine_005f33.doStartTag();
      billingCity = (java.lang.Object) _jspx_page_context.findAttribute("billingCity");
      if (_jspx_th_bean_005fdefine_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
        return;
      }
      billingCity = (java.lang.Object) _jspx_page_context.findAttribute("billingCity");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f33);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingState = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f34 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f34.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f34.setParent(null);
      // /subscriptionInfoContent.jsp(113,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f34.setId("billingState");
      // /subscriptionInfoContent.jsp(113,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f34.setName("billingAddress");
      // /subscriptionInfoContent.jsp(113,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f34.setProperty("state");
      int _jspx_eval_bean_005fdefine_005f34 = _jspx_th_bean_005fdefine_005f34.doStartTag();
      billingState = (java.lang.Object) _jspx_page_context.findAttribute("billingState");
      if (_jspx_th_bean_005fdefine_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
        return;
      }
      billingState = (java.lang.Object) _jspx_page_context.findAttribute("billingState");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f34);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingZip = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f35 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f35.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f35.setParent(null);
      // /subscriptionInfoContent.jsp(115,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f35.setId("billingZip");
      // /subscriptionInfoContent.jsp(115,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f35.setName("billingAddress");
      // /subscriptionInfoContent.jsp(115,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f35.setProperty("zip");
      int _jspx_eval_bean_005fdefine_005f35 = _jspx_th_bean_005fdefine_005f35.doStartTag();
      billingZip = (java.lang.Object) _jspx_page_context.findAttribute("billingZip");
      if (_jspx_th_bean_005fdefine_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f35);
        return;
      }
      billingZip = (java.lang.Object) _jspx_page_context.findAttribute("billingZip");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f35);
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object billingZipPlusFour = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f36 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f36.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f36.setParent(null);
      // /subscriptionInfoContent.jsp(117,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f36.setId("billingZipPlusFour");
      // /subscriptionInfoContent.jsp(117,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f36.setName("billingAddress");
      // /subscriptionInfoContent.jsp(117,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f36.setProperty("zipPlusFour");
      int _jspx_eval_bean_005fdefine_005f36 = _jspx_th_bean_005fdefine_005f36.doStartTag();
      billingZipPlusFour = (java.lang.Object) _jspx_page_context.findAttribute("billingZipPlusFour");
      if (_jspx_th_bean_005fdefine_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f36);
        return;
      }
      billingZipPlusFour = (java.lang.Object) _jspx_page_context.findAttribute("billingZipPlusFour");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f36);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


/*

<bean:define id="receiveAlertType" name="receiveCustAlerts" property="type"/>

<bean:define id="receiveAlertStatus" name="receiveCustAlerts" property="status"/>

<bean:define id="receiveAlertInfo" name="receiveCustAlerts" property="alertInfo"/>

<bean:define id="receiveAlertTimestamp" name="receiveCustAlerts" property="timestamp"/>



<bean:define id="purchaseAlertType" name="purchaseCustAlerts" property="type"/>

<bean:define id="purchaseAlertStatus" name="purchaseCustAlerts" property="status"/>

<bean:define id="purchaseAlertInfo" name="purchaseCustAlerts" property="alertInfo"/>

<bean:define id="purchaseAlertTimestamp" name="purchaseCusteAlerts" property="timestamp"/>

*/


      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function getAvsInformation(avsCode)\r\n");
      out.write("{\r\n");
      out.write("\tvar avsInformation;\r\n");
      out.write("\tif(avsCode == \"A\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street addresses match. The street addresses match but the postal/ZIP <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"codes do not, or the request does not include the postal/ZIP code.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"B\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street addresses match. Postal code not verified due to incompatible <br>\" +\r\n");
      out.write("\t\t\t\t\t\t \"formats. (Acquirer sent both street address and postal code.)\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"C\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street address and postal code not verified due to incompatible formats. <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"(Acquirer sent both street address and postal code.)\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"D\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street addresses and postal codes match.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"G\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Address information not verified for international transaction.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"I\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Address information not verified.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"M\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street address and postal code match.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"N\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"No match. Acquirer sent postal/ZIP code only, or street address only, or <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"both postal code and street address.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"P\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Postal code match. Acquirer sent both postal code and street address, <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"but street address not verified due to incompatible formats.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"R\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Retry: System unavailable or timed out. Issuer ordinarily performs its <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"own AVS but was unavailable. Available for U.S. issuers only.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"S\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Not applicable. If present, replaced with G (for international) or U (for <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"domestic) by V.I.P. Available for U.S. Issuers only.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"U\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Address not verified for domestic transaction. Visa tried to perform <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"check on issuer's behalf but no AVS information was available on record, <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"issuer is not an AVS participant, or AVS data was present in the request <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"but issuer did not return an AVS result. <br>\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"W\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Not applicable. If present, replaced with Z by V.I.P. Available for U.S. <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"issuers only.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"X\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Not applicable. If present, replaced with Y by V.I.P. Available for U.S. <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"issuers only.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"Y\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Street address and postal code match.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (avsCode == \"Z\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tavsInformation = \"Postal/ZIP matches; street address does not match or street address not <br>\"+\r\n");
      out.write("\t\t\t\t\t\t \"included in request.\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\treturn (avsInformation);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getCvdInformation(cvdCode)\r\n");
      out.write("{\r\n");
      out.write("\tvar cvdInformation;\r\n");
      out.write("\tif(cvdCode == \"M\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcvdInformation = \"Match.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (cvdCode == \"N\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcvdInformation = \"No Match.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (cvdCode == \"P\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcvdInformation = \"Not Processed.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (cvdCode == \"S\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcvdInformation = \"CVD should be on the card, but Merchant has indicated that CVD is not present.\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (cvdCode == \"U\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcvdInformation = \"Issuer is not a CVD participant.\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn (cvdInformation);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /subscriptionInfoContent.jsp(260,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setName("alertList");
      // /subscriptionInfoContent.jsp(260,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("alert");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object alert = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        alert = (java.lang.Object) _jspx_page_context.findAttribute("alert");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <b><font color=\"red\"><blink>");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</blink></font></b><br>\r\n");
          out.write("\r\n");
          out.write("    ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f0 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f0.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /subscriptionInfoContent.jsp(264,4) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f0.setPermission(InventoryPermissions.COLLECTIONS_CHARGE.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f0 = _jspx_th_govojo_005fdisplayPermissions_005f0.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("      <br>\r\n");
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_html_005flink_005f0(_jspx_th_govojo_005fdisplayPermissions_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f1 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f1.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /subscriptionInfoContent.jsp(272,4) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f1.setPermission(InventoryPermissions.COLLECTIONS_LOG.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f1 = _jspx_th_govojo_005fdisplayPermissions_005f1.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("      <br>\r\n");
              out.write("\r\n");
              out.write("      ");
              if (_jspx_meth_html_005flink_005f1(_jspx_th_govojo_005fdisplayPermissions_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f1);
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f2 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f2.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /subscriptionInfoContent.jsp(280,4) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f2.setPermission(InventoryPermissions.REMOVE_CUSTOMER_ALERT.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f2 = _jspx_th_govojo_005fdisplayPermissions_005f2.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("      <br>\r\n");
              out.write("\r\n");
              out.write("      <FORM ACTION=\"");
              if (_jspx_meth_html_005frewrite_005f0(_jspx_th_govojo_005fdisplayPermissions_005f2, _jspx_page_context))
                return;
              out.write("\" onSubmit=\"return confirm('Are you sure you want to remove the alert for this customer?');\">\r\n");
              out.write("\r\n");
              out.write("        <INPUT TYPE=\"hidden\" NAME=\"customerID\" VALUE=\"");
              out.print( ((Integer)purchaseID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("        <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
              out.print(((Integer)subID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("        <INPUT TYPE=\"submit\" VALUE=\"REMOVE THIS ALERT\">       \r\n");
              out.write("\r\n");
              out.write("      </FORM>\r\n");
              out.write("\r\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f2);
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          alert = (java.lang.Object) _jspx_page_context.findAttribute("alert");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FONT FACE=\"arial,helvetica\">\r\n");
      out.write("\r\n");
      out.write("   <p align=\"center\" />\r\n");
      out.write("   <h2><b>Subscription Info</b></h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("   ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /subscriptionInfoContent.jsp(311,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fpresent_005f0.setName("outstandingGames");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("       ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /subscriptionInfoContent.jsp(313,7) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setAction("/outstandingForCustomer.do");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("           ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /subscriptionInfoContent.jsp(315,11) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f0.setProperty("ref");
              // /subscriptionInfoContent.jsp(315,11) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f0.setValue(((Integer)purchaseID).toString());
              int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
              if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
              out.write("\r\n");
              out.write("\r\n");
              out.write("           <b>Outstanding Games: </b>");
              if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("       ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("<br>\r\n");
          out.write("\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t<td colspan=3>\r\n");
      out.write("\r\n");
      out.write("\t\t<b>RECEIVING CUSTOMER</b>\r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t  <td>Customer ID</td>\r\n");
      out.write("\r\n");
      out.write("\t  <td>");
      out.print( ((Integer)receiveID).toString());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t  <td>Billing Address</td>\r\n");
      out.write("\r\n");
      out.write("\t  <td>\t\r\n");
      out.write("\r\n");
      out.write("\t    ");
      out.print( (String)purchaseFirstName );
      out.write(' ');
      out.print( (String)purchaseLastName );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    <br>\r\n");
      out.write("\r\n");
      out.write("\t    ");
      out.print( ((String)billingStreet1) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    <br>\r\n");
      out.write("\r\n");
      out.write("\t    ");
 if( ((String)billingStreet2 != null) && (((String)billingStreet2).length() > 1)) { out.print((String)billingStreet2 + "<br>"); } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    ");
      out.print( (String)billingCity );
      out.write(',');
      out.write(' ');
      out.print( (String)billingState );
      out.write(' ');
      out.write(' ');
      out.print( (String)billingZip );
 if(((String)billingZipPlusFour != null) && ((String)billingZipPlusFour).length() == 4) { out.print("-"+(String)billingZipPlusFour); } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f3 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f3.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f3.setParent(null);
      // /subscriptionInfoContent.jsp(373,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f3.setPermission(InventoryPermissions.EDIT_CUSTOMER_ADDRESS.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f3 = _jspx_th_govojo_005fdisplayPermissions_005f3.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t  <td>\r\n");
          out.write("\r\n");
          out.write("             ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f1 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f3);
          // /subscriptionInfoContent.jsp(377,13) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f1.setAction("editAddress.do");
          int _jspx_eval_html_005fform_005f1 = _jspx_th_html_005fform_005f1.doStartTag();
          if (_jspx_eval_html_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"submit\" VALUE=\"EDIT this address\">\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
              out.print( ((Integer)subID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"hidden\" NAME=\"addressID\" VALUE=\"");
              out.print( ((Integer)billingID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("             ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f1);
          out.write("\r\n");
          out.write("\r\n");
          out.write("          </td>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f3);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Shipping Address</td>\r\n");
      out.write("\r\n");
      out.write("          <td style=\"text-transform:uppercase;\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receiveFirstName );
      out.write(' ');
      out.print( (String)receiveLastName );
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( ((String)shippingStreet1) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            ");
 if( ((String)shippingStreet2 != null) && ((String)shippingStreet2).length() > 1) { out.print((String)shippingStreet2 + "<br>"); } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)shippingCity );
      out.write(' ');
      out.print( (String)shippingState );
      out.write("&nbsp;&nbsp;");
      out.print( (String)shippingZip );
 if( ((String)shippingZipPlusFour != null) && ((String)shippingZipPlusFour).length() == 4) { out.print("-"+(String)shippingZipPlusFour); } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f4 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f4.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f4.setParent(null);
      // /subscriptionInfoContent.jsp(415,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f4.setPermission(InventoryPermissions.EDIT_CUSTOMER_ADDRESS.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f4 = _jspx_th_govojo_005fdisplayPermissions_005f4.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t  <td>\r\n");
          out.write("\r\n");
          out.write("             <FORM ACTION=\"");
          if (_jspx_meth_html_005frewrite_005f1(_jspx_th_govojo_005fdisplayPermissions_005f4, _jspx_page_context))
            return;
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"submit\" VALUE=\"EDIT this address\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
          out.print( ((Integer)subID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"addressID\" VALUE=\"");
          out.print( ((Integer)shippingID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("            </FORM>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<br/>\r\n");
          out.write("\t\t\t");

			boolean isPutOnHold = (request.getAttribute("flaggedMemberPOH") != null); 
			if(!isPutOnHold){ 
          out.write("\r\n");
          out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"curr=document.getElementById('holdDiv').style.display; document.getElementById('holdDiv').style.display=(curr =='none')?'block':'none';\"> Put customer on hold</a>\r\n");
          out.write("\t\t\t<div id=\"holdDiv\" style=\"display:none;\"> \r\n");
          out.write("\t\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f2 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f4);
          // /subscriptionInfoContent.jsp(435,3) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f2.setAction("/addFlaggedMember.do");
          int _jspx_eval_html_005fform_005f2 = _jspx_th_html_005fform_005f2.doStartTag();
          if (_jspx_eval_html_005fform_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f2);
              // /subscriptionInfoContent.jsp(436,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f1.setProperty("subscriptionID");
              // /subscriptionInfoContent.jsp(436,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f1.setValue(((Integer)subID).toString() );
              int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
              if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fhidden_005f3(_jspx_th_html_005fform_005f2, _jspx_page_context))
                return;
              out.write("\t\t\t\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005ftextarea_005f0(_jspx_th_html_005fform_005f2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fsubmit_005f1(_jspx_th_html_005fform_005f2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f2);
          out.write("\r\n");
          out.write("            Note: Putting a customer hold flag will automatically <br/> put him/her in \"need address normalization list\".\r\n");
          out.write("\t\t\t</div>\t\t\r\n");
          out.write("\t\t\t<br/>\t\r\n");
          out.write("\t\t\t");
}else{ 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t<div id=\"holdDiv\"> \r\n");
          out.write("\t\t\t<p style=\"color:red;\">Customer is put on hold</p>\r\n");
          out.write("\t\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f3 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f4);
          // /subscriptionInfoContent.jsp(449,3) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f3.setAction("/addFlaggedMember.do");
          int _jspx_eval_html_005fform_005f3 = _jspx_th_html_005fform_005f3.doStartTag();
          if (_jspx_eval_html_005fform_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f3);
              // /subscriptionInfoContent.jsp(450,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f4.setProperty("subscriptionID");
              // /subscriptionInfoContent.jsp(450,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f4.setValue(((Integer)subID).toString() );
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fhidden_005f5(_jspx_th_html_005fform_005f3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fhidden_005f6(_jspx_th_html_005fform_005f3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t<textarea name=\"flagComment\" readonly=\"readonly\">");
              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_html_005fform_005f3, _jspx_page_context))
                return;
              out.write("</textarea>\t\t\t\t\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fsubmit_005f2(_jspx_th_html_005fform_005f3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f3);
          out.write("\r\n");
          out.write("            Note: Removing a customer hold flag will automatically <br/> remove him/her from \"need address normalization list\".            \r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<br/>\r\n");
          out.write("\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("          </td>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f4);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Receive Name</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receiveFirstName );
      out.write(' ');
      out.print( (String)receiveLastName );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f5 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f5.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f5.setParent(null);
      // /subscriptionInfoContent.jsp(477,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f5.setPermission(InventoryPermissions.EDIT_CUSTOMER_PERSONAL.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f5 = _jspx_th_govojo_005fdisplayPermissions_005f5.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("          <td>\r\n");
          out.write("\r\n");
          out.write("            <FORM ACTION=\"");
          if (_jspx_meth_html_005frewrite_005f2(_jspx_th_govojo_005fdisplayPermissions_005f5, _jspx_page_context))
            return;
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"submit\" VALUE=\"EDIT this name\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
          out.print( ((Integer)subID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"customerID\" VALUE=\"");
          out.print( ((Integer)receiveID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("            </FORM>\r\n");
          out.write("\r\n");
          out.write("          </td>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f5);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Email Address</td>\r\n");
      out.write("\r\n");
      out.write("          <td><a href=\"mailto:");
      out.print( (String)receiveEmail );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receiveEmail );
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f6 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f6.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f6.setParent(null);
      // /subscriptionInfoContent.jsp(507,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f6.setPermission(InventoryPermissions.EDIT_CUSTOMER_PERSONAL.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f6 = _jspx_th_govojo_005fdisplayPermissions_005f6.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("          <th rowspan=\"1\" align=\"left\">\r\n");
          out.write("\r\n");
          out.write("            <FORM ACTION=\"");
          if (_jspx_meth_html_005frewrite_005f3(_jspx_th_govojo_005fdisplayPermissions_005f6, _jspx_page_context))
            return;
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"submit\" VALUE=\"EDIT Identity\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"customerID\" VALUE=\"");
          out.print( ((Integer)receiveID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("            </FORM>\r\n");
          out.write("\r\n");
          out.write("          </th>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f6);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Login</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receiveLogin );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Password</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receivePassword );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          <td rowspan=\"1\" align=\"left\">\r\n");
      out.write("\r\n");
      out.write("            <form name=\"logonBean\" method=\"POST\" action=\"http://gameaccess.ca/logon.do\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"customerType\" value=\"existing\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"userName\" maxlength=\"100\" value=\"");
      out.print( (String)receiveLogin );
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"password\" maxlength=\"100\" value=\"");
      out.print( (String)receivePassword );
      out.write("\">\r\n");
      out.write("\t\t\t\t<INPUT TYPE=\"submit\" VALUE=\"Log customer in\">\r\n");
      out.write("\t        </form>\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Phone</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)receivePhone );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- ================================= KTPL (language & console info ============================= -->\r\n");
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write("\r\n");
      out.write(" \t\t <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Language</td>\r\n");
      out.write("\r\n");
      out.write("          ");
      if (_jspx_meth_logic_005fequal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("           ");
      if (_jspx_meth_logic_005fequal_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f7 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f7.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f7.setParent(null);
      // /subscriptionInfoContent.jsp(602,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f7.setPermission(InventoryPermissions.EDIT_CUSTOMER_PERSONAL.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f7 = _jspx_th_govojo_005fdisplayPermissions_005f7.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("          <th rowspan=\"3\" align=\"left\">\r\n");
          out.write("\r\n");
          out.write("          <!--  <FORM ACTION=\"/editLanguageAndOtherDetails.do\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"submit\" VALUE=\"EDIT Identity\">\r\n");
          out.write("\r\n");
          out.write("               <INPUT TYPE=\"hidden\" NAME=\"customerID\" VALUE=\"");
          out.print( ((Integer)receiveID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("            </FORM> -->\r\n");
          out.write("\r\n");
          out.write("          </th>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f7);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Heard From</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( (String)heardAboutUs );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>Country</td>\r\n");
      out.write("        <td>");
      out.print(silverCountry );
      out.write("  </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Consoles Owned</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f1.setParent(null);
      // /subscriptionInfoContent.jsp(642,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setId("console");
      // /subscriptionInfoContent.jsp(642,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setName("consolesOwned");
      // /subscriptionInfoContent.jsp(642,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setType("java.lang.String");
      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.String console = null;
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f1.doInitBody();
        }
        console = (java.lang.String) _jspx_page_context.findAttribute("console");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          out.print( Console.getConsoleNameFromID(Integer.parseInt(console)) );
          out.write("<br>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
          console = (java.lang.String) _jspx_page_context.findAttribute("console");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--Start 09/09/2010 MJGP -->\r\n");
      out.write("\t\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f1.setParent(null);
      // /subscriptionInfoContent.jsp(653,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fpresent_005f1.setName("avsInformation");
      int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\r\n");
          out.write("\t          <td>Avs Information</td>\r\n");
          out.write("\t\r\n");
          out.write("\t          <td>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t          </td>\r\n");
          out.write("\t\t\t  \r\n");
          out.write("\t\t\t  <td>\r\n");
          out.write("\t\t\t  \t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t\t\tdocument.write(getAvsInformation('");
          out.print(request.getAttribute("avsInformation"));
          out.write("'));\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\t\t\t  </td>\r\n");
          out.write("\t        </tr>\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
      out.write("\r\n");
      out.write("\t    ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f2 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f2.setParent(null);
      // /subscriptionInfoContent.jsp(671,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fpresent_005f2.setName("cvdInformation");
      int _jspx_eval_logic_005fpresent_005f2 = _jspx_th_logic_005fpresent_005f2.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t    <tr>\r\n");
          out.write("\t\r\n");
          out.write("\t          <td>Cvd Information</td>\r\n");
          out.write("\t\r\n");
          out.write("\t          <td>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fpresent_005f2, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t          </td>\r\n");
          out.write("\t\t\t  \r\n");
          out.write("\t\t\t  <td>\r\n");
          out.write("\t\t\t  \t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t\t\tdocument.write(getCvdInformation('");
          out.print(request.getAttribute("cvdInformation"));
          out.write("'));\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\t\t\t  </td>\r\n");
          out.write("\t        </tr>\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
      out.write("\r\n");
      out.write("\t    <!--End 09/09/2010 MJGP -->\r\n");
      out.write("\t\t\r\n");
      out.write("        <!-- ================================= KTPL ) ============================= -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   <table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("        <td colspan=2>\r\n");
      out.write("\r\n");
      out.write("                <b>PURCHASING CUSTOMER</b>\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Customer ID</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( ((Integer)purchaseID).toString());
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t  <td>Full Name</td>\r\n");
      out.write("\r\n");
      out.write("\t  <td>");
      out.print( (String)purchaseFirstName );
      out.write(' ');
      out.print( (String)purchaseLastName );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("   \r\n");
      out.write("   <br><br>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("                <b>Game In Fast Return</b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("       ");
      out.print( (fastReturnedGame == null || fastReturnedGame.length() == 0)?"NIL":fastReturnedGame);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("     \t <td>\r\n");
      out.write("                <b>In Fast Return since</b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("      ");
      out.print( (fastReturnedDate == null || fastReturnedDate.length() == 0)?"NIL":fastReturnedDate);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t<td onclick=\"this.getElementsByTagName('img')[0].style.display = 'none'; this.getElementsByTagName('div')[0].style.display = 'inline'; document.getElementById('fastReturnSwitchGo').style.display='block';\">\r\n");
      out.write("                <img src=\"images/switchFastReturn.jpeg\" style=\"width:25; height: 20; border: 0; cursor: pointer;\" />   \r\n");
      out.write("                <div id=\"fastReturnSwitchDiv\" style=\"display:none;\">\r\n");
      out.write("                <select id=\"queueToBeSwitched\" style=\"background-color: cyan; color:#000FFF; font-size:13; width: 400px;\"/>\r\n");
      out.write("                <option value=\"0\">Please select a game to replace the one in fast return</option>\r\n");
      out.write("                \r\n");
      out.write("                ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f2.setParent(null);
      // /subscriptionInfoContent.jsp(764,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setName("custQueue");
      // /subscriptionInfoContent.jsp(764,16) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setId("queueItem");
      // /subscriptionInfoContent.jsp(764,16) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setScope("request");
      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object queueItem = null;
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f2.doInitBody();
        }
        queueItem = (java.lang.Object) _jspx_page_context.findAttribute("queueItem");
        do {
          out.write("\r\n");
          out.write("                \r\n");
          out.write("                ");
          if (_jspx_meth_logic_005fequal_005f2(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                \r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
          queueItem = (java.lang.Object) _jspx_page_context.findAttribute("queueItem");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
      out.write("\r\n");
      out.write("                <option value=\"-1\">Delete game currently in fast return</option>\r\n");
      out.write("                </select>                \r\n");
      out.write("        \t\t</div>                             \r\n");
      out.write("        </td>\r\n");
      out.write("        \r\n");
      out.write("        <td id=\"fastReturnSwitchGo\" style=\"display: none;\">\r\n");
      out.write("        <img src=\"images/go.gif\" style=\"width: 25; height: 25; border: 0; cursor: pointer;\" \r\n");
      out.write("        onclick=\"if(document.getElementById('queueToBeSwitched').value != 0){document.location='switchFastReturnGame.do?subID='+ '");
      out.print(subID );
      out.write("' + '&queueToBeSwitched=' + document.getElementById('queueToBeSwitched').value; }\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        \r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>\r\n");
      out.write("                <b>Reserved Game</b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("\t\t\t       ");
      out.print( (reservedGame == null || reservedGame.length() == 0)?"NIL":reservedGame);
      out.write("\t \r\n");
      out.write("        </td>\r\n");
      out.write("       \t<td>\r\n");
      out.write("                <b>Reserved since</b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("      ");
      out.print( (reservedDate == null || reservedDate.length() == 0)?"NIL":reservedDate);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("                <b>Position</b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("      ");
      out.print( (reservedGame == null || reservedGame.length() == 0)?"NIL":ReservedGameQueue.getPositionInReservationQueue((Integer)receiveID));
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("         <tr>\r\n");
      out.write("          <td>\r\n");
      out.write("                <b>Released Game's </b>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("\t\t\t       ");
      out.print( countReleasedGames);
      out.write("\t \r\n");
      out.write("        </td>\r\n");
      out.write("       \t\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("   </table>\r\n");
      out.write("   <br>\r\n");
      out.write("   <br>\r\n");
      out.write("   \r\n");
      out.write("   ");

   boolean isLocalPickup = (request.getAttribute("flaggedMemberLP") != null); 
   String localPickupStatus = "No";   
   String flagActionType="Add";
   if(isLocalPickup == true){
	   localPickupStatus = "Yes";
	   flagActionType = "Remove";
   }
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" \t<table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("\t<tr >\r\n");
      out.write("\t\t<td><b>Is local pickup customer?</b> ");
      out.print(localPickupStatus );
      out.write(" --> </td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f4 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f4.setParent(null);
      // /subscriptionInfoContent.jsp(833,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f4.setAction("/addFlaggedMember.do");
      // /subscriptionInfoContent.jsp(833,2) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f4.setOnsubmit("return confirm('Are you sure you want to do this action?');");
      int _jspx_eval_html_005fform_005f4 = _jspx_th_html_005fform_005f4.doStartTag();
      if (_jspx_eval_html_005fform_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f4);
          // /subscriptionInfoContent.jsp(834,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f7.setProperty("subscriptionID");
          // /subscriptionInfoContent.jsp(834,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f7.setValue(((Integer)subID).toString() );
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_005fhidden_005f8(_jspx_th_html_005fform_005f4, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f4);
          // /subscriptionInfoContent.jsp(836,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f9.setProperty("flagActionType");
          // /subscriptionInfoContent.jsp(836,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f9.setValue(flagActionType );
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\t\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_005fhidden_005f10(_jspx_th_html_005fform_005f4, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          //  html:submit
          org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f3 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
          _jspx_th_html_005fsubmit_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fsubmit_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f4);
          // /subscriptionInfoContent.jsp(838,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fsubmit_005f3.setValue(flagActionType );
          int _jspx_eval_html_005fsubmit_005f3 = _jspx_th_html_005fsubmit_005f3.doStartTag();
          if (_jspx_th_html_005fsubmit_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f3);
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction.reuse(_jspx_th_html_005fform_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005faction.reuse(_jspx_th_html_005fform_005f4);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>  \r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("   <br>\r\n");
      out.write("   <br>\r\n");
      out.write("   \r\n");
      out.write("   <table border=\"1\"  >\r\n");
      out.write("\r\n");
      out.write("\t<tr >\r\n");
      out.write("\t\t<th width=\"5%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"5%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Payment Method</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"10%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order Date</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<th width=\"10%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"10%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Fullfilled Date</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f3.setParent(null);
      // /subscriptionInfoContent.jsp(869,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setId("purchaseRequests");
      // /subscriptionInfoContent.jsp(869,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setName("orderHistoryList");
      // /subscriptionInfoContent.jsp(869,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setScope("request");
      // /subscriptionInfoContent.jsp(869,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setType("govojo.db.PurchaseOrder");
      int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.PurchaseOrder purchaseRequests = null;
        if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f3.doInitBody();
        }
        purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<tr >\r\n");
          out.write("\t\t\t\t<td bgcolor=\"#E3E3E3\" align = \"center\" width=\"10%\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\" >");
          if (_jspx_meth_html_005flink_005f2(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td bgcolor=\"#E3E3E3\" align = \"center\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\" >\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f3(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f4(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td bgcolor=\"#E3E3E3\" align = \"center\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\" >");
          if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<td bgcolor=\"#E3E3E3\" align = \"center\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\" >");
          if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td bgcolor=\"#E3E3E3\" align = \"center\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
          purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function getAjax(){\r\n");
      out.write("   \r\n");
      out.write("document.getElementById('inventoryImg').innerHTML = '<b>Inventory</b><img id=\"submitImage\" style=\"border:0;width:20;height:15;\" name=\"submitImage\" src=\"images/ajax_roller.gif\" alt=\"...\">';\r\n");
      out.write("    $(document).ready(function()\r\n");
      out.write("      {\r\n");
      out.write("      \r\n");
      out.write("        $.get('getGamesInInventory.jsp?cu_id=");
      out.print(purchaseID);
      out.write("'+'&time='+ new Date().getTime(), function(d){\r\n");
      out.write("        \r\n");
      out.write("        //force IE to parse the data as xml\r\n");
      out.write("        if ($.browser.msie && typeof d == \"string\") {            \r\n");
      out.write("                data = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n");
      out.write("                data.async = false;\r\n");
      out.write("                data.loadXML(d);    \r\n");
      out.write("                \r\n");
      out.write("                var games = data.getElementsByTagName('game');\r\n");
      out.write("        \r\n");
      out.write("\t\t\t    for (i=0; i < games.length; i++)\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        var idIE = games[i].getAttribute('id');\r\n");
      out.write("\t\t\t        var inStockIE = games[i].getAttribute('inStock');\r\n");
      out.write("\t\t\t        var queueIDIE = games[i].getAttribute('queueID');\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t         var html = '';        \r\n");
      out.write("\t\t\t        html +=  '<span>' + inStockIE + '</span>';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(queueIDIE).innerHTML=html;\r\n");
      out.write("\t\t\t       \r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t                \r\n");
      out.write("            } else {            \r\n");
      out.write("                data = d;\r\n");
      out.write("                 $(data).find('game').each(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t        var $game = $(this); \r\n");
      out.write("\t\t        var gd_id = $game.attr(\"id\");            \r\n");
      out.write("\t\t        var inStock = $game.attr('inStock');\r\n");
      out.write("\t\t        var queueID = $game.attr('queueID');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        var html = '';        \r\n");
      out.write("\t\t        html +=  '<span>' + inStock + '</span>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdocument.getElementById(queueID).innerHTML=html;\r\n");
      out.write("\t\t\r\n");
      out.write("        \t});             \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("document.getElementById('inventoryImg').innerHTML = '<b>Inventory</b><img  src=\"images/right.gif\" style=\"{width: 20px;height: 15px;cursor: pointer;}\" onclick=\"getAjax();\">';                \r\n");
      out.write("       \r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<table border=1 id=\"queueTable\">\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Queue ID</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Customer Name</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Customer ID</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Priority</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Console</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Status</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Game Name</b></td>\r\n");
      out.write("     \r\n");
      out.write("     <td><b>Date Created</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Date Sent</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Date Returned</b></td>\r\n");
      out.write("     \r\n");
      out.write("     <td id=\"inventoryImg\"><b>Inventory</b><img  src=\"images/right.gif\" style=\"{width: 20px;height: 15px;cursor: pointer;}\" onclick=\"getAjax();\"/></td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f4.setParent(null);
      // /subscriptionInfoContent.jsp(991,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setName("custQueue");
      // /subscriptionInfoContent.jsp(991,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setId("queueItem");
      // /subscriptionInfoContent.jsp(991,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setScope("request");
      int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object queueItem = null;
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f4.doInitBody();
        }
        queueItem = (java.lang.Object) _jspx_page_context.findAttribute("queueItem");
        do {
          out.write("\r\n");
          out.write("  ");
          //  bean:define
          java.lang.Object qID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f37 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f37.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /subscriptionInfoContent.jsp(992,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setId("qID");
          // /subscriptionInfoContent.jsp(992,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setName("queueItem");
          // /subscriptionInfoContent.jsp(992,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f37.setProperty("queueID");
          int _jspx_eval_bean_005fdefine_005f37 = _jspx_th_bean_005fdefine_005f37.doStartTag();
          qID = (java.lang.Object) _jspx_page_context.findAttribute("qID");
          if (_jspx_th_bean_005fdefine_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
            return;
          }
          qID = (java.lang.Object) _jspx_page_context.findAttribute("qID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f37);
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("            <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("            <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <!-- ");
          if (_jspx_meth_html_005flink_005f3(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("           -->\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("      \r\n");
          out.write("      <td bgcolor=\"#E3E3E3\" onclick=\"this.getElementsByTagName('span')[0].style.display='block';\">            \r\n");
          out.write("            <span style=\"display: none;\">\r\n");
          out.write("            \t");
          if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            </span>\r\n");
          out.write("            <span/>\r\n");
          out.write("      </td>  \r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("            <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("            <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("      \r\n");
          out.write("     \r\n");
          out.write("      <td bgcolor=\"#E3E3E3\" id=\"");
          out.print(qID );
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("            <font color=\"black\"></font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
          queueItem = (java.lang.Object) _jspx_page_context.findAttribute("queueItem");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");

int singleTransArrayLength = (request.getAttribute("singleTransArrayLength") != null)
							?(Integer) (request.getAttribute("singleTransArrayLength"))
							:0;
singleTransArrayLength = (singleTransArrayLength >=2)?2:singleTransArrayLength;

int recurTransArrayLength = (request.getAttribute("recurTransArrayLength") != null)
							?(Integer) (request.getAttribute("recurTransArrayLength"))
							:0;
recurTransArrayLength = (recurTransArrayLength >=2)?2:recurTransArrayLength;
							

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\t\r\n");
      out.write("\t.slide_wrapper { width: 480px;}\r\n");
      out.write("\t.slider {overflow: hidden; }\r\n");
      out.write("\t.slider_menu { padding: 5px; background: #FFC; color: #fff; font-weight: bold;}\r\n");
      out.write("\t.slider_menu a { color: #000; }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("\tvar sliderHeightSingle = \"");
      out.print(170*singleTransArrayLength + 20);
      out.write("\" + \"px\";\t\r\n");
      out.write("\tvar sliderHeightRecur = \"");
      out.print(150*recurTransArrayLength + 20);
      out.write("\" + \"px\";\t\r\n");
      out.write("\tvar counter = 0;\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('.slide_wrapper').each(function () {\r\n");
      out.write("\t\t\t\t\tvar current = $(this);\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar currentSlider = current.find('.slider');\r\n");
      out.write("\t\t\t\t\tvar currentSliderMenu = $(this).find('.slider_menu');\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar initialHeight;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcurrentSlider.attr(\"box_h\", current.height());\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(counter == 0){\r\n");
      out.write("\t\t\t\t\t\tinitialHeight = sliderHeightSingle;\r\n");
      out.write("\t\t\t\t\t\tcounter++\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tinitialHeight = sliderHeightRecur;\r\n");
      out.write("\t\t\t\t\t}\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcurrentSlider.css(\"height\", initialHeight);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcurrentSliderMenu.html('<a href=\"javascript:void(0)\">Show More</a>');\r\n");
      out.write("\t\t\t\t\tcurrentSliderMenu.find('a').click(function() { openSlider(currentSlider, currentSliderMenu, initialHeight) });\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t );\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction openSlider(toto, totoMenu, initialHeight)\r\n");
      out.write("\t{\t\r\n");
      out.write("\t\tvar open_height = toto.attr(\"box_h\") + \"px\";\t\t\t\t\r\n");
      out.write("\t\ttoto.animate({\"height\": open_height}, {duration: \"slow\" });\t\t\t\t\r\n");
      out.write("\t\ttotoMenu.html('<a href=\"javascript:void(0)\">Collapse</a>');\t\t\r\n");
      out.write("\t\ttotoMenu.find('a').click(function() { closeSlider(toto, totoMenu, initialHeight) });\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closeSlider(toto, totoMenu, initialHeight)\r\n");
      out.write("\t{\t\r\n");
      out.write("\t\ttoto.animate({\"height\": initialHeight}, {duration: \"slow\" });\t\t\r\n");
      out.write("\t\ttotoMenu.html('<a href=\"javascript:void(0)\">Show More</a>');\r\n");
      out.write("\t\ttotoMenu.find('a').click(function() { openSlider(toto, totoMenu, initialHeight) });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"slide_wrapper\">\r\n");
      out.write("<div class=\"slider\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <table border=1 cellpadding=3 cellspacing=0>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("\r\n");
      out.write("       <td colspan=2> \r\n");
      out.write("\r\n");
      out.write("         <b> Single Transaction Information</b>\r\n");
      out.write("\r\n");
      out.write("       </td>\r\n");
      out.write("\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("     ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f5 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f5.setParent(null);
      // /subscriptionInfoContent.jsp(1174,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setName("singleTransArray");
      // /subscriptionInfoContent.jsp(1174,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setId("singleTrans");
      // /subscriptionInfoContent.jsp(1174,5) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f5.setScope("request");
      int _jspx_eval_logic_005fiterate_005f5 = _jspx_th_logic_005fiterate_005f5.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object singleTrans = null;
        if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f5.doInitBody();
        }
        singleTrans = (java.lang.Object) _jspx_page_context.findAttribute("singleTrans");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("     \r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Transaction ID\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f22(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("     \r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Customer ID\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f23(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Status\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("         ");
          if (_jspx_meth_bean_005fwrite_005f24(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("         ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f8 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f8.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /subscriptionInfoContent.jsp(1228,9) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f8.setPermission(InventoryPermissions.REFUND_CUSTOMER.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f8 = _jspx_th_govojo_005fdisplayPermissions_005f8.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("         ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f8);
              // /subscriptionInfoContent.jsp(1230,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEqual_005f0.setName("singleTrans");
              // /subscriptionInfoContent.jsp(1230,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEqual_005f0.setProperty("typeID");
              // /subscriptionInfoContent.jsp(1230,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEqual_005f0.setValue(Integer.toString(SingleTransactionType.SIGNUP_AUTHORIZATION));
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("         ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /subscriptionInfoContent.jsp(1232,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f5.setName("singleTrans");
                  // /subscriptionInfoContent.jsp(1232,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f5.setProperty("status");
                  // /subscriptionInfoContent.jsp(1232,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f5.setValue("Complete");
                  int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("           ");
                      //  html:form
                      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f5 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
                      _jspx_th_html_005fform_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fform_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                      // /subscriptionInfoContent.jsp(1234,11) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_html_005fform_005f5.setAction("/goRefund.do");
                      int _jspx_eval_html_005fform_005f5 = _jspx_th_html_005fform_005f5.doStartTag();
                      if (_jspx_eval_html_005fform_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("               ");
                          if (_jspx_meth_html_005fhidden_005f11(_jspx_th_html_005fform_005f5, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("               <input type=\"hidden\" name=\"transactionID\" value=\"");
                          if (_jspx_meth_bean_005fwrite_005f25(_jspx_th_html_005fform_005f5, _jspx_page_context))
                            return;
                          out.write("\">\r\n");
                          out.write("\r\n");
                          out.write("               <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
                          out.print( ((Integer)subID).toString());
                          out.write("\">\r\n");
                          out.write("\r\n");
                          out.write("               ");
                          if (_jspx_meth_html_005fsubmit_005f4(_jspx_th_html_005fform_005f5, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("           ");
                          int evalDoAfterBody = _jspx_th_html_005fform_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_html_005fform_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f5);
                      out.write("\r\n");
                      out.write("\r\n");
                      out.write("         ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("         ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
              out.write("\r\n");
              out.write("\r\n");
              out.write("         ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f8);
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Amount\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f26(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("          Sales Tax\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_bean_005fwrite_005f27(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          //  bean:define
          java.lang.String singleTransTypeID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f38 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f38.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
          // /subscriptionInfoContent.jsp(1296,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setId("singleTransTypeID");
          // /subscriptionInfoContent.jsp(1296,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setName("singleTrans");
          // /subscriptionInfoContent.jsp(1296,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setProperty("typeID");
          // /subscriptionInfoContent.jsp(1296,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f38.setType("java.lang.String");
          int _jspx_eval_bean_005fdefine_005f38 = _jspx_th_bean_005fdefine_005f38.doStartTag();
          singleTransTypeID = (java.lang.String) _jspx_page_context.findAttribute("singleTransTypeID");
          if (_jspx_th_bean_005fdefine_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
            return;
          }
          singleTransTypeID = (java.lang.String) _jspx_page_context.findAttribute("singleTransTypeID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f38);
          out.write("\r\n");
          out.write("\r\n");


SingleTransactionType singleTransType = new SingleTransactionType();

singleTransType.selectFromID(Integer.parseInt(singleTransTypeID));

String type = singleTransType.getName();


          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Charge Type\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          out.print(type);
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Comment\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f28(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Timestamp\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f29(_jspx_th_logic_005fiterate_005f5, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td colspan=2 bgcolor=\"#003366\">\r\n");
          out.write("\r\n");
          out.write("       &nbsp;&nbsp;\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f5.doAfterBody();
          singleTrans = (java.lang.Object) _jspx_page_context.findAttribute("singleTrans");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f5);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f5);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   </table>\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"slider_menu\">\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"slide_wrapper\">\r\n");
      out.write("<div class=\"slider\">\r\n");
      out.write("\r\n");
      out.write("   <table border=1 cellpadding=3 cellspacing=0>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("\r\n");
      out.write("       <td colspan=2> \r\n");
      out.write("\r\n");
      out.write("         <b> Recurring Transaction Information</b>\r\n");
      out.write("\r\n");
      out.write("       </td>\r\n");
      out.write("\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("     ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f6 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f6.setParent(null);
      // /subscriptionInfoContent.jsp(1413,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setName("recurTransArray");
      // /subscriptionInfoContent.jsp(1413,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setId("recurTrans");
      // /subscriptionInfoContent.jsp(1413,5) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f6.setScope("request");
      int _jspx_eval_logic_005fiterate_005f6 = _jspx_th_logic_005fiterate_005f6.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object recurTrans = null;
        if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f6.doInitBody();
        }
        recurTrans = (java.lang.Object) _jspx_page_context.findAttribute("recurTrans");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("         ");
          //  bean:define
          java.lang.Object statusName = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f39 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f39.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /subscriptionInfoContent.jsp(1415,9) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setId("statusName");
          // /subscriptionInfoContent.jsp(1415,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setName("recurTrans");
          // /subscriptionInfoContent.jsp(1415,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f39.setProperty("status");
          int _jspx_eval_bean_005fdefine_005f39 = _jspx_th_bean_005fdefine_005f39.doStartTag();
          statusName = (java.lang.Object) _jspx_page_context.findAttribute("statusName");
          if (_jspx_th_bean_005fdefine_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
            return;
          }
          statusName = (java.lang.Object) _jspx_page_context.findAttribute("statusName");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f39);
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Subscription ID\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f30(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Status\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("         ");
          if (_jspx_meth_bean_005fwrite_005f31(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("         ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f9 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f9.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
          // /subscriptionInfoContent.jsp(1449,9) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f9.setPermission(InventoryPermissions.REFUND_CUSTOMER.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f9 = _jspx_th_govojo_005fdisplayPermissions_005f9.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("         ");
 if(statusName.equals("Complete")){ 
              out.write("\r\n");
              out.write("\r\n");
              out.write("           ");
              //  html:form
              org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f6 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
              _jspx_th_html_005fform_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fform_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f9);
              // /subscriptionInfoContent.jsp(1455,11) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fform_005f6.setAction("/goRefund.do");
              int _jspx_eval_html_005fform_005f6 = _jspx_th_html_005fform_005f6.doStartTag();
              if (_jspx_eval_html_005fform_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("               ");
                  if (_jspx_meth_html_005fhidden_005f12(_jspx_th_html_005fform_005f6, _jspx_page_context))
                    return;
                  out.write(" \r\n");
                  out.write("\r\n");
                  out.write("               <input type=\"hidden\" name=\"transactionID\" value=\"");
                  if (_jspx_meth_bean_005fwrite_005f32(_jspx_th_html_005fform_005f6, _jspx_page_context))
                    return;
                  out.write("\"> \r\n");
                  out.write("\r\n");
                  out.write("\t       <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
                  out.print( ((Integer)subID).toString());
                  out.write("\">\r\n");
                  out.write("\r\n");
                  out.write("               ");
                  if (_jspx_meth_html_005fsubmit_005f5(_jspx_th_html_005fform_005f6, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("           ");
                  int evalDoAfterBody = _jspx_th_html_005fform_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_html_005fform_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f6);
              out.write("\r\n");
              out.write("\r\n");
              out.write("         ");
 } 
              out.write("\r\n");
              out.write("\r\n");
              out.write("         ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f9);
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Amount\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f33(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("          Sales Tax\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_bean_005fwrite_005f34(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Cycle\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f35(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Comment\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f36(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           Timestamp\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("       <td>\r\n");
          out.write("\r\n");
          out.write("           ");
          if (_jspx_meth_bean_005fwrite_005f37(_jspx_th_logic_005fiterate_005f6, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("\r\n");
          out.write("       <td colspan=2 bgcolor=\"#003366\">\r\n");
          out.write("\r\n");
          out.write("       &nbsp;&nbsp;\r\n");
          out.write("\r\n");
          out.write("       </td>\r\n");
          out.write("\r\n");
          out.write("     </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f6.doAfterBody();
          recurTrans = (java.lang.Object) _jspx_page_context.findAttribute("recurTrans");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f6);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f6);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"slider_menu\">\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f7 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f7.setParent(null);
      // /subscriptionInfoContent.jsp(1598,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f7.setAction("addCustServLogEntry.do");
      // /subscriptionInfoContent.jsp(1598,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f7.setName("custServLogEntryBean");
      // /subscriptionInfoContent.jsp(1598,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f7.setType("com.govojo.inv.formbeans.CustServLogEntryBean");
      int _jspx_eval_html_005fform_005f7 = _jspx_th_html_005fform_005f7.doStartTag();
      if (_jspx_eval_html_005fform_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("\r\n");
          out.write("   <td colspan=\"2\">\r\n");
          out.write("\r\n");
          out.write("   <b>Customer Service Notes:</b> (300 characters max)\r\n");
          out.write("\r\n");
          out.write("   </td>\r\n");
          out.write("\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("\r\n");
          out.write("   <td width=\"300\">\r\n");
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_html_005ftextarea_005f1(_jspx_th_html_005fform_005f7, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("   </td>\r\n");
          out.write("\r\n");
          out.write("   <td>\r\n");
          out.write("\r\n");
          out.write("   <div align=\"center\">");
          if (_jspx_meth_html_005fsubmit_005f6(_jspx_th_html_005fform_005f7, _jspx_page_context))
            return;
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("   </td>\r\n");
          out.write("\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f7);
          // /subscriptionInfoContent.jsp(1626,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f13.setProperty("typeID");
          // /subscriptionInfoContent.jsp(1626,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f13.setValue(Integer.toString(CustServLogType.GENERAL));
          int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
          if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
          out.write("\r\n");
          out.write("\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f7);
          // /subscriptionInfoContent.jsp(1628,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f14.setProperty("subID");
          // /subscriptionInfoContent.jsp(1628,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f14.setValue(((Integer)subID).toString());
          int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
          if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_html_005fform_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction.reuse(_jspx_th_html_005fform_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftype_005fname_005faction.reuse(_jspx_th_html_005fform_005f7);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=1>\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Date</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Customer Representative</b></td>\r\n");
      out.write("\r\n");
      out.write("     <td><b>Description</b></td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f7 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f7.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f7.setParent(null);
      // /subscriptionInfoContent.jsp(1652,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setName("custServLogArray");
      // /subscriptionInfoContent.jsp(1652,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setId("custServLog");
      // /subscriptionInfoContent.jsp(1652,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f7.setScope("request");
      int _jspx_eval_logic_005fiterate_005f7 = _jspx_th_logic_005fiterate_005f7.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object custServLog = null;
        if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f7.doInitBody();
        }
        custServLog = (java.lang.Object) _jspx_page_context.findAttribute("custServLog");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f38(_jspx_th_logic_005fiterate_005f7, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f39(_jspx_th_logic_005fiterate_005f7, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("      <td bgcolor=\"#E3E3E3\">\r\n");
          out.write("\r\n");
          out.write("           <font color=\"black\">");
          if (_jspx_meth_bean_005fwrite_005f40(_jspx_th_logic_005fiterate_005f7, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("\r\n");
          out.write("      </td>\r\n");
          out.write("\r\n");
          out.write("    </tr>\r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f7.doAfterBody();
          custServLog = (java.lang.Object) _jspx_page_context.findAttribute("custServLog");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f7);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f7);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      if (_jspx_meth_logic_005fpresent_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!--  Fast return and reserve game services    -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("\t        <td colspan=3>\r\n");
      out.write("\r\n");
      out.write("    \t            <b>Special Services</b>\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("\t        <td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            <b>Service</b>\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            <b>Status</b>\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            <b>Expire Date</b>\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("\t        <td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            Fast Return\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            ");
      if (_jspx_meth_bean_005fwrite_005f43(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            ");
      if (_jspx_meth_bean_005fwrite_005f44(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td>\r\n");
      out.write("\r\n");
      out.write("        \t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f8 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f8.setParent(null);
      // /subscriptionInfoContent.jsp(1763,9) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f8.setAction("editFastReturnService.do");
      int _jspx_eval_html_005fform_005f8 = _jspx_th_html_005fform_005f8.doStartTag();
      if (_jspx_eval_html_005fform_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\r\n");
          out.write("             ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f8);
          // /subscriptionInfoContent.jsp(1767,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f15.setProperty("subscriptionID");
          // /subscriptionInfoContent.jsp(1767,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f15.setValue(((Integer)subID).toString());
          int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
          if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          if (_jspx_meth_html_005fsubmit_005f7(_jspx_th_html_005fform_005f8, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f8);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("         <tr>\r\n");
      out.write("\r\n");
      out.write("\t        <td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            Reserve Game\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            ");
      if (_jspx_meth_bean_005fwrite_005f45(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    \t            ");
      if (_jspx_meth_bean_005fwrite_005f46(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        \t<td>\r\n");
      out.write("\r\n");
      out.write("        \t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f9 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f9.setParent(null);
      // /subscriptionInfoContent.jsp(1801,9) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f9.setAction("editReserveGameService.do");
      int _jspx_eval_html_005fform_005f9 = _jspx_th_html_005fform_005f9.doStartTag();
      if (_jspx_eval_html_005fform_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f9);
          // /subscriptionInfoContent.jsp(1805,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f16.setProperty("subscriptionID");
          // /subscriptionInfoContent.jsp(1805,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f16.setValue(((Integer)subID).toString());
          int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
          if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          if (_jspx_meth_html_005fsubmit_005f8(_jspx_th_html_005fform_005f9, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f9);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td colspan=3>\r\n");
      out.write("    \t            <b>One year contract</b>\r\n");
      out.write("        \t</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td align=\"center\">\r\n");
      out.write("    \t            <b>Has a contract?</b>\r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("    \t            <b>Begining date</b>\r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("    \t            <b>End Date</b>\r\n");
      out.write("        \t</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td align=\"center\">\r\n");
      out.write("    \t      ");
      if (_jspx_meth_bean_005fwrite_005f47(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("    \t      ");
      if (_jspx_meth_bean_005fwrite_005f48(_jspx_page_context))
        return;
      out.write("      \r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t<td align=\"center\">\r\n");
      out.write("    \t      ");
      if (_jspx_meth_bean_005fwrite_005f49(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f1.setParent(null);
      // /subscriptionInfoContent.jsp(1852,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f1.setValue("0");
      // /subscriptionInfoContent.jsp(1852,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f1.setName("subOneYearContract");
      // /subscriptionInfoContent.jsp(1852,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f1.setProperty("contractStatusID");
      // /subscriptionInfoContent.jsp(1852,9) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f1.setScope("request");
      int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        \t<td>\r\n");
          out.write("        \t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f10 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
          // /subscriptionInfoContent.jsp(1854,9) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f10.setAction("editOneYearContractService.do");
          int _jspx_eval_html_005fform_005f10 = _jspx_th_html_005fform_005f10.doStartTag();
          if (_jspx_eval_html_005fform_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("             ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f10);
              // /subscriptionInfoContent.jsp(1855,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f17.setProperty("subscriptionID");
              // /subscriptionInfoContent.jsp(1855,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f17.setValue(((Integer)subID).toString());
              int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
              if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
              out.write("\r\n");
              out.write("             ");
              if (_jspx_meth_html_005fsubmit_005f9(_jspx_th_html_005fform_005f10, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          \t");
              int evalDoAfterBody = _jspx_th_html_005fform_005f10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f10);
          out.write("\r\n");
          out.write("        \t</td>\r\n");
          out.write("        \t");
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("   <table border=1 cellpadding=3 cellspacing = 0>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("        <td colspan=2>\r\n");
      out.write("\r\n");
      out.write("                <b>Subscription</b>\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Subscription ID</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( ((Integer)subID).toString());
      out.write("\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f10 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f10.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f10.setParent(null);
      // /subscriptionInfoContent.jsp(1883,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f10.setPermission(InventoryPermissions.PERFORM_RECURRING_CHARGE.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f10 = _jspx_th_govojo_005fdisplayPermissions_005f10.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("          <td>\r\n");
          out.write("\r\n");
          out.write("          ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f11 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f10);
          // /subscriptionInfoContent.jsp(1887,10) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f11.setAction("/confirmRecurringCharge.do");
          int _jspx_eval_html_005fform_005f11 = _jspx_th_html_005fform_005f11.doStartTag();
          if (_jspx_eval_html_005fform_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("              ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f11);
              // /subscriptionInfoContent.jsp(1889,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f18.setProperty("subscriptionID");
              // /subscriptionInfoContent.jsp(1889,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f18.setValue(((Integer)subID).toString());
              int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
              if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
              out.write("\r\n");
              out.write("\r\n");
              out.write("              ");
              if (_jspx_meth_html_005fsubmit_005f10(_jspx_th_html_005fform_005f11, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("          ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f11);
          out.write("\r\n");
          out.write("\r\n");
          out.write("          </td>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f10);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Partner</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("\t     ");
 

	     //Yes, code in the page what am I thinking...This is the easiest way though.

	        String partnerStr;

	        Referrals referral = Referrals.getReferralOfCustomer(((Integer)purchaseID).intValue(),null);

	        if(referral == null){

	    		Partner partner = new Partner();

				partner.selectFromID(((Integer)subPartnerID).intValue());    

	    		partnerStr = partner.getName();    

	        }

	        else{

	        	partnerStr = referral.getReferredByCustomerID()+"";

	        }

		

				out.print(partnerStr);  

             
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Trial Start Date</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( (String)subStartDateAsString );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Bill Date</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( request.getAttribute("subBillDate") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  govojo:displayPermissions
      com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f11 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
      _jspx_th_govojo_005fdisplayPermissions_005f11.setPageContext(_jspx_page_context);
      _jspx_th_govojo_005fdisplayPermissions_005f11.setParent(null);
      // /subscriptionInfoContent.jsp(1964,10) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_govojo_005fdisplayPermissions_005f11.setPermission(InventoryPermissions.EDIT_BILL_DATE.toString());
      int _jspx_eval_govojo_005fdisplayPermissions_005f11 = _jspx_th_govojo_005fdisplayPermissions_005f11.doStartTag();
      if (_jspx_eval_govojo_005fdisplayPermissions_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("          <td>\r\n");
          out.write("\r\n");
          out.write("          ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f12 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f11);
          // /subscriptionInfoContent.jsp(1968,10) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f12.setAction("editBillDate.do");
          int _jspx_eval_html_005fform_005f12 = _jspx_th_html_005fform_005f12.doStartTag();
          if (_jspx_eval_html_005fform_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("             <INPUT TYPE=\"submit\" VALUE=\"EDIT this bill date\">\r\n");
              out.write("\r\n");
              out.write("             <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
              out.print( ((Integer)subID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("          ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f12);
          out.write("\r\n");
          out.write("\r\n");
          out.write("          </td>\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_govojo_005fdisplayPermissions_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f11);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>Account Type</td>\r\n");
      out.write("          <td>");
      out.print(accType );
      out.write("</td>\r\n");
      out.write("           <td>\r\n");
      out.write("\r\n");
      out.write("         ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f13 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f13.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f13.setParent(null);
      // /subscriptionInfoContent.jsp(1987,9) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f13.setAction("/accountUpgrade.do");
      int _jspx_eval_html_005fform_005f13 = _jspx_th_html_005fform_005f13.doStartTag();
      if (_jspx_eval_html_005fform_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("             <INPUT TYPE=\"submit\" VALUE=\"Update Account\">\r\n");
          out.write("             <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
          out.print( ((Integer)subID).toString());
          out.write("\">\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f13);
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
if(accType.toString().equalsIgnoreCase("Platinum")){ 
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("        \t<td>Active Days</td>\r\n");
      out.write("           <td>");
      out.print(activePlatinumDays );
      out.write(" </td>\r\n");
      out.write("            <td>\r\n");
      out.write("         ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f14 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f14.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f14.setParent(null);
      // /subscriptionInfoContent.jsp(1999,9) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f14.setAction("/editActiveDays.do");
      int _jspx_eval_html_005fform_005f14 = _jspx_th_html_005fform_005f14.doStartTag();
      if (_jspx_eval_html_005fform_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("             <INPUT TYPE=\"submit\" VALUE=\"Edit Paltinum Active Days\">\r\n");
          out.write("             <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
          out.print( ((Integer)subID).toString());
          out.write("\">\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f14);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f14);
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("           \r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Free Days</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( request.getAttribute("subFreeDays") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("          ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f15 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f15.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f15.setParent(null);
      // /subscriptionInfoContent.jsp(2020,10) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f15.setAction("editFreeDays.do");
      int _jspx_eval_html_005fform_005f15 = _jspx_th_html_005fform_005f15.doStartTag();
      if (_jspx_eval_html_005fform_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("             <INPUT TYPE=\"submit\" VALUE=\"EDIT this Free Days\">\r\n");
          out.write("\r\n");
          out.write("             <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
          out.print( ((Integer)subID).toString());
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f15);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f15);
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("    </tr>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>End Date</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( (String)request.getAttribute("subDateEnded") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Expire Date</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( (String)request.getAttribute("subExpireDate") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Max Games Out</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( (String)request.getAttribute("maxGamesOut") );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("             ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f16 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f16.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f16.setParent(null);
      // /subscriptionInfoContent.jsp(2068,13) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f16.setAction("/getSubscriptionPlans.do");
      // /subscriptionInfoContent.jsp(2068,13) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f16.setMethod("POST");
      int _jspx_eval_html_005fform_005f16 = _jspx_th_html_005fform_005f16.doStartTag();
      if (_jspx_eval_html_005fform_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f16);
          // /subscriptionInfoContent.jsp(2070,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f19.setProperty("subscriptionID");
          // /subscriptionInfoContent.jsp(2070,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fhidden_005f19.setValue(((Integer)subID).toString());
          int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
          if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
          out.write("\r\n");
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_html_005fsubmit_005f11(_jspx_th_html_005fform_005f16, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f16);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f16);
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\t\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("          <td>Email Verified?</td>\r\n");
      out.write("\r\n");
      out.write("          <td>");
      out.print( (String)request.getAttribute("emailVerified") );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("          <td>\r\n");
      out.write("\r\n");
      out.write("             ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f6.setParent(null);
      // /subscriptionInfoContent.jsp(2092,13) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f6.setName("emailVerified");
      // /subscriptionInfoContent.jsp(2092,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f6.setValue("No");
      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f17 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f17.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /subscriptionInfoContent.jsp(2094,13) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f17.setAction("/sendVerificationEmail.do");
          int _jspx_eval_html_005fform_005f17 = _jspx_th_html_005fform_005f17.doStartTag();
          if (_jspx_eval_html_005fform_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f17);
              // /subscriptionInfoContent.jsp(2096,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f20.setProperty("customerID");
              // /subscriptionInfoContent.jsp(2096,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fhidden_005f20.setValue(((Integer)receiveID).toString());
              int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
              if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
              out.write("\r\n");
              out.write("\r\n");
              out.write("                ");
              if (_jspx_meth_html_005fsubmit_005f12(_jspx_th_html_005fform_005f17, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("             ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f17.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f17);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f17);
          out.write("\r\n");
          out.write("\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f6);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("        ");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f2.setParent(null);
      // /subscriptionInfoContent.jsp(2110,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f2.setName("subStatus");
      // /subscriptionInfoContent.jsp(2110,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f2.setValue(Integer.toString(SubscriptionStatus.CLOSED));
      int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f12 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f12.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
          // /subscriptionInfoContent.jsp(2112,8) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f12.setPermission(InventoryPermissions.UNSUBSCRIBE_CUSTOMER.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f12 = _jspx_th_govojo_005fdisplayPermissions_005f12.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t<tr>\r\n");
              out.write("\r\n");
              out.write("\t  <td colspan=2 align=center> \r\n");
              out.write("\r\n");
              out.write("\t    <FORM METHOD=\"LINK\" ACTION=\"");
              if (_jspx_meth_html_005frewrite_005f4(_jspx_th_govojo_005fdisplayPermissions_005f12, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"submit\" VALUE=\"Unsubscribe ");
              out.print( (String)receiveFirstName );
              out.write(' ');
              out.print( (String)receiveLastName );
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("\t       <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
              out.print( ((Integer)subID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("            </FORM>\r\n");
              out.write("\r\n");
              out.write("\t  </td>\r\n");
              out.write("\r\n");
              out.write("\t</tr>\r\n");
              out.write("\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f12);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      //  logic:notEqual
      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
      _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEqual_005f3.setParent(null);
      // /subscriptionInfoContent.jsp(2134,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f3.setName("subStatus");
      // /subscriptionInfoContent.jsp(2134,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEqual_005f3.setValue(Integer.toString(SubscriptionStatus.ACTIVE));
      int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
      if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          //  govojo:displayPermissions
          com.govojo.inv.tagsrc.DisplayPermissionsTag _jspx_th_govojo_005fdisplayPermissions_005f13 = (com.govojo.inv.tagsrc.DisplayPermissionsTag) _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.get(com.govojo.inv.tagsrc.DisplayPermissionsTag.class);
          _jspx_th_govojo_005fdisplayPermissions_005f13.setPageContext(_jspx_page_context);
          _jspx_th_govojo_005fdisplayPermissions_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
          // /subscriptionInfoContent.jsp(2136,8) name = permission type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_govojo_005fdisplayPermissions_005f13.setPermission(InventoryPermissions.REACTIVATE_SUBSCRIPTION.toString());
          int _jspx_eval_govojo_005fdisplayPermissions_005f13 = _jspx_th_govojo_005fdisplayPermissions_005f13.doStartTag();
          if (_jspx_eval_govojo_005fdisplayPermissions_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("        <tr>\r\n");
              out.write("\r\n");
              out.write("          <td colspan=2 align=center>\r\n");
              out.write("\r\n");
              out.write("            <FORM METHOD=\"LINK\" ACTION=\"");
              if (_jspx_meth_html_005frewrite_005f5(_jspx_th_govojo_005fdisplayPermissions_005f13, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"submit\" VALUE=\"Reactivate ");
              out.print( (String)receiveFirstName );
              out.write(' ');
              out.print( (String)receiveLastName );
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("               <INPUT TYPE=\"hidden\" NAME=\"subscriptionID\" VALUE=\"");
              out.print( ((Integer)subID).toString());
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("            </FORM>\r\n");
              out.write("\r\n");
              out.write("          </td>\r\n");
              out.write("\r\n");
              out.write("        </tr>\r\n");
              out.write("\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_govojo_005fdisplayPermissions_005f13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_govojo_005fdisplayPermissions_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fgovojo_005fdisplayPermissions_0026_005fpermission.reuse(_jspx_th_govojo_005fdisplayPermissions_005f13);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEqual_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /subscriptionInfoContent.jsp(262,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("alert");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f0);
    // /subscriptionInfoContent.jsp(268,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setPage("/viewCollectionsCharge.do");
    // /subscriptionInfoContent.jsp(268,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setParamName("subID");
    // /subscriptionInfoContent.jsp(268,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setParamId("subscriptionID");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("Collections Charge");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f1);
    // /subscriptionInfoContent.jsp(276,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f1.setPage("/collectionsLog.do");
    // /subscriptionInfoContent.jsp(276,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f1.setParamName("subID");
    // /subscriptionInfoContent.jsp(276,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f1.setParamId("subscriptionID");
    int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
    if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f1.doInitBody();
      }
      do {
        out.write("Collections Log");
        int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f0 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f2);
    // /subscriptionInfoContent.jsp(284,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f0.setPage("/deactivateCustomerAlerts.do");
    int _jspx_eval_html_005frewrite_005f0 = _jspx_th_html_005frewrite_005f0.doStartTag();
    if (_jspx_th_html_005frewrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /subscriptionInfoContent.jsp(317,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setValue("Manage");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f1 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f4);
    // /subscriptionInfoContent.jsp(419,27) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f1.setPage("/editAddress.do");
    int _jspx_eval_html_005frewrite_005f1 = _jspx_th_html_005frewrite_005f1.doStartTag();
    if (_jspx_th_html_005frewrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f2);
    // /subscriptionInfoContent.jsp(437,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setProperty("flag");
    // /subscriptionInfoContent.jsp(437,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setValue("2");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f2);
    // /subscriptionInfoContent.jsp(438,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setProperty("flagActionType");
    // /subscriptionInfoContent.jsp(438,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setValue("add");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f0 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f2);
    // /subscriptionInfoContent.jsp(439,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setProperty("flagComment");
    // /subscriptionInfoContent.jsp(439,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setValue("add comment here");
    // /subscriptionInfoContent.jsp(439,3) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setOnfocus("this.value=(this.value == 'add comment here')?'':this.value;");
    // /subscriptionInfoContent.jsp(439,3) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setOnblur("this.value=(this.value == '')?'add comment here':this.value;");
    int _jspx_eval_html_005ftextarea_005f0 = _jspx_th_html_005ftextarea_005f0.doStartTag();
    if (_jspx_th_html_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fvalue_005fproperty_005fonfocus_005fonblur_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f2);
    // /subscriptionInfoContent.jsp(440,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f1.setValue("Put customer on hold");
    int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
    if (_jspx_th_html_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f3);
    // /subscriptionInfoContent.jsp(451,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f5.setProperty("flag");
    // /subscriptionInfoContent.jsp(451,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f5.setValue("2");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f3);
    // /subscriptionInfoContent.jsp(452,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f6.setProperty("flagActionType");
    // /subscriptionInfoContent.jsp(452,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f6.setValue("remove");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f3);
    // /subscriptionInfoContent.jsp(453,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setName("flaggedMemberPOH");
    // /subscriptionInfoContent.jsp(453,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setProperty("comment");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f2 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f3);
    // /subscriptionInfoContent.jsp(454,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f2.setValue("Remove customer from hold");
    int _jspx_eval_html_005fsubmit_005f2 = _jspx_th_html_005fsubmit_005f2.doStartTag();
    if (_jspx_th_html_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f2 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f5);
    // /subscriptionInfoContent.jsp(481,26) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f2.setPage("/editCustomer.do");
    int _jspx_eval_html_005frewrite_005f2 = _jspx_th_html_005frewrite_005f2.doStartTag();
    if (_jspx_th_html_005frewrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f3 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f6);
    // /subscriptionInfoContent.jsp(511,26) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f3.setPage("/editOtherDetails.do");
    int _jspx_eval_html_005frewrite_005f3 = _jspx_th_html_005frewrite_005f3.doStartTag();
    if (_jspx_th_html_005frewrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent(null);
    // /subscriptionInfoContent.jsp(586,10) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setName("language");
    // /subscriptionInfoContent.jsp(586,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setValue("en");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("      \t\t <td>  \tEnglish  </td>\r\n");
        out.write("\r\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent(null);
    // /subscriptionInfoContent.jsp(594,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setName("language");
    // /subscriptionInfoContent.jsp(594,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setValue("fr");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("              <td> French </td>\r\n");
        out.write("\r\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    // /subscriptionInfoContent.jsp(660,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setName("avsInformation");
    // /subscriptionInfoContent.jsp(660,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setScope("request");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f2);
    // /subscriptionInfoContent.jsp(678,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setName("cvdInformation");
    // /subscriptionInfoContent.jsp(678,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setScope("request");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /subscriptionInfoContent.jsp(766,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setName("queueItem");
    // /subscriptionInfoContent.jsp(766,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setProperty("queueStatus");
    // /subscriptionInfoContent.jsp(766,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setValue("rented");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <option value=\"");
        if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write('(');
        if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write(")</option>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /subscriptionInfoContent.jsp(767,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setName("queueItem");
    // /subscriptionInfoContent.jsp(767,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setProperty("queueID");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /subscriptionInfoContent.jsp(767,82) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setName("queueItem");
    // /subscriptionInfoContent.jsp(767,82) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setProperty("gameName");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /subscriptionInfoContent.jsp(767,133) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("queueItem");
    // /subscriptionInfoContent.jsp(767,133) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("console");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f4);
    // /subscriptionInfoContent.jsp(835,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f8.setProperty("flag");
    // /subscriptionInfoContent.jsp(835,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f8.setValue("1");
    int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
    if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f4);
    // /subscriptionInfoContent.jsp(837,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f10.setProperty("flagComment");
    // /subscriptionInfoContent.jsp(837,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f10.setValue("Local pickup");
    int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
    if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(873,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setPage("/showPurchaseRequest.do");
    // /subscriptionInfoContent.jsp(873,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setParamId("orderID");
    // /subscriptionInfoContent.jsp(873,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setParamName("purchaseRequests");
    // /subscriptionInfoContent.jsp(873,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setParamProperty("ID");
    int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
    if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_html_005flink_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f2);
    // /subscriptionInfoContent.jsp(873,144) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(873,144) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("ID");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(877,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setValue("1");
    // /subscriptionInfoContent.jsp(877,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(877,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setProperty("paymentMethod");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tCredit Card\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(880,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setValue("2");
    // /subscriptionInfoContent.jsp(880,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(880,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setProperty("paymentMethod");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tPaypal\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(886,35) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(886,35) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("timestamp");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(890,35) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(890,35) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("grandTotal");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /subscriptionInfoContent.jsp(893,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("purchaseRequests");
    // /subscriptionInfoContent.jsp(893,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("fullFilledDate");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(997,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setName("queueItem");
    // /subscriptionInfoContent.jsp(997,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setProperty("queueID");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1003,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setName("queueItem");
    // /subscriptionInfoContent.jsp(1003,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setProperty("customerName");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1009,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setName("queueItem");
    // /subscriptionInfoContent.jsp(1009,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1015,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setName("queueItem");
    // /subscriptionInfoContent.jsp(1015,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setProperty("priority");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1021,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setName("queueItem");
    // /subscriptionInfoContent.jsp(1021,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setProperty("console");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1027,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setName("queueItem");
    // /subscriptionInfoContent.jsp(1027,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setProperty("queueStatus");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f3 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1033,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setHref("/showgame.do");
    // /subscriptionInfoContent.jsp(1033,16) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setParamName("queueItem");
    // /subscriptionInfoContent.jsp(1033,16) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setParamProperty("gameDescID");
    // /subscriptionInfoContent.jsp(1033,16) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setParamId("game");
    int _jspx_eval_html_005flink_005f3 = _jspx_th_html_005flink_005f3.doStartTag();
    if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                 ");
        if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_html_005flink_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("               ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_html_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_html_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f3);
    // /subscriptionInfoContent.jsp(1041,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setName("queueItem");
    // /subscriptionInfoContent.jsp(1041,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setProperty("gameName");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1047,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setName("queueItem");
    // /subscriptionInfoContent.jsp(1047,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setProperty("gameName");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1053,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setName("queueItem");
    // /subscriptionInfoContent.jsp(1053,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setProperty("gameCreatedDate");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1060,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setName("queueItem");
    // /subscriptionInfoContent.jsp(1060,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setProperty("gameSentDate");
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /subscriptionInfoContent.jsp(1066,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setName("queueItem");
    // /subscriptionInfoContent.jsp(1066,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setProperty("gameReceivedDate");
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1188,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1188,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setProperty("recurringTransID");
    int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
    if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f23 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1206,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1206,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f23 = _jspx_th_bean_005fwrite_005f23.doStartTag();
    if (_jspx_th_bean_005fwrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f24 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1226,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1226,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setProperty("status");
    int _jspx_eval_bean_005fwrite_005f24 = _jspx_th_bean_005fwrite_005f24.doStartTag();
    if (_jspx_th_bean_005fwrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f5);
    // /subscriptionInfoContent.jsp(1236,15) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f11.setProperty("validation");
    // /subscriptionInfoContent.jsp(1236,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f11.setValue("false");
    int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
    if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f25 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f5);
    // /subscriptionInfoContent.jsp(1238,64) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1238,64) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setProperty("recurringTransID");
    int _jspx_eval_bean_005fwrite_005f25 = _jspx_th_bean_005fwrite_005f25.doStartTag();
    if (_jspx_th_bean_005fwrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f4 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f5);
    // /subscriptionInfoContent.jsp(1242,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f4.setValue("Refund");
    int _jspx_eval_html_005fsubmit_005f4 = _jspx_th_html_005fsubmit_005f4.doStartTag();
    if (_jspx_th_html_005fsubmit_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f26 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1268,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1268,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setProperty("amount");
    int _jspx_eval_bean_005fwrite_005f26 = _jspx_th_bean_005fwrite_005f26.doStartTag();
    if (_jspx_th_bean_005fwrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f27 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1286,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1286,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setProperty("salesTax");
    int _jspx_eval_bean_005fwrite_005f27 = _jspx_th_bean_005fwrite_005f27.doStartTag();
    if (_jspx_th_bean_005fwrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f28 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1338,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1338,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setProperty("comment");
    int _jspx_eval_bean_005fwrite_005f28 = _jspx_th_bean_005fwrite_005f28.doStartTag();
    if (_jspx_th_bean_005fwrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f29 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f5);
    // /subscriptionInfoContent.jsp(1356,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setName("singleTrans");
    // /subscriptionInfoContent.jsp(1356,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setProperty("timestamp");
    int _jspx_eval_bean_005fwrite_005f29 = _jspx_th_bean_005fwrite_005f29.doStartTag();
    if (_jspx_th_bean_005fwrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f30 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1427,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1427,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setProperty("subscriptionID");
    int _jspx_eval_bean_005fwrite_005f30 = _jspx_th_bean_005fwrite_005f30.doStartTag();
    if (_jspx_th_bean_005fwrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f31 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1447,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1447,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setProperty("status");
    int _jspx_eval_bean_005fwrite_005f31 = _jspx_th_bean_005fwrite_005f31.doStartTag();
    if (_jspx_th_bean_005fwrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f6);
    // /subscriptionInfoContent.jsp(1457,15) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f12.setProperty("validation");
    // /subscriptionInfoContent.jsp(1457,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f12.setValue("false");
    int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
    if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f32 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f6);
    // /subscriptionInfoContent.jsp(1459,64) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1459,64) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setProperty("recurringTransID");
    int _jspx_eval_bean_005fwrite_005f32 = _jspx_th_bean_005fwrite_005f32.doStartTag();
    if (_jspx_th_bean_005fwrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f5 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f6);
    // /subscriptionInfoContent.jsp(1463,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f5.setValue("Refund");
    int _jspx_eval_html_005fsubmit_005f5 = _jspx_th_html_005fsubmit_005f5.doStartTag();
    if (_jspx_th_html_005fsubmit_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f33 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f33.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1487,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f33.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1487,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f33.setProperty("amount");
    int _jspx_eval_bean_005fwrite_005f33 = _jspx_th_bean_005fwrite_005f33.doStartTag();
    if (_jspx_th_bean_005fwrite_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f34 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f34.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1505,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f34.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1505,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f34.setProperty("salesTax");
    int _jspx_eval_bean_005fwrite_005f34 = _jspx_th_bean_005fwrite_005f34.doStartTag();
    if (_jspx_th_bean_005fwrite_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f35 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f35.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1523,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f35.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1523,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f35.setProperty("cycle");
    int _jspx_eval_bean_005fwrite_005f35 = _jspx_th_bean_005fwrite_005f35.doStartTag();
    if (_jspx_th_bean_005fwrite_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f36 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f36.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1541,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f36.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1541,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f36.setProperty("comment");
    int _jspx_eval_bean_005fwrite_005f36 = _jspx_th_bean_005fwrite_005f36.doStartTag();
    if (_jspx_th_bean_005fwrite_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f37 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f37.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f6);
    // /subscriptionInfoContent.jsp(1559,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f37.setName("recurTrans");
    // /subscriptionInfoContent.jsp(1559,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f37.setProperty("timestamp");
    int _jspx_eval_bean_005fwrite_005f37 = _jspx_th_bean_005fwrite_005f37.doStartTag();
    if (_jspx_th_bean_005fwrite_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f1 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f7);
    // /subscriptionInfoContent.jsp(1614,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setProperty("description");
    // /subscriptionInfoContent.jsp(1614,3) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setRows("5");
    // /subscriptionInfoContent.jsp(1614,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setCols("45");
    int _jspx_eval_html_005ftextarea_005f1 = _jspx_th_html_005ftextarea_005f1.doStartTag();
    if (_jspx_th_html_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_html_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_html_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f6 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f7);
    // /subscriptionInfoContent.jsp(1620,23) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f6.setValue("Add Entry");
    int _jspx_eval_html_005fsubmit_005f6 = _jspx_th_html_005fsubmit_005f6.doStartTag();
    if (_jspx_th_html_005fsubmit_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f38 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f38.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
    // /subscriptionInfoContent.jsp(1658,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f38.setName("custServLog");
    // /subscriptionInfoContent.jsp(1658,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f38.setProperty("timestamp");
    int _jspx_eval_bean_005fwrite_005f38 = _jspx_th_bean_005fwrite_005f38.doStartTag();
    if (_jspx_th_bean_005fwrite_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f39 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f39.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
    // /subscriptionInfoContent.jsp(1664,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f39.setName("custServLog");
    // /subscriptionInfoContent.jsp(1664,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f39.setProperty("accountName");
    int _jspx_eval_bean_005fwrite_005f39 = _jspx_th_bean_005fwrite_005f39.doStartTag();
    if (_jspx_th_bean_005fwrite_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f40 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f40.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f7);
    // /subscriptionInfoContent.jsp(1670,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f40.setName("custServLog");
    // /subscriptionInfoContent.jsp(1670,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f40.setProperty("description");
    int _jspx_eval_bean_005fwrite_005f40 = _jspx_th_bean_005fwrite_005f40.doStartTag();
    if (_jspx_th_bean_005fwrite_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f3 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f3.setParent(null);
    // /subscriptionInfoContent.jsp(1682,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fpresent_005f3.setName("specialCoupon");
    int _jspx_eval_logic_005fpresent_005f3 = _jspx_th_logic_005fpresent_005f3.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<table border=1>\r\n");
        out.write("<tr>\r\n");
        out.write("<td><b>Note</b></td>\r\n");
        out.write("<td bgcolor=\"#55EE55\">This customer used a coupon during registration</td>\r\n");
        out.write("\r\n");
        out.write("</tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("     <td><b>Coupon Code</b></td>\r\n");
        out.write("     <td><a href=\"ShowCoupons.do#");
        if (_jspx_meth_bean_005fwrite_005f41(_jspx_th_logic_005fpresent_005f3, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("     <font color=\"#2222CC\">");
        if (_jspx_meth_bean_005fwrite_005f42(_jspx_th_logic_005fpresent_005f3, _jspx_page_context))
          return true;
        out.write("</font>\r\n");
        out.write("     </a></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("   \r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f41 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f41.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
    // /subscriptionInfoContent.jsp(1691,33) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f41.setName("specialCoupon");
    // /subscriptionInfoContent.jsp(1691,33) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f41.setProperty("_couponCode");
    int _jspx_eval_bean_005fwrite_005f41 = _jspx_th_bean_005fwrite_005f41.doStartTag();
    if (_jspx_th_bean_005fwrite_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f42 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f42.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
    // /subscriptionInfoContent.jsp(1692,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f42.setName("specialCoupon");
    // /subscriptionInfoContent.jsp(1692,27) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f42.setProperty("_couponCode");
    int _jspx_eval_bean_005fwrite_005f42 = _jspx_th_bean_005fwrite_005f42.doStartTag();
    if (_jspx_th_bean_005fwrite_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f43 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f43.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f43.setParent(null);
    // /subscriptionInfoContent.jsp(1751,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setName("subFastReturn");
    // /subscriptionInfoContent.jsp(1751,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setProperty("statusDescription");
    // /subscriptionInfoContent.jsp(1751,17) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setScope("request");
    int _jspx_eval_bean_005fwrite_005f43 = _jspx_th_bean_005fwrite_005f43.doStartTag();
    if (_jspx_th_bean_005fwrite_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f44 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f44.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f44.setParent(null);
    // /subscriptionInfoContent.jsp(1757,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f44.setName("subFastReturn");
    // /subscriptionInfoContent.jsp(1757,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f44.setProperty("expireDate");
    // /subscriptionInfoContent.jsp(1757,17) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f44.setScope("request");
    int _jspx_eval_bean_005fwrite_005f44 = _jspx_th_bean_005fwrite_005f44.doStartTag();
    if (_jspx_th_bean_005fwrite_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f7 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f8);
    // /subscriptionInfoContent.jsp(1769,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f7.setProperty("submit");
    // /subscriptionInfoContent.jsp(1769,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f7.setValue("EDIT this service");
    int _jspx_eval_html_005fsubmit_005f7 = _jspx_th_html_005fsubmit_005f7.doStartTag();
    if (_jspx_th_html_005fsubmit_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f45 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f45.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f45.setParent(null);
    // /subscriptionInfoContent.jsp(1789,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f45.setName("subReserveGame");
    // /subscriptionInfoContent.jsp(1789,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f45.setProperty("statusDescription");
    // /subscriptionInfoContent.jsp(1789,17) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f45.setScope("request");
    int _jspx_eval_bean_005fwrite_005f45 = _jspx_th_bean_005fwrite_005f45.doStartTag();
    if (_jspx_th_bean_005fwrite_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f46 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f46.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f46.setParent(null);
    // /subscriptionInfoContent.jsp(1795,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f46.setName("subReserveGame");
    // /subscriptionInfoContent.jsp(1795,17) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f46.setProperty("expireDate");
    // /subscriptionInfoContent.jsp(1795,17) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f46.setScope("request");
    int _jspx_eval_bean_005fwrite_005f46 = _jspx_th_bean_005fwrite_005f46.doStartTag();
    if (_jspx_th_bean_005fwrite_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f8 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f9);
    // /subscriptionInfoContent.jsp(1807,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f8.setProperty("submit");
    // /subscriptionInfoContent.jsp(1807,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f8.setValue("EDIT this service");
    int _jspx_eval_html_005fsubmit_005f8 = _jspx_th_html_005fsubmit_005f8.doStartTag();
    if (_jspx_th_html_005fsubmit_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f47 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f47.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f47.setParent(null);
    // /subscriptionInfoContent.jsp(1844,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f47.setName("subOneYearContract");
    // /subscriptionInfoContent.jsp(1844,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f47.setProperty("statusDescription");
    // /subscriptionInfoContent.jsp(1844,11) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f47.setScope("request");
    int _jspx_eval_bean_005fwrite_005f47 = _jspx_th_bean_005fwrite_005f47.doStartTag();
    if (_jspx_th_bean_005fwrite_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f48 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f48.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f48.setParent(null);
    // /subscriptionInfoContent.jsp(1847,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f48.setName("subOneYearContract");
    // /subscriptionInfoContent.jsp(1847,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f48.setProperty("beginningDate");
    // /subscriptionInfoContent.jsp(1847,11) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f48.setScope("request");
    int _jspx_eval_bean_005fwrite_005f48 = _jspx_th_bean_005fwrite_005f48.doStartTag();
    if (_jspx_th_bean_005fwrite_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f49 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f49.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f49.setParent(null);
    // /subscriptionInfoContent.jsp(1850,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f49.setName("subOneYearContract");
    // /subscriptionInfoContent.jsp(1850,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f49.setProperty("endDate");
    // /subscriptionInfoContent.jsp(1850,11) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f49.setScope("request");
    int _jspx_eval_bean_005fwrite_005f49 = _jspx_th_bean_005fwrite_005f49.doStartTag();
    if (_jspx_th_bean_005fwrite_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f9 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f10);
    // /subscriptionInfoContent.jsp(1856,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f9.setProperty("submit");
    // /subscriptionInfoContent.jsp(1856,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f9.setValue("EDIT this service");
    int _jspx_eval_html_005fsubmit_005f9 = _jspx_th_html_005fsubmit_005f9.doStartTag();
    if (_jspx_th_html_005fsubmit_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f10 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f11);
    // /subscriptionInfoContent.jsp(1891,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f10.setValue("Initiate Recurring Charge");
    int _jspx_eval_html_005fsubmit_005f10 = _jspx_th_html_005fsubmit_005f10.doStartTag();
    if (_jspx_th_html_005fsubmit_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f11 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f16);
    // /subscriptionInfoContent.jsp(2072,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f11.setValue("Change Subscription Plan");
    int _jspx_eval_html_005fsubmit_005f11 = _jspx_th_html_005fsubmit_005f11.doStartTag();
    if (_jspx_th_html_005fsubmit_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f12 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f17);
    // /subscriptionInfoContent.jsp(2098,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f12.setValue("Send Verification Email");
    int _jspx_eval_html_005fsubmit_005f12 = _jspx_th_html_005fsubmit_005f12.doStartTag();
    if (_jspx_th_html_005fsubmit_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_html_005fsubmit_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f4 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f12);
    // /subscriptionInfoContent.jsp(2118,33) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f4.setPage("/cancelSubWarn.do");
    int _jspx_eval_html_005frewrite_005f4 = _jspx_th_html_005frewrite_005f4.doStartTag();
    if (_jspx_th_html_005frewrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_govojo_005fdisplayPermissions_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f5 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_govojo_005fdisplayPermissions_005f13);
    // /subscriptionInfoContent.jsp(2142,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005frewrite_005f5.setPage("/reactivateDisplayOption.do");
    int _jspx_eval_html_005frewrite_005f5 = _jspx_th_html_005frewrite_005f5.doStartTag();
    if (_jspx_th_html_005frewrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_0026_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f5);
    return false;
  }
}
