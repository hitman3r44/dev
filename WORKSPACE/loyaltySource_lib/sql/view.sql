
CREATE VIEW search AS

select p.id,
	p.image_id as image_id,
	p.status_id as status,
	p.msrp,
	p.cost,
	loyalty_source_product_id as loyaltySourceProductId,
	p.width as widthProduct,
	p.high,
	p.long,
	p.weight,
	p.type_id as typeId,
	tn.id as nameEntryId,
	tn.trans_id as nameTransId,
	tn.lang_id as nameLangId,
	tn.text as nameText,
	td.id as descriptionEntryId,
	td.trans_id as descriptionTransId,
	td.lang_id as descriptionLangId,
	td.text as descriptionText,			
	ts.id as specificationEntryId,
	ts.trans_id as specificationTransId,
	ts.lang_id as specificationLangId,
	ts.text as specificationText,			
	tx.id as otherEntryId,
	tx.trans_id as otherTransId,
	tx.lang_id as otherLangId,
	tx.text as otherText,
	br.id as brandId,
	br.name as name,
	br.image_id as brand_image_id,
	br.description as description,
	br.creation_date as creationDate,
	ct.id as categoryId,
	ct.category_group_id as categoryGoupeId,
	ct.name as categoryName,
	ct.code as categoryCode,
	im.id as imageId,
	im.name as imageName,
	im.real_name as realNameImg,
	im.type_id as type, 
	im.size, 
	im.height, 
	im.width, 
	im.large, 
	im.resolution,
	im.score,
	tn.text || ' ' || 
	br.name || ' ' || 
	ct.name || ' ' || 
	sp.name || ' ' || 
	cg.name || ' ' ||
	p.loyalty_source_product_id || ' ' || 
	array_to_string(array(select pmn.model_number from product_model_number pmn where pmn.product_id = p.id ), ' ') ||
	case when p.id = 5766 then ' iPod Nano iPod Shuffle iPod Touch iPod Classic iPad 2 iPad 3 New iPad iMac MacBook Air MacBook Pro Apple TV ' else ' ' end || 
	case when p.category_id = 50 then 'pen Pen pens Pens' else ' ' end ||
	case when EXTRACT (DAY FROM now() - p.creation_date) <= 30 then ' new products ' else ' ' end ||
	array_to_string(array(select ua.code||'_'||p.loyalty_source_product_id from user_account ua where type_id = 2 ), ' ') ||
	array_to_string(array(select ua.code||p.loyalty_source_product_id from user_account ua where type_id = 2 ), ' ') as search
from product p
left join translation_entry tn on (p.name_trans_id = tn.trans_id)
left join translation_entry td on (p.description_trans_id = td.trans_id)
left join translation_entry ts on (p.specification_trans_id = ts.trans_id)
left join translation_entry tx on (p.other_trans_id = tx.trans_id)
left join brand br on (p.brand_id = br.id)
left join category ct on (p.category_id = ct.id)
left join image im on (br.image_id = im.id)
left join specification sp on (p.type_id = sp.id)
left join category_group cg on (ct.category_group_id = cg.id)
where tn.lang_id = td.lang_id
	  and td.lang_id = ts.lang_id
	  and ts.lang_id = tx.lang_id ;