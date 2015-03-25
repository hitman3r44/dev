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
<div id="page" class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Create Order from File</div>

  <div id="formContainer" style="padding-bottom: 60px;">
      
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if> 
  <br/> <br/>

  <form id="form" action="createOrdersAuto.do" method="post" enctype="multipart/form-data">
 	<!-- .......... Hidden variables to use when admin do an action event ........ -->
 	<s:hidden id="orderSelected" name="orderSelected" value=""/>
 	<s:hidden id="showOrderSignal" name="showOrderSignal" value="0"/>
 	<s:hidden id="okShowOrderSignal" name="okShowOrderSignal" value="0"/>
 	<s:hidden id="saveOrdersSignal" name="saveOrdersSignal" value="0"/>
 	<s:hidden id="confirmSaveOrdersSignal" name="confirmSaveOrdersSignal" value="0"/>
 	<s:hidden id="duplicateOrderSignal" name="duplicateOrderSignal" value="0"/>
 	<s:hidden id="okSaveSuccessPopSignal" name="okSaveSuccessPopSignal" value="0"/>
 	<s:hidden id="lsOrderId" name="lsOrderId" value="-1"/>
 	<s:hidden id="quantityToChange" name="quantityToChange" value="0"/>
 	<s:hidden id="quantityToChangeSignal" name="quantityToChangeSignal" value="0"/>
 	<s:hidden id="indexOrder" name="indexOrder" value="-1"/>
 	<s:hidden id="indexRow" name="indexRow" value="-1"/>
 	<s:hidden id="checkBoxPrintSignal" name="checkBoxPrintSignal" value="0"/>
 	<s:hidden id="checkBoxPrint" name="checkBoxPrint"/>
 	<s:hidden id="pageTop" name="pageTop" value="0" />
 	<s:hidden id="oploadedFileNameFrm" name="oploadedFileName" value="" />
 	 
 	<!-- ......................................................................... -->
  
  <table>
  <tr>
  	  <!-- ................................. USER LOGIN .......................... -->
	  <td>
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
				<td style="padding-right: 10px;"><s:file id="fileToUpload" type="file" name="orderFile" /></td>
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
				<td align="left"><input type="button" id="btUpload" value="Upload" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
				</tr>
				<!-- ................................................... -->
						
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
	  </table>
	  </td>
	  <!-- ................................. USER LOGO .......................... -->
	  <td width="450px" align="right" valign="top">
	  <s:if test="%{userLogo==null}" >
	   <img alt="" width="355px" height="70px" src='<s:property value="%{userLogo}"/>'/>
	  </s:if>
	  <s:else>
	  	  <img alt="" width="355px" height="70px" src='<s:property value="%{userLogo}"/>'/>
	  </s:else>
	  </td>
  </tr>
  </table>
  
  </form>
	<!-- FORM FOR DOWNLOAD --> 
    <form id="formToPrint" action="printOrdersToPDF.do" method="post" enctype="multipart/form-data">
   		<s:hidden id="strPrintInPDFForm" name="strPrint" value="null" />
		<s:hidden id="tansformAutoSignal" name="tansformAutoSignal" value="0"/>
		<s:hidden id="printAllOrdersSignal" name="printAllOrdersSignal" value="0"/>
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
  Result:<s:property value="%{listOrdersDTO.size}"/>
  <s:hidden id="sizeResult" name="sizeResult" value="%{listOrdersDTO.size}"/>
  <br/>
  <br/>
 <s:if test="%{listOrdersDTO.size > 0}" >
   	<table border="0" width="100%">
 	<s:iterator value="listOrdersDTO" id="order">

 	<tr>
	<td  style='<s:property value="#order.cssStyle"/>border-bottom: 0px solid #CCCCCC;'>
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
		 	<td align="right" style="padding-right: 10px;"><s:date name="creationDate" format="dd/MM/yyyy" /></td>
	 	</tr>
	 	<!-- REQUIRED DATE -->
	 	<tr  height="20px">
	 		<td style="padding-left: 65%" width="80%">REQUIRED DATE:</td>
	 	<td align="right" style="padding-right: 10px;"><s:date name="#order.requiredDate" format="dd/MM/yyyy" /></td>
	 	</tr>

	 	<!-- DUPLICATE AND PRINT-->
	 	<tr  height="30px" valign="bottom">
	 		<td id="columnIconDuplicate" style="padding-left: 65%" width="80%">
		 		<table>
		 		<tr>
		 		<td><img id="iconDuplicate" src="images/orders/iconOrderDuplicate.png"/> </td>
		 		<td width="30px"/>
				<td id="colomnPrintItems" style='background-image:url("images/orders/printOrder.png");background-repeat: no-repeat;padding-left: 0px; padding-left: 20px;'>
					<s:a href="%{fileDownload}">
					<s:if test='%{print==true}' >
				 		<s:checkbox id="checkBoxPrintItem" name="checkBoxPrintItem" value="true"/>
					</s:if>
					<s:else>
						<s:checkbox id="checkBoxPrintItem" name="checkBoxPrintItem" value="false"/>
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
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
  		 		<s:if test="%{#cell.unitPrice!=null && #cell.currencyId == 1}">
  		 			<s:property value="#cell.unitPrice" />
  		 		</s:if>
  		 		<s:if test="%{#cell.unitPrice!=null && #cell.currencyId != 1}">
  		 			<span style="color:#0000FF;">
  		 				<s:property value="#cell.currencyUnitPrice" /> <s:property value="#cell.currencySymbol" />
  		 			</span>
  		 		</s:if>
			</td>	        
	    </tr>
	    <!-- Heel of Order Rows -->
	    <tr height="30px" style="border-left: 1px solid #CCCCCC; border-right: 0px solid #CCCCCC;">
	    	<td align="right" colspan="4">SHIPPING COMPANY:</td>
	 		<td><s:property value="#cell.shippingCompany" /></td>
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
	 	<s:if test="%{notSaved==0}" >
	 		<input id="btSaveOrders" type="button" value="Save Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input id="btPrintOrders" type="button" value="Print Selected Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input id="btPrintAllOrders" type="button" value="Print All Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;visibility:hidden;display:none;"/>
	 	</s:if>
		 	
	 	<s:else>
	 		<input id="btSaveOrders" type="button" value="Save Orders" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input type="button" value="Print" disabled="disabled" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/>
		 	<input type="button" value="Print All Orders" disabled="disabled" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;visibility:hidden;display:none;"/>
	 	
	 	</s:else></td>
	 	
	 </tr>
	</table>
 </s:if>
 <!-- ......................................................................... -->	
  
 <!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/notificationPop.jsp" %>
 <!-- ......................................................................... -->
	
  
 <!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/saveSuccessPop.jsp" %>
 <!-- ......................................................................... -->	

<script type="text/javascript" charset="utf-8">
// Jquery Function main 
var pageTop=0;
var scrollTop;
$(function() {
	var pageTop = <%= request.getParameter("pageTop") %>;
	$(window).scrollTop(pageTop);
});

$(document).ready(function() { 
	/*------------------------- check checkBox without submit -------------------------------- 
	Pour éviter d'aller à chaque changement du check box on utilise un string qui porte
	les valeurs de tous les check Box et une fois on click sur le un bouton de print ou
	getXSL on envoie juste cette string, c'est une méthode intelligente pour soulager 
	le server et pour éviter les secousse de barre de défilement
 	----------------------------------------------------------------------------------------*/
	var arrayPrint = [];
	var sizeResult=$("#sizeResult").val();
	for(i=0;i<sizeResult;i++){
		arrayPrint[i] =false;
	};

	function createStrPrint(){
		var index=0;
		$('#colomnPrintItems input[id="checkBoxPrintItem"]').each(function() {
			arrayPrint[index]=$(this).attr('checked');
			index++;
		});
		var strPrint="";
		for(i=0;i<arrayPrint.length;i++){
			if(arrayPrint[i]==true){
				strPrint+=i+";t,";
			}else{
				strPrint+=i+";f,";
			}
		};
		if(strPrint.length>0)strPrint = strPrint.substring(0, strPrint.length-1);
		$('#strPrintInPDFForm').val(strPrint);
		$('#strPrintInAdminXLS').val(strPrint);
		
	}
	
	/*------------------------------------- Upload File -------------------------------------- 
							when Admin click on the button Upload
	  ----------------------------------------------------------------------------------------*/
	$("#btUpload").click( function(){
		var oploadedFileName=$("#fileToUpload").val();
		$("#oploadedFileNameFrm").val(oploadedFileName);
		$('#form').trigger("submit");
	});

	/*----------------------------- Disabled Enter and BackSpace ----------------------------- 
	 					This method is very imported for disable 
	 				undesirable behavior of BackSpace and Enter Key 
	  ----------------------------------------------------------------------------------------*/
	$(document).keydown(function(e){
		   if (e.keyCode == 8 || e.keyCode == 13 || e.keyCode == 32) { 
			 if(e.target.tagName!="INPUT")return false;
			}
		});

	//when Admin click on the button [save All] of popup dialog 
	$("#saveSuccessPop #btOK").click( function(){
		$("#okSaveSuccessPopSignal").val("1");
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

	//when Admin click on the icon duplicate
	$('#columnIconDuplicate img[id="iconDuplicate"]').click( function(){
		var index=$('#columnIconDuplicate img[id="iconDuplicate"]').index(this);
		var lsOrderId=$("#columnOrders #lsOrderId").eq(index).text();
		$("#indexOrder").val(index);
		$("#duplicateOrderSignal").val("1");
		$("#lsOrderId").val(lsOrderId);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");		
	});

	//when Admin left input text quantityToChange
	$('#columnQuantity input[id="quantityToChange"]').change( function(){
		var index=$('#columnQuantity input[id="quantityToChange"]').index(this);
		var lsOrderId=$("#columnQuantity #lsOrderId").eq(index).text();
		var quantityToChange=$('#columnQuantity input[id="quantityToChange"]').eq(index).val();
		var indexRow=$("#columnQuantity #rowIndex").eq(index).text();
		//clean quantityToChange
		quantityToChange=quantityToChange.replace(/^\s\s*/, '');    
		quantityToChange=quantityToChange.replace(/\s\s*$/, '');   
		quantityToChange=quantityToChange.replace(/([\s]+)/g, '-'); 
		//clean indexRow
		indexRow=indexRow.replace(/^\s\s*/, '');    
		indexRow=indexRow.replace(/\s\s*$/, '');   
		indexRow=indexRow.replace(/([\s]+)/g, '-'); 
		$("#quantityToChangeSignal").val("1");
		$("#lsOrderId").val(lsOrderId);
		$("#quantityToChange").val(quantityToChange);
		$("#indexRow").val(indexRow);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");		
	});
	
	//when Admin click on the checkBox Print 
	$('#columnIconDuplicate #checkBoxPrintItem').click( function(){
		var index=$('#columnIconDuplicate #checkBoxPrintItem').index(this);
		var checkBoxPrintItem=$('#columnIconDuplicate #checkBoxPrintItem').eq(index).attr("checked");
		var lsOrderIdToPrint=$("#columnOrders #lsOrderId").eq(index).text();
		$("#lsOrderId").val(lsOrderIdToPrint);
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
		$('#tansformAutoSignal').val(1);
		$('#printAllOrdersSignal').val(0);
		createStrPrint();
		$('#formToPrint').trigger("submit");
	});
	
	//when Admin click on the button Print All Orders 
	$('#btPrintAllOrders').click( function(){
		$('#tansformAutoSignal').val(1);
		$('#printAllOrdersSignal').val(1);
		createStrPrint();
		$('#formToPrint').trigger("submit");
	});
	
});

</script>

</div>
</div>

