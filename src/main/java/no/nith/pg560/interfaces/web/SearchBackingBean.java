package no.nith.pg560.interfaces.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import no.nith.pg560.domain.Search;

/*
 * This backingbean shows searchdetails.
 */

@Named
@SessionScoped
public class SearchBackingBean implements Serializable{
	private static final long serialVersionUID = -3117983378141205236L;
	
	private List<Search> currentSearchResults, fullList;
	private int index = 0;
	private static final int SIZE = 10;
	
	public void setResults(List<Search> results, List<Search> fullList) {
		setResults(results, fullList, SIZE);
	}
	
	public void setResults(List<Search> results, List<Search> fullList, int maxIndex) {
		this.currentSearchResults = results;
		this.fullList = fullList;
		this.index = maxIndex;
	}
	
	public List<Search> getCurrentSearchResults() {
		return currentSearchResults;
	}
	
	public List<Search> getFullList() {
		return fullList;
	}
	
	public int getMaxIndex() {
		return index;
	}
	
	public boolean isNext() {
		if(fullList != null && index < fullList.size()) {
			return true;
		}
		return false;
	}
	
	public boolean isPrevious() {
		if(index > 0 && fullList != null) {
			return true;
		}
		return false;
	}
	
	

}
