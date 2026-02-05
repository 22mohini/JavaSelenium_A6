package org.automation.WebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindow {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedURL =" https://www.zomato.com/pune/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/pune/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		Set<String> allWindows = driver.getWindowHandles();
		for(String WindowId : allWindows)
		{
			driver.switchTo().window(WindowId);
			Thread.sleep(3000);

		}
		
		String actualURL = driver.getCurrentUrl();
		if(expectedURL.equals(actualURL))
		
		{
	     driver.close();
		
		}
		
		
		}
	}

		

	


