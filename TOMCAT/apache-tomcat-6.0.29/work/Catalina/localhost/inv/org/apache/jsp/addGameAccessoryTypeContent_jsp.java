package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import govojo.db.GameGenre;

public final class addGameAccessoryTypeContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" function checkadd()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("    if(document.getElementById(\"desc\").value==\"\")\r\n");
      out.write("    {\r\n");
      out.write("   \t alert(\"please enter the text field\");\t\r\n");
      out.write("   \t return false;\r\n");
      out.write("   \t}\r\n");
      out.write(" return true;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(" function updateAction(desc, id)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"aid\").value = id;\r\n");
      out.write("\tdocument.getElementById(\"desc\").value = desc;\r\n");
      out.write("\tdocument.getElementById(\"action\").value = \"edit\";\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

GameGenre accessoryTypes[] = GameGenre.selectAllGameAccessory();
GameGenre accessoryType;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"500\"  border=\"1\" align=\"center\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th align=\"center\">\r\n");
      out.write("\tSI.No\r\n");
      out.write("</th>\r\n");
      out.write("<th width=\"250\">\r\n");
      out.write("\tAccessory Type\r\n");
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("<th>\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

for(int i = 0; i<accessoryTypes.length; i++)
{
	accessoryType = accessoryTypes[i];

      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
 if(i % 2 == 0){ 
      out.write("\r\n");
      out.write("    <tr bgcolor=\"lightgrey\">\r\n");
      out.write(" ");
 } else { 
      out.write("\r\n");
      out.write("    <tr bgcolor=\"white\">\r\n");
      out.write(" ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("\t");
      out.print(accessoryType.getID());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("\t");
      out.print(accessoryType.getName());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("\t<a href='javascript:updateAction(\"");
      out.print(accessoryType.getName());
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(accessoryType.getID());
      out.write("\")'>Edit</a> &nbsp;&nbsp; <a onclick=\"return confirm('Are you sure you want to delete this?')\" href=\"updateAccessoryType.do?type=gameaccessory&action=delete&id=");
      out.print(accessoryType.getID());
      out.write("\"><font color=\"red\">Delete</font></a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form  action=\"updateAccessoryType.do\"  onsubmit=\"return checkadd()\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"add\" id=\"action\">\r\n");
      out.write("<input type=\"hidden\" name=\"id\"  id=\"aid\">\r\n");
      out.write("<input type=\"hidden\" name=\"type\"  value=\"gameaccessory\">\r\n");
      out.write("\r\n");
      out.write("<table  border=\"0\" align=\"center\" cellpadding=\"4\" cellspacing=\"4\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td  align=\"left\" >Accessory Type </td>\r\n");
      out.write("\t<td></td>\r\n");
      out.write("\t<td align=\"left\" > <input type=\"text\"  id=\"desc\" name=\"desc\" size=\"30\" maxlength=\"30\" value=\"\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td ></td>\r\n");
      out.write("\t<td></td>\r\n");
      out.write("\t<td align=\"left\" ><input  type=\"submit\" value=\"submit\" ></td>\r\n");
      out.write("</tr> \r\n");
      out.write("\r\n");
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
