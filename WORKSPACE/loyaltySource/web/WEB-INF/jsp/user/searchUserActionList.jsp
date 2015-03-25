<%@ taglib uri="/struts-tags" prefix="s" %>


<div class="unit" style="width:950px;margin:30px 0px 0px 60px;">
  <div class="pop_title" id="Title">Action Users</div>
  
  <div class="columns" style="margin-top:20px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
    <strong>From Date:</strong>
    </div> 
	
		<div class="fixed column">
			<s:select id="fromNewDay"  
			name="fromNewDay"  
			list="dayList"  
			headerKey=""
	 	  	headerValue="" 
	 	  	disabled="%{autorize['RELEASE_DATE']}" /></div> 
	<div class="fixed column">
			<s:select id="fromNewMonth"  
			name="fromNewMonth" 
			headerKey=""
			headerValue="" 
			list="monthList" 
			cssStyle="width:75px"
			listKey="id" listValue="%{getText(name)}" 
			disabled="%{autorize['RELEASE_DATE']}"  /></div> 
	
			<s:select id="fromNewYear"  
			name="fromNewYear" 
			headerKey=""
	 	  	headerValue=""  
			list="yearList" /></div> 
            
            </div>
	<div class="columns" style="margin-left:60px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
	<strong>To Date:</strong></div>
	
			<div class="fixed column">
				<s:select id="toNewDay"  
				name="toNewDay"  
				list="dayList"  
				headerKey=""
		 	  	headerValue="" 
		 	  	disabled="%{autorize['RELEASE_DATE']}" /></div> 
		<div class="fixed column">
				<s:select id="toNewMonth"  
				name="toNewMonth" 
				headerKey=""
				headerValue="" 
				list="monthList" 
				cssStyle="width:75px"
				listKey="id" listValue="%{getText(name)}" 
				disabled="%{autorize['RELEASE_DATE']}"  /></div> 
		<div class="fixed column">
				<s:select id="toNewYear"  
				name="toNewYear"
				headerKey=""
		 	  	headerValue=""  
				list="yearList"
				disabled="%{autorize['RELEASE_DATE']}"  /></div> 
		            
    </div>
  	<div class="columns" style="margin-left:60px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
    <strong>User Id:</strong>
    </div> 
		<s:textfield id="userId" name="userName" maxlength="85" cssStyle="width:50px;" />
    </div>
    <div class="columns" style="margin-left:60px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
    <strong>Game Id:</strong>
    </div> 
		<s:textfield id="gameId" name="gameName" maxlength="85" cssStyle="width:50px;" />
    </div>
	<div class="columns" style="margin-left:60px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
	<strong>Actions:</strong></div>
	<div class="fixed column">
			<s:select id="actionEntry"  
			name="actionEntry" 
			headerKey=""
			headerValue="" 
			list="actionEntryList" 
			cssStyle="width:225px"
			listKey="id" 
			listValue="%{name}"/></div> 
    </div>
   
	<div class="columns" style="margin-left:60px;">
    <div class="fixed column" style="padding:4px 10px 0px 0px;width:100px;">
    <strong>Limit:</strong></div>
	<div class="fixed column">
			<s:select id="limit"  
			name="limit"  
			list="limitList"  
			headerKey=""
	 	  	headerValue="" 
	 	  	disabled="%{autorize['RELEASE_DATE']}" /></div> 
	</div>

	<div id="date_Error" style="display:none"></div>
    		  
   	<input type="button" id="search" value="Search" style="margin-left:60px;padding:5px;"/>
   	

	<div id="actionList" class="fixed column" style="padding:20px 0px 0px 0px;">    
	  <div class="blue f12 bold pb10" style="padding-bottom:10px;"></div>
		<div id="actionListData" style="width:950px;">	
	    	<table border="0" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
	            <thead class="gray_header">
	              <tr>
	                <th style="width:350px;" class="bold"><s:text name="loyauty.common.text.short.action" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.actionEntry" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.username" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.game" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.platform" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.value" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.points" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.creationDate" /></th>
	                <th style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.accion" /></th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
					<td colspan="2" class="dataTables_empty">Loading data from server</td>
				  </tr>
	            </tbody>
	    	</table>
		</div>		
	  </div>

  </div>


<script type="text/javascript" charset="utf-8"><!--
$(document).ready( function() {
	
	var ActionsDatatableTypes = {
			"fullNumbersPagination": {
				"sPaginationType": "full_numbers",
				"bAutoWidth": false,
				"bFilter": true,
				"bLengthChange": false,
				"bInfo": true,
				"bSort": true,
				"bSortClasses": false,
				"iDisplayLength": 100,
				"asStripClasses": ['blue_bg',''],
				"oLanguage": {
					"oPaginate": {
							"sNext": "<img src=\""+GamejabDatatableConfig.imagesLocation+"/next.png\" />",
							"sLast": "<img src=\""+GamejabDatatableConfig.imagesLocation+"/last.png\" />",
							"sPrevious":"<img src=\""+GamejabDatatableConfig.imagesLocation+"/previous.png\" />",
							"sFirst":"<img src=\""+GamejabDatatableConfig.imagesLocation+"/first.png\" />"
							}
				}
			}
		};
	var dataActionList = [];
	var actionType = $.extend( {}, ActionsDatatableTypes.fullNumbersPagination, {"aoColumns": [ null, 
	                                                                                        	null ,
	                                                                                        	{"sClass": "hcenter"},
	                                                                                        	{"sClass": "hcenter"},
	                                                                                        	{"sClass": "hcenter"},
	                                                                                        	{"sClass": "hcenter"}, 
	                                                                                        	{"sClass": "hcenter"}, 
	                                                                                        	{"sClass": "hcenter"},
	                                                                                        	{"sClass": "hcenter"}]});
	var table = $('#actionListData').dataTable( $.extend({},actionType,{"aaData" : dataActionList }));
	$('#search').click( function() {
		var modifyLink = '';
		
		$.getJSON("ajax/allActionForUser.do", {userId: $('input#userId').val(), 
											   fromNewDay:$('select#fromNewDay').val(), 
											   fromNewMonth:$('select#fromNewMonth').val(), 
											   fromNewYear:$('select#fromNewYear').val(), 
											   toNewDay:$('select#toNewDay').val(), 
											   toNewMonth:$('select#toNewMonth').val(), 
											   toNewYear:$('select#toNewYear').val(), 
											   limit:$('select#limit').val(),
											   gameId:$('input#gameId').val(),
											   actionEntry:$('select#actionEntry').val() }, function(data) {	
			table.fnClearTable();
			$.each(data.aaData, function(index, action) {
				if(action.action == 'ADD_CONTENT' 
				   && action.entry != 'CONTENT_LOGOS'
				   && action.entry != 'CONTENT_PARTY_REVIEWS'
				   && action.entry != 'CONTENT_UNITS_SOLD'
				   && action.entry != 'CONTENT_DISC_MEDIA'
				   && action.linkId != 0)
					modifyLink = '<a href="addRemoveLink.do?linkId=' + action.linkId + '">' + 'edit' +'</a>';
				else
					modifyLink = '<a href="/' + action.gameName + '-' + action.platformName + '-' + action.gameId + '.htm">' + 'edit' +'</a>';
				//dataActionList.push(['<a href="' + games.hrefName + '" />' + games.name + ' </a>']);	
				table.fnAddData([action.action,
				 				 action.entry,
				 				 action.userName + "(" + action.userId + ")",
				 				 action.gameName,
				 				 action.platformName,
				 				 action.value,
				 				 action.points,
				 				 action.localizedCreationDate,
				 				 modifyLink]);				
			});
			//if( dataActionList.length != 0 ) {			
			//	$('#actionListData').dataTable( $.extend({},gamesType,{"aaData" : dataActionList }));
			//}		
		});
	} );
	
});
</script>