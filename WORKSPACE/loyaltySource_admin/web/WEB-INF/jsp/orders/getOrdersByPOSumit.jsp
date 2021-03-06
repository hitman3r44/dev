<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript"
	src="thumbnailhover_files/jquery-latest.js"></script>
<script type="text/javascript"
	src="scripts/loyalty/order/orderManager.js"></script>
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
	<div class="pop_title" style="margin-top: 30px;">Get Orders By PO</div>

	<div id="formContainer" style="padding-bottom: 60px;">
		<br /> <br />

		<!-- ............................ List users .................................. -->

		<s:form action="getOrdersByPOSumit.do" method="post" validate="true" enctype="multipart/form-data">
			<div id="accountListData_filter" class="dataTables_filter" style="border-color: rgb(176, 196, 222); cursor: auto; z-index: 1; left: 61px; top: 186px;">
				Search: <s:textfield name="productOrderNumber"/>
				<s:submit value="Search" /> 
				
			</div>
		</s:form>


		<div id="accountListData" style="width: 950px;">
			<div id="ajax_loading" style="display: none;">
				<img src="${images}/ajax-loader.gif" />
			</div>
			<table border="0" cellspacing="0" cellpadding="0"
				class="pad_5px nowraptable datatable">
				<thead class="gray_header">
					<tr>
						<th>User ID</th>
						<th>Client First name</th>
						<th>Client Last Name</th>
						<th>Client Number</th>
						<th>Client City</th>
						<th>Client Postal Code</th>
					</tr>
				</thead>

				<tbody>
					<s:iterator value="%{ordersListSumit}" id="orderDTO">
						<tr>
							<td><s:property value="%{#orderDTO.userId}" /></td>
							<td><s:property value="%{#orderDTO.clientFirstName}" /></td>
							<td><s:property value="%{#orderDTO.clientLastName}" /></td>
							<td><s:property value="%{#orderDTO.clientNumber}" /></td>
							<td><s:property value="%{#orderDTO.clientCity}" /></td>
							<td><s:property value="%{#orderDTO.clientPostalCode}" /></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</div>

