
/* <![CDATA[ */ 

var arrayClientCategoryIdUsers = [];
var arrayClientCategoryIdTemp = [];
var arrayUserIdTemp = [];  
var arrayUserId = [];
var showRows=0;
var isRowsHidden=1;
var indexUser=0;
var timerCounter=0;
function horloge() {
	$("#progressBar").css("display","block"); 
	$("#progressBar").css("visibility","visible");
	timerCounter++;
	if(timerCounter<=100){
		timer = window.setTimeout("horloge()", 1000);
	}else{
		$("#progressBar").css("display","none");
		$("#progressBar").css("visibility","hidden");
		window.clearTimeout(timer);
		timerCounter=0;
	};
}


$(function() {
	$('#tabUsersPrice input[id="userId"]').each(function() {
		arrayUserId.push($(this).val());
	});
	for(i=0;i<arrayUserId.length;i++){
		arrayUserId[i]=arrayUserId[i].replace(/^\s\s*/, '');    
		arrayUserId[i]=arrayUserId[i].replace(/\s\s*$/, '');   
		arrayUserId[i]=arrayUserId[i].replace(/([\s]+)/g, '-'); 
		};
	$('#tabUsersPrice input[id="columnUsersId"]').hide();
});

 
$(function() {
	$('#tabTemp input[id="userIdTemp"]').each(function() {
		arrayUserIdTemp.push($(this).val());
	});
	for(i=0;i<arrayUserIdTemp.length;i++){
		arrayUserIdTemp[i]=arrayUserIdTemp[i].replace(/^\s\s*/, '');    
		arrayUserIdTemp[i]=arrayUserIdTemp[i].replace(/\s\s*$/, '');     
		arrayUserIdTemp[i]=arrayUserIdTemp[i].replace(/([\s]+)/g, '-'); 
		};
});


$(function() {
	$('#tabUsersPrice input[id="clientCategoryId"]').each(function() {
		arrayClientCategoryIdUsers.push($(this).val());
	});
	for(i=0;i<arrayClientCategoryIdUsers.length;i++){
		arrayClientCategoryIdUsers[i]=arrayClientCategoryIdUsers[i].replace(/^\s\s*/, ''); 
		arrayClientCategoryIdUsers[i]=arrayClientCategoryIdUsers[i].replace(/\s\s*$/, ''); 
		arrayClientCategoryIdUsers[i]=arrayClientCategoryIdUsers[i].replace(/([\s]+)/g, '-'); 
		};
});

$(function() {
	$('#tabTemp input[id="clientCategoryIdTemp"]').each(function() {
		arrayClientCategoryIdTemp.push($(this).val());
	});
	for(i=0;i<arrayClientCategoryIdTemp.length;i++){
		arrayClientCategoryIdTemp[i]=arrayClientCategoryIdTemp[i].replace(/^\s\s*/, '');  
		arrayClientCategoryIdTemp[i]=arrayClientCategoryIdTemp[i].replace(/\s\s*$/, ''); 
		arrayClientCategoryIdTemp[i]=arrayClientCategoryIdTemp[i].replace(/([\s]+)/g, '-'); 
		};
	$('#tabTemp input[id="columnClientCategoryIdTemp"]').hide();
});


//Hide all rows of product price
$(function() {
	for(i=0;i<arrayUserId.length;i++){
		$('#tabUsersPrice tr[id="rowTabUsersPrice"]').eq(i).hide();
	};
});

$(document).ready(function(){
	//When the user click on add product
    $("#btAddProduct").click(function(){  
    	$('html,body').scrollTop(0);
    	showPopup=false;
    	for(i=0;i<arrayClientCategoryIdTemp.length;i++){
    		var clientCategoryIdTemp=arrayClientCategoryIdTemp[i];
			userPriceTemp=$('#tabTemp input[id="userPriceTemp"]').eq(i).val();
    		var isExcludedTemp= $('#tabTemp input[id="isExcludedTemp"]').eq(i).attr('checked');
    		if((userPriceTemp==null || userPriceTemp==""|| userPriceTemp==0 || userPriceTemp=="NaN")&& isExcludedTemp!='checked'){
    			showPopup=true;
	    		break;
    		}
    	}
		for(i=0;i<arrayClientCategoryIdUsers.length;i++){
			indexUser=i;
			var isExcluded=$('#tabUsersPrice input[id="isExcluded"]').eq(i).attr('checked');
			userPrice=$('#tabUsersPrice input[name="userPrice"]').eq(i).val();
			percentageProfit=$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val();
			percentageDiscount=$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val();
			if((userPrice==null || userPrice==""|| userPrice==0 || userPrice=="NaN")&& isExcluded!='checked'){
				showPopup=true;
				break;
			}
		};
		 if(showPopup==true){
				$("#controlePrice").css("display","block"); 
				$("#controlePrice").css("visibility","visible"); 
				 return false;
		 }
		horloge();
	});
    
    //When the user click on the button 'Yes' of dialog box
    $("#btYesControlePrice").click(function(){
    	for(k=0;k<arrayClientCategoryIdTemp.length;k++){
    		var clientCategoryIdTemp=arrayClientCategoryIdTemp[k];
			userPriceTemp=$('#tabTemp input[id="userPriceTemp"]').eq(k).val();	
			var isExcludedYes=$('#tabTemp input[id="isExcludedTemp"]').eq(k).attr('checked');
    		if((userPriceTemp==null || userPriceTemp==""|| userPriceTemp==0 || userPriceTemp=="NaN")&& isExcludedYes!='checked'){
    			 excludeUsersByTemp(k);
    			 $('#tabTemp input[id="isExcludedTemp"]').eq(k).attr('checked',true);
    		}
    	}
    	for(i=0;i<arrayClientCategoryIdUsers.length;i++){
    		var isExcluded=$('#tabUsersPrice input[id="isExcluded"]').eq(i).attr('checked');
			userPrice=$('#tabUsersPrice input[name="userPrice"]').eq(i).val();
			percentageProfit=$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val();
			percentageDiscount=$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val();
    		if((userPrice==null || userPrice==""|| userPrice==0 || userPrice=="NaN")&& isExcluded!='checked'){
					$('#tabUsersPrice input[name="userPrice"]').eq(i).attr('disabled',true);
					$('#tabUsersPrice input[name="percentageProfit"]').eq(i).attr('disabled',true);
					$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).attr('disabled',true);
					$('#tabUsersPrice input[name="userPrice"]').eq(i).val("");
					$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val("");
					$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val("");
					$('#tabUsersPrice input[name="isExcluded"]').eq(i).attr('checked',true);
			}
		};
		$("#controlePrice").css("display","none");
		$("#controlePrice").css("visibility","hidden");   	
	});

    //When the user click on the button 'No' of dialog box 
    $("#btNoControlePrice").click(function(){ 
		$("#controlePrice").css("display","none");
		$("#controlePrice").css("visibility","hidden");
	});
	
	// Populate value for Selling price if it is entered as text, auto populate the Profit %
	$('#tabTemp input[id="userPriceTemp"]').keyup(function(e){  
		var userPriceTemp=$(this).val();
		var priceFloat = parseFloat(userPriceTemp);
		var indexTemp=$('#tabTemp input[id="userPriceTemp"]').index(this);
		var clientCategoryIdTemp=arrayClientCategoryIdTemp[indexTemp];
		if (userPriceTemp.length == 0 || userPriceTemp == "") {		
			$(this).val("");
		} else {			
			var cost =  $("input#cost").val();
			var profit = ((userPriceTemp/cost)-1)*100;				
			$("input#percentageProfitTemp").eq(indexTemp).val(parseFloat(profit).toFixed(2));
			var msrp = $("input#msrp").val();
			var disc = ((msrp-userPriceTemp)/msrp)*100;	
			$("input#percentageDiscountTemp").eq(indexTemp).val(parseFloat(disc).toFixed(2));
			var percentageProfitTemp=$("input#percentageProfitTemp").eq(indexTemp).val();
			var percentageDiscountTemp=$("input#percentageDiscountTemp").eq(indexTemp).val();
			for(i=0;i<arrayClientCategoryIdUsers.length;i++){
				if(arrayClientCategoryIdUsers[i]==clientCategoryIdTemp || arrayUserId[i]==clientCategoryIdTemp){
					var isExcluded=$('#tabUsersPrice input[id="isExcluded"]').eq(i).attr('checked');
					if(isExcluded!='checked'){
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val(parseFloat(userPriceTemp).toFixed(2));
						//---for currency---
						if($('#tabUsersPrice input[name="currencySymbol"]').eq(i).val()!="CAD") {
							var currRate = $('#tabUsersPrice input[name="currencyRate"]').eq(i).val();
							var currPrice = priceFloat * currRate;
							$('#tabUsersPrice input[name="currencyPrice"]').eq(i).val(currPrice.toFixed(2));
						}
						//---for currency---
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val(parseFloat(percentageProfitTemp).toFixed(2));
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val(parseFloat(percentageDiscountTemp).toFixed(2));
					}
				}
			};
		}
	}); 

	 /*-----------------------------------------------------------------------------------------------
	  	populate value for Selling price of user <<<< Cost >>>> when admin write eny thing in our cost
	   -----------------------------------------------------------------------------------------------*/
		$('#cost,input[id="msrp"]').keyup(function(e){  	
			var price=$('#cost').val();
			var index=$('#cost').index(this);
			if ((price.length == 0 || price == "" || isNaN(price))&& index!=-1) {		
				$(this).val("");
				for(i=0;i<arrayUserId.length;i++){
					var userId=arrayUserId[i];
					if(userId=="9"){
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="currencyPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val("");
					}
				}
			}else{
				var priceFloat = parseFloat(price);	
				var msrp = $("input#msrp").val();
				var msrpFloat = parseFloat(msrp);	
				var disc = ((msrpFloat-priceFloat)/msrpFloat)*100;
				for(i=0;i<arrayUserId.length;i++){
					var userId=arrayUserId[i];
					if(userId=="9"){//9 is id of user "Cost"
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val(parseFloat(priceFloat).toFixed(2));
						$('#tabUsersPrice input[name="currencyPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val(parseFloat("0.00").toFixed(2));
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val(parseFloat(disc).toFixed(2));
					}
				}
			}
			
		}); 

	// Populate value for Profit % if it is entered as text, auto populate the Selling price
	$('#tabTemp input#[id="percentageProfitTemp"]').keyup(function(){
		var profit = $(this).val();
		var cost = $("input#cost").val();
		var indexTemp=$('#tabTemp input#[id="percentageProfitTemp"]').index(this);
		var clientCategoryIdTemp=arrayClientCategoryIdTemp[indexTemp];
		var price = $('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).val();
		price = (price == '' || price == null) ? 0 : price;
		if (price.length != 0 || price != '') {			
			if (profit.length == 0 || profit == "") {
				profit = ((price/cost)-1)*100;
				$("input#percentageProfitTemp").eq(indexTemp).val(profit.toFixed(1));
			} else {
				price = cost*((profit/100)+1);
				$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).val(parseFloat(price).toFixed(2));
				var msrp = $("input#msrp").val();
				disc = ((msrp-price)/msrp)*100;
				$("input#percentageDiscountTemp").eq(indexTemp).val(disc.toFixed(2));
				var percentageProfitTemp=$("input#percentageProfitTemp").eq(indexTemp).val();
				var percentageDiscountTemp=$("input#percentageDiscountTemp").eq(indexTemp).val();
				for(i=0;i<arrayClientCategoryIdUsers.length;i++){
					if(arrayClientCategoryIdUsers[i]==clientCategoryIdTemp || arrayUserId[i]==clientCategoryIdTemp){
						var isExcluded=$('#tabUsersPrice input[id="isExcluded"]').eq(i).attr('checked');
						if(isExcluded!='checked'){
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val(parseFloat(price).toFixed(2));
						//---for currency---
						if($('#tabUsersPrice input[name="currencySymbol"]').eq(i).val()!="CAD") {
							var priceFloat = parseFloat($('#tabUsersPrice input[name="userPrice"]').eq(i).val());
							var currRate = $('#tabUsersPrice input[name="currencyRate"]').eq(i).val();
							var currPrice = priceFloat * currRate;
							$('#tabUsersPrice input[name="currencyPrice"]').eq(i).val(currPrice.toFixed(2));
						}
						//---for currency---
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val(parseFloat(percentageProfitTemp).toFixed(2));
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val(parseFloat(percentageDiscountTemp).toFixed(2));
						}
					}
				};
        	}
		}
	});

	// this function permit to exclude all users if the manager excluded the template
	$('#tabTemp input[id="isExcludedTemp"]').click(function(e){ 
		var indexTemp=$('#tabTemp input[id="isExcludedTemp"]').index(this);
		excludeUsersByCheckedTemp(indexTemp);
	}); 

	//excludeUsersByCheckedTemp
	function excludeUsersByCheckedTemp(indexTemp){
		var clientCategoryIdTemp=arrayClientCategoryIdTemp[indexTemp];
		isExcluded=$('#tabTemp input[id="isExcludedTemp"]').eq(indexTemp).attr('checked');
			for(i=0;i<arrayClientCategoryIdUsers.length;i++){
				if(arrayClientCategoryIdUsers[i]==clientCategoryIdTemp || arrayUserId[i]==clientCategoryIdTemp){
					if(isExcluded==true){
						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).attr('disabled', true);
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).attr('disabled',true);
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).attr('disabled',true);
						$('#tabUsersPrice input[name="userPrice"]').eq(i).attr('disabled',true);
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).attr('disabled',true);
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).attr('disabled',true);

						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).val("");
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).val("");
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).val("");
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="currencyPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val("");	
						$('#tabUsersPrice input[name="isExcluded"]').eq(i).attr('checked',true);
					}else{
						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).attr('disabled', false);
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).attr('disabled',false);
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).attr('disabled',false);
						$('#tabUsersPrice input[name="userPrice"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="isExcluded"]').eq(i).attr('checked',false);
					}
				}
			};
	}

	//Method permit to exclude users by template index
	function excludeUsersByTemp(indexTemp){
		var clientCategoryIdTemp=arrayClientCategoryIdTemp[indexTemp];
		isExcludedTemp=$('#tabTemp input[id="isExcludedTemp"]').eq(indexTemp).attr('checked');
		userPriceTemp=$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).val();
			for(i=0;i<arrayClientCategoryIdUsers.length;i++){
				if(arrayClientCategoryIdUsers[i]==clientCategoryIdTemp || arrayUserId[i]==clientCategoryIdTemp){
					if((userPriceTemp==null || userPriceTemp==""|| userPriceTemp==0 || userPriceTemp=="NaN")&& isExcludedTemp==false){
						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).attr('disabled', true);
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).attr('disabled',true);
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).attr('disabled',true);
						$('#tabUsersPrice input[name="userPrice"]').eq(i).attr('disabled',true);
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).attr('disabled',true);
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).attr('disabled',true);
						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).val("");
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).val("");
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).val("");
						$('#tabUsersPrice input[name="userPrice"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).val("");
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).val("");	
						$('#tabUsersPrice input[name="isExcluded"]').eq(i).attr('checked',true);
					}else{
						$('#tabTemp input[id="userPriceTemp"]').eq(indexTemp).attr('disabled', false);
						$('#tabTemp input[id="percentageProfitTemp"]').eq(indexTemp).attr('disabled',false);
						$('#tabTemp input[id="percentageDiscountTemp"]').eq(indexTemp).attr('disabled',false);
						$('#tabUsersPrice input[name="userPrice"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="percentageProfit"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="percentageDiscount"]').eq(i).attr('disabled',false);
						$('#tabUsersPrice input[name="isExcluded"]').eq(i).attr('checked',false);
					}
				}
			};
	}

	
	$('#tabTemp input[id="userPriceTemp"]').change(function(e){  
		var userPriceTemp=$(this).val();
		var priceFloat = parseFloat(userPriceTemp);
		$(this).val(priceFloat.toFixed(2));
	}); 

	$('#tabTemp input[id="percentageProfitTemp"]').change(function(e){  
		var percentageProfitTemp=$(this).val();
		var priceFloat = parseFloat(percentageProfitTemp);
		$(this).val(priceFloat.toFixed(2));
	}); 

	$('#tabTemp input[id="percentageDiscountTemp"]').change(function(e){  
		var percentageDiscountTemp=$(this).val();
		var priceFloat = parseFloat(percentageDiscountTemp);
		$(this).val(priceFloat.toFixed(2));
	}); 
	
	// Hide or show rows of product price Table
	$('#tabUsersPrice img[id="showRows"]').click(function(e){  
		/*
		if(showRows==1){
			for(i=0;i<arrayUserId.length;i++){
				for(j=0;j<arrayUserIdTemp.length;j++){
					isTemp=0;
					if(arrayUserId[i]==arrayUserIdTemp[j]){
						isTemp=1;
						break;
					}
				};
				if(isTemp==0){	
					$('#tabUsersPrice tr[id="rowTabUsersPrice"]').eq(i).hide();
				}
			};
			isRowsHidden=1;
			showRows=0;
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/showRowsMouseOut.png");
		}else{
			$('#tabUsersPrice tr[id="rowTabUsersPrice"]').show();
			showRows=1;
			isRowsHidden=0;
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/hideRowsMouseOut.png");
		}
		*/

		if(showRows==1){
			for(i=0;i<arrayUserId.length;i++){
				$('#tabUsersPrice tr[id="rowTabUsersPrice"]').eq(i).hide();
			};
			showRows=0;
			isRowsHidden=1;
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/showRowsMouseOut.png");
		}else{
			for(i=0;i<arrayUserId.length;i++){
				var template=$('#tabUsersPrice input[id="template"]').eq(i).val();
				if(template!=1){
					$('#tabUsersPrice tr[id="rowTabUsersPrice"]').eq(i).show();
				}
				//$('#tabUsersPrice tr[id="rowTabUsersPrice"]').eq(i).show();
			};
			showRows=1;
			isRowsHidden=0;
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/hideRowsMouseOut.png");
		}	
		
	});
	
	// Just changed the image button[show/hide rows] when mouse move Over it
	$('#tabUsersPrice img[id="showRows"]').mouseover(function(e){
		if(isRowsHidden==1){
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/showRowsMouseOver.png");
		}else{
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/hideRowsMouseOver.png");
		}
		
	});
	
	 //Just changed the image button[show/hide rows] when mouse move out it
	$('#tabUsersPrice img[id="showRows"]').mouseout(function(e){
		if(isRowsHidden==1){
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/showRowsMouseOut.png");
		}else{
			$('#tabUsersPrice img[id="showRows"]').attr("src","./images/hideRowsMouseOut.png");
		}
	});

	//when user press enter-> nothing
	$("#divMainAddProduct input").keydown(function(e){
	    if (e.keyCode == 13) { 
	        return false;
	    }
	});
	
	
	
 }); 
/*  ]]> */