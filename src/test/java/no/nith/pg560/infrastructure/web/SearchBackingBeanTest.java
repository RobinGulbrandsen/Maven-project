package no.nith.pg560.infrastructure.web;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import no.nith.pg560.domain.Search;
import no.nith.pg560.interfaces.web.SearchBackingBean;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class SearchBackingBeanTest {
	
    @InjectMocks
    private SearchBackingBean searchBackingBean;
    
    private List<Search> list;
    
    @Before
    public void setup() {
    	searchBackingBean = new SearchBackingBean();
        MockitoAnnotations.initMocks(this);
        list = getList(30);
        
        searchBackingBean.setResults(list, list);
    }
    
    @Test
    public void setResults() {
    	assertNotNull(searchBackingBean.getCurrentSearchResults());
    	assertNotNull(searchBackingBean.getFullList());
    	assertNotNull(searchBackingBean.getMaxIndex());
    }
    
    @Test
    public void isNext() {
    	assertTrue(searchBackingBean.isNext());
    	list = getList(9);
    	searchBackingBean.setResults(list, list);
    	assertFalse(searchBackingBean.isNext());
    	
    	searchBackingBean.setResults(list, list);
    	assertTrue(searchBackingBean.isPrevious());
    }
    
    @Test
    public void isPrevious() {
    	assertTrue(searchBackingBean.isPrevious());
    }
    
    //Help method to make a list with data to test with
    public List<Search> getList(int max) {
    	List<Search> list = new ArrayList<Search>();
    	for (int i = 0; i < max; i++) {
			list.add(new Search());
		}
    	return list;
    }
}
