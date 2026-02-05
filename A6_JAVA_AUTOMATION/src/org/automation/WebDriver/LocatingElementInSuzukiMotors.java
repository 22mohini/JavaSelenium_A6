package org.automation.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementInSuzukiMotors {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://suzukimotorcycle.co.in/");
		driver.findElement(By.partialLinkText("ACCESSORIES")).click();
		
		
		

	}

}
