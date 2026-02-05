package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCloseAndQuit {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipKart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.Mesho.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://purplle.com/");
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();

		

	}

}
