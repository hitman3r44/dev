<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label {
	width:150px;
}
.vanadium-advice {
	margin-left: 150px;
}

.yellow_bg {
	background-color:Yellow;
}

.red_bg {
	background-color:Red;
}
</style>

<div class="unit" style="width:950px;margin:30px 0px 0px 60px;">

  <div class="pop_title" id="Title">Manage Account : <strong><s:property value="userName"/></strong></div>
  <!-- A List for Global Error Messages -->
  <s:if test="hasActionErrors()"> <div id="globalAdvice" class="gray_bg global-vanadium-advice"><s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>
  </s:if>
  <s:form action="getUserProduct.do" id="form" method="post" validate="true">

 <fieldset> 
 <s:token/> 

 <table border="0" style="border-color: black;">
 	<!-- row n_1:Brands -->
     <tr>
     	<td width="150px">Brands :</td>
     	<s:hidden id="brandChangedSignal" name="brandChangedSignal" value="0"/>
     	<s:hidden id="nbProductActiveByBrand" name="nbProductActiveByBrand"/>
        <td width="200px"><s:select id="brand" 
        		  name="brand"
        		  cssStyle="width:156px;"
        		  required="true"
        		  headerKey="-1" 
        		  headerValue="--ALL BRANDS--" 
        		  listKey="id"
        		  listValue="%{name}"			    		  
    			  list="brandList" /> 
    	<span id="brand_Error" style="display:none;margin-left:2px;"></span></td>	
        <td><s:if test='%{#session.usr == "menu"}' > 
        	<!-- Table n_1:Brand Profit -->
        	<table border="0">
        	<tr>
        	<td width="130px">Brand Profit :</td>
        	<td width="80px"><s:textfield id="brandDiscount" name="brandDiscount" maxlength="30" cssStyle="width:50px;" />%</td>
        	<td><input id="generateBrandDiscount" type="button" name="generateBrandDiscount" value="Generate Brand Profit" style="width: 150px;" />
        	<span id="discountBrand_Error" style="display:none;margin-left:2px;"></span></td>
        	</tr>
        	</table>
     	</s:if></td>
     </tr>
     
     <!-- row n_2:Category -->
     <tr>
     <td>Category :</td>
     <td><s:select id="category" 
        		  name="category"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--"
        		  listKey="id"
        		  listValue="%{name}" 			    		  
    			  list="categoryList" /></td> 
      <td><s:if test='%{#session.usr == "menu"}' > 
      		<!-- Table n_2:Category Profit -->
     		<table border="0">
     		<tr>
     		<td width="130px">Category Profit :</td>
        	<td width="80px"><s:textfield id="categoryDiscount" name="categoryDiscount" maxlength="30" cssStyle="width:50px;" />%</td>
        	<td>
        	<s:hidden id="categoryDiscountSignal" name="categoryDiscountSignal" value="0"/>
        	<input id="generateCategoryDiscount" type="button" name="generateCategoryDiscount" value="Generate Category Profit" style="width: 150px;"/>
        	<span id="discountCat_Error" style="display:none;margin-left:2px;"></span></td>
        	</tr>
        	</table>
     	</s:if></td>
	</tr>
    <!-- row n_3:Show Active Products -->	
	<tr>
	<td>Show Active Products:</td>
    <td><s:select id="UPStatus" 
        		  name="upstatus"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="All Product Status--"
        		  listKey="id"
        		  listValue="%{getText(name)}" 			    		  
    			  list="upstatusList" /> 
     	<s:hidden id="userId" name="userId" value="%{userId}"/>	
     	<s:hidden id="userName" name="userName" value="%{userName}"/>
     	<s:hidden id="actionDiscount" name="actionDiscount" /></td>
     	<td>	
     		<!-- Table n_3:Exclude whole brand -->
	     	<table border="0">
	     		<tr id="rowExlud">
	     		<td width="130px">Exclude whole brand :</td>
	     		<td><s:hidden id="brandExcludedSignal" name="brandExcludedSignal" value="0"/>
	     		<s:checkbox id="brandExcluded" name="brandExcluded" value="%{brandExcluded}"></s:checkbox></td>
	        	</tr>
	        </table> 
     	</td>
    </tr>
    
    <!-- row n_5:LS Product/Manufacturer --> 	
    <tr>
	    <td>LS Product/Manufacturer :</td>
	    <td colspan="2"><s:textfield id="lsProductManufacture" name="lsProductManufacture" maxlength="30" cssStyle="width:150px;" /></td>
    </tr>
</table> 
</fieldset>
<s:hidden id="productListSignal" name="productListSignal" value="0"/>
<input id="btGetProductList" type="button" name="getProductList" value="Get Products" style="width: 150px;"/>
 
 <s:hidden id="cancelBrandExcludedSignal" name="cancelBrandExcludedSignal" value="0"/>
 <s:hidden id="activeChangedSignal" name="activeChangedSignal" value="0"/>
 <s:hidden id="userPrStatus" name="userPrStatus" value="1"/>
 <s:hidden id="productIdToUpdateStatus" name="productIdToUpdateStatus" value="-1"/>
 
 <%@ include file="./dialogues/confirmationPop.jsp" %>

</s:form>	

	
	<div id="productList" class="fixed column" style="padding:0px 0px 0px 0px;">    
	  <div class="blue f12 bold pb10" style="padding-bottom:10px;"></div>
		<div id="productListData" style="width:1500px;"> 		   
	    	<table border="0" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
	            <thead class="gray_header">
	              <tr>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.category" /></span></th>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.main_specification" /></span></th>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.ls_product_id" /></span></th>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.manufacture_id" /></span></th>
	                <th><span  style="width:210px;" class="bold"><s:text name="loyauty.common.text.short.name" /></span></th>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.cost" /></span></th>
	                <th><span  style="width:100px;" class="bold"><s:text name="loyauty.common.text.short.sellin_price" /></span></th>
	                <th><span  style="width:50px;" class="bold"><s:text name="loyauty.common.text.short.msrp" /></span></th>
	                <th><span  style="width:50px;" class="bold"><s:text name="loyauty.common.text.short.profit_$" /></span></th>
	                <th><span  style="width:50px;" class="bold"><s:text name="loyauty.common.text.short.profit_%" /></span></th>
	                <th><span  style="width:70px;" class="bold"><s:text name="loyauty.common.text.short.status" /></span></th>
	                <s:if test='%{#session.usr == "menu"}' > 
	                	<th><span  style="width:10px;" class="bold"><s:text name="loyauty.common.text.short.active" /></span></th>	              
	              	</s:if>
	              </tr>
	            </thead>
	            <s:if test="%{UserProductList != null && UserProductList.size > 0}">
	            <tbody>
	    				<s:iterator value="userProductList" status="status">
	    					<input type="hidden" id="old_<s:property value="id"/>" value="<s:property value="userPrice" />" />
	    					<tr id="tr_<s:property value="id"/>"  
	    						class="<s:if test="priceType.value == @com.loyauty.web.WebConstants@PRICE_TYPE_MANUEL">manuel_setting_price</s:if> <s:if test="productStatus.value == @com.loyauty.web.WebConstants@P_STATUS_UNAVAILABLE">yellow_bg</s:if> <s:if test="productStatus.value == @com.loyauty.web.WebConstants@P_STATUS_DISCONTINUED">red_bg</s:if>">
	    						<td style="text-align: center;"><s:property value="categoryName" /></td>
	    						<td style="text-align: center;"><s:property value="specificationEn" /></td>
	    						<td style="text-align: center;"><s:property value="lsProductId" /></td>
	    						<td style="text-align: center;"><s:property value="manufacturerProductId" /></td>
	    						<td><s:property value="nameEng" /></td>
	    						<td style="text-align: center;"><span id="cost_<s:property value="id"/>" class="pa10"><s:property value="cost" /></span></td>
	    						
																
	    						<s:if test='%{#session.usr == "uv"}' > 
	    							<td style="text-align: center;" ><s:property value="userPrice" /></td>
	    						</s:if>
	    						<s:if test='%{#session.usr == "menu"}' >
	    							<td style="text-align: center;" ><span id='productId_<s:property value="id"/>' style="width:100px;" class="pa10"><s:property value="userPrice" /></span></td>
	    						</s:if>
	    						    							    						
	    						<td style="text-align: center;"><span class="pa10 right"><s:property value="msrp" /></span> </td>
	    						<td style="text-align: center;"><span id="dollarProfit_<s:property value="id"/>" class="pa10"><s:property value="dollarProfit" /></span></td>
	    						<td style="text-align: center;"><span id="percProfit_<s:property value="id"/>" class="pa10"><s:property value="percProfit" />%</span> </td>
	    						<td style="text-align: center;"><s:property value="productStatus" /></td>
								<s:if test='%{#session.usr == "menu"}' > 
								<td id="clumnStatus" ><center>
									<s:if test="%{userProductStatus.getCode()}">
									    <input type="checkbox" title="Active Catalog Item" id="checkBoxStatus"  value="true" checked="checked" />
									</s:if>
									<s:else>
									    <input type="checkbox" title="Active Catalog Item" id="checkBoxStatus"  value="true" />
									</s:else>
									<s:hidden id="productId"  name="id" value="%{id}"/>								
									</center>							
								</td>
								</s:if>    	 			
	    					</tr>	    			
	    				</s:iterator>
	    			
	    			<s:else><tr></tr></s:else>
	            </tbody>
	            </s:if>
	    	</table>

		</div>		
	  </div>
	  
	  <s:if test='%{#session.usr == "menu"}' >
	  	<s:if test="%{UserProductList != null && UserProductList.size > 0}">
	  		<div><a id="export" href="exportTOExcel.do?userId=<s:property value="userId"/>&brand=<s:property value="brand"/>&category=<s:property value="category"/>&userName=<s:property value="userName"/>&upstatus=<s:property value="upstatus"/>">Export to excel</a></div>
	  	</s:if>
	  </s:if>
	  
  </div>
  
  
<script type="text/javascript" charset="utf-8">

var vanadiumAdv = "vanadium-advice -vanadium-empty-advice- vanadium-invalid";
var userId = '<s:property value ="userId" />';
var brandExcluded;
var msgConfirmation;
var arraySelling = new Array();;
var arrayDollarProfit = [];
var brand;

$(function() {
	//brandExcluded= $("#brandExcluded").attr('checked');
	brandExcluded= $("#brandExcluded").is(':checked');
	$("#generateBrandDiscount").attr("disabled",brandExcluded);
	$("#generateCategoryDiscount").attr("disabled",brandExcluded);
    brand= $("#brand").val();
    if(brand==-1){
    	$("#brandExcluded").attr('disabled',true);
    	$("#rowExlud").hide();
    }
});

//format number of sellin and profit

$(function() {

	brand= $("#brand").val();
	if(brand!=-1){
	
	$('span[id^="productId_"]').each(function() {
		var selling=getValue($(this).text());
		arraySelling.push(selling);
	});
	for(i=0;i<arraySelling.length;i++){
		if(isNaN(arraySelling[i]) || arraySelling[i]==''|| arraySelling[i]==".00" || arraySelling[i]==null ){	
			$('span[id^="productId_"]').eq(i).text("0.00");
		}
	};
		
	$('span[id^="dollarProfit_"]').each(function() {
		var dollarProfit=getValue($(this).text());
		arrayDollarProfit.push(dollarProfit);
	});
	for(i=0;i<arrayDollarProfit.length;i++){
		if(isNaN(arrayDollarProfit[i]) || arrayDollarProfit[i]==''|| arrayDollarProfit[i]==".00" || arrayDollarProfit[i]==null )
		$('span[id^="dollarProfit_"]').eq(i).text("0.00");
	};
	
	}

});

function getValue(text){
	var result=text;
	result=result.replace(/^\s\s*/, ''); 
	result=result.replace(/\s\s*$/, ''); 
	result=result.replace(/([\s]+)/g, '-'); 
	result=result.split(',').join('');
	return result;
}

// Jquery Function main 
$(document).ready(function() { 
	$("#lsProductManufacture").val("");
	//when Admin click on the button getProductList
	$("#btGetProductList").click( function(){	
		$("#productListSignal").val("1");
		$('#form').trigger("submit");		
	});
	    
	//discount brand
	$("#generateBrandDiscount").click( function(){
		var discount = $('#brandDiscount').val();
		if( isNaN(discount) || discount.length == 0){
			$("#discountBrand_Error").addClass(vanadiumAdv).html('<span><s:text name="loyauty.error.common.number"/>.</span>').show();
		}
		else {
			$("#discountBrand_Error").removeClass(vanadiumAdv).hide();
			$('#categoryDiscountSignal').val(1);
			$('#actionDiscount').val(1);
			$('#form').trigger("submit");
		}
	});
	
	//discount categorty
	$("#generateCategoryDiscount").click( function(){
		var discount = $('#categoryDiscount').val();
		if( isNaN(discount)|| discount.length == 0 ){
			$("#discountCat_Error").addClass(vanadiumAdv).html('<span><s:text name="loyauty.error.common.number"/>.</span>').show();
		}
		else {
			$("#discountCat_Error").removeClass(vanadiumAdv).hide();			
			$('#actionDiscount').val(2);
			$('#categoryDiscountSignal').val(1);
			
			$('#form').trigger("submit");
		}
	});
	
	/* Apply the jEditable handlers to the table */
	$("span[id^='productId_']").editable( 'ajax/setManuelPrices.do', {	        
    	onedit : function(){
		var pid = this.getAttribute('id').split("_")[1];
		$('#old_'+pid).val($(this).text());
    	},
        submitdata : function(value, settings) {
   		var pid = this.getAttribute('id').split("_")[1];
       	return {
        		productId: pid,
        		oldValue : $('#old_'+pid).val(),
        		userId   : userId
		        }; 
        },
        callback: function( sValue, y ) {
       		var pid = this.getAttribute('id').split("_")[1];		
       		// sValue = unformat(sValue);
			var fValue = parseFloat(sValue);
			var costValue = $('#cost_'+pid).text();
			costValue = unformat(costValue);
        	var dprofit = fValue - parseFloat(costValue);
			var pprofit = 100 * dprofit / costValue;
				
			$('#dollarProfit_'+pid).text(thousandsSeparator(dprofit.toFixed(2)));
			var pctProfit =  pprofit.toFixed(2) + "%";
			$('#percProfit_'+pid).text(pctProfit);
			$('#tr_'+pid).addClass("manuel_setting_price");
	        },
	        
	        placeholder: '',
	        height	: "14px",
	        width	: "50%",
	        style   : 'display: inline',
	        submit  : 'save...'
	    });

	  /* Apply the jEditable handlers to the user product status */
	    
	$("input[name^='UserProductStatus_']").change(function () {
		var pid = this.getAttribute('name').split("_")[1];
		$.getJSON("ajax/setuserproductstatus.do",{productId: pid, userId : userId, value:$(this).attr('checked')});
	});

	//When user Admin change Brand
	 $("#brand").change(function () {
	    var brand= $("#brand").val();
	    $("#brandExcluded").attr('disabled',false);
	    if(brand==-1){
	    	$("#rowExlud").hide();
			$("#brandExcluded").attr('checked',false);
			$("#brandExcluded").attr('disabled',true);
		}else{
			$("#brandChangedSignal").val("1");
			$('#form').trigger("submit");
			$("#rowExlud").show();
		} 
	});
	
	// When admin change checked box
	$("#brandExcluded").click(function(){  
		brandExcluded= $("#brandExcluded").attr('checked');
		$("#btContinue").val("OK");
		$("#btcancel").val("Cancel");
		msgConfirmation="Are you sure to proceed?";
		msgNotification="Sorry,All products list must be inactive!";
		var nbProductActiveByBrand= $("#nbProductActiveByBrand").val();
		if(nbProductActiveByBrand!=0){
			$("#btContinue").hide();
			$("#btcancel").val("OK");
			$("#brandExcluded").attr('checked',false);
			$("#titlePop").text("Notification")
			$("#msgConfirmation").text(msgNotification);
			$("#confirmationPop").css("display","block"); 
			$("#confirmationPop").css("visibility","visible");
		}else{
			$("#btContinue").val("OK");
			$("#btcancel").val("Cancel");
			$("#msgConfirmation").text(msgConfirmation);
			$("#confirmationPop").css("display","block"); 
			$("#confirmationPop").css("visibility","visible");
		}

	});
	
		
	$("#btcancel").click(function(){  
		var brandExcluded= $("#brandExcluded").attr('checked');
		$("#cancelBrandExcludedSignal").val("1");
		$('#form').trigger("submit");
		$("#confirmationPop").css("display","none");
		$("#confirmationPop").css("visibility","hidden");	
	});
		
	$("#btContinue").click(function(){ 
		$("#brandExcludedSignal").val("1");
		$("#generateBrandDiscount").attr("disabled",brandExcluded);
		$("#generateCategoryDiscount").attr("disabled",brandExcluded);
		$('#form').trigger("submit");
		$("#confirmationPop").css("display","none");
		$("#confirmationPop").css("visibility","hidden");
	});



	//when admin change user's status Active or Inactive
	$("#clumnStatus #checkBoxStatus").click(function(){ 
		//var brandExcluded= $("#brandExcluded").attr('checked');
		var brandExcluded= $("#brandExcluded").is(':checked');
		var indexCheck=$("#clumnStatus #checkBoxStatus").index(this);
		//var valcheck=$("#clumnStatus #checkBoxStatus").eq(indexCheck).attr("checked");
		var valcheck=$("#clumnStatus #checkBoxStatus").eq(indexCheck).is(':checked');
		var productIdToUpdateStatus=$("#clumnStatus #productId").eq(indexCheck).val();
		//if(!brandExcluded){
			$("#productIdToUpdateStatus").val(productIdToUpdateStatus);
			$("#userPrStatus").val(2);
			if(valcheck)$("#userPrStatus").val(1);
			$("#activeChangedSignal").val(1);
			$('#form').trigger("submit");
		//}else{
		//	$("#clumnStatus #checkBoxStatus").eq(indexCheck).attr("checked",false);
		//}
	});
});

</script>

<script type="text/javascript" charset="utf-8">

var s = ",";	// thousand separator sign
var d = ".";	// decimal separator sign	
function thousandsSeparator(result) {
	
	result = result.toString();	
	var numberSide = result.split(d);
	var nn = numberSide[0];	// integer part
	var ff = numberSide[1];	// fraction part
	var formatted = "";
	var len = nn.length;	
	while (len > 3) {
		formatted = s + nn.substr(len-3, 3) + formatted;
		len -= 3;
	}

	formatted = result.substr(0, len) + formatted;	
	if (numberSide.length > 1) {
		if (formatted == "") formatted = "0";
		formatted = formatted + d + ff;
	}	
	return formatted;
	
}

function unformat(result) {
	result = result.replace(/\,/g, '');
	return result;
}
	
	
</script>

