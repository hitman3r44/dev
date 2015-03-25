<style type="text/css" >

#toolTipCurrencyPop {
    position:absolute;
    z-index: 700;
    top:8px;
	left:10px;
	padding-right: 0px;
	/*height:60px;*/
	background-color:white transparent transparent transparent;
    
}

#toolTip {
    position:relative;
}

#toolTip p {
    padding:10px;
    /*background-color:#f9f9f9;*/
    background-color:#FFFF99;
    border:solid 1px #a0c7ff;
    -moz-border-radius:5px;-ie-border-radius:5px;-webkit-border-radius:5px;-o-border-radius:5px;border-radius:5px;
}

#tail1 {
    position:absolute;
    bottom:-20px;
    left:48%;
    width:0;height:0;
    border-color:#a0c7ff transparent transparent transparent;
    border-width:10px;
    border-style:solid;
}

#tail2 {
    position:absolute;
    bottom:-18px;
    left:48%;
    width:0;height:0;
    border-color:#f9f9f9 transparent transparent transparent;
    border-width:10px;
    border-style:solid;
}

</style>

<center id="toolTipCurrencyPop" style="display:none;visibility:hidden;">
<center id="toolTip">
    <p id="message" style="color: blue; font-weight: bold;"></p>
    <center id="tail1"></center>
    <center id="tail2"></center>
</center>
</center>

