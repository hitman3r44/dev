<%@ taglib uri="/struts-tags" prefix="s" %>
<style>

table {   border-collapse:collapse; empty-cells:hide; margin:-30px 0px 0px 24px; }
td { padding: 0px 5px 6px 12px; width:115px; }
</style>

<style type="text/css">

table.thumb td {
	margin-right: 0px; padding: 5px;
	float: left;
	position: relative;
	width: 80px;
	height: 110px;
}
table.thumb td img {
	width: 80px;
 	  top:50%;
	padding: 5px;	
	position: absolute;
	left: 0; bottom: 0;
	-ms-interpolation-mode: bicubic; 

	
}
table.thumb td img.hover {
	background:url(thumb_bg.png) no-repeat center center;
	border: none;
}
p
{
z-index: 500;
}

</style>


<div>
<div>
<!-- BreadCrumb -->
<div class="f12 big red_font" style="margin:40px 0px 0px 105px;">
    <a href="homePage.htm" class="red_font">Home</a> &#8250; <a href="ourBrands.htm" class="red_font">Our Brands</a>
</div>
<!-- BreadCrumb -->

<!-- Body Header -->
<div style="font-size:24px;margin:40px 0px 0px 105px;font-weight:bold; z-index: 20;">Our Brands</div>
<!-- Body Header -->

<div style="margin:10px 125px;padding:20px; ">
<!-- Apparel -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:10px;margin-left:-50px;margin-bottom:-50px; "><p>Apparel:</p></div>
<TABLE style="font-size:14px; font-weight:bold; padding-left:20px;text-decoration:none;margin-bottom:100px;" class="thumb">
<TR>
    <s:iterator value="apparelList" status="incr" >
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img style="width:80px; "   title="<s:property value="name"/>" alt="<s:property value="name"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a></TD>
    </s:iterator>
</TR>
</TABLE>
<BR><BR><BR>
<!-- Children -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px; margin-bottom:-50px"><p>Children:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;" >
<TR>
    <s:iterator value="childrenList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px; "  title="<s:property value="name"/>" alt="<s:property value="%{nameChildren[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a></TD>
    </s:iterator>
</TR>
</TABLE class="thumb">
<BR><BR><BR>
<!-- Electronics -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Electronics:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="electronicsList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px;" title="<s:property value="name"/>" alt="<s:property value="%{nameElectronics[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a></TD>
    </s:iterator>
</TR>
</TABLE >
<BR><BR><BR>
<!-- Gift Cards -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Gift Cards:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="giftCardsList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"> <img  style="width:80px; " title="<s:property value="%{nameGC[#incr.index]}"/>" alt="<s:property value="%{nameGC[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a>
    </s:iterator>
</TR>
</TABLE >
<BR><BR><BR>
<!-- Homeworks -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Homeworks:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="homeworksList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"> <img  style="width:80px; " title="<s:property value="%{nameHW[#incr.index]}"/>" alt="<s:property value="%{nameHW[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a>
    </s:iterator>
</TR>
</TABLE>
<BR><BR><BR>
<!-- Kitchen -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Kitchen:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="kitchenList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px; " title="<s:property value="%{nameKitchen[#incr.index]}"/>" alt="<s:property value="%{nameKitchen[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a></TD>
    </s:iterator>
</TR>
</TABLE>
<BR><BR><BR>
<!-- Outdoors -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Outdoors:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="outdoorsList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px; " title="<s:property value="%{nameOD[#incr.index]}"/>" alt="<s:property value="%{nameOD[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"> </a></TD>
    </s:iterator>
</TR>
</TABLE>
<BR><BR><BR>
<!-- Sports -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Sports:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="sportsList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD ><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px; "   title="<s:property value="%{nameSports[#incr.index]}"/>" alt="<s:property value="%{nameSports[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"></a></TD>
    </s:iterator>
</TR>
</TABLE>
<BR><BR><BR>
<!-- Video Game -->
<div style="font-size:17px; color:#bb0505; font-weight:bold; padding-left:20px;margin-left:-50px;margin-bottom:-50px;"><p>Video Game:</p></div>
<TABLE class="thumb" style="margin-bottom:100px;">
<TR>
    <s:iterator value="videoGameList" status="incr">
        <s:if test='%{#incr.index % 7 == 0}' >
            </TR><TR>
        </s:if>
        <TD><a href="/<s:property value="name"/>-<s:property value="id"/>.htm"><img  style="width:80px; " Title="<s:property value="%{nameVG[#incr.index]}"/>"  alt="<s:property value="%{nameVG[#incr.index]}"/>" src="/media/brand/thumb/<s:property value="image.name"/>"> </a></TD>
    </s:iterator>
</TR>
</TABLE>
</div>
<!-- chakib js -->
<BR><BR><BR>
    </div>

    </div>
<script type="text/javascript">
    $("#topMenuRed").hide();
    $("a#brands").attr('style','background-color:#bb0505;');
</script>

<script type="text/javascript"> 
$(document).ready(function(){

//Larger thumbnail preview 

$("table.thumb td").hover(function() {
	$(this).css({'z-index' : '10'});
	$(this).find('img').addClass("hover").stop()
		.animate({
			marginTop: '-110px', 
			marginLeft: '-110px', 
			top: '100%', 
			left: '50%', 
			width: '150%', 
			padding: '20px' 
		}, 200);
	
	} , function() {
	$(this).css({'z-index' : '0'});
	$(this).find('img').removeClass("hover").stop()
		.animate({
			marginTop: '0', 
			marginLeft: '0',
			bottom: '0', 
			left: '0',
			width: '80px', 
			top:'50%',	
			padding: '5px'
							
			
		}, 400);
});


});
</script> 


