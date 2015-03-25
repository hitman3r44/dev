 <%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label {
	width:170px;
}
.vanadium-advice {
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}
</style>
<div class="unit" style="width:800px;margin-left:80px;">
<div class="pop_title" style="font-size:24px;font-weight:bold;margin-top:30px;text-align:center;">New Account Request</div>
<div style="background-color:#f3f3f3;text-align:center;margin-top:10px; margin-left: 5px; margin-right:5px">
  <p>The new account form is mandatory. Loyalty Source needs to evaluate your company's potential and allocate the appropriate resources. Please fill out each field to the best of your knowledge.</p>
</div>
<s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>  
</s:if>
<div class="pop_title" style="margin-top:30px;"></div>
<div id="formContainer">

<s:form id="formNewAccountRequest" action="customerSignUp.do" method="post" validate="true" enctype="multipart/form-data">
	<s:hidden id="frmCompanyName" name="companyName" />
	<s:hidden id="frmProgramName" name="programName" />
	<s:hidden id="frmProgramUrl" name="programUrl"/>
	<s:hidden id="frmProgramType" name="programType"/>
	<s:hidden id="frmProgramTypeOther" name="programTypeOther"/>
	<s:hidden id="frmYearsActive" name="yearsActive" />
	<s:hidden id="frmNumberOfMembers" name="numberOfMembers" />
	<s:hidden id="frmAverageMonthlyRedemption" name="averageMonthlyRedemption" />
	<s:hidden id="frmAverageRedemptionPrice" name="averageRedemptionPrice"/>
	<s:hidden id="frmMonthlyTotal" name="monthlyTotal"/>
	<s:hidden id="frmBriefProgramDescription" name="briefProgramDescription"/>
	<s:hidden id="frmBrandsInterestedIn" name="brandsInterestedIn" />
	<s:hidden id="frmContact" name="contact"/>
	<s:hidden id="frmPhone" name="phone" />
	<s:hidden id="frmExt" name="ext" />
	<s:hidden id="frmJobTitle" name="jobTitle" />
	<s:hidden id="frmEmail" name="email" />
	<s:hidden id="frmFullAddress" name="fullAddress" />
	<s:hidden id="frmSendNewAccountRequest" name="sendNewAccountRequest" value="-1"/>
</s:form>

	<!-- ...................... Company Name ............. -->
	<table border="1"  width="800" align="left" >
		<!-- ............................. New Account Request ............................ -->
		<tr>
			<td width="640px" valign="middle" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
			<table border="0" id="tabLogin" width="800px" height="10px" >
			<!-- ...................... Line separator ............. -->
				<tr height="10px">
					<td colspan="6"/>
				</tr>
				<!-- ...................... Company Name............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Company Name:</td>
					<td>
						<s:textfield id="companyNameId"  cssStyle="color:black;width:250px;" name="companyName"/>
					</td>
				</tr>
				<!-- ...................... Program Name............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Program Name:</td>
					<td>
						<s:textfield id="programNameId"  cssStyle="color:black;width: 250px;" name="programName"/>
					</td>
				</tr>
				<!-- ...................... Program URL............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Program URL:</td>
					<td>
						<s:textfield id="programUrlId"  cssStyle="color:black;width: 250px;" name="programUrl"/>
					</td>
				</tr>
				<!-- ...................... Program Type............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Program Type:</td>
					<td>
						<s:select 
								id="programTypeId"
								label="---Select---"
		      				  name="programType"
		      				  headerKey=""
		      				  headerValue="---Select---"
			 				  listKey="value"					
	       					  list="#{'1':'Rewards','2':'Employee','3':'Contest','4':'Other'}"
	       					  value="%{programType}"
	      					  required="false"  cssStyle="width: 250px;"/>
	      			</td>
					<td valign="middle" style="padding-left:10px;width:100px;"> Specify if Other:</td>
					<td colspan="3">
						<s:textfield id="programTypeOtherId"  cssStyle="color:black;width: 200px;" name="programTypeOther"/>
					</td>
				</tr>
				<!-- ...................... Years Active............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Years Active:</td>
					<td>
						<s:select
							  id="yearsActiveId"
							  label="---Select---"
		      				  name="yearsActive"
		      				  headerKey=""
		      				  headerValue="---Select---"
			 				  listKey="value"					
	       					  list="#{'1':'1','2':'2','3':'3','4':'4','5':'5 or More','6':'New','7':'In Developement'}"
	       					  value="%{yearsActive}"
	      					  required="false"  cssStyle="width: 250px;"/>
	      			</td>
				</tr>
				<!-- ...................... Number of Members............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Number of Members:</td>
					<td>
						<s:select 
							  id="numberOfMembersId"
							  label="---Select---"
		      				  name="numberOfMembers"
		      				  headerKey=""
		      				  headerValue="---Select---"
			 				  listKey="value"					
	       					  list="#{'1':'1K or less','2':'2-10K','3':'11-50K','4':'51-100K','5':'101-500K','6':'501K-1M','7':'More than 1 Million'}"
	       					  value="%{numberOfMembers}"
	      					  required="false"  cssStyle="width: 250px;"/>
	      			</td>
				</tr>
				<!-- ...................... Average Monthly Redemption............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Average Monthly Redemption:</td>
					<td>
						<s:textfield id="averageMonthlyRedemptionId"  cssStyle="color:black;width: 250px;" name="averageMonthlyRedemption"/>
					</td>
				</tr>
				<!-- ...................... Average Redemption Price............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Average Redemption Price:</td>
					<td>
						<s:textfield id="averageRedemptionPriceId"  cssStyle="color:black;width: 250px;" name="averageRedemptionPrice"/>
					</td>
				</tr>
				<!-- ...................... Monthly Total............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Monthly Total:</td>
					<td>
						<s:textfield id="monthlyTotalId"  cssStyle="color:black;width: 250px;" name="monthlyTotal"/>
					</td>
				</tr>
				<!-- ...................... Brief Program Description............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Brief Program Description:</td>
					<td colspan="6">
						<s:textarea id="briefProgramDescriptionId" cssStyle="color:black;width:590px;height:50px;" name="briefProgramDescription"/>
					</td>
				</tr>
				<!-- ...................... Brands Interested in............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Brands Interested in:</td>
					<td colspan="6" >
						<s:textarea  id="brandsInterestedInId" cssStyle="color:black;width:590px;height:50px;" name="brandsInterestedIn"/>
					</td>
				</tr>
				<!-- ...................... Contact Information Section begins............. -->
				<tr valign="middle" height="30px">
					<td colspan="6" valign="middle" style="padding-left:10px;width:200px;background-color:#D3D3D3;font-size:12px;font-weight:bold;">Contact Information:</td>
				</tr>
				<!-- ...................... contact ............. -->
				<tr valign="middle" height="30px">
					<td valign="middle" style="padding-left: 10px;width:175px;"> Contact:</td>
					<td>
						<s:textfield id="contactId"  cssStyle="color:black;width: 250px;" name="contact"/>
					</td>
					<td valign="middle" style="padding-left:10px;width:100px;"> Phone:</td>
					<td>
						<s:textfield id="phoneId"  cssStyle="color:black;width:100px;" name="phone"/>
					</td>
					<td valign="middle" style="padding-left: 10px;width:25px;"> Ext:</td>
					<td>
						<s:textfield id="extId"  cssStyle="color:black;width:50px;" name="ext"/>
					</td>
				</tr>
				<!-- ...................... Job Title............. -->
				<tr valign="middle" height="30px">
					<td valign="top" style="padding-left: 10px;width:175px;"> Job Title:</td>
					<td valign="top">
						<s:textfield id="jobTitleId"  cssStyle="color:black;width: 250px;" name="jobTitle"/>
					</td>
				</tr>
				<!-- ...................... Email and address............. -->
				<tr valign="middle" height="30px">
					<td valign="top" style="padding-left: 10px;width:175px;"> Email:</td>
					<td valign="top">
						<s:textfield id="emailId"  cssStyle="color:black;width: 250px;" name="email"/>
					</td>
					<td valign="top" style="padding-left:10px;width:100px;"> Full Address:</td>
					<td colspan="3" >
						<s:textarea id="fullAddressId" cssStyle="color:black;width:215px;height:50px;" name="fullAddress"/>
					</td>
				</tr>
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
					<td colspan="6"/>
				</tr>					
				<!-- ...................... Save ..................... -->
				<tr height="40px">
					<td colspan="6" style="background-color:#D3D3D3"; valign="middle" align="center"><input id="btSendRequest" value="Send Request" type="button" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;" ></td>
				</tr>
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
					<td colspan="6"/>
				</tr>					
		</table>  
		</td>
		</tr>
	</table>    

  </div>
<div style="background-color:#f3f3f3;text-align:center;margin-top:700px; margin-left:5px; margin-right:5px">
  <p>Please note that all information provided is treated in absolute privacy. If you have specific requirements or would like us to sign an NDA, please feel free to send us your requests at info@loyaltysource.com.</p>
  <address style="background-color:#f3f3f3;font-weight:bold;text-align:center;margin-top:20px;margin-bottom:20px; margin-left:5px; margin-right:5px">
	LOYALTYSOURCE.COM<br> 
	404-642 DE COURCELLE,<br>
	MONTREAL,QUEBEC  H4C 3C5<br>
	514-664-5304. INFO@LOYALTYSOURCE.COM<br>
</address>
</div>

</div>
   <!-- ...........................jsp fragment ................................. -->
			<%@ include file="dialogues/saveSuccessPop.jsp" %>
			<%@ include file="dialogues/notificationMissingFieldsPop.jsp" %>
   <!-- ......................................................................... -->

<script type="text/javascript" charset="utf-8">
// Jquery Function main 
$(document).ready(function() {
	//when Admin click on the button save order map 
	 $('#btSendRequest').click( function(){
		fillDetails();
		$('#frmSendNewAccountRequest').val(1);
		$('#formNewAccountRequest').trigger("submit");
	});
	
	//when admin click on ok button after getting the success notification 
		$('#saveSuccessPop #btOK').click( function(){
			$('#frmSendNewAccountRequest').val(-1);
			$('#formNewAccountRequest').trigger("submit");	 	 
	});
	//when admin click on Save button without filling in all the fields.
	$('#notificationMissingFieldsPop #btOK').click( function(){
		$('#frmSendNewAccountRequest').val(-1);
		$('#formNewAccountRequest').trigger("submit");	 	 
	});	

		// Allows the user to enter only numbers for montly total.
	 $("#monthlyTotalId").keypress(function (e) {
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	               return false;
	    }
	});	
	// check the monthly total is numeric only when the Montly total loses focus.
	 $("#monthlyTotalId").focusout(function () {
		 var filter = /^[0-9-+]+$/;
		 if (!filter.test($("#monthlyTotalId").val())) {
	    	 $('#monthlyTotalId').val("");
	     }
	});	
	
	// Allows the user to enter only numbers for average Monthly Redemption .
	 $("#averageMonthlyRedemptionId").keypress(function (e) {
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	               return false;
	    }
	});	
	// check the average Monthly Redemption is numeric only when the average Monthly Redemption loses focus.
	 $("#averageMonthlyRedemptionId").focusout(function () {
		 var filter = /^[0-9-+]+$/;
		 if (!filter.test($("#averageMonthlyRedemptionId").val())) {
	    	 $('#averageMonthlyRedemptionId').val("");
	     }
	});	
	 
	// Allows the user to enter only numbers for Average Redemption Price.
	 $("#averageRedemptionPriceId").keypress(function (e) {
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	               return false;
	    }
	});	
	// check the Average Redemption Price is numeric only when the Average Redemption Price loses focus.
	 $("#averageRedemptionPriceId").focusout(function () {
		 var filter = /^[0-9-+]+$/;
		 if (!filter.test($("#averageRedemptionPriceId").val())) {
	    	 $('#averageRedemptionPriceId').val("");
	     }
	});	
	 
	// check for valid email format.
	 $('#emailId').focusout(function() {
   	   var sEmail = $('#emailId').val();
       var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
       if (filter.test(sEmail)) {
           return true;
       }
       else {
	    	alert('Please enter valid email address');
			$('#emailId').val("");
			 return false;
	   } 
	 });

	 // Allows the user to enter only numbers for ext.
	 $("#extId").keypress(function (e) {
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	               return false;
	    }
	});	
	 
	// check the ext is numeric only when the ext loses focus.
	 $("#extId").focusout(function () {
		 var filter = /^[0-9-+]+$/;
		 if (!filter.test($("#extId").val())) {
	    	 $('#extId').val("");
	     }
	});	
	 // Checks if the phone is 10 digit numeric
	 $('#phoneId').focusout(function() {
		 var phonetxt = $('#phoneId').val();
		 //var regex = /^(\([0-9]{3}\)\s*|[0-9]{3}\-)[0-9]{3}-[0-9]{4}$/;
		 var regex =/^\d{10}$/;
		 phonetxt = phonetxt.replace(/[^0-9]/g,"");
		 if (!regex.test(phonetxt) || phonetxt.length<10) {
			 alert("Please enter a valid 10 digit number");
	    	 $('#phoneId').val("");
	     }
		 
	 });
	 
	 function fillDetails(){
			var frmCompanyName = $('#companyNameId').val();
			var frmProgramName = $('#programNameId').val();
			var frmProgramUrl = $('#programUrlId').val();
			var	frmProgramType = $('#programTypeId').val();
			var	frmProgramTypeOther = $('#programTypeOtherId').val();
			var	frmYearsActive = $('#yearsActiveId').val();
			var	frmNumberOfMembers = $('#numberOfMembersId').val();
			var	frmAverageMonthlyRedemption = $('#averageRedemptionPriceId').val();
			var	frmAverageRedemptionPrice = $('#averageRedemptionPriceId').val();
			var	frmMonthlyTotal = $('#monthlyTotalId').val();
			var	frmBriefProgramDescription = $('#briefProgramDescriptionId').val();
			var	frmBrandsInterestedIn = $('#brandsInterestedInId').val();
			var	frmContact = $('#contactId').val();
			var frmPhone = $('#phoneId').val();
			var frmExt = $('#extId').val();
			var frmJobTitle = $('#jobTitleId').val();
			var frmEmail = $('#emailId').val();
			var frmFullAddress = $('#fullAddressId').val();
			
			frmBriefProgramDescription=frmBriefProgramDescription.replace(/\n|\r/g, " ");
			frmBrandsInterestedIn=frmBrandsInterestedIn.replace(/\n|\r/g, " ");
			frmFullAddress= frmFullAddress.replace(/\n|\r/g, " ");
			
			if (frmProgramType=="Other") {
				if(frmProgramTypeOther==""){
					alert("Please fill in the - Specify if other");
					frmProgramType="";
				}
			}
			
			$('#frmCompanyName').val(frmCompanyName);
			$('#frmProgramName').val(frmProgramName);
			$('#frmProgramUrl').val(frmProgramUrl);
			$('#frmProgramType').val(frmProgramType);
			$('#frmProgramTypeOther').val(frmProgramTypeOther);
			$('#frmYearsActive').val(frmYearsActive);
			$('#frmNumberOfMembers').val(frmNumberOfMembers);
			$('#frmAverageMonthlyRedemption').val(frmAverageMonthlyRedemption);
			$('#frmAverageRedemptionPrice').val(frmAverageRedemptionPrice);
			$('#frmMonthlyTotal').val(frmMonthlyTotal);
			$('#frmBriefProgramDescription').val(frmBriefProgramDescription);
			$('#frmBrandsInterestedIn').val(frmBrandsInterestedIn);
			$('#frmContact').val(frmContact);
			$('#frmPhone').val(frmPhone);
			$('#frmExt').val(frmExt);
			$('#frmJobTitle').val(frmJobTitle);
			$('#frmEmail').val(frmEmail);
			$('#frmFullAddress').val(frmFullAddress);
		}
	});	
</script>

	
 