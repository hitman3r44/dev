<%@ taglib uri="/struts-tags" prefix="s" %>
<link href="../../../stylesheets/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"> 
$(document).ready(function() {
 
	//Default Action
	$(".tab_content2").hide(); //Hide all content
	$("ul.tabs2 li:nth-child(1)").addClass("active").show(); //Activate first tab
	$(".tab_content2:nth-child(1)").show(); //Show first tab content
	
	//On Click Event
	$("ul.tabs2 li").click(function() {
		$("ul.tabs2 li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content2").hide(); //Hide all tab content
		var activeTab = $(this).find("a").attr("href"); //Find the rel attribute value to identify the active tab + content
		$(activeTab).show(); //Fade in the active content
		return false;
	});
 
});
</script>


<style type="text/css"> 
ul.tabs li a {display: block; padding: 0px; text-decoration:underline; font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px ;font-weight:bold; color: #000000;}
ul.tabs li.active a  {color: #bb0505;text-decoration:none;}
</style>

<div>
<div>
<div><img src="images/services_main_bg.jpg" width="976" height="302" /></div>
<div class="columns">
<div class="fixed column services_nav" style="background-color:#f2f1f1;width:180px;height:160px;">
<ul class="tabs2">
<li><a href="#tab1">Solutions</a></li>
<li><a href="#tab2">Sourcing</a></li>
<li><a href="#tab3">Fulfillment</a></li>
</ul>

</div>
<div class="column fixed tab_container2" style="width:750px;margin:20px;height:500px;">

<!--SOLUTIONS-->
<div class="tab_content2" id="tab1" style="display:none">
<div style="font-size:18px;font-weight:bold;border-bottom-width:1px;border-bottom-style:dotted;border-bottom-color:#000;padding-bottom:5px;">Solutions</div>
<div style="padding:20px 0px;" class="nobullet bullet"><p><strong>Loyalty Source</strong> is an innovator in sourcing and fulfillment services.</p><p>We can help you design, develop and implement a fully-customized rewards strategy and solution to meet your program objectives and budget. Our industry specialists can help you to build a tailored selection of best-selling rewards.</p>
<ul><li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;"><span style="text-decoration:underline;font-weight:bold;">Sourcing:</span> From the most popular brand name merchandise and gift cards to the  most inventive mobile and travel rewards, we can help you offer the very best selection of rewards.
<ul>
<li style="padding-bottom:10px;"><strong>Proposal:</strong> We can help you prepare and propose a selection of best-selling products, as seamlessly as you require.</li>
<li style="padding-bottom:10px;"><strong>Maintenance:</strong> With new additions and scheduled model updates, we can help you ensure your programs are always relevant without the hassle.</li>
<li style="padding-bottom:10px;"><strong>Proactive Inventory Management:</strong> Our inventory controls will ensure no orders are ever left unfulfilled. We promise.</li>
</ul>

</li>
<li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><span style="text-decoration:underline;font-weight:bold;">Customer Support:</span> We offer free customer support to all our partners for any questions they might have regarding our products and services.</li>
<li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><span style="text-decoration:underline;font-weight:bold;">Fulfillment: </span> With a full-service fulfillment centre and a commitment to a best-in-class fulfillment policy, we can help you offer an industry-leading delivery schedule to your customers.</li>
<li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><span style="text-decoration:underline;font-weight:bold;">Account Management:</span> Your account will be managed by a dedicated team to ensure your program achieves its designed objectives.</li>
<li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;"><span style="text-decoration:underline;font-weight:bold;">Volume Rebate:</span> We offer volume rebates to help ensure we are offering you the best prices possible.</li>
</ul>
</div>
</div>
<!--SOLUTIONS-->
<!--SOURCING-->
<div class="tab_content2" id="tab2" style="display:none">
<div style="font-size:18px;font-weight:bold;border-bottom-width:1px;border-bottom-style:dotted;border-bottom-color:#000;padding-bottom:5px;">Sourcing</div>
<div style="padding:20px 0px;" class="nobullet bullet">
  <p><strong>Loyalty Source's</strong> diverse selection will help to ensure your rewards are relevant and attainable. Our portfolio includes:</p>
  <ul><li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Merchandise:</strong> From the most popular in electronics to the most reliable in kitchenware, and just about everything in between, our portfolio offers the very best selection of brand name merchandise.</li>
  
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Gift Cards</strong>: With an extensive selection of popular brand name retailers and an assortment of local stores and specialty shops to choose from, the right reward is always available.</li>
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Digital/Mobile:</strong> Immediate gratification is the number one motivator in loyalty and our industry leading selection of digital and mobile rewards can help set you apart from the competition.</li>
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Travel: </strong>You can choose from a selection of pre-packaged weekend escapes or speak to a dedicated travel concierge to plan the vacation experience of their dreams.</li>
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Experiences: </strong>Whether you are looking to go to the movies or rent a luxury sports car for the weekend, our rewards can help you attract attention.</li>
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;"><strong>Liquidation/Daily Deals:</strong> We can help you drive recurring traffic and engage your customers with significant savings on a selection of limited-quantity merchandise and popular daily deals.</li>
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;"><strong>Custom:</strong> We are committed to offering the right rewards and will do our very best to source any special requests you might have for your program.</li></ul>
  </div>
</div>
<!--SOURCING-->
<!--FULFILLMENT-->
<div class="tab_content2" id="tab3" style="display:none">
<div style="font-size:18px;font-weight:bold;border-bottom-width:1px;border-bottom-style:dotted;border-bottom-color:#000;padding-bottom:5px;">Fulfillment</div>
<div style="padding:20px 0px;" class="nobullet bullet">
  <p><strong>Loyalty Source</strong> operates a full-service fulfillment centre located in Montreal, Quebec.</p><p>We are equipped to handle all phases of the fulfillment process, including letter insertion, label printing, packaging (including gift wrapping) and shipping. With corporate accounts at Canada Post, Purolator and UPS, we can help you benefit from competitive shipping rates.</p>In 2013,
  <ul><li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:10px;">We delivered more than 350,000 items to Canadians across Canada.</li>
  
  <li style="background-image: url(images/list_checkmark.gif);background-repeat: no-repeat;padding-left:20px;margin-bottom:20px;">We work with our clients to develop rigorous forecasting data, allowing their orders to be processed within 2 days in over 95% of forecasted orders.</li>
  </ul>
  <strong>No one delivers the best in rewards faster than us. That is our commitment to your clients and our promise to you.</strong></div>
</div>
<!--FULFILLMENT-->
</div>
</div>
</div>
</div>
    
 <script type="text/javascript">
	$("#topMenuRed").hide();
 	$("a#services").attr('style','background-color:#bb0505;');
</script>