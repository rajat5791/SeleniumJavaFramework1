package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath,String sheetName) 
	{
		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main (String[] args) {
		//getRowCount();
		//getCellDataString(0,0);
		//getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: "+rowCount);
		return rowCount;

	}

	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum ).getStringCellValue();
		System.out.println(cellData);
		return cellData;

	}

	public static void getCellDataNumber(int rowNum, int colNum) {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);

	}

	public static int getColCount() {
		
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of coulmns :  "+colCount);
		return colCount;

	}

}
