package com.loyauty.service.specification;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.loyauty.dao.core.DaoCommand;
import com.loyauty.dao.core.DaoManager;
import com.loyauty.dao.core.DaoManagerFactory;
import com.loyauty.enums.Language;
import com.loyauty.exception.DaoException;
import com.loyauty.exception.ServiceException;

import com.loyauty.model.Brand;
import com.loyauty.model.Category;
import com.loyauty.model.CategoryBrand;
import com.loyauty.model.Specification;
import com.loyauty.model.Translation;
import com.loyauty.model.TranslationEntry;
import com.loyauty.model.UserCategoryDiscount;
import com.loyauty.service.ServiceImpl;
import com.loyauty.service.core.DTOFactory;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.CategoryDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.sun.management.jmx.Trace;


public class SpecificationServiceImpl extends ServiceImpl implements SpecificationService {

	private static final Logger log = Logger.getLogger(SpecificationServiceImpl.class);
	
	@Setter 
	@Getter


	protected DaoManager daoManager;
	
	public SpecificationServiceImpl() {
		setDaoManager(DaoManagerFactory.getDaoManager());
	}



	@Override
	public void createSpecification(final SpecificationDTO dto) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(DaoManager daoManager)
							throws DaoException {
						
						//Name
						Translation translationName = new Translation();
						daoManager.getTranslationDao().insertTranslation(translationName);	
						//Eng Name
						TranslationEntry entryNameEng = new TranslationEntry(translationName.getId(), dto.getNameEng().getName() );
						entryNameEng.setLanguage(Language.ENGLISH);
						daoManager.getTranslationDao().insertEntry(entryNameEng);
						//Fr Name
						TranslationEntry entryNameFr = new TranslationEntry(translationName.getId(), dto.getNameFr().getName());
						entryNameFr.setLanguage(Language.FRENCH);
						daoManager.getTranslationDao().insertEntry(entryNameFr);
						
						Category category = new Category();
						category.setId(dto.getCategory().getId());
						
						Specification specification = new Specification();
						specification.setCategory(category);
						specification.setName(dto.getName());
						specification.setStatus(dto.getStatus());
						specification.setCreationDate(GregorianCalendar.getInstance().getTime());
						specification.setMain(dto.getMain());
						specification.setDescription(dto.getDescription());
						specification.setNameTranslation(translationName);
						
						daoManager.getSpecificationDao().insertEntity(specification);
												
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean specificationExist(final String name) throws ServiceException {
		Specification spe = null;
		try {
			spe = (Specification) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getSpecificationDao().getSpecificationByName(name);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}
		
		return spe != null;
	}
	

	@Override
	public SpecificationDTO getSpecification(final long specificationId) throws ServiceException {
		Specification spe = null;
		try {
			spe = (Specification) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getSpecificationDao().getEntity(specificationId);
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}

		return SpecificationDTO.valueOf(spe);
	}
	



	@Override
	public void editSpecification(final SpecificationDTO dto) throws ServiceException {
		try {
			daoManager.setCommitTransaction(true);
			daoManager.executeAndHandle(new DaoCommand() {
					@Override
					public Object execute(DaoManager daoManager)
							throws DaoException {
						
						//translation we propage
						Translation translation = new Translation();
						translation.setId(dto.getTranslationId());
						
						// Eng Entry Update
						TranslationEntry entryNameEng = new TranslationEntry(dto.getNameEng().getId(), dto.getNameEng().getName() );
						daoManager.getTranslationDao().updateEntry(entryNameEng);
						
						// Fr Entry Update
						TranslationEntry entryNameFr = new TranslationEntry(dto.getNameFr().getId(), dto.getNameFr().getName());
						daoManager.getTranslationDao().updateEntry(entryNameFr);
						
						Category category = new Category();
						category.setId(dto.getCategory().getId());
						
						Specification specification = new Specification();
						specification.setId(dto.getId());
						specification.setCategory(category);
						specification.setName(dto.getName());
						specification.setStatus(dto.getStatus());
						specification.setCreationDate(GregorianCalendar.getInstance().getTime());
						specification.setMain(dto.getMain());
						specification.setDescription(dto.getDescription());
						specification.setNameTranslation(translation);
						
						daoManager.getSpecificationDao().updateEntity(specification);
												
						return null;
						
					}
			});
		} catch (DaoException de) {
			throw (new ServiceException(de));
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<SpecificationDTO> getAllMainSpecification()
			throws ServiceException {
		List<Specification> list = null;
		try {
			list = (List<Specification>) daoManager.executeAndHandle(new DaoCommand() {
				@Override
				public Object execute(DaoManager daoManager) throws DaoException {
					return daoManager.getSpecificationDao().getAllEntities();
				}
			});
		} catch (DaoException e) {
			throw (new ServiceException(e));			
		}

		return DTOFactory.getSpecificationListDTO(list);
	}

}
