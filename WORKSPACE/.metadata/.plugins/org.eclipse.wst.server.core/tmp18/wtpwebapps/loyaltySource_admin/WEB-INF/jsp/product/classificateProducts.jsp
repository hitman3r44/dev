<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript"
	src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript">
	$("#topMenuRed").hide();
</script>


<style type="text/css">
label {
	width: 170px;
}

.vanadium-advice {
	margin-left: 170px;
}

input.vanadium-valid {
	background-image: none;
}

</style>
<div class="unit" style="width: 800px; margin-left: 100px;">
	<div class="pop_title" style="margin-top: 30px;">Products Classification</div>

	<div id="formContainer" style="height: auto;">

		<s:if test="hasActionErrors()">
			<div id="globalAdvice" class="gray_bg global-vanadium-advice">
				<s:iterator value="actionErrors">
					<span><s:property escape="false" /> </span>
					<br />
				</s:iterator>
			</div>
		</s:if>
		<br /> <br />
  <%int i=1;%>
  <!-- ............................. Search Classification ............................ -->
  <table id="tabLogin" width="300px" border="0">
				<!-- .................... Template .................... -->
				<tr height="60px"  style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 						   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
				<td width="5px"/>
				<td width="70px">Template:</td>
				<td width="140px"><s:select id="templateId"
						name="clientCategoryId" cssStyle="width:140px;"
						list="listClientCategory" emptyOption="false" 
						listKey="clientCategoryId" listValue="clientCategoryName"/></td>
				<td style="padding-left:30px; height: 60px;cursor: pointer;"><img id="iconFindProduct" src="images/find.png"/></td>
				
				</tr>					
				<!-- ...................... Line separator ............. -->
				<tr height="10px">
				<td colspan="2"/>
				</tr>
				<!-- .................................................... -->						
    </table>

	<table id="tabGetXLS">
		<tr height="50px" valign="middle">
			<td id="productDTOListSize" width="110px">Result:<s:property	value="%{productDTOList.size}" /></td>
			<td width="80px"><img id="imgGetXLS" src="images/xls.png" style="cursor: pointer;" /></td>
		</tr>
	</table>
	<!-- Products List table -->
	<table id="productListTab" border="1" cellspacing="0" cellpadding="0"
		class="pad_5px nowraptable datatable" width="1590px">
		<thead class="gray_header">
			<tr>
				<th>NUM</th>
				<th>PRODUCT_ID</th>
				<th>LS_PRODUCT_ID</th>
				<th>CATEGORY_NAME</th>
				<th>BRAND_NAME</th>
				<th>MSRP</th>
				<th>OUT_COST</th>
				<th>PRICE</th>
				<th>PROFIT</th>
				<th>DISCOUNT</th>
				<th width="100px">QT_SOLD_3MONTHS</th>
				<th>CLASSIFICATION</th>
				<th width="300px">DESCRIPTION</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="productDTOList" id="productDTO">
				<tr id="productRow" height="30px" style="cursor: pointer;">
					<td><%=i++%></td>
					<td><s:property value="#productDTO.id"/></td>
					<td><s:property value="#productDTO.LoyaltyProductId"/></td>
					<td><s:property value="#productDTO.category.name"/></td>
					<td><s:property value="#productDTO.brand.name"/></td>
					<td><s:property value="#productDTO.msrp"/></td>
					<td><s:property value="#productDTO.cost"/></td>
					<td><s:property value="#productDTO.priceProduct"/></td>
					<td><s:property value="#productDTO.profit"/>%</td>
					<td><s:property value="#productDTO.discount"/></td>
					<td><s:property value="#productDTO.qtSold"/></td>
					<td>
					<s:if test="%{#productDTO.classification!=null}">
						<s:property value="getText('{0,number,#,##0.00}', {#productDTO.classification})" />
					</s:if>
					</td>
					<td><s:property value="#productDTO.descriptiProduct"/></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<!-- Products List table -->

	<!-- FORM FOR DISPLAY PRODUCT LIST BY TEMPLATE --> 
   <s:form id="form" action="classificateProducts.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="frmTemplateId" name="templateId" value="-1" />
   </s:form>
	<!-- FORM FOR DISPLAY PRODUCT LIST BY TEMPLATE --> 	
	
	
	<!-- FORM FOR DOWNLOAD Admin.xls --> 
   <s:form id="formProductAdminXLS" action="productAdminXLS.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="frmTmpid" name="tmpid" value="-1" />
    	<s:hidden id="frmInit" name="init" value="-1" /> 
   </s:form>
	
		
	</div>
	<div class="pop_title" style="margin-top: 30px;"></div>
</div>


<script type="text/javascript" charset="utf-8">

// Jquery Function main 
var balance=0;
var rowSelected=-1;
var lastRowSelected=-1;

$(document).ready(function() { 

	/*----------------------------- Disabled Enter and BackSpace ----------------------------- 
	 					This method is very imported for disable 
	 				undesirable behavior of BackSpace and Enter Key 
	  ----------------------------------------------------------------------------------------*/
	$(document).keydown(function(e){
		   if (e.keyCode == 8 || e.keyCode == 13 || e.keyCode == 32) { 
			 if(e.target.tagName!="INPUT")return false;
			}
		});
	
	/*---------------------------------------- Color Row -----------------------------------------
							when Admin selected Row, colored it in yellow
	--------------------------------------------------------------------------------------------*/ 
	$('#productListTab tr[id="productRow"]').click( function() {
		if(lastRowSelected>-1){
			$('#productListTab tr[id="productRow"]').eq(lastRowSelected).css("background-color",csslastRowSelected);
		}
		rowSelected=$('#productListTab tr[id="productRow"]').index(this);
		csslastRowSelected=$('#productListTab tr[id="productRow"]').eq(rowSelected).css("background-color");
		lastRowSelected=rowSelected;
		$('#productListTab tr[id="productRow"]').eq(rowSelected).css("background-color","#FFFF99");
	});

	/*-------------------------------------- Find Product ----------------------------------------
						 When Admin click on the icon find.png 
	  -------------------------------------------------------------------------------------------*/
	$("#iconFindProduct").click( function(){
		//$("#findProductSignal").val(1);
		var templateId=$("#templateId").val();
		$("#frmTemplateId").val(templateId);
		$('#form').trigger("submit");
	});

	/*-------------------------------------- Change image size -----------------------------------
						 When Admin point on the icon find.png 
	  -------------------------------------------------------------------------------------------*/
	//when Admin Point on the button Find Product 
	$("#iconFindProduct").mouseover( function(){
		$("#iconFindProduct").css('width','30px');
		$("#iconFindProduct").css('hight','30px');
	});

	$("#iconFindProduct").mouseout( function(){
		$("#iconFindProduct").css('width','24px');
		$("#iconFindProduct").css('hight','24px');
	});

	/*-------------------------------------- Download XLS File ----------------------------------
								When Admin click on the icon imgGetXLS  
	  -------------------------------------------------------------------------------------------*/
	//when Admin Point on the button Find Product 
	$("#imgGetXLS").click( function(){
		$("#frmInit").val(1);
		var templateId=$("#templateId").val();
		$("#frmTmpid").val(templateId);
		$('#formProductAdminXLS').trigger("submit");
	});	
	
	/*-------------------------------------- Change image size -----------------------------------
	 							When Admin point on the icon imgGetXLS 
	 -------------------------------------------------------------------------------------------*/
	//when Admin mouve mouse on getXLS image 
	$('#imgGetXLS').mouseover( function() {
		$('#imgGetXLS').attr("width","40");
		$('#imgGetXLS').attr("higth","40");
	});
	$('#imgGetXLS').mouseout( function() {
		$('#imgGetXLS').attr("width","32");
		$('#imgGetXLS').attr("higth","32");
	});	

});

</script>
