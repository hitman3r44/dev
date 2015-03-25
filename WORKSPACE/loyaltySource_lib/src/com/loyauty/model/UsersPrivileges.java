package com.loyauty.model;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UsersPrivileges  extends AbstractEntity{
	private Long 	userId;
	private String	actionName;
	private Long	actionCode;
	private Boolean active;
}
