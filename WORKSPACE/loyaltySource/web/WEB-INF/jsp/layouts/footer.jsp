<%@ taglib uri="/struts-tags" prefix="s" %>


<s:if test="#isLogin">
	<jsp:include page="footerLoggedFragment.jsp" />
</s:if>
<s:else>
	<jsp:include page="footerNotLoggedFragment.jsp" />
</s:else>
