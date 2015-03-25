<%@ taglib uri="/struts-tags" prefix="s" %>

<style type="text/css">
label {
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
<div class="pop_title" style="margin-top:30px;">Download file PDF</div>
 <div id="formContainer" align="center">
  
 <s:url id="fileDownload" namespace="/" action="downloadPDF" ></s:url>

<table>
	<tr style="height: 100px;">
	<td></td>
	</tr>
	
	<tr>
	<td><img src="images/iconPdfInbox.png"/></td>
	</tr>
	
	<tr><td></td></tr>
	
	<tr>
	 <td><s:a href="%{fileDownload}"> <img src="images/btDownload.png"/></s:a></td>
	</tr>
	<tr><td height="50px"></td></tr>
</table>



</div>

</div>