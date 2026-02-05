package org.LocatorStatergis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shruti");
		driver.findElement(By.id("LastName")).sendKeys("Kadam");
		driver.findElement(By.id("Email")).sendKeys("Shruti@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shruti@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Shruti@123");
		
		


	}

}
