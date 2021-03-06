<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript" src="thumbnailhover_files/jquery-latest.js"></script> 
<script type="text/javascript" src="scripts/clientCategoryAddProduct.js"></script>
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
</style>
<div id="divMainAddProduct" class="unit" style="width:800px;margin-left:100px;">
<div class="pop_title" style="margin-top:30px;">Add a Product</div>

<s:if test="hasActionErrors()">
  <div id="globalAdvice" class="gray_bg global-vanadium-advice">
  		<s:iterator value="actionErrors">
  				<span><s:property escape="false" /></span><br/>
  		</s:iterator></div>
</s:if>

  <div id="formContainer" >
    <s:form id="form" action="saveProduct.do" method="post" validate="true" enctype="multipart/form-data">
    <s:token />
      <fieldset>
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
        <br />
         <!--Category-->
        <label for="username">Category:</label>
 		<s:select id="category" 
        		  name="category"
        		  cssStyle="width:156px;"
        		  required="true"	
        		  headerKey="-1" 
        		  headerValue="--Please Select--" 			    		  
    			  list="#{}" /> 
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
    			  list="#{}" /> 
    	<s:hidden id="mainSpecificationName" name="mainSpecificationName" value="" />
    	<span id="main_spec_Error" style="display:none;margin-left:2px;"></span>
        <!--Type-->
        <br />
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
		        <td><s:textfield id="price" name="price" maxlength="15" cssStyle="width:100px;" cssClass="cost" /></td>
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
        <s:textfield id="loyaltyProductId" name="loyaltyProductId" maxlength="50" cssStyle="width:150px;" />
        <span id="loyaltyProductId_Error" style="display:none;margin-left:2px;"></span>
        <!--Loyalty Product ID-->
        <br />
        <!--Name ENGLISH-->
        <label for="accept_team_members">Name - ENGLISH:</label>        
        <s:textfield id="nameEn" name="nameEn" maxlength="75" cssStyle="width:250px;"/>
        <span id="nameEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Name ENGLISH-->
        <br />
        <!--Name FRENCH-->
        <label for="accept_team_members">Name - FRENCH:</label>
        <s:textfield id="nameFr" name="nameFr" maxlength="75" cssStyle="width:250px;"/>
         <span id="nameFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Name FRENCH-->
        <br />
        <!--Product Image-->
        <label for="accept_team_members">Product IMAGE:</label>
		<!-- <input type="file" name="productImage" size="31" /> .PNG .JPEG  --> 
		<s:file name="productImage" size="31" />.PNG .JPEG 
        <!--Product Image-->
        <br />
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
         <br />
	<div id="userNameList" class="fixed column" style="padding:20px 0px 0px 0px;">
		<div class="blue f12 bold pb10" style="padding-bottom:10px;"></div>
			<div id="productListData" style="width:1500px;"> 
			
	 <!-- Template table -->
		<table  id="tabTemp" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
		 	<thead class="gray_header">
				<tr>
					<th width="120px"><s:text name="Client Type" /></th>
					<th width="110px"><s:text name="Selling Price" /></th>
					<th width="155px" style="padding-left:0px; padding-right:0px;"><s:text name="Profit_%" /></th>
					<th width="110px"><s:text name="Discount_%" /></th>
					<th width="77px"><s:text name="Exclude" /></th>
					<th  width="20px" style="display:none;visibility:hidden"><s:text name="clientCategoryId" /></th>
					<th style="display:none;visibility:hidden;background: white;border-left:1px solid #555;border-top:1px solid white;
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
													style="text-align: center; width: 40px;" class="pa10"/>%</td>	
														    									
										<td><input 	id="percentageDiscountTemp" 
													style="text-align: center; width: 40px;" class="pa10"/>%</td>
															    																							
										<td  id="columnClientCategoryIdTemp" style="display:none;visibility:hidden">
													<center><input	type="text" id="clientCategoryIdTemp"
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
		<br/><br />
	 <!-- Template table -->
	  
	 <!-- user price table --> 
		<table id="tabUsersPrice" border="1" cellspacing="0" cellpadding="0" class="pad_5px nowraptable datatable" >
					<thead class="gray_header">
					<tr>
						<th width="120px"><s:text name="Client Name" /></th>
						<th width="110px"><s:text name="Selling Price" /></th>
						<th width="155x" style="padding-left:0px; padding-right:0px;"><s:text name="Selling Price Currency" /></th>
						<th width="110px"><s:text name="Profit_%" /></th>
						<th width="30px"><s:text name="Discount_%" /></th>
						<th width="20px"><s:text name="Exclude" /></th>
						<th style="display:none;visibility:hidden"><s:text name="clientCategoryId" /></th>
						<th colspan="2" style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						           border-right:1px solid white;border-bottom:1px solid white;">
						    <img  id="showRows" src="./images/showRowsMouseOut.png" width="40" height="20" /></th>
						
					</tr>
					</thead>
					<s:if test="%{userNameList != null}">
						<s:if test="%{userNameList.size > 0}" >
							<tbody>
								<s:iterator value="userNameList" status="count">
								
									<tr id="rowTabUsersPrice">
									
										<td><s:property value="login"/></td>								
										<td><input 	id="userPrice_<s:property value="id"/>" 
													style="text-align: center; width: 80px;" 
													value="<s:property value="%{userPrice[#count.index]}"/>"  
													name="userPrice"/>$</td>
													
										<!-- Currency -->
										<td style="padding-right:0px;">
											<input 	id="currencyPrice_<s:property value="id"/>"
													disabled="disabled"
													style="text-align: center; width: 80px; color:red;" 
													value=""
													name="currencyPrice"/> 
											<s:if test='%{currencySymbol[#count.index] != "CAD"}' >
												<span style="color: red;">
													<s:if test='%{currencySymbol[#count.index] == "USD"}' >$ </s:if>
													<s:property value="%{currencySymbol[#count.index]}"/>
												</span>
											</s:if>
										</td>
										<td style="display:none; visibility:hidden;">
											<!-- currencyRate -->
											<input 	id="currencyRate_<s:property value="id"/>"
														readonly="readonly"
														style="text-align: center; width: 80px; color:red;" 
														value="<s:property value="%{currencyRate[#count.index]}"/>"
														name="currencyRate"/>
										</td>
										<td style="display:none; visibility:hidden;">
											<!-- currencySymbol -->
											<input 	id="currencySymbol_<s:property value="id"/>"
														readonly="readonly"
														style="text-align: center; width: 80px; color:red;" 
														value="<s:property value="%{currencySymbol[#count.index]}"/>"
														name="currencySymbol"/>
										</td>
										<!-- Currency --> 
										   									
										<td><input 	id="percentageProfit_<s:property value="id"/>" 
													style="text-align: center; width: 40px;" 
													value="<s:property value="%{percentageProfit[#count.index]}"/>"  
													class="pa10" 
													name="percentageProfit"/>%</td>	    									
										<td><input 	id="percentageDiscount_<s:property value="id"/>" 
													style="text-align: center; width: 40px;" 
													value="<s:property value="%{percentageDiscount[#count.index]}"/>"  
													class="pa10"												
													name="percentageDiscount"/>%</td>	    										
										<td><center><input	type="checkbox" 
													id="isExcluded" 
													name="isExcluded" 
													value="<s:property value="id"/>" 
													class="pa10" /></center></td>
													
										<td colspan="2" id="columnClientCategoryIdUsers" style="display:none;visibility:hidden;">
													<center><input	type="hidden" id="clientCategoryId" name="clientCategoryId"
													value="<s:property value="clientCategoryId"/>" 
													class="pa10" /></center></td>
										
										<td id="columnUsersId" style="text-align:left;background: white;border-left:1px solid #555;border-top:1px solid white;
						           					   border-right:1px solid white;border-bottom:1px solid white;">
												   <input type="hidden" id="userId" value='<s:property value="id"/>'
												          style="display:none;visibility:hidden;"/></td>
												          
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
	<!-- user price table --> 
	
	</div>
    </div>	  	  			
    <br />
        
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
       	<!--/PRODUCT SIZE AND WEIGHT-->
       	
       	<tr height="10px"></tr>
       	
       	<!--BOX SIZE AND WEIGHT-->
       	<tr align="left">
       	 <td><label for="accept_team_members" style="width:159px;">Box size:</label></td>
       	 <td>L:<s:textfield id="boxLengthId" name="boxDTO.length" value="%{boxDTO.length}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td width="10px"></td>
       	 <td>W:<s:textfield id="boxWidthId" name="boxDTO.width" value="%{boxDTO.width}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td width="10px"></td>
       	 <td>H:<s:textfield id="boxHeightId" name="boxDTO.height" value="%{boxDTO.height}" maxlength="6" cssStyle="width:40px;"/><i>in</i></td>
       	 <td><label for="accept_team_members" style="width:120px; text-align: right;">Box Weight:</label>
       	 	 <s:textfield id="boxWeightId" name="boxDTO.totalWeight" value="%{boxDTO.totalWeight}" maxlength="6" cssStyle="width:40px;"/><i>lbs</i>
       	 </td>
       	 <td width="25px"></td>
       	 <td> </td>
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
       	 <td> </td>
       	</tr>
       	<!--/BOX SIZE AND WEIGHT-->
       	<tr height="10px"></tr>
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
        <td><s:textfield id="warrantyQuantity" name="warrantyQuantity" maxlength="7" cssStyle="width:35px;"/></td>
        <td>&nbsp;</td><td>&nbsp;</td>       	 
       	<td><input type="radio" id="grpMonth" name="periodTime" value="month" maxlength="1" />Month(s)</td>
       	<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
       	<td><input type="radio" id="grpYear" name="periodTime" value="year" maxlength="1" checked />Year(s)</td>       	
       	<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>       		
       	<td><s:checkbox id="defectFree" name="defectFree" cssStyle="width:35px;" value="" /></td>
       	<td>Defect-free</td>       	       	
       	</tr>
       	</table>
        <!--Warranty-->               	
        <br />
        
        <br /><br />
        <!--Description ENGLISH-->
        <label for="accept_team_members">Description - ENGLISH:</label>
        <s:textarea id="descriptionEn" name="descriptionEn" cssClass="ckeditor ckEN" />
         <span id="descriptionEn_Error" style="display:none;margin-left:2px;"></span>
        <!--Description ENGLISH-->
        
        <br />
        <!--Description FRENCH-->
        <label for="accept_team_members">Description - FRENCH:</label>
        <s:textarea id="descriptionFr" name="descriptionFr" cssClass="ckeditor ckFR" />
         <span id="descriptionFr_Error" style="display:none;margin-left:2px;"></span>
        <!--Description FRENCH-->
        
        <br />
        <!--SPECS ENGLISH-->
        <label for="accept_team_members">Specs - ENGLISH:</label>
        <s:textarea id="sepcificationEn" name="specificationEn" cssClass="ckeditor ckEN" />
         <span id="specificationEn_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS ENGLISH-->
        
        <br />
        <!--SPECS FRENCH-->
        <label for="accept_team_members">Specs - FRENCH:</label>       
        <s:textarea id="specificationFr" name="specificationFr" cssClass="ckeditor ckFR" />
         <span id="specificationFr_Error" style="display:none;margin-left:2px;"></span>
        <!--SPECS FRENCH-->
        
        <br />  
        <!--OTHERS ENGLISH-->
        <label for="accept_team_members">Others - ENGLISH:</label>
        <s:textarea id="otherEng" name="otherEng" cssClass="ckeditor ckEN" />
         <span id="otherEng_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS ENGLISH-->
        
        <br />
        <!--OTHERS FRENCH-->
        <label for="accept_team_members">Others - FRENCH:</label>       
        <s:textarea id="otherFr" name="otherFr" cssClass="ckeditor ckFR" />
         <span id="otherFr_Error" style="display:none;margin-left:2px;"></span>
        <!--OTHERS FRENCH-->
        <br />    
        <!--NOTE-->
        <label for="accept_team_members" style="float:none;">Note:</label>       
        <s:textarea id="note" name="note" rows="10" cssStyle="width:600px;" />
        <!--NOTE-->
        <br />        
        <input id="btAddProduct" type="submit" value="Add Product" 
        	   style="margin:20px 20px 0px 190px;padding:5px 10px;font-size:20px;"/>
      </fieldset>
    </s:form> 
    
    <%@ include file="dialogues/progressBar.jsp" %>
	<%@ include file="dialogues/controlePrice.jsp" %>
	<%@ include file="dialogues/confirmCPVerifiedPop.jsp" %>
    
       
  </div>
</div>
<script type="text/javascript">

	$(document).ready(function() {
		var notifyMsg;
		setInterval('flashImage()',900);
		
	  	initRichEditorWhenReady();
	  	
	  	
		// brand changes 
		$("#brand").change( function(){	
			var cat;
			$('#brandName').val($('#brand option:selected').text());					
			populateCategory($(this).val(), cat );				
		}).change();
		
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
		
		if($("#brand").val() > 0){
			var cat = '<s:property value="category" />';
			var spec = '<s:property value="mainSpecification" />';
			populateCategory($("#brand").val(), cat);
			populateMainSpecification(cat, $("#brand").val(), spec);

			$("#category option[value='" + cat + "']").attr('selected','selected');
			$("#mainSpecification option[value='" + spec + "']").attr('selected','selected');					
		}
		
		$(".cost").hide();
		$(".msrpClass").hide();
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
	
    // clear the warranty value, and disable/enable it boxes
	$("input#defectFree").change(function() {
		var checked = Boolean($(this).is(":checked"));
		$("input#warrantyQuantity").attr('value', '');
		$("input#warrantyQuantity").attr('disabled', checked);
		$("input#grpMonth").attr('disabled', checked);
		$("input#grpYear").attr('disabled', checked);
	}).change();
	
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
			var cost =  $("input#cost").val();
			var profit = ((price/cost)-1)*100;				
			$("input#percentageProfit_" + userId).val(profit.toFixed(1));
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
		price = (price == '' || price == null) ? 0 : price;
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
			$("input#percentageProfit_" + userId).val(profitFloat.toFixed(1));
		} else {
			price = 0;
		}
	}).change();
	
	// clear out the values of it row, and disable/enable the price and profit box
	$('input#[id^="isExcluded"]').click(function() {
		var userId = $(this).val();
		var checked = Boolean($(this).is(":checked"));
		
		$("input#userPrice_" + userId).val('');
		$("input#percentageProfit_" + userId).val('');
		$("input#percentageDiscount_" + userId).val('');
		$("input#currencyPrice_" + userId).val('');

		$("input#userPrice_" + userId).attr("disabled", checked);
		$("input#percentageProfit_" + userId).attr("disabled", checked);
		$("input#percentageDiscount_" + userId).attr("disabled", checked);		
	});	

	//populate value for percentageDiscount %
	$("input#msrp").change(function() {
  		var userId = $(this).attr('id').split("_")[1];
		//loop for rows and change percentageDiscount
  		 $('input#[id^="userPrice_"]').each(function (index, rowElem) {
  	        $(rowElem).change();
  	      });					
	}).change();

	$("#manufProductID").change(function() {
		var qty = $("#manufProductQuantity").val();
		if ( $(this).val().length == 0 || $(this).val() === "") {
			qty = "";
			$("#manufProductQuantity").val(qty);
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
 	
 	//----------------------------- large/width/high/weight Validation  --------------------- 
	  //accept juste numbers format
	//----------------------------------------------------------------------------------------
	$("#formContainer #large, #width, #high, #weight").blur( function(){
		var index=$("#formContainer #large, #width, #high, #weight").index(this);
		var fieldVal;
		if(index>=0) {
			switch (index) {
			case 0:
				fieldVal=$("#formContainer #large").val() ;
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
		var fieldVal;
		if(index>=0) {
			switch (index) {
			case 0:
				fieldVal=$("#formContainer #boxLengthId").val() ;
				var value = parseFloat(fieldVal).toFixed(2);
				if(isNumber(fieldVal)) {
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
	});
	
	
	//------------- boxLengthCmId/boxWidthCmId/boxHeightCmId/boxWeightIdCm Validation  --
	  //accept juste numbers format
	//----------------------------------------------------------------------------------------
	$("#formContainer #boxLengthCmId, #boxWidthCmId, #boxHeightCmId, #boxWeightKgId").blur( function(){
		var index=$("#formContainer #boxLengthCmId, #boxWidthCmId, #boxHeightCmId, #boxWeightKgId").index(this);
		var fieldVal;
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
				testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
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
				testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
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
				var boxSize = parseFloat($("#boxHeightCmId").val()).toFixed(2);
				var productSize = parseFloat($("#highCm").val()).toFixed(2);
				var message = "Product Height is bigger than or equal Box Height. ";
				var msgWithoutSpace = "ProductHeightisbiggerthanorequalBoxHeight";
				testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
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
				testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace);
				*/
				break;

			default:
				break;
			}
		}
	});
	
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
	function testBoxAndProductSizes(boxSize, productSize, message, msgWithoutSpace) {
		var res = $("#txtSizesNotifyId").val().split(". ");
		if(boxSize <= productSize){
			var valFound = 0;
			for (i=0; i < res.length-1; i++) {
				if(res[i].replace(/\s/g,"") == msgWithoutSpace) valFound = 1;
			}
			if(valFound == 0) {
				notifyMsg = $("#txtSizesNotifyId").val() + message;
				$("#txtSizesNotifyId").val(notifyMsg);
			}
			$('#sizesNotifyId').css("display","block"); 
			$('#sizesNotifyId').css("visibility","visible");
		} else {
			var index = -1;
			for (i=0; i < res.length-1; i++) {
				if(res[i].replace(/\s/g,"") == msgWithoutSpace) index = i;
			}
			if(index != -1) {
				notifyMsg = "";
				for (i=0;i<res.length-1;i++) {
					if(i != index) {
						notifyMsg = notifyMsg + res[i] + ". ";
					}
				}
				$("#txtSizesNotifyId").val(notifyMsg);
			}
			if($("#txtSizesNotifyId").val().replace(/\s/g,"") == "") {
				$('#sizesNotifyId').css("display","none"); 
				$('#sizesNotifyId').css("visibility","hidden");
			}
		}
	}
  </script>