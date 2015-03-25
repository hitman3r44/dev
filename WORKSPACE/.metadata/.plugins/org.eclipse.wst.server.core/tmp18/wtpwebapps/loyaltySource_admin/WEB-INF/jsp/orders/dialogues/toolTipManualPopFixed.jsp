<style type="text/css" >

#toolTipManualPopFixed {
     position:absolute;
    z-index: 700;
    top:8px;
	left:20px;
	padding-right: 3px;
	/*height:60px;*/
	background-color:white transparent transparent transparent;
    
}

/*
.arrow_box { 
	position: relative; 
	background: #FFFF99; 
	border: 1px solid #a0c7ff; 
} 
.arrow_box:after, .arrow_box:before { 
	right: 100%; 
	top: 50%; 
	border: solid transparent; 
	content: " "; 
	height: 0; 
	width: 0; 
	position: absolute; 
	pointer-events: none; 
} 
.arrow_box:after { 
	border-color: rgba(255, 255, 153, 0); 
	border-right-color: #FFFF99; 
	border-width: 30px; 
	margin-top: -30px; 
} 
.arrow_box:before { 
	border-color: rgba(160, 199, 255, 0); 
	border-right-color: #a0c7ff; 
	border-width: 31px; margin-top: -31px; 
}
*/

/*
.arrow_box { 
	position: relative; 
	background: #FFFF99; 
	border: 1px solid #a0c7ff; 
} 
.arrow_box:after, .arrow_box:before { 
	top: 100%; 
	left: 50%; 
	border: solid transparent; 
	content: " "; 
	height: 0; 
	width: 0; 
	position: absolute; 
	pointer-events: none; } 
.arrow_box:after { 
	border-color: rgba(255, 255, 153, 0); 
	border-top-color: #FFFF99; 
	border-width: 50px; 
	margin-left: -50px; 
} 
.arrow_box:before { 
	border-color: rgba(160, 199, 255, 0); 
	border-top-color: #a0c7ff; 
	border-width: 51px; 
	margin-left: -51px; 
}
*/

.arrow_box { position: relative; background: #FFFF99; border: 1px solid #a0c7ff; } .arrow_box:after, .arrow_box:before { top: 100%; left: 50%; border: solid transparent; content: " "; height: 0; width: 0; position: absolute; pointer-events: none; } .arrow_box:after { border-color: rgba(255, 255, 153, 0); border-top-color: #FFFF99; border-width: 35px; margin-left: -35px; } .arrow_box:before { border-color: rgba(160, 199, 255, 0); border-top-color: #a0c7ff; border-width: 36px; margin-left: -36px; }



</style>

<center id="toolTipManualPopFixed" style="display:block;visibility:visible; width: 160px;">
<center id="toolTip_arrow" class="arrow_box">
    <p id="message" style="color: red;font-weight:bold; margin-bottom:5px;margin-top:5px;margin-right:5px;"></p>  
</center>
</center>

