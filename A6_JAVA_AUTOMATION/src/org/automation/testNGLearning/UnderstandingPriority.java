package org.automation.testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnderstandingPriority 
{
	@Test(priority=4, enabled =true)
	public void launchingKalkiFasion()
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://in.kalkifashion.com/");
	}
		

	@Test(priority =-1)
	public void launchingPurple()
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://purple.com/");
	}
	//@Test(priority=-1, enabled = false)
		@Test(dependsOnMethods = {"launchingPurple","launchingKalkiFasion"})
		public void launchingFullyFilmy()
		{
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://fullyfilmy.in/");
		}
}

