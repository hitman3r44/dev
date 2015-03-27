<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/loyalty/order/orderManager.js"></script> 
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
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Create Order from File</div>

  <div id="formContainer" style="padding-bottom: 60px;">
  <br/> <br/>
  
  
  
  <form id="form" action="createOrdersAuto.do" method="post" enctype="multipart/form-data">

 	<!-- .......... Hidden variables to use when admin do an action event ........ -->
 	<s:hidden id="orderSelected" name="orderSelected" value=""/>
 	<s:hidden id="showOrderSignal" name="showOrderSignal" value="0"/>
 	<s:hidden id="okShowOrderSignal" name="okShowOrderSignal" value="0"/>
 	<s:hidden id="saveOrdersSignal" name="saveOrdersSignal" value="0"/>
 	<s:hidden id="confirmSaveOrdersSignal" name="confirmSaveOrdersSignal" value="-1"/>
 	
 	<!-- ......................................................................... -->
  
  <table border="0" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 border-bottom: 1px solid #CCCCCC;border-top: 2px solid #CCCCCC; vertical-align:top;">

								
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
				
				
				<!-- ...................... Client File ............... -->
				<tr>
				<td style="padding-left: 10px;">Upload File:</td>
				<td style="padding-right: 10px;"><input type="file" name="orderFile" /></td>
				</tr>
				<!-- ................................................... -->
				
				
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->


				<!-- ...................... Client Login ............... -->
				<tr>
				<td style="padding-left: 10px;width:140px;">Client Login:</td>
				<td>
					<div class="ui-widget">
		   			<span style="font-size:12px;">
		   			<input type="text" id="txtUserLoginTo" name="userLogin" value='<s:property value="%{userLogin}"/>' Style="width:150px"  autocomplete="off"/>
		   			</span>
		   			</div>
		   			<div style="position:absolute;">  
		   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
		   			 		 style="height:67px;width:155px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					    <option></option>
					 </select>
		   			</div>
				</td>
				</tr>
				<!-- ................................................... -->
											
				
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
				
				
				<!-- ...................... submit ..................... -->
				<tr>
				<td style="padding-left: 10px;width:140px;"/>
				<td align="left"><input type="submit" value="Upload" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
				</tr>
				<!-- ................................................... -->
				
												
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
	</table>
 	</form>
 
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
  <br/><br/>
 <s:if test="%{listOrdersDTO.size > 0}" >
   	<table border="0" width="100%">
 	<s:iterator value="listOrdersDTO" id="order">

 	<tr style='<s:property value="#order.cssStyle"/>'>
	<td>
	 	<table width="100%" border="0">
	 	<!-- LS ORDER ID -->
	 	<tr  height="20px">
	 		<td align="right" width="91%">LS ORDER ID:</td>
		 	<td align="right" style="padding-right: 10px;"><s:property value="#order.lsOrderId"/></td>
	 	</tr>
	 	<!-- PO NUMBER -->
	 	<tr  height="20px">
	 		<td align="right" width="91%">PO NUMBER:</td>
		 	<td align="right" style="padding-right: 10px;"><s:property value="#order.productOrderNumber"/></td>
	 	</tr>
	 	<!-- PO DATE -->
	 	<tr  height="20px">
	 		<td align="right" width="80%">PO DATE:</td>
		 	<td align="right" style="padding-right: 10px;"><s:property value="#order.productOrderDate"/></td>
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
	 			<td><s:property value="#order.lastName"/> <s:property value="#order.firstName"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT OTHER NAMES:</td>
	 			<td><s:property value="#order.clientOtherNames"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT STREET:</td>
	 			<td><s:property value="#order.addressStreet"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT ADRESS:</td>
	 			<td><s:property value="#order.addressStreetOther"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT CITY:</td>
	 			<td><s:property value="#order.addressCity"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT PROVINCE:</td>
	 			<td><s:property value="#order.addressState"/></td>
	 			</tr>
	 			<tr height="20px">
	 			<td>CLIENT POSTAL CODE:</td>
	 			<td><s:property value="#order.addressPostalCode"/></td>
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
	 		<td>PRODUCT TITLE</td>
	 		<td>UNIT PRICE</td>
	 	</tr>
	    <s:iterator value="#order.rowsList" id="cell">
	    <!-- Order Rows -->
	    <tr height="30px" valign="middle" align="center">
	    	<td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.quantity" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.lsProductID" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.productDescription" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:property value="#cell.unitPrice" /></td>	        
	    </tr>
	    <!-- Heel of Order Rows -->
	    <tr height="30px" style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;">
	    	<td align="right" colspan="3">SHIPPING FEE:</td>
	 		<td><s:property value="#cell.shippingFee" /></td>
	    </tr>
	    <tr height="30px" style="border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;">
	    	<td align="right" colspan="3">SHIPPING COMPANY:</td>
	 		<td><s:property value="#cell.shippingCompany" /></td>
	    </tr>
	    <tr height="30px" style="border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;">
	    	<td align="right" colspan="3">TRACKING NUMBER:</td>
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
	 	<td><input id="btSaveOrders" type="button" value="Save Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/></td>
	 </tr>
	</table>
 </s:if>
  	<!-- ......................................................................... -->	
 
  
	<!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/notificationPop.jsp" %>
	<!-- ......................................................................... -->
	
<script type="text/javascript" charset="utf-8">
// Jquery Function main 
$(document).ready(function() { 


	/*----------------------------- Disabled Enter and BackSpace ----------------------------- 
	 					This method is very imported for disable 
	 				undesirable behavior of BackSpace and Enter Key 
	  ----------------------------------------------------------------------------------------*/
	$(document).keydown(function(e){
		   if (e.keyCode == 8 || e.keyCode == 13 || e.keyCode == 32) { 
			 if(e.target.tagName!="INPUT")return false;
			}
		});
	
	
	//when Admin click on the button show order
	$('#columnShowOrders input[id="btShowOrder"]').click( function(){
		var index=$('#columnShowOrders input[id="btShowOrder"]').index(this);
		var orderNumber=$('#rowOrderNumber td[id="columnOrderNumber"]').eq(index).text(); 
		orderNumber=orderNumber.replace(/^\s\s*/, '');    
		orderNumber=orderNumber.replace(/\s\s*$/, '');   
		orderNumber=orderNumber.replace(/([\s]+)/g, '-'); 
		$("#orderSelected").val(orderNumber);
		var orderval =$("#orderSelected").val();
		$("#showOrderSignal").val("1");
		$('#form').trigger("submit");
		
	});
	
	//when Admin click on the button show order
	$("#btOk").click( function(){
		$("#okShowOrderSignal").val("1");
		$("#confirmSaveOrdersSignal").val("1");
		$('#form').trigger("submit");
		
	});
	
	//when Admin click on the button saveOrders
	$("#btSaveOrders").click( function(){
		$("#saveOrdersSignal").val("1");
		$('#form').trigger("submit");
		
	});
	
});

</script>

</div>
</div>

