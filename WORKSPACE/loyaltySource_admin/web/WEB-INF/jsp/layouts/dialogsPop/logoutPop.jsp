<style type="text/css" >
	#logoutPop {
		position:absolute;
		width:26%;
		height:160px;
		top:140%;
		left:72%;
		border:0px solid transparent;;
		z-index: 300;
		display:none;
		visibility:hidden;
	}

	.popup {
    background-color:rgb(249,249,249);
    position:relative;
    display:inline-block;
    padding:.2em .5em;
    border:1px solid rgb(119,119,119);
    z-index:0;
	
	
	width: 130px;
    height: 80px;
    background: #9a4;
    -webkit-border-radius: 15px;
    -moz-border-radius:    15px; 
	border-radius:    10px;
	
}

.popup:after,
.popup:before {
    width:0;
    height:0;
    content:"";
    display:block;
    position:absolute;
    bottom:100%;
    left:30%;
}

.popup:after {
    border-bottom:10px solid rgb(249,249,249);
    border-left:10px solid transparent;
    border-right:10px solid transparent;
    z-index:1;
    margin-top:1px;
}

.popup:before {
    border-bottom:13px solid rgb(119,119,119);
    border-left:13px solid transparent;
    border-right:13px solid transparent;
    margin-top:-1px;
    margin-left:-1px;
    z-index:-100;
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


<div id="logoutPop" class="conteneurPrompt">

		 <div class="popup"  style="align:center;width:90%;height:100%;background-color:rgb(249,249,249); color:#000000; font-size:14px; padding-left: 5%; padding-right:5%;">
				 	<center>	
			 		<table cellspacing="0" width="100%" height="155px" border="0">
			 		
			 			<tr height="10px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 			<tr height="30px">
				 			<td colspan="2" align="left" valign="middle" style="font-weight: normal;color:rgb(119,119,119);padding-left:32px;" >
				 				<%=request.getSession(true).getAttribute("fullName")%> 
				 			</td>
			 			</tr>
			 			<tr height="5px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 						 			
			 			<tr align="center" valign="bottom">
			 				<td align="left" width="25px;"><img height="22" width="19" src="./images/icon_edit.gif"/></td>
				 			<td align="left" valign="bottom" style="cursor:pointer;color:rgb(57,166,200);padding: 0px;">
				 				<center  id="noteAdmin" style="width: 55px;font-weight: normal;">Notes</center>
				 				<s:form action="noteAdmin.do" method="post" validate="true" enctype="multipart/form-data">
				 					<input style="display:none;visibility:hidden;" id="submitNoteAdmin" type="submit" value="NoteAdmin" />
				 				</s:form>
				 			</td>
			 			</tr>
			 			
			 			<tr align="center" style="height: 30px;">
			 				<td align="left" width="25px;" valign="bottom"><img src="./images/imgMyProfile.png"/></td>
				 			<td align="left" valign="bottom" style="cursor:pointer;color:rgb(57,166,200);padding: 0px;">
				 				<center id="myProfile" style="width: 80px;font-weight: normal;">My Profile</center>
				 				<s:form action="homePage.do" method="post" validate="true" enctype="multipart/form-data">
				 					<input style="display:none;visibility:hidden;" id="submitMyProfile" type="submit" value="logOut" />
				 				</s:form>
				 			</td>
			 			</tr>
			 			<tr height="10px">
				 			<td colspan="2" align="center" />
			 			</tr>
			 			<tr height="10px">
				 			<td colspan="2" align="center" valign="bottom">
				 			<img style="cursor:pointer" id="execteHrefLogOut" alt="logOut" src="./images/btLogout.png" title="Log Out"/>
				 				<s:form action="user/logout.do" method="post" validate="true" enctype="multipart/form-data">
				 					<input style="display:none;visibility:hidden;" id="submitLogOut" type="submit" value="logOut" />
				 				</s:form>

				 			</td>
			 			</tr>

			 		</table>
			 		</center>
            </div>
            
            <!--  
            <label id="myProfile" style="cursor:pointer;">
            -->
</div>