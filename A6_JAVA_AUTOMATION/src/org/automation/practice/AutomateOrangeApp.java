package org.automation.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomateOrangeApp
{
	public static void main(String[] args)
	{
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline")).click();
	WebElement dropDown = driver.findElement(By.xpath("//select[@class='lan-details nav-item-btn language-selector']"));
		Select select = new Select(dropDown);
		select.selectByIndex(0);
		
		//Actions act = new Actions(driver);
	//	Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		
	}
	
		
	

}
