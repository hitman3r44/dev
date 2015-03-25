<style type="text/css" >
	#saveSuccessPop {
		position:absolute;
		width:250px;
		height:155px;
		top:30%;
		left:37%;
		border:1px solid #B0C4DE;
		z-index: 700;
		display:none;
		visibility:hidden;
		padding-top:5px;
		background-color:rgb(85,85,85);
		text-align: center;
		
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
		objSelected.style.borderColor ="red";
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

<div id="saveSuccessPop" class="conteneurPrompt" style='<s:property value="%{showSaveSuccessPop}"/>' >
		<span id="titlePop" style="color:white;font-size: 16px;vertical-align: middle;">Result</span>
		<div style="height: 5px;"></div>
		<!-- *************************************************** Le Body ********************************************************** -->			 	
		 <div style="width:100%;height:130px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 0px; padding-right:0px;">
				 	<center>
			 		<table  cellspacing="0" width="100%" height="130px" border="0">
			 		
			 			<tr>
				 			<td colspan="2" align="center" style="padding-left: 20px;padding-right: 20px;">
				 				<div style="max-height: 70px;overflow:auto;font-family: Arial, Helvetica, sans-serif;font-size: 14px;">
				 					<center id="msgConfirmation"><s:property value="%{msg}"/></center>
								</div>
				 			</td>
			 			</tr>

			 			<tr height="45px" valign="top">
				 			<td colspan="2" align="center"><input id="btOK"  type="button" value="OK"
				 			    style="margin:7px 5px 0px 0px;padding:2px 10px;font-family: Arial, Helvetica, sans-serif;font-size: 14px;" /></td>
			 			</tr>
			 					 			
			 		</table>
			 		</center>
            </div>
</div>

