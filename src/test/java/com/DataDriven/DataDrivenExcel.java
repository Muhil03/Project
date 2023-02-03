package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void readdata() throws IOException {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\DataDriven.xlsx");
		
		FileInputStream fs = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook w = new XSSFWorkbook(fs);
		
		Sheet sheet = w.getSheet("Apple");
		
		System.out.println("------------All Data-------------");
		
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING))
				{
					String stringCellValue = cell.getStringCellValue();					
					System.out.println(stringCellValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {					
					double numericCellValue = cell.getNumericCellValue();					
					int value = (int)numericCellValue;					
					System.out.println(value);
				}
			}
		}
		
		System.out.println("-----------Row Data----------------");
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheet.getRow(i);
						
			if(i==3) {
				
				int numberOfCells = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < numberOfCells; j++) {
					
					Cell cell = row.getCell(j);
					
					CellType cellType = cell.getCellType();
					
					if(cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);						
					}
					else if(cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int cellvalue = (int) numericCellValue;
						System.out.println(cellvalue);
					}
					
				}
			}
		}
		
		System.out.println("-------------Column Data------------");
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				if (j==0) {
					
					CellType cellType = cell.getCellType();
					
					if(cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);						
					}
					else if (cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int cellvalue = (int)numericCellValue;
						System.out.println(cellvalue);
					}
				}
			}
		}
		
		System.out.println("--------------Particular Data---------------------");
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			
			if(i==2) {
				
				int numberOfCells = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < numberOfCells; j++) {
					
					Cell cell = row.getCell(j);
					
					if(j==1) {
						
						CellType cellType = cell.getCellType();
						
						if(cellType.equals(CellType.STRING)) {
							String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
						}
						else if(cellType.equals(CellType.NUMERIC)) {
							double numericCellValue = cell.getNumericCellValue();
							int cellvalue = (int)numericCellValue;
							System.out.println(cellvalue);
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
		readdata();
	}
}
