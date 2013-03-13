package no.nith.pg560.application;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import no.nith.pg560.domain.Search;
import no.nith.pg560.infrastructure.SearchJpaRepository;

/*
 * SearchServiceBean exposes functionality for finding elements in the database
 */
@Stateless
public class SearchServiceBean {
	@Inject
	private SearchJpaRepository searchRepository;
	
	public List<Search> getSearch(String search) {
		return searchRepository.getTechnology(search);
	}
}
