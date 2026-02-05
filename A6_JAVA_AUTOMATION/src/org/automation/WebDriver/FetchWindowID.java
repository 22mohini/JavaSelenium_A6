package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchWindowID {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		String WindowID = driver.getWindowHandle();
		System.out.println(WindowID);
		

	}

}
