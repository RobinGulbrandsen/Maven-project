package no.nith.pg560.interfaces.web;

import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import no.nith.pg560.application.CreateWorkBook;
import no.nith.pg560.application.SearchServiceBean;
import no.nith.pg560.common.Pg560PageNavigation;
import no.nith.pg560.domain.Search;
import no.nith.pg560.infrastructure.SearchJpaRepository;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;

@Named
@RequestScoped
public class SearchController {

	@Inject
	private TechnologyBean technologyBean;

	@Inject
	private SearchServiceBean searchServiceBean;

	@Inject
	private SearchBackingBean searchBackingBean;
	
	private static final int SIZE = 10;
	private static Logger logger = Logger.getLogger(SearchJpaRepository.class); 

	// Get Search results
	public String searchResults() {
		try {
			List<Search> list = searchServiceBean.getSearch(technologyBean
					.getTechnology());

			// checks list size
			if (list.size() > SIZE) {
				List<Search> tmp = list.subList(0, SIZE);
				searchBackingBean.setResults(tmp, list, SIZE);
			} else {
				List<Search> tmp = list.subList(0, list.size());
				searchBackingBean.setResults(tmp, list, SIZE);
			}
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return Pg560PageNavigation.INDEX_PAGE;
	}

	public String exportResults() {
		// Export to excel the list
		List<Search> list = searchBackingBean.getFullList();
		HttpServletResponse res = (HttpServletResponse) FacesContext
				.getCurrentInstance().getExternalContext().getResponse();
		res.setContentType("application/vnd.ms-excel");
		res.setHeader("Content-disposition",
				"attachment; filename=jee6search.xls");

		try {
			CreateWorkBook cwb = new CreateWorkBook();
			Workbook wb = cwb.createWorkBook(list);
			ServletOutputStream fileOut = res.getOutputStream();
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			logger.info(e.toString());
		}
		FacesContext faces = FacesContext.getCurrentInstance();
		faces.responseComplete();

		return Pg560PageNavigation.INDEX_PAGE;
	}

	public String previousResults() {
		int currentMax = searchBackingBean.getMaxIndex() - SIZE;
		int currentLow = currentMax - SIZE;
		List<Search> fullList = searchBackingBean.getFullList();
		List<Search> tmp = null;

		if (searchBackingBean.isPrevious() && currentLow >= 0) {
			tmp = fullList.subList(currentLow, currentMax);
			searchBackingBean.setResults(tmp, fullList, currentMax);
		}

		return Pg560PageNavigation.INDEX_PAGE;
	}

	public String nextResults() {
		int currentMax = searchBackingBean.getMaxIndex();
		int newMaxIndex = currentMax + SIZE;
		List<Search> fullList = searchBackingBean.getFullList();
		List<Search> tmp = null;

		if (searchBackingBean.isNext()) {
			if (fullList.size() > newMaxIndex) {
				tmp = fullList.subList(currentMax, newMaxIndex);
				searchBackingBean.setResults(tmp, fullList, newMaxIndex);
			} else {
				tmp = fullList.subList(currentMax, fullList.size());
				searchBackingBean.setResults(tmp, fullList, newMaxIndex);
			}
		}

		return Pg560PageNavigation.INDEX_PAGE;
	}

}
