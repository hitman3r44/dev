package com.loyauty.web.struts.action.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.model.User;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class EditTemplate  extends LoyautyAction{
	private static final long serialVersionUID = -6760458314007286079L;
	//GLOBAL VERIABLE
	private UserService userService;
	private HashMap<Long,ClientCategoryDTO> hashMapTemplate;
	//PROPERTIES
	@Getter @Setter
	private UserSessionDTO userSession;
	@Getter @Setter
	private ClientCategoryDTO templateToEdit;
	@Getter @Setter
	private Integer templateIndex;
	@Getter @Setter
	private Long templateId;
	@Getter @Setter
	private Double profitCoefficient;
	@Getter @Setter
	private Double unitSoldCoefficient;
	@Getter @Setter
	private Long findTemplateSignal;
	@Getter @Setter
	private Long saveTemplateSignal;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	@Getter @Setter
	private List<User> usersList;

	/*=======================================================================
	 							CONSTRUCTOR
	  =======================================================================*/
	public  EditTemplate() throws ServiceLocatorException {
		super();	
		userService = getServiceLocator().getUserService();
	}

	/*=======================================================================
	 						   METHODE: EXECUTE
	  =======================================================================*/
	@SuppressWarnings("unchecked")
	@Override  
	public String execute() throws Exception {
		System.out.println("I am at Edit Template");
		
		HttpSession session = request.getSession(true);
		try {
			//Get template List
			if(templateToEdit==null)templateToEdit=new ClientCategoryDTO(); 
			hashMapTemplate=(HashMap<Long,ClientCategoryDTO>)session.getAttribute("hashMapTemplate");
			listClientCategory=(List<ClientCategoryDTO>)session.getAttribute("listClientCategory");
			if(listClientCategory==null){
				listClientCategory=userService.getAllClientCategory();
				hashMapTemplate=getHashMapClientCategory(listClientCategory);
				session.setAttribute("listClientCategory",listClientCategory);
				session.setAttribute("hashMapTemplate",hashMapTemplate);
				return SUCCESS;
			}
			//Display template Selected
			ClientCategoryDTO template=hashMapTemplate.get(templateId);
			if(template!=null){
				listClientCategory=getListClientCategorySorted(hashMapTemplate,templateId);
				session.setAttribute("listClientCategory",listClientCategory);
			}
			//Find Template Selected
			if(findTemplateSignal!=null && findTemplateSignal!=0L){
				templateToEdit=hashMapTemplate.get(templateId);
				listClientCategory=getListClientCategorySorted(hashMapTemplate,templateId);
				session.setAttribute("listClientCategory",listClientCategory);
				return SUCCESS;
			}
			//Save Template Selected
			if(saveTemplateSignal!=null && saveTemplateSignal!=0){
				template=listClientCategory.get(0);
				templateToEdit.setClientCategoryId(template.getClientCategoryId());
				userService.updateTemplateCoeffitions(templateToEdit);
				listClientCategory=userService.getAllClientCategory();
				hashMapTemplate=getHashMapClientCategory(listClientCategory);
				listClientCategory=getListClientCategorySorted(hashMapTemplate,templateId);
				session.setAttribute("listClientCategory",listClientCategory);
				session.setAttribute("hashMapTemplate",hashMapTemplate);
				return SUCCESS;
			}
			return SUCCESS;
		} catch (Exception sx) {
			sx.printStackTrace();
		}

		return SUCCESS;
	}

	/*=======================================================================
	 				   METHODE: getListClientCategorySorted
	  =======================================================================*/
	public List<ClientCategoryDTO> getListClientCategorySorted(HashMap<Long,ClientCategoryDTO> hashMapTemplate,Long templateId){
		List<ClientCategoryDTO>result=new ArrayList<ClientCategoryDTO>();
		ClientCategoryDTO clcDTO=hashMapTemplate.get(templateId);
		result.add(clcDTO);
		for(ClientCategoryDTO item:hashMapTemplate.values()){
			if(item.getClientCategoryId()!=templateId)result.add(item);
		}	
		return result;
	}

	/*=======================================================================
	 				   METHODE: getHashMapClientCategory
	  =======================================================================*/
	public HashMap<Long,ClientCategoryDTO> getHashMapClientCategory(List<ClientCategoryDTO>list){
		HashMap<Long,ClientCategoryDTO>result=new HashMap<Long,ClientCategoryDTO>();		
		for(ClientCategoryDTO temp:list){
			result.put(temp.getClientCategoryId(), temp);
		}
		return result;
	}

}
