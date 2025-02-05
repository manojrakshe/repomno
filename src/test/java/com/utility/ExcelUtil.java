package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	
	public static Object[][] loadExcelIntoArray(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Object[][] data;
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("pincodes");
		
		data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType()) {
				case NUMERIC:
					data[i][j] = String.valueOf((int)cell.getNumericCellValue());
					break;
					
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
					
				case BLANK:
					data[i][j] = 0;
					break;
					
				default:
					System.out.println("Invalid call value");
				
				}
				
				//String pincode = String.valueOf((int) cell.getNumericCellValue());
				//System.out.print(pincode+ "\t");
			}
			
			System.out.println();
		}
		
		return data;

	}

	//public static void main(String[] args) throws IOException {
		//loadExcelIntoArray("D:\\Eclipse-workpace\\TestNGProj\\src\\test\\java\\utility\\dataproviders\\PincodeData.xlsx");

	//}

}
