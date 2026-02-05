package org.LocatorStatergis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmazon {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement PriceElement = driver.findElement(By.xpath("//span[contains(text(),'Noise ') and contains(text(),'(Ice Blue)')]/../../../.."
				+ "//span[@class='a-price-whole']"));
		String price = PriceElement.getText();
		
		System.out.println("Price:"+price);
	}

}

