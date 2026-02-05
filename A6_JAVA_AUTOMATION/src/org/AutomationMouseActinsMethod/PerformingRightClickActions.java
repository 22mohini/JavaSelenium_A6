package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PerformingRightClickActions
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		 WebElement compresspdf = driver.findElement(By.linkText("COMPRESS PDF"));
		Actions action = new Actions(driver);
		
		action.moveToElement(compresspdf).contextClick().perform();
		
	}

}
