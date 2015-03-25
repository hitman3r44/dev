package com.loyauty.web.struts.action.sales;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.views.xslt.ArrayAdapter;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.service.core.dto.RectangularProductDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.user.UserService;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;
import com.loyauty.web.util.SeoUrlsMaker;

public class ClientSales   extends LoyautyAction{
	private static final long serialVersionUID = 8240353423713266885L;
	
	private ProductService productService;
	private UserService userService;

	private UserSessionDTO userSession;
	
	@Getter @Setter
	private String userLogin;
	@Getter @Setter
	private Integer init; 
	@Getter @Setter
	private Integer menuSelected;
	@Getter @Setter
	private  List<ProductDTO> userSalesProductList;
	@Getter @Setter
	private  List<RectangularProductDTO>rectangularProList;
	@Getter @Setter
	private  List<Integer> indexList;
	@Getter @Setter
	Integer sizeList;
	@Getter @Setter
	Integer currentPageIndex;
	@Getter @Setter
	Integer ITEMS_COUNT_IN_COLUMN=4;
	Integer COLUMNS_IN_PAGE=4;
	
	/*=========================================================================================
									Default constructor
	  =========================================================================================*/
	public ClientSales() throws ServiceLocatorException {
		super();	 
		productService = getServiceLocator().getProductService();
		userService = getServiceLocator().getUserService();
		rectangularProList=new ArrayList<RectangularProductDTO>();
		indexList=new ArrayList<Integer>();
	}

	/*=========================================================================================
 									method execute
  	  =========================================================================================*/
	@Override  
	public String execute() throws Exception {	
		HttpSession session = request.getSession(true);
		if(init==null)init=1;
		if(menuSelected==null)menuSelected=1;
		userSession=(UserSessionDTO)session.getAttribute(WebConstants.USER);
		userLogin="";
		currentPageIndex=(Integer)session.getAttribute("currentPageIndex");
		if(currentPageIndex==null)currentPageIndex=0;
		userSalesProductList=(List<ProductDTO>)session.getAttribute("userSalesProductList");
		if(userSalesProductList==null){
			userSalesProductList=productService.getSaleActiveByUserId(3L);
			session.setAttribute("userSalesProductList",userSalesProductList);
		}
		userSalesProductList=productService.getSaleActiveByUserId(3L);
		if(userSalesProductList==null)userSalesProductList=new ArrayList<ProductDTO>();
		rectangularProList=getSalesProductListLikeRectongular(userSalesProductList,ITEMS_COUNT_IN_COLUMN,COLUMNS_IN_PAGE);
		indexList=getPageIndexes(userSalesProductList.size());
		if(userSession!=null)userLogin=userSession.getLogin();
		SimpleDateFormat frm=new SimpleDateFormat("dd-MM-yyyy");	
		try{
			return SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
		
	}

	
	public List<RectangularProductDTO> getSalesProductListLikeRectongular(List<ProductDTO> userSalesProductList,Integer itemsInColumn, Integer columnInPage){
		List<RectangularProductDTO> result=new ArrayList<RectangularProductDTO>();
		RectangularProductDTO column=new RectangularProductDTO();
		int indexColumn=0;
		int pair=0;
		for(int i=0;i<userSalesProductList.size();i++){
			ProductDTO pDTO=userSalesProductList.get(i);
			pair=i%2;
			if(pair==0)pDTO.setCss("background:#F0F0F0;");
			pDTO.setHrefName(SeoUrlsMaker.getProductUrl(pDTO.getBrand().getName(), pDTO.getNameProduc(), pDTO.getId()));
			if((i % itemsInColumn)==0 ){
				column=new RectangularProductDTO();
				column.setIndex(indexColumn);
				column.getListProductDTO().add(pDTO);
				result.add(column);
				indexColumn++;
			}else{
				result.get(column.getIndex()).getListProductDTO().add(pDTO);
			}
		}
	  return result;
	}
	
	
	
	public List<Integer> getPageIndexes(Integer size){
		List<Integer> result=new ArrayList<Integer>();
		if(size==null)size=0;
		Integer nbPages=size/(ITEMS_COUNT_IN_COLUMN*COLUMNS_IN_PAGE);
		for(int i=1;i<nbPages+2;i++){
			result.add(i);
		}
		return result;
	}
	
	
	
	
}
