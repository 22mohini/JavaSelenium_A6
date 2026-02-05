package org.automation.handlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrame
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		//Switching to parent page from main page
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text1);
		//switching Child Window From Parent Window
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text2);
		
		//switing parent window from child window
		driver.switchTo().parentFrame();
		String text3 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text3);
		
		//swiching back to main window
		driver.switchTo().defaultContent();

		
		
	}

}
