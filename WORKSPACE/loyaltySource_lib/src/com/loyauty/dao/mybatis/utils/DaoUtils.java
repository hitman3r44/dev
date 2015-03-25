package com.loyauty.dao.mybatis.utils;

/**
 * Utilities to support MyBatis DAOs functionality
 * 
 * @author Muthanna
 *
 */
public final class DaoUtils {

	private DaoUtils() {}

	public static final String MAPPERS_PACKAGE = "com.loyauty.dao.mybatis.mappers";
	
	/**
	 * Construcs the full name space needed to access
	 * SQL queries in MyBatis XML mapper files.
	 *  
	 * @param mapperName
	 * @param sqlFunctionId
	 * @return
	 */
	public static String getNameSpace(String mapperName, String sqlFunctionId){
		StringBuilder builder = new StringBuilder(MAPPERS_PACKAGE);
		builder.append(".");
		builder.append(mapperName);
		builder.append(".");
		builder.append(sqlFunctionId);		 
		return builder.toString();
	}
}