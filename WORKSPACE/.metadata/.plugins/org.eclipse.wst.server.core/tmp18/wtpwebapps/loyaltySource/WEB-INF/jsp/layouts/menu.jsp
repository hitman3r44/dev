<%@ taglib uri="/struts-tags" prefix="s" %>

<s:if test="#isLogin">
	<jsp:include page="menuLoggedFragment.jsp" />
</s:if>
<s:else>
	<jsp:include page="menuNotLoggedFragment.jsp" />
</s:else>
