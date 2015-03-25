package com.loyalty.service.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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

public class UserServiceTest {	
	
	private static ServiceLocator serviceLocator;	
	private static UserService service;	
	private static ConfigService configService;
	private static DaoManager daoManager;
	
	private UserDTO userDTO;
	private UserSessionDTO userSessionDTO;
	private User user;
	
	private long userId = 0L; 
	private String login = "login2";
	private String code = "TST2";
	private Integer typeId = 2;
	private String password = "123";
	private String email = "rafaelgp2@net.ca";
	private boolean active = true;
	private String realName = "First Last Name 2";
	private Integer age = 55;
	private String address = "1 Oak Road 2";
	private String postalCode = "H0F 1G2";
	private String phone = "514-3855-233";
	private Integer primaryLanguage = 2;
	private Integer secondaryLanguage = 1;	
	
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

	// @Test (expected = InvalidUserException.class)
	@Ignore
	public void createAccount() throws ServiceException, InvalidUserException {
		System.out.println("[RGP] createAccount(): starts...");
		
		User user = null;
		assertNull(user);
		
		assertNotNull("login-variable not null", login);
		assertNotNull("password-variable not null", password);		
		assertNotNull("email-variable not null", email);		
		
		assertTrue("login-variable held a valid-String", CommonUtils.isValidString(login));
		assertTrue("password-variable held a valid-String", CommonUtils.isValidString(password));
		assertTrue("email-variable held a valid-String", CommonUtils.isValidString(email));		
		
		if (!CommonUtils.isValidString(login) || !CommonUtils.isValidString(password) ||
				!CommonUtils.isValidString(email)) {
			System.out.println("[RGP] [1] createAccount(): IllegalArgumentException will be thrown...");
			throw new IllegalArgumentException("Can't create a new account with invalid login-password-email=" +
					login + "-" + password + "-" + email);
		}
		
		if (!CommonUtils.isValidString(login) || !CommonUtils.isValidString(password)) {
			System.out.println("[RGP] [2] createAccount(): IllegalArgumentException will be thrown...");
			throw new IllegalArgumentException("Can't authenticate null or empty user and/or password.\n login-password=" +
					login + "-" + password);
		}
		
		try {
			assertNull("[RGP] User-instance (user) is null^", user);
			user = (User) daoManager.executeAndHandle(new DaoCommand() {				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					return daoManager.getUserDao().getUser(login);
				}
			});
		} catch (DaoException dx) {
			System.out.println("[RGP] [1] createAccount(): ServiceException will be thrown...");
			throw new ServiceException(dx);
		}
		
		if (user != null) {					
				// Get the password
				assertSame(password, user.getPassword());
				if (password.equals(user.getPassword())) {
					if (!user.isActive()) {
						throw new InvalidUserException("Your account is disabled.");
					}
					userSessionDTO = DTOFactory.getUserSessionDTO(user);
					assertNotNull("userSessionDTO-object not null", userSessionDTO);
				} else {
					System.out.println("[RGP] [1] createAccount(): InvalidUserException will be thrown...");
					throw new InvalidUserException("bad login / password. Try again.");
				}
		} else {
			assertNull("[RGP] user-object is  null", user);
			System.out.println("[RGP] [2] createAccount(): InvalidUserException will be thrown...");			
			throw new InvalidUserException("bad login / password. Try again.");
		}
		
		System.out.println("[RGP] createAccount(): finished.");
	}


	// @Test
	@Ignore
	public void createUser() throws ServiceException {		
		System.out.println("[RGP] createUser(): starts...");
		
		assertNull("user-object is null", user);
		final User user = new User();
		UserDTO userDTO = UserDTO.valueOf(login, code, typeId, password, email, active, realName, address, postalCode, phone, primaryLanguage, secondaryLanguage);
		assertNotNull("userDTO-object not null", userDTO);
		
		user.setLogin(userDTO.getLogin());
		user.setPassword(userDTO.getPassword());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setEmail(userDTO.getEmail());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		// user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		if(userDTO.getImageDTO() != null) {
			assertTrue(userDTO.getImageDTO().getId() > 0);
			user.setImageId(userDTO.getImageDTO().getId());
		}
			
		assertTrue(userDTO.getPrimaryLanguage() > 0);
		assertTrue(userDTO.getSecondaryLanguage() > 0);		
		
		user.setPrimaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getPrimaryLanguage()));
		user.setSecondaryLanguage((Language)CommonUtils.enumFromValue(Language.values(), userDTO.getSecondaryLanguage()));
		
		assertNotNull("user-object not null", user);
		
		try{
			daoManager.setCommitTransaction(true);
			userId = (Long) daoManager.executeAndHandle(new DaoCommand() {
				
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {				
					daoManager.getUserDao().insertUserAccount(user);
					daoManager.getUserDao().insertUserProfil(user);
					//Just in user case, I insert all the products to the user
					if(user.getTypeId() == UserType.USER.getValue())
						daoManager.getUserDao().insertProductToUsers(user);
					return user.getId();
				}
			});
			assertTrue(userId > 0);
		} catch (DaoException de) {
			System.out.println("[RGP] [1] createUser(): ServiceException will be thrown...");
			throw new ServiceException(de);
		}
		
		System.out.println("[RGP] createUser(): finished.");
	}

	
	//@Test
	@Ignore
	public void getUserInformation() throws ServiceException {
		userId = 21;
		login = "login";
		code = "TST";
		typeId = 2;
		password = "123";
		email = "rafaelgp@net.ca";
		active = false;
		realName = "First Last Name";
		age = 55;
		address = "1 somewhere drive";
		postalCode = "H1A 2G4";
		phone = "000-000-0000";
		primaryLanguage = 1;	// [Enum-Entity] Language.ENGLISH [value = 1].
		secondaryLanguage = 2;	// [Enum-Entity] Language.FRENCH  [value = 2].

		System.out.println("[RGP] getUserInformation(): starts...");
		
		try {
			daoManager.setCommitTransaction(true);
			user = (User) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager) 
						throws DaoException {
					User usr = daoManager.getUserDao().getUser(userId);
					
					assertNotNull("usr-object not null", usr);
					
					assertTrue("[RGP] login-var assertSame() --> 'login'", usr.getLogin().equalsIgnoreCase(login));
					assertTrue("[RGP] code-var assertSame() --> 'TST'", usr.getCode().equalsIgnoreCase(code));
					assertTrue("[RGP] typeId-var assertSame() --> 2", usr.getTypeId() == typeId);
					assertTrue("[RGP] password-var assertSame() --> '123'", usr.getPassword().equalsIgnoreCase(password));
					assertTrue("[RGP] email-var assertSame() --> 'rafaelgp@net.ca'", usr.getEmail().equalsIgnoreCase(email));
					assertTrue("[RGP] active-var assertSame() --> false", usr.isActive() == active);
					assertTrue("[RGP] realName-var assertSame() --> 'First Last Name'", usr.getRealName().equalsIgnoreCase(realName));
					assertTrue("[RGP] age-var assertSame() --> 55", usr.getAge() == age);
					assertTrue("[RGP] address-var assertSame() --> '1 somewhere drive'", usr.getAddress().equalsIgnoreCase(address));
					assertTrue("[RGP] postalCode-var assertSame() --> 'H1A 2G4'", usr.getPostalCode().equalsIgnoreCase(postalCode));
					assertTrue("[RGP] phone-var assertSame() --> '000-000-0000'", usr.getPhone().equalsIgnoreCase(phone));
					
					assertTrue("[RGP] primaryLanguage-var assertSame() --> 1", usr.getPrimaryLanguage().equals(Language.ENGLISH));
					assertTrue("[RGP] secondaryLanguage-var assertSame() --> 2", usr.getSecondaryLanguage().equals(Language.FRENCH));					
		
					return usr;
				}
			});			
		} catch (DaoException de) {
			System.out.println("[RGP] [1] getUserInformation(): ServiceException will be thrown...");
			throw (new ServiceException(de));
		}
		
		userDTO = UserDTO.valueOf(login, code, typeId, password, email, active, 
				realName, address, postalCode, phone, primaryLanguage, 
				secondaryLanguage);
		
		assertNotNull("userDTO-object not null", userDTO);
		
		System.out.println("[RGP] getUserInformation(): finished.");
	}

	
	@Test
	// @Ignore
	public void updateUser() throws ServiceException {		
		System.out.println("[RGP] updateUser(): starts...");
		
		userId = 18L;
		login = "lgn";
		code = "PRF";
		typeId = 2;
		password = "007";
		email = "rafaelgp@go.ca";
		active = true;
		realName = "First Last Name";
		age = 88;
		address = "1 elsewhere drive";
		postalCode = "A0A 1B1";
		phone = "000-000-0000";
		primaryLanguage = 2;	// [Enum-Entity] Language.FRENCH  [value = 2].
		secondaryLanguage = 1;	// [Enum-Entity] Language.ENGLISH [value = 1].
		
		try {
		    daoManager.setCommitTransaction(true);
		    daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(com.loyauty.dao.core.DaoManager daoManager)
				throws DaoException {
					
					assertNull("userDTO-object is null", userDTO);
					
					// 1.- We retrieve the register from DB using the userId.
					User user = daoManager.getUserDao().getUser(userId);
					user.setId(userId);
					/*
					System.out.println("|" + user.getId() + "|");
					System.out.println("|" + user.getLogin() + "|");
					System.out.println("|" + user.getCode() + "|");
					System.out.println("|" + user.getTypeId() + "|");
					System.out.println("|" + user.getPassword() + "|");
					System.out.println("|" + user.getEmail() + "|");
					System.out.println("|" + user.isActive() + "|");
					System.out.println("|" + user.getRealName() + "|");
					System.out.println("|" + user.getAge() + "|");
					System.out.println("|" + user.getAddress() + "|");
					System.out.println("|" + user.getPostalCode() + "|");
					System.out.println("|" + user.getPhone() + "|");
					System.out.println("|" + user.getPrimaryLanguage() + "|");
					System.out.println("|" + user.getSecondaryLanguage() + "|");
					*/
					// 2.- Properly set the userDTO-object wholly.
					userDTO = UserDTO.valueOf(login, code, typeId, password, email, active, 
							realName, address, postalCode, phone, primaryLanguage, 
							secondaryLanguage);
					
					userDTO.setId(userId);
					System.out.println("DTO |" + userDTO.getId() + "|");
					System.out.println("DTO |" + userDTO.getLogin() + "|");
					System.out.println("DTO |" + userDTO.getCode() + "|");
					System.out.println("DTO |" + userDTO.getTypeId() + "|");
					System.out.println("DTO |" + userDTO.getPassword() + "|");
					System.out.println("DTO |" + userDTO.getEmail() + "|");
					System.out.println("DTO |" + userDTO.isActive() + "|");
					System.out.println("DTO |" + userDTO.getRealName() + "|");
					// System.out.println("DTO |" + userDTO.getAge() + "|");
					System.out.println("DTO |" + userDTO.getAddress() + "|");
					System.out.println("DTO |" + userDTO.getPostalCode() + "|");
					System.out.println("DTO |" + userDTO.getPhone() + "|");
					System.out.println("DTO |" + userDTO.getPrimaryLanguage() + "|");
					System.out.println("DTO |" + userDTO.getSecondaryLanguage() + "|");
					
					/*
					userDTO.setId(userId);
					userDTO.setLogin(login);
					userDTO.setCode(code);
					userDTO.setTypeId(typeId);
					userDTO.setPassword(password);
					userDTO.setEmail(email);
					userDTO.setActive(active);
					userDTO.setRealName(realName);
					userDTO.setAge(age);
					userDTO.setAddress(address);
					userDTO.setPostalCode(postalCode);
					userDTO.setPhone(phone);
					userDTO.setPrimaryLanguage(primaryLanguage);
					userDTO.setSecondaryLanguage(secondaryLanguage);
					*/
					
					assertNotNull("userDTO-object not null", userDTO);

		
					// 3.- Transfer the userDTO to user-object.						
					user = buildUser(userDTO);
					
					
					System.out.println("|" + user.getId() + "|");
					System.out.println("|" + user.getLogin() + "|");
					System.out.println("|" + user.getCode() + "|");
					System.out.println("|" + user.getTypeId() + "|");
					System.out.println("|" + user.getPassword() + "|");
					System.out.println("|" + user.getEmail() + "|");
					System.out.println("|" + user.isActive() + "|");
					System.out.println("|" + user.getRealName() + "|");
					System.out.println("|" + user.getAge() + "|");
					System.out.println("|" + user.getAddress() + "|");
					System.out.println("|" + user.getPostalCode() + "|");
					System.out.println("|" + user.getPhone() + "|");
					System.out.println("|" + user.getPrimaryLanguage() + "|");
					System.out.println("|" + user.getSecondaryLanguage() + "|");
					
					assertNotNull("user-object not null", user);
					
					// 4.- Update the user in DB.
					daoManager.getUserDao().updateUserById(user);
	
					return user;
				}
			});
		} catch (DaoException e) {
			System.out.println("[RGP] [1] updateUser(): ServiceException will be thrown...");
			throw (new ServiceException(e));
		}
		
		System.out.println("[RGP] updateUser(): finished.");		
	}
	
	private User buildUser(final UserDTO userDTO) {
		User user = new User();
		int lang = 0;
		Language primary=null, secondary=null;		
		user.setId(userDTO.getId());
		user.setLogin(userDTO.getLogin());
		user.setCode(userDTO.getCode());
		user.setTypeId(userDTO.getTypeId());
		user.setPassword(userDTO.getPassword());
		user.setEmail(userDTO.getEmail());
		user.setActive(userDTO.isActive());
		user.setRealName(userDTO.getRealName());
		// user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setPhone(userDTO.getPhone());
		
		lang = userDTO.getPrimaryLanguage();
		primary = getLanguage(lang);					
		user.setPrimaryLanguage(primary);
		
		lang = userDTO.getSecondaryLanguage();
		secondary = getLanguage(lang);
		user.setSecondaryLanguage(secondary);
		
		return user;
	}
	
	@Ignore
	private Language getLanguage(int value) {
		Language lang = null;
		if (value == 1) lang = Language.ENGLISH;
		if (value == 2) lang = Language.FRENCH;
		return lang;
	}
	
	/*
	@Ignore
	private String dataGenerator(String datum, int length, String prefix) {
		String outcome = prefix + " ";
		if (datum == null || datum.equalsIgnoreCase("")) {
			
		} else {
			
		}
		
		return outcome;
		
	}
	*/

}
