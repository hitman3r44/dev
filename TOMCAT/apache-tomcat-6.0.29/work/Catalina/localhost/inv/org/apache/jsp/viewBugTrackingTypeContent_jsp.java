package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.BugTracking;
import java.util.ArrayList;

public final class viewBugTrackingTypeContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/inv/templates/main.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
 
ArrayList selections =BugTracking.getBugtrackingList();
BugTracking tracking;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("<!-- Table Header -->\r\n");
      out.write("<h3>Open Bugs:</h3>\r\n");
      out.write("<tr> \r\n");
      out.write("\r\n");
      out.write("<th width=\"\">BugId</th>   \r\n");
      out.write("<th width=\"\"> Title</th>\r\n");
      out.write("<th width=\"\"> Module</th>\r\n");
      out.write("<th width=\"\"> Priority</th>\r\n");
      out.write("<th width=\"\">Logged By</th>\r\n");
      out.write("<th width=\"\">Logged Date</th>\r\n");
      out.write("<th width=\"\">Current Status</th>\r\n");
      out.write("\r\n");
      out.write(" </tr>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("  ");
 
  
  for(int i=0;i<selections.size();i++)
  {
	  
     tracking = (BugTracking)selections.get(i);
     String current=tracking.get_current_Status();
     
     if(!current.equalsIgnoreCase("closed"))
     {
     
   
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("   \r\n");
      out.write("   <td align=\"center\"><a href=\"viewBug.jsp?bugid=");
      out.print(tracking.getID() );
      out.write('"');
      out.write('>');
      out.print(tracking.getID());
      out.write("</a></td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_title());
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(tracking.getModuleName(tracking.getModule()));
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_bugPriority() );
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_submitted_By() );
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_submitted_Date() );
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_current_Status() );
      out.write("</td>\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("\t<td><a href=\"addBugTrackingType.jsp?bugid=");
      out.print(tracking.getID() );
      out.write("\"><b>Edit</b></a></td>\r\n");
      out.write("\r\n");
      out.write("   </tr>  \r\n");
      out.write("\r\n");
      out.write("  \t");
} 
      out.write("\r\n");
      out.write("   ");
} 
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("<!-- Table Header -->\r\n");
      out.write("<h3>Closed Bugs:</h3>\r\n");
      out.write("<tr> \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<th>BugId</th>   \r\n");
      out.write("<th>Title</th>\r\n");
      out.write("<th width=\"\"> Module</th>\r\n");
      out.write("<th>Logged By</th>\r\n");
      out.write("<th>Logged Date</th>\r\n");
      out.write("<th>Reviewer</th>\r\n");
      out.write("<th>FixedDate</th>\r\n");
      out.write("\r\n");
      out.write(" </tr>\r\n");
      out.write("   \r\n");
      out.write("  ");
 
  for(int i=0;i<selections.size();i++)
  {
     tracking = (BugTracking)selections.get(i);
     String current=tracking.get_current_Status();
    
     if(current.equalsIgnoreCase("closed"))
     {
     
   
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write(" \r\n");
      out.write("      <td align=\"center\"><a href=\"viewBug.jsp?bugid=");
      out.print(tracking.getID() );
      out.write('"');
      out.write('>');
      out.print(tracking.getID());
      out.write("</a></td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_title());
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.getModuleName(tracking.getModule()));
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_submitted_By() );
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_submitted_Date() );
      out.write("</td>\r\n");
      out.write("   <td>");
      out.print(tracking.get_reviwed_By() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(tracking.get_fixed_Date());
      out.write("</td>\r\n");
      out.write("   \r\n");
      out.write("\t<td><a href=\"addBugTrackingType.jsp?bugid=");
      out.print(tracking.getID() );
      out.write("\"><b>Edit</b></a></td>\r\n");
      out.write("   </tr>  \r\n");
      out.write("\r\n");
      out.write("  \t");
} 
      out.write("\r\n");
      out.write("   ");
} 
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
