<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript"
	src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript">
	$("#topMenuRed").hide();
</script>


<style type="text/css">
label {
	width: 130px;
}

.vanadium-advice {
	margin-left: 170px;
}

input.vanadium-valid {
	background-image: none;
}

.tableLog_title{
	font-size: 14px;
	padding-bottom: 10px;
	text-decoration: underline;
}

td {
	-moz-user-select: none;
	-khtml-user-select: none;
	-webkit-user-select: none; 
	-ms-user-select: none;
	user-select: none;
}

.border_rigth_left{
	border-left: 1px solid #CCCCCC;
	border-right: 1px solid #CCCCCC;
}

.border_rigth{
	border-right: 1px solid #CCCCCC;
}

.border_left{
	border-left: 1px solid #CCCCCC;
}

</style>
<div class="unit" style="width: 800px; margin-left: 100px;">
 <div id="formContainer" style="height: auto;">
  <s:form id="form" action="editCurrency.do" method="post" enctype="multipart/form-data">
  
  	<s:hidden id="successSignal" name="successSignal"/>
	<s:hidden id="message" name="message"/>
	<s:hidden id="showSaveSuccessPop" name="showSaveSuccessPop"/>
	
	<div class="pop_title" style="margin-top: 30px;">Edit Currency</div><br />
	<!-- Currency -->
	<div style="width:350px;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
   			    border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
		<s:iterator value="currencyDTOList" status="count">
			<input	id='rate_<s:property value="id"/>'
					value="<s:property value="%{rate}"/>" 
					style="display: none; visibility: hidden;" />
			<s:date name="creationDate" var="creationDate" format="yyyy/MM/dd 'at' hh:mm a"/>
			<input	id='creationDate_<s:property value="id"/>'
					value="<s:property value="%{#creationDate}"/>" 
					style="display: none; visibility: hidden;" />
		</s:iterator>

		<table id="tabCoefficient" width="300px"  border="0">
			<!-- ...................... separator ..................... -->
			<tr height="20px" valign="middle">
				<td/>
			</tr>
			
			<!-- ...................... Currency Symbol ...... -->
			<tr height="30px" valign="middle">
				<td width="15px"/>
				<td width="130px">Currency:</td>
				<td><s:select	id="currency"
			     				name="currency"
			     				headerKey="0"
								list="currencyDTOList" 
								listKey="id"
								listValue="%{symbol}"
								cssStyle="width:145px;"/>
				</td>
			</tr>
			
			<!-- ...................... CurrencyId .............. -->
			<s:hidden id="currencyId" name="currencyDTO.id" />
			
			<!-- ...................... Currency Rate ............ -->
			<tr height="30px" valign="middle">
				<td />
				<td>Rate:</td>
				<td><s:textfield id="currencyRate" name="currencyDTO.rate" maxlength="10" cssStyle="width:143px;" />
			</tr>
			<!-- ...................... CurrencySymbol ........... -->
			<s:hidden id="currencySymbol" name="currencyDTO.symbol" />
			
			<!-- ...................... Currency Creation Date ........... -->
			<tr height="30px" valign="middle">
				<td />
				<td>Last Update:</td>
				<td><s:textfield  id="currencyCreationDate" name="currencyDTO.creationDate" maxlength="10" disabled="true" cssStyle="width:145px;background-color:#E8E8E8;border:0px;" /></td>
			</tr>
	
			<!-- ...................... submit ..................... -->
			<tr>
				<td colspan="2" />
				<td><input type="button" id="btCurrencySave" value="Save Currency Rate" style="margin:30px 0px 0px 0px; padding:2px 3px;font-size:13px;"/></td>
			</tr>
											
			<!-- ...................... Line separator ............. -->
			<tr height="15px">
				<td colspan="3"/>
			</tr>
			<!-- .................................................... -->
		</table>
		<br />
	</div>
	<!-- Currency -->
	<br />
   </s:form>
   
   <%@ include file="dialogues/confirmCurrencyRatePop.jsp" %>
   
 </div>
 
 <div class="pop_title" style="margin-top:30px;"></div>
 <!-- Control of logs -->
 <div class="tableLog_title"><a id="hrefShowLogs" href="">Show Currency History</a></div>
 <!-- Fields Titles  -->
 <div id="divLogsTitles" style="width:800px;">
  <table  id="tabLogsTitles" border="1" cellspacing="0" cellpadding="0"
		style="width:800px;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
	<thead style="background-color:rgb(240,240,240);">
		<tr>
			<th style="width:160px; padding: 0ps;height: 20px; border-left: 0px solid #CCCCCC; border: none;">OP. Date</th>
			<th width="100px" valign="middle" style="border: none;">OP. Type</th>
			<th valign="middle" width="200px" style="border: none;">Data Before</th>
			<th valign="middle" width="200px" style="border: none;">Data After</th>
			<th valign="middle" width="140px" style="border: none;">Full Name Admin</th>
		</tr>
	</thead>
  </table>
 </div>
 <!-- END Fields Titles  -->
 
 <!-- Fields Data  -->
 <div id="divLogs" style="width:800px;overflow: auto;max-height: 300px;display:none;visibility:hidden;">
  <table  id="tabLogs" border="0" cellspacing="0" cellpadding=""
		style="width:800px;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
	<tbody>
		<s:iterator value="opertionsDTOList" status="status">
			<tr height="25px" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
				<td width="160px" class="border_rigth middleTdDate">
					<s:date name="operationDate" var="operationDate" format="yyyy/MM/dd 'at' hh:mm a"/>
					<s:property value="%{#operationDate}" />
				</td>
				<td width="110px" class="border_rigth_left middleTdType" ><s:text name="operationType"></s:text></td>
				<td width="200px" class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataBefore"/></center></td>
				<td width="200px" class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataAfter"/></center></td>
				<td width="130px" class="border_rigth_left middleTdFullName"><s:text name="realNameUser"></s:text></td>
			</tr>
		</s:iterator>		
	</tbody>							
  </table>
 </div>
 <!-- End Fields Data  -->
 
 <br />
 <!-- Control of logs -->
</div>




<script type="text/javascript" charset="utf-8">

$(document).ready(function() {
	
	// Global variable 
	var currencyRateB4;
	
	// In the loadPage, get Currency Info of the default selected currencySymbol 
	getCurrencyDTOInfo();

	
	/*----------------------------- currency ----------------------------------------------- 
		get the selected CurrencyDTO info
	----------------------------------------------------------------------------------------*/
	$("#currency").change( function(){
		getCurrencyDTOInfo();
	});
	
	/*----------------------------- When currencyRate Losts focus -------------------------- 
		//Accept only numbers
	----------------------------------------------------------------------------------------*/
	$("#currencyRate").blur( function(){
		var currRate = $("#currencyRate").val();
		$("#currencyRate").css("backgroundColor", "#FFFFFF");
		if(!isNumber(currRate) || parseFloat(currRate)<=0) {
			$("#currencyRate").val(0);
			$("#currencyRate").css("backgroundColor", "#FF6666");
		} else {
			var valCurrRate = parseFloat(currRate).toFixed(3);
			$("#currencyRate").val(valCurrRate);
		}
	});
	
	/*----------------------------- When currencyRate Gets focus --------------------------- 
		//
	----------------------------------------------------------------------------------------*/
	$("#currencyRate").focus( function(){
		$("#currencyRate").css("backgroundColor", "#FFFFFF");
	});
		
	/*----------------------------- Save Currency ------------------------------------------
		When Admin click on save button
	----------------------------------------------------------------------------------------*/
	$("#btCurrencySave").click( function(){
		var currRate = $("#currencyRate").val();
		//Only for the first time if No currencies else CAD in DB 
		if($("#currencySymbol").val().replace(/\s+/g, "") == "") {
			var message="Please Go to the Menu: <Product>/<Currency>/<Add> to first add a new currency.";
			$("#confirmCurrencyRatePop").css('top',200);
			$('#confirmCurrencyRatePop #msgConfirmation').text(message);
			$('#confirmCurrencyRatePop').css("display","block"); 
			$('#confirmCurrencyRatePop').css("visibility","visible");
		} else {
			if(isNumber(currRate)) {
				var message="Please change the rate before saving.";
				var valCurrRate = parseFloat(currRate);
				if(valCurrRate==parseFloat(currencyRateB4) || valCurrRate<=0) {
					if(valCurrRate==0) message="The Rate can not be 0";
					$("#confirmCurrencyRatePop").css('top',200);
					$('#confirmCurrencyRatePop #msgConfirmation').text(message);
					$('#confirmCurrencyRatePop').css("display","block"); 
					$('#confirmCurrencyRatePop').css("visibility","visible");
				} else {
					// put successSignal to 1 to execute SUCCESS Part 
					$("#successSignal").val(1);
					$('#form').trigger("submit");
				}
			}
		}
	});
	
	/*----------------------------- function: getCurrencyDTOInfo --------------------------- 
		get the selected CurrencyDTO info
	----------------------------------------------------------------------------------------*/
	function getCurrencyDTOInfo() {
		var currencyIdVal = $("#currency").val();
		var currencySymbolVal = $("#currency option:selected").text();
		var currencyRateVal = $("input#rate_" + currencyIdVal).val();
		currencyRateB4 = currencyRateVal;
		var currencyCreationDateVal = $("input#creationDate_" + currencyIdVal).val();

		$("#currencyId").val(currencyIdVal);
		$("#currencyRate").val(currencyRateVal);
		$("#currencySymbol").val(currencySymbolVal);
		$("#currencyCreationDate").val(currencyCreationDateVal);
		$("#currencyRate").css("backgroundColor", "#FFFFFF");
	}
	
	/*----------------------------- When clicking on "OK" button --------------------------- 
		 
	 ---------------------------------------------------------------------------------------*/
	$("#confirmCurrencyRatePop #btOK").click(function() {
		$('#confirmCurrencyRatePop').css("display","none"); 
		$('#confirmCurrencyRatePop').css("visibility","hidden");
		if($("#successSignal").val()!=null && $("#successSignal").val()!=0) {
			$("#successSignal").val(0);
			$('#form').trigger("submit");
		}
	});
	
	// when user click on href show history logs 
	$("#hrefShowLogs").click(function () {
		$("#divLogs").toggle("slow");
		$('html, body').animate({scrollTop:$(document).height()}, 'slow');
		$("#divLogs").css("display","block"); 
		$("#divLogs").css("visibility","visible");

		return false;
	});
	
	/*----------------------------- function: isNumber ------------------------------------- 
			//return false if is not numeric
	----------------------------------------------------------------------------------------*/
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}
	
});

</script>