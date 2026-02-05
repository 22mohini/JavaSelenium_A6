package org.automation.popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingATimeAlertInJavaScriptPrount 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame("iframeResult");
		
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		// alert.dismiss();
		 alert.sendKeys("Harry Potter");
		 alert.accept();
		
		
		  
		
		
	}

}
