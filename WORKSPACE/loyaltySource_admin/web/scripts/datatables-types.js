/* *
 * 
 * This js script is the place to define all jquery.datatables types.
 * By this way the javascript code will be lighter and maintainable
 * 
 * */

var LoyaltyDatatableConfig = {
		"imagesLocation":"images"
};

var LoyaltyDatatableTypes = {
	"fullNumbersPagination": {
		"sPaginationType": "full_numbers",
		"bAutoWidth": true,  //false
		"bFilter": true,
		"bLengthChange": false,
		"bInfo": false,
		"bSort": true,
		"bSortClasses": true,
		"iDisplayLength": 50,
		"asStripClasses": ['blue_bg',''],
		"oLanguage": {
			"oPaginate": {
					"sNext": "<img src=\""+LoyaltyDatatableConfig.imagesLocation+"/next.png\" />",
					"sLast": "<img src=\""+LoyaltyDatatableConfig.imagesLocation+"/last.png\" />",
					"sPrevious":"<img src=\""+LoyaltyDatatableConfig.imagesLocation+"/previous.png\" />",
					"sFirst":"<img src=\""+LoyaltyDatatableConfig.imagesLocation+"/first.png\" />"
					}
		}
	}
}
