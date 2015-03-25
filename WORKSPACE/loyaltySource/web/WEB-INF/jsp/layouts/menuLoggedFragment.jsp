<%@ taglib uri="/struts-tags" prefix="s" %>


<style type="text/css">
.bgColor {
	background-color:#e10404;
}

#menuXML li ul {
 position:absolute;
 }
 
#menuXML ul {
 margin:0;
 padding:0;
 list-style-type:none;
 text-align:center;
 }
 
#menuXML li {
 float:left;
 margin:auto;
 padding:0;
 }
 
#menuXML li a {
 display:block;
 color:white;
 text-decoration:none;
 padding:13px 20px 12px 20px;
 }
 
#ordersDownload li a {
 cursor: pointer;
 }
 
#menuXML li a:hover {
 color:white;
 }
 
 #menuXML ul li ul {
 display:none;
 visibility: hidden;
 }
 
 #menuXML ul li:hover ul {
 display:block;
 visibility: visible;
 margin-top:1px;
 }
 
#menuXML li:hover ul li {
 float:none;
 }
 
 #menuXML li:hover ul li a {
 background-color:background-color:rgb(85,86,85);
 background-image:none;
 outline: none;
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
    <div class="topmenulinks" style="padding-top:10px;"><a href="user/logout.do">Log Out</a></div>
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
    <s:hidden id="menuSelectedId" name="menuSelected" value="%{menuSelected}"></s:hidden>
    <div  id="topMenuGrey" style="clear:both;">
    <div style="padding:1px;background-color:#000;">    
    <div class="columns silver_bg_menu">
    	<div id="menuXML" class="column fixed nav" style="padding-left:14px;">    
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
    			<li ><a href="">XML</a>
					<ul id="xmlDownload" style="background-color:rgb(85,86,85);" >
					<li id="nav-xml"><a id="hrefXMLEng" href="updatesXML.htm" title="XML Update">English</a></li>
					<li id="nav-xml"><a id="hrefXMLFR" href="updatesXMLFr.htm" title="Mise à jour d'XML">Français</a></li>
					</ul>
				</li>
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li> 

				<li ><a href="">Orders</a>
					<ul id="ordersDownload" style="background-color:rgb(85,86,85);" > 
					<li><a  title="Orders shipped the previous day" href="ordersConfirmation-0.htm" >Yesterday</a></li>
					<li><a  title="Orders shipped this week"  href="ordersConfirmation-1.htm" >This Week</a></li>
					<li><a  title="Orders shipped this month"  href="ordersConfirmation-2.htm">This Month</a></li>
					</ul>
				</li>
				
				  
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>  			
    			<li id="nav-products"><a id="salesId" href="sales.htm" title="Sales">Sales</a></li>
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>
    			
    			
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>  			
    			<li id="nav-contact"><a id="contacts" href="contactUs.htm" title="Contact Us">Contact</a></li>
    			<li style="margin:0px -1px;"><img src="images/sep.png" width="3" height="40" /></li>
    		</ul>
		</div>
	</div>
   </div> 
    </div>
    
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
		
		$("a#searchButton").click(function() {
			var form = document.forms['searchResults'];
			var val = document.getElementById("query");
			form.action = "/searchResults.do?query" + val.value;
			form.target="";
			form.submit();
		});
		
	});
	
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#langChange").click(function() {
			$("#langChoice").slideToggle(500);
		}); 
	});
</script> 

<script type="text/javascript">
	var menuIndex;
	menuSelected(menuIndex);
	function menuSelected(menuIndex){
		menuIndex=$('#menuSelectedId').val();
		if(menuIndex!=null && menuIndex==1)$("#salesId").css("background-color","rgb(192,5,5)");
	}

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

		// When user click on the sale Menu
		$("#topMenuGrey li").click(function(e){
			$("#topMenuGrey li").eq(18).css("background-color","rgb(85,86,85)");
			var index=$("#topMenuGrey li").index(this);
			menuIndex=0;
			if(index==18){
				$('#menuSelectedId').val(1);
				$(this).css("background-color","rgb(192,5,5)");
			}	
		});
		
	// When user over mouse on one of menu XML link(Frensh or English)
	$("#xmlDownload a").mouseover(function(e){
		var indice=$("#xmlDownload a").index(this);
		$(this).css("background-color","rgb(192,5,5)");		
	});
	
	// When user make mouse out on one of menu XML link(Frensh or English)
	$("#xmlDownload a").mouseout(function(e){
		var indice=$("#xmlDownload a").index(this);
		$(this).css("background-color","rgb(85,86,85)");	 
	});
	
	// When user over mouse on one of menu Orders link
	$("#ordersDownload a").mouseover(function(e){
		var indice=$("#ordersDownload a").index(this);
		$(this).css("background-color","rgb(192,5,5)");		
	});

	// When user make mouse out on one of menu Orders link
	$("#ordersDownload a").mouseout(function(e){
		var indice=$("#ordersDownload a").index(this);
		$(this).css("background-color","rgb(85,86,85)");	 
	});

});
</script>
