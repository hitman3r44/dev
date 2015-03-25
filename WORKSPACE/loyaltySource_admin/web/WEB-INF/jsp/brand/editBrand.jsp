<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label { width:125px; }
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
</style>

<div class="unit" style="width:875px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">View Brand - <s:property value="name" /></div>
    <s:if test="hasActionErrors()">
    <div id="globalAdvice" class="gray_bg global-vanadium-advice">
    <s:iterator value="actionErrors">
    <span><s:property escape="false" /></span><br>
    </s:iterator></div>
    </s:if>
<!-- Brand Logo -->
<div style="float:right;">
    <div class="image" style="margin-left:2px;width:100px;">
        <s:if test="%{imageDTO!=null}">
            <img width="100" height="100" src="${brand}<s:property value="imageDTO.name" />" />
            <div style="margin-top:2px;">Current Size:</div>
                <span id="img_dim_1"><s:property value="imageDTO.width" /> x
                <s:property value="imageDTO.height" /> -
                <s:property value="imageDTO.size" />kb</span>
        </s:if>
    </div>
    <div id="file-uploader" style="text-align:center"></div>
    <div id="messageUpload" style="width:200px;"></div>
</div>
<!-- Brand Logo -->

<div id="formContainer" >
<s:form id="form" action="confirmEditBrand.do" method="post" validate="true" enctype="multipart/form-data">
<s:hidden id="brandId" name="brandId"/>
<s:hidden id="imageId" name="imageId"/>
<s:token></s:token>
<fieldset>
<!-- Name -->
    <label for="accept_team_members">Name:</label>
    <s:textfield id="name" name="name" maxlength="120" cssStyle="width:250px;"/>
    <span id="name_Error" style="display:none;margin-left:2px;"></span>
<!--Name-->
<br>
<!-- Category Group List -->
    <label for="Categories Group">Categories Group:</label>
    <s:checkboxlist label="Categories Group"
            id="categoryGroupListLong"
            name="categoryGroupListLong"
            cssStyle="width:90px;" listKey="id"
            theme="checkbox-fix"
            listValue="%{getText(name)}"
            list="categoryGroupList">
    </s:checkboxlist>
<!-- Category Group List -->
<br>
<!--Code-->
    <label for="accept_team_members">Code:</label>
    <s:textfield id="code" name="code" maxlength="120" cssStyle="width:100px;"/>
    <span id="code_Error" style="display:none;margin-left:2px;"></span>
<!--Code-->
<br>
<!--Satisfaction-->
    <label for="accept_team_members">Satisfaction:</label>
    <s:textfield id="satisfactId" name="satisfact" maxlength="120" cssStyle="width:100px;"/>
    <span id="code_Error" style="display:none;margin-left:2px;"></span>
<!--Satisfaction-->
<br>	

<!--Description-->
    <label for="accept_team_members">Description:</label>
    <s:textarea id="description" name="description" cssClass="ckeditor ckEN"></s:textarea>
    <span id="description_Error" style="display:none;margin-left:2px;"></span>
<!--Description-->
<br>
    <s:if test='%{#session.usr == "menu"}' >
    <input type="submit" value="Update Brand"
        style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
    </s:if>
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
	   			['advice','name_Error'],
	   			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		description: [
	  				'only_on_blur',
	  				['advice','description_Error'],
	  				{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],  
	   	    formContainer: 'container'
	  	};
		
	 	initRichEditorWhenReady();
		
		var brandId = $("#brandId").val();
		var imageId = $("#imageId").val();

		 var uploader = new qq.FileUploader({
		        // pass the dom node (ex. $(selector)[0] for jQuery users)
		        element: document.getElementById('file-uploader'),
		        // path to server-side upload script 
		        action: 'ajax/uploadImage.do',
		        //add params
		        params: {},
		        debug: true,
		        onSubmit: function(id, fileName){
		            uploader.setParams({brandId: brandId, imageId: imageId});          
		        },
		        onComplete: function(id, fileName, res){                    
		            $(".qq-upload-list").empty();      
		        	if( res.success === true ) {
		        		$("#messageUpload").removeClass(vanadiumAdv).hide();
						var app = '<div class="hcenter" style="padding-top:10px;">' +
								  '<div id="image" class="hcenter"><img width="300" height="300" src="${brand}large/'+res.name+'?_='+new Date().getTime()+'" /></div>'+
								  '<div style="margin-top:3px;">Current Size:</div>'+
								  '<span id="img_dim">'+ res.width +'x' + res.height +' - ' + res.size + 'kb</span></div>';

						$("#imageId").val(res.imageId);
								  
		            	$('.image').html(app);        		         
		        	}
		        	else {                			
		            	$("#messageUpload").removeClass(vanadiumAdv);        
		            	$("#messageUpload").addClass(vanadiumAdv).html("<span>" + res.success + "&nbsp;<a href='http://faq.gamejab.com/node/11' target='_blank'>" + res.msg + "</a></span>").show();                        
		         	}
		        }        
		    });

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
				/*index=$("#formContainer #coefficientId").index(this);
				if(index>=0){
					coefficient=$("#formContainer #coefficientId").val();
					 $("#formContainer #coefficientId").css("backgroundColor","white");
					if (!isNumber(coefficient)) {
						$("#formContainer #coefficientId").val("0");
						$("#formContainer #coefficientId").css("backgroundColor","#FF6666");
					}
				}*/
			}); 
			
			/*----------------------------- Test value is numeric  ----------------------------------- 
										return false if is not numeric
			  ----------------------------------------------------------------------------------------*/
			function isNumber(n) {
				return !isNaN(parseFloat(n)) && isFinite(n);
			}
		 
	});
  
  </script>