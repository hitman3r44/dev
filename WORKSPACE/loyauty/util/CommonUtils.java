package com.loyauty.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.apache.log4j.Logger;



import com.loyauty.exception.ServiceException;

import com.loyauty.model.LoyaltyEnum;


import com.loyauty.service.core.dto.CommonDTO;
import com.loyauty.util.constant.BackEndConstants;
import com.loyauty.util.text.StringUtils;


/**
 * Common utilities.
 * 
 *
 */
public final class CommonUtils {
	private CommonUtils(){}
	
	/**
	 * Returns enum from Integer Value.
	 * check up {@link GamejabEnum} the common interface to 
	 * all enums in Gamejab.
	 * 
	 * @param elements
	 * @param value
	 * @return
	 */
	public static LoyaltyEnum enumFromValue(LoyaltyEnum[] elements, Integer value){
		LoyaltyEnum returnValue = null;
		
		for(LoyaltyEnum myEnum:elements){
			if(myEnum.getValue().equals(value)){
				returnValue = myEnum;
				break;
			}
		}
		
		return returnValue;
	}
	
	public static String normalizeImageName(String imageName){
		return  StringUtils.stripToAlphanumeric(imageName.replaceAll(" ", "_"), '_').toLowerCase();
	}
	
	public static String getNormalizedProductImage(String imgName){
		
		String[] splitName = imgName.split("\\.");
		String name = StringUtils.cleanQueryFromSpecialChars(splitName[0]);
		
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append("_");
		builder.append(new Date().getTime());
		return normalizeImageName(builder.toString() ) + "." + splitName[1].toLowerCase();
	}

	public static String getNormalizedBrandImage(String imgName){
		
		String[] splitName = imgName.split("\\.");
		String name = StringUtils.cleanQueryFromSpecialChars(splitName[0]);
		
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append("_");
		builder.append(new Date().getTime());
		return normalizeImageName(builder.toString() ) + "." + splitName[1].toLowerCase();
	}

	
	
	private static String getNormalizedLogo(String gameName,long userID, long gameID,String fileExtension){
		StringBuilder builder = new StringBuilder();
		builder.append(gameID);
		builder.append("_");
		builder.append(userID); 
		builder.append("_");
		//builder.append(new Date().getTime());
		builder.append(gameName.toLowerCase());
		builder.append("_");
		return normalizeImageName(builder.toString() ) + "." +fileExtension.toLowerCase();
	}

	public static String getNormalizedLogo(String realName,long userID, long gameID){
		String[] split = CommonUtils.splitNameFile(realName);
		return getNormalizedLogo(split[0],userID, gameID, split[1]);
	}

	public static String getNormalizedTeam(String realName,String teamName){
		String[] split = CommonUtils.splitNameFile(realName);
		return teamName.replace(' ', '_').toLowerCase()+"."+ split[1];	
	}	
	
	public static String getNormalizedProfile(String realName,String login,long userId){
		String[] split = CommonUtils.splitNameFile(realName);
		StringBuilder builder = new StringBuilder();
		builder.append(login); 		
		builder.append("_");
		builder.append(userId);
		builder.append(".");
		builder.append(split[1]); 		
		return builder.toString();
	}	
	
	/**
	 * Simply checks if a String is null or
	 * empty.
	 * @param s
	 * @return
	 */
	public static boolean isValidString(String s){
		return (s != null && s.trim().length() > 0);
	}
	
	/**
	 * Print the message if the logger is enabled in the application server
	 * @param log
	 * @param message
	 */
	public static void logMessage (Logger log, Object message){
		if(log.isDebugEnabled()){
			log.debug(message);
		}
	}
	
	/**
	 * String[0] = name
	 * String[1] = ext
	 * @param name
	 * @return
	 */
	public static String[] splitNameFile(String name) {
		String[] file = new String[2];
		StringTokenizer tokenizer = new StringTokenizer(name, ".");
		file[0] = tokenizer.nextToken();
		file[1] = tokenizer.nextToken();
		return file;
	}
	
	
	/**
	 * @param <T1>
	 * @param <T2>
	 * @param <T>
	 * @param <T>
	 * method for all Autocomplete
	 * 
	 */

	@SuppressWarnings("unchecked")
	public static <K, V, L, M> Map<K, V> autocompleterFormat(K query, List<L> suggestion, List<M> data) {
		
		Map<K, V> jsonResponse = new HashMap<K, V>(); 
		
		jsonResponse.put((K) "query", (V) query);
		jsonResponse.put((K) "suggestions", (V) suggestion);
		jsonResponse.put((K) "data", (V) data);
		
		return jsonResponse;
	}
	
	public static  Map<String,String> autocompleterFormatString(String query, String suggestion, String data) {
		
		Map<String, String> jsonResponse = new HashMap<String, String>(); 
		
		jsonResponse.put("query", query);
		jsonResponse.put("suggestions", suggestion);
		jsonResponse.put("data", data);
		
		return jsonResponse;
	}
	
	/**
	 * Day list [1..31] 
	 * static method
	 * 
	 */
	public static List<Integer> getDayList() {
		
		List<Integer> days = new ArrayList<Integer>();
				
		for(int i=1; i<=31; i++){
			days.add(i);			
		}
		return days;
	}
	
	/**
	 * Day list [1..31] 
	 * static method
	 * 
	 */
	public static List<Integer> getLimitList() {
		
		List<Integer> limits = new ArrayList<Integer>();
		limits.add(100);
		limits.add(500);
		limits.add(1000);
		limits.add(2000);
		limits.add(5000);
		limits.add(10000);
		
		return limits;
	}
	
	/**
	 * year list [ 2010, 2009 ....] 
	 * @param 
	 * @return
	 */
	public static List<Integer> getYearList() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());	
		int now = calendar.get(Calendar.YEAR);
		
		List<Integer> years = new ArrayList<Integer>();
		now += 2; // this years and 2 up
		for(int i=now; i>= BackEndConstants.MIN_YEAR; i--){
			years.add(i);
		}
		
		return years;		
	}
	
	/**
	 * get score list [ 100, 95 .... 0]
	 * pas =  SCORE_PITCH_VALUE
	 * @param 
	 * @return
	 */
	public static List<Integer> getScoreList() {
		
		List<Integer> score = new ArrayList<Integer>();
		
		for(int i=BackEndConstants.SCORE_MAX_VALUE; i>= BackEndConstants.SCORE_MIN_VALUE; i -= BackEndConstants.SCORE_PITCH_VALUE){
			score.add(i);
		}
		
		return score;		
	}
	
	/**
	 * get score list [ 100, 95 .... 0]
	 * pas =  SCORE_PITCH_VALUE
	 * @param 
	 * @return
	 */
	public static List<Integer> getNumberDiscList() {
		
		List<Integer> numberDisc = new ArrayList<Integer>();
		
		for(int i=BackEndConstants.DISC_NUMBER_MAX; i>= BackEndConstants.DISC_NUMBER_MIN; i--){
			numberDisc.add(i);
		}		
		return numberDisc;		
	}
	
	/**
	 * splits the url: the cases www.ign.com or ps3.ign.com will take ign.com as  string 
	 * @param url
	 * @return
	 */
	public static String splitUrl(URL url){
		String[] split = url.getHost().toLowerCase().split("\\.");
		int length=split.length;
		//System.out.print(length+"-");
		if (length>1) {
			return split[length-2]+"."+split[length-1];
		}
		return split[length-1];
	}
	
	
	/**
	 * check the cases www.ign.com and ps3.ign.com to decide if the url exists
	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean isSameUrls(URL first, URL second){
		String one=CommonUtils.splitUrl(first);
		String two=CommonUtils.splitUrl(second);
		return one.equals(two);		
	}
	
	/**
	 * True if ALL occurrences of the substrings are in the string otherwise false
	 * 
	 * @param subStrings
	 *            Set <String>
	 * @param string
	 * @return
	 */
	public static boolean indexofSubStrings(Set<String> subStrings, String string) {
		if (subStrings.size() == 0) {
			return false;
		}
		// TODO System.out.println
		for (String entry : subStrings) {
			if (string.toLowerCase().indexOf(entry.toLowerCase()) == -1)
				return false;
		}
		return true;
	}
	public static boolean indexofSubStrings(String [] subStrings, String string) {
		if (subStrings.length == 0) {
			return false;
		}
		//System.out.println("principal----"+string);
		for (String entry : subStrings) {
			//System.out.println("matched----"+entry);
			//System.out.println("toLowerCase----:"+string.toLowerCase().indexOf(entry.toLowerCase()));
			if (string.toLowerCase().indexOf(entry.toLowerCase()) == -1)
				return false;
		}
		return true;
	}
	
	
	/**
	 * Analyze the url
	 * @param link
	 * @return
	 * @throws MalformedURLException
	 */
	public static String urlAnalysis(String link,boolean openConnection) throws MalformedURLException {
		if (!link.toLowerCase().startsWith(BackEndConstants.HTTP)) {
			// link=HTTP+link;
			throw new MalformedURLException("URL MALFORMED (Missing HTTP):"+ link);
		}
		if (!isURL(link,openConnection)) {
			throw new MalformedURLException("URL MALFORMED:" + link);
		}
		return link;
	}	
	
	/**
	 * Validate if the URL is  Malformed 
	 * @throws ServiceException
	 */
	public static boolean isURL(String sourceUrl, boolean openConnection) {
		String urlLink = sourceUrl;
		if (!sourceUrl.toLowerCase().startsWith(BackEndConstants.HTTP)) {
			urlLink = BackEndConstants.HTTP + sourceUrl;
		}
/*		URL url = null;
		try {
			url=new URL(urlLink);
			if (openConnection)
				url.openStream();			
			return true; 
		} 
		catch (MalformedURLException e) { } 
		catch (IOException e) { }*/
		
		return urlLink.matches(BackEndConstants.URLPATTERN);
	}	
	
	
	public static String characterStripper(String string, String pattern){
		return string.replaceAll(pattern, "");
	}

	public static String characterStripper(String string, String pattern,String replace){
		return string.replaceAll(pattern, replace);
	}
	public static String HtmlTagsStripper(String string){
		String resultat = string.replaceAll(BackEndConstants.REMOVE_HTML_TAGS,"");
		return	resultat.replaceAll("\\[[0-9]*\\]", "");
	}
	//best way to trip string from html tag
	public static String HtmlTagsStrippeSpaces(String html) {
		String resultat = html.replaceAll(BackEndConstants.REMOVE_HTML_TAGS,"");
		resultat = resultat.trim().replaceAll("&nbsp;|\\n|\\t", "");
	    return resultat;
	}

	
	public static String normalizeDescription(String string){
		string = string.replace('`', '\'');
		string =string.replaceAll("”", "\"");
		string =string.replaceAll("“", "\"");
		//string =string.replace('Â™', 'â„¢');
		string =string.replaceAll("—", "-");
		string =string.replaceAll("‘", "'");
		string =string.replaceAll("’", "'");
		string =string.replace('\'', '\'');		
		string =string.replaceAll("–", "-");
		string =string.replaceAll("â€”", "-");
		string =string.replaceAll("â€\"", "-");
		string =string.replaceAll("\\?s", "'s");
		string =string.replaceAll("\\?S", "'S");
		string =string.replaceAll("Â®", "®");	
		string =string.replaceAll("â®", "®");
		string=CommonUtils.HtmlHrefTagsStripper(string);
		return string;
	}
	public static String normalizeNotWantedDescription(String string){
		//this is a gamespot not wanted string
		string = string.replaceAll("Read and Post Comments", "");
		string = string.replaceAll("|", "");
		string = string.replaceAll("Get the full article at GameSpot", "");
		return string;
	}
	

	public static Date normalizeUpcommingDate(int year, int month , int day){
		Date date =null;
		if(day != 0){
			date = new GregorianCalendar(year, month-1, day).getTime();
		}else if (month != 0){ 
				int maxDay = getLastDayOfMonth(year,  month);
				date = new GregorianCalendar(year, month, maxDay).getTime();
		}else{			
			date = new GregorianCalendar(year, 12, 31).getTime();
		}
		return date;
	}	
	
	public static int getLastDayOfMonth(int year, int theMonth){
		
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(year, theMonth, 1);
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return maxDay;
	}
	
		/**
	 * True if one of the substring occurs in string
	 * @param subStrings
	 * @param string
	 * @return
	 */
	public static boolean ocurrenceSubString(Set<String> subStrings, String string) {
		if (subStrings.size() == 0) {
			return false;
		}
		// TODO System.out.println
		for (String entry : subStrings) {
			if (string.toLowerCase().indexOf(entry.toLowerCase()) != -1){
				//System.out.println("TRUE TRUE: " + string +"--------" + entry); 
				return true;
			}
		}
		//System.out.println("FALSE FALSE");
		return false;
	}
		
	public static boolean isValidEmail( String email ){
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		boolean valid = m.matches();
		return valid;	
	}
	

	/**
	 * Used in search game by name to add like % to find the game by name
	 * 
	 * 
	 * @param searchString
	 * @param searchField
	 * @return
	 */
	@SuppressWarnings("unused")
	public static String createSearchString(String searchString,
			String searchField) {
		StringBuffer bufferStr = new StringBuffer();
		StringTokenizer st = new StringTokenizer(searchString);

		int count = 0;
		while (st.hasMoreTokens()) {

			if (count > 0) {
				bufferStr.append(" and ");
			}

			bufferStr.append(searchField + " like '%"
					+ st.nextToken().toLowerCase() + "%'");
			++count;
		}
		return (bufferStr.toString());
	}
	
	/**
	 * write url profile error message
	 * 
	 */
	public static String writeHTMLUrlProfileMessage(String globalMsg, Set<String> message){
		
		StringBuilder sb = new StringBuilder( globalMsg );
		sb.append("<ul>");	
		if( message != null){
			for( String msg : message){
				sb.append("<li>");
				sb.append(msg);
				sb.append("</li>");			
			}
		}
		sb.append("</ul>");		
		return sb.toString();
		
	}
	
	/**
	 * write url profile error message
	 * 
	 */
	public static String writeTEXTUrlProfileMessage(String globalMsg, Set<String> message){
		
		StringBuilder sb = new StringBuilder( globalMsg );
		sb.append("\t");	
		for( String msg : message){
			sb.append("- ");
			sb.append(msg);	
			sb.append("\n");	
		}	

		return sb.toString();
		
	}
	
	
	/**
	 * - tout ce qui est lien <a></a>
	  +- [edit] [1] [2] etc tout ce qui est entre crochet (fréquent sur wikipedia)
	 * @param string
	 * @return
	 */
	public static String HtmlHrefTagsStripper(String string){
		//<a title=\"90th Infantry Division (United States)\" href=\"http://en.wikipedia.org/wiki/90th_Infantry_Division_(United_States)\">
//		resultat = resultat.replaceAll("(<(A|a)[^>]*>)+(<[^>]*>)*", ""); 
		String resultat = string.replaceAll("(<(A|a)[^>]*>)+", "");
		//</a>
//		resultat = resultat.replaceAll("(<[^>]*>)*(<\\/(A|a)[^>]*>)+", "");
		resultat = resultat.replaceAll("(<\\/(A|a)[^>]*>)+", "");
		//[edit] =[<a title=\"Edit section: British/French campaign\" href=\"http://en.wikipedia.org/w/index.php?title=Call_of_Duty_3&amp;action=edit&amp;section=3\"><span style=\"color: #0645ad;\">edit</span></a>]
		resultat = resultat.replaceAll("\\[<[^>]*>(E|e)[A-Za-z ]*(T|t)<[^>]*>\\]", "");
		resultat = resultat.replaceAll("\\[<[^>]*>(H|h)[A-Za-z ]*(e|E)<[^>]*>\\]", "");
		resultat = resultat.replaceAll("\\[[A-Za-z ]*\\]", "");
		
		
		//[1]
		resultat = resultat.replaceAll("\\[<[^>]*>*[0-9]*<[^>]*>*\\]", "");
		resultat = resultat.replaceAll("\\[[0-9]*\\]", "");
		return (resultat);
		
		
	}	
	
	/**
	 * get value of list. 
	 * @param <T> must implements equals method
	 * @param list
	 * @param obj
	 * @return
	 */
	
	public static <T> T getValueFromList(List<T> list, Object obj){
		
		int index = list.indexOf(obj);
		T response = index >= 0 ? (T) list.get(index) : null; 
		return response;
	}
	
	/**
	 * search of word in text
	 * @param value
	 * @param text
	 * @return
	 */
	public static boolean wordInText(String value, String text){
		String [] sValue = value.toLowerCase().trim().split("\\s+");
		String [] sText = text.toLowerCase().trim().split("\\s+");
		boolean here = false;
		int i = 0;
		Arrays.sort(sText);
		do {
			if( Arrays.binarySearch(sText, sValue[i]) >= 0 )
				here = true;
			i++;
		}while(i < sValue.length && !here);
		
		
		
		return here;				
	}
	
	
	/**
	 * search of word in of text
	 * he marches if the same word are used rather then the position 	
	 * @param value
	 * @param list
	 * @return
	 */
	public static boolean wordMatchesInText(String value, String text){
		String [] sText = text.split("\\s+");		
		boolean here = false;
		for(String s : sText){			
			if( s.startsWith(value) ){
				here = true;
			    break;
			}
		}		
		return here;	
	}
	/**
	 * clean the query to be sent to solrs
	 * @param query
	 * @return
	 */
	public static String cleanQuery(String query)
	{
		return(query.trim().toLowerCase().replace("_", " "));
	}
	/**
	 * convert the double to a two decimals digigs 13.3 =13.30
	 * @param d
	 * @return
	 */
   public 	static String roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#########0.00");
		return twoDForm.format(d).replace(',', '.');
   }	
   /**
    * convert one string y input string
    * @param text
    * @return
    * @throws UnsupportedEncodingException
    */
   public static InputStream  stringToStream(String text) throws UnsupportedEncodingException {
		return new ByteArrayInputStream(text.getBytes("UTF-8"));
	} 
   

   
   /**
    * Rules to find if the string can be changed as a Roman N=[1..20]
    * xxxxxxxxxxxxxxxx N
    * N xxxxxxxxxxxxxxxx
    * xxxxxxxxxxxxxxxx N xxxxxxxxxxxx
    * xxxxxxxxxxxxxxxx N: xxxxxxxxxxxx
    * N: xxxxxxxxxxxxxxxx
    * @param str
    * @return
    */
   public static boolean isAliasNumberToRoman(String str){
	   return str.matches("([^0-9]* (\\d|1\\d|20):? [^0-9]*)|((\\d|1\\d|20):? [^0-9]*)|([^0-9]* (\\d|1\\d|20))");
   }
   /**
    * 
    * @param str
    * @return
    */
   public static boolean isAliasRomanToNumber(String str){
	   return str.matches("([A-Za-z0-9 :]* (I|II|III|IV|V|VI|VII|VIII|IX|X|XI|XII|XIII|XIV|XV|XVI|XVII|XVIII|XIX|XX):? [A-Za-z0-9 :]*)|((I|II|III|IV|V|VI|VII|VIII|IX|X|XI|XII|XIII|XIV|XV|XVI|XVII|XVIII|XIX|XX):? [A-Za-z0-9 :]*)|([A-Za-z0-9 :]* (I|II|III|IV|V|VI|VII|VIII|IX|X|XI|XII|XIII|XIV|XV|XVI|XVII|XVIII|XIX|XX))");
   }

	public static String replaceAliasNumberToRoman(String name) {
		String resultat = name.replaceAll("20", "XX");
		resultat = resultat.replaceAll("19", "XIX");
		resultat = resultat.replaceAll("18", "XVIII");
		resultat = resultat.replaceAll("17", "XVII");
		resultat = resultat.replaceAll("16", "XVI");
		resultat = resultat.replaceAll("15", "XV");
		resultat = resultat.replaceAll("14", "XIV");
		resultat = resultat.replaceAll("13", "XIII");
		resultat = resultat.replaceAll("12", "XII");
		resultat = resultat.replaceAll("11", "XI");
		resultat = resultat.replaceAll("10", "X");
		resultat = resultat.replaceAll("9", "IX");
		resultat = resultat.replaceAll("8", "VIII");
		resultat = resultat.replaceAll("7", "VII");
		resultat = resultat.replaceAll("6", "VI");
		resultat = resultat.replaceAll("5", "V");
		resultat = resultat.replaceAll("4", "IV");
		resultat = resultat.replaceAll("3", "III");
		resultat = resultat.replaceAll("2", "II");
		resultat = resultat.replaceAll("1", "I");
		return resultat;
	}
	
	public static String replaceAliasRomanToNumber(String name) {
		String resultat = name.replaceAll( "XX","20");
		resultat = resultat.replaceAll("XIX","19");
		resultat = resultat.replaceAll("XVIII","18");
		resultat = resultat.replaceAll("XVII","17");
		resultat = resultat.replaceAll("XVI","16");
		resultat = resultat.replaceAll("XV","15");
		resultat = resultat.replaceAll("XIV","14");
		resultat = resultat.replaceAll("XIII","13");
		resultat = resultat.replaceAll("XII","12");
		resultat = resultat.replaceAll("XI","11");
		resultat = resultat.replaceAll("X","10");
		resultat = resultat.replaceAll("IX","9");
		resultat = resultat.replaceAll("VIII","8");
		resultat = resultat.replaceAll("VII","7");
		resultat = resultat.replaceAll("VI","6");
		resultat = resultat.replaceAll("V","5");
		resultat = resultat.replaceAll("IV","4");
		resultat = resultat.replaceAll("III","3");
		resultat = resultat.replaceAll("II","2");
		resultat = resultat.replaceAll("I","1");
		return resultat;
	}
	/**
	 * http://lucene.apache.org/java/2_4_0/queryparsersyntax.html#Escaping%20Special%20Characters
	 * @param query
	 * @return
	 */
	public static String cleanQuerySolrsSpecialCharacters(String query){
		String resp=query;
		resp=resp.replaceAll("\\\\","\\\\\\\\"); // always first this one... whatch out	
		resp=resp.replaceAll("\\+","\\\\+"); //ok
		resp=resp.replaceAll("-","\\\\-");   //ok
		resp=resp.replaceAll("\\&\\&","\\\\&&"); //ok
		resp=resp.replaceAll("\\|\\|","\\\\||"); //ok
		resp=resp.replaceAll("\\!","\\\\!"); //ok
		resp=resp.replaceAll("\\(","\\\\("); //ok
		resp=resp.replaceAll("\\)","\\\\)"); //ok
		resp=resp.replaceAll("\\{","\\\\{"); 
		resp=resp.replaceAll("\\}","\\\\}");
		resp=resp.replaceAll("\\[","\\\\[");
		resp=resp.replaceAll("\\]","\\\\]");
		resp=resp.replaceAll("\\^","\\\\^");
		//resp=resp.replaceAll("\"","\\\\\"");
		resp=resp.replaceAll("~","\\\\~");
		resp=resp.replaceAll("\\*","\\\\*");
		resp=resp.replaceAll("\\?","\\\\?");
		resp=resp.replaceAll("\\:","\\\\:");
		return resp.trim(); 
	}
	
	

	public static String translateStringMap(Map<String, Object> params){

		StringBuilder sb = new StringBuilder();		
		for(Map.Entry<String, Object> entry : params.entrySet()){
			if(! entry.getKey().equals("_")){
				sb.append("-");
				String[] values = (String[])entry.getValue();
				sb.append(values[0]);
			}
		}
		
		return sb.toString();
		
	}
	
	public static String getHttpParamsMap(Map<String, Object> params, String param){

		String value = null;		
		for(Map.Entry<String, Object> entry : params.entrySet()){
			if(entry.getKey().equals(param)){				
				String[] values = (String[])entry.getValue();
				value = values[0];
			}
		}		
		return value;		
	}
	

	public static List<CommonDTO> getIntersectionList(List<CommonDTO> mainList, 
				  List<Long> secondList) {
		
		int index;
		List<CommonDTO> resList = new ArrayList<CommonDTO>();
		Collections.sort(mainList);
		for(Long id : secondList){			
			index = Collections.binarySearch(mainList, CommonDTO.valueOf(id, null));
			if( index >= 0){
				resList.add(mainList.get(index));
			}
		
		}		
		
		return resList;
		
	}
		

	
}
