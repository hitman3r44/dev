<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/clientCategoryEditProduct.js"></script>
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

</style>

<div id="divMainEditProduct" class="unit" style="width:800px;margin-left:100px;">

<div class="pop_title" style="margin-top:30px;">View Product - <s:property value="nameEn" /></div>

<s:if test="hasActionErrors()"> 
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator>
  </div>
</s:if>

  <div id="formContainer" >
    <s:form id="form" action="editProduct.do" method="post" validate="true" enctype="multipart/form-data">
    <s:hidden id="productId" name="productId"/>
    <s:hidden id="imageId" name="imageId"/>
    <s:hidden name="update" value="true"/>
    <s:token />
<fieldset>

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
    			  list="brandList" /> 
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
      			  listValue="%{getText(name)}" /> 
    	<s:hidden id="categoryName" name="categoryName" value="" />
    	<span id="category_Error" style="display:none;margin-left:2px;"></span>
        <!--Category-->
        <br />
        <!--Type-->
        <label for="accept_team_members">Type:</label>
        <s:select id="mainSpecification" 
        		  name="mainSpecification"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 	
        		  list="mainSpecificationList"
      			  listKey="id"
      			  listValue="%{getText(name)}" /> 
    	<s:hidden id="mainSpecificationName" name="mainSpecificationName" value="" />
    	<span id="main_spec_Error" style="display:none;margin-left:2px;"></span>
        <!--Type-->
        <br />
        <!--Status-->
        <label>Status:</label>
		<s:select id="statusId" 
        		  name="statusId"
        		  cssStyle="width:156px;"
        		  required="true"
        		  listKey="id"
        		  listValue="%{getText(name)}"			    		  
    			  list="statusList" /> 
    	<s:hidden id="statusName" name="statusName" value="" />
    	<div id="discontinuedSub"></div>
    	<span id="status_Error" style="display:none;margin-left:2px;"></span>
    	<!--Status-->    	 	
        <br />
        
        <!-- list Active Clients-->  
		 <select id="activeClientsListSelect" style="display:none;visibility:hidden;">
		 	<s:iterator value="%{activeClientsList}" id="row">
				         <s:iterator value="%{#row}" id="cell">
				         <option>
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
    			  list="activeClientsList"  />
    		 <span id="activeClients_Error" style="display:none;margin-left:2px;"></span>
		</s:if>
		<s:else>
			<s:textfield id="noActiveClient" name="noActiveClient" maxlength="5" cssStyle="width:156px;" value="--- NONE ----" readonly="true" />
		</s:else>
		 <br />
    	<!--Active Clients-->
       
       <!--Manufacturer Product ID-->
        <table border="0">
        	<tr>
		        <td></td>        
		        <td></td>
		        <td align="center">Qty:</td>
		        <td align="center">Supplier:</td>
		        <td class="cost" align="center">Cost:</td>
		        <td class="msrpClass" align="center">MSRP:</td>
	        </tr>
	        <tr>
		        <td><label for="accept_team_members">Manufacturer product ID(s):</label></td>        
		        <td><s:textfield id="manufProductID" name="manufProductID" maxlength="50" cssStyle="width:150px;"/></td>
		        <td><s:textfield id="manufProductQuantity" name="manufProductQuantity" maxlength="5" cssStyle="width:35px;"/></td>
		        <td><s:textfield id="supplier" name="supplier" maxlength="50" cssStyle="width:100px;"/></td>
		        <td><s:textfield id="price" name="price" maxlength="15" cssStyle="width:100px;" cssClass="cost"/></td>
		        <td><s:textfield id="msrp0" name="msrp0" maxlength="15" cssStyle="width:100px;" cssClass="msrpClass" /></td>
	        </tr>
	        <tr>
		        <td><label for="accept_team_members"></label></td>
		        <td><s:textfield id="manufProductID1" name="manufProductID1" maxlength="50" cssStyle="width:150px;"/></td>
		        <td><s:textfield id="manufProductQuantity1" name="manufProductQuantity1" maxlength="5" cssStyle="width:35px;"/></td>
		        <td><s:textfield id="supplier1" name="supplier1" maxlength="50" cssStyle="width:100px;"/></td>
		        <td><s:textfield id="price1" name="price1" maxlength="15" cssStyle="width:100px;" cssClass="cost"/></td>
		        <td><s:textfield id="msrp1" name="msrp1" maxlength="15" cssStyle="width:100px;" cssClass="msrpClass" /></td>
	        </tr>
	        <tr>
		        <td><label for="accept_team_members"></label></td>
		        <td><s:textfield id="manufProductID2" name="manufProductID2" maxlength="50" cssStyle="width:150px;"/></td>
		        <td><s:textfield id="manufProductQuantity2" name="manufProductQuantity2" maxlength="5" cssStyle="width:35px;"/></td>
		        <td><s:textfield id="supplier2" name="supplier2" maxlength="50" cssStyle="width:100px;"/></td>
		        <td><s:textfield id="price2" name="price2" maxlength="15" cssStyle="width:100px;" cssClass="cost"/></td>
		        <td><s:textfield id="msrp2" name="msrp2" maxlength="15" cssStyle="width:100px;" cssClass="msrpClass" /></td>
	        </tr>
	        <tr>
		        <td><label for="accept_team_members"></label></td>
		        <td><s:textfield id="manufProductID3" name="manufProductID3" maxlength="50" cssStyle="width:150px;"/></td>
		        <td><s:textfield id="manufProductQuantity3" name="manufProductQuantity3" maxlength="5" cssStyle="width:35px;"/></td>
		        <td><s:textfield id="supplier3" name="supplier3" maxlength="50" cssStyle="width:100px;"/></td>
		        <td><s:textfield id="price3" name="price3" maxlength="15" cssStyle="width:100px;" cssClass="cost"/></td>
		        <td><s:textfield id="msrp3" name="msrp3" maxlength="15" cssStyle="width:100px;" cssClass="msrpClass" /></td>
	        </tr>
	        <tr>
		        <td><label for="accept_team_members"></label></td>
		        <td><s:textfield id="manufProductID4" name="manufProductID4" maxlength="50" cssStyle="width:150px;"/></td>
		        <td><s:textfield id="manufProductQuantity4" name="manufProductQuantity4" maxlength="5" cssStyle="width:35px;"/></td>
		        <td><s:textfield id="supplier4" name="supplier4" maxlength="50" cssStyle="width:100px;"/></td>
		        <td><s:textfield id="price4" name="price4" maxlength="15" cssStyle="width:100px;" cssClass="cost"/></td>
		        <td><s:textfield id="msrp4" name="msrp4" maxlength="15" cssStyle="width:100px;" cssClass="msrpClass" /></td>
	        </tr>
	    </table> 
	    <!--Manufacturer Product ID-->
	    
	    <br />
        <!--bar code-->
        <label for="accept_team_members">UPC:</label>
        <s:textfield id="upc" name="upc" maxlength="50" cssStyle="width:150px;"/>
        <span id="upc_Error" style="display:none;margin-left:2px;"></span>
        <!--bar code-->
        <br />
        <!--Loyalty Product ID-->
        <label for="accept_team_members">Loyalty Source Product ID:</label>
        <s:textfield id="loyaltyProductId" name="loyaltyProductId" maxlength="50" cssStyle="width:150px;"/>
        <!-- <s:hidden id="loyaltyProductIdSub" name="loyaltyProductIdSub" value="" /> -->
        <span id="loyaltyProductId_Error" style="display:none;margin-left:2px;"></span>
        <!--Loyalty Product ID-->
        <br />
        <!--Name ENGLISH-->
        <label for="accept_team_members">Name - ENGLISH:</label>        
        <s:textfield id="nameEn" name="nameEn" maxlength="75" cssStyle="width:400px;"/>
        <span id="nameEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Name ENGLISH-->
        <br />
        <!--Name FRENCH-->
        <label for="accept_team_members">Name - FRENCH:</label>
        <s:textfield id="nameFr" name="nameFr" maxlength="75" cssStyle="width:400px;"/>
         <span id="nameFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Name FRENCH-->
        <br />
        <!--Product Image-->
        <!--<label for="accept_team_members">Product IMAGE:</label>-->
		<!-- <input type="file" name="productImage" size="31" /> .PNG .JPEG  --> 
		<!--<s:file name="productImage" size="31" />.PNG .JPEG  --> 
        <!--CHANGE IMAGE-->
        <!--<br />-->
        <!--MSRP-->
        <label for="accept_team_members">MSRP:</label>        
        <s:textfield id="msrp" name="msrp" maxlength="15" cssStyle="width:80px;" />
        <span id="msrp_Error" style="display:none;margin-left:2px;"></span>
        <!--MSRP-->
        <br />
        <!--OUR COST-->
        <label for="accept_team_members">Our cost:</label>       
        <s:textfield id="cost" name="cost" maxlength="15" cssStyle="width:80px;" />
         <span id="cost_Error" style="display:none;margin-left:2px;"></span>
        <!--OUR COST-->
        <br /><br /><br />

    <!-- Template table --> 
		<table  id="tabTemp" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
		 	<thead class="gray_header">
				<tr>
					<th width="120px"><s:text name="Client Type" /></th>
					<th width="110px"><s:text name="Selling Price" /></th>
					<th width="155px" style="padding-left:0px; padding-right:0px;"><s:text name="Profit_%" /></th>
					<th width="110px"><s:text name="Discount_%" /></th>
					<th width="77px"><s:text name="Exclude" /></th>
					<th style="display:none;visibility:hidden"><s:text name="clientCategoryId" /></th>
					<th colspan="2" style="display:none;visibility:hidden;background: white;border-left:1px solid #555;border-top:1px solid white;
						       border-right:1px solid white;"></th>
				</tr>
			</thead>
					<s:if test="%{listClientCategory != null}">
						<s:if test="%{listClientCategory.size > 0}" >
							<tbody>
								<s:iterator value="listClientCategory" status="clientCategory">
									<tr>
										<td><s:property value="clientCategoryName"/></td>	
																		
										<td><input 	id="userPriceTemp" 
													style="text-align: center; width: 80px;"/>$</td>
															    									
										<td><input 	id="percentageProfitTemp" 
													style="text-align: center; width: 80px;" class="pa10"/>%</td>	
														    									
										<td><input 	id="percentageDiscountTemp" 
													style="text-align: center; width: 40px;" class="pa10"/>%</td>
															    																							
										<td  id="columnClientCategoryIdTemp" 
										     style="display:none;visibility:hidden;background: white;border-left:1px solid #555;border-top:1px solid white;
						          				   border-right:1px solid white;border-bottom:1px solid white;">
													<center><input	type="hidden" id="clientCategoryIdTemp"
													value='<s:property value="clientCategoryId"/>' 
													class="pa10" /></center></td>
													    																							
										<td style="display:none;visibility:hidden;background: white;border-left:1px solid #555;border-top:1px solid white;
						          				   border-right:1px solid white;border-bottom:1px solid white;" >
													<input	type="hidden" id="userIdTemp" 
													value='<s:property value="clientCategoryUserId"/>' 
													class="pa10" /></td>
	
										<td align="center">
													<input 	type="checkbox" 
															title="if checked here, all users who have this template will be excluded for this product"
															id="isExcludedTemp" 
															class="pa10" /></td>						
									</tr>
								</s:iterator>
							</tbody>
						</s:if>
					</s:if>	            								
		</table>
     <!-- Template table -->

 	<!-- Price table -->
	<div id="userNameList" class="fixed column" style="padding:20px 0px 0px 0px;">	    
		<div class="blue f12 bold pb10" style="padding-bottom:10px;"></div>
			<div id="productListData" style="width:1500px;"> 		   
				<table id="tabUsersPrice" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable">
					<thead class="gray_header">
					<tr>
						<th width="120px" style="display:none;visibility:hidden"><s:text name="login" /></th>
						<th width="120px"><s:text name="Client Name" /></th>
						<th width="110px"><s:text name="Selling Price" /></th>
						<th width="155x" style="padding-left:0px; padding-right:0px;"><s:text name="Selling Price Currency" /></th>
						<th width="110px"><s:text name="Profit_%" /></th>
						<th width="30px"><s:text name="Discount_%" /></th>
						<th width="20px"><s:text name="Exclude" /></th>
						<th style="display:none;visibility:hidden"><s:text name="clientCategoryId" /></th>
						<th colspan="4"  style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						           border-right:1px solid white;border-bottom:1px solid white;">
						    	  <img  id="showRows" src="./images/showRowsMouseOut.png" width="40" height="20" /></th>
						
					</tr>
					</thead>
						<s:if test="%{userNameList != null}">
							<s:if test="%{userNameList.size > 0}" >
								<tbody>
									<s:iterator value="userNameList" status="count">
										<tr id="rowTabUsersPrice">
										 <td style="display:none;visibility:hidden"><input id="usersLogin" type="text" value='<s:property value="login"/>'></input></td>
											
											<td><s:property value="login"/></td>
											
												<s:if test='%{excluded[#count.index] == "t"}' >
													<td><input 	id="userPrice_<s:property value="id"/>"
																disabled="disabled" 
																style="text-align: center; width: 80px;" 
																value="<s:property value="%{userPrice[#count.index]}"/>"
																name="userPrice"/>$</td>
												</s:if>
												<s:if test='%{excluded[#count.index] == "f"}' >
													<td><input 	id="userPrice_<s:property value="id"/>"
																style="text-align: center; width: 80px;" 
																value="<s:property value="%{userPrice[#count.index]}"/>"
																name="userPrice"/>$</td>
												</s:if>
												
												<!-- Currency -->
												<s:if test='%{excluded[#count.index] == "t"}' >
													<td style="padding-right:0px;">
														<input 	id="currencyPrice_<s:property value="id"/>"
																disabled="disabled" 
																style="text-align: center; width: 80px; color:red;" 
																value="<s:property value="%{currencyPrice[#count.index]}"/>"
																name="currencyPrice"/>
													 	<s:if test='%{currencySymbol[#count.index] != "CAD"}' >
													 		<span style="color: #AAAAAA;">
													 			<s:if test='%{currencySymbol[#count.index] == "USD"}' >$ </s:if>
													 			<s:property value="%{currencySymbol[#count.index]}"/>
													 		</span>
													 	</s:if>
													</td>
												</s:if>
												<s:if test='%{excluded[#count.index] == "f"}' >
													<td style="padding-right:0px;">
														<s:if test='%{currencySymbol[#count.index] != "CAD"}' >
															<input 	id="currencyPrice_<s:property value="id"/>"
																	disabled="disabled"
																	style="text-align: center; width: 80px; color:red;" 
																	value="<s:property value="%{currencyPrice[#count.index]}"/>"
																	name="currencyPrice" /> 
															<span style="color: red;">
																<s:if test='%{currencySymbol[#count.index] == "USD"}' >$ </s:if>
																<s:property value="%{currencySymbol[#count.index]}"/>
															</span>
														</s:if>
														<s:if test='%{currencySymbol[#count.index] == "CAD"}' >
															<input 	id="currencyPrice_<s:property value="id"/>"
																disabled="disabled"
																style="display:none; visibility:hidden;" 
																value="<s:property value="%{currencyPrice[#count.index]}"/>"
																name="currencyPrice"/>
														</s:if>
													</td>
												</s:if>
												<td style="display:none; visibility:hidden;">
													<!-- currencyRate -->
													<input 	id="currencyRate_<s:property value="id"/>"
															disabled="disabled"
															style="text-align: center; width: 80px; color:red;" 
															value="<s:property value="%{currencyRate[#count.index]}"/>"
															name="currencyRate" />
												</td>
												<!-- Currency -->
																								
												<s:if test='%{excluded[#count.index] == "t"}' >
													<td><input 	id="percentageProfit_<s:property value="id"/>"
																disabled="disabled" 
																style="text-align: center; width: 80px;" 
																value="<s:property value="%{percentageProfit[#count.index]}"/>" 
																class="pa10" 
																name="percentageProfit"/>%</td>
												</s:if>
												<s:if test='%{excluded[#count.index] == "f"}' >
													<td><input 	id="percentageProfit_<s:property value="id"/>"
																style="text-align: center; width: 80px;" 
																value="<s:property value="%{percentageProfit[#count.index]}"/>" 
																class="pa10" 
																name="percentageProfit"/>%</td>
												</s:if>

												<s:if test='%{excluded[#count.index] == "t"}' >														
													<td><input 	id="percentageDiscount_<s:property value="id"/>"
																disabled="disabled" 
																style="text-align: center; width: 40px;"
																value="<s:property value="%{percentageDiscount[#count.index]}"/>"  
																class="pa10"												
																name="percentageDiscount"/>%</td>
												</s:if>
												<s:if test='%{excluded[#count.index] == "f"}' >														
													<td><input 	id="percentageDiscount_<s:property value="id"/>" 
																style="text-align: center; width: 40px;" 
																value="<s:property value="%{percentageDiscount[#count.index]}"/>"  
																class="pa10"												
																name="percentageDiscount"/>%</td>
												</s:if>											
											<td><center>
												<s:if test='%{excluded[#count.index] == "t"}' >
													<input 	type="checkbox" 
															title="if checked here, user will be excluded for this product"
															id="isExcluded" 
															name="isExcluded" 
															value="<s:property value="id"/>" 
															checked="checked"
															class="pa10" />											
												</s:if>
												<s:if test='%{excluded[#count.index] == "f"}' >
													<input	type="checkbox" 
															title="if checked here, user will be excluded for this product"
															id="isExcluded" 
															name="isExcluded" 
															value="<s:property value="id"/>" 
															class="pa10" />
												</s:if>
											</center></td>
											
											<td colspan="2" id="columnClientCategoryIdUsers"
												style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						           					   border-right:1px solid white;border-bottom:1px solid white;"	   >
													<input 	type="hidden" id="clientCategoryId" name="clientCategoryId"
													value='<s:property value="clientCategoryId"/>' /></td>
										
											<td style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						           					   border-right:1px solid white;border-bottom:1px solid white;">
												   <input type="hidden" id="userId" value='<s:property value="id"/>'/></td>	
												   
											<td style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						                               border-right:1px solid white;border-bottom:1px solid white;">
												   <input type="hidden" id="template" value='<s:property value="template"/>'/></td>	
										</tr>
									</s:iterator>
								</tbody>
							</s:if>
						</s:if>	            								
	    	</table>
	    	<br/><br/>
		</div>		
	  </div>
      <br />
        <!-- Price table --> 
        
        <table border="0">
        <!--PRODUCT SIZE AND WEIGHT-->
       	<tr align="left">
       	 <td><label for="accept_team_members" style="width:159px;">Product size:</label></td>
       	 <td>L:<s:textfield id="large" name="large" maxlength="6" cssStyle="width:40px;" value="%{large}" /><i>in</i></td>
       	 <td width="10px"></td>
       	 <td>W:<s:textfield id="width" name="width" maxlength="6" cssStyle="width:40px;" value="%{width}" /><i>in</i>
       	 <td width="10px"></td>
       	 <td>H:<s:textfield id="high" name="high" maxlength="6" cssStyle="width:40px;" value="%{high}" /><i>in</i>
       	 <td><label for="accept_team_members" style="width:120px; text-align: right;">Product Weight:</label>
       	 		<s:textfield id="weight" name="weight" maxlength="6" cssStyle="width:40px;" value="%{weight}" /><i>lbs</i>
       	 </td>
       	 <td width="25px"></td>
       	 <td id="columnNotify" rowspan="2" width="120px">
       	 	<img id="sizesNotifyId"   src="images/orders/infoMissing.png" style="display:none;visibility:hidden;" />
       	 	<s:hidden id="txtSizesNotifyId" />
       	 </td>
       	</tr>
       	<tr align="left">
       	 <td><label for="accept_team_members" style="width:120px;"> </label></td>
       	 <td>L:<s:textfield id="largeCm" name="largeCm" maxlength="6" cssStyle="width:40px;" /><i>cm</i></td>
       	 <td width="10px"></td>
       	 <td>W:<s:textfield id="widthCm" name="widthCm" maxlength="6" cssStyle="width:40px;" /><i>cm</i>
       	 <td width="10px"></td>
       	 <td>H:<s:textfield id="highCm" name="highCm" maxlength="6" cssStyle="width:40px;" /><i>cm</i>
       	 <td><label for="accept_team_members" style="width:120px; text-align: right;"> </label>
       	 	 <s:textfield id="weightKg" name="weightKg" maxlength="6" cssStyle="width:40px;" /><i>kg</i>
       	 </td>
       	 <td width="25px"></td>
       	 <td> </td>
       	</tr>
       	<!--PRODUCT SIZE AND WEIGHT-->
       	<tr height="10px"></tr>
       	<!--BOX SIZE AND WEIGHT-->
       	<tr align="left">
       	 <td><label for="accept_team_members" style="width:159px;">Box size:</label></td>
       	 <td>L:<s:textfield id="boxLengthId" name="boxLength" value="%{boxDTO.length}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td width="10px"></td>
       	 <td>W:<s:textfield id="boxWidthId" name="boxWidth" value="%{boxDTO.width}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td width="10px"></td>
       	 <td>H:<s:textfield id="boxHeightId" name="boxHeight" value="%{boxDTO.height}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td><label for="accept_team_members" style="width:120px; text-align: right;">Box Weight:</label>
       	 	 <s:textfield id="boxWeightId" name="boxTotalWeight" value="%{boxDTO.totalWeight}" maxlength="6" cssStyle="width:40px;"/><i>lbs</i>
       	 </td>
       	 <td width="25px"></td>
       	 <td rowspan="2" width="120px">
       	 	<s:if test="%{boxDTO.statusId == 1}">
       	 		<s:checkbox id="canadaPostSizesVerifiedId" name="canadaPostSizesVerified" checked="checked" cssStyle="color:#00FF00;" />
       	 	</s:if>
       	 	<s:else>
       	 		<s:checkbox id="canadaPostSizesVerifiedId" name="canadaPostSizesVerified" cssStyle="color:#00FF00;" />
       	 	</s:else>
       	 	<span id="CpVerifiedId" style="color:#ACACAC; font-weight: bold;">CP Verified</span>
       	 	<s:hidden id="statusProductBoxId" name="statusProductBox" value="%{boxDTO.statusId}" />
       	 </td>
       	</tr>
       	<tr align="left">
       	 <td><label for="accept_team_members" style="width:120px;"> </label></td>
       	 <td>L:<s:textfield id="boxLengthCmId" name="boxLengthCm" maxlength="6" cssStyle="width:40px;"/><i>cm</i></td>
       	 <td width="10px"></td>
       	 <td>W:<s:textfield id="boxWidthCmId" name="boxWidthCm" maxlength="6" cssStyle="width:40px;"/><i>cm</i></td>
       	 <td width="10px"></td>
       	 <td>H:<s:textfield id="boxHeightCmId" name="boxHeightCm" maxlength="6" cssStyle="width:40px;"/><i>cm</i></td>
       	 <td><label for="accept_team_members" style="width:120px; text-align: right;"> </label>
       	 	 <s:textfield id="boxWeightKgId" name="boxWeightKg" maxlength="6" cssStyle="width:40px;"/><i>kg</i>
       	 </td>
       	 <td width="25px"></td>
       	</tr>
       	<tr height="10px"></tr>
       	<!--PRODUCT SIZE AND WEIGHT-->
       	
        </table>
        
        <!--Link url-->
        <label for="accept_team_members">Link url:</label>
        <s:textfield id="linkUrl" name="linkUrl" cssStyle="width:150px;"/>
        <span id="linkUrl_Error" style="display:none;margin-left:2px;"></span>
        <!--Link url-->        
        <br />
        <!--Warranty-->
        <table>
        <tr>
        <td><label for="accept_team_members">Warranty:</label></td>
	    <s:if test="%{defectFree == false}">
        	<td><s:textfield 	id="warrantyQuantity" 
        						name="warrantyQuantity" 
        						maxlength="7" 
        						cssStyle="width:35px;"/></td>
        </s:if>
	    <s:if test="%{defectFree == true}">
        	<td><s:textfield 	id="warrantyQuantity" 
        						name="warrantyQuantity" 
        						maxlength="7" 
        						cssStyle="width:35px;" 
        						disabled="true"
        						value="" /></td>
         </s:if>         
        <td>&nbsp;</td><td>&nbsp;</td>       	 
       	<s:if test="%{periodTime == 'month'}"> 
       		<td><input type="radio" id="grpMonth" name="periodTime" value="month" maxlength="1" checked/>Month(s)</td>
       		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
       		<td><input type="radio" id="grpYear" name="periodTime" value="year" maxlength="1"  />Year(s)</td>
       	</s:if>
       	<s:if test="%{periodTime == 'year'}"> 
       		<td><input type="radio" id="grpMonth" name="periodTime" value="month" maxlength="1" />Month(s)</td>
       		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
       		<td><input type="radio" id="grpYear" name="periodTime" value="year" maxlength="1" checked />Year(s)</td>
       	</s:if>
       	      		
	    <s:if test="%{defectFree == true}">
	    	<td><input type="radio" id="grpMonth" name="periodTime" value="month" maxlength="1" disabled="disabled"/>Month(s)</td>
       		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
       		<td><input type="radio" id="grpYear" name="periodTime" value="year" maxlength="1" checked disabled="disabled"/>Year(s)</td>
       		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td> 
	       	<td><s:checkbox id="defectFree" name="defectFree" cssStyle="width:35px;" value="true" /></td>
	    </s:if>
	     <s:if test="%{defectFree == false}">
	       	<td><s:checkbox id="defectFree" name="defectFree" cssStyle="width:35px;" value="" /></td>
	    </s:if>
       	<td>Defect-free</td>
       	
       	</tr>
       	</table>
        <!--Warranty-->  
        <br />
        
        <br />
        <!-- ======================== Descriptions =================== -->
        <div style="width: 630px;">
        <!--Description ENGLISH-->
        <label for="accept_team_members">Description - ENGLISH:</label>
        <s:textarea id="descriptionEn" name="descriptionEn" cssClass="ckeditor ckENdesc" />
         <span id="descriptionEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Description ENGLISH-->
        
        <br />
        <!--Description FRENCH-->
        <label for="accept_team_members">Description - FRENCH:</label>
        <s:textarea id="descriptionFr" name="descriptionFr"  cssClass="ckeditor ckFRdesc" />
         <span id="descriptionFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Description FRENCH-->
        
        <br />
        <!--SPECS ENGLISH-->
        <label for="accept_team_members">Specs - ENGLISH:</label>
        <s:textarea id="specificationEn" name="specificationEn" cssClass="ckeditor ckENspec" />
         <span id="specificationEn_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS ENGLISH-->
        
        <br />
        <!--SPECS FRENCH-->
        <label for="accept_team_members">Specs - FRENCH:</label>       
        <s:textarea id="specificationFr" name="specificationFr" cssClass="ckeditor ckFRspec" />
         <span id="specificationFr_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS FRENCH-->
        
        <br />  
        <!--OTHERS ENGLISH-->
        <label for="accept_team_members">Others - ENGLISH:</label>
        <s:textarea id="otherEng" name="otherEng" cssClass="ckeditor ckENother" />
         <span id="otherEng_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS ENGLISH-->
        
        <br />
        <!--OTHERS FRENCH-->
        <label for="accept_team_members">Others - FRENCH:</label>       
        <s:textarea id="otherFr" name="otherFr" cssClass="ckeditor ckFRother" />
         <span id="otherFr_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS FRENCH-->
        
        <br />
        <!--NOTE-->
        <label for="accept_team_members" style="float:none;">Note:</label>       
        <s:textarea id="note" name="note" rows="10" cssStyle="width:100%;"></s:textarea>
        <!--NOTE-->  
		</div>        	    	
         <!-- ======================== End Descriptions =================== -->
        <br />
        <s:if test='%{#session.usr == "menu"}' > 
       		<input id="btUpdateProduct" type="submit" value="Update Product" 
       	   			style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
		</s:if>
      </fieldset>
    </s:form>
    
     <s:form name="frm" action="getProductList.do">
     	<s:hidden id="signalHid" name="signalHid" value="" />
     	<s:hidden id="brandIDHid" name="brandIDHid" value="" />
     	<s:hidden id="categoryIDHid" name="categoryIDHid" value="" />     	
     	<input id="productListButton" name="productListButton" type="submit" value="Product List" 
     			style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;" />
    </s:form>
        
    <%@ include file="dialogues/progressBar.jsp" %>
	<%@ include file="dialogues/controlePrice.jsp" %>
	<%@ include file="dialogues/confirmCPVerifiedPop.jsp" %>
  </div>
  
  <!-- Separtor -->
  
  <div class="pop_title" style="margin-top:30px;"></div>
 
<!-- ======================== Control of logs ====================== -->
		<div class="tableLog_title"><a id="hrefShowLogs" href="">Show History on this product</a></div>
		<!-- Fields Titles  -->
		<div id="divLogsTitles" style="width:800px;">
		<table  id="tabLogsTitles" border="0" cellspacing="0" cellpadding="0"
				style="table-layout: fixed; width:100%;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
		 	<thead style="background-color:rgb(240,240,240);">
				<tr>
					<th style="width:140px; padding: 0ps;height: 20px;margin: 0px;">OP. Date</th>
					<th width="100px" valign="middle">OP. Type</th>
					<th valign="middle" width="200px">Data Before</th>
					<th valign="middle" width="200px">Data After</th>
					<th valign="middle">Full Name Admin </th>
					
				</tr>
			</thead>
			</table>
		</div>
		<!-- END Fields Titles  -->
		<!-- Fields Data  -->
		<div id="divLogs" style="width:800px;overflow: auto;max-height: 300px;display:none;visibility:hidden;">
		<table  id="tabLogs" border="0" cellspacing="0" cellpadding="0"
				style="width:100%;text-align:center;border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;" >
		 	
			<tbody>
			  <s:iterator value="opertionsDTOList" status="status">
				  <tr style="border-left: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;border-top: 1px solid #CCCCCC;">
						<td class="border_rigth middleTdDate">
						    <s:date name="operationDate" var="operationDate" format="yyyy/MM/dd 'at' hh:mm a"/>
						    <s:property value="%{#operationDate}" /></td>
						<td class="border_rigth_left middleTdType" ><s:text name="operationType"></s:text></td>
						<td class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataBefore"/></center></td>
						<td class="border_rigth_left middleTdData"><center class="tagCenterData"><s:text name="dataAfter"/></center></td>
						<td class="middleTdFullName" style="margin-left: 0px;"><div><s:text name="realNameUser"/></div></td>
				  </tr>
	     	  </s:iterator>		
			</tbody>							
		</table>
		</div>
		<!-- End Fields Data  -->
		<br/>
   <!-- ======================== Control of logs ====================== -->
   
  
  
  
  
</div>
  <script type="text/javascript">
  
  $(document).ready(function() {
	  initRichEditorWhenReady();
	
	  var requiredMessage = '<s:text name="loyauty.error.common.required" />';
	  var vanadiumAdv = "vanadium-advice -vanadium-empty-advice- vanadium-invalid";
	  var VanadiumRules = {
			brand: [
	  			'only_on_blur',
	  			['advice','brand_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		category: [
	  			'only_on_blur',
	  			['advice','category_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		mainSpecification: [
	  			'only_on_blur',
	  			['advice','main_spec_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		statusId: [
	  		  	'only_on_blur',
	  		  	['advice','status_Error'],
	  		  	{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		manufProductID: [
	 			'only_on_blur',
	 			['advice','manufProductID_Error'],
	 			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		loyaltyProductId: [
	  			'only_on_blur',
	  			['advice','loyaltyProductId_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		nameEn: [
	   			'only_on_blur',
	   			['advice','nameEn_Error'],
	   			{validator:'required', invalidCustomMessage: requiredMessage}
	  		],
	  		nameFr: [
				'only_on_blur',
				['advice','nameFr_Error'],
				{validator:'required', invalidCustomMessage: requiredMessage}
	  		],  
	  		msrp: [
	  			'only_on_blur',
	  			['advice','msrp_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],
	  		cost: [
	  			'only_on_blur',
	  			['advice','cost_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],  	  	
	  	   descriptionEn: [
	  			'only_on_blur',
	  			['advice','descriptionEn_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],  
	   	   descriptionFr: [
	   			'only_on_blur',
	   			['advice','descriptionFr_Error'],
	   			{validator:'required', invalidCustomMessage: requiredMessage}
	   	  	], 
	   	   specificationEn: [
	  	  		'only_on_blur',
	  	  		['advice','specificationEn_Error'],
	  	  		{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	], 
	  	    specificationFr: [
	  			'only_on_blur',
	  			['advice','specificationFr_Error'],
	  			{validator:'required', invalidCustomMessage: requiredMessage}
	  	  	],
		  	otherEng: [
		 		'only_on_blur',
		 	  	['advice','otherEng_Error'],
		 		{validator:'required', invalidCustomMessage: requiredMessage}
			], 
		 	otherFr: [
		 		'only_on_blur',
		 	  	['advice','otherFr_Error'],
		 	  	{validator:'required', invalidCustomMessage: requiredMessage}
		 	],   	    	  	  	  	    	    	  	  	  					
	  		formContainer: 'container'
	  	};
	  
	    setInterval('flashImage()',900);
	  
	    
	    // Set Box sizes to readonly if CP Verified is checked 
	  	if($("#canadaPostSizesVerifiedId").is(':checked')) {
		  $("#boxLengthId, #boxLengthCmId").css("backgroundColor", "#E9E9E9");
		  $("#boxWidthId, #boxWidthCmId").css("backgroundColor", "#E9E9E9");
		  $("#boxHeightId, #boxHeightCmId").css("backgroundColor", "#E9E9E9");
		  $("#boxWeightId, #boxWeightKgId").css("backgroundColor", "#E9E9E9");
		  $("#boxLengthId , #boxLengthCmId, #boxWidthId, #boxWidthCmId").attr("readonly","readonly");
		  $("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").attr("readonly","readonly");
	  	}
	  
		var notifyMsg;
		// ---------------------
		var boxLength = $("#boxLengthId").val();
		if(parseFloat(boxLength)==0) {
			$("#boxLengthId").val("");
		}    
		var boxWidth = $("#boxWidthId").val();
		if(parseFloat(boxWidth)==0) {
			$("#boxWidthId").val("");
		}
		var boxHeight = $("#boxHeightId").val();
		if(parseFloat(boxHeight)==0) {
			$("#boxHeightId").val("");
		}
		var boxWeight = $("#boxWeightId").val();
		if(parseFloat(boxWeight)==0) {
			$("#boxWeightId").val("");
		}// ---------------------
		
		/*
		//Test if Product sizes > Box sizes 
		$("#txtSizesNotifyId").val("");
		if(parseFloat($("#boxLengthId").val()) < parseFloat($("#large").val())){
			notifyMsg = $("#txtSizesNotifyId").val() + "Product Length is bigger than or equal Box Length. ";
			$("#txtSizesNotifyId").val(notifyMsg);
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		}
		if(parseFloat($("#boxWidthId").val()) < parseFloat($("#width").val())){
			notifyMsg = $("#txtSizesNotifyId").val() + "Product Width is bigger than or equal Box Width. ";
			$("#txtSizesNotifyId").val(notifyMsg);
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		}
		if(parseFloat($("#boxHeightId").val()) < parseFloat($("#high").val())){
			notifyMsg = $("#txtSizesNotifyId").val() + "Product Height is bigger than or equal Box Height. ";
			$("#txtSizesNotifyId").val(notifyMsg);
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		}
		if(parseFloat($("#boxWeightId").val()) < parseFloat($("#weight").val())){
			notifyMsg = $("#txtSizesNotifyId").val() + "Product Weight is bigger than or equal Box Weight. ";
			$("#txtSizesNotifyId").val(notifyMsg);
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		}
		*/
		
		//get large/width/heigh in cm and weight in kg 
		//large 
		var largeCm = $("#large").val();
		if(isNumber(largeCm)) {
			largeCm = ($("#large").val())*2.54;
			var valueCm = parseFloat(largeCm).toFixed(2);
			$("#largeCm").val(valueCm);
			if(valueCm==0) {
				$("#large, #largeCm").val(0);
			}
		}
		//width 
		var widthCm = $("#width").val();
		if(isNumber(widthCm)) {
		 	widthCm = ($("#width").val())*2.54;
			var valueCm = parseFloat(widthCm).toFixed(2);
			$("#widthCm").val(valueCm);
			if(widthCm==0) {
				$("#width, #widthCm").val(0);
			}
		}
	    //high 
		var highCm = $("#high").val();
		if(isNumber(highCm)) {
			highCm = ($("#high").val())*2.54;
			var valueCm = parseFloat(highCm).toFixed(2);
			$("#highCm").val(valueCm);
			if(valueCm==0) {
				$("#high, #highCm").val(0);
			}
		} 
		//weight 
		var weightKg = $("#weight").val();
		if(isNumber(weightKg)) {
		 	weightKg = ($("#weight").val())*0.453592;
			var valueKg = parseFloat(weightKg).toFixed(2);
			$("#weightKg").val(valueKg);
			if(valueKg==0) {
				$("#weight, #weightKg").val(0);
			}
		}
	    //-------------------------------------------------
	    
	    //get boxLengthId/boxWidthId/boxHeightId/ in cm and boxWeightId in kg 
	  	//boxLengthId 
	  	var boxLengthCm = $("#boxLengthId").val();
	  	if(isNumber(boxLengthCm)) {
			boxLengthCm = ($("#boxLengthId").val())*2.54;
			var valueCm = parseFloat(boxLengthCm).toFixed(2);
			$("#boxLengthCmId").val(valueCm);
			if(valueCm==0) {
				$("#boxLengthId, #boxLengthCmId").val(0);
			}
	  	}
	    //boxWidthId 
	  	var boxWidthCm = $("#boxWidthId").val();
	  	if(isNumber(boxWidthCm)) {
		 	boxWidthCm = ($("#boxWidthId").val())*2.54;
			var valueCm = parseFloat(boxWidthCm).toFixed(2);
			$("#boxWidthCmId").val(valueCm);
			if(valueCm==0) {
				$("#boxWidthId, #boxWidthCmId").val(0);
			}
	  	}
	    //boxHeightId 
	  	var boxHeightCm = $("#boxHeightId").val();
	  	if(isNumber(boxHeightCm)) {
		  	boxHeightCm = ($("#boxHeightId").val())*2.54;
			var valueCm = parseFloat(boxHeightCm).toFixed(2);
			$("#boxHeightCmId").val(valueCm);
			if(valueCm==0) {
				$("#boxHeightId, #boxHeightCmId").val(0);
			}
	  	}
	    //boxWeightId  
	  	var boxWeightKg = $("#boxWeightId").val();
	  	if(isNumber(boxWeightKg)) {
		  	boxWeightKg = ($("#boxWeightId").val())*0.453592;
			var valueKg = parseFloat(boxWeightKg).toFixed(2);
			$("#boxWeightKgId").val(valueKg);
			if(valueKg==0) {
				$("#weight, #weightKg").val(0);
			}
	  	}
	    //------------------------------------------------- 
	    
		
		
		
		$('#brandName').val($('#brand option:selected').text());
		$('#categoryName').val($('#category option:selected').text());	
		$('#mainSpecificationName').val($('#mainSpecification option:selected').text());
		$('#statusName').val($('#statusId option:selected').text());
				
		// brand changes
		$("#brand").change( function(){	
			var cat;				
			$('#brandName').val($('#brand option:selected').text());				
			populateCategory($(this).val(), cat);				
		});

		// category changes
		$("#category").change( function(){	
			var spec;						
			$('#categoryName').val($('#category option:selected').text());	
			populateMainSpecification($(this).val(), $("#brand").val(), spec);				
		});
		
		// mainSpecification changes
		$("#mainSpecification").change( function(){	
			$('#mainSpecificationName').val($('#mainSpecification option:selected').text());
		});	

		// status changes
		$("#statusId").change( function(){	
			$('#statusName').val($('#statusId option:selected').text());
		});	

		$("#manufProductID1").change(function() {
			if($(this).val() != '') {
				$(".cost").show();
				$(".msrpClass").show();				
			} else {
				$(".cost").hide();
				$(".msrpClass").hide();
			}
		});

		$(".cost").change(function() {
			var sum = 0;
			var value = 0;
			 $("input.cost").each(function(i, elem) {
				 value = parseFloat($(elem).val());
				 if($(elem).val() != '') {
					 $(elem).val(value.toFixed(2));
					 sum = parseFloat(sum) + parseFloat($(elem).val());
				 }
			 });
			 if(sum != 0) {
				 $("#cost").val(sum.toFixed(2));
			 }			 
		});
		
		$(".msrpClass").change(function() {
			var sum = 0;
			var value = 0;
			 $("input.msrpClass").each(function(i, elem) {
				 value = parseFloat($(elem).val());
				 if($(elem).val() != '') {
					 $(elem).val(value.toFixed(2));
					 sum = parseFloat(sum) + parseFloat($(elem).val());
				 }
			 });
			 if(sum != 0) {
				 $("#msrp").val(sum.toFixed(2));
			 }			 
		});
		
		$("#manufProductID").change(function() {
			var qty = $("#manufProductQuantity").val();
			if ( $(this).val().length == 0 || $(this).val() === "") {
				qty = "";
				$("#manufProductQuantity").val(qty);
				$("#supplier").val(qty);
				$("#price").val(qty);
				$(".cost").change();
				$(".msrpClass").change();
			} else {
				$("#manufProductQuantity").change(function () {
				var value = $(this).val();
				if ( $("#manufProductID").val().length != 0 ) {
					if ($("#manufProductQuantity").val() === "" 
					      ||  $("#manufProductQuantity").val() === "0") {
						value = 1;
					}	      
				} else {
					value = $(this).val();
				}
				$("#manufProductQuantity").val(value);
			}).change();				
			}			
		}).change();

		$("#manufProductID1").change(function() {
			var qty = $("#manufProductQuantity1").val();
			if ( $(this).val().length == 0 || $(this).val() === "") {
				qty = "";
				$("#manufProductQuantity1").val(qty);
				$("#supplier1").val(qty);
				$("#price1").val(qty);
				$(".cost").change();
				$(".msrpClass").change();
			} else {
				$("#manufProductQuantity1").change(function () {
				var value = $(this).val();
				if ( $("#manufProductID1").val().length != 0 ) {
					if ($("#manufProductQuantity1").val() === "" 
					      ||  $("#manufProductQuantity1").val() === "0") {
						value = 1;
					}	      
				} else {
					value = $(this).val();
				}
				$("#manufProductQuantity1").val(value);
			}).change();				
			}			
		}).change();

		$("#manufProductID2").change(function() {
			var qty = $("#manufProductQuantity2").val();
			if ( $(this).val().length == 0 || $(this).val() === "") {
				qty = "";
				$("#manufProductQuantity2").val(qty);
				$("#supplier2").val(qty);
				$("#price2").val(qty);
				$(".cost").change();
				$(".msrpClass").change();
			} else {
				$("#manufProductQuantity2").change(function () {
				var value = $(this).val();
				if ( $("#manufProductID2").val().length != 0 ) {
					if ($("#manufProductQuantity2").val() === "" 
					      ||  $("#manufProductQuantity2").val() === "0") {
						value = 1;
					}	      
				} else {
					value = $(this).val();
				}
				$("#manufProductQuantity2").val(value);
			}).change();				
			}			
		}).change();

		$("#manufProductID3").change(function() {
			var qty = $("#manufProductQuantity3").val();
			if ( $(this).val().length == 0 || $(this).val() === "") {
				qty = "";
				$("#manufProductQuantity3").val(qty);
				$("#supplier3").val(qty);
				$("#price3").val(qty);
				$(".cost").change();
				$(".msrpClass").change();
			} else {
				$("#manufProductQuantity3").change(function () {
				var value = $(this).val();
				if ( $("#manufProductID3").val().length != 0 ) {
					if ($("#manufProductQuantity3").val() === "" 
					      ||  $("#manufProductQuantity3").val() === "0") {
						value = 1;
					}	      
				} else {
					value = $(this).val();
				}
				$("#manufProductQuantity3").val(value);
			}).change();				
			}			
		}).change();

		$("#manufProductID4").change(function() {
			var qty = $("#manufProductQuantity4").val();
			if ( $(this).val().length == 0 || $(this).val() === "") {
				qty = "";
				$("#manufProductQuantity4").val(qty);
				$("#supplier4").val(qty);
				$("#price4").val(qty);
				$(".cost").change();
				$(".msrpClass").change();
			} else {
				$("#manufProductQuantity4").change(function () {
				var value = $(this).val();
				if ( $("#manufProductID4").val().length != 0 ) {
					if ($("#manufProductQuantity4").val() === "" 
					      ||  $("#manufProductQuantity4").val() === "0") {
						value = 1;
					}	      
				} else {
					value = $(this).val();
				}
				$("#manufProductQuantity4").val(value);
			}).change();				
			}			
		}).change();
		
		var productId = $("#productId").val();
		var imageId = $("#imageId").val();

		 var uploader = new qq.FileUploader( {
		        // pass the dom node (ex. $(selector)[0] for jQuery users)
		        element: document.getElementById('file-uploader'),
		        // path to server-side upload script
		        action: 'ajax/uploadImage.do',
		        //add params
		        params: {},
		        debug: true,
		        onSubmit: function(id, fileName) {
		            uploader.setParams({productId: productId, imageId: imageId});
		        },
		        onComplete: function(id, fileName, res) {
		            $(".qq-upload-list").empty();
		        	if( res.success === true ) {
		        		$("#messageUpload").removeClass(vanadiumAdv).hide();
						var app = '<div class="hcenter" style="padding-top:10px;">' +
								  '<div id="image" class="hcenter"><img width="300" height="300" src="${product}large/'+res.name+'?_='+new Date().getTime()+'" /></div>'+
								  '<div style="margin-top:3px;">Current Size:</div>'+
								  '<span id="img_dim">'+ res.width +'x' + res.height +' - ' + res.size + 'kb</span></div>';
						
						$("#imageId").val(res.imageId);
						
		            	$('.image').html(app);        		         
		        	} else {                			
		            	$("#messageUpload").removeClass(vanadiumAdv);        
		            	$("#messageUpload").addClass(vanadiumAdv).html("<span>" + res.success + "&nbsp;<a href='http://faq.gamejab.com/node/11' target='_blank'>" + res.msg + "</a></span>").show();                        
		         	}
		        }        
		    });

	 	$("#defectFree").click(function() {
			var checked = $("input:checked[value='true']").val();
			$("#warrantyQuantity").attr('value', '');
			if (checked) {
				$("#warrantyQuantity").attr('disabled', true);
				$("#grpMonth").attr('disabled', true);
				$("#grpYear").attr('disabled', true);

				$("#warranty").attr('value', 'defect-free');						
			} else {	// undefined
				$("#warrantyQuantity").attr('disabled', false);
				$("#grpMonth").attr('disabled', false);
				$("#grpYear").attr('disabled', false);

				//$("#warranty").attr('value', '');
			}		
		});
	 	
	 	
	 	//----------------------------- Checkbox: CP Verified: Change format of cursor  ---------- 
		  // 
		//----------------------------------------------------------------------------------------
	 	$("#canadaPostSizesVerifiedId").hover(function() {
		    $(this).css('cursor','pointer');
		});
	 	
	 	/*
	 	//----------------------------- Sizes Notify Link: Change format of cursor  -------------- 
		  // 
		//----------------------------------------------------------------------------------------
		$("#sizesNotifyId").hover(function() {
		    $(this).css('cursor','pointer');
		});
	 	
		//----------------------------- When clicking on Sizes Notify image ---------------------- 
		// To change the status of the CP verified 
		//----------------------------------------------------------------------------------------
		$("#sizesNotifyId").click(function() {
			var s = $("#txtSizesNotifyId").val();
			var position =$("#sizesNotifyId").position();
			$("#confirmCPVerifiedPop").css('top',position.top-200);
			$('#confirmCPVerifiedPop #msgConfirmation').text(s);
			$('#confirmCPVerifiedPop').css("display","block"); 
			$('#confirmCPVerifiedPop').css("visibility","visible");
		});
	 	
		//----------------------------- When clicking on "No" button ----------------------------- 
		// 
		//----------------------------------------------------------------------------------------
			$("#confirmCPVerifiedPop #btOK").click(function() {
			$('#confirmCPVerifiedPop').css("display","none"); 
			$('#confirmCPVerifiedPop').css("visibility","hidden");
		});
	 	*/
	 	
	 	
		//----------------------------- When clicking on "CpVerified" CheckBox ------------------- 
		// To change the status of the CP verified 
		//----------------------------------------------------------------------------------------
		$("#canadaPostSizesVerifiedId").click(function() {
			if($(this).is(":checked")) {
				$("#statusProductBoxId").val(1);
				$("#canadaPostSizesVerifiedId").attr("checked", true);
				$("#boxLengthId, #boxLengthCmId, #boxWidthId, #boxWidthCmId").css("backgroundColor", "#E9E9E9");
				$("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").css("backgroundColor", "#E9E9E9");
				$("#boxLengthId , #boxLengthCmId, #boxWidthId, #boxWidthCmId").attr("readonly","readonly");
				$("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").attr("readonly","readonly");
			} else {
				$("#statusProductBoxId").val(0);
				$("#canadaPostSizesVerifiedId").attr("checked", false);
				$("#boxLengthId, #boxLengthCmId, #boxWidthId, #boxWidthCmId").css("backgroundColor", "#FFFFFF");
				$("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").css("backgroundColor", "#FFFFFF");
				$("#boxLengthId , #boxLengthCmId, #boxWidthId, #boxWidthCmId").removeAttr('readonly');
				$("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").removeAttr('readonly');
			}
		});
	 	
		
		//----------------------------- large/width/high/weight Validation (Lost Focus) --------- 
		  //accept juste numbers format 
		//---------------------------------------------------------------------------------------
		$("#formContainer #large, #width, #high, #weight").blur( function(){
			var index=$("#formContainer #large, #width, #high, #weight").index(this);
			var fieldVal;			
			if(index>=0) {
				switch (index) {
				case 0:
					fieldVal=$("#formContainer #large").val();
					var value = parseFloat(fieldVal).toFixed(2);
					if(isNumber(fieldVal)) {
						$("#formContainer #large, #largeCm").css("backgroundColor", "white");
						$("#formContainer #large").val(value);
						if(value==0) {
							$("#formContainer #large, #largeCm").val(0);
							$("#formContainer #large, #largeCm").css("backgroundColor", "#FF6666");
						} else {
							var cm = ($("#formContainer #large").val())*2.54;
							valueCm = parseFloat(cm).toFixed(2);
							$("#formContainer #largeCm").val(valueCm);
						}
					} else {
						$("#formContainer #large, #largeCm").val(0);
						$("#formContainer #large, #largeCm").css("backgroundColor", "#FF6666");
					}
					// Test if Box Length is less than Product Length 
					/*
					var boxSize = parseFloat($("#boxLengthId").val()).toFixed(2);
					var productSize = parseFloat($("#large").val()).toFixed(2);
					alert(boxSize);
					var message = "Product Length is bigger than or equal Box Length. ";
					var msgWithoutSpace = "ProductLengthisbiggerthanorequalBoxLength";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;
				
				case 1:
					fieldVal=$("#formContainer #width").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					$("#formContainer #width").css("backgroundColor", "white");
					if(isNumber(fieldVal)) {
						$("#formContainer #width, #widthCm").css("backgroundColor", "white");
						$("#formContainer #width").val(value);
						if(value==0) {
							$("#formContainer #width, #widthCm").val(0);
							$("#formContainer #width, #widthCm").css("backgroundColor", "#FF6666");
						} else {
							var cm = ($("#formContainer #width").val())*2.54;
							valueCm = parseFloat(cm).toFixed(2);
							$("#formContainer #widthCm").val(valueCm);
						}
					} else {
						$("#formContainer #width, #widthCm").val(0);
						$("#formContainer #width, #widthCm").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Width is less than Product Width 
					var boxSize = parseFloat($("#boxWidthId").val()).toFixed(2);
					var productSize = parseFloat($("#width").val()).toFixed(2);
					var message = "Product Width is bigger than or equal Box Width. ";
					var msgWithoutSpace = "ProductWidthisbiggerthanorequalBoxWidth";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;
				
				case 2:
					fieldVal=$("#formContainer #high").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					$("#formContainer #high").css("backgroundColor", "white");
					if(isNumber(fieldVal)) {
						$("#formContainer #high, #highCm").css("backgroundColor", "white");
						$("#formContainer #high").val(value);
						if(value==0) {
							$("#formContainer #high, #highCm").val(0);
							$("#formContainer #high, #highCm").css("backgroundColor", "#FF6666");
						} else {
							var cm = ($("#formContainer #high").val())*2.54;
							valueCm = parseFloat(cm).toFixed(2);
							$("#formContainer #highCm").val(valueCm);
						}
					} else {
						$("#formContainer #high, #highCm").val(0);
						$("#formContainer #high, #highCm").css("backgroundColor", "#FF6666");
					}
					// Test if Box Height is less than Product Height 
					/*
					var boxSize = parseFloat($("#boxHeightId").val()).toFixed(2);
					var productSize = parseFloat($("#high").val()).toFixed(2);
					var message = "Product Height is bigger than or equal Box Height. ";
					var msgWithoutSpace = "ProductHeightisbiggerthanorequalBoxHeight";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;
				
				case 3:
					fieldVal=$("#formContainer #weight").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					$("#formContainer #weight").css("backgroundColor", "white");
					if(isNumber(fieldVal)) {
						$("#formContainer #weight, #weightKg").css("backgroundColor", "white");
						$("#formContainer #weight").val(value);
						if(value==0) {
							$("#formContainer #weight, #weightKg").val(0);
							$("#formContainer #weight, #weightKg").css("backgroundColor", "#FF6666");
						} else {
							var kg = ($("#formContainer #weight").val())*0.453592; 
							valueKg = parseFloat(kg).toFixed(2);
							$("#formContainer #weightKg").val(valueKg);
						}
					} else {
						$("#formContainer #weight, #weightKg").val(0);
						$("#formContainer #weight, #weightKg").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Weight is less than Product Weight 
					var boxSize = parseFloat($("#boxWeightId").val()).toFixed(2);
					var productSize = parseFloat($("#weight").val()).toFixed(2);
					var message = "Product Weight is bigger than or equal Box Weight. ";
					var msgWithoutSpace = "ProductWeightisbiggerthanorequalBoxWeight";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;
				default:
					break;
				}
			}
		});
	 	
		//----------------------------- largeCm/widthCm/highCm/weightKg Validation  ------------- 
		  //accept juste numbers format 
		//----------------------------------------------------------------------------------------
		$("#formContainer #largeCm, #widthCm, #highCm, #weightKg").blur( function(){
			var index=$("#formContainer #largeCm, #widthCm, #highCm, #weightKg").index(this);
			var fieldVal;
			if(index>=0) {
				switch (index) {
				case 0:
					fieldVal=$("#formContainer #largeCm").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					if(isNumber(fieldVal)) {
						$("#formContainer #largeCm, #large").css("backgroundColor", "white");
						$("#formContainer #largeCm").val(value);
						if(value==0) {
							$("#formContainer #largeCm, #large").val(0);
							$("#formContainer #largeCm, #large").css("backgroundColor", "#FF6666");
						} else {
							var inch = ($("#formContainer #largeCm").val())*0.393701;
							valueInch = parseFloat(inch).toFixed(2);
							$("#formContainer #large").val(valueInch);
						}
					} else {
						$("#formContainer #largeCm, #large").val(0);
						$("#formContainer #largeCm, #large").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Length is less than Product Length 
					var boxSize = parseFloat($("#boxLengthCmId").val()).toFixed(2);
					var productSize = parseFloat($("#largeCm").val()).toFixed(2);
					var message = "Product Length is bigger than or equal Box Length. ";
					var msgWithoutSpace = "ProductLengthisbiggerthanorequalBoxLength";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;

				case 1:
					fieldVal=$("#formContainer #widthCm").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					if(isNumber(fieldVal)) {
						$("#formContainer #widthCm, #width").css("backgroundColor", "white");
						$("#formContainer #widthCm").val(value);
						if(value==0) {
							$("#formContainer #widthCm, #width").val(0);
							$("#formContainer #widthCm, #width").css("backgroundColor", "#FF6666");
						} else {
							var inch = ($("#formContainer #widthCm").val())*0.393701;
							valueInch = parseFloat(inch).toFixed(2);
							$("#formContainer #width").val(valueInch);
						}
					} else {
						$("#formContainer #widthCm, #width").val(0);
						$("#formContainer #widthCm, #width").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Width is less than Product Width 
					var boxSize = parseFloat($("#boxWidthCmId").val()).toFixed(2);
					var productSize = parseFloat($("#widthCm").val()).toFixed(2);
					var message = "Product Width is bigger than or equal Box Width. ";
					var msgWithoutSpace = "ProductWidthisbiggerthanorequalBoxWidth";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;

				case 2:
					fieldVal=$("#formContainer #highCm").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					if(isNumber(fieldVal)) {
						$("#formContainer #highCm, #high").css("backgroundColor", "white");
						$("#formContainer #highCm").val(value);
						if(value==0) {
							$("#formContainer #highCm, #high").val(0);
							$("#formContainer #highCm, #high").css("backgroundColor", "#FF6666");
						} else {
							var inch = ($("#formContainer #highCm").val())*0.393701;
							valueInch = parseFloat(inch).toFixed(2);
							$("#formContainer #high").val(valueInch);
						}
					} else {
						$("#formContainer #highCm, #high").val(0);
						$("#formContainer #highCm, #high").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Height is less than Product Height 
					var boxSize = parseFloat($("#boxHeightId").val()).toFixed(2);
					var productSize = parseFloat($("#high").val()).toFixed(2);
					var message = "Product Height is bigger than or equal Box Height. ";
					var msgWithoutSpace = "ProductHeightisbiggerthanorequalBoxHeight";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;

				case 3:
					fieldVal=$("#formContainer #weightKg").val() ;
					var value = parseFloat(fieldVal).toFixed(2);
					if(isNumber(fieldVal)) {
						$("#formContainer #weightKg, #weight").css("backgroundColor", "white");
						$("#formContainer #weightKg").val(value);
						if(value==0) {
							$("#formContainer #weightKg, #weight").val(0);
							$("#formContainer #weightKg, #weight").css("backgroundColor", "#FF6666");
						} else {
							var lbs = ($("#formContainer #weightKg").val())*2.20462;
							valueLbs = parseFloat(lbs).toFixed(2);
							$("#formContainer #weight").val(valueLbs);
						}
					} else {
						$("#formContainer #weightKg, #weight").val(0);
						$("#formContainer #weightKg, #weight").css("backgroundColor", "#FF6666");
					}
					/*
					// Test if Box Weight is less than Product Weight 
					var boxSize = parseFloat($("#boxWeightKgId").val()).toFixed(2);
					var productSize = parseFloat($("#weightKg").val()).toFixed(2);
					var message = "Product Weight is bigger than or equal Box Weight. ";
					var msgWithoutSpace = "ProductWeightisbiggerthanorequalBoxWeight";
					testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
					*/
					break;

				default:
					break;
				}
			}
		});
	 	
		//----------------- boxLengthId/boxWidthId/boxHeightId/boxWeightId Validation  ------ 
		  //accept juste numbers format 
		//----------------------------------------------------------------------------------------
		$("#formContainer #boxLengthId, #boxWidthId, #boxHeightId, #boxWeightId").blur( function(){
			var index=$("#formContainer #boxLengthId, #boxWidthId, #boxHeightId, #boxWeightId").index(this);
			//alert(index);
			var fieldVal;
			if($("#canadaPostSizesVerifiedId").is(':checked')) {
				  //$("#canadaPostSizesVerifiedId").attr('checked', true);
				  $("#boxLengthId, #boxLengthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxWidthId, #boxWidthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxHeightId, #boxHeightCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxWeightId, #boxWeightKgId").css("backgroundColor", "#E9E9E9");
				  $("#boxLengthId, #boxLengthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxLengthId , #boxLengthCmId, #boxWidthId, #boxWidthCmId").attr("readonly","readonly");
				  $("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").attr("readonly","readonly");
			} else {
				if(index>=0) {
					switch (index) {
					case 0:
						fieldVal=$("#formContainer #boxLengthId").val() ;
						var value =0;
						if(isNumber(fieldVal)) {
							value = parseFloat(fieldVal).toFixed(2);
							$("#formContainer #boxLengthId, #boxLengthCmId").css("backgroundColor", "white");
							$("#formContainer #boxLengthId").val(value);
							if(value==0) {
								$("#formContainer #boxLengthId, #boxLengthCmId").val(0);
								$("#formContainer #boxLengthId, #boxLengthCmId").css("backgroundColor", "#FF6666");
							} else {
								var cm = ($("#formContainer #boxLengthId").val())*2.54;
								valueCm = parseFloat(cm).toFixed(2);
								$("#formContainer #boxLengthCmId").val(valueCm);
							} 
						} else {
							$("#formContainer #boxLengthId, #boxLengthCmId").val(0);
							$("#formContainer #boxLengthId, #boxLengthCmId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Length is less than Product Length 
						var boxSize = parseFloat($("#boxLengthId").val()).toFixed(2);
						var productSize = parseFloat($("#large").val()).toFixed(2);
						var message = "Product Length is bigger than or equal Box Length. ";
						var msgWithoutSpace = "ProductLengthisbiggerthanorequalBoxLength";
						testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;
					
					case 1:
						fieldVal=$("#formContainer #boxWidthId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						$("#formContainer #boxWidthId").css("backgroundColor", "white");
						if(isNumber(fieldVal)) {
							$("#formContainer #boxWidthId, #boxWidthCmId").css("backgroundColor", "white");
							$("#formContainer #boxWidthId").val(value);
							if(value==0) {
								$("#formContainer #boxWidthId, #boxWidthCmId").val(0);
								$("#formContainer #boxWidthId, #boxWidthCmId").css("backgroundColor", "#FF6666");
							} else {
								var cm = ($("#formContainer #boxWidthId").val())*2.54;
								valueCm = parseFloat(cm).toFixed(2);
								$("#formContainer #boxWidthCmId").val(valueCm);
							}
						} else {
							$("#formContainer #boxWidthId, #boxWidthCmId").val(0);
							$("#formContainer #boxWidthId, #boxWidthCmId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Width is less than Product Width 
						var boxSize = parseFloat($("#boxWidthId").val()).toFixed(2);
						var productSize = parseFloat($("#width").val()).toFixed(2);
						var message = "Product Width is bigger than or equal Box Width. ";
						var msgWithoutSpace = "ProductWidthisbiggerthanorequalBoxWidth";
						testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;
					
					case 2:
						fieldVal=$("#formContainer #boxHeightId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						$("#formContainer #boxHeightId").css("backgroundColor", "white");
						if(isNumber(fieldVal)) {
							$("#formContainer #boxHeightId, #boxHeightCmId").css("backgroundColor", "white");
							$("#formContainer #boxHeightId").val(value);
							if(value==0) {
								$("#formContainer #boxHeightId, #boxHeightCmId").val(0);
								$("#formContainer #boxHeightId, #boxHeightCmId").css("backgroundColor", "#FF6666");
							} else {
								var cm = ($("#formContainer #boxHeightId").val())*2.54;
								valueCm = parseFloat(cm).toFixed(2);
								$("#formContainer #boxHeightCmId").val(valueCm);
							}
						} else {
							$("#formContainer #boxHeightId, #boxHeightCmId").val(0);
							$("#formContainer #boxHeightId, #boxHeightCmId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Height is less than Product Height 
						var boxSize = parseFloat($("#boxHeightId").val()).toFixed(2);
						var productSize = parseFloat($("#high").val()).toFixed(2);
						var message = "Product Height is bigger than or equal Box Height. ";
						var msgWithoutSpace = "ProductHeightisbiggerthanorequalBoxHeight";
						testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;
					
					case 3:
						fieldVal=$("#formContainer #boxWeightId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						$("#formContainer #boxWeightId").css("backgroundColor", "white");
						if(isNumber(fieldVal)) {
							$("#formContainer #boxWeightId, #boxWeightKgId").css("backgroundColor", "white");
							$("#formContainer #boxWeightId").val(value);
							if(value==0) {
								$("#formContainer #boxWeightId, #boxWeightKgId").val(0);
								$("#formContainer #boxWeightId, #boxWeightKgId").css("backgroundColor", "#FF6666");
							} else {
								var kg = ($("#formContainer #boxWeightId").val())*0.453592;
								valueKg = parseFloat(kg).toFixed(2);
								$("#formContainer #boxWeightKgId").val(valueKg);
							}
						} else {
							$("#formContainer #boxWeightId, #boxWeightKgId").val(0);
							$("#formContainer #boxWeightId, #boxWeightKgId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Weight is less than Product Weight 
						var boxSize = parseFloat($("#boxWeightId").val()).toFixed(2);
						var productSize = parseFloat($("#weight").val()).toFixed(2);
						var message = "Product Weight is bigger than or equal Box Weight. ";
						var msgWithoutSpace = "ProductWeightisbiggerthanorequalBoxWeight";
						testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;

					default:
						break;
					}
				}
			}
			
		});
		
		//------------- boxLengthCmId/boxWidthCmId/boxHeightCmId/boxWeightIdCm Validation  -------
		  //accept juste numbers format 
		//----------------------------------------------------------------------------------------
		$("#formContainer #boxLengthCmId, #boxWidthCmId, #boxHeightCmId, #boxWeightKgId").blur( function(){
			var index=$("#formContainer #boxLengthCmId, #boxWidthCmId, #boxHeightCmId, #boxWeightKgId").index(this);
			var fieldVal;
			if($("#canadaPostSizesVerifiedId").is(':checked')) {
				  //$("#canadaPostSizesVerifiedId").attr('checked', true);
				  $("#boxLengthId, #boxLengthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxWidthId, #boxWidthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxHeightId, #boxHeightCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxWeightId, #boxWeightKgId").css("backgroundColor", "#E9E9E9");
				  $("#boxLengthId, #boxLengthCmId").css("backgroundColor", "#E9E9E9");
				  $("#boxLengthId , #boxLengthCmId, #boxWidthId, #boxWidthCmId").attr("readonly","readonly");
				  $("#boxHeightId, #boxHeightCmId, #boxWeightId, #boxWeightKgId").attr("readonly","readonly");
			} else {
				if(index>=0) {
					switch (index) {
					case 0:
						fieldVal=$("#formContainer #boxLengthCmId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						if(isNumber(fieldVal)) {
							$("#formContainer #boxLengthCmId, #boxLengthId").css("backgroundColor", "white");
							$("#formContainer #boxLengthCmId").val(value);
							if(value==0) {
								$("#formContainer #boxLengthCmId, #boxLengthId").val(0);
								$("#formContainer #boxLengthCmId, #boxLengthId").css("backgroundColor", "#FF6666");
							} else {
								var inch = ($("#formContainer #boxLengthCmId").val())*0.393701;
								valueInch = parseFloat(inch).toFixed(2);
								$("#formContainer #boxLengthId").val(valueInch);
							}
						} else {
							$("#formContainer #boxLengthCmId, #boxLengthId").val(0);
							$("#formContainer #boxLengthCmId, #boxLengthId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Length is less than Product Length 
						var boxSize = parseFloat($("#boxLengthCmId").val()).toFixed(2);
						var productSize = parseFloat($("#largeCm").val()).toFixed(2);
						var message = "Product Length is bigger than or equal Box Length. ";
						var msgWithoutSpace = "ProductLengthisbiggerthanorequalBoxLength";
						//testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;

					case 1:
						fieldVal=$("#formContainer #boxWidthCmId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						if(isNumber(fieldVal)) {
							$("#formContainer #boxWidthCmId, #boxWidthId").css("backgroundColor", "white");
							$("#formContainer #boxWidthCmId").val(value);
							if(value==0) {
								$("#formContainer #boxWidthCmId, #boxWidthId").val(0);
								$("#formContainer #boxWidthCmId, #boxWidthId").css("backgroundColor", "#FF6666");
							} else {
								var inch = ($("#formContainer #boxWidthCmId").val())*0.393701;
								valueInch = parseFloat(inch).toFixed(2);
								$("#formContainer #boxWidthId").val(valueInch);
							}
						} else {
							$("#formContainer #boxWidthCmId, #boxWidthId").val(0);
							$("#formContainer #boxWidthCmId, #boxWidthId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Width is less than Product Width 
						var boxSize = parseFloat($("#boxWidthCmId").val()).toFixed(2);
						var productSize = parseFloat($("#widthCm").val()).toFixed(2);
						var message = "Product Width is bigger than or equal Box Width. ";
						var msgWithoutSpace = "ProductWidthisbiggerthanorequalBoxWidth";
						//testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;

					case 2:
						fieldVal=$("#formContainer #boxHeightCmId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						if(isNumber(fieldVal)) {
							$("#formContainer #boxHeightCmId, #boxHeightId").css("backgroundColor", "white");
							$("#formContainer #boxHeightCmId").val(value);
							if(value==0) {
								$("#formContainer #boxHeightCmId, #boxHeightId").val(0);
								$("#formContainer #boxHeightCmId, #boxHeightId").css("backgroundColor", "#FF6666");
							} else {
								var inch = ($("#formContainer #boxHeightCmId").val())*0.393701;
								valueInch = parseFloat(inch).toFixed(2);
								$("#formContainer #boxHeightId").val(valueInch);
							}
						} else {
							$("#formContainer #boxHeightCmId, #boxHeightId").val(0);
							$("#formContainer #boxHeightCmId, #boxHeightId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Height is less than Product Height 
						var boxSize = parseFloat($("#boxHeightId").val()).toFixed(2);
						var productSize = parseFloat($("#high").val()).toFixed(2);
						var message = "Product Height is bigger than or equal Box Height. ";
						var msgWithoutSpace = "ProductHeightisbiggerthanorequalBoxHeight";
						//testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;
					
					case 3:
						fieldVal=$("#formContainer #boxWeightKgId").val() ;
						var value = parseFloat(fieldVal).toFixed(2);
						if(isNumber(fieldVal)) {
							$("#formContainer #boxWeightKgId, #boxWeightId").css("backgroundColor", "white");
							$("#formContainer #boxWeightKgId").val(value);
							if(value==0) {
								$("#formContainer #boxWeightKgId, #boxWeightId").val(0);
								$("#formContainer #boxWeightKgId, #boxWeightId").css("backgroundColor", "#FF6666");
							} else {
								var lbs = ($("#formContainer #boxWeightKgId").val())*2.20462;
								valueLbs = parseFloat(lbs).toFixed(2);
								$("#formContainer #boxWeightId").val(valueLbs);
							}
						} else {
							$("#formContainer #boxWeightKgId, #boxWeightId").val(0);
							$("#formContainer #boxWeightKgId, #boxWeightId").css("backgroundColor", "#FF6666");
						}
						/*
						// Test if Box Weight is less than Product Weight 
						var boxSize = parseFloat($("#boxWeightKgId").val()).toFixed(2);
						var productSize = parseFloat($("#weightKg").val()).toFixed(2);
						var message = "Product Weight is bigger than or equal Box Weight. ";
						var msgWithoutSpace = "ProductWeightisbiggerthanorequalBoxWeight";
						//testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
						*/
						break;

					default:
						break;
					}

					/*
					//box 
					var arrayBoxSize = [];
					boxLn=$("#formContainer #boxLengthCmId").val() ;
					if(!isNumber(fieldVal))boxLn=0;
					arrayBoxSize[0]=boxLn;
					
					boxWd=$("#formContainer #boxWidthCmId").val() ;
					if(!isNumber(fieldVal))boxWd=0;
					arrayBoxSize[1]=boxWd;
					//alert(arrayBoxSize[1]);
					boxHg=$("#formContainer #boxHeightCmId").val() ;
					if(!isNumber(fieldVal))boxHg=0;
					arrayBoxSize[2]=boxHg;
					
					//Product 
					var arrayProductSize = [];
					productLn=$("#formContainer #largeCm").val() ;
					if(!isNumber(fieldVal))productLn=0;
					arrayProductSize[0]=productLn;
					productWd=$("#formContainer #widthCm").val() ;
					if(!isNumber(fieldVal))productWd=0;
					arrayProductSize[1]=productWd;
					productHg=$("#formContainer #highCm").val() ;
					if(!isNumber(fieldVal))productHg=0;
					arrayProductSize[2]=productHg;

					//compare box size with Product size 
					arrayBoxSize.sort();
					arrayProductSize.sort();
					
					//alert("i0: "+arrayBoxSize[0] +"i1:"+arrayBoxSize[1] +"i2: "+arrayBoxSize[2] +" ");
					//alert(" i0: "+arrayProductSize[0] +"   i1:"+arrayProductSize[1] +"  i2: "+arrayProductSize[2] +" ");
					testBoxAndProductSizes(arrayBoxSize, arrayProductSize);
					*/

				}
			}
			
		});
		
	 	
	 	
  	});
 
	
  	(function($) {
  		$.fn.currencyFormat = function() {
  	  		this.each( function( i ) {
  	  	  		$(this).change( function( e ){
  	  	  	  		this.value = parseFloat(this.value).toFixed(2);
				});
			});             
			return this;     
		};     
	 })( jQuery );    
	
 	$("#cost").change(function() {
 	 	$("#cost").currencyFormat(); 	 		
 	}).change(); 

 	$("#msrp").change(function() {
 	 	$("#msrp").currencyFormat(); 	 		
 	}).change();
	
 	$("#productListButton").click(function() {
 	 	var signal = -100;	// A unique value 
 	 	$("#signalHid").attr('value', signal);
 	 	var brand = $("#brand").val();
 	 	var category = $("#category").val();
 	 	$("#brandIDHid").attr('value', brand);
 	 	$("#categoryIDHid").attr('value', category);
	 });
	
 	if ($("#statusId").val() == 3) {
 	 	var sub = "<s:property value='loyaltyProductIdSub'/>";
 		$("#discontinuedSub").html("<label for='accept_team_members'  style='color:red;font-weight:bolder;'>New Sub LS-Product-ID:</label>" 
 		 		+ "<input type='text' id='loyaltyProductIdSub' name='loyaltyProductIdSub' maxlength='75'" 
 		 		+  " cssStyle='width:150px;' value='" + sub + "' size='24' />");
 	}
	
	$("#statusId").change( function() {
		var usersNumber ='<s:property value="activeClientsSize" />';
		var sub = "<s:property value='loyaltyProductIdSub'/>";
		var loyaltyProductIdVal = $("#loyaltyProductId").val();
		var whatIsClicked = $("#statusId").val();
		
		if (whatIsClicked == 1) {			// AVAILABLE
			$("#discontinuedSub").hide();					
		} else if (whatIsClicked == 2) {	// UNAVAILABLE
			$("#discontinuedSub").hide();				
			if (usersNumber > 0 ) {
				alert("Product currently 'Active' with one or more Clients.");
			}
		} else if (whatIsClicked == 3) {	// DISCONTINUED
			$("#discontinuedSub").show();
			if (usersNumber > 0 ) {
				alert("Product currently 'Active' with one or more Clients.");
			}
			$("#discontinuedSub").html("<label for='accept_team_members' style='color:red;font-weight:bolder;'>New Sub LS-Product-ID:</label><input type='text' value='" 
					+ sub +"' id='loyaltyProductIdSub' name='loyaltyProductIdSub' maxlength='50' cssStyle='width:150px;' size='24' />");			
					
		} else if (whatIsClicked == 4) {	// DISABLED
			$("#discontinuedSub").hide();
		}
	});

	var qtyValue = 0;
	$("#defect-free").click(function() {
		var checked = $("input:checked[value='true']").val();
		$("#warranty").attr('value', '');
		if (checked) {
			$("#wQty").attr('disabled', true);
			$("#grp-month").attr('disabled', true);
			$("#grp-year").attr('disabled', true);
			$("#warranty").attr('value', 'defect-free');						
		} else {	// undefined
			$("#wQty").attr('value', '');
			$("#wQty").attr('disabled', false);
			$("#grp-month").attr('disabled', false);
			$("#grp-year").attr('disabled', false);
		}
	});

	$("input:radio[name=grp]").change(function() { 
		var radioChoice = $(this).val();
		$("#radH").val(radioChoice);
		var plural = "s";
		radioChoice = (qtyValue > 1) ? (radioChoice + plural) : radioChoice;
		var warrantyVal = qtyValue + " " + radioChoice;
		$("#warranty").val(warrantyVal);
	});

	$("input#wQty").change(function() {
		qtyValue = $(this).val();
	});

	var currPrice;
  	// populate value for Selling price if it is entered as text, auto populate the Profit %
	$('input#[id^="userPrice_"]').change(function() {
	  	var userId = $(this).attr('id').split("_")[1];
	  	var price = $(this).val();
	  	var priceFloat = parseFloat(price);	  	
		if (price.length == 0 || price === "") {
			$(this).val("");
			$("input#percentageProfit_" + userId).val("");
			$("input#currencyPrice_" + userId).val("");
		} else {
			var cost = $("input#cost").val();
			var profit = ((price/cost)-1)*100;
			$("input#percentageProfit_" + userId).val(profit.toFixed(4));
			var msrp = $("input#msrp").val();
			var disc = ((msrp-price)/msrp)*100;
			$("input#percentageDiscount_" + userId).val(disc.toFixed(1));
			$(this).val(priceFloat.toFixed(2));
			
			var currencyRate = $("input#currencyRate_"+ userId).val();
		  	var currencyPriceFloat = priceFloat * currencyRate;
		  	$("input#currencyPrice_" + userId).val(currencyPriceFloat.toFixed(2));
		}		
	}).change();
	
	//populate value for Profit % if it is entered as text, auto populate the Selling price
	$('input#[id^="percentageProfit_"]').change(function(){
		var userId = $(this).attr('id').split("_")[1];
		var profit = $(this).val();	
		var cost = $("input#cost").val();
		var price = $("input#userPrice_" + userId).val();
		var currencyRate = $("input#currencyRate_"+ userId).val();
		price = ((price == '' && profit != '') || (price == null && profit != '')) ? 0 : price;	
		if (price.length != 0 || price != '') {
			if (profit.length == 0 || profit == "") {
				profit = ((price/cost)-1)*100;
				$("input#percentageProfit_" + userId).val(profit.toFixed(1));
			} else {
				price = cost*((profit/100)+1);
				$("input#userPrice_" + userId).val(price.toFixed(2));
				var currencyPrice = price * currencyRate;
				$("input#currencyPrice_" + userId).val(currencyPrice.toFixed(2));
				var msrp = $("input#msrp").val();
				disc = ((msrp-price)/msrp)*100;			
				$("input#percentageDiscount_" + userId).val(disc.toFixed(1));
        	}
			var profitFloat = parseFloat(profit);
			$("input#percentageProfit_" + userId).val(profitFloat.toFixed(4));
		}
	}).change();
	
	// clear out the values of it row, and disable/enable the price and profit box
	$('input#[id^="isExcluded"]').click(function() {
		var userId = $(this).val();
		var checked = Boolean($(this).is(":checked"));
		
		$("input#userPrice_" + userId).val('');
		$("input#currencyPrice_" + userId).val('');
		$("input#percentageProfit_" + userId).val('');
		$("input#percentageDiscount_" + userId).val('');
		
		$("input#userPrice_" + userId).attr("disabled", checked);
		$("input#percentageProfit_" + userId).attr("disabled", checked);
		$("input#percentageDiscount_" + userId).attr("disabled", checked);
	});	


	// when user click on href show history logs
	$("#hrefShowLogs").click(function () {
		$("#divLogs").toggle("slow");
		$('html, body').animate({scrollTop:$(document).height()}, 'slow');
		$("#divLogs").css("display","block"); 
		$("#divLogs").css("visibility","visible");

		return false;
	});
	

	//----------------------------- Test value is numeric  ----------------------------------- 
	//return false if is not numeric
	//----------------------------------------------------------------------------------------
	function isNumber(n) {
		return !isNaN(parseFloat(n)) && isFinite(n);
	}
	
	
	//----------------------------- Make image flashing -------------------------------------- 
	// 
	//----------------------------------------------------------------------------------------
	function flashImage (){ 
		   $("#sizesNotifyId").fadeOut(800).delay(200).fadeIn(700); 
	}
	
	//----------------------------- Test if Box Sizes is less than Product sizes ------------- 
	// 
	//----------------------------------------------------------------------------------------
	/*function testBoxAndProductSizes(boxSize, productSize) {
		var notifyMsg="Box size is smaller than Product size";
		alert("boxSize   i0: "+boxSize[0] +"  i1:"+boxSize[1] +"  i2: "+boxSize[2] +" ");
		alert("productSize  i0: "+productSize[0] +"  i1:"+productSize[1] +"  i2: "+productSize[2] +" ");
		if((boxSize[0] <= productSize[0])||(boxSize[1] <= productSize[1])||(boxSize[2] <= productSize[2])){
			$("#txtSizesNotifyId").val(notifyMsg);
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		} else {
			$("#txtSizesNotifyId").val("");
			$('#sizesNotifyId').css("display","none"); 
			$('#sizesNotifyId').css("visibility","hidden");
		}
	}*/
	
  </script>
  
  