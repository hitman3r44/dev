package com.loyauty.model;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author Rafael
 *
 */
@Data @ToString(callSuper=true) 
public class AlterProductXML extends AbstractEntity {	
	private Long productId;
	private Boolean brandId;
	private Boolean categoryId;
	private Boolean typeId;
	private Boolean imageId;
	private Boolean statusId;
	private Boolean nameEn;
	private Boolean nameFr;
	private Boolean descriptionEn;
	private Boolean descriptionFr;
	private Boolean specificationEn;
	private Boolean specificationFr;
	private Boolean otherEn;
	private Boolean otherFr;
	private Boolean warrantyEn;
	private Boolean warrantyFr;
	private Boolean dimensions;
	private Boolean weight;
	private Boolean modelNumber;
	private Boolean msrp;
	private Boolean productToBeExecuted;
	private Boolean shipping;
	
	//"shipment" will be used in the product_xml_alter
	private Boolean shipment;
	
}