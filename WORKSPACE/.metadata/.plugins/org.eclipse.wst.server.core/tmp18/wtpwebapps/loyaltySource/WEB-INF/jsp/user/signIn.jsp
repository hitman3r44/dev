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

<div class="unit" style="width:950px;margin:30px 0px 0px 60px;">
  <div class="pop_title">Sign In</div>
  <div id="globalAdvice" style="padding:15px 20px 15px 20px;display: none;" class="gray_bg"></div>
  <div id="formContainer" >
    <s:form namespace="/user" action="login" id="form" method="post" validate="true">
      <fieldset>
        <label for="username"><strong><s:text name="loyauty.common.text.short.username" /></strong></label>
        <s:textfield id="username" 
        			 name="username" 
        			 maxlength="14" 
        			 cssStyle="width:130px;" />
        <div id="usernameError" style="display:none"></div>
        <br />
        <label for="password"><strong><s:text name="loyauty.common.text.short.password" />:</strong></label>
        <s:password id="password" 
        			 name="password" 
        			 maxlength="12" 
        			 cssStyle="width:130px;"/>
        <div id="passwordError" style="display:none"></div>
        <br />
        <div class="on-2 columns same-height" style="margin:10px 20px 0px 120px;">
          <div class="fixed column">
          	<div class="vertical-center">
          		<s:submit name="submit" value="%{getText('loyauty.common.title.signIn')}" cssStyle="padding:3px 10px 3px 10px;"/>
          	</div>
          </div>
        <div class="fixed column">
          <div class="vertical-center pb20"><a id="lostPasswrd" href="lostUserOrPwd.do"><s:text name="loyauty.common.text.long.lostUserOrPwd" />?</a></div></div>
        </div>
      </fieldset>
    </s:form>
  </div>
  <div style="padding:15px 20px 15px 20px;" class="gray_bg"><strong><s:text name="loyauty.common.text.long.dontHaveAccount" />? <a id="createAccount" href="createProfilePop.do"><s:text name="loyauty.common.title.createProfile" />!</a></strong></div>
</div>

<script type="text/javascript">

$('#createAccount').fancybox($.extend({'onComplete' : function() {
											$.fancybox.resize();						
									  	}
									  }
									  , LoyaltyDatatableTypes.AjaxNoCache)
							);

$('#lostPasswrd').fancybox($.extend({'onComplete' : function() {
										$.fancybox.resize();						
										}
									}
									, LoyaltyDatatableTypes.AjaxNoCache)
							);

var requiredMessage = '<s:text name="loyauty.error.common.required" />';
var VanadiumRules = {
		username: [
			'only_on_blur',
			['advice','usernameError'],
			{validator:'required', invalidCustomMessage: requiredMessage}
		],
		password: [
			'only_on_blur',
			['advice','passwordError'],
			{validator:'required', invalidCustomMessage: requiredMessage}
		],
		formContainer: 'container'
	};

jQuery(document).ready(function () {
	
	Vanadium.loadAndInit( function() {
							$.fancybox.resize();
						  });
	
	VanadiumForm.handleSubmit($("#form"), true, function(hasErrors,hasGlobalErrors,response,ajaxStatus) {
			 								  if ( ajaxStatus == 'success' ) {
													if (!hasGlobalErrors) {
														$("#globalAdvice").removeClass("global-vanadium-advice")
																		  .html('<strong>Login success</strong>').show();
														window.setTimeout('document.location = "/loyaltySourceAdmin/homePage.do";',900);
													} else {
														// the vanadium framework has written errors message in div.#globalAdvice, so show it
														$("#globalAdvice").addClass("global-vanadium-advice").show();
													}
													$.fancybox.resize();
												}
											  },"globalAdvice");
	
});
	   
	
</script>