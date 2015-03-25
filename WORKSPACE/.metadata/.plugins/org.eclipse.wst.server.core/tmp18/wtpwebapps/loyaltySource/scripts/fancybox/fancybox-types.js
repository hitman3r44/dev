/* *
 * 
 * This js script is the place to define all fancybox types.
 * By this way the javascript code will be lighter and maintainable
 * 
 * */

var LoyaltyFancyboxTypes = { "AjaxNoCache" : {'ajax' : { 
								type: "GET",
								scrolling : 'no',
								modal : false,
								cache : false // IE 7 caching cause a problem, this option add a random number at each request. By this way we by pass IE caching 
							}
				}};

