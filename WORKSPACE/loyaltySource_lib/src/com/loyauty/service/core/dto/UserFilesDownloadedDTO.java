package com.loyauty.service.core.dto;


import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true) 
public class UserFilesDownloadedDTO  extends BasicDTO{
	private static final long serialVersionUID = -3926057683462740171L;
	
	private Long userId;
	private String fileName;
	private Date creationDate;
	private Boolean treated;
	private Boolean fileDeleted;
	

}
