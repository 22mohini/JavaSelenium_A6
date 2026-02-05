package org.automation.WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSizeOfBrowser {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://Shariefbhai.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height:"+size.getHeight());
		System.out.println("Width:"+size.getWidth());
		
		//set size
		Dimension targetSize = new Dimension(650, 650);
		//method is used to set the position of browser
		driver.manage().window().setSize(targetSize);

	}

}