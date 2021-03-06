package com.loyauty.util.constant;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;


import com.loyauty.enums.Language;


/**
 * All web constants go in this class.
 * 
 * @author Muthanna
 *
 */
public final class BackEndConstants {

	private static final Logger LOG = Logger.getLogger(BackEndConstants.class);
	public static final String HTTP = "http://";
	public static final String URLPATTERN = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
	
    public static final String RSSSEARCHPATTERN ="[^a-zA-Z0-9 ]";
    public static final String REMOVE_HTML_TAGS ="<[^>]*>";
    
	public final static int TITLEDBLENGTH =100;
	public static final int DAY_IN_MILLISECONDS = 86400000;
	// minimal value of year
	public static final int MIN_YEAR = 1972;
	// rang value of rating score for user review
	public static final int SCORE_PITCH_VALUE = 5;
	public static final int SCORE_MIN_VALUE = 0;
	public static final int SCORE_MAX_VALUE = 100;
	
	// number of disc constant
	public static final int DISC_NUMBER_MIN = 1;
	public static final int DISC_NUMBER_MAX = 6;
	
	//Admin group
	public static final int USER_ADMIN_GROUP = 1;
	public static final int USER_GROUP = 2;
	
	//Default image profile name
	 public static final String DEFAULT_PROFILE_IMAGE = "default_profile.jpg";
	 
	//default loyauty user and language
	public static final int DEFAULT_LANGUAGE = Language.ENGLISH.getValue();
	
	
	public static final int MANUEL_SORTING_A_Z = 1;
	public static final int MANUEL_SORTING_Z_A = 2;
	public static final int MANUEL_SORTING_RELEASE_DATE_DESC = 3;
	public static final int MANUEL_SORTING_RELEASE_DATE_ASC = 4;
	public static final int MANUEL_SORTING_BEST_3RD_RATING = 8;
	public static final int MANUEL_SORTING_WORST_3RD_RATING = 7;
	
	public static final int LIMIT_LINK_TABLE_RETRIEVE = 500;
	
	public static final int MODEL_SOURCE_RATING_1 = 1;
	public static final int MODEL_SOURCE_RATING_2 = 2;
	
	// Constants class, no instantiation
	private BackEndConstants() {};	



	/**
	 * true if type is present in the array 
	 * @param a
	 * @param type
	 * @return
	 */
	private static boolean compare(int[] a, int type){
		for (int i = 0; i < a.length; i++) {
			if (a[i] == type )
				return true;
		}
		return false;	
	}
	private static boolean compare(char[] a, char type){
		for (int i = 0; i < a.length; i++) {
			if (a[i] == type )
				return true;
		}
		return false;	
	}
	
	
}
