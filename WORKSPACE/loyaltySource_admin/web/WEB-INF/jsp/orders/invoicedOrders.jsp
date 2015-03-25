<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript" src="scripts/jquery-ui.min.js"></script>
<script type="text/javascript" src="scripts/loyalty/order/orderManager.js"></script>


<script type="text/javascript">
	$("#topMenuRed").hide();

</script>

<style type="text/css">

label{
	width:100%;
}
.vanadium-advice {
	margin-left: 100%;
}
input.vanadium-valid {
	background-image: none;
}

.row_without_color {
	background-color:white;
}
.row_with_color {
	background-color: rgb(245,249,252);
}

</style>

<div id="divRoot" class="unit" style="width:1500px;margin-left:60px;">
<div class="pop_title" style="margin-top:30px;">Orders Invoiced</div>

  <div id="formContainer" style="padding-bottom: 60px;">
  <br/> 

  <s:form id="form" action="invoicedOrders.do" method="post" enctype="multipart/form-data">

 	<!-- .......... Hidden variables to use when admin do an action event ........ -->
 	<s:hidden id="orderSelected" name="orderSelected" value=""/>
 	<s:hidden id="showOrderSignal" name="showOrderSignal" value="0"/>
 	<s:hidden id="okShowOrderSignal" name="okShowOrderSignal" value="0"/>
 	<s:hidden id="lsOrderIdFRM" name="lsOrderId" value=""/>
 	<s:hidden id="indexOrder" name="indexOrder" value="-1"/>
 	<s:hidden id="indexRow" name="indexRow" value="-1"/>
 	<s:hidden id="checkBoxPrintSignal" name="checkBoxPrintSignal" value="0"/>
 	<s:hidden id="editOrderSignal" name="editOrderSignal" value="0"/>
 	<s:hidden id="saveOrdersSignal" name="saveOrdersSignal" value="0"/>
 	<s:hidden id="saveTemporaryRowSignal" name="saveTemporaryRowSignal" value="0"/>
 	<s:hidden id="cancelSignal" name="cancelSignal" value="0"/>
 	<s:hidden id="addSimilarRowSignal" name="addSimilarRowSignal" value="0"/>
 	<s:hidden id="deleteRowSignal" name="deleteRowSignal" value="0"/>
 	<s:hidden id="quantityToChangeSignal" name="quantityToChangeSignal" value="0"/>
 	<s:hidden id="duplicateOrderSignal" name="duplicateOrderSignal" value="0"/>
 	<s:hidden id="checkProductPriceSignal" name="checkProductPriceSignal" value="0"/>
 	<s:hidden id="sortingOrdersSignal" name="sortingOrdersSignal" value="0"/>
 	<s:hidden id="fieldForSorting" name="fieldForSorting" value="0"/>
 	<s:hidden id="showOrderDetailPop" name="showOrderDetailPop"/>
 	<s:hidden id="checkBoxPrint" name="checkBoxPrint"/>
 	<s:hidden id="pageTop" name="pageTop" value="0" />
 	<s:hidden id="scrollPageLeft" name="scrollPageLeft" value="0" />
 	<s:hidden id="scrollDivRowsTop" name="scrollDivRowsTop" value="0" />
 	<s:hidden id="okSaveSuccessPopSignal" name="okSaveSuccessPopSignal" value="0" />
 	<s:hidden id="saveShippingSignal" name="saveShippingSignal" value="0" />
 	<s:hidden id="deleteOrderSignal" name="deleteOrderSignal" value="0" />
 	<s:hidden id="dateBetweenSignal" name="dateBetweenSignal" value="0"/>
	<s:hidden id="invoicingDateBetween" name="invoicingDateBetween" value="0"/>
	<s:hidden id="checkBoxItem" name="checkBoxItem" value="null"/>
	<s:hidden id="checkBoxItem" name="checkBoxItem" value="null"/>
	<s:hidden id="selectAllOrdersSignal" name="selectAllOrdersSignal" value="0"/>
	
	
 	<!-- Pagination -->
 	<s:hidden id="pageIndexSignal" name="pageIndexSignal" value="0" />
 	<s:hidden id="nextListPagesSignal" name="nextListPagesSignal" value="0" />
 	<s:hidden id="prevListPagesSignal" name="prevListPagesSignal" value="0" />
 	<s:hidden id="prevListPages" name="prevListPages" value="0" />
 	<s:hidden id="indexSet" name="indexSet" value="-1" />
 	<s:hidden id="indexList" name="indexList" value="-1" />
 	<!-- Pagination -->
 	
 	<s:hidden id="confirmDeleteSignal" name="confirmDeleteSignal" value="0" />
 	<!-- Position detailPop -->
 	<s:hidden id="poYpop" name="poYpop" value="100" />
 	<s:hidden id="poXpop" name="poXpop" value="100" />
 	<!-- Find Options -->
 	<s:hidden id="findOrdersSignal" name="findOrdersSignal" value="0" />
 	<s:hidden id="frmUserLogin" name="userLogin" value="" />
 	<s:hidden id="frmStatus" name="status" value="" />
 	
 	<s:hidden id="frmSelectedStatus" name="selectedStatus" value="" />
 	<s:hidden id="frmStrCreationDate" name="strCreationDate" value=""/>
 	<s:hidden id="frmStrCreationDateStart" name="strCreationDateStart" value=""/>
 	<s:hidden id="frmStrCreationDateEnd" name="strCreationDateEnd " value=""/>
 	<!-- Data Order -->
 	<!-- TEST -->
 	<s:hidden id="strPrintFRM" name="strPrint" value="null" />
 	<s:hidden id="testSignal" name="testSignal" value="0" />
 	<!-- TEST -->
 	
 	<s:hidden id="newStatusFRM" name="newStatus" value="null" />
 	<s:hidden id="codeFRM" name="code" value="0" />
 	<s:hidden id="showRowShippingFRM" name="showRowShipping" value="0" />
	<s:hidden id="userIdFRM" name="userId" />
	<s:hidden id="productOrderNumberFRM" name="productOrderNumber" />
	<s:hidden id="productOrderDateFRM" name="strProductOrderDate" />
	<s:hidden id="creationDateFRM" name="strCreationDate" />
	<s:hidden id="creationOrderDateFRM" name="strCreationOrderDate" />
	<s:hidden id="requiredDateFRM" name="strRequiredDate" />
	<s:hidden id="clientLastNameFRM" name="clientLastName" value="" />
	<s:hidden id="clientFirstNameFRM" name="clientFirstName"  value="" />
	<s:hidden id="clientOtherNamesFRM" name="clientOtherNames"  value="" />
	<s:hidden id="clientStreetFRM" name="clientStreet"  value="" />
	<s:hidden id="clientOtherStreetFRM" name="clientOtherStreet"  value="" />
	<s:hidden id="clientCityFRM" name="clientCity"  value="" />
	<s:hidden id="clientProvinceFRM" name="clientProvince"  value="" />
	<s:hidden id="clientPostalCodeFRM" name="clientPostalCode"  value="" />
	<s:hidden id="clientPhoneFRM" name="clientPhone"  value="" />
	<s:hidden id="clientEmailFRM" name="clientEmail"  value="" />
	<!-- Data Row -->
	
	<s:hidden id="strShippingPriceFRM" name="strShippingPrice" value="" />
	<s:hidden id="strShippedDateFRM" name="strShippedDate" value="" />
	<s:hidden id="quantityFRM" name="quantity" value="-1" /> 
	<s:hidden id="quantityToChangeFRM" name="quantityToChange" value="-1" /> 
	<s:hidden id="lsProductIDFRM" name="lsProductID" value="" />
	<s:hidden id="stockFRM" name="stock" value="-1" />
	<s:hidden id="productDescriptionFRM" name="productDescription" value="" />
	<s:hidden id="unitPriceFRM" name="unitPrice" value="-1" />
	<s:hidden id="shippingFeeFRM" name="shippingFee" value="-1" />
	<s:hidden id="notesFRM" name="notes" value="" />
	<s:hidden id="shippingCompanyFRM" name="shippingCompany" value="" />
	<s:hidden id="trackingNumberFRM" name="trackingNumber" value="" />
 	</s:form>

	<!-- FORM FOR DOWNLOAD PDF --> 
   <s:form id="formToPrint" action="printOrdersToPDF.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="strPrintInPDFForm" name="strPrint" value="null" />
		<s:hidden id="tansformInvoicedSignal" name="tansformInvoicedSignal" value="0"/>
		<s:hidden id="printAllOrdersSignal" name="printAllOrdersSignal" value="0"/>
   </s:form>

	<!-- FORM FOR DOWNLOAD Admin.xls --> 
   <s:form id="formOrdersAdminXLS" action="ordersAdminXLS.do" method="post" enctype="multipart/form-data">
    	<s:hidden id="frmUserLogin" name="userLogin" value="" />
    	<s:hidden id="frmSelectedStatus" name="selectedStatus" value="" />
    	<s:hidden id="strPrintInAdminXLS" name="strPrint" value="null" />
  		<s:hidden id="invoicedOrderPageSignal" name="invoicedOrderPageSignal" value="0"/>
		<s:hidden id="selectedOrdersListSignal" name="selectedOrdersListSignal" value="0"/>
		<s:hidden id="allProgressListOrdersSignal" name="allProgressListOrdersSignal" value="0"/>  
   </s:form>
   
  <!-- ............................. TABLE USER LOGIN ............................ -->
  <table id="tabLogin" width="1000px">
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="7"/>
				</tr>
				<!-- ....................Search Options.................... -->
				<tr height="60px"  style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;
  		 						   border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;">
				<!-- ...Login... -->
				<td style="padding-left: 5px;width:80px;">Client Login:</td>
				<td>
					<div class="ui-widget">
		   			<span style="font-size:12px;">
		   			<s:textfield  id="txtUserLoginTo" name="userLogin" value="%{userLogin}" cssStyle="width:150px"  autocomplete="off" title="Hello KLF"/>
		   			</span>
		   			</div>
		   			<div style="position:absolute;">  
		   			 <select id="selectUsersTag"  name="sometext" size="2" multiple="multiple" class="selectUsersTag"
		   			 		 style="height:67px;width:150px;position:absolute;z-index:100;display:none;margin-right:20px;overflow:none;" scrolling="no">
					    <option></option>
					 </select>
		   			</div>
				</td>

				<!-- ...lsOrderId... -->
				<td style="padding-left: 5px;width:45px;">ls_Order_Id:</td>
				<td style="padding-left: 5px;"><s:textfield id="lsOrderIdSearch" name="lsOrderId" value="%{lsOrderId}" cssStyle="width:100px" /></td>

				<!-- ...Status... -->
				<td style="padding-left: 5px;width:45px;visibility:hidden;display:none;">Status:</td>
				<td style="padding-left: 5px;visibility:hidden;display:none;"><s:select label=""
	      				 						name="selectedStatus"
	      				  						headerKey="-1" headerValue="All Status"
       					  						list="#{'0':'Open', '1':'Progress', '2':'Shipped', '3':'invoiced'}"
       					 						value="%{selectedStatus}"
      					  						required="false"  cssStyle="width:100px"/></td>
				<!-- ...Creation Date Start... -->
				<td style="padding-left: 5px;width:140px;">
					<s:if test="%{invoicingDateBetween==null || invoicingDateBetween==0}" >
						<span  id="factorDateBetweenId" style="cursor:pointer;color: rgb(44,140,171);text-decoration:underline;">Invoiced Date </span> between:
					</s:if>
					<s:elseif test="%{invoicingDateBetween==1}">
						<span id="factorDateBetweenId" style="cursor:pointer;color: rgb(44,140,171);text-decoration:underline;">Shipped Date </span> between:
					</s:elseif>
					<s:elseif test="%{invoicingDateBetween==2}">
						<span id="factorDateBetweenId" style="cursor:pointer;color: rgb(44,140,171);text-decoration:underline;">PO Date </span> between:
					</s:elseif></td>
				<td style="padding-left: 5px;">
					<s:date id="creationDateStart" name="creationDateStart" var="creationDateStart" format="dd/MM/yyyy"/>
					<s:textfield id="creationDateStartPicker" name="strCreationDateStart" value="%{#creationDateStart}" 
					             key="labelkey" readonly="false" cssStyle="width:150px;" /></td>
				<!-- ...Creation Date End... -->            
				 <td style="padding-left: 5px;">
				 <s:date id="creationDateEnd" name="creationDateEnd" var="creationDateEnd" format="dd/MM/yyyy"/>
				 <s:textfield id="creationDateEndPicker" name="strCreationDateEnd" value="%{#creationDateEnd}" 
					             key="labelkey" readonly="false" cssStyle="width:150px;" /></td>
					             
			    
			    <td style="padding-left: 5px;"><img id="iconFindOrders" src="images/orders/findOrders.png"/></td>
				</tr>					
				<!-- ...................... Line separator ............. -->
				<tr height="5px">
				<td colspan="7"/>
				</tr>
				<!-- .................................................... -->						
    </table>

    <!-- ............................ List users .................................. --> 
	<select id="list"  style="visibility:hidden;display:none;">
		<s:iterator value="%{usersList}" id="row">
			        <s:iterator value="%{#row}" id="cell">
					    <option>
						<s:property value="%{#cell.login}"/> 
						</option>
					</s:iterator>           
		</s:iterator> 
	</select> 
 <!-- .......................................................................... -->


 <!-- .......... Operations: get XLS Canada Post, XLS, print Selected orders and print ALL ...... -->
  <br/>
  <table id="tabPrintAndXLS">
	<tr height="50px" valign="middle">
		<td id="listOrderDTOSize" width="100px">
	  		Result/Page:<s:property value="%{listOrdersDTO.size}"/>
		</td>
		<td width="129px">
	  		Total:<s:property value="%{totalInvoicedOrders}"/>
		</td>
		
		<s:if test="%{listOrdersDTO.size > 0}" >
		
		<td width="80px" style="visibility:hidden;display:none;">
	  		<img id="imgGetAdminXLSEST" src="images/orders/xlsEst.png" style="cursor:pointer;"/>
		</td>
		
		<td width="80px">
	  		<img id="imgGetAdminXLS" src="images/orders/xls.png" style="cursor:pointer;"/>
		</td>
		<td width="80px">
	   		<img id="imgPrintOrders" src="images/orders/printSelected.png" style="cursor:pointer;"/>
		</td>	
		<td width="80px" style="visibility:hidden;display:none;">
	   		<img id="imgPrintAllOrders" src="images/orders/printAll.png" style="cursor:pointer;"/>
		</td>
		<td>
	   		<img id="imgGetInvoicedXLS" src="images/orders/xlsInvoiced.png" style="cursor:pointer;"/>
		</td>
		</s:if>
	</tr>
   </table>
  <s:hidden id="sizeResult" name="sizeResult" value="%{listOrdersDTO.size}"/>

  <!-- ............................. Orders List ............................... -->
 <br/> 
<table id="tabOrderOrders" width="5050px" border="0" class="nowraptable datatable" style="align:left;cursor:default;table-layout: fixed;">
	<thead class="gray_header">
		<tr height="30px">
			<td width="45px" ><img style="cursor: pointer;margin-left:10px;" id="imgSelectAllPO" alt="" src="images/orders/selectAllPO.png"  /></td>
			<td width="20px" style="padding-right: 10px;"><img style="cursor: pointer;align: right;" id="imgSort" alt="" src="images/orders/selectSommePO.png" /></td>
			<td width="135px" style="padding-left: 5px;border-left:1px solid white;border-right:1px solid white;">Partner Name<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="134px" style="padding-left: 5px;border-left:1px solid white;border-right:1px solid white;visibility:hidden;display:none;padding-right:10px;">Row order ID<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>
			<td width="220px" style="padding-left: 10px;border-right:1px solid white;">LS Order ID<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="103px" style="padding-left: 10px;border-right:1px solid white;">PO Date<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">Required Date<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="120px"  style="padding-left: 10px;border-right:1px solid white;">Status<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>	
			<td style="visibility:hidden;display:none;"><img id="imgSort" src="" /></td>
			<td width="130px" style="padding-left: 10px;border-right:1px solid white;">LS Product ID<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="90px"  style="padding-left: 10px;border-right:1px solid white;">Quantity<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="90px"  style="padding-left: 10px;border-right:1px solid white;">STOCK<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="180px" style="padding-left: 10px;border-right:1px solid white;">Product Title<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">Unit Price<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">LS Price<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="132px" style="padding-left: 10px;border-right:1px solid white;">Unit Price Currency</td>
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">LS Price Currency</td>
			<td width="170px" style="padding-left: 10px;border-right:1px solid white;">Notes<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">PO number<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="160px" style="padding-left: 10px;border-right:1px solid white;">Client Product number<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="120px" style="padding-left: 10px;border-right:1px solid white;">Client Order ID<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>
			
			<td width="165px" style="padding-left: 10px;border-right:1px solid white;">Client Other ID<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>
				
			<td width="150px" style="padding-left: 10px;border-right:1px solid white;">Client First Name<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="150px" style="padding-left: 10px;border-right:1px solid white;">Client Last Name<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="130px" style="padding-left: 10px;border-right:1px solid white;">Client Other Names<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="100px" style="padding-left: 10px;border-right:1px solid white;">Client Number<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="170px" style="padding-left: 10px;border-right:1px solid white;">Client Street<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="170px" style="padding-left: 10px;border-right:1px solid white;">Client Other Address<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="100px" style="padding-left: 10px;border-right:1px solid white;">Client City<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="110px" style="padding-left: 10px;border-right:1px solid white;">Client Province<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="130px" style="padding-left: 10px;border-right:1px solid white;">Client Postal Code<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="100px" style="padding-left: 10px;border-right:1px solid white;">Client Phone<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="180px" style="padding-left: 10px;border-right:1px solid white;">Client Email<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>	
			<td width="170px" style="padding-left: 10px;border-right:1px solid white;">Shipping Company<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="135px" style="padding-left: 10px;border-right:1px solid white;">Shipped Date<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td width="170px" style="padding-left: 10px;border-right:1px solid white;">Tracking Number<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>	
			<td width="110px" style="padding-left: 10px;border-right:1px solid white;">Shipping Price<img id="imgSort" src="" style="visibility:hidden;display:none;padding-right:10px;"/></td>
			<td width="95px" style="padding-left: 10px;border-right:1px solid white;">Billed<img id="imgSort" src="images/orders/sortColumn.png" align="right" style="vertical-align:middle;cursor:pointer;padding-right:10px;"/></td>
			<td style="background-color: white;border-right:0px solid white;">Billed</td>
		</tr>
	</thead>
	<tbody>
	 <s:if test="%{listOrdersDTO.size > 0}" >
	 <tr>
	 <td colspan="34">
	<div  id="divRowsOrder" style="overflow-y: auto;width:5050px;direction: rtl;text-align: left;max-height:520px;height:520px;cursor:default;padding-bottom: 10px;overflow-x:hidden;">
	<table style="direction: ltr;table-layout: fixed;" width="5050px">
	<s:iterator value="listOrdersDTO" id="order">
		              
			<tr height="45px" id="rowOrder" style='<s:property value="#order.CssStyle"/><s:property value="#order.cssRow"/>font-size: 12px;border-bottom:1px solid #CCCCCC;border-right:1px solid white;'>
			<td id="columnInfoNotCompleted" width="19px" align="right"  style="padding-left:20px;">
			<s:if test='%{infoMissing==1}'>
			<img id="infoMissingDiv" src="images/orders/infoMissing.png">
			</s:if></td>
			<td align="center" width="35px">
			<s:checkbox id="checkBoxItem" name="checkBoxItem" value="%{checkBoxItem}" disabled="%{checkBoxItem}"/></td>
			<td id="columnIndexOrder" style="visibility:hidden;display:none;"><s:property value="#order.index"/></td>
			<td width="125px" style="border-left:1px solid #CCCCCC;border-right:1px solid #CCCCCC;padding-left: 10px; padding-right: 5px;padding-top:5px;padding-bottom:5px;"><s:property value="#order.userLogin"/></td>
			<td width="125px" style="border-left:1px solid #CCCCCC;border-right:1px solid #CCCCCC;padding-left: 10px; padding-right: 5px;padding-top:5px;padding-bottom:5px;visibility:hidden;display:none;padding-right:10px;"><s:property value="#order.id"/></td>
			<td id="columnRowOrderId" width="220px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;font-weight: bold;color:black;overflow: hidden;text-overflow: ellipsis;cursor:pointer;"><s:property value="#order.lsOrderId"/></td>
			<td width="102px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.creationDate" /></td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.requiredDate"/></td>
			<td width="120px"  style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.status"/></td>
			<td style="visibility:hidden;display:none;"><img id="imgSort" src="" /></td>
			<td width="130px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.lsProductID"/></td>
			<td width="90px"  style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.quantity"/></td>
			<td width="90px"  style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.stock"/></td>
			<td width="180px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.productDescription"/></td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.unitPrice"/></td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.lsPrice"/></td>
			<td width="132px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test='%{#order.currencyId != 1}' >
					<span style="color:rgb(36,81,180);">
						<s:property value="#order.currencyUnitPrice"/> <s:property value="#order.currencySymbol"/>
					</span>
				</s:if>
			</td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test='%{#order.currencyId != 1}' >
					<span style="color:rgb(36,81,180);">
						<s:property value="#order.currencyPrice"/> <s:property value="#order.currencySymbol"/>
					</span>
				</s:if>
			</td>
			<td width="170px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test="showRowShipping==0">
					<s:property value="#order.notes"/>
					<a id="editNotes" href="#" style="align:rigth;"> Edit</a>
					<center id="saveNotes"></center>
					<center id="notes"></center>
				</s:if>
				<s:else>
					<s:textfield id="notes" name="notes" value="%{notes}" cssStyle="width:115px"/><a id="saveNotes" href="#" style="align:rigth;"> Save</a><center id="editNotes"></center>
				</s:else></td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.productOrderNumber"/></td>
			<td width="160px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientProductNumber"/></td>
			<td width="120px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientOrderNumber"/></td>
			
			<td width="165px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientOtherId"/></td>
			
			<td width="150px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientFirstName"/></td>
			<td width="150px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientLastName"/></td>
			<td width="130px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientOtherNames"/></td>
			<td width="100px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientNumber"/></td>
			<td width="170px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientStreet"/></td>
			<td width="170px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientOtherStreet"/></td>
			<td width="100px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientCity"/></td>
			<td id="clientProvince" width="110px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientProvince"/></td>
			<td width="130px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientPostalCode"/></td>
			<td width="100px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientPhone"/></td>
			<td width="180px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.clientEmail"/></td>
			<td width="170px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test="showRowShipping==0">
					<s:property value="#order.shippingCompany"/>
					<a id="editShippingCompany" href="#" style="align:rigth;"> Edit</a>
					<center id="saveShippingCompany"></center>
					<center id="shippingCompany"></center>
				</s:if>
				<s:else>
					<s:textfield id="shippingCompany" name="shippingCompany" value="%{shippingCompany}" cssStyle="width:110px"/><a id="saveShippingCompany" href="#" style="align:rigth;"> Save</a><center id="editShippingCompany"></center>
				</s:else></td>
			<td width="135px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test="showRowShipping==0">
					<s:property value="#order.shippedDate" /><a id="editShippedDate" href="#" style="align:rigth;"> Edit</a>
					<center id="saveShippedDate"></center>
				</s:if>
				<s:else>
					<input type="text" id="saveShippedDatePicker" name="strShippedDate" value='<s:property value="#order.shippedDate" />' style="width:80px;"/><a id="saveShippedDate" href="#" style="align:rigth;"> Save</a><center id="editShippedDate"></center>
				</s:else></td>
			<td width="170px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test="showRowShipping==0">
					<s:property value="#order.trackingNumber"/>
					<a id="editTrackingNumber" href="#" style="align:rigth;"> Edit</a>
					<center id="saveTrackingNumber"></center>
					<center id="trackingNumber"></center>
				</s:if>
				<s:else>
					<s:textfield id="trackingNumber" name="trackingNumber" value="%{trackingNumber}" cssStyle="width:115px;"/><a id="saveTrackingNumber" href="#" style="align:rigth;"> Save</a><center id="editTrackingNumber"></center>
				</s:else></td>
			<td width="110px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;">
				<s:if test="showRowShipping==0">
					<s:property value="#order.shippingPrice"/>
					<a id="editShippingPrice" href="#" style="align:rigth;"> Edit</a>
					<center id="saveShippingPrice"></center>
					<center id="shippingPriceToEdit"></center>
				</s:if>
				<s:else>
					<s:textfield id="shippingPriceToEdit" name="strShippingPrice" value="%{shippingPrice}" cssStyle="width:60px;"/><a id="saveShippingPrice" href="#" style="align:rigth;"> Save</a><center id="editShippingPrice"></center>
				</s:else>
			</td>
			<td width="95px" style="border-right:1px solid #CCCCCC;padding-left: 5px; padding-right: 5px;padding-top:5px;padding-bottom:5px;overflow: hidden;text-overflow: ellipsis;"><s:property value="#order.invoicedDate"/></td>
			<td style="background-color: white;border:1px solid white;"></td>		
			</tr>	
	</s:iterator>
	</table>
	</div>
	</td>
	</tr>
	<tr height="30px" valign="middle" align="center">
	 	<td colspan="34"/>
	</tr>
	</s:if>
	</tbody>       
  </table>
  
  
  <!-- ........................Paging .......................  --> 
  <table align="center" id="tabPageIndex">
  	  <tr height="20px" valign="middle" align="center">
	 	<td colspan="13"/>
	  </tr>
	  <tr>
		  <td>
		  <s:if test="indexSet>10*PAGE_ITEMS_COUNT && listOrdersDTO.size>0"><!-- pagesNumber*resultRangeInDB -->
		  <img id="imgPrevListPages" src="images/orders/activePreviousPages.png"/>
		  </s:if>
		  <s:elseif test=" listOrdersDTO.size>0">
		   <img src="images/orders/desablePreviousPages.png"/>
		  </s:elseif>
		  </td>
		  <s:iterator value="listIndexSet" id="item">
		  <s:if test=" listOrdersDTO.size>0">
		  <td id="pageIndex" align="center" style='font-size: 14px; width: 50px;cursor:pointer;font-weight: bold;color: rgb(44,140,171);<s:property value="#item.cssStyle"/>'>
		  <s:hidden id="pageIndexHedden" name="pageIndexHedden" value="%{#item.index}"/>
		  <s:property value="#item.index"/>
		  </td>
		  </s:if>
		  </s:iterator>
		  <td>
		  <s:if test="((nextListPages+10)*PAGE_ITEMS_COUNT>totalInvoicedOrders) && listOrdersDTO.size>0"><!-- (nextListPages+pagesNumber)*resultRangeInDB -->
		  <img  id="imgNextPages"  src="images/orders/desableNextPages.png"/>
		  </s:if>
		  <s:elseif test=" listOrdersDTO.size>0">
		  <img id="imgNextPages" src="images/orders/activeNextPages.png"/>
		  </s:elseif>
		  </td>
	  </tr>
  </table>
  <!-- ........................Paging .......................  -->

  <!-- ...........................jsp fragment ................................. -->
 				<%@ include file="dialogues/toolTipReportPop.jsp" %>
   <!-- ......................................................................... -->

<script type="text/javascript" charset="utf-8">

// Jquery Function main 
var pageTop;
var scrollTop;
var scrollPageLeft;
var scrollDivRowsTop;
var balance=0;
var rowSelected=-1;
var lastRowSelected=-1;
var csslastRowSelected="";
var timerCounter=0;


/*----------------------------------- Refresh page --------------------------------------- 
					Refresh page after generation of pdf or XLS or CSV file 
  ----------------------------------------------------------------------------------------*/
var timer;
var generatePDF=0;
function horloge() {
	timerCounter++;
	if(timerCounter<=10){
		timer = window.setTimeout("horloge()", 5000);
	}else{
		window.clearTimeout(timer);
		window.location = window.location.href;
		timerCounter=0;
		}

	};


/*----------------------------------- Keep page position --------------------------------- 
		 					     keep page and div position 
  ----------------------------------------------------------------------------------------*/
$(function() {
	var pageTop = <%= request.getParameter("pageTop") %>;
	scrollPageLeft = <%= request.getParameter("scrollPageLeft") %>;
	scrollDivRowsTop = <%= request.getParameter("scrollDivRowsTop") %>;
	$(window).scrollTop(pageTop);
	$(window).scrollLeft(scrollPageLeft);
	$("#divRowsOrder").scrollTop(scrollDivRowsTop);
	// winker image of infoMissing 
	$('#columnInfoNotCompleted img[id="infoMissingDiv"]').effect("pulsate", { times:999}, 2000);
	// hide cities comboList in orderDetailPop 
});


/*------------------------------- Definition format date --------------------------------- 
								Definition of Format Date 
  ----------------------------------------------------------------------------------------*/

$(function() {
	$("#creationDateStartPicker").datepicker({
		dateFormat: 'dd/mm/yy',
		changeMonth: true,
		changeYear: true
	});
	$("#creationDateEndPicker").datepicker({
		dateFormat: 'dd/mm/yy',
		changeMonth: true,
		changeYear: true
	});
	$("#requiredDatePicker").datepicker({
		dateFormat: 'dd/mm/yy',
		changeMonth: true,
		changeYear: true
	}); 
	$("#saveShippedDatePicker").datepicker({
		dateFormat: 'dd/mm/yy',
		changeMonth: true,
		changeYear: true
	});
	
 });

$(function() {
	$("#creationOrderDate").datepicker({
	  dateFormat: 'dd/mm/yy',
      changeMonth: true,
      changeYear: true
    });
	$("#requiredDate").datepicker({
		  dateFormat: 'dd/mm/yy',
	      changeMonth: true,
	      changeYear: true
	    });
 });

$(document).ready(function() { 

	/*------------------------- check checkBox without submit -------------------------------- 
		Pour éviter d'aller à chaque changement du check box on utilise un string qui porte
		les valeurs de tous les check Box et une fois on click sur le un bouton de print ou
		getXSL on envoie juste cette string, c'est une méthode intelligente pour soulager 
		le server et pour éviter les secousse de barre de défilement
	  ----------------------------------------------------------------------------------------*/
	var arrayPrint = [];
	var sizeResult=$("#sizeResult").val();
	for(i=0;i<sizeResult;i++){
		arrayPrint[i] =false;
	};

	/*function createStrPrint(){
		var index=0;
		$('#tabOrderOrders input[id="checkBoxItem"]').each(function() {
			arrayPrint[index]=$(this).attr('checked');
			index++;
		});
		var strPrint="";
		for(i=0;i<arrayPrint.length;i++){
			if(arrayPrint[i]==true){
				strPrint+=i+";t,";
			}else{
				strPrint+=i+";f,";
			}
		};
		if(strPrint.length>0)strPrint = strPrint.substring(0, strPrint.length-1);
		$('#strPrintInPDFForm').val(strPrint);
		$('#strPrintInAdminXLS').val(strPrint);
		
	}*/
	
	function createStrPrint(){
		var index=0;
		$('#tabOrderOrders input[id="checkBoxItem"]').each(function() {
			arrayPrint[index]=$(this).attr('checked');
			index++;
		});
		var strPrint="";
		for(i=0;i<arrayPrint.length;i++){
			if(arrayPrint[i]=='checked'){
				strPrint+=i+";t,";
			}else{
				strPrint+=i+";f,";
			}
		};
		if(strPrint.length>0)strPrint = strPrint.substring(0, strPrint.length-1);
		$('#strPrintInPDFForm').val(strPrint);
		$('#strPrintInAdminXLS').val(strPrint);
	}

	/*----------------------------- Disabled Enter and BackSpace ----------------------------- 
	 					This method is very imported for disable 
	 				undesirable behavior of BackSpace and Enter Key 
	  ----------------------------------------------------------------------------------------*/
	$(document).keydown(function(e){
		   if (e.keyCode == 8 || e.keyCode == 13 || e.keyCode == 32) { 
			 if(e.target.tagName!="INPUT")return false;
			}
		});
	
	
	/*------------------------ ToolTipReport:InvoicedOrders ------------------------------------ 
	 			when Admin mouve the mouse on icons of the :"reportOrders.jsp"  
	  ----------------------------------------------------------------------------------------*/
	$('#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS').mouseover( function(){
		var indexAdminXLSEST=$('#tabPrintAndXLS   #imgGetAdminXLSEST').index(this);
		var indexAdminXLS=$('#tabPrintAndXLS  #imgGetAdminXLS').index(this);
		var indexPrintOrders=$('#tabPrintAndXLS #imgPrintOrders').index(this);
		var indexPrintAllOrders=$('#tabPrintAndXLS #imgPrintAllOrders').index(this);
		var indexInvoicedXLS=$('#tabPrintAndXLS #imgGetInvoicedXLS').index(this);
		var position;
		var showPop=0;
		if(indexAdminXLSEST>=0){
			position = $('#tabPrintAndXLS #imgGetAdminXLSEST').eq(indexAdminXLSEST).position();
			$('#toolTipReportPop #message').text("Select first Orders to get Canada Post CSV File");
			showPop=1;
		}
		if(indexAdminXLS>=0){
			position = $('#tabPrintAndXLS #imgGetAdminXLS').eq(indexAdminXLS).position();
			$('#toolTipReportPop #message').text("Get XLS File List");
			showPop=1;
		}
		if(indexPrintOrders>=0){
			position = $('#tabPrintAndXLS #imgPrintOrders').eq(indexPrintOrders).position();
			$('#toolTipReportPop #message').text("Select first Orders to print");
			showPop=1;
		}
		if(indexPrintAllOrders>=0){
			position = $('#tabPrintAndXLS #imgPrintAllOrders').eq(indexPrintAllOrders).position();
			$('#toolTipReportPop #message').text("Print All Orders List ");
			showPop=1;
		}
		if(indexInvoicedXLS>=0){
			position = $('#tabPrintAndXLS #imgGetInvoicedXLS').eq(indexInvoicedXLS).position();
			$('#toolTipReportPop #message').text("Select first Orders and Partner Name to get Invoiced Orders List");
			showPop=1;
		}
		var y=position.top;
		var height=$('#toolTipReportPop').height(); 
		y=(y-height);
		var x=position.left;
		var toolTipWidth=$('#toolTipReportPop').width();
		toolTipWidth=toolTipWidth/2;
		x=x-toolTipWidth;
		$("#toolTipReportPop").css('top',y-5);
		$("#toolTipReportPop").css('left',x+5);
		if(showPop==1){
			$('#toolTipReportPop').css("display","block"); 
			$('#toolTipReportPop').css("visibility","visible");
		}
	});
	//when Admin out the mouse on Item icons of the popup:"orderDetailPop" 
	$('#tabPrintAndXLS #imgGetAdminXLSEST,#imgGetAdminXLS,#imgPrintOrders,#imgPrintAllOrders,#imgGetInvoicedXLS').mouseout( function(){
		$('#toolTipReportPop').css("display","none"); 
		$('#toolTipReportPop').css("visibility","hidden");
	});

	/*------------------------------------- ToolTipReport:Date Between -------------------------------- 
	 	  when Admin mouve the mouse on the sentence "Shipped Date between" or "PO Date between"  
	  ------------------------------------------------------------------------------------------------*/
	$('#factorDateBetweenId').mouseover( function(){
		var position = $('#factorDateBetweenId').position();
		$('#toolTipReportPop #message').text("Click to toggle between Invoiced Date, Sipped Date and PO Date");
		var y=position.top;
		var height=$('#toolTipReportPop').height(); 
		y=(y-height);
		var x=position.left;
		var toolTipWidth=$('#toolTipReportPop').width();
		toolTipWidth=toolTipWidth/2;
		x=x-toolTipWidth;
		$("#toolTipReportPop").css('top',y-5);
		$("#toolTipReportPop").css('left',x+30);
		$('#toolTipReportPop').css("display","block"); 
		$('#toolTipReportPop').css("visibility","visible");
	});
	//when Admin move the mouse out the sentence "Shipped Date between" or "PO Date between" 
	$('#factorDateBetweenId').mouseout( function(){
		$('#toolTipReportPop').css("display","none"); 
		$('#toolTipReportPop').css("visibility","hidden");
	});

	/*------------------------------------- ToolTipReport:icone Print -------------------------------- 
	 			when Admin mouve the mouse on icon print of the :"reportOrders.jsp"  
	  ------------------------------------------------------------------------------------------------*/
	  $('#tabOrderOrders #imgSort,#imgSelectAllPO').mouseover( function(){
		var index=$('#tabOrderOrders #imgSort').index(this);
		var position;
		var showPop=0;
		if(index==0){
			position = $('#tabOrderOrders #imgSort').eq(index).position();
			$('#toolTipReportPop #message').text("Select All Orders In This Page");
			showPop=1;
		}
		var selectAllPO=$('#tabOrderOrders #imgSelectAllPO').index(this);
		if(selectAllPO==0){
			position = $('#tabOrderOrders #imgSelectAllPO').eq(index).position();
			$('#toolTipReportPop #message').text("Select All Orders");
			showPop=1;
		}
		var y=position.top;
		var height=$('#toolTipReportPop').height(); 
		y=(y-height);
		var x=position.left;
		var toolTipWidth=$('#toolTipReportPop').width();
		toolTipWidth=toolTipWidth/2;
		x=x-toolTipWidth;
		$("#toolTipReportPop").css('top',y-5);
		$("#toolTipReportPop").css('left',x+5);
		if(showPop==1){
			$('#toolTipReportPop').css("display","block"); 
			$('#toolTipReportPop').css("visibility","visible");
		}
	});
	//when Admin move the mouse out the icon print of the popup:"orderDetailPop" 
	$('#tabOrderOrders #imgSort,#imgSelectAllPO').mouseout( function(){
		var index=$('#tabOrderOrders #imgSort').index(this);
		if(index==0){
			$('#toolTipReportPop').css("display","none"); 
			$('#toolTipReportPop').css("visibility","hidden");
		}
		var selectAllPO=$('#tabOrderOrders #imgSelectAllPO').index(this);
		if(selectAllPO==0){
			$('#toolTipReportPop').css("display","none"); 
			$('#toolTipReportPop').css("visibility","hidden");
		}
	});

	/*----------------------- Switching between "PO Date" and "Shipped Date" --------------------
				 When Admin click sentens "PO Date" or "Shipped Date" in Search Options 
	  -------------------------------------------------------------------------------------------*/
	$("#factorDateBetweenId").click( function(){
		fillSarchParameters();
		$("#dateBetweenSignal").val(1);
		$('#form').trigger("submit");
	});

	/*------------------------------ Edit in the page reportOrder.jsp ---------------------------
				 					   Update shipping parameters 
	  -------------------------------------------------------------------------------------------*/
	  //When Admin click on  link "Edit", show shipping param in text field 
	$('#tabOrderOrders #editNotes,#editShippingCompany,#editTrackingNumber,#editShippedDate,#editShippingPrice,#statusToEdit').click( function(){
		var index=$('#tabOrderOrders #editNotes').index(this);
		if(index<0)index=$('#tabOrderOrders #editShippingCompany').index(this);
		if(index<0)index=$('#tabOrderOrders #editTrackingNumber').index(this);
		if(index<0)index=$('#tabOrderOrders #editShippedDate').index(this);
		if(index<0)index=$('#tabOrderOrders #editShippingPrice').index(this);
		if(index<0)index=$('#tabOrderOrders #statusToEdit').index(this);
		var indexOrderToEdit=$("#tabOrderOrders #columnIndexOrder").eq(index).text();
		$("#indexOrder").val(indexOrderToEdit);
		var code=$('#tabOrderOrders #clientProvince').eq(index).text();
		$('#codeFRM').val(code);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		scrollPageLeft=$(window).scrollLeft();
		$("#scrollPageLeft").val(scrollPageLeft);
		scrollDivRowsTop=$("#divRowsOrder").scrollTop();	
		$('#scrollDivRowsTop').val(scrollDivRowsTop);
		//fill search parameters 
		fillSarchParameters();
		$("#showRowShippingFRM").val(1);
		$('#form').trigger("submit");
	 });
	//when Admin click on any button "Save"
	$('#tabOrderOrders #saveNotes,#saveShippingCompany,#saveTrackingNumber,#saveShippedDate,#saveShippingPrice,#saveStatus').click( function(){
		var index=$('#tabOrderOrders #saveNotes').index(this);
		var statusId=-1;
		if(index<0)index=$('#tabOrderOrders #saveShippingCompany').index(this);
		if(index<0)index=$('#tabOrderOrders #saveTrackingNumber').index(this);
		if(index<0)index=$('#tabOrderOrders #saveShippedDate').index(this);
		if(index<0)index=$('#tabOrderOrders #saveShippingPrice').index(this);
		if(index<0){
			index=$('#tabOrderOrders #saveStatus').index(this);
			statusId=$('#tabOrderOrders #statusId').eq(index).val();
		}
		var indexOrderToEdit=$("#tabOrderOrders #columnIndexOrder").eq(index).text();
		var notes=$("#tabOrderOrders #notes").eq(index).val();
		var shippingCompany=$("#tabOrderOrders #shippingCompany").eq(index).val();
		var trackingNumber=$("#tabOrderOrders #trackingNumber").eq(index).val();
		var code=$('#tabOrderOrders #clientProvince').eq(index).text();
		var shppedDate=$('#tabOrderOrders #saveShippedDatePicker').eq(0).val();
		var strShippingPrice=$('#tabOrderOrders #shippingPriceToEdit').eq(index).val();
		
		//recovery status from list Box 
		var status = parseInt(statusId, 10);
		switch (status ) {
		case 0:
			$('#newStatusFRM').val("open");
			break;
		case 1:
			$('#newStatusFRM').val("progress");
			break;
		case 2:
			$('#newStatusFRM').val("shipped");
			break;
		case 3:
			$('#newStatusFRM').val("invoiced");
			break;
		default:$('#newStatusFRM').val("");
			break;
		}
		$("#strShippingPriceFRM").val(strShippingPrice);
		$("#strShippedDateFRM").val(shppedDate);
		$('#codeFRM').val(code);
		$("#notesFRM").val(notes);
		$("#shippingCompanyFRM").val(shippingCompany);
		$("#trackingNumberFRM").val(trackingNumber);
		$("#indexOrder").val(indexOrderToEdit);
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		scrollPageLeft=$(window).scrollLeft();
		$("#scrollPageLeft").val(scrollPageLeft);
		scrollDivRowsTop=$("#divRowsOrder").scrollTop();	
		$('#scrollDivRowsTop').val(scrollDivRowsTop);
		//fill search parameters 
		 fillSarchParameters();
		 $("#saveShippingSignal").val(1);
		$('#form').trigger("submit");
	 });
	

	/*---------------------------------------- Color Row -----------------------------------------
							when Admin selected Row, colored it in yellow
	  --------------------------------------------------------------------------------------------*/ 
	$('#tabOrderOrders tr[id="rowOrder"]').click( function() {
		if(lastRowSelected>-1){
			$('#tabOrderOrders tr[id="rowOrder"]').eq(lastRowSelected).css("background-color",csslastRowSelected);
		}
		rowSelected=$('#tabOrderOrders tr[id="rowOrder"]').index(this);
		csslastRowSelected=$('#tabOrderOrders tr[id="rowOrder"]').eq(rowSelected).css("background-color");
		lastRowSelected=rowSelected;
		$('#tabOrderOrders tr[id="rowOrder"]').eq(rowSelected).css("background-color","#FFFF99");
	});

	/*----------------------------- Download File XLS and CSV ---------------------------------------
							        Download File XLS and CSV 
	  -----------------------------------------------------------------------------------------------*/
	//when Admin mouve mouse on getXLS image 
	$('#imgGetAdminXLS').mouseover( function() {
		$('#imgGetAdminXLS').attr("width","40");
		$('#imgGetAdminXLS').attr("higth","40");
	});
	$('#imgGetAdminXLS').mouseout( function() {
		$('#imgGetAdminXLS').attr("width","32");
		$('#imgGetAdminXLS').attr("higth","32");
	});
	//when Admin mouve mouse on imgGetAdminXLSEST image 
	$('#imgGetAdminXLSEST').mouseover( function() {
		$('#imgGetAdminXLSEST').attr("width","40");
		$('#imgGetAdminXLSEST').attr("higth","40");
	});
	$('#imgGetAdminXLSEST').mouseout( function() {
		$('#imgGetAdminXLSEST').attr("width","32");
		$('#imgGetAdminXLSEST').attr("higth","32");
	});
	//Download File XLS:When Admin click on the Button imgGetAdminXLS 
	$('#imgGetAdminXLS').click( function(){
		$("#invoicedOrderPageSignal").val("1");
		$("#selectedOrdersListSignal").val("1");
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		createStrPrint();
		$('#formOrdersAdminXLS').trigger("submit");		
	});
	//Download File XLS:When Admin click on the Button imgGetInvoicedXLS 
	$('#imgGetInvoicedXLS').click( function(){
		$("#invoicedOrderPageSignal").val("1");
		$("#selectedOrdersListSignal").val("3");
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
	 	var userLogin=$("#txtUserLoginTo").val();
	 	$("#frmUserLogin").val(userLogin);
	 	var selectedStatus=$("#selectedStatus").val();
	 	$("#frmSelectedStatus").val(selectedStatus);
		createStrPrint();
		$('#formOrdersAdminXLS').trigger("submit");		
	});
	//Download File XLS For Canada Post:When Admin click on the Button imgGetAdminXLSEST 
	$('#imgGetAdminXLSEST').click( function(){
		$("#invoicedOrderPageSignal").val("1");
		$("#selectedOrdersListSignal").val("2");
		scrollTop=$(window).scrollTop();
		$("#pageTop").val(scrollTop);
		createStrPrint();
		$('#formOrdersAdminXLS').trigger("submit");		
	});
	/*-------------------------------------- Orders Sorting ------------------------------------
								when Admin click on the icon imgSort
	  ------------------------------------------------------------------------------------------*/
	$('#tabOrderOrders img[id="imgSort"]').click( function(){
		var index=$('#tabOrderOrders img[id="imgSort"]').index(this);
		if(index!=0){
			scrollPageLeft=$(window).scrollLeft();
			$("#scrollPageLeft").val(scrollPageLeft);
			scrollDivRowsTop=$("#divRowsOrder").scrollTop();	
			$('#scrollDivRowsTop').val(scrollDivRowsTop);
			if(index!=30 && index!=31 && index!=32 && index!=34) {
				$('#tabOrderOrders td').eq(index+1).css("background-color","red");
			} else {
				$('#tabOrderOrders td').eq(index+3).css("background-color","red");
			}
			//$('#tabOrderOrders td').eq(index+1).css("background-color","red");
			$('#fieldForSorting').val(index);
			//fill search parameters 
			 fillSarchParameters();
			$('#sortingOrdersSignal').val(1);	
			$('#form').trigger("submit");
		}else{
			var checkValues=$('#tabOrderOrders input[id="checkBoxItem"]').attr('checked');
			var checkDisableValues=$('#tabOrderOrders input[id="checkBoxItem"]').attr('disabled');
			if(checkDisableValues)return false;
			if(checkValues){
				$('#tabOrderOrders input[id="checkBoxItem"]').attr('checked',false);
			}else{
				$('#tabOrderOrders input[id="checkBoxItem"]').attr('checked',true);
			}
			createStrPrint();
		}
		
	});

	/*----------------------------------- Orders Select All ------------------------------------
								when Admin click on the icon imgSort
	  ------------------------------------------------------------------------------------------*/
	$('#tabOrderOrders img[id="imgSelectAllPO"]').click( function(){
		var index=$('#tabOrderOrders img[id="imgSelectAllPO"]').index(this);
		var checkValues=$('#tabOrderOrders input[id="checkBoxItem"]').is(':checked');
		//alert("checkValues:"+checkValues);
		$('#form #checkBoxItem').val(!checkValues);
		$('#form #selectAllOrdersSignal').val(1);
		alert($('#form #checkBoxItem').val());
		fillSarchParameters();
		$('#form').trigger("submit");	
	});

	/*----------------------------- Make divRowsOrder's cursor in default -----------------------
								    When Admin mouve mouse on divRowsOrder 
	  -------------------------------------------------------------------------------------------*/
	$('#divRowsOrder').mousemove( function(){
		$("#divRowsOrder").css('cursor','default');
	});

	/*-------------------------------------- Find Orders ----------------------------------------
						 When Admin click on the icon findOrders.png 
	  -------------------------------------------------------------------------------------------*/
	$("#iconFindOrders").click( function(){
		//fill search parameters 
		 fillSarchParameters();
		$("#findOrdersSignal").val(1);
		$('#form').trigger("submit");
	});

	/*------------------------------------ Print Orders -----------------------------------------
						     		 Select and print Orders  
	  -------------------------------------------------------------------------------------------*/
	//when Admin mouve mouse on printSelected image 
	$('#imgPrintOrders').mouseover( function() {
		$('#imgPrintOrders').attr("width","40");
		$('#imgPrintOrders').attr("higth","40");
	});
	$('#imgPrintOrders').mouseout( function() {
		$('#imgPrintOrders').attr("width","32");
		$('#imgPrintOrders').attr("higth","32");
	});
	//when Admin mouve mouse on printAll image 
	$('#imgPrintAllOrders').mouseover( function() {
		$('#imgPrintAllOrders').attr("width","40");
		$('#imgPrintAllOrders').attr("higth","40");
	});
	$('#imgPrintAllOrders').mouseout( function() {
		$('#imgPrintAllOrders').attr("width","32");
		$('#imgPrintAllOrders').attr("higth","32");
	});

	//when Admin mouve mouse on printAll image 
	$('#imgGetInvoicedXLS').mouseover( function() {
		$('#imgGetInvoicedXLS').attr("width","40");
		$('#imgGetInvoicedXLS').attr("higth","40");
	});
	$('#imgGetInvoicedXLS').mouseout( function() {
		$('#imgGetInvoicedXLS').attr("width","32");
		$('#imgGetInvoicedXLS').attr("higth","32");
	});

	//when Admin click on the button Print 
	$('#imgPrintOrders').click( function(){
		//fill search parameters 
		 fillSarchParameters();
		$('#tansformInvoicedSignal').val(1);
		$('#printAllOrdersSignal').val(0);
		createStrPrint();
		$('#formToPrint').trigger("submit");
		//horloge();
	});
	//when Admin click on the button Print All Orders 
	$('#imgPrintAllOrders').click( function(){
		//fill search parameters 
		 fillSarchParameters();
		$('#tansformInvoicedSignal').val(1);
		$('#printAllOrdersSignal').val(1);
		$('#formToPrint').trigger("submit");
	});

	/*------------------------------------ Pagination -------------------------------------------
			When Admin click on pageIndex, cach pageIndex and search Orders with in dataBase  
	  -------------------------------------------------------------------------------------------*/
	
	//when Admin click on a number page 
	$('#tabPageIndex #pageIndex').click( function(){
		var index=$('#tabPageIndex #pageIndex').index(this);
		var pageIndexHedden=$('#tabPageIndex #pageIndexHedden').eq(index).val();
		$('#indexSet').val(pageIndexHedden);
		$('#indexList').val(index);
		//fill search parameters 
		 fillSarchParameters();
		$('#pageIndexSignal').val(1);
		$('#form').trigger("submit");
	});
	
	//when Admin click on a imge nextPages 
	$('#tabPageIndex #imgNextPages').click( function(){
		$('#indexList').val(0);
		//fill search parameters 
		 fillSarchParameters();
		$('#nextListPagesSignal').val(1);
		$('#form').trigger("submit");
	});

	//when Admin click on a imge imgPrevListPages 
	$('#tabPageIndex #imgPrevListPages').click( function(){
		$('#indexList').val(0);
		//fill search parameters 
		 fillSarchParameters();
		$('#prevListPagesSignal').val(1);
		$('#form').trigger("submit");
	});
	

	/*------------------------------- Function:fillSarchParameters --------------------------------
						     	   Function to fill sarch parameters  
	  -------------------------------------------------------------------------------------------*/
	function fillSarchParameters(){
		//search parameters 
		var userLogin=$("#txtUserLoginTo").val();
		var strCreationDateStart=$("#creationDateStartPicker").val();
		var strCreationDateEnd=$("#creationDateEndPicker").val();
		$("#frmUserLogin").val(userLogin);
		var selectedStatus=$("#selectedStatus").val();
		var lsOrderId=$("#lsOrderIdSearch").val();
		$("#lsOrderIdFRM").val(lsOrderId);
		$("#frmSelectedStatus").val(selectedStatus);
		$("#frmStrCreationDateStart").val(strCreationDateStart);
		$("#frmStrCreationDateEnd").val(strCreationDateEnd);
	}
	
	
});

</script>
	

</div>
</div>

