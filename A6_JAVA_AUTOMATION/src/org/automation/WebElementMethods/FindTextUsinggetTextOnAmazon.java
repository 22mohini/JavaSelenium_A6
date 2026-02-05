package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTextUsinggetTextOnAmazon {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lakme kajal");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String Productname= driver.findElement(By.xpath("//span[contains(text(),'Lakme 9 to 5 Eyeconic Kajal Twin Pack, Matte Waterproof…')]"))
        		.getText();
        System.out.println(Productname);


	}

}
