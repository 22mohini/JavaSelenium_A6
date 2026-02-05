package org.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromDP
{
	public static void main(String[] args) throws FileNotFoundException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		File file = new File(".\\TestData\\DWS.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		
		
	}

}
