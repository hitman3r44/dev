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

<div class="pop_title" style="margin-top:30px;">Amend Product - <s:property value="nameEn" /></div>

<s:if test="hasActionErrors()">
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator>
  </div>
</s:if>

  <div id="formContainer" >
    <s:form id="form" action="amendingProduct.do" method="post" validate="true">
    <s:hidden id="productId" name="productId"/>
    <s:hidden id="brand" name="brand"/>
    <s:hidden id="category" name="category"/>
    <s:token />
<fieldset>
        <!--Loyalty Product ID-->
        <label for="accept_team_members">Loyalty Source Product ID:</label>
        <div style="vertical-align:min-height;padding-top:5px;">
        	<a href="/product-ID-<s:property value="productId" />.htm#!" target="_blank" title="Link to LS-Web Page"><s:property value="loyaltyProductId" /></a>
        </div>
        <!--Loyalty Product ID-->
        <br />
        <!--Name ENGLISH-->
        <label for="accept_team_members">Name - ENGLISH:</label>
        <s:textfield id="nameEn" name="nameEn" maxlength="75" cssStyle="width:400px;"/>
        <span id="nameEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Name ENGLISH-->
        <br />
        <!--Name FRENCH-->
        <label for="accept_team_members">Name - FRENCH:</label>
        <s:textfield id="nameFr" name="nameFr" maxlength="75" cssStyle="width:400px;"/>
         <span id="nameFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Name FRENCH-->
        <br />
        <!--Description ENGLISH-->
        <label for="accept_team_members">Description - ENGLISH:</label>
        <s:textarea id="descriptionEn" name="descriptionEn" cssClass="ckeditor ckEN" />
         <span id="descriptionEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Description ENGLISH-->    
        <br />
        <!--Description FRENCH-->
        <label for="accept_team_members">Description - FRENCH:</label>
        <s:textarea id="descriptionFr" name="descriptionFr" cssClass="ckeditor ckFR" />
         <span id="descriptionFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Description FRENCH-->   
        <br />
        <!--SPECS ENGLISH-->
        <label for="accept_team_members">Specs - ENGLISH:</label>
        <s:textarea id="specificationEn" name="specificationEn" cssClass="ckeditor ckEN" />
         <span id="specificationEn_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS ENGLISH-->
        <br />
        <!--SPECS FRENCH-->
        <label for="accept_team_members">Specs - FRENCH:</label>       
        <s:textarea id="specificationFr" name="specificationFr" cssClass="ckeditor ckFR" />
         <span id="specificationFr_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS FRENCH-->        
        <br />  
        <!--OTHERS ENGLISH-->
        <label for="accept_team_members">Others - ENGLISH:</label>
        <s:textarea id="otherEng" name="otherEng" cssClass="ckeditor ckEN" />
         <span id="otherEng_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS ENGLISH-->        
        <br />
        <!--OTHERS FRENCH-->
        <label for="accept_team_members">Others - FRENCH:</label>       
        <s:textarea id="otherFr" name="otherFr" cssClass="ckeditor ckFR" />
         <span id="otherFr_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS FRENCH-->        
        <br />
        <!--NOTE-->
        <label for="accept_team_members" style="float:none;">Note:</label>       
        <s:textarea id="note" name="note" rows="10" cssStyle="width:600px;"></s:textarea>
        <!--NOTE-->        
        <br />
       	<input type="submit" value="Update Product" 
       	   	   style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>	
      </fieldset>
    </s:form>
    
     <s:form name="frm" action="getProductList.do">
     	<s:hidden id="signalAUHid" name="signalAUHid" value="" />
     	<s:hidden id="brandIDAUHid" name="brandIDAUHid" value="" />
     	<s:hidden id="categoryIDAUHid" name="categoryIDAUHid" value="" />	
     	<input id="productListButton" name="productListButton" type="submit" value="Product List" 
     			style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;" />
    </s:form>

    
  </div>
</div>
  <script type="text/javascript">

  $(document).ready(function() {
	  initRichEditorWhenReady();
	
	  var requiredMessage = '<s:text name="loyauty.error.common.required" />';
	  var vanadiumAdv = "vanadium-advice -vanadium-empty-advice- vanadium-invalid";
	  var VanadiumRules = {
	  		nameEn: [
	   			'only_on_blur',
	   			['advice','nameEn_Error'],
	   			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		nameFr: [
				'only_on_blur',
				['advice','nameFr_Error'],
				{validator:'required', invalidCustomMessage: requiredMessage}
	  		],  
	  	   descriptionEn: [
	  			'only_on_blur',
	  			['advice','descriptionEn_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],  
	   	   descriptionFr: [
	   			'only_on_blur',
	   			['advice','descriptionFr_Error'],
	   			{validator:'required', invalidCustomMessage: requiredMessage}
	   	  	], 
	   	   specificationEn: [
	  	  		'only_on_blur',
	  	  		['advice','specificationEn_Error'],
	  	  		{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	], 
	  	    specificationFr: [
	  			'only_on_blur',
	  			['advice','specificationFr_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],
		  	otherEng: [
		 		'only_on_blur',
		 	  	['advice','otherEng_Error'],
		 		{validator:'required', invalidCustomMessage: requiredMessage}
			], 
		 	otherFr: [
		 		'only_on_blur',
		 	  	['advice','otherFr_Error'],
		 	  	{validator:'required', invalidCustomMessage: requiredMessage}
		 	],   	    	  	  	  	    	    	  	  	  					
	  		formContainer: 'container'
	  	};
				
		var productId = $("#productId").val();
  	});  
		
 	$("#productListButton").click(function() {
 	 	var signal = -1000;	// A unique value 
 	 	$("#signalAUHid").attr('value', signal);
 	 	var brand = $("#brand").val();
 	 	var category = $("#category").val();
 	 	$("#brandIDAUHid").attr('value', brand);
 	 	$("#categoryIDAUHid").attr('value', category); 	 	
	 });
 	
  </script>
  
  