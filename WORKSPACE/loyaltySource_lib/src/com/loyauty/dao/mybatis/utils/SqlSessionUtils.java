package com.loyauty.dao.mybatis.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.loyauty.exception.InitializationException;

/**
 * Initializes IBatis from the XML configuration file
 * and provides a thread-safe sql session implementation.
 *  
 * @author Muthanna
 *
 */
public final class SqlSessionUtils {

	private SqlSessionUtils(){}

	private static final Logger log = Logger.getLogger(SqlSessionUtils.class);

	/*
	 *  Once created, the SqlSessionFactory should exist for the duration of application execution. 
	 *  There should be little or no reason to ever dispose of it or recreate it (Ibatis Docs).
	 */	
	private static SqlSessionFactory sqlSessionFactory;
	
	private static String PRODUCTION_ENVIRONEMENT = "production1";

	private static ThreadLocal<SqlSession> sqlSessionThreadLocal = new ThreadLocal<SqlSession>();

	private static final String MAPPERS_CONFIG_FILE = "mybatis-mapper-config.xml";

	/*
	 *  Initializing the Sql Session Factory Statically
	 */
	static{
		try {
			initialize(MAPPERS_CONFIG_FILE);
		} catch (InitializationException e) {			
			log.error(e);
			// TODO: What to do if MyBatis Sql Session Factory fails?
		}
	}

	/**
	 * Initialized IBatis from a configuration file.
	 * @param mappersConfigFile
	 */
	public static void initialize(String mapperConfigFile) throws InitializationException{		
		log.info("Initializing MyBatis Sql Session Factory...");
		if (sqlSessionFactory == null) {
			Reader reader = null;

			try {
				reader = Resources.getResourceAsReader(mapperConfigFile);
				log.info("MyBatis SQL Session Factory has been successfully inititialized.");
			} catch (IOException e) {
				String msg = "Something went wrong while trying to Initializing MyBatis Sql Session Factory!";				
				throw new InitializationException(msg, e);
			}

			// This class is used for creating the sqlSessionFactory, no need to keep it around
			SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

			sqlSessionFactory = factoryBuilder.build(reader, PRODUCTION_ENVIRONEMENT);
		}
	}

	/**
	 * Each thread should have its own instance of sqlSession; I use
	 * a {@link ThreadLocal} for this requirement.
	 *   
	 * @return
	 */
	public static SqlSession getCurrentSqlSession() {
		SqlSession sqlSession = sqlSessionThreadLocal.get();

		if (sqlSession == null) {
			sqlSession = sqlSessionFactory.openSession();
			if(log.isDebugEnabled()){
				log.debug("opening sql session...");
			}
			sqlSessionThreadLocal.set(sqlSession);
		}

		return sqlSession;
	}
	
	/**
	 * Closes the actual session.
	 * This method needs to be called <b>explicitly</b> to ensure that all 
	 * database resources are properly closed. 
	 */
	public static void close() {
		if (sqlSessionFactory == null || sqlSessionThreadLocal == null)
			return;

		if(log.isDebugEnabled()){
			log.debug("closing sql session...");
		}
		SqlSession sqlSession = sqlSessionThreadLocal.get();

		if (sqlSession != null)
			sqlSession.close();
		
		sqlSessionThreadLocal.remove();
	}

	/**
	 * Commits the transaction
	 */
	public static void commit() {
		if (sqlSessionFactory == null || sqlSessionThreadLocal == null)
			return;

		if(log.isDebugEnabled()){
			log.debug("committing sqlSession ...");
		}
		SqlSession sqlSession = sqlSessionThreadLocal.get();

		if (sqlSession != null)
			sqlSession.commit();
	}

	/**
	 * Rolls back the transaction 
	 */
	public static void rollback() {
		if (sqlSessionFactory == null || sqlSessionThreadLocal == null)
			return;

		if(log.isDebugEnabled()){
			log.debug("Rolling back sqlSession ...");
		}
		SqlSession sqlSession = sqlSessionThreadLocal.get();

		if (sqlSession != null)
			sqlSession.rollback();
	}

}
