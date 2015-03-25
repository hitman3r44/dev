package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class QueryDTO extends BasicDTO {

	private static final long serialVersionUID = 1L;

	private BrandDTO brand;
	private CategoryDTO category;
	private boolean discontinued;
	private boolean disabled;

	public static class Builder {
		private final BrandDTO brand;
		private final CategoryDTO categoryId;
		private final boolean discontinued;
		private final boolean disabled;		

		public Builder(BrandDTO brand, CategoryDTO categoryId, 
				boolean isDiscontinued, boolean isDisabled) {
			this.brand = brand;
			this.categoryId = categoryId;
			this.discontinued = isDiscontinued;
			this.disabled = isDisabled;
		}

		public QueryDTO build() {
			return new QueryDTO(this);
		}
	}

	private QueryDTO(Builder builder) {
		brand = builder.brand;
		category = builder.categoryId;
		discontinued = builder.discontinued;
		disabled = builder.disabled;
	}
	
}
