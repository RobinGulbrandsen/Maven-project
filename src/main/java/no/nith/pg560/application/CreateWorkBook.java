package no.nith.pg560.application;

import java.util.List;

import no.nith.pg560.domain.Search;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class CreateWorkBook {
	
	public CreateWorkBook() {
	}
	
	public Workbook createWorkBook(List<Search> list) {
		Workbook wb = new HSSFWorkbook();
		Sheet s1 = wb.createSheet();
		Row row = null;
		for (int i = 0; i < list.size(); i++) {
			row = s1.createRow(i);
			String description = list.get(i).getTechnology();
			String jsr = list.get(i).getJsr();
			String url = list.get(i).getUrl();
			
			Cell cell1 = row.createCell(0);
			Cell cell2 = row.createCell(1);
			Cell cell3 = row.createCell(2);
			
			cell1.setCellValue(description);
			cell2.setCellValue(jsr);
			cell3.setCellValue(url);
		}
		return wb;
	}

}
