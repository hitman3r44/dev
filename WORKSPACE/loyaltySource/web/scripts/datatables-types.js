/* *
 * 
 * This js script is the place to define all jquery.datatables types.
 * By this way the javascript code will be lighter and maintainable
 * 
 * */

var GamejabDatatableConfig = {
		"imagesLocation":"images"
};

var GamejabDatatableTypes = {
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
					"sNext": "<img src=\""+GamejabDatatableConfig.imagesLocation+"/next.png\" />",
					"sLast": "<img src=\""+GamejabDatatableConfig.imagesLocation+"/last.png\" />",
					"sPrevious":"<img src=\""+GamejabDatatableConfig.imagesLocation+"/previous.png\" />",
					"sFirst":"<img src=\""+GamejabDatatableConfig.imagesLocation+"/first.png\" />"
					}
		}
	}
}
