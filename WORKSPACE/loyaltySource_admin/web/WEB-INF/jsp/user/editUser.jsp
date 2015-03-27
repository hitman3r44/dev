<%@ taglib uri="/struts-tags" prefix="s" %>
<link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script>

<script type="text/javascript" src="scripts/jquery-ui.min.js"></script>

<style type="text/css">
label {
	width:200px;
}
.vanadium-advice {
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}
.ui-datepicker-header { background: url('./images/backgroundHeaderDate.png') repeat 0 0 #000;color:white;} 

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


.middleTdDate{
	height: 25px;
	width:140px;
}


.middleTdFullName{
	height: 25px;
	padding: 5px;
}


.middleTdType{
	height: 25px;
	width:90px;
	padding: 5px;
}
.middleTdData{
	width:190px;
	padding: 5px;
}

.smallTd{
	height: 25px;
	padding: 5px;
}

.tableLog_title{
	font-size: 14px;
	padding-bottom: 10px;
	text-decoration: underline;
}

.tagCenterData{
	overflow: auto;
	max-height:100px;
	max-width:180px;
	width: 100%;
	vertical-align: middle;
	text-align: left;
	padding: 5px;

}
</style>
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Edit a User ###########</div>
<s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>  
</s:if>
  <div id="formContainer" >
    <s:form id="form" action="updateUser.do" method="post" validate="true" enctype="multipart/form-data">
    <s:hidden name="userId" value="%{userId}" />
    <s:token></s:token>
      <fieldset>
        <!--Login-->
        <label for="accept_team_members">Login:</label>        
        <s:textfield id="login" name="login" maxlength="30" cssStyle="width:150px;"/>
        <span id="login_Error" style="display:none;margin-left:2px;"></span>
        <!--Login-->
        <br />
        <!--Code-->
        <label for="accept_team_members">Code:</label>        
        <s:textfield id="code" name="code" maxlength="30" cssStyle="width:150px;"/>
        <span id="code_Error" style="display:none;margin-left:2px;"></span>
        <!--Code-->
        <br />
        <!--Type-->
        <label for="username">Type:</label>
 		<s:select id="type" 
        		  name="type"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{typeName}"			    		  
    			  list="%{@com.loyauty.web.WebConstants@ALL_USER_TYPE}" /> 
    	<span id="type_Error" style="display:none;margin-left:2px;"></span>
        <!--Type-->
        <br />
        <!--Password-->
        <label for="accept_team_members">Password:</label>        
        <s:textfield id="password" name="password" maxlength="30" cssStyle="width:150px;"/>
        <span id="password_Error" style="display:none;margin-left:2px;"></span>
        <!--Password-->
        <br />
        <!--Email-->
        <label for="accept_team_members">Email:</label>        
        <s:textfield id="email" name="email" maxlength="320" cssStyle="width:150px;"/>
        <span id="email_Error" style="display:none;margin-left:2px;"></span>
        <!--Email-->
        <br />
        <!--Active-->
        <label for="accept_team_members">Active:</label>
        <s:if test="%{active == true}" >
       		<s:checkbox label="checkbox test" name="active" checked="checked" value="aBoolean" fieldValue="true"/>
        </s:if>
        <s:else>
       		<s:checkbox label="checkbox test" name="active" value="aBoolean" fieldValue="true"/>
        </s:else>
        <span id="active_Error" style="display:none;margin-left:2px;"></span>
        <!--Active-->
        <br />
        <!--Real Name-->
        <label for="accept_team_members">Real Name:</label>        
        <s:textfield id="realName" name="realName" maxlength="50" cssStyle="width:150px;"/>
        <span id="realName_Error" style="display:none;margin-left:2px;"></span>
        <!--Real Name-->
        <br />
        <!--Address-->
        <label for="accept_team_members">Address:</label>        
        <s:textfield id="address" name="address" maxlength="120" cssStyle="width:150px;"/>
        <span id="address_Error" style="display:none;margin-left:2px;"></span>
        <!--Address-->
        <br />
        <!--Postal Code-->
        <label for="accept_team_members">Postal Code:</label>        
        <s:textfield id="postalCode" name="postalCode" maxlength="10" cssStyle="width:150px;"/>
        <span id="postalCode_Error" style="display:none;margin-left:2px;"></span>
        <!--Postal Code-->
        <br />
        <!--Phone-->
        <label for="accept_team_members">Phone:</label>        
        <s:textfield id="phone" name="phone" maxlength="12" cssStyle="width:150px;"/>
        <span id="phone_Error" style="display:none;margin-left:2px;"></span>
        <!--Phone-->
        <br />
        <!--Primary language-->
        <label for="username">Primary language:</label>
 		<s:select id="primaryLanguage" 
        		  name="primaryLanguage"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{getText(localizationKey)}"			    		  
    			  list="%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}" /> 
    	<span id="type_Error" style="display:none;margin-left:2px;"></span>
        <!--Primary language-->
        <br />
        <!--Secondary language-->
        <label for="username">Secondary language:</label>
 		<s:select id="secondaryLanguage" 
        		  name="secondaryLanguage"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{getText(localizationKey)}"
    			  list="%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}" />
    	<span id="type_Error" style="display:none;margin-left:2px;"></span>
    	<br />
        <!--Secondary language-->
        
        <!--Type-->
        <label for="userType">Client category:</label>
		<s:hidden id="clientCategoryIdCopy" name="clientCategoryIdCopy" value="%{clientCategoryIdCopy}"/>
		<s:hidden id="tempSignal" name="tempSignal" value="%{tempSignal}"/>
		<s:select
	        id="listClientCategory"
	        name="clientCategoryId"
	        cssStyle="width:156px;"
	        list="listClientCategory"
	        emptyOption="false"
	        headerKey="-1"
	        listKey="clientCategoryId"
	        listValue="clientCategoryName"
	        headerValue="--Select--"/>	
		<br/>
        <!--Type-->
        
        <!--updateDate-->
        <label for="updateDate">Update date:</label>
        <s:date id="updateDateId" name="updateDate" var="updateDate" format="dd/MM/yyyy"/>
		<s:textfield id="datepicker" name="strUpdateDate" value="%{#updateDate}" key="labelkey" readonly="true" cssStyle="width:150px;" />
		<!--updateDate-->
		
		<!--Today-->
		<input id="btToday" type="button" value="Today" style="margin:0px 0px 0px 0px;padding:0px 0px;font-size:12px;"/>
        <br />
		<!--Today-->

        <!--Shipping Multiplier Factor-->
        <label for="accept_team_members">Shipping Multiplier:</label>
        <s:textfield id="multiplier" name="multiplier" maxlength="50" cssStyle="width:150px;"/> %
        <span id="multiplier_Error" style="display:none;margin-left:2px;"></span>
        <!--Shipping Multiplier Factor-->
        <br />
        
        <!--Shipping Insurance Multiplier-->
        <label for="accept_team_members">Shipping Insurance Multiplier:</label>
        <s:textfield id="shippingInsuranceMultiplier" name="shippingInsuranceMultiplier" maxlength="50" cssStyle="width:150px;"/> %
        <span id="shippingInsuranceMultiplier_Error" style="display:none;margin-left:2px;"></span>
        <!--Shipping Insurance Multiplier-->
        <br />
        
        <!--Special Handling Name-->
        <label for="accept_team_members">Special Handling Name:</label>        
        <s:textfield id="specialHandlingName" name="specialHandlingName" maxlength="50" cssStyle="width:150px;"/>
        <span id="specialHandlingName_Error" style="display:none;margin-left:2px;"></span>
        <!--Special Handling Name-->
        <br />
        
        <!--Special Handling Fee-->
        <label for="accept_team_members">Special Handling Fee:</label>        
        <s:textfield id="specialHandlingFeeId" name="specialHandlingFee" maxlength="10" cssStyle="width:150px;"/>
        <span id="specialHandlingFee_Error" style="display:none;margin-left:2px;"></span>
        <!--Special Handling Fee-->
        <br />
        
        <!--Currency-->
		<label for="accept_team_members">Currency:</label>
     	<!--
     	<s:select	id="currencyId"
     				name="currencyId"
     				headerKey="0"
					list="currencyDTOList" 
					listKey="currencyId"
					listValue="%{currencySymbol}"
					cssStyle="width:156px;"/>
		<s:hidden id="currencySymbol" name="currencySymbol" />
		<s:hidden id="currencyIndex" name="currencyIndex" />
		-->
		<s:select	id="currency"
     				name="currency"
     				headerKey="%{currencyIndex}"
     				headerValue="%{currencyValue}"
					list="currencyDTOList" 
					listKey="id"
					listValue="%{symbol}"
					cssStyle="width:156px;"/>
		<s:hidden id="currencyId" name="currencyDTO.id" />
		<s:hidden id="currencySymbol" name="currencyDTO.symbol" /> 
		<s:hidden id="currencyIndex" name="currencyIndex" />
        <!--Currency-->
        <br />
 
		<!-- Note -->
        <label for="accept_team_members">Note:</label>
        <s:textarea id="note" name="note" value="%{note}" cssStyle="width:150px; height:60px;" />
         <br /><br />
		<!-- Note -->
 
		<!--table Province-->       
		<table id="tabProvince" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable">
		<thead class="gray_header">
			<tr>
				<th width="190px"><s:text name="Province" /></th>
				<th width="123px"><s:text name="Population [%]" /></th>
				<th style="background: white;border-left:1px solid #555;border-top:1px solid white;
					border-right:1px solid white;border-bottom:1px solid white;">
				    <img  id="showRows" src="./images/showRowsMouseOut.png" width="40" height="20" /></th>
			</tr>
		</thead>
		<s:if test="%{provinceNameList != null}">
			<s:if test="%{provinceNameList.size > 0}" >
				<tbody>
					<s:iterator value="provinceNameList" status="count">
						<tr id="rowTabProvince">
							<td><s:property value="%{provinceName[#count.index]}"/></td>
							<td><input 	id="populationPercentage_<s:property value="id"/>"
										style="text-align: center; width: 80px;" 
										value="<s:property value="%{populationPercentage[#count.index]}"/>"
										name="populationPercentage"/></td>
							
							<td id="columnForHedden" style="background: white;border-left:1px solid #555;border-top:1px solid white;
									border-right:1px solid white;border-bottom:1px solid white;"></td>
							
							
						</tr>
					</s:iterator>
				</tbody>
			</s:if>
		</s:if>	            								
		</table>      
		<!--table Province-->   
        
        <br />
        
        <s:if test='%{#session.usr == "menu"}' > 
        	<input id="btUpdateUser" type="submit" value="Update User" 
        	   	   style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/>
		</s:if>        	   
        	   
      </fieldset>
    </s:form>
     <%@ include file="dialogues/progressBar.jsp" %>
  </div>
  <div class="pop_title" style="margin-top:30px;"></div>
     
<!-- Control of logs -->
		<div class="tableLog_title"><a id="hrefShowLogs" href="">Show History on this user</a></div>
		<!-- Fields Titles  -->
		<div id="divLogsTitles" style="width:800px;">
		<table  id="tabLogsTitles" border="1" cellspacing="0" cellpadding="0"
				style="width:100%;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
		 	<thead style="background-color:rgb(240,240,240);">
				<tr>
					<th style="width:140px; padding: 0ps;height: 20px;">OP. Date</th>
					<th width="100px" valign="middle">OP. Type</th>
					<th valign="middle" width="200px">Data Before</th>
					<th valign="middle" width="200px">Data After</th>
					<th valign="middle">Full Name Admin </th>
					
				</tr>
			</thead>
			</table>
		</div>
		<!-- END Fields Titles  -->
		<!-- Fields Data  -->
		<div id="divLogs" style="width:800px;overflow: auto;max-height: 300px;display:none;visibility:hidden;">
		<table  id="tabLogs" border="0" cellspacing="0" cellpadding=""
				style="width:100%;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
		 	
			<tbody>
			  <s:iterator value="opertionsDTOList" status="status">
				  <tr style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
						<td class="border_rigth middleTdDate">
						    <s:date name="operationDate" var="operationDate" format="yyyy/MM/dd 'at' hh:mm a"/>
						    <s:property value="%{#operationDate}" /></td>
						<td class="border_rigth_left middleTdType" ><s:text name="operationType"></s:text></td>
						<td class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataBefore"/></center></td>
						<td class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataAfter"/></center></td>
						<td class="border_rigth_left middleTdFullName"><s:text name="realNameUser"></s:text></td>
						
				  </tr>
	     	  </s:iterator>		
			</tbody>							
		</table>
		</div>
		<!-- End Fields Data  -->
		<br/>
   <!--  Control of logs  -->
   
</div>

 
 <script type="text/javascript">
  /* <![CDATA[ */
  var showRows=0;
  var isRowsHidden=1;
  var arrayProvince = new Array(); 
  var timerCounter=0; 
  var logsHidden=0;
  
  $(function() {
  	$('#tabProvince #rowTabProvince').each(function() {
  		arrayProvince.push($(this).val());
  	});
  	
  	for(i=0;i<arrayProvince.length;i++){
  		$('#tabProvince #rowTabProvince').eq(i).hide();
  		};
  });

 /*
  $(function() {
	  var createdDate=$('#createdDate').val();
	  var lastUpdateDate=$('#lastUpdateDate').val();
	  var managerRealName=$('#managerRealName').val();
	  createdDate=createdDate.split(' ').join('');
	  lastUpdateDate=lastUpdateDate.split(' ').join('');
	  infoManager1="["+createdDate+"]"+" Creation of this user";
	  infoManager2="["+createdDate +"]"+" Created by: "+managerRealName;
	  infoManager3="["+lastUpdateDate+"]"+" updated by: "+managerRealName;
	  if(managerRealName==null || managerRealName==""){
		   $("#infoManger").text(infoManager1);
		   return false;
		}
	  if(lastUpdateDate==null || lastUpdateDate==""){
		   $("#infoManger").text(infoManager2);
		   return false;
		}
    $("#infoManger").text(infoManager1+"  -  "+infoManager3);

  });
 */
//Method horloge:it's specially for progressBar

function horloge() {
	$("#progressBar").css("display","block"); 
	$("#progressBar").css("visibility","visible");
	
	//create a timer
	timerCounter++;
	if(timerCounter<=100){
		timer = window.setTimeout("horloge()", 1000);
	}else{
		$("#progressBar").css("display","none");
		$("#progressBar").css("visibility","hidden");
		window.clearTimeout(timer);
		timerCounter=0;
	};
}

  var requiredMessage = '<s:text name="loyauty.error.common.required" />';
  var vanadiumAdv = "vanadium-advice -vanadium-empty-advice- vanadium-invalid";
  var VanadiumRules = {
		login: [
  			'only_on_blur',
  			['advice','login_Error'],
  			{validator:'required', invalidCustomMessage: requiredMessage}
  		],
  		code: [
  			'only_on_blur',
  			['advice','code_Error'],
  			{validator:'required', invalidCustomMessage: requiredMessage}
  		],
  		password: [
  			'only_on_blur',
  			['advice','password_Error'],
  			{validator:'required', invalidCustomMessage: requiredMessage}
  		],
  		email: [
 			'only_on_blur',
 			['advice','email_Error'],
 			{validator:'email', invalidCustomMessage: requiredMessage}
  		],
  		realName: [
  			'only_on_blur',
  			['advice','realName_Error'],
  			{validator:'required', invalidCustomMessage: requiredMessage}
  		],
  		address: [
			'only_on_blur',
			['advice','address_Error'],
			{validator:'required', invalidCustomMessage: requiredMessage}
  		],  
  		postalCode: [
  				'only_on_blur',
  				['advice','postalCode_Error'],
  				{validator:'required', invalidCustomMessage: requiredMessage}
  	  	],
  	  	phone: [
  				'only_on_blur',
  				['advice','phone_Error'],
  				{validator:'required', invalidCustomMessage: requiredMessage}
  	  	],
  	  	multiplier: [
  				'only_on_blur',
  				['advice','multiplier_Error'],
  				{validator:'required', invalidCustomMessage: requiredMessage}
  	  	],
  		formContainer: 'container'
  	};

  $(function() {
	    $("#datepicker").datepicker({
	    	dateFormat: 'dd/mm/yy',
            changeMonth: true,
            changeYear: true
        });
	  });

  $(function() {
	  tempSignal=$("#tempSignal").val();
	  tempSignal=tempSignal.split(' ').join('');  
	  if(tempSignal==1){
		$("#listClientCategory").attr("disabled",true);
	  }else{
		$("#listClientCategory").attr("disabled",false);
	  }
	 
	  });
  

  $(document).ready(function() {
	  
	  // Set the index of Currency to the currencyIndex got from db  
	  var index = $("#currencyIndex").val();
	  $("select#currency").attr('selectedIndex', index);
	  // get the "currencySymbol" in the beggining
	  getCurrencyDTOInfo();
	  /*
	  var currencyIdVal = $("#currencyId").val();
	  var currencySymbolVal = $("#currencyId option:selected").text();
	  $("#currencySymbol").val(currencySymbolVal);
	  */
	  
	  //Treatment of showing or hide rows of provice Table
	  $('#tabProvince img[id="showRows"]').click(function(e){  
		if(showRows==1){
		  	for(i=0;i<arrayProvince.length;i++){
		  		$('#tabProvince #rowTabProvince').eq(i).hide();
		  		};
			isRowsHidden=1;
			showRows=0;
			$('#tabProvince img[id="showRows"]').attr("src","./images/showRowsMouseOut.png");
		}else{
		  	for(i=0;i<arrayProvince.length;i++){
		  		$('#tabProvince #rowTabProvince').eq(i).show();
		  		};
			showRows=1;
			isRowsHidden=0;
			$('#tabProvince img[id="showRows"]').attr("src","./images/hideRowsMouseOut.png");
		}
	}); 

	$('#tabProvince img[id="showRows"]').mouseover(function(e){
		if(isRowsHidden==1){
			$('#tabProvince img[id="showRows"]').attr("src","./images/showRowsMouseOver.png");
		}else{
			$('#tabProvince img[id="showRows"]').attr("src","./images/hideRowsMouseOver.png");
		}
		
	});
	
	$('#tabProvince img[id="showRows"]').mouseout(function(e){
		if(isRowsHidden==1){
			$('#tabProvince img[id="showRows"]').attr("src","./images/showRowsMouseOut.png");
		}else{
			$('#tabProvince img[id="showRows"]').attr("src","./images/hideRowsMouseOut.png");
		}
	});
	

	// progressBar
	$("#btUpdateUser").click(function(){  
		$('html,body').scrollTop(0);
		horloge();
			
	});

	// btToday
	$("#btToday").click(function(){  
		today=new Date();
		$("#datepicker").datepicker("setDate",today);    
	});
	
	// when user click on href show history logs
	$("#hrefShowLogs").click(function () {
		$("#divLogs").toggle("slow");
		$('html, body').animate({scrollTop:$(document).height()}, 'slow');
		$("#divLogs").css("display","block"); 
		$("#divLogs").css("visibility","visible");

		return false;
	});

	/*----------------------------- SpecialHandlingFee Validation  --------------------------------- 
	  accept juste numbers format
	----------------------------------------------------------------------------------------*/
	$("#formContainer #specialHandlingFeeId").blur( function(){
		var index=$("#formContainer #specialHandlingFeeId").index(this);
		var specialHandlingFee;
		if(index>=0) {
			specialHandlingFee=$("#formContainer #specialHandlingFeeId").val() ;
			var value = parseFloat(specialHandlingFee).toFixed(2);
			$("#formContainer #specialHandlingFeeId").css("backgroundColor", "white");
			if(!isNumber(specialHandlingFee)) {
				$("#formContainer #specialHandlingFeeId").val(0);
				$("#formContainer #specialHandlingFeeId").css("backgroundColor", "#FF6666");
			}
		}
	}); 

	/*----------------------------- shippingInsuranceMultiplier Validation  ---------------- 
		  accept juste numbers format
	----------------------------------------------------------------------------------------*/
	$("#shippingInsuranceMultiplier").blur( function(){
		var shippingInsuranceMultiplier = $("#shippingInsuranceMultiplier").val();
		if(shippingInsuranceMultiplier.replace(/\s/g,"")!="") {
			if(isNumber(shippingInsuranceMultiplier)) {
				var value = parseFloat(shippingInsuranceMultiplier).toFixed(2);
				if(value >= 0) {
					$("#shippingInsuranceMultiplier").css("backgroundColor", "#FFFFFF");
				} else {
					$("#shippingInsuranceMultiplier").css("backgroundColor", "#FF6666");
					$("#shippingInsuranceMultiplier").val("");
				}
			} else {
				$("#shippingInsuranceMultiplier").val("");
				$("#shippingInsuranceMultiplier").css("backgroundColor", "#FF6666");
			}
		}
	}); 
	
	/*----------------------------- currency ----------------------------------------------- 
		get the selected Currency Symbol
	----------------------------------------------------------------------------------------*/
	$("#currency").change( function(){	
		getCurrencyDTOInfo();
	});
	
	/*----------------------------- function: getCurrencyDTOInfo --------------------------- 
		get the selected CurrencyDTO info
	----------------------------------------------------------------------------------------*/
	function getCurrencyDTOInfo() {
		var currencyIdVal = $("#currency").val();
		var currencySymbolVal = $("#currency option:selected").text();
		$("#currencyId").val(currencyIdVal);
		$("#currencySymbol").val(currencySymbolVal);
	}
	
	/*----------------------------- Test value is numeric  ----------------------------------- 
		return false if is not numeric
	----------------------------------------------------------------------------------------*/
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}

});

/*  ]]> */
</script>
 