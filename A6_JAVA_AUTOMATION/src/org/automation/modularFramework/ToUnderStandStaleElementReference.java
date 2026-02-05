package org.automation.modularFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderStandStaleElementReference
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement loginLink = driver.findElement(By.linkText("Log in"));
		 loginLink.click();
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.sendKeys("sakshat@gmail.com");
		Thread.sleep(500);
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		//to refresh the web page
		driver.navigate().refresh();
		//Because old address is used , we get 'StaleElementReferenceException'
		passwordTextField.sendKeys("shivansh22");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
				
		 
		
	}

}
