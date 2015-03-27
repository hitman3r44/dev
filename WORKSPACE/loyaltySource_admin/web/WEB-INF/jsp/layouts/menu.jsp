<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script>
<style>
<!--

#userLogin :HOVER{
	color:rgb(204,5,5);
	background:rgb(247,247,247);
	border-color: white;
}
#userLogin :LINK{
	color:rgb(44,140,171);
	background:rgb(247,247,247);
	border-color: white;
}

#liUserLogin :HOVER{
	color:rgb(204,5,5);
	background:rgb(247,247,247);
}
#liUserLogin :LINK{
	color:rgb(44,140,171);
	background:rgb(247,247,247);
}

#sign_in_link :HOVER{
	color:rgb(204,5,5);
	background:rgb(247,247,247);
}
#sign_in_link :LINK{
	color:rgb(44,140,171);
	background:rgb(247,247,247);
}

#liSign_in_link :HOVER{
	color:rgb(204,5,5);
	background:rgb(247,247,247);
}
#liSign_in_link :LINK{
	color:rgb(44,140,171);
	background:rgb(247,247,247);
}

-->
</style>


<!-- BEGIN TOP MENU -->
<div id="top_menu" class="unit section_underline gray_bg" style="padding:10px 0px 0px 60px;width: 100%;">
  <div>
  	<div style="margin-bottom:10px;">
  		<a href="homePage.do">
  			<img src="${images}/logo_small.png" width="259" height="51" />
  		</a>
  	</div>
    <!-- Beginning of compulsory code below -->
<div class="on-2 columns" style="width:100%;">
<div>
<ul id="nav" class="dropdown dropdown-horizontal">
	<li id="content_validation"><span class="dir">User Manager</span>
	<s:if test="#isLogin">
		<s:if test='%{#session.usr == "uv"}' >
			<ul>
            <li><span class="dir">View Accounts</span>
				<ul>
					<li class="first"><a href="commonList.do?pageType=${USER_LIST_VIEW}">Accounts Info</a></li>
				</ul>
			</li>
		</ul>
		</s:if>
		<s:if test='%{#session.usr == "menu"}' >
		<ul>
			<li><span class="dir">User</span>
				<ul>
					<li><a href="initUser.do">Add</a></li>
					<s:if test='#session.login=="frank"' >
					<li class="first"><a href="goToTransfer.do">Transfer</a></li>
					</s:if>
				</ul>
			</li>
			
			<li><span class="dir">Template</span>
				<ul>
					<li><a href="addTemplate.do">Add/Remove Template</a></li>
					<li><a href="editTemplate.do">Edit Template</a></li>
				</ul>
			</li>
			
						
            <li><span class="dir">Accounts Management</span>
				<ul>
				
				<li class="first"><a href="usersListAccount.do">List Accounts</a></li>
					<!--<li class="first"><a href="commonList.do?pageType=${USER_LIST}">List Accounts</a></li>-->
				</ul>
			</li>
					
			<li><span class="dir">User Connection</span>
				<ul>
				<li class="first"><a href="userConnection.do">User Connection</a></li>
				</ul>
			</li>
			
			
		</ul>

		</s:if>		
	</s:if>
	</li>
    <li id="content_mod"><span class="dir">Manage Brands - Categories & Product </span>
    	<s:if test="#isLogin">    	
    		     <s:if test='%{#session.usr == "uv"}' >
			<ul>				
					<li><span class="dir">Brand</span>
						<ul>
							<li><a href="commonList.do?pageType=${BRAND_LIST_VIEW}">View</a></li>
						</ul>
					</li>
                    <li><span class="dir">Category</span>
						<ul>
							<li><a href="commonList.do?pageType=${CATEGORY_LIST_VIEW}">View</a></li>
						</ul>
					</li>
					<li><span class="dir">Main Specification</span>
						<ul>
							<li><a href="commonList.do?pageType=${SPECIFICATION_LIST_VIEW}">View</a></li>
						</ul>
					</li>
                    <li><span class="dir">Product</span>
						<ul>
							<li><a href="getProductList.do">View</a></li>				
						</ul>
					</li>			
	  		</ul>	  
	  </s:if>	  
	  <s:if test='%{#session.usr == "menu"}' >    		
			<ul>
					<li><span class="dir">Brand</span>
						<ul>
							<li><a href="commonList.do?pageType=${BRAND_LIST}">Edit</a></li>
			                <li><a href="addBrand.do">Add</a></li>                    					
						</ul>
					</li>
                    <li><span class="dir">Category</span>
						<ul>
							<li><a href="commonList.do?pageType=${CATEGORY_LIST}">Edit</a></li>
			                <li><a href="addCategory.do">Add</a></li>                    					
						</ul>
					</li>
					<li><span class="dir">Main Specification</span>
						<ul>
							<li><a href="commonList.do?pageType=${MAIN_SPECIFICATION_LIST}">Edit</a></li>
			                <li><a href="addMainSpecification.do">Add</a></li>			
						</ul>
					</li>
                    <li><span class="dir">Product</span>
						<ul>
							<li><a href="getProductList.do">Edit</a></li>
			                <li><a href="addProduct.do">Add</a></li>
			                <s:if test='%{usersPrivProductClassificat!=null}'>
			                	<li><a href="classificateProducts.do">Classification</a></li>
			                </s:if>
						</ul>
					</li>
					<s:if test='%{usersPrivCurrency!=null}'>
						<li>
							<span class="dir">Currency</span>
							<ul>
								<li><a href="editCurrency.do">Edit</a></li>
				                <li><a href="addCurrency.do">Add</a></li>
							</ul>
						</li>
			        </s:if>	
	  		</ul>	  			  
	  	</s:if>
	  	
	  	<s:if test='%{#session.usr == "amender"}' >
			<ul>
				<li><a href="getProductList.do">Amend Product</a></li>
	  		</ul>	  	
	  	</s:if>	  	
	  	
	  </s:if>	  
  </li>	
	<li id="PoHandling" style="visibility:hidden;display:none;"><span class="dir">Utilities</span>
	<s:if test="#isLogin">
				<ul>
			<li><span class="dir">Asia Miles</span>
				<ul>
					<li><a href="transform.do">Transform XLS to PDF</a></li>
				</ul>
			</li>
			
			
			<li><span class="dir">Advantage</span>
				<ul>
					<li><a href="transformXLSADV.do">Transform XLS to PDF</a></li>
				</ul>
			</li>
			
			
			
			<li><span class="dir">Inbox</span>
				<ul>
					<li><a href="transformXML.do">Transform XML to PDF</a></li>
				</ul>
			</li>			
		</ul>	
	</s:if>
	</li>
	
		
	<!-- ********************************** Order management ******************************* -->
	
		<li id="orderMenu"><span class="dir">Order Management</span>
	<s:if test="#isLogin">
		<ul>
			<s:if test="%{superAdmin!=null}">
			<li><span class="dir">Creation</span>
				<ul>
					<li><a href="goToCreateOrdersAutoRemoteFile.do">From Remote PO File</a></li>
					<li><a href="goToCreateOrdersAuto.do">From Local PO File</a></li>
					<li><a href="goToCreateOrdersManual.do?init=1">Manual</a></li>
				</ul>
			</li>
			</s:if>
			
			<li><span class="dir">Handling</span>
				<ul>
					<li><a href="goToReportOrders.do?init=2">Handling</a></li>
				</ul>
			</li>
			
			<s:if test="%{superAdmin!=null}">
			<li><span class="dir">Updated By XLS File </span>
				<ul>
					<li><a href="goToUploadAdminXLS.do?init=1">Products Shipped</a></li>
					<li><a href="goToUploadAdminXLS.do?init=2">Stock</a></li>
					<li><a href="goToUploadAdminXLS.do?init=3">Special Shipping Rate</a></li>
					<li><a href="goToUploadAdminXLS.do?init=4">ETA Report</a></li>
					<!--<li><a href="ordersAdminXLS.do?init=1">Export</a></li>-->			
				</ul>
			</li>
		   <li><span class="dir">Orders Invoiced</span>
				<ul>
					<li><a href="goToInvoicedOrders.do?init=2">Orders Invoiced</a></li>
					<li><a href="generateInvoice.do">Generate Invoice</a></li>
				</ul>
		   </li>
		   
		    <s:if test='%{usersPrivOrdersMapping!=null}'>
		  	<li><span class="dir">Orders Mapping</span>
				<ul>
					<li><a href="ordersFileMapper.do">Orders Mapping</a></li>
				</ul>
		   	</li>
		   	</s:if>
		   	
		  <li><span class="dir">get Orders By PO</span>
				<ul>
					<li><a href="getOrdersByPOSumit.do?sumit=3">get Orders By PO</a></li>
				</ul>
		   </li>
		   
		   </s:if>	
				
		</ul>	
	</s:if>
	</li>
	
	<!-- *********************************************************************************** -->
	
	
	
	<s:if test="#isLogin"> 
    	<li id="liUserLogin" style="color:blue;background: transparent; border: 0px;width: 270px; border: solid 0px;">
    		<table border="0">
    		<tr>
    		<td width="20px"></td>
    		<td width="70px" align="left"><I style="color:rgb(119,119,119);font-size: 11pt;font-weight: normal; font-family: Arial,Verdana;">Welcome</I></td>
    		
    		<td> <a  id="userLogin" style="align:left;border: 0px;color: rgb(44,140,171);font-size: 16px;font-weight: normal;font-family: Verdana, Arial;padding-left: 0px; padding-right: 0px;" href=""><I><%=request.getSession(true).getAttribute("login")%></I></a></td>
    		</tr>
    		</table>

    	</li>
    	<%@ include file="dialogsPop/logoutPop.jsp" %> 
    </s:if>
    <s:else>

    	<li id="liSign_in_link" style="color:blue;background: transparent; border: 0px;width: 270px; border: solid 0px;">
    	<table border="0">
    	<tr>
    	<td width="20px"></td>
    	<td><a id="sign_in_link" href="signInPop.do" style="align:left;border: 0px;color: rgb(44,140,171);font-size: 16px;font-weight: normal;font-family: Verdana, Arial;padding-left: 0px; padding-right: 0px;"><I><s:text name="loyauty.common.title.signIn"/></I></a></td>
    	</tr>
    	</table>
    	</li>
    </s:else>
</ul>
</div>	
</div>
<!-- / END -->
</div>
</div>
<!-- END TOP MENU --> 


<script type="text/javascript">
//<a href="user/logout.do">Log Out</a>
	$(document).ready(function() {
		$("a#sign_in_link").fancybox(LoyaltyDatatableTypes.AjaxNoCache);
	});
</script>

<script type="text/javascript">
/* <![CDATA[ */ 

var showLogoutPop=0;
$(document).ready(function() {
		var user = '<s:property value="usr" />';
		var session = '<%=request.getSession(true).getAttribute("usr")%>';

	    //When the user click on the menu log
	    $("#userLogin").click(function(){ 
	    	if(showLogoutPop==0){
				$("#logoutPop").css("display","block"); 
				$("#logoutPop").css("visibility","visible");
				showLogoutPop=1;
	    	}else{
				$("#logoutPop").css("display","none");  
				$("#logoutPop").css("visibility","hidden");
				showLogoutPop=0;
	    	}
		});

	    //When the user click on the menu log we must cancel submit 
	    $("#userLogin").click(function(){ 
			return false;
		});

	    //When the user admin click on the button Log Out
	    $("#execteHrefLogOut").click(function(){ 
	    	//click on the button submit of the page logoutPop to log out
	    	$('#submitLogOut').click();
		});
	
	    //hide logoutPop when user click on page 
	    $("body").click(function(){ 
	    	$("#logoutPop").css("display","none");  
			$("#logoutPop").css("visibility","hidden");
			showLogoutPop=0;
		});
	    
		
	    //when mouse over on My Profile 
	    $("#myProfile").mouseover(function(){ 
	    	$("#myProfile").css("color","rgb(204,5,5)"); 
		});
	    
		
	    //when mouse over on My Profile 
	    $("#myProfile").mouseout(function(){ 
	    	$("#myProfile").css("color","rgb(57,166,200)"); 
		});
	    
		
	    //when Admin click on text "My Profile" in logoutPop
	    $("#myProfile").click(function(){ 
	    	$("#submitMyProfile").click(); 
		}); 




		
	    //when mouse over on Note 
	    $("#noteAdmin").mouseover(function(){ 
	    	$("#noteAdmin").css("color","rgb(204,5,5)"); 
		});
	    
		
	    //when mouse over on Note 
	    $("#noteAdmin").mouseout(function(){ 
	    	$("#noteAdmin").css("color","rgb(57,166,200)"); 
		});

		
	    //when Admin click on text "Notes" in logoutPop
	    $("#noteAdmin").click(function(){ 
	    	$("#submitNoteAdmin").click(); 
		}); 
 
		
});	

/*  ]]> */
</script>

