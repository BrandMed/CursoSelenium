package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToObject {
	public static ArrayList<Table> tableList;
	public static void read(String path) {
		try {
			FileInputStream file = new FileInputStream(new File(path));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);

			tableList = new ArrayList<>();
			for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
				Table t = new Table();
				Row ro = sheet.getRow(i);
				for (int j = ro.getFirstCellNum(); j <= ro.getLastCellNum(); j++) {
					Cell ce = ro.getCell(j);
					if (j == 0) {
						t.setValueToBeSearched(ce.getStringCellValue());
					}
					if (j == 1) {
						t.setURL(ce.getStringCellValue());
					}

				}
				tableList.add(t);
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}