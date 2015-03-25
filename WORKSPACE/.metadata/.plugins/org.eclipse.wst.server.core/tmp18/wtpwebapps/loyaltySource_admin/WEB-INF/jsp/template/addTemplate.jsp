<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/managers/templateManager.js"></script>  

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
   
    
</style>
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Add template</div>

 <div id="formContainer" style="height: auto;">
  
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if>  
  <br/> <br/>
 
  <!-- add the template --> 
  		<input type="hidden" id="deleteIndication" name="deleteIndication" value="0"/>
		<table border="0">
				<tr>
				<td width="140px">Name:</td>
				<td width="140px"><s:textfield id="clientCategoryName" name="clientCategoryName" maxlength="50" cssStyle="width:200px"/></td>
				</tr>
				
				<tr>
				<td width="140px">Data Source From:</td>
				<td>
					<div class="ui-widget">
		   			<span style="font-size:12px;">
		   			<input type="text" id="txtUserLoginTo" name="userLoginTo" value='<s:property value="%{userLoginTo}"/>' Style="width:200px"  autocomplete="off"/>
		   			</span>
		   			</div>
		   			<div style="position:absolute;">  
		   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
		   			 		 style="height:67px;width:205px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					    <option></option>
					 </select>
		   			</div>
				</td>
				</tr>
												
				<tr height="20px">
				<td colspan="2"/>
				</tr>
				
				<tr>
				<td colspan="2" align="left"><input id="btAddTemplate" type="button" value="Add Template"
					style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"></td>
				
				</tr>
								
				<tr height="50px">
				<td colspan="2"/>
				</tr>
		
		</table>
   <!--add the template --> 
  
  
   <!-- List users --> 
		<select id="list"  style="visibility:hidden;display:none;">
		 	<s:iterator value="%{usersList}" id="row">
				         <s:iterator value="%{#row}" id="cell">
				         <option>
				           <s:property value="%{#cell.login}"/> 
				         </option>
				         </s:iterator>           
		   </s:iterator> 
		</select> 
  <!-- List users --> 

  <!-- Template table --> 
		<table  id="tabTemp" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
		 	<thead class="gray_header">
				<tr>
					<th></th>
					<th style="display:none;visibility:hidden;"><s:text name="manager Name"/></th>
					<th style="display:none;visibility:hidden;"><s:text name="clientCategory Id"/></th>
					<th width="110px"><s:text name="Template Name"/></th>
					<th style="display:none;visibility:hidden;"><s:text name="Creation Date" /></th>
					<th><s:text name="Data Sources on Creation" /></th>
					<th style="display:none;visibility:hidden;"><s:text name="UserIdSource" /></th>
					<th><s:text name="Delete" /></th>
					 
				</tr>
			</thead>
					<s:if test="%{listClientCategory != null}">
						<s:if test="%{listClientCategory.size > 0}" >
							<tbody>
								<s:iterator value="listClientCategory" status="clientCategory">
									<tr>
										<td id="columnPointer"><img id="imgPointer" src="./images/pointerWhiteIcon.png"/></td>
										<td id="columnManagerRealName"  style="display:none;visibility:hidden;">
										 <input id="heddenManagerRealName" type="text" value='<s:property value="managerRealName"/>'></td>
										<td id="columnClientCategoryId" style="display:none;visibility:hidden;">
										<input id="heddenClientCategoryId" type="hidden" value='<s:property value="clientCategoryId"/>'></td>	
										<td><s:property value="clientCategoryName"/></td>								
										<td id="columnCreateDate" style="display:none;visibility:hidden;">
										<s:date name="creationDate" var="creationDate" format="dd/MM/yyyy"/>
        								<s:label id="strCreationDate" name="strCreationDate" value="%{#creationDate}" key="lastLabelkey"
        								         cssStyle="width:80px;text-align: center;"/>
										</td>
										<td><s:property value="clientCategoryUserLogin"/></td>
										<td style="display:none;visibility:hidden;"><s:property value="clientCategoryUserId"/></td>
										<td id="columnBtDeleteTemp" align="center" valign="middle">
										<s:hidden name="countTempUsed" var="countTempUsed"/>
										<s:if test='%{countTempUsed >= "1"}' >
										<img title="Can not delete This template! It's in use." alt="can not delete" style="cursor:pointer;" id="btDeleteTemp" width="18" height="18" src="./images/deleteIconInactive.png"/>
										</s:if>
										<s:else>
										<img title="Click to delete This template." alt="delete" style="cursor:pointer;" id="btDeleteTemp" width="18" height="18" src="./images/deleteIconActive.png"/>
										</s:else>
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</s:if>
					</s:if>	            								
		</table>
     <!-- Template table -->



  <!-- Form Add the template --> 
		<s:form action="addTemplate.do" method="post" validate="true" enctype="multipart/form-data">		
			<input type="hidden" id="deleteIndication" name="deleteIndication" value="0"/>
			<input type="hidden" id="txtUserLoginToCopy" name="userLoginTo"/>
			<input type="hidden" id="clientCategoryNameCopy" name="clientCategoryName"/>
			<input id="submitAddTemplate" type="submit" value="addTemplate"  style="display:none;visibility:hidden;">
			<%@ include file="./dialogPop/confirmationAddTempPop.jsp" %>
		</s:form>
  <!-- Form add the template --> 



 
  <!-- Form delete the template --> 
		<s:form action="addTemplate.do" method="post" validate="true" enctype="multipart/form-data">
			<input type="hidden" id="clientCategoryIdCopy" name="clientCategoryId"/>		
			<input type="hidden" id="deleteIndication" name="deleteIndication" value="1"/>	
			<input id="submitDeleteTemplate" type="submit" value="deleteTemplate"  style="display:none;visibility:hidden;">
			<%@ include file="./dialogPop/confirmationDeleteTempPop.jsp" %>
		</s:form>
		<%@ include file="./dialogPop/progressBarPop.jsp"%>
  <!-- Form delete the template --> 
<div style="height:100px;"></div>
</div>
<div class="pop_title" style="margin-top:30px;"></div>
<div style="height:40px;">
 <label id="createdBy" style="width: 500px;"></label>
</div>

</div>

