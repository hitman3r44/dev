<%@ taglib uri="/struts-tags" prefix="s" %>

<s:set var="images"  			value="@com.loyauty.web.WebConstants@IMAGES_BASE_URL" />
<s:set var="media"  			value="@com.loyauty.web.WebConstants@MEDIA_BASE_URL" />
<s:set var="scripts"  			value="@com.loyauty.web.WebConstants@SCRIPTS_BASE_URL" />
<s:set var="css"  				value="@com.loyauty.web.WebConstants@CSS_BASE_URL" />
<s:set var="isLogin"  			value="#session[@com.loyauty.web.WebConstants@USER] != null" />
<s:set var="brand"  			value="@com.loyauty.web.WebConstants@BRAND_BASE_URL" />
<s:set var="product"  			value="@com.loyauty.web.WebConstants@PRODUCT_BASE_URL" />

<s:set var="productLarge"		value="@com.loyauty.web.WebConstants@PRODUCT_LARGE_BASE_URL" />
<s:set var="productThumbnail"	value="@com.loyauty.web.WebConstants@PRODUCT_THUMBNAIL_BASE_URL" />
<s:set var="brandMinithumb"		value="@com.loyauty.web.WebConstants@BRAND_MINITHUMB_BASE_URL" />
<s:set var="brandThumbnail"		value="@com.loyauty.web.WebConstants@BRAND_THUMBNAIL_BASE_URL" />
<s:set var="temporary"			value="@com.loyauty.web.WebConstants@TEMPORARY_PROFILE_BASE_URL" />
<s:set var="temporaryLocal"		value="@com.loyauty.web.WebConstants@TEMPORARY_PROFILE_LOCAL_URL" />

<!-- Content max length -->
<s:set var="CONTENT_MAX_LENGTH"  value="@com.loyauty.web.WebConstants@CONTENT_MAX_LENGTH" />

<!-- Video max mirror -->
<s:set var="MAX_VIDEO_MIRROR"  	value="@com.loyauty.web.WebConstants@MAX_VIDEO_MIRROR" />
<s:set var="PUBLISH_RANGE_DATE" value="@com.loyauty.web.WebConstants@PUBLISH_RANGE_DATE" />

<!-- Replace zero by under score -->
<s:set var="ZERO"  value="@com.loyauty.web.WebConstants@ZERO_REPRESENTATION" />

<s:set var="USER_LIST"  			  	value="@com.loyauty.web.WebConstants@USER_LIST" />
<s:set var="BRAND_LIST"  			  	value="@com.loyauty.web.WebConstants@BRAND_LIST" />
<s:set var="CATEGORY_LIST" 	 		 	value="@com.loyauty.web.WebConstants@CATEGORY_LIST" />
<s:set var="PRODUCT_LIST"  			  	value="@com.loyauty.web.WebConstants@PRODUCT_LIST" /> 
<s:set var="MAIN_SPECIFICATION_LIST"  	value="@com.loyauty.web.WebConstants@MAIN_SPECIFICATION_LIST" />
<s:set var="ALL_LANGUAGE_LIST" 			value="@com.loyauty.web.WebConstants@ALL_LANGUAGE" />
<s:set var="ALL_USER_TYPE_LIST" 		value="@com.loyauty.web.WebConstants@ALL_USER_TYPE" />
<s:set var="ALL_PROVINCE_LIST" 			value="@com.loyauty.web.WebConstants@ALL_PROVINCE" />
<s:set var="BRAND_LIST_VIEW"  			value="@com.loyauty.web.WebConstants@BRAND_LIST_VIEW" />
<s:set var="CATEGORY_LIST_VIEW"  		value="@com.loyauty.web.WebConstants@CATEGORY_LIST_VIEW" />
<s:set var="SPECIFICATION_LIST_VIEW"  	value="@com.loyauty.web.WebConstants@SPECIFICATION_LIST_VIEW" />
<s:set var="USER_LIST_VIEW"  			value="@com.loyauty.web.WebConstants@USER_LIST_VIEW" />

<s:set var="MANUEL_PRICE_SET"  			value="@com.loyauty.web.WebConstants@PRICE_TYPE_MANUEL" />

<s:set var="P_STATUS_AVAILABLE" 		value="@com.loyauty.web.WebConstants@P_STATUS_AVAILABLE" />
<s:set var="P_STATUS_UNAVAILABLE" 		value="@com.loyauty.web.WebConstants@P_STATUS_UNAVAILABLE" />
<s:set var="P_STATUS_DISCONTINUED" 		value="@com.loyauty.web.WebConstants@P_STATUS_DISCONTINUED" />
<s:set var="P_STATUS_DISABLED" 			value="@com.loyauty.web.WebConstants@P_STATUS_DISABLED" />
