package org.automation.SelMock;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingToZomato 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String expectedurl = "https://www.swiggy.com/";
		  
		//driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> WindowIds = driver.getWindowHandles();
		
		
		for(String actualurl: WindowIds)
		{
			driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		{
			if(expectedurl.endsWith(currenturl))
				driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			break;
		}
	
		}
	}
		
		
	}


