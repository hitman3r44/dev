package com.loyauty.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class Select extends AbstractEntity{
	
	private String query;
	private Long userId;
	private Long productId;
	private Long provinceId;
	private Long cityId;
	private Long categoryGoupeId;
	private Long categoryId;
	private Long typeId;
	private Long brandId;
	
	private Long lower;
	private Long upper;
	private Long from;
	private Long to;
	
	private Date updateDate;
	
	private Long clientCategoryId;
	
	private List<String> listQuery;
	
	public Select(){}
	
	public List<String> getListQuery() {
		List<String> list = new ArrayList<String>();
		for(String string: query.split(" ")) {
			list.add(string);
		}
		return(list);
	}
	
}
