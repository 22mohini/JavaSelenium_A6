package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jawa
{
	@Test
	public void launching42Bobber()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdiomotorcycles.com/products/jawa-42-bobber");
		Reporter.log("Launched 42 bobber", true);
	}
	@Test
	public void launchingPerak()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jawayezdiomotorcycles.com/products/jaw-perak");
		Reporter.log("Launched Perak", false);
	}

}
