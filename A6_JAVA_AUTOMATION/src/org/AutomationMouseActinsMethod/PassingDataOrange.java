package org.AutomationMouseActinsMethod;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataOrange 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement userNameTextBox = driver.findElement(By.name("username"));		
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		Actions action = new Actions(driver);
	/*	action.sendKeys(userNameTextBox, "Admin").sendKeys(passwordTextBox, "admin123")
		.keyDown(Keys.ENTER).perform();*/
		
		action.moveToElement(userNameTextBox).sendKeys("Admin")
		.moveToElement(passwordTextBox).click().sendKeys("admin123").keyDown(Keys.ENTER).perform();

	}

}
