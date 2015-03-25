
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
	
	$("#btTransfer").click(function(){  
		//$("#transferPrompt").css("display","block"); 
		//$("#transferPrompt").css("visibility","visible");
		$("#confirmationPop").css("display","block"); 
		$("#confirmationPop").css("visibility","visible");
		
	});  
	
	$("#btcancel").click(function(){  
		$("#confirmationPop").css("display","none");
		$("#confirmationPop").css("visibility","hidden");
		
	});
	
	$("#btContinue").click(function(){ 
		$("#confirmationPop").css("display","none");
		$("#confirmationPop").css("visibility","hidden");
		$("#progressBar").css("display","block"); 
		$("#progressBar").css("visibility","visible");
	});
	
	$("#btOKResultPop").click(function(){ 
		$("#justOKPopResult").val("OK");
		$("#copyUserTemp").val($("#userTemp").val());
		$("#copyClientCategoryId").val($("#clientCategoryId").val());
		
		$("#copyUserLoginTo").val($("#txtUserLoginTo").val());
		$("#resultPop").css("display","none");   
		$("#resultPop").css("visibility","hidden");	
	});

    
	$("body").click(function(){ 
		$("#selectUsersTag").css("display","none");   
		$("#selectUsersTag").css("visibility","hidden");
		
	});
	
 }); 
/*  ]]> */