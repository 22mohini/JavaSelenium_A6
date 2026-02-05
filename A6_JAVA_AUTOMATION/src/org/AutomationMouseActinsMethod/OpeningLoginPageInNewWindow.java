package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLoginPageInNewWindow 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(loginlink).keyUp(Keys.CONTROL).perform();
		
		
	}

}
