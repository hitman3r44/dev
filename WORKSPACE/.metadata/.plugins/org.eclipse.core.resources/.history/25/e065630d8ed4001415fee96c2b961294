<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">

.row_without_color {
	background-color:white;
	cursor: pointer;
}
.row_with_color {
	background-color: rgb(245,249,252);
	cursor: pointer;
}

</style>
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">List Account</div>
 <div id="formContainer" style="padding-bottom:30px;">

			<table>
			<tr>
				<td colspan="2" height="15px"/>
			</tr>
			<tr>
				<td width="50px">Status:</td>
				<td><s:select id="slectUserStatus" label="" cssStyle="width:143px;"
					headerKey="-1" headerValue="All Users"
					list="#{'1':'Active', '2':'Inactive'}" 
					name="userStatus" 
					 /> Result:<s:property value="%{dataLinks.size}"/></td>
			</tr>
			<tr>
				<td colspan="2" height="5px"/>
			</tr>
			<tr>
				<td>Search:</td>
				<td><input id="search" style="width: :150px;" name="search"/></td>
			</tr>
			<tr>
				<td colspan="2" height="10px"/>
			</tr>
			</table>
			
			<table id="usersListData" width="100%" border="0" class="pad_5px nowraptable datatable" >
			<thead class="gray_header">
				<tr>
			    	<th>User Account</th>
			        <th>Email</th>
			        <th>User Code</th>
			        <th>Status</th>
			        <th>Category</th>
			        <th>Action</th>
				</tr>
			</thead>
			<s:if test="%{dataLinks != null}">
						<s:if test="%{dataLinks.size > 0}" >
							<tbody>
								<s:iterator value="dataLinks" status="userAccount">
								<s:if test="%{index==0}">
									<tr id="rowUser" class="row_with_color">
									<td id="columnLogin"><s:property value="login"/></td>	
										<td><s:property value="email"/></td>
										<td><s:property value="code"/></td>
										<td>
										<s:if test="%{active ==true}">
										Active
										</s:if>
										<s:else>
										Inactive
										</s:else>
										</td>
										<td><s:property value="clientCategoryName"/></td>
										<td><a href='manageAccountInit.do?userId=<s:property value="id"/>&userName=<s:property value="login"/>'>Manage </a>
										- <a href='editUser.do?userId=<s:property value="id"/>'> Edit </a> 
			                     </td>								
																
								</tr>
								</s:if>
								<s:else>
								<tr id="rowUser" class="row_without_color">
								<td id="columnLogin"><s:property value="login"/></td>	
										<td><s:property value="email"/></td>
										<td><s:property value="code"/></td>
										<td>
										<s:if test="%{active ==true}">
										Active
										</s:if>
										<s:else>
										Inactive
										</s:else>
										</td>
										<td><s:property value="clientCategoryName"/></td>
										<td><a href='manageAccountInit.do?userId=<s:property value="id"/>&userName=<s:property value="login"/>'>Manage </a>
										- <a href='editUser.do?userId=<s:property value="id"/>'> Edit </a> 
			                     </td>								
																
								</tr>
								</s:else>
										
								</s:iterator>
							</tbody>
						</s:if>
					</s:if>	       
			</table>

	    	
  <!-- Form Show Users By Status --> 
		<s:form action="usersListAccount.do" method="post" validate="true" enctype="multipart/form-data">		
			<input type="hidden" id="userStatusCopy" name="userStatus"/>
			<input id="showUserlistAccount" type="submit" value="showUserlistAccount"  style="display:none;visibility:hidden;">
		</s:form>
  <!-- Form Show Users By Status --> 
	    	
		</div>		
	  </div>

<script type="text/javascript" charset="utf-8">
var userListAccount = [];
var rowSelected=-1;
var lastRowSelected=-1;
var csslastRowSelected="";

$(document).ready(function() {

	
	
	/*---------------------------------------- Color Row -----------------------------------------
							when Admin selected Row, colored it in yellow
	  --------------------------------------------------------------------------------------------*/ 
	$('#usersListData tr[id="rowUser"]').click( function() {
		if(lastRowSelected>-1){
			$('#usersListData tr[id="rowUser"]').eq(lastRowSelected).css("background-color",csslastRowSelected);
		}
		rowSelected=$('#usersListData tr[id="rowUser"]').index(this);
		csslastRowSelected=$('#usersListData tr[id="rowUser"]').eq(rowSelected).css("background-color");
		lastRowSelected=rowSelected;
		$('#usersListData tr[id="rowUser"]').eq(rowSelected).css("background-color","#FFFF99");
	});

	//kepp users data in the table userListAccount
	$(function() {
		$("#rowUser #columnLogin").each(function() {
			userListAccount.push($(this).text());
		});
		for(i=0;i<userListAccount.length;i++){ 
			userListAccount[i]=userListAccount[i].replace(/^\s\s*/, ''); 
			userListAccount[i]=userListAccount[i].replace(/\s\s*$/, ''); 
			userListAccount[i]=userListAccount[i].replace(/([\s]+)/g, '-');
			
			};
	});
	
	//when Admin change status 
	$("#slectUserStatus").change(function() {
		var userStatus=$("#slectUserStatus").val();
		$("#userStatusCopy").val(userStatus);
		$("#showUserlistAccount").click();
	});

	//when Admin write in the filth search
	$("#search").keyup(function() {
		var search=$("#search").val();
		search=search.toLowerCase();
		//show all rows
		for(i=0;i<userListAccount.length;i++)$("#rowUser").eq(i).show();
		//check rows strting with the word 'search'
		for(i=0;i<userListAccount.length;i++){ 
			var str=userListAccount[i].toLowerCase();
			if(str.match("^"+search)){
				$('#usersListData tr[id="rowUser"]').eq(i).show();	
			}else{
				$('#usersListData tr[id="rowUser"]').eq(i).hide();
			}
		};
	});

});
		

</script>