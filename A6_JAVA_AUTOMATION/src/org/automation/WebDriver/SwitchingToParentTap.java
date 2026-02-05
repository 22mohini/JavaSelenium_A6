package org.automation.WebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParentTap {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/en-in/");
		//capturing the window id or handle of parent or main tab
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("htttps:/jokerandwitch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		//Switching to parent tab using the parent tab window Id
		driver.switchTo().window(parentWindowId);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://Shop.timexindia.com");
		//------------------------------------------------------
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId :allWindowIds )
		{
			driver.switchTo().window(windowId);
			Thread.sleep(3000);
			String atualTitle = driver.getTitle();
				
		}

		

	}

}
