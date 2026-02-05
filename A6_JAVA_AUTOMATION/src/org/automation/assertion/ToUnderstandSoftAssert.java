package org.automation.assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert 
{
	@Test
	public void Loginmethod() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String expectedWelcomepageTitle="Demo Web Shop";
		String expectedLoginPageTitle = "Demo Web Shop. Login";
		//Assertion is Used To Verification And Validation
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome Page Is Not Displayed!!");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		sa.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page is Not Displayed!!");
		driver.findElement(By.id("Email")).sendKeys("sakshat@Gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("Password")).sendKeys("shivansh22");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		sa.assertAll();
		driver.quit();
		
	}

}
