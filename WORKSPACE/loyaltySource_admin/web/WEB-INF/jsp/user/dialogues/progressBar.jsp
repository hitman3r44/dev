<style type="text/css" >
	#progressBar {
		position:absolute;
		width:26%;
		height:100px;
		top:30%;
		left:37%;
		border:1px solid #B0C4DE;
		z-index: 300;
		display:none;
		visibility:hidden;
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

<div id="progressBar" class="conteneurPrompt">
		 <div style="width:90%;height:100px;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 5%; padding-right:5%;">
				 	<center>	
			 		<table  cellspacing="0" width="100%" height="100px" border="0">
			 			<tr height="15px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 			<tr height="15px">
				 			<td colspan="2" align="center" >
				 				Please wait ... 
				 			</td>
			 			</tr>
			 			<tr>
				 			<td colspan="2" align="center">
				 				<img src="./images/progressBar.gif" width="100%"></img>
				 			</td>
			 			</tr>
			 			<tr height="15px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 		</table>
			 		</center>
            </div>
</div>