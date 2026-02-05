package org.AutomationMouseActinsMethod;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformDragAndDropActions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		  driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Search ') and @aria-label]")).sendKeys("mobile",Keys.ENTER);
		  


}
}