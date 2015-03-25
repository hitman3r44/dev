package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.PurchaseOrder;
import govojo.db.composite.ShippingMethod;

public final class purchaseRequestListContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
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
      out.write("<span style=\"font-size:14px\";><b>Express Shipping</b></span>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<span style=\"font-size:14px\">Ready to Ship </span>\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\"  class=\"border_style\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<tr style=\"background-color:#afbfcf\">\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Date</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"30%\">\t\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Customer ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Comments</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /purchaseRequestListContent.jsp(33,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setId("purchaseRequests");
      // /purchaseRequestListContent.jsp(33,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setName("expressShippingReadyToShipList");
      // /purchaseRequestListContent.jsp(33,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setScope("request");
      // /purchaseRequestListContent.jsp(33,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f0.setType("govojo.db.PurchaseOrder");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.PurchaseOrder purchaseRequests = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          java.lang.Object orderID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestListContent.jsp(35,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setId("orderID");
          // /purchaseRequestListContent.jsp(35,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setName("purchaseRequests");
          // /purchaseRequestListContent.jsp(35,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setProperty("ID");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          out.write("\r\n");
          out.write("\t\t\r\n");

String needNormalize ="";
needNormalize = PurchaseOrder.getNormalization(purchaseRequests.getCustomerID());


          out.write('\r');
          out.write('\n');
if (needNormalize.equalsIgnoreCase("true")){
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc;color:red\">\r\n");
}else{ 
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc\">\r\n");
} 
          out.write("\r\n");
          out.write("\t\t\t\t<td >\r\n");
          out.write("\t\t\t\t");
if (needNormalize.equalsIgnoreCase("true")){
					
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestListContent.jsp(52,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(52,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setParamId("orderID");
          // /purchaseRequestListContent.jsp(52,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(52,6) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setParamProperty("ID");
          // /purchaseRequestListContent.jsp(52,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f0.setStyle("color:red");
          int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
          if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f0.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.XPRESSPOST));
              int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f0);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} else{
          out.write("\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\"> ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /purchaseRequestListContent.jsp(54,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f1.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(54,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f1.setParamId("orderID");
          // /purchaseRequestListContent.jsp(54,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f1.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(54,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f1.setParamProperty("ID");
          int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
          if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f1.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.XPRESSPOST));
              int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f1);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<span style=\"font-size:14px\">Waiting on Games</span>\r\n");
      out.write("<br>\r\n");
      out.write("<table border=\"0\"  class=\"border_style\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<tr style=\"background-color:#afbfcf\">\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Date</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\t\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Customer ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Comments</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f1.setParent(null);
      // /purchaseRequestListContent.jsp(97,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setId("purchaseRequests");
      // /purchaseRequestListContent.jsp(97,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setName("expressShippingWaitingOnGamesList");
      // /purchaseRequestListContent.jsp(97,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setScope("request");
      // /purchaseRequestListContent.jsp(97,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f1.setType("govojo.db.PurchaseOrder");
      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.PurchaseOrder purchaseRequests = null;
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f1.doInitBody();
        }
        purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
        do {
          out.write('\r');
          out.write('\n');
          //  bean:define
          java.lang.Object orderID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /purchaseRequestListContent.jsp(98,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setId("orderID");
          // /purchaseRequestListContent.jsp(98,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setName("purchaseRequests");
          // /purchaseRequestListContent.jsp(98,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f1.setProperty("ID");
          int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
            return;
          }
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
          out.write("\r\n");
          out.write("\t\t");

String needNormalize ="";
needNormalize = PurchaseOrder.getNormalization(purchaseRequests.getCustomerID());


          out.write('\r');
          out.write('\n');
if (needNormalize.equalsIgnoreCase("true")){
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc;color:red\">\r\n");
}else{ 
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc\">\r\n");
} 
          out.write("\r\n");
          out.write("                     <td>\r\n");
          out.write("\t\t\t\t\t");
if (needNormalize.equalsIgnoreCase("true")){
					
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /purchaseRequestListContent.jsp(114,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(114,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setParamId("orderID");
          // /purchaseRequestListContent.jsp(114,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(114,6) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setParamProperty("ID");
          // /purchaseRequestListContent.jsp(114,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f2.setStyle("color:red");
          int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
          if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f2.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.XPRESSPOST));
              int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f2);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} else{
          out.write("\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\"> ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f3 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
          // /purchaseRequestListContent.jsp(116,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f3.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(116,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f3.setParamId("orderID");
          // /purchaseRequestListContent.jsp(116,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f3.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(116,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f3.setParamProperty("ID");
          int _jspx_eval_html_005flink_005f3 = _jspx_th_html_005flink_005f3.doStartTag();
          if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f3.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.XPRESSPOST));
              int evalDoAfterBody = _jspx_th_html_005flink_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f3);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
          purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<span style=\"font-size:14px\"><b>Standard Shipping</b></span>\r\n");
      out.write("<br>\r\n");
      out.write("<span style=\"font-size:14px\">Ready to ship(partial or full orders)</span>\r\n");
      out.write("<table border=\"0\"  class=\"border_style\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<tr style=\"background-color:#afbfcf\">\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Date</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\t\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Customer ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Comments</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t</tr>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f2.setParent(null);
      // /purchaseRequestListContent.jsp(161,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setId("purchaseRequests");
      // /purchaseRequestListContent.jsp(161,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setName("standardShippingReadyToShipList");
      // /purchaseRequestListContent.jsp(161,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setScope("request");
      // /purchaseRequestListContent.jsp(161,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f2.setType("govojo.db.PurchaseOrder");
      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.PurchaseOrder purchaseRequests = null;
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f2.doInitBody();
        }
        purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
        do {
          out.write('\r');
          out.write('\n');
          //  bean:define
          java.lang.Object orderID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /purchaseRequestListContent.jsp(162,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setId("orderID");
          // /purchaseRequestListContent.jsp(162,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setName("purchaseRequests");
          // /purchaseRequestListContent.jsp(162,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f2.setProperty("ID");
          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
            return;
          }
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
          out.write("\r\n");
          out.write("\t\t");

String needNormalize ="";
needNormalize = PurchaseOrder.getNormalization(purchaseRequests.getCustomerID());


          out.write('\r');
          out.write('\n');
if (needNormalize.equalsIgnoreCase("true")){
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc;color:red\">\r\n");
}else{ 
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc\">\r\n");
} 
          out.write("\r\n");
          out.write("                   <td>\r\n");
          out.write("\t\t\t\t\t");
if (needNormalize.equalsIgnoreCase("true")){
					
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f4 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /purchaseRequestListContent.jsp(178,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(178,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setParamId("orderID");
          // /purchaseRequestListContent.jsp(178,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(178,6) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setParamProperty("ID");
          // /purchaseRequestListContent.jsp(178,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f4.setStyle("color:red");
          int _jspx_eval_html_005flink_005f4 = _jspx_th_html_005flink_005f4.doStartTag();
          if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f4.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f4);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} else{
          out.write("\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\"> ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f5 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
          // /purchaseRequestListContent.jsp(180,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f5.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(180,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f5.setParamId("orderID");
          // /purchaseRequestListContent.jsp(180,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f5.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(180,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f5.setParamProperty("ID");
          int _jspx_eval_html_005flink_005f5 = _jspx_th_html_005flink_005f5.doStartTag();
          if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f5.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f5);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
          purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<span style=\"font-size:14px\">No game to Ship</span>\r\n");
      out.write("<table border=\"0\"  class=\"border_style\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<tr style=\"background-color:#afbfcf\">\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Date</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\t\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Customer ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Comments</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t</tr>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f3.setParent(null);
      // /purchaseRequestListContent.jsp(222,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setId("purchaseRequests");
      // /purchaseRequestListContent.jsp(222,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setName("standardShippingNogamesToShipList");
      // /purchaseRequestListContent.jsp(222,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f3.setScope("request");
      // /purchaseRequestListContent.jsp(222,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write('\r');
          out.write('\n');
          //  bean:define
          java.lang.Object orderID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /purchaseRequestListContent.jsp(223,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setId("orderID");
          // /purchaseRequestListContent.jsp(223,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setName("purchaseRequests");
          // /purchaseRequestListContent.jsp(223,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f3.setProperty("ID");
          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
            return;
          }
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
          out.write("\r\n");
          out.write("\t\t");

String needNormalize ="";
needNormalize = PurchaseOrder.getNormalization(purchaseRequests.getCustomerID());


          out.write('\r');
          out.write('\n');
if (needNormalize.equalsIgnoreCase("true")){
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc;color:red\">\r\n");
}else{ 
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc\">\r\n");
} 
          out.write("\r\n");
          out.write("                 <td>\r\n");
          out.write("\t\t\t\t");
if (needNormalize.equalsIgnoreCase("true")){
					
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f6 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /purchaseRequestListContent.jsp(239,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(239,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setParamId("orderID");
          // /purchaseRequestListContent.jsp(239,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(239,6) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setParamProperty("ID");
          // /purchaseRequestListContent.jsp(239,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f6.setStyle("color:red");
          int _jspx_eval_html_005flink_005f6 = _jspx_th_html_005flink_005f6.doStartTag();
          if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f6.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f6);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} else{
          out.write("\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\"> ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f7 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
          // /purchaseRequestListContent.jsp(241,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f7.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(241,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f7.setParamId("orderID");
          // /purchaseRequestListContent.jsp(241,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f7.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(241,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f7.setParamProperty("ID");
          int _jspx_eval_html_005flink_005f7 = _jspx_th_html_005flink_005f7.doStartTag();
          if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f7.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f7);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t</tr>\r\n");
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
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<span style=\"font-size:14px\";><b>Orders whose items aren't released yet</b></span>\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\"  class=\"border_style\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<tr style=\"background-color:#afbfcf\">\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Order ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Date</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"30%\">\t\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Customer ID</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t\t<th width=\"40%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Total</span>\r\n");
      out.write("\t\t</th>\t\r\n");
      out.write("\t\t<th width=\"30%\">\r\n");
      out.write("\t\t\t<span style=\"font-size:12px\">Comments</span>\r\n");
      out.write("\t\t</th>\r\n");
      out.write("\t</tr>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f4.setParent(null);
      // /purchaseRequestListContent.jsp(283,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setId("purchaseRequests");
      // /purchaseRequestListContent.jsp(283,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setName("ordersWhoseItemsNotReleasedYet");
      // /purchaseRequestListContent.jsp(283,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setScope("request");
      // /purchaseRequestListContent.jsp(283,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fiterate_005f4.setType("govojo.db.PurchaseOrder");
      int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        govojo.db.PurchaseOrder purchaseRequests = null;
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f4.doInitBody();
        }
        purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
        do {
          out.write('\r');
          out.write('\n');
          //  bean:define
          java.lang.Object orderID = null;
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /purchaseRequestListContent.jsp(284,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setId("orderID");
          // /purchaseRequestListContent.jsp(284,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setName("purchaseRequests");
          // /purchaseRequestListContent.jsp(284,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f4.setProperty("ID");
          int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
            return;
          }
          orderID = (java.lang.Object) _jspx_page_context.findAttribute("orderID");
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
          out.write("\r\n");
          out.write("\t\t");

String needNormalize ="";
needNormalize = PurchaseOrder.getNormalization(purchaseRequests.getCustomerID());


          out.write('\r');
          out.write('\n');
if (needNormalize.equalsIgnoreCase("true")){
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc;color:red\">\r\n");
}else{ 
          out.write("\r\n");
          out.write("<tr style=\"background-color:#cccccc\">\r\n");
} 
          out.write("\r\n");
          out.write("                 <td>\r\n");
          out.write("\t\t\t\t");
if (needNormalize.equalsIgnoreCase("true")){
					
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f8 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /purchaseRequestListContent.jsp(300,6) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(300,6) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setParamId("orderID");
          // /purchaseRequestListContent.jsp(300,6) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(300,6) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setParamProperty("ID");
          // /purchaseRequestListContent.jsp(300,6) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f8.setStyle("color:red");
          int _jspx_eval_html_005flink_005f8 = _jspx_th_html_005flink_005f8.doStartTag();
          if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f8.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f8);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} else{
          out.write("\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\"> ");
          //  html:link
          org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f9 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
          _jspx_th_html_005flink_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
          // /purchaseRequestListContent.jsp(302,35) name = page type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f9.setPage("/showPurchaseRequest.do");
          // /purchaseRequestListContent.jsp(302,35) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f9.setParamId("orderID");
          // /purchaseRequestListContent.jsp(302,35) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f9.setParamName("purchaseRequests");
          // /purchaseRequestListContent.jsp(302,35) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005flink_005f9.setParamProperty("ID");
          int _jspx_eval_html_005flink_005f9 = _jspx_th_html_005flink_005f9.doStartTag();
          if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005flink_005f9.doInitBody();
            }
            do {
              out.print(PurchaseOrder.changeOrderNumberFormat(orderID.toString(),ShippingMethod.LETTER_MAIL));
              int evalDoAfterBody = _jspx_th_html_005flink_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005fpage.reuse(_jspx_th_html_005flink_005f9);
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t");
} 
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"border_style\">\r\n");
          out.write("\t\t\t\t\t<span style=\"font-size:11px\">");
          if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("\t\t\t\t</td>\t\r\n");
          out.write("</tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
          purchaseRequests = (govojo.db.PurchaseOrder) _jspx_page_context.findAttribute("purchaseRequests");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fscope_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestListContent.jsp(59,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(59,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setProperty("estimatedShippingStartDate");
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
    // /purchaseRequestListContent.jsp(62,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(62,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestListContent.jsp(65,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(65,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setProperty("grandTotal");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /purchaseRequestListContent.jsp(68,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(68,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setProperty("comments");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /purchaseRequestListContent.jsp(120,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(120,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setProperty("estimatedShippingStartDate");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /purchaseRequestListContent.jsp(123,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(123,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /purchaseRequestListContent.jsp(126,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(126,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("grandTotal");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /purchaseRequestListContent.jsp(129,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(129,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("comments");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /purchaseRequestListContent.jsp(184,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(184,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("estimatedShippingStartDate");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /purchaseRequestListContent.jsp(187,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(187,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /purchaseRequestListContent.jsp(190,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(190,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("grandTotal");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /purchaseRequestListContent.jsp(193,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(193,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setProperty("comments");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /purchaseRequestListContent.jsp(245,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(245,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setProperty("estimatedShippingStartDate");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /purchaseRequestListContent.jsp(248,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(248,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setProperty("customerID");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /purchaseRequestListContent.jsp(251,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(251,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setProperty("grandTotal");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    // /purchaseRequestListContent.jsp(254,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(254,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setProperty("comments");
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
    // /purchaseRequestListContent.jsp(306,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(306,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setProperty("estimatedShippingStartDate");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /purchaseRequestListContent.jsp(309,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(309,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setProperty("customerID");
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
    // /purchaseRequestListContent.jsp(312,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(312,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setProperty("grandTotal");
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
    // /purchaseRequestListContent.jsp(315,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setName("purchaseRequests");
    // /purchaseRequestListContent.jsp(315,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setProperty("comments");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }
}
