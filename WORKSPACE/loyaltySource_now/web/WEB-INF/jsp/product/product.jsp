<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript">
		$(document).ready(function() {
			Elastic.configuration.refreshOnResize = false;
			$("a#imagepop").fancybox({
				'titleShow'		: true
			});
			});
			</script>
           <script type="text/javascript"> 
$(document).ready(function() {
 
	//Default Action
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:nth-child(1)").addClass("active").show(); //Activate first tab
	$(".tab_content:nth-child(1)").show(); //Show first tab content
	
	//On Click Event
	$("ul.tabs li").click(function() {
		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content
		var activeTab = $(this).find("a").attr("href"); //Find the rel attribute value to identify the active tab + content
		$(activeTab).show(); //Fade in the active content
		return false;
	});
 
});
</script>

<!-- PRODUCT LISTING -->
<div class="fixed column" style="margin:46px 0px 0px 40px;width:890px">
<div id="breadcrumb"></div>

<s:if test='%{writeWarning == "y2"}' >
	<div class="f16 big" style="color:blue;"><s:property value="warning" /></div>
	<br/><br/>
	<div class="f16 big product_title" style="margin-bottom:30px;padding:0px 10px 3px 0px;"><s:property value="productName" /></div>
</s:if>
<s:elseif test='%{writeWarning == "y3"}' >
	<div class="f16 big" style="color:blue;"><s:property value="warning" /></div>
	<br/>
	<s:if test='%{loyaltyProductIdSub == ""}' >
			<div class="f16 big product_title" style="margin-bottom:30px;padding:0px 10px 3px 0px;"><s:property value="productName" /></div>
	</s:if>	
	<s:else>	
			<div class="f16 big" style="color:blue;"><s:property value="warning2" /><a title="newLSProductIdSubHRef" href="<s:property value="newLSProductIdSubHRef" />"><s:property value="loyaltyProductIdSub" /></a></div>
			<br/><br/>
			<div class="f16 big product_title" style="margin-bottom:30px;padding:0px 10px 3px 0px;"><s:property value="productName" /></div>
	</s:else>	
</s:elseif>
<s:else>
	<div class="f16 big product_title" style="margin-bottom:30px;padding:0px 10px 3px 0px;"><s:property value="productName" /></div>
</s:else>

<div class="columns" style="margin-bottom:30px;">
<div class="fixed column" style="width:520px;">
<div style="border:1px;border-color:#afacac;border-style:solid;width:500px;margin:auto" id="cover_image">
		<img title="<s:property value="productName" />"
			 src="/media/product/large/<s:text name="productImageDTO.name" />"
			 alt="<s:text name="productImageDTO.name" />" 
			 width="500" 
			 height="500"/>
</div>

</div>
<s:set var="isImageLarge" value="%{productImageDTO.large == true}" />
<div class="fixed column" style="width:350px;margin-left:20px;">

<s:if test="%{brandImageDTO != null}">	
	<div style=" width:200px; height:200px">
		<a href="<s:property value="productDTO.brand.hrefName" />" title="<s:property value="productDTO.brand.name" />">
			<img src="media/brand/large/<s:property value="brandImageName" />" width="200" style=" margin-left:40%;"/>
		</a>
	</div>
</s:if>
<s:if test="#isLogin">
	<div style="text-align:center;margin:20px 0px;">
	<s:if test='%{sendRestricted == "restricted"}' >
		<table border="0" align="center" cellpadding="0" cellspacing="2" style="background-color:#F9F9F9;width:350px;border: 1px solid #DDDDDD;">
  		<tr>
    		<td align="left" style="width:150px;padding:8px 0px 8px 12px;color:#000;" class="big f16"><s:text name="%{getText('loyauty.common.text.short.cost_')}" /></td>
    		<td align="right" class="big f16" style="padding:8px 12px 8px 0px;color:#000;">
    				<a href="#" onclick="alert('Your account does not have purchassing permission on this product. To obtain permission or for more information please email your account representative.');"
    				   title="Restricted">RESTRICTED</a></td>
  		</tr>
		</table>
  	</s:if>
  	<s:else>
  		<table border="0" align="center" cellpadding="0" cellspacing="0" style="background-color:#F9F9F9;width:350px;border: 1px solid #DDDDDD;">
  		<tr>
    		<td align="left" style="width:65px;padding:8px 0px 8px 12px;color:#000;" class="big f16"><s:text name="%{getText('loyauty.common.text.short.cost_')}" /></td>
    		<td align="right" class="big f16" style="padding:8px 12px 8px 0px;color:#000;"><s:property value="price" /></td>
  		</tr>
		</table>   	
  	</s:else>	
	</div>
	<div>
	<s:if test='%{sendRestricted != "restricted"}' >
		<table width="320" border="0" cellpadding="0" cellspacing="0" class="f12" style="margin-left:15px;">
  		<tr>
    		<td align="left" style="padding:5px 0px;"><s:text name="%{getText('loyauty.common.text.short.msrp_')}" /></td>
    		<td align="right" class="big"><s:property value="msrp"/></td>
  		</tr>  	
  		<s:if test="%{discount != ''}">
  			<tr>
    			<td align="left" valign="middle"><s:text name="%{getText('loyauty.common.text.short.discount_')}" /></td>
    			<td align="right" class="big" style="color:#bb0505;"><s:property value="discount" /><br /></td>
  			</tr>
  			<tr>
    			<td align="left" valign="top">&nbsp;</td>
    			<td align="right"><s:property value="percentage" /></td>
  			</tr>
  		</s:if>
		</table>
	</s:if>
	</div>	
</s:if>
<s:else>
	<div style="margin:20px 0px;">
	<table border="0" cellpadding="0" cellspacing="0" style="background-color:#F9F9F9;width:350px;border: 1px solid #DDDDDD;">
  	<tr>
    	<td align="left" style="width:65px;padding:8px 0px 8px 12px;color:#000;" class="big f16"><s:text name="%{getText('loyauty.common.text.short.cost_')}" /></td>
    	<td align="right" class="big" style="padding:8px 12px 8px 0px;color:#000;text-align:center;"><a href="contactUs.htm" style="color:#000;font-size:11px;">Request an account ########</a></td>
  	</tr>
	</table>
	</div>	

</s:else>

<div><table width="320" border="0" align="left" cellpadding="0" cellspacing="0" class="f11" style="color:#000;margin:40px 0px 0px 15px;">
    <s:if test="%{loyaltyProductId != ''}">
    <tr>
      <td align="left" style="width:140px;padding:5px 0px;"><s:text name="%{getText('loyauty.common.text.short.ls_product_id_')}" /></td>
      <td align="right"><s:property value="loyaltyProductId" /></td>
    </tr>
    </s:if>
   
    
   <!-- ====================================== Replace N/A ======================================= --> 
    <s:if test="%{modelNumber != ''}">
		<s:if test="%{numberOfProductModelElements!=null && numberOfProductModelElements >= 1}">
		        <tr>
     	 			<td align="left" style="padding:5px 0px"><s:text name="%{getText('loyauty.common.text.short.model_number_')}" /></td>
     	 			
      				<td align="right"><s:property value="loyaltyProductIdWithountPrefix" /></td>
    			</tr>
    	</s:if>
    	<s:else>
    			<tr>
      				<td align="left" style="padding:5px 0px"><s:text name="%{getText('loyauty.common.text.short.model_number_')}" /></td>
      				<td align="right"><s:property value="modelNumber" /></td>
    			</tr>
    	</s:else>    
    </s:if>
       <!-- ====================================== Replace N/A ======================================= --> 
       
       
    <s:if test="%{weight != ''}">
    <tr>
      <td align="left" style="padding:5px 0px"><s:text name="%{getText('loyauty.common.text.short.total_weight_')}" /></td>
      <td align="right"><s:property value="weight" />
      lbs</td>
    </tr>    
    </s:if>
        
    <s:if test="%{w != '' && l != '' && h != ''}">
    <tr>
      <td align="left" style="padding:5px 0px"><s:text name="%{getText('loyauty.common.text.short.box_size_')}" /></td>
      <td align="right"><s:property value="w" /> X <s:property value="l" /> X <s:property value="h" /> in</td>
    </tr>
    </s:if>
    
    <s:if test="%{warranty != ''}">
    <tr>
      <td align="left" style="padding:5px 0px"><s:text name="%{getText('loyauty.common.text.short.warranty_')}" /></td>
      <td align="right"><s:property value="warranty" /></td>
    </tr>
    </s:if>
    </table>
</div>
</div>

</div>

<!-- TAB TEST-->
<div style="height:250px;">
<div>
<ul class="tabs" style="margin-left:10px">
<s:if test="%{desc != ''}" ><li><a href="#tab1"><s:text name="%{getText('loyauty.common.text.short.description')}" /></a></li></s:if>
<s:if test="%{spec != ''}"><li><a href="#tab2"><s:text name="%{getText('loyauty.common.text.short.specs')}" /></a></li></s:if>
<li><a href="#tab3">Shipping Rates</a></li>
<s:if test="%{other != ''}">
	<li>
		<a href="#tab4">Others</a>
	</li>
</s:if>
</ul>

</div>

<div class="tab_container" style="width:840px;margin:10px 10px 40px 10px;float:left;">

<!--SOLUTIONS-->
<div class="tab_content" id="tab1" style="display:none">
<div class="nobullet bullet"><s:text name="%{desc}" />
</div>
</div>
<!--SOLUTIONS-->

<!--SOURCING-->
<div class="tab_content" id="tab2" style="display:none">
<div class="nobullet bullet"><s:text name="%{spec}" /></div>
</div>
<!--SOURCING-->


<!--FULFILLMENT-->
<div class="tab_content" id="tab3" style="display:none">
<div class="nobullet bullet">
<!--SHIPPING-->
<s:if test="#isLogin">
<!--SHIPPING COST PER PROVINCE-->	
<s:if test="%{provinceNameList != null}">
	<s:if test="%{provinceNameList.size > 0}" >
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td style="width:100px;font-weight:bold;padding:4px 0px;">Province</td>
    <s:iterator value="provinceNameList" status="count">
    	<td style="width:50px;text-align:center;width:60px;font-weight:bold;background:#e0e0e0;"><s:property value="%{provinceName[#count.index]}"/></td>
    </s:iterator>
  </tr>
  <tr>
    <td style="font-weight:bold;padding:4px 0px;">Shipping Cost</td>
    <s:iterator value="provinceNameList" status="count">
    	<td style="text-align:center;"><s:property value="%{shippingCost[#count.index]}"/></td>
    </s:iterator>
    
  </tr>
</table>
	</s:if>
</s:if>	

<!--SHIPPING COST PER PROVINCE-->
<!--SHIPPING TOTAL - CANADA-->	
<s:if test="%{shippingTotalCanada != ''}">
	<div class="big" style="margin:20px 0px 10px 0px;"><s:text name="%{getText('loyauty.common.text.short.shippingCanada')}" /></div>
	<div style="text-align:left">
   		<s:text name="%{shippingTotalCanada}" />
	</div>
</s:if>
<div style="margin-top:20px;">All rates are calculated using Canada Post Expedited Parcel Service with full insurance coverage.  Rates may vary for remote locations and are subject to change without notice.</div>
<!--SHIPPING TOTAL - CANADA-->	
</s:if>
<s:else>
	<div style="margin-top:20px;">Log in or <a href="/contactUs.htm" title="Request an account">request an account</a> to view the estimated shipping rates.</div>
</s:else>
<!--SHIPPING-->
</div>
</div>
<!--FULFILLMENT-->

<!--SOURCING-->
<s:if test="%{other != ''}">
<div class="tab_content" id="tab4" style="display:none">
<div class="nobullet bullet"><s:text name="%{other}" /></div>
</div>
</s:if>
<!--SOURCING-->

</div>
</div>
  <!-- TAB TEST-->

</div>
<!-- PRODUCT LISTING -->

<script type="text/javascript">
	$("#topMenuRed").hide();
 	$("a#products").attr('style','background-color:#bb0505;');
</script>

<script type="text/javascript" charset="utf-8">
$(document).ready(function() {
	function addLinkableImage(){
		$("#cover_image img").addClass('linkable');
		$("#cover_image img.enlarge").show();
		$("#cover_image").fancybox({
				'title' : $("#cover_image img").attr('title'),
				'titleShow'	: true,
				'titlePosition' : 'inside',
				'href' : '${productLarge}' + $("#cover_image img").attr('alt')
		});
	}

	var isLarge = <s:property value="#isImageLarge" />;           	 
	if ( isLarge ) {  addLinkableImage(); 	
}

});
</script>

<script type="text/javascript">
	$().ready(function() {			
		var homeName = "Home";
		var homeHL = "homePage.htm";
		var productTag = "<%= session.getAttribute("productBreadcrumb") %>";
		var productTagHL = "ourProducts.htm";
		
		var groupName = "<%= session.getAttribute("groupName") %>";
		var categoryName = "<%= session.getAttribute("categoryName") %>";
		var specName = "<%= session.getAttribute("specName") %>";
		
		var groupHL = "<%= session.getAttribute("groupHL") %>";
		var categoryHL = "<%= session.getAttribute("categoryHL") %>";
		var specHL = "<%= session.getAttribute("specHL") %>";
		
		if (specName != 'N/A' && specName != '') {
			$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:20px;'> <a href='"
					+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='"
					+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
					+ groupHL + "' class='red_font'>" + groupName + "</a> &#8250; <a href='" 
					+ categoryHL + "' class='red_font'>" + categoryName + "</a> &#8250; <a href='"
					+ specHL + "' class='red_font'>" + specName + "</a></div>");
		} else {
			if (categoryName != 'N/A' && categoryName != '') {
				$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:20px;'> <a href='"
						+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='"
						+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
						+ groupHL + "' class='red_font'>" + groupName + "</a> &#8250; <a href='" 
						+ categoryHL + "' class='red_font'>" + categoryName + "</a></div>");
			} else {
				$("div#breadcrumb").html("<div class='f12 big red_font' style='margin-bottom:20px;'> <a href='"
						+ homeHL + "' class='red_font'>" + homeName + "</a> &#8250; <a href='"
						+ productTagHL + "' class='red_font'>" + productTag + "</a> &#8250; <a href='"
						+ groupHL + "' class='red_font'>" + groupName + "</a></div>");
			}
		}
	});
</script>