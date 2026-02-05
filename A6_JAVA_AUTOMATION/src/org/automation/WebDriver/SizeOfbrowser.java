package org.automation.WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfbrowser {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	System.out.println("Height"+size.getHeight());
	System.out.println("Width"+size.getWidth());
	Dimension targetSize =new Dimension(600 ,500);
	driver.manage().window().setSize(targetSize);
	

	}

}
