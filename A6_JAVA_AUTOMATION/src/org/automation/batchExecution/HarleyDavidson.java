package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidson 
{
	@Test
	public void launchingHarleyDavidson()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/harleydavidson-bikes/");
		Reporter.log("launched iron 883", true);
	}

}
