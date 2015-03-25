<%@ taglib uri="/struts-tags" prefix="s" %>
<div class="fixed column" style="margin:46px 20px 0px 40px;" id="ourProductsTopRedMenu">
<div id="breadcrumb"></div>
<div class="columns" style="width:580px;margin-bottom:30px; margin-left:60px;">
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link1" href="Apparel.htm"><img src="images/section_thumb_apparel.png" width="120" height="120" title="Apparel"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Apparel.htm">Apparel</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link9" href="Children.htm"><img src="images/section_thumb_children.png" width="120" height="120" title="Children"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Children.htm">Children</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link2" href="Electronics.htm"><img src="images/section_thumb_electronics.png" width="120" height="120" title="Electronics"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Electronics.htm">Electronics</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link8" href="Gift+Cards.htm"><img src="images/section_thumb_gift_cards.png" width="120" height="120" title="Gift Cards"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Gift+Cards.htm">Gift Cards</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link4" href="Homeworks.htm"><img src="images/section_thumb_homeworks.png" width="120" height="120" title="Homeworks"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Homeworks.htm">Homeworks</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link5" href="Kitchen.htm"><img src="images/section_thumb_kitchen.png" width="120" height="120" title="Kitchen"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Kitchen.htm">Kitchen</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link6" href="Outdoors.htm"><img src="images/section_thumb_outdoors.png" width="120" height="120" title="Outdoors"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Outdoors.htm">Outdoors</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link7" href="Sports.htm"><img src="images/section_thumb_sports.png" width="120" height="120" title="Sports"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Sports.htm">Sports</a></div>
</div>
<!-- ITEM-->
<!-- ITEM-->
<div class="fixed column" style="width:150px;margin:0px 10px 30px 10px;">
<div style="text-align:center"><a id="link3" href="Gaming.htm"><img src="images/section_thumb_gaming.png" width="120" height="120" title="Video Games"/></a></div>
<div style="text-align:center;padding-top:10px;" class="listing_text_link"><a href="Gaming.htm">Video Games</a></div>
</div>
<!-- ITEM-->
<!-- ITEM--><!-- ITEM-->
</div>
</div>

<script type="text/javascript">
	$("#topMenuRed").hide();
 	$("a#products").attr('style','background-color:#bb0505;');
</script>

<script type="text/javascript">
	$().ready(function() {
		var homeName = "Home";
		var homeHL = "homePage.htm";
		var productTag = "<%= session.getAttribute("productBreadcrumb") %>";
		var productTagHL = "ourProducts.htm";
		$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:40px;' > <a href='" 
				+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='"
				+ productTagHL + "' class='red_font'>" + productTag + "</a></div>");		 
	});
</script>