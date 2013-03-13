package no.nith.pg560.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import no.nith.pg560.common.CommonRepository;
import no.nith.pg560.domain.Search;

import org.apache.log4j.Logger;

/*
 * Repository class handling integration with the PG560_Search database
 */
public class SearchJpaRepository extends CommonRepository<Search>{
	private Logger logger = Logger.getLogger(SearchJpaRepository.class); 

	public SearchJpaRepository() {
		super(Search.class);
	}
	
	public SearchJpaRepository(EntityManager em) {
		super(Search.class, em);
	}
	
	/*
	 * Methods to interact with database
	 */
	public List<Search> getTechnology(String search) {
		TypedQuery<Search> q = getEntityManager().createQuery(
			"SELECT s FROM Search s WHERE UPPER(s.technology) LIKE UPPER(:technology) " +
			"OR UPPER(s.jsr) LIKE UPPER(:technology)" + 
			"OR UPPER(s.description) LIKE UPPER(:technology)" +
			"OR UPPER(s.version) LIKE UPPER(:technology)" +
			"OR UPPER(s.acrynom) LIKE UPPER(:technology)",
			Search.class);
		q.setParameter("technology", "%" + search + "%");
		
		List<Search> s = null;
		try {
			logger.info("inside the try");
			s = q.getResultList();
		} catch (Exception e) {
			logger.info("No search results on " + search);
		}
		return s;
	}
}
