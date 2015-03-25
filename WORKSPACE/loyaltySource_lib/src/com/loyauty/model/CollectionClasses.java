package com.loyauty.model;

import java.util.ArrayList;
import java.util.List;

import com.loyauty.service.core.dto.OrdersDTO;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class CollectionClasses extends AbstractEntity{

	private List<Orders> listOrders=new ArrayList<Orders>();
		
	
}
