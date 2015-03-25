<%@ taglib uri="/struts-tags" prefix="s" %>
<!-- PRODUCT LISTING -->
<div class="fixed column" style="margin:46px 20px 0px 40px;">
<div id="breadcrumb"></div>
<div style="text-align:right;margin-bottom:20px;"> </div>
<div class="columns" style="width:680px;margin-bottom:30px;"> 

<s:if test="#isLogin">

<table id="tabSalesItem" border="0" style="direction: ltr;table-layout: fixed;" width="100%">
	<s:iterator value="rectangularProList" id="saleColumn">
		     
		     <tr id="trSalesItem">
		     <s:iterator value="#saleColumn.listProductDTO" id="saleItem">
			     <td height="180px" valign="top" align="center" style="<s:property value="#saleItem.css" />">
			     <div class="listing_product_brand"><s:property value="#saleItem.brand.name" /></div>
			     <a id="productSelectedId"  href="<s:property value="#saleItem.hrefName" />" title="">
					 <img title='<s:property value="#saleItem.nameEng.name" />'
					 src='/media/product/<s:text name="#saleItem.image.name" />'
					 alt='<s:text name="#saleItem.image.name" />' 
					 width="120" 
					 height="120"/>
				 </a>
				 <div class="listing_link_product">
					 <div>
						<a  href="<s:property value="#saleItem.hrefName" />" title="">
							<s:property value="#saleItem.nameEng.name" />
						</a>
					</div>
			    </div>
			    <s:property value="#saleItem.price" />
				<!-- <s:if test="#isLogin"> -->
				
					<div class="listing_product_price" style="padding:8px 12px 8px 0px;color:#000;text-decoration: line-through;color:red;">
						$ <s:property value="#saleItem.regularPrice" />
					</div>
				
					<div class="listing_product_price">  
   						$ <s:property value="#saleItem.priceProduct" />
					</div>
				<!-- </s:if> -->

			     </td>
		     </s:iterator>
		     </tr>  
	</s:iterator>
</table>

<s:if test="rectangularProList.size==0">
	<div class="columns">  
   		<s:text name="%{getText('loyauty.search.text.short.noMatchingRecordsFound')}" />
	</div>
</s:if>	

 <br/> <br/> <br/> <br/>

<s:hidden id="proListSizeId" name="sizeList" value="%{rectangularProList.size}"></s:hidden>
<s:hidden id="indexPageId" name="init" value="%{init}"></s:hidden>

<!-- ........................Paging .......................  --> 
  <table align="center" border="0" width="50%">

	  <tr id="trPageIndex" style="clear:both;text-align:center;text-decoration: underline;cursor:pointer;" class="page_browsing">
	  	  <td id="tdPageIndexPrevious"  align="center">
		   Previous
		  </td>
		  <s:iterator value="indexList" id="indexPage">
		  <td id="tdPageIndex"  align="center">
		  <s:property value="#indexPage"/>
		  </td>
		  </s:iterator>
		  
		  <td id="tdPageIndexNext"  align="center">
		   Next
		  </td>
	  </tr>
  </table>
  <!-- ........................Paging .......................  -->

</s:if>

<!-- END PAGINATION-->	
</div>

</div>
<!-- PRODUCT LISTING -->
 
<script type="text/javascript">

var ITEMS_COUNT_IN_COLUMN=3;
var COLUMNS_IN_PAGE=4;
var indexPage=1;
displaySalesItemPage(indexPage);
function displaySalesItemPage(indexPage){
	$('#tabSalesItem #trSalesItem').hide();
	indexPage=$('#indexPageId').val();
	//alert(indexPage);
	var start=(indexPage-1)*COLUMNS_IN_PAGE;
	var end=(start+1)*COLUMNS_IN_PAGE;
	for(i=start;i<end;i++){
		$('#tabSalesItem #trSalesItem').eq(i).show(); 
	}
	$('#trPageIndex #tdPageIndex').css("color","black");
	$('#trPageIndex #tdPageIndex').eq(indexPage-1).css("color","red");
	
}

$(document).ready( function() {
	
	
	$('#trPageIndex #tdPageIndex').click( function(){
		indexPage=$('#trPageIndex #tdPageIndex').index(this);
		indexPage++;
		$('#trPageIndex #tdPageIndex').css("color","black");
		$('#trPageIndex #tdPageIndex').eq(indexPage-1).css("color","red");
		$('#indexPageId').val(indexPage);
		displaySalesItemPage(indexPage);
		var x;
		for(i=0;i<30;i++){
			 x = $('#trSalesItem #productSelectedId').eq(i).attr('href');
			$('#trSalesItem #productSelectedId').eq(i).attr('href',x+"?init="+indexPage);	
		}
		
	//alert($('#trSalesItem #productSelectedId').eq(1).attr('href'));

	});

	$('#trPageIndex #tdPageIndexPrevious').click( function(){
		if(indexPage>1)indexPage=indexPage-1;
		$('#trPageIndex #tdPageIndex').css("color","black");
		$('#trPageIndex #tdPageIndex').eq(indexPage-1).css("color","red");
		$('#indexPageId').val(indexPage);
		displaySalesItemPage(indexPage);
	});

	$('#trPageIndex #tdPageIndexNext').click( function(){
		proListSize=$('#proListSizeId').val();
		if((proListSize-indexPage*COLUMNS_IN_PAGE)>0)indexPage=indexPage+1;
		$('#trPageIndex #tdPageIndex').css("color","black");
		$('#trPageIndex #tdPageIndex').eq(indexPage-1).css("color","red");
		$('#indexPageId').val(indexPage);
		displaySalesItemPage(indexPage);
	});
	
});
</script>
