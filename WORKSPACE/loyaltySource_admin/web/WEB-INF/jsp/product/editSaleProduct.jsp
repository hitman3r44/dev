<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<script type="text/javascript" src="scripts/clientCategoryEditProduct.js"></script>
<link href="css/jquery-ui.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript" src="scripts/jquery-ui.min.js"></script>

  
<style type="text/css">
label {
	width:170px;
}
.vanadium-advice {
	margin-left: 170px;
}
input.vanadium-valid {
	background-image: none;
}

td {
	-moz-user-select: none;
	-khtml-user-select: none;
	-webkit-user-select: none; 
	-ms-user-select: none;
	user-select: none;
}

.border_rigth_left{
	border-left: 1px solid #CCCCCC;
	border-right: 1px solid #CCCCCC;
}

.border_rigth{
	border-right: 1px solid #CCCCCC;
}

.border_left{
	border-left: 1px solid #CCCCCC;
}


.middleTdDate{
	height: 25px;
	width:140px;
	padding: 5px;
}


.middleTdFullName{
	height: 25px;
	padding: 5px;
}


.middleTdType{
	height: 25px;
	width:90px;
	padding: 5px;
}
.middleTdData{
	width:190px;
	float: left;
}

.smallTd{
	height: 25px;
	padding: 5px;
}

.tableLog_title{
	font-size: 14px;
	padding-bottom: 10px;
	text-decoration: underline;
}

.tagCenterData{
	overflow: auto;
	max-height:100px;
	height:80px;
	max-width:180px;
	width: 100%;
	vertical-align: middle;
	text-align: left;
	padding: 5px;
}
 
.texte_align_left{
text-align: left;
}

</style>

<div id="divMainEditProduct" class="unit" style="width:800px;margin-left:100px;">

<div class="pop_title" style="margin-top:30px;">Edit Product Sale  - <s:property value="nameEn" /></div>
<fieldset>
<s:if test="hasActionErrors()"> 
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator>
  </div>
</s:if>

  <div id="formContainer" >
    <s:form id="frmSale" action="editSaleProduct.do" method="post" validate="true" enctype="multipart/form-data">
	    <s:hidden id="productId" name="productId"/>
	    <s:hidden id="frmStrUsersId" name="strUsersId"/>
	    <s:hidden id="frmSalesByDateId" name="salesByDate" />
	    <s:hidden id="frmSaveSaleSignal" name="saveSaleSignal" />  
	    <s:hidden id="frmSaleForAllCleintId" name="saleForAllCleint" />
	     
     	<!--<s:hidden id="frmActiveId" name="saleProdctDTO.active" />-->
     	<s:hidden id="frmProductSaleId" name="saleProdctDTO.productSaleId" />
     	<s:hidden id="frmQtMax" name="saleProdctDTO.qtMax" /> 
     	<s:hidden id="frmSaleQt" name="saleProdctDTO.saleQt" /> 
     	<s:hidden id="frmStrStartDate" name="strStartDate" />
     	<s:hidden id="frmStrEndDate" name="strEndDate" />
     	<s:hidden id="frmActive" name="saleProdctDTO.active" />
     	<s:hidden id="frmMessageForClient" name="saleProdctDTO.messageForClient" />
     	<s:hidden id="frmSalePrice" name="saleProdctDTO.salePrice" />
     	<s:hidden id="frmLoyaltyProductIdSub" name="saleProdctDTO.loyaltyProductIdSub" />
     	<s:hidden id="frmFuturSUB" name="futurSUB" />
     	
     	
    </s:form>
     

        
        
        
     <s:form id="frmProductList" action="getProductList.do" method="post" validate="true" enctype="multipart/form-data">
     	<s:hidden id="signalHid" name="signalHid" value="" />
     	<s:hidden id="brandIDHid" name="brandIDHid" value="" />
     	<s:hidden id="categoryIDHid" name="categoryIDHid" value="" />     	 
    </s:form>
    
    
    
    <s:token />

        <!-- ////////////////////////////////////////// PRODUCT INFO ///////////////////////////////////////-->
		<!-- Image Product -->
		<div style="position:absolute;left:903px">
			<div class="image" style="margin-left:10px;width:200px;">
				 <s:if test="%{imgDTO!=null}">
					<img src="${product}<s:property value="imgDTO.name" />" />
					<div style="margin-top:3px;">Current Size:</div>
			        	<span id="img_dim_1"><s:property value="imgDTO.width" /> X 
			        	<s:property value="imgDTO.height" /> - 
			        	<s:property value="imgDTO.size" />kb</span>
				</s:if>
			</div>
				<div id="file-uploader" style="text-align:center">
			</div>
			<div id="messageUpload" style="width:200px;"></div>
		</div>
<!-- Image Product --> 
      
     	<!--Brand-->
        <label for="team_name">Brand:</label>
		 <s:select id="brand" 
        		  name="brand"
        		  cssStyle="width:156px;"
        		  required="true"
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 
        		  listKey="id"
        		  listValue="%{name}"			    		  
    			  list="brandList" disabled="true" /> 
    	<s:hidden id="brandName" name="brandName" value="" />
    	<span id="brand_Error" style="display:none;margin-left:2px;"></span>
         <!--Brand-->
        <br />
         <!--Category-->
        <label for="username">Category:</label>
 		<s:select id="category" 
        		  name="category"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--"	
        		  list="categoryList"
      			  listKey="id"
      			  listValue="%{getText(name)}"  disabled="true" /> 
    	<s:hidden id="categoryName" name="categoryName" value="" />
    	<span id="category_Error" style="display:none;margin-left:2px;"></span>
        <!--Category-->
        <br />  
                 
        <!-- list Active Clients-->      
		 <select id="activeClientsListSelect" style="display:none;visibility:hidden;" >
		 	<s:iterator value="%{activeClientsList}" id="row">
				         <s:iterator value="%{#row}" id="cell">
				         <option >
				           <s:property value="%{#cell.login}"/>      
				         </option>
				         </s:iterator>           
		   </s:iterator> 
		</select> 
        <!-- list Active Clients-->
 
        <!--Active Clients-->        
        <label>Active Clients:</label>	
		<s:if test='%{activeClientsSize != 0}'>
			<s:select id="activeClientsId"
        		  name="activeClientsId"
        		  cssStyle="width:156px;" 
        		  required="false"
        		  listKey="id" 
        		  multiple="true"
        		  size="%{activeClientsTFSize}"
        		  listValue="%{getText(login)}"	
    			  list="activeClientsList" />
    		 <span id="activeClients_Error" style="display:none;margin-left:2px;"></span>
		</s:if>
		<s:else>
			<s:textfield id="noActiveClient" name="noActiveClient" maxlength="5" cssStyle="width:150px;" value="--- NONE ----" readonly="true" />
		</s:else>
		 <br />
    	<!--Active Clients-->
       
        <!--bar code-->
        <label for="accept_team_members">UPC:</label>
        <s:textfield id="upc" name="upc" maxlength="50" cssStyle="width:150px;" readonly="true"/>
        <span id="upc_Error" style="display:none;margin-left:2px;"></span>
        <!--bar code-->
        <br />
        <!--Loyalty Product ID-->
        <label for="accept_team_members">Loyalty Source Product ID:</label>
        <s:textfield id="loyaltyProductId" name="loyaltyProductId" maxlength="50" cssStyle="width:150px;" readonly="true"/>
        <!-- <s:hidden id="loyaltyProductIdSub" name="loyaltyProductIdSub" value="" /> -->
        <span id="loyaltyProductId_Error" style="display:none;margin-left:2px;"></span>
        <!--Loyalty Product ID-->
        <br />
       
        <label for="accept_team_members">MSRP:</label>        
        <s:textfield id="msrp" name="msrp" maxlength="15" cssStyle="width:80px;" readonly="true" />
        <span id="msrp_Error" style="display:none;margin-left:2px;"></span>
        <!--MSRP-->
        <br />
        <!--OUR COST-->
        <label for="accept_team_members">Our cost:</label>       
        <s:textfield id="cost" name="cost" maxlength="15" cssStyle="width:80px;" readonly="true" />
         <span id="cost_Error" style="display:none;margin-left:2px;"></span>
        <!--OUR COST-->
        <br />
        <label>Current Status:</label>
		<s:select id="statusId" 
        		  name="statusId"
        		  cssStyle="width:156px;"
        		  required="true"
        		  listKey="id"
        		  listValue="%{getText(name)}"			    		  
    			  list="statusList" disabled="true"/>   
    	<s:hidden id="statusName" name="statusName" value="" />
    	<div id="discontinuedSub"></div>
    	<span id="status_Error" style="display:none;margin-left:2px;"></span>
    	<!--Status-->    	 	
        <br />
        <!-- ////////////////////////////////////////// PRODUCT INFO ///////////////////////////////////////-->
        
        
        <!-- ////////////////////////////////////////// SALE ///////////////////////////////////////////////-->    
        <div id="divSales"> 
            <!-- =========================================== TABLE SALE INFO ===============================-->
            <s:hidden id="productSaleId" name="saleProdctDTO.productSaleId" value="%{saleProdctDTO.productSaleId}" />
       		<br/>  
	        <table width="750px" border="0"  id="tabSales" style="background-color:rgb(247,247,247);border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;align:left;">

        	<!-- .......................... SEPARATOR ............................ --> 
	        <tr height="10px">
	        	<td colspan="2"/> 
	        </tr>  
	        
	        	                
	        <!-- .......................... SALE PRICE ........................... -->  
	        <tr>  
	        	<td><label style="width:100px;">Active:</label></td>
	        	<td><s:checkbox id="checkBoxSaleActiveId" name="saleProdctDTO.active" cssStyle="color:#00FF00;"  value="%{saleProdctDTO.active}" disabled="true"/></td>
	        </tr>
	                 
	        <!-- .......................... SALE PRICE ........................... -->  
	        <tr>  
	        	<td><label style="width:100px;">Sale Price:</label></td>
	        	<td><s:textfield id="salePriceId"  name="saleProdctDTO.salePrice" value="%{saleProdctDTO.salePrice}" maxlength="50" cssStyle="width:80px;" /></td>
	        </tr>
	        
	        	                 
	        <!-- .......................... SALE PRICE ........................... -->  
	        <tr>  
	        	<td><label style="width:100px;">Quantity sold:</label></td>
	        	<td><s:textfield id="saleQtId"  name="saleProdctDTO.saleQt" value="%{saleProdctDTO.saleQt}" maxlength="50" cssStyle="width:80px;" readonly="true" /></td>
	        </tr>
	        <!-- .......................... SALE BY DATE OR BY QUANTITY .......... -->
	        <tr>
	        	<td width="100"><label for="accept_team_members">Sales By Date?:</label></td>    
	        	<td>
	        		<s:checkbox id="salesByDateCheckboxId" name="salesByDate" cssStyle="color:#00FF00;"/> 
	        	</td> 
	        </tr>
  			<!-- ..................... Sales by Date ...............--> 
		        <tr id="trStartDate">
		        	<td><label for="accept_team_members">Start Date:</label></td>  
		        	<td>
			         <s:date id="startDateId" name="strStartDate" var="strStartDate" format="dd/MM/yyyy"/> 
					 <s:textfield id="startDatePicker" name="strStartDate" value="%{strStartDate}"
					 key="labelkey" readonly="false" cssStyle="width:150px;" /></td>
		        </tr>
		                 
		        <tr  id="trEndDate">   
		        	<td><label for="accept_team_members">End Date:</label></td>  
		        	 <td> 
			         <s:date id="endDateId" name="strEndDate" var="strEndDate" format="dd/MM/yyyy"/>
					 <s:textfield id="endDatePicker" name="strEndDate" value="%{strEndDate}" 
					 key="labelkey" readonly="false" cssStyle="width:150px;" /></td>
		        </tr>
	        <!-- .................... Sales by Quantity ............--> 
		        <tr id="trQtMaxDate">
		        	<td><label for="accept_team_members">Max Qty:</label></td>
		        	<td><s:textfield id="qtMaxId" name="saleProdctDTO.qtMax" value="%{saleProdctDTO.qtMax}" maxlength="50" cssStyle="width:80px;" /></td>
		        </tr>  
		           
		    <!-- .................... Sales by Quantity ............-->      
		        <tr height="20px">  
		        	<td style="padding-left:10px;">One last unit sold Available:</td>
		        	<td><s:checkbox id="checkBoxFuturSUBId" name="futurSUB" cssStyle="color:#00FF00;" value="%{!futurSUB}" /></td> 
		        </tr>      
		        <tr height="20px">     
		        	<td style="padding-left:10px;">One last unit sold Discontinued:</td> 
		        	<td><s:checkbox id="checkBoxFuturSUBId" name="futurSUB" cssStyle="color:#00FF00;" value="%{futurSUB}" /></td> 
		        </tr>
		        
		        <tr id="trLoyaltyProductIdSub" height="20px">    
		        	<td><label for='accept_team_members' style='color:red;font-weight:bolder;'>New Sub LS-Product-ID:</label></td> 
		        	<td><s:textfield id="loyaltyProductIdSub" name="saleProdctDTO.loyaltyProductIdSub" value="%{saleProdctDTO.loyaltyProductIdSub}" maxlength="50" cssStyle="width:150px;" size='24' /></td>
		        </tr>
 
		    <!-- .................... Message For Clients .........-->
		        <tr id="trMessageForClients"> 
		        	<td><label for="accept_team_members">Special Message:</label></td> 
		        	<td><s:textfield id="messageForClientId" name="saleProdctDTO.messageForClient" value="%{saleProdctDTO.messageForClient}" cssStyle="width:520px;" /></td>
		        </tr>
	        
	        <!-- .......................... SELECT CLIENTS ....................... --> 
	        <tr>
	        	<td><label for="accept_team_members">Clients:</label></td>
	        	<td><s:checkbox id="saleForAllCleintsCheckboxId" name="saleForAllCleint" cssStyle="color:#00FF00;" />All Clients
	        	 <font color="white">______</font><s:checkbox id="saleForAnyOneCheckboxId" name="anyOne" cssStyle="color:#00FF00;" />Any one </td>
	        </tr>
	        <!-- .......................... CLIENTS SPECIFIC...................... -->     
		        <tr id="tabClient">
		        	<td colspan="2">
		        	</td>
		        </tr>
        	<!-- .......................... SEPARATOR ............................ -->
	        <tr height="10px">
	        	<td colspan="2"/>
	        </tr>
	        
	        </table>
	        <br/>
            <!-- =========================================== TABLE SALE INFO ===============================-->

	        
			<!-- ========================================== TABLE USER SALE =============================== -->        
	        <% 	int column=0; int i=0;
	        	List<Object> listUsers=(List<Object>)request.getAttribute("userNameList"); 
	        	int size=listUsers.size();
	        %>
	        <table id="tabUsersSale" border="0" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable">
	        		
					<thead style="background:#E8E8E8;font-size:10pt;">   
					<tr style="display: inline-block;">   
					    <th width="10px"  class="texte_align_left"><s:text name="N_" /></th> 
						<th width="80px"  class="texte_align_left"><s:text name="CLIENT ID" /></th>     
						<th width="120px" class="texte_align_left"><s:text name="CLIENT NAME" /></th>  
						<th width="50px"  class="texte_align_left"><s:text name="" /></th>  
						<th width="10px"  class="texte_align_left"><s:text name="N_" /></th>   
						<th width="80px"  class="texte_align_left"><s:text name="CLIENT ID" /></th>    
						<th width="120px" class="texte_align_left"><s:text name="CLIENT NAME" /></th>         
						<th width="10px"  class="texte_align_left"><s:text name="" /></th>        
					</tr>        
					</thead>    
						<s:if test="%{userNameList != null}">   
							<s:if test="%{userNameList.size > 0}" > 
								<tbody style="height: 300px;overflow-y: auto;display: inline-block;overflow-x: hidden;">
									<s:iterator value="userNameList" status="count">  
										 <% 
										 column=i%2;     
										 if(column==0 && i<size){%>       
										 	<tr id="rowTabUsersSale">	
										 	<td width="10px" style="background: rgb(247,247,247);" ><%=(i+1)+")"%></td>
										 	<td id="userId" width="80px" class="padding_lleft5px" ><s:property value="id"/></td>	      	 								
											<td id="userLoginId" width="120px" class="padding_lleft5px"><s:property value="login"/></td>
											<td width="60px" class="padding_lleft5px"><s:checkbox id="cleintCheckBoxId" name="selected" value="%{selected}" cssStyle="color:#00FF00;" /> </td>
										  <% }%> 
  
										 <%    
										 if(column!=0 && i<size){%>	
										 <td width="10px" style="background: rgb(247,247,247);" ><%=(i+1)+")"%></td>      
										 	<td id="userId" width="80px" class="padding_lleft5px"><s:property value="id"/></td>	    							
											<td id="userLoginId" width="120px" class="padding_lleft5px"><s:property value="login"/></td>
											<td width="10px" class="padding_lleft5px"><s:checkbox id="cleintCheckBoxId" name="selected" value="%{selected}" cssStyle="color:#00FF00;" /> </td>
										  <% }%>   
										        
										  <%if(i==size){%>	 
										  <td width="10px" style="background: rgb(247,247,247);" ><%=(i+1)+")"%></td>    
										    <td id="userId" width="80px" class="padding_lleft5px"><s:property value="id"/></td>	    								
											<td id="userLoginId" width="120px" class="padding_lleft5px"><s:property value="login"/></td>
											<td width="10px" class="padding_lleft5px"><s:checkbox id="cleintCheckBoxId" name="selected" value="%{selected}" cssStyle="color:#00FF00;" /> </td>
											</tr>
										  <% }
										  i++; 
										  %>	
									</s:iterator>    
								</tbody>
							</s:if>
						</s:if>	            								
	    	</table>
	    	<br/>
			<!-- ========================================== TABLE USER SALE =============================== --> 
       		  
       		
       		<!-- ========================================== SAVE ========================================== --> 
	        <table width="750px" border="0"  id="tabSales" style="background-color:rgb(247,247,247);border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC; vertical-align:middle;align:left;">
		        <!-- .......................... SEPARATOR ............................ -->
		        <tr height="10px">
		        	<td colspan="2"/>
		        </tr>      	  
		        <tr height="10px">
		        	<td align="right" style="padding-right: 10px;width:300px;"> <s:submit id="saveSaleId"  style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;" value="Save"/> </td>
		        	<td align="left" style="padding-left: 10px;"> <s:submit id="productListButtonId" style="margin:0px 0px 0px 0px;padding:4px 30px;font-size:16px;" value="Cancel"/></td>
		        </tr> 
		        <!-- .......................... SEPARATOR ............................ -->
		        <tr height="10px">
		        	<td colspan="2"/>
		        </tr>
        	</table>   
			<!-- ========================================== SAVE ========================================== -->  
	        
        </div>
 		<br /><br />
        <!-- ////////////////////////////////////////// SALE ///////////////////////////////////////////////--> 
       
</div>
</fieldset>
</div>

  <script type="text/javascript">
  
  var strUserSalesSelected;
  var arrayUsersId = [];
  $(function() {
	  	$("#startDatePicker").datepicker({ 
	  		dateFormat: 'dd/mm/yy',  
	  		changeMonth: true, 
	  		changeYear: true 
	  	});
	  	$("#endDatePicker").datepicker({
	  		dateFormat: 'dd/mm/yy',
	  		changeMonth: true,
	  		changeYear: true
	  	});
   });

  /*----------------------------------------------
					checkSalesByDate
	----------------------------------------------*/
	function createStrUsersId(){
		var index=0;
		var val;
		var i=0;
		arrayUsersId=new Array();
		$('#tabUsersSale #cleintCheckBoxId').each(function() {
			index=$('#tabUsersSale #cleintCheckBoxId').index(this);
			val=$("#divSales  #cleintCheckBoxId").eq(index).is(':checked');    
			var userId;
			if(val){
				$("#divSales  #userLoginId").eq(index).css("color","red");       
				userId=$("#divSales  #userId").eq(index).text(); 
				if(userId!=null && userId!=""){
					arrayUsersId[i]=userId;   
					i++;
				}
			}else{
				$("#divSales  #userLoginId").eq(index).css("color","black"); 
			}
		});
		var strUsersId="";
		for(i=0;i<arrayUsersId.length;i++){
			strUsersId+=arrayUsersId[i]+",";
		}; 
		if(strUsersId.length>0)strUsersId = strUsersId.substring(0, strUsersId.length-1); 
		//alert("strUsersId:"+strUsersId);
		$('#frmSale #frmStrUsersId').val(strUsersId);
		//alert("$('#frmSale frmStrUsersId').val:"+$('#frmSale #frmStrUsersId').val());
	}
	createStrUsersId();
  /*----------------------------------------------
  					checkSalesByDate
    ----------------------------------------------*/  
  function checkSalesByDate(index){
	  if(index>=0){
		if($("#divSales #salesByDateCheckboxId").is(':checked')){
				$("#divSales #trStartDate").show();
				$("#divSales #trEndDate").show();
				$("#divSales #trQtMaxDate").hide(); 
		} else{
				$("#divSales #trStartDate").hide();
				$("#divSales #trEndDate").hide();       
				$("#divSales #trQtMaxDate").show();
		}
  	}
  };
  
  /*----------------------------------------------
				checkSpecificClients 
    ----------------------------------------------*/
  function checkSpecificClients(index){
	  if(index>=0){
			if($("#divSales #saleForAllCleintsCheckboxId").is(':checked')){ 
				$("#divSales #tabUsersSale").hide();
			} else{
				$("#divSales #tabUsersSale").show();
			}
		}
  };

  /*----------------------------------------------
					checkBoxFuturSUB 
    ----------------------------------------------*/
	function checkBoxFuturSUB(index){    
		  if(index==0){
			  val=$("#divSales  #checkBoxFuturSUBId").eq(index).is(':checked');
			  $("#divSales  #checkBoxFuturSUBId").eq(1).attr("checked",!val);
			  
			  if(val){
				  $("#divSales #trLoyaltyProductIdSub").hide();
				  //$("#divSales #loyaltyProductIdSub").val(""); 
			  }else{ 
				  $("#divSales #trLoyaltyProductIdSub").show();
			  }
		  }else if(index==1){ 
			  val=$("#divSales  #checkBoxFuturSUBId").eq(index).is(':checked');
			  $("#divSales  #checkBoxFuturSUBId").eq(0).attr("checked",!val);
			  if(val){
				  $("#divSales #trLoyaltyProductIdSub").show();
			  }else{
				  $("#divSales #trLoyaltyProductIdSub").hide();
				  //$("#divSales #loyaltyProductIdSub").val("");
			  }
		  }
	}
	checkSalesByDate(0);
	checkSpecificClients(0);
	checkBoxFuturSUB(0);
	  
	/*----------------------------------------------
				Fuction  document
	 ----------------------------------------------*/
  $(document).ready(function() {

	 
	  
	  
	  
		/*----------------------------------------------
					Canacel- Go back to products list
		 ----------------------------------------------*/
	 	$("#divSales #productListButtonId").click(function() {
	 	 	var signal = -100;	// A unique value 
	 	 	//alert("hello");
	 	 	$("#signalHid").attr('value', signal);
	 	 	var brand = $("#brand").val();
	 	 	var category = $("#category").val();
	 	 	$("#brandIDHid").attr('value', brand);
	 	 	$("#categoryIDHid").attr('value', category); 
	 	 	$('#frmProductList').trigger("submit"); 
		 });

		  
		  
		/*----------------------------------------------
					When Admin click on AnyOne checkBox
		 ----------------------------------------------*/
	 	$("#divSales #saleForAnyOneCheckboxId").click(function() {
	 		//checkSpecificClients(0);
	 		$('#tabUsersSale  #rowTabUsersSale #cleintCheckBoxId').css("color","black");
	 		$('#tabUsersSale #cleintCheckBoxId').attr("checked",false);
		 });
	 	 
		  

		/*----------------------------------------------
					SaveSale- Go back to products list
		 ----------------------------------------------*/
	 	$("#divSales #saveSaleId").click(function() {

	 	 	futurSUB=$("#divSales  #checkBoxFuturSUBId").eq(1).is(':checked');
	 	 	salePrice=$("#divSales #salePriceId").val();
	 	 	salesByDateCheckbox=$("#divSales #salesByDateCheckboxId").is(':checked');
	 	 	strStartDate=$("#divSales #startDatePicker").val();
	 	 	strEndDate=$("#divSales #endDatePicker").val(); 
	 	 	qtMax=$("#divSales #qtMaxId").val();
	 	 	loyaltyProductIdSub=$("#divSales #loyaltyProductIdSub").val();
	 	 	loyaltyProductIdSub=cleanStr(loyaltyProductIdSub,'_');
	 	 	messageForClient=$("#divSales #messageForClientId").val();
	 	 	saleForAllCleintsCheckbox=$("#divSales #saleForAllCleintsCheckboxId").is(':checked');
	 	 	//checkBoxSaleActive=$("#divSales #checkBoxSaleActiveId").is(':checked');
	 	 	 
	 	 	productSaleId=$("#divSales #productSaleId").val();
			
			$("#frmSale #productSaleId").val(productSaleId);
			$("#frmSale #frmQtMax").val(qtMax);
			$("#frmSale #frmSaleQt").val(0);
			$("#frmSale #frmStrStartDate").val(strStartDate);
			$("#frmSale #frmStrEndDate").val(strEndDate);
			$("#frmSale #frmActive").val(true);
			$("#frmSale #frmMessageForClient").val(messageForClient);
			$("#frmSale #frmSalePrice").val(salePrice);
			$("#frmSale #frmLoyaltyProductIdSub").val(loyaltyProductIdSub);		
			$("#frmSale #frmSalesByDateId").val(salesByDateCheckbox);
			//$("#frmSale #frmActiveId").val(checkBoxSaleActive);
			$("#frmSale #frmSaleForAllCleintId").val(saleForAllCleintsCheckbox);
			$("#frmSale #frmFuturSUB").val(futurSUB);
			
			//alert(salesByDateCheckbox);
			
			var validateStartDate=isDate(strStartDate);
			var validateEndDate=isDate(strEndDate);
			var validateQtMax=isNumber(qtMax);

			if(salesByDateCheckbox){
		 	 	$("#divSales #startDatePicker").css("background","");
		 	 	$("#divSales #endDatePicker").css("background","");
				if(!validateStartDate || !validateEndDate ){
			 	 	if(!validateStartDate)$("#divSales #startDatePicker").css("background","#FF6666");
			 	 	if(!validateEndDate)$("#divSales #endDatePicker").css("background","#FF6666"); 
			 	 	return false;
				}
			}else{
				$("#divSales #qtMaxId").css("background","");
				if(!validateQtMax){
					$("#divSales #qtMaxId").css("background","#FF6666");
					return false;
				}
			}
			
			var validateSalePrice=isNumber(salePrice);
			
			$("#divSales #salePriceId").css("background","");
			if(!validateSalePrice){
				$("#divSales #salePriceId").css("background","#FF6666");
				return false;
			}

			//clean loyaltyProductIdSub 
			if(futurSUB){
				$("#divSales #loyaltyProductIdSub").css("background","");
				$("#divSales #loyaltyProductIdSub").val(loyaltyProductIdSub);
				if(loyaltyProductIdSub==null || loyaltyProductIdSub==""){
					$("#divSales #loyaltyProductIdSub").css("background","#FF6666");
					return false;
				}
			}
			
	 	 	$("#frmSale #frmSaveSaleSignal").val(1);
	 	 	createStrUsersId();
	 	 	//alert($('#frmSale #frmStrUsersId').val());
	 	 	$('#frmSale').trigger("submit"); 
		 });
		
		
		/*----------------------------- Test value is numeric  ----------------------------------- 
									return false if is not numeric
		  ----------------------------------------------------------------------------------------*/

		$("#divSales #checkBoxFuturSUBId").click( function() { 
			  var index=$("#divSales  #checkBoxFuturSUBId").index(this);
			  checkBoxFuturSUB(index); 
		}); 

		/*----------------------------- Test value is numeric  ----------------------------------- 
									return false if is not numeric
		  ----------------------------------------------------------------------------------------*/
		$("#tabUsersSale #cleintCheckBoxId").click( function() {
			createStrUsersId(); 
		});

		/*----------------------------- Test value is numeric  ----------------------------------- 
									return false if is not numeric
		  ----------------------------------------------------------------------------------------*/
		$("#divSales #salesByDateCheckboxId,#saleForAllCleintsCheckboxId").click( function() {
			var index=$("#divSales #salesByDateCheckboxId").index(this);
			checkSalesByDate(index);
			var index=$("#divSales #saleForAllCleintsCheckboxId").index(this);
			checkSpecificClients(index);
		});

		/*----------------------------- Test value is numeric  ----------------------------------- 
									return false if is not numeric
		  ----------------------------------------------------------------------------------------*/
		function isNumber(n) {
			return !isNaN(parseFloat(n)) && isFinite(n);
		}
		

		/*----------------------------- Test value is numeric  ----------------------------------- 
									return false if is not numeric
		  ----------------------------------------------------------------------------------------*/
		function isDate(d) { 
			var dateMotif=/(((0|1)[1-9]|2[1-9]|3[0-1])\/(0[1-9]|1[1-2])\/((19|20)\d\d))$/;
			var reg = new RegExp(dateMotif);  
			return reg.test(d);
		}

		/*----------------------------- CLEAN STRING  -------------------------------------------- 
								CLEAN STRING IF CONTENT SPACE
		  ----------------------------------------------------------------------------------------*/
		function cleanStr(str,charSeparator) { 
			if(str==null)str="";
			str=str.replace(/^\s\s*/, '');    
			str=str.replace(/\s\s*$/, '');   
			str=str.replace(/([\s]+)/g, charSeparator);
			return str;
		}
		
			 	
  	});
 
 
	

	
  </script>
  
  