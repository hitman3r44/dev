package com.loyauty.dao;

import com.loyauty.model.UsersPrivileges;

public  interface  UsersPrivilegesDao  extends BasicDao{
	
	
	UsersPrivileges getPrivilegesByUser(UsersPrivileges userP);
	
	
}
