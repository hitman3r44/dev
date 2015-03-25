<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 100px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width: 900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 50px 0px 0px 100px; }
td:empty { display: none; }
<!--[if IE]>
input { padding: 2px 0px 2px 2px !important; }
<![endif]-->
</style>

<div class="pop_title" style="margin-top:30px;">View Brand</div>
    <s:if test="hasActionErrors()">
    <div id="globalAdvice" class="gray_bg global-vanadium-advice">
    <s:iterator value="actionErrors">
    <span><s:property escape="false" /></span><br/>
    </s:iterator></div>
    </s:if>

<div id="formContainer" >
<fieldset>
<TABLE border="1" bordercolor="lightgrey" width="450px">
    <TR>
    <!--Name ENGLISH-->
        <TH>Name:</TH>
        <TD><s:property value="name"/></TD>
    <!--Name ENGLISH-->
    </TR>
    <TR>
    <!--Code-->
        <TH>Code:</TH>
        <TD><s:property value="code"/></TD>
    <!--Code-->
    </TR>
    <TR>
        <TH>Image:</TH>
        <!-- <input type="file" name="productImage" size="31" /> .PNG .JPEG  -->
        <TD><s:if test="%{imgDTO != null}">
            <div class="hcenter" style="padding-top:10px;">
            <div id="cover_image_1" class="hcenter"><img src="${brand}<s:property value="imgDTO.name" />" />
            </div>
            <div style="margin-top:3px;">Current Size:</div>
            <span id="img_dim_1"><s:property value="imgDTO.width" /> x
            <s:property value="imgDTO.height" /> -
            <s:property value="imgDTO.size" />kb</span>
            </div>
            </s:if>
        </TD>
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
<!-- Common use Html Button. Needs to change if the page URL is changed as well. -->
<TABLE border="0" width="450px">
	<TR><TD>
	<center><input type="submit" value="OK" onclick="location.href='commonList.do?pageType=6'"
        style="padding:5px 10px;font-size:20px;" /></center>
    </TD></TR>
</TABLE>
<!-- Buttons -->
</div>