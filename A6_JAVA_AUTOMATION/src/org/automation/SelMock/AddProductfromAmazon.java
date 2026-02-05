package org.automation.SelMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductfromAmazon 
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"iPhone 17 Pro Max 25\")]"
				+ "/../../../../..//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-cart-count")).click();

		WebElement priceElement = driver.findElement(By.xpath("//span[contains(text(),\"iPhone 17 Pro Max 25\")]/../../../.."
				+ "//span[@class='a-price-symbol']"));
		String price = priceElement.getText();

		System.out.println(price);
		
		
		
		
	}

}
