<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 125px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width: 900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 50px 0px 0px 100px; }
td:empty { display: none; }
</style>

<div class="pop_title" style="margin-top:30px;">View Category</div>
<div id="formContainer">
<s:token></s:token>
<fieldset>
<TABLE border="1" bordercolor="lightgrey" width="450px">
<TR>
<!--Name ENGLISH-->
        <TH>Category Name:</TH>
        <TD><s:property value="categoryName"/></TD>
<!--Name ENGLISH-->
</TR>
<TR>
<!--Name ENGLISH-->
        <TH>Category Group:</TH>
        <TD><s:property value="%{getText(categoryGroupName)}" /></TD>
<!--Name ENGLISH-->
</TR>
<TR>
    <TH>Brand List:</TH>
    <TD>
    <TABLE width="80%" style="margin-left:10px;">
        <s:iterator value="brandsName" status="status">
            <s:if test='%{#status.index % 2 == 0}' >
	            </tr><tr>
		    </s:if>
            <td><s:text name="name"></s:text></td>
        </s:iterator>
    </TABLE>
    </TD>
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
	<center><input type="submit" value="OK" onclick="location.href='commonList.do?pageType=7'"
    				style="padding:5px 10px;font-size:20px;"/></center>
    </TD></TR>
</TABLE>
<!-- Buttons -->
</div>