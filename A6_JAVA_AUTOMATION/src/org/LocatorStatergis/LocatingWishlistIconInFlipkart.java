package org.LocatorStatergis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishlistIconInFlipkart {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000", Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'Nokia 2660 Flip 4G Volte Black')]/../../..//*[name()='svg']")).click();
	}
}