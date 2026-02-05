package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTitleInPurple 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://purplle.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
