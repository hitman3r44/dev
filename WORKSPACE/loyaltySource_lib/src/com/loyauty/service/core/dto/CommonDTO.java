package com.loyauty.service.core.dto;

import java.util.Comparator;

import lombok.Data;
import lombok.ToString;


/**
 * 
 */

@Data @ToString(callSuper=true)
public class CommonDTO extends BasicDTO implements Comparable<Object>{	
	
	private static final long serialVersionUID = -5743916673476272960L;
	
	public static CommonDTO valueOf(long id, String name){
		return valueOf(id, null, name);
	}
	
	public static CommonDTO valueOf(long id, String code, String name){
		return new CommonDTO(id, code, name);
	}
	
	private String code;
	private String name;
	private String hRefName;
	
	private CommonDTO(long id, String code, String name){
		setId(id);
		setCode(code);
		setName(name);
	}
	
	@Override
	public boolean equals(Object other) {
		if( other instanceof CommonDTO ){
			return this.getId() == ((CommonDTO) other).getId();			
		}
		else return  this == other;		
	}
	
	@Override
	public int compareTo(Object other) {		
		if( other instanceof CommonDTO ){
			if( this.getId() == ((CommonDTO) other).getId() ){
				return 0;
			}
			else if(this.getId() > ((CommonDTO) other).getId()){
				return 1;
			}
			else 
				return -1;			
		}
		else 
			throw new ClassCastException("Invalid object");
	}
	

	public static Comparator<Object> nameComparator() {
		return new Comparator<Object>() {
				public int compare(Object o1, Object o2) {
					CommonDTO s1 = (CommonDTO)o1;
					CommonDTO s2 = (CommonDTO)o2;
					return s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase());
				}
		};
	}
	

	public static Comparator<Object> idComparator() {
		return new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
						CommonDTO s1 = (CommonDTO)o1;
						CommonDTO s2 = (CommonDTO)o2;
						if( s1.getId() == s2.getId() )
			            		return 0;
			            else if( s1.getId() > s2.getId() )
			            		return 1;
			            else
			            	return -1;
					}
		};
    }

	

	 
}
