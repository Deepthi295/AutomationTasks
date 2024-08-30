package nop.commerece.reports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_ExcelData {
	@Test
	public void ReadExcelSheetdata() throws IOException {
		String path =  System.getProperty("user.dir");
		System.out.println(path);
		File file = new File(path + "\\src\\test\\resources\\ExcelSheet\\FamilyDetails.xlsx");
		 System.out.println(file);
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// System.out.println(wb);
		Sheet sheet = wb.getSheetAt(0);
		// System.out.println(sheet);
		int rowscount = sheet.getPhysicalNumberOfRows();
		System.out.println("Rows:" + rowscount);
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("column:" + columncount);
//		String v1 = sheet.getRow(0).getCell(0).getStringCellValue();
//		String v2= sheet.getRow(0).getCell(1).getStringCellValue();
//		String v3 = sheet.getRow(0).getCell(2).getStringCellValue();
//		System.out.println(v1+"/t"+v2+"/t"+v3);
		for (int i = 0; i < rowscount; i++) {
			for (int j = 0; j < columncount; j++) {

				CellType celltype = sheet.getRow(i).getCell(j).getCellType();
				Object value = null;
				if (celltype.STRING != null) {
					value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println();
				} else if (celltype.NUMERIC != null) {
					value = sheet.getRow(i).getCell(j).getStringCellValue();
				}

				System.out.println(value + "\t");
			}
			System.out.println();
		}

		fis.close();

	}

}
