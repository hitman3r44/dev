<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript"
	src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript">
	$("#topMenuRed").hide();
</script>


<style type="text/css">
label {
	width: 170px;
}

.vanadium-advice {
	margin-left: 170px;
}

input.vanadium-valid {
	background-image: none;
}

</style>
<div class="unit" style="width: 800px; margin-left: 100px;">
	<div class="pop_title" style="margin-top: 30px;">Edit Template</div>

	<div id="formContainer" style="height: auto;">

		<s:if test="hasActionErrors()">
			<div id="globalAdvice" class="gray_bg global-vanadium-advice">
				<s:iterator value="actionErrors">
					<span><s:property escape="false" /> </span>
					<br />
				</s:iterator>
			</div>
		</s:if>
		<br /> <br />
  
	<!-- ............................. Search Classification ............................ -->
	<table id="tabLogin" width="300px" border="0">
		<!-- .................... Template .................... -->
		<tr height="60px"  style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
								  border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
			<td width="5px"/>
			<td width="70px">Template:</td>
			<td width="160px"><s:select id="templateId"
							name="clientCategoryId" cssStyle="width:160px;"
							list="listClientCategory" emptyOption="false" 
							listKey="clientCategoryId" listValue="clientCategoryName"/></td>
			<td style="padding-left:30px; height: 60px;cursor: pointer;"><img id="iconFindTemplate" src="images/find.png"/></td>	
		</tr>	
								
		<!-- ...................... Line separator ............. -->
		<tr height="10px">
			<td colspan="2"/>
		</tr>
		<!-- .................................................... -->						
	</table>

	<div style="width:300px;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
   			    border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
		<table id="tabCoefficient" width="300px"  border="0">
			<!-- ...................... separator ..................... -->
			<tr height="20px" valign="middle">
				<td/>
			</tr>
			
			<!-- ...................... Profit Brand Coefficient ...... -->
			<tr height="30px" valign="middle">
				<td width="5px"/>
				<td>Brand Coefficient:</td>
				<td><s:textfield id="brandCoefficientId" name="templateToEdit.brandCoefficient" maxlength="10" cssStyle="width:50px;"/></td>
			</tr>
			
			<!-- ...................... Profit Coefficient ............ -->
			<tr height="30px" valign="middle">
				<td width="5px"/>
				<td>Profit Coefficient:</td>
				<td><s:textfield id="profitCoefficientId" name="templateToEdit.profitCoefficient" maxlength="10" cssStyle="width:50px;" /></td>
			</tr>
			<!-- ...................... Product Coefficient ........... -->
			<tr height="30px" valign="middle">
				<td width="5px"/>
				<td width="178px">Product Unit Sold Coefficient:</td>
				<td><s:textfield  id="unitSoldCoefficientId" name="templateToEdit.unitSoldCoefficient" maxlength="10" disabled="true" cssStyle="width:53px;background-color:#E8E8E8;border:0px;" /></td>
			</tr>
	
			<!-- ...................... submit ..................... -->
			<tr>
				<td align="center" colspan="3"><input type="button" id="btSave" value="Save" style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/></td>
			</tr>
											
			<!-- ...................... Line separator ............. -->
			<tr height="15px">
				<td colspan="2"/>
			</tr>
			<!-- .................................................... -->
		</table>
	</div>
	<!-- FORM FOR SAVING TEMPLATE --> 
   <s:form id="form" action="editTemplate.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="frmTemplateId" name="templateId" value="-1" />
    	<s:hidden id="frmProfitCoefficient" name="templateToEdit.profitCoefficient" value="0" />
    	<s:hidden id="frmBrandCoefficient" name="templateToEdit.brandCoefficient" value="0" />
    	<s:hidden id="frmUnitSoldCoefficient" name="templateToEdit.unitSoldCoefficient" value="0" />
    	<s:hidden id="frmFindTemplateSignal" name="findTemplateSignal" value="0" />	
    	<s:hidden id="frmSaveTemplateSignal" name="saveTemplateSignal" value="0" />	  
   </s:form>
	<!-- FORM FOR SAVING TEMPLATE --> 	
		
	</div>
	<div class="pop_title" style="margin-top: 30px;"></div>
</div>


<script type="text/javascript" charset="utf-8">

// Jquery Function main 
var balance=0;
var rowSelected=-1;
var lastRowSelected=-1;

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
	

	/*----------------------------- Coefficients Validation  --------------------------------- 
								accept juste numbers format
	  ----------------------------------------------------------------------------------------*/
	$("#tabCoefficient #unitSoldCoefficientId,#profitCoefficientId,#brandCoefficientId").blur( function(){
		var unitSold;
		var profitCoefficient=$("#tabCoefficient #profitCoefficientId").val();
		var brandCoefficient=$("#tabCoefficient #brandCoefficientId").val();

		index=$("#tabCoefficient #profitCoefficientId").index(this);
		if(index>=0){
			//profitCoefficient=$("#tabCoefficient #profitCoefficientId").val();
			 $("#tabCoefficient #profitCoefficientId").css("backgroundColor","white");
			if (!isNumber(profitCoefficient) || profitCoefficient> 100 || profitCoefficient <0 ) {
				$("#tabCoefficient #profitCoefficientId").val("0");
				$("#tabCoefficient #profitCoefficientId").css("backgroundColor","#FF6666");
			}
		}
		index=$("#tabCoefficient #brandCoefficientId").index(this);
		if(index>=0){
			//brandCoefficient=$("#tabCoefficient #brandCoefficientId").val();
			 $("#tabCoefficient #brandCoefficientId").css("backgroundColor","white");
			if (!isNumber(brandCoefficient) || brandCoefficient> 100 || brandCoefficient <0 ) {
				$("#tabCoefficient #brandCoefficientId").val("0");
				$("#tabCoefficient #brandCoefficientId").css("backgroundColor","#FF6666");
			}
		}
		var index=$("#tabCoefficient #unitSoldCoefficientId").index(this);
		/*if(index>=0){
			unitSold=$("#tabCoefficient #unitSoldCoefficientId").val();
			 $("#tabCoefficient #unitSoldCoefficientId").css("backgroundColor","white");
			if (!isNumber(unitSold) || unitSold> 100 || unitSold <0 ) {
				$("#tabCoefficient #unitSoldCoefficientId").val("0");
				$("#tabCoefficient #unitSoldCoefficientId").css("backgroundColor","#FF6666");
			}
		}*/
		profitCoefficient=$("#tabCoefficient #profitCoefficientId").val();
		brandCoefficient=$("#tabCoefficient #brandCoefficientId").val();
		$("#tabCoefficient #unitSoldCoefficientId").val(100-brandCoefficient-profitCoefficient);
		unitSold=$("#tabCoefficient #unitSoldCoefficientId").val();
		 $("#tabCoefficient #unitSoldCoefficientId").css("backgroundColor","#E8E8E8");
		if (!isNumber(unitSold) || unitSold <0 ) {
			$("#tabCoefficient #unitSoldCoefficientId").css("backgroundColor","#FF6666");
		}
		
	});

	
	/*-------------------------------------- Find Template informations  ------------------------
									 	When Admin drop down the Template comboList
	  -------------------------------------------------------------------------------------------*/
	$("#tabLogin #templateId").change(function(){
		var templateId=$("#templateId").val();
		$("#frmTemplateId").val(templateId);
		$("#frmFindTemplateSignal").val(1);
		$('#form').trigger("submit");
	});
	
	$("#tabLogin #iconFindTemplate").click( function(){
		var templateId=$("#templateId").val();
		$("#frmTemplateId").val(templateId);
		$("#frmFindTemplateSignal").val(1);
		$('#form').trigger("submit");
	});
	
	/*-------------------------------------- Save Template --------------------------------------
									 When Admin click on save button
	  -------------------------------------------------------------------------------------------*/
	$("#btSave").click( function(){
		var templateId=$("#templateId").val();
		var profitCoefficient=$("#tabCoefficient #profitCoefficientId").val();
		var brandCoefficient=$("#tabCoefficient #brandCoefficientId").val();
		//clean profitCoefficient 
		profitCoefficient=profitCoefficient.replace(/^\s\s*/, '');    
		profitCoefficient=profitCoefficient.replace(/\s\s*$/, '');   
		profitCoefficient=profitCoefficient.replace(/([\s]+)/g, '-'); 
		//clean brandCoefficient 
		brandCoefficient=brandCoefficient.replace(/^\s\s*/, '');    
		brandCoefficient=brandCoefficient.replace(/\s\s*$/, '');   
		brandCoefficient=brandCoefficient.replace(/([\s]+)/g, '-'); 	
		var unitSoldCoefficient=100-profitCoefficient-brandCoefficient;
		//If coefficients are not good do nothing 
		if(!isNumber(profitCoefficient)|| !isNumber(brandCoefficient)||!isNumber(unitSoldCoefficient)||
			profitCoefficient<0 || profitCoefficient>100 || brandCoefficient<0 || brandCoefficient>100 ||
			unitSoldCoefficient<0 || unitSoldCoefficient>100 || unitSoldCoefficient<0){
			return false; 
		}	
		$("#frmTemplateId").val(templateId);
		$("#frmProfitCoefficient").val(profitCoefficient);
		$("#frmBrandCoefficient").val(brandCoefficient);
		$("#frmUnitSoldCoefficient").val(unitSoldCoefficient);
		$("#frmSaveTemplateSignal").val(1);
		$('#form').trigger("submit");
	});

	
	/*----------------------------- Test value is numeric  ----------------------------------- 
								return false if is not numeric
	  ----------------------------------------------------------------------------------------*/
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}
	
});

</script>
