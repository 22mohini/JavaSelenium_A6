package org.automation.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
		System.out.println(rowCount);
		int cellcount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(cellcount);
		
	String	[] [] creds = new String [rowCount] [cellcount];
	
	for(int i=1;i<=rowCount;i++) //(i=1 because in xl data start from 1 in row)
	{
		for(int j=0;j<cellcount; j++)  //(j=0 , because in xl data start from 0 in colom)
		{
			creds [i-1] [j]= sheet.getRow(i).getCell(j).toString();  //for store data into creds(position : 0,0)
		}
	}
	for(String [] arr : creds)   //used this for loop for fetch the data from one array from creds
	{
		for(String data : arr)   //used this for loop for fetch one data from array
		{
			System.out.print(data+" ,");
		}
		System.out.println();
	}
	}

}
