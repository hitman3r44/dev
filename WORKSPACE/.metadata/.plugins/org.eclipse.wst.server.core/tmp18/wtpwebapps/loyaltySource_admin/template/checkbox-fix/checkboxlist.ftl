<#assign itemCount = 0/>
<#if parameters.list??>
<br>
<table border="1" bordercolor="lightgrey">
    <@s.iterator value="parameters.list">
        <#if itemCount%5 == 0>
            </tr><tr>
        </#if>
        <td style="padding: 5px 10px;">
        <#assign itemCount = itemCount + 1/>
        <#if parameters.listKey??>
            <#assign itemKey = stack.findValue(parameters.listKey)/>
        <#else>
            <#assign itemKey = stack.findValue('top')/>
        </#if>
        <#if parameters.listValue??>
            <#assign itemValue = stack.findString(parameters.listValue)?default("")/>
        <#else>
            <#assign itemValue = stack.findString('top')/>
        </#if>
        <#assign itemKeyStr=itemKey.toString() />
        <input type="checkbox" name="${parameters.name?html}" value="${itemKeyStr?html}" id="${parameters.name?html}-${itemCount}"<#rt/>
                <#if tag.contains(parameters.nameValue, itemKey)>
        checked="checked"<#rt/>
                </#if>
                <#if parameters.disabled?default(false)>
        disabled="disabled"<#rt/>
                </#if>
                <#if parameters.title??>
        title="${parameters.title?html}"<#rt/>
                </#if>
                <#include "/${parameters.templateDir}/simple/scripting-events.ftl" />
                <#include "/${parameters.templateDir}/simple/common-attributes.ftl" />
        />
        &nbsp;${itemValue?html}
        </td>
    </@s.iterator>
</table>
<#else>
  &nbsp;
</#if>
<input type="hidden" id="__multiselect_${parameters.id?html}" name="__multiselect_${parameters.name?html}" value=""<#rt/>
<#if parameters.disabled?default(false)>
 disabled="disabled"<#rt/>
</#if>
 />