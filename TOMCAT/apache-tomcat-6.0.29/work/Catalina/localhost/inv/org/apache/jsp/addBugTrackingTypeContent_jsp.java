package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.AudioType;
import java.util.ArrayList;
import govojo.db.BugTracking;

public final class addBugTrackingTypeContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/main.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");


BugTracking value=new BugTracking();

if(request.getParameter("bugid") != null)
{
	int id=Integer.parseInt(request.getParameter("bugid"));
	value.selectFromID(id);
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("<form  action=\"updateBugTrack.do\"  method=\"post\">\r\n");
      out.write("\r\n");

if(request.getParameter("bugid") != null)
{

      out.write("\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(request.getParameter("bugid"));
      out.write("\" name=\"editId\" id =\"title\" >\r\n");
 } 
      out.write("\r\n");
      out.write("<table  border=\"0\" align=\"left\" cellpadding=\"4\" cellspacing=\"4\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td valign=\"top\"> <span style=\"color:blue\" ><strong >BugTracking </strong></span></td>\r\n");
      out.write("\t\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td valign=\"top\"> Bug Title</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"text\" value=\"");
      out.print(value.get_title());
      out.write("\" size=\"50\" name=\"title\"  >\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td >Bug Description</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<textarea rows=\"3\" cols=\"55\" name=\"issue\" id=\"issue\">");
      out.print(value.get_bugIssue());
      out.write("</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Module</td>\r\n");
      out.write("\t<td> \r\n");
      out.write("\t\t<select id=\"module\" name=\"module\" >\r\n");
      out.write("\t\t<option value=\"1\">Rental</option>\r\n");
      out.write("\t\t<option value=\"2\">Store</option>\r\n");
      out.write("\t\t<option value=\"3\">Admin</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select> \t\r\n");
      out.write("\t\t(");
      out.print(value.getModuleName(value.getModule()) );
      out.write(")\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Priority</td>\r\n");
      out.write("\t<td> \r\n");
      out.write("\t\t <select id=\"priority\" name=\"priority\" >\r\n");
      out.write("\t\t<option value=\"High\">High</option>\r\n");
      out.write("\t\t<option value=\"Low\">Low</option>\r\n");
      out.write("\t\t<option value=\"Critical\" >Critical</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select> \t\r\n");
      out.write("\t\t(");
      out.print(value.get_bugPriority() );
      out.write("&nbsp;)\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Submitted By</td>\r\n");
      out.write("\t<td> <input type=\"text\" size=\"20\" name=\"submittedby\" id=\"submittedby\" value=\"");
      out.print(value.get_submitted_By() );
      out.write("\"></td>\r\n");
      out.write("</tr>\t\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Current Status</td>\r\n");
      out.write("\t<td> \r\n");
      out.write("\t\t<select id=\"current\" name=\"current\" >\r\n");
      out.write("\t\t<option value=\"Open\">Open</option>\r\n");
      out.write("\t\t<option value=\"Working\">Working</option>\r\n");
      out.write("\t\t<option value=\"Fixed\">Fixed</option>\r\n");
      out.write("\t\t<option value=\"Closed\">Closed</option>\r\n");
      out.write("\t\t<option value=\"Out-of-scope\">Out-of-scope</option>\r\n");
      out.write("\t\t</select> \t\r\n");
      out.write("\t\t(");
      out.print(value.get_current_Status() );
      out.write("&nbsp;)\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\r\n");
      out.write("</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Reviewed By</td>\r\n");
      out.write("\t<td>  <input type=\"text\" size=\"20\" name=\"review\" id=\"review\" value=\"");
      out.print(value.get_reviwed_By() );
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Files Changed</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<textarea rows=\"1\" cols=\"55\" name=\"file\" id=\"file\">");
      out.print(value.get_files_changed());
      out.write("</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Customer Comments</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<textarea rows=\"2\" cols=\"55\" name=\"customer\" id=\"customer\"  >");
      out.print(value.get_customer_Comments());
      out.write("</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Developer Comments</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<textarea rows=\"2\" cols=\"55\" name=\"developer\" id=\"developer\">");
      out.print(value.get_developer_Comments());
      out.write("</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td></td>\r\n");
      out.write("\t<td><input type=\"submit\" size=\"20\" value=\"submit\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
}
