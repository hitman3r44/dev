<%@ taglib uri="/struts-tags" prefix="s" %>

<%-- custom style for the Sign In form --%>
<style type="text/css">
label {
	width:100px;
}
.vanadium-advice {
	margin-left: 121px;
}
input.vanadium-valid {
	background-image: none;
}
</style>
<!--  complete this with property files -->

<div class="unit" style="width:950px;margin:30px 0px 0px 60px;">
  <div class="pop_title">Info</div>
  <div id="globalAdvice" style="padding:15px 20px 15px 20px;display: none;" class="gray_bg"></div>
  <div id="formContainer" >
       <label for="info"></label>
        <div class="on-2 columns same-height" style="margin:10px 20px 0px 20px;">
          <div class="fixed column">
          	<div class="vertical-center">
          		<s:property value="#session[@com.loyauty.web.WebConstants@MESSAGE_INFO]" /> 
          	</div>
          </div>
        </div>
  </div>  
</div>
