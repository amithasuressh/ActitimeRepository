package com.actitimetestNG.commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileDataUtils {
	String excelpath ="./testdata/testdata.xlsx";
	String filepath = "./testdata/commondata.properties";
	
	/**
	 * 
	 * @param sheetName , rowNum , columNum

	 * @return String data
	 * @throws Throwable
	 * 
	 * its used to read data from Excel-WorkBook based on user Input
	 */

	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
			   
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row1 = sh.getRow(rowNum);
		String data = row1.getCell(colNum).getStringCellValue();
		return data;
				
	}
	
	/**
	 * 
	 * @param sheetName
     * @param rowNum
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 * 
	 * its used to write data back Excel based on user input
	 */
	public void setExcelData(String sheetName, int rowNum, int celNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row1 = sh.getRow(rowNum);
		Cell data1 = row1.createCell(celNum);
		data1.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
		}
		
	/**
	 * 
	 * @return
	 * @throws Throwable
	 * its always return properties File Object & load all the Keys available in 
	 * commondata.properteis File in data folder
	 */
	public Properties getPropertiesFileObj() throws Throwable {
		FileInputStream fis = new FileInputStream(filepath);
		Properties pobj = new Properties();
	    pobj.load(fis);
	    return pobj;
		
	}



}
