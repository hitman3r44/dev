<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/transfer.js"></script>

  
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

.selectUsersTag{
	border-top: 1px solid rgb(87,148,191);
	border-left: 1px solid rgb(199,226,241);
	border-bottom: 1px solid rgb(199,226,241);
	border-right: 1px solid rgb(199,226,241);
	height:67px;
	width:205px;
	position:absolute;
	z-index:100;
	display:none;
	margin-right:20px;
	overflow:auto;
}

/* ...............................*/
		/*
        .SelectScrollHidden {  
            height: 100px;  
            width: 200px;  
            overflow: hidden;  
            white-space: nowrap;  
        } 
        */
        
</style>
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">User transfer</div>

  <div id="formContainer" style="height: 300px;">
  
  <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
</s:if>  
  <br/> <br/>
<s:bean name="com.loyauty.web.struts.action.user.transfer.Transfer"  id="transferBB"/>
 


<!-- .......................... Form Transfer .................................................  -->

<s:form id="form" action="transfer.do" method="post" validate="true" enctype="multipart/form-data">
   <table border="0" >
   	<tr>
   		<td width="50px" align="center">From :</td>
   		<td width="230px">

        <!--Type-->
		<s:select id="clientCategoryId"
	        name="clientCategoryId"
	        cssStyle="width:156px;"
	        list="listClientCategory"
	        emptyOption="false"
	        headerKey="-1"
	        listKey="clientCategoryId"
	        listValue="clientCategoryName"
	        headerValue='--Select--'/>	
			<br />
        <!--Type-->
		
		
		

   		</td>
		<td width="40px" align="center">To :</td>
   		<td> 
			<div class="ui-widget">
   			<span style="font-size:12px;">
   			<input type="text" id="txtUserLoginTo" name="userLoginTo" value='<s:property value="%{userLoginTo}"/>' Style="width:200px;"  autocomplete="off"/>
   			</span>
   			</div>
   			<div style="position:absolute;padding: 0px;">  
   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag" scrolling="no">
			    <option></option>
			 </select>
   			</div>
   		</td>
   	</tr>
   	
   	<tr>
   		<td colspan="4" height="20px"></td>
   	</tr>
   	
   	<tr>
   		<td colspan="1"></td>
   		<td colspan="3" height="50px" align="center">
   		<img id="imageProgress"
   		   	style='border-left: 1px solid #DEDEDE; border-top: 1px solid #DEDEDE;
   		    border-bottom: 1px solid #DEDEDE; border-right: 1px solid #DEDEDE;<s:property value="%{dataTransferVisible}"/>'
			name="dataTransfer"  src="./images/pleaseWait.gif"/>
   		</td>
   	</tr>
   	
   	<tr>
   		<td  align="center"> </td>
   		<td colspan="3" align="center" height="30px"></td>
   	</tr>
   	
    <tr>
   		<td colspan="4"></td>
   	</tr>

   	<tr>
   		<td  align="center"></td>
   		<td  align="center" colspan="3"> 
   		<input id="btTransfer" type="button" value="Transfer" style="margin:20px 0px 0px 0px;padding:2px 10px;font-size:14px;"/>
   		 <%@ include file="../dialogues/confirmationPop.jsp" %>
 		</td>
   	</tr>
   </table>
</s:form>

 <select id="list"  style="visibility:hidden;display:none;">
 	<s:iterator value="%{usersList}" id="row">
		         <s:iterator value="%{#row}" id="cell">
		         <option>
		           <s:property value="%{#cell.login}"/>
		         </option>
		         </s:iterator>           
   </s:iterator> 
</select> 

<s:form action="transfer.do" method="post" validate="true" enctype="multipart/form-data">
<input type="hidden" id="justOKPopResult" name="justOKPopResult"></input>
<input type="hidden" id="copyUserTemp" name="userTemp"></input>
<input type="hidden" id="copyClientCategoryId" name="clientCategoryId"></input>
<input type="hidden" id="copyUserLoginTo" name="userLoginTo"></input>
<%@include file="../dialogues/resultPop.jsp" %>
</s:form>
 <%@ include file="../dialogues/progressBar.jsp" %>	
</div>
</div>
