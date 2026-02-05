package org.automation.StaVista;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddProductIntoWishList
{
	@Test
	public void Wishlist() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.stayvista.com/");
		//Thread.sleep(3000);
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		WebElement AlertButton = driver.findElement(By.id("secondaryButton"));
		AlertButton.click();
		driver.navigate().refresh();
		//WebElement target1 = driver.findElement(By.id("banner-1-btn"));
		// WebElement target2 = driver.findElement(By.xpath("//span[text()='Holiday Getaways']"));
		WebElement placewishlist = driver.findElement(By.xpath("//p[text()='Vista Valencia Villa']/../../../..//img[@alt='wishlist']"));
		//actions.scrollToElement(placewishlist).perform();
		placewishlist.click();
	   WebElement welcomepagetext = driver.findElement(By.xpath("//span[text()='Welcome to StayVista']"));
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(welcomepagetext.getText(), true, "Welcome page not displyed!!");
	    sa.assertAll();
		
		
	}

}
