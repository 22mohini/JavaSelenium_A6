package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAndHoldInealeaseEvent 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/DragDrop%20(1).html");
		Actions action = new Actions(driver);
	  WebElement capital = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement country = driver.findElement(By.xpath("//div[text()='United State']"));
		action.moveToElement(capital).clickAndHold().moveToElement(country).release().perform();
		
		

	}

}
