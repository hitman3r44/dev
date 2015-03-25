<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 184px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width: 900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 50px 0px 0px 100px; }
td:empty { display: none; }
</style>

<div class="pop_title" style="margin-top:30px;"><s:property value="message"/></div>
<div id="formContainer" >
<s:token></s:token>
<fieldset>
<TABLE border="1" bordercolor="lightgrey" width="450px">
    <TR>
    <!--Name ENGLISH-->
        <TH>Main Specification Name:</TH>
        <TD><s:property value="specificationName"/></TD>
    <!--Name ENGLISH-->
    </TR>
    <TR>
    <!--Name ENGLISH-->
        <TH>Category Name:</TH>
        <TD><s:property value="categoryName"/></TD>
    <!--Name ENGLISH-->
    </TR>
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
    <!--Description ENGLISH-->
        <TH>Description:</TH>
        <TD><s:text name="description"/></TD>
    <!--Description ENGLISH-->
    </TR>
</TABLE>
</fieldset>
<!-- Buttons -->
<TABLE border="0" width="450px">
	<TR><TD>
		<s:form id="Add" action="addMainSpecification.do" method="post">
		    <input type="submit" value="Add Type"
		        style="padding:5px 10px;font-size:20px;"/>
		</s:form>
	</TD><TD>
		<input type="submit" value="Specification List" onclick="location.href='commonList.do?pageType=5'"
  			style="padding:5px 10px;font-size:20px;"/>
	</TD></TR>
</TABLE>
<!-- Buttons -->
</div>