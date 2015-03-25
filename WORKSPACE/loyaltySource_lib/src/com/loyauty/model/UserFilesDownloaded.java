package com.loyauty.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data @ToString(callSuper=true)
public class UserFilesDownloaded  extends AbstractEntity{
	private static final long serialVersionUID = 6499919373152806559L;
	
	private Long userId;
	private String fileName;
	private Date creationDate;
	private Boolean treated;
	private Boolean fileDeleted;

}
