package org.capturingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotFromFK
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':','-' );
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Lakme Kajal",Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//a[contains(text(),'Lakmé 9 to 5 K')]/.."));
		File src = product.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/screenshots"+timestamp+".png");
		FileHandler.copy(src, dest);
		
	}

}
