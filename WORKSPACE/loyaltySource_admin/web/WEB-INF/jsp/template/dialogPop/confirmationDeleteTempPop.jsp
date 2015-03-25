<style type="text/css" >
	#confirmationDeleteTempPop {
		position:absolute;
		width:26%;
		height:150px;
		top:30%;
		left:37%;
		border:1px solid #B0C4DE;
		z-index: 300;
		display:none;
		visibility:hidden;
		padding-top:5px;
		background-color:rgb(85,85,85);
	}
</style>

<script language="javascript">
/* <![CDATA[ */	
document.onmousedown = down;
document.onmousemove = drag;
document.onmouseup = up;
var zindex = 0;
var objSelected;
function down(objEvent) {
	var ev = window.event || objEvent ;
	objSelected = ev.srcElement || ev.target;
	if (objSelected.nodeName=="DIV") {
		objSelected.style.borderColor = "red";
		objSelected.style.cursor = "move";
		zindex++; 
		objSelected.style.zIndex = zindex ; 
		dx = ev.offsetX || ev.layerX;
		dy = ev.offsetY || ev.layerY;	
		window.status = "dx = " + dx + ", dy = " + dy;
		return false;
	}
}
function up(objEvent) {
	var ev = window.event || objEvent ;
	if (objSelected.nodeName=="DIV") {
		objSelected.style.borderColor = "#B0C4DE";
		objSelected.style.cursor = "auto";
		objSelected = null;
	}
}
function drag(objEvent) {
	var ev = window.event || objEvent ;
		if (objSelected && objSelected.nodeName=="DIV") {
			objSelected.style.left = (ev.clientX-dx) + "px";
			objSelected.style.top = (ev.clientY-dy) + "px" ;
			return false;
		}
}

/*  ]]> */

</script>
<div id="confirmationDeleteTempPop" class="conteneurPrompt" >
		
		<!-- *************************************************** Le Body ********************************************************** -->			 	
		 <div style="width:100%;height:150px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;">
				 	<center>	
			 		<table  cellspacing="0" width="100%" height="140px" border="0">
			 			
			 			<!-- ....................................... Text Area des message envoyés ................................... -->
			 			<tr height="25px">
			 				
				 			<td colspan="2" valign="top" align="center" style="background-color:rgb(85,85,85);color:white;font-size: 16px;">
				 				Confirmation
				 			</td>
			 			</tr>
						<!-- ....................................... Text Area des message envoyés ................................... -->
			 			<tr height="30px">
				 			<td colspan="2" align="center" />
			 			</tr>

			 			<tr>
				 			<td colspan="2" align="center" style="padding-left: 20px;padding-right: 20px;font-family: Arial, Helvetica, sans-serif;font-size: 13px;">
				 				<s:property value="%{msgDeleteConfirmation}"/>
				 			</td>
			 			</tr>
			 			<tr height="15px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 			<tr height="15px">
				 			<td align="right" width="50%"><input id="btYesDeleteTemp" type="submit" value="Yes" style="font-family: Arial, Helvetica, sans-serif;font-size: 13px;"/></td>
				 			<td align="left"><input id="btNoDeleteTemp" type="button" value="No" style="font-family: Arial, Helvetica, sans-serif;font-size: 13px;"/></td>
			 			</tr>
			 			
			 		</table>
			 		</center>
            </div>
</div>
