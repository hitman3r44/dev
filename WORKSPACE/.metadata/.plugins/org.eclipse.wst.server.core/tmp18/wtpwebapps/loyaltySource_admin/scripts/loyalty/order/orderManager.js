
/* <![CDATA[ */ 
var x = [];
var selectValuesUserTo = new Array();
var indexSelectValues=0;

$(function() {
	$("#list option").each(function() {
	  x.push($(this).text());
	});
	for(i=0;i<x.length;i++){
		x[i]=x[i].replace(/^\s\s*/, '');     // Remove Preceding white space
		x[i]=x[i].replace(/\s\s*$/, '');     // Remove Trailing white space
		x[i]=x[i].replace(/([\s]+)/g, '-'); // Replace remaining white space with dashes
		};

});


$(document).ready(function(){

	$("#txtUserLoginTo").keydown(function(e){
	    if (e.keyCode == 13 || e.keyCode == 32 || e.keyCode == 9) { 
			$("#selectUsersTag").css("display","none");
			$("#selectUsersTag").css("visibility","hidden"); 
	        return false;
	    }
	});
		
	$("#txtUserLoginTo").keydown(function(e){
	    if (e.keyCode == 40) { 
	    	if(selectValuesUserTo.length>0){
	    		if(indexSelectValues<selectValuesUserTo.length){
	    			$('#txtUserLoginTo').val(selectValuesUserTo[indexSelectValues]);
	    			$('#selectUsersTag')[0].selectedIndex=indexSelectValues;
	    			indexSelectValues++;
	    		}
		    }
	       return false;
	    }
	});
		
	$("#txtUserLoginTo").keydown(function(e){
	    if (e.keyCode == 38) { 
	    	if(selectValuesUserTo.length>0){
	    		if(indexSelectValues>=0){
	    			$('#txtUserLoginTo').val(selectValuesUserTo[indexSelectValues]);
	    			$('#selectUsersTag')[0].selectedIndex=indexSelectValues;
	    			indexSelectValues--;
	    			
	    		}
		    }
	       return false;
	    }
	});
	
	var selectUsersTagSize;
	$("#txtUserLoginTo").keyup(function(e){  
		if(e.keyCode != 32 && e.keyCode != 37 && e.keyCode != 38 && e.keyCode != 39 && e.keyCode != 40){
				$('#selectUsersTag').empty();
				selectUsersTagSize=0;
				$("#selectUsersTag").css("display","block");
				$("#selectUsersTag").css("visibility","visible");
				for(i=0;i<x.length;i++){
					
					var userLogin=$("#txtUserLoginTo").val();
					userLogin=userLogin.toLowerCase();
					var Str1=x[i];		
					var Str2=Str1.split(' ').join('');;// = Str1.trim();
					Str2=Str2.toLowerCase();
					if(userLogin.length>0){
						toCompare=Str2.substr(0,userLogin.length);
					}else toCompare="";
					if(toCompare==userLogin){	
						$("#selectUsersTag").append('<option value='+i+'>'+x[i]+'</option>');
						selectUsersTagSize++;	
					}
					if(selectUsersTagSize==1)selectUsersTagSize++;
					if(selectUsersTagSize==0)selectUsersTagSize=2;
					$("#selectUsersTag").attr( "size", selectUsersTagSize);
				};
				selectValuesUserTo = new Array();
				indexSelectValues=0;
				$('#selectUsersTag option').each(function() {
					selectValuesUserTo.push($(this).text());
				});		
		}
	}); 
	
	$("#txtUserLoginTo").keyup(function(e){ 
		if(e.keyCode == 13){
			
			$("#selectUsersTag").css("display","none");
			$("#selectUsersTag").css("visibility","hidden");
		}
	});
	
	$("#selectUsersTag").click(function(){  
		$("#selectUsersTag").css("display","none");
		$("#selectUsersTag").css("visibility","hidden"); 
		txtLoginSelected=$('#selectUsersTag option:selected').text();
		$("#txtUserLoginTo").val(txtLoginSelected);
	});
	

	$("body").click(function(){ 
		$("#selectUsersTag").css("display","none");   
		$("#selectUsersTag").css("visibility","hidden");
		
	});

	//Treatment of add and delete Template
	
	$("#btAddTemplate").click(function(){  
		$("#confirmationAddTempPop").css("display","block"); 
		$("#confirmationAddTempPop").css("visibility","visible");
		
	});  
	
	$("#btNoAddTemp").click(function(){  
		$("#confirmationAddTempPop").css("display","none");
		$("#confirmationAddTempPop").css("visibility","hidden");
		
	});
	
	$("#btYesAddTemp").click(function(){ 
		$("#confirmationAddTempPop").css("display","none");
		$("#confirmationAddTempPop").css("visibility","hidden");
		$("#txtUserLoginToCopy").val($("#txtUserLoginTo").val());
		$("#clientCategoryNameCopy").val($("#clientCategoryName").val());
		$("#progressBarPop").css("display","block"); 
		$("#progressBarPop").css("visibility","visible");
	});

	$('#columnBtDeleteTemp img[id="btDeleteTemp"]').mouseover(function(){ 
		$(this).attr("width",20);
		$(this).attr("height",20);
	});
	
	
	$('#columnBtDeleteTemp img[id="btDeleteTemp"]').mouseout(function(){ 
		$(this).attr("width",18);
		$(this).attr("height",18);
	});
	
	
	
	$('#columnBtDeleteTemp img[id="btDeleteTemp"]').mousedown(function(){ 
		var indexTemp=$('#columnBtDeleteTemp img[id="btDeleteTemp"]').index(this);
		altImg=$('#columnBtDeleteTemp img[id="btDeleteTemp"]').eq(indexTemp).attr("alt");
		if(altImg=="delete"){
			$(this).attr("width",25);
			$(this).attr("height",25);	
		}
	});
	
	
	$('#columnBtDeleteTemp img[id="btDeleteTemp"]').mouseup(function(){ 

		var indexTemp=$('#columnBtDeleteTemp img[id="btDeleteTemp"]').index(this);
		clientCategoryId=$('#columnClientCategoryId input[id="heddenClientCategoryId"]').eq(indexTemp).val();
		altImg=$('#columnBtDeleteTemp img[id="btDeleteTemp"]').eq(indexTemp).attr("alt");
		clientCategoryId=clientCategoryId.replace(/^\s\s*/, '');
		clientCategoryId=clientCategoryId.replace(/\s\s*$/, '');
		clientCategoryId=clientCategoryId.replace(/([\s]+)/g, '-');
		$('#clientCategoryIdCopy').val(clientCategoryId);
		if(altImg=="delete"){
			$(this).attr("width",20);
			$(this).attr("height",20);
			$("#confirmationDeleteTempPop").css("display","block"); 
			$("#confirmationDeleteTempPop").css("visibility","visible");	
		}

	});
	

	$('#columnPointer img[id="imgPointer"]').click(function(){ 
		$('#columnPointer img[id="imgPointer"]').each(function() {
			  $(this).attr("src","./images/pointerWhiteIcon.png");
			});
		$(this).attr("src","./images/pointerIcon.png");
		var indexImgPointer=$('#columnPointer img[id="imgPointer"]').index(this);
		dateCreation=$('#columnCreateDate #strCreationDate').eq(indexImgPointer).text();
		nameManger=$('#columnManagerRealName #heddenManagerRealName').eq(indexImgPointer).val();
		infoManager="Creation date:"+dateCreation;
		if(nameManger!=null && nameManger!="")infoManager="["+dateCreation+"]"+" Created by: "+nameManger;
		$("#createdBy").text(infoManager);
	});
	
	$("#btNoDeleteTemp").click(function(){  
		$("#confirmationDeleteTempPop").css("display","none");
		$("#confirmationDeleteTempPop").css("visibility","hidden");
		
	});
	
	$("#btYesDeleteTemp").click(function(){ 
		$("#confirmationDeleteTempPop").css("display","none");
		$("#confirmationDeleteTempPop").css("visibility","hidden");
		$("#progressBarPop").css("display","block"); 
		$("#progressBarPop").css("visibility","visible");
	});

 }); 
/*  ]]> */