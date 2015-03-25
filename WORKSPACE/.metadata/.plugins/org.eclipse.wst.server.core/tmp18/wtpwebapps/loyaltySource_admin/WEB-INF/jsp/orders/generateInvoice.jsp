<%@ taglib uri="/struts-tags" prefix="s" %>

<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/loyalty/order/orderManager.js"></script> 

<style type="text/css">

<script type="text/javascript">
	$("#topMenuRed").hide();

</script>

<style type="text/css">

label{
	width:100%;
}
.vanadium-advice {
	margin-left: 100%;
}
input.vanadium-valid {
	background-image: none;
}

.row_without_color {
	background-color:white;
}
.row_with_color {
	background-color: rgb(245,249,252);
}

</style>
 
 
<div id="page" class="unit" style="width:800px;margin-left:60px;" align="left">
<div class="pop_title" style="margin-top:30px;">Generate Invoice</div>
<div id="formContainer" style="padding-bottom: 200px;" align="left">
 	<s:if test="hasActionErrors()">  
 	 <div id="globalAdvice" class="gray_bg global-vanadium-advice">
		<s:iterator value="actionErrors">
  			<span><s:property escape="false" /></span><br/>
  		</s:iterator>
  	</div>  
	 </s:if>  
<br/><br/>
	<!-- ============================= FORM : Generate Invoice  ===================== -->
	<form id="form" action="generateInvoice.do" method="post" enctype="multipart/form-data">
		<s:hidden id="frmGenerateInvoice" name="btGenerateInvoice"  value="-1"/>
		<s:hidden id="frmGenerateInvoiceConfirmed" name="generateInvoiceConfirmed"/>
		<s:hidden id="frmFileName" name="originalFileName"/>
		<s:hidden id="frmUploadInvoiceXML" name="uploadInvoiceXML" value="-1"/>
		<s:hidden id="frmDeleteInvoiceXML" name="deleteInvoiceXML" value="-1"/>
		<s:hidden id="frmFileToDelete" name="fileToDelete"/>

	<table border="0" width="600" align="left">
		<!-- ............................. TABLE USER LOGIN ............................ -->
		<tr>
			<td width="640px" valign="middle" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
			<table border="0" id="tabLogin" width="600px" height="80px" >
			<!-- ...................... Line separator ............. -->
				<tr height="5px">
					<td colspan="2"/>
				</tr>
				<!-- ....................User login name............................... -->
				<tr valign="middle" height="50px">
					<td valign="middle" style="padding-left: 10px;width:120px;">User Login:</td>
				<td>
				<div class="ui-widget">
					<span style="font-size:12px;">
					<s:if test='%{(userLogin==null || userLogin=="")&& requirdFieldError==1}'>
						<s:textfield id="txtUserLoginTo"  cssStyle="color:black;width: 250px;" name="userLogin" value='<s:property value="%{userLogin}"/>' autocomplete="off"/>
					</s:if>
					<s:else>
						<s:textfield  id="txtUserLoginTo" name="userLogin" cssStyle="color:black;width: 250px;" value="%{userLogin}" autocomplete="off"/>
					</s:else>
					</span>
				</div>
				<div style="position:absolute;">  
					<select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
						style="height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;">
					<option></option>
					</select>
				</div>
				</td>
				</tr>
				<!-- ................................................... -->

				<!-- ...................... Client File ............... -->
				<tr>
				<td style="padding-left: 10px;">Upload File:</td>
				<td style="padding-right: 10px;"><s:file id="fileToUpload" name="qbInvoiceXmlFile" /></td>
				</tr>
				<!-- ................................................... -->

				<!-- ...................... Line separator ............. --> 
				<tr height="5px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->

				<!-- ...................... Generate Invoice ..................... -->
				<tr>
				<td style="padding-left: 10px;"/>
				<td align="left"><input type="button" id="btGenerateInvoice" value="Generate Invoice" style="margin:0px 0px 0px 0px;padding:4px 10px;font-size:12px;"/></td>
				</tr>
				<!-- ................................................... -->

				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
				
				<!-- ...................... Files List ................. -->
				<tr>
				<td colspan="3" style="padding-left:20px;padding-right:20px;">
					<table id="tabUserFiles" style="direction: ltr;table-layout: fixed;" border="0" width="580px">
						<thead>
						<tr height="25px" style="border:1px solid #CCCCCC;">
						<th width="250px">File Name</th>
						<th width="250px">Generate File Name</th>
						<th width="40px" style="padding-right: 10px;"></th>
						<th width="40px" style="padding-right: 10px;"></th>
						</tr>
						</thead>
						<tbody>
						<s:iterator value="%{fileNamesWithStatus}">
	          			<tr id="rowFile" height="25px" style="cursor: pointer;">
							<td id="fileNameItemId" style="border:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="key"/></td>
							<td id="generatedFileNameItemId" style="border:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="value"/></td>
							<td title="Download Generated Invoice" style="border:1px solid #CCCCCC;padding-right: 0px;" align="center">
								<img id="imgDownloadGeneratedInvoice" alt="download" src="images/orders/downloadFilePo.png"/>
							</td>
							<td title="Delete Invoice" style="border:1px solid #CCCCCC;padding-right: 0px;" align="center">
								<img id="imgDeleteInvoice" alt="upload" src="images/orders/deleteItem.png"/>
							</td>
						</tr>
						</s:iterator> 
						</tbody>
					</table>
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- ................................................... -->
			</table>
		</table>
	</form>
	
	<!-- FORM FOR DOWNLOAD GENERATED INVOICE FILE --> 
    <form id="formDownloadFileImported" action="downloadFile.do" method="post" enctype="multipart/form-data">
   		<s:hidden id="frmUserLogin" name="userLogin" value="null" />
		<s:hidden id="frmFileToImport" name="fileName" value=""/>
		<s:hidden id="frmInvoicing" name="invoicing" />
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
    <!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/confirmGenerateFile.jsp" %>
    <!-- ......................................................................... --> 	  
	</div>
</div>


<script type="text/javascript" charset="utf-8">
// Jquery Function main 

$(document).ready(function() { 
	/*------------------------------------- Generate Invoice -------------------------------------- 
							when Admin click on the Generate Invoice button 
	----------------------------------------------------------------------------------------*/
	$("#btGenerateInvoice").click( function(){
		var originalFileName=$("#fileToUpload").val();
		$("#frmFileName").val(originalFileName);
		//alert($('#frmFileName').val());
		$('#frmGenerateInvoice').val(1);
		$('#frmGenerateInvoiceConfirmed').val(-1);
		$('#frmUploadInvoiceXML').val(-1);
    	$('#form').trigger("submit");
	});
	//---------------------------When admin confirms invoice generation ----------------------------------
	$('#confirmGenerateFile #btGenerateInvoiceCFM').click( function(){
		var originalFileName=$('#originalFileName').val();
		$("#frmFileName").val(originalFileName);
		$('#frmGenerateInvoice').val(1);
		$('#frmGenerateInvoiceConfirmed').val(1);
		$('#frmUploadInvoiceXML').val(-1);
		$('#form').trigger("submit");
	});	
	//---------------------------When admin cancel invoice generation ----------------------------------
	$('#confirmGenerateFile #btCancelCFM').click( function(){
		$('#frmGenerateInvoice').val(-1);
		$('#frmGenerateInvoiceConfirmed').val(-1);
		$('#frmUploadInvoiceXML').val(-1);
		$('#form').trigger("submit");	 	 
	});
	//---------------------------When admin click on Downolaod invoice generation icon -----------------
	$('#tabUserFiles  #imgDownloadGeneratedInvoice').click( function() {
		//alert("hi");
		var index=$('#tabUserFiles #imgDownloadGeneratedInvoice').index(this);
		var fileToDownload=$('#tabUserFiles #generatedFileNameItemId').eq(index).text();
		var userLogin=$('#txtUserLoginTo').val();
		$('#frmFileToImport').val(fileToDownload);
		$('#frmInvoicing').val(1);
		$('#frmUserLogin').val(userLogin);
		$('#formDownloadFileImported').trigger("submit");
	});
	//---------------------------When admin click on Delete generated invoice  --------------------------
	$('#tabUserFiles #imgDeleteInvoice').click( function() {
		var index=$('#tabUserFiles #imgDeleteInvoice').index(this);
		var fileToDelete=$('#tabUserFiles #generatedFileNameItemId').eq(index).text();
		$('#frmFileToDelete').val(fileToDelete);
		$('#frmGenerateInvoice').val(-1);
		$('#frmUploadInvoiceXML').val(-1);
		$('#frmDeleteInvoiceXML').val(1);
		$('#form').trigger("submit");
	});	
});
</script>













