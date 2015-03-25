<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", -1); // Proxies.
%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		
	<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="-1" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />	
	<meta name="robots" content="index,follow" />
	<link rel="stylesheet" type="text/css" href="${css}/elastic.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="${css}/main.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="${css}/dropdown.css" media="screen" />
	<link rel="stylesheet" type="text/css" href="${css}/default.ultimate.css" media="screen" />
	<link rel="stylesheet" type="text/css" href="${css}/autocompleter.css"  />
	
	<!-- Add favoicon -->
	<link rel="shortcut icon" href="./images/favicon.ico"/>
	<link rel="icon" type="image/gif" href="./images/animated_loyalty.gif"/>
	<!-- Add favoicon  -->
	
	<!-- ======================================================================== -->
		<script type="text/javascript" src="scripts/jquery-1.6.4.js"></script>
	<!-- ======================================================================== -->

	<!-- <script type="text/javascript" src="${scripts}/jquery-1.4.4.min.js"></script> -->
	<script type="text/javascript" src="${scripts}/elastic.js" charset="utf-8"></script>
	<script type="text/javascript" src="${scripts}/jquery.dropdown.js" ></script>
	<script type="text/javascript" src="${scripts}/jquery.truncator.js" ></script>
	<script type="text/javascript" src="${scripts}/jquery-autocompleter.js" ></script>

	<script type="text/javascript">
		$(document).ready(function() {
			// don't refresh elastic framework on resize otherwise page resize will be very slow
			// use refresh() function when we need to do it 
			Elastic.configuration.refreshOnResize = false;  
		});
	</script>
	
	
</head>
<body>
	
	<tiles:insertAttribute name="body" />
	
</body>
</html>