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
<div class="pop_title" style="margin-top:30px;">Edit - Main Specification</div>

<s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>  
</s:if>
  <div id="formContainer" >
    <s:form id="form" action="editMainSpecification.do" method="post" validate="true">
    <s:token></s:token>
      <fieldset>      	
      	<s:hidden name="specificationId" value="%{specificationId}"></s:hidden>
      	
      	<!--Manufacturer Product ID-->
        <label for="accept_team_members">Disable Specification:</label>   
        <s:checkbox name="disable"/>
        <br /><br />
        <!--Manufacturer Product ID-->
        <label for="accept_team_members">Specification Name:</label>        
        <s:textfield id="cat_name" name="specificationName" maxlength="120" cssStyle="width:150px;"/>
        <span id="manufProductID_Error" style="display:none;margin-left:2px;"></span>
        <!--Manufacturer Product ID-->
        <br /><br />
        <!--Brand-->
        <label for="team_name">Category :</label>
		<s:select id="category" 
        		  name="category"
        		  cssStyle="width:156px;"
        		  required="true"
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="id"
        		  listValue="%{name}"		    		  
    			  list="categoryList"
    			  /> 
    	<s:hidden id="categoryName" name="categoryName" value="%{categoryName}"/>
    	<span id="brand_Error" style="display:none;margin-left:2px;"></span>
        <br /><br />    
        <!--Name ENGLISH-->
        <label for="accept_team_members">Name - ENGLISH:</label>        
        <s:textfield id="nameEn" name="nameEn" maxlength="120" cssStyle="width:250px;"/>
        <span id="nameEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Name ENGLISH-->
        <br /><br />
        <!--Name FRENCH-->
        <label for="accept_team_members">Name - FRENCH:</label>
        <s:textfield id="nameFr" name="nameFr" maxlength="120" cssStyle="width:250px;"/>
         <span id="nameFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Name FRENCH-->
        <br /><br />
        <!--Description-->
        <label for="accept_team_members">Description:</label>
        <s:textarea id="description" name="description" cssClass="ckeditor ckEN" />
         <span id="specificationEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Description-->
         <br />
         
        <s:if test='%{#session.usr == "menu"}' > 
        <input type="submit" value="Edit Type" 
        	   style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
        </s:if> 	
      </fieldset>
    </s:form>
  </div>
</div>
  <script type="text/javascript">

  $(document).ready(function() { 
	    initRichEditorWhenReady();

		$('#categoryName').val($('#category option:selected').text());	
	});
  
  </script>