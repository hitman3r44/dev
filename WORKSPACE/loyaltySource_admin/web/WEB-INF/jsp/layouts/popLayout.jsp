<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<jsp:include page="applicationVariablesFragment.jsp"></jsp:include>

<!-- Add specific css files -->
<tiles:importAttribute name="cssList" scope="request"/>
<s:iterator value="#request.cssList">
   <link rel="stylesheet" type="text/css" href="${css}/<s:property/>" />
</s:iterator>
<!-- Add specific css files -->

<!-- Add specific js files -->
<tiles:importAttribute name="scriptList" scope="request"/>
<s:iterator value="#request.scriptList">
   <script type="text/javascript" src="${scripts}/<s:property/>" charset="utf-8" ></script>
</s:iterator>
<!-- Add specific js files -->

<tiles:insertAttribute name="body" />
