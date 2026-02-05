package org.automation.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@DataProvider(name ="credentials")
	public String[][] dataProviderMethod()
	{
		String [] [] data = {
				             {"qspiders@gmail.com","Qspiders@123"},
				             {"Jspiders@gmail.com","Jspider@123"},
				             {"pYspiders@gmail.com","pyspiders@123"}
		                     };
		return data;
	}
	
	@Test(dataProvider = "credentials", dataProviderClass = org.automation.DataProvider.DataProvider1.class)
	public void login(String email , String password) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("");
	Thread.sleep(1000);

	driver.findElement(By.id("Password")).sendKeys("");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.quit();
	
	
	}

}
