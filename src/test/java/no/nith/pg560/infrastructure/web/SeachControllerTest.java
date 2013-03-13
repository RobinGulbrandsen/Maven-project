package no.nith.pg560.infrastructure.web;

import no.nith.pg560.infrastructure.SearchJpaRepository;
import no.nith.pg560.interfaces.web.SearchController;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SeachControllerTest {
	
	@SuppressWarnings("unused")
	@Mock
	private SearchJpaRepository searchJpaRepository;

	@SuppressWarnings("unused")
	@InjectMocks
	private SearchController searchController;

	@Before
	public void setup() {
		searchController = new SearchController();
		MockitoAnnotations.initMocks(this);
	}
}
