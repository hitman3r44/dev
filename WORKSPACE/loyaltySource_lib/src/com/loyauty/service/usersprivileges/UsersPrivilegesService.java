package com.loyauty.service.usersprivileges;

import com.loyauty.exception.ServiceException;
import com.loyauty.model.UsersPrivileges;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;

public interface  UsersPrivilegesService  extends Service {

	UsersPrivilegesDTO getPrivilegesByUser(UsersPrivilegesDTO userPDTO) throws ServiceException;
}
