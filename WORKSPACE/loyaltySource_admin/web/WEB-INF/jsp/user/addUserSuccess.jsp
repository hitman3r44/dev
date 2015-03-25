<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 184px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width: 900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 30px 0px 0px 100px; }
td:empty { display: none; }
</style>

<div class="pop_title"><s:property value="message"/></div>
    <s:if test="hasActionErrors()">
    <div id="globalAdvice" class="gray_bg global-vanadium-advice">
    <s:iterator value="actionErrors">
    <span><s:property escape="false" /></span><br/>
    </s:iterator></div>
    </s:if>

<div id="formContainer">
<s:token></s:token>
<fieldset style="border:0; margin-top:20px;">
<TABLE border="1" bordercolor="lightgrey" width="450px">
    <TR>
    <!-- Login -->
        <TH>Login:</TH>
        <TD><s:property value="login"/></TD>
    <!-- Login -->
    </TR>
    <TR>
    <!-- Code -->
        <TH>Code:</TH>
        <TD><s:property value="code"/></TD>
    <!-- Code -->
    </TR>
    <TR>
    <!-- Type -->
        <TH>Type:</TH>
        <TD><s:property value="type"/></TD>
    <!-- Type -->
    </TR>
    <TR>
    <!-- Password -->
        <TH>Password:</TH>
        <TD><s:property value="password"/></TD>
    <!-- Password -->
    </TR>
    <TR>
    <!-- Email -->
        <TH>Email:</TH>
        <TD><s:property value="email"/></TD>
    <!-- Email -->
    </TR>
    
    <TR>
    <!-- Client category -->
        <TH>Client category:</TH>
        <TD><s:property value="clientCategoryName"/></TD>
    <!-- Client category -->
    </TR>

    <TR>
    <!-- Active -->
        <TH>Active:</TH>
        <TD><s:property value="active"/></TD>
    <!-- Active -->
    </TR>
    <TR>
    <!-- Real Name -->
        <TH>Real Name:</TH>
        <TD><s:property value="realName"/></TD>
    <!-- Real Name -->
    </TR>
    <TR>
    <!-- Address -->
        <TH>Address:</TH>
        <TD><s:property value="address"/></TD>
    <!-- Address -->
    </TR>
    <TR>
    <!-- Postal Code -->
        <TH>Postal Code:</TH>
        <TD><s:property value="postalCode"/></TD>
    <!-- Postal Code -->
    </TR>
    <TR>
    <!-- Phone -->
        <TH>Phone:</TH>
        <TD><s:property value="phone1"/>-<s:property value="phone2"/>-<s:property value="phone3"/></TD>
    <!-- Phone -->
    </TR>
    <TR>
    <!-- Primary Language -->
        <TH >Primary Language:</TH>
        <TD><s:property value="primaryLanguage"/></TD>
    <!-- Primary Language -->
    </TR>
    <TR>
    <!-- Secondary Language -->
        <TH>Secondary Language:</TH>
        <TD><s:property value="secondaryLanguage"/></TD>
    <!-- Secondary Language -->
    </TR>
    <TR>
    <!-- Shipping Multiplier -->
        <TH>Shipping Multiplier:</TH>
        <TD><s:property value="multiplier"/> %</TD>
    <!-- Shipping Multiplier -->
    </TR>
    <TR>
    <!-- Shipping Insurance Multiplier -->
        <TH>Shipping Insurance Multiplier:</TH>
        <TD><s:property value="shippingInsuranceMultiplier"/> %</TD>
    <!-- Shipping Insurance Multiplier -->
    </TR>
    <TR>
    <!-- Special Handling Name -->
        <TH>Secondary Language:</TH>
        <TD><s:property value="specialHandlingName"/></TD>
    <!-- Special Handling Name -->
    </TR>
    
    <TR>
    <!-- Special Handling Fee -->
        <TH>Special Handling Fee:</TH>
        <TD><s:property value="specialHandlingFee"/></TD>
    <!-- Special Handling Fee -->
    </TR>
    
    <TR>
    <!-- Currency -->
        <TH>Currency:</TH>
        <TD><s:property value="currencyDTO.symbol"/></TD>
    <!-- Currency -->
    </TR>
    
</TABLE>
</fieldset>
<!-- Buttons -->
<TABLE>
	<TR><TD>
		<s:form name="newUser" action="addUser.do">
			<input type="submit" value="Add New User"
		        style="padding:5px 10px;font-size:20px;"/>
		</s:form>
	</TD><TD>
		<input type="submit" value="User List" onclick="location.href='commonList.do?pageType=1'"
      		style="padding:5px 10px;font-size:20px;"/>
	</TD></TR>
</TABLE>
<!-- Buttons -->
</div>
