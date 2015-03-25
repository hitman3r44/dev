package com.loyauty.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.loyauty.dao.OperationsDAO;
import com.loyauty.model.Operations;

public class OperationsDAOImpl extends BasicDaoImpl implements OperationsDAO{

	public OperationsDAOImpl(SqlSession sqlSession, String mapper) {
		super(sqlSession, mapper);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Operations> getOperationsByTypeAndObject(Long objectId,String operationType) {
		Map<String, Object> operationMap = new HashMap<String, Object>();
		operationMap.put("paramObjectId",objectId);
		operationMap.put("paramOperationType",operationType);
		 
		return getSqlSession().selectList(getNameSpace("getOperationsByTypeAndObject"),operationMap);
	}

	@Override
	public boolean insertOperation(Operations operation) {
		boolean result=false;
		int saccess=getSqlSession().insert(getNameSpace("insertOperation"),operation);
		if(saccess>0)result=true;
		return result;
	}
	
	

}
