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

</style>
<div class="unit" style="width: 800px; margin-left: 100px;">
 <div id="formContainer" style="height: auto;">
  <s:form id="form" action="addCurrency.do" method="post" enctype="multipart/form-data">
	<div class="pop_title" style="margin-top: 30px;">Add Currency</div><br />
	<!-- Currency -->
	
	<s:hidden id="successSignal" name="successSignal"/>
	<s:hidden id="message" name="message"/>
	<s:hidden id="showSaveSuccessPop" name="showSaveSuccessPop"/>

	<div style="width:350px;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
   			    border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
   		<table id="tabCurrency" width="350px"  border="0">
   			<!-- ...................... separator ..................... -->
			<tr height="20px" valign="middle">
				<td colspan="3"/>
			</tr>
			
			<!-- ...................... Currency Symbol ...... -->
			<!--
			<s:hidden id="currencySymbol" name="currencyDTO.symbol" />
			-->
			<tr height="30px" valign="middle">
				<td width="10px" />
				<td width="100px">Currency:</td>
				<td width="240px"><s:textfield id="currencySymbol" name="currencyDTO.symbol" maxlength="10" cssStyle="width:120px;" /></td>
			</tr>
			
			<!-- ...................... Currency Rate ............ -->
			<tr height="30px" valign="middle">
				<td />
				<td>Rate:</td>
				<td><s:textfield id="currencyRate" name="currencyDTO.rate" maxlength="10" cssStyle="width:120px;" /></td>
			</tr>

			<!-- ...................... submit ..................... -->
			<tr>
				<td colspan="2" />
				<td><input type="button" id="btCurrencySave" value="Save Currency" style="margin:30px 5px 0px 0px; padding:2px px;font-size:14px;"/></td>
			</tr>
											
			<!-- ...................... Line separator ............. -->
			<tr height="15px">
				<td colspan="2"/>
			</tr>
			<!-- .................................................... -->
   		</table>
   	</div>
	<!-- Currency -->
	<br />
  </s:form>
 
 <%@ include file="dialogues/confirmCurrencyRatePop.jsp" %>
 
 
 </div>
</div>



<script type="text/javascript" charset="utf-8">

$(document).ready(function() {
	
	// Global variables 
	
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
	
	/*----------------------------- When currencySymbol Losts focus ------------------------ 
		//Accept only numbers
	----------------------------------------------------------------------------------------*/
	$("#currencySymbol").blur( function(){
		var currSymbol = $("#currencySymbol").val();
		$("#currencySymbol").css("backgroundColor", "#FFFFFF");
		if(currSymbol.replace(/\s+/g, "") == "") {
			$("#currencySymbol").val("");
			$("#currencySymbol").css("backgroundColor", "#FF6666");
		}
	});
	
	/*----------------------------- When currencySymbol Gets focus ------------------------- 
		//
	----------------------------------------------------------------------------------------*/
	$("#currencySymbol").focus( function(){
		$("#currencySymbol").css("backgroundColor", "#FFFFFF");
	});
	
	/*-------------------------------------- Save Currency ---------------------------------
		When Admin click on save button
	----------------------------------------------------------------------------------------*/
	$("#btCurrencySave").click( function(){
		var valCurrRate     = $("#currencyRate").val();
		var currSymbol = $("#currencySymbol").val();
		if(currSymbol.replace(/\s+/g, "") == "" || !isNumber(valCurrRate) || parseFloat(valCurrRate)<=0) {
			var message = "The Rate can not be 0";
			if($("#currencyRate").val().replace(/\s+/g, "") == "") message = "Please Enter a valide Value for the Rate.";
			if(currSymbol.replace(/\s+/g, "") == "") message="Please Enter a Currency.";
			$("#confirmCurrencyRatePop").css('top',200);
			$('#confirmCurrencyRatePop #msgConfirmation').text(message);
			$('#confirmCurrencyRatePop').css("display","block"); 
			$('#confirmCurrencyRatePop').css("visibility","visible");
		} else {
			// put successSignal to 1 to execute SUCCESS Part 
			$("#successSignal").val(1);
			$('#form').trigger("submit");
		}
	});
	
	/*----------------------------- When clicking on "OK" button --------------------------- 
	 	//Hide the message box
	 ---------------------------------------------------------------------------------------*/
	$("#confirmCurrencyRatePop #btOK").click(function() {
		$('#confirmCurrencyRatePop').css("display","none"); 
		$('#confirmCurrencyRatePop').css("visibility","hidden");
		if($("#successSignal").val()!=null && $("#successSignal").val()!=0) {
			$("#successSignal").val(0);
			$('#form').trigger("submit");
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