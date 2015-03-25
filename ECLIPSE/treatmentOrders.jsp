<%@ taglib prefix="s" uri="/struts-tags" %>
<link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/loyalty/order/orderManager.js"></script>
<script type="text/javascript" src="scripts/jquery-ui.min.js"></script> 
<script type="text/javascript">
	$("#topMenuRed").hide();

</script>

<style type="text/css">
label{
	width:170px;
}
.vanadium-advice {
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}

</style>
<div id="page" class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Treatment Of Orders</div>

  <div id="formContainer" style="padding-bottom: 60px;">
  <br/> <br/>

  <form id="form" action="treatmentOrders.do" method="post" enctype="multipart/form-data">

 	<!-- .......... Hidden variables to use when admin do an action event ........ -->
 	<s:hidden id="orderSelected" name="orderSelected" value=""/>
 	<s:hidden id="showOrderSignal" name="showOrderSignal" value="0"/>
 	<s:hidden id="okShowOrderSignal" name="okShowOrderSignal" value="0"/>
 	<s:hidden id="lsOrderId" name="lsOrderId" value="-1"/>
 	<s:hidden id="indexOrder" name="indexOrder" value="-1"/>
 	<s:hidden id="indexRow" name="indexRow" value="-1"/>
 	<s:hidden id="checkBoxPrintSignal" name="checkBoxPrintSignal" value="0"/>
 	<s:hidden id="checkBoxPrint" name="checkBoxPrint"/>
 	<s:hidden id="pageTop" name="pageTop" value="0" />
 	
 	<!-- Find Options -->
 	<s:hidden id="findOrdersSignal" name="findOrdersSignal" value="0" />
 	<s:hidden id="frmUserLogin" name="userLogin" value="" />
 	<s:hidden id="frmStatus" name="status" value="" />
 	<s:hidden id="frmStrCreationDate" name="strCreationDate" value=""/>
 	
 	</form>
 	
	<!-- FORM FOR DOWNLOAD --> 
   <form id="formToPrint" action="printOrdersToPDF.do" method="post" enctype="multipart/form-data">
		<s:hidden id="tansformTreatSignal" name="tansformTreatSignal" value="0"/>
		<s:hidden id="printAllOrdersSignal" name="printAllOrdersSignal" value="0"/>
   </form>
 
  <!-- ............................. TABLE USER LOGIN ............................ -->
  <table id="tabLogin" width="100%" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:top;">
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="7"/>
				</tr>
				<!-- ....................Search Options.................... -->
				<tr height="35px">
				
				<!-- ...Login... -->
				<td style="padding-left: 5px;width:80px;">Client Login:</td>
				<td>
					<div class="ui-widget">
		   			<span style="font-size:12px;">
		   			<s:textfield  id="txtUserLoginTo" name="userLogin" value="%{userLogin}" cssStyle="width:150px"  autocomplete="off"/>
		   			</span>
		   			</div>
		   			<div style="position:absolute;">  
		   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
		   			 		 style="height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					    <option></option>
					 </select>
		   			</div>
				</td>
				
				<!-- ...Status... -->
				<td style="padding-left: 5px;width:45px;">Status:</td>
				<td style="padding-left: 5px;"><s:textfield id="status" name="status" value="%{status}"/></td>
				
				<!-- ...Creation Date... -->
				<td style="padding-left: 5px;width:90px;">Creation Date:</td>
				<td style="padding-left: 5px;">
					<s:date id="creationDate" name="creationDate" var="creationDate" format="dd/MM/yyyy"/>
					<s:textfield id="datepicker" name="strCreationDate" value="%{#creationDate}" 
					             key="labelkey" readonly="true" cssStyle="width:150px;" /></td>
			    
			    <td style="padding-left: 5px;"><img id="iconFindOrders" src="images/orders/findOrders.png"/></td>
				</tr>					
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="7"/>
				</tr>
				<!-- .................................................... -->						
    </table>

    <!-- ............................ List users .................................. --> 
	<select id="list"  style="visibility:hidden;display:none;">
		<s:iterator value="%{usersList}" id="row">
			        <s:iterator value="%{#row}" id="cell">
					    <option>
						<s:property value="%{#cell.login}"/> 
						</option>
					</s:iterator>           
		</s:iterator> 
	</select> 
 	<!-- ......................................................................... -->
 
 
  <!-- ............................. Orders List ............................... -->
  <br/>
  Result:<s:property value="%{listOrdersDTO.size}"/>
  <br/><br/>
  
  
  
  <!-- ******************************************************************************* -->
  
  
  <table id="tabOrderOrders" width="100%" border="1" class="nowraptable datatable" >
	<thead class="gray_header">
		<tr height="25px">
			<th>Creation Date</th>
			<th>Partner Login</th>
			<th>PO Date</th>
			<th>Client Full Name</th>
			<th>Client Phone</th>
			<th>Client Email</th>
			<th align="right"> <img alt="" src="images/orders/printPDF.png"> </th>
		</tr>
	</thead>
	<tbody>
	 <s:if test="%{listOrdersDTO.size > 0}" >
	<s:iterator  value="listOrdersDTO" id="order">
		<s:if test="%{index==0}">
		<tr id="rowUser" class="row_with_color">
		<td align="right" style="padding-right: 10px;"><s:date name="productOrderDate" format="dd/MM/yyyy" /></td>											
		<td><s:property value="#order.clientLastName"/> <s:property value="#order.clientFirstName"/></td>
		<td align="right" style="padding-right: 10px;"><s:date name="productOrderDate" format="dd/MM/yyyy" /></td>	
		<td><s:property value="#order.clientLastName"/> <s:property value="#order.clientFirstName"/></td>
		<td><s:property value="#order.clientPhone"/></td>
		<td><s:property value="#order.clientEmail"/></td>													
		</tr>
		</s:if>
		<s:else>
		<tr id="rowUser" class="row_without_color">
											
		</tr>
		</s:else>
										
	</s:iterator>
	</s:if>
	</tbody>
		       
  </table>
  
  
  
  
  
  <!-- ******************************************************************************* -->
 <s:if test="%{listOrdersDTO.size > 0}" >
   	<table border="0" width="100%">
 	<s:iterator value="listOrdersDTO" id="order">

 	<tr style='<s:property value="#order.cssStyle"/>'>
	<td>
	 	<table width="100%" border="0">
	 	<!-- LS ORDER ID -->
	 	<tr  height="20px">
	 		<td style="padding-left: 65%" width="80%">LS ORDER ID:</td>
		 	<td id="columnOrders" align="right" style="padding-right: 10px;"> <center id="lsOrderId" style="text-align:right;"><s:property value="#order.lsOrderId"/></center></td>
	 	</tr>
	 	<!-- PO NUMBER -->
	 	<tr  height="20px">
	 		<td style="padding-left: 65%" width="80%">PO NUMBER:</td>
		 	<td align="right" style="padding-right: 10px;"><s:property value="#order.productOrderNumber"/></td>
	 	</tr>
	 	<!-- PO DATE -->
	 	<tr  height="20px">
	 		<td style="padding-left: 65%" width="80%">PO DATE:</td>
		 	<td align="right" style="padding-right: 10px;"><s:date name="productOrderDate" format="dd/MM/yyyy" /></td>
	 	</tr>
	 	<!-- REQUIRED DATE -->
	 	<tr  height="20px">
	 		<td style="padding-left: 65%" width="80%">REQUIRED DATE:</td>
		 	<td align="right" style="padding-right: 10px;"><s:property value="#order.requiredDate"/></td>
	 	</tr>

	 	
	 	<!-- DUPLICATE AND PRINT-->
	 	<tr  height="30px" valign="bottom">
	 		<td id="columnIconDuplicate" style="padding-left: 65%" width="80%">
		 		<table>
		 		<tr>
		 		<td><img id="iconDuplicate" src="images/orders/iconOrderDuplicate.png"/> </td>
		 		<td width="30px"/>
				<td style='background-image:url("images/orders/printOrder.png");background-repeat: no-repeat;padding-left: 0px; padding-left: 20px;'>
					<s:a href="%{fileDownload}">
					<s:if test='%{print==true}' >
				 		<s:checkbox id="checkBoxPrintItem" name="checkBoxPrintItem" value="true"/><s:property value="#order.print"/>
					</s:if>
					<s:else>
						<s:checkbox id="checkBoxPrintItem" name="checkBoxPrintItem" value="false"/><s:property value="#order.print"/>
					</s:else>
				 </s:a></td>
		 		</tr>
		 		</table>
	 		</td>
		 	<td align="right" style="padding-right: 10px;"></td>
	 	</tr>
	 	
	 	<!-- SIPARATOR -->
	 	<tr height="20px" valign="middle">
	 		<td colspan="2"></td>
	 	</tr>
	 	
	 	<!-- SHIP TO -->
	 	<tr height="20px" valign="middle">
	 		<td style="color:red;text-decoration:underline;">SHIP TO</td>
	 	</tr>
	 	<tr>
	 		<td align="left" width="100%" colspan="2"  style="padding-left: 10px;">
	 		<!-- SHIP TO -->
	 		<table>
	 			<tr height="20px">
	 			<td>CLIENT NAME:</td>
	 			<td><s:property value="#order.clientLastName"/> <s:property value="#order.clientFirstName"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT OTHER NAMES:</td>
	 			<td><s:property value="#order.clientOtherNames"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT STREET:</td>
	 			<td><s:property value="#order.clientStreet"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT ADRESS:</td>
	 			<td><s:property value="#order.clientOtherStreet"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT CITY:</td>
	 			<td><s:property value="#order.clientCity"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT PROVINCE:</td>
	 			<td><s:property value="#order.clientProvince"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT POSTAL CODE:</td>
	 			<td><s:property value="#order.clientPostalCode"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT PHONE:</td>
	 			<td><s:property value="#order.clientPhone"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT EMAIL:</td>
	 			<td><s:property value="#order.clientEmail"/></td>
	 			</tr>
	 		</table>
	 		</td>
	 	</tr>
	 	</table>
	</td>
 	</tr>
 	<!-- ITEMS -->
 	<tr height="30px" valign="middle" style='<s:property value="#order.cssStyle"/>border-top: 0px solid #CCCCCC;'>
 		<td style="color:red;text-decoration:underline;">ITEMS</td>
 	</tr>
 	<tr style='<s:property value="#order.cssStyle"/>'>
 		<td>
	 	<table width="100%">
	 	<!-- Headers -->
	 	<tr height="30px" valign="middle" align="center" style="font-weight: bold;border: 0px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;"">
	 		<td>QUANTITY</td>
	 		<td>LS PRODUCT ID</td>
	 		<td>STOCK</td>
	 		<td>PRODUCT TITLE</td>
	 		<td>UNIT PRICE</td>
	 	</tr>
	    <s:iterator value="#order.rowsList" id="cell">
	    <!-- Order Rows -->
	    <tr height="30px" valign="middle" align="center">
	    	<td id="columnQuantity" style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
  		 		       <center id="lsOrderId" style="visibility:hidden;display:none;"><s:property value="#order.lsOrderId"/></center>
  		 		       <center id="rowIndex" style="visibility:hidden;display:none;"><s:property value="#cell.index" /></center>
  		 		       <s:property value="#cell.quantity" /> Split to: <input  id="quantityToChange" style="width: 50px;" type="text" value='<s:property value="#cell.quantityToSplit" />'/></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.lsProductID" /></td>
  		    <td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.stock" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.productDescription" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.unitPrice" /></td>	        
	    </tr>
	    <!-- Heel of Order Rows -->
	    <tr height="30px" style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;">
	    	<td align="right" colspan="4">SHIPPING FEE:</td>
	 		<td><s:property value="#cell.shippingFee" /></td>
	    </tr>
	    <tr height="30px" style="border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;">
	    	<td align="right" colspan="4">SHIPPING COMPANY:</td>
	 		<td><s:property value="#cell.shippingCompany" /></td>
	    </tr>
	    <tr height="30px" style="border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;">
	    	<td align="right" colspan="4">TRACKING NUMBER:</td>
	 		<td><s:property value="#cell.trackingNumber" /></td>
	    </tr>
	    </s:iterator>
	    </table>
	    </td>
	 </tr>
	 <!-- SEPARATOR -->
	 <tr height="30px" valign="middle">
	 	<td/>
	 </tr>
	</s:iterator>
	 <tr height="30px" valign="middle" align="center">
	 	<td>
	 		<input id="btSaveOrders" type="button" value="Save Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input id="btPrintOrders" type="button" value="Print Orders Selected" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input id="btPrintAllOrders" type="button" value="Print All Srders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		</td>
	 	
	 </tr>
	</table>
 </s:if>
  	<!-- ......................................................................... -->	
 
  <!-- <s:property value="%{lsProductID}"/>-->
  
  
  
	<!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/notificationPop.jsp" %>
	<!-- ......................................................................... -->
	
<script type="text/javascript" charset="utf-8">
// Jquery Function main 
var pageTop=0;
var scrollTop;
$(function() {
	var pageTop = <%= request.getParameter("pageTop") %>;
	$(window).scrollTop(pageTop);
});


$(function() {
	    $("#datepicker").datepicker({
	     dateFormat: 'dd/mm/yy',
         changeMonth: true,
         changeYear: true
      });
 });

$(document).ready(function() { 

	

	
	//when Admin click on the icon findOrders.png
	$("#iconFindOrders").click( function(){
		var userLogin=$("#txtUserLoginTo").val();
		var status=$("#status").val();
		var strCreationDate=$("#datepicker").val();
		$("#frmUserLogin").val(userLogin);
		$("#frmStatus").val(status);
		$("#frmStrCreationDate").val(strCreationDate);
		$("#findOrdersSignal").val(1);
		$('#form').trigger("submit");
	});
	
	//when Admin click on the button [save All] of popup dialog 
	$("#btSaveAll").click( function(){
		$("#saveOrdersSignal").val("1");
		$("#confirmSaveOrdersSignal").val("1");
		$('#form').trigger("submit");
		
	});
	//when Admin click on the button [Orders Lacking] of popup dialog 
	$("#btOrdersLacking").click( function(){
		$("#saveOrdersSignal").val("1");
		$("#confirmSaveOrdersSignal").val("2");
		$('#form').trigger("submit");
	});
		
	//when Admin click on the button [cancel] of popup dialog 
	$("#btCancel").click( function(){
		$("#saveOrdersSignal").val("1");
		$("#confirmSaveOrdersSignal").val("3");
		$('#form').trigger("submit");	
	});
	

	//when Admin click on the button saveOrders
	$("#btSaveOrders").click( function(){
		$("#saveOrdersSignal").val("1");
		$("#pageTop").val(0);
		$('#form').trigger("submit");
		
	});

	//when Admin click on the checkBox Print
	$('#columnIconDuplicate #checkBoxPrintItem').click( function(){
		var index=$('#columnIconDuplicate #checkBoxPrintItem').index(this);
		var checkBoxPrintItem=$('#columnIconDuplicate #checkBoxPrintItem').eq(index).attr("checked");
		var lsOrderIdToPrint=$("#columnOrders #lsOrderId").eq(index).text();
		$("#lsOrderId").val(lsOrderIdToPrint);
		//recovery options find values
		var userLogin=$("#txtUserLoginTo").val();
		var status=$("#status").val();
		var strCreationDate=$("#datepicker").val();
		$("#frmUserLogin").val(userLogin);
		$("#frmStatus").val(status);
		$("#frmStrCreationDate").val(strCreationDate);
		//checked print etem 
		$("#checkBoxPrintSignal").val(1);
		$("#checkBoxPrint").val(checkBoxPrintItem);
		$("#indexOrder").val(index);
		$("#indexOrder");
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});
	
	//when Admin click on the button Print 
	$('#btPrintOrders').click( function(){
		$('#tansformTreatSignal').val(1);
		$('#printAllOrdersSignal').val(0);
		$('#formToPrint').trigger("submit");
	});
	
	//when Admin click on the button Print All Orders 
	$('#btPrintAllOrders').click( function(){
		$('#tansformTreatSignal').val(1);
		$('#printAllOrdersSignal').val(1);
		$('#formToPrint').trigger("submit");
	});
	
});




</script>
	
 	
 	

</div>
</div>

