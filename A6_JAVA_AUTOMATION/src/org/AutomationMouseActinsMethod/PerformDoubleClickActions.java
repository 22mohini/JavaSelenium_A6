package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDoubleClickActions
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double click')]"));
		 Actions action = new Actions(driver);
		 action.doubleClick(button).click().perform();
		
		
	}

}
