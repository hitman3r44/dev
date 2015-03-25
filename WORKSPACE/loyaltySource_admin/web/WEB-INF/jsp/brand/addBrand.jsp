<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label { width: 125px; }
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
</style>

<div class="unit" style="width:875px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Add a Brand</div>
    <s:if test="hasActionErrors()">
    <div id="globalAdvice" class="gray_bg global-vanadium-advice">
    <s:iterator value="actionErrors">
    <span><s:property escape="false" /></span><br/>
    </s:iterator></div>
    </s:if>

<div id="formContainer" >
<s:form id="form" action="saveBrand.do" method="post" validate="true" enctype="multipart/form-data">
<s:token></s:token>
<fieldset>
<!-- Name -->
    <label for="accept_team_members">Name:</label>
    <s:textfield id="name" name="name" maxlength="120" cssStyle="width:150px;"/>
    <span id="nameEn_Error" style="display:none;margin-left:2px;"></span>
<!-- Name -->
<br>
    <label for="Categories Group">Categories Group: </label>
    <s:checkboxlist label="Categories Group"
            id="categoryGroupListLong"
            name="categoryGroupListLong"
            cssStyle="width:126px;"
            listKey="id"
            theme="checkbox-fix"
            listValue="%{getText(name)}"
            list="categoryGroupList">
    </s:checkboxlist>
<br>
<!-- Code -->
    <label for="accept_team_members">Code:</label>
    <s:textfield id="code" name="code" maxlength="10" cssStyle="width:100px;"/>
    <span id="code_Error" style="display:none;margin-left:2px;"></span>
<!--Code-->
<br>
<!--Satisfaction-->
    <label for="accept_team_members">Satisfaction:</label>
    <s:textfield id="satisfactId" name="satisfact" maxlength="120" cssStyle="width:100px;"/>
    <span id="code_Error" style="display:none;margin-left:2px;"></span>
<!--Satisfaction-->
<br>	
<!--Coefficient-->
    <label for="accept_team_members">Coefficient:</label>
    <s:textfield id="coefficientId" name="coefficient" maxlength="120" cssStyle="width:100px;"/>
    <span id="code_Error" style="display:none;margin-left:2px;"></span>
<!--Coefficient-->
<br>
<!--Description-->
    <label for="accept_team_members">Description:</label>
        <s:textarea id="description" name="description" cssClass="ckeditor ckEN" />
    <span id="specificationEn_Error" style="display:none;margin-left:2px;"></span>
<!--Description-->
<br>
<!--Image-->
    <p style="text-decoration:underline;font-weight:bold;">
    	Reminder : The brand logo must be 
    	<span style="color:darkred;">
    		<s:property value="@com.loyauty.web.WebConstants@WIDTH_BRAND_MAX"/>
    	</span> by
    	<span style="color:darkred;">
    		<s:property value="@com.loyauty.web.WebConstants@WIDTH_BRAND_MAX"/>
    	</span> pixels.
    </p>
    <label for="accept_team_members">Brand IMAGE:</label>
    <!-- <input type="file" name="productImage" size="31" /> .PNG .JPEG  -->
    <s:file name="brandImage" size="31" />.PNG .JPEG
    
<!--Image-->
<br>
    <input type="submit" value="Add Brand"
        style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
</fieldset>
</s:form>
</div>
</div>

<script type="text/javascript">
    $(document).ready(function() {

        var requiredMessage = '<s:text name="loyauty.error.common.required" />';
        var vanadiumAdv = "vanadium-advice -vanadium-empty-advice- vanadium-invalid";
        var VanadiumRules = {
            name: [
                'only_on_blur',
                ['advice','nameEn_Error'],
                {validator:'required', invalidCustomMessage: requiredMessage}
            ],
           description: [
                    'only_on_blur',
                    ['advice','descriptionEn_Error'],
                    {validator:'required', invalidCustomMessage: requiredMessage}
            ],
            formContainer: 'container'
        };

	initRichEditorWhenReady();
	
	/*----------------------------- Coefficients Validation  --------------------------------- 
								accept juste numbers format
	  ----------------------------------------------------------------------------------------*/
	$("#formContainer #satisfactId,#coefficientId").blur( function(){
		var index=$("#formContainer #satisfactId").index(this);
		var satisfact;
		var coefficient;
		if(index>=0){
			satisfact=$("#formContainer #satisfactId").val();
			var value = parseFloat(satisfact).toFixed(2);
			 $("#formContainer #satisfactId").css("backgroundColor","white");
			if (!isNumber(satisfact) || value > 100 || value < 0) {
				$("#formContainer #satisfactId").val("0");
				$("#formContainer #satisfactId").css("backgroundColor","#FF6666");
			}
		}
		index=$("#formContainer #coefficientId").index(this);
		if(index>=0){
			coefficient=$("#formContainer #coefficientId").val();
			 $("#formContainer #coefficientId").css("backgroundColor","white");
			if (!isNumber(coefficient)) {
				$("#formContainer #coefficientId").val("0");
				$("#formContainer #coefficientId").css("backgroundColor","#FF6666");
			}
		}
	}); 
	
	/*----------------------------- Test value is numeric  ----------------------------------- 
								return false if is not numeric
	  ----------------------------------------------------------------------------------------*/
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}
	
	});
	
  </script>