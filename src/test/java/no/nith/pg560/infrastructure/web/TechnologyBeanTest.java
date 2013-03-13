package no.nith.pg560.infrastructure.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import no.nith.pg560.domain.Search;
import no.nith.pg560.interfaces.web.TechnologyBean;

import org.junit.Test;

public class TechnologyBeanTest {

	@Test
	public void setAndGet() {
		List<Search> list = new ArrayList<Search>();
		list.add(new Search());
		
		TechnologyBean bean = new TechnologyBean();
		bean.setTechnology("test");
		bean.setJsr("test");
		bean.setUrl("test");
		bean.setSearches(list);
		assertEquals(bean.getTechnology(), "test");
		assertEquals(bean.getJsr(), "test");
		assertEquals(bean.getUrl(), "test");
		assertNotNull(bean.getSearches());
		assertNotNull(bean.toString());
		
	}
}

