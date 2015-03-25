package com.loyauty.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.jsoup.Jsoup;

import com.loyauty.enums.GroupCategoryEnum;
import com.loyauty.exception.ServiceException;
import com.loyauty.exception.ServiceLocatorException;
import com.loyauty.service.ServiceLocator;
import com.loyauty.service.core.dto.ProductDTO;
import com.loyauty.service.core.dto.ProductModelDTO;
import com.loyauty.service.core.dto.ShippingTotalDTO;
import com.loyauty.service.core.dto.SpecificationDTO;
import com.loyauty.service.core.dto.UserProductPriceDTO;
import com.loyauty.service.product.ProductService;
import com.loyauty.service.specification.SpecificationService;

public class ProductCatalogGenXFR {
	
	private static final long REPORT_USER_ID = 32L;				// 'Carlton'
	private static final String REPORT_USER_CODE = "CG_";		// 'Carlton'
	
	private static final String FILE_SEPARATOR = "|";
	
	private static final int NUMBER_OF_PROVINCES = 13;
	
	private static ServiceLocator serviceLocator;
	private static ProductService productService;
	private static SpecificationService specificationService;
	
	public static void main(String[] args) {
		long productId = 0L;
		long userId = REPORT_USER_ID;
		
		List<ProductDTO> productDTOList = null;
		
		long groupId = 0L;
		String groupName = "";
		String categoryName = "";
		long specId = 0L;
		SpecificationDTO specDTO = null;
		String specName = "";
		String brandName = "";
		String productName = "";
		String desc = "";
		String spec = "";
		String other = "";
		String cost = "";
		String msrp = "";
		double msrpVal = 0d;
		String discount = "";
		double discountVal = 0d;
		String loyaltyProductId = "";
		String modelNumber = "";
		String weight = "";
		String length = "", l = "";
		String width = "", w = "";
		String height = "", h = "";
		String dimensions = "";
		String warranty = "";
		
		serviceLocator = ServiceLocator.getInstance();
		try {
			productService = serviceLocator.getProductService();
			specificationService = serviceLocator.getSpecificationService();
			
			File file = new File("C:\\ProductCatalog_Discount");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			// productDTOList = productService.getAllValidStatusProducts(userId);
			// productDTOList = productService.getValidProductsByUserIdAndExcluded(userId);
			
			 productDTOList = new ArrayList<ProductDTO>();
			
			long[] productIDArray = new long[] {
					6922L,
					6921L,
					5793L,
					5794L,
					5796L,
					5800L,
					5801L,
					5791L,
					5790L,
					5798L,
					5792L,
					5797L,
					6911L,
					6910L,
					6913L,
					6912L,
					6920L,
					6919L,
					6916L,
					6914L,
					6918L,
					6917L,
					5795L,
					5799L,
					5803L,
					5806L,
					5811L,
					5802L,
					5812L,
					5808L,
					5804L,
					5810L,
					5805L,
					5809L,
					5807L,
					5634L,
					5429L,
					5769L,
					5768L,
					5770L,
					5424L,
					5771L,
					5767L,
					5425L,
					5774L,
					5428L,
					5782L,
					5773L,
					5434L,
					5776L,
					5775L,
					5781L,
					5772L,
					5426L,
					5427L,
					5780L,
					5779L,
					5778L,
					5431L,
					5777L,
					5433L,
					6772L,
					6771L,
					5432L,
					5449L,
					5450L,
					5439L,
					5452L,
					5441L,
					5442L,
					5435L,
					5440L,
					6314L,
					5465L,
					5444L,
					5443L,
					6315L,
					5445L,
					6313L,
					6312L,
					5451L,
					5453L,
					6278L,
					5438L,
					5437L,
					5459L,
					5460L,
					5457L,
					6286L,
					6310L,
					6308L,
					5461L,
					6320L,
					6368L,
					5463L,
					6321L,
					5462L,
					5464L,
					6281L,
					6780L,
					6781L,
					6443L,
					6440L,
					6437L,
					6435L,
					6449L,
					6452L,
					6450L,
					6441L,
					6447L,
					6446L,
					6465L,
					6466L,
					6454L,
					6455L,
					6456L,
					6457L,
					6468L,
					6467L,
					6462L,
					5504L,
					5501L,
					6217L,
					6967L,
					5500L,
					5499L,
					6207L,
					6970L,
					6359L,
					6360L,
					5503L,
					6353L,
					5532L,
					5531L,
					5529L,
					5530L,
					6339L,
					5518L,
					5517L,
					5523L,
					5522L,
					5521L,
					5520L,
					5519L,
					6220L,
					6774L,
					5512L,
					5513L,
					5510L,
					5509L,
					6925L,
					5506L,
					6968L,
					5525L,
					6080L,
					5527L,
					5528L,
					5526L,
					6221L,
					6126L,
					6820L,
					6309L,
					6307L,
					6311L,
					6247L,
					6306L,
					6125L,
					6305L,
					6127L,
					6128L,
					6129L,
					6130L,
					6223L,
					6212L,
					6213L,
					6242L,
					6832L,
					6228L,
					6227L,
					6230L,
					6229L,
					6267L,
					6266L,
					6268L,
					6270L,
					6269L,
					6271L,
					6302L,
					6068L,
					6966L,
					6237L,
					6954L,
					6225L,
					6226L,
					6214L,
					6952L,
					6958L,
					6957L,
					6243L,
					6238L,
					6239L,
					6240L,
					6241L,
					6536L,
					6255L,
					6258L,
					6256L,
					6259L,
					6257L,
					6260L,
					6249L,
					6252L,
					6250L,
					6253L,
					6251L,
					6254L,
					6285L,
					6273L,
					6111L,
					6071L,
					6809L,
					6701L,
					6702L,
					6110L,
					5712L,
					5713L,
					5714L,
					5715L,
					6201L,
					6756L,
					6757L,
					6202L,
					5716L,
					5717L,
					6758L,
					6199L,
					6760L,
					6761L,
					6759L,
					6200L,
					6962L,
					6075L,
					6074L,
					6076L,
					6079L,
					6073L,
					6072L,
					6208L,
					6209L,
					6800L,
					6801L,
					6802L,
					6803L,
					6210L,
					6211L,
					6078L,
					6077L,
					6159L,
					6158L,
					6151L,
					6915L,
					6297L,
					6295L,
					6152L,
					6289L,
					6081L,
					6153L,
					6948L,
					6951L,
					6198L,
					6119L,
					6290L,
					6124L,
					6120L,
					6121L,
					6946L,
					6947L,
					6949L,
					6303L,
					6304L,
					6317L,
					6318L,
					6319L,
					6950L,
					6964L,
					6196L,
					6195L,
					6116L,
					6114L,
					6113L,
					6115L,
					6902L,
					6901L,
					6261L,
					6262L,
					6263L,
					5674L,
					6157L,
					6155L,
					6117L,
					5766L,
					6131L,
					6132L,
					6135L,
					6136L,
					6133L,
					6134L,
					6137L,
					6139L,
					6287L,
					6288L,
					6161L,
					6291L,
					6162L,
					6163L,
					6292L,
					6293L,
					6839L,
					6838L,
					6160L,
					6164L,
					6167L,
					6166L,
					6165L,
					6906L,
					6926L,
					6096L,
					6274L,
					6098L,
					6218L,
					6931L,
					6097L,
					6246L,
					6245L,
					6156L,
					6154L,
					6099L,
					6100L,
					6107L,
					6279L,
					6108L,
					6280L,
					6102L,
					6283L,
					6282L,
					6103L,
					6284L,
					6106L,
					6940L,
					6929L,
					6944L,
					6932L,
					6938L,
					6937L,
					6831L,
					6939L,
					6945L,
					6840L,
					6941L,
					6934L,
					6942L,
					6933L,
					6935L,
					6943L,
					6936L,
					6277L,
					6142L,
					6276L,
					6235L,
					5663L,
					6234L,
					5662L,
					6573L,
					6576L,
					6574L,
					6578L,
					6580L,
					6579L,
					6585L,
					6584L,
					6583L,
					6589L,
					6588L,
					6587L,
					6300L,
					6298L,
					6299L,
					6301L,
					6907L,
					6088L,
					6082L,
					6090L,
					6085L,
					6093L,
					6084L,
					6083L,
					6092L,
					6091L,
					6094L,
					6087L,
					6086L,
					6089L,
					6095L,
					6965L,
					4802L,
					4833L,
					4834L,
					4898L,
					4899L,
					6224L,
					6930L,
					6650L,
					6647L,
					6649L,
					4835L,
					6669L,
					5958L,
					4895L,
					6528L,
					4927L,
					4928L,
					4929L,
					4930L,
					4925L,
					4926L,
					4931L,
					4933L,
					4932L,
					4903L,
					6724L,
					4936L,
					4935L,
					6611L,
					5763L,
					5070L,
					5071L,
					6520L,
					6525L,
					6517L,
					6524L,
					6531L,
					6523L,
					4971L,
					4758L,
					4829L,
					4757L,
					6675L,
					6673L,
					6671L,
					6203L,
					6204L,
					6206L,
					6205L,
					5950L,
					4894L,
					6608L,
					6744L,
					4977L,
					4978L,
					4981L,
					4979L,
					4980L,
					4973L,
					4976L,
					4974L,
					4975L,
					4972L,
					4982L,
					6837L,
					6834L,
					6833L,
					6835L,
					6836L,
					6814L,
					6815L,
					6813L,
					6816L,
					6817L,
					6818L,
					4877L,
					4882L,
					4881L,
					4880L,
					6773L,
					6776L,
					6775L,
					4878L,
					4891L,
					6055L,
					6058L,
					6056L,
					6060L,
					6401L,
					6057L,
					6059L,
					6923L,
					5983L,
					5982L,
					6067L,
					4879L,
					6400L,
					6397L,
					6643L,
					6745L,
					5826L,
					4863L,
					4862L,
					4864L,
					5980L,
					5981L,
					5975L,
					6491L,
					6424L,
					6493L,
					6495L,
					4869L,
					4870L,
					6904L,
					6905L,
					4859L,
					4858L,
					4857L,
					4868L,
					4867L,
					5977L,
					5976L,
					5978L,
					4855L,
					4856L,
					5979L,
					6799L,
					6499L,
					6498L,
					4873L,
					5822L,
					5821L,
					4874L,
					5824L,
					5823L,
					4876L,
					4875L,
					6366L,
					6606L,
					6601L,
					4909L,
					4948L,
					4952L,
					6729L,
					5013L,
					6830L,
					6828L,
					6829L,
					6826L,
					6821L,
					6822L,
					6825L,
					6824L,
					6819L,
					6827L,
					6823L,
					5024L,
					5020L,
					5021L,
					5022L,
					5023L,
					5092L,
					5090L,
					4767L,
					4959L,
					4955L,
					4957L,
					4960L,
					4962L,
					4963L,
					4961L,
					4956L,
					4958L,
					4954L,
					6652L,
					6651L,
					4836L,
					6604L,
					5945L,
					5947L,
					5946L,
					4965L,
					6148L,
					6407L,
					6409L,
					6955L,
					5404L,
					5405L,
					6219L,
					6189L,
					6178L,
					6145L,
					6177L,
					6147L,
					6186L,
					6187L,
					6190L,
					6963L,
					6188L,
					6191L,
					6149L,
					6181L,
					6179L,
					6180L,
					6182L,
					6184L,
					6185L,
					6192L,
					6193L,
					6183L,
					6553L,
					6222L,
					5669L,
					5670L,
					5814L,
					5680L,
					5171L,
					6173L,
					6171L,
					5999L,
					5997L,
					6175L,
					6172L,
					6061L,
					6062L,
					6064L,
					6063L,
					6066L,
					6065L,
					5374L,
					6639L,
					6638L,
					6876L,
					6871L,
					6874L,
					6872L,
					6870L,
					6868L,
					6866L,
					6864L,
					6862L,
					6855L,
					6853L,
					6861L,
					6857L,
					6854L,
					6879L,
					6880L,
					6863L,
					6856L,
					6865L,
					6860L,
					6858L,
					6875L,
					6867L,
					6869L,
					6873L,
					6886L,
					6884L,
					6883L,
					6887L,
					6881L,
					6877L,
					6882L,
					6890L,
					6889L,
					6888L,
					6891L,
					6885L,
					6895L,
					6894L,
					6896L,
					6897L,
					6893L,
					6892L,
					6878L,
					6847L,
					6845L,
					6842L,
					6841L,
					6844L,
					6849L,
					6846L,
					6851L,
					6852L,
					6843L,
					6848L,
					6850L};
			
			
			for (long pID : productIDArray) {
				productDTOList.add(productService.getProductInformation(pID, null));
			}
			
						
			for (ProductDTO productDTO : productDTOList) {
				
				// PRODUCT-ID
				productId = productDTO.getId();
				out.write(productId + FILE_SEPARATOR);
				
				// GROUP-NAME.
				groupId = productDTO.getCategory().getCategoryGoupeId();
				groupName = groupId >= 1L
							? GroupCategoryEnum.values()[((int) groupId) - 1].getCode()
							: "";
				out.write(groupName + FILE_SEPARATOR);
				
				// CATEGORY-NAME.
				categoryName = productDTO.getCategory().getName();
				out.write(categoryName + FILE_SEPARATOR);
				
				// MAIN-SPECIFICATION-NAME.
				specId = productDTO.getMainFilterTypeId();
				specDTO = specificationService.getSpecification(specId);
				specName = specDTO.getName();
				out.write(specName + FILE_SEPARATOR);
				
				// BRAND-NAME.
				if (productDTO.getBrand() != null) {
					brandName = productDTO.getBrand().getName();
				}
				out.write(brandName + FILE_SEPARATOR);
				
				// PRODUCT TITLE.
				productName = productDTO.getNameFr().getName();
				out.write(productName + FILE_SEPARATOR);
				
				// LARGE-IMAGE LINK
				String imageLargeLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageLargeLink = "http://loyaltysource.com/media/product/large/" 
									+ productDTO.getImage().getName();
					}
				}
				out.write(imageLargeLink + FILE_SEPARATOR);
				
				// THUMBNAIL-IMAGE LINK				
				String imageThumbnailLink = "";
				if (productDTO.getImage() != null) {
					if (productDTO.getImage().getRealName() != null) {
						imageThumbnailLink = "http://loyaltysource.com/media/product/thumbnail/"
									+ productDTO.getImage().getName();
					}
				}
				out.write(imageThumbnailLink + FILE_SEPARATOR);
				
				// PRODUCT DESCRIPTION.
				desc = productDTO.getDescriptionFr().getName();
				desc = html2text(desc);
				out.write(desc.replaceAll("\n", "")
						.replaceAll("\t", "")
						.replaceAll("\r", "")
						.replaceAll("\n\t", "")
						.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
				// PRODUCT SPECIFICATION.
				spec = productDTO.getSpecificationFr().getName();
				spec = html2text(spec);
				out.write(spec.replaceAll("\n", "")
						.replaceAll("\t", "")
						.replaceAll("\r", "")
						.replaceAll("\n\t", "")
						.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
				// PRODUCT OTHER.
				other = productDTO.getOtherFr().getName();
				other = html2text(other);
				out.write(other.replaceAll("\n", "")
								.replaceAll("\t", "")
								.replaceAll("\r", "")
								.replaceAll("\n\t", "")
								.replaceAll("\n\r", "") + FILE_SEPARATOR);
				
				// COST.
				UserProductPriceDTO uppDTO = productService.getUserProductPriceInformation(productDTO.getId(), userId);
				cost = uppDTO.getPrice();
				double priceVal = 0d;				
				if (cost != null) {
					if (!cost.matches("^\\s*$") && !cost.equalsIgnoreCase("")) {	
						priceVal = Double.parseDouble(cost);
						cost = "$" + format(priceVal, "#,###.00", "en", "US");
					} else {
						priceVal = 0d;
						cost = "0.00";
					}
					if (cost.equalsIgnoreCase(".00")) {
						cost = "0.00";
					}
				}
				out.write(cost + FILE_SEPARATOR);
				
				// MSRP & DISCOUNT [IN DOLLARDS ($$$)].
				msrp = productDTO.getMsrp();
				discount = "";
				msrpVal = 0d;
				discountVal = 0d;
				
				if (msrp != null) {
					if (!msrp.matches("^\\s*$") && !msrp.equalsIgnoreCase("")) {
						msrpVal = Double.parseDouble(msrp);
						msrp = "$" + format(msrpVal, "#,###.00", "en", "US");
						discountVal = msrpVal - priceVal;
						discount = (discountVal != 0d) ? ("$" + format(discountVal, "#,###.00", "en", "US")) : "";
					} else {
						discount = "";
						msrp = "";
					}
					if (msrp.equalsIgnoreCase(".00")) {
						msrp = "$0.00";
					}
					if (discount.equalsIgnoreCase(".00")) {
						discount = "$0.00";
					}
				}
				out.write(msrp + FILE_SEPARATOR + discount + FILE_SEPARATOR);
				
				// LS-PRODUCT ID.
				loyaltyProductId = REPORT_USER_CODE + productDTO.getLoyaltyProductId();
				out.write(loyaltyProductId + FILE_SEPARATOR);				
				
				// MODEL NUMBER.
				if(productDTO.getManufactureProductList().size() >= 1) {
					modelNumber = ((ProductModelDTO)productDTO.getManufactureProductList().get(0)).getName();
				}
				out.write(modelNumber + FILE_SEPARATOR);
				
				// SHIPPING WEIGHT.
				weight = productDTO.getWeight();
				if (weight != null) {
					weight = (!weight.matches("^\\s*$")) ? String.valueOf(weight) : "0";
				} else {
					weight = "0";
				}
				out.write(weight + FILE_SEPARATOR);
				
				// SHIPPING SIZE - DIMENSIONS [WIDTH X LENGTH X HEIGHT].
				width = productDTO.getWidth();	w = (!width.equalsIgnoreCase("0")) ? String.valueOf(width) : "";
				length = productDTO.getLarge();	l = (!length.equalsIgnoreCase("0")) ? String.valueOf(length) : "";	
				height = productDTO.getHigh();	h = (!height.equalsIgnoreCase("0"))  ? String.valueOf(height)  : "";
				dimensions = w + " X " + l + " X " + h;
				out.write(dimensions + FILE_SEPARATOR);
				
				// PRODUCT WARRANTY.
				warranty = (productDTO.getWarrantyEng() != null) ? productDTO.getWarrantyEng().getName() : "";
				out.write(warranty + FILE_SEPARATOR);
				
				// ESTIMATED-SHIPPING-RATE - EVERY PROVINCE.
				String estimatedShippingRateByEveryProvinces = getEstimatedShippingRateFinalString(productId, userId);
				out.write(estimatedShippingRateByEveryProvinces);
				
				//  ESTIMATED-SHIPPING-RATE - CANADA TOTAL.
				UserProductPriceDTO userProductPriceDTO = productService.getUserProductPriceInformation(productId, userId);
				String estimatedShippingRateCANADA = userProductPriceDTO.getShippingTotalCanada();				

				System.out.println("[RGP] [Shipping Calc.] productID = " + productId + " on userId = " + userId);				
				if (estimatedShippingRateCANADA == null) {
					estimatedShippingRateCANADA = "NOT AVAILABLE";
				}

				out.write(estimatedShippingRateCANADA);
				
				out.write("\n");
			}
			
			out.flush();
			out.close();			
			
		} catch (IOException iox) {
			iox.printStackTrace();			
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String format(double value, String pattern, String language, String country) {
		Locale loc = new Locale(language, country);
		NumberFormat nf = NumberFormat.getInstance(loc);
		DecimalFormat df = (DecimalFormat) nf;
		df.applyPattern(pattern);
		return nf.format(value);
	}
	
	private static String getEstimatedShippingRateFinalString(long productId, long userId) throws ServiceLocatorException {
		String outcome = "";
		try {
			productService = serviceLocator.getProductService();
			List<ShippingTotalDTO> shippingTotalDTOList = productService.getShippingTotalList(productId, userId);
			if (shippingTotalDTOList == null || shippingTotalDTOList.size() == 0) {
				outcome = getEmptyFileSeparatorString();
			} else {
				for (ShippingTotalDTO shippingTotalDTO : shippingTotalDTOList) {
					outcome += shippingTotalDTO.getAverageShippingTotal() + FILE_SEPARATOR;
				}
			}
		} catch (ServiceLocatorException slx) {
			slx.printStackTrace();
		} catch (ServiceException sx) {
			sx.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		}
		return outcome;
	}
	
	private static String getEmptyFileSeparatorString() {
		String outcome = "";
		for (int times=0; times < NUMBER_OF_PROVINCES; times++) {
			outcome += FILE_SEPARATOR;
		}
		return outcome;
		
	}
	
    private static String html2text(String html) {
        return Jsoup.parse(html).text();
    }

	
}