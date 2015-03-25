package com.loyauty.service.operations;

import java.util.List;

import com.loyauty.exception.ServiceException;
import com.loyauty.model.Operations;
import com.loyauty.service.Service;
import com.loyauty.service.core.dto.OperationsDTO;

public interface OperationsService extends Service {

	/**
	 * 
	 * @param operationType
	 * @return
	 */
	List<OperationsDTO> getOperationsByTypeAndObject(Long objectId,String operationType) throws ServiceException;
	
	/**
	 * 
	 * @param operation
	 * @return
	 */
	boolean insertOperation(OperationsDTO operationDTO);
	
	
}
