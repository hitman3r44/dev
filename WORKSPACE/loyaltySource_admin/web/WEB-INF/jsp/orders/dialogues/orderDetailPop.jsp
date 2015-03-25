<%@ taglib prefix="s" uri="/struts-tags" %>
<style type="text/css" >
	#orderDetailPop {
		position:absolute;
		width:880px;
		height:600px;
		
		/*top:30%;
		left:37%;*/
		top:<%= request.getParameter("poYpop") %>px;
		left:<%= request.getParameter("poXpop") %>px;
		border:5px solid #B0C4DE;
		z-index: 600;
		display:none;
		visibility:hidden;
		padding-top:5px;
		background-color:rgb(44,140,171);
		text-align: center;
		
	}
</style>

<script language="javascript">
/* <![CDATA[ */	
document.onmousedown = down;
document.onmousemove = drag;
document.onmouseup = up;
var zindex = 0;
var objSelected;
function down(objEvent) {
	var ev = window.event || objEvent ;
	objSelected = ev.srcElement || ev.target;
	if (objSelected.nodeName=="DIV") {
		objSelected.style.borderColor ="red";
		//objSelected.style.cursor = "move";
		zindex++; 
		objSelected.style.zIndex = zindex ; 
		dx = ev.offsetX || ev.layerX;
		dy = ev.offsetY || ev.layerY;	
		window.status = "dx = " + dx + ", dy = " + dy;
		return false;
	}
}
function up(objEvent) {
	var ev = window.event || objEvent ;
	if (objSelected.nodeName=="DIV") {
		objSelected.style.borderColor = "#B0C4DE";
		objSelected.style.cursor = "auto";
		objSelected = null;
	}
}
function drag(objEvent) {
	var ev = window.event || objEvent ;
		if (objSelected && objSelected.nodeName=="DIV") {
			objSelected.style.left = (ev.clientX-dx) + "px";
			objSelected.style.top = (ev.clientY-dy) + "px" ;
			return false;
		}
}

/*  ]]> */

</script>

<div id="orderDetailPop" class="conteneurPrompt" style='<s:property value="%{showOrderDetailPop}"/>'  >
	<span id="titlePop" style="color:white;font-size: 16px;vertical-align: middle;"><s:property value="%{orderToEdit.lsOrderId}"/></span>
	<div style="height: 5px;"></div>
	<!-- *************************************************** Le Body ********************************************************** -->			 	
	<div  style="width:100%;height:575px;background-color:rgb(249,249,249);<s:property value="%{orderToEdit.backgroundColor}"/>; color:#000000; font-size:12px; padding-left: 0px; padding-right:0px; padding: 0px;">
	
	<table  cellspacing="0" width="100%" border="0">		 		
		<tr  height="530px">
			<td colspan="2" align="left" style="padding-left: 20px;padding-right: 20px;" valign="top">
				<div style="font-family: Arial, Helvetica, sans-serif;font-size: 11px;">
				   <table id="tabOrderDetailPop" height="300px" width="100%" border="0" cellspacing="0px" cellpadding="0px">
				   			   
				    <tr height="15px">
		 			<td colspan="2"/>   
		 			</tr>
				   
				    <tr height="20px">
				    <td colspan="2">
					    <table border="0">
					    <tr height="20px">
					    <td width="143px"><font style="color: #484848;">PARTNER LOGIN:</font></td>
					    <td width="480px">
					    <s:if test='%{orderToEdit.userLogin.bytes.length > 30}'>
					    	<s:textfield id="userLogin" name="orderToEdit.userLogin" value="%{orderToEdit.userLogin}" readonly="true" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
					    </s:if>
					    <s:else>
							<s:textfield id="userLogin" name="orderToEdit.userLogin" value="%{orderToEdit.userLogin}" readonly="true" cssStyle="width:150px;color:black;"/>
						</s:else></td>
					    <td width="120px"><font style="color: #484848;">ORDER DATE :</font><font style="color:red;font-size: 15px;"> * </font></td>
					    <td>
					    <s:date name="orderToEdit.creationDate" var="creationDate" format="dd/MM/yyyy"/>
					    <!-- ......... PRODUCT ORDER DATE ............ -->
		 				<s:if test='%{orderToEdit.creationDate==null}'>
							<s:textfield id="creationOrderDate" name="strCreationOrderDate" value="%{#creationDate}" key="labelkey" readonly="false" cssStyle="width:100px;background-color:#FF6666;color:black;"/>
						</s:if>
						<s:else>
							<s:textfield id="creationOrderDate" name="strCreationOrderDate" value="%{#creationDate}" key="labelkey" readonly="false" cssStyle="width:100px;color:black;"/>
						</s:else>
					    </td>
					     <!-- ......... CLIENT PRODUCT ORDER DATE ............ -->
					    <td style="visibility:hidden;display:none;">
					    <s:date name="orderToEdit.productOrderDate" var="productOrderDate" format="dd/MM/yyyy"/>
					    <!-- ......... PRODUCT ORDER DATE ............ -->
						 <s:textfield id="productOrderDate" name="strProductOrderDate" value="%{#productOrderDate}" key="labelkey" readonly="false" cssStyle="width:100px;color:black;"/>
					    </td>
					    </tr>
					    <tr height="20px">
		 				<td width="143px"><font style="color: #484848;">PO NUMBER:</font><font style="color:red;font-size: 15px;"> *</font></td>   
		 				<td>
		 				<!-- ......... PRODUCT ORDER NUMBER ............ -->
		 				<s:if test='%{orderToEdit.productOrderNumber==null || orderToEdit.productOrderNumber==""}'>
		 					<s:textfield id="productOrderNumber" name="orderToEdit.productOrderNumber" value="%{orderToEdit.productOrderNumber}" readonly="true" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
		 				</s:if>
		 				<s:else>
		 					<s:textfield id="productOrderNumber" name="orderToEdit.productOrderNumber" value="%{orderToEdit.productOrderNumber}" readonly="true" cssStyle="width:150px;color:black;"/>
		 				</s:else>
		 				</td>
		 				<td><font style="color: #484848;">REQUARD DATE :</font></td>
		 				<td>
					    <s:date name="orderToEdit.requiredDate" var="requiredDate" format="dd/MM/yyyy"/>
					    <!-- ......... PRODUCT ORDER DATE ............ -->
						<s:textfield id="requiredDate" name="strRequiredDate" value="%{#requiredDate}" key="labelkey" readonly="false" cssStyle="width:100px;color:black;"/>
					
					    </td>
		 				</tr>
					    </table>
				    </td>
		 			</tr>
				   
		 			<tr height="20px">
		 			<td width="17%"><font style="color: #484848;">CLIENT LAST NAME:</font><font style="color:red;font-size: 15px;"> *</font></td>   
		 			<!-- ......... LAST AND FIRST NAME ............ -->
		 			<td>
		 			<s:if test='%{orderToEdit.clientLastName==null || orderToEdit.clientLastName=="" || orderToEdit.clientLastName.bytes.length > 40 }'>
		 				<s:textfield id="clientLastName" name="orderToEdit.clientLastName" value="%{orderToEdit.clientLastName}" cssStyle="width:150px;background-color:#FF6666;color:black;"/> 
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientLastName" name="orderToEdit.clientLastName" value="%{orderToEdit.clientLastName}" cssStyle="width:150px;color:black;"/> 
		 			</s:else>

		 			<s:if test='%{orderToEdit.clientFirstName==null || orderToEdit.clientFirstName=="" || orderToEdit.clientFirstName.bytes.length > 30}'>
		 				<font style="color: #484848;">CLIENT FIRST NAME: </font><s:textfield id="clientFirstName" name="orderToEdit.clientFirstName" value="%{orderToEdit.clientFirstName}" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
		 				<font style="color: #484848;">CLIENT FIRST NAME: </font><s:textfield id="clientFirstName" name="orderToEdit.clientFirstName" value="%{orderToEdit.clientFirstName}" cssStyle="width:150px;color:black;"/>
		 			</s:else></td>
		 				
		 			</tr>
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT OTHER NAMES:</font></td>
		 			<td><s:textfield id="clientOtherNames" name="orderToEdit.clientOtherNames" value="%{orderToEdit.clientOtherNames}" cssStyle="width:150px;color:black;"/></td>
		 			</tr>
		 			
		 			
		 			<!-- ............................. COMPANY NAME ........................ -->

		 			
		 			<tr height="20px">
		 			<td><font style="color: #484848;">COMPANY NAME: </font></td>
		 			<td>
		 			<s:if test='%{orderToEdit.companyHeader!=null && orderToEdit.companyHeader.bytes.length > 40}'>
		 				<s:textfield id="companyHeader" name="orderToEdit.companyHeader" value="%{orderToEdit.companyHeader}" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="companyHeader" name="orderToEdit.companyHeader" value="%{orderToEdit.companyHeader}" cssStyle="width:150px;color:black;"/>
		 			</s:else></td>
		 				
		 			</tr>

		 			<!-- ............................. CLIENT SREET ........................ -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT STREET:</font><font style="color:red;font-size: 15px;"> *</font></td>
		 			<td>	
		 			<s:if test='%{orderToEdit.clientStreet==null || orderToEdit.clientStreet=="" || orderToEdit.clientStreet.bytes.length > 44}'>
		 				<s:textfield id="clientStreet" name="orderToEdit.clientStreet" value="%{orderToEdit.clientStreet}" cssStyle="width:305px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientStreet" name="orderToEdit.clientStreet" value="%{orderToEdit.clientStreet}" cssStyle="width:330px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr> 			
		 			<!-- ............................. CLIENT SREET ........................ -->
		 			
		 			<!-- ............................. CLIENT OTHER STREET ................. -->	
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT OTHER ADDRESS:</font></td>
		 			<td>
		 			<s:if test='%{orderToEdit.clientOtherStreet!=null && orderToEdit.clientOtherStreet.bytes.length > 44}'>
		 				<s:textfield id="clientOtherStreet" name="orderToEdit.clientOtherStreet" value="%{orderToEdit.clientOtherStreet}" cssStyle="width:330px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
						<s:textfield id="clientOtherStreet" name="orderToEdit.clientOtherStreet" value="%{orderToEdit.clientOtherStreet}" cssStyle="width:330px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT OTHER STREET .................. -->
		 			
		 			<!-- ............................. CLIENT SREET ......................... -->
		 			
		 			<!-- ............................. CLIENT PROVINCE ...................... -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT PROVINCE:</font><font style="color:red;font-size: 15px;"> *</font></td>
		 			<td>
		 			
		 			<s:if test='%{orderToEdit.clientProvince==null || orderToEdit.clientProvince==""
		 						   || orderToEdit.provinceNotFound==1}'>
		 				<s:select
				        id="provinceId"
				        name="code"
				        list="listProvinces"
				        emptyOption="false"
				        headerKey=""
				        listKey="code"
				        listValue="name"
				        headerValue="--Select--"
				        cssStyle="width:153px;background-color:#FF6666;color:black;"/>			        
		 				<s:textfield id="clientProvince" name="orderToEdit.clientProvince" value="%{orderToEdit.clientProvince}" cssStyle="width:172px;background-color:#FF6666;color:black;"/>
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
				        headerValue="--Select--"
				        cssStyle="width:153px;color:black;"/>
		 				<s:textfield id="clientProvince" name="orderToEdit.clientProvince" value="%{orderToEdit.clientProvince}" cssStyle="width:172px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT PROVINCE ...................... -->
		 			
		 			<!-- ............................. CLIENT CITY .......................... -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT CITY:</font><font style="color:red;font-size: 15px;"> *</font></td>
		 			<td>
		 			<!-- ......... CLIENT CITY ............ -->
		 			<s:if test='%{orderToEdit.clientCity==null || orderToEdit.clientCity=="" || orderToEdit.clientCity.bytes.length > 25}'>
		 				<s:textfield id="clientCity" name="orderToEdit.clientCity" value="%{orderToEdit.clientCity}" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientCity" name="orderToEdit.clientCity" value="%{orderToEdit.clientCity}" cssStyle="width:150px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT CITY .......................... -->
		 			
		 			<!-- ............................. CLIENT POSTALE CODE ................... -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT POSTAL CODE:</font><font style="color:red;font-size: 15px;"> *</font></td>
		 			<td>
		 			
		 			<s:if test='%{orderToEdit.clientPostalCode==null || orderToEdit.clientPostalCode==""  || orderToEdit.clientPostalCode.bytes.length > 14}'>
		 				<s:textfield id="clientPostalCode" name="orderToEdit.clientPostalCode" value="%{orderToEdit.clientPostalCode}" cssStyle="width:150px;background-color:#FF6666;color:black;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientPostalCode" name="orderToEdit.clientPostalCode" value="%{orderToEdit.clientPostalCode}" cssStyle="width:150px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT POSTALE CODE ................... -->
		 			
		 			<!-- ............................. CLIENT PHONE........................... -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT PHONE:</font></td>
		 			<td>
		 			<s:if test='%{orderToEdit.clientPostalCode!=null && orderToEdit.clientPhone.bytes.length > 25}'>
		 				<s:textfield id="clientPhone" name="orderToEdit.clientPhone" value="%{orderToEdit.clientPhone}" cssStyle="width:150px;color:black;background-color:#FF6666;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientPhone" name="orderToEdit.clientPhone" value="%{orderToEdit.clientPhone}" cssStyle="width:150px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT PHONE........................... -->
		 			
		 			<!-- ............................. CLIENT EMAIL........................... -->
		 			<tr height="20px">
		 			<td><font style="color: #484848;">CLIENT EMAIL:</font></td>
		 			<td>
		 			<s:if test='%{orderToEdit.clientEmail!=null && orderToEdit.clientEmail.bytes.length > 60}'>
		 				<s:textfield id="clientEmail" name="orderToEdit.clientEmail" value="%{orderToEdit.clientEmail}" cssStyle="width:305px;color:black;background-color:#FF6666;"/>
		 			</s:if>
		 			<s:else>
		 				<s:textfield id="clientEmail" name="orderToEdit.clientEmail" value="%{orderToEdit.clientEmail}" cssStyle="width:150px;color:black;"/>
		 			</s:else>
		 			</td>
		 			</tr>
		 			<!-- ............................. CLIENT EMAIL........................... -->
		 			
		 			<!-- ............................. ITEMS TITLE............................ -->
		 			<tr height="25px">
		 			<td colspan="2" valign="middle" style="color:red;text-decoration:underline;">ITEMS:</td>
		 			</tr>
		 			<!-- ............................. ITEMS TITLE............................ -->
		 		</table>
		 		
		 		<!-- ............................. ITEMS....................................... -->
		 		<table border="0"  width="100%" cellspacing="0px" cellpadding="0px"  style="padding-left: 0px;cursor:default;">
			 	<tr height="25px" valign="middle" align="center" style="font-weight: bold;border-right: 1px solid #CCCCCC;border-left: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;" >
			 		<th style="border-right: 0px solid #CCCCCC;width: 128px;"><font style="color: #484848;">LS PRODUCT ID</font><font style="color:red;font-size: 15px;"> *</font></th>
			 		<th style="border-right: 0px solid #CCCCCC;width: 128px;"><font style="color: #484848;">QUANTITY</font><font style="color:red;font-size: 15px;"> *</font></th>
			 		<th style="border-right: 0px solid #CCCCCC;width: 75px;"><font style="color: #484848;">STOCK</font></th>
			 		<th style="border-right: 0px solid #CCCCCC;width: 205px;"><font style="color: #484848;">PRODUCT TITLE</font></th>
			 		<th style="border-right: 0px solid #CCCCCC;width: 85px;"><font style="color: #484848;">LS PRICE</font></th>
			 		<th style="border-right: 0px solid #CCCCCC;width: 85px;"><font style="color: #484848;">UNIT PRICE</font><font style="color:red;font-size: 15px;"> *</font></th>
			 		<th align="center" style="border-right: 0px solid #CCCCCC;width: 58px;"><font style="color: #484848;">STATUS</font></th>
			 		<th colspan="3"></th>
			 	</tr> 
		 		</table>
		 		<div id="divRowsOrder" style="overflow: auto;max-height: 170px;cursor:default;">
				<table id="tabOrderRowsDetailPop" border="0"  width="100%" id="tabItemsPop" cellspacing="0px" cellpadding="0px"  style="padding-left: 0px;cursor:default;">
			    <s:iterator value="orderToEdit.rowsList" id="cell">
			    <!-- Order Rows -->
			    <s:if test='%{toDelete==0}'>
			    <tr valign="middle" align="center">
			   		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;<s:property value="#cell.css"/>
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textfield id="lsProductID" name="lsProductID" value="%{lsProductID}" cssStyle="width:120px;margin-left:2px;color:black;"/></td>
			    	<td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;" width="130px">
		  		 		       <center id="userId" style="visibility:hidden;display:none;"><s:property value="%{orderToEdit.userId}"/></center>
		   		 		       <center id="productId"  style="visibility:hidden;display:none;"><s:property value="%{orderToEdit.productId}"/></center>
		  		 		       <center id="lsOrderId"  style="visibility:hidden;display:none;"><s:property value="%{orderToEdit.lsOrderId}"/></center>
		  		 		       <center id="indexOrder" style="visibility:hidden;display:none;"><s:property value="%{orderToEdit.index}"/></center>
		  		 		       <center id="indexRow"   style="visibility:hidden;display:none;"><s:property value="#cell.index" /></center>
		  		 		       <!-- .............. QUANTITY ............ -->
		 					 
		  		 			  <!--  <s:textfield id="quantity" name="quantity" value="%{quantity}" cssStyle="width:40px;"/> -->
		  		 			  <input type="text" id="quantity" name="quantity" value='<s:property value="%{quantity}"/>' style='color:black;width:40px;<s:property value="%{cssQuantity}"/>'/>
		  		 			  <font style="color: #484848;">SP:</font><s:textfield id="quantityToChange" name="quantityToSplit" value="%{quantityToSplit}" cssStyle="width:40px;color:black;"/></td>
		  		    <td style="border-left: 1px solid #CCCCCC; border-right:0px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textfield id="stock" name="stock" value="%{stock}" readonly="true" cssStyle="width:70px;color:black;"/></td>
			 		<td style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;"><s:textarea id="productDescription" name="productDescription" value="%{productDescription}" cssStyle="width:200px;padding:0px; margin:0px; height:20px;color:black;"/></td>
	 			 	
	 			 	<!-- .............. lsPrice and unitPrice ............ -->
	 			 	<s:if test='%{orderToEdit.currencyId == 1}'>
	 			 		<td  style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
	  		 				<span style="margin-left:2px;width:70px;background-color: white;font-weight: bold;">
	  		 					<s:property value="%{lsPrice}"/>
	  		 				</span>
		  		 		</td>
	  		 			<td  style="border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
		  		 			<input type="text" id="unitPrice" name="unitPrice" value='<s:property value="%{unitPrice}"/>' style='color:black;width:70px;margin-left:2px;<s:property value="#cell.cssPrice"/>'/>
		  		 		</td>
		  		 	</s:if>
		  		 	
		  		 	<!-- .............. lsPrice and unitPrice with CUrrency ............ -->
		  		 	<s:else>
		  		 		<td  style="border-left: 1px solid #CCCCCC;border-right: 0px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
	  		 				<span style="margin-left:2px;width:70px;background-color: white;font-weight: bold;">
	  		 					<s:property value="%{currencyPrice}"/>
	  		 				</span>
		  		 		</td>
	  		 			<td  style="border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;
		  		 		       border-bottom: 1px solid #CCCCCC;border-top: 0px solid #CCCCCC;">
		  		 			<input type="text" id="unitPrice" name="unitPrice" value='<s:property value="%{currencyUnitPrice}"/>' style='color:black;width:70px;margin-left:2px;<s:property value="#cell.cssPrice"/>'/>
		  		 		</td>
		  		 		<td>
		  		 			<span style="margin-left:2px;width:40px;color: red;font-weight: bold;">
	  		 					<s:property value="%{currencySymbol}"/>
	  		 				</span>
		  		 		</td>
		  		 	</s:else>
		  		 	
		  		 	<td align="center" width="60px" style="border-right: 1px solid #CCCCCC;"><span style="color:black;background-color: white;"><s:property value="#cell.status"/></span></td>      
		  		 	<td width="25px"><img id="iconSaveTemporaryRow" src='<s:property value="#cell.icon" />'  style="cursor:pointer;"/></td>
		  		 	<td width="25px"><img id="iconSimilarRow" src="images/orders/similarRow.png"  style="cursor:pointer;"/></td>
		  		    <td width="25px" colspan="2" style="border-right: 1px solid #CCCCCC;"><img id="iconDeleteRow" src="images/orders/deleteItem.png" style="cursor:pointer;"/></td>       
			    </tr>
			    <!-- Heel of Order Rows -->
			    <tr style="border-left: 1px solid #CCCCCC;border-right: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
			    	<td align="center" colspan="3"><span style="color: #484848;"><font style="color: #484848;">[Quantity Original: </font><font style="color: black;background-color:white;"><s:property value="#cell.quantityOriginal"/></font> ]</span></td>
			    	<td align="right" colspan="2"><font style="color: #484848;">SHIPPING FEE:</font></td>
			    	<s:if test='%{orderToEdit.currencyId == 1}'>
			 			<td colspan="6" align="left"><s:textfield id="shippingFee" name="shippingFee" value="%{shippingPrice}" cssStyle="color:black;width:70px;"/></td>
			 		</s:if>
			 		<s:else>
			 			<td colspan="6" align="left">
			 				<s:textfield id="shippingFee" name="shippingFee" value="%{shippingPrice}" cssStyle="color:black;width:80px;"/>
			 				<span style="width:40px;color: red;font-weight: bold;">
	  		 					<s:property value="%{currencySymbol}"/> 
	  		 				</span>
			 			</td>
			 		</s:else>
			    </tr>
			    <tr style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;">
			   		<td align="center" colspan="3"><font style="color: #484848;"><span style="color: #484848;"><font style="color: #484848;">[Provided_Ls_Product_ID: </font><font style="color: black;background-color:white;"><s:property value="#cell.providedLsProductId"/></font> ]</span></td>
			    	<td align="right" colspan="2"><font style="color: #484848;">SHIPPING COMPANY:</font></td>
			 		<td colspan="6" align="left"><s:textfield id="shippingCompany" name="shippingCompany" value="%{shippingCompany}" cssStyle="color:black;width:180px;"/></td>
			    </tr>
			    <tr  style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;">
			    	<td align="right" colspan="5"  style="padding-bottom:10px;"><font style="color: #484848;">TRACKING NUMBER:</font></td>
			 		<td colspan="6" align="left" style="padding-bottom:10px;"><s:textfield id="trackingNumber" name="trackingNumber" value="%{trackingNumber}" cssStyle="color:black;width:180px;"/></td>
			    </tr>
			    </s:if>
			    </s:iterator>
			    </table>
			    </div>
			</div>
		</td>
		</tr>
		<tr valign="top">
		<td colspan="3" align="center">
			<input id="btSave" type="submit" value="Save"
				   style="margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;" />
			<input id="btDuplicate"  type="submit" value="Duplicate"
				   style="margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;" />
			<s:if test='%{userPrivileges!=null}'>	   
				<input id="btDeleteOrder"  type="submit" value="Delete this Order"
				   	   style="margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color: #FF6666;color:white;font-weight: bold;" />
			</s:if>   
			<input id="btCancel"  type="submit" value="Close"
				   style="margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;background-color:#E8E8E8;font-weight: bold;" /></td>
		 </tr>
			 					 			
	</table>
  
 <!-- ...........................jsp fragment ................................. -->
	     <%@ include file="saveSuccessPop.jsp" %>
	     <%@ include file="confirmDeleteOrderPop.jsp" %>
	     <%@ include file="toolTipPop.jsp" %>
	     <%@ include file="toolTipCurrencyPop.jsp" %>
 <!-- ......................................................................... -->	
</div>
</div>


<script type="text/javascript" charset="utf-8">

$(document).ready(function() {
	
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
	
	/*----------------------------- When shippingFee Losts focus -------------------------- 
			//Accept only numbers
	----------------------------------------------------------------------------------------*/
	$("#shippingFee").blur( function(){
	var shippingFee = $("#shippingFee").val();
	$("#shippingFee").css("backgroundColor", "#FFFFFF");
	if(!isNumber(shippingFee) || parseFloat(shippingFee)<=0) {
		$("#shippingFee").val("");
		$("#shippingFee").css("backgroundColor", "#FF6666");
	} else {
		var valShippingFee = parseFloat(shippingFee).toFixed(2);
		$("#shippingFee").val(valShippingFee);
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
