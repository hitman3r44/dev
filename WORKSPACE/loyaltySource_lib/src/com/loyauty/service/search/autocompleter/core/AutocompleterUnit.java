package com.loyauty.service.search.autocompleter.core;

import lombok.Data;

/**
 * A simple class used for autocompletion service. It implements
 * {@link Completable} which imposes all implementing units to provide a
 * unique id and a text they expose for the autocompletion service.
 * 
 * 
 */
@Data
public class AutocompleterUnit implements Completable<AutocompleterUnit> {

	private long id;

	private String autocompletionText;	

	public AutocompleterUnit(long id, String autocompletionText) {
		this.id = id;
		this.autocompletionText = autocompletionText;		
	}

	@Override
	public int compareTo(AutocompleterUnit o) {
		if (this.getId() > o.getId()) {
			return -1;
		} else if (this.getId() < o.getId()) {
			return +1;
		} else {
			return this.getAutocompletionText().compareTo(
					o.getAutocompletionText());
		}
	}

}
