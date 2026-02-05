package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JanhviKapoor 
{

	@Test(groups={"Tamilnadu","Bollywood"})
	public void launchWiki()
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Janhvi_Kapoor");
		
	}


}
