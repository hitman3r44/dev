package com.loyalty.service.user;


import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.enums.UserType;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.InvalidUserException;
import com.loyauty.exception.ServiceException;
import com.loyauty.model.User;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.user.UserService;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.UserDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.init.ConfigService;
import com.loyauty.util.CommonUtils;


public class UserDAOTest {

	private static ServiceLocator serviceLocator;	
	private static UserService service;	
	private static ConfigService configService;
	private static DaoManager daoManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			System.out.println("[RGP] setUpBeforeClass(): starts...");
		
		daoManager = DaoManagerFactory.getDaoManager();
		serviceLocator = ServiceLocator.getInsance();
		service = serviceLocator.getUserService();
		configService = serviceLocator.getConfigService();
		configService.initialize();
		
		System.out.println("setUpBeforeClass() finished.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");	
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getAllUsers() throws ServiceException {

		final Integer RESULTS_PER_PAGE = 10;
		final User user = new User();		
		user.setTypeId(2);	// UserType.USER	
		List<User> userList = null;		
		try {			
			userList = (List<User>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {	
					//here the database access
					List<User> userListing = daoManager.getUserDao().getAllUsers(user);
					
					for (User any1 : userListing) {
						System.out.println("---- [RGP] user: id: " + any1.getId() + ", login: " + any1.getLogin() + ", email: " + any1.getEmail());
					}					
					
					return daoManager.getUserDao().getAllUsers(user);				
				}
			}) ;
		}catch (DaoException de) {
			throw (new ServiceException(de));
		}		
		
		List<UserSessionDTO> userListDTO = new ArrayList<UserSessionDTO>();
		UserSessionDTO userSessionDTO;
				
		for(User usr : userList){
			userSessionDTO = UserSessionDTO.valueOf(usr.getId(), usr.getLogin(), usr.getTypeId(), 
							 usr.getPrimaryLanguage().getValue(), Language.ENGLISH.getValue(), RESULTS_PER_PAGE, 
							 usr.getEmail(), usr.getCode(), usr.isActive());
			userListDTO.add(userSessionDTO);
		}
		
		

		
		// return DTOFactory.getAllUsersAccountsDTO(userList);
	}
	
	@Test
	public void setDaoManager() {		
		
	}

	@Test
	public void getDaoManager() {
		fail("Not yet implemented");
	}

	

}
