package org.automation.modularFramework;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import static org.automation.genericUtilities.FrameWorkContants.*;

/**
 * The Class Flib is Mainly used to Interact with the file and fetch the Test Data 
 * needed for automating Application
 * 
 * @author Mohini K
 */

public class Flib
{
	/**
	 * This method accept the key and it will fetch the value of the respective key
	 * in given properties file
	 * @param key
	 * @return
	 */
	public static String getPropertyValue(String key)
	{
		File file = new File(PROPERTIES_PATH);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
	}
	/**
	 * This method accept the sheetName, rowIndex, cellIndex to fetch a cell value
	 * from the given workbook 
	 * @param sheetName[String]
	 * @param rowIndex [int]
	 * @param cellIndex [int]
	 * @return
	 */


public static String getWorkbookcellvalue(String sheetName, int rowIndex, int cellIndex)
{
	File file = new File(EXCEL_PATH);
	FileInputStream fis = null;
	Workbook wb = null;
	try
	{
		fis = new FileInputStream(file);
		wb = WorkbookFactory.create(fis);
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
		
	}
	String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
	return value;
}

public static String getNumericCellValueMethod(String sheetName , int rowNo , int cellNo ) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(EXCEL_PATH);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	double data = cell.getNumericCellValue();
	
	int data1 =(int)data;
	String value = String.valueOf(data1);
	return value;
}
public static int generateRandomNo()
{
	Random random = new Random();
	int rn = random.nextInt(1000, 9999);
	return rn;
}
	


}