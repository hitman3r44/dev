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
<div class="pop_title" style="margin-top:30px;">Create Order Manual</div>

  <div id="formContainer" style="padding-bottom: 20px;">
    
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if> 
  <br/>

  <form id="form" action="createOrdersManual.do" method="post" enctype="multipart/form-data">

 	<!-- .......... Hidden variables to use when admin do an action event ........ -->
 	<s:hidden id="saveOrdersSignal" name="saveOrdersSignal" value="0"/>
 	<s:hidden id="confirmSaveOrdersSignal" name="confirmSaveOrdersSignal" value="0"/>
 	<s:hidden id="indexOrder" name="indexOrder" value="-1"/>
 	<s:hidden id="indexRow" name="indexRow" value="-1"/>
 	<s:hidden id="checkBoxPrintSignal" name="checkBoxPrintSignal" value="0"/>
 	<s:hidden id="checkBoxPrint" name="checkBoxPrint"/>
 	<s:hidden id="pageTop" name="pageTop" value="0" />
 	<s:hidden id="addSimilarOrderSignal" name="addSimilarOrderSignal" value="0" />
 	<s:hidden id="deleteOrderSignal" name="deleteOrderSignal" value="0" />
 	<s:hidden id="deleteRowSignal" name="deleteRowSignal" value="0" />
 	<s:hidden id="userLoginChangedSignal" name="userLoginChangedSignal" value="0" />
 	<s:hidden id="saveTemporarySignal" name="saveTemporarySignal" value="0" />
	<s:hidden id="addSimilarRowSignal" name="addSimilarRowSignal" value="0" />
	<s:hidden id="saveTemporaryRowSignal" name="saveTemporaryRowSignal" value="0" />
	<s:hidden id="checkProductPriceSignal" name="checkProductPriceSignal" value="0" />
	<s:hidden id="userIdFindedSignal" name="userIdFindedSignal" value="0" />
	<s:hidden id="okSaveSuccessPopSignal" name="okSaveSuccessPopSignal" value="0" />
	<s:hidden id="newLsOrderIdSignal" name="newLsOrderIdSignal" value="0" />
	<s:hidden id="currencyAlertPopSignal" name="currencyAlertPopSignal" />
	<s:hidden id="currencySymbol" name="currencySymbol" />

	<!-- Data Order -->
	
	<s:hidden id="codeFRM" name="code" />
	<s:hidden id="userIdFRM" name="userId" />
	<s:hidden id="lsOrderIdFRM" name="lsOrderId" />
	<s:hidden id="productOrderNumberFRM" name="productOrderNumber" />
	<s:hidden id="productOrderDateFRM" name="strProductOrderDate" />
	<s:hidden id="creationOrderDateFRM" name="strCreationOrderDate" />
	<s:hidden id="requiredDateFRM" name="strRequiredDate" />
	<s:hidden id="userLoginFRM" name="userLogin" />
	<s:hidden id="clientLastNameFRM" name="clientLastName" value="" />
	<s:hidden id="clientFirstNameFRM" name="clientFirstName"  value="" />
	<s:hidden id="clientOtherNamesFRM" name="clientOtherNames"  value="" />
	<s:hidden id="clientStreetFRM" name="clientStreet"  value="" />
	<s:hidden id="clientOtherStreetFRM" name="clientOtherStreet"  value="" />
	<s:hidden id="clientCityFRM" name="clientCity"  value="" />
	<s:hidden id="clientProvinceFRM" name="clientProvince"  value="" />
	<s:hidden id="clientPostalCodeFRM" name="clientPostalCode"  value="" />
	<s:hidden id="clientPhoneFRM" name="clientPhone"  value="" />
	<s:hidden id="clientEmailFRM" name="clientEmail"  value="" />
	<!-- Data Row -->
	<s:hidden id="quantityFRM" name="quantity" value="-1" /> 
	<s:hidden id="lsProductIDFRM" name="lsProductID" value="" />
	<s:hidden id="stockFRM" name="stock" value="-1" />
	<s:hidden id="productDescriptionFRM" name="productDescription" value="" />
	<s:hidden id="unitPriceFRM" name="unitPrice" value="-1" />
	<s:hidden id="shippingFeeFRM" name="shippingFee" value="-1" />
	<s:hidden id="shippingCompanyFRM" name="shippingCompany" value="" />
	<s:hidden id="trackingNumberFRM" name="trackingNumber" value="" />
 	</form>

	<!-- FORM FOR DOWNLOAD --> 
    <form id="formToPrint" action="printOrdersToPDF.do" method="post" enctype="multipart/form-data">
		<s:hidden id="tansformManSignal" name="tansformManSignal" value="0"/>
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
	
	<table border="0">
		<!-- ............................. TABLE USER LOGIN ............................ -->
		<tr>
			<td valign="middle">
			<table border="0" id="tabLogin" width="470px" height="80px">
			<!-- ...................... Line separator ............. -->
			<tr height="5px">
				<td colspan="4"/>
			</tr>
			<!-- ................................................... -->
			<tr valign="middle" height="60px"  style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 					   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
				<td valign="middle" style="padding-left: 10px;width:120px;">Client Login:</td>
			<td>
				<div class="ui-widget">
					<span style="font-size:12px;">
					<s:if test='%{(userLogin==null || userLogin=="")&& requirdFieldError==1}'>
						<input type="text" id="txtUserLoginTo"  style="background:#FF6666;" name="userLogin" value='<s:property value="%{userLogin}"/>' autocomplete="off"/>
					</s:if>
					<s:else>
						<s:textfield  id="txtUserLoginTo" name="userLogin" value="%{userLogin}" autocomplete="off"/>
					</s:else>
					</span>
				</div>
				<div style="position:absolute;">  
					<select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
						style="height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					<option></option>
					</select>
				</div>
			</td>
			<td align="left" width="60px"> User ID:</td>
			<td width="40px" id="userIdFinded" style="color:black;" ><s:property value="%{userId}"/></td>
			<td width="60px" style="padding-left: 5px;"><img id="iconFindPartner" style="padding-right: 10px;" src="images/orders/findOrders.png" title="Find user"/></td>
			</tr>					
			<!-- ...................... Line separator ............. -->
			<tr height="5px">
			<td colspan="4"/>
			</tr>					
		 </table>	
		 </td>
		 <!-- ................................. USER LOGO .......................... -->
		  <td width="450px" align="right" valign="middle">
			  <s:if test="%{userId!=null}" >
			   <img alt="" src='<s:property value="%{userLogo}"/>'/>
			  </s:if>
		  </td>
		</tr>
	</table>
  <!-- ............................. Orders List ............................... -->
  <br/>
 <s:if test="%{listOrdersDTO.size > 0}" >
   	<table border="0" width="120%" >
 	<s:iterator value="listOrdersDTO" id="order">

 	<tr>
	<td style="padding-top:20px;">
	 	<table width="100%" border="0" id="tabOrderHeader">
	 	<!-- LS ORDER ID -->
	 	<tr  height="30px">
	 		<td style="padding-left: 50%" width="65%">LS ORDER ID:<font style="color:red;font-size: 15px;"> * </font></td>
		 	<td align="left" style="padding-right: 10px;"> <center style="text-align:left;"><s:textfield id="lsOrderId" name="lsOrderId" value="%{lsOrderId}" /><img id="imgNewLsOrderId" src="images/orders/new.png" align="right" style="vertical-align:middle;cursor:pointer;visibility:hidden;display:none;"/></center></td>
	 	</tr>
	 	<!-- PO NUMBER -->
	 	<tr  height="30px">
	 		<td style="padding-left: 50%" width="65%">PO NUMBER:<font style="color:red;font-size: 15px;"> * </font></td>
		 	<td align="left" style="padding-right: 10px;">
		 	<s:if test='%{(productOrderNumber==null || productOrderNumber=="")&& requirdFieldError==1}'>
		 		<input type="text" id="productOrderNumber" name="productOrderNumber"  style="background:#FF6666;" value='<s:property value="%{productOrderNumber}"/>'/>
		 	</s:if>
		 	<s:else>
		 		<s:textfield  id="productOrderNumber" name="productOrderNumber" value="%{productOrderNumber}" />
		 	</s:else>
		 	</td>
	 	</tr>
	 	<!-- PO DATE -->
	 	<tr  height="30px">
	 		<td style="padding-left: 50%" width="65%">PO DATE:<font style="color:red;font-size: 15px;"> * </font></td>
		 	<td align="left" style="padding-right: 10px;">
        		<s:date name="creationDate" var="creationDate" format="dd/MM/yyyy"/>
        		<s:if test='%{(strCreationOrderDate==null || strCreationOrderDate=="")&& requirdFieldError==1}'>
					<input type="text" id="creationOrderDate"  style="background:#FF6666;" name="strCreationOrderDate" value='<s:property value="%{#creationDate}"/>' />
				</s:if>
				<s:else>
					<s:textfield id="creationOrderDate" name="strCreationOrderDate" value="%{#creationDate}" readonly="true" />
				</s:else></td>
	 	</tr>
	 	<!-- REQUIRED DATE -->
	 	<tr  height="30px">
	 		<td  style="padding-left: 50%" width="70%">REQUIRED DATE:</td>
		 	<td align="left" style="padding-right: 10px;">
		 	<s:date name="requiredDate" var="requiredDate" format="dd/MM/yyyy"/>
		 	
			<s:textfield id="requiredDate" name="strRequiredDate" value="%{#requiredDate}" key="labelkey" readonly="false" /></td>
	 	</tr>
	 	<!-- ICONS OPERATIONS ORDER-->
	 	<tr  height="40px" valign="bottom">
	 		<td colspan="2" width="100%">
		 		<table width="100%">
		 		<tr height="30px">
		 		<td width="78%"/>
				 
				 <td><img id="iconAddSimilarOrder" src="images/orders/similarOrder.png" style="visibility:hidden;display:none;"/> </td>
				 <td align="right" style="padding-right:10px;"><img id="iconDeleteOrder" src="images/orders/deleteIconActive.png" style="visibility:hidden;display:none;"/> </td>
		 		</tr>
		 		</table>
	 		</td>
		 	<td align="right" style="padding-right: 10px;"></td>
	 	</tr>
	 	
	 	<!-- SIPARATOR -->
	 	<tr height="10px" valign="middle">
	 		<td colspan="2"></td>
	 	</tr>
	 	<!-- SHIP TO -->
	 	<tr height="35px" valign="middle">
	 		<td style="color:red;text-decoration:underline;">SHIP TO</td>
	 	</tr>
	 	<tr>
	 		<td align="left" width="100%" colspan="2"  style="padding-left: 10px;">
	 		<!-- SHIP TO -->
	 		<table>

	 			<tr height="35px">
	 			<td width="150px">CLIENT LAST NAME:<font style="color:red;font-size: 15px;"> * </font></td>   
	 			<td>
	 				<s:if test='%{(clientLastName==null || clientLastName=="")&& requirdFieldError==1}'>
	 					<input type="text" id="clientLastName" style="background:#FF6666;" name="clientLastName" value='<s:property value="%{clientLastName}"/>' />
	 				</s:if>
	 				<s:else>
	 					<s:textfield id="clientLastName" name="clientLastName" value="%{clientLastName}" />
	 				</s:else>	
	 			    CLIENT FIRST NAME:<font style="color:red;font-size: 15px;"> * </font> 
	 			    <s:if test='%{(clientFirstName==null || clientFirstName=="")&& requirdFieldError==1}'>
	 			   		<input type="text" id="clientFirstName"  style="background:#FF6666;" name="clientFirstName" value='<s:property value="%{clientFirstName}"/>' />
	 			    </s:if>
	 			    <s:else>
	 			   		<s:textfield id="clientFirstName" name="clientFirstName" value="%{clientFirstName}" />
	 			    </s:else></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT OTHER NAMES:</td>
	 			<td><s:textfield id="clientOtherNames" name="clientOtherNames" value="%{clientOtherNames}" /></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT STREET:<font style="color:red;font-size: 15px;"> * </font></td>
	 			<td>
	 			<s:if test='%{(clientStreet==null || clientStreet=="")&& requirdFieldError==1}'>
	 				<input type="text" id="clientStreet"  style="background:#FF6666;" name="clientStreet" value='<s:property value="%{clientStreet}"/>' />
	 			</s:if>
	 			<s:else>
	 				<s:textfield id="clientStreet" name="clientStreet" value="%{clientStreet}" />
	 			</s:else></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT OTHER ADDRESS:</td>
	 			<td><s:textfield id="clientOtherStreet" name="clientOtherStreet" value="%{clientOtherStreet}" /></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT PROVINCE:<font style="color:red;font-size: 15px;"> * </font></td>
	 			<td>
	 			<s:if test='%{(clientProvince==null || clientProvince=="")&& requirdFieldError==1}'>
			 		<s:select 
			        id="provinceId"
			        name="code"
			        list="listProvinces"
			        emptyOption="false"
			        headerKey=""
			        listKey="code"
			        listValue="name"
			        headerValue="--Select--" />
	 				<input type="text" id="clientProvince"  style="background:#FF6666;" name="clientProvince" value='<s:property value="%{clientProvince}"/>' />
	 			</s:if>
	 			<s:else>
	 				<s:select
			        id="provinceId"
			        name="code"
			        list="listProvinces"
			        emptyOption="false"
			        headerKey=""
			        listKey="code"
			        listValue="name"
			        headerValue="--Select--" />
	 				<s:textfield id="clientProvince" name="clientProvince" value="%{clientProvince}" />
	 			</s:else></td>
	 			</tr>
	 			<!-- ......... CLIENT CITY ............ -->
	 			<tr height="35px">
	 			<td>CLIENT CITY:<font style="color:red;font-size: 15px;"> * </font></td>
	 			<td>
		 		<s:if test='%{(clientCity==null || clientCity=="")&& requirdFieldError==1}'>
		 			<input type="text" id="clientCity"  style="background:#FF6666;" name="clientCity" value='<s:property value="%{clientCity}"/>' />
		 		</s:if>
		 		<s:else>
		 			<s:textfield id="clientCity" name="clientCity" value="%{clientCity}" />
		 		</s:else></td>
	 			</tr>

	 			<tr height="35px">
	 			<td>CLIENT POSTAL CODE:<font style="color:red;font-size: 15px;"> * </font></td>
	 			<td>
	 			<s:if test='%{(clientPostalCode==null || clientPostalCode=="")&& requirdFieldError==1}'>
	 				<input type="text" id="clientPostalCode"  style="background:#FF6666;" name="clientPostalCode" value='<s:property value="%{clientPostalCode}"/>'  />
	 			</s:if>
	 			<s:else>
	 			<s:textfield id="clientPostalCode" name="clientPostalCode" value="%{clientPostalCode}"  />
	 			</s:else></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT PHONE:</td>
	 			<td><s:textfield id="clientPhone" name="clientPhone" value="%{clientPhone}" /></td>
	 			</tr>
	 			<tr height="35px">
	 			<td>CLIENT EMAIL:</td>
	 			<td><s:textfield id="clientEmail" name="clientEmail" value="%{clientEmail}" /></td>
	 			</tr>
	 		</table>
	 		</td>
	 	</tr>
	 	</table>
	</td>
 	</tr>
 	<!-- ITEMS -->
 	<tr height="30px" valign="middle" >
 		<td style="color:red;text-decoration:underline;">ITEMS</td>
 	</tr>
 	<tr>
 		<td>
	 	<table border="0" width="100%" id="tabItems" cellspacing="0px" cellpadding="0px">
	 	<!-- Headers -->
	 	<tr height="35px" valign="middle" align="center" style="font-weight: bold;border: 0px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;">
	 		<td>LS PRODUCT ID<font style="color:red;font-size: 15px;"> * </font></td>
	 		<td>QUANTITY<font style="color:red;font-size: 15px;"> * </font></td>
	 		<td>STOCK</td>
	 		<td>PRODUCT TITLE</td>
	 		<td colspan="1" id="CurrencyAlert">LS PRICE</td>
	 		<td colspan="1">UNIT PRICE<font style="color:red;font-size: 15px;"> * </font></td>	 		
	 	</tr> 
	    <s:iterator value="#order.rowsList" id="cell">
	    <!-- Order Rows -->
	    <tr height="35px" valign="middle" align="center">
	   		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
  		 		       <s:if test='%{(lsProductID==null || lsProductID=="")&& requirdFieldError==1}'>
  		 		      		<input type="text" id="lsProductID"  style="background:#FF6666;" name="lsProductID" value='<s:property value="%{lsProductID}"/>' />
  		 		       </s:if>
  		 		       <s:else>
  		 		       		<s:textfield id="lsProductID" name="lsProductID" value="%{lsProductID}" />
  		 		       </s:else></td>
	    	<td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
  		 		       <center id="userId" style="visibility:hidden;display:none;"><s:property value="#order.userId"/></center>
   		 		       <center id="productId"  style="visibility:hidden;display:none;"><s:property value="#order.productId"/></center>
  		 		       <center id="lsOrderId"  style="visibility:hidden;display:none;"><s:property value="#order.lsOrderId"/></center>
  		 		       <center id="indexOrder" style="visibility:hidden;display:none;"><s:property value="#order.index"/></center>
  		 		       <center id="indexRow"   style="visibility:hidden;display:none;"><s:property value="#cell.index" /></center>
  		 		       <s:if test='%{(quantity==null || quantity==0)&& requirdFieldError==1}'>
  		 			  		<input type="text" id="quantity"  style="background:#FF6666;" name="quantity" value='<s:property value="%{quantity}"/>' />
  		 			   </s:if>
  		 			   <s:else>
  		 			  		<s:textfield id="quantity" name="quantity" value="%{quantity}" />
  		 			   </s:else></td>
  		    <td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textfield id="stock" name="stock" value="%{stock}" readonly="true" /></td>
	 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textarea cssStyle="height:15px;" id="productDescription" name="productDescription" value="%{productDescription}" /></td>
	 		<td  style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textfield id="lsPrice" name="lsPrice" value="%{lsPrice}" readonly="true" /></td>
  		 	<td  style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;<s:property value="#cell.cssPrice"/>
  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
  		 		       <s:if test='%{(unitPrice==null || unitPrice=="")&& requirdFieldError==1}'>
  		 		       <input type="text" id="unitPrice"  style="background:#FF6666;" name="unitPrice" value='<s:property value="%{unitPrice}"/>' />
  		 		       </s:if>
  		 		       <s:else>
  		 		       <s:textfield id="unitPrice" name="unitPrice" value="%{unitPrice}" />
  		 		       </s:else></td>
  		 	<td width="30px"><img id="iconSaveTemporaryRow" src='<s:property value="#cell.icon" />' title=""/></td>
  		 	<td width="30px"><img id="iconSimilarRow" src="images/orders/similarRow.png" title="Create Copy"/></td>
  		    <td width="30px"  style="border-right: 1px solid #CCCCCC;"><img id="iconDeleteRow" src="images/orders/deleteItem.png" title="Delete before Saving"/></td>       
	    </tr>
	    <!-- Heel of Order Rows -->
	    <tr height="35px" style="border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
	    	<td align="right" colspan="4">SHIPPING FEE:</td>
	 		<td colspan="4"><s:textfield id="shippingFee" name="shippingFee" value="%{shippingFee}" /></td>
	    </tr>
	    <tr height="35px" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;">
	    	<td align="right" colspan="4">SHIPPING COMPANY:</td>
	 		<td colspan="4"><s:textfield id="shippingCompany" name="shippingCompany" value="%{shippingCompany}" /></td>
	    </tr>
	    <tr height="35px" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;">
	    	<td align="right" colspan="4" style="padding-bottom:20px;">TRACKING NUMBER:</td>
	 		<td colspan="4" style="padding-bottom:20px;"><s:textfield id="trackingNumber" name="trackingNumber" value="%{trackingNumber}" /></td>
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
	   </td>
	 </tr>
	</table>
 </s:if>
  <!-- ......................................................................... -->	
 <!-- ...........................jsp fragment ................................. -->
	      <%@ include file="dialogues/saveSuccessPop.jsp" %>
	      <%@ include file="dialogues/toolTipManualPop.jsp" %>
	      <%@ include file="dialogues/toolTipManualPopFixed.jsp" %>
	      <%@ include file="dialogues/toolTipCurrencyPop.jsp" %>
 <!-- ......................................................................... -->
	
<script type="text/javascript" charset="utf-8">
// Jquery Function main 
var pageTop=0;
var scrollTop;

var arrayProvince = [];

$(function() {
	var pageTop = <%= request.getParameter("pageTop") %>;
	$(window).scrollTop(pageTop);
});

$(function() {
	// validattion alert 
	$('#toolTipManualPopFixed').effect("pulsate", { times:999}, 1000);
	//$('#toolTipCurrencyPop').effect("pulsate", { times:999}, 1000);
});

$(function() {
	    $("#tabOrderHeader #creationOrderDate").datepicker({
	     dateFormat: 'dd/mm/yy',
         changeMonth: true,
         changeYear: true
      });
 });

$(function() {
	    $("#tabOrderHeader #requiredDate").datepicker({
	     dateFormat: 'dd/mm/yy',
         changeMonth: true,
         changeYear: true
      });
 });


/*------------------------------------- ToolTipFixed ------------------------------------------ 
	always write alet validation message 
  ----------------------------------------------------------------------------------------*/
$(function() {
	var indexSaveTemporaryRow=$('#tabItems #iconSaveTemporaryRow').index(this);
	position = $('#tabItems #iconSaveTemporaryRow').eq(0).position();
	$('#toolTipManualPopFixed #message').text("Validate Modification before Saving mades here.");
	var y=position.top;
	var height=$('#toolTipManualPopFixed').height();
	y=(y-height);
	var x=position.left;
	var toolTipWidth=$('#toolTipManualPopFixed').width();
	toolTipWidth=toolTipWidth/2;
	x=x-toolTipWidth;
	$("#toolTipManualPopFixed").css('top',y-90);
	$("#toolTipManualPopFixed").css('left',x+1);
	$('#toolTipManualPopFixed').css("display","block"); 
	$('#toolTipManualPopFixed').css("visibility","visible");
	
	//Currency 
	var indexCurrencyAlert=$('#tabItems #CurrencyAlert').eq(0).index(this);
	positionCurrency = $('#tabItems #CurrencyAlert').position();
	var currSymbol = $('#currencySymbol').val();
	var msg = "Please the LS and Unit Prices are in the <"+currSymbol+">.";
	$('#toolTipCurrencyPop #message').text(msg);
	var yCurrency=positionCurrency.top;
	var heightCurrency=$('#toolTipCurrencyPop').height();
	yCurrency=(yCurrency-heightCurrency);
	var xCurrency=positionCurrency.left;
	var toolTipWidthCurrency=$('#toolTipCurrencyPop').width();
	toolTipWidthCurrency=toolTipWidthCurrency/2;
	//yCurrency=yCurrency-toolTipWidthCurrency;
	$("#toolTipCurrencyPop").css('top',yCurrency-20);
	$("#toolTipCurrencyPop").css('left',xCurrency+30);
	$("#toolTipCurrencyPop").css('width',toolTipWidthCurrency);
	if($('#currencyAlertPopSignal').val()==1) {
		$('#toolTipCurrencyPop').css("display","block"); 
		$('#toolTipCurrencyPop').css("visibility","visible");
	}
 });

$(document).ready(function() { 
	/*------------------------------------- ToolTip ------------------------------------------ 
		when Admin mouve the mouse on Item icons of the popup:"orderDetailPop" 
	  ----------------------------------------------------------------------------------------*/
	$('#iconFindPartner,#iconSaveTemporaryRow,#iconSimilarRow,#iconDeleteRow').mouseover( function(){
		var indexFindPartner=$('#iconFindPartner').index(this);  
		var indexSaveTemporaryRow=$('#tabItems #iconSaveTemporaryRow').index(this);
		var indexSimilarRow=$('#tabItems #iconSimilarRow').index(this);
		var indexDeleteRow=$('#tabItems #iconDeleteRow').index(this);
		var position;
		var showPop=0;
		if(indexFindPartner>=0){
			position = $('#iconFindPartner').position();
			$('#toolTipManualPop #message').text("Click to identify Client");
			showPop=1;
		}
		if(indexSaveTemporaryRow>=0){
			position = $('#tabItems #iconSaveTemporaryRow').eq(indexSaveTemporaryRow).position();
			$('#toolTipManualPop #message').text("Validate Modification before Saving");
			showPop=1;
		}
		if(indexSimilarRow>=0){
			position = $('#tabItems #iconSimilarRow').eq(indexSimilarRow).position();
			$('#toolTipManualPop #message').text("Add Product");
			showPop=1;
		}
		if(indexDeleteRow>=0){
			position = $('#tabItems #iconDeleteRow').eq(indexDeleteRow).position();
			$('#toolTipManualPop #message').text("Delete before Saving");
			showPop=1;
		}
		var y=position.top;
		var height=$('#toolTipManualPop').height(); 
		y=(y-height);
		var x=position.left;
		var toolTipWidth=$('#toolTipManualPop').width();
		toolTipWidth=toolTipWidth/2;
		x=x-toolTipWidth;
		$("#toolTipManualPop").css('top',y-5);
		$("#toolTipManualPop").css('left',x);
		if(showPop==1){
			$('#toolTipManualPop').css("display","block"); 
			$('#toolTipManualPop').css("visibility","visible");
		}
	});
	//when Admin out the mouse on Item icons of the popup:"orderDetailPop" 
	$('#iconFindPartner,#iconSaveTemporaryRow,#iconSimilarRow,#iconDeleteRow').mouseout( function(){
		$('#toolTipManualPop').css("display","none"); 
		$('#toolTipManualPop').css("visibility","hidden");
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

	//when Admin click on the button OK of SaveSuccessPop 
	 $('#imgNewLsOrderId').click( function(){
		$("#newLsOrderIdSignal").val(1);
		$('#form').trigger("submit");
	 });

	//when Admin click on the button OK of SaveSuccessPop 
	 $('#saveSuccessPop #btOK').click( function(){
		$("#okSaveSuccessPopSignal").val(1);
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
		var userLogin=$('#tabLogin #txtUserLoginTo').val();

		//------------------------------ 
		var code=$('#provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(0).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(0).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(0).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(0).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(0).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(0).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(0).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(0).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(0).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(0).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(0).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(0).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(0).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(0).val();
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);

		//--------------------------------- 
		$('#userLoginFRM').val(userLogin);
		$("#pageTop").val(0);
		$('#form').trigger("submit");
		
	});

	//when Admin click on the checkBox Print 
	$('#tabOrderHeader #checkBoxPrintItem').click( function(){
		var index=$('#tabOrderHeader #checkBoxPrintItem').index(this);
		var checkBoxPrintItem=$('#tabOrderHeader #checkBoxPrintItem').eq(index).attr("checked");
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
		$('#tansformManSignal').val(1);
		$('#printAllOrdersSignal').val(0);
		$('#formToPrint').trigger("submit");
	});
	
	//when Admin click on the button Print All Orders 
	$('#btPrintAllOrders').click( function(){
		$('#tansformAutoSignal').val(1);
		$('#printAllOrdersSignal').val(1);
		$('#formToPrint').trigger("submit");
	});

	//when Admin change province in comboList 
	$('#tabOrderHeader #provinceId').change( function(){
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		recoveryDataOrder();
		$('#form').trigger("submit");
		
	});

	//when Admin change Data row, change image:iconSaveTemporaryRow to itemNotValidated.png 
	$("#tabItems #lsProductID,#quantity,#stock,#productDescription,#unitPrice,#shippingFee,#shippingCompany,#trackingNumber").change( function(){
		var index=$("#tabItems #lsProductID").index(this);
		if(index<0)index=$("#tabItems #lsProductID").index(this);
		if(index<0)index=$("#tabItems #quantity").index(this);
		if(index<0)index=$("#tabItems #stock").index(this);
		if(index<0)index=$("#tabItems #productDescription").index(this);
		if(index<0)index=$("#tabItems #shippingFee").index(this);
		if(index<0)index=$("#tabItems #shippingCompany").index(this);
		if(index<0)index=$("#tabItems #trackingNumber").index(this);
		if(index<0)index=$("#tabItems #unitPrice").index(this);
		if(index>=0)$("#tabItems #iconSaveTemporaryRow").eq(index).attr("src","images/orders/itemNotValidated.png");
	});
	
	//when Admin click on the the iconSimilarRow 
	$("#tabItems #iconSimilarRow").click( function(){
		var index=$("#tabItems #iconSimilarRow").index(this);
		var indexOrder=$("#tabItems #indexOrder").eq(index).text();
		var indexRow=$("#tabItems #indexRow").eq(index).text();
		//clean indexOrder 
		indexOrder=indexOrder.replace(/^\s\s*/, '');    
		indexOrder=indexOrder.replace(/\s\s*$/, '');   
		indexOrder=indexOrder.replace(/([\s]+)/g, '-'); 
		//clean indexRow 
		indexRow=indexRow.replace(/^\s\s*/, '');    
		indexRow=indexRow.replace(/\s\s*$/, '');   
		indexRow=indexRow.replace(/([\s]+)/g, '-'); 

		//------------------------------ 
		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(indexOrder).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(indexOrder).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(indexOrder).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(indexOrder).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(indexOrder).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(indexOrder).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(indexOrder).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(indexOrder).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(indexOrder).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(indexOrder).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(indexOrder).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(indexOrder).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(indexOrder).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(indexOrder).val();
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		//--------------------------------- 
		
		$('#addSimilarRowSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form #indexOrder').val(indexOrder);
		$('#form #indexRow').val(indexRow);
		var quantity = $("#tabItems #quantity").eq(index).val();
		var lsProductID = $("#tabItems #lsProductID").eq(index).val();
		var stock = $("#tabItems #stock").eq(index).val();
		var productDescription = $("#tabItems #productDescription").eq(index).val();
		var unitPrice = $("#tabItems #unitPrice").eq(index).val();
		var shippingFee = $("#tabItems #shippingFee").eq(index).val();
		var shippingCompany = $("#tabItems #shippingCompany").eq(index).val();
		var trackingNumber = $("#tabItems #trackingNumber").eq(index).val();
		$("#quantityFRM").val(quantity); 
		$("#lsProductIDFRM").val(lsProductID);
		$("#productDescriptionFRM").val(productDescription);
		$("#unitPriceFRM").val(unitPrice);
		$("#shippingFeeFRM").val(shippingFee);
		$("#shippingCompanyFRM").val(shippingCompany);
		$("#trackingNumberFRM").val(trackingNumber);
		$('#form').trigger("submit");
	});

	//when Admin click on the the iconSaveTemporaryRow 
	$("#tabItems #iconSaveTemporaryRow").click( function(){
		var index=$("#tabItems #iconSaveTemporaryRow").index(this);
		var indexOrder=$("#tabItems #indexOrder").eq(index).text();
		var indexRow=$("#tabItems #indexRow").eq(index).text();
		//clean indexOrder 
		indexOrder=indexOrder.replace(/^\s\s*/, '');    
		indexOrder=indexOrder.replace(/\s\s*$/, '');   
		indexOrder=indexOrder.replace(/([\s]+)/g, '-'); 
		//clean indexRow 
		indexRow=indexRow.replace(/^\s\s*/, '');    
		indexRow=indexRow.replace(/\s\s*$/, '');   
		indexRow=indexRow.replace(/([\s]+)/g, '-'); 
		$('#saveTemporaryRowSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form #indexOrder').val(indexOrder);
		$('#form #indexRow').val(indexRow);
		var quantity = $("#tabItems #quantity").eq(index).val();
		var lsProductID = $("#tabItems #lsProductID").eq(index).val();
		var stock = $("#tabItems #stock").eq(index).val();
		var productDescription = $("#tabItems #productDescription").eq(index).val();
		var unitPrice = $("#tabItems #unitPrice").eq(index).val();
		var shippingFee = $("#tabItems #shippingFee").eq(index).val();
		var shippingCompany = $("#tabItems #shippingCompany").eq(index).val();
		var trackingNumber = $("#tabItems #trackingNumber").eq(index).val();
		$("#quantityFRM").val(quantity); 
		$("#lsProductIDFRM").val(lsProductID);
		$("#productDescriptionFRM").val(productDescription);
		$("#unitPriceFRM").val(unitPrice);
		$("#shippingFeeFRM").val(shippingFee);
		$("#shippingCompanyFRM").val(shippingCompany);
		$("#trackingNumberFRM").val(trackingNumber);
		//------------------------------ 

		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(indexOrder).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(indexOrder).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(indexOrder).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(indexOrder).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(indexOrder).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(indexOrder).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(indexOrder).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(indexOrder).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(indexOrder).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(indexOrder).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(indexOrder).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(indexOrder).val();
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(indexOrder).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(indexOrder).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		//--------------------------------- 

		$('#form').trigger("submit");
	});
	
	//when Admin click on the icon iconAddSimilarOrder 
	$('#tabOrderHeader #iconAddSimilarOrder').click( function(){
		var indexOrder=$('#tabOrderHeader #iconSaveTemporary').index(this);
		scrollTop=$(window).scrollTop();
		if(indexOrder<0){
			indexOrder=$('#tabOrderHeader #iconAddSimilarOrder').index(this);
			$('#addSimilarOrderSignal').val(1);
			scrollTop=scrollTop+700;
		}else $('#saveTemporarySignal').val(1);
		$('#indexOrder').val(indexOrder);
		//recovery data 
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(indexOrder).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(indexOrder).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(indexOrder).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(indexOrder).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(indexOrder).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(indexOrder).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(indexOrder).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(indexOrder).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(indexOrder).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(indexOrder).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(indexOrder).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(indexOrder).val();
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(indexOrder).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(indexOrder).val();
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});
	
	//when Admin click on the icon iconDeleteOrder 
	$('#tabOrderHeader img[id="iconDeleteOrder"]').click( function(){
		var indexOrder=$('#tabOrderHeader img[id="iconDeleteOrder"]').index(this);
		$('#indexOrder').val(indexOrder);
		$('#deleteOrderSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});

	//when Admin click on the icon iconDeleteRow 
	$("#tabItems #iconDeleteRow").click( function(){
		var index=$("#tabItems #iconDeleteRow").index(this);
		var indexOrder=$("#tabItems #indexOrder").eq(index).text();
		var indexRow=$("#tabItems #indexRow").eq(index).text();
		//clean indexOrder 
		indexOrder=indexOrder.replace(/^\s\s*/, '');    
		indexOrder=indexOrder.replace(/\s\s*$/, '');   
		indexOrder=indexOrder.replace(/([\s]+)/g, '-'); 
		//clean indexRow 
		indexRow=indexRow.replace(/^\s\s*/, '');    
		indexRow=indexRow.replace(/\s\s*$/, '');   
		indexRow=indexRow.replace(/([\s]+)/g, '-'); 

		//------------------------------ 
		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(indexOrder).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(indexOrder).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(indexOrder).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(indexOrder).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(indexOrder).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(indexOrder).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(indexOrder).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(indexOrder).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(indexOrder).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(indexOrder).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(indexOrder).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(indexOrder).val();
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(indexOrder).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(indexOrder).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		//--------------------------------- 

		$('#form #indexOrder').val(indexOrder);
		$('#form #indexRow').val(indexRow);
		$('#deleteRowSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});
	
	//when Admin changed userLogin textfield 
	$('#iconFindPartner').click( function(){
		var userLogin=$('#tabLogin #txtUserLoginTo').val();
		//------------------------------ 
		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(0).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(0).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(0).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(0).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(0).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(0).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(0).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(0).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(0).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(0).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(0).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(0).val();
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(0).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(0).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		//--------------------------------- 

		$('#userLoginFRM').val(userLogin);
		$('#userIdFindedSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});

	
	//when Admin changed lsProductID textfield 
	$("#tabItems #lsProductID").blur( function(){
		var index=$("#tabItems #lsProductID").index(this);
		var indexOrder=$("#tabItems #indexOrder").eq(index).text();
		var indexRow=$("#tabItems #indexRow").eq(index).text();
		var userId=$("#tabItems #userId").eq(index).text();
		var lsProductID=$("#tabItems #lsProductID").eq(index).val();
		//clean indexOrder 
		indexOrder=indexOrder.replace(/^\s\s*/, '');    
		indexOrder=indexOrder.replace(/\s\s*$/, '');   
		indexOrder=indexOrder.replace(/([\s]+)/g, '-'); 
		//clean indexRow 
		indexRow=indexRow.replace(/^\s\s*/, '');    
		indexRow=indexRow.replace(/\s\s*$/, '');   
		indexRow=indexRow.replace(/([\s]+)/g, '-'); 
		//clean userId 
		userId=userId.replace(/^\s\s*/, '');    
		userId=userId.replace(/\s\s*$/, '');   
		userId=userId.replace(/([\s]+)/g, '-');
		//------------------------------ 
		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(indexOrder).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(indexOrder).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(indexOrder).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(indexOrder).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(indexOrder).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(indexOrder).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(indexOrder).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(indexOrder).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(indexOrder).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(indexOrder).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(indexOrder).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(indexOrder).val();
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(indexOrder).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(indexOrder).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);
		//--------------------------------- 
		$("#lsProductIDFRM").val(lsProductID);
		$("#userIdFRM").val(userId);
		$('#form #indexOrder').val(indexOrder);
		$('#form #indexRow').val(indexRow);
		$('#checkProductPriceSignal').val(1);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		$('#form').trigger("submit");
	});
	
	// recovery data order 
	function recoveryDataOrder(){
		//------------------------------ 
		var code=$('#tabOrderHeader #provinceId').val();
		$('#codeFRM').val(code);
		var clientLastName=$('#tabOrderHeader #clientLastName').eq(0).val();
		var clientFirstName=$('#tabOrderHeader #clientFirstName').eq(0).val();
		var clientOtherNames=$('#tabOrderHeader #clientOtherNames').eq(0).val();
		var clientStreet=$('#tabOrderHeader #clientStreet').eq(0).val();
		var clientOtherStreet=$('#tabOrderHeader #clientOtherStreet').eq(0).val();
		var clientCity=$('#tabOrderHeader #clientCity').eq(0).val();
		var clientProvince=$('#tabOrderHeader #clientProvince').eq(0).val();
		var clientPostalCode=$('#tabOrderHeader #clientPostalCode').eq(0).val();
		var clientPhone=$('#tabOrderHeader #clientPhone').eq(0).val();
		var clientEmail=$('#tabOrderHeader #clientEmail').eq(0).val();
		var productOrderNumber=$('#tabOrderHeader #productOrderNumber').eq(0).val();
		var productOrderDate=$('#tabOrderHeader #productOrderDate').eq(0).val();
		var creationOrderDate=$('#tabOrderHeader #creationOrderDate').val();
		$('#creationOrderDateFRM').val(creationOrderDate);
		var requiredDate=$('#tabOrderHeader #requiredDate').eq(0).val();
		var lsOrderId=$('#tabOrderHeader #lsOrderId').eq(0).val();
		//clean lsOrderId 
		lsOrderId=lsOrderId.replace(/^\s\s*/, '');    
		lsOrderId=lsOrderId.replace(/\s\s*$/, '');   
		lsOrderId=lsOrderId.replace(/([\s]+)/g, '-');
		$('#lsOrderIdFRM').val(lsOrderId);
		$('#productOrderNumberFRM').val(productOrderNumber);
		$('#productOrderDateFRM').val(productOrderDate);
		$('#requiredDateFRM').val(requiredDate);
		$('#clientLastNameFRM').val(clientLastName);
		$('#clientFirstNameFRM').val(clientFirstName);
		$('#clientOtherNamesFRM').val(clientOtherNames);
		$('#clientStreetFRM').val(clientStreet);
		$('#clientOtherStreetFRM').val(clientOtherStreet);
		$('#clientCityFRM').val(clientCity);
		$('#clientProvinceFRM').val(clientProvince);
		$('#clientPostalCodeFRM').val(clientPostalCode);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientPhoneFRM').val(clientPhone);
		$('#clientEmailFRM').val(clientEmail);

	}

	$("#iconFindPartner").mouseover( function(){
		$("#iconFindPartner").css('width','30px');
		$("#iconFindPartner").css('hight','30px');
	});

	$("#iconFindPartner").mouseout( function(){
		$("#iconFindPartner").css('width','24px');
		$("#iconFindPartner").css('hight','24px');
	});
	
	/*----------------------------- When unitPrice Losts focus -------------------------- 
		//Accept only numbers
	----------------------------------------------------------------------------------------*/
	$("#unitPrice").blur( function(){
		var unitPrice = $("#unitPrice").val();
		$("#unitPrice").css("backgroundColor", "#FFFFFF");
		if(!isNumber(unitPrice) || parseFloat(unitPrice)<=0) {
			$("#unitPrice").val("");
			$("#unitPrice").css("backgroundColor", "#FF6666");
		} else {
			var valUnitPrice = parseFloat(unitPrice).toFixed(2);
			$("#unitPrice").val(valUnitPrice);
		}
	});
	
	/*----------------------------- function: isNumber ------------------------------------- 
		//return false if is not numeric
	----------------------------------------------------------------------------------------*/
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}
	
	
});
</script>

</div>
</div>

