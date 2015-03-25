package com.loyauty.web.struts.action.brand;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import lombok.Getter;
import lombok.Setter;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.brand.BrandService;
import com.loyauty.service.common.CommonService;
import com.loyauty.service.core.dto.BrandDTO;
import com.loyauty.service.core.dto.UserSessionDTO;
import com.loyauty.web.WebConstants;
import com.loyauty.web.struts.action.LoyautyAction;

public class OurBrand  extends LoyautyAction {
	
	private static final long serialVersionUID = 3012891721334351297L;
	
	private static final long APPLE_GENETIC_BRAND_ID = 92L;
	private static final long APPLE_BRAND_ID = 69L;
		
	private CommonService commonService;
	private BrandService brandService;
	
	@Getter @Setter
	private List<BrandDTO>  apparelList;
	@Getter @Setter
	private String[] nameApparel;	
	@Getter @Setter
	private List<BrandDTO>  electronicsList;
	@Getter @Setter
	private String[] nameElectronics;	               
	@Getter @Setter
	private List<BrandDTO>  videoGameList;
	@Getter @Setter
	private String[] nameVG;	               
	@Getter @Setter
	private List<BrandDTO>  homeworksList;
	@Getter @Setter
	private String[] nameHW;	               
	@Getter @Setter
	private List<BrandDTO>  kitchenList;
	@Getter @Setter
	private String[] nameKitchen;	               
	@Getter @Setter
	private List<BrandDTO>  outdoorsList;
	@Getter @Setter
	private String[] nameOD;	               
	@Getter @Setter
	private List<BrandDTO>  sportsList;
	@Getter @Setter
	private String[] nameSports;	               
	@Getter @Setter
	private List<BrandDTO>  giftCardsList;
	@Getter @Setter
	private String[] nameGC;	               
	@Getter @Setter
	private List<BrandDTO>  childrenList;
	@Getter @Setter
	private String[] nameChildren;
	private UserSessionDTO userSession;
	
	public OurBrand () throws ServiceLocatorException  {
		super();	
		commonService = this.getServiceLocator().getCommonService();
		brandService = this.getServiceLocator().getBrandService();
	}
	
	@Override  
	public String execute() throws Exception {
		HttpSession session = request.getSession(true);
		
		userSession	=(UserSessionDTO)session.getAttribute(WebConstants.USER);

		apparelList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.APPAREL.getValue().longValue());
		apparelList=getBrandWithountHiddenEtems(apparelList);
		childrenList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.CHILDREN.getValue().longValue());
		childrenList=getBrandWithountHiddenEtems(childrenList);
		videoGameList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.VIDEO_GAMES.getValue().longValue());
		videoGameList=getBrandWithountHiddenEtems(videoGameList);
		homeworksList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.HOMEWORKS.getValue().longValue());
		homeworksList=getBrandWithountHiddenEtems(homeworksList);
		kitchenList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.KITCHEN.getValue().longValue());
		kitchenList=getBrandWithountHiddenEtems(kitchenList);
		outdoorsList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.OUTDOORS.getValue().longValue());
		outdoorsList=getBrandWithountHiddenEtems(outdoorsList);
		sportsList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.SPORT.getValue().longValue());
		sportsList=getBrandWithountHiddenEtems(sportsList);;
		giftCardsList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.GRIFT_CARDS.getValue().longValue());
		giftCardsList=getBrandWithountHiddenEtems(giftCardsList);
		electronicsList = brandService.getAllBrandByCategoryGroup(GroupCategoryEnum.ELECTRONICS.getValue().longValue());
		electronicsList=getBrandWithountHiddenEtems(electronicsList);
		
		nameApparel = getBrandNamesBeforeParsing(apparelList);
		nameChildren = getBrandNamesBeforeParsing(childrenList);
		nameElectronics = getBrandNamesBeforeParsing(electronicsList);
		nameGC = getBrandNamesBeforeParsing(giftCardsList);
		nameHW = getBrandNamesBeforeParsing(homeworksList);
		nameKitchen = getBrandNamesBeforeParsing(kitchenList);
		nameOD = getBrandNamesBeforeParsing(outdoorsList);
		nameSports = getBrandNamesBeforeParsing(sportsList);
		nameVG = getBrandNamesBeforeParsing(videoGameList);
		
		apparelList = parseBrandName(apparelList);
		childrenList = parseBrandName(childrenList);
		videoGameList = parseBrandName(videoGameList);
		homeworksList = parseBrandName(homeworksList);
		kitchenList = parseBrandName(kitchenList);
		outdoorsList = parseBrandName(outdoorsList);
		sportsList = parseBrandName(sportsList);
		giftCardsList = parseBrandName(giftCardsList);
		electronicsList = parseBrandName(electronicsList);
		
		return SUCCESS;
	}
	
	private List<BrandDTO> parseBrandName(List<BrandDTO> brandDTOList) {
		String brandName = "";
		long brandID = 0L;
		long brandIDToExclude = 0L;		
		if (request.getSession().getAttribute(WebConstants.USER) == null) {
			brandIDToExclude = APPLE_BRAND_ID;
		} else {
			brandIDToExclude = APPLE_GENETIC_BRAND_ID;
		}		
		List<BrandDTO> brandDTOListParsed = new ArrayList<BrandDTO>();
		for (BrandDTO brandDTO : brandDTOList) {
			brandName = brandDTO.getName();
			brandID = brandDTO.getId();						
			if (brandID != brandIDToExclude) {
				if (brandName != null) {
					if (brandName.contains("-")) {
						brandName = brandName.replace("-", "_");
					}
				}
				brandDTO.setName(brandName);
				brandDTOListParsed.add(brandDTO);
			}
			
		}		
		return brandDTOListParsed;
	}
	
	private String[] getBrandNamesBeforeParsing(List<BrandDTO> brandDTOList) {
		String[] brandName = new String[brandDTOList.size()];
		int count = 0;
		for (BrandDTO brandDTO : brandDTOList) {
			brandName[count] = brandDTO.getName();
			++count;		
		}
		return brandName;
	}
	
	public List<BrandDTO> getBrandWithountHiddenEtems(List<BrandDTO> list){
		List<BrandDTO>result=new ArrayList<BrandDTO>(); 
		for(BrandDTO brandDTO:list){
			if(brandDTO.getHide()==0 || userSession!=null)result.add(brandDTO);
		}
		return result;
	}
	
}
