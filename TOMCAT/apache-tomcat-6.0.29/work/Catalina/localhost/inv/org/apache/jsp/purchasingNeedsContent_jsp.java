package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import govojo.db.composite.GamePurchasingNeedBean;
import govojo.db.GamePurchaseNeeds;
import govojo.db.Console;

public final class purchasingNeedsContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

// MS: This code should be moved to the action [old code apparently]
ArrayList ps2List = (ArrayList)request.getAttribute("ps2List");
ps2List.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.PLAYSTATION2));

ArrayList ps3List = (ArrayList)request.getAttribute("ps3List");
ps3List.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.PLAYSTATION3));

ArrayList xboxList = (ArrayList)request.getAttribute("xboxList");
xboxList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.XBOX));

ArrayList xbox360List = (ArrayList)request.getAttribute("xbox360List");
xbox360List.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.XBOX360));

ArrayList dsList = (ArrayList)request.getAttribute("dsList");
dsList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.DS));

ArrayList wiiList = (ArrayList)request.getAttribute("wiiList");
wiiList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.WII));

ArrayList gamecubeList = (ArrayList)request.getAttribute("gamecubeList");
gamecubeList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.GAMECUBE));

ArrayList pspList = (ArrayList)request.getAttribute("pspList");
pspList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.PSP));

ArrayList ds3List = (ArrayList)request.getAttribute("ds3List");
ds3List.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.NINTENDO3DS));

ArrayList psvitaList = (ArrayList)request.getAttribute("psvitaList");
psvitaList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.PSVITA));

ArrayList wiiUList = (ArrayList)request.getAttribute("wiiUList");
wiiUList.addAll(GamePurchaseNeeds.getNewGamePurchaseNeedListForConsole(Console.WII_U));

	
GamePurchasingNeedBean gamePurchasingNeedBean;


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/inv/updateGamePurchaseNeedsNotes.do\" method=\"post\">\r\n");
      out.write("     Save notes in batch : <input type=\"submit\" value=\"Save\"> <br>\r\n");
      out.write("     \r\n");

if(request.getParameter("released") != null)
{

      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"released\" value=\"no\">\r\n");

}

      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Playstation 2</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<ps2List.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)ps2List.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t   <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Playstation 3</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<ps3List.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)ps3List.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Xbox</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<xboxList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)xboxList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Xbox 360</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<xbox360List.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)xbox360List.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Nintendo Wii</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<wiiList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)wiiList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Wii U</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<wiiUList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)wiiUList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Nintendo DS</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<dsList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)dsList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">Gamecube</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<gamecubeList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)gamecubeList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">PSP</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<pspList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)pspList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">NINTENDO 3DS</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<ds3List.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)ds3List.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table  width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" align=\"center\" >\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th colspan=\"6\">PS Vita</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=\"#E3E3E3\">\r\n");
      out.write("\t<th>Catalog ID</th>\r\n");
      out.write("\t<th>Game Name</th>\r\n");
      out.write("\t<th>Copies To Buy</th>\r\n");
      out.write("\t<th>New Copies</th>\r\n");
      out.write("\t");

		if(request.getParameter("released") == null)
		{
	
      out.write("\r\n");
      out.write("\t<th>Lowest Price</th>\r\n");
      out.write("\t<th>Seller Name</th>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<th colspan=\"2\">Released date</th>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<th>Notes</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

for(int i=0; i<psvitaList.size(); i++)
{
gamePurchasingNeedBean = (GamePurchasingNeedBean)psvitaList.get(i);

      out.write("\r\n");
      out.write("       \t<tr >\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t\t   <td >\r\n");
      out.write("        \t\t   <font color=\"black\">");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("</font>\r\n");
      out.write("\t\t   </td>\r\n");
      out.write("    \r\n");
      out.write("       \t\t<td >\r\n");
      out.write("     \t    \t  <font color=\"black\"><a href=\"/inv/editGameDesc.do?editID=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getGameName());
      out.write("</a></font>\r\n");
      out.write("   \t\t    </td>\r\n");
      out.write("      \r\n");
      out.write("   \t\t\t<td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(gamePurchasingNeedBean.getCopiesToBuy());
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t    <td >\r\n");
      out.write("      \t\t     <font color=\"black\"> ");
      out.print(GamePurchaseNeeds.getNumberOfNewCopiesToBuyAsStr(gamePurchasingNeedBean.getGameId()));
      out.write("</font>\r\n");
      out.write("   \t\t   </td>\r\n");
      out.write("   \t\t   \r\n");
      out.write("   \t\t");

		if(request.getParameter("released") == null)
		{
       	
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t  <td >\r\n");
      out.write("        \t      <a href=\"/inv/getPurchaseInformation.do?gameId=");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write("\" > ");
      out.print(gamePurchasingNeedBean.getLowestPrice());
      out.write("</a>\r\n");
      out.write("      \t  </td>\r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\r\n");
      out.write("        \t   ");
      out.print(gamePurchasingNeedBean.getSellerName());
      out.write("\r\n");
      out.write("      \t  </td>\r\n");
      out.write("    \t");

		}
		else
		{
		
      out.write("\r\n");
      out.write("\t\t<td colspan=\"2\">");
      out.print(gamePurchasingNeedBean.getReleaseDate());
      out.write("</td>\r\n");
      out.write("\t\t");
 } 
      out.write(" \r\n");
      out.write("      \t  \r\n");
      out.write("      \t   <td >\t\t\t\t      \t   \r\n");
      out.write("        \t    <textarea style=\"width:254px;height:40px\" name=\"notes");
      out.print(gamePurchasingNeedBean.getGameId());
      out.write('"');
      out.write('>');
      out.print(gamePurchasingNeedBean.getNotes());
      out.write("</textarea>\r\n");
      out.write("        \t    \r\n");
      out.write("      \t  </td>      \t  \r\n");
      out.write("\r\n");
      out.write("     </tr>    \r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
