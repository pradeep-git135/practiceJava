package demoSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

//	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
//		// TODO Auto-generated method stub
//		Workbook wb = getExeclData();

//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Pradeep\\Desktop\\demo_webdriverIO\\exceldata.xlsx");
//		wb.write(fos);
//		wb.getSheet("xyz").getRow(1).createCell(3).setCellValue("notvalid");
//		wb.close();
//		System.out.println("Write is done");
//		String value = wb.getSheet("xyz").getRow(1).getCell(3).getStringCellValue();
//		System.out.print(value);
//		
//	}
//
//	public static Workbook getExeclData() throws FileNotFoundException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Pradeep\\Desktop\\demo_webdriverIO\\exceldata.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		int rowCount = wb.getSheet("xyz").getLastRowNum();
//		int colCount = wb.getSheet("xyz").getRow(0).getLastCellNum();
//		System.out.println(rowCount);
//		System.out.println(colCount);
//		for (int i = 0; i <= rowCount; i++) {
//			for (int j = 0; j <= colCount-1; j++) {
//				String value = wb.getSheet("xyz").getRow(i).getCell(j).getStringCellValue();
//				System.out.print(value+"   ");
//				
//			}
//			System.out.println();
//		}
//		return wb;
//	}
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Pradeep\\Desktop\\demo_webdriverIO\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("xyz").getLastRowNum();
		int colCount = wb.getSheet("xyz").getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(colCount);
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j <= colCount-1; j++) {
				String value = wb.getSheet("xyz").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"   ");
			}
			System.out.println();
		}
	}
}
