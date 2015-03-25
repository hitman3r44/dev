package com.loyauty.dao.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.loyauty.model.LoyaltyEnum;
import com.loyauty.util.CommonUtils;

/**
 * Handles persisting enums in GameJab.
 * In MyBatis, when we want to persist an attribute in a customized 
 * way, we should define our own handler to tell MyBatis how to interpret 
 * the parameters we send and how to handle the results it returns back.
 * 
 * Note: All handlers should implement {@link TypeHandler} and override the
 * setParameter and getResult methods.
 * 
 * @author Muthanna
 *
 * @param <E>
 */
public abstract class LoyaltyEnumHandler<E extends Enum<E>> implements TypeHandler {
	
	protected Class<E> type;
	
	public LoyaltyEnumHandler(Class<E> type) {		
	    this.type = type;
	}

	public void setParameter(PreparedStatement ps, int i, Object parameter, 
			JdbcType jdbcType) throws SQLException {

		if(parameter == null){
			ps.setNull(i, Types.INTEGER);
		}else{
			LoyaltyEnum hasValue = (LoyaltyEnum) parameter;			
			ps.setInt(i, hasValue.getValue());
		}
	}

	public Object getResult(ResultSet rs, String columnName) throws SQLException {

		Integer i = rs.getInt(columnName);	
		Object returnValue = null;
		
		if(i != null){
			returnValue = CommonUtils.enumFromValue(getEnums(), i);		
		}
			
		return returnValue;
	}

	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		
		Integer i = cs.getInt(columnIndex);	
		Object returnValue = null;
		
		if(i != null){
			returnValue = CommonUtils.enumFromValue(getEnums(), i);			
		}
			
		return returnValue;
	}
	
	
	/**
	 * All subclasses must implement this abstract method
	 * to give an array of the enum element the subclass 
	 * handles.
	 *  
	 * @return
	 */
	public abstract LoyaltyEnum[] getEnums();

}