package no.nith.pg560.application;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import no.nith.pg560.domain.Search;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CreateWorkBookTest {
	
	@InjectMocks
	private CreateWorkBook cwb;
	
	private List<Search> list;
	
	@Before
	public void begin() {
		cwb = new CreateWorkBook();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void createWorkBook() {
		list = buildResult();
		Workbook wb = cwb.createWorkBook(list);
		assertNotNull(wb);
	}
	
	private List<Search> buildResult() {
		List<Search> list = new ArrayList<Search>();
		for (int i = 0; i < 10; i++) {
			list.add(new Search());
		}
		return list;
	}
}
