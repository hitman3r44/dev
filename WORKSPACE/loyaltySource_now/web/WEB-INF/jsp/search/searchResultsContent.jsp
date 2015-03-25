<%@ taglib uri="/struts-tags" prefix="s" %>
<!-- PRODUCT LISTING -->
<div class="fixed column" style="margin:46px 20px 0px 40px;">
<div id="breadcrumb"></div>
<div style="text-align:right;margin-bottom:20px;">Sort:
    <!-- <select name="" style="font-size:11px">
  	<option value="alpha" selected="selected">Alphabetically [Brand]</option>
  	<option value="low">By Price: Lowest First</option>
  	<option value="high">By Price: Highest First</option>
  </select> -->
  <select name="rating2" id="rating2" onchange="document.location='searchResults.do?query=<s:property value="searchResults.query.replace('\\'',' ')" />' +
		 '&sortBy=' + this.options[selectedIndex].value+'&searchType='+<s:property value="searchType" /> + '&mSorted=true' +'&length='+itemsPerPageId.value">
		<!-- <option value="1">Alphabetically: A to Z</option>
	    <option value="2">Alphabetically: Z to A</option>
	    <option value="3">Date: Most Recent</option>
	    <option value="4">Date: Oldest</option>
	    <option value="8">Price: Expensive</option>
	    <option value="7">Price: Cheap</option> -->
		<option value="11" selected="selected">Alphabetically [Brand]</option> 
		<s:if test="#isLogin">
  			<option value="12">By Discount: Highest First</option>
  		</s:if>
  		<option value="10">By Price: Lowest First</option>
  		<option value="9">By Price: Highest First</option>

	</select>
  <select name="itemsPerPage" id="itemsPerPageId" onchange="document.location='searchResults.do?query=<s:property value="searchResults.query.replace('\\'',' ')" />' +
		 '&sortBy='+rating2.value+'&searchType='+<s:property value="searchType" /> + '&mSorted=true' +'&length=' + this.options[selectedIndex].value">
		<option value="12" >12 Items</option> 
  		<option value="24">24 Items</option>
  		<option value="48">48 Items</option>
 </select>
</div>
<div class="columns" style="width:680px;margin-bottom:30px;" id="searchResults">
<!-- ITEM-->
<s:if test="%{searchResults.numberOfResults > 0}">
<table><tr>
    <s:iterator value="searchResults.currentResults" status="status">
       	<s:if test='%{#status.index % 4 == 0}' >
			 </tr><tr>
		</s:if>
       <td>
		<div class="fixed column list <s:if test="#status.odd == false">odd_bg</s:if>" style="width:150px;margin:0px 10px 20px 10px;">
			<div class="listing_product_image">
            <div class="listing_product_brand"><s:property value="brand.name" /></div>
				<div>
					<a href="<s:property value="hrefName" />" title="<s:property value="nameProduc" />">
						<img src="${productThumbnail}<s:property value="image.name" />" width="120" height="120" />
					</a>
				</div>
			</div>
			<div class="listing_link_product">
				<div>
					<a id =product_<s:property value="id" /> href="<s:property value="hrefName" />">
						<s:property value="nameProduc" />
					</a>
				</div>
			</div>
            <s:if test="#isLogin"><div class="listing_product_price"><s:property value="localizedPriceProduct" /></div></s:if>	
		</div>
		</td>
	</s:iterator>
</tr></table>
</s:if>
<s:else>
	<s:text name="%{getText('loyauty.search.text.short.noMatchingRecordsFound')}" />
</s:else>
<!-- ITEM-->
<!-- BEGIN PAGINATION-->
<div  style="clear:both;text-align:center;" class="page_browsing">
<s:if test="%{searchResults.numberOfResults > 0}">

<s:if test="paging.leftNavEnable"><a href="searchResults.do?start=<s:property value="%{paging.framePages.get(paging.currentPage-1)}" />&length=<s:property value="searchResults.length" />&query=<s:property value="searchResults.query" />&sortBy=<s:property value="searchResults.sortBy" />&searchType=<s:property value="searchType" />&mSorted=<s:property value="mSorted" />" >Previous</a></s:if>
<s:iterator value="paging.framePages" status="stat" >
	<s:if test="paging.currentPage != key"><a href="searchResults.do?start=<s:property value="value" />&length=<s:property value="searchResults.length" />&query=<s:property value="searchResults.query" />&sortBy=<s:property value="searchResults.sortBy" />&searchType=<s:property value="searchType" />&mSorted=<s:property value="mSorted" />" ><s:property value="key" /></a></s:if>
	<s:elseif test="paging.leftNavEnable || paging.rightNavEnable">
		<s:property value="key" />
	</s:elseif>
</s:iterator>
<s:if test="paging.rightNavEnable"><a href="searchResults.do?start=<s:property value="%{paging.framePages.get(paging.currentPage+1)}" />&length=<s:property value="searchResults.length" />&query=<s:property value="searchResults.query" />&sortBy=<s:property value="searchResults.sortBy" />&searchType=<s:property value="searchType" />&mSorted=<s:property value="mSorted" />" >Next</a></s:if>
                        
</s:if>
</div>
<!-- END PAGINATION-->	
</div>

</div>
<!-- PRODUCT LISTING -->
 
<script type="text/javascript">
$(document).ready( function() {
	var sel = <s:property value="sortBy" />;
	var noOfItems = <s:property value="length" />;
	$("#rating2").val( sel ).attr("selected", true);	
	$("#itemsPerPageId").val( noOfItems ).attr("selected", true);
});
</script>

<script type="text/javascript">
	$().ready(function() {
		var homeName = "Home";
		var homeHL = "homePage.htm";
		var productTag = "<%= session.getAttribute("productBreadcrumb") %>";
		var productTagHL = "ourProducts.htm";
		
		var type = <%= session.getAttribute("type") %>;

		var groupName = "<%= session.getAttribute("groupName") %>";
		var categoryName = "<%= session.getAttribute("categoryName") %>";
		var specName = "<%= session.getAttribute("specName") %>";
		var brandName = "<%= session.getAttribute("brandName") %>";
		
		var groupHL = "<%= session.getAttribute("groupHL") %>";
		var categoryHL = "<%= session.getAttribute("categoryHL") %>";
		var specHL = "<%= session.getAttribute("specHL") %>";
		var brandHL = "<%= session.getAttribute("brandHL") %>";
							 
		if (type == "${SEARCHTYPE_GROUP}" ) {					// GROUP
			$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:10px;' > <a href='" 
					+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='"
					+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
					+ groupHL + "' class='red_font'>" + groupName + "</a></div>");
		} else if (type == "${SEARCHTYPE_CATEGORY}") {		// CATEGORY
			$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:10px;'> <a href='" 
					+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='" 
					+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
					+ groupHL + "' class='red_font'>" + groupName + "</a> &#8250; <a href='" 
					+ categoryHL + "' class='red_font'>" + categoryName + "</a></div>");			
		} else if (type == "${SEARCHTYPE_SPECIFICATION}") {	// SPECIFICATION
			$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:10px;'> <a href='" 
					+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='" 
					+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
					+ groupHL + "' class='red_font'>" + groupName + "</a> &#8250; <a href='" 
					+ categoryHL + "' class='red_font'>" + categoryName + "</a> &#8250; <a href='"
					+ specHL + "' class='red_font'>" + specName + "</a></div>");
		} else if (type == "${SEARCHTYPE_BRAND}") {			// BRAND
			$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:10px;' > <a href='"
					+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='" 
					+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
					+ brandHL + "' class='red_font'>" + brandName + "</a></div>");
		}
	});
</script>

<script type="text/javascript">
	$("#topMenuRed").hide();
 	$("a#products").attr('style','background-color:#bb0505;');
</script>