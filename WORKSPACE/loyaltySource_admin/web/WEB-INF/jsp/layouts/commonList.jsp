<%@ taglib uri="/struts-tags" prefix="s" %>


<div class="unit" style="width: 950px; margin: 30px 0px 0px 60px;">
	<div class="pop_title" id="Title">
		<s:property value="sectionTitle" />
	</div>
	
	<div id="AccountList" class="fixed column" style="padding: 20px 0px 0px 0px;">
		<div class="blue f12 bold pb10" style="padding-bottom: 10px;">
		</div>
		
		<div id="accountListData" style="width: 950px;">
			<div id="ajax_loading" style="display: none;">
				<img src="${images}/ajax-loader.gif" />
			</div>
			<table border="0" cellspacing="0" cellpadding="0"
				class="pad_5px nowraptable datatable">
				<thead class="gray_header">
					<tr>
						<s:iterator value="thLabels" status="status">
							<th style="width: 350px; text-align: left;" class="bold"><s:property />
							</th>
						</s:iterator>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td colspan="2" class="dataTables_empty"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

</div>


<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {

		var pageType = '<s:property value="pageType"/>';
		$('#ajax_loading').show();
		showListRequested(pageType);

	});
</script>