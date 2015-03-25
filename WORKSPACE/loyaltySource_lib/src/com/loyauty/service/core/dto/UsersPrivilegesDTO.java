package com.loyauty.service.core.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UsersPrivilegesDTO extends BasicDTO {
	private static final long serialVersionUID = 2858476518139614936L;
	
	private Long 	userId;
	private String	actionName;
	private Long	actionCode;
	private Boolean active;
}
