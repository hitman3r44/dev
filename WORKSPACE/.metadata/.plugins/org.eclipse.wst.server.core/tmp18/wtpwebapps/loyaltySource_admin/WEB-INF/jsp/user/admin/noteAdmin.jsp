<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
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
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Notes</div>

 <div id="formContainer" style="height: auto;">
  
 <s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  </s:iterator></div>  
  
 </s:if>  
  <br/><br/>
 
<!-- Update Note Admin --> 
	<s:form action="noteAdmin.do" method="post" validate="true" enctype="multipart/form-data">
		<s:hidden name="updateNote" value="1"/>
		<table id="tabNoteAdmin" style="width:70%;" border="0" title="Double-click to edit">
		<tr id="rowNoteProperty">
		<td width="100%" title="Double-click to edit"valign="top">
		    <span style="color:rgb(119,119,119);"><s:property value="clickHere"/></span>
		     <div style="max-height: 600px;overflow:auto;width:555px;">
		      <s:property value="userDTO.note" escape="false"/></div></td>
		</tr>
		<tr id="rowNoteTextArea" style="display:none;visibility:hidden;">
		<td><s:textarea id="noteAdminArea" name="userDTO.note" cssClass="ckeditor ckEn"/></td>
		</tr>
		</table>
		
		<div id="divBtEditNote" style="display:none;visibility:hidden;">
		<input id="btUpdateNote" type="submit" value="Save"
							     style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/>
		<input id="btCancelUpdateNote" type="button" value="Cancel"
								 style="margin:20px 5px 0px 0px;padding:2px 10px;font-size:14px;"/>
		</div>
	  	
	  	
	  	
	</s:form>

	<s:form action="noteAdmin.do" method="post" validate="true" enctype="multipart/form-data">
		<s:hidden name="updateNote" value="0"/>
		<input id="submitCancelUpdateNote" type="submit" style="display:none;visibility:hidden;" value="Cancel" ></input>
	  	<%@include file="../dialogues/resultPop.jsp" %>
	</s:form>
		 		
	 <%@ include file="../dialogues/progressBar.jsp" %>
<!--Update Note Admin -->

	<div style="height:10px;"></div>
</div>
<div class="pop_title" style="margin-top:30px;"></div>
</div>



<script type="text/javascript">
var timerCounter=0;
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

$(document).ready(function() {

	
	// When user click on the button cancel
	$("#btCancelUpdateNote").click(function(){  
		$("#submitCancelUpdateNote").click();		
	});
	 
	// progressBar
	$("#btUpdateNote").click(function(){  
		$('html,body').scrollTop(0);
		horloge();		
	});

	// progressBar
	$("#rowNoteProperty").dblclick(function(){  
		$('html,body').scrollTop(0);
		
		$("#rowNoteTextArea").css("display","block"); 
		$("#rowNoteTextArea").css("visibility","visible");

		$("#divBtEditNote").css("display","block"); 
		$("#divBtEditNote").css("visibility","visible");

		$("#rowNoteProperty").css("display","none");
		$("#rowNoteProperty").css("visibility","hidden");
		
			
	});

	// progressBar
	$("#rowNoteTextArea").dblclick(function(){  
		$('html,body').scrollTop(0);
		$("#rowNoteTextArea").css("display","none");
		$("#rowNoteTextArea").css("visibility","hidden");
		$("#rowNoteProperty").css("display","block"); 
		$("#rowNoteProperty").css("visibility","visible");
		$("#divBtEditNote").css("display","none"); 
		$("#divBtEditNote").css("visibility","hidden");	
	});
	// style="display:none;visibility:hidden;"style="display:none;visibility:hidden;"



	

});
  	
</script>



