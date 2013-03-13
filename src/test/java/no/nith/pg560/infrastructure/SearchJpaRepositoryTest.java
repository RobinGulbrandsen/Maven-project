package no.nith.pg560.infrastructure;

import static org.junit.Assert.*;

import java.util.List;

import no.nith.pg560.common.CommonInfrastructureIT;
import no.nith.pg560.domain.Search;

import org.junit.Test;

public class SearchJpaRepositoryTest extends CommonInfrastructureIT {
	
	@Test
	public void getUser() {
		SearchJpaRepository searchRepo = new SearchJpaRepository(getEntityManager());
		List<Search> searchResult = searchRepo.getTechnology("Java API for RESTful Web Services");
		assertNotNull(searchResult);
		assertEquals(searchResult.get(0).getTechnology(), "Java API for RESTful Web Services");
		assertEquals(searchResult.get(0).getJsr(), "311");
		assertEquals(searchResult.get(0).getUrl(), "http://jcp.org/en/jsr/detail?id=311");
		assertEquals(searchResult.get(0).getAcrynom(), "JAX-RS");
		assertEquals(searchResult.get(0).getVersion(), "1.1");
		assertEquals(searchResult.get(0).getDescription(), "This JSR will develop an API for providing support for RESTful(Representational State Transfer) Web Services in the Java Platform.");
		
		searchResult = null;
		searchResult = searchRepo.getTechnology("Finnes ikke");
		assertEquals(searchResult.size(), 0);
		
		searchResult = null;
		searchResult = searchRepo.getTechnology("");
		assertTrue(searchResult.size() > 0);
	}
	
	@Test
	public void searchRepoConstructor() {
		SearchJpaRepository searchRepo = new SearchJpaRepository();
		assertNotNull(searchRepo);
	}
}
 