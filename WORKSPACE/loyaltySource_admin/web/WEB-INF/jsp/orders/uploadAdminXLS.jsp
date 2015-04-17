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
<div class="unit" style="width:800px;margin-left:100px;">

<s:if test='%{init==1}'>
	<div class="pop_title" style="margin-top:30px;">Shipped Product Export</div>
</s:if>
<s:elseif test='%{init==2}'>
	<div class="pop_title" style="margin-top:30px;">Update Stock</div>
</s:elseif>

<s:elseif test='%{init==3}'>
  <div class="pop_title" style="margin-top:30px;">Saving Special Shipping Rate</div>
</s:elseif>

<s:elseif test='%{init==4}'>
  <div class="pop_title" style="margin-top:30px;">ETA Report</div>
</s:elseif>

 <div id="formContainer" style="height: 600px;">
        
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if>
 
 <!-- ====================== SAVING SPECIAL SHIPPING RATE ====================== -->
 <s:if test='%{init==3 || init==4}'>
  <table>
  <tr>
  	  <!-- ................................. USER LOGIN ....................... -->
	  <td style="padding-top: 30px;">
	  <table border="0" width="520px" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 border-bottom: 1px solid #CCCCCC;border-top: 2px solid #CCCCCC; vertical-align:top;">
		
				<!-- ...................... Line separator .................... -->
				<tr height="20px">
				<td colspan="3"/>
				</tr>
				<!-- ........................................................... -->
				<!-- ...................... Client Login ........................ -->
				<tr>
				<td style="padding-left: 5px;width:250px;">Client Login:</td>
				<td>
					<div class="ui-widget">
		   			<span style="font-size:12px;">
		   			<input type="text" id="txtUserLoginTo" name="userLogin" value='<s:property value="%{userLogin}"/>' Style="width:205px"  autocomplete="off"/>
		   			</span>
		   			</div>
		   			<div style="position:absolute;">  
		   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
		   			 		 style="height:67px;width:205px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					    <option></option>
					 </select>
					 
		   			</div>
				</td>
				<td width="120px"><div style="padding-bottom: 30px;cursor: pointer;"><img style="position:absolute;padding-left:10px;" id="iconFindfieldNameId" alt="find" src="./images/find.png"></div></td>
				</tr>
				<!-- ............................................................ -->

				<!-- ...................... ETA ................................. -->
				<s:if test='%{init==4}'>
					<!-- ....... Line separator ....... -->
					<tr height="10px">
					<td colspan="3"/>
					</tr>
					<!-- ....... ETA Column Name ...... -->
					<tr>
					<td style="padding-left: 5px;width:100px;">ETA Column Name:</td>
					<td width="140px" colspan="1">
						 <s:select 
						id="etaFieldNameId"
						name="etaFieldName"
						list="etaFieldNamesList"
						emptyOption="false"
	 					listKey="%{etaFieldName}"
						listValue="%{etaFieldName}"
	 					headerKey=""
	 					headerValue=""
						cssStyle="width:210px;font-size: 10pt;" disabled="%{enabledEtaComboList}"/>
					</td>
					<td><s:checkbox id="enabledEtaComboListId" name="enabledEtaComboList" value="%{enabledEtaComboList}" title="Uncheck it to enabled ETA comboList" cssStyle="color:#00FF00;"/></td>				
					</tr>
					<!-- ....... Line separator ....... -->
					<tr height="10px">
					<td colspan="3"/>
					</tr>
					<tr>
					<!-- ....... ETA Column Name ...... -->
					<td style="padding-left: 5px;width:100px;">2nd ETA Column Name :</td>
					<td width="140px" colspan="1">
						<s:select 
						id="secondEtaFieldNameId"
						name="secondEtaFieldName"
						list="secondEtaFieldNamesList"
						emptyOption="false"
	 					listKey="%{secondEtaFieldName}"
						listValue="%{secondEtaFieldName}"
	 					headerKey=""
	 					headerValue=""
						cssStyle="width:210px;font-size: 10pt;" disabled="%{enabled2dEtaComboList}"/>
					</td>
					<td><s:checkbox id="enabled2dEtaComboListId" name="enabled2dEtaComboList" value="%{enabled2dEtaComboList}" title="Uncheck it to enabled 2d ETA comboList" cssStyle="color:#00FF00;"/></td>				
					</tr>
					
				</s:if>
				<!-- ............................................................ -->

				<!-- ...................... Line separator ...................... -->
				<tr height="10px">
				<td colspan="3"/>
				</tr>

				<!-- ...................... FORM CONTENT FILE CLIENT ........... -->
				<tr>
				<td style="padding-left: 5px;">Upload File:</td>
				<td style="padding-right: 10px;" colspan="2" align="left">
				<div style="width:210px;overflow: hidden;text-overflow: ellipsis;">
				<form id="formUploadFile" action="uploadAdminXLS.do" method="post" enctype="multipart/form-data">
				<s:hidden id="frmUserLogin" name="userLogin" value=""/>
				<s:hidden id="frmEtaFieldName" name="etaFieldName" value=""/>
				<s:hidden id="frmSecondEtaFieldName" name="secondEtaFieldName" value=""/>
				
				<s:hidden id="frmChangeEtaFieldNameSignal" name="changeEtaFieldNameSignal" value="0"/>
				<s:hidden id="frmChange2dEtaFieldNameSignal" name="change2dEtaFieldNameSignal" value="0"/>
				
				<s:hidden id="frmFindEtaFieldNameSignal" name="findEtaFieldNameSignal" value="0"/>
				<s:hidden id="frmEnabledEtaComboListSignal" name="enabledEtaComboListSignal" value="0"/>
				<s:hidden id="frmEnabled2dEtaComboListSignal" name="enabled2dEtaComboListSignal" value="0"/>
				<s:hidden id="frmWithTowColumnsSignal" name="withTowColumnsSignal" value="0"/>
				<s:hidden id="doUpdate" name="doUpdate" value="0" />		
				<s:file id="fileToUpload" type="file" name="fileXLS" />
				</form>
				</div>
				</td>
				
				</tr>
				<!-- ............................................................ -->

				<!-- ...................... Line separator ...................... -->
				<tr height="7px">
				<td colspan="3"/>
				</tr>
				<!-- ............................................................ -->

				<!-- ...................... submit .............................. -->
				<tr>
				
				<td align="center" colspan="3" ><input type="button" id="btUpload" value="Upload" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
				</tr>
				<!-- ............................................................ -->
						
				<!-- ...................... Line separator ...................... -->
				<tr height="10px">
				<td colspan="3"/>
				</tr>
				<!-- ............................................................ -->
	  </table>
	  </td>
	  <!-- ................................. USER LOGO .......................... -->
	  <td style="padding-top: 30px;width:450px;" align="right" valign="top">
	  <s:if test="%{userLogo!=null}" >
	   <img alt="" src='<s:property value="%{userLogo}"/>'/>
	  </s:if>
	  </td>
  </tr>
  <tr>
  	<td align="center" height="100px">
  	<s:if test='%{init==4}'>
  		<img id="imgGetEtaXLS" src="images/orders/xls.png" style="cursor:pointer;" title="Get ETA Report"/>
  	</s:if>
   	</td>
   	<td/>
  </tr>
  
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
</s:if>

<s:if test='%{init==4}'>
	<!-- FORM FOR DOWNLOAD ETA XLS File --> 
   <s:form id="formOrdersEtaXLS" action="ordersAdminXLS.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="frmUserLogin" name="userLogin" value="" />
    	<s:hidden id="frmSecondEtaFieldName" name="secondEtaFieldName" value="" />
		<s:hidden id="selectedOrdersListSignal" name="selectedOrdersListSignal" value="0"/>
		<s:hidden id="etaSignal" name="etaSignal" value="0"/>		
   </s:form>
</s:if>

 <!-- ====================== SHIPPED PRODUCT EXPORT ====================== -->
<s:elseif test='%{init==1}'>
  <br/> <br/>
   <form id="formUploadFile" action="uploadAdminXLS.do" method="post" enctype="multipart/form-data">
      <label for="fileXLS">Upload File:</label>
      <input type="file" name="fileXLS" />
      <s:hidden id="doUpdate" name="doUpdate" value="0" />
      <input id="btUploadFile" type="button" value="Upload"/>
   </form>
 </s:elseif> 
 
  <!-- ====================== UPDATE STOCK =============================== -->
 <s:elseif test='%{init==2}'>
  <br/> <br/>
  <table border="0" width="500px" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 border-bottom: 1px solid #CCCCCC;border-top: 2px solid #CCCCCC; vertical-align:top;">
	  <tr>
	  <td style="padding:20px;">
		   <form id="formUploadFile" action="uploadAdminXLS.do" method="post" enctype="multipart/form-data">
		      Upload File:
			  <s:hidden id="doUpdate" name="doUpdate" value="0" />
		      <input type="file" name="fileXLS" />
		   </form>
	   </td>
	   <td style="padding:20px;"><img  id="btUploadFile" title="Upload XLS File Stock" alt="Upload XLS File" width="30px" height="30px" src="images/upload.png" style="cursor: pointer;"></td>
	   </tr>
	   <tr>
	   <td  colspan="2" align="center" style="padding:20px;">
		    <s:if test="%{listProductDTOFormXLS==null || listProductDTOFormXLS.size==0}">
		   <input id="btUpdateStockDisabled" disabled="disabled" type="button" value="Upload First xls File To Update Stock" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;font-weight:bold;"/> 
		   </s:if>
		   
		   <s:else>
		   <img id="exclamationStock" alt="Please Click on This Button To Update Stock" src="images/exclamation.png" width="110px" height="110px"/>
		    <input id="btUpdateStock" type="button" value="Update Stock" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;color:#FF6666;font-weight:bold;cursor: pointer;"/>
		   </s:else>
	   </td>
	   </tr>
</table>
 <s:if test="%{listProductNotFound.size > 0}">
 <br/><br/>
 <font style="font-size:12pt; text-decoration: underline;"><s:property value="%{listProductNotFound.size}"/> Products Not Found In The System</font>
 <br/><br/>
 <div style="overflow-y: auto;width:300px;direction: rtl;text-align: left;max-height:300px;height:320px;cursor:default;padding-bottom: 10px;overflow-x:hidden;">
 <table style="table-layout: fixed;" width="220px">
	<s:iterator value="listProductNotFound" id="product">
	<tr> <td><s:property value="#product.loyaltyProductId"/></td></tr>
	</s:iterator>
 </table>
 </div>
 </s:if>
</s:elseif> 

<!-- ................. Show just logs of special shipping .................... -->  
 <s:if test='%{init==3}'>
	<table border="0px" width="100%">
	   	<tr height="50px;">
			<td/>
		</tr>
		<tr height="30px;">
			<td valign="middle"><font style="text-decoration: underline;font-size:11pt;">
			 <s:if test="%{rapportError!=null}" >Comments</s:if></font></td>
		</tr>
		<tr >
			<td>
			<div style="overflow-y: auto;max-height:150px;height:150px;cursor:default;overflow-x:hidden;width: 800px;">
			<br/>
			<s:property value="%{rapportError}" escape="false"/>
			<br/>
			</div>
			</td>
		</tr>
	</table>
</s:if>
<!-- ................. Show logs .................... -->   
 <form id="frmUploadAdminXLS" action="uploadAdminXLS.do" method="post" enctype="multipart/form-data">
  	 <s:hidden id="frmUserLogin" name="userLogin" value=""/>
  	 <s:hidden id="frmEtaFieldName" name="etaFieldName" value=""/>	
  	 <s:hidden id="frmSecondEtaFieldName" name="secondEtaFieldName" value=""/>	 
     <s:hidden id="okNotificationPop" name="okNotificationPop"/>
 </form>

</div>

</div>


	<!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/notificationUplaodPop.jsp" %>
	     <%@ include file="dialogues/waitPop.jsp" %>
	     
	<!-- ......................................................................... -->
	
<script type="text/javascript" charset="utf-8">

$(function() {
	$('#waitPop #wait').effect("pulsate", { times:1}, 1);
	$('#waitPop #wait').hide();
	$("#exclamationStock").effect("pulsate", { times:999}, 1300);
});


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

	//when Admin click on the Button Ok of the notification Popup 
	$('#btOK').click( function(){
		$("#okNotificationPop").val("1");
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		$('#frmUploadAdminXLS #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#frmUploadAdminXLS #frmUserLogin').val(userLogin);
		$('#frmUploadAdminXLS #frmEtaFieldName').val(etaFieldName);
		$('#frmUploadAdminXLS').trigger("submit");		
	});
	
	//when Admin click on the Button the Button btUpload <Update Orders> <update Stock> 
	$('#btUploadFile').click( function(){
		$('#waitPop').css("display","block"); 
		$('#waitPop').css("visibility","visible");
		$('#waitPop #wait').show();
		$('#waitPop #wait').effect("pulsate", { times:999}, 2000);
		$('#formUploadFile').trigger("submit");		
	});

	//when Admin click on the Button the Button btUpload <Update Orders> <update Stock> 
	$('#btUpdateStock').click( function(){
		$('#waitPop').css("display","block"); 
		$('#waitPop').css("visibility","visible");
		$("#formUploadFile #doUpdate").val("1");
		$('#waitPop #wait').show();
		$('#waitPop #wait').effect("pulsate", { times:999}, 2000);
		$('#formUploadFile').trigger("submit");		
	});

	//when Admin click on the Button btUpload <<<Special Shipping Rate Or ETA report>>> 
	$('#btUpload').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		if(userLogin!=null && userLogin!="")$('#formUploadFile #frmUserLogin').val(userLogin);
		if(etaFieldName!=null && etaFieldName!="")$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#waitPop').css("display","block"); 
		$('#waitPop').css("visibility","visible");
		$('#waitPop #wait').show();
		$('#waitPop #wait').effect("pulsate", { times:999}, 2000);
		$('#formUploadFile').trigger("submit");		
	});

	//when Admin click on the icon imgGetEtaXLS <<<Get ETA XLS File>>> 
	$('#imgGetEtaXLS').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		$('#formOrdersEtaXLS #frmSecondEtaFieldName').val(secondEtaFieldName);
		//alert($('#formOrdersEtaXLS #frmSecondEtaFieldName').val());
		if(userLogin!=null && userLogin!="")$('#formOrdersEtaXLS #frmUserLogin').val(userLogin);
		$('#formOrdersEtaXLS #selectedOrdersListSignal').val(4);
		$('#formOrdersEtaXLS #etaSignal').val(1);
		$('#formOrdersEtaXLS').trigger("submit");		
	});

	//when Admin change ETA Field Name ComboBox 
	$('#etaFieldNameId').change( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#formUploadFile #frmChangeEtaFieldNameSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);
		$('#formUploadFile').trigger("submit");	
	});

	//when Admin change ETA Field Name ComboBox 
	$('#iconFindfieldNameId').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmFindEtaFieldNameSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);
		$('#formUploadFile').trigger("submit");				
	});
	
	//when Admin change ETA Field Name ComboBox 
	$('#enabledEtaComboListId').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#formUploadFile #frmEnabledEtaComboListSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);		
		$('#formUploadFile').trigger("submit");	
	});

	//when Admin change ETA Field Name ComboBox 
	$('#enabled2dEtaComboListId').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		//alert(secondEtaFieldName);
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#formUploadFile #frmEnabled2dEtaComboListSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);		
		$('#formUploadFile').trigger("submit");	
	});

	//when Admin chose with tow columns or one column 
	$('#withTowColumnsId').click( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var withTowColumns=$('#etaFieldNameId').val();
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmWithTowColumnsSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);		
		$('#formUploadFile').trigger("submit");	
	});

	//when Admin change ETA Field Name ComboBox 
	$('#secondEtaFieldNameId').change( function(){
		var userLogin=$('#txtUserLoginTo').val();
		var etaFieldName=$('#etaFieldNameId').val();
		var secondEtaFieldName=$('#secondEtaFieldNameId').val();
		//alert(secondEtaFieldName);
		$('#formUploadFile #frmUserLogin').val(userLogin);
		$('#formUploadFile #frmEtaFieldName').val(etaFieldName);
		$('#formUploadFile #frmSecondEtaFieldName').val(secondEtaFieldName);
		$('#formUploadFile #frmChange2dEtaFieldNameSignal').val(1);
		$('#formUploadFile #doUpdate').val(1);
		$('#formUploadFile').trigger("submit");	
	});

	//when Admin mouve mouse on Find fieldName icon 
	$('#iconFindfieldNameId').mouseover( function() {
		$('#iconFindfieldNameId').attr("width","40");
		$('#iconFindfieldNameId').attr("higth","40");
		
	});
	$('#iconFindfieldNameId').mouseout( function() {
		$('#iconFindfieldNameId').attr("width","24");
		$('#iconFindfieldNameId').attr("higth","24");
	});

	//when Admin mouve mouse on get Eta XLS File icon 
	$('#imgGetEtaXLS').mouseover( function() {
		$('#imgGetEtaXLS').attr("width","60");
		$('#imgGetEtaXLS').attr("higth","60");
	});
	$('#imgGetEtaXLS').mouseout( function() {
		$('#imgGetEtaXLS').attr("width","32");
		$('#imgGetEtaXLS').attr("higth","32");
	});
	
	
});

</script>
	
