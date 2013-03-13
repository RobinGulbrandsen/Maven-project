package no.nith.pg560.application;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import no.nith.pg560.domain.Search;
import no.nith.pg560.infrastructure.SearchJpaRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SeachServiceBeanTest {

	@SuppressWarnings("unused")
	@Mock
	private SearchJpaRepository searchJpaRepository;

	@InjectMocks
	private SearchServiceBean searchServiceBean;

	@Before
	public void setup() {
		searchServiceBean = new SearchServiceBean();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getTechnology() throws Exception {
		when(searchServiceBean.getSearch("")).thenReturn(buildResult());
		List<Search> list = searchServiceBean.getSearch("");
		assertNotNull(list);
	}

	private List<Search> buildResult() {
		List<Search> list = new ArrayList<Search>();
		for (int i = 0; i < 10; i++) {
			list.add(new Search());
		}
		return list;

	}
}
