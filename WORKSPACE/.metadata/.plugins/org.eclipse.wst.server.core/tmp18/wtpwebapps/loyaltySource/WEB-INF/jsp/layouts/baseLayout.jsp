<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>
		<tiles:insertAttribute name="title" />
	</title>
	<tiles:insertAttribute name="keywords" />
	<tiles:insertAttribute name="description" />
<link href="stylesheets/elastic.css" rel="stylesheet" type="text/css" />
<link href="stylesheets/main.css" rel="stylesheet" type="text/css" />
<link href="css/dropdown.css" rel="stylesheet" type="text/css" />
<link href="css/default.ultimate.css" rel="stylesheet" type="text/css" />
<link href="css/autocompleter.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/articles.css" type="text/css" />
<!-- Add favicon -->
<link href="images/favicon.png" rel="icon" />
<!-- Add favicon  -->

<!-- ======================================================================== -->
	<script type="text/javascript" src="scripts/jquery-1.6.4.js"></script>
<!-- ======================================================================== -->

<!-- <script type="text/javascript" src="scripts/jquery-1.4.4.min.js"></script> -->
<script type="text/javascript" src="scripts/elastic.js" charset="utf-8"></script>
<script type="text/javascript" src="scripts/stlib.js"></script>
<script type="text/javascript" src="scripts/jquery.dropdown.js" ></script>	
<script type="text/javascript" src="scripts/jquery.truncator.js" ></script>
<script type="text/javascript" src="scripts/jquery-autocompleter.js" ></script>

<jsp:include page="applicationVariablesFragment.jsp" />
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
	<script type="text/javascript">
		$(document).ready(function() {
			// don't refresh elastic framework on resize otherwise page resize will be very slow
			// use refresh() function when we need to do it 
			Elastic.configuration.refreshOnResize = false;  
		});
	</script>
</head>

<body>
<!-- ClickTale Top part -->
<script type="text/javascript">
var WRInitTime=(new Date()).getTime();
</script>
<!-- ClickTale end of Top part -->

<div>
<div style="width:999px;margin:0 auto;">
<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="left" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
    </div>
</div>
<!-- ClickTale Bottom part -->
<div id="ClickTaleDiv" style="display: none;"></div>
<script type="text/javascript">
if(document.location.protocol!='https:')
  document.write(unescape("%3Cscript%20src='http://s.clicktale.net/WRd.js'%20type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
if(typeof ClickTale=='function') ClickTale(5213,1,"www14");
</script>
<!-- ClickTale end of Bottom part -->

<!-- google analytics-->
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-332108-4']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
<!-- google analytics-->
</body>
</html>