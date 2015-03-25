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

<div class="pop_title">View Product</div>
<s:if test="hasActionErrors()">
<div id="globalAdvice" class="gray_bg global-vanadium-advice">
<s:iterator value="actionErrors">
<span><s:property escape="false" /></span><br/>
</s:iterator></div>
</s:if>
<div id="formContainer">


<fieldset style="border:0;margin-top:20px;">
    <TABLE border="1" bordercolor="lightgrey" width="700px">
        <TR>
        <!--Brand-->
            <TH>Brand:</TH>
            <TD><s:property value="brandName"/></TD>
        </TR>
        <TR>
        <!--Category-->
            <TH>Category:</TH>
            <TD><s:property value="categoryName"/></TD>
        <!--Category-->
        </TR>
        <TR>
        <!--Type-->
            <TH>Type:</TH>
            <TD><s:property value="mainSpecificationName"/></TD>
        <!--Type-->
        </TR>
        <TR>
        <!--Status-->
            <TH>Status:</TH>
            <TD><s:property value="%{getText(statusName)}"/></TD>
        <!--Status-->
        </TR>
        <TR>
        <!--Manufacturer Table-->
            <TH>Manufacturer(s):</TH>
            <TD>
            <TABLE border="1" bordercolor="lightgrey" width="480px" style="padding-left:4px;">
                <TR>
                    <TH style="text-align:center !important">Product ID</TH>
                    <TH style="text-align:center !important">QTY</TH>
                    <TH style="text-align:center !important">Supplier</TH>
                    <TH style="text-align:center !important">Cost</TH>
                </TR>
                <TR>
                <!--Manufacturer Product-->
                    <TD><s:property value="manufProductID"/></TD>
                    <TD align="center"><s:property value="manufProductQuantity"/> </TD>
                    <TD align="center"><s:property value="supplier"/> </TD>
                    <TD align="center"><s:property value="price"/> </TD>
                <!--Manufacturer Product-->
                </TR>
                <TR>
                <!--Manufacturer Product-->
                    <TD><s:property value="manufProductID1"/></TD>
                    <TD align="center"><s:property value="manufProductQuantity1"/></TD>
                    <TD align="center"><s:property value="supplier1"/></TD>
                    <TD align="center"><s:property value="price1"/></TD>

                <!--Manufacturer Product-->
                </TR>
                <TR>
                <!--Manufacturer Product-->
                    <TD><s:property value="manufProductID2"/></TD>
                    <TD align="center"><s:property value="manufProductQuantity2"/></TD>
                    <TD align="center"><s:property value="supplier2"/></TD>
                    <TD align="center"><s:property value="price2"/></TD>
                <!--Manufacturer Product-->
                </TR>
                <TR>
                <!--Manufacturer Product-->
                    <TD><s:property value="manufProductID3"/></TD>
                    <TD align="center"><s:property value="manufProductQuantity3"/></TD>
                    <TD align="center"><s:property value="supplier3"/></TD>
                    <TD align="center"><s:property value="price3"/></TD>
                <!--Manufacturer Product-->
                </TR>
                <TR>
                <!--Manufacturer Product-->
                    <TD><s:property value="manufProductID4"/></TD>
                    <TD align="center"><s:property value="manufProductQuantity4"/></TD>
                    <TD align="center"><s:property value="supplier4"/></TD>
                    <TD align="center"><s:property value="price4"/></TD>
                <!--Manufacturer Product-->
                </TR>
            </TABLE>
            </TD>
        <!--Manufacturer Table-->
        </TR>
        <TR>
        <!--Loyalty Product ID-->
            <TH>Loyalty Source Product ID:</TH>
            <TD><s:property value="loyaltyProductId"/> </TD>
        <!--Loyalty Product ID-->
        </TR>
        <TR>
        <!--Name ENGLISH-->
            <TH>Name - ENGLISH:</TH>
            <TD><s:property value="nameEn"/> </TD>
        <!--Name ENGLISH-->
        </TR>
        <TR>
        <!--Name FRENCH-->
            <TH>Name - FRENCH:</TH>
            <TD><s:property value="nameFr"/> </TD>
        <!--Name FRENCH-->
        </TR>
        <TR>
        <!--Image-->
            <TH>Image:</TH>
            <TD><s:if test="%{imgDTO != null}">
                <div class="hcenter" style="padding-top:10px;">
                <div id="cover_image_1" class="hcenter"><img src="${product}<s:property value="imgDTO.name" />" />
                </div>
                <div style="margin-top:3px;">Current Size:</div>
                <span id="img_dim_1"><s:property value="imgDTO.width" /> X
                <s:property value="imgDTO.height" /> -
                <s:property value="imgDTO.size" />kb</span>
                </div>
                </s:if>
            </TD>
        <!--Image-->
        </TR>
        <TR>
        <!--MSRP-->
            <TH>MSRP:</TH>
            <TD>$ <s:property value="msrp"/> </TD>
        <!--MSRP-->
        </TR>
        <TR>
        <!--OUR COST-->
            <TH>Our Cost:</TH>
            <TD>$ <s:property value="cost"/> </TD>
        <!--OUR COST-->
        </TR>
        </TABLE>
<BR>
        <table border="1" bordercolor="lightgrey" width="700px">
        <thead class="gray_header">
            <tr>
                <TH style="text-align:center !important">Client Name</th>
                <TH style="text-align:center !important">Selling Price</th>
                <TH style="text-align:center !important">Profit %</th>
                <TH style="text-align:center !important">Discount %</th>
                <TH style="text-align:center !important">Excluded</th>
            </tr>
        </thead>
        <s:if test="%{userNameList != null}" >
            <s:if test="%{userNameList.size > 0}" >
        <tbody>
            <s:iterator value="userNameList" status="count">
            <tr>
                <td align="center"><s:property value="login"/></td>
                <td align="center"><s:property value="%{userPrice[#count.index]}"/> </td>
                <td align="center"><s:property value="%{percentageProfit[#count.index]}"/> </td>
                <td align="center"><s:property value="%{percentageDiscount[#count.index]}"/> </td>
                <td align="center">
                    <s:if test='%{excluded[#count.index] == "t"}' >
                    <input  type="checkbox"
                            id="isExcluded" name="isExcluded" checked="checked" disabled="disabled" />
                    </s:if>
                    <s:if test='%{excluded[#count.index] == "f"}' >
                    <input  type="checkbox"
                            id="isExcluded" name="isExcluded" disabled="disabled" />
                    </s:if>
                </td>
            </tr>
            </s:iterator>
        </tbody>
            </s:if>
        </s:if>
        </table>
<BR>
        <TABLE border="1" bordercolor="lightgrey" width="700px">
        <TR>
        <!--BOX SIZE-->
            <TH>Box size (inches):</TH>
            <TD>W <s:property value="width"/> -
                L <s:property value="large"/> -
                H <s:property value="high"/>
            </TD>
        <!--BOX SIZE-->
        </TR>
        <TR>
        <!--WEIGHT-->
            <TH>Weight (lbs):</TH>
            <TD><s:property value="weight"/> kg </TD>
        <!--WEIGHT-->
        </TR>
        <TR>
        <!--Link url-->
            <TH>Link URL:</TH>
            <TD><s:property value="linkUrl"/> </TD>
        <!--Link url-->
        </TR>
        <TR>
        <!--Warranty-->
            <TH>Warranty:</TH>
            <TD><s:if test="%{defectFree == false}">
                <s:property value="warrantyQuantity"/> <s:property value="periodTime"/>
                </s:if>
                <s:if test="%{defectFree == true}">
                Defect Free
                </s:if>
            </TD>
        <!--Warranty-->
        </TR>
        <TR>
        <!--Description ENGLISH-->
            <TH>Description - ENGLISH:</TH>
            <TD><s:text name="%{descriptionEn}"/> </TD>
        <!--Description ENGLISH-->
        </TR>
        <TR>
        <!--Description FRENCH-->
            <TH>Description - FRENCH:</TH>
            <TD><s:text name="descriptionFr"/> </TD>
        <!--Description FRENCH-->
        </TR>
        <TR>
        <!--SPECS ENGLISH-->
            <TH>Specs - ENGLISH:</TH>
            <TD><s:text name="specificationEn"/> </TD>
        <!--SPECS ENGLISH-->
        </TR>
        <TR>
        <!--SPECS FRENCH-->
            <TH>Specs - FRENCH:</TH>
            <TD><s:text name="specificationFr"/> </TD>
        <!--SPECS FRENCH-->
        </TR>
        <TR>
        <!--OTHERS ENGLISH-->
            <TH>Others - ENGLISH:</TH>
            <TD><s:text name="otherEng"/> </TD>
        <!--OTHERS ENGLISH-->
        </TR>
        <TR>
        <!--OTHERS FRENCH-->
            <TH>Others - FRENCH:</TH>
            <TD><s:text name="otherFr"/> </TD>
        <!--OTHERS FRENCH-->
        </TR>
        <TR>
        <!--NOTE-->
            <TH>Note:</TH>
            <TD><s:text name="note"/> </TD>
        <!--NOTE-->
        </TR>
    </TABLE>
</fieldset>
<!-- Buttons -->
<s:hidden id="signalSuccessHid" name="signalSuccessHid" value="" />
<s:hidden id="brandIDSuccessHid" name="brandIDSuccessHid" value="" />
<s:hidden id="categoryIDSuccessHid" name="categoryIDSuccessHid" value="" />
<TABLE BORDER="0" WIDTH="700px">
	<TR><TD>
		<center>
		    <input type="submit" value="OK" onclick="location.href='getProductList.do'"
		        style="padding:5px 10px;font-size:20px;" />
		</center>
	</TD></TR>
</TABLE>
<!-- Buttons -->
</div>

<script type="text/javascript">
    $("#productListSuccessButton").click(function() {
        var signalSuccess = -200;   // A unique value
        $("#signalSuccessHid").attr('value', signalSuccess);
        var bSuccess = <s:property value="brand"/>;
        var cSuccess = <s:property value="category"/>;
        $("#brandIDSuccessHid").attr('value', bSuccess);
        $("#categoryIDSuccessHid").attr('value', cSuccess);
    });
</script>