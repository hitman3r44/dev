<%@ taglib prefix="s" uri="/struts-tags" %>

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

<!-- if user login -->
  
<s:if test="#isLogin"> 
	<div class="unit" style="width:800px;margin-left:100px;">
	<div class="pop_title" style="margin-top:30px;">My Profile</div>
	<div id="formContainer" style="height: 600px;">
	<br/> <br/>
	
	
	<!-- ================ Edit profile =============== -->
	<s:form action="homePage.do" method="post" validate="true" enctype="multipart/form-data">
	<input type="hidden" id="doUpadte" name="doUpadte" value="1"></input>
	
	
	<s:hidden id="userId" name="userDTO.id"/>
    <s:token></s:token>

	<table id="tabMyProfile">
		<!--Login-->
		<tr>
		<td width="125px">Login:</td>
		<td><s:textfield readonly="true" id="login" name="userDTO.login" maxlength="30" cssStyle="width:170px;"/>
        <span id="login_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Login-->
	 	
	 	<!--Code-->
		<tr>
		<td>Code:</td>
		<td> <s:textfield readonly="true"  id="code" name="userDTO.code" maxlength="30" cssStyle="width:170px;"/>
        <span id="code_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Code-->
	 	
	 	<!--Type-->
		<tr>
		<td>Type:</td>
		<td> <s:select id="type" disabled="true"
        		  name="userDTO.typeId"
        		  cssStyle="width:170px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{typeName}"			    		  
    			  list="%{@com.loyauty.web.WebConstants@ALL_USER_TYPE}" /> 
    	<span id="type_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Type-->
	 	
	 	<!--Password-->
		<tr>
		<td>Password:</td>
		<td><s:textfield id="password" name="userDTO.password" maxlength="30" cssStyle="width:170px;"/>
        <span id="password_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Password-->
	 	
	 	<!--Email-->
		<tr>
		<td>Email:</td>
		<td><s:textfield id="email" name="userDTO.email" maxlength="320" cssStyle="width:170px;"/>
        <span id="email_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Email-->
	 	
	 	<!--Real Name-->
		<tr>
		<td>Real Name:</td>
		<td><s:textfield id="realName" name="userDTO.realName" maxlength="50" cssStyle="width:170px;"/>
        <span id="realName_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Real Name-->
	 			 	
	 	<!--Address-->
		<tr>
		<td>Address:</td>
		<td><s:textfield id="address" name="userDTO.address" maxlength="120" cssStyle="width:170px;"/>
        <span id="address_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Address-->
	 	
	 	<!--Postal Code-->
		<tr>
		<td>Postal Code:</td>
		<td><s:textfield  id="postalCode" name="userDTO.postalCode" maxlength="10" cssStyle="width:170px;"/>
        <span id="postalCode_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Postal Code-->
	 	
	 	<!--Phone-->
		<tr>
		<td>Phone:</td>
		<td><s:textfield id="phone" name="userDTO.phone" maxlength="12" cssStyle="width:170px;"/>
        <span id="phone_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Phone-->
	 	
	 	<!--Primary language-->
		<tr>
		<td>Primary language:</td>
		<td><s:select id="primaryLanguage" 
        		  name="userDTO.primaryLanguage"
        		  cssStyle="width:170px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{getText(localizationKey)}"			    		  
    			  list="%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}" /> 
    	<span id="type_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Primary language-->

	 	<!--Secondary language-->
		<tr>
		<td>Secondary language:</td>
		<td><s:select id="secondaryLanguage" 
        		  name="userDTO.secondaryLanguage"
        		  cssStyle="width:170px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{getText(localizationKey)}"
    			  list="%{@com.loyauty.web.WebConstants@ALL_LANGUAGE}" />
    	<span id="type_Error" style="display:none;margin-left:2px;"></span></td>
		</tr>
	 	<!--Secondary language-->
	 	
	</table>

         <!-- button update profile -->
         <input id="btUpdateProfile" type="submit" value="Update My Profile" 
        	  	style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/>
         <!-- button update profile -->   
	</s:form>
	<!-- ================ Edit profile =============== --> 
	  
	   
	<!-- ================ dialog Box   =============== -->  
    <s:form action="homePage.do" method="post" validate="true" enctype="multipart/form-data">
	<input type="hidden" id="doUpadte" name="doUpadte" value="0"></input>
	<%@include file="./dialogsPop/resultPop.jsp" %>
	</s:form>
	<!-- ================ dialog Box   =============== -->  
	   
	   
	<!-- ================ Progress Bar =============== -->
	</div>
	<%@ include file="dialogsPop/progressBarPop.jsp" %>
	</div>
	<!-- ================ Progress Bar =============== -->
</s:if>
<!-- if user login out -->
<s:else>
	<div class="unit" style="width:800px;margin-left:100px;">
	<div class="pop_title" style="margin-top:30px;"></div>
	  <div id="formContainer" style="height: 600px;">
	  <br/><br/>
	</div>
	</div> 	
</s:else>



<script type="text/javascript">
/* <![CDATA[ */ 

var timerCounter=0;
var redirectId;
function horloge() {
	$("#progressBarPop").css("display","block"); 
	$("#progressBarPop").css("visibility","visible");
	timerCounter++;
	if(timerCounter<=100){
		timer = window.setTimeout("horloge()", 1000);
	}else{
		$("#progressBarPop").css("display","none");
		$("#progressBarPop").css("visibility","hidden");
		window.clearTimeout(timer);
		timerCounter=0;
	};
}           
             
             
$(function() {
	$('#tabMyProfile tr').attr("height","35px");
});
        
$(function() {
	redirectId=<%=(Long)request.getSession(true).getAttribute("redirect")%>;
	if(redirectId==-1){
		<%session.setAttribute("redirect",0L);%>
		window.location ="http://loyaltysource.com/homePage.htm";
	}
});

$(document).ready(function() {
	
	//When the user click on add product 
    $("#btUpdateProfile").click(function(){ 
    	horloge();
    });

	//when user press enter-> nothing 
	
	$("#tabMyProfile input").keydown(function(e){
	    if (e.keyCode == 13) { 
	        return false;
	    }
	});
	
});	

/*  ]]> */
</script>




