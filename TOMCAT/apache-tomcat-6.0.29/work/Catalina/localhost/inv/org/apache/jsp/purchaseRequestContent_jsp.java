package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.composite.*;
import java.util.ArrayList;
import govojo.db.PurchaseOrder;
import govojo.db.PaymentMethod;

public final class purchaseRequestContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.release();
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

    java.lang.Integer _jspx_invID_1 = null;

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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("function callAction(action)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("   if(action == \"cancel\"){\r\n");
      out.write("      document.purchaseRequestContent.action = \"cancelPurchaseOrder.do\";\r\n");
      out.write("      document.purchaseRequestContent.submit();     \r\n");
      out.write("   }\r\n");
      out.write("   else if(action==\"submit\")\r\n");
      out.write("   {\r\n");
      out.write("    document.purchaseRequestContent.action = \"submitPurchaseInformation.do\";\r\n");
      out.write("    document.purchaseRequestContent.submit();    \r\n");
      out.write("   }   \r\n");
      out.write("    else if(action == \"fulfill\")\r\n");
      out.write("   {\r\n");
      out.write("    document.purchaseRequestContent.action = \"fulfillPurchaseRequest.do\";\r\n");
      out.write("    document.purchaseRequestContent.submit();\r\n");
      out.write("   }\r\n");
      out.write("   return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"/css/screen.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      //  bean:define
      java.lang.Object ppTr = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /purchaseRequestContent.jsp(37,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f0.setId("ppTr");
      // /purchaseRequestContent.jsp(37,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f0.setName("ppTransaction");
      // /purchaseRequestContent.jsp(37,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f0.setScope("request");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      ppTr = (java.lang.Object) _jspx_page_context.findAttribute("ppTr");
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      ppTr = (java.lang.Object) _jspx_page_context.findAttribute("ppTr");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      out.write('\r');
      out.write('\n');
      //  bean:define
      java.lang.String paymentStatus = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /purchaseRequestContent.jsp(38,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setId("paymentStatus");
      // /purchaseRequestContent.jsp(38,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setName("ppTr");
      // /purchaseRequestContent.jsp(38,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setProperty("paymentStatus");
      // /purchaseRequestContent.jsp(38,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f1.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      paymentStatus = (java.lang.String) _jspx_page_context.findAttribute("paymentStatus");
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      paymentStatus = (java.lang.String) _jspx_page_context.findAttribute("paymentStatus");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      //  bean:define
      govojo.db.Address shippingAddress = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /purchaseRequestContent.jsp(44,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setId("shippingAddress");
      // /purchaseRequestContent.jsp(44,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(44,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setProperty("shippingAddress");
      // /purchaseRequestContent.jsp(44,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setScope("request");
      // /purchaseRequestContent.jsp(44,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f2.setType("govojo.db.Address");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      shippingAddress = (govojo.db.Address) _jspx_page_context.findAttribute("shippingAddress");
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      shippingAddress = (govojo.db.Address) _jspx_page_context.findAttribute("shippingAddress");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.String estimatedShippingStartDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /purchaseRequestContent.jsp(46,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setId("estimatedShippingStartDate");
      // /purchaseRequestContent.jsp(46,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(46,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setProperty("estimatedShippingStartDate");
      // /purchaseRequestContent.jsp(46,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setScope("request");
      // /purchaseRequestContent.jsp(46,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f3.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      estimatedShippingStartDate = (java.lang.String) _jspx_page_context.findAttribute("estimatedShippingStartDate");
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      estimatedShippingStartDate = (java.lang.String) _jspx_page_context.findAttribute("estimatedShippingStartDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.String estimatedShippingFinishDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f4.setParent(null);
      // /purchaseRequestContent.jsp(49,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setId("estimatedShippingFinishDate");
      // /purchaseRequestContent.jsp(49,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(49,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setProperty("estimatedShippingFinishDate");
      // /purchaseRequestContent.jsp(49,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setScope("request");
      // /purchaseRequestContent.jsp(49,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f4.setType("java.lang.String");
      int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
      estimatedShippingFinishDate = (java.lang.String) _jspx_page_context.findAttribute("estimatedShippingFinishDate");
      if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
        return;
      }
      estimatedShippingFinishDate = (java.lang.String) _jspx_page_context.findAttribute("estimatedShippingFinishDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object grandTotal = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f5.setParent(null);
      // /purchaseRequestContent.jsp(52,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setId("grandTotal");
      // /purchaseRequestContent.jsp(52,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(52,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setProperty("grandTotal");
      // /purchaseRequestContent.jsp(52,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f5.setScope("request");
      int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
      grandTotal = (java.lang.Object) _jspx_page_context.findAttribute("grandTotal");
      if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
        return;
      }
      grandTotal = (java.lang.Object) _jspx_page_context.findAttribute("grandTotal");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.util.ArrayList cartItemList = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f6.setParent(null);
      // /purchaseRequestContent.jsp(54,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setId("cartItemList");
      // /purchaseRequestContent.jsp(54,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(54,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setProperty("cartItemsList");
      // /purchaseRequestContent.jsp(54,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setScope("request");
      // /purchaseRequestContent.jsp(54,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f6.setType("java.util.ArrayList");
      int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
      cartItemList = (java.util.ArrayList) _jspx_page_context.findAttribute("cartItemList");
      if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
        return;
      }
      cartItemList = (java.util.ArrayList) _jspx_page_context.findAttribute("cartItemList");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object orderID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f7.setParent(null);
      // /purchaseRequestContent.jsp(56,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setId("orderID");
      // /purchaseRequestContent.jsp(56,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(56,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setProperty("orderID");
      // /purchaseRequestContent.jsp(56,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f7.setScope("request");
      int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
      orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
      if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
        return;
      }
      orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object customerID = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f8.setParent(null);
      // /purchaseRequestContent.jsp(58,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setId("customerID");
      // /purchaseRequestContent.jsp(58,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(58,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setProperty("customerID");
      // /purchaseRequestContent.jsp(58,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f8.setScope("request");
      int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
      customerID = (java.lang.Object) _jspx_page_context.findAttribute("customerID");
      if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
        return;
      }
      customerID = (java.lang.Object) _jspx_page_context.findAttribute("customerID");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object customerName = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f9.setParent(null);
      // /purchaseRequestContent.jsp(60,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setId("customerName");
      // /purchaseRequestContent.jsp(60,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(60,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setProperty("customerName");
      // /purchaseRequestContent.jsp(60,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f9.setScope("request");
      int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
      customerName = (java.lang.Object) _jspx_page_context.findAttribute("customerName");
      if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
        return;
      }
      customerName = (java.lang.Object) _jspx_page_context.findAttribute("customerName");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object customerEmail = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f10.setParent(null);
      // /purchaseRequestContent.jsp(62,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setId("customerEmail");
      // /purchaseRequestContent.jsp(62,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(62,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setProperty("customerEmail");
      // /purchaseRequestContent.jsp(62,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f10.setScope("request");
      int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
      customerEmail = (java.lang.Object) _jspx_page_context.findAttribute("customerEmail");
      if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
        return;
      }
      customerEmail = (java.lang.Object) _jspx_page_context.findAttribute("customerEmail");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object customerLanguage = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f11 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f11.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f11.setParent(null);
      // /purchaseRequestContent.jsp(64,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setId("customerLanguage");
      // /purchaseRequestContent.jsp(64,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(64,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setProperty("customerLanguage");
      // /purchaseRequestContent.jsp(64,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f11.setScope("request");
      int _jspx_eval_bean_005fdefine_005f11 = _jspx_th_bean_005fdefine_005f11.doStartTag();
      customerLanguage = (java.lang.Object) _jspx_page_context.findAttribute("customerLanguage");
      if (_jspx_th_bean_005fdefine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
        return;
      }
      customerLanguage = (java.lang.Object) _jspx_page_context.findAttribute("customerLanguage");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object tax = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f12 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f12.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f12.setParent(null);
      // /purchaseRequestContent.jsp(66,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setId("tax");
      // /purchaseRequestContent.jsp(66,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(66,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setProperty("tax");
      // /purchaseRequestContent.jsp(66,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f12.setScope("request");
      int _jspx_eval_bean_005fdefine_005f12 = _jspx_th_bean_005fdefine_005f12.doStartTag();
      tax = (java.lang.Object) _jspx_page_context.findAttribute("tax");
      if (_jspx_th_bean_005fdefine_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
        return;
      }
      tax = (java.lang.Object) _jspx_page_context.findAttribute("tax");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object shippingFees = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f13 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f13.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f13.setParent(null);
      // /purchaseRequestContent.jsp(68,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setId("shippingFees");
      // /purchaseRequestContent.jsp(68,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(68,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setProperty("shippingFees");
      // /purchaseRequestContent.jsp(68,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f13.setScope("request");
      int _jspx_eval_bean_005fdefine_005f13 = _jspx_th_bean_005fdefine_005f13.doStartTag();
      shippingFees = (java.lang.Object) _jspx_page_context.findAttribute("shippingFees");
      if (_jspx_th_bean_005fdefine_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
        return;
      }
      shippingFees = (java.lang.Object) _jspx_page_context.findAttribute("shippingFees");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object purchaseStatus = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f14 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f14.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f14.setParent(null);
      // /purchaseRequestContent.jsp(70,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setId("purchaseStatus");
      // /purchaseRequestContent.jsp(70,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(70,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setProperty("purchaseStatus");
      // /purchaseRequestContent.jsp(70,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f14.setScope("request");
      int _jspx_eval_bean_005fdefine_005f14 = _jspx_th_bean_005fdefine_005f14.doStartTag();
      purchaseStatus = (java.lang.Object) _jspx_page_context.findAttribute("purchaseStatus");
      if (_jspx_th_bean_005fdefine_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
        return;
      }
      purchaseStatus = (java.lang.Object) _jspx_page_context.findAttribute("purchaseStatus");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object purchaseOrderDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f15 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f15.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f15.setParent(null);
      // /purchaseRequestContent.jsp(72,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setId("purchaseOrderDate");
      // /purchaseRequestContent.jsp(72,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(72,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setProperty("purchaseOrderDate");
      // /purchaseRequestContent.jsp(72,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f15.setScope("request");
      int _jspx_eval_bean_005fdefine_005f15 = _jspx_th_bean_005fdefine_005f15.doStartTag();
      purchaseOrderDate = (java.lang.Object) _jspx_page_context.findAttribute("purchaseOrderDate");
      if (_jspx_th_bean_005fdefine_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
        return;
      }
      purchaseOrderDate = (java.lang.Object) _jspx_page_context.findAttribute("purchaseOrderDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f15);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Integer shippingMethod = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f16 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f16.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f16.setParent(null);
      // /purchaseRequestContent.jsp(74,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setId("shippingMethod");
      // /purchaseRequestContent.jsp(74,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(74,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setProperty("shippingMethod");
      // /purchaseRequestContent.jsp(74,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setScope("request");
      // /purchaseRequestContent.jsp(74,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f16.setType("java.lang.Integer");
      int _jspx_eval_bean_005fdefine_005f16 = _jspx_th_bean_005fdefine_005f16.doStartTag();
      shippingMethod = (java.lang.Integer) _jspx_page_context.findAttribute("shippingMethod");
      if (_jspx_th_bean_005fdefine_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
        return;
      }
      shippingMethod = (java.lang.Integer) _jspx_page_context.findAttribute("shippingMethod");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f16);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object trackingNumber = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f17 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f17.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f17.setParent(null);
      // /purchaseRequestContent.jsp(76,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setId("trackingNumber");
      // /purchaseRequestContent.jsp(76,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(76,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setProperty("trackingNumber");
      // /purchaseRequestContent.jsp(76,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f17.setScope("request");
      int _jspx_eval_bean_005fdefine_005f17 = _jspx_th_bean_005fdefine_005f17.doStartTag();
      trackingNumber = (java.lang.Object) _jspx_page_context.findAttribute("trackingNumber");
      if (_jspx_th_bean_005fdefine_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
        return;
      }
      trackingNumber = (java.lang.Object) _jspx_page_context.findAttribute("trackingNumber");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f17);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object comments = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f18 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f18.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f18.setParent(null);
      // /purchaseRequestContent.jsp(78,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setId("comments");
      // /purchaseRequestContent.jsp(78,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(78,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setProperty("comments");
      // /purchaseRequestContent.jsp(78,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f18.setScope("request");
      int _jspx_eval_bean_005fdefine_005f18 = _jspx_th_bean_005fdefine_005f18.doStartTag();
      comments = (java.lang.Object) _jspx_page_context.findAttribute("comments");
      if (_jspx_th_bean_005fdefine_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
        return;
      }
      comments = (java.lang.Object) _jspx_page_context.findAttribute("comments");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f18);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  bean:define
      java.lang.Object fullFilledDate = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f19 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f19.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f19.setParent(null);
      // /purchaseRequestContent.jsp(80,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setId("fullFilledDate");
      // /purchaseRequestContent.jsp(80,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(80,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setProperty("fullFilledDate");
      // /purchaseRequestContent.jsp(80,1) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f19.setScope("request");
      int _jspx_eval_bean_005fdefine_005f19 = _jspx_th_bean_005fdefine_005f19.doStartTag();
      fullFilledDate = (java.lang.Object) _jspx_page_context.findAttribute("fullFilledDate");
      if (_jspx_th_bean_005fdefine_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
        return;
      }
      fullFilledDate = (java.lang.Object) _jspx_page_context.findAttribute("fullFilledDate");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f19);
      out.write("\r\n");
      out.write("\t\t");
      //  bean:define
      java.lang.Object usrComments = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f20 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f20.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f20.setParent(null);
      // /purchaseRequestContent.jsp(82,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setId("usrComments");
      // /purchaseRequestContent.jsp(82,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(82,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setProperty("usrComments");
      // /purchaseRequestContent.jsp(82,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f20.setScope("request");
      int _jspx_eval_bean_005fdefine_005f20 = _jspx_th_bean_005fdefine_005f20.doStartTag();
      usrComments = (java.lang.Object) _jspx_page_context.findAttribute("usrComments");
      if (_jspx_th_bean_005fdefine_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
        return;
      }
      usrComments = (java.lang.Object) _jspx_page_context.findAttribute("usrComments");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f20);
      out.write("\r\n");
      out.write("\t\t");
      //  bean:define
      java.lang.Object paypalSurcharge = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f21 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f21.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f21.setParent(null);
      // /purchaseRequestContent.jsp(84,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setId("paypalSurcharge");
      // /purchaseRequestContent.jsp(84,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(84,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setProperty("subTotalPaypalOvercharge");
      // /purchaseRequestContent.jsp(84,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f21.setScope("request");
      int _jspx_eval_bean_005fdefine_005f21 = _jspx_th_bean_005fdefine_005f21.doStartTag();
      paypalSurcharge = (java.lang.Object) _jspx_page_context.findAttribute("paypalSurcharge");
      if (_jspx_th_bean_005fdefine_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
        return;
      }
      paypalSurcharge = (java.lang.Object) _jspx_page_context.findAttribute("paypalSurcharge");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f21);
      out.write("\r\n");
      out.write("\t\t");
      //  bean:define
      java.lang.Integer paymentMethod = null;
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f22 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f22.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f22.setParent(null);
      // /purchaseRequestContent.jsp(86,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setId("paymentMethod");
      // /purchaseRequestContent.jsp(86,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(86,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setProperty("paymentMethod");
      // /purchaseRequestContent.jsp(86,2) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setScope("request");
      // /purchaseRequestContent.jsp(86,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fdefine_005f22.setType("java.lang.Integer");
      int _jspx_eval_bean_005fdefine_005f22 = _jspx_th_bean_005fdefine_005f22.doStartTag();
      paymentMethod = (java.lang.Integer) _jspx_page_context.findAttribute("paymentMethod");
      if (_jspx_th_bean_005fdefine_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
        return;
      }
      paymentMethod = (java.lang.Integer) _jspx_page_context.findAttribute("paymentMethod");
      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fscope_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f22);
      out.write('\r');
      out.write('\n');
      out.write('	');

		String shipMethod = "Lettermail";
		if (shippingMethod.intValue() == ShippingMethod.XPRESSPOST) {
			shipMethod = "Xpresspost";
		}
		
		boolean paypalPending = (paymentMethod == PaymentMethod.PAYMENT_BY_PAYPAL) &&
										!paymentStatus.equalsIgnoreCase("completed");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

	if (cartItemList.size() == 0) {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"10\" align=\"center\"><span class=\"arial_12px_black\">Requested\r\n");
      out.write("\t\tList Empty </span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");

			} else {
			//System.out.println("------------- else -------------- ");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t");

		String sessionId = request.getSession().getId();
		
      out.write("\r\n");
      out.write("\t\t<form name=\"purchaseRequestContent\" jsessionid=");
      out.print(sessionId);
      out.write("\r\n");
      out.write("\t\t\tonsubmit=\"return callAction()\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"orderID\" value=\"");
      out.print(orderID);
      out.write("\">\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\" class=\"border_style\"\r\n");
      out.write("\t\t\t >\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\"  bgcolor=\"#afbfcf\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\"><b>Order ID</b>&nbsp;&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\"><b>");
      out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),shippingMethod.intValue()));
      out.write("</b></span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" bgcolor=\"#afbfcf\"><span style=\"font-size:12px\"><b>Customer\r\n");
      out.write("\t\t\t\tID</b>&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\">");
      out.print(customerID);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" bgcolor=\"#afbfcf\"><span style=\"font-size:12px\"><b>Customer\r\n");
      out.write("\t\t\t\tName</b>&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\">");
      out.print(customerName);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" bgcolor=\"#afbfcf\"><span style=\"font-size:12px\"><b>Customer\r\n");
      out.write("\t\t\t\tEmail</b>&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\">");
      out.print(customerEmail);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" bgcolor=\"#afbfcf\"><span style=\"font-size:12px\"><b>Customer\r\n");
      out.write("\t\t\t\tLanguage</b>&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\">");
      out.print(customerLanguage);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" bgcolor=\"#afbfcf\"><span style=\"font-size:12px\"><b>Order\r\n");
      out.write("\t\t\t\tDate</b>&nbsp;&nbsp;:</span></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"border_style\" bgcolor=\"#E3E3E3\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size:12px\">");
      out.print(purchaseOrderDate);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\"><b>Estimated Shipping\r\n");
      out.write("\t\t\t\tDate :</b></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\">Between ");
      out.print(estimatedShippingStartDate);
      out.write("<br>\r\n");
      out.write("\t\t\t\tand ");
      out.print(estimatedShippingFinishDate);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\" ><b>Fulfilled Date :</b></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\">");
      out.print(fullFilledDate);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\"><b>Shipping Address :</b></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\">");
      if (_jspx_meth_bean_005fwrite_005f0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_bean_005fwrite_005f1(_jspx_page_context))
        return;
      out.write(" <br>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_bean_005fwrite_005f2(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_bean_005fwrite_005f3(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_bean_005fwrite_005f4(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\" ><b>Shipping Method :</b>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\">");
      out.print(shipMethod);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\" bgcolor=\"#E3E3E3\"><b>Tracking number :</b>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"tracking\" value=\"");
      out.print(trackingNumber);
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\"><b>Comments :</b></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"comments\" value=\"");
      out.print(comments );
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\" valign=\"top\" bgcolor=\"#afbfcf\" ><b>User Comments :</b>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"border_style\" bgcolor=\"#E3E3E3\">");
      out.print(usrComments);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" \r\n");
      out.write("\t\t\t>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr bgcolor=\"#afbfcf\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Console</b></span>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Game\r\n");
      out.write("\t\t\t\tName</b></span></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Price</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Qty</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Manual</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Used/New</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Buy\r\n");
      out.write("\t\t\t\tIt/Keep It</b></span></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Total</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Status</b></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Shipped\r\n");
      out.write("\t\t\t\tdate</b></span></td>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

			int i = 0;
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /purchaseRequestContent.jsp(283,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("item");
      // /purchaseRequestContent.jsp(283,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setName("cartItemList");
      // /purchaseRequestContent.jsp(283,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setType("govojo.db.composite.CartItem");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.composite.CartItem item = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        item = (govojo.db.composite.CartItem) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("          ");
//System.out.println("******INSIDE CARTITEM LIST******"); 
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Object price = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f23 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f23.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(287,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setId("price");
          // /purchaseRequestContent.jsp(287,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setName("item");
          // /purchaseRequestContent.jsp(287,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f23.setProperty("price");
          int _jspx_eval_bean_005fdefine_005f23 = _jspx_th_bean_005fdefine_005f23.doStartTag();
          price = (java.lang.Object) _jspx_page_context.findAttribute("price");
          if (_jspx_th_bean_005fdefine_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
            return;
          }
          price = (java.lang.Object) _jspx_page_context.findAttribute("price");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f23);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Object quantity = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f24 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f24.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(288,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setId("quantity");
          // /purchaseRequestContent.jsp(288,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setName("item");
          // /purchaseRequestContent.jsp(288,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f24.setProperty("quantity");
          int _jspx_eval_bean_005fdefine_005f24 = _jspx_th_bean_005fdefine_005f24.doStartTag();
          quantity = (java.lang.Object) _jspx_page_context.findAttribute("quantity");
          if (_jspx_th_bean_005fdefine_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
            return;
          }
          quantity = (java.lang.Object) _jspx_page_context.findAttribute("quantity");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f24);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Object gameDescID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f25 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f25.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(289,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setId("gameDescID");
          // /purchaseRequestContent.jsp(289,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setName("item");
          // /purchaseRequestContent.jsp(289,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f25.setProperty("gameDescID");
          int _jspx_eval_bean_005fdefine_005f25 = _jspx_th_bean_005fdefine_005f25.doStartTag();
          gameDescID = (java.lang.Object) _jspx_page_context.findAttribute("gameDescID");
          if (_jspx_th_bean_005fdefine_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
            return;
          }
          gameDescID = (java.lang.Object) _jspx_page_context.findAttribute("gameDescID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f25);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Object newOrUsed = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f26 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f26.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(290,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setId("newOrUsed");
          // /purchaseRequestContent.jsp(290,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setName("item");
          // /purchaseRequestContent.jsp(290,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f26.setProperty("newOrUsed");
          int _jspx_eval_bean_005fdefine_005f26 = _jspx_th_bean_005fdefine_005f26.doStartTag();
          newOrUsed = (java.lang.Object) _jspx_page_context.findAttribute("newOrUsed");
          if (_jspx_th_bean_005fdefine_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
            return;
          }
          newOrUsed = (java.lang.Object) _jspx_page_context.findAttribute("newOrUsed");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f26);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Object gamePurchaseRequestID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f27 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f27.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(291,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setId("gamePurchaseRequestID");
          // /purchaseRequestContent.jsp(291,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setName("item");
          // /purchaseRequestContent.jsp(291,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f27.setProperty("gamePurchaseRequestID");
          int _jspx_eval_bean_005fdefine_005f27 = _jspx_th_bean_005fdefine_005f27.doStartTag();
          gamePurchaseRequestID = (java.lang.Object) _jspx_page_context.findAttribute("gamePurchaseRequestID");
          if (_jspx_th_bean_005fdefine_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
            return;
          }
          gamePurchaseRequestID = (java.lang.Object) _jspx_page_context.findAttribute("gamePurchaseRequestID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f27);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  bean:define
          java.lang.Integer status = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f28 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f28.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(293,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setId("status");
          // /purchaseRequestContent.jsp(293,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setName("item");
          // /purchaseRequestContent.jsp(293,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setProperty("status");
          // /purchaseRequestContent.jsp(293,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f28.setType("java.lang.Integer");
          int _jspx_eval_bean_005fdefine_005f28 = _jspx_th_bean_005fdefine_005f28.doStartTag();
          status = (java.lang.Integer) _jspx_page_context.findAttribute("status");
          if (_jspx_th_bean_005fdefine_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
            return;
          }
          status = (java.lang.Integer) _jspx_page_context.findAttribute("status");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f28);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"quantity");
          out.print(i);
          out.write("\" value=\"");
          out.print(quantity);
          out.write("\">\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"newOrUsed");
          out.print(i);
          out.write("\" value=\"");
          out.print(newOrUsed);
          out.write("\">\r\n");
          out.write("\t\t\t\t<input  type=\"hidden\" name=\"gprID");
          out.print(i);
          out.write("\"\r\n");
          out.write("\t\t\t\t\tvalue=\"");
          out.print(gamePurchaseRequestID);
          out.write("\">\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"status");
          out.print(i);
          out.write("\" value=\"");
          out.print(status);
          out.write("\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<tr bgcolor=\"#E3E3E3\">\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotEqual_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">");
          if (_jspx_meth_logic_005fequal_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write(' ');
          if (_jspx_meth_logic_005fequal_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t");
          out.print(	Double.parseDouble((String) price) * ((Integer) quantity).intValue() );
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t");
if(newOrUsed.toString().equalsIgnoreCase("used")){ 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t ");
//System.out.println("****INSIDE USED*****"); 
          out.write("\r\n");
          out.write(" \t\t\t\t\t\t ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(332,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fequal_005f5.setValue("1");
          // /purchaseRequestContent.jsp(332,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fequal_005f5.setName("item");
          // /purchaseRequestContent.jsp(332,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fequal_005f5.setProperty("status");
          int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
          if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write(" \t\t\t\t\t\t ");
//System.out.println("****INSIDE TODO****"); 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t<select name=\"list");
              out.print(i);
              out.write("\" style=\"width:100\" size=\"2\" multiple>\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
              // /purchaseRequestContent.jsp(336,8) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f1.setId("invID");
              // /purchaseRequestContent.jsp(336,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f1.setName("item");
              // /purchaseRequestContent.jsp(336,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f1.setProperty("inventoryIdList");
              // /purchaseRequestContent.jsp(336,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f1.setType("java.lang.Integer");
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Integer invID = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                invID = (java.lang.Integer) _jspx_page_context.findAttribute("invID");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
                  out.print(invID);
                  out.write('"');
                  out.write('>');
                  out.print(invID);
                  out.write("</option>\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  invID = (java.lang.Integer) _jspx_page_context.findAttribute("invID");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t</select>\r\n");
              out.write("\t\t\t\t\t  \t ");
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
          out.write("\t\t\t\t\t  \t \r\n");
          out.write("\t\t\t\t\t  \t ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestContent.jsp(344,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fnotEqual_005f1.setValue("1");
          // /purchaseRequestContent.jsp(344,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fnotEqual_005f1.setName("item");
          // /purchaseRequestContent.jsp(344,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fnotEqual_005f1.setProperty("status");
          int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t  \t ");
//System.out.println("***INSIDE SHIPPED/HOLD*****"); 
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
              // /purchaseRequestContent.jsp(346,8) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f2.setId("invID");
              // /purchaseRequestContent.jsp(346,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f2.setName("item");
              // /purchaseRequestContent.jsp(346,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f2.setProperty("inventoryIdList");
              // /purchaseRequestContent.jsp(346,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f2.setType("java.lang.Integer");
              int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Integer invID = null;
                if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f2.doInitBody();
                }
                invID = (java.lang.Integer) _jspx_page_context.findAttribute("invID");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<div>");
                  out.print(invID);
                  out.write("</div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                  invID = (java.lang.Integer) _jspx_page_context.findAttribute("invID");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
              out.write("\r\n");
              out.write("\t\t\t\t\t  \t ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
          out.write("\r\n");
          out.write("\t\t\t\t\t  \t \r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\"><select name=\"shipstatus");
          out.print(gamePurchaseRequestID);
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\tstyle=\"width:100\" >\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t</select></td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<td class=\"border_style\" border=\"1\">");
          if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                   <td class=\"border_style\"> ");
          if (_jspx_meth_html_005flink_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");

				i++;
				
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          item = (govojo.db.composite.CartItem) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"length\" value=\"");
      out.print(i);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td colspan=\"6\">&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><b>Shipping:</b></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" class=\"border_style\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border:2px solid #aaaaaa\"><span style=\"font-size:12px\">\r\n");
      out.write("\t\t\t\t");
      out.print(shippingFees);
      out.write("</span></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\">&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><b>Tax :</b></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" class=\"border_style\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border:2px solid #aaaaaa\"><span style=\"font-size:12px\">\r\n");
      out.write("\t\t\t\t");
      out.print(tax);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f9.setParent(null);
      // /purchaseRequestContent.jsp(424,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f9.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(424,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f9.setProperty("paymentMethod");
      // /purchaseRequestContent.jsp(424,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f9.setValue(PaymentMethod.PAYMENT_BY_PAYPAL+"" );
      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td colspan=\"6\">&nbsp;</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"border_style\"><b>Paypal surcharge :</b></td>\r\n");
          out.write("\t\t\t\t<td align=\"center\" class=\"border_style\"\tstyle=\"border:2px solid #aaaaaa\">\r\n");
          out.write("\t\t\t\t<span style=\"font-size:12px\">");
          out.print(paypalSurcharge);
          out.write("</span></td>\r\n");
          out.write("\t\t\t</tr>\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td class=\"border_style\"><b>Grand Total :</b></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" class=\"border_style\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border:2px solid #aaaaaa\"><span style=\"font-size:12px\">\r\n");
      out.write("\t\t\t\t");
      out.print(grandTotal);
      out.write("</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f10.setParent(null);
      // /purchaseRequestContent.jsp(443,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f10.setValue("1");
      // /purchaseRequestContent.jsp(443,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f10.setName("purchaseStatus");
      int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
      if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
if(!paypalPending){ 
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t");

					String needNormalize ="";
					int cuID = (Integer) customerID;
					needNormalize = PurchaseOrder.getNormalization(cuID);					
					if (needNormalize.equalsIgnoreCase("true")){ 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<td><input type=\"button\" name=\"FulFill\" value=\"Fulfill Order\" onclick=\"callAction('fulfill')\" disabled></td>\r\n");
          out.write("\t\t\t\t\t");
} else { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<td><input type=\"button\" name=\"FulFill\" value=\"Fulfill Order\" onclick=\"callAction('fulfill')\"></td>\t\t\t\t\r\n");
          out.write("\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t<td><input type=\"button\" name=\"submitinformation\" value=\"Submit Information\" onclick=\"callAction('submit')\"></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"button\" name=\"cancelorder\" value=\"Cancel Order\" onclick=\"callAction('cancel')\"></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
} 
          out.write("\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f10);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f10);
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f11.setParent(null);
      // /purchaseRequestContent.jsp(479,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f11.setName("purchaseOrderInfo");
      // /purchaseRequestContent.jsp(479,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f11.setProperty("paymentMethod");
      // /purchaseRequestContent.jsp(479,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fequal_005f11.setValue(PaymentMethod.PAYMENT_BY_PAYPAL+"" );
      int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
      if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<table width=\"500\">\r\n");
          out.write("    <tr bgcolor=\"orange\" height=\"20\">\r\n");
          out.write("    <td style=\"font-size:13;strong\" >Detailed information on the customer and transaction provided by paypal</td>\r\n");
          out.write("    </tr>    \r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("<table border=\"1\" width=\"500\">\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Transaction ID</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer ID</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer Email</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer Status</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer First name</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer Last name</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer Country</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to name</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to street</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to city</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f22(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to state</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f23(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to zip</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f24(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Ship to country</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f25(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payer address status</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f26(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Currency</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f27(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payment amount</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f28(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payment type</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f29(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payment status</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f30(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Pending reason</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f31(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("<td bgcolor=\"#eeeeee\">Payment date</td> <td>");
          if (_jspx_meth_bean_005fwrite_005f32(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("</table>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
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

  private boolean _jspx_meth_bean_005fwrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent(null);
    // /purchaseRequestContent.jsp(183,59) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("shippingAddress");
    // /purchaseRequestContent.jsp(183,59) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setProperty("street1");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent(null);
    // /purchaseRequestContent.jsp(184,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setName("shippingAddress");
    // /purchaseRequestContent.jsp(184,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setProperty("street2");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent(null);
    // /purchaseRequestContent.jsp(186,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setName("shippingAddress");
    // /purchaseRequestContent.jsp(186,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setProperty("city");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent(null);
    // /purchaseRequestContent.jsp(186,58) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setName("shippingAddress");
    // /purchaseRequestContent.jsp(186,58) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setProperty("state");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent(null);
    // /purchaseRequestContent.jsp(187,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setName("shippingAddress");
    // /purchaseRequestContent.jsp(187,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setProperty("zip");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
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
    // /purchaseRequestContent.jsp(252,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setValue("1");
    // /purchaseRequestContent.jsp(252,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setName("purchaseStatus");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Available</b></span>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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
    // /purchaseRequestContent.jsp(257,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setValue("2");
    // /purchaseRequestContent.jsp(257,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setName("purchaseStatus");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Fullfilled</b></span>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_logic_005fequal_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent(null);
    // /purchaseRequestContent.jsp(262,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setValue("3");
    // /purchaseRequestContent.jsp(262,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setName("purchaseStatus");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"border_style\"><span style=\"font-size:12px\"><b>Cancelled</b></span>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(305,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setName("item");
    // /purchaseRequestContent.jsp(305,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setProperty("console");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(307,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("item");
    // /purchaseRequestContent.jsp(307,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("gameName");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(308,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setValue("");
    // /purchaseRequestContent.jsp(308,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setName("item");
    // /purchaseRequestContent.jsp(308,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setProperty("size");
    int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('(');
        if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
          return true;
        out.write(')');
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    // /purchaseRequestContent.jsp(308,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("item");
    // /purchaseRequestContent.jsp(308,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("size");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(310,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("item");
    // /purchaseRequestContent.jsp(310,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("price");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(312,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("item");
    // /purchaseRequestContent.jsp(312,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("quantity");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(314,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("item");
    // /purchaseRequestContent.jsp(314,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("needManual");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(316,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setName("item");
    // /purchaseRequestContent.jsp(316,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setProperty("newOrUsed");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(318,30) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setName("item");
    // /purchaseRequestContent.jsp(318,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setProperty("purchaseType");
    // /purchaseRequestContent.jsp(318,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setValue("1");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tKeep It\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(321,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setName("item");
    // /purchaseRequestContent.jsp(321,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setProperty("purchaseType");
    // /purchaseRequestContent.jsp(321,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setValue("2");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tBuy It\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_logic_005fequal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(359,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setValue("1");
    // /purchaseRequestContent.jsp(359,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setName("item");
    // /purchaseRequestContent.jsp(359,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setProperty("status");
    int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
    if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">To Do</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"2\">Shipped</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"3\">Hold</option>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(365,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setValue("2");
    // /purchaseRequestContent.jsp(365,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setName("item");
    // /purchaseRequestContent.jsp(365,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setProperty("status");
    int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
    if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"1\">To Do</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"2\" selected =\"selected\">Shipped</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"3\">Hold</option>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(371,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setValue("3");
    // /purchaseRequestContent.jsp(371,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setName("item");
    // /purchaseRequestContent.jsp(371,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setProperty("status");
    int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
    if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"1\">To Do</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"2\">Shipped</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"3\" selected =\"selected\">Hold</option>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(379,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setName("item");
    // /purchaseRequestContent.jsp(379,41) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setProperty("shippedDate");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestContent.jsp(381,45) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setPage("/removeCartItem.do");
    // /purchaseRequestContent.jsp(381,45) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setParamId("gprID");
    // /purchaseRequestContent.jsp(381,45) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setParamName("item");
    // /purchaseRequestContent.jsp(381,45) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setParamProperty("gamePurchaseRequestID");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("<img src=\"/images/cancel.gif\" alt=\"Remove Cart Item\" width=\"40\" height=\"20\" border=\"0\">");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(488,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setName("ppTr");
    // /purchaseRequestContent.jsp(488,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setProperty("transactionID");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(491,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setName("ppTr");
    // /purchaseRequestContent.jsp(491,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setProperty("payerID");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(494,43) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setName("ppTr");
    // /purchaseRequestContent.jsp(494,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setProperty("payerEmail");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(497,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setName("ppTr");
    // /purchaseRequestContent.jsp(497,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setProperty("payerStatus");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(500,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setName("ppTr");
    // /purchaseRequestContent.jsp(500,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setProperty("payerFirstName");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(503,47) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setName("ppTr");
    // /purchaseRequestContent.jsp(503,47) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setProperty("payerLastName");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(506,45) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setName("ppTr");
    // /purchaseRequestContent.jsp(506,45) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setProperty("payerCountryCode");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(509,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setName("ppTr");
    // /purchaseRequestContent.jsp(509,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setProperty("payerAddShipToName");
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(512,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setName("ppTr");
    // /purchaseRequestContent.jsp(512,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setProperty("payerAddCity");
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(515,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setName("ppTr");
    // /purchaseRequestContent.jsp(515,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setProperty("payerAddStreet");
    int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
    if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f23 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(518,45) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setName("ppTr");
    // /purchaseRequestContent.jsp(518,45) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setProperty("payerAddState");
    int _jspx_eval_bean_005fwrite_005f23 = _jspx_th_bean_005fwrite_005f23.doStartTag();
    if (_jspx_th_bean_005fwrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f24 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(521,43) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setName("ppTr");
    // /purchaseRequestContent.jsp(521,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setProperty("payerAddZip");
    int _jspx_eval_bean_005fwrite_005f24 = _jspx_th_bean_005fwrite_005f24.doStartTag();
    if (_jspx_th_bean_005fwrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f25 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(524,47) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setName("ppTr");
    // /purchaseRequestContent.jsp(524,47) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setProperty("payerAddCountry");
    int _jspx_eval_bean_005fwrite_005f25 = _jspx_th_bean_005fwrite_005f25.doStartTag();
    if (_jspx_th_bean_005fwrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f26 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(527,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setName("ppTr");
    // /purchaseRequestContent.jsp(527,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setProperty("payerAddStatus");
    int _jspx_eval_bean_005fwrite_005f26 = _jspx_th_bean_005fwrite_005f26.doStartTag();
    if (_jspx_th_bean_005fwrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f27 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(530,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setName("ppTr");
    // /purchaseRequestContent.jsp(530,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setProperty("currency");
    int _jspx_eval_bean_005fwrite_005f27 = _jspx_th_bean_005fwrite_005f27.doStartTag();
    if (_jspx_th_bean_005fwrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f28 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(533,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setName("ppTr");
    // /purchaseRequestContent.jsp(533,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setProperty("amount");
    int _jspx_eval_bean_005fwrite_005f28 = _jspx_th_bean_005fwrite_005f28.doStartTag();
    if (_jspx_th_bean_005fwrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f29 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(536,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setName("ppTr");
    // /purchaseRequestContent.jsp(536,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setProperty("paymentType");
    int _jspx_eval_bean_005fwrite_005f29 = _jspx_th_bean_005fwrite_005f29.doStartTag();
    if (_jspx_th_bean_005fwrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f30 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(539,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setName("ppTr");
    // /purchaseRequestContent.jsp(539,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setProperty("paymentStatus");
    int _jspx_eval_bean_005fwrite_005f30 = _jspx_th_bean_005fwrite_005f30.doStartTag();
    if (_jspx_th_bean_005fwrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f31 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(542,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setName("ppTr");
    // /purchaseRequestContent.jsp(542,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setProperty("pendingReason");
    int _jspx_eval_bean_005fwrite_005f31 = _jspx_th_bean_005fwrite_005f31.doStartTag();
    if (_jspx_th_bean_005fwrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f32 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /purchaseRequestContent.jsp(545,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setName("ppTr");
    // /purchaseRequestContent.jsp(545,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setProperty("paymentDate");
    int _jspx_eval_bean_005fwrite_005f32 = _jspx_th_bean_005fwrite_005f32.doStartTag();
    if (_jspx_th_bean_005fwrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
    return false;
  }
}
