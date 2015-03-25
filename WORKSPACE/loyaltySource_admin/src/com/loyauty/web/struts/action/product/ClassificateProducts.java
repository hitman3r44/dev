package com.loyauty.web.struts.action.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ClientCategoryDTO;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.struts.action.LoyautyAction;

public class ClassificateProducts extends LoyautyAction{
	private static final long serialVersionUID = -5162061504759408826L;

	private ProductService productService;
	private UserService userService;
	private HashMap<Long,ClientCategoryDTO> hashMapTemplate;
	@Getter @Setter
	private List<ClientCategoryDTO> listClientCategory; 
	@Getter @Setter
	private List<ProductDTO> productDTOList;
	@Getter @Setter
	private Long templateId;
	@Getter @Setter
	private String templateName;
	public  ClassificateProducts() throws ServiceLocatorException {
		super();	
		productService = getServiceLocator().getProductService();	
		userService = getServiceLocator().getUserService();	
	}

	@SuppressWarnings("unchecked")
	@Override  
	public String execute() throws Exception {
		HttpSession session = request.getSession(true);
		try {
			//========================== Get template List ======================
			hashMapTemplate=(HashMap<Long,ClientCategoryDTO>)session.getAttribute("hashMapTemplate");
			listClientCategory=(List<ClientCategoryDTO>)session.getAttribute("listClientCategory");
			if(listClientCategory==null){
				listClientCategory=userService.getAllClientCategory();
				hashMapTemplate=getHashMapClientCategory(listClientCategory);
				session.setAttribute("listClientCategory",listClientCategory);
				session.setAttribute("hashMapTemplate",hashMapTemplate);
				return SUCCESS;
			}
			if(templateId==null)templateId=0L;
			//Display template Selected
			ClientCategoryDTO template=hashMapTemplate.get(templateId);
			if(template!=null){
				listClientCategory=getListClientCategorySorted(hashMapTemplate,templateId);
				session.setAttribute("listClientCategory",listClientCategory);
			}
			//========================== Get Product list classification ===========
			productDTOList = productService.getProductsClassification(templateId);
			if(productDTOList==null)productDTOList=new  ArrayList<ProductDTO>();

			return SUCCESS;
		} catch (Exception x) {
			x.printStackTrace();
		}
		return INPUT;
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
