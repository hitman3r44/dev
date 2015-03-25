<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript">
	$("#topMenuRed").hide();

</script>

<style type="text/css">
label{
	width:170px;
}
.vanadium-advice {	/* Please enter the MS Excel File. */
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}
</style>
<div class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Download file PDF</div>

  <div id="formContainer" style="height: 300px;">
  
  
  
<s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>  
</s:if>  
  
  <br/> <br/>
   <form action="uploadXML.do" method="post" enctype="multipart/form-data">
      <label for="fileXLS">Upload File:</label>
      <input type="file" name="fileXLS" />
      <input type="submit" value="Upload"/>
   </form>
</div>
</div>

