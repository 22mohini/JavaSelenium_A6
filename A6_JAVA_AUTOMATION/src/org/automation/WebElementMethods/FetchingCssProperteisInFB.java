package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FetchingCssProperteisInFB {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println("BG color:"+LoginButton.getCssValue("background-color"));
		System.out.println(LoginButton.getCssValue("Color"));
		System.out.println(LoginButton.getCssValue("Font-Size"));

	}

}
