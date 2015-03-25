package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class ClientCategory extends AbstractEntity{
	private static final long serialVersionUID = -1852525026212347090L;
	
	private Long clientCategoryId;
	private String clientCategoryName;
	private Long clientCategoryUserId;
	private String clientCategoryUserLogin;
	private Long countTempUsed;
	private Date creationDate;
	private Long managerId;
	private String managerRealName;
	private Double brandCoefficient;
	private Double profitCoefficient;
	private Double unitSoldCoefficient;
}
