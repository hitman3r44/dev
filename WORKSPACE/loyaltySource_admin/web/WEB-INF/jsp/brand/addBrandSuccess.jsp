<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.vanadium-advice { margin-left: 170px; }
input.vanadium-valid { background-image: none; }
table { border-collapse: collapse; empty-cells: hide; }
th { padding: 5px 5px 5px 5px; width: 100px; text-align: right; }
td { padding: 5px 5px 5px 8px; }
body { width: 900px; }
#formContainer { margin: 20px 0px 0px 100px; border: 0; }
.pop_title { margin: 50px 0px 0px 100px; }
td:empty { display: none; }
<!--[if IE]>
input { padding: 2px 0px 2px 2px !important; }
<![endif]-->
</style>

<div class="pop_title" style="margin-top:30px;"><s:property value="message"/></div>
<s:if test="hasActionErrors()">
	<div id="globalAdvice" class="gray_bg global-vanadium-advice">
    	<s:iterator value="actionErrors">
    		<span><s:property escape="false" /></span><br/>
    	</s:iterator>
    </div>
</s:if>

<div id="formContainer" >
	<s:token></s:token>
	<fieldset>
		<TABLE border="1" bordercolor="lightgrey" width="450px">
    		<TR>
    			<!--Name ENGLISH-->
        		<TH>Name:</TH>
        		<TD><s:property value="name"/></TD>
    			<!--Name ENGLISH-->
    		</TR>
    		<TR>
    			<!--Code-->
        		<TH>Code:</TH>
        		<TD><s:property value="code"/></TD>
    			<!--Code-->
   			</TR>
   			<TR>  
    			<!--Satisfaction-->
        		<TH>Satisfaction:</TH>
        		<TD><s:property value="satisfact"/></TD>
    			<!--Code-->
   			</TR>
			<TR>
    			<!--Coefficient-->
        		<TH>Coefficient:</TH>
        		<TD><s:property value="coefficient"/></TD>
    			<!--Code-->
   			</TR>
    		<TR>
        		<TH>Image:</TH>
        		<!-- <input type="file" name="productImage" size="31" /> .PNG .JPEG  -->
        		<TD>
        			<s:if test="%{imgDTO != null}">
            			<div class="hcenter" style="padding-top:10px;">
            					<div id="cover_image_1" class="hcenter">
            						<img src="${brand}<s:property value="imgDTO.name" />" />
            					</div>
            					<div style="margin-top:3px;">Current Size:</div>
            					<span id="img_dim_1"><s:property value="imgDTO.width" /> x
            						<s:property value="imgDTO.height" /> -
            						<s:property value="imgDTO.size" />kb</span>
            			</div>
            		</s:if>
        		</TD>
    		</TR>
    		<TR>
    			<!--Description ENGLISH-->
        		<TH>Description:</TH>
        		<TD><s:text name="description"/></TD>
    			<!--Description ENGLISH-->
    		</TR>
		</TABLE>
	</fieldset>
	<!-- Buttons begin -->
	<TABLE border="0" width="450px">
		<TR>
			<TD>
				<s:form name="addBrand" action="addBrand.do">
					<input type="submit" value="Add Brand" 
		    				style="padding:5px 10px;font-size:20px;"/>
				</s:form>
			</TD>
			<TD>
				<input type="submit" value="Brand List" onclick="location.href='commonList.do?pageType=2'"
		    			style="padding:5px 10px;font-size:20px;" />
			</TD>
		</TR>
	</TABLE>
	<!-- Buttons end -->
</div>