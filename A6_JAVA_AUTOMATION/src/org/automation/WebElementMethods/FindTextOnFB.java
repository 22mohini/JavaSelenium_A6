package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTextOnFB {

	public static void main(String[] args)
 {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String textName = driver.findElement(By.xpath("//h2[contains(text(),\'Facebook ')]")).getText();
    System.out.println(textName);

	}

}
