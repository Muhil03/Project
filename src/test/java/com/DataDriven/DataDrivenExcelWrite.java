package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcelWrite {

	public static void WriteData() throws IOException{
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\DataDriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheet = w.createSheet("HMCL");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("ITEMS");
		
		w.getSheet("HMCL").getRow(0).createCell(1).setCellValue("MODEL");
		
		w.getSheet("HMCL").getRow(0).createCell(2).setCellValue("LOCATION");
		
		w.getSheet("HMCL").getRow(0).createCell(3).setCellValue("STOCK");
		
		w.getSheet("HMCL").createRow(1).createCell(0).setCellValue("Keyboard");
		
		w.getSheet("HMCL").getRow(1).createCell(1).setCellValue("Wireless");
		
		w.getSheet("HMCL").getRow(1).createCell(2).setCellValue("Chennai");
		
		w.getSheet("HMCL").getRow(1).createCell(3).setCellValue("In stock");
		
		w.getSheet("HMCL").createRow(2).createCell(0).setCellValue("Mouse");
		
		w.getSheet("HMCL").getRow(2).createCell(1).setCellValue("USB Mouse");
		
		w.getSheet("HMCL").getRow(2).createCell(2).setCellValue("Gurgaon");
		
		w.getSheet("HMCL").getRow(2).createCell(3).setCellValue("Out of Stock");
		
		w.getSheet("HMCL").createRow(3).createCell(0).setCellValue("Laptop");
		
		w.getSheet("HMCL").getRow(3).createCell(1).setCellValue("MAC");
		
		w.getSheet("HMCL").getRow(3).createCell(2).setCellValue("Madurai");
		
		w.getSheet("HMCL").getRow(3).createCell(3).setCellValue("In stock");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
				
	}
	public static void main(String[] args) throws IOException {
		
		WriteData();
	}
}
