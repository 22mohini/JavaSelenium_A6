package org.capturingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScrennshotOfProductOnAmazon {

	public static void main(String[] args) throws IOException
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(":","-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Crickrt Bat");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement product = driver.findElement(By.xpath("//span[contains(text(),'Boldfit')]/../../../../.."));
		//step 1
		File src = product.getScreenshotAs(OutputType.FILE);
		
		//step 2
		File dest = new File("./Errorshots/screenshot"+timestamp+".png");
		FileHandler.copy(src, dest);
		

	}

}
