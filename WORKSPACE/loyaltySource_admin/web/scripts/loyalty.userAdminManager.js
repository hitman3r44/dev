function showListRequested(typePage) {	
	var dataUserList = [];	
	
	if(typePage == 1) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" }, { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/accountsList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, account) {
				dataUserList.push( [ account.login, account.email, account.code, account.active, account.clientCategoryName,
			                     '<a href="manageAccountInit.do?userId=' + account.id + '&userName='+account.login+'">Manage</a>' 
			                     + '  -  ' + '<a href="editUser.do?userId=' + account.id + '">Edit</a>' ]);
			});
	
		if( dataUserList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
	  });
	}
	else if(typePage == 2) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null ,null, { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/brandList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, brand) {
				dataUserList.push( [ brand.id , brand.name, brand.localizedCreationDate,brand.satisfact, 
			                     '<a href="editBrand.do?brandId=' + brand.id + '">Edit Brand</a>' ]);				
			});	
		if( dataUserList.length != 0 ) {
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
		});
		
	}
	else if(typePage == 3) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/categoryList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, cat) {
				dataUserList.push( [ cat.id, cat.code, cat.name, cat.categoryGoupeId,
			                     '<a href="getCategory.do?categoryId=' + cat.id + '">Edit Category</a>' ]);				
			});	
	
		if( dataUserList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
		});
		
	}
	else if(typePage == 4) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		var dataProductList = [];	
		$.getJSON("ajax/productList.do", function(data) {	
			$.each(data.aaData, function(index, pro) {
				dataProductList.push( [ pro.nameEng.name, pro.brand.name, pro.category.name,
			                     '<a href="getProduct.do?productId=' + pro.id + '&brand=' + pro.brand.id + '&category=' + pro.category.id + '">Edit Product ABC</a>' ]);				
			});	
	
		if( dataProductList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataProductList }));
		}
		});
		
	}
	else if(typePage == 5) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 
		
		
		var dataProductList = [];
		$.getJSON("ajax/getMainSpecificationList.do", function(data) {	
			$.each(data.aaData, function(index, specification) {
				dataProductList.push( [ specification.id, specification.category.name, specification.name, specification.status,
			                     '<a href="getMainSpecification.do?specificationId=' + specification.id + '">Edit Type</a>' ]);				
			});	
	
		if( dataProductList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataProductList }));
		}
		});
		
	}
	else if(typePage == 6) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/brandList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, brand) {
				dataUserList.push( [ brand.id , brand.name, brand.localizedCreationDate, 
			                     '<a href="viewBrand.do?brandId=' + brand.id + '">View Brand</a>' ]);				
			});	
		if( dataUserList.length != 0 ) {
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
		});
		
	}
	else if(typePage == 7) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/categoryList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, cat) {
				dataUserList.push( [ cat.id, cat.code, cat.name, cat.categoryGoupeId,
			                     '<a href="viewCategory.do?categoryId=' + cat.id + '">View Category</a>' ]);				
			});	
		
		if( dataUserList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
		});
	}
	else if(typePage == 8) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" } ] });		
		
		var dataProductList = [];	
		$.getJSON("ajax/getMainSpecificationList.do", function(data) {	
			$.each(data.aaData, function(index, specification) {
				dataProductList.push( [ specification.id, specification.category.name, specification.name, specification.status,
			                     '<a href="viewType.do?specificationId=' + specification.id + '">View Type</a>' ]);				
			});
		
		if( dataProductList.length != 0 ) {
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataProductList }));
		}
		});
	}
	else if(typePage == 9) {
		var tableType = $.extend({}, LoyaltyDatatableTypes.fullNumbersPagination,
				{"aoColumns": [ null, null , { "sClass": "hcenter" }, { "sClass": "hcenter" }, { "sClass": "hcenter" } ] }); 

		$.getJSON("ajax/accountsList.do", { r: new Date().getTime() }, function(data) {	
			$.each(data.aaData, function(index, account) {
				dataUserList.push( [ account.login , account.email, account.code, account.active,
			                     '<a href="manageAccountInit.do?userId=' + account.id + '&userName='+account.login+'">Account</a>' 
			                     + '  -  ' + '<a href="viewUser.do?userId=' + account.id + '">User</a>' ]);
			});
	
		if( dataUserList.length != 0 ) {			
			$('#accountListData').dataTable( $.extend({}, tableType, {"aaData" : dataUserList }));
		}
	  });
	}	
	$('#ajax_loading').hide();	
}

function initializeDatatable() {
	var datatableTypes = {
			"fullNumbersPagination": {
				"sPaginationType": "full_numbers",
				"bAutoWidth": false,
				"bFilter": true,
				"bLengthChange": false,
				"bInfo": false,
				"bSort": false,
				"bSortClasses": false,
				"iDisplayLength": 100,
				"asStripClasses": ['blue_bg',''],
				"oLanguage": {
					"sZeroRecords": "...",
					"oPaginate": {
								"sNext": "&#8250;",
								"sLast": "&raquo;",
								"sPrevious":"&#8249;",
								"sFirst":"&laquo;"
							}
				}
			}
		};
	var dataProductList = [];	
	var oTable;	
	oTable = $.extend( {}, datatableTypes.fullNumbersPagination,{"aoColumns": [null, 
	                                                                           { "sClass": "hcenter" }, 
	                                                                           { "sClass": "hcenter" }, 
	                                                                           { "sClass": "hcenter" } , 
	                                                                           { "sClass": "hcenter" }, 
	                                                                           { "sClass": "hcenter" }, 
	                                                                           { "sClass": "hcenter" }, 
	                                                                           { "sClass": "hcenter" } ] }); 	
	var table = $('#productListData').dataTable( $.extend({},oTable,{"aaData" : dataProductList }));	
	return(table);
}

function getProductListByQuery(brand, category, discontinued, disabled, table, userTypeId) {	 
	var dataProductList = [];	
	table.fnClearTable();	
	var hyperlink = '';
	var hyperLabel = '';
	var hyperLabelSale = '';
	
	if (userTypeId == 3) {
		hyperlink = 'viewProduct.do';
		hyperLabel = 'View';		
	} else if (userTypeId == 4) {
		hyperlink = 'amendProduct.do';
		hyperLabel = 'Amend';
	} else {
		hyperlink = 'getProduct.do';
		hyperLabel = 'Edit';
		hyperLabelSale='Sale';
		hyperlinkSale = 'editSaleProduct.do';
		
	}
	
	$.getJSON("ajax/productListQuery.do", {brandId: brand, categoryId: category, discontinued: discontinued, disabled: disabled, r: new Date().getTime() }, function(data) {	
		$.each(data.aaData, function(index, pro) {
			table.fnAddData([pro.id, 
				             pro.nameEng.name,	
					         pro.brand.name,
					         pro.category.name,
					         pro.statusName,
					         pro.manufacturerProductId,
					         pro.loyaltyProductId,
					         '<a href="' + hyperlink + '?productId=' + pro.id + '&brand=' + pro.brand.id + '&category=' + pro.category.id + '">' + hyperLabel + ' Product</a>' + ' '+
					         '<a style="padding-left:20px;" href="' + hyperlinkSale + '?productId=' + pro.id + '&brand=' + pro.brand.id + '&category=' + pro.category.id + '">' +hyperLabelSale + '</a>'] );
		});
	});
	$('#ajax_loading').hide();
}

function populateCategoryAndDiscount(brandId, userId) {
	
	$.getJSON("ajax/populateCategoryAndDiscount.do", {brandId: brandId, userId: userId, r: new Date().getTime() },function(data) {	    

		var myList = document.getElementById("category");
		var selected = false;
		
		myList.options.length = 0;
		myList.options[0] = new Option("--Please Select--", "-1", true, true); // remplissage de la liste
		$.each(data.aaData, function(index, item) {
			myList.options[myList.options.length] = new Option(item.name, item.id, selected, selected);
		});
		
		if(data.userDiscount == null) {
			$("#brandDiscount").val("");
		} else {
			$("#brandDiscount").val(data.brandDiscount);
		}
	});	
}

function getProductAndDiscountByCategory(categoryId, brandId, userId) {
	$.getJSON("ajax/getProductAndDiscountByCategory.do", {categoryId:categoryId, brandId:brandId, userId:userId, 
			  r: new Date().getTime() },function(data) {
	});
}

function populateCategory(brandId, categoryPreSelected) {
	
	$.getJSON("ajax/populateCategory.do", {brandId: brandId, r: new Date().getTime() },function(data) {	    
		var myList = document.getElementById("category");
		var selected = false;
		myList.options.length = 0;		
		if(categoryPreSelected == undefined ) {
			myList.options[0] = new Option("--Please Select--", "-1", true, true); // remplissage de la liste
		}
		else { 
			myList.options[0] = new Option("--Please Select--", "-1", selected, selected); // remplissage de la liste
		}
		$.each(data.aaData, function(index, item) {
			
			if(categoryPreSelected == item.id ) {
				selected = true;
			} else {
				selected = false;
			}
			
			myList.options[myList.options.length] = new Option(item.name, item.id, selected, selected);			  
		});
		$("#loyaltyProductId").val(data.codeBrand);
		
		if (myList != null) {
		// This will select the second option if there's only one (other than '--please select--')
		// And also set the text to '- None -' if there's no options
			var itemCount = myList.options.length;
			if (itemCount === 2) {
				myList.options[1].selected = true;
			} else if (itemCount === 1) {
				myList.options[0].text = "--- NONE ----";
			}
			// call the 'change' event of the selector 'category'
			$(myList).change();
		}
	});
}

function populateMainSpecification(categoryId, brandId, specificPreSelected) {	
	$.getJSON("ajax/getMainSpecificationByCategory.do", {categoryId: categoryId, r: new Date().getTime() },function(data) {	    
		var myList = document.getElementById("mainSpecification");
		var selected = false;
		if (myList != null) {
			myList.options.length = 0;
			if(specificPreSelected == undefined) {
				myList.options[0] = new Option("--Please Select--", "-1", true, true); // remplissage de la liste
			} else {
				myList.options[0] = new Option("--Please Select--", "-1", selected, selected); // remplissage de la liste
			}
		}
		$.each(data.aaData, function(index, item) {
			if(specificPreSelected == item.id ) {
				selected = true;
			}
			else {
				selected = false;
			}
			if (myList != null) {
				myList.options[myList.options.length] = new Option(item.name, item.id, selected, selected);
			}
		});

		// This will select the second option if there's only one (other than '--please select--')
		// And also set the text to '- None -' if there's no options
		
		if (myList != null) {
			var itemCount = myList.options.length;
			if (itemCount === 2) {
				myList.options[1].selected = true;
			} else if (itemCount === 1) {
				myList.options[0].text = "--- NONE ----";
			}
			// call the 'change' event of the selector 'mainSpecification'
			$(myList).change();
		}
	});	
}