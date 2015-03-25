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
<div class="pop_title" style="margin-top:30px;">User Connection Details</div>

  <div id="formContainer" style="padding-bottom: 60px;" align="left">
      
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if>  
<br/><br/>
 
 <!-- ============================= FORM : User Connection  ===================== -->
    <s:form id="formUserConnection" action="userConnection.do" method="post" enctype="multipart/form-data"> 
    <s:hidden id="SaveUserSignal" name="saveUser" value="0"/>
	<s:hidden id="userIdFindedSignal" name="userIdFindedSignal" value="0" />
	<s:hidden id="frmSaveUserConnectionConfirmed" name="saveUserConnectionConfirmed"/>

	<table border="0" width="1000" align="left">

		<!-- ............................. TABLE USER LOGIN ............................ -->
		<tr>
			<td width="640px" valign="middle" style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
			<table border="0" id="tabLogin" width="600px" height="80px" >
			<!-- ...................... Line separator ............. -->
				<tr height="5px">
					<td colspan="2"/>
				</tr>
				<!-- ....................User login name............................... -->
				<tr valign="middle" height="60px">
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
						style="height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					<option></option>
					</select>
				</div>
				</td>
				<!-- ...................... User ID ............. -->
				<td align="center" width="60px"> User ID:</td>
				<td width="50px" id="userIdFinded" style="color:black;" ><s:property value="%{userId}"/></td>
				<td width="56px" style="padding-left: 5px;"><img id="iconFindPartner" style="padding-right: 10px;" src="images/orders/findOrders.png" title="Find user"/></td>			
				</tr>
				<!-- ...................... User Name............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;width:120px;"> User Name:</td>
					<td  id="password" style="color:black;" >
					<s:textfield id="txtUserName"  cssStyle="color:black;width: 250px;" name="userName"/></td>
					<td  style="padding-left: 5px;"></td>
				</tr>
				<!-- ...................... Password............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;width:120px;"> Password:</td>
					<td  id="password" style="color:black;" >
					<s:textfield id="txtPassword"  cssStyle="color:black;width: 250px;" name="password"/></td>
					<td  style="padding-left: 5px;"></td>
				</tr>
				<!-- ...................... Host name............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;width:120px;"> Host:</td>
					<td  id="hostId" style="color:black;" >
					<s:textfield id="txtHost"  cssStyle="color:black;width: 250px;"  name="host"/></td>
					<td  style="padding-left: 5px;"></td>
				</tr>
				<!-- ...................... Port no............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;width:120px;"> Port:</td>
					<td  id="portNo" style="color:black;" >
					<s:textfield id="txtPort"  cssStyle="color:black;width: 40px;" name="port"/></td>
					<td  style="padding-left: 5px;"></td>
				</tr>
				<!-- ......................Protocol Type........................ -->
				<tr>
					<td style="padding-left: 10px;width:120px;">File Type:</td>
					<td>
					<s:select label="Protocol type"
		      				  name="protocol"
		      				  headerKey=""
		      				  headerValue="Protocol type"
			 				  listKey="value"					
	       					  list="#{'1':'ftp', '2':'sftp'}"
	       					  value="%{protocol}"
	      					  required="false"  cssStyle="width: 250px;"/></td>
				</tr>
				<!-- ...................... Remote Folder............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;"> Remote Folder:</td>
					<td width="103px" id="remoteFolder" style="color:black;" >
					<s:textfield  id="txtRemoteFolder"  cssStyle="color:black;width: 250px;" name="remoteFolder" /></td>
					<td width="100px" style="padding-left: 5px;"></td>
				</tr>
				<!-- ......................Orders Folder............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;"> Orders Folder:</td>
					<td width="103px" id="ordersFolder" style="color:black;" >
					<s:textfield id="txtOrdersFolder"  cssStyle="color:black;width: 250px;" name="ordersFolder" /></td>
					<td width="100px" style="padding-left: 5px;"></td>
				</tr>
				<!-- ......................Orders confirm Folder............. -->
				<tr valign="middle" height="40px">
					<td valign="middle" style="padding-left: 10px;"> Orders Confirm Folder:</td>
					<td width="103px" id="ordersConfirmFolder" style="color:black;" >
					<s:textfield id="txtOrdersConfirmFolder"  cssStyle="color:black;width: 250px;" name="ordersConfirmFolder" /></td>
					<td width="100px" style="padding-left: 5px;"></td>
				</tr>
				<!-- ...................... Line separator ............. -->
				<tr height="20px">
					<td colspan="2"/>
				</tr>
				<!-- ...................... Save ..................... -->
				<tr>
					<td style="padding-left: 10px;width:140px;"/>
					<td><input type="button" id="btSave" value="Save" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;"/></td>
				</tr>
				<!-- ................................................... -->
						
				<!-- ...................... Line separator ............. -->
				<tr height="20px">
					<td colspan="2"/>
				</tr>					
		</table>	
		</td>
		<!-- ................................. USER LOGO .......................... -->
		 <td align="left" valign="top" >
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
 <!-- ============================= FORM : User Connection ===================== -->
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
			<%@ include file="dialogues/confirmSaveUserConnectionPop.jsp" %> 
			<%@ include file="dialogues/saveSuccessPop.jsp" %>
			<%@ include file="dialogues/notificationMissingFieldsPop.jsp" %>
   <!-- ......................................................................... -->


<script type="text/javascript" charset="utf-8">
$(document).ready(function() {
	// set the user signal 1 when user clicks the find icon on the page.
	$('#iconFindPartner').click( function(){
		$('#userIdFindedSignal').val(1);
		$('#formUserConnection').trigger("submit");
	});
	
	$("#iconFindPartner").mouseover( function(){
		$("#iconFindPartner").css('width','30px');
		$("#iconFindPartner").css('hight','30px');
	});

	$("#iconFindPartner").mouseout( function(){
		$("#iconFindPartner").css('width','24px');
		$("#iconFindPartner").css('hight','24px');
	});	
	//when Admin click on the save button  
	 $('#btSave').click( function(){
		$("#SaveUserSignal").val("1");
		$('#userIdFindedSignal').val(0);
		$('#frmSaveUserConnectionConfirmed').val(0);
		$('#formUserConnection').trigger("submit");
	});
	//when admin click on the button save of saving confirmation dialogue Box:confirmSaveUserConnectionPop 
	$('#confirmSaveUserConnectionPop #btSaveUserConnectionCFM').click( function(){
		$('#SaveUserSignal').val(1);
		$('#frmSaveUserConnectionConfirmed').val(1);	
		$('#formUserConnection').trigger("submit");
	});
	//when admin click on the button cancel of saving confirmation dialogue Box:confirmSaveUserConnectionPop 
	$('#confirmSaveUserConnectionPop #btCancelCFM').click( function(){
		$('#SaveUserSignal').val(0);
		$('#userIdFindedSignal').val(0);
		$('#formUserConnection').trigger("submit");	 	 
	});
	//when admin click on Save button without filling in all the fields.
	$('#notificationMissingFieldsPop #btOK').click( function(){
		$('#SaveUserSignal').val(0);
		$('#userIdFindedSignal').val(0);
		$('#formUserConnection').trigger("submit");	 	 
	});	
	//when admin click on ok button after getting the success notification 
	$('#saveSuccessPop #btOK').click( function(){
		$('#SaveUserSignal').val(0);
		$('#formUserConnection').trigger("submit");	 	 
	});
	// Allows the user to enter only numbers for field port.
	 $("#txtPort").keypress(function (e) {
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	               return false;
	    }
	});	
	// check the port number is numeric only when the port field loses focus.
	 $("#txtPort").focusout(function () {
		 var filter = /^[0-9-+]+$/;
		 if (!filter.test($("#txtPort").val())) {
	    	 $('#txtPort').val("");
	     }
	});
});
</script>
</div>
</div>
