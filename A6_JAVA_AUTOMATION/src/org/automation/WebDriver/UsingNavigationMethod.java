package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipKart.com/");
	Thread.sleep(2000);
	driver.get("https://www.Zeptonow.com/");
		
		Thread.sleep(2000);
		//To Navigate back to flipKart

		driver.navigate().back();
		Thread.sleep(2000);
	
		//To Navigate forward to zepto
		driver.navigate().forward();
		Thread.sleep(2000);
//to reload refresh 
		driver.navigate().refresh();
	

	
		

	
	}

}
