package com.loyauty.service.core.dto;

import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * Contains data for the product.
 * 
 * @author Manuel
 *
 */
@Data @ToString(callSuper=true)
public class ProductDTO extends BasicDTO{
		
	private BrandDTO brand;
	private Long categoryId;
	private Long mainFilterTypeId;
	private String manufacturerProductId;
	private String loyaltyProductId;
	private CommonDTO nameEng;
	private CommonDTO nameFr;
	private ImageDTO image;
	private CommonDTO descriptionEng;
	private CommonDTO descriptionFr;
	private CommonDTO specificationEng;
	private CommonDTO specificationFr;
	private String msrp;
	private String cost;
	private Integer width;
	private Integer high;
	private Integer large;
	private String weight;
	private List<CommonDTO> manufactureProductList;
	
        public static class Builder {
            // Required parameters
            private final Long id;
            private final BrandDTO brand;
            private final Long categoryId;
            
            // Optional parameters - initialized to default values
            private Long mainFilterTypeId = new Long(0);
            private String manufacturerProductId = "";
            private String loyaltyProductId = "";
            private CommonDTO nameEng = null;
            private CommonDTO nameFr = null;
            private ImageDTO image = null;
            private CommonDTO descriptionEng = null;
            private CommonDTO descriptionFr = null;
            private CommonDTO specificationEng = null;
            private CommonDTO specificationFr = null;
            private String msrp = "";
            private String cost = "";
            private Integer width = 0;
            private Integer high = 0;
            private Integer large = 0;
            private String weight = "";
            private List<CommonDTO> manufactureProductList = null;
            
            public Builder(Long Id, BrandDTO brand, Long categoryId) {
        	this.id = Id;
        	this.brand = brand;
        	this.categoryId = categoryId;
            }
            
            public Builder mainFilterTypeId(Long val)
            { 
                mainFilterTypeId = val; 
                return this; 
            }
            public Builder manufacturerProductId(String val)
            { 
        	manufacturerProductId = val; 
        	return this; 
            }
            public Builder loyaltyProductId(String val)
            { 
        	loyaltyProductId = val; 
        	return this; 
            }
            public Builder nameEng(CommonDTO val)
            { 
        	nameEng = val; 
        	return this; 
            }
            public Builder nameFr(CommonDTO val)
            { 
        	nameFr = val; 
        	return this; 
            }
            public Builder descriptionEng(CommonDTO val)
            { 
        	descriptionEng = val; 
        	return this; 
            }
            public Builder descriptionFr(CommonDTO val)
            { 
        	descriptionFr = val; 
        	return this; 
            }
            public Builder specificationEng(CommonDTO val)
            { 
        	specificationEng = val; 
        	return this; 
            }
            public Builder specificationFr(CommonDTO val)
            { 
        	specificationFr = val; 
        	return this; 
            }
            public Builder image(ImageDTO val)
            { 
        	image = val; 
        	return this; 
            }
            public Builder msrp(String val)
            { 
        	msrp = val; 
        	return this; 
            }
            public Builder cost(String val)
            { 
        	cost = val; 
        	return this; 
            }
            public Builder weight(String val)
            { 
        	weight = val; 
        	return this; 
            }
            public Builder width(Integer val)
            { 
        	width = val; 
        	return this; 
            }
            public Builder high(Integer val)
            { 
        	high = val; 
        	return this; 
            }
            public Builder large(Integer val)
            { 
        	large = val; 
        	return this; 
            }
            public Builder manufactureProductList(List<CommonDTO> val)
            { 
        	manufactureProductList = val; 
        	return this; 
            }
            public ProductDTO build() {
        	return new ProductDTO(this);
            }
         }
	
        private ProductDTO(Builder builder){
            setId(builder.id);
            brand = builder.brand;
            categoryId = builder.categoryId;
            mainFilterTypeId = builder.mainFilterTypeId;
            manufacturerProductId = builder.manufacturerProductId;
            loyaltyProductId = builder.loyaltyProductId;
            nameEng = builder.nameEng;
            nameFr = builder.nameFr;
            image = builder.image;
            descriptionEng = builder.descriptionEng;
            descriptionFr = builder.descriptionFr;
            specificationEng = builder.specificationEng;
            specificationFr = builder.specificationFr;
            msrp = builder.msrp;
            cost = builder.cost;
            width = builder.width;
            high = builder.high;
            large = builder.large;
            weight = builder.weight;
            manufactureProductList = builder.manufactureProductList;
        }
	
}
