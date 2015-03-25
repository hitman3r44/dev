package com.loyauty.service.operations;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.Operations;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.OperationsDTO;

public class OperationsServiceImpl extends ServiceImpl implements OperationsService { 
	private static final Logger log = Logger.getLogger(OperationsServiceImpl.class);
	@Setter @Getter
	protected DaoManager daoManager;
	
	public OperationsServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<OperationsDTO> getOperationsByTypeAndObject(final Long objectId,final String operationType) throws ServiceException {
		// TODO Auto-generated method stub
		List<Operations> operationsList = null;
		try {			
			operationsList = (List<Operations>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					return daoManager.getOperationsDAO().getOperationsByTypeAndObject(objectId,operationType);
				}
			}) ;
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}	
		return DTOFactory.getOperationsDTOByType(operationsList);
	}

	@Override
	public boolean insertOperation(final OperationsDTO operationDTO) {
		boolean result=false;
		final Operations operation=buildOperation(operationDTO);
		try{
			daoManager.setCommitTransaction(true);
			result = (Boolean) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {			
					return daoManager.getOperationsDAO().insertOperation(operation);
				}
			});
		}catch (DaoException de) {
			try {
				throw new ServiceException(de);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	private Operations buildOperation(final OperationsDTO operationDTO){
		Operations result=new Operations();
		if(operationDTO!=null){
			result.setOperationDate(operationDTO.getOperationDate());
			result.setOperationType(operationDTO.getOperationType());
			result.setDataAfter(operationDTO.getDataAfter());
			result.setDataBefore(operationDTO.getDataBefore());
			result.setUserId(operationDTO.getUserId());
			result.setObjectId(operationDTO.getObjectId());
		}
		return result;
	}
	
}
