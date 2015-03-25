<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 184px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width:900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 50px 0px 0px 100px; }
td:empty { display: none; }
</style>

<div class="pop_title">Product Updated Successfully</div>
<s:if test="hasActionErrors()">
<div id="globalAdvice" class="gray_bg global-vanadium-advice">
<s:iterator value="actionErrors">
<span><s:property escape="false" /></span><br/>
</s:iterator></div>
</s:if>
<div id="formContainer">
	    <s:hidden id="brand" name="brand"/>
    	<s:hidden id="category" name="category"/>

<fieldset style="border:0;margin-top:20px;">
        <TABLE border="1" bordercolor="lightgrey" width="700px">
        <TR>
          <!--Loyalty Product ID-->
            <TH>Loyalty Source Product ID:</TH>
            <TD><s:property value="loyaltyProductId" /></TD>
        <!--Loyalty Product ID-->
        </TR>
        <TR>
        </TABLE>
<BR>        
     <TABLE border="1" bordercolor="lightgrey" width="700px">        
        <TR>        
        <!--Name ENGLISH-->
            <TH>Name - ENGLISH:</TH>
            <TD><s:property value="nameEn"/></TD>
        <!--Name ENGLISH-->
        </TR>
        <TR>
        <!--Name FRENCH-->
            <TH>Name - FRENCH:</TH>
            <TD><s:property value="nameFr"/></TD>
        <!--Name FRENCH-->
        </TR>        
        <TR>
        </TABLE>
<BR>
        <TABLE border="1" bordercolor="lightgrey" width="700px">
        <TR>
        <!--Description ENGLISH-->
            <TH>Description - ENGLISH:</TH>
            <TD><s:text name="%{descriptionEn}"/></TD>
        <!--Description ENGLISH-->
        </TR>
        <TR>
        <!--Description FRENCH-->
            <TH>Description - FRENCH:</TH>
            <TD><s:text name="descriptionFr"/></TD>
        <!--Description FRENCH-->
        </TR>
        <TR>
        <!--SPECS ENGLISH-->
            <TH>Specs - ENGLISH:</TH>
            <TD><s:text name="specificationEn"/></TD>
        <!--SPECS ENGLISH-->
        </TR>
        <TR>
        <!--SPECS FRENCH-->
            <TH>Specs - FRENCH:</TH>
            <TD><s:text name="specificationFr"/></TD>
        <!--SPECS FRENCH-->
        </TR>
        <TR>
        <!--OTHERS ENGLISH-->
            <TH>Others - ENGLISH:</TH>
            <TD><s:text name="otherEng"/></TD>
        <!--OTHERS ENGLISH-->
        </TR>
        <TR>
        <!--OTHERS FRENCH-->
            <TH>Others - FRENCH:</TH>
            <TD><s:text name="otherFr"/></TD>
        <!--OTHERS FRENCH-->
        </TR>
        <TR>
        <!--NOTE-->
            <TH>Note:</TH>
            <TD><s:text name="note"/></TD>
        <!--NOTE-->
        </TR>
    </TABLE>
</fieldset>
<!-- Buttons -->
<TABLE BORDER="0" WIDTH="700px">
	<TR><TD>
		<center>
		<s:form name="List" action="getProductList.do">
     	<s:hidden id="signalAUSucessHid" name="signalAUSucessHid" value="" />
     	<s:hidden id="brandIDAUSucessHid" name="brandIDAUSucessHid" value="" />
     	<s:hidden id="categoryIDAUSucessHid" name="categoryIDAUSucessHid" value="" />		
		    <input id="productListAUSuccessButton" name="productListAUSuccessButton" 
		    	type="submit" value="Product List"
		        style="padding:5px 10px;font-size:20px;" />
		</s:form>		
		</center>
	</TD></TR>
</TABLE>
<!-- Buttons -->
</div>

<script type="text/javascript">
    $("#productListAUSuccessButton").click(function() {
        var signalAUSuccess = -1100;   // A unique value
        $("#signalAUSucessHid").attr('value', signalAUSuccess);
        var bAUSuccess = <s:property value="brand"/>;
        var cAUSuccess = <s:property value="category"/>;
        $("#brandIDAUSucessHid").attr('value', bAUSuccess);
        $("#categoryIDAUSucessHid").attr('value', cAUSuccess);
    });
</script>