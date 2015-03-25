package com.loyauty.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.loyauty.enums.PriceType;
import com.loyauty.enums.ProductStatus;
import com.loyauty.enums.UserProductStatus;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
/**
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true) 
public class Query extends AbstractEntity {
	private Brand brand;
	private Category category;
	private Long typeId;
	private boolean discontinued;
	private boolean disabled;
}
