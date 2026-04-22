package com.utilitiesread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelUtilities {
	Workbook oworkbook;
	Sheet osheet;
	Row orow;
	Cell ocell;
// constructor created for filename and sheetname
	
	public ReadFromExcelUtilities(String fileName, String sheetName) throws Exception, IOException {
		File ofile = new File( fileName); // file created
		this.oworkbook = WorkbookFactory.create(ofile); // workbook created
		this.osheet = oworkbook.getSheet(sheetName);	
	}

	// method for rowno & colno
	
	public String getReadDataFromExcel(int rowNo, int colNo) throws Exception, IOException {
		
		
		this. orow = osheet.getRow(rowNo);
		this. ocell = orow.getCell(colNo); // index starts from 0
		String cellvalue = ocell.getStringCellValue();
	//	System.out.println("Value from excel is " + cellvalue);
		return cellvalue;

	}


public String getDataFromExcel(int rowNo, String colName) throws Exception, IOException {
	
	int cellNo=0;
	
	Row orow=osheet.getRow(0);   // headings are in 0th row
		for(int i=0;i<orow.getLastCellNum();i++) {
			if(orow.getCell(i).getStringCellValue().equalsIgnoreCase(colName)){
		     cellNo=i;
		     break;
			}
		}
		
		 orow = osheet.getRow(rowNo);
		Cell ocell = orow.getCell(cellNo); 
		String cellData = ocell.getStringCellValue();
	System.out.println();
		return cellData;

	}


}


