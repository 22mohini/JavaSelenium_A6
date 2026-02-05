package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWitchControlToAnActiveElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htttps//www.google.com/");
		driver.switchTo().activeElement().sendKeys("Pushpa 2");

	}

}

