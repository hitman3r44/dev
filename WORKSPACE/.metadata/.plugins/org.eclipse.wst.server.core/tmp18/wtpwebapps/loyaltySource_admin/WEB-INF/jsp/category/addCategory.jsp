<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label {
	width:100px;
}
.vanadium-advice {
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}
</style>
<div class="unit" style="width:850px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Add a Category</div>

<s:if test="hasActionErrors()">  
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>  
</s:if>
  <div id="formContainer" >
    <s:form id="form" action="saveCategory.do" method="post" validate="true">
    <s:token></s:token>
      <fieldset>
        <!--Manufacturer Product ID-->
        <label for="accept_team_members">Category Name:</label>        
        <s:textfield id="cat_name" name="categoryName" maxlength="120" cssStyle="width:150px;"/>
        <span id="manufProductID_Error" style="display:none;margin-left:2px;"></span>
        <!--Manufacturer Product ID-->
        <br /><br />
        <!--Brand-->
        <label for="team_name">Category Group:</label>
		<s:select id="categoryGroup" 
        		  name="categoryGroup"
        		  cssStyle="width:156px;"
        		  required="true"
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="value"
        		  listValue="%{getText(localizationKey)}"			    		  
    			  list="categoryGroupList"
    			  /> 
    	<s:hidden id="categoryGroupName" name="categoryGroupName" value="%{categoryGroupList}" />
    	<span id="brand_Error" style="display:none;margin-left:2px;"></span>
         <br /> 
         <label for="team_name">Brand:</label>
		<s:checkboxlist label="Brands: "
         				 id="brand"
         				 name="brand"
         				 theme="checkbox-fix" 
         				 cssStyle="width:156px;"
         				 listKey="id"
        		  		 listValue="%{name}"	
         				 list="brandList"/>
    	<span id="brand_Error" style="display:none;margin-left:2px;"></span>
         <br />
         <!--Description ENGLISH-->
        <label for="accept_team_members">Description :</label><s:textarea id="description" name="description" rows="10" cssStyle="width:500px;"></s:textarea>       
         <span id="descriptionEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Description ENGLISH-->
         <br />
        <input type="submit" value="Add Category" 
        	   style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
      </fieldset>
    </s:form>
  </div>
</div>
  <script type="text/javascript">
  $(document).ready(function() { 
	  initRichEditorWhenReady();
	});
  
  </script>