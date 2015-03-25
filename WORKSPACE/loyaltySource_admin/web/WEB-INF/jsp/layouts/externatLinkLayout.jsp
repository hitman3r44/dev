<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="applicationVariablesFragment.jsp" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>
		<tiles:insertAttribute name="title" />
	</title>
	<tiles:insertAttribute name="keywords" />
	<tiles:insertAttribute name="description" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />	
	<meta name="robots" content="index,follow" />
	<link rel="stylesheet" type="text/css" href="${css}/elastic.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="${css}/main.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="${css}/dropdown.css" media="screen" />
	<link rel="stylesheet" type="text/css" href="${css}/default.ultimate.css" media="screen" />
	<!-- Add specific css files -->
	<tiles:importAttribute name="cssList" scope="request"/>
	<s:iterator value="#request.cssList">
	   <link rel="stylesheet" type="text/css" href="${css}/<s:property/>" />
	</s:iterator>

	<!-- Add specific css files -->

	
	<!-- ======================================================================== -->
		<script type="text/javascript" src="scripts/jquery-1.6.4.js"></script> 
	<!-- ======================================================================== -->

	<!-- <script type="text/javascript" src="${scripts}/jquery-1.4.4.min.js"></script>-->
	<script type="text/javascript" src="${scripts}/elastic.js" charset="utf-8"></script>
	<script type="text/javascript" src="${scripts}/jquery.dropdown.js" ></script>

	<!-- Add specific js files -->
	<tiles:importAttribute name="scriptList" scope="request"/>
	<s:iterator value="#request.scriptList">
	   <script type="text/javascript" src="${scripts}/<s:property/>" charset="utf-8" ></script>
	</s:iterator>
	
	<script type="text/javascript">
		$(document).ready(function() {
			// don't refresh elastic framework on resize otherwise page resize will be very slow
			// use refresh() function when we need to do it 
			Elastic.configuration.refreshOnResize = false;  
		});
	</script>
	
	
</head>

	<tiles:insertAttribute name="body" />
	
</html>