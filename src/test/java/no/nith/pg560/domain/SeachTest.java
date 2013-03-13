package no.nith.pg560.domain;

import static org.junit.Assert.*;
import no.nith.pg560.domain.Search;

import org.junit.Before;
import org.junit.Test;

public class SeachTest {

	private Search search;
	
	@Before
    public void setup() {
		search = new Search();
		search.setTechnology("default");
		search.setJsr("default");
		search.setUrl("default");
	}
	
	@Test
	public void creteSeach() {
		assertTrue(search.getId() == 0);
		assertTrue(search.getTechnology().equals("default"));
		assertTrue(search.getJsr().equals("default"));
		assertTrue(search.getUrl().equals("default"));
	}
}
