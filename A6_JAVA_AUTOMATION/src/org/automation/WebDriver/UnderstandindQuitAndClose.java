package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandindQuitAndClose 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//opening a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.linkedin.com/");
		// opening new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		
	}

}
