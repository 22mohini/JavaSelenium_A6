package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropAtionCapitals
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/DragDrop%20(1).html");
	/*	WebElement oslodraggable = driver.findElement(By.xpath("//div[text()='Oslo']"));
		WebElement norwayDroppable = driver.findElement(By.xpath("//div[text()='Norway']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(oslodraggable, norwayDroppable).perform();
		WebElement romeDraggable = driver.findElement(By.xpath("//div[text()='Rome']"));
		WebElement italyDraggable = driver.findElement(By.xpath("//div[text()='Italy']"));
		action.dragAndDrop(romeDraggable, italyDraggable).perform();
		WebElement washDraggable = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement uniteDraggable = driver.findElement(By.xpath("//div[text()='United States']"));
       action.dragAndDrop(washDraggable, uniteDraggable).perform();
   	WebElement seulDraggable = driver.findElement(By.xpath("//div[text()='Seoul']"));
	WebElement denDraggable = driver.findElement(By.xpath("//div[text()='DenMark']"));
   action.dragAndDrop(seulDraggable, denDraggable).perform();*/
		Actions action = new Actions(driver);
		for(int i= 1; i<=7; i++)
		{
			WebElement capital = driver.findElement(By.id("box"+i));
			WebElement country = driver.findElement(By.id("box10"+i));
			action.dragAndDrop(capital, country).perform();

		}
	}

}
