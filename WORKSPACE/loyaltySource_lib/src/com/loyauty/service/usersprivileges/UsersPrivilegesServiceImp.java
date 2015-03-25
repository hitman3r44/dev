package com.loyauty.service.usersprivileges;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.UsersPrivileges;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.UsersPrivilegesDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;


public class UsersPrivilegesServiceImp  extends ServiceImpl implements UsersPrivilegesService {


	@Setter @Getter
	protected DaoManager daoManager;
	
	private static ServiceLocator serviceLocator;
	private static UsersPrivilegesService userPrivilegesService;
	
	public UsersPrivilegesServiceImp() {
		setDaoManager(DaoManagerFactory.getDaoManager());
		serviceLocator = ServiceLocator.getInstance();
		
	}
	
	@Override
	public UsersPrivilegesDTO getPrivilegesByUser(final UsersPrivilegesDTO userPDTO) throws ServiceException {
		UsersPrivileges result = null;
		final UsersPrivileges userP=DTOFactory.BuildUserPrivileges(userPDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (UsersPrivileges) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getUsersPrivilegesDao().getPrivilegesByUser(userP);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return (DTOFactory.getUserPrivilegesDTO(result));

	}
	
	
	

}
