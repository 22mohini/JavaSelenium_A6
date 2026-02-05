package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class performingMouseOverEventInDWS 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronicsLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
		Actions action = new Actions(driver);
		action.moveToElement(electronicsLink).perform();
		
		//action.moveToLocation(292, 191).perform();
		action.moveByOffset(-100, 0).perform();
				
		
		
	}

}
