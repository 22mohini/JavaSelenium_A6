package org.automation.testNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(org.automation.testNGFrameWork.MyListner.class)
public class TC_001_AddToCartTest extends BaseTest
{
	@Test
	public void addToCart() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../../../..//input[@value='Add to cart']")).click();
		WebElement prodAddMsg = driver.findElement(By.xpath("//p[text)='The product has been added to your ']"));
		
		if(prodAddMsg.isDisplayed())
		{
			Reporter.log("Product is Added to Cart", true);
			Thread.sleep(4000);
		}
		else
		{
			Reporter.log("product is not added", true);
		}
    }
}