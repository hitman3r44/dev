<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
label { width:150px; }
.vanadium-advice { margin-left: 150px; }
table { border-collapse:collapse; }
</style>

<div class="unit" style="width:1400px;margin:30px 0px 0px 60px;">
  <div class="pop_title" id="Title">Manage Product</div>
  <!-- A List for Global Error Messages -->
  <s:if test="hasActionErrors()"> <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span>
  				<br/>
  		</s:iterator></div>  
  </s:if>
        <label for="url">Brands :</label>
        <s:select id="brand" 
        		  name="brand"
        		  cssStyle="width:156px;"
        		  required="true"
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="id"
        		  listValue="%{name}"			    		  
    			  list="brandList" />
    			  
    			  
     	<br />  <br /> 
     	<label for="url">Category :</label>
        <s:select id="category" 
        		  name="category"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--"
        		  listKey="id"
        		  listValue="%{getText(name)}" 			    		  
    			  list="categoryList" /> 
     	<br/><br/>
 	  			  
		<table><tr>
		<td><s:checkbox id="discontinued" 
					name="discontinued"				
					title="Show Discontinued Items"
					value="false" /></td>
		<td width="40"><label for="url">Show Discontinued Items</label></td>
		<td></td><td></td>
		<td><s:checkbox id="disabled" 
					name="disabled" 
					title="Show Disabled Items"
					value="false" /></td>
      	<td><label for="url">Show Disabled Items</label></td>
		</tr>
		</table>
     	<br/><br/>     	
        <label for="url"></label>
        <input id="getProductList" type="button" name="getProductList" value="Get Products"/>
        <span id="hande_Error" style="display:none;margin-left:2px;"></span>
        <span id="ajax_loading" style="display:none;"><img src="${images}/ajax-loader.gif" /></span>
<br />
<div id="productList" class="fixed column" style="padding:20px 0px 0px 0px;">
<div class="blue f12 bold pb10" style="padding-bottom:10px;"></div>
<table id="productListData" width="100%" border="0" class="pad_5px nowraptable datatable" >
<thead class="gray_header">
	<tr>
    	<th>ID</th>
        <th>Product</th>
        <th>Brand</th>
        <th>Category</th>
        <th>Status</th>
        <th>Suppliers</th>
        <th>Loyalty Source Product</th>
        <th>Action</th>
	</tr>
</thead>
<tbody>
	<tr>
    	<td colspan="5" class="dataTables_empty"></td>
    </tr>
</tbody>
</table>
</div>
</div>

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$('#getProductList').click( function() {
			var oTable = initializeDatatable();
			$('#ajax_loading').show();
			var userTypeId = '<s:property value="userTypeId"/>';
			var isDiscontinued =false;
			var isDisabled =false;
			if($('#discontinued').attr('checked')=='checked')isDiscontinued=true;
			if($('#disabled').attr('checked')=='checked')isDisabled=true;
			getProductListByQuery( $('#brand').val(), $('#category').val(), isDiscontinued, isDisabled, oTable, userTypeId);
		});
	});
</script>

<script type="text/javascript">

$(document).ready(function() { 
	$('#brandName').val($('#brand option:selected').text());
	$('#categoryName').val($('#category option:selected').text());
		
	// brand changes
	$("#brand").change( function() {	
		var cat;				
		$('#brandName').val($('#brand option:selected').text());				
		populateCategory($(this).val(), cat);
	});

    // category changes
    $("#category").change( function() {
        var spec;
        $('#categoryName').val($('#category option:selected').text());
        populateMainSpecification($(this).val(), $("#brand").val(), spec);
    });
        //////////////////////////////////////////////
        /*                                          */
        /*      THIS COMES FROM editProduct.jsp     */
        /*         [BEGIN - editProduct.jsp]        */
        /*                                          */
        //////////////////////////////////////////////
        var receiveSignal = <%= request.getParameter("signalHid") %>;
        var b = <%= request.getParameter("brandIDHid") %>;
        var c = <%= request.getParameter("categoryIDHid") %>;
        var bb = $("#brand").val();
        var cc = $("#category").val();
       	/*
        alert("[1] b = " + b + ", c = " + c 
        		+ ", bb = " + bb + " and cc = " + cc 
        		+ " & receiveSignal = " + receiveSignal);
       	*/
        if (receiveSignal == -100) {
            // window.location.href = "getProductList.do?brand=" + b + "&category=" + c;
            $("#brand").change("brand option:selected").val(b);
            $("#category").change("category option:selected").val(c);
        }
        // if (bb != null && bb > 0) $("#getProductList").click();
        if (b != null && b > 0) $("#getProductList").click();
        //////////////////////////////////////////////
        /*                                          */
        /*         [END - editProduct.jsp]          */
        /*                                          */
        //////////////////////////////////////////////


        //////////////////////////////////////////////////
        /*                                              */
        /*      THIS COMES FROM addProductSuccess.jsp   */
        /*         [BEGIN - addProductSuccess.jsp]      */
        /*                                              */
        //////////////////////////////////////////////////
        var receiveASuccessSignal = <%= request.getParameter("signalASuccessHid") %>;
        var bASuccess = <%= request.getParameter("brandIDASuccessHid") %>;
        var cASuccess = <%= request.getParameter("categoryIDASuccessHid") %>;
        /*
        alert("[2] bASuccess = " + bASuccess + ", cASuccess = " + cASuccess 
        		+ ", bb = " + bb + " and cc = " + cc 
        		+ " & receiveASuccessSignal = " + receiveASuccessSignal);
        */
        if (receiveASuccessSignal == -200) {
            $("#brand").change("brand option:selected").val(bASuccess);
            $("#category").change("category option:selected").val(cASuccess);
        }
        if (bASuccess != null && bASuccess > 0) $("#getProductList").click();
        //////////////////////////////////////////////
        /*                                          */
        /*       [END - addProductSuccess.jsp]      */
        /*                                          */
        //////////////////////////////////////////////
 
        //////////////////////////////////////////////////
        /*                                              */
        /*      THIS COMES FROM editProductSuccess.jsp  */
        /*         [BEGIN - editProductSuccess.jsp]     */
        /*                                              */
        //////////////////////////////////////////////////
        var receiveESuccessSignal = <%= request.getParameter("signalESuccessHid") %>;
        var bESuccess = <%= request.getParameter("brandIDESuccessHid") %>;
        var cESuccess = <%= request.getParameter("categoryIDESuccessHid") %>;
        /*
        alert("[3] bESuccess = " + bESuccess + ", cESuccess = " + cESuccess 
        		+ ", bb = " + bb + " and cc = " + cc 
        		+ " & receiveESuccessSignal = " + receiveESuccessSignal);
        */
        if (receiveESuccessSignal == -300) {
            $("#brand").change("brand option:selected").val(bESuccess);
            $("#category").change("category option:selected").val(cESuccess);
        }
        if (bESuccess != null && bESuccess > 0) $("#getProductList").click();
        //////////////////////////////////////////////
        /*                                          */
        /*       [END - editProductSuccess.jsp]     */
        /*                                          */
        //////////////////////////////////////////////        
        
        //////////////////////////////////////////////////
        /*                                              */
        /*      THIS COMES FROM amend/amendProduct.jsp  */
        /*         [BEGIN - amendProduct.jsp]     		*/
        /*                                              */
        //////////////////////////////////////////////////        
        var receiveAUSignal = <%= request.getParameter("signalAUHid") %>;
        var bAU = <%= request.getParameter("brandIDAUHid") %>;
        var cAU = <%= request.getParameter("categoryIDAUHid") %>;
        if (receiveAUSignal == -1000) {
            $("#brand").change("brand option:selected").val(bAU);
            $("#category").change("category option:selected").val(cAU);
        }
        if (bAU != null && bAU > 0) $("#getProductList").click();
        //////////////////////////////////////////////
        /*                                          */
        /*       [END - amendProduct.jsp]     		*/
        /*                                          */
        //////////////////////////////////////////////        
        
        //////////////////////////////////////////////////////////////
        /*                                              			*/
        /*      THIS COMES FROM amend/amendingProductSuccess.jsp  	*/
        /*         	  [BEGIN - amendingProductSuccess.jsp]     		*/
        /*                                              			*/
        //////////////////////////////////////////////////////////////
        var receiveAUSuccessSignal = <%= request.getParameter("signalAUSucessHid") %>;
        var bAUSuccess = <%= request.getParameter("brandIDAUSucessHid") %>;
        var cAUSuccess = <%= request.getParameter("categoryIDAUSucessHid") %>;
        if (receiveAUSuccessSignal == -1100) {
            $("#brand").change("brand option:selected").val(bAUSuccess);
            $("#category").change("category option:selected").val(cAUSuccess);
        }
        if (bAUSuccess != null && bAUSuccess > 0) $("#getProductList").click();
        //////////////////////////////////////////////
        /*                                          */
        /*    [END - amendingProductSuccess.jsp]	*/
        /*                                          */
        //////////////////////////////////////////////
  		        
    });
</script>