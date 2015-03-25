<%@ taglib uri="/struts-tags" prefix="s" %>

<s:if test='%{usersPrivOrdersMapping!=null}'>



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

<div id="divRoot" class="unit" style="width:1500px;margin-left:60px;">
<div class="pop_title" style="margin-top:30px;">Orders File Mapper</div>
     
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if> 
 
 <!-- ============================= FORM : OrdersFileMapper ===================== -->
   <s:form id="formOrdersFileMapper" action="ordersFileMapper.do" method="post" enctype="multipart/form-data"> 
   <s:hidden id="frmProductOrderNumber" name="ufrDTO.productOrderNumber" value=""/>
	<s:hidden id="frmClientOrderNumber" name="ufrDTO.clientOrderNumber" value=""/>
	<s:hidden id="frmCstProductNumber" name="ufrDTO.cstProductNumber" value=""/>
	<s:hidden id="frmProductOrderDate" name="ufrDTO.productOrderDate" value=""/>
	<s:hidden id="frmClientNumber" name="ufrDTO.clientNumber" value=""/>
	<s:hidden id="frmClientFirstName" name="ufrDTO.clientFirstName" value=""/>
	<s:hidden id="frmClientLastName" name="ufrDTO.clientLastName" value=""/>
	<s:hidden id="frmClientStreet" name="ufrDTO.clientStreet" value=""/>
	<s:hidden id="frmClientOtherStreet" name="ufrDTO.clientOtherStreet" value=""/>
	<s:hidden id="frmClientCity" name="ufrDTO.clientCity" value=""/>
	<s:hidden id="frmClientPostalCode" name="ufrDTO.clientPostalCode" value=""/>
	<s:hidden id="frmClientProvince" name="ufrDTO.clientProvince" value=""/>
	<s:hidden id="frmClientPhone" name="ufrDTO.clientPhone" value=""/>
	<s:hidden id="frmClientEmail" name="ufrDTO.clientEmail" value=""/>
	<s:hidden id="frmLsProductID" name="ufrDTO.lsProductID" value=""/>
	<s:hidden id="frmProductDescription" name="ufrDTO.productDescription" value=""/>
	<s:hidden id="frmUnitPrice" name="ufrDTO.unitPrice" value=""/>
	<s:hidden id="frmCompanyHeader" name="ufrDTO.companyHeader" value=""/>
	<s:hidden id="frmUserId" name="ufrDTO.userId" value=""/>
	<s:hidden id="frmFileTypeId" name="ufrDTO.fileTypeId" value=""/>
	<s:hidden id="frmFileType" name="ufrDTO.fileType"/>
	<s:hidden id="frmQuantity" name="ufrDTO.quantity" value=""/>
	<s:hidden id="frmTagRoot" name="ufrDTO.tagRoot" value=""/>
	<s:hidden id="frmShippingCompany" name="ufrDTO.shippingCompany" value=""/>
	<s:hidden id="frmRequiredDate" name="ufrDTO.requiredDate" value=""/>
	<s:hidden id="frmClientOtherNames" name="ufrDTO.clientOtherNames" value=""/>
	<s:hidden id="frmClientPhoneZone" name="ufrDTO.clientPhoneZone" value=""/>
	<s:hidden id="frmFormatDate" name="ufrDTO.formatDate" value=""/>
	<s:hidden id="frmNotes" name="ufrDTO.notes" value=""/>
	<s:hidden id="frmClientProductNumber" name="ufrDTO.clientProductNumber" value=""/>
	<s:hidden id="frmClientOtherId" name="ufrDTO.clientOtherId" value=""/>
	<s:hidden id="frmProvidedLsProductId" name="ufrDTO.providedLsProductId" value=""/>
	<s:hidden id="frmFileTypeIdConfirm" name="ufrDTO.fileTypeIdConfirm" value=""/>
	<s:hidden id="frmFileFormatIdComfirm" name="ufrDTO.fileFormatIdComfirm" value=""/>
	<s:hidden id="frmSaveOrderMapConfirmed" name="saveOrderMapConfirmed"/>
    <s:hidden id="frmUploadClicked" name="btUploadClicked" value="1"/>
    <s:hidden id="frmGetMappingClicked" name="btGetMappingClicked" value="-1"/>
    <s:hidden id="frmSaveOrderMap" name="saveOrderMap" value="-1"/>
    <s:hidden id="frmUploadedFileName" name="uploadedFileName"/>
 
 
 	<table border="0">
 		<tr height="30px">
 		<td width="9px" rowspan="3"></td>
			<td></td>
		</tr>
		<!-- ............................. TABLE USER LOGIN ............................ -->
		<tr>
			<td valign="middle" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 					   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
			<table border="0" id="tabLogin" width="470px" height="80px" >
			<!-- ...................... Line separator ............. -->
			<tr height="5px">
				<td colspan="4"/>
			</tr>
			<!-- ................................................... -->
			<tr valign="middle" height="60px">
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
			<td align="left" width="40px"> User ID:</td>
			<td width="40px" id="userIdFinded" style="color:black;" ><s:property value="%{userId}"/></td>
			<td width="60px" style="padding-left: 5px;"></td>
			</tr>
			
			<!-- ...File Type... -->
			<tr>
				<td style="padding-left: 10px;width:120px;">File Type:</td>
				<td>
				<s:select label="File type"
	      				  name="selectedFileType"
	      				  headerKey="-1" headerValue="File type"
       					  list="#{'1':'XML', '2':'XLS', '3':'CSV'}"
       					  value="%{selectedFileType}"
      					  required="false"  cssStyle="width:140px"/></td>
			<tr>
			<!-- ...................... Line separator ............. -->
			<tr height="15px">
				<td colspan="4"/>
			</tr>
			<!-- ...................... Client File ............... -->
			<tr>
				<td style="padding-left: 10px;">Upload File:</td>
				<td style="padding-right: 10px;"><s:file id="fileToUploadId" type="file" name="fileToUpload"/></td>
			</tr>
			<!-- ................................................... -->
				
			<!-- ...................... submit ..................... -->
			<tr>
				<td style="padding-left: 10px;width:140px;"/>
				<td align="left"><input type="submit" id="btUpload" value="Upload" style="margin:10px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
				<td align="left" colspan="3"><input type="submit" id="btMap" value="Get Mapping" style="margin:10px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
			</tr>
			<!-- ................................................... -->
							
			<!-- ...................... Line separator ............. -->
			<tr height="5px">
				<td colspan="4"/>
			</tr>					
		 </table>	
		 </td>
		 <!-- ................................. USER LOGO .......................... -->
		  <td  align="right" valign="top">
			  <s:if test="%{userId!=null}" >
			   <img alt="" src='<s:property value="%{userLogo}"/>'/>
			  </s:if>
		  </td>
		</tr>
		<tr height="45px">
			<td></td>
		</tr>
		
	</table>
 
     </s:form>
 <!-- ============================= FORM : OrdersFileMapper ===================== -->
 
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
  	<table  id="tabOrderFileMapper" border="0" cellspacing="0" cellpadding="0" class="nowraptable datatable"
  			style="font-size: 10pt;" >
		
		<tr height="20px" >
 			<td width="20px" rowspan="35"></td>
			<td></td>
		</tr>
		<tr height="40px">
			<td width="250px">Product Order Number:<font style="color:red;font-size: 12pt;"> * </font> </td>
			<td> <s:select 
					id="productOrderNumberId"
					name="ufrDTO.productOrderNumber"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
 					headerValue="%{ufrDTO.productOrderNumber}"
					cssStyle="width:210px;font-size: 10pt;"/></td>
		</tr>			
		<tr height="40px">
			<td>Client Order Number:</td>
			<td> <s:select 
					id="clientOrderNumberId"
					name="ufrDTO.clientOrderNumber"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientOrderNumber}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Customer Product Number:</td>
			<td> <s:select 
					id="cstProductNumberId"
					name="ufrDTO.cstProductNumber"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
  				    headerValue="%{ufrDTO.cstProductNumber}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Product Order Date:</td>
			<td> <s:select 
					id="productOrderDateId"
					name="ufrDTO.productOrderDate"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.productOrderDate}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Number:</td>
			<td> <s:select 
					id="clientNumberId"
					name="ufrDTO.clientNumber"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientNumber}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client First Name:</td>
			<td> <s:select 
					id="clientFirstNameId"
					name="ufrDTO.clientFirstName"
					list="columnNo"
					emptyOption="false"
 					headerKey=""
 					listKey="key"
					listValue="%{value}"
					headerValue="%{ufrDTO.clientFirstName}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Last Name:</td>
			<td> <s:select 
					id="clientLastNameId"
					name="ufrDTO.clientLastName"
					list="columnNo"
 					headerKey=""
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
					headerValue="%{ufrDTO.clientLastName}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Street:</td>
			<td> <s:select 
					id="clientStreetId"
					name="ufrDTO.clientStreet"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientStreet}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Other Street:</td>
			<td> <s:select 
					id="clientOtherStreetId"
					name="ufrDTO.clientOtherStreet"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.clientOtherStreet}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client City:</td>
			<td> <s:select 
					id="clientCityId"
					name="ufrDTO.clientCity"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientCity}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Postal Code:<font style="color:red;font-size: 15px;"> * </font></td>
			<td> <s:select 
					id="clientPostalCodeId"
					name="ufrDTO.clientPostalCode"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.clientPostalCode}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Province:<font style="color:red;font-size: 15px;"> * </font></td>
			<td> <s:select 
					id="clientProvinceId"
					name="ufrDTO.clientProvince"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.clientProvince}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Phone:</td>
			<td> <s:select 
					id="clientPhoneId"
					name="ufrDTO.clientPhone"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.clientPhone}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Email:</td>
			<td> <s:select 
					id="clientEmailId"
					name="ufrDTO.clientEmail"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientEmail}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Ls Product ID:<font style="color:red;font-size: 15px;"> * </font></td>
			<td> <s:select 
					id="lsProductIDId"
					name="ufrDTO.lsProductID"
					list="columnNo"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.lsProductID}"
 					listKey="key"
					listValue="%{value}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Product Description:</td>
			<td> <s:select 
					id="productDescriptionId"
					name="ufrDTO.productDescription"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.productDescription}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Unit Price:<font style="color:red;font-size: 15px;"> * </font></td>
			<td> <s:select 
					id="unitPriceId"
					name="ufrDTO.unitPrice"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.unitPrice}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Company Name:</td>
			<td> <s:select 
					id="companyHeaderId"
					name="ufrDTO.companyHeader"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.companyHeader}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Quantity:<font style="color:red;font-size: 15px;"> * </font></td>
			<td> <s:select 
					id="quantityId"
					name="ufrDTO.quantity"
					list="columnNo"
 					headerKey=""
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
					headerValue="%{ufrDTO.quantity}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Tag Root:</td>
			<td> <s:select 
					id="tagRootId"
 					headerKey=""
					name="ufrDTO.tagRoot"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
					headerValue="%{ufrDTO.tagRoot}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Shipping Company:</td>
			<td> <s:select 
					id="shippingCompanyId"
					name="ufrDTO.shippingCompany"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.shippingCompany}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Required Date:</td>
			<td> <s:select 
					id="requiredDateId"
					name="ufrDTO.requiredDate"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.requiredDate}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Other Names:</td>
			<td> <s:select 
					id="clientOtherNamesId"
					name="ufrDTO.clientOtherNames"
					list="columnNo"
 					headerKey=""
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
					headerValue="%{ufrDTO.clientOtherNames}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>Client Phone Zone:</td>
			<td> <s:select 
					id="clientPhoneZoneId"
					name="ufrDTO.clientPhoneZone"
					list="columnNo"
 					listKey="key"
					listValue="%{value}"
					emptyOption="false"
 					headerKey=""
					headerValue="%{ufrDTO.clientPhoneZone}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		
		<tr height="40px">
			<td>Format Date:</td>
			 <td> <s:select 
					id="formatDateId"
					name="ufrDTO.formatDate"
					headerKey="2"
					headerValue="%{ufrDTO.formatDate}"
 					listKey="value"					
					list="#{'1':'MM/dd/yyyy', '2':'MM/dd/yyyy H:mm', '3':'MM/dd/yyyy H:mm:ss', '4':'dd/MM/yyyy', '5':'dd/MM/yyyy H:mm','6':'dd/MM/yyyy H:mm:ss','7':'dd-MM-yyyy', '8':'dd-MM-yyyy H:mm', '9':'dd-MM-yyyy H:mm:ss', '10':'dd-MMM-yy', '11':'dd-MMM-yy H:mm', '12':'dd-MMM-yy H:mm:ss','13':'yyyyMMdd','14':'yyyy-MM-dd'}"
					value="%{ufrDTO.formatDate}"
					required="false"
					cssStyle="width:210px;font-size: 10pt;"/></td> 	
		</tr>
		
		<tr height="40px">
			<td>Notes:</td>
			<td> <s:select   
					id="notesId"
					name="ufrDTO.notes"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey="%{ufrDTO.notes}"
					headerValue="%{ufrDTO.notes}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Product Number:</td>
			<td> <s:select 
					id="clientProductNumberId"
					name="ufrDTO.clientProductNumber"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientProductNumber}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Client Other Id:</td>
			<td> <s:select 
					id="clientOtherIdId"
					name="ufrDTO.clientOtherId"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.clientOtherId}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>Provided Ls Product Id:</td>
			<td> <s:select 
					id="providedLsProductIdId"
					name="ufrDTO.providedLsProductId"
					list="columnNo"
					emptyOption="false"
 					listKey="key"
					listValue="%{value}"
 					headerKey=""
					headerValue="%{ufrDTO.providedLsProductId}"
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>

		<tr height="40px">
			<td>File Type Id Confirm:</td>
			<td> <s:select 
					id="fileTypeIdConfirmId"
					name="ufrDTO.fileTypeIdConfirm"
		      		headerKey="2"
		      		headerValue=""
       				list="#{'1':'XML', '2':'XLS', '3':'CSV'}"
       				value="%{ufrDTO.fileTypeIdConfirm}"		
       				required="false"		
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="40px">
			<td>File Format Id Confirm:</td>
			<td> <s:select 
					id="fileFormatIdComfirmId"
					name="ufrDTO.fileFormatIdComfirm"
		      		headerKey="2"
		      		headerValue=""
       				list="#{'1':'1', '2':'2', '3':'3', '4':'4', '5':'5','6':'6'}"
       				value="%{ufrDTO.fileFormatIdComfirm}"		
       				required="false"		
					cssStyle="width:210px;font-size: 10pt;"/></td>	
		</tr>
		<tr height="30px">
			<td colspan="2"></td>
		</tr>

		<tr height="50px">
			<td colspan="2" valign="middle" align="center"><input id="btSaveOrderMap" value="Save Order Map" type="button" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;" ></td>
		</tr>
	
		<tr height="30px">
			<td colspan="2"></td>
		</tr>
					
	</table>
	
	
   <!-- ...........................jsp fragment ................................. -->
	     <%@ include file="dialogues/confirmSaveUserMapPop.jsp" %>
	      <%@ include file="dialogues/saveSuccessPop.jsp" %>
	      <%@ include file="dialogues/notificationMissingFieldsPop.jsp" %>
	     
   <!-- ......................................................................... -->

</div>

<script type="text/javascript" charset="utf-8">
// Jquery Function main 
//function to get the file name of the file selected by the user using browse button	
$("#btUpload").click( function(){
	var uploadedFileName=$("#fileToUploadId").val();
	$("#frmUploadedFileName").val(uploadedFileName);
	$('#formOrdersFileMapper').trigger("submit");
});
	
$(document).ready(function() {
	
	$("#btMap").click( function(){
		$('#frmGetMappingClicked').val(1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMapConfirmed').val(-1);
		$('#frmSaveOrderMap').val(-1);
		$('#formOrdersFileMapper').trigger("submit");
	});

	//when Admin click on the button save order map 
	 $('#btSaveOrderMap').click( function(){
		fillUfrDTO();
		$('#frmGetMappingClicked').val(-1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMap').val(1);
		$('#frmSaveOrderMapConfirmed').val(-1);
		$('#formOrdersFileMapper').trigger("submit");
	});
	
	//when admin click on the button save of saving confirmation dialogue Box:confirmSaveUserMapPop 
	$('#confirmSaveUserMapPop #btSaveUserMapCFM').click( function(){
		fillUfrDTO();
		$('#frmGetMappingClicked').val(-1);
		$('#frmSaveOrderMap').val(1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMapConfirmed').val(1);	
		$('#formOrdersFileMapper').trigger("submit");
			 
	});
	//when admin click on the button cancel of saving confirmation dialogue Box:confirmSaveUserMapPop 
	$('#confirmSaveUserMapPop #btCancelCFM').click( function(){
		fillUfrDTO();
		$('#frmGetMappingClicked').val(-1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMap').val(-1);
		$('#formOrdersFileMapper').trigger("submit");	 	 
	});

	//when admin click on the button Save of saving confirmation dialogue Box:confirmSaveUserMapPop 
	$('#saveSuccessPop #btOK').click( function(){
		$('#frmGetMappingClicked').val(-1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMap').val(-1);
		$('#formOrdersFileMapper').trigger("submit");	 	 
	});
	//when admin click on Save Order Map button without filling in all the required fields.
	$('#notificationMissingFieldsPop #btOK').click( function(){
		fillUfrDTO();
		$('#frmGetMappingClicked').val(-1);
		$('#frmUploadClicked').val(-1);
		$('#frmSaveOrderMap').val(-1);
		$('#formOrdersFileMapper').trigger("submit");	 	 
	});
	function fillUfrDTO(){
		var frmProductOrderNumber = $('#productOrderNumberId').val();
		var frmClientOrderNumber = $('#clientOrderNumberId').val();
		var frmCstProductNumber = $('#cstProductNumberId').val();
		var	frmProductOrderDate = $('#productOrderDateId').val();
		var	frmClientNumber = $('#clientNumberId').val();
		var	frmClientFirstName = $('#clientFirstNameId').val();
		var	frmClientLastName = $('#clientLastNameId').val();
		var	frmClientStreet = $('#clientStreetId').val();
		var	frmClientOtherStreet = $('#clientOtherStreetId').val();
		var	frmClientCity = $('#clientCityId').val();
		var	frmClientPostalCode = $('#clientPostalCodeId').val();
		var	frmClientProvince = $('#clientProvinceId').val();
		var	frmClientPhone = $('#clientPhoneId').val();
		var frmClientEmail = $('#clientEmailId').val();
		var frmLsProductID = $('#lsProductIDId').val();
		var frmProductDescription = $('#productDescriptionId').val();
		var frmUnitPrice = $('#unitPriceId').val();
		var frmCompanyHeader = $('#companyHeaderId').val();
		var frmUserId = $('#userIdId').val();
		var frmFileTypeId = $('#fileTypeIdId').val();
		var frmQuantity = $('#quantityId').val();
		var frmTagRoot = $('#tagRootId').val();
		var frmShippingCompany = $('#shippingCompanyId').val();
		var frmRequiredDate = $('#requiredDateId').val();
		var frmClientOtherNames = $('#clientOtherNamesId').val();
		var frmClientPhoneZone = $('#clientPhoneZoneId').val();
		var frmFormatDate= $('#formatDateId').val();
		var frmNotes = $('#notesId').val();
		var frmClientProductNumber = $('#clientProductNumberId').val();
		var frmClientOtherId = $('#clientOtherIdId').val();
		var frmProvidedLsProductId = $('#providedLsProductIdId').val();
		var frmFileTypeIdConfirm = $('#fileTypeIdConfirmId').val();
		var frmFileFormatIdComfirm = $('#fileFormatIdComfirmId').val();
		
		$('#frmProductOrderNumber').val(frmProductOrderNumber);
		$('#frmClientOrderNumber').val(frmClientOrderNumber);
		$('#frmCstProductNumber').val(frmCstProductNumber);
		$('#frmProductOrderDate').val(frmProductOrderDate);
		$('#frmClientNumber').val(frmClientNumber);
		$('#frmClientFirstName').val(frmClientFirstName);
		$('#frmClientLastName').val(frmClientLastName);
		$('#frmClientStreet').val(frmClientStreet);
		$('#frmClientOtherStreet').val(frmClientOtherStreet);
		$('#frmClientCity').val(frmClientCity);
		$('#frmClientPostalCode').val(frmClientPostalCode);
		$('#frmClientProvince').val(frmClientProvince);
		$('#frmClientPhone').val(frmClientPhone);
		$('#frmClientEmail').val(frmClientEmail);
		$('#frmLsProductID').val(frmLsProductID);
		$('#frmProductDescription').val(frmProductDescription);
		$('#frmUnitPrice').val(frmUnitPrice);
		$('#frmCompanyHeader').val(frmCompanyHeader);
		$('#frmUserId').val(frmUserId);
		$('#frmFileTypeId').val(frmFileTypeId);
		$('#frmQuantity').val(frmQuantity);
		$('#frmTagRoot').val(frmTagRoot);
		$('#frmShippingCompany').val(frmShippingCompany);
		$('#frmRequiredDate').val(frmRequiredDate);
		$('#frmClientOtherNames').val(frmClientOtherNames);
		$('#frmClientPhoneZone').val(frmClientPhoneZone);
		$('#frmFormatDate').val(frmFormatDate);
		$('#frmNotes').val(frmNotes);
		$('#frmClientProductNumber').val(frmClientProductNumber);
		$('#frmClientOtherId').val(frmClientOtherId);
		$('#frmProvidedLsProductId').val(frmProvidedLsProductId);
		$('#frmFileTypeIdConfirm').val(frmFileTypeIdConfirm);
		$('#frmFileFormatIdComfirm').val(frmFileFormatIdComfirm);
	}
});
</script>
</s:if>



