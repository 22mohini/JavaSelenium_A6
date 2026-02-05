package org.automation.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethod2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jawayezdimotorcycles.com/");
		Thread.sleep(30000);
		URL url = new URL("https://www.Suzukimotorcycle.co.in/product-details/hayabusa");
		driver.navigate().to(url);
		

	}

}
