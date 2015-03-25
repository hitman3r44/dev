<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
	.bgColor {
		background-color:#e10404;
	}
</style>
<link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz' rel='stylesheet' type='text/css'>
<!--TOP SHADOW-->
<div style="background-image:url(images/top_side.png); height:28px;"></div>
<!--TOP SHADOW-->
<!--BEGIN MAIN-->
<div style="background-image:url(images/table_bg.png);padding:0px 11px 0px 11px;">
<!-- Begin content inside main div!-->
    <div class="columns">
    <div class="fixed column" style="margin:10px 0px 0px 35px;padding-bottom:26px"><div><img src="images/ls_logo.png" width="348" height="70" /></div>
    <div style="text-align:right;font-size:11px;padding:0px 3px 0px 0px;">Innovative Sourcing and Fulfillment Services</div>
    </div>
    <div class="fixed column" style="width:550px;text-align:right;">
    <div class="topmenulinks" style="padding-top:10px;"><a id="sign_in_link" href="signIn.htm">Client Login</a></div>
    <!-- SEARCH-->
    
    <s:form id="searchResults" action="searchResults.do" method="GET">
	    <div class="columns" style="padding-top:38px;float:right;">
	    	<div class="fixed column">
	    		<s:textfield id="query" name="query" cssStyle="width:220px;height:21px;font-size:12px;padding:2px;"/>
	    		<s:hidden name="searchType"  value="1"></s:hidden>
	    		<s:hidden name="search"  value="true"></s:hidden>
	    	</div>
	    	<div class="fixed column smallbutton" style="padding-left:10px;font-size:16px;">
	    		<!-- <input type="submit" name="search_button" width="56" height="22" id="search_button" value="<s:text name="loyauty.common.text.short.search"/>"/> -->
	    		<a id="searchButton" href="#" style="width:80px;">
	    			SEARCH
	    		</a>
	    	</div>
	    </div>
	</s:form>
	
    <!-- SEARCH-->
    </div>
    </div>
    <!-- TOP MENU-->
    <div id="topMenuGrey" style="clear:both;">
    <div style="padding:1px;background-color:#000;">
    <div class="columns silver_bg_menu">
    	<div class="column fixed nav" style="padding-left:14px;">
    		<ul style="margin:0px;">    			
    			<li style="margin-right:-1px;"><img src="images/sep.png" width="3" height="40" /></li>			
    			<li id="nav-home"><a id="home" href="homePage.htm" title="Return to the Homepage">Home</a></li>    						    
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>    			
    			<li id="nav-services"><a id="services" href="services.htm" title="Services we Offer">Services</a></li>    			
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>    			
    			<li id="nav-products"><a id="products" href="ourProducts.htm" title="Our Product Catalogue">Products</a></li>    			
   			 	<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>   			 	
    			<li id="nav-brands"><a id="brands" href="ourBrands.htm" title="Complete list of Brands we carry">Brands</a></li>    			    
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>    			
    			<li id="nav-contact"><a id="contacts" href="contactUs.htm" title="Contact Us">Contact</a></li>    			  
				<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>
    		</ul>
		</div>
	</div>
   </div> 
    </div>
    <!-- TOP MENU-->
    
    <!-- SUB MENU-->
<!--
    <div id="topMenuRed" style="clear:both;" class="subnavbg">
    <div class="subnav" style="height:37px;">
    <ul style="margin:0px;">
    
<li id="nav-apparel" style="margin-left:26px;"><a id="link1" href="Apparel.htm" title="Apparel">Apparel</a></li>
<li id="nav-electronics"><a id="link9" href="Children.htm" title="Children">Children</a></li>
<li id="nav-children"><a id="link2" href="Electronics.htm" title="Electronics">Electronics</a></li>
<li id="nav-gaming"><a id="link3" href="Gaming.htm" title="Gaming">Gaming</a></li>
<li id="nav-cards"><a id="link8" href="GiftCards.htm" title="Gift Cards">Gift Cards</a></li>
<li id="nav-household"><a id="link4" href="Homeworks.htm" title="Household">Homeworks</a></li>
<li id="nav-kitchen"><a id="link5" href="Kitchen.htm" title="Kitchen">Kitchen</a></li>
<li id="nav-outdoors"><a id="link6" href="Outdoors.htm" title="Outdoors">Outdoors</a></li>
<li id="nav-sports"><a id="link7" href="Sports.htm" title="Sports">Sports</a></li>
</ul>
    </div>
    </div>
-->
    <!-- SUB MENU-->
  
  <!--MAIN BODY -->
    <div>
    <!--LEFT MENU-->
    <div class="columns">  
    
<script type="text/javascript">
	$(document).ready(function() {
		$("a#sign_in_link").fancybox();
		
		var autocompleteObj;  
		var onAutocompleteSelect = function(value, data) {	  
		  	$('#searchResults_do').trigger("submit");
		};
		
		var options = {
		    serviceUrl:'searchResults.do',
		    width: 422,
		    delimiter: /(,|;'\'')\s*/,
		    deferRequestBy: 0, //miliseconds
		    noCache: false,
		    minChars: 1, 
		    multiple: true,	  
		    cacheLength: 100,     
		    onSelect: onAutocompleteSelect, 
		    params: { mode:'2' } //aditional parameters
		  };  

		var searchBox = $('input[name=query]');
		searchBox.attr('autocomplete', 'off');
		searchBox.val('');
		//autocompleteObj = searchBox.autocomplete(options);

		$('input#search_button').click(function(){
			var  arratyCharacterNoAllow = ['à','á','â','ä','è','é','ê','ë','ì','í','î','ï','ò','ó','ô','ö','ù','ú','û','ü'];
			var  arratyCharacterAllow   = ['a','a','a','a','e','e','e','e','i','i','i','i','o','o','o','o','u','u','u','u'];

			$.each(arratyCharacterNoAllow, function(i, character){
				$('input#query').val($('input#query').val().replace(character, arratyCharacterAllow[i]));
			});
		});		
	});
	
	$("a#searchButton").click(function() {
		var form = document.forms['searchResults'];
		var val = document.getElementById("query");
		form.action = "/searchResults.do?query" + val.value;
		form.target="";
		form.submit();
	});
	
</script> 

<script type="text/javascript">
	$(document).ready(function() {
		var	catGroupID = <%= session.getAttribute("queryID") %>;
		if (catGroupID == -1) {
			stCollapseSubTree("LSMENUEN",1,0);	// Apparel
			stCollapseSubTree("LSMENUEN",7,0);	// Electronics
			stCollapseSubTree("LSMENUEN",6,0);	// Children
			stCollapseSubTree("LSMENUEN",15,0);	// Gift Cards 
			stCollapseSubTree("LSMENUEN",16,0);	// Homeworks 
			stCollapseSubTree("LSMENUEN",19,0);	// Kitchen 
			stCollapseSubTree("LSMENUEN",24,0);	// Outdoors 	
			stCollapseSubTree("LSMENUEN",26,0);	// Sports 
			stCollapseSubTree("LSMENUEN",28,0);	// Gaming		
		} else {
			$("a#link" + catGroupID).attr('style','background-color:#e10404;');
			switch(catGroupID) {
				case 1:				// Apparel
					stExpandSubTree("LSMENUEN",1,0);
					break;
				case 2:				// Electronics
					stExpandSubTree("LSMENUEN",7,0);
					break;
				case 3:				// Gaming
					stExpandSubTree("LSMENUEN",28,0);
					break;
				case 4:				// Homeworks
					stExpandSubTree("LSMENUEN",16,0);
					break;
				case 5:				// Kitchen
					stExpandSubTree("LSMENUEN",19,0);
					break;
				case 6:				// Outdoors
					stExpandSubTree("LSMENUEN",24,0);
					break;
				case 7:				// Sports
					stExpandSubTree("LSMENUEN",26,0);
					break;
				case 8:				// Gift Cards
					stExpandSubTree("LSMENUEN",15,0);
					break;
				case 9:				// Children
					stExpandSubTree("LSMENUEN",6,0);
					break;
		}
	}
});
</script>